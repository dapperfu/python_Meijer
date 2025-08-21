package Qi;

import Ai.C2823i1;
import Ai.C2832m0;
import Ki.C;
import Ki.LocalThemeScope;
import Oi.l;
import P0.e;
import Qi.W7;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.text.C5835z;
import androidx.compose.foundation.text.InterfaceC5834y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.C5844c1;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5864h0;
import androidx.compose.runtime.InterfaceC5868j0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5903d;
import androidx.compose.ui.focus.InterfaceC5914o;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.C6034t0;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.recyclerview.widget.RecyclerView;
import com.flipp.injectablehelper.BuildConfig;
import d0.C13572f;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import java.math.BigDecimal;
import java.math.RoundingMode;
import ki.C15133B;
import ki.C15134C;
import ki.C15185o;
import ki.C15187p;
import ki.C15193s;
import ki.C15194s0;
import ki.C15195t;
import ki.C15196t0;
import ki.InterfaceC15150T;
import ki.InterfaceC15205y;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import mv.C15809k;
import mv.InterfaceC15783O;
import qi.C16671b;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016²\u0006\u000e\u0010\u0013\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0013\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0013\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0013\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0013\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0013\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0013\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002"}, d2 = {"LQi/W7;", "LOi/c;", "LOi/l$t;", "state", "<init>", "(LOi/l$t;)V", "LKi/M;", "", "f", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "a", "LOi/l$t;", "i", "()LOi/l$t;", "", "getName", "()Ljava/lang/String;", "name", "", "value", "", "doubleValue", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class W7 implements Oi.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.t state;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29806a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.D1 f29807b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f29808c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.W7$a$a, reason: collision with other inner class name */
        static final class C0587a implements Function3<InterfaceC15150T, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29809a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.D1 f29810b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5914o f29811c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5868j0 f29812d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f29813e;

            C0587a(LocalThemeScope localThemeScope, androidx.compose.ui.platform.D1 d12, InterfaceC5914o interfaceC5914o, InterfaceC5868j0 interfaceC5868j0, int i10) {
                this.f29809a = localThemeScope;
                this.f29810b = d12;
                this.f29811c = interfaceC5914o;
                this.f29812d = interfaceC5868j0;
                this.f29813e = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(int i10, InterfaceC5868j0 interfaceC5868j0, androidx.compose.ui.focus.E it) {
                Intrinsics.j(it, "it");
                if (!it.b() || !it.a()) {
                    a.e(interfaceC5868j0, RangesKt.o(a.d(interfaceC5868j0), 0, i10));
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(int i10, androidx.compose.ui.platform.D1 d12, InterfaceC5914o interfaceC5914o, InterfaceC5868j0 interfaceC5868j0, InterfaceC5834y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                a.e(interfaceC5868j0, RangesKt.o(a.d(interfaceC5868j0), 0, i10));
                if (d12 != null) {
                    d12.b();
                }
                InterfaceC5914o.l(interfaceC5914o, false, 1, null);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(InterfaceC5868j0 interfaceC5868j0, String proposed) {
                Intrinsics.j(proposed, "proposed");
                a.e(interfaceC5868j0, Integer.parseInt(C2823i1.a(proposed, Integer.valueOf(a.d(interfaceC5868j0)))));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(InterfaceC15150T interfaceC15150T, final int i10, final InterfaceC5868j0 interfaceC5868j0, Ai.y1 AdsInputField) {
                Intrinsics.j(AdsInputField, "$this$AdsInputField");
                AdsInputField.m0(interfaceC15150T.getIcons().getTrailingIcon(), new Function0() { // from class: Qi.U7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.a.C0587a.q(i10, interfaceC5868j0);
                    }
                });
                AdsInputField.N(interfaceC15150T.getIcons().getLeadingIcon(), new Function0() { // from class: Qi.V7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.a.C0587a.r(interfaceC5868j0);
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
                    ComposerKt.U(-1899769987, i11, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:94)");
                }
                LocalThemeScope localThemeScope = this.f29809a;
                String strValueOf = String.valueOf(a.d(this.f29812d));
                q1.f.QuantityInput quantityInput = Assemble.getInputFields().getDefault();
                Modifier modifier = Assemble.getInputFields().getDefault().getModifier();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                final int i12 = this.f29813e;
                final InterfaceC5868j0 interfaceC5868j0 = this.f29812d;
                Object objB = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB == companion2.a()) {
                    objB = new Function1() { // from class: Qi.Q7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.a.C0587a.k(i12, interfaceC5868j0, (androidx.compose.ui.focus.E) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierThen = modifier.then(C5903d.a(companion, (Function1) objB));
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null);
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f29810b) | composer.D(this.f29811c);
                final int i13 = this.f29813e;
                final androidx.compose.ui.platform.D1 d12 = this.f29810b;
                final InterfaceC5914o interfaceC5914o = this.f29811c;
                final InterfaceC5868j0 interfaceC5868j02 = this.f29812d;
                Object objB2 = composer.B();
                if (zV || objB2 == companion2.a()) {
                    objB2 = new Function1() { // from class: Qi.R7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.a.C0587a.l(i13, d12, interfaceC5914o, interfaceC5868j02, (InterfaceC5834y) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                q1.f.QuantityInput quantityInputX = quantityInput.x((65531 & 1) != 0 ? quantityInput.modifier : modifierThen, (65531 & 2) != 0 ? quantityInput.readOnly : false, (65531 & 4) != 0 ? quantityInput.state : null, (65531 & 8) != 0 ? quantityInput.textStyle : null, (65531 & 16) != 0 ? quantityInput.visualTransformation : null, (65531 & 32) != 0 ? quantityInput.keyboardOptions : keyboardOptions, (65531 & 64) != 0 ? quantityInput.keyboardActions : new C5835z((Function1) objB2, null, null, null, null, null, 62, null), (65531 & 128) != 0 ? quantityInput.singleLine : false, (65531 & 256) != 0 ? quantityInput.maxLines : 0, (65531 & 512) != 0 ? quantityInput.interactionSource : null, (65531 & 1024) != 0 ? quantityInput.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInput.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInput.signifier : null, (65531 & 8192) != 0 ? quantityInput.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInput.outerModifier : null, (65531 & 32768) != 0 ? quantityInput.shouldFillMaxWidth : false);
                composer.startReplaceGroup(5004770);
                final InterfaceC5868j0 interfaceC5868j03 = this.f29812d;
                Object objB3 = composer.B();
                if (objB3 == companion2.a()) {
                    objB3 = new Function1() { // from class: Qi.S7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.a.C0587a.o(interfaceC5868j03, (String) obj);
                        }
                    };
                    composer.t(objB3);
                }
                Function1 function1 = (Function1) objB3;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean z10 = (i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble));
                final int i14 = this.f29813e;
                final InterfaceC5868j0 interfaceC5868j04 = this.f29812d;
                Object objB4 = composer.B();
                if (z10 || objB4 == companion2.a()) {
                    objB4 = new Function1() { // from class: Qi.T7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.a.C0587a.p(Assemble, i14, interfaceC5868j04, (Ai.y1) obj);
                        }
                    };
                    composer.t(objB4);
                }
                composer.P();
                C2832m0.h(localThemeScope, strValueOf, quantityInputX, function1, null, null, (Function1) objB4, composer, 3072, 24);
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
            public static final Unit q(int i10, InterfaceC5868j0 interfaceC5868j0) {
                if (a.d(interfaceC5868j0) < i10) {
                    a.e(interfaceC5868j0, a.d(interfaceC5868j0) + 1);
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(InterfaceC5868j0 interfaceC5868j0) {
                if (a.d(interfaceC5868j0) > 0) {
                    a.e(interfaceC5868j0, a.d(interfaceC5868j0) - 1);
                }
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function3<ki.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29814a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qi.W7$a$b$a, reason: collision with other inner class name */
            static final class C0588a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f29815a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ki.j1 f29816b;

                C0588a(LocalThemeScope localThemeScope, ki.j1 j1Var) {
                    this.f29815a = localThemeScope;
                    this.f29816b = j1Var;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(2080517870, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:130)");
                    }
                    si.j.h(this.f29815a, this.f29816b.getLabels().getEnabledLabel(), "Add To Cart", null, composer, 384, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            b(LocalThemeScope localThemeScope) {
                this.f29814a = localThemeScope;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f143329a;
            }

            public final void b(ki.j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-281776255, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:129)");
                }
                LocalThemeScope localThemeScope = this.f29814a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Qi.X7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.a.b.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                oi.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(2080517870, true, new C0588a(this.f29814a, Assemble), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c implements Function3<ki.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29817a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qi.W7$a$c$a, reason: collision with other inner class name */
            static final class C0589a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f29818a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ki.j1 f29819b;

                C0589a(LocalThemeScope localThemeScope, ki.j1 j1Var) {
                    this.f29818a = localThemeScope;
                    this.f29819b = j1Var;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(364919279, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:138)");
                    }
                    si.j.h(this.f29818a, this.f29819b.getLabels().getEnabledLabel(), "Out of Stock", null, composer, 384, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            c(LocalThemeScope localThemeScope) {
                this.f29817a = localThemeScope;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f143329a;
            }

            public final void b(ki.j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1997374846, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:137)");
                }
                LocalThemeScope localThemeScope = this.f29817a;
                q1.d.StandardButton disabledButton = Assemble.getButtons().getDisabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Qi.Y7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.a.c.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                oi.E0.b(localThemeScope, disabledButton, (Function0) objB, ComposableLambdaKt.c(364919279, true, new C0589a(this.f29817a, Assemble), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class d implements Function3<ki.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29820a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5868j0 f29821b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qi.W7$a$d$a, reason: collision with other inner class name */
            static final class C0590a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f29822a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ki.j1 f29823b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5868j0 f29824c;

                C0590a(LocalThemeScope localThemeScope, ki.j1 j1Var, InterfaceC5868j0 interfaceC5868j0) {
                    this.f29822a = localThemeScope;
                    this.f29823b = j1Var;
                    this.f29824c = interfaceC5868j0;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1350679312, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:146)");
                    }
                    si.j.h(this.f29822a, this.f29823b.getLabels().getEnabledLabel(), String.valueOf(a.d(this.f29824c)), null, composer, 0, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            d(LocalThemeScope localThemeScope, InterfaceC5868j0 interfaceC5868j0) {
                this.f29820a = localThemeScope;
                this.f29821b = interfaceC5868j0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f143329a;
            }

            public final void b(ki.j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(581993859, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:145)");
                }
                LocalThemeScope localThemeScope = this.f29820a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Qi.Z7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.a.d.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                oi.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-1350679312, true, new C0590a(this.f29820a, Assemble, this.f29821b), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        a(LocalThemeScope localThemeScope, androidx.compose.ui.platform.D1 d12, InterfaceC5914o interfaceC5914o) {
            this.f29806a = localThemeScope;
            this.f29807b = d12;
            this.f29808c = interfaceC5914o;
        }

        public final void c(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1990715568, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous> (QuantityInput.kt:89)");
            }
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = C5844c1.a(0);
                composer.t(objB);
            }
            InterfaceC5868j0 interfaceC5868j0 = (InterfaceC5868j0) objB;
            composer.P();
            LocalThemeScope localThemeScope = this.f29806a;
            androidx.compose.ui.platform.D1 d12 = this.f29807b;
            InterfaceC5914o interfaceC5914o = this.f29808c;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
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
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            Ki.Q.e(localThemeScope, ki.I0.f141925a, ComposableLambdaKt.c(-1899769987, true, new C0587a(localThemeScope, d12, interfaceC5914o, interfaceC5868j0, 99), composer, 54), composer, 432);
            float f10 = 8;
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            InterfaceC15205y.a.d dVar = InterfaceC15205y.a.d.f142547a;
            Ki.Q.e(localThemeScope, dVar, ComposableLambdaKt.c(-281776255, true, new b(localThemeScope), composer, 54), composer, 432);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            Ki.Q.e(localThemeScope, dVar, ComposableLambdaKt.c(-1997374846, true, new c(localThemeScope), composer, 54), composer, 432);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            Ki.Q.e(localThemeScope, InterfaceC15205y.a.e.f142549a, ComposableLambdaKt.c(581993859, true, new d(localThemeScope, interfaceC5868j0), composer, 54), composer, 432);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int d(InterfaceC5868j0 interfaceC5868j0) {
            return interfaceC5868j0.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(InterfaceC5868j0 interfaceC5868j0, int i10) {
            interfaceC5868j0.i(i10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29825a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.D1 f29826b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f29827c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC15150T, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29828a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.D1 f29829b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5914o f29830c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5868j0 f29831d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f29832e;

            a(LocalThemeScope localThemeScope, androidx.compose.ui.platform.D1 d12, InterfaceC5914o interfaceC5914o, InterfaceC5868j0 interfaceC5868j0, int i10) {
                this.f29828a = localThemeScope;
                this.f29829b = d12;
                this.f29830c = interfaceC5914o;
                this.f29831d = interfaceC5868j0;
                this.f29832e = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(int i10, InterfaceC5868j0 interfaceC5868j0, androidx.compose.ui.focus.E it) {
                Intrinsics.j(it, "it");
                if (!it.b() || !it.a()) {
                    b.e(interfaceC5868j0, RangesKt.o(b.d(interfaceC5868j0), 0, i10));
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(int i10, androidx.compose.ui.platform.D1 d12, InterfaceC5914o interfaceC5914o, InterfaceC5868j0 interfaceC5868j0, InterfaceC5834y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                b.e(interfaceC5868j0, RangesKt.o(b.d(interfaceC5868j0), 0, i10));
                if (d12 != null) {
                    d12.b();
                }
                InterfaceC5914o.l(interfaceC5914o, false, 1, null);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(InterfaceC5868j0 interfaceC5868j0, String proposed) {
                Intrinsics.j(proposed, "proposed");
                b.e(interfaceC5868j0, Integer.parseInt(C2823i1.a(proposed, Integer.valueOf(b.d(interfaceC5868j0)))));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(InterfaceC15150T interfaceC15150T, final int i10, final InterfaceC5868j0 interfaceC5868j0, Ai.y1 AdsInputField) {
                Intrinsics.j(AdsInputField, "$this$AdsInputField");
                AdsInputField.m0(interfaceC15150T.getIcons().getTrailingIcon(), new Function0() { // from class: Qi.e8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.b.a.q(i10, interfaceC5868j0);
                    }
                });
                AdsInputField.N(interfaceC15150T.getIcons().getLeadingIcon(), new Function0() { // from class: Qi.f8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.b.a.r(interfaceC5868j0);
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
                    ComposerKt.U(-343096026, i11, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:162)");
                }
                LocalThemeScope localThemeScope = this.f29828a;
                String strValueOf = String.valueOf(b.d(this.f29831d));
                q1.f.QuantityInput quantityInput = Assemble.getInputFields().getDefault();
                Modifier modifier = Assemble.getInputFields().getDefault().getModifier();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                final int i12 = this.f29832e;
                final InterfaceC5868j0 interfaceC5868j0 = this.f29831d;
                Object objB = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB == companion2.a()) {
                    objB = new Function1() { // from class: Qi.a8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.b.a.k(i12, interfaceC5868j0, (androidx.compose.ui.focus.E) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierThen = modifier.then(C5903d.a(companion, (Function1) objB));
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null);
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f29829b) | composer.D(this.f29830c);
                final int i13 = this.f29832e;
                final androidx.compose.ui.platform.D1 d12 = this.f29829b;
                final InterfaceC5914o interfaceC5914o = this.f29830c;
                final InterfaceC5868j0 interfaceC5868j02 = this.f29831d;
                Object objB2 = composer.B();
                if (zV || objB2 == companion2.a()) {
                    objB2 = new Function1() { // from class: Qi.b8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.b.a.l(i13, d12, interfaceC5914o, interfaceC5868j02, (InterfaceC5834y) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                q1.f.QuantityInput quantityInputX = quantityInput.x((65531 & 1) != 0 ? quantityInput.modifier : modifierThen, (65531 & 2) != 0 ? quantityInput.readOnly : false, (65531 & 4) != 0 ? quantityInput.state : null, (65531 & 8) != 0 ? quantityInput.textStyle : null, (65531 & 16) != 0 ? quantityInput.visualTransformation : null, (65531 & 32) != 0 ? quantityInput.keyboardOptions : keyboardOptions, (65531 & 64) != 0 ? quantityInput.keyboardActions : new C5835z((Function1) objB2, null, null, null, null, null, 62, null), (65531 & 128) != 0 ? quantityInput.singleLine : false, (65531 & 256) != 0 ? quantityInput.maxLines : 0, (65531 & 512) != 0 ? quantityInput.interactionSource : null, (65531 & 1024) != 0 ? quantityInput.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInput.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInput.signifier : null, (65531 & 8192) != 0 ? quantityInput.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInput.outerModifier : null, (65531 & 32768) != 0 ? quantityInput.shouldFillMaxWidth : false);
                composer.startReplaceGroup(5004770);
                final InterfaceC5868j0 interfaceC5868j03 = this.f29831d;
                Object objB3 = composer.B();
                if (objB3 == companion2.a()) {
                    objB3 = new Function1() { // from class: Qi.c8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.b.a.o(interfaceC5868j03, (String) obj);
                        }
                    };
                    composer.t(objB3);
                }
                Function1 function1 = (Function1) objB3;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean z10 = (i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble));
                final int i14 = this.f29832e;
                final InterfaceC5868j0 interfaceC5868j04 = this.f29831d;
                Object objB4 = composer.B();
                if (z10 || objB4 == companion2.a()) {
                    objB4 = new Function1() { // from class: Qi.d8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.b.a.p(Assemble, i14, interfaceC5868j04, (Ai.y1) obj);
                        }
                    };
                    composer.t(objB4);
                }
                composer.P();
                C2832m0.h(localThemeScope, strValueOf, quantityInputX, function1, null, null, (Function1) objB4, composer, 3072, 24);
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
            public static final Unit q(int i10, InterfaceC5868j0 interfaceC5868j0) {
                if (b.d(interfaceC5868j0) < i10) {
                    b.e(interfaceC5868j0, b.d(interfaceC5868j0) + 1);
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(InterfaceC5868j0 interfaceC5868j0) {
                if (b.d(interfaceC5868j0) > 0) {
                    b.e(interfaceC5868j0, b.d(interfaceC5868j0) - 1);
                }
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.W7$b$b, reason: collision with other inner class name */
        static final class C0591b implements Function3<ki.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29833a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qi.W7$b$b$a */
            static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f29834a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ki.j1 f29835b;

                a(LocalThemeScope localThemeScope, ki.j1 j1Var) {
                    this.f29834a = localThemeScope;
                    this.f29835b = j1Var;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-2102326185, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:203)");
                    }
                    si.j.h(this.f29834a, this.f29835b.getLabels().getEnabledLabel(), "Add To Cart", null, composer, 384, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            C0591b(LocalThemeScope localThemeScope) {
                this.f29833a = localThemeScope;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f143329a;
            }

            public final void b(ki.j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-229280726, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:202)");
                }
                LocalThemeScope localThemeScope = this.f29833a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Qi.g8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.b.C0591b.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                oi.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-2102326185, true, new a(this.f29833a, Assemble), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c implements Function3<ki.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29836a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f29837a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ki.j1 f29838b;

                a(LocalThemeScope localThemeScope, ki.j1 j1Var) {
                    this.f29837a = localThemeScope;
                    this.f29838b = j1Var;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1525130472, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:211)");
                    }
                    si.j.h(this.f29837a, this.f29838b.getLabels().getEnabledLabel(), "Out of Stock", null, composer, 384, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            c(LocalThemeScope localThemeScope) {
                this.f29836a = localThemeScope;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f143329a;
            }

            public final void b(ki.j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(347914987, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:210)");
                }
                LocalThemeScope localThemeScope = this.f29836a;
                q1.d.StandardButton disabledButton = Assemble.getButtons().getDisabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Qi.h8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.b.c.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                oi.E0.b(localThemeScope, disabledButton, (Function0) objB, ComposableLambdaKt.c(-1525130472, true, new a(this.f29836a, Assemble), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class d implements Function3<ki.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29839a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5868j0 f29840b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f29841a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ki.j1 f29842b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5868j0 f29843c;

                a(LocalThemeScope localThemeScope, ki.j1 j1Var, InterfaceC5868j0 interfaceC5868j0) {
                    this.f29841a = localThemeScope;
                    this.f29842b = j1Var;
                    this.f29843c = interfaceC5868j0;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-947934759, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:219)");
                    }
                    si.j.h(this.f29841a, this.f29842b.getLabels().getEnabledLabel(), String.valueOf(b.d(this.f29843c)), null, composer, 0, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            d(LocalThemeScope localThemeScope, InterfaceC5868j0 interfaceC5868j0) {
                this.f29839a = localThemeScope;
                this.f29840b = interfaceC5868j0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f143329a;
            }

            public final void b(ki.j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(925110700, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:218)");
                }
                LocalThemeScope localThemeScope = this.f29839a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Qi.i8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.b.d.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                oi.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-947934759, true, new a(this.f29839a, Assemble, this.f29840b), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        b(LocalThemeScope localThemeScope, androidx.compose.ui.platform.D1 d12, InterfaceC5914o interfaceC5914o) {
            this.f29825a = localThemeScope;
            this.f29826b = d12;
            this.f29827c = interfaceC5914o;
        }

        public final void c(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1791974809, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous> (QuantityInput.kt:157)");
            }
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = C5844c1.a(0);
                composer.t(objB);
            }
            InterfaceC5868j0 interfaceC5868j0 = (InterfaceC5868j0) objB;
            composer.P();
            LocalThemeScope localThemeScope = this.f29825a;
            androidx.compose.ui.platform.D1 d12 = this.f29826b;
            InterfaceC5914o interfaceC5914o = this.f29827c;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
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
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            Ki.Q.e(localThemeScope, ki.M0.f141945a, ComposableLambdaKt.c(-343096026, true, new a(localThemeScope, d12, interfaceC5914o, interfaceC5868j0, 99), composer, 54), composer, 432);
            float f10 = 8;
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            C15133B c15133b = C15133B.f141857a;
            Ki.Q.e(localThemeScope, c15133b, ComposableLambdaKt.c(-229280726, true, new C0591b(localThemeScope), composer, 54), composer, 432);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            Ki.Q.e(localThemeScope, c15133b, ComposableLambdaKt.c(347914987, true, new c(localThemeScope), composer, 54), composer, 432);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            Ki.Q.e(localThemeScope, C15134C.f141860a, ComposableLambdaKt.c(925110700, true, new d(localThemeScope, interfaceC5868j0), composer, 54), composer, 432);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int d(InterfaceC5868j0 interfaceC5868j0) {
            return interfaceC5868j0.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(InterfaceC5868j0 interfaceC5868j0, int i10) {
            interfaceC5868j0.i(i10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29844a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.D1 f29845b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f29846c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC15150T, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29847a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.D1 f29848b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5914o f29849c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5868j0 f29850d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f29851e;

            a(LocalThemeScope localThemeScope, androidx.compose.ui.platform.D1 d12, InterfaceC5914o interfaceC5914o, InterfaceC5868j0 interfaceC5868j0, int i10) {
                this.f29847a = localThemeScope;
                this.f29848b = d12;
                this.f29849c = interfaceC5914o;
                this.f29850d = interfaceC5868j0;
                this.f29851e = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(int i10, InterfaceC5868j0 interfaceC5868j0, androidx.compose.ui.focus.E it) {
                Intrinsics.j(it, "it");
                if (!it.b() || !it.a()) {
                    c.e(interfaceC5868j0, RangesKt.o(c.d(interfaceC5868j0), 0, i10));
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(int i10, androidx.compose.ui.platform.D1 d12, InterfaceC5914o interfaceC5914o, InterfaceC5868j0 interfaceC5868j0, InterfaceC5834y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                c.e(interfaceC5868j0, RangesKt.o(c.d(interfaceC5868j0), 0, i10));
                if (d12 != null) {
                    d12.b();
                }
                InterfaceC5914o.l(interfaceC5914o, false, 1, null);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(InterfaceC5868j0 interfaceC5868j0, String proposed) {
                Intrinsics.j(proposed, "proposed");
                c.e(interfaceC5868j0, Integer.parseInt(C2823i1.a(proposed, Integer.valueOf(c.d(interfaceC5868j0)))));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(InterfaceC15150T interfaceC15150T, final int i10, final InterfaceC5868j0 interfaceC5868j0, Ai.y1 AdsInputField) {
                Intrinsics.j(AdsInputField, "$this$AdsInputField");
                AdsInputField.m0(interfaceC15150T.getIcons().getTrailingIcon(), new Function0() { // from class: Qi.n8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.c.a.q(i10, interfaceC5868j0);
                    }
                });
                AdsInputField.N(interfaceC15150T.getIcons().getLeadingIcon(), new Function0() { // from class: Qi.o8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.c.a.r(interfaceC5868j0);
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
                    ComposerKt.U(-99559163, i11, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:235)");
                }
                LocalThemeScope localThemeScope = this.f29847a;
                String strValueOf = String.valueOf(c.d(this.f29850d));
                q1.f.QuantityInput quantityInput = Assemble.getInputFields().getDefault();
                Modifier modifier = Assemble.getInputFields().getDefault().getModifier();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                final int i12 = this.f29851e;
                final InterfaceC5868j0 interfaceC5868j0 = this.f29850d;
                Object objB = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB == companion2.a()) {
                    objB = new Function1() { // from class: Qi.j8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.c.a.k(i12, interfaceC5868j0, (androidx.compose.ui.focus.E) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierThen = modifier.then(C5903d.a(companion, (Function1) objB));
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null);
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f29848b) | composer.D(this.f29849c);
                final int i13 = this.f29851e;
                final androidx.compose.ui.platform.D1 d12 = this.f29848b;
                final InterfaceC5914o interfaceC5914o = this.f29849c;
                final InterfaceC5868j0 interfaceC5868j02 = this.f29850d;
                Object objB2 = composer.B();
                if (zV || objB2 == companion2.a()) {
                    objB2 = new Function1() { // from class: Qi.k8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.c.a.l(i13, d12, interfaceC5914o, interfaceC5868j02, (InterfaceC5834y) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                q1.f.QuantityInput quantityInputX = quantityInput.x((65531 & 1) != 0 ? quantityInput.modifier : modifierThen, (65531 & 2) != 0 ? quantityInput.readOnly : false, (65531 & 4) != 0 ? quantityInput.state : null, (65531 & 8) != 0 ? quantityInput.textStyle : null, (65531 & 16) != 0 ? quantityInput.visualTransformation : null, (65531 & 32) != 0 ? quantityInput.keyboardOptions : keyboardOptions, (65531 & 64) != 0 ? quantityInput.keyboardActions : new C5835z((Function1) objB2, null, null, null, null, null, 62, null), (65531 & 128) != 0 ? quantityInput.singleLine : false, (65531 & 256) != 0 ? quantityInput.maxLines : 0, (65531 & 512) != 0 ? quantityInput.interactionSource : null, (65531 & 1024) != 0 ? quantityInput.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInput.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInput.signifier : null, (65531 & 8192) != 0 ? quantityInput.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInput.outerModifier : null, (65531 & 32768) != 0 ? quantityInput.shouldFillMaxWidth : false);
                composer.startReplaceGroup(5004770);
                final InterfaceC5868j0 interfaceC5868j03 = this.f29850d;
                Object objB3 = composer.B();
                if (objB3 == companion2.a()) {
                    objB3 = new Function1() { // from class: Qi.l8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.c.a.o(interfaceC5868j03, (String) obj);
                        }
                    };
                    composer.t(objB3);
                }
                Function1 function1 = (Function1) objB3;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean z10 = (i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble));
                final int i14 = this.f29851e;
                final InterfaceC5868j0 interfaceC5868j04 = this.f29850d;
                Object objB4 = composer.B();
                if (z10 || objB4 == companion2.a()) {
                    objB4 = new Function1() { // from class: Qi.m8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.c.a.p(Assemble, i14, interfaceC5868j04, (Ai.y1) obj);
                        }
                    };
                    composer.t(objB4);
                }
                composer.P();
                C2832m0.h(localThemeScope, strValueOf, quantityInputX, function1, null, null, (Function1) objB4, composer, 3072, 24);
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
            public static final Unit q(int i10, InterfaceC5868j0 interfaceC5868j0) {
                if (c.d(interfaceC5868j0) < i10) {
                    c.e(interfaceC5868j0, c.d(interfaceC5868j0) + 1);
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(InterfaceC5868j0 interfaceC5868j0) {
                if (c.d(interfaceC5868j0) > 0) {
                    c.e(interfaceC5868j0, c.d(interfaceC5868j0) - 1);
                }
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function3<ki.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29852a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f29853a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ki.j1 f29854b;

                a(LocalThemeScope localThemeScope, ki.j1 j1Var) {
                    this.f29853a = localThemeScope;
                    this.f29854b = j1Var;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1858789322, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:276)");
                    }
                    C16671b.b(this.f29853a, this.f29854b.getIcons().getEnabledIcon(), C.a.C0287a.f16877e, null, composer, 384, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            b(LocalThemeScope localThemeScope) {
                this.f29852a = localThemeScope;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f143329a;
            }

            public final void b(ki.j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(14256137, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:275)");
                }
                LocalThemeScope localThemeScope = this.f29852a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Qi.p8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.c.b.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                oi.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-1858789322, true, new a(this.f29852a, Assemble), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.W7$c$c, reason: collision with other inner class name */
        static final class C0592c implements Function3<ki.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29855a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5868j0 f29856b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Qi.W7$c$c$a */
            static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f29857a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ki.j1 f29858b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5868j0 f29859c;

                a(LocalThemeScope localThemeScope, ki.j1 j1Var, InterfaceC5868j0 interfaceC5868j0) {
                    this.f29857a = localThemeScope;
                    this.f29858b = j1Var;
                    this.f29859c = interfaceC5868j0;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1281593609, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:287)");
                    }
                    si.j.h(this.f29857a, this.f29858b.getLabels().getEnabledLabel(), String.valueOf(c.d(this.f29859c)), null, composer, 0, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            C0592c(LocalThemeScope localThemeScope, InterfaceC5868j0 interfaceC5868j0) {
                this.f29855a = localThemeScope;
                this.f29856b = interfaceC5868j0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f143329a;
            }

            public final void b(ki.j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(591451850, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:286)");
                }
                LocalThemeScope localThemeScope = this.f29855a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Qi.q8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.c.C0592c.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                oi.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-1281593609, true, new a(this.f29855a, Assemble, this.f29856b), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        c(LocalThemeScope localThemeScope, androidx.compose.ui.platform.D1 d12, InterfaceC5914o interfaceC5914o) {
            this.f29844a = localThemeScope;
            this.f29845b = d12;
            this.f29846c = interfaceC5914o;
        }

        public final void c(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2035511672, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous> (QuantityInput.kt:230)");
            }
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = C5844c1.a(0);
                composer.t(objB);
            }
            InterfaceC5868j0 interfaceC5868j0 = (InterfaceC5868j0) objB;
            composer.P();
            LocalThemeScope localThemeScope = this.f29844a;
            androidx.compose.ui.platform.D1 d12 = this.f29845b;
            InterfaceC5914o interfaceC5914o = this.f29846c;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
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
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            Ki.Q.e(localThemeScope, C15194s0.f142448a, ComposableLambdaKt.c(-99559163, true, new a(localThemeScope, d12, interfaceC5914o, interfaceC5868j0, 99), composer, 54), composer, 432);
            float f10 = 8;
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            Ki.Q.e(localThemeScope, C15185o.f142170a, ComposableLambdaKt.c(14256137, true, new b(localThemeScope), composer, 54), composer, 432);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            Ki.Q.e(localThemeScope, C15187p.f142174a, ComposableLambdaKt.c(591451850, true, new C0592c(localThemeScope, interfaceC5868j0), composer, 54), composer, 432);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int d(InterfaceC5868j0 interfaceC5868j0) {
            return interfaceC5868j0.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(InterfaceC5868j0 interfaceC5868j0, int i10) {
            interfaceC5868j0.i(i10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29860a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.D1 f29861b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f29862c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC15150T, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29863a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.D1 f29864b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5914o f29865c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5868j0 f29866d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f29867e;

            a(LocalThemeScope localThemeScope, androidx.compose.ui.platform.D1 d12, InterfaceC5914o interfaceC5914o, InterfaceC5868j0 interfaceC5868j0, int i10) {
                this.f29863a = localThemeScope;
                this.f29864b = d12;
                this.f29865c = interfaceC5914o;
                this.f29866d = interfaceC5868j0;
                this.f29867e = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(int i10, InterfaceC5868j0 interfaceC5868j0, androidx.compose.ui.focus.E it) {
                Intrinsics.j(it, "it");
                if (!it.b() || !it.a()) {
                    d.e(interfaceC5868j0, RangesKt.o(d.d(interfaceC5868j0), 0, i10));
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(int i10, androidx.compose.ui.platform.D1 d12, InterfaceC5914o interfaceC5914o, InterfaceC5868j0 interfaceC5868j0, InterfaceC5834y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                d.e(interfaceC5868j0, RangesKt.o(d.d(interfaceC5868j0), 0, i10));
                if (d12 != null) {
                    d12.b();
                }
                InterfaceC5914o.l(interfaceC5914o, false, 1, null);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(InterfaceC5868j0 interfaceC5868j0, String proposed) {
                Intrinsics.j(proposed, "proposed");
                d.e(interfaceC5868j0, Integer.parseInt(C2823i1.a(proposed, Integer.valueOf(d.d(interfaceC5868j0)))));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(InterfaceC15150T interfaceC15150T, final int i10, final InterfaceC5868j0 interfaceC5868j0, Ai.y1 AdsInputField) {
                Intrinsics.j(AdsInputField, "$this$AdsInputField");
                AdsInputField.m0(interfaceC15150T.getIcons().getTrailingIcon(), new Function0() { // from class: Qi.v8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.d.a.q(i10, interfaceC5868j0);
                    }
                });
                AdsInputField.N(interfaceC15150T.getIcons().getLeadingIcon(), new Function0() { // from class: Qi.w8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.d.a.r(interfaceC5868j0);
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
                    ComposerKt.U(143977700, i11, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:303)");
                }
                LocalThemeScope localThemeScope = this.f29863a;
                String strValueOf = String.valueOf(d.d(this.f29866d));
                q1.f.QuantityInput quantityInput = Assemble.getInputFields().getDefault();
                Modifier modifier = Assemble.getInputFields().getDefault().getModifier();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                final int i12 = this.f29867e;
                final InterfaceC5868j0 interfaceC5868j0 = this.f29866d;
                Object objB = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB == companion2.a()) {
                    objB = new Function1() { // from class: Qi.r8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.d.a.k(i12, interfaceC5868j0, (androidx.compose.ui.focus.E) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierThen = modifier.then(C5903d.a(companion, (Function1) objB));
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null);
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f29864b) | composer.D(this.f29865c);
                final int i13 = this.f29867e;
                final androidx.compose.ui.platform.D1 d12 = this.f29864b;
                final InterfaceC5914o interfaceC5914o = this.f29865c;
                final InterfaceC5868j0 interfaceC5868j02 = this.f29866d;
                Object objB2 = composer.B();
                if (zV || objB2 == companion2.a()) {
                    objB2 = new Function1() { // from class: Qi.s8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.d.a.l(i13, d12, interfaceC5914o, interfaceC5868j02, (InterfaceC5834y) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                q1.f.QuantityInput quantityInputX = quantityInput.x((65531 & 1) != 0 ? quantityInput.modifier : modifierThen, (65531 & 2) != 0 ? quantityInput.readOnly : false, (65531 & 4) != 0 ? quantityInput.state : null, (65531 & 8) != 0 ? quantityInput.textStyle : null, (65531 & 16) != 0 ? quantityInput.visualTransformation : null, (65531 & 32) != 0 ? quantityInput.keyboardOptions : keyboardOptions, (65531 & 64) != 0 ? quantityInput.keyboardActions : new C5835z((Function1) objB2, null, null, null, null, null, 62, null), (65531 & 128) != 0 ? quantityInput.singleLine : false, (65531 & 256) != 0 ? quantityInput.maxLines : 0, (65531 & 512) != 0 ? quantityInput.interactionSource : null, (65531 & 1024) != 0 ? quantityInput.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInput.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInput.signifier : null, (65531 & 8192) != 0 ? quantityInput.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInput.outerModifier : null, (65531 & 32768) != 0 ? quantityInput.shouldFillMaxWidth : false);
                composer.startReplaceGroup(5004770);
                final InterfaceC5868j0 interfaceC5868j03 = this.f29866d;
                Object objB3 = composer.B();
                if (objB3 == companion2.a()) {
                    objB3 = new Function1() { // from class: Qi.t8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.d.a.o(interfaceC5868j03, (String) obj);
                        }
                    };
                    composer.t(objB3);
                }
                Function1 function1 = (Function1) objB3;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean z10 = (i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble));
                final int i14 = this.f29867e;
                final InterfaceC5868j0 interfaceC5868j04 = this.f29866d;
                Object objB4 = composer.B();
                if (z10 || objB4 == companion2.a()) {
                    objB4 = new Function1() { // from class: Qi.u8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.d.a.p(Assemble, i14, interfaceC5868j04, (Ai.y1) obj);
                        }
                    };
                    composer.t(objB4);
                }
                composer.P();
                C2832m0.h(localThemeScope, strValueOf, quantityInputX, function1, null, null, (Function1) objB4, composer, 3072, 24);
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
            public static final Unit q(int i10, InterfaceC5868j0 interfaceC5868j0) {
                if (d.d(interfaceC5868j0) < i10) {
                    d.e(interfaceC5868j0, d.d(interfaceC5868j0) + 1);
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(InterfaceC5868j0 interfaceC5868j0) {
                if (d.d(interfaceC5868j0) > 0) {
                    d.e(interfaceC5868j0, d.d(interfaceC5868j0) - 1);
                }
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function3<ki.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29868a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f29869a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ki.j1 f29870b;

                a(LocalThemeScope localThemeScope, ki.j1 j1Var) {
                    this.f29869a = localThemeScope;
                    this.f29870b = j1Var;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1615252459, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:344)");
                    }
                    C16671b.b(this.f29869a, this.f29870b.getIcons().getEnabledIcon(), C.a.C0287a.f16877e, null, composer, 384, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            b(LocalThemeScope localThemeScope) {
                this.f29868a = localThemeScope;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f143329a;
            }

            public final void b(ki.j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(257793000, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:343)");
                }
                LocalThemeScope localThemeScope = this.f29868a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Qi.x8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.d.b.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                oi.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-1615252459, true, new a(this.f29868a, Assemble), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c implements Function3<ki.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29871a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5868j0 f29872b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f29873a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ki.j1 f29874b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5868j0 f29875c;

                a(LocalThemeScope localThemeScope, ki.j1 j1Var, InterfaceC5868j0 interfaceC5868j0) {
                    this.f29873a = localThemeScope;
                    this.f29874b = j1Var;
                    this.f29875c = interfaceC5868j0;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1038056746, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:355)");
                    }
                    si.j.h(this.f29873a, this.f29874b.getLabels().getEnabledLabel(), String.valueOf(d.d(this.f29875c)), null, composer, 0, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            c(LocalThemeScope localThemeScope, InterfaceC5868j0 interfaceC5868j0) {
                this.f29871a = localThemeScope;
                this.f29872b = interfaceC5868j0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f143329a;
            }

            public final void b(ki.j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(834988713, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:354)");
                }
                LocalThemeScope localThemeScope = this.f29871a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Qi.y8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.d.c.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                oi.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-1038056746, true, new a(this.f29871a, Assemble, this.f29872b), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        d(LocalThemeScope localThemeScope, androidx.compose.ui.platform.D1 d12, InterfaceC5914o interfaceC5914o) {
            this.f29860a = localThemeScope;
            this.f29861b = d12;
            this.f29862c = interfaceC5914o;
        }

        public final void c(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2015918761, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous> (QuantityInput.kt:298)");
            }
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = C5844c1.a(0);
                composer.t(objB);
            }
            InterfaceC5868j0 interfaceC5868j0 = (InterfaceC5868j0) objB;
            composer.P();
            LocalThemeScope localThemeScope = this.f29860a;
            androidx.compose.ui.platform.D1 d12 = this.f29861b;
            InterfaceC5914o interfaceC5914o = this.f29862c;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
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
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            Ki.Q.e(localThemeScope, C15196t0.f142485a, ComposableLambdaKt.c(143977700, true, new a(localThemeScope, d12, interfaceC5914o, interfaceC5868j0, 99), composer, 54), composer, 432);
            float f10 = 8;
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            Ki.Q.e(localThemeScope, C15193s.f142447a, ComposableLambdaKt.c(257793000, true, new b(localThemeScope), composer, 54), composer, 432);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            Ki.Q.e(localThemeScope, C15195t.f142484a, ComposableLambdaKt.c(834988713, true, new c(localThemeScope, interfaceC5868j0), composer, 54), composer, 432);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int d(InterfaceC5868j0 interfaceC5868j0) {
            return interfaceC5868j0.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(InterfaceC5868j0 interfaceC5868j0, int i10) {
            interfaceC5868j0.i(i10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29876a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.D1 f29877b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f29878c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC15150T, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.D1 f29879a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5914o f29880b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29881c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5864h0 f29882d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ double f29883e;

            a(androidx.compose.ui.platform.D1 d12, InterfaceC5914o interfaceC5914o, LocalThemeScope localThemeScope, InterfaceC5864h0 interfaceC5864h0, double d10) {
                this.f29879a = d12;
                this.f29880b = interfaceC5914o;
                this.f29881c = localThemeScope;
                this.f29882d = interfaceC5864h0;
                this.f29883e = d10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(double d10, InterfaceC5864h0 interfaceC5864h0, androidx.compose.ui.focus.E it) {
                Intrinsics.j(it, "it");
                if (!it.b() || !it.a()) {
                    e.e(interfaceC5864h0, RangesKt.m(e.d(interfaceC5864h0), 0.0d, d10));
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(double d10, androidx.compose.ui.platform.D1 d12, InterfaceC5914o interfaceC5914o, InterfaceC5864h0 interfaceC5864h0, InterfaceC5834y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                e.e(interfaceC5864h0, RangesKt.m(e.d(interfaceC5864h0), 0.0d, d10));
                if (d12 != null) {
                    d12.b();
                }
                InterfaceC5914o.l(interfaceC5914o, false, 1, null);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(InterfaceC5864h0 interfaceC5864h0, String proposed) {
                Intrinsics.j(proposed, "proposed");
                e.e(interfaceC5864h0, Double.parseDouble(C2823i1.a(proposed, Double.valueOf(e.d(interfaceC5864h0)))));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(InterfaceC15150T interfaceC15150T, final double d10, final InterfaceC5864h0 interfaceC5864h0, Ai.y1 AdsInputField) {
                Intrinsics.j(AdsInputField, "$this$AdsInputField");
                AdsInputField.m0(interfaceC15150T.getIcons().getTrailingIcon(), new Function0() { // from class: Qi.D8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.e.a.q(d10, interfaceC5864h0);
                    }
                });
                AdsInputField.N(interfaceC15150T.getIcons().getLeadingIcon(), new Function0() { // from class: Qi.E8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.e.a.r(interfaceC5864h0);
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
                    ComposerKt.U(387514563, i11, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:371)");
                }
                String strValueOf = String.valueOf(e.d(this.f29882d));
                q1.f.QuantityInput quantityInput = Assemble.getInputFields().getDefault();
                Modifier modifier = Assemble.getInputFields().getDefault().getModifier();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                final double d10 = this.f29883e;
                final InterfaceC5864h0 interfaceC5864h0 = this.f29882d;
                Object objB = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB == companion2.a()) {
                    objB = new Function1() { // from class: Qi.z8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.e.a.k(d10, interfaceC5864h0, (androidx.compose.ui.focus.E) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierThen = modifier.then(C5903d.a(companion, (Function1) objB));
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null);
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f29879a) | composer.D(this.f29880b);
                final double d11 = this.f29883e;
                final androidx.compose.ui.platform.D1 d12 = this.f29879a;
                final InterfaceC5914o interfaceC5914o = this.f29880b;
                final InterfaceC5864h0 interfaceC5864h02 = this.f29882d;
                Object objB2 = composer.B();
                if (zV || objB2 == companion2.a()) {
                    objB2 = new Function1() { // from class: Qi.A8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.e.a.l(d11, d12, interfaceC5914o, interfaceC5864h02, (InterfaceC5834y) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                q1.f.QuantityInput quantityInputX = quantityInput.x((65531 & 1) != 0 ? quantityInput.modifier : modifierThen, (65531 & 2) != 0 ? quantityInput.readOnly : false, (65531 & 4) != 0 ? quantityInput.state : null, (65531 & 8) != 0 ? quantityInput.textStyle : null, (65531 & 16) != 0 ? quantityInput.visualTransformation : null, (65531 & 32) != 0 ? quantityInput.keyboardOptions : keyboardOptions, (65531 & 64) != 0 ? quantityInput.keyboardActions : new C5835z((Function1) objB2, null, null, null, null, null, 62, null), (65531 & 128) != 0 ? quantityInput.singleLine : false, (65531 & 256) != 0 ? quantityInput.maxLines : 0, (65531 & 512) != 0 ? quantityInput.interactionSource : null, (65531 & 1024) != 0 ? quantityInput.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInput.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInput.signifier : null, (65531 & 8192) != 0 ? quantityInput.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInput.outerModifier : null, (65531 & 32768) != 0 ? quantityInput.shouldFillMaxWidth : false);
                LocalThemeScope localThemeScope = this.f29881c;
                composer.startReplaceGroup(5004770);
                final InterfaceC5864h0 interfaceC5864h03 = this.f29882d;
                Object objB3 = composer.B();
                if (objB3 == companion2.a()) {
                    objB3 = new Function1() { // from class: Qi.B8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.e.a.o(interfaceC5864h03, (String) obj);
                        }
                    };
                    composer.t(objB3);
                }
                Function1 function1 = (Function1) objB3;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean z10 = (i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble));
                final double d13 = this.f29883e;
                final InterfaceC5864h0 interfaceC5864h04 = this.f29882d;
                Object objB4 = composer.B();
                if (z10 || objB4 == companion2.a()) {
                    objB4 = new Function1() { // from class: Qi.C8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.e.a.p(Assemble, d13, interfaceC5864h04, (Ai.y1) obj);
                        }
                    };
                    composer.t(objB4);
                }
                composer.P();
                C2832m0.h(localThemeScope, strValueOf, quantityInputX, function1, null, "lb:", (Function1) objB4, composer, 199680, 8);
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
            public static final Unit q(double d10, InterfaceC5864h0 interfaceC5864h0) {
                if (e.d(interfaceC5864h0) < d10 && e.d(interfaceC5864h0) <= d10 - 0.25d) {
                    e.e(interfaceC5864h0, new BigDecimal(e.d(interfaceC5864h0) + 0.25d).setScale(2, RoundingMode.HALF_UP).doubleValue());
                } else if (e.d(interfaceC5864h0) < d10) {
                    e.e(interfaceC5864h0, d10);
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(InterfaceC5864h0 interfaceC5864h0) {
                if (e.d(interfaceC5864h0) > 0.0d && e.d(interfaceC5864h0) > 0.25d) {
                    e.e(interfaceC5864h0, new BigDecimal(e.d(interfaceC5864h0) - 0.25d).setScale(2, RoundingMode.HALF_UP).doubleValue());
                } else if (e.d(interfaceC5864h0) > 0.0d) {
                    e.e(interfaceC5864h0, 0.0d);
                }
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function3<ki.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29884a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f29885a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ki.j1 f29886b;

                a(LocalThemeScope localThemeScope, ki.j1 j1Var) {
                    this.f29885a = localThemeScope;
                    this.f29886b = j1Var;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1371715596, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:424)");
                    }
                    si.j.h(this.f29885a, this.f29886b.getLabels().getEnabledLabel(), "Add To Cart", null, composer, 384, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            b(LocalThemeScope localThemeScope) {
                this.f29884a = localThemeScope;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f143329a;
            }

            public final void b(ki.j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(501329863, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:423)");
                }
                LocalThemeScope localThemeScope = this.f29884a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Qi.F8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.e.b.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                oi.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-1371715596, true, new a(this.f29884a, Assemble), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c implements Function3<ki.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29887a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f29888a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ki.j1 f29889b;

                a(LocalThemeScope localThemeScope, ki.j1 j1Var) {
                    this.f29888a = localThemeScope;
                    this.f29889b = j1Var;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-794519883, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:432)");
                    }
                    si.j.h(this.f29888a, this.f29889b.getLabels().getEnabledLabel(), "Out of Stock", null, composer, 384, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            c(LocalThemeScope localThemeScope) {
                this.f29887a = localThemeScope;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f143329a;
            }

            public final void b(ki.j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1078525576, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:431)");
                }
                LocalThemeScope localThemeScope = this.f29887a;
                q1.d.StandardButton disabledButton = Assemble.getButtons().getDisabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Qi.G8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.e.c.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                oi.E0.b(localThemeScope, disabledButton, (Function0) objB, ComposableLambdaKt.c(-794519883, true, new a(this.f29887a, Assemble), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class d implements Function3<ki.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29890a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5864h0 f29891b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f29892a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ki.j1 f29893b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5864h0 f29894c;

                a(LocalThemeScope localThemeScope, ki.j1 j1Var, InterfaceC5864h0 interfaceC5864h0) {
                    this.f29892a = localThemeScope;
                    this.f29893b = j1Var;
                    this.f29894c = interfaceC5864h0;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-217324170, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:440)");
                    }
                    si.j.h(this.f29892a, this.f29893b.getLabels().getEnabledLabel(), String.valueOf(e.d(this.f29894c)), null, composer, 0, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            d(LocalThemeScope localThemeScope, InterfaceC5864h0 interfaceC5864h0) {
                this.f29890a = localThemeScope;
                this.f29891b = interfaceC5864h0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f143329a;
            }

            public final void b(ki.j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1655721289, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:439)");
                }
                LocalThemeScope localThemeScope = this.f29890a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Qi.H8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.e.d.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                oi.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-217324170, true, new a(this.f29890a, Assemble, this.f29891b), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        e(LocalThemeScope localThemeScope, androidx.compose.ui.platform.D1 d12, InterfaceC5914o interfaceC5914o) {
            this.f29876a = localThemeScope;
            this.f29877b = d12;
            this.f29878c = interfaceC5914o;
        }

        public final void c(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1772381898, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous> (QuantityInput.kt:366)");
            }
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = androidx.compose.runtime.Y0.a(0.0d);
                composer.t(objB);
            }
            InterfaceC5864h0 interfaceC5864h0 = (InterfaceC5864h0) objB;
            composer.P();
            LocalThemeScope localThemeScope = this.f29876a;
            androidx.compose.ui.platform.D1 d12 = this.f29877b;
            InterfaceC5914o interfaceC5914o = this.f29878c;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
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
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            Ki.Q.e(localThemeScope, ki.I0.f141925a, ComposableLambdaKt.c(387514563, true, new a(d12, interfaceC5914o, localThemeScope, interfaceC5864h0, 99.75d), composer, 54), composer, 432);
            float f10 = 8;
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            InterfaceC15205y.a.d dVar = InterfaceC15205y.a.d.f142547a;
            Ki.Q.e(localThemeScope, dVar, ComposableLambdaKt.c(501329863, true, new b(localThemeScope), composer, 54), composer, 432);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            Ki.Q.e(localThemeScope, dVar, ComposableLambdaKt.c(1078525576, true, new c(localThemeScope), composer, 54), composer, 432);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            Ki.Q.e(localThemeScope, InterfaceC15205y.a.e.f142549a, ComposableLambdaKt.c(1655721289, true, new d(localThemeScope, interfaceC5864h0), composer, 54), composer, 432);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double d(InterfaceC5864h0 interfaceC5864h0) {
            return interfaceC5864h0.d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(InterfaceC5864h0 interfaceC5864h0, double d10) {
            interfaceC5864h0.s(d10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class f implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29895a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.D1 f29896b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f29897c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC15150T, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29898a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.D1 f29899b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5914o f29900c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC14902f f29901d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f29902e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5868j0 f29903f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f29904g;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase$Content$1$6$1$1$4$1$1$1", f = "QuantityInput.kt", l = {489, 489}, m = "invokeSuspend")
            /* renamed from: Qi.W7$f$a$a, reason: collision with other inner class name */
            static final class C0593a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f29905a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f29906b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0593a(LocalThemeScope localThemeScope, Continuation<? super C0593a> continuation) {
                    super(2, continuation);
                    this.f29906b = localThemeScope;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C0593a(this.f29906b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C0593a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
                
                    if (Hi.i.i((Hi.i) r0, "All full here", "Please stop", null, false, null, null, null, null, r13, 252, null) == r12) goto L15;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                    /*
                        r13 = this;
                        java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                        int r0 = r13.f29905a
                        r1 = 2
                        r2 = 1
                        if (r0 == 0) goto L1f
                        if (r0 == r2) goto L1a
                        if (r0 != r1) goto L12
                        kotlin.ResultKt.b(r14)
                        goto L48
                    L12:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                        r0.<init>(r1)
                        throw r0
                    L1a:
                        kotlin.ResultKt.b(r14)
                        r0 = r14
                        goto L2f
                    L1f:
                        kotlin.ResultKt.b(r14)
                        Ki.M r0 = r13.f29906b
                        r13.f29905a = r2
                        r3 = 0
                        r4 = 0
                        java.lang.Object r0 = Ki.LocalThemeScope.g(r0, r3, r13, r2, r4)
                        if (r0 != r12) goto L2f
                        goto L47
                    L2f:
                        Hi.i r0 = (Hi.i) r0
                        r13.f29905a = r1
                        java.lang.String r1 = "All full here"
                        java.lang.String r2 = "Please stop"
                        r3 = 0
                        r4 = 0
                        r5 = 0
                        r6 = 0
                        r7 = 0
                        r8 = 0
                        r10 = 252(0xfc, float:3.53E-43)
                        r11 = 0
                        r9 = r13
                        java.lang.Object r0 = Hi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                        if (r0 != r12) goto L48
                    L47:
                        return r12
                    L48:
                        kotlin.Unit r0 = kotlin.Unit.f143329a
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: Qi.W7.f.a.C0593a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            a(LocalThemeScope localThemeScope, androidx.compose.ui.platform.D1 d12, InterfaceC5914o interfaceC5914o, InterfaceC14902f interfaceC14902f, InterfaceC15783O interfaceC15783O, InterfaceC5868j0 interfaceC5868j0, int i10) {
                this.f29898a = localThemeScope;
                this.f29899b = d12;
                this.f29900c = interfaceC5914o;
                this.f29901d = interfaceC14902f;
                this.f29902e = interfaceC15783O;
                this.f29903f = interfaceC5868j0;
                this.f29904g = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(int i10, InterfaceC5868j0 interfaceC5868j0, androidx.compose.ui.focus.E it) {
                Intrinsics.j(it, "it");
                if (!it.b() || !it.a()) {
                    f.g(interfaceC5868j0, RangesKt.o(f.f(interfaceC5868j0), 0, i10));
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(int i10, androidx.compose.ui.platform.D1 d12, InterfaceC5914o interfaceC5914o, InterfaceC5868j0 interfaceC5868j0, InterfaceC5834y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                f.g(interfaceC5868j0, RangesKt.o(f.f(interfaceC5868j0), 0, i10));
                if (d12 != null) {
                    d12.b();
                }
                InterfaceC5914o.l(interfaceC5914o, false, 1, null);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(InterfaceC5868j0 interfaceC5868j0, String proposed) {
                Intrinsics.j(proposed, "proposed");
                f.g(interfaceC5868j0, Integer.parseInt(C2823i1.a(proposed, Integer.valueOf(f.f(interfaceC5868j0)))));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(InterfaceC15150T interfaceC15150T, final int i10, final InterfaceC15783O interfaceC15783O, final InterfaceC5868j0 interfaceC5868j0, final LocalThemeScope localThemeScope, Ai.y1 AdsInputField) {
                Intrinsics.j(AdsInputField, "$this$AdsInputField");
                AdsInputField.m0(interfaceC15150T.getIcons().getTrailingIcon(), new Function0() { // from class: Qi.M8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.f.a.q(i10, interfaceC15783O, interfaceC5868j0, localThemeScope);
                    }
                });
                AdsInputField.N(interfaceC15150T.getIcons().getLeadingIcon(), new Function0() { // from class: Qi.N8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.f.a.r(interfaceC5868j0);
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
                    ComposerKt.U(631051426, i11, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:456)");
                }
                LocalThemeScope localThemeScope = this.f29898a;
                String strValueOf = String.valueOf(f.f(this.f29903f));
                q1.f.QuantityInput quantityInput = Assemble.getInputFields().getDefault();
                Modifier modifier = Assemble.getInputFields().getDefault().getModifier();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                final int i12 = this.f29904g;
                final InterfaceC5868j0 interfaceC5868j0 = this.f29903f;
                Object objB = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB == companion2.a()) {
                    objB = new Function1() { // from class: Qi.I8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.f.a.k(i12, interfaceC5868j0, (androidx.compose.ui.focus.E) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierH = androidx.compose.foundation.layout.J.h(modifier.then(C5903d.a(companion, (Function1) objB)), 0.0f, 1, null);
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null);
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f29899b) | composer.D(this.f29900c);
                final int i13 = this.f29904g;
                final androidx.compose.ui.platform.D1 d12 = this.f29899b;
                final InterfaceC5914o interfaceC5914o = this.f29900c;
                final InterfaceC5868j0 interfaceC5868j02 = this.f29903f;
                Object objB2 = composer.B();
                if (zV || objB2 == companion2.a()) {
                    objB2 = new Function1() { // from class: Qi.J8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.f.a.l(i13, d12, interfaceC5914o, interfaceC5868j02, (InterfaceC5834y) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                q1.f.QuantityInput quantityInputX = quantityInput.x((65531 & 1) != 0 ? quantityInput.modifier : modifierH, (65531 & 2) != 0 ? quantityInput.readOnly : false, (65531 & 4) != 0 ? quantityInput.state : null, (65531 & 8) != 0 ? quantityInput.textStyle : null, (65531 & 16) != 0 ? quantityInput.visualTransformation : null, (65531 & 32) != 0 ? quantityInput.keyboardOptions : keyboardOptions, (65531 & 64) != 0 ? quantityInput.keyboardActions : new C5835z((Function1) objB2, null, null, null, null, null, 62, null), (65531 & 128) != 0 ? quantityInput.singleLine : false, (65531 & 256) != 0 ? quantityInput.maxLines : 0, (65531 & 512) != 0 ? quantityInput.interactionSource : null, (65531 & 1024) != 0 ? quantityInput.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInput.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInput.signifier : null, (65531 & 8192) != 0 ? quantityInput.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInput.outerModifier : InterfaceC14902f.b(this.f29901d, Assemble.getInputFields().getDefault().getOuterModifier(), 1.0f, false, 2, null), (65531 & 32768) != 0 ? quantityInput.shouldFillMaxWidth : false);
                composer.startReplaceGroup(5004770);
                final InterfaceC5868j0 interfaceC5868j03 = this.f29903f;
                Object objB3 = composer.B();
                if (objB3 == companion2.a()) {
                    objB3 = new Function1() { // from class: Qi.K8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.f.a.o(interfaceC5868j03, (String) obj);
                        }
                    };
                    composer.t(objB3);
                }
                Function1 function1 = (Function1) objB3;
                composer.P();
                composer.startReplaceGroup(-1224400529);
                boolean zD = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f29902e) | composer.D(this.f29898a);
                final int i14 = this.f29904g;
                final InterfaceC15783O interfaceC15783O = this.f29902e;
                final InterfaceC5868j0 interfaceC5868j04 = this.f29903f;
                final LocalThemeScope localThemeScope2 = this.f29898a;
                Object objB4 = composer.B();
                if (zD || objB4 == companion2.a()) {
                    Function1 function12 = new Function1() { // from class: Qi.L8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.f.a.p(Assemble, i14, interfaceC15783O, interfaceC5868j04, localThemeScope2, (Ai.y1) obj);
                        }
                    };
                    composer.t(function12);
                    objB4 = function12;
                }
                composer.P();
                C2832m0.h(localThemeScope, strValueOf, quantityInputX, function1, null, null, (Function1) objB4, composer, 3072, 24);
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
            public static final Unit q(int i10, InterfaceC15783O interfaceC15783O, InterfaceC5868j0 interfaceC5868j0, LocalThemeScope localThemeScope) {
                if (f.f(interfaceC5868j0) < i10) {
                    f.g(interfaceC5868j0, f.f(interfaceC5868j0) + 1);
                }
                if (f.f(interfaceC5868j0) == i10) {
                    C15809k.d(interfaceC15783O, null, null, new C0593a(localThemeScope, null), 3, null);
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(InterfaceC5868j0 interfaceC5868j0) {
                if (f.f(interfaceC5868j0) > 0) {
                    f.g(interfaceC5868j0, f.f(interfaceC5868j0) - 1);
                }
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function3<InterfaceC15150T, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29907a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14888I f29908b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5868j0 f29909c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f29910d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ double f29911e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5864h0 f29912f;

            b(LocalThemeScope localThemeScope, InterfaceC14888I interfaceC14888I, InterfaceC5868j0 interfaceC5868j0, int i10, double d10, InterfaceC5864h0 interfaceC5864h0) {
                this.f29907a = localThemeScope;
                this.f29908b = interfaceC14888I;
                this.f29909c = interfaceC5868j0;
                this.f29910d = i10;
                this.f29911e = d10;
                this.f29912f = interfaceC5864h0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(int i10, InterfaceC5868j0 interfaceC5868j0, androidx.compose.ui.focus.E it) {
                Intrinsics.j(it, "it");
                if (!it.b() || !it.a()) {
                    f.g(interfaceC5868j0, RangesKt.o(f.f(interfaceC5868j0), 0, i10));
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(int i10, int i11) {
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(InterfaceC15150T interfaceC15150T, final double d10, final InterfaceC5864h0 interfaceC5864h0, Ai.y1 InputField) {
                Intrinsics.j(InputField, "$this$InputField");
                InputField.m0(interfaceC15150T.getIcons().getTrailingIcon(), new Function0() { // from class: Qi.R8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.f.b.o(d10, interfaceC5864h0);
                    }
                });
                InputField.N(interfaceC15150T.getIcons().getLeadingIcon(), new Function0() { // from class: Qi.S8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.f.b.p(interfaceC5864h0);
                    }
                });
                return Unit.f143329a;
            }

            public final void f(final InterfaceC15150T Assemble, Composer composer, int i10) {
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
                    ComposerKt.U(-707222330, i11, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:508)");
                }
                LocalThemeScope localThemeScope = this.f29907a;
                int iF = f.f(this.f29909c);
                q1.f.QuantityInput quantityInput = Assemble.getInputFields().getDefault();
                Modifier modifier = Assemble.getInputFields().getDefault().getModifier();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                final int i12 = this.f29910d;
                final InterfaceC5868j0 interfaceC5868j0 = this.f29909c;
                Object objB = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB == companion2.a()) {
                    objB = new Function1() { // from class: Qi.O8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.f.b.g(i12, interfaceC5868j0, (androidx.compose.ui.focus.E) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                q1.f.QuantityInput quantityInputX = quantityInput.x((65531 & 1) != 0 ? quantityInput.modifier : androidx.compose.foundation.layout.J.h(modifier.then(C5903d.a(companion, (Function1) objB)), 0.0f, 1, null), (65531 & 2) != 0 ? quantityInput.readOnly : false, (65531 & 4) != 0 ? quantityInput.state : null, (65531 & 8) != 0 ? quantityInput.textStyle : null, (65531 & 16) != 0 ? quantityInput.visualTransformation : null, (65531 & 32) != 0 ? quantityInput.keyboardOptions : null, (65531 & 64) != 0 ? quantityInput.keyboardActions : null, (65531 & 128) != 0 ? quantityInput.singleLine : false, (65531 & 256) != 0 ? quantityInput.maxLines : 0, (65531 & 512) != 0 ? quantityInput.interactionSource : null, (65531 & 1024) != 0 ? quantityInput.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInput.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInput.signifier : null, (65531 & 8192) != 0 ? quantityInput.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInput.outerModifier : InterfaceC14888I.b(this.f29908b, Assemble.getInputFields().getDefault().getOuterModifier(), 1.0f, false, 2, null), (65531 & 32768) != 0 ? quantityInput.shouldFillMaxWidth : false);
                composer.startReplaceGroup(1849434622);
                Object objB2 = composer.B();
                if (objB2 == companion2.a()) {
                    objB2 = new Function2() { // from class: Qi.P8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return W7.f.b.k(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                        }
                    };
                    composer.t(objB2);
                }
                Function2 function2 = (Function2) objB2;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean z10 = (i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble));
                final double d10 = this.f29911e;
                final InterfaceC5864h0 interfaceC5864h0 = this.f29912f;
                Object objB3 = composer.B();
                if (z10 || objB3 == companion2.a()) {
                    objB3 = new Function1() { // from class: Qi.Q8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.f.b.l(Assemble, d10, interfaceC5864h0, (Ai.y1) obj);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                Ai.p1.h(localThemeScope, iF, 0, quantityInputX, function2, null, (Function1) objB3, composer, 24576, 18);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15150T interfaceC15150T, Composer composer, Integer num) {
                f(interfaceC15150T, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(double d10, InterfaceC5864h0 interfaceC5864h0) {
                if (f.k(interfaceC5864h0) < d10 && f.k(interfaceC5864h0) <= d10 - 0.25d) {
                    f.l(interfaceC5864h0, new BigDecimal(f.k(interfaceC5864h0) + 0.25d).setScale(2, RoundingMode.HALF_UP).doubleValue());
                } else if (f.k(interfaceC5864h0) < d10) {
                    f.l(interfaceC5864h0, d10);
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(InterfaceC5864h0 interfaceC5864h0) {
                if (f.k(interfaceC5864h0) > 0.0d && f.k(interfaceC5864h0) > 0.25d) {
                    f.l(interfaceC5864h0, new BigDecimal(f.k(interfaceC5864h0) - 0.25d).setScale(2, RoundingMode.HALF_UP).doubleValue());
                } else if (f.k(interfaceC5864h0) > 0.0d) {
                    f.l(interfaceC5864h0, 0.0d);
                }
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c implements Function3<ki.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29913a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f29914a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ki.j1 f29915b;

                a(LocalThemeScope localThemeScope, ki.j1 j1Var) {
                    this.f29914a = localThemeScope;
                    this.f29915b = j1Var;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1128178733, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:551)");
                    }
                    C16671b.b(this.f29914a, this.f29915b.getIcons().getEnabledIcon(), C.a.C0287a.f16877e, null, composer, 384, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            c(LocalThemeScope localThemeScope) {
                this.f29913a = localThemeScope;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f143329a;
            }

            public final void b(ki.j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(744866726, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:550)");
                }
                LocalThemeScope localThemeScope = this.f29913a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Qi.T8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.f.c.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                oi.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-1128178733, true, new a(this.f29913a, Assemble), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class d implements Function3<ki.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29916a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5868j0 f29917b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f29918a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ki.j1 f29919b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5868j0 f29920c;

                a(LocalThemeScope localThemeScope, ki.j1 j1Var, InterfaceC5868j0 interfaceC5868j0) {
                    this.f29918a = localThemeScope;
                    this.f29919b = j1Var;
                    this.f29920c = interfaceC5868j0;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-550983020, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:562)");
                    }
                    si.j.h(this.f29918a, this.f29919b.getLabels().getEnabledLabel(), String.valueOf(f.f(this.f29920c)), null, composer, 0, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            d(LocalThemeScope localThemeScope, InterfaceC5868j0 interfaceC5868j0) {
                this.f29916a = localThemeScope;
                this.f29917b = interfaceC5868j0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f143329a;
            }

            public final void b(ki.j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1322062439, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:561)");
                }
                LocalThemeScope localThemeScope = this.f29916a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Qi.U8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.f.d.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                oi.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-550983020, true, new a(this.f29916a, Assemble, this.f29917b), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        f(LocalThemeScope localThemeScope, androidx.compose.ui.platform.D1 d12, InterfaceC5914o interfaceC5914o) {
            this.f29895a = localThemeScope;
            this.f29896b = d12;
            this.f29897c = interfaceC5914o;
        }

        public final void e(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1528845035, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous> (QuantityInput.kt:450)");
            }
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = C5844c1.a(0);
                composer.t(objB);
            }
            InterfaceC5868j0 interfaceC5868j0 = (InterfaceC5868j0) objB;
            composer.P();
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = androidx.compose.runtime.J.k(EmptyCoroutineContext.f143553a, composer);
                composer.t(objB2);
            }
            InterfaceC15783O interfaceC15783O = (InterfaceC15783O) objB2;
            LocalThemeScope localThemeScope = this.f29895a;
            androidx.compose.ui.platform.D1 d12 = this.f29896b;
            InterfaceC5914o interfaceC5914o = this.f29897c;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            C5800d c5800d = C5800d.f48779a;
            C5800d.m mVarH = c5800d.h();
            e.Companion companion3 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion3.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion2);
            InterfaceC5953g.Companion companion4 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion4.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion4.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion4.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion4.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion4.f());
            C14903g c14903g = C14903g.f139698a;
            ki.B0 b02 = ki.B0.f141859a;
            Ki.Q.e(localThemeScope, b02, ComposableLambdaKt.c(631051426, true, new a(localThemeScope, d12, interfaceC5914o, c14903g, interfaceC15783O, interfaceC5868j0, 99), composer, 54), composer, 432);
            float f10 = 8;
            C14890K.a(androidx.compose.foundation.layout.J.i(companion2, H1.h.p(f10)), composer, 6);
            Modifier modifierK = androidx.compose.foundation.layout.D.k(companion2, H1.h.p(16), 0.0f, 2, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion3.l(), composer, 0);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierK);
            Function0<InterfaceC5953g> function0A2 = companion4.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyB, companion4.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion4.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion4.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            androidx.compose.runtime.D1.c(composerA2, modifierE2, companion4.f());
            C14889J c14889j = C14889J.f139620a;
            composer.startReplaceGroup(1849434622);
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = androidx.compose.runtime.Y0.a(0.0d);
                composer.t(objB3);
            }
            composer.P();
            Ki.Q.e(localThemeScope, b02, ComposableLambdaKt.c(-707222330, true, new b(localThemeScope, c14889j, interfaceC5868j0, 99, 99.75d, (InterfaceC5864h0) objB3), composer, 54), composer, 432);
            composer.v();
            C14890K.a(androidx.compose.foundation.layout.J.i(companion2, H1.h.p(f10)), composer, 6);
            Ki.Q.e(localThemeScope, C15185o.f142170a, ComposableLambdaKt.c(744866726, true, new c(localThemeScope), composer, 54), composer, 432);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion2, H1.h.p(f10)), composer, 6);
            Ki.Q.e(localThemeScope, C15187p.f142174a, ComposableLambdaKt.c(1322062439, true, new d(localThemeScope, interfaceC5868j0), composer, 54), composer, 432);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            e(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int f(InterfaceC5868j0 interfaceC5868j0) {
            return interfaceC5868j0.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(InterfaceC5868j0 interfaceC5868j0, int i10) {
            interfaceC5868j0.i(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double k(InterfaceC5864h0 interfaceC5864h0) {
            return interfaceC5864h0.d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(InterfaceC5864h0 interfaceC5864h0, double d10) {
            interfaceC5864h0.s(d10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class g implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29921a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.D1 f29922b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5914o f29923c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC15150T, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.D1 f29924a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5914o f29925b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29926c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5864h0 f29927d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ double f29928e;

            a(androidx.compose.ui.platform.D1 d12, InterfaceC5914o interfaceC5914o, LocalThemeScope localThemeScope, InterfaceC5864h0 interfaceC5864h0, double d10) {
                this.f29924a = d12;
                this.f29925b = interfaceC5914o;
                this.f29926c = localThemeScope;
                this.f29927d = interfaceC5864h0;
                this.f29928e = d10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(double d10, InterfaceC5864h0 interfaceC5864h0, androidx.compose.ui.focus.E it) {
                Intrinsics.j(it, "it");
                if (!it.b() || !it.a()) {
                    g.e(interfaceC5864h0, RangesKt.m(g.d(interfaceC5864h0), 0.0d, d10));
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(double d10, androidx.compose.ui.platform.D1 d12, InterfaceC5914o interfaceC5914o, InterfaceC5864h0 interfaceC5864h0, InterfaceC5834y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                g.e(interfaceC5864h0, RangesKt.m(g.d(interfaceC5864h0), 0.0d, d10));
                if (d12 != null) {
                    d12.b();
                }
                InterfaceC5914o.l(interfaceC5914o, false, 1, null);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(InterfaceC5864h0 interfaceC5864h0, String proposed) {
                Intrinsics.j(proposed, "proposed");
                g.e(interfaceC5864h0, Double.parseDouble(C2823i1.a(proposed, Double.valueOf(g.d(interfaceC5864h0)))));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(InterfaceC15150T interfaceC15150T, final double d10, final InterfaceC5864h0 interfaceC5864h0, Ai.y1 AdsInputField) {
                Intrinsics.j(AdsInputField, "$this$AdsInputField");
                AdsInputField.m0(interfaceC15150T.getIcons().getTrailingIcon(), new Function0() { // from class: Qi.Z8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.g.a.q(d10, interfaceC5864h0);
                    }
                });
                AdsInputField.N(interfaceC15150T.getIcons().getLeadingIcon(), new Function0() { // from class: Qi.a9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.g.a.r(interfaceC5864h0);
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
                    ComposerKt.U(-463685467, i11, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:583)");
                }
                String strValueOf = String.valueOf(g.d(this.f29927d));
                q1.f.QuantityInput quantityInput = Assemble.getInputFields().getDefault();
                Modifier modifier = Assemble.getInputFields().getDefault().getModifier();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                final double d10 = this.f29928e;
                final InterfaceC5864h0 interfaceC5864h0 = this.f29927d;
                Object objB = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB == companion2.a()) {
                    objB = new Function1() { // from class: Qi.V8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.a.k(d10, interfaceC5864h0, (androidx.compose.ui.focus.E) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierThen = modifier.then(C5903d.a(companion, (Function1) objB));
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null);
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f29924a) | composer.D(this.f29925b);
                final double d11 = this.f29928e;
                final androidx.compose.ui.platform.D1 d12 = this.f29924a;
                final InterfaceC5914o interfaceC5914o = this.f29925b;
                final InterfaceC5864h0 interfaceC5864h02 = this.f29927d;
                Object objB2 = composer.B();
                if (zV || objB2 == companion2.a()) {
                    objB2 = new Function1() { // from class: Qi.W8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.a.l(d11, d12, interfaceC5914o, interfaceC5864h02, (InterfaceC5834y) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                q1.f.QuantityInput quantityInputX = quantityInput.x((65531 & 1) != 0 ? quantityInput.modifier : modifierThen, (65531 & 2) != 0 ? quantityInput.readOnly : false, (65531 & 4) != 0 ? quantityInput.state : null, (65531 & 8) != 0 ? quantityInput.textStyle : null, (65531 & 16) != 0 ? quantityInput.visualTransformation : null, (65531 & 32) != 0 ? quantityInput.keyboardOptions : keyboardOptions, (65531 & 64) != 0 ? quantityInput.keyboardActions : new C5835z((Function1) objB2, null, null, null, null, null, 62, null), (65531 & 128) != 0 ? quantityInput.singleLine : false, (65531 & 256) != 0 ? quantityInput.maxLines : 0, (65531 & 512) != 0 ? quantityInput.interactionSource : null, (65531 & 1024) != 0 ? quantityInput.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInput.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInput.signifier : null, (65531 & 8192) != 0 ? quantityInput.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInput.outerModifier : null, (65531 & 32768) != 0 ? quantityInput.shouldFillMaxWidth : false);
                LocalThemeScope localThemeScope = this.f29926c;
                composer.startReplaceGroup(5004770);
                final InterfaceC5864h0 interfaceC5864h03 = this.f29927d;
                Object objB3 = composer.B();
                if (objB3 == companion2.a()) {
                    objB3 = new Function1() { // from class: Qi.X8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.a.o(interfaceC5864h03, (String) obj);
                        }
                    };
                    composer.t(objB3);
                }
                Function1 function1 = (Function1) objB3;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean z10 = (i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble));
                final double d13 = this.f29928e;
                final InterfaceC5864h0 interfaceC5864h04 = this.f29927d;
                Object objB4 = composer.B();
                if (z10 || objB4 == companion2.a()) {
                    objB4 = new Function1() { // from class: Qi.Y8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.a.p(Assemble, d13, interfaceC5864h04, (Ai.y1) obj);
                        }
                    };
                    composer.t(objB4);
                }
                composer.P();
                C2832m0.h(localThemeScope, strValueOf, quantityInputX, function1, null, "lb:", (Function1) objB4, composer, 199680, 8);
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
            public static final Unit q(double d10, InterfaceC5864h0 interfaceC5864h0) {
                if (g.d(interfaceC5864h0) < d10 && g.d(interfaceC5864h0) <= d10 - 0.25d) {
                    g.e(interfaceC5864h0, new BigDecimal(g.d(interfaceC5864h0) + 0.25d).setScale(2, RoundingMode.HALF_UP).doubleValue());
                } else if (g.d(interfaceC5864h0) < d10) {
                    g.e(interfaceC5864h0, d10);
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(InterfaceC5864h0 interfaceC5864h0) {
                if (g.d(interfaceC5864h0) > 0.0d && g.d(interfaceC5864h0) > 0.25d) {
                    g.e(interfaceC5864h0, new BigDecimal(g.d(interfaceC5864h0) - 0.25d).setScale(2, RoundingMode.HALF_UP).doubleValue());
                } else if (g.d(interfaceC5864h0) > 0.0d) {
                    g.e(interfaceC5864h0, 0.0d);
                }
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function3<ki.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29929a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f29930a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ki.j1 f29931b;

                a(LocalThemeScope localThemeScope, ki.j1 j1Var) {
                    this.f29930a = localThemeScope;
                    this.f29931b = j1Var;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-109178346, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:636)");
                    }
                    C16671b.b(this.f29930a, this.f29931b.getIcons().getEnabledIcon(), C.a.C0287a.f16877e, null, composer, 384, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            b(LocalThemeScope localThemeScope) {
                this.f29929a = localThemeScope;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f143329a;
            }

            public final void b(ki.j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1556889431, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:635)");
                }
                LocalThemeScope localThemeScope = this.f29929a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Qi.b9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.g.b.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                oi.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-109178346, true, new a(this.f29929a, Assemble), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c implements Function3<InterfaceC15150T, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.D1 f29932a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5914o f29933b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29934c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5864h0 f29935d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ double f29936e;

            c(androidx.compose.ui.platform.D1 d12, InterfaceC5914o interfaceC5914o, LocalThemeScope localThemeScope, InterfaceC5864h0 interfaceC5864h0, double d10) {
                this.f29932a = d12;
                this.f29933b = interfaceC5914o;
                this.f29934c = localThemeScope;
                this.f29935d = interfaceC5864h0;
                this.f29936e = d10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(double d10, InterfaceC5864h0 interfaceC5864h0, androidx.compose.ui.focus.E it) {
                Intrinsics.j(it, "it");
                if (!it.b() || !it.a()) {
                    g.e(interfaceC5864h0, RangesKt.m(g.d(interfaceC5864h0), 0.0d, d10));
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(double d10, androidx.compose.ui.platform.D1 d12, InterfaceC5914o interfaceC5914o, InterfaceC5864h0 interfaceC5864h0, InterfaceC5834y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                g.e(interfaceC5864h0, RangesKt.m(g.d(interfaceC5864h0), 0.0d, d10));
                if (d12 != null) {
                    d12.b();
                }
                InterfaceC5914o.l(interfaceC5914o, false, 1, null);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(InterfaceC5864h0 interfaceC5864h0, String proposed) {
                Intrinsics.j(proposed, "proposed");
                g.e(interfaceC5864h0, Double.parseDouble(C2823i1.a(proposed, Double.valueOf(g.d(interfaceC5864h0)))));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(InterfaceC15150T interfaceC15150T, final double d10, final InterfaceC5864h0 interfaceC5864h0, Ai.y1 AdsInputField) {
                Intrinsics.j(AdsInputField, "$this$AdsInputField");
                AdsInputField.m0(interfaceC15150T.getIcons().getTrailingIcon(), new Function0() { // from class: Qi.g9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.g.c.q(d10, interfaceC5864h0);
                    }
                });
                AdsInputField.N(interfaceC15150T.getIcons().getLeadingIcon(), new Function0() { // from class: Qi.h9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.g.c.r(interfaceC5864h0);
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
                    ComposerKt.U(956919964, i11, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:653)");
                }
                String strValueOf = String.valueOf(g.d(this.f29935d));
                q1.f.QuantityInput quantityInput = Assemble.getInputFields().getDefault();
                Modifier modifier = Assemble.getInputFields().getDefault().getModifier();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                final double d10 = this.f29936e;
                final InterfaceC5864h0 interfaceC5864h0 = this.f29935d;
                Object objB = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB == companion2.a()) {
                    objB = new Function1() { // from class: Qi.c9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.c.k(d10, interfaceC5864h0, (androidx.compose.ui.focus.E) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierThen = modifier.then(C5903d.a(companion, (Function1) objB));
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null);
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f29932a) | composer.D(this.f29933b);
                final double d11 = this.f29936e;
                final androidx.compose.ui.platform.D1 d12 = this.f29932a;
                final InterfaceC5914o interfaceC5914o = this.f29933b;
                final InterfaceC5864h0 interfaceC5864h02 = this.f29935d;
                Object objB2 = composer.B();
                if (zV || objB2 == companion2.a()) {
                    objB2 = new Function1() { // from class: Qi.d9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.c.l(d11, d12, interfaceC5914o, interfaceC5864h02, (InterfaceC5834y) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                q1.f.QuantityInput quantityInputX = quantityInput.x((65531 & 1) != 0 ? quantityInput.modifier : modifierThen, (65531 & 2) != 0 ? quantityInput.readOnly : false, (65531 & 4) != 0 ? quantityInput.state : null, (65531 & 8) != 0 ? quantityInput.textStyle : null, (65531 & 16) != 0 ? quantityInput.visualTransformation : null, (65531 & 32) != 0 ? quantityInput.keyboardOptions : keyboardOptions, (65531 & 64) != 0 ? quantityInput.keyboardActions : new C5835z((Function1) objB2, null, null, null, null, null, 62, null), (65531 & 128) != 0 ? quantityInput.singleLine : false, (65531 & 256) != 0 ? quantityInput.maxLines : 0, (65531 & 512) != 0 ? quantityInput.interactionSource : null, (65531 & 1024) != 0 ? quantityInput.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInput.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInput.signifier : null, (65531 & 8192) != 0 ? quantityInput.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInput.outerModifier : null, (65531 & 32768) != 0 ? quantityInput.shouldFillMaxWidth : false);
                LocalThemeScope localThemeScope = this.f29934c;
                composer.startReplaceGroup(5004770);
                final InterfaceC5864h0 interfaceC5864h03 = this.f29935d;
                Object objB3 = composer.B();
                if (objB3 == companion2.a()) {
                    objB3 = new Function1() { // from class: Qi.e9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.c.o(interfaceC5864h03, (String) obj);
                        }
                    };
                    composer.t(objB3);
                }
                Function1 function1 = (Function1) objB3;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean z10 = (i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble));
                final double d13 = this.f29936e;
                final InterfaceC5864h0 interfaceC5864h04 = this.f29935d;
                Object objB4 = composer.B();
                if (z10 || objB4 == companion2.a()) {
                    objB4 = new Function1() { // from class: Qi.f9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.c.p(Assemble, d13, interfaceC5864h04, (Ai.y1) obj);
                        }
                    };
                    composer.t(objB4);
                }
                composer.P();
                C2832m0.h(localThemeScope, strValueOf, quantityInputX, function1, null, "lb:", (Function1) objB4, composer, 199680, 8);
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
            public static final Unit q(double d10, InterfaceC5864h0 interfaceC5864h0) {
                if (g.d(interfaceC5864h0) < d10 && g.d(interfaceC5864h0) <= d10 - 0.25d) {
                    g.e(interfaceC5864h0, new BigDecimal(g.d(interfaceC5864h0) + 0.25d).setScale(2, RoundingMode.HALF_UP).doubleValue());
                } else if (g.d(interfaceC5864h0) < d10) {
                    g.e(interfaceC5864h0, d10);
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(InterfaceC5864h0 interfaceC5864h0) {
                if (g.d(interfaceC5864h0) > 0.0d && g.d(interfaceC5864h0) > 0.25d) {
                    g.e(interfaceC5864h0, new BigDecimal(g.d(interfaceC5864h0) - 0.25d).setScale(2, RoundingMode.HALF_UP).doubleValue());
                } else if (g.d(interfaceC5864h0) > 0.0d) {
                    g.e(interfaceC5864h0, 0.0d);
                }
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class d implements Function3<ki.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29937a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f29938a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ki.j1 f29939b;

                a(LocalThemeScope localThemeScope, ki.j1 j1Var) {
                    this.f29938a = localThemeScope;
                    this.f29939b = j1Var;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1959120435, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:706)");
                    }
                    C16671b.b(this.f29938a, this.f29939b.getIcons().getEnabledIcon(), C.a.C0287a.f16877e, null, composer, 384, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            d(LocalThemeScope localThemeScope) {
                this.f29937a = localThemeScope;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f143329a;
            }

            public final void b(ki.j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1640069216, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:705)");
                }
                LocalThemeScope localThemeScope = this.f29937a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Qi.i9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.g.d.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                oi.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-1959120435, true, new a(this.f29937a, Assemble), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class e implements Function3<InterfaceC15150T, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.D1 f29940a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5914o f29941b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29942c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5864h0 f29943d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ double f29944e;

            e(androidx.compose.ui.platform.D1 d12, InterfaceC5914o interfaceC5914o, LocalThemeScope localThemeScope, InterfaceC5864h0 interfaceC5864h0, double d10) {
                this.f29940a = d12;
                this.f29941b = interfaceC5914o;
                this.f29942c = localThemeScope;
                this.f29943d = interfaceC5864h0;
                this.f29944e = d10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(double d10, InterfaceC5864h0 interfaceC5864h0, androidx.compose.ui.focus.E it) {
                Intrinsics.j(it, "it");
                if (!it.b() || !it.a()) {
                    g.e(interfaceC5864h0, RangesKt.m(g.d(interfaceC5864h0), 0.0d, d10));
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(double d10, androidx.compose.ui.platform.D1 d12, InterfaceC5914o interfaceC5914o, InterfaceC5864h0 interfaceC5864h0, InterfaceC5834y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                g.e(interfaceC5864h0, RangesKt.m(g.d(interfaceC5864h0), 0.0d, d10));
                if (d12 != null) {
                    d12.b();
                }
                InterfaceC5914o.l(interfaceC5914o, false, 1, null);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(InterfaceC5864h0 interfaceC5864h0, String proposed) {
                Intrinsics.j(proposed, "proposed");
                g.e(interfaceC5864h0, Double.parseDouble(C2823i1.a(proposed, Double.valueOf(g.d(interfaceC5864h0)))));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(InterfaceC15150T interfaceC15150T, final double d10, final InterfaceC5864h0 interfaceC5864h0, Ai.y1 AdsInputField) {
                Intrinsics.j(AdsInputField, "$this$AdsInputField");
                AdsInputField.m0(interfaceC15150T.getIcons().getTrailingIcon(), new Function0() { // from class: Qi.n9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.g.e.q(d10, interfaceC5864h0);
                    }
                });
                AdsInputField.N(interfaceC15150T.getIcons().getLeadingIcon(), new Function0() { // from class: Qi.o9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.g.e.r(interfaceC5864h0);
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
                    ComposerKt.U(1534115677, i11, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:724)");
                }
                String strValueOf = String.valueOf(g.d(this.f29943d));
                q1.f.QuantityInput quantityInput = Assemble.getInputFields().getDefault();
                Modifier modifier = Assemble.getInputFields().getDefault().getModifier();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                final double d10 = this.f29944e;
                final InterfaceC5864h0 interfaceC5864h0 = this.f29943d;
                Object objB = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB == companion2.a()) {
                    objB = new Function1() { // from class: Qi.j9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.e.k(d10, interfaceC5864h0, (androidx.compose.ui.focus.E) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierThen = modifier.then(C5903d.a(companion, (Function1) objB));
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null);
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f29940a) | composer.D(this.f29941b);
                final double d11 = this.f29944e;
                final androidx.compose.ui.platform.D1 d12 = this.f29940a;
                final InterfaceC5914o interfaceC5914o = this.f29941b;
                final InterfaceC5864h0 interfaceC5864h02 = this.f29943d;
                Object objB2 = composer.B();
                if (zV || objB2 == companion2.a()) {
                    objB2 = new Function1() { // from class: Qi.k9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.e.l(d11, d12, interfaceC5914o, interfaceC5864h02, (InterfaceC5834y) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                q1.f.QuantityInput quantityInputX = quantityInput.x((65531 & 1) != 0 ? quantityInput.modifier : modifierThen, (65531 & 2) != 0 ? quantityInput.readOnly : false, (65531 & 4) != 0 ? quantityInput.state : null, (65531 & 8) != 0 ? quantityInput.textStyle : null, (65531 & 16) != 0 ? quantityInput.visualTransformation : null, (65531 & 32) != 0 ? quantityInput.keyboardOptions : keyboardOptions, (65531 & 64) != 0 ? quantityInput.keyboardActions : new C5835z((Function1) objB2, null, null, null, null, null, 62, null), (65531 & 128) != 0 ? quantityInput.singleLine : false, (65531 & 256) != 0 ? quantityInput.maxLines : 0, (65531 & 512) != 0 ? quantityInput.interactionSource : null, (65531 & 1024) != 0 ? quantityInput.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInput.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInput.signifier : null, (65531 & 8192) != 0 ? quantityInput.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInput.outerModifier : null, (65531 & 32768) != 0 ? quantityInput.shouldFillMaxWidth : false);
                LocalThemeScope localThemeScope = this.f29942c;
                composer.startReplaceGroup(5004770);
                final InterfaceC5864h0 interfaceC5864h03 = this.f29943d;
                Object objB3 = composer.B();
                if (objB3 == companion2.a()) {
                    objB3 = new Function1() { // from class: Qi.l9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.e.o(interfaceC5864h03, (String) obj);
                        }
                    };
                    composer.t(objB3);
                }
                Function1 function1 = (Function1) objB3;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean z10 = (i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble));
                final double d13 = this.f29944e;
                final InterfaceC5864h0 interfaceC5864h04 = this.f29943d;
                Object objB4 = composer.B();
                if (z10 || objB4 == companion2.a()) {
                    objB4 = new Function1() { // from class: Qi.m9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.e.p(Assemble, d13, interfaceC5864h04, (Ai.y1) obj);
                        }
                    };
                    composer.t(objB4);
                }
                composer.P();
                C2832m0.h(localThemeScope, strValueOf, quantityInputX, function1, null, "lb:", (Function1) objB4, composer, 199680, 8);
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
            public static final Unit q(double d10, InterfaceC5864h0 interfaceC5864h0) {
                if (g.d(interfaceC5864h0) < d10 && g.d(interfaceC5864h0) <= d10 - 0.25d) {
                    g.e(interfaceC5864h0, new BigDecimal(g.d(interfaceC5864h0) + 0.25d).setScale(2, RoundingMode.HALF_UP).doubleValue());
                } else if (g.d(interfaceC5864h0) < d10) {
                    g.e(interfaceC5864h0, d10);
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(InterfaceC5864h0 interfaceC5864h0) {
                if (g.d(interfaceC5864h0) > 0.0d && g.d(interfaceC5864h0) > 0.25d) {
                    g.e(interfaceC5864h0, new BigDecimal(g.d(interfaceC5864h0) - 0.25d).setScale(2, RoundingMode.HALF_UP).doubleValue());
                } else if (g.d(interfaceC5864h0) > 0.0d) {
                    g.e(interfaceC5864h0, 0.0d);
                }
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class f implements Function3<ki.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29945a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5864h0 f29946b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f29947a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ki.j1 f29948b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5864h0 f29949c;

                a(LocalThemeScope localThemeScope, ki.j1 j1Var, InterfaceC5864h0 interfaceC5864h0) {
                    this.f29947a = localThemeScope;
                    this.f29948b = j1Var;
                    this.f29949c = interfaceC5864h0;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1381924722, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:777)");
                    }
                    si.j.h(this.f29947a, this.f29948b.getLabels().getEnabledLabel(), String.valueOf(g.d(this.f29949c)), null, composer, 0, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            f(LocalThemeScope localThemeScope, InterfaceC5864h0 interfaceC5864h0) {
                this.f29945a = localThemeScope;
                this.f29946b = interfaceC5864h0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f143329a;
            }

            public final void b(ki.j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1062873503, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:776)");
                }
                LocalThemeScope localThemeScope = this.f29945a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Qi.p9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.g.f.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                oi.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-1381924722, true, new a(this.f29945a, Assemble, this.f29946b), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.W7$g$g, reason: collision with other inner class name */
        static final class C0594g implements Function3<InterfaceC15150T, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.D1 f29950a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5914o f29951b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29952c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5864h0 f29953d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ double f29954e;

            C0594g(androidx.compose.ui.platform.D1 d12, InterfaceC5914o interfaceC5914o, LocalThemeScope localThemeScope, InterfaceC5864h0 interfaceC5864h0, double d10) {
                this.f29950a = d12;
                this.f29951b = interfaceC5914o;
                this.f29952c = localThemeScope;
                this.f29953d = interfaceC5864h0;
                this.f29954e = d10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(double d10, InterfaceC5864h0 interfaceC5864h0, androidx.compose.ui.focus.E it) {
                Intrinsics.j(it, "it");
                if (!it.b() || !it.a()) {
                    g.e(interfaceC5864h0, RangesKt.m(g.d(interfaceC5864h0), 0.0d, d10));
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(double d10, androidx.compose.ui.platform.D1 d12, InterfaceC5914o interfaceC5914o, InterfaceC5864h0 interfaceC5864h0, InterfaceC5834y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                g.e(interfaceC5864h0, RangesKt.m(g.d(interfaceC5864h0), 0.0d, d10));
                if (d12 != null) {
                    d12.b();
                }
                InterfaceC5914o.l(interfaceC5914o, false, 1, null);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(InterfaceC5864h0 interfaceC5864h0, String proposed) {
                Intrinsics.j(proposed, "proposed");
                g.e(interfaceC5864h0, Double.parseDouble(C2823i1.a(proposed, Double.valueOf(g.d(interfaceC5864h0)))));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(InterfaceC15150T interfaceC15150T, final double d10, final InterfaceC5864h0 interfaceC5864h0, Ai.y1 AdsInputField) {
                Intrinsics.j(AdsInputField, "$this$AdsInputField");
                AdsInputField.m0(interfaceC15150T.getIcons().getTrailingIcon(), new Function0() { // from class: Qi.u9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.g.C0594g.q(d10, interfaceC5864h0);
                    }
                });
                AdsInputField.N(interfaceC15150T.getIcons().getLeadingIcon(), new Function0() { // from class: Qi.v9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.g.C0594g.r(interfaceC5864h0);
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
                    ComposerKt.U(2111311390, i11, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:792)");
                }
                String strValueOf = String.valueOf(g.d(this.f29953d));
                q1.f.QuantityInput quantityInput = Assemble.getInputFields().getDefault();
                Modifier modifier = Assemble.getInputFields().getDefault().getModifier();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                final double d10 = this.f29954e;
                final InterfaceC5864h0 interfaceC5864h0 = this.f29953d;
                Object objB = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB == companion2.a()) {
                    objB = new Function1() { // from class: Qi.q9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.C0594g.k(d10, interfaceC5864h0, (androidx.compose.ui.focus.E) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierThen = modifier.then(C5903d.a(companion, (Function1) objB));
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null);
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f29950a) | composer.D(this.f29951b);
                final double d11 = this.f29954e;
                final androidx.compose.ui.platform.D1 d12 = this.f29950a;
                final InterfaceC5914o interfaceC5914o = this.f29951b;
                final InterfaceC5864h0 interfaceC5864h02 = this.f29953d;
                Object objB2 = composer.B();
                if (zV || objB2 == companion2.a()) {
                    objB2 = new Function1() { // from class: Qi.r9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.C0594g.l(d11, d12, interfaceC5914o, interfaceC5864h02, (InterfaceC5834y) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                q1.f.QuantityInput quantityInputX = quantityInput.x((65531 & 1) != 0 ? quantityInput.modifier : modifierThen, (65531 & 2) != 0 ? quantityInput.readOnly : false, (65531 & 4) != 0 ? quantityInput.state : null, (65531 & 8) != 0 ? quantityInput.textStyle : null, (65531 & 16) != 0 ? quantityInput.visualTransformation : null, (65531 & 32) != 0 ? quantityInput.keyboardOptions : keyboardOptions, (65531 & 64) != 0 ? quantityInput.keyboardActions : new C5835z((Function1) objB2, null, null, null, null, null, 62, null), (65531 & 128) != 0 ? quantityInput.singleLine : false, (65531 & 256) != 0 ? quantityInput.maxLines : 0, (65531 & 512) != 0 ? quantityInput.interactionSource : null, (65531 & 1024) != 0 ? quantityInput.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInput.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInput.signifier : null, (65531 & 8192) != 0 ? quantityInput.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInput.outerModifier : null, (65531 & 32768) != 0 ? quantityInput.shouldFillMaxWidth : false);
                LocalThemeScope localThemeScope = this.f29952c;
                composer.startReplaceGroup(5004770);
                final InterfaceC5864h0 interfaceC5864h03 = this.f29953d;
                Object objB3 = composer.B();
                if (objB3 == companion2.a()) {
                    objB3 = new Function1() { // from class: Qi.s9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.C0594g.o(interfaceC5864h03, (String) obj);
                        }
                    };
                    composer.t(objB3);
                }
                Function1 function1 = (Function1) objB3;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean z10 = (i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble));
                final double d13 = this.f29954e;
                final InterfaceC5864h0 interfaceC5864h04 = this.f29953d;
                Object objB4 = composer.B();
                if (z10 || objB4 == companion2.a()) {
                    objB4 = new Function1() { // from class: Qi.t9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.C0594g.p(Assemble, d13, interfaceC5864h04, (Ai.y1) obj);
                        }
                    };
                    composer.t(objB4);
                }
                composer.P();
                C2832m0.h(localThemeScope, strValueOf, quantityInputX, function1, null, "lb:", (Function1) objB4, composer, 199680, 8);
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
            public static final Unit q(double d10, InterfaceC5864h0 interfaceC5864h0) {
                if (g.d(interfaceC5864h0) < d10 && g.d(interfaceC5864h0) <= d10 - 0.25d) {
                    g.e(interfaceC5864h0, new BigDecimal(g.d(interfaceC5864h0) + 0.25d).setScale(2, RoundingMode.HALF_UP).doubleValue());
                } else if (g.d(interfaceC5864h0) < d10) {
                    g.e(interfaceC5864h0, d10);
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(InterfaceC5864h0 interfaceC5864h0) {
                if (g.d(interfaceC5864h0) > 0.0d && g.d(interfaceC5864h0) > 0.25d) {
                    g.e(interfaceC5864h0, new BigDecimal(g.d(interfaceC5864h0) - 0.25d).setScale(2, RoundingMode.HALF_UP).doubleValue());
                } else if (g.d(interfaceC5864h0) > 0.0d) {
                    g.e(interfaceC5864h0, 0.0d);
                }
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class h implements Function3<ki.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f29955a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5864h0 f29956b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f29957a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ki.j1 f29958b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5864h0 f29959c;

                a(LocalThemeScope localThemeScope, ki.j1 j1Var, InterfaceC5864h0 interfaceC5864h0) {
                    this.f29957a = localThemeScope;
                    this.f29958b = j1Var;
                    this.f29959c = interfaceC5864h0;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-804729009, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:845)");
                    }
                    si.j.h(this.f29957a, this.f29958b.getLabels().getEnabledLabel(), String.valueOf(g.d(this.f29959c)), null, composer, 0, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                    a(interfaceC14888I, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            h(LocalThemeScope localThemeScope, InterfaceC5864h0 interfaceC5864h0) {
                this.f29955a = localThemeScope;
                this.f29956b = interfaceC5864h0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f143329a;
            }

            public final void b(ki.j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-485677790, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:844)");
                }
                LocalThemeScope localThemeScope = this.f29955a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Qi.w9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.g.h.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                oi.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-804729009, true, new a(this.f29955a, Assemble, this.f29956b), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ki.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        g(LocalThemeScope localThemeScope, androidx.compose.ui.platform.D1 d12, InterfaceC5914o interfaceC5914o) {
            this.f29921a = localThemeScope;
            this.f29922b = d12;
            this.f29923c = interfaceC5914o;
        }

        public final void c(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1285308172, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous> (QuantityInput.kt:572)");
            }
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = androidx.compose.runtime.Y0.a(0.0d);
                composer.t(objB);
            }
            InterfaceC5864h0 interfaceC5864h0 = (InterfaceC5864h0) objB;
            composer.P();
            LocalThemeScope localThemeScope = this.f29921a;
            androidx.compose.ui.platform.D1 d12 = this.f29922b;
            InterfaceC5914o interfaceC5914o = this.f29923c;
            Modifier.Companion companion = Modifier.INSTANCE;
            C5800d c5800d = C5800d.f48779a;
            C5800d.m mVarH = c5800d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion3.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            float f10 = 1;
            Modifier modifierH = C13572f.h(companion, H1.h.p(f10), localThemeScope.getAdsColors().getAdsColorUIBorder01().getColor(), null, 4, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.e(), companion2.l(), composer, 6);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyB, companion3.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            Ki.Q.e(localThemeScope, C15194s0.f142448a, ComposableLambdaKt.c(-463685467, true, new a(d12, interfaceC5914o, localThemeScope, interfaceC5864h0, 99.75d), composer, 54), composer, 432);
            float f11 = 8;
            C14890K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(f11)), composer, 6);
            Ki.Q.e(localThemeScope, C15185o.f142170a, ComposableLambdaKt.c(-1556889431, true, new b(localThemeScope), composer, 54), composer, 432);
            composer.v();
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f11)), composer, 6);
            Modifier modifierH2 = C13572f.h(companion, H1.h.p(f10), localThemeScope.getAdsColors().getAdsColorUIBorder01().getColor(), null, 4, null);
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5800d.e(), companion2.l(), composer, 6);
            int iA3 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierH2);
            Function0<InterfaceC5953g> function0A3 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A3);
            } else {
                composer.s();
            }
            Composer composerA3 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA3, measurePolicyB2, companion3.e());
            androidx.compose.runtime.D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            androidx.compose.runtime.D1.c(composerA3, modifierE3, companion3.f());
            Ki.Q.e(localThemeScope, C15196t0.f142485a, ComposableLambdaKt.c(956919964, true, new c(d12, interfaceC5914o, localThemeScope, interfaceC5864h0, 99.75d), composer, 54), composer, 432);
            C14890K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(f11)), composer, 6);
            Ki.Q.e(localThemeScope, C15193s.f142447a, ComposableLambdaKt.c(-1640069216, true, new d(localThemeScope), composer, 54), composer, 432);
            composer.v();
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f11)), composer, 6);
            Modifier modifierH3 = C13572f.h(companion, H1.h.p(f10), localThemeScope.getAdsColors().getAdsColorUIBorder01().getColor(), null, 4, null);
            MeasurePolicy measurePolicyB3 = androidx.compose.foundation.layout.G.b(c5800d.e(), companion2.l(), composer, 6);
            int iA4 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR4 = composer.r();
            Modifier modifierE4 = androidx.compose.ui.b.e(composer, modifierH3);
            Function0<InterfaceC5953g> function0A4 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A4);
            } else {
                composer.s();
            }
            Composer composerA4 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA4, measurePolicyB3, companion3.e());
            androidx.compose.runtime.D1.c(composerA4, interfaceC5884sR4, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion3.b();
            if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                composerA4.t(Integer.valueOf(iA4));
                composerA4.n(Integer.valueOf(iA4), function2B4);
            }
            androidx.compose.runtime.D1.c(composerA4, modifierE4, companion3.f());
            Ki.Q.e(localThemeScope, ki.I0.f141925a, ComposableLambdaKt.c(1534115677, true, new e(d12, interfaceC5914o, localThemeScope, interfaceC5864h0, 99.75d), composer, 54), composer, 432);
            C14890K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(f11)), composer, 6);
            Ki.Q.e(localThemeScope, InterfaceC15205y.a.e.f142549a, ComposableLambdaKt.c(-1062873503, true, new f(localThemeScope, interfaceC5864h0), composer, 54), composer, 432);
            composer.v();
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f11)), composer, 6);
            Modifier modifierH4 = C13572f.h(companion, H1.h.p(f10), localThemeScope.getAdsColors().getAdsColorUIBorder01().getColor(), null, 4, null);
            MeasurePolicy measurePolicyB4 = androidx.compose.foundation.layout.G.b(c5800d.e(), companion2.l(), composer, 6);
            int iA5 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR5 = composer.r();
            Modifier modifierE5 = androidx.compose.ui.b.e(composer, modifierH4);
            Function0<InterfaceC5953g> function0A5 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A5);
            } else {
                composer.s();
            }
            Composer composerA5 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA5, measurePolicyB4, companion3.e());
            androidx.compose.runtime.D1.c(composerA5, interfaceC5884sR5, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B5 = companion3.b();
            if (composerA5.getInserting() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                composerA5.t(Integer.valueOf(iA5));
                composerA5.n(Integer.valueOf(iA5), function2B5);
            }
            androidx.compose.runtime.D1.c(composerA5, modifierE5, companion3.f());
            Ki.Q.e(localThemeScope, ki.M0.f141945a, ComposableLambdaKt.c(2111311390, true, new C0594g(d12, interfaceC5914o, localThemeScope, interfaceC5864h0, 99.75d), composer, 54), composer, 432);
            C14890K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(f11)), composer, 6);
            Ki.Q.e(localThemeScope, C15134C.f141860a, ComposableLambdaKt.c(-485677790, true, new h(localThemeScope, interfaceC5864h0), composer, 54), composer, 432);
            composer.v();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double d(InterfaceC5864h0 interfaceC5864h0) {
            return interfaceC5864h0.d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(InterfaceC5864h0 interfaceC5864h0, double d10) {
            interfaceC5864h0.s(d10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class h implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f29960a;

        h(LocalThemeScope localThemeScope) {
            this.f29960a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1041771309, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous> (QuantityInput.kt:857)");
            }
            LocalThemeScope localThemeScope = this.f29960a;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
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
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            kotlin.N1.b("Max Limit is 6", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            C14890K.a(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, H1.h.p(8), 7, null), composer, 6);
            O7.b(localThemeScope, composer, 0);
            composer.v();
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

    public W7(l.t state) {
        Intrinsics.j(state, "state");
        this.state = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(W7 w72, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        w72.f(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    @Override // Oi.c
    public void f(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1242138221);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(this) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1242138221, i11, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content (QuantityInput.kt:72)");
            }
            androidx.compose.ui.platform.D1 d12 = (androidx.compose.ui.platform.D1) composerStartRestartGroup.o(C6034t0.q());
            InterfaceC5914o interfaceC5914o = (InterfaceC5914o) composerStartRestartGroup.o(C6034t0.h());
            Modifier modifierG = d0.T.g(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), d0.T.c(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierG);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
            C14903g c14903g = C14903g.f139698a;
            int i12 = (i11 & 14) | 199680;
            Si.b.b(localThemeScope, null, c("Large Rectangle"), "1.0", null, ComposableLambdaKt.c(1990715568, true, new a(localThemeScope, d12, interfaceC5914o), composerStartRestartGroup, 54), composerStartRestartGroup, i12, 9);
            Si.b.b(localThemeScope, null, c("Small Rectangle"), "1.0", null, ComposableLambdaKt.c(1791974809, true, new b(localThemeScope, d12, interfaceC5914o), composerStartRestartGroup, 54), composerStartRestartGroup, i12, 9);
            Si.b.b(localThemeScope, null, c("Large Circle"), "1.0", null, ComposableLambdaKt.c(2035511672, true, new c(localThemeScope, d12, interfaceC5914o), composerStartRestartGroup, 54), composerStartRestartGroup, i12, 9);
            Si.b.b(localThemeScope, null, c("Small Circle"), "1.0", null, ComposableLambdaKt.c(-2015918761, true, new d(localThemeScope, d12, interfaceC5914o), composerStartRestartGroup, 54), composerStartRestartGroup, i12, 9);
            Si.b.b(localThemeScope, null, c("lb Variant"), BuildConfig.VERSION_NAME, null, ComposableLambdaKt.c(-1772381898, true, new e(localThemeScope, d12, interfaceC5914o), composerStartRestartGroup, 54), composerStartRestartGroup, i12, 9);
            Si.b.b(localThemeScope, null, c("Full Width PDP(New and deprecated versions)"), "1.0", null, ComposableLambdaKt.c(-1528845035, true, new f(localThemeScope, d12, interfaceC5914o), composerStartRestartGroup, 54), composerStartRestartGroup, i12, 9);
            Si.b.b(localThemeScope, null, c("Height Comparisons"), "1.2", null, ComposableLambdaKt.c(-1285308172, true, new g(localThemeScope, d12, interfaceC5914o), composerStartRestartGroup, 54), composerStartRestartGroup, i12, 9);
            Si.b.b(localThemeScope, null, c("Qty Input With Inline Notification"), BuildConfig.VERSION_NAME, null, ComposableLambdaKt.c(-1041771309, true, new h(localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, i12, 9);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.P7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return W7.h(this.f29641a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Oi.c
    public String getName() {
        return "Quantity Input";
    }

    @Override // Oi.c
    /* renamed from: i, reason: from getter */
    public l.t getState() {
        return this.state;
    }
}
