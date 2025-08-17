package com.scandit.datacapture.core.internal.sdk.ui.animation;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a/\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a/\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00040\u0006*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u000b"}, d2 = {"applySpec", "", "Landroid/view/View;", "spec", "Lcom/scandit/datacapture/core/internal/sdk/ui/animation/AnimationSpec;", "interpolateWith", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "input", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AnimationSpecKt {
    public static final Function1<Float, AnimationSpec> interpolateWith(AnimationSpec animationSpec, AnimationSpec spec) {
        Intrinsics.j(animationSpec, "<this>");
        Intrinsics.j(spec, "spec");
        return new a(new AnimationSpecInterpolator(animationSpec, spec));
    }

    public static final void applySpec(View view, AnimationSpec spec) {
        Intrinsics.j(view, "<this>");
        Intrinsics.j(spec, "spec");
        view.setAlpha(spec.getAlpha());
        view.setElevation(spec.getElevation());
        view.setScaleX(spec.getScale());
        view.setScaleY(spec.getScale());
        view.setTranslationY(spec.getTranslationY());
    }

    public static final Function1<Float, Unit> interpolateWith(View view, AnimationSpec spec) {
        Intrinsics.j(view, "<this>");
        Intrinsics.j(spec, "spec");
        return new b(view, interpolateWith(AnimationSpec.INSTANCE.fromView$scandit_capture_core(view), spec));
    }
}
