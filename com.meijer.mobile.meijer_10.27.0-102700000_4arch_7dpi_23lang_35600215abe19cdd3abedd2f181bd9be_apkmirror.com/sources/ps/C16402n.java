package ps;

import Ji.LocalThemeScope;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import ck.C6408b;
import j0.C14801J;
import j0.InterfaceC14800I;
import java.util.Locale;
import ji.C14898A;
import ji.j1;
import ji.q1;
import kotlin.C17988z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.E0;
import p1.C16190d;
import p1.C16193g;
import ps.AbstractC16373C;
import ps.C16402n;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\r\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a1\u0010\u000f\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LJi/M;", "Lps/F;", "headerDecorator", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lps/C;", "", "onNavigationRequest", "g", "(LJi/M;Lps/F;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "onClose", "e", "(LJi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "j", "(LJi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "a", "Lps/F;", "mockHeaderDecorator", "navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ps.n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C16402n {

    /* renamed from: a, reason: collision with root package name */
    private static final HeaderDecorator f156583a = new HeaderDecorator(true, "Preview", true, "My Store", 123);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ps.n$a */
    static final class a implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f156584a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f156585b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ps.n$a$a, reason: collision with other inner class name */
        static final class C2428a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f156586a;

            C2428a(LocalThemeScope localThemeScope) {
                this.f156586a = localThemeScope;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-295982992, i10, -1, "com.meijer.mobile.ui.navigation.BrandCloseRow.<anonymous>.<anonymous>.<anonymous> (DrawerHeader.kt:111)");
                }
                C17988z0.a(C16190d.c(Bj.i.f2658H, composer, 0), C16193g.c(j0.f156551a, composer, 0), null, this.f156586a.getAdsColors().getAdsColorInverse().getColor(), composer, 0, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f156584a = localThemeScope;
            this.f156585b = function0;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1849144957, i10, -1, "com.meijer.mobile.ui.navigation.BrandCloseRow.<anonymous>.<anonymous> (DrawerHeader.kt:110)");
            }
            E0.b(this.f156584a, Assemble.getButtons().getEnabledButton(), this.f156585b, ComposableLambdaKt.c(-295982992, true, new C2428a(this.f156584a), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: ps.n$b */
    static final class b implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f156587a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC16373C, Unit> f156588b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ HeaderDecorator f156589c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ps.n$b$a */
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HeaderDecorator f156590a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f156591b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ j1 f156592c;

            a(HeaderDecorator headerDecorator, LocalThemeScope localThemeScope, j1 j1Var) {
                this.f156590a = headerDecorator;
                this.f156591b = localThemeScope;
                this.f156592c = j1Var;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1091788400, i10, -1, "com.meijer.mobile.ui.navigation.DrawerHeader.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DrawerHeader.kt:88)");
                }
                Z0.c cVarC = C16190d.c(Bj.i.f2795x0, composer, 0);
                AbstractC5607a locationDescription = this.f156590a.getLocationDescription();
                int i11 = AbstractC5607a.f45514b;
                C17988z0.a(cVarC, C6408b.a(locationDescription, composer, i11), null, this.f156591b.getAdsColors().getAdsColorInverse().getColor(), composer, 0, 4);
                String strA = C6408b.a(this.f156590a.getStoreName(), composer, i11);
                q1.Label labelY = q1.Label.y(this.f156592c.getLabels().getEnabledLabel(), null, this.f156591b.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, null, null, 509, null);
                ri.j.h(this.f156591b, labelY, strA, null, composer, (q1.Label.f140080j << 3) | LocalThemeScope.f15770g, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, Function1<? super AbstractC16373C, Unit> function1, HeaderDecorator headerDecorator) {
            this.f156587a = localThemeScope;
            this.f156588b = function1;
            this.f156589c = headerDecorator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(AbstractC16373C.d.f156326a);
            return Unit.f142422a;
        }

        public final void b(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1225546653, i10, -1, "com.meijer.mobile.ui.navigation.DrawerHeader.<anonymous>.<anonymous>.<anonymous> (DrawerHeader.kt:84)");
            }
            LocalThemeScope localThemeScope = this.f156587a;
            q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f156588b);
            final Function1<AbstractC16373C, Unit> function1 = this.f156588b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: ps.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C16402n.b.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-1091788400, true, new a(this.f156589c, this.f156587a, Assemble), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: ps.n$c */
    static final class c implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f156593a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC16373C, Unit> f156594b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ps.n$c$a */
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f156595a;

            a(LocalThemeScope localThemeScope) {
                this.f156595a = localThemeScope;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-12866179, i10, -1, "com.meijer.mobile.ui.navigation.HeaderUnauthenticatedActionRow.<anonymous>.<anonymous>.<anonymous> (DrawerHeader.kt:138)");
                }
                String upperCase = C16193g.c(Bj.o.f2971F0, composer, 0).toUpperCase(Locale.ROOT);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                ri.j.h(this.f156595a, new q1.Label(null, this.f156595a.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, this.f156595a.getAdsTypography().getHeadings().getSeven(), null, 381, null), upperCase, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, Function1<? super AbstractC16373C, Unit> function1) {
            this.f156593a = localThemeScope;
            this.f156594b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(AbstractC16373C.e.f156327a);
            return Unit.f142422a;
        }

        public final void b(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1465525488, i10, -1, "com.meijer.mobile.ui.navigation.HeaderUnauthenticatedActionRow.<anonymous>.<anonymous> (DrawerHeader.kt:134)");
            }
            LocalThemeScope localThemeScope = this.f156593a;
            q1.d.StandardButton enabledAlternateButton = Assemble.getButtons().getEnabledAlternateButton();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f156594b);
            final Function1<AbstractC16373C, Unit> function1 = this.f156594b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: ps.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C16402n.c.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, enabledAlternateButton, (Function0) objB, ComposableLambdaKt.c(-12866179, true, new a(this.f156593a), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: ps.n$d */
    static final class d implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f156596a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC16373C, Unit> f156597b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ps.n$d$a */
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f156598a;

            a(LocalThemeScope localThemeScope) {
                this.f156598a = localThemeScope;
            }

            public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(714842356, i10, -1, "com.meijer.mobile.ui.navigation.HeaderUnauthenticatedActionRow.<anonymous>.<anonymous>.<anonymous> (DrawerHeader.kt:153)");
                }
                String upperCase = C16193g.c(Bj.o.f3045u, composer, 0).toUpperCase(Locale.ROOT);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                ri.j.h(this.f156598a, new q1.Label(null, this.f156598a.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, this.f156598a.getAdsTypography().getHeadings().getSeven(), null, 381, null), upperCase, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(LocalThemeScope localThemeScope, Function1<? super AbstractC16373C, Unit> function1) {
            this.f156596a = localThemeScope;
            this.f156597b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(AbstractC16373C.b.f156324a);
            return Unit.f142422a;
        }

        public final void b(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(573617607, i10, -1, "com.meijer.mobile.ui.navigation.HeaderUnauthenticatedActionRow.<anonymous>.<anonymous> (DrawerHeader.kt:149)");
            }
            LocalThemeScope localThemeScope = this.f156596a;
            q1.d.StandardButton enabledAlternateButton = Assemble.getButtons().getEnabledAlternateButton();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f156597b);
            final Function1<AbstractC16373C, Unit> function1 = this.f156597b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: ps.q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C16402n.d.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, enabledAlternateButton, (Function0) objB, ComposableLambdaKt.c(714842356, true, new a(this.f156596a), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void e(final Ji.LocalThemeScope r23, androidx.compose.ui.Modifier r24, final kotlin.jvm.functions.Function0<kotlin.Unit> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ps.C16402n.e(Ji.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ji.LocalThemeScope r28, final ps.HeaderDecorator r29, androidx.compose.ui.Modifier r30, final kotlin.jvm.functions.Function1<? super ps.AbstractC16373C, kotlin.Unit> r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ps.C16402n.g(Ji.M, ps.F, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Function1 function1) {
        function1.invoke(AbstractC16373C.a.f156323a);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, HeaderDecorator headerDecorator, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, headerDecorator, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    private static final void j(final LocalThemeScope localThemeScope, Modifier modifier, final Function1<? super AbstractC16373C, Unit> function1, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        int i15;
        Composer composerStartRestartGroup = composer.startRestartGroup(978119496);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.D(function1)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i16 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(978119496, i12, -1, "com.meijer.mobile.ui.navigation.HeaderUnauthenticatedActionRow (DrawerHeader.kt:131)");
            }
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composerStartRestartGroup, 0);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyB, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14801J c14801j = C14801J.f139030a;
            C14898A c14898a = C14898A.f139596a;
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-1465525488, true, new c(localThemeScope, function1), composerStartRestartGroup, 54);
            int i17 = LocalThemeScope.f15770g;
            int i18 = i12 & 14;
            int i19 = C14898A.f139597b;
            Ji.Q.e(localThemeScope, c14898a, composableLambdaC, composerStartRestartGroup, i17 | 384 | i18 | (i19 << 3));
            Ji.Q.e(localThemeScope, c14898a, ComposableLambdaKt.c(573617607, true, new d(localThemeScope, function1), composerStartRestartGroup, 54), composerStartRestartGroup, i18 | i17 | 384 | (i19 << 3));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: ps.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C16402n.k(localThemeScope, modifier2, function1, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
