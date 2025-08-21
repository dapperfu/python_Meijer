package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.is, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8490is implements InterfaceC7194Pi {
    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) throws NumberFormatException {
        InterfaceC6932Hr interfaceC6932Hr = (InterfaceC6932Hr) obj;
        BinderC7239Qt binderC7239QtZzq = interfaceC6932Hr.zzq();
        if (binderC7239QtZzq == null) {
            try {
                BinderC7239Qt binderC7239Qt = new BinderC7239Qt(interfaceC6932Hr, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                interfaceC6932Hr.r(binderC7239Qt);
                binderC7239QtZzq = binderC7239Qt;
            } catch (NullPointerException e10) {
                e = e10;
                Throwable th2 = e;
                Sc.p.e("Unable to parse videoMeta message.", th2);
                Nc.v.s().x(th2, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e11) {
                e = e11;
                Throwable th22 = e;
                Sc.p.e("Unable to parse videoMeta message.", th22);
                Nc.v.s().x(th22, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float f10 = Float.parseFloat((String) map.get("duration"));
        boolean zEquals = "1".equals(map.get("muted"));
        float f11 = Float.parseFloat((String) map.get("currentTime"));
        int i10 = Integer.parseInt((String) map.get("playbackState"));
        int i11 = 0;
        if (i10 >= 0 && i10 <= 3) {
            i11 = i10;
        }
        String str = (String) map.get("aspectRatio");
        float f12 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (Sc.p.j(3)) {
            Sc.p.b("Video Meta GMSG: currentTime : " + f11 + " , duration : " + f10 + " , isMuted : " + zEquals + " , playbackState : " + i11 + " , aspectRatio : " + str);
        }
        binderC7239QtZzq.C9(f11, f10, i11, zEquals, f12);
    }
}
