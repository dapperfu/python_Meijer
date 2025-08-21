package W3;

import Ee.L;
import U3.r;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import c3.C6476a;
import com.medallia.digital.mobilesdk.l3;
import d3.C;
import d3.D;
import d3.InterfaceC13610l;
import d3.P;
import fsimpl.C14170dq;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class a implements r {

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f40699h = {0, 7, 8, C14170dq.MULTIPLY};

    /* renamed from: i, reason: collision with root package name */
    private static final byte[] f40700i = {0, 119, -120, -1};

    /* renamed from: j, reason: collision with root package name */
    private static final byte[] f40701j = {0, C14170dq.ADD, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    private final Paint f40702a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f40703b;

    /* renamed from: c, reason: collision with root package name */
    private final Canvas f40704c;

    /* renamed from: d, reason: collision with root package name */
    private final b f40705d;

    /* renamed from: e, reason: collision with root package name */
    private final C0874a f40706e;

    /* renamed from: f, reason: collision with root package name */
    private final h f40707f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f40708g;

    private static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f40729a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f40730b;

        /* renamed from: c, reason: collision with root package name */
        public final int f40731c;

        /* renamed from: d, reason: collision with root package name */
        public final int f40732d;

        /* renamed from: e, reason: collision with root package name */
        public final int f40733e;

        /* renamed from: f, reason: collision with root package name */
        public final int f40734f;

        /* renamed from: g, reason: collision with root package name */
        public final int f40735g;

        /* renamed from: h, reason: collision with root package name */
        public final int f40736h;

        /* renamed from: i, reason: collision with root package name */
        public final int f40737i;

        /* renamed from: j, reason: collision with root package name */
        public final int f40738j;

        /* renamed from: k, reason: collision with root package name */
        public final SparseArray<g> f40739k;

        public void a(f fVar) {
            SparseArray<g> sparseArray = fVar.f40739k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f40739k.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10));
            }
        }

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray<g> sparseArray) {
            this.f40729a = i10;
            this.f40730b = z10;
            this.f40731c = i11;
            this.f40732d = i12;
            this.f40733e = i13;
            this.f40734f = i14;
            this.f40735g = i15;
            this.f40736h = i16;
            this.f40737i = i17;
            this.f40738j = i18;
            this.f40739k = sparseArray;
        }
    }

    private static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final int f40746a;

        /* renamed from: b, reason: collision with root package name */
        public final int f40747b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray<f> f40748c = new SparseArray<>();

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray<C0874a> f40749d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray<c> f40750e = new SparseArray<>();

        /* renamed from: f, reason: collision with root package name */
        public final SparseArray<C0874a> f40751f = new SparseArray<>();

        /* renamed from: g, reason: collision with root package name */
        public final SparseArray<c> f40752g = new SparseArray<>();

        /* renamed from: h, reason: collision with root package name */
        public b f40753h;

        /* renamed from: i, reason: collision with root package name */
        public d f40754i;

        public void a() {
            this.f40748c.clear();
            this.f40749d.clear();
            this.f40750e.clear();
            this.f40751f.clear();
            this.f40752g.clear();
            this.f40753h = null;
            this.f40754i = null;
        }

        public h(int i10, int i11) {
            this.f40746a = i10;
            this.f40747b = i11;
        }
    }

    private static int i(C c10, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int i12;
        int iH;
        int iH2;
        boolean z11 = false;
        while (true) {
            int iH3 = c10.h(2);
            if (iH3 != 0) {
                z10 = z11;
                i12 = 1;
            } else {
                if (c10.g()) {
                    iH = c10.h(3) + 3;
                    iH2 = c10.h(2);
                } else {
                    if (c10.g()) {
                        z10 = z11;
                        i12 = 1;
                    } else {
                        int iH4 = c10.h(2);
                        if (iH4 == 0) {
                            z10 = true;
                        } else if (iH4 == 1) {
                            z10 = z11;
                            i12 = 2;
                        } else if (iH4 == 2) {
                            iH = c10.h(4) + 12;
                            iH2 = c10.h(2);
                        } else if (iH4 != 3) {
                            z10 = z11;
                        } else {
                            iH = c10.h(8) + 29;
                            iH2 = c10.h(2);
                        }
                        iH3 = 0;
                        i12 = 0;
                    }
                    iH3 = 0;
                }
                z10 = z11;
                i12 = iH;
                iH3 = iH2;
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    iH3 = bArr[iH3];
                }
                paint.setColor(iArr[iH3]);
                canvas.drawRect(i10, i11, i10 + i12, 1 + i11, paint);
            }
            i10 += i12;
            if (z10) {
                return i10;
            }
            z11 = z10;
        }
    }

    private static int j(C c10, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int i12;
        int iH;
        int iH2;
        boolean z11 = false;
        while (true) {
            int iH3 = c10.h(4);
            if (iH3 != 0) {
                z10 = z11;
                i12 = 1;
            } else if (c10.g()) {
                if (c10.g()) {
                    int iH4 = c10.h(2);
                    if (iH4 == 0) {
                        z10 = z11;
                        i12 = 1;
                        iH3 = 0;
                    } else if (iH4 == 1) {
                        iH3 = 0;
                        i12 = 2;
                        z10 = z11;
                    } else if (iH4 == 2) {
                        iH = c10.h(4) + 9;
                        iH2 = c10.h(4);
                    } else if (iH4 != 3) {
                        z10 = z11;
                        iH3 = 0;
                        i12 = 0;
                    } else {
                        iH = c10.h(8) + 25;
                        iH2 = c10.h(4);
                    }
                } else {
                    iH = c10.h(2) + 4;
                    iH2 = c10.h(4);
                }
                z10 = z11;
                i12 = iH;
                iH3 = iH2;
            } else {
                int iH5 = c10.h(3);
                if (iH5 != 0) {
                    z10 = z11;
                    i12 = iH5 + 2;
                    iH3 = 0;
                } else {
                    z10 = true;
                    iH3 = 0;
                    i12 = 0;
                }
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    iH3 = bArr[iH3];
                }
                paint.setColor(iArr[iH3]);
                canvas.drawRect(i10, i11, i10 + i12, 1 + i11, paint);
            }
            i10 += i12;
            if (z10) {
                return i10;
            }
            z11 = z10;
        }
    }

    private static int k(C c10, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int iH;
        boolean z11 = false;
        while (true) {
            int iH2 = c10.h(8);
            if (iH2 != 0) {
                z10 = z11;
                iH = 1;
            } else if (c10.g()) {
                z10 = z11;
                iH = c10.h(7);
                iH2 = c10.h(8);
            } else {
                int iH3 = c10.h(7);
                if (iH3 != 0) {
                    z10 = z11;
                    iH = iH3;
                    iH2 = 0;
                } else {
                    z10 = true;
                    iH2 = 0;
                    iH = 0;
                }
            }
            if (iH != 0 && paint != null) {
                if (bArr != null) {
                    iH2 = bArr[iH2];
                }
                paint.setColor(iArr[iH2]);
                canvas.drawRect(i10, i11, i10 + iH, 1 + i11, paint);
            }
            i10 += iH;
            if (z10) {
                return i10;
            }
            z11 = z10;
        }
    }

    private static void m(c cVar, C0874a c0874a, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr = i10 == 3 ? c0874a.f40712d : i10 == 2 ? c0874a.f40711c : c0874a.f40710b;
        l(cVar.f40721c, iArr, i10, i11, i12, paint, canvas);
        l(cVar.f40722d, iArr, i10, i11, i12 + 1, paint, canvas);
    }

    private static b p(C c10) {
        int i10;
        int i11;
        int i12;
        int iH;
        c10.r(4);
        boolean zG = c10.g();
        c10.r(3);
        int iH2 = c10.h(16);
        int iH3 = c10.h(16);
        if (zG) {
            int iH4 = c10.h(16);
            int iH5 = c10.h(16);
            int iH6 = c10.h(16);
            iH = c10.h(16);
            i12 = iH5;
            i11 = iH6;
            i10 = iH4;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = iH2;
            iH = iH3;
        }
        return new b(iH2, iH3, i10, i12, i11, iH);
    }

    @Override // U3.r
    public int c() {
        return 2;
    }

    /* renamed from: W3.a$a, reason: collision with other inner class name */
    private static final class C0874a {

        /* renamed from: a, reason: collision with root package name */
        public final int f40709a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f40710b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f40711c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f40712d;

        public C0874a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f40709a = i10;
            this.f40710b = iArr;
            this.f40711c = iArr2;
            this.f40712d = iArr3;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f40713a;

        /* renamed from: b, reason: collision with root package name */
        public final int f40714b;

        /* renamed from: c, reason: collision with root package name */
        public final int f40715c;

        /* renamed from: d, reason: collision with root package name */
        public final int f40716d;

        /* renamed from: e, reason: collision with root package name */
        public final int f40717e;

        /* renamed from: f, reason: collision with root package name */
        public final int f40718f;

        public b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f40713a = i10;
            this.f40714b = i11;
            this.f40715c = i12;
            this.f40716d = i13;
            this.f40717e = i14;
            this.f40718f = i15;
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f40719a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f40720b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f40721c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f40722d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f40719a = i10;
            this.f40720b = z10;
            this.f40721c = bArr;
            this.f40722d = bArr2;
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f40723a;

        /* renamed from: b, reason: collision with root package name */
        public final int f40724b;

        /* renamed from: c, reason: collision with root package name */
        public final int f40725c;

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray<e> f40726d;

        public d(int i10, int i11, int i12, SparseArray<e> sparseArray) {
            this.f40723a = i10;
            this.f40724b = i11;
            this.f40725c = i12;
            this.f40726d = sparseArray;
        }
    }

    private static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f40727a;

        /* renamed from: b, reason: collision with root package name */
        public final int f40728b;

        public e(int i10, int i11) {
            this.f40727a = i10;
            this.f40728b = i11;
        }
    }

    private static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f40740a;

        /* renamed from: b, reason: collision with root package name */
        public final int f40741b;

        /* renamed from: c, reason: collision with root package name */
        public final int f40742c;

        /* renamed from: d, reason: collision with root package name */
        public final int f40743d;

        /* renamed from: e, reason: collision with root package name */
        public final int f40744e;

        /* renamed from: f, reason: collision with root package name */
        public final int f40745f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f40740a = i10;
            this.f40741b = i11;
            this.f40742c = i12;
            this.f40743d = i13;
            this.f40744e = i14;
            this.f40745f = i15;
        }
    }

    private static byte[] d(int i10, int i11, C c10) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) c10.h(i11);
        }
        return bArr;
    }

    private static int[] e() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] f() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = h(l3.f93323c, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                int i11 = i10 & 1;
                int i12 = l3.f93324d;
                int i13 = i11 != 0 ? 127 : 0;
                int i14 = (i10 & 2) != 0 ? 127 : 0;
                if ((i10 & 4) == 0) {
                    i12 = 0;
                }
                iArr[i10] = h(l3.f93323c, i13, i14, i12);
            }
        }
        return iArr;
    }

    private static int[] g() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = l3.f93323c;
            if (i10 < 8) {
                int i12 = (i10 & 1) != 0 ? 255 : 0;
                int i13 = (i10 & 2) != 0 ? 255 : 0;
                if ((i10 & 4) == 0) {
                    i11 = 0;
                }
                iArr[i10] = h(63, i12, i13, i11);
            } else {
                int i14 = i10 & 136;
                if (i14 == 0) {
                    iArr[i10] = h(l3.f93323c, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i14 == 8) {
                    iArr[i10] = h(l3.f93324d, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i14 == 128) {
                    iArr[i10] = h(l3.f93323c, ((i10 & 1) != 0 ? 43 : 0) + l3.f93324d + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + l3.f93324d + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + l3.f93324d + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i14 == 136) {
                    iArr[i10] = h(l3.f93323c, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int h(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    private static void l(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr2;
        Paint paint2;
        Canvas canvas2;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        C c10 = new C(bArr);
        byte[] bArrD = null;
        byte[] bArrD2 = null;
        int i13 = i11;
        int i14 = i12;
        byte[] bArrD3 = null;
        while (c10.b() != 0) {
            int iH = c10.h(8);
            if (iH != 240) {
                switch (iH) {
                    case 16:
                        iArr2 = iArr;
                        Paint paint3 = paint;
                        canvas2 = canvas;
                        if (i10 != 3) {
                            if (i10 != 2) {
                                bArr2 = null;
                                paint2 = paint3;
                                i13 = i(c10, iArr2, bArr2, i13, i14, paint2, canvas2);
                                c10.c();
                                break;
                            } else {
                                bArr3 = bArrD2 == null ? f40699h : bArrD2;
                            }
                        } else {
                            bArr3 = bArrD3 == null ? f40700i : bArrD3;
                        }
                        paint2 = paint3;
                        bArr2 = bArr3;
                        i13 = i(c10, iArr2, bArr2, i13, i14, paint2, canvas2);
                        c10.c();
                    case 17:
                        iArr2 = iArr;
                        Paint paint4 = paint;
                        canvas2 = canvas;
                        if (i10 == 3) {
                            bArr4 = bArrD == null ? f40701j : bArrD;
                        } else {
                            bArr4 = null;
                        }
                        paint2 = paint4;
                        i13 = j(c10, iArr2, bArr4, i13, i14, paint2, canvas2);
                        c10.c();
                        break;
                    case 18:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        i13 = k(c10, iArr2, null, i13, i14, paint2, canvas2);
                        break;
                    default:
                        switch (iH) {
                            case l3.f93325e /* 32 */:
                                bArrD2 = d(4, 4, c10);
                                break;
                            case 33:
                                bArrD3 = d(4, 8, c10);
                                break;
                            case 34:
                                bArrD = d(16, 8, c10);
                                break;
                        }
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        break;
                }
            } else {
                iArr2 = iArr;
                paint2 = paint;
                canvas2 = canvas;
                i14 += 2;
                i13 = i11;
            }
            iArr = iArr2;
            paint = paint2;
            canvas = canvas2;
        }
    }

    private U3.e n(C c10) {
        SparseArray<e> sparseArray;
        int i10;
        while (c10.b() >= 48 && c10.h(8) == 15) {
            t(c10, this.f40707f);
        }
        h hVar = this.f40707f;
        d dVar = hVar.f40754i;
        if (dVar == null) {
            return new U3.e(L.x(), -9223372036854775807L, -9223372036854775807L);
        }
        b bVar = hVar.f40753h;
        if (bVar == null) {
            bVar = this.f40705d;
        }
        Bitmap bitmap = this.f40708g;
        if (bitmap == null || bVar.f40713a + 1 != bitmap.getWidth() || bVar.f40714b + 1 != this.f40708g.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bVar.f40713a + 1, bVar.f40714b + 1, Bitmap.Config.ARGB_8888);
            this.f40708g = bitmapCreateBitmap;
            this.f40704c.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray2 = dVar.f40726d;
        int i11 = 0;
        while (i11 < sparseArray2.size()) {
            this.f40704c.save();
            e eVarValueAt = sparseArray2.valueAt(i11);
            f fVar = this.f40707f.f40748c.get(sparseArray2.keyAt(i11));
            int i12 = eVarValueAt.f40727a + bVar.f40715c;
            int i13 = eVarValueAt.f40728b + bVar.f40717e;
            this.f40704c.clipRect(i12, i13, Math.min(fVar.f40731c + i12, bVar.f40716d), Math.min(fVar.f40732d + i13, bVar.f40718f));
            C0874a c0874a = this.f40707f.f40749d.get(fVar.f40735g);
            if (c0874a == null && (c0874a = this.f40707f.f40751f.get(fVar.f40735g)) == null) {
                c0874a = this.f40706e;
            }
            C0874a c0874a2 = c0874a;
            SparseArray<g> sparseArray3 = fVar.f40739k;
            int i14 = 0;
            while (i14 < sparseArray3.size()) {
                int iKeyAt = sparseArray3.keyAt(i14);
                g gVarValueAt = sparseArray3.valueAt(i14);
                c cVar = this.f40707f.f40750e.get(iKeyAt);
                if (cVar == null) {
                    cVar = this.f40707f.f40752g.get(iKeyAt);
                }
                if (cVar != null) {
                    sparseArray = sparseArray2;
                    i10 = i14;
                    m(cVar, c0874a2, fVar.f40734f, gVarValueAt.f40742c + i12, gVarValueAt.f40743d + i13, cVar.f40720b ? null : this.f40702a, this.f40704c);
                } else {
                    sparseArray = sparseArray2;
                    i10 = i14;
                }
                i14 = i10 + 1;
                sparseArray2 = sparseArray;
            }
            SparseArray<e> sparseArray4 = sparseArray2;
            if (fVar.f40730b) {
                int i15 = fVar.f40734f;
                this.f40703b.setColor(i15 == 3 ? c0874a2.f40712d[fVar.f40736h] : i15 == 2 ? c0874a2.f40711c[fVar.f40737i] : c0874a2.f40710b[fVar.f40738j]);
                this.f40704c.drawRect(i12, i13, fVar.f40731c + i12, fVar.f40732d + i13, this.f40703b);
            }
            arrayList.add(new C6476a.b().f(Bitmap.createBitmap(this.f40708g, i12, i13, fVar.f40731c, fVar.f40732d)).k(i12 / bVar.f40713a).l(0).h(i13 / bVar.f40714b, 0).i(0).n(fVar.f40731c / bVar.f40713a).g(fVar.f40732d / bVar.f40714b).a());
            this.f40704c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f40704c.restore();
            i11++;
            sparseArray2 = sparseArray4;
        }
        return new U3.e(arrayList, -9223372036854775807L, -9223372036854775807L);
    }

    private static C0874a o(C c10, int i10) {
        int iH;
        int i11;
        int iH2;
        int iH3;
        int iH4;
        int i12 = 8;
        int iH5 = c10.h(8);
        c10.r(8);
        int i13 = 2;
        int i14 = i10 - 2;
        int[] iArrE = e();
        int[] iArrF = f();
        int[] iArrG = g();
        while (i14 > 0) {
            int iH6 = c10.h(i12);
            int iH7 = c10.h(i12);
            int[] iArr = (iH7 & 128) != 0 ? iArrE : (iH7 & 64) != 0 ? iArrF : iArrG;
            if ((iH7 & 1) != 0) {
                iH3 = c10.h(i12);
                iH4 = c10.h(i12);
                iH = c10.h(i12);
                iH2 = c10.h(i12);
                i11 = i14 - 6;
            } else {
                int iH8 = c10.h(6) << i13;
                int iH9 = c10.h(4) << 4;
                iH = c10.h(4) << 4;
                i11 = i14 - 4;
                iH2 = c10.h(i13) << 6;
                iH3 = iH8;
                iH4 = iH9;
            }
            if (iH3 == 0) {
                iH2 = 255;
                iH4 = 0;
                iH = 0;
            }
            double d10 = iH3;
            double d11 = iH4 - 128;
            double d12 = iH - 128;
            iArr[iH6] = h((byte) (255 - (iH2 & l3.f93323c)), P.o((int) (d10 + (1.402d * d11)), 0, l3.f93323c), P.o((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, l3.f93323c), P.o((int) (d10 + (d12 * 1.772d)), 0, l3.f93323c));
            i14 = i11;
            iH5 = iH5;
            i12 = 8;
            i13 = 2;
        }
        return new C0874a(iH5, iArrE, iArrF, iArrG);
    }

    private static c q(C c10) {
        byte[] bArr;
        int iH = c10.h(16);
        c10.r(4);
        int iH2 = c10.h(2);
        boolean zG = c10.g();
        c10.r(1);
        byte[] bArr2 = P.f127893f;
        if (iH2 != 1) {
            if (iH2 == 0) {
                int iH3 = c10.h(16);
                int iH4 = c10.h(16);
                if (iH3 > 0) {
                    bArr2 = new byte[iH3];
                    c10.k(bArr2, 0, iH3);
                }
                if (iH4 > 0) {
                    bArr = new byte[iH4];
                    c10.k(bArr, 0, iH4);
                }
            }
            return new c(iH, zG, bArr2, bArr);
        }
        c10.r(c10.h(8) * 16);
        bArr = bArr2;
        return new c(iH, zG, bArr2, bArr);
    }

    private static d r(C c10, int i10) {
        int iH = c10.h(8);
        int iH2 = c10.h(4);
        int iH3 = c10.h(2);
        c10.r(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int iH4 = c10.h(8);
            c10.r(8);
            i11 -= 6;
            sparseArray.put(iH4, new e(c10.h(16), c10.h(16)));
        }
        return new d(iH, iH2, iH3, sparseArray);
    }

    private static f s(C c10, int i10) {
        int i11;
        int iH;
        int iH2;
        char c11;
        int iH3 = c10.h(8);
        int i12 = 4;
        c10.r(4);
        boolean zG = c10.g();
        c10.r(3);
        int i13 = 16;
        int iH4 = c10.h(16);
        int iH5 = c10.h(16);
        int iH6 = c10.h(3);
        int iH7 = c10.h(3);
        int i14 = 2;
        c10.r(2);
        int iH8 = c10.h(8);
        int iH9 = c10.h(8);
        int iH10 = c10.h(4);
        int iH11 = c10.h(2);
        c10.r(2);
        int i15 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i15 > 0) {
            int iH12 = c10.h(i13);
            int iH13 = c10.h(i14);
            int iH14 = c10.h(i14);
            int iH15 = c10.h(12);
            c10.r(i12);
            int iH16 = c10.h(12);
            int i16 = i15 - 6;
            if (iH13 != 1) {
                i11 = 2;
                if (iH13 != 2) {
                    iH2 = 0;
                    iH = 0;
                    i15 = i16;
                    c11 = '\b';
                }
                sparseArray.put(iH12, new g(iH13, iH14, iH15, iH16, iH2, iH));
                i13 = 16;
                i14 = i11;
                i12 = 4;
            } else {
                i11 = 2;
            }
            c11 = '\b';
            i15 -= 8;
            iH2 = c10.h(8);
            iH = c10.h(8);
            sparseArray.put(iH12, new g(iH13, iH14, iH15, iH16, iH2, iH));
            i13 = 16;
            i14 = i11;
            i12 = 4;
        }
        return new f(iH3, zG, iH4, iH5, iH6, iH7, iH8, iH9, iH10, iH11, sparseArray);
    }

    private static void t(C c10, h hVar) {
        f fVar;
        int iH = c10.h(8);
        int iH2 = c10.h(16);
        int iH3 = c10.h(16);
        int iD = c10.d() + iH3;
        if (iH3 * 8 > c10.b()) {
            d3.r.i("DvbParser", "Data field length exceeds limit");
            c10.r(c10.b());
            return;
        }
        switch (iH) {
            case 16:
                if (iH2 == hVar.f40746a) {
                    d dVar = hVar.f40754i;
                    d dVarR = r(c10, iH3);
                    if (dVarR.f40725c == 0) {
                        if (dVar != null && dVar.f40724b != dVarR.f40724b) {
                            hVar.f40754i = dVarR;
                            break;
                        }
                    } else {
                        hVar.f40754i = dVarR;
                        hVar.f40748c.clear();
                        hVar.f40749d.clear();
                        hVar.f40750e.clear();
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f40754i;
                if (iH2 == hVar.f40746a && dVar2 != null) {
                    f fVarS = s(c10, iH3);
                    if (dVar2.f40725c == 0 && (fVar = hVar.f40748c.get(fVarS.f40729a)) != null) {
                        fVarS.a(fVar);
                    }
                    hVar.f40748c.put(fVarS.f40729a, fVarS);
                    break;
                }
                break;
            case 18:
                if (iH2 != hVar.f40746a) {
                    if (iH2 == hVar.f40747b) {
                        C0874a c0874aO = o(c10, iH3);
                        hVar.f40751f.put(c0874aO.f40709a, c0874aO);
                        break;
                    }
                } else {
                    C0874a c0874aO2 = o(c10, iH3);
                    hVar.f40749d.put(c0874aO2.f40709a, c0874aO2);
                    break;
                }
                break;
            case 19:
                if (iH2 != hVar.f40746a) {
                    if (iH2 == hVar.f40747b) {
                        c cVarQ = q(c10);
                        hVar.f40752g.put(cVarQ.f40719a, cVarQ);
                        break;
                    }
                } else {
                    c cVarQ2 = q(c10);
                    hVar.f40750e.put(cVarQ2.f40719a, cVarQ2);
                    break;
                }
                break;
            case 20:
                if (iH2 == hVar.f40746a) {
                    hVar.f40753h = p(c10);
                    break;
                }
                break;
        }
        c10.s(iD - c10.d());
    }

    @Override // U3.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, InterfaceC13610l<U3.e> interfaceC13610l) {
        C c10 = new C(bArr, i11 + i10);
        c10.p(i10);
        interfaceC13610l.accept(n(c10));
    }

    @Override // U3.r
    public void reset() {
        this.f40707f.a();
    }

    public a(List<byte[]> list) {
        D d10 = new D(list.get(0));
        int iP = d10.P();
        int iP2 = d10.P();
        Paint paint = new Paint();
        this.f40702a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f40703b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f40704c = new Canvas();
        this.f40705d = new b(719, 575, 0, 719, 0, 575);
        this.f40706e = new C0874a(0, e(), f(), g());
        this.f40707f = new h(iP, iP2);
    }
}
