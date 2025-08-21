package com.scandit.datacapture.core.internal.module.ui.hint;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.scandit.datacapture.core.internal.module.ui.hint.B;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class B extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f126187a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnimatedVectorDrawable f126188b;

    public B(ImageView imageView, AnimatedVectorDrawable animatedVectorDrawable) {
        this.f126187a = imageView;
        this.f126188b = animatedVectorDrawable;
    }

    public static final void a(AnimatedVectorDrawable animation) {
        Intrinsics.j(animation, "$animation");
        animation.start();
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ImageView imageView = this.f126187a;
        final AnimatedVectorDrawable animatedVectorDrawable = this.f126188b;
        imageView.post(new Runnable() { // from class: fu.a
            @Override // java.lang.Runnable
            public final void run() {
                B.a(animatedVectorDrawable);
            }
        });
    }
}
