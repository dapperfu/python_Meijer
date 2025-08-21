package com.radiusnetworks.flybuy.sdk.manager;

import android.content.Context;
import com.bugsnag.android.C6610o;
import com.bugsnag.android.C6627x;
import com.radiusnetworks.flybuy.sdk.ConfigOptions;
import io.constructor.data.local.PreferencesHelper;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/manager/CrashManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "applicationContext", "enabled", "", "init", "", "withOptions", "Lcom/radiusnetworks/flybuy/sdk/ConfigOptions;", "log", "message", "", "reportCrash", "throwable", "", "setUser", PreferencesHelper.PREF_ID, "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CrashManager {
    private final Context applicationContext;
    private boolean enabled;

    public CrashManager(Context context) {
        Intrinsics.j(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.i(applicationContext, "getApplicationContext(...)");
        this.applicationContext = applicationContext;
    }

    public final void init(ConfigOptions withOptions) {
        Intrinsics.j(withOptions, "withOptions");
        boolean crashMonitoringEnabled = withOptions.getCrashMonitoringEnabled();
        this.enabled = crashMonitoringEnabled;
        if (crashMonitoringEnabled) {
            C6627x c6627xI = C6627x.I(this.applicationContext);
            Intrinsics.i(c6627xI, "load(...)");
            c6627xI.N(false);
            c6627xI.L("2.15.0");
            c6627xI.h0(1);
            c6627xI.a0(true);
            c6627xI.c0(SetsKt.i(Pattern.compile("password"), Pattern.compile("token"), Pattern.compile("email")));
            C6610o.g(this.applicationContext, c6627xI);
            C6610o.a("account", "app_auth_id", StringsKt.w1(withOptions.getAppTokenKey(), ".", null, 2, null));
        }
    }

    public final void log(String message) {
        Intrinsics.j(message, "message");
        if (this.enabled) {
            C6610o.c(message);
        }
    }

    public final void reportCrash(Throwable throwable) {
        Intrinsics.j(throwable, "throwable");
        if (this.enabled) {
            C6610o.e(throwable);
        }
    }

    public final void setUser(String id2) {
        if (this.enabled) {
            C6610o.f(id2, null, null);
        }
    }
}
