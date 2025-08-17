package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class L7 extends Ox0 {
    public L7(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.Ox0
    public final void c(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
