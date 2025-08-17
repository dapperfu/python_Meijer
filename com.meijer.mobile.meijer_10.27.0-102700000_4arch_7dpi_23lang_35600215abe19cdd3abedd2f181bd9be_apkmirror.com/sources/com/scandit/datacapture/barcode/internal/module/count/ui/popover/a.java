package com.scandit.datacapture.barcode.internal.module.count.ui.popover;

import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.Q;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.S;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f121762a = new a();

    public a() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        S.f121408a.getClass();
        return Float.valueOf((((Number) Q.f121407b.getValue()).floatValue() / 1.5f) / 2);
    }
}
