package Lj;

import Ai.p1;
import Ai.y1;
import Ki.C;
import Ki.LocalThemeScope;
import Ki.Q;
import Lj.k;
import android.os.Handler;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5903d;
import androidx.compose.ui.focus.E;
import androidx.recyclerview.widget.RecyclerView;
import j0.InterfaceC14888I;
import ki.C15185o;
import ki.C15187p;
import ki.InterfaceC15150T;
import ki.InterfaceC15160b0;
import ki.a1;
import ki.j1;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.E0;
import qi.C16671b;
import r1.C16819m;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u001aÒ\u0001\u0010\u001c\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u000126\u0010\n\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t0\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u009a\u0001\u0010%\u001a\u00020\t2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u001e2\u0006\u0010\u000b\u001a\u00020\u00012\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\f26\u0010\n\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00042!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t0\u0015H\u0002¢\u0006\u0004\b%\u0010&\u001aj\u0010'\u001a\u00020\t2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u001e2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\f2!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t0\u0015H\u0002¢\u0006\u0004\b'\u0010(\u001ag\u0010.\u001a\u00020\t*\u00020)2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b.\u0010/\u001aU\u00104\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u00012\u0006\u00101\u001a\u00020\u00102\f\u00102\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0003¢\u0006\u0004\b4\u00105\u001a×\u0001\u00108\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000126\u0010\n\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u00106\u001a\u00020\u00162\f\u00103\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u00107\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b8\u00109¨\u0006;²\u0006\u000e\u0010:\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "maxValue", "quantity", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "newValue", "oldValue", "", "onQuantityChanged", "qtyIncrement", "", "stepperDebounceMillis", "Lkotlin/Function0;", "onCollapseQtyStepper", "", "increaseIconContentDescription", "decreaseIconContentDescription", "deleteIconContentDescription", "weightedItemsUoM", "Lkotlin/Function1;", "", "shouldShow", "showLimitReachedChanged", "useFullWidth", "Landroidx/compose/ui/Modifier;", "outerModifier", "k", "(LKi/M;DDLkotlin/jvm/functions/Function2;DJLkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/runtime/l0;", "itemQuantity", "Landroid/os/Handler;", "handler", "Ljava/lang/Runnable;", "runner", "qtyUpdateInterval", "B", "(Landroidx/compose/runtime/l0;DLandroid/os/Handler;Ljava/lang/Runnable;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "C", "(Landroidx/compose/runtime/l0;DDLandroid/os/Handler;Ljava/lang/Runnable;JLkotlin/jvm/functions/Function1;)V", "LAi/y1;", "Lki/T;", "assembly", "onQuantityIncremented", "onQuantityDecremented", "z", "(LAi/y1;Lki/T;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;D)V", "oldQuantity", "addIconContentDescription", "updateCurrentQuantity", "onExpandQtyStepper", "i", "(LKi/M;DDLjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "isStepperExpanded", "limitReachedText", "n", "(LKi/M;DLkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;DDJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "shouldShowNotification", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class k {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f19105a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19106b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f19107c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ double f19108d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ double f19109e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f19110f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f19111g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Lj.k$a$a, reason: collision with other inner class name */
        static final class C0336a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ double f19112a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f19113b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ j1 f19114c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ double f19115d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f19116e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f19117f;

            C0336a(double d10, LocalThemeScope localThemeScope, j1 j1Var, double d11, Function0<Unit> function0, Function0<Unit> function02) {
                this.f19112a = d10;
                this.f19113b = localThemeScope;
                this.f19114c = j1Var;
                this.f19115d = d11;
                this.f19116e = function0;
                this.f19117f = function02;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1479858777, i10, -1, "com.meijer.mobile.core.design.compose.widget.stepper.CollapsedStepperButton.<anonymous>.<anonymous> (QuantityStepper.kt:313)");
                }
                if (this.f19112a > 0.0d) {
                    composer.startReplaceGroup(1366506740);
                    si.j.h(this.f19113b, this.f19114c.getLabels().getEnabledLabel(), Bk.b.e(this.f19112a), null, composer, (q1.Label.f142335j << 3) | LocalThemeScope.f17314g, 4);
                    composer.P();
                } else {
                    composer.startReplaceGroup(1366678573);
                    C16671b.b(this.f19113b, this.f19114c.getIcons().getEnabledIcon(), C.a.C0287a.f16877e, null, composer, (C.a.C0287a.f16878f << 6) | LocalThemeScope.f17314g | (q1.h.DrawableIcon.f142322h << 3), 4);
                    composer.P();
                }
                if (this.f19115d != this.f19112a) {
                    this.f19116e.invoke();
                    this.f19117f.invoke();
                }
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

        a(LocalThemeScope localThemeScope, String str, Function0<Unit> function0, double d10, double d11, Function0<Unit> function02, Function0<Unit> function03) {
            this.f19105a = localThemeScope;
            this.f19106b = str;
            this.f19107c = function0;
            this.f19108d = d10;
            this.f19109e = d11;
            this.f19110f = function02;
            this.f19111g = function03;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(String str, r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.g0(semantics, str);
            return Unit.f143329a;
        }

        public final void c(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1621083526, i10, -1, "com.meijer.mobile.core.design.compose.widget.stepper.CollapsedStepperButton.<anonymous> (QuantityStepper.kt:303)");
            }
            LocalThemeScope localThemeScope = this.f19105a;
            q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
            Modifier modifier = Assemble.getButtons().getEnabledButton().getModifier();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f19106b);
            final String str = this.f19106b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Lj.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return k.a.d(str, (r1.u) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(enabledButton, false, null, null, null, null, null, null, C16819m.d(modifier, false, (Function1) objB, 1, null), false, null, 895, null);
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f19107c);
            final Function0<Unit> function0 = this.f19107c;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: Lj.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return k.a.e(function0);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            E0.b(localThemeScope, standardButtonY, (Function0) objB2, ComposableLambdaKt.c(-1479858777, true, new C0336a(this.f19108d, this.f19105a, Assemble, this.f19109e, this.f19110f, this.f19111g), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            c(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function0 function0) {
            function0.invoke();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<InterfaceC15150T, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ double f19118a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f19119b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ double f19120c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Handler f19121d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Runnable f19122e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f19123f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ double f19124g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Double, Double, Unit> f19125h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f19126i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Modifier f19127j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f19128k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Double> f19129l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f19130m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f19131n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f19132o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f19133p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f19134q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ long f19135r;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(InterfaceC5872l0 interfaceC5872l0, int i10, int i11) {
            interfaceC5872l0.setValue(Double.valueOf(i10));
            return Unit.f143329a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(double d10, Function1<? super Boolean, Unit> function1, double d11, Handler handler, Runnable runnable, Function0<Unit> function0, double d12, Function2<? super Double, ? super Double, Unit> function2, boolean z10, Modifier modifier, LocalThemeScope localThemeScope, InterfaceC5872l0<Double> interfaceC5872l0, String str, String str2, String str3, String str4, InterfaceC5872l0<Boolean> interfaceC5872l02, long j10) {
            this.f19118a = d10;
            this.f19119b = function1;
            this.f19120c = d11;
            this.f19121d = handler;
            this.f19122e = runnable;
            this.f19123f = function0;
            this.f19124g = d12;
            this.f19125h = function2;
            this.f19126i = z10;
            this.f19127j = modifier;
            this.f19128k = localThemeScope;
            this.f19129l = interfaceC5872l0;
            this.f19130m = str;
            this.f19131n = str2;
            this.f19132o = str3;
            this.f19133p = str4;
            this.f19134q = interfaceC5872l02;
            this.f19135r = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02, double d10, Function1 function1, double d11, Handler handler, Runnable runnable, long j10, Function0 function0, double d12, Function2 function2, E focusState) {
            Intrinsics.j(focusState, "focusState");
            if (((Boolean) interfaceC5872l0.getValue()).booleanValue() != focusState.a()) {
                interfaceC5872l0.setValue(Boolean.valueOf(focusState.a()));
                if (!focusState.a()) {
                    function0.invoke();
                    if (((Number) interfaceC5872l02.getValue()).doubleValue() != d12) {
                        function2.invoke(interfaceC5872l02.getValue(), Double.valueOf(d12));
                    }
                }
            } else if (((Number) interfaceC5872l02.getValue()).doubleValue() == 0.0d) {
                interfaceC5872l02.setValue(Double.valueOf(((Number) interfaceC5872l02.getValue()).doubleValue() + d10));
                function1.invoke(Boolean.valueOf(((Number) interfaceC5872l02.getValue()).doubleValue() >= d11));
                if (handler != null) {
                    handler.removeCallbacks(runnable);
                }
                if (handler != null) {
                    handler.postDelayed(runnable, j10);
                }
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(InterfaceC15150T interfaceC15150T, String str, String str2, String str3, final InterfaceC5872l0 interfaceC5872l0, final double d10, final double d11, final Handler handler, final Runnable runnable, final long j10, final Function1 function1, final Function2 function2, y1 InputField) {
            Intrinsics.j(InputField, "$this$InputField");
            k.z(InputField, interfaceC15150T, str, str2, str3, ((Number) interfaceC5872l0.getValue()).doubleValue(), d10, new Function0() { // from class: Lj.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k.b.r(interfaceC5872l0, d11, d10, handler, runnable, j10, function1);
                }
            }, new Function0() { // from class: Lj.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k.b.s(interfaceC5872l0, d10, handler, runnable, j10, function2, function1);
                }
            }, d11);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit u(InterfaceC15150T interfaceC15150T, String str, String str2, String str3, final InterfaceC5872l0 interfaceC5872l0, final double d10, final double d11, final Handler handler, final Runnable runnable, final long j10, final Function1 function1, final Function2 function2, y1 InputField) {
            Intrinsics.j(InputField, "$this$InputField");
            k.z(InputField, interfaceC15150T, str, str2, str3, ((Number) interfaceC5872l0.getValue()).doubleValue(), d10, new Function0() { // from class: Lj.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k.b.v(interfaceC5872l0, d11, d10, handler, runnable, j10, function1);
                }
            }, new Function0() { // from class: Lj.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k.b.w(interfaceC5872l0, d10, handler, runnable, j10, function2, function1);
                }
            }, d11);
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15150T interfaceC15150T, Composer composer, Integer num) {
            o(interfaceC15150T, composer, num.intValue());
            return Unit.f143329a;
        }

        public final void o(final InterfaceC15150T Assemble, Composer composer, int i10) {
            Function2<Double, Double, Unit> function2;
            Composer composer2;
            int i11;
            int i12;
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(711527340, i10, -1, "com.meijer.mobile.core.design.compose.widget.stepper.QuantityInput.<anonymous> (QuantityStepper.kt:87)");
            }
            q1.f.QuantityInput quantityInput = Assemble.getInputFields().getDefault();
            Modifier modifier = Assemble.getInputFields().getDefault().getModifier();
            composer.startReplaceGroup(-1224400529);
            boolean zG = composer.g(this.f19118a) | composer.V(this.f19119b) | composer.g(this.f19120c) | composer.D(this.f19121d) | composer.D(this.f19122e) | composer.V(this.f19123f) | composer.g(this.f19124g) | composer.V(this.f19125h);
            final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f19134q;
            final InterfaceC5872l0<Double> interfaceC5872l02 = this.f19129l;
            final double d10 = this.f19118a;
            final Function1<Boolean, Unit> function1 = this.f19119b;
            final double d11 = this.f19120c;
            final Handler handler = this.f19121d;
            final Runnable runnable = this.f19122e;
            final long j10 = this.f19135r;
            final Function0<Unit> function0 = this.f19123f;
            final double d12 = this.f19124g;
            final Function2<Double, Double, Unit> function22 = this.f19125h;
            Object objB = composer.B();
            if (zG || objB == Composer.INSTANCE.a()) {
                Function1 function12 = new Function1() { // from class: Lj.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return k.b.p(interfaceC5872l0, interfaceC5872l02, d10, function1, d11, handler, runnable, j10, function0, d12, function22, (E) obj);
                    }
                };
                composer.t(function12);
                objB = function12;
            }
            composer.P();
            q1.f.QuantityInput quantityInputX = quantityInput.x((65531 & 1) != 0 ? quantityInput.modifier : C5903d.a(modifier, (Function1) objB).then(this.f19126i ? J.h(Modifier.INSTANCE, 0.0f, 1, null) : Modifier.INSTANCE), (65531 & 2) != 0 ? quantityInput.readOnly : false, (65531 & 4) != 0 ? quantityInput.state : null, (65531 & 8) != 0 ? quantityInput.textStyle : null, (65531 & 16) != 0 ? quantityInput.visualTransformation : null, (65531 & 32) != 0 ? quantityInput.keyboardOptions : null, (65531 & 64) != 0 ? quantityInput.keyboardActions : null, (65531 & 128) != 0 ? quantityInput.singleLine : false, (65531 & 256) != 0 ? quantityInput.maxLines : 0, (65531 & 512) != 0 ? quantityInput.interactionSource : null, (65531 & 1024) != 0 ? quantityInput.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInput.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInput.signifier : null, (65531 & 8192) != 0 ? quantityInput.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInput.outerModifier : this.f19127j, (65531 & 32768) != 0 ? quantityInput.shouldFillMaxWidth : false);
            if (Bk.b.d(this.f19118a)) {
                composer.startReplaceGroup(1449417161);
                LocalThemeScope localThemeScope = this.f19128k;
                int iDoubleValue = (int) this.f19129l.getValue().doubleValue();
                int i13 = (int) this.f19120c;
                composer.startReplaceGroup(5004770);
                final InterfaceC5872l0<Double> interfaceC5872l03 = this.f19129l;
                Object objB2 = composer.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB2 == companion.a()) {
                    objB2 = new Function2() { // from class: Lj.m
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k.b.t(interfaceC5872l03, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                        }
                    };
                    composer.t(objB2);
                }
                Function2 function23 = (Function2) objB2;
                composer.P();
                composer.startReplaceGroup(-1224400529);
                boolean zD = composer.D(Assemble) | composer.V(this.f19130m) | composer.V(this.f19131n) | composer.V(this.f19132o) | composer.g(this.f19118a) | composer.g(this.f19120c) | composer.D(this.f19121d) | composer.D(this.f19122e) | composer.V(this.f19119b) | composer.V(this.f19125h);
                final String str = this.f19130m;
                final String str2 = this.f19131n;
                final String str3 = this.f19132o;
                final InterfaceC5872l0<Double> interfaceC5872l04 = this.f19129l;
                final double d13 = this.f19118a;
                final double d14 = this.f19120c;
                final Handler handler2 = this.f19121d;
                final Runnable runnable2 = this.f19122e;
                final long j11 = this.f19135r;
                final Function1<Boolean, Unit> function13 = this.f19119b;
                final Function2<Double, Double, Unit> function24 = this.f19125h;
                Object objB3 = composer.B();
                if (zD || objB3 == companion.a()) {
                    composer2 = composer;
                    i11 = i13;
                    i12 = iDoubleValue;
                    objB3 = new Function1() { // from class: Lj.n
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return k.b.u(Assemble, str, str2, str3, interfaceC5872l04, d13, d14, handler2, runnable2, j11, function13, function24, (y1) obj);
                        }
                    };
                    composer2.t(objB3);
                } else {
                    composer2 = composer;
                    i11 = i13;
                    i12 = iDoubleValue;
                }
                composer2.P();
                p1.h(localThemeScope, i12, i11, quantityInputX, function23, null, (Function1) objB3, composer2, LocalThemeScope.f17314g | 24576 | (q1.f.QuantityInput.f142263q << 9), 16);
                composer2.P();
            } else {
                composer.startReplaceGroup(1451341238);
                double dDoubleValue = this.f19129l.getValue().doubleValue();
                LocalThemeScope localThemeScope2 = this.f19128k;
                double d15 = this.f19120c;
                composer.startReplaceGroup(5004770);
                final InterfaceC5872l0<Double> interfaceC5872l05 = this.f19129l;
                Object objB4 = composer.B();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (objB4 == companion2.a()) {
                    objB4 = new Function2() { // from class: Lj.o
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return k.b.x(interfaceC5872l05, ((Double) obj).doubleValue(), ((Double) obj2).doubleValue());
                        }
                    };
                    composer.t(objB4);
                }
                Function2 function25 = (Function2) objB4;
                composer.P();
                String str4 = this.f19133p;
                composer.startReplaceGroup(-1224400529);
                boolean zD2 = composer.D(Assemble) | composer.V(this.f19130m) | composer.V(this.f19131n) | composer.V(this.f19132o) | composer.g(this.f19118a) | composer.g(this.f19120c) | composer.D(this.f19121d) | composer.D(this.f19122e) | composer.V(this.f19119b) | composer.V(this.f19125h);
                final String str5 = this.f19130m;
                final String str6 = this.f19131n;
                final String str7 = this.f19132o;
                final InterfaceC5872l0<Double> interfaceC5872l06 = this.f19129l;
                final double d16 = this.f19118a;
                final double d17 = this.f19120c;
                final Handler handler3 = this.f19121d;
                final Runnable runnable3 = this.f19122e;
                final long j12 = this.f19135r;
                final Function1<Boolean, Unit> function14 = this.f19119b;
                Function2<Double, Double, Unit> function26 = this.f19125h;
                Object objB5 = composer.B();
                if (zD2) {
                    function2 = function26;
                } else {
                    function2 = function26;
                    if (objB5 == companion2.a()) {
                    }
                    composer.P();
                    p1.g(localThemeScope2, dDoubleValue, d15, quantityInputX, function25, str4, (Function1) objB5, composer, LocalThemeScope.f17314g | 24576 | (q1.f.QuantityInput.f142263q << 9), 0);
                    composer.P();
                }
                final Function2<Double, Double, Unit> function27 = function2;
                objB5 = new Function1() { // from class: Lj.p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return k.b.q(Assemble, str5, str6, str7, interfaceC5872l06, d16, d17, handler3, runnable3, j12, function14, function27, (y1) obj);
                    }
                };
                composer.t(objB5);
                composer.P();
                p1.g(localThemeScope2, dDoubleValue, d15, quantityInputX, function25, str4, (Function1) objB5, composer, LocalThemeScope.f17314g | 24576 | (q1.f.QuantityInput.f142263q << 9), 0);
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(InterfaceC5872l0 interfaceC5872l0, double d10, double d11, Handler handler, Runnable runnable, long j10, Function1 function1) {
            k.C(interfaceC5872l0, d10, d11, handler, runnable, j10, function1);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(InterfaceC5872l0 interfaceC5872l0, double d10, Handler handler, Runnable runnable, long j10, Function2 function2, Function1 function1) {
            k.B(interfaceC5872l0, d10, handler, runnable, j10, function2, function1);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit v(InterfaceC5872l0 interfaceC5872l0, double d10, double d11, Handler handler, Runnable runnable, long j10, Function1 function1) {
            k.C(interfaceC5872l0, d10, d11, handler, runnable, j10, function1);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit w(InterfaceC5872l0 interfaceC5872l0, double d10, Handler handler, Runnable runnable, long j10, Function2 function2, Function1 function1) {
            k.B(interfaceC5872l0, d10, handler, runnable, j10, function2, function1);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit x(InterfaceC5872l0 interfaceC5872l0, double d10, double d11) {
            interfaceC5872l0.setValue(Double.valueOf(d10));
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f19136a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ double f19137b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ double f19138c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<Double, Double, Unit> f19139d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ double f19140e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f19141f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f19142g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f19143h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f19144i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f19145j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f19146k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Double> f19147l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f19148m;

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, double d10, double d11, Function2<? super Double, ? super Double, Unit> function2, double d12, long j10, Function0<Unit> function0, String str, String str2, String str3, String str4, InterfaceC5872l0<Double> interfaceC5872l0, InterfaceC5872l0<Boolean> interfaceC5872l02) {
            this.f19136a = localThemeScope;
            this.f19137b = d10;
            this.f19138c = d11;
            this.f19139d = function2;
            this.f19140e = d12;
            this.f19141f = j10;
            this.f19142g = function0;
            this.f19143h = str;
            this.f19144i = str2;
            this.f19145j = str3;
            this.f19146k = str4;
            this.f19147l = interfaceC5872l0;
            this.f19148m = interfaceC5872l02;
        }

        public final void c(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1251251765, i10, -1, "com.meijer.mobile.core.design.compose.widget.stepper.QuantityStepper.<anonymous>.<anonymous> (QuantityStepper.kt:395)");
            }
            LocalThemeScope localThemeScope = this.f19136a;
            double d10 = this.f19137b;
            double d11 = this.f19138c;
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(this.f19139d);
            final InterfaceC5872l0<Double> interfaceC5872l0 = this.f19147l;
            final Function2<Double, Double, Unit> function2 = this.f19139d;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function2() { // from class: Lj.u
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return k.c.d(interfaceC5872l0, function2, ((Double) obj).doubleValue(), ((Double) obj2).doubleValue());
                    }
                };
                composer.t(objB);
            }
            Function2 function22 = (Function2) objB;
            composer.P();
            double d12 = this.f19140e;
            long j10 = this.f19141f;
            Function0<Unit> function0 = this.f19142g;
            String str = this.f19143h;
            String str2 = this.f19144i;
            String str3 = this.f19145j;
            String str4 = this.f19146k;
            composer.startReplaceGroup(5004770);
            final InterfaceC5872l0<Boolean> interfaceC5872l02 = this.f19148m;
            Object objB2 = composer.B();
            if (objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: Lj.v
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return k.c.e(interfaceC5872l02, ((Boolean) obj).booleanValue());
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            k.k(localThemeScope, d10, d11, function22, d12, j10, function0, str, str2, str3, str4, (Function1) objB2, false, null, composer, LocalThemeScope.f17314g, 48, 6144);
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
        public static final Unit d(InterfaceC5872l0 interfaceC5872l0, Function2 function2, double d10, double d11) {
            interfaceC5872l0.setValue(Double.valueOf(d10));
            function2.invoke(Double.valueOf(d10), Double.valueOf(d11));
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(InterfaceC5872l0 interfaceC5872l0, boolean z10) {
            k.p(interfaceC5872l0, z10);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f19149a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19150b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<InterfaceC15160b0, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f19151a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f19152b;

            a(LocalThemeScope localThemeScope, String str) {
                this.f19151a = localThemeScope;
                this.f19152b = str;
            }

            public final void a(InterfaceC15160b0 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(784591613, i10, -1, "com.meijer.mobile.core.design.compose.widget.stepper.QuantityStepper.<anonymous>.<anonymous>.<anonymous> (QuantityStepper.kt:416)");
                }
                Di.j.i(this.f19151a, null, this.f19152b, null, Assemble.getToastVariant().getInformational(), null, composer, LocalThemeScope.f17314g | (q1.m.Inline.f142376h << 12), 21);
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

        d(LocalThemeScope localThemeScope, String str) {
            this.f19149a = localThemeScope;
            this.f19150b = str;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(169538538, i10, -1, "com.meijer.mobile.core.design.compose.widget.stepper.QuantityStepper.<anonymous>.<anonymous> (QuantityStepper.kt:415)");
            }
            LocalThemeScope localThemeScope = this.f19149a;
            Q.e(localThemeScope, a1.f142015a, ComposableLambdaKt.c(784591613, true, new a(localThemeScope, this.f19150b), composer, 54), composer, LocalThemeScope.f17314g | 384 | (a1.f142016b << 3));
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011c  */
    @android.annotation.SuppressLint({"ModifierParameter"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final Ki.LocalThemeScope r30, final double r31, final double r33, final kotlin.jvm.functions.Function2<? super java.lang.Double, ? super java.lang.Double, kotlin.Unit> r35, final double r36, long r38, final kotlin.jvm.functions.Function0<kotlin.Unit> r40, final java.lang.String r41, final java.lang.String r42, final java.lang.String r43, final java.lang.String r44, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r45, boolean r46, androidx.compose.ui.Modifier r47, androidx.compose.runtime.Composer r48, final int r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lj.k.k(Ki.M, double, double, kotlin.jvm.functions.Function2, double, long, kotlin.jvm.functions.Function0, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:293:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ModifierParameter"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(final Ki.LocalThemeScope r35, final double r36, final kotlin.jvm.functions.Function2<? super java.lang.Double, ? super java.lang.Double, kotlin.Unit> r38, final boolean r39, final kotlin.jvm.functions.Function0<kotlin.Unit> r40, final kotlin.jvm.functions.Function0<kotlin.Unit> r41, final double r42, final double r44, long r46, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, boolean r53, androidx.compose.ui.Modifier r54, androidx.compose.runtime.Composer r55, final int r56, final int r57, final int r58) {
        /*
            Method dump skipped, instructions count: 1489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lj.k.n(Ki.M, double, kotlin.jvm.functions.Function2, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, double, double, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(LocalThemeScope localThemeScope, double d10, Function2 function2, boolean z10, Function0 function0, Function0 function02, double d11, double d12, long j10, String str, String str2, String str3, String str4, String str5, boolean z11, Modifier modifier, int i10, int i11, int i12, Composer composer, int i13) {
        n(localThemeScope, d10, function2, z10, function0, function02, d11, d12, j10, str, str2, str3, str4, str5, z11, modifier, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f143329a;
    }

    private static final void i(final LocalThemeScope localThemeScope, final double d10, final double d11, final String str, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, Composer composer, final int i10) {
        int i11;
        String str2;
        Function0<Unit> function04;
        Function0<Unit> function05;
        Composer composerStartRestartGroup = composer.startRestartGroup(817766166);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.g(d10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.g(d11) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            str2 = str;
            i11 |= composerStartRestartGroup.V(str2) ? RecyclerView.m.FLAG_MOVED : 1024;
        } else {
            str2 = str;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.D(function0) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            function04 = function02;
            i11 |= composerStartRestartGroup.D(function04) ? 131072 : 65536;
        } else {
            function04 = function02;
        }
        if ((1572864 & i10) == 0) {
            function05 = function03;
            i11 |= composerStartRestartGroup.D(function05) ? 1048576 : 524288;
        } else {
            function05 = function03;
        }
        int i12 = i11;
        if ((599187 & i12) == 599186 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(817766166, i12, -1, "com.meijer.mobile.core.design.compose.widget.stepper.CollapsedStepperButton (QuantityStepper.kt:301)");
            }
            Q.e(localThemeScope, d10 > 0.0d ? C15187p.f142174a : C15185o.f142170a, ComposableLambdaKt.c(-1621083526, true, new a(localThemeScope, str2, function04, d10, d11, function05, function0), composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f17314g | 384 | (i12 & 14));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Lj.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return k.j(localThemeScope, d10, d11, str, function0, function02, function03, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, double d10, double d11, String str, Function0 function0, Function0 function02, Function0 function03, int i10, Composer composer, int i11) {
        i(localThemeScope, d10, d11, str, function0, function02, function03, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(LocalThemeScope localThemeScope, double d10, double d11, Function2 function2, double d12, long j10, Function0 function0, String str, String str2, String str3, String str4, Function1 function1, boolean z10, Modifier modifier, int i10, int i11, int i12, Composer composer, int i13) {
        k(localThemeScope, d10, d11, function2, d12, j10, function0, str, str2, str3, str4, function1, z10, modifier, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(y1 y1Var, InterfaceC15150T interfaceC15150T, String str, String str2, String str3, double d10, double d11, Function0<Unit> function0, final Function0<Unit> function02, double d12) {
        if (d10 >= d12) {
            y1Var.m0(q1.h.DrawableIcon.y(interfaceC15150T.getIcons().getDisabledTrailingIcon(), null, str, null, null, 0.0f, null, null, 125, null), null);
        } else {
            y1Var.m0(q1.h.DrawableIcon.y(interfaceC15150T.getIcons().getTrailingIcon(), null, str, null, null, 0.0f, null, null, 125, null), function0);
        }
        y1Var.N(d10 == d11 ? new q1.h.DrawableIcon(C.a.C3925k.f16891e, str3, null, null, 0.0f, null, null, 124, null) : q1.h.DrawableIcon.y(interfaceC15150T.getIcons().getLeadingIcon(), null, str2, null, null, 0.0f, null, null, 125, null), new Function0() { // from class: Lj.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k.A(function02);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(InterfaceC5872l0<Double> interfaceC5872l0, double d10, Handler handler, Runnable runnable, long j10, Function2<? super Double, ? super Double, Unit> function2, Function1<? super Boolean, Unit> function1) {
        if (interfaceC5872l0.getValue().doubleValue() > 0.0d) {
            interfaceC5872l0.setValue(Double.valueOf(interfaceC5872l0.getValue().doubleValue() - d10));
        }
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
        if (handler != null) {
            handler.postDelayed(runnable, j10);
        }
        function1.invoke(Boolean.FALSE);
        if (interfaceC5872l0.getValue().doubleValue() == 0.0d) {
            if (handler != null) {
                handler.removeCallbacks(runnable);
            }
            function2.invoke(interfaceC5872l0.getValue(), interfaceC5872l0.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(InterfaceC5872l0<Double> interfaceC5872l0, double d10, double d11, Handler handler, Runnable runnable, long j10, Function1<? super Boolean, Unit> function1) {
        boolean z10;
        if (interfaceC5872l0.getValue().doubleValue() < d10) {
            interfaceC5872l0.setValue(Double.valueOf(interfaceC5872l0.getValue().doubleValue() + d11));
        }
        if (interfaceC5872l0.getValue().doubleValue() >= d10) {
            z10 = true;
        } else {
            z10 = false;
        }
        function1.invoke(Boolean.valueOf(z10));
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
        if (handler != null) {
            handler.postDelayed(runnable, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(InterfaceC5872l0 interfaceC5872l0, double d10, Function2 function2) {
        if (((Number) interfaceC5872l0.getValue()).doubleValue() == d10) {
            return;
        }
        function2.invoke(interfaceC5872l0.getValue(), Double.valueOf(d10));
    }

    private static final boolean o(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(InterfaceC5872l0 interfaceC5872l0, double d10) {
        interfaceC5872l0.setValue(Double.valueOf(d10));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(InterfaceC5872l0 interfaceC5872l0, Function2 function2, double d10, double d11) {
        interfaceC5872l0.setValue(Double.valueOf(d10));
        function2.invoke(Double.valueOf(d10), Double.valueOf(d11));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(InterfaceC5872l0 interfaceC5872l0, boolean z10) {
        p(interfaceC5872l0, z10);
        return Unit.f143329a;
    }
}
