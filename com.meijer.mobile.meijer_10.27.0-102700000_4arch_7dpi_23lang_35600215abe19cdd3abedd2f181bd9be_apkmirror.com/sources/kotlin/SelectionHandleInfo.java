package kotlin;

import androidx.compose.foundation.text.EnumC5682n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Lw0/A;", "", "Landroidx/compose/foundation/text/n;", "handle", "LU0/f;", "position", "Lw0/z;", "anchor", "", "visible", "<init>", "(Landroidx/compose/foundation/text/n;JLw0/z;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/foundation/text/n;", "getHandle", "()Landroidx/compose/foundation/text/n;", "b", "J", "getPosition-F1C5BW0", "()J", "c", "Lw0/z;", "getAnchor", "()Lw0/z;", "d", "Z", "getVisible", "()Z", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: w0.A, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final /* data */ class SelectionHandleInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC5682n handle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long position;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC17740z anchor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean visible;

    public /* synthetic */ SelectionHandleInfo(EnumC5682n enumC5682n, long j10, EnumC17740z enumC17740z, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC5682n, j10, enumC17740z, z10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionHandleInfo)) {
            return false;
        }
        SelectionHandleInfo selectionHandleInfo = (SelectionHandleInfo) other;
        return this.handle == selectionHandleInfo.handle && U0.f.j(this.position, selectionHandleInfo.position) && this.anchor == selectionHandleInfo.anchor && this.visible == selectionHandleInfo.visible;
    }

    private SelectionHandleInfo(EnumC5682n enumC5682n, long j10, EnumC17740z enumC17740z, boolean z10) {
        this.handle = enumC5682n;
        this.position = j10;
        this.anchor = enumC17740z;
        this.visible = z10;
    }

    public int hashCode() {
        return (((((this.handle.hashCode() * 31) + U0.f.o(this.position)) * 31) + this.anchor.hashCode()) * 31) + Boolean.hashCode(this.visible);
    }

    public String toString() {
        return "SelectionHandleInfo(handle=" + this.handle + ", position=" + ((Object) U0.f.s(this.position)) + ", anchor=" + this.anchor + ", visible=" + this.visible + ')';
    }
}
