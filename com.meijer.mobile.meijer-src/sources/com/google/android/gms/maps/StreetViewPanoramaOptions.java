package com.google.android.gms.maps;

import Nd.C4190k;
import Od.B;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6660q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class StreetViewPanoramaOptions extends AbstractC15707a implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    private StreetViewPanoramaCamera f85606a;

    /* renamed from: b, reason: collision with root package name */
    private String f85607b;

    /* renamed from: c, reason: collision with root package name */
    private LatLng f85608c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f85609d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f85610e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f85611f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f85612g;

    /* renamed from: h, reason: collision with root package name */
    private Boolean f85613h;

    /* renamed from: i, reason: collision with root package name */
    private Boolean f85614i;

    /* renamed from: j, reason: collision with root package name */
    private B f85615j;

    public StreetViewPanoramaOptions() {
        Boolean bool = Boolean.TRUE;
        this.f85610e = bool;
        this.f85611f = bool;
        this.f85612g = bool;
        this.f85613h = bool;
        this.f85615j = B.f23562b;
    }

    public String B() {
        return this.f85607b;
    }

    public StreetViewPanoramaCamera I0() {
        return this.f85606a;
    }

    public LatLng T() {
        return this.f85608c;
    }

    public Integer b0() {
        return this.f85609d;
    }

    public B r0() {
        return this.f85615j;
    }

    public String toString() {
        return C6660q.c(this).a("PanoramaId", this.f85607b).a("Position", this.f85608c).a("Radius", this.f85609d).a("Source", this.f85615j).a("StreetViewPanoramaCamera", this.f85606a).a("UserNavigationEnabled", this.f85610e).a("ZoomGesturesEnabled", this.f85611f).a("PanningGesturesEnabled", this.f85612g).a("StreetNamesEnabled", this.f85613h).a("UseViewLifecycleInFragment", this.f85614i).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.u(parcel, 2, I0(), i10, false);
        C15708b.w(parcel, 3, B(), false);
        C15708b.u(parcel, 4, T(), i10, false);
        C15708b.q(parcel, 5, b0(), false);
        C15708b.f(parcel, 6, C4190k.a(this.f85610e));
        C15708b.f(parcel, 7, C4190k.a(this.f85611f));
        C15708b.f(parcel, 8, C4190k.a(this.f85612g));
        C15708b.f(parcel, 9, C4190k.a(this.f85613h));
        C15708b.f(parcel, 10, C4190k.a(this.f85614i));
        C15708b.u(parcel, 11, r0(), i10, false);
        C15708b.b(parcel, iA);
    }

    StreetViewPanoramaOptions(StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b10, byte b11, byte b12, byte b13, byte b14, B b15) {
        Boolean bool = Boolean.TRUE;
        this.f85610e = bool;
        this.f85611f = bool;
        this.f85612g = bool;
        this.f85613h = bool;
        this.f85615j = B.f23562b;
        this.f85606a = streetViewPanoramaCamera;
        this.f85608c = latLng;
        this.f85609d = num;
        this.f85607b = str;
        this.f85610e = C4190k.b(b10);
        this.f85611f = C4190k.b(b11);
        this.f85612g = C4190k.b(b12);
        this.f85613h = C4190k.b(b13);
        this.f85614i = C4190k.b(b14);
        this.f85615j = b15;
    }
}
