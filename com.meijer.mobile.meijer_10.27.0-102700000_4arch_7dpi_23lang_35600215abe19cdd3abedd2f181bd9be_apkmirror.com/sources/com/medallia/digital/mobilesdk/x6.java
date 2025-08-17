package com.medallia.digital.mobilesdk;

import com.medallia.mobile.sdk.internal.eventbus.Event;
import com.medallia.mobile.sdk.internal.eventbus.EventBus;
import com.medallia.mobile.sdk.internal.eventbus.Subscriber;
import com.medallia.mobile.sdk.internal.eventbus.Subscription;
import com.medallia.mobile.sdk.internal.eventbus.events.DFSubmitFeedback;
import com.medallia.mobile.sdk.internal.eventbus.events.DXAEvent;
import com.medallia.mobile.sdk.internal.eventbus.events.DXALeadIdUpdated;
import com.medallia.mobile.sdk.internal.eventbus.events.DXASessionIdUpdated;
import com.medallia.mobile.sdk.internal.eventbus.events.MXOEvent;
import com.medallia.mobile.sdk.internal.eventbus.events.MXOTidUpdated;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class x6 {

    /* renamed from: a, reason: collision with root package name */
    public static final x6 f93500a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f93501b = "com.medallia.mobile.sdk.internal.eventbus.EventBus";

    /* renamed from: c, reason: collision with root package name */
    private static boolean f93502c;

    /* renamed from: d, reason: collision with root package name */
    private static Boolean f93503d;

    /* renamed from: e, reason: collision with root package name */
    private static Object f93504e;

    /* renamed from: f, reason: collision with root package name */
    private static final ConcurrentHashMap<String, DXAEvent<?>> f93505f;

    /* renamed from: g, reason: collision with root package name */
    private static final ConcurrentHashMap<String, MXOEvent<?>> f93506g;

    /* renamed from: h, reason: collision with root package name */
    private static final Set<Integer> f93507h;

    @SourceDebugExtension
    public static final class a implements Subscriber {
        a() {
        }

        public void onEvent(Event<?> event) {
            StringBuilder sb2;
            String payload;
            Intrinsics.j(event, "event");
            if (x6.f93507h.contains(Integer.valueOf(event.getId()))) {
                sb2 = new StringBuilder();
                sb2.append("DF BridgeService: Event ");
                sb2.append(event.getId());
                sb2.append(" was already processed with payload ");
                sb2.append(event.getPayload());
            } else {
                if (event instanceof DXAEvent) {
                    ConcurrentHashMap concurrentHashMap = x6.f93505f;
                    String name = event.getClass().getName();
                    Intrinsics.i(name, "getName(...)");
                    concurrentHashMap.put(name, event);
                    x6.f93507h.add(Integer.valueOf(event.getId()));
                    DXAEvent dXAEvent = (DXAEvent) event;
                    if (dXAEvent instanceof DXALeadIdUpdated) {
                        sb2 = new StringBuilder();
                        sb2.append("DF BridgeService: Receiving DXA LeadId ");
                        payload = ((DXALeadIdUpdated) event).getPayload();
                    } else {
                        if (!(dXAEvent instanceof DXASessionIdUpdated)) {
                            return;
                        }
                        sb2 = new StringBuilder();
                        sb2.append("DF BridgeService: Receiving DXA SessionId ");
                        payload = ((DXASessionIdUpdated) event).getPayload();
                    }
                } else {
                    if (!(event instanceof MXOEvent)) {
                        return;
                    }
                    ConcurrentHashMap concurrentHashMap2 = x6.f93506g;
                    String name2 = event.getClass().getName();
                    Intrinsics.i(name2, "getName(...)");
                    concurrentHashMap2.put(name2, event);
                    x6.f93507h.add(Integer.valueOf(event.getId()));
                    if (!(((MXOEvent) event) instanceof MXOTidUpdated)) {
                        return;
                    }
                    sb2 = new StringBuilder();
                    sb2.append("DF BridgeService: Receiving MXO TID: ");
                    payload = ((MXOTidUpdated) event).getPayload();
                }
                sb2.append(payload);
            }
            a4.e(sb2.toString());
        }

        public void onSubscribe(List<? extends Event<?>> queue, List<? extends Event<?>> stack) {
            Intrinsics.j(queue, "queue");
            Intrinsics.j(stack, "stack");
            a4.e("DF BridgeService: onSubscribe. stack " + stack + ", queue " + queue);
            Iterator<T> it = queue.iterator();
            while (it.hasNext()) {
                onEvent((Event) it.next());
            }
            Iterator it2 = CollectionsKt.S0(stack).iterator();
            while (it2.hasNext()) {
                onEvent((Event) it2.next());
            }
        }
    }

    static {
        x6 x6Var = new x6();
        f93500a = x6Var;
        f93505f = new ConcurrentHashMap<>();
        f93506g = new ConcurrentHashMap<>();
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        Intrinsics.i(keySetViewNewKeySet, "newKeySet(...)");
        f93507h = keySetViewNewKeySet;
        f93502c = x6Var.g();
    }

    private x6() {
    }

    private final /* synthetic */ <T> T a(Function0<? extends T> function0) {
        if (f93502c && Intrinsics.e(f93503d, Boolean.TRUE)) {
            return function0.invoke();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DF BridgeService: Bridge dependency is ");
        sb2.append(f93502c ? "included" : "not included");
        sb2.append(". Bridge functionality is ");
        sb2.append(Intrinsics.e(f93503d, Boolean.TRUE) ? "enabled" : "disabled");
        String string = sb2.toString();
        Intrinsics.i(string, "StringBuilder().apply(builderAction).toString()");
        a4.f(string);
        return null;
    }

    private final boolean g() throws ClassNotFoundException {
        try {
            Class.forName(f93501b);
            return true;
        } catch (ClassNotFoundException unused) {
            a4.f("DF BridgeService: Bridge dependency is not included");
            return false;
        }
    }

    public final String d() {
        if (f93502c && Intrinsics.e(f93503d, Boolean.TRUE)) {
            DXALeadIdUpdated dXALeadIdUpdated = (DXAEvent) f93505f.get(DXALeadIdUpdated.class.getName());
            if (dXALeadIdUpdated == null) {
                return null;
            }
            Intrinsics.h(dXALeadIdUpdated, "null cannot be cast to non-null type com.medallia.mobile.sdk.internal.eventbus.events.DXALeadIdUpdated");
            return dXALeadIdUpdated.getPayload();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DF BridgeService: Bridge dependency is ");
        sb2.append(f93502c ? "included" : "not included");
        sb2.append(". Bridge functionality is ");
        sb2.append(Intrinsics.e(f93503d, Boolean.TRUE) ? "enabled" : "disabled");
        String string = sb2.toString();
        Intrinsics.i(string, "StringBuilder().apply(builderAction).toString()");
        a4.f(string);
        return null;
    }

    public final String e() {
        if (f93502c && Intrinsics.e(f93503d, Boolean.TRUE)) {
            DXASessionIdUpdated dXASessionIdUpdated = (DXAEvent) f93505f.get(DXASessionIdUpdated.class.getName());
            if (dXASessionIdUpdated == null) {
                return null;
            }
            Intrinsics.h(dXASessionIdUpdated, "null cannot be cast to non-null type com.medallia.mobile.sdk.internal.eventbus.events.DXASessionIdUpdated");
            return dXASessionIdUpdated.getPayload();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DF BridgeService: Bridge dependency is ");
        sb2.append(f93502c ? "included" : "not included");
        sb2.append(". Bridge functionality is ");
        sb2.append(Intrinsics.e(f93503d, Boolean.TRUE) ? "enabled" : "disabled");
        String string = sb2.toString();
        Intrinsics.i(string, "StringBuilder().apply(builderAction).toString()");
        a4.f(string);
        return null;
    }

    public final String f() {
        if (f93502c && Intrinsics.e(f93503d, Boolean.TRUE)) {
            MXOTidUpdated mXOTidUpdated = (MXOEvent) f93506g.get(MXOTidUpdated.class.getName());
            if (mXOTidUpdated == null) {
                return null;
            }
            Intrinsics.h(mXOTidUpdated, "null cannot be cast to non-null type com.medallia.mobile.sdk.internal.eventbus.events.MXOTidUpdated");
            return mXOTidUpdated.getPayload();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DF BridgeService: Bridge dependency is ");
        sb2.append(f93502c ? "included" : "not included");
        sb2.append(". Bridge functionality is ");
        sb2.append(Intrinsics.e(f93503d, Boolean.TRUE) ? "enabled" : "disabled");
        String string = sb2.toString();
        Intrinsics.i(string, "StringBuilder().apply(builderAction).toString()");
        a4.f(string);
        return null;
    }

    public final boolean h() {
        return f93502c;
    }

    public final boolean i() {
        Boolean bool = f93503d;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final synchronized void j() {
        if (f93504e != null) {
            a4.c("DF BridgeService: Is already subscribed");
            return;
        }
        if (f93502c && Intrinsics.e(f93503d, Boolean.TRUE)) {
            f93504e = EventBus.INSTANCE.subscribe(new a());
            a4.e("DF BridgeService: Subscribed successfully");
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("DF BridgeService: Bridge dependency is ");
            sb2.append(f93502c ? "included" : "not included");
            sb2.append(". Bridge functionality is ");
            sb2.append(Intrinsics.e(f93503d, Boolean.TRUE) ? "enabled" : "disabled");
            String string = sb2.toString();
            Intrinsics.i(string, "StringBuilder().apply(builderAction).toString()");
            a4.f(string);
        }
    }

    public final synchronized void k() {
        if (f93504e == null) {
            a4.c("DF BridgeService: Is already unsubscribed");
            return;
        }
        if (f93502c && Intrinsics.e(f93503d, Boolean.TRUE)) {
            Object obj = f93504e;
            Intrinsics.h(obj, "null cannot be cast to non-null type com.medallia.mobile.sdk.internal.eventbus.Subscription");
            ((Subscription) obj).unsubscribe();
            Unit unit = Unit.f142422a;
            f93504e = null;
            a4.e("DF BridgeService: Unsubscribed successfully");
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("DF BridgeService: Bridge dependency is ");
            sb2.append(f93502c ? "included" : "not included");
            sb2.append(". Bridge functionality is ");
            sb2.append(Intrinsics.e(f93503d, Boolean.TRUE) ? "enabled" : "disabled");
            String string = sb2.toString();
            Intrinsics.i(string, "StringBuilder().apply(builderAction).toString()");
            a4.f(string);
        }
    }

    public final Unit a(String ccid) {
        Intrinsics.j(ccid, "ccid");
        if (f93502c && Intrinsics.e(f93503d, Boolean.TRUE)) {
            EventBus.INSTANCE.emit(new DFSubmitFeedback(ccid));
            a4.e("DF BridgeService: Emitting CCID: " + ccid);
            return Unit.f142422a;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DF BridgeService: Bridge dependency is ");
        sb2.append(f93502c ? "included" : "not included");
        sb2.append(". Bridge functionality is ");
        sb2.append(Intrinsics.e(f93503d, Boolean.TRUE) ? "enabled" : "disabled");
        String string = sb2.toString();
        Intrinsics.i(string, "StringBuilder().apply(builderAction).toString()");
        a4.f(string);
        return null;
    }

    public final void a(boolean z10) {
        Boolean bool = f93503d;
        if (bool != null && Intrinsics.e(bool, Boolean.valueOf(z10))) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("DF BridgeService: Communication is already ");
            sb2.append(z10 ? "enabled" : "disabled");
            a4.c(sb2.toString());
            return;
        }
        f93503d = Boolean.valueOf(z10);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("DF BridgeService: Communication ");
        sb3.append(z10 ? "enabled" : "disabled");
        sb3.append(" (by the feature flag)");
        a4.e(sb3.toString());
    }
}
