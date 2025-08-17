package Xd;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Xd.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C5420d extends AbstractC15136a {
    public static final Parcelable.Creator<C5420d> CREATOR = new A();

    /* renamed from: a, reason: collision with root package name */
    C5423g f39212a;

    /* renamed from: b, reason: collision with root package name */
    C5424h f39213b;

    /* renamed from: c, reason: collision with root package name */
    C5421e f39214c;

    /* renamed from: d, reason: collision with root package name */
    int f39215d;

    /* renamed from: Xd.d$a */
    public final class a {
        /* synthetic */ a(z zVar) {
        }

        public C5420d a() {
            C5420d c5420d = C5420d.this;
            com.google.android.gms.common.internal.r.q(((c5420d.f39214c == null ? 0 : 1) + (c5420d.f39212a == null ? 0 : 1)) + (c5420d.f39213b == null ? 0 : 1) == 1, "CreateWalletObjectsRequest must have exactly one Wallet Object");
            return C5420d.this;
        }

        public a b(C5423g c5423g) {
            C5420d.this.f39212a = c5423g;
            return this;
        }
    }

    C5420d() {
    }

    C5420d(C5423g c5423g, C5424h c5424h, C5421e c5421e, int i10) {
        this.f39212a = c5423g;
        this.f39213b = c5424h;
        this.f39214c = c5421e;
        this.f39215d = i10;
    }

    public static a B() {
        return new C5420d().new a(null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.u(parcel, 2, this.f39212a, i10, false);
        C15137b.u(parcel, 3, this.f39213b, i10, false);
        C15137b.u(parcel, 4, this.f39214c, i10, false);
        C15137b.n(parcel, 5, this.f39215d);
        C15137b.b(parcel, iA);
    }
}
