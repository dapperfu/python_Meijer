package com.google.android.gms.maps;

import Md.C4118k;
import Nd.C4190k;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.C6660q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.medallia.digital.mobilesdk.l3;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class GoogleMapOptions extends AbstractC15707a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new a();

    /* renamed from: u, reason: collision with root package name */
    private static final Integer f85582u = Integer.valueOf(Color.argb(l3.f93323c, 236, 233, 225));

    /* renamed from: a, reason: collision with root package name */
    private Boolean f85583a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f85584b;

    /* renamed from: c, reason: collision with root package name */
    private int f85585c;

    /* renamed from: d, reason: collision with root package name */
    private CameraPosition f85586d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f85587e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f85588f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f85589g;

    /* renamed from: h, reason: collision with root package name */
    private Boolean f85590h;

    /* renamed from: i, reason: collision with root package name */
    private Boolean f85591i;

    /* renamed from: j, reason: collision with root package name */
    private Boolean f85592j;

    /* renamed from: k, reason: collision with root package name */
    private Boolean f85593k;

    /* renamed from: l, reason: collision with root package name */
    private Boolean f85594l;

    /* renamed from: m, reason: collision with root package name */
    private Boolean f85595m;

    /* renamed from: n, reason: collision with root package name */
    private Float f85596n;

    /* renamed from: o, reason: collision with root package name */
    private Float f85597o;

    /* renamed from: p, reason: collision with root package name */
    private LatLngBounds f85598p;

    /* renamed from: q, reason: collision with root package name */
    private Boolean f85599q;

    /* renamed from: r, reason: collision with root package name */
    private Integer f85600r;

    /* renamed from: s, reason: collision with root package name */
    private String f85601s;

    /* renamed from: t, reason: collision with root package name */
    private int f85602t;

    public GoogleMapOptions() {
        this.f85585c = -1;
        this.f85596n = null;
        this.f85597o = null;
        this.f85598p = null;
        this.f85600r = null;
        this.f85601s = null;
    }

    public static LatLngBounds e4(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C4118k.f19769a);
        Float fValueOf = typedArrayObtainAttributes.hasValue(C4118k.f19781m) ? Float.valueOf(typedArrayObtainAttributes.getFloat(C4118k.f19781m, 0.0f)) : null;
        Float fValueOf2 = typedArrayObtainAttributes.hasValue(C4118k.f19782n) ? Float.valueOf(typedArrayObtainAttributes.getFloat(C4118k.f19782n, 0.0f)) : null;
        Float fValueOf3 = typedArrayObtainAttributes.hasValue(C4118k.f19779k) ? Float.valueOf(typedArrayObtainAttributes.getFloat(C4118k.f19779k, 0.0f)) : null;
        Float fValueOf4 = typedArrayObtainAttributes.hasValue(C4118k.f19780l) ? Float.valueOf(typedArrayObtainAttributes.getFloat(C4118k.f19780l, 0.0f)) : null;
        typedArrayObtainAttributes.recycle();
        if (fValueOf == null || fValueOf2 == null || fValueOf3 == null || fValueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng(fValueOf.floatValue(), fValueOf2.floatValue()), new LatLng(fValueOf3.floatValue(), fValueOf4.floatValue()));
    }

    public GoogleMapOptions L2(int i10) {
        this.f85602t = i10;
        return this;
    }

    public GoogleMapOptions N2(String str) {
        this.f85601s = str;
        return this;
    }

    public int P1() {
        return this.f85585c;
    }

    public GoogleMapOptions T(Integer num) {
        this.f85600r = num;
        return this;
    }

    public Integer U0() {
        return this.f85600r;
    }

    public GoogleMapOptions W2(int i10) {
        this.f85585c = i10;
        return this;
    }

    public Float a2() {
        return this.f85597o;
    }

    public GoogleMapOptions b0(CameraPosition cameraPosition) {
        this.f85586d = cameraPosition;
        return this;
    }

    public Float c2() {
        return this.f85596n;
    }

    public CameraPosition d1() {
        return this.f85586d;
    }

    public LatLngBounds h1() {
        return this.f85598p;
    }

    public int j1() {
        return this.f85602t;
    }

    public GoogleMapOptions j2(LatLngBounds latLngBounds) {
        this.f85598p = latLngBounds;
        return this;
    }

    public String y1() {
        return this.f85601s;
    }

    GoogleMapOptions(byte b10, byte b11, int i10, CameraPosition cameraPosition, byte b12, byte b13, byte b14, byte b15, byte b16, byte b17, byte b18, byte b19, byte b20, Float f10, Float f11, LatLngBounds latLngBounds, byte b21, Integer num, String str, int i11) {
        this.f85585c = -1;
        this.f85596n = null;
        this.f85597o = null;
        this.f85598p = null;
        this.f85600r = null;
        this.f85601s = null;
        this.f85583a = C4190k.b(b10);
        this.f85584b = C4190k.b(b11);
        this.f85585c = i10;
        this.f85586d = cameraPosition;
        this.f85587e = C4190k.b(b12);
        this.f85588f = C4190k.b(b13);
        this.f85589g = C4190k.b(b14);
        this.f85590h = C4190k.b(b15);
        this.f85591i = C4190k.b(b16);
        this.f85592j = C4190k.b(b17);
        this.f85593k = C4190k.b(b18);
        this.f85594l = C4190k.b(b19);
        this.f85595m = C4190k.b(b20);
        this.f85596n = f10;
        this.f85597o = f11;
        this.f85598p = latLngBounds;
        this.f85599q = C4190k.b(b21);
        this.f85600r = num;
        this.f85601s = str;
        this.f85602t = i11;
    }

    public static GoogleMapOptions I0(Context context, AttributeSet attributeSet) {
        String string;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C4118k.f19769a);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (typedArrayObtainAttributes.hasValue(C4118k.f19786r)) {
            googleMapOptions.W2(typedArrayObtainAttributes.getInt(C4118k.f19786r, -1));
        }
        if (typedArrayObtainAttributes.hasValue(C4118k.f19768B)) {
            googleMapOptions.a4(typedArrayObtainAttributes.getBoolean(C4118k.f19768B, false));
        }
        if (typedArrayObtainAttributes.hasValue(C4118k.f19767A)) {
            googleMapOptions.Z3(typedArrayObtainAttributes.getBoolean(C4118k.f19767A, false));
        }
        if (typedArrayObtainAttributes.hasValue(C4118k.f19787s)) {
            googleMapOptions.r0(typedArrayObtainAttributes.getBoolean(C4118k.f19787s, true));
        }
        if (typedArrayObtainAttributes.hasValue(C4118k.f19789u)) {
            googleMapOptions.V3(typedArrayObtainAttributes.getBoolean(C4118k.f19789u, true));
        }
        if (typedArrayObtainAttributes.hasValue(C4118k.f19791w)) {
            googleMapOptions.X3(typedArrayObtainAttributes.getBoolean(C4118k.f19791w, true));
        }
        if (typedArrayObtainAttributes.hasValue(C4118k.f19790v)) {
            googleMapOptions.W3(typedArrayObtainAttributes.getBoolean(C4118k.f19790v, true));
        }
        if (typedArrayObtainAttributes.hasValue(C4118k.f19792x)) {
            googleMapOptions.Y3(typedArrayObtainAttributes.getBoolean(C4118k.f19792x, true));
        }
        if (typedArrayObtainAttributes.hasValue(C4118k.f19794z)) {
            googleMapOptions.c4(typedArrayObtainAttributes.getBoolean(C4118k.f19794z, true));
        }
        if (typedArrayObtainAttributes.hasValue(C4118k.f19793y)) {
            googleMapOptions.b4(typedArrayObtainAttributes.getBoolean(C4118k.f19793y, true));
        }
        if (typedArrayObtainAttributes.hasValue(C4118k.f19783o)) {
            googleMapOptions.H2(typedArrayObtainAttributes.getBoolean(C4118k.f19783o, false));
        }
        if (typedArrayObtainAttributes.hasValue(C4118k.f19788t)) {
            googleMapOptions.U2(typedArrayObtainAttributes.getBoolean(C4118k.f19788t, true));
        }
        if (typedArrayObtainAttributes.hasValue(C4118k.f19770b)) {
            googleMapOptions.B(typedArrayObtainAttributes.getBoolean(C4118k.f19770b, false));
        }
        if (typedArrayObtainAttributes.hasValue(C4118k.f19774f)) {
            googleMapOptions.U3(typedArrayObtainAttributes.getFloat(C4118k.f19774f, Float.NEGATIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(C4118k.f19774f)) {
            googleMapOptions.A3(typedArrayObtainAttributes.getFloat(C4118k.f19773e, Float.POSITIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(C4118k.f19771c)) {
            googleMapOptions.T(Integer.valueOf(typedArrayObtainAttributes.getColor(C4118k.f19771c, f85582u.intValue())));
        }
        if (typedArrayObtainAttributes.hasValue(C4118k.f19785q) && (string = typedArrayObtainAttributes.getString(C4118k.f19785q)) != null && !string.isEmpty()) {
            googleMapOptions.N2(string);
        }
        if (typedArrayObtainAttributes.hasValue(C4118k.f19784p)) {
            googleMapOptions.L2(typedArrayObtainAttributes.getInt(C4118k.f19784p, 0));
        }
        googleMapOptions.j2(e4(context, attributeSet));
        googleMapOptions.b0(d4(context, attributeSet));
        typedArrayObtainAttributes.recycle();
        return googleMapOptions;
    }

    public static CameraPosition d4(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C4118k.f19769a);
        LatLng latLng = new LatLng(typedArrayObtainAttributes.hasValue(C4118k.f19775g) ? typedArrayObtainAttributes.getFloat(C4118k.f19775g, 0.0f) : 0.0f, typedArrayObtainAttributes.hasValue(C4118k.f19776h) ? typedArrayObtainAttributes.getFloat(C4118k.f19776h, 0.0f) : 0.0f);
        CameraPosition.a aVarB = CameraPosition.B();
        aVarB.c(latLng);
        if (typedArrayObtainAttributes.hasValue(C4118k.f19778j)) {
            aVarB.e(typedArrayObtainAttributes.getFloat(C4118k.f19778j, 0.0f));
        }
        if (typedArrayObtainAttributes.hasValue(C4118k.f19772d)) {
            aVarB.a(typedArrayObtainAttributes.getFloat(C4118k.f19772d, 0.0f));
        }
        if (typedArrayObtainAttributes.hasValue(C4118k.f19777i)) {
            aVarB.d(typedArrayObtainAttributes.getFloat(C4118k.f19777i, 0.0f));
        }
        typedArrayObtainAttributes.recycle();
        return aVarB.b();
    }

    public GoogleMapOptions A3(float f10) {
        this.f85597o = Float.valueOf(f10);
        return this;
    }

    public GoogleMapOptions B(boolean z10) {
        this.f85595m = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions H2(boolean z10) {
        this.f85593k = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions U2(boolean z10) {
        this.f85594l = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions U3(float f10) {
        this.f85596n = Float.valueOf(f10);
        return this;
    }

    public GoogleMapOptions V3(boolean z10) {
        this.f85592j = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions W3(boolean z10) {
        this.f85589g = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions X3(boolean z10) {
        this.f85599q = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions Y3(boolean z10) {
        this.f85591i = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions Z3(boolean z10) {
        this.f85584b = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions a4(boolean z10) {
        this.f85583a = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions b4(boolean z10) {
        this.f85587e = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions c4(boolean z10) {
        this.f85590h = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions r0(boolean z10) {
        this.f85588f = Boolean.valueOf(z10);
        return this;
    }

    public String toString() {
        return C6660q.c(this).a("MapType", Integer.valueOf(this.f85585c)).a("LiteMode", this.f85593k).a("Camera", this.f85586d).a("CompassEnabled", this.f85588f).a("ZoomControlsEnabled", this.f85587e).a("ScrollGesturesEnabled", this.f85589g).a("ZoomGesturesEnabled", this.f85590h).a("TiltGesturesEnabled", this.f85591i).a("RotateGesturesEnabled", this.f85592j).a("ScrollGesturesEnabledDuringRotateOrZoom", this.f85599q).a("MapToolbarEnabled", this.f85594l).a("AmbientEnabled", this.f85595m).a("MinZoomPreference", this.f85596n).a("MaxZoomPreference", this.f85597o).a("BackgroundColor", this.f85600r).a("LatLngBoundsForCameraTarget", this.f85598p).a("ZOrderOnTop", this.f85583a).a("UseViewLifecycleInFragment", this.f85584b).a("mapColorScheme", Integer.valueOf(this.f85602t)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.f(parcel, 2, C4190k.a(this.f85583a));
        C15708b.f(parcel, 3, C4190k.a(this.f85584b));
        C15708b.n(parcel, 4, P1());
        C15708b.u(parcel, 5, d1(), i10, false);
        C15708b.f(parcel, 6, C4190k.a(this.f85587e));
        C15708b.f(parcel, 7, C4190k.a(this.f85588f));
        C15708b.f(parcel, 8, C4190k.a(this.f85589g));
        C15708b.f(parcel, 9, C4190k.a(this.f85590h));
        C15708b.f(parcel, 10, C4190k.a(this.f85591i));
        C15708b.f(parcel, 11, C4190k.a(this.f85592j));
        C15708b.f(parcel, 12, C4190k.a(this.f85593k));
        C15708b.f(parcel, 14, C4190k.a(this.f85594l));
        C15708b.f(parcel, 15, C4190k.a(this.f85595m));
        C15708b.l(parcel, 16, c2(), false);
        C15708b.l(parcel, 17, a2(), false);
        C15708b.u(parcel, 18, h1(), i10, false);
        C15708b.f(parcel, 19, C4190k.a(this.f85599q));
        C15708b.q(parcel, 20, U0(), false);
        C15708b.w(parcel, 21, y1(), false);
        C15708b.n(parcel, 23, j1());
        C15708b.b(parcel, iA);
    }
}
