package Cq;

import Cq.C3062t;
import Ji.C;
import Ji.LocalThemeScope;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.runtime.C5702c1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5726j0;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.C5761d;
import androidx.compose.ui.semantics.Role;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13439f;
import d0.InterfaceC13428B;
import ji.InterfaceC14916T;
import ji.M0;
import ji.q1;
import kotlin.C17916Y0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16193g;
import qv.InterfaceC16622O;
import r0.C16692i;
import zi.p1;
import zi.y1;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ai\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00032\u0006\u0010\n\u001a\u00020\t2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00070\u0003H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a>\u0010\u0010\u001a\u00020\u0007*\u00020\u00002!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00070\u00032\u0006\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0099\u0001\u0010\u0017\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00070\u00032!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00032\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014H\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a²\u0006\u000e\u0010\u0012\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "", "initialQuantity", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newValue", "", "onQuantityChanged", "", "isStepperVisible", "isVisible", "onStepperVisibilityChanged", "o", "(LJi/M;ILkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "quantity", "h", "(LJi/M;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)V", "updatedQuantity", "onQuantityInputChanged", "Lkotlin/Function0;", "increaseQuantity", "decreaseQuantity", "k", "(LJi/M;IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "isFocused", "shoppinglist_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Cq.t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C3062t {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Cq.t$a */
    static final class a implements Function3<InterfaceC14916T, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f4815a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f4816b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f4817c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f4818d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f4819e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f4820f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f4821g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f4822h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f4823i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f4824j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f4825k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f4826l;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(int i10, Function0 function0, Function1 function1) {
            if (i10 > 1) {
                function0.invoke();
            } else {
                function1.invoke(0);
            }
            return Unit.f142422a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, int i10, int i11, Function1<? super Boolean, Unit> function1, int i12, Function1<? super Integer, Unit> function12, Function1<? super Integer, Unit> function13, String str, Function0<Unit> function0, String str2, Function0<Unit> function02, InterfaceC5730l0<Boolean> interfaceC5730l0) {
            this.f4815a = localThemeScope;
            this.f4816b = i10;
            this.f4817c = i11;
            this.f4818d = function1;
            this.f4819e = i12;
            this.f4820f = function12;
            this.f4821g = function13;
            this.f4822h = str;
            this.f4823i = function0;
            this.f4824j = str2;
            this.f4825k = function02;
            this.f4826l = interfaceC5730l0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(Function1 function1, int i10, int i11, Function1 function12, InterfaceC5730l0 interfaceC5730l0, androidx.compose.ui.focus.E focusState) {
            Intrinsics.j(focusState, "focusState");
            if (C3062t.l(interfaceC5730l0) != focusState.a()) {
                C3062t.m(interfaceC5730l0, focusState.a());
                if (!focusState.a()) {
                    function1.invoke(Boolean.FALSE);
                    if (i10 != i11) {
                        function12.invoke(Integer.valueOf(i10));
                    }
                }
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC14916T interfaceC14916T, String str, final int i10, String str2, final int i11, final Function0 function0, final Function0 function02, final Function1 function1, y1 InputField) {
            Intrinsics.j(InputField, "$this$InputField");
            InputField.d0(q1.h.DrawableIcon.y(interfaceC14916T.getIcons().getTrailingIcon(), null, str, null, null, 0.0f, null, null, 125, null), new Function0() { // from class: Cq.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3062t.a.o(i10, i11, function0);
                }
            });
            InputField.T(i10 > 1 ? q1.h.DrawableIcon.y(interfaceC14916T.getIcons().getLeadingIcon(), null, str2, null, null, 0.0f, null, null, 125, null) : new q1.h.DrawableIcon(C.a.C3839k.f15347e, null, null, null, 0.0f, null, null, 126, null), new Function0() { // from class: Cq.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3062t.a.p(i10, function02, function1);
                }
            });
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(int i10, int i11, Function0 function0) {
            if (i10 < i11) {
                function0.invoke();
            }
            return Unit.f142422a;
        }

        public final void f(final InterfaceC14916T Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1273376968, i10, -1, "com.meijer.mobile.shoppinglist.compose.ExpandedQuantityStepper.<anonymous> (QuantityStepper.kt:154)");
            }
            LocalThemeScope localThemeScope = this.f4815a;
            int i11 = this.f4816b;
            int i12 = this.f4817c;
            q1.f.QuantityInput quantityInput = Assemble.getInputFields().getDefault();
            Modifier modifier = Assemble.getInputFields().getDefault().getModifier();
            composer.startReplaceGroup(-1224400529);
            boolean zV = composer.V(this.f4818d) | composer.d(this.f4816b) | composer.d(this.f4819e) | composer.V(this.f4820f);
            final Function1<Boolean, Unit> function1 = this.f4818d;
            final int i13 = this.f4816b;
            final int i14 = this.f4819e;
            final Function1<Integer, Unit> function12 = this.f4820f;
            final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f4826l;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Cq.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C3062t.a.g(function1, i13, i14, function12, interfaceC5730l0, (androidx.compose.ui.focus.E) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.f.QuantityInput quantityInputX = quantityInput.x((65531 & 1) != 0 ? quantityInput.modifier : C5761d.a(modifier, (Function1) objB), (65531 & 2) != 0 ? quantityInput.readOnly : false, (65531 & 4) != 0 ? quantityInput.state : null, (65531 & 8) != 0 ? quantityInput.textStyle : null, (65531 & 16) != 0 ? quantityInput.visualTransformation : null, (65531 & 32) != 0 ? quantityInput.keyboardOptions : null, (65531 & 64) != 0 ? quantityInput.keyboardActions : null, (65531 & 128) != 0 ? quantityInput.singleLine : false, (65531 & 256) != 0 ? quantityInput.maxLines : 0, (65531 & 512) != 0 ? quantityInput.interactionSource : null, (65531 & 1024) != 0 ? quantityInput.shape : null, (65531 & RecyclerView.m.FLAG_MOVED) != 0 ? quantityInput.colors : null, (65531 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? quantityInput.signifier : null, (65531 & 8192) != 0 ? quantityInput.internalButtonAssembly : null, (65531 & 16384) != 0 ? quantityInput.outerModifier : null, (65531 & 32768) != 0 ? quantityInput.shouldFillMaxWidth : false);
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f4821g);
            final Function1<Integer, Unit> function13 = this.f4821g;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function2() { // from class: Cq.p
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return C3062t.a.k(function13, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                    }
                };
                composer.t(objB2);
            }
            Function2 function2 = (Function2) objB2;
            composer.P();
            composer.startReplaceGroup(-1224400529);
            boolean zD = composer.D(Assemble) | composer.V(this.f4822h) | composer.d(this.f4816b) | composer.V(this.f4823i) | composer.V(this.f4824j) | composer.V(this.f4825k) | composer.V(this.f4820f);
            final String str = this.f4822h;
            final int i15 = this.f4816b;
            final String str2 = this.f4824j;
            final int i16 = this.f4817c;
            final Function0<Unit> function0 = this.f4823i;
            final Function0<Unit> function02 = this.f4825k;
            final Function1<Integer, Unit> function14 = this.f4820f;
            Object objB3 = composer.B();
            if (zD || objB3 == Composer.INSTANCE.a()) {
                Function1 function15 = new Function1() { // from class: Cq.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C3062t.a.l(Assemble, str, i15, str2, i16, function0, function02, function14, (y1) obj);
                    }
                };
                composer.t(function15);
                objB3 = function15;
            }
            composer.P();
            p1.h(localThemeScope, i11, i12, quantityInputX, function2, null, (Function1) objB3, composer, LocalThemeScope.f15770g | 384 | (q1.f.QuantityInput.f140008q << 9), 16);
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
        public static final Unit k(Function1 function1, int i10, int i11) {
            function1.invoke(Integer.valueOf(i10));
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.compose.QuantityStepperKt$QuantityStepper$1$1", f = "QuantityStepper.kt", l = {73}, m = "invokeSuspend")
    /* renamed from: Cq.t$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f4827a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f4828b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f4829c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super Boolean, Unit> function1, boolean z10, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f4828b = function1;
            this.f4829c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f4828b, this.f4829c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f4827a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                this.f4828b.invoke(Boxing.a(this.f4829c));
                if (this.f4829c) {
                    this.f4827a = 1;
                    if (qv.Z.b(5000L, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
            this.f4828b.invoke(Boxing.a(false));
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shoppinglist.compose.QuantityStepperKt$QuantityStepper$2$1", f = "QuantityStepper.kt", l = {BinsView.LABEL_WIDTH_DP}, m = "invokeSuspend")
    /* renamed from: Cq.t$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f4830a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f4831b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f4832c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f4833d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f4834e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5726j0 f4835f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(boolean z10, Function1<? super Boolean, Unit> function1, int i10, Function1<? super Integer, Unit> function12, InterfaceC5726j0 interfaceC5726j0, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f4831b = z10;
            this.f4832c = function1;
            this.f4833d = i10;
            this.f4834e = function12;
            this.f4835f = interfaceC5726j0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f4831b, this.f4832c, this.f4833d, this.f4834e, this.f4835f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r3.f4830a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.b(r4)
                goto L29
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.ResultKt.b(r4)
                boolean r4 = r3.f4831b
                if (r4 == 0) goto L33
                r3.f4830a = r2
                r1 = 5000(0x1388, double:2.4703E-320)
                java.lang.Object r4 = qv.Z.b(r1, r3)
                if (r4 != r0) goto L29
                return r0
            L29:
                kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r4 = r3.f4832c
                r0 = 0
                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.a(r0)
                r4.invoke(r0)
            L33:
                int r4 = r3.f4833d
                androidx.compose.runtime.j0 r0 = r3.f4835f
                int r0 = Cq.C3062t.x(r0)
                if (r4 == r0) goto L4c
                kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> r4 = r3.f4834e
                androidx.compose.runtime.j0 r0 = r3.f4835f
                int r0 = Cq.C3062t.x(r0)
                java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.d(r0)
                r4.invoke(r0)
            L4c:
                kotlin.Unit r4 = kotlin.Unit.f142422a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: Cq.C3062t.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private static final void h(final LocalThemeScope localThemeScope, final Function1<? super Boolean, Unit> function1, final int i10, Composer composer, final int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(634643770);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= composerStartRestartGroup.D(function1) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= composerStartRestartGroup.d(i10) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(634643770, i12, -1, "com.meijer.mobile.shoppinglist.compose.CollapsedQuantityStepper (QuantityStepper.kt:108)");
            }
            Ji.I eight = localThemeScope.getAdsTypography().getHeadings().getEight();
            Ji.T adsColorText03 = localThemeScope.getAdsColors().getAdsColorText03();
            int iA = F1.j.INSTANCE.a();
            Modifier modifierJ = androidx.compose.foundation.layout.D.j(C13439f.g(androidx.compose.foundation.layout.J.y(Modifier.INSTANCE, localThemeScope.getAdsSpacing().getEight().getDp(), 0.0f, 0.0f, 0.0f, 14, null), H1.h.p(1), localThemeScope.getAdsColors().getAdsColorText03().getColor(), C16692i.c(localThemeScope.getAdsSpacing().getTwo().getDp())), H1.h.p(0), H1.h.p(7));
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = h0.k.a();
                composerStartRestartGroup.t(objB);
            }
            h0.l lVar = (h0.l) objB;
            composerStartRestartGroup.P();
            InterfaceC13428B interfaceC13428BF = C17916Y0.f(true, localThemeScope.getAdsSpacing().getTwelve().getDp(), 0L, 4, null);
            Role roleJ = Role.j(Role.INSTANCE.a());
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z10 = (i12 & 112) == 32;
            Object objB2 = composerStartRestartGroup.B();
            if (z10 || objB2 == companion.a()) {
                objB2 = new Function0() { // from class: Cq.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C3062t.i(function1);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            ri.j.h(localThemeScope, new q1.Label(ClickableKt.c(modifierJ, lVar, interfaceC13428BF, false, null, roleJ, (Function0) objB2, 12, null), adsColorText03, null, F1.j.h(iA), 0, false, 0, eight, null, 372, null), String.valueOf(i10), null, composerStartRestartGroup, (q1.Label.f140080j << 3) | (i12 & 14) | LocalThemeScope.f15770g, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Cq.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C3062t.j(localThemeScope, function1, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(Function1 function1) {
        function1.invoke(Boolean.TRUE);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, Function1 function1, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, function1, i10, composer, J0.a(i11 | 1));
        return Unit.f142422a;
    }

    private static final void k(final LocalThemeScope localThemeScope, final int i10, final int i11, final Function1<? super Boolean, Unit> function1, final Function1<? super Integer, Unit> function12, final Function1<? super Integer, Unit> function13, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i12) {
        int i13;
        int i14;
        Function1<? super Boolean, Unit> function14;
        Function1<? super Integer, Unit> function15;
        Function0<Unit> function03;
        Composer composerStartRestartGroup = composer.startRestartGroup(1807832993);
        if ((i12 & 6) == 0) {
            i13 = ((i12 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= composerStartRestartGroup.d(i10) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 = i11;
            i13 |= composerStartRestartGroup.d(i14) ? 256 : 128;
        } else {
            i14 = i11;
        }
        if ((i12 & 3072) == 0) {
            function14 = function1;
            i13 |= composerStartRestartGroup.D(function14) ? RecyclerView.m.FLAG_MOVED : 1024;
        } else {
            function14 = function1;
        }
        if ((i12 & 24576) == 0) {
            function15 = function12;
            i13 |= composerStartRestartGroup.D(function15) ? 16384 : 8192;
        } else {
            function15 = function12;
        }
        if ((196608 & i12) == 0) {
            i13 |= composerStartRestartGroup.D(function13) ? 131072 : 65536;
        }
        if ((1572864 & i12) == 0) {
            function03 = function0;
            i13 |= composerStartRestartGroup.D(function03) ? 1048576 : 524288;
        } else {
            function03 = function0;
        }
        if ((12582912 & i12) == 0) {
            i13 |= composerStartRestartGroup.D(function02) ? 8388608 : 4194304;
        }
        int i15 = i13;
        if ((4793491 & i15) == 4793490 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1807832993, i15, -1, "com.meijer.mobile.shoppinglist.compose.ExpandedQuantityStepper (QuantityStepper.kt:145)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = t1.e(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Ji.Q.e(localThemeScope, M0.f139690a, ComposableLambdaKt.c(-1273376968, true, new a(localThemeScope, i14, a.e.API_PRIORITY_OTHER, function14, i10, function15, function13, C16193g.c(Aq.b.f1460E, composerStartRestartGroup, 0), function03, C16193g.c(Aq.b.f1459D, composerStartRestartGroup, 0), function02, (InterfaceC5730l0) objB), composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f15770g | 384 | (i15 & 14) | (M0.f139691b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Cq.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C3062t.n(localThemeScope, i10, i11, function1, function12, function13, function0, function02, i12, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, int i10, int i11, Function1 function1, Function1 function12, Function1 function13, Function0 function0, Function0 function02, int i12, Composer composer, int i13) {
        k(localThemeScope, i10, i11, function1, function12, function13, function0, function02, composer, J0.a(i12 | 1));
        return Unit.f142422a;
    }

    public static final void o(final LocalThemeScope localThemeScope, final int i10, final Function1<? super Integer, Unit> onQuantityChanged, final boolean z10, final Function1<? super Boolean, Unit> onStepperVisibilityChanged, Composer composer, final int i11) {
        int i12;
        int i13;
        final InterfaceC5726j0 interfaceC5726j0;
        Function1<? super Boolean, Unit> function1;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(onQuantityChanged, "onQuantityChanged");
        Intrinsics.j(onStepperVisibilityChanged, "onStepperVisibilityChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(-523154322);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 = i10;
            i12 |= composerStartRestartGroup.d(i13) ? 32 : 16;
        } else {
            i13 = i10;
        }
        if ((i11 & 384) == 0) {
            i12 |= composerStartRestartGroup.D(onQuantityChanged) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= composerStartRestartGroup.a(z10) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= composerStartRestartGroup.D(onStepperVisibilityChanged) ? 16384 : 8192;
        }
        int i14 = i12;
        if ((i14 & 9363) == 9362 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-523154322, i14, -1, "com.meijer.mobile.shoppinglist.compose.QuantityStepper (QuantityStepper.kt:63)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = C5702c1.a(i13);
                composerStartRestartGroup.t(objB);
            }
            InterfaceC5726j0 interfaceC5726j02 = (InterfaceC5726j0) objB;
            composerStartRestartGroup.P();
            Boolean boolValueOf = Boolean.valueOf(z10);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            int i15 = i14 & 57344;
            int i16 = i14 & 7168;
            boolean z11 = (i15 == 16384) | (i16 == 2048);
            Object objB2 = composerStartRestartGroup.B();
            if (z11 || objB2 == companion.a()) {
                objB2 = new b(onStepperVisibilityChanged, z10, null);
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            int i17 = i14 >> 9;
            androidx.compose.runtime.J.g(boolValueOf, (Function2) objB2, composerStartRestartGroup, i17 & 14);
            Integer numValueOf = Integer.valueOf(p(interfaceC5726j02));
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean z12 = (i16 == 2048) | (i15 == 16384);
            int i18 = i14 & 112;
            boolean z13 = z12 | (i18 == 32) | ((i14 & 896) == 256);
            Object objB3 = composerStartRestartGroup.B();
            if (z13 || objB3 == companion.a()) {
                interfaceC5726j0 = interfaceC5726j02;
                function1 = onStepperVisibilityChanged;
                c cVar = new c(z10, function1, i10, onQuantityChanged, interfaceC5726j0, null);
                composerStartRestartGroup.t(cVar);
                objB3 = cVar;
            } else {
                interfaceC5726j0 = interfaceC5726j02;
                function1 = onStepperVisibilityChanged;
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(numValueOf, (Function2) objB3, composerStartRestartGroup, 0);
            if (z10) {
                composerStartRestartGroup.startReplaceGroup(1147356386);
                int iP = p(interfaceC5726j0);
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objB4 = composerStartRestartGroup.B();
                if (objB4 == companion.a()) {
                    objB4 = new Function1() { // from class: Cq.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C3062t.t(interfaceC5726j0, ((Integer) obj).intValue());
                        }
                    };
                    composerStartRestartGroup.t(objB4);
                }
                Function1 function12 = (Function1) objB4;
                composerStartRestartGroup.P();
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objB5 = composerStartRestartGroup.B();
                if (objB5 == companion.a()) {
                    objB5 = new Function0() { // from class: Cq.l
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C3062t.u(interfaceC5726j0);
                        }
                    };
                    composerStartRestartGroup.t(objB5);
                }
                Function0 function0 = (Function0) objB5;
                composerStartRestartGroup.P();
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objB6 = composerStartRestartGroup.B();
                if (objB6 == companion.a()) {
                    objB6 = new Function0() { // from class: Cq.m
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C3062t.q(interfaceC5726j0);
                        }
                    };
                    composerStartRestartGroup.t(objB6);
                }
                composerStartRestartGroup.P();
                k(localThemeScope, i10, iP, function1, onQuantityChanged, function12, function0, (Function0) objB6, composerStartRestartGroup, 14352384 | LocalThemeScope.f15770g | (i14 & 14) | i18 | ((i14 >> 3) & 7168) | ((i14 << 6) & 57344));
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(1147184181);
                h(localThemeScope, function1, p(interfaceC5726j0), composerStartRestartGroup, LocalThemeScope.f15770g | (i14 & 14) | (i17 & 112));
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Cq.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C3062t.r(localThemeScope, i10, onQuantityChanged, z10, onStepperVisibilityChanged, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, int i10, Function1 function1, boolean z10, Function1 function12, int i11, Composer composer, int i12) {
        o(localThemeScope, i10, function1, z10, function12, composer, J0.a(i11 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(InterfaceC5726j0 interfaceC5726j0) {
        return interfaceC5726j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(InterfaceC5726j0 interfaceC5726j0) {
        s(interfaceC5726j0, p(interfaceC5726j0) - 1);
        return Unit.f142422a;
    }

    private static final void s(InterfaceC5726j0 interfaceC5726j0, int i10) {
        interfaceC5726j0.j(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(InterfaceC5726j0 interfaceC5726j0, int i10) {
        s(interfaceC5726j0, i10);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(InterfaceC5726j0 interfaceC5726j0) {
        s(interfaceC5726j0, p(interfaceC5726j0) + 1);
        return Unit.f142422a;
    }
}
