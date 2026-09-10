import Jakarts.persistence.Entity;

@Entity(nome="tb_Cliente")
@Getters
@NoArgsConstructor
class Cliente {
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String senha;

    @id
    @GeneratedValue(Strategy = GenerationType.INDETITY)
    private long id;
    @column(nullable = false)
    private String nome;
    @column(nullable = false, unique = true)
    private String documento;

    @Column(nullable = false, unique = true)
    private String email;

    



}