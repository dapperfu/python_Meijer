package com.meijer.mobile.featurenavigation.content;

import Ck.b;
import android.content.Intent;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lk.PeriodicPollingStartEvent;
import yo.k;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0015¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0016\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u001a\u0004\b\n\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/featurenavigation/content/DailyAlarmService;", "Landroid/app/IntentService;", "<init>", "()V", "Landroid/content/Intent;", "intent", "", "onHandleIntent", "(Landroid/content/Intent;)V", "Lyo/k;", "d", "Lyo/k;", "e", "()Lyo/k;", "setUserManager", "(Lyo/k;)V", "userManager", "LCk/b;", "LCk/b;", "()LCk/b;", "setMeijerBus", "(LCk/b;)V", "meijerBus", "featurenavigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DailyAlarmService extends a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public k userManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public b meijerBus;

    public DailyAlarmService() {
        super("DailyAlarmService");
    }

    public final b d() {
        b bVar = this.meijerBus;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.y("meijerBus");
        return null;
    }

    public final k e() {
        k kVar = this.userManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.y("userManager");
        return null;
    }

    @Override // android.app.IntentService
    @Deprecated
    protected void onHandleIntent(Intent intent) {
        uw.a.INSTANCE.a("Received Intent for daily update service!!", new Object[0]);
        d().a(new PeriodicPollingStartEvent(e().e(), true));
    }
}
