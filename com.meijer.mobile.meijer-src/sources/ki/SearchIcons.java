package ki;

import ki.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00010\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0019"}, d2 = {"Lki/O0;", "", "Lki/q1$h$b;", "innerIcon", "inverseInnerIcon", "outerIcon", "disabledIcon", "<init>", "(Lki/q1$h$b;Lki/q1$h$b;Lki/q1$h$b;Lki/q1$h$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lki/q1$h$b;", "b", "()Lki/q1$h$b;", "c", "d", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ki.O0, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class SearchIcons {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.h.DrawableIcon innerIcon;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.h.DrawableIcon inverseInnerIcon;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.h.DrawableIcon outerIcon;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.h.DrawableIcon disabledIcon;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchIcons)) {
            return false;
        }
        SearchIcons searchIcons = (SearchIcons) other;
        return Intrinsics.e(this.innerIcon, searchIcons.innerIcon) && Intrinsics.e(this.inverseInnerIcon, searchIcons.inverseInnerIcon) && Intrinsics.e(this.outerIcon, searchIcons.outerIcon) && Intrinsics.e(this.disabledIcon, searchIcons.disabledIcon);
    }

    public SearchIcons(q1.h.DrawableIcon innerIcon, q1.h.DrawableIcon inverseInnerIcon, q1.h.DrawableIcon outerIcon, q1.h.DrawableIcon disabledIcon) {
        Intrinsics.j(innerIcon, "innerIcon");
        Intrinsics.j(inverseInnerIcon, "inverseInnerIcon");
        Intrinsics.j(outerIcon, "outerIcon");
        Intrinsics.j(disabledIcon, "disabledIcon");
        this.innerIcon = innerIcon;
        this.inverseInnerIcon = inverseInnerIcon;
        this.outerIcon = outerIcon;
        this.disabledIcon = disabledIcon;
    }

    /* renamed from: a, reason: from getter */
    public final q1.h.DrawableIcon getDisabledIcon() {
        return this.disabledIcon;
    }

    /* renamed from: b, reason: from getter */
    public final q1.h.DrawableIcon getInnerIcon() {
        return this.innerIcon;
    }

    /* renamed from: c, reason: from getter */
    public final q1.h.DrawableIcon getInverseInnerIcon() {
        return this.inverseInnerIcon;
    }

    /* renamed from: d, reason: from getter */
    public final q1.h.DrawableIcon getOuterIcon() {
        return this.outerIcon;
    }

    public int hashCode() {
        return (((((this.innerIcon.hashCode() * 31) + this.inverseInnerIcon.hashCode()) * 31) + this.outerIcon.hashCode()) * 31) + this.disabledIcon.hashCode();
    }

    public String toString() {
        return "SearchIcons(innerIcon=" + this.innerIcon + ", inverseInnerIcon=" + this.inverseInnerIcon + ", outerIcon=" + this.outerIcon + ", disabledIcon=" + this.disabledIcon + ')';
    }
}
