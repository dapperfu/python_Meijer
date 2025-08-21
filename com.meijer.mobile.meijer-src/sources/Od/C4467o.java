package Od;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.maps.model.LatLng;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Od.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4467o extends AbstractC15707a {
    public static final Parcelable.Creator<C4467o> CREATOR = new c0();

    /* renamed from: a, reason: collision with root package name */
    private LatLng f23631a;

    /* renamed from: b, reason: collision with root package name */
    private String f23632b;

    /* renamed from: c, reason: collision with root package name */
    private String f23633c;

    /* renamed from: d, reason: collision with root package name */
    private C4455c f23634d;

    /* renamed from: e, reason: collision with root package name */
    private float f23635e;

    /* renamed from: f, reason: collision with root package name */
    private float f23636f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f23637g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f23638h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f23639i;

    /* renamed from: j, reason: collision with root package name */
    private float f23640j;

    /* renamed from: k, reason: collision with root package name */
    private float f23641k;

    /* renamed from: l, reason: collision with root package name */
    private float f23642l;

    /* renamed from: m, reason: collision with root package name */
    private float f23643m;

    /* renamed from: n, reason: collision with root package name */
    private float f23644n;

    /* renamed from: o, reason: collision with root package name */
    private int f23645o;

    /* renamed from: p, reason: collision with root package name */
    private View f23646p;

    /* renamed from: q, reason: collision with root package name */
    private int f23647q;

    /* renamed from: r, reason: collision with root package name */
    private String f23648r;

    /* renamed from: s, reason: collision with root package name */
    private float f23649s;

    public C4467o() {
        this.f23635e = 0.5f;
        this.f23636f = 1.0f;
        this.f23638h = true;
        this.f23639i = false;
        this.f23640j = 0.0f;
        this.f23641k = 0.5f;
        this.f23642l = 0.0f;
        this.f23643m = 1.0f;
        this.f23645o = 0;
    }

    public final C4467o d4(int i10) {
        this.f23647q = 1;
        return this;
    }

    C4467o(LatLng latLng, String str, String str2, IBinder iBinder, float f10, float f11, boolean z10, boolean z11, boolean z12, float f12, float f13, float f14, float f15, float f16, int i10, IBinder iBinder2, int i11, String str3, float f17) {
        this.f23635e = 0.5f;
        this.f23636f = 1.0f;
        this.f23638h = true;
        this.f23639i = false;
        this.f23640j = 0.0f;
        this.f23641k = 0.5f;
        this.f23642l = 0.0f;
        this.f23643m = 1.0f;
        this.f23645o = 0;
        this.f23631a = latLng;
        this.f23632b = str;
        this.f23633c = str2;
        if (iBinder == null) {
            this.f23634d = null;
        } else {
            this.f23634d = new C4455c(b.a.a2(iBinder));
        }
        this.f23635e = f10;
        this.f23636f = f11;
        this.f23637g = z10;
        this.f23638h = z11;
        this.f23639i = z12;
        this.f23640j = f12;
        this.f23641k = f13;
        this.f23642l = f14;
        this.f23643m = f15;
        this.f23644n = f16;
        this.f23647q = i11;
        this.f23645o = i10;
        com.google.android.gms.dynamic.b bVarA2 = b.a.a2(iBinder2);
        this.f23646p = bVarA2 != null ? (View) com.google.android.gms.dynamic.d.c2(bVarA2) : null;
        this.f23648r = str3;
        this.f23649s = f17;
    }

    public boolean A3() {
        return this.f23638h;
    }

    public C4467o B(float f10) {
        this.f23643m = f10;
        return this;
    }

    public float H2() {
        return this.f23644n;
    }

    public C4467o I0(boolean z10) {
        this.f23639i = z10;
        return this;
    }

    public C4467o L2(C4455c c4455c) {
        this.f23634d = c4455c;
        return this;
    }

    public C4467o N2(float f10, float f11) {
        this.f23641k = f10;
        this.f23642l = f11;
        return this;
    }

    public float P1() {
        return this.f23642l;
    }

    public C4467o T(float f10, float f11) {
        this.f23635e = f10;
        this.f23636f = f11;
        return this;
    }

    public float U0() {
        return this.f23643m;
    }

    public boolean U2() {
        return this.f23637g;
    }

    public C4467o U3(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        this.f23631a = latLng;
        return this;
    }

    public C4467o V3(float f10) {
        this.f23640j = f10;
        return this;
    }

    public boolean W2() {
        return this.f23639i;
    }

    public C4467o W3(String str) {
        this.f23633c = str;
        return this;
    }

    public C4467o X3(String str) {
        this.f23632b = str;
        return this;
    }

    public C4467o Y3(boolean z10) {
        this.f23638h = z10;
        return this;
    }

    public C4467o Z3(float f10) {
        this.f23644n = f10;
        return this;
    }

    public LatLng a2() {
        return this.f23631a;
    }

    public final int a4() {
        return this.f23647q;
    }

    public C4467o b0(String str) {
        this.f23648r = str;
        return this;
    }

    public final C4467o b4(int i10) {
        this.f23645o = i10;
        return this;
    }

    public float c2() {
        return this.f23640j;
    }

    public final C4467o c4(View view) {
        this.f23646p = view;
        return this;
    }

    public float d1() {
        return this.f23635e;
    }

    public String getTitle() {
        return this.f23632b;
    }

    public float h1() {
        return this.f23636f;
    }

    public C4455c j1() {
        return this.f23634d;
    }

    public String j2() {
        return this.f23633c;
    }

    public C4467o r0(boolean z10) {
        this.f23637g = z10;
        return this;
    }

    public float y1() {
        return this.f23641k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        IBinder iBinderAsBinder;
        int iA = C15708b.a(parcel);
        C15708b.u(parcel, 2, a2(), i10, false);
        C15708b.w(parcel, 3, getTitle(), false);
        C15708b.w(parcel, 4, j2(), false);
        C4455c c4455c = this.f23634d;
        if (c4455c == null) {
            iBinderAsBinder = null;
        } else {
            iBinderAsBinder = c4455c.a().asBinder();
        }
        C15708b.m(parcel, 5, iBinderAsBinder, false);
        C15708b.k(parcel, 6, d1());
        C15708b.k(parcel, 7, h1());
        C15708b.c(parcel, 8, U2());
        C15708b.c(parcel, 9, A3());
        C15708b.c(parcel, 10, W2());
        C15708b.k(parcel, 11, c2());
        C15708b.k(parcel, 12, y1());
        C15708b.k(parcel, 13, P1());
        C15708b.k(parcel, 14, U0());
        C15708b.k(parcel, 15, H2());
        C15708b.n(parcel, 17, this.f23645o);
        C15708b.m(parcel, 18, com.google.android.gms.dynamic.d.I2(this.f23646p).asBinder(), false);
        C15708b.n(parcel, 19, this.f23647q);
        C15708b.w(parcel, 20, this.f23648r, false);
        C15708b.k(parcel, 21, this.f23649s);
        C15708b.b(parcel, iA);
    }
}
