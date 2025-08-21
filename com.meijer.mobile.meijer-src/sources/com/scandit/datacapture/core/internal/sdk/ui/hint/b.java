package com.scandit.datacapture.core.internal.sdk.ui.hint;

import com.scandit.datacapture.core.internal.module.ui.hint.HintView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HintHolderV2Impl f126695a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HintView f126696b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ToastHint f126697c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(HintHolderV2Impl hintHolderV2Impl, HintView hintView, ToastHint toastHint) {
        super(0);
        this.f126695a = hintHolderV2Impl;
        this.f126696b = hintView;
        this.f126697c = toastHint;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f126695a.removeView(this.f126696b);
        this.f126695a.f126679d.remove(this.f126697c);
        Map map = this.f126695a.f126680e;
        HintHolderV2Impl hintHolderV2Impl = this.f126695a;
        for (Map.Entry entry : map.entrySet()) {
            ((HintView) entry.getValue()).a((GuidanceHint) entry.getKey(), hintHolderV2Impl.getViewFinderRect());
        }
        return Unit.f143329a;
    }
}
