package hub.haresh.jobservice.service;

import hub.haresh.jobservice.dto.JobDTO;
import hub.haresh.jobservice.repository.JobRepository;
import hub.haresh.jobservice.util.JobServiceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Set;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;


    public Flux<JobDTO> findAllJob() {
        return jobRepository.findAll().map(JobServiceUtil::toDTO);
    }

    public Flux<JobDTO> findAllJobSkillsIn(Set<String> skills) {
        return jobRepository.findBySkillsIn(skills).map(JobServiceUtil::toDTO);
    }

    public Mono<JobDTO> createJob(Mono<JobDTO> jobDTO) {
        return jobDTO
                .map(JobServiceUtil::toJob)
                .flatMap(jobRepository::save)
                .map(JobServiceUtil::toDTO);
    }
}
