package Cd;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class W extends AbstractC15707a {
    public static final Parcelable.Creator<W> CREATOR = new X();

    /* renamed from: a, reason: collision with root package name */
    private final int f4221a;

    /* renamed from: b, reason: collision with root package name */
    private final IBinder f4222b;

    /* renamed from: c, reason: collision with root package name */
    private final IBinder f4223c;

    /* renamed from: d, reason: collision with root package name */
    private final PendingIntent f4224d;

    /* renamed from: e, reason: collision with root package name */
    private final String f4225e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [Ld.K, android.os.IBinder] */
    public static W B(IInterface iInterface, Ld.K k10, String str) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new W(2, iInterface, k10, null, str);
    }

    public static W T(PendingIntent pendingIntent) {
        return new W(3, null, null, pendingIntent, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static W b0(I0 i02) {
        return new W(4, null, i02, null, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f4221a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, i11);
        C15708b.m(parcel, 2, this.f4222b, false);
        C15708b.m(parcel, 3, this.f4223c, false);
        C15708b.u(parcel, 4, this.f4224d, i10, false);
        C15708b.w(parcel, 6, this.f4225e, false);
        C15708b.b(parcel, iA);
    }

    W(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.f4221a = i10;
        this.f4222b = iBinder;
        this.f4223c = iBinder2;
        this.f4224d = pendingIntent;
        this.f4225e = str;
    }
}
