package lk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014¨\u0006\u0015"}, d2 = {"Llk/b;", "", "", "phoneNumber", "", "forceNextDayStart", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lk.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class PeriodicPollingStartEvent {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phoneNumber;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean forceNextDayStart;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PeriodicPollingStartEvent)) {
            return false;
        }
        PeriodicPollingStartEvent periodicPollingStartEvent = (PeriodicPollingStartEvent) other;
        return Intrinsics.e(this.phoneNumber, periodicPollingStartEvent.phoneNumber) && this.forceNextDayStart == periodicPollingStartEvent.forceNextDayStart;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getForceNextDayStart() {
        return this.forceNextDayStart;
    }

    /* renamed from: b, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int hashCode() {
        String str = this.phoneNumber;
        return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.forceNextDayStart);
    }

    public String toString() {
        return "PeriodicPollingStartEvent(phoneNumber=" + this.phoneNumber + ", forceNextDayStart=" + this.forceNextDayStart + ')';
    }

    public PeriodicPollingStartEvent(String str, boolean z10) {
        this.phoneNumber = str;
        this.forceNextDayStart = z10;
    }
}
