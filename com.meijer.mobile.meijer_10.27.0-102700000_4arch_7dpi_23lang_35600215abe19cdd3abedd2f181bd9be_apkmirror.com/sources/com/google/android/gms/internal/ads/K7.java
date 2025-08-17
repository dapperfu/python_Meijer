package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* loaded from: classes6.dex */
public final class K7 extends Rx0 {

    /* renamed from: j, reason: collision with root package name */
    private Date f68036j;

    /* renamed from: k, reason: collision with root package name */
    private Date f68037k;

    /* renamed from: l, reason: collision with root package name */
    private long f68038l;

    /* renamed from: m, reason: collision with root package name */
    private long f68039m;

    /* renamed from: n, reason: collision with root package name */
    private double f68040n;

    /* renamed from: o, reason: collision with root package name */
    private float f68041o;

    /* renamed from: p, reason: collision with root package name */
    private C7631by0 f68042p;

    /* renamed from: q, reason: collision with root package name */
    private long f68043q;

    public final long g() {
        return this.f68039m;
    }

    public final long h() {
        return this.f68038l;
    }

    public K7() {
        super("mvhd");
        this.f68040n = 1.0d;
        this.f68041o = 1.0f;
        this.f68042p = C7631by0.f73033j;
    }

    @Override // com.google.android.gms.internal.ads.Ox0
    public final void c(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.f68036j = Wx0.a(F7.f(byteBuffer));
            this.f68037k = Wx0.a(F7.f(byteBuffer));
            this.f68038l = F7.e(byteBuffer);
            this.f68039m = F7.f(byteBuffer);
        } else {
            this.f68036j = Wx0.a(F7.e(byteBuffer));
            this.f68037k = Wx0.a(F7.e(byteBuffer));
            this.f68038l = F7.e(byteBuffer);
            this.f68039m = F7.e(byteBuffer);
        }
        this.f68040n = F7.b(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.f68041o = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        F7.d(byteBuffer);
        F7.e(byteBuffer);
        F7.e(byteBuffer);
        this.f68042p = new C7631by0(F7.b(byteBuffer), F7.b(byteBuffer), F7.b(byteBuffer), F7.b(byteBuffer), F7.a(byteBuffer), F7.a(byteBuffer), F7.a(byteBuffer), F7.b(byteBuffer), F7.b(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.f68043q = F7.e(byteBuffer);
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.f68036j + ";modificationTime=" + this.f68037k + ";timescale=" + this.f68038l + ";duration=" + this.f68039m + ";rate=" + this.f68040n + ";volume=" + this.f68041o + ";matrix=" + this.f68042p + ";nextTrackId=" + this.f68043q + "]";
    }
}
