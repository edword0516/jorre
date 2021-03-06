/*
 * ISC License
 *
 * Copyright (c) 2016, Betawares
 *
 * Permission to use, copy, modify, and/or distribute this software for any 
 * purpose with or without fee is hereby granted, provided that the above 
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH
 * REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY 
 * AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT, 
 * INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM 
 * LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR 
 * OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR 
 * PERFORMANCE OF THIS SOFTWARE.
 */

package org.betawares.jorre.messages.responses;

import org.betawares.jorre.Client;
import org.betawares.jorre.ClientInterface;
import org.betawares.jorre.messages.Message;

/**
 * Base class for all responses that will be returned to a {@link Client} in response
 * to a {@link ServerRequest}
 * 
 * @param <C> the type of {@link Client} that will be passed to the handler
 */
public abstract class ClientResponse<C extends ClientInterface> extends Message {
    
    private long requestId;
    
    public long requestId() {
        return requestId;
    }
    
    public void requestId(long requestId) {
        this.requestId = requestId;
    }

    /**
     * Handles client side processing for the {@link ClientResponse}.
     * 
     * This method will be called in response to an incoming {@link ClientResponse}.  Overriding
     * classes will provide an implementation that handles the response.
     * 
     * @param client object that extends {@link Client} that can be referenced by the handler
     */
    public abstract void handle(C client);
    
}
