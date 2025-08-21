package Y0;

import V0.AbstractC5480m1;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\b\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LX0/f;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "graphicsLayer", "", "a", "(LX0/f;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "LV0/m1;", "outline", "b", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;LV0/m1;)V", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Y0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5592a {
    public static final void b(GraphicsLayer graphicsLayer, AbstractC5480m1 abstractC5480m1) {
        if (abstractC5480m1 instanceof AbstractC5480m1.b) {
            AbstractC5480m1.b bVar = (AbstractC5480m1.b) abstractC5480m1;
            float left = bVar.b().getLeft();
            float top = bVar.b().getTop();
            long jE = U0.f.e((Float.floatToRawIntBits(left) << 32) | (Float.floatToRawIntBits(top) & 4294967295L));
            Rect rectB = bVar.b();
            float fL = rectB.l() - rectB.getLeft();
            Rect rectB2 = bVar.b();
            float fI = rectB2.i() - rectB2.getTop();
            graphicsLayer.R(jE, U0.k.d((Float.floatToRawIntBits(fI) & 4294967295L) | (Float.floatToRawIntBits(fL) << 32)));
            return;
        }
        if (abstractC5480m1 instanceof AbstractC5480m1.a) {
            graphicsLayer.O(((AbstractC5480m1.a) abstractC5480m1).getPath());
            return;
        }
        if (abstractC5480m1 instanceof AbstractC5480m1.c) {
            AbstractC5480m1.c cVar = (AbstractC5480m1.c) abstractC5480m1;
            if (cVar.getRoundRectPath() != null) {
                graphicsLayer.O(cVar.getRoundRectPath());
                return;
            }
            U0.i roundRect = cVar.getRoundRect();
            float left2 = roundRect.getLeft();
            float top2 = roundRect.getTop();
            long jE2 = U0.f.e((Float.floatToRawIntBits(left2) << 32) | (Float.floatToRawIntBits(top2) & 4294967295L));
            float fJ = roundRect.j();
            float fD = roundRect.d();
            graphicsLayer.W(jE2, U0.k.d((Float.floatToRawIntBits(fD) & 4294967295L) | (Float.floatToRawIntBits(fJ) << 32)), Float.intBitsToFloat((int) (roundRect.getBottomLeftCornerRadius() >> 32)));
        }
    }

    public static final void a(X0.f fVar, GraphicsLayer graphicsLayer) {
        graphicsLayer.h(fVar.getDrawContext().g(), fVar.getDrawContext().getGraphicsLayer());
    }
}
