package com.scandit.datacapture.core.internal.module.ui.hint;

import android.widget.TextView;
import com.scandit.datacapture.core.ui.animation.DynamicAnimation;
import com.scandit.datacapture.core.ui.animation.SpringAnimation;
import com.scandit.datacapture.core.ui.animation.SpringForce;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class i extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f126217a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar) {
        super(0);
        this.f126217a = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SpringAnimation springAnimation = new SpringAnimation((TextView) this.f126217a.f126218a.getValue(), DynamicAnimation.f126929Y);
        j jVar = this.f126217a;
        SpringForce springForce = new SpringForce();
        springForce.setDampingRatio(1.0f);
        springForce.setStiffness(200.0f);
        springAnimation.setSpring(springForce);
        springAnimation.setStartValue(((Number) jVar.f126219b.getValue()).floatValue());
        return springAnimation;
    }
}
