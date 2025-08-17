package Qi;

import Ji.LocalThemeScope;
import Ni.l;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import j0.C14808Q;
import j0.C14815g;
import j0.InterfaceC14794C;
import j0.InterfaceC14806O;
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
import l0.C15342b;
import l0.InterfaceC15343c;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\u000f\u001a\u00020\u000e*\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u000e*\u00020\u0006H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u000e*\u00020\u0006H\u0017¢\u0006\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LQi/O;", "LNi/c;", "LNi/l$C;", "state", "<init>", "(LNi/l$C;)V", "LJi/M;", "", "", "LJi/I;", "styles", "content", "Landroidx/compose/ui/Modifier;", "modifier", "", "r", "(LJi/M;Ljava/util/Map;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)V", "f", "LNi/l$C;", "u", "()LNi/l$C;", "getName", "()Ljava/lang/String;", "name", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class O implements Ni.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.TypographyState state;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30652a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O f30653b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qi.O$a$a, reason: collision with other inner class name */
        static final class C0693a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O f30654a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30655b;

            C0693a(O o10, LocalThemeScope localThemeScope) {
                this.f30654a = o10;
                this.f30655b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1691746262, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TypographyShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TypographyShowcase.kt:49)");
                }
                O o10 = this.f30654a;
                LocalThemeScope localThemeScope = this.f30655b;
                o10.r(localThemeScope, MapsKt.o(TuplesKt.a("One", localThemeScope.getAdsTypography().getHeadings().getOne()), TuplesKt.a("Two", this.f30655b.getAdsTypography().getHeadings().getTwo()), TuplesKt.a("Three", this.f30655b.getAdsTypography().getHeadings().getThree()), TuplesKt.a("Four", this.f30655b.getAdsTypography().getHeadings().getFour()), TuplesKt.a("Five", this.f30655b.getAdsTypography().getHeadings().getFive()), TuplesKt.a("Six", this.f30655b.getAdsTypography().getHeadings().getSix()), TuplesKt.a("Seven", this.f30655b.getAdsTypography().getHeadings().getSeven()), TuplesKt.a("Eight", this.f30655b.getAdsTypography().getHeadings().getEight()), TuplesKt.a("Nine", this.f30655b.getAdsTypography().getHeadings().getNine())), this.f30654a.getState().b().getValue().getContent(), null, composer, 0, 4);
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

        a(LocalThemeScope localThemeScope, O o10) {
            this.f30652a = localThemeScope;
            this.f30653b = o10;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1257298743, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TypographyShowcase.Content.<anonymous>.<anonymous>.<anonymous> (TypographyShowcase.kt:45)");
            }
            Ri.b.b(this.f30652a, null, this.f30653b.d("Heading"), "1.2", null, ComposableLambdaKt.c(1691746262, true, new C0693a(this.f30653b, this.f30652a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30656a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O f30657b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O f30658a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30659b;

            a(O o10, LocalThemeScope localThemeScope) {
                this.f30658a = o10;
                this.f30659b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(299711693, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TypographyShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TypographyShowcase.kt:71)");
                }
                O o10 = this.f30658a;
                LocalThemeScope localThemeScope = this.f30659b;
                o10.r(localThemeScope, MapsKt.o(TuplesKt.a("One", localThemeScope.getAdsTypography().getValues().getOne()), TuplesKt.a("Two", this.f30659b.getAdsTypography().getValues().getTwo()), TuplesKt.a("Three", this.f30659b.getAdsTypography().getValues().getThree()), TuplesKt.a("Four", this.f30659b.getAdsTypography().getValues().getFour()), TuplesKt.a("Five", this.f30659b.getAdsTypography().getValues().getFive())), this.f30658a.getState().b().getValue().getContent(), null, composer, 0, 4);
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

        b(LocalThemeScope localThemeScope, O o10) {
            this.f30656a = localThemeScope;
            this.f30657b = o10;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(945877248, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TypographyShowcase.Content.<anonymous>.<anonymous>.<anonymous> (TypographyShowcase.kt:67)");
            }
            Ri.b.b(this.f30656a, null, this.f30657b.d("Value"), "1.2", null, ComposableLambdaKt.c(299711693, true, new a(this.f30657b, this.f30656a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30660a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O f30661b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O f30662a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30663b;

            a(O o10, LocalThemeScope localThemeScope) {
                this.f30662a = o10;
                this.f30663b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1463292878, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TypographyShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TypographyShowcase.kt:89)");
                }
                O o10 = this.f30662a;
                LocalThemeScope localThemeScope = this.f30663b;
                o10.r(localThemeScope, MapsKt.o(TuplesKt.a("One", localThemeScope.getAdsTypography().getBody().getOne()), TuplesKt.a("Two", this.f30663b.getAdsTypography().getBody().getTwo())), this.f30662a.getState().b().getValue().getContent(), null, composer, 0, 4);
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

        c(LocalThemeScope localThemeScope, O o10) {
            this.f30660a = localThemeScope;
            this.f30661b = o10;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2109458433, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TypographyShowcase.Content.<anonymous>.<anonymous>.<anonymous> (TypographyShowcase.kt:85)");
            }
            Ri.b.b(this.f30660a, null, this.f30661b.d("Body"), "1.2", null, ComposableLambdaKt.c(1463292878, true, new a(this.f30661b, this.f30660a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30664a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O f30665b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O f30666a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30667b;

            a(O o10, LocalThemeScope localThemeScope) {
                this.f30666a = o10;
                this.f30667b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1668093233, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TypographyShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TypographyShowcase.kt:104)");
                }
                O o10 = this.f30666a;
                LocalThemeScope localThemeScope = this.f30667b;
                o10.r(localThemeScope, MapsKt.o(TuplesKt.a("One", localThemeScope.getAdsTypography().getBodyCompact().getOne()), TuplesKt.a("Two", this.f30667b.getAdsTypography().getBodyCompact().getTwo())), this.f30666a.getState().b().getValue().getContent(), null, composer, 0, 4);
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

        d(LocalThemeScope localThemeScope, O o10) {
            this.f30664a = localThemeScope;
            this.f30665b = o10;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1021927678, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TypographyShowcase.Content.<anonymous>.<anonymous>.<anonymous> (TypographyShowcase.kt:100)");
            }
            Ri.b.b(this.f30664a, null, this.f30665b.d("Body Compact"), "1.2", null, ComposableLambdaKt.c(-1668093233, true, new a(this.f30665b, this.f30664a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30668a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O f30669b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ O f30670a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30671b;

            a(O o10, LocalThemeScope localThemeScope) {
                this.f30670a = o10;
                this.f30671b = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-504512048, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TypographyShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TypographyShowcase.kt:119)");
                }
                O o10 = this.f30670a;
                LocalThemeScope localThemeScope = this.f30671b;
                o10.r(localThemeScope, MapsKt.g(TuplesKt.a("One", localThemeScope.getAdsTypography().getDetail().getOne())), this.f30670a.getState().b().getValue().getContent(), null, composer, 0, 4);
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

        e(LocalThemeScope localThemeScope, O o10) {
            this.f30668a = localThemeScope;
            this.f30669b = o10;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(141653507, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.TypographyShowcase.Content.<anonymous>.<anonymous>.<anonymous> (TypographyShowcase.kt:115)");
            }
            Ri.b.b(this.f30668a, null, this.f30669b.d("Detail"), "1.2", null, ComposableLambdaKt.c(-504512048, true, new a(this.f30669b, this.f30668a), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
            a(interfaceC15343c, composer, num.intValue());
            return Unit.f142422a;
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
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(O o10, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        o10.a(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(O o10, l.TypographyState.a.AbstractC0354a it) {
        Intrinsics.j(it, "it");
        o10.getState().b().setValue(it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String p(l.TypographyState.a.AbstractC0354a it) {
        Intrinsics.j(it, "it");
        return it.getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(O o10, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        o10.f(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f142422a;
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
    public final void r(final Ji.LocalThemeScope r29, java.util.Map<java.lang.String, ? extends Ji.I> r30, final java.lang.String r31, androidx.compose.ui.Modifier r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qi.O.r(Ji.M, java.util.Map, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(O o10, LocalThemeScope localThemeScope, Map map, String str, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        o10.r(localThemeScope, map, str, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    @Override // Ni.c
    public void a(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
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
            InterfaceC14794C interfaceC14794CE = C14808Q.e(C14808Q.g(W.b(InterfaceC14806O.INSTANCE, composerStartRestartGroup, 6), U.INSTANCE.e()), composerStartRestartGroup, 0);
            C5658d.f fVarO = C5658d.f48555a.o(localThemeScope.getAdsSpacing().getFive().getDp());
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z10 = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(localThemeScope))) | ((i11 & 112) == 32);
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Qi.L
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return O.m(localThemeScope, this, (l0.w) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C15342b.a(null, null, interfaceC14794CE, false, fVarO, null, null, false, null, (Function1) objB, composerStartRestartGroup, 0, 491);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.M
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return O.n(this.f30641a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    public void f(LocalThemeScope localThemeScope, Composer composer, final int i10) {
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
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
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
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            List<l.TypographyState.a.AbstractC0354a> listB = l.TypographyState.a.f22008a.b();
            l.TypographyState.a.AbstractC0354a value = getState().b().getValue();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objB == companion3.a()) {
                objB = new Function1() { // from class: Qi.I
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return O.p((l.TypographyState.a.AbstractC0354a) obj);
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
                objB2 = new Function1() { // from class: Qi.J
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return O.o(this.f30635a, (l.TypographyState.a.AbstractC0354a) obj);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            localThemeScope2 = localThemeScope;
            Li.h.j(localThemeScope2, "Display Content", listB, value, null, function1, (Function1) objB2, composerStartRestartGroup, (i11 & 14) | 196656, 8);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.K
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return O.q(this.f30636a, localThemeScope2, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    public String getName() {
        return "Typography";
    }

    @Override // Ni.c
    /* renamed from: u, reason: from getter */
    public l.TypographyState getState() {
        return this.state;
    }
}
