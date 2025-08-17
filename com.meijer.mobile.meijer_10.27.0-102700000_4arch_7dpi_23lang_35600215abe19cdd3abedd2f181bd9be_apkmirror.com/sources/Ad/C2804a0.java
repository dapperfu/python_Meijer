package Ad;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

@Deprecated
/* renamed from: Ad.a0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2804a0 extends AbstractC15136a {
    public static final Parcelable.Creator<C2804a0> CREATOR = new C2806b0();

    /* renamed from: a, reason: collision with root package name */
    private final int f233a;

    /* renamed from: b, reason: collision with root package name */
    private final Y f234b;

    /* renamed from: c, reason: collision with root package name */
    private final Jd.N f235c;

    /* renamed from: d, reason: collision with root package name */
    private final Jd.K f236d;

    /* renamed from: e, reason: collision with root package name */
    private final PendingIntent f237e;

    /* renamed from: f, reason: collision with root package name */
    private final A0 f238f;

    /* renamed from: g, reason: collision with root package name */
    private final String f239g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f233a;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, i11);
        C15137b.u(parcel, 2, this.f234b, i10, false);
        Jd.N n10 = this.f235c;
        C15137b.m(parcel, 3, n10 == null ? null : n10.asBinder(), false);
        C15137b.u(parcel, 4, this.f237e, i10, false);
        Jd.K k10 = this.f236d;
        C15137b.m(parcel, 5, k10 == null ? null : k10.asBinder(), false);
        A0 a02 = this.f238f;
        C15137b.m(parcel, 6, a02 != null ? a02.asBinder() : null, false);
        C15137b.w(parcel, 8, this.f239g, false);
        C15137b.b(parcel, iA);
    }

    C2804a0(int i10, Y y10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        Jd.N nA2;
        Jd.K kA2;
        this.f233a = i10;
        this.f234b = y10;
        A0 y0Var = null;
        if (iBinder != null) {
            nA2 = Jd.M.a2(iBinder);
        } else {
            nA2 = null;
        }
        this.f235c = nA2;
        this.f237e = pendingIntent;
        if (iBinder2 != null) {
            kA2 = Jd.J.a2(iBinder2);
        } else {
            kA2 = null;
        }
        this.f236d = kA2;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (iInterfaceQueryLocalInterface instanceof A0) {
                y0Var = (A0) iInterfaceQueryLocalInterface;
            } else {
                y0Var = new y0(iBinder3);
            }
        }
        this.f238f = y0Var;
        this.f239g = str;
    }
}
