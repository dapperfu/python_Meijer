package Zd;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Zd.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5631d extends AbstractC15707a {
    public static final Parcelable.Creator<C5631d> CREATOR = new A();

    /* renamed from: a, reason: collision with root package name */
    C5634g f43690a;

    /* renamed from: b, reason: collision with root package name */
    C5635h f43691b;

    /* renamed from: c, reason: collision with root package name */
    C5632e f43692c;

    /* renamed from: d, reason: collision with root package name */
    int f43693d;

    /* renamed from: Zd.d$a */
    public final class a {
        /* synthetic */ a(z zVar) {
        }

        public C5631d a() {
            C5631d c5631d = C5631d.this;
            com.google.android.gms.common.internal.r.q(((c5631d.f43692c == null ? 0 : 1) + (c5631d.f43690a == null ? 0 : 1)) + (c5631d.f43691b == null ? 0 : 1) == 1, "CreateWalletObjectsRequest must have exactly one Wallet Object");
            return C5631d.this;
        }

        public a b(C5634g c5634g) {
            C5631d.this.f43690a = c5634g;
            return this;
        }
    }

    C5631d() {
    }

    C5631d(C5634g c5634g, C5635h c5635h, C5632e c5632e, int i10) {
        this.f43690a = c5634g;
        this.f43691b = c5635h;
        this.f43692c = c5632e;
        this.f43693d = i10;
    }

    public static a B() {
        return new C5631d().new a(null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.u(parcel, 2, this.f43690a, i10, false);
        C15708b.u(parcel, 3, this.f43691b, i10, false);
        C15708b.u(parcel, 4, this.f43692c, i10, false);
        C15708b.n(parcel, 5, this.f43693d);
        C15708b.b(parcel, iA);
    }
}
