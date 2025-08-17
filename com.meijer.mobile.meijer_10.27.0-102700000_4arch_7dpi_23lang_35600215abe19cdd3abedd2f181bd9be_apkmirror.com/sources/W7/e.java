package W7;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0019\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001c\u001a\u00020\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH\u0096@¢\u0006\u0004\b\u001c\u0010\u0016J\u001e\u0010\u001d\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fH\u0096@¢\u0006\u0004\b\u001d\u0010\u0016J\u0010\u0010\u001e\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010 ¨\u0006!"}, d2 = {"LW7/e;", "LW7/d;", "LW7/b;", "dao", "<init>", "(LW7/b;)V", "Lcom/dynatrace/agent/storage/db/EventRecord;", "eventRecord", "", "b", "(Lcom/dynatrace/agent/storage/db/EventRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isPriority", "", "limitRows", "", "LW7/f;", "d", "(ZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "recordIds", "e", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "now", "retentionTime", "g", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "eventRecords", "a", "f", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LW7/b;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements W7.d {

    /* renamed from: b, reason: collision with root package name */
    private static final a f38600b = new a(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final W7.b dao;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LW7/e$a;", "", "<init>", "()V", "", "EXCEPTION_LOG_MESSAGE", "Ljava/lang/String;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl", f = "EventDatabaseDataSourceImpl.kt", l = {90}, m = "delete")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f38602a;

        /* renamed from: c, reason: collision with root package name */
        int f38604c;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38602a = obj;
            this.f38604c |= Integer.MIN_VALUE;
            return e.this.a(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl", f = "EventDatabaseDataSourceImpl.kt", l = {116}, m = "deleteAll")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f38605a;

        /* renamed from: c, reason: collision with root package name */
        int f38607c;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38605a = obj;
            this.f38607c |= Integer.MIN_VALUE;
            return e.this.c(this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl", f = "EventDatabaseDataSourceImpl.kt", l = {77}, m = "deleteAllBefore")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f38608a;

        /* renamed from: c, reason: collision with root package name */
        int f38610c;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38608a = obj;
            this.f38610c |= Integer.MIN_VALUE;
            return e.this.g(0L, 0L, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl", f = "EventDatabaseDataSourceImpl.kt", l = {103}, m = "deleteIds")
    /* renamed from: W7.e$e, reason: collision with other inner class name */
    static final class C0831e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f38611a;

        /* renamed from: c, reason: collision with root package name */
        int f38613c;

        C0831e(Continuation<? super C0831e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38611a = obj;
            this.f38613c |= Integer.MIN_VALUE;
            return e.this.f(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl", f = "EventDatabaseDataSourceImpl.kt", l = {44}, m = "fetchEventMetadata")
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        boolean f38614a;

        /* renamed from: b, reason: collision with root package name */
        int f38615b;

        /* renamed from: c, reason: collision with root package name */
        Object f38616c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f38617d;

        /* renamed from: f, reason: collision with root package name */
        int f38619f;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38617d = obj;
            this.f38619f |= Integer.MIN_VALUE;
            return e.this.d(false, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl", f = "EventDatabaseDataSourceImpl.kt", l = {59}, m = "fetchEventRecordByIds")
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f38620a;

        /* renamed from: b, reason: collision with root package name */
        Object f38621b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f38622c;

        /* renamed from: e, reason: collision with root package name */
        int f38624e;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38622c = obj;
            this.f38624e |= Integer.MIN_VALUE;
            return e.this.e(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.storage.db.EventDatabaseDataSourceImpl", f = "EventDatabaseDataSourceImpl.kt", l = {23}, m = "put")
    static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f38625a;

        /* renamed from: c, reason: collision with root package name */
        int f38627c;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38625a = obj;
            this.f38627c |= Integer.MIN_VALUE;
            return e.this.b(null, this);
        }
    }

    public e(W7.b dao) {
        Intrinsics.j(dao, "dao");
        this.dao = dao;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // W7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.util.List<com.dynatrace.agent.storage.db.EventRecord> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof W7.e.b
            if (r0 == 0) goto L13
            r0 = r7
            W7.e$b r0 = (W7.e.b) r0
            int r1 = r0.f38604c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38604c = r1
            goto L18
        L13:
            W7.e$b r0 = new W7.e$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f38602a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f38604c
            java.lang.String r3 = "dtxStorage"
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Exception -> L2b
            goto L5c
        L2b:
            r6 = move-exception
            goto L57
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.b(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "db event delete, eventRecords: "
            r7.append(r2)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            x8.f.a(r3, r7)
            W7.b r7 = r5.dao     // Catch: java.lang.Exception -> L2b
            r0.f38604c = r4     // Catch: java.lang.Exception -> L2b
            java.lang.Object r6 = r7.a(r6, r0)     // Catch: java.lang.Exception -> L2b
            if (r6 != r1) goto L5c
            return r1
        L57:
            java.lang.String r7 = "operation was not completed for DB: delete"
            x8.f.b(r3, r7, r6)
        L5c:
            kotlin.Unit r6 = kotlin.Unit.f142422a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: W7.e.a(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // W7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(com.dynatrace.agent.storage.db.EventRecord r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof W7.e.h
            if (r0 == 0) goto L13
            r0 = r7
            W7.e$h r0 = (W7.e.h) r0
            int r1 = r0.f38627c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38627c = r1
            goto L18
        L13:
            W7.e$h r0 = new W7.e$h
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f38625a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f38627c
            java.lang.String r3 = "dtxStorage"
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Exception -> L2b
            goto L5c
        L2b:
            r6 = move-exception
            goto L57
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.b(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "db event put: "
            r7.append(r2)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            x8.f.a(r3, r7)
            W7.b r7 = r5.dao     // Catch: java.lang.Exception -> L2b
            r0.f38627c = r4     // Catch: java.lang.Exception -> L2b
            java.lang.Object r6 = r7.b(r6, r0)     // Catch: java.lang.Exception -> L2b
            if (r6 != r1) goto L5c
            return r1
        L57:
            java.lang.String r7 = "operation was not completed for DB: put"
            x8.f.b(r3, r7, r6)
        L5c:
            kotlin.Unit r6 = kotlin.Unit.f142422a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: W7.e.b(com.dynatrace.agent.storage.db.EventRecord, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // W7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof W7.e.c
            if (r0 == 0) goto L13
            r0 = r6
            W7.e$c r0 = (W7.e.c) r0
            int r1 = r0.f38607c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38607c = r1
            goto L18
        L13:
            W7.e$c r0 = new W7.e$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f38605a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f38607c
            java.lang.String r3 = "dtxStorage"
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Exception -> L2b
            goto L4d
        L2b:
            r6 = move-exception
            goto L48
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            kotlin.ResultKt.b(r6)
            java.lang.String r6 = "db event deleteAll"
            x8.f.a(r3, r6)
            W7.b r6 = r5.dao     // Catch: java.lang.Exception -> L2b
            r0.f38607c = r4     // Catch: java.lang.Exception -> L2b
            java.lang.Object r6 = r6.c(r0)     // Catch: java.lang.Exception -> L2b
            if (r6 != r1) goto L4d
            return r1
        L48:
            java.lang.String r0 = "operation was not completed for DB: deleteAll"
            x8.f.b(r3, r0, r6)
        L4d:
            kotlin.Unit r6 = kotlin.Unit.f142422a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: W7.e.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // W7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(boolean r7, int r8, kotlin.coroutines.Continuation<? super java.util.List<W7.EventMetadata>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof W7.e.f
            if (r0 == 0) goto L13
            r0 = r9
            W7.e$f r0 = (W7.e.f) r0
            int r1 = r0.f38619f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38619f = r1
            goto L18
        L13:
            W7.e$f r0 = new W7.e$f
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f38617d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f38619f
            java.lang.String r3 = "dtxStorage"
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 != r4) goto L35
            int r8 = r0.f38615b
            boolean r7 = r0.f38614a
            java.lang.Object r0 = r0.f38616c
            java.util.List r0 = (java.util.List) r0
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Exception -> L33
            goto L58
        L33:
            r7 = move-exception
            goto L81
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            kotlin.ResultKt.b(r9)
            java.util.List r9 = kotlin.collections.CollectionsKt.m()
            W7.b r2 = r6.dao     // Catch: java.lang.Exception -> L7f
            r0.f38616c = r9     // Catch: java.lang.Exception -> L7f
            r0.f38614a = r7     // Catch: java.lang.Exception -> L7f
            r0.f38615b = r8     // Catch: java.lang.Exception -> L7f
            r0.f38619f = r4     // Catch: java.lang.Exception -> L7f
            java.lang.Object r0 = r2.d(r7, r8, r0)     // Catch: java.lang.Exception -> L7f
            if (r0 != r1) goto L55
            return r1
        L55:
            r5 = r0
            r0 = r9
            r9 = r5
        L58:
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Exception -> L33
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7f
            r0.<init>()     // Catch: java.lang.Exception -> L7f
            java.lang.String r1 = "db event fetchEventMetadata: "
            r0.append(r1)     // Catch: java.lang.Exception -> L7f
            r0.append(r9)     // Catch: java.lang.Exception -> L7f
            java.lang.String r1 = ", isPriority: "
            r0.append(r1)     // Catch: java.lang.Exception -> L7f
            r0.append(r7)     // Catch: java.lang.Exception -> L7f
            java.lang.String r7 = ", limitRows: "
            r0.append(r7)     // Catch: java.lang.Exception -> L7f
            r0.append(r8)     // Catch: java.lang.Exception -> L7f
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Exception -> L7f
            x8.f.a(r3, r7)     // Catch: java.lang.Exception -> L7f
            return r9
        L7f:
            r7 = move-exception
            r0 = r9
        L81:
            java.lang.String r8 = "operation was not completed for DB: fetchEventMetadata"
            x8.f.b(r3, r8, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: W7.e.d(boolean, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // W7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(java.util.List<java.lang.Long> r7, kotlin.coroutines.Continuation<? super java.util.List<com.dynatrace.agent.storage.db.EventRecord>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof W7.e.g
            if (r0 == 0) goto L13
            r0 = r8
            W7.e$g r0 = (W7.e.g) r0
            int r1 = r0.f38624e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38624e = r1
            goto L18
        L13:
            W7.e$g r0 = new W7.e$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f38622c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f38624e
            java.lang.String r3 = "dtxStorage"
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 != r4) goto L39
            java.lang.Object r7 = r0.f38621b
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r0 = r0.f38620a
            java.util.List r0 = (java.util.List) r0
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Exception -> L37
            r5 = r8
            r8 = r7
            r7 = r0
            r0 = r5
            goto L57
        L37:
            r8 = move-exception
            goto L7d
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L41:
            kotlin.ResultKt.b(r8)
            java.util.List r8 = kotlin.collections.CollectionsKt.m()
            W7.b r2 = r6.dao     // Catch: java.lang.Exception -> L79
            r0.f38620a = r7     // Catch: java.lang.Exception -> L79
            r0.f38621b = r8     // Catch: java.lang.Exception -> L79
            r0.f38624e = r4     // Catch: java.lang.Exception -> L79
            java.lang.Object r0 = r2.e(r7, r0)     // Catch: java.lang.Exception -> L79
            if (r0 != r1) goto L57
            return r1
        L57:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L79
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L76
            r8.<init>()     // Catch: java.lang.Exception -> L76
            java.lang.String r1 = "db event fetchEventRecordByIds: "
            r8.append(r1)     // Catch: java.lang.Exception -> L76
            r8.append(r0)     // Catch: java.lang.Exception -> L76
            java.lang.String r1 = ", recordIds: "
            r8.append(r1)     // Catch: java.lang.Exception -> L76
            r8.append(r7)     // Catch: java.lang.Exception -> L76
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Exception -> L76
            x8.f.a(r3, r7)     // Catch: java.lang.Exception -> L76
            return r0
        L76:
            r8 = move-exception
            r7 = r0
            goto L7d
        L79:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L7d:
            java.lang.String r0 = "operation was not completed for DB: fetchEventRecordByIds"
            x8.f.b(r3, r0, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: W7.e.e(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // W7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(java.util.List<java.lang.Long> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof W7.e.C0831e
            if (r0 == 0) goto L13
            r0 = r7
            W7.e$e r0 = (W7.e.C0831e) r0
            int r1 = r0.f38613c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38613c = r1
            goto L18
        L13:
            W7.e$e r0 = new W7.e$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f38611a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f38613c
            java.lang.String r3 = "dtxStorage"
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Exception -> L2b
            goto L5c
        L2b:
            r6 = move-exception
            goto L57
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.b(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "db event deleteIds, recordIds: "
            r7.append(r2)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            x8.f.a(r3, r7)
            W7.b r7 = r5.dao     // Catch: java.lang.Exception -> L2b
            r0.f38613c = r4     // Catch: java.lang.Exception -> L2b
            java.lang.Object r6 = r7.f(r6, r0)     // Catch: java.lang.Exception -> L2b
            if (r6 != r1) goto L5c
            return r1
        L57:
            java.lang.String r7 = "operation was not completed for DB: deleteIds"
            x8.f.b(r3, r7, r6)
        L5c:
            kotlin.Unit r6 = kotlin.Unit.f142422a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: W7.e.f(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // W7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(long r9, long r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof W7.e.d
            if (r0 == 0) goto L14
            r0 = r13
            W7.e$d r0 = (W7.e.d) r0
            int r1 = r0.f38610c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f38610c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            W7.e$d r0 = new W7.e$d
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.f38608a
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r6.f38610c
            java.lang.String r7 = "dtxStorage"
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            kotlin.ResultKt.b(r13)     // Catch: java.lang.Exception -> L2d
            goto L69
        L2d:
            r0 = move-exception
            r9 = r0
            goto L64
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            kotlin.ResultKt.b(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r1 = "db event deleteAllBefore, now: "
            r13.append(r1)
            r13.append(r9)
            java.lang.String r1 = ", retentionTime: "
            r13.append(r1)
            r13.append(r11)
            java.lang.String r13 = r13.toString()
            x8.f.a(r7, r13)
            W7.b r1 = r8.dao     // Catch: java.lang.Exception -> L2d
            r6.f38610c = r2     // Catch: java.lang.Exception -> L2d
            r2 = r9
            r4 = r11
            java.lang.Object r9 = r1.g(r2, r4, r6)     // Catch: java.lang.Exception -> L2d
            if (r9 != r0) goto L69
            return r0
        L64:
            java.lang.String r10 = "operation was not completed for DB: deleteAllBefore"
            x8.f.b(r7, r10, r9)
        L69:
            kotlin.Unit r9 = kotlin.Unit.f142422a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: W7.e.g(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
