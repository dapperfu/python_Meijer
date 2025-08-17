package zn;

import Dn.InputFieldDecorator;
import Ji.LocalThemeScope;
import androidx.compose.foundation.text.C5693z;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5761d;
import androidx.compose.ui.text.input.KeyboardType;
import com.fullstory.compose.FullStoryAnnotationsKt;
import ji.DefaultTextInputs;
import ji.InterfaceC14919W;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import zi.C18504m0;
import zi.H1;
import zn.L;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u001a{\u0010\u0013\u001a\u00020\u0011*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t26\u0010\u0012\u001a2\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u000bH\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0019²\u0006\u000e\u0010\u000f\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "LDn/H;", "decorator", "Landroidx/compose/ui/text/input/a;", "imeAction", "Landroidx/compose/foundation/text/z;", "keyboardActions", "", "enabled", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "currentValue", "isFocused", "", "onValueChanged", "b", "(LJi/M;Landroidx/compose/ui/Modifier;LDn/H;ILandroidx/compose/foundation/text/z;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "hasFocus", "displayError", "inputValue", "isError", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class L {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f172939a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<String, Boolean, Unit> f172940b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f172941c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f172942d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f172943e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C5693z f172944f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f172945g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f172946h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f172947i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f172948j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<String> f172949k;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: zn.L$a$a, reason: collision with other inner class name */
        static final class C2793a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f172950a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f172951b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f172952c;

            C2793a(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W, String str) {
                this.f172950a = localThemeScope;
                this.f172951b = interfaceC14919W;
                this.f172952c = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1263669913, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.AddressDetailTextField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressDetailTextField.kt:92)");
                }
                ri.j.h(this.f172950a, this.f172951b.getLabels().getInfoBlockMessage(), this.f172952c, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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
        a(Modifier modifier, Function2<? super String, ? super Boolean, Unit> function2, boolean z10, String str, int i10, C5693z c5693z, LocalThemeScope localThemeScope, String str2, InterfaceC5730l0<Boolean> interfaceC5730l0, InterfaceC5730l0<Boolean> interfaceC5730l02, InterfaceC5730l0<String> interfaceC5730l03) {
            this.f172939a = modifier;
            this.f172940b = function2;
            this.f172941c = z10;
            this.f172942d = str;
            this.f172943e = i10;
            this.f172944f = c5693z;
            this.f172945g = localThemeScope;
            this.f172946h = str2;
            this.f172947i = interfaceC5730l0;
            this.f172948j = interfaceC5730l02;
            this.f172949k = interfaceC5730l03;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(Function2 function2, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, InterfaceC5730l0 interfaceC5730l03, androidx.compose.ui.focus.E onFocusChanged) {
            Intrinsics.j(onFocusChanged, "onFocusChanged");
            L.g(interfaceC5730l0, onFocusChanged.a());
            if (onFocusChanged.b()) {
                L.i(interfaceC5730l02, true);
            }
            if (!onFocusChanged.a()) {
                function2.invoke(L.c(interfaceC5730l03), Boolean.FALSE);
                if (L.c(interfaceC5730l03).length() > 0) {
                    L.i(interfaceC5730l02, false);
                }
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextInput g(int i10, C5693z c5693z, q1.f.TextInput template) {
            Intrinsics.j(template, "template");
            return q1.f.TextInput.y(template, null, false, null, null, null, new KeyboardOptions(androidx.compose.ui.text.input.b.INSTANCE.e(), null, KeyboardType.INSTANCE.h(), i10, null, null, null, 114, null), c5693z, true, 0, null, null, null, 3871, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC5730l0 interfaceC5730l0, String updatedValue) {
            Intrinsics.j(updatedValue, "updatedValue");
            L.e(interfaceC5730l0, updatedValue);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC14919W interfaceC14919W, String str, String str2, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC14919W.getLabels().getLabel(), str);
            AdsInputField.i(interfaceC14919W.getLabels().getPlaceholder(), str);
            if (str2 != null && str2.length() != 0) {
                AdsInputField.f(interfaceC14919W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(1263669913, true, new C2793a(localThemeScope, interfaceC14919W, str2)));
            }
            return Unit.f142422a;
        }

        public final void e(final InterfaceC14919W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-723822013, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.AddressDetailTextField.<anonymous> (AddressDetailTextField.kt:56)");
            }
            Modifier modifierFsMask = FullStoryAnnotationsKt.fsMask(this.f172939a);
            composer.startReplaceGroup(-1224400529);
            boolean zV = composer.V(this.f172940b);
            final Function2<String, Boolean, Unit> function2 = this.f172940b;
            final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f172947i;
            final InterfaceC5730l0<Boolean> interfaceC5730l02 = this.f172948j;
            final InterfaceC5730l0<String> interfaceC5730l03 = this.f172949k;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: zn.H
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return L.a.f(function2, interfaceC5730l0, interfaceC5730l02, interfaceC5730l03, (androidx.compose.ui.focus.E) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Modifier modifierA = T0.a.a(C5761d.a(modifierFsMask, (Function1) objB), this.f172941c ? 1.0f : 0.8f);
            String strC = L.c(this.f172949k);
            DefaultTextInputs inputFields = Assemble.getInputFields();
            String str = this.f172942d;
            boolean z10 = !(str == null || str.length() == 0);
            boolean z11 = !this.f172941c;
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.d(this.f172943e) | composer.V(this.f172944f);
            final int i11 = this.f172943e;
            final C5693z c5693z = this.f172944f;
            Object objB2 = composer.B();
            if (zD || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: zn.I
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return L.a.g(i11, c5693z, (q1.f.TextInput) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            q1.f.TextInput textInputF = Cr.f.f(inputFields, z10, false, z11, (Function1) objB2, 2, null);
            LocalThemeScope localThemeScope = this.f172945g;
            composer.startReplaceGroup(5004770);
            final InterfaceC5730l0<String> interfaceC5730l04 = this.f172949k;
            Object objB3 = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB3 == companion.a()) {
                objB3 = new Function1() { // from class: zn.J
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return L.a.k(interfaceC5730l04, (String) obj);
                    }
                };
                composer.t(objB3);
            }
            Function1 function1 = (Function1) objB3;
            composer.P();
            composer.startReplaceGroup(-1224400529);
            boolean zD2 = composer.D(Assemble) | composer.V(this.f172946h) | composer.V(this.f172942d) | composer.D(this.f172945g);
            final String str2 = this.f172946h;
            final String str3 = this.f172942d;
            final LocalThemeScope localThemeScope2 = this.f172945g;
            Object objB4 = composer.B();
            if (zD2 || objB4 == companion.a()) {
                objB4 = new Function1() { // from class: zn.K
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return L.a.l(Assemble, str2, str3, localThemeScope2, (H1) obj);
                    }
                };
                composer.t(objB4);
            }
            composer.P();
            C18504m0.i(localThemeScope, strC, textInputF, modifierA, function1, (Function1) objB4, composer, LocalThemeScope.f15770g | 24576 | (q1.f.TextInput.f140038m << 6), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            e(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
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
    public static final void b(final Ji.LocalThemeScope r27, androidx.compose.ui.Modifier r28, final Dn.InputFieldDecorator r29, int r30, androidx.compose.foundation.text.C5693z r31, boolean r32, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zn.L.b(Ji.M, androidx.compose.ui.Modifier, Dn.H, int, androidx.compose.foundation.text.z, boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LocalThemeScope localThemeScope, Modifier modifier, InputFieldDecorator inputFieldDecorator, int i10, C5693z c5693z, boolean z10, Function2 function2, int i11, int i12, Composer composer, int i13) {
        b(localThemeScope, modifier, inputFieldDecorator, i10, c5693z, z10, function2, composer, J0.a(i11 | 1), i12);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    private static final boolean f(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }

    private static final boolean h(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }
}
