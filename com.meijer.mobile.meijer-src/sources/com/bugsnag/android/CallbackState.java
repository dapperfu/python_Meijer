package com.bugsnag.android;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0080\b\u0018\u0000 !2\u00020\u0001:\u0001\u0011BG\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b'\u0010\u001eJ#\u0010*\u001a\u00020\u001c2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180(2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020\u001c2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b4\u00105R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b6\u00105R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b4\u00103\u001a\u0004\b7\u00105R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b8\u0010:R\u0016\u0010<\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010;¨\u0006="}, d2 = {"Lcom/bugsnag/android/r;", "", "", "Lcom/bugsnag/android/Q0;", "onErrorTasks", "Lcom/bugsnag/android/P0;", "onBreadcrumbTasks", "Lcom/bugsnag/android/S0;", "onSessionTasks", "", "Lcom/bugsnag/android/R0;", "onSendTasks", "<init>", "(Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/List;)V", "", "", "", "a", "()Ljava/util/Map;", "LR6/m;", "metrics", "", "k", "(LR6/m;)V", "Lcom/bugsnag/android/b0;", "event", "Lcom/bugsnag/android/D0;", "logger", "", "g", "(Lcom/bugsnag/android/b0;Lcom/bugsnag/android/D0;)Z", "Lcom/bugsnag/android/Breadcrumb;", "breadcrumb", "f", "(Lcom/bugsnag/android/Breadcrumb;Lcom/bugsnag/android/D0;)Z", "Lcom/bugsnag/android/V0;", "session", "j", "(Lcom/bugsnag/android/V0;Lcom/bugsnag/android/D0;)Z", "h", "Lkotlin/Function0;", "eventSource", "i", "(Lkotlin/jvm/functions/Function0;Lcom/bugsnag/android/D0;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Collection;", "c", "()Ljava/util/Collection;", "b", "e", "d", "Ljava/util/List;", "()Ljava/util/List;", "LR6/m;", "internalMetrics", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.bugsnag.android.r, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class CallbackState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Collection<Q0> onErrorTasks;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Collection<P0> onBreadcrumbTasks;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Collection<S0> onSessionTasks;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<R0> onSendTasks;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private R6.m internalMetrics;

    public CallbackState() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallbackState)) {
            return false;
        }
        CallbackState callbackState = (CallbackState) other;
        return Intrinsics.e(this.onErrorTasks, callbackState.onErrorTasks) && Intrinsics.e(this.onBreadcrumbTasks, callbackState.onBreadcrumbTasks) && Intrinsics.e(this.onSessionTasks, callbackState.onSessionTasks) && Intrinsics.e(this.onSendTasks, callbackState.onSendTasks);
    }

    public int hashCode() {
        return (((((this.onErrorTasks.hashCode() * 31) + this.onBreadcrumbTasks.hashCode()) * 31) + this.onSessionTasks.hashCode()) * 31) + this.onSendTasks.hashCode();
    }

    public String toString() {
        return "CallbackState(onErrorTasks=" + this.onErrorTasks + ", onBreadcrumbTasks=" + this.onBreadcrumbTasks + ", onSessionTasks=" + this.onSessionTasks + ", onSendTasks=" + this.onSendTasks + ')';
    }

    public CallbackState(Collection<Q0> collection, Collection<P0> collection2, Collection<S0> collection3, List<R0> list) {
        this.onErrorTasks = collection;
        this.onBreadcrumbTasks = collection2;
        this.onSessionTasks = collection3;
        this.onSendTasks = list;
        this.internalMetrics = new R6.o();
    }

    private final Map<String, Integer> a() {
        HashMap map = new HashMap();
        if (b().size() > 0) {
            map.put("onBreadcrumb", Integer.valueOf(b().size()));
        }
        if (c().size() > 0) {
            map.put("onError", Integer.valueOf(c().size()));
        }
        if (d().size() > 0) {
            map.put("onSendError", Integer.valueOf(d().size()));
        }
        if (e().size() > 0) {
            map.put("onSession", Integer.valueOf(e().size()));
        }
        return map;
    }

    public final Collection<P0> b() {
        return this.onBreadcrumbTasks;
    }

    public final Collection<Q0> c() {
        return this.onErrorTasks;
    }

    public final List<R0> d() {
        return this.onSendTasks;
    }

    public final Collection<S0> e() {
        return this.onSessionTasks;
    }

    public final boolean f(Breadcrumb breadcrumb, D0 logger) {
        if (this.onBreadcrumbTasks.isEmpty()) {
            return true;
        }
        Iterator<T> it = this.onBreadcrumbTasks.iterator();
        while (it.hasNext()) {
            try {
            } catch (Throwable th2) {
                logger.b("OnBreadcrumbCallback threw an Exception", th2);
            }
            if (!((P0) it.next()).a(breadcrumb)) {
                return false;
            }
        }
        return true;
    }

    public final boolean g(C6585b0 event, D0 logger) {
        if (this.onErrorTasks.isEmpty()) {
            return true;
        }
        Iterator<T> it = this.onErrorTasks.iterator();
        while (it.hasNext()) {
            try {
            } catch (Throwable th2) {
                logger.b("OnBreadcrumbCallback threw an Exception", th2);
            }
            if (!((Q0) it.next()).a(event)) {
                return false;
            }
        }
        return true;
    }

    public final boolean h(C6585b0 event, D0 logger) {
        Iterator<T> it = this.onSendTasks.iterator();
        while (it.hasNext()) {
            try {
            } catch (Throwable th2) {
                logger.b("OnSendCallback threw an Exception", th2);
            }
            if (!((R0) it.next()).a(event)) {
                return false;
            }
        }
        return true;
    }

    public final boolean i(Function0<? extends C6585b0> eventSource, D0 logger) {
        if (this.onSendTasks.isEmpty()) {
            return true;
        }
        return h(eventSource.invoke(), logger);
    }

    public final boolean j(V0 session, D0 logger) {
        if (this.onSessionTasks.isEmpty()) {
            return true;
        }
        Iterator<T> it = this.onSessionTasks.iterator();
        while (it.hasNext()) {
            try {
            } catch (Throwable th2) {
                logger.b("OnSessionCallback threw an Exception", th2);
            }
            if (!((S0) it.next()).a(session)) {
                return false;
            }
        }
        return true;
    }

    public final void k(R6.m metrics) {
        this.internalMetrics = metrics;
        metrics.a(a());
    }

    public /* synthetic */ CallbackState(Collection collection, Collection collection2, Collection collection3, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new CopyOnWriteArrayList() : collection, (i10 & 2) != 0 ? new CopyOnWriteArrayList() : collection2, (i10 & 4) != 0 ? new CopyOnWriteArrayList() : collection3, (i10 & 8) != 0 ? new CopyOnWriteArrayList() : list);
    }
}
