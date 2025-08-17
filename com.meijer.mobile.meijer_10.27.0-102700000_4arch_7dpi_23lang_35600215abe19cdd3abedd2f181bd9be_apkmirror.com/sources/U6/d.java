package U6;

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
    private ByteBuffer f35801b;

    /* renamed from: c, reason: collision with root package name */
    private c f35802c;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f35800a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    private int f35803d = 0;

    private void i(int i10) {
        boolean z10 = false;
        while (!z10 && !b() && this.f35802c.f35789c <= i10) {
            int iD = d();
            if (iD == 33) {
                int iD2 = d();
                if (iD2 == 1) {
                    q();
                } else if (iD2 == 249) {
                    this.f35802c.f35790d = new b();
                    j();
                } else if (iD2 == 254) {
                    q();
                } else if (iD2 != 255) {
                    q();
                } else {
                    f();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < 11; i11++) {
                        sb2.append((char) this.f35800a[i11]);
                    }
                    if (sb2.toString().equals("NETSCAPE2.0")) {
                        m();
                    } else {
                        q();
                    }
                }
            } else if (iD == 44) {
                c cVar = this.f35802c;
                if (cVar.f35790d == null) {
                    cVar.f35790d = new b();
                }
                e();
            } else if (iD != 59) {
                this.f35802c.f35788b = 1;
            } else {
                z10 = true;
            }
        }
    }

    private void o() {
        this.f35801b = null;
        Arrays.fill(this.f35800a, (byte) 0);
        this.f35802c = new c();
        this.f35803d = 0;
    }

    public void a() {
        this.f35801b = null;
        this.f35802c = null;
    }

    private boolean b() {
        return this.f35802c.f35788b != 0;
    }

    private int d() {
        try {
            return this.f35801b.get() & 255;
        } catch (Exception unused) {
            this.f35802c.f35788b = 1;
            return 0;
        }
    }

    private void e() {
        this.f35802c.f35790d.f35776a = n();
        this.f35802c.f35790d.f35777b = n();
        this.f35802c.f35790d.f35778c = n();
        this.f35802c.f35790d.f35779d = n();
        int iD = d();
        boolean z10 = (iD & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iD & 7) + 1);
        b bVar = this.f35802c.f35790d;
        bVar.f35780e = (iD & 64) != 0;
        if (z10) {
            bVar.f35786k = g(iPow);
        } else {
            bVar.f35786k = null;
        }
        this.f35802c.f35790d.f35785j = this.f35801b.position();
        r();
        if (b()) {
            return;
        }
        c cVar = this.f35802c;
        cVar.f35789c++;
        cVar.f35791e.add(cVar.f35790d);
    }

    private int[] g(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f35801b.get(bArr);
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
            this.f35802c.f35788b = 1;
            return iArr;
        }
    }

    private void k() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) d());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f35802c.f35788b = 1;
            return;
        }
        l();
        if (!this.f35802c.f35794h || b()) {
            return;
        }
        c cVar = this.f35802c;
        cVar.f35787a = g(cVar.f35795i);
        c cVar2 = this.f35802c;
        cVar2.f35798l = cVar2.f35787a[cVar2.f35796j];
    }

    private void l() {
        this.f35802c.f35792f = n();
        this.f35802c.f35793g = n();
        int iD = d();
        c cVar = this.f35802c;
        cVar.f35794h = (iD & 128) != 0;
        cVar.f35795i = (int) Math.pow(2.0d, (iD & 7) + 1);
        this.f35802c.f35796j = d();
        this.f35802c.f35797k = d();
    }

    private int n() {
        return this.f35801b.getShort();
    }

    public c c() {
        if (this.f35801b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.f35802c;
        }
        k();
        if (!b()) {
            h();
            c cVar = this.f35802c;
            if (cVar.f35789c < 0) {
                cVar.f35788b = 1;
            }
        }
        return this.f35802c;
    }

    private void f() {
        int iD = d();
        this.f35803d = iD;
        if (iD > 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                try {
                    i11 = this.f35803d;
                    if (i10 < i11) {
                        i11 -= i10;
                        this.f35801b.get(this.f35800a, i10, i11);
                        i10 += i11;
                    } else {
                        return;
                    }
                } catch (Exception e10) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        FS.log_d("GifHeaderParser", "Error Reading Block n: " + i10 + " count: " + i11 + " blockSize: " + this.f35803d, e10);
                    }
                    this.f35802c.f35788b = 1;
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
        b bVar = this.f35802c.f35790d;
        int i10 = (iD & 28) >> 2;
        bVar.f35782g = i10;
        boolean z10 = true;
        if (i10 == 0) {
            bVar.f35782g = 1;
        }
        if ((iD & 1) == 0) {
            z10 = false;
        }
        bVar.f35781f = z10;
        int iN = n();
        if (iN < 2) {
            iN = 10;
        }
        b bVar2 = this.f35802c.f35790d;
        bVar2.f35784i = iN * 10;
        bVar2.f35783h = d();
        d();
    }

    private void m() {
        do {
            f();
            byte[] bArr = this.f35800a;
            if (bArr[0] == 1) {
                this.f35802c.f35799m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f35803d <= 0) {
                return;
            }
        } while (!b());
    }

    private void q() {
        int iD;
        do {
            iD = d();
            this.f35801b.position(Math.min(this.f35801b.position() + iD, this.f35801b.limit()));
        } while (iD > 0);
    }

    private void r() {
        d();
        q();
    }

    public d p(ByteBuffer byteBuffer) {
        o();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f35801b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f35801b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
