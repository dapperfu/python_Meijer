package Gj;

import Ki.C;
import Ki.LocalThemeScope;
import Ki.T;
import P0.e;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import dk.C13698b;
import j0.C14903g;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qi.C16671b;
import si.j;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aC\u0010\f\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "LKi/C;", BarcodePickDeserializer.FIELD_ICON, "Lbk/a;", "text", "LKi/T;", "tintColor", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "clickAction", "b", "(LKi/M;LKi/C;Lbk/a;LKi/T;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f13081a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C f13082b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f13083c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f13084d;

        a(LocalThemeScope localThemeScope, C c10, T t10, AbstractC6392a abstractC6392a) {
            this.f13081a = localThemeScope;
            this.f13082b = c10;
            this.f13083c = t10;
            this.f13084d = abstractC6392a;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1442076373, i10, -1, "com.meijer.mobile.core.design.compose.widget.SeeMoreItem.<anonymous> (SeeMoreItem.kt:53)");
            }
            e.b bVarG = e.INSTANCE.g();
            Modifier modifierD = J.D(Modifier.INSTANCE, null, false, 3, null);
            LocalThemeScope localThemeScope = this.f13081a;
            C c10 = this.f13082b;
            T t10 = this.f13083c;
            AbstractC6392a abstractC6392a = this.f13084d;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), bVarG, composer, 48);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14903g c14903g = C14903g.f139698a;
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(c10, null, null, null, 0.0f, t10, null, 92, null);
            int i11 = LocalThemeScope.f17314g;
            C16671b.b(localThemeScope, drawableIcon, null, null, composer, (q1.h.DrawableIcon.f142322h << 3) | i11, 6);
            j.h(localThemeScope, new q1.Label(null, t10, null, F1.j.h(F1.j.INSTANCE.a()), 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 373, null), C13698b.a(abstractC6392a, composer, AbstractC6392a.f60445b), null, composer, i11 | (q1.Label.f142335j << 3), 4);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r21, final Ki.C r22, final bk.AbstractC6392a r23, final Ki.T r24, androidx.compose.ui.Modifier r25, final kotlin.jvm.functions.Function0<kotlin.Unit> r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Gj.b.b(Ki.M, Ki.C, bk.a, Ki.T, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, C c10, AbstractC6392a abstractC6392a, T t10, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, c10, abstractC6392a, t10, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
