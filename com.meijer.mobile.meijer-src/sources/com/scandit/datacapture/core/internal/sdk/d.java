package com.scandit.datacapture.core.internal.sdk;

import android.os.HandlerThread;
import com.scandit.internal.sdk.bar.Callable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class d extends HandlerThread {

    /* renamed from: a, reason: collision with root package name */
    public final Callable f126390a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String name, Callable function, int i10) {
        super(name, i10);
        Intrinsics.j(name, "name");
        Intrinsics.j(function, "function");
        this.f126390a = function;
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        super.onLooperPrepared();
        this.f126390a.run();
    }
}
