package com.scandit.datacapture.core.internal.module.source.api2;

import android.os.SystemClock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class X extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final X f125819a = new X();

    public X() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Long.valueOf(SystemClock.elapsedRealtime());
    }
}
