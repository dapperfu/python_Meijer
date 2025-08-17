package jr;

import Ai.C2857v;
import Ai.m0;
import Ai.n0;
import Ji.LocalThemeScope;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import java.util.List;
import ji.InterfaceC14915S;
import ji.q1;
import jr.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import yr.C18299z;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a\u0087\u0001\u0010\u0012\u001a\u00020\u0010*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u000326\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0017²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00038\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "selectOptionHint", "label", "", "items", "initialValue", "identifier", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "", "isFocused", "", "onValueChanged", "b", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "currentValue", "subscriptionPickerValue", "focused", "ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class h {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14915S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f141029a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f141030b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f141031c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f141032d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List<String> f141033e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<String, Boolean, Unit> f141034f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f141035g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f141036h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f141037i;

        /* JADX WARN: Multi-variable type inference failed */
        a(String str, LocalThemeScope localThemeScope, Modifier modifier, String str2, List<String> list, Function2<? super String, ? super Boolean, Unit> function2, String str3, String str4, InterfaceC5730l0<Boolean> interfaceC5730l0) {
            this.f141029a = str;
            this.f141030b = localThemeScope;
            this.f141031c = modifier;
            this.f141032d = str2;
            this.f141033e = list;
            this.f141034f = function2;
            this.f141035g = str3;
            this.f141036h = str4;
            this.f141037i = interfaceC5730l0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(List list, Function2 function2, InterfaceC5730l0 interfaceC5730l0, InterfaceC5730l0 interfaceC5730l02, String str, int i10) {
            Intrinsics.j(str, "<unused var>");
            e(interfaceC5730l0, (String) list.get(i10));
            function2.invoke(list.get(i10), Boolean.valueOf(h.c(interfaceC5730l02)));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC14915S interfaceC14915S, String str, String str2, n0 AdsDropdown) {
            Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
            AdsDropdown.d(interfaceC14915S.getLabels().getLabel(), str);
            AdsDropdown.i(interfaceC14915S.getLabels().getPlaceholder(), str2);
            return Unit.f142422a;
        }

        public final void c(final InterfaceC14915S Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1308310670, i10, -1, "com.meijer.mobile.subscription.ui.SubscriptionPicker.<anonymous> (SubscriptionPicker.kt:40)");
            }
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f141029a);
            String str = this.f141029a;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = t1.e(str, null, 2, null);
                composer.t(objB);
            }
            final InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            composer.P();
            LocalThemeScope localThemeScope = this.f141030b;
            Modifier modifierF = C18299z.f(D.i(J.h(this.f141031c, 0.0f, 1, null), this.f141030b.getAdsSpacing().getFive().getDp()), this.f141032d, null, 2, null);
            String strD = d(interfaceC5730l0);
            if (strD == null) {
                strD = "";
            }
            q1.f.Dropdown dropdownB = m0.b(Assemble.getInputFields(), false, false, false, false, false, null, 63, null);
            String str2 = strD;
            List<String> list = this.f141033e;
            composer.startReplaceGroup(-1224400529);
            boolean zV2 = composer.V(interfaceC5730l0) | composer.D(this.f141033e) | composer.V(this.f141034f);
            final List<String> list2 = this.f141033e;
            final Function2<String, Boolean, Unit> function2 = this.f141034f;
            final InterfaceC5730l0<Boolean> interfaceC5730l02 = this.f141037i;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function2() { // from class: jr.f
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return h.a.f(list2, function2, interfaceC5730l0, interfaceC5730l02, (String) obj, ((Integer) obj2).intValue());
                    }
                };
                composer.t(objB2);
            }
            Function2 function22 = (Function2) objB2;
            composer.P();
            composer.startReplaceGroup(-1746271574);
            boolean zD = composer.D(Assemble) | composer.V(this.f141035g) | composer.V(this.f141036h);
            final String str3 = this.f141035g;
            final String str4 = this.f141036h;
            Object objB3 = composer.B();
            if (zD || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function1() { // from class: jr.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return h.a.g(Assemble, str3, str4, (n0) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C2857v.v(localThemeScope, modifierF, str2, dropdownB, list, function22, (Function1) objB3, composer, LocalThemeScope.f15770g | (q1.f.Dropdown.f139995m << 9), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14915S interfaceC14915S, Composer composer, Integer num) {
            c(interfaceC14915S, composer, num.intValue());
            return Unit.f142422a;
        }

        private static final String d(InterfaceC5730l0<String> interfaceC5730l0) {
            return interfaceC5730l0.getValue();
        }

        private static final void e(InterfaceC5730l0<String> interfaceC5730l0, String str) {
            interfaceC5730l0.setValue(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(Ji.LocalThemeScope r17, androidx.compose.ui.Modifier r18, final java.lang.String r19, final java.lang.String r20, final java.util.List<java.lang.String> r21, java.lang.String r22, final java.lang.String r23, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jr.h.b(Ji.M, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LocalThemeScope localThemeScope, Modifier modifier, String str, String str2, List list, String str3, String str4, Function2 function2, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, str, str2, list, str3, str4, function2, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }
}
