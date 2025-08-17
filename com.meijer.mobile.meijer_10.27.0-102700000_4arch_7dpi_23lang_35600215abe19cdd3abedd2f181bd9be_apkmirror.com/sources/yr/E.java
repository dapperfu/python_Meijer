package yr;

import Ai.C2857v;
import Ji.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5761d;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import ji.H0;
import ji.InterfaceC14915S;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16193g;
import yr.E;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u001aa\u0010\r\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u000326\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0012²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00038\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0011\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "initialValue", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "", "isFocused", "", "onValueChanged", "b", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "currentValue", "monthPickerValue", "focused", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class E {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14915S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f170884a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f170885b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f170886c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<String, Boolean, Unit> f170887d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f170888e;

        /* JADX WARN: Multi-variable type inference failed */
        a(String str, LocalThemeScope localThemeScope, Modifier modifier, Function2<? super String, ? super Boolean, Unit> function2, InterfaceC5730l0<Boolean> interfaceC5730l0) {
            this.f170884a = str;
            this.f170885b = localThemeScope;
            this.f170886c = modifier;
            this.f170887d = function2;
            this.f170888e = interfaceC5730l0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5730l0 interfaceC5730l0, androidx.compose.ui.focus.E state) {
            Intrinsics.j(state, "state");
            E.d(interfaceC5730l0, state.a());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(List list, Function2 function2, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, String str, int i10) {
            Intrinsics.j(str, "<unused var>");
            f(interfaceC5730l0, (String) list.get(i10));
            function2.invoke(list.get(i10), Boolean.valueOf(E.c(interfaceC5730l02)));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC14915S interfaceC14915S, String str, Ai.n0 AdsDropdown) {
            Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
            AdsDropdown.d(interfaceC14915S.getLabels().getLabel(), str);
            return Unit.f142422a;
        }

        public final void d(final InterfaceC14915S Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(974309207, i10, -1, "com.meijer.mobile.ui.common.MonthPicker.<anonymous> (MonthPicker.kt:37)");
            }
            final List listI1 = ArraysKt.i1(C16193g.b(O.f170955a, composer, 0));
            final String strC = C16193g.c(Q.f170992e, composer, 0);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f170884a);
            String str = this.f170884a;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = t1.e(str, null, 2, null);
                composer.t(objB);
            }
            final InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            composer.P();
            LocalThemeScope localThemeScope = this.f170885b;
            Modifier modifier = this.f170886c;
            composer.startReplaceGroup(5004770);
            final InterfaceC5730l0<Boolean> interfaceC5730l02 = this.f170888e;
            Object objB2 = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB2 == companion.a()) {
                objB2 = new Function1() { // from class: yr.B
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return E.a.g(interfaceC5730l02, (androidx.compose.ui.focus.E) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            Modifier modifierA = C5761d.a(modifier, (Function1) objB2);
            String strE = e(interfaceC5730l0);
            if (strE == null) {
                strE = (String) CollectionsKt.s0(listI1);
            }
            q1.f.Dropdown dropdownB = Ai.m0.b(Assemble.getInputFields(), false, false, false, false, false, null, 63, null);
            composer.startReplaceGroup(-1224400529);
            boolean zV2 = composer.V(interfaceC5730l0) | composer.D(listI1) | composer.V(this.f170887d);
            final Function2<String, Boolean, Unit> function2 = this.f170887d;
            final InterfaceC5730l0<Boolean> interfaceC5730l03 = this.f170888e;
            Object objB3 = composer.B();
            if (zV2 || objB3 == companion.a()) {
                objB3 = new Function2() { // from class: yr.C
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return E.a.k(listI1, function2, interfaceC5730l0, interfaceC5730l03, (String) obj, ((Integer) obj2).intValue());
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
                        return E.a.l(Assemble, strC, (Ai.n0) obj);
                    }
                };
                composer.t(objB4);
            }
            composer.P();
            C2857v.v(localThemeScope, modifierA, strE, dropdownB, listI1, function22, (Function1) objB4, composer, LocalThemeScope.f15770g | (q1.f.Dropdown.f139995m << 9), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14915S interfaceC14915S, Composer composer, Integer num) {
            d(interfaceC14915S, composer, num.intValue());
            return Unit.f142422a;
        }

        private static final String e(InterfaceC5730l0<String> interfaceC5730l0) {
            return interfaceC5730l0.getValue();
        }

        private static final void f(InterfaceC5730l0<String> interfaceC5730l0, String str) {
            interfaceC5730l0.setValue(str);
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
            H0 h02 = H0.f139668a;
            a aVar = new a(str2, localThemeScope, modifier3, onValueChanged, (InterfaceC5730l0) objB);
            str = str2;
            Ji.Q.e(localThemeScope, h02, ComposableLambdaKt.c(974309207, true, aVar, composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f15770g | 384 | (i15 & 14) | (H0.f139669b << 3));
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
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }
}
