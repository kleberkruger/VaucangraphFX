/*
 * Copyright 2018 Kleber Kruger.
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

var graph;

function main(container) {
    if (!mxClient.isBrowserSupported()) {
        mxUtils.error('Browser is not supported!', 200, false);
    } else {
        mxEvent.disableContextMenu(container);
        graph = new mxGraph(container);
        new mxRubberband(graph);
    }
}

function addVertex(x, y, id, rotulo, tamanhoX, tamanhoY, estilo) {
    var parent = graph.getDefaultParent();
    graph.getModel().beginUpdate();
    try {
        mxCell = graph.insertVertex(parent, id, rotulo, x, y, tamanhoX, tamanhoY, estilo);
    } finally {
        graph.getModel().endUpdate();
    }
}

function testing() {
    app.recebeX(80);
}

function addMouseListener() {
    graph.addMouseListener(
        {
            mouseDown: function (sender, evt) {
                app.hehehe('mouseDown: ' + evt.x + ' ' + evt.y);
            },
            mouseMove: function (sender, evt) {
                app.hehehe('mouseMove');
            },
            mouseUp: function (sender, evt) {
                app.hehehe('mouseUp');
            }
        });
}
