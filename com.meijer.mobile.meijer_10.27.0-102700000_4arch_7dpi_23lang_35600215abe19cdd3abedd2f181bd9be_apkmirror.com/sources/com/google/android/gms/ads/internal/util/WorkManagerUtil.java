package com.google.android.gms.ads.internal.util;

import N4.C4316d;
import N4.EnumC4334w;
import N4.O;
import N4.y;
import Nc.a;
import Pc.S;
import Qc.p;
import android.content.Context;
import androidx.work.a;
import androidx.work.b;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.d;

/* loaded from: classes4.dex */
public class WorkManagerUtil extends S {
    @Override // Pc.T
    public final boolean zzf(b bVar, String str, String str2) {
        return zzg(bVar, new a(str, str2, ""));
    }

    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
    }

    private static void B9(Context context) {
        try {
            O.j(context.getApplicationContext(), new a.C1159a().a());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // Pc.T
    public final void zze(b bVar) {
        Context context = (Context) d.b2(bVar);
        B9(context);
        try {
            O oH = O.h(context);
            oH.a("offline_ping_sender_work");
            oH.c(new y.a(OfflinePingSender.class).j(new C4316d.a().b(EnumC4334w.CONNECTED).a()).a("offline_ping_sender_work").b());
        } catch (IllegalStateException e10) {
            p.h("Failed to instantiate WorkManager.", e10);
        }
    }

    @Override // Pc.T
    public final boolean zzg(b bVar, Nc.a aVar) {
        Context context = (Context) d.b2(bVar);
        B9(context);
        C4316d c4316dA = new C4316d.a().b(EnumC4334w.CONNECTED).a();
        try {
            O.h(context).c(new y.a(OfflineNotificationPoster.class).j(c4316dA).m(new b.a().g("uri", aVar.f21523a).g("gws_query_id", aVar.f21524b).g("image_url", aVar.f21525c).a()).a("offline_notification_work").b());
            return true;
        } catch (IllegalStateException e10) {
            p.h("Failed to instantiate WorkManager.", e10);
            return false;
        }
    }
}
