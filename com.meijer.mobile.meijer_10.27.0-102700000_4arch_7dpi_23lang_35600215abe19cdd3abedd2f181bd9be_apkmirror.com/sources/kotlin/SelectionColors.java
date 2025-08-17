package kotlin;

import V0.C5346q0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Lw0/V;", "", "LV0/q0;", "handleColor", "backgroundColor", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "b", "()J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: w0.V, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final class SelectionColors {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long selectionHandleColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long selectionBackgroundColor;

    public /* synthetic */ SelectionColors(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionColors)) {
            return false;
        }
        SelectionColors selectionColors = (SelectionColors) other;
        return C5346q0.s(this.selectionHandleColor, selectionColors.selectionHandleColor) && C5346q0.s(this.selectionBackgroundColor, selectionColors.selectionBackgroundColor);
    }

    private SelectionColors(long j10, long j11) {
        this.selectionHandleColor = j10;
        this.selectionBackgroundColor = j11;
    }

    /* renamed from: a, reason: from getter */
    public final long getSelectionBackgroundColor() {
        return this.selectionBackgroundColor;
    }

    /* renamed from: b, reason: from getter */
    public final long getSelectionHandleColor() {
        return this.selectionHandleColor;
    }

    public int hashCode() {
        return (C5346q0.y(this.selectionHandleColor) * 31) + C5346q0.y(this.selectionBackgroundColor);
    }

    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) C5346q0.z(this.selectionHandleColor)) + ", selectionBackgroundColor=" + ((Object) C5346q0.z(this.selectionBackgroundColor)) + ')';
    }
}
