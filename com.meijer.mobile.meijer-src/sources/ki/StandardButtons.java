package ki;

import ki.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00010\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0019"}, d2 = {"Lki/E;", "", "Lki/q1$d$d;", "destructiveButton", "enabledButton", "enabledAlternateButton", "disabledButton", "<init>", "(Lki/q1$d$d;Lki/q1$d$d;Lki/q1$d$d;Lki/q1$d$d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lki/q1$d$d;", "()Lki/q1$d$d;", "b", "d", "c", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ki.E, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class StandardButtons {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.d.StandardButton destructiveButton;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.d.StandardButton enabledButton;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.d.StandardButton enabledAlternateButton;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.d.StandardButton disabledButton;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StandardButtons)) {
            return false;
        }
        StandardButtons standardButtons = (StandardButtons) other;
        return Intrinsics.e(this.destructiveButton, standardButtons.destructiveButton) && Intrinsics.e(this.enabledButton, standardButtons.enabledButton) && Intrinsics.e(this.enabledAlternateButton, standardButtons.enabledAlternateButton) && Intrinsics.e(this.disabledButton, standardButtons.disabledButton);
    }

    public StandardButtons(q1.d.StandardButton destructiveButton, q1.d.StandardButton enabledButton, q1.d.StandardButton enabledAlternateButton, q1.d.StandardButton disabledButton) {
        Intrinsics.j(destructiveButton, "destructiveButton");
        Intrinsics.j(enabledButton, "enabledButton");
        Intrinsics.j(enabledAlternateButton, "enabledAlternateButton");
        Intrinsics.j(disabledButton, "disabledButton");
        this.destructiveButton = destructiveButton;
        this.enabledButton = enabledButton;
        this.enabledAlternateButton = enabledAlternateButton;
        this.disabledButton = disabledButton;
    }

    /* renamed from: a, reason: from getter */
    public final q1.d.StandardButton getDestructiveButton() {
        return this.destructiveButton;
    }

    /* renamed from: b, reason: from getter */
    public final q1.d.StandardButton getDisabledButton() {
        return this.disabledButton;
    }

    /* renamed from: c, reason: from getter */
    public final q1.d.StandardButton getEnabledAlternateButton() {
        return this.enabledAlternateButton;
    }

    /* renamed from: d, reason: from getter */
    public final q1.d.StandardButton getEnabledButton() {
        return this.enabledButton;
    }

    public int hashCode() {
        return (((((this.destructiveButton.hashCode() * 31) + this.enabledButton.hashCode()) * 31) + this.enabledAlternateButton.hashCode()) * 31) + this.disabledButton.hashCode();
    }

    public String toString() {
        return "StandardButtons(destructiveButton=" + this.destructiveButton + ", enabledButton=" + this.enabledButton + ", enabledAlternateButton=" + this.enabledAlternateButton + ", disabledButton=" + this.disabledButton + ')';
    }
}
