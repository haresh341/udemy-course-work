package hub.haresh.jobservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Job {

    @Id
    private String id;
    private String title;
    private Set<String> skills;
    private String company;
    private Integer salary;
    private Boolean isRemote;
}
