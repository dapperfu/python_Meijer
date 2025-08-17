package Md;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6535q;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class B extends AbstractC15136a {
    public static final Parcelable.Creator<B> CREATOR = new L();

    /* renamed from: b, reason: collision with root package name */
    public static final B f19375b = new B(0);

    /* renamed from: c, reason: collision with root package name */
    public static final B f19376c = new B(1);

    /* renamed from: a, reason: collision with root package name */
    private final int f19377a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B) && this.f19377a == ((B) obj).f19377a;
    }

    public int hashCode() {
        return C6535q.b(Integer.valueOf(this.f19377a));
    }

    public String toString() {
        int i10 = this.f19377a;
        return String.format("StreetViewSource:%s", i10 != 0 ? i10 != 1 ? String.format("UNKNOWN(%s)", Integer.valueOf(i10)) : "OUTDOOR" : "DEFAULT");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f19377a;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 2, i11);
        C15137b.b(parcel, iA);
    }

    public B(int i10) {
        this.f19377a = i10;
    }
}
