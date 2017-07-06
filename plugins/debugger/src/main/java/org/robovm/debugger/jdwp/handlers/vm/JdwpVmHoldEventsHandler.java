/*
 * Copyright 2016 Justin Shapcott.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.debugger.jdwp.handlers.vm;

import org.robovm.debugger.jdwp.JdwpConsts;
import org.robovm.debugger.jdwp.handlers.eventrequest.events.IJdwpEventDelegate;
import org.robovm.debugger.jdwp.protocol.IJdwpRequestHandler;
import org.robovm.debugger.utils.bytebuffer.ByteBufferPacket;

/**
 * @author Demyan Kimitsa
 * Tells the target VM to stop sending events. Events are not discarded; they are held until a subsequent ReleaseEvents command is sent.
 */
public class JdwpVmHoldEventsHandler implements IJdwpRequestHandler {
    private final IJdwpEventDelegate eventsDelegate;

    public JdwpVmHoldEventsHandler(IJdwpEventDelegate eventsDelegate) {
        this.eventsDelegate = eventsDelegate;
    }

    @Override
    public short handle(ByteBufferPacket payload, ByteBufferPacket output) {
        eventsDelegate.jdwpHoldEvents();
        return JdwpConsts.Error.NONE;
    }

    @Override
    public byte getCommandSet() {
        return 1;
    }

    @Override
    public byte getCommand() {
        return 15;
    }

    @Override
    public String toString() {
        return "VirtualMachine(1).HoldEvents(15)";
    }
}
