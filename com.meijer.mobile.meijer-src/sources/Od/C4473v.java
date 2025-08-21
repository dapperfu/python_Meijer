package Od;

import Od.C;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Od.v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4473v extends AbstractC15707a {
    public static final Parcelable.Creator<C4473v> CREATOR = new h0();

    /* renamed from: a, reason: collision with root package name */
    private final List f23675a;

    /* renamed from: b, reason: collision with root package name */
    private float f23676b;

    /* renamed from: c, reason: collision with root package name */
    private int f23677c;

    /* renamed from: d, reason: collision with root package name */
    private float f23678d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f23679e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f23680f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f23681g;

    /* renamed from: h, reason: collision with root package name */
    private C4458f f23682h;

    /* renamed from: i, reason: collision with root package name */
    private C4458f f23683i;

    /* renamed from: j, reason: collision with root package name */
    private int f23684j;

    /* renamed from: k, reason: collision with root package name */
    private List f23685k;

    /* renamed from: l, reason: collision with root package name */
    private List f23686l;

    public C4473v() {
        this.f23676b = 10.0f;
        this.f23677c = -16777216;
        this.f23678d = 0.0f;
        this.f23679e = true;
        this.f23680f = false;
        this.f23681g = false;
        this.f23682h = new C4457e();
        this.f23683i = new C4457e();
        this.f23684j = 0;
        this.f23685k = null;
        this.f23686l = new ArrayList();
        this.f23675a = new ArrayList();
    }

    public C4473v A3(List<C4468p> list) {
        this.f23685k = list;
        return this;
    }

    public C4473v B(Iterable<LatLng> iterable) {
        com.google.android.gms.common.internal.r.m(iterable, "points must not be null.");
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.f23675a.add(it.next());
        }
        return this;
    }

    public float H2() {
        return this.f23678d;
    }

    public C4473v I0(int i10) {
        this.f23677c = i10;
        return this;
    }

    public boolean L2() {
        return this.f23681g;
    }

    public boolean N2() {
        return this.f23680f;
    }

    public List<C4468p> P1() {
        return this.f23685k;
    }

    public C4473v U0(C4458f c4458f) {
        this.f23683i = (C4458f) com.google.android.gms.common.internal.r.m(c4458f, "endCap must not be null");
        return this;
    }

    public boolean U2() {
        return this.f23679e;
    }

    public C4473v U3(C4458f c4458f) {
        this.f23682h = (C4458f) com.google.android.gms.common.internal.r.m(c4458f, "startCap must not be null");
        return this;
    }

    public C4473v V3(boolean z10) {
        this.f23679e = z10;
        return this;
    }

    public C4473v W2(int i10) {
        this.f23684j = i10;
        return this;
    }

    public C4473v W3(float f10) {
        this.f23676b = f10;
        return this;
    }

    public C4473v X3(float f10) {
        this.f23678d = f10;
        return this;
    }

    public List<LatLng> a2() {
        return this.f23675a;
    }

    public C4473v b0(D d10) {
        this.f23686l.add(d10);
        return this;
    }

    public C4458f c2() {
        return this.f23682h.B();
    }

    public C4473v d1(boolean z10) {
        this.f23680f = z10;
        return this;
    }

    public int h1() {
        return this.f23677c;
    }

    public C4458f j1() {
        return this.f23683i.B();
    }

    public float j2() {
        return this.f23676b;
    }

    public C4473v r0(boolean z10) {
        this.f23681g = z10;
        return this;
    }

    public int y1() {
        return this.f23684j;
    }

    public C4473v T(Iterable<D> iterable) {
        Iterator<D> it = iterable.iterator();
        while (it.hasNext()) {
            b0(it.next());
        }
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.A(parcel, 2, a2(), false);
        C15708b.k(parcel, 3, j2());
        C15708b.n(parcel, 4, h1());
        C15708b.k(parcel, 5, H2());
        C15708b.c(parcel, 6, U2());
        C15708b.c(parcel, 7, N2());
        C15708b.c(parcel, 8, L2());
        C15708b.u(parcel, 9, c2(), i10, false);
        C15708b.u(parcel, 10, j1(), i10, false);
        C15708b.n(parcel, 11, y1());
        C15708b.A(parcel, 12, P1(), false);
        ArrayList arrayList = new ArrayList(this.f23686l.size());
        for (D d10 : this.f23686l) {
            C.a aVar = new C.a(d10.T());
            aVar.c(this.f23676b);
            aVar.b(this.f23679e);
            arrayList.add(new D(aVar.a(), d10.B()));
        }
        C15708b.A(parcel, 13, arrayList, false);
        C15708b.b(parcel, iA);
    }

    C4473v(List list, float f10, int i10, float f11, boolean z10, boolean z11, boolean z12, C4458f c4458f, C4458f c4458f2, int i11, List list2, List list3) {
        this.f23676b = 10.0f;
        this.f23677c = -16777216;
        this.f23678d = 0.0f;
        this.f23679e = true;
        this.f23680f = false;
        this.f23681g = false;
        this.f23682h = new C4457e();
        this.f23683i = new C4457e();
        this.f23684j = 0;
        this.f23685k = null;
        this.f23686l = new ArrayList();
        this.f23675a = list;
        this.f23676b = f10;
        this.f23677c = i10;
        this.f23678d = f11;
        this.f23679e = z10;
        this.f23680f = z11;
        this.f23681g = z12;
        if (c4458f != null) {
            this.f23682h = c4458f;
        }
        if (c4458f2 != null) {
            this.f23683i = c4458f2;
        }
        this.f23684j = i11;
        this.f23685k = list2;
        if (list3 != null) {
            this.f23686l = list3;
        }
    }
}
