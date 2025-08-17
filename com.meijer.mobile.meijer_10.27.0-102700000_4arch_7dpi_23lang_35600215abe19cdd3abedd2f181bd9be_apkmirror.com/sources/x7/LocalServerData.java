package x7;

import Z7.ServerConfigurationV4;
import k8.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import y7.AbstractC18186a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001d"}, d2 = {"Lx7/f;", "", "Ly7/a;", "state", "LZ7/j;", "config", "Lk8/q;", "configV3", "<init>", "(Ly7/a;LZ7/j;Lk8/q;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly7/a;", "c", "()Ly7/a;", "b", "LZ7/j;", "()LZ7/j;", "Lk8/q;", "()Lk8/q;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: x7.f, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class LocalServerData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC18186a state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ServerConfigurationV4 config;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final q configV3;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalServerData)) {
            return false;
        }
        LocalServerData localServerData = (LocalServerData) other;
        return Intrinsics.e(this.state, localServerData.state) && Intrinsics.e(this.config, localServerData.config) && Intrinsics.e(this.configV3, localServerData.configV3);
    }

    public LocalServerData(AbstractC18186a state, ServerConfigurationV4 config, q configV3) {
        Intrinsics.j(state, "state");
        Intrinsics.j(config, "config");
        Intrinsics.j(configV3, "configV3");
        this.state = state;
        this.config = config;
        this.configV3 = configV3;
    }

    /* renamed from: a, reason: from getter */
    public final ServerConfigurationV4 getConfig() {
        return this.config;
    }

    /* renamed from: b, reason: from getter */
    public final q getConfigV3() {
        return this.configV3;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC18186a getState() {
        return this.state;
    }

    public int hashCode() {
        return (((this.state.hashCode() * 31) + this.config.hashCode()) * 31) + this.configV3.hashCode();
    }

    public String toString() {
        return "LocalServerData(state=" + this.state + ", config=" + this.config + ", configV3=" + this.configV3 + ')';
    }
}
