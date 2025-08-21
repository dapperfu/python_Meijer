package I7;

import b8.ServerConfigurationV4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"LI7/c;", "", "LA7/a;", "state", "Lb8/j;", "configuration", "<init>", "(LA7/a;Lb8/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LA7/a;", "b", "()LA7/a;", "Lb8/j;", "()Lb8/j;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: I7.c, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class ParsedResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final A7.a state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ServerConfigurationV4 configuration;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParsedResponse)) {
            return false;
        }
        ParsedResponse parsedResponse = (ParsedResponse) other;
        return Intrinsics.e(this.state, parsedResponse.state) && Intrinsics.e(this.configuration, parsedResponse.configuration);
    }

    public ParsedResponse(A7.a state, ServerConfigurationV4 serverConfigurationV4) {
        Intrinsics.j(state, "state");
        this.state = state;
        this.configuration = serverConfigurationV4;
    }

    /* renamed from: a, reason: from getter */
    public final ServerConfigurationV4 getConfiguration() {
        return this.configuration;
    }

    /* renamed from: b, reason: from getter */
    public final A7.a getState() {
        return this.state;
    }

    public int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        ServerConfigurationV4 serverConfigurationV4 = this.configuration;
        return iHashCode + (serverConfigurationV4 == null ? 0 : serverConfigurationV4.hashCode());
    }

    public String toString() {
        return "ParsedResponse(state=" + this.state + ", configuration=" + this.configuration + ')';
    }
}
