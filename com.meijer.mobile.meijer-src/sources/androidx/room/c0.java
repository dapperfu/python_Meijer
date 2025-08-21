package androidx.room;

import androidx.room.C6274s;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mv.C15809k;
import mv.CoroutineName;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 !2\u00020\u0001:\u00018Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0007\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u001b\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J9\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070'2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u000bH\u0000¢\u0006\u0004\b(\u0010)J1\u0010+\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0004\u0012\u00020$0*2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\tH\u0000¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b/\u0010.J\u0010\u00100\u001a\u00020\u000fH\u0080@¢\u0006\u0004\b0\u0010\u001dJ/\u00104\u001a\u00020\u000f2\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f012\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020\u000f01H\u0000¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000fH\u0000¢\u0006\u0004\b6\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R&\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0007\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010;R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010Q\u001a\u00060Nj\u0002`O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010PR(\u0010X\u001a\b\u0012\u0004\u0012\u00020\u000b018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006Y"}, d2 = {"Landroidx/room/c0;", "", "Landroidx/room/G;", "database", "", "", "shadowTablesMap", "", "viewTables", "", "tableNames", "", "useTempTable", "Lkotlin/Function1;", "", "", "onInvalidatedTablesIds", "<init>", "(Landroidx/room/G;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "names", "t", "([Ljava/lang/String;)[Ljava/lang/String;", "Landroidx/room/v;", "connection", "tableId", "v", "(Landroidx/room/v;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "w", "n", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j", "(Landroidx/room/v;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LA4/b;", "l", "(LA4/b;)V", "resolvedTableNames", "", "tableIds", "emitInitialState", "Lpv/f;", "m", "([Ljava/lang/String;[IZ)Lpv/f;", "Lkotlin/Pair;", "y", "([Ljava/lang/String;)Lkotlin/Pair;", "p", "([I)Z", "q", "x", "Lkotlin/Function0;", "onRefreshScheduled", "onRefreshCompleted", "r", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "s", "()V", "a", "Landroidx/room/G;", "b", "Ljava/util/Map;", "c", "d", "Z", "e", "Lkotlin/jvm/functions/Function1;", "f", "tableIdLookup", "g", "[Ljava/lang/String;", "tablesNames", "Landroidx/room/s;", "h", "Landroidx/room/s;", "observedTableStates", "Landroidx/room/t;", "i", "Landroidx/room/t;", "observedTableVersions", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/room/concurrent/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "pendingRefresh", "k", "Lkotlin/jvm/functions/Function0;", "getOnAllowRefresh$room_runtime_release", "()Lkotlin/jvm/functions/Function0;", "u", "(Lkotlin/jvm/functions/Function0;)V", "onAllowRefresh", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class c0 {

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f58676m = {"INSERT", "UPDATE", "DELETE"};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final G database;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> shadowTablesMap;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Set<String>> viewTables;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean useTempTable;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function1<Set<Integer>, Unit> onInvalidatedTablesIds;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Integer> tableIdLookup;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String[] tablesNames;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C6274s observedTableStates;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final C6275t observedTableVersions;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean pendingRefresh;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Function0<Boolean> onAllowRefresh;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Landroidx/room/c0$a;", "", "<init>", "()V", "", "tableName", "triggerType", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "TRIGGERS", "[Ljava/lang/String;", "UPDATE_TABLE_NAME", "Ljava/lang/String;", "TABLE_ID_COLUMN_NAME", "INVALIDATED_COLUMN_NAME", "CREATE_TRACKING_TABLE_SQL", "DROP_TRACKING_TABLE_SQL", "SELECT_UPDATED_TABLES_SQL", "RESET_UPDATED_TABLES_SQL", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.room.c0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(String tableName, String triggerType) {
            return "room_table_modification_trigger_" + tableName + '_' + triggerType;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {440, 448}, m = "checkInvalidatedTables")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f58688a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f58689b;

        /* renamed from: d, reason: collision with root package name */
        int f58691d;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f58689b = obj;
            this.f58691d |= Integer.MIN_VALUE;
            return c0.this.j(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {HttpResponseStatus.ERROR_PRECONDITION_FAILED}, m = "notifyInvalidation")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f58710a;

        /* renamed from: b, reason: collision with root package name */
        Object f58711b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f58712c;

        /* renamed from: e, reason: collision with root package name */
        int f58714e;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f58712c = obj;
            this.f58714e |= Integer.MIN_VALUE;
            return c0.this.n(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/room/X;", "connection", "", "", "<anonymous>", "(Landroidx/room/X;)Ljava/util/Set;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1", f = "InvalidationTracker.kt", l = {HttpResponseStatus.ERROR_REQUEST_ENTITY_TOO_LARGE, 420}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<X, Continuation<? super Set<? extends Integer>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f58715a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f58716b;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = c0.this.new e(continuation);
            eVar.f58716b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(X x10, Continuation<? super Set<Integer>> continuation) {
            return ((e) create(x10, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/room/W;", "", "", "<anonymous>", "(Landroidx/room/W;)Ljava/util/Set;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1", f = "InvalidationTracker.kt", l = {421}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<W<Set<? extends Integer>>, Continuation<? super Set<? extends Integer>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f58718a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f58719b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c0 f58720c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c0 c0Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f58720c = c0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f58720c, continuation);
                aVar.f58719b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(W<Set<Integer>> w10, Continuation<? super Set<Integer>> continuation) {
                return ((a) create(w10, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f58718a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                W w10 = (W) this.f58719b;
                c0 c0Var = this.f58720c;
                this.f58718a = 1;
                Object objJ = c0Var.j(w10, this);
                if (objJ == objF) {
                    return objF;
                }
                return objJ;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        
            if (r7 == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r6.f58715a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r7)     // Catch: android.database.SQLException -> L5a
                goto L57
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f58716b
                androidx.room.X r1 = (androidx.room.X) r1
                kotlin.ResultKt.b(r7)
                goto L35
            L22:
                kotlin.ResultKt.b(r7)
                java.lang.Object r7 = r6.f58716b
                r1 = r7
                androidx.room.X r1 = (androidx.room.X) r1
                r6.f58716b = r1
                r6.f58715a = r3
                java.lang.Object r7 = r1.b(r6)
                if (r7 != r0) goto L35
                goto L56
            L35:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L42
                java.util.Set r7 = kotlin.collections.SetsKt.e()
                return r7
            L42:
                androidx.room.X$a r7 = androidx.room.X.a.f58661b     // Catch: android.database.SQLException -> L5a
                androidx.room.c0$e$a r3 = new androidx.room.c0$e$a     // Catch: android.database.SQLException -> L5a
                androidx.room.c0 r4 = androidx.room.c0.this     // Catch: android.database.SQLException -> L5a
                r5 = 0
                r3.<init>(r4, r5)     // Catch: android.database.SQLException -> L5a
                r6.f58716b = r5     // Catch: android.database.SQLException -> L5a
                r6.f58715a = r2     // Catch: android.database.SQLException -> L5a
                java.lang.Object r7 = r1.a(r7, r3, r6)     // Catch: android.database.SQLException -> L5a
                if (r7 != r0) goto L57
            L56:
                return r0
            L57:
                java.util.Set r7 = (java.util.Set) r7     // Catch: android.database.SQLException -> L5a
                return r7
            L5a:
                java.util.Set r7 = kotlin.collections.SetsKt.e()
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.c0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$refreshInvalidationAsync$3", f = "InvalidationTracker.kt", l = {389}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f58721a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f58723c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Function0<Unit> function0, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f58723c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c0.this.new f(this.f58723c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f58721a;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    c0 c0Var = c0.this;
                    this.f58721a = 1;
                    obj = c0Var.n(this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                this.f58723c.invoke();
                return Unit.f143329a;
            } catch (Throwable th2) {
                this.f58723c.invoke();
                throw th2;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {323, 328}, m = "startTrackingTable")
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f58724a;

        /* renamed from: b, reason: collision with root package name */
        Object f58725b;

        /* renamed from: c, reason: collision with root package name */
        Object f58726c;

        /* renamed from: d, reason: collision with root package name */
        Object f58727d;

        /* renamed from: e, reason: collision with root package name */
        int f58728e;

        /* renamed from: f, reason: collision with root package name */
        int f58729f;

        /* renamed from: g, reason: collision with root package name */
        int f58730g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f58731h;

        /* renamed from: j, reason: collision with root package name */
        int f58733j;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f58731h = obj;
            this.f58733j |= Integer.MIN_VALUE;
            return c0.this.v(null, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {342}, m = "stopTrackingTable")
    static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f58734a;

        /* renamed from: b, reason: collision with root package name */
        Object f58735b;

        /* renamed from: c, reason: collision with root package name */
        Object f58736c;

        /* renamed from: d, reason: collision with root package name */
        int f58737d;

        /* renamed from: e, reason: collision with root package name */
        int f58738e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f58739f;

        /* renamed from: h, reason: collision with root package name */
        int f58741h;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f58739f = obj;
            this.f58741h |= Integer.MIN_VALUE;
            return c0.this.w(null, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES}, m = "syncTriggers$room_runtime_release")
    static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f58742a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f58743b;

        /* renamed from: d, reason: collision with root package name */
        int f58745d;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f58743b = obj;
            this.f58745d |= Integer.MIN_VALUE;
            return c0.this.x(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/room/X;", "connection", "", "<anonymous>", "(Landroidx/room/X;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1", f = "InvalidationTracker.kt", l = {HttpResponseStatus.REDIRECTION_MOVED_PERMANENTLY, 309}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<X, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f58746a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f58747b;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            j jVar = c0.this.new j(continuation);
            jVar.f58747b = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(X x10, Continuation<? super Unit> continuation) {
            return ((j) create(x10, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/room/W;", "", "<anonymous>", "(Landroidx/room/W;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1", f = "InvalidationTracker.kt", l = {313, 314}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class a extends SuspendLambda implements Function2<W<Unit>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f58749a;

            /* renamed from: b, reason: collision with root package name */
            Object f58750b;

            /* renamed from: c, reason: collision with root package name */
            Object f58751c;

            /* renamed from: d, reason: collision with root package name */
            int f58752d;

            /* renamed from: e, reason: collision with root package name */
            int f58753e;

            /* renamed from: f, reason: collision with root package name */
            int f58754f;

            /* renamed from: g, reason: collision with root package name */
            int f58755g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ C6274s.a[] f58756h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ c0 f58757i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ X f58758j;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: androidx.room.c0$j$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C1155a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[C6274s.a.values().length];
                    try {
                        iArr[C6274s.a.f58863a.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[C6274s.a.f58864b.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[C6274s.a.f58865c.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C6274s.a[] aVarArr, c0 c0Var, X x10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f58756h = aVarArr;
                this.f58757i = c0Var;
                this.f58758j = x10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f58756h, this.f58757i, this.f58758j, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(W<Unit> w10, Continuation<? super Unit> continuation) {
                return ((a) create(w10, continuation)).invokeSuspend(Unit.f143329a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
            
                if (r7.v(r12, r6, r11) == r0) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
            
                r6 = r12;
                r5 = r9;
             */
            /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0086 -> B:27:0x0087). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r11.f58755g
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L2c
                    if (r1 == r3) goto Le
                    if (r1 != r2) goto L24
                Le:
                    int r1 = r11.f58754f
                    int r4 = r11.f58753e
                    int r5 = r11.f58752d
                    java.lang.Object r6 = r11.f58751c
                    androidx.room.X r6 = (androidx.room.X) r6
                    java.lang.Object r7 = r11.f58750b
                    androidx.room.c0 r7 = (androidx.room.c0) r7
                    java.lang.Object r8 = r11.f58749a
                    androidx.room.s$a[] r8 = (androidx.room.C6274s.a[]) r8
                    kotlin.ResultKt.b(r12)
                    goto L68
                L24:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L2c:
                    kotlin.ResultKt.b(r12)
                    androidx.room.s$a[] r12 = r11.f58756h
                    androidx.room.c0 r1 = r11.f58757i
                    androidx.room.X r4 = r11.f58758j
                    int r5 = r12.length
                    r6 = 0
                    r8 = r12
                    r7 = r1
                    r12 = r4
                    r1 = r5
                    r4 = r6
                L3c:
                    if (r4 >= r1) goto L89
                    r5 = r8[r4]
                    int r9 = r6 + 1
                    int[] r10 = androidx.room.c0.j.a.C1155a.$EnumSwitchMapping$0
                    int r5 = r5.ordinal()
                    r5 = r10[r5]
                    if (r5 == r3) goto L86
                    if (r5 == r2) goto L71
                    r10 = 3
                    if (r5 != r10) goto L6b
                    r11.f58749a = r8
                    r11.f58750b = r7
                    r11.f58751c = r12
                    r11.f58752d = r9
                    r11.f58753e = r4
                    r11.f58754f = r1
                    r11.f58755g = r2
                    java.lang.Object r5 = androidx.room.c0.i(r7, r12, r6, r11)
                    if (r5 != r0) goto L66
                    goto L85
                L66:
                    r6 = r12
                    r5 = r9
                L68:
                    r12 = r6
                    r6 = r5
                    goto L87
                L6b:
                    kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
                    r12.<init>()
                    throw r12
                L71:
                    r11.f58749a = r8
                    r11.f58750b = r7
                    r11.f58751c = r12
                    r11.f58752d = r9
                    r11.f58753e = r4
                    r11.f58754f = r1
                    r11.f58755g = r3
                    java.lang.Object r5 = androidx.room.c0.h(r7, r12, r6, r11)
                    if (r5 != r0) goto L66
                L85:
                    return r0
                L86:
                    r6 = r9
                L87:
                    int r4 = r4 + r3
                    goto L3c
                L89:
                    kotlin.Unit r12 = kotlin.Unit.f143329a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.c0.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
        
            if (r1.a(r3, r4, r7) == r0) goto L21;
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
                int r1 = r7.f58746a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r8)
                goto L61
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                java.lang.Object r1 = r7.f58747b
                androidx.room.X r1 = (androidx.room.X) r1
                kotlin.ResultKt.b(r8)
                goto L35
            L22:
                kotlin.ResultKt.b(r8)
                java.lang.Object r8 = r7.f58747b
                r1 = r8
                androidx.room.X r1 = (androidx.room.X) r1
                r7.f58747b = r1
                r7.f58746a = r3
                java.lang.Object r8 = r1.b(r7)
                if (r8 != r0) goto L35
                goto L60
            L35:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L40
                kotlin.Unit r8 = kotlin.Unit.f143329a
                return r8
            L40:
                androidx.room.c0 r8 = androidx.room.c0.this
                androidx.room.s r8 = androidx.room.c0.e(r8)
                androidx.room.s$a[] r8 = r8.b()
                if (r8 == 0) goto L61
                androidx.room.X$a r3 = androidx.room.X.a.f58661b
                androidx.room.c0$j$a r4 = new androidx.room.c0$j$a
                androidx.room.c0 r5 = androidx.room.c0.this
                r6 = 0
                r4.<init>(r8, r5, r1, r6)
                r7.f58747b = r6
                r7.f58746a = r2
                java.lang.Object r8 = r1.a(r3, r4, r7)
                if (r8 != r0) goto L61
            L60:
                return r0
            L61:
                kotlin.Unit r8 = kotlin.Unit.f143329a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.c0.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o() {
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpv/g;", "", "", "", "<anonymous>", "(Lpv/g;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1", f = "InvalidationTracker.kt", l = {233, 233, 237}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC16562g<? super Set<? extends String>>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f58692a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f58693b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int[] f58695d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f58696e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String[] f58697f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1", f = "InvalidationTracker.kt", l = {233}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f58698a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c0 f58699b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c0 c0Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f58699b = c0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f58699b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f58698a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    c0 c0Var = this.f58699b;
                    this.f58698a = 1;
                    if (c0Var.x(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @SourceDebugExtension
        static final class b<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<int[]> f58700a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f58701b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g<Set<String>> f58702c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String[] f58703d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int[] f58704e;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2", f = "InvalidationTracker.kt", l = {241, 250}, m = "emit")
            static final class a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                Object f58705a;

                /* renamed from: b, reason: collision with root package name */
                Object f58706b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f58707c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ b<T> f58708d;

                /* renamed from: e, reason: collision with root package name */
                int f58709e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                a(b<? super T> bVar, Continuation<? super a> continuation) {
                    super(continuation);
                    this.f58708d = bVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f58707c = obj;
                    this.f58709e |= Integer.MIN_VALUE;
                    return this.f58708d.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            b(Ref.ObjectRef<int[]> objectRef, boolean z10, InterfaceC16562g<? super Set<String>> interfaceC16562g, String[] strArr, int[] iArr) {
                this.f58700a = objectRef;
                this.f58701b = z10;
                this.f58702c = interfaceC16562g;
                this.f58703d = strArr;
                this.f58704e = iArr;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
            
                if (r14.emit(r2, r0) == r1) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x00a5, code lost:
            
                if (r14.emit(r2, r0) == r1) goto L37;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
            
                return r1;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(int[] r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof androidx.room.c0.c.b.a
                    if (r0 == 0) goto L13
                    r0 = r14
                    androidx.room.c0$c$b$a r0 = (androidx.room.c0.c.b.a) r0
                    int r1 = r0.f58709e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f58709e = r1
                    goto L18
                L13:
                    androidx.room.c0$c$b$a r0 = new androidx.room.c0$c$b$a
                    r0.<init>(r12, r14)
                L18:
                    java.lang.Object r14 = r0.f58707c
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f58709e
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L31
                    if (r2 != r3) goto L29
                    goto L31
                L29:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L31:
                    java.lang.Object r13 = r0.f58706b
                    int[] r13 = (int[]) r13
                    java.lang.Object r0 = r0.f58705a
                    androidx.room.c0$c$b r0 = (androidx.room.c0.c.b) r0
                    kotlin.ResultKt.b(r14)
                    goto La9
                L3e:
                    kotlin.ResultKt.b(r14)
                    kotlin.jvm.internal.Ref$ObjectRef<int[]> r14 = r12.f58700a
                    T r2 = r14.f143742a
                    if (r2 != 0) goto L60
                    boolean r14 = r12.f58701b
                    if (r14 == 0) goto La8
                    pv.g<java.util.Set<java.lang.String>> r14 = r12.f58702c
                    java.lang.String[] r2 = r12.f58703d
                    java.util.Set r2 = kotlin.collections.ArraysKt.t1(r2)
                    r0.f58705a = r12
                    r0.f58706b = r13
                    r0.f58709e = r4
                    java.lang.Object r14 = r14.emit(r2, r0)
                    if (r14 != r1) goto La8
                    goto La7
                L60:
                    java.lang.String[] r2 = r12.f58703d
                    int[] r4 = r12.f58704e
                    java.util.ArrayList r5 = new java.util.ArrayList
                    r5.<init>()
                    int r6 = r2.length
                    r7 = 0
                    r8 = r7
                L6c:
                    if (r7 >= r6) goto L8f
                    r9 = r2[r7]
                    int r10 = r8 + 1
                    T r11 = r14.f143742a
                    if (r11 == 0) goto L87
                    int[] r11 = (int[]) r11
                    r8 = r4[r8]
                    r11 = r11[r8]
                    r8 = r13[r8]
                    if (r11 == r8) goto L83
                    r5.add(r9)
                L83:
                    int r7 = r7 + 1
                    r8 = r10
                    goto L6c
                L87:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "Required value was null."
                    r13.<init>(r14)
                    throw r13
                L8f:
                    boolean r14 = r5.isEmpty()
                    if (r14 != 0) goto La8
                    pv.g<java.util.Set<java.lang.String>> r14 = r12.f58702c
                    java.util.Set r2 = kotlin.collections.CollectionsKt.o1(r5)
                    r0.f58705a = r12
                    r0.f58706b = r13
                    r0.f58709e = r3
                    java.lang.Object r14 = r14.emit(r2, r0)
                    if (r14 != r1) goto La8
                La7:
                    return r1
                La8:
                    r0 = r12
                La9:
                    kotlin.jvm.internal.Ref$ObjectRef<int[]> r14 = r0.f58700a
                    r14.f143742a = r13
                    kotlin.Unit r13 = kotlin.Unit.f143329a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.c0.c.b.emit(int[], kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int[] iArr, boolean z10, String[] strArr, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f58695d = iArr;
            this.f58696e = z10;
            this.f58697f = strArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = c0.this.new c(this.f58695d, this.f58696e, this.f58697f, continuation);
            cVar.f58693b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super Set<String>> interfaceC16562g, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16562g, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
        
            if (mv.C15805i.g((kotlin.coroutines.CoroutineContext) r12, r5, r11) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
        
            if (r12.a(r4, r11) != r0) goto L29;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r11.f58692a
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L33
                if (r1 == r5) goto L2b
                if (r1 == r4) goto L23
                if (r1 == r3) goto L1a
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1a:
                kotlin.ResultKt.b(r12)     // Catch: java.lang.Throwable -> L1f
                goto L95
            L1f:
                r0 = move-exception
                r12 = r0
                goto L9b
            L23:
                java.lang.Object r1 = r11.f58693b
                pv.g r1 = (pv.InterfaceC16562g) r1
                kotlin.ResultKt.b(r12)
                goto L71
            L2b:
                java.lang.Object r1 = r11.f58693b
                pv.g r1 = (pv.InterfaceC16562g) r1
                kotlin.ResultKt.b(r12)
                goto L5d
            L33:
                kotlin.ResultKt.b(r12)
                java.lang.Object r12 = r11.f58693b
                pv.g r12 = (pv.InterfaceC16562g) r12
                androidx.room.c0 r1 = androidx.room.c0.this
                androidx.room.s r1 = androidx.room.c0.e(r1)
                int[] r6 = r11.f58695d
                boolean r1 = r1.c(r6)
                if (r1 == 0) goto L73
                androidx.room.c0 r1 = androidx.room.c0.this
                androidx.room.G r1 = androidx.room.c0.d(r1)
                r11.f58693b = r12
                r11.f58692a = r5
                r5 = 0
                java.lang.Object r1 = w4.C17824b.d(r1, r5, r11)
                if (r1 != r0) goto L5a
                goto L94
            L5a:
                r10 = r1
                r1 = r12
                r12 = r10
            L5d:
                kotlin.coroutines.CoroutineContext r12 = (kotlin.coroutines.CoroutineContext) r12
                androidx.room.c0$c$a r5 = new androidx.room.c0$c$a
                androidx.room.c0 r6 = androidx.room.c0.this
                r5.<init>(r6, r2)
                r11.f58693b = r1
                r11.f58692a = r4
                java.lang.Object r12 = mv.C15805i.g(r12, r5, r11)
                if (r12 != r0) goto L71
                goto L94
            L71:
                r7 = r1
                goto L74
            L73:
                r7 = r12
            L74:
                kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Throwable -> L1f
                r5.<init>()     // Catch: java.lang.Throwable -> L1f
                androidx.room.c0 r12 = androidx.room.c0.this     // Catch: java.lang.Throwable -> L1f
                androidx.room.t r12 = androidx.room.c0.f(r12)     // Catch: java.lang.Throwable -> L1f
                androidx.room.c0$c$b r4 = new androidx.room.c0$c$b     // Catch: java.lang.Throwable -> L1f
                boolean r6 = r11.f58696e     // Catch: java.lang.Throwable -> L1f
                java.lang.String[] r8 = r11.f58697f     // Catch: java.lang.Throwable -> L1f
                int[] r9 = r11.f58695d     // Catch: java.lang.Throwable -> L1f
                r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L1f
                r11.f58693b = r2     // Catch: java.lang.Throwable -> L1f
                r11.f58692a = r3     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r12 = r12.a(r4, r11)     // Catch: java.lang.Throwable -> L1f
                if (r12 != r0) goto L95
            L94:
                return r0
            L95:
                kotlin.KotlinNothingValueException r12 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L1f
                r12.<init>()     // Catch: java.lang.Throwable -> L1f
                throw r12     // Catch: java.lang.Throwable -> L1f
            L9b:
                androidx.room.c0 r0 = androidx.room.c0.this
                androidx.room.s r0 = androidx.room.c0.e(r0)
                int[] r1 = r11.f58695d
                r0.d(r1)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.c0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c0(G database, Map<String, String> shadowTablesMap, Map<String, ? extends Set<String>> viewTables, String[] tableNames, boolean z10, Function1<? super Set<Integer>, Unit> onInvalidatedTablesIds) {
        String lowerCase;
        Intrinsics.j(database, "database");
        Intrinsics.j(shadowTablesMap, "shadowTablesMap");
        Intrinsics.j(viewTables, "viewTables");
        Intrinsics.j(tableNames, "tableNames");
        Intrinsics.j(onInvalidatedTablesIds, "onInvalidatedTablesIds");
        this.database = database;
        this.shadowTablesMap = shadowTablesMap;
        this.viewTables = viewTables;
        this.useTempTable = z10;
        this.onInvalidatedTablesIds = onInvalidatedTablesIds;
        this.pendingRefresh = new AtomicBoolean(false);
        this.onAllowRefresh = new Function0() { // from class: androidx.room.b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(c0.o());
            }
        };
        this.tableIdLookup = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = tableNames[i10];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            Intrinsics.i(lowerCase2, "toLowerCase(...)");
            this.tableIdLookup.put(lowerCase2, Integer.valueOf(i10));
            String str2 = this.shadowTablesMap.get(tableNames[i10]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                Intrinsics.i(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr[i10] = lowerCase2;
        }
        this.tablesNames = strArr;
        for (Map.Entry<String, String> entry : this.shadowTablesMap.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = value.toLowerCase(locale2);
            Intrinsics.i(lowerCase3, "toLowerCase(...)");
            if (this.tableIdLookup.containsKey(lowerCase3)) {
                String lowerCase4 = entry.getKey().toLowerCase(locale2);
                Intrinsics.i(lowerCase4, "toLowerCase(...)");
                Map<String, Integer> map = this.tableIdLookup;
                map.put(lowerCase4, MapsKt.l(map, lowerCase3));
            }
        }
        this.observedTableStates = new C6274s(this.tablesNames.length);
        this.observedTableVersions = new C6275t(this.tablesNames.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(androidx.room.InterfaceC6277v r6, kotlin.coroutines.Continuation<? super java.util.Set<java.lang.Integer>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.room.c0.b
            if (r0 == 0) goto L13
            r0 = r7
            androidx.room.c0$b r0 = (androidx.room.c0.b) r0
            int r1 = r0.f58691d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58691d = r1
            goto L18
        L13:
            androidx.room.c0$b r0 = new androidx.room.c0$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f58689b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f58691d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f58688a
            java.util.Set r6 = (java.util.Set) r6
            kotlin.ResultKt.b(r7)
            return r6
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f58688a
            androidx.room.v r6 = (androidx.room.InterfaceC6277v) r6
            kotlin.ResultKt.b(r7)
            goto L55
        L40:
            kotlin.ResultKt.b(r7)
            androidx.room.a0 r7 = new androidx.room.a0
            r7.<init>()
            r0.f58688a = r6
            r0.f58691d = r4
            java.lang.String r2 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r7 = r6.d(r2, r7, r0)
            if (r7 != r1) goto L55
            goto L6c
        L55:
            java.util.Set r7 = (java.util.Set) r7
            r2 = r7
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L6d
            r0.f58688a = r7
            r0.f58691d = r3
            java.lang.String r2 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r6 = androidx.room.Z.b(r6, r2, r0)
            if (r6 != r1) goto L6d
        L6c:
            return r1
        L6d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.c0.j(androidx.room.v, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set k(A4.d statement) {
        Intrinsics.j(statement, "statement");
        Set setB = SetsKt.b();
        while (statement.N3()) {
            setB.add(Integer.valueOf((int) statement.getLong(0)));
        }
        return SetsKt.a(setB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(kotlin.coroutines.Continuation<? super java.util.Set<java.lang.Integer>> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.room.c0.d
            if (r0 == 0) goto L13
            r0 = r8
            androidx.room.c0$d r0 = (androidx.room.c0.d) r0
            int r1 = r0.f58714e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58714e = r1
            goto L18
        L13:
            androidx.room.c0$d r0 = new androidx.room.c0$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f58712c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f58714e
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r1 = r0.f58711b
            r4.a r1 = (r4.C16833a) r1
            java.lang.Object r0 = r0.f58710a
            androidx.room.c0 r0 = (androidx.room.c0) r0
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L31
            goto L8e
        L31:
            r8 = move-exception
            goto La7
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3c:
            kotlin.ResultKt.b(r8)
            androidx.room.G r8 = r7.database
            r4.a r8 = r8.getCloseBarrier()
            boolean r2 = r8.a()
            if (r2 == 0) goto Lab
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.pendingRefresh     // Catch: java.lang.Throwable -> L5c
            r4 = 0
            boolean r2 = r2.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L5c
            if (r2 != 0) goto L60
            java.util.Set r0 = kotlin.collections.SetsKt.e()     // Catch: java.lang.Throwable -> L5c
            r8.d()
            return r0
        L5c:
            r0 = move-exception
            r1 = r8
            r8 = r0
            goto La7
        L60:
            kotlin.jvm.functions.Function0<java.lang.Boolean> r2 = r7.onAllowRefresh     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L5c
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L5c
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L5c
            if (r2 != 0) goto L76
            java.util.Set r0 = kotlin.collections.SetsKt.e()     // Catch: java.lang.Throwable -> L5c
            r8.d()
            return r0
        L76:
            androidx.room.G r2 = r7.database     // Catch: java.lang.Throwable -> L5c
            androidx.room.c0$e r5 = new androidx.room.c0$e     // Catch: java.lang.Throwable -> L5c
            r6 = 0
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L5c
            r0.f58710a = r7     // Catch: java.lang.Throwable -> L5c
            r0.f58711b = r8     // Catch: java.lang.Throwable -> L5c
            r0.f58714e = r3     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r0 = r2.useConnection$room_runtime_release(r4, r5, r0)     // Catch: java.lang.Throwable -> L5c
            if (r0 != r1) goto L8b
            return r1
        L8b:
            r1 = r8
            r8 = r0
            r0 = r7
        L8e:
            java.util.Set r8 = (java.util.Set) r8     // Catch: java.lang.Throwable -> L31
            r2 = r8
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L31
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L31
            if (r2 != 0) goto La3
            androidx.room.t r2 = r0.observedTableVersions     // Catch: java.lang.Throwable -> L31
            r2.b(r8)     // Catch: java.lang.Throwable -> L31
            kotlin.jvm.functions.Function1<java.util.Set<java.lang.Integer>, kotlin.Unit> r0 = r0.onInvalidatedTablesIds     // Catch: java.lang.Throwable -> L31
            r0.invoke(r8)     // Catch: java.lang.Throwable -> L31
        La3:
            r1.d()
            return r8
        La7:
            r1.d()
            throw r8
        Lab:
            java.util.Set r8 = kotlin.collections.SetsKt.e()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.c0.n(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ff, code lost:
    
        if (androidx.room.Z.b(r11, r3, r4) == r5) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ff -> B:29:0x0102). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(androidx.room.InterfaceC6277v r18, int r19, kotlin.coroutines.Continuation<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.c0.v(androidx.room.v, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0085 -> B:20:0x0087). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(androidx.room.InterfaceC6277v r10, int r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof androidx.room.c0.h
            if (r0 == 0) goto L13
            r0 = r12
            androidx.room.c0$h r0 = (androidx.room.c0.h) r0
            int r1 = r0.f58741h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58741h = r1
            goto L18
        L13:
            androidx.room.c0$h r0 = new androidx.room.c0$h
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f58739f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f58741h
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            int r10 = r0.f58738e
            int r11 = r0.f58737d
            java.lang.Object r2 = r0.f58736c
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.lang.Object r4 = r0.f58735b
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.f58734a
            androidx.room.v r5 = (androidx.room.InterfaceC6277v) r5
            kotlin.ResultKt.b(r12)
            r12 = r4
            goto L87
        L3a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L42:
            kotlin.ResultKt.b(r12)
            java.lang.String[] r12 = r9.tablesNames
            r11 = r12[r11]
            java.lang.String[] r12 = androidx.room.c0.f58676m
            int r2 = r12.length
            r4 = 0
            r8 = r11
            r11 = r10
            r10 = r2
            r2 = r12
            r12 = r8
        L52:
            if (r4 >= r10) goto L8b
            r5 = r2[r4]
            androidx.room.c0$a r6 = androidx.room.c0.INSTANCE
            java.lang.String r5 = androidx.room.c0.Companion.a(r6, r12, r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "DROP TRIGGER IF EXISTS `"
            r6.append(r7)
            r6.append(r5)
            r5 = 96
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r0.f58734a = r11
            r0.f58735b = r12
            r0.f58736c = r2
            r0.f58737d = r4
            r0.f58738e = r10
            r0.f58741h = r3
            java.lang.Object r5 = androidx.room.Z.b(r11, r5, r0)
            if (r5 != r1) goto L85
            return r1
        L85:
            r5 = r11
            r11 = r4
        L87:
            int r4 = r11 + 1
            r11 = r5
            goto L52
        L8b:
            kotlin.Unit r10 = kotlin.Unit.f143329a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.c0.w(androidx.room.v, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void l(A4.b connection) {
        Intrinsics.j(connection, "connection");
        A4.d dVarS3 = connection.S3("PRAGMA query_only");
        try {
            dVarS3.N3();
            boolean zK2 = dVarS3.k2(0);
            AutoCloseableKt.a(dVarS3, null);
            if (zK2) {
                return;
            }
            A4.a.a(connection, "PRAGMA temp_store = MEMORY");
            A4.a.a(connection, "PRAGMA recursive_triggers = 1");
            A4.a.a(connection, "DROP TABLE IF EXISTS room_table_modification_log");
            if (this.useTempTable) {
                A4.a.a(connection, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            } else {
                A4.a.a(connection, StringsKt.Q("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", "", false, 4, null));
            }
            this.observedTableStates.a();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AutoCloseableKt.a(dVarS3, th2);
                throw th3;
            }
        }
    }

    public final InterfaceC16561f<Set<String>> m(String[] resolvedTableNames, int[] tableIds, boolean emitInitialState) {
        Intrinsics.j(resolvedTableNames, "resolvedTableNames");
        Intrinsics.j(tableIds, "tableIds");
        return C16563h.E(new c(tableIds, emitInitialState, resolvedTableNames, null));
    }

    public final boolean p(int[] tableIds) {
        Intrinsics.j(tableIds, "tableIds");
        return this.observedTableStates.c(tableIds);
    }

    public final boolean q(int[] tableIds) {
        Intrinsics.j(tableIds, "tableIds");
        return this.observedTableStates.d(tableIds);
    }

    public final void r(Function0<Unit> onRefreshScheduled, Function0<Unit> onRefreshCompleted) {
        Intrinsics.j(onRefreshScheduled, "onRefreshScheduled");
        Intrinsics.j(onRefreshCompleted, "onRefreshCompleted");
        if (this.pendingRefresh.compareAndSet(false, true)) {
            onRefreshScheduled.invoke();
            C15809k.d(this.database.getCoroutineScope(), new CoroutineName("Room Invalidation Tracker Refresh"), null, new f(onRefreshCompleted, null), 2, null);
        }
    }

    public final void s() {
        this.observedTableStates.e();
    }

    public final void u(Function0<Boolean> function0) {
        Intrinsics.j(function0, "<set-?>");
        this.onAllowRefresh = function0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(kotlin.coroutines.Continuation<? super kotlin.Unit> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.room.c0.i
            if (r0 == 0) goto L13
            r0 = r8
            androidx.room.c0$i r0 = (androidx.room.c0.i) r0
            int r1 = r0.f58745d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58745d = r1
            goto L18
        L13:
            androidx.room.c0$i r0 = new androidx.room.c0$i
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f58743b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f58745d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f58742a
            r4.a r0 = (r4.C16833a) r0
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L2d
            goto L5b
        L2d:
            r8 = move-exception
            goto L63
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            kotlin.ResultKt.b(r8)
            androidx.room.G r8 = r7.database
            r4.a r8 = r8.getCloseBarrier()
            boolean r2 = r8.a()
            if (r2 == 0) goto L67
            androidx.room.G r2 = r7.database     // Catch: java.lang.Throwable -> L5f
            androidx.room.c0$j r4 = new androidx.room.c0$j     // Catch: java.lang.Throwable -> L5f
            r5 = 0
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L5f
            r0.f58742a = r8     // Catch: java.lang.Throwable -> L5f
            r0.f58745d = r3     // Catch: java.lang.Throwable -> L5f
            r3 = 0
            java.lang.Object r0 = r2.useConnection$room_runtime_release(r3, r4, r0)     // Catch: java.lang.Throwable -> L5f
            if (r0 != r1) goto L5a
            return r1
        L5a:
            r0 = r8
        L5b:
            r0.d()
            goto L67
        L5f:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L63:
            r0.d()
            throw r8
        L67:
            kotlin.Unit r8 = kotlin.Unit.f143329a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.c0.x(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Pair<String[], int[]> y(String[] names) {
        Intrinsics.j(names, "names");
        String[] strArrT = t(names);
        int length = strArrT.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArrT[i10];
            Map<String, Integer> map = this.tableIdLookup;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.i(lowerCase, "toLowerCase(...)");
            Integer num = map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            iArr[i10] = num.intValue();
        }
        return TuplesKt.a(strArrT, iArr);
    }

    private final String[] t(String[] names) {
        Set setB = SetsKt.b();
        for (String str : names) {
            Map<String, Set<String>> map = this.viewTables;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.i(lowerCase, "toLowerCase(...)");
            Set<String> set = map.get(lowerCase);
            if (set != null) {
                setB.addAll(set);
            } else {
                setB.add(str);
            }
        }
        return (String[]) SetsKt.a(setB).toArray(new String[0]);
    }
}
