package kotlin;

import V0.C5489q0;
import V0.C5492s0;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import d0.BorderStroke;
import d0.C13575i;
import j0.InterfaceC14882C;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J0\u0010\u0017\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0017\u0010 \u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u001d\u0010#\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b!\u0010\"R\u001d\u0010%\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b\u001d\u0010\"R\u001d\u0010(\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010\"R\u001d\u0010*\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b)\u0010\"R\u001d\u0010,\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b+\u0010\"R\u001a\u0010.\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b-\u0010\u0018R\u0017\u00100\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b/\u0010\u001e\u001a\u0004\b&\u0010\u001fR\u0011\u00103\u001a\u0002018G¢\u0006\u0006\u001a\u0004\b$\u00102\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Lx0/v;", "", "<init>", "()V", "LH1/h;", "defaultElevation", "pressedElevation", "disabledElevation", "hoveredElevation", "focusedElevation", "Lx0/w;", "b", "(FFFFFLandroidx/compose/runtime/Composer;II)Lx0/w;", "LV0/q0;", "backgroundColor", "contentColor", "disabledBackgroundColor", "disabledContentColor", "Lx0/u;", "a", "(JJJJLandroidx/compose/runtime/Composer;II)Lx0/u;", "h", "(JJJLandroidx/compose/runtime/Composer;II)Lx0/u;", "i", "F", "ButtonHorizontalPadding", "c", "ButtonVerticalPadding", "Lj0/C;", "d", "Lj0/C;", "()Lj0/C;", "ContentPadding", "e", "()F", "MinWidth", "f", "MinHeight", "g", "getIconSize-D9Ej5fM", "IconSize", "getIconSpacing-D9Ej5fM", "IconSpacing", "getOutlinedBorderSize-D9Ej5fM", "OutlinedBorderSize", "j", "TextButtonHorizontalPadding", "k", "TextButtonContentPadding", "Ld0/h;", "(Landroidx/compose/runtime/Composer;I)Ld0/h;", "outlinedBorder", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18045v {

    /* renamed from: a, reason: collision with root package name */
    public static final C18045v f169801a = new C18045v();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float ButtonHorizontalPadding;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float ButtonVerticalPadding;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final InterfaceC14882C ContentPadding;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float MinWidth;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float MinHeight;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final float IconSpacing;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final float OutlinedBorderSize;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final float TextButtonHorizontalPadding;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final InterfaceC14882C TextButtonContentPadding;

    /* renamed from: l, reason: collision with root package name */
    public static final int f169812l = 0;

    static {
        float fP = H1.h.p(16);
        ButtonHorizontalPadding = fP;
        float f10 = 8;
        float fP2 = H1.h.p(f10);
        ButtonVerticalPadding = fP2;
        InterfaceC14882C interfaceC14882CD = D.d(fP, fP2, fP, fP2);
        ContentPadding = interfaceC14882CD;
        MinWidth = H1.h.p(64);
        MinHeight = H1.h.p(36);
        IconSize = H1.h.p(18);
        IconSpacing = H1.h.p(f10);
        OutlinedBorderSize = H1.h.p(1);
        float fP3 = H1.h.p(f10);
        TextButtonHorizontalPadding = fP3;
        TextButtonContentPadding = D.d(fP3, interfaceC14882CD.getTop(), fP3, interfaceC14882CD.getBottom());
    }

    public final InterfaceC18043u a(long j10, long j11, long j12, long j13, Composer composer, int i10, int i11) {
        long jG;
        long j14 = (i11 & 1) != 0 ? C17943E0.f167967a.a(composer, 6).j() : j10;
        long jB = (i11 & 2) != 0 ? C17942E.b(j14, composer, i10 & 14) : j11;
        if ((i11 & 4) != 0) {
            C17943E0 c17943e0 = C17943E0.f167967a;
            jG = C5492s0.g(C5489q0.q(c17943e0.a(composer, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), c17943e0.a(composer, 6).n());
        } else {
            jG = j12;
        }
        long jQ = (i11 & 8) != 0 ? C5489q0.q(C17943E0.f167967a.a(composer, 6).i(), C17956L.f168212a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.M()) {
            ComposerKt.U(1870371134, i10, -1, "androidx.compose.material.ButtonDefaults.buttonColors (Button.kt:415)");
        }
        C17962O c17962o = new C17962O(j14, jB, jG, jQ, null);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c17962o;
    }

    public final InterfaceC18047w b(float f10, float f11, float f12, float f13, float f14, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = H1.h.p(2);
        }
        float f15 = f10;
        if ((i11 & 2) != 0) {
            f11 = H1.h.p(8);
        }
        float f16 = f11;
        if ((i11 & 4) != 0) {
            f12 = H1.h.p(0);
        }
        float f17 = f12;
        if ((i11 & 8) != 0) {
            f13 = H1.h.p(4);
        }
        float f18 = f13;
        if ((i11 & 16) != 0) {
            f14 = H1.h.p(4);
        }
        float f19 = f14;
        if (ComposerKt.M()) {
            ComposerKt.U(-737170518, i10, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:377)");
        }
        boolean z10 = ((((i10 & 14) ^ 6) > 4 && composer.b(f15)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && composer.b(f16)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && composer.b(f17)) || (i10 & 384) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && composer.b(f18)) || (i10 & 3072) == 2048) | ((((57344 & i10) ^ 24576) > 16384 && composer.b(f19)) || (i10 & 24576) == 16384);
        Object objB = composer.B();
        if (z10 || objB == Composer.INSTANCE.a()) {
            C17964P c17964p = new C17964P(f15, f16, f17, f18, f19, null);
            composer.t(c17964p);
            objB = c17964p;
        }
        C17964P c17964p2 = (C17964P) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c17964p2;
    }

    public final InterfaceC14882C c() {
        return ContentPadding;
    }

    public final float d() {
        return MinHeight;
    }

    public final float e() {
        return MinWidth;
    }

    public final InterfaceC14882C g() {
        return TextButtonContentPadding;
    }

    public final InterfaceC18043u h(long j10, long j11, long j12, Composer composer, int i10, int i11) {
        long jN = (i11 & 1) != 0 ? C17943E0.f167967a.a(composer, 6).n() : j10;
        long j13 = (i11 & 2) != 0 ? C17943E0.f167967a.a(composer, 6).j() : j11;
        long jQ = (i11 & 4) != 0 ? C5489q0.q(C17943E0.f167967a.a(composer, 6).i(), C17956L.f168212a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12;
        if (ComposerKt.M()) {
            ComposerKt.U(-2124406093, i10, -1, "androidx.compose.material.ButtonDefaults.outlinedButtonColors (Button.kt:437)");
        }
        C17962O c17962o = new C17962O(jN, j13, jN, jQ, null);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c17962o;
    }

    public final InterfaceC18043u i(long j10, long j11, long j12, Composer composer, int i10, int i11) {
        long jI = (i11 & 1) != 0 ? C5489q0.INSTANCE.i() : j10;
        long j13 = (i11 & 2) != 0 ? C17943E0.f167967a.a(composer, 6).j() : j11;
        long jQ = (i11 & 4) != 0 ? C5489q0.q(C17943E0.f167967a.a(composer, 6).i(), C17956L.f168212a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j12;
        if (ComposerKt.M()) {
            ComposerKt.U(182742216, i10, -1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:459)");
        }
        C17962O c17962o = new C17962O(jI, j13, jI, jQ, null);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c17962o;
    }

    private C18045v() {
    }

    @JvmName
    public final BorderStroke f(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-2091313033, i10, -1, "androidx.compose.material.ButtonDefaults.<get-outlinedBorder> (Button.kt:476)");
        }
        BorderStroke borderStrokeA = C13575i.a(OutlinedBorderSize, C5489q0.q(C17943E0.f167967a.a(composer, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return borderStrokeA;
    }
}
