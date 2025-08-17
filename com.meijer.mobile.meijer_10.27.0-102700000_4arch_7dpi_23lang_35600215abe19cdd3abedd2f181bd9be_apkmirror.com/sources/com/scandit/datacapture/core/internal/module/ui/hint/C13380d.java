package com.scandit.datacapture.core.internal.module.ui.hint;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.module.ui.hint.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13380d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C13380d f125259a = new C13380d();

    public C13380d() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
