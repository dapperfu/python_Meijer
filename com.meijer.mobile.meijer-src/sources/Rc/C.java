package Rc;

import Oc.W0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.zzba;
import com.google.android.gms.internal.ads.C7392Vf0;
import com.google.android.gms.internal.ads.V60;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes4.dex */
public final class C extends AbstractC15707a {
    public static final Parcelable.Creator<C> CREATOR = new D();

    /* renamed from: a, reason: collision with root package name */
    public final String f32293a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32294b;

    public final zzba B() {
        return new zzba(this.f32293a, this.f32294b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f32293a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 1, str, false);
        C15708b.n(parcel, 2, this.f32294b);
        C15708b.b(parcel, iA);
    }

    C(String str, int i10) {
        this.f32293a = str == null ? "" : str;
        this.f32294b = i10;
    }

    public static C T(Throwable th2) {
        String message;
        W0 w0A = V60.a(th2);
        if (C7392Vf0.d(th2.getMessage())) {
            message = w0A.f23347b;
        } else {
            message = th2.getMessage();
        }
        return new C(message, w0A.f23346a);
    }
}
