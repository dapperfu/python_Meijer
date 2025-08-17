package androidx.compose.ui.graphics;

import U0.k;
import V0.D1;
import V0.y1;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0004\"\u0004\b\t\u0010\u0006R\u001c\u0010\r\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0004\"\u0004\b\f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u0004\"\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0013\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0004\"\u0004\b\u0012\u0010\u0006R\u001c\u0010\u0016\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0004\"\u0004\b\u0015\u0010\u0006R*\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00178V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001c\u0010\"\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b \u0010\u0004\"\u0004\b!\u0010\u0006R\u001c\u0010%\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b#\u0010\u0004\"\u0004\b$\u0010\u0006R\u001c\u0010(\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b&\u0010\u0004\"\u0004\b'\u0010\u0006R\u001c\u0010+\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b)\u0010\u0004\"\u0004\b*\u0010\u0006R\"\u0010/\u001a\u00020,8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\u001c\u00105\u001a\u0002008&@&X¦\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068f@&X¦\u000e¢\u0006\u0012\u0012\u0004\b;\u0010<\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R(\u0010D\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010>8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR*\u0010F\u001a\u00020E2\u0006\u0010F\u001a\u00020E8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001a\u0010M\u001a\u00020K8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bL\u0010\u001aø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006NÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/e;", "LH1/d;", "", "G", "()F", "h", "(F)V", "scaleX", "V", "m", "scaleY", "getAlpha", "d", "alpha", "Q", "n", "translationX", "P", "e", "translationY", "getShadowElevation", "H", "shadowElevation", "LV0/q0;", "ambientShadowColor", "getAmbientShadowColor-0d7_KjU", "()J", "z", "(J)V", "spotShadowColor", "getSpotShadowColor-0d7_KjU", "E", "S", "j", "rotationX", "v", "k", "rotationY", "y", "l", "rotationZ", "C", "i", "cameraDistance", "Landroidx/compose/ui/graphics/i;", "D0", "F0", "transformOrigin", "LV0/D1;", "getShape", "()LV0/D1;", "K1", "(LV0/D1;)V", "shape", "", "getClip", "()Z", "D", "(Z)V", "getClip$annotations", "()V", "clip", "LV0/y1;", "<anonymous parameter 0>", "getRenderEffect", "()LV0/y1;", "g", "(LV0/y1;)V", "renderEffect", "Landroidx/compose/ui/graphics/c;", "compositingStrategy", "getCompositingStrategy--NrFUSI", "()I", "u", "(I)V", "LU0/k;", "b", "size", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface e extends H1.d {
    float C();

    void D(boolean z10);

    long D0();

    default void E(long j10) {
    }

    void F0(long j10);

    float G();

    void H(float f10);

    void K1(D1 d12);

    float P();

    float Q();

    float S();

    float V();

    void d(float f10);

    void e(float f10);

    default void g(y1 y1Var) {
    }

    void h(float f10);

    void i(float f10);

    void j(float f10);

    void k(float f10);

    void l(float f10);

    void m(float f10);

    void n(float f10);

    default void u(int i10) {
    }

    float v();

    float y();

    default void z(long j10) {
    }

    default long b() {
        return k.INSTANCE.a();
    }
}
