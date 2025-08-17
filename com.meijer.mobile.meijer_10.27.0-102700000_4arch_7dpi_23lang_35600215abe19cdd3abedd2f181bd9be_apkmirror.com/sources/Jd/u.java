package Jd;

import Ad.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6535q;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class u extends AbstractC15136a {
    public static final Parcelable.Creator<u> CREATOR = new v();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f14857a;

    /* renamed from: b, reason: collision with root package name */
    private final Q f14858b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f14857a == uVar.f14857a && C6535q.a(this.f14858b, uVar.f14858b);
    }

    public final int hashCode() {
        return C6535q.b(Boolean.valueOf(this.f14857a));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LocationAvailabilityRequest[");
        if (this.f14857a) {
            sb2.append("bypass, ");
        }
        if (this.f14858b != null) {
            sb2.append("impersonation=");
            sb2.append(this.f14858b);
            sb2.append(", ");
        }
        sb2.setLength(sb2.length() - 2);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.f14857a;
        int iA = C15137b.a(parcel);
        C15137b.c(parcel, 1, z10);
        C15137b.u(parcel, 2, this.f14858b, i10, false);
        C15137b.b(parcel, iA);
    }

    u(boolean z10, Q q10) {
        this.f14857a = z10;
        this.f14858b = q10;
    }
}
