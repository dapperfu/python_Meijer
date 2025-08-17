package com.bugsnag.android;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0080\b\u0018\u0000 $2\u00020\u0001:\u0001\u0010BG\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b$\u0010%J\u001d\u0010&\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b&\u0010\u001dJ#\u0010)\u001a\u00020\u001b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00170'2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\u001b2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0016\u00103\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00102R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b \u00104\u001a\u0004\b5\u00106R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u00104\u001a\u0004\b7\u00106R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b&\u00104\u001a\u0004\b8\u00106R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006¢\u0006\f\n\u0004\b)\u00104\u001a\u0004\b9\u00106¨\u0006:"}, d2 = {"Lcom/bugsnag/android/o;", "", "", "Lcom/bugsnag/android/F0;", "onErrorTasks", "Lcom/bugsnag/android/E0;", "onBreadcrumbTasks", "Lcom/bugsnag/android/H0;", "onSessionTasks", "Lcom/bugsnag/android/G0;", "onSendTasks", "<init>", "(Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;)V", "", "", "", "a", "()Ljava/util/Map;", "LQ6/h;", "metrics", "", "g", "(LQ6/h;)V", "Lcom/bugsnag/android/V;", "event", "Lcom/bugsnag/android/t0;", "logger", "", "c", "(Lcom/bugsnag/android/V;Lcom/bugsnag/android/t0;)Z", "Lcom/bugsnag/android/Breadcrumb;", "breadcrumb", "b", "(Lcom/bugsnag/android/Breadcrumb;Lcom/bugsnag/android/t0;)Z", "Lcom/bugsnag/android/K0;", "session", "f", "(Lcom/bugsnag/android/K0;Lcom/bugsnag/android/t0;)Z", "d", "Lkotlin/Function0;", "eventSource", "e", "(Lkotlin/jvm/functions/Function0;Lcom/bugsnag/android/t0;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LQ6/h;", "internalMetrics", "Ljava/util/Collection;", "getOnErrorTasks", "()Ljava/util/Collection;", "getOnBreadcrumbTasks", "getOnSessionTasks", "getOnSendTasks", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.bugsnag.android.o, reason: case insensitive filesystem and from toString */
/* loaded from: classes4.dex */
public final /* data */ class CallbackState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Q6.h internalMetrics;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Collection<F0> onErrorTasks;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Collection<E0> onBreadcrumbTasks;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Collection<H0> onSessionTasks;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Collection<G0> onSendTasks;

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
        Collection<F0> collection = this.onErrorTasks;
        int iHashCode = (collection != null ? collection.hashCode() : 0) * 31;
        Collection<E0> collection2 = this.onBreadcrumbTasks;
        int iHashCode2 = (iHashCode + (collection2 != null ? collection2.hashCode() : 0)) * 31;
        Collection<H0> collection3 = this.onSessionTasks;
        int iHashCode3 = (iHashCode2 + (collection3 != null ? collection3.hashCode() : 0)) * 31;
        Collection<G0> collection4 = this.onSendTasks;
        return iHashCode3 + (collection4 != null ? collection4.hashCode() : 0);
    }

    public String toString() {
        return "CallbackState(onErrorTasks=" + this.onErrorTasks + ", onBreadcrumbTasks=" + this.onBreadcrumbTasks + ", onSessionTasks=" + this.onSessionTasks + ", onSendTasks=" + this.onSendTasks + ")";
    }

    public CallbackState(Collection<F0> collection, Collection<E0> collection2, Collection<H0> collection3, Collection<G0> collection4) {
        this.onErrorTasks = collection;
        this.onBreadcrumbTasks = collection2;
        this.onSessionTasks = collection3;
        this.onSendTasks = collection4;
        this.internalMetrics = new Q6.j();
    }

    private final Map<String, Integer> a() {
        HashMap map = new HashMap();
        if (this.onBreadcrumbTasks.size() > 0) {
            map.put("onBreadcrumb", Integer.valueOf(this.onBreadcrumbTasks.size()));
        }
        if (this.onErrorTasks.size() > 0) {
            map.put("onError", Integer.valueOf(this.onErrorTasks.size()));
        }
        if (this.onSendTasks.size() > 0) {
            map.put("onSendError", Integer.valueOf(this.onSendTasks.size()));
        }
        if (this.onSessionTasks.size() > 0) {
            map.put("onSession", Integer.valueOf(this.onSessionTasks.size()));
        }
        return map;
    }

    public final boolean b(Breadcrumb breadcrumb, InterfaceC6495t0 logger) {
        if (this.onBreadcrumbTasks.isEmpty()) {
            return true;
        }
        Iterator<T> it = this.onBreadcrumbTasks.iterator();
        while (it.hasNext()) {
            try {
            } catch (Throwable th2) {
                logger.b("OnBreadcrumbCallback threw an Exception", th2);
            }
            if (!((E0) it.next()).a(breadcrumb)) {
                return false;
            }
        }
        return true;
    }

    public final boolean c(V event, InterfaceC6495t0 logger) {
        if (this.onErrorTasks.isEmpty()) {
            return true;
        }
        Iterator<T> it = this.onErrorTasks.iterator();
        while (it.hasNext()) {
            try {
            } catch (Throwable th2) {
                logger.b("OnBreadcrumbCallback threw an Exception", th2);
            }
            if (!((F0) it.next()).a(event)) {
                return false;
            }
        }
        return true;
    }

    public final boolean d(V event, InterfaceC6495t0 logger) {
        Iterator<T> it = this.onSendTasks.iterator();
        while (it.hasNext()) {
            try {
            } catch (Throwable th2) {
                logger.b("OnSendCallback threw an Exception", th2);
            }
            if (!((G0) it.next()).a(event)) {
                return false;
            }
        }
        return true;
    }

    public final boolean e(Function0<? extends V> eventSource, InterfaceC6495t0 logger) {
        if (this.onSendTasks.isEmpty()) {
            return true;
        }
        return d(eventSource.invoke(), logger);
    }

    public final boolean f(K0 session, InterfaceC6495t0 logger) {
        if (this.onSessionTasks.isEmpty()) {
            return true;
        }
        Iterator<T> it = this.onSessionTasks.iterator();
        while (it.hasNext()) {
            try {
            } catch (Throwable th2) {
                logger.b("OnSessionCallback threw an Exception", th2);
            }
            if (!((H0) it.next()).a(session)) {
                return false;
            }
        }
        return true;
    }

    public final void g(Q6.h metrics) {
        this.internalMetrics = metrics;
        metrics.a(a());
    }

    public /* synthetic */ CallbackState(Collection collection, Collection collection2, Collection collection3, Collection collection4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new CopyOnWriteArrayList() : collection, (i10 & 2) != 0 ? new CopyOnWriteArrayList() : collection2, (i10 & 4) != 0 ? new CopyOnWriteArrayList() : collection3, (i10 & 8) != 0 ? new CopyOnWriteArrayList() : collection4);
    }
}
