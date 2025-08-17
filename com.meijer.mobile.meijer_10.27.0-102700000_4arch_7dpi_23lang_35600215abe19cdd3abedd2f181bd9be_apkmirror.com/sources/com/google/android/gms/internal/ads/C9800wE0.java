package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.wE0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9800wE0 implements ZD0 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f79459a;

    /* renamed from: b, reason: collision with root package name */
    private final UD0 f79460b;

    @Override // com.google.android.gms.internal.ads.ZD0
    public final /* synthetic */ boolean c(YD0 yd0) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void E0(int i10) {
        this.f79459a.setVideoScalingMode(i10);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void a(int i10, int i11, int i12, long j10, int i13) throws MediaCodec.CryptoException {
        this.f79459a.queueInputBuffer(i10, 0, i12, j10, i13);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void b(Surface surface) {
        this.f79459a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void d(int i10, long j10) {
        this.f79459a.releaseOutputBuffer(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void e(int i10, boolean z10) {
        this.f79459a.releaseOutputBuffer(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final int g(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f79459a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void u(Bundle bundle) {
        this.f79459a.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final int zza() {
        return this.f79459a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final MediaFormat zzc() {
        return this.f79459a.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final ByteBuffer zzf(int i10) {
        return this.f79459a.getInputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final ByteBuffer zzg(int i10) {
        return this.f79459a.getOutputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void zzi() {
        this.f79459a.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void zzj() {
        this.f79459a.flush();
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void zzm() {
        UD0 ud0;
        UD0 ud02;
        try {
            int i10 = OV.f69091a;
            if (i10 >= 30 && i10 < 33) {
                this.f79459a.stop();
            }
            if (i10 >= 35 && (ud02 = this.f79460b) != null) {
                ud02.c(this.f79459a);
            }
            this.f79459a.release();
        } catch (Throwable th2) {
            if (OV.f69091a >= 35 && (ud0 = this.f79460b) != null) {
                ud0.c(this.f79459a);
            }
            this.f79459a.release();
            throw th2;
        }
    }

    /* synthetic */ C9800wE0(MediaCodec mediaCodec, UD0 ud0, C9693vE0 c9693vE0) {
        this.f79459a = mediaCodec;
        this.f79460b = ud0;
        if (OV.f69091a >= 35 && ud0 != null) {
            ud0.a(mediaCodec);
        }
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void f(int i10, int i11, Qx0 qx0, long j10, int i12) throws MediaCodec.CryptoException {
        this.f79459a.queueSecureInputBuffer(i10, 0, qx0.a(), j10, 0);
    }
}
