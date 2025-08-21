package com.scandit.datacapture.core.internal.sdk.ui.hint;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HintHolderV2Impl f126701a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ToastHint f126702b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(HintHolderV2Impl hintHolderV2Impl, ToastHint toastHint) {
        super(0);
        this.f126701a = hintHolderV2Impl;
        this.f126702b = toastHint;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        HideHintListener hideHintListener = this.f126701a.getHideHintListener();
        if (hideHintListener != null) {
            hideHintListener.userWantsToHideToast(this.f126702b);
        }
        return Unit.f143329a;
    }
}
