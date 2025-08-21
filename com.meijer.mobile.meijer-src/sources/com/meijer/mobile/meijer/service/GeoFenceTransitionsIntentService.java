package com.meijer.mobile.meijer.service;

import Ld.C4018h;
import android.content.Intent;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import xm.C18197h;
import yo.k;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\u0003J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0015¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0019\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\r\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/meijer/service/GeoFenceTransitionsIntentService;", "Landroid/app/IntentService;", "<init>", "()V", "", "f", "g", "onDestroy", "Landroid/content/Intent;", "intent", "onHandleIntent", "(Landroid/content/Intent;)V", "Lyo/k;", "d", "Lyo/k;", "e", "()Lyo/k;", "setUserManager", "(Lyo/k;)V", "userManager", "Lxm/h;", "Lxm/h;", "()Lxm/h;", "setNotificationManager", "(Lxm/h;)V", "notificationManager", "LJu/a;", "LJu/a;", "disposables", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GeoFenceTransitionsIntentService extends a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public k userManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public C18197h notificationManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    public GeoFenceTransitionsIntentService() {
        super("GeoFenceTransitionsIntentService");
        this.disposables = new Ju.a();
    }

    private final void f() {
        this.disposables.b(d().t());
    }

    public final C18197h d() {
        C18197h c18197h = this.notificationManager;
        if (c18197h != null) {
            return c18197h;
        }
        Intrinsics.x("notificationManager");
        return null;
    }

    public final k e() {
        k kVar = this.userManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.x("userManager");
        return null;
    }

    @Override // android.app.IntentService
    @Deprecated
    protected void onHandleIntent(Intent intent) {
        C4018h c4018hA;
        if (intent == null || (c4018hA = C4018h.a(intent)) == null) {
            return;
        }
        if (c4018hA.d()) {
            qw.a.INSTANCE.d("Received error from geofence transition intent", new Object[0]);
            return;
        }
        int iB = c4018hA.b();
        if (iB != 1) {
            if (iB != 2) {
                qw.a.INSTANCE.a("Received a GeoFence event GEOFENCE_TRANSITION_DWELL, ignoring", new Object[0]);
                return;
            } else {
                g();
                return;
            }
        }
        if (e().G() && e().b()) {
            f();
        }
    }

    private final void g() {
        d().k();
    }

    @Override // android.app.IntentService, android.app.Service
    @Deprecated
    public void onDestroy() {
        super.onDestroy();
        this.disposables.d();
    }
}
