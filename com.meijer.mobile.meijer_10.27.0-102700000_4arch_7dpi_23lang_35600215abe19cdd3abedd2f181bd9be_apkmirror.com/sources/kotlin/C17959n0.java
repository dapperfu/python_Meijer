package kotlin;

import H1.p;
import H1.r;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.InterfaceC5726j0;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.y;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.s0;
import g1.InterfaceC14171c;
import g1.U;
import kotlin.C13821t;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import r1.C16705m;
import r1.s;
import r1.u;

@Metadata(d1 = {"\u0000B\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u001aN\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\u000f\u001a\u00020\u0005*\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a=\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001c²\u0006\u000e\u0010\u001a\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001b\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002"}, d2 = {"", "expanded", "Lkotlin/Function1;", "", "onExpandedChange", "Landroidx/compose/ui/Modifier;", "modifier", "Lx0/l0;", "Lkotlin/ExtensionFunctionType;", "content", "a", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "", "menuLabel", "k", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)Landroidx/compose/ui/Modifier;", "LH1/p;", "windowBounds", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "", "verticalMarginInPx", "onHeightUpdate", "l", "(LH1/p;Landroidx/compose/ui/layout/LayoutCoordinates;ILkotlin/jvm/functions/Function1;)V", "width", "menuHeight", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* renamed from: x0.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17959n0 {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "it", "", "a", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.n0$a */
    static final class a extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ s0<LayoutCoordinates> f168351f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ R1 f168352g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f168353h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5726j0 f168354i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC5726j0 f168355j;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newHeight", "", "a", "(I)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.n0$a$a, reason: collision with other inner class name */
        static final class C2688a extends Lambda implements Function1<Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5726j0 f168356f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2688a(InterfaceC5726j0 interfaceC5726j0) {
                super(1);
                this.f168356f = interfaceC5726j0;
            }

            public final void a(int i10) {
                C17959n0.e(this.f168356f, i10);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                a(num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s0<LayoutCoordinates> s0Var, R1 r12, int i10, InterfaceC5726j0 interfaceC5726j0, InterfaceC5726j0 interfaceC5726j02) {
            super(1);
            this.f168351f = s0Var;
            this.f168352g = r12;
            this.f168353h = i10;
            this.f168354i = interfaceC5726j0;
            this.f168355j = interfaceC5726j02;
        }

        public final void a(LayoutCoordinates layoutCoordinates) {
            C17959n0.c(this.f168354i, r.g(layoutCoordinates.c()));
            this.f168351f.b(layoutCoordinates);
            C17959n0.l(this.f168352g.a(), this.f168351f.a(), this.f168353h, new C2688a(this.f168355j));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
            a(layoutCoordinates);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.n0$b */
    static final class b extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f168357f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f168358g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super Boolean, Unit> function1, boolean z10) {
            super(0);
            this.f168357f = function1;
            this.f168358g = z10;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f168357f.invoke(Boolean.valueOf(!this.f168358g));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.n0$c */
    static final class c extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f168359f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ y f168360g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, y yVar) {
            super(0);
            this.f168359f = z10;
            this.f168360g = yVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.f168359f) {
                this.f168360g.f();
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.n0$d */
    static final class d extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ R1 f168361f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ s0<LayoutCoordinates> f168362g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f168363h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5726j0 f168364i;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newHeight", "", "a", "(I)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.n0$d$a */
        static final class a extends Lambda implements Function1<Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5726j0 f168365f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC5726j0 interfaceC5726j0) {
                super(1);
                this.f168365f = interfaceC5726j0;
            }

            public final void a(int i10) {
                C17959n0.e(this.f168365f, i10);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                a(num.intValue());
                return Unit.f142422a;
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(R1 r12, s0<LayoutCoordinates> s0Var, int i10, InterfaceC5726j0 interfaceC5726j0) {
            super(0);
            this.f168361f = r12;
            this.f168362g = s0Var;
            this.f168363h = i10;
            this.f168364i = interfaceC5726j0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C17959n0.l(this.f168361f.a(), this.f168362g.a(), this.f168363h, new a(this.f168364i));
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.n0$e */
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f168366f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f168367g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f168368h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function3<AbstractC17953l0, Composer, Integer, Unit> f168369i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f168370j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f168371k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(boolean z10, Function1<? super Boolean, Unit> function1, Modifier modifier, Function3<? super AbstractC17953l0, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f168366f = z10;
            this.f168367g = function1;
            this.f168368h = modifier;
            this.f168369i = function3;
            this.f168370j = i10;
            this.f168371k = i11;
        }

        public final void a(Composer composer, int i10) {
            C17959n0.a(this.f168366f, this.f168367g, this.f168368h, this.f168369i, composer, J0.a(this.f168370j | 1), this.f168371k);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"x0/n0$f", "Lx0/l0;", "Landroidx/compose/ui/Modifier;", "", "matchTextFieldWidth", "a", "(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.n0$f */
    public static final class f extends AbstractC17953l0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ H1.d f168372a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5726j0 f168373b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5726j0 f168374c;

        f(H1.d dVar, InterfaceC5726j0 interfaceC5726j0, InterfaceC5726j0 interfaceC5726j02) {
            this.f168372a = dVar;
            this.f168373b = interfaceC5726j0;
            this.f168374c = interfaceC5726j02;
        }

        @Override // kotlin.AbstractC17953l0
        public Modifier a(Modifier modifier, boolean z10) {
            H1.d dVar = this.f168372a;
            InterfaceC5726j0 interfaceC5726j0 = this.f168373b;
            InterfaceC5726j0 interfaceC5726j02 = this.f168374c;
            Modifier modifierK = J.k(modifier, 0.0f, dVar.K(C17959n0.d(interfaceC5726j0)), 1, null);
            return z10 ? J.z(modifierK, dVar.K(C17959n0.b(interfaceC5726j02))) : modifierK;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/J;", "", "<anonymous>", "(Lg1/J;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$1", f = "ExposedDropdownMenu.kt", l = {446}, m = "invokeSuspend")
    /* renamed from: x0.n0$g */
    static final class g extends SuspendLambda implements Function2<g1.J, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f168375a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f168376b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f168377c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/c;", "", "<anonymous>", "(Lg1/c;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$1$1", f = "ExposedDropdownMenu.kt", l = {450, 451}, m = "invokeSuspend")
        /* renamed from: x0.n0$g$a */
        static final class a extends RestrictedSuspendLambda implements Function2<InterfaceC14171c, Continuation<? super Unit>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f168378b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f168379c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f168380d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function0<Unit> function0, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f168380d = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f168380d, continuation);
                aVar.f168379c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC14171c interfaceC14171c, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC14171c, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
            
                if (r11 == r0) goto L16;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r10.f168378b
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L24
                    if (r1 == r3) goto L1b
                    if (r1 != r2) goto L13
                    kotlin.ResultKt.b(r11)
                    r7 = r10
                    goto L4c
                L13:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L1b:
                    java.lang.Object r1 = r10.f168379c
                    g1.c r1 = (g1.InterfaceC14171c) r1
                    kotlin.ResultKt.b(r11)
                    r7 = r10
                    goto L3e
                L24:
                    kotlin.ResultKt.b(r11)
                    java.lang.Object r11 = r10.f168379c
                    r4 = r11
                    g1.c r4 = (g1.InterfaceC14171c) r4
                    g1.s r6 = g1.EnumC14186s.f132678a
                    r10.f168379c = r4
                    r10.f168378b = r3
                    r5 = 0
                    r8 = 1
                    r9 = 0
                    r7 = r10
                    java.lang.Object r11 = kotlin.C13794L.f(r4, r5, r6, r7, r8, r9)
                    if (r11 != r0) goto L3d
                    goto L4b
                L3d:
                    r1 = r4
                L3e:
                    g1.s r11 = g1.EnumC14186s.f132678a
                    r3 = 0
                    r7.f168379c = r3
                    r7.f168378b = r2
                    java.lang.Object r11 = kotlin.C13794L.u(r1, r11, r10)
                    if (r11 != r0) goto L4c
                L4b:
                    return r0
                L4c:
                    g1.B r11 = (g1.PointerInputChange) r11
                    if (r11 == 0) goto L55
                    kotlin.jvm.functions.Function0<kotlin.Unit> r11 = r7.f168380d
                    r11.invoke()
                L55:
                    kotlin.Unit r11 = kotlin.Unit.f142422a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.C17959n0.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Function0<Unit> function0, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f168377c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = new g(this.f168377c, continuation);
            gVar.f168376b = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g1.J j10, Continuation<? super Unit> continuation) {
            return ((g) create(j10, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f168375a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                g1.J j10 = (g1.J) this.f168376b;
                a aVar = new a(this.f168377c, null);
                this.f168375a = 1;
                if (C13821t.d(j10, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.n0$h */
    static final class h extends Lambda implements Function1<u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f168381f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f168382g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.n0$h$a */
        static final class a extends Lambda implements Function0<Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f168383f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function0<Unit> function0) {
                super(0);
                this.f168383f = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                this.f168383f.invoke();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, Function0<Unit> function0) {
            super(1);
            this.f168381f = str;
            this.f168382g = function0;
        }

        public final void a(u uVar) {
            s.g0(uVar, this.f168381f);
            s.E(uVar, null, new a(this.f168382g), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r21, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r22, androidx.compose.ui.Modifier r23, kotlin.jvm.functions.Function3<? super kotlin.AbstractC17953l0, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17959n0.a(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final Modifier k(Modifier modifier, Function0<Unit> function0, String str) {
        return C16705m.d(modifier.then(new SuspendPointerInputElement(function0, null, null, new U.a(new g(function0, null)), 6, null)), false, new h(str, function0), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(p pVar, LayoutCoordinates layoutCoordinates, int i10, Function1<? super Integer, Unit> function1) {
        if (layoutCoordinates == null) {
            return;
        }
        function1.invoke(Integer.valueOf(((int) Math.max(LayoutCoordinatesKt.b(layoutCoordinates).getTop() - pVar.getTop(), (pVar.getBottom() - pVar.getTop()) - LayoutCoordinatesKt.b(layoutCoordinates).i())) - i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(InterfaceC5726j0 interfaceC5726j0) {
        return interfaceC5726j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InterfaceC5726j0 interfaceC5726j0, int i10) {
        interfaceC5726j0.j(i10);
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
