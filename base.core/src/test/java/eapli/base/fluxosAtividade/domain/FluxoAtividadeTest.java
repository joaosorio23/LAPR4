/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.base.fluxosAtividade.domain;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class FluxoAtividadeTest {

    @Test(expected = IllegalArgumentException.class)
    public void assegurarNomeFluxoAtividadeNotEmpty() {
        FluxoAtividade fluxoAtividade = new FluxoAtividade("");
    }

}
