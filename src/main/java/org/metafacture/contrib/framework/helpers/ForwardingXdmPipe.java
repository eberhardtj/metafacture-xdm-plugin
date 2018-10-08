/*
 * Copyright 2018 Deutsche Nationalbibliothek
 *
 * Licensed under the Apache License, Version 2.0 the "License";
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.metafacture.contrib.framework.helpers;

import net.sf.saxon.s9api.XdmNode;
import org.metafacture.contrib.framework.XdmReceiver;

public class ForwardingXdmPipe extends DefaultXdmPipe<XdmReceiver> {

    @Override
    public void process(XdmNode node) {
        getReceiver().process(node);
    }
}
