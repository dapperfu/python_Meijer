package Oc;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes4.dex */
public final class J1 extends AbstractC15707a {
    public static final Parcelable.Creator<J1> CREATOR = new K1();

    /* renamed from: a, reason: collision with root package name */
    public final String f23332a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23333b;

    /* renamed from: c, reason: collision with root package name */
    public final Y1 f23334c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23335d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof J1) {
            J1 j12 = (J1) obj;
            if (this.f23332a.equals(j12.f23332a) && this.f23333b == j12.f23333b && this.f23334c.B(j12.f23334c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f23332a, Integer.valueOf(this.f23333b), this.f23334c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f23332a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 1, str, false);
        C15708b.n(parcel, 2, this.f23333b);
        C15708b.u(parcel, 3, this.f23334c, i10, false);
        C15708b.n(parcel, 4, this.f23335d);
        C15708b.b(parcel, iA);
    }

    public J1(String str, int i10, Y1 y12, int i11) {
        this.f23332a = str;
        this.f23333b = i10;
        this.f23334c = y12;
        this.f23335d = i11;
    }
}
