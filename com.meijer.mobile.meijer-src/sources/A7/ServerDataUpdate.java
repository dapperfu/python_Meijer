package A7;

import b8.ServerConfigurationV4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m8.q;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ2\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"LA7/c;", "", "LA7/a;", "state", "Lb8/j;", "config", "Lm8/q;", "configV3", "<init>", "(LA7/a;Lb8/j;Lm8/q;)V", "a", "(LA7/a;Lb8/j;Lm8/q;)LA7/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LA7/a;", "e", "()LA7/a;", "b", "Lb8/j;", "c", "()Lb8/j;", "Lm8/q;", "d", "()Lm8/q;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: A7.c, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class ServerDataUpdate {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ServerConfigurationV4 config;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final q configV3;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerDataUpdate)) {
            return false;
        }
        ServerDataUpdate serverDataUpdate = (ServerDataUpdate) other;
        return Intrinsics.e(this.state, serverDataUpdate.state) && Intrinsics.e(this.config, serverDataUpdate.config) && Intrinsics.e(this.configV3, serverDataUpdate.configV3);
    }

    public ServerDataUpdate(a state, ServerConfigurationV4 serverConfigurationV4, q qVar) {
        Intrinsics.j(state, "state");
        this.state = state;
        this.config = serverConfigurationV4;
        this.configV3 = qVar;
    }

    public static /* synthetic */ ServerDataUpdate b(ServerDataUpdate serverDataUpdate, a aVar, ServerConfigurationV4 serverConfigurationV4, q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = serverDataUpdate.state;
        }
        if ((i10 & 2) != 0) {
            serverConfigurationV4 = serverDataUpdate.config;
        }
        if ((i10 & 4) != 0) {
            qVar = serverDataUpdate.configV3;
        }
        return serverDataUpdate.a(aVar, serverConfigurationV4, qVar);
    }

    public final ServerDataUpdate a(a state, ServerConfigurationV4 config, q configV3) {
        Intrinsics.j(state, "state");
        return new ServerDataUpdate(state, config, configV3);
    }

    /* renamed from: c, reason: from getter */
    public final ServerConfigurationV4 getConfig() {
        return this.config;
    }

    /* renamed from: d, reason: from getter */
    public final q getConfigV3() {
        return this.configV3;
    }

    /* renamed from: e, reason: from getter */
    public final a getState() {
        return this.state;
    }

    public int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        ServerConfigurationV4 serverConfigurationV4 = this.config;
        int iHashCode2 = (iHashCode + (serverConfigurationV4 == null ? 0 : serverConfigurationV4.hashCode())) * 31;
        q qVar = this.configV3;
        return iHashCode2 + (qVar != null ? qVar.hashCode() : 0);
    }

    public String toString() {
        return "ServerDataUpdate(state=" + this.state + ", config=" + this.config + ", configV3=" + this.configV3 + ')';
    }
}
