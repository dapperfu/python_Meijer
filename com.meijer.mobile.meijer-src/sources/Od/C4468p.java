package Od;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6660q;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Od.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4468p extends AbstractC15707a {
    public static final Parcelable.Creator<C4468p> CREATOR = new d0();

    /* renamed from: a, reason: collision with root package name */
    private final int f23650a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f23651b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4468p)) {
            return false;
        }
        C4468p c4468p = (C4468p) obj;
        return this.f23650a == c4468p.f23650a && C6660q.a(this.f23651b, c4468p.f23651b);
    }

    public int hashCode() {
        return C6660q.b(Integer.valueOf(this.f23650a), this.f23651b);
    }

    public String toString() {
        return "[PatternItem: type=" + this.f23650a + " length=" + this.f23651b + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f23650a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 2, i11);
        C15708b.l(parcel, 3, this.f23651b, false);
        C15708b.b(parcel, iA);
    }

    public C4468p(int i10, Float f10) {
        boolean z10 = true;
        if (i10 != 1 && (f10 == null || f10.floatValue() < 0.0f)) {
            z10 = false;
        }
        com.google.android.gms.common.internal.r.b(z10, "Invalid PatternItem: type=" + i10 + " length=" + f10);
        this.f23650a = i10;
        this.f23651b = f10;
    }
}
