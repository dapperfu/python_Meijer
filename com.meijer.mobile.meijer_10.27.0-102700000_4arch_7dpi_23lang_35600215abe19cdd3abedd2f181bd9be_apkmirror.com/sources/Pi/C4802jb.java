package Pi;

import Ji.LocalThemeScope;
import Pi.C4802jb;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import ji.InterfaceC14932e0;
import ji.q1;
import ji.s1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15342b;
import l0.InterfaceC15343c;
import oi.C16088n;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\r²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\n\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\f\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\t\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\n\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\f\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"LJi/M;", "", "c", "(LJi/M;Landroidx/compose/runtime/Composer;I)V", "", "firstBox", "secondBox", "thirdBox", "fourthBox", "fourthExampleState", "fourthExampleEnabled", "thirdExampleState", "thirdExampleEnabled", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Pi.jb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4802jb {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pi.jb$a */
    static final class a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27607a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pi.jb$a$a, reason: collision with other inner class name */
        static final class C0556a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27608a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Pi.jb$a$a$a, reason: collision with other inner class name */
            static final class C0557a implements Function3<InterfaceC14932e0, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27609a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Pi.jb$a$a$a$a, reason: collision with other inner class name */
                static final class C0558a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ InterfaceC14932e0 f27610a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27611b;

                    C0558a(InterfaceC14932e0 interfaceC14932e0, LocalThemeScope localThemeScope) {
                        this.f27610a = interfaceC14932e0;
                        this.f27611b = localThemeScope;
                    }

                    public final void e(InterfaceC14800I AdsRow, Composer composer, int i10) {
                        Intrinsics.j(AdsRow, "$this$AdsRow");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(2069652707, i10, -1, "com.meijer.mobile.androidacres.showcase.components.SwitchMainView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SwitchShowcase.kt:47)");
                        }
                        composer.startReplaceGroup(1849434622);
                        Object objB = composer.B();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objB == companion.a()) {
                            objB = androidx.compose.runtime.t1.e(Boolean.TRUE, null, 2, null);
                            composer.t(objB);
                        }
                        final InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
                        composer.P();
                        q1.s.Switch defaultToggleButton = this.f27610a.getToggleButtons().getDefaultToggleButton();
                        boolean zF = f(interfaceC5730l0);
                        LocalThemeScope localThemeScope = this.f27611b;
                        composer.startReplaceGroup(5004770);
                        Object objB2 = composer.B();
                        if (objB2 == companion.a()) {
                            objB2 = new Function1() { // from class: Pi.fb
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return C4802jb.a.C0556a.C0557a.C0558a.s(interfaceC5730l0, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB2);
                        }
                        composer.P();
                        vi.s.b(localThemeScope, defaultToggleButton, zF, true, false, (Function1) objB2, composer, 199680, 8);
                        composer.startReplaceGroup(1849434622);
                        Object objB3 = composer.B();
                        if (objB3 == companion.a()) {
                            objB3 = androidx.compose.runtime.t1.e(Boolean.TRUE, null, 2, null);
                            composer.t(objB3);
                        }
                        final InterfaceC5730l0 interfaceC5730l02 = (InterfaceC5730l0) objB3;
                        composer.P();
                        q1.s.Switch defaultToggleButton2 = this.f27610a.getToggleButtons().getDefaultToggleButton();
                        boolean zT = t(interfaceC5730l02);
                        LocalThemeScope localThemeScope2 = this.f27611b;
                        composer.startReplaceGroup(5004770);
                        Object objB4 = composer.B();
                        if (objB4 == companion.a()) {
                            objB4 = new Function1() { // from class: Pi.gb
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return C4802jb.a.C0556a.C0557a.C0558a.v(interfaceC5730l02, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB4);
                        }
                        composer.P();
                        vi.s.b(localThemeScope2, defaultToggleButton2, zT, false, false, (Function1) objB4, composer, 199680, 8);
                        composer.startReplaceGroup(1849434622);
                        Object objB5 = composer.B();
                        if (objB5 == companion.a()) {
                            objB5 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                            composer.t(objB5);
                        }
                        final InterfaceC5730l0 interfaceC5730l03 = (InterfaceC5730l0) objB5;
                        composer.P();
                        q1.s.Switch defaultToggleButton3 = this.f27610a.getToggleButtons().getDefaultToggleButton();
                        boolean zG = g(interfaceC5730l03);
                        LocalThemeScope localThemeScope3 = this.f27611b;
                        composer.startReplaceGroup(5004770);
                        Object objB6 = composer.B();
                        if (objB6 == companion.a()) {
                            objB6 = new Function1() { // from class: Pi.hb
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return C4802jb.a.C0556a.C0557a.C0558a.l(interfaceC5730l03, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB6);
                        }
                        composer.P();
                        vi.s.b(localThemeScope3, defaultToggleButton3, zG, true, false, (Function1) objB6, composer, 199680, 8);
                        composer.startReplaceGroup(1849434622);
                        Object objB7 = composer.B();
                        if (objB7 == companion.a()) {
                            objB7 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                            composer.t(objB7);
                        }
                        final InterfaceC5730l0 interfaceC5730l04 = (InterfaceC5730l0) objB7;
                        composer.P();
                        q1.s.Switch defaultToggleButton4 = this.f27610a.getToggleButtons().getDefaultToggleButton();
                        boolean zO = o(interfaceC5730l04);
                        LocalThemeScope localThemeScope4 = this.f27611b;
                        composer.startReplaceGroup(5004770);
                        Object objB8 = composer.B();
                        if (objB8 == companion.a()) {
                            objB8 = new Function1() { // from class: Pi.ib
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return C4802jb.a.C0556a.C0557a.C0558a.q(interfaceC5730l04, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB8);
                        }
                        composer.P();
                        vi.s.b(localThemeScope4, defaultToggleButton4, zO, false, false, (Function1) objB8, composer, 199680, 8);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                        e(interfaceC14800I, composer, num.intValue());
                        return Unit.f142422a;
                    }

                    private static final boolean f(InterfaceC5730l0<Boolean> interfaceC5730l0) {
                        return interfaceC5730l0.getValue().booleanValue();
                    }

                    private static final boolean g(InterfaceC5730l0<Boolean> interfaceC5730l0) {
                        return interfaceC5730l0.getValue().booleanValue();
                    }

                    private static final void k(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
                        interfaceC5730l0.setValue(Boolean.valueOf(z10));
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit l(InterfaceC5730l0 interfaceC5730l0, boolean z10) {
                        k(interfaceC5730l0, z10);
                        return Unit.f142422a;
                    }

                    private static final boolean o(InterfaceC5730l0<Boolean> interfaceC5730l0) {
                        return interfaceC5730l0.getValue().booleanValue();
                    }

                    private static final void p(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
                        interfaceC5730l0.setValue(Boolean.valueOf(z10));
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit q(InterfaceC5730l0 interfaceC5730l0, boolean z10) {
                        p(interfaceC5730l0, z10);
                        return Unit.f142422a;
                    }

                    private static final void r(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
                        interfaceC5730l0.setValue(Boolean.valueOf(z10));
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit s(InterfaceC5730l0 interfaceC5730l0, boolean z10) {
                        r(interfaceC5730l0, z10);
                        return Unit.f142422a;
                    }

                    private static final boolean t(InterfaceC5730l0<Boolean> interfaceC5730l0) {
                        return interfaceC5730l0.getValue().booleanValue();
                    }

                    private static final void u(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
                        interfaceC5730l0.setValue(Boolean.valueOf(z10));
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit v(InterfaceC5730l0 interfaceC5730l0, boolean z10) {
                        u(interfaceC5730l0, z10);
                        return Unit.f142422a;
                    }
                }

                C0557a(LocalThemeScope localThemeScope) {
                    this.f27609a = localThemeScope;
                }

                public final void a(InterfaceC14932e0 Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if ((i10 & 6) == 0) {
                        i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1567297827, i10, -1, "com.meijer.mobile.androidacres.showcase.components.SwitchMainView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SwitchShowcase.kt:46)");
                    }
                    C16088n.i(this.f27609a, Assemble.getContainers().getFullBleedItem(), ComposableLambdaKt.c(2069652707, true, new C0558a(Assemble, this.f27609a), composer, 54), composer, 384);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14932e0 interfaceC14932e0, Composer composer, Integer num) {
                    a(interfaceC14932e0, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            C0556a(LocalThemeScope localThemeScope) {
                this.f27608a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(494885686, i10, -1, "com.meijer.mobile.androidacres.showcase.components.SwitchMainView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SwitchShowcase.kt:45)");
                }
                LocalThemeScope localThemeScope = this.f27608a;
                Ji.Q.e(localThemeScope, s1.i.f140227a, ComposableLambdaKt.c(1567297827, true, new C0557a(localThemeScope), composer, 54), composer, 432);
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

        a(LocalThemeScope localThemeScope) {
            this.f27607a = localThemeScope;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1961495459, i10, -1, "com.meijer.mobile.androidacres.showcase.components.SwitchMainView.<anonymous>.<anonymous>.<anonymous> (SwitchShowcase.kt:41)");
            }
            LocalThemeScope localThemeScope = this.f27607a;
            Ri.b.b(localThemeScope, null, "Basic Switch", "1.0", null, ComposableLambdaKt.c(494885686, true, new C0556a(localThemeScope), composer, 54), composer, 200064, 9);
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
    /* renamed from: Pi.jb$b */
    static final class b implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27612a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pi.jb$b$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27613a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Pi.jb$b$a$a, reason: collision with other inner class name */
            static final class C0559a implements Function3<InterfaceC14932e0, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27614a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Pi.jb$b$a$a$a, reason: collision with other inner class name */
                static final class C0560a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ InterfaceC14932e0 f27615a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27616b;

                    C0560a(InterfaceC14932e0 interfaceC14932e0, LocalThemeScope localThemeScope) {
                        this.f27615a = interfaceC14932e0;
                        this.f27616b = localThemeScope;
                    }

                    public final void c(InterfaceC14814f AdsColumn, Composer composer, int i10) {
                        androidx.compose.runtime.n1 n1Var;
                        int i11;
                        Intrinsics.j(AdsColumn, "$this$AdsColumn");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1432180714, i10, -1, "com.meijer.mobile.androidacres.showcase.components.SwitchMainView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SwitchShowcase.kt:93)");
                        }
                        composer.startReplaceGroup(1849434622);
                        Object objB = composer.B();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objB == companion.a()) {
                            objB = androidx.compose.runtime.t1.e(Boolean.TRUE, null, 2, null);
                            composer.t(objB);
                        }
                        final InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
                        composer.P();
                        composer.startReplaceGroup(1849434622);
                        Object objB2 = composer.B();
                        if (objB2 == companion.a()) {
                            objB2 = androidx.compose.runtime.t1.e(Boolean.TRUE, null, 2, null);
                            composer.t(objB2);
                        }
                        composer.P();
                        q1.Label itemLabelEnabled = this.f27615a.getLabels().getItemLabelEnabled();
                        boolean zD = d(interfaceC5730l0);
                        boolean zK = k((InterfaceC5730l0) objB2);
                        q1.s.Switch trailingToggleButton = this.f27615a.getToggleButtons().getTrailingToggleButton();
                        q1.Row item = this.f27615a.getContainers().getItem();
                        LocalThemeScope localThemeScope = this.f27616b;
                        composer.startReplaceGroup(5004770);
                        Object objB3 = composer.B();
                        if (objB3 == companion.a()) {
                            objB3 = new Function1() { // from class: Pi.kb
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return C4802jb.b.a.C0559a.C0560a.l(interfaceC5730l0, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB3);
                        }
                        composer.P();
                        Si.o.E(localThemeScope, "Switch item", itemLabelEnabled, trailingToggleButton, item, zD, zK, null, null, null, false, (Function1) objB3, composer, 48, 48, 960);
                        Si.o.E(this.f27616b, "Switch item", this.f27615a.getLabels().getItemLabelEnabled(), this.f27615a.getToggleButtons().getTrailingToggleButton(), this.f27615a.getContainers().getItem(), true, false, null, null, null, false, null, composer, 1769520, 0, 1984);
                        composer.startReplaceGroup(1849434622);
                        Object objB4 = composer.B();
                        if (objB4 == companion.a()) {
                            n1Var = null;
                            i11 = 2;
                            objB4 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                            composer.t(objB4);
                        } else {
                            n1Var = null;
                            i11 = 2;
                        }
                        final InterfaceC5730l0 interfaceC5730l02 = (InterfaceC5730l0) objB4;
                        composer.P();
                        composer.startReplaceGroup(1849434622);
                        Object objB5 = composer.B();
                        if (objB5 == companion.a()) {
                            objB5 = androidx.compose.runtime.t1.e(Boolean.TRUE, n1Var, i11, n1Var);
                            composer.t(objB5);
                        }
                        composer.P();
                        q1.Label itemLabelEnabled2 = this.f27615a.getLabels().getItemLabelEnabled();
                        boolean zO = o(interfaceC5730l02);
                        boolean zE = e((InterfaceC5730l0) objB5);
                        q1.s.Switch trailingToggleButton2 = this.f27615a.getToggleButtons().getTrailingToggleButton();
                        q1.Row item2 = this.f27615a.getContainers().getItem();
                        LocalThemeScope localThemeScope2 = this.f27616b;
                        composer.startReplaceGroup(5004770);
                        Object objB6 = composer.B();
                        if (objB6 == companion.a()) {
                            objB6 = new Function1() { // from class: Pi.lb
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return C4802jb.b.a.C0559a.C0560a.f(interfaceC5730l02, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB6);
                        }
                        composer.P();
                        Si.o.E(localThemeScope2, "Switch item", itemLabelEnabled2, trailingToggleButton2, item2, zO, zE, null, null, null, false, (Function1) objB6, composer, 48, 48, 960);
                        Si.o.E(this.f27616b, "Switch item", this.f27615a.getLabels().getItemLabelEnabled(), this.f27615a.getToggleButtons().getTrailingToggleButton(), this.f27615a.getContainers().getItem(), false, false, null, null, null, false, null, composer, 1769520, 0, 1984);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                        c(interfaceC14814f, composer, num.intValue());
                        return Unit.f142422a;
                    }

                    private static final boolean d(InterfaceC5730l0<Boolean> interfaceC5730l0) {
                        return interfaceC5730l0.getValue().booleanValue();
                    }

                    private static final boolean e(InterfaceC5730l0<Boolean> interfaceC5730l0) {
                        return interfaceC5730l0.getValue().booleanValue();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit f(InterfaceC5730l0 interfaceC5730l0, boolean z10) {
                        p(interfaceC5730l0, !o(interfaceC5730l0));
                        return Unit.f142422a;
                    }

                    private static final void g(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
                        interfaceC5730l0.setValue(Boolean.valueOf(z10));
                    }

                    private static final boolean k(InterfaceC5730l0<Boolean> interfaceC5730l0) {
                        return interfaceC5730l0.getValue().booleanValue();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit l(InterfaceC5730l0 interfaceC5730l0, boolean z10) {
                        g(interfaceC5730l0, !d(interfaceC5730l0));
                        return Unit.f142422a;
                    }

                    private static final boolean o(InterfaceC5730l0<Boolean> interfaceC5730l0) {
                        return interfaceC5730l0.getValue().booleanValue();
                    }

                    private static final void p(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
                        interfaceC5730l0.setValue(Boolean.valueOf(z10));
                    }
                }

                C0559a(LocalThemeScope localThemeScope) {
                    this.f27614a = localThemeScope;
                }

                public final void a(InterfaceC14932e0 Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if ((i10 & 6) == 0) {
                        i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(677615308, i10, -1, "com.meijer.mobile.androidacres.showcase.components.SwitchMainView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SwitchShowcase.kt:92)");
                    }
                    C16088n.e(this.f27614a, Assemble.getContainers().getList(), ComposableLambdaKt.c(-1432180714, true, new C0560a(Assemble, this.f27614a), composer, 54), composer, 384);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14932e0 interfaceC14932e0, Composer composer, Integer num) {
                    a(interfaceC14932e0, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(LocalThemeScope localThemeScope) {
                this.f27613a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(881698847, i10, -1, "com.meijer.mobile.androidacres.showcase.components.SwitchMainView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SwitchShowcase.kt:91)");
                }
                LocalThemeScope localThemeScope = this.f27613a;
                Ji.Q.e(localThemeScope, s1.i.f140227a, ComposableLambdaKt.c(677615308, true, new C0559a(localThemeScope), composer, 54), composer, 432);
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

        b(LocalThemeScope localThemeScope) {
            this.f27612a = localThemeScope;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1544417612, i10, -1, "com.meijer.mobile.androidacres.showcase.components.SwitchMainView.<anonymous>.<anonymous>.<anonymous> (SwitchShowcase.kt:87)");
            }
            LocalThemeScope localThemeScope = this.f27612a;
            Ri.b.b(localThemeScope, null, "Switch with title", "1.0", null, ComposableLambdaKt.c(881698847, true, new a(localThemeScope), composer, 54), composer, 200064, 9);
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
    /* renamed from: Pi.jb$c */
    static final class c implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27617a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pi.jb$c$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27618a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Pi.jb$c$a$a, reason: collision with other inner class name */
            static final class C0561a implements Function3<InterfaceC14932e0, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27619a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Pi.jb$c$a$a$a, reason: collision with other inner class name */
                static final class C0562a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ InterfaceC14932e0 f27620a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27621b;

                    C0562a(InterfaceC14932e0 interfaceC14932e0, LocalThemeScope localThemeScope) {
                        this.f27620a = interfaceC14932e0;
                        this.f27621b = localThemeScope;
                    }

                    public final void c(InterfaceC14814f AdsColumn, Composer composer, int i10) {
                        int i11;
                        androidx.compose.runtime.n1 n1Var;
                        Intrinsics.j(AdsColumn, "$this$AdsColumn");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1879793205, i10, -1, "com.meijer.mobile.androidacres.showcase.components.SwitchMainView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SwitchShowcase.kt:146)");
                        }
                        composer.startReplaceGroup(1849434622);
                        Object objB = composer.B();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objB == companion.a()) {
                            objB = androidx.compose.runtime.t1.e(Boolean.TRUE, null, 2, null);
                            composer.t(objB);
                        }
                        final InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
                        composer.P();
                        composer.startReplaceGroup(1849434622);
                        Object objB2 = composer.B();
                        if (objB2 == companion.a()) {
                            objB2 = androidx.compose.runtime.t1.e(Boolean.TRUE, null, 2, null);
                            composer.t(objB2);
                        }
                        composer.P();
                        q1.Label itemLabelEnabled = this.f27620a.getLabels().getItemLabelEnabled();
                        q1.Label itemLabelDescription = this.f27620a.getLabels().getItemLabelDescription();
                        boolean zD = d(interfaceC5730l0);
                        boolean zK = k((InterfaceC5730l0) objB2);
                        q1.s.Switch trailingToggleButton = this.f27620a.getToggleButtons().getTrailingToggleButton();
                        q1.Row item = this.f27620a.getContainers().getItem();
                        LocalThemeScope localThemeScope = this.f27621b;
                        composer.startReplaceGroup(5004770);
                        Object objB3 = composer.B();
                        if (objB3 == companion.a()) {
                            objB3 = new Function1() { // from class: Pi.mb
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return C4802jb.c.a.C0561a.C0562a.l(interfaceC5730l0, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB3);
                        }
                        composer.P();
                        Si.o.E(localThemeScope, "Switch item", itemLabelEnabled, trailingToggleButton, item, zD, zK, null, itemLabelDescription, "A brief description if toggling to another state will cause a change in context.", false, (Function1) objB3, composer, 805306416, 48, 576);
                        q1.Label itemLabelEnabled2 = this.f27620a.getLabels().getItemLabelEnabled();
                        q1.Label itemLabelDescription2 = this.f27620a.getLabels().getItemLabelDescription();
                        Si.o.E(this.f27621b, "Switch item", itemLabelEnabled2, this.f27620a.getToggleButtons().getTrailingToggleButton(), this.f27620a.getContainers().getItem(), true, false, null, itemLabelDescription2, "A brief description if toggling to another state will cause a change in context.", false, null, composer, 807075888, 0, 1600);
                        composer.startReplaceGroup(1849434622);
                        Object objB4 = composer.B();
                        if (objB4 == companion.a()) {
                            i11 = 2;
                            n1Var = null;
                            objB4 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                            composer.t(objB4);
                        } else {
                            i11 = 2;
                            n1Var = null;
                        }
                        final InterfaceC5730l0 interfaceC5730l02 = (InterfaceC5730l0) objB4;
                        composer.P();
                        composer.startReplaceGroup(1849434622);
                        Object objB5 = composer.B();
                        if (objB5 == companion.a()) {
                            objB5 = androidx.compose.runtime.t1.e(Boolean.TRUE, n1Var, i11, n1Var);
                            composer.t(objB5);
                        }
                        composer.P();
                        q1.Label itemLabelEnabled3 = this.f27620a.getLabels().getItemLabelEnabled();
                        q1.Label itemLabelDescription3 = this.f27620a.getLabels().getItemLabelDescription();
                        boolean zO = o(interfaceC5730l02);
                        boolean zE = e((InterfaceC5730l0) objB5);
                        q1.s.Switch trailingToggleButton2 = this.f27620a.getToggleButtons().getTrailingToggleButton();
                        q1.Row item2 = this.f27620a.getContainers().getItem();
                        LocalThemeScope localThemeScope2 = this.f27621b;
                        composer.startReplaceGroup(5004770);
                        Object objB6 = composer.B();
                        if (objB6 == companion.a()) {
                            objB6 = new Function1() { // from class: Pi.nb
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return C4802jb.c.a.C0561a.C0562a.f(interfaceC5730l02, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB6);
                        }
                        composer.P();
                        Si.o.E(localThemeScope2, "Switch item", itemLabelEnabled3, trailingToggleButton2, item2, zO, zE, null, itemLabelDescription3, "A brief description if toggling to another state will cause a change in context.", false, (Function1) objB6, composer, 805306416, 48, 576);
                        q1.Label itemLabelEnabled4 = this.f27620a.getLabels().getItemLabelEnabled();
                        q1.Label itemLabelDescription4 = this.f27620a.getLabels().getItemLabelDescription();
                        Si.o.E(this.f27621b, "Switch item", itemLabelEnabled4, this.f27620a.getToggleButtons().getTrailingToggleButton(), this.f27620a.getContainers().getItem(), false, false, null, itemLabelDescription4, "A brief description if toggling to another state will cause a change in context.", false, null, composer, 807075888, 0, 1600);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                        c(interfaceC14814f, composer, num.intValue());
                        return Unit.f142422a;
                    }

                    private static final boolean d(InterfaceC5730l0<Boolean> interfaceC5730l0) {
                        return interfaceC5730l0.getValue().booleanValue();
                    }

                    private static final boolean e(InterfaceC5730l0<Boolean> interfaceC5730l0) {
                        return interfaceC5730l0.getValue().booleanValue();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit f(InterfaceC5730l0 interfaceC5730l0, boolean z10) {
                        p(interfaceC5730l0, !o(interfaceC5730l0));
                        return Unit.f142422a;
                    }

                    private static final void g(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
                        interfaceC5730l0.setValue(Boolean.valueOf(z10));
                    }

                    private static final boolean k(InterfaceC5730l0<Boolean> interfaceC5730l0) {
                        return interfaceC5730l0.getValue().booleanValue();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit l(InterfaceC5730l0 interfaceC5730l0, boolean z10) {
                        g(interfaceC5730l0, !d(interfaceC5730l0));
                        return Unit.f142422a;
                    }

                    private static final boolean o(InterfaceC5730l0<Boolean> interfaceC5730l0) {
                        return interfaceC5730l0.getValue().booleanValue();
                    }

                    private static final void p(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
                        interfaceC5730l0.setValue(Boolean.valueOf(z10));
                    }
                }

                C0561a(LocalThemeScope localThemeScope) {
                    this.f27619a = localThemeScope;
                }

                public final void a(InterfaceC14932e0 Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if ((i10 & 6) == 0) {
                        i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-305378069, i10, -1, "com.meijer.mobile.androidacres.showcase.components.SwitchMainView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SwitchShowcase.kt:145)");
                    }
                    C16088n.e(this.f27619a, Assemble.getContainers().getList(), ComposableLambdaKt.c(1879793205, true, new C0562a(Assemble, this.f27619a), composer, 54), composer, 384);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14932e0 interfaceC14932e0, Composer composer, Integer num) {
                    a(interfaceC14932e0, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(LocalThemeScope localThemeScope) {
                this.f27618a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-101294530, i10, -1, "com.meijer.mobile.androidacres.showcase.components.SwitchMainView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SwitchShowcase.kt:144)");
                }
                LocalThemeScope localThemeScope = this.f27618a;
                Ji.Q.e(localThemeScope, s1.i.f140227a, ComposableLambdaKt.c(-305378069, true, new C0561a(localThemeScope), composer, 54), composer, 432);
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

        c(LocalThemeScope localThemeScope) {
            this.f27617a = localThemeScope;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(561424235, i10, -1, "com.meijer.mobile.androidacres.showcase.components.SwitchMainView.<anonymous>.<anonymous>.<anonymous> (SwitchShowcase.kt:140)");
            }
            LocalThemeScope localThemeScope = this.f27617a;
            Ri.b.b(localThemeScope, null, "Switch with description", "1.0", null, ComposableLambdaKt.c(-101294530, true, new a(localThemeScope), composer, 54), composer, 200064, 9);
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

    public static final void c(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-407429416);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-407429416, i11, -1, "com.meijer.mobile.androidacres.showcase.components.SwitchMainView (SwitchShowcase.kt:38)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z10 = (i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(localThemeScope));
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Pi.db
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4802jb.d(localThemeScope, (l0.w) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            C15342b.a(null, null, null, false, null, null, null, false, null, (Function1) objB, composerStartRestartGroup, 0, 511);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Pi.eb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4802jb.e(localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LocalThemeScope localThemeScope, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1961495459, true, new a(localThemeScope)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1544417612, true, new b(localThemeScope)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(561424235, true, new c(localThemeScope)), 3, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }
}
