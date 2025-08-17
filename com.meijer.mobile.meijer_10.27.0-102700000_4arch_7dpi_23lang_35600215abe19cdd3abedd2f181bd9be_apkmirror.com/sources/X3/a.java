package X3;

import U3.e;
import U3.r;
import android.graphics.Bitmap;
import c3.C6350a;
import com.google.android.gms.common.api.b;
import com.medallia.digital.mobilesdk.l3;
import d3.D;
import d3.InterfaceC13477l;
import d3.P;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

/* loaded from: classes4.dex */
public final class a implements r {

    /* renamed from: a, reason: collision with root package name */
    private final D f39102a = new D();

    /* renamed from: b, reason: collision with root package name */
    private final D f39103b = new D();

    /* renamed from: c, reason: collision with root package name */
    private final C0839a f39104c = new C0839a();

    /* renamed from: d, reason: collision with root package name */
    private Inflater f39105d;

    /* renamed from: X3.a$a, reason: collision with other inner class name */
    private static final class C0839a {

        /* renamed from: a, reason: collision with root package name */
        private final D f39106a = new D();

        /* renamed from: b, reason: collision with root package name */
        private final int[] f39107b = new int[256];

        /* renamed from: c, reason: collision with root package name */
        private boolean f39108c;

        /* renamed from: d, reason: collision with root package name */
        private int f39109d;

        /* renamed from: e, reason: collision with root package name */
        private int f39110e;

        /* renamed from: f, reason: collision with root package name */
        private int f39111f;

        /* renamed from: g, reason: collision with root package name */
        private int f39112g;

        /* renamed from: h, reason: collision with root package name */
        private int f39113h;

        /* renamed from: i, reason: collision with root package name */
        private int f39114i;

        /* JADX INFO: Access modifiers changed from: private */
        public void e(D d10, int i10) {
            int iK;
            if (i10 < 4) {
                return;
            }
            d10.X(3);
            int i11 = i10 - 4;
            if ((d10.H() & 128) != 0) {
                if (i11 < 7 || (iK = d10.K()) < 4) {
                    return;
                }
                this.f39113h = d10.P();
                this.f39114i = d10.P();
                this.f39106a.S(iK - 4);
                i11 = i10 - 11;
            }
            int iF = this.f39106a.f();
            int iG = this.f39106a.g();
            if (iF >= iG || i11 <= 0) {
                return;
            }
            int iMin = Math.min(i11, iG - iF);
            d10.l(this.f39106a.e(), iF, iMin);
            this.f39106a.W(iF + iMin);
        }

        public void h() {
            this.f39109d = 0;
            this.f39110e = 0;
            this.f39111f = 0;
            this.f39112g = 0;
            this.f39113h = 0;
            this.f39114i = 0;
            this.f39106a.S(0);
            this.f39108c = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(D d10, int i10) {
            if (i10 < 19) {
                return;
            }
            this.f39109d = d10.P();
            this.f39110e = d10.P();
            d10.X(11);
            this.f39111f = d10.P();
            this.f39112g = d10.P();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(D d10, int i10) {
            if (i10 % 5 != 2) {
                return;
            }
            d10.X(2);
            Arrays.fill(this.f39107b, 0);
            int i11 = i10 / 5;
            for (int i12 = 0; i12 < i11; i12++) {
                int iH = d10.H();
                int iH2 = d10.H();
                int iH3 = d10.H();
                int iH4 = d10.H();
                double d11 = iH2;
                double d12 = iH3 - 128;
                double d13 = iH4 - 128;
                this.f39107b[iH] = (P.o((int) ((d11 - (0.34414d * d13)) - (d12 * 0.71414d)), 0, l3.f92484c) << 8) | (d10.H() << 24) | (P.o((int) ((1.402d * d12) + d11), 0, l3.f92484c) << 16) | P.o((int) (d11 + (d13 * 1.772d)), 0, l3.f92484c);
            }
            this.f39108c = true;
        }

        public C6350a d() {
            int iH;
            if (this.f39109d == 0 || this.f39110e == 0 || this.f39113h == 0 || this.f39114i == 0 || this.f39106a.g() == 0 || this.f39106a.f() != this.f39106a.g() || !this.f39108c) {
                return null;
            }
            this.f39106a.W(0);
            int i10 = this.f39113h * this.f39114i;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int iH2 = this.f39106a.H();
                if (iH2 != 0) {
                    iH = i11 + 1;
                    iArr[i11] = this.f39107b[iH2];
                } else {
                    int iH3 = this.f39106a.H();
                    if (iH3 != 0) {
                        iH = ((iH3 & 64) == 0 ? iH3 & 63 : ((iH3 & 63) << 8) | this.f39106a.H()) + i11;
                        Arrays.fill(iArr, i11, iH, (iH3 & 128) == 0 ? this.f39107b[0] : this.f39107b[this.f39106a.H()]);
                    }
                }
                i11 = iH;
            }
            return new C6350a.b().f(Bitmap.createBitmap(iArr, this.f39113h, this.f39114i, Bitmap.Config.ARGB_8888)).k(this.f39111f / this.f39109d).l(0).h(this.f39112g / this.f39110e, 0).i(0).n(this.f39113h / this.f39109d).g(this.f39114i / this.f39110e).a();
        }
    }

    @Override // U3.r
    public int c() {
        return 2;
    }

    @Override // U3.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, InterfaceC13477l<e> interfaceC13477l) {
        this.f39102a.U(bArr, i11 + i10);
        this.f39102a.W(i10);
        if (this.f39105d == null) {
            this.f39105d = new Inflater();
        }
        if (P.J0(this.f39102a, this.f39103b, this.f39105d)) {
            this.f39102a.U(this.f39103b.e(), this.f39103b.g());
        }
        this.f39104c.h();
        ArrayList arrayList = new ArrayList();
        while (this.f39102a.a() >= 3) {
            C6350a c6350aD = d(this.f39102a, this.f39104c);
            if (c6350aD != null) {
                arrayList.add(c6350aD);
            }
        }
        interfaceC13477l.accept(new e(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    private static C6350a d(D d10, C0839a c0839a) {
        int iG = d10.g();
        int iH = d10.H();
        int iP = d10.P();
        int iF = d10.f() + iP;
        C6350a c6350aD = null;
        if (iF > iG) {
            d10.W(iG);
            return null;
        }
        if (iH != 128) {
            switch (iH) {
                case 20:
                    c0839a.g(d10, iP);
                    break;
                case 21:
                    c0839a.e(d10, iP);
                    break;
                case b.RECONNECTION_TIMED_OUT /* 22 */:
                    c0839a.f(d10, iP);
                    break;
            }
        } else {
            c6350aD = c0839a.d();
            c0839a.h();
        }
        d10.W(iF);
        return c6350aD;
    }
}
