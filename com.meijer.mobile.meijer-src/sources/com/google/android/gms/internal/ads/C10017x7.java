package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.x7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10017x7 extends ByteArrayOutputStream {

    /* renamed from: a, reason: collision with root package name */
    private final C8627k7 f80521a;

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i10) {
        a(1);
        super.write(i10);
    }

    private final void a(int i10) {
        int i11 = ((ByteArrayOutputStream) this).count;
        if (i11 + i10 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i12 = i11 + i10;
        byte[] bArrB = this.f80521a.b(i12 + i12);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrB, 0, ((ByteArrayOutputStream) this).count);
        this.f80521a.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrB;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f80521a.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f80521a.a(((ByteArrayOutputStream) this).buf);
    }

    public C10017x7(C8627k7 c8627k7, int i10) {
        this.f80521a = c8627k7;
        ((ByteArrayOutputStream) this).buf = c8627k7.b(Math.max(i10, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i10, int i11) {
        a(i11);
        super.write(bArr, i10, i11);
    }
}
