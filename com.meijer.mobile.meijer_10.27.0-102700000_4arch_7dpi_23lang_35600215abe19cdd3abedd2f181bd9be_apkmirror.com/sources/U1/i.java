package U1;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public class i {

    /* renamed from: o, reason: collision with root package name */
    private static int f35665o = 1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f35666a;

    /* renamed from: b, reason: collision with root package name */
    private String f35667b;

    /* renamed from: f, reason: collision with root package name */
    public float f35671f;

    /* renamed from: j, reason: collision with root package name */
    a f35675j;

    /* renamed from: c, reason: collision with root package name */
    public int f35668c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f35669d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f35670e = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f35672g = false;

    /* renamed from: h, reason: collision with root package name */
    float[] f35673h = new float[9];

    /* renamed from: i, reason: collision with root package name */
    float[] f35674i = new float[9];

    /* renamed from: k, reason: collision with root package name */
    b[] f35676k = new b[16];

    /* renamed from: l, reason: collision with root package name */
    int f35677l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f35678m = 0;

    /* renamed from: n, reason: collision with root package name */
    HashSet<b> f35679n = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f35677l;
            if (i10 >= i11) {
                b[] bVarArr = this.f35676k;
                if (i11 >= bVarArr.length) {
                    this.f35676k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f35676k;
                int i12 = this.f35677l;
                bVarArr2[i12] = bVar;
                this.f35677l = i12 + 1;
                return;
            }
            if (this.f35676k[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    public void d() {
        this.f35667b = null;
        this.f35675j = a.UNKNOWN;
        this.f35670e = 0;
        this.f35668c = -1;
        this.f35669d = -1;
        this.f35671f = 0.0f;
        this.f35672g = false;
        int i10 = this.f35677l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f35676k[i11] = null;
        }
        this.f35677l = 0;
        this.f35678m = 0;
        this.f35666a = false;
        Arrays.fill(this.f35674i, 0.0f);
    }

    static void b() {
        f35665o++;
    }

    public final void c(b bVar) {
        int i10 = this.f35677l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f35676k[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f35676k;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f35677l--;
                return;
            }
            i11++;
        }
    }

    public void e(d dVar, float f10) {
        this.f35671f = f10;
        this.f35672g = true;
        int i10 = this.f35677l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f35676k[i11].B(dVar, this, false);
        }
        this.f35677l = 0;
    }

    public void f(a aVar, String str) {
        this.f35675j = aVar;
    }

    public final void g(b bVar) {
        int i10 = this.f35677l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f35676k[i11].C(bVar, false);
        }
        this.f35677l = 0;
    }

    public String toString() {
        if (this.f35667b != null) {
            return "" + this.f35667b;
        }
        return "" + this.f35668c;
    }

    public i(a aVar, String str) {
        this.f35675j = aVar;
    }
}
