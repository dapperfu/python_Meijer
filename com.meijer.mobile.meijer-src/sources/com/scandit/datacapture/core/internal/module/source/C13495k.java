package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise;
import com.scandit.datacapture.core.internal.sdk.common.async.WrappedPromiseUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.module.source.k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13495k extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeWrappedPromise f126043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C13498n f126044b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NativeCameraDelegateSettings f126045c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13495k(NativeWrappedPromise nativeWrappedPromise, C13498n c13498n, NativeCameraDelegateSettings nativeCameraDelegateSettings) {
        super(1);
        this.f126043a = nativeWrappedPromise;
        this.f126044b = c13498n;
        this.f126045c = nativeCameraDelegateSettings;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        NativeWrappedPromise nativeWrappedPromise = this.f126043a;
        WrappedPromiseUtilsKt.synchronizedHasNoValue(nativeWrappedPromise, new C13494j(zBooleanValue, this.f126044b, this.f126045c, nativeWrappedPromise));
        return Unit.f143329a;
    }
}
