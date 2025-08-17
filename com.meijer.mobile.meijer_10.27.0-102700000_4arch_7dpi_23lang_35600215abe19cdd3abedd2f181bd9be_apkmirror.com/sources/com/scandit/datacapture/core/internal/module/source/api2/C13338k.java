package com.scandit.datacapture.core.internal.module.source.api2;

import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise;
import com.scandit.datacapture.core.internal.sdk.common.async.WrappedPromiseUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.module.source.api2.k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13338k extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeWrappedPromise f124921a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C13343p f124922b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13338k(NativeWrappedPromise nativeWrappedPromise, C13343p c13343p) {
        super(1);
        this.f124921a = nativeWrappedPromise;
        this.f124922b = c13343p;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        NativeWrappedPromise nativeWrappedPromise = this.f124921a;
        WrappedPromiseUtilsKt.synchronizedHasNoValue(nativeWrappedPromise, new C13337j(zBooleanValue, this.f124922b, nativeWrappedPromise));
        return Unit.f142422a;
    }
}
