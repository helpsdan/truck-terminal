package br.com.devnaweb.trucks.usecases;

import br.com.devnaweb.trucks.fixtures.LocaleFixture;
import br.com.devnaweb.trucks.repositories.LocaleRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@SpringBootTest
public class CreateLocaleUnitTest {

    @InjectMocks
    private CreateLocale createLocale;

    @Mock
    private LocaleRepository localeRepository;

    @Test
    @DisplayName("Deve ser possível cadastrar os locais.")
    void shouldCreateLocale() {
        createLocale.execute(LocaleFixture.defaultValues(), 1L);
        verify(localeRepository, times(2)).save(any());
    }
}
