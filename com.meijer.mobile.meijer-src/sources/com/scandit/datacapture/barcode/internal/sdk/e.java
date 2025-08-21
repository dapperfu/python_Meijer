package com.scandit.datacapture.barcode.internal.sdk;

import com.scandit.datacapture.barcode.count.capture.list.TargetBarcode;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeTargetBarcode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeTargetBarcode f124501a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(NativeTargetBarcode nativeTargetBarcode) {
        super(0);
        this.f124501a = nativeTargetBarcode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new TargetBarcode(this.f124501a);
    }
}
