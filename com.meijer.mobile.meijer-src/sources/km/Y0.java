package km;

import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import com.fullstory.compose.FullStoryAnnotationsKt;
import gm.HomeMperksDecorator;
import j0.C14903g;
import java.util.List;
import km.Y0;
import kotlin.AbstractC16037C;
import kotlin.InterfaceC16060u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001aU\u0010\u000f\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0012\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0007\u001a3\u0010\u0018\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LKi/M;", "Lkotlin/Function0;", "", "onLearnMoreClicked", "Landroidx/compose/ui/Modifier;", "modifier", "p", "(LKi/M;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lgm/b;", "mperksDecorator", "Lkotlin/Function1;", "Lfm/c;", "onAction", "onRedeemRewardsTabClicked", "onYourRewardsTabClicked", "j", "(LKi/M;Lgm/b;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "onRetryClicked", "m", "", "Lkm/O;", "items", "Lo0/C;", "pagerState", "h", "(LKi/M;Ljava/util/List;Lo0/C;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ux_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class Y0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function4<InterfaceC16060u, Integer, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<AbstractC15237O> f142846a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f142847b;

        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends AbstractC15237O> list, LocalThemeScope localThemeScope) {
            this.f142846a = list;
            this.f142847b = localThemeScope;
        }

        public final void a(InterfaceC16060u HorizontalPager, int i10, Composer composer, int i11) {
            Intrinsics.j(HorizontalPager, "$this$HorizontalPager");
            if (ComposerKt.M()) {
                ComposerKt.U(-1332868890, i11, -1, "com.meijer.mobile.home.ux.views.HomeMperksScreens.<anonymous> (MperksSection.kt:153)");
            }
            this.f142846a.get(i10).a().invoke(this.f142847b, composer, Integer.valueOf(LocalThemeScope.f17314g));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC16060u interfaceC16060u, Integer num, Composer composer, Integer num2) {
            a(interfaceC16060u, num.intValue(), composer, num2.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f142848a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f142849b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<AbstractC15237O> f142850c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC16037C f142851d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f142852e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f142853f;

        /* JADX WARN: Multi-variable type inference failed */
        b(Modifier modifier, LocalThemeScope localThemeScope, List<? extends AbstractC15237O> list, AbstractC16037C abstractC16037C, Function0<Unit> function0, Function0<Unit> function02) {
            this.f142848a = modifier;
            this.f142849b = localThemeScope;
            this.f142850c = list;
            this.f142851d = abstractC16037C;
            this.f142852e = function0;
            this.f142853f = function02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function0 function0, Function0 function02, int i10) {
            if (i10 == 0) {
                function0.invoke();
            } else if (i10 == 1) {
                function02.invoke();
            }
            return Unit.f143329a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(887951577, i10, -1, "com.meijer.mobile.home.ux.views.MperksAuthSection.<anonymous> (MperksSection.kt:89)");
            }
            Modifier modifierD = androidx.compose.foundation.b.d(FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.J.f(this.f142848a, 0.0f, 1, null)), this.f142849b.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null);
            LocalThemeScope localThemeScope = this.f142849b;
            List<AbstractC15237O> list = this.f142850c;
            AbstractC16037C abstractC16037C = this.f142851d;
            final Function0<Unit> function0 = this.f142852e;
            final Function0<Unit> function02 = this.f142853f;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
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
            int i11 = LocalThemeScope.f17314g;
            os.f0.b(localThemeScope, null, composer, i11, 1);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(function0) | composer.V(function02);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: km.Z0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Y0.b.c(function0, function02, ((Integer) obj).intValue());
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C15239Q.b(localThemeScope, list, abstractC16037C, null, (Function1) objB, composer, i11, 4);
            Y0.h(localThemeScope, list, abstractC16037C, null, composer, i11, 4);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f142854a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f142855b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<AbstractC15237O> f142856c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC16037C f142857d;

        /* JADX WARN: Multi-variable type inference failed */
        c(Modifier modifier, LocalThemeScope localThemeScope, List<? extends AbstractC15237O> list, AbstractC16037C abstractC16037C) {
            this.f142854a = modifier;
            this.f142855b = localThemeScope;
            this.f142856c = list;
            this.f142857d = abstractC16037C;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(int i10) {
            return Unit.f143329a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-344501034, i10, -1, "com.meijer.mobile.home.ux.views.MperksErrorSection.<anonymous> (MperksSection.kt:123)");
            }
            Modifier modifierD = androidx.compose.foundation.b.d(FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.J.f(this.f142854a, 0.0f, 1, null)), this.f142855b.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null);
            LocalThemeScope localThemeScope = this.f142855b;
            List<AbstractC15237O> list = this.f142856c;
            AbstractC16037C abstractC16037C = this.f142857d;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
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
            int i11 = LocalThemeScope.f17314g;
            os.f0.b(localThemeScope, null, composer, i11, 1);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: km.a1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Y0.c.c(((Integer) obj).intValue());
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C15239Q.b(localThemeScope, list, abstractC16037C, null, (Function1) objB, composer, i11 | 24576, 4);
            Y0.h(localThemeScope, list, abstractC16037C, null, composer, i11, 4);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f142858a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f142859b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<AbstractC15237O> f142860c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC16037C f142861d;

        d(Modifier modifier, LocalThemeScope localThemeScope, List<AbstractC15237O> list, AbstractC16037C abstractC16037C) {
            this.f142858a = modifier;
            this.f142859b = localThemeScope;
            this.f142860c = list;
            this.f142861d = abstractC16037C;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(int i10) {
            return Unit.f143329a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1965736185, i10, -1, "com.meijer.mobile.home.ux.views.MperksUnauthSection.<anonymous> (MperksSection.kt:55)");
            }
            Modifier modifierD = androidx.compose.foundation.b.d(androidx.compose.foundation.layout.J.f(this.f142858a, 0.0f, 1, null), this.f142859b.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null);
            LocalThemeScope localThemeScope = this.f142859b;
            List<AbstractC15237O> list = this.f142860c;
            AbstractC16037C abstractC16037C = this.f142861d;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
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
            int i11 = LocalThemeScope.f17314g;
            os.f0.b(localThemeScope, null, composer, i11, 1);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: km.b1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Y0.d.c(((Integer) obj).intValue());
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C15239Q.b(localThemeScope, list, abstractC16037C, null, (Function1) objB, composer, i11 | 24576, 4);
            Y0.h(localThemeScope, list, abstractC16037C, null, composer, i11, 4);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final Ki.LocalThemeScope r22, final java.util.List<? extends km.AbstractC15237O> r23, final kotlin.AbstractC16037C r24, androidx.compose.ui.Modifier r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: km.Y0.h(Ki.M, java.util.List, o0.C, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, List list, AbstractC16037C abstractC16037C, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, list, abstractC16037C, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final Ki.LocalThemeScope r23, final gm.HomeMperksDecorator r24, androidx.compose.ui.Modifier r25, final kotlin.jvm.functions.Function1<? super fm.AbstractC14021c, kotlin.Unit> r26, final kotlin.jvm.functions.Function0<kotlin.Unit> r27, final kotlin.jvm.functions.Function0<kotlin.Unit> r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: km.Y0.j(Ki.M, gm.b, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, HomeMperksDecorator homeMperksDecorator, Modifier modifier, Function1 function1, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, homeMperksDecorator, modifier, function1, function0, function02, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final Ki.LocalThemeScope r17, final kotlin.jvm.functions.Function0<kotlin.Unit> r18, androidx.compose.ui.Modifier r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: km.Y0.m(Ki.M, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, Function0 function0, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        m(localThemeScope, function0, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(final Ki.LocalThemeScope r17, final kotlin.jvm.functions.Function0<kotlin.Unit> r18, androidx.compose.ui.Modifier r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: km.Y0.p(Ki.M, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, Function0 function0, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        p(localThemeScope, function0, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(List list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n(List list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q(List list) {
        return list.size();
    }
}
