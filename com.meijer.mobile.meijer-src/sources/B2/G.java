package B2;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pv.C16563h;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import wv.InterfaceC17929a;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b\u001a\u0010 ¨\u0006\""}, d2 = {"LB2/G;", "LB2/s;", "", "filePath", "<init>", "(Ljava/lang/String;)V", "T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "b", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "", "d", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "Ljava/lang/String;", "Lwv/a;", "Lwv/a;", "mutex", "LB2/b;", "c", "LB2/b;", "version", "Lpv/f;", "", "Lpv/f;", "()Lpv/f;", "updateNotifications", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class G implements s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String filePath;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17929a mutex;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C2905b version;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16561f<Unit> updateNotifications;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {66, 41}, m = "lock")
    static final class a<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f2221a;

        /* renamed from: b, reason: collision with root package name */
        Object f2222b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f2223c;

        /* renamed from: e, reason: collision with root package name */
        int f2225e;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2223c = obj;
            this.f2225e |= Integer.MIN_VALUE;
            return G.this.b(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {50}, m = "tryLock")
    static final class b<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f2226a;

        /* renamed from: b, reason: collision with root package name */
        boolean f2227b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f2228c;

        /* renamed from: e, reason: collision with root package name */
        int f2230e;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2228c = obj;
            this.f2230e |= Integer.MIN_VALUE;
            return G.this.d(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpv/g;", "", "<anonymous>", "(Lpv/g;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", f = "SingleProcessCoordinator.kt", l = {}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC16562g<? super Unit>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f2231a;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super Unit> interfaceC16562g, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16562g, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f2231a == 0) {
                ResultKt.b(obj);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public G(String filePath) {
        Intrinsics.j(filePath, "filePath");
        this.filePath = filePath;
        this.mutex = wv.g.b(false, 1, null);
        this.version = new C2905b(0);
        this.updateNotifications = C16563h.E(new c(null));
    }

    @Override // B2.s
    public Object a(Continuation<? super Integer> continuation) {
        return Boxing.d(this.version.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // B2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> java.lang.Object b(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r8, kotlin.coroutines.Continuation<? super T> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof B2.G.a
            if (r0 == 0) goto L13
            r0 = r9
            B2.G$a r0 = (B2.G.a) r0
            int r1 = r0.f2225e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2225e = r1
            goto L18
        L13:
            B2.G$a r0 = new B2.G$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f2223c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f2225e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.f2221a
            wv.a r8 = (wv.InterfaceC17929a) r8
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L31
            goto L6b
        L31:
            r9 = move-exception
            goto L73
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.f2222b
            wv.a r8 = (wv.InterfaceC17929a) r8
            java.lang.Object r2 = r0.f2221a
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlin.ResultKt.b(r9)
            r9 = r8
            r8 = r2
            goto L5b
        L49:
            kotlin.ResultKt.b(r9)
            wv.a r9 = r7.mutex
            r0.f2221a = r8
            r0.f2222b = r9
            r0.f2225e = r4
            java.lang.Object r2 = r9.g(r5, r0)
            if (r2 != r1) goto L5b
            goto L67
        L5b:
            r0.f2221a = r9     // Catch: java.lang.Throwable -> L6f
            r0.f2222b = r5     // Catch: java.lang.Throwable -> L6f
            r0.f2225e = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L6f
            if (r8 != r1) goto L68
        L67:
            return r1
        L68:
            r6 = r9
            r9 = r8
            r8 = r6
        L6b:
            r8.h(r5)
            return r9
        L6f:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L73:
            r8.h(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.G.b(kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // B2.s
    public InterfaceC16561f<Unit> c() {
        return this.updateNotifications;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // B2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> java.lang.Object d(kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r7, kotlin.coroutines.Continuation<? super T> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof B2.G.b
            if (r0 == 0) goto L13
            r0 = r8
            B2.G$b r0 = (B2.G.b) r0
            int r1 = r0.f2230e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2230e = r1
            goto L18
        L13:
            B2.G$b r0 = new B2.G$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f2228c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f2230e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            boolean r7 = r0.f2227b
            java.lang.Object r0 = r0.f2226a
            wv.a r0 = (wv.InterfaceC17929a) r0
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L30
            goto L57
        L30:
            r8 = move-exception
            goto L61
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            kotlin.ResultKt.b(r8)
            wv.a r8 = r6.mutex
            boolean r2 = r8.b(r4)
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.a(r2)     // Catch: java.lang.Throwable -> L5d
            r0.f2226a = r8     // Catch: java.lang.Throwable -> L5d
            r0.f2227b = r2     // Catch: java.lang.Throwable -> L5d
            r0.f2230e = r3     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r7 = r7.invoke(r5, r0)     // Catch: java.lang.Throwable -> L5d
            if (r7 != r1) goto L54
            return r1
        L54:
            r0 = r8
            r8 = r7
            r7 = r2
        L57:
            if (r7 == 0) goto L5c
            r0.h(r4)
        L5c:
            return r8
        L5d:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L61:
            if (r7 == 0) goto L66
            r0.h(r4)
        L66:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.G.d(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // B2.s
    public Object e(Continuation<? super Integer> continuation) {
        return Boxing.d(this.version.d());
    }
}
