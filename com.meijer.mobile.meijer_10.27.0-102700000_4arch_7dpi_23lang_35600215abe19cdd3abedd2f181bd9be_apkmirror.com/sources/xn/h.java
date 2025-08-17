package xn;

import Oj.a;
import androidx.view.c0;
import androidx.view.d0;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import gi.InterfaceC14261a;
import hi.C14476c;
import hi.TrackingData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16648k;
import qv.InterfaceC16622O;
import tn.AbstractC17125a;
import tv.C17146H;
import tv.C17154h;
import tv.InterfaceC17139A;
import tv.InterfaceC17140B;
import tv.InterfaceC17144F;
import tv.P;
import tv.S;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0002\u000f\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001f0#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lxn/h;", "Landroidx/lifecycle/c0;", "LZn/a;", "rewardsRepository", "Lgi/a;", "analyticsEngine", "<init>", "(LZn/a;Lgi/a;)V", "", "t", "()V", "Ltn/a;", "action", "s", "(Ltn/a;)V", "a", "LZn/a;", "b", "Lgi/a;", "Ltv/B;", "Lxn/h$b;", "c", "Ltv/B;", "_viewStateFlow", "Ltv/P;", "d", "Ltv/P;", "r", "()Ltv/P;", "viewStateFlow", "Ltv/A;", "Lxn/h$a;", "e", "Ltv/A;", "_effectsFlow", "Ltv/F;", "f", "Ltv/F;", "q", "()Ltv/F;", "effectsFlow", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class h extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Zn.a rewardsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14261a analyticsEngine;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ViewState> _viewStateFlow;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final P<ViewState> viewStateFlow;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<a> _effectsFlow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17144F<a> effectsFlow;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lxn/h$a;", "", "<init>", "()V", "b", "a", "Lxn/h$a$a;", "Lxn/h$a$b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lxn/h$a$a;", "Lxn/h$a;", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "exception", "<init>", "(Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "()Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: xn.h$a$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class OptOutFailed extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final RetrofitException exception;

            public OptOutFailed(RetrofitException retrofitException) {
                super(null);
                this.exception = retrofitException;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OptOutFailed) && Intrinsics.e(this.exception, ((OptOutFailed) other).exception);
            }

            /* renamed from: a, reason: from getter */
            public final RetrofitException getException() {
                return this.exception;
            }

            public int hashCode() {
                RetrofitException retrofitException = this.exception;
                if (retrofitException == null) {
                    return 0;
                }
                return retrofitException.hashCode();
            }

            public String toString() {
                return "OptOutFailed(exception=" + this.exception + ')';
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxn/h$a$b;", "Lxn/h$a;", "<init>", "()V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f169776a = new b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lxn/h$b;", "", "", "optOutAccepted", "LOj/a;", "loadingState", "<init>", "(ZLOj/a;)V", "a", "(ZLOj/a;)Lxn/h$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "c", "()Z", "b", "LOj/a;", "getLoadingState", "()LOj/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xn.h$b, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: c, reason: collision with root package name */
        public static final int f169777c = Oj.a.f23966c;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean optOutAccepted;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Oj.a loadingState;

        /* JADX WARN: Multi-variable type inference failed */
        public ViewState() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return this.optOutAccepted == viewState.optOutAccepted && Intrinsics.e(this.loadingState, viewState.loadingState);
        }

        public ViewState(boolean z10, Oj.a loadingState) {
            Intrinsics.j(loadingState, "loadingState");
            this.optOutAccepted = z10;
            this.loadingState = loadingState;
        }

        public static /* synthetic */ ViewState b(ViewState viewState, boolean z10, Oj.a aVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = viewState.optOutAccepted;
            }
            if ((i10 & 2) != 0) {
                aVar = viewState.loadingState;
            }
            return viewState.a(z10, aVar);
        }

        public final ViewState a(boolean optOutAccepted, Oj.a loadingState) {
            Intrinsics.j(loadingState, "loadingState");
            return new ViewState(optOutAccepted, loadingState);
        }

        /* renamed from: c, reason: from getter */
        public final boolean getOptOutAccepted() {
            return this.optOutAccepted;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.optOutAccepted) * 31) + this.loadingState.hashCode();
        }

        public String toString() {
            return "ViewState(optOutAccepted=" + this.optOutAccepted + ", loadingState=" + this.loadingState + ')';
        }

        public /* synthetic */ ViewState(boolean z10, Oj.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? new a.NotLoading(null, 1, null) : aVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.rewards.viewmodel.meijercreditcard.MccOptOutViewModel$optOutOfMcc$1", f = "MccOptOutViewModel.kt", l = {53, 56, 59}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f169780a;

        /* renamed from: b, reason: collision with root package name */
        Object f169781b;

        /* renamed from: c, reason: collision with root package name */
        Object f169782c;

        /* renamed from: d, reason: collision with root package name */
        Object f169783d;

        /* renamed from: e, reason: collision with root package name */
        int f169784e;

        /* renamed from: f, reason: collision with root package name */
        int f169785f;

        /* renamed from: g, reason: collision with root package name */
        int f169786g;

        /* renamed from: h, reason: collision with root package name */
        int f169787h;

        /* renamed from: i, reason: collision with root package name */
        boolean f169788i;

        /* renamed from: j, reason: collision with root package name */
        int f169789j;

        /* renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f169790k;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = h.this.new c(continuation);
            cVar.f169790k = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0103  */
        /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, qv.O] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v21, types: [qv.O] */
        /* JADX WARN: Type inference failed for: r1v27 */
        /* JADX WARN: Type inference failed for: r1v28 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 339
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: xn.h.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(Zn.a rewardsRepository, InterfaceC14261a analyticsEngine) {
        Intrinsics.j(rewardsRepository, "rewardsRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.rewardsRepository = rewardsRepository;
        this.analyticsEngine = analyticsEngine;
        InterfaceC17140B<ViewState> interfaceC17140BA = S.a(new ViewState(false, null, 3, 0 == true ? 1 : 0));
        this._viewStateFlow = interfaceC17140BA;
        this.viewStateFlow = C17154h.c(interfaceC17140BA);
        InterfaceC17139A<a> interfaceC17139AB = C17146H.b(0, 0, null, 7, null);
        this._effectsFlow = interfaceC17139AB;
        this.effectsFlow = C17154h.b(interfaceC17139AB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("mperks: rewards: mcard: opt out: are you sure");
        track.v("mperks");
        return Unit.f142422a;
    }

    public final InterfaceC17144F<a> q() {
        return this.effectsFlow;
    }

    public final P<ViewState> r() {
        return this.viewStateFlow;
    }

    public final void s(AbstractC17125a action) {
        ViewState value;
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC17125a.AcceptOptOut) {
            InterfaceC17140B<ViewState> interfaceC17140B = this._viewStateFlow;
            do {
                value = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value, ViewState.b(value, ((AbstractC17125a.AcceptOptOut) action).getAccepted(), null, 2, null)));
        } else {
            if (!Intrinsics.e(action, AbstractC17125a.b.f161930a)) {
                throw new NoWhenBranchMatchedException();
            }
            t();
        }
    }

    private final void t() {
        C16648k.d(d0.a(this), null, null, new c(null), 3, null);
        this.analyticsEngine.h(C14476c.a("event: mperks: rewards: mcard: opt out: are you sure"), new Function1() { // from class: xn.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.u((TrackingData) obj);
            }
        });
    }
}
