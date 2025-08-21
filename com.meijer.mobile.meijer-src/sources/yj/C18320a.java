package yj;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import hi.C14527e;
import hi.InterfaceC14523a;
import hi.InterfaceC14528f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import xj.C18186c;
import xj.C18187d;
import zj.C18492b;
import zj.InterfaceC18491a;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00132\b\b\u0001\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lyj/a;", "", "<init>", "()V", "Lhi/e;", "analyticsEventManager", "Lhi/a;", "b", "(Lhi/e;)Lhi/a;", "Lxj/c;", "analyticsService", "Lhi/f;", "a", "(Lxj/c;)Lhi/f;", "Lyj/i;", "g", "(Lyj/i;)Lhi/f;", "Landroid/content/Context;", "context", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "c", "(Landroid/content/Context;)Lcom/google/firebase/analytics/FirebaseAnalytics;", "firebaseAnalytics", "", "versionName", "Lxj/d;", "d", "(Lcom/google/firebase/analytics/FirebaseAnalytics;Ljava/lang/String;)Lxj/d;", "LTf/d;", "e", "()LTf/d;", "Lzj/b;", "firebasePerformanceManager", "Lzj/a;", "f", "(Lzj/b;)Lzj/a;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yj.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C18320a {

    /* renamed from: a, reason: collision with root package name */
    public static final C18320a f171468a = new C18320a();

    public final InterfaceC14528f a(C18186c analyticsService) {
        Intrinsics.j(analyticsService, "analyticsService");
        return analyticsService;
    }

    public final InterfaceC14523a b(C14527e analyticsEventManager) {
        Intrinsics.j(analyticsEventManager, "analyticsEventManager");
        return analyticsEventManager;
    }

    public final InterfaceC18491a f(C18492b firebasePerformanceManager) {
        Intrinsics.j(firebasePerformanceManager, "firebasePerformanceManager");
        return firebasePerformanceManager;
    }

    public final InterfaceC14528f g(i analyticsService) {
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

    public final C18187d d(FirebaseAnalytics firebaseAnalytics, String versionName) {
        Intrinsics.j(firebaseAnalytics, "firebaseAnalytics");
        Intrinsics.j(versionName, "versionName");
        return new C18187d(firebaseAnalytics, versionName);
    }

    public final Tf.d e() {
        return Tf.g.a(com.google.firebase.c.f89468a);
    }

    private C18320a() {
    }
}
