package V7;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"LV7/b;", "", "LV7/a;", "phase", "", "start", "<init>", "(LV7/a;J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LV7/a;", "()LV7/a;", "b", "J", "()J", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: V7.b, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class AppStartupPhaseWithTiming {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a phase;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long start;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppStartupPhaseWithTiming)) {
            return false;
        }
        AppStartupPhaseWithTiming appStartupPhaseWithTiming = (AppStartupPhaseWithTiming) other;
        return this.phase == appStartupPhaseWithTiming.phase && this.start == appStartupPhaseWithTiming.start;
    }

    public AppStartupPhaseWithTiming(a phase, long j10) {
        Intrinsics.j(phase, "phase");
        this.phase = phase;
        this.start = j10;
    }

    /* renamed from: a, reason: from getter */
    public final a getPhase() {
        return this.phase;
    }

    /* renamed from: b, reason: from getter */
    public final long getStart() {
        return this.start;
    }

    public int hashCode() {
        return (this.phase.hashCode() * 31) + Long.hashCode(this.start);
    }

    public String toString() {
        return "AppStartupPhaseWithTiming(phase=" + this.phase + ", start=" + this.start + ')';
    }
}
