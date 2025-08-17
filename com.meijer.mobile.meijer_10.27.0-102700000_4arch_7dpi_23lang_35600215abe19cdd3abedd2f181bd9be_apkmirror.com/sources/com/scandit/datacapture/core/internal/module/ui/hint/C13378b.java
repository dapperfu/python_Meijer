package com.scandit.datacapture.core.internal.module.ui.hint;

import android.widget.TextView;
import com.scandit.datacapture.core.ui.animation.DynamicAnimation;
import com.scandit.datacapture.core.ui.animation.SpringAnimation;
import com.scandit.datacapture.core.ui.animation.SpringForce;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.module.ui.hint.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13378b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f125257a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13378b(j jVar) {
        super(0);
        this.f125257a = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SpringAnimation springAnimation = new SpringAnimation((TextView) this.f125257a.f125266a.getValue(), DynamicAnimation.ALPHA);
        SpringForce springForce = new SpringForce();
        springForce.setDampingRatio(1.0f);
        springForce.setStiffness(200.0f);
        springAnimation.setSpring(springForce);
        springAnimation.setStartValue(0.0f);
        return springAnimation;
    }
}
