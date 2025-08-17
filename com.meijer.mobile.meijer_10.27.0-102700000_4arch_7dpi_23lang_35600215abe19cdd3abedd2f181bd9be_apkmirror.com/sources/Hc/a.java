package Hc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.AbstractBinderC6999Nh;
import com.google.android.gms.internal.ads.InterfaceC7033Oh;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class a extends AbstractC15136a {
    public static final Parcelable.Creator<a> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f12375a;

    /* renamed from: b, reason: collision with root package name */
    private final IBinder f12376b;

    public boolean B() {
        return this.f12375a;
    }

    public final InterfaceC7033Oh T() {
        IBinder iBinder = this.f12376b;
        if (iBinder == null) {
            return null;
        }
        return AbstractBinderC6999Nh.B9(iBinder);
    }

    a(boolean z10, IBinder iBinder) {
        this.f12375a = z10;
        this.f12376b = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.c(parcel, 1, B());
        C15137b.m(parcel, 2, this.f12376b, false);
        C15137b.b(parcel, iA);
    }
}
