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

package br.com.mvvmfx.viewloader.internal;

import de.saxsys.mvvmfx.Context;
import de.saxsys.mvvmfx.Scope;
import de.saxsys.mvvmfx.internal.ContextImpl;

import java.util.Collection;

class ViewLoaderScopeUtils {

    static ContextImpl prepareContext(Context parentContext, Collection<Scope> providedScopes) {
        ContextImpl context = null;

        if (parentContext == null || !(parentContext instanceof ContextImpl)) {
            context = new ContextImpl();
        } else {
            context = (ContextImpl) parentContext;
        }

        if (providedScopes != null) {

            for (Scope scope : providedScopes) {
                context.addScopeToContext(scope);
            }
        }

        return context;
    }

}
