package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
final class PD0 extends By0 {

    /* renamed from: i, reason: collision with root package name */
    private long f70134i;

    /* renamed from: j, reason: collision with root package name */
    private int f70135j;

    /* renamed from: k, reason: collision with root package name */
    private int f70136k;

    public PD0() {
        super(2, 0);
        this.f70136k = 32;
    }

    public final int n() {
        return this.f70135j;
    }

    public final long o() {
        return this.f70134i;
    }

    public final void p(int i10) {
        this.f70136k = i10;
    }

    public final boolean r() {
        return this.f70135j > 0;
    }

    public final boolean q(By0 by0) {
        ByteBuffer byteBuffer;
        C8211gC.d(!by0.d(1073741824));
        C8211gC.d(!by0.d(268435456));
        C8211gC.d(!by0.d(4));
        if (r()) {
            if (this.f70135j >= this.f70136k) {
                return false;
            }
            ByteBuffer byteBuffer2 = by0.f66471d;
            if (byteBuffer2 != null && (byteBuffer = this.f66471d) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i10 = this.f70135j;
        this.f70135j = i10 + 1;
        if (i10 == 0) {
            this.f66473f = by0.f66473f;
            if (by0.d(1)) {
                c(1);
            }
        }
        ByteBuffer byteBuffer3 = by0.f66471d;
        if (byteBuffer3 != null) {
            j(byteBuffer3.remaining());
            this.f66471d.put(byteBuffer3);
        }
        this.f70134i = by0.f66473f;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.By0, com.google.android.gms.internal.ads.C9033nw0
    public final void b() {
        super.b();
        this.f70135j = 0;
    }
}
