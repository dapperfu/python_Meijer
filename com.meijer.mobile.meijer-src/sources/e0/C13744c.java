package e0;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import g1.InterfaceC14300c;
import g1.J;
import g1.U;
import kotlin.C13931t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a(\u0010\t\u001a\u00020\u0003*\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0081@¢\u0006\u0004\b\t\u0010\n\u001a\u0014\u0010\r\u001a\u00020\f*\u00020\u000bH\u0082@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "LU0/f;", "", "onOpenGesture", "c", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Lg1/J;", "onDown", "d", "(Lg1/J;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lg1/c;", "Lg1/B;", "b", "(Lg1/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: e0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13744c {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt", f = "ContextMenuGestures.android.kt", l = {71}, m = "awaitFirstRightClickDown")
    /* renamed from: e0.c$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f129036a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f129037b;

        /* renamed from: c, reason: collision with root package name */
        int f129038c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f129037b = obj;
            this.f129038c |= Integer.MIN_VALUE;
            return C13744c.b(null, this);
        }

        a(Continuation<? super a> continuation) {
            super(continuation);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/J;", "", "invoke", "(Lg1/J;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: e0.c$b */
    static final class b implements PointerInputEventHandler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<U0.f, Unit> f129039a;

        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super U0.f, Unit> function1) {
            this.f129039a = function1;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(J j10, Continuation<? super Unit> continuation) {
            Object objD = C13744c.d(j10, this.f129039a, continuation);
            return objD == IntrinsicsKt.f() ? objD : Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/c;", "", "<anonymous>", "(Lg1/c;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt$onRightClickDown$2", f = "ContextMenuGestures.android.kt", l = {58, 61}, m = "invokeSuspend")
    /* renamed from: e0.c$c, reason: collision with other inner class name */
    static final class C2035c extends RestrictedSuspendLambda implements Function2<InterfaceC14300c, Continuation<? super Unit>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f129040b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f129041c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<U0.f, Unit> f129042d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2035c(Function1<? super U0.f, Unit> function1, Continuation<? super C2035c> continuation) {
            super(2, continuation);
            this.f129042d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2035c c2035c = new C2035c(this.f129042d, continuation);
            c2035c.f129041c = obj;
            return c2035c;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC14300c interfaceC14300c, Continuation<? super Unit> continuation) {
            return ((C2035c) create(interfaceC14300c, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        
            if (r8 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r7.f129040b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r8)
                goto L53
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                java.lang.Object r1 = r7.f129041c
                g1.c r1 = (g1.InterfaceC14300c) r1
                kotlin.ResultKt.b(r8)
                goto L35
            L22:
                kotlin.ResultKt.b(r8)
                java.lang.Object r8 = r7.f129041c
                r1 = r8
                g1.c r1 = (g1.InterfaceC14300c) r1
                r7.f129041c = r1
                r7.f129040b = r3
                java.lang.Object r8 = e0.C13744c.a(r1, r7)
                if (r8 != r0) goto L35
                goto L52
            L35:
                g1.B r8 = (g1.PointerInputChange) r8
                r8.a()
                kotlin.jvm.functions.Function1<U0.f, kotlin.Unit> r4 = r7.f129042d
                long r5 = r8.getPosition()
                U0.f r8 = U0.f.d(r5)
                r4.invoke(r8)
                r8 = 0
                r7.f129041c = r8
                r7.f129040b = r2
                java.lang.Object r8 = kotlin.C13904L.v(r1, r8, r7, r3, r8)
                if (r8 != r0) goto L53
            L52:
                return r0
            L53:
                g1.B r8 = (g1.PointerInputChange) r8
                if (r8 == 0) goto L5a
                r8.a()
            L5a:
                kotlin.Unit r8 = kotlin.Unit.f143329a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: e0.C13744c.C2035c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(g1.InterfaceC14300c r8, kotlin.coroutines.Continuation<? super g1.PointerInputChange> r9) {
        /*
            boolean r0 = r9 instanceof e0.C13744c.a
            if (r0 == 0) goto L13
            r0 = r9
            e0.c$a r0 = (e0.C13744c.a) r0
            int r1 = r0.f129038c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129038c = r1
            goto L18
        L13:
            e0.c$a r0 = new e0.c$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f129037b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f129038c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f129036a
            g1.c r8 = (g1.InterfaceC14300c) r8
            kotlin.ResultKt.b(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.ResultKt.b(r9)
        L38:
            r0.f129036a = r8
            r0.f129038c = r3
            r9 = 0
            java.lang.Object r9 = g1.InterfaceC14300c.G1(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            g1.q r9 = (g1.C14314q) r9
            int r2 = r9.getButtons()
            boolean r2 = g1.C14317u.c(r2)
            if (r2 == 0) goto L38
            java.util.List r2 = r9.c()
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
            r6 = r5
        L5d:
            if (r6 >= r4) goto L6f
            java.lang.Object r7 = r2.get(r6)
            g1.B r7 = (g1.PointerInputChange) r7
            boolean r7 = g1.r.a(r7)
            if (r7 != 0) goto L6c
            goto L38
        L6c:
            int r6 = r6 + 1
            goto L5d
        L6f:
            java.util.List r8 = r9.c()
            java.lang.Object r8 = r8.get(r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.C13744c.b(g1.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Modifier c(Modifier modifier, Function1<? super U0.f, Unit> function1) {
        return U.c(modifier, C13745d.f129043a, new b(function1));
    }

    public static final Object d(J j10, Function1<? super U0.f, Unit> function1, Continuation<? super Unit> continuation) {
        Object objD = C13931t.d(j10, new C2035c(function1, null), continuation);
        return objD == IntrinsicsKt.f() ? objD : Unit.f143329a;
    }
}
