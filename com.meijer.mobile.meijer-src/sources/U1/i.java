package U1;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public class i {

    /* renamed from: o, reason: collision with root package name */
    private static int f37001o = 1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f37002a;

    /* renamed from: b, reason: collision with root package name */
    private String f37003b;

    /* renamed from: f, reason: collision with root package name */
    public float f37007f;

    /* renamed from: j, reason: collision with root package name */
    a f37011j;

    /* renamed from: c, reason: collision with root package name */
    public int f37004c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f37005d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f37006e = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f37008g = false;

    /* renamed from: h, reason: collision with root package name */
    float[] f37009h = new float[9];

    /* renamed from: i, reason: collision with root package name */
    float[] f37010i = new float[9];

    /* renamed from: k, reason: collision with root package name */
    b[] f37012k = new b[16];

    /* renamed from: l, reason: collision with root package name */
    int f37013l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f37014m = 0;

    /* renamed from: n, reason: collision with root package name */
    HashSet<b> f37015n = null;

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
            int i11 = this.f37013l;
            if (i10 >= i11) {
                b[] bVarArr = this.f37012k;
                if (i11 >= bVarArr.length) {
                    this.f37012k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f37012k;
                int i12 = this.f37013l;
                bVarArr2[i12] = bVar;
                this.f37013l = i12 + 1;
                return;
            }
            if (this.f37012k[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    public void d() {
        this.f37003b = null;
        this.f37011j = a.UNKNOWN;
        this.f37006e = 0;
        this.f37004c = -1;
        this.f37005d = -1;
        this.f37007f = 0.0f;
        this.f37008g = false;
        int i10 = this.f37013l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f37012k[i11] = null;
        }
        this.f37013l = 0;
        this.f37014m = 0;
        this.f37002a = false;
        Arrays.fill(this.f37010i, 0.0f);
    }

    static void b() {
        f37001o++;
    }

    public final void c(b bVar) {
        int i10 = this.f37013l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f37012k[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f37012k;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f37013l--;
                return;
            }
            i11++;
        }
    }

    public void e(d dVar, float f10) {
        this.f37007f = f10;
        this.f37008g = true;
        int i10 = this.f37013l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f37012k[i11].B(dVar, this, false);
        }
        this.f37013l = 0;
    }

    public void f(a aVar, String str) {
        this.f37011j = aVar;
    }

    public final void g(b bVar) {
        int i10 = this.f37013l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f37012k[i11].C(bVar, false);
        }
        this.f37013l = 0;
    }

    public String toString() {
        if (this.f37003b != null) {
            return "" + this.f37003b;
        }
        return "" + this.f37004c;
    }

    public i(a aVar, String str) {
        this.f37011j = aVar;
    }
}
