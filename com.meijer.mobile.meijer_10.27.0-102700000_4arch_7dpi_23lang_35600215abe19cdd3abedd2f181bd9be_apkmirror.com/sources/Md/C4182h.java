package Md;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Md.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4182h extends AbstractC15136a {
    public static final Parcelable.Creator<C4182h> CREATOR = new V();

    /* renamed from: a, reason: collision with root package name */
    private LatLng f19417a;

    /* renamed from: b, reason: collision with root package name */
    private double f19418b;

    /* renamed from: c, reason: collision with root package name */
    private float f19419c;

    /* renamed from: d, reason: collision with root package name */
    private int f19420d;

    /* renamed from: e, reason: collision with root package name */
    private int f19421e;

    /* renamed from: f, reason: collision with root package name */
    private float f19422f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f19423g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f19424h;

    /* renamed from: i, reason: collision with root package name */
    private List f19425i;

    public C4182h() {
        this.f19417a = null;
        this.f19418b = 0.0d;
        this.f19419c = 10.0f;
        this.f19420d = -16777216;
        this.f19421e = 0;
        this.f19422f = 0.0f;
        this.f19423g = true;
        this.f19424h = false;
        this.f19425i = null;
    }

    C4182h(LatLng latLng, double d10, float f10, int i10, int i11, float f11, boolean z10, boolean z11, List list) {
        this.f19417a = latLng;
        this.f19418b = d10;
        this.f19419c = f10;
        this.f19420d = i10;
        this.f19421e = i11;
        this.f19422f = f11;
        this.f19423g = z10;
        this.f19424h = z11;
        this.f19425i = list;
    }

    public C4182h B(LatLng latLng) {
        com.google.android.gms.common.internal.r.m(latLng, "center must not be null.");
        this.f19417a = latLng;
        return this;
    }

    public C4182h J2(List<C4190p> list) {
        this.f19425i = list;
        return this;
    }

    public int K0() {
        return this.f19421e;
    }

    public C4182h M2(float f10) {
        this.f19419c = f10;
        return this;
    }

    public C4182h O2(boolean z10) {
        this.f19423g = z10;
        return this;
    }

    public float P1() {
        return this.f19422f;
    }

    public C4182h T(boolean z10) {
        this.f19424h = z10;
        return this;
    }

    public C4182h T2(float f10) {
        this.f19422f = f10;
        return this;
    }

    public double W0() {
        return this.f19418b;
    }

    public boolean a2() {
        return this.f19424h;
    }

    public boolean b2() {
        return this.f19423g;
    }

    public C4182h c0(int i10) {
        this.f19421e = i10;
        return this;
    }

    public int d1() {
        return this.f19420d;
    }

    public C4182h d2(double d10) {
        this.f19418b = d10;
        return this;
    }

    public List<C4190p> g1() {
        return this.f19425i;
    }

    public float i1() {
        return this.f19419c;
    }

    public C4182h l2(int i10) {
        this.f19420d = i10;
        return this;
    }

    public LatLng q0() {
        return this.f19417a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.u(parcel, 2, q0(), i10, false);
        C15137b.i(parcel, 3, W0());
        C15137b.k(parcel, 4, i1());
        C15137b.n(parcel, 5, d1());
        C15137b.n(parcel, 6, K0());
        C15137b.k(parcel, 7, P1());
        C15137b.c(parcel, 8, b2());
        C15137b.c(parcel, 9, a2());
        C15137b.A(parcel, 10, g1(), false);
        C15137b.b(parcel, iA);
    }
}
