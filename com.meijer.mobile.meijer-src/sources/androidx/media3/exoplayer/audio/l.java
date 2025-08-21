package androidx.media3.exoplayer.audio;

import a3.C5647d;
import android.media.AudioAttributes;
import android.media.AudioTrack;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import d3.P;

/* loaded from: classes.dex */
public class l implements DefaultAudioSink.f {
    protected AudioTrack.Builder d(AudioTrack.Builder builder) {
        return builder;
    }

    private AudioTrack b(AudioSink.a aVar, C5647d c5647d, int i10) {
        return new AudioTrack(e(c5647d, aVar.f55992d), P.K(aVar.f55990b, aVar.f55991c, aVar.f55989a), aVar.f55994f, 1, i10);
    }

    private AudioTrack c(AudioSink.a aVar, C5647d c5647d, int i10) throws IllegalArgumentException {
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(e(c5647d, aVar.f55992d)).setAudioFormat(P.K(aVar.f55990b, aVar.f55991c, aVar.f55989a)).setTransferMode(1).setBufferSizeInBytes(aVar.f55994f).setSessionId(i10);
        if (P.f127888a >= 29) {
            g(sessionId, aVar.f55993e);
        }
        return d(sessionId).build();
    }

    private AudioAttributes e(C5647d c5647d, boolean z10) {
        return z10 ? f() : c5647d.a().f44641a;
    }

    private AudioAttributes f() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.f
    public final AudioTrack a(AudioSink.a aVar, C5647d c5647d, int i10) {
        return P.f127888a >= 23 ? c(aVar, c5647d, i10) : b(aVar, c5647d, i10);
    }

    private void g(AudioTrack.Builder builder, boolean z10) {
        builder.setOffloadedPlayback(z10);
    }
}
