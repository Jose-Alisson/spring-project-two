package back.spring.springprojecttwo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import back.spring.springprojecttwo.model.Pessoa;

@RestController
@RequestMapping("back/spring")
public class SpringController {
    
    @GetMapping("/hello")
    public ResponseEntity<String> getHelloWord(){
        return ResponseEntity.ok("Hello Word!!!");
    }

    @GetMapping("/pessoa/{id}")
    public ResponseEntity<String> getElementById(@PathVariable(value = "id") long id){
        if(id == 1){
            return ResponseEntity.ok("Pessoa Encontrada!!!");
        }
        else{
            return ResponseEntity.badRequest().body("Pessoa Nao Encontrada!!!");
        }
    }

    @PostMapping("/pessoa")
    public ResponseEntity<Pessoa> posPessoa(@RequestBody Pessoa pessoa){
        return ResponseEntity.ok().body(pessoa);
    }
}
