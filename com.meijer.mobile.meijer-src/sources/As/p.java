package As;

import Ai.AdsTextFieldColors;
import Ai.C2832m0;
import Ai.H1;
import As.p;
import Ki.C;
import Ki.LocalThemeScope;
import Ki.Q;
import Ki.T;
import P0.e;
import V0.C5489q0;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.text.C5835z;
import androidx.compose.foundation.text.InterfaceC5834y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import com.fullstory.compose.FullStoryAnnotationsKt;
import d0.C13575i;
import d0.C13590y;
import dk.C13698b;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14888I;
import ki.InterfaceC15139H;
import ki.InterfaceC15151U;
import ki.InterfaceC15154X;
import ki.InterfaceC15205y;
import ki.Q0;
import ki.q1;
import kotlin.C17970S0;
import kotlin.C18045v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.C16185n1;
import oi.C16190q;
import oi.C16202w0;
import oi.P0;
import oi.o1;
import p1.C16335d;
import p1.C16338g;
import qi.C16671b;
import r1.C16819m;
import r1.u;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u001aZ\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u0012\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0016\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001aM\u0010\u001e\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a;\u0010\"\u001a\u00020\u0004*\u00020\u00002\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010H\u0007¢\u0006\u0004\b\"\u0010#\u001a%\u0010&\u001a\u00020\u0004*\u00020\u00002\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b&\u0010'\"\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*\"\u0014\u0010-\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*¨\u00060²\u0006\u000e\u0010/\u001a\u00020.8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010/\u001a\u00020.8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "searchText", "Lkotlin/Function1;", "", "onValueChange", "labelFor", "Landroidx/compose/foundation/text/y;", "Lkotlin/ExtensionFunctionType;", "onSearch", "Landroidx/compose/ui/Modifier;", "modifier", "l", "(LKi/M;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LAs/e;", "schoolItem", "Lkotlin/Function0;", "onClick", "t", "(LKi/M;LAs/e;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LAs/a;", "classItem", "n", "(LKi/M;LAs/a;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LAs/d;", "schoolCard", "", "isAddToCartInProgress", "onAddAllToCart", "onShopAnotherList", "p", "(LKi/M;LAs/d;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "isSelected", "text", "j", "(LKi/M;ZLjava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "LAs/t;", "unavailableItem", "v", "(LKi/M;LAs/t;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LH1/h;", "a", "F", "LinearIndicatorHeight", "b", "LinearIndicatorWidth", "", "trackerSelected", "supplylists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private static final float f2077a = C17970S0.f168497a.a();

    /* renamed from: b, reason: collision with root package name */
    private static final float f2078b = H1.h.p(240);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC15139H, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f2079a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f2080b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f2081c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f2082d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f2083e;

        a(boolean z10, Modifier modifier, LocalThemeScope localThemeScope, Function0<Unit> function0, String str) {
            this.f2079a = z10;
            this.f2080b = modifier;
            this.f2081c = localThemeScope;
            this.f2082d = function0;
            this.f2083e = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(boolean z10, InterfaceC15139H interfaceC15139H, LocalThemeScope localThemeScope, String str, o1 AdsChip) {
            Intrinsics.j(AdsChip, "$this$AdsChip");
            AdsChip.d(z10 ? q1.Label.y(interfaceC15139H.getLabels().getEnabledRestingLabel(), null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight(), null, 383, null) : interfaceC15139H.getLabels().getEnabledRestingLabel(), str);
            return Unit.f143329a;
        }

        public final void b(final InterfaceC15139H Assemble, Composer composer, int i10) {
            Composer composer2;
            q1.d.ChipButton chipButtonY;
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-698306533, i10, -1, "com.meijer.mobile.ui.supplylists.Pill.<anonymous> (SupplyListsUI.kt:955)");
            }
            composer.startReplaceGroup(-1057676950);
            if (this.f2079a) {
                composer2 = composer;
                chipButtonY = q1.d.ChipButton.y(Assemble.getButtons().getEnabledResting(), false, null, null, null, C13575i.a(H1.h.p(1), this.f2081c.getAdsColors().getAdsColorSupportInformationalBg().getColor()), C18045v.f169801a.a(this.f2081c.getAdsColors().getAdsColorSupportInformationalBg().getColor(), 0L, 0L, 0L, composer, C18045v.f169812l << 12, 14), null, Assemble.getButtons().getEnabledResting().getModifier().then(this.f2080b), false, null, 847, null);
            } else {
                composer2 = composer;
                chipButtonY = q1.d.ChipButton.y(Assemble.getButtons().getEnabledResting(), false, null, null, null, null, null, null, Assemble.getButtons().getEnabledResting().getModifier().then(this.f2080b), false, null, 895, null);
            }
            q1.d.ChipButton chipButton = chipButtonY;
            composer2.P();
            LocalThemeScope localThemeScope = this.f2081c;
            Modifier modifier = this.f2080b;
            Function0<Unit> function0 = this.f2082d;
            composer2.startReplaceGroup(-1224400529);
            boolean zA = composer2.a(this.f2079a) | composer2.D(Assemble) | composer2.D(this.f2081c) | composer2.V(this.f2083e);
            final boolean z10 = this.f2079a;
            final LocalThemeScope localThemeScope2 = this.f2081c;
            final String str = this.f2083e;
            Object objB = composer2.B();
            if (zA || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: As.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return p.a.c(z10, Assemble, localThemeScope2, str, (o1) obj);
                    }
                };
                composer2.t(objB);
            }
            composer2.P();
            C16185n1.h(localThemeScope, modifier, function0, chipButton, (Function1) objB, composer2, (q1.d.ChipButton.f142195k << 9) | LocalThemeScope.f17314g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15139H interfaceC15139H, Composer composer, Integer num) {
            b(interfaceC15139H, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC15151U, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f2084a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f2085b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<InterfaceC5834y, Unit> f2086c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f2087d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f2088e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f2089f;

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, String str, Function1<? super InterfaceC5834y, Unit> function1, Modifier modifier, String str2, Function1<? super String, Unit> function12) {
            this.f2084a = localThemeScope;
            this.f2085b = str;
            this.f2086c = function1;
            this.f2087d = modifier;
            this.f2088e = str2;
            this.f2089f = function12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(String str, u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.g0(semantics, str);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(InterfaceC15151U interfaceC15151U, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            q1.h.DrawableIcon innerIcon = interfaceC15151U.getIcons().getInnerIcon();
            T adsColorIcon01 = localThemeScope.getAdsColors().getAdsColorIcon01();
            Modifier modifier = interfaceC15151U.getIcons().getInnerIcon().getModifier();
            Modifier.Companion companion = Modifier.INSTANCE;
            H1.L(AdsInputField, q1.h.DrawableIcon.y(innerIcon, null, null, null, null, 0.0f, adsColorIcon01, modifier.then(C16819m.d(companion, false, new Function1() { // from class: As.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return p.b.g((u) obj);
                }
            }, 1, null).then(FullStoryAnnotationsKt.fsAttribute(companion, "Button", "schoolsupplies_search"))), 31, null), C.a.B.f16864e, null, null, 12, null);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.w(semantics);
            return Unit.f143329a;
        }

        public final void d(final InterfaceC15151U Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1269610352, i10, -1, "com.meijer.mobile.ui.supplylists.TeacherListsSearchBar.<anonymous> (SupplyListsUI.kt:152)");
            }
            LocalThemeScope localThemeScope = this.f2084a;
            String str = this.f2085b;
            q1.f.TextInput textInputY = q1.f.TextInput.y(Assemble.getInputFields().getDefault(), null, false, null, null, null, new KeyboardOptions(0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.g(), null, null, null, 115, null), new C5835z(null, null, null, null, this.f2086c, null, 47, null), false, 0, null, null, AdsTextFieldColors.b(Assemble.getInputFields().getDefault().getColors(), 0L, 0L, 0L, 0L, this.f2084a.getAdsColors().getAdsColorFocus().getColor(), this.f2084a.getAdsColors().getAdsColorUIBorder01().getColor(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 2147483599, null), 1951, null);
            Modifier modifierI = J.i(this.f2087d, H1.h.p(40));
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f2088e);
            final String str2 = this.f2088e;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: As.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return p.b.e(str2, (u) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Modifier modifierC = C16819m.c(modifierI, true, (Function1) objB);
            Function1<String, Unit> function1 = this.f2089f;
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(Assemble) | composer.D(this.f2084a);
            final LocalThemeScope localThemeScope2 = this.f2084a;
            Object objB2 = composer.B();
            if (zD || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: As.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return p.b.f(Assemble, localThemeScope2, (H1) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            C2832m0.i(localThemeScope, str, textInputY, modifierC, function1, (Function1) objB2, composer, (q1.f.TextInput.f142293m << 6) | LocalThemeScope.f17314g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15151U interfaceC15151U, Composer composer, Integer num) {
            d(interfaceC15151U, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f2090a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ClassItem f2091b;

        c(LocalThemeScope localThemeScope, ClassItem classItem) {
            this.f2090a = localThemeScope;
            this.f2091b = classItem;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(917973953, i10, -1, "com.meijer.mobile.ui.supplylists.UIClassListCard.<anonymous> (SupplyListsUI.kt:636)");
            }
            e.Companion companion = P0.e.INSTANCE;
            e.c cVarI = companion.i();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierL = D.l(companion2, this.f2090a.getAdsSpacing().getFive().getDp(), this.f2090a.getAdsSpacing().getThree().getDp(), this.f2090a.getAdsSpacing().getThree().getDp(), this.f2090a.getAdsSpacing().getThree().getDp());
            LocalThemeScope localThemeScope = this.f2090a;
            ClassItem classItem = this.f2091b;
            C5800d c5800d = C5800d.f48779a;
            MeasurePolicy measurePolicyB = G.b(c5800d.g(), cVarI, composer, 48);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierL);
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
            D1.c(composerA, measurePolicyB, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            MeasurePolicy measurePolicyA = C5807k.a(c5800d.h(), companion.k(), composer, 0);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion2);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
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
            D1.c(composerA2, measurePolicyA, companion3.e());
            D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            q1.Label label = new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight(), null, 381, null);
            String classroomName = classItem.getClassroomName();
            int i11 = LocalThemeScope.f17314g;
            int i12 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, classroomName, null, composer, i11 | (i12 << 3), 4);
            C14890K.a(J.i(companion2, localThemeScope.getAdsSpacing().getTwo().getDp()), composer, 0);
            si.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getDetail().getOne(), null, 381, null), classItem.getGradeLevel(), null, composer, i11 | (i12 << 3), 4);
            composer.v();
            C14890K.a(InterfaceC14888I.b(c14889j, companion2, 1.0f, false, 2, null), composer, 0);
            C16671b.b(localThemeScope, new q1.h.DrawableIcon(C.f.i.f17057e, null, null, null, 0.0f, null, null, 124, null), null, null, composer, i11 | (q1.h.DrawableIcon.f142322h << 3), 6);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f2092a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SchoolCard f2093b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f2094c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f2095d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f2096e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f2097a;

            a(LocalThemeScope localThemeScope) {
                this.f2097a = localThemeScope;
            }

            public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-1332772989, i10, -1, "com.meijer.mobile.ui.supplylists.UISchoolCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SupplyListsUI.kt:747)");
                }
                Ci.m.f(this.f2097a, null, Assemble.getLoading().getSmallLoading(), Ci.o.f4629a, C16338g.c(As.c.f2015a, composer, 0), false, null, composer, LocalThemeScope.f17314g | 3072 | (q1.k.Small.f142357f << 6), 49);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15154X interfaceC15154X, Composer composer, Integer num) {
                a(interfaceC15154X, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        d(LocalThemeScope localThemeScope, SchoolCard schoolCard, Function0<Unit> function0, boolean z10, Function0<Unit> function02) {
            this.f2092a = localThemeScope;
            this.f2093b = schoolCard;
            this.f2094c = function0;
            this.f2095d = z10;
            this.f2096e = function02;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1760414917, i10, -1, "com.meijer.mobile.ui.supplylists.UISchoolCard.<anonymous> (SupplyListsUI.kt:688)");
            }
            LocalThemeScope localThemeScope = this.f2092a;
            SchoolCard schoolCard = this.f2093b;
            Function0<Unit> function0 = this.f2094c;
            boolean z10 = this.f2095d;
            Function0<Unit> function02 = this.f2096e;
            Modifier.Companion companion = Modifier.INSTANCE;
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
            D1.c(composerA, measurePolicyG, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C13590y.a(C16335d.c(As.b.f2014a, composer, 0), null, C5806j.f48836a.g(companion, companion2.c()), null, InterfaceC5926k.INSTANCE.b(), 0.0f, null, composer, 24624, 104);
            Modifier modifierL = D.l(companion, localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFive().getDp());
            C5800d c5800d = C5800d.f48779a;
            MeasurePolicy measurePolicyA = C5807k.a(c5800d.h(), companion2.k(), composer, 0);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierL);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
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
            D1.c(composerA2, measurePolicyA, companion3.e());
            D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            MeasurePolicy measurePolicyA2 = C5807k.a(c5800d.h(), companion2.k(), composer, 0);
            int iA3 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, companion);
            Function0<InterfaceC5953g> function0A3 = companion3.a();
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
            D1.c(composerA3, measurePolicyA2, companion3.e());
            D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            q1.Label label = new q1.Label(null, localThemeScope.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSix(), null, 381, null);
            String className = schoolCard.getClassName();
            int i11 = LocalThemeScope.f17314g;
            int i12 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, className, null, composer, i11 | (i12 << 3), 4);
            C14890K.a(J.i(companion, localThemeScope.getAdsSpacing().getFour().getDp()), composer, 0);
            si.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 381, null), schoolCard.getSchoolName(), null, composer, i11 | (i12 << 3), 4);
            C14890K.a(J.i(companion, localThemeScope.getAdsSpacing().getFour().getDp()), composer, 0);
            si.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 381, null), schoolCard.getSchoolYear(), null, composer, i11 | (i12 << 3), 4);
            C14890K.a(J.i(companion, localThemeScope.getAdsSpacing().getTwo().getDp()), composer, 0);
            si.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 381, null), schoolCard.getGrade(), null, composer, i11 | (i12 << 3), 4);
            C14890K.a(J.i(companion, localThemeScope.getAdsSpacing().getTwo().getDp()), composer, 0);
            si.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 381, null), schoolCard.getDateUpdated(), null, composer, i11 | (i12 << 3), 4);
            C14890K.a(J.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            MeasurePolicy measurePolicyG2 = C5804h.g(companion2.e(), false);
            int iA4 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR4 = composer.r();
            Modifier modifierE4 = androidx.compose.ui.b.e(composer, companion);
            Function0<InterfaceC5953g> function0A4 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A4);
            } else {
                composer.s();
            }
            Composer composerA4 = D1.a(composer);
            D1.c(composerA4, measurePolicyG2, companion3.e());
            D1.c(composerA4, interfaceC5884sR4, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion3.b();
            if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                composerA4.t(Integer.valueOf(iA4));
                composerA4.n(Integer.valueOf(iA4), function2B4);
            }
            D1.c(composerA4, modifierE4, companion3.f());
            composer.startReplaceGroup(888114470);
            if (z10) {
                Q.e(localThemeScope, Q0.b.f141966a, ComposableLambdaKt.c(-1332772989, true, new a(localThemeScope), composer, 54), composer, i11 | 384 | (Q0.b.f141967b << 3));
            }
            composer.P();
            Modifier modifierA = z10 ? T0.a.a(companion, 0.0f) : T0.a.a(companion, 1.0f);
            MeasurePolicy measurePolicyG3 = C5804h.g(companion2.o(), false);
            int iA5 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR5 = composer.r();
            Modifier modifierE5 = androidx.compose.ui.b.e(composer, modifierA);
            Function0<InterfaceC5953g> function0A5 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A5);
            } else {
                composer.s();
            }
            Composer composerA5 = D1.a(composer);
            D1.c(composerA5, measurePolicyG3, companion3.e());
            D1.c(composerA5, interfaceC5884sR5, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B5 = companion3.b();
            if (composerA5.getInserting() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                composerA5.t(Integer.valueOf(iA5));
                composerA5.n(Integer.valueOf(iA5), function2B5);
            }
            D1.c(composerA5, modifierE5, companion3.f());
            P0.h(localThemeScope, C16190q.f154222a, function02, C.b.a.C0289b.f16916e, C16338g.c(As.c.f2017c, composer, 0), FullStoryAnnotationsKt.fsAttribute(companion, "Button", "schoolsupplies_addAllToCart"), null, true, !z10, false, 0L, composer, 12582912 | i11 | (C16190q.f154223b << 3) | (C.b.a.C0289b.f16917f << 9), 0, 800);
            composer.v();
            composer.v();
            C14890K.a(J.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            P0.k(localThemeScope, C16202w0.f154271a, C16338g.c(As.c.f2018d, composer, 0), function0, FullStoryAnnotationsKt.fsAttribute(companion, "Button", "schoolsupplies_shopAnotherList"), null, true, 0L, false, composer, i11 | 1572864 | (C16202w0.f154272b << 3), 208);
            composer.v();
            composer.v();
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f2098a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SchoolItem f2099b;

        e(LocalThemeScope localThemeScope, SchoolItem schoolItem) {
            this.f2098a = localThemeScope;
            this.f2099b = schoolItem;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(195648317, i10, -1, "com.meijer.mobile.ui.supplylists.UISchoolListCard.<anonymous> (SupplyListsUI.kt:570)");
            }
            e.Companion companion = P0.e.INSTANCE;
            e.c cVarI = companion.i();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierL = D.l(companion2, this.f2098a.getAdsSpacing().getFive().getDp(), this.f2098a.getAdsSpacing().getThree().getDp(), this.f2098a.getAdsSpacing().getThree().getDp(), this.f2098a.getAdsSpacing().getThree().getDp());
            LocalThemeScope localThemeScope = this.f2098a;
            SchoolItem schoolItem = this.f2099b;
            C5800d c5800d = C5800d.f48779a;
            MeasurePolicy measurePolicyB = G.b(c5800d.g(), cVarI, composer, 48);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierL);
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
            D1.c(composerA, measurePolicyB, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            MeasurePolicy measurePolicyA = C5807k.a(c5800d.h(), companion.k(), composer, 0);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion2);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
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
            D1.c(composerA2, measurePolicyA, companion3.e());
            D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            q1.Label label = new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight(), null, 381, null);
            String name = schoolItem.getName();
            int i11 = LocalThemeScope.f17314g;
            int i12 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, name, null, composer, i11 | (i12 << 3), 4);
            C14890K.a(J.i(companion2, localThemeScope.getAdsSpacing().getTwo().getDp()), composer, 0);
            si.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getDetail().getOne(), null, 381, null), schoolItem.getStreet(), null, composer, i11 | (i12 << 3), 4);
            si.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getDetail().getOne(), null, 381, null), C13698b.a(AbstractC6392a.INSTANCE.d(As.c.f2016b, schoolItem.getCity(), schoolItem.getState(), schoolItem.getZip()), composer, AbstractC6392a.f60445b), null, composer, i11 | (i12 << 3), 4);
            composer.v();
            C14890K.a(InterfaceC14888I.b(c14889j, companion2, 1.0f, false, 2, null), composer, 0);
            C16671b.b(localThemeScope, new q1.h.DrawableIcon(C.f.i.f17057e, null, null, null, 0.0f, null, null, 124, null), null, null, composer, i11 | (q1.h.DrawableIcon.f142322h << 3), 6);
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

    public static final void j(final LocalThemeScope localThemeScope, final boolean z10, final String text, Modifier modifier, final Function0<Unit> onClick, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(text, "text");
        Intrinsics.j(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-538922640);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.a(z10) ? 32 : 16;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(text) ? 256 : 128;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 8) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.D(onClick) ? 16384 : 8192;
        }
        int i14 = i12;
        if ((i14 & 9363) == 9362 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(-538922640, i14, -1, "com.meijer.mobile.ui.supplylists.Pill (SupplyListsUI.kt:953)");
            }
            Q.e(localThemeScope, InterfaceC15205y.a.C2257a.f142541a, ComposableLambdaKt.c(-698306533, true, new a(z10, modifier3, localThemeScope, onClick, text), composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f17314g | 384 | (i14 & 14) | (InterfaceC15205y.a.C2257a.f142542b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: As.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return p.k(localThemeScope, z10, text, modifier2, onClick, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, boolean z10, String str, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, z10, str, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final Ki.LocalThemeScope r11, final java.lang.String r12, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r13, final java.lang.String r14, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.InterfaceC5834y, kotlin.Unit> r15, androidx.compose.ui.Modifier r16, androidx.compose.runtime.Composer r17, final int r18, final int r19) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: As.p.l(Ki.M, java.lang.String, kotlin.jvm.functions.Function1, java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, String str, Function1 function1, String str2, Function1 function12, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, str, function1, str2, function12, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(final Ki.LocalThemeScope r19, final As.ClassItem r20, final kotlin.jvm.functions.Function0<kotlin.Unit> r21, androidx.compose.ui.Modifier r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: As.p.n(Ki.M, As.a, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, ClassItem classItem, Function0 function0, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        n(localThemeScope, classItem, function0, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(final Ki.LocalThemeScope r20, final As.SchoolCard r21, androidx.compose.ui.Modifier r22, final boolean r23, kotlin.jvm.functions.Function0<kotlin.Unit> r24, kotlin.jvm.functions.Function0<kotlin.Unit> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: As.p.p(Ki.M, As.d, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(LocalThemeScope localThemeScope, SchoolCard schoolCard, Modifier modifier, boolean z10, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        p(localThemeScope, schoolCard, modifier, z10, function0, function02, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t(final Ki.LocalThemeScope r19, final As.SchoolItem r20, final kotlin.jvm.functions.Function0<kotlin.Unit> r21, androidx.compose.ui.Modifier r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: As.p.t(Ki.M, As.e, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(LocalThemeScope localThemeScope, SchoolItem schoolItem, Function0 function0, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        t(localThemeScope, schoolItem, function0, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void v(final Ki.LocalThemeScope r35, final As.UnavailableItem r36, androidx.compose.ui.Modifier r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: As.p.v(Ki.M, As.t, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(float f10, X0.f Canvas) {
        Intrinsics.j(Canvas, "$this$Canvas");
        X0.f.f1(Canvas, C5489q0.INSTANCE.a(), f10, 0L, 0.0f, null, null, 0, 124, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(LocalThemeScope localThemeScope, UnavailableItem unavailableItem, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        v(localThemeScope, unavailableItem, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
