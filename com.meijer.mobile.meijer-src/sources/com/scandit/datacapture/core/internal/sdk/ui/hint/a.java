package com.scandit.datacapture.core.internal.sdk.ui.hint;

import com.scandit.datacapture.core.internal.module.ui.hint.HintView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HintHolderV2Impl f126692a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HintView f126693b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GuidanceHint f126694c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(HintHolderV2Impl hintHolderV2Impl, HintView hintView, GuidanceHint guidanceHint) {
        super(0);
        this.f126692a = hintHolderV2Impl;
        this.f126693b = hintView;
        this.f126694c = guidanceHint;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f126692a.removeView(this.f126693b);
        this.f126692a.f126680e.remove(this.f126694c);
        return Unit.f143329a;
    }
}
