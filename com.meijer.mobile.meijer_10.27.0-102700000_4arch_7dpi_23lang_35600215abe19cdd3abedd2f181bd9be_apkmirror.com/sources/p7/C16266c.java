package p7;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: p7.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16266c extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: a, reason: collision with root package name */
    private final long f155650a;

    /* renamed from: b, reason: collision with root package name */
    private int f155651b;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f155650a - this.f155651b, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int i10;
        i10 = super.read();
        a(i10 >= 0 ? 1 : -1);
        return i10;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    private int a(int i10) throws IOException {
        if (i10 >= 0) {
            this.f155651b += i10;
            return i10;
        }
        if (this.f155650a - this.f155651b <= 0) {
            return i10;
        }
        throw new IOException("Failed to read all expected data, expected: " + this.f155650a + ", but read: " + this.f155651b);
    }

    public static InputStream b(InputStream inputStream, long j10) {
        return new C16266c(inputStream, j10);
    }

    private C16266c(InputStream inputStream, long j10) {
        super(inputStream);
        this.f155650a = j10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        return a(super.read(bArr, i10, i11));
    }
}
