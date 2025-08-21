package e0;

import V0.C5489q0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0016R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0019\u0010\u0016R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Le0/b;", "", "LV0/q0;", "backgroundColor", "textColor", "iconColor", "disabledTextColor", "disabledIconColor", "<init>", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "()J", "b", "e", "c", "d", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: e0.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final class ContextMenuColors {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long backgroundColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long textColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long iconColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long disabledTextColor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long disabledIconColor;

    public /* synthetic */ ContextMenuColors(long j10, long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof ContextMenuColors)) {
            return false;
        }
        ContextMenuColors contextMenuColors = (ContextMenuColors) other;
        return C5489q0.s(this.backgroundColor, contextMenuColors.backgroundColor) && C5489q0.s(this.textColor, contextMenuColors.textColor) && C5489q0.s(this.iconColor, contextMenuColors.iconColor) && C5489q0.s(this.disabledTextColor, contextMenuColors.disabledTextColor) && C5489q0.s(this.disabledIconColor, contextMenuColors.disabledIconColor);
    }

    private ContextMenuColors(long j10, long j11, long j12, long j13, long j14) {
        this.backgroundColor = j10;
        this.textColor = j11;
        this.iconColor = j12;
        this.disabledTextColor = j13;
        this.disabledIconColor = j14;
    }

    /* renamed from: a, reason: from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: b, reason: from getter */
    public final long getDisabledIconColor() {
        return this.disabledIconColor;
    }

    /* renamed from: c, reason: from getter */
    public final long getDisabledTextColor() {
        return this.disabledTextColor;
    }

    /* renamed from: d, reason: from getter */
    public final long getIconColor() {
        return this.iconColor;
    }

    /* renamed from: e, reason: from getter */
    public final long getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return (((((((C5489q0.y(this.backgroundColor) * 31) + C5489q0.y(this.textColor)) * 31) + C5489q0.y(this.iconColor)) * 31) + C5489q0.y(this.disabledTextColor)) * 31) + C5489q0.y(this.disabledIconColor);
    }

    public String toString() {
        return "ContextMenuColors(backgroundColor=" + ((Object) C5489q0.z(this.backgroundColor)) + ", textColor=" + ((Object) C5489q0.z(this.textColor)) + ", iconColor=" + ((Object) C5489q0.z(this.iconColor)) + ", disabledTextColor=" + ((Object) C5489q0.z(this.disabledTextColor)) + ", disabledIconColor=" + ((Object) C5489q0.z(this.disabledIconColor)) + ')';
    }
}
