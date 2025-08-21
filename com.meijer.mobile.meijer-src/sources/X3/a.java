package X3;

import U3.e;
import U3.r;
import android.graphics.Bitmap;
import c3.C6476a;
import com.google.android.gms.common.api.b;
import com.medallia.digital.mobilesdk.l3;
import d3.D;
import d3.InterfaceC13610l;
import d3.P;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

/* loaded from: classes4.dex */
public final class a implements r {

    /* renamed from: a, reason: collision with root package name */
    private final D f41524a = new D();

    /* renamed from: b, reason: collision with root package name */
    private final D f41525b = new D();

    /* renamed from: c, reason: collision with root package name */
    private final C0891a f41526c = new C0891a();

    /* renamed from: d, reason: collision with root package name */
    private Inflater f41527d;

    /* renamed from: X3.a$a, reason: collision with other inner class name */
    private static final class C0891a {

        /* renamed from: a, reason: collision with root package name */
        private final D f41528a = new D();

        /* renamed from: b, reason: collision with root package name */
        private final int[] f41529b = new int[256];

        /* renamed from: c, reason: collision with root package name */
        private boolean f41530c;

        /* renamed from: d, reason: collision with root package name */
        private int f41531d;

        /* renamed from: e, reason: collision with root package name */
        private int f41532e;

        /* renamed from: f, reason: collision with root package name */
        private int f41533f;

        /* renamed from: g, reason: collision with root package name */
        private int f41534g;

        /* renamed from: h, reason: collision with root package name */
        private int f41535h;

        /* renamed from: i, reason: collision with root package name */
        private int f41536i;

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
                this.f41535h = d10.P();
                this.f41536i = d10.P();
                this.f41528a.S(iK - 4);
                i11 = i10 - 11;
            }
            int iF = this.f41528a.f();
            int iG = this.f41528a.g();
            if (iF >= iG || i11 <= 0) {
                return;
            }
            int iMin = Math.min(i11, iG - iF);
            d10.l(this.f41528a.e(), iF, iMin);
            this.f41528a.W(iF + iMin);
        }

        public void h() {
            this.f41531d = 0;
            this.f41532e = 0;
            this.f41533f = 0;
            this.f41534g = 0;
            this.f41535h = 0;
            this.f41536i = 0;
            this.f41528a.S(0);
            this.f41530c = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(D d10, int i10) {
            if (i10 < 19) {
                return;
            }
            this.f41531d = d10.P();
            this.f41532e = d10.P();
            d10.X(11);
            this.f41533f = d10.P();
            this.f41534g = d10.P();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(D d10, int i10) {
            if (i10 % 5 != 2) {
                return;
            }
            d10.X(2);
            Arrays.fill(this.f41529b, 0);
            int i11 = i10 / 5;
            for (int i12 = 0; i12 < i11; i12++) {
                int iH = d10.H();
                int iH2 = d10.H();
                int iH3 = d10.H();
                int iH4 = d10.H();
                double d11 = iH2;
                double d12 = iH3 - 128;
                double d13 = iH4 - 128;
                this.f41529b[iH] = (P.o((int) ((d11 - (0.34414d * d13)) - (d12 * 0.71414d)), 0, l3.f93323c) << 8) | (d10.H() << 24) | (P.o((int) ((1.402d * d12) + d11), 0, l3.f93323c) << 16) | P.o((int) (d11 + (d13 * 1.772d)), 0, l3.f93323c);
            }
            this.f41530c = true;
        }

        public C6476a d() {
            int iH;
            if (this.f41531d == 0 || this.f41532e == 0 || this.f41535h == 0 || this.f41536i == 0 || this.f41528a.g() == 0 || this.f41528a.f() != this.f41528a.g() || !this.f41530c) {
                return null;
            }
            this.f41528a.W(0);
            int i10 = this.f41535h * this.f41536i;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int iH2 = this.f41528a.H();
                if (iH2 != 0) {
                    iH = i11 + 1;
                    iArr[i11] = this.f41529b[iH2];
                } else {
                    int iH3 = this.f41528a.H();
                    if (iH3 != 0) {
                        iH = ((iH3 & 64) == 0 ? iH3 & 63 : ((iH3 & 63) << 8) | this.f41528a.H()) + i11;
                        Arrays.fill(iArr, i11, iH, (iH3 & 128) == 0 ? this.f41529b[0] : this.f41529b[this.f41528a.H()]);
                    }
                }
                i11 = iH;
            }
            return new C6476a.b().f(Bitmap.createBitmap(iArr, this.f41535h, this.f41536i, Bitmap.Config.ARGB_8888)).k(this.f41533f / this.f41531d).l(0).h(this.f41534g / this.f41532e, 0).i(0).n(this.f41535h / this.f41531d).g(this.f41536i / this.f41532e).a();
        }
    }

    @Override // U3.r
    public int c() {
        return 2;
    }

    @Override // U3.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, InterfaceC13610l<e> interfaceC13610l) {
        this.f41524a.U(bArr, i11 + i10);
        this.f41524a.W(i10);
        if (this.f41527d == null) {
            this.f41527d = new Inflater();
        }
        if (P.J0(this.f41524a, this.f41525b, this.f41527d)) {
            this.f41524a.U(this.f41525b.e(), this.f41525b.g());
        }
        this.f41526c.h();
        ArrayList arrayList = new ArrayList();
        while (this.f41524a.a() >= 3) {
            C6476a c6476aD = d(this.f41524a, this.f41526c);
            if (c6476aD != null) {
                arrayList.add(c6476aD);
            }
        }
        interfaceC13610l.accept(new e(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    private static C6476a d(D d10, C0891a c0891a) {
        int iG = d10.g();
        int iH = d10.H();
        int iP = d10.P();
        int iF = d10.f() + iP;
        C6476a c6476aD = null;
        if (iF > iG) {
            d10.W(iG);
            return null;
        }
        if (iH != 128) {
            switch (iH) {
                case 20:
                    c0891a.g(d10, iP);
                    break;
                case 21:
                    c0891a.e(d10, iP);
                    break;
                case b.RECONNECTION_TIMED_OUT /* 22 */:
                    c0891a.f(d10, iP);
                    break;
            }
        } else {
            c6476aD = c0891a.d();
            c0891a.h();
        }
        d10.W(iF);
        return c6476aD;
    }
}
