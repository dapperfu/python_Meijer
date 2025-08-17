package kf;

import java.io.Serializable;
import java.io.Writer;

/* renamed from: kf.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C15141a extends Writer implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f141850a;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str != null) {
            this.f141850a.append(str);
        }
    }

    public String toString() {
        return this.f141850a.toString();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        if (cArr != null) {
            this.f141850a.append(cArr, i10, i11);
        }
    }

    public C15141a(int i10) {
        this.f141850a = new StringBuilder(i10);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c10) {
        this.f141850a.append(c10);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        this.f141850a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i10, int i11) {
        this.f141850a.append(charSequence, i10, i11);
        return this;
    }
}
