package Mh;

import Ai.H1;
import Ki.C;
import Ki.LocalThemeScope;
import Mh.n0;
import androidx.compose.foundation.layout.C5800d;
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
import androidx.compose.ui.focus.InterfaceC5914o;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.C6034t0;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import bk.C6393b;
import dk.C13698b;
import j0.C14889J;
import ki.InterfaceC15153W;
import ki.L0;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qi.C16671b;
import r1.C16819m;
import yr.C18370z;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u008d\u0001\u0010\u0014\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012H\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018²\u0006\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "label", "zipCode", "placeHolder", "tooltipContentDescription", "Landroidx/compose/ui/focus/y;", "focusRequester", "Landroidx/compose/ui/Modifier;", "modifier", "Lbk/a;", "errorMessage", "labelContentDescription", "", "showErrorIcon", "Lkotlin/Function1;", "", "onValueChange", "Lkotlin/Function0;", "onInfoTooltipClicked", "d", "(LKi/M;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/focus/y;Landroidx/compose/ui/Modifier;Lbk/a;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "lastAction", "option", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class n0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f20109a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f20110b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f20111c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f20112d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f20113e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f20114f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f20115g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f20116h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f20117i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f20118j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f20119k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f20120l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f20121m;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Mh.n0$a$a, reason: collision with other inner class name */
        static final class C0349a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f20122a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f20123b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC15153W f20124c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f20125d;

            C0349a(boolean z10, LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W, AbstractC6392a abstractC6392a) {
                this.f20122a = z10;
                this.f20123b = localThemeScope;
                this.f20124c = interfaceC15153W;
                this.f20125d = abstractC6392a;
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
                boolean z10 = this.f20122a;
                LocalThemeScope localThemeScope = this.f20123b;
                InterfaceC15153W interfaceC15153W = this.f20124c;
                AbstractC6392a abstractC6392a = this.f20125d;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
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
                D1.c(composerA, measurePolicyB, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14889J c14889j = C14889J.f139620a;
                composer.startReplaceGroup(2144352);
                if (z10) {
                    composer2 = composer;
                    C16671b.b(localThemeScope, interfaceC15153W.getIcons().getInfoBlockIcon(), C.i.e.f17096d, null, composer2, LocalThemeScope.f17314g | (q1.h.DrawableIcon.f142322h << 3) | (C.i.e.f17097e << 6), 4);
                } else {
                    composer2 = composer;
                }
                composer2.P();
                si.j.h(localThemeScope, interfaceC15153W.getLabels().getInfoBlockMessage(), C13698b.a(abstractC6392a, composer2, AbstractC6392a.f60445b), null, composer2, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                composer2.v();
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

        /* JADX WARN: Multi-variable type inference failed */
        a(AbstractC6392a abstractC6392a, androidx.compose.ui.focus.y yVar, InterfaceC5914o interfaceC5914o, LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1, String str2, String str3, String str4, String str5, Function0<Unit> function0, boolean z10) {
            this.f20109a = abstractC6392a;
            this.f20110b = yVar;
            this.f20111c = interfaceC5914o;
            this.f20112d = localThemeScope;
            this.f20113e = str;
            this.f20114f = modifier;
            this.f20115g = function1;
            this.f20116h = str2;
            this.f20117i = str3;
            this.f20118j = str4;
            this.f20119k = str5;
            this.f20120l = function0;
            this.f20121m = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextInput g(androidx.compose.ui.focus.y yVar, InterfaceC15153W interfaceC15153W, final InterfaceC5914o interfaceC5914o, q1.f.TextInput template) {
            Intrinsics.j(template, "template");
            return q1.f.TextInput.y(template, template.getModifier().then(androidx.compose.ui.focus.A.a(Modifier.INSTANCE, yVar)), false, null, null, null, KeyboardOptions.c(interfaceC15153W.getInputFields().getDefault().getKeyboardOptions(), 0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null), new C5835z(new Function1() { // from class: Mh.k0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return n0.a.k(interfaceC5914o, (InterfaceC5834y) obj);
                }
            }, null, null, null, null, null, 62, null), false, 0, null, null, null, 3998, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC5914o interfaceC5914o, InterfaceC5834y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            InterfaceC5914o.l(interfaceC5914o, false, 1, null);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC15153W interfaceC15153W, String str, final String str2, String str3, AbstractC6392a abstractC6392a, final String str4, final Function0 function0, boolean z10, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.i(interfaceC15153W.getLabels().getPlaceholder(), str);
            AdsInputField.d(q1.Label.y(interfaceC15153W.getLabels().getLabel(), C16819m.d(interfaceC15153W.getLabels().getLabel().getModifier(), false, new Function1() { // from class: Mh.l0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return n0.a.o(str4, str2, (r1.u) obj);
                }
            }, 1, null), null, null, null, 0, false, 0, null, null, 510, null), str2);
            AdsInputField.g(q1.h.DrawableIcon.y(interfaceC15153W.getIcons().getLabelIcon(), null, null, null, null, 0.0f, null, C18370z.f(Modifier.INSTANCE, "create_account_zip_code_tooltip", null, 2, null), 63, null), C.i.h.f17101d, str3, new Function0() { // from class: Mh.m0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n0.a.p(function0);
                }
            });
            if (!C6393b.a(abstractC6392a)) {
                AdsInputField.e(interfaceC15153W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(-1915194628, true, new C0349a(z10, localThemeScope, interfaceC15153W, abstractC6392a)));
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(String str, String str2, r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            if (str == null) {
                str = str2;
            }
            r1.s.g0(semantics, str);
            return Unit.f143329a;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void f(final ki.InterfaceC15153W r20, androidx.compose.runtime.Composer r21, int r22) {
            /*
                Method dump skipped, instructions count: 269
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Mh.n0.a.f(ki.W, androidx.compose.runtime.Composer, int):void");
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            f(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(Function0 function0) {
            function0.invoke();
            return Unit.f143329a;
        }
    }

    public static final void d(LocalThemeScope localThemeScope, final String label, final String zipCode, final String placeHolder, final String tooltipContentDescription, final androidx.compose.ui.focus.y focusRequester, Modifier modifier, AbstractC6392a abstractC6392a, String str, boolean z10, Function1<? super String, Unit> function1, Function0<Unit> function0, Composer composer, final int i10, final int i11, final int i12) {
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
        final AbstractC6392a abstractC6392a2;
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
            i19 = (i10 & 16777216) == 0 ? composerStartRestartGroup.V(abstractC6392a) : composerStartRestartGroup.D(abstractC6392a) ? 8388608 : 4194304;
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
            abstractC6392a2 = abstractC6392a;
            z11 = z10;
        } else {
            Modifier modifier5 = i17 != 0 ? Modifier.INSTANCE : modifier2;
            AbstractC6392a abstractC6392a3 = i18 != 0 ? null : abstractC6392a;
            String str4 = i20 == 0 ? str2 : null;
            boolean z12 = i21 != 0 ? false : z10;
            if (i14 != 0) {
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objB = composerStartRestartGroup.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: Mh.f0
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
                    objB2 = new Function0() { // from class: Mh.g0
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
            InterfaceC5914o interfaceC5914o = (InterfaceC5914o) composerStartRestartGroup.o(C6034t0.h());
            L0 l02 = L0.f141930a;
            composer2 = composerStartRestartGroup;
            int i25 = i13;
            AbstractC6392a abstractC6392a4 = abstractC6392a3;
            Function1<? super String, Unit> function14 = function12;
            str3 = str4;
            Modifier modifier6 = modifier3;
            a aVar = new a(abstractC6392a4, focusRequester, interfaceC5914o, localThemeScope, zipCode, modifier6, function14, placeHolder, str3, label, tooltipContentDescription, function02, z12);
            localThemeScope2 = localThemeScope;
            Ki.Q.e(localThemeScope2, l02, ComposableLambdaKt.c(-1923067246, true, aVar, composer2, 54), composer2, LocalThemeScope.f17314g | 384 | (i25 & 14) | (L0.f141931b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            abstractC6392a2 = abstractC6392a4;
            function13 = function14;
            z11 = z12;
            modifier4 = modifier6;
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Mh.h0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return n0.g(localThemeScope2, label, zipCode, placeHolder, tooltipContentDescription, focusRequester, modifier4, abstractC6392a2, str3, z11, function13, function02, i10, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(String it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, String str, String str2, String str3, String str4, androidx.compose.ui.focus.y yVar, Modifier modifier, AbstractC6392a abstractC6392a, String str5, boolean z10, Function1 function1, Function0 function0, int i10, int i11, int i12, Composer composer, int i13) {
        d(localThemeScope, str, str2, str3, str4, yVar, modifier, abstractC6392a, str5, z10, function1, function0, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f143329a;
    }
}
