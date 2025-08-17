package Md;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class G extends AbstractC15136a {
    public static final Parcelable.Creator<G> CREATOR = new S();

    /* renamed from: a, reason: collision with root package name */
    private Bd.q f19394a;

    /* renamed from: b, reason: collision with root package name */
    private H f19395b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f19396c;

    /* renamed from: d, reason: collision with root package name */
    private float f19397d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f19398e;

    /* renamed from: f, reason: collision with root package name */
    private float f19399f;

    public G() {
        this.f19396c = true;
        this.f19398e = true;
        this.f19399f = 0.0f;
    }

    public G d1(float f10) {
        boolean z10 = false;
        if (f10 >= 0.0f && f10 <= 1.0f) {
            z10 = true;
        }
        com.google.android.gms.common.internal.r.b(z10, "Transparency must be in the range [0..1]");
        this.f19399f = f10;
        return this;
    }

    G(IBinder iBinder, boolean z10, float f10, boolean z11, float f11) {
        this.f19396c = true;
        this.f19398e = true;
        this.f19399f = 0.0f;
        Bd.q qVarA2 = Bd.p.a2(iBinder);
        this.f19394a = qVarA2;
        this.f19395b = qVarA2 == null ? null : new P(this);
        this.f19396c = z10;
        this.f19397d = f10;
        this.f19398e = z11;
        this.f19399f = f11;
    }

    public G B(boolean z10) {
        this.f19398e = z10;
        return this;
    }

    public boolean K0() {
        return this.f19396c;
    }

    public boolean T() {
        return this.f19398e;
    }

    public G W0(H h10) {
        this.f19395b = (H) com.google.android.gms.common.internal.r.m(h10, "tileProvider must not be null.");
        this.f19394a = new Q(this, h10);
        return this;
    }

    public float c0() {
        return this.f19399f;
    }

    public G g1(boolean z10) {
        this.f19396c = z10;
        return this;
    }

    public G i1(float f10) {
        this.f19397d = f10;
        return this;
    }

    public float q0() {
        return this.f19397d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        IBinder iBinderAsBinder;
        int iA = C15137b.a(parcel);
        Bd.q qVar = this.f19394a;
        if (qVar == null) {
            iBinderAsBinder = null;
        } else {
            iBinderAsBinder = qVar.asBinder();
        }
        C15137b.m(parcel, 2, iBinderAsBinder, false);
        C15137b.c(parcel, 3, K0());
        C15137b.k(parcel, 4, q0());
        C15137b.c(parcel, 5, T());
        C15137b.k(parcel, 6, c0());
        C15137b.b(parcel, iA);
    }
}
