package Entidades;

import lombok.*;
import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Getter
@Builder
@Setter
@ToString
@Entity
@Table
public class Domicilio implements Serializable {
    @Serial /*Puse esta anotación por recomendaciones de java*/
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreCalle;
    private int numero;
}
