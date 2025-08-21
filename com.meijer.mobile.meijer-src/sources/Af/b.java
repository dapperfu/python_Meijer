package Af;

import B2.InterfaceC2911h;
import E2.i;
import F2.f;
import F2.j;
import android.content.Context;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import mv.C15807j;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16561f;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u000f2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R%\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0(*\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010.¨\u0006/"}, d2 = {"LAf/b;", "", "Landroid/content/Context;", "context", "", "name", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "T", "LF2/f$a;", "key", "defaultValue", "h", "(LF2/f$a;Ljava/lang/Object;)Ljava/lang/Object;", "value", "LF2/f;", "i", "(LF2/f$a;Ljava/lang/Object;)LF2/f;", "", "f", "()Ljava/util/Map;", "Lkotlin/Function1;", "LF2/c;", "", "transform", "e", "(Lkotlin/jvm/functions/Function1;)LF2/f;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Ljava/lang/ThreadLocal;", "", "c", "Ljava/lang/ThreadLocal;", "editLock", "LB2/h;", "d", "Lkotlin/properties/ReadOnlyProperty;", "g", "(Landroid/content/Context;)LB2/h;", "dataStore", "LB2/h;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f312f = {Reflection.k(new PropertyReference2Impl(b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ThreadLocal<Boolean> editLock;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ReadOnlyProperty dataStore;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC2911h<f> dataStore;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LF2/f;", "<anonymous>", "(Lmv/O;)LF2/f;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1", f = "JavaDataStorage.kt", l = {207}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super f>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f318a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<F2.c, Unit> f320c;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LF2/c;", "it", "", "<anonymous>", "(LF2/c;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1$1", f = "JavaDataStorage.kt", l = {}, m = "invokeSuspend")
        /* renamed from: Af.b$a$a, reason: collision with other inner class name */
        static final class C0008a extends SuspendLambda implements Function2<F2.c, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f321a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f322b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<F2.c, Unit> f323c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0008a(Function1<? super F2.c, Unit> function1, Continuation<? super C0008a> continuation) {
                super(2, continuation);
                this.f323c = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C0008a c0008a = new C0008a(this.f323c, continuation);
                c0008a.f322b = obj;
                return c0008a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(F2.c cVar, Continuation<? super Unit> continuation) {
                return ((C0008a) create(cVar, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f321a == 0) {
                    ResultKt.b(obj);
                    this.f323c.invoke((F2.c) this.f322b);
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super F2.c, Unit> function1, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f320c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new a(this.f320c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super f> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f318a;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    if (!Intrinsics.e(b.this.editLock.get(), Boxing.a(true))) {
                        b.this.editLock.set(Boxing.a(true));
                        InterfaceC2911h interfaceC2911h = b.this.dataStore;
                        C0008a c0008a = new C0008a(this.f320c, null);
                        this.f318a = 1;
                        obj = j.a(interfaceC2911h, c0008a, this);
                        if (obj == objF) {
                            return objF;
                        }
                    } else {
                        throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    }
                }
                return (f) obj;
            } finally {
                b.this.editLock.set(Boxing.a(false));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmv/O;", "", "LF2/f$a;", "", "<anonymous>", "(Lmv/O;)Ljava/util/Map;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$getAllSync$1", f = "JavaDataStorage.kt", l = {157}, m = "invokeSuspend")
    /* renamed from: Af.b$b, reason: collision with other inner class name */
    static final class C0009b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Map<f.a<?>, ? extends Object>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f324a;

        C0009b(Continuation<? super C0009b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new C0009b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Map<f.a<?>, ? extends Object>> continuation) {
            return ((C0009b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Map<f.a<?>, Object> mapA;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f324a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16561f data = b.this.dataStore.getData();
                this.f324a = 1;
                obj = C16563h.C(data, this);
                if (obj == objF) {
                    return objF;
                }
            }
            f fVar = (f) obj;
            if (fVar != null && (mapA = fVar.a()) != null) {
                return mapA;
            }
            return MapsKt.k();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lmv/O;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$getSync$1", f = "JavaDataStorage.kt", l = {91}, m = "invokeSuspend")
    static final class c<T> extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super T>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f326a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f.a<T> f328c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f329d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f.a<T> aVar, T t10, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f328c = aVar;
            this.f329d = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new c(this.f328c, this.f329d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super T> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f326a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16561f<T> data = b.this.dataStore.getData();
                this.f326a = 1;
                obj = C16563h.C(data, this);
                if (obj == objF) {
                    return objF;
                }
            }
            f fVar = (f) obj;
            if (fVar != null && (objB = fVar.b(this.f328c)) != null) {
                return objB;
            }
            return this.f329d;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LF2/f;", "<anonymous>", "(Lmv/O;)LF2/f;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1", f = "JavaDataStorage.kt", l = {132}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super f>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f330a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f.a<T> f332c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f333d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LF2/c;", "it", "", "<anonymous>", "(LF2/c;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1$1", f = "JavaDataStorage.kt", l = {}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<F2.c, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f334a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f335b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ f.a<T> f336c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ T f337d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f.a<T> aVar, T t10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f336c = aVar;
                this.f337d = t10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f336c, this.f337d, continuation);
                aVar.f335b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(F2.c cVar, Continuation<? super Unit> continuation) {
                return ((a) create(cVar, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f334a == 0) {
                    ResultKt.b(obj);
                    ((F2.c) this.f335b).i(this.f336c, this.f337d);
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(f.a<T> aVar, T t10, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f332c = aVar;
            this.f333d = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new d(this.f332c, this.f333d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super f> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f330a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC2911h interfaceC2911h = b.this.dataStore;
            a aVar = new a(this.f332c, this.f333d, null);
            this.f330a = 1;
            Object objA = j.a(interfaceC2911h, aVar, this);
            if (objA == objF) {
                return objF;
            }
            return objA;
        }
    }

    public b(Context context, String name) {
        Intrinsics.j(context, "context");
        Intrinsics.j(name, "name");
        this.context = context;
        this.name = name;
        this.editLock = new ThreadLocal<>();
        this.dataStore = E2.a.b(name, null, new Function1() { // from class: Af.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.d(this.f311a, (Context) obj);
            }
        }, null, 10, null);
        this.dataStore = g(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List d(b bVar, Context it) {
        Intrinsics.j(it, "it");
        return CollectionsKt.e(i.b(it, bVar.name, null, 4, null));
    }

    private final InterfaceC2911h<f> g(Context context) {
        return (InterfaceC2911h) this.dataStore.getValue(context, f312f[0]);
    }

    public final f e(Function1<? super F2.c, Unit> transform) {
        Intrinsics.j(transform, "transform");
        return (f) C15807j.b(null, new a(transform, null), 1, null);
    }

    public final Map<f.a<?>, Object> f() {
        return (Map) C15807j.b(null, new C0009b(null), 1, null);
    }

    public final <T> T h(f.a<T> key, T defaultValue) {
        Intrinsics.j(key, "key");
        return (T) C15807j.b(null, new c(key, defaultValue, null), 1, null);
    }

    public final <T> f i(f.a<T> key, T value) {
        Intrinsics.j(key, "key");
        return (f) C15807j.b(null, new d(key, value, null), 1, null);
    }
}
