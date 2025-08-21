package com.scandit.datacapture.barcode.batch.capture;

import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class F extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeFrameData f121392a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(NativeFrameData nativeFrameData) {
        super(0);
        this.f121392a = nativeFrameData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CoreNativeTypeFactory.INSTANCE.convert(this.f121392a);
    }
}
