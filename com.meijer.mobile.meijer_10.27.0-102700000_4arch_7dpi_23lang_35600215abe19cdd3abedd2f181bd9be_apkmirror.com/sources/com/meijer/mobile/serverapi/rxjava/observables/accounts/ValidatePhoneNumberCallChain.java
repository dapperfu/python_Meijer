package com.meijer.mobile.serverapi.rxjava.observables.accounts;

import Bh.e;
import Dh.EnumC3374g;
import Dh.ValidatePhoneAvailability;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qh.C16527b;
import qv.AbstractC16618K;
import qv.C16623P;
import qv.C16644i;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0012B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/serverapi/rxjava/observables/accounts/ValidatePhoneNumberCallChain;", "", "LBh/e;", "profileRepository", "Lqh/b;", "accountLinkingRepository", "Lqv/K;", "ioDispatcher", "<init>", "(LBh/e;Lqh/b;Lqv/K;)V", "", "mPerksPhoneNumber", "Lcom/meijer/mobile/serverapi/rxjava/observables/accounts/ValidatePhoneNumberCallChain$ValidatePhoneResponse;", "validate", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LBh/e;", "Lqh/b;", "Lqv/K;", "ValidatePhoneResponse", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ValidatePhoneNumberCallChain {
    public static final int $stable = 8;
    private final C16527b accountLinkingRepository;
    private final AbstractC16618K ioDispatcher;
    private final e profileRepository;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u0005\u0010\u000b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/serverapi/rxjava/observables/accounts/ValidatePhoneNumberCallChain$ValidatePhoneResponse;", "", "LDh/g;", "phoneConflictType", "", "isPhoneTextable", "<init>", "(LDh/g;Z)V", "component1", "()LDh/g;", "component2", "()Z", "copy", "(LDh/g;Z)Lcom/meijer/mobile/serverapi/rxjava/observables/accounts/ValidatePhoneNumberCallChain$ValidatePhoneResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LDh/g;", "getPhoneConflictType", "setPhoneConflictType", "(LDh/g;)V", "Z", "setPhoneTextable", "(Z)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ValidatePhoneResponse {
        public static final int $stable = 8;
        private boolean isPhoneTextable;
        private EnumC3374g phoneConflictType;

        /* renamed from: component2, reason: from getter */
        public final boolean getIsPhoneTextable() {
            return this.isPhoneTextable;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ValidatePhoneResponse)) {
                return false;
            }
            ValidatePhoneResponse validatePhoneResponse = (ValidatePhoneResponse) other;
            return this.phoneConflictType == validatePhoneResponse.phoneConflictType && this.isPhoneTextable == validatePhoneResponse.isPhoneTextable;
        }

        public int hashCode() {
            return (this.phoneConflictType.hashCode() * 31) + Boolean.hashCode(this.isPhoneTextable);
        }

        public String toString() {
            return "ValidatePhoneResponse(phoneConflictType=" + this.phoneConflictType + ", isPhoneTextable=" + this.isPhoneTextable + ')';
        }

        public ValidatePhoneResponse(EnumC3374g phoneConflictType, boolean z10) {
            Intrinsics.j(phoneConflictType, "phoneConflictType");
            this.phoneConflictType = phoneConflictType;
            this.isPhoneTextable = z10;
        }

        public static /* synthetic */ ValidatePhoneResponse copy$default(ValidatePhoneResponse validatePhoneResponse, EnumC3374g enumC3374g, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                enumC3374g = validatePhoneResponse.phoneConflictType;
            }
            if ((i10 & 2) != 0) {
                z10 = validatePhoneResponse.isPhoneTextable;
            }
            return validatePhoneResponse.copy(enumC3374g, z10);
        }

        /* renamed from: component1, reason: from getter */
        public final EnumC3374g getPhoneConflictType() {
            return this.phoneConflictType;
        }

        public final ValidatePhoneResponse copy(EnumC3374g phoneConflictType, boolean isPhoneTextable) {
            Intrinsics.j(phoneConflictType, "phoneConflictType");
            return new ValidatePhoneResponse(phoneConflictType, isPhoneTextable);
        }

        public final EnumC3374g getPhoneConflictType() {
            return this.phoneConflictType;
        }

        public final boolean isPhoneTextable() {
            return this.isPhoneTextable;
        }

        public final void setPhoneConflictType(EnumC3374g enumC3374g) {
            Intrinsics.j(enumC3374g, "<set-?>");
            this.phoneConflictType = enumC3374g;
        }

        public final void setPhoneTextable(boolean z10) {
            this.isPhoneTextable = z10;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lcom/meijer/mobile/serverapi/rxjava/observables/accounts/ValidatePhoneNumberCallChain$ValidatePhoneResponse;", "<anonymous>", "(Lqv/O;)Lcom/meijer/mobile/serverapi/rxjava/observables/accounts/ValidatePhoneNumberCallChain$ValidatePhoneResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.serverapi.rxjava.observables.accounts.ValidatePhoneNumberCallChain$validate$2", f = "ValidatePhoneNumberCallChain.kt", l = {26}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super ValidatePhoneResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f116662a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f116664c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lcom/meijer/mobile/serverapi/rxjava/observables/accounts/ValidatePhoneNumberCallChain$ValidatePhoneResponse;", "<anonymous>", "(Lqv/O;)Lcom/meijer/mobile/serverapi/rxjava/observables/accounts/ValidatePhoneNumberCallChain$ValidatePhoneResponse;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.serverapi.rxjava.observables.accounts.ValidatePhoneNumberCallChain$validate$2$1", f = "ValidatePhoneNumberCallChain.kt", l = {33, 35, 35}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.serverapi.rxjava.observables.accounts.ValidatePhoneNumberCallChain$a$a, reason: collision with other inner class name */
        static final class C1883a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super ValidatePhoneResponse>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f116665a;

            /* renamed from: b, reason: collision with root package name */
            Object f116666b;

            /* renamed from: c, reason: collision with root package name */
            Object f116667c;

            /* renamed from: d, reason: collision with root package name */
            int f116668d;

            /* renamed from: e, reason: collision with root package name */
            private /* synthetic */ Object f116669e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ValidatePhoneNumberCallChain f116670f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f116671g;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)Z"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.serverapi.rxjava.observables.accounts.ValidatePhoneNumberCallChain$validate$2$1$isPhoneTextable$1", f = "ValidatePhoneNumberCallChain.kt", l = {31}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.serverapi.rxjava.observables.accounts.ValidatePhoneNumberCallChain$a$a$a, reason: collision with other inner class name */
            static final class C1884a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Boolean>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f116672a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ValidatePhoneNumberCallChain f116673b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f116674c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1884a(ValidatePhoneNumberCallChain validatePhoneNumberCallChain, String str, Continuation<? super C1884a> continuation) {
                    super(2, continuation);
                    this.f116673b = validatePhoneNumberCallChain;
                    this.f116674c = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1884a(this.f116673b, this.f116674c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Boolean> continuation) {
                    return ((C1884a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f116672a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    C16527b c16527b = this.f116673b.accountLinkingRepository;
                    String str = this.f116674c;
                    this.f116672a = 1;
                    Object objA = c16527b.a(str, this);
                    if (objA == objF) {
                        return objF;
                    }
                    return objA;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LDh/g;", "<anonymous>", "(Lqv/O;)LDh/g;"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.serverapi.rxjava.observables.accounts.ValidatePhoneNumberCallChain$validate$2$1$phoneConflictErrorType$1", f = "ValidatePhoneNumberCallChain.kt", l = {28}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.serverapi.rxjava.observables.accounts.ValidatePhoneNumberCallChain$a$a$b */
            static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super EnumC3374g>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f116675a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ValidatePhoneNumberCallChain f116676b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f116677c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(ValidatePhoneNumberCallChain validatePhoneNumberCallChain, String str, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f116676b = validatePhoneNumberCallChain;
                    this.f116677c = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f116676b, this.f116677c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super EnumC3374g> continuation) {
                    return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f116675a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        e eVar = this.f116676b.profileRepository;
                        String str = this.f116677c;
                        this.f116675a = 1;
                        obj = eVar.A(str, this);
                        if (obj == objF) {
                            return objF;
                        }
                    }
                    return ((ValidatePhoneAvailability) obj).getConflictType();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1883a(ValidatePhoneNumberCallChain validatePhoneNumberCallChain, String str, Continuation<? super C1883a> continuation) {
                super(2, continuation);
                this.f116670f = validatePhoneNumberCallChain;
                this.f116671g = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C1883a c1883a = new C1883a(this.f116670f, this.f116671g, continuation);
                c1883a.f116669e = obj;
                return c1883a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super ValidatePhoneResponse> continuation) {
                return ((C1883a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    r13 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r13.f116668d
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L50
                    if (r1 == r4) goto L3e
                    if (r1 == r3) goto L2e
                    if (r1 != r2) goto L26
                    java.lang.Object r0 = r13.f116667c
                    Dh.g r0 = (Dh.EnumC3374g) r0
                    java.lang.Object r1 = r13.f116666b
                    qv.W r1 = (qv.W) r1
                    java.lang.Object r1 = r13.f116665a
                    qv.W r1 = (qv.W) r1
                    java.lang.Object r1 = r13.f116669e
                    qv.O r1 = (qv.InterfaceC16622O) r1
                    kotlin.ResultKt.b(r14)
                    goto Lb5
                L26:
                    java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r14.<init>(r0)
                    throw r14
                L2e:
                    java.lang.Object r1 = r13.f116666b
                    qv.W r1 = (qv.W) r1
                    java.lang.Object r3 = r13.f116665a
                    qv.W r3 = (qv.W) r3
                    java.lang.Object r4 = r13.f116669e
                    qv.O r4 = (qv.InterfaceC16622O) r4
                    kotlin.ResultKt.b(r14)
                    goto La0
                L3e:
                    java.lang.Object r1 = r13.f116666b
                    qv.W r1 = (qv.W) r1
                    java.lang.Object r4 = r13.f116665a
                    qv.W r4 = (qv.W) r4
                    java.lang.Object r5 = r13.f116669e
                    qv.O r5 = (qv.InterfaceC16622O) r5
                    kotlin.ResultKt.b(r14)
                    r14 = r4
                L4e:
                    r4 = r5
                    goto L8e
                L50:
                    kotlin.ResultKt.b(r14)
                    java.lang.Object r14 = r13.f116669e
                    r5 = r14
                    qv.O r5 = (qv.InterfaceC16622O) r5
                    com.meijer.mobile.serverapi.rxjava.observables.accounts.ValidatePhoneNumberCallChain$a$a$b r8 = new com.meijer.mobile.serverapi.rxjava.observables.accounts.ValidatePhoneNumberCallChain$a$a$b
                    com.meijer.mobile.serverapi.rxjava.observables.accounts.ValidatePhoneNumberCallChain r14 = r13.f116670f
                    java.lang.String r1 = r13.f116671g
                    r11 = 0
                    r8.<init>(r14, r1, r11)
                    r9 = 3
                    r10 = 0
                    r6 = 0
                    r7 = 0
                    qv.W r14 = qv.C16644i.b(r5, r6, r7, r8, r9, r10)
                    com.meijer.mobile.serverapi.rxjava.observables.accounts.ValidatePhoneNumberCallChain$a$a$a r8 = new com.meijer.mobile.serverapi.rxjava.observables.accounts.ValidatePhoneNumberCallChain$a$a$a
                    com.meijer.mobile.serverapi.rxjava.observables.accounts.ValidatePhoneNumberCallChain r1 = r13.f116670f
                    java.lang.String r6 = r13.f116671g
                    r8.<init>(r1, r6, r11)
                    r6 = 0
                    qv.W r1 = qv.C16644i.b(r5, r6, r7, r8, r9, r10)
                    qv.W[] r6 = new qv.W[r3]
                    r7 = 0
                    r6[r7] = r14
                    r6[r4] = r1
                    r13.f116669e = r5
                    r13.f116665a = r14
                    r13.f116666b = r1
                    r13.f116668d = r4
                    java.lang.Object r4 = qv.C16638f.b(r6, r13)
                    if (r4 != r0) goto L4e
                    goto Lb2
                L8e:
                    r13.f116669e = r4
                    r13.f116665a = r14
                    r13.f116666b = r1
                    r13.f116668d = r3
                    java.lang.Object r3 = r14.B(r13)
                    if (r3 != r0) goto L9d
                    goto Lb2
                L9d:
                    r12 = r3
                    r3 = r14
                    r14 = r12
                La0:
                    Dh.g r14 = (Dh.EnumC3374g) r14
                    r13.f116669e = r4
                    r13.f116665a = r3
                    r13.f116666b = r1
                    r13.f116667c = r14
                    r13.f116668d = r2
                    java.lang.Object r1 = r1.B(r13)
                    if (r1 != r0) goto Lb3
                Lb2:
                    return r0
                Lb3:
                    r0 = r14
                    r14 = r1
                Lb5:
                    java.lang.Boolean r14 = (java.lang.Boolean) r14
                    boolean r14 = r14.booleanValue()
                    com.meijer.mobile.serverapi.rxjava.observables.accounts.ValidatePhoneNumberCallChain$ValidatePhoneResponse r1 = new com.meijer.mobile.serverapi.rxjava.observables.accounts.ValidatePhoneNumberCallChain$ValidatePhoneResponse
                    r1.<init>(r0, r14)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.serverapi.rxjava.observables.accounts.ValidatePhoneNumberCallChain.a.C1883a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f116664c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ValidatePhoneNumberCallChain.this.new a(this.f116664c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super ValidatePhoneResponse> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f116662a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            AbstractC16618K abstractC16618K = ValidatePhoneNumberCallChain.this.ioDispatcher;
            C1883a c1883a = new C1883a(ValidatePhoneNumberCallChain.this, this.f116664c, null);
            this.f116662a = 1;
            Object objG = C16644i.g(abstractC16618K, c1883a, this);
            if (objG == objF) {
                return objF;
            }
            return objG;
        }
    }

    public ValidatePhoneNumberCallChain(e profileRepository, C16527b accountLinkingRepository, AbstractC16618K ioDispatcher) {
        Intrinsics.j(profileRepository, "profileRepository");
        Intrinsics.j(accountLinkingRepository, "accountLinkingRepository");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.profileRepository = profileRepository;
        this.accountLinkingRepository = accountLinkingRepository;
        this.ioDispatcher = ioDispatcher;
    }

    public final Object validate(String str, Continuation<? super ValidatePhoneResponse> continuation) {
        return C16623P.g(new a(str, null), continuation);
    }
}
