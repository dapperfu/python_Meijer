package ji;

import ji.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00010\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, d2 = {"Lji/G;", "", "Lji/q1$j;", "destructiveLabel", "enabledLabel", "disabledLabel", "<init>", "(Lji/q1$j;Lji/q1$j;Lji/q1$j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lji/q1$j;", "()Lji/q1$j;", "b", "c", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ji.G, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class StandardLabels {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.Label destructiveLabel;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.Label enabledLabel;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.Label disabledLabel;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StandardLabels)) {
            return false;
        }
        StandardLabels standardLabels = (StandardLabels) other;
        return Intrinsics.e(this.destructiveLabel, standardLabels.destructiveLabel) && Intrinsics.e(this.enabledLabel, standardLabels.enabledLabel) && Intrinsics.e(this.disabledLabel, standardLabels.disabledLabel);
    }

    public StandardLabels(q1.Label destructiveLabel, q1.Label enabledLabel, q1.Label disabledLabel) {
        Intrinsics.j(destructiveLabel, "destructiveLabel");
        Intrinsics.j(enabledLabel, "enabledLabel");
        Intrinsics.j(disabledLabel, "disabledLabel");
        this.destructiveLabel = destructiveLabel;
        this.enabledLabel = enabledLabel;
        this.disabledLabel = disabledLabel;
    }

    /* renamed from: a, reason: from getter */
    public final q1.Label getDestructiveLabel() {
        return this.destructiveLabel;
    }

    /* renamed from: b, reason: from getter */
    public final q1.Label getDisabledLabel() {
        return this.disabledLabel;
    }

    /* renamed from: c, reason: from getter */
    public final q1.Label getEnabledLabel() {
        return this.enabledLabel;
    }

    public int hashCode() {
        return (((this.destructiveLabel.hashCode() * 31) + this.enabledLabel.hashCode()) * 31) + this.disabledLabel.hashCode();
    }

    public String toString() {
        return "StandardLabels(destructiveLabel=" + this.destructiveLabel + ", enabledLabel=" + this.enabledLabel + ", disabledLabel=" + this.disabledLabel + ')';
    }
}
