package androidx.compose.ui.graphics.layer;

import H1.t;
import V0.C5489q0;
import V0.C5490r0;
import V0.y1;
import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.Canvas;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b`\u0018\u0000 02\u00020\u0001:\u00010J*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00070\u0019¢\u0006\u0002\b\u001bH&¢\u0006\u0004\b\u0003\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H&¢\u0006\u0004\b!\u0010\"R\"\u0010(\u001a\u00020#8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010.\u001a\u00020)8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u00104\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00108\u001a\u0002058&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b6\u0010%\"\u0004\b7\u0010'R\u001e\u0010>\u001a\u0004\u0018\u0001098&@&X¦\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010A\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\b?\u00101\"\u0004\b@\u00103R\u001c\u0010D\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\bB\u00101\"\u0004\bC\u00103R\u001c\u0010G\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\bE\u00101\"\u0004\bF\u00103R\u001c\u0010J\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\bH\u00101\"\u0004\bI\u00103R\u001c\u0010M\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\bK\u00101\"\u0004\bL\u00103R\"\u0010Q\u001a\u00020N8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bO\u0010+\"\u0004\bP\u0010-R\"\u0010T\u001a\u00020N8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bR\u0010+\"\u0004\bS\u0010-R\u001c\u0010W\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\bU\u00101\"\u0004\bV\u00103R\u001c\u0010Z\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\bX\u00101\"\u0004\bY\u00103R\u001c\u0010\\\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u00101\"\u0004\b[\u00103R\u001c\u0010_\u001a\u00020/8&@&X¦\u000e¢\u0006\f\u001a\u0004\b]\u00101\"\u0004\b^\u00103R\u001c\u0010e\u001a\u00020`8&@&X¦\u000e¢\u0006\f\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001e\u0010k\u001a\u0004\u0018\u00010f8&@&X¦\u000e¢\u0006\f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u001c\u0010l\u001a\u00020`8&@&X¦\u000e¢\u0006\f\u001a\u0004\bl\u0010b\"\u0004\bm\u0010dR\u0014\u0010o\u001a\u00020`8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010bR\u0014\u0010q\u001a\u00020`8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010bø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006rÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/b;", "", "", "x", "y", "LH1/r;", "size", "", "t", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "outlineSize", "I", "(Landroid/graphics/Outline;J)V", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "M", "(Landroidx/compose/ui/graphics/Canvas;)V", "LH1/d;", "density", "LH1/t;", "layoutDirection", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "Lkotlin/Function1;", "LX0/f;", "Lkotlin/ExtensionFunctionType;", "block", "(LH1/d;LH1/t;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "o", "()V", "Landroid/graphics/Matrix;", "A", "()Landroid/graphics/Matrix;", "Landroidx/compose/ui/graphics/layer/a;", "s", "()I", "K", "(I)V", "compositingStrategy", "LU0/f;", "getPivotOffset-F1C5BW0", "()J", "J", "(J)V", "pivotOffset", "", "a", "()F", "d", "(F)V", "alpha", "LV0/c0;", "q", "setBlendMode-s9anfk8", "blendMode", "LV0/r0;", "f", "()LV0/r0;", "setColorFilter", "(LV0/r0;)V", "colorFilter", "G", "h", "scaleX", "V", "m", "scaleY", "Q", "n", "translationX", "P", "e", "translationY", "L", "H", "shadowElevation", "LV0/q0;", "u", "z", "ambientShadowColor", "w", "E", "spotShadowColor", "S", "j", "rotationX", "v", "k", "rotationY", "l", "rotationZ", "C", "i", "cameraDistance", "", "getClip", "()Z", "D", "(Z)V", "clip", "LV0/y1;", "r", "()LV0/y1;", "g", "(LV0/y1;)V", "renderEffect", "isInvalidated", "F", "B", "supportsSoftwareRendering", "p", "hasDisplayList", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f51049a;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/layer/b$a;", "", "<init>", "()V", "Lkotlin/Function1;", "LX0/f;", "", "Lkotlin/ExtensionFunctionType;", "b", "Lkotlin/jvm/functions/Function1;", "a", "()Lkotlin/jvm/functions/Function1;", "DefaultDrawBlock", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.layer.b$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f51049a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final Function1<X0.f, Unit> DefaultDrawBlock = C1061a.f51051f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/f;", "", "a", "(LX0/f;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.ui.graphics.layer.b$a$a, reason: collision with other inner class name */
        static final class C1061a extends Lambda implements Function1<X0.f, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final C1061a f51051f = new C1061a();

            C1061a() {
                super(1);
            }

            public final void a(X0.f fVar) {
                X0.f.i1(fVar, C5489q0.INSTANCE.i(), 0L, 0L, 0.0f, null, null, 0, 126, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(X0.f fVar) {
                a(fVar);
                return Unit.f143329a;
            }
        }

        public final Function1<X0.f, Unit> a() {
            return DefaultDrawBlock;
        }

        private Companion() {
        }
    }

    Matrix A();

    /* renamed from: B */
    default boolean getSupportsSoftwareRendering() {
        return false;
    }

    /* renamed from: C */
    float getCameraDistance();

    void D(boolean z10);

    void E(long j10);

    void F(boolean z10);

    /* renamed from: G */
    float getScaleX();

    void H(float f10);

    void I(Outline outline, long outlineSize);

    void J(long j10);

    void K(int i10);

    /* renamed from: L */
    float getShadowElevation();

    void M(Canvas canvas);

    /* renamed from: P */
    float getTranslationY();

    /* renamed from: Q */
    float getTranslationX();

    /* renamed from: S */
    float getRotationX();

    /* renamed from: V */
    float getScaleY();

    /* renamed from: a */
    float getAlpha();

    void d(float f10);

    void e(float f10);

    /* renamed from: f */
    C5490r0 getColorFilter();

    void g(y1 y1Var);

    void h(float f10);

    void i(float f10);

    void j(float f10);

    void k(float f10);

    void l(float f10);

    void m(float f10);

    void n(float f10);

    void o();

    default boolean p() {
        return true;
    }

    /* renamed from: q */
    int getBlendMode();

    y1 r();

    /* renamed from: s */
    int getCompositingStrategy();

    void t(int x10, int y10, long size);

    /* renamed from: u */
    long getAmbientShadowColor();

    /* renamed from: v */
    float getRotationY();

    /* renamed from: w */
    long getSpotShadowColor();

    void x(H1.d density, t layoutDirection, GraphicsLayer layer, Function1<? super X0.f, Unit> block);

    /* renamed from: y */
    float getRotationZ();

    void z(long j10);
}
