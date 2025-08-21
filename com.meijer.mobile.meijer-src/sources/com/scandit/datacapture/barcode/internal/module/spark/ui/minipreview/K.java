package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanViewDefaults;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* loaded from: classes12.dex */
public final class K extends ObservableProperty {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f124121a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(Integer num, N n10) {
        super(num);
        this.f124121a = n10;
    }

    @Override // kotlin.properties.ObservableProperty
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        int iIntValue;
        Intrinsics.j(property, "property");
        if (Intrinsics.e(obj, obj2)) {
            return;
        }
        N n10 = this.f124121a;
        Integer num = (Integer) n10.f124138n.getValue(n10, N.f124124q[0]);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            NativeColor nativeColorDefaultToolbarBackgroundColor = NativeSparkScanViewDefaults.defaultToolbarBackgroundColor();
            Intrinsics.i(nativeColorDefaultToolbarBackgroundColor, "defaultToolbarBackgroundColor(...)");
            iIntValue = NativeColorExtensionsKt.toInt(nativeColorDefaultToolbarBackgroundColor);
        }
        n10.setBackgroundColor(iIntValue);
    }
}
