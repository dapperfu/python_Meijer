package com.google.android.gms.maps;

import Ld.C4058k;
import Md.B;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6535q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class StreetViewPanoramaOptions extends AbstractC15136a implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    private StreetViewPanoramaCamera f84766a;

    /* renamed from: b, reason: collision with root package name */
    private String f84767b;

    /* renamed from: c, reason: collision with root package name */
    private LatLng f84768c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f84769d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f84770e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f84771f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f84772g;

    /* renamed from: h, reason: collision with root package name */
    private Boolean f84773h;

    /* renamed from: i, reason: collision with root package name */
    private Boolean f84774i;

    /* renamed from: j, reason: collision with root package name */
    private B f84775j;

    public StreetViewPanoramaOptions() {
        Boolean bool = Boolean.TRUE;
        this.f84770e = bool;
        this.f84771f = bool;
        this.f84772g = bool;
        this.f84773h = bool;
        this.f84775j = B.f19375b;
    }

    public String B() {
        return this.f84767b;
    }

    public StreetViewPanoramaCamera K0() {
        return this.f84766a;
    }

    public LatLng T() {
        return this.f84768c;
    }

    public Integer c0() {
        return this.f84769d;
    }

    public B q0() {
        return this.f84775j;
    }

    public String toString() {
        return C6535q.c(this).a("PanoramaId", this.f84767b).a("Position", this.f84768c).a("Radius", this.f84769d).a("Source", this.f84775j).a("StreetViewPanoramaCamera", this.f84766a).a("UserNavigationEnabled", this.f84770e).a("ZoomGesturesEnabled", this.f84771f).a("PanningGesturesEnabled", this.f84772g).a("StreetNamesEnabled", this.f84773h).a("UseViewLifecycleInFragment", this.f84774i).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.u(parcel, 2, K0(), i10, false);
        C15137b.w(parcel, 3, B(), false);
        C15137b.u(parcel, 4, T(), i10, false);
        C15137b.q(parcel, 5, c0(), false);
        C15137b.f(parcel, 6, C4058k.a(this.f84770e));
        C15137b.f(parcel, 7, C4058k.a(this.f84771f));
        C15137b.f(parcel, 8, C4058k.a(this.f84772g));
        C15137b.f(parcel, 9, C4058k.a(this.f84773h));
        C15137b.f(parcel, 10, C4058k.a(this.f84774i));
        C15137b.u(parcel, 11, q0(), i10, false);
        C15137b.b(parcel, iA);
    }

    StreetViewPanoramaOptions(StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b10, byte b11, byte b12, byte b13, byte b14, B b15) {
        Boolean bool = Boolean.TRUE;
        this.f84770e = bool;
        this.f84771f = bool;
        this.f84772g = bool;
        this.f84773h = bool;
        this.f84775j = B.f19375b;
        this.f84766a = streetViewPanoramaCamera;
        this.f84768c = latLng;
        this.f84769d = num;
        this.f84767b = str;
        this.f84770e = C4058k.b(b10);
        this.f84771f = C4058k.b(b11);
        this.f84772g = C4058k.b(b12);
        this.f84773h = C4058k.b(b13);
        this.f84774i = C4058k.b(b14);
        this.f84775j = b15;
    }
}
