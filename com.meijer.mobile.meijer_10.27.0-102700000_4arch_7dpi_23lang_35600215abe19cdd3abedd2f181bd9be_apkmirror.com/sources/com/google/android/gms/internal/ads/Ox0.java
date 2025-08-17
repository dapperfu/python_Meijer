package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public abstract class Ox0 implements G7 {

    /* renamed from: h, reason: collision with root package name */
    private static final AbstractC7525ay0 f69208h = AbstractC7525ay0.b(Ox0.class);

    /* renamed from: a, reason: collision with root package name */
    protected final String f69209a;

    /* renamed from: d, reason: collision with root package name */
    private ByteBuffer f69212d;

    /* renamed from: e, reason: collision with root package name */
    long f69213e;

    /* renamed from: g, reason: collision with root package name */
    Ux0 f69215g;

    /* renamed from: f, reason: collision with root package name */
    long f69214f = -1;

    /* renamed from: c, reason: collision with root package name */
    boolean f69211c = true;

    /* renamed from: b, reason: collision with root package name */
    boolean f69210b = true;

    protected Ox0(String str) {
        this.f69209a = str;
    }

    private final synchronized void b() {
        try {
            if (this.f69211c) {
                return;
            }
            try {
                AbstractC7525ay0 abstractC7525ay0 = f69208h;
                String str = this.f69209a;
                abstractC7525ay0.a(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.f69212d = this.f69215g.F1(this.f69213e, this.f69214f);
                this.f69211c = true;
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    protected abstract void c(ByteBuffer byteBuffer);

    public final synchronized void d() {
        try {
            b();
            AbstractC7525ay0 abstractC7525ay0 = f69208h;
            String str = this.f69209a;
            abstractC7525ay0.a(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.f69212d;
            if (byteBuffer != null) {
                this.f69210b = true;
                byteBuffer.rewind();
                c(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.f69212d = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.G7
    public final String zza() {
        return this.f69209a;
    }

    @Override // com.google.android.gms.internal.ads.G7
    public final void a(Ux0 ux0, ByteBuffer byteBuffer, long j10, D7 d72) throws IOException {
        this.f69213e = ux0.zzb();
        byteBuffer.remaining();
        this.f69214f = j10;
        this.f69215g = ux0;
        ux0.f(ux0.zzb() + j10);
        this.f69211c = false;
        this.f69210b = false;
        d();
    }
}
