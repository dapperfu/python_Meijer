package com.bugsnag.android;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import io.constructor.data.local.PreferencesHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BK\u0012B\u0010\u000b\u001a>\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00032\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010!J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010!J\u0017\u0010$\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010!J\u001f\u0010&\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b&\u0010\u001fJ\u0017\u0010'\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b'\u0010!RP\u0010\u000b\u001a>\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010(R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010*¨\u0006,"}, d2 = {"Lcom/bugsnag/android/b;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "message", "", "", "method", "", "cb", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "Landroid/app/Activity;", "activity", "kotlin.jvm.PlatformType", "a", "(Landroid/app/Activity;)Ljava/lang/String;", "lifecycleCallback", "", "metadata", "b", "(Landroid/app/Activity;Ljava/lang/String;Ljava/util/Map;)V", "Landroid/content/Intent;", "intent", "d", "(Ljava/util/Map;Landroid/content/Intent;)V", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "Lkotlin/jvm/functions/Function2;", "Ljava/util/WeakHashMap;", "Ljava/util/WeakHashMap;", "prevState", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.bugsnag.android.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6584b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function2<String, Map<String, ? extends Object>, Unit> cb;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final WeakHashMap<Activity, String> prevState = new WeakHashMap<>();

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

    private final void b(Activity activity, String lifecycleCallback, Map<String, Object> metadata) {
        String str = this.prevState.get(activity);
        if (str != null) {
            metadata.put("previous", str);
        }
        String strA = a(activity);
        this.cb.invoke(((Object) strA) + '#' + lifecycleCallback, metadata);
        this.prevState.put(activity, lifecycleCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void c(C6584b c6584b, Activity activity, String str, Map map, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            map = new LinkedHashMap();
        }
        c6584b.b(activity, str, map);
    }

    private final void d(Map<String, Object> map, Intent intent) {
        Set<String> setKeySet;
        Object objB0;
        String identifier;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (action != null) {
            map.put("action", action);
        }
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            map.put("categories", CollectionsKt.B0(categories, ", ", null, null, 0, null, null, 62, null));
        }
        String type = intent.getType();
        if (type != null) {
            map.put("type", type);
        }
        if (intent.getFlags() != 0) {
            String string = Integer.toString(intent.getFlags(), CharsKt.a(16));
            Intrinsics.i(string, "toString(this, checkRadix(radix))");
            map.put("flags", Intrinsics.q("0x", string));
        }
        if (Build.VERSION.SDK_INT >= 29 && (identifier = intent.getIdentifier()) != null) {
            map.put(PreferencesHelper.PREF_ID, identifier);
        }
        map.put("hasData", Boolean.valueOf(intent.getData() != null));
        try {
            Bundle extras = intent.getExtras();
            if (extras == null || (setKeySet = extras.keySet()) == null || (objB0 = CollectionsKt.B0(setKeySet, ", ", null, null, 0, null, null, 62, null)) == null) {
                objB0 = Boolean.FALSE;
            }
            map.put("hasExtras", objB0);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("hasBundle", Boolean.valueOf(savedInstanceState != null));
        d(linkedHashMap, activity.getIntent());
        Unit unit = Unit.f143329a;
        b(activity, "onCreate()", linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6584b(Function2<? super String, ? super Map<String, ? extends Object>, Unit> function2) {
        this.cb = function2;
    }

    private final String a(Activity activity) {
        return activity.getClass().getSimpleName();
    }
}
