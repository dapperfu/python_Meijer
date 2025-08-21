package Er;

import Ai.C2832m0;
import Ai.H1;
import Er.n;
import Ki.C;
import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.text.C5835z;
import androidx.compose.foundation.text.InterfaceC5834y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.D1;
import androidx.compose.ui.text.input.KeyboardType;
import ki.InterfaceC15151U;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import r1.C16819m;
import r1.s;
import r1.u;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u001as\u0010\u0010\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014²\u0006\u000e\u0010\u0012\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0013\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "searchQuery", "placeholderText", "Lkotlin/Function1;", "", "onValueChange", "Lkotlin/Function0;", "onSearchSubmit", "Landroidx/compose/ui/Modifier;", "modifier", "submitContentDescription", "clearSearchContentDescription", "", "isNewAddressQualifier", "labelFor", "b", "(LKi/M;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Landroidx/compose/runtime/Composer;II)V", "lastAction", "isAddressQualifierNewUI", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class n {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC15151U, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f8436a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f8437b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f8438c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f8439d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ D1 f8440e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f8441f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f8442g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f8443h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f8444i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f8445j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f8446k;

        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z10, Modifier modifier, String str, Function0<Unit> function0, D1 d12, LocalThemeScope localThemeScope, String str2, Function1<? super String, Unit> function1, String str3, String str4, String str5) {
            this.f8436a = z10;
            this.f8437b = modifier;
            this.f8438c = str;
            this.f8439d = function0;
            this.f8440e = d12;
            this.f8441f = localThemeScope;
            this.f8442g = str2;
            this.f8443h = function1;
            this.f8444i = str3;
            this.f8445j = str4;
            this.f8446k = str5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit A(Function1 function1, String it) {
            Intrinsics.j(it, "it");
            function1.invoke(it);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit B(InterfaceC15151U interfaceC15151U, String str, String str2, String str3, String str4, final Function0 function0, final D1 d12, final Function1 function1, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.i(interfaceC15151U.getLabels().getPlaceholder(), str);
            AdsInputField.n(interfaceC15151U.getIcons().getInnerIcon(), C.a.B.f16864e, str2, new Function0() { // from class: Er.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.a.C(function0, d12);
                }
            });
            if (!StringsKt.s0(str3)) {
                AdsInputField.q0(interfaceC15151U.getIcons().getInnerIcon(), C.f.o.f17066e, str4, new Function0() { // from class: Er.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return n.a.D(function1);
                    }
                });
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit D(Function1 function1) {
            function1.invoke("");
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(String str, u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            s.g0(semantics, str);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(String str, u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            s.g0(semantics, str);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit u(Function0 function0, D1 d12, InterfaceC5834y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            function0.invoke();
            if (d12 != null) {
                d12.b();
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit v(Function1 function1, String it) {
            Intrinsics.j(it, "it");
            function1.invoke(it);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit w(InterfaceC15151U interfaceC15151U, String str, String str2, String str3, final Function0 function0, final D1 d12, final Function1 function1, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.i(interfaceC15151U.getLabels().getPlaceholder(), str);
            AdsInputField.n(interfaceC15151U.getIcons().getInnerIcon(), C.a.B.f16864e, str2, new Function0() { // from class: Er.l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.a.x(function0, d12);
                }
            });
            AdsInputField.q0(interfaceC15151U.getIcons().getInnerIcon(), C.f.o.f17066e, str3, new Function0() { // from class: Er.m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n.a.y(function1);
                }
            });
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit y(Function1 function1) {
            function1.invoke("");
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit z(Function0 function0, D1 d12, InterfaceC5834y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            function0.invoke();
            if (d12 != null) {
                d12.b();
            }
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15151U interfaceC15151U, Composer composer, Integer num) {
            r(interfaceC15151U, composer, num.intValue());
            return Unit.f143329a;
        }

        public final void r(final InterfaceC15151U Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-2060291157, i10, -1, "com.meijer.mobile.ui.common.compose.search.AcresSearchInputField.<anonymous> (AcresSearchInputField.kt:73)");
            }
            if (this.f8436a) {
                composer.startReplaceGroup(1243854852);
                Modifier modifier = this.f8437b;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f8438c);
                final String str = this.f8438c;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: Er.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return n.a.s(str, (u) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierD = C16819m.d(modifier, false, (Function1) objB, 1, null);
                q1.f.TextInput textInput = Assemble.getInputFields().getDefault();
                KeyboardOptions keyboardOptionsC = KeyboardOptions.c(KeyboardOptions.INSTANCE.a(), 0, null, KeyboardType.INSTANCE.h(), androidx.compose.ui.text.input.a.INSTANCE.g(), null, null, null, 115, null);
                composer.startReplaceGroup(-1633490746);
                boolean zV2 = composer.V(this.f8439d) | composer.V(this.f8440e);
                final Function0<Unit> function0 = this.f8439d;
                final D1 d12 = this.f8440e;
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function1() { // from class: Er.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return n.a.z(function0, d12, (InterfaceC5834y) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                q1.f.TextInput textInputY = q1.f.TextInput.y(textInput, null, false, null, null, null, keyboardOptionsC, new C5835z(null, null, null, null, (Function1) objB2, null, 47, null), false, 0, null, null, null, 3999, null);
                LocalThemeScope localThemeScope = this.f8441f;
                String str2 = this.f8442g;
                composer.startReplaceGroup(5004770);
                boolean zV3 = composer.V(this.f8443h);
                final Function1<String, Unit> function1 = this.f8443h;
                Object objB3 = composer.B();
                if (zV3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function1() { // from class: Er.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return n.a.A(function1, (String) obj);
                        }
                    };
                    composer.t(objB3);
                }
                Function1 function12 = (Function1) objB3;
                composer.P();
                composer.startReplaceGroup(-1224400529);
                boolean zD = composer.D(Assemble) | composer.V(this.f8444i) | composer.V(this.f8445j) | composer.V(this.f8439d) | composer.V(this.f8440e) | composer.V(this.f8442g) | composer.V(this.f8446k) | composer.V(this.f8443h);
                final String str3 = this.f8444i;
                final String str4 = this.f8445j;
                final String str5 = this.f8442g;
                final String str6 = this.f8446k;
                final Function0<Unit> function02 = this.f8439d;
                final D1 d13 = this.f8440e;
                final Function1<String, Unit> function13 = this.f8443h;
                Object objB4 = composer.B();
                if (zD || objB4 == Composer.INSTANCE.a()) {
                    objB4 = new Function1() { // from class: Er.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return n.a.B(Assemble, str3, str4, str5, str6, function02, d13, function13, (H1) obj);
                        }
                    };
                    composer.t(objB4);
                }
                composer.P();
                C2832m0.i(localThemeScope, str2, textInputY, modifierD, function12, (Function1) objB4, composer, LocalThemeScope.f17314g | (q1.f.TextInput.f142293m << 6), 0);
                composer.P();
            } else {
                composer.startReplaceGroup(1245434860);
                LocalThemeScope localThemeScope2 = this.f8441f;
                String str7 = this.f8442g;
                q1.f.TextInput textInput2 = Assemble.getInputFields().getDefault();
                Modifier modifierI = D.i(this.f8437b, this.f8441f.getAdsSpacing().getTwo().getDp());
                composer.startReplaceGroup(5004770);
                boolean zV4 = composer.V(this.f8438c);
                final String str8 = this.f8438c;
                Object objB5 = composer.B();
                if (zV4 || objB5 == Composer.INSTANCE.a()) {
                    objB5 = new Function1() { // from class: Er.h
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return n.a.t(str8, (u) obj);
                        }
                    };
                    composer.t(objB5);
                }
                composer.P();
                Modifier modifierD2 = C16819m.d(modifierI, false, (Function1) objB5, 1, null);
                KeyboardOptions keyboardOptionsC2 = KeyboardOptions.c(KeyboardOptions.INSTANCE.a(), 0, null, KeyboardType.INSTANCE.h(), androidx.compose.ui.text.input.a.INSTANCE.g(), null, null, null, 115, null);
                composer.startReplaceGroup(-1633490746);
                boolean zV5 = composer.V(this.f8439d) | composer.V(this.f8440e);
                final Function0<Unit> function03 = this.f8439d;
                final D1 d14 = this.f8440e;
                Object objB6 = composer.B();
                if (zV5 || objB6 == Composer.INSTANCE.a()) {
                    objB6 = new Function1() { // from class: Er.i
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return n.a.u(function03, d14, (InterfaceC5834y) obj);
                        }
                    };
                    composer.t(objB6);
                }
                composer.P();
                q1.f.TextInput textInputY2 = q1.f.TextInput.y(textInput2, modifierD2, false, null, null, null, keyboardOptionsC2, new C5835z(null, null, null, null, (Function1) objB6, null, 47, null), false, 0, null, null, null, 3998, null);
                composer.startReplaceGroup(5004770);
                boolean zV6 = composer.V(this.f8443h);
                final Function1<String, Unit> function14 = this.f8443h;
                Object objB7 = composer.B();
                if (zV6 || objB7 == Composer.INSTANCE.a()) {
                    objB7 = new Function1() { // from class: Er.j
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return n.a.v(function14, (String) obj);
                        }
                    };
                    composer.t(objB7);
                }
                Function1 function15 = (Function1) objB7;
                composer.P();
                composer.startReplaceGroup(-1224400529);
                boolean zD2 = composer.D(Assemble) | composer.V(this.f8444i) | composer.V(this.f8445j) | composer.V(this.f8439d) | composer.V(this.f8440e) | composer.V(this.f8446k) | composer.V(this.f8443h);
                final String str9 = this.f8444i;
                final String str10 = this.f8445j;
                final String str11 = this.f8446k;
                final Function0<Unit> function04 = this.f8439d;
                final D1 d15 = this.f8440e;
                final Function1<String, Unit> function16 = this.f8443h;
                Object objB8 = composer.B();
                if (zD2 || objB8 == Composer.INSTANCE.a()) {
                    Function1 function17 = new Function1() { // from class: Er.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return n.a.w(Assemble, str9, str10, str11, function04, d15, function16, (H1) obj);
                        }
                    };
                    composer.t(function17);
                    objB8 = function17;
                }
                composer.P();
                C2832m0.i(localThemeScope2, str7, textInputY2, null, function15, (Function1) objB8, composer, LocalThemeScope.f17314g | (q1.f.TextInput.f142293m << 6), 4);
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit C(Function0 function0, D1 d12) {
            function0.invoke();
            if (d12 != null) {
                d12.b();
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit x(Function0 function0, D1 d12) {
            function0.invoke();
            if (d12 != null) {
                d12.b();
            }
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r19, final java.lang.String r20, final java.lang.String r21, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r22, final kotlin.jvm.functions.Function0<kotlin.Unit> r23, androidx.compose.ui.Modifier r24, java.lang.String r25, java.lang.String r26, final boolean r27, final java.lang.String r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Er.n.b(Ki.M, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, boolean, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, String str, String str2, Function1 function1, Function0 function0, Modifier modifier, String str3, String str4, boolean z10, String str5, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, str, str2, function1, function0, modifier, str3, str4, z10, str5, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
