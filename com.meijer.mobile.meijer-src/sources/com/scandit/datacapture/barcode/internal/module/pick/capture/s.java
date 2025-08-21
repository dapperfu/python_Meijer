package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class s extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeDataCaptureContext f123400a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(NativeDataCaptureContext nativeDataCaptureContext) {
        super(0);
        this.f123400a = nativeDataCaptureContext;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        NativeDataCaptureContext _0 = this.f123400a;
        Intrinsics.i(_0, "$_0");
        return coreNativeTypeFactory.convert(_0);
    }
}
