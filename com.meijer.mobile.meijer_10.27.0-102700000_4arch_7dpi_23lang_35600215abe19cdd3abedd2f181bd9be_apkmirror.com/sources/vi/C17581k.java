package vi;

import X0.Stroke;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import d0.C13443j;
import kotlin.C17871B0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import vi.C17581k;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lvi/g;", "Landroidx/compose/ui/Modifier;", "modifier", "", "c", "(Lvi/g;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: vi.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C17581k {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: vi.k$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f164737a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC17577g f164738b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f164739c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ z1<H1.h> f164740d;

        a(Modifier modifier, InterfaceC17577g interfaceC17577g, Modifier modifier2, z1<H1.h> z1Var) {
            this.f164737a = modifier;
            this.f164738b = interfaceC17577g;
            this.f164739c = modifier2;
            this.f164740d = z1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC17577g interfaceC17577g, z1 z1Var, X0.f Canvas) {
            Intrinsics.j(Canvas, "$this$Canvas");
            float fI1 = Canvas.I1(H1.h.p(1));
            float f10 = fI1 / 2;
            X0.f.f1(Canvas, !interfaceC17577g.getEnabled() ? interfaceC17577g.getTemplate().getColors().getDisabledColor().getColor() : interfaceC17577g.getChecked() ? interfaceC17577g.getTemplate().getColors().getCheckedEnabledColor().getColor() : interfaceC17577g.getTemplate().getColors().getUncheckedEnabledColor().getColor(), Canvas.I1(H1.h.p(10)) - f10, 0L, 0.0f, new Stroke(fI1, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
            if (H1.h.o(((H1.h) z1Var.getValue()).getValue(), H1.h.p(0)) > 0) {
                X0.f.f1(Canvas, (interfaceC17577g.getEnabled() || !interfaceC17577g.getChecked()) ? interfaceC17577g.getChecked() ? interfaceC17577g.getTemplate().getColors().getCheckedEnabledColor().getColor() : interfaceC17577g.getTemplate().getColors().getCheckmarkColor().getColor() : interfaceC17577g.getTemplate().getColors().getDisabledColor().getColor(), Canvas.I1(((H1.h) z1Var.getValue()).getValue()) - f10, 0L, 0.0f, X0.j.f39072a, null, 0, 108, null);
            }
            return Unit.f142422a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-195058796, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.toggle_button.RadioButtonFromScope.<anonymous> (RadioButton.kt:93)");
            }
            Modifier modifierV = J.v(D.i(J.F(this.f164737a.then(this.f164738b.P() != null ? C17871B0.d(Modifier.INSTANCE) : Modifier.INSTANCE).then(this.f164739c), P0.e.INSTANCE.e(), false, 2, null), this.f164738b.c().getAdsSpacing().getOne().getDp()), this.f164738b.c().getAdsSpacing().getSix().getDp());
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(this.f164738b) | composer.V(this.f164740d);
            final InterfaceC17577g interfaceC17577g = this.f164738b;
            final z1<H1.h> z1Var = this.f164740d;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: vi.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C17581k.a.c(interfaceC17577g, z1Var, (X0.f) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C13443j.a(modifierV, (Function1) objB, composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final vi.InterfaceC17577g r27, androidx.compose.ui.Modifier r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vi.C17581k.c(vi.g, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(InterfaceC17577g interfaceC17577g, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        c(interfaceC17577g, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(InterfaceC17577g interfaceC17577g) {
        Function1<Boolean, Unit> function1P;
        if (interfaceC17577g.P() != null && interfaceC17577g.getEnabled() && (function1P = interfaceC17577g.P()) != null) {
            function1P.invoke(Boolean.valueOf(!interfaceC17577g.getChecked()));
        }
        return Unit.f142422a;
    }
}
