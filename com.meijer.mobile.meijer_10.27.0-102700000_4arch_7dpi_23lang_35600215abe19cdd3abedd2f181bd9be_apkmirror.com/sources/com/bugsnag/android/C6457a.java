package com.bugsnag.android;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BK\u0012B\u0010\u000b\u001a>\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010\u001dJ\u001f\u0010\"\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\"\u0010\u001bJ\u0017\u0010#\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010\u001dR \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010%RP\u0010\u000b\u001a>\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010'¨\u0006("}, d2 = {"Lcom/bugsnag/android/a;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "message", "", "", "method", "", "cb", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "Landroid/app/Activity;", "activity", "kotlin.jvm.PlatformType", "a", "(Landroid/app/Activity;)Ljava/lang/String;", "lifecycleCallback", "", "hasBundle", "b", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Boolean;)V", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "Ljava/util/WeakHashMap;", "Ljava/util/WeakHashMap;", "prevState", "Lkotlin/jvm/functions/Function2;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.bugsnag.android.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6457a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final WeakHashMap<Activity, String> prevState = new WeakHashMap<>();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function2<String, Map<String, ? extends Object>, Unit> cb;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        c(this, activity, "onDestroy()", null, 4, null);
        this.prevState.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        c(this, activity, "onPause()", null, 4, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        c(this, activity, "onResume()", null, 4, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        c(this, activity, "onSaveInstanceState()", null, 4, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        c(this, activity, "onStart()", null, 4, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        c(this, activity, "onStop()", null, 4, null);
    }

    private final void b(Activity activity, String lifecycleCallback, Boolean hasBundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (hasBundle != null) {
            linkedHashMap.put("hasBundle", hasBundle);
        }
        String str = this.prevState.get(activity);
        if (str != null) {
            linkedHashMap.put("previous", str);
        }
        String strA = a(activity);
        this.cb.invoke(strA + '#' + lifecycleCallback, linkedHashMap);
        this.prevState.put(activity, lifecycleCallback);
    }

    static /* synthetic */ void c(C6457a c6457a, Activity activity, String str, Boolean bool, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            bool = null;
        }
        c6457a.b(activity, str, bool);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        b(activity, "onCreate()", Boolean.valueOf(savedInstanceState != null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6457a(Function2<? super String, ? super Map<String, ? extends Object>, Unit> function2) {
        this.cb = function2;
    }

    private final String a(Activity activity) {
        return activity.getClass().getSimpleName();
    }
}
