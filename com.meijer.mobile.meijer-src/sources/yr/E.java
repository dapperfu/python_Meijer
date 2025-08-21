package yr;

import Bi.C2962v;
import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5903d;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import ki.H0;
import ki.InterfaceC15149S;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16338g;
import yr.E;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u001aa\u0010\r\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u000326\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0012²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00038\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0011\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "initialValue", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "", "isFocused", "", "onValueChanged", "b", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "currentValue", "monthPickerValue", "focused", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class E {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC15149S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f171659a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f171660b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f171661c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<String, Boolean, Unit> f171662d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f171663e;

        /* JADX WARN: Multi-variable type inference failed */
        a(String str, LocalThemeScope localThemeScope, Modifier modifier, Function2<? super String, ? super Boolean, Unit> function2, InterfaceC5872l0<Boolean> interfaceC5872l0) {
            this.f171659a = str;
            this.f171660b = localThemeScope;
            this.f171661c = modifier;
            this.f171662d = function2;
            this.f171663e = interfaceC5872l0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5872l0 interfaceC5872l0, androidx.compose.ui.focus.E state) {
            Intrinsics.j(state, "state");
            E.d(interfaceC5872l0, state.a());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(List list, Function2 function2, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, String str, int i10) {
            Intrinsics.j(str, "<unused var>");
            f(interfaceC5872l0, (String) list.get(i10));
            function2.invoke(list.get(i10), Boolean.valueOf(E.c(interfaceC5872l02)));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC15149S interfaceC15149S, String str, Bi.n0 AdsDropdown) {
            Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
            AdsDropdown.d(interfaceC15149S.getLabels().getLabel(), str);
            return Unit.f143329a;
        }

        public final void d(final InterfaceC15149S Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(974309207, i10, -1, "com.meijer.mobile.ui.common.MonthPicker.<anonymous> (MonthPicker.kt:37)");
            }
            final List listH1 = ArraysKt.h1(C16338g.b(O.f171730a, composer, 0));
            final String strC = C16338g.c(Q.f171767e, composer, 0);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f171659a);
            String str = this.f171659a;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = t1.e(str, null, 2, null);
                composer.t(objB);
            }
            final InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
            composer.P();
            LocalThemeScope localThemeScope = this.f171660b;
            Modifier modifier = this.f171661c;
            composer.startReplaceGroup(5004770);
            final InterfaceC5872l0<Boolean> interfaceC5872l02 = this.f171663e;
            Object objB2 = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB2 == companion.a()) {
                objB2 = new Function1() { // from class: yr.B
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return E.a.g(interfaceC5872l02, (androidx.compose.ui.focus.E) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            Modifier modifierA = C5903d.a(modifier, (Function1) objB2);
            String strE = e(interfaceC5872l0);
            if (strE == null) {
                strE = (String) CollectionsKt.s0(listH1);
            }
            q1.f.Dropdown dropdownB = Bi.m0.b(Assemble.getInputFields(), false, false, false, false, false, null, 63, null);
            composer.startReplaceGroup(-1224400529);
            boolean zV2 = composer.V(interfaceC5872l0) | composer.D(listH1) | composer.V(this.f171662d);
            final Function2<String, Boolean, Unit> function2 = this.f171662d;
            final InterfaceC5872l0<Boolean> interfaceC5872l03 = this.f171663e;
            Object objB3 = composer.B();
            if (zV2 || objB3 == companion.a()) {
                objB3 = new Function2() { // from class: yr.C
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return E.a.k(listH1, function2, interfaceC5872l0, interfaceC5872l03, (String) obj, ((Integer) obj2).intValue());
                    }
                };
                composer.t(objB3);
            }
            Function2 function22 = (Function2) objB3;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(Assemble) | composer.V(strC);
            Object objB4 = composer.B();
            if (zD || objB4 == companion.a()) {
                objB4 = new Function1() { // from class: yr.D
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return E.a.l(Assemble, strC, (Bi.n0) obj);
                    }
                };
                composer.t(objB4);
            }
            composer.P();
            C2962v.v(localThemeScope, modifierA, strE, dropdownB, listH1, function22, (Function1) objB4, composer, LocalThemeScope.f17314g | (q1.f.Dropdown.f142250m << 9), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15149S interfaceC15149S, Composer composer, Integer num) {
            d(interfaceC15149S, composer, num.intValue());
            return Unit.f143329a;
        }

        private static final String e(InterfaceC5872l0<String> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }

        private static final void f(InterfaceC5872l0<String> interfaceC5872l0, String str) {
            interfaceC5872l0.setValue(str);
        }
    }

    public static final void b(final LocalThemeScope localThemeScope, Modifier modifier, String str, final Function2<? super String, ? super Boolean, Unit> onValueChanged, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(onValueChanged, "onValueChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(-626023032);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(str) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(onValueChanged) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        int i15 = i12;
        if ((i15 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            String str2 = i14 != 0 ? null : str;
            if (ComposerKt.M()) {
                ComposerKt.U(-626023032, i15, -1, "com.meijer.mobile.ui.common.MonthPicker (MonthPicker.kt:34)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = t1.e(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            H0 h02 = H0.f141923a;
            a aVar = new a(str2, localThemeScope, modifier3, onValueChanged, (InterfaceC5872l0) objB);
            str = str2;
            Ki.Q.e(localThemeScope, h02, ComposableLambdaKt.c(974309207, true, aVar, composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f17314g | 384 | (i15 & 14) | (H0.f141924b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
        }
        final String str3 = str;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: yr.A
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return E.e(localThemeScope, modifier2, str3, onValueChanged, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Modifier modifier, String str, Function2 function2, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, str, function2, composer, J0.a(i10 | 1), i11);
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
}
