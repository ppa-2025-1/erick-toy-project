package br.edu.ifrs.tads.ppa.application.dto;

import java.util.List;

import br.edu.ifrs.tads.ppa.domain.model.Profile;

public record NewUserEvent(
        String name,
        String handle,
        String email,
        String password,
        String company,
        Profile.AccountType type,
        List<String> roles
)  {

}
