package hub.haresh.jobservice.util;

import hub.haresh.jobservice.dto.JobDTO;
import hub.haresh.jobservice.entity.Job;
import org.springframework.beans.BeanUtils;

public class JobServiceUtil {
    public static JobDTO toDTO(Job job) {
        JobDTO dto = new JobDTO();
        BeanUtils.copyProperties(job, dto);
        return dto;
    }

    public static Job toJob(JobDTO dto) {
        Job job = new Job();
        BeanUtils.copyProperties(dto, job);
        return job;
    }
}
