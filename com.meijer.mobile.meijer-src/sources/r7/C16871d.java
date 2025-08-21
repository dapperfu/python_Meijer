package r7;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Queue;

/* renamed from: r7.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16871d extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: c, reason: collision with root package name */
    private static final Queue<C16871d> f159409c = l.f(0);

    /* renamed from: a, reason: collision with root package name */
    private InputStream f159410a;

    /* renamed from: b, reason: collision with root package name */
    private IOException f159411b;

    public void c() {
        this.f159411b = null;
        this.f159410a = null;
        Queue<C16871d> queue = f159409c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f159410a.read();
        } catch (IOException e10) {
            this.f159411b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f159410a.reset();
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public static C16871d b(InputStream inputStream) {
        C16871d c16871dPoll;
        Queue<C16871d> queue = f159409c;
        synchronized (queue) {
            c16871dPoll = queue.poll();
        }
        if (c16871dPoll == null) {
            c16871dPoll = new C16871d();
        }
        c16871dPoll.d(inputStream);
        return c16871dPoll;
    }

    public IOException a() {
        return this.f159411b;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f159410a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f159410a.close();
    }

    void d(InputStream inputStream) {
        this.f159410a = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f159410a.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f159410a.markSupported();
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        try {
            return this.f159410a.skip(j10);
        } catch (IOException e10) {
            this.f159411b = e10;
            throw e10;
        }
    }

    C16871d() {
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f159410a.read(bArr);
        } catch (IOException e10) {
            this.f159411b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            return this.f159410a.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f159411b = e10;
            throw e10;
        }
    }
}
