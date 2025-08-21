package com.scandit.datacapture.barcode.internal.module.spark.internal;

import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class r extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeFrameData f123903a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(NativeFrameData nativeFrameData) {
        super(0);
        this.f123903a = nativeFrameData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CoreNativeTypeFactory.INSTANCE.convert(this.f123903a);
    }
}
