package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class SpotifyAccountServiceTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock //tells intelliJ to ignore the real thing and use the mock you're making.
    private AuthenticationService authenticationService;

    private SpotifyAccountService subject;


    @Before //before each test, these things will be created/set up. Put things here that will be done all the time.
    public void setUp() {
        subject = new SpotifyAccountService(authenticationService);
    } //adds a throws exception by default, don't need it if not throwing anything

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void whenUsernameAndPasswordValidThenAccountReturned() {
        //ARRANGE
        String username = "john@test.com";
        String password = "2r2f3q4r";

        BDDMockito.given(authenticationService.authenticate(Mockito.anyString(), Mockito.anyString()))
                .willReturn(true);


        SpotifyAccount expectedAccount = new SpotifyAccount(username, password);

        //ACT
        SpotifyAccount result = subject.verify(username, password);

        //ASSERT
//        Assertions.assertThat(result).isEqualTo(expectedAccount);

        //alternative to creating an equals & hashcode
        Assertions.assertThat(result.getUserName()).isEqualTo(expectedAccount.getUserName());
    }

    @Test
    public void whenUsernameAndPasswordInvalidThenExceptionThrown() {

        //ARRANGE
        String username = "john@test.com";
        String password = "2r2f3q4r";

        BDDMockito.given(authenticationService.authenticate(Mockito.anyString(), Mockito.anyString()))
                .willReturn(false);

        //ASSERT - assertion of the exception.
        expectedException.expect(SpotifyAccountNotValidException.class);

        //ACT
        subject.verify(username, password); //making sure the verification happens

        /*checking that the authenticate function has been called. Verify italicised because it's a static method from
        BDDMockito.
         */
        BDDMockito.verify(authenticationService).authenticate(username, password);

    }
}
