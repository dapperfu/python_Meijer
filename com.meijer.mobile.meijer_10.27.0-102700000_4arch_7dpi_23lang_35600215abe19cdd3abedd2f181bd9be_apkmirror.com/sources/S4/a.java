package S4;

import N4.C4316d;
import R4.b;
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
import sv.r;
import sv.t;
import tv.C17154h;
import tv.InterfaceC17152f;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00168$X¤\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"LS4/a;", "T", "LS4/d;", "LT4/h;", "tracker", "<init>", "(LT4/h;)V", "value", "", "f", "(Ljava/lang/Object;)Z", "LN4/d;", "constraints", "Ltv/f;", "LR4/b;", "b", "(LN4/d;)Ltv/f;", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "a", "(Landroidx/work/impl/model/WorkSpec;)Z", "LT4/h;", "", "e", "()I", "getReason$annotations", "()V", "reason", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class a<T> implements d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T4.h<T> tracker;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lsv/t;", "LR4/b;", "", "<anonymous>", "(Lsv/t;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.impl.constraints.controllers.BaseConstraintController$track$1", f = "ContraintControllers.kt", l = {63}, m = "invokeSuspend")
    /* renamed from: S4.a$a, reason: collision with other inner class name */
    static final class C0746a extends SuspendLambda implements Function2<t<? super R4.b>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f33220a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f33221b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a<T> f33222c;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: S4.a$a$a, reason: collision with other inner class name */
        static final class C0747a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ a<T> f33223f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ b f33224g;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f142422a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0747a(a<T> aVar, b bVar) {
                super(0);
                this.f33223f = aVar;
                this.f33224g = bVar;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((a) this.f33223f).tracker.f(this.f33224g);
            }
        }

        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"S4/a$a$b", "LR4/a;", "newValue", "", "a", "(Ljava/lang/Object;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: S4.a$a$b */
        public static final class b implements R4.a<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a<T> f33225a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ t<R4.b> f33226b;

            /* JADX WARN: Multi-variable type inference failed */
            b(a<T> aVar, t<? super R4.b> tVar) {
                this.f33225a = aVar;
                this.f33226b = tVar;
            }

            @Override // R4.a
            public void a(T newValue) {
                this.f33226b.w().k(this.f33225a.f(newValue) ? new b.ConstraintsNotMet(this.f33225a.e()) : b.a.f31860a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0746a(a<T> aVar, Continuation<? super C0746a> continuation) {
            super(2, continuation);
            this.f33222c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C0746a c0746a = new C0746a(this.f33222c, continuation);
            c0746a.f33221b = obj;
            return c0746a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(t<? super R4.b> tVar, Continuation<? super Unit> continuation) {
            return ((C0746a) create(tVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f33220a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                t tVar = (t) this.f33221b;
                b bVar = new b(this.f33222c, tVar);
                ((a) this.f33222c).tracker.c(bVar);
                C0747a c0747a = new C0747a(this.f33222c, bVar);
                this.f33220a = 1;
                if (r.a(tVar, c0747a, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    protected abstract int e();

    protected abstract boolean f(T value);

    public a(T4.h<T> tracker) {
        Intrinsics.j(tracker, "tracker");
        this.tracker = tracker;
    }

    @Override // S4.d
    public boolean a(WorkSpec workSpec) {
        Intrinsics.j(workSpec, "workSpec");
        return c(workSpec) && f(this.tracker.e());
    }

    @Override // S4.d
    public InterfaceC17152f<R4.b> b(C4316d constraints) {
        Intrinsics.j(constraints, "constraints");
        return C17154h.f(new C0746a(this, null));
    }
}
