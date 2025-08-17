package androidx.media3.exoplayer.audio;

import a3.C5564d;
import a3.t;
import a3.z;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.audio.d;
import d3.C13466a;
import d3.P;

/* loaded from: classes.dex */
public final class i implements DefaultAudioSink.d {

    /* renamed from: a, reason: collision with root package name */
    private final Context f55966a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f55967b;

    private static final class a {
        public static d a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
            if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
                return d.f55906d;
            }
            return new d.b().e(true).g(z10).d();
        }
    }

    private static final class b {
        public static d a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
            boolean z11;
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return d.f55906d;
            }
            d.b bVar = new d.b();
            if (P.f127086a > 32 && playbackOffloadSupport == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            return bVar.e(true).f(z11).g(z10).d();
        }
    }

    private boolean b(Context context) {
        Boolean bool = this.f55967b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context != null) {
            String parameters = b3.m.c(context).getParameters("offloadVariableRateSupported");
            this.f55967b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
        } else {
            this.f55967b = Boolean.FALSE;
        }
        return this.f55967b.booleanValue();
    }

    public i(Context context) {
        this.f55966a = context;
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.d
    public d a(t tVar, C5564d c5564d) {
        C13466a.e(tVar);
        C13466a.e(c5564d);
        int i10 = P.f127086a;
        if (i10 >= 29 && tVar.f43925F != -1) {
            boolean zB = b(this.f55966a);
            int iF = z.f((String) C13466a.e(tVar.f43949o), tVar.f43945k);
            if (iF != 0 && i10 >= P.J(iF)) {
                int iL = P.L(tVar.f43924E);
                if (iL == 0) {
                    return d.f55906d;
                }
                try {
                    AudioFormat audioFormatK = P.K(tVar.f43925F, iL, iF);
                    if (i10 >= 31) {
                        return b.a(audioFormatK, c5564d.a().f43823a, zB);
                    }
                    return a.a(audioFormatK, c5564d.a().f43823a, zB);
                } catch (IllegalArgumentException unused) {
                    return d.f55906d;
                }
            }
            return d.f55906d;
        }
        return d.f55906d;
    }
}
