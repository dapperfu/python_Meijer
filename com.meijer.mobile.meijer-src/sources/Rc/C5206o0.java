package Rc;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.C7134Nq;
import com.google.android.gms.internal.ads.C8466ig;

/* renamed from: Rc.o0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5206o0 {
    public static void a(Context context) {
        int i10 = Sc.m.f34511g;
        if (((Boolean) C8466ig.f75832a.e()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || Sc.m.l()) {
                    return;
                }
                com.google.common.util.concurrent.q qVarB = new C5182c0(context).b();
                Sc.p.f("Updating ad debug logging enablement.");
                C7134Nq.a(qVarB, "AdDebugLogUpdater.updateEnablement");
            } catch (Exception e10) {
                Sc.p.h("Fail to determine debug setting.", e10);
            }
        }
    }
}
