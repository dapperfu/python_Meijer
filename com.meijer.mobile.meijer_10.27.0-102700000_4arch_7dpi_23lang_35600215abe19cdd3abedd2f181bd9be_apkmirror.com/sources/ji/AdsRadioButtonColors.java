package ji;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lji/d;", "", "LJi/T;", "checkedEnabledColor", "uncheckedEnabledColor", "checkmarkColor", "disabledColor", "<init>", "(LJi/T;LJi/T;LJi/T;LJi/T;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LJi/T;", "()LJi/T;", "b", "d", "c", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ji.d, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class AdsRadioButtonColors {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Ji.T checkedEnabledColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Ji.T uncheckedEnabledColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Ji.T checkmarkColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Ji.T disabledColor;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdsRadioButtonColors)) {
            return false;
        }
        AdsRadioButtonColors adsRadioButtonColors = (AdsRadioButtonColors) other;
        return Intrinsics.e(this.checkedEnabledColor, adsRadioButtonColors.checkedEnabledColor) && Intrinsics.e(this.uncheckedEnabledColor, adsRadioButtonColors.uncheckedEnabledColor) && Intrinsics.e(this.checkmarkColor, adsRadioButtonColors.checkmarkColor) && Intrinsics.e(this.disabledColor, adsRadioButtonColors.disabledColor);
    }

    public AdsRadioButtonColors(Ji.T checkedEnabledColor, Ji.T uncheckedEnabledColor, Ji.T checkmarkColor, Ji.T disabledColor) {
        Intrinsics.j(checkedEnabledColor, "checkedEnabledColor");
        Intrinsics.j(uncheckedEnabledColor, "uncheckedEnabledColor");
        Intrinsics.j(checkmarkColor, "checkmarkColor");
        Intrinsics.j(disabledColor, "disabledColor");
        this.checkedEnabledColor = checkedEnabledColor;
        this.uncheckedEnabledColor = uncheckedEnabledColor;
        this.checkmarkColor = checkmarkColor;
        this.disabledColor = disabledColor;
    }

    /* renamed from: a, reason: from getter */
    public final Ji.T getCheckedEnabledColor() {
        return this.checkedEnabledColor;
    }

    /* renamed from: b, reason: from getter */
    public final Ji.T getCheckmarkColor() {
        return this.checkmarkColor;
    }

    /* renamed from: c, reason: from getter */
    public final Ji.T getDisabledColor() {
        return this.disabledColor;
    }

    /* renamed from: d, reason: from getter */
    public final Ji.T getUncheckedEnabledColor() {
        return this.uncheckedEnabledColor;
    }

    public int hashCode() {
        return (((((this.checkedEnabledColor.hashCode() * 31) + this.uncheckedEnabledColor.hashCode()) * 31) + this.checkmarkColor.hashCode()) * 31) + this.disabledColor.hashCode();
    }

    public String toString() {
        return "AdsRadioButtonColors(checkedEnabledColor=" + this.checkedEnabledColor + ", uncheckedEnabledColor=" + this.uncheckedEnabledColor + ", checkmarkColor=" + this.checkmarkColor + ", disabledColor=" + this.disabledColor + ')';
    }
}
