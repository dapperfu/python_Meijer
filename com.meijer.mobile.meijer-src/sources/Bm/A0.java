package Bm;

import Ai.C2832m0;
import Ai.H1;
import Bm.A0;
import Ki.LocalThemeScope;
import android.content.res.Resources;
import androidx.compose.foundation.text.C5835z;
import androidx.compose.foundation.text.InterfaceC5834y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5914o;
import androidx.compose.ui.platform.C6034t0;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.KeyboardType;
import bk.AbstractC6392a;
import com.fullstory.compose.FullStoryAnnotationsKt;
import dk.C13698b;
import ki.DefaultTextInputs;
import ki.InterfaceC15153W;
import ki.N0;
import ki.q1;
import kotlin.InterfaceC6305e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p1.C16338g;
import r1.C16819m;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u001ac\u0010\u000f\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013²\u0006\f\u0010\u0011\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000e\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "isSelected", "isExpired", "", "selectedCardCvv", "", "validLength", "isEditMode", "Lkotlin/Function1;", "", "onCVVNumberEntered", "displayError", "b", "(LKi/M;Landroidx/compose/ui/Modifier;ZZLjava/lang/String;IZLkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "cardCVV", "cvvNumber", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class A0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC6305e, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f3156a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f3157b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f3158c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f3159d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f3160e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f3161f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f3162g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f3163h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f3164i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Bm.A0$a$a, reason: collision with other inner class name */
        static final class C0065a implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Modifier f3165a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f3166b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f3167c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5914o f3168d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f3169e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f3170f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function1<String, Unit> f3171g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f3172h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f3173i;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Bm.A0$a$a$a, reason: collision with other inner class name */
            static final class C0066a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f3174a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC15153W f3175b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ int f3176c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<String> f3177d;

                C0066a(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W, int i10, InterfaceC5872l0<String> interfaceC5872l0) {
                    this.f3174a = localThemeScope;
                    this.f3175b = interfaceC15153W;
                    this.f3176c = i10;
                    this.f3177d = interfaceC5872l0;
                }

                public final void a(Composer composer, int i10) throws Resources.NotFoundException {
                    String strD;
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1834332444, i10, -1, "com.meijer.mobile.meijer.activity.checkout.composables.SecurityCodeSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SecurityCodeSection.kt:96)");
                    }
                    LocalThemeScope localThemeScope = this.f3174a;
                    q1.Label infoBlockMessage = this.f3175b.getLabels().getInfoBlockMessage();
                    if (a.c(this.f3177d).length() == 0) {
                        composer.startReplaceGroup(1856892807);
                        strD = C16338g.c(com.meijer.mobile.meijer.Y.f101095o5, composer, 0);
                        composer.P();
                    } else {
                        composer.startReplaceGroup(1856895410);
                        strD = C16338g.d(com.meijer.mobile.meijer.Y.f101075n5, new Object[]{Integer.valueOf(this.f3176c)}, composer, 0);
                        composer.P();
                    }
                    si.j.h(localThemeScope, infoBlockMessage, strD, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
                    a(composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C0065a(Modifier modifier, boolean z10, String str, InterfaceC5914o interfaceC5914o, LocalThemeScope localThemeScope, int i10, Function1<? super String, Unit> function1, boolean z11, InterfaceC5872l0<String> interfaceC5872l0) {
                this.f3165a = modifier;
                this.f3166b = z10;
                this.f3167c = str;
                this.f3168d = interfaceC5914o;
                this.f3169e = localThemeScope;
                this.f3170f = i10;
                this.f3171g = function1;
                this.f3172h = z11;
                this.f3173i = interfaceC5872l0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final q1.f.TextInput g(final String str, final InterfaceC5914o interfaceC5914o, q1.f.TextInput template) {
                Intrinsics.j(template, "template");
                return q1.f.TextInput.y(template, C16819m.c(template.getModifier(), true, new Function1() { // from class: Bm.v0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return A0.a.C0065a.k(str, (r1.u) obj);
                    }
                }), false, null, null, null, new KeyboardOptions(0, null, KeyboardType.INSTANCE.e(), 0, null, null, null, 123, null), new C5835z(new Function1() { // from class: Bm.w0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return A0.a.C0065a.l(interfaceC5914o, (InterfaceC5834y) obj);
                    }
                }, null, null, null, null, null, 62, null), false, 0, null, null, null, 3998, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(String str, r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                r1.s.z0(semantics, new AnnotatedString(str, null, 2, null));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(InterfaceC5914o interfaceC5914o, InterfaceC5834y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                InterfaceC5914o.l(interfaceC5914o, false, 1, null);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(int i10, InterfaceC5914o interfaceC5914o, Function1 function1, String cvv) {
                Intrinsics.j(cvv, "cvv");
                if (cvv.length() == i10) {
                    InterfaceC5914o.l(interfaceC5914o, false, 1, null);
                }
                function1.invoke(StringsKt.N1(cvv, i10));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(boolean z10, boolean z11, InterfaceC15153W interfaceC15153W, LocalThemeScope localThemeScope, int i10, InterfaceC5872l0 interfaceC5872l0, H1 AdsInputField) {
                Intrinsics.j(AdsInputField, "$this$AdsInputField");
                if (z10 && z11) {
                    AdsInputField.e(interfaceC15153W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(1834332444, true, new C0066a(localThemeScope, interfaceC15153W, i10, interfaceC5872l0)));
                }
                return Unit.f143329a;
            }

            public final void f(final InterfaceC15153W Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-1423172558, i10, -1, "com.meijer.mobile.meijer.activity.checkout.composables.SecurityCodeSection.<anonymous>.<anonymous> (SecurityCodeSection.kt:73)");
                }
                Modifier modifierH = androidx.compose.foundation.layout.J.h(FullStoryAnnotationsKt.fsExclude(androidx.compose.foundation.layout.J.z(this.f3165a, H1.h.p(100))), 0.0f, 1, null);
                String strC = a.c(this.f3173i);
                DefaultTextInputs inputFields = Assemble.getInputFields();
                boolean z10 = this.f3166b;
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(this.f3167c) | composer.D(this.f3168d);
                final String str = this.f3167c;
                final InterfaceC5914o interfaceC5914o = this.f3168d;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: Bm.x0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return A0.a.C0065a.g(str, interfaceC5914o, (q1.f.TextInput) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                q1.f.TextInput textInputF = Cr.f.f(inputFields, z10, false, false, (Function1) objB, 6, null);
                LocalThemeScope localThemeScope = this.f3169e;
                composer.startReplaceGroup(-1746271574);
                boolean zD = composer.d(this.f3170f) | composer.D(this.f3168d) | composer.V(this.f3171g);
                final int i11 = this.f3170f;
                final InterfaceC5914o interfaceC5914o2 = this.f3168d;
                final Function1<String, Unit> function1 = this.f3171g;
                Object objB2 = composer.B();
                if (zD || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function1() { // from class: Bm.y0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return A0.a.C0065a.o(i11, interfaceC5914o2, function1, (String) obj);
                        }
                    };
                    composer.t(objB2);
                }
                Function1 function12 = (Function1) objB2;
                composer.P();
                composer.startReplaceGroup(-1224400529);
                boolean zA = composer.a(this.f3166b) | composer.a(this.f3172h) | composer.D(Assemble) | composer.D(this.f3169e) | composer.V(this.f3173i) | composer.d(this.f3170f);
                final boolean z11 = this.f3166b;
                final boolean z12 = this.f3172h;
                final LocalThemeScope localThemeScope2 = this.f3169e;
                final int i12 = this.f3170f;
                final InterfaceC5872l0<String> interfaceC5872l0 = this.f3173i;
                Object objB3 = composer.B();
                if (zA || objB3 == Composer.INSTANCE.a()) {
                    Function1 function13 = new Function1() { // from class: Bm.z0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return A0.a.C0065a.p(z11, z12, Assemble, localThemeScope2, i12, interfaceC5872l0, (H1) obj);
                        }
                    };
                    composer.t(function13);
                    objB3 = function13;
                }
                composer.P();
                C2832m0.i(localThemeScope, strC, textInputF, modifierH, function12, (Function1) objB3, composer, LocalThemeScope.f17314g | (q1.f.TextInput.f142293m << 6), 0);
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

        /* JADX WARN: Multi-variable type inference failed */
        a(String str, boolean z10, boolean z11, LocalThemeScope localThemeScope, Modifier modifier, boolean z12, int i10, Function1<? super String, Unit> function1, boolean z13) {
            this.f3156a = str;
            this.f3157b = z10;
            this.f3158c = z11;
            this.f3159d = localThemeScope;
            this.f3160e = modifier;
            this.f3161f = z12;
            this.f3162g = i10;
            this.f3163h = function1;
            this.f3164i = z13;
        }

        public final void b(InterfaceC6305e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(-855651614, i10, -1, "com.meijer.mobile.meijer.activity.checkout.composables.SecurityCodeSection.<anonymous> (SecurityCodeSection.kt:62)");
            }
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f3156a);
            String str = this.f3156a;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = t1.e(str, null, 2, null);
                composer.t(objB);
            }
            InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
            composer.P();
            InterfaceC5914o interfaceC5914o = (InterfaceC5914o) composer.o(C6034t0.h());
            String strA = C13698b.a(AbstractC6392a.INSTANCE.b(com.meijer.mobile.meijer.X.f100298a, c(interfaceC5872l0).length(), new Object[0]), composer, AbstractC6392a.f60445b);
            if (!this.f3157b && !this.f3158c) {
                LocalThemeScope localThemeScope = this.f3159d;
                Ki.Q.e(localThemeScope, N0.f141952a, ComposableLambdaKt.c(-1423172558, true, new C0065a(this.f3160e, this.f3161f, strA, interfaceC5914o, localThemeScope, this.f3162g, this.f3163h, this.f3164i, interfaceC5872l0), composer, 54), composer, LocalThemeScope.f17314g | 384 | (N0.f141953b << 3));
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6305e interfaceC6305e, Composer composer, Integer num) {
            b(interfaceC6305e, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c(InterfaceC5872l0<String> interfaceC5872l0) {
            return interfaceC5872l0.getValue();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r22, androidx.compose.ui.Modifier r23, final boolean r24, final boolean r25, final java.lang.String r26, final int r27, final boolean r28, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r29, boolean r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bm.A0.b(Ki.M, androidx.compose.ui.Modifier, boolean, boolean, java.lang.String, int, boolean, kotlin.jvm.functions.Function1, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, boolean z11, String str, int i10, boolean z12, Function1 function1, boolean z13, int i11, int i12, Composer composer, int i13) {
        b(localThemeScope, modifier, z10, z11, str, i10, z12, function1, z13, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }
}
