package As;

import As.p;
import Ji.C;
import Ji.LocalThemeScope;
import Ji.Q;
import Ji.T;
import P0.e;
import V0.C5346q0;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.text.C5693z;
import androidx.compose.foundation.text.InterfaceC5692y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.recyclerview.widget.RecyclerView;
import ck.C6408b;
import com.fullstory.compose.FullStoryAnnotationsKt;
import d0.C13442i;
import d0.C13457y;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import ji.InterfaceC14905H;
import ji.InterfaceC14917U;
import ji.InterfaceC14920X;
import ji.InterfaceC14971y;
import ji.Q0;
import ji.q1;
import kotlin.C17904S0;
import kotlin.C17979v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.C15851n1;
import ni.C15856q;
import ni.C15868w0;
import ni.P0;
import ni.o1;
import p1.C16190d;
import p1.C16193g;
import pi.C16307b;
import r1.C16705m;
import r1.u;
import zi.AdsTextFieldColors;
import zi.C18504m0;
import zi.H1;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u001aZ\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u0012\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0016\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001aM\u0010\u001e\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a;\u0010\"\u001a\u00020\u0004*\u00020\u00002\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010H\u0007¢\u0006\u0004\b\"\u0010#\u001a%\u0010&\u001a\u00020\u0004*\u00020\u00002\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b&\u0010'\"\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*\"\u0014\u0010-\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*¨\u00060²\u0006\u000e\u0010/\u001a\u00020.8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010/\u001a\u00020.8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "searchText", "Lkotlin/Function1;", "", "onValueChange", "labelFor", "Landroidx/compose/foundation/text/y;", "Lkotlin/ExtensionFunctionType;", "onSearch", "Landroidx/compose/ui/Modifier;", "modifier", "l", "(LJi/M;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LAs/e;", "schoolItem", "Lkotlin/Function0;", "onClick", "t", "(LJi/M;LAs/e;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LAs/a;", "classItem", "n", "(LJi/M;LAs/a;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LAs/d;", "schoolCard", "", "isAddToCartInProgress", "onAddAllToCart", "onShopAnotherList", "p", "(LJi/M;LAs/d;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "isSelected", "text", "j", "(LJi/M;ZLjava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "LAs/t;", "unavailableItem", "v", "(LJi/M;LAs/t;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LH1/h;", "a", "F", "LinearIndicatorHeight", "b", "LinearIndicatorWidth", "", "trackerSelected", "supplylists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private static final float f1580a = C17904S0.f167409a.a();

    /* renamed from: b, reason: collision with root package name */
    private static final float f1581b = H1.h.p(240);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14905H, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f1582a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f1583b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f1584c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f1585d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f1586e;

        a(boolean z10, Modifier modifier, LocalThemeScope localThemeScope, Function0<Unit> function0, String str) {
            this.f1582a = z10;
            this.f1583b = modifier;
            this.f1584c = localThemeScope;
            this.f1585d = function0;
            this.f1586e = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(boolean z10, InterfaceC14905H interfaceC14905H, LocalThemeScope localThemeScope, String str, o1 AdsChip) {
            Intrinsics.j(AdsChip, "$this$AdsChip");
            AdsChip.d(z10 ? q1.Label.y(interfaceC14905H.getLabels().getEnabledRestingLabel(), null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight(), null, 383, null) : interfaceC14905H.getLabels().getEnabledRestingLabel(), str);
            return Unit.f142422a;
        }

        public final void b(final InterfaceC14905H Assemble, Composer composer, int i10) {
            Composer composer2;
            q1.d.ChipButton chipButtonY;
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-698306533, i10, -1, "com.meijer.mobile.ui.supplylists.Pill.<anonymous> (SupplyListsUI.kt:955)");
            }
            composer.startReplaceGroup(-1057676950);
            if (this.f1582a) {
                composer2 = composer;
                chipButtonY = q1.d.ChipButton.y(Assemble.getButtons().getEnabledResting(), false, null, null, null, C13442i.a(H1.h.p(1), this.f1584c.getAdsColors().getAdsColorSupportInformationalBg().getColor()), C17979v.f168713a.a(this.f1584c.getAdsColors().getAdsColorSupportInformationalBg().getColor(), 0L, 0L, 0L, composer, C17979v.f168724l << 12, 14), null, Assemble.getButtons().getEnabledResting().getModifier().then(this.f1583b), false, null, 847, null);
            } else {
                composer2 = composer;
                chipButtonY = q1.d.ChipButton.y(Assemble.getButtons().getEnabledResting(), false, null, null, null, null, null, null, Assemble.getButtons().getEnabledResting().getModifier().then(this.f1583b), false, null, 895, null);
            }
            q1.d.ChipButton chipButton = chipButtonY;
            composer2.P();
            LocalThemeScope localThemeScope = this.f1584c;
            Modifier modifier = this.f1583b;
            Function0<Unit> function0 = this.f1585d;
            composer2.startReplaceGroup(-1224400529);
            boolean zA = composer2.a(this.f1582a) | composer2.D(Assemble) | composer2.D(this.f1584c) | composer2.V(this.f1586e);
            final boolean z10 = this.f1582a;
            final LocalThemeScope localThemeScope2 = this.f1584c;
            final String str = this.f1586e;
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
            C15851n1.h(localThemeScope, modifier, function0, chipButton, (Function1) objB, composer2, (q1.d.ChipButton.f139940k << 9) | LocalThemeScope.f15770g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14905H interfaceC14905H, Composer composer, Integer num) {
            b(interfaceC14905H, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC14917U, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f1587a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f1588b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<InterfaceC5692y, Unit> f1589c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Modifier f1590d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f1591e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f1592f;

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, String str, Function1<? super InterfaceC5692y, Unit> function1, Modifier modifier, String str2, Function1<? super String, Unit> function12) {
            this.f1587a = localThemeScope;
            this.f1588b = str;
            this.f1589c = function1;
            this.f1590d = modifier;
            this.f1591e = str2;
            this.f1592f = function12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(String str, u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.g0(semantics, str);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(InterfaceC14917U interfaceC14917U, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            q1.h.DrawableIcon innerIcon = interfaceC14917U.getIcons().getInnerIcon();
            T adsColorIcon01 = localThemeScope.getAdsColors().getAdsColorIcon01();
            Modifier modifier = interfaceC14917U.getIcons().getInnerIcon().getModifier();
            Modifier.Companion companion = Modifier.INSTANCE;
            H1.N(AdsInputField, q1.h.DrawableIcon.y(innerIcon, null, null, null, null, 0.0f, adsColorIcon01, modifier.then(C16705m.d(companion, false, new Function1() { // from class: As.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return p.b.g((u) obj);
                }
            }, 1, null).then(FullStoryAnnotationsKt.fsAttribute(companion, "Button", "schoolsupplies_search"))), 31, null), C.a.B.f15320e, null, null, 12, null);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.w(semantics);
            return Unit.f142422a;
        }

        public final void d(final InterfaceC14917U Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1269610352, i10, -1, "com.meijer.mobile.ui.supplylists.TeacherListsSearchBar.<anonymous> (SupplyListsUI.kt:152)");
            }
            LocalThemeScope localThemeScope = this.f1587a;
            String str = this.f1588b;
            q1.f.TextInput textInputY = q1.f.TextInput.y(Assemble.getInputFields().getDefault(), null, false, null, null, null, new KeyboardOptions(0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.g(), null, null, null, 115, null), new C5693z(null, null, null, null, this.f1589c, null, 47, null), false, 0, null, null, AdsTextFieldColors.b(Assemble.getInputFields().getDefault().getColors(), 0L, 0L, 0L, 0L, this.f1587a.getAdsColors().getAdsColorFocus().getColor(), this.f1587a.getAdsColors().getAdsColorUIBorder01().getColor(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 2147483599, null), 1951, null);
            Modifier modifierI = J.i(this.f1590d, H1.h.p(40));
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f1591e);
            final String str2 = this.f1591e;
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
            Modifier modifierC = C16705m.c(modifierI, true, (Function1) objB);
            Function1<String, Unit> function1 = this.f1592f;
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(Assemble) | composer.D(this.f1587a);
            final LocalThemeScope localThemeScope2 = this.f1587a;
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
            C18504m0.i(localThemeScope, str, textInputY, modifierC, function1, (Function1) objB2, composer, (q1.f.TextInput.f140038m << 6) | LocalThemeScope.f15770g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14917U interfaceC14917U, Composer composer, Integer num) {
            d(interfaceC14917U, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f1593a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ClassItem f1594b;

        c(LocalThemeScope localThemeScope, ClassItem classItem) {
            this.f1593a = localThemeScope;
            this.f1594b = classItem;
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
            Modifier modifierL = D.l(companion2, this.f1593a.getAdsSpacing().getFive().getDp(), this.f1593a.getAdsSpacing().getThree().getDp(), this.f1593a.getAdsSpacing().getThree().getDp(), this.f1593a.getAdsSpacing().getThree().getDp());
            LocalThemeScope localThemeScope = this.f1593a;
            ClassItem classItem = this.f1594b;
            C5658d c5658d = C5658d.f48555a;
            MeasurePolicy measurePolicyB = G.b(c5658d.g(), cVarI, composer, 48);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierL);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
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
            D1.c(composerA, measurePolicyB, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            MeasurePolicy measurePolicyA = C5665k.a(c5658d.h(), companion.k(), composer, 0);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion2);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
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
            D1.c(composerA2, measurePolicyA, companion3.e());
            D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            q1.Label label = new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight(), null, 381, null);
            String classroomName = classItem.getClassroomName();
            int i11 = LocalThemeScope.f15770g;
            int i12 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, classroomName, null, composer, i11 | (i12 << 3), 4);
            C14802K.a(J.i(companion2, localThemeScope.getAdsSpacing().getTwo().getDp()), composer, 0);
            ri.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getDetail().getOne(), null, 381, null), classItem.getGradeLevel(), null, composer, i11 | (i12 << 3), 4);
            composer.v();
            C14802K.a(InterfaceC14800I.b(c14801j, companion2, 1.0f, false, 2, null), composer, 0);
            C16307b.b(localThemeScope, new q1.h.DrawableIcon(C.f.i.f15513e, null, null, null, 0.0f, null, null, 124, null), null, null, composer, i11 | (q1.h.DrawableIcon.f140067h << 3), 6);
            composer.v();
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f1595a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SchoolCard f1596b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f1597c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f1598d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f1599e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f1600a;

            a(LocalThemeScope localThemeScope) {
                this.f1600a = localThemeScope;
            }

            public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-1332772989, i10, -1, "com.meijer.mobile.ui.supplylists.UISchoolCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SupplyListsUI.kt:747)");
                }
                Bi.m.f(this.f1600a, null, Assemble.getLoading().getSmallLoading(), Bi.o.f2584a, C16193g.c(As.c.f1518a, composer, 0), false, null, composer, LocalThemeScope.f15770g | 3072 | (q1.k.Small.f140102f << 6), 49);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14920X interfaceC14920X, Composer composer, Integer num) {
                a(interfaceC14920X, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        d(LocalThemeScope localThemeScope, SchoolCard schoolCard, Function0<Unit> function0, boolean z10, Function0<Unit> function02) {
            this.f1595a = localThemeScope;
            this.f1596b = schoolCard;
            this.f1597c = function0;
            this.f1598d = z10;
            this.f1599e = function02;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1760414917, i10, -1, "com.meijer.mobile.ui.supplylists.UISchoolCard.<anonymous> (SupplyListsUI.kt:688)");
            }
            LocalThemeScope localThemeScope = this.f1595a;
            SchoolCard schoolCard = this.f1596b;
            Function0<Unit> function0 = this.f1597c;
            boolean z10 = this.f1598d;
            Function0<Unit> function02 = this.f1599e;
            Modifier.Companion companion = Modifier.INSTANCE;
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5662h.g(companion2.o(), false);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
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
            D1.c(composerA, measurePolicyG, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C13457y.a(C16190d.c(As.b.f1517a, composer, 0), null, C5664j.f48612a.g(companion, companion2.c()), null, InterfaceC5784k.INSTANCE.b(), 0.0f, null, composer, 24624, 104);
            Modifier modifierL = D.l(companion, localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getSeven().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFive().getDp());
            C5658d c5658d = C5658d.f48555a;
            MeasurePolicy measurePolicyA = C5665k.a(c5658d.h(), companion2.k(), composer, 0);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierL);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
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
            D1.c(composerA2, measurePolicyA, companion3.e());
            D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            MeasurePolicy measurePolicyA2 = C5665k.a(c5658d.h(), companion2.k(), composer, 0);
            int iA3 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, companion);
            Function0<InterfaceC5811g> function0A3 = companion3.a();
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
            D1.c(composerA3, measurePolicyA2, companion3.e());
            D1.c(composerA3, interfaceC5742sR3, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            q1.Label label = new q1.Label(null, localThemeScope.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSix(), null, 381, null);
            String className = schoolCard.getClassName();
            int i11 = LocalThemeScope.f15770g;
            int i12 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, className, null, composer, i11 | (i12 << 3), 4);
            C14802K.a(J.i(companion, localThemeScope.getAdsSpacing().getFour().getDp()), composer, 0);
            ri.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 381, null), schoolCard.getSchoolName(), null, composer, i11 | (i12 << 3), 4);
            C14802K.a(J.i(companion, localThemeScope.getAdsSpacing().getFour().getDp()), composer, 0);
            ri.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 381, null), schoolCard.getSchoolYear(), null, composer, i11 | (i12 << 3), 4);
            C14802K.a(J.i(companion, localThemeScope.getAdsSpacing().getTwo().getDp()), composer, 0);
            ri.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 381, null), schoolCard.getGrade(), null, composer, i11 | (i12 << 3), 4);
            C14802K.a(J.i(companion, localThemeScope.getAdsSpacing().getTwo().getDp()), composer, 0);
            ri.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getTwo(), null, 381, null), schoolCard.getDateUpdated(), null, composer, i11 | (i12 << 3), 4);
            C14802K.a(J.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            MeasurePolicy measurePolicyG2 = C5662h.g(companion2.e(), false);
            int iA4 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR4 = composer.r();
            Modifier modifierE4 = androidx.compose.ui.b.e(composer, companion);
            Function0<InterfaceC5811g> function0A4 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A4);
            } else {
                composer.s();
            }
            Composer composerA4 = D1.a(composer);
            D1.c(composerA4, measurePolicyG2, companion3.e());
            D1.c(composerA4, interfaceC5742sR4, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B4 = companion3.b();
            if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                composerA4.t(Integer.valueOf(iA4));
                composerA4.n(Integer.valueOf(iA4), function2B4);
            }
            D1.c(composerA4, modifierE4, companion3.f());
            composer.startReplaceGroup(888114470);
            if (z10) {
                Q.e(localThemeScope, Q0.b.f139711a, ComposableLambdaKt.c(-1332772989, true, new a(localThemeScope), composer, 54), composer, i11 | 384 | (Q0.b.f139712b << 3));
            }
            composer.P();
            Modifier modifierA = z10 ? T0.a.a(companion, 0.0f) : T0.a.a(companion, 1.0f);
            MeasurePolicy measurePolicyG3 = C5662h.g(companion2.o(), false);
            int iA5 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR5 = composer.r();
            Modifier modifierE5 = androidx.compose.ui.b.e(composer, modifierA);
            Function0<InterfaceC5811g> function0A5 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A5);
            } else {
                composer.s();
            }
            Composer composerA5 = D1.a(composer);
            D1.c(composerA5, measurePolicyG3, companion3.e());
            D1.c(composerA5, interfaceC5742sR5, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B5 = companion3.b();
            if (composerA5.getInserting() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                composerA5.t(Integer.valueOf(iA5));
                composerA5.n(Integer.valueOf(iA5), function2B5);
            }
            D1.c(composerA5, modifierE5, companion3.f());
            P0.h(localThemeScope, C15856q.f151763a, function02, C.b.a.C0247b.f15372e, C16193g.c(As.c.f1520c, composer, 0), FullStoryAnnotationsKt.fsAttribute(companion, "Button", "schoolsupplies_addAllToCart"), null, true, !z10, false, 0L, composer, 12582912 | i11 | (C15856q.f151764b << 3) | (C.b.a.C0247b.f15373f << 9), 0, 800);
            composer.v();
            composer.v();
            C14802K.a(J.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            P0.k(localThemeScope, C15868w0.f151812a, C16193g.c(As.c.f1521d, composer, 0), function0, FullStoryAnnotationsKt.fsAttribute(companion, "Button", "schoolsupplies_shopAnotherList"), null, true, 0L, false, composer, i11 | 1572864 | (C15868w0.f151813b << 3), 208);
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
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f1601a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SchoolItem f1602b;

        e(LocalThemeScope localThemeScope, SchoolItem schoolItem) {
            this.f1601a = localThemeScope;
            this.f1602b = schoolItem;
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
            Modifier modifierL = D.l(companion2, this.f1601a.getAdsSpacing().getFive().getDp(), this.f1601a.getAdsSpacing().getThree().getDp(), this.f1601a.getAdsSpacing().getThree().getDp(), this.f1601a.getAdsSpacing().getThree().getDp());
            LocalThemeScope localThemeScope = this.f1601a;
            SchoolItem schoolItem = this.f1602b;
            C5658d c5658d = C5658d.f48555a;
            MeasurePolicy measurePolicyB = G.b(c5658d.g(), cVarI, composer, 48);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierL);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
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
            D1.c(composerA, measurePolicyB, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            MeasurePolicy measurePolicyA = C5665k.a(c5658d.h(), companion.k(), composer, 0);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion2);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
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
            D1.c(composerA2, measurePolicyA, companion3.e());
            D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            q1.Label label = new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight(), null, 381, null);
            String name = schoolItem.getName();
            int i11 = LocalThemeScope.f15770g;
            int i12 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, name, null, composer, i11 | (i12 << 3), 4);
            C14802K.a(J.i(companion2, localThemeScope.getAdsSpacing().getTwo().getDp()), composer, 0);
            ri.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getDetail().getOne(), null, 381, null), schoolItem.getStreet(), null, composer, i11 | (i12 << 3), 4);
            ri.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getDetail().getOne(), null, 381, null), C6408b.a(AbstractC5607a.INSTANCE.d(As.c.f1519b, schoolItem.getCity(), schoolItem.getState(), schoolItem.getZip()), composer, AbstractC5607a.f45514b), null, composer, i11 | (i12 << 3), 4);
            composer.v();
            C14802K.a(InterfaceC14800I.b(c14801j, companion2, 1.0f, false, 2, null), composer, 0);
            C16307b.b(localThemeScope, new q1.h.DrawableIcon(C.f.i.f15513e, null, null, null, 0.0f, null, null, 124, null), null, null, composer, i11 | (q1.h.DrawableIcon.f140067h << 3), 6);
            composer.v();
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
            Q.e(localThemeScope, InterfaceC14971y.a.C2218a.f140286a, ComposableLambdaKt.c(-698306533, true, new a(z10, modifier3, localThemeScope, onClick, text), composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f15770g | 384 | (i14 & 14) | (InterfaceC14971y.a.C2218a.f140287b << 3));
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
        return Unit.f142422a;
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
    public static final void l(final Ji.LocalThemeScope r11, final java.lang.String r12, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r13, final java.lang.String r14, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.InterfaceC5692y, kotlin.Unit> r15, androidx.compose.ui.Modifier r16, androidx.compose.runtime.Composer r17, final int r18, final int r19) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: As.p.l(Ji.M, java.lang.String, kotlin.jvm.functions.Function1, java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, String str, Function1 function1, String str2, Function1 function12, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, str, function1, str2, function12, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    public static final void n(final Ji.LocalThemeScope r19, final As.ClassItem r20, final kotlin.jvm.functions.Function0<kotlin.Unit> r21, androidx.compose.ui.Modifier r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: As.p.n(Ji.M, As.a, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, ClassItem classItem, Function0 function0, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        n(localThemeScope, classItem, function0, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    public static final void p(final Ji.LocalThemeScope r20, final As.SchoolCard r21, androidx.compose.ui.Modifier r22, final boolean r23, kotlin.jvm.functions.Function0<kotlin.Unit> r24, kotlin.jvm.functions.Function0<kotlin.Unit> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: As.p.p(Ji.M, As.d, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(LocalThemeScope localThemeScope, SchoolCard schoolCard, Modifier modifier, boolean z10, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        p(localThemeScope, schoolCard, modifier, z10, function0, function02, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    public static final void t(final Ji.LocalThemeScope r19, final As.SchoolItem r20, final kotlin.jvm.functions.Function0<kotlin.Unit> r21, androidx.compose.ui.Modifier r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: As.p.t(Ji.M, As.e, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(LocalThemeScope localThemeScope, SchoolItem schoolItem, Function0 function0, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        t(localThemeScope, schoolItem, function0, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
    public static final void v(final Ji.LocalThemeScope r35, final As.UnavailableItem r36, androidx.compose.ui.Modifier r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: As.p.v(Ji.M, As.t, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(float f10, X0.f Canvas) {
        Intrinsics.j(Canvas, "$this$Canvas");
        X0.f.f1(Canvas, C5346q0.INSTANCE.a(), f10, 0L, 0.0f, null, null, 0, 124, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(LocalThemeScope localThemeScope, UnavailableItem unavailableItem, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        v(localThemeScope, unavailableItem, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
