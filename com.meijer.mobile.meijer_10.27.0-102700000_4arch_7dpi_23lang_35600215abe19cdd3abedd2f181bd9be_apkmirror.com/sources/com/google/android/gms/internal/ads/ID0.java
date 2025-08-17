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
    private final MediaCodec f67573a;

    /* renamed from: b, reason: collision with root package name */
    private final OD0 f67574b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC7451aE0 f67575c;

    /* renamed from: d, reason: collision with root package name */
    private final UD0 f67576d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f67577e;

    /* renamed from: f, reason: collision with root package name */
    private int f67578f = 0;

    static /* bridge */ /* synthetic */ void j(ID0 id0, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        UD0 ud0;
        id0.f67574b.f(id0.f67573a);
        Trace.beginSection("configureCodec");
        id0.f67573a.configure(mediaFormat, surface, (MediaCrypto) null, i10);
        Trace.endSection();
        id0.f67575c.zzh();
        Trace.beginSection("startCodec");
        id0.f67573a.start();
        Trace.endSection();
        if (OV.f69091a >= 35 && (ud0 = id0.f67576d) != null) {
            ud0.a(id0.f67573a);
        }
        id0.f67578f = 1;
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
    public final void E0(int i10) {
        this.f67573a.setVideoScalingMode(i10);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void a(int i10, int i11, int i12, long j10, int i13) {
        this.f67575c.c(i10, 0, i12, j10, i13);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void b(Surface surface) {
        this.f67573a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final boolean c(YD0 yd0) {
        this.f67574b.g(yd0);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void d(int i10, long j10) {
        this.f67573a.releaseOutputBuffer(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void e(int i10, boolean z10) {
        this.f67573a.releaseOutputBuffer(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void f(int i10, int i11, Qx0 qx0, long j10, int i12) {
        this.f67575c.a(i10, 0, qx0, j10, 0);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final int g(MediaCodec.BufferInfo bufferInfo) {
        this.f67575c.zzc();
        return this.f67574b.b(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void u(Bundle bundle) {
        this.f67575c.b(bundle);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final int zza() {
        this.f67575c.zzc();
        return this.f67574b.a();
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final MediaFormat zzc() {
        return this.f67574b.c();
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final ByteBuffer zzf(int i10) {
        return this.f67573a.getInputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final ByteBuffer zzg(int i10) {
        return this.f67573a.getOutputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void zzi() {
        this.f67573a.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void zzj() {
        this.f67575c.zzb();
        this.f67573a.flush();
        this.f67574b.e();
        this.f67573a.start();
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void zzm() {
        UD0 ud0;
        UD0 ud02;
        UD0 ud03;
        try {
            try {
                if (this.f67578f == 1) {
                    this.f67575c.zzg();
                    this.f67574b.h();
                }
                this.f67578f = 2;
                if (this.f67577e) {
                    return;
                }
                int i10 = OV.f69091a;
                if (i10 >= 30 && i10 < 33) {
                    this.f67573a.stop();
                }
                if (i10 >= 35 && (ud03 = this.f67576d) != null) {
                    ud03.c(this.f67573a);
                }
                this.f67573a.release();
                this.f67577e = true;
            } catch (Throwable th2) {
                if (!this.f67577e) {
                    int i11 = OV.f69091a;
                    if (i11 >= 30 && i11 < 33) {
                        this.f67573a.stop();
                    }
                    if (i11 >= 35 && (ud02 = this.f67576d) != null) {
                        ud02.c(this.f67573a);
                    }
                    this.f67573a.release();
                    this.f67577e = true;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            if (OV.f69091a >= 35 && (ud0 = this.f67576d) != null) {
                ud0.c(this.f67573a);
            }
            this.f67573a.release();
            this.f67577e = true;
            throw th3;
        }
    }

    /* synthetic */ ID0(MediaCodec mediaCodec, HandlerThread handlerThread, InterfaceC7451aE0 interfaceC7451aE0, UD0 ud0, HD0 hd0) {
        this.f67573a = mediaCodec;
        this.f67574b = new OD0(handlerThread);
        this.f67575c = interfaceC7451aE0;
        this.f67576d = ud0;
    }
}
