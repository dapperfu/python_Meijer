package Pi;

import Ji.LocalThemeScope;
import Ni.l;
import Pi.W1;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import j0.C14801J;
import j0.C14802K;
import j0.InterfaceC14814f;
import ji.InterfaceC14914Q;
import ji.q1;
import ji.s1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15342b;
import l0.InterfaceC15343c;
import oi.C16088n;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0086D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000e8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012¨\u0006\"²\u0006\u000e\u0010\u001a\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001b\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u001f\u001a\u00020\u00198\nX\u008a\u0084\u0002²\u0006\u000e\u0010 \u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u001f\u001a\u00020\u00198\nX\u008a\u0084\u0002²\u0006\u000e\u0010 \u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\f\u0010!\u001a\u00020\u00198\nX\u008a\u0084\u0002"}, d2 = {"LPi/W1;", "LNi/c;", "LNi/l$f;", "state", "<init>", "(LNi/l$f;)V", "LJi/M;", "", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)V", "f", "LNi/l$f;", "o", "()LNi/l$f;", "", "b", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "multiLineString", "c", "n", "singleLineString", "getName", "name", "", "firstExampleChecked", "thirdExampleChecked", "firstExample", "thirdExample", "fourthExampleState", "fourthExampleEnabled", "thirdExampleState", "thirdExampleEnabled", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class W1 implements Ni.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.f state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String multiLineString;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String singleLineString;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27052a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ W1 f27053b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pi.W1$a$a, reason: collision with other inner class name */
        static final class C0513a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27054a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Pi.W1$a$a$a, reason: collision with other inner class name */
            static final class C0514a implements Function3<InterfaceC14914Q, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27055a;

                C0514a(LocalThemeScope localThemeScope) {
                    this.f27055a = localThemeScope;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit k(boolean z10) {
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit p(boolean z10) {
                    return Unit.f142422a;
                }

                public final void e(InterfaceC14914Q Assemble, Composer composer, int i10) {
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
                    Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), this.f27055a.getAdsSpacing().getThree().getDp());
                    C5658d.f fVarE = C5658d.f48555a.e();
                    LocalThemeScope localThemeScope = this.f27055a;
                    MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarE, P0.e.INSTANCE.l(), composer, 6);
                    int iA = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
                    InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
                    Function0<InterfaceC5811g> function0A = companion.a();
                    if (composer.k() == null) {
                        C5717f.c();
                    }
                    composer.F();
                    if (composer.getInserting()) {
                        composer.I(function0A);
                    } else {
                        composer.s();
                    }
                    Composer composerA = androidx.compose.runtime.D1.a(composer);
                    androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
                    androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
                    if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
                    C14801J c14801j = C14801J.f139030a;
                    composer.startReplaceGroup(1849434622);
                    Object objB = composer.B();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objB == companion2.a()) {
                        objB = androidx.compose.runtime.t1.e(Boolean.TRUE, null, 2, null);
                        composer.t(objB);
                    }
                    final InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
                    composer.P();
                    q1.s.Checkbox defaultToggleButton = Assemble.getToggleButtons().getDefaultToggleButton();
                    boolean zF = f(interfaceC5730l0);
                    composer.startReplaceGroup(5004770);
                    Object objB2 = composer.B();
                    if (objB2 == companion2.a()) {
                        objB2 = new Function1() { // from class: Pi.S1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return W1.a.C0513a.C0514a.o(interfaceC5730l0, ((Boolean) obj).booleanValue());
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    vi.s.b(localThemeScope, defaultToggleButton, zF, true, false, (Function1) objB2, composer, 199680, 8);
                    q1.s.Checkbox defaultToggleButton2 = Assemble.getToggleButtons().getDefaultToggleButton();
                    composer.startReplaceGroup(1849434622);
                    Object objB3 = composer.B();
                    if (objB3 == companion2.a()) {
                        objB3 = new Function1() { // from class: Pi.T1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return W1.a.C0513a.C0514a.p(((Boolean) obj).booleanValue());
                            }
                        };
                        composer.t(objB3);
                    }
                    composer.P();
                    vi.s.b(localThemeScope, defaultToggleButton2, true, false, false, (Function1) objB3, composer, 200064, 8);
                    composer.startReplaceGroup(1849434622);
                    Object objB4 = composer.B();
                    if (objB4 == companion2.a()) {
                        objB4 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                        composer.t(objB4);
                    }
                    final InterfaceC5730l0 interfaceC5730l02 = (InterfaceC5730l0) objB4;
                    composer.P();
                    q1.s.Checkbox defaultToggleButton3 = Assemble.getToggleButtons().getDefaultToggleButton();
                    boolean zQ = q(interfaceC5730l02);
                    composer.startReplaceGroup(5004770);
                    Object objB5 = composer.B();
                    if (objB5 == companion2.a()) {
                        objB5 = new Function1() { // from class: Pi.U1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return W1.a.C0513a.C0514a.g(interfaceC5730l02, ((Boolean) obj).booleanValue());
                            }
                        };
                        composer.t(objB5);
                    }
                    composer.P();
                    vi.s.b(localThemeScope, defaultToggleButton3, zQ, true, false, (Function1) objB5, composer, 199680, 8);
                    q1.s.Checkbox defaultToggleButton4 = Assemble.getToggleButtons().getDefaultToggleButton();
                    composer.startReplaceGroup(1849434622);
                    Object objB6 = composer.B();
                    if (objB6 == companion2.a()) {
                        objB6 = new Function1() { // from class: Pi.V1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return W1.a.C0513a.C0514a.k(((Boolean) obj).booleanValue());
                            }
                        };
                        composer.t(objB6);
                    }
                    composer.P();
                    vi.s.b(localThemeScope, defaultToggleButton4, false, false, false, (Function1) objB6, composer, 200064, 8);
                    composer.v();
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14914Q interfaceC14914Q, Composer composer, Integer num) {
                    e(interfaceC14914Q, composer, num.intValue());
                    return Unit.f142422a;
                }

                private static final boolean f(InterfaceC5730l0<Boolean> interfaceC5730l0) {
                    return interfaceC5730l0.getValue().booleanValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit g(InterfaceC5730l0 interfaceC5730l0, boolean z10) {
                    r(interfaceC5730l0, !q(interfaceC5730l0));
                    return Unit.f142422a;
                }

                private static final void l(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
                    interfaceC5730l0.setValue(Boolean.valueOf(z10));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit o(InterfaceC5730l0 interfaceC5730l0, boolean z10) {
                    l(interfaceC5730l0, !f(interfaceC5730l0));
                    return Unit.f142422a;
                }

                private static final boolean q(InterfaceC5730l0<Boolean> interfaceC5730l0) {
                    return interfaceC5730l0.getValue().booleanValue();
                }

                private static final void r(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
                    interfaceC5730l0.setValue(Boolean.valueOf(z10));
                }
            }

            C0513a(LocalThemeScope localThemeScope) {
                this.f27054a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(2010903302, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckboxShowcase.kt:51)");
                }
                LocalThemeScope localThemeScope = this.f27054a;
                Ji.Q.e(localThemeScope, s1.b.f140196a, ComposableLambdaKt.c(448372418, true, new C0514a(localThemeScope), composer, 54), composer, 432);
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

        a(LocalThemeScope localThemeScope, W1 w12) {
            this.f27052a = localThemeScope;
            this.f27053b = w12;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1032208947, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content.<anonymous>.<anonymous>.<anonymous> (CheckboxShowcase.kt:47)");
            }
            Ri.b.b(this.f27052a, null, this.f27053b.getName(), "1.0", null, ComposableLambdaKt.c(2010903302, true, new C0513a(this.f27052a), composer, 54), composer, 199680, 9);
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
        final /* synthetic */ LocalThemeScope f27056a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ W1 f27057b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27058a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ W1 f27059b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Pi.W1$b$a$a, reason: collision with other inner class name */
            static final class C0515a implements Function3<InterfaceC14914Q, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27060a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ W1 f27061b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Pi.W1$b$a$a$a, reason: collision with other inner class name */
                static final class C0516a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27062a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ W1 f27063b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ InterfaceC14914Q f27064c;

                    C0516a(LocalThemeScope localThemeScope, W1 w12, InterfaceC14914Q interfaceC14914Q) {
                        this.f27062a = localThemeScope;
                        this.f27063b = w12;
                        this.f27064c = interfaceC14914Q;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit k(boolean z10) {
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit p(boolean z10) {
                        return Unit.f142422a;
                    }

                    public final void e(InterfaceC14814f AdsColumn, Composer composer, int i10) {
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
                        final InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
                        composer.P();
                        LocalThemeScope localThemeScope = this.f27062a;
                        String singleLineString = this.f27063b.getSingleLineString();
                        q1.Label itemLabelEnabled = this.f27064c.getLabels().getItemLabelEnabled();
                        q1.s.Checkbox leadingToggleButton = this.f27064c.getToggleButtons().getLeadingToggleButton();
                        q1.Row item = this.f27064c.getContainers().getItem();
                        boolean zF = f(interfaceC5730l0);
                        composer.startReplaceGroup(5004770);
                        Object objB2 = composer.B();
                        if (objB2 == companion.a()) {
                            objB2 = new Function1() { // from class: Pi.X1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return W1.b.a.C0515a.C0516a.o(interfaceC5730l0, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB2);
                        }
                        composer.P();
                        Si.o.o(localThemeScope, singleLineString, itemLabelEnabled, leadingToggleButton, item, zF, true, null, (Function1) objB2, composer, 102236160, 64);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        C14802K.a(androidx.compose.foundation.layout.J.z(companion2, this.f27062a.getAdsSpacing().getFive().getDp()), composer, 0);
                        LocalThemeScope localThemeScope2 = this.f27062a;
                        String singleLineString2 = this.f27063b.getSingleLineString();
                        q1.Label itemLabelDisabled = this.f27064c.getLabels().getItemLabelDisabled();
                        q1.s.Checkbox leadingToggleButton2 = this.f27064c.getToggleButtons().getLeadingToggleButton();
                        q1.Row item2 = this.f27064c.getContainers().getItem();
                        composer.startReplaceGroup(1849434622);
                        Object objB3 = composer.B();
                        if (objB3 == companion.a()) {
                            objB3 = new Function1() { // from class: Pi.Y1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return W1.b.a.C0515a.C0516a.p(((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB3);
                        }
                        composer.P();
                        Si.o.o(localThemeScope2, singleLineString2, itemLabelDisabled, leadingToggleButton2, item2, true, false, null, (Function1) objB3, composer, 102432768, 64);
                        C14802K.a(androidx.compose.foundation.layout.J.z(companion2, this.f27062a.getAdsSpacing().getFive().getDp()), composer, 0);
                        composer.startReplaceGroup(1849434622);
                        Object objB4 = composer.B();
                        if (objB4 == companion.a()) {
                            objB4 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                            composer.t(objB4);
                        }
                        final InterfaceC5730l0 interfaceC5730l02 = (InterfaceC5730l0) objB4;
                        composer.P();
                        LocalThemeScope localThemeScope3 = this.f27062a;
                        String singleLineString3 = this.f27063b.getSingleLineString();
                        q1.Label itemLabelEnabled2 = this.f27064c.getLabels().getItemLabelEnabled();
                        q1.s.Checkbox leadingToggleButton3 = this.f27064c.getToggleButtons().getLeadingToggleButton();
                        q1.Row item3 = this.f27064c.getContainers().getItem();
                        boolean zQ = q(interfaceC5730l02);
                        composer.startReplaceGroup(5004770);
                        Object objB5 = composer.B();
                        if (objB5 == companion.a()) {
                            objB5 = new Function1() { // from class: Pi.Z1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return W1.b.a.C0515a.C0516a.g(interfaceC5730l02, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB5);
                        }
                        composer.P();
                        Si.o.o(localThemeScope3, singleLineString3, itemLabelEnabled2, leadingToggleButton3, item3, zQ, true, null, (Function1) objB5, composer, 102236160, 64);
                        C14802K.a(androidx.compose.foundation.layout.J.z(companion2, this.f27062a.getAdsSpacing().getFive().getDp()), composer, 0);
                        LocalThemeScope localThemeScope4 = this.f27062a;
                        String singleLineString4 = this.f27063b.getSingleLineString();
                        q1.Label itemLabelDisabled2 = this.f27064c.getLabels().getItemLabelDisabled();
                        q1.s.Checkbox leadingToggleButton4 = this.f27064c.getToggleButtons().getLeadingToggleButton();
                        q1.Row item4 = this.f27064c.getContainers().getItem();
                        composer.startReplaceGroup(1849434622);
                        Object objB6 = composer.B();
                        if (objB6 == companion.a()) {
                            objB6 = new Function1() { // from class: Pi.a2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return W1.b.a.C0515a.C0516a.k(((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB6);
                        }
                        composer.P();
                        Si.o.o(localThemeScope4, singleLineString4, itemLabelDisabled2, leadingToggleButton4, item4, false, false, null, (Function1) objB6, composer, 102432768, 64);
                        C14802K.a(androidx.compose.foundation.layout.J.z(companion2, this.f27062a.getAdsSpacing().getFive().getDp()), composer, 0);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                        e(interfaceC14814f, composer, num.intValue());
                        return Unit.f142422a;
                    }

                    private static final boolean f(InterfaceC5730l0<Boolean> interfaceC5730l0) {
                        return interfaceC5730l0.getValue().booleanValue();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit g(InterfaceC5730l0 interfaceC5730l0, boolean z10) {
                        r(interfaceC5730l0, !q(interfaceC5730l0));
                        return Unit.f142422a;
                    }

                    private static final void l(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
                        interfaceC5730l0.setValue(Boolean.valueOf(z10));
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit o(InterfaceC5730l0 interfaceC5730l0, boolean z10) {
                        l(interfaceC5730l0, !f(interfaceC5730l0));
                        return Unit.f142422a;
                    }

                    private static final boolean q(InterfaceC5730l0<Boolean> interfaceC5730l0) {
                        return interfaceC5730l0.getValue().booleanValue();
                    }

                    private static final void r(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
                        interfaceC5730l0.setValue(Boolean.valueOf(z10));
                    }
                }

                C0515a(LocalThemeScope localThemeScope, W1 w12) {
                    this.f27060a = localThemeScope;
                    this.f27061b = w12;
                }

                public final void a(InterfaceC14914Q Assemble, Composer composer, int i10) {
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
                    C16088n.e(this.f27060a, Assemble.getContainers().getList(), ComposableLambdaKt.c(132607157, true, new C0516a(this.f27060a, this.f27061b, Assemble), composer, 54), composer, 384);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14914Q interfaceC14914Q, Composer composer, Integer num) {
                    a(interfaceC14914Q, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(LocalThemeScope localThemeScope, W1 w12) {
                this.f27058a = localThemeScope;
                this.f27059b = w12;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-327010385, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckboxShowcase.kt:93)");
                }
                LocalThemeScope localThemeScope = this.f27058a;
                Ji.Q.e(localThemeScope, s1.b.f140196a, ComposableLambdaKt.c(1319363691, true, new C0515a(localThemeScope, this.f27059b), composer, 54), composer, 432);
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

        b(LocalThemeScope localThemeScope, W1 w12) {
            this.f27056a = localThemeScope;
            this.f27057b = w12;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-254447716, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content.<anonymous>.<anonymous>.<anonymous> (CheckboxShowcase.kt:89)");
            }
            Ri.b.b(this.f27056a, null, this.f27057b.d("Group (\"CheckBoxGroupItem\")"), "1.0", null, ComposableLambdaKt.c(-327010385, true, new a(this.f27056a, this.f27057b), composer, 54), composer, 199680, 9);
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
        final /* synthetic */ LocalThemeScope f27065a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ W1 f27066b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27067a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ W1 f27068b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Pi.W1$c$a$a, reason: collision with other inner class name */
            static final class C0517a implements Function3<InterfaceC14914Q, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27069a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ W1 f27070b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Pi.W1$c$a$a$a, reason: collision with other inner class name */
                static final class C0518a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27071a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ W1 f27072b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ InterfaceC14914Q f27073c;

                    C0518a(LocalThemeScope localThemeScope, W1 w12, InterfaceC14914Q interfaceC14914Q) {
                        this.f27071a = localThemeScope;
                        this.f27072b = w12;
                        this.f27073c = interfaceC14914Q;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit k(boolean z10) {
                        return Unit.f142422a;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit p(boolean z10) {
                        return Unit.f142422a;
                    }

                    public final void e(InterfaceC14814f AdsColumn, Composer composer, int i10) {
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
                        final InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
                        composer.P();
                        LocalThemeScope localThemeScope = this.f27071a;
                        String multiLineString = this.f27072b.getMultiLineString();
                        q1.Label itemLabelEnabled = this.f27073c.getLabels().getItemLabelEnabled();
                        q1.s.Checkbox leadingToggleButton = this.f27073c.getToggleButtons().getLeadingToggleButton();
                        q1.Row item = this.f27073c.getContainers().getItem();
                        boolean zF = f(interfaceC5730l0);
                        composer.startReplaceGroup(5004770);
                        Object objB2 = composer.B();
                        if (objB2 == companion.a()) {
                            objB2 = new Function1() { // from class: Pi.b2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return W1.c.a.C0517a.C0518a.o(interfaceC5730l0, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB2);
                        }
                        composer.P();
                        Si.o.o(localThemeScope, multiLineString, itemLabelEnabled, leadingToggleButton, item, zF, true, null, (Function1) objB2, composer, 102236160, 64);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        C14802K.a(androidx.compose.foundation.layout.J.z(companion2, this.f27071a.getAdsSpacing().getFive().getDp()), composer, 0);
                        LocalThemeScope localThemeScope2 = this.f27071a;
                        String multiLineString2 = this.f27072b.getMultiLineString();
                        q1.Label itemLabelDisabled = this.f27073c.getLabels().getItemLabelDisabled();
                        q1.s.Checkbox leadingToggleButton2 = this.f27073c.getToggleButtons().getLeadingToggleButton();
                        q1.Row item2 = this.f27073c.getContainers().getItem();
                        composer.startReplaceGroup(1849434622);
                        Object objB3 = composer.B();
                        if (objB3 == companion.a()) {
                            objB3 = new Function1() { // from class: Pi.c2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return W1.c.a.C0517a.C0518a.p(((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB3);
                        }
                        composer.P();
                        Si.o.o(localThemeScope2, multiLineString2, itemLabelDisabled, leadingToggleButton2, item2, true, false, null, (Function1) objB3, composer, 102432768, 64);
                        C14802K.a(androidx.compose.foundation.layout.J.z(companion2, this.f27071a.getAdsSpacing().getFive().getDp()), composer, 0);
                        composer.startReplaceGroup(1849434622);
                        Object objB4 = composer.B();
                        if (objB4 == companion.a()) {
                            objB4 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                            composer.t(objB4);
                        }
                        final InterfaceC5730l0 interfaceC5730l02 = (InterfaceC5730l0) objB4;
                        composer.P();
                        LocalThemeScope localThemeScope3 = this.f27071a;
                        String multiLineString3 = this.f27072b.getMultiLineString();
                        q1.Label itemLabelEnabled2 = this.f27073c.getLabels().getItemLabelEnabled();
                        q1.s.Checkbox leadingToggleButton3 = this.f27073c.getToggleButtons().getLeadingToggleButton();
                        q1.Row item3 = this.f27073c.getContainers().getItem();
                        boolean zQ = q(interfaceC5730l02);
                        composer.startReplaceGroup(5004770);
                        Object objB5 = composer.B();
                        if (objB5 == companion.a()) {
                            objB5 = new Function1() { // from class: Pi.d2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return W1.c.a.C0517a.C0518a.g(interfaceC5730l02, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB5);
                        }
                        composer.P();
                        Si.o.o(localThemeScope3, multiLineString3, itemLabelEnabled2, leadingToggleButton3, item3, zQ, true, null, (Function1) objB5, composer, 102236160, 64);
                        C14802K.a(androidx.compose.foundation.layout.J.z(companion2, this.f27071a.getAdsSpacing().getFive().getDp()), composer, 0);
                        LocalThemeScope localThemeScope4 = this.f27071a;
                        String multiLineString4 = this.f27072b.getMultiLineString();
                        q1.Label itemLabelDisabled2 = this.f27073c.getLabels().getItemLabelDisabled();
                        q1.s.Checkbox leadingToggleButton4 = this.f27073c.getToggleButtons().getLeadingToggleButton();
                        q1.Row item4 = this.f27073c.getContainers().getItem();
                        composer.startReplaceGroup(1849434622);
                        Object objB6 = composer.B();
                        if (objB6 == companion.a()) {
                            objB6 = new Function1() { // from class: Pi.e2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return W1.c.a.C0517a.C0518a.k(((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB6);
                        }
                        composer.P();
                        Si.o.o(localThemeScope4, multiLineString4, itemLabelDisabled2, leadingToggleButton4, item4, false, false, null, (Function1) objB6, composer, 102432768, 64);
                        C14802K.a(androidx.compose.foundation.layout.J.z(companion2, this.f27071a.getAdsSpacing().getFive().getDp()), composer, 0);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                        e(interfaceC14814f, composer, num.intValue());
                        return Unit.f142422a;
                    }

                    private static final boolean f(InterfaceC5730l0<Boolean> interfaceC5730l0) {
                        return interfaceC5730l0.getValue().booleanValue();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit g(InterfaceC5730l0 interfaceC5730l0, boolean z10) {
                        r(interfaceC5730l0, !q(interfaceC5730l0));
                        return Unit.f142422a;
                    }

                    private static final void l(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
                        interfaceC5730l0.setValue(Boolean.valueOf(z10));
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit o(InterfaceC5730l0 interfaceC5730l0, boolean z10) {
                        l(interfaceC5730l0, !f(interfaceC5730l0));
                        return Unit.f142422a;
                    }

                    private static final boolean q(InterfaceC5730l0<Boolean> interfaceC5730l0) {
                        return interfaceC5730l0.getValue().booleanValue();
                    }

                    private static final void r(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
                        interfaceC5730l0.setValue(Boolean.valueOf(z10));
                    }
                }

                C0517a(LocalThemeScope localThemeScope, W1 w12) {
                    this.f27069a = localThemeScope;
                    this.f27070b = w12;
                }

                public final void a(InterfaceC14914Q Assemble, Composer composer, int i10) {
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
                    C16088n.e(this.f27069a, q1.Column.y(Assemble.getContainers().getList(), androidx.compose.foundation.layout.J.h(Assemble.getContainers().getList().getModifier(), 0.0f, 1, null), null, null, 6, null), ComposableLambdaKt.c(1282439444, true, new C0518a(this.f27069a, this.f27070b, Assemble), composer, 54), composer, 384);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14914Q interfaceC14914Q, Composer composer, Integer num) {
                    a(interfaceC14914Q, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(LocalThemeScope localThemeScope, W1 w12) {
                this.f27067a = localThemeScope;
                this.f27068b = w12;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(822821902, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckboxShowcase.kt:151)");
                }
                LocalThemeScope localThemeScope = this.f27067a;
                Ji.Q.e(localThemeScope, s1.b.f140196a, ComposableLambdaKt.c(-1825771318, true, new C0517a(localThemeScope, this.f27068b), composer, 54), composer, 432);
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

        c(LocalThemeScope localThemeScope, W1 w12) {
            this.f27065a = localThemeScope;
            this.f27066b = w12;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(895384571, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content.<anonymous>.<anonymous>.<anonymous> (CheckboxShowcase.kt:147)");
            }
            Ri.b.b(this.f27065a, null, this.f27066b.d("Group, Multi-Line (\"CheckBoxGroupItem\")"), "1.0", null, ComposableLambdaKt.c(822821902, true, new a(this.f27065a, this.f27066b), composer, 54), composer, 199680, 9);
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
        final /* synthetic */ LocalThemeScope f27074a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ W1 f27075b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27076a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ W1 f27077b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Pi.W1$d$a$a, reason: collision with other inner class name */
            static final class C0519a implements Function3<InterfaceC14914Q, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27078a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ W1 f27079b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Pi.W1$d$a$a$a, reason: collision with other inner class name */
                static final class C0520a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ W1 f27080a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ InterfaceC14914Q f27081b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27082c;

                    C0520a(W1 w12, InterfaceC14914Q interfaceC14914Q, LocalThemeScope localThemeScope) {
                        this.f27080a = w12;
                        this.f27081b = interfaceC14914Q;
                        this.f27082c = localThemeScope;
                    }

                    public final void c(InterfaceC14814f AdsColumn, Composer composer, int i10) {
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
                        final InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
                        composer.P();
                        composer.startReplaceGroup(1849434622);
                        Object objB2 = composer.B();
                        if (objB2 == companion.a()) {
                            objB2 = androidx.compose.runtime.t1.e(Boolean.TRUE, null, 2, null);
                            composer.t(objB2);
                        }
                        composer.P();
                        String singleLineString = this.f27080a.getSingleLineString();
                        q1.Label itemLabelEnabled = this.f27081b.getLabels().getItemLabelEnabled();
                        boolean zD = d(interfaceC5730l0);
                        boolean zG = g((InterfaceC5730l0) objB2);
                        q1.s.Checkbox trailingToggleButton = this.f27081b.getToggleButtons().getTrailingToggleButton();
                        LocalThemeScope localThemeScope = this.f27082c;
                        composer.startReplaceGroup(5004770);
                        Object objB3 = composer.B();
                        if (objB3 == companion.a()) {
                            objB3 = new Function1() { // from class: Pi.f2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return W1.d.a.C0519a.C0520a.k(interfaceC5730l0, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB3);
                        }
                        composer.P();
                        Si.o.s(localThemeScope, null, singleLineString, itemLabelEnabled, null, null, trailingToggleButton, zD, zG, (Function1) objB3, composer, 805306368, 25);
                        Si.o.s(this.f27082c, null, this.f27080a.getSingleLineString(), this.f27081b.getLabels().getItemLabelDisabled(), null, null, this.f27081b.getToggleButtons().getTrailingToggleButton(), true, false, null, composer, 113246208, 281);
                        composer.startReplaceGroup(1849434622);
                        Object objB4 = composer.B();
                        if (objB4 == companion.a()) {
                            objB4 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                            composer.t(objB4);
                        }
                        final InterfaceC5730l0 interfaceC5730l02 = (InterfaceC5730l0) objB4;
                        composer.P();
                        String singleLineString2 = this.f27080a.getSingleLineString();
                        q1.Label itemLabelEnabled2 = this.f27081b.getLabels().getItemLabelEnabled();
                        boolean zL = l(interfaceC5730l02);
                        q1.s.Checkbox trailingToggleButton2 = this.f27081b.getToggleButtons().getTrailingToggleButton();
                        LocalThemeScope localThemeScope2 = this.f27082c;
                        composer.startReplaceGroup(5004770);
                        Object objB5 = composer.B();
                        if (objB5 == companion.a()) {
                            objB5 = new Function1() { // from class: Pi.g2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return W1.d.a.C0519a.C0520a.e(interfaceC5730l02, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB5);
                        }
                        composer.P();
                        Si.o.s(localThemeScope2, null, singleLineString2, itemLabelEnabled2, null, null, trailingToggleButton2, zL, true, (Function1) objB5, composer, 905969664, 25);
                        Si.o.s(this.f27082c, null, this.f27080a.getSingleLineString(), this.f27081b.getLabels().getItemLabelDisabled(), null, null, this.f27081b.getToggleButtons().getTrailingToggleButton(), false, false, null, composer, 113246208, 281);
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

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit e(InterfaceC5730l0 interfaceC5730l0, boolean z10) {
                        o(interfaceC5730l0, !l(interfaceC5730l0));
                        return Unit.f142422a;
                    }

                    private static final void f(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
                        interfaceC5730l0.setValue(Boolean.valueOf(z10));
                    }

                    private static final boolean g(InterfaceC5730l0<Boolean> interfaceC5730l0) {
                        return interfaceC5730l0.getValue().booleanValue();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit k(InterfaceC5730l0 interfaceC5730l0, boolean z10) {
                        f(interfaceC5730l0, !d(interfaceC5730l0));
                        return Unit.f142422a;
                    }

                    private static final boolean l(InterfaceC5730l0<Boolean> interfaceC5730l0) {
                        return interfaceC5730l0.getValue().booleanValue();
                    }

                    private static final void o(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
                        interfaceC5730l0.setValue(Boolean.valueOf(z10));
                    }
                }

                C0519a(LocalThemeScope localThemeScope, W1 w12) {
                    this.f27078a = localThemeScope;
                    this.f27079b = w12;
                }

                public final void a(InterfaceC14914Q Assemble, Composer composer, int i10) {
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
                    C16088n.e(this.f27078a, Assemble.getContainers().getList(), ComposableLambdaKt.c(-1862695565, true, new C0520a(this.f27079b, Assemble, this.f27078a), composer, 54), composer, 384);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14914Q interfaceC14914Q, Composer composer, Integer num) {
                    a(interfaceC14914Q, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(LocalThemeScope localThemeScope, W1 w12) {
                this.f27076a = localThemeScope;
                this.f27077b = w12;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1972654189, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckboxShowcase.kt:213)");
                }
                LocalThemeScope localThemeScope = this.f27076a;
                Ji.Q.e(localThemeScope, s1.b.f140196a, ComposableLambdaKt.c(-675939031, true, new C0519a(localThemeScope, this.f27077b), composer, 54), composer, 432);
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

        d(LocalThemeScope localThemeScope, W1 w12) {
            this.f27074a = localThemeScope;
            this.f27075b = w12;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2045216858, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content.<anonymous>.<anonymous>.<anonymous> (CheckboxShowcase.kt:209)");
            }
            Ri.b.b(this.f27074a, null, this.f27075b.d("Menu Item (\"CheckBoxMenuItem\")"), "1.0", null, ComposableLambdaKt.c(1972654189, true, new a(this.f27074a, this.f27075b), composer, 54), composer, 199680, 9);
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
        final /* synthetic */ LocalThemeScope f27083a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ W1 f27084b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27085a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ W1 f27086b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Pi.W1$e$a$a, reason: collision with other inner class name */
            static final class C0521a implements Function3<InterfaceC14914Q, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27087a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ W1 f27088b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: Pi.W1$e$a$a$a, reason: collision with other inner class name */
                static final class C0522a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ W1 f27089a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ InterfaceC14914Q f27090b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f27091c;

                    C0522a(W1 w12, InterfaceC14914Q interfaceC14914Q, LocalThemeScope localThemeScope) {
                        this.f27089a = w12;
                        this.f27090b = interfaceC14914Q;
                        this.f27091c = localThemeScope;
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
                            ComposerKt.U(-712863278, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckboxShowcase.kt:263)");
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
                        String multiLineString = this.f27089a.getMultiLineString();
                        q1.Label itemLabelEnabled = this.f27090b.getLabels().getItemLabelEnabled();
                        boolean zD = d(interfaceC5730l0);
                        boolean zK = k((InterfaceC5730l0) objB2);
                        q1.s.Checkbox trailingToggleButton = this.f27090b.getToggleButtons().getTrailingToggleButton();
                        LocalThemeScope localThemeScope = this.f27091c;
                        composer.startReplaceGroup(5004770);
                        Object objB3 = composer.B();
                        if (objB3 == companion.a()) {
                            objB3 = new Function1() { // from class: Pi.h2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return W1.e.a.C0521a.C0522a.l(interfaceC5730l0, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB3);
                        }
                        composer.P();
                        Si.o.s(localThemeScope, null, multiLineString, itemLabelEnabled, null, null, trailingToggleButton, zD, zK, (Function1) objB3, composer, 805306368, 25);
                        Si.o.s(this.f27091c, null, this.f27089a.getMultiLineString(), this.f27090b.getLabels().getItemLabelDisabled(), null, null, this.f27090b.getToggleButtons().getTrailingToggleButton(), true, false, null, composer, 113246208, 281);
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
                        String multiLineString2 = this.f27089a.getMultiLineString();
                        q1.Label itemLabelEnabled2 = this.f27090b.getLabels().getItemLabelEnabled();
                        boolean zO = o(interfaceC5730l02);
                        boolean zE = e((InterfaceC5730l0) objB5);
                        q1.s.Checkbox trailingToggleButton2 = this.f27090b.getToggleButtons().getTrailingToggleButton();
                        LocalThemeScope localThemeScope2 = this.f27091c;
                        composer.startReplaceGroup(5004770);
                        Object objB6 = composer.B();
                        if (objB6 == companion.a()) {
                            objB6 = new Function1() { // from class: Pi.i2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return W1.e.a.C0521a.C0522a.f(interfaceC5730l02, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.t(objB6);
                        }
                        composer.P();
                        Si.o.s(localThemeScope2, null, multiLineString2, itemLabelEnabled2, null, null, trailingToggleButton2, zO, zE, (Function1) objB6, composer, 805306368, 25);
                        Si.o.s(this.f27091c, null, this.f27089a.getMultiLineString(), this.f27090b.getLabels().getItemLabelDisabled(), null, null, this.f27090b.getToggleButtons().getTrailingToggleButton(), false, false, null, composer, 113246208, 281);
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

                C0521a(LocalThemeScope localThemeScope, W1 w12) {
                    this.f27087a = localThemeScope;
                    this.f27088b = w12;
                }

                public final void a(InterfaceC14914Q Assemble, Composer composer, int i10) {
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
                    C16088n.e(this.f27087a, Assemble.getContainers().getList(), ComposableLambdaKt.c(-712863278, true, new C0522a(this.f27088b, Assemble, this.f27087a), composer, 54), composer, 384);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14914Q interfaceC14914Q, Composer composer, Integer num) {
                    a(interfaceC14914Q, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(LocalThemeScope localThemeScope, W1 w12) {
                this.f27085a = localThemeScope;
                this.f27086b = w12;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1172480820, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckboxShowcase.kt:261)");
                }
                LocalThemeScope localThemeScope = this.f27085a;
                Ji.Q.e(localThemeScope, s1.b.f140196a, ComposableLambdaKt.c(473893256, true, new C0521a(localThemeScope, this.f27086b), composer, 54), composer, 432);
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

        e(LocalThemeScope localThemeScope, W1 w12) {
            this.f27083a = localThemeScope;
            this.f27084b = w12;
        }

        public final void a(InterfaceC15343c item, Composer composer, int i10) {
            Intrinsics.j(item, "$this$item");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1099918151, i10, -1, "com.meijer.mobile.androidacres.showcase.components.CheckboxShowcase.Content.<anonymous>.<anonymous>.<anonymous> (CheckboxShowcase.kt:257)");
            }
            Ri.b.b(this.f27083a, null, this.f27084b.d("Menu Item, Multi-Line (\"CheckBoxMenuItem\")"), "1.0", null, ComposableLambdaKt.c(-1172480820, true, new a(this.f27083a, this.f27084b), composer, 54), composer, 199680, 9);
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
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(W1 w12, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        w12.a(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(W1 w12, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        w12.f(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    @Override // Ni.c
    public void a(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
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
                objB = new Function1() { // from class: Pi.P1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return W1.j(localThemeScope, this, (l0.w) obj);
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
            t0L.a(new Function2() { // from class: Pi.Q1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return W1.k(this.f26942a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    public void f(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
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
            t0L.a(new Function2() { // from class: Pi.R1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return W1.l(this.f26960a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
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

    @Override // Ni.c
    /* renamed from: o, reason: from getter */
    public l.f getState() {
        return this.state;
    }
}
