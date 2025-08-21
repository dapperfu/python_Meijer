package Cd;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

@Deprecated
/* renamed from: Cd.a0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3042a0 extends AbstractC15707a {
    public static final Parcelable.Creator<C3042a0> CREATOR = new C3044b0();

    /* renamed from: a, reason: collision with root package name */
    private final int f4229a;

    /* renamed from: b, reason: collision with root package name */
    private final Y f4230b;

    /* renamed from: c, reason: collision with root package name */
    private final Ld.N f4231c;

    /* renamed from: d, reason: collision with root package name */
    private final Ld.K f4232d;

    /* renamed from: e, reason: collision with root package name */
    private final PendingIntent f4233e;

    /* renamed from: f, reason: collision with root package name */
    private final A0 f4234f;

    /* renamed from: g, reason: collision with root package name */
    private final String f4235g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f4229a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, i11);
        C15708b.u(parcel, 2, this.f4230b, i10, false);
        Ld.N n10 = this.f4231c;
        C15708b.m(parcel, 3, n10 == null ? null : n10.asBinder(), false);
        C15708b.u(parcel, 4, this.f4233e, i10, false);
        Ld.K k10 = this.f4232d;
        C15708b.m(parcel, 5, k10 == null ? null : k10.asBinder(), false);
        A0 a02 = this.f4234f;
        C15708b.m(parcel, 6, a02 != null ? a02.asBinder() : null, false);
        C15708b.w(parcel, 8, this.f4235g, false);
        C15708b.b(parcel, iA);
    }

    C3042a0(int i10, Y y10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        Ld.N nA2;
        Ld.K kA2;
        this.f4229a = i10;
        this.f4230b = y10;
        A0 y0Var = null;
        if (iBinder != null) {
            nA2 = Ld.M.a2(iBinder);
        } else {
            nA2 = null;
        }
        this.f4231c = nA2;
        this.f4233e = pendingIntent;
        if (iBinder2 != null) {
            kA2 = Ld.J.a2(iBinder2);
        } else {
            kA2 = null;
        }
        this.f4232d = kA2;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (iInterfaceQueryLocalInterface instanceof A0) {
                y0Var = (A0) iInterfaceQueryLocalInterface;
            } else {
                y0Var = new y0(iBinder3);
            }
        }
        this.f4234f = y0Var;
        this.f4235g = str;
    }
}
