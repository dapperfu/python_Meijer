package W6;

import W6.a;
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
    private static final String f40829u = "e";

    /* renamed from: a, reason: collision with root package name */
    private int[] f40830a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f40831b;

    /* renamed from: c, reason: collision with root package name */
    private final a.InterfaceC0877a f40832c;

    /* renamed from: d, reason: collision with root package name */
    private ByteBuffer f40833d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f40834e;

    /* renamed from: f, reason: collision with root package name */
    private short[] f40835f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f40836g;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f40837h;

    /* renamed from: i, reason: collision with root package name */
    private byte[] f40838i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f40839j;

    /* renamed from: k, reason: collision with root package name */
    private int f40840k;

    /* renamed from: l, reason: collision with root package name */
    private c f40841l;

    /* renamed from: m, reason: collision with root package name */
    private Bitmap f40842m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f40843n;

    /* renamed from: o, reason: collision with root package name */
    private int f40844o;

    /* renamed from: p, reason: collision with root package name */
    private int f40845p;

    /* renamed from: q, reason: collision with root package name */
    private int f40846q;

    /* renamed from: r, reason: collision with root package name */
    private int f40847r;

    /* renamed from: s, reason: collision with root package name */
    private Boolean f40848s;

    /* renamed from: t, reason: collision with root package name */
    private Bitmap.Config f40849t;

    public e(a.InterfaceC0877a interfaceC0877a, c cVar, ByteBuffer byteBuffer, int i10) {
        this(interfaceC0877a);
        q(cVar, byteBuffer, i10);
    }

    private int i(int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = i10; i18 < this.f40845p + i10; i18++) {
            byte[] bArr = this.f40838i;
            if (i18 >= bArr.length || i18 >= i11) {
                break;
            }
            int i19 = this.f40830a[bArr[i18] & 255];
            if (i19 != 0) {
                i13 += (i19 >> 24) & l3.f93323c;
                i14 += (i19 >> 16) & l3.f93323c;
                i15 += (i19 >> 8) & l3.f93323c;
                i16 += i19 & l3.f93323c;
                i17++;
            }
        }
        int i20 = i10 + i12;
        for (int i21 = i20; i21 < this.f40845p + i20; i21++) {
            byte[] bArr2 = this.f40838i;
            if (i21 >= bArr2.length || i21 >= i11) {
                break;
            }
            int i22 = this.f40830a[bArr2[i21] & 255];
            if (i22 != 0) {
                i13 += (i22 >> 24) & l3.f93323c;
                i14 += (i22 >> 16) & l3.f93323c;
                i15 += (i22 >> 8) & l3.f93323c;
                i16 += i22 & l3.f93323c;
                i17++;
            }
        }
        if (i17 == 0) {
            return 0;
        }
        return ((i13 / i17) << 24) | ((i14 / i17) << 16) | ((i15 / i17) << 8) | (i16 / i17);
    }

    @Override // W6.a
    public synchronized Bitmap a() {
        try {
            if (this.f40841l.f40814c <= 0 || this.f40840k < 0) {
                String str = f40829u;
                if (Log.isLoggable(str, 3)) {
                    FS.log_d(str, "Unable to decode frame, frameCount=" + this.f40841l.f40814c + ", framePointer=" + this.f40840k);
                }
                this.f40844o = 1;
            }
            int i10 = this.f40844o;
            if (i10 != 1 && i10 != 2) {
                this.f40844o = 0;
                if (this.f40834e == null) {
                    this.f40834e = this.f40832c.b(l3.f93323c);
                }
                b bVar = this.f40841l.f40816e.get(this.f40840k);
                int i11 = this.f40840k - 1;
                b bVar2 = i11 >= 0 ? this.f40841l.f40816e.get(i11) : null;
                int[] iArr = bVar.f40811k;
                if (iArr == null) {
                    iArr = this.f40841l.f40812a;
                }
                this.f40830a = iArr;
                if (iArr == null) {
                    String str2 = f40829u;
                    if (Log.isLoggable(str2, 3)) {
                        FS.log_d(str2, "No valid color table found for frame #" + this.f40840k);
                    }
                    this.f40844o = 1;
                    return null;
                }
                if (bVar.f40806f) {
                    System.arraycopy(iArr, 0, this.f40831b, 0, iArr.length);
                    int[] iArr2 = this.f40831b;
                    this.f40830a = iArr2;
                    iArr2[bVar.f40808h] = 0;
                    if (bVar.f40807g == 2 && this.f40840k == 0) {
                        this.f40848s = Boolean.TRUE;
                    }
                }
                return r(bVar, bVar2);
            }
            String str3 = f40829u;
            if (Log.isLoggable(str3, 3)) {
                FS.log_d(str3, "Unable to decode frame, status=" + this.f40844o);
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // W6.a
    public void clear() {
        this.f40841l = null;
        byte[] bArr = this.f40838i;
        if (bArr != null) {
            this.f40832c.e(bArr);
        }
        int[] iArr = this.f40839j;
        if (iArr != null) {
            this.f40832c.f(iArr);
        }
        Bitmap bitmap = this.f40842m;
        if (bitmap != null) {
            this.f40832c.a(bitmap);
        }
        this.f40842m = null;
        this.f40833d = null;
        this.f40848s = null;
        byte[] bArr2 = this.f40834e;
        if (bArr2 != null) {
            this.f40832c.e(bArr2);
        }
    }

    @Override // W6.a
    public void f() {
        this.f40840k = -1;
    }

    public synchronized void q(c cVar, ByteBuffer byteBuffer, int i10) {
        try {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
            }
            int iHighestOneBit = Integer.highestOneBit(i10);
            this.f40844o = 0;
            this.f40841l = cVar;
            this.f40840k = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f40833d = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f40833d.order(ByteOrder.LITTLE_ENDIAN);
            this.f40843n = false;
            Iterator<b> it = cVar.f40816e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().f40807g == 3) {
                    this.f40843n = true;
                    break;
                }
            }
            this.f40845p = iHighestOneBit;
            int i11 = cVar.f40817f;
            this.f40847r = i11 / iHighestOneBit;
            int i12 = cVar.f40818g;
            this.f40846q = i12 / iHighestOneBit;
            this.f40838i = this.f40832c.b(i11 * i12);
            this.f40839j = this.f40832c.d(this.f40847r * this.f40846q);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void j(b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr = this.f40839j;
        int i14 = bVar.f40804d;
        int i15 = this.f40845p;
        int i16 = i14 / i15;
        int i17 = bVar.f40802b / i15;
        int i18 = bVar.f40803c / i15;
        int i19 = bVar.f40801a / i15;
        boolean z10 = this.f40840k == 0;
        int i20 = this.f40847r;
        int i21 = this.f40846q;
        byte[] bArr = this.f40838i;
        int[] iArr2 = this.f40830a;
        Boolean bool = this.f40848s;
        int i22 = 8;
        int i23 = 0;
        int i24 = 0;
        int i25 = 1;
        while (i24 < i16) {
            int[] iArr3 = iArr;
            if (bVar.f40805e) {
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
                int i32 = i24 * i15 * bVar.f40803c;
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
                        int i39 = i(i32, i36, bVar.f40803c);
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
        if (this.f40848s == null) {
            this.f40848s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    private void k(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.f40839j;
        int i10 = bVar2.f40804d;
        int i11 = bVar2.f40802b;
        int i12 = bVar2.f40803c;
        int i13 = bVar2.f40801a;
        boolean z10 = this.f40840k == 0;
        int i14 = this.f40847r;
        byte[] bArr = this.f40838i;
        int[] iArr2 = this.f40830a;
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
            int i20 = bVar2.f40803c * i15;
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
        Boolean bool = this.f40848s;
        this.f40848s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f40848s == null && z10 && b10 != -1));
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
            eVar.f40833d.position(bVar.f40810j);
        }
        if (bVar == null) {
            c cVar = eVar.f40841l;
            i10 = cVar.f40817f;
            i11 = cVar.f40818g;
        } else {
            i10 = bVar.f40803c;
            i11 = bVar.f40804d;
        }
        int i12 = i10 * i11;
        byte[] bArr2 = eVar.f40838i;
        if (bArr2 == null || bArr2.length < i12) {
            eVar.f40838i = eVar.f40832c.b(i12);
        }
        byte[] bArr3 = eVar.f40838i;
        if (eVar.f40835f == null) {
            eVar.f40835f = new short[RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT];
        }
        short[] sArr = eVar.f40835f;
        if (eVar.f40836g == null) {
            eVar.f40836g = new byte[RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT];
        }
        byte[] bArr4 = eVar.f40836g;
        if (eVar.f40837h == null) {
            eVar.f40837h = new byte[4097];
        }
        byte[] bArr5 = eVar.f40837h;
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
        byte[] bArr6 = eVar.f40834e;
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
                    eVar.f40844o = 3;
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
        Boolean bool = this.f40848s;
        Bitmap bitmapC = this.f40832c.c(this.f40847r, this.f40846q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f40849t);
        bitmapC.setHasAlpha(true);
        return bitmapC;
    }

    private int p() {
        return this.f40833d.get() & 255;
    }

    private Bitmap r(b bVar, b bVar2) {
        int i10;
        int i11;
        Bitmap bitmap;
        int[] iArr = this.f40839j;
        int i12 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f40842m;
            if (bitmap2 != null) {
                this.f40832c.a(bitmap2);
            }
            this.f40842m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f40807g == 3 && this.f40842m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i11 = bVar2.f40807g) > 0) {
            if (i11 == 2) {
                if (!bVar.f40806f) {
                    c cVar = this.f40841l;
                    int i13 = cVar.f40823l;
                    if (bVar.f40811k == null || cVar.f40821j != bVar.f40808h) {
                        i12 = i13;
                    }
                }
                int i14 = bVar2.f40804d;
                int i15 = this.f40845p;
                int i16 = i14 / i15;
                int i17 = bVar2.f40802b / i15;
                int i18 = bVar2.f40803c / i15;
                int i19 = bVar2.f40801a / i15;
                int i20 = this.f40847r;
                int i21 = (i17 * i20) + i19;
                int i22 = (i16 * i20) + i21;
                while (i21 < i22) {
                    int i23 = i21 + i18;
                    for (int i24 = i21; i24 < i23; i24++) {
                        iArr[i24] = i12;
                    }
                    i21 += this.f40847r;
                }
            } else if (i11 == 3 && (bitmap = this.f40842m) != null) {
                int i25 = this.f40847r;
                bitmap.getPixels(iArr, 0, i25, 0, 0, i25, this.f40846q);
            }
        }
        l(bVar);
        if (bVar.f40805e || this.f40845p != 1) {
            j(bVar);
        } else {
            k(bVar);
        }
        if (this.f40843n && ((i10 = bVar.f40807g) == 0 || i10 == 1)) {
            if (this.f40842m == null) {
                this.f40842m = n();
            }
            Bitmap bitmap3 = this.f40842m;
            int i26 = this.f40847r;
            bitmap3.setPixels(iArr, 0, i26, 0, 0, i26, this.f40846q);
        }
        Bitmap bitmapN = n();
        int i27 = this.f40847r;
        bitmapN.setPixels(iArr, 0, i27, 0, 0, i27, this.f40846q);
        return bitmapN;
    }

    @Override // W6.a
    public void b() {
        this.f40840k = (this.f40840k + 1) % this.f40841l.f40814c;
    }

    @Override // W6.a
    public int c() {
        return this.f40841l.f40814c;
    }

    @Override // W6.a
    public void d(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f40849t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // W6.a
    public int e() {
        int i10;
        if (this.f40841l.f40814c <= 0 || (i10 = this.f40840k) < 0) {
            return 0;
        }
        return m(i10);
    }

    @Override // W6.a
    public int g() {
        return this.f40840k;
    }

    @Override // W6.a
    public ByteBuffer getData() {
        return this.f40833d;
    }

    @Override // W6.a
    public int h() {
        return this.f40833d.limit() + this.f40838i.length + (this.f40839j.length * 4);
    }

    public int m(int i10) {
        if (i10 < 0) {
            return -1;
        }
        c cVar = this.f40841l;
        if (i10 < cVar.f40814c) {
            return cVar.f40816e.get(i10).f40809i;
        }
        return -1;
    }

    public e(a.InterfaceC0877a interfaceC0877a) {
        this.f40831b = new int[256];
        this.f40849t = Bitmap.Config.ARGB_8888;
        this.f40832c = interfaceC0877a;
        this.f40841l = new c();
    }

    private int o() {
        int iP = p();
        if (iP <= 0) {
            return iP;
        }
        ByteBuffer byteBuffer = this.f40833d;
        byteBuffer.get(this.f40834e, 0, Math.min(iP, byteBuffer.remaining()));
        return iP;
    }
}
