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
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.KeyboardType;
import com.fullstory.compose.FullStoryAnnotationsKt;
import ji.DefaultTextInputs;
import ji.InterfaceC14919W;
import ji.q1;
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
import zi.C18504m0;
import zi.H1;
import zn.r;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a{\u0010\u0013\u001a\u00020\u0011*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t26\u0010\u0012\u001a2\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u000bH\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017²\u0006\u000e\u0010\u000f\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "LDn/H;", "decorator", "Landroidx/compose/ui/text/input/a;", "imeAction", "Landroidx/compose/foundation/text/z;", "keyboardActions", "", "enabled", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "currentValue", "hasFocus", "", "onValueChanged", "b", "(LJi/M;Landroidx/compose/ui/Modifier;LDn/H;ILandroidx/compose/foundation/text/z;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "displayError", "phoneNumberInput", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class r {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f173093a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f173094b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f173095c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f173096d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<String, Boolean, Unit> f173097e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C5693z f173098f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f173099g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<String> f173100h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f173101i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f173102j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f173103k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<String> f173104l;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: zn.r$a$a, reason: collision with other inner class name */
        /* synthetic */ class C2797a implements W, FunctionAdapter {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ih.H f173105a;

            C2797a(Ih.H h10) {
                this.f173105a = h10;
            }

            @Override // z1.W
            public final TransformedText a(AnnotatedString p02) {
                Intrinsics.j(p02, "p0");
                return this.f173105a.a(p02);
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof W) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new FunctionReferenceImpl(1, this.f173105a, Ih.H.class, "formatter", "formatter(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f173106a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f173107b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f173108c;

            b(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W, String str) {
                this.f173106a = localThemeScope;
                this.f173107b = interfaceC14919W;
                this.f173108c = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-708218899, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.AddressDetailPhoneNumberField.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddressDetailPhoneNumberField.kt:110)");
                }
                ri.j.h(this.f173106a, this.f173107b.getLabels().getInfoBlockMessage(), this.f173108c, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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
        a(LocalThemeScope localThemeScope, String str, boolean z10, int i10, Function2<? super String, ? super Boolean, Unit> function2, C5693z c5693z, String str2, InterfaceC5730l0<String> interfaceC5730l0, androidx.compose.ui.focus.y yVar, InterfaceC5730l0<Boolean> interfaceC5730l02, InterfaceC5730l0<Boolean> interfaceC5730l03, InterfaceC5730l0<String> interfaceC5730l04) {
            this.f173093a = localThemeScope;
            this.f173094b = str;
            this.f173095c = z10;
            this.f173096d = i10;
            this.f173097e = function2;
            this.f173098f = c5693z;
            this.f173099g = str2;
            this.f173100h = interfaceC5730l0;
            this.f173101i = yVar;
            this.f173102j = interfaceC5730l02;
            this.f173103k = interfaceC5730l03;
            this.f173104l = interfaceC5730l04;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextInput f(int i10, androidx.compose.ui.focus.y yVar, boolean z10, C5693z c5693z, final Function2 function2, final InterfaceC5730l0 interfaceC5730l0, final InterfaceC5730l0 interfaceC5730l02, final InterfaceC5730l0 interfaceC5730l03, q1.f.TextInput template) {
            Intrinsics.j(template, "template");
            return q1.f.TextInput.y(template, T0.a.a(C5761d.a(androidx.compose.ui.focus.A.a(FullStoryAnnotationsKt.fsMask(template.getModifier()), yVar), new Function1() { // from class: zn.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return r.a.g(function2, interfaceC5730l0, interfaceC5730l02, interfaceC5730l03, (androidx.compose.ui.focus.E) obj);
                }
            }), z10 ? 1.0f : 0.8f), false, null, null, new C2797a(Ih.H.f13923a), new KeyboardOptions(0, null, KeyboardType.INSTANCE.g(), i10, null, null, null, 115, null), c5693z, true, 0, null, null, null, 3854, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Function2 function2, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, InterfaceC5730l0 interfaceC5730l03, androidx.compose.ui.focus.E onFocusChanged) {
            Intrinsics.j(onFocusChanged, "onFocusChanged");
            r.h(interfaceC5730l0, onFocusChanged.a());
            if (onFocusChanged.b()) {
                r.j(interfaceC5730l02, true);
            }
            if (!onFocusChanged.a()) {
                function2.invoke(r.c(interfaceC5730l03), Boolean.FALSE);
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, String value) {
            Intrinsics.j(value, "value");
            if (value.length() <= 10) {
                r.f(interfaceC5730l0, value);
                r.d(interfaceC5730l02, value);
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC14919W interfaceC14919W, String str, String str2, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC14919W.getLabels().getLabel(), str);
            if (str2 != null && !StringsKt.r0(str2)) {
                AdsInputField.f(interfaceC14919W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(-708218899, true, new b(localThemeScope, interfaceC14919W, str2)));
            }
            return Unit.f142422a;
        }

        public final void e(final InterfaceC14919W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(896715927, i10, -1, "com.meijer.mobile.meijer.activity.settings.addresses.compose.AddressDetailPhoneNumberField.<anonymous>.<anonymous> (AddressDetailPhoneNumberField.kt:70)");
            }
            LocalThemeScope localThemeScope = this.f173093a;
            String strC = r.c(this.f173100h);
            DefaultTextInputs inputFields = Assemble.getInputFields();
            String str = this.f173094b;
            boolean z10 = !(str == null || StringsKt.r0(str));
            boolean z11 = !this.f173095c;
            composer.startReplaceGroup(-1224400529);
            boolean zD = composer.d(this.f173096d) | composer.V(this.f173097e) | composer.a(this.f173095c) | composer.V(this.f173098f);
            final int i11 = this.f173096d;
            final androidx.compose.ui.focus.y yVar = this.f173101i;
            final boolean z12 = this.f173095c;
            final C5693z c5693z = this.f173098f;
            final Function2<String, Boolean, Unit> function2 = this.f173097e;
            final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f173102j;
            final InterfaceC5730l0<Boolean> interfaceC5730l02 = this.f173103k;
            final InterfaceC5730l0<String> interfaceC5730l03 = this.f173100h;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                Function1 function1 = new Function1() { // from class: zn.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return r.a.f(i11, yVar, z12, c5693z, function2, interfaceC5730l0, interfaceC5730l02, interfaceC5730l03, (q1.f.TextInput) obj);
                    }
                };
                composer.t(function1);
                objB = function1;
            }
            composer.P();
            q1.f.TextInput textInputF = Cr.f.f(inputFields, z10, false, z11, (Function1) objB, 2, null);
            composer.startReplaceGroup(-1633490746);
            final InterfaceC5730l0<String> interfaceC5730l04 = this.f173100h;
            final InterfaceC5730l0<String> interfaceC5730l05 = this.f173104l;
            Object objB2 = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB2 == companion.a()) {
                objB2 = new Function1() { // from class: zn.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return r.a.k(interfaceC5730l04, interfaceC5730l05, (String) obj);
                    }
                };
                composer.t(objB2);
            }
            Function1 function12 = (Function1) objB2;
            composer.P();
            composer.startReplaceGroup(-1224400529);
            boolean zD2 = composer.D(Assemble) | composer.V(this.f173099g) | composer.V(this.f173094b) | composer.D(this.f173093a);
            final String str2 = this.f173099g;
            final String str3 = this.f173094b;
            final LocalThemeScope localThemeScope2 = this.f173093a;
            Object objB3 = composer.B();
            if (zD2 || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: zn.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return r.a.l(Assemble, str2, str3, localThemeScope2, (H1) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C18504m0.i(localThemeScope, strC, textInputF, null, function12, (Function1) objB3, composer, LocalThemeScope.f15770g | 24576 | (q1.f.TextInput.f140038m << 6), 4);
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
    public static final void b(Ji.LocalThemeScope r27, androidx.compose.ui.Modifier r28, final Dn.InputFieldDecorator r29, int r30, androidx.compose.foundation.text.C5693z r31, boolean r32, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zn.r.b(Ji.M, androidx.compose.ui.Modifier, Dn.H, int, androidx.compose.foundation.text.z, boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Modifier modifier, InputFieldDecorator inputFieldDecorator, int i10, C5693z c5693z, boolean z10, Function2 function2, int i11, int i12, Composer composer, int i13) {
        b(localThemeScope, modifier, inputFieldDecorator, i10, c5693z, z10, function2, composer, J0.a(i11 | 1), i12);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }

    private static final boolean g(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }

    private static final boolean i(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }
}
