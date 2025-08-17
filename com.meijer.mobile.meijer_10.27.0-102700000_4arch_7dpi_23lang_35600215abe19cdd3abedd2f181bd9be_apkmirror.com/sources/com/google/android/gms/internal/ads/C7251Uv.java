package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: com.google.android.gms.internal.ads.Uv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7251Uv implements InterfaceC9330ru {

    /* renamed from: b, reason: collision with root package name */
    private int f70718b;

    /* renamed from: c, reason: collision with root package name */
    private float f70719c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f70720d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private C9328rt f70721e;

    /* renamed from: f, reason: collision with root package name */
    private C9328rt f70722f;

    /* renamed from: g, reason: collision with root package name */
    private C9328rt f70723g;

    /* renamed from: h, reason: collision with root package name */
    private C9328rt f70724h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f70725i;

    /* renamed from: j, reason: collision with root package name */
    private C9546tv f70726j;

    /* renamed from: k, reason: collision with root package name */
    private ByteBuffer f70727k;

    /* renamed from: l, reason: collision with root package name */
    private ShortBuffer f70728l;

    /* renamed from: m, reason: collision with root package name */
    private ByteBuffer f70729m;

    /* renamed from: n, reason: collision with root package name */
    private long f70730n;

    /* renamed from: o, reason: collision with root package name */
    private long f70731o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f70732p;

    public final void d(float f10) {
        if (this.f70720d != f10) {
            this.f70720d = f10;
            this.f70725i = true;
        }
    }

    public final void e(float f10) {
        if (this.f70719c != f10) {
            this.f70719c = f10;
            this.f70725i = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9330ru
    public final boolean zzh() {
        if (!this.f70732p) {
            return false;
        }
        C9546tv c9546tv = this.f70726j;
        return c9546tv == null || c9546tv.a() == 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9330ru
    public final C9328rt b(C9328rt c9328rt) throws zzcg {
        if (c9328rt.f78082c != 2) {
            throw new zzcg("Unhandled input format:", c9328rt);
        }
        int i10 = this.f70718b;
        if (i10 == -1) {
            i10 = c9328rt.f78080a;
        }
        this.f70721e = c9328rt;
        C9328rt c9328rt2 = new C9328rt(i10, c9328rt.f78081b, 2);
        this.f70722f = c9328rt2;
        this.f70725i = true;
        return c9328rt2;
    }

    public final long c(long j10) {
        long j11 = this.f70731o;
        if (j11 < 1024) {
            return (long) (this.f70719c * j10);
        }
        long j12 = this.f70730n;
        this.f70726j.getClass();
        long jB = j12 - r2.b();
        int i10 = this.f70724h.f78080a;
        int i11 = this.f70723g.f78080a;
        return i10 == i11 ? OV.M(j10, jB, j11, RoundingMode.DOWN) : OV.M(j10, jB * i10, j11 * i11, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9330ru
    public final ByteBuffer zzb() {
        int iA;
        C9546tv c9546tv = this.f70726j;
        if (c9546tv != null && (iA = c9546tv.a()) > 0) {
            if (this.f70727k.capacity() < iA) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iA).order(ByteOrder.nativeOrder());
                this.f70727k = byteBufferOrder;
                this.f70728l = byteBufferOrder.asShortBuffer();
            } else {
                this.f70727k.clear();
                this.f70728l.clear();
            }
            c9546tv.d(this.f70728l);
            this.f70731o += iA;
            this.f70727k.limit(iA);
            this.f70729m = this.f70727k;
        }
        ByteBuffer byteBuffer = this.f70729m;
        this.f70729m = InterfaceC9330ru.f78084a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9330ru
    public final void zzd() {
        C9546tv c9546tv = this.f70726j;
        if (c9546tv != null) {
            c9546tv.e();
        }
        this.f70732p = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9330ru
    public final void zzf() {
        this.f70719c = 1.0f;
        this.f70720d = 1.0f;
        C9328rt c9328rt = C9328rt.f78079e;
        this.f70721e = c9328rt;
        this.f70722f = c9328rt;
        this.f70723g = c9328rt;
        this.f70724h = c9328rt;
        ByteBuffer byteBuffer = InterfaceC9330ru.f78084a;
        this.f70727k = byteBuffer;
        this.f70728l = byteBuffer.asShortBuffer();
        this.f70729m = byteBuffer;
        this.f70718b = -1;
        this.f70725i = false;
        this.f70726j = null;
        this.f70730n = 0L;
        this.f70731o = 0L;
        this.f70732p = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9330ru
    public final boolean zzg() {
        if (this.f70722f.f78080a != -1) {
            return Math.abs(this.f70719c + (-1.0f)) >= 1.0E-4f || Math.abs(this.f70720d + (-1.0f)) >= 1.0E-4f || this.f70722f.f78080a != this.f70721e.f78080a;
        }
        return false;
    }

    public C7251Uv() {
        C9328rt c9328rt = C9328rt.f78079e;
        this.f70721e = c9328rt;
        this.f70722f = c9328rt;
        this.f70723g = c9328rt;
        this.f70724h = c9328rt;
        ByteBuffer byteBuffer = InterfaceC9330ru.f78084a;
        this.f70727k = byteBuffer;
        this.f70728l = byteBuffer.asShortBuffer();
        this.f70729m = byteBuffer;
        this.f70718b = -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9330ru
    public final void a(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        C9546tv c9546tv = this.f70726j;
        c9546tv.getClass();
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        int iRemaining = byteBuffer.remaining();
        this.f70730n += iRemaining;
        c9546tv.f(shortBufferAsShortBuffer);
        byteBuffer.position(byteBuffer.position() + iRemaining);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9330ru
    public final void zzc() {
        if (zzg()) {
            C9328rt c9328rt = this.f70721e;
            this.f70723g = c9328rt;
            C9328rt c9328rt2 = this.f70722f;
            this.f70724h = c9328rt2;
            if (this.f70725i) {
                this.f70726j = new C9546tv(c9328rt.f78080a, c9328rt.f78081b, this.f70719c, this.f70720d, c9328rt2.f78080a);
            } else {
                C9546tv c9546tv = this.f70726j;
                if (c9546tv != null) {
                    c9546tv.c();
                }
            }
        }
        this.f70729m = InterfaceC9330ru.f78084a;
        this.f70730n = 0L;
        this.f70731o = 0L;
        this.f70732p = false;
    }
}
