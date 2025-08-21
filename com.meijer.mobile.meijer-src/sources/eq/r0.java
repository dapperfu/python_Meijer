package eq;

import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5868j0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import eq.r0;
import j0.C14903g;
import java.util.List;
import ki.q1;
import kotlin.A1;
import kotlin.C1;
import kotlin.C17943E0;
import kotlin.C18054z0;
import kotlin.Metadata;
import kotlin.TabPosition;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16335d;
import p1.C16338g;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a?\u0010\n\u001a\u00020\b*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r²\u0006\f\u0010\f\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"LKi/M;", "", "Leq/t0;", "screens", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "", "navigateToTab", "b", "(LKi/M;Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "tabIndex", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class r0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<TabScreen> f130576a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5868j0 f130577b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f130578c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f130579d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: eq.r0$a$a, reason: collision with other inner class name */
        static final class C2059a implements Function3<List<? extends TabPosition>, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f130580a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5868j0 f130581b;

            C2059a(LocalThemeScope localThemeScope, InterfaceC5868j0 interfaceC5868j0) {
                this.f130580a = localThemeScope;
                this.f130581b = interfaceC5868j0;
            }

            public final void a(List<TabPosition> tabPositions, Composer composer, int i10) {
                Intrinsics.j(tabPositions, "tabPositions");
                if (ComposerKt.M()) {
                    ComposerKt.U(-367042178, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.TabLayoutPager.<anonymous>.<anonymous>.<anonymous> (TabLayoutPager.kt:50)");
                }
                C1 c12 = C1.f167869a;
                c12.b(c12.e(Modifier.INSTANCE, tabPositions.get(r0.c(this.f130581b))), 0.0f, this.f130580a.getAdsColors().getAdsColorBrandPrimary().getColor(), composer, C1.f167873e << 9, 2);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer, Integer num) {
                a(list, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<TabScreen> f130582a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f130583b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<Integer, Unit> f130584c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5868j0 f130585d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: eq.r0$a$b$a, reason: collision with other inner class name */
            static final class C2060a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f130586a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ TabScreen f130587b;

                C2060a(LocalThemeScope localThemeScope, TabScreen tabScreen) {
                    this.f130586a = localThemeScope;
                    this.f130587b = tabScreen;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1981201789, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.TabLayoutPager.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabLayoutPager.kt:66)");
                    }
                    LocalThemeScope localThemeScope = this.f130586a;
                    si.j.h(localThemeScope, new q1.Label(null, this.f130586a.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), C16338g.c(this.f130587b.getName(), composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: eq.r0$a$b$b, reason: collision with other inner class name */
            static final class C2061b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ TabScreen f130588a;

                C2061b(TabScreen tabScreen) {
                    this.f130588a = tabScreen;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1785525058, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.TabLayoutPager.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabLayoutPager.kt:75)");
                    }
                    C18054z0.a(C16335d.c(this.f130588a.getIcon(), composer, 0), null, null, 0L, composer, 48, 12);
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

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(int i10, Function1 function1) {
                if (i10 == 1) {
                    function1.invoke(Integer.valueOf(i10));
                }
                return Unit.f143329a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            b(List<TabScreen> list, LocalThemeScope localThemeScope, Function1<? super Integer, Unit> function1, InterfaceC5868j0 interfaceC5868j0) {
                this.f130582a = list;
                this.f130583b = localThemeScope;
                this.f130584c = function1;
                this.f130585d = interfaceC5868j0;
            }

            public final void b(Composer composer, int i10) {
                Composer composer2 = composer;
                if ((i10 & 3) == 2 && composer2.j()) {
                    composer2.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(184807294, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.TabLayoutPager.<anonymous>.<anonymous>.<anonymous> (TabLayoutPager.kt:56)");
                }
                List<TabScreen> list = this.f130582a;
                LocalThemeScope localThemeScope = this.f130583b;
                final Function1<Integer, Unit> function1 = this.f130584c;
                InterfaceC5868j0 interfaceC5868j0 = this.f130585d;
                final int i11 = 0;
                for (Object obj : list) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt.w();
                    }
                    TabScreen tabScreen = (TabScreen) obj;
                    boolean z10 = i11 == r0.c(interfaceC5868j0);
                    long color = localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zD = composer2.d(i11) | composer2.V(function1);
                    Object objB = composer2.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: eq.s0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return r0.a.b.c(i11, function1);
                            }
                        };
                        composer2.t(objB);
                    }
                    composer2.P();
                    A1.a(z10, (Function0) objB, ComposableLambdaKt.c(1981201789, true, new C2060a(localThemeScope, tabScreen), composer2, 54), ComposableLambdaKt.c(-1785525058, true, new C2061b(tabScreen), composer2, 54), null, false, null, color, 0L, composer2, 3456, 368);
                    composer2 = composer;
                    i11 = i12;
                    interfaceC5868j0 = interfaceC5868j0;
                    function1 = function1;
                }
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

        /* JADX WARN: Multi-variable type inference failed */
        a(List<TabScreen> list, InterfaceC5868j0 interfaceC5868j0, LocalThemeScope localThemeScope, Function1<? super Integer, Unit> function1) {
            this.f130576a = list;
            this.f130577b = interfaceC5868j0;
            this.f130578c = localThemeScope;
            this.f130579d = function1;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1280149428, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.TabLayoutPager.<anonymous> (TabLayoutPager.kt:45)");
            }
            List<TabScreen> list = this.f130576a;
            InterfaceC5868j0 interfaceC5868j0 = this.f130577b;
            LocalThemeScope localThemeScope = this.f130578c;
            Function1<Integer, Unit> function1 = this.f130579d;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
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
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            kotlin.D1.b(r0.c(interfaceC5868j0), null, C17943E0.f167967a.a(composer, C17943E0.f167968b).g(), 0L, ComposableLambdaKt.c(-367042178, true, new C2059a(localThemeScope, interfaceC5868j0), composer, 54), null, ComposableLambdaKt.c(184807294, true, new b(list, localThemeScope, function1, interfaceC5868j0), composer, 54), composer, 1597440, 42);
            list.get(r0.c(interfaceC5868j0)).c().invoke(composer, 0);
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

    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r18, final java.util.List<eq.TabScreen> r19, androidx.compose.ui.Modifier r20, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eq.r0.b(Ki.M, java.util.List, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LocalThemeScope localThemeScope, List list, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, list, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(InterfaceC5868j0 interfaceC5868j0) {
        return interfaceC5868j0.a();
    }
}
