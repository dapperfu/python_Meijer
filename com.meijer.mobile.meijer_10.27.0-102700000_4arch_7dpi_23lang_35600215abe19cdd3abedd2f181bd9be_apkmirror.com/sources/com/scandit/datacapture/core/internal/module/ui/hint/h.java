package com.scandit.datacapture.core.internal.module.ui.hint;

import com.scandit.datacapture.core.ui.animation.DynamicAnimation;
import com.scandit.datacapture.core.ui.animation.SpringAnimation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes11.dex */
public final class h implements DynamicAnimation.OnAnimationEndListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SpringAnimation f125263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f125264b;

    public h(SpringAnimation springAnimation, C13381e c13381e) {
        this.f125263a = springAnimation;
        this.f125264b = c13381e;
    }

    @Override // com.scandit.datacapture.core.ui.animation.DynamicAnimation.OnAnimationEndListener
    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z10, float f10, float f11) {
        this.f125263a.removeEndListener(this);
        this.f125264b.invoke();
    }
}
