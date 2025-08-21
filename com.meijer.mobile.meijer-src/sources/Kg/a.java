package Kg;

import androidx.recyclerview.widget.RecyclerView;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static final a f16615h = new a(4201, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, 1);

    /* renamed from: i, reason: collision with root package name */
    public static final a f16616i = new a(1033, 1024, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final a f16617j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f16618k;

    /* renamed from: l, reason: collision with root package name */
    public static final a f16619l;

    /* renamed from: m, reason: collision with root package name */
    public static final a f16620m;

    /* renamed from: n, reason: collision with root package name */
    public static final a f16621n;

    /* renamed from: o, reason: collision with root package name */
    public static final a f16622o;

    /* renamed from: a, reason: collision with root package name */
    private final int[] f16623a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f16624b;

    /* renamed from: c, reason: collision with root package name */
    private final b f16625c;

    /* renamed from: d, reason: collision with root package name */
    private final b f16626d;

    /* renamed from: e, reason: collision with root package name */
    private final int f16627e;

    /* renamed from: f, reason: collision with root package name */
    private final int f16628f;

    /* renamed from: g, reason: collision with root package name */
    private final int f16629g;

    static int a(int i10, int i11) {
        return i10 ^ i11;
    }

    static {
        a aVar = new a(67, 64, 1);
        f16617j = aVar;
        f16618k = new a(19, 16, 1);
        f16619l = new a(285, 256, 0);
        a aVar2 = new a(HttpResponseStatus.REDIRECTION_MOVED_PERMANENTLY, 256, 1);
        f16620m = aVar2;
        f16621n = aVar2;
        f16622o = aVar;
    }

    b b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f16625c;
        }
        int[] iArr = new int[i10 + 1];
        iArr[0] = i11;
        return new b(this, iArr);
    }

    int c(int i10) {
        return this.f16623a[i10];
    }

    public int d() {
        return this.f16629g;
    }

    b e() {
        return this.f16626d;
    }

    public int f() {
        return this.f16627e;
    }

    b g() {
        return this.f16625c;
    }

    int h(int i10) {
        if (i10 != 0) {
            return this.f16623a[(this.f16627e - this.f16624b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    int i(int i10) {
        if (i10 != 0) {
            return this.f16624b[i10];
        }
        throw new IllegalArgumentException();
    }

    int j(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f16623a;
        int[] iArr2 = this.f16624b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f16627e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f16628f) + ',' + this.f16627e + ')';
    }

    public a(int i10, int i11, int i12) {
        this.f16628f = i10;
        this.f16627e = i11;
        this.f16629g = i12;
        this.f16623a = new int[i11];
        this.f16624b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f16623a[i14] = i13;
            i13 *= 2;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f16624b[this.f16623a[i15]] = i15;
        }
        this.f16625c = new b(this, new int[]{0});
        this.f16626d = new b(this, new int[]{1});
    }
}
