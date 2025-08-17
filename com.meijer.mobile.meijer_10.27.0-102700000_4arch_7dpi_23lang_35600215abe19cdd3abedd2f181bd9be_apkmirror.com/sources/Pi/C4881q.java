package Pi;

import Ji.LocalThemeScope;
import Pi.C4881q;
import androidx.compose.runtime.C5702c1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5726j0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import j0.InterfaceC14800I;
import java.util.Map;
import ji.InterfaceC14912O;
import ji.InterfaceC14923a;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0007²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "c", "(LJi/M;Landroidx/compose/runtime/Composer;I)V", "g", "", "selected", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Pi.q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4881q {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Pi.q$a */
    static final class a implements Function3<InterfaceC14912O, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27772a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5726j0 f27773b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map<String, String> f27774c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pi.q$a$a, reason: collision with other inner class name */
        static final class C0568a implements Function4<InterfaceC14800I, Integer, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27775a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14912O f27776b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Map.Entry<String, String> f27777c;

            C0568a(LocalThemeScope localThemeScope, InterfaceC14912O interfaceC14912O, Map.Entry<String, String> entry) {
                this.f27775a = localThemeScope;
                this.f27776b = interfaceC14912O;
                this.f27777c = entry;
            }

            public final void a(InterfaceC14800I cardContent, int i10, Composer composer, int i11) {
                Intrinsics.j(cardContent, "$this$cardContent");
                if ((i11 & 129) == 128 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1584804917, i11, -1, "com.meijer.mobile.androidacres.showcase.components.AccordionGroup.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AccordionShowcase.kt:163)");
                }
                ri.j.h(this.f27775a, this.f27776b.getLabels().getDescriptionLabel(), this.f27777c.getValue(), null, composer, 0, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Integer num, Composer composer, Integer num2) {
                a(interfaceC14800I, num.intValue(), composer, num2.intValue());
                return Unit.f142422a;
            }
        }

        a(LocalThemeScope localThemeScope, InterfaceC5726j0 interfaceC5726j0, Map<String, String> map) {
            this.f27772a = localThemeScope;
            this.f27773b = interfaceC5726j0;
            this.f27774c = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(Map map, final InterfaceC14912O interfaceC14912O, final LocalThemeScope localThemeScope, xi.e AdsAccordion) {
            Intrinsics.j(AdsAccordion, "$this$AdsAccordion");
            for (final Map.Entry entry : map.entrySet()) {
                AdsAccordion.B(StringsKt.G((String) entry.getKey(), "3", false, 2, null) ? interfaceC14912O.getAccordions().getDisabled() : interfaceC14912O.getAccordions().getDefault(), new Function1() { // from class: Pi.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4881q.a.g(entry, interfaceC14912O, localThemeScope, (ki.l) obj);
                    }
                });
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Map.Entry entry, InterfaceC14912O interfaceC14912O, LocalThemeScope localThemeScope, ki.l item) {
            Intrinsics.j(item, "$this$item");
            ki.l.l0(item, StringsKt.G((String) entry.getKey(), "3", false, 2, null) ? interfaceC14912O.getLabels().getDisabledLabel() : interfaceC14912O.getLabels().getTitleLabel(), (String) entry.getKey(), null, 4, null);
            item.e0(ComposableLambdaKt.composableLambdaInstance(1584804917, true, new C0568a(localThemeScope, interfaceC14912O, entry)));
            return Unit.f142422a;
        }

        public final void d(final InterfaceC14912O Assemble, Composer composer, int i10) {
            int i11;
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i11 = ((i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1003477910, i11, -1, "com.meijer.mobile.androidacres.showcase.components.AccordionGroup.<anonymous> (AccordionShowcase.kt:139)");
            }
            LocalThemeScope localThemeScope = this.f27772a;
            int iD = C4881q.d(this.f27773b);
            composer.startReplaceGroup(5004770);
            final InterfaceC5726j0 interfaceC5726j0 = this.f27773b;
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new Function1() { // from class: Pi.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4881q.a.e(interfaceC5726j0, ((Integer) obj).intValue());
                    }
                };
                composer.t(objB);
            }
            Function1 function1 = (Function1) objB;
            composer.P();
            composer.startReplaceGroup(-1746271574);
            boolean zD = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f27772a);
            final Map<String, String> map = this.f27774c;
            final LocalThemeScope localThemeScope2 = this.f27772a;
            Object objB2 = composer.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new Function1() { // from class: Pi.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4881q.a.f(map, Assemble, localThemeScope2, (xi.e) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            xi.d.c(localThemeScope, null, iD, true, function1, (Function1) objB2, composer, 27648, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14912O interfaceC14912O, Composer composer, Integer num) {
            d(interfaceC14912O, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(InterfaceC5726j0 interfaceC5726j0, int i10) {
            C4881q.e(interfaceC5726j0, i10);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Pi.q$b */
    static final class b implements Function3<InterfaceC14912O, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27778a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5726j0 f27779b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map<String, String> f27780c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pi.q$b$a */
        static final class a implements Function4<InterfaceC14800I, Integer, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27781a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14912O f27782b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Map.Entry<String, String> f27783c;

            a(LocalThemeScope localThemeScope, InterfaceC14912O interfaceC14912O, Map.Entry<String, String> entry) {
                this.f27781a = localThemeScope;
                this.f27782b = interfaceC14912O;
                this.f27783c = entry;
            }

            public final void a(InterfaceC14800I cardContent, int i10, Composer composer, int i11) {
                Intrinsics.j(cardContent, "$this$cardContent");
                if ((i11 & 129) == 128 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-912873723, i11, -1, "com.meijer.mobile.androidacres.showcase.components.AccordionGroupMultiple.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AccordionShowcase.kt:212)");
                }
                ri.j.h(this.f27781a, this.f27782b.getLabels().getDescriptionLabel(), this.f27783c.getValue(), null, composer, 0, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Integer num, Composer composer, Integer num2) {
                a(interfaceC14800I, num.intValue(), composer, num2.intValue());
                return Unit.f142422a;
            }
        }

        b(LocalThemeScope localThemeScope, InterfaceC5726j0 interfaceC5726j0, Map<String, String> map) {
            this.f27778a = localThemeScope;
            this.f27779b = interfaceC5726j0;
            this.f27780c = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(Map map, final InterfaceC14912O interfaceC14912O, final LocalThemeScope localThemeScope, xi.e AdsAccordion) {
            Intrinsics.j(AdsAccordion, "$this$AdsAccordion");
            for (final Map.Entry entry : map.entrySet()) {
                AdsAccordion.B(StringsKt.G((String) entry.getKey(), "3", false, 2, null) ? interfaceC14912O.getAccordions().getDisabled() : interfaceC14912O.getAccordions().getDefault(), new Function1() { // from class: Pi.t
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4881q.b.g(entry, interfaceC14912O, localThemeScope, (ki.l) obj);
                    }
                });
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Map.Entry entry, InterfaceC14912O interfaceC14912O, LocalThemeScope localThemeScope, ki.l item) {
            Intrinsics.j(item, "$this$item");
            ki.l.l0(item, StringsKt.G((String) entry.getKey(), "3", false, 2, null) ? interfaceC14912O.getLabels().getDisabledLabel() : interfaceC14912O.getLabels().getTitleLabel(), (String) entry.getKey(), null, 4, null);
            item.e0(ComposableLambdaKt.composableLambdaInstance(-912873723, true, new a(localThemeScope, interfaceC14912O, entry)));
            return Unit.f142422a;
        }

        public final void d(final InterfaceC14912O Assemble, Composer composer, int i10) {
            int i11;
            Intrinsics.j(Assemble, "$this$Assemble");
            if ((i10 & 6) == 0) {
                i11 = ((i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(273112422, i11, -1, "com.meijer.mobile.androidacres.showcase.components.AccordionGroupMultiple.<anonymous> (AccordionShowcase.kt:188)");
            }
            LocalThemeScope localThemeScope = this.f27778a;
            int iH = C4881q.h(this.f27779b);
            composer.startReplaceGroup(5004770);
            final InterfaceC5726j0 interfaceC5726j0 = this.f27779b;
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new Function1() { // from class: Pi.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4881q.b.e(interfaceC5726j0, ((Integer) obj).intValue());
                    }
                };
                composer.t(objB);
            }
            Function1 function1 = (Function1) objB;
            composer.P();
            composer.startReplaceGroup(-1746271574);
            boolean zD = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f27778a);
            final Map<String, String> map = this.f27780c;
            final LocalThemeScope localThemeScope2 = this.f27778a;
            Object objB2 = composer.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new Function1() { // from class: Pi.s
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4881q.b.f(map, Assemble, localThemeScope2, (xi.e) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            xi.d.c(localThemeScope, null, iH, false, function1, (Function1) objB2, composer, 27648, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14912O interfaceC14912O, Composer composer, Integer num) {
            d(interfaceC14912O, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(InterfaceC5726j0 interfaceC5726j0, int i10) {
            C4881q.i(interfaceC5726j0, i10);
            return Unit.f142422a;
        }
    }

    public static final void c(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-531186213);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-531186213, i11, -1, "com.meijer.mobile.androidacres.showcase.components.AccordionGroup (AccordionShowcase.kt:127)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = C5702c1.a(0);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Ji.Q.e(localThemeScope, InterfaceC14923a.C2208a.f139742a, ComposableLambdaKt.c(1003477910, true, new a(localThemeScope, (InterfaceC5726j0) objB, MapsKt.o(TuplesKt.a("Title 1", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi."), TuplesKt.a("Title 2", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi."), TuplesKt.a("Title 3", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi."), TuplesKt.a("Title 4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi."), TuplesKt.a("Title 5", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi."))), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Pi.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4881q.f(localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    public static final void g(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(792603307);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(792603307, i11, -1, "com.meijer.mobile.androidacres.showcase.components.AccordionGroupMultiple (AccordionShowcase.kt:176)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = C5702c1.a(0);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Ji.Q.e(localThemeScope, InterfaceC14923a.C2208a.f139742a, ComposableLambdaKt.c(273112422, true, new b(localThemeScope, (InterfaceC5726j0) objB, MapsKt.o(TuplesKt.a("Title 1", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi."), TuplesKt.a("Title 2", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi."), TuplesKt.a("Title 3", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi."), TuplesKt.a("Title 4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi."), TuplesKt.a("Title 5", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi."))), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Pi.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4881q.j(localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        g(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(InterfaceC5726j0 interfaceC5726j0) {
        return interfaceC5726j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(InterfaceC5726j0 interfaceC5726j0, int i10) {
        interfaceC5726j0.j(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(InterfaceC5726j0 interfaceC5726j0) {
        return interfaceC5726j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(InterfaceC5726j0 interfaceC5726j0, int i10) {
        interfaceC5726j0.j(i10);
    }
}
