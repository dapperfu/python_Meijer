package bb;

import java.io.Serializable;
import java.io.Writer;

/* renamed from: bb.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6220d extends Writer implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f60102a = new StringBuilder(4);

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    @Override // java.io.Writer
    public final void write(String str) {
        if (str != null) {
            this.f60102a.append(str);
        }
    }

    public final String toString() {
        return this.f60102a.toString();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        if (cArr != null) {
            this.f60102a.append(cArr, i10, i11);
        }
    }

    public C6220d(byte b10) {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c10) {
        this.f60102a.append(c10);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        this.f60102a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i10, int i11) {
        this.f60102a.append(charSequence, i10, i11);
        return this;
    }
}
