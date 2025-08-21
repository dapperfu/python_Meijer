package Ld;

import Cd.C3054g0;
import Cd.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6660q;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Ld.j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4020j extends AbstractC15707a {
    public static final Parcelable.Creator<C4020j> CREATOR = new s();

    /* renamed from: a, reason: collision with root package name */
    private final long f18168a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18169b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f18170c;

    /* renamed from: d, reason: collision with root package name */
    private final Q f18171d;

    /* renamed from: Ld.j$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f18172a = Long.MAX_VALUE;

        /* renamed from: b, reason: collision with root package name */
        private int f18173b = 0;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f18174c = false;

        /* renamed from: d, reason: collision with root package name */
        private final Q f18175d = null;

        public C4020j a() {
            return new C4020j(this.f18172a, this.f18173b, this.f18174c, this.f18175d);
        }
    }

    public int B() {
        return this.f18169b;
    }

    public long T() {
        return this.f18168a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4020j)) {
            return false;
        }
        C4020j c4020j = (C4020j) obj;
        return this.f18168a == c4020j.f18168a && this.f18169b == c4020j.f18169b && this.f18170c == c4020j.f18170c && C6660q.a(this.f18171d, c4020j.f18171d);
    }

    public int hashCode() {
        return C6660q.b(Long.valueOf(this.f18168a), Integer.valueOf(this.f18169b), Boolean.valueOf(this.f18170c));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LastLocationRequest[");
        if (this.f18168a != Long.MAX_VALUE) {
            sb2.append("maxAge=");
            C3054g0.c(this.f18168a, sb2);
        }
        if (this.f18169b != 0) {
            sb2.append(", ");
            sb2.append(H.b(this.f18169b));
        }
        if (this.f18170c) {
            sb2.append(", bypass");
        }
        if (this.f18171d != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f18171d);
        }
        sb2.append(']');
        return sb2.toString();
    }

    C4020j(long j10, int i10, boolean z10, Q q10) {
        this.f18168a = j10;
        this.f18169b = i10;
        this.f18170c = z10;
        this.f18171d = q10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.s(parcel, 1, T());
        C15708b.n(parcel, 2, B());
        C15708b.c(parcel, 3, this.f18170c);
        C15708b.u(parcel, 5, this.f18171d, i10, false);
        C15708b.b(parcel, iA);
    }
}
