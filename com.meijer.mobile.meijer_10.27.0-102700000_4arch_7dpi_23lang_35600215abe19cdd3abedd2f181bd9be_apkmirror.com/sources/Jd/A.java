package Jd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6535q;
import kd.AbstractC15136a;
import kd.C15137b;

@Deprecated
/* loaded from: classes6.dex */
public final class A extends AbstractC15136a {
    public static final Parcelable.Creator<A> CREATOR = new B();

    /* renamed from: a, reason: collision with root package name */
    public final int f14777a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14778b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14779c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14780d;

    public final boolean equals(Object obj) {
        if (obj instanceof A) {
            A a10 = (A) obj;
            if (this.f14777a == a10.f14777a && this.f14778b == a10.f14778b && this.f14779c == a10.f14779c && this.f14780d == a10.f14780d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C6535q.b(Integer.valueOf(this.f14778b), Integer.valueOf(this.f14777a), Long.valueOf(this.f14780d), Long.valueOf(this.f14779c));
    }

    public final String toString() {
        int i10 = this.f14777a;
        int length = String.valueOf(i10).length();
        int i11 = this.f14778b;
        int length2 = String.valueOf(i11).length();
        long j10 = this.f14780d;
        int length3 = String.valueOf(j10).length();
        long j11 = this.f14779c;
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
        int i11 = this.f14777a;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, i11);
        C15137b.n(parcel, 2, this.f14778b);
        C15137b.s(parcel, 3, this.f14779c);
        C15137b.s(parcel, 4, this.f14780d);
        C15137b.b(parcel, iA);
    }

    A(int i10, int i11, long j10, long j11) {
        this.f14777a = i10;
        this.f14778b = i11;
        this.f14779c = j10;
        this.f14780d = j11;
    }
}
