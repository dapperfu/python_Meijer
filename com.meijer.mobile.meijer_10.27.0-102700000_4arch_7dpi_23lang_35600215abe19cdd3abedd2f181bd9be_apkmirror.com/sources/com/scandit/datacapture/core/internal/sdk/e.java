package com.scandit.datacapture.core.internal.sdk;

import com.scandit.internal.sdk.bar.Callable;
import com.scandit.internal.sdk.bar.HandlerThread;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class e extends HandlerThread {

    /* renamed from: a, reason: collision with root package name */
    public final d f125452a;

    public e(String name, Callable function, int i10) {
        Intrinsics.j(name, "name");
        Intrinsics.j(function, "function");
        d dVar = new d(name, function, i10);
        this.f125452a = dVar;
        dVar.start();
    }

    @Override // com.scandit.internal.sdk.bar.HandlerThread
    public final void quitSafely() {
        try {
            this.f125452a.quitSafely();
        } catch (InterruptedException e10) {
            Intrinsics.j(e10, "e");
            e10.printStackTrace();
        }
    }
}
