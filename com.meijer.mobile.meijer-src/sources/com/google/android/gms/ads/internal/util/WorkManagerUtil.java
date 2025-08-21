package com.google.android.gms.ads.internal.util;

import O4.C4356d;
import O4.EnumC4374w;
import O4.O;
import O4.y;
import Pc.a;
import Rc.S;
import Sc.p;
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
    @Override // Rc.T
    public final boolean zzf(b bVar, String str, String str2) {
        return zzg(bVar, new a(str, str2, ""));
    }

    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
    }

    private static void B9(Context context) {
        try {
            O.j(context.getApplicationContext(), new a.C1169a().a());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // Rc.T
    public final void zze(b bVar) {
        Context context = (Context) d.c2(bVar);
        B9(context);
        try {
            O oH = O.h(context);
            oH.a("offline_ping_sender_work");
            oH.c(new y.a(OfflinePingSender.class).j(new C4356d.a().b(EnumC4374w.CONNECTED).a()).a("offline_ping_sender_work").b());
        } catch (IllegalStateException e10) {
            p.h("Failed to instantiate WorkManager.", e10);
        }
    }

    @Override // Rc.T
    public final boolean zzg(b bVar, Pc.a aVar) {
        Context context = (Context) d.c2(bVar);
        B9(context);
        C4356d c4356dA = new C4356d.a().b(EnumC4374w.CONNECTED).a();
        try {
            O.h(context).c(new y.a(OfflineNotificationPoster.class).j(c4356dA).m(new b.a().g("uri", aVar.f25758a).g("gws_query_id", aVar.f25759b).g("image_url", aVar.f25760c).a()).a("offline_notification_work").b());
            return true;
        } catch (IllegalStateException e10) {
            p.h("Failed to instantiate WorkManager.", e10);
            return false;
        }
    }
}
