package mr;

import io.constructor.data.local.PreferencesHelper;
import j$.time.LocalTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lmr/p;", "", "", PreferencesHelper.PREF_ID, "j$/time/LocalTime", "startTime", "endTime", "", "isEnabled", "<init>", "(Ljava/lang/String;Lj$/time/LocalTime;Lj$/time/LocalTime;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lj$/time/LocalTime;", "getStartTime", "()Lj$/time/LocalTime;", "c", "getEndTime", "d", "Z", "()Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mr.p, reason: case insensitive filesystem and from toString */
/* loaded from: classes11.dex */
public final /* data */ class FulfillmentSlot {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalTime startTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalTime endTime;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEnabled;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FulfillmentSlot)) {
            return false;
        }
        FulfillmentSlot fulfillmentSlot = (FulfillmentSlot) other;
        return Intrinsics.e(this.id, fulfillmentSlot.id) && Intrinsics.e(this.startTime, fulfillmentSlot.startTime) && Intrinsics.e(this.endTime, fulfillmentSlot.endTime) && this.isEnabled == fulfillmentSlot.isEnabled;
    }

    public FulfillmentSlot(String id2, LocalTime startTime, LocalTime endTime, boolean z10) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(startTime, "startTime");
        Intrinsics.j(endTime, "endTime");
        this.id = id2;
        this.startTime = startTime;
        this.endTime = endTime;
        this.isEnabled = z10;
    }

    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.startTime.hashCode()) * 31) + this.endTime.hashCode()) * 31) + Boolean.hashCode(this.isEnabled);
    }

    public String toString() {
        return "FulfillmentSlot(id=" + this.id + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", isEnabled=" + this.isEnabled + ')';
    }
}
