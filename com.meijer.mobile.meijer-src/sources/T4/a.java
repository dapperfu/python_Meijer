package T4;

import O4.C4356d;
import S4.b;
import androidx.work.impl.model.WorkSpec;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ov.r;
import ov.t;
import pv.C16563h;
import pv.InterfaceC16561f;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00168$X¤\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"LT4/a;", "T", "LT4/d;", "LU4/h;", "tracker", "<init>", "(LU4/h;)V", "value", "", "f", "(Ljava/lang/Object;)Z", "LO4/d;", "constraints", "Lpv/f;", "LS4/b;", "b", "(LO4/d;)Lpv/f;", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "a", "(Landroidx/work/impl/model/WorkSpec;)Z", "LU4/h;", "", "e", "()I", "getReason$annotations", "()V", "reason", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class a<T> implements d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final U4.h<T> tracker;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lov/t;", "LS4/b;", "", "<anonymous>", "(Lov/t;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.impl.constraints.controllers.BaseConstraintController$track$1", f = "ContraintControllers.kt", l = {63}, m = "invokeSuspend")
    /* renamed from: T4.a$a, reason: collision with other inner class name */
    static final class C0793a extends SuspendLambda implements Function2<t<? super S4.b>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f35890a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f35891b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a<T> f35892c;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: T4.a$a$a, reason: collision with other inner class name */
        static final class C0794a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ a<T> f35893f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ b f35894g;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0794a(a<T> aVar, b bVar) {
                super(0);
                this.f35893f = aVar;
                this.f35894g = bVar;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((a) this.f35893f).tracker.f(this.f35894g);
            }
        }

        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T4/a$a$b", "LS4/a;", "newValue", "", "a", "(Ljava/lang/Object;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: T4.a$a$b */
        public static final class b implements S4.a<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a<T> f35895a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ t<S4.b> f35896b;

            /* JADX WARN: Multi-variable type inference failed */
            b(a<T> aVar, t<? super S4.b> tVar) {
                this.f35895a = aVar;
                this.f35896b = tVar;
            }

            @Override // S4.a
            public void a(T newValue) {
                this.f35896b.w().k(this.f35895a.f(newValue) ? new b.ConstraintsNotMet(this.f35895a.getReason()) : b.a.f34398a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0793a(a<T> aVar, Continuation<? super C0793a> continuation) {
            super(2, continuation);
            this.f35892c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C0793a c0793a = new C0793a(this.f35892c, continuation);
            c0793a.f35891b = obj;
            return c0793a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(t<? super S4.b> tVar, Continuation<? super Unit> continuation) {
            return ((C0793a) create(tVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f35890a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                t tVar = (t) this.f35891b;
                b bVar = new b(this.f35892c, tVar);
                ((a) this.f35892c).tracker.c(bVar);
                C0794a c0794a = new C0794a(this.f35892c, bVar);
                this.f35890a = 1;
                if (r.a(tVar, c0794a, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    /* renamed from: e */
    protected abstract int getReason();

    protected abstract boolean f(T value);

    public a(U4.h<T> tracker) {
        Intrinsics.j(tracker, "tracker");
        this.tracker = tracker;
    }

    @Override // T4.d
    public boolean a(WorkSpec workSpec) {
        Intrinsics.j(workSpec, "workSpec");
        return c(workSpec) && f(this.tracker.e());
    }

    @Override // T4.d
    public InterfaceC16561f<S4.b> b(C4356d constraints) {
        Intrinsics.j(constraints, "constraints");
        return C16563h.f(new C0793a(this, null));
    }
}
