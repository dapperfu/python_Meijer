package Kh;

import Bi.C2962v;
import Bi.n0;
import Kh.d0;
import Ki.LocalThemeScope;
import androidx.compose.foundation.text.C5835z;
import androidx.compose.foundation.text.InterfaceC5834y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5905f;
import androidx.compose.ui.focus.InterfaceC5914o;
import bk.AbstractC6392a;
import bk.C6393b;
import com.fullstory.compose.FullStoryAnnotationsKt;
import dk.C13698b;
import java.util.List;
import ki.DefaultDropdownInputs;
import ki.InterfaceC15149S;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16338g;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001as\u0010\u0011\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u000726\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0016²\u0006\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "initialValue", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/text/A;", "keyboardOptions", "Lbk/a;", "error", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "", "index", "", "onValueChange", "b", "(LKi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/A;Lbk/a;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "lastAction", "", "showError", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class d0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC15149S, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f16790a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f16791b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f16792c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f16793d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ KeyboardOptions f16794e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f16795f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<String, Integer, Unit> f16796g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f16797h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Kh.d0$a$a, reason: collision with other inner class name */
        static final class C0284a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f16798a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15149S f16799b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f16800c;

            C0284a(LocalThemeScope localThemeScope, InterfaceC15149S interfaceC15149S, AbstractC6392a abstractC6392a) {
                this.f16798a = localThemeScope;
                this.f16799b = interfaceC15149S;
                this.f16800c = abstractC6392a;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-497149851, i10, -1, "com.meijer.mobile.accounts.ux.composables.addresses.StatesDropDown.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StatesDropDown.kt:70)");
                }
                si.j.h(this.f16798a, this.f16799b.getLabels().getInfoBlockMessage(), C13698b.a(this.f16800c, composer, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
        a(LocalThemeScope localThemeScope, Modifier modifier, String str, AbstractC6392a abstractC6392a, KeyboardOptions keyboardOptions, InterfaceC5914o interfaceC5914o, Function2<? super String, ? super Integer, Unit> function2, String str2) {
            this.f16790a = localThemeScope;
            this.f16791b = modifier;
            this.f16792c = str;
            this.f16793d = abstractC6392a;
            this.f16794e = keyboardOptions;
            this.f16795f = interfaceC5914o;
            this.f16796g = function2;
            this.f16797h = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.Dropdown f(KeyboardOptions keyboardOptions, final InterfaceC5914o interfaceC5914o, q1.f.Dropdown template) {
            Intrinsics.j(template, "template");
            return q1.f.Dropdown.y(template, template.getModifier().then(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE)), false, null, null, null, keyboardOptions, new C5835z(new Function1() { // from class: Kh.b0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d0.a.g(interfaceC5914o, (InterfaceC5834y) obj);
                }
            }, null, new Function1() { // from class: Kh.c0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d0.a.k(interfaceC5914o, (InterfaceC5834y) obj);
                }
            }, null, null, null, 58, null), false, 0, null, null, null, 3998, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(InterfaceC5914o interfaceC5914o, InterfaceC5834y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            InterfaceC5914o.l(interfaceC5914o, false, 1, null);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC5914o interfaceC5914o, InterfaceC5834y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            interfaceC5914o.e(C5905f.INSTANCE.a());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC15149S interfaceC15149S, String str, AbstractC6392a abstractC6392a, LocalThemeScope localThemeScope, n0 AdsDropdown) {
            Intrinsics.j(AdsDropdown, "$this$AdsDropdown");
            AdsDropdown.d(interfaceC15149S.getLabels().getLabel(), str);
            if (!C6393b.a(abstractC6392a)) {
                AdsDropdown.e(interfaceC15149S.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(-497149851, true, new C0284a(localThemeScope, interfaceC15149S, abstractC6392a)));
            }
            return Unit.f143329a;
        }

        public final void e(final InterfaceC15149S Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(805658955, i10, -1, "com.meijer.mobile.accounts.ux.composables.addresses.StatesDropDown.<anonymous> (StatesDropDown.kt:51)");
            }
            LocalThemeScope localThemeScope = this.f16790a;
            Modifier modifierThen = this.f16791b.then(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE));
            String str = this.f16792c;
            DefaultDropdownInputs inputFields = Assemble.getInputFields();
            boolean z10 = !C6393b.a(this.f16793d);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f16794e) | composer.D(this.f16795f);
            final KeyboardOptions keyboardOptions = this.f16794e;
            final InterfaceC5914o interfaceC5914o = this.f16795f;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Kh.Z
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return d0.a.f(keyboardOptions, interfaceC5914o, (q1.f.Dropdown) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.f.Dropdown dropdownC = Cr.c.c(inputFields, z10, false, false, (Function1) objB, 6, null);
            List listH1 = ArraysKt.h1(C16338g.b(Gh.d.f12630a, composer, 0));
            Function2<String, Integer, Unit> function2 = this.f16796g;
            composer.startReplaceGroup(-1224400529);
            boolean zD = composer.D(Assemble) | composer.V(this.f16797h) | composer.D(this.f16793d) | composer.D(this.f16790a);
            final String str2 = this.f16797h;
            final AbstractC6392a abstractC6392a = this.f16793d;
            final LocalThemeScope localThemeScope2 = this.f16790a;
            Object objB2 = composer.B();
            if (zD || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: Kh.a0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return d0.a.l(Assemble, str2, abstractC6392a, localThemeScope2, (n0) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            C2962v.v(localThemeScope, modifierThen, str, dropdownC, listH1, function2, (Function1) objB2, composer, (q1.f.Dropdown.f142250m << 9) | LocalThemeScope.f17314g, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15149S interfaceC15149S, Composer composer, Integer num) {
            e(interfaceC15149S, composer, num.intValue());
            return Unit.f143329a;
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
    public static final void b(final Ki.LocalThemeScope r14, final java.lang.String r15, androidx.compose.ui.Modifier r16, androidx.compose.foundation.text.KeyboardOptions r17, bk.AbstractC6392a r18, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Kh.d0.b(Ki.M, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.foundation.text.A, bk.a, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, String str, Modifier modifier, KeyboardOptions keyboardOptions, AbstractC6392a abstractC6392a, Function2 function2, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, str, modifier, keyboardOptions, abstractC6392a, function2, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
