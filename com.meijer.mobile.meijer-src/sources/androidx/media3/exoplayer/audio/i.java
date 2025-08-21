package androidx.media3.exoplayer.audio;

import a3.C5647d;
import a3.t;
import a3.z;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.audio.d;
import d3.C13599a;
import d3.P;

/* loaded from: classes.dex */
public final class i implements DefaultAudioSink.d {

    /* renamed from: a, reason: collision with root package name */
    private final Context f56190a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f56191b;

    private static final class a {
        public static d a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
            if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
                return d.f56130d;
            }
            return new d.b().e(true).g(z10).d();
        }
    }

    private static final class b {
        public static d a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
            boolean z11;
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return d.f56130d;
            }
            d.b bVar = new d.b();
            if (P.f127888a > 32 && playbackOffloadSupport == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            return bVar.e(true).f(z11).g(z10).d();
        }
    }

    private boolean b(Context context) {
        Boolean bool = this.f56191b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context != null) {
            String parameters = b3.m.c(context).getParameters("offloadVariableRateSupported");
            this.f56191b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
        } else {
            this.f56191b = Boolean.FALSE;
        }
        return this.f56191b.booleanValue();
    }

    public i(Context context) {
        this.f56190a = context;
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.d
    public d a(t tVar, C5647d c5647d) {
        C13599a.e(tVar);
        C13599a.e(c5647d);
        int i10 = P.f127888a;
        if (i10 >= 29 && tVar.f44743F != -1) {
            boolean zB = b(this.f56190a);
            int iF = z.f((String) C13599a.e(tVar.f44767o), tVar.f44763k);
            if (iF != 0 && i10 >= P.J(iF)) {
                int iL = P.L(tVar.f44742E);
                if (iL == 0) {
                    return d.f56130d;
                }
                try {
                    AudioFormat audioFormatK = P.K(tVar.f44743F, iL, iF);
                    if (i10 >= 31) {
                        return b.a(audioFormatK, c5647d.a().f44641a, zB);
                    }
                    return a.a(audioFormatK, c5647d.a().f44641a, zB);
                } catch (IllegalArgumentException unused) {
                    return d.f56130d;
                }
            }
            return d.f56130d;
        }
        return d.f56130d;
    }
}
