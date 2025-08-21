package W6;

import android.util.Log;
import com.fullstory.FS;
import com.google.android.gms.common.api.a;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer f40826b;

    /* renamed from: c, reason: collision with root package name */
    private c f40827c;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f40825a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    private int f40828d = 0;

    private void i(int i10) {
        boolean z10 = false;
        while (!z10 && !b() && this.f40827c.f40814c <= i10) {
            int iD = d();
            if (iD == 33) {
                int iD2 = d();
                if (iD2 == 1) {
                    q();
                } else if (iD2 == 249) {
                    this.f40827c.f40815d = new b();
                    j();
                } else if (iD2 == 254) {
                    q();
                } else if (iD2 != 255) {
                    q();
                } else {
                    f();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < 11; i11++) {
                        sb2.append((char) this.f40825a[i11]);
                    }
                    if (sb2.toString().equals("NETSCAPE2.0")) {
                        m();
                    } else {
                        q();
                    }
                }
            } else if (iD == 44) {
                c cVar = this.f40827c;
                if (cVar.f40815d == null) {
                    cVar.f40815d = new b();
                }
                e();
            } else if (iD != 59) {
                this.f40827c.f40813b = 1;
            } else {
                z10 = true;
            }
        }
    }

    private void o() {
        this.f40826b = null;
        Arrays.fill(this.f40825a, (byte) 0);
        this.f40827c = new c();
        this.f40828d = 0;
    }

    public void a() {
        this.f40826b = null;
        this.f40827c = null;
    }

    private boolean b() {
        return this.f40827c.f40813b != 0;
    }

    private int d() {
        try {
            return this.f40826b.get() & 255;
        } catch (Exception unused) {
            this.f40827c.f40813b = 1;
            return 0;
        }
    }

    private void e() {
        this.f40827c.f40815d.f40801a = n();
        this.f40827c.f40815d.f40802b = n();
        this.f40827c.f40815d.f40803c = n();
        this.f40827c.f40815d.f40804d = n();
        int iD = d();
        boolean z10 = (iD & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iD & 7) + 1);
        b bVar = this.f40827c.f40815d;
        bVar.f40805e = (iD & 64) != 0;
        if (z10) {
            bVar.f40811k = g(iPow);
        } else {
            bVar.f40811k = null;
        }
        this.f40827c.f40815d.f40810j = this.f40826b.position();
        r();
        if (b()) {
            return;
        }
        c cVar = this.f40827c;
        cVar.f40814c++;
        cVar.f40816e.add(cVar.f40815d);
    }

    private int[] g(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f40826b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = bArr[i12] & 255;
                int i14 = i12 + 2;
                int i15 = bArr[i12 + 1] & 255;
                i12 += 3;
                int i16 = i11 + 1;
                iArr[i11] = (i15 << 8) | (i13 << 16) | (-16777216) | (bArr[i14] & 255);
                i11 = i16;
            }
            return iArr;
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                FS.log_d("GifHeaderParser", "Format Error Reading Color Table", e10);
            }
            this.f40827c.f40813b = 1;
            return iArr;
        }
    }

    private void k() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) d());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f40827c.f40813b = 1;
            return;
        }
        l();
        if (!this.f40827c.f40819h || b()) {
            return;
        }
        c cVar = this.f40827c;
        cVar.f40812a = g(cVar.f40820i);
        c cVar2 = this.f40827c;
        cVar2.f40823l = cVar2.f40812a[cVar2.f40821j];
    }

    private void l() {
        this.f40827c.f40817f = n();
        this.f40827c.f40818g = n();
        int iD = d();
        c cVar = this.f40827c;
        cVar.f40819h = (iD & 128) != 0;
        cVar.f40820i = (int) Math.pow(2.0d, (iD & 7) + 1);
        this.f40827c.f40821j = d();
        this.f40827c.f40822k = d();
    }

    private int n() {
        return this.f40826b.getShort();
    }

    public c c() {
        if (this.f40826b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.f40827c;
        }
        k();
        if (!b()) {
            h();
            c cVar = this.f40827c;
            if (cVar.f40814c < 0) {
                cVar.f40813b = 1;
            }
        }
        return this.f40827c;
    }

    private void f() {
        int iD = d();
        this.f40828d = iD;
        if (iD > 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                try {
                    i11 = this.f40828d;
                    if (i10 < i11) {
                        i11 -= i10;
                        this.f40826b.get(this.f40825a, i10, i11);
                        i10 += i11;
                    } else {
                        return;
                    }
                } catch (Exception e10) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        FS.log_d("GifHeaderParser", "Error Reading Block n: " + i10 + " count: " + i11 + " blockSize: " + this.f40828d, e10);
                    }
                    this.f40827c.f40813b = 1;
                    return;
                }
            }
        }
    }

    private void h() {
        i(a.e.API_PRIORITY_OTHER);
    }

    private void j() {
        d();
        int iD = d();
        b bVar = this.f40827c.f40815d;
        int i10 = (iD & 28) >> 2;
        bVar.f40807g = i10;
        boolean z10 = true;
        if (i10 == 0) {
            bVar.f40807g = 1;
        }
        if ((iD & 1) == 0) {
            z10 = false;
        }
        bVar.f40806f = z10;
        int iN = n();
        if (iN < 2) {
            iN = 10;
        }
        b bVar2 = this.f40827c.f40815d;
        bVar2.f40809i = iN * 10;
        bVar2.f40808h = d();
        d();
    }

    private void m() {
        do {
            f();
            byte[] bArr = this.f40825a;
            if (bArr[0] == 1) {
                this.f40827c.f40824m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f40828d <= 0) {
                return;
            }
        } while (!b());
    }

    private void q() {
        int iD;
        do {
            iD = d();
            this.f40826b.position(Math.min(this.f40826b.position() + iD, this.f40826b.limit()));
        } while (iD > 0);
    }

    private void r() {
        d();
        q();
    }

    public d p(ByteBuffer byteBuffer) {
        o();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f40826b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f40826b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
