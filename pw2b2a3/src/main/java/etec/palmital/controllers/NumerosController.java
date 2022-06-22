package etec.palmital.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class NumerosController {
    @Value("${aluno}")
    private String nome;

    @RequestMapping("/")
    public String calc(Model model) {
        int[] resultado = null;
        for(int val = 2 ; val < 30 ; val++) {
            if(val % 2 == 0) {
                if(resultado ==null) {
                    resultado = new int[1];
                } else {
                    int[] temp = resultado;
                    resultado = new int[temp.length + 1];
                    for(int pos = 0;pos < temp.length;poss++)
                        resultado[poss] = temp[pos];
                }
                resultado[resultado.length - 1] = val;
                }
            }
            model.addAttribute("valores", resultado);
            model.addAttribute("aluno", nome);
            return "/numeros/sequencia";
        }
    }