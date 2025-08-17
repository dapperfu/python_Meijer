package com.scandit.datacapture.core.ui.gesture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ZoomGesture f126107a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ZoomGesture zoomGesture) {
        super(0);
        this.f126107a = zoomGesture;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f126107a;
    }
}
