/**
 * Copyright (C) 2014 SINTEF <franck.fleurey@sintef.no>
 *
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE, Version 3, 29 June 2007;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingml.compilers.c;

import org.sintef.thingml.Thing;
import org.thingml.compilers.Context;
import org.thingml.compilers.spi.ExternalThingPlugin;
import org.thingml.compilers.thing.ThingApiCompiler;

/**
 * Created by vassik on 01.11.16.
 */
public class CExternalThingEnabledApiCompiler extends ThingApiCompiler {

    private ThingApiCompiler api_compiler;

    public CExternalThingEnabledApiCompiler(ThingApiCompiler _api_compiler) { api_compiler = _api_compiler; }

    @Override
    public void generatePublicAPI(Thing thing, Context ctx) {
        if(ctx.getCompiler().isExternalThing(thing)) {
            ExternalThingPlugin plugin = ctx.getCompiler().getExternalThingPlugin(thing);
            if(plugin != null) {
                ThingApiCompiler api_thing_compiler = plugin.getThingApiCompiler();
                api_thing_compiler.generatePublicAPI(thing, ctx);
                return;
            }
        }

        api_compiler.generatePublicAPI(thing, ctx);
    }
}
