package Lh;

import Ji.LocalThemeScope;
import Lh.r;
import androidx.compose.foundation.text.C5693z;
import androidx.compose.foundation.text.InterfaceC5692y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5763f;
import androidx.compose.ui.focus.InterfaceC5772o;
import androidx.compose.ui.text.input.KeyboardType;
import com.fullstory.compose.FullStoryAnnotationsKt;
import ji.DefaultTextInputs;
import ji.InterfaceC14919W;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.A0;
import ni.P0;
import p1.C16193g;
import r1.C16705m;
import zi.C18504m0;
import zi.H1;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001ad\u0010\u000e\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012²\u0006\u000e\u0010\u0011\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "caption", "password", "placeHolder", "Landroidx/compose/ui/Modifier;", "modifier", "captionContentDescription", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newValue", "", "onValueChange", "b", "(LJi/M;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "showPassword", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class r {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f18331a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f18332b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f18333c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f18334d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f18335e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f18336f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f18337g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f18338h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f18339i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Lh.r$a$a, reason: collision with other inner class name */
        static final class C0308a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f18340a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f18341b;

            public final void b(Composer composer, int i10) {
                String strC;
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-2075647907, i10, -1, "com.meijer.mobile.accounts.ux.composables.createaccount.CreateAccountPasswordField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreateAccountPasswordField.kt:85)");
                }
                LocalThemeScope localThemeScope = this.f18340a;
                A0 a02 = A0.f151413a;
                if (r.c(this.f18341b)) {
                    composer.startReplaceGroup(-982471352);
                    strC = C16193g.c(Fh.h.f10832z1, composer, 0);
                    composer.P();
                } else {
                    composer.startReplaceGroup(-982373144);
                    strC = C16193g.c(Fh.h.f10590Q4, composer, 0);
                    composer.P();
                }
                composer.startReplaceGroup(5004770);
                final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f18341b;
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Lh.q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return r.a.C0308a.c(interfaceC5730l0);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                P0.k(localThemeScope, a02, strC, (Function0) objB, null, null, false, 0L, false, composer, LocalThemeScope.f15770g | 3072 | (A0.f151414b << 3), 248);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            C0308a(LocalThemeScope localThemeScope, InterfaceC5730l0<Boolean> interfaceC5730l0) {
                this.f18340a = localThemeScope;
                this.f18341b = interfaceC5730l0;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(InterfaceC5730l0 interfaceC5730l0) {
                r.d(interfaceC5730l0, !r.c(interfaceC5730l0));
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(Modifier modifier, InterfaceC5772o interfaceC5772o, LocalThemeScope localThemeScope, String str, Function1<? super String, Unit> function1, String str2, String str3, String str4, InterfaceC5730l0<Boolean> interfaceC5730l0) {
            this.f18331a = modifier;
            this.f18332b = interfaceC5772o;
            this.f18333c = localThemeScope;
            this.f18334d = str;
            this.f18335e = function1;
            this.f18336f = str2;
            this.f18337g = str3;
            this.f18338h = str4;
            this.f18339i = interfaceC5730l0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextInput g(InterfaceC5730l0 interfaceC5730l0, final InterfaceC5772o interfaceC5772o, q1.f.TextInput template) {
            Intrinsics.j(template, "template");
            return q1.f.TextInput.y(template, null, false, null, null, r.c(interfaceC5730l0) ? z1.W.INSTANCE.c() : new z1.G((char) 0, 1, null), new KeyboardOptions(0, null, KeyboardType.INSTANCE.f(), androidx.compose.ui.text.input.a.INSTANCE.d(), null, null, null, 115, null), new C5693z(null, null, new Function1() { // from class: Lh.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return r.a.k(interfaceC5772o, (InterfaceC5692y) obj);
                }
            }, null, null, null, 59, null), false, 0, null, null, null, 3983, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC5772o interfaceC5772o, InterfaceC5692y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            interfaceC5772o.e(C5763f.INSTANCE.a());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(Function1 function1, String it) {
            Intrinsics.j(it, "it");
            function1.invoke(it);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(InterfaceC14919W interfaceC14919W, final String str, String str2, final String str3, LocalThemeScope localThemeScope, InterfaceC5730l0 interfaceC5730l0, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(q1.Label.y(interfaceC14919W.getLabels().getLabel(), C16705m.d(interfaceC14919W.getLabels().getLabel().getModifier(), false, new Function1() { // from class: Lh.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return r.a.p(str3, str, (r1.u) obj);
                }
            }, 1, null), null, null, null, 0, false, 0, null, null, 510, null), str);
            AdsInputField.i(interfaceC14919W.getLabels().getPlaceholder(), str2);
            AdsInputField.C(ComposableLambdaKt.composableLambdaInstance(-2075647907, true, new C0308a(localThemeScope, interfaceC5730l0)));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(String str, String str2, r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            if (str == null) {
                str = str2;
            }
            r1.s.g0(semantics, str);
            return Unit.f142422a;
        }

        public final void f(final InterfaceC14919W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1356685546, i10, -1, "com.meijer.mobile.accounts.ux.composables.createaccount.CreateAccountPasswordField.<anonymous> (CreateAccountPasswordField.kt:50)");
            }
            Modifier modifierFsMask = FullStoryAnnotationsKt.fsMask(this.f18331a);
            DefaultTextInputs inputFields = Assemble.getInputFields();
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(this.f18332b);
            final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f18339i;
            final InterfaceC5772o interfaceC5772o = this.f18332b;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Lh.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return r.a.g(interfaceC5730l0, interfaceC5772o, (q1.f.TextInput) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.f.TextInput textInputF = Cr.f.f(inputFields, false, false, false, (Function1) objB, 7, null);
            LocalThemeScope localThemeScope = this.f18333c;
            String str = this.f18334d;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f18335e);
            final Function1<String, Unit> function1 = this.f18335e;
            Object objB2 = composer.B();
            if (zV || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: Lh.m
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
            boolean zD2 = composer.D(Assemble) | composer.V(this.f18336f) | composer.V(this.f18337g) | composer.V(this.f18338h) | composer.D(this.f18333c);
            final String str2 = this.f18337g;
            final String str3 = this.f18338h;
            final String str4 = this.f18336f;
            final LocalThemeScope localThemeScope2 = this.f18333c;
            final InterfaceC5730l0<Boolean> interfaceC5730l02 = this.f18339i;
            Object objB3 = composer.B();
            if (zD2 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new Function1() { // from class: Lh.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return r.a.o(Assemble, str2, str3, str4, localThemeScope2, interfaceC5730l02, (H1) obj);
                    }
                };
                composer.t(objB3);
            }
            composer.P();
            C18504m0.i(localThemeScope, str, textInputF, modifierFsMask, function12, (Function1) objB3, composer, LocalThemeScope.f15770g | (q1.f.TextInput.f140038m << 6), 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            f(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
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
    public static final void b(Ji.LocalThemeScope r16, final java.lang.String r17, final java.lang.String r18, final java.lang.String r19, androidx.compose.ui.Modifier r20, java.lang.String r21, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.r.b(Ji.M, java.lang.String, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, String str, String str2, String str3, Modifier modifier, String str4, Function1 function1, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, str, str2, str3, modifier, str4, function1, composer, J0.a(i10 | 1), i11);
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
