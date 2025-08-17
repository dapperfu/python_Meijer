package Lh;

import Ji.C;
import Ji.LocalThemeScope;
import Lh.n0;
import ak.AbstractC5607a;
import ak.C5608b;
import androidx.compose.foundation.layout.C5658d;
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
import androidx.compose.ui.focus.InterfaceC5772o;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.recyclerview.widget.RecyclerView;
import ck.C6408b;
import j0.C14801J;
import ji.InterfaceC14919W;
import ji.L0;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pi.C16307b;
import r1.C16705m;
import yr.C18299z;
import zi.H1;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u008d\u0001\u0010\u0014\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012H\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018²\u0006\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "label", "zipCode", "placeHolder", "tooltipContentDescription", "Landroidx/compose/ui/focus/y;", "focusRequester", "Landroidx/compose/ui/Modifier;", "modifier", "Lak/a;", "errorMessage", "labelContentDescription", "", "showErrorIcon", "Lkotlin/Function1;", "", "onValueChange", "Lkotlin/Function0;", "onInfoTooltipClicked", "d", "(LJi/M;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/focus/y;Landroidx/compose/ui/Modifier;Lak/a;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "lastAction", "option", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class n0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f18300a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f18301b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f18302c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f18303d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f18304e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f18305f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f18306g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f18307h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f18308i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f18309j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f18310k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f18311l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f18312m;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Lh.n0$a$a, reason: collision with other inner class name */
        static final class C0307a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f18313a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f18314b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f18315c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f18316d;

            C0307a(boolean z10, LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W, AbstractC5607a abstractC5607a) {
                this.f18313a = z10;
                this.f18314b = localThemeScope;
                this.f18315c = interfaceC14919W;
                this.f18316d = abstractC5607a;
            }

            public final void a(Composer composer, int i10) {
                Composer composer2;
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1915194628, i10, -1, "com.meijer.mobile.accounts.ux.composables.createaccount.CreateAccountZipCodeInputField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreateAccountZipCodeInputField.kt:97)");
                }
                boolean z10 = this.f18313a;
                LocalThemeScope localThemeScope = this.f18314b;
                InterfaceC14919W interfaceC14919W = this.f18315c;
                AbstractC5607a abstractC5607a = this.f18316d;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.g(), P0.e.INSTANCE.l(), composer, 0);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
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
                D1.c(composerA, measurePolicyB, companion2.e());
                D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14801J c14801j = C14801J.f139030a;
                composer.startReplaceGroup(2144352);
                if (z10) {
                    composer2 = composer;
                    C16307b.b(localThemeScope, interfaceC14919W.getIcons().getInfoBlockIcon(), C.i.e.f15552d, null, composer2, LocalThemeScope.f15770g | (q1.h.DrawableIcon.f140067h << 3) | (C.i.e.f15553e << 6), 4);
                } else {
                    composer2 = composer;
                }
                composer2.P();
                ri.j.h(localThemeScope, interfaceC14919W.getLabels().getInfoBlockMessage(), C6408b.a(abstractC5607a, composer2, AbstractC5607a.f45514b), null, composer2, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                composer2.v();
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

        /* JADX WARN: Multi-variable type inference failed */
        a(AbstractC5607a abstractC5607a, androidx.compose.ui.focus.y yVar, InterfaceC5772o interfaceC5772o, LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1, String str2, String str3, String str4, String str5, Function0<Unit> function0, boolean z10) {
            this.f18300a = abstractC5607a;
            this.f18301b = yVar;
            this.f18302c = interfaceC5772o;
            this.f18303d = localThemeScope;
            this.f18304e = str;
            this.f18305f = modifier;
            this.f18306g = function1;
            this.f18307h = str2;
            this.f18308i = str3;
            this.f18309j = str4;
            this.f18310k = str5;
            this.f18311l = function0;
            this.f18312m = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextInput g(androidx.compose.ui.focus.y yVar, InterfaceC14919W interfaceC14919W, final InterfaceC5772o interfaceC5772o, q1.f.TextInput template) {
            Intrinsics.j(template, "template");
            return q1.f.TextInput.y(template, template.getModifier().then(androidx.compose.ui.focus.A.a(Modifier.INSTANCE, yVar)), false, null, null, null, KeyboardOptions.c(interfaceC14919W.getInputFields().getDefault().getKeyboardOptions(), 0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null), new C5693z(new Function1() { // from class: Lh.k0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return n0.a.k(interfaceC5772o, (InterfaceC5692y) obj);
                }
            }, null, null, null, null, null, 62, null), false, 0, null, null, null, 3998, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC5772o interfaceC5772o, InterfaceC5692y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            InterfaceC5772o.l(interfaceC5772o, false, 1, null);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC14919W interfaceC14919W, String str, final String str2, String str3, AbstractC5607a abstractC5607a, final String str4, final Function0 function0, boolean z10, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.i(interfaceC14919W.getLabels().getPlaceholder(), str);
            AdsInputField.d(q1.Label.y(interfaceC14919W.getLabels().getLabel(), C16705m.d(interfaceC14919W.getLabels().getLabel().getModifier(), false, new Function1() { // from class: Lh.l0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return n0.a.o(str4, str2, (r1.u) obj);
                }
            }, 1, null), null, null, null, 0, false, 0, null, null, 510, null), str2);
            AdsInputField.g(q1.h.DrawableIcon.y(interfaceC14919W.getIcons().getLabelIcon(), null, null, null, null, 0.0f, null, C18299z.f(Modifier.INSTANCE, "create_account_zip_code_tooltip", null, 2, null), 63, null), C.i.h.f15557d, str3, new Function0() { // from class: Lh.m0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n0.a.p(function0);
                }
            });
            if (!C5608b.a(abstractC5607a)) {
                AdsInputField.f(interfaceC14919W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(-1915194628, true, new C0307a(z10, localThemeScope, interfaceC14919W, abstractC5607a)));
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(String str, String str2, r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            if (str == null) {
                str = str2;
            }
            r1.s.g0(semantics, str);
            return Unit.f142422a;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void f(final ji.InterfaceC14919W r20, androidx.compose.runtime.Composer r21, int r22) {
            /*
                Method dump skipped, instructions count: 269
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Lh.n0.a.f(ji.W, androidx.compose.runtime.Composer, int):void");
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            f(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }
    }

    public static final void d(LocalThemeScope localThemeScope, final String label, final String zipCode, final String placeHolder, final String tooltipContentDescription, final androidx.compose.ui.focus.y focusRequester, Modifier modifier, AbstractC5607a abstractC5607a, String str, boolean z10, Function1<? super String, Unit> function1, Function0<Unit> function0, Composer composer, final int i10, final int i11, final int i12) {
        int i13;
        Modifier modifier2;
        String str2;
        int i14;
        int i15;
        int i16;
        Function1<? super String, Unit> function12;
        final Function0<Unit> function02;
        Modifier modifier3;
        Composer composer2;
        final String str3;
        final LocalThemeScope localThemeScope2;
        final AbstractC5607a abstractC5607a2;
        final Function1<? super String, Unit> function13;
        final boolean z11;
        final Modifier modifier4;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(label, "label");
        Intrinsics.j(zipCode, "zipCode");
        Intrinsics.j(placeHolder, "placeHolder");
        Intrinsics.j(tooltipContentDescription, "tooltipContentDescription");
        Intrinsics.j(focusRequester, "focusRequester");
        Composer composerStartRestartGroup = composer.startRestartGroup(4549341);
        if ((Integer.MIN_VALUE & i12) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 1) != 0) {
            i13 |= 48;
        } else if ((i10 & 48) == 0) {
            i13 |= composerStartRestartGroup.V(label) ? 32 : 16;
        }
        if ((i12 & 2) != 0) {
            i13 |= 384;
        } else if ((i10 & 384) == 0) {
            i13 |= composerStartRestartGroup.V(zipCode) ? 256 : 128;
        }
        if ((i12 & 4) != 0) {
            i13 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i13 |= composerStartRestartGroup.V(placeHolder) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 8) != 0) {
            i13 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i13 |= composerStartRestartGroup.V(tooltipContentDescription) ? 16384 : 8192;
        }
        if ((i12 & 16) != 0) {
            i13 |= 196608;
        } else if ((i10 & 196608) == 0) {
            i13 |= composerStartRestartGroup.V(focusRequester) ? 131072 : 65536;
        }
        int i17 = i12 & 32;
        if (i17 != 0) {
            i13 |= 1572864;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i10 & 1572864) == 0) {
                i13 |= composerStartRestartGroup.V(modifier2) ? 1048576 : 524288;
            }
        }
        int i18 = i12 & 64;
        int i19 = 12582912;
        if (i18 != 0) {
            i13 |= i19;
        } else if ((i10 & 12582912) == 0) {
            i19 = (i10 & 16777216) == 0 ? composerStartRestartGroup.V(abstractC5607a) : composerStartRestartGroup.D(abstractC5607a) ? 8388608 : 4194304;
            i13 |= i19;
        }
        int i20 = i12 & 128;
        if (i20 != 0) {
            i13 |= 100663296;
            str2 = str;
        } else {
            str2 = str;
            if ((i10 & 100663296) == 0) {
                i13 |= composerStartRestartGroup.V(str2) ? 67108864 : 33554432;
            }
        }
        int i21 = i12 & 256;
        if (i21 != 0) {
            i13 |= 805306368;
        } else if ((i10 & 805306368) == 0) {
            i13 |= composerStartRestartGroup.a(z10) ? 536870912 : 268435456;
        }
        int i22 = i12 & 512;
        if (i22 != 0) {
            i15 = i11 | 6;
            i14 = i22;
        } else if ((i11 & 6) == 0) {
            i14 = i22;
            i15 = i11 | (composerStartRestartGroup.D(function1) ? 4 : 2);
        } else {
            i14 = i22;
            i15 = i11;
        }
        int i23 = i12 & 1024;
        if (i23 != 0) {
            i15 |= 48;
            i16 = i23;
        } else if ((i11 & 48) == 0) {
            i16 = i23;
            i15 |= composerStartRestartGroup.D(function0) ? 32 : 16;
        } else {
            i16 = i23;
        }
        int i24 = i15;
        if ((i13 & 306783379) == 306783378 && (i24 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            localThemeScope2 = localThemeScope;
            function13 = function1;
            function02 = function0;
            composer2 = composerStartRestartGroup;
            modifier4 = modifier2;
            str3 = str2;
            abstractC5607a2 = abstractC5607a;
            z11 = z10;
        } else {
            Modifier modifier5 = i17 != 0 ? Modifier.INSTANCE : modifier2;
            AbstractC5607a abstractC5607a3 = i18 != 0 ? null : abstractC5607a;
            String str4 = i20 == 0 ? str2 : null;
            boolean z12 = i21 != 0 ? false : z10;
            if (i14 != 0) {
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objB = composerStartRestartGroup.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: Lh.f0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return n0.e((String) obj);
                        }
                    };
                    composerStartRestartGroup.t(objB);
                }
                function12 = (Function1) objB;
                composerStartRestartGroup.P();
            } else {
                function12 = function1;
            }
            if (i16 != 0) {
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objB2 = composerStartRestartGroup.B();
                if (objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: Lh.g0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return n0.f();
                        }
                    };
                    composerStartRestartGroup.t(objB2);
                }
                composerStartRestartGroup.P();
                function02 = (Function0) objB2;
            } else {
                function02 = function0;
            }
            if (ComposerKt.M()) {
                modifier3 = modifier5;
                ComposerKt.U(4549341, i13, i24, "com.meijer.mobile.accounts.ux.composables.createaccount.CreateAccountZipCodeInputField (CreateAccountZipCodeInputField.kt:58)");
            } else {
                modifier3 = modifier5;
            }
            InterfaceC5772o interfaceC5772o = (InterfaceC5772o) composerStartRestartGroup.o(C5892t0.h());
            L0 l02 = L0.f139675a;
            composer2 = composerStartRestartGroup;
            int i25 = i13;
            AbstractC5607a abstractC5607a4 = abstractC5607a3;
            Function1<? super String, Unit> function14 = function12;
            str3 = str4;
            Modifier modifier6 = modifier3;
            a aVar = new a(abstractC5607a4, focusRequester, interfaceC5772o, localThemeScope, zipCode, modifier6, function14, placeHolder, str3, label, tooltipContentDescription, function02, z12);
            localThemeScope2 = localThemeScope;
            Ji.Q.e(localThemeScope2, l02, ComposableLambdaKt.c(-1923067246, true, aVar, composer2, 54), composer2, LocalThemeScope.f15770g | 384 | (i25 & 14) | (L0.f139676b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            abstractC5607a2 = abstractC5607a4;
            function13 = function14;
            z11 = z12;
            modifier4 = modifier6;
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Lh.h0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return n0.g(localThemeScope2, label, zipCode, placeHolder, tooltipContentDescription, focusRequester, modifier4, abstractC5607a2, str3, z11, function13, function02, i10, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(String it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f() {
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, String str, String str2, String str3, String str4, androidx.compose.ui.focus.y yVar, Modifier modifier, AbstractC5607a abstractC5607a, String str5, boolean z10, Function1 function1, Function0 function0, int i10, int i11, int i12, Composer composer, int i13) {
        d(localThemeScope, str, str2, str3, str4, yVar, modifier, abstractC5607a, str5, z10, function1, function0, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f142422a;
    }
}
