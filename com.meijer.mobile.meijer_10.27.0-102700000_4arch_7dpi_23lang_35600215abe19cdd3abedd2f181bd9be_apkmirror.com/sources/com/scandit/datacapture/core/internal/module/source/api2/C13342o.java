package com.scandit.datacapture.core.internal.module.source.api2;

import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise;
import com.scandit.datacapture.core.internal.sdk.common.async.WrappedPromiseUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.module.source.api2.o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13342o extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeWrappedPromise f124946a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13342o(NativeWrappedPromise nativeWrappedPromise) {
        super(1);
        this.f124946a = nativeWrappedPromise;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WrappedPromiseUtilsKt.synchronizedSetValueIfNoValue(this.f124946a, ((Boolean) obj).booleanValue());
        return Unit.f142422a;
    }
}
