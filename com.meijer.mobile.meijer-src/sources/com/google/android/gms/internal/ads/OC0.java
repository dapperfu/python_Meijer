package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;

/* loaded from: classes6.dex */
public final class OC0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f69867a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f69868b;

    public OC0(Context context) {
        this.f69867a = context;
    }

    public final C9280qC0 a(C c10, HR hr2) {
        boolean zBooleanValue;
        AudioManager audioManager;
        boolean z10;
        c10.getClass();
        hr2.getClass();
        int i10 = OV.f69931a;
        if (i10 >= 29 && c10.f66482E != -1) {
            Context context = this.f69867a;
            Boolean bool = this.f69868b;
            boolean z11 = false;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                if (context != null && (audioManager = (AudioManager) context.getSystemService("audio")) != null) {
                    String parameters = audioManager.getParameters("offloadVariableRateSupported");
                    if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f69868b = Boolean.valueOf(z10);
                } else {
                    this.f69868b = Boolean.FALSE;
                }
                zBooleanValue = this.f69868b.booleanValue();
            }
            String str = c10.f66504o;
            str.getClass();
            int iA = C7182Pc.a(str, c10.f66500k);
            if (iA != 0 && i10 >= OV.z(iA)) {
                int iA2 = OV.A(c10.f66481D);
                if (iA2 == 0) {
                    return C9280qC0.f78589d;
                }
                try {
                    AudioFormat audioFormatP = OV.P(c10.f66482E, iA2, iA);
                    if (i10 >= 31) {
                        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatP, hr2.a().f70026a);
                        if (playbackOffloadSupport == 0) {
                            return C9280qC0.f78589d;
                        }
                        C9066oC0 c9066oC0 = new C9066oC0();
                        if (i10 > 32 && playbackOffloadSupport == 2) {
                            z11 = true;
                        }
                        c9066oC0.a(true);
                        c9066oC0.b(z11);
                        c9066oC0.c(zBooleanValue);
                        return c9066oC0.d();
                    }
                    if (!AudioManager.isOffloadedPlaybackSupported(audioFormatP, hr2.a().f70026a)) {
                        return C9280qC0.f78589d;
                    }
                    C9066oC0 c9066oC02 = new C9066oC0();
                    c9066oC02.a(true);
                    c9066oC02.c(zBooleanValue);
                    return c9066oC02.d();
                } catch (IllegalArgumentException unused) {
                    return C9280qC0.f78589d;
                }
            }
            return C9280qC0.f78589d;
        }
        return C9280qC0.f78589d;
    }
}
