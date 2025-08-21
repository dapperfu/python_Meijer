package com.scandit.datacapture.barcode.pick.serialization;

import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class q extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeJsonValue f124586a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(NativeJsonValue nativeJsonValue) {
        super(0);
        this.f124586a = nativeJsonValue;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CoreNativeTypeFactory.INSTANCE.convert(this.f124586a);
    }
}
