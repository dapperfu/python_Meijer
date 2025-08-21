package androidx.compose.ui.node;

import U0.MutableRect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\fH&ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ!\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H&¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0004H&¢\u0006\u0004\b\u001b\u0010\u0019J\"\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\tH&ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\tH&¢\u0006\u0004\b\"\u0010#JW\u0010*\u001a\u00020\u000428\u0010'\u001a4\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00040$2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040(H&¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H&ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u001a\u00100\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H&ø\u0001\u0000¢\u0006\u0004\b0\u0010/R\u001a\u00103\u001a\u00020,8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b1\u00102ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u00064À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/OwnedLayer;", "", "Landroidx/compose/ui/graphics/g;", "scope", "", "g", "(Landroidx/compose/ui/graphics/g;)V", "LU0/f;", "position", "", "f", "(J)Z", "LH1/n;", "i", "(J)V", "LH1/r;", "size", "e", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "parentLayer", "drawLayer", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "j", "()V", "invalidate", "destroy", "point", "inverse", "c", "(JZ)J", "LU0/d;", "rect", "b", "(LU0/d;Z)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "d", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "LV0/k1;", "matrix", "a", "([F)V", "h", "getUnderlyingMatrix-sQKQjiQ", "()[F", "underlyingMatrix", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface OwnedLayer {
    void a(float[] matrix);

    void b(MutableRect rect, boolean inverse);

    long c(long point, boolean inverse);

    void d(Function2<? super Canvas, ? super GraphicsLayer, Unit> drawBlock, Function0<Unit> invalidateParentLayer);

    void destroy();

    void drawLayer(Canvas canvas, GraphicsLayer parentLayer);

    void e(long size);

    boolean f(long position);

    void g(androidx.compose.ui.graphics.g scope);

    /* renamed from: getUnderlyingMatrix-sQKQjiQ, reason: not valid java name */
    float[] mo13getUnderlyingMatrixsQKQjiQ();

    void h(float[] matrix);

    void i(long position);

    void invalidate();

    void j();
}
