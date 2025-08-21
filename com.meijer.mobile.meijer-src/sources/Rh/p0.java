package Rh;

import Ai.C2832m0;
import Ai.H1;
import Bi.C2962v;
import Ki.LocalThemeScope;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import ai.AbstractC5695e;
import androidx.compose.foundation.text.C5835z;
import androidx.compose.foundation.text.InterfaceC5834y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5914o;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import bk.C6393b;
import com.meijer.mobile.accounts.ux.profile.a;
import com.meijer.mobile.accounts.ux.profile.l;
import java.util.List;
import ki.H0;
import ki.InterfaceC15149S;
import ki.InterfaceC15153W;
import ki.L0;
import ki.q1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16338g;
import r1.C16819m;
import yr.C18370z;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001aO\u0010\u0011\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0018²\u0006\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00168\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lcom/meijer/mobile/accounts/ux/profile/l$e;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/meijer/mobile/accounts/ux/profile/a;", "", "onResourceAction", "g", "(LKi/M;Lcom/meijer/mobile/accounts/ux/profile/l$e;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "grocerySubstitutionLabel", "Landroidx/compose/ui/focus/o;", "focusManager", "vehicleDescriptionHint", "vehicleDescriptionLabel", "m", "(LKi/M;Lcom/meijer/mobile/accounts/ux/profile/l$e;Ljava/lang/String;Landroidx/compose/ui/focus/o;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "lastAction", "", "enableSaveButton", "Lbk/a;", "errorMessage", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class p0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f32909f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L1.A a10) {
            super(1);
            this.f32909f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f32909f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f32910f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f32911g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f32912h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ l.ProfileScreenViewState f32913i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f32914j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1 f32915k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f32916l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f32917m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f32918n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f32919o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.n nVar, int i10, Function0 function0, l.ProfileScreenViewState profileScreenViewState, LocalThemeScope localThemeScope, Function1 function1, String str, InterfaceC5914o interfaceC5914o, String str2, String str3) {
            super(2);
            this.f32911g = nVar;
            this.f32912h = function0;
            this.f32913i = profileScreenViewState;
            this.f32914j = localThemeScope;
            this.f32915k = function1;
            this.f32916l = str;
            this.f32917m = interfaceC5914o;
            this.f32918n = str2;
            this.f32919o = str3;
            this.f32910f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f32911g.getHelpersHashCode();
            this.f32911g.i();
            L1.n nVar = this.f32911g;
            composer.startReplaceGroup(2108404053);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            L1.h hVarD = bVarM.d();
            L1.h hVarE = bVarM.e();
            composer.startReplaceGroup(206561997);
            if (!C6393b.a(this.f32913i.getSavedOrderPreferencesInformation().getUpdateErrorMessage())) {
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f32914j);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new c(this.f32914j);
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierK = nVar.k(companion, hVarE, (Function1) objB);
                AbstractC6392a updateErrorMessage = this.f32913i.getSavedOrderPreferencesInformation().getUpdateErrorMessage();
                LocalThemeScope localThemeScope = this.f32914j;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f32915k);
                Object objB2 = composer.B();
                if (zV || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new d(this.f32915k);
                    composer.t(objB2);
                }
                composer.P();
                Qh.o.b(localThemeScope, updateErrorMessage, modifierK, (Function0) objB2, composer, LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 3), 0);
            }
            composer.P();
            LocalThemeScope localThemeScope2 = this.f32914j;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composer.startReplaceGroup(-1746271574);
            boolean zD2 = composer.D(this.f32913i) | composer.V(hVarE) | composer.D(this.f32914j);
            Object objB3 = composer.B();
            if (zD2 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new e(this.f32913i, hVarE, this.f32914j);
                composer.t(objB3);
            }
            composer.P();
            q1.Label label = new q1.Label(nVar.k(companion2, hVarA, (Function1) objB3), null, null, null, 0, false, 0, this.f32914j.getAdsTypography().getDetail().getOne().d(this.f32914j.getAdsColors().getAdsColorText02()), null, 382, null);
            String strC = C16338g.c(Gh.h.f12735K0, composer, 0);
            int i11 = LocalThemeScope.f17314g;
            si.j.h(localThemeScope2, label, strC, null, composer, i11 | (q1.Label.f142335j << 3), 4);
            LocalThemeScope localThemeScope3 = this.f32914j;
            Ki.Q.e(localThemeScope3, H0.f141923a, ComposableLambdaKt.c(-1745872142, true, new f(nVar, hVarC, hVarA, localThemeScope3, this.f32913i, this.f32915k, this.f32916l), composer, 54), composer, i11 | 384 | (H0.f141924b << 3));
            LocalThemeScope localThemeScope4 = this.f32914j;
            Ki.Q.e(localThemeScope4, L0.f141930a, ComposableLambdaKt.c(-1718083337, true, new g(nVar, hVarD, hVarC, localThemeScope4, this.f32913i, this.f32917m, this.f32915k, this.f32918n, this.f32919o), composer, 54), composer, i11 | 384 | (L0.f141931b << 3));
            composer.P();
            if (this.f32911g.getHelpersHashCode() != helpersHashCode) {
                this.f32912h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f32920a;

        c(LocalThemeScope localThemeScope) {
            this.f32920a = localThemeScope;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), this.f32920a.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), this.f32920a.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), this.f32920a.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
            constrainAs.r(L1.v.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.profile.a, Unit> f32921a;

        /* JADX WARN: Multi-variable type inference failed */
        d(Function1<? super com.meijer.mobile.accounts.ux.profile.a, Unit> function1) {
            this.f32921a = function1;
        }

        public final void a() {
            this.f32921a.invoke(new a.DismissErrorNotification(false, false, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l.ProfileScreenViewState f32922a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L1.h f32923b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f32924c;

        e(l.ProfileScreenViewState profileScreenViewState, L1.h hVar, LocalThemeScope localThemeScope) {
            this.f32922a = profileScreenViewState;
            this.f32923b = hVar;
            this.f32924c = localThemeScope;
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            if (C6393b.a(this.f32922a.getSavedOrderPreferencesInformation().getUpdateErrorMessage())) {
                x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), this.f32924c.getAdsSpacing().getSeven().getDp(), 0.0f, 4, null);
            } else {
                x.a.a(constrainAs.getTop(), this.f32923b.getBottom(), this.f32924c.getAdsSpacing().getSeven().getDp(), 0.0f, 4, null);
            }
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), this.f32924c.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class f implements Function3<InterfaceC15149S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.n f32925a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L1.h f32926b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L1.h f32927c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f32928d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ l.ProfileScreenViewState f32929e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.profile.a, Unit> f32930f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f32931g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f32932a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f32933b;

            a(L1.h hVar, LocalThemeScope localThemeScope) {
                this.f32932a = hVar;
                this.f32933b = localThemeScope;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), this.f32932a.getBottom(), this.f32933b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), this.f32933b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), this.f32933b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
                constrainAs.r(L1.v.INSTANCE.a());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<String, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.profile.a, Unit> f32934a;

            /* JADX WARN: Multi-variable type inference failed */
            b(Function1<? super com.meijer.mobile.accounts.ux.profile.a, Unit> function1) {
                this.f32934a = function1;
            }

            public final void a(String updatedSubstitutionPreference, int i10) {
                Intrinsics.j(updatedSubstitutionPreference, "updatedSubstitutionPreference");
                this.f32934a.invoke(new a.OnFormFieldChange(new AbstractC5695e.GrocerySubstitution(null, updatedSubstitutionPreference, i10, 1, null)));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num) {
                a(str, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function1<Bi.n0, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC15149S f32935a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f32936b;

            c(InterfaceC15149S interfaceC15149S, String str) {
                this.f32935a = interfaceC15149S;
                this.f32936b = str;
            }

            public final void a(Bi.n0 AdsDropdown) {
                Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
                AdsDropdown.d(this.f32935a.getLabels().getLabel(), this.f32936b);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Bi.n0 n0Var) {
                a(n0Var);
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        f(L1.n nVar, L1.h hVar, L1.h hVar2, LocalThemeScope localThemeScope, l.ProfileScreenViewState profileScreenViewState, Function1<? super com.meijer.mobile.accounts.ux.profile.a, Unit> function1, String str) {
            this.f32925a = nVar;
            this.f32926b = hVar;
            this.f32927c = hVar2;
            this.f32928d = localThemeScope;
            this.f32929e = profileScreenViewState;
            this.f32930f = function1;
            this.f32931g = str;
        }

        public final void a(InterfaceC15149S Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1745872142, i10, -1, "com.meijer.mobile.accounts.ux.composables.profile.edit.MainContent.<anonymous>.<anonymous> (EditOrderPreferencesContent.kt:152)");
            }
            L1.n nVar = this.f32925a;
            Modifier.Companion companion = Modifier.INSTANCE;
            L1.h hVar = this.f32926b;
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f32927c) | composer.D(this.f32928d);
            L1.h hVar2 = this.f32927c;
            LocalThemeScope localThemeScope = this.f32928d;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new a(hVar2, localThemeScope);
                composer.t(objB);
            }
            composer.P();
            Modifier modifierF = C18370z.f(nVar.k(companion, hVar, (Function1) objB), "grocery_subs_drop_down", null, 2, null);
            String selectedSubstitutionPreference = this.f32929e.getUnsavedOrderPreferencesInformation().getGrocerySubstitution().getSelectedSubstitutionPreference();
            if (selectedSubstitutionPreference == null) {
                selectedSubstitutionPreference = "";
            }
            List<String> listI = this.f32929e.getSavedOrderPreferencesInformation().i();
            q1.f.Dropdown dropdownB = Bi.m0.b(Assemble.getInputFields(), false, false, false, false, false, null, 63, null);
            LocalThemeScope localThemeScope2 = this.f32928d;
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f32930f);
            Function1<com.meijer.mobile.accounts.ux.profile.a, Unit> function1 = this.f32930f;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new b(function1);
                composer.t(objB2);
            }
            Function2 function2 = (Function2) objB2;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(Assemble) | composer.V(this.f32931g);
            String str = this.f32931g;
            Object objB3 = composer.B();
            if (zD || objB3 == Composer.INSTANCE.a()) {
                objB3 = new c(Assemble, str);
                composer.t(objB3);
            }
            composer.P();
            C2962v.v(localThemeScope2, modifierF, selectedSubstitutionPreference, dropdownB, listI, function2, (Function1) objB3, composer, LocalThemeScope.f17314g | (q1.f.Dropdown.f142250m << 9), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15149S interfaceC15149S, Composer composer, Integer num) {
            a(interfaceC15149S, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class g implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L1.n f32937a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L1.h f32938b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L1.h f32939c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f32940d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ l.ProfileScreenViewState f32941e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f32942f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.profile.a, Unit> f32943g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f32944h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f32945i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function1<C4010g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L1.h f32946a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f32947b;

            a(L1.h hVar, LocalThemeScope localThemeScope) {
                this.f32946a = hVar;
                this.f32947b = localThemeScope;
            }

            public final void a(C4010g constrainAs) {
                Intrinsics.j(constrainAs, "$this$constrainAs");
                x.a.a(constrainAs.getTop(), this.f32946a.getBottom(), this.f32947b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
                D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), this.f32947b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
                D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), this.f32947b.getAdsSpacing().getFive().getDp(), 0.0f, 4, null);
                constrainAs.r(L1.v.INSTANCE.a());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
                a(c4010g);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function1<InterfaceC5834y, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5914o f32948a;

            b(InterfaceC5914o interfaceC5914o) {
                this.f32948a = interfaceC5914o;
            }

            public final void a(InterfaceC5834y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                InterfaceC5914o.l(this.f32948a, false, 1, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5834y interfaceC5834y) {
                a(interfaceC5834y);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements Function1<String, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.profile.a, Unit> f32949a;

            /* JADX WARN: Multi-variable type inference failed */
            c(Function1<? super com.meijer.mobile.accounts.ux.profile.a, Unit> function1) {
                this.f32949a = function1;
            }

            public final void a(String updatedVehicleDescription) {
                Intrinsics.j(updatedVehicleDescription, "updatedVehicleDescription");
                this.f32949a.invoke(new a.OnFormFieldChange(new AbstractC5695e.VehicleDescription(null, updatedVehicleDescription, 1, null)));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                a(str);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class d implements Function1<H1, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC15153W f32950a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f32951b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f32952c;

            d(InterfaceC15153W interfaceC15153W, String str, String str2) {
                this.f32950a = interfaceC15153W;
                this.f32951b = str;
                this.f32952c = str2;
            }

            public final void a(H1 AdsInputField) {
                Intrinsics.j(AdsInputField, "$this$AdsInputField");
                AdsInputField.i(this.f32950a.getLabels().getPlaceholder(), this.f32951b);
                AdsInputField.d(this.f32950a.getLabels().getLabel(), this.f32952c);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(H1 h12) {
                a(h12);
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        g(L1.n nVar, L1.h hVar, L1.h hVar2, LocalThemeScope localThemeScope, l.ProfileScreenViewState profileScreenViewState, InterfaceC5914o interfaceC5914o, Function1<? super com.meijer.mobile.accounts.ux.profile.a, Unit> function1, String str, String str2) {
            this.f32937a = nVar;
            this.f32938b = hVar;
            this.f32939c = hVar2;
            this.f32940d = localThemeScope;
            this.f32941e = profileScreenViewState;
            this.f32942f = interfaceC5914o;
            this.f32943g = function1;
            this.f32944h = str;
            this.f32945i = str2;
        }

        public final void a(InterfaceC15153W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1718083337, i10, -1, "com.meijer.mobile.accounts.ux.composables.profile.edit.MainContent.<anonymous>.<anonymous> (EditOrderPreferencesContent.kt:182)");
            }
            L1.n nVar = this.f32937a;
            Modifier.Companion companion = Modifier.INSTANCE;
            L1.h hVar = this.f32938b;
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f32939c) | composer.D(this.f32940d);
            L1.h hVar2 = this.f32939c;
            LocalThemeScope localThemeScope = this.f32940d;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new a(hVar2, localThemeScope);
                composer.t(objB);
            }
            composer.P();
            Modifier modifierK = nVar.k(companion, hVar, (Function1) objB);
            String description = this.f32941e.getUnsavedOrderPreferencesInformation().getVehicleDescription().getDescription();
            if (description == null) {
                description = "";
            }
            q1.f.TextInput textInput = Assemble.getInputFields().getDefault();
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, 0, androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 119, null);
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(this.f32942f);
            InterfaceC5914o interfaceC5914o = this.f32942f;
            Object objB2 = composer.B();
            if (zD || objB2 == Composer.INSTANCE.a()) {
                objB2 = new b(interfaceC5914o);
                composer.t(objB2);
            }
            composer.P();
            q1.f.TextInput textInputY = q1.f.TextInput.y(textInput, null, false, null, null, null, keyboardOptions, new C5835z((Function1) objB2, null, null, null, null, null, 62, null), false, 0, null, null, null, 3999, null);
            LocalThemeScope localThemeScope2 = this.f32940d;
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f32943g);
            Function1<com.meijer.mobile.accounts.ux.profile.a, Unit> function1 = this.f32943g;
            Object objB3 = composer.B();
            if (zV2 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new c(function1);
                composer.t(objB3);
            }
            Function1 function12 = (Function1) objB3;
            composer.P();
            composer.startReplaceGroup(-1746271574);
            boolean zD2 = composer.D(Assemble) | composer.V(this.f32944h) | composer.V(this.f32945i);
            String str = this.f32944h;
            String str2 = this.f32945i;
            Object objB4 = composer.B();
            if (zD2 || objB4 == Composer.INSTANCE.a()) {
                objB4 = new d(Assemble, str, str2);
                composer.t(objB4);
            }
            composer.P();
            C2832m0.i(localThemeScope2, description, textInputY, modifierK, function12, (Function1) objB4, composer, LocalThemeScope.f17314g | (q1.f.TextInput.f142293m << 6), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            a(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(InterfaceC5914o interfaceC5914o) {
        InterfaceC5914o.l(interfaceC5914o, false, 1, null);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ki.LocalThemeScope r45, final com.meijer.mobile.accounts.ux.profile.l.ProfileScreenViewState r46, androidx.compose.ui.Modifier r47, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.profile.a, kotlin.Unit> r48, androidx.compose.runtime.Composer r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Rh.p0.g(Ki.M, com.meijer.mobile.accounts.ux.profile.l$e, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, l.ProfileScreenViewState profileScreenViewState, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, profileScreenViewState, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(Function1 function1) {
        function1.invoke(a.C1352a.f95559a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Function1 function1) {
        function1.invoke(a.p.f95578a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(Function1 function1) {
        function1.invoke(a.C1352a.f95559a);
        return Unit.f143329a;
    }

    private static final void m(final LocalThemeScope localThemeScope, final l.ProfileScreenViewState profileScreenViewState, final String str, final InterfaceC5914o interfaceC5914o, final String str2, final String str3, final Function1<? super com.meijer.mobile.accounts.ux.profile.a, Unit> function1, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1456692712);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(profileScreenViewState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.V(str) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(interfaceC5914o) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.V(str2) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.V(str3) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= composerStartRestartGroup.D(function1) ? 1048576 : 524288;
        }
        if ((599187 & i11) == 599186 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1456692712, i11, -1, "com.meijer.mobile.accounts.ux.composables.profile.edit.MainContent (EditOrderPreferencesContent.kt:112)");
            }
            Modifier modifierF = androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-270267587);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new L1.A();
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.U();
            L1.A a10 = (L1.A) objB;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = new L1.n();
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.U();
            L1.n nVar = (L1.n) objB2;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == companion.a()) {
                objB3 = t1.e(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.U();
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5872l0) objB3, a10, composerStartRestartGroup, 4544);
            androidx.compose.ui.layout.A.a(C16819m.d(modifierF, false, new a(a10), 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new b(nVar, 6, pairH.b(), profileScreenViewState, localThemeScope, function1, str, interfaceC5914o, str2, str3)), pairH.a(), composerStartRestartGroup, 48, 0);
            composer2 = composerStartRestartGroup;
            composer2.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Rh.o0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return p0.n(localThemeScope, profileScreenViewState, str, interfaceC5914o, str2, str3, function1, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, l.ProfileScreenViewState profileScreenViewState, String str, InterfaceC5914o interfaceC5914o, String str2, String str3, Function1 function1, int i10, Composer composer, int i11) {
        m(localThemeScope, profileScreenViewState, str, interfaceC5914o, str2, str3, function1, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }
}
