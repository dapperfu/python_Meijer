package com.google.android.gms.internal.ads;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;

/* renamed from: com.google.android.gms.internal.ads.Sc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7159Sc extends PushbackInputStream implements InputStreamRetargetInterface {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7193Tc f70132a;

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        C7260Vc.e(this.f70132a.f70421c);
        super.close();
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7159Sc(C7193Tc c7193Tc, InputStream inputStream, int i10) {
        super(inputStream, 1);
        this.f70132a = c7193Tc;
    }
}
