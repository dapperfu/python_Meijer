package androidx.compose.ui.node;

import j1.C14832a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001\u000eB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\b\u0010$\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/ui/node/s;", "", "LH1/h;", "start", "top", "end", "bottom", "", "isLayoutDirectionAware", "<init>", "(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "LH1/d;", "density", "Landroidx/compose/ui/node/y0;", "a", "(LH1/d;)J", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "F", "getStart-D9Ej5fM", "()F", "b", "getTop-D9Ej5fM", "c", "getEnd-D9Ej5fM", "d", "getBottom-D9Ej5fM", "e", "Z", "()Z", "f", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.node.s, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final /* data */ class DpTouchBoundsExpansion {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float start;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float top;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float end;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float bottom;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLayoutDirectionAware;

    public /* synthetic */ DpTouchBoundsExpansion(float f10, float f11, float f12, float f13, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, z10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DpTouchBoundsExpansion)) {
            return false;
        }
        DpTouchBoundsExpansion dpTouchBoundsExpansion = (DpTouchBoundsExpansion) other;
        return H1.h.u(this.start, dpTouchBoundsExpansion.start) && H1.h.u(this.top, dpTouchBoundsExpansion.top) && H1.h.u(this.end, dpTouchBoundsExpansion.end) && H1.h.u(this.bottom, dpTouchBoundsExpansion.bottom) && this.isLayoutDirectionAware == dpTouchBoundsExpansion.isLayoutDirectionAware;
    }

    public int hashCode() {
        return (((((((H1.h.w(this.start) * 31) + H1.h.w(this.top)) * 31) + H1.h.w(this.end)) * 31) + H1.h.w(this.bottom)) * 31) + Boolean.hashCode(this.isLayoutDirectionAware);
    }

    public String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) H1.h.z(this.start)) + ", top=" + ((Object) H1.h.z(this.top)) + ", end=" + ((Object) H1.h.z(this.end)) + ", bottom=" + ((Object) H1.h.z(this.bottom)) + ", isLayoutDirectionAware=" + this.isLayoutDirectionAware + ')';
    }

    private DpTouchBoundsExpansion(float f10, float f11, float f12, float f13, boolean z10) {
        this.start = f10;
        this.top = f11;
        this.end = f12;
        this.bottom = f13;
        this.isLayoutDirectionAware = z10;
        if (!(f10 >= 0.0f)) {
            C14832a.a("Left must be non-negative");
        }
        if (!(f11 >= 0.0f)) {
            C14832a.a("Top must be non-negative");
        }
        if (!(f12 >= 0.0f)) {
            C14832a.a("Right must be non-negative");
        }
        if (f13 >= 0.0f) {
            return;
        }
        C14832a.a("Bottom must be non-negative");
    }

    public final long a(H1.d density) {
        return y0.d(y0.INSTANCE.c(density.E0(this.start), density.E0(this.top), density.E0(this.end), density.E0(this.bottom), this.isLayoutDirectionAware));
    }
}
