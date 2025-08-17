package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.is, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8365is implements InterfaceC7069Pi {
    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) throws NumberFormatException {
        InterfaceC6807Hr interfaceC6807Hr = (InterfaceC6807Hr) obj;
        BinderC7114Qt binderC7114QtZzq = interfaceC6807Hr.zzq();
        if (binderC7114QtZzq == null) {
            try {
                BinderC7114Qt binderC7114Qt = new BinderC7114Qt(interfaceC6807Hr, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                interfaceC6807Hr.r(binderC7114Qt);
                binderC7114QtZzq = binderC7114Qt;
            } catch (NullPointerException e10) {
                e = e10;
                Throwable th2 = e;
                Qc.p.e("Unable to parse videoMeta message.", th2);
                Lc.v.s().x(th2, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e11) {
                e = e11;
                Throwable th22 = e;
                Qc.p.e("Unable to parse videoMeta message.", th22);
                Lc.v.s().x(th22, "VideoMetaGmsgHandler.onGmsg");
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
        if (Qc.p.j(3)) {
            Qc.p.b("Video Meta GMSG: currentTime : " + f11 + " , duration : " + f10 + " , isMuted : " + zEquals + " , playbackState : " + i11 + " , aspectRatio : " + str);
        }
        binderC7114QtZzq.C9(f11, f10, i11, zEquals, f12);
    }
}
