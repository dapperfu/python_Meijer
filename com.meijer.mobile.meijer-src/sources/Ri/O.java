package Ri;

import Ki.LocalThemeScope;
import Oi.l;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import j0.C14896Q;
import j0.C14903g;
import j0.InterfaceC14882C;
import j0.InterfaceC14894O;
import j0.U;
import j0.W;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15432b;
import l0.InterfaceC15433c;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\u000f\u001a\u00020\u000e*\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u000e*\u00020\u0006H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u000e*\u00020\u0006H\u0017¢\u0006\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"LRi/O;", "LOi/c;", "LOi/l$C;", "state", "<init>", "(LOi/l$C;)V", "LKi/M;", "", "", "LKi/I;", "styles", "content", "Landroidx/compose/ui/Modifier;", "modifier", "", "r", "(LKi/M;Ljava/util/Map;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "f", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "b", "a", "LOi/l$C;", "u", "()LOi/l$C;", "getName", "()Ljava/lang/String;", "name", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class O implements Oi.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.TypographyState state;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33239a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O f33240b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ri.O$a$a, reason: collision with other inner class name */
        static final class C0744a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O f33241a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33242b;

            C0744a(O o10, LocalThemeScope localThemeScope) {
                this.f33241a = o10;
                this.f33242b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1691746262, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TypographyShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TypographyShowcase.kt:49)");
                }
                O o10 = this.f33241a;
                LocalThemeScope localThemeScope = this.f33242b;
                o10.r(localThemeScope, MapsKt.o(TuplesKt.a("One", localThemeScope.getAdsTypography().getHeadings().getOne()), TuplesKt.a("Two", this.f33242b.getAdsTypography().getHeadings().getTwo()), TuplesKt.a("Three", this.f33242b.getAdsTypography().getHeadings().getThree()), TuplesKt.a("Four", this.f33242b.getAdsTypography().getHeadings().getFour()), TuplesKt.a("Five", this.f33242b.getAdsTypography().getHeadings().getFive()), TuplesKt.a("Six", this.f33242b.getAdsTypography().getHeadings().getSix()), TuplesKt.a("Seven", this.f33242b.getAdsTypography().getHeadings().getSeven()), TuplesKt.a("Eight", this.f33242b.getAdsTypography().getHeadings().getEight()), TuplesKt.a("Nine", this.f33242b.getAdsTypography().getHeadings().getNine())), this.f33241a.getState().b().getValue().getContent(), null, composer, 0, 4);
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

        a(LocalThemeScope localThemeScope, O o10) {
            this.f33239a = localThemeScope;
            this.f33240b = o10;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1257298743, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TypographyShowcase.Content.<anonymous>.<anonymous>.<anonymous> (TypographyShowcase.kt:45)");
            }
            Si.b.b(this.f33239a, null, this.f33240b.c("Heading"), "1.2", null, ComposableLambdaKt.c(1691746262, true, new C0744a(this.f33240b, this.f33239a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33243a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O f33244b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O f33245a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33246b;

            a(O o10, LocalThemeScope localThemeScope) {
                this.f33245a = o10;
                this.f33246b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(299711693, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TypographyShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TypographyShowcase.kt:71)");
                }
                O o10 = this.f33245a;
                LocalThemeScope localThemeScope = this.f33246b;
                o10.r(localThemeScope, MapsKt.o(TuplesKt.a("One", localThemeScope.getAdsTypography().getValues().getOne()), TuplesKt.a("Two", this.f33246b.getAdsTypography().getValues().getTwo()), TuplesKt.a("Three", this.f33246b.getAdsTypography().getValues().getThree()), TuplesKt.a("Four", this.f33246b.getAdsTypography().getValues().getFour()), TuplesKt.a("Five", this.f33246b.getAdsTypography().getValues().getFive())), this.f33245a.getState().b().getValue().getContent(), null, composer, 0, 4);
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

        b(LocalThemeScope localThemeScope, O o10) {
            this.f33243a = localThemeScope;
            this.f33244b = o10;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(945877248, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TypographyShowcase.Content.<anonymous>.<anonymous>.<anonymous> (TypographyShowcase.kt:67)");
            }
            Si.b.b(this.f33243a, null, this.f33244b.c("Value"), "1.2", null, ComposableLambdaKt.c(299711693, true, new a(this.f33244b, this.f33243a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33247a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O f33248b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O f33249a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33250b;

            a(O o10, LocalThemeScope localThemeScope) {
                this.f33249a = o10;
                this.f33250b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1463292878, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TypographyShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TypographyShowcase.kt:89)");
                }
                O o10 = this.f33249a;
                LocalThemeScope localThemeScope = this.f33250b;
                o10.r(localThemeScope, MapsKt.o(TuplesKt.a("One", localThemeScope.getAdsTypography().getBody().getOne()), TuplesKt.a("Two", this.f33250b.getAdsTypography().getBody().getTwo())), this.f33249a.getState().b().getValue().getContent(), null, composer, 0, 4);
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

        c(LocalThemeScope localThemeScope, O o10) {
            this.f33247a = localThemeScope;
            this.f33248b = o10;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2109458433, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TypographyShowcase.Content.<anonymous>.<anonymous>.<anonymous> (TypographyShowcase.kt:85)");
            }
            Si.b.b(this.f33247a, null, this.f33248b.c("Body"), "1.2", null, ComposableLambdaKt.c(1463292878, true, new a(this.f33248b, this.f33247a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33251a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O f33252b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O f33253a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33254b;

            a(O o10, LocalThemeScope localThemeScope) {
                this.f33253a = o10;
                this.f33254b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1668093233, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TypographyShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TypographyShowcase.kt:104)");
                }
                O o10 = this.f33253a;
                LocalThemeScope localThemeScope = this.f33254b;
                o10.r(localThemeScope, MapsKt.o(TuplesKt.a("One", localThemeScope.getAdsTypography().getBodyCompact().getOne()), TuplesKt.a("Two", this.f33254b.getAdsTypography().getBodyCompact().getTwo())), this.f33253a.getState().b().getValue().getContent(), null, composer, 0, 4);
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

        d(LocalThemeScope localThemeScope, O o10) {
            this.f33251a = localThemeScope;
            this.f33252b = o10;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1021927678, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TypographyShowcase.Content.<anonymous>.<anonymous>.<anonymous> (TypographyShowcase.kt:100)");
            }
            Si.b.b(this.f33251a, null, this.f33252b.c("Body Compact"), "1.2", null, ComposableLambdaKt.c(-1668093233, true, new a(this.f33252b, this.f33251a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33255a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O f33256b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O f33257a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33258b;

            a(O o10, LocalThemeScope localThemeScope) {
                this.f33257a = o10;
                this.f33258b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-504512048, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TypographyShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TypographyShowcase.kt:119)");
                }
                O o10 = this.f33257a;
                LocalThemeScope localThemeScope = this.f33258b;
                o10.r(localThemeScope, MapsKt.g(TuplesKt.a("One", localThemeScope.getAdsTypography().getDetail().getOne())), this.f33257a.getState().b().getValue().getContent(), null, composer, 0, 4);
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

        e(LocalThemeScope localThemeScope, O o10) {
            this.f33255a = localThemeScope;
            this.f33256b = o10;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(141653507, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TypographyShowcase.Content.<anonymous>.<anonymous>.<anonymous> (TypographyShowcase.kt:115)");
            }
            Si.b.b(this.f33255a, null, this.f33256b.c("Detail"), "1.2", null, ComposableLambdaKt.c(-504512048, true, new a(this.f33256b, this.f33255a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Composer composer, Integer num) {
            a(interfaceC15433c, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public O(l.TypographyState state) {
        Intrinsics.j(state, "state");
        this.state = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, O o10, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1257298743, true, new a(localThemeScope, o10)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(945877248, true, new b(localThemeScope, o10)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(2109458433, true, new c(localThemeScope, o10)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1021927678, true, new d(localThemeScope, o10)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(141653507, true, new e(localThemeScope, o10)), 3, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(O o10, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        o10.f(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(O o10, l.TypographyState.a.AbstractC0393a it) {
        Intrinsics.j(it, "it");
        o10.getState().b().setValue(it);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String p(l.TypographyState.a.AbstractC0393a it) {
        Intrinsics.j(it, "it");
        return it.getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(O o10, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        o10.b(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(final Ki.LocalThemeScope r29, java.util.Map<java.lang.String, ? extends Ki.I> r30, final java.lang.String r31, androidx.compose.ui.Modifier r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ri.O.r(Ki.M, java.util.Map, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(O o10, LocalThemeScope localThemeScope, Map map, String str, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        o10.r(localThemeScope, map, str, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    @Override // Oi.c
    public void b(LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        final LocalThemeScope localThemeScope2;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1433106307);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(this) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            localThemeScope2 = localThemeScope;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1433106307, i11, -1, "com.meijer.mobile.androidacres.showcase.foundations.TypographyShowcase.Controls (TypographyShowcase.kt:157)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            List<l.TypographyState.a.AbstractC0393a> listB = l.TypographyState.a.f24253a.b();
            l.TypographyState.a.AbstractC0393a value = getState().b().getValue();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objB == companion3.a()) {
                objB = new Function1() { // from class: Ri.I
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return O.p((l.TypographyState.a.AbstractC0393a) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            Function1 function1 = (Function1) objB;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z10 = (i11 & 112) == 32;
            Object objB2 = composerStartRestartGroup.B();
            if (z10 || objB2 == companion3.a()) {
                objB2 = new Function1() { // from class: Ri.J
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return O.o(this.f33222a, (l.TypographyState.a.AbstractC0393a) obj);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            localThemeScope2 = localThemeScope;
            Mi.h.j(localThemeScope2, "Display Content", listB, value, null, function1, (Function1) objB2, composerStartRestartGroup, (i11 & 14) | 196656, 8);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ri.K
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return O.q(this.f33223a, localThemeScope2, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Oi.c
    public void f(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1248901644);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(this) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1248901644, i11, -1, "com.meijer.mobile.androidacres.showcase.foundations.TypographyShowcase.Content (TypographyShowcase.kt:39)");
            }
            InterfaceC14882C interfaceC14882CE = C14896Q.e(C14896Q.g(W.b(InterfaceC14894O.INSTANCE, composerStartRestartGroup, 6), U.INSTANCE.e()), composerStartRestartGroup, 0);
            C5800d.f fVarO = C5800d.f48779a.o(localThemeScope.getAdsSpacing().getFive().getDp());
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z10 = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(localThemeScope))) | ((i11 & 112) == 32);
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Ri.L
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return O.m(localThemeScope, this, (l0.w) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C15432b.a(null, null, interfaceC14882CE, false, fVarO, null, null, false, null, (Function1) objB, composerStartRestartGroup, 0, 491);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ri.M
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return O.n(this.f33228a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Oi.c
    public String getName() {
        return "Typography";
    }

    @Override // Oi.c
    /* renamed from: u, reason: from getter */
    public l.TypographyState getState() {
        return this.state;
    }
}
