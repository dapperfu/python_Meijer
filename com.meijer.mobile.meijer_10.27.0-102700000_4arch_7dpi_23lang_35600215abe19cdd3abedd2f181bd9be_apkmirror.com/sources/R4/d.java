package R4;

import N4.AbstractC4333v;
import N4.C4316d;
import R4.b;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import androidx.work.impl.model.WorkSpec;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import qv.C0;
import qv.C16648k;
import qv.InterfaceC16622O;
import qv.Z;
import sv.r;
import sv.t;
import sv.w;
import tv.C17154h;
import tv.InterfaceC17152f;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015¨\u0006\u0016"}, d2 = {"LR4/d;", "LS4/d;", "Landroid/net/ConnectivityManager;", "connManager", "", "timeoutMs", "<init>", "(Landroid/net/ConnectivityManager;J)V", "LN4/d;", "constraints", "Ltv/f;", "LR4/b;", "b", "(LN4/d;)Ltv/f;", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "", "c", "(Landroidx/work/impl/model/WorkSpec;)Z", "a", "Landroid/net/ConnectivityManager;", "J", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements S4.d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ConnectivityManager connManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long timeoutMs;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsv/t;", "LR4/b;", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1", f = "WorkConstraintsTracker.kt", l = {178}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<t<? super R4.b>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f31869a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f31870b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C4316d f31871c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f31872d;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: R4.d$a$a, reason: collision with other inner class name */
        static final class C0718a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f31873f;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f142422a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0718a(Function0<Unit> function0) {
                super(0);
                this.f31873f = function0;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f31873f.invoke();
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LR4/b;", "it", "", "a", "(LR4/b;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends Lambda implements Function1<R4.b, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C0 f31874f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ t<R4.b> f31875g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(C0 c02, t<? super R4.b> tVar) {
                super(1);
                this.f31874f = c02;
                this.f31875g = tVar;
            }

            public final void a(R4.b it) {
                Intrinsics.j(it, "it");
                C0.a.a(this.f31874f, null, 1, null);
                this.f31875g.k(it);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(R4.b bVar) {
                a(bVar);
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$timeoutJob$1", f = "WorkConstraintsTracker.kt", l = {149}, m = "invokeSuspend")
        static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f31876a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f31877b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ t<R4.b> f31878c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(d dVar, t<? super R4.b> tVar, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f31877b = dVar;
                this.f31878c = tVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new c(this.f31877b, this.f31878c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f31876a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    long j10 = this.f31877b.timeoutMs;
                    this.f31876a = 1;
                    if (Z.b(j10, this) == objF) {
                        return objF;
                    }
                }
                AbstractC4333v.e().a(j.f31896a, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after " + this.f31877b.timeoutMs + " ms");
                this.f31878c.k(new b.ConstraintsNotMet(7));
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C4316d c4316d, d dVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f31871c = c4316d;
            this.f31872d = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f31871c, this.f31872d, continuation);
            aVar.f31870b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(t<? super R4.b> tVar, Continuation<? super Unit> continuation) {
            return ((a) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Function0<Unit> function0A;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f31869a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                t tVar = (t) this.f31870b;
                NetworkRequest networkRequestD = this.f31871c.d();
                if (networkRequestD == null) {
                    w.a.a(tVar.w(), null, 1, null);
                    return Unit.f142422a;
                }
                b bVar = new b(C16648k.d(tVar, null, null, new c(this.f31872d, tVar, null), 3, null), tVar);
                if (Build.VERSION.SDK_INT >= 30) {
                    function0A = h.f31883a.c(this.f31872d.connManager, networkRequestD, bVar);
                } else {
                    function0A = R4.c.INSTANCE.a(this.f31872d.connManager, networkRequestD, bVar);
                }
                C0718a c0718a = new C0718a(function0A);
                this.f31869a = 1;
                if (r.a(tVar, c0718a, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    public d(ConnectivityManager connManager, long j10) {
        Intrinsics.j(connManager, "connManager");
        this.connManager = connManager;
        this.timeoutMs = j10;
    }

    @Override // S4.d
    public boolean a(WorkSpec workSpec) {
        Intrinsics.j(workSpec, "workSpec");
        if (c(workSpec)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }

    @Override // S4.d
    public InterfaceC17152f<b> b(C4316d constraints) {
        Intrinsics.j(constraints, "constraints");
        return C17154h.f(new a(constraints, this, null));
    }

    @Override // S4.d
    public boolean c(WorkSpec workSpec) {
        Intrinsics.j(workSpec, "workSpec");
        return workSpec.constraints.d() != null;
    }

    public /* synthetic */ d(ConnectivityManager connectivityManager, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(connectivityManager, (i10 & 2) != 0 ? 1000L : j10);
    }
}
