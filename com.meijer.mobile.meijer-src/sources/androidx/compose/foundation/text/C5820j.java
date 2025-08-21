package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.t1;
import e0.C13742a;
import e0.C13748g;
import e0.ContextMenuState;
import kotlin.C17768G;
import kotlin.C17770I;
import kotlin.C17778Q;
import kotlin.C17780T;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.EnumC15785Q;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0080@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lw0/Q;", "manager", "Lkotlin/Function0;", "", "content", "b", "(Lw0/Q;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Lw0/G;", "a", "(Lw0/G;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/G;", "c", "(Lw0/Q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.text.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5820j {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.j$a */
    static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ContextMenuState f49789f;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ContextMenuState contextMenuState) {
            super(0);
            this.f49789f = contextMenuState;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            e0.j.a(this.f49789f);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.j$b */
    static final class b extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f49790f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<G> f49791g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C17778Q f49792h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1$1", f = "ContextMenu.android.kt", l = {56}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.j$b$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f49793a;

            /* renamed from: b, reason: collision with root package name */
            int f49794b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<G> f49795c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C17778Q f49796d;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f49795c, this.f49796d, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC5872l0<G> interfaceC5872l0, C17778Q c17778q, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f49795c = interfaceC5872l0;
                this.f49796d = c17778q;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                InterfaceC5872l0 interfaceC5872l0;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f49794b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        interfaceC5872l0 = (InterfaceC5872l0) this.f49793a;
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC5872l0<G> interfaceC5872l02 = this.f49795c;
                    C17778Q c17778q = this.f49796d;
                    this.f49793a = interfaceC5872l02;
                    this.f49794b = 1;
                    Object objC = C5820j.c(c17778q, this);
                    if (objC == objF) {
                        return objF;
                    }
                    interfaceC5872l0 = interfaceC5872l02;
                    obj = objC;
                }
                interfaceC5872l0.setValue(obj);
                return Unit.f143329a;
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC15783O interfaceC15783O, InterfaceC5872l0<G> interfaceC5872l0, C17778Q c17778q) {
            super(0);
            this.f49790f = interfaceC15783O;
            this.f49791g = interfaceC5872l0;
            this.f49792h = c17778q;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C15809k.d(this.f49790f, null, EnumC15785Q.f151688d, new a(this.f49791g, this.f49792h, null), 1, null);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.j$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17778Q f49797f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f49798g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f49799h;

        public final void a(Composer composer, int i10) {
            C5820j.b(this.f49797f, this.f49798g, composer, J0.a(this.f49799h | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(C17778Q c17778q, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f49797f = c17778q;
            this.f49798g = function2;
            this.f49799h = i10;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.j$d */
    static final class d extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ContextMenuState f49800f;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ContextMenuState contextMenuState) {
            super(0);
            this.f49800f = contextMenuState;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            e0.j.a(this.f49800f);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.j$e */
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17768G f49801f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f49802g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f49803h;

        public final void a(Composer composer, int i10) {
            C5820j.a(this.f49801f, this.f49802g, composer, J0.a(this.f49803h | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(C17768G c17768g, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f49801f = c17768g;
            this.f49802g = function2;
            this.f49803h = i10;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.ContextMenu_androidKt", f = "ContextMenu.android.kt", l = {167}, m = "getContextMenuItemsAvailability")
    /* renamed from: androidx.compose.foundation.text.j$f */
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f49804a;

        /* renamed from: b, reason: collision with root package name */
        int f49805b;

        /* renamed from: c, reason: collision with root package name */
        int f49806c;

        /* renamed from: d, reason: collision with root package name */
        int f49807d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f49808e;

        /* renamed from: f, reason: collision with root package name */
        int f49809f;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49808e = obj;
            this.f49809f |= Integer.MIN_VALUE;
            return C5820j.c(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[PHI: r2 r5 r7 r8
      0x0093: PHI (r2v3 ??) = (r2v1 ??), (r2v10 ??) binds: [B:20:0x005e, B:34:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0093: PHI (r5v3 int) = (r5v1 int), (r5v11 int) binds: [B:20:0x005e, B:34:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0093: PHI (r7v3 w0.Q) = (r7v0 w0.Q), (r7v9 w0.Q) binds: [B:20:0x005e, B:34:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0093: PHI (r8v10 int) = (r8v6 int), (r8v12 int) binds: [B:20:0x005e, B:34:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(kotlin.C17778Q r7, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.G> r8) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.C5820j.c(w0.Q, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void a(C17768G c17768g, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10) {
        int i11;
        boolean z10;
        Function2<? super Composer, ? super Integer, Unit> function22;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(605522716);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(c17768g)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(function2)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (composerStartRestartGroup.p(z10, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(605522716, i11, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:103)");
            }
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new ContextMenuState(null, 1, null);
                composerStartRestartGroup.t(objB);
            }
            ContextMenuState contextMenuState = (ContextMenuState) objB;
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = new d(contextMenuState);
                composerStartRestartGroup.t(objB2);
            }
            function22 = function2;
            C13742a.b(contextMenuState, (Function0) objB2, C17770I.a(c17768g, contextMenuState), null, false, null, function22, composerStartRestartGroup, ((i11 << 15) & 3670016) | 54, 56);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            function22 = function2;
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new e(c17768g, function22, i10));
        }
    }

    public static final void b(C17778Q c17778q, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10) {
        int i11;
        boolean z10;
        Function2<? super Composer, ? super Integer, Unit> function22;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1985516685);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(c17778q)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(function2)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (composerStartRestartGroup.p(z10, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(-1985516685, i11, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:43)");
            }
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new ContextMenuState(null, 1, null);
                composerStartRestartGroup.t(objB);
            }
            ContextMenuState contextMenuState = (ContextMenuState) objB;
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = androidx.compose.runtime.J.k(EmptyCoroutineContext.f143553a, composerStartRestartGroup);
                composerStartRestartGroup.t(objB2);
            }
            InterfaceC15783O interfaceC15783O = (InterfaceC15783O) objB2;
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == companion.a()) {
                objB3 = t1.e(G.b(G.INSTANCE.a()), null, 2, null);
                composerStartRestartGroup.t(objB3);
            }
            InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB3;
            Object objB4 = composerStartRestartGroup.B();
            if (objB4 == companion.a()) {
                objB4 = new a(contextMenuState);
                composerStartRestartGroup.t(objB4);
            }
            Function0 function0 = (Function0) objB4;
            Function1<C13748g, Unit> function1A = C17780T.a(c17778q, contextMenuState, interfaceC5872l0);
            boolean zH = c17778q.H();
            boolean zD = composerStartRestartGroup.D(interfaceC15783O) | composerStartRestartGroup.D(c17778q);
            Object objB5 = composerStartRestartGroup.B();
            if (zD || objB5 == companion.a()) {
                objB5 = new b(interfaceC15783O, interfaceC5872l0, c17778q);
                composerStartRestartGroup.t(objB5);
            }
            function22 = function2;
            C13742a.b(contextMenuState, function0, function1A, null, zH, (Function0) objB5, function22, composerStartRestartGroup, ((i11 << 15) & 3670016) | 54, 8);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            function22 = function2;
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new c(c17778q, function22, i10));
        }
    }
}
