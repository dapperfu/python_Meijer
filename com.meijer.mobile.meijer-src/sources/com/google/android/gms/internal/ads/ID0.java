package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
final class ID0 implements ZD0 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f68413a;

    /* renamed from: b, reason: collision with root package name */
    private final OD0 f68414b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC7576aE0 f68415c;

    /* renamed from: d, reason: collision with root package name */
    private final UD0 f68416d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f68417e;

    /* renamed from: f, reason: collision with root package name */
    private int f68418f = 0;

    static /* bridge */ /* synthetic */ void j(ID0 id0, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        UD0 ud0;
        id0.f68414b.f(id0.f68413a);
        Trace.beginSection("configureCodec");
        id0.f68413a.configure(mediaFormat, surface, (MediaCrypto) null, i10);
        Trace.endSection();
        id0.f68415c.zzh();
        Trace.beginSection("startCodec");
        id0.f68413a.start();
        Trace.endSection();
        if (OV.f69931a >= 35 && (ud0 = id0.f68416d) != null) {
            ud0.a(id0.f68413a);
        }
        id0.f68418f = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String k(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void H0(int i10) {
        this.f68413a.setVideoScalingMode(i10);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void a(int i10, int i11, int i12, long j10, int i13) {
        this.f68415c.c(i10, 0, i12, j10, i13);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void b(Surface surface) {
        this.f68413a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final boolean c(YD0 yd0) {
        this.f68414b.g(yd0);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void d(int i10, long j10) {
        this.f68413a.releaseOutputBuffer(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void e(int i10, boolean z10) {
        this.f68413a.releaseOutputBuffer(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void f(int i10, int i11, Qx0 qx0, long j10, int i12) {
        this.f68415c.a(i10, 0, qx0, j10, 0);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final int g(MediaCodec.BufferInfo bufferInfo) {
        this.f68415c.zzc();
        return this.f68414b.b(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void u(Bundle bundle) {
        this.f68415c.b(bundle);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final int zza() {
        this.f68415c.zzc();
        return this.f68414b.a();
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final MediaFormat zzc() {
        return this.f68414b.c();
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final ByteBuffer zzf(int i10) {
        return this.f68413a.getInputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final ByteBuffer zzg(int i10) {
        return this.f68413a.getOutputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void zzi() {
        this.f68413a.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void zzj() {
        this.f68415c.zzb();
        this.f68413a.flush();
        this.f68414b.e();
        this.f68413a.start();
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void zzm() {
        UD0 ud0;
        UD0 ud02;
        UD0 ud03;
        try {
            try {
                if (this.f68418f == 1) {
                    this.f68415c.zzg();
                    this.f68414b.h();
                }
                this.f68418f = 2;
                if (this.f68417e) {
                    return;
                }
                int i10 = OV.f69931a;
                if (i10 >= 30 && i10 < 33) {
                    this.f68413a.stop();
                }
                if (i10 >= 35 && (ud03 = this.f68416d) != null) {
                    ud03.c(this.f68413a);
                }
                this.f68413a.release();
                this.f68417e = true;
            } catch (Throwable th2) {
                if (!this.f68417e) {
                    int i11 = OV.f69931a;
                    if (i11 >= 30 && i11 < 33) {
                        this.f68413a.stop();
                    }
                    if (i11 >= 35 && (ud02 = this.f68416d) != null) {
                        ud02.c(this.f68413a);
                    }
                    this.f68413a.release();
                    this.f68417e = true;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            if (OV.f69931a >= 35 && (ud0 = this.f68416d) != null) {
                ud0.c(this.f68413a);
            }
            this.f68413a.release();
            this.f68417e = true;
            throw th3;
        }
    }

    /* synthetic */ ID0(MediaCodec mediaCodec, HandlerThread handlerThread, InterfaceC7576aE0 interfaceC7576aE0, UD0 ud0, HD0 hd0) {
        this.f68413a = mediaCodec;
        this.f68414b = new OD0(handlerThread);
        this.f68415c = interfaceC7576aE0;
        this.f68416d = ud0;
    }
}
