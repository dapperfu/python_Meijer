package Mh;

import Ai.C2832m0;
import Ai.H1;
import Ki.LocalThemeScope;
import Mh.r;
import androidx.compose.foundation.text.C5835z;
import androidx.compose.foundation.text.InterfaceC5834y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5905f;
import androidx.compose.ui.focus.InterfaceC5914o;
import androidx.compose.ui.text.input.KeyboardType;
import com.fullstory.compose.FullStoryAnnotationsKt;
import ki.DefaultTextInputs;
import ki.InterfaceC15153W;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.A0;
import oi.P0;
import p1.C16338g;
import r1.C16819m;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001ad\u0010\u000e\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012²\u0006\u000e\u0010\u0011\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "caption", "password", "placeHolder", "Landroidx/compose/ui/Modifier;", "modifier", "captionContentDescription", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newValue", "", "onValueChange", "b", "(LKi/M;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "showPassword", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class r {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f20140a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f20141b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f20142c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f20143d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f20144e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f20145f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f20146g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f20147h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f20148i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Mh.r$a$a, reason: collision with other inner class name */
        static final class C0350a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f20149a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f20150b;

            public final void b(Composer composer, int i10) {
                String strC;
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-2075647907, i10, -1, "com.meijer.mobile.accounts.ux.composables.createaccount.CreateAccountPasswordField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreateAccountPasswordField.kt:85)");
                }
                LocalThemeScope localThemeScope = this.f20149a;
                A0 a02 = A0.f153872a;
                if (r.c(this.f20150b)) {
                    composer.startReplaceGroup(-982471352);
                    strC = C16338g.c(Gh.h.f13023z1, composer, 0);
                    composer.P();
                } else {
                    composer.startReplaceGroup(-982373144);
                    strC = C16338g.c(Gh.h.f12781Q4, composer, 0);
                    composer.P();
                }
                composer.startReplaceGroup(5004770);
                final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f20150b;
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Mh.q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return r.a.C0350a.c(interfaceC5872l0);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                P0.k(localThemeScope, a02, strC, (Function0) objB, null, null, false, 0L, false, composer, LocalThemeScope.f17314g | 3072 | (A0.f153873b << 3), 248);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            C0350a(LocalThemeScope localThemeScope, InterfaceC5872l0<Boolean> interfaceC5872l0) {
                this.f20149a = localThemeScope;
                this.f20150b = interfaceC5872l0;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(InterfaceC5872l0 interfaceC5872l0) {
                r.d(interfaceC5872l0, !r.c(interfaceC5872l0));
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(Modifier modifier, InterfaceC5914o interfaceC5914o, LocalThemeScope localThemeScope, String str, Function1<? super String, Unit> function1, String str2, String str3, String str4, InterfaceC5872l0<Boolean> interfaceC5872l0) {
            this.f20140a = modifier;
            this.f20141b = interfaceC5914o;
            this.f20142c = localThemeScope;
            this.f20143d = str;
            this.f20144e = function1;
            this.f20145f = str2;
            this.f20146g = str3;
            this.f20147h = str4;
            this.f20148i = interfaceC5872l0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextInput g(InterfaceC5872l0 interfaceC5872l0, final InterfaceC5914o interfaceC5914o, q1.f.TextInput template) {
            Intrinsics.j(template, "template");
            return q1.f.TextInput.y(template, null, false, null, null, r.c(interfaceC5872l0) ? z1.W.INSTANCE.c() : new z1.G((char) 0, 1, null), new KeyboardOptions(0, null, KeyboardType.INSTANCE.f(), androidx.compose.ui.text.input.a.INSTANCE.d(), null, null, null, 115, null), new C5835z(null, null, new Function1() { // from class: Mh.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return r.a.k(interfaceC5914o, (InterfaceC5834y) obj);
                }
            }, null, null, null, 59, null), false, 0, null, null, null, 3983, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC5914o interfaceC5914o, InterfaceC5834y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            interfaceC5914o.e(C5905f.INSTANCE.a());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(Function1 function1, String it) {
            Intrinsics.j(it, "it");
            function1.invoke(it);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(InterfaceC15153W interfaceC15153W, final String str, String str2, final String str3, LocalThemeScope localThemeScope, InterfaceC5872l0 interfaceC5872l0, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(q1.Label.y(interfaceC15153W.getLabels().getLabel(), C16819m.d(interfaceC15153W.getLabels().getLabel().getModifier(), false, new Function1() { // from class: Mh.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return r.a.p(str3, str, (r1.u) obj);
                }
            }, 1, null), null, null, null, 0, false, 0, null, null, 510, null), str);
            AdsInputField.i(interfaceC15153W.getLabels().getPlaceholder(), str2);
            AdsInputField.D(ComposableLambdaKt.composableLambdaInstance(-2075647907, true, new C0350a(localThemeScope, interfaceC5872l0)));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(String str, String str2, r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            if (str == null) {
                str = str2;
            }
            r1.s.g0(semantics, str);
            return Unit.f143329a;
        }

        public final void f(final InterfaceC15153W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1356685546, i10, -1, "com.meijer.mobile.accounts.ux.composables.createaccount.CreateAccountPasswordField.<anonymous> (CreateAccountPasswordField.kt:50)");
            }
            Modifier modifierFsMask = FullStoryAnnotationsKt.fsMask(this.f20140a);
            DefaultTextInputs inputFields = Assemble.getInputFields();
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(this.f20141b);
            final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f20148i;
            final InterfaceC5914o interfaceC5914o = this.f20141b;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Mh.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return r.a.g(interfaceC5872l0, interfaceC5914o, (q1.f.TextInput) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.f.TextInput textInputF = Cr.f.f(inputFields, false, false, false, (Function1) objB, 7, null);
            LocalThemeScope localThemeScope = this.f20142c;
            String str = this.f20143d;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f20144e);
            final Function1<String, Unit> function1 = this.f20144e;
            Object objB2 = composer.B();
            if (zV || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: Mh.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return r.a.l(function1, (String) obj);
                    }
                };
                composer.t(objB2);
            }
            Function1 function12 = (Function1) objB2;
            composer.P();
            composer.startReplaceGroup(-1224400529);
            boolean zD2 = composer.D(Assemble) | composer.V(this.f20145f) | composer.V(this.f20146g) | composer.V(this.f20147h) | composer.D(this.f20142c);
            final String str2 = this.f20146g;
            final String str3 = this.f20147h;
            final String str4 = this.f20145f;
            final LocalThemeScope localThemeScope2 = this.f20142c;
            final InterfaceC5872l0<Boolean> interfaceC5872l02 = this.f20148i;
            Object objB3 = composer.B();
            if (zD2 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function1() { // from class: Mh.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return r.a.o(Assemble, str2, str3, str4, localThemeScope2, interfaceC5872l02, (H1) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C2832m0.i(localThemeScope, str, textInputF, modifierFsMask, function12, (Function1) objB3, composer, LocalThemeScope.f17314g | (q1.f.TextInput.f142293m << 6), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            f(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(Ki.LocalThemeScope r16, final java.lang.String r17, final java.lang.String r18, final java.lang.String r19, androidx.compose.ui.Modifier r20, java.lang.String r21, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Mh.r.b(Ki.M, java.lang.String, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, String str, String str2, String str3, Modifier modifier, String str4, Function1 function1, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, str, str2, str3, modifier, str4, function1, composer, J0.a(i10 | 1), i11);
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
