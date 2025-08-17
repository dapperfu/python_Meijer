package kotlin;

import kotlin.InterfaceC6293F;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lb0/m;", "", "", "alpha", "Lc0/F;", "animationSpec", "<init>", "(FLc0/F;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "b", "Lc0/F;", "()Lc0/F;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: b0.m, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final /* data */ class Fade {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float alpha;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC6293F<Float> animationSpec;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Fade)) {
            return false;
        }
        Fade fade = (Fade) other;
        return Float.compare(this.alpha, fade.alpha) == 0 && Intrinsics.e(this.animationSpec, fade.animationSpec);
    }

    /* renamed from: a, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    public final InterfaceC6293F<Float> b() {
        return this.animationSpec;
    }

    public int hashCode() {
        return (Float.hashCode(this.alpha) * 31) + this.animationSpec.hashCode();
    }

    public String toString() {
        return "Fade(alpha=" + this.alpha + ", animationSpec=" + this.animationSpec + ')';
    }

    public Fade(float f10, InterfaceC6293F<Float> interfaceC6293F) {
        this.alpha = f10;
        this.animationSpec = interfaceC6293F;
    }
}
