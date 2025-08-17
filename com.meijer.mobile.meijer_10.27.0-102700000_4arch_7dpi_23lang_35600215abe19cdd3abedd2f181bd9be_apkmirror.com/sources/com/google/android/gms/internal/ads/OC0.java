package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;

/* loaded from: classes6.dex */
public final class OC0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f69027a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f69028b;

    public OC0(Context context) {
        this.f69027a = context;
    }

    public final C9155qC0 a(C c10, HR hr2) {
        boolean zBooleanValue;
        AudioManager audioManager;
        boolean z10;
        c10.getClass();
        hr2.getClass();
        int i10 = OV.f69091a;
        if (i10 >= 29 && c10.f65642E != -1) {
            Context context = this.f69027a;
            Boolean bool = this.f69028b;
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
                    this.f69028b = Boolean.valueOf(z10);
                } else {
                    this.f69028b = Boolean.FALSE;
                }
                zBooleanValue = this.f69028b.booleanValue();
            }
            String str = c10.f65664o;
            str.getClass();
            int iA = C7057Pc.a(str, c10.f65660k);
            if (iA != 0 && i10 >= OV.z(iA)) {
                int iA2 = OV.A(c10.f65641D);
                if (iA2 == 0) {
                    return C9155qC0.f77749d;
                }
                try {
                    AudioFormat audioFormatP = OV.P(c10.f65642E, iA2, iA);
                    if (i10 >= 31) {
                        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatP, hr2.a().f69186a);
                        if (playbackOffloadSupport == 0) {
                            return C9155qC0.f77749d;
                        }
                        C8941oC0 c8941oC0 = new C8941oC0();
                        if (i10 > 32 && playbackOffloadSupport == 2) {
                            z11 = true;
                        }
                        c8941oC0.a(true);
                        c8941oC0.b(z11);
                        c8941oC0.c(zBooleanValue);
                        return c8941oC0.d();
                    }
                    if (!AudioManager.isOffloadedPlaybackSupported(audioFormatP, hr2.a().f69186a)) {
                        return C9155qC0.f77749d;
                    }
                    C8941oC0 c8941oC02 = new C8941oC0();
                    c8941oC02.a(true);
                    c8941oC02.c(zBooleanValue);
                    return c8941oC02.d();
                } catch (IllegalArgumentException unused) {
                    return C9155qC0.f77749d;
                }
            }
            return C9155qC0.f77749d;
        }
        return C9155qC0.f77749d;
    }
}
