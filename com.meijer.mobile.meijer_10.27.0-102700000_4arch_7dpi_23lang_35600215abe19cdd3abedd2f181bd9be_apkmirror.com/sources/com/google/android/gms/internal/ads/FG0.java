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
    private final Spatializer f66778a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f66779b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f66780c;

    /* renamed from: d, reason: collision with root package name */
    private Spatializer$OnSpatializerStateChangedListener f66781d;

    public final boolean g() {
        return this.f66779b;
    }

    public static FG0 a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new FG0(audioManager.getSpatializer());
    }

    public final void b(NG0 ng0, Looper looper) {
        if (this.f66781d == null && this.f66780c == null) {
            this.f66781d = new EG0(this, ng0);
            final Handler handler = new Handler(looper);
            this.f66780c = handler;
            Spatializer spatializer = this.f66778a;
            Objects.requireNonNull(handler);
            spatializer.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.DG0
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.f66781d);
        }
    }

    public final void c() {
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.f66781d;
        if (spatializer$OnSpatializerStateChangedListener == null || this.f66780c == null) {
            return;
        }
        this.f66778a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
        Handler handler = this.f66780c;
        int i10 = OV.f69091a;
        handler.removeCallbacksAndMessages(null);
        this.f66780c = null;
        this.f66781d = null;
    }

    public final boolean d(HR hr2, C c10) throws IllegalArgumentException {
        int iA = OV.A((Objects.equals(c10.f65664o, "audio/eac3-joc") && c10.f65641D == 16) ? 12 : (Objects.equals(c10.f65664o, "audio/iamf") && c10.f65641D == -1) ? 6 : c10.f65641D);
        if (iA == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iA);
        int i10 = c10.f65642E;
        if (i10 != -1) {
            channelMask.setSampleRate(i10);
        }
        return this.f66778a.canBeSpatialized(hr2.a().f69186a, channelMask.build());
    }

    public final boolean e() {
        return this.f66778a.isAvailable();
    }

    public final boolean f() {
        return this.f66778a.isEnabled();
    }

    private FG0(Spatializer spatializer) {
        boolean z10;
        this.f66778a = spatializer;
        if (spatializer.getImmersiveAudioLevel() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f66779b = z10;
    }
}
