package br.com.paulo.spring.application;

import br.com.paulo.spring.domain.User;
import br.com.paulo.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@ComponentScan("br.com.paulo.spring")
public class SPrograma {

/*    public static void main(String[] args){
        ApplicationContext context = new
                AnnotationConfigApplicationContext(Programa.class);

        Pessoa pessoa = context.getBean(Pessoa.class);

        pessoa.setNome("Eduardo1");
        pessoa.setIdade(32);
        System.out.println(pessoa);
    }*/

    public static void main(String[] args) {

        Scanner lerDados = new Scanner(System.in);
        User user = new User("Paulo", "paulo@gmail.com", "buul");

        System.out.println("Deseja recuperar sua senha (S/N)?");
        String resposta = lerDados.nextLine();
        if (resposta.equalsIgnoreCase("S")) {
            ApplicationContext context = new
                    AnnotationConfigApplicationContext(Programa.class);
            UserService userService = context.getBean(UserService.class);

            userService.setUser(user);
            userService.rememberPassByEmail();
        }
    }
}

