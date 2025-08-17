package Hc;

import Mc.AbstractBinderC4120h0;
import Mc.InterfaceC4123i0;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.AbstractBinderC6999Nh;
import com.google.android.gms.internal.ads.InterfaceC7033Oh;
import kd.AbstractC15136a;
import kd.C15137b;

@Deprecated
/* loaded from: classes4.dex */
public final class e extends AbstractC15136a {
    public static final Parcelable.Creator<e> CREATOR = new l();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f12391a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4123i0 f12392b;

    /* renamed from: c, reason: collision with root package name */
    private final IBinder f12393c;

    public final InterfaceC4123i0 B() {
        return this.f12392b;
    }

    public final InterfaceC7033Oh T() {
        IBinder iBinder = this.f12393c;
        if (iBinder == null) {
            return null;
        }
        return AbstractBinderC6999Nh.B9(iBinder);
    }

    public final boolean zzc() {
        return this.f12391a;
    }

    e(boolean z10, IBinder iBinder, IBinder iBinder2) {
        InterfaceC4123i0 interfaceC4123i0B9;
        this.f12391a = z10;
        if (iBinder != null) {
            interfaceC4123i0B9 = AbstractBinderC4120h0.B9(iBinder);
        } else {
            interfaceC4123i0B9 = null;
        }
        this.f12392b = interfaceC4123i0B9;
        this.f12393c = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder iBinderAsBinder;
        int iA = C15137b.a(parcel);
        C15137b.c(parcel, 1, this.f12391a);
        InterfaceC4123i0 interfaceC4123i0 = this.f12392b;
        if (interfaceC4123i0 == null) {
            iBinderAsBinder = null;
        } else {
            iBinderAsBinder = interfaceC4123i0.asBinder();
        }
        C15137b.m(parcel, 2, iBinderAsBinder, false);
        C15137b.m(parcel, 3, this.f12393c, false);
        C15137b.b(parcel, iA);
    }
}
