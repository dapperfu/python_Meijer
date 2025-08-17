package com.meijer.mobile.accounts.ux.createaccount;

import Dh.AbstractC3375h;
import Dh.CreateAccountSubmission;
import Th.CreateAccountDecorator;
import Th.b;
import Th.c;
import ai.C5605a;
import androidx.view.c0;
import androidx.view.d0;
import com.meijer.mobile.accounts.ux.createaccount.a;
import com.meijer.mobile.accounts.ux.createaccount.b;
import com.meijer.mobile.accounts.ux.createaccount.k;
import com.meijer.mobile.accounts.ux.createaccount.t;
import com.meijer.mobile.accounts.ux.createaccount.u;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16648k;
import qv.E0;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.P;
import tv.S;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010.\u001a\b\u0012\u0004\u0012\u00020%0)8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/meijer/mobile/accounts/ux/createaccount/m;", "Landroidx/lifecycle/c0;", "LBh/c;", "accountsAMSRepository", "Lai/a;", "getNearestStoreUseCase", "Lyo/k;", "userManager", "Lyo/f;", "storeManager", "Lcom/meijer/mobile/accounts/ux/createaccount/t;", "navigationManager", "<init>", "(LBh/c;Lai/a;Lyo/k;Lyo/f;Lcom/meijer/mobile/accounts/ux/createaccount/t;)V", "", "zipCode", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "s", "(Ljava/lang/String;I)V", "Lcom/meijer/mobile/accounts/ux/createaccount/b;", "action", "u", "(Lcom/meijer/mobile/accounts/ux/createaccount/b;)V", "a", "LBh/c;", "b", "Lai/a;", "c", "Lyo/k;", "d", "Lyo/f;", "e", "Lcom/meijer/mobile/accounts/ux/createaccount/t;", "Ltv/B;", "Lcom/meijer/mobile/accounts/ux/createaccount/l;", "f", "Ltv/B;", "_uiState", "Ltv/P;", "g", "Ltv/P;", "t", "()Ltv/P;", "uiState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class m extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Bh.c accountsAMSRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C5605a getNearestStoreUseCase;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yo.f storeManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t navigationManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<CreateAccountUiState> _uiState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final P<CreateAccountUiState> uiState;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.createaccount.CreateAccountViewModel$createAccount$1", f = "CreateAccountViewModel.kt", l = {154}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f94351a;

        /* renamed from: b, reason: collision with root package name */
        Object f94352b;

        /* renamed from: c, reason: collision with root package name */
        Object f94353c;

        /* renamed from: d, reason: collision with root package name */
        Object f94354d;

        /* renamed from: e, reason: collision with root package name */
        int f94355e;

        /* renamed from: f, reason: collision with root package name */
        int f94356f;

        /* renamed from: g, reason: collision with root package name */
        int f94357g;

        /* renamed from: h, reason: collision with root package name */
        int f94358h;

        /* renamed from: i, reason: collision with root package name */
        int f94359i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f94360j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ CreateAccountSubmission f94362l;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = m.this.new a(this.f94362l, continuation);
            aVar.f94360j = obj;
            return aVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CreateAccountSubmission createAccountSubmission, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f94362l = createAccountSubmission;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            CreateAccountUiState createAccountUiState;
            Object value2;
            CreateAccountUiState createAccountUiState2;
            Object value3;
            Object objD;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f94359i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f94360j;
                    m mVar = m.this;
                    CreateAccountSubmission createAccountSubmission = this.f94362l;
                    Result.Companion companion = Result.INSTANCE;
                    Bh.c cVar = mVar.accountsAMSRepository;
                    this.f94360j = interfaceC16622O;
                    this.f94351a = interfaceC16622O;
                    this.f94352b = this;
                    this.f94353c = this;
                    this.f94354d = interfaceC16622O;
                    this.f94355e = 0;
                    this.f94356f = 0;
                    this.f94357g = 0;
                    this.f94358h = 0;
                    this.f94359i = 1;
                    objD = cVar.d(createAccountSubmission, this);
                    if (objD == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objD = obj;
                }
                objB = Result.b(objD);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            m mVar2 = m.this;
            if (Result.h(objB)) {
                AbstractC3375h abstractC3375h = (AbstractC3375h) objB;
                if (abstractC3375h instanceof AbstractC3375h.Success) {
                    AbstractC3375h.Success success = (AbstractC3375h.Success) abstractC3375h;
                    mVar2.userManager.e0(success.getAccount());
                    yo.f.q(mVar2.storeManager, yo.d.f170813a, success.getAccount().getStoreId(), null, null, success.getAccount().getZip(), 12, null);
                    InterfaceC17140B interfaceC17140B = mVar2._uiState;
                    do {
                        value3 = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value3, CreateAccountUiState.b((CreateAccountUiState) value3, null, new k.Animation(null, 0, null, 7, null), 1, null)));
                } else {
                    if (!(abstractC3375h instanceof AbstractC3375h.Conflict)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC17140B interfaceC17140B2 = mVar2._uiState;
                    do {
                        value2 = interfaceC17140B2.getValue();
                        createAccountUiState2 = (CreateAccountUiState) value2;
                    } while (!interfaceC17140B2.e(value2, createAccountUiState2.a(CreateAccountDecorator.f(createAccountUiState2.getCreateAccountDecorator(), null, null, null, null, null, null, null, null, null, null, new b.ErrorConflict(null, 1, null), false, false, false, 15359, null), new k.FormFields(null, 1, null))));
                }
            }
            m mVar3 = m.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                uw.a.INSTANCE.f(thE, "Error creating account", new Object[0]);
                InterfaceC17140B interfaceC17140B3 = mVar3._uiState;
                do {
                    value = interfaceC17140B3.getValue();
                    createAccountUiState = (CreateAccountUiState) value;
                } while (!interfaceC17140B3.e(value, createAccountUiState.a(CreateAccountDecorator.f(createAccountUiState.getCreateAccountDecorator(), null, null, null, null, null, null, null, null, null, null, new b.ErrorGeneric(null, 1, null), false, false, false, 15359, null), new k.FormFields(null, 1, null))));
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.createaccount.CreateAccountViewModel$onAction$6", f = "CreateAccountViewModel.kt", l = {122}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f94363a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f94365c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f94365c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return m.this.new b(this.f94365c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r10.f94363a
                r2 = 1
                if (r1 == 0) goto L1e
                if (r1 != r2) goto L16
                kotlin.ResultKt.b(r11)
                kotlin.Result r11 = (kotlin.Result) r11
                java.lang.Object r11 = r11.getValue()
                r7 = r10
                goto L37
            L16:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1e:
                kotlin.ResultKt.b(r11)
                com.meijer.mobile.accounts.ux.createaccount.m r11 = com.meijer.mobile.accounts.ux.createaccount.m.this
                ai.a r3 = com.meijer.mobile.accounts.ux.createaccount.m.o(r11)
                java.lang.String r4 = r10.f94365c
                r10.f94363a = r2
                r5 = 0
                r6 = 0
                r8 = 6
                r9 = 0
                r7 = r10
                java.lang.Object r11 = ai.C5605a.c(r3, r4, r5, r6, r7, r8, r9)
                if (r11 != r0) goto L37
                return r0
            L37:
                boolean r0 = kotlin.Result.g(r11)
                r1 = 0
                if (r0 == 0) goto L3f
                r11 = r1
            L3f:
                com.meijer.mobile.storeinfo.api.model.Store r11 = (com.meijer.mobile.storeinfo.api.model.Store) r11
                if (r11 == 0) goto L48
                java.lang.String r0 = r11.getZipCode()
                goto L49
            L48:
                r0 = r1
            L49:
                if (r0 == 0) goto L51
                int r2 = r0.length()
                if (r2 != 0) goto L52
            L51:
                r0 = r1
            L52:
                if (r0 != 0) goto L60
                Tq.e r0 = yo.g.a()
                java.lang.String r0 = r0.getZipCode()
                if (r0 != 0) goto L60
                java.lang.String r0 = r7.f94365c
            L60:
                if (r11 == 0) goto L79
                int r11 = r11.getStoreId()
                java.lang.Integer r11 = kotlin.coroutines.jvm.internal.Boxing.d(r11)
                int r2 = r11.intValue()
                if (r2 != 0) goto L71
                goto L72
            L71:
                r1 = r11
            L72:
                if (r1 == 0) goto L79
                int r11 = r1.intValue()
                goto L81
            L79:
                Tq.e r11 = yo.g.a()
                int r11 = r11.getStoreId()
            L81:
                com.meijer.mobile.accounts.ux.createaccount.m r1 = com.meijer.mobile.accounts.ux.createaccount.m.this
                com.meijer.mobile.accounts.ux.createaccount.m.m(r1, r0, r11)
                kotlin.Unit r11 = kotlin.Unit.f142422a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.accounts.ux.createaccount.m.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public m(Bh.c accountsAMSRepository, C5605a getNearestStoreUseCase, yo.k userManager, yo.f storeManager, t navigationManager) {
        Intrinsics.j(accountsAMSRepository, "accountsAMSRepository");
        Intrinsics.j(getNearestStoreUseCase, "getNearestStoreUseCase");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(storeManager, "storeManager");
        Intrinsics.j(navigationManager, "navigationManager");
        this.accountsAMSRepository = accountsAMSRepository;
        this.getNearestStoreUseCase = getNearestStoreUseCase;
        this.userManager = userManager;
        this.storeManager = storeManager;
        this.navigationManager = navigationManager;
        InterfaceC17140B<CreateAccountUiState> interfaceC17140BA = S.a(new CreateAccountUiState(new CreateAccountDecorator(null, null, null, null, null, null, null, null, null, null, null, false, false, storeManager.d(), 8191, null), null, 2, null));
        this._uiState = interfaceC17140BA;
        this.uiState = C17154h.c(interfaceC17140BA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(String zipCode, int storeId) {
        C16648k.d(d0.a(this), null, null, new a(Th.e.a(this._uiState.getValue().getCreateAccountDecorator(), storeId, zipCode), null), 3, null);
    }

    public final P<CreateAccountUiState> t() {
        return this.uiState;
    }

    public final void u(com.meijer.mobile.accounts.ux.createaccount.b action) {
        CreateAccountUiState value;
        Th.c cVar;
        CreateAccountUiState value2;
        CreateAccountDecorator createAccountDecoratorF;
        CreateAccountUiState value3;
        CreateAccountUiState createAccountUiState;
        Intrinsics.j(action, "action");
        if (action instanceof b.c) {
            InterfaceC17140B<CreateAccountUiState> interfaceC17140B = this._uiState;
            do {
                value3 = interfaceC17140B.getValue();
                createAccountUiState = value3;
            } while (!interfaceC17140B.e(value3, new CreateAccountUiState(CreateAccountDecorator.f(createAccountUiState.getCreateAccountDecorator(), null, null, null, null, null, null, null, null, null, new c.Default(createAccountUiState.getCreateAccountDecorator().getBottomSheetDecorator()), null, false, false, false, 15871, null), null, 2, null)));
            return;
        }
        if (action instanceof b.FormFieldChanged) {
            CreateAccountDecorator createAccountDecoratorV = this._uiState.getValue().getCreateAccountDecorator().v(((b.FormFieldChanged) action).a());
            InterfaceC17140B<CreateAccountUiState> interfaceC17140B2 = this._uiState;
            while (!interfaceC17140B2.e(interfaceC17140B2.getValue(), new CreateAccountUiState(createAccountDecoratorV, null, 2, null))) {
            }
            return;
        }
        if (action instanceof b.OnCheckedChange) {
            b.OnCheckedChange onCheckedChange = (b.OnCheckedChange) action;
            com.meijer.mobile.accounts.ux.createaccount.a checkboxAction = onCheckedChange.getCheckboxAction();
            if (checkboxAction instanceof a.TextMarketing) {
                createAccountDecoratorF = CreateAccountDecorator.f(this._uiState.getValue().getCreateAccountDecorator(), null, null, null, null, null, null, null, null, null, null, null, false, ((a.TextMarketing) onCheckedChange.getCheckboxAction()).getIsChecked(), false, 12287, null);
            } else {
                if (!(checkboxAction instanceof a.WeeklyAd)) {
                    throw new NoWhenBranchMatchedException();
                }
                createAccountDecoratorF = CreateAccountDecorator.f(this._uiState.getValue().getCreateAccountDecorator(), null, null, null, null, null, null, null, null, null, null, null, ((a.WeeklyAd) onCheckedChange.getCheckboxAction()).getIsChecked(), false, false, 14335, null);
            }
            InterfaceC17140B<CreateAccountUiState> interfaceC17140B3 = this._uiState;
            while (!interfaceC17140B3.e(interfaceC17140B3.getValue(), new CreateAccountUiState(createAccountDecoratorF, null, 2, null))) {
            }
            return;
        }
        if (action instanceof b.OpenBottomSheet) {
            u tooltipAction = ((b.OpenBottomSheet) action).getTooltipAction();
            if (Intrinsics.e(tooltipAction, u.d.f94382a)) {
                cVar = c.e.f35007f;
            } else if (Intrinsics.e(tooltipAction, u.a.f94379a)) {
                cVar = c.b.f35001f;
            } else if (Intrinsics.e(tooltipAction, u.c.f94381a)) {
                cVar = c.d.f35005f;
            } else {
                if (!Intrinsics.e(tooltipAction, u.b.f94380a)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = c.C0778c.f35003f;
            }
            Th.c cVar2 = cVar;
            InterfaceC17140B<CreateAccountUiState> interfaceC17140B4 = this._uiState;
            do {
                value2 = interfaceC17140B4.getValue();
            } while (!interfaceC17140B4.e(value2, new CreateAccountUiState(CreateAccountDecorator.f(value2.getCreateAccountDecorator(), null, null, null, null, null, null, null, null, null, cVar2, null, false, false, false, 15871, null), null, 2, null)));
            return;
        }
        if (!(action instanceof b.a)) {
            if (!(action instanceof b.C1329b)) {
                throw new NoWhenBranchMatchedException();
            }
            this.navigationManager.b(t.a.b.f94378b);
            return;
        }
        InterfaceC17140B<CreateAccountUiState> interfaceC17140B5 = this._uiState;
        do {
            value = interfaceC17140B5.getValue();
        } while (!interfaceC17140B5.e(value, CreateAccountUiState.b(value, null, new k.Loading(null, 1, null), 1, null)));
        if (!this._uiState.getValue().getCreateAccountDecorator().getIsHomeStoreSet()) {
            C16648k.d(d0.a(this), null, null, new b(this._uiState.getValue().getCreateAccountDecorator().getZipCode().c().e(), null), 3, null);
        } else {
            String zipCode = this.storeManager.h().getZipCode();
            Intrinsics.g(zipCode);
            s(zipCode, this.storeManager.b());
        }
    }
}
