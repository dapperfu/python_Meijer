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
import mv.C0;
import mv.C15805i;
import mv.C15839z;
import mv.InterfaceC15783O;
import mv.InterfaceC15835x;
import pv.C16563h;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import wv.InterfaceC17929a;

@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 i*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u00179Bp\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012?\b\u0002\u0010\u000e\u001a9\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00060\u0005\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014JC\u0010\u0017\u001a\u00028\u000021\u0010\u0016\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0006H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0080@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\fH\u0082@¢\u0006\u0004\b!\u0010 J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010\"\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b$\u0010%J\u001e\u0010\u0015\u001a\u00020\f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0082@¢\u0006\u0004\b\u0015\u0010(J\u0010\u0010)\u001a\u00020\fH\u0082@¢\u0006\u0004\b)\u0010 J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010\"\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b*\u0010%J\u0010\u0010+\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b+\u0010 JK\u0010.\u001a\u00028\u000021\u0010\u0016\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00062\u0006\u0010-\u001a\u00020,H\u0082@¢\u0006\u0004\b.\u0010/J\u001e\u00102\u001a\b\u0012\u0004\u0012\u00028\u0000012\u0006\u00100\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b2\u0010%JI\u00106\u001a\u00028\u0001\"\u0004\b\u0001\u001032\u0006\u00100\u001a\u00020\u001a2\u001c\u00105\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r04H\u0082@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b6\u00107R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00108R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R \u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010I\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001e\u0010U\u001a\f0RR\b\u0012\u0004\u0012\u00028\u00000\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR \u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000W0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001b\u0010_\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010Y\u001a\u0004\b]\u0010^R \u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR!\u0010h\u001a\b\u0012\u0004\u0012\u00028\u00000W8@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\bd\u0010e*\u0004\bf\u0010g¨\u0006j"}, d2 = {"LB2/j;", "T", "LB2/h;", "LB2/I;", PlaceTypes.STORAGE, "", "Lkotlin/Function2;", "LB2/r;", "Lkotlin/ParameterName;", "name", "api", "Lkotlin/coroutines/Continuation;", "", "", "initTasksList", "LB2/d;", "corruptionHandler", "Lmv/O;", "scope", "<init>", "(LB2/I;Ljava/util/List;LB2/d;Lmv/O;)V", "t", "transform", "a", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newData", "", "updateCache", "", "B", "(Ljava/lang/Object;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "u", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p", "requireLock", "LB2/H;", "z", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LB2/v$a;", "update", "(LB2/v$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "v", "w", "x", "Lkotlin/coroutines/CoroutineContext;", "callerContext", "A", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasWriteFileLock", "LB2/e;", "y", "R", "Lkotlin/Function1;", "block", "q", "(ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LB2/I;", "b", "LB2/d;", "c", "Lmv/O;", "Lpv/f;", "d", "Lpv/f;", "getData", "()Lpv/f;", "data", "Lwv/a;", "e", "Lwv/a;", "collectorMutex", "f", "I", "collectorCounter", "Lmv/C0;", "g", "Lmv/C0;", "collectorJob", "LB2/k;", "h", "LB2/k;", "inMemoryCache", "LB2/j$b;", "i", "LB2/j$b;", "readAndInit", "Lkotlin/Lazy;", "LB2/J;", "j", "Lkotlin/Lazy;", "storageConnectionDelegate", "LB2/s;", "k", "r", "()LB2/s;", "coordinator", "LB2/F;", "l", "LB2/F;", "writeActor", "s", "()LB2/J;", "getStorageConnection$datastore_core_release$delegate", "(LB2/j;)Ljava/lang/Object;", "storageConnection", "m", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: B2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2913j<T> implements InterfaceC2911h<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final I<T> storage;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC2907d<T> corruptionHandler;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15783O scope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16561f<T> data;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17929a collectorMutex;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int collectorCounter;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private C0 collectorJob;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C2914k<T> inMemoryCache;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final C2913j<T>.b readAndInit;

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
        final /* synthetic */ C2913j<T> f2279d;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$InitDataStore", f = "DataStoreImpl.kt", l = {430, 434}, m = "doRun")
        /* renamed from: B2.j$b$a */
        static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            Object f2280a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f2281b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C2913j<T>.b f2282c;

            /* renamed from: d, reason: collision with root package name */
            int f2283d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C2913j<T>.b bVar, Continuation<? super a> continuation) {
                super(continuation);
                this.f2282c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f2281b = obj;
                this.f2283d |= Integer.MIN_VALUE;
                return this.f2282c.b(this);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "LB2/e;", "<anonymous>", "()LB2/e;"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", l = {437, 458, 546, 468}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: B2.j$b$b, reason: collision with other inner class name */
        static final class C0045b extends SuspendLambda implements Function1<Continuation<? super C2908e<T>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f2284a;

            /* renamed from: b, reason: collision with root package name */
            Object f2285b;

            /* renamed from: c, reason: collision with root package name */
            Object f2286c;

            /* renamed from: d, reason: collision with root package name */
            Object f2287d;

            /* renamed from: e, reason: collision with root package name */
            Object f2288e;

            /* renamed from: f, reason: collision with root package name */
            int f2289f;

            /* renamed from: g, reason: collision with root package name */
            int f2290g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ C2913j<T> f2291h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ C2913j<T>.b f2292i;

            @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001JC\u0010\t\u001a\u00028\u000021\u0010\b\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002H\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"B2/j$b$b$a", "LB2/r;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "t", "Lkotlin/coroutines/Continuation;", "", "transform", "a", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: B2.j$b$b$a */
            public static final class a implements B2.r<T> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC17929a f2293a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Ref.BooleanRef f2294b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Ref.ObjectRef<T> f2295c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C2913j<T> f2296d;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1", f = "DataStoreImpl.kt", l = {544, 447, 449}, m = "updateData")
                /* renamed from: B2.j$b$b$a$a, reason: collision with other inner class name */
                static final class C0046a extends ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    Object f2297a;

                    /* renamed from: b, reason: collision with root package name */
                    Object f2298b;

                    /* renamed from: c, reason: collision with root package name */
                    Object f2299c;

                    /* renamed from: d, reason: collision with root package name */
                    Object f2300d;

                    /* renamed from: e, reason: collision with root package name */
                    Object f2301e;

                    /* renamed from: f, reason: collision with root package name */
                    /* synthetic */ Object f2302f;

                    /* renamed from: h, reason: collision with root package name */
                    int f2304h;

                    C0046a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f2302f = obj;
                        this.f2304h |= Integer.MIN_VALUE;
                        return a.this.a(null, this);
                    }
                }

                a(InterfaceC17929a interfaceC17929a, Ref.BooleanRef booleanRef, Ref.ObjectRef<T> objectRef, C2913j<T> c2913j) {
                    this.f2293a = interfaceC17929a;
                    this.f2294b = booleanRef;
                    this.f2295c = objectRef;
                    this.f2296d = c2913j;
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
                    throw new UnsupportedOperationException("Method not decompiled: B2.C2913j.b.C0045b.a.a(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0045b(C2913j<T> c2913j, C2913j<T>.b bVar, Continuation<? super C0045b> continuation) {
                super(1, continuation);
                this.f2291h = c2913j;
                this.f2292i = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new C0045b(this.f2291h, this.f2292i, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation<? super C2908e<T>> continuation) {
                return ((C0045b) create(continuation)).invokeSuspend(Unit.f143329a);
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
                throw new UnsupportedOperationException("Method not decompiled: B2.C2913j.b.C0045b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public b(C2913j c2913j, List<? extends Function2<? super B2.r<T>, ? super Continuation<? super Unit>, ? extends Object>> initTasksList) {
            Intrinsics.j(initTasksList, "initTasksList");
            this.f2279d = c2913j;
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
                boolean r0 = r7 instanceof B2.C2913j.b.a
                if (r0 == 0) goto L13
                r0 = r7
                B2.j$b$a r0 = (B2.C2913j.b.a) r0
                int r1 = r0.f2283d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f2283d = r1
                goto L18
            L13:
                B2.j$b$a r0 = new B2.j$b$a
                r0.<init>(r6, r7)
            L18:
                java.lang.Object r7 = r0.f2281b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f2283d
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r0 = r0.f2280a
                B2.j$b r0 = (B2.C2913j.b) r0
                kotlin.ResultKt.b(r7)
                goto L6b
            L30:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L38:
                java.lang.Object r0 = r0.f2280a
                B2.j$b r0 = (B2.C2913j.b) r0
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
                B2.j<T> r7 = r6.f2279d
                B2.s r7 = B2.C2913j.c(r7)
                B2.j$b$b r2 = new B2.j$b$b
                B2.j<T> r4 = r6.f2279d
                r5 = 0
                r2.<init>(r4, r6, r5)
                r0.f2280a = r6
                r0.f2283d = r3
                java.lang.Object r7 = r7.b(r2, r0)
                if (r7 != r1) goto L6a
                goto L7b
            L6a:
                r0 = r6
            L6b:
                B2.e r7 = (B2.C2908e) r7
                goto L7f
            L6e:
                B2.j<T> r7 = r6.f2279d
                r0.f2280a = r6
                r0.f2283d = r4
                r2 = 0
                java.lang.Object r7 = B2.C2913j.n(r7, r2, r0)
                if (r7 != r1) goto L7c
            L7b:
                return r1
            L7c:
                r0 = r6
            L7d:
                B2.e r7 = (B2.C2908e) r7
            L7f:
                B2.j<T> r0 = r0.f2279d
                B2.k r0 = B2.C2913j.d(r0)
                r0.c(r7)
                kotlin.Unit r7 = kotlin.Unit.f143329a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: B2.C2913j.b.b(kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "LB2/s;", "c", "()LB2/s;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B2.j$c */
    static final class c extends Lambda implements Function0<B2.s> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C2913j<T> f2305f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C2913j<T> c2913j) {
            super(0);
            this.f2305f = c2913j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final B2.s invoke() {
            return this.f2305f.s().getCoordinator();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lpv/g;", "", "<anonymous>", "(Lpv/g;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1", f = "DataStoreImpl.kt", l = {72, 74, HttpResponseStatus.INFORMATIONAL_CONTINUE}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: B2.j$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC16562g<? super T>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f2306a;

        /* renamed from: b, reason: collision with root package name */
        int f2307b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f2308c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2913j<T> f2309d;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lpv/g;", "LB2/H;", "", "<anonymous>", "(Lpv/g;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$1", f = "DataStoreImpl.kt", l = {102}, m = "invokeSuspend")
        /* renamed from: B2.j$d$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC16562g<? super H<T>>, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f2310a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C2913j<T> f2311b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C2913j<T> c2913j, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f2311b = c2913j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f2311b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC16562g<? super H<T>> interfaceC16562g, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16562g, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f2310a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C2913j<T> c2913j = this.f2311b;
                    this.f2310a = 1;
                    if (c2913j.u(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LB2/H;", "it", "", "<anonymous>", "(LB2/H;)Z"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$2", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
        /* renamed from: B2.j$d$b */
        static final class b extends SuspendLambda implements Function2<H<T>, Continuation<? super Boolean>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f2312a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f2313b;

            b(Continuation<? super b> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                b bVar = new b(continuation);
                bVar.f2313b = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(H<T> h10, Continuation<? super Boolean> continuation) {
                return ((b) create(h10, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f2312a == 0) {
                    ResultKt.b(obj);
                    return Boxing.a(!(((H) this.f2313b) instanceof B2.q));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LB2/H;", "it", "", "<anonymous>", "(LB2/H;)Z"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$3", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
        /* renamed from: B2.j$d$c */
        static final class c extends SuspendLambda implements Function2<H<T>, Continuation<? super Boolean>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f2314a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f2315b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ H<T> f2316c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(H<T> h10, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f2316c = h10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                c cVar = new c(this.f2316c, continuation);
                cVar.f2315b = obj;
                return cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(H<T> h10, Continuation<? super Boolean> continuation) {
                return ((c) create(h10, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z10;
                IntrinsicsKt.f();
                if (this.f2314a == 0) {
                    ResultKt.b(obj);
                    H h10 = (H) this.f2315b;
                    if ((h10 instanceof C2908e) && h10.getVersion() <= this.f2316c.getVersion()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    return Boxing.a(z10);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lpv/g;", "", "it", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$5", f = "DataStoreImpl.kt", l = {116}, m = "invokeSuspend")
        /* renamed from: B2.j$d$d, reason: collision with other inner class name */
        static final class C0047d extends SuspendLambda implements Function3<InterfaceC16562g<? super T>, Throwable, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f2317a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C2913j<T> f2318b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0047d(C2913j<T> c2913j, Continuation<? super C0047d> continuation) {
                super(3, continuation);
                this.f2318b = c2913j;
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC16562g<? super T> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
                return new C0047d(this.f2318b, continuation).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f2317a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C2913j<T> c2913j = this.f2318b;
                    this.f2317a = 1;
                    if (c2913j.p(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: B2.j$d$e */
        public static final class e implements InterfaceC16561f<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16561f f2319a;

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @SourceDebugExtension
            /* renamed from: B2.j$d$e$a */
            public static final class a<T> implements InterfaceC16562g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC16562g f2320a;

                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", f = "DataStoreImpl.kt", l = {223}, m = "emit")
                @SourceDebugExtension
                /* renamed from: B2.j$d$e$a$a, reason: collision with other inner class name */
                public static final class C0048a extends ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f2321a;

                    /* renamed from: b, reason: collision with root package name */
                    int f2322b;

                    public C0048a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f2321a = obj;
                        this.f2322b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC16562g interfaceC16562g) {
                    this.f2320a = interfaceC16562g;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // pv.InterfaceC16562g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof B2.C2913j.d.e.a.C0048a
                        if (r0 == 0) goto L13
                        r0 = r6
                        B2.j$d$e$a$a r0 = (B2.C2913j.d.e.a.C0048a) r0
                        int r1 = r0.f2322b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f2322b = r1
                        goto L18
                    L13:
                        B2.j$d$e$a$a r0 = new B2.j$d$e$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f2321a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                        int r2 = r0.f2322b
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
                        pv.g r6 = r4.f2320a
                        B2.H r5 = (B2.H) r5
                        boolean r2 = r5 instanceof B2.A
                        if (r2 != 0) goto L69
                        boolean r2 = r5 instanceof B2.C2908e
                        if (r2 == 0) goto L52
                        B2.e r5 = (B2.C2908e) r5
                        java.lang.Object r5 = r5.c()
                        r0.f2322b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4f
                        return r1
                    L4f:
                        kotlin.Unit r5 = kotlin.Unit.f143329a
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
                    throw new UnsupportedOperationException("Method not decompiled: B2.C2913j.d.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public e(InterfaceC16561f interfaceC16561f) {
                this.f2319a = interfaceC16561f;
            }

            @Override // pv.InterfaceC16561f
            public Object collect(InterfaceC16562g interfaceC16562g, Continuation continuation) {
                Object objCollect = this.f2319a.collect(new a(interfaceC16562g), continuation);
                return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C2913j<T> c2913j, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f2309d = c2913j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f2309d, continuation);
            dVar.f2308c = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super T> interfaceC16562g, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16562g, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
        
            if (pv.C16563h.x(r1, r9, r8) == r0) goto L33;
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
                int r1 = r8.f2307b
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
                java.lang.Object r1 = r8.f2306a
                B2.H r1 = (B2.H) r1
                java.lang.Object r3 = r8.f2308c
                pv.g r3 = (pv.InterfaceC16562g) r3
                kotlin.ResultKt.b(r9)
                goto L67
            L2a:
                java.lang.Object r1 = r8.f2308c
                pv.g r1 = (pv.InterfaceC16562g) r1
                kotlin.ResultKt.b(r9)
                goto L4b
            L32:
                kotlin.ResultKt.b(r9)
                java.lang.Object r9 = r8.f2308c
                pv.g r9 = (pv.InterfaceC16562g) r9
                B2.j<T> r1 = r8.f2309d
                r8.f2308c = r9
                r8.f2307b = r4
                r4 = 0
                java.lang.Object r1 = B2.C2913j.o(r1, r4, r8)
                if (r1 != r0) goto L48
                goto Lbd
            L48:
                r7 = r1
                r1 = r9
                r9 = r7
            L4b:
                B2.H r9 = (B2.H) r9
                boolean r4 = r9 instanceof B2.C2908e
                if (r4 == 0) goto L6a
                r4 = r9
                B2.e r4 = (B2.C2908e) r4
                java.lang.Object r4 = r4.c()
                r8.f2308c = r1
                r8.f2306a = r9
                r8.f2307b = r3
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
                kotlin.Unit r9 = kotlin.Unit.f143329a
                return r9
            L79:
                B2.j<T> r3 = r8.f2309d
                B2.k r3 = B2.C2913j.d(r3)
                pv.f r3 = r3.b()
                B2.j$d$a r4 = new B2.j$d$a
                B2.j<T> r5 = r8.f2309d
                r6 = 0
                r4.<init>(r5, r6)
                pv.f r3 = pv.C16563h.P(r3, r4)
                B2.j$d$b r4 = new B2.j$d$b
                r4.<init>(r6)
                pv.f r3 = pv.C16563h.a0(r3, r4)
                B2.j$d$c r4 = new B2.j$d$c
                r4.<init>(r9, r6)
                pv.f r9 = pv.C16563h.v(r3, r4)
                B2.j$d$e r3 = new B2.j$d$e
                r3.<init>(r9)
                B2.j$d$d r9 = new B2.j$d$d
                B2.j<T> r4 = r8.f2309d
                r9.<init>(r4, r6)
                pv.f r9 = pv.C16563h.N(r3, r9)
                r8.f2308c = r6
                r8.f2306a = r6
                r8.f2307b = r2
                java.lang.Object r9 = pv.C16563h.x(r1, r9, r8)
                if (r9 != r0) goto Lbe
            Lbd:
                return r0
            Lbe:
                kotlin.Unit r9 = kotlin.Unit.f143329a
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
            throw new UnsupportedOperationException("Method not decompiled: B2.C2913j.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {544}, m = "decrementCollector")
    /* renamed from: B2.j$e */
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f2324a;

        /* renamed from: b, reason: collision with root package name */
        Object f2325b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f2326c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2913j<T> f2327d;

        /* renamed from: e, reason: collision with root package name */
        int f2328e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C2913j<T> c2913j, Continuation<? super e> continuation) {
            super(continuation);
            this.f2327d = c2913j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2326c = obj;
            this.f2328e |= Integer.MIN_VALUE;
            return this.f2327d.p(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "R", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3", f = "DataStoreImpl.kt", l = {HttpResponseStatus.ERROR_REQUESTED_RANGE_NOT_SATISFIABLE}, m = "invokeSuspend")
    /* renamed from: B2.j$f */
    static final class f<R> extends SuspendLambda implements Function1<Continuation<? super R>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f2329a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Continuation<? super R>, Object> f2330b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super f> continuation) {
            super(1, continuation);
            this.f2330b = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new f(this.f2330b, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super R> continuation) {
            return ((f) create(continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f2329a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Function1<Continuation<? super R>, Object> function1 = this.f2330b;
            this.f2329a = 1;
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
        Object f2331a;

        /* renamed from: b, reason: collision with root package name */
        Object f2332b;

        /* renamed from: c, reason: collision with root package name */
        Object f2333c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f2334d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C2913j<T> f2335e;

        /* renamed from: f, reason: collision with root package name */
        int f2336f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C2913j<T> c2913j, Continuation<? super g> continuation) {
            super(continuation);
            this.f2335e = c2913j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2334d = obj;
            this.f2336f |= Integer.MIN_VALUE;
            return this.f2335e.t(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {544}, m = "incrementCollector")
    /* renamed from: B2.j$h */
    static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f2337a;

        /* renamed from: b, reason: collision with root package name */
        Object f2338b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f2339c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2913j<T> f2340d;

        /* renamed from: e, reason: collision with root package name */
        int f2341e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C2913j<T> c2913j, Continuation<? super h> continuation) {
            super(continuation);
            this.f2340d = c2913j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2339c = obj;
            this.f2341e |= Integer.MIN_VALUE;
            return this.f2340d.u(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", f = "DataStoreImpl.kt", l = {134, 135}, m = "invokeSuspend")
    /* renamed from: B2.j$i */
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f2342a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2913j<T> f2343b;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "", "it", "a", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: B2.j$i$a */
        static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C2913j<T> f2344a;

            a(C2913j<T> c2913j) {
                this.f2344a = c2913j;
            }

            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
                if (((C2913j) this.f2344a).inMemoryCache.a() instanceof B2.q) {
                    return Unit.f143329a;
                }
                Object objW = this.f2344a.w(true, continuation);
                return objW == IntrinsicsKt.f() ? objW : Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(C2913j<T> c2913j, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f2343b = c2913j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new i(this.f2343b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                int r1 = r4.f2342a
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
                B2.j<T> r5 = r4.f2343b
                B2.j$b r5 = B2.C2913j.e(r5)
                r4.f2342a = r3
                java.lang.Object r5 = r5.a(r4)
                if (r5 != r0) goto L30
                goto L4d
            L30:
                B2.j<T> r5 = r4.f2343b
                B2.s r5 = B2.C2913j.c(r5)
                pv.f r5 = r5.c()
                pv.f r5 = pv.C16563h.o(r5)
                B2.j$i$a r1 = new B2.j$i$a
                B2.j<T> r3 = r4.f2343b
                r1.<init>(r3)
                r4.f2342a = r2
                java.lang.Object r5 = r5.collect(r1, r4)
                if (r5 != r0) goto L4e
            L4d:
                return r0
            L4e:
                kotlin.Unit r5 = kotlin.Unit.f143329a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: B2.C2913j.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {264, 266}, m = "readAndInitOrPropagateAndThrowFailure")
    /* renamed from: B2.j$j, reason: collision with other inner class name */
    static final class C0049j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f2345a;

        /* renamed from: b, reason: collision with root package name */
        int f2346b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f2347c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2913j<T> f2348d;

        /* renamed from: e, reason: collision with root package name */
        int f2349e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0049j(C2913j<T> c2913j, Continuation<? super C0049j> continuation) {
            super(continuation);
            this.f2348d = c2913j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2347c = obj;
            this.f2349e |= Integer.MIN_VALUE;
            return this.f2348d.v(this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {287, 296, HttpResponseStatus.REDIRECTION_NOT_MODIFIED}, m = "readDataAndUpdateCache")
    /* renamed from: B2.j$k */
    static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f2350a;

        /* renamed from: b, reason: collision with root package name */
        Object f2351b;

        /* renamed from: c, reason: collision with root package name */
        boolean f2352c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f2353d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C2913j<T> f2354e;

        /* renamed from: f, reason: collision with root package name */
        int f2355f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(C2913j<T> c2913j, Continuation<? super k> continuation) {
            super(continuation);
            this.f2354e = c2913j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2353d = obj;
            this.f2355f |= Integer.MIN_VALUE;
            return this.f2354e.w(false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lkotlin/Pair;", "LB2/H;", "", "<anonymous>", "()Lkotlin/Pair;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", l = {298, HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES}, m = "invokeSuspend")
    /* renamed from: B2.j$l */
    static final class l extends SuspendLambda implements Function1<Continuation<? super Pair<? extends H<T>, ? extends Boolean>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f2356a;

        /* renamed from: b, reason: collision with root package name */
        int f2357b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2913j<T> f2358c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(C2913j<T> c2913j, Continuation<? super l> continuation) {
            super(1, continuation);
            this.f2358c = c2913j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new l(this.f2358c, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Pair<? extends H<T>, Boolean>> continuation) {
            return ((l) create(continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2;
            H a10;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f2357b;
            try {
            } catch (Throwable th3) {
                B2.s sVarR = this.f2358c.r();
                this.f2356a = th3;
                this.f2357b = 2;
                Object objA = sVarR.a(this);
                if (objA != objF) {
                    th2 = th3;
                    obj = objA;
                }
            }
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        th2 = (Throwable) this.f2356a;
                        ResultKt.b(obj);
                        a10 = new A(th2, ((Number) obj).intValue());
                        return TuplesKt.a(a10, Boxing.a(true));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                C2913j<T> c2913j = this.f2358c;
                this.f2357b = 1;
                obj = c2913j.y(true, this);
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
        Object f2359a;

        /* renamed from: b, reason: collision with root package name */
        int f2360b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ boolean f2361c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2913j<T> f2362d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f2363e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(C2913j<T> c2913j, int i10, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f2362d = c2913j;
            this.f2363e = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            m mVar = new m(this.f2362d, this.f2363e, continuation);
            mVar.f2361c = ((Boolean) obj).booleanValue();
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Object obj) {
            return d(bool.booleanValue(), (Continuation) obj);
        }

        public final Object d(boolean z10, Continuation<? super Pair<? extends H<T>, Boolean>> continuation) {
            return ((m) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.f143329a);
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
            boolean z12 = this.f2360b;
            try {
            } catch (Throwable th3) {
                if (z12 != 0) {
                    B2.s sVarR = this.f2362d.r();
                    this.f2359a = th3;
                    this.f2361c = z12;
                    this.f2360b = 2;
                    Object objA = sVarR.a(this);
                    if (objA != objF) {
                        z10 = z12;
                        th2 = th3;
                        obj = objA;
                    }
                } else {
                    boolean z13 = z12;
                    th2 = th3;
                    iIntValue = this.f2363e;
                    z10 = z13;
                }
            }
            if (z12 != 0) {
                if (z12 != 1) {
                    if (z12 == 2) {
                        z10 = this.f2361c;
                        th2 = (Throwable) this.f2359a;
                        ResultKt.b(obj);
                        iIntValue = ((Number) obj).intValue();
                        A a10 = new A(th2, iIntValue);
                        z11 = z10;
                        h10 = a10;
                        return TuplesKt.a(h10, Boxing.a(z11));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z14 = this.f2361c;
                ResultKt.b(obj);
                z12 = z14;
            } else {
                ResultKt.b(obj);
                boolean z15 = this.f2361c;
                C2913j<T> c2913j = this.f2362d;
                this.f2361c = z15;
                this.f2360b = 1;
                obj = c2913j.y(z15, this);
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
        Object f2364a;

        /* renamed from: b, reason: collision with root package name */
        Object f2365b;

        /* renamed from: c, reason: collision with root package name */
        Object f2366c;

        /* renamed from: d, reason: collision with root package name */
        Object f2367d;

        /* renamed from: e, reason: collision with root package name */
        boolean f2368e;

        /* renamed from: f, reason: collision with root package name */
        int f2369f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f2370g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C2913j<T> f2371h;

        /* renamed from: i, reason: collision with root package name */
        int f2372i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(C2913j<T> c2913j, Continuation<? super n> continuation) {
            super(continuation);
            this.f2371h = c2913j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2370g = obj;
            this.f2372i |= Integer.MIN_VALUE;
            return this.f2371h.y(false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "locked", "LB2/e;", "<anonymous>", "(Z)LB2/e;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", f = "DataStoreImpl.kt", l = {370, 371}, m = "invokeSuspend")
    /* renamed from: B2.j$o */
    static final class o extends SuspendLambda implements Function2<Boolean, Continuation<? super C2908e<T>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f2373a;

        /* renamed from: b, reason: collision with root package name */
        int f2374b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ boolean f2375c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2913j<T> f2376d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f2377e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(C2913j<T> c2913j, int i10, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f2376d = c2913j;
            this.f2377e = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            o oVar = new o(this.f2376d, this.f2377e, continuation);
            oVar.f2375c = ((Boolean) obj).booleanValue();
            return oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Object obj) {
            return d(bool.booleanValue(), (Continuation) obj);
        }

        public final Object d(boolean z10, Continuation<? super C2908e<T>> continuation) {
            return ((o) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.f143329a);
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
                int r1 = r5.f2374b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r5.f2373a
                kotlin.ResultKt.b(r6)
                goto L49
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                boolean r1 = r5.f2375c
                kotlin.ResultKt.b(r6)
                goto L34
            L22:
                kotlin.ResultKt.b(r6)
                boolean r1 = r5.f2375c
                B2.j<T> r6 = r5.f2376d
                r5.f2375c = r1
                r5.f2374b = r3
                java.lang.Object r6 = B2.C2913j.m(r6, r5)
                if (r6 != r0) goto L34
                goto L46
            L34:
                if (r1 == 0) goto L50
                B2.j<T> r1 = r5.f2376d
                B2.s r1 = B2.C2913j.c(r1)
                r5.f2373a = r6
                r5.f2374b = r2
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
                int r0 = r5.f2377e
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
            throw new UnsupportedOperationException("Method not decompiled: B2.C2913j.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", l = {387, 388, 390}, m = "invokeSuspend")
    /* renamed from: B2.j$p */
    static final class p extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f2378a;

        /* renamed from: b, reason: collision with root package name */
        int f2379b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<T> f2380c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2913j<T> f2381d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f2382e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(Ref.ObjectRef<T> objectRef, C2913j<T> c2913j, Ref.IntRef intRef, Continuation<? super p> continuation) {
            super(1, continuation);
            this.f2380c = objectRef;
            this.f2381d = c2913j;
            this.f2382e = intRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new p(this.f2380c, this.f2381d, this.f2382e, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((p) create(continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.IntRef intRef;
            Ref.ObjectRef<T> objectRef;
            Ref.IntRef intRef2;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f2379b;
            try {
            } catch (CorruptionException unused) {
                Ref.IntRef intRef3 = this.f2382e;
                C2913j<T> c2913j = this.f2381d;
                T t10 = this.f2380c.f143742a;
                this.f2378a = intRef3;
                this.f2379b = 3;
                Object objB = c2913j.B(t10, true, this);
                if (objB != objF) {
                    intRef = intRef3;
                    obj = (T) objB;
                }
            }
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            intRef = (Ref.IntRef) this.f2378a;
                            ResultKt.b(obj);
                            intRef.f143740a = ((Number) obj).intValue();
                            return Unit.f143329a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    intRef2 = (Ref.IntRef) this.f2378a;
                    ResultKt.b(obj);
                    intRef2.f143740a = ((Number) obj).intValue();
                    return Unit.f143329a;
                }
                objectRef = (Ref.ObjectRef) this.f2378a;
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                objectRef = this.f2380c;
                C2913j<T> c2913j2 = this.f2381d;
                this.f2378a = objectRef;
                this.f2379b = 1;
                obj = (T) c2913j2.x(this);
                if (obj == objF) {
                }
                return objF;
            }
            objectRef.f143742a = (T) obj;
            intRef2 = this.f2382e;
            B2.s sVarR = this.f2381d.r();
            this.f2378a = intRef2;
            this.f2379b = 2;
            obj = (T) sVarR.a(this);
            if (obj == objF) {
                return objF;
            }
            intRef2.f143740a = ((Number) obj).intValue();
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lmv/O;", "LB2/H;", "<anonymous>", "(Lmv/O;)LB2/H;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readState$2", f = "DataStoreImpl.kt", l = {218, 226}, m = "invokeSuspend")
    /* renamed from: B2.j$q */
    static final class q extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super H<T>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f2383a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2913j<T> f2384b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f2385c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(C2913j<T> c2913j, boolean z10, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f2384b = c2913j;
            this.f2385c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new q(this.f2384b, this.f2385c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super H<T>> continuation) {
            return ((q) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                int r1 = r4.f2383a
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
                B2.j<T> r5 = r4.f2384b
                B2.k r5 = B2.C2913j.d(r5)
                B2.H r5 = r5.a()
                boolean r5 = r5 instanceof B2.q
                if (r5 == 0) goto L3c
                B2.j<T> r5 = r4.f2384b
                B2.k r5 = B2.C2913j.d(r5)
                B2.H r5 = r5.a()
                return r5
            L3c:
                B2.j<T> r5 = r4.f2384b     // Catch: java.lang.Throwable -> L1e
                r4.f2383a = r3     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r5 = B2.C2913j.k(r5, r4)     // Catch: java.lang.Throwable -> L1e
                if (r5 != r0) goto L47
                goto L53
            L47:
                B2.j<T> r5 = r4.f2384b
                boolean r1 = r4.f2385c
                r4.f2383a = r2
                java.lang.Object r5 = B2.C2913j.l(r5, r1, r4)
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
            throw new UnsupportedOperationException("Method not decompiled: B2.C2913j.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "LB2/J;", "c", "()LB2/J;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B2.j$r */
    static final class r extends Lambda implements Function0<J<T>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C2913j<T> f2386f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(C2913j<T> c2913j) {
            super(0);
            this.f2386f = c2913j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final J<T> invoke() {
            return ((C2913j) this.f2386f).storage.a();
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\u008a@"}, d2 = {"<anonymous>", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", l = {330, 331, 337}, m = "invokeSuspend")
    /* renamed from: B2.j$s */
    static final class s extends SuspendLambda implements Function1<Continuation<? super T>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f2387a;

        /* renamed from: b, reason: collision with root package name */
        int f2388b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2913j<T> f2389c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f2390d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<T, Continuation<? super T>, Object> f2391e;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lmv/O;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", f = "DataStoreImpl.kt", l = {331}, m = "invokeSuspend")
        /* renamed from: B2.j$s$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super T>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f2392a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2<T, Continuation<? super T>, Object> f2393b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C2908e<T> f2394c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, C2908e<T> c2908e, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f2393b = function2;
                this.f2394c = c2908e;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f2393b, this.f2394c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super T> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f2392a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                Function2<T, Continuation<? super T>, Object> function2 = this.f2393b;
                T tC = this.f2394c.c();
                this.f2392a = 1;
                Object objInvoke = function2.invoke(tC, this);
                if (objInvoke == objF) {
                    return objF;
                }
                return objInvoke;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s(C2913j<T> c2913j, CoroutineContext coroutineContext, Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super s> continuation) {
            super(1, continuation);
            this.f2389c = c2913j;
            this.f2390d = coroutineContext;
            this.f2391e = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new s(this.f2389c, this.f2390d, this.f2391e, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super T> continuation) {
            return ((s) create(continuation)).invokeSuspend(Unit.f143329a);
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
                int r1 = r8.f2388b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2b
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r8.f2387a
                kotlin.ResultKt.b(r9)
                return r0
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.f2387a
                B2.e r1 = (B2.C2908e) r1
                kotlin.ResultKt.b(r9)
                goto L51
            L27:
                kotlin.ResultKt.b(r9)
                goto L39
            L2b:
                kotlin.ResultKt.b(r9)
                B2.j<T> r9 = r8.f2389c
                r8.f2388b = r4
                java.lang.Object r9 = B2.C2913j.n(r9, r4, r8)
                if (r9 != r0) goto L39
                goto L6a
            L39:
                r1 = r9
                B2.e r1 = (B2.C2908e) r1
                kotlin.coroutines.CoroutineContext r9 = r8.f2390d
                B2.j$s$a r5 = new B2.j$s$a
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> r6 = r8.f2391e
                r7 = 0
                r5.<init>(r6, r1, r7)
                r8.f2387a = r1
                r8.f2388b = r3
                java.lang.Object r9 = mv.C15805i.g(r9, r5, r8)
                if (r9 != r0) goto L51
                goto L6a
            L51:
                r1.b()
                java.lang.Object r1 = r1.c()
                boolean r1 = kotlin.jvm.internal.Intrinsics.e(r1, r9)
                if (r1 != 0) goto L6b
                B2.j<T> r1 = r8.f2389c
                r8.f2387a = r9
                r8.f2388b = r2
                java.lang.Object r1 = r1.B(r9, r4, r8)
                if (r1 != r0) goto L6b
            L6a:
                return r0
            L6b:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: B2.C2913j.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lmv/O;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", l = {169}, m = "invokeSuspend")
    /* renamed from: B2.j$t */
    static final class t extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super T>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f2395a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f2396b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2913j<T> f2397c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<T, Continuation<? super T>, Object> f2398d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        t(C2913j<T> c2913j, Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super t> continuation) {
            super(2, continuation);
            this.f2397c = c2913j;
            this.f2398d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            t tVar = new t(this.f2397c, this.f2398d, continuation);
            tVar.f2396b = obj;
            return tVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super T> continuation) {
            return ((t) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f2395a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f2396b;
            InterfaceC15835x interfaceC15835xB = C15839z.b(null, 1, null);
            ((C2913j) this.f2397c).writeActor.e(new v.a(this.f2398d, interfaceC15835xB, ((C2913j) this.f2397c).inMemoryCache.a(), interfaceC15783O.getCoroutineContext()));
            this.f2395a = 1;
            Object objH = interfaceC15835xB.H(this);
            if (objH == objF) {
                return objF;
            }
            return objH;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B2.j$u */
    static final class u extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C2913j<T> f2399f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(C2913j<T> c2913j) {
            super(1);
            this.f2399f = c2913j;
        }

        public final void a(Throwable th2) {
            if (th2 != null) {
                ((C2913j) this.f2399f).inMemoryCache.c(new B2.q(th2));
            }
            if (((C2913j) this.f2399f).storageConnectionDelegate.a()) {
                this.f2399f.s().close();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "LB2/v$a;", "msg", "", "ex", "", "a", "(LB2/v$a;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B2.j$v */
    static final class v extends Lambda implements Function2<v.a<T>, Throwable, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final v f2400f = new v();

        v() {
            super(2);
        }

        public final void a(v.a<T> msg, Throwable th2) {
            Intrinsics.j(msg, "msg");
            InterfaceC15835x<T> interfaceC15835xA = msg.a();
            if (th2 == null) {
                th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            interfaceC15835xA.c(th2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Throwable th2) {
            a((v.a) obj, th2);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LB2/v$a;", "msg", "", "<anonymous>", "(LB2/v$a;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$writeActor$3", f = "DataStoreImpl.kt", l = {207}, m = "invokeSuspend")
    /* renamed from: B2.j$w */
    static final class w extends SuspendLambda implements Function2<v.a<T>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f2401a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f2402b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2913j<T> f2403c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(C2913j<T> c2913j, Continuation<? super w> continuation) {
            super(2, continuation);
            this.f2403c = c2913j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            w wVar = new w(this.f2403c, continuation);
            wVar.f2402b = obj;
            return wVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v.a<T> aVar, Continuation<? super Unit> continuation) {
            return ((w) create(aVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f2401a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                v.a aVar = (v.a) this.f2402b;
                C2913j<T> c2913j = this.f2403c;
                this.f2401a = 1;
                if (c2913j.t(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {348}, m = "writeData$datastore_core_release")
    /* renamed from: B2.j$x */
    static final class x extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f2404a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f2405b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2913j<T> f2406c;

        /* renamed from: d, reason: collision with root package name */
        int f2407d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(C2913j<T> c2913j, Continuation<? super x> continuation) {
            super(continuation);
            this.f2406c = c2913j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2405b = obj;
            this.f2407d |= Integer.MIN_VALUE;
            return this.f2406c.B(null, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LB2/O;", "", "<anonymous>", "(LB2/O;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$writeData$2", f = "DataStoreImpl.kt", l = {352, 353}, m = "invokeSuspend")
    /* renamed from: B2.j$y */
    static final class y extends SuspendLambda implements Function2<O<T>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f2408a;

        /* renamed from: b, reason: collision with root package name */
        int f2409b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f2410c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f2411d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C2913j<T> f2412e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ T f2413f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f2414g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(Ref.IntRef intRef, C2913j<T> c2913j, T t10, boolean z10, Continuation<? super y> continuation) {
            super(2, continuation);
            this.f2411d = intRef;
            this.f2412e = c2913j;
            this.f2413f = t10;
            this.f2414g = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            y yVar = new y(this.f2411d, this.f2412e, this.f2413f, this.f2414g, continuation);
            yVar.f2410c = obj;
            return yVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(O<T> o10, Continuation<? super Unit> continuation) {
            return ((y) create(o10, continuation)).invokeSuspend(Unit.f143329a);
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
                int r1 = r6.f2409b
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
                java.lang.Object r1 = r6.f2408a
                kotlin.jvm.internal.Ref$IntRef r1 = (kotlin.jvm.internal.Ref.IntRef) r1
                java.lang.Object r3 = r6.f2410c
                B2.O r3 = (B2.O) r3
                kotlin.ResultKt.b(r7)
                goto L45
            L26:
                kotlin.ResultKt.b(r7)
                java.lang.Object r7 = r6.f2410c
                B2.O r7 = (B2.O) r7
                kotlin.jvm.internal.Ref$IntRef r1 = r6.f2411d
                B2.j<T> r4 = r6.f2412e
                B2.s r4 = B2.C2913j.c(r4)
                r6.f2410c = r7
                r6.f2408a = r1
                r6.f2409b = r3
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
                r1.f143740a = r7
                T r7 = r6.f2413f
                r1 = 0
                r6.f2410c = r1
                r6.f2408a = r1
                r6.f2409b = r2
                java.lang.Object r7 = r3.a(r7, r6)
                if (r7 != r0) goto L5d
            L5c:
                return r0
            L5d:
                boolean r7 = r6.f2414g
                if (r7 == 0) goto L7d
                B2.j<T> r7 = r6.f2412e
                B2.k r7 = B2.C2913j.d(r7)
                B2.e r0 = new B2.e
                T r1 = r6.f2413f
                if (r1 == 0) goto L72
                int r2 = r1.hashCode()
                goto L73
            L72:
                r2 = 0
            L73:
                kotlin.jvm.internal.Ref$IntRef r3 = r6.f2411d
                int r3 = r3.f143740a
                r0.<init>(r1, r2, r3)
                r7.c(r0)
            L7d:
                kotlin.Unit r7 = kotlin.Unit.f143329a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: B2.C2913j.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C2913j(I<T> storage, List<? extends Function2<? super B2.r<T>, ? super Continuation<? super Unit>, ? extends Object>> initTasksList, InterfaceC2907d<T> corruptionHandler, InterfaceC15783O scope) {
        Intrinsics.j(storage, "storage");
        Intrinsics.j(initTasksList, "initTasksList");
        Intrinsics.j(corruptionHandler, "corruptionHandler");
        Intrinsics.j(scope, "scope");
        this.storage = storage;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        this.data = C16563h.E(new d(this, null));
        this.collectorMutex = wv.g.b(false, 1, null);
        this.inMemoryCache = new C2914k<>();
        this.readAndInit = new b(this, initTasksList);
        this.storageConnectionDelegate = LazyKt.b(new r(this));
        this.coordinator = LazyKt.b(new c(this));
        this.writeActor = new F<>(scope, new u(this), v.f2400f, new w(this, null));
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
            boolean r0 = r6 instanceof B2.C2913j.e
            if (r0 == 0) goto L13
            r0 = r6
            B2.j$e r0 = (B2.C2913j.e) r0
            int r1 = r0.f2328e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2328e = r1
            goto L18
        L13:
            B2.j$e r0 = new B2.j$e
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f2326c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f2328e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.f2325b
            wv.a r1 = (wv.InterfaceC17929a) r1
            java.lang.Object r0 = r0.f2324a
            B2.j r0 = (B2.C2913j) r0
            kotlin.ResultKt.b(r6)
            goto L4e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3a:
            kotlin.ResultKt.b(r6)
            wv.a r6 = r5.collectorMutex
            r0.f2324a = r5
            r0.f2325b = r6
            r0.f2328e = r3
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
            mv.C0 r6 = r0.collectorJob     // Catch: java.lang.Throwable -> L5e
            if (r6 == 0) goto L60
            mv.C0.a.a(r6, r4, r3, r4)     // Catch: java.lang.Throwable -> L5e
            goto L60
        L5e:
            r6 = move-exception
            goto L6a
        L60:
            r0.collectorJob = r4     // Catch: java.lang.Throwable -> L5e
        L62:
            kotlin.Unit r6 = kotlin.Unit.f143329a     // Catch: java.lang.Throwable -> L5e
            r1.h(r4)
            kotlin.Unit r6 = kotlin.Unit.f143329a
            return r6
        L6a:
            r1.h(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.C2913j.p(kotlin.coroutines.Continuation):java.lang.Object");
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
    /* JADX WARN: Type inference failed for: r9v21, types: [mv.x] */
    /* JADX WARN: Type inference failed for: r9v3, types: [mv.x] */
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
        throw new UnsupportedOperationException("Method not decompiled: B2.C2913j.t(B2.v$a, kotlin.coroutines.Continuation):java.lang.Object");
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
            boolean r0 = r12 instanceof B2.C2913j.h
            if (r0 == 0) goto L13
            r0 = r12
            B2.j$h r0 = (B2.C2913j.h) r0
            int r1 = r0.f2341e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2341e = r1
            goto L18
        L13:
            B2.j$h r0 = new B2.j$h
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f2339c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f2341e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.f2338b
            wv.a r1 = (wv.InterfaceC17929a) r1
            java.lang.Object r0 = r0.f2337a
            B2.j r0 = (B2.C2913j) r0
            kotlin.ResultKt.b(r12)
            goto L4e
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3a:
            kotlin.ResultKt.b(r12)
            wv.a r12 = r11.collectorMutex
            r0.f2337a = r11
            r0.f2338b = r12
            r0.f2341e = r3
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
            mv.O r5 = r0.scope     // Catch: java.lang.Throwable -> L67
            B2.j$i r8 = new B2.j$i     // Catch: java.lang.Throwable -> L67
            r8.<init>(r0, r4)     // Catch: java.lang.Throwable -> L67
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            mv.C0 r12 = mv.C15805i.d(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L67
            r0.collectorJob = r12     // Catch: java.lang.Throwable -> L67
            goto L6a
        L67:
            r0 = move-exception
            r12 = r0
            goto L72
        L6a:
            kotlin.Unit r12 = kotlin.Unit.f143329a     // Catch: java.lang.Throwable -> L67
            r1.h(r4)
            kotlin.Unit r12 = kotlin.Unit.f143329a
            return r12
        L72:
            r1.h(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.C2913j.u(kotlin.coroutines.Continuation):java.lang.Object");
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
            boolean r0 = r6 instanceof B2.C2913j.C0049j
            if (r0 == 0) goto L13
            r0 = r6
            B2.j$j r0 = (B2.C2913j.C0049j) r0
            int r1 = r0.f2349e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2349e = r1
            goto L18
        L13:
            B2.j$j r0 = new B2.j$j
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f2347c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f2349e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            int r1 = r0.f2346b
            java.lang.Object r0 = r0.f2345a
            B2.j r0 = (B2.C2913j) r0
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
            java.lang.Object r2 = r0.f2345a
            B2.j r2 = (B2.C2913j) r2
            kotlin.ResultKt.b(r6)
            goto L57
        L44:
            kotlin.ResultKt.b(r6)
            B2.s r6 = r5.r()
            r0.f2345a = r5
            r0.f2349e = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L56
            goto L6b
        L56:
            r2 = r5
        L57:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            B2.j<T>$b r4 = r2.readAndInit     // Catch: java.lang.Throwable -> L6f
            r0.f2345a = r2     // Catch: java.lang.Throwable -> L6f
            r0.f2346b = r6     // Catch: java.lang.Throwable -> L6f
            r0.f2349e = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r6 = r4.c(r0)     // Catch: java.lang.Throwable -> L6f
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            kotlin.Unit r6 = kotlin.Unit.f143329a
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
        throw new UnsupportedOperationException("Method not decompiled: B2.C2913j.v(kotlin.coroutines.Continuation):java.lang.Object");
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
        throw new UnsupportedOperationException("Method not decompiled: B2.C2913j.w(boolean, kotlin.coroutines.Continuation):java.lang.Object");
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
    public final java.lang.Object y(boolean r10, kotlin.coroutines.Continuation<? super B2.C2908e<T>> r11) throws androidx.datastore.core.CorruptionException {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.C2913j.y(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z(boolean z10, Continuation<? super H<T>> continuation) {
        return C15805i.g(this.scope.getCoroutineContext(), new q(this, z10, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(T r11, boolean r12, kotlin.coroutines.Continuation<? super java.lang.Integer> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof B2.C2913j.x
            if (r0 == 0) goto L13
            r0 = r13
            B2.j$x r0 = (B2.C2913j.x) r0
            int r1 = r0.f2407d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2407d = r1
            goto L18
        L13:
            B2.j$x r0 = new B2.j$x
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f2405b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f2407d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r11 = r0.f2404a
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
            r0.f2404a = r5
            r0.f2407d = r3
            java.lang.Object r11 = r13.b(r4, r0)
            if (r11 != r1) goto L55
            return r1
        L55:
            r11 = r5
        L56:
            int r11 = r11.f143740a
            java.lang.Integer r11 = kotlin.coroutines.jvm.internal.Boxing.d(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.C2913j.B(java.lang.Object, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // B2.InterfaceC2911h
    public InterfaceC16561f<T> getData() {
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

    @Override // B2.InterfaceC2911h
    public Object a(Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        N n10 = (N) continuation.getContext().g(N.Companion.C0042a.f2241a);
        if (n10 != null) {
            n10.e(this);
        }
        return C15805i.g(new N(n10, this), new t(this, function2, null), continuation);
    }
}
