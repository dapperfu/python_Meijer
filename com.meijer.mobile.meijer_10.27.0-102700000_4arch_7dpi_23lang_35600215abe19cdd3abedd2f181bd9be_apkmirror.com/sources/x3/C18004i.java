package x3;

import a3.InterfaceC5571k;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: x3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18004i implements InterfaceC18012q {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5571k f169205b;

    /* renamed from: c, reason: collision with root package name */
    private final long f169206c;

    /* renamed from: d, reason: collision with root package name */
    private long f169207d;

    /* renamed from: f, reason: collision with root package name */
    private int f169209f;

    /* renamed from: g, reason: collision with root package name */
    private int f169210g;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f169208e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f169204a = new byte[RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT];

    private void n(int i10) {
        if (i10 != -1) {
            this.f169207d += i10;
        }
    }

    @Override // x3.InterfaceC18012q
    public void d() {
        this.f169209f = 0;
    }

    @Override // x3.InterfaceC18012q
    public void i(int i10) throws IOException {
        l(i10, false);
    }

    @Override // x3.InterfaceC18012q
    public void k(int i10) throws IOException {
        s(i10, false);
    }

    @Override // x3.InterfaceC18012q
    public void m(byte[] bArr, int i10, int i11) throws IOException {
        b(bArr, i10, i11, false);
    }

    @Override // x3.InterfaceC18012q
    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        f(bArr, i10, i11, false);
    }

    static {
        a3.w.a("media3.extractor");
    }

    private void o(int i10) {
        int i11 = this.f169209f + i10;
        byte[] bArr = this.f169208e;
        if (i11 > bArr.length) {
            this.f169208e = Arrays.copyOf(this.f169208e, d3.P.o(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    private int p(byte[] bArr, int i10, int i11) {
        int i12 = this.f169210g;
        if (i12 == 0) {
            return 0;
        }
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f169208e, 0, bArr, i10, iMin);
        t(iMin);
        return iMin;
    }

    private int r(int i10) {
        int iMin = Math.min(this.f169210g, i10);
        t(iMin);
        return iMin;
    }

    private void t(int i10) {
        int i11 = this.f169210g - i10;
        this.f169210g = i11;
        this.f169209f = 0;
        byte[] bArr = this.f169208e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f169208e = bArr2;
    }

    @Override // x3.InterfaceC18012q
    public long g() {
        return this.f169207d + this.f169209f;
    }

    @Override // x3.InterfaceC18012q
    public long getLength() {
        return this.f169206c;
    }

    @Override // x3.InterfaceC18012q
    public long getPosition() {
        return this.f169207d;
    }

    public C18004i(InterfaceC5571k interfaceC5571k, long j10, long j11) {
        this.f169205b = interfaceC5571k;
        this.f169207d = j10;
        this.f169206c = j11;
    }

    private int q(byte[] bArr, int i10, int i11, int i12, boolean z10) throws IOException {
        if (!Thread.interrupted()) {
            int i13 = this.f169205b.read(bArr, i10 + i12, i11 - i12);
            if (i13 == -1) {
                if (i12 == 0 && z10) {
                    return -1;
                }
                throw new EOFException();
            }
            return i12 + i13;
        }
        throw new InterruptedIOException();
    }

    @Override // x3.InterfaceC18012q
    public int a(int i10) throws IOException {
        int iR = r(i10);
        if (iR == 0) {
            byte[] bArr = this.f169204a;
            iR = q(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        n(iR);
        return iR;
    }

    @Override // x3.InterfaceC18012q
    public boolean b(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        if (!l(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f169208e, this.f169209f - i11, bArr, i10, i11);
        return true;
    }

    @Override // x3.InterfaceC18012q
    public boolean f(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        int iP = p(bArr, i10, i11);
        while (iP < i11 && iP != -1) {
            iP = q(bArr, i10, i11, iP, z10);
        }
        n(iP);
        if (iP != -1) {
            return true;
        }
        return false;
    }

    @Override // x3.InterfaceC18012q
    public int j(byte[] bArr, int i10, int i11) throws IOException {
        C18004i c18004i;
        int iMin;
        o(i11);
        int i12 = this.f169210g;
        int i13 = this.f169209f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            c18004i = this;
            iMin = c18004i.q(this.f169208e, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            c18004i.f169210g += iMin;
        } else {
            c18004i = this;
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(c18004i.f169208e, c18004i.f169209f, bArr, i10, iMin);
        c18004i.f169209f += iMin;
        return iMin;
    }

    @Override // x3.InterfaceC18012q
    public boolean l(int i10, boolean z10) throws IOException {
        o(i10);
        int iQ = this.f169210g - this.f169209f;
        while (iQ < i10) {
            int i11 = i10;
            boolean z11 = z10;
            iQ = q(this.f169208e, this.f169209f, i11, iQ, z11);
            if (iQ == -1) {
                return false;
            }
            this.f169210g = this.f169209f + iQ;
            i10 = i11;
            z10 = z11;
        }
        this.f169209f += i10;
        return true;
    }

    @Override // x3.InterfaceC18012q, a3.InterfaceC5571k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int iP = p(bArr, i10, i11);
        if (iP == 0) {
            iP = q(bArr, i10, i11, 0, true);
        }
        n(iP);
        return iP;
    }

    public boolean s(int i10, boolean z10) throws IOException {
        int iR = r(i10);
        while (iR < i10 && iR != -1) {
            iR = q(this.f169204a, -iR, Math.min(i10, this.f169204a.length + iR), iR, z10);
        }
        n(iR);
        if (iR != -1) {
            return true;
        }
        return false;
    }
}
