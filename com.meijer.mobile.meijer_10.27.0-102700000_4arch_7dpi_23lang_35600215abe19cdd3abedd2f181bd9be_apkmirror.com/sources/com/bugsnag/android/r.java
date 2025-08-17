package com.bugsnag.android;

import Q6.ImmutableConfig;
import com.bugsnag.android.T0;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0003¨\u0006\u0011"}, d2 = {"Lcom/bugsnag/android/r;", "Lcom/bugsnag/android/j;", "<init>", "()V", "", "orientation", "", "c", "(Ljava/lang/String;)V", "LQ6/f;", "conf", "lastRunInfoPath", "", "consecutiveLaunchCrashes", "b", "(LQ6/f;Ljava/lang/String;I)V", "a", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class r extends C6475j {
    public final void a() {
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            T0.g gVar = T0.g.f63242a;
            Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
            while (it.hasNext()) {
                ((Q6.l) it.next()).onStateChange(gVar);
            }
        }
    }

    public final void b(ImmutableConfig conf, String lastRunInfoPath, int consecutiveLaunchCrashes) {
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            T0.h hVar = new T0.h(conf.getApiKey(), conf.getEnabledErrorTypes().getNdkCrashes(), conf.getAppVersion(), conf.getBuildUuid(), conf.getReleaseStage(), lastRunInfoPath, consecutiveLaunchCrashes, conf.getSendThreads());
            Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
            while (it.hasNext()) {
                ((Q6.l) it.next()).onStateChange(hVar);
            }
        }
    }

    public final void c(String orientation) {
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            T0.r rVar = new T0.r(orientation);
            Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
            while (it.hasNext()) {
                ((Q6.l) it.next()).onStateChange(rVar);
            }
        }
    }
}
