package Mk;

import androidx.view.c0;
import androidx.view.d0;
import com.google.android.gms.common.api.a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.AbstractC15779K;
import mv.C15800f0;
import mv.C15809k;
import mv.InterfaceC15783O;
import ov.g;
import ov.j;
import ov.k;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import pv.P;
import pv.S;
import wv.InterfaceC17929a;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u00020\u0005B\u000f\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0082@¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\bJ!\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u000e\u001a\u00028\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u0000H$¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00028\u0001H\u0004¢\u0006\u0004\b\u0016\u0010\bR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001d\u0010,\u001a\u00020%8\u0006¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\u0014\u0010/\u001a\u00028\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u0001008F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u0002038F¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00066"}, d2 = {"LMk/a;", "", "Intent", "State", "Event", "Landroidx/lifecycle/c0;", "initialState", "<init>", "(Ljava/lang/Object;)V", "", "t", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intent", "u", "event", "", "triggerLoadingState", "v", "(Ljava/lang/Object;Z)Ljava/lang/Object;", "s", "(Ljava/lang/Object;)Ljava/lang/Object;", "state", "x", "Lov/g;", "a", "Lov/g;", "_intentChannel", "b", "_eventChannel", "Lpv/B;", "c", "Lpv/B;", "_state", "Lwv/a;", "d", "Lwv/a;", "mutex", "Lmv/K;", "e", "Lmv/K;", "getViewModelDispatch", "()Lmv/K;", "getViewModelDispatch$annotations", "()V", "viewModelDispatch", "q", "()Ljava/lang/Object;", "loadingState", "Lpv/P;", "r", "()Lpv/P;", "Lpv/f;", "p", "()Lpv/f;", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public abstract class a<Intent, State, Event> extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g<Intent> _intentChannel;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g<Event> _eventChannel;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<State> _state;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17929a mutex;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K viewModelDispatch;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.core.util.viewmodel.StatefulViewModel$1", f = "Stateful.kt", l = {211}, m = "invokeSuspend")
    /* renamed from: Mk.a$a, reason: collision with other inner class name */
    static final class C0354a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f20341a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a<Intent, State, Event> f20342b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0354a(a<Intent, State, Event> aVar, Continuation<? super C0354a> continuation) {
            super(2, continuation);
            this.f20342b = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C0354a(this.f20342b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C0354a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f20341a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                a<Intent, State, Event> aVar = this.f20342b;
                this.f20341a = 1;
                if (aVar.t(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b<T> implements InterfaceC16562g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a<Intent, State, Event> f20343a;

        b(a<Intent, State, Event> aVar) {
            this.f20343a = aVar;
        }

        @Override // pv.InterfaceC16562g
        public final Object emit(Intent intent, Continuation<? super Unit> continuation) {
            a<Intent, State, Event> aVar = this.f20343a;
            aVar.x(aVar.s(intent));
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.core.util.viewmodel.StatefulViewModel$updateState$1", f = "Stateful.kt", l = {292}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f20344a;

        /* renamed from: b, reason: collision with root package name */
        Object f20345b;

        /* renamed from: c, reason: collision with root package name */
        Object f20346c;

        /* renamed from: d, reason: collision with root package name */
        int f20347d;

        /* renamed from: e, reason: collision with root package name */
        int f20348e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ a<Intent, State, Event> f20349f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ State f20350g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a<Intent, State, Event> aVar, State state, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f20349f = aVar;
            this.f20350g = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f20349f, this.f20350g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a<Intent, State, Event> aVar;
            InterfaceC17929a interfaceC17929a;
            Object obj2;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f20348e;
            if (i10 != 0) {
                if (i10 == 1) {
                    obj2 = this.f20346c;
                    aVar = (a) this.f20345b;
                    interfaceC17929a = (InterfaceC17929a) this.f20344a;
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17929a interfaceC17929a2 = ((a) this.f20349f).mutex;
                aVar = this.f20349f;
                State state = this.f20350g;
                this.f20344a = interfaceC17929a2;
                this.f20345b = aVar;
                this.f20346c = state;
                this.f20347d = 0;
                this.f20348e = 1;
                if (interfaceC17929a2.g(null, this) == objF) {
                    return objF;
                }
                interfaceC17929a = interfaceC17929a2;
                obj2 = state;
            }
            try {
                InterfaceC16549B interfaceC16549B = ((a) aVar)._state;
                while (!interfaceC16549B.e(interfaceC16549B.getValue(), obj2)) {
                }
                Unit unit = Unit.f143329a;
                interfaceC17929a.h(null);
                return Unit.f143329a;
            } catch (Throwable th2) {
                interfaceC17929a.h(null);
                throw th2;
            }
        }
    }

    public abstract State q();

    protected abstract State s(Intent intent);

    public a(State initialState) {
        Intrinsics.j(initialState, "initialState");
        this._intentChannel = j.b(a.e.API_PRIORITY_OTHER, null, null, 6, null);
        this._eventChannel = j.b(a.e.API_PRIORITY_OTHER, null, null, 6, null);
        this._state = S.a(initialState);
        this.mutex = wv.g.b(false, 1, null);
        AbstractC15779K abstractC15779KT0 = AbstractC15779K.T0(C15800f0.a(), 1, null, 2, null);
        this.viewModelDispatch = abstractC15779KT0;
        C15809k.d(d0.a(this), abstractC15779KT0, null, new C0354a(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(Continuation<? super Unit> continuation) {
        Object objCollect = C16563h.p(this._intentChannel).collect(new b(this), continuation);
        return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
    }

    public static /* synthetic */ Object w(a aVar, Object obj, boolean z10, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processEvent");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return aVar.v(obj, z10);
    }

    public final InterfaceC16561f<Event> p() {
        return C16563h.p(this._eventChannel);
    }

    public final P<State> r() {
        return this._state;
    }

    public final void u(Intent intent) {
        Intrinsics.j(intent, "intent");
        k.i(this._intentChannel.k(intent));
    }

    protected final State v(Event event, boolean triggerLoadingState) {
        Intrinsics.j(event, "event");
        k.i(this._eventChannel.k(event));
        return triggerLoadingState ? q() : this._state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x(State state) {
        Intrinsics.j(state, "state");
        C15809k.d(d0.a(this), C15800f0.c(), null, new c(this, state, null), 2, null);
    }
}
