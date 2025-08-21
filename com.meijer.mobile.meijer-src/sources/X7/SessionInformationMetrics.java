package X7;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nB9\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0018\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001c\u0010\u001f¨\u0006 "}, d2 = {"LX7/g;", "", "", "instanceId", "sessionId", "", "isGrailEventsCanBeCaptured", "crashReporting", "sessionActive", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZ)V", "", "visitorId", "", "sessionInfoId", "sequenceNumber", "(JIIZZZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "Z", "e", "()Z", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: X7.g, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class SessionInformationMetrics {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String instanceId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sessionId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isGrailEventsCanBeCaptured;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean crashReporting;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean sessionActive;

    public SessionInformationMetrics(String instanceId, String sessionId, boolean z10, boolean z11, boolean z12) {
        Intrinsics.j(instanceId, "instanceId");
        Intrinsics.j(sessionId, "sessionId");
        this.instanceId = instanceId;
        this.sessionId = sessionId;
        this.isGrailEventsCanBeCaptured = z10;
        this.crashReporting = z11;
        this.sessionActive = z12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionInformationMetrics)) {
            return false;
        }
        SessionInformationMetrics sessionInformationMetrics = (SessionInformationMetrics) other;
        return Intrinsics.e(this.instanceId, sessionInformationMetrics.instanceId) && Intrinsics.e(this.sessionId, sessionInformationMetrics.sessionId) && this.isGrailEventsCanBeCaptured == sessionInformationMetrics.isGrailEventsCanBeCaptured && this.crashReporting == sessionInformationMetrics.crashReporting && this.sessionActive == sessionInformationMetrics.sessionActive;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getCrashReporting() {
        return this.crashReporting;
    }

    /* renamed from: b, reason: from getter */
    public final String getInstanceId() {
        return this.instanceId;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getSessionActive() {
        return this.sessionActive;
    }

    /* renamed from: d, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsGrailEventsCanBeCaptured() {
        return this.isGrailEventsCanBeCaptured;
    }

    public int hashCode() {
        return (((((((this.instanceId.hashCode() * 31) + this.sessionId.hashCode()) * 31) + Boolean.hashCode(this.isGrailEventsCanBeCaptured)) * 31) + Boolean.hashCode(this.crashReporting)) * 31) + Boolean.hashCode(this.sessionActive);
    }

    public String toString() {
        return "SessionInformationMetrics(instanceId=" + this.instanceId + ", sessionId=" + this.sessionId + ", isGrailEventsCanBeCaptured=" + this.isGrailEventsCanBeCaptured + ", crashReporting=" + this.crashReporting + ", sessionActive=" + this.sessionActive + ')';
    }

    public SessionInformationMetrics(long j10, int i10, int i11, boolean z10, boolean z11, boolean z12) {
        String strValueOf = String.valueOf(j10);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j10);
        sb2.append('_');
        sb2.append(i10);
        sb2.append('-');
        sb2.append(i11);
        this(strValueOf, sb2.toString(), z10, z11, z12);
    }
}
