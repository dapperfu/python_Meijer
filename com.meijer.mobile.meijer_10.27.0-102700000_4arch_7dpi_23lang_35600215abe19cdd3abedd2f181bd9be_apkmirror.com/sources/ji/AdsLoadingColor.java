package ji;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lji/b;", "", "LJi/T;", "filledLoading", "backgroundLoading", "iconColor", "<init>", "(LJi/T;LJi/T;LJi/T;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LJi/T;", "b", "()LJi/T;", "c", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ji.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class AdsLoadingColor {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Ji.T filledLoading;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Ji.T backgroundLoading;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Ji.T iconColor;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdsLoadingColor)) {
            return false;
        }
        AdsLoadingColor adsLoadingColor = (AdsLoadingColor) other;
        return Intrinsics.e(this.filledLoading, adsLoadingColor.filledLoading) && Intrinsics.e(this.backgroundLoading, adsLoadingColor.backgroundLoading) && Intrinsics.e(this.iconColor, adsLoadingColor.iconColor);
    }

    public AdsLoadingColor(Ji.T filledLoading, Ji.T backgroundLoading, Ji.T iconColor) {
        Intrinsics.j(filledLoading, "filledLoading");
        Intrinsics.j(backgroundLoading, "backgroundLoading");
        Intrinsics.j(iconColor, "iconColor");
        this.filledLoading = filledLoading;
        this.backgroundLoading = backgroundLoading;
        this.iconColor = iconColor;
    }

    /* renamed from: a, reason: from getter */
    public final Ji.T getBackgroundLoading() {
        return this.backgroundLoading;
    }

    /* renamed from: b, reason: from getter */
    public final Ji.T getFilledLoading() {
        return this.filledLoading;
    }

    /* renamed from: c, reason: from getter */
    public final Ji.T getIconColor() {
        return this.iconColor;
    }

    public int hashCode() {
        return (((this.filledLoading.hashCode() * 31) + this.backgroundLoading.hashCode()) * 31) + this.iconColor.hashCode();
    }

    public String toString() {
        return "AdsLoadingColor(filledLoading=" + this.filledLoading + ", backgroundLoading=" + this.backgroundLoading + ", iconColor=" + this.iconColor + ')';
    }
}
