package Pi;

import Ji.C;
import Ji.LocalThemeScope;
import Ni.l;
import P0.e;
import Pi.W7;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.text.C5693z;
import androidx.compose.foundation.text.InterfaceC5692y;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.C5702c1;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5722h0;
import androidx.compose.runtime.InterfaceC5726j0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5761d;
import androidx.compose.ui.focus.InterfaceC5772o;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.recyclerview.widget.RecyclerView;
import com.flipp.injectablehelper.BuildConfig;
import d0.C13439f;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import java.math.BigDecimal;
import java.math.RoundingMode;
import ji.C14899B;
import ji.C14900C;
import ji.C14951o;
import ji.C14953p;
import ji.C14959s;
import ji.C14960s0;
import ji.C14961t;
import ji.C14962t0;
import ji.InterfaceC14916T;
import ji.InterfaceC14971y;
import ji.q1;
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
import pi.C16307b;
import qv.C16648k;
import qv.InterfaceC16622O;
import zi.C18495i1;
import zi.C18504m0;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002"}, d2 = {"LPi/W7;", "LNi/c;", "LNi/l$t;", "state", "<init>", "(LNi/l$t;)V", "LJi/M;", "", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)V", "LNi/l$t;", "i", "()LNi/l$t;", "", "getName", "()Ljava/lang/String;", "name", "", "value", "", "doubleValue", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class W7 implements Ni.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.t state;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27094a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.D1 f27095b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f27096c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Pi.W7$a$a, reason: collision with other inner class name */
        static final class C0523a implements Function3<InterfaceC14916T, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27097a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.D1 f27098b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5772o f27099c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5726j0 f27100d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f27101e;

            C0523a(LocalThemeScope localThemeScope, androidx.compose.ui.platform.D1 d12, InterfaceC5772o interfaceC5772o, InterfaceC5726j0 interfaceC5726j0, int i10) {
                this.f27097a = localThemeScope;
                this.f27098b = d12;
                this.f27099c = interfaceC5772o;
                this.f27100d = interfaceC5726j0;
                this.f27101e = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(int i10, InterfaceC5726j0 interfaceC5726j0, androidx.compose.ui.focus.E it) {
                Intrinsics.j(it, "it");
                if (!it.b() || !it.a()) {
                    a.e(interfaceC5726j0, RangesKt.o(a.d(interfaceC5726j0), 0, i10));
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(int i10, androidx.compose.ui.platform.D1 d12, InterfaceC5772o interfaceC5772o, InterfaceC5726j0 interfaceC5726j0, InterfaceC5692y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                a.e(interfaceC5726j0, RangesKt.o(a.d(interfaceC5726j0), 0, i10));
                if (d12 != null) {
                    d12.b();
                }
                InterfaceC5772o.l(interfaceC5772o, false, 1, null);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(InterfaceC5726j0 interfaceC5726j0, String proposed) {
                Intrinsics.j(proposed, "proposed");
                a.e(interfaceC5726j0, Integer.parseInt(C18495i1.a(proposed, Integer.valueOf(a.d(interfaceC5726j0)))));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(InterfaceC14916T interfaceC14916T, final int i10, final InterfaceC5726j0 interfaceC5726j0, zi.y1 AdsInputField) {
                Intrinsics.j(AdsInputField, "$this$AdsInputField");
                AdsInputField.d0(interfaceC14916T.getIcons().getTrailingIcon(), new Function0() { // from class: Pi.U7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.a.C0523a.q(i10, interfaceC5726j0);
                    }
                });
                AdsInputField.T(interfaceC14916T.getIcons().getLeadingIcon(), new Function0() { // from class: Pi.V7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.a.C0523a.r(interfaceC5726j0);
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
                    ComposerKt.U(-1899769987, i11, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:94)");
                }
                LocalThemeScope localThemeScope = this.f27097a;
                String strValueOf = String.valueOf(a.d(this.f27100d));
                q1.f.QuantityInput quantityInput = Assemble.getInputFields().getDefault();
                Modifier modifier = Assemble.getInputFields().getDefault().getModifier();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                final int i12 = this.f27101e;
                final InterfaceC5726j0 interfaceC5726j0 = this.f27100d;
                Object objB = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB == companion2.a()) {
                    objB = new Function1() { // from class: Pi.Q7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.a.C0523a.k(i12, interfaceC5726j0, (androidx.compose.ui.focus.E) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierThen = modifier.then(C5761d.a(companion, (Function1) objB));
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null);
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f27098b) | composer.D(this.f27099c);
                final int i13 = this.f27101e;
                final androidx.compose.ui.platform.D1 d12 = this.f27098b;
                final InterfaceC5772o interfaceC5772o = this.f27099c;
                final InterfaceC5726j0 interfaceC5726j02 = this.f27100d;
                Object objB2 = composer.B();
                if (zV || objB2 == companion2.a()) {
                    objB2 = new Function1() { // from class: Pi.R7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.a.C0523a.l(i13, d12, interfaceC5772o, interfaceC5726j02, (InterfaceC5692y) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                q1.f.QuantityInput quantityInputX = quantityInput.x((65531 & 1) != 0 ? quantityInput.modifier : modifierThen, (65531 & 2) != 0 ? quantityInput.readOnly : false, (65531 & 4) != 0 ? quantityInput.state : null, (65531 & 8) != 0 ? quantityInput.textStyle : null, (65531 & 16) != 0 ? quantityInput.visualTransformation : null, (65531 & 32) != 0 ? quantityInput.keyboardOptions : keyboardOptions, (65531 & 64) != 0 ? quantityInput.keyboardActions : new C5693z((Function1) objB2, null, null, null, null, null, 62, null), (65531 & 128) != 0 ? quantityInput.singleLine : false, (65531 & 256) != 0 ? quantityInput.maxLines : 0, (65531 & 512) != 0 ? quantityInput.interactionSource : null, (65531 & 1024) != 0 ? quantityInput.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInput.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInput.signifier : null, (65531 & 8192) != 0 ? quantityInput.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInput.outerModifier : null, (65531 & 32768) != 0 ? quantityInput.shouldFillMaxWidth : false);
                composer.startReplaceGroup(5004770);
                final InterfaceC5726j0 interfaceC5726j03 = this.f27100d;
                Object objB3 = composer.B();
                if (objB3 == companion2.a()) {
                    objB3 = new Function1() { // from class: Pi.S7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.a.C0523a.o(interfaceC5726j03, (String) obj);
                        }
                    };
                    composer.t(objB3);
                }
                Function1 function1 = (Function1) objB3;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean z10 = (i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble));
                final int i14 = this.f27101e;
                final InterfaceC5726j0 interfaceC5726j04 = this.f27100d;
                Object objB4 = composer.B();
                if (z10 || objB4 == companion2.a()) {
                    objB4 = new Function1() { // from class: Pi.T7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.a.C0523a.p(Assemble, i14, interfaceC5726j04, (zi.y1) obj);
                        }
                    };
                    composer.t(objB4);
                }
                composer.P();
                C18504m0.h(localThemeScope, strValueOf, quantityInputX, function1, null, null, (Function1) objB4, composer, 3072, 24);
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
            public static final Unit q(int i10, InterfaceC5726j0 interfaceC5726j0) {
                if (a.d(interfaceC5726j0) < i10) {
                    a.e(interfaceC5726j0, a.d(interfaceC5726j0) + 1);
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(InterfaceC5726j0 interfaceC5726j0) {
                if (a.d(interfaceC5726j0) > 0) {
                    a.e(interfaceC5726j0, a.d(interfaceC5726j0) - 1);
                }
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function3<ji.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27102a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Pi.W7$a$b$a, reason: collision with other inner class name */
            static final class C0524a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27103a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ji.j1 f27104b;

                C0524a(LocalThemeScope localThemeScope, ji.j1 j1Var) {
                    this.f27103a = localThemeScope;
                    this.f27104b = j1Var;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(2080517870, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:130)");
                    }
                    ri.j.h(this.f27103a, this.f27104b.getLabels().getEnabledLabel(), "Add To Cart", null, composer, 384, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            b(LocalThemeScope localThemeScope) {
                this.f27102a = localThemeScope;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f142422a;
            }

            public final void b(ji.j1 Assemble, Composer composer, int i10) {
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
                LocalThemeScope localThemeScope = this.f27102a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Pi.X7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.a.b.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ni.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(2080517870, true, new C0524a(this.f27102a, Assemble), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c implements Function3<ji.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27105a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Pi.W7$a$c$a, reason: collision with other inner class name */
            static final class C0525a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27106a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ji.j1 f27107b;

                C0525a(LocalThemeScope localThemeScope, ji.j1 j1Var) {
                    this.f27106a = localThemeScope;
                    this.f27107b = j1Var;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(364919279, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:138)");
                    }
                    ri.j.h(this.f27106a, this.f27107b.getLabels().getEnabledLabel(), "Out of Stock", null, composer, 384, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            c(LocalThemeScope localThemeScope) {
                this.f27105a = localThemeScope;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f142422a;
            }

            public final void b(ji.j1 Assemble, Composer composer, int i10) {
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
                LocalThemeScope localThemeScope = this.f27105a;
                q1.d.StandardButton disabledButton = Assemble.getButtons().getDisabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Pi.Y7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.a.c.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ni.E0.b(localThemeScope, disabledButton, (Function0) objB, ComposableLambdaKt.c(364919279, true, new C0525a(this.f27105a, Assemble), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class d implements Function3<ji.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27108a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5726j0 f27109b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Pi.W7$a$d$a, reason: collision with other inner class name */
            static final class C0526a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27110a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ji.j1 f27111b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5726j0 f27112c;

                C0526a(LocalThemeScope localThemeScope, ji.j1 j1Var, InterfaceC5726j0 interfaceC5726j0) {
                    this.f27110a = localThemeScope;
                    this.f27111b = j1Var;
                    this.f27112c = interfaceC5726j0;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1350679312, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:146)");
                    }
                    ri.j.h(this.f27110a, this.f27111b.getLabels().getEnabledLabel(), String.valueOf(a.d(this.f27112c)), null, composer, 0, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            d(LocalThemeScope localThemeScope, InterfaceC5726j0 interfaceC5726j0) {
                this.f27108a = localThemeScope;
                this.f27109b = interfaceC5726j0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f142422a;
            }

            public final void b(ji.j1 Assemble, Composer composer, int i10) {
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
                LocalThemeScope localThemeScope = this.f27108a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Pi.Z7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.a.d.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ni.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-1350679312, true, new C0526a(this.f27108a, Assemble, this.f27109b), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        a(LocalThemeScope localThemeScope, androidx.compose.ui.platform.D1 d12, InterfaceC5772o interfaceC5772o) {
            this.f27094a = localThemeScope;
            this.f27095b = d12;
            this.f27096c = interfaceC5772o;
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
                objB = C5702c1.a(0);
                composer.t(objB);
            }
            InterfaceC5726j0 interfaceC5726j0 = (InterfaceC5726j0) objB;
            composer.P();
            LocalThemeScope localThemeScope = this.f27094a;
            androidx.compose.ui.platform.D1 d12 = this.f27095b;
            InterfaceC5772o interfaceC5772o = this.f27096c;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            Ji.Q.e(localThemeScope, ji.I0.f139670a, ComposableLambdaKt.c(-1899769987, true, new C0523a(localThemeScope, d12, interfaceC5772o, interfaceC5726j0, 99), composer, 54), composer, 432);
            float f10 = 8;
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            InterfaceC14971y.a.d dVar = InterfaceC14971y.a.d.f140292a;
            Ji.Q.e(localThemeScope, dVar, ComposableLambdaKt.c(-281776255, true, new b(localThemeScope), composer, 54), composer, 432);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            Ji.Q.e(localThemeScope, dVar, ComposableLambdaKt.c(-1997374846, true, new c(localThemeScope), composer, 54), composer, 432);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            Ji.Q.e(localThemeScope, InterfaceC14971y.a.e.f140294a, ComposableLambdaKt.c(581993859, true, new d(localThemeScope, interfaceC5726j0), composer, 54), composer, 432);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int d(InterfaceC5726j0 interfaceC5726j0) {
            return interfaceC5726j0.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(InterfaceC5726j0 interfaceC5726j0, int i10) {
            interfaceC5726j0.j(i10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27113a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.D1 f27114b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f27115c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC14916T, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27116a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.D1 f27117b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5772o f27118c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5726j0 f27119d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f27120e;

            a(LocalThemeScope localThemeScope, androidx.compose.ui.platform.D1 d12, InterfaceC5772o interfaceC5772o, InterfaceC5726j0 interfaceC5726j0, int i10) {
                this.f27116a = localThemeScope;
                this.f27117b = d12;
                this.f27118c = interfaceC5772o;
                this.f27119d = interfaceC5726j0;
                this.f27120e = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(int i10, InterfaceC5726j0 interfaceC5726j0, androidx.compose.ui.focus.E it) {
                Intrinsics.j(it, "it");
                if (!it.b() || !it.a()) {
                    b.e(interfaceC5726j0, RangesKt.o(b.d(interfaceC5726j0), 0, i10));
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(int i10, androidx.compose.ui.platform.D1 d12, InterfaceC5772o interfaceC5772o, InterfaceC5726j0 interfaceC5726j0, InterfaceC5692y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                b.e(interfaceC5726j0, RangesKt.o(b.d(interfaceC5726j0), 0, i10));
                if (d12 != null) {
                    d12.b();
                }
                InterfaceC5772o.l(interfaceC5772o, false, 1, null);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(InterfaceC5726j0 interfaceC5726j0, String proposed) {
                Intrinsics.j(proposed, "proposed");
                b.e(interfaceC5726j0, Integer.parseInt(C18495i1.a(proposed, Integer.valueOf(b.d(interfaceC5726j0)))));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(InterfaceC14916T interfaceC14916T, final int i10, final InterfaceC5726j0 interfaceC5726j0, zi.y1 AdsInputField) {
                Intrinsics.j(AdsInputField, "$this$AdsInputField");
                AdsInputField.d0(interfaceC14916T.getIcons().getTrailingIcon(), new Function0() { // from class: Pi.e8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.b.a.q(i10, interfaceC5726j0);
                    }
                });
                AdsInputField.T(interfaceC14916T.getIcons().getLeadingIcon(), new Function0() { // from class: Pi.f8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.b.a.r(interfaceC5726j0);
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
                    ComposerKt.U(-343096026, i11, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:162)");
                }
                LocalThemeScope localThemeScope = this.f27116a;
                String strValueOf = String.valueOf(b.d(this.f27119d));
                q1.f.QuantityInput quantityInput = Assemble.getInputFields().getDefault();
                Modifier modifier = Assemble.getInputFields().getDefault().getModifier();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                final int i12 = this.f27120e;
                final InterfaceC5726j0 interfaceC5726j0 = this.f27119d;
                Object objB = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB == companion2.a()) {
                    objB = new Function1() { // from class: Pi.a8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.b.a.k(i12, interfaceC5726j0, (androidx.compose.ui.focus.E) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierThen = modifier.then(C5761d.a(companion, (Function1) objB));
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null);
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f27117b) | composer.D(this.f27118c);
                final int i13 = this.f27120e;
                final androidx.compose.ui.platform.D1 d12 = this.f27117b;
                final InterfaceC5772o interfaceC5772o = this.f27118c;
                final InterfaceC5726j0 interfaceC5726j02 = this.f27119d;
                Object objB2 = composer.B();
                if (zV || objB2 == companion2.a()) {
                    objB2 = new Function1() { // from class: Pi.b8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.b.a.l(i13, d12, interfaceC5772o, interfaceC5726j02, (InterfaceC5692y) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                q1.f.QuantityInput quantityInputX = quantityInput.x((65531 & 1) != 0 ? quantityInput.modifier : modifierThen, (65531 & 2) != 0 ? quantityInput.readOnly : false, (65531 & 4) != 0 ? quantityInput.state : null, (65531 & 8) != 0 ? quantityInput.textStyle : null, (65531 & 16) != 0 ? quantityInput.visualTransformation : null, (65531 & 32) != 0 ? quantityInput.keyboardOptions : keyboardOptions, (65531 & 64) != 0 ? quantityInput.keyboardActions : new C5693z((Function1) objB2, null, null, null, null, null, 62, null), (65531 & 128) != 0 ? quantityInput.singleLine : false, (65531 & 256) != 0 ? quantityInput.maxLines : 0, (65531 & 512) != 0 ? quantityInput.interactionSource : null, (65531 & 1024) != 0 ? quantityInput.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInput.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInput.signifier : null, (65531 & 8192) != 0 ? quantityInput.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInput.outerModifier : null, (65531 & 32768) != 0 ? quantityInput.shouldFillMaxWidth : false);
                composer.startReplaceGroup(5004770);
                final InterfaceC5726j0 interfaceC5726j03 = this.f27119d;
                Object objB3 = composer.B();
                if (objB3 == companion2.a()) {
                    objB3 = new Function1() { // from class: Pi.c8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.b.a.o(interfaceC5726j03, (String) obj);
                        }
                    };
                    composer.t(objB3);
                }
                Function1 function1 = (Function1) objB3;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean z10 = (i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble));
                final int i14 = this.f27120e;
                final InterfaceC5726j0 interfaceC5726j04 = this.f27119d;
                Object objB4 = composer.B();
                if (z10 || objB4 == companion2.a()) {
                    objB4 = new Function1() { // from class: Pi.d8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.b.a.p(Assemble, i14, interfaceC5726j04, (zi.y1) obj);
                        }
                    };
                    composer.t(objB4);
                }
                composer.P();
                C18504m0.h(localThemeScope, strValueOf, quantityInputX, function1, null, null, (Function1) objB4, composer, 3072, 24);
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
            public static final Unit q(int i10, InterfaceC5726j0 interfaceC5726j0) {
                if (b.d(interfaceC5726j0) < i10) {
                    b.e(interfaceC5726j0, b.d(interfaceC5726j0) + 1);
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(InterfaceC5726j0 interfaceC5726j0) {
                if (b.d(interfaceC5726j0) > 0) {
                    b.e(interfaceC5726j0, b.d(interfaceC5726j0) - 1);
                }
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Pi.W7$b$b, reason: collision with other inner class name */
        static final class C0527b implements Function3<ji.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27121a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Pi.W7$b$b$a */
            static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27122a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ji.j1 f27123b;

                a(LocalThemeScope localThemeScope, ji.j1 j1Var) {
                    this.f27122a = localThemeScope;
                    this.f27123b = j1Var;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-2102326185, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:203)");
                    }
                    ri.j.h(this.f27122a, this.f27123b.getLabels().getEnabledLabel(), "Add To Cart", null, composer, 384, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            C0527b(LocalThemeScope localThemeScope) {
                this.f27121a = localThemeScope;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f142422a;
            }

            public final void b(ji.j1 Assemble, Composer composer, int i10) {
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
                LocalThemeScope localThemeScope = this.f27121a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Pi.g8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.b.C0527b.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ni.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-2102326185, true, new a(this.f27121a, Assemble), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c implements Function3<ji.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27124a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27125a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ji.j1 f27126b;

                a(LocalThemeScope localThemeScope, ji.j1 j1Var) {
                    this.f27125a = localThemeScope;
                    this.f27126b = j1Var;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1525130472, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:211)");
                    }
                    ri.j.h(this.f27125a, this.f27126b.getLabels().getEnabledLabel(), "Out of Stock", null, composer, 384, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            c(LocalThemeScope localThemeScope) {
                this.f27124a = localThemeScope;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f142422a;
            }

            public final void b(ji.j1 Assemble, Composer composer, int i10) {
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
                LocalThemeScope localThemeScope = this.f27124a;
                q1.d.StandardButton disabledButton = Assemble.getButtons().getDisabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Pi.h8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.b.c.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ni.E0.b(localThemeScope, disabledButton, (Function0) objB, ComposableLambdaKt.c(-1525130472, true, new a(this.f27124a, Assemble), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class d implements Function3<ji.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27127a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5726j0 f27128b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27129a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ji.j1 f27130b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5726j0 f27131c;

                a(LocalThemeScope localThemeScope, ji.j1 j1Var, InterfaceC5726j0 interfaceC5726j0) {
                    this.f27129a = localThemeScope;
                    this.f27130b = j1Var;
                    this.f27131c = interfaceC5726j0;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-947934759, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:219)");
                    }
                    ri.j.h(this.f27129a, this.f27130b.getLabels().getEnabledLabel(), String.valueOf(b.d(this.f27131c)), null, composer, 0, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            d(LocalThemeScope localThemeScope, InterfaceC5726j0 interfaceC5726j0) {
                this.f27127a = localThemeScope;
                this.f27128b = interfaceC5726j0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f142422a;
            }

            public final void b(ji.j1 Assemble, Composer composer, int i10) {
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
                LocalThemeScope localThemeScope = this.f27127a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Pi.i8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.b.d.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ni.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-947934759, true, new a(this.f27127a, Assemble, this.f27128b), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        b(LocalThemeScope localThemeScope, androidx.compose.ui.platform.D1 d12, InterfaceC5772o interfaceC5772o) {
            this.f27113a = localThemeScope;
            this.f27114b = d12;
            this.f27115c = interfaceC5772o;
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
                objB = C5702c1.a(0);
                composer.t(objB);
            }
            InterfaceC5726j0 interfaceC5726j0 = (InterfaceC5726j0) objB;
            composer.P();
            LocalThemeScope localThemeScope = this.f27113a;
            androidx.compose.ui.platform.D1 d12 = this.f27114b;
            InterfaceC5772o interfaceC5772o = this.f27115c;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            Ji.Q.e(localThemeScope, ji.M0.f139690a, ComposableLambdaKt.c(-343096026, true, new a(localThemeScope, d12, interfaceC5772o, interfaceC5726j0, 99), composer, 54), composer, 432);
            float f10 = 8;
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            C14899B c14899b = C14899B.f139602a;
            Ji.Q.e(localThemeScope, c14899b, ComposableLambdaKt.c(-229280726, true, new C0527b(localThemeScope), composer, 54), composer, 432);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            Ji.Q.e(localThemeScope, c14899b, ComposableLambdaKt.c(347914987, true, new c(localThemeScope), composer, 54), composer, 432);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            Ji.Q.e(localThemeScope, C14900C.f139605a, ComposableLambdaKt.c(925110700, true, new d(localThemeScope, interfaceC5726j0), composer, 54), composer, 432);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int d(InterfaceC5726j0 interfaceC5726j0) {
            return interfaceC5726j0.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(InterfaceC5726j0 interfaceC5726j0, int i10) {
            interfaceC5726j0.j(i10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27132a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.D1 f27133b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f27134c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC14916T, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27135a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.D1 f27136b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5772o f27137c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5726j0 f27138d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f27139e;

            a(LocalThemeScope localThemeScope, androidx.compose.ui.platform.D1 d12, InterfaceC5772o interfaceC5772o, InterfaceC5726j0 interfaceC5726j0, int i10) {
                this.f27135a = localThemeScope;
                this.f27136b = d12;
                this.f27137c = interfaceC5772o;
                this.f27138d = interfaceC5726j0;
                this.f27139e = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(int i10, InterfaceC5726j0 interfaceC5726j0, androidx.compose.ui.focus.E it) {
                Intrinsics.j(it, "it");
                if (!it.b() || !it.a()) {
                    c.e(interfaceC5726j0, RangesKt.o(c.d(interfaceC5726j0), 0, i10));
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(int i10, androidx.compose.ui.platform.D1 d12, InterfaceC5772o interfaceC5772o, InterfaceC5726j0 interfaceC5726j0, InterfaceC5692y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                c.e(interfaceC5726j0, RangesKt.o(c.d(interfaceC5726j0), 0, i10));
                if (d12 != null) {
                    d12.b();
                }
                InterfaceC5772o.l(interfaceC5772o, false, 1, null);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(InterfaceC5726j0 interfaceC5726j0, String proposed) {
                Intrinsics.j(proposed, "proposed");
                c.e(interfaceC5726j0, Integer.parseInt(C18495i1.a(proposed, Integer.valueOf(c.d(interfaceC5726j0)))));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(InterfaceC14916T interfaceC14916T, final int i10, final InterfaceC5726j0 interfaceC5726j0, zi.y1 AdsInputField) {
                Intrinsics.j(AdsInputField, "$this$AdsInputField");
                AdsInputField.d0(interfaceC14916T.getIcons().getTrailingIcon(), new Function0() { // from class: Pi.n8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.c.a.q(i10, interfaceC5726j0);
                    }
                });
                AdsInputField.T(interfaceC14916T.getIcons().getLeadingIcon(), new Function0() { // from class: Pi.o8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.c.a.r(interfaceC5726j0);
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
                    ComposerKt.U(-99559163, i11, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:235)");
                }
                LocalThemeScope localThemeScope = this.f27135a;
                String strValueOf = String.valueOf(c.d(this.f27138d));
                q1.f.QuantityInput quantityInput = Assemble.getInputFields().getDefault();
                Modifier modifier = Assemble.getInputFields().getDefault().getModifier();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                final int i12 = this.f27139e;
                final InterfaceC5726j0 interfaceC5726j0 = this.f27138d;
                Object objB = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB == companion2.a()) {
                    objB = new Function1() { // from class: Pi.j8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.c.a.k(i12, interfaceC5726j0, (androidx.compose.ui.focus.E) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierThen = modifier.then(C5761d.a(companion, (Function1) objB));
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null);
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f27136b) | composer.D(this.f27137c);
                final int i13 = this.f27139e;
                final androidx.compose.ui.platform.D1 d12 = this.f27136b;
                final InterfaceC5772o interfaceC5772o = this.f27137c;
                final InterfaceC5726j0 interfaceC5726j02 = this.f27138d;
                Object objB2 = composer.B();
                if (zV || objB2 == companion2.a()) {
                    objB2 = new Function1() { // from class: Pi.k8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.c.a.l(i13, d12, interfaceC5772o, interfaceC5726j02, (InterfaceC5692y) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                q1.f.QuantityInput quantityInputX = quantityInput.x((65531 & 1) != 0 ? quantityInput.modifier : modifierThen, (65531 & 2) != 0 ? quantityInput.readOnly : false, (65531 & 4) != 0 ? quantityInput.state : null, (65531 & 8) != 0 ? quantityInput.textStyle : null, (65531 & 16) != 0 ? quantityInput.visualTransformation : null, (65531 & 32) != 0 ? quantityInput.keyboardOptions : keyboardOptions, (65531 & 64) != 0 ? quantityInput.keyboardActions : new C5693z((Function1) objB2, null, null, null, null, null, 62, null), (65531 & 128) != 0 ? quantityInput.singleLine : false, (65531 & 256) != 0 ? quantityInput.maxLines : 0, (65531 & 512) != 0 ? quantityInput.interactionSource : null, (65531 & 1024) != 0 ? quantityInput.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInput.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInput.signifier : null, (65531 & 8192) != 0 ? quantityInput.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInput.outerModifier : null, (65531 & 32768) != 0 ? quantityInput.shouldFillMaxWidth : false);
                composer.startReplaceGroup(5004770);
                final InterfaceC5726j0 interfaceC5726j03 = this.f27138d;
                Object objB3 = composer.B();
                if (objB3 == companion2.a()) {
                    objB3 = new Function1() { // from class: Pi.l8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.c.a.o(interfaceC5726j03, (String) obj);
                        }
                    };
                    composer.t(objB3);
                }
                Function1 function1 = (Function1) objB3;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean z10 = (i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble));
                final int i14 = this.f27139e;
                final InterfaceC5726j0 interfaceC5726j04 = this.f27138d;
                Object objB4 = composer.B();
                if (z10 || objB4 == companion2.a()) {
                    objB4 = new Function1() { // from class: Pi.m8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.c.a.p(Assemble, i14, interfaceC5726j04, (zi.y1) obj);
                        }
                    };
                    composer.t(objB4);
                }
                composer.P();
                C18504m0.h(localThemeScope, strValueOf, quantityInputX, function1, null, null, (Function1) objB4, composer, 3072, 24);
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
            public static final Unit q(int i10, InterfaceC5726j0 interfaceC5726j0) {
                if (c.d(interfaceC5726j0) < i10) {
                    c.e(interfaceC5726j0, c.d(interfaceC5726j0) + 1);
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(InterfaceC5726j0 interfaceC5726j0) {
                if (c.d(interfaceC5726j0) > 0) {
                    c.e(interfaceC5726j0, c.d(interfaceC5726j0) - 1);
                }
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function3<ji.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27140a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27141a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ji.j1 f27142b;

                a(LocalThemeScope localThemeScope, ji.j1 j1Var) {
                    this.f27141a = localThemeScope;
                    this.f27142b = j1Var;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1858789322, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:276)");
                    }
                    C16307b.b(this.f27141a, this.f27142b.getIcons().getEnabledIcon(), C.a.C0245a.f15333e, null, composer, 384, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            b(LocalThemeScope localThemeScope) {
                this.f27140a = localThemeScope;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f142422a;
            }

            public final void b(ji.j1 Assemble, Composer composer, int i10) {
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
                LocalThemeScope localThemeScope = this.f27140a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Pi.p8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.c.b.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ni.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-1858789322, true, new a(this.f27140a, Assemble), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Pi.W7$c$c, reason: collision with other inner class name */
        static final class C0528c implements Function3<ji.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27143a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5726j0 f27144b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Pi.W7$c$c$a */
            static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27145a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ji.j1 f27146b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5726j0 f27147c;

                a(LocalThemeScope localThemeScope, ji.j1 j1Var, InterfaceC5726j0 interfaceC5726j0) {
                    this.f27145a = localThemeScope;
                    this.f27146b = j1Var;
                    this.f27147c = interfaceC5726j0;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1281593609, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:287)");
                    }
                    ri.j.h(this.f27145a, this.f27146b.getLabels().getEnabledLabel(), String.valueOf(c.d(this.f27147c)), null, composer, 0, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            C0528c(LocalThemeScope localThemeScope, InterfaceC5726j0 interfaceC5726j0) {
                this.f27143a = localThemeScope;
                this.f27144b = interfaceC5726j0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f142422a;
            }

            public final void b(ji.j1 Assemble, Composer composer, int i10) {
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
                LocalThemeScope localThemeScope = this.f27143a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Pi.q8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.c.C0528c.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ni.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-1281593609, true, new a(this.f27143a, Assemble, this.f27144b), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        c(LocalThemeScope localThemeScope, androidx.compose.ui.platform.D1 d12, InterfaceC5772o interfaceC5772o) {
            this.f27132a = localThemeScope;
            this.f27133b = d12;
            this.f27134c = interfaceC5772o;
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
                objB = C5702c1.a(0);
                composer.t(objB);
            }
            InterfaceC5726j0 interfaceC5726j0 = (InterfaceC5726j0) objB;
            composer.P();
            LocalThemeScope localThemeScope = this.f27132a;
            androidx.compose.ui.platform.D1 d12 = this.f27133b;
            InterfaceC5772o interfaceC5772o = this.f27134c;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            Ji.Q.e(localThemeScope, C14960s0.f140193a, ComposableLambdaKt.c(-99559163, true, new a(localThemeScope, d12, interfaceC5772o, interfaceC5726j0, 99), composer, 54), composer, 432);
            float f10 = 8;
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            Ji.Q.e(localThemeScope, C14951o.f139915a, ComposableLambdaKt.c(14256137, true, new b(localThemeScope), composer, 54), composer, 432);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            Ji.Q.e(localThemeScope, C14953p.f139919a, ComposableLambdaKt.c(591451850, true, new C0528c(localThemeScope, interfaceC5726j0), composer, 54), composer, 432);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int d(InterfaceC5726j0 interfaceC5726j0) {
            return interfaceC5726j0.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(InterfaceC5726j0 interfaceC5726j0, int i10) {
            interfaceC5726j0.j(i10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27148a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.D1 f27149b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f27150c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC14916T, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27151a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.D1 f27152b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5772o f27153c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5726j0 f27154d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f27155e;

            a(LocalThemeScope localThemeScope, androidx.compose.ui.platform.D1 d12, InterfaceC5772o interfaceC5772o, InterfaceC5726j0 interfaceC5726j0, int i10) {
                this.f27151a = localThemeScope;
                this.f27152b = d12;
                this.f27153c = interfaceC5772o;
                this.f27154d = interfaceC5726j0;
                this.f27155e = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(int i10, InterfaceC5726j0 interfaceC5726j0, androidx.compose.ui.focus.E it) {
                Intrinsics.j(it, "it");
                if (!it.b() || !it.a()) {
                    d.e(interfaceC5726j0, RangesKt.o(d.d(interfaceC5726j0), 0, i10));
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(int i10, androidx.compose.ui.platform.D1 d12, InterfaceC5772o interfaceC5772o, InterfaceC5726j0 interfaceC5726j0, InterfaceC5692y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                d.e(interfaceC5726j0, RangesKt.o(d.d(interfaceC5726j0), 0, i10));
                if (d12 != null) {
                    d12.b();
                }
                InterfaceC5772o.l(interfaceC5772o, false, 1, null);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(InterfaceC5726j0 interfaceC5726j0, String proposed) {
                Intrinsics.j(proposed, "proposed");
                d.e(interfaceC5726j0, Integer.parseInt(C18495i1.a(proposed, Integer.valueOf(d.d(interfaceC5726j0)))));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(InterfaceC14916T interfaceC14916T, final int i10, final InterfaceC5726j0 interfaceC5726j0, zi.y1 AdsInputField) {
                Intrinsics.j(AdsInputField, "$this$AdsInputField");
                AdsInputField.d0(interfaceC14916T.getIcons().getTrailingIcon(), new Function0() { // from class: Pi.v8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.d.a.q(i10, interfaceC5726j0);
                    }
                });
                AdsInputField.T(interfaceC14916T.getIcons().getLeadingIcon(), new Function0() { // from class: Pi.w8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.d.a.r(interfaceC5726j0);
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
                    ComposerKt.U(143977700, i11, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:303)");
                }
                LocalThemeScope localThemeScope = this.f27151a;
                String strValueOf = String.valueOf(d.d(this.f27154d));
                q1.f.QuantityInput quantityInput = Assemble.getInputFields().getDefault();
                Modifier modifier = Assemble.getInputFields().getDefault().getModifier();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                final int i12 = this.f27155e;
                final InterfaceC5726j0 interfaceC5726j0 = this.f27154d;
                Object objB = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB == companion2.a()) {
                    objB = new Function1() { // from class: Pi.r8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.d.a.k(i12, interfaceC5726j0, (androidx.compose.ui.focus.E) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierThen = modifier.then(C5761d.a(companion, (Function1) objB));
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null);
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f27152b) | composer.D(this.f27153c);
                final int i13 = this.f27155e;
                final androidx.compose.ui.platform.D1 d12 = this.f27152b;
                final InterfaceC5772o interfaceC5772o = this.f27153c;
                final InterfaceC5726j0 interfaceC5726j02 = this.f27154d;
                Object objB2 = composer.B();
                if (zV || objB2 == companion2.a()) {
                    objB2 = new Function1() { // from class: Pi.s8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.d.a.l(i13, d12, interfaceC5772o, interfaceC5726j02, (InterfaceC5692y) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                q1.f.QuantityInput quantityInputX = quantityInput.x((65531 & 1) != 0 ? quantityInput.modifier : modifierThen, (65531 & 2) != 0 ? quantityInput.readOnly : false, (65531 & 4) != 0 ? quantityInput.state : null, (65531 & 8) != 0 ? quantityInput.textStyle : null, (65531 & 16) != 0 ? quantityInput.visualTransformation : null, (65531 & 32) != 0 ? quantityInput.keyboardOptions : keyboardOptions, (65531 & 64) != 0 ? quantityInput.keyboardActions : new C5693z((Function1) objB2, null, null, null, null, null, 62, null), (65531 & 128) != 0 ? quantityInput.singleLine : false, (65531 & 256) != 0 ? quantityInput.maxLines : 0, (65531 & 512) != 0 ? quantityInput.interactionSource : null, (65531 & 1024) != 0 ? quantityInput.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInput.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInput.signifier : null, (65531 & 8192) != 0 ? quantityInput.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInput.outerModifier : null, (65531 & 32768) != 0 ? quantityInput.shouldFillMaxWidth : false);
                composer.startReplaceGroup(5004770);
                final InterfaceC5726j0 interfaceC5726j03 = this.f27154d;
                Object objB3 = composer.B();
                if (objB3 == companion2.a()) {
                    objB3 = new Function1() { // from class: Pi.t8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.d.a.o(interfaceC5726j03, (String) obj);
                        }
                    };
                    composer.t(objB3);
                }
                Function1 function1 = (Function1) objB3;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean z10 = (i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble));
                final int i14 = this.f27155e;
                final InterfaceC5726j0 interfaceC5726j04 = this.f27154d;
                Object objB4 = composer.B();
                if (z10 || objB4 == companion2.a()) {
                    objB4 = new Function1() { // from class: Pi.u8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.d.a.p(Assemble, i14, interfaceC5726j04, (zi.y1) obj);
                        }
                    };
                    composer.t(objB4);
                }
                composer.P();
                C18504m0.h(localThemeScope, strValueOf, quantityInputX, function1, null, null, (Function1) objB4, composer, 3072, 24);
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
            public static final Unit q(int i10, InterfaceC5726j0 interfaceC5726j0) {
                if (d.d(interfaceC5726j0) < i10) {
                    d.e(interfaceC5726j0, d.d(interfaceC5726j0) + 1);
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(InterfaceC5726j0 interfaceC5726j0) {
                if (d.d(interfaceC5726j0) > 0) {
                    d.e(interfaceC5726j0, d.d(interfaceC5726j0) - 1);
                }
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function3<ji.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27156a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27157a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ji.j1 f27158b;

                a(LocalThemeScope localThemeScope, ji.j1 j1Var) {
                    this.f27157a = localThemeScope;
                    this.f27158b = j1Var;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1615252459, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:344)");
                    }
                    C16307b.b(this.f27157a, this.f27158b.getIcons().getEnabledIcon(), C.a.C0245a.f15333e, null, composer, 384, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            b(LocalThemeScope localThemeScope) {
                this.f27156a = localThemeScope;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f142422a;
            }

            public final void b(ji.j1 Assemble, Composer composer, int i10) {
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
                LocalThemeScope localThemeScope = this.f27156a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Pi.x8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.d.b.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ni.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-1615252459, true, new a(this.f27156a, Assemble), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c implements Function3<ji.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27159a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5726j0 f27160b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27161a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ji.j1 f27162b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5726j0 f27163c;

                a(LocalThemeScope localThemeScope, ji.j1 j1Var, InterfaceC5726j0 interfaceC5726j0) {
                    this.f27161a = localThemeScope;
                    this.f27162b = j1Var;
                    this.f27163c = interfaceC5726j0;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1038056746, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:355)");
                    }
                    ri.j.h(this.f27161a, this.f27162b.getLabels().getEnabledLabel(), String.valueOf(d.d(this.f27163c)), null, composer, 0, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            c(LocalThemeScope localThemeScope, InterfaceC5726j0 interfaceC5726j0) {
                this.f27159a = localThemeScope;
                this.f27160b = interfaceC5726j0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f142422a;
            }

            public final void b(ji.j1 Assemble, Composer composer, int i10) {
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
                LocalThemeScope localThemeScope = this.f27159a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Pi.y8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.d.c.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ni.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-1038056746, true, new a(this.f27159a, Assemble, this.f27160b), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        d(LocalThemeScope localThemeScope, androidx.compose.ui.platform.D1 d12, InterfaceC5772o interfaceC5772o) {
            this.f27148a = localThemeScope;
            this.f27149b = d12;
            this.f27150c = interfaceC5772o;
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
                objB = C5702c1.a(0);
                composer.t(objB);
            }
            InterfaceC5726j0 interfaceC5726j0 = (InterfaceC5726j0) objB;
            composer.P();
            LocalThemeScope localThemeScope = this.f27148a;
            androidx.compose.ui.platform.D1 d12 = this.f27149b;
            InterfaceC5772o interfaceC5772o = this.f27150c;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            Ji.Q.e(localThemeScope, C14962t0.f140230a, ComposableLambdaKt.c(143977700, true, new a(localThemeScope, d12, interfaceC5772o, interfaceC5726j0, 99), composer, 54), composer, 432);
            float f10 = 8;
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            Ji.Q.e(localThemeScope, C14959s.f140192a, ComposableLambdaKt.c(257793000, true, new b(localThemeScope), composer, 54), composer, 432);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            Ji.Q.e(localThemeScope, C14961t.f140229a, ComposableLambdaKt.c(834988713, true, new c(localThemeScope, interfaceC5726j0), composer, 54), composer, 432);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int d(InterfaceC5726j0 interfaceC5726j0) {
            return interfaceC5726j0.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(InterfaceC5726j0 interfaceC5726j0, int i10) {
            interfaceC5726j0.j(i10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27164a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.D1 f27165b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f27166c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC14916T, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.D1 f27167a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5772o f27168b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27169c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5722h0 f27170d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ double f27171e;

            a(androidx.compose.ui.platform.D1 d12, InterfaceC5772o interfaceC5772o, LocalThemeScope localThemeScope, InterfaceC5722h0 interfaceC5722h0, double d10) {
                this.f27167a = d12;
                this.f27168b = interfaceC5772o;
                this.f27169c = localThemeScope;
                this.f27170d = interfaceC5722h0;
                this.f27171e = d10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(double d10, InterfaceC5722h0 interfaceC5722h0, androidx.compose.ui.focus.E it) {
                Intrinsics.j(it, "it");
                if (!it.b() || !it.a()) {
                    e.e(interfaceC5722h0, RangesKt.m(e.d(interfaceC5722h0), 0.0d, d10));
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(double d10, androidx.compose.ui.platform.D1 d12, InterfaceC5772o interfaceC5772o, InterfaceC5722h0 interfaceC5722h0, InterfaceC5692y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                e.e(interfaceC5722h0, RangesKt.m(e.d(interfaceC5722h0), 0.0d, d10));
                if (d12 != null) {
                    d12.b();
                }
                InterfaceC5772o.l(interfaceC5772o, false, 1, null);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(InterfaceC5722h0 interfaceC5722h0, String proposed) {
                Intrinsics.j(proposed, "proposed");
                e.e(interfaceC5722h0, Double.parseDouble(C18495i1.a(proposed, Double.valueOf(e.d(interfaceC5722h0)))));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(InterfaceC14916T interfaceC14916T, final double d10, final InterfaceC5722h0 interfaceC5722h0, zi.y1 AdsInputField) {
                Intrinsics.j(AdsInputField, "$this$AdsInputField");
                AdsInputField.d0(interfaceC14916T.getIcons().getTrailingIcon(), new Function0() { // from class: Pi.D8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.e.a.q(d10, interfaceC5722h0);
                    }
                });
                AdsInputField.T(interfaceC14916T.getIcons().getLeadingIcon(), new Function0() { // from class: Pi.E8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.e.a.r(interfaceC5722h0);
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
                    ComposerKt.U(387514563, i11, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:371)");
                }
                String strValueOf = String.valueOf(e.d(this.f27170d));
                q1.f.QuantityInput quantityInput = Assemble.getInputFields().getDefault();
                Modifier modifier = Assemble.getInputFields().getDefault().getModifier();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                final double d10 = this.f27171e;
                final InterfaceC5722h0 interfaceC5722h0 = this.f27170d;
                Object objB = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB == companion2.a()) {
                    objB = new Function1() { // from class: Pi.z8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.e.a.k(d10, interfaceC5722h0, (androidx.compose.ui.focus.E) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierThen = modifier.then(C5761d.a(companion, (Function1) objB));
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null);
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f27167a) | composer.D(this.f27168b);
                final double d11 = this.f27171e;
                final androidx.compose.ui.platform.D1 d12 = this.f27167a;
                final InterfaceC5772o interfaceC5772o = this.f27168b;
                final InterfaceC5722h0 interfaceC5722h02 = this.f27170d;
                Object objB2 = composer.B();
                if (zV || objB2 == companion2.a()) {
                    objB2 = new Function1() { // from class: Pi.A8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.e.a.l(d11, d12, interfaceC5772o, interfaceC5722h02, (InterfaceC5692y) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                q1.f.QuantityInput quantityInputX = quantityInput.x((65531 & 1) != 0 ? quantityInput.modifier : modifierThen, (65531 & 2) != 0 ? quantityInput.readOnly : false, (65531 & 4) != 0 ? quantityInput.state : null, (65531 & 8) != 0 ? quantityInput.textStyle : null, (65531 & 16) != 0 ? quantityInput.visualTransformation : null, (65531 & 32) != 0 ? quantityInput.keyboardOptions : keyboardOptions, (65531 & 64) != 0 ? quantityInput.keyboardActions : new C5693z((Function1) objB2, null, null, null, null, null, 62, null), (65531 & 128) != 0 ? quantityInput.singleLine : false, (65531 & 256) != 0 ? quantityInput.maxLines : 0, (65531 & 512) != 0 ? quantityInput.interactionSource : null, (65531 & 1024) != 0 ? quantityInput.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInput.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInput.signifier : null, (65531 & 8192) != 0 ? quantityInput.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInput.outerModifier : null, (65531 & 32768) != 0 ? quantityInput.shouldFillMaxWidth : false);
                LocalThemeScope localThemeScope = this.f27169c;
                composer.startReplaceGroup(5004770);
                final InterfaceC5722h0 interfaceC5722h03 = this.f27170d;
                Object objB3 = composer.B();
                if (objB3 == companion2.a()) {
                    objB3 = new Function1() { // from class: Pi.B8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.e.a.o(interfaceC5722h03, (String) obj);
                        }
                    };
                    composer.t(objB3);
                }
                Function1 function1 = (Function1) objB3;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean z10 = (i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble));
                final double d13 = this.f27171e;
                final InterfaceC5722h0 interfaceC5722h04 = this.f27170d;
                Object objB4 = composer.B();
                if (z10 || objB4 == companion2.a()) {
                    objB4 = new Function1() { // from class: Pi.C8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.e.a.p(Assemble, d13, interfaceC5722h04, (zi.y1) obj);
                        }
                    };
                    composer.t(objB4);
                }
                composer.P();
                C18504m0.h(localThemeScope, strValueOf, quantityInputX, function1, null, "lb:", (Function1) objB4, composer, 199680, 8);
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
            public static final Unit q(double d10, InterfaceC5722h0 interfaceC5722h0) {
                if (e.d(interfaceC5722h0) < d10 && e.d(interfaceC5722h0) <= d10 - 0.25d) {
                    e.e(interfaceC5722h0, new BigDecimal(e.d(interfaceC5722h0) + 0.25d).setScale(2, RoundingMode.HALF_UP).doubleValue());
                } else if (e.d(interfaceC5722h0) < d10) {
                    e.e(interfaceC5722h0, d10);
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(InterfaceC5722h0 interfaceC5722h0) {
                if (e.d(interfaceC5722h0) > 0.0d && e.d(interfaceC5722h0) > 0.25d) {
                    e.e(interfaceC5722h0, new BigDecimal(e.d(interfaceC5722h0) - 0.25d).setScale(2, RoundingMode.HALF_UP).doubleValue());
                } else if (e.d(interfaceC5722h0) > 0.0d) {
                    e.e(interfaceC5722h0, 0.0d);
                }
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function3<ji.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27172a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27173a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ji.j1 f27174b;

                a(LocalThemeScope localThemeScope, ji.j1 j1Var) {
                    this.f27173a = localThemeScope;
                    this.f27174b = j1Var;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1371715596, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:424)");
                    }
                    ri.j.h(this.f27173a, this.f27174b.getLabels().getEnabledLabel(), "Add To Cart", null, composer, 384, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            b(LocalThemeScope localThemeScope) {
                this.f27172a = localThemeScope;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f142422a;
            }

            public final void b(ji.j1 Assemble, Composer composer, int i10) {
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
                LocalThemeScope localThemeScope = this.f27172a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Pi.F8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.e.b.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ni.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-1371715596, true, new a(this.f27172a, Assemble), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c implements Function3<ji.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27175a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27176a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ji.j1 f27177b;

                a(LocalThemeScope localThemeScope, ji.j1 j1Var) {
                    this.f27176a = localThemeScope;
                    this.f27177b = j1Var;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-794519883, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:432)");
                    }
                    ri.j.h(this.f27176a, this.f27177b.getLabels().getEnabledLabel(), "Out of Stock", null, composer, 384, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            c(LocalThemeScope localThemeScope) {
                this.f27175a = localThemeScope;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f142422a;
            }

            public final void b(ji.j1 Assemble, Composer composer, int i10) {
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
                LocalThemeScope localThemeScope = this.f27175a;
                q1.d.StandardButton disabledButton = Assemble.getButtons().getDisabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Pi.G8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.e.c.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ni.E0.b(localThemeScope, disabledButton, (Function0) objB, ComposableLambdaKt.c(-794519883, true, new a(this.f27175a, Assemble), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class d implements Function3<ji.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27178a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5722h0 f27179b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27180a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ji.j1 f27181b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5722h0 f27182c;

                a(LocalThemeScope localThemeScope, ji.j1 j1Var, InterfaceC5722h0 interfaceC5722h0) {
                    this.f27180a = localThemeScope;
                    this.f27181b = j1Var;
                    this.f27182c = interfaceC5722h0;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-217324170, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:440)");
                    }
                    ri.j.h(this.f27180a, this.f27181b.getLabels().getEnabledLabel(), String.valueOf(e.d(this.f27182c)), null, composer, 0, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            d(LocalThemeScope localThemeScope, InterfaceC5722h0 interfaceC5722h0) {
                this.f27178a = localThemeScope;
                this.f27179b = interfaceC5722h0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f142422a;
            }

            public final void b(ji.j1 Assemble, Composer composer, int i10) {
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
                LocalThemeScope localThemeScope = this.f27178a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Pi.H8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.e.d.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ni.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-217324170, true, new a(this.f27178a, Assemble, this.f27179b), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        e(LocalThemeScope localThemeScope, androidx.compose.ui.platform.D1 d12, InterfaceC5772o interfaceC5772o) {
            this.f27164a = localThemeScope;
            this.f27165b = d12;
            this.f27166c = interfaceC5772o;
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
            InterfaceC5722h0 interfaceC5722h0 = (InterfaceC5722h0) objB;
            composer.P();
            LocalThemeScope localThemeScope = this.f27164a;
            androidx.compose.ui.platform.D1 d12 = this.f27165b;
            InterfaceC5772o interfaceC5772o = this.f27166c;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            Ji.Q.e(localThemeScope, ji.I0.f139670a, ComposableLambdaKt.c(387514563, true, new a(d12, interfaceC5772o, localThemeScope, interfaceC5722h0, 99.75d), composer, 54), composer, 432);
            float f10 = 8;
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            InterfaceC14971y.a.d dVar = InterfaceC14971y.a.d.f140292a;
            Ji.Q.e(localThemeScope, dVar, ComposableLambdaKt.c(501329863, true, new b(localThemeScope), composer, 54), composer, 432);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            Ji.Q.e(localThemeScope, dVar, ComposableLambdaKt.c(1078525576, true, new c(localThemeScope), composer, 54), composer, 432);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            Ji.Q.e(localThemeScope, InterfaceC14971y.a.e.f140294a, ComposableLambdaKt.c(1655721289, true, new d(localThemeScope, interfaceC5722h0), composer, 54), composer, 432);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double d(InterfaceC5722h0 interfaceC5722h0) {
            return interfaceC5722h0.d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(InterfaceC5722h0 interfaceC5722h0, double d10) {
            interfaceC5722h0.t(d10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class f implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27183a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.D1 f27184b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f27185c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC14916T, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27186a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.D1 f27187b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5772o f27188c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC14814f f27189d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f27190e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5726j0 f27191f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f27192g;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase$Content$1$6$1$1$4$1$1$1", f = "QuantityInput.kt", l = {489, 489}, m = "invokeSuspend")
            /* renamed from: Pi.W7$f$a$a, reason: collision with other inner class name */
            static final class C0529a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f27193a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27194b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0529a(LocalThemeScope localThemeScope, Continuation<? super C0529a> continuation) {
                    super(2, continuation);
                    this.f27194b = localThemeScope;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C0529a(this.f27194b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C0529a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
                
                    if (Gi.i.i((Gi.i) r0, "All full here", "Please stop", null, false, null, null, null, null, r13, 252, null) == r12) goto L15;
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
                        int r0 = r13.f27193a
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
                        Ji.M r0 = r13.f27194b
                        r13.f27193a = r2
                        r3 = 0
                        r4 = 0
                        java.lang.Object r0 = Ji.LocalThemeScope.g(r0, r3, r13, r2, r4)
                        if (r0 != r12) goto L2f
                        goto L47
                    L2f:
                        Gi.i r0 = (Gi.i) r0
                        r13.f27193a = r1
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
                        java.lang.Object r0 = Gi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                        if (r0 != r12) goto L48
                    L47:
                        return r12
                    L48:
                        kotlin.Unit r0 = kotlin.Unit.f142422a
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: Pi.W7.f.a.C0529a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            a(LocalThemeScope localThemeScope, androidx.compose.ui.platform.D1 d12, InterfaceC5772o interfaceC5772o, InterfaceC14814f interfaceC14814f, InterfaceC16622O interfaceC16622O, InterfaceC5726j0 interfaceC5726j0, int i10) {
                this.f27186a = localThemeScope;
                this.f27187b = d12;
                this.f27188c = interfaceC5772o;
                this.f27189d = interfaceC14814f;
                this.f27190e = interfaceC16622O;
                this.f27191f = interfaceC5726j0;
                this.f27192g = i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(int i10, InterfaceC5726j0 interfaceC5726j0, androidx.compose.ui.focus.E it) {
                Intrinsics.j(it, "it");
                if (!it.b() || !it.a()) {
                    f.g(interfaceC5726j0, RangesKt.o(f.f(interfaceC5726j0), 0, i10));
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(int i10, androidx.compose.ui.platform.D1 d12, InterfaceC5772o interfaceC5772o, InterfaceC5726j0 interfaceC5726j0, InterfaceC5692y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                f.g(interfaceC5726j0, RangesKt.o(f.f(interfaceC5726j0), 0, i10));
                if (d12 != null) {
                    d12.b();
                }
                InterfaceC5772o.l(interfaceC5772o, false, 1, null);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(InterfaceC5726j0 interfaceC5726j0, String proposed) {
                Intrinsics.j(proposed, "proposed");
                f.g(interfaceC5726j0, Integer.parseInt(C18495i1.a(proposed, Integer.valueOf(f.f(interfaceC5726j0)))));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(InterfaceC14916T interfaceC14916T, final int i10, final InterfaceC16622O interfaceC16622O, final InterfaceC5726j0 interfaceC5726j0, final LocalThemeScope localThemeScope, zi.y1 AdsInputField) {
                Intrinsics.j(AdsInputField, "$this$AdsInputField");
                AdsInputField.d0(interfaceC14916T.getIcons().getTrailingIcon(), new Function0() { // from class: Pi.M8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.f.a.q(i10, interfaceC16622O, interfaceC5726j0, localThemeScope);
                    }
                });
                AdsInputField.T(interfaceC14916T.getIcons().getLeadingIcon(), new Function0() { // from class: Pi.N8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.f.a.r(interfaceC5726j0);
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
                    ComposerKt.U(631051426, i11, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:456)");
                }
                LocalThemeScope localThemeScope = this.f27186a;
                String strValueOf = String.valueOf(f.f(this.f27191f));
                q1.f.QuantityInput quantityInput = Assemble.getInputFields().getDefault();
                Modifier modifier = Assemble.getInputFields().getDefault().getModifier();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                final int i12 = this.f27192g;
                final InterfaceC5726j0 interfaceC5726j0 = this.f27191f;
                Object objB = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB == companion2.a()) {
                    objB = new Function1() { // from class: Pi.I8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.f.a.k(i12, interfaceC5726j0, (androidx.compose.ui.focus.E) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierH = androidx.compose.foundation.layout.J.h(modifier.then(C5761d.a(companion, (Function1) objB)), 0.0f, 1, null);
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null);
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f27187b) | composer.D(this.f27188c);
                final int i13 = this.f27192g;
                final androidx.compose.ui.platform.D1 d12 = this.f27187b;
                final InterfaceC5772o interfaceC5772o = this.f27188c;
                final InterfaceC5726j0 interfaceC5726j02 = this.f27191f;
                Object objB2 = composer.B();
                if (zV || objB2 == companion2.a()) {
                    objB2 = new Function1() { // from class: Pi.J8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.f.a.l(i13, d12, interfaceC5772o, interfaceC5726j02, (InterfaceC5692y) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                q1.f.QuantityInput quantityInputX = quantityInput.x((65531 & 1) != 0 ? quantityInput.modifier : modifierH, (65531 & 2) != 0 ? quantityInput.readOnly : false, (65531 & 4) != 0 ? quantityInput.state : null, (65531 & 8) != 0 ? quantityInput.textStyle : null, (65531 & 16) != 0 ? quantityInput.visualTransformation : null, (65531 & 32) != 0 ? quantityInput.keyboardOptions : keyboardOptions, (65531 & 64) != 0 ? quantityInput.keyboardActions : new C5693z((Function1) objB2, null, null, null, null, null, 62, null), (65531 & 128) != 0 ? quantityInput.singleLine : false, (65531 & 256) != 0 ? quantityInput.maxLines : 0, (65531 & 512) != 0 ? quantityInput.interactionSource : null, (65531 & 1024) != 0 ? quantityInput.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInput.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInput.signifier : null, (65531 & 8192) != 0 ? quantityInput.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInput.outerModifier : InterfaceC14814f.b(this.f27189d, Assemble.getInputFields().getDefault().getOuterModifier(), 1.0f, false, 2, null), (65531 & 32768) != 0 ? quantityInput.shouldFillMaxWidth : false);
                composer.startReplaceGroup(5004770);
                final InterfaceC5726j0 interfaceC5726j03 = this.f27191f;
                Object objB3 = composer.B();
                if (objB3 == companion2.a()) {
                    objB3 = new Function1() { // from class: Pi.K8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.f.a.o(interfaceC5726j03, (String) obj);
                        }
                    };
                    composer.t(objB3);
                }
                Function1 function1 = (Function1) objB3;
                composer.P();
                composer.startReplaceGroup(-1224400529);
                boolean zD = ((i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble))) | composer.D(this.f27190e) | composer.D(this.f27186a);
                final int i14 = this.f27192g;
                final InterfaceC16622O interfaceC16622O = this.f27190e;
                final InterfaceC5726j0 interfaceC5726j04 = this.f27191f;
                final LocalThemeScope localThemeScope2 = this.f27186a;
                Object objB4 = composer.B();
                if (zD || objB4 == companion2.a()) {
                    Function1 function12 = new Function1() { // from class: Pi.L8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.f.a.p(Assemble, i14, interfaceC16622O, interfaceC5726j04, localThemeScope2, (zi.y1) obj);
                        }
                    };
                    composer.t(function12);
                    objB4 = function12;
                }
                composer.P();
                C18504m0.h(localThemeScope, strValueOf, quantityInputX, function1, null, null, (Function1) objB4, composer, 3072, 24);
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
            public static final Unit q(int i10, InterfaceC16622O interfaceC16622O, InterfaceC5726j0 interfaceC5726j0, LocalThemeScope localThemeScope) {
                if (f.f(interfaceC5726j0) < i10) {
                    f.g(interfaceC5726j0, f.f(interfaceC5726j0) + 1);
                }
                if (f.f(interfaceC5726j0) == i10) {
                    C16648k.d(interfaceC16622O, null, null, new C0529a(localThemeScope, null), 3, null);
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(InterfaceC5726j0 interfaceC5726j0) {
                if (f.f(interfaceC5726j0) > 0) {
                    f.g(interfaceC5726j0, f.f(interfaceC5726j0) - 1);
                }
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function3<InterfaceC14916T, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27195a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14800I f27196b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5726j0 f27197c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f27198d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ double f27199e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5722h0 f27200f;

            b(LocalThemeScope localThemeScope, InterfaceC14800I interfaceC14800I, InterfaceC5726j0 interfaceC5726j0, int i10, double d10, InterfaceC5722h0 interfaceC5722h0) {
                this.f27195a = localThemeScope;
                this.f27196b = interfaceC14800I;
                this.f27197c = interfaceC5726j0;
                this.f27198d = i10;
                this.f27199e = d10;
                this.f27200f = interfaceC5722h0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(int i10, InterfaceC5726j0 interfaceC5726j0, androidx.compose.ui.focus.E it) {
                Intrinsics.j(it, "it");
                if (!it.b() || !it.a()) {
                    f.g(interfaceC5726j0, RangesKt.o(f.f(interfaceC5726j0), 0, i10));
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(int i10, int i11) {
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(InterfaceC14916T interfaceC14916T, final double d10, final InterfaceC5722h0 interfaceC5722h0, zi.y1 InputField) {
                Intrinsics.j(InputField, "$this$InputField");
                InputField.d0(interfaceC14916T.getIcons().getTrailingIcon(), new Function0() { // from class: Pi.R8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.f.b.o(d10, interfaceC5722h0);
                    }
                });
                InputField.T(interfaceC14916T.getIcons().getLeadingIcon(), new Function0() { // from class: Pi.S8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.f.b.p(interfaceC5722h0);
                    }
                });
                return Unit.f142422a;
            }

            public final void f(final InterfaceC14916T Assemble, Composer composer, int i10) {
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
                LocalThemeScope localThemeScope = this.f27195a;
                int iF = f.f(this.f27197c);
                q1.f.QuantityInput quantityInput = Assemble.getInputFields().getDefault();
                Modifier modifier = Assemble.getInputFields().getDefault().getModifier();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                final int i12 = this.f27198d;
                final InterfaceC5726j0 interfaceC5726j0 = this.f27197c;
                Object objB = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB == companion2.a()) {
                    objB = new Function1() { // from class: Pi.O8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.f.b.g(i12, interfaceC5726j0, (androidx.compose.ui.focus.E) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                q1.f.QuantityInput quantityInputX = quantityInput.x((65531 & 1) != 0 ? quantityInput.modifier : androidx.compose.foundation.layout.J.h(modifier.then(C5761d.a(companion, (Function1) objB)), 0.0f, 1, null), (65531 & 2) != 0 ? quantityInput.readOnly : false, (65531 & 4) != 0 ? quantityInput.state : null, (65531 & 8) != 0 ? quantityInput.textStyle : null, (65531 & 16) != 0 ? quantityInput.visualTransformation : null, (65531 & 32) != 0 ? quantityInput.keyboardOptions : null, (65531 & 64) != 0 ? quantityInput.keyboardActions : null, (65531 & 128) != 0 ? quantityInput.singleLine : false, (65531 & 256) != 0 ? quantityInput.maxLines : 0, (65531 & 512) != 0 ? quantityInput.interactionSource : null, (65531 & 1024) != 0 ? quantityInput.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInput.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInput.signifier : null, (65531 & 8192) != 0 ? quantityInput.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInput.outerModifier : InterfaceC14800I.b(this.f27196b, Assemble.getInputFields().getDefault().getOuterModifier(), 1.0f, false, 2, null), (65531 & 32768) != 0 ? quantityInput.shouldFillMaxWidth : false);
                composer.startReplaceGroup(1849434622);
                Object objB2 = composer.B();
                if (objB2 == companion2.a()) {
                    objB2 = new Function2() { // from class: Pi.P8
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
                final double d10 = this.f27199e;
                final InterfaceC5722h0 interfaceC5722h0 = this.f27200f;
                Object objB3 = composer.B();
                if (z10 || objB3 == companion2.a()) {
                    objB3 = new Function1() { // from class: Pi.Q8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.f.b.l(Assemble, d10, interfaceC5722h0, (zi.y1) obj);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                zi.p1.h(localThemeScope, iF, 0, quantityInputX, function2, null, (Function1) objB3, composer, 24576, 18);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14916T interfaceC14916T, Composer composer, Integer num) {
                f(interfaceC14916T, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(double d10, InterfaceC5722h0 interfaceC5722h0) {
                if (f.k(interfaceC5722h0) < d10 && f.k(interfaceC5722h0) <= d10 - 0.25d) {
                    f.l(interfaceC5722h0, new BigDecimal(f.k(interfaceC5722h0) + 0.25d).setScale(2, RoundingMode.HALF_UP).doubleValue());
                } else if (f.k(interfaceC5722h0) < d10) {
                    f.l(interfaceC5722h0, d10);
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(InterfaceC5722h0 interfaceC5722h0) {
                if (f.k(interfaceC5722h0) > 0.0d && f.k(interfaceC5722h0) > 0.25d) {
                    f.l(interfaceC5722h0, new BigDecimal(f.k(interfaceC5722h0) - 0.25d).setScale(2, RoundingMode.HALF_UP).doubleValue());
                } else if (f.k(interfaceC5722h0) > 0.0d) {
                    f.l(interfaceC5722h0, 0.0d);
                }
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c implements Function3<ji.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27201a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27202a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ji.j1 f27203b;

                a(LocalThemeScope localThemeScope, ji.j1 j1Var) {
                    this.f27202a = localThemeScope;
                    this.f27203b = j1Var;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1128178733, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:551)");
                    }
                    C16307b.b(this.f27202a, this.f27203b.getIcons().getEnabledIcon(), C.a.C0245a.f15333e, null, composer, 384, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            c(LocalThemeScope localThemeScope) {
                this.f27201a = localThemeScope;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f142422a;
            }

            public final void b(ji.j1 Assemble, Composer composer, int i10) {
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
                LocalThemeScope localThemeScope = this.f27201a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Pi.T8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.f.c.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ni.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-1128178733, true, new a(this.f27201a, Assemble), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class d implements Function3<ji.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27204a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5726j0 f27205b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27206a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ji.j1 f27207b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5726j0 f27208c;

                a(LocalThemeScope localThemeScope, ji.j1 j1Var, InterfaceC5726j0 interfaceC5726j0) {
                    this.f27206a = localThemeScope;
                    this.f27207b = j1Var;
                    this.f27208c = interfaceC5726j0;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-550983020, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:562)");
                    }
                    ri.j.h(this.f27206a, this.f27207b.getLabels().getEnabledLabel(), String.valueOf(f.f(this.f27208c)), null, composer, 0, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            d(LocalThemeScope localThemeScope, InterfaceC5726j0 interfaceC5726j0) {
                this.f27204a = localThemeScope;
                this.f27205b = interfaceC5726j0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f142422a;
            }

            public final void b(ji.j1 Assemble, Composer composer, int i10) {
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
                LocalThemeScope localThemeScope = this.f27204a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Pi.U8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.f.d.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ni.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-550983020, true, new a(this.f27204a, Assemble, this.f27205b), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        f(LocalThemeScope localThemeScope, androidx.compose.ui.platform.D1 d12, InterfaceC5772o interfaceC5772o) {
            this.f27183a = localThemeScope;
            this.f27184b = d12;
            this.f27185c = interfaceC5772o;
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
                objB = C5702c1.a(0);
                composer.t(objB);
            }
            InterfaceC5726j0 interfaceC5726j0 = (InterfaceC5726j0) objB;
            composer.P();
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = androidx.compose.runtime.J.k(EmptyCoroutineContext.f142646a, composer);
                composer.t(objB2);
            }
            InterfaceC16622O interfaceC16622O = (InterfaceC16622O) objB2;
            LocalThemeScope localThemeScope = this.f27183a;
            androidx.compose.ui.platform.D1 d12 = this.f27184b;
            InterfaceC5772o interfaceC5772o = this.f27185c;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            C5658d c5658d = C5658d.f48555a;
            C5658d.m mVarH = c5658d.h();
            e.Companion companion3 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion3.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion2);
            InterfaceC5811g.Companion companion4 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion4.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion4.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion4.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion4.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion4.f());
            C14815g c14815g = C14815g.f139108a;
            ji.B0 b02 = ji.B0.f139604a;
            Ji.Q.e(localThemeScope, b02, ComposableLambdaKt.c(631051426, true, new a(localThemeScope, d12, interfaceC5772o, c14815g, interfaceC16622O, interfaceC5726j0, 99), composer, 54), composer, 432);
            float f10 = 8;
            C14802K.a(androidx.compose.foundation.layout.J.i(companion2, H1.h.p(f10)), composer, 6);
            Modifier modifierK = androidx.compose.foundation.layout.D.k(companion2, H1.h.p(16), 0.0f, 2, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion3.l(), composer, 0);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierK);
            Function0<InterfaceC5811g> function0A2 = companion4.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyB, companion4.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5742sR2, companion4.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion4.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            androidx.compose.runtime.D1.c(composerA2, modifierE2, companion4.f());
            C14801J c14801j = C14801J.f139030a;
            composer.startReplaceGroup(1849434622);
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = androidx.compose.runtime.Y0.a(0.0d);
                composer.t(objB3);
            }
            composer.P();
            Ji.Q.e(localThemeScope, b02, ComposableLambdaKt.c(-707222330, true, new b(localThemeScope, c14801j, interfaceC5726j0, 99, 99.75d, (InterfaceC5722h0) objB3), composer, 54), composer, 432);
            composer.v();
            C14802K.a(androidx.compose.foundation.layout.J.i(companion2, H1.h.p(f10)), composer, 6);
            Ji.Q.e(localThemeScope, C14951o.f139915a, ComposableLambdaKt.c(744866726, true, new c(localThemeScope), composer, 54), composer, 432);
            C14802K.a(androidx.compose.foundation.layout.J.i(companion2, H1.h.p(f10)), composer, 6);
            Ji.Q.e(localThemeScope, C14953p.f139919a, ComposableLambdaKt.c(1322062439, true, new d(localThemeScope, interfaceC5726j0), composer, 54), composer, 432);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            e(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int f(InterfaceC5726j0 interfaceC5726j0) {
            return interfaceC5726j0.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(InterfaceC5726j0 interfaceC5726j0, int i10) {
            interfaceC5726j0.j(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double k(InterfaceC5722h0 interfaceC5722h0) {
            return interfaceC5722h0.d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(InterfaceC5722h0 interfaceC5722h0, double d10) {
            interfaceC5722h0.t(d10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class g implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27209a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.D1 f27210b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5772o f27211c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<InterfaceC14916T, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.D1 f27212a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5772o f27213b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27214c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5722h0 f27215d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ double f27216e;

            a(androidx.compose.ui.platform.D1 d12, InterfaceC5772o interfaceC5772o, LocalThemeScope localThemeScope, InterfaceC5722h0 interfaceC5722h0, double d10) {
                this.f27212a = d12;
                this.f27213b = interfaceC5772o;
                this.f27214c = localThemeScope;
                this.f27215d = interfaceC5722h0;
                this.f27216e = d10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(double d10, InterfaceC5722h0 interfaceC5722h0, androidx.compose.ui.focus.E it) {
                Intrinsics.j(it, "it");
                if (!it.b() || !it.a()) {
                    g.e(interfaceC5722h0, RangesKt.m(g.d(interfaceC5722h0), 0.0d, d10));
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(double d10, androidx.compose.ui.platform.D1 d12, InterfaceC5772o interfaceC5772o, InterfaceC5722h0 interfaceC5722h0, InterfaceC5692y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                g.e(interfaceC5722h0, RangesKt.m(g.d(interfaceC5722h0), 0.0d, d10));
                if (d12 != null) {
                    d12.b();
                }
                InterfaceC5772o.l(interfaceC5772o, false, 1, null);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(InterfaceC5722h0 interfaceC5722h0, String proposed) {
                Intrinsics.j(proposed, "proposed");
                g.e(interfaceC5722h0, Double.parseDouble(C18495i1.a(proposed, Double.valueOf(g.d(interfaceC5722h0)))));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(InterfaceC14916T interfaceC14916T, final double d10, final InterfaceC5722h0 interfaceC5722h0, zi.y1 AdsInputField) {
                Intrinsics.j(AdsInputField, "$this$AdsInputField");
                AdsInputField.d0(interfaceC14916T.getIcons().getTrailingIcon(), new Function0() { // from class: Pi.Z8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.g.a.q(d10, interfaceC5722h0);
                    }
                });
                AdsInputField.T(interfaceC14916T.getIcons().getLeadingIcon(), new Function0() { // from class: Pi.a9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.g.a.r(interfaceC5722h0);
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
                    ComposerKt.U(-463685467, i11, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:583)");
                }
                String strValueOf = String.valueOf(g.d(this.f27215d));
                q1.f.QuantityInput quantityInput = Assemble.getInputFields().getDefault();
                Modifier modifier = Assemble.getInputFields().getDefault().getModifier();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                final double d10 = this.f27216e;
                final InterfaceC5722h0 interfaceC5722h0 = this.f27215d;
                Object objB = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB == companion2.a()) {
                    objB = new Function1() { // from class: Pi.V8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.a.k(d10, interfaceC5722h0, (androidx.compose.ui.focus.E) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierThen = modifier.then(C5761d.a(companion, (Function1) objB));
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null);
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f27212a) | composer.D(this.f27213b);
                final double d11 = this.f27216e;
                final androidx.compose.ui.platform.D1 d12 = this.f27212a;
                final InterfaceC5772o interfaceC5772o = this.f27213b;
                final InterfaceC5722h0 interfaceC5722h02 = this.f27215d;
                Object objB2 = composer.B();
                if (zV || objB2 == companion2.a()) {
                    objB2 = new Function1() { // from class: Pi.W8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.a.l(d11, d12, interfaceC5772o, interfaceC5722h02, (InterfaceC5692y) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                q1.f.QuantityInput quantityInputX = quantityInput.x((65531 & 1) != 0 ? quantityInput.modifier : modifierThen, (65531 & 2) != 0 ? quantityInput.readOnly : false, (65531 & 4) != 0 ? quantityInput.state : null, (65531 & 8) != 0 ? quantityInput.textStyle : null, (65531 & 16) != 0 ? quantityInput.visualTransformation : null, (65531 & 32) != 0 ? quantityInput.keyboardOptions : keyboardOptions, (65531 & 64) != 0 ? quantityInput.keyboardActions : new C5693z((Function1) objB2, null, null, null, null, null, 62, null), (65531 & 128) != 0 ? quantityInput.singleLine : false, (65531 & 256) != 0 ? quantityInput.maxLines : 0, (65531 & 512) != 0 ? quantityInput.interactionSource : null, (65531 & 1024) != 0 ? quantityInput.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInput.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInput.signifier : null, (65531 & 8192) != 0 ? quantityInput.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInput.outerModifier : null, (65531 & 32768) != 0 ? quantityInput.shouldFillMaxWidth : false);
                LocalThemeScope localThemeScope = this.f27214c;
                composer.startReplaceGroup(5004770);
                final InterfaceC5722h0 interfaceC5722h03 = this.f27215d;
                Object objB3 = composer.B();
                if (objB3 == companion2.a()) {
                    objB3 = new Function1() { // from class: Pi.X8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.a.o(interfaceC5722h03, (String) obj);
                        }
                    };
                    composer.t(objB3);
                }
                Function1 function1 = (Function1) objB3;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean z10 = (i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble));
                final double d13 = this.f27216e;
                final InterfaceC5722h0 interfaceC5722h04 = this.f27215d;
                Object objB4 = composer.B();
                if (z10 || objB4 == companion2.a()) {
                    objB4 = new Function1() { // from class: Pi.Y8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.a.p(Assemble, d13, interfaceC5722h04, (zi.y1) obj);
                        }
                    };
                    composer.t(objB4);
                }
                composer.P();
                C18504m0.h(localThemeScope, strValueOf, quantityInputX, function1, null, "lb:", (Function1) objB4, composer, 199680, 8);
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
            public static final Unit q(double d10, InterfaceC5722h0 interfaceC5722h0) {
                if (g.d(interfaceC5722h0) < d10 && g.d(interfaceC5722h0) <= d10 - 0.25d) {
                    g.e(interfaceC5722h0, new BigDecimal(g.d(interfaceC5722h0) + 0.25d).setScale(2, RoundingMode.HALF_UP).doubleValue());
                } else if (g.d(interfaceC5722h0) < d10) {
                    g.e(interfaceC5722h0, d10);
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(InterfaceC5722h0 interfaceC5722h0) {
                if (g.d(interfaceC5722h0) > 0.0d && g.d(interfaceC5722h0) > 0.25d) {
                    g.e(interfaceC5722h0, new BigDecimal(g.d(interfaceC5722h0) - 0.25d).setScale(2, RoundingMode.HALF_UP).doubleValue());
                } else if (g.d(interfaceC5722h0) > 0.0d) {
                    g.e(interfaceC5722h0, 0.0d);
                }
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function3<ji.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27217a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27218a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ji.j1 f27219b;

                a(LocalThemeScope localThemeScope, ji.j1 j1Var) {
                    this.f27218a = localThemeScope;
                    this.f27219b = j1Var;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-109178346, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:636)");
                    }
                    C16307b.b(this.f27218a, this.f27219b.getIcons().getEnabledIcon(), C.a.C0245a.f15333e, null, composer, 384, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            b(LocalThemeScope localThemeScope) {
                this.f27217a = localThemeScope;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f142422a;
            }

            public final void b(ji.j1 Assemble, Composer composer, int i10) {
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
                LocalThemeScope localThemeScope = this.f27217a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Pi.b9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.g.b.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ni.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-109178346, true, new a(this.f27217a, Assemble), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c implements Function3<InterfaceC14916T, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.D1 f27220a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5772o f27221b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27222c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5722h0 f27223d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ double f27224e;

            c(androidx.compose.ui.platform.D1 d12, InterfaceC5772o interfaceC5772o, LocalThemeScope localThemeScope, InterfaceC5722h0 interfaceC5722h0, double d10) {
                this.f27220a = d12;
                this.f27221b = interfaceC5772o;
                this.f27222c = localThemeScope;
                this.f27223d = interfaceC5722h0;
                this.f27224e = d10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(double d10, InterfaceC5722h0 interfaceC5722h0, androidx.compose.ui.focus.E it) {
                Intrinsics.j(it, "it");
                if (!it.b() || !it.a()) {
                    g.e(interfaceC5722h0, RangesKt.m(g.d(interfaceC5722h0), 0.0d, d10));
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(double d10, androidx.compose.ui.platform.D1 d12, InterfaceC5772o interfaceC5772o, InterfaceC5722h0 interfaceC5722h0, InterfaceC5692y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                g.e(interfaceC5722h0, RangesKt.m(g.d(interfaceC5722h0), 0.0d, d10));
                if (d12 != null) {
                    d12.b();
                }
                InterfaceC5772o.l(interfaceC5772o, false, 1, null);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(InterfaceC5722h0 interfaceC5722h0, String proposed) {
                Intrinsics.j(proposed, "proposed");
                g.e(interfaceC5722h0, Double.parseDouble(C18495i1.a(proposed, Double.valueOf(g.d(interfaceC5722h0)))));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(InterfaceC14916T interfaceC14916T, final double d10, final InterfaceC5722h0 interfaceC5722h0, zi.y1 AdsInputField) {
                Intrinsics.j(AdsInputField, "$this$AdsInputField");
                AdsInputField.d0(interfaceC14916T.getIcons().getTrailingIcon(), new Function0() { // from class: Pi.g9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.g.c.q(d10, interfaceC5722h0);
                    }
                });
                AdsInputField.T(interfaceC14916T.getIcons().getLeadingIcon(), new Function0() { // from class: Pi.h9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.g.c.r(interfaceC5722h0);
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
                    ComposerKt.U(956919964, i11, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:653)");
                }
                String strValueOf = String.valueOf(g.d(this.f27223d));
                q1.f.QuantityInput quantityInput = Assemble.getInputFields().getDefault();
                Modifier modifier = Assemble.getInputFields().getDefault().getModifier();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                final double d10 = this.f27224e;
                final InterfaceC5722h0 interfaceC5722h0 = this.f27223d;
                Object objB = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB == companion2.a()) {
                    objB = new Function1() { // from class: Pi.c9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.c.k(d10, interfaceC5722h0, (androidx.compose.ui.focus.E) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierThen = modifier.then(C5761d.a(companion, (Function1) objB));
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null);
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f27220a) | composer.D(this.f27221b);
                final double d11 = this.f27224e;
                final androidx.compose.ui.platform.D1 d12 = this.f27220a;
                final InterfaceC5772o interfaceC5772o = this.f27221b;
                final InterfaceC5722h0 interfaceC5722h02 = this.f27223d;
                Object objB2 = composer.B();
                if (zV || objB2 == companion2.a()) {
                    objB2 = new Function1() { // from class: Pi.d9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.c.l(d11, d12, interfaceC5772o, interfaceC5722h02, (InterfaceC5692y) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                q1.f.QuantityInput quantityInputX = quantityInput.x((65531 & 1) != 0 ? quantityInput.modifier : modifierThen, (65531 & 2) != 0 ? quantityInput.readOnly : false, (65531 & 4) != 0 ? quantityInput.state : null, (65531 & 8) != 0 ? quantityInput.textStyle : null, (65531 & 16) != 0 ? quantityInput.visualTransformation : null, (65531 & 32) != 0 ? quantityInput.keyboardOptions : keyboardOptions, (65531 & 64) != 0 ? quantityInput.keyboardActions : new C5693z((Function1) objB2, null, null, null, null, null, 62, null), (65531 & 128) != 0 ? quantityInput.singleLine : false, (65531 & 256) != 0 ? quantityInput.maxLines : 0, (65531 & 512) != 0 ? quantityInput.interactionSource : null, (65531 & 1024) != 0 ? quantityInput.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInput.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInput.signifier : null, (65531 & 8192) != 0 ? quantityInput.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInput.outerModifier : null, (65531 & 32768) != 0 ? quantityInput.shouldFillMaxWidth : false);
                LocalThemeScope localThemeScope = this.f27222c;
                composer.startReplaceGroup(5004770);
                final InterfaceC5722h0 interfaceC5722h03 = this.f27223d;
                Object objB3 = composer.B();
                if (objB3 == companion2.a()) {
                    objB3 = new Function1() { // from class: Pi.e9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.c.o(interfaceC5722h03, (String) obj);
                        }
                    };
                    composer.t(objB3);
                }
                Function1 function1 = (Function1) objB3;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean z10 = (i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble));
                final double d13 = this.f27224e;
                final InterfaceC5722h0 interfaceC5722h04 = this.f27223d;
                Object objB4 = composer.B();
                if (z10 || objB4 == companion2.a()) {
                    objB4 = new Function1() { // from class: Pi.f9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.c.p(Assemble, d13, interfaceC5722h04, (zi.y1) obj);
                        }
                    };
                    composer.t(objB4);
                }
                composer.P();
                C18504m0.h(localThemeScope, strValueOf, quantityInputX, function1, null, "lb:", (Function1) objB4, composer, 199680, 8);
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
            public static final Unit q(double d10, InterfaceC5722h0 interfaceC5722h0) {
                if (g.d(interfaceC5722h0) < d10 && g.d(interfaceC5722h0) <= d10 - 0.25d) {
                    g.e(interfaceC5722h0, new BigDecimal(g.d(interfaceC5722h0) + 0.25d).setScale(2, RoundingMode.HALF_UP).doubleValue());
                } else if (g.d(interfaceC5722h0) < d10) {
                    g.e(interfaceC5722h0, d10);
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(InterfaceC5722h0 interfaceC5722h0) {
                if (g.d(interfaceC5722h0) > 0.0d && g.d(interfaceC5722h0) > 0.25d) {
                    g.e(interfaceC5722h0, new BigDecimal(g.d(interfaceC5722h0) - 0.25d).setScale(2, RoundingMode.HALF_UP).doubleValue());
                } else if (g.d(interfaceC5722h0) > 0.0d) {
                    g.e(interfaceC5722h0, 0.0d);
                }
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class d implements Function3<ji.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27225a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27226a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ji.j1 f27227b;

                a(LocalThemeScope localThemeScope, ji.j1 j1Var) {
                    this.f27226a = localThemeScope;
                    this.f27227b = j1Var;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1959120435, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:706)");
                    }
                    C16307b.b(this.f27226a, this.f27227b.getIcons().getEnabledIcon(), C.a.C0245a.f15333e, null, composer, 384, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            d(LocalThemeScope localThemeScope) {
                this.f27225a = localThemeScope;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f142422a;
            }

            public final void b(ji.j1 Assemble, Composer composer, int i10) {
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
                LocalThemeScope localThemeScope = this.f27225a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Pi.i9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.g.d.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ni.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-1959120435, true, new a(this.f27225a, Assemble), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class e implements Function3<InterfaceC14916T, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.D1 f27228a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5772o f27229b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27230c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5722h0 f27231d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ double f27232e;

            e(androidx.compose.ui.platform.D1 d12, InterfaceC5772o interfaceC5772o, LocalThemeScope localThemeScope, InterfaceC5722h0 interfaceC5722h0, double d10) {
                this.f27228a = d12;
                this.f27229b = interfaceC5772o;
                this.f27230c = localThemeScope;
                this.f27231d = interfaceC5722h0;
                this.f27232e = d10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(double d10, InterfaceC5722h0 interfaceC5722h0, androidx.compose.ui.focus.E it) {
                Intrinsics.j(it, "it");
                if (!it.b() || !it.a()) {
                    g.e(interfaceC5722h0, RangesKt.m(g.d(interfaceC5722h0), 0.0d, d10));
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(double d10, androidx.compose.ui.platform.D1 d12, InterfaceC5772o interfaceC5772o, InterfaceC5722h0 interfaceC5722h0, InterfaceC5692y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                g.e(interfaceC5722h0, RangesKt.m(g.d(interfaceC5722h0), 0.0d, d10));
                if (d12 != null) {
                    d12.b();
                }
                InterfaceC5772o.l(interfaceC5772o, false, 1, null);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(InterfaceC5722h0 interfaceC5722h0, String proposed) {
                Intrinsics.j(proposed, "proposed");
                g.e(interfaceC5722h0, Double.parseDouble(C18495i1.a(proposed, Double.valueOf(g.d(interfaceC5722h0)))));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(InterfaceC14916T interfaceC14916T, final double d10, final InterfaceC5722h0 interfaceC5722h0, zi.y1 AdsInputField) {
                Intrinsics.j(AdsInputField, "$this$AdsInputField");
                AdsInputField.d0(interfaceC14916T.getIcons().getTrailingIcon(), new Function0() { // from class: Pi.n9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.g.e.q(d10, interfaceC5722h0);
                    }
                });
                AdsInputField.T(interfaceC14916T.getIcons().getLeadingIcon(), new Function0() { // from class: Pi.o9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.g.e.r(interfaceC5722h0);
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
                    ComposerKt.U(1534115677, i11, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:724)");
                }
                String strValueOf = String.valueOf(g.d(this.f27231d));
                q1.f.QuantityInput quantityInput = Assemble.getInputFields().getDefault();
                Modifier modifier = Assemble.getInputFields().getDefault().getModifier();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                final double d10 = this.f27232e;
                final InterfaceC5722h0 interfaceC5722h0 = this.f27231d;
                Object objB = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB == companion2.a()) {
                    objB = new Function1() { // from class: Pi.j9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.e.k(d10, interfaceC5722h0, (androidx.compose.ui.focus.E) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierThen = modifier.then(C5761d.a(companion, (Function1) objB));
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null);
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f27228a) | composer.D(this.f27229b);
                final double d11 = this.f27232e;
                final androidx.compose.ui.platform.D1 d12 = this.f27228a;
                final InterfaceC5772o interfaceC5772o = this.f27229b;
                final InterfaceC5722h0 interfaceC5722h02 = this.f27231d;
                Object objB2 = composer.B();
                if (zV || objB2 == companion2.a()) {
                    objB2 = new Function1() { // from class: Pi.k9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.e.l(d11, d12, interfaceC5772o, interfaceC5722h02, (InterfaceC5692y) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                q1.f.QuantityInput quantityInputX = quantityInput.x((65531 & 1) != 0 ? quantityInput.modifier : modifierThen, (65531 & 2) != 0 ? quantityInput.readOnly : false, (65531 & 4) != 0 ? quantityInput.state : null, (65531 & 8) != 0 ? quantityInput.textStyle : null, (65531 & 16) != 0 ? quantityInput.visualTransformation : null, (65531 & 32) != 0 ? quantityInput.keyboardOptions : keyboardOptions, (65531 & 64) != 0 ? quantityInput.keyboardActions : new C5693z((Function1) objB2, null, null, null, null, null, 62, null), (65531 & 128) != 0 ? quantityInput.singleLine : false, (65531 & 256) != 0 ? quantityInput.maxLines : 0, (65531 & 512) != 0 ? quantityInput.interactionSource : null, (65531 & 1024) != 0 ? quantityInput.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInput.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInput.signifier : null, (65531 & 8192) != 0 ? quantityInput.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInput.outerModifier : null, (65531 & 32768) != 0 ? quantityInput.shouldFillMaxWidth : false);
                LocalThemeScope localThemeScope = this.f27230c;
                composer.startReplaceGroup(5004770);
                final InterfaceC5722h0 interfaceC5722h03 = this.f27231d;
                Object objB3 = composer.B();
                if (objB3 == companion2.a()) {
                    objB3 = new Function1() { // from class: Pi.l9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.e.o(interfaceC5722h03, (String) obj);
                        }
                    };
                    composer.t(objB3);
                }
                Function1 function1 = (Function1) objB3;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean z10 = (i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble));
                final double d13 = this.f27232e;
                final InterfaceC5722h0 interfaceC5722h04 = this.f27231d;
                Object objB4 = composer.B();
                if (z10 || objB4 == companion2.a()) {
                    objB4 = new Function1() { // from class: Pi.m9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.e.p(Assemble, d13, interfaceC5722h04, (zi.y1) obj);
                        }
                    };
                    composer.t(objB4);
                }
                composer.P();
                C18504m0.h(localThemeScope, strValueOf, quantityInputX, function1, null, "lb:", (Function1) objB4, composer, 199680, 8);
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
            public static final Unit q(double d10, InterfaceC5722h0 interfaceC5722h0) {
                if (g.d(interfaceC5722h0) < d10 && g.d(interfaceC5722h0) <= d10 - 0.25d) {
                    g.e(interfaceC5722h0, new BigDecimal(g.d(interfaceC5722h0) + 0.25d).setScale(2, RoundingMode.HALF_UP).doubleValue());
                } else if (g.d(interfaceC5722h0) < d10) {
                    g.e(interfaceC5722h0, d10);
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(InterfaceC5722h0 interfaceC5722h0) {
                if (g.d(interfaceC5722h0) > 0.0d && g.d(interfaceC5722h0) > 0.25d) {
                    g.e(interfaceC5722h0, new BigDecimal(g.d(interfaceC5722h0) - 0.25d).setScale(2, RoundingMode.HALF_UP).doubleValue());
                } else if (g.d(interfaceC5722h0) > 0.0d) {
                    g.e(interfaceC5722h0, 0.0d);
                }
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class f implements Function3<ji.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27233a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5722h0 f27234b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27235a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ji.j1 f27236b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5722h0 f27237c;

                a(LocalThemeScope localThemeScope, ji.j1 j1Var, InterfaceC5722h0 interfaceC5722h0) {
                    this.f27235a = localThemeScope;
                    this.f27236b = j1Var;
                    this.f27237c = interfaceC5722h0;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1381924722, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:777)");
                    }
                    ri.j.h(this.f27235a, this.f27236b.getLabels().getEnabledLabel(), String.valueOf(g.d(this.f27237c)), null, composer, 0, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            f(LocalThemeScope localThemeScope, InterfaceC5722h0 interfaceC5722h0) {
                this.f27233a = localThemeScope;
                this.f27234b = interfaceC5722h0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f142422a;
            }

            public final void b(ji.j1 Assemble, Composer composer, int i10) {
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
                LocalThemeScope localThemeScope = this.f27233a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Pi.p9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.g.f.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ni.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-1381924722, true, new a(this.f27233a, Assemble, this.f27234b), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Pi.W7$g$g, reason: collision with other inner class name */
        static final class C0530g implements Function3<InterfaceC14916T, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.D1 f27238a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5772o f27239b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27240c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5722h0 f27241d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ double f27242e;

            C0530g(androidx.compose.ui.platform.D1 d12, InterfaceC5772o interfaceC5772o, LocalThemeScope localThemeScope, InterfaceC5722h0 interfaceC5722h0, double d10) {
                this.f27238a = d12;
                this.f27239b = interfaceC5772o;
                this.f27240c = localThemeScope;
                this.f27241d = interfaceC5722h0;
                this.f27242e = d10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(double d10, InterfaceC5722h0 interfaceC5722h0, androidx.compose.ui.focus.E it) {
                Intrinsics.j(it, "it");
                if (!it.b() || !it.a()) {
                    g.e(interfaceC5722h0, RangesKt.m(g.d(interfaceC5722h0), 0.0d, d10));
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(double d10, androidx.compose.ui.platform.D1 d12, InterfaceC5772o interfaceC5772o, InterfaceC5722h0 interfaceC5722h0, InterfaceC5692y KeyboardActions) {
                Intrinsics.j(KeyboardActions, "$this$KeyboardActions");
                g.e(interfaceC5722h0, RangesKt.m(g.d(interfaceC5722h0), 0.0d, d10));
                if (d12 != null) {
                    d12.b();
                }
                InterfaceC5772o.l(interfaceC5772o, false, 1, null);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit o(InterfaceC5722h0 interfaceC5722h0, String proposed) {
                Intrinsics.j(proposed, "proposed");
                g.e(interfaceC5722h0, Double.parseDouble(C18495i1.a(proposed, Double.valueOf(g.d(interfaceC5722h0)))));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit p(InterfaceC14916T interfaceC14916T, final double d10, final InterfaceC5722h0 interfaceC5722h0, zi.y1 AdsInputField) {
                Intrinsics.j(AdsInputField, "$this$AdsInputField");
                AdsInputField.d0(interfaceC14916T.getIcons().getTrailingIcon(), new Function0() { // from class: Pi.u9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.g.C0530g.q(d10, interfaceC5722h0);
                    }
                });
                AdsInputField.T(interfaceC14916T.getIcons().getLeadingIcon(), new Function0() { // from class: Pi.v9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W7.g.C0530g.r(interfaceC5722h0);
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
                    ComposerKt.U(2111311390, i11, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:792)");
                }
                String strValueOf = String.valueOf(g.d(this.f27241d));
                q1.f.QuantityInput quantityInput = Assemble.getInputFields().getDefault();
                Modifier modifier = Assemble.getInputFields().getDefault().getModifier();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                final double d10 = this.f27242e;
                final InterfaceC5722h0 interfaceC5722h0 = this.f27241d;
                Object objB = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB == companion2.a()) {
                    objB = new Function1() { // from class: Pi.q9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.C0530g.k(d10, interfaceC5722h0, (androidx.compose.ui.focus.E) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Modifier modifierThen = modifier.then(C5761d.a(companion, (Function1) objB));
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.d(), androidx.compose.ui.text.input.a.INSTANCE.b(), null, null, null, 115, null);
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f27238a) | composer.D(this.f27239b);
                final double d11 = this.f27242e;
                final androidx.compose.ui.platform.D1 d12 = this.f27238a;
                final InterfaceC5772o interfaceC5772o = this.f27239b;
                final InterfaceC5722h0 interfaceC5722h02 = this.f27241d;
                Object objB2 = composer.B();
                if (zV || objB2 == companion2.a()) {
                    objB2 = new Function1() { // from class: Pi.r9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.C0530g.l(d11, d12, interfaceC5772o, interfaceC5722h02, (InterfaceC5692y) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                q1.f.QuantityInput quantityInputX = quantityInput.x((65531 & 1) != 0 ? quantityInput.modifier : modifierThen, (65531 & 2) != 0 ? quantityInput.readOnly : false, (65531 & 4) != 0 ? quantityInput.state : null, (65531 & 8) != 0 ? quantityInput.textStyle : null, (65531 & 16) != 0 ? quantityInput.visualTransformation : null, (65531 & 32) != 0 ? quantityInput.keyboardOptions : keyboardOptions, (65531 & 64) != 0 ? quantityInput.keyboardActions : new C5693z((Function1) objB2, null, null, null, null, null, 62, null), (65531 & 128) != 0 ? quantityInput.singleLine : false, (65531 & 256) != 0 ? quantityInput.maxLines : 0, (65531 & 512) != 0 ? quantityInput.interactionSource : null, (65531 & 1024) != 0 ? quantityInput.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInput.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInput.signifier : null, (65531 & 8192) != 0 ? quantityInput.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInput.outerModifier : null, (65531 & 32768) != 0 ? quantityInput.shouldFillMaxWidth : false);
                LocalThemeScope localThemeScope = this.f27240c;
                composer.startReplaceGroup(5004770);
                final InterfaceC5722h0 interfaceC5722h03 = this.f27241d;
                Object objB3 = composer.B();
                if (objB3 == companion2.a()) {
                    objB3 = new Function1() { // from class: Pi.s9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.C0530g.o(interfaceC5722h03, (String) obj);
                        }
                    };
                    composer.t(objB3);
                }
                Function1 function1 = (Function1) objB3;
                composer.P();
                composer.startReplaceGroup(-1746271574);
                boolean z10 = (i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(Assemble));
                final double d13 = this.f27242e;
                final InterfaceC5722h0 interfaceC5722h04 = this.f27241d;
                Object objB4 = composer.B();
                if (z10 || objB4 == companion2.a()) {
                    objB4 = new Function1() { // from class: Pi.t9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return W7.g.C0530g.p(Assemble, d13, interfaceC5722h04, (zi.y1) obj);
                        }
                    };
                    composer.t(objB4);
                }
                composer.P();
                C18504m0.h(localThemeScope, strValueOf, quantityInputX, function1, null, "lb:", (Function1) objB4, composer, 199680, 8);
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
            public static final Unit q(double d10, InterfaceC5722h0 interfaceC5722h0) {
                if (g.d(interfaceC5722h0) < d10 && g.d(interfaceC5722h0) <= d10 - 0.25d) {
                    g.e(interfaceC5722h0, new BigDecimal(g.d(interfaceC5722h0) + 0.25d).setScale(2, RoundingMode.HALF_UP).doubleValue());
                } else if (g.d(interfaceC5722h0) < d10) {
                    g.e(interfaceC5722h0, d10);
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit r(InterfaceC5722h0 interfaceC5722h0) {
                if (g.d(interfaceC5722h0) > 0.0d && g.d(interfaceC5722h0) > 0.25d) {
                    g.e(interfaceC5722h0, new BigDecimal(g.d(interfaceC5722h0) - 0.25d).setScale(2, RoundingMode.HALF_UP).doubleValue());
                } else if (g.d(interfaceC5722h0) > 0.0d) {
                    g.e(interfaceC5722h0, 0.0d);
                }
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class h implements Function3<ji.j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f27243a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5722h0 f27244b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f27245a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ji.j1 f27246b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5722h0 f27247c;

                a(LocalThemeScope localThemeScope, ji.j1 j1Var, InterfaceC5722h0 interfaceC5722h0) {
                    this.f27245a = localThemeScope;
                    this.f27246b = j1Var;
                    this.f27247c = interfaceC5722h0;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-804729009, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuantityInput.kt:845)");
                    }
                    ri.j.h(this.f27245a, this.f27246b.getLabels().getEnabledLabel(), String.valueOf(g.d(this.f27247c)), null, composer, 0, 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            h(LocalThemeScope localThemeScope, InterfaceC5722h0 interfaceC5722h0) {
                this.f27243a = localThemeScope;
                this.f27244b = interfaceC5722h0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c() {
                return Unit.f142422a;
            }

            public final void b(ji.j1 Assemble, Composer composer, int i10) {
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
                LocalThemeScope localThemeScope = this.f27243a;
                q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Pi.w9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return W7.g.h.c();
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ni.E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(-804729009, true, new a(this.f27243a, Assemble, this.f27244b), composer, 54), composer, 3456);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ji.j1 j1Var, Composer composer, Integer num) {
                b(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        g(LocalThemeScope localThemeScope, androidx.compose.ui.platform.D1 d12, InterfaceC5772o interfaceC5772o) {
            this.f27209a = localThemeScope;
            this.f27210b = d12;
            this.f27211c = interfaceC5772o;
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
            InterfaceC5722h0 interfaceC5722h0 = (InterfaceC5722h0) objB;
            composer.P();
            LocalThemeScope localThemeScope = this.f27209a;
            androidx.compose.ui.platform.D1 d12 = this.f27210b;
            InterfaceC5772o interfaceC5772o = this.f27211c;
            Modifier.Companion companion = Modifier.INSTANCE;
            C5658d c5658d = C5658d.f48555a;
            C5658d.m mVarH = c5658d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion3.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            float f10 = 1;
            Modifier modifierH = C13439f.h(companion, H1.h.p(f10), localThemeScope.getAdsColors().getAdsColorUIBorder01().getColor(), null, 4, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.e(), companion2.l(), composer, 6);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH);
            Function0<InterfaceC5811g> function0A2 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyB, companion3.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            Ji.Q.e(localThemeScope, C14960s0.f140193a, ComposableLambdaKt.c(-463685467, true, new a(d12, interfaceC5772o, localThemeScope, interfaceC5722h0, 99.75d), composer, 54), composer, 432);
            float f11 = 8;
            C14802K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(f11)), composer, 6);
            Ji.Q.e(localThemeScope, C14951o.f139915a, ComposableLambdaKt.c(-1556889431, true, new b(localThemeScope), composer, 54), composer, 432);
            composer.v();
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f11)), composer, 6);
            Modifier modifierH2 = C13439f.h(companion, H1.h.p(f10), localThemeScope.getAdsColors().getAdsColorUIBorder01().getColor(), null, 4, null);
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5658d.e(), companion2.l(), composer, 6);
            int iA3 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierH2);
            Function0<InterfaceC5811g> function0A3 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A3);
            } else {
                composer.s();
            }
            Composer composerA3 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA3, measurePolicyB2, companion3.e());
            androidx.compose.runtime.D1.c(composerA3, interfaceC5742sR3, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            androidx.compose.runtime.D1.c(composerA3, modifierE3, companion3.f());
            Ji.Q.e(localThemeScope, C14962t0.f140230a, ComposableLambdaKt.c(956919964, true, new c(d12, interfaceC5772o, localThemeScope, interfaceC5722h0, 99.75d), composer, 54), composer, 432);
            C14802K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(f11)), composer, 6);
            Ji.Q.e(localThemeScope, C14959s.f140192a, ComposableLambdaKt.c(-1640069216, true, new d(localThemeScope), composer, 54), composer, 432);
            composer.v();
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f11)), composer, 6);
            Modifier modifierH3 = C13439f.h(companion, H1.h.p(f10), localThemeScope.getAdsColors().getAdsColorUIBorder01().getColor(), null, 4, null);
            MeasurePolicy measurePolicyB3 = androidx.compose.foundation.layout.G.b(c5658d.e(), companion2.l(), composer, 6);
            int iA4 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR4 = composer.r();
            Modifier modifierE4 = androidx.compose.ui.b.e(composer, modifierH3);
            Function0<InterfaceC5811g> function0A4 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A4);
            } else {
                composer.s();
            }
            Composer composerA4 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA4, measurePolicyB3, companion3.e());
            androidx.compose.runtime.D1.c(composerA4, interfaceC5742sR4, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B4 = companion3.b();
            if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                composerA4.t(Integer.valueOf(iA4));
                composerA4.n(Integer.valueOf(iA4), function2B4);
            }
            androidx.compose.runtime.D1.c(composerA4, modifierE4, companion3.f());
            Ji.Q.e(localThemeScope, ji.I0.f139670a, ComposableLambdaKt.c(1534115677, true, new e(d12, interfaceC5772o, localThemeScope, interfaceC5722h0, 99.75d), composer, 54), composer, 432);
            C14802K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(f11)), composer, 6);
            Ji.Q.e(localThemeScope, InterfaceC14971y.a.e.f140294a, ComposableLambdaKt.c(-1062873503, true, new f(localThemeScope, interfaceC5722h0), composer, 54), composer, 432);
            composer.v();
            C14802K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f11)), composer, 6);
            Modifier modifierH4 = C13439f.h(companion, H1.h.p(f10), localThemeScope.getAdsColors().getAdsColorUIBorder01().getColor(), null, 4, null);
            MeasurePolicy measurePolicyB4 = androidx.compose.foundation.layout.G.b(c5658d.e(), companion2.l(), composer, 6);
            int iA5 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR5 = composer.r();
            Modifier modifierE5 = androidx.compose.ui.b.e(composer, modifierH4);
            Function0<InterfaceC5811g> function0A5 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A5);
            } else {
                composer.s();
            }
            Composer composerA5 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA5, measurePolicyB4, companion3.e());
            androidx.compose.runtime.D1.c(composerA5, interfaceC5742sR5, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B5 = companion3.b();
            if (composerA5.getInserting() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                composerA5.t(Integer.valueOf(iA5));
                composerA5.n(Integer.valueOf(iA5), function2B5);
            }
            androidx.compose.runtime.D1.c(composerA5, modifierE5, companion3.f());
            Ji.Q.e(localThemeScope, ji.M0.f139690a, ComposableLambdaKt.c(2111311390, true, new C0530g(d12, interfaceC5772o, localThemeScope, interfaceC5722h0, 99.75d), composer, 54), composer, 432);
            C14802K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(f11)), composer, 6);
            Ji.Q.e(localThemeScope, C14900C.f139605a, ComposableLambdaKt.c(-485677790, true, new h(localThemeScope, interfaceC5722h0), composer, 54), composer, 432);
            composer.v();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double d(InterfaceC5722h0 interfaceC5722h0) {
            return interfaceC5722h0.d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(InterfaceC5722h0 interfaceC5722h0, double d10) {
            interfaceC5722h0.t(d10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class h implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f27248a;

        h(LocalThemeScope localThemeScope) {
            this.f27248a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1041771309, i10, -1, "com.meijer.mobile.androidacres.showcase.components.QuantityInputShowcase.Content.<anonymous>.<anonymous> (QuantityInput.kt:857)");
            }
            LocalThemeScope localThemeScope = this.f27248a;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion2.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            kotlin.N1.b("Max Limit is 6", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            C14802K.a(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, 0.0f, H1.h.p(8), 7, null), composer, 6);
            O7.b(localThemeScope, composer, 0);
            composer.v();
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

    public W7(l.t state) {
        Intrinsics.j(state, "state");
        this.state = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(W7 w72, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        w72.a(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    @Override // Ni.c
    public void a(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
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
            androidx.compose.ui.platform.D1 d12 = (androidx.compose.ui.platform.D1) composerStartRestartGroup.o(C5892t0.q());
            InterfaceC5772o interfaceC5772o = (InterfaceC5772o) composerStartRestartGroup.o(C5892t0.h());
            Modifier modifierG = d0.T.g(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), d0.T.c(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierG);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
            C14815g c14815g = C14815g.f139108a;
            int i12 = (i11 & 14) | 199680;
            Ri.b.b(localThemeScope, null, d("Large Rectangle"), "1.0", null, ComposableLambdaKt.c(1990715568, true, new a(localThemeScope, d12, interfaceC5772o), composerStartRestartGroup, 54), composerStartRestartGroup, i12, 9);
            Ri.b.b(localThemeScope, null, d("Small Rectangle"), "1.0", null, ComposableLambdaKt.c(1791974809, true, new b(localThemeScope, d12, interfaceC5772o), composerStartRestartGroup, 54), composerStartRestartGroup, i12, 9);
            Ri.b.b(localThemeScope, null, d("Large Circle"), "1.0", null, ComposableLambdaKt.c(2035511672, true, new c(localThemeScope, d12, interfaceC5772o), composerStartRestartGroup, 54), composerStartRestartGroup, i12, 9);
            Ri.b.b(localThemeScope, null, d("Small Circle"), "1.0", null, ComposableLambdaKt.c(-2015918761, true, new d(localThemeScope, d12, interfaceC5772o), composerStartRestartGroup, 54), composerStartRestartGroup, i12, 9);
            Ri.b.b(localThemeScope, null, d("lb Variant"), BuildConfig.VERSION_NAME, null, ComposableLambdaKt.c(-1772381898, true, new e(localThemeScope, d12, interfaceC5772o), composerStartRestartGroup, 54), composerStartRestartGroup, i12, 9);
            Ri.b.b(localThemeScope, null, d("Full Width PDP(New and deprecated versions)"), "1.0", null, ComposableLambdaKt.c(-1528845035, true, new f(localThemeScope, d12, interfaceC5772o), composerStartRestartGroup, 54), composerStartRestartGroup, i12, 9);
            Ri.b.b(localThemeScope, null, d("Height Comparisons"), "1.2", null, ComposableLambdaKt.c(-1285308172, true, new g(localThemeScope, d12, interfaceC5772o), composerStartRestartGroup, 54), composerStartRestartGroup, i12, 9);
            Ri.b.b(localThemeScope, null, d("Qty Input With Inline Notification"), BuildConfig.VERSION_NAME, null, ComposableLambdaKt.c(-1041771309, true, new h(localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, i12, 9);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Pi.P7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return W7.h(this.f26929a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    public String getName() {
        return "Quantity Input";
    }

    @Override // Ni.c
    /* renamed from: i, reason: from getter */
    public l.t getState() {
        return this.state;
    }
}
