package com.scandit.datacapture.core.internal.sdk;

import android.app.Application;
import android.content.Context;
import com.scandit.datacapture.core.internal.sdk.lifecycle.AppLifecycleListener;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f125345a = new a();

    public a() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AppLifecycleListener appLifecycleListener = new AppLifecycleListener();
        Context applicationContext = AppAndroidEnvironment.INSTANCE.getApplicationContext();
        Intrinsics.h(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(appLifecycleListener);
        return appLifecycleListener;
    }
}
