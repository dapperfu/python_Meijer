package ji;

import ji.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00010\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\""}, d2 = {"Lji/z0;", "", "Lji/q1$h$b;", "labelIcon", "fieldIcon", "leadingIcon", "trailingIcon", "infoBlockIcon", "barCodeIcon", "disabledLeadingIcon", "disabledTrailingIcon", "<init>", "(Lji/q1$h$b;Lji/q1$h$b;Lji/q1$h$b;Lji/q1$h$b;Lji/q1$h$b;Lji/q1$h$b;Lji/q1$h$b;Lji/q1$h$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lji/q1$h$b;", "e", "()Lji/q1$h$b;", "b", "c", "f", "d", "g", "getDisabledLeadingIcon", "h", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ji.z0, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class DefaultIcons {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.h.DrawableIcon labelIcon;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.h.DrawableIcon fieldIcon;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.h.DrawableIcon leadingIcon;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.h.DrawableIcon trailingIcon;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.h.DrawableIcon infoBlockIcon;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.h.DrawableIcon barCodeIcon;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.h.DrawableIcon disabledLeadingIcon;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.h.DrawableIcon disabledTrailingIcon;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultIcons)) {
            return false;
        }
        DefaultIcons defaultIcons = (DefaultIcons) other;
        return Intrinsics.e(this.labelIcon, defaultIcons.labelIcon) && Intrinsics.e(this.fieldIcon, defaultIcons.fieldIcon) && Intrinsics.e(this.leadingIcon, defaultIcons.leadingIcon) && Intrinsics.e(this.trailingIcon, defaultIcons.trailingIcon) && Intrinsics.e(this.infoBlockIcon, defaultIcons.infoBlockIcon) && Intrinsics.e(this.barCodeIcon, defaultIcons.barCodeIcon) && Intrinsics.e(this.disabledLeadingIcon, defaultIcons.disabledLeadingIcon) && Intrinsics.e(this.disabledTrailingIcon, defaultIcons.disabledTrailingIcon);
    }

    public DefaultIcons(q1.h.DrawableIcon labelIcon, q1.h.DrawableIcon fieldIcon, q1.h.DrawableIcon leadingIcon, q1.h.DrawableIcon trailingIcon, q1.h.DrawableIcon infoBlockIcon, q1.h.DrawableIcon barCodeIcon, q1.h.DrawableIcon disabledLeadingIcon, q1.h.DrawableIcon disabledTrailingIcon) {
        Intrinsics.j(labelIcon, "labelIcon");
        Intrinsics.j(fieldIcon, "fieldIcon");
        Intrinsics.j(leadingIcon, "leadingIcon");
        Intrinsics.j(trailingIcon, "trailingIcon");
        Intrinsics.j(infoBlockIcon, "infoBlockIcon");
        Intrinsics.j(barCodeIcon, "barCodeIcon");
        Intrinsics.j(disabledLeadingIcon, "disabledLeadingIcon");
        Intrinsics.j(disabledTrailingIcon, "disabledTrailingIcon");
        this.labelIcon = labelIcon;
        this.fieldIcon = fieldIcon;
        this.leadingIcon = leadingIcon;
        this.trailingIcon = trailingIcon;
        this.infoBlockIcon = infoBlockIcon;
        this.barCodeIcon = barCodeIcon;
        this.disabledLeadingIcon = disabledLeadingIcon;
        this.disabledTrailingIcon = disabledTrailingIcon;
    }

    /* renamed from: a, reason: from getter */
    public final q1.h.DrawableIcon getBarCodeIcon() {
        return this.barCodeIcon;
    }

    /* renamed from: b, reason: from getter */
    public final q1.h.DrawableIcon getDisabledTrailingIcon() {
        return this.disabledTrailingIcon;
    }

    /* renamed from: c, reason: from getter */
    public final q1.h.DrawableIcon getFieldIcon() {
        return this.fieldIcon;
    }

    /* renamed from: d, reason: from getter */
    public final q1.h.DrawableIcon getInfoBlockIcon() {
        return this.infoBlockIcon;
    }

    /* renamed from: e, reason: from getter */
    public final q1.h.DrawableIcon getLabelIcon() {
        return this.labelIcon;
    }

    /* renamed from: f, reason: from getter */
    public final q1.h.DrawableIcon getLeadingIcon() {
        return this.leadingIcon;
    }

    /* renamed from: g, reason: from getter */
    public final q1.h.DrawableIcon getTrailingIcon() {
        return this.trailingIcon;
    }

    public int hashCode() {
        return (((((((((((((this.labelIcon.hashCode() * 31) + this.fieldIcon.hashCode()) * 31) + this.leadingIcon.hashCode()) * 31) + this.trailingIcon.hashCode()) * 31) + this.infoBlockIcon.hashCode()) * 31) + this.barCodeIcon.hashCode()) * 31) + this.disabledLeadingIcon.hashCode()) * 31) + this.disabledTrailingIcon.hashCode();
    }

    public String toString() {
        return "DefaultIcons(labelIcon=" + this.labelIcon + ", fieldIcon=" + this.fieldIcon + ", leadingIcon=" + this.leadingIcon + ", trailingIcon=" + this.trailingIcon + ", infoBlockIcon=" + this.infoBlockIcon + ", barCodeIcon=" + this.barCodeIcon + ", disabledLeadingIcon=" + this.disabledLeadingIcon + ", disabledTrailingIcon=" + this.disabledTrailingIcon + ')';
    }
}
