package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: com.google.android.gms.internal.ads.Uv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7376Uv implements InterfaceC9455ru {

    /* renamed from: b, reason: collision with root package name */
    private int f71558b;

    /* renamed from: c, reason: collision with root package name */
    private float f71559c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f71560d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private C9453rt f71561e;

    /* renamed from: f, reason: collision with root package name */
    private C9453rt f71562f;

    /* renamed from: g, reason: collision with root package name */
    private C9453rt f71563g;

    /* renamed from: h, reason: collision with root package name */
    private C9453rt f71564h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f71565i;

    /* renamed from: j, reason: collision with root package name */
    private C9671tv f71566j;

    /* renamed from: k, reason: collision with root package name */
    private ByteBuffer f71567k;

    /* renamed from: l, reason: collision with root package name */
    private ShortBuffer f71568l;

    /* renamed from: m, reason: collision with root package name */
    private ByteBuffer f71569m;

    /* renamed from: n, reason: collision with root package name */
    private long f71570n;

    /* renamed from: o, reason: collision with root package name */
    private long f71571o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f71572p;

    public final void d(float f10) {
        if (this.f71560d != f10) {
            this.f71560d = f10;
            this.f71565i = true;
        }
    }

    public final void e(float f10) {
        if (this.f71559c != f10) {
            this.f71559c = f10;
            this.f71565i = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9455ru
    public final boolean zzh() {
        if (!this.f71572p) {
            return false;
        }
        C9671tv c9671tv = this.f71566j;
        return c9671tv == null || c9671tv.a() == 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9455ru
    public final C9453rt b(C9453rt c9453rt) throws zzcg {
        if (c9453rt.f78922c != 2) {
            throw new zzcg("Unhandled input format:", c9453rt);
        }
        int i10 = this.f71558b;
        if (i10 == -1) {
            i10 = c9453rt.f78920a;
        }
        this.f71561e = c9453rt;
        C9453rt c9453rt2 = new C9453rt(i10, c9453rt.f78921b, 2);
        this.f71562f = c9453rt2;
        this.f71565i = true;
        return c9453rt2;
    }

    public final long c(long j10) {
        long j11 = this.f71571o;
        if (j11 < 1024) {
            return (long) (this.f71559c * j10);
        }
        long j12 = this.f71570n;
        this.f71566j.getClass();
        long jB = j12 - r2.b();
        int i10 = this.f71564h.f78920a;
        int i11 = this.f71563g.f78920a;
        return i10 == i11 ? OV.M(j10, jB, j11, RoundingMode.DOWN) : OV.M(j10, jB * i10, j11 * i11, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9455ru
    public final ByteBuffer zzb() {
        int iA;
        C9671tv c9671tv = this.f71566j;
        if (c9671tv != null && (iA = c9671tv.a()) > 0) {
            if (this.f71567k.capacity() < iA) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iA).order(ByteOrder.nativeOrder());
                this.f71567k = byteBufferOrder;
                this.f71568l = byteBufferOrder.asShortBuffer();
            } else {
                this.f71567k.clear();
                this.f71568l.clear();
            }
            c9671tv.d(this.f71568l);
            this.f71571o += iA;
            this.f71567k.limit(iA);
            this.f71569m = this.f71567k;
        }
        ByteBuffer byteBuffer = this.f71569m;
        this.f71569m = InterfaceC9455ru.f78924a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9455ru
    public final void zzd() {
        C9671tv c9671tv = this.f71566j;
        if (c9671tv != null) {
            c9671tv.e();
        }
        this.f71572p = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9455ru
    public final void zzf() {
        this.f71559c = 1.0f;
        this.f71560d = 1.0f;
        C9453rt c9453rt = C9453rt.f78919e;
        this.f71561e = c9453rt;
        this.f71562f = c9453rt;
        this.f71563g = c9453rt;
        this.f71564h = c9453rt;
        ByteBuffer byteBuffer = InterfaceC9455ru.f78924a;
        this.f71567k = byteBuffer;
        this.f71568l = byteBuffer.asShortBuffer();
        this.f71569m = byteBuffer;
        this.f71558b = -1;
        this.f71565i = false;
        this.f71566j = null;
        this.f71570n = 0L;
        this.f71571o = 0L;
        this.f71572p = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9455ru
    public final boolean zzg() {
        if (this.f71562f.f78920a != -1) {
            return Math.abs(this.f71559c + (-1.0f)) >= 1.0E-4f || Math.abs(this.f71560d + (-1.0f)) >= 1.0E-4f || this.f71562f.f78920a != this.f71561e.f78920a;
        }
        return false;
    }

    public C7376Uv() {
        C9453rt c9453rt = C9453rt.f78919e;
        this.f71561e = c9453rt;
        this.f71562f = c9453rt;
        this.f71563g = c9453rt;
        this.f71564h = c9453rt;
        ByteBuffer byteBuffer = InterfaceC9455ru.f78924a;
        this.f71567k = byteBuffer;
        this.f71568l = byteBuffer.asShortBuffer();
        this.f71569m = byteBuffer;
        this.f71558b = -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9455ru
    public final void a(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        C9671tv c9671tv = this.f71566j;
        c9671tv.getClass();
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        int iRemaining = byteBuffer.remaining();
        this.f71570n += iRemaining;
        c9671tv.f(shortBufferAsShortBuffer);
        byteBuffer.position(byteBuffer.position() + iRemaining);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9455ru
    public final void zzc() {
        if (zzg()) {
            C9453rt c9453rt = this.f71561e;
            this.f71563g = c9453rt;
            C9453rt c9453rt2 = this.f71562f;
            this.f71564h = c9453rt2;
            if (this.f71565i) {
                this.f71566j = new C9671tv(c9453rt.f78920a, c9453rt.f78921b, this.f71559c, this.f71560d, c9453rt2.f78920a);
            } else {
                C9671tv c9671tv = this.f71566j;
                if (c9671tv != null) {
                    c9671tv.c();
                }
            }
        }
        this.f71569m = InterfaceC9455ru.f78924a;
        this.f71570n = 0L;
        this.f71571o = 0L;
        this.f71572p = false;
    }
}
