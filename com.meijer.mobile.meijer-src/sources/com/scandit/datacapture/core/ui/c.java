package com.scandit.datacapture.core.ui;

import com.scandit.datacapture.core.internal.module.ui.GestureRecognizer;
import com.scandit.datacapture.core.internal.module.ui.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureRecognizer f126974a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(GestureRecognizer gestureRecognizer) {
        super(0);
        this.f126974a = gestureRecognizer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new r(this.f126974a);
    }
}
