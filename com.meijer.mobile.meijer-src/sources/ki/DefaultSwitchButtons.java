package ki;

import ki.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0018"}, d2 = {"Lki/v1;", "", "Lki/q1$s$c;", "leadingToggleButton", "trailingToggleButton", "defaultToggleButton", "<init>", "(Lki/q1$s$c;Lki/q1$s$c;Lki/q1$s$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lki/q1$s$c;", "getLeadingToggleButton", "()Lki/q1$s$c;", "b", "c", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ki.v1, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class DefaultSwitchButtons {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.s.Switch leadingToggleButton;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.s.Switch trailingToggleButton;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.s.Switch defaultToggleButton;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultSwitchButtons)) {
            return false;
        }
        DefaultSwitchButtons defaultSwitchButtons = (DefaultSwitchButtons) other;
        return Intrinsics.e(this.leadingToggleButton, defaultSwitchButtons.leadingToggleButton) && Intrinsics.e(this.trailingToggleButton, defaultSwitchButtons.trailingToggleButton) && Intrinsics.e(this.defaultToggleButton, defaultSwitchButtons.defaultToggleButton);
    }

    public DefaultSwitchButtons(q1.s.Switch leadingToggleButton, q1.s.Switch trailingToggleButton, q1.s.Switch defaultToggleButton) {
        Intrinsics.j(leadingToggleButton, "leadingToggleButton");
        Intrinsics.j(trailingToggleButton, "trailingToggleButton");
        Intrinsics.j(defaultToggleButton, "defaultToggleButton");
        this.leadingToggleButton = leadingToggleButton;
        this.trailingToggleButton = trailingToggleButton;
        this.defaultToggleButton = defaultToggleButton;
    }

    /* renamed from: a, reason: from getter */
    public q1.s.Switch getDefaultToggleButton() {
        return this.defaultToggleButton;
    }

    /* renamed from: b, reason: from getter */
    public q1.s.Switch getTrailingToggleButton() {
        return this.trailingToggleButton;
    }

    public int hashCode() {
        return (((this.leadingToggleButton.hashCode() * 31) + this.trailingToggleButton.hashCode()) * 31) + this.defaultToggleButton.hashCode();
    }

    public String toString() {
        return "DefaultSwitchButtons(leadingToggleButton=" + this.leadingToggleButton + ", trailingToggleButton=" + this.trailingToggleButton + ", defaultToggleButton=" + this.defaultToggleButton + ')';
    }
}
