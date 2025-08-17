package Mc;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class W0 extends AbstractC15136a {
    public static final Parcelable.Creator<W0> CREATOR = new C4150r1();

    /* renamed from: a, reason: collision with root package name */
    public final int f19159a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19160b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19161c;

    /* renamed from: d, reason: collision with root package name */
    public W0 f19162d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f19163e;

    public final Ec.a B() {
        Ec.a aVar;
        W0 w02 = this.f19162d;
        if (w02 == null) {
            aVar = null;
        } else {
            String str = w02.f19161c;
            aVar = new Ec.a(w02.f19159a, w02.f19160b, str);
        }
        return new Ec.a(this.f19159a, this.f19160b, this.f19161c, aVar);
    }

    public final Ec.h T() {
        Ec.a aVar;
        W0 w02 = this.f19162d;
        U0 s02 = null;
        if (w02 == null) {
            aVar = null;
        } else {
            aVar = new Ec.a(w02.f19159a, w02.f19160b, w02.f19161c);
        }
        int i10 = this.f19159a;
        String str = this.f19160b;
        String str2 = this.f19161c;
        IBinder iBinder = this.f19163e;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            s02 = iInterfaceQueryLocalInterface instanceof U0 ? (U0) iInterfaceQueryLocalInterface : new S0(iBinder);
        }
        return new Ec.h(i10, str, str2, aVar, Ec.p.d(s02));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f19159a;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, i11);
        C15137b.w(parcel, 2, this.f19160b, false);
        C15137b.w(parcel, 3, this.f19161c, false);
        C15137b.u(parcel, 4, this.f19162d, i10, false);
        C15137b.m(parcel, 5, this.f19163e, false);
        C15137b.b(parcel, iA);
    }

    public W0(int i10, String str, String str2, W0 w02, IBinder iBinder) {
        this.f19159a = i10;
        this.f19160b = str;
        this.f19161c = str2;
        this.f19162d = w02;
        this.f19163e = iBinder;
    }
}
