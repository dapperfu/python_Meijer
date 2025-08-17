package com.bugsnag.android;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ7\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0001¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/bugsnag/android/u0;", "", "<init>", "()V", "Lcom/bugsnag/android/u;", "config", "Landroid/os/Bundle;", "data", "", "e", "(Lcom/bugsnag/android/u;Landroid/os/Bundle;)V", "f", "d", "", "key", "", "default", "a", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;", "Landroid/content/Context;", "ctx", "userSuppliedApiKey", "b", "(Landroid/content/Context;Ljava/lang/String;)Lcom/bugsnag/android/u;", "c", "(Landroid/os/Bundle;Ljava/lang/String;)Lcom/bugsnag/android/u;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.bugsnag.android.u0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6497u0 {
    private final void d(C6496u config, Bundle data) {
        config.b0(data.getString("com.bugsnag.android.RELEASE_STAGE", config.z()));
        config.K(data.getString("com.bugsnag.android.APP_VERSION", config.c()));
        config.J(data.getString("com.bugsnag.android.APP_TYPE", config.b()));
        if (data.containsKey("com.bugsnag.android.VERSION_CODE")) {
            config.e0(Integer.valueOf(data.getInt("com.bugsnag.android.VERSION_CODE")));
        }
        if (data.containsKey("com.bugsnag.android.ENABLED_RELEASE_STAGES")) {
            config.Q(a(data, "com.bugsnag.android.ENABLED_RELEASE_STAGES", config.k()));
        }
        Set<String> setA = a(data, "com.bugsnag.android.DISCARD_CLASSES", config.h());
        if (setA == null) {
            setA = SetsKt.e();
        }
        config.P(setA);
        Set<String> setA2 = a(data, "com.bugsnag.android.PROJECT_PACKAGES", SetsKt.e());
        if (setA2 == null) {
            setA2 = SetsKt.e();
        }
        config.Z(setA2);
        Set<String> setA3 = a(data, "com.bugsnag.android.REDACTED_KEYS", config.y());
        if (setA3 == null) {
            setA3 = SetsKt.e();
        }
        config.a0(setA3);
    }

    private final void e(C6496u config, Bundle data) {
        config.N(data.getBoolean("com.bugsnag.android.AUTO_TRACK_SESSIONS", config.e()));
        config.M(data.getBoolean("com.bugsnag.android.AUTO_DETECT_ERRORS", config.d()));
        config.Y(data.getBoolean("com.bugsnag.android.PERSIST_USER", config.u()));
        String string = data.getString("com.bugsnag.android.SEND_THREADS");
        if (string != null) {
            config.d0(b1.INSTANCE.a(string));
        }
    }

    private final void f(C6496u config, Bundle data) {
        if (data.containsKey("com.bugsnag.android.ENDPOINT_NOTIFY")) {
            String endpoint = data.getString("com.bugsnag.android.ENDPOINT_NOTIFY", config.l().getNotify());
            String sessionEndpoint = data.getString("com.bugsnag.android.ENDPOINT_SESSIONS", config.l().getSessions());
            Intrinsics.f(endpoint, "endpoint");
            Intrinsics.f(sessionEndpoint, "sessionEndpoint");
            config.R(new Q(endpoint, sessionEndpoint));
        }
    }

    public final C6496u c(Bundle data, String userSuppliedApiKey) {
        if (userSuppliedApiKey == null) {
            userSuppliedApiKey = data != null ? data.getString("com.bugsnag.android.API_KEY") : null;
        }
        if (userSuppliedApiKey == null) {
            throw new IllegalArgumentException("No Bugsnag API key set");
        }
        C6496u c6496u = new C6496u(userSuppliedApiKey);
        if (data != null) {
            e(c6496u, data);
            f(c6496u, data);
            d(c6496u, data);
            c6496u.U(data.getInt("com.bugsnag.android.MAX_BREADCRUMBS", c6496u.o()));
            c6496u.V(data.getInt("com.bugsnag.android.MAX_PERSISTED_EVENTS", c6496u.p()));
            c6496u.W(data.getInt("com.bugsnag.android.MAX_PERSISTED_SESSIONS", c6496u.q()));
            c6496u.X(data.getInt("com.bugsnag.android.MAX_REPORTED_THREADS", c6496u.r()));
            c6496u.S(data.getInt("com.bugsnag.android.LAUNCH_CRASH_THRESHOLD_MS", (int) c6496u.m()));
            c6496u.S(data.getInt("com.bugsnag.android.LAUNCH_DURATION_MILLIS", (int) c6496u.m()));
            c6496u.c0(data.getBoolean("com.bugsnag.android.SEND_LAUNCH_CRASHES_SYNCHRONOUSLY", c6496u.A()));
            c6496u.L(data.getBoolean("com.bugsnag.android.ATTEMPT_DELIVERY_ON_CRASH", c6496u.F()));
        }
        return c6496u;
    }

    private final Set<String> a(Bundle data, String key, Set<String> set) {
        List listA1;
        String string = data.getString(key);
        if (string != null) {
            listA1 = StringsKt.a1(string, new String[]{","}, false, 0, 6, null);
        } else {
            listA1 = null;
        }
        if (listA1 == null) {
            return set;
        }
        return CollectionsKt.o1(listA1);
    }

    public final C6496u b(Context ctx, String userSuppliedApiKey) throws PackageManager.NameNotFoundException {
        try {
            ApplicationInfo applicationInfo = ctx.getPackageManager().getApplicationInfo(ctx.getPackageName(), 128);
            Intrinsics.f(applicationInfo, "packageManager.getApplic…ageManager.GET_META_DATA)");
            return c(applicationInfo.metaData, userSuppliedApiKey);
        } catch (Exception e10) {
            throw new IllegalStateException("Bugsnag is unable to read config from manifest.", e10);
        }
    }
}
