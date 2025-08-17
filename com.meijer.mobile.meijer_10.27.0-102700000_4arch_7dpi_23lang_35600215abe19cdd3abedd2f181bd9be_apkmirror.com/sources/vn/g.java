package vn;

import Ji.LocalThemeScope;
import Ji.Q;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import com.meijer.mobile.meijer.Y;
import j0.C14801J;
import ji.InterfaceC14914Q;
import ji.q1;
import ji.s1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16193g;
import ri.j;
import tn.AbstractC17125a;
import vi.s;
import vn.g;
import xn.h;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\r²\u0006\u000e\u0010\f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lxn/h$b;", "viewState", "Lkotlin/Function1;", "Ltn/a;", "", "onAction", "c", "(LJi/M;Landroidx/compose/ui/Modifier;Lxn/h$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "isOptOutClicked", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f164877a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC17125a, Unit> f164878b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f164879c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: vn.g$a$a, reason: collision with other inner class name */
        static final class C2602a implements Function3<InterfaceC14914Q, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f164880a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<AbstractC17125a, Unit> f164881b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f164882c;

            /* JADX WARN: Multi-variable type inference failed */
            C2602a(LocalThemeScope localThemeScope, Function1<? super AbstractC17125a, Unit> function1, InterfaceC5730l0<Boolean> interfaceC5730l0) {
                this.f164880a = localThemeScope;
                this.f164881b = function1;
                this.f164882c = interfaceC5730l0;
            }

            public final void b(InterfaceC14914Q Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-1771876292, i10, -1, "com.meijer.mobile.meijer.activity.rewards.compose.mccOptOutScreen.MccOptOutScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MccOptOutScreen.kt:97)");
                }
                LocalThemeScope localThemeScope = this.f164880a;
                q1.s.Checkbox leadingToggleButton = Assemble.getToggleButtons().getLeadingToggleButton();
                boolean zD = g.d(this.f164882c);
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(this.f164881b);
                final Function1<AbstractC17125a, Unit> function1 = this.f164881b;
                final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f164882c;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: vn.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return g.a.C2602a.c(function1, interfaceC5730l0, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                int i11 = LocalThemeScope.f15770g;
                s.b(localThemeScope, leadingToggleButton, zD, false, false, (Function1) objB, composer, i11 | (q1.s.Checkbox.f140173e << 3), 12);
                j.h(this.f164880a, new q1.Label(null, null, null, null, 0, false, 0, this.f164880a.getAdsTypography().getBody().getTwo(), null, 383, null), C16193g.c(Y.f99842U7, composer, 0), null, composer, i11 | (q1.Label.f140080j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14914Q interfaceC14914Q, Composer composer, Integer num) {
                b(interfaceC14914Q, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1, InterfaceC5730l0 interfaceC5730l0, boolean z10) {
                g.e(interfaceC5730l0, z10);
                function1.invoke(new AbstractC17125a.AcceptOptOut(g.d(interfaceC5730l0)));
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, Function1<? super AbstractC17125a, Unit> function1, InterfaceC5730l0<Boolean> interfaceC5730l0) {
            this.f164877a = localThemeScope;
            this.f164878b = function1;
            this.f164879c = interfaceC5730l0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2063207964, i10, -1, "com.meijer.mobile.meijer.activity.rewards.compose.mccOptOutScreen.MccOptOutScreen.<anonymous>.<anonymous>.<anonymous> (MccOptOutScreen.kt:91)");
            }
            Modifier modifierI = D.i(J.h(Modifier.INSTANCE, 0.0f, 1, null), this.f164877a.getAdsSpacing().getOne().getDp());
            LocalThemeScope localThemeScope = this.f164877a;
            Function1<AbstractC17125a, Unit> function1 = this.f164878b;
            InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f164879c;
            MeasurePolicy measurePolicyB = G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyB, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14801J c14801j = C14801J.f139030a;
            Q.e(localThemeScope, s1.b.f140196a, ComposableLambdaKt.c(-1771876292, true, new C2602a(localThemeScope, function1, interfaceC5730l0), composer, 54), composer, LocalThemeScope.f15770g | 384 | (s1.b.f140197b << 3));
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0306  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ji.LocalThemeScope r45, androidx.compose.ui.Modifier r46, final xn.h.ViewState r47, final kotlin.jvm.functions.Function1<? super tn.AbstractC17125a, kotlin.Unit> r48, androidx.compose.runtime.Composer r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 1189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vn.g.c(Ji.M, androidx.compose.ui.Modifier, xn.h$b, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, h.ViewState bVar, Function1 function1, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, modifier, bVar, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Function1 function1, InterfaceC5730l0 interfaceC5730l0) {
        e(interfaceC5730l0, !d(interfaceC5730l0));
        function1.invoke(new AbstractC17125a.AcceptOptOut(d(interfaceC5730l0)));
        return Unit.f142422a;
    }
}
