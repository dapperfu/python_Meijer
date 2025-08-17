package ji;

import ji.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00010\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0019"}, d2 = {"Lji/l;", "", "Lji/q1$j;", "enabledRestingLabel", "disabledRestingLabel", "enabledSelectedLabel", "disabledSelectedLabel", "<init>", "(Lji/q1$j;Lji/q1$j;Lji/q1$j;Lji/q1$j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lji/q1$j;", "c", "()Lji/q1$j;", "b", "d", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ji.l, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class ChipLabels {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.Label enabledRestingLabel;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.Label disabledRestingLabel;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.Label enabledSelectedLabel;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.Label disabledSelectedLabel;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChipLabels)) {
            return false;
        }
        ChipLabels chipLabels = (ChipLabels) other;
        return Intrinsics.e(this.enabledRestingLabel, chipLabels.enabledRestingLabel) && Intrinsics.e(this.disabledRestingLabel, chipLabels.disabledRestingLabel) && Intrinsics.e(this.enabledSelectedLabel, chipLabels.enabledSelectedLabel) && Intrinsics.e(this.disabledSelectedLabel, chipLabels.disabledSelectedLabel);
    }

    public ChipLabels(q1.Label enabledRestingLabel, q1.Label disabledRestingLabel, q1.Label enabledSelectedLabel, q1.Label disabledSelectedLabel) {
        Intrinsics.j(enabledRestingLabel, "enabledRestingLabel");
        Intrinsics.j(disabledRestingLabel, "disabledRestingLabel");
        Intrinsics.j(enabledSelectedLabel, "enabledSelectedLabel");
        Intrinsics.j(disabledSelectedLabel, "disabledSelectedLabel");
        this.enabledRestingLabel = enabledRestingLabel;
        this.disabledRestingLabel = disabledRestingLabel;
        this.enabledSelectedLabel = enabledSelectedLabel;
        this.disabledSelectedLabel = disabledSelectedLabel;
    }

    /* renamed from: a, reason: from getter */
    public final q1.Label getDisabledRestingLabel() {
        return this.disabledRestingLabel;
    }

    /* renamed from: b, reason: from getter */
    public final q1.Label getDisabledSelectedLabel() {
        return this.disabledSelectedLabel;
    }

    /* renamed from: c, reason: from getter */
    public final q1.Label getEnabledRestingLabel() {
        return this.enabledRestingLabel;
    }

    /* renamed from: d, reason: from getter */
    public final q1.Label getEnabledSelectedLabel() {
        return this.enabledSelectedLabel;
    }

    public int hashCode() {
        return (((((this.enabledRestingLabel.hashCode() * 31) + this.disabledRestingLabel.hashCode()) * 31) + this.enabledSelectedLabel.hashCode()) * 31) + this.disabledSelectedLabel.hashCode();
    }

    public String toString() {
        return "ChipLabels(enabledRestingLabel=" + this.enabledRestingLabel + ", disabledRestingLabel=" + this.disabledRestingLabel + ", enabledSelectedLabel=" + this.enabledSelectedLabel + ", disabledSelectedLabel=" + this.disabledSelectedLabel + ')';
    }
}
