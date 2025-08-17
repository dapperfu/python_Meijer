package s4;

import Z.C5507e;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.InterfaceC16622O;
import z4.InterfaceC18380b;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u000bJ\u0019\u0010\u001b\u001a\u00020\t2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\"R\u0018\u0010&\u001a\u00060#j\u0002`$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010%R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u0016\u0010*\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u000f028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"Ls4/k;", "", "", "capacity", "Lkotlin/Function0;", "Lz4/b;", "connectionFactory", "<init>", "(ILkotlin/jvm/functions/Function0;)V", "", "f", "()V", "Lkotlin/time/Duration;", "timeout", "onTimeout", "Ls4/i;", "b", "(JLkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "connection", "e", "(Ls4/i;)V", "c", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "d", "(Ljava/lang/StringBuilder;)V", "I", "getCapacity", "()I", "Lkotlin/jvm/functions/Function0;", "getConnectionFactory", "()Lkotlin/jvm/functions/Function0;", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "size", "", "Z", "isClosed", "", "[Ls4/i;", "connections", "LAv/h;", "g", "LAv/h;", "connectionPermits", "LZ/e;", "h", "LZ/e;", "availableConnections", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function0<InterfaceC18380b> connectionFactory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ReentrantLock lock;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isClosed;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C16872i[] connections;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Av.h connectionPermits;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C5507e<C16872i> availableConnections;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.Pool", f = "ConnectionPoolImpl.kt", l = {231}, m = "acquire")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f160134a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f160135b;

        /* renamed from: d, reason: collision with root package name */
        int f160137d;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f160135b = obj;
            this.f160137d |= Integer.MIN_VALUE;
            return k.this.a(this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.Pool", f = "ConnectionPoolImpl.kt", l = {209}, m = "acquireWithTimeout-KLykuaI")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f160138a;

        /* renamed from: b, reason: collision with root package name */
        Object f160139b;

        /* renamed from: c, reason: collision with root package name */
        Object f160140c;

        /* renamed from: d, reason: collision with root package name */
        long f160141d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f160142e;

        /* renamed from: g, reason: collision with root package name */
        int f160144g;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f160142e = obj;
            this.f160144g |= Integer.MIN_VALUE;
            return k.this.b(0L, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.coroutines.Pool$acquireWithTimeout$2", f = "ConnectionPoolImpl.kt", l = {209}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f160145a;

        /* renamed from: b, reason: collision with root package name */
        int f160146b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<C16872i> f160147c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k f160148d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Ref.ObjectRef<C16872i> objectRef, k kVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f160147c = objectRef;
            this.f160148d = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f160147c, this.f160148d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef<C16872i> objectRef;
            T t10;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f160146b;
            if (i10 != 0) {
                if (i10 == 1) {
                    objectRef = (Ref.ObjectRef) this.f160145a;
                    ResultKt.b(obj);
                    t10 = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Ref.ObjectRef<C16872i> objectRef2 = this.f160147c;
                k kVar = this.f160148d;
                this.f160145a = objectRef2;
                this.f160146b = 1;
                Object objA = kVar.a(this);
                if (objA == objF) {
                    return objF;
                }
                objectRef = objectRef2;
                t10 = objA;
            }
            objectRef.f142835a = t10;
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(int i10, Function0<? extends InterfaceC18380b> connectionFactory) {
        Intrinsics.j(connectionFactory, "connectionFactory");
        this.capacity = i10;
        this.connectionFactory = connectionFactory;
        this.lock = new ReentrantLock();
        this.connections = new C16872i[i10];
        this.connectionPermits = Av.l.b(i10, 0, 2, null);
        this.availableConnections = new C5507e<>(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void f() {
        if (this.size >= this.capacity) {
            return;
        }
        C16872i c16872i = new C16872i(this.connectionFactory.invoke(), null, 2, 0 == true ? 1 : 0);
        C16872i[] c16872iArr = this.connections;
        int i10 = this.size;
        this.size = i10 + 1;
        c16872iArr[i10] = c16872i;
        this.availableConnections.a(c16872i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation<? super s4.C16872i> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof s4.k.a
            if (r0 == 0) goto L13
            r0 = r5
            s4.k$a r0 = (s4.k.a) r0
            int r1 = r0.f160137d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f160137d = r1
            goto L18
        L13:
            s4.k$a r0 = new s4.k$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f160135b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f160137d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f160134a
            s4.k r0 = (s4.k) r0
            kotlin.ResultKt.b(r5)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.ResultKt.b(r5)
            Av.h r5 = r4.connectionPermits
            r0.f160134a = r4
            r0.f160137d = r3
            java.lang.Object r5 = r5.d(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            java.util.concurrent.locks.ReentrantLock r5 = r0.lock     // Catch: java.lang.Throwable -> L69
            r5.lock()     // Catch: java.lang.Throwable -> L69
            boolean r1 = r0.isClosed     // Catch: java.lang.Throwable -> L5b
            if (r1 != 0) goto L6b
            Z.e<s4.i> r1 = r0.availableConnections     // Catch: java.lang.Throwable -> L5b
            boolean r1 = r1.d()     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L5d
            r0.f()     // Catch: java.lang.Throwable -> L5b
            goto L5d
        L5b:
            r1 = move-exception
            goto L78
        L5d:
            Z.e<s4.i> r1 = r0.availableConnections     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r1 = r1.e()     // Catch: java.lang.Throwable -> L5b
            s4.i r1 = (s4.C16872i) r1     // Catch: java.lang.Throwable -> L5b
            r5.unlock()     // Catch: java.lang.Throwable -> L69
            return r1
        L69:
            r5 = move-exception
            goto L7c
        L6b:
            java.lang.String r1 = "Connection pool is closed"
            r2 = 21
            z4.C18379a.b(r2, r1)     // Catch: java.lang.Throwable -> L5b
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L5b
            r1.<init>()     // Catch: java.lang.Throwable -> L5b
            throw r1     // Catch: java.lang.Throwable -> L5b
        L78:
            r5.unlock()     // Catch: java.lang.Throwable -> L69
            throw r1     // Catch: java.lang.Throwable -> L69
        L7c:
            Av.h r0 = r0.connectionPermits
            r0.release()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.k.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:47|28|(1:(1:38)(2:34|(1:36)))(1:30)|37|19|43|20|(1:22)(10:23|24|47|28|(0)(0)|37|19|43|20|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        r12 = r12;
        r11 = r11;
        r2 = r0;
        r0 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[Catch: all -> 0x007a, TryCatch #2 {all -> 0x007a, blocks: (B:28:0x0072, B:30:0x0076, B:34:0x007e, B:38:0x0085), top: B:47:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0061 -> B:24:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r9, kotlin.jvm.functions.Function0<kotlin.Unit> r11, kotlin.coroutines.Continuation<? super s4.C16872i> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof s4.k.b
            if (r0 == 0) goto L13
            r0 = r12
            s4.k$b r0 = (s4.k.b) r0
            int r1 = r0.f160144g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f160144g = r1
            goto L18
        L13:
            s4.k$b r0 = new s4.k$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f160142e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f160144g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            long r9 = r0.f160141d
            java.lang.Object r11 = r0.f160140c
            kotlin.jvm.internal.Ref$ObjectRef r11 = (kotlin.jvm.internal.Ref.ObjectRef) r11
            java.lang.Object r2 = r0.f160139b
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            java.lang.Object r5 = r0.f160138a
            s4.k r5 = (s4.k) r5
            kotlin.ResultKt.b(r12)     // Catch: java.lang.Throwable -> L38
            goto L63
        L38:
            r12 = move-exception
            goto L6d
        L3a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L42:
            kotlin.ResultKt.b(r12)
            r5 = r8
        L46:
            kotlin.jvm.internal.Ref$ObjectRef r12 = new kotlin.jvm.internal.Ref$ObjectRef
            r12.<init>()
            s4.k$c r2 = new s4.k$c     // Catch: java.lang.Throwable -> L68
            r2.<init>(r12, r5, r4)     // Catch: java.lang.Throwable -> L68
            r0.f160138a = r5     // Catch: java.lang.Throwable -> L68
            r0.f160139b = r11     // Catch: java.lang.Throwable -> L68
            r0.f160140c = r12     // Catch: java.lang.Throwable -> L68
            r0.f160141d = r9     // Catch: java.lang.Throwable -> L68
            r0.f160144g = r3     // Catch: java.lang.Throwable -> L68
            java.lang.Object r2 = qv.d1.d(r9, r2, r0)     // Catch: java.lang.Throwable -> L68
            if (r2 != r1) goto L61
            return r1
        L61:
            r2 = r11
            r11 = r12
        L63:
            r12 = r11
            r11 = r2
            r2 = r0
            r0 = r4
            goto L72
        L68:
            r2 = move-exception
            r7 = r2
            r2 = r11
            r11 = r12
            r12 = r7
        L6d:
            r7 = r12
            r12 = r11
            r11 = r2
            r2 = r0
            r0 = r7
        L72:
            boolean r6 = r0 instanceof kotlinx.coroutines.TimeoutCancellationException     // Catch: java.lang.Throwable -> L7a
            if (r6 == 0) goto L7c
            r11.invoke()     // Catch: java.lang.Throwable -> L7a
            goto L83
        L7a:
            r9 = move-exception
            goto L86
        L7c:
            if (r0 != 0) goto L85
            T r12 = r12.f142835a     // Catch: java.lang.Throwable -> L7a
            if (r12 == 0) goto L83
            return r12
        L83:
            r0 = r2
            goto L46
        L85:
            throw r0     // Catch: java.lang.Throwable -> L7a
        L86:
            T r10 = r12.f142835a
            s4.i r10 = (s4.C16872i) r10
            if (r10 == 0) goto L8f
            r5.e(r10)
        L8f:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.k.b(long, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.isClosed = true;
            for (C16872i c16872i : this.connections) {
                if (c16872i != null) {
                    c16872i.close();
                }
            }
            Unit unit = Unit.f142422a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void d(StringBuilder builder) {
        Intrinsics.j(builder, "builder");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            List listC = CollectionsKt.c();
            int iF = this.availableConnections.f();
            for (int i10 = 0; i10 < iF; i10++) {
                listC.add(this.availableConnections.c(i10));
            }
            List listA = CollectionsKt.a(listC);
            builder.append('\t' + super.toString() + " (");
            builder.append("capacity=" + this.capacity + ", ");
            builder.append("permits=" + this.connectionPermits.a() + ", ");
            builder.append("queue=(size=" + listA.size() + ")[" + CollectionsKt.B0(listA, null, null, null, 0, null, null, 63, null) + "], ");
            builder.append(")");
            builder.append('\n');
            C16872i[] c16872iArr = this.connections;
            int length = c16872iArr.length;
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                C16872i c16872i = c16872iArr[i12];
                i11++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\t\t[");
                sb2.append(i11);
                sb2.append("] - ");
                sb2.append(c16872i != null ? c16872i.toString() : null);
                builder.append(sb2.toString());
                builder.append('\n');
                if (c16872i != null) {
                    c16872i.a(builder);
                }
            }
            Unit unit = Unit.f142422a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void e(C16872i connection) {
        Intrinsics.j(connection, "connection");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.availableConnections.a(connection);
            Unit unit = Unit.f142422a;
            reentrantLock.unlock();
            this.connectionPermits.release();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
