package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise;
import com.scandit.datacapture.core.internal.sdk.common.async.WrappedPromiseUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.module.source.m, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13497m extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeWrappedPromise f126047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C13498n f126048b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13497m(NativeWrappedPromise nativeWrappedPromise, C13498n c13498n) {
        super(1);
        this.f126047a = nativeWrappedPromise;
        this.f126048b = c13498n;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        Unit unit;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            WrappedPromiseUtilsKt.synchronizedSetValueIfNoValue(this.f126047a, zBooleanValue);
        } else {
            C13498n c13498n = this.f126048b;
            NativeWrappedPromise nativeWrappedPromise = this.f126047a;
            NativeCameraDelegateSettings nativeCameraDelegateSettings = (NativeCameraDelegateSettings) c13498n.f126058j.get();
            if (nativeCameraDelegateSettings != null) {
                c13498n.shutDown();
                c13498n.startWithSettings(nativeCameraDelegateSettings, nativeWrappedPromise);
                unit = Unit.f143329a;
            } else {
                unit = null;
            }
            if (unit == null) {
                WrappedPromiseUtilsKt.synchronizedSetValueIfNoValue(nativeWrappedPromise, false);
            }
        }
        return Unit.f143329a;
    }
}
