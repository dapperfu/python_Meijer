package Od;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class G extends AbstractC15707a {
    public static final Parcelable.Creator<G> CREATOR = new S();

    /* renamed from: a, reason: collision with root package name */
    private Dd.q f23581a;

    /* renamed from: b, reason: collision with root package name */
    private H f23582b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f23583c;

    /* renamed from: d, reason: collision with root package name */
    private float f23584d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f23585e;

    /* renamed from: f, reason: collision with root package name */
    private float f23586f;

    public G() {
        this.f23583c = true;
        this.f23585e = true;
        this.f23586f = 0.0f;
    }

    public G d1(float f10) {
        boolean z10 = false;
        if (f10 >= 0.0f && f10 <= 1.0f) {
            z10 = true;
        }
        com.google.android.gms.common.internal.r.b(z10, "Transparency must be in the range [0..1]");
        this.f23586f = f10;
        return this;
    }

    G(IBinder iBinder, boolean z10, float f10, boolean z11, float f11) {
        this.f23583c = true;
        this.f23585e = true;
        this.f23586f = 0.0f;
        Dd.q qVarA2 = Dd.p.a2(iBinder);
        this.f23581a = qVarA2;
        this.f23582b = qVarA2 == null ? null : new P(this);
        this.f23583c = z10;
        this.f23584d = f10;
        this.f23585e = z11;
        this.f23586f = f11;
    }

    public G B(boolean z10) {
        this.f23585e = z10;
        return this;
    }

    public boolean I0() {
        return this.f23583c;
    }

    public boolean T() {
        return this.f23585e;
    }

    public G U0(H h10) {
        this.f23582b = (H) com.google.android.gms.common.internal.r.m(h10, "tileProvider must not be null.");
        this.f23581a = new Q(this, h10);
        return this;
    }

    public float b0() {
        return this.f23586f;
    }

    public G h1(boolean z10) {
        this.f23583c = z10;
        return this;
    }

    public G j1(float f10) {
        this.f23584d = f10;
        return this;
    }

    public float r0() {
        return this.f23584d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        IBinder iBinderAsBinder;
        int iA = C15708b.a(parcel);
        Dd.q qVar = this.f23581a;
        if (qVar == null) {
            iBinderAsBinder = null;
        } else {
            iBinderAsBinder = qVar.asBinder();
        }
        C15708b.m(parcel, 2, iBinderAsBinder, false);
        C15708b.c(parcel, 3, I0());
        C15708b.k(parcel, 4, r0());
        C15708b.c(parcel, 5, T());
        C15708b.k(parcel, 6, b0());
        C15708b.b(parcel, iA);
    }
}
