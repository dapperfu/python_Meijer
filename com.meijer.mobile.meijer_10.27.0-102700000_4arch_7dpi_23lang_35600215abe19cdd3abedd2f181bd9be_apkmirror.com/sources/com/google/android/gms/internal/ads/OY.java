package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class OY implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f69106a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f69107b;

    public OY(Xj0 xj0, Context context) {
        this.f69106a = xj0;
        this.f69107b = context;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 13;
    }

    final /* synthetic */ PY a() throws Exception {
        int i10;
        int streamMaxVolume;
        AudioManager audioManager = (AudioManager) this.f69107b.getSystemService("audio");
        float fA = Lc.v.v().a();
        boolean zE = Lc.v.v().e();
        if (audioManager == null) {
            return new PY(-1, false, false, -1, -1, -1, -1, -1, fA, zE, true);
        }
        int mode = audioManager.getMode();
        boolean zIsMusicActive = audioManager.isMusicActive();
        boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) Mc.A.c().a(C8659lf.f76135Ra)).booleanValue()) {
            int i11 = Lc.v.u().i(audioManager);
            streamMaxVolume = audioManager.getStreamMaxVolume(3);
            i10 = i11;
        } else {
            i10 = -1;
            streamMaxVolume = -1;
        }
        return new PY(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, i10, streamMaxVolume, audioManager.getRingerMode(), audioManager.getStreamVolume(2), fA, zE, false);
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f69106a.i0(new Callable() { // from class: com.google.android.gms.internal.ads.NY
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f68900a.a();
            }
        });
    }
}
