package com.scandit.datacapture.barcode.internal.module.spark.ui.toast;

import android.os.Handler;
import android.os.Looper;
import com.scandit.datacapture.barcode.internal.module.spark.ui.toast.z;
import com.scandit.datacapture.core.time.TimeInterval;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class z implements y {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f124234a = new Handler(Looper.getMainLooper());

    public final void a(final r onTimeout, TimeInterval timeout) {
        Intrinsics.j(onTimeout, "onTimeout");
        Intrinsics.j(timeout, "timeout");
        this.f124234a.postDelayed(new Runnable() { // from class: Vt.a
            @Override // java.lang.Runnable
            public final void run() {
                z.a(onTimeout);
            }
        }, timeout.asMillis());
    }

    public static final void a(Function0 onTimeout) {
        Intrinsics.j(onTimeout, "$onTimeout");
        onTimeout.invoke();
    }
}
