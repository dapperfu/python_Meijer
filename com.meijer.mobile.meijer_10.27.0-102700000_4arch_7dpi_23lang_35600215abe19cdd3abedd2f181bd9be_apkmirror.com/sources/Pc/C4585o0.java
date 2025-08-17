package Pc;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.C7009Nq;
import com.google.android.gms.internal.ads.C8341ig;

/* renamed from: Pc.o0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4585o0 {
    public static void a(Context context) {
        int i10 = Qc.m.f29961g;
        if (((Boolean) C8341ig.f74992a.e()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || Qc.m.l()) {
                    return;
                }
                com.google.common.util.concurrent.q qVarB = new C4561c0(context).b();
                Qc.p.f("Updating ad debug logging enablement.");
                C7009Nq.a(qVarB, "AdDebugLogUpdater.updateEnablement");
            } catch (Exception e10) {
                Qc.p.h("Fail to determine debug setting.", e10);
            }
        }
    }
}
