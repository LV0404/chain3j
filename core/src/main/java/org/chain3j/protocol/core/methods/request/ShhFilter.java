package org.chain3j.protocol.core.methods.request;

/**
 * Filter implementation as per <a href="https://github.com/moac/wiki/wiki/JSON-RPC#mc_newfilter">docs</a>
 */
public class ShhFilter extends Filter<ShhFilter> {
    private String to;

    public ShhFilter(String to) {
        super();
        this.to = to;
    }

    public String getTo() {
        return to;
    }

    @Override
    ShhFilter getThis() {
        return this;
    }
}
