package steps;

import builders.RequestObjectBuilder;
import data.Payloads;

public abstract class Base<T extends Base<T>> {
    public RequestObjectBuilder requestObjectBuilder = new RequestObjectBuilder();
    public Payloads payloads = new Payloads();
}
