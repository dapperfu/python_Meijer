package An;

import Ai.C2832m0;
import Ai.H1;
import An.C2869l;
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
import androidx.compose.ui.text.input.KeyboardType;
import com.fullstory.compose.FullStoryAnnotationsKt;
import ki.DefaultTextInputs;
import ki.InterfaceC15153W;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a{\u0010\u0014\u001a\u00020\u0012*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t26\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u000bH\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017²\u0006\u000e\u0010\u000f\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0011\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "maxDigit", "LEn/H;", "decorator", "Landroidx/compose/ui/text/input/a;", "imeAction", "Landroidx/compose/foundation/text/z;", "keyboardActions", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "currentValue", "", "hasFocus", "", "onValueChanged", "b", "(LKi/M;Landroidx/compose/ui/Modifier;ILEn/H;ILandroidx/compose/foundation/text/z;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "displayError", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: An.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C2869l {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: An.l$a */
    static final class a implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f1568a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<String, Boolean, Unit> f1569b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f1570c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f1571d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C5835z f1572e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f1573f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f1574g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f1575h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f1576i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f1577j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f1578k;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: An.l$a$a, reason: collision with other inner class name */
        static final class C0037a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f1579a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15153W f1580b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f1581c;

            C0037a(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W, String str) {
                this.f1579a = localThemeScope;
                this.f1580b = interfaceC15153W;
                this.f1581c = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-54665166, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.AddressDetailNumberField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressDetailNumberField.kt:87)");
                }
                si.j.h(this.f1579a, this.f1580b.getLabels().getInfoBlockMessage(), this.f1581c, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
        a(Modifier modifier, Function2<? super String, ? super Boolean, Unit> function2, String str, int i10, C5835z c5835z, LocalThemeScope localThemeScope, int i11, String str2, InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5872l0<Boolean> interfaceC5872l02, InterfaceC5872l0<String> interfaceC5872l03) {
            this.f1568a = modifier;
            this.f1569b = function2;
            this.f1570c = str;
            this.f1571d = i10;
            this.f1572e = c5835z;
            this.f1573f = localThemeScope;
            this.f1574g = i11;
            this.f1575h = str2;
            this.f1576i = interfaceC5872l0;
            this.f1577j = interfaceC5872l02;
            this.f1578k = interfaceC5872l03;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(Function2 function2, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, InterfaceC5872l0 interfaceC5872l03, androidx.compose.ui.focus.E onFocusChanged) {
            Intrinsics.j(onFocusChanged, "onFocusChanged");
            C2869l.g(interfaceC5872l0, onFocusChanged.a());
            if (onFocusChanged.b()) {
                C2869l.i(interfaceC5872l02, true);
            }
            if (!onFocusChanged.a()) {
                function2.invoke(C2869l.c(interfaceC5872l03), Boolean.FALSE);
                if (C2869l.c(interfaceC5872l03).length() > 0) {
                    C2869l.i(interfaceC5872l02, false);
                }
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextInput g(int i10, C5835z c5835z, q1.f.TextInput template) {
            Intrinsics.j(template, "template");
            return q1.f.TextInput.y(template, null, false, null, null, null, new KeyboardOptions(0, null, KeyboardType.INSTANCE.e(), i10, null, null, null, 115, null), c5835z, true, 0, null, null, null, 3871, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(int i10, InterfaceC5872l0 interfaceC5872l0, String it) {
            Intrinsics.j(it, "it");
            if (it.length() <= i10) {
                C2869l.e(interfaceC5872l0, it);
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC15153W interfaceC15153W, String str, String str2, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC15153W.getLabels().getLabel(), str);
            if (str2 != null && !StringsKt.s0(str2)) {
                AdsInputField.e(interfaceC15153W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(-54665166, true, new C0037a(localThemeScope, interfaceC15153W, str2)));
            }
            return Unit.f143329a;
        }

        public final void e(final InterfaceC15153W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-2042157092, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.AddressDetailNumberField.<anonymous> (AddressDetailNumberField.kt:55)");
            }
            Modifier modifierFsMask = FullStoryAnnotationsKt.fsMask(this.f1568a);
            composer.startReplaceGroup(-1224400529);
            boolean zV = composer.V(this.f1569b);
            final Function2<String, Boolean, Unit> function2 = this.f1569b;
            final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f1576i;
            final InterfaceC5872l0<Boolean> interfaceC5872l02 = this.f1577j;
            final InterfaceC5872l0<String> interfaceC5872l03 = this.f1578k;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: An.h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2869l.a.f(function2, interfaceC5872l0, interfaceC5872l02, interfaceC5872l03, (androidx.compose.ui.focus.E) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Modifier modifierA = C5903d.a(modifierFsMask, (Function1) objB);
            String strC = C2869l.c(this.f1578k);
            DefaultTextInputs inputFields = Assemble.getInputFields();
            String str = this.f1570c;
            boolean z10 = !(str == null || StringsKt.s0(str));
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.d(this.f1571d) | composer.V(this.f1572e);
            final int i11 = this.f1571d;
            final C5835z c5835z = this.f1572e;
            Object objB2 = composer.B();
            if (zD || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: An.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2869l.a.g(i11, c5835z, (q1.f.TextInput) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            q1.f.TextInput textInputF = Cr.f.f(inputFields, z10, false, false, (Function1) objB2, 6, null);
            LocalThemeScope localThemeScope = this.f1573f;
            composer.startReplaceGroup(-1633490746);
            boolean zD2 = composer.d(this.f1574g);
            final int i12 = this.f1574g;
            final InterfaceC5872l0<String> interfaceC5872l04 = this.f1578k;
            Object objB3 = composer.B();
            if (zD2 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function1() { // from class: An.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2869l.a.k(i12, interfaceC5872l04, (String) obj);
                    }
                };
                composer.t(objB3);
            }
            Function1 function1 = (Function1) objB3;
            composer.P();
            composer.startReplaceGroup(-1224400529);
            boolean zD3 = composer.D(Assemble) | composer.V(this.f1575h) | composer.V(this.f1570c) | composer.D(this.f1573f);
            final String str2 = this.f1575h;
            final String str3 = this.f1570c;
            final LocalThemeScope localThemeScope2 = this.f1573f;
            Object objB4 = composer.B();
            if (zD3 || objB4 == Composer.INSTANCE.a()) {
                objB4 = new Function1() { // from class: An.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2869l.a.l(Assemble, str2, str3, localThemeScope2, (H1) obj);
                    }
                };
                composer.t(objB4);
            }
            composer.P();
            C2832m0.i(localThemeScope, strC, textInputF, modifierA, function1, (Function1) objB4, composer, LocalThemeScope.f17314g | (q1.f.TextInput.f142293m << 6), 0);
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
    /* JADX WARN: Removed duplicated region for block: B:105:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r26, androidx.compose.ui.Modifier r27, int r28, final En.InputFieldDecorator r29, int r30, androidx.compose.foundation.text.C5835z r31, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: An.C2869l.b(Ki.M, androidx.compose.ui.Modifier, int, En.H, int, androidx.compose.foundation.text.z, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LocalThemeScope localThemeScope, Modifier modifier, int i10, InputFieldDecorator inputFieldDecorator, int i11, C5835z c5835z, Function2 function2, int i12, int i13, Composer composer, int i14) {
        b(localThemeScope, modifier, i10, inputFieldDecorator, i11, c5835z, function2, composer, J0.a(i12 | 1), i13);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }

    private static final boolean f(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    private static final boolean h(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }
}
