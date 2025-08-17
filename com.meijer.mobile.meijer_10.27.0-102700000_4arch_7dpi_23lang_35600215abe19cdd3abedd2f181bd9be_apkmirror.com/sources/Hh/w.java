package Hh;

import Uh.SubscriptionCardDecorator;
import Yh.SubscriptionEmptyOrErrorStateDecorator;
import ak.AbstractC5607a;
import androidx.view.c0;
import androidx.view.d0;
import bi.SubscriptionCardViewState;
import cr.SubscriptionDetails;
import ir.C14758a;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kr.C15305b;
import kr.C15307d;
import qr.C16600a;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.InterfaceC17153g;
import tv.P;
import tv.S;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0012R\u001f\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00148\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018¨\u0006 "}, d2 = {"LHh/w;", "Landroidx/lifecycle/c0;", "Lir/a;", "subscriptionRepository", "Lqr/a;", "getUserEmailUseCase", "<init>", "(Lir/a;Lqr/a;)V", "", "q", "()V", "a", "Lir/a;", "b", "Lqr/a;", "Ltv/B;", "Lbi/a;", "c", "Ltv/B;", "_viewState", "Ltv/P;", "d", "Ltv/P;", "r", "()Ltv/P;", "viewState", "", "e", "_lastFetchedEmail", "f", "getLastFetchedEmail", "lastFetchedEmail", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class w extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C14758a subscriptionRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C16600a getUserEmailUseCase;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<SubscriptionCardViewState> _viewState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final P<SubscriptionCardViewState> viewState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<String> _lastFetchedEmail;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final P<String> lastFetchedEmail;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.basescreen.cards.SubscriptionCardViewModel$fetchSubscriptionCardInfo$2", f = "SubscriptionCardViewModel.kt", l = {49, 53}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f12596a;

        /* renamed from: b, reason: collision with root package name */
        int f12597b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Hh.w$a$a, reason: collision with other inner class name */
        static final class C0194a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f12599a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Hh.w$a$a$a, reason: collision with other inner class name */
            public static final class C0195a<T> implements Comparator {
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return ComparisonsKt.d(((SubscriptionDetails) t10).getNextOrderDate(), ((SubscriptionDetails) t11).getNextOrderDate());
                }
            }

            C0194a(w wVar) {
                this.f12599a = wVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // tv.InterfaceC17153g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<SubscriptionDetails> list, Continuation<? super Unit> continuation) {
                SubscriptionEmptyOrErrorStateDecorator subscriptionEmptyOrErrorStateDecorator;
                Object value;
                List<SubscriptionDetails> listZ0 = CollectionsKt.Z0(list, new C0195a());
                SubscriptionDetails subscriptionDetails = (SubscriptionDetails) CollectionsKt.u0(listZ0);
                SubscriptionCardDecorator subscriptionCardDecoratorA = subscriptionDetails != null ? Uh.h.a(subscriptionDetails) : null;
                if (listZ0.isEmpty()) {
                    AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
                    subscriptionEmptyOrErrorStateDecorator = new SubscriptionEmptyOrErrorStateDecorator(companion.d(C15307d.f147863b0, new Object[0]), companion.d(C15307d.f147836F0, new Object[0]), companion.d(C15307d.f147897s0, new Object[0]), Boxing.d(C15305b.f147817d));
                } else {
                    subscriptionEmptyOrErrorStateDecorator = new SubscriptionEmptyOrErrorStateDecorator(null, null, AbstractC5607a.INSTANCE.d(C15307d.f147911z0, new Object[0]), null, 11, null);
                }
                InterfaceC17140B interfaceC17140B = this.f12599a._viewState;
                do {
                    value = interfaceC17140B.getValue();
                } while (!interfaceC17140B.e(value, ((SubscriptionCardViewState) value).a(false, subscriptionCardDecoratorA, listZ0, subscriptionEmptyOrErrorStateDecorator)));
                return Unit.f142422a;
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return w.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
        
            if (r10.collect(r3, r9) != r0) goto L31;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r9.f12597b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L29
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r0 = r9.f12596a
                qr.b r0 = (qr.SubscriptionUserInfo) r0
                kotlin.ResultKt.b(r10)     // Catch: java.lang.Exception -> L17
                goto Ld1
            L17:
                r10 = move-exception
                goto L8a
            L19:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L21:
                java.lang.Object r1 = r9.f12596a
                qr.b r1 = (qr.SubscriptionUserInfo) r1
                kotlin.ResultKt.b(r10)     // Catch: java.lang.Exception -> L17
                goto L61
            L29:
                kotlin.ResultKt.b(r10)
                Hh.w r10 = Hh.w.this     // Catch: java.lang.Exception -> L17
                qr.a r10 = Hh.w.m(r10)     // Catch: java.lang.Exception -> L17
                qr.b r1 = r10.a()     // Catch: java.lang.Exception -> L17
                boolean r10 = r1.getIsLoggedIn()     // Catch: java.lang.Exception -> L17
                if (r10 == 0) goto L6e
                java.lang.String r10 = r1.getEmail()     // Catch: java.lang.Exception -> L17
                Hh.w r4 = Hh.w.this     // Catch: java.lang.Exception -> L17
                tv.B r4 = Hh.w.o(r4)     // Catch: java.lang.Exception -> L17
                java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Exception -> L17
                boolean r10 = kotlin.jvm.internal.Intrinsics.e(r10, r4)     // Catch: java.lang.Exception -> L17
                if (r10 != 0) goto L6e
                Hh.w r10 = Hh.w.this     // Catch: java.lang.Exception -> L17
                ir.a r10 = Hh.w.n(r10)     // Catch: java.lang.Exception -> L17
                r9.f12596a = r1     // Catch: java.lang.Exception -> L17
                r9.f12597b = r3     // Catch: java.lang.Exception -> L17
                java.lang.Object r10 = r10.b(r9)     // Catch: java.lang.Exception -> L17
                if (r10 != r0) goto L61
                goto L89
            L61:
                Hh.w r10 = Hh.w.this     // Catch: java.lang.Exception -> L17
                tv.B r10 = Hh.w.o(r10)     // Catch: java.lang.Exception -> L17
                java.lang.String r3 = r1.getEmail()     // Catch: java.lang.Exception -> L17
                r10.setValue(r3)     // Catch: java.lang.Exception -> L17
            L6e:
                Hh.w r10 = Hh.w.this     // Catch: java.lang.Exception -> L17
                ir.a r10 = Hh.w.n(r10)     // Catch: java.lang.Exception -> L17
                tv.f r10 = r10.c()     // Catch: java.lang.Exception -> L17
                Hh.w$a$a r3 = new Hh.w$a$a     // Catch: java.lang.Exception -> L17
                Hh.w r4 = Hh.w.this     // Catch: java.lang.Exception -> L17
                r3.<init>(r4)     // Catch: java.lang.Exception -> L17
                r9.f12596a = r1     // Catch: java.lang.Exception -> L17
                r9.f12597b = r2     // Catch: java.lang.Exception -> L17
                java.lang.Object r10 = r10.collect(r3, r9)     // Catch: java.lang.Exception -> L17
                if (r10 != r0) goto Ld1
            L89:
                return r0
            L8a:
                uw.a$a r0 = uw.a.INSTANCE
                java.lang.String r1 = "Failed to fetch subscription details"
                r2 = 0
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.f(r10, r1, r3)
                Hh.w r10 = Hh.w.this
                tv.B r10 = Hh.w.p(r10)
            L9a:
                java.lang.Object r0 = r10.getValue()
                r1 = r0
                bi.a r1 = (bi.SubscriptionCardViewState) r1
                Yh.a r3 = new Yh.a
                ak.a$a r4 = ak.AbstractC5607a.INSTANCE
                int r5 = kr.C15307d.f147826A0
                java.lang.Object[] r6 = new java.lang.Object[r2]
                ak.a r5 = r4.d(r5, r6)
                int r6 = kr.C15307d.f147869e0
                java.lang.Object[] r7 = new java.lang.Object[r2]
                ak.a r6 = r4.d(r6, r7)
                int r7 = kr.C15307d.f147911z0
                java.lang.Object[] r8 = new java.lang.Object[r2]
                ak.a r4 = r4.d(r7, r8)
                int r7 = kr.C15305b.f147818e
                java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.d(r7)
                r3.<init>(r5, r6, r4, r7)
                r4 = 0
                bi.a r1 = r1.a(r2, r4, r4, r3)
                boolean r0 = r10.e(r0, r1)
                if (r0 == 0) goto L9a
            Ld1:
                kotlin.Unit r10 = kotlin.Unit.f142422a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: Hh.w.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public w(C14758a subscriptionRepository, C16600a getUserEmailUseCase) {
        Intrinsics.j(subscriptionRepository, "subscriptionRepository");
        Intrinsics.j(getUserEmailUseCase, "getUserEmailUseCase");
        this.subscriptionRepository = subscriptionRepository;
        this.getUserEmailUseCase = getUserEmailUseCase;
        InterfaceC17140B<SubscriptionCardViewState> interfaceC17140BA = S.a(new SubscriptionCardViewState(false, null, null, null, 15, null));
        this._viewState = interfaceC17140BA;
        this.viewState = C17154h.c(interfaceC17140BA);
        InterfaceC17140B<String> interfaceC17140BA2 = S.a(null);
        this._lastFetchedEmail = interfaceC17140BA2;
        this.lastFetchedEmail = C17154h.c(interfaceC17140BA2);
    }

    public final void q() {
        SubscriptionCardViewState value;
        InterfaceC17140B<SubscriptionCardViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, SubscriptionCardViewState.b(value, true, null, null, null, 14, null)));
        C16648k.d(d0.a(this), null, null, new a(null), 3, null);
    }

    public final P<SubscriptionCardViewState> r() {
        return this.viewState;
    }
}
