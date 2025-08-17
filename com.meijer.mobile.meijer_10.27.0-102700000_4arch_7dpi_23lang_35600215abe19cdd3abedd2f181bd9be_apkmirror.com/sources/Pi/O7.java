package Pi;

import Ji.LocalThemeScope;
import Pi.O7;
import androidx.compose.foundation.text.C5693z;
import androidx.compose.foundation.text.InterfaceC5692y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.C5702c1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5726j0;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5761d;
import androidx.compose.ui.focus.InterfaceC5772o;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.recyclerview.widget.RecyclerView;
import ji.InterfaceC14916T;
import ji.InterfaceC14926b0;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import zi.C18495i1;
import zi.C18504m0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "b", "(LJi/M;Landroidx/compose/runtime/Composer;I)V", "", "value", "", "shouldShowNotification", "", "doubleValue", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class O7 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26616a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.D1 f26617b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f26618c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5726j0 f26619d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f26620e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f26621f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Pi.O7$a$a, reason: collision with other inner class name */
        static final class C0510a implements Function3<InterfaceC14916T, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.D1 f26622a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5772o f26623b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f26624c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5726j0 f26625d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f26626e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Boolean> f26627f;

            C0510a(androidx.compose.ui.platform.D1 d12, InterfaceC5772o interfaceC5772o, LocalThemeScope localThemeScope, InterfaceC5726j0 interfaceC5726j0, int i10, InterfaceC5730l0<Boolean> interfaceC5730l0) {
                this.f26622a = d12;
                this.f26623b = interfaceC5772o;
                this.f26624c = localThemeScope;
                this.f26625d = interfaceC5726j0;
                this.f26626e = i10;
                this.f26627f = interfaceC5730l0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(int i10, InterfaceC5726j0 interfaceC5726j0, androidx.compose.ui.focus.E it) {
                Intrinsics.j(it, "it");
                if (!it.b() || !it.a()) {
                    O7.d(interfaceC5726j0, RangesKt.o(O7.c(interfaceC5726j0), 0, i10));
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(int i10, androidx.compose.ui.platform.D1 d12, InterfaceC5772o interfaceC5772o, InterfaceC5726j0 interfaceC5726j0, InterfaceC5730l0 interfaceC5730l0, InterfaceC5692y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                O7.d(interfaceC5726j0, RangesKt.o(O7.c(interfaceC5726j0), 0, i10));
                if (d12 != null) {
                    d12.b();
                }
                InterfaceC5772o.l(interfaceC5772o, false, 1, null);
                O7.f(interfaceC5730l0, O7.c(interfaceC5726j0) >= i10);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(InterfaceC5726j0 interfaceC5726j0, String proposed) {
                Intrinsics.j(proposed, "proposed");
                O7.d(interfaceC5726j0, Integer.parseInt(C18495i1.a(proposed, Integer.valueOf(O7.c(interfaceC5726j0)))));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(InterfaceC14916T interfaceC14916T, final InterfaceC5730l0 interfaceC5730l0, final int i10, final InterfaceC5726j0 interfaceC5726j0, zi.y1 AdsInputField) {
                Intrinsics.j(AdsInputField, "$this$AdsInputField");
                AdsInputField.d0(O7.e(interfaceC5730l0) ? interfaceC14916T.getIcons().getDisabledTrailingIcon() : interfaceC14916T.getIcons().getTrailingIcon(), !O7.e(interfaceC5730l0) ? new Function0() { // from class: Pi.M7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return O7.a.C0510a.q(i10, interfaceC5726j0, interfaceC5730l0);
                    }
                } : null);
                AdsInputField.T(interfaceC14916T.getIcons().getLeadingIcon(), new Function0() { // from class: Pi.N7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return O7.a.C0510a.r(i10, interfaceC5726j0, interfaceC5730l0);
                    }
                });
                return Unit.f142422a;
            }

            public final void g(final InterfaceC14916T Assemble, Composer composer, int i10) {
                int i11;
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(809691991, i11, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputWithInlineNotification.<anonymous>.<anonymous> (QuantityInput.kt:879)");
                }
                String strValueOf = String.valueOf(O7.c(this.f26625d));
                q1.f.QuantityInput quantityInput = Assemble.getInputFields().getDefault();
                Modifier modifier = Assemble.getInputFields().getDefault().getModifier();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                final int i12 = this.f26626e;
                final InterfaceC5726j0 interfaceC5726j0 = this.f26625d;
                Object objB = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB == companion2.a()) {
                    objB = new Function1() { // from class: Pi.I7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return O7.a.C0510a.k(i12, interfaceC5726j0, (androidx.compose.ui.focus.E) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierThen = modifier.then(C5761d.a(companion, (Function1) objB));
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null);
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f26622a) | composer.D(this.f26623b);
                final int i13 = this.f26626e;
                final androidx.compose.ui.platform.D1 d12 = this.f26622a;
                final InterfaceC5772o interfaceC5772o = this.f26623b;
                final InterfaceC5726j0 interfaceC5726j02 = this.f26625d;
                final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f26627f;
                Object objB2 = composer.B();
                if (zV || objB2 == companion2.a()) {
                    objB2 = new Function1() { // from class: Pi.J7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return O7.a.C0510a.l(i13, d12, interfaceC5772o, interfaceC5726j02, interfaceC5730l0, (InterfaceC5692y) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                q1.f.QuantityInput quantityInputX = quantityInput.x((65531 & 1) != 0 ? quantityInput.modifier : modifierThen, (65531 & 2) != 0 ? quantityInput.readOnly : false, (65531 & 4) != 0 ? quantityInput.state : null, (65531 & 8) != 0 ? quantityInput.textStyle : null, (65531 & 16) != 0 ? quantityInput.visualTransformation : null, (65531 & 32) != 0 ? quantityInput.keyboardOptions : keyboardOptions, (65531 & 64) != 0 ? quantityInput.keyboardActions : new C5693z((Function1) objB2, null, null, null, null, null, 62, null), (65531 & 128) != 0 ? quantityInput.singleLine : false, (65531 & 256) != 0 ? quantityInput.maxLines : 0, (65531 & 512) != 0 ? quantityInput.interactionSource : null, (65531 & 1024) != 0 ? quantityInput.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInput.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInput.signifier : null, (65531 & 8192) != 0 ? quantityInput.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInput.outerModifier : null, (65531 & 32768) != 0 ? quantityInput.shouldFillMaxWidth : false);
                LocalThemeScope localThemeScope = this.f26624c;
                composer.startReplaceGroup(5004770);
                final InterfaceC5726j0 interfaceC5726j03 = this.f26625d;
                Object objB3 = composer.B();
                if (objB3 == companion2.a()) {
                    objB3 = new Function1() { // from class: Pi.K7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return O7.a.C0510a.o(interfaceC5726j03, (String) obj);
                        }
                    };
                    composer.t(objB3);
                }
                Function1 function1 = (Function1) objB3;
                composer.P();
                composer.startReplaceGroup(-1224400529);
                boolean z10 = (i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble));
                final InterfaceC5730l0<Boolean> interfaceC5730l02 = this.f26627f;
                final int i14 = this.f26626e;
                final InterfaceC5726j0 interfaceC5726j04 = this.f26625d;
                Object objB4 = composer.B();
                if (z10 || objB4 == companion2.a()) {
                    objB4 = new Function1() { // from class: Pi.L7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return O7.a.C0510a.p(Assemble, interfaceC5730l02, i14, interfaceC5726j04, (zi.y1) obj);
                        }
                    };
                    composer.t(objB4);
                }
                composer.P();
                C18504m0.h(localThemeScope, strValueOf, quantityInputX, function1, null, "Qty:", (Function1) objB4, composer, 199680, 8);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14916T interfaceC14916T, Composer composer, Integer num) {
                g(interfaceC14916T, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit q(int i10, InterfaceC5726j0 interfaceC5726j0, InterfaceC5730l0 interfaceC5730l0) {
                boolean z10 = true;
                if (O7.c(interfaceC5726j0) < i10) {
                    O7.d(interfaceC5726j0, O7.c(interfaceC5726j0) + 1);
                }
                if (O7.c(interfaceC5726j0) < i10) {
                    z10 = false;
                }
                O7.f(interfaceC5730l0, z10);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(int i10, InterfaceC5726j0 interfaceC5726j0, InterfaceC5730l0 interfaceC5730l0) {
                boolean z10;
                if (O7.c(interfaceC5726j0) > 0) {
                    O7.d(interfaceC5726j0, O7.c(interfaceC5726j0) - 1);
                }
                if (O7.c(interfaceC5726j0) >= i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                O7.f(interfaceC5730l0, z10);
                return Unit.f142422a;
            }
        }

        a(LocalThemeScope localThemeScope, androidx.compose.ui.platform.D1 d12, InterfaceC5772o interfaceC5772o, InterfaceC5726j0 interfaceC5726j0, int i10, InterfaceC5730l0<Boolean> interfaceC5730l0) {
            this.f26616a = localThemeScope;
            this.f26617b = d12;
            this.f26618c = interfaceC5772o;
            this.f26619d = interfaceC5726j0;
            this.f26620e = i10;
            this.f26621f = interfaceC5730l0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(60950720, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputWithInlineNotification.<anonymous> (QuantityInput.kt:878)");
            }
            LocalThemeScope localThemeScope = this.f26616a;
            Ji.Q.e(localThemeScope, ji.I0.f139670a, ComposableLambdaKt.c(809691991, true, new C0510a(this.f26617b, this.f26618c, localThemeScope, this.f26619d, this.f26620e, this.f26621f), composer, 54), composer, 432);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26628a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC14926b0, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f26629a;

            a(LocalThemeScope localThemeScope) {
                this.f26629a = localThemeScope;
            }

            public final void a(InterfaceC14926b0 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-851627058, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputWithInlineNotification.<anonymous>.<anonymous> (QuantityInput.kt:931)");
                }
                Ci.j.i(this.f26629a, null, "Limit Reached", null, Assemble.getToastVariant().getInformational(), null, composer, 384, 21);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14926b0 interfaceC14926b0, Composer composer, Integer num) {
                a(interfaceC14926b0, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        b(LocalThemeScope localThemeScope) {
            this.f26628a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1762236543, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputWithInlineNotification.<anonymous> (QuantityInput.kt:930)");
            }
            LocalThemeScope localThemeScope = this.f26628a;
            Ji.Q.e(localThemeScope, ji.a1.f139760a, ComposableLambdaKt.c(-851627058, true, new a(localThemeScope), composer, 54), composer, 432);
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

    public static final void b(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(1036546603);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1036546603, i11, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputWithInlineNotification (QuantityInput.kt:869)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = C5702c1.a(0);
                composerStartRestartGroup.t(objB);
            }
            InterfaceC5726j0 interfaceC5726j0 = (InterfaceC5726j0) objB;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.t(objB2);
            }
            InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB2;
            composerStartRestartGroup.P();
            kotlin.Function0.b(ComposableLambdaKt.c(60950720, true, new a(localThemeScope, (androidx.compose.ui.platform.D1) composerStartRestartGroup.o(C5892t0.q()), (InterfaceC5772o) composerStartRestartGroup.o(C5892t0.h()), interfaceC5726j0, 6, interfaceC5730l0), composerStartRestartGroup, 54), ComposableLambdaKt.c(-1762236543, true, new b(localThemeScope), composerStartRestartGroup, 54), e(interfaceC5730l0), 0.0f, composerStartRestartGroup, 54, 8);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Pi.H7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return O7.g(localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        b(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(InterfaceC5726j0 interfaceC5726j0) {
        return interfaceC5726j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC5726j0 interfaceC5726j0, int i10) {
        interfaceC5726j0.j(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }
}
