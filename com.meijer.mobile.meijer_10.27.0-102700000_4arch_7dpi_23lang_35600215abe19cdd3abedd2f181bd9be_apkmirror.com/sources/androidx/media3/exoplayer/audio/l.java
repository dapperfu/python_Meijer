package androidx.media3.exoplayer.audio;

import a3.C5564d;
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

    private AudioTrack b(AudioSink.a aVar, C5564d c5564d, int i10) {
        return new AudioTrack(e(c5564d, aVar.f55768d), P.K(aVar.f55766b, aVar.f55767c, aVar.f55765a), aVar.f55770f, 1, i10);
    }

    private AudioTrack c(AudioSink.a aVar, C5564d c5564d, int i10) throws IllegalArgumentException {
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(e(c5564d, aVar.f55768d)).setAudioFormat(P.K(aVar.f55766b, aVar.f55767c, aVar.f55765a)).setTransferMode(1).setBufferSizeInBytes(aVar.f55770f).setSessionId(i10);
        if (P.f127086a >= 29) {
            g(sessionId, aVar.f55769e);
        }
        return d(sessionId).build();
    }

    private AudioAttributes e(C5564d c5564d, boolean z10) {
        return z10 ? f() : c5564d.a().f43823a;
    }

    private AudioAttributes f() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.f
    public final AudioTrack a(AudioSink.a aVar, C5564d c5564d, int i10) {
        return P.f127086a >= 23 ? c(aVar, c5564d, i10) : b(aVar, c5564d, i10);
    }

    private void g(AudioTrack.Builder builder, boolean z10) {
        builder.setOffloadedPlayback(z10);
    }
}
