package com.scandit.datacapture.core.internal.sdk.ui.hint;

import com.scandit.datacapture.core.internal.module.ui.hint.HintView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HintHolderV2Impl f125743a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HintView f125744b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ToastHint f125745c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(HintHolderV2Impl hintHolderV2Impl, HintView hintView, ToastHint toastHint) {
        super(0);
        this.f125743a = hintHolderV2Impl;
        this.f125744b = hintView;
        this.f125745c = toastHint;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f125743a.removeView(this.f125744b);
        this.f125743a.f125727d.remove(this.f125745c);
        Map map = this.f125743a.f125728e;
        HintHolderV2Impl hintHolderV2Impl = this.f125743a;
        for (Map.Entry entry : map.entrySet()) {
            ((HintView) entry.getValue()).a((GuidanceHint) entry.getKey(), hintHolderV2Impl.getViewFinderRect());
        }
        return Unit.f142422a;
    }
}
