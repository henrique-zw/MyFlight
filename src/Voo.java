import java.time.LocalDateTime;
import java.time.Duration;
public class Voo {
    public enum Status {COFIRMADO, ATRASADO, CANCELADO};
    private LocalDateTime datahora;
    private Duration duracao;
    private Rota rota;
    private Status status;
}
