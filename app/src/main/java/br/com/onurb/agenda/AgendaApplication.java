package br.com.onurb.agenda;

import android.app.Application;

import br.com.onurb.agenda.dao.AlunoDAO;
import br.com.onurb.agenda.model.Aluno;

public class AgendaApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunosDeTeste();
    }

    private void criaAlunosDeTeste() {
        AlunoDAO alunoDAO = new AlunoDAO();
        alunoDAO.salva(new Aluno("Bruno", "1165464", "email@email.com"));
        alunoDAO.salva(new Aluno("Rafael", "1165464", "email@email.com"));
    }
}
