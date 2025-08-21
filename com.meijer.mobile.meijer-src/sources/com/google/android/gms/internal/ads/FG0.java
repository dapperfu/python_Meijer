package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class FG0 {

    /* renamed from: a, reason: collision with root package name */
    private final Spatializer f67618a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f67619b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f67620c;

    /* renamed from: d, reason: collision with root package name */
    private Spatializer$OnSpatializerStateChangedListener f67621d;

    public final boolean g() {
        return this.f67619b;
    }

    public static FG0 a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new FG0(audioManager.getSpatializer());
    }

    public final void b(NG0 ng0, Looper looper) {
        if (this.f67621d == null && this.f67620c == null) {
            this.f67621d = new EG0(this, ng0);
            final Handler handler = new Handler(looper);
            this.f67620c = handler;
            Spatializer spatializer = this.f67618a;
            Objects.requireNonNull(handler);
            spatializer.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.DG0
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.f67621d);
        }
    }

    public final void c() {
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.f67621d;
        if (spatializer$OnSpatializerStateChangedListener == null || this.f67620c == null) {
            return;
        }
        this.f67618a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
        Handler handler = this.f67620c;
        int i10 = OV.f69931a;
        handler.removeCallbacksAndMessages(null);
        this.f67620c = null;
        this.f67621d = null;
    }

    public final boolean d(HR hr2, C c10) throws IllegalArgumentException {
        int iA = OV.A((Objects.equals(c10.f66504o, "audio/eac3-joc") && c10.f66481D == 16) ? 12 : (Objects.equals(c10.f66504o, "audio/iamf") && c10.f66481D == -1) ? 6 : c10.f66481D);
        if (iA == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iA);
        int i10 = c10.f66482E;
        if (i10 != -1) {
            channelMask.setSampleRate(i10);
        }
        return this.f67618a.canBeSpatialized(hr2.a().f70026a, channelMask.build());
    }

    public final boolean e() {
        return this.f67618a.isAvailable();
    }

    public final boolean f() {
        return this.f67618a.isEnabled();
    }

    private FG0(Spatializer spatializer) {
        boolean z10;
        this.f67618a = spatializer;
        if (spatializer.getImmersiveAudioLevel() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f67619b = z10;
    }
}
