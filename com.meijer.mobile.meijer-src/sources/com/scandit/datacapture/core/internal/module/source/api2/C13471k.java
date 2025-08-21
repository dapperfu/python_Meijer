package com.scandit.datacapture.core.internal.module.source.api2;

import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise;
import com.scandit.datacapture.core.internal.sdk.common.async.WrappedPromiseUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.module.source.api2.k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13471k extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeWrappedPromise f125873a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C13476p f125874b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13471k(NativeWrappedPromise nativeWrappedPromise, C13476p c13476p) {
        super(1);
        this.f125873a = nativeWrappedPromise;
        this.f125874b = c13476p;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        NativeWrappedPromise nativeWrappedPromise = this.f125873a;
        WrappedPromiseUtilsKt.synchronizedHasNoValue(nativeWrappedPromise, new C13470j(zBooleanValue, this.f125874b, nativeWrappedPromise));
        return Unit.f143329a;
    }
}
