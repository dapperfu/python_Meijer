package S0;

import H1.t;
import X0.a;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R%\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"LS0/a;", "Landroid/view/View$DragShadowBuilder;", "LH1/d;", "density", "LU0/k;", "decorationSize", "Lkotlin/Function1;", "LX0/f;", "", "Lkotlin/ExtensionFunctionType;", "drawDragDecoration", "<init>", "(LH1/d;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/graphics/Point;", "outShadowSize", "outShadowTouchPoint", "onProvideShadowMetrics", "(Landroid/graphics/Point;Landroid/graphics/Point;)V", "Landroid/graphics/Canvas;", "canvas", "onDrawShadow", "(Landroid/graphics/Canvas;)V", "a", "LH1/d;", "b", "J", "c", "Lkotlin/jvm/functions/Function1;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class a extends View.DragShadowBuilder {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final H1.d density;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long decorationSize;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function1<X0.f, Unit> drawDragDecoration;

    public /* synthetic */ a(H1.d dVar, long j10, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, j10, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private a(H1.d dVar, long j10, Function1<? super X0.f, Unit> function1) {
        this.density = dVar;
        this.decorationSize = j10;
        this.drawDragDecoration = function1;
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(Canvas canvas) {
        X0.a aVar = new X0.a();
        H1.d dVar = this.density;
        long j10 = this.decorationSize;
        t tVar = t.f12006a;
        androidx.compose.ui.graphics.Canvas Canvas = AndroidCanvas_androidKt.Canvas(canvas);
        Function1<X0.f, Unit> function1 = this.drawDragDecoration;
        a.DrawParams drawParams = aVar.getDrawParams();
        H1.d density = drawParams.getDensity();
        t layoutDirection = drawParams.getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvas2 = drawParams.getCanvas();
        long size = drawParams.getSize();
        a.DrawParams drawParams2 = aVar.getDrawParams();
        drawParams2.j(dVar);
        drawParams2.k(tVar);
        drawParams2.i(Canvas);
        drawParams2.l(j10);
        Canvas.save();
        function1.invoke(aVar);
        Canvas.i();
        a.DrawParams drawParams3 = aVar.getDrawParams();
        drawParams3.j(density);
        drawParams3.k(layoutDirection);
        drawParams3.i(canvas2);
        drawParams3.l(size);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(Point outShadowSize, Point outShadowTouchPoint) {
        H1.d dVar = this.density;
        outShadowSize.set(dVar.E0(dVar.L(Float.intBitsToFloat((int) (this.decorationSize >> 32)))), dVar.E0(dVar.L(Float.intBitsToFloat((int) (this.decorationSize & 4294967295L)))));
        outShadowTouchPoint.set(outShadowSize.x / 2, outShadowSize.y / 2);
    }
}
