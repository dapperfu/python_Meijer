package com.scandit.datacapture.core.internal.module.ui.hint;

import com.scandit.datacapture.core.ui.animation.DynamicAnimation;
import com.scandit.datacapture.core.ui.animation.SpringAnimation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes12.dex */
public final class h implements DynamicAnimation.OnAnimationEndListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SpringAnimation f126215a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f126216b;

    public h(SpringAnimation springAnimation, C13514e c13514e) {
        this.f126215a = springAnimation;
        this.f126216b = c13514e;
    }

    @Override // com.scandit.datacapture.core.ui.animation.DynamicAnimation.OnAnimationEndListener
    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z10, float f10, float f11) {
        this.f126215a.removeEndListener(this);
        this.f126216b.invoke();
    }
}
