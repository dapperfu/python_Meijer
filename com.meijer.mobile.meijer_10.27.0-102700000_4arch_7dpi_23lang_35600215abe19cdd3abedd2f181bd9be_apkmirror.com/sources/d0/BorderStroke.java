package d0;

import V0.AbstractC5324i0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Ld0/h;", "", "LH1/h;", "width", "LV0/i0;", "brush", "<init>", "(FLV0/i0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "b", "()F", "LV0/i0;", "()LV0/i0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: d0.h, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final class BorderStroke {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float width;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5324i0 brush;

    public /* synthetic */ BorderStroke(float f10, AbstractC5324i0 abstractC5324i0, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, abstractC5324i0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderStroke)) {
            return false;
        }
        BorderStroke borderStroke = (BorderStroke) other;
        return H1.h.u(this.width, borderStroke.width) && Intrinsics.e(this.brush, borderStroke.brush);
    }

    private BorderStroke(float f10, AbstractC5324i0 abstractC5324i0) {
        this.width = f10;
        this.brush = abstractC5324i0;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC5324i0 getBrush() {
        return this.brush;
    }

    /* renamed from: b, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (H1.h.w(this.width) * 31) + this.brush.hashCode();
    }

    public String toString() {
        return "BorderStroke(width=" + ((Object) H1.h.z(this.width)) + ", brush=" + this.brush + ')';
    }
}
