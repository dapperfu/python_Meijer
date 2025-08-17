package x7;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import y7.ServerDataUpdate;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001d"}, d2 = {"Lx7/a;", "", "Lkotlin/time/Duration;", "waitingTime", "Lx7/e;", "commState", "Ly7/c;", "serverData", "<init>", "(JLx7/e;Ly7/c;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "c", "()J", "b", "Lx7/e;", "()Lx7/e;", "Ly7/c;", "()Ly7/c;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: x7.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes4.dex */
public final /* data */ class CommunicationContext {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long waitingTime;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final e commState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ServerDataUpdate serverData;

    public /* synthetic */ CommunicationContext(long j10, e eVar, ServerDataUpdate serverDataUpdate, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, eVar, serverDataUpdate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommunicationContext)) {
            return false;
        }
        CommunicationContext communicationContext = (CommunicationContext) other;
        return Duration.z(this.waitingTime, communicationContext.waitingTime) && Intrinsics.e(this.commState, communicationContext.commState) && Intrinsics.e(this.serverData, communicationContext.serverData);
    }

    private CommunicationContext(long j10, e commState, ServerDataUpdate serverDataUpdate) {
        Intrinsics.j(commState, "commState");
        this.waitingTime = j10;
        this.commState = commState;
        this.serverData = serverDataUpdate;
    }

    /* renamed from: a, reason: from getter */
    public final e getCommState() {
        return this.commState;
    }

    /* renamed from: b, reason: from getter */
    public final ServerDataUpdate getServerData() {
        return this.serverData;
    }

    /* renamed from: c, reason: from getter */
    public final long getWaitingTime() {
        return this.waitingTime;
    }

    public int hashCode() {
        int iO = ((Duration.O(this.waitingTime) * 31) + this.commState.hashCode()) * 31;
        ServerDataUpdate serverDataUpdate = this.serverData;
        return iO + (serverDataUpdate == null ? 0 : serverDataUpdate.hashCode());
    }

    public String toString() {
        return "CommunicationContext(waitingTime=" + ((Object) Duration.a0(this.waitingTime)) + ", commState=" + this.commState + ", serverData=" + this.serverData + ')';
    }
}
