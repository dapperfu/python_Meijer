package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class T extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final T f122361a = new T();

    public T() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String utf8String = ((NativeBarcode) obj).getUtf8String();
        Intrinsics.i(utf8String, "getUtf8String(...)");
        return utf8String;
    }
}
