package com.scandit.datacapture.core.internal.sdk.ui.hint;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HintHolderV2Impl f126698a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GuidanceHint f126699b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(HintHolderV2Impl hintHolderV2Impl, GuidanceHint guidanceHint) {
        super(0);
        this.f126698a = hintHolderV2Impl;
        this.f126699b = guidanceHint;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        HideHintListener hideHintListener = this.f126698a.getHideHintListener();
        if (hideHintListener != null) {
            hideHintListener.userWantsToHideGuidance(this.f126699b);
        }
        return Unit.f143329a;
    }
}
