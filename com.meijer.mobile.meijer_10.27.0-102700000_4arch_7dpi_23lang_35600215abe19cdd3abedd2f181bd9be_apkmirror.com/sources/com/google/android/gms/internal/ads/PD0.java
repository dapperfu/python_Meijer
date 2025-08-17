package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
final class PD0 extends By0 {

    /* renamed from: i, reason: collision with root package name */
    private long f69294i;

    /* renamed from: j, reason: collision with root package name */
    private int f69295j;

    /* renamed from: k, reason: collision with root package name */
    private int f69296k;

    public PD0() {
        super(2, 0);
        this.f69296k = 32;
    }

    public final int n() {
        return this.f69295j;
    }

    public final long o() {
        return this.f69294i;
    }

    public final void p(int i10) {
        this.f69296k = i10;
    }

    public final boolean r() {
        return this.f69295j > 0;
    }

    public final boolean q(By0 by0) {
        ByteBuffer byteBuffer;
        C8086gC.d(!by0.d(1073741824));
        C8086gC.d(!by0.d(268435456));
        C8086gC.d(!by0.d(4));
        if (r()) {
            if (this.f69295j >= this.f69296k) {
                return false;
            }
            ByteBuffer byteBuffer2 = by0.f65631d;
            if (byteBuffer2 != null && (byteBuffer = this.f65631d) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i10 = this.f69295j;
        this.f69295j = i10 + 1;
        if (i10 == 0) {
            this.f65633f = by0.f65633f;
            if (by0.d(1)) {
                c(1);
            }
        }
        ByteBuffer byteBuffer3 = by0.f65631d;
        if (byteBuffer3 != null) {
            j(byteBuffer3.remaining());
            this.f65631d.put(byteBuffer3);
        }
        this.f69294i = by0.f65633f;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.By0, com.google.android.gms.internal.ads.C8908nw0
    public final void b() {
        super.b();
        this.f69295j = 0;
    }
}
