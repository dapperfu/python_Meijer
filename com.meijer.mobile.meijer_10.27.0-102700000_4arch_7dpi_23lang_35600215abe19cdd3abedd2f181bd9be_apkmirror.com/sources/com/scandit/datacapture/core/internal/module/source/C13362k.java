package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise;
import com.scandit.datacapture.core.internal.sdk.common.async.WrappedPromiseUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.module.source.k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13362k extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeWrappedPromise f125091a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C13365n f125092b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NativeCameraDelegateSettings f125093c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13362k(NativeWrappedPromise nativeWrappedPromise, C13365n c13365n, NativeCameraDelegateSettings nativeCameraDelegateSettings) {
        super(1);
        this.f125091a = nativeWrappedPromise;
        this.f125092b = c13365n;
        this.f125093c = nativeCameraDelegateSettings;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        NativeWrappedPromise nativeWrappedPromise = this.f125091a;
        WrappedPromiseUtilsKt.synchronizedHasNoValue(nativeWrappedPromise, new C13361j(zBooleanValue, this.f125092b, this.f125093c, nativeWrappedPromise));
        return Unit.f142422a;
    }
}
