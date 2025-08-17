package X0;

import H1.t;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\"\u0010\u0007\u001a\u00020\u00028&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R$\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001e\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010$\u001a\u0004\u0018\u00010\u001f2\b\u0010\t\u001a\u0004\u0018\u00010\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006%À\u0006\u0001"}, d2 = {"LX0/d;", "", "LU0/k;", "b", "()J", "h", "(J)V", "size", "Landroidx/compose/ui/graphics/Canvas;", "<anonymous parameter 0>", "g", "()Landroidx/compose/ui/graphics/Canvas;", "j", "(Landroidx/compose/ui/graphics/Canvas;)V", "canvas", "LX0/h;", "e", "()LX0/h;", "transform", "LH1/t;", "getLayoutDirection", "()LH1/t;", "d", "(LH1/t;)V", "layoutDirection", "LH1/d;", "getDensity", "()LH1/d;", "a", "(LH1/d;)V", "density", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "i", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "f", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "graphicsLayer", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface d {
    default void a(H1.d dVar) {
    }

    long b();

    default void d(t tVar) {
    }

    /* renamed from: e */
    h getTransform();

    default void f(GraphicsLayer graphicsLayer) {
    }

    void h(long j10);

    /* renamed from: i */
    default GraphicsLayer getGraphicsLayer() {
        return null;
    }

    default void j(Canvas canvas) {
    }

    default Canvas g() {
        return i.f39071a;
    }

    default t getLayoutDirection() {
        return t.f12006a;
    }

    default H1.d getDensity() {
        return e.a();
    }
}
