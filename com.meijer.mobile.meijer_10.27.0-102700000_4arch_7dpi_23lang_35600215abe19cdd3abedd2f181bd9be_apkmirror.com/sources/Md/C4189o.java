package Md;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.maps.model.LatLng;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Md.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4189o extends AbstractC15136a {
    public static final Parcelable.Creator<C4189o> CREATOR = new c0();

    /* renamed from: a, reason: collision with root package name */
    private LatLng f19444a;

    /* renamed from: b, reason: collision with root package name */
    private String f19445b;

    /* renamed from: c, reason: collision with root package name */
    private String f19446c;

    /* renamed from: d, reason: collision with root package name */
    private C4177c f19447d;

    /* renamed from: e, reason: collision with root package name */
    private float f19448e;

    /* renamed from: f, reason: collision with root package name */
    private float f19449f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f19450g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f19451h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f19452i;

    /* renamed from: j, reason: collision with root package name */
    private float f19453j;

    /* renamed from: k, reason: collision with root package name */
    private float f19454k;

    /* renamed from: l, reason: collision with root package name */
    private float f19455l;

    /* renamed from: m, reason: collision with root package name */
    private float f19456m;

    /* renamed from: n, reason: collision with root package name */
    private float f19457n;

    /* renamed from: o, reason: collision with root package name */
    private int f19458o;

    /* renamed from: p, reason: collision with root package name */
    private View f19459p;

    /* renamed from: q, reason: collision with root package name */
    private int f19460q;

    /* renamed from: r, reason: collision with root package name */
    private String f19461r;

    /* renamed from: s, reason: collision with root package name */
    private float f19462s;

    public C4189o() {
        this.f19448e = 0.5f;
        this.f19449f = 1.0f;
        this.f19451h = true;
        this.f19452i = false;
        this.f19453j = 0.0f;
        this.f19454k = 0.5f;
        this.f19455l = 0.0f;
        this.f19456m = 1.0f;
        this.f19458o = 0;
    }

    public final C4189o d4(int i10) {
        this.f19460q = 1;
        return this;
    }

    C4189o(LatLng latLng, String str, String str2, IBinder iBinder, float f10, float f11, boolean z10, boolean z11, boolean z12, float f12, float f13, float f14, float f15, float f16, int i10, IBinder iBinder2, int i11, String str3, float f17) {
        this.f19448e = 0.5f;
        this.f19449f = 1.0f;
        this.f19451h = true;
        this.f19452i = false;
        this.f19453j = 0.0f;
        this.f19454k = 0.5f;
        this.f19455l = 0.0f;
        this.f19456m = 1.0f;
        this.f19458o = 0;
        this.f19444a = latLng;
        this.f19445b = str;
        this.f19446c = str2;
        if (iBinder == null) {
            this.f19447d = null;
        } else {
            this.f19447d = new C4177c(b.a.a2(iBinder));
        }
        this.f19448e = f10;
        this.f19449f = f11;
        this.f19450g = z10;
        this.f19451h = z11;
        this.f19452i = z12;
        this.f19453j = f12;
        this.f19454k = f13;
        this.f19455l = f14;
        this.f19456m = f15;
        this.f19457n = f16;
        this.f19460q = i11;
        this.f19458o = i10;
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(iBinder2);
        this.f19459p = bVarA2 != null ? (View) com.google.android.gms.dynamic.d.b2(bVarA2) : null;
        this.f19461r = str3;
        this.f19462s = f17;
    }

    public C4189o B(float f10) {
        this.f19456m = f10;
        return this;
    }

    public boolean B3() {
        return this.f19451h;
    }

    public float J2() {
        return this.f19457n;
    }

    public C4189o K0(boolean z10) {
        this.f19452i = z10;
        return this;
    }

    public C4189o M2(C4177c c4177c) {
        this.f19447d = c4177c;
        return this;
    }

    public C4189o O2(float f10, float f11) {
        this.f19454k = f10;
        this.f19455l = f11;
        return this;
    }

    public float P1() {
        return this.f19454k;
    }

    public C4189o T(float f10, float f11) {
        this.f19448e = f10;
        this.f19449f = f11;
        return this;
    }

    public boolean T2() {
        return this.f19450g;
    }

    public C4189o U3(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        this.f19444a = latLng;
        return this;
    }

    public C4189o V3(float f10) {
        this.f19453j = f10;
        return this;
    }

    public float W0() {
        return this.f19456m;
    }

    public boolean W2() {
        return this.f19452i;
    }

    public C4189o W3(String str) {
        this.f19446c = str;
        return this;
    }

    public C4189o X3(String str) {
        this.f19445b = str;
        return this;
    }

    public C4189o Y3(boolean z10) {
        this.f19451h = z10;
        return this;
    }

    public C4189o Z3(float f10) {
        this.f19457n = f10;
        return this;
    }

    public float a2() {
        return this.f19455l;
    }

    public final int a4() {
        return this.f19460q;
    }

    public LatLng b2() {
        return this.f19444a;
    }

    public final C4189o b4(int i10) {
        this.f19458o = i10;
        return this;
    }

    public C4189o c0(String str) {
        this.f19461r = str;
        return this;
    }

    public final C4189o c4(View view) {
        this.f19459p = view;
        return this;
    }

    public float d1() {
        return this.f19448e;
    }

    public float d2() {
        return this.f19453j;
    }

    public float g1() {
        return this.f19449f;
    }

    public String getTitle() {
        return this.f19445b;
    }

    public C4177c i1() {
        return this.f19447d;
    }

    public String l2() {
        return this.f19446c;
    }

    public C4189o q0(boolean z10) {
        this.f19450g = z10;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        IBinder iBinderAsBinder;
        int iA = C15137b.a(parcel);
        C15137b.u(parcel, 2, b2(), i10, false);
        C15137b.w(parcel, 3, getTitle(), false);
        C15137b.w(parcel, 4, l2(), false);
        C4177c c4177c = this.f19447d;
        if (c4177c == null) {
            iBinderAsBinder = null;
        } else {
            iBinderAsBinder = c4177c.a().asBinder();
        }
        C15137b.m(parcel, 5, iBinderAsBinder, false);
        C15137b.k(parcel, 6, d1());
        C15137b.k(parcel, 7, g1());
        C15137b.c(parcel, 8, T2());
        C15137b.c(parcel, 9, B3());
        C15137b.c(parcel, 10, W2());
        C15137b.k(parcel, 11, d2());
        C15137b.k(parcel, 12, P1());
        C15137b.k(parcel, 13, a2());
        C15137b.k(parcel, 14, W0());
        C15137b.k(parcel, 15, J2());
        C15137b.n(parcel, 17, this.f19458o);
        C15137b.m(parcel, 18, com.google.android.gms.dynamic.d.F2(this.f19459p).asBinder(), false);
        C15137b.n(parcel, 19, this.f19460q);
        C15137b.w(parcel, 20, this.f19461r, false);
        C15137b.k(parcel, 21, this.f19462s);
        C15137b.b(parcel, iA);
    }
}
