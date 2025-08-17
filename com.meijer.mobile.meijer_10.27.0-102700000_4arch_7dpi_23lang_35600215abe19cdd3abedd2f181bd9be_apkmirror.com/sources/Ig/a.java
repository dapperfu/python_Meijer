package Ig;

import androidx.recyclerview.widget.RecyclerView;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static final a f13869h = new a(4201, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, 1);

    /* renamed from: i, reason: collision with root package name */
    public static final a f13870i = new a(1033, 1024, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final a f13871j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f13872k;

    /* renamed from: l, reason: collision with root package name */
    public static final a f13873l;

    /* renamed from: m, reason: collision with root package name */
    public static final a f13874m;

    /* renamed from: n, reason: collision with root package name */
    public static final a f13875n;

    /* renamed from: o, reason: collision with root package name */
    public static final a f13876o;

    /* renamed from: a, reason: collision with root package name */
    private final int[] f13877a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f13878b;

    /* renamed from: c, reason: collision with root package name */
    private final b f13879c;

    /* renamed from: d, reason: collision with root package name */
    private final b f13880d;

    /* renamed from: e, reason: collision with root package name */
    private final int f13881e;

    /* renamed from: f, reason: collision with root package name */
    private final int f13882f;

    /* renamed from: g, reason: collision with root package name */
    private final int f13883g;

    static int a(int i10, int i11) {
        return i10 ^ i11;
    }

    static {
        a aVar = new a(67, 64, 1);
        f13871j = aVar;
        f13872k = new a(19, 16, 1);
        f13873l = new a(285, 256, 0);
        a aVar2 = new a(HttpResponseStatus.REDIRECTION_MOVED_PERMANENTLY, 256, 1);
        f13874m = aVar2;
        f13875n = aVar2;
        f13876o = aVar;
    }

    b b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f13879c;
        }
        int[] iArr = new int[i10 + 1];
        iArr[0] = i11;
        return new b(this, iArr);
    }

    int c(int i10) {
        return this.f13877a[i10];
    }

    public int d() {
        return this.f13883g;
    }

    b e() {
        return this.f13880d;
    }

    public int f() {
        return this.f13881e;
    }

    b g() {
        return this.f13879c;
    }

    int h(int i10) {
        if (i10 != 0) {
            return this.f13877a[(this.f13881e - this.f13878b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    int i(int i10) {
        if (i10 != 0) {
            return this.f13878b[i10];
        }
        throw new IllegalArgumentException();
    }

    int j(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f13877a;
        int[] iArr2 = this.f13878b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f13881e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f13882f) + ',' + this.f13881e + ')';
    }

    public a(int i10, int i11, int i12) {
        this.f13882f = i10;
        this.f13881e = i11;
        this.f13883g = i12;
        this.f13877a = new int[i11];
        this.f13878b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f13877a[i14] = i13;
            i13 *= 2;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f13878b[this.f13877a[i15]] = i15;
        }
        this.f13879c = new b(this, new int[]{0});
        this.f13880d = new b(this, new int[]{1});
    }
}
