package com.google.android.gms.maps;

import Kd.C3953k;
import Ld.C4058k;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.C6535q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.medallia.digital.mobilesdk.l3;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class GoogleMapOptions extends AbstractC15136a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new a();

    /* renamed from: u, reason: collision with root package name */
    private static final Integer f84742u = Integer.valueOf(Color.argb(l3.f92484c, 236, 233, 225));

    /* renamed from: a, reason: collision with root package name */
    private Boolean f84743a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f84744b;

    /* renamed from: c, reason: collision with root package name */
    private int f84745c;

    /* renamed from: d, reason: collision with root package name */
    private CameraPosition f84746d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f84747e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f84748f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f84749g;

    /* renamed from: h, reason: collision with root package name */
    private Boolean f84750h;

    /* renamed from: i, reason: collision with root package name */
    private Boolean f84751i;

    /* renamed from: j, reason: collision with root package name */
    private Boolean f84752j;

    /* renamed from: k, reason: collision with root package name */
    private Boolean f84753k;

    /* renamed from: l, reason: collision with root package name */
    private Boolean f84754l;

    /* renamed from: m, reason: collision with root package name */
    private Boolean f84755m;

    /* renamed from: n, reason: collision with root package name */
    private Float f84756n;

    /* renamed from: o, reason: collision with root package name */
    private Float f84757o;

    /* renamed from: p, reason: collision with root package name */
    private LatLngBounds f84758p;

    /* renamed from: q, reason: collision with root package name */
    private Boolean f84759q;

    /* renamed from: r, reason: collision with root package name */
    private Integer f84760r;

    /* renamed from: s, reason: collision with root package name */
    private String f84761s;

    /* renamed from: t, reason: collision with root package name */
    private int f84762t;

    public GoogleMapOptions() {
        this.f84745c = -1;
        this.f84756n = null;
        this.f84757o = null;
        this.f84758p = null;
        this.f84760r = null;
        this.f84761s = null;
    }

    public static LatLngBounds e4(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C3953k.f16410a);
        Float fValueOf = typedArrayObtainAttributes.hasValue(C3953k.f16422m) ? Float.valueOf(typedArrayObtainAttributes.getFloat(C3953k.f16422m, 0.0f)) : null;
        Float fValueOf2 = typedArrayObtainAttributes.hasValue(C3953k.f16423n) ? Float.valueOf(typedArrayObtainAttributes.getFloat(C3953k.f16423n, 0.0f)) : null;
        Float fValueOf3 = typedArrayObtainAttributes.hasValue(C3953k.f16420k) ? Float.valueOf(typedArrayObtainAttributes.getFloat(C3953k.f16420k, 0.0f)) : null;
        Float fValueOf4 = typedArrayObtainAttributes.hasValue(C3953k.f16421l) ? Float.valueOf(typedArrayObtainAttributes.getFloat(C3953k.f16421l, 0.0f)) : null;
        typedArrayObtainAttributes.recycle();
        if (fValueOf == null || fValueOf2 == null || fValueOf3 == null || fValueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng(fValueOf.floatValue(), fValueOf2.floatValue()), new LatLng(fValueOf3.floatValue(), fValueOf4.floatValue()));
    }

    public GoogleMapOptions M2(int i10) {
        this.f84762t = i10;
        return this;
    }

    public GoogleMapOptions O2(String str) {
        this.f84761s = str;
        return this;
    }

    public String P1() {
        return this.f84761s;
    }

    public GoogleMapOptions T(Integer num) {
        this.f84760r = num;
        return this;
    }

    public Integer W0() {
        return this.f84760r;
    }

    public GoogleMapOptions W2(int i10) {
        this.f84745c = i10;
        return this;
    }

    public int a2() {
        return this.f84745c;
    }

    public Float b2() {
        return this.f84757o;
    }

    public GoogleMapOptions c0(CameraPosition cameraPosition) {
        this.f84746d = cameraPosition;
        return this;
    }

    public CameraPosition d1() {
        return this.f84746d;
    }

    public Float d2() {
        return this.f84756n;
    }

    public LatLngBounds g1() {
        return this.f84758p;
    }

    public int i1() {
        return this.f84762t;
    }

    public GoogleMapOptions l2(LatLngBounds latLngBounds) {
        this.f84758p = latLngBounds;
        return this;
    }

    GoogleMapOptions(byte b10, byte b11, int i10, CameraPosition cameraPosition, byte b12, byte b13, byte b14, byte b15, byte b16, byte b17, byte b18, byte b19, byte b20, Float f10, Float f11, LatLngBounds latLngBounds, byte b21, Integer num, String str, int i11) {
        this.f84745c = -1;
        this.f84756n = null;
        this.f84757o = null;
        this.f84758p = null;
        this.f84760r = null;
        this.f84761s = null;
        this.f84743a = C4058k.b(b10);
        this.f84744b = C4058k.b(b11);
        this.f84745c = i10;
        this.f84746d = cameraPosition;
        this.f84747e = C4058k.b(b12);
        this.f84748f = C4058k.b(b13);
        this.f84749g = C4058k.b(b14);
        this.f84750h = C4058k.b(b15);
        this.f84751i = C4058k.b(b16);
        this.f84752j = C4058k.b(b17);
        this.f84753k = C4058k.b(b18);
        this.f84754l = C4058k.b(b19);
        this.f84755m = C4058k.b(b20);
        this.f84756n = f10;
        this.f84757o = f11;
        this.f84758p = latLngBounds;
        this.f84759q = C4058k.b(b21);
        this.f84760r = num;
        this.f84761s = str;
        this.f84762t = i11;
    }

    public static GoogleMapOptions K0(Context context, AttributeSet attributeSet) {
        String string;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C3953k.f16410a);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (typedArrayObtainAttributes.hasValue(C3953k.f16427r)) {
            googleMapOptions.W2(typedArrayObtainAttributes.getInt(C3953k.f16427r, -1));
        }
        if (typedArrayObtainAttributes.hasValue(C3953k.f16409B)) {
            googleMapOptions.a4(typedArrayObtainAttributes.getBoolean(C3953k.f16409B, false));
        }
        if (typedArrayObtainAttributes.hasValue(C3953k.f16408A)) {
            googleMapOptions.Z3(typedArrayObtainAttributes.getBoolean(C3953k.f16408A, false));
        }
        if (typedArrayObtainAttributes.hasValue(C3953k.f16428s)) {
            googleMapOptions.q0(typedArrayObtainAttributes.getBoolean(C3953k.f16428s, true));
        }
        if (typedArrayObtainAttributes.hasValue(C3953k.f16430u)) {
            googleMapOptions.V3(typedArrayObtainAttributes.getBoolean(C3953k.f16430u, true));
        }
        if (typedArrayObtainAttributes.hasValue(C3953k.f16432w)) {
            googleMapOptions.X3(typedArrayObtainAttributes.getBoolean(C3953k.f16432w, true));
        }
        if (typedArrayObtainAttributes.hasValue(C3953k.f16431v)) {
            googleMapOptions.W3(typedArrayObtainAttributes.getBoolean(C3953k.f16431v, true));
        }
        if (typedArrayObtainAttributes.hasValue(C3953k.f16433x)) {
            googleMapOptions.Y3(typedArrayObtainAttributes.getBoolean(C3953k.f16433x, true));
        }
        if (typedArrayObtainAttributes.hasValue(C3953k.f16435z)) {
            googleMapOptions.c4(typedArrayObtainAttributes.getBoolean(C3953k.f16435z, true));
        }
        if (typedArrayObtainAttributes.hasValue(C3953k.f16434y)) {
            googleMapOptions.b4(typedArrayObtainAttributes.getBoolean(C3953k.f16434y, true));
        }
        if (typedArrayObtainAttributes.hasValue(C3953k.f16424o)) {
            googleMapOptions.J2(typedArrayObtainAttributes.getBoolean(C3953k.f16424o, false));
        }
        if (typedArrayObtainAttributes.hasValue(C3953k.f16429t)) {
            googleMapOptions.T2(typedArrayObtainAttributes.getBoolean(C3953k.f16429t, true));
        }
        if (typedArrayObtainAttributes.hasValue(C3953k.f16411b)) {
            googleMapOptions.B(typedArrayObtainAttributes.getBoolean(C3953k.f16411b, false));
        }
        if (typedArrayObtainAttributes.hasValue(C3953k.f16415f)) {
            googleMapOptions.U3(typedArrayObtainAttributes.getFloat(C3953k.f16415f, Float.NEGATIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(C3953k.f16415f)) {
            googleMapOptions.B3(typedArrayObtainAttributes.getFloat(C3953k.f16414e, Float.POSITIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(C3953k.f16412c)) {
            googleMapOptions.T(Integer.valueOf(typedArrayObtainAttributes.getColor(C3953k.f16412c, f84742u.intValue())));
        }
        if (typedArrayObtainAttributes.hasValue(C3953k.f16426q) && (string = typedArrayObtainAttributes.getString(C3953k.f16426q)) != null && !string.isEmpty()) {
            googleMapOptions.O2(string);
        }
        if (typedArrayObtainAttributes.hasValue(C3953k.f16425p)) {
            googleMapOptions.M2(typedArrayObtainAttributes.getInt(C3953k.f16425p, 0));
        }
        googleMapOptions.l2(e4(context, attributeSet));
        googleMapOptions.c0(d4(context, attributeSet));
        typedArrayObtainAttributes.recycle();
        return googleMapOptions;
    }

    public static CameraPosition d4(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C3953k.f16410a);
        LatLng latLng = new LatLng(typedArrayObtainAttributes.hasValue(C3953k.f16416g) ? typedArrayObtainAttributes.getFloat(C3953k.f16416g, 0.0f) : 0.0f, typedArrayObtainAttributes.hasValue(C3953k.f16417h) ? typedArrayObtainAttributes.getFloat(C3953k.f16417h, 0.0f) : 0.0f);
        CameraPosition.a aVarB = CameraPosition.B();
        aVarB.c(latLng);
        if (typedArrayObtainAttributes.hasValue(C3953k.f16419j)) {
            aVarB.e(typedArrayObtainAttributes.getFloat(C3953k.f16419j, 0.0f));
        }
        if (typedArrayObtainAttributes.hasValue(C3953k.f16413d)) {
            aVarB.a(typedArrayObtainAttributes.getFloat(C3953k.f16413d, 0.0f));
        }
        if (typedArrayObtainAttributes.hasValue(C3953k.f16418i)) {
            aVarB.d(typedArrayObtainAttributes.getFloat(C3953k.f16418i, 0.0f));
        }
        typedArrayObtainAttributes.recycle();
        return aVarB.b();
    }

    public GoogleMapOptions B(boolean z10) {
        this.f84755m = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions B3(float f10) {
        this.f84757o = Float.valueOf(f10);
        return this;
    }

    public GoogleMapOptions J2(boolean z10) {
        this.f84753k = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions T2(boolean z10) {
        this.f84754l = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions U3(float f10) {
        this.f84756n = Float.valueOf(f10);
        return this;
    }

    public GoogleMapOptions V3(boolean z10) {
        this.f84752j = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions W3(boolean z10) {
        this.f84749g = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions X3(boolean z10) {
        this.f84759q = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions Y3(boolean z10) {
        this.f84751i = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions Z3(boolean z10) {
        this.f84744b = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions a4(boolean z10) {
        this.f84743a = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions b4(boolean z10) {
        this.f84747e = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions c4(boolean z10) {
        this.f84750h = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions q0(boolean z10) {
        this.f84748f = Boolean.valueOf(z10);
        return this;
    }

    public String toString() {
        return C6535q.c(this).a("MapType", Integer.valueOf(this.f84745c)).a("LiteMode", this.f84753k).a("Camera", this.f84746d).a("CompassEnabled", this.f84748f).a("ZoomControlsEnabled", this.f84747e).a("ScrollGesturesEnabled", this.f84749g).a("ZoomGesturesEnabled", this.f84750h).a("TiltGesturesEnabled", this.f84751i).a("RotateGesturesEnabled", this.f84752j).a("ScrollGesturesEnabledDuringRotateOrZoom", this.f84759q).a("MapToolbarEnabled", this.f84754l).a("AmbientEnabled", this.f84755m).a("MinZoomPreference", this.f84756n).a("MaxZoomPreference", this.f84757o).a("BackgroundColor", this.f84760r).a("LatLngBoundsForCameraTarget", this.f84758p).a("ZOrderOnTop", this.f84743a).a("UseViewLifecycleInFragment", this.f84744b).a("mapColorScheme", Integer.valueOf(this.f84762t)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.f(parcel, 2, C4058k.a(this.f84743a));
        C15137b.f(parcel, 3, C4058k.a(this.f84744b));
        C15137b.n(parcel, 4, a2());
        C15137b.u(parcel, 5, d1(), i10, false);
        C15137b.f(parcel, 6, C4058k.a(this.f84747e));
        C15137b.f(parcel, 7, C4058k.a(this.f84748f));
        C15137b.f(parcel, 8, C4058k.a(this.f84749g));
        C15137b.f(parcel, 9, C4058k.a(this.f84750h));
        C15137b.f(parcel, 10, C4058k.a(this.f84751i));
        C15137b.f(parcel, 11, C4058k.a(this.f84752j));
        C15137b.f(parcel, 12, C4058k.a(this.f84753k));
        C15137b.f(parcel, 14, C4058k.a(this.f84754l));
        C15137b.f(parcel, 15, C4058k.a(this.f84755m));
        C15137b.l(parcel, 16, d2(), false);
        C15137b.l(parcel, 17, b2(), false);
        C15137b.u(parcel, 18, g1(), i10, false);
        C15137b.f(parcel, 19, C4058k.a(this.f84759q));
        C15137b.q(parcel, 20, W0(), false);
        C15137b.w(parcel, 21, P1(), false);
        C15137b.n(parcel, 23, i1());
        C15137b.b(parcel, iA);
    }
}
