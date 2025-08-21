package Qi;

import Ai.C2823i1;
import Ai.C2832m0;
import Ki.LocalThemeScope;
import Qi.O7;
import androidx.compose.foundation.text.C5835z;
import androidx.compose.foundation.text.InterfaceC5834y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.C5844c1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5868j0;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5903d;
import androidx.compose.ui.focus.InterfaceC5914o;
import androidx.compose.ui.platform.C6034t0;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.recyclerview.widget.RecyclerView;
import ki.InterfaceC15150T;
import ki.InterfaceC15160b0;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "b", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "", "value", "", "shouldShowNotification", "", "doubleValue", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class O7 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29328a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.D1 f29329b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f29330c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5868j0 f29331d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f29332e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f29333f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.O7$a$a, reason: collision with other inner class name */
        static final class C0574a implements Function3<InterfaceC15150T, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.D1 f29334a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5914o f29335b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29336c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5868j0 f29337d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f29338e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f29339f;

            C0574a(androidx.compose.ui.platform.D1 d12, InterfaceC5914o interfaceC5914o, LocalThemeScope localThemeScope, InterfaceC5868j0 interfaceC5868j0, int i10, InterfaceC5872l0<Boolean> interfaceC5872l0) {
                this.f29334a = d12;
                this.f29335b = interfaceC5914o;
                this.f29336c = localThemeScope;
                this.f29337d = interfaceC5868j0;
                this.f29338e = i10;
                this.f29339f = interfaceC5872l0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(int i10, InterfaceC5868j0 interfaceC5868j0, androidx.compose.ui.focus.E it) {
                Intrinsics.j(it, "it");
                if (!it.b() || !it.a()) {
                    O7.d(interfaceC5868j0, RangesKt.o(O7.c(interfaceC5868j0), 0, i10));
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(int i10, androidx.compose.ui.platform.D1 d12, InterfaceC5914o interfaceC5914o, InterfaceC5868j0 interfaceC5868j0, InterfaceC5872l0 interfaceC5872l0, InterfaceC5834y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                O7.d(interfaceC5868j0, RangesKt.o(O7.c(interfaceC5868j0), 0, i10));
                if (d12 != null) {
                    d12.b();
                }
                InterfaceC5914o.l(interfaceC5914o, false, 1, null);
                O7.f(interfaceC5872l0, O7.c(interfaceC5868j0) >= i10);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(InterfaceC5868j0 interfaceC5868j0, String proposed) {
                Intrinsics.j(proposed, "proposed");
                O7.d(interfaceC5868j0, Integer.parseInt(C2823i1.a(proposed, Integer.valueOf(O7.c(interfaceC5868j0)))));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(InterfaceC15150T interfaceC15150T, final InterfaceC5872l0 interfaceC5872l0, final int i10, final InterfaceC5868j0 interfaceC5868j0, Ai.y1 AdsInputField) {
                Intrinsics.j(AdsInputField, "$this$AdsInputField");
                AdsInputField.m0(O7.e(interfaceC5872l0) ? interfaceC15150T.getIcons().getDisabledTrailingIcon() : interfaceC15150T.getIcons().getTrailingIcon(), !O7.e(interfaceC5872l0) ? new Function0() { // from class: Qi.M7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return O7.a.C0574a.q(i10, interfaceC5868j0, interfaceC5872l0);
                    }
                } : null);
                AdsInputField.N(interfaceC15150T.getIcons().getLeadingIcon(), new Function0() { // from class: Qi.N7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return O7.a.C0574a.r(i10, interfaceC5868j0, interfaceC5872l0);
                    }
                });
                return Unit.f143329a;
            }

            public final void g(final InterfaceC15150T Assemble, Composer composer, int i10) {
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
                String strValueOf = String.valueOf(O7.c(this.f29337d));
                q1.f.QuantityInput quantityInput = Assemble.getInputFields().getDefault();
                Modifier modifier = Assemble.getInputFields().getDefault().getModifier();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                final int i12 = this.f29338e;
                final InterfaceC5868j0 interfaceC5868j0 = this.f29337d;
                Object objB = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB == companion2.a()) {
                    objB = new Function1() { // from class: Qi.I7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return O7.a.C0574a.k(i12, interfaceC5868j0, (androidx.compose.ui.focus.E) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierThen = modifier.then(C5903d.a(companion, (Function1) objB));
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null);
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f29334a) | composer.D(this.f29335b);
                final int i13 = this.f29338e;
                final androidx.compose.ui.platform.D1 d12 = this.f29334a;
                final InterfaceC5914o interfaceC5914o = this.f29335b;
                final InterfaceC5868j0 interfaceC5868j02 = this.f29337d;
                final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f29339f;
                Object objB2 = composer.B();
                if (zV || objB2 == companion2.a()) {
                    objB2 = new Function1() { // from class: Qi.J7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return O7.a.C0574a.l(i13, d12, interfaceC5914o, interfaceC5868j02, interfaceC5872l0, (InterfaceC5834y) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                q1.f.QuantityInput quantityInputX = quantityInput.x((65531 & 1) != 0 ? quantityInput.modifier : modifierThen, (65531 & 2) != 0 ? quantityInput.readOnly : false, (65531 & 4) != 0 ? quantityInput.state : null, (65531 & 8) != 0 ? quantityInput.textStyle : null, (65531 & 16) != 0 ? quantityInput.visualTransformation : null, (65531 & 32) != 0 ? quantityInput.keyboardOptions : keyboardOptions, (65531 & 64) != 0 ? quantityInput.keyboardActions : new C5835z((Function1) objB2, null, null, null, null, null, 62, null), (65531 & 128) != 0 ? quantityInput.singleLine : false, (65531 & 256) != 0 ? quantityInput.maxLines : 0, (65531 & 512) != 0 ? quantityInput.interactionSource : null, (65531 & 1024) != 0 ? quantityInput.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInput.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInput.signifier : null, (65531 & 8192) != 0 ? quantityInput.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInput.outerModifier : null, (65531 & 32768) != 0 ? quantityInput.shouldFillMaxWidth : false);
                LocalThemeScope localThemeScope = this.f29336c;
                composer.startReplaceGroup(5004770);
                final InterfaceC5868j0 interfaceC5868j03 = this.f29337d;
                Object objB3 = composer.B();
                if (objB3 == companion2.a()) {
                    objB3 = new Function1() { // from class: Qi.K7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return O7.a.C0574a.o(interfaceC5868j03, (String) obj);
                        }
                    };
                    composer.t(objB3);
                }
                Function1 function1 = (Function1) objB3;
                composer.P();
                composer.startReplaceGroup(-1224400529);
                boolean z10 = (i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble));
                final InterfaceC5872l0<Boolean> interfaceC5872l02 = this.f29339f;
                final int i14 = this.f29338e;
                final InterfaceC5868j0 interfaceC5868j04 = this.f29337d;
                Object objB4 = composer.B();
                if (z10 || objB4 == companion2.a()) {
                    objB4 = new Function1() { // from class: Qi.L7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return O7.a.C0574a.p(Assemble, interfaceC5872l02, i14, interfaceC5868j04, (Ai.y1) obj);
                        }
                    };
                    composer.t(objB4);
                }
                composer.P();
                C2832m0.h(localThemeScope, strValueOf, quantityInputX, function1, null, "Qty:", (Function1) objB4, composer, 199680, 8);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15150T interfaceC15150T, Composer composer, Integer num) {
                g(interfaceC15150T, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit q(int i10, InterfaceC5868j0 interfaceC5868j0, InterfaceC5872l0 interfaceC5872l0) {
                boolean z10 = true;
                if (O7.c(interfaceC5868j0) < i10) {
                    O7.d(interfaceC5868j0, O7.c(interfaceC5868j0) + 1);
                }
                if (O7.c(interfaceC5868j0) < i10) {
                    z10 = false;
                }
                O7.f(interfaceC5872l0, z10);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(int i10, InterfaceC5868j0 interfaceC5868j0, InterfaceC5872l0 interfaceC5872l0) {
                boolean z10;
                if (O7.c(interfaceC5868j0) > 0) {
                    O7.d(interfaceC5868j0, O7.c(interfaceC5868j0) - 1);
                }
                if (O7.c(interfaceC5868j0) >= i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                O7.f(interfaceC5872l0, z10);
                return Unit.f143329a;
            }
        }

        a(LocalThemeScope localThemeScope, androidx.compose.ui.platform.D1 d12, InterfaceC5914o interfaceC5914o, InterfaceC5868j0 interfaceC5868j0, int i10, InterfaceC5872l0<Boolean> interfaceC5872l0) {
            this.f29328a = localThemeScope;
            this.f29329b = d12;
            this.f29330c = interfaceC5914o;
            this.f29331d = interfaceC5868j0;
            this.f29332e = i10;
            this.f29333f = interfaceC5872l0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(60950720, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputWithInlineNotification.<anonymous> (QuantityInput.kt:878)");
            }
            LocalThemeScope localThemeScope = this.f29328a;
            Ki.Q.e(localThemeScope, ki.I0.f141925a, ComposableLambdaKt.c(809691991, true, new C0574a(this.f29329b, this.f29330c, localThemeScope, this.f29331d, this.f29332e, this.f29333f), composer, 54), composer, 432);
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
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29340a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC15160b0, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29341a;

            a(LocalThemeScope localThemeScope) {
                this.f29341a = localThemeScope;
            }

            public final void a(InterfaceC15160b0 Assemble, Composer composer, int i10) {
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
                Di.j.i(this.f29341a, null, "Limit Reached", null, Assemble.getToastVariant().getInformational(), null, composer, 384, 21);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15160b0 interfaceC15160b0, Composer composer, Integer num) {
                a(interfaceC15160b0, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        b(LocalThemeScope localThemeScope) {
            this.f29340a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1762236543, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputWithInlineNotification.<anonymous> (QuantityInput.kt:930)");
            }
            LocalThemeScope localThemeScope = this.f29340a;
            Ki.Q.e(localThemeScope, ki.a1.f142015a, ComposableLambdaKt.c(-851627058, true, new a(localThemeScope), composer, 54), composer, 432);
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
                objB = C5844c1.a(0);
                composerStartRestartGroup.t(objB);
            }
            InterfaceC5868j0 interfaceC5868j0 = (InterfaceC5868j0) objB;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = androidx.compose.runtime.t1.e(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.t(objB2);
            }
            InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB2;
            composerStartRestartGroup.P();
            kotlin.Function0.b(ComposableLambdaKt.c(60950720, true, new a(localThemeScope, (androidx.compose.ui.platform.D1) composerStartRestartGroup.o(C6034t0.q()), (InterfaceC5914o) composerStartRestartGroup.o(C6034t0.h()), interfaceC5868j0, 6, interfaceC5872l0), composerStartRestartGroup, 54), ComposableLambdaKt.c(-1762236543, true, new b(localThemeScope), composerStartRestartGroup, 54), e(interfaceC5872l0), 0.0f, composerStartRestartGroup, 54, 8);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.H7
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
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(InterfaceC5868j0 interfaceC5868j0) {
        return interfaceC5868j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC5868j0 interfaceC5868j0, int i10) {
        interfaceC5868j0.i(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }
}
