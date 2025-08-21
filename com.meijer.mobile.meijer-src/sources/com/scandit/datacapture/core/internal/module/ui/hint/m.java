package com.scandit.datacapture.core.internal.module.ui.hint;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class m extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HintView f126226a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f126227b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(HintView hintView, Function0 function0) {
        super(0);
        this.f126226a = hintView;
        this.f126227b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f126226a.setVisibility(4);
        this.f126227b.invoke();
        return Unit.f143329a;
    }
}
