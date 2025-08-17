package Md;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Md.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4185k extends AbstractC15136a {
    public static final Parcelable.Creator<C4185k> CREATOR = new X();

    /* renamed from: a, reason: collision with root package name */
    private C4177c f19429a;

    /* renamed from: b, reason: collision with root package name */
    private LatLng f19430b;

    /* renamed from: c, reason: collision with root package name */
    private float f19431c;

    /* renamed from: d, reason: collision with root package name */
    private float f19432d;

    /* renamed from: e, reason: collision with root package name */
    private LatLngBounds f19433e;

    /* renamed from: f, reason: collision with root package name */
    private float f19434f;

    /* renamed from: g, reason: collision with root package name */
    private float f19435g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f19436h;

    /* renamed from: i, reason: collision with root package name */
    private float f19437i;

    /* renamed from: j, reason: collision with root package name */
    private float f19438j;

    /* renamed from: k, reason: collision with root package name */
    private float f19439k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f19440l;

    public C4185k() {
        this.f19436h = true;
        this.f19437i = 0.0f;
        this.f19438j = 0.5f;
        this.f19439k = 0.5f;
        this.f19440l = false;
    }

    public C4185k W2(float f10) {
        boolean z10 = false;
        if (f10 >= 0.0f && f10 <= 1.0f) {
            z10 = true;
        }
        com.google.android.gms.common.internal.r.b(z10, "Transparency must be in the range [0..1]");
        this.f19437i = f10;
        return this;
    }

    C4185k(IBinder iBinder, LatLng latLng, float f10, float f11, LatLngBounds latLngBounds, float f12, float f13, boolean z10, float f14, float f15, float f16, boolean z11) {
        this.f19436h = true;
        this.f19437i = 0.0f;
        this.f19438j = 0.5f;
        this.f19439k = 0.5f;
        this.f19440l = false;
        this.f19429a = new C4177c(b.a.a2(iBinder));
        this.f19430b = latLng;
        this.f19431c = f10;
        this.f19432d = f11;
        this.f19433e = latLngBounds;
        this.f19434f = f12;
        this.f19435g = f13;
        this.f19436h = z10;
        this.f19437i = f14;
        this.f19438j = f15;
        this.f19439k = f16;
        this.f19440l = z11;
    }

    private final C4185k V3(LatLng latLng, float f10, float f11) {
        this.f19430b = latLng;
        this.f19431c = f10;
        this.f19432d = f11;
        return this;
    }

    public C4185k B(float f10, float f11) {
        this.f19438j = f10;
        this.f19439k = f11;
        return this;
    }

    public C4185k B3(boolean z10) {
        this.f19436h = z10;
        return this;
    }

    public boolean J2() {
        return this.f19436h;
    }

    public float K0() {
        return this.f19439k;
    }

    public C4185k M2(LatLng latLng, float f10) {
        com.google.android.gms.common.internal.r.q(this.f19433e == null, "Position has already been set using positionFromBounds");
        com.google.android.gms.common.internal.r.b(latLng != null, "Location must be specified");
        com.google.android.gms.common.internal.r.b(f10 >= 0.0f, "Width must be non-negative");
        V3(latLng, f10, -1.0f);
        return this;
    }

    public C4185k O2(LatLng latLng, float f10, float f11) {
        com.google.android.gms.common.internal.r.q(this.f19433e == null, "Position has already been set using positionFromBounds");
        com.google.android.gms.common.internal.r.b(latLng != null, "Location must be specified");
        com.google.android.gms.common.internal.r.b(f10 >= 0.0f, "Width must be non-negative");
        com.google.android.gms.common.internal.r.b(f11 >= 0.0f, "Height must be non-negative");
        V3(latLng, f10, f11);
        return this;
    }

    public float P1() {
        return this.f19437i;
    }

    public C4185k T(float f10) {
        this.f19434f = ((f10 % 360.0f) + 360.0f) % 360.0f;
        return this;
    }

    public C4185k T2(LatLngBounds latLngBounds) {
        LatLng latLng = this.f19430b;
        com.google.android.gms.common.internal.r.q(latLng == null, "Position has already been set using position: ".concat(String.valueOf(latLng)));
        this.f19433e = latLngBounds;
        return this;
    }

    public C4185k U3(float f10) {
        this.f19435g = f10;
        return this;
    }

    public float W0() {
        return this.f19434f;
    }

    public float a2() {
        return this.f19431c;
    }

    public float b2() {
        return this.f19435g;
    }

    public C4185k c0(boolean z10) {
        this.f19440l = z10;
        return this;
    }

    public LatLngBounds d1() {
        return this.f19433e;
    }

    public C4185k d2(C4177c c4177c) {
        com.google.android.gms.common.internal.r.m(c4177c, "imageDescriptor must not be null");
        this.f19429a = c4177c;
        return this;
    }

    public float g1() {
        return this.f19432d;
    }

    public LatLng i1() {
        return this.f19430b;
    }

    public boolean l2() {
        return this.f19440l;
    }

    public float q0() {
        return this.f19438j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.m(parcel, 2, this.f19429a.a().asBinder(), false);
        C15137b.u(parcel, 3, i1(), i10, false);
        C15137b.k(parcel, 4, a2());
        C15137b.k(parcel, 5, g1());
        C15137b.u(parcel, 6, d1(), i10, false);
        C15137b.k(parcel, 7, W0());
        C15137b.k(parcel, 8, b2());
        C15137b.c(parcel, 9, J2());
        C15137b.k(parcel, 10, P1());
        C15137b.k(parcel, 11, q0());
        C15137b.k(parcel, 12, K0());
        C15137b.c(parcel, 13, l2());
        C15137b.b(parcel, iA);
    }
}
