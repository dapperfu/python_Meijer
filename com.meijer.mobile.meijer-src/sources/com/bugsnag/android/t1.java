package com.bugsnag.android;

import com.bugsnag.android.e1;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/bugsnag/android/t1;", "Lcom/bugsnag/android/m;", "Lcom/bugsnag/android/s1;", "user", "<init>", "(Lcom/bugsnag/android/s1;)V", "", "b", "()V", "value", "a", "Lcom/bugsnag/android/s1;", "c", "()Lcom/bugsnag/android/s1;", "d", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class t1 extends C6606m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private s1 user;

    /* renamed from: c, reason: from getter */
    public final s1 getUser() {
        return this.user;
    }

    public final void d(s1 s1Var) {
        this.user = s1Var;
        b();
    }

    public t1(s1 s1Var) {
        this.user = s1Var;
    }

    public final void b() {
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            e1.s sVar = new e1.s(getUser());
            Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
            while (it.hasNext()) {
                ((R6.r) it.next()).onStateChange(sVar);
            }
        }
    }
}
