package o6;

import android.graphics.PointF;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public String f153620a;

    /* renamed from: b, reason: collision with root package name */
    public String f153621b;

    /* renamed from: c, reason: collision with root package name */
    public float f153622c;

    /* renamed from: d, reason: collision with root package name */
    public a f153623d;

    /* renamed from: e, reason: collision with root package name */
    public int f153624e;

    /* renamed from: f, reason: collision with root package name */
    public float f153625f;

    /* renamed from: g, reason: collision with root package name */
    public float f153626g;

    /* renamed from: h, reason: collision with root package name */
    public int f153627h;

    /* renamed from: i, reason: collision with root package name */
    public int f153628i;

    /* renamed from: j, reason: collision with root package name */
    public float f153629j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f153630k;

    /* renamed from: l, reason: collision with root package name */
    public PointF f153631l;

    /* renamed from: m, reason: collision with root package name */
    public PointF f153632m;

    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        a(str, str2, f10, aVar, i10, f11, f12, i11, i12, f13, z10, pointF, pointF2);
    }

    public void a(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        this.f153620a = str;
        this.f153621b = str2;
        this.f153622c = f10;
        this.f153623d = aVar;
        this.f153624e = i10;
        this.f153625f = f11;
        this.f153626g = f12;
        this.f153627h = i11;
        this.f153628i = i12;
        this.f153629j = f13;
        this.f153630k = z10;
        this.f153631l = pointF;
        this.f153632m = pointF2;
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.f153620a.hashCode() * 31) + this.f153621b.hashCode()) * 31) + this.f153622c)) * 31) + this.f153623d.ordinal()) * 31) + this.f153624e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f153625f);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f153627h;
    }

    public b() {
    }
}
