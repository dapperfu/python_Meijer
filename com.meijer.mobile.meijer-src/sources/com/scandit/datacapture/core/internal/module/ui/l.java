package com.scandit.datacapture.core.internal.module.ui;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class l extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f126253a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar) {
        super(0);
        this.f126253a = mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Float.valueOf(this.f126253a.getResources().getDisplayMetrics().scaledDensity * 8.0f);
    }
}
