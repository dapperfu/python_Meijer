package z7;

import b8.ServerConfigurationV4;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m8.q;
import wv.InterfaceC17929a;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\bH\u0080@¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0080@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010!R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0016\u0010(\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lz7/l;", "", "Lz7/f;", "initialServerData", "LA7/b;", "updateListener", "<init>", "(Lz7/f;LA7/b;)V", "Lm8/q;", "newConfigV3", "", "notifyOnChanges", "", "c", "(Lm8/q;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "()Lz7/f;", "configV3", "e", "(Lm8/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LA7/c;", "newServerData", "d", "(LA7/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LA7/b;", "Lwv/a;", "Lwv/a;", "mutex", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialState", "LA7/a;", "LA7/a;", "state", "Lb8/j;", "Lb8/j;", "configuration", "f", "Lm8/q;", "configurationV3", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final A7.b updateListener;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17929a mutex;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean initialState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private A7.a state;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private ServerConfigurationV4 configuration;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private q configurationV3;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.communication.ServerDataMaintainer", f = "ServerDataMaintainer.kt", l = {131, 121}, m = "updateInternalV3Config")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f172616a;

        /* renamed from: b, reason: collision with root package name */
        Object f172617b;

        /* renamed from: c, reason: collision with root package name */
        Object f172618c;

        /* renamed from: d, reason: collision with root package name */
        Object f172619d;

        /* renamed from: e, reason: collision with root package name */
        boolean f172620e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f172621f;

        /* renamed from: h, reason: collision with root package name */
        int f172623h;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f172621f = obj;
            this.f172623h |= Integer.MIN_VALUE;
            return l.this.c(null, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.communication.ServerDataMaintainer", f = "ServerDataMaintainer.kt", l = {87, 91}, m = "updateServerData$com_dynatrace_agent_release")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f172624a;

        /* renamed from: b, reason: collision with root package name */
        Object f172625b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f172626c;

        /* renamed from: e, reason: collision with root package name */
        int f172628e;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f172626c = obj;
            this.f172628e |= Integer.MIN_VALUE;
            return l.this.d(null, this);
        }
    }

    public final Object e(q qVar, Continuation<? super Unit> continuation) {
        Object objC = c(qVar, false, continuation);
        return objC == IntrinsicsKt.f() ? objC : Unit.f143329a;
    }

    public l(LocalServerData initialServerData, A7.b updateListener) {
        Intrinsics.j(initialServerData, "initialServerData");
        Intrinsics.j(updateListener, "updateListener");
        this.updateListener = updateListener;
        this.mutex = wv.g.b(false, 1, null);
        this.initialState = new AtomicBoolean(true);
        this.state = initialServerData.getState();
        this.configuration = initialServerData.getConfig();
        this.configurationV3 = initialServerData.getConfigV3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
    
        if (r0.a(r4, r2) == r3) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:20:0x0073, B:23:0x0079, B:30:0x008f, B:32:0x0095, B:33:0x0099, B:26:0x0081), top: B:47:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(m8.q r18, boolean r19, kotlin.coroutines.Continuation<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.l.c(m8.q, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final LocalServerData b() {
        return new LocalServerData(this.state, this.configuration, this.configurationV3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b9, code lost:
    
        if (r11.b(r2, r5, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cc, code lost:
    
        if (r2.c(r10, true, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ce, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(A7.ServerDataUpdate r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof z7.l.b
            if (r0 == 0) goto L13
            r0 = r11
            z7.l$b r0 = (z7.l.b) r0
            int r1 = r0.f172628e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f172628e = r1
            goto L18
        L13:
            z7.l$b r0 = new z7.l$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f172626c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f172628e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r11)
            goto Lcf
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            java.lang.Object r10 = r0.f172625b
            A7.c r10 = (A7.ServerDataUpdate) r10
            java.lang.Object r2 = r0.f172624a
            z7.l r2 = (z7.l) r2
            kotlin.ResultKt.b(r11)
            goto Lbd
        L42:
            kotlin.ResultKt.b(r11)
            if (r10 != 0) goto L4a
            kotlin.Unit r10 = kotlin.Unit.f143329a
            return r10
        L4a:
            java.util.concurrent.atomic.AtomicBoolean r11 = r9.initialState
            r2 = 0
            boolean r11 = r11.compareAndSet(r4, r2)
            if (r11 != 0) goto L5f
            A7.a r11 = r10.getState()
            A7.a r5 = r9.state
            boolean r11 = kotlin.jvm.internal.Intrinsics.e(r11, r5)
            if (r11 != 0) goto L66
        L5f:
            A7.a r11 = r10.getState()
            r9.state = r11
            r2 = r4
        L66:
            b8.j r11 = r10.getConfig()
            if (r11 == 0) goto L85
            b8.j r11 = r10.getConfig()
            long r5 = r11.getRevision()
            b8.j r11 = r9.configuration
            long r7 = r11.getRevision()
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 <= 0) goto L85
            b8.j r11 = r10.getConfig()
            r9.configuration = r11
            r2 = r4
        L85:
            if (r2 == 0) goto Lbc
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r2 = "updated server configuration; state: "
            r11.append(r2)
            A7.a r2 = r9.state
            r11.append(r2)
            java.lang.String r2 = ", config: "
            r11.append(r2)
            b8.j r2 = r9.configuration
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            java.lang.String r2 = "dtxCommunication"
            z8.f.a(r2, r11)
            A7.b r11 = r9.updateListener
            A7.a r2 = r9.state
            b8.j r5 = r9.configuration
            r0.f172624a = r9
            r0.f172625b = r10
            r0.f172628e = r4
            java.lang.Object r11 = r11.b(r2, r5, r0)
            if (r11 != r1) goto Lbc
            goto Lce
        Lbc:
            r2 = r9
        Lbd:
            m8.q r10 = r10.getConfigV3()
            r11 = 0
            r0.f172624a = r11
            r0.f172625b = r11
            r0.f172628e = r3
            java.lang.Object r10 = r2.c(r10, r4, r0)
            if (r10 != r1) goto Lcf
        Lce:
            return r1
        Lcf:
            kotlin.Unit r10 = kotlin.Unit.f143329a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.l.d(A7.c, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
