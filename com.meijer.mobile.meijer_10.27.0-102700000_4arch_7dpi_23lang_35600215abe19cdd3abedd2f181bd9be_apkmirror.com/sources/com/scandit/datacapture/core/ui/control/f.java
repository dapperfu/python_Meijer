package com.scandit.datacapture.core.ui.control;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class f extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinearControlGroup f126072a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(LinearControlGroup linearControlGroup) {
        super(0);
        this.f126072a = linearControlGroup;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return LinearControlGroup.access$createView(this.f126072a);
    }
}
