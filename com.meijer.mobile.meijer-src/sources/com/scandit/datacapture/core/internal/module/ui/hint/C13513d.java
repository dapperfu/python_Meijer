package com.scandit.datacapture.core.internal.module.ui.hint;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.module.ui.hint.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13513d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C13513d f126211a = new C13513d();

    public C13513d() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
