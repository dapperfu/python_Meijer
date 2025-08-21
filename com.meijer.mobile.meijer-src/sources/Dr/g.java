package Dr;

import Dr.g;
import Ki.C;
import Ki.I;
import Ki.LocalThemeScope;
import Ki.Q;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.G;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import dk.C13698b;
import j0.C14889J;
import j0.InterfaceC14888I;
import ki.C15183n;
import ki.j1;
import ki.q1;
import kotlin.C18054z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.E0;
import p1.C16335d;
import r1.C16819m;
import r1.u;
import yr.C18370z;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0088\u0001\u0010\u0014\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00062\b\b\u0002\u0010\b\u001a\u00020\u00012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001aY\u0010\u001f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00162\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 \u001a\u001d\u0010!\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u0010H\u0002¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lj0/I;", "", "Lkotlin/ExtensionFunctionType;", "actions", "navigationIconModifier", "Lkotlin/Function0;", "title", "navigationIconClick", "LKi/C;", "navigationIcon", "LH1/h;", "elevation", "", "showNavigationIcon", "Lbk/a;", "navigationContentDescription", "f", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;LKi/C;FZLbk/a;Landroidx/compose/runtime/Composer;II)V", "", "isImportantForAccessibility", "subtitle", "", "maxLines", "LKi/I;", "style", "LF1/t;", "overflow", "g", "(LKi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLjava/lang/String;ILKi/I;ILandroidx/compose/runtime/Composer;II)V", "k", "(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f6560a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f6561b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f6562c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f6563d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C f6564e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f6565f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Dr.g$a$a, reason: collision with other inner class name */
        static final class C0126a implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f6566a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f6567b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Modifier f6568c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C f6569d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f6570e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Dr.g$a$a$a, reason: collision with other inner class name */
            static final class C0127a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C f6571a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ AbstractC6392a f6572b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f6573c;

                C0127a(C c10, AbstractC6392a abstractC6392a, LocalThemeScope localThemeScope) {
                    this.f6571a = c10;
                    this.f6572b = abstractC6392a;
                    this.f6573c = localThemeScope;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(213475324, i10, -1, "com.meijer.mobile.ui.common.compose.navigation.AdsTopBar.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsTopBar.kt:75)");
                    }
                    C18054z0.a(C16335d.c(this.f6571a.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), composer, 0), C13698b.a(this.f6572b, composer, AbstractC6392a.f60445b), null, this.f6573c.getAdsColors().getAdsColorInverse().getColor(), composer, 0, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            C0126a(LocalThemeScope localThemeScope, Function0<Unit> function0, Modifier modifier, C c10, AbstractC6392a abstractC6392a) {
                this.f6566a = localThemeScope;
                this.f6567b = function0;
                this.f6568c = modifier;
                this.f6569d = c10;
                this.f6570e = abstractC6392a;
            }

            public final void b(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-7739831, i10, -1, "com.meijer.mobile.ui.common.compose.navigation.AdsTopBar.<anonymous>.<anonymous>.<anonymous> (AdsTopBar.kt:68)");
                }
                LocalThemeScope localThemeScope = this.f6566a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(enabledButton, false, null, null, null, null, null, null, enabledButton.getModifier().then(this.f6568c), false, null, 895, null);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f6567b);
                final Function0<Unit> function0 = this.f6567b;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Dr.f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return g.a.C0126a.c(function0);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(213475324, true, new C0127a(this.f6569d, this.f6570e, this.f6566a), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function0 function0) {
                function0.invoke();
                return Unit.f143329a;
            }
        }

        a(boolean z10, LocalThemeScope localThemeScope, Function0<Unit> function0, Modifier modifier, C c10, AbstractC6392a abstractC6392a) {
            this.f6560a = z10;
            this.f6561b = localThemeScope;
            this.f6562c = function0;
            this.f6563d = modifier;
            this.f6564e = c10;
            this.f6565f = abstractC6392a;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(280654604, i10, -1, "com.meijer.mobile.ui.common.compose.navigation.AdsTopBar.<anonymous> (AdsTopBar.kt:65)");
            }
            if (this.f6560a) {
                LocalThemeScope localThemeScope = this.f6561b;
                Function0<Unit> function0 = this.f6562c;
                Modifier modifier = this.f6563d;
                C c10 = this.f6564e;
                AbstractC6392a abstractC6392a = this.f6565f;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyB = G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.h()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyB, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14889J c14889j = C14889J.f139620a;
                Q.e(localThemeScope, C15183n.f142165a, ComposableLambdaKt.c(-7739831, true, new C0126a(localThemeScope, function0, modifier, c10, abstractC6392a), composer, 54), composer, LocalThemeScope.f17314g | 384 | (C15183n.f142166b << 3));
                composer.v();
            }
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

    private static final Modifier k(Modifier modifier, boolean z10) {
        return C18370z.f(modifier.then(z10 ? C16819m.d(Modifier.INSTANCE, false, new Function1() { // from class: Dr.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.l((u) obj);
            }
        }, 1, null) : C16819m.a(Modifier.INSTANCE, new Function1() { // from class: Dr.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.m((u) obj);
            }
        })), "topBarTitle", null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final Ki.LocalThemeScope r26, androidx.compose.ui.Modifier r27, kotlin.jvm.functions.Function3<? super j0.InterfaceC14888I, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r28, androidx.compose.ui.Modifier r29, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, kotlin.jvm.functions.Function0<kotlin.Unit> r31, Ki.C r32, float r33, boolean r34, final bk.AbstractC6392a r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Dr.g.f(Ki.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, Ki.C, float, boolean, bk.a, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ki.LocalThemeScope r38, final java.lang.String r39, androidx.compose.ui.Modifier r40, boolean r41, java.lang.String r42, int r43, Ki.I r44, int r45, androidx.compose.runtime.Composer r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Dr.g.g(Ki.M, java.lang.String, androidx.compose.ui.Modifier, boolean, java.lang.String, int, Ki.I, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, String str, Modifier modifier, boolean z10, String str2, int i10, I i11, int i12, int i13, int i14, Composer composer, int i15) {
        g(localThemeScope, str, modifier, z10, str2, i10, i11, i12, composer, J0.a(i13 | 1), i14);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, Modifier modifier, Function3 function3, Modifier modifier2, Function2 function2, Function0 function0, C c10, float f10, boolean z10, AbstractC6392a abstractC6392a, int i10, int i11, Composer composer, int i12) {
        f(localThemeScope, modifier, function3, modifier2, function2, function0, c10, f10, z10, abstractC6392a, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.v(semantics);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(u clearAndSetSemantics) {
        Intrinsics.j(clearAndSetSemantics, "$this$clearAndSetSemantics");
        return Unit.f143329a;
    }
}
