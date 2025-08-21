package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise;
import com.scandit.datacapture.core.internal.sdk.common.async.WrappedPromiseUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.module.source.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13489e extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeWrappedPromise f126029a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C13498n f126030b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13489e(NativeWrappedPromise nativeWrappedPromise, C13498n c13498n) {
        super(1);
        this.f126029a = nativeWrappedPromise;
        this.f126030b = c13498n;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        NativeWrappedPromise nativeWrappedPromise = this.f126029a;
        WrappedPromiseUtilsKt.synchronizedHasNoValue(nativeWrappedPromise, new C13488d(zBooleanValue, this.f126030b, nativeWrappedPromise));
        return Unit.f143329a;
    }
}
