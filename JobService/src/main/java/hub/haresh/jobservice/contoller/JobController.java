package hub.haresh.jobservice.contoller;

import hub.haresh.jobservice.dto.JobDTO;

import hub.haresh.jobservice.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Set;

@RestController
@RequestMapping("/jobs")
public class JobController {
    @Autowired
    private JobService jobService;

    @GetMapping
    public Flux<JobDTO> getAllJobs() {
        return jobService.findAllJob();
    }

    @GetMapping("/search")
    public Flux<JobDTO> getAllJobsIn(@RequestParam Set<String> skills) {
        return jobService.findAllJobSkillsIn(skills);
    }

    @PostMapping
    public Mono<JobDTO> createJob(@RequestBody Mono<JobDTO> jobDTO) {
        return jobService.createJob(jobDTO);
    }
}
