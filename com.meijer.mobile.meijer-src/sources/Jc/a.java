package Jc;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.AbstractBinderC7124Nh;
import com.google.android.gms.internal.ads.InterfaceC7158Oh;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes4.dex */
public final class a extends AbstractC15707a {
    public static final Parcelable.Creator<a> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f15685a;

    /* renamed from: b, reason: collision with root package name */
    private final IBinder f15686b;

    public boolean B() {
        return this.f15685a;
    }

    public final InterfaceC7158Oh T() {
        IBinder iBinder = this.f15686b;
        if (iBinder == null) {
            return null;
        }
        return AbstractBinderC7124Nh.B9(iBinder);
    }

    a(boolean z10, IBinder iBinder) {
        this.f15685a = z10;
        this.f15686b = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.c(parcel, 1, B());
        C15708b.m(parcel, 2, this.f15686b, false);
        C15708b.b(parcel, iA);
    }
}
