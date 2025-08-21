package com.scandit.datacapture.core.internal.sdk.ui.animation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u0000 #2\u00020\u0001:\u0001#B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\n¨\u0006$"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/animation/AnimationSpec;", "", "", "alpha", "elevation", "scale", "translationY", "<init>", "(FFFF)V", "component1", "()F", "component2", "component3", "component4", "copy", "(FFFF)Lcom/scandit/datacapture/core/internal/sdk/ui/animation/AnimationSpec;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getAlpha", "b", "getElevation", "c", "getScale", "d", "getTranslationY", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final /* data */ class AnimationSpec {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float alpha;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float elevation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float scale;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float translationY;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/animation/AnimationSpec$Companion;", "", "Landroid/view/View;", "view", "Lcom/scandit/datacapture/core/internal/sdk/ui/animation/AnimationSpec;", "fromView$scandit_capture_core", "(Landroid/view/View;)Lcom/scandit/datacapture/core/internal/sdk/ui/animation/AnimationSpec;", "fromView", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public final AnimationSpec fromView$scandit_capture_core(View view) {
            Intrinsics.j(view, "view");
            return new AnimationSpec(view.getAlpha(), view.getElevation(), view.getScaleX(), view.getTranslationY());
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static /* synthetic */ AnimationSpec copy$default(AnimationSpec animationSpec, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = animationSpec.alpha;
        }
        if ((i10 & 2) != 0) {
            f11 = animationSpec.elevation;
        }
        if ((i10 & 4) != 0) {
            f12 = animationSpec.scale;
        }
        if ((i10 & 8) != 0) {
            f13 = animationSpec.translationY;
        }
        return animationSpec.copy(f10, f11, f12, f13);
    }

    /* renamed from: component1, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* renamed from: component2, reason: from getter */
    public final float getElevation() {
        return this.elevation;
    }

    /* renamed from: component3, reason: from getter */
    public final float getScale() {
        return this.scale;
    }

    /* renamed from: component4, reason: from getter */
    public final float getTranslationY() {
        return this.translationY;
    }

    public final AnimationSpec copy(float alpha, float elevation, float scale, float translationY) {
        return new AnimationSpec(alpha, elevation, scale, translationY);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimationSpec)) {
            return false;
        }
        AnimationSpec animationSpec = (AnimationSpec) other;
        return Float.compare(this.alpha, animationSpec.alpha) == 0 && Float.compare(this.elevation, animationSpec.elevation) == 0 && Float.compare(this.scale, animationSpec.scale) == 0 && Float.compare(this.translationY, animationSpec.translationY) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.translationY) + ((Float.hashCode(this.scale) + ((Float.hashCode(this.elevation) + (Float.hashCode(this.alpha) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "AnimationSpec(alpha=" + this.alpha + ", elevation=" + this.elevation + ", scale=" + this.scale + ", translationY=" + this.translationY + ')';
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final float getElevation() {
        return this.elevation;
    }

    public final float getScale() {
        return this.scale;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public AnimationSpec(float f10, float f11, float f12, float f13) {
        this.alpha = f10;
        this.elevation = f11;
        this.scale = f12;
        this.translationY = f13;
    }
}
