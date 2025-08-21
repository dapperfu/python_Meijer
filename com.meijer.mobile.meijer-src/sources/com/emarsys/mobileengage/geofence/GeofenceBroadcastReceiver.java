package com.emarsys.mobileengage.geofence;

import I9.o;
import K9.e;
import L9.k;
import Ld.C4018h;
import Ld.InterfaceC4014d;
import Z9.c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.emarsys.mobileengage.geofence.GeofenceBroadcastReceiver;
import fa.C13973b;
import ia.n;
import ja.TriggeringEmarsysGeofence;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import n9.b;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/emarsys/mobileengage/geofence/GeofenceBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "LLd/h;", "", "Lja/c;", "d", "(LLd/h;)Ljava/util/List;", "", "transition", "LZ9/c;", "e", "(I)LZ9/c;", "triggeringEmarsysGeofences", "", "g", "(Ljava/util/List;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Ln9/b;", "a", "Lkotlin/Lazy;", "f", "()Ln9/b;", "concurrentHandlerHolder", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class GeofenceBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy concurrentHandlerHolder = LazyKt.b(new Function0() { // from class: ia.k
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return GeofenceBroadcastReceiver.c();
        }
    });

    private final c e(int transition) {
        return transition != 1 ? transition != 2 ? transition != 4 ? c.f43655a : c.f43657c : c.f43656b : c.f43655a;
    }

    private final b f() {
        return (b) this.concurrentHandlerHolder.getValue();
    }

    private final void g(List<TriggeringEmarsysGeofence> triggeringEmarsysGeofences) {
        for (TriggeringEmarsysGeofence triggeringEmarsysGeofence : triggeringEmarsysGeofences) {
            Map mapO = MapsKt.o(TuplesKt.a("triggerType", triggeringEmarsysGeofence.getTriggerType()), TuplesKt.a("geofenceId", triggeringEmarsysGeofence.getGeofenceId()));
            e.Companion companion = e.INSTANCE;
            String strA = o.a();
            Intrinsics.i(strA, "getCallerMethodName(...)");
            e.Companion.b(companion, new k(GeofenceBroadcastReceiver.class, strA, MapsKt.k(), mapO), false, 2, null);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.j(context, "context");
        Intrinsics.j(intent, "intent");
        final C4018h c4018hA = C4018h.a(intent);
        if ((c4018hA != null ? c4018hA.c() : null) != null) {
            f().getCoreHandler().b(new Runnable() { // from class: ia.l
                @Override // java.lang.Runnable
                public final void run() {
                    GeofenceBroadcastReceiver.h(this.f137466a, c4018hA);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b c() {
        return C13973b.b().getConcurrentHandlerHolder();
    }

    private final List<TriggeringEmarsysGeofence> d(C4018h c4018h) {
        List<InterfaceC4014d> listC = c4018h.c();
        if (listC != null) {
            List<InterfaceC4014d> list = listC;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String strW = ((InterfaceC4014d) it.next()).w();
                Intrinsics.i(strW, "getRequestId(...)");
                arrayList.add(new TriggeringEmarsysGeofence(strW, e(c4018h.b())));
            }
            return arrayList;
        }
        return CollectionsKt.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(GeofenceBroadcastReceiver geofenceBroadcastReceiver, C4018h c4018h) {
        n nVarR = C13973b.b().R();
        List<TriggeringEmarsysGeofence> listD = geofenceBroadcastReceiver.d(c4018h);
        nVarR.b(listD);
        geofenceBroadcastReceiver.g(listD);
    }
}
