package yr;

import Ji.C;
import Ji.LocalThemeScope;
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
import ck.C6408b;
import j0.C14801J;
import java.util.List;
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
import yr.C18282h;
import zi.C18504m0;
import zi.H1;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u001a¬\u0001\u0010\u001a\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00180\u0014H\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006!²\u0006\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010 \u001a\u00020\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "initialValue", "caption", "Landroidx/compose/ui/Modifier;", "modifier", "Lz1/W;", "visualTransformation", "Landroidx/compose/foundation/text/A;", "keyboardOptions", "Lak/a;", "error", "placeHolder", "captionContentDescription", "", "showErrorIcon", "isDisabled", "", "LQ0/K;", "autofillTypes", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newValue", "", "onValueChange", "b", "(LJi/M;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lz1/W;Landroidx/compose/foundation/text/A;Lak/a;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "lastAction", "showError", "disabled", "showIcon", "input", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: yr.h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C18282h {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: yr.h$a */
    static final class a implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f171148a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f171149b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z1.W f171150c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ KeyboardOptions f171151d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f171152e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f171153f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f171154g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f171155h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f171156i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f171157j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f171158k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f171159l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f171160m;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: yr.h$a$a, reason: collision with other inner class name */
        static final class C2758a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f171161a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f171162b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f171163c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f171164d;

            C2758a(boolean z10, LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W, AbstractC5607a abstractC5607a) {
                this.f171161a = z10;
                this.f171162b = localThemeScope;
                this.f171163c = interfaceC14919W;
                this.f171164d = abstractC5607a;
            }

            public final void a(Composer composer, int i10) {
                Composer composer2;
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1298736294, i10, -1, "com.meijer.mobile.ui.common.AccountInputField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AccountInputField.kt:96)");
                }
                boolean z10 = this.f171161a;
                LocalThemeScope localThemeScope = this.f171162b;
                InterfaceC14919W interfaceC14919W = this.f171163c;
                AbstractC5607a abstractC5607a = this.f171164d;
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
                composer.startReplaceGroup(-1890613878);
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
        a(AbstractC5607a abstractC5607a, boolean z10, z1.W w10, KeyboardOptions keyboardOptions, InterfaceC5772o interfaceC5772o, LocalThemeScope localThemeScope, String str, Modifier modifier, Function1<? super String, Unit> function1, String str2, String str3, String str4, boolean z11) {
            this.f171148a = abstractC5607a;
            this.f171149b = z10;
            this.f171150c = w10;
            this.f171151d = keyboardOptions;
            this.f171152e = interfaceC5772o;
            this.f171153f = localThemeScope;
            this.f171154g = str;
            this.f171155h = modifier;
            this.f171156i = function1;
            this.f171157j = str2;
            this.f171158k = str3;
            this.f171159l = str4;
            this.f171160m = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextInput k(z1.W w10, KeyboardOptions keyboardOptions, final InterfaceC5772o interfaceC5772o, q1.f.TextInput template) {
            Intrinsics.j(template, "template");
            return q1.f.TextInput.y(template, null, false, null, null, w10, keyboardOptions, new C5693z(new Function1() { // from class: yr.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C18282h.a.l(interfaceC5772o, (InterfaceC5692y) obj);
                }
            }, null, new Function1() { // from class: yr.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C18282h.a.o(interfaceC5772o, (InterfaceC5692y) obj);
                }
            }, null, null, null, 58, null), false, 0, null, null, null, 3983, null);
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
        public static final Unit p(Function1 function1, String it) {
            Intrinsics.j(it, "it");
            function1.invoke(it);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(InterfaceC14919W interfaceC14919W, final String str, String str2, AbstractC5607a abstractC5607a, final String str3, boolean z10, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(q1.Label.y(interfaceC14919W.getLabels().getLabel(), C16705m.d(interfaceC14919W.getLabels().getLabel().getModifier(), false, new Function1() { // from class: yr.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C18282h.a.r(str3, str, (r1.u) obj);
                }
            }, 1, null), null, null, null, 0, false, 0, null, null, 510, null), str);
            if (str2 != null) {
                AdsInputField.i(interfaceC14919W.getLabels().getPlaceholder(), str2);
            }
            if (!C5608b.a(abstractC5607a)) {
                AdsInputField.f(interfaceC14919W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(1298736294, true, new C2758a(z10, localThemeScope, interfaceC14919W, abstractC5607a)));
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(String str, String str2, r1.u semantics) {
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
                ComposerKt.U(-1683220676, i10, -1, "com.meijer.mobile.ui.common.AccountInputField.<anonymous> (AccountInputField.kt:64)");
            }
            DefaultTextInputs inputFields = Assemble.getInputFields();
            boolean z10 = !C5608b.a(this.f171148a);
            boolean z11 = this.f171149b;
            composer.startReplaceGroup(-1746271574);
            boolean zV = composer.V(this.f171150c) | composer.V(this.f171151d) | composer.D(this.f171152e);
            final z1.W w10 = this.f171150c;
            final KeyboardOptions keyboardOptions = this.f171151d;
            final InterfaceC5772o interfaceC5772o = this.f171152e;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: yr.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C18282h.a.k(w10, keyboardOptions, interfaceC5772o, (q1.f.TextInput) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.f.TextInput textInputF = Cr.f.f(inputFields, z10, false, z11, (Function1) objB, 2, null);
            LocalThemeScope localThemeScope = this.f171153f;
            String str = this.f171154g;
            Modifier modifier = this.f171155h;
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f171156i);
            final Function1<String, Unit> function1 = this.f171156i;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: yr.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C18282h.a.p(function1, (String) obj);
                    }
                };
                composer.t(objB2);
            }
            Function1 function12 = (Function1) objB2;
            composer.P();
            composer.startReplaceGroup(-1224400529);
            boolean zD = composer.D(Assemble) | composer.V(this.f171157j) | composer.V(this.f171158k) | composer.V(this.f171159l) | composer.D(this.f171148a) | composer.a(this.f171160m) | composer.D(this.f171153f);
            final String str2 = this.f171158k;
            final String str3 = this.f171159l;
            final AbstractC5607a abstractC5607a = this.f171148a;
            final String str4 = this.f171157j;
            final boolean z12 = this.f171160m;
            final LocalThemeScope localThemeScope2 = this.f171153f;
            Object objB3 = composer.B();
            if (zD || objB3 == Composer.INSTANCE.a()) {
                Function1 function13 = new Function1() { // from class: yr.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C18282h.a.q(Assemble, str2, str3, abstractC5607a, str4, z12, localThemeScope2, (H1) obj);
                    }
                };
                composer.t(function13);
                objB3 = function13;
            }
            composer.P();
            C18504m0.i(localThemeScope, str, textInputF, modifier, function12, (Function1) objB3, composer, LocalThemeScope.f15770g | (q1.f.TextInput.f140038m << 6), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            g(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d8 A[PHI: r21
      0x00d8: PHI (r21v10 int) = (r21v0 int), (r21v6 int), (r21v7 int) binds: [B:69:0x00d6, B:79:0x00f3, B:78:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(Ji.LocalThemeScope r28, final java.lang.String r29, final java.lang.String r30, androidx.compose.ui.Modifier r31, z1.W r32, androidx.compose.foundation.text.KeyboardOptions r33, ak.AbstractC5607a r34, java.lang.String r35, java.lang.String r36, boolean r37, boolean r38, java.util.List<? extends Q0.K> r39, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r40, androidx.compose.runtime.Composer r41, final int r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yr.C18282h.b(Ji.M, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, z1.W, androidx.compose.foundation.text.A, ak.a, java.lang.String, java.lang.String, boolean, boolean, java.util.List, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, String str, String str2, Modifier modifier, z1.W w10, KeyboardOptions keyboardOptions, AbstractC5607a abstractC5607a, String str3, String str4, boolean z10, boolean z11, List list, Function1 function1, int i10, int i11, int i12, Composer composer, int i13) {
        b(localThemeScope, str, str2, modifier, w10, keyboardOptions, abstractC5607a, str3, str4, z10, z11, list, function1, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f142422a;
    }
}
