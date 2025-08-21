package com.meijer.mobile.wic.ux;

import Ai.C2832m0;
import Ai.H1;
import Ki.C;
import Ki.LocalThemeScope;
import Ki.Q;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.text.C5835z;
import androidx.compose.foundation.text.InterfaceC5834y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.C6034t0;
import androidx.compose.ui.platform.D1;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.wic.ux.m;
import com.meijer.mobile.wic.ux.y;
import j0.InterfaceC14882C;
import ki.DefaultTextInputs;
import ki.InterfaceC15153W;
import ki.L0;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p1.C16338g;
import qi.C16671b;
import z1.G;
import z1.W;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001aU\u0010\u0012\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00032\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u0003H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001aE\u0010\u0017\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\t2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a²\u0006\u000e\u0010\u000f\u001a\u00020\r8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000e\u001a\u00020\r8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0019\u001a\u0004\u0018\u00010\r8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/meijer/mobile/wic/ux/y;", "", "onNavigationRequest", "t", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "isLoginEnabled", "j", "(LKi/M;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "username", "password", "onUsernameChanged", "onPasswordChanged", "m", "(LKi/M;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "showPassword", "Lkotlin/Function0;", "onShowPasswordClick", "B", "(LKi/M;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class m {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f120404a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<y, Unit> f120405b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.wic.ux.m$a$a, reason: collision with other inner class name */
        static final class C1968a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f120406a;

            C1968a(LocalThemeScope localThemeScope) {
                this.f120406a = localThemeScope;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(825746037, i10, -1, "com.meijer.mobile.wic.ux.WicLoginScreen.<anonymous>.<anonymous> (WicLoginScreen.kt:84)");
                }
                Dr.g.g(this.f120406a, C16338g.c(com.meijer.mobile.wic.ux.a.f120370e, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-181584075, i10, -1, "com.meijer.mobile.wic.ux.WicLoginScreen.<anonymous> (WicLoginScreen.kt:83)");
            }
            AbstractC6392a abstractC6392aC = AbstractC6392a.INSTANCE.c(C16338g.c(com.meijer.mobile.wic.ux.a.f120368c, composer, 0));
            C.f.o oVar = C.f.o.f17066e;
            LocalThemeScope localThemeScope = this.f120404a;
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(825746037, true, new C1968a(localThemeScope), composer, 54);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f120405b);
            final Function1<y, Unit> function1 = this.f120405b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.wic.ux.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m.a.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, oVar, 0.0f, false, abstractC6392aC, composer, LocalThemeScope.f17314g | 24576 | (C.f.o.f17067f << 18) | (AbstractC6392a.f60445b << 27), 199);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, Function1<? super y, Unit> function1) {
            this.f120404a = localThemeScope;
            this.f120405b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(y.a.f120436a);
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f120407a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z1<Boolean> f120408b;

        b(LocalThemeScope localThemeScope, z1<Boolean> z1Var) {
            this.f120407a = localThemeScope;
            this.f120408b = z1Var;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-396413228, i10, -1, "com.meijer.mobile.wic.ux.WicLoginScreen.<anonymous> (WicLoginScreen.kt:90)");
            }
            m.j(this.f120407a, m.z(this.f120408b), null, composer, LocalThemeScope.f17314g, 2);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f120409a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f120410b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f120411c;

        c(LocalThemeScope localThemeScope, InterfaceC5872l0<String> interfaceC5872l0, InterfaceC5872l0<String> interfaceC5872l02) {
            this.f120409a = localThemeScope;
            this.f120410b = interfaceC5872l0;
            this.f120411c = interfaceC5872l02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(InterfaceC5872l0 interfaceC5872l0, String it) {
            Intrinsics.j(it, "it");
            m.x(interfaceC5872l0, it);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(InterfaceC5872l0 interfaceC5872l0, String it) {
            Intrinsics.j(it, "it");
            m.v(interfaceC5872l0, it);
            return Unit.f143329a;
        }

        public final void c(InterfaceC14882C innerPadding, Composer composer, int i10) {
            Intrinsics.j(innerPadding, "innerPadding");
            if ((i10 & 6) == 0) {
                i10 |= composer.V(innerPadding) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1545987548, i10, -1, "com.meijer.mobile.wic.ux.WicLoginScreen.<anonymous> (WicLoginScreen.kt:94)");
            }
            String strW = m.w(this.f120410b);
            String strU = m.u(this.f120411c);
            Modifier modifierH = D.h(Modifier.INSTANCE, innerPadding);
            LocalThemeScope localThemeScope = this.f120409a;
            composer.startReplaceGroup(5004770);
            final InterfaceC5872l0<String> interfaceC5872l0 = this.f120410b;
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.wic.ux.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return m.c.d(interfaceC5872l0, (String) obj);
                    }
                };
                composer.t(objB);
            }
            Function1 function1 = (Function1) objB;
            composer.P();
            composer.startReplaceGroup(5004770);
            final InterfaceC5872l0<String> interfaceC5872l02 = this.f120411c;
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new Function1() { // from class: com.meijer.mobile.wic.ux.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return m.c.e(interfaceC5872l02, (String) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            m.m(localThemeScope, strW, strU, modifierH, function1, (Function1) objB2, composer, LocalThemeScope.f17314g | 221184, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
            c(interfaceC14882C, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f120412a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f120413b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f120414c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ D1 f120415d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f120416e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f120417f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f120418g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f120419a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f120420b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f120421c;

            a(LocalThemeScope localThemeScope, Function0<Unit> function0, boolean z10) {
                this.f120419a = localThemeScope;
                this.f120420b = function0;
                this.f120421c = z10;
            }

            public final void b(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(348211745, i10, -1, "com.meijer.mobile.wic.ux.WicPasswordInputField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WicLoginScreen.kt:244)");
                }
                LocalThemeScope localThemeScope = this.f120419a;
                C.j.p pVar = C.j.p.f17135d;
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f120420b);
                final Function0<Unit> function0 = this.f120420b;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.wic.ux.t
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return m.d.a.c(function0);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C16671b.b(localThemeScope, new q1.h.DrawableIcon(pVar, null, null, null, 0.0f, this.f120421c ? this.f120419a.getAdsColors().getAdsColorIcon03() : this.f120419a.getAdsColors().getAdsColorsDisabled(), ClickableKt.d(companion, false, null, null, (Function0) objB, 7, null), 30, null), null, null, composer, LocalThemeScope.f17314g | (q1.h.DrawableIcon.f142322h << 3), 6);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                b(composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function0 function0) {
                function0.invoke();
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(LocalThemeScope localThemeScope, String str, boolean z10, D1 d12, Function1<? super String, Unit> function1, String str2, Function0<Unit> function0) {
            this.f120412a = localThemeScope;
            this.f120413b = str;
            this.f120414c = z10;
            this.f120415d = d12;
            this.f120416e = function1;
            this.f120417f = str2;
            this.f120418g = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final q1.f.TextInput f(boolean z10, final D1 d12, q1.f.TextInput template) {
            W g10;
            Intrinsics.j(template, "template");
            Modifier modifierFsMask = FullStoryAnnotationsKt.fsMask(template.getModifier());
            if (z10) {
                g10 = W.INSTANCE.c();
            } else {
                g10 = new G((char) 0, 1, null);
            }
            return q1.f.TextInput.y(template, modifierFsMask, false, null, null, g10, new KeyboardOptions(0, null, KeyboardType.INSTANCE.f(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null), new C5835z(new Function1() { // from class: com.meijer.mobile.wic.ux.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m.d.g(d12, (InterfaceC5834y) obj);
                }
            }, null, null, null, null, null, 62, null), false, 0, null, null, null, 3982, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(D1 d12, InterfaceC5834y KeyboardActions) {
            Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
            if (d12 != null) {
                d12.b();
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(Function1 function1, String it) {
            Intrinsics.j(it, "it");
            function1.invoke(it);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC15153W interfaceC15153W, String str, LocalThemeScope localThemeScope, Function0 function0, boolean z10, H1 AdsInputField) {
            Intrinsics.j(AdsInputField, "$this$AdsInputField");
            AdsInputField.d(interfaceC15153W.getLabels().getLabel(), str);
            AdsInputField.i(interfaceC15153W.getLabels().getPlaceholder(), str);
            AdsInputField.D(ComposableLambdaKt.composableLambdaInstance(348211745, true, new a(localThemeScope, function0, z10)));
            return Unit.f143329a;
        }

        public final void e(final InterfaceC15153W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(332008538, i10, -1, "com.meijer.mobile.wic.ux.WicPasswordInputField.<anonymous> (WicLoginScreen.kt:213)");
            }
            LocalThemeScope localThemeScope = this.f120412a;
            String str = this.f120413b;
            DefaultTextInputs defaultTextInputsC = Assemble.getInputFields();
            composer.startReplaceGroup(-1633490746);
            boolean zA = composer.a(this.f120414c) | composer.V(this.f120415d);
            final boolean z10 = this.f120414c;
            final D1 d12 = this.f120415d;
            Object objB = composer.B();
            if (zA || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.wic.ux.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return m.d.f(z10, d12, (q1.f.TextInput) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.f.TextInput textInputF = Cr.f.f(defaultTextInputsC, false, false, false, (Function1) objB, 7, null);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f120416e);
            final Function1<String, Unit> function1 = this.f120416e;
            Object objB2 = composer.B();
            if (zV || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: com.meijer.mobile.wic.ux.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return m.d.k(function1, (String) obj);
                    }
                };
                composer.t(objB2);
            }
            Function1 function12 = (Function1) objB2;
            composer.P();
            composer.startReplaceGroup(-1224400529);
            boolean zD = composer.D(Assemble) | composer.V(this.f120417f) | composer.D(this.f120412a) | composer.V(this.f120418g) | composer.a(this.f120414c);
            final String str2 = this.f120417f;
            final LocalThemeScope localThemeScope2 = this.f120412a;
            final Function0<Unit> function0 = this.f120418g;
            final boolean z11 = this.f120414c;
            Object objB3 = composer.B();
            if (zD || objB3 == Composer.INSTANCE.a()) {
                Function1 function13 = new Function1() { // from class: com.meijer.mobile.wic.ux.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return m.d.l(Assemble, str2, localThemeScope2, function0, z11, (H1) obj);
                    }
                };
                composer.t(function13);
                objB3 = function13;
            }
            composer.P();
            C2832m0.i(localThemeScope, str, textInputF, null, function12, (Function1) objB3, composer, LocalThemeScope.f17314g | (q1.f.TextInput.f142293m << 6), 4);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(LocalThemeScope localThemeScope, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        t(localThemeScope, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    private static final void B(final LocalThemeScope localThemeScope, final String str, final boolean z10, final Function1<? super String, Unit> function1, final Function0<Unit> function0, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1900300507);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(function1) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.D(function0) ? 16384 : 8192;
        }
        int i12 = i11;
        if ((i12 & 9363) == 9362 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1900300507, i12, -1, "com.meijer.mobile.wic.ux.WicPasswordInputField (WicLoginScreen.kt:208)");
            }
            Q.e(localThemeScope, L0.f141930a, ComposableLambdaKt.c(332008538, true, new d(localThemeScope, str, z10, (D1) composerStartRestartGroup.o(C6034t0.q()), function1, C16338g.c(com.meijer.mobile.wic.ux.a.f120372g, composerStartRestartGroup, 0), function0), composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f17314g | 384 | (i12 & 14) | (L0.f141931b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.wic.ux.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return m.C(localThemeScope, str, z10, function1, function0, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(LocalThemeScope localThemeScope, String str, boolean z10, Function1 function1, Function0 function0, int i10, Composer composer, int i11) {
        B(localThemeScope, str, z10, function1, function0, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final Ki.LocalThemeScope r32, final boolean r33, androidx.compose.ui.Modifier r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.wic.ux.m.j(Ki.M, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k() {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, boolean z10, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, z10, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final Ki.LocalThemeScope r42, final java.lang.String r43, final java.lang.String r44, androidx.compose.ui.Modifier r45, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r46, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r47, androidx.compose.runtime.Composer r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 971
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.wic.ux.m.m(Ki.M, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(Function1 function1, String it) {
        Intrinsics.j(it, "it");
        function1.invoke(it);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(Function1 function1, String it) {
        Intrinsics.j(it, "it");
        function1.invoke(it);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(LocalThemeScope localThemeScope, String str, String str2, Modifier modifier, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        m(localThemeScope, str, str2, modifier, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t(final Ki.LocalThemeScope r33, androidx.compose.ui.Modifier r34, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.wic.ux.y, kotlin.Unit> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.wic.ux.m.t(Ki.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final boolean n(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    private static final void o(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(InterfaceC5872l0 interfaceC5872l0) {
        o(interfaceC5872l0, !n(interfaceC5872l0));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String u(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String w(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y(InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02) {
        if (!StringsKt.s0(u(interfaceC5872l0)) && !StringsKt.s0(w(interfaceC5872l02))) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z(z1<Boolean> z1Var) {
        return z1Var.getValue().booleanValue();
    }
}
