package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {


  @NotBlank(message = "Preencha o campo corretamente.")
  @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estarentre {min} e {max} caracteres.")
  private String nome;


  @NotBlank(message = "Preencha o campo corretamente.")
  @CPF(message = "'{validatedValue}' ´e inválido!")
  private String cpf;


  @NotBlank(message = "Preencha o campo corretamente.")
  @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estarentre {min} e {max} caracteres.")
  private String bairro;


  @NotBlank(message = "Preencha o campo corretamente.")
  @Past(message = "Data '{validatedValue}' é inválida.")
  private LocalDate dataDeNascimento;

  @NotBlank(message = "Preencha o campo corretamente.")
  private String email;

  @NotBlank(message = "Preencha o campo corretamente.")
  @Size(min = 9, max = 11, message = "'${validatedValue}' precisa estarentre {min} e {max} caracteres.")
  private Integer telefone;




}