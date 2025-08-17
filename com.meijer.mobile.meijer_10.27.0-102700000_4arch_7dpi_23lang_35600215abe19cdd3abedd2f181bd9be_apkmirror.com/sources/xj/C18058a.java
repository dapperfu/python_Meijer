package xj;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import gi.C14265e;
import gi.InterfaceC14261a;
import gi.InterfaceC14266f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import wj.C17827c;
import wj.C17828d;
import yj.C18216b;
import yj.InterfaceC18215a;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00132\b\b\u0001\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lxj/a;", "", "<init>", "()V", "Lgi/e;", "analyticsEventManager", "Lgi/a;", "b", "(Lgi/e;)Lgi/a;", "Lwj/c;", "analyticsService", "Lgi/f;", "a", "(Lwj/c;)Lgi/f;", "Lxj/i;", "g", "(Lxj/i;)Lgi/f;", "Landroid/content/Context;", "context", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "c", "(Landroid/content/Context;)Lcom/google/firebase/analytics/FirebaseAnalytics;", "firebaseAnalytics", "", "versionName", "Lwj/d;", "d", "(Lcom/google/firebase/analytics/FirebaseAnalytics;Ljava/lang/String;)Lwj/d;", "LRf/d;", "e", "()LRf/d;", "Lyj/b;", "firebasePerformanceManager", "Lyj/a;", "f", "(Lyj/b;)Lyj/a;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xj.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C18058a {

    /* renamed from: a, reason: collision with root package name */
    public static final C18058a f169691a = new C18058a();

    public final InterfaceC14266f a(C17827c analyticsService) {
        Intrinsics.j(analyticsService, "analyticsService");
        return analyticsService;
    }

    public final InterfaceC14261a b(C14265e analyticsEventManager) {
        Intrinsics.j(analyticsEventManager, "analyticsEventManager");
        return analyticsEventManager;
    }

    public final InterfaceC18215a f(C18216b firebasePerformanceManager) {
        Intrinsics.j(firebasePerformanceManager, "firebasePerformanceManager");
        return firebasePerformanceManager;
    }

    public final InterfaceC14266f g(i analyticsService) {
        Intrinsics.j(analyticsService, "analyticsService");
        return analyticsService;
    }

    @SuppressLint({"MissingPermission"})
    public final FirebaseAnalytics c(Context context) {
        Intrinsics.j(context, "context");
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
        Intrinsics.i(firebaseAnalytics, "getInstance(...)");
        return firebaseAnalytics;
    }

    public final C17828d d(FirebaseAnalytics firebaseAnalytics, String versionName) {
        Intrinsics.j(firebaseAnalytics, "firebaseAnalytics");
        Intrinsics.j(versionName, "versionName");
        return new C17828d(firebaseAnalytics, versionName);
    }

    public final Rf.d e() {
        return Rf.g.a(com.google.firebase.c.f88628a);
    }

    private C18058a() {
    }
}
