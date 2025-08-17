package a3;

import d3.C13466a;
import d3.P;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: f, reason: collision with root package name */
    private static final String f43631f = P.y0(0);

    /* renamed from: g, reason: collision with root package name */
    private static final String f43632g = P.y0(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f43633a;

    /* renamed from: b, reason: collision with root package name */
    public final String f43634b;

    /* renamed from: c, reason: collision with root package name */
    public final int f43635c;

    /* renamed from: d, reason: collision with root package name */
    private final t[] f43636d;

    /* renamed from: e, reason: collision with root package name */
    private int f43637e;

    public G(t... tVarArr) {
        this("", tVarArr);
    }

    public int b(t tVar) {
        int i10 = 0;
        while (true) {
            t[] tVarArr = this.f43636d;
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
            if (this.f43634b.equals(g10.f43634b) && Arrays.equals(this.f43636d, g10.f43636d)) {
                return true;
            }
        }
        return false;
    }

    public G(String str, t... tVarArr) {
        C13466a.a(tVarArr.length > 0);
        this.f43634b = str;
        this.f43636d = tVarArr;
        this.f43633a = tVarArr.length;
        int iK = z.k(tVarArr[0].f43949o);
        this.f43635c = iK == -1 ? z.k(tVarArr[0].f43948n) : iK;
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
        String strD = d(this.f43636d[0].f43938d);
        int iE = e(this.f43636d[0].f43940f);
        int i10 = 1;
        while (true) {
            t[] tVarArr = this.f43636d;
            if (i10 >= tVarArr.length) {
                return;
            }
            if (!strD.equals(d(tVarArr[i10].f43938d))) {
                t[] tVarArr2 = this.f43636d;
                c("languages", tVarArr2[0].f43938d, tVarArr2[i10].f43938d, i10);
                return;
            } else {
                if (iE != e(this.f43636d[i10].f43940f)) {
                    c("role flags", Integer.toBinaryString(this.f43636d[0].f43940f), Integer.toBinaryString(this.f43636d[i10].f43940f), i10);
                    return;
                }
                i10++;
            }
        }
    }

    public t a(int i10) {
        return this.f43636d[i10];
    }

    public int hashCode() {
        if (this.f43637e == 0) {
            this.f43637e = ((527 + this.f43634b.hashCode()) * 31) + Arrays.hashCode(this.f43636d);
        }
        return this.f43637e;
    }

    public String toString() {
        return this.f43634b + ": " + Arrays.toString(this.f43636d);
    }
}
