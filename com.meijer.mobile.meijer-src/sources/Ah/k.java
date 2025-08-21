package Ah;

import Cs.MeijerAccount;
import Eh.AndroidPayLoyaltyCardInfoResponse;
import Eh.CustomerPreference;
import Eh.EmailVerificationSpiffs;
import Eh.UpdateConfirmationResponse;
import Eh.UpdateStoreResponse;
import Eh.ValidateEmailAvailability;
import Eh.ValidatePhoneAvailability;
import Eh.VehicleInformation;
import Fh.DiscretePreferenceChoice;
import android.security.keystore.UserNotAuthenticatedException;
import com.meijer.mobile.accounts.service.models.network.CreateAccountRequest;
import com.meijer.mobile.accounts.service.models.network.ResetPasswordRequestJson;
import com.meijer.mobile.accounts.service.models.network.UpdateConfirmationResponseJson;
import com.meijer.mobile.accounts.service.models.network.ValidateEmailAvailabilityJson;
import com.meijer.mobile.accounts.service.models.network.ValidatePhoneAvailabilityJson;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.List;
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
import mv.C15805i;
import mv.InterfaceC15783O;
import okhttp3.Headers;
import retrofit2.HttpException;
import retrofit2.Response;
import sk.EnumC17080a;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001BG\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001a\u0010\u0014J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0086@¢\u0006\u0004\b\u001d\u0010\u0014J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001bH\u0086@¢\u0006\u0004\b\u001f\u0010\u0014J*\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00172\b\b\u0002\u0010#\u001a\u00020\"H\u0086@¢\u0006\u0004\b%\u0010&J \u0010)\u001a\u00020$2\u0006\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b)\u0010*J \u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\"H\u0086@¢\u0006\u0004\b-\u0010.J\u0018\u00100\u001a\u00020/2\u0006\u0010+\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b0\u00101J\u0018\u00104\u001a\u0002032\u0006\u00102\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b4\u00101J\u0018\u00106\u001a\u00020$2\u0006\u00105\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b6\u00107J\u0018\u0010;\u001a\u00020:2\u0006\u00109\u001a\u000208H\u0086@¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\u00020$2\u0006\u00105\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b=\u00107J\u0018\u0010?\u001a\u00020$2\u0006\u0010>\u001a\u00020\u001cH\u0086@¢\u0006\u0004\b?\u0010@J \u0010C\u001a\u00020$2\u0006\u0010A\u001a\u0002082\u0006\u0010B\u001a\u00020\u0017H\u0086@¢\u0006\u0004\bC\u0010DJ \u0010E\u001a\u00020$2\u0006\u0010A\u001a\u0002082\u0006\u0010B\u001a\u00020\u0017H\u0086@¢\u0006\u0004\bE\u0010DJ\u0018\u0010F\u001a\u00020$2\u0006\u0010A\u001a\u000208H\u0086@¢\u0006\u0004\bF\u0010<J\u0018\u0010H\u001a\u00020$2\u0006\u0010G\u001a\u00020\u0017H\u0086@¢\u0006\u0004\bH\u00101J\u0010\u0010J\u001a\u00020IH\u0086@¢\u0006\u0004\bJ\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010W¨\u0006X"}, d2 = {"LAh/k;", "", "Lzh/c;", "accountsApi", "Lzh/j;", "legacyAccountsApi", "LCs/b;", "userProvider", "LAh/j;", "preferencesDataSource", "Lokhttp3/Headers;", "globalHeaders", "LYi/a;", "authTokenProvider", "Lmv/K;", "ioDispatcher", "<init>", "(Lzh/c;Lzh/j;LCs/b;LAh/j;Lokhttp3/Headers;LYi/a;Lmv/K;)V", "LCs/a;", "o", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LEh/f;", "k", "", "m", "LEh/J;", "p", "", "LEh/k;", "l", "LFh/b;", "n", "currentPin", "newPin", "", "activateViaText", "LEh/D;", "u", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "oldPassword", "newPassword", "w", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newPhoneNumber", "LFh/f;", "t", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LEh/H;", "A", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emailAddress", "LEh/G;", "z", "meijerAccount", "r", "(LCs/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "storeId", "LEh/F;", "x", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", "customerPreference", "s", "(LEh/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "vehicleId", "vehicleDescription", "h", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "y", "i", "email", "q", "LEh/m;", "j", "a", "Lzh/c;", "b", "Lzh/j;", "c", "LCs/b;", "d", "LAh/j;", "e", "Lokhttp3/Headers;", "f", "LYi/a;", "Lmv/K;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final zh.c accountsApi;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final zh.j legacyAccountsApi;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Cs.b userProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Ah.j preferencesDataSource;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Headers globalHeaders;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Yi.a authTokenProvider;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LEh/D;", "<anonymous>", "(Lmv/O;)LEh/D;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.ProfileDataSource$createNewAccount$2", f = "ProfileDataSource.kt", l = {240}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super UpdateConfirmationResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f534a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MeijerAccount f536c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(MeijerAccount meijerAccount, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f536c = meijerAccount;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k.this.new a(this.f536c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super UpdateConfirmationResponse> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f534a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                zh.c cVar = k.this.accountsApi;
                CreateAccountRequest createAccountRequest = new CreateAccountRequest(this.f536c);
                this.f534a = 1;
                obj = cVar.w(createAccountRequest, this);
                if (obj == objF) {
                    return objF;
                }
            }
            Response response = (Response) obj;
            if (response.isSuccessful()) {
                Object objBody = response.body();
                Intrinsics.g(objBody);
                return Dh.b.E((UpdateConfirmationResponseJson) objBody, null, 1, null);
            }
            throw new HttpException(response);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LEh/D;", "<anonymous>", "(Lmv/O;)LEh/D;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.ProfileDataSource$createVehicleInformation$2", f = "ProfileDataSource.kt", l = {266, 265}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super UpdateConfirmationResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f537a;

        /* renamed from: b, reason: collision with root package name */
        int f538b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f540d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f541e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f540d = i10;
            this.f541e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k.this.new b(this.f540d, this.f541e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super UpdateConfirmationResponse> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
        
            if (r11 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r10.f538b
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1b
                if (r1 != r2) goto L13
                kotlin.ResultKt.b(r11)
                goto L5d
            L13:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1b:
                java.lang.Object r1 = r10.f537a
                zh.c r1 = (zh.c) r1
                kotlin.ResultKt.b(r11)
                goto L3d
            L23:
                kotlin.ResultKt.b(r11)
                Ah.k r11 = Ah.k.this
                zh.c r1 = Ah.k.a(r11)
                Ah.k r11 = Ah.k.this
                Yi.a r11 = Ah.k.b(r11)
                r10.f537a = r1
                r10.f538b = r4
                java.lang.Object r11 = r11.c(r10)
                if (r11 != r0) goto L3d
                goto L5c
            L3d:
                com.meijer.mobile.authentication.core.model.BearerToken r11 = (com.meijer.mobile.authentication.core.model.BearerToken) r11
                com.meijer.mobile.accounts.service.models.network.CreateOrUpdateVehicleInformationRequest r5 = new com.meijer.mobile.accounts.service.models.network.CreateOrUpdateVehicleInformationRequest
                int r6 = r10.f540d
                Ah.k r7 = Ah.k.this
                Cs.b r7 = Ah.k.f(r7)
                long r7 = r7.c()
                java.lang.String r9 = r10.f541e
                r5.<init>(r6, r7, r9)
                r10.f537a = r3
                r10.f538b = r2
                java.lang.Object r11 = r1.b(r11, r5, r10)
                if (r11 != r0) goto L5d
            L5c:
                return r0
            L5d:
                retrofit2.Response r11 = (retrofit2.Response) r11
                boolean r0 = r11.isSuccessful()
                if (r0 == 0) goto L73
                java.lang.Object r11 = r11.body()
                kotlin.jvm.internal.Intrinsics.g(r11)
                com.meijer.mobile.accounts.service.models.network.UpdateConfirmationResponseJson r11 = (com.meijer.mobile.accounts.service.models.network.UpdateConfirmationResponseJson) r11
                Eh.D r11 = Dh.b.E(r11, r3, r4, r3)
                return r11
            L73:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ah.k.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LEh/D;", "<anonymous>", "(Lmv/O;)LEh/D;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.ProfileDataSource$deleteVehicleInformation$2", f = "ProfileDataSource.kt", l = {296, 295}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super UpdateConfirmationResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f542a;

        /* renamed from: b, reason: collision with root package name */
        int f543b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f545d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f545d = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k.this.new c(this.f545d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super UpdateConfirmationResponse> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            if (r7 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r6.f543b
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1b
                if (r1 != r2) goto L13
                kotlin.ResultKt.b(r7)
                goto L4c
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                java.lang.Object r1 = r6.f542a
                zh.c r1 = (zh.c) r1
                kotlin.ResultKt.b(r7)
                goto L3d
            L23:
                kotlin.ResultKt.b(r7)
                Ah.k r7 = Ah.k.this
                zh.c r1 = Ah.k.a(r7)
                Ah.k r7 = Ah.k.this
                Yi.a r7 = Ah.k.b(r7)
                r6.f542a = r1
                r6.f543b = r4
                java.lang.Object r7 = r7.c(r6)
                if (r7 != r0) goto L3d
                goto L4b
            L3d:
                com.meijer.mobile.authentication.core.model.BearerToken r7 = (com.meijer.mobile.authentication.core.model.BearerToken) r7
                int r5 = r6.f545d
                r6.f542a = r3
                r6.f543b = r2
                java.lang.Object r7 = r1.c(r7, r5, r6)
                if (r7 != r0) goto L4c
            L4b:
                return r0
            L4c:
                retrofit2.Response r7 = (retrofit2.Response) r7
                boolean r0 = r7.isSuccessful()
                if (r0 == 0) goto L62
                java.lang.Object r7 = r7.body()
                kotlin.jvm.internal.Intrinsics.g(r7)
                com.meijer.mobile.accounts.service.models.network.UpdateConfirmationResponseJson r7 = (com.meijer.mobile.accounts.service.models.network.UpdateConfirmationResponseJson) r7
                Eh.D r7 = Dh.b.E(r7, r3, r4, r3)
                return r7
            L62:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r7)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ah.k.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LEh/m;", "<anonymous>", "(Lmv/O;)LEh/m;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.ProfileDataSource$fetchEmailVerificationSpiffs$2", f = "ProfileDataSource.kt", l = {319, 319}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super EmailVerificationSpiffs>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f546a;

        /* renamed from: b, reason: collision with root package name */
        Object f547b;

        /* renamed from: c, reason: collision with root package name */
        int f548c;

        /* renamed from: d, reason: collision with root package name */
        int f549d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f550e;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = k.this.new d(continuation);
            dVar.f550e = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super EmailVerificationSpiffs> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
        
            if (r11 == r0) goto L25;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 233
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Ah.k.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LEh/f;", "<anonymous>", "(Lmv/O;)LEh/f;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.ProfileDataSource$getAndroidPayLoyaltyCardInfo$2", f = "ProfileDataSource.kt", l = {75, 75}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super AndroidPayLoyaltyCardInfoResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f552a;

        /* renamed from: b, reason: collision with root package name */
        int f553b;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super AndroidPayLoyaltyCardInfoResponse> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        
            if (r5 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r4.f553b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r5)
                goto L4a
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                java.lang.Object r1 = r4.f552a
                zh.j r1 = (zh.j) r1
                kotlin.ResultKt.b(r5)
                goto L3c
            L22:
                kotlin.ResultKt.b(r5)
                Ah.k r5 = Ah.k.this
                zh.j r1 = Ah.k.d(r5)
                Ah.k r5 = Ah.k.this
                Yi.a r5 = Ah.k.b(r5)
                r4.f552a = r1
                r4.f553b = r3
                java.lang.Object r5 = r5.c(r4)
                if (r5 != r0) goto L3c
                goto L49
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r5 = (com.meijer.mobile.authentication.core.model.BearerToken) r5
                r3 = 0
                r4.f552a = r3
                r4.f553b = r2
                java.lang.Object r5 = r1.d(r5, r4)
                if (r5 != r0) goto L4a
            L49:
                return r0
            L4a:
                retrofit2.Response r5 = (retrofit2.Response) r5
                boolean r0 = r5.isSuccessful()
                if (r0 == 0) goto L60
                java.lang.Object r5 = r5.body()
                kotlin.jvm.internal.Intrinsics.g(r5)
                com.meijer.mobile.accounts.service.models.network.AndroidPayLoyaltyCardInfoResponseJson r5 = (com.meijer.mobile.accounts.service.models.network.AndroidPayLoyaltyCardInfoResponseJson) r5
                Eh.f r5 = Dh.b.l(r5)
                return r5
            L60:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ah.k.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "LEh/k;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.ProfileDataSource$getCustomerPreferences$2", f = "ProfileDataSource.kt", l = {97, 97}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends CustomerPreference>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f555a;

        /* renamed from: b, reason: collision with root package name */
        int f556b;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends CustomerPreference>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<CustomerPreference>>) continuation);
        }

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k.this.new f(continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<CustomerPreference>> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        
            if (r5 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r4.f556b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r5)
                goto L4a
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                java.lang.Object r1 = r4.f555a
                zh.c r1 = (zh.c) r1
                kotlin.ResultKt.b(r5)
                goto L3c
            L22:
                kotlin.ResultKt.b(r5)
                Ah.k r5 = Ah.k.this
                zh.c r1 = Ah.k.a(r5)
                Ah.k r5 = Ah.k.this
                Yi.a r5 = Ah.k.b(r5)
                r4.f555a = r1
                r4.f556b = r3
                java.lang.Object r5 = r5.c(r4)
                if (r5 != r0) goto L3c
                goto L49
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r5 = (com.meijer.mobile.authentication.core.model.BearerToken) r5
                r3 = 0
                r4.f555a = r3
                r4.f556b = r2
                java.lang.Object r5 = r1.l(r5, r4)
                if (r5 != r0) goto L4a
            L49:
                return r0
            L4a:
                retrofit2.Response r5 = (retrofit2.Response) r5
                boolean r0 = r5.isSuccessful()
                if (r0 == 0) goto L84
                java.lang.Object r5 = r5.body()
                java.util.List r5 = (java.util.List) r5
                if (r5 != 0) goto L5e
                java.util.List r5 = kotlin.collections.CollectionsKt.m()
            L5e:
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 10
                int r1 = kotlin.collections.CollectionsKt.x(r5, r1)
                r0.<init>(r1)
                java.util.Iterator r5 = r5.iterator()
            L6f:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L83
                java.lang.Object r1 = r5.next()
                com.meijer.mobile.accounts.service.models.network.CustomerPreferenceJson r1 = (com.meijer.mobile.accounts.service.models.network.CustomerPreferenceJson) r1
                Eh.k r1 = Dh.b.e(r1)
                r0.add(r1)
                goto L6f
            L83:
                return r0
            L84:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ah.k.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.ProfileDataSource$getMperksBarcode$2", f = "ProfileDataSource.kt", l = {82, 82}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super String>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f558a;

        /* renamed from: b, reason: collision with root package name */
        int f559b;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super String> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
        
            if (r6 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r5.f559b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r6)
                goto L50
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f558a
                zh.c r1 = (zh.c) r1
                kotlin.ResultKt.b(r6)
                goto L3c
            L22:
                kotlin.ResultKt.b(r6)
                Ah.k r6 = Ah.k.this
                zh.c r1 = Ah.k.a(r6)
                Ah.k r6 = Ah.k.this
                Yi.a r6 = Ah.k.b(r6)
                r5.f558a = r1
                r5.f559b = r3
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L3c
                goto L4f
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r6 = (com.meijer.mobile.authentication.core.model.BearerToken) r6
                Ah.k r3 = Ah.k.this
                okhttp3.Headers r3 = Ah.k.c(r3)
                r4 = 0
                r5.f558a = r4
                r5.f559b = r2
                java.lang.Object r6 = r1.m(r6, r3, r5)
                if (r6 != r0) goto L50
            L4f:
                return r0
            L50:
                retrofit2.Response r6 = (retrofit2.Response) r6
                boolean r0 = r6.isSuccessful()
                if (r0 == 0) goto L66
                java.lang.Object r6 = r6.body()
                kotlin.jvm.internal.Intrinsics.g(r6)
                com.meijer.mobile.accounts.service.models.network.CustomerAccountPropertiesResponseJson r6 = (com.meijer.mobile.accounts.service.models.network.CustomerAccountPropertiesResponseJson) r6
                java.lang.String r6 = r6.getBarCodeImage()
                return r6
            L66:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ah.k.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "LFh/b;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.ProfileDataSource$getPreferenceDiscreteChoices$2", f = "ProfileDataSource.kt", l = {105, 105}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends DiscretePreferenceChoice>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f561a;

        /* renamed from: b, reason: collision with root package name */
        int f562b;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends DiscretePreferenceChoice>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<DiscretePreferenceChoice>>) continuation);
        }

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k.this.new h(continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<DiscretePreferenceChoice>> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        
            if (r5 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r4.f562b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r5)
                goto L4a
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                java.lang.Object r1 = r4.f561a
                zh.c r1 = (zh.c) r1
                kotlin.ResultKt.b(r5)
                goto L3c
            L22:
                kotlin.ResultKt.b(r5)
                Ah.k r5 = Ah.k.this
                zh.c r1 = Ah.k.a(r5)
                Ah.k r5 = Ah.k.this
                Yi.a r5 = Ah.k.b(r5)
                r4.f561a = r1
                r4.f562b = r3
                java.lang.Object r5 = r5.c(r4)
                if (r5 != r0) goto L3c
                goto L49
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r5 = (com.meijer.mobile.authentication.core.model.BearerToken) r5
                r3 = 0
                r4.f561a = r3
                r4.f562b = r2
                java.lang.Object r5 = r1.u(r5, r4)
                if (r5 != r0) goto L4a
            L49:
                return r0
            L4a:
                retrofit2.Response r5 = (retrofit2.Response) r5
                boolean r0 = r5.isSuccessful()
                if (r0 == 0) goto L84
                java.lang.Object r5 = r5.body()
                java.util.List r5 = (java.util.List) r5
                if (r5 != 0) goto L5e
                java.util.List r5 = kotlin.collections.CollectionsKt.m()
            L5e:
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 10
                int r1 = kotlin.collections.CollectionsKt.x(r5, r1)
                r0.<init>(r1)
                java.util.Iterator r5 = r5.iterator()
            L6f:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L83
                java.lang.Object r1 = r5.next()
                com.meijer.mobile.accounts.service.models.network.DiscretePreferenceChoiceJson r1 = (com.meijer.mobile.accounts.service.models.network.DiscretePreferenceChoiceJson) r1
                Fh.b r1 = Dh.b.f(r1)
                r0.add(r1)
                goto L6f
            L83:
                return r0
            L84:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ah.k.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LCs/a;", "<anonymous>", "(Lmv/O;)LCs/a;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.ProfileDataSource$getProfileInformation$2", f = "ProfileDataSource.kt", l = {68, 68}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super MeijerAccount>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f564a;

        /* renamed from: b, reason: collision with root package name */
        int f565b;

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super MeijerAccount> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        
            if (r5 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r4.f565b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r5)
                goto L4a
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                java.lang.Object r1 = r4.f564a
                zh.c r1 = (zh.c) r1
                kotlin.ResultKt.b(r5)
                goto L3c
            L22:
                kotlin.ResultKt.b(r5)
                Ah.k r5 = Ah.k.this
                zh.c r1 = Ah.k.a(r5)
                Ah.k r5 = Ah.k.this
                Yi.a r5 = Ah.k.b(r5)
                r4.f564a = r1
                r4.f565b = r3
                java.lang.Object r5 = r5.c(r4)
                if (r5 != r0) goto L3c
                goto L49
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r5 = (com.meijer.mobile.authentication.core.model.BearerToken) r5
                r3 = 0
                r4.f564a = r3
                r4.f565b = r2
                java.lang.Object r5 = r1.h(r5, r4)
                if (r5 != r0) goto L4a
            L49:
                return r0
            L4a:
                retrofit2.Response r5 = (retrofit2.Response) r5
                boolean r0 = r5.isSuccessful()
                if (r0 == 0) goto L60
                java.lang.Object r5 = r5.body()
                kotlin.jvm.internal.Intrinsics.g(r5)
                com.meijer.mobile.accounts.service.models.network.MeijerAccountJson r5 = (com.meijer.mobile.accounts.service.models.network.MeijerAccountJson) r5
                Cs.a r5 = Dh.b.t(r5)
                return r5
            L60:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ah.k.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LEh/J;", "<anonymous>", "(Lmv/O;)LEh/J;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.ProfileDataSource$getVehicleInformation$2", f = "ProfileDataSource.kt", l = {89, 89}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super VehicleInformation>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f567a;

        /* renamed from: b, reason: collision with root package name */
        int f568b;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super VehicleInformation> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        
            if (r6 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r5.f568b
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.ResultKt.b(r6)
                goto L4a
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                java.lang.Object r1 = r5.f567a
                zh.c r1 = (zh.c) r1
                kotlin.ResultKt.b(r6)
                goto L3d
            L23:
                kotlin.ResultKt.b(r6)
                Ah.k r6 = Ah.k.this
                zh.c r1 = Ah.k.a(r6)
                Ah.k r6 = Ah.k.this
                Yi.a r6 = Ah.k.b(r6)
                r5.f567a = r1
                r5.f568b = r3
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L3d
                goto L49
            L3d:
                com.meijer.mobile.authentication.core.model.BearerToken r6 = (com.meijer.mobile.authentication.core.model.BearerToken) r6
                r5.f567a = r4
                r5.f568b = r2
                java.lang.Object r6 = r1.p(r6, r5)
                if (r6 != r0) goto L4a
            L49:
                return r0
            L4a:
                retrofit2.Response r6 = (retrofit2.Response) r6
                boolean r0 = r6.isSuccessful()
                if (r0 == 0) goto L69
                java.lang.Object r6 = r6.body()
                com.meijer.mobile.accounts.service.models.network.VehicleInformationJson r6 = (com.meijer.mobile.accounts.service.models.network.VehicleInformationJson) r6
                if (r6 == 0) goto L61
                Eh.J r6 = Dh.b.F(r6)
                if (r6 == 0) goto L61
                return r6
            L61:
                Eh.J r6 = new Eh.J
                r0 = 0
                r1 = 3
                r6.<init>(r0, r4, r1, r4)
                return r6
            L69:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ah.k.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LEh/D;", "<anonymous>", "(Lmv/O;)LEh/D;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.ProfileDataSource$requestPasswordReset$2", f = "ProfileDataSource.kt", l = {310}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: Ah.k$k, reason: collision with other inner class name */
    static final class C0012k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super UpdateConfirmationResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f570a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f572c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0012k(String str, Continuation<? super C0012k> continuation) {
            super(2, continuation);
            this.f572c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k.this.new C0012k(this.f572c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super UpdateConfirmationResponse> continuation) {
            return ((C0012k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f570a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                zh.c cVar = k.this.accountsApi;
                ResetPasswordRequestJson resetPasswordRequestJson = new ResetPasswordRequestJson(this.f572c);
                this.f570a = 1;
                obj = cVar.j(resetPasswordRequestJson, this);
                if (obj == objF) {
                    return objF;
                }
            }
            Response response = (Response) obj;
            if (response.isSuccessful()) {
                Object objBody = response.body();
                Intrinsics.g(objBody);
                return Dh.b.D((UpdateConfirmationResponseJson) objBody, EnumC17080a.f160814p);
            }
            throw new HttpException(response);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LEh/D;", "<anonymous>", "(Lmv/O;)LEh/D;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.ProfileDataSource$updateAccount$2", f = "ProfileDataSource.kt", l = {220, 219}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super UpdateConfirmationResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f573a;

        /* renamed from: b, reason: collision with root package name */
        int f574b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ MeijerAccount f576d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(MeijerAccount meijerAccount, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f576d = meijerAccount;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k.this.new l(this.f576d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super UpdateConfirmationResponse> continuation) {
            return ((l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (r8 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r7.f574b
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1b
                if (r1 != r2) goto L13
                kotlin.ResultKt.b(r8)
                goto L51
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                java.lang.Object r1 = r7.f573a
                zh.c r1 = (zh.c) r1
                kotlin.ResultKt.b(r8)
                goto L3d
            L23:
                kotlin.ResultKt.b(r8)
                Ah.k r8 = Ah.k.this
                zh.c r1 = Ah.k.a(r8)
                Ah.k r8 = Ah.k.this
                Yi.a r8 = Ah.k.b(r8)
                r7.f573a = r1
                r7.f574b = r4
                java.lang.Object r8 = r8.c(r7)
                if (r8 != r0) goto L3d
                goto L50
            L3d:
                com.meijer.mobile.authentication.core.model.BearerToken r8 = (com.meijer.mobile.authentication.core.model.BearerToken) r8
                com.meijer.mobile.accounts.service.models.network.UpdateAccountRequest r5 = new com.meijer.mobile.accounts.service.models.network.UpdateAccountRequest
                Cs.a r6 = r7.f576d
                r5.<init>(r6)
                r7.f573a = r3
                r7.f574b = r2
                java.lang.Object r8 = r1.d(r8, r5, r7)
                if (r8 != r0) goto L51
            L50:
                return r0
            L51:
                retrofit2.Response r8 = (retrofit2.Response) r8
                boolean r0 = r8.isSuccessful()
                if (r0 == 0) goto L67
                java.lang.Object r8 = r8.body()
                kotlin.jvm.internal.Intrinsics.g(r8)
                com.meijer.mobile.accounts.service.models.network.UpdateConfirmationResponseJson r8 = (com.meijer.mobile.accounts.service.models.network.UpdateConfirmationResponseJson) r8
                Eh.D r8 = Dh.b.E(r8, r3, r4, r3)
                return r8
            L67:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ah.k.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LEh/D;", "<anonymous>", "(Lmv/O;)LEh/D;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.ProfileDataSource$updateCustomerPreference$2", f = "ProfileDataSource.kt", l = {249, 248}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class m extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super UpdateConfirmationResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f577a;

        /* renamed from: b, reason: collision with root package name */
        int f578b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ CustomerPreference f580d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(CustomerPreference customerPreference, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f580d = customerPreference;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k.this.new m(this.f580d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super UpdateConfirmationResponse> continuation) {
            return ((m) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
        
            if (r10 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r9.f578b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r10)
                goto L6b
            L12:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1a:
                java.lang.Object r1 = r9.f577a
                zh.c r1 = (zh.c) r1
                kotlin.ResultKt.b(r10)
                goto L3c
            L22:
                kotlin.ResultKt.b(r10)
                Ah.k r10 = Ah.k.this
                zh.c r1 = Ah.k.a(r10)
                Ah.k r10 = Ah.k.this
                Yi.a r10 = Ah.k.b(r10)
                r9.f577a = r1
                r9.f578b = r3
                java.lang.Object r10 = r10.c(r9)
                if (r10 != r0) goto L3c
                goto L6a
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r10 = (com.meijer.mobile.authentication.core.model.BearerToken) r10
                com.meijer.mobile.accounts.service.models.network.CustomerPreferenceUpdateRequest r3 = new com.meijer.mobile.accounts.service.models.network.CustomerPreferenceUpdateRequest
                Eh.k r4 = r9.f580d
                java.lang.String r4 = r4.getOwningProgramName()
                Eh.k r5 = r9.f580d
                java.lang.String r5 = r5.getPreferenceTypeName()
                Eh.k r6 = r9.f580d
                java.lang.String r6 = r6.getPreferenceValue()
                Ah.k r7 = Ah.k.this
                Cs.b r7 = Ah.k.f(r7)
                long r7 = r7.c()
                r3.<init>(r4, r5, r6, r7)
                r4 = 0
                r9.f577a = r4
                r9.f578b = r2
                java.lang.Object r10 = r1.g(r10, r3, r9)
                if (r10 != r0) goto L6b
            L6a:
                return r0
            L6b:
                retrofit2.Response r10 = (retrofit2.Response) r10
                boolean r0 = r10.isSuccessful()
                if (r0 == 0) goto L81
                java.lang.Object r10 = r10.body()
                kotlin.jvm.internal.Intrinsics.g(r10)
                com.meijer.mobile.accounts.service.models.network.CustomerPreferenceUpdateResponseJson r10 = (com.meijer.mobile.accounts.service.models.network.CustomerPreferenceUpdateResponseJson) r10
                Eh.D r10 = Dh.b.C(r10)
                return r10
            L81:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ah.k.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LFh/f;", "<anonymous>", "(Lmv/O;)LFh/f;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.ProfileDataSource$updateMperksPhone$2", f = "ProfileDataSource.kt", l = {164, 167, 166, 180, 190}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class n extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Fh.f>, Object> {

        /* renamed from: a, reason: collision with root package name */
        long f581a;

        /* renamed from: b, reason: collision with root package name */
        Object f582b;

        /* renamed from: c, reason: collision with root package name */
        int f583c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f585e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f586f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, boolean z10, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f585e = str;
            this.f586f = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k.this.new n(this.f585e, this.f586f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Fh.f> continuation) {
            return ((n) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x00f0, code lost:
        
            if (r3.m(r7, r19) == r1) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0104, code lost:
        
            if (r2 == r1) goto L37;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                Method dump skipped, instructions count: 285
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Ah.k.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LEh/D;", "<anonymous>", "(Lmv/O;)LEh/D;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.ProfileDataSource$updateMperksPin$2", f = "ProfileDataSource.kt", l = {117, 116}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class o extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super UpdateConfirmationResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f587a;

        /* renamed from: b, reason: collision with root package name */
        int f588b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f590d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f591e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f592f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, String str2, boolean z10, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f590d = str;
            this.f591e = str2;
            this.f592f = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k.this.new o(this.f590d, this.f591e, this.f592f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super UpdateConfirmationResponse> continuation) {
            return ((o) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
        
            if (r13 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r12.f588b
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1b
                if (r1 != r2) goto L13
                kotlin.ResultKt.b(r13)
                goto L69
            L13:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1b:
                java.lang.Object r1 = r12.f587a
                zh.c r1 = (zh.c) r1
                kotlin.ResultKt.b(r13)
                goto L3d
            L23:
                kotlin.ResultKt.b(r13)
                Ah.k r13 = Ah.k.this
                zh.c r1 = Ah.k.a(r13)
                Ah.k r13 = Ah.k.this
                Yi.a r13 = Ah.k.b(r13)
                r12.f587a = r1
                r12.f588b = r4
                java.lang.Object r13 = r13.c(r12)
                if (r13 != r0) goto L3d
                goto L68
            L3d:
                com.meijer.mobile.authentication.core.model.BearerToken r13 = (com.meijer.mobile.authentication.core.model.BearerToken) r13
                com.meijer.mobile.accounts.service.models.network.UpdateMperksPinRequest r5 = new com.meijer.mobile.accounts.service.models.network.UpdateMperksPinRequest
                Ah.k r6 = Ah.k.this
                Cs.b r6 = Ah.k.f(r6)
                long r6 = r6.c()
                Ah.k r8 = Ah.k.this
                Cs.b r8 = Ah.k.f(r8)
                java.lang.String r8 = r8.e()
                java.lang.String r9 = r12.f590d
                java.lang.String r10 = r12.f591e
                boolean r11 = r12.f592f
                r5.<init>(r6, r8, r9, r10, r11)
                r12.f587a = r3
                r12.f588b = r2
                java.lang.Object r13 = r1.q(r13, r5, r12)
                if (r13 != r0) goto L69
            L68:
                return r0
            L69:
                retrofit2.Response r13 = (retrofit2.Response) r13
                boolean r0 = r13.isSuccessful()
                if (r0 == 0) goto L7f
                java.lang.Object r13 = r13.body()
                kotlin.jvm.internal.Intrinsics.g(r13)
                com.meijer.mobile.accounts.service.models.network.UpdateConfirmationResponseJson r13 = (com.meijer.mobile.accounts.service.models.network.UpdateConfirmationResponseJson) r13
                Eh.D r13 = Dh.b.E(r13, r3, r4, r3)
                return r13
            L7f:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r13)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ah.k.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LEh/D;", "<anonymous>", "(Lmv/O;)LEh/D;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.ProfileDataSource$updatePassword$2", f = "ProfileDataSource.kt", l = {135, 134}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class p extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super UpdateConfirmationResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f593a;

        /* renamed from: b, reason: collision with root package name */
        int f594b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f596d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f597e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, String str2, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f596d = str;
            this.f597e = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k.this.new p(this.f596d, this.f597e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super UpdateConfirmationResponse> continuation) {
            return ((p) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
        
            if (r15 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r14 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r14.f594b
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1b
                if (r1 != r2) goto L13
                kotlin.ResultKt.b(r15)
                goto L60
            L13:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L1b:
                java.lang.Object r1 = r14.f593a
                zh.c r1 = (zh.c) r1
                kotlin.ResultKt.b(r15)
                goto L3d
            L23:
                kotlin.ResultKt.b(r15)
                Ah.k r15 = Ah.k.this
                zh.c r1 = Ah.k.a(r15)
                Ah.k r15 = Ah.k.this
                Yi.a r15 = Ah.k.b(r15)
                r14.f593a = r1
                r14.f594b = r4
                java.lang.Object r15 = r15.c(r14)
                if (r15 != r0) goto L3d
                goto L5f
            L3d:
                com.meijer.mobile.authentication.core.model.BearerToken r15 = (com.meijer.mobile.authentication.core.model.BearerToken) r15
                Ah.k r5 = Ah.k.this
                Cs.b r5 = Ah.k.f(r5)
                long r7 = r5.c()
                com.meijer.mobile.accounts.service.models.network.UpdatePasswordRequest r6 = new com.meijer.mobile.accounts.service.models.network.UpdatePasswordRequest
                java.lang.String r9 = r14.f596d
                java.lang.String r11 = r14.f597e
                r12 = 4
                r13 = 0
                r10 = 0
                r6.<init>(r7, r9, r10, r11, r12, r13)
                r14.f593a = r3
                r14.f594b = r2
                java.lang.Object r15 = r1.n(r15, r6, r14)
                if (r15 != r0) goto L60
            L5f:
                return r0
            L60:
                retrofit2.Response r15 = (retrofit2.Response) r15
                boolean r0 = r15.isSuccessful()
                if (r0 == 0) goto L76
                java.lang.Object r15 = r15.body()
                kotlin.jvm.internal.Intrinsics.g(r15)
                com.meijer.mobile.accounts.service.models.network.UpdateConfirmationResponseJson r15 = (com.meijer.mobile.accounts.service.models.network.UpdateConfirmationResponseJson) r15
                Eh.D r15 = Dh.b.E(r15, r3, r4, r3)
                return r15
            L76:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r15)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ah.k.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LEh/F;", "<anonymous>", "(Lmv/O;)LEh/F;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.ProfileDataSource$updateStore$2", f = "ProfileDataSource.kt", l = {229, 228}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class q extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super UpdateStoreResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f598a;

        /* renamed from: b, reason: collision with root package name */
        int f599b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f601d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(int i10, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f601d = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k.this.new q(this.f601d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super UpdateStoreResponse> continuation) {
            return ((q) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
        
            if (r8 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r7.f599b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r8)
                goto L5b
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                java.lang.Object r1 = r7.f598a
                zh.c r1 = (zh.c) r1
                kotlin.ResultKt.b(r8)
                goto L3c
            L22:
                kotlin.ResultKt.b(r8)
                Ah.k r8 = Ah.k.this
                zh.c r1 = Ah.k.a(r8)
                Ah.k r8 = Ah.k.this
                Yi.a r8 = Ah.k.b(r8)
                r7.f598a = r1
                r7.f599b = r3
                java.lang.Object r8 = r8.c(r7)
                if (r8 != r0) goto L3c
                goto L5a
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r8 = (com.meijer.mobile.authentication.core.model.BearerToken) r8
                com.meijer.mobile.accounts.service.models.network.UpdateStoreRequest r3 = new com.meijer.mobile.accounts.service.models.network.UpdateStoreRequest
                Ah.k r4 = Ah.k.this
                Cs.b r4 = Ah.k.f(r4)
                long r4 = r4.c()
                int r6 = r7.f601d
                r3.<init>(r4, r6)
                r4 = 0
                r7.f598a = r4
                r7.f599b = r2
                java.lang.Object r8 = r1.i(r8, r3, r7)
                if (r8 != r0) goto L5b
            L5a:
                return r0
            L5b:
                retrofit2.Response r8 = (retrofit2.Response) r8
                boolean r0 = r8.isSuccessful()
                if (r0 == 0) goto L71
                java.lang.Object r8 = r8.body()
                kotlin.jvm.internal.Intrinsics.g(r8)
                com.meijer.mobile.accounts.service.models.network.UpdateStoreResponseJson r8 = (com.meijer.mobile.accounts.service.models.network.UpdateStoreResponseJson) r8
                Eh.F r8 = Dh.b.q(r8)
                return r8
            L71:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ah.k.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LEh/D;", "<anonymous>", "(Lmv/O;)LEh/D;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.ProfileDataSource$updateVehicleInformation$2", f = "ProfileDataSource.kt", l = {282, 281}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class r extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super UpdateConfirmationResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f602a;

        /* renamed from: b, reason: collision with root package name */
        int f603b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f605d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f606e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(int i10, String str, Continuation<? super r> continuation) {
            super(2, continuation);
            this.f605d = i10;
            this.f606e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k.this.new r(this.f605d, this.f606e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super UpdateConfirmationResponse> continuation) {
            return ((r) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
        
            if (r11 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r10.f603b
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1b
                if (r1 != r2) goto L13
                kotlin.ResultKt.b(r11)
                goto L5d
            L13:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1b:
                java.lang.Object r1 = r10.f602a
                zh.c r1 = (zh.c) r1
                kotlin.ResultKt.b(r11)
                goto L3d
            L23:
                kotlin.ResultKt.b(r11)
                Ah.k r11 = Ah.k.this
                zh.c r1 = Ah.k.a(r11)
                Ah.k r11 = Ah.k.this
                Yi.a r11 = Ah.k.b(r11)
                r10.f602a = r1
                r10.f603b = r4
                java.lang.Object r11 = r11.c(r10)
                if (r11 != r0) goto L3d
                goto L5c
            L3d:
                com.meijer.mobile.authentication.core.model.BearerToken r11 = (com.meijer.mobile.authentication.core.model.BearerToken) r11
                com.meijer.mobile.accounts.service.models.network.CreateOrUpdateVehicleInformationRequest r5 = new com.meijer.mobile.accounts.service.models.network.CreateOrUpdateVehicleInformationRequest
                int r6 = r10.f605d
                Ah.k r7 = Ah.k.this
                Cs.b r7 = Ah.k.f(r7)
                long r7 = r7.c()
                java.lang.String r9 = r10.f606e
                r5.<init>(r6, r7, r9)
                r10.f602a = r3
                r10.f603b = r2
                java.lang.Object r11 = r1.k(r11, r5, r10)
                if (r11 != r0) goto L5d
            L5c:
                return r0
            L5d:
                retrofit2.Response r11 = (retrofit2.Response) r11
                boolean r0 = r11.isSuccessful()
                if (r0 == 0) goto L73
                java.lang.Object r11 = r11.body()
                kotlin.jvm.internal.Intrinsics.g(r11)
                com.meijer.mobile.accounts.service.models.network.UpdateConfirmationResponseJson r11 = (com.meijer.mobile.accounts.service.models.network.UpdateConfirmationResponseJson) r11
                Eh.D r11 = Dh.b.E(r11, r3, r4, r3)
                return r11
            L73:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ah.k.r.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LEh/G;", "<anonymous>", "(Lmv/O;)LEh/G;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.ProfileDataSource$validateEmailAvailability$2", f = "ProfileDataSource.kt", l = {211}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class s extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super ValidateEmailAvailability>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f607a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f609c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(String str, Continuation<? super s> continuation) {
            super(2, continuation);
            this.f609c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k.this.new s(this.f609c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super ValidateEmailAvailability> continuation) {
            return ((s) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f607a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                zh.c cVar = k.this.accountsApi;
                String str = this.f609c;
                this.f607a = 1;
                obj = cVar.f(str, this);
                if (obj == objF) {
                    return objF;
                }
            }
            Response response = (Response) obj;
            if (response.isSuccessful()) {
                Object objBody = response.body();
                Intrinsics.g(objBody);
                return Dh.b.r((ValidateEmailAvailabilityJson) objBody);
            }
            throw new HttpException(response);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LEh/H;", "<anonymous>", "(Lmv/O;)LEh/H;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.ProfileDataSource$validatePhoneAvailability$2", f = "ProfileDataSource.kt", l = {HttpResponseStatus.SUCCESS_NON_AUTHORITATIVE_INFORMATION}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class t extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super ValidatePhoneAvailability>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f610a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f612c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(String str, Continuation<? super t> continuation) {
            super(2, continuation);
            this.f612c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k.this.new t(this.f612c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super ValidatePhoneAvailability> continuation) {
            return ((t) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f610a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                zh.c cVar = k.this.accountsApi;
                String str = this.f612c;
                this.f610a = 1;
                obj = cVar.e(str, this);
                if (obj == objF) {
                    return objF;
                }
            }
            Response response = (Response) obj;
            if (response.isSuccessful()) {
                Object objBody = response.body();
                Intrinsics.g(objBody);
                return Dh.b.s((ValidatePhoneAvailabilityJson) objBody);
            }
            throw new HttpException(response);
        }
    }

    public k(zh.c accountsApi, zh.j legacyAccountsApi, Cs.b userProvider, Ah.j preferencesDataSource, Headers globalHeaders, Yi.a authTokenProvider, AbstractC15779K ioDispatcher) {
        Intrinsics.j(accountsApi, "accountsApi");
        Intrinsics.j(legacyAccountsApi, "legacyAccountsApi");
        Intrinsics.j(userProvider, "userProvider");
        Intrinsics.j(preferencesDataSource, "preferencesDataSource");
        Intrinsics.j(globalHeaders, "globalHeaders");
        Intrinsics.j(authTokenProvider, "authTokenProvider");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.accountsApi = accountsApi;
        this.legacyAccountsApi = legacyAccountsApi;
        this.userProvider = userProvider;
        this.preferencesDataSource = preferencesDataSource;
        this.globalHeaders = globalHeaders;
        this.authTokenProvider = authTokenProvider;
        this.ioDispatcher = ioDispatcher;
    }

    public static /* synthetic */ Object v(k kVar, String str, String str2, boolean z10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return kVar.u(str, str2, z10, continuation);
    }

    public final Object A(String str, Continuation<? super ValidatePhoneAvailability> continuation) {
        return C15805i.g(this.ioDispatcher, new t(str, null), continuation);
    }

    public final Object g(MeijerAccount meijerAccount, Continuation<? super UpdateConfirmationResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new a(meijerAccount, null), continuation);
    }

    public final Object h(int i10, String str, Continuation<? super UpdateConfirmationResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new b(i10, str, null), continuation);
    }

    public final Object i(int i10, Continuation<? super UpdateConfirmationResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new c(i10, null), continuation);
    }

    public final Object j(Continuation<? super EmailVerificationSpiffs> continuation) {
        return C15805i.g(this.ioDispatcher, new d(null), continuation);
    }

    public final Object k(Continuation<? super AndroidPayLoyaltyCardInfoResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new e(null), continuation);
    }

    public final Object l(Continuation<? super List<CustomerPreference>> continuation) throws UserNotAuthenticatedException {
        return C15805i.g(this.ioDispatcher, new f(null), continuation);
    }

    public final Object m(Continuation<? super String> continuation) {
        return C15805i.g(this.ioDispatcher, new g(null), continuation);
    }

    public final Object n(Continuation<? super List<DiscretePreferenceChoice>> continuation) throws UserNotAuthenticatedException {
        return C15805i.g(this.ioDispatcher, new h(null), continuation);
    }

    public final Object o(Continuation<? super MeijerAccount> continuation) {
        return C15805i.g(this.ioDispatcher, new i(null), continuation);
    }

    public final Object p(Continuation<? super VehicleInformation> continuation) throws UserNotAuthenticatedException {
        return C15805i.g(this.ioDispatcher, new j(null), continuation);
    }

    public final Object q(String str, Continuation<? super UpdateConfirmationResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new C0012k(str, null), continuation);
    }

    public final Object r(MeijerAccount meijerAccount, Continuation<? super UpdateConfirmationResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new l(meijerAccount, null), continuation);
    }

    public final Object s(CustomerPreference customerPreference, Continuation<? super UpdateConfirmationResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new m(customerPreference, null), continuation);
    }

    public final Object t(String str, boolean z10, Continuation<? super Fh.f> continuation) {
        return C15805i.g(this.ioDispatcher, new n(str, z10, null), continuation);
    }

    public final Object u(String str, String str2, boolean z10, Continuation<? super UpdateConfirmationResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new o(str, str2, z10, null), continuation);
    }

    public final Object w(String str, String str2, Continuation<? super UpdateConfirmationResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new p(str2, str, null), continuation);
    }

    public final Object x(int i10, Continuation<? super UpdateStoreResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new q(i10, null), continuation);
    }

    public final Object y(int i10, String str, Continuation<? super UpdateConfirmationResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new r(i10, str, null), continuation);
    }

    public final Object z(String str, Continuation<? super ValidateEmailAvailability> continuation) {
        return C15805i.g(this.ioDispatcher, new s(str, null), continuation);
    }
}
