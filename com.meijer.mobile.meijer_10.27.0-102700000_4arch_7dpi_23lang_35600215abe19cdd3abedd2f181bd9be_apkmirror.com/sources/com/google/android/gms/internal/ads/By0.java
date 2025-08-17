package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public class By0 extends C8908nw0 {

    /* renamed from: b, reason: collision with root package name */
    public C f65629b;

    /* renamed from: c, reason: collision with root package name */
    public final Qx0 f65630c = new Qx0();

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f65631d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f65632e;

    /* renamed from: f, reason: collision with root package name */
    public long f65633f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f65634g;

    /* renamed from: h, reason: collision with root package name */
    private final int f65635h;

    public final boolean l() {
        return d(1073741824);
    }

    static {
        C8292i8.b("media3.decoder");
    }

    private final ByteBuffer m(int i10) {
        int i11 = this.f65635h;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f65631d;
        throw new zzhg(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    public final void j(int i10) {
        ByteBuffer byteBuffer = this.f65631d;
        if (byteBuffer == null) {
            this.f65631d = m(i10);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (iCapacity >= i11) {
            this.f65631d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferM = m(i11);
        byteBufferM.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferM.put(byteBuffer);
        }
        this.f65631d = byteBufferM;
    }

    public final void k() {
        ByteBuffer byteBuffer = this.f65631d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f65634g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public By0(int i10, int i11) {
        this.f65635h = i10;
    }

    @Override // com.google.android.gms.internal.ads.C8908nw0
    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.f65631d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f65634g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f65632e = false;
    }
}
