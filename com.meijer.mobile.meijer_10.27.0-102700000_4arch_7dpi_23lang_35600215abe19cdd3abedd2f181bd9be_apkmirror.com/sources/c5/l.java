package c5;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\rJ'\u0010\t\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\nJ\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001a¨\u0006\u001c"}, d2 = {"Lc5/l;", "Ljava/io/InputStream;", "delegate", "<init>", "(Ljava/io/InputStream;)V", "", "bytesRead", "a", "(I)I", "read", "()I", "", "b", "([B)I", "off", "len", "([BII)I", "", "n", "skip", "(J)J", "available", "", "close", "()V", "Ljava/io/InputStream;", "I", "availableBytes", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class l extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InputStream delegate;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int availableBytes = 1073741824;

    private final int a(int bytesRead) {
        if (bytesRead == -1) {
            this.availableBytes = 0;
        }
        return bytesRead;
    }

    @Override // java.io.InputStream
    public int read() {
        return a(this.delegate.read());
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public int available() {
        return this.availableBytes;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // java.io.InputStream
    public int read(byte[] b10) {
        return a(this.delegate.read(b10));
    }

    @Override // java.io.InputStream
    public long skip(long n10) {
        return this.delegate.skip(n10);
    }

    public l(InputStream inputStream) {
        this.delegate = inputStream;
    }

    @Override // java.io.InputStream
    public int read(byte[] b10, int off, int len) {
        return a(this.delegate.read(b10, off, len));
    }
}
