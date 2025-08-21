package An;

import Ai.C2832m0;
import Ai.H1;
import An.C2863f;
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

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a{\u0010\u0013\u001a\u00020\u0011*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t26\u0010\u0012\u001a2\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u000bH\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017²\u0006\u000e\u0010\u000f\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "LEn/H;", "decorator", "Landroidx/compose/ui/text/input/a;", "imeAction", "Landroidx/compose/foundation/text/z;", "keyboardActions", "", "enabled", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "currentValue", "isFocused", "", "onValueChanged", "b", "(LKi/M;Landroidx/compose/ui/Modifier;LEn/H;ILandroidx/compose/foundation/text/z;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "hasFocus", "displayError", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: An.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C2863f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: An.f$a */
    static final class a implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f1534a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f1535b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f1536c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f1537d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<String, Boolean, Unit> f1538e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C5835z f1539f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f1540g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f1541h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f1542i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f1543j;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: An.f$a$a, reason: collision with other inner class name */
        static final class C0036a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f1544a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15153W f1545b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f1546c;

            C0036a(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W, String str) {
                this.f1544a = localThemeScope;
                this.f1545b = interfaceC15153W;
                this.f1546c = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1109171027, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.AddressDetailInputTextField.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressDetailInputTextField.kt:95)");
                }
                si.j.h(this.f1544a, this.f1545b.getLabels().getInfoBlockMessage(), this.f1546c, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
        a(LocalThemeScope localThemeScope, String str, boolean z10, int i10, Function2<? super String, ? super Boolean, Unit> function2, C5835z c5835z, String str2, InterfaceC5872l0<String> interfaceC5872l0, InterfaceC5872l0<Boolean> interfaceC5872l02, InterfaceC5872l0<Boolean> interfaceC5872l03) {
            this.f1534a = localThemeScope;
            this.f1535b = str;
            this.f1536c = z10;
            this.f1537d = i10;
            this.f1538e = function2;
            this.f1539f = c5835z;
            this.f1540g = str2;
            this.f1541h = interfaceC5872l0;
            this.f1542i = interfaceC5872l02;
            this.f1543j = interfaceC5872l03;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextInput f(int i10, boolean z10, C5835z c5835z, final Function2 function2, final InterfaceC5872l0 interfaceC5872l0, final InterfaceC5872l0 interfaceC5872l02, final InterfaceC5872l0 interfaceC5872l03, q1.f.TextInput template) {
            Intrinsics.j(template, "template");
            return q1.f.TextInput.y(template, T0.a.a(C5903d.a(template.getModifier(), new Function1() { // from class: An.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C2863f.a.g(function2, interfaceC5872l0, interfaceC5872l02, interfaceC5872l03, (androidx.compose.ui.focus.E) obj);
                }
            }), z10 ? 1.0f : 0.8f), false, null, null, null, new KeyboardOptions(androidx.compose.ui.text.input.b.INSTANCE.e(), null, KeyboardType.INSTANCE.h(), i10, null, null, null, 114, null), c5835z, true, 0, null, null, null, 3870, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Function2 function2, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, InterfaceC5872l0 interfaceC5872l03, androidx.compose.ui.focus.E onFocusChanged) {
            Intrinsics.j(onFocusChanged, "onFocusChanged");
            C2863f.g(interfaceC5872l0, onFocusChanged.a());
            if (onFocusChanged.b()) {
                C2863f.i(interfaceC5872l02, true);
            }
            if (!onFocusChanged.a()) {
                function2.invoke(C2863f.c(interfaceC5872l03), Boolean.FALSE);
                if (C2863f.c(interfaceC5872l03).length() > 0) {
                    C2863f.i(interfaceC5872l02, false);
                }
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC5872l0 interfaceC5872l0, String updatedValue) {
            Intrinsics.j(updatedValue, "updatedValue");
            C2863f.e(interfaceC5872l0, updatedValue);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC15153W interfaceC15153W, String str, String str2, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC15153W.getLabels().getLabel(), str);
            if (str2 != null && str2.length() != 0) {
                AdsInputField.e(interfaceC15153W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(-1109171027, true, new C0036a(localThemeScope, interfaceC15153W, str2)));
            }
            return Unit.f143329a;
        }

        public final void e(final InterfaceC15153W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(456762967, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.AddressDetailInputTextField.<anonymous>.<anonymous> (AddressDetailInputTextField.kt:57)");
            }
            LocalThemeScope localThemeScope = this.f1534a;
            String strC = C2863f.c(this.f1541h);
            DefaultTextInputs inputFields = Assemble.getInputFields();
            String str = this.f1535b;
            boolean z10 = !(str == null || str.length() == 0);
            boolean z11 = !this.f1536c;
            composer.startReplaceGroup(-1224400529);
            boolean zD = composer.d(this.f1537d) | composer.V(this.f1538e) | composer.a(this.f1536c) | composer.V(this.f1539f);
            final int i11 = this.f1537d;
            final boolean z12 = this.f1536c;
            final C5835z c5835z = this.f1539f;
            final Function2<String, Boolean, Unit> function2 = this.f1538e;
            final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f1542i;
            final InterfaceC5872l0<Boolean> interfaceC5872l02 = this.f1543j;
            final InterfaceC5872l0<String> interfaceC5872l03 = this.f1541h;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                Function1 function1 = new Function1() { // from class: An.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2863f.a.f(i11, z12, c5835z, function2, interfaceC5872l0, interfaceC5872l02, interfaceC5872l03, (q1.f.TextInput) obj);
                    }
                };
                composer.t(function1);
                objB = function1;
            }
            composer.P();
            q1.f.TextInput textInputF = Cr.f.f(inputFields, z10, false, z11, (Function1) objB, 2, null);
            composer.startReplaceGroup(5004770);
            final InterfaceC5872l0<String> interfaceC5872l04 = this.f1541h;
            Object objB2 = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB2 == companion.a()) {
                objB2 = new Function1() { // from class: An.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2863f.a.k(interfaceC5872l04, (String) obj);
                    }
                };
                composer.t(objB2);
            }
            Function1 function12 = (Function1) objB2;
            composer.P();
            composer.startReplaceGroup(-1224400529);
            boolean zD2 = composer.D(Assemble) | composer.V(this.f1540g) | composer.V(this.f1535b) | composer.D(this.f1534a);
            final String str2 = this.f1540g;
            final String str3 = this.f1535b;
            final LocalThemeScope localThemeScope2 = this.f1534a;
            Object objB3 = composer.B();
            if (zD2 || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: An.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C2863f.a.l(Assemble, str2, str3, localThemeScope2, (H1) obj);
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Removed duplicated region for block: B:98:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(Ki.LocalThemeScope r26, androidx.compose.ui.Modifier r27, final En.InputFieldDecorator r28, int r29, androidx.compose.foundation.text.C5835z r30, boolean r31, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: An.C2863f.b(Ki.M, androidx.compose.ui.Modifier, En.H, int, androidx.compose.foundation.text.z, boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LocalThemeScope localThemeScope, Modifier modifier, InputFieldDecorator inputFieldDecorator, int i10, C5835z c5835z, boolean z10, Function2 function2, int i11, int i12, Composer composer, int i13) {
        b(localThemeScope, modifier, inputFieldDecorator, i10, c5835z, z10, function2, composer, J0.a(i11 | 1), i12);
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
