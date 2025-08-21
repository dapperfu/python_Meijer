package com.scandit.datacapture.core.internal.sdk.ui.hint;

import com.scandit.datacapture.core.internal.module.ui.hint.HintView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HintHolderV2Impl f126700a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(HintHolderV2Impl hintHolderV2Impl) {
        super(0);
        this.f126700a = hintHolderV2Impl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Map map = this.f126700a.f126680e;
        HintHolderV2Impl hintHolderV2Impl = this.f126700a;
        for (Map.Entry entry : map.entrySet()) {
            ((HintView) entry.getValue()).a((GuidanceHint) entry.getKey(), hintHolderV2Impl.getViewFinderRect());
        }
        return Unit.f143329a;
    }
}
