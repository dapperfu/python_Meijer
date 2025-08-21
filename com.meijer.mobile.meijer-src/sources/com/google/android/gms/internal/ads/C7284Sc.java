package com.google.android.gms.internal.ads;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;

/* renamed from: com.google.android.gms.internal.ads.Sc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7284Sc extends PushbackInputStream implements InputStreamRetargetInterface {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7318Tc f70972a;

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        C7385Vc.e(this.f70972a.f71261c);
        super.close();
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7284Sc(C7318Tc c7318Tc, InputStream inputStream, int i10) {
        super(inputStream, 1);
        this.f70972a = c7318Tc;
    }
}
