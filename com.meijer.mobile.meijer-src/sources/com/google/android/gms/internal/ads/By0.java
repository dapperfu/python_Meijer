package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public class By0 extends C9033nw0 {

    /* renamed from: b, reason: collision with root package name */
    public C f66469b;

    /* renamed from: c, reason: collision with root package name */
    public final Qx0 f66470c = new Qx0();

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f66471d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f66472e;

    /* renamed from: f, reason: collision with root package name */
    public long f66473f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f66474g;

    /* renamed from: h, reason: collision with root package name */
    private final int f66475h;

    public final boolean l() {
        return d(1073741824);
    }

    static {
        C8417i8.b("media3.decoder");
    }

    private final ByteBuffer m(int i10) {
        int i11 = this.f66475h;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f66471d;
        throw new zzhg(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    public final void j(int i10) {
        ByteBuffer byteBuffer = this.f66471d;
        if (byteBuffer == null) {
            this.f66471d = m(i10);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (iCapacity >= i11) {
            this.f66471d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferM = m(i11);
        byteBufferM.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferM.put(byteBuffer);
        }
        this.f66471d = byteBufferM;
    }

    public final void k() {
        ByteBuffer byteBuffer = this.f66471d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f66474g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public By0(int i10, int i11) {
        this.f66475h = i10;
    }

    @Override // com.google.android.gms.internal.ads.C9033nw0
    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.f66471d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f66474g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f66472e = false;
    }
}
