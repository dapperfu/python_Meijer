package G;

import G.h;
import com.medallia.digital.mobilesdk.l3;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class i extends FilterOutputStream {

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f11114g = "Exif\u0000\u0000".getBytes(g.f11081e);

    /* renamed from: a, reason: collision with root package name */
    private final h f11115a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f11116b;

    /* renamed from: c, reason: collision with root package name */
    private final ByteBuffer f11117c;

    /* renamed from: d, reason: collision with root package name */
    private int f11118d;

    /* renamed from: e, reason: collision with root package name */
    private int f11119e;

    /* renamed from: f, reason: collision with root package name */
    private int f11120f;

    static final class a {
        public static boolean a(short s10) {
            return (s10 < -64 || s10 > -49 || s10 == -60 || s10 == -56 || s10 == -52) ? false : true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (r9 <= 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010a, code lost:
    
        ((java.io.FilterOutputStream) r6).out.write(r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G.i.write(byte[], int, int):void");
    }

    public i(OutputStream outputStream, h hVar) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.f11116b = new byte[1];
        this.f11117c = ByteBuffer.allocate(4);
        this.f11118d = 0;
        this.f11115a = hVar;
    }

    private int a(int i10, byte[] bArr, int i11, int i12) {
        int iMin = Math.min(i12, i10 - this.f11117c.position());
        this.f11117c.put(bArr, i11, iMin);
        return iMin;
    }

    private void b(b bVar) throws IOException {
        j[][] jVarArr = h.f11095i;
        int[] iArr = new int[jVarArr.length];
        int[] iArr2 = new int[jVarArr.length];
        for (j jVar : h.f11093g) {
            for (int i10 = 0; i10 < h.f11095i.length; i10++) {
                this.f11115a.c(i10).remove(jVar.f11122b);
            }
        }
        if (!this.f11115a.c(1).isEmpty()) {
            this.f11115a.c(0).put(h.f11093g[1].f11122b, g.f(0L, this.f11115a.d()));
        }
        if (!this.f11115a.c(2).isEmpty()) {
            this.f11115a.c(0).put(h.f11093g[2].f11122b, g.f(0L, this.f11115a.d()));
        }
        if (!this.f11115a.c(3).isEmpty()) {
            this.f11115a.c(1).put(h.f11093g[3].f11122b, g.f(0L, this.f11115a.d()));
        }
        for (int i11 = 0; i11 < h.f11095i.length; i11++) {
            Iterator<Map.Entry<String, g>> it = this.f11115a.c(i11).entrySet().iterator();
            int i12 = 0;
            while (it.hasNext()) {
                int iJ = it.next().getValue().j();
                if (iJ > 4) {
                    i12 += iJ;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int size = 8;
        for (int i13 = 0; i13 < h.f11095i.length; i13++) {
            if (!this.f11115a.c(i13).isEmpty()) {
                iArr[i13] = size;
                size += (this.f11115a.c(i13).size() * 12) + 6 + iArr2[i13];
            }
        }
        int i14 = size + 8;
        if (!this.f11115a.c(1).isEmpty()) {
            this.f11115a.c(0).put(h.f11093g[1].f11122b, g.f(iArr[1], this.f11115a.d()));
        }
        if (!this.f11115a.c(2).isEmpty()) {
            this.f11115a.c(0).put(h.f11093g[2].f11122b, g.f(iArr[2], this.f11115a.d()));
        }
        if (!this.f11115a.c(3).isEmpty()) {
            this.f11115a.c(1).put(h.f11093g[3].f11122b, g.f(iArr[3], this.f11115a.d()));
        }
        bVar.h(i14);
        bVar.write(f11114g);
        bVar.d(this.f11115a.d() == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        bVar.a(this.f11115a.d());
        bVar.h(42);
        bVar.g(8L);
        for (int i15 = 0; i15 < h.f11095i.length; i15++) {
            if (!this.f11115a.c(i15).isEmpty()) {
                bVar.h(this.f11115a.c(i15).size());
                int size2 = iArr[i15] + 2 + (this.f11115a.c(i15).size() * 12) + 4;
                for (Map.Entry<String, g> entry : this.f11115a.c(i15).entrySet()) {
                    int i16 = ((j) o2.i.h(h.b.f11103f.get(i15).get(entry.getKey()), "Tag not supported: " + entry.getKey() + ". Tag needs to be ported from ExifInterface to ExifData.")).f11121a;
                    g value = entry.getValue();
                    int iJ2 = value.j();
                    bVar.h(i16);
                    bVar.h(value.f11085a);
                    bVar.c(value.f11086b);
                    if (iJ2 > 4) {
                        bVar.g(size2);
                        size2 += iJ2;
                    } else {
                        bVar.write(value.f11088d);
                        if (iJ2 < 4) {
                            while (iJ2 < 4) {
                                bVar.b(0);
                                iJ2++;
                            }
                        }
                    }
                }
                bVar.g(0L);
                Iterator<Map.Entry<String, g>> it2 = this.f11115a.c(i15).entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f11088d;
                    if (bArr.length > 4) {
                        bVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        bVar.a(ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f11116b;
        bArr[0] = (byte) (i10 & l3.f93323c);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
