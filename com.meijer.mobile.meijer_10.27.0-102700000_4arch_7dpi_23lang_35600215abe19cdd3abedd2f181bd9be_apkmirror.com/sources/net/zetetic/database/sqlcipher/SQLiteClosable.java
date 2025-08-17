package net.zetetic.database.sqlcipher;

import java.io.Closeable;

/* loaded from: classes13.dex */
public abstract class SQLiteClosable implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private int f151248a = 1;

    public void a() {
        synchronized (this) {
            try {
                int i10 = this.f151248a;
                if (i10 <= 0) {
                    throw new IllegalStateException("attempt to re-open an already-closed object: " + this);
                }
                this.f151248a = i10 + 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected abstract void b();

    public void c() {
        boolean z10;
        synchronized (this) {
            z10 = true;
            int i10 = this.f151248a - 1;
            this.f151248a = i10;
            if (i10 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            b();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c();
    }
}
