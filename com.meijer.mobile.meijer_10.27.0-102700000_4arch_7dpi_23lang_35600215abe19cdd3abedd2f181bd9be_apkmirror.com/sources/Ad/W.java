package Ad;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class W extends AbstractC15136a {
    public static final Parcelable.Creator<W> CREATOR = new X();

    /* renamed from: a, reason: collision with root package name */
    private final int f225a;

    /* renamed from: b, reason: collision with root package name */
    private final IBinder f226b;

    /* renamed from: c, reason: collision with root package name */
    private final IBinder f227c;

    /* renamed from: d, reason: collision with root package name */
    private final PendingIntent f228d;

    /* renamed from: e, reason: collision with root package name */
    private final String f229e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [Jd.K, android.os.IBinder] */
    public static W B(IInterface iInterface, Jd.K k10, String str) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new W(2, iInterface, k10, null, str);
    }

    public static W T(PendingIntent pendingIntent) {
        return new W(3, null, null, pendingIntent, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static W c0(I0 i02) {
        return new W(4, null, i02, null, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f225a;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, i11);
        C15137b.m(parcel, 2, this.f226b, false);
        C15137b.m(parcel, 3, this.f227c, false);
        C15137b.u(parcel, 4, this.f228d, i10, false);
        C15137b.w(parcel, 6, this.f229e, false);
        C15137b.b(parcel, iA);
    }

    W(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.f225a = i10;
        this.f226b = iBinder;
        this.f227c = iBinder2;
        this.f228d = pendingIntent;
        this.f229e = str;
    }
}
