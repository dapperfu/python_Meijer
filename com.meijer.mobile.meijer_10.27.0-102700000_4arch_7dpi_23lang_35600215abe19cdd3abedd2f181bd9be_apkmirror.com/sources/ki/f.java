package ki;

import Ji.C;
import Ji.K;
import Ji.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
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
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.C5892t0;
import d0.InterfaceC13428B;
import h0.o;
import j0.C14801J;
import j0.C14815g;
import j0.InterfaceC14800I;
import java.util.Arrays;
import ji.q1;
import ki.f;
import kotlin.C17916Y0;
import kotlin.C6165d;
import kotlin.InterfaceC6166e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.C16088n;
import pi.C16307b;
import ri.p;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a^\u0010\u000e\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\n\u001a\u00020\t2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0007*\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\u0012*0\b\u0000\u0010\u0015\"\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u00132\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0013¨\u0006\u0016²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "isExpanded", "Lkotlin/Function1;", "", "", "onClick", "Lji/q1$a;", "template", "Lki/l;", "Lkotlin/ExtensionFunctionType;", "content", "d", "(LJi/M;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Lji/q1$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lki/b;", "e", "(Lki/b;Landroidx/compose/runtime/Composer;I)V", "LIi/g;", "", "StepProvider", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class f {

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LIi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LIi/h;", "s", "()LIi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a extends Ii.c<Integer, ki.b, ki.b> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final z1<Function1<ki.b, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final z1<ki.b> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final ki.b initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ki.f$a$a, reason: collision with other inner class name */
        public static final class C2244a implements Function0<ki.b> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ii.h f141988a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f141989b;

            public C2244a(Ii.h hVar, a aVar) {
                this.f141988a = hVar;
                this.f141989b = aVar;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ii.h, java.lang.Object, ki.b] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ki.b invoke() {
                ?? r02 = this.f141988a;
                this.f141989b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ii.c
        public z1<ki.b> r() {
            return this.state;
        }

        @Override // Ii.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public ki.b getInitialScope() {
            return this.initialScope;
        }

        public z1<Function1<ki.b, Unit>> t() {
            return this.latestContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1 function1, Composer composer, int i10, Object[] objArr, Ii.h hVar) {
            this.latestContent = o1.p(function1, composer, (i10 >> 6) & 14);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(objArr);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = o1.e(new C2244a(hVar, this));
                composer.t(objB);
            }
            composer.P();
            this.state = (z1) objB;
            this.initialScope = hVar;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ki.b f141990a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ki.b f141991a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: ki.f$b$a$a, reason: collision with other inner class name */
            public static final class C2245a implements Function1<p, Unit> {

                /* renamed from: a, reason: collision with root package name */
                public static final C2245a f141992a = new C2245a();

                public final void a(p pVar) {
                    Intrinsics.j(pVar, "<this>");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(p pVar) {
                    a(pVar);
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LIi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LIi/h;", "s", "()LIi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: ki.f$b$a$b, reason: collision with other inner class name */
            public static final class C2246b extends Ii.c<Integer, p, p> {

                /* renamed from: e, reason: collision with root package name and from kotlin metadata */
                private final z1<Function1<p, Unit>> latestContent;

                /* renamed from: f, reason: collision with root package name and from kotlin metadata */
                private final z1<p> state;

                /* renamed from: g, reason: collision with root package name and from kotlin metadata */
                private final p initialScope;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: ki.f$b$a$b$a, reason: collision with other inner class name */
                public static final class C2247a implements Function0<p> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ Ii.h f141996a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C2246b f141997b;

                    public C2247a(Ii.h hVar, C2246b c2246b) {
                        this.f141996a = hVar;
                        this.f141997b = c2246b;
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [Ii.h, java.lang.Object, ri.p] */
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final p invoke() {
                        ?? r02 = this.f141996a;
                        this.f141997b.t().getValue().invoke(r02);
                        return r02;
                    }
                }

                @Override // Ii.c
                public z1<p> r() {
                    return this.state;
                }

                @Override // Ii.i
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public p getInitialScope() {
                    return this.initialScope;
                }

                public z1<Function1<p, Unit>> t() {
                    return this.latestContent;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public C2246b(Function1 function1, Composer composer, int i10, Object[] objArr, Ii.h hVar) {
                    this.latestContent = o1.p(function1, composer, (i10 >> 6) & 14);
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(objArr);
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = o1.e(new C2247a(hVar, this));
                        composer.t(objB);
                    }
                    composer.P();
                    this.state = (z1) objB;
                    this.initialScope = hVar;
                }
            }

            public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
                Intrinsics.j(AdsRow, "$this$AdsRow");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(198606285, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.accordion.AccordionItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AccordionItem.kt:190)");
                }
                p pVarE0 = this.f141991a.getTitleLabel();
                if (pVarE0 != null) {
                    composer.startReplaceGroup(327606171);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Object[] objArr = {pVarE0};
                    composer.startReplaceGroup(-2104237158);
                    composer.startReplaceGroup(1849434622);
                    Object objB = composer.B();
                    if (objB == Composer.INSTANCE.a()) {
                        objB = C2245a.f141992a;
                        composer.t(objB);
                    }
                    composer.P();
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, 1);
                    composer.startReplaceGroup(1252494947);
                    C2246b c2246b = new C2246b((Function1) objB, composer, 0, objArrCopyOf, pVarE0);
                    composer.P();
                    c2246b.k(0, companion).invoke(composer, 0);
                    composer.P();
                    composer.P();
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            a(ki.b bVar) {
                this.f141991a = bVar;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ki.f$b$b, reason: collision with other inner class name */
        static final class C2248b implements Function3<InterfaceC6166e, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f141998a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ki.b f141999b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: ki.f$b$b$a */
            static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ ki.b f142000a;

                a(ki.b bVar) {
                    this.f142000a = bVar;
                }

                public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
                    Intrinsics.j(AdsRow, "$this$AdsRow");
                    if ((i10 & 6) == 0) {
                        i10 |= composer.V(AdsRow) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-674126449, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.accordion.AccordionItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AccordionItem.kt:223)");
                    }
                    this.f142000a.z0().invoke(AdsRow, Integer.valueOf(this.f142000a.getIndex()), composer, Integer.valueOf(i10 & 14));
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

            C2248b(LocalThemeScope localThemeScope, ki.b bVar) {
                this.f141998a = localThemeScope;
                this.f141999b = bVar;
            }

            public final void a(InterfaceC6166e AnimatedVisibility, Composer composer, int i10) {
                Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.M()) {
                    ComposerKt.U(1301524815, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.accordion.AccordionItem.<anonymous>.<anonymous>.<anonymous> (AccordionItem.kt:216)");
                }
                C16088n.i(this.f141998a, q1.Row.y(this.f141999b.getTemplate().getContainers().getDescriptionContainer(), D.k(J.h(Modifier.INSTANCE, 0.0f, 1, null), this.f141998a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null), null, null, 6, null), ComposableLambdaKt.c(-674126449, true, new a(this.f141999b), composer, 54), composer, 384);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6166e interfaceC6166e, Composer composer, Integer num) {
                a(interfaceC6166e, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        b(ki.b bVar) {
            this.f141990a = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int d(H1.d dVar, int i10) {
            return -dVar.E0(H1.h.p(20));
        }

        public final void c(LocalThemeScope AdsTheme, Composer composer, int i10) {
            int i11;
            int i12;
            Modifier modifierD;
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 6) == 0) {
                i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1143322787, i11, -1, "com.meijer.mobile.android_acres_library.atomic_providers.accordion.AccordionItem.<anonymous> (AccordionItem.kt:148)");
            }
            final H1.d dVar = (H1.d) composer.o(C5892t0.g());
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = h0.k.a();
                composer.t(objB);
            }
            h0.l lVar = (h0.l) objB;
            composer.P();
            z1<Boolean> z1VarA = o.a(lVar, composer, 6);
            composer.startReplaceGroup(1849434622);
            ki.b bVar = this.f141990a;
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = t1.e(Boolean.valueOf(bVar.getIsSelected()), null, 2, null);
                composer.t(objB2);
            }
            final InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB2;
            composer.P();
            if (this.f141990a.getSingleSelection() && !this.f141990a.getIsSelected()) {
                f(interfaceC5730l0, false);
            }
            composer.startReplaceGroup(778441915);
            if (this.f141990a.getTemplate().getIsEnabled()) {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                InterfaceC13428B interfaceC13428BF = C17916Y0.f(true, 0.0f, AdsTheme.getAdsColors().getAdsColorInteractive04Active().getColor(), 2, null);
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f141990a);
                final ki.b bVar2 = this.f141990a;
                Object objB3 = composer.B();
                if (zD || objB3 == companion.a()) {
                    objB3 = new Function0() { // from class: ki.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return f.b.g(bVar2, interfaceC5730l0);
                        }
                    };
                    composer.t(objB3);
                }
                Function0 function0 = (Function0) objB3;
                composer.P();
                i12 = 0;
                modifierD = androidx.compose.foundation.b.d(ClickableKt.c(companion2, lVar, interfaceC13428BF, false, null, null, function0, 28, null), z1VarA.getValue().booleanValue() ? AdsTheme.getAdsColors().getAdsColorInteractive04Active().getColor() : AdsTheme.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null);
            } else {
                i12 = 0;
                modifierD = Modifier.INSTANCE;
            }
            composer.P();
            ki.b bVar3 = this.f141990a;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            C5658d c5658d = C5658d.f48555a;
            C5658d.m mVarH = c5658d.h();
            e.Companion companion4 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion4.k(), composer, i12);
            int iA = C5717f.a(composer, i12);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion3);
            InterfaceC5811g.Companion companion5 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion5.a();
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
            D1.c(composerA, measurePolicyA, companion5.e());
            D1.c(composerA, interfaceC5742sR, companion5.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion5.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion5.f());
            C14815g c14815g = C14815g.f139108a;
            Modifier modifierThen = modifierD.then(bVar3.getTemplate().getModifier());
            MeasurePolicy measurePolicyB = G.b(c5658d.e(), bVar3.getTemplate().getContainers().getTitleContainer().getVerticalAlignment(), composer, 6);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierThen);
            Function0<InterfaceC5811g> function0A2 = companion5.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyB, companion5.e());
            D1.c(composerA2, interfaceC5742sR2, companion5.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion5.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion5.f());
            Modifier modifierB = InterfaceC14800I.b(C14801J.f139030a, companion3, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyA2 = C5665k.a(c5658d.h(), companion4.k(), composer, 0);
            int iA3 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierB);
            Function0<InterfaceC5811g> function0A3 = companion5.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A3);
            } else {
                composer.s();
            }
            Composer composerA3 = D1.a(composer);
            D1.c(composerA3, measurePolicyA2, companion5.e());
            D1.c(composerA3, interfaceC5742sR3, companion5.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion5.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion5.f());
            int i13 = i11 & 14;
            C16088n.i(AdsTheme, bVar3.getTemplate().getContainers().getTitleContainer(), ComposableLambdaKt.c(198606285, true, new a(bVar3), composer, 54), composer, i13 | 384);
            composer.v();
            C16307b.b(AdsTheme, q1.h.DrawableIcon.y(bVar3.getTemplate().getIcon(), e(interfaceC5730l0) ? C.f.k.f15517e : C.f.a.f15504e, null, null, null, 0.0f, null, null, 126, null), null, null, composer, i13, 6);
            composer.v();
            boolean zE = e(interfaceC5730l0);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(dVar);
            Object objB4 = composer.B();
            if (zV || objB4 == companion.a()) {
                objB4 = new Function1() { // from class: ki.h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(f.b.d(dVar, ((Integer) obj).intValue()));
                    }
                };
                composer.t(objB4);
            }
            composer.P();
            C6165d.e(c14815g, zE, null, androidx.compose.animation.f.z(null, (Function1) objB4, 1, null).c(androidx.compose.animation.f.k(null, companion4.l(), false, null, 13, null)).c(androidx.compose.animation.f.m(null, 0.4f, 1, null)), androidx.compose.animation.f.u(null, null, false, null, 15, null).c(androidx.compose.animation.f.o(null, 0.0f, 3, null)), null, ComposableLambdaKt.c(1301524815, true, new C2248b(AdsTheme, bVar3), composer, 54), composer, 1597446, 18);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            c(localThemeScope, composer, num.intValue());
            return Unit.f142422a;
        }

        private static final boolean e(InterfaceC5730l0<Boolean> interfaceC5730l0) {
            return interfaceC5730l0.getValue().booleanValue();
        }

        private static final void f(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
            interfaceC5730l0.setValue(Boolean.valueOf(z10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(ki.b bVar, InterfaceC5730l0 interfaceC5730l0) {
            f(interfaceC5730l0, !e(interfaceC5730l0));
            bVar.B0().invoke(Integer.valueOf(bVar.getIndex()));
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ji.LocalThemeScope r18, androidx.compose.ui.Modifier r19, boolean r20, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r21, final ji.q1.Accordion r22, final kotlin.jvm.functions.Function1<? super ki.l, kotlin.Unit> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.f.d(Ji.M, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function1, ji.q1$a, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void e(final ki.b bVar, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(bVar, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1897978164);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.D(bVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1897978164, i11, -1, "com.meijer.mobile.android_acres_library.atomic_providers.accordion.AccordionItem (AccordionItem.kt:146)");
            }
            K.b(null, ComposableLambdaKt.c(-1143322787, true, new b(bVar), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: ki.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return f.h(bVar, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(int i10) {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, Function1 function1, q1.Accordion accordion, Function1 function12, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, modifier, z10, function1, accordion, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(ki.b bVar, int i10, Composer composer, int i11) {
        e(bVar, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }
}
