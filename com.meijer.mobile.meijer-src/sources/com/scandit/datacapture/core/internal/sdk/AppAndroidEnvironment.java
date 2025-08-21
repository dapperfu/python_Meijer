package com.scandit.datacapture.core.internal.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import com.scandit.datacapture.core.internal.sdk.lifecycle.AppLifecycleListener;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/AppAndroidEnvironment;", "Lcom/scandit/datacapture/core/internal/sdk/AndroidEnvironment;", "Landroid/content/Context;", "context", "", "getInstallerInfo", "(Landroid/content/Context;)Ljava/lang/String;", "applicationContext", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "setApplicationContext", "(Landroid/content/Context;)V", "Lcom/scandit/datacapture/core/internal/sdk/lifecycle/AppLifecycleListener;", "a", "Lkotlin/Lazy;", "getAppLifecycleListener", "()Lcom/scandit/datacapture/core/internal/sdk/lifecycle/AppLifecycleListener;", "appLifecycleListener", "", "b", "getSupportedAbis", "()[Ljava/lang/String;", "supportedAbis", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes12.dex */
public final class AppAndroidEnvironment implements AndroidEnvironment {
    public static Context applicationContext;
    public static final AppAndroidEnvironment INSTANCE = new AppAndroidEnvironment();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final Lazy appLifecycleListener = LazyKt.b(a.f126297a);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Lazy supportedAbis = LazyKt.b(b.f126310a);

    @Override // com.scandit.datacapture.core.internal.sdk.AndroidEnvironment
    public AppLifecycleListener getAppLifecycleListener() {
        return (AppLifecycleListener) appLifecycleListener.getValue();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.AndroidEnvironment
    public Context getApplicationContext() {
        Context context = applicationContext;
        if (context != null) {
            return context;
        }
        Intrinsics.x("applicationContext");
        return null;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.AndroidEnvironment
    public String getInstallerInfo(Context context) {
        Intrinsics.j(context, "context");
        return Build.VERSION.SDK_INT >= 30 ? context.getPackageManager().getInstallSourceInfo(context.getPackageName()).getInitiatingPackageName() : context.getPackageManager().getInstallerPackageName(context.getPackageName());
    }

    @Override // com.scandit.datacapture.core.internal.sdk.AndroidEnvironment
    public String[] getSupportedAbis() {
        Object value = supportedAbis.getValue();
        Intrinsics.i(value, "getValue(...)");
        return (String[]) value;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.AndroidEnvironment
    public void setApplicationContext(Context context) {
        Intrinsics.j(context, "<set-?>");
        applicationContext = context;
    }

    private AppAndroidEnvironment() {
    }
}
