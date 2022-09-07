package com.esengulcinel;


//Data transfer Object =DTO
//veriler arasında objeler arasında veri taşıma işlemi için kullanıyoruz

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


//@Getter @Setter = @Data

public class StudentDto {
    private Long studentId;
    private String studentName;
    private String studentSurname;



}
