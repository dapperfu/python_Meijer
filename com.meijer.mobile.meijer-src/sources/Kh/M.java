package Kh;

import Ai.C2832m0;
import Kh.M;
import Ki.LocalThemeScope;
import androidx.compose.foundation.text.C5835z;
import androidx.compose.foundation.text.InterfaceC5834y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5905f;
import androidx.compose.ui.focus.InterfaceC5914o;
import ki.DefaultTextInputs;
import ki.InterfaceC15153W;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aR\u0010\f\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e²\u0006\u000e\u0010\u0003\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "caption", "apartment", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newValue", "", "onApartmentFieldChanged", "b", "(LKi/M;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class M {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f16703a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f16704b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f16705c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f16706d;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, String str, InterfaceC5914o interfaceC5914o, Function1<? super String, Unit> function1) {
            this.f16703a = localThemeScope;
            this.f16704b = str;
            this.f16705c = interfaceC5914o;
            this.f16706d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextInput e(final InterfaceC5914o interfaceC5914o, q1.f.TextInput template) {
            Intrinsics.j(template, "template");
            return q1.f.TextInput.y(template, null, false, null, null, null, new KeyboardOptions(0, null, 0, androidx.compose.ui.text.input.a.INSTANCE.d(), null, null, null, 119, null), new C5835z(new Function1() { // from class: Kh.K
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return M.a.f(interfaceC5914o, (InterfaceC5834y) obj);
                }
            }, null, new Function1() { // from class: Kh.L
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return M.a.g(interfaceC5914o, (InterfaceC5834y) obj);
                }
            }, null, null, null, 58, null), false, 0, null, null, null, 3999, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(InterfaceC5914o interfaceC5914o, InterfaceC5834y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            InterfaceC5914o.l(interfaceC5914o, false, 1, null);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5914o interfaceC5914o, InterfaceC5834y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            interfaceC5914o.e(C5905f.INSTANCE.a());
            return Unit.f143329a;
        }

        public final void d(InterfaceC15153W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1688485589, i10, -1, "com.meijer.mobile.accounts.ux.composables.addresses.ApartmentInputField.<anonymous>.<anonymous> (ApartmentInputField.kt:66)");
            }
            LocalThemeScope localThemeScope = this.f16703a;
            String str = this.f16704b;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            DefaultTextInputs inputFields = Assemble.getInputFields();
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(this.f16705c);
            final InterfaceC5914o interfaceC5914o = this.f16705c;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Kh.J
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return M.a.e(interfaceC5914o, (q1.f.TextInput) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C2832m0.i(localThemeScope, str2, Cr.f.f(inputFields, false, false, false, (Function1) objB, 7, null), null, this.f16706d, null, composer, LocalThemeScope.f17314g | (q1.f.TextInput.f142293m << 6), 20);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            d(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r37, final java.lang.String r38, final java.lang.String r39, androidx.compose.ui.Modifier r40, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r41, androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Kh.M.b(Ki.M, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, String str, String str2, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, str, str2, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
