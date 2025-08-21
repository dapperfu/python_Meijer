package Jh;

import Ai.C2832m0;
import Ai.H1;
import Jh.G;
import Ki.C;
import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.text.C5835z;
import androidx.compose.foundation.text.InterfaceC5834y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5905f;
import androidx.compose.ui.focus.InterfaceC5914o;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.KeyboardType;
import bk.AbstractC6392a;
import bk.C6393b;
import dk.C13698b;
import j0.C14889J;
import ki.DefaultTextInputs;
import ki.InterfaceC15153W;
import ki.q1;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qi.C16671b;
import z1.TransformedText;
import z1.W;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a\u0088\u0001\u0010\u0013\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00012!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017²\u0006\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "caption", "Lbk/a;", "error", "Landroidx/compose/ui/Modifier;", "modifier", "phoneNumber", "captionContentDescription", "placeHolder", "", "showErrorIcon", "optionalString", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newValue", "", "onPhoneNumberChanged", "c", "(LKi/M;Ljava/lang/String;Lbk/a;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "lastAction", "showError", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class G {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f15743a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f15744b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f15745c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f15746d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f15747e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f15748f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f15749g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Jh.G$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0260a implements W, FunctionAdapter {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ H f15750a;

            C0260a(H h10) {
                this.f15750a = h10;
            }

            @Override // z1.W
            public final TransformedText a(AnnotatedString p02) {
                Intrinsics.j(p02, "p0");
                return this.f15750a.a(p02);
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof W) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new FunctionReferenceImpl(1, this.f15750a, H.class, "formatter", "formatter(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f15751a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f15752b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC15153W f15753c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f15754d;

            b(boolean z10, LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W, AbstractC6392a abstractC6392a) {
                this.f15751a = z10;
                this.f15752b = localThemeScope;
                this.f15753c = interfaceC15153W;
                this.f15754d = abstractC6392a;
            }

            public final void a(Composer composer, int i10) {
                Composer composer2;
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(606051057, i10, -1, "com.meijer.mobile.accounts.ux.composables.PhoneNumberInputField.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PhoneNumberInputField.kt:111)");
                }
                boolean z10 = this.f15751a;
                LocalThemeScope localThemeScope = this.f15752b;
                InterfaceC15153W interfaceC15153W = this.f15753c;
                AbstractC6392a abstractC6392a = this.f15754d;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyB, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14889J c14889j = C14889J.f139620a;
                composer.startReplaceGroup(1882256881);
                if (z10) {
                    composer2 = composer;
                    C16671b.b(localThemeScope, interfaceC15153W.getIcons().getInfoBlockIcon(), C.i.e.f17096d, null, composer2, LocalThemeScope.f17314g | (q1.h.DrawableIcon.f142322h << 3) | (C.i.e.f17097e << 6), 4);
                } else {
                    composer2 = composer;
                }
                composer2.P();
                si.j.h(localThemeScope, interfaceC15153W.getLabels().getInfoBlockMessage(), C13698b.a(abstractC6392a, composer2, AbstractC6392a.f60445b), null, composer2, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                composer2.v();
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
        a(LocalThemeScope localThemeScope, String str, AbstractC6392a abstractC6392a, InterfaceC5914o interfaceC5914o, Function1<? super String, Unit> function1, String str2, boolean z10) {
            this.f15743a = localThemeScope;
            this.f15744b = str;
            this.f15745c = abstractC6392a;
            this.f15746d = interfaceC5914o;
            this.f15747e = function1;
            this.f15748f = str2;
            this.f15749g = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextInput f(final InterfaceC5914o interfaceC5914o, q1.f.TextInput template) {
            Intrinsics.j(template, "template");
            return q1.f.TextInput.y(template, null, false, null, null, new C0260a(H.f15755a), KeyboardOptions.c(KeyboardOptions.INSTANCE.a(), 0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.d(), null, null, null, 115, null), new C5835z(new Function1() { // from class: Jh.E
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return G.a.g(interfaceC5914o, (InterfaceC5834y) obj);
                }
            }, null, new Function1() { // from class: Jh.F
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return G.a.k(interfaceC5914o, (InterfaceC5834y) obj);
                }
            }, null, null, null, 58, null), false, 0, null, null, null, 3983, null);
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
        public static final Unit l(String str, AbstractC6392a abstractC6392a, InterfaceC15153W interfaceC15153W, boolean z10, LocalThemeScope localThemeScope, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            if (str != null) {
                AdsInputField.i(interfaceC15153W.getLabels().getPlaceholder(), str);
            }
            if (!C6393b.a(abstractC6392a)) {
                AdsInputField.e(interfaceC15153W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(606051057, true, new b(z10, localThemeScope, interfaceC15153W, abstractC6392a)));
            }
            return Unit.f143329a;
        }

        public final void e(final InterfaceC15153W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-163326565, i10, -1, "com.meijer.mobile.accounts.ux.composables.PhoneNumberInputField.<anonymous>.<anonymous> (PhoneNumberInputField.kt:89)");
            }
            LocalThemeScope localThemeScope = this.f15743a;
            String str = this.f15744b;
            DefaultTextInputs inputFields = Assemble.getInputFields();
            boolean z10 = !C6393b.a(this.f15745c);
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(this.f15746d);
            final InterfaceC5914o interfaceC5914o = this.f15746d;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Jh.C
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return G.a.f(interfaceC5914o, (q1.f.TextInput) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.f.TextInput textInputF = Cr.f.f(inputFields, z10, false, false, (Function1) objB, 6, null);
            Function1<String, Unit> function1 = this.f15747e;
            composer.startReplaceGroup(-1224400529);
            boolean zV = composer.V(this.f15748f) | composer.D(Assemble) | composer.D(this.f15745c) | composer.a(this.f15749g) | composer.D(this.f15743a);
            final String str2 = this.f15748f;
            final AbstractC6392a abstractC6392a = this.f15745c;
            final boolean z11 = this.f15749g;
            final LocalThemeScope localThemeScope2 = this.f15743a;
            Object objB2 = composer.B();
            if (zV || objB2 == Composer.INSTANCE.a()) {
                Function1 function12 = new Function1() { // from class: Jh.D
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return G.a.l(str2, abstractC6392a, Assemble, z11, localThemeScope2, (H1) obj);
                    }
                };
                composer.t(function12);
                objB2 = function12;
            }
            composer.P();
            C2832m0.i(localThemeScope, str, textInputF, null, function1, (Function1) objB2, composer, LocalThemeScope.f17314g | (q1.f.TextInput.f142293m << 6), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            e(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ki.LocalThemeScope r45, final java.lang.String r46, final bk.AbstractC6392a r47, androidx.compose.ui.Modifier r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, boolean r52, java.lang.String r53, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r54, androidx.compose.runtime.Composer r55, final int r56, final int r57) {
        /*
            Method dump skipped, instructions count: 1029
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Jh.G.c(Ki.M, java.lang.String, bk.a, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(String str, String str2, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        if (str == null) {
            str = str2;
        }
        r1.s.g0(semantics, str);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, String str, AbstractC6392a abstractC6392a, Modifier modifier, String str2, String str3, String str4, boolean z10, String str5, Function1 function1, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, str, abstractC6392a, modifier, str2, str3, str4, z10, str5, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
