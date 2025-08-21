package com.scandit.datacapture.core.internal.sdk;

import android.content.Context;
import com.scandit.datacapture.core.internal.sdk.lifecycle.AppLifecycleListener;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/AndroidEnvironment;", "", "appLifecycleListener", "Lcom/scandit/datacapture/core/internal/sdk/lifecycle/AppLifecycleListener;", "getAppLifecycleListener", "()Lcom/scandit/datacapture/core/internal/sdk/lifecycle/AppLifecycleListener;", "applicationContext", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "setApplicationContext", "(Landroid/content/Context;)V", "supportedAbis", "", "", "getSupportedAbis", "()[Ljava/lang/String;", "getInstallerInfo", "context", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface AndroidEnvironment {
    AppLifecycleListener getAppLifecycleListener();

    Context getApplicationContext();

    String getInstallerInfo(Context context);

    String[] getSupportedAbis();

    void setApplicationContext(Context context);
}
