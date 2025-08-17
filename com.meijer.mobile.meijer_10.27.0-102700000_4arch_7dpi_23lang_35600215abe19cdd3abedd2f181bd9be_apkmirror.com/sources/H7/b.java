package H7;

import W7.EndPointInfo;
import com.dynatrace.agent.storage.db.EventRecord;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import w7.InterfaceC17801a;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J4\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\f0\u00132\u0006\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b\u001a\u0010\u001bJ,\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0080@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fH\u0086@¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010'R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010)¨\u0006+"}, d2 = {"LH7/b;", "", "LW7/a;", "activeEndpoint", "LW7/d;", "databaseDataSource", "", "envelopeSize", "Lw7/a;", "timeProvider", "<init>", "(LW7/a;LW7/d;ILw7/a;)V", "", "Lcom/dynatrace/agent/storage/db/EventRecord;", "LH7/a;", "f", "(Ljava/util/List;LW7/a;)LH7/a;", "", "maxBeaconSizeBytes", "Lkotlin/Pair;", "", "e", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datasource", "limitRows", "LW7/f;", "c", "(LW7/d;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "eventMetadata", "b", "(Ljava/util/List;LW7/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "d", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LW7/a;", "()LW7/a;", "LW7/d;", "I", "Lw7/a;", "LA7/a;", "LA7/a;", "eventRecordSizeFilter", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final EndPointInfo activeEndpoint;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final W7.d databaseDataSource;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int envelopeSize;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17801a timeProvider;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final A7.a eventRecordSizeFilter;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider", f = "DispatchableDataProvider.kt", l = {149}, m = "loadEventData$com_dynatrace_agent_release")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f12310a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f12311b;

        /* renamed from: d, reason: collision with root package name */
        int f12313d;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f12311b = obj;
            this.f12313d |= Integer.MIN_VALUE;
            return b.this.b(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider", f = "DispatchableDataProvider.kt", l = {122, 123}, m = "preSelectData$com_dynatrace_agent_release")
    /* renamed from: H7.b$b, reason: collision with other inner class name */
    static final class C0188b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f12314a;

        /* renamed from: b, reason: collision with root package name */
        Object f12315b;

        /* renamed from: c, reason: collision with root package name */
        int f12316c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f12317d;

        /* renamed from: f, reason: collision with root package name */
        int f12319f;

        C0188b(Continuation<? super C0188b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f12317d = obj;
            this.f12319f |= Integer.MIN_VALUE;
            return b.this.c(null, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.communication.preprocessing.DispatchableDataProvider", f = "DispatchableDataProvider.kt", l = {53, 76, 81, 99}, m = "selectData")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f12320a;

        /* renamed from: b, reason: collision with root package name */
        Object f12321b;

        /* renamed from: c, reason: collision with root package name */
        Object f12322c;

        /* renamed from: d, reason: collision with root package name */
        Object f12323d;

        /* renamed from: e, reason: collision with root package name */
        long f12324e;

        /* renamed from: f, reason: collision with root package name */
        boolean f12325f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f12326g;

        /* renamed from: i, reason: collision with root package name */
        int f12328i;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f12326g = obj;
            this.f12328i |= Integer.MIN_VALUE;
            return b.this.e(0L, this);
        }
    }

    public b(EndPointInfo activeEndpoint, W7.d databaseDataSource, int i10, InterfaceC17801a timeProvider) {
        Intrinsics.j(activeEndpoint, "activeEndpoint");
        Intrinsics.j(databaseDataSource, "databaseDataSource");
        Intrinsics.j(timeProvider, "timeProvider");
        this.activeEndpoint = activeEndpoint;
        this.databaseDataSource = databaseDataSource;
        this.envelopeSize = i10;
        this.timeProvider = timeProvider;
        this.eventRecordSizeFilter = new A7.a(i10);
    }

    /* renamed from: a, reason: from getter */
    public final EndPointInfo getActiveEndpoint() {
        return this.activeEndpoint;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List<W7.EventMetadata> r7, W7.d r8, kotlin.coroutines.Continuation<? super java.util.List<com.dynatrace.agent.storage.db.EventRecord>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof H7.b.a
            if (r0 == 0) goto L13
            r0 = r9
            H7.b$a r0 = (H7.b.a) r0
            int r1 = r0.f12313d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12313d = r1
            goto L18
        L13:
            H7.b$a r0 = new H7.b$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f12311b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f12313d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f12310a
            java.util.List r7 = (java.util.List) r7
            kotlin.ResultKt.b(r9)
            goto L78
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.ResultKt.b(r9)
            boolean r9 = r7.isEmpty()
            if (r9 == 0) goto L43
            java.util.List r7 = kotlin.collections.CollectionsKt.m()
            return r7
        L43:
            r9 = r7
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.CollectionsKt.x(r9, r4)
            r2.<init>(r4)
            java.util.Iterator r9 = r9.iterator()
        L55:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L6d
            java.lang.Object r4 = r9.next()
            W7.f r4 = (W7.EventMetadata) r4
            long r4 = r4.getId()
            java.lang.Long r4 = kotlin.coroutines.jvm.internal.Boxing.e(r4)
            r2.add(r4)
            goto L55
        L6d:
            r0.f12310a = r7
            r0.f12313d = r3
            java.lang.Object r9 = r8.e(r2, r0)
            if (r9 != r1) goto L78
            return r1
        L78:
            java.util.List r9 = (java.util.List) r9
            int r8 = r9.size()
            int r7 = r7.size()
            if (r8 == r7) goto L8b
            java.lang.String r7 = "dtxCommunication"
            java.lang.String r8 = "ALERT! actual record size does not match metadata size"
            x8.f.a(r7, r8)
        L8b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: H7.b.b(java.util.List, W7.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(W7.d r8, int r9, kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.Boolean, ? extends java.util.List<W7.EventMetadata>>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof H7.b.C0188b
            if (r0 == 0) goto L13
            r0 = r10
            H7.b$b r0 = (H7.b.C0188b) r0
            int r1 = r0.f12319f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12319f = r1
            goto L18
        L13:
            H7.b$b r0 = new H7.b$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f12317d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f12319f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4d
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            int r8 = r0.f12316c
            java.lang.Object r9 = r0.f12314a
            kotlin.jvm.internal.Ref$BooleanRef r9 = (kotlin.jvm.internal.Ref.BooleanRef) r9
            kotlin.ResultKt.b(r10)
            goto L82
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            int r9 = r0.f12316c
            java.lang.Object r8 = r0.f12315b
            kotlin.jvm.internal.Ref$BooleanRef r8 = (kotlin.jvm.internal.Ref.BooleanRef) r8
            java.lang.Object r2 = r0.f12314a
            W7.d r2 = (W7.d) r2
            kotlin.ResultKt.b(r10)
            r6 = r10
            r10 = r8
            r8 = r2
            r2 = r6
            goto L66
        L4d:
            kotlin.ResultKt.b(r10)
            kotlin.jvm.internal.Ref$BooleanRef r10 = new kotlin.jvm.internal.Ref$BooleanRef
            r10.<init>()
            r10.f142828a = r5
            r0.f12314a = r8
            r0.f12315b = r10
            r0.f12316c = r9
            r0.f12319f = r5
            java.lang.Object r2 = r8.d(r5, r9, r0)
            if (r2 != r1) goto L66
            goto L7d
        L66:
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L8e
            r0.f12314a = r10
            r2 = 0
            r0.f12315b = r2
            r0.f12316c = r9
            r0.f12319f = r4
            java.lang.Object r8 = r8.d(r3, r9, r0)
            if (r8 != r1) goto L7e
        L7d:
            return r1
        L7e:
            r6 = r10
            r10 = r8
            r8 = r9
            r9 = r6
        L82:
            r2 = r10
            java.util.List r2 = (java.util.List) r2
            int r10 = r2.size()
            if (r10 >= r8) goto L8d
            r9.f142828a = r3
        L8d:
            r10 = r9
        L8e:
            java.util.List r2 = (java.util.List) r2
            kotlin.Pair r8 = new kotlin.Pair
            boolean r9 = r10.f142828a
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.a(r9)
            r8.<init>(r9, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: H7.b.c(W7.d, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object d(Continuation<? super Unit> continuation) {
        Object objG = this.databaseDataSource.g(this.timeProvider.a(), Duration.F(H7.c.f12329a), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x017d A[PHI: r1 r4 r7 r12 r13 r14 r15 r24
      0x017d: PHI (r1v20 java.lang.Object) = (r1v16 java.lang.Object), (r1v1 java.lang.Object) binds: [B:42:0x017a, B:18:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x017d: PHI (r4v7 boolean) = (r4v5 boolean), (r4v10 boolean) binds: [B:42:0x017a, B:18:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x017d: PHI (r7v7 long) = (r7v5 long), (r7v8 long) binds: [B:42:0x017a, B:18:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x017d: PHI (r12v8 java.util.List<W7.f>) = (r12v5 java.util.List<W7.f>), (r12v13 java.util.List<W7.f>) binds: [B:42:0x017a, B:18:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x017d: PHI (r13v6 java.util.List<W7.f>) = (r13v4 java.util.List<W7.f>), (r13v8 java.util.List<W7.f>) binds: [B:42:0x017a, B:18:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x017d: PHI (r14v6 java.util.List<W7.f>) = (r14v3 java.util.List<W7.f>), (r14v10 java.util.List<W7.f>) binds: [B:42:0x017a, B:18:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x017d: PHI (r15v6 H7.b) = (r15v3 H7.b), (r15v10 H7.b) binds: [B:42:0x017a, B:18:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x017d: PHI (r24v5 boolean) = (r24v3 boolean), (r24v8 boolean) binds: [B:42:0x017a, B:18:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(long r22, kotlin.coroutines.Continuation<? super kotlin.Pair<H7.DispatchableData, java.lang.Boolean>> r24) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H7.b.e(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final DispatchableData f(List<EventRecord> list, EndPointInfo endPointInfo) {
        return new DispatchableData(endPointInfo, list, ((EventRecord) CollectionsKt.s0(list)).getIsPriorityData());
    }
}
