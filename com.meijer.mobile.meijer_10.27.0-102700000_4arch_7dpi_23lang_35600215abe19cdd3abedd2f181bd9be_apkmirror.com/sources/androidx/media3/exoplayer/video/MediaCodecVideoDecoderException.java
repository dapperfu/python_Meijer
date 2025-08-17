package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;

/* loaded from: classes.dex */
public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {

    /* renamed from: d, reason: collision with root package name */
    public final int f56994d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f56995e;

    public MediaCodecVideoDecoderException(Throwable th2, androidx.media3.exoplayer.mediacodec.j jVar, Surface surface) {
        boolean z10;
        super(th2, jVar);
        this.f56994d = System.identityHashCode(surface);
        if (surface != null && !surface.isValid()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f56995e = z10;
    }
}
