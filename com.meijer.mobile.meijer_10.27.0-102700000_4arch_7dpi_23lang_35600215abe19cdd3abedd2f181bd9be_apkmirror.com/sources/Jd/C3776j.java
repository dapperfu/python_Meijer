package Jd;

import Ad.C2816g0;
import Ad.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6535q;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Jd.j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3776j extends AbstractC15136a {
    public static final Parcelable.Creator<C3776j> CREATOR = new s();

    /* renamed from: a, reason: collision with root package name */
    private final long f14831a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14832b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f14833c;

    /* renamed from: d, reason: collision with root package name */
    private final Q f14834d;

    /* renamed from: Jd.j$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f14835a = Long.MAX_VALUE;

        /* renamed from: b, reason: collision with root package name */
        private int f14836b = 0;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f14837c = false;

        /* renamed from: d, reason: collision with root package name */
        private final Q f14838d = null;

        public C3776j a() {
            return new C3776j(this.f14835a, this.f14836b, this.f14837c, this.f14838d);
        }
    }

    public int B() {
        return this.f14832b;
    }

    public long T() {
        return this.f14831a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3776j)) {
            return false;
        }
        C3776j c3776j = (C3776j) obj;
        return this.f14831a == c3776j.f14831a && this.f14832b == c3776j.f14832b && this.f14833c == c3776j.f14833c && C6535q.a(this.f14834d, c3776j.f14834d);
    }

    public int hashCode() {
        return C6535q.b(Long.valueOf(this.f14831a), Integer.valueOf(this.f14832b), Boolean.valueOf(this.f14833c));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LastLocationRequest[");
        if (this.f14831a != Long.MAX_VALUE) {
            sb2.append("maxAge=");
            C2816g0.c(this.f14831a, sb2);
        }
        if (this.f14832b != 0) {
            sb2.append(", ");
            sb2.append(H.b(this.f14832b));
        }
        if (this.f14833c) {
            sb2.append(", bypass");
        }
        if (this.f14834d != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f14834d);
        }
        sb2.append(']');
        return sb2.toString();
    }

    C3776j(long j10, int i10, boolean z10, Q q10) {
        this.f14831a = j10;
        this.f14832b = i10;
        this.f14833c = z10;
        this.f14834d = q10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.s(parcel, 1, T());
        C15137b.n(parcel, 2, B());
        C15137b.c(parcel, 3, this.f14833c);
        C15137b.u(parcel, 5, this.f14834d, i10, false);
        C15137b.b(parcel, iA);
    }
}
