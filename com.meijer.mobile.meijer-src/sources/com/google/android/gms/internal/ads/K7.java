package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* loaded from: classes6.dex */
public final class K7 extends Rx0 {

    /* renamed from: j, reason: collision with root package name */
    private Date f68876j;

    /* renamed from: k, reason: collision with root package name */
    private Date f68877k;

    /* renamed from: l, reason: collision with root package name */
    private long f68878l;

    /* renamed from: m, reason: collision with root package name */
    private long f68879m;

    /* renamed from: n, reason: collision with root package name */
    private double f68880n;

    /* renamed from: o, reason: collision with root package name */
    private float f68881o;

    /* renamed from: p, reason: collision with root package name */
    private C7756by0 f68882p;

    /* renamed from: q, reason: collision with root package name */
    private long f68883q;

    public final long g() {
        return this.f68879m;
    }

    public final long h() {
        return this.f68878l;
    }

    public K7() {
        super("mvhd");
        this.f68880n = 1.0d;
        this.f68881o = 1.0f;
        this.f68882p = C7756by0.f73873j;
    }

    @Override // com.google.android.gms.internal.ads.Ox0
    public final void c(ByteBuffer byteBuffer) {
        f(byteBuffer);
        if (e() == 1) {
            this.f68876j = Wx0.a(F7.f(byteBuffer));
            this.f68877k = Wx0.a(F7.f(byteBuffer));
            this.f68878l = F7.e(byteBuffer);
            this.f68879m = F7.f(byteBuffer);
        } else {
            this.f68876j = Wx0.a(F7.e(byteBuffer));
            this.f68877k = Wx0.a(F7.e(byteBuffer));
            this.f68878l = F7.e(byteBuffer);
            this.f68879m = F7.e(byteBuffer);
        }
        this.f68880n = F7.b(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.f68881o = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        F7.d(byteBuffer);
        F7.e(byteBuffer);
        F7.e(byteBuffer);
        this.f68882p = new C7756by0(F7.b(byteBuffer), F7.b(byteBuffer), F7.b(byteBuffer), F7.b(byteBuffer), F7.a(byteBuffer), F7.a(byteBuffer), F7.a(byteBuffer), F7.b(byteBuffer), F7.b(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.f68883q = F7.e(byteBuffer);
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.f68876j + ";modificationTime=" + this.f68877k + ";timescale=" + this.f68878l + ";duration=" + this.f68879m + ";rate=" + this.f68880n + ";volume=" + this.f68881o + ";matrix=" + this.f68882p + ";nextTrackId=" + this.f68883q + "]";
    }
}
