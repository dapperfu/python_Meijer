package Qi;

import Ki.LocalThemeScope;
import Qi.C4886jb;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import ki.InterfaceC15166e0;
import ki.q1;
import ki.s1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15432b;
import l0.InterfaceC15433c;
import pi.C16453n;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\r²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\n\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\f\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\t\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\n\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\f\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"LKi/M;", "", "c", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "", "firstBox", "secondBox", "thirdBox", "fourthBox", "fourthExampleState", "fourthExampleEnabled", "thirdExampleState", "thirdExampleEnabled", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Qi.jb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4886jb {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qi.jb$a */
    static final class a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30319a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qi.jb$a$a, reason: collision with other inner class name */
        static final class C0620a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30320a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qi.jb$a$a$a, reason: collision with other inner class name */
            static final class C0621a implements Function3<InterfaceC15166e0, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f30321a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.jb$a$a$a$a, reason: collision with other inner class name */
                static final class C0622a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ InterfaceC15166e0 f30322a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f30323b;

                    C0622a(InterfaceC15166e0 interfaceC15166e0, LocalThemeScope localThemeScope) {
                        this.f30322a = interfaceC15166e0;
                        this.f30323b = localThemeScope;
                    }

                    public final void e(InterfaceC14888I AdsRow, Composer composer, int i10) {
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
                        final InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
                        composer.P();
                        q1.s.Switch defaultToggleButton = this.f30322a.getToggleButtons().getDefaultToggleButton();
                        boolean zF = f(interfaceC5872l0);
                        LocalThemeScope localThemeScope = this.f30323b;
                        composer.startReplaceGroup(5004770);
                        Object objB2 = composer.B();
                        if (objB2 == companion.a()) {
                            objB2 = new Function1() { // from class: Qi.fb
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return C4886jb.a.C0620a.C0621a.C0622a.s(interfaceC5872l0, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB2);
                        }
                        composer.P();
                        wi.s.b(localThemeScope, defaultToggleButton, zF, true, false, (Function1) objB2, composer, 199680, 8);
                        composer.startReplaceGroup(1849434622);
                        Object objB3 = composer.B();
                        if (objB3 == companion.a()) {
                            objB3 = androidx.compose.runtime.t1.e(Boolean.TRUE, null, 2, null);
                            composer.t(objB3);
                        }
                        final InterfaceC5872l0 interfaceC5872l02 = (InterfaceC5872l0) objB3;
                        composer.P();
                        q1.s.Switch defaultToggleButton2 = this.f30322a.getToggleButtons().getDefaultToggleButton();
                        boolean zT = t(interfaceC5872l02);
                        LocalThemeScope localThemeScope2 = this.f30323b;
                        composer.startReplaceGroup(5004770);
                        Object objB4 = composer.B();
                        if (objB4 == companion.a()) {
                            objB4 = new Function1() { // from class: Qi.gb
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return C4886jb.a.C0620a.C0621a.C0622a.v(interfaceC5872l02, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB4);
                        }
                        composer.P();
                        wi.s.b(localThemeScope2, defaultToggleButton2, zT, false, false, (Function1) objB4, composer, 199680, 8);
                        composer.startReplaceGroup(1849434622);
                        Object objB5 = composer.B();
                        if (objB5 == companion.a()) {
                            objB5 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                            composer.t(objB5);
                        }
                        final InterfaceC5872l0 interfaceC5872l03 = (InterfaceC5872l0) objB5;
                        composer.P();
                        q1.s.Switch defaultToggleButton3 = this.f30322a.getToggleButtons().getDefaultToggleButton();
                        boolean zG = g(interfaceC5872l03);
                        LocalThemeScope localThemeScope3 = this.f30323b;
                        composer.startReplaceGroup(5004770);
                        Object objB6 = composer.B();
                        if (objB6 == companion.a()) {
                            objB6 = new Function1() { // from class: Qi.hb
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return C4886jb.a.C0620a.C0621a.C0622a.l(interfaceC5872l03, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB6);
                        }
                        composer.P();
                        wi.s.b(localThemeScope3, defaultToggleButton3, zG, true, false, (Function1) objB6, composer, 199680, 8);
                        composer.startReplaceGroup(1849434622);
                        Object objB7 = composer.B();
                        if (objB7 == companion.a()) {
                            objB7 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                            composer.t(objB7);
                        }
                        final InterfaceC5872l0 interfaceC5872l04 = (InterfaceC5872l0) objB7;
                        composer.P();
                        q1.s.Switch defaultToggleButton4 = this.f30322a.getToggleButtons().getDefaultToggleButton();
                        boolean zO = o(interfaceC5872l04);
                        LocalThemeScope localThemeScope4 = this.f30323b;
                        composer.startReplaceGroup(5004770);
                        Object objB8 = composer.B();
                        if (objB8 == companion.a()) {
                            objB8 = new Function1() { // from class: Qi.ib
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return C4886jb.a.C0620a.C0621a.C0622a.q(interfaceC5872l04, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB8);
                        }
                        composer.P();
                        wi.s.b(localThemeScope4, defaultToggleButton4, zO, false, false, (Function1) objB8, composer, 199680, 8);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                        e(interfaceC14888I, composer, num.intValue());
                        return Unit.f143329a;
                    }

                    private static final boolean f(InterfaceC5872l0<Boolean> interfaceC5872l0) {
                        return interfaceC5872l0.getValue().booleanValue();
                    }

                    private static final boolean g(InterfaceC5872l0<Boolean> interfaceC5872l0) {
                        return interfaceC5872l0.getValue().booleanValue();
                    }

                    private static final void k(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
                        interfaceC5872l0.setValue(Boolean.valueOf(z10));
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit l(InterfaceC5872l0 interfaceC5872l0, boolean z10) {
                        k(interfaceC5872l0, z10);
                        return Unit.f143329a;
                    }

                    private static final boolean o(InterfaceC5872l0<Boolean> interfaceC5872l0) {
                        return interfaceC5872l0.getValue().booleanValue();
                    }

                    private static final void p(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
                        interfaceC5872l0.setValue(Boolean.valueOf(z10));
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit q(InterfaceC5872l0 interfaceC5872l0, boolean z10) {
                        p(interfaceC5872l0, z10);
                        return Unit.f143329a;
                    }

                    private static final void r(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
                        interfaceC5872l0.setValue(Boolean.valueOf(z10));
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit s(InterfaceC5872l0 interfaceC5872l0, boolean z10) {
                        r(interfaceC5872l0, z10);
                        return Unit.f143329a;
                    }

                    private static final boolean t(InterfaceC5872l0<Boolean> interfaceC5872l0) {
                        return interfaceC5872l0.getValue().booleanValue();
                    }

                    private static final void u(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
                        interfaceC5872l0.setValue(Boolean.valueOf(z10));
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit v(InterfaceC5872l0 interfaceC5872l0, boolean z10) {
                        u(interfaceC5872l0, z10);
                        return Unit.f143329a;
                    }
                }

                C0621a(LocalThemeScope localThemeScope) {
                    this.f30321a = localThemeScope;
                }

                public final void a(InterfaceC15166e0 Assemble, Composer composer, int i10) {
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
                    C16453n.i(this.f30321a, Assemble.getContainers().getFullBleedItem(), ComposableLambdaKt.c(2069652707, true, new C0622a(Assemble, this.f30321a), composer, 54), composer, 384);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15166e0 interfaceC15166e0, Composer composer, Integer num) {
                    a(interfaceC15166e0, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            C0620a(LocalThemeScope localThemeScope) {
                this.f30320a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(494885686, i10, -1, "com.meijer.mobile.androidacres.showcase.components.SwitchMainView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SwitchShowcase.kt:45)");
                }
                LocalThemeScope localThemeScope = this.f30320a;
                Ki.Q.e(localThemeScope, s1.i.f142482a, ComposableLambdaKt.c(1567297827, true, new C0621a(localThemeScope), composer, 54), composer, 432);
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

        a(LocalThemeScope localThemeScope) {
            this.f30319a = localThemeScope;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1961495459, i10, -1, "com.meijer.mobile.androidacres.showcase.components.SwitchMainView.<anonymous>.<anonymous>.<anonymous> (SwitchShowcase.kt:41)");
            }
            LocalThemeScope localThemeScope = this.f30319a;
            Si.b.b(localThemeScope, null, "Basic Switch", "1.0", null, ComposableLambdaKt.c(494885686, true, new C0620a(localThemeScope), composer, 54), composer, 200064, 9);
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
    /* renamed from: Qi.jb$b */
    static final class b implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30324a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qi.jb$b$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30325a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qi.jb$b$a$a, reason: collision with other inner class name */
            static final class C0623a implements Function3<InterfaceC15166e0, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f30326a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.jb$b$a$a$a, reason: collision with other inner class name */
                static final class C0624a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ InterfaceC15166e0 f30327a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f30328b;

                    C0624a(InterfaceC15166e0 interfaceC15166e0, LocalThemeScope localThemeScope) {
                        this.f30327a = interfaceC15166e0;
                        this.f30328b = localThemeScope;
                    }

                    public final void c(InterfaceC14902f AdsColumn, Composer composer, int i10) {
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
                        final InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
                        composer.P();
                        composer.startReplaceGroup(1849434622);
                        Object objB2 = composer.B();
                        if (objB2 == companion.a()) {
                            objB2 = androidx.compose.runtime.t1.e(Boolean.TRUE, null, 2, null);
                            composer.t(objB2);
                        }
                        composer.P();
                        q1.Label itemLabelEnabled = this.f30327a.getLabels().getItemLabelEnabled();
                        boolean zD = d(interfaceC5872l0);
                        boolean zK = k((InterfaceC5872l0) objB2);
                        q1.s.Switch trailingToggleButton = this.f30327a.getToggleButtons().getTrailingToggleButton();
                        q1.Row item = this.f30327a.getContainers().getItem();
                        LocalThemeScope localThemeScope = this.f30328b;
                        composer.startReplaceGroup(5004770);
                        Object objB3 = composer.B();
                        if (objB3 == companion.a()) {
                            objB3 = new Function1() { // from class: Qi.kb
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return C4886jb.b.a.C0623a.C0624a.l(interfaceC5872l0, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB3);
                        }
                        composer.P();
                        Ti.o.E(localThemeScope, "Switch item", itemLabelEnabled, trailingToggleButton, item, zD, zK, null, null, null, false, (Function1) objB3, composer, 48, 48, 960);
                        Ti.o.E(this.f30328b, "Switch item", this.f30327a.getLabels().getItemLabelEnabled(), this.f30327a.getToggleButtons().getTrailingToggleButton(), this.f30327a.getContainers().getItem(), true, false, null, null, null, false, null, composer, 1769520, 0, 1984);
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
                        final InterfaceC5872l0 interfaceC5872l02 = (InterfaceC5872l0) objB4;
                        composer.P();
                        composer.startReplaceGroup(1849434622);
                        Object objB5 = composer.B();
                        if (objB5 == companion.a()) {
                            objB5 = androidx.compose.runtime.t1.e(Boolean.TRUE, n1Var, i11, n1Var);
                            composer.t(objB5);
                        }
                        composer.P();
                        q1.Label itemLabelEnabled2 = this.f30327a.getLabels().getItemLabelEnabled();
                        boolean zO = o(interfaceC5872l02);
                        boolean zE = e((InterfaceC5872l0) objB5);
                        q1.s.Switch trailingToggleButton2 = this.f30327a.getToggleButtons().getTrailingToggleButton();
                        q1.Row item2 = this.f30327a.getContainers().getItem();
                        LocalThemeScope localThemeScope2 = this.f30328b;
                        composer.startReplaceGroup(5004770);
                        Object objB6 = composer.B();
                        if (objB6 == companion.a()) {
                            objB6 = new Function1() { // from class: Qi.lb
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return C4886jb.b.a.C0623a.C0624a.f(interfaceC5872l02, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB6);
                        }
                        composer.P();
                        Ti.o.E(localThemeScope2, "Switch item", itemLabelEnabled2, trailingToggleButton2, item2, zO, zE, null, null, null, false, (Function1) objB6, composer, 48, 48, 960);
                        Ti.o.E(this.f30328b, "Switch item", this.f30327a.getLabels().getItemLabelEnabled(), this.f30327a.getToggleButtons().getTrailingToggleButton(), this.f30327a.getContainers().getItem(), false, false, null, null, null, false, null, composer, 1769520, 0, 1984);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                        c(interfaceC14902f, composer, num.intValue());
                        return Unit.f143329a;
                    }

                    private static final boolean d(InterfaceC5872l0<Boolean> interfaceC5872l0) {
                        return interfaceC5872l0.getValue().booleanValue();
                    }

                    private static final boolean e(InterfaceC5872l0<Boolean> interfaceC5872l0) {
                        return interfaceC5872l0.getValue().booleanValue();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit f(InterfaceC5872l0 interfaceC5872l0, boolean z10) {
                        p(interfaceC5872l0, !o(interfaceC5872l0));
                        return Unit.f143329a;
                    }

                    private static final void g(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
                        interfaceC5872l0.setValue(Boolean.valueOf(z10));
                    }

                    private static final boolean k(InterfaceC5872l0<Boolean> interfaceC5872l0) {
                        return interfaceC5872l0.getValue().booleanValue();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit l(InterfaceC5872l0 interfaceC5872l0, boolean z10) {
                        g(interfaceC5872l0, !d(interfaceC5872l0));
                        return Unit.f143329a;
                    }

                    private static final boolean o(InterfaceC5872l0<Boolean> interfaceC5872l0) {
                        return interfaceC5872l0.getValue().booleanValue();
                    }

                    private static final void p(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
                        interfaceC5872l0.setValue(Boolean.valueOf(z10));
                    }
                }

                C0623a(LocalThemeScope localThemeScope) {
                    this.f30326a = localThemeScope;
                }

                public final void a(InterfaceC15166e0 Assemble, Composer composer, int i10) {
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
                    C16453n.e(this.f30326a, Assemble.getContainers().getList(), ComposableLambdaKt.c(-1432180714, true, new C0624a(Assemble, this.f30326a), composer, 54), composer, 384);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15166e0 interfaceC15166e0, Composer composer, Integer num) {
                    a(interfaceC15166e0, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(LocalThemeScope localThemeScope) {
                this.f30325a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(881698847, i10, -1, "com.meijer.mobile.androidacres.showcase.components.SwitchMainView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SwitchShowcase.kt:91)");
                }
                LocalThemeScope localThemeScope = this.f30325a;
                Ki.Q.e(localThemeScope, s1.i.f142482a, ComposableLambdaKt.c(677615308, true, new C0623a(localThemeScope), composer, 54), composer, 432);
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

        b(LocalThemeScope localThemeScope) {
            this.f30324a = localThemeScope;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1544417612, i10, -1, "com.meijer.mobile.androidacres.showcase.components.SwitchMainView.<anonymous>.<anonymous>.<anonymous> (SwitchShowcase.kt:87)");
            }
            LocalThemeScope localThemeScope = this.f30324a;
            Si.b.b(localThemeScope, null, "Switch with title", "1.0", null, ComposableLambdaKt.c(881698847, true, new a(localThemeScope), composer, 54), composer, 200064, 9);
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
    /* renamed from: Qi.jb$c */
    static final class c implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30329a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qi.jb$c$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30330a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qi.jb$c$a$a, reason: collision with other inner class name */
            static final class C0625a implements Function3<InterfaceC15166e0, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f30331a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.jb$c$a$a$a, reason: collision with other inner class name */
                static final class C0626a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ InterfaceC15166e0 f30332a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f30333b;

                    C0626a(InterfaceC15166e0 interfaceC15166e0, LocalThemeScope localThemeScope) {
                        this.f30332a = interfaceC15166e0;
                        this.f30333b = localThemeScope;
                    }

                    public final void c(InterfaceC14902f AdsColumn, Composer composer, int i10) {
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
                        final InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
                        composer.P();
                        composer.startReplaceGroup(1849434622);
                        Object objB2 = composer.B();
                        if (objB2 == companion.a()) {
                            objB2 = androidx.compose.runtime.t1.e(Boolean.TRUE, null, 2, null);
                            composer.t(objB2);
                        }
                        composer.P();
                        q1.Label itemLabelEnabled = this.f30332a.getLabels().getItemLabelEnabled();
                        q1.Label itemLabelDescription = this.f30332a.getLabels().getItemLabelDescription();
                        boolean zD = d(interfaceC5872l0);
                        boolean zK = k((InterfaceC5872l0) objB2);
                        q1.s.Switch trailingToggleButton = this.f30332a.getToggleButtons().getTrailingToggleButton();
                        q1.Row item = this.f30332a.getContainers().getItem();
                        LocalThemeScope localThemeScope = this.f30333b;
                        composer.startReplaceGroup(5004770);
                        Object objB3 = composer.B();
                        if (objB3 == companion.a()) {
                            objB3 = new Function1() { // from class: Qi.mb
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return C4886jb.c.a.C0625a.C0626a.l(interfaceC5872l0, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB3);
                        }
                        composer.P();
                        Ti.o.E(localThemeScope, "Switch item", itemLabelEnabled, trailingToggleButton, item, zD, zK, null, itemLabelDescription, "A brief description if toggling to another state will cause a change in context.", false, (Function1) objB3, composer, 805306416, 48, 576);
                        q1.Label itemLabelEnabled2 = this.f30332a.getLabels().getItemLabelEnabled();
                        q1.Label itemLabelDescription2 = this.f30332a.getLabels().getItemLabelDescription();
                        Ti.o.E(this.f30333b, "Switch item", itemLabelEnabled2, this.f30332a.getToggleButtons().getTrailingToggleButton(), this.f30332a.getContainers().getItem(), true, false, null, itemLabelDescription2, "A brief description if toggling to another state will cause a change in context.", false, null, composer, 807075888, 0, 1600);
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
                        final InterfaceC5872l0 interfaceC5872l02 = (InterfaceC5872l0) objB4;
                        composer.P();
                        composer.startReplaceGroup(1849434622);
                        Object objB5 = composer.B();
                        if (objB5 == companion.a()) {
                            objB5 = androidx.compose.runtime.t1.e(Boolean.TRUE, n1Var, i11, n1Var);
                            composer.t(objB5);
                        }
                        composer.P();
                        q1.Label itemLabelEnabled3 = this.f30332a.getLabels().getItemLabelEnabled();
                        q1.Label itemLabelDescription3 = this.f30332a.getLabels().getItemLabelDescription();
                        boolean zO = o(interfaceC5872l02);
                        boolean zE = e((InterfaceC5872l0) objB5);
                        q1.s.Switch trailingToggleButton2 = this.f30332a.getToggleButtons().getTrailingToggleButton();
                        q1.Row item2 = this.f30332a.getContainers().getItem();
                        LocalThemeScope localThemeScope2 = this.f30333b;
                        composer.startReplaceGroup(5004770);
                        Object objB6 = composer.B();
                        if (objB6 == companion.a()) {
                            objB6 = new Function1() { // from class: Qi.nb
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return C4886jb.c.a.C0625a.C0626a.f(interfaceC5872l02, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB6);
                        }
                        composer.P();
                        Ti.o.E(localThemeScope2, "Switch item", itemLabelEnabled3, trailingToggleButton2, item2, zO, zE, null, itemLabelDescription3, "A brief description if toggling to another state will cause a change in context.", false, (Function1) objB6, composer, 805306416, 48, 576);
                        q1.Label itemLabelEnabled4 = this.f30332a.getLabels().getItemLabelEnabled();
                        q1.Label itemLabelDescription4 = this.f30332a.getLabels().getItemLabelDescription();
                        Ti.o.E(this.f30333b, "Switch item", itemLabelEnabled4, this.f30332a.getToggleButtons().getTrailingToggleButton(), this.f30332a.getContainers().getItem(), false, false, null, itemLabelDescription4, "A brief description if toggling to another state will cause a change in context.", false, null, composer, 807075888, 0, 1600);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                        c(interfaceC14902f, composer, num.intValue());
                        return Unit.f143329a;
                    }

                    private static final boolean d(InterfaceC5872l0<Boolean> interfaceC5872l0) {
                        return interfaceC5872l0.getValue().booleanValue();
                    }

                    private static final boolean e(InterfaceC5872l0<Boolean> interfaceC5872l0) {
                        return interfaceC5872l0.getValue().booleanValue();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit f(InterfaceC5872l0 interfaceC5872l0, boolean z10) {
                        p(interfaceC5872l0, !o(interfaceC5872l0));
                        return Unit.f143329a;
                    }

                    private static final void g(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
                        interfaceC5872l0.setValue(Boolean.valueOf(z10));
                    }

                    private static final boolean k(InterfaceC5872l0<Boolean> interfaceC5872l0) {
                        return interfaceC5872l0.getValue().booleanValue();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit l(InterfaceC5872l0 interfaceC5872l0, boolean z10) {
                        g(interfaceC5872l0, !d(interfaceC5872l0));
                        return Unit.f143329a;
                    }

                    private static final boolean o(InterfaceC5872l0<Boolean> interfaceC5872l0) {
                        return interfaceC5872l0.getValue().booleanValue();
                    }

                    private static final void p(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
                        interfaceC5872l0.setValue(Boolean.valueOf(z10));
                    }
                }

                C0625a(LocalThemeScope localThemeScope) {
                    this.f30331a = localThemeScope;
                }

                public final void a(InterfaceC15166e0 Assemble, Composer composer, int i10) {
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
                    C16453n.e(this.f30331a, Assemble.getContainers().getList(), ComposableLambdaKt.c(1879793205, true, new C0626a(Assemble, this.f30331a), composer, 54), composer, 384);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15166e0 interfaceC15166e0, Composer composer, Integer num) {
                    a(interfaceC15166e0, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(LocalThemeScope localThemeScope) {
                this.f30330a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-101294530, i10, -1, "com.meijer.mobile.androidacres.showcase.components.SwitchMainView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SwitchShowcase.kt:144)");
                }
                LocalThemeScope localThemeScope = this.f30330a;
                Ki.Q.e(localThemeScope, s1.i.f142482a, ComposableLambdaKt.c(-305378069, true, new C0625a(localThemeScope), composer, 54), composer, 432);
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

        c(LocalThemeScope localThemeScope) {
            this.f30329a = localThemeScope;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(561424235, i10, -1, "com.meijer.mobile.androidacres.showcase.components.SwitchMainView.<anonymous>.<anonymous>.<anonymous> (SwitchShowcase.kt:140)");
            }
            LocalThemeScope localThemeScope = this.f30329a;
            Si.b.b(localThemeScope, null, "Switch with description", "1.0", null, ComposableLambdaKt.c(-101294530, true, new a(localThemeScope), composer, 54), composer, 200064, 9);
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
                objB = new Function1() { // from class: Qi.db
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4886jb.d(localThemeScope, (l0.w) obj);
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
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.eb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4886jb.e(localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
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
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }
}
