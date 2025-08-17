package ji;

import F1.j;
import Ji.C;
import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import d0.C13442i;
import ji.C14924a0;
import ji.q1;
import kotlin.C17979v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import r0.C16692i;
import r1.C16705m;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lji/a0;", "Lji/w1;", "Lji/R0;", "<init>", "()V", "LJi/M;", "themeScope", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)Lji/R0;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ji.a0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C14924a0 implements w1<R0> {

    /* renamed from: a, reason: collision with root package name */
    public static final C14924a0 f139754a = new C14924a0();

    /* renamed from: b, reason: collision with root package name */
    public static final int f139755b = 0;

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, d2 = {"ji/a0$a", "Lji/R0;", "Lji/q1$l;", "a", "Lji/q1$l;", "p", "()Lji/q1$l;", "modalTemplate", "Lji/U0;", "b", "Lji/U0;", "()Lji/U0;", "labels", "Lji/T0;", "c", "Lji/T0;", "()Lji/T0;", "icons", "Lji/S0;", "d", "Lji/S0;", "()Lji/S0;", "buttons", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: ji.a0$a */
    public static final class a implements R0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final q1.ModalTemplate modalTemplate;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ModalText labels;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final ModalIcons icons;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final ModalButtons buttons;

        a(LocalThemeScope localThemeScope, Composer composer) {
            float f10 = 1;
            this.modalTemplate = new q1.ModalTemplate(null, C16692i.c(localThemeScope.getAdsCornerRadii().getRadius05().getDp()), H1.h.p(f10), 1, null);
            Ji.I six = localThemeScope.getAdsTypography().getHeadings().getSix();
            j.Companion companion = F1.j.INSTANCE;
            int iA = companion.a();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            this.labels = new ModalText(new q1.Label(C16705m.d(companion2, false, new Function1() { // from class: ji.Y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C14924a0.a.t((r1.u) obj);
                }
            }, 1, null), null, null, F1.j.h(iA), 0, false, 0, six, null, 374, null), new q1.Label(null, null, null, F1.j.h(companion.a()), 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getOne(), null, 375, null));
            float f11 = 48;
            this.icons = new ModalIcons(new q1.h.DrawableIcon(C.i.n.f15565d, null, null, null, 0.0f, null, androidx.compose.foundation.layout.J.v(companion2, H1.h.p(f11)), 62, null), new q1.h.DrawableIcon(C.i.b.f15549d, null, null, null, 0.0f, null, androidx.compose.foundation.layout.J.v(companion2, H1.h.p(f11)), 62, null));
            Modifier modifierC = C16705m.c(androidx.compose.foundation.layout.J.v(companion2, H1.h.p(40)), true, new Function1() { // from class: ji.Z
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C14924a0.a.s((r1.u) obj);
                }
            });
            C17979v c17979v = C17979v.f168713a;
            float f12 = 0;
            float fP = H1.h.p(f12);
            float fP2 = H1.h.p(f12);
            float fP3 = H1.h.p(f12);
            float fP4 = H1.h.p(f12);
            float fP5 = H1.h.p(f12);
            int i10 = C17979v.f168724l;
            float f13 = 16;
            this.buttons = new ModalButtons(new q1.d.ModalButton(modifierC, false, null, c17979v.b(fP, fP2, fP3, fP4, fP5, composer, (i10 << 15) | 28086, 0), C16692i.f(), null, c17979v.a(localThemeScope.getAdsColors().getAdsColorInverse().getColor(), 0L, 0L, 0L, composer, i10 << 12, 14), null, false, null, 902, null), new q1.h.DrawableIcon(C.f.o.f15522e, null, null, null, 0.0f, null, androidx.compose.foundation.layout.J.o(companion2, H1.h.p(24)), 62, null), new q1.d.ModalButton(androidx.compose.foundation.layout.J.b(androidx.compose.foundation.layout.D.k(androidx.compose.foundation.layout.J.h(companion2, 0.0f, 1, null), H1.h.p(f13), 0.0f, 2, null), 0.0f, H1.h.p(f11), 1, null), false, null, c17979v.b(H1.h.p(f12), H1.h.p(f12), H1.h.p(f12), H1.h.p(f12), H1.h.p(f12), composer, (i10 << 15) | 28086, 0), null, null, c17979v.a(localThemeScope.getAdsColors().getAdsColorEnabled01().getColor(), 0L, 0L, 0L, composer, i10 << 12, 14), null, false, null, 950, null), new q1.d.ModalButton(androidx.compose.foundation.layout.J.b(androidx.compose.foundation.layout.D.k(androidx.compose.foundation.layout.J.h(companion2, 0.0f, 1, null), H1.h.p(f13), 0.0f, 2, null), 0.0f, H1.h.p(f11), 1, null), false, null, c17979v.b(H1.h.p(f12), H1.h.p(f12), H1.h.p(f12), H1.h.p(f12), H1.h.p(f12), composer, (i10 << 15) | 28086, 0), null, C13442i.a(H1.h.p(f10), localThemeScope.getAdsColors().getAdsColorEnabled01().getColor()), c17979v.a(localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), 0L, 0L, 0L, composer, i10 << 12, 14), null, false, null, 918, null), new q1.Label(null, localThemeScope.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), new q1.Label(null, localThemeScope.getAdsColors().getAdsColorEnabled01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.s0(semantics, Role.INSTANCE.a());
            r1.s.k0(semantics, true);
            r1.s.g0(semantics, "Dismiss");
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.v(semantics);
            return Unit.f142422a;
        }

        @Override // ji.R0
        /* renamed from: a, reason: from getter */
        public ModalText getLabels() {
            return this.labels;
        }

        @Override // ji.R0
        /* renamed from: b, reason: from getter */
        public ModalIcons getIcons() {
            return this.icons;
        }

        @Override // ji.R0
        /* renamed from: d, reason: from getter */
        public ModalButtons getButtons() {
            return this.buttons;
        }

        @Override // ji.R0
        /* renamed from: p, reason: from getter */
        public q1.ModalTemplate getModalTemplate() {
            return this.modalTemplate;
        }
    }

    @Override // ji.w1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public R0 q(LocalThemeScope themeScope, Composer composer, int i10) {
        Intrinsics.j(themeScope, "themeScope");
        composer.startReplaceGroup(-716607055);
        if (ComposerKt.M()) {
            ComposerKt.U(-716607055, i10, -1, "com.meijer.mobile.android_acres_library.assemblies.DefaultModalVariant.generateAssembly (ModalVariants.kt:54)");
        }
        a aVar = new a(themeScope, composer);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return aVar;
    }

    private C14924a0() {
    }
}
