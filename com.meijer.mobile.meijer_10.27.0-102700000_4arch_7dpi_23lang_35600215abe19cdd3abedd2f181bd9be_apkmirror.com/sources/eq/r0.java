package eq;

import Ji.LocalThemeScope;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5726j0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import eq.r0;
import j0.C14815g;
import java.util.List;
import ji.q1;
import kotlin.A1;
import kotlin.C1;
import kotlin.C17877E0;
import kotlin.C17988z0;
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
import p1.C16190d;
import p1.C16193g;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a?\u0010\n\u001a\u00020\b*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r²\u0006\f\u0010\f\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"LJi/M;", "", "Leq/t0;", "screens", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "", "navigateToTab", "b", "(LJi/M;Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "tabIndex", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class r0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<TabScreen> f129735a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5726j0 f129736b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f129737c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f129738d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: eq.r0$a$a, reason: collision with other inner class name */
        static final class C2051a implements Function3<List<? extends TabPosition>, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f129739a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5726j0 f129740b;

            C2051a(LocalThemeScope localThemeScope, InterfaceC5726j0 interfaceC5726j0) {
                this.f129739a = localThemeScope;
                this.f129740b = interfaceC5726j0;
            }

            public final void a(List<TabPosition> tabPositions, Composer composer, int i10) {
                Intrinsics.j(tabPositions, "tabPositions");
                if (ComposerKt.M()) {
                    ComposerKt.U(-367042178, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.TabLayoutPager.<anonymous>.<anonymous>.<anonymous> (TabLayoutPager.kt:50)");
                }
                C1 c12 = C1.f166781a;
                c12.b(c12.e(Modifier.INSTANCE, tabPositions.get(r0.c(this.f129740b))), 0.0f, this.f129739a.getAdsColors().getAdsColorBrandPrimary().getColor(), composer, C1.f166785e << 9, 2);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer, Integer num) {
                a(list, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<TabScreen> f129741a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f129742b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<Integer, Unit> f129743c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5726j0 f129744d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: eq.r0$a$b$a, reason: collision with other inner class name */
            static final class C2052a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f129745a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ TabScreen f129746b;

                C2052a(LocalThemeScope localThemeScope, TabScreen tabScreen) {
                    this.f129745a = localThemeScope;
                    this.f129746b = tabScreen;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1981201789, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.TabLayoutPager.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabLayoutPager.kt:66)");
                    }
                    LocalThemeScope localThemeScope = this.f129745a;
                    ri.j.h(localThemeScope, new q1.Label(null, this.f129745a.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), C16193g.c(this.f129746b.getName(), composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: eq.r0$a$b$b, reason: collision with other inner class name */
            static final class C2053b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ TabScreen f129747a;

                C2053b(TabScreen tabScreen) {
                    this.f129747a = tabScreen;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1785525058, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.TabLayoutPager.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabLayoutPager.kt:75)");
                    }
                    C17988z0.a(C16190d.c(this.f129747a.getIcon(), composer, 0), null, null, 0L, composer, 48, 12);
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

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(int i10, Function1 function1) {
                if (i10 == 1) {
                    function1.invoke(Integer.valueOf(i10));
                }
                return Unit.f142422a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            b(List<TabScreen> list, LocalThemeScope localThemeScope, Function1<? super Integer, Unit> function1, InterfaceC5726j0 interfaceC5726j0) {
                this.f129741a = list;
                this.f129742b = localThemeScope;
                this.f129743c = function1;
                this.f129744d = interfaceC5726j0;
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
                List<TabScreen> list = this.f129741a;
                LocalThemeScope localThemeScope = this.f129742b;
                final Function1<Integer, Unit> function1 = this.f129743c;
                InterfaceC5726j0 interfaceC5726j0 = this.f129744d;
                final int i11 = 0;
                for (Object obj : list) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt.w();
                    }
                    TabScreen tabScreen = (TabScreen) obj;
                    boolean z10 = i11 == r0.c(interfaceC5726j0);
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
                    A1.a(z10, (Function0) objB, ComposableLambdaKt.c(1981201789, true, new C2052a(localThemeScope, tabScreen), composer2, 54), ComposableLambdaKt.c(-1785525058, true, new C2053b(tabScreen), composer2, 54), null, false, null, color, 0L, composer2, 3456, 368);
                    composer2 = composer;
                    i11 = i12;
                    interfaceC5726j0 = interfaceC5726j0;
                    function1 = function1;
                }
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

        /* JADX WARN: Multi-variable type inference failed */
        a(List<TabScreen> list, InterfaceC5726j0 interfaceC5726j0, LocalThemeScope localThemeScope, Function1<? super Integer, Unit> function1) {
            this.f129735a = list;
            this.f129736b = interfaceC5726j0;
            this.f129737c = localThemeScope;
            this.f129738d = function1;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1280149428, i10, -1, "com.meijer.mobile.shopandscan.presentation.component.TabLayoutPager.<anonymous> (TabLayoutPager.kt:45)");
            }
            List<TabScreen> list = this.f129735a;
            InterfaceC5726j0 interfaceC5726j0 = this.f129736b;
            LocalThemeScope localThemeScope = this.f129737c;
            Function1<Integer, Unit> function1 = this.f129738d;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
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
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            kotlin.D1.b(r0.c(interfaceC5726j0), null, C17877E0.f166879a.a(composer, C17877E0.f166880b).g(), 0L, ComposableLambdaKt.c(-367042178, true, new C2051a(localThemeScope, interfaceC5726j0), composer, 54), null, ComposableLambdaKt.c(184807294, true, new b(list, localThemeScope, function1, interfaceC5726j0), composer, 54), composer, 1597440, 42);
            list.get(r0.c(interfaceC5726j0)).c().invoke(composer, 0);
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
    public static final void b(final Ji.LocalThemeScope r18, final java.util.List<eq.TabScreen> r19, androidx.compose.ui.Modifier r20, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eq.r0.b(Ji.M, java.util.List, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LocalThemeScope localThemeScope, List list, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, list, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(InterfaceC5726j0 interfaceC5726j0) {
        return interfaceC5726j0.a();
    }
}
