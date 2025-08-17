package ji;

import ji.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00010\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0019"}, d2 = {"Lji/j;", "", "Lji/q1$d$a;", "enabledResting", "disabledResting", "enabledSelected", "disabledSelected", "<init>", "(Lji/q1$d$a;Lji/q1$d$a;Lji/q1$d$a;Lji/q1$d$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lji/q1$d$a;", "c", "()Lji/q1$d$a;", "b", "d", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ji.j, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class ChipButtons {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.d.ChipButton enabledResting;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.d.ChipButton disabledResting;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.d.ChipButton enabledSelected;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.d.ChipButton disabledSelected;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChipButtons)) {
            return false;
        }
        ChipButtons chipButtons = (ChipButtons) other;
        return Intrinsics.e(this.enabledResting, chipButtons.enabledResting) && Intrinsics.e(this.disabledResting, chipButtons.disabledResting) && Intrinsics.e(this.enabledSelected, chipButtons.enabledSelected) && Intrinsics.e(this.disabledSelected, chipButtons.disabledSelected);
    }

    public ChipButtons(q1.d.ChipButton enabledResting, q1.d.ChipButton disabledResting, q1.d.ChipButton enabledSelected, q1.d.ChipButton disabledSelected) {
        Intrinsics.j(enabledResting, "enabledResting");
        Intrinsics.j(disabledResting, "disabledResting");
        Intrinsics.j(enabledSelected, "enabledSelected");
        Intrinsics.j(disabledSelected, "disabledSelected");
        this.enabledResting = enabledResting;
        this.disabledResting = disabledResting;
        this.enabledSelected = enabledSelected;
        this.disabledSelected = disabledSelected;
    }

    /* renamed from: a, reason: from getter */
    public final q1.d.ChipButton getDisabledResting() {
        return this.disabledResting;
    }

    /* renamed from: b, reason: from getter */
    public final q1.d.ChipButton getDisabledSelected() {
        return this.disabledSelected;
    }

    /* renamed from: c, reason: from getter */
    public final q1.d.ChipButton getEnabledResting() {
        return this.enabledResting;
    }

    /* renamed from: d, reason: from getter */
    public final q1.d.ChipButton getEnabledSelected() {
        return this.enabledSelected;
    }

    public int hashCode() {
        return (((((this.enabledResting.hashCode() * 31) + this.disabledResting.hashCode()) * 31) + this.enabledSelected.hashCode()) * 31) + this.disabledSelected.hashCode();
    }

    public String toString() {
        return "ChipButtons(enabledResting=" + this.enabledResting + ", disabledResting=" + this.disabledResting + ", enabledSelected=" + this.enabledSelected + ", disabledSelected=" + this.disabledSelected + ')';
    }
}
