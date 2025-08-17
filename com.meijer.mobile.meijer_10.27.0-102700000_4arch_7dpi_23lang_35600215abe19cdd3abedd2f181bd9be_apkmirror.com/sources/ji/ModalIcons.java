package ji;

import ji.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00010\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lji/T0;", "", "Lji/q1$h$b;", "warningIcon", "checkmarkSolidIcon", "<init>", "(Lji/q1$h$b;Lji/q1$h$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lji/q1$h$b;", "()Lji/q1$h$b;", "b", "getCheckmarkSolidIcon", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ji.T0, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class ModalIcons {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.h.DrawableIcon warningIcon;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.h.DrawableIcon checkmarkSolidIcon;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModalIcons)) {
            return false;
        }
        ModalIcons modalIcons = (ModalIcons) other;
        return Intrinsics.e(this.warningIcon, modalIcons.warningIcon) && Intrinsics.e(this.checkmarkSolidIcon, modalIcons.checkmarkSolidIcon);
    }

    public ModalIcons(q1.h.DrawableIcon warningIcon, q1.h.DrawableIcon checkmarkSolidIcon) {
        Intrinsics.j(warningIcon, "warningIcon");
        Intrinsics.j(checkmarkSolidIcon, "checkmarkSolidIcon");
        this.warningIcon = warningIcon;
        this.checkmarkSolidIcon = checkmarkSolidIcon;
    }

    /* renamed from: a, reason: from getter */
    public final q1.h.DrawableIcon getWarningIcon() {
        return this.warningIcon;
    }

    public int hashCode() {
        return (this.warningIcon.hashCode() * 31) + this.checkmarkSolidIcon.hashCode();
    }

    public String toString() {
        return "ModalIcons(warningIcon=" + this.warningIcon + ", checkmarkSolidIcon=" + this.checkmarkSolidIcon + ')';
    }
}
