package oi;

import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import j0.C14889J;
import j0.C14890K;
import j0.InterfaceC14888I;
import java.util.Arrays;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.q1;
import qi.C16671b;
import r1.C16819m;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u001b\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010$\u001a\u0004\b \u0010%R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R3\u0010:\u001a\u0013\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00060\u0018¢\u0006\u0002\b48\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u001b\"\u0004\b8\u00109¨\u0006;"}, d2 = {"Loi/q1;", "Loi/o1;", "", "Lki/q1$d$a;", "template", "Lkotlin/Function0;", "", "onClick", "LKi/M;", "localThemeScope", "", "label", "", "isSelected", "<init>", "(Lki/q1$d$a;Lkotlin/jvm/functions/Function0;LKi/M;Ljava/lang/String;Z)V", "Lki/q1$j;", "text", "d", "(Lki/q1$j;Ljava/lang/String;)V", "Lki/q1$h$b;", "p", "(Lki/q1$h$b;)V", "Y", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier;", "a", "()Lkotlin/jvm/functions/Function3;", "b", "Lki/q1$d$a;", "D0", "()Lki/q1$d$a;", "c", "Lkotlin/jvm/functions/Function0;", "l", "()Lkotlin/jvm/functions/Function0;", "LKi/M;", "()LKi/M;", "e", "Ljava/lang/String;", "f", "Z", "g", "Lki/q1$h$b;", "leadingIcon", "h", "trailingIcon", "Lsi/p;", "i", "Lsi/p;", "labelImpl", "Lj0/I;", "Lkotlin/ExtensionFunctionType;", "j", "Lkotlin/jvm/functions/Function3;", "getContent", "E0", "(Lkotlin/jvm/functions/Function3;)V", "content", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class q1 implements o1, InterfaceC16168i {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q1.d.ChipButton template;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onClick;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final LocalThemeScope localThemeScope;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String label;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isSelected;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private q1.h.DrawableIcon leadingIcon;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private q1.h.DrawableIcon trailingIcon;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private si.p labelImpl;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Function3<? super InterfaceC14888I, ? super Composer, ? super Integer, Unit> content;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<Modifier, Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: oi.q1$a$a, reason: collision with other inner class name */
        static final class C2384a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ q1 f154236a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: oi.q1$a$a$a, reason: collision with other inner class name */
            public static final class C2385a implements Function1<si.p, Unit> {

                /* renamed from: a, reason: collision with root package name */
                public static final C2385a f154237a = new C2385a();

                public final void a(si.p pVar) {
                    Intrinsics.j(pVar, "<this>");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(si.p pVar) {
                    a(pVar);
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0001R1\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00060\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"com/meijer/mobile/android_acres_library/core/ProviderKt$createSimpleProvider$2", "LJi/c;", "", "Landroidx/compose/runtime/z1;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "e", "Landroidx/compose/runtime/z1;", "t", "()Landroidx/compose/runtime/z1;", "latestContent", "f", "r", "state", "g", "LJi/h;", "s", "()LJi/h;", "initialScope", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: oi.q1$a$a$b */
            public static final class b extends Ji.c<Integer, si.p, si.p> {

                /* renamed from: e, reason: collision with root package name and from kotlin metadata */
                private final androidx.compose.runtime.z1<Function1<si.p, Unit>> latestContent;

                /* renamed from: f, reason: collision with root package name and from kotlin metadata */
                private final androidx.compose.runtime.z1<si.p> state;

                /* renamed from: g, reason: collision with root package name and from kotlin metadata */
                private final si.p initialScope;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: oi.q1$a$a$b$a, reason: collision with other inner class name */
                public static final class C2386a implements Function0<si.p> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ Ji.h f154241a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ b f154242b;

                    public C2386a(Ji.h hVar, b bVar) {
                        this.f154241a = hVar;
                        this.f154242b = bVar;
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [Ji.h, java.lang.Object, si.p] */
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final si.p invoke() {
                        ?? r02 = this.f154241a;
                        this.f154242b.t().getValue().invoke(r02);
                        return r02;
                    }
                }

                @Override // Ji.c
                public androidx.compose.runtime.z1<si.p> r() {
                    return this.state;
                }

                @Override // Ji.i
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public si.p getInitialScope() {
                    return this.initialScope;
                }

                public androidx.compose.runtime.z1<Function1<si.p, Unit>> t() {
                    return this.latestContent;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public b(Function1 function1, Composer composer, int i10, Object[] objArr, Ji.h hVar) {
                    this.latestContent = androidx.compose.runtime.o1.p(function1, composer, (i10 >> 6) & 14);
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(objArr);
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = androidx.compose.runtime.o1.e(new C2386a(hVar, this));
                        composer.t(objB);
                    }
                    composer.P();
                    this.state = (androidx.compose.runtime.z1) objB;
                    this.initialScope = hVar;
                }
            }

            public final void b(InterfaceC14888I interfaceC14888I, Composer composer, int i10) {
                Modifier modifierA;
                Composer composer2 = composer;
                Intrinsics.j(interfaceC14888I, "<this>");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-2136366597, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.ChipScopeImpl.getComposer.<anonymous>.<anonymous> (ChipComposable.kt:117)");
                }
                LocalThemeScope localThemeScope = this.f154236a.getLocalThemeScope();
                final q1 q1Var = this.f154236a;
                String str = q1Var.label;
                composer.startReplaceGroup(-53928901);
                if (str == null) {
                    modifierA = null;
                } else {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(q1Var);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: oi.p1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return q1.a.C2384a.c(q1Var, (r1.u) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    modifierA = C16819m.a(companion, (Function1) objB);
                }
                composer.P();
                if (modifierA == null) {
                    modifierA = Modifier.INSTANCE;
                }
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.b(), P0.e.INSTANCE.i(), composer, 54);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierA);
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
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion2.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
                C14889J c14889j = C14889J.f139620a;
                q1.h.DrawableIcon drawableIcon = q1Var.leadingIcon;
                composer.startReplaceGroup(1884186144);
                if (drawableIcon != null) {
                    C16671b.b(localThemeScope, drawableIcon, null, null, composer2, 0, 6);
                }
                composer.P();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                C14890K.a(androidx.compose.foundation.layout.J.z(companion3, H1.h.p(q1Var.leadingIcon != null ? 4 : 8)), composer, 0);
                si.p pVar = q1Var.labelImpl;
                composer.startReplaceGroup(1884195044);
                if (pVar != null) {
                    composer.startReplaceGroup(327606171);
                    Object[] objArr = {pVar};
                    composer.startReplaceGroup(-2104237158);
                    composer.startReplaceGroup(1849434622);
                    Object objB2 = composer.B();
                    if (objB2 == Composer.INSTANCE.a()) {
                        objB2 = C2385a.f154237a;
                        composer.t(objB2);
                    }
                    composer.P();
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, 1);
                    composer.startReplaceGroup(1252494947);
                    b bVar = new b((Function1) objB2, composer, 0, objArrCopyOf, pVar);
                    composer2 = composer;
                    composer.P();
                    bVar.k(0, companion3).invoke(composer, 0);
                    composer.P();
                    composer.P();
                }
                composer.P();
                C14890K.a(androidx.compose.foundation.layout.J.z(companion3, H1.h.p(q1Var.trailingIcon != null ? 4 : 8)), composer, 0);
                q1.h.DrawableIcon drawableIcon2 = q1Var.trailingIcon;
                composer.startReplaceGroup(1884202272);
                if (drawableIcon2 != null) {
                    C16671b.b(localThemeScope, drawableIcon2, null, null, composer2, 0, 6);
                }
                composer.P();
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            C2384a(q1 q1Var) {
                this.f154236a = q1Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(q1 q1Var, r1.u clearAndSetSemantics) {
                Intrinsics.j(clearAndSetSemantics, "$this$clearAndSetSemantics");
                r1.s.g0(clearAndSetSemantics, q1Var.label);
                r1.s.t0(clearAndSetSemantics, q1Var.isSelected);
                return Unit.f143329a;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                b(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        a() {
        }

        public final void a(Modifier it, Composer composer, int i10) {
            Intrinsics.j(it, "it");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2006561396, i10, -1, "com.meijer.mobile.android_acres_library.atomic_providers.button.ChipScopeImpl.getComposer.<anonymous> (ChipComposable.kt:116)");
            }
            q1 q1Var = q1.this;
            q1Var.E0(ComposableLambdaKt.c(-2136366597, true, new C2384a(q1Var), composer, 54));
            C16159f.c(q1.this, composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
            a(modifier, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public q1(q1.d.ChipButton template, Function0<Unit> onClick, LocalThemeScope localThemeScope, String str, boolean z10) {
        Intrinsics.j(template, "template");
        Intrinsics.j(onClick, "onClick");
        Intrinsics.j(localThemeScope, "localThemeScope");
        this.template = template;
        this.onClick = onClick;
        this.localThemeScope = localThemeScope;
        this.label = str;
        this.isSelected = z10;
        this.content = r1.f154246a.a();
    }

    @Override // oi.InterfaceC16168i
    /* renamed from: D0, reason: from getter */
    public q1.d.ChipButton getTemplate() {
        return this.template;
    }

    public void E0(Function3<? super InterfaceC14888I, ? super Composer, ? super Integer, Unit> function3) {
        Intrinsics.j(function3, "<set-?>");
        this.content = function3;
    }

    @Override // oi.o1
    public void Y(q1.h.DrawableIcon template) {
        Intrinsics.j(template, "template");
        this.leadingIcon = template;
    }

    @Override // oi.InterfaceC16168i, Ji.b
    public Function3<Modifier, Composer, Integer, Unit> a() {
        return ComposableLambdaKt.composableLambdaInstance(2006561396, true, new a());
    }

    @Override // Ji.h, Ai.InterfaceC2817g1
    /* renamed from: c, reason: from getter */
    public LocalThemeScope getLocalThemeScope() {
        return this.localThemeScope;
    }

    @Override // oi.o1
    public void d(q1.Label template, String text) {
        Intrinsics.j(template, "template");
        Intrinsics.j(text, "text");
        this.labelImpl = new si.p(template, getLocalThemeScope(), text, null, null, null, 56, null);
    }

    @Override // oi.InterfaceC16168i
    public Function3<InterfaceC14888I, Composer, Integer, Unit> getContent() {
        return this.content;
    }

    @Override // oi.InterfaceC16168i
    public Function0<Unit> l() {
        return this.onClick;
    }

    @Override // oi.o1
    public void p(q1.h.DrawableIcon template) {
        Intrinsics.j(template, "template");
        this.trailingIcon = template;
    }

    public /* synthetic */ q1(q1.d.ChipButton chipButton, Function0 function0, LocalThemeScope localThemeScope, String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(chipButton, function0, localThemeScope, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? false : z10);
    }
}
