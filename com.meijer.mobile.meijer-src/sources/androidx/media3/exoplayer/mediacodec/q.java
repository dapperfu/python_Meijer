package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.h;
import d3.C13599a;
import d3.K;
import d3.P;
import g3.C14325c;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class q implements h {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f56733a;

    /* renamed from: b, reason: collision with root package name */
    private final n3.h f56734b;

    public static class b implements h.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.exoplayer.mediacodec.q$a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // androidx.media3.exoplayer.mediacodec.h.b
        @android.annotation.SuppressLint({"WrongConstant"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.media3.exoplayer.mediacodec.h b(androidx.media3.exoplayer.mediacodec.h.a r7) throws java.lang.Throwable {
            /*
                r6 = this;
                r0 = 0
                android.media.MediaCodec r1 = r6.c(r7)     // Catch: java.lang.RuntimeException -> L40 java.io.IOException -> L42
                java.lang.String r2 = "configureCodec"
                d3.K.a(r2)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                android.view.Surface r2 = r7.f56712d     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                if (r2 != 0) goto L22
                androidx.media3.exoplayer.mediacodec.j r3 = r7.f56709a     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                boolean r3 = r3.f56726k     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                if (r3 == 0) goto L22
                int r3 = d3.P.f127888a     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r4 = 35
                if (r3 < r4) goto L22
                r3 = 8
                goto L23
            L1d:
                r7 = move-exception
            L1e:
                r0 = r1
                goto L43
            L20:
                r7 = move-exception
                goto L1e
            L22:
                r3 = 0
            L23:
                android.media.MediaFormat r4 = r7.f56710b     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                android.media.MediaCrypto r5 = r7.f56713e     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r1.configure(r4, r2, r5, r3)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                d3.K.b()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                java.lang.String r2 = "startCodec"
                d3.K.a(r2)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r1.start()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                d3.K.b()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                androidx.media3.exoplayer.mediacodec.q r2 = new androidx.media3.exoplayer.mediacodec.q     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                n3.h r7 = r7.f56714f     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r2.<init>(r1, r7)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                return r2
            L40:
                r7 = move-exception
                goto L43
            L42:
                r7 = move-exception
            L43:
                if (r0 == 0) goto L48
                r0.release()
            L48:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.q.b.b(androidx.media3.exoplayer.mediacodec.h$a):androidx.media3.exoplayer.mediacodec.h");
        }

        protected MediaCodec c(h.a aVar) throws IOException {
            C13599a.e(aVar.f56709a);
            String str = aVar.f56709a.f56716a;
            K.a("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            K.b();
            return mediaCodecCreateByCodecName;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public boolean k() {
        return false;
    }

    private q(MediaCodec mediaCodec, n3.h hVar) {
        this.f56733a = mediaCodec;
        this.f56734b = hVar;
        if (P.f127888a < 35 || hVar == null) {
            return;
        }
        hVar.b(mediaCodec);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void a(int i10, int i11, int i12, long j10, int i13) throws MediaCodec.CryptoException {
        this.f56733a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void b(Bundle bundle) {
        this.f56733a.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void c(int i10, int i11, C14325c c14325c, long j10, int i12) throws MediaCodec.CryptoException {
        this.f56733a.queueSecureInputBuffer(i10, i11, c14325c.a(), j10, i12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void e(final h.d dVar, Handler handler) {
        this.f56733a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: n3.v
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                androidx.media3.exoplayer.mediacodec.q.q(this.f152026a, dVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public MediaFormat f() {
        return this.f56733a.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void flush() {
        this.f56733a.flush();
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void g() {
        this.f56733a.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void h(int i10) {
        this.f56733a.setVideoScalingMode(i10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public ByteBuffer i(int i10) {
        return this.f56733a.getInputBuffer(i10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void j(Surface surface) {
        this.f56733a.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void l(int i10, long j10) {
        this.f56733a.releaseOutputBuffer(i10, j10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public int m() {
        return this.f56733a.dequeueInputBuffer(0L);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public int n(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f56733a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void o(int i10, boolean z10) {
        this.f56733a.releaseOutputBuffer(i10, z10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public ByteBuffer p(int i10) {
        return this.f56733a.getOutputBuffer(i10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.h
    public void release() {
        n3.h hVar;
        n3.h hVar2;
        try {
            int i10 = P.f127888a;
            if (i10 >= 30 && i10 < 33) {
                this.f56733a.stop();
            }
            if (i10 >= 35 && (hVar2 = this.f56734b) != null) {
                hVar2.d(this.f56733a);
            }
            this.f56733a.release();
        } catch (Throwable th2) {
            if (P.f127888a >= 35 && (hVar = this.f56734b) != null) {
                hVar.d(this.f56733a);
            }
            this.f56733a.release();
            throw th2;
        }
    }

    public static /* synthetic */ void q(q qVar, h.d dVar, MediaCodec mediaCodec, long j10, long j11) {
        qVar.getClass();
        dVar.a(qVar, j10, j11);
    }
}
