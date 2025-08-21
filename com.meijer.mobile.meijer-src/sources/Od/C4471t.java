package Od;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Od.t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4471t extends AbstractC15707a {
    public static final Parcelable.Creator<C4471t> CREATOR = new g0();

    /* renamed from: a, reason: collision with root package name */
    private final List f23663a;

    /* renamed from: b, reason: collision with root package name */
    private final List f23664b;

    /* renamed from: c, reason: collision with root package name */
    private float f23665c;

    /* renamed from: d, reason: collision with root package name */
    private int f23666d;

    /* renamed from: e, reason: collision with root package name */
    private int f23667e;

    /* renamed from: f, reason: collision with root package name */
    private float f23668f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f23669g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f23670h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f23671i;

    /* renamed from: j, reason: collision with root package name */
    private int f23672j;

    /* renamed from: k, reason: collision with root package name */
    private List f23673k;

    public C4471t() {
        this.f23665c = 10.0f;
        this.f23666d = -16777216;
        this.f23667e = 0;
        this.f23668f = 0.0f;
        this.f23669g = true;
        this.f23670h = false;
        this.f23671i = false;
        this.f23672j = 0;
        this.f23673k = null;
        this.f23663a = new ArrayList();
        this.f23664b = new ArrayList();
    }

    public C4471t A3(boolean z10) {
        this.f23669g = z10;
        return this;
    }

    public C4471t B(Iterable<LatLng> iterable) {
        com.google.android.gms.common.internal.r.m(iterable, "points must not be null.");
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.f23663a.add(it.next());
        }
        return this;
    }

    public boolean H2() {
        return this.f23669g;
    }

    public C4471t I0(boolean z10) {
        this.f23670h = z10;
        return this;
    }

    public C4471t L2(int i10) {
        this.f23666d = i10;
        return this;
    }

    public C4471t N2(int i10) {
        this.f23672j = i10;
        return this;
    }

    public float P1() {
        return this.f23665c;
    }

    public C4471t T(Iterable<LatLng> iterable) {
        com.google.android.gms.common.internal.r.m(iterable, "points must not be null.");
        ArrayList arrayList = new ArrayList();
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        this.f23664b.add(arrayList);
        return this;
    }

    public int U0() {
        return this.f23667e;
    }

    public C4471t U2(List<C4468p> list) {
        this.f23673k = list;
        return this;
    }

    public C4471t U3(float f10) {
        this.f23668f = f10;
        return this;
    }

    public C4471t W2(float f10) {
        this.f23665c = f10;
        return this;
    }

    public float a2() {
        return this.f23668f;
    }

    public C4471t b0(boolean z10) {
        this.f23671i = z10;
        return this;
    }

    public boolean c2() {
        return this.f23671i;
    }

    public List<LatLng> d1() {
        return this.f23663a;
    }

    public int h1() {
        return this.f23666d;
    }

    public int j1() {
        return this.f23672j;
    }

    public boolean j2() {
        return this.f23670h;
    }

    public C4471t r0(int i10) {
        this.f23667e = i10;
        return this;
    }

    public List<C4468p> y1() {
        return this.f23673k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.A(parcel, 2, d1(), false);
        C15708b.r(parcel, 3, this.f23664b, false);
        C15708b.k(parcel, 4, P1());
        C15708b.n(parcel, 5, h1());
        C15708b.n(parcel, 6, U0());
        C15708b.k(parcel, 7, a2());
        C15708b.c(parcel, 8, H2());
        C15708b.c(parcel, 9, j2());
        C15708b.c(parcel, 10, c2());
        C15708b.n(parcel, 11, j1());
        C15708b.A(parcel, 12, y1(), false);
        C15708b.b(parcel, iA);
    }

    C4471t(List list, List list2, float f10, int i10, int i11, float f11, boolean z10, boolean z11, boolean z12, int i12, List list3) {
        this.f23663a = list;
        this.f23664b = list2;
        this.f23665c = f10;
        this.f23666d = i10;
        this.f23667e = i11;
        this.f23668f = f11;
        this.f23669g = z10;
        this.f23670h = z11;
        this.f23671i = z12;
        this.f23672j = i12;
        this.f23673k = list3;
    }
}
