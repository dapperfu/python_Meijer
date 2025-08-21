package Qi;

import Ki.LocalThemeScope;
import Qi.C4965q;
import androidx.compose.runtime.C5844c1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5868j0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import j0.InterfaceC14888I;
import java.util.Map;
import ki.InterfaceC15146O;
import ki.InterfaceC15157a;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0007²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "c", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "g", "", "selected", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Qi.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4965q {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Qi.q$a */
    static final class a implements Function3<InterfaceC15146O, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30484a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5868j0 f30485b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map<String, String> f30486c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qi.q$a$a, reason: collision with other inner class name */
        static final class C0632a implements Function4<InterfaceC14888I, Integer, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30487a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15146O f30488b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Map.Entry<String, String> f30489c;

            C0632a(LocalThemeScope localThemeScope, InterfaceC15146O interfaceC15146O, Map.Entry<String, String> entry) {
                this.f30487a = localThemeScope;
                this.f30488b = interfaceC15146O;
                this.f30489c = entry;
            }

            public final void a(InterfaceC14888I cardContent, int i10, Composer composer, int i11) {
                Intrinsics.j(cardContent, "$this$cardContent");
                if ((i11 & 129) == 128 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1584804917, i11, -1, "com.meijer.mobile.androidacres.showcase.components.AccordionGroup.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AccordionShowcase.kt:163)");
                }
                si.j.h(this.f30487a, this.f30488b.getLabels().getDescriptionLabel(), this.f30489c.getValue(), null, composer, 0, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Integer num, Composer composer, Integer num2) {
                a(interfaceC14888I, num.intValue(), composer, num2.intValue());
                return Unit.f143329a;
            }
        }

        a(LocalThemeScope localThemeScope, InterfaceC5868j0 interfaceC5868j0, Map<String, String> map) {
            this.f30484a = localThemeScope;
            this.f30485b = interfaceC5868j0;
            this.f30486c = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(Map map, final InterfaceC15146O interfaceC15146O, final LocalThemeScope localThemeScope, yi.e AdsAccordion) {
            Intrinsics.j(AdsAccordion, "$this$AdsAccordion");
            for (final Map.Entry entry : map.entrySet()) {
                AdsAccordion.X(StringsKt.G((String) entry.getKey(), "3", false, 2, null) ? interfaceC15146O.getAccordions().getDisabled() : interfaceC15146O.getAccordions().getDefault(), new Function1() { // from class: Qi.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4965q.a.g(entry, interfaceC15146O, localThemeScope, (li.l) obj);
                    }
                });
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Map.Entry entry, InterfaceC15146O interfaceC15146O, LocalThemeScope localThemeScope, li.l item) {
            Intrinsics.j(item, "$this$item");
            li.l.E(item, StringsKt.G((String) entry.getKey(), "3", false, 2, null) ? interfaceC15146O.getLabels().getDisabledLabel() : interfaceC15146O.getLabels().getTitleLabel(), (String) entry.getKey(), null, 4, null);
            item.h0(ComposableLambdaKt.composableLambdaInstance(1584804917, true, new C0632a(localThemeScope, interfaceC15146O, entry)));
            return Unit.f143329a;
        }

        public final void d(final InterfaceC15146O Assemble, Composer composer, int i10) {
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
            LocalThemeScope localThemeScope = this.f30484a;
            int iD = C4965q.d(this.f30485b);
            composer.startReplaceGroup(5004770);
            final InterfaceC5868j0 interfaceC5868j0 = this.f30485b;
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new Function1() { // from class: Qi.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4965q.a.e(interfaceC5868j0, ((Integer) obj).intValue());
                    }
                };
                composer.t(objB);
            }
            Function1 function1 = (Function1) objB;
            composer.P();
            composer.startReplaceGroup(-1746271574);
            boolean zD = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f30484a);
            final Map<String, String> map = this.f30486c;
            final LocalThemeScope localThemeScope2 = this.f30484a;
            Object objB2 = composer.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new Function1() { // from class: Qi.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4965q.a.f(map, Assemble, localThemeScope2, (yi.e) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            yi.d.c(localThemeScope, null, iD, true, function1, (Function1) objB2, composer, 27648, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15146O interfaceC15146O, Composer composer, Integer num) {
            d(interfaceC15146O, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(InterfaceC5868j0 interfaceC5868j0, int i10) {
            C4965q.e(interfaceC5868j0, i10);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Qi.q$b */
    static final class b implements Function3<InterfaceC15146O, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f30490a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5868j0 f30491b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map<String, String> f30492c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qi.q$b$a */
        static final class a implements Function4<InterfaceC14888I, Integer, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30493a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15146O f30494b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Map.Entry<String, String> f30495c;

            a(LocalThemeScope localThemeScope, InterfaceC15146O interfaceC15146O, Map.Entry<String, String> entry) {
                this.f30493a = localThemeScope;
                this.f30494b = interfaceC15146O;
                this.f30495c = entry;
            }

            public final void a(InterfaceC14888I cardContent, int i10, Composer composer, int i11) {
                Intrinsics.j(cardContent, "$this$cardContent");
                if ((i11 & 129) == 128 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-912873723, i11, -1, "com.meijer.mobile.androidacres.showcase.components.AccordionGroupMultiple.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AccordionShowcase.kt:212)");
                }
                si.j.h(this.f30493a, this.f30494b.getLabels().getDescriptionLabel(), this.f30495c.getValue(), null, composer, 0, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Integer num, Composer composer, Integer num2) {
                a(interfaceC14888I, num.intValue(), composer, num2.intValue());
                return Unit.f143329a;
            }
        }

        b(LocalThemeScope localThemeScope, InterfaceC5868j0 interfaceC5868j0, Map<String, String> map) {
            this.f30490a = localThemeScope;
            this.f30491b = interfaceC5868j0;
            this.f30492c = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(Map map, final InterfaceC15146O interfaceC15146O, final LocalThemeScope localThemeScope, yi.e AdsAccordion) {
            Intrinsics.j(AdsAccordion, "$this$AdsAccordion");
            for (final Map.Entry entry : map.entrySet()) {
                AdsAccordion.X(StringsKt.G((String) entry.getKey(), "3", false, 2, null) ? interfaceC15146O.getAccordions().getDisabled() : interfaceC15146O.getAccordions().getDefault(), new Function1() { // from class: Qi.t
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4965q.b.g(entry, interfaceC15146O, localThemeScope, (li.l) obj);
                    }
                });
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Map.Entry entry, InterfaceC15146O interfaceC15146O, LocalThemeScope localThemeScope, li.l item) {
            Intrinsics.j(item, "$this$item");
            li.l.E(item, StringsKt.G((String) entry.getKey(), "3", false, 2, null) ? interfaceC15146O.getLabels().getDisabledLabel() : interfaceC15146O.getLabels().getTitleLabel(), (String) entry.getKey(), null, 4, null);
            item.h0(ComposableLambdaKt.composableLambdaInstance(-912873723, true, new a(localThemeScope, interfaceC15146O, entry)));
            return Unit.f143329a;
        }

        public final void d(final InterfaceC15146O Assemble, Composer composer, int i10) {
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
            LocalThemeScope localThemeScope = this.f30490a;
            int iH = C4965q.h(this.f30491b);
            composer.startReplaceGroup(5004770);
            final InterfaceC5868j0 interfaceC5868j0 = this.f30491b;
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new Function1() { // from class: Qi.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4965q.b.e(interfaceC5868j0, ((Integer) obj).intValue());
                    }
                };
                composer.t(objB);
            }
            Function1 function1 = (Function1) objB;
            composer.P();
            composer.startReplaceGroup(-1746271574);
            boolean zD = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f30490a);
            final Map<String, String> map = this.f30492c;
            final LocalThemeScope localThemeScope2 = this.f30490a;
            Object objB2 = composer.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new Function1() { // from class: Qi.s
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4965q.b.f(map, Assemble, localThemeScope2, (yi.e) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            yi.d.c(localThemeScope, null, iH, false, function1, (Function1) objB2, composer, 27648, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15146O interfaceC15146O, Composer composer, Integer num) {
            d(interfaceC15146O, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(InterfaceC5868j0 interfaceC5868j0, int i10) {
            C4965q.i(interfaceC5868j0, i10);
            return Unit.f143329a;
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
                objB = C5844c1.a(0);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Ki.Q.e(localThemeScope, InterfaceC15157a.C2247a.f141997a, ComposableLambdaKt.c(1003477910, true, new a(localThemeScope, (InterfaceC5868j0) objB, MapsKt.o(TuplesKt.a("Title 1", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi."), TuplesKt.a("Title 2", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi."), TuplesKt.a("Title 3", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi."), TuplesKt.a("Title 4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi."), TuplesKt.a("Title 5", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi."))), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4965q.f(localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
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
                objB = C5844c1.a(0);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Ki.Q.e(localThemeScope, InterfaceC15157a.C2247a.f141997a, ComposableLambdaKt.c(273112422, true, new b(localThemeScope, (InterfaceC5868j0) objB, MapsKt.o(TuplesKt.a("Title 1", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi."), TuplesKt.a("Title 2", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi."), TuplesKt.a("Title 3", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi."), TuplesKt.a("Title 4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi."), TuplesKt.a("Title 5", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi."))), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | 432);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4965q.j(localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        g(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(InterfaceC5868j0 interfaceC5868j0) {
        return interfaceC5868j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(InterfaceC5868j0 interfaceC5868j0, int i10) {
        interfaceC5868j0.i(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(InterfaceC5868j0 interfaceC5868j0) {
        return interfaceC5868j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(InterfaceC5868j0 interfaceC5868j0, int i10) {
        interfaceC5868j0.i(i10);
    }
}
