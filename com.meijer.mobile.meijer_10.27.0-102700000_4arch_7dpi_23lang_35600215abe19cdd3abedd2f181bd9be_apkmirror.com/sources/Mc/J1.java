package Mc;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class J1 extends AbstractC15136a {
    public static final Parcelable.Creator<J1> CREATOR = new K1();

    /* renamed from: a, reason: collision with root package name */
    public final String f19145a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19146b;

    /* renamed from: c, reason: collision with root package name */
    public final Y1 f19147c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19148d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof J1) {
            J1 j12 = (J1) obj;
            if (this.f19145a.equals(j12.f19145a) && this.f19146b == j12.f19146b && this.f19147c.B(j12.f19147c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f19145a, Integer.valueOf(this.f19146b), this.f19147c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f19145a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 1, str, false);
        C15137b.n(parcel, 2, this.f19146b);
        C15137b.u(parcel, 3, this.f19147c, i10, false);
        C15137b.n(parcel, 4, this.f19148d);
        C15137b.b(parcel, iA);
    }

    public J1(String str, int i10, Y1 y12, int i11) {
        this.f19145a = str;
        this.f19146b = i10;
        this.f19147c = y12;
        this.f19148d = i11;
    }
}
