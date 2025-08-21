package Ih;

import Vh.SubscriptionCardDecorator;
import Zh.SubscriptionEmptyOrErrorStateDecorator;
import androidx.view.c0;
import androidx.view.d0;
import bk.AbstractC6392a;
import ci.SubscriptionCardViewState;
import cr.SubscriptionDetails;
import ir.C14846a;
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
import kr.C15408b;
import kr.C15410d;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.InterfaceC16562g;
import pv.P;
import pv.S;
import qr.C16759a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0012R\u001f\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00148\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018¨\u0006 "}, d2 = {"LIh/w;", "Landroidx/lifecycle/c0;", "Lir/a;", "subscriptionRepository", "Lqr/a;", "getUserEmailUseCase", "<init>", "(Lir/a;Lqr/a;)V", "", "q", "()V", "a", "Lir/a;", "b", "Lqr/a;", "Lpv/B;", "Lci/a;", "c", "Lpv/B;", "_viewState", "Lpv/P;", "d", "Lpv/P;", "r", "()Lpv/P;", "viewState", "", "e", "_lastFetchedEmail", "f", "getLastFetchedEmail", "lastFetchedEmail", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class w extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C14846a subscriptionRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C16759a getUserEmailUseCase;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<SubscriptionCardViewState> _viewState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final P<SubscriptionCardViewState> viewState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<String> _lastFetchedEmail;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final P<String> lastFetchedEmail;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.basescreen.cards.SubscriptionCardViewModel$fetchSubscriptionCardInfo$2", f = "SubscriptionCardViewModel.kt", l = {49, 53}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f14747a;

        /* renamed from: b, reason: collision with root package name */
        int f14748b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Ih.w$a$a, reason: collision with other inner class name */
        static final class C0234a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ w f14750a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Ih.w$a$a$a, reason: collision with other inner class name */
            public static final class C0235a<T> implements Comparator {
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return ComparisonsKt.d(((SubscriptionDetails) t10).getNextOrderDate(), ((SubscriptionDetails) t11).getNextOrderDate());
                }
            }

            C0234a(w wVar) {
                this.f14750a = wVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<SubscriptionDetails> list, Continuation<? super Unit> continuation) {
                SubscriptionEmptyOrErrorStateDecorator subscriptionEmptyOrErrorStateDecorator;
                Object value;
                List<SubscriptionDetails> listZ0 = CollectionsKt.Z0(list, new C0235a());
                SubscriptionDetails subscriptionDetails = (SubscriptionDetails) CollectionsKt.u0(listZ0);
                SubscriptionCardDecorator subscriptionCardDecoratorA = subscriptionDetails != null ? Vh.h.a(subscriptionDetails) : null;
                if (listZ0.isEmpty()) {
                    AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
                    subscriptionEmptyOrErrorStateDecorator = new SubscriptionEmptyOrErrorStateDecorator(companion.d(C15410d.f148773b0, new Object[0]), companion.d(C15410d.f148748H0, new Object[0]), companion.d(C15410d.f148809t0, new Object[0]), Boxing.d(C15408b.f148725d));
                } else {
                    subscriptionEmptyOrErrorStateDecorator = new SubscriptionEmptyOrErrorStateDecorator(null, null, AbstractC6392a.INSTANCE.d(C15410d.f148736B0, new Object[0]), null, 11, null);
                }
                InterfaceC16549B interfaceC16549B = this.f14750a._viewState;
                do {
                    value = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value, ((SubscriptionCardViewState) value).a(false, subscriptionCardDecoratorA, listZ0, subscriptionEmptyOrErrorStateDecorator)));
                return Unit.f143329a;
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
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                int r1 = r9.f14748b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L29
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r0 = r9.f14747a
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
                java.lang.Object r1 = r9.f14747a
                qr.b r1 = (qr.SubscriptionUserInfo) r1
                kotlin.ResultKt.b(r10)     // Catch: java.lang.Exception -> L17
                goto L61
            L29:
                kotlin.ResultKt.b(r10)
                Ih.w r10 = Ih.w.this     // Catch: java.lang.Exception -> L17
                qr.a r10 = Ih.w.m(r10)     // Catch: java.lang.Exception -> L17
                qr.b r1 = r10.a()     // Catch: java.lang.Exception -> L17
                boolean r10 = r1.getIsLoggedIn()     // Catch: java.lang.Exception -> L17
                if (r10 == 0) goto L6e
                java.lang.String r10 = r1.getEmail()     // Catch: java.lang.Exception -> L17
                Ih.w r4 = Ih.w.this     // Catch: java.lang.Exception -> L17
                pv.B r4 = Ih.w.o(r4)     // Catch: java.lang.Exception -> L17
                java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Exception -> L17
                boolean r10 = kotlin.jvm.internal.Intrinsics.e(r10, r4)     // Catch: java.lang.Exception -> L17
                if (r10 != 0) goto L6e
                Ih.w r10 = Ih.w.this     // Catch: java.lang.Exception -> L17
                ir.a r10 = Ih.w.n(r10)     // Catch: java.lang.Exception -> L17
                r9.f14747a = r1     // Catch: java.lang.Exception -> L17
                r9.f14748b = r3     // Catch: java.lang.Exception -> L17
                java.lang.Object r10 = r10.c(r9)     // Catch: java.lang.Exception -> L17
                if (r10 != r0) goto L61
                goto L89
            L61:
                Ih.w r10 = Ih.w.this     // Catch: java.lang.Exception -> L17
                pv.B r10 = Ih.w.o(r10)     // Catch: java.lang.Exception -> L17
                java.lang.String r3 = r1.getEmail()     // Catch: java.lang.Exception -> L17
                r10.setValue(r3)     // Catch: java.lang.Exception -> L17
            L6e:
                Ih.w r10 = Ih.w.this     // Catch: java.lang.Exception -> L17
                ir.a r10 = Ih.w.n(r10)     // Catch: java.lang.Exception -> L17
                pv.f r10 = r10.d()     // Catch: java.lang.Exception -> L17
                Ih.w$a$a r3 = new Ih.w$a$a     // Catch: java.lang.Exception -> L17
                Ih.w r4 = Ih.w.this     // Catch: java.lang.Exception -> L17
                r3.<init>(r4)     // Catch: java.lang.Exception -> L17
                r9.f14747a = r1     // Catch: java.lang.Exception -> L17
                r9.f14748b = r2     // Catch: java.lang.Exception -> L17
                java.lang.Object r10 = r10.collect(r3, r9)     // Catch: java.lang.Exception -> L17
                if (r10 != r0) goto Ld1
            L89:
                return r0
            L8a:
                qw.a$a r0 = qw.a.INSTANCE
                java.lang.String r1 = "Failed to fetch subscription details"
                r2 = 0
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.f(r10, r1, r3)
                Ih.w r10 = Ih.w.this
                pv.B r10 = Ih.w.p(r10)
            L9a:
                java.lang.Object r0 = r10.getValue()
                r1 = r0
                ci.a r1 = (ci.SubscriptionCardViewState) r1
                Zh.a r3 = new Zh.a
                bk.a$a r4 = bk.AbstractC6392a.INSTANCE
                int r5 = kr.C15410d.f148738C0
                java.lang.Object[] r6 = new java.lang.Object[r2]
                bk.a r5 = r4.d(r5, r6)
                int r6 = kr.C15410d.f148779e0
                java.lang.Object[] r7 = new java.lang.Object[r2]
                bk.a r6 = r4.d(r6, r7)
                int r7 = kr.C15410d.f148736B0
                java.lang.Object[] r8 = new java.lang.Object[r2]
                bk.a r4 = r4.d(r7, r8)
                int r7 = kr.C15408b.f148726e
                java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.d(r7)
                r3.<init>(r5, r6, r4, r7)
                r4 = 0
                ci.a r1 = r1.a(r2, r4, r4, r3)
                boolean r0 = r10.e(r0, r1)
                if (r0 == 0) goto L9a
            Ld1:
                kotlin.Unit r10 = kotlin.Unit.f143329a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: Ih.w.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public w(C14846a subscriptionRepository, C16759a getUserEmailUseCase) {
        Intrinsics.j(subscriptionRepository, "subscriptionRepository");
        Intrinsics.j(getUserEmailUseCase, "getUserEmailUseCase");
        this.subscriptionRepository = subscriptionRepository;
        this.getUserEmailUseCase = getUserEmailUseCase;
        InterfaceC16549B<SubscriptionCardViewState> interfaceC16549BA = S.a(new SubscriptionCardViewState(false, null, null, null, 15, null));
        this._viewState = interfaceC16549BA;
        this.viewState = C16563h.c(interfaceC16549BA);
        InterfaceC16549B<String> interfaceC16549BA2 = S.a(null);
        this._lastFetchedEmail = interfaceC16549BA2;
        this.lastFetchedEmail = C16563h.c(interfaceC16549BA2);
    }

    public final void q() {
        SubscriptionCardViewState value;
        InterfaceC16549B<SubscriptionCardViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, SubscriptionCardViewState.b(value, true, null, null, null, 14, null)));
        C15809k.d(d0.a(this), null, null, new a(null), 3, null);
    }

    public final P<SubscriptionCardViewState> r() {
        return this.viewState;
    }
}
