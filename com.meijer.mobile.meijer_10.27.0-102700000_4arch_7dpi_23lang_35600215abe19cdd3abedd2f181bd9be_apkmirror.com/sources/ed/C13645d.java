package ed;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6535q;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: ed.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13645d extends AbstractC15136a {
    public static final Parcelable.Creator<C13645d> CREATOR = new C13646e();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f128695a;

    /* renamed from: b, reason: collision with root package name */
    private final long f128696b;

    /* renamed from: c, reason: collision with root package name */
    private final long f128697c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13645d) {
            C13645d c13645d = (C13645d) obj;
            if (this.f128695a == c13645d.f128695a && this.f128696b == c13645d.f128696b && this.f128697c == c13645d.f128697c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C6535q.b(Boolean.valueOf(this.f128695a), Long.valueOf(this.f128696b), Long.valueOf(this.f128697c));
    }

    public final String toString() {
        return "CollectForDebugParcelable[skipPersistentStorage: " + this.f128695a + ",collectForDebugStartTimeMillis: " + this.f128696b + ",collectForDebugExpiryTimeMillis: " + this.f128697c + "]";
    }

    public C13645d(boolean z10, long j10, long j11) {
        this.f128695a = z10;
        this.f128696b = j10;
        this.f128697c = j11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.c(parcel, 1, this.f128695a);
        C15137b.s(parcel, 2, this.f128697c);
        C15137b.s(parcel, 3, this.f128696b);
        C15137b.b(parcel, iA);
    }
}
