package Oc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes4.dex */
public final class W0 extends AbstractC15707a {
    public static final Parcelable.Creator<W0> CREATOR = new C4428r1();

    /* renamed from: a, reason: collision with root package name */
    public final int f23346a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23347b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23348c;

    /* renamed from: d, reason: collision with root package name */
    public W0 f23349d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f23350e;

    public final Gc.a B() {
        Gc.a aVar;
        W0 w02 = this.f23349d;
        if (w02 == null) {
            aVar = null;
        } else {
            String str = w02.f23348c;
            aVar = new Gc.a(w02.f23346a, w02.f23347b, str);
        }
        return new Gc.a(this.f23346a, this.f23347b, this.f23348c, aVar);
    }

    public final Gc.h T() {
        Gc.a aVar;
        W0 w02 = this.f23349d;
        U0 s02 = null;
        if (w02 == null) {
            aVar = null;
        } else {
            aVar = new Gc.a(w02.f23346a, w02.f23347b, w02.f23348c);
        }
        int i10 = this.f23346a;
        String str = this.f23347b;
        String str2 = this.f23348c;
        IBinder iBinder = this.f23350e;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            s02 = iInterfaceQueryLocalInterface instanceof U0 ? (U0) iInterfaceQueryLocalInterface : new S0(iBinder);
        }
        return new Gc.h(i10, str, str2, aVar, Gc.p.d(s02));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f23346a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, i11);
        C15708b.w(parcel, 2, this.f23347b, false);
        C15708b.w(parcel, 3, this.f23348c, false);
        C15708b.u(parcel, 4, this.f23349d, i10, false);
        C15708b.m(parcel, 5, this.f23350e, false);
        C15708b.b(parcel, iA);
    }

    public W0(int i10, String str, String str2, W0 w02, IBinder iBinder) {
        this.f23346a = i10;
        this.f23347b = str;
        this.f23348c = str2;
        this.f23349d = w02;
        this.f23350e = iBinder;
    }
}
