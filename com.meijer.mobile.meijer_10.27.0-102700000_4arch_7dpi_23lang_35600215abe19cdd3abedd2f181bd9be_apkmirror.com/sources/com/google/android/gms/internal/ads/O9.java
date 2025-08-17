package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class O9 {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.common.util.concurrent.q f69014a;

    public final com.google.common.util.concurrent.q a() {
        return this.f69014a;
    }

    public O9(final Context context, Executor executor) {
        this.f69014a = Mj0.j(new Callable(this) { // from class: com.google.android.gms.internal.ads.N9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = context;
                try {
                    return C8547kc0.a(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                } catch (Throwable unused) {
                    return null;
                }
            }
        }, executor);
    }
}
