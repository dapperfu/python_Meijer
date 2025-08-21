package com.scandit.datacapture.core.internal.sdk.ui.animation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnimationSpecInterpolator f126498a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AnimationSpecInterpolator animationSpecInterpolator) {
        super(1);
        this.f126498a = animationSpecInterpolator;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return this.f126498a.getInterpolation(((Number) obj).floatValue());
    }
}
