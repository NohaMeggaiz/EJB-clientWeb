package org.example;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class CDBean {

    @Inject
    private BookServiceRemote bookService;

    public List<CD> getAvailableCDs() {
        return bookService.getAllAvailableBooks();
    }

    public String loanCD(Long cdId) {

        return "confirmLoan.xhtml";
    }
}
