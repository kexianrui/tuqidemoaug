package common.dto;

import lombok.Data;

@Data
public class ReflectDTO {
    private String name;

    private String desc;

    private ReflectDTO() {
    }
}
