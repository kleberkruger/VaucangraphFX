/*
 * Copyright 2018 kleberkruger.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package br.ufms.vaucangraph.drawing;

import javafx.concurrent.Worker;
import javafx.scene.Parent;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import netscape.javascript.JSObject;

import java.net.URL;

/*
 * Projetos que valem a pena dar uma olhada:
 *
 * dynamic toolbar
 * toolbar
 * indicators
 * hoverstyle
 */
public class Canvas extends Parent {

    private final WebView webView;

    public Canvas() {
        this.webView = new WebView();

        getChildren().add(webView);

        final WebEngine webEngine = webView.getEngine();
        final URL url = Canvas.class.getClassLoader().getResource("vaucangraph.html");
        webEngine.load(url.toString());

        webEngine.getLoadWorker().stateProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue == Worker.State.SUCCEEDED) {
                JSObject window = (JSObject) webEngine.executeScript("window");
                window.setMember("app", new Middleware());

                webEngine.executeScript("addVertex('" + 50 + "','" + 50 + "','" + null + "','" + "1" + "','" + 40 + "','" + 40 + "','" + "shape=ellipse;perimter=ellipsePerimeter" + "')");
                webEngine.executeScript("testing()");
                webEngine.executeScript("addMouseListener()");
            }
        });
    }
}
