package x3;

import a3.InterfaceC5654k;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: x3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18070i implements InterfaceC18078q {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5654k f170293b;

    /* renamed from: c, reason: collision with root package name */
    private final long f170294c;

    /* renamed from: d, reason: collision with root package name */
    private long f170295d;

    /* renamed from: f, reason: collision with root package name */
    private int f170297f;

    /* renamed from: g, reason: collision with root package name */
    private int f170298g;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f170296e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f170292a = new byte[RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT];

    private void n(int i10) {
        if (i10 != -1) {
            this.f170295d += i10;
        }
    }

    @Override // x3.InterfaceC18078q
    public void d() {
        this.f170297f = 0;
    }

    @Override // x3.InterfaceC18078q
    public void i(int i10) throws IOException {
        l(i10, false);
    }

    @Override // x3.InterfaceC18078q
    public void k(int i10) throws IOException {
        s(i10, false);
    }

    @Override // x3.InterfaceC18078q
    public void m(byte[] bArr, int i10, int i11) throws IOException {
        b(bArr, i10, i11, false);
    }

    @Override // x3.InterfaceC18078q
    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        f(bArr, i10, i11, false);
    }

    static {
        a3.w.a("media3.extractor");
    }

    private void o(int i10) {
        int i11 = this.f170297f + i10;
        byte[] bArr = this.f170296e;
        if (i11 > bArr.length) {
            this.f170296e = Arrays.copyOf(this.f170296e, d3.P.o(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    private int p(byte[] bArr, int i10, int i11) {
        int i12 = this.f170298g;
        if (i12 == 0) {
            return 0;
        }
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f170296e, 0, bArr, i10, iMin);
        t(iMin);
        return iMin;
    }

    private int r(int i10) {
        int iMin = Math.min(this.f170298g, i10);
        t(iMin);
        return iMin;
    }

    private void t(int i10) {
        int i11 = this.f170298g - i10;
        this.f170298g = i11;
        this.f170297f = 0;
        byte[] bArr = this.f170296e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f170296e = bArr2;
    }

    @Override // x3.InterfaceC18078q
    public long g() {
        return this.f170295d + this.f170297f;
    }

    @Override // x3.InterfaceC18078q
    public long getLength() {
        return this.f170294c;
    }

    @Override // x3.InterfaceC18078q
    public long getPosition() {
        return this.f170295d;
    }

    public C18070i(InterfaceC5654k interfaceC5654k, long j10, long j11) {
        this.f170293b = interfaceC5654k;
        this.f170295d = j10;
        this.f170294c = j11;
    }

    private int q(byte[] bArr, int i10, int i11, int i12, boolean z10) throws IOException {
        if (!Thread.interrupted()) {
            int i13 = this.f170293b.read(bArr, i10 + i12, i11 - i12);
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

    @Override // x3.InterfaceC18078q
    public int a(int i10) throws IOException {
        int iR = r(i10);
        if (iR == 0) {
            byte[] bArr = this.f170292a;
            iR = q(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        n(iR);
        return iR;
    }

    @Override // x3.InterfaceC18078q
    public boolean b(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        if (!l(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f170296e, this.f170297f - i11, bArr, i10, i11);
        return true;
    }

    @Override // x3.InterfaceC18078q
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

    @Override // x3.InterfaceC18078q
    public int j(byte[] bArr, int i10, int i11) throws IOException {
        C18070i c18070i;
        int iMin;
        o(i11);
        int i12 = this.f170298g;
        int i13 = this.f170297f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            c18070i = this;
            iMin = c18070i.q(this.f170296e, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            c18070i.f170298g += iMin;
        } else {
            c18070i = this;
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(c18070i.f170296e, c18070i.f170297f, bArr, i10, iMin);
        c18070i.f170297f += iMin;
        return iMin;
    }

    @Override // x3.InterfaceC18078q
    public boolean l(int i10, boolean z10) throws IOException {
        o(i10);
        int iQ = this.f170298g - this.f170297f;
        while (iQ < i10) {
            int i11 = i10;
            boolean z11 = z10;
            iQ = q(this.f170296e, this.f170297f, i11, iQ, z11);
            if (iQ == -1) {
                return false;
            }
            this.f170298g = this.f170297f + iQ;
            i10 = i11;
            z10 = z11;
        }
        this.f170297f += i10;
        return true;
    }

    @Override // x3.InterfaceC18078q, a3.InterfaceC5654k
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
            iR = q(this.f170292a, -iR, Math.min(i10, this.f170292a.length + iR), iR, z10);
        }
        n(iR);
        if (iR != -1) {
            return true;
        }
        return false;
    }
}
