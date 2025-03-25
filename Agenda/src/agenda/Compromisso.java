package agenda;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Compromisso {
	private LocalDate dataInicio;
    private LocalDate dataFim;
    private String descricao;
    
    public Compromisso(LocalDate dataInicio, LocalDate dataFim, String descricao) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean pertencePeriodo(LocalDate inicioPeriodo, int numeroDias) {
        LocalDate fimPeriodo = inicioPeriodo.plusDays(numeroDias);
        return (dataInicio.isAfter(inicioPeriodo.minusDays(1)) && dataInicio.isBefore(fimPeriodo.plusDays(1)));
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Compromisso: " + descricao + " | Início: " + dataInicio.format(formatter) + " | Fim: " + dataFim.format(formatter);
    }
}


