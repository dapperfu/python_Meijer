package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class n extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeFrameData f123393a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(NativeFrameData nativeFrameData) {
        super(0);
        this.f123393a = nativeFrameData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CoreNativeTypeFactory.INSTANCE.convert(this.f123393a);
    }
}
