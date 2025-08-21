package wn;

import Ki.LocalThemeScope;
import Ki.Q;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import com.meijer.mobile.meijer.Y;
import j0.C14889J;
import ki.InterfaceC15148Q;
import ki.q1;
import ki.s1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16338g;
import si.j;
import un.AbstractC17449a;
import wi.s;
import wn.g;
import yn.h;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\r²\u0006\u000e\u0010\f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lyn/h$b;", "viewState", "Lkotlin/Function1;", "Lun/a;", "", "onAction", "c", "(LKi/M;Landroidx/compose/ui/Modifier;Lyn/h$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "isOptOutClicked", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f167299a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC17449a, Unit> f167300b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f167301c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: wn.g$a$a, reason: collision with other inner class name */
        static final class C2662a implements Function3<InterfaceC15148Q, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f167302a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1<AbstractC17449a, Unit> f167303b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f167304c;

            /* JADX WARN: Multi-variable type inference failed */
            C2662a(LocalThemeScope localThemeScope, Function1<? super AbstractC17449a, Unit> function1, InterfaceC5872l0<Boolean> interfaceC5872l0) {
                this.f167302a = localThemeScope;
                this.f167303b = function1;
                this.f167304c = interfaceC5872l0;
            }

            public final void b(InterfaceC15148Q Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-1771876292, i10, -1, "com.meijer.mobile.meijer.activity.rewards.compose.mccOptOutScreen.MccOptOutScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MccOptOutScreen.kt:97)");
                }
                LocalThemeScope localThemeScope = this.f167302a;
                q1.s.Checkbox leadingToggleButton = Assemble.getToggleButtons().getLeadingToggleButton();
                boolean zD = g.d(this.f167304c);
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(this.f167303b);
                final Function1<AbstractC17449a, Unit> function1 = this.f167303b;
                final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f167304c;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: wn.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return g.a.C2662a.c(function1, interfaceC5872l0, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                int i11 = LocalThemeScope.f17314g;
                s.b(localThemeScope, leadingToggleButton, zD, false, false, (Function1) objB, composer, i11 | (q1.s.Checkbox.f142428e << 3), 12);
                j.h(this.f167302a, new q1.Label(null, null, null, null, 0, false, 0, this.f167302a.getAdsTypography().getBody().getTwo(), null, 383, null), C16338g.c(Y.f100761X7, composer, 0), null, composer, i11 | (q1.Label.f142335j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15148Q interfaceC15148Q, Composer composer, Integer num) {
                b(interfaceC15148Q, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1, InterfaceC5872l0 interfaceC5872l0, boolean z10) {
                g.e(interfaceC5872l0, z10);
                function1.invoke(new AbstractC17449a.AcceptOptOut(g.d(interfaceC5872l0)));
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, Function1<? super AbstractC17449a, Unit> function1, InterfaceC5872l0<Boolean> interfaceC5872l0) {
            this.f167299a = localThemeScope;
            this.f167300b = function1;
            this.f167301c = interfaceC5872l0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2063207964, i10, -1, "com.meijer.mobile.meijer.activity.rewards.compose.mccOptOutScreen.MccOptOutScreen.<anonymous>.<anonymous>.<anonymous> (MccOptOutScreen.kt:91)");
            }
            Modifier modifierI = D.i(J.h(Modifier.INSTANCE, 0.0f, 1, null), this.f167299a.getAdsSpacing().getOne().getDp());
            LocalThemeScope localThemeScope = this.f167299a;
            Function1<AbstractC17449a, Unit> function1 = this.f167300b;
            InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f167301c;
            MeasurePolicy measurePolicyB = G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
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
            D1.c(composerA, measurePolicyB, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14889J c14889j = C14889J.f139620a;
            Q.e(localThemeScope, s1.b.f142451a, ComposableLambdaKt.c(-1771876292, true, new C2662a(localThemeScope, function1, interfaceC5872l0), composer, 54), composer, LocalThemeScope.f17314g | 384 | (s1.b.f142452b << 3));
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
    public static final void c(final Ki.LocalThemeScope r45, androidx.compose.ui.Modifier r46, final yn.h.ViewState r47, final kotlin.jvm.functions.Function1<? super un.AbstractC17449a, kotlin.Unit> r48, androidx.compose.runtime.Composer r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 1189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wn.g.c(Ki.M, androidx.compose.ui.Modifier, yn.h$b, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, h.ViewState bVar, Function1 function1, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, modifier, bVar, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Function1 function1, InterfaceC5872l0 interfaceC5872l0) {
        e(interfaceC5872l0, !d(interfaceC5872l0));
        function1.invoke(new AbstractC17449a.AcceptOptOut(d(interfaceC5872l0)));
        return Unit.f143329a;
    }
}
