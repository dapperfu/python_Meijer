package Pc;

import Mc.W0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.zzba;
import com.google.android.gms.internal.ads.C7267Vf0;
import com.google.android.gms.internal.ads.V60;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class C extends AbstractC15136a {
    public static final Parcelable.Creator<C> CREATOR = new D();

    /* renamed from: a, reason: collision with root package name */
    public final String f25079a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25080b;

    public final zzba B() {
        return new zzba(this.f25079a, this.f25080b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f25079a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 1, str, false);
        C15137b.n(parcel, 2, this.f25080b);
        C15137b.b(parcel, iA);
    }

    C(String str, int i10) {
        this.f25079a = str == null ? "" : str;
        this.f25080b = i10;
    }

    public static C T(Throwable th2) {
        String message;
        W0 w0A = V60.a(th2);
        if (C7267Vf0.d(th2.getMessage())) {
            message = w0A.f19160b;
        } else {
            message = th2.getMessage();
        }
        return new C(message, w0A.f19159a);
    }
}
