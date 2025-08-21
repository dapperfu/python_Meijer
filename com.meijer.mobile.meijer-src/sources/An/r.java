package An;

import Ai.C2832m0;
import Ai.H1;
import An.r;
import En.InputFieldDecorator;
import Ki.LocalThemeScope;
import androidx.compose.foundation.text.C5835z;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5903d;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.KeyboardType;
import com.fullstory.compose.FullStoryAnnotationsKt;
import ki.DefaultTextInputs;
import ki.InterfaceC15153W;
import ki.q1;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import z1.TransformedText;
import z1.W;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a{\u0010\u0013\u001a\u00020\u0011*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t26\u0010\u0012\u001a2\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u000bH\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017²\u0006\u000e\u0010\u000f\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "LEn/H;", "decorator", "Landroidx/compose/ui/text/input/a;", "imeAction", "Landroidx/compose/foundation/text/z;", "keyboardActions", "", "enabled", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "currentValue", "hasFocus", "", "onValueChanged", "b", "(LKi/M;Landroidx/compose/ui/Modifier;LEn/H;ILandroidx/compose/foundation/text/z;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "displayError", "phoneNumberInput", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class r {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f1609a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f1610b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f1611c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f1612d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<String, Boolean, Unit> f1613e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C5835z f1614f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f1615g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f1616h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f1617i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f1618j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f1619k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f1620l;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: An.r$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0038a implements W, FunctionAdapter {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Jh.H f1621a;

            C0038a(Jh.H h10) {
                this.f1621a = h10;
            }

            @Override // z1.W
            public final TransformedText a(AnnotatedString p02) {
                Intrinsics.j(p02, "p0");
                return this.f1621a.a(p02);
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof W) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new FunctionReferenceImpl(1, this.f1621a, Jh.H.class, "formatter", "formatter(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f1622a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15153W f1623b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f1624c;

            b(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W, String str) {
                this.f1622a = localThemeScope;
                this.f1623b = interfaceC15153W;
                this.f1624c = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-708218899, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.AddressDetailPhoneNumberField.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressDetailPhoneNumberField.kt:110)");
                }
                si.j.h(this.f1622a, this.f1623b.getLabels().getInfoBlockMessage(), this.f1624c, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
        a(LocalThemeScope localThemeScope, String str, boolean z10, int i10, Function2<? super String, ? super Boolean, Unit> function2, C5835z c5835z, String str2, InterfaceC5872l0<String> interfaceC5872l0, androidx.compose.ui.focus.y yVar, InterfaceC5872l0<Boolean> interfaceC5872l02, InterfaceC5872l0<Boolean> interfaceC5872l03, InterfaceC5872l0<String> interfaceC5872l04) {
            this.f1609a = localThemeScope;
            this.f1610b = str;
            this.f1611c = z10;
            this.f1612d = i10;
            this.f1613e = function2;
            this.f1614f = c5835z;
            this.f1615g = str2;
            this.f1616h = interfaceC5872l0;
            this.f1617i = yVar;
            this.f1618j = interfaceC5872l02;
            this.f1619k = interfaceC5872l03;
            this.f1620l = interfaceC5872l04;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextInput f(int i10, androidx.compose.ui.focus.y yVar, boolean z10, C5835z c5835z, final Function2 function2, final InterfaceC5872l0 interfaceC5872l0, final InterfaceC5872l0 interfaceC5872l02, final InterfaceC5872l0 interfaceC5872l03, q1.f.TextInput template) {
            Intrinsics.j(template, "template");
            return q1.f.TextInput.y(template, T0.a.a(C5903d.a(androidx.compose.ui.focus.A.a(FullStoryAnnotationsKt.fsMask(template.getModifier()), yVar), new Function1() { // from class: An.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return r.a.g(function2, interfaceC5872l0, interfaceC5872l02, interfaceC5872l03, (androidx.compose.ui.focus.E) obj);
                }
            }), z10 ? 1.0f : 0.8f), false, null, null, new C0038a(Jh.H.f15755a), new KeyboardOptions(0, null, KeyboardType.INSTANCE.g(), i10, null, null, null, 115, null), c5835z, true, 0, null, null, null, 3854, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Function2 function2, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, InterfaceC5872l0 interfaceC5872l03, androidx.compose.ui.focus.E onFocusChanged) {
            Intrinsics.j(onFocusChanged, "onFocusChanged");
            r.h(interfaceC5872l0, onFocusChanged.a());
            if (onFocusChanged.b()) {
                r.j(interfaceC5872l02, true);
            }
            if (!onFocusChanged.a()) {
                function2.invoke(r.c(interfaceC5872l03), Boolean.FALSE);
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, String value) {
            Intrinsics.j(value, "value");
            if (value.length() <= 10) {
                r.f(interfaceC5872l0, value);
                r.d(interfaceC5872l02, value);
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC15153W interfaceC15153W, String str, String str2, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC15153W.getLabels().getLabel(), str);
            if (str2 != null && !StringsKt.s0(str2)) {
                AdsInputField.e(interfaceC15153W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(-708218899, true, new b(localThemeScope, interfaceC15153W, str2)));
            }
            return Unit.f143329a;
        }

        public final void e(final InterfaceC15153W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(896715927, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.AddressDetailPhoneNumberField.<anonymous>.<anonymous> (AddressDetailPhoneNumberField.kt:70)");
            }
            LocalThemeScope localThemeScope = this.f1609a;
            String strC = r.c(this.f1616h);
            DefaultTextInputs inputFields = Assemble.getInputFields();
            String str = this.f1610b;
            boolean z10 = !(str == null || StringsKt.s0(str));
            boolean z11 = !this.f1611c;
            composer.startReplaceGroup(-1224400529);
            boolean zD = composer.d(this.f1612d) | composer.V(this.f1613e) | composer.a(this.f1611c) | composer.V(this.f1614f);
            final int i11 = this.f1612d;
            final androidx.compose.ui.focus.y yVar = this.f1617i;
            final boolean z12 = this.f1611c;
            final C5835z c5835z = this.f1614f;
            final Function2<String, Boolean, Unit> function2 = this.f1613e;
            final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f1618j;
            final InterfaceC5872l0<Boolean> interfaceC5872l02 = this.f1619k;
            final InterfaceC5872l0<String> interfaceC5872l03 = this.f1616h;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                Function1 function1 = new Function1() { // from class: An.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return r.a.f(i11, yVar, z12, c5835z, function2, interfaceC5872l0, interfaceC5872l02, interfaceC5872l03, (q1.f.TextInput) obj);
                    }
                };
                composer.t(function1);
                objB = function1;
            }
            composer.P();
            q1.f.TextInput textInputF = Cr.f.f(inputFields, z10, false, z11, (Function1) objB, 2, null);
            composer.startReplaceGroup(-1633490746);
            final InterfaceC5872l0<String> interfaceC5872l04 = this.f1616h;
            final InterfaceC5872l0<String> interfaceC5872l05 = this.f1620l;
            Object objB2 = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB2 == companion.a()) {
                objB2 = new Function1() { // from class: An.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return r.a.k(interfaceC5872l04, interfaceC5872l05, (String) obj);
                    }
                };
                composer.t(objB2);
            }
            Function1 function12 = (Function1) objB2;
            composer.P();
            composer.startReplaceGroup(-1224400529);
            boolean zD2 = composer.D(Assemble) | composer.V(this.f1615g) | composer.V(this.f1610b) | composer.D(this.f1609a);
            final String str2 = this.f1615g;
            final String str3 = this.f1610b;
            final LocalThemeScope localThemeScope2 = this.f1609a;
            Object objB3 = composer.B();
            if (zD2 || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: An.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return r.a.l(Assemble, str2, str3, localThemeScope2, (H1) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C2832m0.i(localThemeScope, strC, textInputF, null, function12, (Function1) objB3, composer, LocalThemeScope.f17314g | 24576 | (q1.f.TextInput.f142293m << 6), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            e(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(Ki.LocalThemeScope r27, androidx.compose.ui.Modifier r28, final En.InputFieldDecorator r29, int r30, androidx.compose.foundation.text.C5835z r31, boolean r32, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: An.r.b(Ki.M, androidx.compose.ui.Modifier, En.H, int, androidx.compose.foundation.text.z, boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Modifier modifier, InputFieldDecorator inputFieldDecorator, int i10, C5835z c5835z, boolean z10, Function2 function2, int i11, int i12, Composer composer, int i13) {
        b(localThemeScope, modifier, inputFieldDecorator, i10, c5835z, z10, function2, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }

    private static final boolean g(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    private static final boolean i(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }
}
