package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise;
import com.scandit.datacapture.core.internal.sdk.common.async.WrappedPromiseUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.module.source.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13487c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeWrappedPromise f125970a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13487c(NativeWrappedPromise nativeWrappedPromise) {
        super(1);
        this.f125970a = nativeWrappedPromise;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WrappedPromiseUtilsKt.synchronizedSetValueIfNoValue(this.f125970a, ((Boolean) obj).booleanValue());
        return Unit.f143329a;
    }
}
