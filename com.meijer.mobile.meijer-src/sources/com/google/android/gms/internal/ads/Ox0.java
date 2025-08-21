package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public abstract class Ox0 implements G7 {

    /* renamed from: h, reason: collision with root package name */
    private static final AbstractC7650ay0 f70048h = AbstractC7650ay0.b(Ox0.class);

    /* renamed from: a, reason: collision with root package name */
    protected final String f70049a;

    /* renamed from: d, reason: collision with root package name */
    private ByteBuffer f70052d;

    /* renamed from: e, reason: collision with root package name */
    long f70053e;

    /* renamed from: g, reason: collision with root package name */
    Ux0 f70055g;

    /* renamed from: f, reason: collision with root package name */
    long f70054f = -1;

    /* renamed from: c, reason: collision with root package name */
    boolean f70051c = true;

    /* renamed from: b, reason: collision with root package name */
    boolean f70050b = true;

    protected Ox0(String str) {
        this.f70049a = str;
    }

    private final synchronized void b() {
        try {
            if (this.f70051c) {
                return;
            }
            try {
                AbstractC7650ay0 abstractC7650ay0 = f70048h;
                String str = this.f70049a;
                abstractC7650ay0.a(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.f70052d = this.f70055g.H1(this.f70053e, this.f70054f);
                this.f70051c = true;
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
            AbstractC7650ay0 abstractC7650ay0 = f70048h;
            String str = this.f70049a;
            abstractC7650ay0.a(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.f70052d;
            if (byteBuffer != null) {
                this.f70050b = true;
                byteBuffer.rewind();
                c(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.f70052d = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.G7
    public final String zza() {
        return this.f70049a;
    }

    @Override // com.google.android.gms.internal.ads.G7
    public final void a(Ux0 ux0, ByteBuffer byteBuffer, long j10, D7 d72) throws IOException {
        this.f70053e = ux0.zzb();
        byteBuffer.remaining();
        this.f70054f = j10;
        this.f70055g = ux0;
        ux0.f(ux0.zzb() + j10);
        this.f70051c = false;
        this.f70050b = false;
        d();
    }
}
