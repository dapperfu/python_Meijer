package iu;

import java.io.IOException;
import kw.AbstractC15337n;
import kw.C15328e;
import kw.I;

/* renamed from: iu.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
class C14762b extends AbstractC15337n {

    /* renamed from: b, reason: collision with root package name */
    private boolean f138502b;

    protected void a(IOException iOException) {
        throw null;
    }

    @Override // kw.AbstractC15337n, kw.I
    public void M1(C15328e c15328e, long j10) throws IOException {
        if (this.f138502b) {
            c15328e.skip(j10);
            return;
        }
        try {
            super.M1(c15328e, j10);
        } catch (IOException e10) {
            this.f138502b = true;
            a(e10);
        }
    }

    @Override // kw.AbstractC15337n, kw.I, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f138502b) {
            return;
        }
        try {
            super.close();
        } catch (IOException e10) {
            this.f138502b = true;
            a(e10);
        }
    }

    @Override // kw.AbstractC15337n, kw.I, java.io.Flushable
    public void flush() throws IOException {
        if (this.f138502b) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.f138502b = true;
            a(e10);
        }
    }

    public C14762b(I i10) {
        super(i10);
    }
}
