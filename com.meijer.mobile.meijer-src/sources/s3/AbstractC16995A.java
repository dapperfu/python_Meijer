package s3;

import a3.F;
import a3.G;
import android.util.Pair;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.I0;
import androidx.media3.exoplayer.source.r;
import d3.P;
import h3.K;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: s3.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16995A extends AbstractC16998D {

    /* renamed from: c, reason: collision with root package name */
    private a f159743c;

    /* renamed from: s3.A$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f159744a;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f159745b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f159746c;

        /* renamed from: d, reason: collision with root package name */
        private final p3.w[] f159747d;

        /* renamed from: e, reason: collision with root package name */
        private final int[] f159748e;

        /* renamed from: f, reason: collision with root package name */
        private final int[][][] f159749f;

        /* renamed from: g, reason: collision with root package name */
        private final p3.w f159750g;

        public int b(int i10, int i11, int[] iArr) {
            int i12 = 0;
            int iMin = 16;
            String str = null;
            boolean z10 = false;
            int i13 = 0;
            while (i12 < iArr.length) {
                String str2 = this.f159747d[i10].b(i11).a(iArr[i12]).f44767o;
                int i14 = i13 + 1;
                if (i13 == 0) {
                    str = str2;
                } else {
                    z10 |= !Objects.equals(str, str2);
                }
                iMin = Math.min(iMin, I0.u(this.f159749f[i10][i11][i12]));
                i12++;
                i13 = i14;
            }
            return z10 ? Math.min(iMin, this.f159748e[i10]) : iMin;
        }

        public int a(int i10, int i11, boolean z10) {
            int i12 = this.f159747d[i10].b(i11).f44451a;
            int[] iArr = new int[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                int iG = g(i10, i11, i14);
                if (iG == 4 || (z10 && iG == 3)) {
                    iArr[i13] = i14;
                    i13++;
                }
            }
            return b(i10, i11, Arrays.copyOf(iArr, i13));
        }

        public int c(int i10, int i11, int i12) {
            return this.f159749f[i10][i11][i12];
        }

        public int d() {
            return this.f159744a;
        }

        public int e(int i10) {
            return this.f159746c[i10];
        }

        public p3.w f(int i10) {
            return this.f159747d[i10];
        }

        public p3.w h() {
            return this.f159750g;
        }

        a(String[] strArr, int[] iArr, p3.w[] wVarArr, int[] iArr2, int[][][] iArr3, p3.w wVar) {
            this.f159745b = strArr;
            this.f159746c = iArr;
            this.f159747d = wVarArr;
            this.f159749f = iArr3;
            this.f159748e = iArr2;
            this.f159750g = wVar;
            this.f159744a = iArr.length;
        }

        public int g(int i10, int i11, int i12) {
            return I0.Q(c(i10, i11, i12));
        }
    }

    private static int n(I0[] i0Arr, G g10, int[] iArr, boolean z10) throws ExoPlaybackException {
        int length = i0Arr.length;
        int i10 = 0;
        boolean z11 = true;
        for (int i11 = 0; i11 < i0Arr.length; i11++) {
            I0 i02 = i0Arr[i11];
            int iMax = 0;
            for (int i12 = 0; i12 < g10.f44451a; i12++) {
                iMax = Math.max(iMax, I0.Q(i02.a(g10.a(i12))));
            }
            boolean z12 = iArr[i11] == 0;
            if (iMax > i10 || (iMax == i10 && z10 && !z11 && z12)) {
                length = i11;
                z11 = z12;
                i10 = iMax;
            }
        }
        return length;
    }

    private static int[] p(I0[] i0Arr) throws ExoPlaybackException {
        int length = i0Arr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = i0Arr[i10].M();
        }
        return iArr;
    }

    @Override // s3.AbstractC16998D
    public final C16999E k(I0[] i0Arr, p3.w wVar, r.b bVar, F f10) throws ExoPlaybackException {
        int[] iArr = new int[i0Arr.length + 1];
        int length = i0Arr.length + 1;
        G[][] gArr = new G[length][];
        int[][][] iArr2 = new int[i0Arr.length + 1][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = wVar.f156149a;
            gArr[i10] = new G[i11];
            iArr2[i10] = new int[i11][];
        }
        int[] iArrP = p(i0Arr);
        for (int i12 = 0; i12 < wVar.f156149a; i12++) {
            G gB = wVar.b(i12);
            int iN = n(i0Arr, gB, iArr, gB.f44453c == 5);
            int[] iArrO = iN == i0Arr.length ? new int[gB.f44451a] : o(i0Arr[iN], gB);
            int i13 = iArr[iN];
            gArr[iN][i13] = gB;
            iArr2[iN][i13] = iArrO;
            iArr[iN] = i13 + 1;
        }
        p3.w[] wVarArr = new p3.w[i0Arr.length];
        String[] strArr = new String[i0Arr.length];
        int[] iArr3 = new int[i0Arr.length];
        for (int i14 = 0; i14 < i0Arr.length; i14++) {
            int i15 = iArr[i14];
            wVarArr[i14] = new p3.w((G[]) P.R0(gArr[i14], i15));
            iArr2[i14] = (int[][]) P.R0(iArr2[i14], i15);
            strArr[i14] = i0Arr[i14].getName();
            iArr3[i14] = i0Arr[i14].g();
        }
        a aVar = new a(strArr, iArr3, wVarArr, iArrP, iArr2, new p3.w((G[]) P.R0(gArr[i0Arr.length], iArr[i0Arr.length])));
        Pair<K[], y[]> pairQ = q(aVar, iArr2, iArrP, bVar, f10);
        return new C16999E((K[]) pairQ.first, (y[]) pairQ.second, C16997C.b(aVar, (InterfaceC16996B[]) pairQ.second), aVar);
    }

    protected abstract Pair<K[], y[]> q(a aVar, int[][][] iArr, int[] iArr2, r.b bVar, F f10) throws ExoPlaybackException;

    private static int[] o(I0 i02, G g10) throws ExoPlaybackException {
        int[] iArr = new int[g10.f44451a];
        for (int i10 = 0; i10 < g10.f44451a; i10++) {
            iArr[i10] = i02.a(g10.a(i10));
        }
        return iArr;
    }

    @Override // s3.AbstractC16998D
    public final void i(Object obj) {
        this.f159743c = (a) obj;
    }
}
