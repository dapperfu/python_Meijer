package com.google.android.gms.internal.ads;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.ads.nR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8979nR extends InputStream implements InputStreamRetargetInterface {
    @Override // java.io.InputStream
    public final int read() {
        return -1;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    C8979nR(BinderC9513sR binderC9513sR) {
    }
}
