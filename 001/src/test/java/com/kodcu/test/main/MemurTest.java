package com.kodcu.test.main;

import com.kodcu.main.*;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class MemurTest {
    @Test
    public void polisGorevlendirmesi() {
        GuvenlikGorevi mockGorev = mock(GuvenlikGorevi.class);

        Polis polis = new Polis(mockGorev);
        polis.calis();

        verify(mockGorev, times(1)).gorevlendirmeYap();
    }

    @Test
    public void doktorGorevi() {

        SaglikGorevi saglikGorevi = new SaglikGorevi();

        Doktor doktor = new Doktor(saglikGorevi);
        doktor.calis();
        assert(doktor.calis(), "doktor calisti");

    }
}
