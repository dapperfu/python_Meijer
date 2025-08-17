package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public abstract class Rx0 extends Ox0 implements G7 {

    /* renamed from: i, reason: collision with root package name */
    private int f69973i;

    protected Rx0(String str) {
        super("mvhd");
    }

    public final int e() {
        if (!this.f69210b) {
            d();
        }
        return this.f69973i;
    }

    protected final long f(ByteBuffer byteBuffer) {
        this.f69973i = F7.c(byteBuffer.get());
        F7.d(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
