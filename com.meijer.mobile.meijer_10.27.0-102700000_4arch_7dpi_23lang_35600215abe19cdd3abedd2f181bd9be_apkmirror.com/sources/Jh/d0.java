package Jh;

import Ai.C2857v;
import Ai.n0;
import Jh.d0;
import Ji.LocalThemeScope;
import ak.AbstractC5607a;
import ak.C5608b;
import androidx.compose.foundation.text.C5693z;
import androidx.compose.foundation.text.InterfaceC5692y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5763f;
import androidx.compose.ui.focus.InterfaceC5772o;
import ck.C6408b;
import java.util.List;
import ji.DefaultDropdownInputs;
import ji.InterfaceC14915S;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16193g;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001as\u0010\u0011\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u000726\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0016²\u0006\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "initialValue", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/text/A;", "keyboardOptions", "Lak/a;", "error", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "", "index", "", "onValueChange", "b", "(LJi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/A;Lak/a;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "lastAction", "", "showError", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class d0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14915S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f15247a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f15248b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f15249c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f15250d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ KeyboardOptions f15251e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f15252f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<String, Integer, Unit> f15253g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f15254h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Jh.d0$a$a, reason: collision with other inner class name */
        static final class C0242a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f15255a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14915S f15256b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f15257c;

            C0242a(LocalThemeScope localThemeScope, InterfaceC14915S interfaceC14915S, AbstractC5607a abstractC5607a) {
                this.f15255a = localThemeScope;
                this.f15256b = interfaceC14915S;
                this.f15257c = abstractC5607a;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-497149851, i10, -1, "com.meijer.mobile.accounts.ux.composables.addresses.StatesDropDown.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StatesDropDown.kt:68)");
                }
                ri.j.h(this.f15255a, this.f15256b.getLabels().getInfoBlockMessage(), C6408b.a(this.f15257c, composer, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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
        a(LocalThemeScope localThemeScope, Modifier modifier, String str, AbstractC5607a abstractC5607a, KeyboardOptions keyboardOptions, InterfaceC5772o interfaceC5772o, Function2<? super String, ? super Integer, Unit> function2, String str2) {
            this.f15247a = localThemeScope;
            this.f15248b = modifier;
            this.f15249c = str;
            this.f15250d = abstractC5607a;
            this.f15251e = keyboardOptions;
            this.f15252f = interfaceC5772o;
            this.f15253g = function2;
            this.f15254h = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.Dropdown f(KeyboardOptions keyboardOptions, final InterfaceC5772o interfaceC5772o, q1.f.Dropdown template) {
            Intrinsics.j(template, "template");
            return q1.f.Dropdown.y(template, null, false, null, null, null, keyboardOptions, new C5693z(new Function1() { // from class: Jh.b0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d0.a.g(interfaceC5772o, (InterfaceC5692y) obj);
                }
            }, null, new Function1() { // from class: Jh.c0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d0.a.k(interfaceC5772o, (InterfaceC5692y) obj);
                }
            }, null, null, null, 58, null), false, 0, null, null, null, 3999, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5772o interfaceC5772o, InterfaceC5692y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            InterfaceC5772o.l(interfaceC5772o, false, 1, null);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC5772o interfaceC5772o, InterfaceC5692y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            interfaceC5772o.e(C5763f.INSTANCE.a());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC14915S interfaceC14915S, String str, AbstractC5607a abstractC5607a, LocalThemeScope localThemeScope, n0 AdsDropdown) {
            Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
            AdsDropdown.d(interfaceC14915S.getLabels().getLabel(), str);
            if (!C5608b.a(abstractC5607a)) {
                AdsDropdown.f(interfaceC14915S.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(-497149851, true, new C0242a(localThemeScope, interfaceC14915S, abstractC5607a)));
            }
            return Unit.f142422a;
        }

        public final void e(final InterfaceC14915S Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(805658955, i10, -1, "com.meijer.mobile.accounts.ux.composables.addresses.StatesDropDown.<anonymous> (StatesDropDown.kt:50)");
            }
            LocalThemeScope localThemeScope = this.f15247a;
            Modifier modifier = this.f15248b;
            String str = this.f15249c;
            DefaultDropdownInputs inputFields = Assemble.getInputFields();
            boolean z10 = !C5608b.a(this.f15250d);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f15251e) | composer.D(this.f15252f);
            final KeyboardOptions keyboardOptions = this.f15251e;
            final InterfaceC5772o interfaceC5772o = this.f15252f;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Jh.Z
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return d0.a.f(keyboardOptions, interfaceC5772o, (q1.f.Dropdown) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.f.Dropdown dropdownC = Cr.c.c(inputFields, z10, false, false, (Function1) objB, 6, null);
            List listI1 = ArraysKt.i1(C16193g.b(Fh.d.f10439a, composer, 0));
            Function2<String, Integer, Unit> function2 = this.f15253g;
            composer.startReplaceGroup(-1224400529);
            boolean zD = composer.D(Assemble) | composer.V(this.f15254h) | composer.D(this.f15250d) | composer.D(this.f15247a);
            final String str2 = this.f15254h;
            final AbstractC5607a abstractC5607a = this.f15250d;
            final LocalThemeScope localThemeScope2 = this.f15247a;
            Object objB2 = composer.B();
            if (zD || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: Jh.a0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return d0.a.l(Assemble, str2, abstractC5607a, localThemeScope2, (n0) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            C2857v.v(localThemeScope, modifier, str, dropdownC, listI1, function2, (Function1) objB2, composer, (q1.f.Dropdown.f139995m << 9) | LocalThemeScope.f15770g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14915S interfaceC14915S, Composer composer, Integer num) {
            e(interfaceC14915S, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r14, final java.lang.String r15, androidx.compose.ui.Modifier r16, androidx.compose.foundation.text.KeyboardOptions r17, ak.AbstractC5607a r18, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Jh.d0.b(Ji.M, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.foundation.text.A, ak.a, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, String str, Modifier modifier, KeyboardOptions keyboardOptions, AbstractC5607a abstractC5607a, Function2 function2, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, str, modifier, keyboardOptions, abstractC5607a, function2, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
