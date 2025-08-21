package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.decoder.DecoderException;
import d3.P;

/* loaded from: classes.dex */
public class MediaCodecDecoderException extends DecoderException {

    /* renamed from: a, reason: collision with root package name */
    public final j f56572a;

    /* renamed from: b, reason: collision with root package name */
    public final String f56573b;

    /* renamed from: c, reason: collision with root package name */
    public final int f56574c;

    public MediaCodecDecoderException(Throwable th2, j jVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Decoder failed: ");
        sb2.append(jVar == null ? null : jVar.f56716a);
        super(sb2.toString(), th2);
        this.f56572a = jVar;
        String diagnosticInfo = th2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null;
        this.f56573b = diagnosticInfo;
        this.f56574c = P.f127888a >= 23 ? a(th2) : P.Y(diagnosticInfo);
    }

    private static int a(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getErrorCode();
        }
        return 0;
    }
}
