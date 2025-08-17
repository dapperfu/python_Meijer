package n6;

import android.graphics.PointF;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public String f151018a;

    /* renamed from: b, reason: collision with root package name */
    public String f151019b;

    /* renamed from: c, reason: collision with root package name */
    public float f151020c;

    /* renamed from: d, reason: collision with root package name */
    public a f151021d;

    /* renamed from: e, reason: collision with root package name */
    public int f151022e;

    /* renamed from: f, reason: collision with root package name */
    public float f151023f;

    /* renamed from: g, reason: collision with root package name */
    public float f151024g;

    /* renamed from: h, reason: collision with root package name */
    public int f151025h;

    /* renamed from: i, reason: collision with root package name */
    public int f151026i;

    /* renamed from: j, reason: collision with root package name */
    public float f151027j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f151028k;

    /* renamed from: l, reason: collision with root package name */
    public PointF f151029l;

    /* renamed from: m, reason: collision with root package name */
    public PointF f151030m;

    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        a(str, str2, f10, aVar, i10, f11, f12, i11, i12, f13, z10, pointF, pointF2);
    }

    public void a(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        this.f151018a = str;
        this.f151019b = str2;
        this.f151020c = f10;
        this.f151021d = aVar;
        this.f151022e = i10;
        this.f151023f = f11;
        this.f151024g = f12;
        this.f151025h = i11;
        this.f151026i = i12;
        this.f151027j = f13;
        this.f151028k = z10;
        this.f151029l = pointF;
        this.f151030m = pointF2;
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.f151018a.hashCode() * 31) + this.f151019b.hashCode()) * 31) + this.f151020c)) * 31) + this.f151021d.ordinal()) * 31) + this.f151022e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f151023f);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f151025h;
    }

    public b() {
    }
}
