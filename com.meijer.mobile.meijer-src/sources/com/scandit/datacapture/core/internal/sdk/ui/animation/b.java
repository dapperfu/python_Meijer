package com.scandit.datacapture.core.internal.sdk.ui.animation;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f126499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f126500b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view, Function1 function1) {
        super(1);
        this.f126499a = view;
        this.f126500b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AnimationSpecKt.applySpec(this.f126499a, (AnimationSpec) this.f126500b.invoke(Float.valueOf(((Number) obj).floatValue())));
        return Unit.f143329a;
    }
}
