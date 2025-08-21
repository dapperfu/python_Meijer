package com.scandit.datacapture.barcode.internal.module.ui.shutterbutton;

import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c f124363a = new c();

    public c() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Integer.valueOf(View.generateViewId());
    }
}
