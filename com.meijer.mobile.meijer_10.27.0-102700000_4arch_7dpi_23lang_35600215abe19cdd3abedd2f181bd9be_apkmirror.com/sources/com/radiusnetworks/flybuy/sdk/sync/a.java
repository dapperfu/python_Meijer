package com.radiusnetworks.flybuy.sdk.sync;

import N4.C4316d;
import N4.EnumC4320h;
import N4.EnumC4334w;
import N4.F;
import N4.O;
import android.content.Context;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f120078a;

    public a(Context context) {
        Intrinsics.j(context, "context");
        this.f120078a = context.getApplicationContext();
    }

    public final void a() {
        Context context = this.f120078a;
        if (context == null || O.h(context).i("FLYBUY_CONFIG_SYNC_WORK").get().size() > 0) {
            return;
        }
        O.h(context).e("FLYBUY_CONFIG_SYNC_WORK", EnumC4320h.CANCEL_AND_REENQUEUE, new F.a(SyncWorker.class, 3L, TimeUnit.HOURS, 300000L, TimeUnit.MILLISECONDS).l(RangesKt.u(RangesKt.x(0, 7200), Random.INSTANCE), TimeUnit.SECONDS).j(new C4316d.a().b(EnumC4334w.CONNECTED).a()).a("FLYBUY_CONFIG_SYNC_WORK").b());
    }
}
