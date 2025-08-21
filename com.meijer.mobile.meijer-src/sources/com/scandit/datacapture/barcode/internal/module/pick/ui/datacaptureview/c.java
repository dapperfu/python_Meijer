package com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview;

import android.content.Context;
import com.scandit.datacapture.core.ui.control.LinearControlGroup;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f123439a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(0);
        this.f123439a = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return LinearControlGroup.INSTANCE.builder(this.f123439a);
    }
}
