package p7;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Queue;

/* renamed from: p7.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16267d extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: c, reason: collision with root package name */
    private static final Queue<C16267d> f155652c = l.f(0);

    /* renamed from: a, reason: collision with root package name */
    private InputStream f155653a;

    /* renamed from: b, reason: collision with root package name */
    private IOException f155654b;

    public void c() {
        this.f155654b = null;
        this.f155653a = null;
        Queue<C16267d> queue = f155652c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f155653a.read();
        } catch (IOException e10) {
            this.f155654b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f155653a.reset();
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public static C16267d b(InputStream inputStream) {
        C16267d c16267dPoll;
        Queue<C16267d> queue = f155652c;
        synchronized (queue) {
            c16267dPoll = queue.poll();
        }
        if (c16267dPoll == null) {
            c16267dPoll = new C16267d();
        }
        c16267dPoll.d(inputStream);
        return c16267dPoll;
    }

    public IOException a() {
        return this.f155654b;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f155653a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f155653a.close();
    }

    void d(InputStream inputStream) {
        this.f155653a = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f155653a.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f155653a.markSupported();
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        try {
            return this.f155653a.skip(j10);
        } catch (IOException e10) {
            this.f155654b = e10;
            throw e10;
        }
    }

    C16267d() {
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f155653a.read(bArr);
        } catch (IOException e10) {
            this.f155654b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            return this.f155653a.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f155654b = e10;
            throw e10;
        }
    }
}
