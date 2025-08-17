package Md;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6535q;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Md.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4190p extends AbstractC15136a {
    public static final Parcelable.Creator<C4190p> CREATOR = new d0();

    /* renamed from: a, reason: collision with root package name */
    private final int f19463a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f19464b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4190p)) {
            return false;
        }
        C4190p c4190p = (C4190p) obj;
        return this.f19463a == c4190p.f19463a && C6535q.a(this.f19464b, c4190p.f19464b);
    }

    public int hashCode() {
        return C6535q.b(Integer.valueOf(this.f19463a), this.f19464b);
    }

    public String toString() {
        return "[PatternItem: type=" + this.f19463a + " length=" + this.f19464b + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f19463a;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 2, i11);
        C15137b.l(parcel, 3, this.f19464b, false);
        C15137b.b(parcel, iA);
    }

    public C4190p(int i10, Float f10) {
        boolean z10 = true;
        if (i10 != 1 && (f10 == null || f10.floatValue() < 0.0f)) {
            z10 = false;
        }
        com.google.android.gms.common.internal.r.b(z10, "Invalid PatternItem: type=" + i10 + " length=" + f10);
        this.f19463a = i10;
        this.f19464b = f10;
    }
}
