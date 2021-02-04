package br.com.devnaweb.trucks.usecases;

import br.com.devnaweb.trucks.entities.Locales;
import br.com.devnaweb.trucks.fixtures.LocaleFixture;
import br.com.devnaweb.trucks.repositories.LocaleRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@SpringBootTest
public class GetLocalesUnitTest {

    @InjectMocks
    private GetLocales getLocales;

    @Mock
    private LocaleRepository localeRepository;

    @BeforeEach
    void setUp() {
        when(localeRepository.findAll()).thenReturn(LocaleFixture.defaultListLocales());
    }

    @Test
    @DisplayName("Should get locales grouped by truck type")
    void shouldGetLocales() {
        final Locales locales = getLocales.execute();

        assertThat(locales.getOrigin().size(), is(3));
        assertThat(locales.getDestiny().size(), is(3));
    }
}
