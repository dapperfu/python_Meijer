package Lh;

import Ji.C;
import Ji.LocalThemeScope;
import Lh.B;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5763f;
import androidx.compose.ui.focus.InterfaceC5772o;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.a;
import ck.C6408b;
import j0.C14801J;
import ji.DefaultTextInputs;
import ji.InterfaceC14919W;
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
import zi.C18504m0;
import zi.H1;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0095\u0001\u0010\u0015\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00062\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013H\u0001¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0019²\u0006\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "label", "pin", "placeHolder", "tooltipContentDescription", "", "isHomeStoreSet", "Landroidx/compose/ui/focus/y;", "focusRequester", "Landroidx/compose/ui/Modifier;", "modifier", "Lak/a;", "errorMessage", "labelContentDescription", "showErrorIcon", "Lkotlin/Function1;", "", "onValueChange", "Lkotlin/Function0;", "onInfoTooltipClicked", "d", "(LJi/M;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/focus/y;Landroidx/compose/ui/Modifier;Lak/a;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "lastAction", "option", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class B {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f18103a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f18104b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f18105c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f18106d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f18107e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f18108f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f18109g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f18110h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f18111i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f18112j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f18113k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f18114l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f18115m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f18116n;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Lh.B$a$a, reason: collision with other inner class name */
        static final class C0305a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f18117a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f18118b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f18119c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f18120d;

            C0305a(boolean z10, LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W, AbstractC5607a abstractC5607a) {
                this.f18117a = z10;
                this.f18118b = localThemeScope;
                this.f18119c = interfaceC14919W;
                this.f18120d = abstractC5607a;
            }

            public final void a(Composer composer, int i10) {
                Composer composer2;
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-501911918, i10, -1, "com.meijer.mobile.accounts.ux.composables.createaccount.CreateAccountPinInputField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreateAccountPinInputField.kt:108)");
                }
                boolean z10 = this.f18117a;
                LocalThemeScope localThemeScope = this.f18118b;
                InterfaceC14919W interfaceC14919W = this.f18119c;
                AbstractC5607a abstractC5607a = this.f18120d;
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
                composer.startReplaceGroup(957163126);
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
        a(AbstractC5607a abstractC5607a, androidx.compose.ui.focus.y yVar, boolean z10, InterfaceC5772o interfaceC5772o, LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1, String str2, String str3, String str4, String str5, Function0<Unit> function0, boolean z11) {
            this.f18103a = abstractC5607a;
            this.f18104b = yVar;
            this.f18105c = z10;
            this.f18106d = interfaceC5772o;
            this.f18107e = localThemeScope;
            this.f18108f = str;
            this.f18109g = modifier;
            this.f18110h = function1;
            this.f18111i = str2;
            this.f18112j = str3;
            this.f18113k = str4;
            this.f18114l = str5;
            this.f18115m = function0;
            this.f18116n = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextInput k(androidx.compose.ui.focus.y yVar, InterfaceC14919W interfaceC14919W, boolean z10, final InterfaceC5772o interfaceC5772o, q1.f.TextInput template) {
            Intrinsics.j(template, "template");
            Modifier modifierThen = template.getModifier().then(androidx.compose.ui.focus.A.a(Modifier.INSTANCE, yVar));
            z1.G g10 = new z1.G((char) 0, 1, null);
            KeyboardOptions keyboardOptions = interfaceC14919W.getInputFields().getDefault().getKeyboardOptions();
            int iD = KeyboardType.INSTANCE.d();
            a.Companion companion = androidx.compose.ui.text.input.a.INSTANCE;
            return q1.f.TextInput.y(template, modifierThen, false, null, null, g10, KeyboardOptions.c(keyboardOptions, 0, null, iD, z10 ? companion.b() : companion.d(), null, null, null, 115, null), new C5693z(new Function1() { // from class: Lh.z
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return B.a.l(interfaceC5772o, (InterfaceC5692y) obj);
                }
            }, null, new Function1() { // from class: Lh.A
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return B.a.o(interfaceC5772o, (InterfaceC5692y) obj);
                }
            }, null, null, null, 58, null), false, 0, null, null, null, 3982, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC5772o interfaceC5772o, InterfaceC5692y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            InterfaceC5772o.l(interfaceC5772o, false, 1, null);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(InterfaceC5772o interfaceC5772o, InterfaceC5692y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            interfaceC5772o.e(C5763f.INSTANCE.a());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(InterfaceC14919W interfaceC14919W, String str, final String str2, String str3, AbstractC5607a abstractC5607a, final String str4, final Function0 function0, boolean z10, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.i(interfaceC14919W.getLabels().getPlaceholder(), str);
            AdsInputField.d(q1.Label.y(interfaceC14919W.getLabels().getLabel(), C16705m.d(interfaceC14919W.getLabels().getLabel().getModifier(), false, new Function1() { // from class: Lh.x
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return B.a.q(str4, str2, (r1.u) obj);
                }
            }, 1, null), null, null, null, 0, false, 0, null, null, 510, null), str2);
            AdsInputField.g(q1.h.DrawableIcon.y(interfaceC14919W.getIcons().getLabelIcon(), null, null, null, null, 0.0f, null, C18299z.f(Modifier.INSTANCE, "create_account_pin_tooltip", null, 2, null), 63, null), C.i.h.f15557d, str3, new Function0() { // from class: Lh.y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return B.a.r(function0);
                }
            });
            if (!C5608b.a(abstractC5607a)) {
                AdsInputField.f(interfaceC14919W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(-501911918, true, new C0305a(z10, localThemeScope, interfaceC14919W, abstractC5607a)));
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(String str, String str2, r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            if (str == null) {
                str = str2;
            }
            r1.s.g0(semantics, str);
            return Unit.f142422a;
        }

        public final void g(final InterfaceC14919W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-509784536, i10, -1, "com.meijer.mobile.accounts.ux.composables.createaccount.CreateAccountPinInputField.<anonymous> (CreateAccountPinInputField.kt:67)");
            }
            DefaultTextInputs inputFields = Assemble.getInputFields();
            boolean z10 = !C5608b.a(this.f18103a);
            composer.startReplaceGroup(-1224400529);
            boolean zV = composer.V(this.f18104b) | composer.D(Assemble) | composer.a(this.f18105c) | composer.D(this.f18106d);
            final androidx.compose.ui.focus.y yVar = this.f18104b;
            final boolean z11 = this.f18105c;
            final InterfaceC5772o interfaceC5772o = this.f18106d;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Lh.v
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return B.a.k(yVar, Assemble, z11, interfaceC5772o, (q1.f.TextInput) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.f.TextInput textInputF = Cr.f.f(inputFields, z10, false, false, (Function1) objB, 6, null);
            LocalThemeScope localThemeScope = this.f18107e;
            String str = this.f18108f;
            Modifier modifier = this.f18109g;
            Function1<String, Unit> function1 = this.f18110h;
            composer.startReplaceGroup(-1224400529);
            boolean zD = composer.D(Assemble) | composer.V(this.f18111i) | composer.V(this.f18112j) | composer.V(this.f18113k) | composer.V(this.f18114l) | composer.V(this.f18115m) | composer.D(this.f18103a) | composer.a(this.f18116n) | composer.D(this.f18107e);
            final String str2 = this.f18111i;
            final String str3 = this.f18113k;
            final String str4 = this.f18114l;
            final AbstractC5607a abstractC5607a = this.f18103a;
            final String str5 = this.f18112j;
            final Function0<Unit> function0 = this.f18115m;
            final boolean z12 = this.f18116n;
            final LocalThemeScope localThemeScope2 = this.f18107e;
            Object objB2 = composer.B();
            if (zD || objB2 == Composer.INSTANCE.a()) {
                Function1 function12 = new Function1() { // from class: Lh.w
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return B.a.p(Assemble, str2, str3, str4, abstractC5607a, str5, function0, z12, localThemeScope2, (H1) obj);
                    }
                };
                composer.t(function12);
                objB2 = function12;
            }
            composer.P();
            C18504m0.i(localThemeScope, str, textInputF, modifier, function1, (Function1) objB2, composer, LocalThemeScope.f15770g | (q1.f.TextInput.f140038m << 6), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            g(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011c A[PHI: r22
      0x011c: PHI (r22v9 int) = (r22v0 int), (r22v6 int), (r22v7 int) binds: [B:88:0x011a, B:98:0x0137, B:97:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(Ji.LocalThemeScope r28, final java.lang.String r29, final java.lang.String r30, final java.lang.String r31, final java.lang.String r32, final boolean r33, final androidx.compose.ui.focus.y r34, androidx.compose.ui.Modifier r35, ak.AbstractC5607a r36, java.lang.String r37, boolean r38, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r39, kotlin.jvm.functions.Function0<kotlin.Unit> r40, androidx.compose.runtime.Composer r41, final int r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.B.d(Ji.M, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, androidx.compose.ui.focus.y, androidx.compose.ui.Modifier, ak.a, java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
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
    public static final Unit g(LocalThemeScope localThemeScope, String str, String str2, String str3, String str4, boolean z10, androidx.compose.ui.focus.y yVar, Modifier modifier, AbstractC5607a abstractC5607a, String str5, boolean z11, Function1 function1, Function0 function0, int i10, int i11, int i12, Composer composer, int i13) {
        d(localThemeScope, str, str2, str3, str4, z10, yVar, modifier, abstractC5607a, str5, z11, function1, function0, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f142422a;
    }
}
