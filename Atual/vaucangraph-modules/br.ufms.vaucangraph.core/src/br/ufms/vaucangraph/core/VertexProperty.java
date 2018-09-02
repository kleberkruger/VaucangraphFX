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

package br.ufms.vaucangraph.core;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;

public class VertexProperty {

    private StringProperty id;
    private StringProperty name;
    private BooleanProperty initial;
    private BooleanProperty end;
    private BooleanProperty dimmed; // Verdadeiro quando o estado for do tipo esmaecido
    private BooleanProperty hidden; // Verdadeiro quando o estado for oculto
    private BooleanProperty variableSize; // Verdadeiro se o tamanho do estado variar
    private IntegerProperty x;
    private IntegerProperty y;
    private VertexSize size;
    private ObservableList<EdgeProperty> edges;
}
