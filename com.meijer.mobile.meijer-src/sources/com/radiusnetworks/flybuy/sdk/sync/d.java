package com.radiusnetworks.flybuy.sdk.sync;

import O4.C4356d;
import O4.EnumC4360h;
import O4.EnumC4374w;
import O4.F;
import O4.O;
import android.content.Context;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f121030a;

    public d(Context context) {
        Intrinsics.j(context, "context");
        this.f121030a = context.getApplicationContext();
    }

    public final void a() {
        Context context = this.f121030a;
        if (context != null) {
            O.Companion companion = O.INSTANCE;
            if (companion.a(context).i("FLYBUY_CONFIG_SYNC_WORK").get().size() > 0) {
                return;
            }
            companion.a(context).e("FLYBUY_CONFIG_SYNC_WORK", EnumC4360h.CANCEL_AND_REENQUEUE, new F.a(SyncWorker.class, 3L, TimeUnit.HOURS, 300000L, TimeUnit.MILLISECONDS).l(RangesKt.u(RangesKt.x(0, 7200), Random.INSTANCE), TimeUnit.SECONDS).j(new C4356d.a().b(EnumC4374w.CONNECTED).a()).a("FLYBUY_CONFIG_SYNC_WORK").b());
        }
    }
}
