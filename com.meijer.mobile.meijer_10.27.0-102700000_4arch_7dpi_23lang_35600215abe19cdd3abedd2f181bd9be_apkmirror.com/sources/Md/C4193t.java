package Md;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Md.t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4193t extends AbstractC15136a {
    public static final Parcelable.Creator<C4193t> CREATOR = new g0();

    /* renamed from: a, reason: collision with root package name */
    private final List f19476a;

    /* renamed from: b, reason: collision with root package name */
    private final List f19477b;

    /* renamed from: c, reason: collision with root package name */
    private float f19478c;

    /* renamed from: d, reason: collision with root package name */
    private int f19479d;

    /* renamed from: e, reason: collision with root package name */
    private int f19480e;

    /* renamed from: f, reason: collision with root package name */
    private float f19481f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f19482g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f19483h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f19484i;

    /* renamed from: j, reason: collision with root package name */
    private int f19485j;

    /* renamed from: k, reason: collision with root package name */
    private List f19486k;

    public C4193t() {
        this.f19478c = 10.0f;
        this.f19479d = -16777216;
        this.f19480e = 0;
        this.f19481f = 0.0f;
        this.f19482g = true;
        this.f19483h = false;
        this.f19484i = false;
        this.f19485j = 0;
        this.f19486k = null;
        this.f19476a = new ArrayList();
        this.f19477b = new ArrayList();
    }

    public C4193t B(Iterable<LatLng> iterable) {
        com.google.android.gms.common.internal.r.m(iterable, "points must not be null.");
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.f19476a.add(it.next());
        }
        return this;
    }

    public C4193t B3(boolean z10) {
        this.f19482g = z10;
        return this;
    }

    public boolean J2() {
        return this.f19482g;
    }

    public C4193t K0(boolean z10) {
        this.f19483h = z10;
        return this;
    }

    public C4193t M2(int i10) {
        this.f19479d = i10;
        return this;
    }

    public C4193t O2(int i10) {
        this.f19485j = i10;
        return this;
    }

    public List<C4190p> P1() {
        return this.f19486k;
    }

    public C4193t T(Iterable<LatLng> iterable) {
        com.google.android.gms.common.internal.r.m(iterable, "points must not be null.");
        ArrayList arrayList = new ArrayList();
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        this.f19477b.add(arrayList);
        return this;
    }

    public C4193t T2(List<C4190p> list) {
        this.f19486k = list;
        return this;
    }

    public C4193t U3(float f10) {
        this.f19481f = f10;
        return this;
    }

    public int W0() {
        return this.f19480e;
    }

    public C4193t W2(float f10) {
        this.f19478c = f10;
        return this;
    }

    public float a2() {
        return this.f19478c;
    }

    public float b2() {
        return this.f19481f;
    }

    public C4193t c0(boolean z10) {
        this.f19484i = z10;
        return this;
    }

    public List<LatLng> d1() {
        return this.f19476a;
    }

    public boolean d2() {
        return this.f19484i;
    }

    public int g1() {
        return this.f19479d;
    }

    public int i1() {
        return this.f19485j;
    }

    public boolean l2() {
        return this.f19483h;
    }

    public C4193t q0(int i10) {
        this.f19480e = i10;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.A(parcel, 2, d1(), false);
        C15137b.r(parcel, 3, this.f19477b, false);
        C15137b.k(parcel, 4, a2());
        C15137b.n(parcel, 5, g1());
        C15137b.n(parcel, 6, W0());
        C15137b.k(parcel, 7, b2());
        C15137b.c(parcel, 8, J2());
        C15137b.c(parcel, 9, l2());
        C15137b.c(parcel, 10, d2());
        C15137b.n(parcel, 11, i1());
        C15137b.A(parcel, 12, P1(), false);
        C15137b.b(parcel, iA);
    }

    C4193t(List list, List list2, float f10, int i10, int i11, float f11, boolean z10, boolean z11, boolean z12, int i12, List list3) {
        this.f19476a = list;
        this.f19477b = list2;
        this.f19478c = f10;
        this.f19479d = i10;
        this.f19480e = i11;
        this.f19481f = f11;
        this.f19482g = z10;
        this.f19483h = z11;
        this.f19484i = z12;
        this.f19485j = i12;
        this.f19486k = list3;
    }
}
