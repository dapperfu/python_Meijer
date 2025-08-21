package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class r extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeJsonValue f121539a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(NativeJsonValue nativeJsonValue) {
        super(0);
        this.f121539a = nativeJsonValue;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CoreNativeTypeFactory.INSTANCE.convert(this.f121539a);
    }
}
