package androidx.compose.foundation.text;

import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\u00020\t*\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000bJ\u001a\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001a\u0010\u001d\"\u0004\b \u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/foundation/text/h0;", "", "Lu1/v;", "value", "Landroidx/compose/ui/layout/LayoutCoordinates;", "innerTextFieldCoordinates", "decorationBoxCoordinates", "<init>", "(Lu1/v;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;)V", "LU0/f;", "a", "(J)J", "position", "", "coerceInVisibleBounds", "", "d", "(JZ)I", "offset", "g", "(J)Z", "j", "k", "Lu1/v;", "f", "()Lu1/v;", "b", "Landroidx/compose/ui/layout/LayoutCoordinates;", "c", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "i", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "h", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TextLayoutResult value;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private LayoutCoordinates innerTextFieldCoordinates;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private LayoutCoordinates decorationBoxCoordinates;

    public h0(TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        this.value = textLayoutResult;
        this.innerTextFieldCoordinates = layoutCoordinates;
        this.decorationBoxCoordinates = layoutCoordinates2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long a(long r6) {
        /*
            r5 = this;
            androidx.compose.ui.layout.LayoutCoordinates r0 = r5.innerTextFieldCoordinates
            if (r0 == 0) goto L1e
            boolean r1 = r0.isAttached()
            if (r1 == 0) goto L16
            androidx.compose.ui.layout.LayoutCoordinates r1 = r5.decorationBoxCoordinates
            r2 = 0
            if (r1 == 0) goto L1c
            r3 = 0
            r4 = 2
            androidx.compose.ui.geometry.Rect r2 = androidx.compose.ui.layout.LayoutCoordinates.I(r1, r0, r3, r4, r2)
            goto L1c
        L16:
            androidx.compose.ui.geometry.Rect$a r0 = androidx.compose.ui.geometry.Rect.INSTANCE
            androidx.compose.ui.geometry.Rect r2 = r0.a()
        L1c:
            if (r2 != 0) goto L24
        L1e:
            androidx.compose.ui.geometry.Rect$a r0 = androidx.compose.ui.geometry.Rect.INSTANCE
            androidx.compose.ui.geometry.Rect r2 = r0.a()
        L24:
            long r6 = androidx.compose.foundation.text.i0.a(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.h0.a(long):long");
    }

    public static /* synthetic */ int e(h0 h0Var, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return h0Var.d(j10, z10);
    }

    /* renamed from: b, reason: from getter */
    public final LayoutCoordinates getDecorationBoxCoordinates() {
        return this.decorationBoxCoordinates;
    }

    /* renamed from: c, reason: from getter */
    public final LayoutCoordinates getInnerTextFieldCoordinates() {
        return this.innerTextFieldCoordinates;
    }

    public final int d(long position, boolean coerceInVisibleBounds) {
        if (coerceInVisibleBounds) {
            position = a(position);
        }
        return this.value.x(j(position));
    }

    /* renamed from: f, reason: from getter */
    public final TextLayoutResult getValue() {
        return this.value;
    }

    public final void h(LayoutCoordinates layoutCoordinates) {
        this.decorationBoxCoordinates = layoutCoordinates;
    }

    public final void i(LayoutCoordinates layoutCoordinates) {
        this.innerTextFieldCoordinates = layoutCoordinates;
    }

    public final long j(long offset) {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.innerTextFieldCoordinates;
        if (layoutCoordinates2 == null) {
            return offset;
        }
        if (!layoutCoordinates2.isAttached()) {
            layoutCoordinates2 = null;
        }
        if (layoutCoordinates2 == null || (layoutCoordinates = this.decorationBoxCoordinates) == null) {
            return offset;
        }
        LayoutCoordinates layoutCoordinates3 = layoutCoordinates.isAttached() ? layoutCoordinates : null;
        return layoutCoordinates3 == null ? offset : layoutCoordinates2.J(layoutCoordinates3, offset);
    }

    public final long k(long offset) {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.innerTextFieldCoordinates;
        if (layoutCoordinates2 == null) {
            return offset;
        }
        if (!layoutCoordinates2.isAttached()) {
            layoutCoordinates2 = null;
        }
        if (layoutCoordinates2 == null || (layoutCoordinates = this.decorationBoxCoordinates) == null) {
            return offset;
        }
        LayoutCoordinates layoutCoordinates3 = layoutCoordinates.isAttached() ? layoutCoordinates : null;
        return layoutCoordinates3 == null ? offset : layoutCoordinates3.J(layoutCoordinates2, offset);
    }

    public final boolean g(long offset) {
        long j10 = j(a(offset));
        int iR = this.value.r(Float.intBitsToFloat((int) (4294967295L & j10)));
        int i10 = (int) (j10 >> 32);
        if (Float.intBitsToFloat(i10) >= this.value.s(iR) && Float.intBitsToFloat(i10) <= this.value.t(iR)) {
            return true;
        }
        return false;
    }

    public /* synthetic */ h0(TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(textLayoutResult, (i10 & 2) != 0 ? null : layoutCoordinates, (i10 & 4) != 0 ? null : layoutCoordinates2);
    }
}
