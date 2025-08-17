package androidx.compose.animation;

import kotlin.ChangeSize;
import kotlin.Fade;
import kotlin.Metadata;
import kotlin.Scale;
import kotlin.Slide;
import kotlin.TransitionData;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118 X \u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0001\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/animation/h;", "", "<init>", "()V", "enter", "c", "(Landroidx/compose/animation/h;)Landroidx/compose/animation/h;", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lb0/z;", "b", "()Lb0/z;", "data", "a", "Landroidx/compose/animation/i;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static final h f47875b = new i(new TransitionData(null, null, null, null, false, null, 63, null));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/animation/h$a;", "", "<init>", "()V", "Landroidx/compose/animation/h;", "None", "Landroidx/compose/animation/h;", "a", "()Landroidx/compose/animation/h;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.animation.h$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final h a() {
            return h.f47875b;
        }
    }

    public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract TransitionData b();

    private h() {
    }

    public final h c(h enter) {
        Fade fade = enter.b().getFade();
        if (fade == null) {
            fade = b().getFade();
        }
        Slide slide = enter.b().getSlide();
        if (slide == null) {
            slide = b().getSlide();
        }
        ChangeSize changeSize = enter.b().getChangeSize();
        if (changeSize == null) {
            changeSize = b().getChangeSize();
        }
        Scale scale = enter.b().getScale();
        if (scale == null) {
            scale = b().getScale();
        }
        return new i(new TransitionData(fade, slide, changeSize, scale, false, MapsKt.u(b().b(), enter.b().b()), 16, null));
    }

    public boolean equals(Object other) {
        return (other instanceof h) && Intrinsics.e(((h) other).b(), b());
    }

    public String toString() {
        if (Intrinsics.e(this, f47875b)) {
            return "EnterTransition.None";
        }
        TransitionData transitionDataB = b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("EnterTransition: \nFade - ");
        Fade fade = transitionDataB.getFade();
        sb2.append(fade != null ? fade.toString() : null);
        sb2.append(",\nSlide - ");
        Slide slide = transitionDataB.getSlide();
        sb2.append(slide != null ? slide.toString() : null);
        sb2.append(",\nShrink - ");
        ChangeSize changeSize = transitionDataB.getChangeSize();
        sb2.append(changeSize != null ? changeSize.toString() : null);
        sb2.append(",\nScale - ");
        Scale scale = transitionDataB.getScale();
        sb2.append(scale != null ? scale.toString() : null);
        return sb2.toString();
    }

    public int hashCode() {
        return b().hashCode();
    }
}
