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
import kotlin.text.StringsKt;
import zi.C18504m0;
import zi.H1;
import zn.C18554l;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a{\u0010\u0014\u001a\u00020\u0012*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t26\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u000bH\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017²\u0006\u000e\u0010\u000f\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0011\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "maxDigit", "LDn/H;", "decorator", "Landroidx/compose/ui/text/input/a;", "imeAction", "Landroidx/compose/foundation/text/z;", "keyboardActions", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "currentValue", "", "hasFocus", "", "onValueChanged", "b", "(LJi/M;Landroidx/compose/ui/Modifier;ILDn/H;ILandroidx/compose/foundation/text/z;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "displayError", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: zn.l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C18554l {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: zn.l$a */
    static final class a implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f173052a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<String, Boolean, Unit> f173053b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f173054c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f173055d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C5693z f173056e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f173057f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f173058g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f173059h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f173060i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f173061j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<String> f173062k;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: zn.l$a$a, reason: collision with other inner class name */
        static final class C2796a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f173063a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f173064b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f173065c;

            C2796a(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W, String str) {
                this.f173063a = localThemeScope;
                this.f173064b = interfaceC14919W;
                this.f173065c = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-54665166, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.AddressDetailNumberField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressDetailNumberField.kt:87)");
                }
                ri.j.h(this.f173063a, this.f173064b.getLabels().getInfoBlockMessage(), this.f173065c, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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
        a(Modifier modifier, Function2<? super String, ? super Boolean, Unit> function2, String str, int i10, C5693z c5693z, LocalThemeScope localThemeScope, int i11, String str2, InterfaceC5730l0<Boolean> interfaceC5730l0, InterfaceC5730l0<Boolean> interfaceC5730l02, InterfaceC5730l0<String> interfaceC5730l03) {
            this.f173052a = modifier;
            this.f173053b = function2;
            this.f173054c = str;
            this.f173055d = i10;
            this.f173056e = c5693z;
            this.f173057f = localThemeScope;
            this.f173058g = i11;
            this.f173059h = str2;
            this.f173060i = interfaceC5730l0;
            this.f173061j = interfaceC5730l02;
            this.f173062k = interfaceC5730l03;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(Function2 function2, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, InterfaceC5730l0 interfaceC5730l03, androidx.compose.ui.focus.E onFocusChanged) {
            Intrinsics.j(onFocusChanged, "onFocusChanged");
            C18554l.g(interfaceC5730l0, onFocusChanged.a());
            if (onFocusChanged.b()) {
                C18554l.i(interfaceC5730l02, true);
            }
            if (!onFocusChanged.a()) {
                function2.invoke(C18554l.c(interfaceC5730l03), Boolean.FALSE);
                if (C18554l.c(interfaceC5730l03).length() > 0) {
                    C18554l.i(interfaceC5730l02, false);
                }
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextInput g(int i10, C5693z c5693z, q1.f.TextInput template) {
            Intrinsics.j(template, "template");
            return q1.f.TextInput.y(template, null, false, null, null, null, new KeyboardOptions(0, null, KeyboardType.INSTANCE.e(), i10, null, null, null, 115, null), c5693z, true, 0, null, null, null, 3871, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(int i10, InterfaceC5730l0 interfaceC5730l0, String it) {
            Intrinsics.j(it, "it");
            if (it.length() <= i10) {
                C18554l.e(interfaceC5730l0, it);
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC14919W interfaceC14919W, String str, String str2, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC14919W.getLabels().getLabel(), str);
            if (str2 != null && !StringsKt.r0(str2)) {
                AdsInputField.f(interfaceC14919W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(-54665166, true, new C2796a(localThemeScope, interfaceC14919W, str2)));
            }
            return Unit.f142422a;
        }

        public final void e(final InterfaceC14919W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-2042157092, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.AddressDetailNumberField.<anonymous> (AddressDetailNumberField.kt:55)");
            }
            Modifier modifierFsMask = FullStoryAnnotationsKt.fsMask(this.f173052a);
            composer.startReplaceGroup(-1224400529);
            boolean zV = composer.V(this.f173053b);
            final Function2<String, Boolean, Unit> function2 = this.f173053b;
            final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f173060i;
            final InterfaceC5730l0<Boolean> interfaceC5730l02 = this.f173061j;
            final InterfaceC5730l0<String> interfaceC5730l03 = this.f173062k;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: zn.h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C18554l.a.f(function2, interfaceC5730l0, interfaceC5730l02, interfaceC5730l03, (androidx.compose.ui.focus.E) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Modifier modifierA = C5761d.a(modifierFsMask, (Function1) objB);
            String strC = C18554l.c(this.f173062k);
            DefaultTextInputs inputFields = Assemble.getInputFields();
            String str = this.f173054c;
            boolean z10 = !(str == null || StringsKt.r0(str));
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.d(this.f173055d) | composer.V(this.f173056e);
            final int i11 = this.f173055d;
            final C5693z c5693z = this.f173056e;
            Object objB2 = composer.B();
            if (zD || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: zn.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C18554l.a.g(i11, c5693z, (q1.f.TextInput) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            q1.f.TextInput textInputF = Cr.f.f(inputFields, z10, false, false, (Function1) objB2, 6, null);
            LocalThemeScope localThemeScope = this.f173057f;
            composer.startReplaceGroup(-1633490746);
            boolean zD2 = composer.d(this.f173058g);
            final int i12 = this.f173058g;
            final InterfaceC5730l0<String> interfaceC5730l04 = this.f173062k;
            Object objB3 = composer.B();
            if (zD2 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function1() { // from class: zn.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C18554l.a.k(i12, interfaceC5730l04, (String) obj);
                    }
                };
                composer.t(objB3);
            }
            Function1 function1 = (Function1) objB3;
            composer.P();
            composer.startReplaceGroup(-1224400529);
            boolean zD3 = composer.D(Assemble) | composer.V(this.f173059h) | composer.V(this.f173054c) | composer.D(this.f173057f);
            final String str2 = this.f173059h;
            final String str3 = this.f173054c;
            final LocalThemeScope localThemeScope2 = this.f173057f;
            Object objB4 = composer.B();
            if (zD3 || objB4 == Composer.INSTANCE.a()) {
                objB4 = new Function1() { // from class: zn.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C18554l.a.l(Assemble, str2, str3, localThemeScope2, (H1) obj);
                    }
                };
                composer.t(objB4);
            }
            composer.P();
            C18504m0.i(localThemeScope, strC, textInputF, modifierA, function1, (Function1) objB4, composer, LocalThemeScope.f15770g | (q1.f.TextInput.f140038m << 6), 0);
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
    public static final void b(final Ji.LocalThemeScope r26, androidx.compose.ui.Modifier r27, int r28, final Dn.InputFieldDecorator r29, int r30, androidx.compose.foundation.text.C5693z r31, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zn.C18554l.b(Ji.M, androidx.compose.ui.Modifier, int, Dn.H, int, androidx.compose.foundation.text.z, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LocalThemeScope localThemeScope, Modifier modifier, int i10, InputFieldDecorator inputFieldDecorator, int i11, C5693z c5693z, Function2 function2, int i12, int i13, Composer composer, int i14) {
        b(localThemeScope, modifier, i10, inputFieldDecorator, i11, c5693z, function2, composer, J0.a(i12 | 1), i13);
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
