package U6;

import U6.a;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.fullstory.FS;
import com.medallia.digital.mobilesdk.l3;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class e implements a {

    /* renamed from: u, reason: collision with root package name */
    private static final String f35804u = "e";

    /* renamed from: a, reason: collision with root package name */
    private int[] f35805a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f35806b;

    /* renamed from: c, reason: collision with root package name */
    private final a.InterfaceC0784a f35807c;

    /* renamed from: d, reason: collision with root package name */
    private ByteBuffer f35808d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f35809e;

    /* renamed from: f, reason: collision with root package name */
    private short[] f35810f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f35811g;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f35812h;

    /* renamed from: i, reason: collision with root package name */
    private byte[] f35813i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f35814j;

    /* renamed from: k, reason: collision with root package name */
    private int f35815k;

    /* renamed from: l, reason: collision with root package name */
    private c f35816l;

    /* renamed from: m, reason: collision with root package name */
    private Bitmap f35817m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f35818n;

    /* renamed from: o, reason: collision with root package name */
    private int f35819o;

    /* renamed from: p, reason: collision with root package name */
    private int f35820p;

    /* renamed from: q, reason: collision with root package name */
    private int f35821q;

    /* renamed from: r, reason: collision with root package name */
    private int f35822r;

    /* renamed from: s, reason: collision with root package name */
    private Boolean f35823s;

    /* renamed from: t, reason: collision with root package name */
    private Bitmap.Config f35824t;

    public e(a.InterfaceC0784a interfaceC0784a, c cVar, ByteBuffer byteBuffer, int i10) {
        this(interfaceC0784a);
        q(cVar, byteBuffer, i10);
    }

    private int i(int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = i10; i18 < this.f35820p + i10; i18++) {
            byte[] bArr = this.f35813i;
            if (i18 >= bArr.length || i18 >= i11) {
                break;
            }
            int i19 = this.f35805a[bArr[i18] & 255];
            if (i19 != 0) {
                i13 += (i19 >> 24) & l3.f92484c;
                i14 += (i19 >> 16) & l3.f92484c;
                i15 += (i19 >> 8) & l3.f92484c;
                i16 += i19 & l3.f92484c;
                i17++;
            }
        }
        int i20 = i10 + i12;
        for (int i21 = i20; i21 < this.f35820p + i20; i21++) {
            byte[] bArr2 = this.f35813i;
            if (i21 >= bArr2.length || i21 >= i11) {
                break;
            }
            int i22 = this.f35805a[bArr2[i21] & 255];
            if (i22 != 0) {
                i13 += (i22 >> 24) & l3.f92484c;
                i14 += (i22 >> 16) & l3.f92484c;
                i15 += (i22 >> 8) & l3.f92484c;
                i16 += i22 & l3.f92484c;
                i17++;
            }
        }
        if (i17 == 0) {
            return 0;
        }
        return ((i13 / i17) << 24) | ((i14 / i17) << 16) | ((i15 / i17) << 8) | (i16 / i17);
    }

    @Override // U6.a
    public synchronized Bitmap a() {
        try {
            if (this.f35816l.f35789c <= 0 || this.f35815k < 0) {
                String str = f35804u;
                if (Log.isLoggable(str, 3)) {
                    FS.log_d(str, "Unable to decode frame, frameCount=" + this.f35816l.f35789c + ", framePointer=" + this.f35815k);
                }
                this.f35819o = 1;
            }
            int i10 = this.f35819o;
            if (i10 != 1 && i10 != 2) {
                this.f35819o = 0;
                if (this.f35809e == null) {
                    this.f35809e = this.f35807c.b(l3.f92484c);
                }
                b bVar = this.f35816l.f35791e.get(this.f35815k);
                int i11 = this.f35815k - 1;
                b bVar2 = i11 >= 0 ? this.f35816l.f35791e.get(i11) : null;
                int[] iArr = bVar.f35786k;
                if (iArr == null) {
                    iArr = this.f35816l.f35787a;
                }
                this.f35805a = iArr;
                if (iArr == null) {
                    String str2 = f35804u;
                    if (Log.isLoggable(str2, 3)) {
                        FS.log_d(str2, "No valid color table found for frame #" + this.f35815k);
                    }
                    this.f35819o = 1;
                    return null;
                }
                if (bVar.f35781f) {
                    System.arraycopy(iArr, 0, this.f35806b, 0, iArr.length);
                    int[] iArr2 = this.f35806b;
                    this.f35805a = iArr2;
                    iArr2[bVar.f35783h] = 0;
                    if (bVar.f35782g == 2 && this.f35815k == 0) {
                        this.f35823s = Boolean.TRUE;
                    }
                }
                return r(bVar, bVar2);
            }
            String str3 = f35804u;
            if (Log.isLoggable(str3, 3)) {
                FS.log_d(str3, "Unable to decode frame, status=" + this.f35819o);
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // U6.a
    public void clear() {
        this.f35816l = null;
        byte[] bArr = this.f35813i;
        if (bArr != null) {
            this.f35807c.e(bArr);
        }
        int[] iArr = this.f35814j;
        if (iArr != null) {
            this.f35807c.f(iArr);
        }
        Bitmap bitmap = this.f35817m;
        if (bitmap != null) {
            this.f35807c.a(bitmap);
        }
        this.f35817m = null;
        this.f35808d = null;
        this.f35823s = null;
        byte[] bArr2 = this.f35809e;
        if (bArr2 != null) {
            this.f35807c.e(bArr2);
        }
    }

    @Override // U6.a
    public void f() {
        this.f35815k = -1;
    }

    public synchronized void q(c cVar, ByteBuffer byteBuffer, int i10) {
        try {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
            }
            int iHighestOneBit = Integer.highestOneBit(i10);
            this.f35819o = 0;
            this.f35816l = cVar;
            this.f35815k = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f35808d = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f35808d.order(ByteOrder.LITTLE_ENDIAN);
            this.f35818n = false;
            Iterator<b> it = cVar.f35791e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().f35782g == 3) {
                    this.f35818n = true;
                    break;
                }
            }
            this.f35820p = iHighestOneBit;
            int i11 = cVar.f35792f;
            this.f35822r = i11 / iHighestOneBit;
            int i12 = cVar.f35793g;
            this.f35821q = i12 / iHighestOneBit;
            this.f35813i = this.f35807c.b(i11 * i12);
            this.f35814j = this.f35807c.d(this.f35822r * this.f35821q);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void j(b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr = this.f35814j;
        int i14 = bVar.f35779d;
        int i15 = this.f35820p;
        int i16 = i14 / i15;
        int i17 = bVar.f35777b / i15;
        int i18 = bVar.f35778c / i15;
        int i19 = bVar.f35776a / i15;
        boolean z10 = this.f35815k == 0;
        int i20 = this.f35822r;
        int i21 = this.f35821q;
        byte[] bArr = this.f35813i;
        int[] iArr2 = this.f35805a;
        Boolean bool = this.f35823s;
        int i22 = 8;
        int i23 = 0;
        int i24 = 0;
        int i25 = 1;
        while (i24 < i16) {
            int[] iArr3 = iArr;
            if (bVar.f35780e) {
                if (i23 >= i16) {
                    int i26 = i25 + 1;
                    i10 = i16;
                    if (i26 == 2) {
                        i25 = i26;
                        i23 = 4;
                    } else if (i26 == 3) {
                        i25 = i26;
                        i22 = 4;
                        i23 = 2;
                    } else if (i26 != 4) {
                        i25 = i26;
                    } else {
                        i25 = i26;
                        i23 = 1;
                        i22 = 2;
                    }
                } else {
                    i10 = i16;
                }
                i11 = i23 + i22;
            } else {
                i10 = i16;
                i11 = i23;
                i23 = i24;
            }
            int i27 = i23 + i17;
            boolean z11 = i15 == 1;
            if (i27 < i21) {
                int i28 = i27 * i20;
                int i29 = i28 + i19;
                int i30 = i29 + i18;
                int i31 = i28 + i20;
                if (i31 < i30) {
                    i30 = i31;
                }
                i12 = i11;
                int i32 = i24 * i15 * bVar.f35778c;
                if (z11) {
                    int i33 = i29;
                    while (i33 < i30) {
                        int i34 = i33;
                        int i35 = iArr2[bArr[i32] & 255];
                        if (i35 != 0) {
                            iArr3[i34] = i35;
                        } else if (z10 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i32 += i15;
                        i33 = i34 + 1;
                    }
                } else {
                    int i36 = ((i30 - i29) * i15) + i32;
                    i13 = i15;
                    int i37 = i29;
                    while (i37 < i30) {
                        int i38 = i30;
                        int i39 = i(i32, i36, bVar.f35778c);
                        if (i39 != 0) {
                            iArr3[i37] = i39;
                        } else if (z10 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i32 += i13;
                        i37++;
                        i30 = i38;
                    }
                    i24++;
                    i15 = i13;
                    iArr = iArr3;
                    i16 = i10;
                    i23 = i12;
                }
            } else {
                i12 = i11;
            }
            i13 = i15;
            i24++;
            i15 = i13;
            iArr = iArr3;
            i16 = i10;
            i23 = i12;
        }
        if (this.f35823s == null) {
            this.f35823s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    private void k(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.f35814j;
        int i10 = bVar2.f35779d;
        int i11 = bVar2.f35777b;
        int i12 = bVar2.f35778c;
        int i13 = bVar2.f35776a;
        boolean z10 = this.f35815k == 0;
        int i14 = this.f35822r;
        byte[] bArr = this.f35813i;
        int[] iArr2 = this.f35805a;
        int i15 = 0;
        byte b10 = -1;
        while (i15 < i10) {
            int i16 = (i15 + i11) * i14;
            int i17 = i16 + i13;
            int i18 = i17 + i12;
            int i19 = i16 + i14;
            if (i19 < i18) {
                i18 = i19;
            }
            int i20 = bVar2.f35778c * i15;
            int i21 = i17;
            while (i21 < i18) {
                byte b11 = bArr[i20];
                int[] iArr3 = iArr;
                int i22 = b11 & 255;
                if (i22 != b10) {
                    int i23 = iArr2[i22];
                    if (i23 != 0) {
                        iArr3[i21] = i23;
                    } else {
                        b10 = b11;
                    }
                }
                i20++;
                i21++;
                iArr = iArr3;
            }
            i15++;
            bVar2 = bVar;
        }
        Boolean bool = this.f35823s;
        this.f35823s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f35823s == null && z10 && b10 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15, types: [short] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    private void l(b bVar) {
        int i10;
        int i11;
        byte[] bArr;
        short s10;
        e eVar = this;
        if (bVar != null) {
            eVar.f35808d.position(bVar.f35785j);
        }
        if (bVar == null) {
            c cVar = eVar.f35816l;
            i10 = cVar.f35792f;
            i11 = cVar.f35793g;
        } else {
            i10 = bVar.f35778c;
            i11 = bVar.f35779d;
        }
        int i12 = i10 * i11;
        byte[] bArr2 = eVar.f35813i;
        if (bArr2 == null || bArr2.length < i12) {
            eVar.f35813i = eVar.f35807c.b(i12);
        }
        byte[] bArr3 = eVar.f35813i;
        if (eVar.f35810f == null) {
            eVar.f35810f = new short[RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT];
        }
        short[] sArr = eVar.f35810f;
        if (eVar.f35811g == null) {
            eVar.f35811g = new byte[RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT];
        }
        byte[] bArr4 = eVar.f35811g;
        if (eVar.f35812h == null) {
            eVar.f35812h = new byte[4097];
        }
        byte[] bArr5 = eVar.f35812h;
        int iP = eVar.p();
        int i13 = 1 << iP;
        int i14 = i13 + 1;
        int i15 = i13 + 2;
        int i16 = iP + 1;
        int i17 = (1 << i16) - 1;
        byte b10 = 0;
        for (int i18 = 0; i18 < i13; i18++) {
            sArr[i18] = 0;
            bArr4[i18] = (byte) i18;
        }
        byte[] bArr6 = eVar.f35809e;
        int i19 = i16;
        int i20 = i15;
        int i21 = i17;
        int i22 = 0;
        int iO = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = -1;
        while (true) {
            if (i22 >= i12) {
                break;
            }
            if (iO == 0) {
                iO = eVar.o();
                if (iO <= 0) {
                    eVar.f35819o = 3;
                    break;
                }
                i23 = b10;
            }
            i25 += (bArr6[i23] & 255) << i24;
            i23++;
            iO--;
            int i30 = i24 + 8;
            int i31 = i20;
            int i32 = i29;
            int i33 = i19;
            short[] sArr2 = sArr;
            int i34 = i28;
            while (true) {
                bArr = bArr4;
                if (i30 < i33) {
                    i20 = i31;
                    i28 = i34;
                    break;
                }
                int i35 = i25 & i21;
                i25 >>= i33;
                i30 -= i33;
                if (i35 == i13) {
                    i33 = i16;
                    i31 = i15;
                    i21 = i17;
                    bArr4 = bArr;
                    i32 = -1;
                } else {
                    if (i35 == i14) {
                        i28 = i34;
                        i20 = i31;
                        break;
                    }
                    byte[] bArr7 = bArr5;
                    if (i32 == -1) {
                        bArr3[i26] = bArr[i35];
                        i26++;
                        i22++;
                        i32 = i35;
                        i34 = i32;
                        bArr4 = bArr;
                        bArr5 = bArr7;
                    } else {
                        if (i35 >= i31) {
                            bArr7[i27] = (byte) i34;
                            i27++;
                            s10 = i32;
                        } else {
                            s10 = i35;
                        }
                        while (s10 >= i13) {
                            bArr7[i27] = bArr[s10];
                            i27++;
                            s10 = sArr2[s10];
                        }
                        int i36 = bArr[s10] & 255;
                        byte b11 = (byte) i36;
                        bArr3[i26] = b11;
                        while (true) {
                            i26++;
                            i22++;
                            if (i27 <= 0) {
                                break;
                            }
                            i27--;
                            bArr3[i26] = bArr7[i27];
                        }
                        if (i31 < 4096) {
                            sArr2[i31] = (short) i32;
                            bArr[i31] = b11;
                            i31++;
                            if ((i31 & i21) == 0 && i31 < 4096) {
                                i33++;
                                i21 += i31;
                            }
                        }
                        i32 = i35;
                        bArr4 = bArr;
                        bArr5 = bArr7;
                        i34 = i36;
                    }
                }
            }
            i24 = i30;
            sArr = sArr2;
            bArr4 = bArr;
            b10 = 0;
            i29 = i32;
            i19 = i33;
            eVar = this;
        }
        Arrays.fill(bArr3, i26, i12, b10);
    }

    private Bitmap n() {
        Boolean bool = this.f35823s;
        Bitmap bitmapC = this.f35807c.c(this.f35822r, this.f35821q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f35824t);
        bitmapC.setHasAlpha(true);
        return bitmapC;
    }

    private int p() {
        return this.f35808d.get() & 255;
    }

    private Bitmap r(b bVar, b bVar2) {
        int i10;
        int i11;
        Bitmap bitmap;
        int[] iArr = this.f35814j;
        int i12 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f35817m;
            if (bitmap2 != null) {
                this.f35807c.a(bitmap2);
            }
            this.f35817m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f35782g == 3 && this.f35817m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i11 = bVar2.f35782g) > 0) {
            if (i11 == 2) {
                if (!bVar.f35781f) {
                    c cVar = this.f35816l;
                    int i13 = cVar.f35798l;
                    if (bVar.f35786k == null || cVar.f35796j != bVar.f35783h) {
                        i12 = i13;
                    }
                }
                int i14 = bVar2.f35779d;
                int i15 = this.f35820p;
                int i16 = i14 / i15;
                int i17 = bVar2.f35777b / i15;
                int i18 = bVar2.f35778c / i15;
                int i19 = bVar2.f35776a / i15;
                int i20 = this.f35822r;
                int i21 = (i17 * i20) + i19;
                int i22 = (i16 * i20) + i21;
                while (i21 < i22) {
                    int i23 = i21 + i18;
                    for (int i24 = i21; i24 < i23; i24++) {
                        iArr[i24] = i12;
                    }
                    i21 += this.f35822r;
                }
            } else if (i11 == 3 && (bitmap = this.f35817m) != null) {
                int i25 = this.f35822r;
                bitmap.getPixels(iArr, 0, i25, 0, 0, i25, this.f35821q);
            }
        }
        l(bVar);
        if (bVar.f35780e || this.f35820p != 1) {
            j(bVar);
        } else {
            k(bVar);
        }
        if (this.f35818n && ((i10 = bVar.f35782g) == 0 || i10 == 1)) {
            if (this.f35817m == null) {
                this.f35817m = n();
            }
            Bitmap bitmap3 = this.f35817m;
            int i26 = this.f35822r;
            bitmap3.setPixels(iArr, 0, i26, 0, 0, i26, this.f35821q);
        }
        Bitmap bitmapN = n();
        int i27 = this.f35822r;
        bitmapN.setPixels(iArr, 0, i27, 0, 0, i27, this.f35821q);
        return bitmapN;
    }

    @Override // U6.a
    public void b() {
        this.f35815k = (this.f35815k + 1) % this.f35816l.f35789c;
    }

    @Override // U6.a
    public int c() {
        return this.f35816l.f35789c;
    }

    @Override // U6.a
    public void d(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f35824t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // U6.a
    public int e() {
        int i10;
        if (this.f35816l.f35789c <= 0 || (i10 = this.f35815k) < 0) {
            return 0;
        }
        return m(i10);
    }

    @Override // U6.a
    public int g() {
        return this.f35815k;
    }

    @Override // U6.a
    public ByteBuffer getData() {
        return this.f35808d;
    }

    @Override // U6.a
    public int h() {
        return this.f35808d.limit() + this.f35813i.length + (this.f35814j.length * 4);
    }

    public int m(int i10) {
        if (i10 < 0) {
            return -1;
        }
        c cVar = this.f35816l;
        if (i10 < cVar.f35789c) {
            return cVar.f35791e.get(i10).f35784i;
        }
        return -1;
    }

    public e(a.InterfaceC0784a interfaceC0784a) {
        this.f35806b = new int[256];
        this.f35824t = Bitmap.Config.ARGB_8888;
        this.f35807c = interfaceC0784a;
        this.f35816l = new c();
    }

    private int o() {
        int iP = p();
        if (iP <= 0) {
            return iP;
        }
        ByteBuffer byteBuffer = this.f35808d;
        byteBuffer.get(this.f35809e, 0, Math.min(iP, byteBuffer.remaining()));
        return iP;
    }
}
