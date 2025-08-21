package a3;

import d3.C13599a;
import d3.P;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: f, reason: collision with root package name */
    private static final String f44449f = P.y0(0);

    /* renamed from: g, reason: collision with root package name */
    private static final String f44450g = P.y0(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f44451a;

    /* renamed from: b, reason: collision with root package name */
    public final String f44452b;

    /* renamed from: c, reason: collision with root package name */
    public final int f44453c;

    /* renamed from: d, reason: collision with root package name */
    private final t[] f44454d;

    /* renamed from: e, reason: collision with root package name */
    private int f44455e;

    public G(t... tVarArr) {
        this("", tVarArr);
    }

    public int b(t tVar) {
        int i10 = 0;
        while (true) {
            t[] tVarArr = this.f44454d;
            if (i10 >= tVarArr.length) {
                return -1;
            }
            if (tVar == tVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && G.class == obj.getClass()) {
            G g10 = (G) obj;
            if (this.f44452b.equals(g10.f44452b) && Arrays.equals(this.f44454d, g10.f44454d)) {
                return true;
            }
        }
        return false;
    }

    public G(String str, t... tVarArr) {
        C13599a.a(tVarArr.length > 0);
        this.f44452b = str;
        this.f44454d = tVarArr;
        this.f44451a = tVarArr.length;
        int iK = z.k(tVarArr[0].f44767o);
        this.f44453c = iK == -1 ? z.k(tVarArr[0].f44766n) : iK;
        f();
    }

    private static void c(String str, String str2, String str3, int i10) {
        d3.r.e("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    private static String d(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static int e(int i10) {
        return i10 | 16384;
    }

    private void f() {
        String strD = d(this.f44454d[0].f44756d);
        int iE = e(this.f44454d[0].f44758f);
        int i10 = 1;
        while (true) {
            t[] tVarArr = this.f44454d;
            if (i10 >= tVarArr.length) {
                return;
            }
            if (!strD.equals(d(tVarArr[i10].f44756d))) {
                t[] tVarArr2 = this.f44454d;
                c("languages", tVarArr2[0].f44756d, tVarArr2[i10].f44756d, i10);
                return;
            } else {
                if (iE != e(this.f44454d[i10].f44758f)) {
                    c("role flags", Integer.toBinaryString(this.f44454d[0].f44758f), Integer.toBinaryString(this.f44454d[i10].f44758f), i10);
                    return;
                }
                i10++;
            }
        }
    }

    public t a(int i10) {
        return this.f44454d[i10];
    }

    public int hashCode() {
        if (this.f44455e == 0) {
            this.f44455e = ((527 + this.f44452b.hashCode()) * 31) + Arrays.hashCode(this.f44454d);
        }
        return this.f44455e;
    }

    public String toString() {
        return this.f44452b + ": " + Arrays.toString(this.f44454d);
    }
}
