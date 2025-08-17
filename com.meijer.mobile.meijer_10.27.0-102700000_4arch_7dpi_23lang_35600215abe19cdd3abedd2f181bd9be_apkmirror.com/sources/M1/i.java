package M1;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public class i implements Comparable<i> {

    /* renamed from: r, reason: collision with root package name */
    private static int f18862r = 1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f18863a;

    /* renamed from: b, reason: collision with root package name */
    private String f18864b;

    /* renamed from: f, reason: collision with root package name */
    public float f18868f;

    /* renamed from: j, reason: collision with root package name */
    a f18872j;

    /* renamed from: c, reason: collision with root package name */
    public int f18865c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f18866d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f18867e = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18869g = false;

    /* renamed from: h, reason: collision with root package name */
    float[] f18870h = new float[9];

    /* renamed from: i, reason: collision with root package name */
    float[] f18871i = new float[9];

    /* renamed from: k, reason: collision with root package name */
    b[] f18873k = new b[16];

    /* renamed from: l, reason: collision with root package name */
    int f18874l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f18875m = 0;

    /* renamed from: n, reason: collision with root package name */
    boolean f18876n = false;

    /* renamed from: o, reason: collision with root package name */
    int f18877o = -1;

    /* renamed from: p, reason: collision with root package name */
    float f18878p = 0.0f;

    /* renamed from: q, reason: collision with root package name */
    HashSet<b> f18879q = null;

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
            int i11 = this.f18874l;
            if (i10 >= i11) {
                b[] bVarArr = this.f18873k;
                if (i11 >= bVarArr.length) {
                    this.f18873k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f18873k;
                int i12 = this.f18874l;
                bVarArr2[i12] = bVar;
                this.f18874l = i12 + 1;
                return;
            }
            if (this.f18873k[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    public void m() {
        this.f18864b = null;
        this.f18872j = a.UNKNOWN;
        this.f18867e = 0;
        this.f18865c = -1;
        this.f18866d = -1;
        this.f18868f = 0.0f;
        this.f18869g = false;
        this.f18876n = false;
        this.f18877o = -1;
        this.f18878p = 0.0f;
        int i10 = this.f18874l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f18873k[i11] = null;
        }
        this.f18874l = 0;
        this.f18875m = 0;
        this.f18863a = false;
        Arrays.fill(this.f18871i, 0.0f);
    }

    static void e() {
        f18862r++;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return this.f18865c - iVar.f18865c;
    }

    public final void l(b bVar) {
        int i10 = this.f18874l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f18873k[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f18873k;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f18874l--;
                return;
            }
            i11++;
        }
    }

    public void o(d dVar, float f10) {
        this.f18868f = f10;
        this.f18869g = true;
        this.f18876n = false;
        this.f18877o = -1;
        this.f18878p = 0.0f;
        int i10 = this.f18874l;
        this.f18866d = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f18873k[i11].A(dVar, this, false);
        }
        this.f18874l = 0;
    }

    public void p(a aVar, String str) {
        this.f18872j = aVar;
    }

    public final void t(d dVar, b bVar) {
        int i10 = this.f18874l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f18873k[i11].B(dVar, bVar, false);
        }
        this.f18874l = 0;
    }

    public String toString() {
        if (this.f18864b != null) {
            return "" + this.f18864b;
        }
        return "" + this.f18865c;
    }

    public i(a aVar, String str) {
        this.f18872j = aVar;
    }
}
