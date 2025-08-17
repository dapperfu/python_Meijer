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

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118 X \u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0001\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/animation/j;", "", "<init>", "()V", "exit", "c", "(Landroidx/compose/animation/j;)Landroidx/compose/animation/j;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "Lb0/z;", "b", "()Lb0/z;", "data", "a", "Landroidx/compose/animation/k;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static final j f47878b = new k(new TransitionData(null, null, null, null, false, null, 63, null));

    /* renamed from: c, reason: collision with root package name */
    private static final j f47879c = new k(new TransitionData(null, null, null, null, true, null, 47, null));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/animation/j$a;", "", "<init>", "()V", "Landroidx/compose/animation/j;", "None", "Landroidx/compose/animation/j;", "a", "()Landroidx/compose/animation/j;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.animation.j$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final j a() {
            return j.f47878b;
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract TransitionData b();

    private j() {
    }

    public final j c(j exit) {
        Fade fade = exit.b().getFade();
        if (fade == null) {
            fade = b().getFade();
        }
        Slide slide = exit.b().getSlide();
        if (slide == null) {
            slide = b().getSlide();
        }
        ChangeSize changeSize = exit.b().getChangeSize();
        if (changeSize == null) {
            changeSize = b().getChangeSize();
        }
        Scale scale = exit.b().getScale();
        if (scale == null) {
            scale = b().getScale();
        }
        return new k(new TransitionData(fade, slide, changeSize, scale, exit.b().getHold() || b().getHold(), MapsKt.u(b().b(), exit.b().b())));
    }

    public boolean equals(Object other) {
        return (other instanceof j) && Intrinsics.e(((j) other).b(), b());
    }

    public String toString() {
        if (Intrinsics.e(this, f47878b)) {
            return "ExitTransition.None";
        }
        if (Intrinsics.e(this, f47879c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        TransitionData transitionDataB = b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ExitTransition: \nFade - ");
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
        sb2.append(",\nKeepUntilTransitionsFinished - ");
        sb2.append(transitionDataB.getHold());
        return sb2.toString();
    }

    public int hashCode() {
        return b().hashCode();
    }
}
