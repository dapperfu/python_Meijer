package ji;

import ji.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00010\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, d2 = {"Lji/F;", "", "Lji/q1$h$b;", "destructiveIcon", "enabledIcon", "disabledIcon", "<init>", "(Lji/q1$h$b;Lji/q1$h$b;Lji/q1$h$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lji/q1$h$b;", "()Lji/q1$h$b;", "b", "c", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ji.F, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class StandardIcons {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.h.DrawableIcon destructiveIcon;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.h.DrawableIcon enabledIcon;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.h.DrawableIcon disabledIcon;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StandardIcons)) {
            return false;
        }
        StandardIcons standardIcons = (StandardIcons) other;
        return Intrinsics.e(this.destructiveIcon, standardIcons.destructiveIcon) && Intrinsics.e(this.enabledIcon, standardIcons.enabledIcon) && Intrinsics.e(this.disabledIcon, standardIcons.disabledIcon);
    }

    public StandardIcons(q1.h.DrawableIcon destructiveIcon, q1.h.DrawableIcon enabledIcon, q1.h.DrawableIcon disabledIcon) {
        Intrinsics.j(destructiveIcon, "destructiveIcon");
        Intrinsics.j(enabledIcon, "enabledIcon");
        Intrinsics.j(disabledIcon, "disabledIcon");
        this.destructiveIcon = destructiveIcon;
        this.enabledIcon = enabledIcon;
        this.disabledIcon = disabledIcon;
    }

    /* renamed from: a, reason: from getter */
    public final q1.h.DrawableIcon getDestructiveIcon() {
        return this.destructiveIcon;
    }

    /* renamed from: b, reason: from getter */
    public final q1.h.DrawableIcon getDisabledIcon() {
        return this.disabledIcon;
    }

    /* renamed from: c, reason: from getter */
    public final q1.h.DrawableIcon getEnabledIcon() {
        return this.enabledIcon;
    }

    public int hashCode() {
        return (((this.destructiveIcon.hashCode() * 31) + this.enabledIcon.hashCode()) * 31) + this.disabledIcon.hashCode();
    }

    public String toString() {
        return "StandardIcons(destructiveIcon=" + this.destructiveIcon + ", enabledIcon=" + this.enabledIcon + ", disabledIcon=" + this.disabledIcon + ')';
    }
}
