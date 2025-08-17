package com.scandit.datacapture.core.internal.module.ui.hint;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.scandit.datacapture.core.internal.module.ui.hint.B;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class B extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f125235a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnimatedVectorDrawable f125236b;

    public B(ImageView imageView, AnimatedVectorDrawable animatedVectorDrawable) {
        this.f125235a = imageView;
        this.f125236b = animatedVectorDrawable;
    }

    public static final void a(AnimatedVectorDrawable animation) {
        Intrinsics.j(animation, "$animation");
        animation.start();
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ImageView imageView = this.f125235a;
        final AnimatedVectorDrawable animatedVectorDrawable = this.f125236b;
        imageView.post(new Runnable() { // from class: fu.a
            @Override // java.lang.Runnable
            public final void run() {
                B.a(animatedVectorDrawable);
            }
        });
    }
}
