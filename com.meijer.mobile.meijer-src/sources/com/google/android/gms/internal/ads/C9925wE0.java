package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.wE0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9925wE0 implements ZD0 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f80299a;

    /* renamed from: b, reason: collision with root package name */
    private final UD0 f80300b;

    @Override // com.google.android.gms.internal.ads.ZD0
    public final /* synthetic */ boolean c(YD0 yd0) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void H0(int i10) {
        this.f80299a.setVideoScalingMode(i10);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void a(int i10, int i11, int i12, long j10, int i13) throws MediaCodec.CryptoException {
        this.f80299a.queueInputBuffer(i10, 0, i12, j10, i13);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void b(Surface surface) {
        this.f80299a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void d(int i10, long j10) {
        this.f80299a.releaseOutputBuffer(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void e(int i10, boolean z10) {
        this.f80299a.releaseOutputBuffer(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final int g(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f80299a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void u(Bundle bundle) {
        this.f80299a.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final int zza() {
        return this.f80299a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final MediaFormat zzc() {
        return this.f80299a.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final ByteBuffer zzf(int i10) {
        return this.f80299a.getInputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final ByteBuffer zzg(int i10) {
        return this.f80299a.getOutputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void zzi() {
        this.f80299a.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void zzj() {
        this.f80299a.flush();
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void zzm() {
        UD0 ud0;
        UD0 ud02;
        try {
            int i10 = OV.f69931a;
            if (i10 >= 30 && i10 < 33) {
                this.f80299a.stop();
            }
            if (i10 >= 35 && (ud02 = this.f80300b) != null) {
                ud02.c(this.f80299a);
            }
            this.f80299a.release();
        } catch (Throwable th2) {
            if (OV.f69931a >= 35 && (ud0 = this.f80300b) != null) {
                ud0.c(this.f80299a);
            }
            this.f80299a.release();
            throw th2;
        }
    }

    /* synthetic */ C9925wE0(MediaCodec mediaCodec, UD0 ud0, C9818vE0 c9818vE0) {
        this.f80299a = mediaCodec;
        this.f80300b = ud0;
        if (OV.f69931a >= 35 && ud0 != null) {
            ud0.a(mediaCodec);
        }
    }

    @Override // com.google.android.gms.internal.ads.ZD0
    public final void f(int i10, int i11, Qx0 qx0, long j10, int i12) throws MediaCodec.CryptoException {
        this.f80299a.queueSecureInputBuffer(i10, 0, qx0.a(), j10, 0);
    }
}
