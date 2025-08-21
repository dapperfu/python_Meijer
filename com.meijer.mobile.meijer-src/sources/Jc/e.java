package Jc;

import Oc.AbstractBinderC4398h0;
import Oc.InterfaceC4401i0;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.AbstractBinderC7124Nh;
import com.google.android.gms.internal.ads.InterfaceC7158Oh;
import md.AbstractC15707a;
import md.C15708b;

@Deprecated
/* loaded from: classes4.dex */
public final class e extends AbstractC15707a {
    public static final Parcelable.Creator<e> CREATOR = new l();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f15701a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4401i0 f15702b;

    /* renamed from: c, reason: collision with root package name */
    private final IBinder f15703c;

    public final InterfaceC4401i0 B() {
        return this.f15702b;
    }

    public final InterfaceC7158Oh T() {
        IBinder iBinder = this.f15703c;
        if (iBinder == null) {
            return null;
        }
        return AbstractBinderC7124Nh.B9(iBinder);
    }

    public final boolean zzc() {
        return this.f15701a;
    }

    e(boolean z10, IBinder iBinder, IBinder iBinder2) {
        InterfaceC4401i0 interfaceC4401i0B9;
        this.f15701a = z10;
        if (iBinder != null) {
            interfaceC4401i0B9 = AbstractBinderC4398h0.B9(iBinder);
        } else {
            interfaceC4401i0B9 = null;
        }
        this.f15702b = interfaceC4401i0B9;
        this.f15703c = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        IBinder iBinderAsBinder;
        int iA = C15708b.a(parcel);
        C15708b.c(parcel, 1, this.f15701a);
        InterfaceC4401i0 interfaceC4401i0 = this.f15702b;
        if (interfaceC4401i0 == null) {
            iBinderAsBinder = null;
        } else {
            iBinderAsBinder = interfaceC4401i0.asBinder();
        }
        C15708b.m(parcel, 2, iBinderAsBinder, false);
        C15708b.m(parcel, 3, this.f15703c, false);
        C15708b.b(parcel, iA);
    }
}
