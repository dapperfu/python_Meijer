package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise;
import com.scandit.datacapture.core.internal.sdk.common.async.WrappedPromiseUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.module.source.m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13364m extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeWrappedPromise f125095a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C13365n f125096b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13364m(NativeWrappedPromise nativeWrappedPromise, C13365n c13365n) {
        super(1);
        this.f125095a = nativeWrappedPromise;
        this.f125096b = c13365n;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        Unit unit;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            WrappedPromiseUtilsKt.synchronizedSetValueIfNoValue(this.f125095a, zBooleanValue);
        } else {
            C13365n c13365n = this.f125096b;
            NativeWrappedPromise nativeWrappedPromise = this.f125095a;
            NativeCameraDelegateSettings nativeCameraDelegateSettings = (NativeCameraDelegateSettings) c13365n.f125106j.get();
            if (nativeCameraDelegateSettings != null) {
                c13365n.shutDown();
                c13365n.startWithSettings(nativeCameraDelegateSettings, nativeWrappedPromise);
                unit = Unit.f142422a;
            } else {
                unit = null;
            }
            if (unit == null) {
                WrappedPromiseUtilsKt.synchronizedSetValueIfNoValue(nativeWrappedPromise, false);
            }
        }
        return Unit.f142422a;
    }
}
