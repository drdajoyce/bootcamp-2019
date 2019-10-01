package com.manchesterdigital;

public class SpotifyAccountService {
    private AuthenticationService authenticationService;

    public SpotifyAccountService(AuthenticationService authenticationService) {

        this.authenticationService = authenticationService;
    }

    public SpotifyAccount verify(String username, String password) {
        if (!authenticationService.authenticate(username, password)){
            throw new SpotifyAccountNotValidException();
        }

        return new SpotifyAccount(username, password);
    } //ensures we return a datatype of SpotifyAccount, to prevent comparison errors.
}
