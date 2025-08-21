package Og;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;

/* loaded from: classes8.dex */
public class l {

    /* renamed from: i, reason: collision with root package name */
    static final l[] f23763i;

    /* renamed from: j, reason: collision with root package name */
    private static l[] f23764j;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f23765a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23766b;

    /* renamed from: c, reason: collision with root package name */
    private final int f23767c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23768d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23769e;

    /* renamed from: f, reason: collision with root package name */
    private final int f23770f;

    /* renamed from: g, reason: collision with root package name */
    private final int f23771g;

    /* renamed from: h, reason: collision with root package name */
    private final int f23772h;

    static {
        l[] lVarArr = {new l(false, 3, 5, 8, 8, 1), new l(false, 5, 7, 10, 10, 1), new l(true, 5, 7, 16, 6, 1), new l(false, 8, 10, 12, 12, 1), new l(true, 10, 11, 14, 6, 2), new l(false, 12, 12, 14, 14, 1), new l(true, 16, 14, 24, 10, 1), new l(false, 18, 14, 16, 16, 1), new l(false, 22, 18, 18, 18, 1), new l(true, 22, 18, 16, 10, 2), new l(false, 30, 20, 20, 20, 1), new l(true, 32, 24, 16, 14, 2), new l(false, 36, 24, 22, 22, 1), new l(false, 44, 28, 24, 24, 1), new l(true, 49, 28, 22, 14, 2), new l(false, 62, 36, 14, 14, 4), new l(false, 86, 42, 16, 16, 4), new l(false, 114, 48, 18, 18, 4), new l(false, 144, 56, 20, 20, 4), new l(false, 174, 68, 22, 22, 4), new l(false, HttpResponseStatus.SUCCESS_NO_CONTENT, 84, 24, 24, 4, 102, 42), new l(false, 280, 112, 14, 14, 16, 140, 56), new l(false, 368, 144, 16, 16, 16, 92, 36), new l(false, 456, 192, 18, 18, 16, 114, 48), new l(false, 576, 224, 20, 20, 16, 144, 56), new l(false, 696, 272, 22, 22, 16, 174, 68), new l(false, 816, 336, 24, 24, 16, 136, 56), new l(false, 1050, HttpResponseStatus.ERROR_REQUEST_TIMEOUT, 18, 18, 36, 175, 68), new l(false, 1304, 496, 20, 20, 36, 163, 62), new d()};
        f23763i = lVarArr;
        f23764j = lVarArr;
    }

    public l(boolean z10, int i10, int i11, int i12, int i13, int i14) {
        this(z10, i10, i11, i12, i13, i14, i10, i11);
    }

    l(boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f23765a = z10;
        this.f23766b = i10;
        this.f23767c = i11;
        this.f23768d = i12;
        this.f23769e = i13;
        this.f23770f = i14;
        this.f23771g = i15;
        this.f23772h = i16;
    }

    private int e() {
        int i10 = this.f23770f;
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2 && i10 != 4) {
                if (i10 == 16) {
                    return 4;
                }
                if (i10 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i11;
    }

    private int k() {
        int i10 = this.f23770f;
        if (i10 == 1 || i10 == 2) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public static l l(int i10, m mVar, com.google.zxing.e eVar, com.google.zxing.e eVar2, boolean z10) {
        for (l lVar : f23764j) {
            if (!(mVar == m.FORCE_SQUARE && lVar.f23765a) && ((mVar != m.FORCE_RECTANGLE || lVar.f23765a) && ((eVar == null || (lVar.j() >= eVar.b() && lVar.i() >= eVar.a())) && ((eVar2 == null || (lVar.j() <= eVar2.b() && lVar.i() <= eVar2.a())) && i10 <= lVar.f23766b)))) {
                return lVar;
            }
        }
        if (!z10) {
            return null;
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: " + i10);
    }

    public final int a() {
        return this.f23766b;
    }

    public int b(int i10) {
        return this.f23771g;
    }

    public final int c() {
        return this.f23767c;
    }

    public final int d(int i10) {
        return this.f23772h;
    }

    public int f() {
        return this.f23766b / this.f23771g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f23765a ? "Rectangular Symbol:" : "Square Symbol:");
        sb2.append(" data region ");
        sb2.append(this.f23768d);
        sb2.append('x');
        sb2.append(this.f23769e);
        sb2.append(", symbol size ");
        sb2.append(j());
        sb2.append('x');
        sb2.append(i());
        sb2.append(", symbol data size ");
        sb2.append(h());
        sb2.append('x');
        sb2.append(g());
        sb2.append(", codewords ");
        sb2.append(this.f23766b);
        sb2.append('+');
        sb2.append(this.f23767c);
        return sb2.toString();
    }

    public final int g() {
        return k() * this.f23769e;
    }

    public final int h() {
        return e() * this.f23768d;
    }

    public final int i() {
        return g() + (k() * 2);
    }

    public final int j() {
        return h() + (e() * 2);
    }
}
