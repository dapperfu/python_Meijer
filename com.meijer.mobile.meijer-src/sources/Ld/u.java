package Ld;

import Cd.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6660q;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class u extends AbstractC15707a {
    public static final Parcelable.Creator<u> CREATOR = new v();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f18194a;

    /* renamed from: b, reason: collision with root package name */
    private final Q f18195b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f18194a == uVar.f18194a && C6660q.a(this.f18195b, uVar.f18195b);
    }

    public final int hashCode() {
        return C6660q.b(Boolean.valueOf(this.f18194a));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LocationAvailabilityRequest[");
        if (this.f18194a) {
            sb2.append("bypass, ");
        }
        if (this.f18195b != null) {
            sb2.append("impersonation=");
            sb2.append(this.f18195b);
            sb2.append(", ");
        }
        sb2.setLength(sb2.length() - 2);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.f18194a;
        int iA = C15708b.a(parcel);
        C15708b.c(parcel, 1, z10);
        C15708b.u(parcel, 2, this.f18195b, i10, false);
        C15708b.b(parcel, iA);
    }

    u(boolean z10, Q q10) {
        this.f18194a = z10;
        this.f18195b = q10;
    }
}
