package li;

import Ki.C;
import Ki.K;
import Ki.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
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
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.C6034t0;
import d0.InterfaceC13561B;
import h0.o;
import j0.C14889J;
import j0.C14903g;
import j0.InterfaceC14888I;
import java.util.Arrays;
import ki.q1;
import kotlin.C17982Y0;
import kotlin.C6304d;
import kotlin.InterfaceC6305e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import li.f;
import pi.C16453n;
import qi.C16671b;
import si.p;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a^\u0010\u000e\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\n\u001a\u00020\t2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0007*\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\u0012*0\b\u0000\u0010\u0015\"\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u00132\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0013¨\u0006\u0016²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "isExpanded", "Lkotlin/Function1;", "", "", "onClick", "Lki/q1$a;", "template", "Lli/l;", "Lkotlin/ExtensionFunctionType;", "content", "d", "(LKi/M;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Lki/q1$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lli/b;", "e", "(Lli/b;Landroidx/compose/runtime/Composer;I)V", "LJi/g;", "", "StepProvider", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class f {

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LJi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LJi/h;", "s", "()LJi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a extends Ji.c<Integer, li.b, li.b> {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final z1<Function1<li.b, Unit>> latestContent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final z1<li.b> state;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final li.b initialScope;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: li.f$a$a, reason: collision with other inner class name */
        public static final class C2298a implements Function0<li.b> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ji.h f149671a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f149672b;

            public C2298a(Ji.h hVar, a aVar) {
                this.f149671a = hVar;
                this.f149672b = aVar;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [Ji.h, java.lang.Object, li.b] */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final li.b invoke() {
                ?? r02 = this.f149671a;
                this.f149672b.t().getValue().invoke(r02);
                return r02;
            }
        }

        @Override // Ji.c
        public z1<li.b> r() {
            return this.state;
        }

        @Override // Ji.i
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public li.b getInitialScope() {
            return this.initialScope;
        }

        public z1<Function1<li.b, Unit>> t() {
            return this.latestContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1 function1, Composer composer, int i10, Object[] objArr, Ji.h hVar) {
            this.latestContent = o1.p(function1, composer, (i10 >> 6) & 14);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(objArr);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = o1.e(new C2298a(hVar, this));
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
        final /* synthetic */ li.b f149673a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ li.b f149674a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: li.f$b$a$a, reason: collision with other inner class name */
            public static final class C2299a implements Function1<p, Unit> {

                /* renamed from: a, reason: collision with root package name */
                public static final C2299a f149675a = new C2299a();

                public final void a(p pVar) {
                    Intrinsics.j(pVar, "<this>");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(p pVar) {
                    a(pVar);
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LJi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LJi/h;", "s", "()LJi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: li.f$b$a$b, reason: collision with other inner class name */
            public static final class C2300b extends Ji.c<Integer, p, p> {

                /* renamed from: e, reason: collision with root package name and from kotlin metadata */
                private final z1<Function1<p, Unit>> latestContent;

                /* renamed from: f, reason: collision with root package name and from kotlin metadata */
                private final z1<p> state;

                /* renamed from: g, reason: collision with root package name and from kotlin metadata */
                private final p initialScope;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: li.f$b$a$b$a, reason: collision with other inner class name */
                public static final class C2301a implements Function0<p> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ Ji.h f149679a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C2300b f149680b;

                    public C2301a(Ji.h hVar, C2300b c2300b) {
                        this.f149679a = hVar;
                        this.f149680b = c2300b;
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [Ji.h, java.lang.Object, si.p] */
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final p invoke() {
                        ?? r02 = this.f149679a;
                        this.f149680b.t().getValue().invoke(r02);
                        return r02;
                    }
                }

                @Override // Ji.c
                public z1<p> r() {
                    return this.state;
                }

                @Override // Ji.i
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public p getInitialScope() {
                    return this.initialScope;
                }

                public z1<Function1<p, Unit>> t() {
                    return this.latestContent;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public C2300b(Function1 function1, Composer composer, int i10, Object[] objArr, Ji.h hVar) {
                    this.latestContent = o1.p(function1, composer, (i10 >> 6) & 14);
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(objArr);
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = o1.e(new C2301a(hVar, this));
                        composer.t(objB);
                    }
                    composer.P();
                    this.state = (z1) objB;
                    this.initialScope = hVar;
                }
            }

            public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
                Intrinsics.j(AdsRow, "$this$AdsRow");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(198606285, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.accordion.AccordionItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AccordionItem.kt:190)");
                }
                p pVarE0 = this.f149674a.getTitleLabel();
                if (pVarE0 != null) {
                    composer.startReplaceGroup(327606171);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Object[] objArr = {pVarE0};
                    composer.startReplaceGroup(-2104237158);
                    composer.startReplaceGroup(1849434622);
                    Object objB = composer.B();
                    if (objB == Composer.INSTANCE.a()) {
                        objB = C2299a.f149675a;
                        composer.t(objB);
                    }
                    composer.P();
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, 1);
                    composer.startReplaceGroup(1252494947);
                    C2300b c2300b = new C2300b((Function1) objB, composer, 0, objArrCopyOf, pVarE0);
                    composer.P();
                    c2300b.k(0, companion).invoke(composer, 0);
                    composer.P();
                    composer.P();
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            a(li.b bVar) {
                this.f149674a = bVar;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: li.f$b$b, reason: collision with other inner class name */
        static final class C2302b implements Function3<InterfaceC6305e, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f149681a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ li.b f149682b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: li.f$b$b$a */
            static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ li.b f149683a;

                a(li.b bVar) {
                    this.f149683a = bVar;
                }

                public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
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
                    this.f149683a.z0().invoke(AdsRow, Integer.valueOf(this.f149683a.getIndex()), composer, Integer.valueOf(i10 & 14));
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

            C2302b(LocalThemeScope localThemeScope, li.b bVar) {
                this.f149681a = localThemeScope;
                this.f149682b = bVar;
            }

            public final void a(InterfaceC6305e AnimatedVisibility, Composer composer, int i10) {
                Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.M()) {
                    ComposerKt.U(1301524815, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.accordion.AccordionItem.<anonymous>.<anonymous>.<anonymous> (AccordionItem.kt:216)");
                }
                C16453n.i(this.f149681a, q1.Row.y(this.f149682b.getTemplate().getContainers().getDescriptionContainer(), D.k(J.h(Modifier.INSTANCE, 0.0f, 1, null), this.f149681a.getAdsSpacing().getFive().getDp(), 0.0f, 2, null), null, null, 6, null), ComposableLambdaKt.c(-674126449, true, new a(this.f149682b), composer, 54), composer, 384);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6305e interfaceC6305e, Composer composer, Integer num) {
                a(interfaceC6305e, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        b(li.b bVar) {
            this.f149673a = bVar;
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
            final H1.d dVar = (H1.d) composer.o(C6034t0.g());
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
            li.b bVar = this.f149673a;
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = t1.e(Boolean.valueOf(bVar.getIsSelected()), null, 2, null);
                composer.t(objB2);
            }
            final InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB2;
            composer.P();
            if (this.f149673a.getSingleSelection() && !this.f149673a.getIsSelected()) {
                f(interfaceC5872l0, false);
            }
            composer.startReplaceGroup(778441915);
            if (this.f149673a.getTemplate().getIsEnabled()) {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                InterfaceC13561B interfaceC13561BF = C17982Y0.f(true, 0.0f, AdsTheme.getAdsColors().getAdsColorInteractive04Active().getColor(), 2, null);
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f149673a);
                final li.b bVar2 = this.f149673a;
                Object objB3 = composer.B();
                if (zD || objB3 == companion.a()) {
                    objB3 = new Function0() { // from class: li.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return f.b.g(bVar2, interfaceC5872l0);
                        }
                    };
                    composer.t(objB3);
                }
                Function0 function0 = (Function0) objB3;
                composer.P();
                i12 = 0;
                modifierD = androidx.compose.foundation.b.d(ClickableKt.c(companion2, lVar, interfaceC13561BF, false, null, null, function0, 28, null), z1VarA.getValue().booleanValue() ? AdsTheme.getAdsColors().getAdsColorInteractive04Active().getColor() : AdsTheme.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null);
            } else {
                i12 = 0;
                modifierD = Modifier.INSTANCE;
            }
            composer.P();
            li.b bVar3 = this.f149673a;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            C5800d c5800d = C5800d.f48779a;
            C5800d.m mVarH = c5800d.h();
            e.Companion companion4 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion4.k(), composer, i12);
            int iA = C5859f.a(composer, i12);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion3);
            InterfaceC5953g.Companion companion5 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion5.a();
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
            D1.c(composerA, measurePolicyA, companion5.e());
            D1.c(composerA, interfaceC5884sR, companion5.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion5.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion5.f());
            C14903g c14903g = C14903g.f139698a;
            Modifier modifierThen = modifierD.then(bVar3.getTemplate().getModifier());
            MeasurePolicy measurePolicyB = G.b(c5800d.e(), bVar3.getTemplate().getContainers().getTitleContainer().getVerticalAlignment(), composer, 6);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierThen);
            Function0<InterfaceC5953g> function0A2 = companion5.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyB, companion5.e());
            D1.c(composerA2, interfaceC5884sR2, companion5.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion5.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion5.f());
            Modifier modifierB = InterfaceC14888I.b(C14889J.f139620a, companion3, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyA2 = C5807k.a(c5800d.h(), companion4.k(), composer, 0);
            int iA3 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierB);
            Function0<InterfaceC5953g> function0A3 = companion5.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A3);
            } else {
                composer.s();
            }
            Composer composerA3 = D1.a(composer);
            D1.c(composerA3, measurePolicyA2, companion5.e());
            D1.c(composerA3, interfaceC5884sR3, companion5.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion5.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion5.f());
            int i13 = i11 & 14;
            C16453n.i(AdsTheme, bVar3.getTemplate().getContainers().getTitleContainer(), ComposableLambdaKt.c(198606285, true, new a(bVar3), composer, 54), composer, i13 | 384);
            composer.v();
            C16671b.b(AdsTheme, q1.h.DrawableIcon.y(bVar3.getTemplate().getIcon(), e(interfaceC5872l0) ? C.f.k.f17061e : C.f.a.f17048e, null, null, null, 0.0f, null, null, 126, null), null, null, composer, i13, 6);
            composer.v();
            boolean zE = e(interfaceC5872l0);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(dVar);
            Object objB4 = composer.B();
            if (zV || objB4 == companion.a()) {
                objB4 = new Function1() { // from class: li.h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(f.b.d(dVar, ((Integer) obj).intValue()));
                    }
                };
                composer.t(objB4);
            }
            composer.P();
            C6304d.e(c14903g, zE, null, androidx.compose.animation.f.z(null, (Function1) objB4, 1, null).c(androidx.compose.animation.f.k(null, companion4.l(), false, null, 13, null)).c(androidx.compose.animation.f.m(null, 0.4f, 1, null)), androidx.compose.animation.f.u(null, null, false, null, 15, null).c(androidx.compose.animation.f.o(null, 0.0f, 3, null)), null, ComposableLambdaKt.c(1301524815, true, new C2302b(AdsTheme, bVar3), composer, 54), composer, 1597446, 18);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            c(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }

        private static final boolean e(InterfaceC5872l0<Boolean> interfaceC5872l0) {
            return interfaceC5872l0.getValue().booleanValue();
        }

        private static final void f(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
            interfaceC5872l0.setValue(Boolean.valueOf(z10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(li.b bVar, InterfaceC5872l0 interfaceC5872l0) {
            f(interfaceC5872l0, !e(interfaceC5872l0));
            bVar.B0().invoke(Integer.valueOf(bVar.getIndex()));
            return Unit.f143329a;
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
    public static final void d(final Ki.LocalThemeScope r18, androidx.compose.ui.Modifier r19, boolean r20, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r21, final ki.q1.Accordion r22, final kotlin.jvm.functions.Function1<? super li.l, kotlin.Unit> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: li.f.d(Ki.M, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function1, ki.q1$a, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void e(final li.b bVar, Composer composer, final int i10) {
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
            t0L.a(new Function2() { // from class: li.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return f.h(bVar, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(int i10) {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, Function1 function1, q1.Accordion accordion, Function1 function12, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, modifier, z10, function1, accordion, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(li.b bVar, int i10, Composer composer, int i11) {
        e(bVar, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }
}
