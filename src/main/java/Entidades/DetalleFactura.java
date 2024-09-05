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
public class DetalleFactura implements Serializable {
    @Serial /*Puse esta anotación por recomendaciones de java*/
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int cantidad;
    private int subtotal;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "FK_Articulo")
    private Articulo articulo;
}
