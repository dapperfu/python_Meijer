package com.bugsnag.android;

import R6.ImmutableConfig;
import com.bugsnag.android.e1;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0003¨\u0006\u0011"}, d2 = {"Lcom/bugsnag/android/u;", "Lcom/bugsnag/android/m;", "<init>", "()V", "", "orientation", "", "d", "(Ljava/lang/String;)V", "LR6/k;", "conf", "lastRunInfoPath", "", "consecutiveLaunchCrashes", "c", "(LR6/k;Ljava/lang/String;I)V", "b", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.bugsnag.android.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6621u extends C6606m {
    public final void b() {
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            e1.g gVar = e1.g.f64168a;
            Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
            while (it.hasNext()) {
                ((R6.r) it.next()).onStateChange(gVar);
            }
        }
    }

    public final void c(ImmutableConfig conf, String lastRunInfoPath, int consecutiveLaunchCrashes) {
        String strA;
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            String apiKey = conf.getApiKey();
            boolean ndkCrashes = conf.getEnabledErrorTypes().getNdkCrashes();
            String appVersion = conf.getAppVersion();
            S6.d<String> dVarG = conf.g();
            if (dVarG == null) {
                strA = null;
            } else {
                strA = dVarG.a();
            }
            e1.h hVar = new e1.h(apiKey, ndkCrashes, appVersion, strA, conf.getReleaseStage(), lastRunInfoPath, consecutiveLaunchCrashes, conf.getSendThreads(), conf.getMaxBreadcrumbs());
            Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
            while (it.hasNext()) {
                ((R6.r) it.next()).onStateChange(hVar);
            }
        }
    }

    public final void d(String orientation) {
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            e1.r rVar = new e1.r(orientation);
            Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
            while (it.hasNext()) {
                ((R6.r) it.next()).onStateChange(rVar);
            }
        }
    }
}
