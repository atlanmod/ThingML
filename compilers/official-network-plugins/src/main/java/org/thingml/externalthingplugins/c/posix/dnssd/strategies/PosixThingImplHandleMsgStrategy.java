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
package org.thingml.externalthingplugins.c.posix.dnssd.strategies;

import org.sintef.thingml.Message;
import org.sintef.thingml.Port;
import org.sintef.thingml.Thing;
import org.thingml.compilers.DebugProfile;
import org.thingml.compilers.c.CCompilerContext;
import org.thingml.compilers.interfaces.c.ICThingImpEventHandlerStrategy;
import org.thingml.externalthingplugins.c.posix.PosixDNSSDExternalThingPlugin;
import org.thingml.externalthingplugins.c.posix.dnssd.utils.DNSSDUtils;

/**
 * Created by vassik on 16.11.16.
 */
public class PosixThingImplHandleMsgStrategy implements ICThingImpEventHandlerStrategy {

    PosixDNSSDExternalThingPlugin plugin;

    public PosixThingImplHandleMsgStrategy(PosixDNSSDExternalThingPlugin _plugin) {
        plugin = _plugin;
    }

    @Override
    public void generateEventHandlers(Thing thing, StringBuilder builder, CCompilerContext ctx, DebugProfile debugProfile) {
        builder.append("// Implementation of the declared prototypes to handle messages: '" +
                DNSSDUtils.dnssd_publish_service_receive + "', '" +
                DNSSDUtils.dnssd_unpublish_service_receive + "'. " +
                "Generated by " + this.getClass().getSimpleName() + "\n");

        Port port = DNSSDUtils.getDNSSDPort(thing);
        if(port == null)
            return;

        Message dnssd_publish_message = DNSSDUtils.getDNSSDPublishService(port.getReceives());
        builder.append("void " + ctx.getHandlerName(thing, port, dnssd_publish_message));
        ctx.appendFormalParameters(thing, builder, dnssd_publish_message);
        builder.append("{\n");
        builder.append(thing.getName() + "_add_dnssd_service");
        builder.append("(");
        builder.append(ctx.getInstanceVarName());
        builder.append(");\n");
        builder.append("}\n");

        Message dnssd_unpublish_message = DNSSDUtils.getDNSSDUnpublishService(port.getReceives());
        builder.append("void " + ctx.getHandlerName(thing, port, dnssd_unpublish_message));
        ctx.appendFormalParameters(thing, builder, dnssd_publish_message);
        builder.append("{\n");
        builder.append(thing.getName() + "_remove_dnssd_service");
        builder.append("(");
        builder.append(ctx.getInstanceVarName());
        builder.append(");\n");
        builder.append("}\n");
    }
}
