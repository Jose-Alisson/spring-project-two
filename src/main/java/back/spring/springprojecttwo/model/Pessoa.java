package back.spring.springprojecttwo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Pessoa {

    private long id;
    private String name;
    private String cpf;
}
