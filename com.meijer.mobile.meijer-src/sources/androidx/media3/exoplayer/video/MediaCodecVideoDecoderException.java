package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;

/* loaded from: classes.dex */
public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {

    /* renamed from: d, reason: collision with root package name */
    public final int f57218d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f57219e;

    public MediaCodecVideoDecoderException(Throwable th2, androidx.media3.exoplayer.mediacodec.j jVar, Surface surface) {
        boolean z10;
        super(th2, jVar);
        this.f57218d = System.identityHashCode(surface);
        if (surface != null && !surface.isValid()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f57219e = z10;
    }
}
