package com.radiusnetworks.flybuy.sdk;

import android.app.Application;
import android.content.Context;
import androidx.annotation.Keep;
import com.fullstory.FS;
import kotlin.Deprecated;
import kotlin.Metadata;

@Deprecated
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\u0006"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/FlyBuyApplication;", "Landroid/app/Application;", "()V", "onCreate", "", "registerLifecycleCallbacks", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public class FlyBuyApplication extends Application {
    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        FS.init(this, context);
        super.attachBaseContext(context);
    }

    private final void registerLifecycleCallbacks() {
        registerActivityLifecycleCallbacks(new a());
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        registerLifecycleCallbacks();
    }
}
