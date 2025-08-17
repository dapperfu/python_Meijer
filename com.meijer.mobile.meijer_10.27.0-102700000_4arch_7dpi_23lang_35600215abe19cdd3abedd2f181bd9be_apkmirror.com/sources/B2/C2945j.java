package B2;

import B2.N;
import B2.v;
import androidx.datastore.core.CorruptionException;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C0;
import qv.C16644i;
import qv.C16678z;
import qv.InterfaceC16622O;
import qv.InterfaceC16674x;
import tv.C17154h;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 i*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u00179Bp\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012?\b\u0002\u0010\u000e\u001a9\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00060\u0005\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014JC\u0010\u0017\u001a\u00028\u000021\u0010\u0016\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0006H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0080@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\fH\u0082@¢\u0006\u0004\b!\u0010 J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010\"\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b$\u0010%J\u001e\u0010\u0015\u001a\u00020\f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0082@¢\u0006\u0004\b\u0015\u0010(J\u0010\u0010)\u001a\u00020\fH\u0082@¢\u0006\u0004\b)\u0010 J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010\"\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b*\u0010%J\u0010\u0010+\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b+\u0010 JK\u0010.\u001a\u00028\u000021\u0010\u0016\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00062\u0006\u0010-\u001a\u00020,H\u0082@¢\u0006\u0004\b.\u0010/J\u001e\u00102\u001a\b\u0012\u0004\u0012\u00028\u0000012\u0006\u00100\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b2\u0010%JI\u00106\u001a\u00028\u0001\"\u0004\b\u0001\u001032\u0006\u00100\u001a\u00020\u001a2\u001c\u00105\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r04H\u0082@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b6\u00107R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00108R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R \u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010I\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001e\u0010U\u001a\f0RR\b\u0012\u0004\u0012\u00028\u00000\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR \u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000W0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001b\u0010_\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010Y\u001a\u0004\b]\u0010^R \u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR!\u0010h\u001a\b\u0012\u0004\u0012\u00028\u00000W8@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\bd\u0010e*\u0004\bf\u0010g¨\u0006j"}, d2 = {"LB2/j;", "T", "LB2/h;", "LB2/I;", PlaceTypes.STORAGE, "", "Lkotlin/Function2;", "LB2/r;", "Lkotlin/ParameterName;", "name", "api", "Lkotlin/coroutines/Continuation;", "", "", "initTasksList", "LB2/d;", "corruptionHandler", "Lqv/O;", "scope", "<init>", "(LB2/I;Ljava/util/List;LB2/d;Lqv/O;)V", "t", "transform", "a", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newData", "", "updateCache", "", "B", "(Ljava/lang/Object;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "u", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p", "requireLock", "LB2/H;", "z", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LB2/v$a;", "update", "(LB2/v$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "v", "w", "x", "Lkotlin/coroutines/CoroutineContext;", "callerContext", "A", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasWriteFileLock", "LB2/e;", "y", "R", "Lkotlin/Function1;", "block", "q", "(ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LB2/I;", "b", "LB2/d;", "c", "Lqv/O;", "Ltv/f;", "d", "Ltv/f;", "getData", "()Ltv/f;", "data", "LAv/a;", "e", "LAv/a;", "collectorMutex", "f", "I", "collectorCounter", "Lqv/C0;", "g", "Lqv/C0;", "collectorJob", "LB2/k;", "h", "LB2/k;", "inMemoryCache", "LB2/j$b;", "i", "LB2/j$b;", "readAndInit", "Lkotlin/Lazy;", "LB2/J;", "j", "Lkotlin/Lazy;", "storageConnectionDelegate", "LB2/s;", "k", "r", "()LB2/s;", "coordinator", "LB2/F;", "l", "LB2/F;", "writeActor", "s", "()LB2/J;", "getStorageConnection$datastore_core_release$delegate", "(LB2/j;)Ljava/lang/Object;", "storageConnection", "m", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: B2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2945j<T> implements InterfaceC2943h<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final I<T> storage;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC2939d<T> corruptionHandler;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O scope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17152f<T> data;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Av.a collectorMutex;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int collectorCounter;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private C0 collectorJob;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C2946k<T> inMemoryCache;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final C2945j<T>.b readAndInit;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Lazy<J<T>> storageConnectionDelegate;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Lazy coordinator;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final F<v.a<T>> writeActor;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001BF\u0012=\u0010\u000b\u001a9\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00030\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\tH\u0094@¢\u0006\u0004\b\u000e\u0010\u000fRO\u0010\u0012\u001a;\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LB2/j$b;", "LB2/C;", "", "Lkotlin/Function2;", "LB2/r;", "Lkotlin/ParameterName;", "name", "api", "Lkotlin/coroutines/Continuation;", "", "", "initTasksList", "<init>", "(LB2/j;Ljava/util/List;)V", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "Ljava/util/List;", "initTasks", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: B2.j$b */
    private final class b extends C {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private List<? extends Function2<? super B2.r<T>, ? super Continuation<? super Unit>, ? extends Object>> initTasks;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2945j<T> f1800d;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$InitDataStore", f = "DataStoreImpl.kt", l = {430, 434}, m = "doRun")
        /* renamed from: B2.j$b$a */
        static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            Object f1801a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f1802b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C2945j<T>.b f1803c;

            /* renamed from: d, reason: collision with root package name */
            int f1804d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C2945j<T>.b bVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f1803c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f1802b = obj;
                this.f1804d |= Integer.MIN_VALUE;
                return this.f1803c.b(this);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "LB2/e;", "<anonymous>", "()LB2/e;"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", l = {437, 458, 546, 468}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: B2.j$b$b, reason: collision with other inner class name */
        static final class C0033b extends SuspendLambda implements Function1<Continuation<? super C2940e<T>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f1805a;

            /* renamed from: b, reason: collision with root package name */
            Object f1806b;

            /* renamed from: c, reason: collision with root package name */
            Object f1807c;

            /* renamed from: d, reason: collision with root package name */
            Object f1808d;

            /* renamed from: e, reason: collision with root package name */
            Object f1809e;

            /* renamed from: f, reason: collision with root package name */
            int f1810f;

            /* renamed from: g, reason: collision with root package name */
            int f1811g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ C2945j<T> f1812h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ C2945j<T>.b f1813i;

            @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001JC\u0010\t\u001a\u00028\u000021\u0010\b\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002H\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"B2/j$b$b$a", "LB2/r;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "t", "Lkotlin/coroutines/Continuation;", "", "transform", "a", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: B2.j$b$b$a */
            public static final class a implements B2.r<T> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Av.a f1814a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Ref.BooleanRef f1815b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Ref.ObjectRef<T> f1816c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C2945j<T> f1817d;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1", f = "DataStoreImpl.kt", l = {544, 447, 449}, m = "updateData")
                /* renamed from: B2.j$b$b$a$a, reason: collision with other inner class name */
                static final class C0034a extends ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    Object f1818a;

                    /* renamed from: b, reason: collision with root package name */
                    Object f1819b;

                    /* renamed from: c, reason: collision with root package name */
                    Object f1820c;

                    /* renamed from: d, reason: collision with root package name */
                    Object f1821d;

                    /* renamed from: e, reason: collision with root package name */
                    Object f1822e;

                    /* renamed from: f, reason: collision with root package name */
                    /* synthetic */ Object f1823f;

                    /* renamed from: h, reason: collision with root package name */
                    int f1825h;

                    C0034a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f1823f = obj;
                        this.f1825h |= Integer.MIN_VALUE;
                        return a.this.a(null, this);
                    }
                }

                a(Av.a aVar, Ref.BooleanRef booleanRef, Ref.ObjectRef<T> objectRef, C2945j<T> c2945j) {
                    this.f1814a = aVar;
                    this.f1815b = booleanRef;
                    this.f1816c = objectRef;
                    this.f1817d = c2945j;
                }

                /* JADX WARN: Removed duplicated region for block: B:38:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:21:0x0052, B:36:0x00b2, B:38:0x00ba), top: B:53:0x0052 }] */
                /* JADX WARN: Removed duplicated region for block: B:43:0x00d1  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // B2.r
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public java.lang.Object a(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r10, kotlin.coroutines.Continuation<? super T> r11) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instructions count: 231
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: B2.C2945j.b.C0033b.a.a(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0033b(C2945j<T> c2945j, C2945j<T>.b bVar, Continuation<? super C0033b> continuation) {
                super(1, continuation);
                this.f1812h = c2945j;
                this.f1813i = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new C0033b(this.f1812h, this.f1813i, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation<? super C2940e<T>> continuation) {
                return ((C0033b) create(continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x00b1  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00e8  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00f4  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x010f  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) throws androidx.datastore.core.CorruptionException {
                /*
                    Method dump skipped, instructions count: 289
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: B2.C2945j.b.C0033b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public b(C2945j c2945j, List<? extends Function2<? super B2.r<T>, ? super Continuation<? super Unit>, ? extends Object>> initTasksList) {
            Intrinsics.j(initTasksList, "initTasksList");
            this.f1800d = c2945j;
            this.initTasks = CollectionsKt.j1(initTasksList);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // B2.C
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected java.lang.Object b(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) throws androidx.datastore.core.CorruptionException {
            /*
                r6 = this;
                boolean r0 = r7 instanceof B2.C2945j.b.a
                if (r0 == 0) goto L13
                r0 = r7
                B2.j$b$a r0 = (B2.C2945j.b.a) r0
                int r1 = r0.f1804d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1804d = r1
                goto L18
            L13:
                B2.j$b$a r0 = new B2.j$b$a
                r0.<init>(r6, r7)
            L18:
                java.lang.Object r7 = r0.f1802b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f1804d
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r0 = r0.f1801a
                B2.j$b r0 = (B2.C2945j.b) r0
                kotlin.ResultKt.b(r7)
                goto L6b
            L30:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L38:
                java.lang.Object r0 = r0.f1801a
                B2.j$b r0 = (B2.C2945j.b) r0
                kotlin.ResultKt.b(r7)
                goto L7d
            L40:
                kotlin.ResultKt.b(r7)
                java.util.List<? extends kotlin.jvm.functions.Function2<? super B2.r<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> r7 = r6.initTasks
                if (r7 == 0) goto L6e
                kotlin.jvm.internal.Intrinsics.g(r7)
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L51
                goto L6e
            L51:
                B2.j<T> r7 = r6.f1800d
                B2.s r7 = B2.C2945j.c(r7)
                B2.j$b$b r2 = new B2.j$b$b
                B2.j<T> r4 = r6.f1800d
                r5 = 0
                r2.<init>(r4, r6, r5)
                r0.f1801a = r6
                r0.f1804d = r3
                java.lang.Object r7 = r7.b(r2, r0)
                if (r7 != r1) goto L6a
                goto L7b
            L6a:
                r0 = r6
            L6b:
                B2.e r7 = (B2.C2940e) r7
                goto L7f
            L6e:
                B2.j<T> r7 = r6.f1800d
                r0.f1801a = r6
                r0.f1804d = r4
                r2 = 0
                java.lang.Object r7 = B2.C2945j.n(r7, r2, r0)
                if (r7 != r1) goto L7c
            L7b:
                return r1
            L7c:
                r0 = r6
            L7d:
                B2.e r7 = (B2.C2940e) r7
            L7f:
                B2.j<T> r0 = r0.f1800d
                B2.k r0 = B2.C2945j.d(r0)
                r0.c(r7)
                kotlin.Unit r7 = kotlin.Unit.f142422a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: B2.C2945j.b.b(kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "LB2/s;", "c", "()LB2/s;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B2.j$c */
    static final class c extends Lambda implements Function0<B2.s> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C2945j<T> f1826f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C2945j<T> c2945j) {
            super(0);
            this.f1826f = c2945j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final B2.s invoke() {
            return this.f1826f.s().getCoordinator();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ltv/g;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1", f = "DataStoreImpl.kt", l = {72, 74, HttpResponseStatus.INFORMATIONAL_CONTINUE}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: B2.j$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC17153g<? super T>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f1827a;

        /* renamed from: b, reason: collision with root package name */
        int f1828b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f1829c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2945j<T> f1830d;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ltv/g;", "LB2/H;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$1", f = "DataStoreImpl.kt", l = {102}, m = "invokeSuspend")
        /* renamed from: B2.j$d$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC17153g<? super H<T>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f1831a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C2945j<T> f1832b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C2945j<T> c2945j, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f1832b = c2945j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f1832b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super H<T>> interfaceC17153g, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f1831a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C2945j<T> c2945j = this.f1832b;
                    this.f1831a = 1;
                    if (c2945j.u(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LB2/H;", "it", "", "<anonymous>", "(LB2/H;)Z"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$2", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
        /* renamed from: B2.j$d$b */
        static final class b extends SuspendLambda implements Function2<H<T>, Continuation<? super Boolean>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f1833a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f1834b;

            b(Continuation<? super b> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                b bVar = new b(continuation);
                bVar.f1834b = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(H<T> h10, Continuation<? super Boolean> continuation) {
                return ((b) create(h10, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f1833a == 0) {
                    ResultKt.b(obj);
                    return Boxing.a(!(((H) this.f1834b) instanceof B2.q));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LB2/H;", "it", "", "<anonymous>", "(LB2/H;)Z"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$3", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
        /* renamed from: B2.j$d$c */
        static final class c extends SuspendLambda implements Function2<H<T>, Continuation<? super Boolean>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f1835a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f1836b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ H<T> f1837c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(H<T> h10, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f1837c = h10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                c cVar = new c(this.f1837c, continuation);
                cVar.f1836b = obj;
                return cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(H<T> h10, Continuation<? super Boolean> continuation) {
                return ((c) create(h10, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z10;
                IntrinsicsKt.f();
                if (this.f1835a == 0) {
                    ResultKt.b(obj);
                    H h10 = (H) this.f1836b;
                    if ((h10 instanceof C2940e) && h10.getVersion() <= this.f1837c.getVersion()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return Boxing.a(z10);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ltv/g;", "", "it", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$5", f = "DataStoreImpl.kt", l = {116}, m = "invokeSuspend")
        /* renamed from: B2.j$d$d, reason: collision with other inner class name */
        static final class C0035d extends SuspendLambda implements Function3<InterfaceC17153g<? super T>, Throwable, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f1838a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C2945j<T> f1839b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0035d(C2945j<T> c2945j, Continuation<? super C0035d> continuation) {
                super(3, continuation);
                this.f1839b = c2945j;
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC17153g<? super T> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
                return new C0035d(this.f1839b, continuation).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f1838a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C2945j<T> c2945j = this.f1839b;
                    this.f1838a = 1;
                    if (c2945j.p(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: B2.j$d$e */
        public static final class e implements InterfaceC17152f<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17152f f1840a;

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @SourceDebugExtension
            /* renamed from: B2.j$d$e$a */
            public static final class a<T> implements InterfaceC17153g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC17153g f1841a;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", f = "DataStoreImpl.kt", l = {223}, m = "emit")
                @SourceDebugExtension
                /* renamed from: B2.j$d$e$a$a, reason: collision with other inner class name */
                public static final class C0036a extends ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f1842a;

                    /* renamed from: b, reason: collision with root package name */
                    int f1843b;

                    public C0036a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f1842a = obj;
                        this.f1843b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC17153g interfaceC17153g) {
                    this.f1841a = interfaceC17153g;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // tv.InterfaceC17153g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof B2.C2945j.d.e.a.C0036a
                        if (r0 == 0) goto L13
                        r0 = r6
                        B2.j$d$e$a$a r0 = (B2.C2945j.d.e.a.C0036a) r0
                        int r1 = r0.f1843b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f1843b = r1
                        goto L18
                    L13:
                        B2.j$d$e$a$a r0 = new B2.j$d$e$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f1842a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                        int r2 = r0.f1843b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.ResultKt.b(r6)
                        goto L4f
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.ResultKt.b(r6)
                        tv.g r6 = r4.f1841a
                        B2.H r5 = (B2.H) r5
                        boolean r2 = r5 instanceof B2.A
                        if (r2 != 0) goto L69
                        boolean r2 = r5 instanceof B2.C2940e
                        if (r2 == 0) goto L52
                        B2.e r5 = (B2.C2940e) r5
                        java.lang.Object r5 = r5.c()
                        r0.f1843b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4f
                        return r1
                    L4f:
                        kotlin.Unit r5 = kotlin.Unit.f142422a
                        return r5
                    L52:
                        boolean r6 = r5 instanceof B2.q
                        if (r6 == 0) goto L57
                        goto L59
                    L57:
                        boolean r3 = r5 instanceof B2.L
                    L59:
                        if (r3 == 0) goto L63
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        r5.<init>(r6)
                        throw r5
                    L63:
                        kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                        r5.<init>()
                        throw r5
                    L69:
                        B2.A r5 = (B2.A) r5
                        java.lang.Throwable r5 = r5.getReadException()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: B2.C2945j.d.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public e(InterfaceC17152f interfaceC17152f) {
                this.f1840a = interfaceC17152f;
            }

            @Override // tv.InterfaceC17152f
            public Object collect(InterfaceC17153g interfaceC17153g, Continuation continuation) {
                Object objCollect = this.f1840a.collect(new a(interfaceC17153g), continuation);
                return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C2945j<T> c2945j, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f1830d = c2945j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f1830d, continuation);
            dVar.f1829c = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super T> interfaceC17153g, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
        
            if (tv.C17154h.x(r1, r9, r8) == r0) goto L33;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r8.f1828b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L32
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.ResultKt.b(r9)
                goto Lbe
            L16:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1e:
                java.lang.Object r1 = r8.f1827a
                B2.H r1 = (B2.H) r1
                java.lang.Object r3 = r8.f1829c
                tv.g r3 = (tv.InterfaceC17153g) r3
                kotlin.ResultKt.b(r9)
                goto L67
            L2a:
                java.lang.Object r1 = r8.f1829c
                tv.g r1 = (tv.InterfaceC17153g) r1
                kotlin.ResultKt.b(r9)
                goto L4b
            L32:
                kotlin.ResultKt.b(r9)
                java.lang.Object r9 = r8.f1829c
                tv.g r9 = (tv.InterfaceC17153g) r9
                B2.j<T> r1 = r8.f1830d
                r8.f1829c = r9
                r8.f1828b = r4
                r4 = 0
                java.lang.Object r1 = B2.C2945j.o(r1, r4, r8)
                if (r1 != r0) goto L48
                goto Lbd
            L48:
                r7 = r1
                r1 = r9
                r9 = r7
            L4b:
                B2.H r9 = (B2.H) r9
                boolean r4 = r9 instanceof B2.C2940e
                if (r4 == 0) goto L6a
                r4 = r9
                B2.e r4 = (B2.C2940e) r4
                java.lang.Object r4 = r4.c()
                r8.f1829c = r1
                r8.f1827a = r9
                r8.f1828b = r3
                java.lang.Object r3 = r1.emit(r4, r8)
                if (r3 != r0) goto L65
                goto Lbd
            L65:
                r3 = r1
                r1 = r9
            L67:
                r9 = r1
                r1 = r3
                goto L79
            L6a:
                boolean r3 = r9 instanceof B2.L
                if (r3 != 0) goto Lc8
                boolean r3 = r9 instanceof B2.A
                if (r3 != 0) goto Lc1
                boolean r3 = r9 instanceof B2.q
                if (r3 == 0) goto L79
                kotlin.Unit r9 = kotlin.Unit.f142422a
                return r9
            L79:
                B2.j<T> r3 = r8.f1830d
                B2.k r3 = B2.C2945j.d(r3)
                tv.f r3 = r3.b()
                B2.j$d$a r4 = new B2.j$d$a
                B2.j<T> r5 = r8.f1830d
                r6 = 0
                r4.<init>(r5, r6)
                tv.f r3 = tv.C17154h.P(r3, r4)
                B2.j$d$b r4 = new B2.j$d$b
                r4.<init>(r6)
                tv.f r3 = tv.C17154h.a0(r3, r4)
                B2.j$d$c r4 = new B2.j$d$c
                r4.<init>(r9, r6)
                tv.f r9 = tv.C17154h.v(r3, r4)
                B2.j$d$e r3 = new B2.j$d$e
                r3.<init>(r9)
                B2.j$d$d r9 = new B2.j$d$d
                B2.j<T> r4 = r8.f1830d
                r9.<init>(r4, r6)
                tv.f r9 = tv.C17154h.N(r3, r9)
                r8.f1829c = r6
                r8.f1827a = r6
                r8.f1828b = r2
                java.lang.Object r9 = tv.C17154h.x(r1, r9, r8)
                if (r9 != r0) goto Lbe
            Lbd:
                return r0
            Lbe:
                kotlin.Unit r9 = kotlin.Unit.f142422a
                return r9
            Lc1:
                B2.A r9 = (B2.A) r9
                java.lang.Throwable r9 = r9.getReadException()
                throw r9
            Lc8:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: B2.C2945j.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {544}, m = "decrementCollector")
    /* renamed from: B2.j$e */
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f1845a;

        /* renamed from: b, reason: collision with root package name */
        Object f1846b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f1847c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2945j<T> f1848d;

        /* renamed from: e, reason: collision with root package name */
        int f1849e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C2945j<T> c2945j, Continuation<? super e> continuation) {
            super(continuation);
            this.f1848d = c2945j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f1847c = obj;
            this.f1849e |= Integer.MIN_VALUE;
            return this.f1848d.p(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "R", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3", f = "DataStoreImpl.kt", l = {HttpResponseStatus.ERROR_REQUESTED_RANGE_NOT_SATISFIABLE}, m = "invokeSuspend")
    /* renamed from: B2.j$f */
    static final class f<R> extends SuspendLambda implements Function1<Continuation<? super R>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f1850a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Continuation<? super R>, Object> f1851b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super f> continuation) {
            super(1, continuation);
            this.f1851b = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new f(this.f1851b, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super R> continuation) {
            return ((f) create(continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f1850a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Function1<Continuation<? super R>, Object> function1 = this.f1851b;
            this.f1850a = 1;
            Object objInvoke = function1.invoke(this);
            if (objInvoke == objF) {
                return objF;
            }
            return objInvoke;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {237, 243, 246}, m = "handleUpdate")
    /* renamed from: B2.j$g */
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f1852a;

        /* renamed from: b, reason: collision with root package name */
        Object f1853b;

        /* renamed from: c, reason: collision with root package name */
        Object f1854c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f1855d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C2945j<T> f1856e;

        /* renamed from: f, reason: collision with root package name */
        int f1857f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C2945j<T> c2945j, Continuation<? super g> continuation) {
            super(continuation);
            this.f1856e = c2945j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f1855d = obj;
            this.f1857f |= Integer.MIN_VALUE;
            return this.f1856e.t(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {544}, m = "incrementCollector")
    /* renamed from: B2.j$h */
    static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f1858a;

        /* renamed from: b, reason: collision with root package name */
        Object f1859b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f1860c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2945j<T> f1861d;

        /* renamed from: e, reason: collision with root package name */
        int f1862e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C2945j<T> c2945j, Continuation<? super h> continuation) {
            super(continuation);
            this.f1861d = c2945j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f1860c = obj;
            this.f1862e |= Integer.MIN_VALUE;
            return this.f1861d.u(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", f = "DataStoreImpl.kt", l = {134, 135}, m = "invokeSuspend")
    /* renamed from: B2.j$i */
    static final class i extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f1863a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2945j<T> f1864b;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "", "it", "a", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: B2.j$i$a */
        static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C2945j<T> f1865a;

            a(C2945j<T> c2945j) {
                this.f1865a = c2945j;
            }

            @Override // tv.InterfaceC17153g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
                if (((C2945j) this.f1865a).inMemoryCache.a() instanceof B2.q) {
                    return Unit.f142422a;
                }
                Object objW = this.f1865a.w(true, continuation);
                return objW == IntrinsicsKt.f() ? objW : Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(C2945j<T> c2945j, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f1864b = c2945j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new i(this.f1864b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (r5.collect(r1, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r4.f1863a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r5)
                goto L4e
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.ResultKt.b(r5)
                goto L30
            L1e:
                kotlin.ResultKt.b(r5)
                B2.j<T> r5 = r4.f1864b
                B2.j$b r5 = B2.C2945j.e(r5)
                r4.f1863a = r3
                java.lang.Object r5 = r5.a(r4)
                if (r5 != r0) goto L30
                goto L4d
            L30:
                B2.j<T> r5 = r4.f1864b
                B2.s r5 = B2.C2945j.c(r5)
                tv.f r5 = r5.c()
                tv.f r5 = tv.C17154h.o(r5)
                B2.j$i$a r1 = new B2.j$i$a
                B2.j<T> r3 = r4.f1864b
                r1.<init>(r3)
                r4.f1863a = r2
                java.lang.Object r5 = r5.collect(r1, r4)
                if (r5 != r0) goto L4e
            L4d:
                return r0
            L4e:
                kotlin.Unit r5 = kotlin.Unit.f142422a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: B2.C2945j.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {264, 266}, m = "readAndInitOrPropagateAndThrowFailure")
    /* renamed from: B2.j$j, reason: collision with other inner class name */
    static final class C0037j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f1866a;

        /* renamed from: b, reason: collision with root package name */
        int f1867b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f1868c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2945j<T> f1869d;

        /* renamed from: e, reason: collision with root package name */
        int f1870e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0037j(C2945j<T> c2945j, Continuation<? super C0037j> continuation) {
            super(continuation);
            this.f1869d = c2945j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f1868c = obj;
            this.f1870e |= Integer.MIN_VALUE;
            return this.f1869d.v(this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {287, 296, HttpResponseStatus.REDIRECTION_NOT_MODIFIED}, m = "readDataAndUpdateCache")
    /* renamed from: B2.j$k */
    static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f1871a;

        /* renamed from: b, reason: collision with root package name */
        Object f1872b;

        /* renamed from: c, reason: collision with root package name */
        boolean f1873c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f1874d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C2945j<T> f1875e;

        /* renamed from: f, reason: collision with root package name */
        int f1876f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(C2945j<T> c2945j, Continuation<? super k> continuation) {
            super(continuation);
            this.f1875e = c2945j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f1874d = obj;
            this.f1876f |= Integer.MIN_VALUE;
            return this.f1875e.w(false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlin/Pair;", "LB2/H;", "", "<anonymous>", "()Lkotlin/Pair;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", l = {298, HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES}, m = "invokeSuspend")
    /* renamed from: B2.j$l */
    static final class l extends SuspendLambda implements Function1<Continuation<? super Pair<? extends H<T>, ? extends Boolean>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f1877a;

        /* renamed from: b, reason: collision with root package name */
        int f1878b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2945j<T> f1879c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(C2945j<T> c2945j, Continuation<? super l> continuation) {
            super(1, continuation);
            this.f1879c = c2945j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new l(this.f1879c, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Pair<? extends H<T>, Boolean>> continuation) {
            return ((l) create(continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2;
            H a10;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f1878b;
            try {
            } catch (Throwable th3) {
                B2.s sVarR = this.f1879c.r();
                this.f1877a = th3;
                this.f1878b = 2;
                Object objA = sVarR.a(this);
                if (objA != objF) {
                    th2 = th3;
                    obj = objA;
                }
            }
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        th2 = (Throwable) this.f1877a;
                        ResultKt.b(obj);
                        a10 = new A(th2, ((Number) obj).intValue());
                        return TuplesKt.a(a10, Boxing.a(true));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                C2945j<T> c2945j = this.f1879c;
                this.f1878b = 1;
                obj = c2945j.y(true, this);
                if (obj == objF) {
                    return objF;
                }
            }
            a10 = (H) obj;
            return TuplesKt.a(a10, Boxing.a(true));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "locked", "Lkotlin/Pair;", "LB2/H;", "<anonymous>", "(Z)Lkotlin/Pair;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", l = {306, 309}, m = "invokeSuspend")
    /* renamed from: B2.j$m */
    static final class m extends SuspendLambda implements Function2<Boolean, Continuation<? super Pair<? extends H<T>, ? extends Boolean>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f1880a;

        /* renamed from: b, reason: collision with root package name */
        int f1881b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ boolean f1882c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2945j<T> f1883d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f1884e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(C2945j<T> c2945j, int i10, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f1883d = c2945j;
            this.f1884e = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            m mVar = new m(this.f1883d, this.f1884e, continuation);
            mVar.f1882c = ((Boolean) obj).booleanValue();
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Object obj) {
            return d(bool.booleanValue(), (Continuation) obj);
        }

        public final Object d(boolean z10, Continuation<? super Pair<? extends H<T>, Boolean>> continuation) {
            return ((m) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2;
            int iIntValue;
            boolean z10;
            H h10;
            boolean z11;
            Object objF = IntrinsicsKt.f();
            boolean z12 = this.f1881b;
            try {
            } catch (Throwable th3) {
                if (z12 != 0) {
                    B2.s sVarR = this.f1883d.r();
                    this.f1880a = th3;
                    this.f1882c = z12;
                    this.f1881b = 2;
                    Object objA = sVarR.a(this);
                    if (objA != objF) {
                        z10 = z12;
                        th2 = th3;
                        obj = objA;
                    }
                } else {
                    boolean z13 = z12;
                    th2 = th3;
                    iIntValue = this.f1884e;
                    z10 = z13;
                }
            }
            if (z12 != 0) {
                if (z12 != 1) {
                    if (z12 == 2) {
                        z10 = this.f1882c;
                        th2 = (Throwable) this.f1880a;
                        ResultKt.b(obj);
                        iIntValue = ((Number) obj).intValue();
                        A a10 = new A(th2, iIntValue);
                        z11 = z10;
                        h10 = a10;
                        return TuplesKt.a(h10, Boxing.a(z11));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z14 = this.f1882c;
                ResultKt.b(obj);
                z12 = z14;
            } else {
                ResultKt.b(obj);
                boolean z15 = this.f1882c;
                C2945j<T> c2945j = this.f1883d;
                this.f1882c = z15;
                this.f1881b = 1;
                obj = c2945j.y(z15, this);
                z12 = z15;
                if (obj == objF) {
                    return objF;
                }
            }
            h10 = (H) obj;
            z11 = z12;
            return TuplesKt.a(h10, Boxing.a(z11));
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {365, 366, 368, 369, 380, 384}, m = "readDataOrHandleCorruption")
    /* renamed from: B2.j$n */
    static final class n extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f1885a;

        /* renamed from: b, reason: collision with root package name */
        Object f1886b;

        /* renamed from: c, reason: collision with root package name */
        Object f1887c;

        /* renamed from: d, reason: collision with root package name */
        Object f1888d;

        /* renamed from: e, reason: collision with root package name */
        boolean f1889e;

        /* renamed from: f, reason: collision with root package name */
        int f1890f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f1891g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C2945j<T> f1892h;

        /* renamed from: i, reason: collision with root package name */
        int f1893i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(C2945j<T> c2945j, Continuation<? super n> continuation) {
            super(continuation);
            this.f1892h = c2945j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f1891g = obj;
            this.f1893i |= Integer.MIN_VALUE;
            return this.f1892h.y(false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "locked", "LB2/e;", "<anonymous>", "(Z)LB2/e;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", f = "DataStoreImpl.kt", l = {370, 371}, m = "invokeSuspend")
    /* renamed from: B2.j$o */
    static final class o extends SuspendLambda implements Function2<Boolean, Continuation<? super C2940e<T>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f1894a;

        /* renamed from: b, reason: collision with root package name */
        int f1895b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ boolean f1896c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2945j<T> f1897d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f1898e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(C2945j<T> c2945j, int i10, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f1897d = c2945j;
            this.f1898e = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            o oVar = new o(this.f1897d, this.f1898e, continuation);
            oVar.f1896c = ((Boolean) obj).booleanValue();
            return oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Object obj) {
            return d(bool.booleanValue(), (Continuation) obj);
        }

        public final Object d(boolean z10, Continuation<? super C2940e<T>> continuation) {
            return ((o) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r5.f1895b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r5.f1894a
                kotlin.ResultKt.b(r6)
                goto L49
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                boolean r1 = r5.f1896c
                kotlin.ResultKt.b(r6)
                goto L34
            L22:
                kotlin.ResultKt.b(r6)
                boolean r1 = r5.f1896c
                B2.j<T> r6 = r5.f1897d
                r5.f1896c = r1
                r5.f1895b = r3
                java.lang.Object r6 = B2.C2945j.m(r6, r5)
                if (r6 != r0) goto L34
                goto L46
            L34:
                if (r1 == 0) goto L50
                B2.j<T> r1 = r5.f1897d
                B2.s r1 = B2.C2945j.c(r1)
                r5.f1894a = r6
                r5.f1895b = r2
                java.lang.Object r1 = r1.a(r5)
                if (r1 != r0) goto L47
            L46:
                return r0
            L47:
                r0 = r6
                r6 = r1
            L49:
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                goto L55
            L50:
                int r0 = r5.f1898e
                r4 = r0
                r0 = r6
                r6 = r4
            L55:
                B2.e r1 = new B2.e
                if (r0 == 0) goto L5e
                int r2 = r0.hashCode()
                goto L5f
            L5e:
                r2 = 0
            L5f:
                r1.<init>(r0, r2, r6)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: B2.C2945j.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", l = {387, 388, 390}, m = "invokeSuspend")
    /* renamed from: B2.j$p */
    static final class p extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f1899a;

        /* renamed from: b, reason: collision with root package name */
        int f1900b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<T> f1901c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2945j<T> f1902d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f1903e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(Ref.ObjectRef<T> objectRef, C2945j<T> c2945j, Ref.IntRef intRef, Continuation<? super p> continuation) {
            super(1, continuation);
            this.f1901c = objectRef;
            this.f1902d = c2945j;
            this.f1903e = intRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new p(this.f1901c, this.f1902d, this.f1903e, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((p) create(continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.IntRef intRef;
            Ref.ObjectRef<T> objectRef;
            Ref.IntRef intRef2;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f1900b;
            try {
            } catch (CorruptionException unused) {
                Ref.IntRef intRef3 = this.f1903e;
                C2945j<T> c2945j = this.f1902d;
                T t10 = this.f1901c.f142835a;
                this.f1899a = intRef3;
                this.f1900b = 3;
                Object objB = c2945j.B(t10, true, this);
                if (objB != objF) {
                    intRef = intRef3;
                    obj = (T) objB;
                }
            }
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            intRef = (Ref.IntRef) this.f1899a;
                            ResultKt.b(obj);
                            intRef.f142833a = ((Number) obj).intValue();
                            return Unit.f142422a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    intRef2 = (Ref.IntRef) this.f1899a;
                    ResultKt.b(obj);
                    intRef2.f142833a = ((Number) obj).intValue();
                    return Unit.f142422a;
                }
                objectRef = (Ref.ObjectRef) this.f1899a;
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                objectRef = this.f1901c;
                C2945j<T> c2945j2 = this.f1902d;
                this.f1899a = objectRef;
                this.f1900b = 1;
                obj = (T) c2945j2.x(this);
                if (obj == objF) {
                }
                return objF;
            }
            objectRef.f142835a = (T) obj;
            intRef2 = this.f1903e;
            B2.s sVarR = this.f1902d.r();
            this.f1899a = intRef2;
            this.f1900b = 2;
            obj = (T) sVarR.a(this);
            if (obj == objF) {
                return objF;
            }
            intRef2.f142833a = ((Number) obj).intValue();
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lqv/O;", "LB2/H;", "<anonymous>", "(Lqv/O;)LB2/H;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readState$2", f = "DataStoreImpl.kt", l = {218, 226}, m = "invokeSuspend")
    /* renamed from: B2.j$q */
    static final class q extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super H<T>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f1904a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2945j<T> f1905b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f1906c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(C2945j<T> c2945j, boolean z10, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f1905b = c2945j;
            this.f1906c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new q(this.f1905b, this.f1906c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super H<T>> continuation) {
            return ((q) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        
            if (r5 == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r4.f1904a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r5)
                goto L54
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.ResultKt.b(r5)     // Catch: java.lang.Throwable -> L1e
                goto L47
            L1e:
                r5 = move-exception
                goto L57
            L20:
                kotlin.ResultKt.b(r5)
                B2.j<T> r5 = r4.f1905b
                B2.k r5 = B2.C2945j.d(r5)
                B2.H r5 = r5.a()
                boolean r5 = r5 instanceof B2.q
                if (r5 == 0) goto L3c
                B2.j<T> r5 = r4.f1905b
                B2.k r5 = B2.C2945j.d(r5)
                B2.H r5 = r5.a()
                return r5
            L3c:
                B2.j<T> r5 = r4.f1905b     // Catch: java.lang.Throwable -> L1e
                r4.f1904a = r3     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r5 = B2.C2945j.k(r5, r4)     // Catch: java.lang.Throwable -> L1e
                if (r5 != r0) goto L47
                goto L53
            L47:
                B2.j<T> r5 = r4.f1905b
                boolean r1 = r4.f1906c
                r4.f1904a = r2
                java.lang.Object r5 = B2.C2945j.l(r5, r1, r4)
                if (r5 != r0) goto L54
            L53:
                return r0
            L54:
                B2.H r5 = (B2.H) r5
                return r5
            L57:
                B2.A r0 = new B2.A
                r1 = -1
                r0.<init>(r5, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: B2.C2945j.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "LB2/J;", "c", "()LB2/J;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B2.j$r */
    static final class r extends Lambda implements Function0<J<T>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C2945j<T> f1907f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(C2945j<T> c2945j) {
            super(0);
            this.f1907f = c2945j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final J<T> invoke() {
            return ((C2945j) this.f1907f).storage.a();
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\u008a@"}, d2 = {"<anonymous>", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", l = {330, 331, 337}, m = "invokeSuspend")
    /* renamed from: B2.j$s */
    static final class s extends SuspendLambda implements Function1<Continuation<? super T>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f1908a;

        /* renamed from: b, reason: collision with root package name */
        int f1909b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2945j<T> f1910c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f1911d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<T, Continuation<? super T>, Object> f1912e;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lqv/O;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", f = "DataStoreImpl.kt", l = {331}, m = "invokeSuspend")
        /* renamed from: B2.j$s$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super T>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f1913a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2<T, Continuation<? super T>, Object> f1914b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C2940e<T> f1915c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, C2940e<T> c2940e, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f1914b = function2;
                this.f1915c = c2940e;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f1914b, this.f1915c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super T> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f1913a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                Function2<T, Continuation<? super T>, Object> function2 = this.f1914b;
                T tC = this.f1915c.c();
                this.f1913a = 1;
                Object objInvoke = function2.invoke(tC, this);
                if (objInvoke == objF) {
                    return objF;
                }
                return objInvoke;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s(C2945j<T> c2945j, CoroutineContext coroutineContext, Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super s> continuation) {
            super(1, continuation);
            this.f1910c = c2945j;
            this.f1911d = coroutineContext;
            this.f1912e = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new s(this.f1910c, this.f1911d, this.f1912e, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super T> continuation) {
            return ((s) create(continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws androidx.datastore.core.CorruptionException {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r8.f1909b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2b
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r8.f1908a
                kotlin.ResultKt.b(r9)
                return r0
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.f1908a
                B2.e r1 = (B2.C2940e) r1
                kotlin.ResultKt.b(r9)
                goto L51
            L27:
                kotlin.ResultKt.b(r9)
                goto L39
            L2b:
                kotlin.ResultKt.b(r9)
                B2.j<T> r9 = r8.f1910c
                r8.f1909b = r4
                java.lang.Object r9 = B2.C2945j.n(r9, r4, r8)
                if (r9 != r0) goto L39
                goto L6a
            L39:
                r1 = r9
                B2.e r1 = (B2.C2940e) r1
                kotlin.coroutines.CoroutineContext r9 = r8.f1911d
                B2.j$s$a r5 = new B2.j$s$a
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> r6 = r8.f1912e
                r7 = 0
                r5.<init>(r6, r1, r7)
                r8.f1908a = r1
                r8.f1909b = r3
                java.lang.Object r9 = qv.C16644i.g(r9, r5, r8)
                if (r9 != r0) goto L51
                goto L6a
            L51:
                r1.b()
                java.lang.Object r1 = r1.c()
                boolean r1 = kotlin.jvm.internal.Intrinsics.e(r1, r9)
                if (r1 != 0) goto L6b
                B2.j<T> r1 = r8.f1910c
                r8.f1908a = r9
                r8.f1909b = r2
                java.lang.Object r1 = r1.B(r9, r4, r8)
                if (r1 != r0) goto L6b
            L6a:
                return r0
            L6b:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: B2.C2945j.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lqv/O;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", l = {169}, m = "invokeSuspend")
    /* renamed from: B2.j$t */
    static final class t extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super T>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f1916a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f1917b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2945j<T> f1918c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<T, Continuation<? super T>, Object> f1919d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        t(C2945j<T> c2945j, Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super t> continuation) {
            super(2, continuation);
            this.f1918c = c2945j;
            this.f1919d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            t tVar = new t(this.f1918c, this.f1919d, continuation);
            tVar.f1917b = obj;
            return tVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super T> continuation) {
            return ((t) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f1916a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f1917b;
            InterfaceC16674x interfaceC16674xB = C16678z.b(null, 1, null);
            ((C2945j) this.f1918c).writeActor.e(new v.a(this.f1919d, interfaceC16674xB, ((C2945j) this.f1918c).inMemoryCache.a(), interfaceC16622O.getCoroutineContext()));
            this.f1916a = 1;
            Object objB = interfaceC16674xB.B(this);
            if (objB == objF) {
                return objF;
            }
            return objB;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B2.j$u */
    static final class u extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C2945j<T> f1920f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(C2945j<T> c2945j) {
            super(1);
            this.f1920f = c2945j;
        }

        public final void a(Throwable th2) {
            if (th2 != null) {
                ((C2945j) this.f1920f).inMemoryCache.c(new B2.q(th2));
            }
            if (((C2945j) this.f1920f).storageConnectionDelegate.a()) {
                this.f1920f.s().close();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "LB2/v$a;", "msg", "", "ex", "", "a", "(LB2/v$a;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B2.j$v */
    static final class v extends Lambda implements Function2<v.a<T>, Throwable, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final v f1921f = new v();

        v() {
            super(2);
        }

        public final void a(v.a<T> msg, Throwable th2) {
            Intrinsics.j(msg, "msg");
            InterfaceC16674x<T> interfaceC16674xA = msg.a();
            if (th2 == null) {
                th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            interfaceC16674xA.c(th2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Throwable th2) {
            a((v.a) obj, th2);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LB2/v$a;", "msg", "", "<anonymous>", "(LB2/v$a;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$writeActor$3", f = "DataStoreImpl.kt", l = {207}, m = "invokeSuspend")
    /* renamed from: B2.j$w */
    static final class w extends SuspendLambda implements Function2<v.a<T>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f1922a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f1923b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2945j<T> f1924c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(C2945j<T> c2945j, Continuation<? super w> continuation) {
            super(2, continuation);
            this.f1924c = c2945j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            w wVar = new w(this.f1924c, continuation);
            wVar.f1923b = obj;
            return wVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v.a<T> aVar, Continuation<? super Unit> continuation) {
            return ((w) create(aVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f1922a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                v.a aVar = (v.a) this.f1923b;
                C2945j<T> c2945j = this.f1924c;
                this.f1922a = 1;
                if (c2945j.t(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {348}, m = "writeData$datastore_core_release")
    /* renamed from: B2.j$x */
    static final class x extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f1925a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f1926b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2945j<T> f1927c;

        /* renamed from: d, reason: collision with root package name */
        int f1928d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(C2945j<T> c2945j, Continuation<? super x> continuation) {
            super(continuation);
            this.f1927c = c2945j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f1926b = obj;
            this.f1928d |= Integer.MIN_VALUE;
            return this.f1927c.B(null, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LB2/O;", "", "<anonymous>", "(LB2/O;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$writeData$2", f = "DataStoreImpl.kt", l = {352, 353}, m = "invokeSuspend")
    /* renamed from: B2.j$y */
    static final class y extends SuspendLambda implements Function2<O<T>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f1929a;

        /* renamed from: b, reason: collision with root package name */
        int f1930b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f1931c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f1932d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C2945j<T> f1933e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ T f1934f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f1935g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(Ref.IntRef intRef, C2945j<T> c2945j, T t10, boolean z10, Continuation<? super y> continuation) {
            super(2, continuation);
            this.f1932d = intRef;
            this.f1933e = c2945j;
            this.f1934f = t10;
            this.f1935g = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            y yVar = new y(this.f1932d, this.f1933e, this.f1934f, this.f1935g, continuation);
            yVar.f1931c = obj;
            return yVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(O<T> o10, Continuation<? super Unit> continuation) {
            return ((y) create(o10, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
        
            if (r3.a(r7, r6) == r0) goto L16;
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
                int r1 = r6.f1930b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r7)
                goto L5d
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f1929a
                kotlin.jvm.internal.Ref$IntRef r1 = (kotlin.jvm.internal.Ref.IntRef) r1
                java.lang.Object r3 = r6.f1931c
                B2.O r3 = (B2.O) r3
                kotlin.ResultKt.b(r7)
                goto L45
            L26:
                kotlin.ResultKt.b(r7)
                java.lang.Object r7 = r6.f1931c
                B2.O r7 = (B2.O) r7
                kotlin.jvm.internal.Ref$IntRef r1 = r6.f1932d
                B2.j<T> r4 = r6.f1933e
                B2.s r4 = B2.C2945j.c(r4)
                r6.f1931c = r7
                r6.f1929a = r1
                r6.f1930b = r3
                java.lang.Object r3 = r4.e(r6)
                if (r3 != r0) goto L42
                goto L5c
            L42:
                r5 = r3
                r3 = r7
                r7 = r5
            L45:
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                r1.f142833a = r7
                T r7 = r6.f1934f
                r1 = 0
                r6.f1931c = r1
                r6.f1929a = r1
                r6.f1930b = r2
                java.lang.Object r7 = r3.a(r7, r6)
                if (r7 != r0) goto L5d
            L5c:
                return r0
            L5d:
                boolean r7 = r6.f1935g
                if (r7 == 0) goto L7d
                B2.j<T> r7 = r6.f1933e
                B2.k r7 = B2.C2945j.d(r7)
                B2.e r0 = new B2.e
                T r1 = r6.f1934f
                if (r1 == 0) goto L72
                int r2 = r1.hashCode()
                goto L73
            L72:
                r2 = 0
            L73:
                kotlin.jvm.internal.Ref$IntRef r3 = r6.f1932d
                int r3 = r3.f142833a
                r0.<init>(r1, r2, r3)
                r7.c(r0)
            L7d:
                kotlin.Unit r7 = kotlin.Unit.f142422a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: B2.C2945j.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C2945j(I<T> storage, List<? extends Function2<? super B2.r<T>, ? super Continuation<? super Unit>, ? extends Object>> initTasksList, InterfaceC2939d<T> corruptionHandler, InterfaceC16622O scope) {
        Intrinsics.j(storage, "storage");
        Intrinsics.j(initTasksList, "initTasksList");
        Intrinsics.j(corruptionHandler, "corruptionHandler");
        Intrinsics.j(scope, "scope");
        this.storage = storage;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        this.data = C17154h.E(new d(this, null));
        this.collectorMutex = Av.g.b(false, 1, null);
        this.inMemoryCache = new C2946k<>();
        this.readAndInit = new b(this, initTasksList);
        this.storageConnectionDelegate = LazyKt.b(new r(this));
        this.coordinator = LazyKt.b(new c(this));
        this.writeActor = new F<>(scope, new u(this), v.f1921f, new w(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof B2.C2945j.e
            if (r0 == 0) goto L13
            r0 = r6
            B2.j$e r0 = (B2.C2945j.e) r0
            int r1 = r0.f1849e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1849e = r1
            goto L18
        L13:
            B2.j$e r0 = new B2.j$e
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f1847c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f1849e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.f1846b
            Av.a r1 = (Av.a) r1
            java.lang.Object r0 = r0.f1845a
            B2.j r0 = (B2.C2945j) r0
            kotlin.ResultKt.b(r6)
            goto L4e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3a:
            kotlin.ResultKt.b(r6)
            Av.a r6 = r5.collectorMutex
            r0.f1845a = r5
            r0.f1846b = r6
            r0.f1849e = r3
            java.lang.Object r0 = r6.g(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
            r1 = r6
        L4e:
            int r6 = r0.collectorCounter     // Catch: java.lang.Throwable -> L5e
            int r6 = r6 + (-1)
            r0.collectorCounter = r6     // Catch: java.lang.Throwable -> L5e
            if (r6 != 0) goto L62
            qv.C0 r6 = r0.collectorJob     // Catch: java.lang.Throwable -> L5e
            if (r6 == 0) goto L60
            qv.C0.a.a(r6, r4, r3, r4)     // Catch: java.lang.Throwable -> L5e
            goto L60
        L5e:
            r6 = move-exception
            goto L6a
        L60:
            r0.collectorJob = r4     // Catch: java.lang.Throwable -> L5e
        L62:
            kotlin.Unit r6 = kotlin.Unit.f142422a     // Catch: java.lang.Throwable -> L5e
            r1.h(r4)
            kotlin.Unit r6 = kotlin.Unit.f142422a
            return r6
        L6a:
            r1.h(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.C2945j.p(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final <R> Object q(boolean z10, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super R> continuation) {
        return z10 ? function1.invoke(continuation) : r().b(new f(function1, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final B2.s r() {
        return (B2.s) this.coordinator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
    
        if (r9 == r1) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [B2.j, B2.j<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v21, types: [qv.x] */
    /* JADX WARN: Type inference failed for: r9v3, types: [qv.x] */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(B2.v.a<T> r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.C2945j.t(B2.v$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof B2.C2945j.h
            if (r0 == 0) goto L13
            r0 = r12
            B2.j$h r0 = (B2.C2945j.h) r0
            int r1 = r0.f1862e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1862e = r1
            goto L18
        L13:
            B2.j$h r0 = new B2.j$h
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f1860c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f1862e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.f1859b
            Av.a r1 = (Av.a) r1
            java.lang.Object r0 = r0.f1858a
            B2.j r0 = (B2.C2945j) r0
            kotlin.ResultKt.b(r12)
            goto L4e
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3a:
            kotlin.ResultKt.b(r12)
            Av.a r12 = r11.collectorMutex
            r0.f1858a = r11
            r0.f1859b = r12
            r0.f1862e = r3
            java.lang.Object r0 = r12.g(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r11
            r1 = r12
        L4e:
            int r12 = r0.collectorCounter     // Catch: java.lang.Throwable -> L67
            int r12 = r12 + r3
            r0.collectorCounter = r12     // Catch: java.lang.Throwable -> L67
            if (r12 != r3) goto L6a
            qv.O r5 = r0.scope     // Catch: java.lang.Throwable -> L67
            B2.j$i r8 = new B2.j$i     // Catch: java.lang.Throwable -> L67
            r8.<init>(r0, r4)     // Catch: java.lang.Throwable -> L67
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            qv.C0 r12 = qv.C16644i.d(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L67
            r0.collectorJob = r12     // Catch: java.lang.Throwable -> L67
            goto L6a
        L67:
            r0 = move-exception
            r12 = r0
            goto L72
        L6a:
            kotlin.Unit r12 = kotlin.Unit.f142422a     // Catch: java.lang.Throwable -> L67
            r1.h(r4)
            kotlin.Unit r12 = kotlin.Unit.f142422a
            return r12
        L72:
            r1.h(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.C2945j.u(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r4.c(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof B2.C2945j.C0037j
            if (r0 == 0) goto L13
            r0 = r6
            B2.j$j r0 = (B2.C2945j.C0037j) r0
            int r1 = r0.f1870e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1870e = r1
            goto L18
        L13:
            B2.j$j r0 = new B2.j$j
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f1868c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f1870e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            int r1 = r0.f1867b
            java.lang.Object r0 = r0.f1866a
            B2.j r0 = (B2.C2945j) r0
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L6c
        L32:
            r6 = move-exception
            goto L73
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3c:
            java.lang.Object r2 = r0.f1866a
            B2.j r2 = (B2.C2945j) r2
            kotlin.ResultKt.b(r6)
            goto L57
        L44:
            kotlin.ResultKt.b(r6)
            B2.s r6 = r5.r()
            r0.f1866a = r5
            r0.f1870e = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L56
            goto L6b
        L56:
            r2 = r5
        L57:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            B2.j<T>$b r4 = r2.readAndInit     // Catch: java.lang.Throwable -> L6f
            r0.f1866a = r2     // Catch: java.lang.Throwable -> L6f
            r0.f1867b = r6     // Catch: java.lang.Throwable -> L6f
            r0.f1870e = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r6 = r4.c(r0)     // Catch: java.lang.Throwable -> L6f
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            kotlin.Unit r6 = kotlin.Unit.f142422a
            return r6
        L6f:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L73:
            B2.k<T> r0 = r0.inMemoryCache
            B2.A r2 = new B2.A
            r2.<init>(r6, r1)
            r0.c(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.C2945j.v(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c0, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(boolean r10, kotlin.coroutines.Continuation<? super B2.H<T>> r11) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.C2945j.w(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(boolean r10, kotlin.coroutines.Continuation<? super B2.C2940e<T>> r11) throws androidx.datastore.core.CorruptionException {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.C2945j.y(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z(boolean z10, Continuation<? super H<T>> continuation) {
        return C16644i.g(this.scope.getCoroutineContext(), new q(this, z10, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(T r11, boolean r12, kotlin.coroutines.Continuation<? super java.lang.Integer> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof B2.C2945j.x
            if (r0 == 0) goto L13
            r0 = r13
            B2.j$x r0 = (B2.C2945j.x) r0
            int r1 = r0.f1928d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1928d = r1
            goto L18
        L13:
            B2.j$x r0 = new B2.j$x
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f1926b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f1928d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r11 = r0.f1925a
            kotlin.jvm.internal.Ref$IntRef r11 = (kotlin.jvm.internal.Ref.IntRef) r11
            kotlin.ResultKt.b(r13)
            goto L56
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            kotlin.ResultKt.b(r13)
            kotlin.jvm.internal.Ref$IntRef r5 = new kotlin.jvm.internal.Ref$IntRef
            r5.<init>()
            B2.J r13 = r10.s()
            B2.j$y r4 = new B2.j$y
            r9 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f1925a = r5
            r0.f1928d = r3
            java.lang.Object r11 = r13.b(r4, r0)
            if (r11 != r1) goto L55
            return r1
        L55:
            r11 = r5
        L56:
            int r11 = r11.f142833a
            java.lang.Integer r11 = kotlin.coroutines.jvm.internal.Boxing.d(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.C2945j.B(java.lang.Object, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // B2.InterfaceC2943h
    public InterfaceC17152f<T> getData() {
        return this.data;
    }

    public final J<T> s() {
        return this.storageConnectionDelegate.getValue();
    }

    private final Object A(Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, CoroutineContext coroutineContext, Continuation<? super T> continuation) {
        return r().b(new s(this, coroutineContext, function2, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object x(Continuation<? super T> continuation) {
        return K.a(s(), continuation);
    }

    @Override // B2.InterfaceC2943h
    public Object a(Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        N n10 = (N) continuation.getContext().g(N.Companion.C0030a.f1762a);
        if (n10 != null) {
            n10.e(this);
        }
        return C16644i.g(new N(n10, this), new t(this, function2, null), continuation);
    }
}
