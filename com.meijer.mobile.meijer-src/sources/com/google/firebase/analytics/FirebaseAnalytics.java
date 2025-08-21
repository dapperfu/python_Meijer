package com.google.firebase.analytics;

import Qd.E;
import Vd.C5519m;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.measurement.C10669v1;
import com.google.android.gms.internal.measurement.J0;
import com.google.firebase.installations.c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes8.dex */
public final class FirebaseAnalytics {

    /* renamed from: b, reason: collision with root package name */
    private static volatile FirebaseAnalytics f89447b;

    /* renamed from: a, reason: collision with root package name */
    private final C10669v1 f89448a;

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f89447b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f89447b == null) {
                        f89447b = new FirebaseAnalytics(C10669v1.r(context, null));
                    }
                } finally {
                }
            }
        }
        return f89447b;
    }

    public void a(String str, Bundle bundle) {
        this.f89448a.v(str, bundle);
    }

    public void b(String str) {
        this.f89448a.B(str);
    }

    public void c(String str, String str2) {
        this.f89448a.x(null, str, str2, false);
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f89448a.C(J0.B(activity), str, str2);
    }

    public FirebaseAnalytics(C10669v1 c10669v1) {
        r.l(c10669v1);
        this.f89448a = c10669v1;
    }

    @Keep
    public static E getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C10669v1 c10669v1R = C10669v1.r(context, bundle);
        if (c10669v1R == null) {
            return null;
        }
        return new a(c10669v1R);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) C5519m.b(c.p().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }
}
