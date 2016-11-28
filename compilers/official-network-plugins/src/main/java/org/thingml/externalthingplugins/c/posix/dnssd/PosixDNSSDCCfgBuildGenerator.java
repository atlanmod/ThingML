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
package org.thingml.externalthingplugins.c.posix.dnssd;


import org.sintef.thingml.Thing;
import org.thingml.compilers.c.posix.PosixCCfgBuildCompiler;
import org.thingml.externalthingplugins.c.posix.PosixDNSSDExternalThingPlugin;

/**
 * Created by vassik on 18.11.16.
 */
public class PosixDNSSDCCfgBuildGenerator extends PosixCCfgBuildCompiler {

    private final PosixDNSSDExternalThingPlugin plugin;

    public PosixDNSSDCCfgBuildGenerator(PosixDNSSDExternalThingPlugin _plugin) {
        plugin = _plugin;
    }

    @Override
    protected String getObjectFileName(Thing thing) {
        String files = plugin.getPluginObjects() + super.getObjectFileName(thing);
        return files;
    }

    @Override
    protected String getSourceFileName(Thing thing) {
        String files = plugin.getPlugingSources() + super.getSourceFileName(thing);
        return files;
    }

    @Override
    protected String getThirdPartyLibraries(Thing thing) {
        return plugin.getPluginLibraries();
    }
}
