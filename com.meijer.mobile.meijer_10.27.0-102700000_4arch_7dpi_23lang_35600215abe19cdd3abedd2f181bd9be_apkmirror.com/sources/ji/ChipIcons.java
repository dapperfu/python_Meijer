package ji;

import ji.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00010\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0019"}, d2 = {"Lji/k;", "", "Lji/q1$h$b;", "trailingEnabledIcon", "trailingDisabledIcon", "leadingEnabledIcon", "leadingDisabledIcon", "<init>", "(Lji/q1$h$b;Lji/q1$h$b;Lji/q1$h$b;Lji/q1$h$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lji/q1$h$b;", "d", "()Lji/q1$h$b;", "b", "c", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ji.k, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class ChipIcons {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.h.DrawableIcon trailingEnabledIcon;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.h.DrawableIcon trailingDisabledIcon;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.h.DrawableIcon leadingEnabledIcon;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.h.DrawableIcon leadingDisabledIcon;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChipIcons)) {
            return false;
        }
        ChipIcons chipIcons = (ChipIcons) other;
        return Intrinsics.e(this.trailingEnabledIcon, chipIcons.trailingEnabledIcon) && Intrinsics.e(this.trailingDisabledIcon, chipIcons.trailingDisabledIcon) && Intrinsics.e(this.leadingEnabledIcon, chipIcons.leadingEnabledIcon) && Intrinsics.e(this.leadingDisabledIcon, chipIcons.leadingDisabledIcon);
    }

    public ChipIcons(q1.h.DrawableIcon trailingEnabledIcon, q1.h.DrawableIcon trailingDisabledIcon, q1.h.DrawableIcon leadingEnabledIcon, q1.h.DrawableIcon leadingDisabledIcon) {
        Intrinsics.j(trailingEnabledIcon, "trailingEnabledIcon");
        Intrinsics.j(trailingDisabledIcon, "trailingDisabledIcon");
        Intrinsics.j(leadingEnabledIcon, "leadingEnabledIcon");
        Intrinsics.j(leadingDisabledIcon, "leadingDisabledIcon");
        this.trailingEnabledIcon = trailingEnabledIcon;
        this.trailingDisabledIcon = trailingDisabledIcon;
        this.leadingEnabledIcon = leadingEnabledIcon;
        this.leadingDisabledIcon = leadingDisabledIcon;
    }

    /* renamed from: a, reason: from getter */
    public final q1.h.DrawableIcon getLeadingDisabledIcon() {
        return this.leadingDisabledIcon;
    }

    /* renamed from: b, reason: from getter */
    public final q1.h.DrawableIcon getLeadingEnabledIcon() {
        return this.leadingEnabledIcon;
    }

    /* renamed from: c, reason: from getter */
    public final q1.h.DrawableIcon getTrailingDisabledIcon() {
        return this.trailingDisabledIcon;
    }

    /* renamed from: d, reason: from getter */
    public final q1.h.DrawableIcon getTrailingEnabledIcon() {
        return this.trailingEnabledIcon;
    }

    public int hashCode() {
        return (((((this.trailingEnabledIcon.hashCode() * 31) + this.trailingDisabledIcon.hashCode()) * 31) + this.leadingEnabledIcon.hashCode()) * 31) + this.leadingDisabledIcon.hashCode();
    }

    public String toString() {
        return "ChipIcons(trailingEnabledIcon=" + this.trailingEnabledIcon + ", trailingDisabledIcon=" + this.trailingDisabledIcon + ", leadingEnabledIcon=" + this.leadingEnabledIcon + ", leadingDisabledIcon=" + this.leadingDisabledIcon + ')';
    }
}
