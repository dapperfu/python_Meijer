package com.scandit.datacapture.core.internal.module.source.api2;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.module.source.api2.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13460b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C13460b f125836a = new C13460b();

    public C13460b() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            Intrinsics.i(looperMyLooper, "requireNotNull(...)");
            if (Intrinsics.e(looperMyLooper, Looper.getMainLooper())) {
                return null;
            }
            return new Handler(looperMyLooper);
        }
        throw new IllegalArgumentException("Can only create the handler from a Looper thread");
    }
}
