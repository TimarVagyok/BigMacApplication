package com.example.bigmac;

import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.stage.Stage;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit5.ApplicationTest;
import org.testfx.framework.junit5.Start;


public class MainBigMacTest extends ApplicationTest {

    @Start
    public void start(Stage stage) throws Exception {
        new MainBigMac().start(stage);
    }

    /*@Test
    void testStart() throws IOException {
        Stage stage = new Stage();
        MainBigMac mainApp = new MainBigMac();
        mainApp.start(stage);
        FxAssert.verifyThat(stage, WindowMatchers.isShowing());
        verifyThat(stage.getTitle(), equalTo("BigMac!"));

    }*///UI is halfly done so the testing is not working


    @Override
    public void stop() throws Exception {
        FxToolkit.hideStage();
        release(new KeyCode[] {});
        release(new MouseButton[] {});
    }

}
