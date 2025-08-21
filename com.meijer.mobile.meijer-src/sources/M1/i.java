package M1;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public class i implements Comparable<i> {

    /* renamed from: r, reason: collision with root package name */
    private static int f19603r = 1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f19604a;

    /* renamed from: b, reason: collision with root package name */
    private String f19605b;

    /* renamed from: f, reason: collision with root package name */
    public float f19609f;

    /* renamed from: j, reason: collision with root package name */
    a f19613j;

    /* renamed from: c, reason: collision with root package name */
    public int f19606c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f19607d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f19608e = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19610g = false;

    /* renamed from: h, reason: collision with root package name */
    float[] f19611h = new float[9];

    /* renamed from: i, reason: collision with root package name */
    float[] f19612i = new float[9];

    /* renamed from: k, reason: collision with root package name */
    b[] f19614k = new b[16];

    /* renamed from: l, reason: collision with root package name */
    int f19615l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f19616m = 0;

    /* renamed from: n, reason: collision with root package name */
    boolean f19617n = false;

    /* renamed from: o, reason: collision with root package name */
    int f19618o = -1;

    /* renamed from: p, reason: collision with root package name */
    float f19619p = 0.0f;

    /* renamed from: q, reason: collision with root package name */
    HashSet<b> f19620q = null;

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
            int i11 = this.f19615l;
            if (i10 >= i11) {
                b[] bVarArr = this.f19614k;
                if (i11 >= bVarArr.length) {
                    this.f19614k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f19614k;
                int i12 = this.f19615l;
                bVarArr2[i12] = bVar;
                this.f19615l = i12 + 1;
                return;
            }
            if (this.f19614k[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    public void m() {
        this.f19605b = null;
        this.f19613j = a.UNKNOWN;
        this.f19608e = 0;
        this.f19606c = -1;
        this.f19607d = -1;
        this.f19609f = 0.0f;
        this.f19610g = false;
        this.f19617n = false;
        this.f19618o = -1;
        this.f19619p = 0.0f;
        int i10 = this.f19615l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f19614k[i11] = null;
        }
        this.f19615l = 0;
        this.f19616m = 0;
        this.f19604a = false;
        Arrays.fill(this.f19612i, 0.0f);
    }

    static void e() {
        f19603r++;
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return this.f19606c - iVar.f19606c;
    }

    public final void l(b bVar) {
        int i10 = this.f19615l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f19614k[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f19614k;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f19615l--;
                return;
            }
            i11++;
        }
    }

    public void o(d dVar, float f10) {
        this.f19609f = f10;
        this.f19610g = true;
        this.f19617n = false;
        this.f19618o = -1;
        this.f19619p = 0.0f;
        int i10 = this.f19615l;
        this.f19607d = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f19614k[i11].A(dVar, this, false);
        }
        this.f19615l = 0;
    }

    public void p(a aVar, String str) {
        this.f19613j = aVar;
    }

    public final void t(d dVar, b bVar) {
        int i10 = this.f19615l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f19614k[i11].B(dVar, bVar, false);
        }
        this.f19615l = 0;
    }

    public String toString() {
        if (this.f19605b != null) {
            return "" + this.f19605b;
        }
        return "" + this.f19606c;
    }

    public i(a aVar, String str) {
        this.f19613j = aVar;
    }
}
