package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise;
import com.scandit.datacapture.core.internal.sdk.common.async.WrappedPromiseUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.module.source.e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13356e extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeWrappedPromise f125077a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C13365n f125078b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13356e(NativeWrappedPromise nativeWrappedPromise, C13365n c13365n) {
        super(1);
        this.f125077a = nativeWrappedPromise;
        this.f125078b = c13365n;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        NativeWrappedPromise nativeWrappedPromise = this.f125077a;
        WrappedPromiseUtilsKt.synchronizedHasNoValue(nativeWrappedPromise, new C13355d(zBooleanValue, this.f125078b, nativeWrappedPromise));
        return Unit.f142422a;
    }
}
