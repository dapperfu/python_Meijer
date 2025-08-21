package Ld;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6660q;
import md.AbstractC15707a;
import md.C15708b;

@Deprecated
/* loaded from: classes6.dex */
public final class A extends AbstractC15707a {
    public static final Parcelable.Creator<A> CREATOR = new B();

    /* renamed from: a, reason: collision with root package name */
    public final int f18114a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18115b;

    /* renamed from: c, reason: collision with root package name */
    public final long f18116c;

    /* renamed from: d, reason: collision with root package name */
    public final long f18117d;

    public final boolean equals(Object obj) {
        if (obj instanceof A) {
            A a10 = (A) obj;
            if (this.f18114a == a10.f18114a && this.f18115b == a10.f18115b && this.f18116c == a10.f18116c && this.f18117d == a10.f18117d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C6660q.b(Integer.valueOf(this.f18115b), Integer.valueOf(this.f18114a), Long.valueOf(this.f18117d), Long.valueOf(this.f18116c));
    }

    public final String toString() {
        int i10 = this.f18114a;
        int length = String.valueOf(i10).length();
        int i11 = this.f18115b;
        int length2 = String.valueOf(i11).length();
        long j10 = this.f18117d;
        int length3 = String.valueOf(j10).length();
        long j11 = this.f18116c;
        StringBuilder sb2 = new StringBuilder(length + 50 + length2 + 18 + length3 + 17 + String.valueOf(j11).length());
        sb2.append("NetworkLocationStatus: Wifi status: ");
        sb2.append(i10);
        sb2.append(" Cell status: ");
        sb2.append(i11);
        sb2.append(" elapsed time NS: ");
        sb2.append(j10);
        sb2.append(" system time ms: ");
        sb2.append(j11);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f18114a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, i11);
        C15708b.n(parcel, 2, this.f18115b);
        C15708b.s(parcel, 3, this.f18116c);
        C15708b.s(parcel, 4, this.f18117d);
        C15708b.b(parcel, iA);
    }

    A(int i10, int i11, long j10, long j11) {
        this.f18114a = i10;
        this.f18115b = i11;
        this.f18116c = j10;
        this.f18117d = j11;
    }
}
