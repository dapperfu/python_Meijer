package com.google.android.gms.internal.ads;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.ads.n7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8948n7 extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: a, reason: collision with root package name */
    private final long f77840a;

    /* renamed from: b, reason: collision with root package name */
    private long f77841b;

    final long a() {
        return this.f77840a - this.f77841b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i10 = super.read();
        if (i10 != -1) {
            this.f77841b++;
        }
        return i10;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = super.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f77841b += i12;
        }
        return i12;
    }

    C8948n7(InputStream inputStream, long j10) {
        super(inputStream);
        this.f77840a = j10;
    }
}
