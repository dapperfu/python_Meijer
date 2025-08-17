package com.bugsnag.android;

import com.bugsnag.android.T0;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/bugsnag/android/i1;", "Lcom/bugsnag/android/j;", "Lcom/bugsnag/android/h1;", "user", "<init>", "(Lcom/bugsnag/android/h1;)V", "", "a", "()V", "value", "Lcom/bugsnag/android/h1;", "b", "()Lcom/bugsnag/android/h1;", "c", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class i1 extends C6475j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private h1 user;

    /* renamed from: b, reason: from getter */
    public final h1 getUser() {
        return this.user;
    }

    public final void c(h1 h1Var) {
        this.user = h1Var;
        a();
    }

    public i1(h1 h1Var) {
        this.user = h1Var;
    }

    public final void a() {
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            T0.s sVar = new T0.s(this.user);
            Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
            while (it.hasNext()) {
                ((Q6.l) it.next()).onStateChange(sVar);
            }
        }
    }
}
