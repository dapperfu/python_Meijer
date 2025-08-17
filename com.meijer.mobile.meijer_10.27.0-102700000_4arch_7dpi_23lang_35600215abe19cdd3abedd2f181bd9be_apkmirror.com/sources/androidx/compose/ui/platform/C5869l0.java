package androidx.compose.ui.platform;

import V0.C5331k1;
import android.graphics.Matrix;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\u00020\t*\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0013\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/platform/l0;", "Landroidx/compose/ui/platform/k0;", "LV0/k1;", "tmpMatrix", "<init>", "([FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/view/View;", "view", "matrix", "", "d", "(Landroid/view/View;[F)V", "Landroid/graphics/Matrix;", "other", "b", "([FLandroid/graphics/Matrix;)V", "", "x", "y", "c", "([FFF)V", "a", "[F", "", "[I", "tmpLocation", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5869l0 implements InterfaceC5866k0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float[] tmpMatrix;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int[] tmpLocation;

    public /* synthetic */ C5869l0(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    private C5869l0(float[] fArr) {
        this.tmpMatrix = fArr;
        this.tmpLocation = new int[2];
    }

    private final void b(float[] fArr, Matrix matrix) {
        V0.N.b(this.tmpMatrix, matrix);
        L.i(fArr, this.tmpMatrix);
    }

    private final void c(float[] fArr, float f10, float f11) {
        L.j(fArr, f10, f11, this.tmpMatrix);
    }

    private final void d(View view, float[] matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            d((View) parent, matrix);
            c(matrix, -view.getScrollX(), -view.getScrollY());
            c(matrix, view.getLeft(), view.getTop());
        } else {
            view.getLocationInWindow(this.tmpLocation);
            c(matrix, -view.getScrollX(), -view.getScrollY());
            c(matrix, r0[0], r0[1]);
        }
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            b(matrix, matrix2);
        }
    }

    @Override // androidx.compose.ui.platform.InterfaceC5866k0
    public void a(View view, float[] matrix) {
        C5331k1.h(matrix);
        d(view, matrix);
    }
}
