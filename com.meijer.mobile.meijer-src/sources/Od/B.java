package Od;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6660q;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class B extends AbstractC15707a {
    public static final Parcelable.Creator<B> CREATOR = new L();

    /* renamed from: b, reason: collision with root package name */
    public static final B f23562b = new B(0);

    /* renamed from: c, reason: collision with root package name */
    public static final B f23563c = new B(1);

    /* renamed from: a, reason: collision with root package name */
    private final int f23564a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B) && this.f23564a == ((B) obj).f23564a;
    }

    public int hashCode() {
        return C6660q.b(Integer.valueOf(this.f23564a));
    }

    public String toString() {
        int i10 = this.f23564a;
        return String.format("StreetViewSource:%s", i10 != 0 ? i10 != 1 ? String.format("UNKNOWN(%s)", Integer.valueOf(i10)) : "OUTDOOR" : "DEFAULT");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f23564a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 2, i11);
        C15708b.b(parcel, iA);
    }

    public B(int i10) {
        this.f23564a = i10;
    }
}
