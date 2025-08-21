package Qi;

import Ki.LocalThemeScope;
import Oi.l;
import Qi.W1;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import j0.C14889J;
import j0.C14890K;
import j0.InterfaceC14902f;
import ki.InterfaceC15148Q;
import ki.q1;
import ki.s1;
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
import pi.C16453n;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0086D¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000f8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012¨\u0006\"²\u0006\u000e\u0010\u001a\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001b\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u001f\u001a\u00020\u00198\nX\u008a\u0084\u0002²\u0006\u000e\u0010 \u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u001f\u001a\u00020\u00198\nX\u008a\u0084\u0002²\u0006\u000e\u0010 \u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\f\u0010!\u001a\u00020\u00198\nX\u008a\u0084\u0002"}, d2 = {"LQi/W1;", "LOi/c;", "LOi/l$f;", "state", "<init>", "(LOi/l$f;)V", "LKi/M;", "", "f", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "b", "a", "LOi/l$f;", "o", "()LOi/l$f;", "", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "multiLineString", "c", "n", "singleLineString", "getName", "name", "", "firstExampleChecked", "thirdExampleChecked", "firstExample", "thirdExample", "fourthExampleState", "fourthExampleEnabled", "thirdExampleState", "thirdExampleEnabled", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class W1 implements Oi.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.f state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String multiLineString;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String singleLineString;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC15433c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29764a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ W1 f29765b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qi.W1$a$a, reason: collision with other inner class name */
        static final class C0577a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29766a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Qi.W1$a$a$a, reason: collision with other inner class name */
            static final class C0578a implements Function3<InterfaceC15148Q, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f29767a;

                C0578a(LocalThemeScope localThemeScope) {
                    this.f29767a = localThemeScope;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit k(boolean z10) {
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit p(boolean z10) {
                    return Unit.f143329a;
                }

                public final void e(InterfaceC15148Q Assemble, Composer composer, int i10) {
                    int i11;
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if ((i10 & 6) == 0) {
                        i11 = i10 | ((i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(448372418, i11, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckboxShowcase.kt:52)");
                    }
                    Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), this.f29767a.getAdsSpacing().getThree().getDp());
                    C5800d.f fVarE = C5800d.f48779a.e();
                    LocalThemeScope localThemeScope = this.f29767a;
                    MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarE, P0.e.INSTANCE.l(), composer, 6);
                    int iA = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
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
                    Composer composerA = androidx.compose.runtime.D1.a(composer);
                    androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                    androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
                    if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                    C14889J c14889j = C14889J.f139620a;
                    composer.startReplaceGroup(1849434622);
                    Object objB = composer.B();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objB == companion2.a()) {
                        objB = androidx.compose.runtime.t1.e(Boolean.TRUE, null, 2, null);
                        composer.t(objB);
                    }
                    final InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
                    composer.P();
                    q1.s.Checkbox defaultToggleButton = Assemble.getToggleButtons().getDefaultToggleButton();
                    boolean zF = f(interfaceC5872l0);
                    composer.startReplaceGroup(5004770);
                    Object objB2 = composer.B();
                    if (objB2 == companion2.a()) {
                        objB2 = new Function1() { // from class: Qi.S1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return W1.a.C0577a.C0578a.o(interfaceC5872l0, ((Boolean) obj).booleanValue());
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    wi.s.b(localThemeScope, defaultToggleButton, zF, true, false, (Function1) objB2, composer, 199680, 8);
                    q1.s.Checkbox defaultToggleButton2 = Assemble.getToggleButtons().getDefaultToggleButton();
                    composer.startReplaceGroup(1849434622);
                    Object objB3 = composer.B();
                    if (objB3 == companion2.a()) {
                        objB3 = new Function1() { // from class: Qi.T1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return W1.a.C0577a.C0578a.p(((Boolean) obj).booleanValue());
                            }
                        };
                        composer.t(objB3);
                    }
                    composer.P();
                    wi.s.b(localThemeScope, defaultToggleButton2, true, false, false, (Function1) objB3, composer, 200064, 8);
                    composer.startReplaceGroup(1849434622);
                    Object objB4 = composer.B();
                    if (objB4 == companion2.a()) {
                        objB4 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                        composer.t(objB4);
                    }
                    final InterfaceC5872l0 interfaceC5872l02 = (InterfaceC5872l0) objB4;
                    composer.P();
                    q1.s.Checkbox defaultToggleButton3 = Assemble.getToggleButtons().getDefaultToggleButton();
                    boolean zQ = q(interfaceC5872l02);
                    composer.startReplaceGroup(5004770);
                    Object objB5 = composer.B();
                    if (objB5 == companion2.a()) {
                        objB5 = new Function1() { // from class: Qi.U1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return W1.a.C0577a.C0578a.g(interfaceC5872l02, ((Boolean) obj).booleanValue());
                            }
                        };
                        composer.t(objB5);
                    }
                    composer.P();
                    wi.s.b(localThemeScope, defaultToggleButton3, zQ, true, false, (Function1) objB5, composer, 199680, 8);
                    q1.s.Checkbox defaultToggleButton4 = Assemble.getToggleButtons().getDefaultToggleButton();
                    composer.startReplaceGroup(1849434622);
                    Object objB6 = composer.B();
                    if (objB6 == companion2.a()) {
                        objB6 = new Function1() { // from class: Qi.V1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return W1.a.C0577a.C0578a.k(((Boolean) obj).booleanValue());
                            }
                        };
                        composer.t(objB6);
                    }
                    composer.P();
                    wi.s.b(localThemeScope, defaultToggleButton4, false, false, false, (Function1) objB6, composer, 200064, 8);
                    composer.v();
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15148Q interfaceC15148Q, Composer composer, Integer num) {
                    e(interfaceC15148Q, composer, num.intValue());
                    return Unit.f143329a;
                }

                private static final boolean f(InterfaceC5872l0<Boolean> interfaceC5872l0) {
                    return interfaceC5872l0.getValue().booleanValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit g(InterfaceC5872l0 interfaceC5872l0, boolean z10) {
                    r(interfaceC5872l0, !q(interfaceC5872l0));
                    return Unit.f143329a;
                }

                private static final void l(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
                    interfaceC5872l0.setValue(Boolean.valueOf(z10));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit o(InterfaceC5872l0 interfaceC5872l0, boolean z10) {
                    l(interfaceC5872l0, !f(interfaceC5872l0));
                    return Unit.f143329a;
                }

                private static final boolean q(InterfaceC5872l0<Boolean> interfaceC5872l0) {
                    return interfaceC5872l0.getValue().booleanValue();
                }

                private static final void r(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
                    interfaceC5872l0.setValue(Boolean.valueOf(z10));
                }
            }

            C0577a(LocalThemeScope localThemeScope) {
                this.f29766a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(2010903302, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckboxShowcase.kt:51)");
                }
                LocalThemeScope localThemeScope = this.f29766a;
                Ki.Q.e(localThemeScope, s1.b.f142451a, ComposableLambdaKt.c(448372418, true, new C0578a(localThemeScope), composer, 54), composer, 432);
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

        a(LocalThemeScope localThemeScope, W1 w12) {
            this.f29764a = localThemeScope;
            this.f29765b = w12;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1032208947, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content.<anonymous>.<anonymous>.<anonymous> (CheckboxShowcase.kt:47)");
            }
            Si.b.b(this.f29764a, null, this.f29765b.getName(), "1.0", null, ComposableLambdaKt.c(2010903302, true, new C0577a(this.f29764a), composer, 54), composer, 199680, 9);
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
        final /* synthetic */ LocalThemeScope f29768a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ W1 f29769b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29770a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ W1 f29771b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qi.W1$b$a$a, reason: collision with other inner class name */
            static final class C0579a implements Function3<InterfaceC15148Q, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f29772a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ W1 f29773b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.W1$b$a$a$a, reason: collision with other inner class name */
                static final class C0580a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f29774a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ W1 f29775b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ InterfaceC15148Q f29776c;

                    C0580a(LocalThemeScope localThemeScope, W1 w12, InterfaceC15148Q interfaceC15148Q) {
                        this.f29774a = localThemeScope;
                        this.f29775b = w12;
                        this.f29776c = interfaceC15148Q;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit k(boolean z10) {
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit p(boolean z10) {
                        return Unit.f143329a;
                    }

                    public final void e(InterfaceC14902f AdsColumn, Composer composer, int i10) {
                        Intrinsics.j(AdsColumn, "$this$AdsColumn");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(132607157, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckboxShowcase.kt:96)");
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
                        LocalThemeScope localThemeScope = this.f29774a;
                        String singleLineString = this.f29775b.getSingleLineString();
                        q1.Label itemLabelEnabled = this.f29776c.getLabels().getItemLabelEnabled();
                        q1.s.Checkbox leadingToggleButton = this.f29776c.getToggleButtons().getLeadingToggleButton();
                        q1.Row item = this.f29776c.getContainers().getItem();
                        boolean zF = f(interfaceC5872l0);
                        composer.startReplaceGroup(5004770);
                        Object objB2 = composer.B();
                        if (objB2 == companion.a()) {
                            objB2 = new Function1() { // from class: Qi.X1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return W1.b.a.C0579a.C0580a.o(interfaceC5872l0, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB2);
                        }
                        composer.P();
                        Ti.o.o(localThemeScope, singleLineString, itemLabelEnabled, leadingToggleButton, item, zF, true, null, (Function1) objB2, composer, 102236160, 64);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        C14890K.a(androidx.compose.foundation.layout.J.z(companion2, this.f29774a.getAdsSpacing().getFive().getDp()), composer, 0);
                        LocalThemeScope localThemeScope2 = this.f29774a;
                        String singleLineString2 = this.f29775b.getSingleLineString();
                        q1.Label itemLabelDisabled = this.f29776c.getLabels().getItemLabelDisabled();
                        q1.s.Checkbox leadingToggleButton2 = this.f29776c.getToggleButtons().getLeadingToggleButton();
                        q1.Row item2 = this.f29776c.getContainers().getItem();
                        composer.startReplaceGroup(1849434622);
                        Object objB3 = composer.B();
                        if (objB3 == companion.a()) {
                            objB3 = new Function1() { // from class: Qi.Y1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return W1.b.a.C0579a.C0580a.p(((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB3);
                        }
                        composer.P();
                        Ti.o.o(localThemeScope2, singleLineString2, itemLabelDisabled, leadingToggleButton2, item2, true, false, null, (Function1) objB3, composer, 102432768, 64);
                        C14890K.a(androidx.compose.foundation.layout.J.z(companion2, this.f29774a.getAdsSpacing().getFive().getDp()), composer, 0);
                        composer.startReplaceGroup(1849434622);
                        Object objB4 = composer.B();
                        if (objB4 == companion.a()) {
                            objB4 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                            composer.t(objB4);
                        }
                        final InterfaceC5872l0 interfaceC5872l02 = (InterfaceC5872l0) objB4;
                        composer.P();
                        LocalThemeScope localThemeScope3 = this.f29774a;
                        String singleLineString3 = this.f29775b.getSingleLineString();
                        q1.Label itemLabelEnabled2 = this.f29776c.getLabels().getItemLabelEnabled();
                        q1.s.Checkbox leadingToggleButton3 = this.f29776c.getToggleButtons().getLeadingToggleButton();
                        q1.Row item3 = this.f29776c.getContainers().getItem();
                        boolean zQ = q(interfaceC5872l02);
                        composer.startReplaceGroup(5004770);
                        Object objB5 = composer.B();
                        if (objB5 == companion.a()) {
                            objB5 = new Function1() { // from class: Qi.Z1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return W1.b.a.C0579a.C0580a.g(interfaceC5872l02, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB5);
                        }
                        composer.P();
                        Ti.o.o(localThemeScope3, singleLineString3, itemLabelEnabled2, leadingToggleButton3, item3, zQ, true, null, (Function1) objB5, composer, 102236160, 64);
                        C14890K.a(androidx.compose.foundation.layout.J.z(companion2, this.f29774a.getAdsSpacing().getFive().getDp()), composer, 0);
                        LocalThemeScope localThemeScope4 = this.f29774a;
                        String singleLineString4 = this.f29775b.getSingleLineString();
                        q1.Label itemLabelDisabled2 = this.f29776c.getLabels().getItemLabelDisabled();
                        q1.s.Checkbox leadingToggleButton4 = this.f29776c.getToggleButtons().getLeadingToggleButton();
                        q1.Row item4 = this.f29776c.getContainers().getItem();
                        composer.startReplaceGroup(1849434622);
                        Object objB6 = composer.B();
                        if (objB6 == companion.a()) {
                            objB6 = new Function1() { // from class: Qi.a2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return W1.b.a.C0579a.C0580a.k(((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB6);
                        }
                        composer.P();
                        Ti.o.o(localThemeScope4, singleLineString4, itemLabelDisabled2, leadingToggleButton4, item4, false, false, null, (Function1) objB6, composer, 102432768, 64);
                        C14890K.a(androidx.compose.foundation.layout.J.z(companion2, this.f29774a.getAdsSpacing().getFive().getDp()), composer, 0);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                        e(interfaceC14902f, composer, num.intValue());
                        return Unit.f143329a;
                    }

                    private static final boolean f(InterfaceC5872l0<Boolean> interfaceC5872l0) {
                        return interfaceC5872l0.getValue().booleanValue();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit g(InterfaceC5872l0 interfaceC5872l0, boolean z10) {
                        r(interfaceC5872l0, !q(interfaceC5872l0));
                        return Unit.f143329a;
                    }

                    private static final void l(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
                        interfaceC5872l0.setValue(Boolean.valueOf(z10));
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit o(InterfaceC5872l0 interfaceC5872l0, boolean z10) {
                        l(interfaceC5872l0, !f(interfaceC5872l0));
                        return Unit.f143329a;
                    }

                    private static final boolean q(InterfaceC5872l0<Boolean> interfaceC5872l0) {
                        return interfaceC5872l0.getValue().booleanValue();
                    }

                    private static final void r(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
                        interfaceC5872l0.setValue(Boolean.valueOf(z10));
                    }
                }

                C0579a(LocalThemeScope localThemeScope, W1 w12) {
                    this.f29772a = localThemeScope;
                    this.f29773b = w12;
                }

                public final void a(InterfaceC15148Q Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if ((i10 & 6) == 0) {
                        i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1319363691, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckboxShowcase.kt:94)");
                    }
                    C16453n.e(this.f29772a, Assemble.getContainers().getList(), ComposableLambdaKt.c(132607157, true, new C0580a(this.f29772a, this.f29773b, Assemble), composer, 54), composer, 384);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15148Q interfaceC15148Q, Composer composer, Integer num) {
                    a(interfaceC15148Q, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(LocalThemeScope localThemeScope, W1 w12) {
                this.f29770a = localThemeScope;
                this.f29771b = w12;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-327010385, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckboxShowcase.kt:93)");
                }
                LocalThemeScope localThemeScope = this.f29770a;
                Ki.Q.e(localThemeScope, s1.b.f142451a, ComposableLambdaKt.c(1319363691, true, new C0579a(localThemeScope, this.f29771b), composer, 54), composer, 432);
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

        b(LocalThemeScope localThemeScope, W1 w12) {
            this.f29768a = localThemeScope;
            this.f29769b = w12;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-254447716, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content.<anonymous>.<anonymous>.<anonymous> (CheckboxShowcase.kt:89)");
            }
            Si.b.b(this.f29768a, null, this.f29769b.c("Group (\"CheckBoxGroupItem\")"), "1.0", null, ComposableLambdaKt.c(-327010385, true, new a(this.f29768a, this.f29769b), composer, 54), composer, 199680, 9);
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
        final /* synthetic */ LocalThemeScope f29777a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ W1 f29778b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29779a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ W1 f29780b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qi.W1$c$a$a, reason: collision with other inner class name */
            static final class C0581a implements Function3<InterfaceC15148Q, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f29781a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ W1 f29782b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.W1$c$a$a$a, reason: collision with other inner class name */
                static final class C0582a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f29783a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ W1 f29784b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ InterfaceC15148Q f29785c;

                    C0582a(LocalThemeScope localThemeScope, W1 w12, InterfaceC15148Q interfaceC15148Q) {
                        this.f29783a = localThemeScope;
                        this.f29784b = w12;
                        this.f29785c = interfaceC15148Q;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit k(boolean z10) {
                        return Unit.f143329a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit p(boolean z10) {
                        return Unit.f143329a;
                    }

                    public final void e(InterfaceC14902f AdsColumn, Composer composer, int i10) {
                        Intrinsics.j(AdsColumn, "$this$AdsColumn");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1282439444, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckboxShowcase.kt:158)");
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
                        LocalThemeScope localThemeScope = this.f29783a;
                        String multiLineString = this.f29784b.getMultiLineString();
                        q1.Label itemLabelEnabled = this.f29785c.getLabels().getItemLabelEnabled();
                        q1.s.Checkbox leadingToggleButton = this.f29785c.getToggleButtons().getLeadingToggleButton();
                        q1.Row item = this.f29785c.getContainers().getItem();
                        boolean zF = f(interfaceC5872l0);
                        composer.startReplaceGroup(5004770);
                        Object objB2 = composer.B();
                        if (objB2 == companion.a()) {
                            objB2 = new Function1() { // from class: Qi.b2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return W1.c.a.C0581a.C0582a.o(interfaceC5872l0, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB2);
                        }
                        composer.P();
                        Ti.o.o(localThemeScope, multiLineString, itemLabelEnabled, leadingToggleButton, item, zF, true, null, (Function1) objB2, composer, 102236160, 64);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        C14890K.a(androidx.compose.foundation.layout.J.z(companion2, this.f29783a.getAdsSpacing().getFive().getDp()), composer, 0);
                        LocalThemeScope localThemeScope2 = this.f29783a;
                        String multiLineString2 = this.f29784b.getMultiLineString();
                        q1.Label itemLabelDisabled = this.f29785c.getLabels().getItemLabelDisabled();
                        q1.s.Checkbox leadingToggleButton2 = this.f29785c.getToggleButtons().getLeadingToggleButton();
                        q1.Row item2 = this.f29785c.getContainers().getItem();
                        composer.startReplaceGroup(1849434622);
                        Object objB3 = composer.B();
                        if (objB3 == companion.a()) {
                            objB3 = new Function1() { // from class: Qi.c2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return W1.c.a.C0581a.C0582a.p(((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB3);
                        }
                        composer.P();
                        Ti.o.o(localThemeScope2, multiLineString2, itemLabelDisabled, leadingToggleButton2, item2, true, false, null, (Function1) objB3, composer, 102432768, 64);
                        C14890K.a(androidx.compose.foundation.layout.J.z(companion2, this.f29783a.getAdsSpacing().getFive().getDp()), composer, 0);
                        composer.startReplaceGroup(1849434622);
                        Object objB4 = composer.B();
                        if (objB4 == companion.a()) {
                            objB4 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                            composer.t(objB4);
                        }
                        final InterfaceC5872l0 interfaceC5872l02 = (InterfaceC5872l0) objB4;
                        composer.P();
                        LocalThemeScope localThemeScope3 = this.f29783a;
                        String multiLineString3 = this.f29784b.getMultiLineString();
                        q1.Label itemLabelEnabled2 = this.f29785c.getLabels().getItemLabelEnabled();
                        q1.s.Checkbox leadingToggleButton3 = this.f29785c.getToggleButtons().getLeadingToggleButton();
                        q1.Row item3 = this.f29785c.getContainers().getItem();
                        boolean zQ = q(interfaceC5872l02);
                        composer.startReplaceGroup(5004770);
                        Object objB5 = composer.B();
                        if (objB5 == companion.a()) {
                            objB5 = new Function1() { // from class: Qi.d2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return W1.c.a.C0581a.C0582a.g(interfaceC5872l02, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB5);
                        }
                        composer.P();
                        Ti.o.o(localThemeScope3, multiLineString3, itemLabelEnabled2, leadingToggleButton3, item3, zQ, true, null, (Function1) objB5, composer, 102236160, 64);
                        C14890K.a(androidx.compose.foundation.layout.J.z(companion2, this.f29783a.getAdsSpacing().getFive().getDp()), composer, 0);
                        LocalThemeScope localThemeScope4 = this.f29783a;
                        String multiLineString4 = this.f29784b.getMultiLineString();
                        q1.Label itemLabelDisabled2 = this.f29785c.getLabels().getItemLabelDisabled();
                        q1.s.Checkbox leadingToggleButton4 = this.f29785c.getToggleButtons().getLeadingToggleButton();
                        q1.Row item4 = this.f29785c.getContainers().getItem();
                        composer.startReplaceGroup(1849434622);
                        Object objB6 = composer.B();
                        if (objB6 == companion.a()) {
                            objB6 = new Function1() { // from class: Qi.e2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return W1.c.a.C0581a.C0582a.k(((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB6);
                        }
                        composer.P();
                        Ti.o.o(localThemeScope4, multiLineString4, itemLabelDisabled2, leadingToggleButton4, item4, false, false, null, (Function1) objB6, composer, 102432768, 64);
                        C14890K.a(androidx.compose.foundation.layout.J.z(companion2, this.f29783a.getAdsSpacing().getFive().getDp()), composer, 0);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                        e(interfaceC14902f, composer, num.intValue());
                        return Unit.f143329a;
                    }

                    private static final boolean f(InterfaceC5872l0<Boolean> interfaceC5872l0) {
                        return interfaceC5872l0.getValue().booleanValue();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit g(InterfaceC5872l0 interfaceC5872l0, boolean z10) {
                        r(interfaceC5872l0, !q(interfaceC5872l0));
                        return Unit.f143329a;
                    }

                    private static final void l(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
                        interfaceC5872l0.setValue(Boolean.valueOf(z10));
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit o(InterfaceC5872l0 interfaceC5872l0, boolean z10) {
                        l(interfaceC5872l0, !f(interfaceC5872l0));
                        return Unit.f143329a;
                    }

                    private static final boolean q(InterfaceC5872l0<Boolean> interfaceC5872l0) {
                        return interfaceC5872l0.getValue().booleanValue();
                    }

                    private static final void r(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
                        interfaceC5872l0.setValue(Boolean.valueOf(z10));
                    }
                }

                C0581a(LocalThemeScope localThemeScope, W1 w12) {
                    this.f29781a = localThemeScope;
                    this.f29782b = w12;
                }

                public final void a(InterfaceC15148Q Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if ((i10 & 6) == 0) {
                        i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1825771318, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckboxShowcase.kt:152)");
                    }
                    C16453n.e(this.f29781a, q1.Column.y(Assemble.getContainers().getList(), androidx.compose.foundation.layout.J.h(Assemble.getContainers().getList().getModifier(), 0.0f, 1, null), null, null, 6, null), ComposableLambdaKt.c(1282439444, true, new C0582a(this.f29781a, this.f29782b, Assemble), composer, 54), composer, 384);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15148Q interfaceC15148Q, Composer composer, Integer num) {
                    a(interfaceC15148Q, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(LocalThemeScope localThemeScope, W1 w12) {
                this.f29779a = localThemeScope;
                this.f29780b = w12;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(822821902, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckboxShowcase.kt:151)");
                }
                LocalThemeScope localThemeScope = this.f29779a;
                Ki.Q.e(localThemeScope, s1.b.f142451a, ComposableLambdaKt.c(-1825771318, true, new C0581a(localThemeScope, this.f29780b), composer, 54), composer, 432);
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

        c(LocalThemeScope localThemeScope, W1 w12) {
            this.f29777a = localThemeScope;
            this.f29778b = w12;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(895384571, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content.<anonymous>.<anonymous>.<anonymous> (CheckboxShowcase.kt:147)");
            }
            Si.b.b(this.f29777a, null, this.f29778b.c("Group, Multi-Line (\"CheckBoxGroupItem\")"), "1.0", null, ComposableLambdaKt.c(822821902, true, new a(this.f29777a, this.f29778b), composer, 54), composer, 199680, 9);
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
        final /* synthetic */ LocalThemeScope f29786a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ W1 f29787b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29788a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ W1 f29789b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qi.W1$d$a$a, reason: collision with other inner class name */
            static final class C0583a implements Function3<InterfaceC15148Q, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f29790a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ W1 f29791b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.W1$d$a$a$a, reason: collision with other inner class name */
                static final class C0584a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ W1 f29792a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ InterfaceC15148Q f29793b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f29794c;

                    C0584a(W1 w12, InterfaceC15148Q interfaceC15148Q, LocalThemeScope localThemeScope) {
                        this.f29792a = w12;
                        this.f29793b = interfaceC15148Q;
                        this.f29794c = localThemeScope;
                    }

                    public final void c(InterfaceC14902f AdsColumn, Composer composer, int i10) {
                        Intrinsics.j(AdsColumn, "$this$AdsColumn");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1862695565, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckboxShowcase.kt:215)");
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
                        String singleLineString = this.f29792a.getSingleLineString();
                        q1.Label itemLabelEnabled = this.f29793b.getLabels().getItemLabelEnabled();
                        boolean zD = d(interfaceC5872l0);
                        boolean zG = g((InterfaceC5872l0) objB2);
                        q1.s.Checkbox trailingToggleButton = this.f29793b.getToggleButtons().getTrailingToggleButton();
                        LocalThemeScope localThemeScope = this.f29794c;
                        composer.startReplaceGroup(5004770);
                        Object objB3 = composer.B();
                        if (objB3 == companion.a()) {
                            objB3 = new Function1() { // from class: Qi.f2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return W1.d.a.C0583a.C0584a.k(interfaceC5872l0, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB3);
                        }
                        composer.P();
                        Ti.o.s(localThemeScope, null, singleLineString, itemLabelEnabled, null, null, trailingToggleButton, zD, zG, (Function1) objB3, composer, 805306368, 25);
                        Ti.o.s(this.f29794c, null, this.f29792a.getSingleLineString(), this.f29793b.getLabels().getItemLabelDisabled(), null, null, this.f29793b.getToggleButtons().getTrailingToggleButton(), true, false, null, composer, 113246208, 281);
                        composer.startReplaceGroup(1849434622);
                        Object objB4 = composer.B();
                        if (objB4 == companion.a()) {
                            objB4 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                            composer.t(objB4);
                        }
                        final InterfaceC5872l0 interfaceC5872l02 = (InterfaceC5872l0) objB4;
                        composer.P();
                        String singleLineString2 = this.f29792a.getSingleLineString();
                        q1.Label itemLabelEnabled2 = this.f29793b.getLabels().getItemLabelEnabled();
                        boolean zL = l(interfaceC5872l02);
                        q1.s.Checkbox trailingToggleButton2 = this.f29793b.getToggleButtons().getTrailingToggleButton();
                        LocalThemeScope localThemeScope2 = this.f29794c;
                        composer.startReplaceGroup(5004770);
                        Object objB5 = composer.B();
                        if (objB5 == companion.a()) {
                            objB5 = new Function1() { // from class: Qi.g2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return W1.d.a.C0583a.C0584a.e(interfaceC5872l02, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB5);
                        }
                        composer.P();
                        Ti.o.s(localThemeScope2, null, singleLineString2, itemLabelEnabled2, null, null, trailingToggleButton2, zL, true, (Function1) objB5, composer, 905969664, 25);
                        Ti.o.s(this.f29794c, null, this.f29792a.getSingleLineString(), this.f29793b.getLabels().getItemLabelDisabled(), null, null, this.f29793b.getToggleButtons().getTrailingToggleButton(), false, false, null, composer, 113246208, 281);
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

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit e(InterfaceC5872l0 interfaceC5872l0, boolean z10) {
                        o(interfaceC5872l0, !l(interfaceC5872l0));
                        return Unit.f143329a;
                    }

                    private static final void f(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
                        interfaceC5872l0.setValue(Boolean.valueOf(z10));
                    }

                    private static final boolean g(InterfaceC5872l0<Boolean> interfaceC5872l0) {
                        return interfaceC5872l0.getValue().booleanValue();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit k(InterfaceC5872l0 interfaceC5872l0, boolean z10) {
                        f(interfaceC5872l0, !d(interfaceC5872l0));
                        return Unit.f143329a;
                    }

                    private static final boolean l(InterfaceC5872l0<Boolean> interfaceC5872l0) {
                        return interfaceC5872l0.getValue().booleanValue();
                    }

                    private static final void o(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
                        interfaceC5872l0.setValue(Boolean.valueOf(z10));
                    }
                }

                C0583a(LocalThemeScope localThemeScope, W1 w12) {
                    this.f29790a = localThemeScope;
                    this.f29791b = w12;
                }

                public final void a(InterfaceC15148Q Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if ((i10 & 6) == 0) {
                        i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-675939031, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckboxShowcase.kt:214)");
                    }
                    C16453n.e(this.f29790a, Assemble.getContainers().getList(), ComposableLambdaKt.c(-1862695565, true, new C0584a(this.f29791b, Assemble, this.f29790a), composer, 54), composer, 384);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15148Q interfaceC15148Q, Composer composer, Integer num) {
                    a(interfaceC15148Q, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(LocalThemeScope localThemeScope, W1 w12) {
                this.f29788a = localThemeScope;
                this.f29789b = w12;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1972654189, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckboxShowcase.kt:213)");
                }
                LocalThemeScope localThemeScope = this.f29788a;
                Ki.Q.e(localThemeScope, s1.b.f142451a, ComposableLambdaKt.c(-675939031, true, new C0583a(localThemeScope, this.f29789b), composer, 54), composer, 432);
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

        d(LocalThemeScope localThemeScope, W1 w12) {
            this.f29786a = localThemeScope;
            this.f29787b = w12;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2045216858, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content.<anonymous>.<anonymous>.<anonymous> (CheckboxShowcase.kt:209)");
            }
            Si.b.b(this.f29786a, null, this.f29787b.c("Menu Item (\"CheckBoxMenuItem\")"), "1.0", null, ComposableLambdaKt.c(1972654189, true, new a(this.f29786a, this.f29787b), composer, 54), composer, 199680, 9);
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
        final /* synthetic */ LocalThemeScope f29795a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ W1 f29796b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29797a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ W1 f29798b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qi.W1$e$a$a, reason: collision with other inner class name */
            static final class C0585a implements Function3<InterfaceC15148Q, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f29799a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ W1 f29800b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Qi.W1$e$a$a$a, reason: collision with other inner class name */
                static final class C0586a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ W1 f29801a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ InterfaceC15148Q f29802b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f29803c;

                    C0586a(W1 w12, InterfaceC15148Q interfaceC15148Q, LocalThemeScope localThemeScope) {
                        this.f29801a = w12;
                        this.f29802b = interfaceC15148Q;
                        this.f29803c = localThemeScope;
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
                            ComposerKt.U(-712863278, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckboxShowcase.kt:263)");
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
                        String multiLineString = this.f29801a.getMultiLineString();
                        q1.Label itemLabelEnabled = this.f29802b.getLabels().getItemLabelEnabled();
                        boolean zD = d(interfaceC5872l0);
                        boolean zK = k((InterfaceC5872l0) objB2);
                        q1.s.Checkbox trailingToggleButton = this.f29802b.getToggleButtons().getTrailingToggleButton();
                        LocalThemeScope localThemeScope = this.f29803c;
                        composer.startReplaceGroup(5004770);
                        Object objB3 = composer.B();
                        if (objB3 == companion.a()) {
                            objB3 = new Function1() { // from class: Qi.h2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return W1.e.a.C0585a.C0586a.l(interfaceC5872l0, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB3);
                        }
                        composer.P();
                        Ti.o.s(localThemeScope, null, multiLineString, itemLabelEnabled, null, null, trailingToggleButton, zD, zK, (Function1) objB3, composer, 805306368, 25);
                        Ti.o.s(this.f29803c, null, this.f29801a.getMultiLineString(), this.f29802b.getLabels().getItemLabelDisabled(), null, null, this.f29802b.getToggleButtons().getTrailingToggleButton(), true, false, null, composer, 113246208, 281);
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
                        String multiLineString2 = this.f29801a.getMultiLineString();
                        q1.Label itemLabelEnabled2 = this.f29802b.getLabels().getItemLabelEnabled();
                        boolean zO = o(interfaceC5872l02);
                        boolean zE = e((InterfaceC5872l0) objB5);
                        q1.s.Checkbox trailingToggleButton2 = this.f29802b.getToggleButtons().getTrailingToggleButton();
                        LocalThemeScope localThemeScope2 = this.f29803c;
                        composer.startReplaceGroup(5004770);
                        Object objB6 = composer.B();
                        if (objB6 == companion.a()) {
                            objB6 = new Function1() { // from class: Qi.i2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return W1.e.a.C0585a.C0586a.f(interfaceC5872l02, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB6);
                        }
                        composer.P();
                        Ti.o.s(localThemeScope2, null, multiLineString2, itemLabelEnabled2, null, null, trailingToggleButton2, zO, zE, (Function1) objB6, composer, 805306368, 25);
                        Ti.o.s(this.f29803c, null, this.f29801a.getMultiLineString(), this.f29802b.getLabels().getItemLabelDisabled(), null, null, this.f29802b.getToggleButtons().getTrailingToggleButton(), false, false, null, composer, 113246208, 281);
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

                C0585a(LocalThemeScope localThemeScope, W1 w12) {
                    this.f29799a = localThemeScope;
                    this.f29800b = w12;
                }

                public final void a(InterfaceC15148Q Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if ((i10 & 6) == 0) {
                        i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(473893256, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckboxShowcase.kt:262)");
                    }
                    C16453n.e(this.f29799a, Assemble.getContainers().getList(), ComposableLambdaKt.c(-712863278, true, new C0586a(this.f29800b, Assemble, this.f29799a), composer, 54), composer, 384);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15148Q interfaceC15148Q, Composer composer, Integer num) {
                    a(interfaceC15148Q, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            a(LocalThemeScope localThemeScope, W1 w12) {
                this.f29797a = localThemeScope;
                this.f29798b = w12;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1172480820, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckboxShowcase.kt:261)");
                }
                LocalThemeScope localThemeScope = this.f29797a;
                Ki.Q.e(localThemeScope, s1.b.f142451a, ComposableLambdaKt.c(473893256, true, new C0585a(localThemeScope, this.f29798b), composer, 54), composer, 432);
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

        e(LocalThemeScope localThemeScope, W1 w12) {
            this.f29795a = localThemeScope;
            this.f29796b = w12;
        }

        public final void a(InterfaceC15433c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1099918151, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content.<anonymous>.<anonymous>.<anonymous> (CheckboxShowcase.kt:257)");
            }
            Si.b.b(this.f29795a, null, this.f29796b.c("Menu Item, Multi-Line (\"CheckBoxMenuItem\")"), "1.0", null, ComposableLambdaKt.c(-1172480820, true, new a(this.f29795a, this.f29796b), composer, 54), composer, 199680, 9);
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

    public W1(l.f state) {
        Intrinsics.j(state, "state");
        this.state = state;
        this.multiLineString = "Singular checkbox component multiple lines checkbox label display on three lines";
        this.singleLineString = "Checkbox item";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, W1 w12, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1032208947, true, new a(localThemeScope, w12)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-254447716, true, new b(localThemeScope, w12)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(895384571, true, new c(localThemeScope, w12)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(2045216858, true, new d(localThemeScope, w12)), 3, null);
        l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1099918151, true, new e(localThemeScope, w12)), 3, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(W1 w12, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        w12.f(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(W1 w12, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        w12.b(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    @Override // Oi.c
    public void b(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-587833857);
        if ((i10 & 1) == 0 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-587833857, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Controls (CheckboxShowcase.kt:308)");
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.R1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return W1.l(this.f29672a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Oi.c
    public void f(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1332030936);
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
                ComposerKt.U(-1332030936, i11, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content (CheckboxShowcase.kt:42)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z10 = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composerStartRestartGroup.D(localThemeScope))) | ((i11 & 112) == 32);
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Qi.P1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return W1.j(localThemeScope, this, (l0.w) obj);
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
            t0L.a(new Function2() { // from class: Qi.Q1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return W1.k(this.f29654a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Oi.c
    public String getName() {
        return "Checkbox";
    }

    /* renamed from: m, reason: from getter */
    public final String getMultiLineString() {
        return this.multiLineString;
    }

    /* renamed from: n, reason: from getter */
    public final String getSingleLineString() {
        return this.singleLineString;
    }

    @Override // Oi.c
    /* renamed from: o, reason: from getter */
    public l.f getState() {
        return this.state;
    }
}
