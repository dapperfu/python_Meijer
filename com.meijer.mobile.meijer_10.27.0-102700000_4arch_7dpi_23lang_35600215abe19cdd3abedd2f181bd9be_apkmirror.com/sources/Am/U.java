package Am;

import Am.U;
import Ji.C;
import Ji.LocalThemeScope;
import android.text.InputFilter;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.text.C5693z;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
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
import kotlin.text.StringsKt;
import pi.C16307b;
import r1.C16705m;
import zi.C18504m0;
import zi.H1;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0093\u0001\u0010\u0014\u001a\u00020\u0012*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0019²\u0006\u000e\u0010\u0017\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "caption", "emailInfo", "contentDesc", "Landroidx/compose/foundation/text/A;", "keyboardOptions", "Landroidx/compose/foundation/text/z;", "keyboardActions", "Lz1/W;", "visualTransformation", "initialTextValue", "error", "Landroid/text/InputFilter$LengthFilter;", "lengthFilter", "Lkotlin/Function1;", "", "onTextChanged", "c", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/foundation/text/A;Landroidx/compose/foundation/text/z;Lz1/W;Ljava/lang/String;Ljava/lang/String;Landroid/text/InputFilter$LengthFilter;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "", "isError", "email", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class U {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<String> f830a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f831b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f832c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f833d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ z1.W f834e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ KeyboardOptions f835f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C5693z f836g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f837h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InputFilter.LengthFilter f838i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f839j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f840k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f841l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f842m;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Am.U$a$a, reason: collision with other inner class name */
        static final class C0019a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f843a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f844b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f845c;

            C0019a(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W, String str) {
                this.f843a = localThemeScope;
                this.f844b = interfaceC14919W;
                this.f845c = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-279798055, i10, -1, "com.meijer.mobile.meijer.activity.checkout.composables.ContactInformationInputField.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ContactInformationInputField.kt:101)");
                }
                LocalThemeScope localThemeScope = this.f843a;
                InterfaceC14919W interfaceC14919W = this.f844b;
                String str = this.f845c;
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
                q1.h.DrawableIcon infoBlockIcon = interfaceC14919W.getIcons().getInfoBlockIcon();
                C.i.e eVar = C.i.e.f15552d;
                int i11 = LocalThemeScope.f15770g;
                C16307b.b(localThemeScope, infoBlockIcon, eVar, str, composer, (q1.h.DrawableIcon.f140067h << 3) | i11 | (C.i.e.f15553e << 6), 0);
                ri.j.h(localThemeScope, interfaceC14919W.getLabels().getInfoBlockMessage(), str, null, composer, i11 | (q1.Label.f140080j << 3), 4);
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

        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC5730l0<String> interfaceC5730l0, String str, String str2, LocalThemeScope localThemeScope, z1.W w10, KeyboardOptions keyboardOptions, C5693z c5693z, Modifier modifier, InputFilter.LengthFilter lengthFilter, Function1<? super String, Unit> function1, String str3, String str4, String str5) {
            this.f830a = interfaceC5730l0;
            this.f831b = str;
            this.f832c = str2;
            this.f833d = localThemeScope;
            this.f834e = w10;
            this.f835f = keyboardOptions;
            this.f836g = c5693z;
            this.f837h = modifier;
            this.f838i = lengthFilter;
            this.f839j = function1;
            this.f840k = str3;
            this.f841l = str4;
            this.f842m = str5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextInput g(LocalThemeScope localThemeScope, z1.W w10, KeyboardOptions keyboardOptions, C5693z c5693z, final String str, q1.f.TextInput template) {
            Intrinsics.j(template, "template");
            return q1.f.TextInput.y(template, C16705m.d(template.getModifier(), false, new Function1() { // from class: Am.S
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return U.a.k(str, (r1.u) obj);
                }
            }, 1, null), false, null, localThemeScope.getAdsTypography().getBody().getOne(), w10, keyboardOptions, c5693z, false, 0, null, null, null, 3974, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(String str, r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.x0(semantics, str);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InputFilter.LengthFilter lengthFilter, InterfaceC5730l0 interfaceC5730l0, Function1 function1, String value) {
            Intrinsics.j(value, "value");
            if (lengthFilter == null || value.length() < lengthFilter.getMax()) {
                U.f(interfaceC5730l0, function1, value);
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(InterfaceC14919W interfaceC14919W, String str, String str2, String str3, final String str4, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(q1.Label.y(interfaceC14919W.getLabels().getLabel(), C16705m.d(Modifier.INSTANCE, false, new Function1() { // from class: Am.T
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return U.a.p(str4, (r1.u) obj);
                }
            }, 1, null), null, null, null, 0, false, 0, null, null, 510, null), str);
            if (str2.length() > 0) {
                AdsInputField.e(interfaceC14919W.getLabels().getDescription(), str2);
            }
            if (str3 != null) {
                AdsInputField.f(interfaceC14919W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(-279798055, true, new C0019a(localThemeScope, interfaceC14919W, str3)));
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(String str, r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.g0(semantics, str);
            return Unit.f142422a;
        }

        public final void f(final InterfaceC14919W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1907835250, i10, -1, "com.meijer.mobile.meijer.activity.checkout.composables.ContactInformationInputField.<anonymous> (ContactInformationInputField.kt:71)");
            }
            String value = this.f830a.getValue();
            DefaultTextInputs inputFields = Assemble.getInputFields();
            String str = this.f831b;
            boolean z10 = !(str == null || StringsKt.r0(str));
            composer.startReplaceGroup(-1224400529);
            boolean zV = composer.V(this.f832c) | composer.D(this.f833d) | composer.V(this.f834e) | composer.V(this.f835f) | composer.V(this.f836g);
            final LocalThemeScope localThemeScope = this.f833d;
            final z1.W w10 = this.f834e;
            final KeyboardOptions keyboardOptions = this.f835f;
            final C5693z c5693z = this.f836g;
            final String str2 = this.f832c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Am.O
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return U.a.g(localThemeScope, w10, keyboardOptions, c5693z, str2, (q1.f.TextInput) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.f.TextInput textInputF = Cr.f.f(inputFields, z10, false, false, (Function1) objB, 6, null);
            LocalThemeScope localThemeScope2 = this.f833d;
            Modifier modifier = this.f837h;
            composer.startReplaceGroup(-1746271574);
            boolean zD = composer.D(this.f838i) | composer.V(this.f839j);
            final InputFilter.LengthFilter lengthFilter = this.f838i;
            final InterfaceC5730l0<String> interfaceC5730l0 = this.f830a;
            final Function1<String, Unit> function1 = this.f839j;
            Object objB2 = composer.B();
            if (zD || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: Am.P
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return U.a.l(lengthFilter, interfaceC5730l0, function1, (String) obj);
                    }
                };
                composer.t(objB2);
            }
            Function1 function12 = (Function1) objB2;
            composer.P();
            composer.startReplaceGroup(-1224400529);
            boolean zD2 = composer.D(Assemble) | composer.V(this.f840k) | composer.V(this.f841l) | composer.V(this.f842m) | composer.V(this.f831b) | composer.D(this.f833d);
            final String str3 = this.f841l;
            final String str4 = this.f842m;
            final String str5 = this.f831b;
            final String str6 = this.f840k;
            final LocalThemeScope localThemeScope3 = this.f833d;
            Object objB3 = composer.B();
            if (zD2 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function1() { // from class: Am.Q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return U.a.o(Assemble, str3, str4, str5, str6, localThemeScope3, (H1) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C18504m0.i(localThemeScope2, value, textInputF, modifier, function12, (Function1) objB3, composer, LocalThemeScope.f15770g | (q1.f.TextInput.f140038m << 6), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            f(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(Ji.LocalThemeScope r31, androidx.compose.ui.Modifier r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, androidx.compose.foundation.text.KeyboardOptions r36, androidx.compose.foundation.text.C5693z r37, z1.W r38, java.lang.String r39, java.lang.String r40, android.text.InputFilter.LengthFilter r41, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r42, androidx.compose.runtime.Composer r43, final int r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Am.U.c(Ji.M, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, java.lang.String, androidx.compose.foundation.text.A, androidx.compose.foundation.text.z, z1.W, java.lang.String, java.lang.String, android.text.InputFilter$LengthFilter, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(String it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Modifier modifier, String str, String str2, String str3, KeyboardOptions keyboardOptions, C5693z c5693z, z1.W w10, String str4, String str5, InputFilter.LengthFilter lengthFilter, Function1 function1, int i10, int i11, int i12, Composer composer, int i13) {
        c(localThemeScope, modifier, str, str2, str3, keyboardOptions, c5693z, w10, str4, str5, lengthFilter, function1, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(InterfaceC5730l0<String> interfaceC5730l0, Function1<? super String, Unit> function1, String str) {
        interfaceC5730l0.setValue(str);
        function1.invoke(str);
    }
}
