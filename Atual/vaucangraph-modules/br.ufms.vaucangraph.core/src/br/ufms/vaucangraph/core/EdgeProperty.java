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
import javafx.beans.property.StringProperty;

public class EdgeProperty {

    private StringProperty name; // Nome da transição
    private VertexProperty source; // Estado de origem da transição
    private VertexProperty target; // Estado de destino da transição
//    private TransitionType type; // Tipo da transição
    private BooleanProperty directed; // Verdadeiro quando a transição for direcionada
    private BooleanProperty dimmed; // Verdadeiro quando a transição for do tipo esmaecida
}
