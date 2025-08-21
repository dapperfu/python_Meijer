package u1;

import androidx.compose.ui.text.SpanStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lu1/w;", "", "Landroidx/compose/ui/text/s;", "style", "focusedStyle", "hoveredStyle", "pressedStyle", "<init>", "(Landroidx/compose/ui/text/s;Landroidx/compose/ui/text/s;Landroidx/compose/ui/text/s;Landroidx/compose/ui/text/s;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroidx/compose/ui/text/s;", "d", "()Landroidx/compose/ui/text/s;", "b", "c", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SpanStyle style;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SpanStyle focusedStyle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SpanStyle hoveredStyle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final SpanStyle pressedStyle;

    public w() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof w)) {
            return false;
        }
        w wVar = (w) other;
        return Intrinsics.e(this.style, wVar.style) && Intrinsics.e(this.focusedStyle, wVar.focusedStyle) && Intrinsics.e(this.hoveredStyle, wVar.hoveredStyle) && Intrinsics.e(this.pressedStyle, wVar.pressedStyle);
    }

    public w(SpanStyle sVar, SpanStyle sVar2, SpanStyle sVar3, SpanStyle sVar4) {
        this.style = sVar;
        this.focusedStyle = sVar2;
        this.hoveredStyle = sVar3;
        this.pressedStyle = sVar4;
    }

    /* renamed from: a, reason: from getter */
    public final SpanStyle getFocusedStyle() {
        return this.focusedStyle;
    }

    /* renamed from: b, reason: from getter */
    public final SpanStyle getHoveredStyle() {
        return this.hoveredStyle;
    }

    /* renamed from: c, reason: from getter */
    public final SpanStyle getPressedStyle() {
        return this.pressedStyle;
    }

    /* renamed from: d, reason: from getter */
    public final SpanStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        SpanStyle sVar = this.style;
        int iHashCode = (sVar != null ? sVar.hashCode() : 0) * 31;
        SpanStyle sVar2 = this.focusedStyle;
        int iHashCode2 = (iHashCode + (sVar2 != null ? sVar2.hashCode() : 0)) * 31;
        SpanStyle sVar3 = this.hoveredStyle;
        int iHashCode3 = (iHashCode2 + (sVar3 != null ? sVar3.hashCode() : 0)) * 31;
        SpanStyle sVar4 = this.pressedStyle;
        return iHashCode3 + (sVar4 != null ? sVar4.hashCode() : 0);
    }

    public /* synthetic */ w(SpanStyle sVar, SpanStyle sVar2, SpanStyle sVar3, SpanStyle sVar4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : sVar, (i10 & 2) != 0 ? null : sVar2, (i10 & 4) != 0 ? null : sVar3, (i10 & 8) != 0 ? null : sVar4);
    }
}
