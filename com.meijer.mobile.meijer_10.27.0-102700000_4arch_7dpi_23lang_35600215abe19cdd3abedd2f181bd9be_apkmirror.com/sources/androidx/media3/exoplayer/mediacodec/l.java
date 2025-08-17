package androidx.media3.exoplayer.mediacodec;

import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.List;

/* loaded from: classes.dex */
public interface l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f56505a = new l() { // from class: n3.p
        @Override // androidx.media3.exoplayer.mediacodec.l
        public final List b(String str, boolean z10, boolean z11) {
            return MediaCodecUtil.k(str, z10, z11);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final l f56506b = new l() { // from class: n3.q
        @Override // androidx.media3.exoplayer.mediacodec.l
        public final List b(String str, boolean z10, boolean z11) {
            return MediaCodecUtil.o(androidx.media3.exoplayer.mediacodec.l.f56505a.b(str, z10, z11));
        }
    };

    List<j> b(String str, boolean z10, boolean z11) throws MediaCodecUtil.DecoderQueryException;
}
