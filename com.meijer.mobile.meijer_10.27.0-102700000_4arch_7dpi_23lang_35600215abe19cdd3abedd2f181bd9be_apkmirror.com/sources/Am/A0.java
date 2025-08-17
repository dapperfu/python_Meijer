package Am;

import Am.A0;
import Ji.LocalThemeScope;
import android.content.res.Resources;
import androidx.compose.foundation.text.C5693z;
import androidx.compose.foundation.text.InterfaceC5692y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5772o;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.text.input.KeyboardType;
import com.fullstory.compose.FullStoryAnnotationsKt;
import ji.DefaultTextInputs;
import ji.InterfaceC14919W;
import ji.N0;
import ji.q1;
import kotlin.InterfaceC6166e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p1.C16193g;
import r1.C16705m;
import zi.C18504m0;
import zi.H1;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u001ac\u0010\u000f\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013²\u0006\f\u0010\u0011\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000e\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "isSelected", "isExpired", "", "selectedCardCvv", "", "validLength", "isEditMode", "Lkotlin/Function1;", "", "onCVVNumberEntered", "displayError", "b", "(LJi/M;Landroidx/compose/ui/Modifier;ZZLjava/lang/String;IZLkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "cardCVV", "cvvNumber", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class A0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC6166e, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f698a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f699b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f700c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f701d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Modifier f702e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f703f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f704g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f705h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f706i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Am.A0$a$a, reason: collision with other inner class name */
        static final class C0014a implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Modifier f707a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f708b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f709c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5772o f710d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f711e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f712f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function1<String, Unit> f713g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f714h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<String> f715i;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Am.A0$a$a$a, reason: collision with other inner class name */
            static final class C0015a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f716a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC14919W f717b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ int f718c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<String> f719d;

                C0015a(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W, int i10, InterfaceC5730l0<String> interfaceC5730l0) {
                    this.f716a = localThemeScope;
                    this.f717b = interfaceC14919W;
                    this.f718c = i10;
                    this.f719d = interfaceC5730l0;
                }

                public final void a(Composer composer, int i10) throws Resources.NotFoundException {
                    String strD;
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1834332444, i10, -1, "com.meijer.mobile.meijer.activity.checkout.composables.SecurityCodeSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SecurityCodeSection.kt:85)");
                    }
                    LocalThemeScope localThemeScope = this.f716a;
                    q1.Label infoBlockMessage = this.f717b.getLabels().getInfoBlockMessage();
                    if (a.c(this.f719d).length() == 0) {
                        composer.startReplaceGroup(1856892807);
                        strD = C16193g.c(com.meijer.mobile.meijer.Y.f100233o5, composer, 0);
                        composer.P();
                    } else {
                        composer.startReplaceGroup(1856895410);
                        strD = C16193g.d(com.meijer.mobile.meijer.Y.f100213n5, new Object[]{Integer.valueOf(this.f718c)}, composer, 0);
                        composer.P();
                    }
                    ri.j.h(localThemeScope, infoBlockMessage, strD, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
                    a(composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C0014a(Modifier modifier, String str, boolean z10, InterfaceC5772o interfaceC5772o, LocalThemeScope localThemeScope, int i10, Function1<? super String, Unit> function1, boolean z11, InterfaceC5730l0<String> interfaceC5730l0) {
                this.f707a = modifier;
                this.f708b = str;
                this.f709c = z10;
                this.f710d = interfaceC5772o;
                this.f711e = localThemeScope;
                this.f712f = i10;
                this.f713g = function1;
                this.f714h = z11;
                this.f715i = interfaceC5730l0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(String str, r1.u semantics) {
                Intrinsics.j(semantics, "$this$semantics");
                r1.s.g0(semantics, str);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final q1.f.TextInput k(final InterfaceC5772o interfaceC5772o, q1.f.TextInput template) {
                Intrinsics.j(template, "template");
                return q1.f.TextInput.y(template, null, false, null, null, null, new KeyboardOptions(0, null, KeyboardType.INSTANCE.e(), 0, null, null, null, 123, null), new C5693z(new Function1() { // from class: Am.v0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return A0.a.C0014a.l(interfaceC5772o, (InterfaceC5692y) obj);
                    }
                }, null, null, null, null, null, 62, null), false, 0, null, null, null, 3999, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(InterfaceC5772o interfaceC5772o, InterfaceC5692y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                InterfaceC5772o.l(interfaceC5772o, false, 1, null);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(int i10, InterfaceC5772o interfaceC5772o, Function1 function1, String cvv) {
                Intrinsics.j(cvv, "cvv");
                if (cvv.length() == i10) {
                    InterfaceC5772o.l(interfaceC5772o, false, 1, null);
                }
                function1.invoke(StringsKt.J1(cvv, i10));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(boolean z10, boolean z11, InterfaceC14919W interfaceC14919W, LocalThemeScope localThemeScope, int i10, InterfaceC5730l0 interfaceC5730l0, H1 AdsInputField) {
                Intrinsics.j(AdsInputField, "$this$AdsInputField");
                if (z10 && z11) {
                    AdsInputField.f(interfaceC14919W.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.composableLambdaInstance(1834332444, true, new C0015a(localThemeScope, interfaceC14919W, i10, interfaceC5730l0)));
                }
                return Unit.f142422a;
            }

            public final void f(final InterfaceC14919W Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-1423172558, i10, -1, "com.meijer.mobile.meijer.activity.checkout.composables.SecurityCodeSection.<anonymous>.<anonymous> (SecurityCodeSection.kt:65)");
                }
                Modifier modifierZ = androidx.compose.foundation.layout.J.z(this.f707a, H1.h.p(100));
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f708b);
                final String str = this.f708b;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: Am.w0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return A0.a.C0014a.g(str, (r1.u) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierH = androidx.compose.foundation.layout.J.h(FullStoryAnnotationsKt.fsExclude(C16705m.d(modifierZ, false, (Function1) objB, 1, null)), 0.0f, 1, null);
                String strC = a.c(this.f715i);
                DefaultTextInputs inputFields = Assemble.getInputFields();
                boolean z10 = this.f709c;
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f710d);
                final InterfaceC5772o interfaceC5772o = this.f710d;
                Object objB2 = composer.B();
                if (zD || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function1() { // from class: Am.x0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return A0.a.C0014a.k(interfaceC5772o, (q1.f.TextInput) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                q1.f.TextInput textInputF = Cr.f.f(inputFields, z10, false, false, (Function1) objB2, 6, null);
                LocalThemeScope localThemeScope = this.f711e;
                composer.startReplaceGroup(-1746271574);
                boolean zD2 = composer.d(this.f712f) | composer.D(this.f710d) | composer.V(this.f713g);
                final int i11 = this.f712f;
                final InterfaceC5772o interfaceC5772o2 = this.f710d;
                final Function1<String, Unit> function1 = this.f713g;
                Object objB3 = composer.B();
                if (zD2 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function1() { // from class: Am.y0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return A0.a.C0014a.o(i11, interfaceC5772o2, function1, (String) obj);
                        }
                    };
                    composer.t(objB3);
                }
                Function1 function12 = (Function1) objB3;
                composer.P();
                composer.startReplaceGroup(-1224400529);
                boolean zA = composer.a(this.f709c) | composer.a(this.f714h) | composer.D(Assemble) | composer.D(this.f711e) | composer.V(this.f715i) | composer.d(this.f712f);
                final boolean z11 = this.f709c;
                final boolean z12 = this.f714h;
                final LocalThemeScope localThemeScope2 = this.f711e;
                final int i12 = this.f712f;
                final InterfaceC5730l0<String> interfaceC5730l0 = this.f715i;
                Object objB4 = composer.B();
                if (zA || objB4 == Composer.INSTANCE.a()) {
                    Function1 function13 = new Function1() { // from class: Am.z0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return A0.a.C0014a.p(z11, z12, Assemble, localThemeScope2, i12, interfaceC5730l0, (H1) obj);
                        }
                    };
                    composer.t(function13);
                    objB4 = function13;
                }
                composer.P();
                C18504m0.i(localThemeScope, strC, textInputF, modifierH, function12, (Function1) objB4, composer, LocalThemeScope.f15770g | (q1.f.TextInput.f140038m << 6), 0);
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

        /* JADX WARN: Multi-variable type inference failed */
        a(String str, boolean z10, boolean z11, LocalThemeScope localThemeScope, Modifier modifier, boolean z12, int i10, Function1<? super String, Unit> function1, boolean z13) {
            this.f698a = str;
            this.f699b = z10;
            this.f700c = z11;
            this.f701d = localThemeScope;
            this.f702e = modifier;
            this.f703f = z12;
            this.f704g = i10;
            this.f705h = function1;
            this.f706i = z13;
        }

        public final void b(InterfaceC6166e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(-855651614, i10, -1, "com.meijer.mobile.meijer.activity.checkout.composables.SecurityCodeSection.<anonymous> (SecurityCodeSection.kt:59)");
            }
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f698a);
            String str = this.f698a;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = t1.e(str, null, 2, null);
                composer.t(objB);
            }
            InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            composer.P();
            InterfaceC5772o interfaceC5772o = (InterfaceC5772o) composer.o(C5892t0.h());
            String strC = C16193g.c(com.meijer.mobile.meijer.Y.f100142je, composer, 0);
            if (!this.f699b && !this.f700c) {
                LocalThemeScope localThemeScope = this.f701d;
                Ji.Q.e(localThemeScope, N0.f139697a, ComposableLambdaKt.c(-1423172558, true, new C0014a(this.f702e, strC, this.f703f, interfaceC5772o, localThemeScope, this.f704g, this.f705h, this.f706i, interfaceC5730l0), composer, 54), composer, LocalThemeScope.f15770g | 384 | (N0.f139698b << 3));
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6166e interfaceC6166e, Composer composer, Integer num) {
            b(interfaceC6166e, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c(InterfaceC5730l0<String> interfaceC5730l0) {
            return interfaceC5730l0.getValue();
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
    public static final void b(final Ji.LocalThemeScope r22, androidx.compose.ui.Modifier r23, final boolean r24, final boolean r25, final java.lang.String r26, final int r27, final boolean r28, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r29, boolean r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Am.A0.b(Ji.M, androidx.compose.ui.Modifier, boolean, boolean, java.lang.String, int, boolean, kotlin.jvm.functions.Function1, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, boolean z11, String str, int i10, boolean z12, Function1 function1, boolean z13, int i11, int i12, Composer composer, int i13) {
        b(localThemeScope, modifier, z10, z11, str, i10, z12, function1, z13, composer, J0.a(i11 | 1), i12);
        return Unit.f142422a;
    }
}
