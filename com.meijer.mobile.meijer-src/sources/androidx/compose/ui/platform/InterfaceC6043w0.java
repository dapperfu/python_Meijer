package androidx.compose.ui.platform;

import V0.C5473k0;
import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.Canvas;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0007H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0007H&¢\u0006\u0004\b\u0012\u0010\u0011J5\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00040\u0017H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H&¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020\fH&¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0004H&¢\u0006\u0004\b'\u0010(R\u0014\u0010\b\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010\t\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0014\u0010\u000b\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010*R\u0014\u0010/\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010*R\u0014\u00101\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010*R\u001c\u00107\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u0010:\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\b8\u00104\"\u0004\b9\u00106R\u001c\u0010=\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\b;\u00104\"\u0004\b<\u00106R\u001c\u0010@\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\b>\u00104\"\u0004\b?\u00106R\u001c\u0010C\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bA\u00104\"\u0004\bB\u00106R\u001c\u0010F\u001a\u00020\u00078&@&X¦\u000e¢\u0006\f\u001a\u0004\bD\u0010*\"\u0004\bE\u0010\u0011R\u001c\u0010I\u001a\u00020\u00078&@&X¦\u000e¢\u0006\f\u001a\u0004\bG\u0010*\"\u0004\bH\u0010\u0011R\u001c\u0010L\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bJ\u00104\"\u0004\bK\u00106R\u001c\u0010O\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bM\u00104\"\u0004\bN\u00106R\u001c\u0010R\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bP\u00104\"\u0004\bQ\u00106R\u001c\u0010U\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bS\u00104\"\u0004\bT\u00106R\u001c\u0010X\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bV\u00104\"\u0004\bW\u00106R\u001c\u0010[\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bY\u00104\"\u0004\bZ\u00106R\u001c\u0010`\u001a\u00020\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001c\u0010c\u001a\u00020\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\ba\u0010]\"\u0004\bb\u0010_R\u001c\u0010f\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bd\u00104\"\u0004\be\u00106R\u001e\u0010l\u001a\u0004\u0018\u00010g8&@&X¦\u000e¢\u0006\f\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0014\u0010n\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\bm\u0010]R\"\u0010r\u001a\u00020o8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bp\u0010*\"\u0004\bq\u0010\u0011ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006sÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/w0;", "", "Landroid/graphics/Outline;", "outline", "", "G", "(Landroid/graphics/Outline;)V", "", "left", "top", "right", "bottom", "", "w", "(IIII)Z", "offset", "C", "(I)V", "y", "LV0/k0;", "canvasHolder", "LV0/q1;", "clipPath", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "drawBlock", "F", "(LV0/k0;LV0/q1;Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Matrix;", "matrix", "B", "(Landroid/graphics/Matrix;)V", "Landroid/graphics/Canvas;", "canvas", "t", "(Landroid/graphics/Canvas;)V", "hasOverlappingRendering", "A", "(Z)Z", "o", "()V", "b", "()I", "f", "c", "r", "getWidth", "width", "getHeight", "height", "", "getScaleX", "()F", "h", "(F)V", "scaleX", "getScaleY", "m", "scaleY", "getTranslationX", "n", "translationX", "getTranslationY", "e", "translationY", "s", "x", "elevation", "getAmbientShadowColor", "H", "ambientShadowColor", "getSpotShadowColor", "J", "spotShadowColor", "getRotationZ", "l", "rotationZ", "getRotationX", "j", "rotationX", "getRotationY", "k", "rotationY", "getCameraDistance", "i", "cameraDistance", "getPivotX", "D", "pivotX", "getPivotY", "E", "pivotY", "z", "()Z", "I", "(Z)V", "clipToOutline", "q", "v", "clipToBounds", "a", "d", "alpha", "LV0/y1;", "getRenderEffect", "()LV0/y1;", "g", "(LV0/y1;)V", "renderEffect", "p", "hasDisplayList", "Landroidx/compose/ui/graphics/c;", "getCompositingStrategy--NrFUSI", "u", "compositingStrategy", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6043w0 {
    boolean A(boolean hasOverlappingRendering);

    void B(Matrix matrix);

    void C(int offset);

    void D(float f10);

    void E(float f10);

    void F(C5473k0 canvasHolder, V0.q1 clipPath, Function1<? super Canvas, Unit> drawBlock);

    void G(Outline outline);

    void H(int i10);

    void I(boolean z10);

    void J(int i10);

    float a();

    int b();

    int c();

    void d(float f10);

    void e(float f10);

    int f();

    void g(V0.y1 y1Var);

    int getHeight();

    int getWidth();

    void h(float f10);

    void i(float f10);

    void j(float f10);

    void k(float f10);

    void l(float f10);

    void m(float f10);

    void n(float f10);

    void o();

    boolean p();

    boolean q();

    int r();

    float s();

    void t(android.graphics.Canvas canvas);

    void u(int i10);

    void v(boolean z10);

    boolean w(int left, int top, int right, int bottom);

    void x(float f10);

    void y(int offset);

    boolean z();
}
