package com.scandit.datacapture.core.internal.module.ui;

import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class q extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeGestureListener f125311a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(NativeGestureListener nativeGestureListener) {
        super(0);
        this.f125311a = nativeGestureListener;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CoreNativeTypeFactory.INSTANCE.convert(this.f125311a);
    }
}
