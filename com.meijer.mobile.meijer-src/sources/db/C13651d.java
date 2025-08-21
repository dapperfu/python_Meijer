package db;

import java.io.Serializable;
import java.io.Writer;

/* renamed from: db.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13651d extends Writer implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f128337a = new StringBuilder(4);

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    @Override // java.io.Writer
    public final void write(String str) {
        if (str != null) {
            this.f128337a.append(str);
        }
    }

    public final String toString() {
        return this.f128337a.toString();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        if (cArr != null) {
            this.f128337a.append(cArr, i10, i11);
        }
    }

    public C13651d(byte b10) {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c10) {
        this.f128337a.append(c10);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        this.f128337a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i10, int i11) {
        this.f128337a.append(charSequence, i10, i11);
        return this;
    }
}
