package Od;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: Od.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4460h extends AbstractC15707a {
    public static final Parcelable.Creator<C4460h> CREATOR = new V();

    /* renamed from: a, reason: collision with root package name */
    private LatLng f23604a;

    /* renamed from: b, reason: collision with root package name */
    private double f23605b;

    /* renamed from: c, reason: collision with root package name */
    private float f23606c;

    /* renamed from: d, reason: collision with root package name */
    private int f23607d;

    /* renamed from: e, reason: collision with root package name */
    private int f23608e;

    /* renamed from: f, reason: collision with root package name */
    private float f23609f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f23610g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f23611h;

    /* renamed from: i, reason: collision with root package name */
    private List f23612i;

    public C4460h() {
        this.f23604a = null;
        this.f23605b = 0.0d;
        this.f23606c = 10.0f;
        this.f23607d = -16777216;
        this.f23608e = 0;
        this.f23609f = 0.0f;
        this.f23610g = true;
        this.f23611h = false;
        this.f23612i = null;
    }

    C4460h(LatLng latLng, double d10, float f10, int i10, int i11, float f11, boolean z10, boolean z11, List list) {
        this.f23604a = latLng;
        this.f23605b = d10;
        this.f23606c = f10;
        this.f23607d = i10;
        this.f23608e = i11;
        this.f23609f = f11;
        this.f23610g = z10;
        this.f23611h = z11;
        this.f23612i = list;
    }

    public C4460h B(LatLng latLng) {
        com.google.android.gms.common.internal.r.m(latLng, "center must not be null.");
        this.f23604a = latLng;
        return this;
    }

    public C4460h H2(List<C4468p> list) {
        this.f23612i = list;
        return this;
    }

    public int I0() {
        return this.f23608e;
    }

    public C4460h L2(float f10) {
        this.f23606c = f10;
        return this;
    }

    public C4460h N2(boolean z10) {
        this.f23610g = z10;
        return this;
    }

    public boolean P1() {
        return this.f23611h;
    }

    public C4460h T(boolean z10) {
        this.f23611h = z10;
        return this;
    }

    public double U0() {
        return this.f23605b;
    }

    public C4460h U2(float f10) {
        this.f23609f = f10;
        return this;
    }

    public boolean a2() {
        return this.f23610g;
    }

    public C4460h b0(int i10) {
        this.f23608e = i10;
        return this;
    }

    public C4460h c2(double d10) {
        this.f23605b = d10;
        return this;
    }

    public int d1() {
        return this.f23607d;
    }

    public List<C4468p> h1() {
        return this.f23612i;
    }

    public float j1() {
        return this.f23606c;
    }

    public C4460h j2(int i10) {
        this.f23607d = i10;
        return this;
    }

    public LatLng r0() {
        return this.f23604a;
    }

    public float y1() {
        return this.f23609f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.u(parcel, 2, r0(), i10, false);
        C15708b.i(parcel, 3, U0());
        C15708b.k(parcel, 4, j1());
        C15708b.n(parcel, 5, d1());
        C15708b.n(parcel, 6, I0());
        C15708b.k(parcel, 7, y1());
        C15708b.c(parcel, 8, a2());
        C15708b.c(parcel, 9, P1());
        C15708b.A(parcel, 10, h1(), false);
        C15708b.b(parcel, iA);
    }
}
