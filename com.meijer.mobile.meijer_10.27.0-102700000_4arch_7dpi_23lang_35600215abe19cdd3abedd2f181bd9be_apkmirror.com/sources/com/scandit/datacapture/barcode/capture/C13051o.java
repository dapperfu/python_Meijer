package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.capture.o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13051o extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeJsonValue f120584a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13051o(NativeJsonValue nativeJsonValue) {
        super(0);
        this.f120584a = nativeJsonValue;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CoreNativeTypeFactory.INSTANCE.convert(this.f120584a);
    }
}
