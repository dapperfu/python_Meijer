package com.scandit.datacapture.core.internal.sdk.ui.hint;

import com.scandit.datacapture.core.internal.module.ui.hint.HintView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HintHolderV2Impl f125748a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(HintHolderV2Impl hintHolderV2Impl) {
        super(0);
        this.f125748a = hintHolderV2Impl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Map map = this.f125748a.f125728e;
        HintHolderV2Impl hintHolderV2Impl = this.f125748a;
        for (Map.Entry entry : map.entrySet()) {
            ((HintView) entry.getValue()).a((GuidanceHint) entry.getKey(), hintHolderV2Impl.getViewFinderRect());
        }
        return Unit.f142422a;
    }
}
