package com.scandit.datacapture.core.internal.module.ui.hint;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class m extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HintView f125274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f125275b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(HintView hintView, Function0 function0) {
        super(0);
        this.f125274a = hintView;
        this.f125275b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f125274a.setVisibility(4);
        this.f125275b.invoke();
        return Unit.f142422a;
    }
}
