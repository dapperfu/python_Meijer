package Ek;

import Ek.b;
import Lu.o;
import com.google.android.libraries.places.api.model.PlaceTypes;
import eh.C13797b;
import eh.C13798c;
import ev.C13889a;
import io.reactivex.q;
import io.reactivex.u;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Deprecated
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0017¢\u0006\u0004\b\u0016\u0010\u0017R.\u0010\u001c\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0019*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00100\u00100\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R \u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010,\u001a\n \u0019*\u0004\u0018\u00010)0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u00101\u001a\u00028\u00008VX\u0097\u0004¢\u0006\f\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"LEk/n;", "", "S", "LEk/a;", "startingState", "<init>", "(Ljava/lang/Object;)V", "LEk/b$a;", "state", "", "s", "(LEk/b$a;)V", "", "throwable", "o", "(Ljava/lang/Throwable;)V", "LEk/b;", "reducer", "Lio/reactivex/u;", "b", "(LEk/b;)Lio/reactivex/u;", "Lio/reactivex/l;", "t", "()Lio/reactivex/l;", "Leh/c;", "kotlin.jvm.PlatformType", "a", "Leh/c;", "reducers", "Ljava/util/UUID;", "Ljava/util/UUID;", "startUuid", "Leh/b;", "c", "Leh/b;", PlaceTypes.STORE, "d", "processed", "e", "Lio/reactivex/l;", "processor", "LJu/b;", "f", "LJu/b;", "internalDisposable", "p", "()Ljava/lang/Object;", "getValue$annotations", "()V", "value", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public class n<S> implements Ek.a<S> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C13798c<Ek.b<S>> reducers;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final UUID startUuid;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C13797b<S> store;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C13797b<UUID> processed;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final io.reactivex.l<b.Reduction<S>> processor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Ju.b internalDisposable;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<b.Reduction<S>, Unit> {
        a(Object obj) {
            super(1, obj, n.class, "internalLogger", "internalLogger(Lcom/meijer/mobile/core/util/rxmodelstore/Reducer$Reduction;)V", 0);
        }

        public final void a(b.Reduction<S> p02) {
            Intrinsics.j(p02, "p0");
            ((n) this.receiver).s(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            a((b.Reduction) obj);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        b(Object obj) {
            super(1, obj, n.class, "crashHandler", "crashHandler(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable p02) throws Throwable {
            Intrinsics.j(p02, "p0");
            ((n) this.receiver).o(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) throws Throwable {
            a(th2);
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(Throwable throwable) throws Throwable {
        throw throwable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(b.Reduction<S> state) {
        Object objB;
        try {
            Result.Companion companion = Result.INSTANCE;
            qw.a.INSTANCE.q(String.valueOf(state), new Object[0]);
            objB = Result.b(Unit.f143329a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            qw.a.INSTANCE.r(thE, "Failed logging state", new Object[0]);
        }
    }

    @Deprecated
    public n(S startingState) {
        Intrinsics.j(startingState, "startingState");
        C13798c<Ek.b<S>> c13798cD = C13798c.d();
        Intrinsics.i(c13798cD, "create(...)");
        this.reducers = c13798cD;
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.i(uuidRandomUUID, "randomUUID(...)");
        this.startUuid = uuidRandomUUID;
        C13797b<S> c13797bD = C13797b.d(startingState);
        Intrinsics.i(c13797bD, "createDefault(...)");
        this.store = c13797bD;
        C13797b<UUID> c13797bD2 = C13797b.d(uuidRandomUUID);
        Intrinsics.i(c13797bD2, "createDefault(...)");
        this.processed = c13797bD2;
        io.reactivex.l<Ek.b<S>> lVarObserveOn = c13798cD.observeOn(C13889a.c());
        b.Reduction reduction = new b.Reduction(uuidRandomUUID, startingState);
        final Function2 function2 = new Function2() { // from class: Ek.h
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return n.u((b.Reduction) obj, (b) obj2);
            }
        };
        io.reactivex.l<R> lVarScan = lVarObserveOn.scan(reduction, new Lu.c() { // from class: Ek.i
            @Override // Lu.c
            public final Object apply(Object obj, Object obj2) {
                return n.v(function2, (b.Reduction) obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: Ek.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.w(this.f7740a, (b.Reduction) obj);
            }
        };
        io.reactivex.l<b.Reduction<S>> lVarDoOnNext = lVarScan.doOnNext(new Lu.g() { // from class: Ek.k
            @Override // Lu.g
            public final void accept(Object obj) {
                n.x(function1, obj);
            }
        });
        Intrinsics.i(lVarDoOnNext, "doOnNext(...)");
        this.processor = lVarDoOnNext;
        final a aVar = new a(this);
        Lu.g<? super b.Reduction<S>> gVar = new Lu.g() { // from class: Ek.l
            @Override // Lu.g
            public final void accept(Object obj) {
                n.r(aVar, obj);
            }
        };
        final b bVar = new b(this);
        this.internalDisposable = lVarDoOnNext.subscribe(gVar, new Lu.g() { // from class: Ek.m
            @Override // Lu.g
            public final void accept(Object obj) {
                n.q(bVar, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q A(n nVar, UUID it) {
        Intrinsics.j(it, "it");
        return nVar.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q B(Function1 function1, Object p02) {
        Intrinsics.j(p02, "p0");
        return (q) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final b.Reduction u(b.Reduction oldState, Ek.b reducer) {
        Intrinsics.j(oldState, "oldState");
        Intrinsics.j(reducer, "reducer");
        return reducer.c(oldState.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b.Reduction v(Function2 function2, b.Reduction p02, Object p12) {
        Intrinsics.j(p02, "p0");
        Intrinsics.j(p12, "p1");
        return (b.Reduction) function2.invoke(p02, p12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(n nVar, b.Reduction reduction) {
        nVar.store.accept(reduction.a());
        nVar.processed.accept(reduction.getUuid());
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y(Ek.b bVar, UUID uuid) {
        Intrinsics.j(uuid, "uuid");
        return Intrinsics.e(uuid, bVar.getUuid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z(Function1 function1, Object p02) {
        Intrinsics.j(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    @Override // Ek.a
    public u<S> b(final Ek.b<S> reducer) {
        Intrinsics.j(reducer, "reducer");
        C13797b<UUID> c13797b = this.processed;
        final Function1 function1 = new Function1() { // from class: Ek.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(n.y(reducer, (UUID) obj));
            }
        };
        io.reactivex.l<UUID> lVarTake = c13797b.filter(new Lu.q() { // from class: Ek.e
            @Override // Lu.q
            public final boolean test(Object obj) {
                return n.z(function1, obj);
            }
        }).take(1L);
        final Function1 function12 = new Function1() { // from class: Ek.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.A(this.f7737a, (UUID) obj);
            }
        };
        u<S> uVarQ = lVarTake.switchMap(new o() { // from class: Ek.g
            @Override // Lu.o
            public final Object apply(Object obj) {
                return n.B(function12, obj);
            }
        }).firstOrError().q(C13889a.a());
        this.reducers.accept(reducer);
        Intrinsics.i(uVarQ, "also(...)");
        return uVarQ;
    }

    public S p() {
        S sE = this.store.e();
        Intrinsics.g(sE);
        return sE;
    }

    @Deprecated
    public io.reactivex.l<S> t() {
        return this.store;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
