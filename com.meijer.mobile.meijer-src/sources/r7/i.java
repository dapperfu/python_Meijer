package r7;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class i extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: a, reason: collision with root package name */
    private int f159423a;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        super.mark(i10);
        this.f159423a = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (a(1L) == -1) {
            return -1;
        }
        int i10 = super.read();
        b(1L);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.f159423a = Integer.MIN_VALUE;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    private long a(long j10) {
        int i10 = this.f159423a;
        if (i10 == 0) {
            return -1L;
        }
        return (i10 == Integer.MIN_VALUE || j10 <= ((long) i10)) ? j10 : i10;
    }

    private void b(long j10) {
        int i10 = this.f159423a;
        if (i10 == Integer.MIN_VALUE || j10 == -1) {
            return;
        }
        this.f159423a = (int) (i10 - j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i10 = this.f159423a;
        return i10 == Integer.MIN_VALUE ? super.available() : Math.min(i10, super.available());
    }

    public i(InputStream inputStream) {
        super(inputStream);
        this.f159423a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jA = a(j10);
        if (jA == -1) {
            return 0L;
        }
        long jSkip = super.skip(jA);
        b(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int iA = (int) a(i11);
        if (iA == -1) {
            return -1;
        }
        int i12 = super.read(bArr, i10, iA);
        b(i12);
        return i12;
    }
}
