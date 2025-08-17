package com.scandit.datacapture.core.internal.sdk.ui.hint;

import com.scandit.datacapture.core.internal.module.ui.hint.HintView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HintHolderV2Impl f125740a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HintView f125741b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GuidanceHint f125742c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(HintHolderV2Impl hintHolderV2Impl, HintView hintView, GuidanceHint guidanceHint) {
        super(0);
        this.f125740a = hintHolderV2Impl;
        this.f125741b = hintView;
        this.f125742c = guidanceHint;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f125740a.removeView(this.f125741b);
        this.f125740a.f125728e.remove(this.f125742c);
        return Unit.f142422a;
    }
}
