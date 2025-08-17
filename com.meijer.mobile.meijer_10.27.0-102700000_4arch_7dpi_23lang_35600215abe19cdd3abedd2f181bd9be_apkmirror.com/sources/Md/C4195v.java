package Md;

import Md.C;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: Md.v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4195v extends AbstractC15136a {
    public static final Parcelable.Creator<C4195v> CREATOR = new h0();

    /* renamed from: a, reason: collision with root package name */
    private final List f19488a;

    /* renamed from: b, reason: collision with root package name */
    private float f19489b;

    /* renamed from: c, reason: collision with root package name */
    private int f19490c;

    /* renamed from: d, reason: collision with root package name */
    private float f19491d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f19492e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f19493f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f19494g;

    /* renamed from: h, reason: collision with root package name */
    private C4180f f19495h;

    /* renamed from: i, reason: collision with root package name */
    private C4180f f19496i;

    /* renamed from: j, reason: collision with root package name */
    private int f19497j;

    /* renamed from: k, reason: collision with root package name */
    private List f19498k;

    /* renamed from: l, reason: collision with root package name */
    private List f19499l;

    public C4195v() {
        this.f19489b = 10.0f;
        this.f19490c = -16777216;
        this.f19491d = 0.0f;
        this.f19492e = true;
        this.f19493f = false;
        this.f19494g = false;
        this.f19495h = new C4179e();
        this.f19496i = new C4179e();
        this.f19497j = 0;
        this.f19498k = null;
        this.f19499l = new ArrayList();
        this.f19488a = new ArrayList();
    }

    public C4195v B(Iterable<LatLng> iterable) {
        com.google.android.gms.common.internal.r.m(iterable, "points must not be null.");
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.f19488a.add(it.next());
        }
        return this;
    }

    public C4195v B3(List<C4190p> list) {
        this.f19498k = list;
        return this;
    }

    public float J2() {
        return this.f19491d;
    }

    public C4195v K0(int i10) {
        this.f19490c = i10;
        return this;
    }

    public boolean M2() {
        return this.f19494g;
    }

    public boolean O2() {
        return this.f19493f;
    }

    public int P1() {
        return this.f19497j;
    }

    public boolean T2() {
        return this.f19492e;
    }

    public C4195v U3(C4180f c4180f) {
        this.f19495h = (C4180f) com.google.android.gms.common.internal.r.m(c4180f, "startCap must not be null");
        return this;
    }

    public C4195v V3(boolean z10) {
        this.f19492e = z10;
        return this;
    }

    public C4195v W0(C4180f c4180f) {
        this.f19496i = (C4180f) com.google.android.gms.common.internal.r.m(c4180f, "endCap must not be null");
        return this;
    }

    public C4195v W2(int i10) {
        this.f19497j = i10;
        return this;
    }

    public C4195v W3(float f10) {
        this.f19489b = f10;
        return this;
    }

    public C4195v X3(float f10) {
        this.f19491d = f10;
        return this;
    }

    public List<C4190p> a2() {
        return this.f19498k;
    }

    public List<LatLng> b2() {
        return this.f19488a;
    }

    public C4195v c0(D d10) {
        this.f19499l.add(d10);
        return this;
    }

    public C4195v d1(boolean z10) {
        this.f19493f = z10;
        return this;
    }

    public C4180f d2() {
        return this.f19495h.B();
    }

    public int g1() {
        return this.f19490c;
    }

    public C4180f i1() {
        return this.f19496i.B();
    }

    public float l2() {
        return this.f19489b;
    }

    public C4195v q0(boolean z10) {
        this.f19494g = z10;
        return this;
    }

    public C4195v T(Iterable<D> iterable) {
        Iterator<D> it = iterable.iterator();
        while (it.hasNext()) {
            c0(it.next());
        }
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.A(parcel, 2, b2(), false);
        C15137b.k(parcel, 3, l2());
        C15137b.n(parcel, 4, g1());
        C15137b.k(parcel, 5, J2());
        C15137b.c(parcel, 6, T2());
        C15137b.c(parcel, 7, O2());
        C15137b.c(parcel, 8, M2());
        C15137b.u(parcel, 9, d2(), i10, false);
        C15137b.u(parcel, 10, i1(), i10, false);
        C15137b.n(parcel, 11, P1());
        C15137b.A(parcel, 12, a2(), false);
        ArrayList arrayList = new ArrayList(this.f19499l.size());
        for (D d10 : this.f19499l) {
            C.a aVar = new C.a(d10.T());
            aVar.c(this.f19489b);
            aVar.b(this.f19492e);
            arrayList.add(new D(aVar.a(), d10.B()));
        }
        C15137b.A(parcel, 13, arrayList, false);
        C15137b.b(parcel, iA);
    }

    C4195v(List list, float f10, int i10, float f11, boolean z10, boolean z11, boolean z12, C4180f c4180f, C4180f c4180f2, int i11, List list2, List list3) {
        this.f19489b = 10.0f;
        this.f19490c = -16777216;
        this.f19491d = 0.0f;
        this.f19492e = true;
        this.f19493f = false;
        this.f19494g = false;
        this.f19495h = new C4179e();
        this.f19496i = new C4179e();
        this.f19497j = 0;
        this.f19498k = null;
        this.f19499l = new ArrayList();
        this.f19488a = list;
        this.f19489b = f10;
        this.f19490c = i10;
        this.f19491d = f11;
        this.f19492e = z10;
        this.f19493f = z11;
        this.f19494g = z12;
        if (c4180f != null) {
            this.f19495h = c4180f;
        }
        if (c4180f2 != null) {
            this.f19496i = c4180f2;
        }
        this.f19497j = i11;
        this.f19498k = list2;
        if (list3 != null) {
            this.f19499l = list3;
        }
    }
}
