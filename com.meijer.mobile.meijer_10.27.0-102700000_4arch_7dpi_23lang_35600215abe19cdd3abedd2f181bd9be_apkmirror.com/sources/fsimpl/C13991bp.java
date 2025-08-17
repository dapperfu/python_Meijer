package fsimpl;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import com.fullstory.util.Log;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/* renamed from: fsimpl.bp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C13991bp implements InterfaceC13990bo {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f131841a;

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f131842b;

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f131843c = {32, 104, 116, 112};

    /* renamed from: d, reason: collision with root package name */
    private static final C13992bq f131844d;

    /* renamed from: e, reason: collision with root package name */
    private static final C13992bq f131845e;

    /* renamed from: f, reason: collision with root package name */
    private static final C13992bq[] f131846f;

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f131847g;

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f131848h;

    /* renamed from: i, reason: collision with root package name */
    private static final byte[] f131849i;

    /* renamed from: x, reason: collision with root package name */
    private static boolean f131850x;

    /* renamed from: y, reason: collision with root package name */
    private static final Paint f131851y;

    /* renamed from: j, reason: collision with root package name */
    private int f131852j;

    /* renamed from: k, reason: collision with root package name */
    private int f131853k;

    /* renamed from: l, reason: collision with root package name */
    private int f131854l;

    /* renamed from: m, reason: collision with root package name */
    private int f131855m;

    /* renamed from: n, reason: collision with root package name */
    private int f131856n;

    /* renamed from: o, reason: collision with root package name */
    private int f131857o;

    /* renamed from: p, reason: collision with root package name */
    private int f131858p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f131859q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f131860r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f131861s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f131862t;

    /* renamed from: u, reason: collision with root package name */
    private Picture f131863u;

    /* renamed from: v, reason: collision with root package name */
    private ByteArrayOutputStream f131864v = new ByteArrayOutputStream();

    /* renamed from: w, reason: collision with root package name */
    private RectF f131865w = new RectF();

    static {
        byte[] bArr = {0, 1, 2, 4, 5, 0, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        f131841a = bArr;
        byte[] bArr2 = {0, 1, 2, 4, 5, 0, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        f131842b = bArr2;
        C13992bq c13992bq = new C13992bq(false, true, bArr);
        f131844d = c13992bq;
        C13992bq c13992bq2 = new C13992bq(true, true, bArr2);
        f131845e = c13992bq2;
        f131846f = new C13992bq[]{c13992bq, c13992bq2};
        f131847g = new byte[]{28, 0, 0, 0};
        f131848h = new byte[]{31, 0, 0, 0};
        f131849i = new byte[]{0, 0, Byte.MIN_VALUE, 63, 0, 0, 0, 64, 0, 0, 64, 64, 0, 0, Byte.MIN_VALUE, 64};
        f131850x = true;
        Paint paint = new Paint();
        f131851y = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    C13991bp() {
        c(a(b()));
    }

    private byte a(byte b10) {
        return (this.f131859q || b10 < 3) ? b10 : (byte) (b10 + 1);
    }

    private static int a(int i10, int i11) {
        return i10 == -1 ? i11 == -1 ? -1 : 1 : (i11 != -1 && i10 >= i11) ? 1 : 0;
    }

    private static int a(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    private int a(byte[] bArr, gh ghVar) {
        int i10 = this.f131852j;
        byte b10 = bArr[i10];
        byte[] bArr2 = f131843c;
        int iB = 0;
        if (b10 != bArr2[0] || bArr[i10 + 1] != bArr2[1] || bArr[i10 + 2] != bArr2[2] || bArr[i10 + 3] != bArr2[3]) {
            Log.i("Path failed sanity check");
            d(bArr);
            return 0;
        }
        int iA = a(bArr, this.f131853k);
        int iA2 = a(bArr, this.f131854l);
        int i11 = this.f131855m;
        int iA3 = i11 != -1 ? a(bArr, i11) : 0;
        if (iA < 0 || iA2 < 0 || iA3 < 0) {
            Log.i(String.format("Path failed sanity check: points=%d verbs=%d", Integer.valueOf(iA), Integer.valueOf(iA2)));
            d(bArr);
            return 0;
        }
        if (iA > 200 || iA2 > 200 || iA3 > 50) {
            Log.i(String.format("Path failed sanity check: points=%d verbs=%d", Integer.valueOf(iA), Integer.valueOf(iA2)));
            d(bArr);
            return 0;
        }
        int i12 = this.f131856n;
        int i13 = this.f131857o;
        int i14 = this.f131858p;
        if (this.f131861s) {
            i13 += iA * 8;
        } else {
            i12 += iA2 * 1;
        }
        if (i14 != -1) {
            i14 += (iA * 8) + (iA2 * 1);
        }
        int i15 = iA * 2;
        C14040dk.d(ghVar, i15);
        for (int i16 = i15 - 1; i16 >= 0; i16--) {
            ghVar.b(b(bArr, (i16 * 4) + i12));
        }
        int iB2 = ghVar.b();
        C14040dk.b(ghVar, iA2);
        if (this.f131860r) {
            for (int i17 = 0; i17 < iA2; i17++) {
                byte bA = a(bArr[i13 + i17]);
                if (bA < 0 || bA > 6) {
                    Log.i(String.format("Path failed sanity check: verb=%d", Byte.valueOf(bA)));
                    d(bArr);
                    ghVar.b();
                    return 0;
                }
                ghVar.b(bA);
            }
        } else {
            for (int i18 = iA2 - 1; i18 >= 0; i18--) {
                byte bA2 = a(bArr[i13 + i18]);
                if (bA2 < 0 || bA2 > 6) {
                    Log.i(String.format("Path failed sanity check: verb=%d", Byte.valueOf(bA2)));
                    d(bArr);
                    ghVar.b();
                    return 0;
                }
                ghVar.b(bA2);
            }
        }
        int iB3 = ghVar.b();
        if (iA3 > 0 && i14 != -1) {
            C14040dk.f(ghVar, iA3);
            for (int i19 = iA3 - 1; i19 >= 0; i19--) {
                ghVar.b(b(bArr, (i19 * 4) + i14));
            }
            iB = ghVar.b();
        }
        return C14040dk.a(ghVar, iB3, iB2, iB);
    }

    private static int a(byte[] bArr, byte[] bArr2) {
        return a(bArr, bArr2, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
    
        r7 = r7 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int a(byte[] r5, byte[] r6, int r7) {
        /*
            int r0 = r6.length
            int r1 = r5.length
            r2 = -1
            if (r0 >= r1) goto L6
            return r2
        L6:
            int r0 = r5.length
            int r0 = r0 + (-1)
            int r7 = r7 + r0
        La:
            int r1 = r6.length
            if (r7 >= r1) goto L21
            r1 = r0
        Le:
            if (r1 < 0) goto L1f
            int r3 = r7 - r0
            int r3 = r3 + r1
            r3 = r6[r3]
            r4 = r5[r1]
            if (r3 == r4) goto L1c
            int r7 = r7 + 1
            goto La
        L1c:
            int r1 = r1 + (-1)
            goto Le
        L1f:
            int r7 = r7 - r0
            return r7
        L21:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: fsimpl.C13991bp.a(byte[], byte[], int):int");
    }

    private byte[] a(Path path) {
        if (this.f131863u == null) {
            this.f131863u = new Picture();
        }
        Canvas canvasBeginRecording = this.f131863u.beginRecording(128, 128);
        canvasBeginRecording.drawPath(path, f131851y);
        canvasBeginRecording.saveLayer(0.0f, 0.0f, 0.0f, 0.0f, null, 31);
        this.f131863u.endRecording();
        this.f131863u.writeToStream(this.f131864v);
        byte[] byteArray = this.f131864v.toByteArray();
        this.f131864v.reset();
        return byteArray;
    }

    private static float b(byte[] bArr, int i10) {
        return Float.intBitsToFloat(a(bArr, i10));
    }

    static Path b() {
        Path path = new Path();
        path.moveTo(1.0f, 2.0f);
        path.lineTo(3.0f, 4.0f);
        path.quadTo(5.0f, 6.0f, 7.0f, 8.0f);
        path.cubicTo(9.0f, 10.0f, 11.0f, 12.0f, 13.0f, 14.0f);
        path.close();
        path.arcTo(15.0f, 16.0f, 17.0f, 18.0f, 0.0f, 90.0f, false);
        for (int i10 = 0; i10 < 20; i10++) {
            float f10 = i10;
            path.lineTo(f10, f10);
        }
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(byte[] bArr) {
        int length = bArr.length - 1;
        for (int i10 = 0; length > i10; i10++) {
            byte b10 = bArr[length];
            bArr[length] = bArr[i10];
            bArr[i10] = b10;
            length--;
        }
    }

    private void c(byte[] bArr) {
        String str;
        int i10;
        this.f131862t = false;
        int iA = a(f131843c, bArr);
        this.f131852j = iA;
        if (iA == -1) {
            str = "Unable to locate path marker";
        } else {
            byte[] bArr2 = f131848h;
            byte[] bArr3 = f131847g;
            this.f131853k = a(bArr2, bArr, iA + 4);
            int iA2 = a(bArr3, bArr, this.f131852j + 4);
            this.f131854l = iA2;
            int i11 = this.f131853k;
            if (i11 == -1 || iA2 == -1) {
                str = "Unable to locate point/verb counts";
            } else {
                int iMax = Math.max(i11, iA2) + 4;
                this.f131855m = iMax;
                char c10 = 1;
                if (a(bArr, iMax) != 1) {
                    this.f131855m = -1;
                }
                int iMax2 = Math.max(this.f131853k, this.f131854l) + 4;
                int iA3 = a(f131849i, bArr, iMax2);
                this.f131856n = iA3;
                if (iA3 == -1) {
                    str = "Unable to locate points";
                } else {
                    this.f131857o = -1;
                    C13992bq[] c13992bqArr = f131846f;
                    int length = c13992bqArr.length;
                    int i12 = 0;
                    while (i12 < length) {
                        C13992bq c13992bq = c13992bqArr[i12];
                        byte[][] bArr4 = new byte[2][];
                        bArr4[0] = c13992bq.f131868c;
                        bArr4[c10] = c13992bq.f131869d;
                        int i13 = 0;
                        for (int i14 = 2; i13 < i14; i14 = 2) {
                            byte[] bArr5 = bArr4[i13];
                            int iA4 = a(bArr5, bArr, iMax2);
                            if (a(iA4, this.f131857o) == 0) {
                                this.f131857o = iA4;
                                this.f131859q = c13992bq.f131867b;
                                this.f131860r = bArr5 == c13992bq.f131869d;
                            }
                            i13++;
                        }
                        i12++;
                        c10 = 1;
                    }
                    int i15 = this.f131857o;
                    if (i15 != -1) {
                        byte b10 = bArr2[0];
                        byte b11 = bArr3[0];
                        int i16 = this.f131856n;
                        if (i15 > i16) {
                            this.f131861s = true;
                            this.f131857o = i15 - (b10 * 8);
                        } else {
                            this.f131861s = false;
                            this.f131856n = i16 - (b11 * 1);
                        }
                        if (this.f131855m != -1) {
                            if (this.f131861s) {
                                int i17 = this.f131857o;
                                this.f131858p = i17;
                                i10 = i17 + (b10 * 8);
                            } else {
                                int i18 = this.f131856n;
                                this.f131858p = i18;
                                i10 = i18 + (b10 * 8);
                            }
                            if (Math.abs(b(bArr, i10 + (b11 * 1)) - 0.707f) > 0.001f) {
                                this.f131855m = -1;
                                this.f131858p = -1;
                            }
                        }
                        this.f131862t = true;
                        return;
                    }
                    str = "Unable to locate verbs";
                }
            }
        }
        Log.e(str);
    }

    private void d(byte[] bArr) {
        if (f131850x) {
            f131850x = false;
            Log.d("data was: " + Arrays.toString(bArr));
            Log.d("identity was: " + Arrays.toString(a(b())));
            Log.d("computed: pto=" + this.f131852j + " po=" + this.f131856n + " vo=" + this.f131857o + " pc=" + this.f131853k + " vc=" + this.f131854l);
        }
    }

    int a(Path path, gh ghVar) {
        if (!a()) {
            Log.i("Unable to serialize path because we are not in a valid state");
            return 0;
        }
        if (path == null || path.isEmpty()) {
            return 0;
        }
        return path.isRect(this.f131865w) ? C14040dk.a(ghVar, C14040dk.a(ghVar, new byte[]{0, 1, 1, 1, 5}), C14040dk.a(ghVar, new float[]{this.f131865w.left, this.f131865w.top, this.f131865w.right, this.f131865w.top, this.f131865w.right, this.f131865w.bottom, this.f131865w.left, this.f131865w.bottom}), 0) : a(a(path), ghVar);
    }

    @Override // fsimpl.InterfaceC13990bo
    public int a(gh ghVar, Path path, int i10) {
        return C14037dh.a(ghVar, i10, 0, a(path, ghVar));
    }

    @Override // fsimpl.InterfaceC13990bo
    public boolean a() {
        return this.f131862t && Build.VERSION.SDK_INT <= 27;
    }
}
