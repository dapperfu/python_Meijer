package Od;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Od.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4463k extends AbstractC15707a {
    public static final Parcelable.Creator<C4463k> CREATOR = new X();

    /* renamed from: a, reason: collision with root package name */
    private C4455c f23616a;

    /* renamed from: b, reason: collision with root package name */
    private LatLng f23617b;

    /* renamed from: c, reason: collision with root package name */
    private float f23618c;

    /* renamed from: d, reason: collision with root package name */
    private float f23619d;

    /* renamed from: e, reason: collision with root package name */
    private LatLngBounds f23620e;

    /* renamed from: f, reason: collision with root package name */
    private float f23621f;

    /* renamed from: g, reason: collision with root package name */
    private float f23622g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f23623h;

    /* renamed from: i, reason: collision with root package name */
    private float f23624i;

    /* renamed from: j, reason: collision with root package name */
    private float f23625j;

    /* renamed from: k, reason: collision with root package name */
    private float f23626k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f23627l;

    public C4463k() {
        this.f23623h = true;
        this.f23624i = 0.0f;
        this.f23625j = 0.5f;
        this.f23626k = 0.5f;
        this.f23627l = false;
    }

    public C4463k W2(float f10) {
        boolean z10 = false;
        if (f10 >= 0.0f && f10 <= 1.0f) {
            z10 = true;
        }
        com.google.android.gms.common.internal.r.b(z10, "Transparency must be in the range [0..1]");
        this.f23624i = f10;
        return this;
    }

    C4463k(IBinder iBinder, LatLng latLng, float f10, float f11, LatLngBounds latLngBounds, float f12, float f13, boolean z10, float f14, float f15, float f16, boolean z11) {
        this.f23623h = true;
        this.f23624i = 0.0f;
        this.f23625j = 0.5f;
        this.f23626k = 0.5f;
        this.f23627l = false;
        this.f23616a = new C4455c(b.a.a2(iBinder));
        this.f23617b = latLng;
        this.f23618c = f10;
        this.f23619d = f11;
        this.f23620e = latLngBounds;
        this.f23621f = f12;
        this.f23622g = f13;
        this.f23623h = z10;
        this.f23624i = f14;
        this.f23625j = f15;
        this.f23626k = f16;
        this.f23627l = z11;
    }

    private final C4463k V3(LatLng latLng, float f10, float f11) {
        this.f23617b = latLng;
        this.f23618c = f10;
        this.f23619d = f11;
        return this;
    }

    public C4463k A3(boolean z10) {
        this.f23623h = z10;
        return this;
    }

    public C4463k B(float f10, float f11) {
        this.f23625j = f10;
        this.f23626k = f11;
        return this;
    }

    public boolean H2() {
        return this.f23623h;
    }

    public float I0() {
        return this.f23626k;
    }

    public C4463k L2(LatLng latLng, float f10) {
        com.google.android.gms.common.internal.r.q(this.f23620e == null, "Position has already been set using positionFromBounds");
        com.google.android.gms.common.internal.r.b(latLng != null, "Location must be specified");
        com.google.android.gms.common.internal.r.b(f10 >= 0.0f, "Width must be non-negative");
        V3(latLng, f10, -1.0f);
        return this;
    }

    public C4463k N2(LatLng latLng, float f10, float f11) {
        com.google.android.gms.common.internal.r.q(this.f23620e == null, "Position has already been set using positionFromBounds");
        com.google.android.gms.common.internal.r.b(latLng != null, "Location must be specified");
        com.google.android.gms.common.internal.r.b(f10 >= 0.0f, "Width must be non-negative");
        com.google.android.gms.common.internal.r.b(f11 >= 0.0f, "Height must be non-negative");
        V3(latLng, f10, f11);
        return this;
    }

    public float P1() {
        return this.f23618c;
    }

    public C4463k T(float f10) {
        this.f23621f = ((f10 % 360.0f) + 360.0f) % 360.0f;
        return this;
    }

    public float U0() {
        return this.f23621f;
    }

    public C4463k U2(LatLngBounds latLngBounds) {
        LatLng latLng = this.f23617b;
        com.google.android.gms.common.internal.r.q(latLng == null, "Position has already been set using position: ".concat(String.valueOf(latLng)));
        this.f23620e = latLngBounds;
        return this;
    }

    public C4463k U3(float f10) {
        this.f23622g = f10;
        return this;
    }

    public float a2() {
        return this.f23622g;
    }

    public C4463k b0(boolean z10) {
        this.f23627l = z10;
        return this;
    }

    public C4463k c2(C4455c c4455c) {
        com.google.android.gms.common.internal.r.m(c4455c, "imageDescriptor must not be null");
        this.f23616a = c4455c;
        return this;
    }

    public LatLngBounds d1() {
        return this.f23620e;
    }

    public float h1() {
        return this.f23619d;
    }

    public LatLng j1() {
        return this.f23617b;
    }

    public boolean j2() {
        return this.f23627l;
    }

    public float r0() {
        return this.f23625j;
    }

    public float y1() {
        return this.f23624i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.m(parcel, 2, this.f23616a.a().asBinder(), false);
        C15708b.u(parcel, 3, j1(), i10, false);
        C15708b.k(parcel, 4, P1());
        C15708b.k(parcel, 5, h1());
        C15708b.u(parcel, 6, d1(), i10, false);
        C15708b.k(parcel, 7, U0());
        C15708b.k(parcel, 8, a2());
        C15708b.c(parcel, 9, H2());
        C15708b.k(parcel, 10, y1());
        C15708b.k(parcel, 11, r0());
        C15708b.k(parcel, 12, I0());
        C15708b.c(parcel, 13, j2());
        C15708b.b(parcel, iA);
    }
}
