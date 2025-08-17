package com.scandit.datacapture.core.internal.sdk.ui.hint;

import com.scandit.datacapture.core.common.geometry.Rect;
import com.scandit.datacapture.core.internal.module.ui.hint.HintView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class f extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HintHolderV2Impl f125751a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rect f125752b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(HintHolderV2Impl hintHolderV2Impl, Rect rect) {
        super(1);
        this.f125751a = hintHolderV2Impl;
        this.f125752b = rect;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HintHolderV2Impl it = (HintHolderV2Impl) obj;
        Intrinsics.j(it, "it");
        Map map = this.f125751a.f125727d;
        Rect rect = this.f125752b;
        for (Map.Entry entry : map.entrySet()) {
            ToastHint toast = (ToastHint) entry.getKey();
            HintView hintView = (HintView) entry.getValue();
            hintView.getClass();
            Intrinsics.j(toast, "toast");
            hintView.b(toast.getHintStyle(), rect, false);
        }
        Map map2 = this.f125751a.f125728e;
        Rect rect2 = this.f125752b;
        for (Map.Entry entry2 : map2.entrySet()) {
            GuidanceHint guidance = (GuidanceHint) entry2.getKey();
            HintView hintView2 = (HintView) entry2.getValue();
            hintView2.getClass();
            Intrinsics.j(guidance, "guidance");
            hintView2.b(guidance.getHintStyle(), rect2, true);
        }
        return Unit.f142422a;
    }
}
