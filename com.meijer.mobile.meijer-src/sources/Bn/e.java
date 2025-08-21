package Bn;

import Bi.C2962v;
import Bi.m0;
import Bi.n0;
import Bn.e;
import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5903d;
import androidx.compose.ui.focus.E;
import java.util.List;
import ki.InterfaceC15149S;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u001ak\u0010\u000e\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u000326\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0002\u0010\r\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0013²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0011\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\r\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "initialValue", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "", "isFocused", "", "onValueChanged", "isNewAddressQualifierUI", "b", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/runtime/Composer;II)V", "currentValue", "statePickerValue", "focused", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC15149S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f3609a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f3610b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<String> f3611c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<String, Boolean, Unit> f3612d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f3613e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f3614f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f3615g;

        /* JADX WARN: Multi-variable type inference failed */
        a(Modifier modifier, LocalThemeScope localThemeScope, List<String> list, Function2<? super String, ? super Boolean, Unit> function2, String str, InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5872l0<String> interfaceC5872l02) {
            this.f3609a = modifier;
            this.f3610b = localThemeScope;
            this.f3611c = list;
            this.f3612d = function2;
            this.f3613e = str;
            this.f3614f = interfaceC5872l0;
            this.f3615g = interfaceC5872l02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(InterfaceC5872l0 interfaceC5872l0, E state) {
            Intrinsics.j(state, "state");
            e.d(interfaceC5872l0, state.a());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(List list, Function2 function2, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, String str, int i10) {
            Intrinsics.j(str, "<unused var>");
            e.f(interfaceC5872l0, (String) list.get(i10));
            function2.invoke(list.get(i10), Boolean.valueOf(e.c(interfaceC5872l02)));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC15149S interfaceC15149S, String str, n0 AdsDropdown) {
            Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
            AdsDropdown.d(interfaceC15149S.getLabels().getLabel(), str);
            return Unit.f143329a;
        }

        public final void d(final InterfaceC15149S Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1433801799, i10, -1, "com.meijer.mobile.meijer.activity.settings.billing.compose.StatesPicker.<anonymous> (StatesPicker.kt:51)");
            }
            Modifier modifier = this.f3609a;
            composer.startReplaceGroup(5004770);
            final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f3614f;
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new Function1() { // from class: Bn.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return e.a.e(interfaceC5872l0, (E) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Modifier modifierA = C5903d.a(modifier, (Function1) objB);
            q1.f.Dropdown dropdownB = m0.b(Assemble.getInputFields(), false, false, false, false, false, null, 63, null);
            String strE = e.e(this.f3615g);
            LocalThemeScope localThemeScope = this.f3610b;
            List<String> list = this.f3611c;
            composer.startReplaceGroup(-1224400529);
            boolean zD = composer.D(this.f3611c) | composer.V(this.f3612d);
            final List<String> list2 = this.f3611c;
            final Function2<String, Boolean, Unit> function2 = this.f3612d;
            final InterfaceC5872l0<String> interfaceC5872l02 = this.f3615g;
            final InterfaceC5872l0<Boolean> interfaceC5872l03 = this.f3614f;
            Object objB2 = composer.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new Function2() { // from class: Bn.c
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return e.a.f(list2, function2, interfaceC5872l02, interfaceC5872l03, (String) obj, ((Integer) obj2).intValue());
                    }
                };
                composer.t(objB2);
            }
            Function2 function22 = (Function2) objB2;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD2 = composer.D(Assemble) | composer.V(this.f3613e);
            final String str = this.f3613e;
            Object objB3 = composer.B();
            if (zD2 || objB3 == companion.a()) {
                objB3 = new Function1() { // from class: Bn.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return e.a.g(Assemble, str, (n0) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C2962v.v(localThemeScope, modifierA, strE, dropdownB, list, function22, (Function1) objB3, composer, (q1.f.Dropdown.f142250m << 9) | LocalThemeScope.f17314g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15149S interfaceC15149S, Composer composer, Integer num) {
            d(interfaceC15149S, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(Ki.LocalThemeScope r17, androidx.compose.ui.Modifier r18, java.lang.String r19, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> r20, boolean r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bn.e.b(Ki.M, androidx.compose.ui.Modifier, java.lang.String, kotlin.jvm.functions.Function2, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, String str, Function2 function2, boolean z10, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, str, function2, z10, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }
}
