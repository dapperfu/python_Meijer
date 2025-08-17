package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Bundle;
import g3.C14196c;

/* loaded from: classes.dex */
class r implements i {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f56511a;

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void d() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void flush() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void shutdown() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void start() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void a(int i10, int i11, int i12, long j10, int i13) throws MediaCodec.CryptoException {
        this.f56511a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void b(Bundle bundle) {
        this.f56511a.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.i
    public void c(int i10, int i11, C14196c c14196c, long j10, int i12) throws MediaCodec.CryptoException {
        this.f56511a.queueSecureInputBuffer(i10, i11, c14196c.a(), j10, i12);
    }

    public r(MediaCodec mediaCodec) {
        this.f56511a = mediaCodec;
    }
}
