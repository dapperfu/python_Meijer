package Ri;

import Ki.LocalThemeScope;
import V0.C5489q0;
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
import j0.C14903g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15432b;
import l0.InterfaceC15433c;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LRi/i;", "LOi/c;", "LOi/l;", "state", "<init>", "(LOi/l;)V", "LKi/M;", "", "f", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "a", "LOi/l;", "getState", "()LOi/l;", "", "getName", "()Ljava/lang/String;", "name", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Ri.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5268i implements Oi.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Oi.l state;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ri.i$a */
    static final class a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33287a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5268i f33288b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Ri.i$a$a, reason: collision with other inner class name */
        static final class C0746a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33289a;

            C0746a(LocalThemeScope localThemeScope) {
                this.f33289a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1536138562, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Colors.kt:42)");
                }
                LocalThemeScope localThemeScope = this.f33289a;
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
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().u(), "adsColors.palette.gray100", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().v(), "adsColors.palette.gray200", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().w(), "adsColors.palette.gray300", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().x(), "adsColors.palette.gray400", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().y(), "adsColors.palette.gray500", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().z(), "adsColors.palette.gray600", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().A(), "adsColors.palette.gray700", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().B(), "adsColors.palette.gray800", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().C(), "adsColors.palette.gray900", 0L, composer, 384, 4);
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

        a(LocalThemeScope localThemeScope, C5268i c5268i) {
            this.f33287a = localThemeScope;
            this.f33288b = c5268i;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-901937169, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous> (Colors.kt:38)");
            }
            Si.b.b(this.f33287a, null, this.f33288b.c("Gray"), "1.0", null, ComposableLambdaKt.c(1536138562, true, new C0746a(this.f33287a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Ri.i$b */
    static final class b implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33290a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5268i f33291b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Ri.i$b$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33292a;

            a(LocalThemeScope localThemeScope) {
                this.f33292a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-280963221, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Colors.kt:88)");
                }
                LocalThemeScope localThemeScope = this.f33292a;
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
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().b(), "adsColors.palette.blue100", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().c(), "adsColors.palette.blue200", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().d(), "adsColors.palette.blue300", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().e(), "adsColors.palette.blue400", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().f(), "adsColors.palette.blue500", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().h(), "adsColors.palette.blue600", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().i(), "adsColors.palette.blue700", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().j(), "adsColors.palette.blue800", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().k(), "adsColors.palette.blue900", 0L, composer, 384, 4);
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

        b(LocalThemeScope localThemeScope, C5268i c5268i) {
            this.f33290a = localThemeScope;
            this.f33291b = c5268i;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1780402904, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous> (Colors.kt:84)");
            }
            Si.b.b(this.f33290a, null, this.f33291b.c("Blue"), "1.0", null, ComposableLambdaKt.c(-280963221, true, new a(this.f33290a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Ri.i$c */
    static final class c implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33293a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5268i f33294b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Ri.i$c$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33295a;

            a(LocalThemeScope localThemeScope) {
                this.f33295a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(480918090, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Colors.kt:134)");
                }
                LocalThemeScope localThemeScope = this.f33295a;
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
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().M(), "adsColors.palette.red100", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().N(), "adsColors.palette.red200", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().O(), "adsColors.palette.red300", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().P(), "adsColors.palette.red400", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().Q(), "adsColors.palette.red500", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().R(), "adsColors.palette.red600", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().S(), "adsColors.palette.red700", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().T(), "adsColors.palette.red800", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().U(), "adsColors.palette.red900", 0L, composer, 384, 4);
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

        c(LocalThemeScope localThemeScope, C5268i c5268i) {
            this.f33293a = localThemeScope;
            this.f33294b = c5268i;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1752683081, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous> (Colors.kt:130)");
            }
            Si.b.b(this.f33293a, null, this.f33294b.c("Red"), "1.0", null, ComposableLambdaKt.c(480918090, true, new a(this.f33293a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Ri.i$d */
    static final class d implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33296a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5268i f33297b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Ri.i$d$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33298a;

            a(LocalThemeScope localThemeScope) {
                this.f33298a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1242799401, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Colors.kt:180)");
                }
                LocalThemeScope localThemeScope = this.f33298a;
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
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().D(), "adsColors.palette.green100", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().E(), "adsColors.palette.green200", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().F(), "adsColors.palette.green300", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().G(), "adsColors.palette.green400", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().H(), "adsColors.palette.green500", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().I(), "adsColors.palette.green600", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().J(), "adsColors.palette.green700", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().K(), "adsColors.palette.green800", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().L(), "adsColors.palette.green900", 0L, composer, 384, 4);
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

        d(LocalThemeScope localThemeScope, C5268i c5268i) {
            this.f33296a = localThemeScope;
            this.f33297b = c5268i;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-990801770, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous> (Colors.kt:176)");
            }
            Si.b.b(this.f33296a, null, this.f33297b.c("Green"), "1.0", null, ComposableLambdaKt.c(1242799401, true, new a(this.f33296a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Ri.i$e */
    static final class e implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33299a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5268i f33300b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Ri.i$e$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33301a;

            a(LocalThemeScope localThemeScope) {
                this.f33301a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(2004680712, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Colors.kt:226)");
                }
                LocalThemeScope localThemeScope = this.f33301a;
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
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().p0(), "adsColors.palette.yellow100", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().q0(), "adsColors.palette.yellow200", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().r0(), "adsColors.palette.yellow300", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().s0(), "adsColors.palette.yellow400", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().t0(), "adsColors.palette.yellow500", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().u0(), "adsColors.palette.yellow600", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().v0(), "adsColors.palette.yellow700", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().w0(), "adsColors.palette.yellow800", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().x0(), "adsColors.palette.yellow900", 0L, composer, 384, 4);
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

        e(LocalThemeScope localThemeScope, C5268i c5268i) {
            this.f33299a = localThemeScope;
            this.f33300b = c5268i;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-228920459, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous> (Colors.kt:222)");
            }
            Si.b.b(this.f33299a, null, this.f33300b.c("Yellow"), "1.0", null, ComposableLambdaKt.c(2004680712, true, new a(this.f33299a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Ri.i$f */
    static final class f implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33302a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5268i f33303b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Ri.i$f$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33304a;

            a(LocalThemeScope localThemeScope) {
                this.f33304a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1528405273, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Colors.kt:272)");
                }
                LocalThemeScope localThemeScope = this.f33304a;
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
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().l(), "adsColors.palette.cyan100", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().m(), "adsColors.palette.cyan200", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().n(), "adsColors.palette.cyan300", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().o(), "adsColors.palette.cyan400", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().p(), "adsColors.palette.cyan500", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().q(), "adsColors.palette.cyan600", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().r(), "adsColors.palette.cyan700", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().s(), "adsColors.palette.cyan800", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().t(), "adsColors.palette.cyan900", 0L, composer, 384, 4);
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

        f(LocalThemeScope localThemeScope, C5268i c5268i) {
            this.f33302a = localThemeScope;
            this.f33303b = c5268i;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(532960852, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous> (Colors.kt:268)");
            }
            Si.b.b(this.f33302a, null, this.f33303b.c("Cyan"), "1.0", null, ComposableLambdaKt.c(-1528405273, true, new a(this.f33302a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Ri.i$g */
    static final class g implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33305a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5268i f33306b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Ri.i$g$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33307a;

            a(LocalThemeScope localThemeScope) {
                this.f33307a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-766523962, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Colors.kt:318)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                C5489q0.Companion companion2 = C5489q0.INSTANCE;
                Modifier modifierD = androidx.compose.foundation.b.d(companion, companion2.a(), null, 2, null);
                LocalThemeScope localThemeScope = this.f33307a;
                MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
                InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion3.a();
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
                D1.c(composerA, measurePolicyA, companion3.e());
                D1.c(composerA, interfaceC5884sR, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion3.f());
                C14903g c14903g = C14903g.f139698a;
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().e0(), "adsColors.palette.tWhite100", companion2.k(), composer, 3456, 0);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().f0(), "adsColors.palette.tWhite200", companion2.k(), composer, 3456, 0);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().g0(), "adsColors.palette.tWhite300", companion2.k(), composer, 3456, 0);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().h0(), "adsColors.palette.tWhite400", companion2.k(), composer, 3456, 0);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().i0(), "adsColors.palette.tWhite500", companion2.k(), composer, 3456, 0);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().j0(), "adsColors.palette.tWhite600", companion2.k(), composer, 3456, 0);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().k0(), "adsColors.palette.tWhite700", companion2.k(), composer, 3456, 0);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().l0(), "adsColors.palette.tWhite800", companion2.k(), composer, 3456, 0);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().m0(), "adsColors.palette.tWhite900", companion2.k(), composer, 3456, 0);
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

        g(LocalThemeScope localThemeScope, C5268i c5268i) {
            this.f33305a = localThemeScope;
            this.f33306b = c5268i;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1294842163, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous> (Colors.kt:314)");
            }
            Si.b.b(this.f33305a, null, this.f33306b.c("White"), "1.0", null, ComposableLambdaKt.c(-766523962, true, new a(this.f33305a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Ri.i$h */
    static final class h implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33308a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5268i f33309b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Ri.i$h$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33310a;

            a(LocalThemeScope localThemeScope) {
                this.f33310a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-4642651, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Colors.kt:373)");
                }
                LocalThemeScope localThemeScope = this.f33310a;
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
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().V(), "adsColors.palette.tBlack100", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().W(), "adsColors.palette.tBlack200", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().X(), "adsColors.palette.tBlack300", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().Y(), "adsColors.palette.tBlack400", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().Z(), "adsColors.palette.tBlack500", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().a0(), "adsColors.palette.tBlack600", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().b0(), "adsColors.palette.tBlack700", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().c0(), "adsColors.palette.tBlack800", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().d0(), "adsColors.palette.tBlack900", 0L, composer, 384, 4);
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

        h(LocalThemeScope localThemeScope, C5268i c5268i) {
            this.f33308a = localThemeScope;
            this.f33309b = c5268i;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2056723474, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous> (Colors.kt:369)");
            }
            Si.b.b(this.f33308a, null, this.f33309b.c("Black"), "1.0", null, ComposableLambdaKt.c(-4642651, true, new a(this.f33308a), composer, 54), composer, 199680, 9);
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
    /* renamed from: Ri.i$i, reason: collision with other inner class name */
    static final class C0747i implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33311a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5268i f33312b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Ri.i$i$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f33313a;

            a(LocalThemeScope localThemeScope) {
                this.f33313a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(757238660, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Colors.kt:419)");
                }
                Modifier modifierD = androidx.compose.foundation.b.d(Modifier.INSTANCE, C5489q0.INSTANCE.d(), null, 2, null);
                LocalThemeScope localThemeScope = this.f33313a;
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
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().a(), "adsColors.palette.black", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().o0(), "adsColors.palette.white", 0L, composer, 384, 4);
                C5270k.b(localThemeScope, localThemeScope.getAdsColors().l().n0(), "adsColors.palette.transparent", 0L, composer, 384, 4);
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

        C0747i(LocalThemeScope localThemeScope, C5268i c5268i) {
            this.f33311a = localThemeScope;
            this.f33312b = c5268i;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1476362511, i10, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content.<anonymous>.<anonymous>.<anonymous> (Colors.kt:415)");
            }
            Si.b.b(this.f33311a, null, this.f33312b.c("Font"), "1.0", null, ComposableLambdaKt.c(757238660, true, new a(this.f33311a), composer, 54), composer, 199680, 9);
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

    public C5268i(Oi.l state) {
        Intrinsics.j(state, "state");
        this.state = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, C5268i c5268i, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-901937169, true, new a(localThemeScope, c5268i)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1780402904, true, new b(localThemeScope, c5268i)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1752683081, true, new c(localThemeScope, c5268i)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-990801770, true, new d(localThemeScope, c5268i)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-228920459, true, new e(localThemeScope, c5268i)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(532960852, true, new f(localThemeScope, c5268i)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1294842163, true, new g(localThemeScope, c5268i)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(2056723474, true, new h(localThemeScope, c5268i)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1476362511, true, new C0747i(localThemeScope, c5268i)), 3, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(C5268i c5268i, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c5268i.f(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    @Override // Oi.c
    public void f(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(962240356);
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
                ComposerKt.U(962240356, i11, -1, "com.meijer.mobile.androidacres.showcase.foundations.ColorShowcase.Content (Colors.kt:35)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z10 = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(localThemeScope))) | ((i11 & 112) == 32);
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Ri.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C5268i.i(localThemeScope, this, (l0.w) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C15432b.a(null, null, null, false, null, null, null, false, null, (Function1) objB, composerStartRestartGroup, 0, 511);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ri.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C5268i.j(this.f33283a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Oi.c
    public String getName() {
        return "Base Colors";
    }

    @Override // Oi.c
    public Oi.l getState() {
        return this.state;
    }
}
