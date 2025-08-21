package Ih;

import Vh.StoreCardDecorator;
import androidx.view.c0;
import androidx.view.d0;
import bk.AbstractC6392a;
import j$.time.Clock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.P;
import pv.S;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"LIh/A;", "Landroidx/lifecycle/c0;", "LZq/b;", "storeInfoRepository", "LTq/j;", "storeProvider", "j$/time/Clock", "clock", "<init>", "(LZq/b;LTq/j;Lj$/time/Clock;)V", "(LZq/b;LTq/j;)V", "", "q", "()V", "a", "LZq/b;", "b", "LTq/j;", "c", "Lj$/time/Clock;", "Lpv/B;", "LIh/A$a;", "d", "Lpv/B;", "_viewState", "Lpv/P;", "e", "Lpv/P;", "r", "()Lpv/P;", "viewState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class A extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Zq.b storeInfoRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Clock clock;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<YourMeijerStoreCardViewState> _viewState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final P<YourMeijerStoreCardViewState> viewState;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010 \u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\"\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b!\u0010\u0017R\u0011\u0010$\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010\u0017¨\u0006%"}, d2 = {"LIh/A$a;", "", "", "isLoading", "LVh/e;", "decorator", "Lbk/a;", "errorMessage", "<init>", "(ZLVh/e;Lbk/a;)V", "a", "(ZLVh/e;Lbk/a;)LIh/A$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "h", "()Z", "b", "LVh/e;", "c", "()LVh/e;", "Lbk/a;", "d", "()Lbk/a;", "g", "shouldShowPharmacySection", "f", "shouldShowGasSection", "e", "hasPharmacyOrGas", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ih.A$a, reason: from toString */
    public static final /* data */ class YourMeijerStoreCardViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final StoreCardDecorator decorator;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a errorMessage;

        public YourMeijerStoreCardViewState() {
            this(false, null, null, 7, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof YourMeijerStoreCardViewState)) {
                return false;
            }
            YourMeijerStoreCardViewState yourMeijerStoreCardViewState = (YourMeijerStoreCardViewState) other;
            return this.isLoading == yourMeijerStoreCardViewState.isLoading && Intrinsics.e(this.decorator, yourMeijerStoreCardViewState.decorator) && Intrinsics.e(this.errorMessage, yourMeijerStoreCardViewState.errorMessage);
        }

        public YourMeijerStoreCardViewState(boolean z10, StoreCardDecorator decorator, AbstractC6392a abstractC6392a) {
            Intrinsics.j(decorator, "decorator");
            this.isLoading = z10;
            this.decorator = decorator;
            this.errorMessage = abstractC6392a;
        }

        public static /* synthetic */ YourMeijerStoreCardViewState b(YourMeijerStoreCardViewState yourMeijerStoreCardViewState, boolean z10, StoreCardDecorator storeCardDecorator, AbstractC6392a abstractC6392a, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = yourMeijerStoreCardViewState.isLoading;
            }
            if ((i10 & 2) != 0) {
                storeCardDecorator = yourMeijerStoreCardViewState.decorator;
            }
            if ((i10 & 4) != 0) {
                abstractC6392a = yourMeijerStoreCardViewState.errorMessage;
            }
            return yourMeijerStoreCardViewState.a(z10, storeCardDecorator, abstractC6392a);
        }

        public final YourMeijerStoreCardViewState a(boolean isLoading, StoreCardDecorator decorator, AbstractC6392a errorMessage) {
            Intrinsics.j(decorator, "decorator");
            return new YourMeijerStoreCardViewState(isLoading, decorator, errorMessage);
        }

        /* renamed from: c, reason: from getter */
        public final StoreCardDecorator getDecorator() {
            return this.decorator;
        }

        /* renamed from: d, reason: from getter */
        public final AbstractC6392a getErrorMessage() {
            return this.errorMessage;
        }

        public final boolean f() {
            return !this.decorator.a().isEmpty();
        }

        public final boolean g() {
            return (this.decorator.getPharmacyInStoreHours() == null && this.decorator.getPharmacyDriveThruHours() == null) ? false : true;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.isLoading) * 31) + this.decorator.hashCode()) * 31;
            AbstractC6392a abstractC6392a = this.errorMessage;
            return iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode());
        }

        public String toString() {
            return "YourMeijerStoreCardViewState(isLoading=" + this.isLoading + ", decorator=" + this.decorator + ", errorMessage=" + this.errorMessage + ')';
        }

        public final boolean e() {
            if (!g() && !f()) {
                return false;
            }
            return true;
        }

        public /* synthetic */ YourMeijerStoreCardViewState(boolean z10, StoreCardDecorator storeCardDecorator, AbstractC6392a abstractC6392a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? new StoreCardDecorator(null, 0, null, null, null, null, null, null, null, 511, null) : storeCardDecorator, (i10 & 4) != 0 ? null : abstractC6392a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.basescreen.cards.YourMeijerStoreCardViewModel$fetchStoreInfo$2", f = "YourMeijerStoreCardViewModel.kt", l = {50}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f14570a;

        /* renamed from: b, reason: collision with root package name */
        Object f14571b;

        /* renamed from: c, reason: collision with root package name */
        Object f14572c;

        /* renamed from: d, reason: collision with root package name */
        Object f14573d;

        /* renamed from: e, reason: collision with root package name */
        int f14574e;

        /* renamed from: f, reason: collision with root package name */
        int f14575f;

        /* renamed from: g, reason: collision with root package name */
        int f14576g;

        /* renamed from: h, reason: collision with root package name */
        int f14577h;

        /* renamed from: i, reason: collision with root package name */
        int f14578i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f14579j;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = A.this.new b(continuation);
            bVar.f14579j = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 289
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Ih.A.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public A(Zq.b storeInfoRepository, Tq.j storeProvider, Clock clock) {
        Intrinsics.j(storeInfoRepository, "storeInfoRepository");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(clock, "clock");
        this.storeInfoRepository = storeInfoRepository;
        this.storeProvider = storeProvider;
        this.clock = clock;
        InterfaceC16549B<YourMeijerStoreCardViewState> interfaceC16549BA = S.a(new YourMeijerStoreCardViewState(false, null, null, 7, null));
        this._viewState = interfaceC16549BA;
        this.viewState = C16563h.c(interfaceC16549BA);
    }

    public final void q() {
        YourMeijerStoreCardViewState value;
        InterfaceC16549B<YourMeijerStoreCardViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, YourMeijerStoreCardViewState.b(value, true, null, null, 6, null)));
        C15809k.d(d0.a(this), null, null, new b(null), 3, null);
    }

    public final P<YourMeijerStoreCardViewState> r() {
        return this.viewState;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public A(Zq.b storeInfoRepository, Tq.j storeProvider) {
        Intrinsics.j(storeInfoRepository, "storeInfoRepository");
        Intrinsics.j(storeProvider, "storeProvider");
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        Intrinsics.i(clockSystemDefaultZone, "systemDefaultZone(...)");
        this(storeInfoRepository, storeProvider, clockSystemDefaultZone);
    }
}
