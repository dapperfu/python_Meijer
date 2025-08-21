package Ch;

import Cs.MeijerAccount;
import Eh.AndroidPayLoyaltyCardInfoResponse;
import Eh.CustomerPreference;
import Eh.PasswordChangeInfo;
import Eh.ProfileInformation;
import Eh.UpdateConfirmationResponse;
import Eh.ValidateEmailAvailability;
import Eh.ValidatePhoneAvailability;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.P;
import pv.S;
import yo.C18336b;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u001bH\u0086@¢\u0006\u0004\b\u001c\u0010\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0086@¢\u0006\u0004\b\u001f\u0010\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001dH\u0086@¢\u0006\u0004\b!\u0010\u0016J \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0086@¢\u0006\u0004\b&\u0010'J\u0018\u0010)\u001a\u00020%2\u0006\u0010(\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b)\u0010*J\u001a\u0010+\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b+\u0010\u0013J\u0018\u0010.\u001a\u00020%2\u0006\u0010-\u001a\u00020,H\u0086@¢\u0006\u0004\b.\u0010/J \u00104\u001a\u0002032\u0006\u00100\u001a\u00020\"2\u0006\u00102\u001a\u000201H\u0086@¢\u0006\u0004\b4\u00105J\u0018\u00107\u001a\u0002062\u0006\u00100\u001a\u00020\"H\u0086@¢\u0006\u0004\b7\u00108J\u0018\u0010;\u001a\u00020:2\u0006\u00109\u001a\u00020\"H\u0086@¢\u0006\u0004\b;\u00108J\u0018\u0010<\u001a\u00020%2\u0006\u0010(\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b<\u0010*J\u0018\u0010>\u001a\u00020%2\u0006\u0010=\u001a\u00020\u001eH\u0086@¢\u0006\u0004\b>\u0010?J \u0010B\u001a\u00020%2\u0006\u0010@\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\"H\u0086@¢\u0006\u0004\bB\u0010CJ \u0010D\u001a\u00020%2\u0006\u0010@\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\"H\u0086@¢\u0006\u0004\bD\u0010CJ\u0018\u0010E\u001a\u00020%2\u0006\u0010@\u001a\u00020\u000eH\u0086@¢\u0006\u0004\bE\u0010\u0013J\u0018\u0010F\u001a\u00020%2\u0006\u00109\u001a\u00020\"H\u0086@¢\u0006\u0004\bF\u00108J$\u0010I\u001a\u00020H2\b\u0010(\u001a\u0004\u0018\u00010\u00142\b\u0010G\u001a\u0004\u0018\u00010\"H\u0086@¢\u0006\u0004\bI\u0010JJ$\u0010L\u001a\u00020K2\b\u0010(\u001a\u0004\u0018\u00010\u00142\b\u0010-\u001a\u0004\u0018\u00010,H\u0086@¢\u0006\u0004\bL\u0010MJ$\u0010R\u001a\u00020Q2\b\u0010N\u001a\u0004\u0018\u00010\"2\b\u0010P\u001a\u0004\u0018\u00010OH\u0086@¢\u0006\u0004\bR\u0010SR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010ZR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010[R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020]0\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010^R\u001d\u0010d\u001a\b\u0012\u0004\u0012\u00020]0`8\u0006¢\u0006\f\n\u0004\b\u0012\u0010a\u001a\u0004\bb\u0010c¨\u0006e"}, d2 = {"LCh/e;", "", "LAh/k;", "profileDataSource", "LZq/b;", "storeInfoRepository", "Lyo/k;", "userManager", "Lyo/f;", "storeManager", "Lyo/b;", "barcodeFileManager", "<init>", "(LAh/k;LZq/b;Lyo/k;Lyo/f;Lyo/b;)V", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "Lpk/h;", "g", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LCs/a;", "l", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LEh/f;", "h", "Ljava/io/File;", "j", "LEh/J;", "n", "", "LEh/k;", "i", "LFh/b;", "k", "", "currentPin", "newPin", "LEh/D;", "u", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "meijerAccount", "p", "(LCs/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "x", "LEh/n;", "passwordChangeInfo", "w", "(LEh/n;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newPhoneNumber", "", "activateViaText", "LFh/f;", "t", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LEh/H;", "A", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emailAddress", "LEh/G;", "z", "d", "customerPreference", "s", "(LEh/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "vehicleId", "vehicleDescription", "e", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "y", "f", "o", "phoneNumber", "LEh/C;", "r", "(LCs/a;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LEh/A;", "q", "(LCs/a;LEh/n;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectedSubstitution", "LEh/I;", "vehicleDescriptionChangeInfo", "LEh/E;", "v", "(Ljava/lang/String;LEh/I;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LAh/k;", "b", "LZq/b;", "c", "Lyo/k;", "Lyo/f;", "Lyo/b;", "Lpv/B;", "LEh/v;", "Lpv/B;", "_profileInformationFlow", "Lpv/P;", "Lpv/P;", "m", "()Lpv/P;", "profileInformationFlow", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ah.k profileDataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Zq.b storeInfoRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yo.f storeManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C18336b barcodeFileManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ProfileInformation> _profileInformationFlow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final P<ProfileInformation> profileInformationFlow;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.ProfileRepository", f = "ProfileRepository.kt", l = {68}, m = "fetchStoreInfo")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        int f4468a;

        /* renamed from: b, reason: collision with root package name */
        int f4469b;

        /* renamed from: c, reason: collision with root package name */
        int f4470c;

        /* renamed from: d, reason: collision with root package name */
        int f4471d;

        /* renamed from: e, reason: collision with root package name */
        int f4472e;

        /* renamed from: f, reason: collision with root package name */
        Object f4473f;

        /* renamed from: g, reason: collision with root package name */
        Object f4474g;

        /* renamed from: h, reason: collision with root package name */
        Object f4475h;

        /* renamed from: i, reason: collision with root package name */
        Object f4476i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f4477j;

        /* renamed from: l, reason: collision with root package name */
        int f4479l;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4477j = obj;
            this.f4479l |= Integer.MIN_VALUE;
            return e.this.g(0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.ProfileRepository", f = "ProfileRepository.kt", l = {117}, m = "getCustomerPreferences")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f4480a;

        /* renamed from: c, reason: collision with root package name */
        int f4482c;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4480a = obj;
            this.f4482c |= Integer.MIN_VALUE;
            return e.this.i(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.ProfileRepository", f = "ProfileRepository.kt", l = {102, 104}, m = "getMperksBarcode")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f4483a;

        /* renamed from: b, reason: collision with root package name */
        int f4484b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f4485c;

        /* renamed from: e, reason: collision with root package name */
        int f4487e;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4485c = obj;
            this.f4487e |= Integer.MIN_VALUE;
            return e.this.j(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.ProfileRepository", f = "ProfileRepository.kt", l = {125}, m = "getPreferenceDiscreteChoices")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f4488a;

        /* renamed from: c, reason: collision with root package name */
        int f4490c;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4488a = obj;
            this.f4490c |= Integer.MIN_VALUE;
            return e.this.k(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.ProfileRepository", f = "ProfileRepository.kt", l = {57, 61}, m = "getProfileInformation")
    /* renamed from: Ch.e$e, reason: collision with other inner class name */
    static final class C0090e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f4491a;

        /* renamed from: b, reason: collision with root package name */
        Object f4492b;

        /* renamed from: c, reason: collision with root package name */
        Object f4493c;

        /* renamed from: d, reason: collision with root package name */
        Object f4494d;

        /* renamed from: e, reason: collision with root package name */
        Object f4495e;

        /* renamed from: f, reason: collision with root package name */
        Object f4496f;

        /* renamed from: g, reason: collision with root package name */
        Object f4497g;

        /* renamed from: h, reason: collision with root package name */
        int f4498h;

        /* renamed from: i, reason: collision with root package name */
        int f4499i;

        /* renamed from: j, reason: collision with root package name */
        int f4500j;

        /* renamed from: k, reason: collision with root package name */
        int f4501k;

        /* renamed from: l, reason: collision with root package name */
        int f4502l;

        /* renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f4503m;

        /* renamed from: o, reason: collision with root package name */
        int f4505o;

        C0090e(Continuation<? super C0090e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4503m = obj;
            this.f4505o |= Integer.MIN_VALUE;
            return e.this.l(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.ProfileRepository", f = "ProfileRepository.kt", l = {109}, m = "getVehicleInformation")
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f4506a;

        /* renamed from: c, reason: collision with root package name */
        int f4508c;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4506a = obj;
            this.f4508c |= Integer.MIN_VALUE;
            return e.this.n(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.ProfileRepository", f = "ProfileRepository.kt", l = {244, 247, 251}, m = "updateAccountInfo")
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f4509a;

        /* renamed from: b, reason: collision with root package name */
        Object f4510b;

        /* renamed from: c, reason: collision with root package name */
        Object f4511c;

        /* renamed from: d, reason: collision with root package name */
        Object f4512d;

        /* renamed from: e, reason: collision with root package name */
        int f4513e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f4514f;

        /* renamed from: h, reason: collision with root package name */
        int f4516h;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4514f = obj;
            this.f4516h |= Integer.MIN_VALUE;
            return e.this.q(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.ProfileRepository", f = "ProfileRepository.kt", l = {224, 226, 233}, m = "updateBasicInfo")
    static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f4517a;

        /* renamed from: b, reason: collision with root package name */
        Object f4518b;

        /* renamed from: c, reason: collision with root package name */
        Object f4519c;

        /* renamed from: d, reason: collision with root package name */
        Object f4520d;

        /* renamed from: e, reason: collision with root package name */
        int f4521e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f4522f;

        /* renamed from: h, reason: collision with root package name */
        int f4524h;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4522f = obj;
            this.f4524h |= Integer.MIN_VALUE;
            return e.this.r(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.ProfileRepository", f = "ProfileRepository.kt", l = {134, 141}, m = "updateMperksPin")
    static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f4525a;

        /* renamed from: b, reason: collision with root package name */
        Object f4526b;

        /* renamed from: c, reason: collision with root package name */
        Object f4527c;

        /* renamed from: d, reason: collision with root package name */
        Object f4528d;

        /* renamed from: e, reason: collision with root package name */
        int f4529e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f4530f;

        /* renamed from: h, reason: collision with root package name */
        int f4532h;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4530f = obj;
            this.f4532h |= Integer.MIN_VALUE;
            return e.this.u(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.ProfileRepository", f = "ProfileRepository.kt", l = {262, 274, 281, 290, HttpResponseStatus.REDIRECTION_SEE_OTHER, HttpResponseStatus.REDIRECTION_NOT_MODIFIED, HttpResponseStatus.REDIRECTION_TEMPORARY_REDIRECT}, m = "updateOrderPreferences")
    static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f4533a;

        /* renamed from: b, reason: collision with root package name */
        Object f4534b;

        /* renamed from: c, reason: collision with root package name */
        Object f4535c;

        /* renamed from: d, reason: collision with root package name */
        Object f4536d;

        /* renamed from: e, reason: collision with root package name */
        int f4537e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f4538f;

        /* renamed from: h, reason: collision with root package name */
        int f4540h;

        j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4538f = obj;
            this.f4540h |= Integer.MIN_VALUE;
            return e.this.v(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.ProfileRepository", f = "ProfileRepository.kt", l = {152, 154}, m = "updateStore")
    static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        int f4541a;

        /* renamed from: b, reason: collision with root package name */
        int f4542b;

        /* renamed from: c, reason: collision with root package name */
        int f4543c;

        /* renamed from: d, reason: collision with root package name */
        int f4544d;

        /* renamed from: e, reason: collision with root package name */
        int f4545e;

        /* renamed from: f, reason: collision with root package name */
        Object f4546f;

        /* renamed from: g, reason: collision with root package name */
        Object f4547g;

        /* renamed from: h, reason: collision with root package name */
        Object f4548h;

        /* renamed from: i, reason: collision with root package name */
        Object f4549i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f4550j;

        /* renamed from: l, reason: collision with root package name */
        int f4552l;

        k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4550j = obj;
            this.f4552l |= Integer.MIN_VALUE;
            return e.this.x(0, this);
        }
    }

    public e(Ah.k profileDataSource, Zq.b storeInfoRepository, yo.k userManager, yo.f storeManager, C18336b barcodeFileManager) {
        Intrinsics.j(profileDataSource, "profileDataSource");
        Intrinsics.j(storeInfoRepository, "storeInfoRepository");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(storeManager, "storeManager");
        Intrinsics.j(barcodeFileManager, "barcodeFileManager");
        this.profileDataSource = profileDataSource;
        this.storeInfoRepository = storeInfoRepository;
        this.userManager = userManager;
        this.storeManager = storeManager;
        this.barcodeFileManager = barcodeFileManager;
        InterfaceC16549B<ProfileInformation> interfaceC16549BA = S.a(new ProfileInformation(null, 0, null, null, null, null, 63, null));
        this._profileInformationFlow = interfaceC16549BA;
        this.profileInformationFlow = C16563h.c(interfaceC16549BA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(int r18, kotlin.coroutines.Continuation<? super pk.StoreDetails> r19) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ch.e.g(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object A(String str, Continuation<? super ValidatePhoneAvailability> continuation) {
        return this.profileDataSource.A(str, continuation);
    }

    public final Object d(MeijerAccount meijerAccount, Continuation<? super UpdateConfirmationResponse> continuation) {
        return this.profileDataSource.g(meijerAccount, continuation);
    }

    public final Object e(int i10, String str, Continuation<? super UpdateConfirmationResponse> continuation) {
        return this.profileDataSource.h(i10, str, continuation);
    }

    public final Object f(int i10, Continuation<? super UpdateConfirmationResponse> continuation) {
        return this.profileDataSource.i(i10, continuation);
    }

    public final Object h(Continuation<? super AndroidPayLoyaltyCardInfoResponse> continuation) {
        return this.profileDataSource.k(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(kotlin.coroutines.Continuation<? super java.util.List<Eh.CustomerPreference>> r12) throws android.security.keystore.UserNotAuthenticatedException {
        /*
            r11 = this;
            boolean r0 = r12 instanceof Ch.e.b
            if (r0 == 0) goto L13
            r0 = r12
            Ch.e$b r0 = (Ch.e.b) r0
            int r1 = r0.f4482c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4482c = r1
            goto L18
        L13:
            Ch.e$b r0 = new Ch.e$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f4480a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f4482c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r12)
            goto L3f
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L31:
            kotlin.ResultKt.b(r12)
            Ah.k r12 = r11.profileDataSource
            r0.f4482c = r3
            java.lang.Object r12 = r12.l(r0)
            if (r12 != r1) goto L3f
            return r1
        L3f:
            r4 = r12
            java.util.List r4 = (java.util.List) r4
            pv.B<Eh.v> r9 = r11._profileInformationFlow
        L44:
            java.lang.Object r10 = r9.getValue()
            r0 = r10
            Eh.v r0 = (Eh.ProfileInformation) r0
            r7 = 55
            r8 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            Eh.v r0 = Eh.ProfileInformation.b(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = r9.e(r10, r0)
            if (r0 == 0) goto L44
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: Ch.e.i(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        if (r7 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(kotlin.coroutines.Continuation<? super java.io.File> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof Ch.e.c
            if (r0 == 0) goto L13
            r0 = r7
            Ch.e$c r0 = (Ch.e.c) r0
            int r1 = r0.f4487e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4487e = r1
            goto L18
        L13:
            Ch.e$c r0 = new Ch.e$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f4485c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f4487e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r0 = r0.f4483a
            java.lang.String r0 = (java.lang.String) r0
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L89
        L31:
            r7 = move-exception
            goto L90
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3b:
            java.lang.Object r2 = r0.f4483a
            Ch.e r2 = (Ch.e) r2
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L43
            goto L61
        L43:
            r7 = move-exception
            goto L68
        L45:
            kotlin.ResultKt.b(r7)
            yo.b r7 = r6.barcodeFileManager
            java.io.File r7 = r7.f()
            if (r7 != 0) goto L9f
            kotlin.Result$Companion r7 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L43
            Ah.k r7 = r6.profileDataSource     // Catch: java.lang.Throwable -> L43
            r0.f4483a = r6     // Catch: java.lang.Throwable -> L43
            r0.f4484b = r3     // Catch: java.lang.Throwable -> L43
            r0.f4487e = r5     // Catch: java.lang.Throwable -> L43
            java.lang.Object r7 = r7.m(r0)     // Catch: java.lang.Throwable -> L43
            if (r7 != r1) goto L61
            goto L88
        L61:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L43
            java.lang.Object r7 = kotlin.Result.b(r7)     // Catch: java.lang.Throwable -> L43
            goto L72
        L68:
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            java.lang.Object r7 = kotlin.ResultKt.a(r7)
            java.lang.Object r7 = kotlin.Result.b(r7)
        L72:
            boolean r2 = kotlin.Result.h(r7)
            if (r2 == 0) goto L96
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L31
            yo.b r2 = r6.barcodeFileManager     // Catch: java.lang.Throwable -> L31
            r0.f4483a = r7     // Catch: java.lang.Throwable -> L31
            r0.f4484b = r3     // Catch: java.lang.Throwable -> L31
            r0.f4487e = r4     // Catch: java.lang.Throwable -> L31
            java.lang.Object r7 = r2.e(r7, r0)     // Catch: java.lang.Throwable -> L31
            if (r7 != r1) goto L89
        L88:
            return r1
        L89:
            java.io.File r7 = (java.io.File) r7     // Catch: java.lang.Throwable -> L31
            java.lang.Object r7 = kotlin.Result.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L9a
        L90:
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r7 = kotlin.ResultKt.a(r7)
        L96:
            java.lang.Object r7 = kotlin.Result.b(r7)
        L9a:
            kotlin.ResultKt.b(r7)
            java.io.File r7 = (java.io.File) r7
        L9f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Ch.e.j(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(kotlin.coroutines.Continuation<? super java.util.List<Fh.DiscretePreferenceChoice>> r12) throws android.security.keystore.UserNotAuthenticatedException {
        /*
            r11 = this;
            boolean r0 = r12 instanceof Ch.e.d
            if (r0 == 0) goto L13
            r0 = r12
            Ch.e$d r0 = (Ch.e.d) r0
            int r1 = r0.f4490c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4490c = r1
            goto L18
        L13:
            Ch.e$d r0 = new Ch.e$d
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f4488a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f4490c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r12)
            goto L3f
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L31:
            kotlin.ResultKt.b(r12)
            Ah.k r12 = r11.profileDataSource
            r0.f4490c = r3
            java.lang.Object r12 = r12.n(r0)
            if (r12 != r1) goto L3f
            return r1
        L3f:
            r6 = r12
            java.util.List r6 = (java.util.List) r6
            pv.B<Eh.v> r9 = r11._profileInformationFlow
        L44:
            java.lang.Object r10 = r9.getValue()
            r0 = r10
            Eh.v r0 = (Eh.ProfileInformation) r0
            r7 = 31
            r8 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            Eh.v r0 = Eh.ProfileInformation.b(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = r9.e(r10, r0)
            if (r0 == 0) goto L44
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: Ch.e.k(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(kotlin.coroutines.Continuation<? super Cs.MeijerAccount> r15) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ch.e.l(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final P<ProfileInformation> m() {
        return this.profileInformationFlow;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(kotlin.coroutines.Continuation<? super Eh.VehicleInformation> r12) throws android.security.keystore.UserNotAuthenticatedException {
        /*
            r11 = this;
            boolean r0 = r12 instanceof Ch.e.f
            if (r0 == 0) goto L13
            r0 = r12
            Ch.e$f r0 = (Ch.e.f) r0
            int r1 = r0.f4508c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4508c = r1
            goto L18
        L13:
            Ch.e$f r0 = new Ch.e$f
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f4506a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f4508c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r12)
            goto L3f
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L31:
            kotlin.ResultKt.b(r12)
            Ah.k r12 = r11.profileDataSource
            r0.f4508c = r3
            java.lang.Object r12 = r12.p(r0)
            if (r12 != r1) goto L3f
            return r1
        L3f:
            r5 = r12
            Eh.J r5 = (Eh.VehicleInformation) r5
            pv.B<Eh.v> r9 = r11._profileInformationFlow
        L44:
            java.lang.Object r10 = r9.getValue()
            r0 = r10
            Eh.v r0 = (Eh.ProfileInformation) r0
            r7 = 47
            r8 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            Eh.v r0 = Eh.ProfileInformation.b(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = r9.e(r10, r0)
            if (r0 == 0) goto L44
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: Ch.e.n(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object o(String str, Continuation<? super UpdateConfirmationResponse> continuation) {
        return this.profileDataSource.q(str, continuation);
    }

    public final Object p(MeijerAccount meijerAccount, Continuation<? super UpdateConfirmationResponse> continuation) {
        return this.profileDataSource.r(meijerAccount, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        if (r12 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac A[PHI: r3 r10 r11 r12
      0x00ac: PHI (r3v1 Eh.D) = (r3v0 Eh.D), (r3v3 Eh.D) binds: [B:26:0x008e, B:31:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r10v5 Eh.D) = (r10v2 Eh.D), (r10v8 Eh.D) binds: [B:26:0x008e, B:31:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r11v6 Cs.a) = (r11v2 Cs.a), (r11v8 Cs.a) binds: [B:26:0x008e, B:31:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r12v9 Eh.n) = (r12v4 Eh.n), (r12v11 Eh.n) binds: [B:26:0x008e, B:31:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(Cs.MeijerAccount r10, Eh.PasswordChangeInfo r11, kotlin.coroutines.Continuation<? super Eh.UpdateAccountInformationResponse> r12) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ch.e.q(Cs.a, Eh.n, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        if (r12 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac A[PHI: r3 r10 r11 r12
      0x00ac: PHI (r3v1 Fh.f) = (r3v0 Fh.f), (r3v3 Fh.f) binds: [B:26:0x008e, B:31:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r10v5 Eh.D) = (r10v2 Eh.D), (r10v8 Eh.D) binds: [B:26:0x008e, B:31:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r11v6 Cs.a) = (r11v2 Cs.a), (r11v8 Cs.a) binds: [B:26:0x008e, B:31:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r12v9 java.lang.String) = (r12v4 java.lang.String), (r12v11 java.lang.String) binds: [B:26:0x008e, B:31:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(Cs.MeijerAccount r10, java.lang.String r11, kotlin.coroutines.Continuation<? super Eh.UpdateBasicInfoResponse> r12) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ch.e.r(Cs.a, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object s(CustomerPreference customerPreference, Continuation<? super UpdateConfirmationResponse> continuation) {
        return this.profileDataSource.s(customerPreference, continuation);
    }

    public final Object t(String str, boolean z10, Continuation<? super Fh.f> continuation) {
        return this.profileDataSource.t(str, z10, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.String r11, java.lang.String r12, kotlin.coroutines.Continuation<? super Eh.UpdateConfirmationResponse> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof Ch.e.i
            if (r0 == 0) goto L14
            r0 = r13
            Ch.e$i r0 = (Ch.e.i) r0
            int r1 = r0.f4532h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f4532h = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            Ch.e$i r0 = new Ch.e$i
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r5.f4530f
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r5.f4532h
            r8 = 2
            r2 = 1
            r9 = 0
            if (r1 == 0) goto L52
            if (r1 == r2) goto L45
            if (r1 != r8) goto L3d
            java.lang.Object r11 = r5.f4528d
            Eh.D r11 = (Eh.UpdateConfirmationResponse) r11
            java.lang.Object r11 = r5.f4527c
            java.lang.Object r12 = r5.f4526b
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r5.f4525a
            java.lang.String r12 = (java.lang.String) r12
            kotlin.ResultKt.b(r13)
            goto La3
        L3d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L45:
            java.lang.Object r11 = r5.f4526b
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r5.f4525a
            java.lang.String r11 = (java.lang.String) r11
            kotlin.ResultKt.b(r13)
            goto L6b
        L52:
            kotlin.ResultKt.b(r13)
            Ah.k r1 = r10.profileDataSource
            r5.f4525a = r11
            r5.f4526b = r12
            r5.f4532h = r2
            r4 = 0
            r6 = 4
            r7 = 0
            r2 = r11
            r3 = r12
            java.lang.Object r13 = Ah.k.v(r1, r2, r3, r4, r5, r6, r7)
            if (r13 != r0) goto L69
            goto La1
        L69:
            r11 = r2
            r12 = r3
        L6b:
            r1 = r13
            Eh.D r1 = (Eh.UpdateConfirmationResponse) r1
            boolean r2 = r1.getIsSuccess()
            if (r2 != 0) goto L8f
            qw.a$a r11 = qw.a.INSTANCE
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            sk.a r0 = r1.getErrorType()
            if (r0 == 0) goto L83
            java.lang.String r0 = r0.getServiceErrorString()
            goto L84
        L83:
            r0 = 0
        L84:
            r12.<init>(r0)
            java.lang.String r0 = "Failed to update PIN."
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r11.u(r12, r0, r1)
            return r13
        L8f:
            r5.f4525a = r11
            r5.f4526b = r12
            r5.f4527c = r13
            r5.f4528d = r1
            r5.f4529e = r9
            r5.f4532h = r8
            java.lang.Object r11 = r10.l(r5)
            if (r11 != r0) goto La2
        La1:
            return r0
        La2:
            r11 = r13
        La3:
            qw.a$a r12 = qw.a.INSTANCE
            java.lang.String r13 = "Customer successfully changed PIN."
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r12.k(r13, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Ch.e.u(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e8, code lost:
    
        if (r10 == r1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01f1, code lost:
    
        if (k(r0) != r1) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bd A[PHI: r3 r8 r9 r10
      0x01bd: PHI (r3v8 Eh.D) = (r3v0 Eh.D), (r3v0 Eh.D), (r3v0 Eh.D), (r3v0 Eh.D), (r3v0 Eh.D), (r3v0 Eh.D), (r3v10 Eh.D) binds: [B:27:0x00f6, B:58:0x0173, B:60:0x0179, B:63:0x0180, B:65:0x0186, B:68:0x0195, B:42:0x0131] A[DONT_GENERATE, DONT_INLINE]
      0x01bd: PHI (r8v16 Eh.D) = (r8v2 Eh.D), (r8v2 Eh.D), (r8v2 Eh.D), (r8v2 Eh.D), (r8v2 Eh.D), (r8v2 Eh.D), (r8v22 Eh.D) binds: [B:27:0x00f6, B:58:0x0173, B:60:0x0179, B:63:0x0180, B:65:0x0186, B:68:0x0195, B:42:0x0131] A[DONT_GENERATE, DONT_INLINE]
      0x01bd: PHI (r9v20 java.lang.String) = 
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
      (r9v23 java.lang.String)
     binds: [B:27:0x00f6, B:58:0x0173, B:60:0x0179, B:63:0x0180, B:65:0x0186, B:68:0x0195, B:42:0x0131] A[DONT_GENERATE, DONT_INLINE]
      0x01bd: PHI (r10v14 Eh.I) = (r10v5 Eh.I), (r10v5 Eh.I), (r10v5 Eh.I), (r10v5 Eh.I), (r10v5 Eh.I), (r10v5 Eh.I), (r10v15 Eh.I) binds: [B:27:0x00f6, B:58:0x0173, B:60:0x0179, B:63:0x0180, B:65:0x0186, B:68:0x0195, B:42:0x0131] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.String r8, Eh.VehicleDescriptionChangeInfo r9, kotlin.coroutines.Continuation<? super Eh.UpdateOrderPreferencesResponse> r10) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ch.e.v(java.lang.String, Eh.I, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object w(PasswordChangeInfo passwordChangeInfo, Continuation<? super UpdateConfirmationResponse> continuation) {
        return this.profileDataSource.w(passwordChangeInfo.getCurrentPassword(), passwordChangeInfo.getNewPassword(), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
    
        if (r8 == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(int r7, kotlin.coroutines.Continuation<? super pk.StoreDetails> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof Ch.e.k
            if (r0 == 0) goto L13
            r0 = r8
            Ch.e$k r0 = (Ch.e.k) r0
            int r1 = r0.f4552l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4552l = r1
            goto L18
        L13:
            Ch.e$k r0 = new Ch.e$k
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f4550j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f4552l
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L52
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.f4546f
            Eh.F r7 = (Eh.UpdateStoreResponse) r7
            kotlin.ResultKt.b(r8)
            goto Ld1
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            int r7 = r0.f4541a
            java.lang.Object r2 = r0.f4549i
            Ch.e r2 = (Ch.e) r2
            java.lang.Object r2 = r0.f4548h
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r2 = r0.f4547g
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r2 = r0.f4546f
            Ch.e r2 = (Ch.e) r2
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Exception -> L50
            goto L76
        L50:
            r8 = move-exception
            goto L7b
        L52:
            kotlin.ResultKt.b(r8)
            kotlin.Result$Companion r8 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L50
            Ah.k r8 = b(r6)     // Catch: java.lang.Exception -> L50
            r0.f4546f = r6     // Catch: java.lang.Exception -> L50
            r0.f4547g = r0     // Catch: java.lang.Exception -> L50
            r0.f4548h = r0     // Catch: java.lang.Exception -> L50
            r0.f4549i = r6     // Catch: java.lang.Exception -> L50
            r0.f4541a = r7     // Catch: java.lang.Exception -> L50
            r0.f4542b = r5     // Catch: java.lang.Exception -> L50
            r0.f4543c = r5     // Catch: java.lang.Exception -> L50
            r0.f4544d = r5     // Catch: java.lang.Exception -> L50
            r0.f4545e = r5     // Catch: java.lang.Exception -> L50
            r0.f4552l = r4     // Catch: java.lang.Exception -> L50
            java.lang.Object r8 = r8.x(r7, r0)     // Catch: java.lang.Exception -> L50
            if (r8 != r1) goto L76
            goto Ld0
        L76:
            java.lang.Object r8 = kotlin.Result.b(r8)     // Catch: java.lang.Exception -> L50
            goto L8c
        L7b:
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            mv.E0.i(r2)
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            java.lang.Object r8 = kotlin.ResultKt.a(r8)
            java.lang.Object r8 = kotlin.Result.b(r8)
        L8c:
            boolean r2 = kotlin.Result.h(r8)
            if (r2 == 0) goto Laf
            Eh.F r8 = (Eh.UpdateStoreResponse) r8     // Catch: java.lang.Throwable -> L9f
            boolean r2 = r8.getSuccess()     // Catch: java.lang.Throwable -> L9f
            if (r2 == 0) goto La1
            java.lang.Object r8 = kotlin.Result.b(r8)     // Catch: java.lang.Throwable -> L9f
            goto Lb3
        L9f:
            r8 = move-exception
            goto La9
        La1:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L9f
            java.lang.String r2 = "Failed to update home store."
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L9f
            throw r8     // Catch: java.lang.Throwable -> L9f
        La9:
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            java.lang.Object r8 = kotlin.ResultKt.a(r8)
        Laf:
            java.lang.Object r8 = kotlin.Result.b(r8)
        Lb3:
            boolean r2 = kotlin.Result.h(r8)
            if (r2 == 0) goto Ld3
            Eh.F r8 = (Eh.UpdateStoreResponse) r8
            r0.f4546f = r8
            r8 = 0
            r0.f4547g = r8
            r0.f4548h = r8
            r0.f4549i = r8
            r0.f4541a = r7
            r0.f4542b = r5
            r0.f4552l = r3
            java.lang.Object r8 = r6.g(r7, r0)
            if (r8 != r1) goto Ld1
        Ld0:
            return r1
        Ld1:
            pk.h r8 = (pk.StoreDetails) r8
        Ld3:
            java.lang.Object r7 = kotlin.Result.b(r8)
            kotlin.ResultKt.b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Ch.e.x(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object y(int i10, String str, Continuation<? super UpdateConfirmationResponse> continuation) {
        return this.profileDataSource.y(i10, str, continuation);
    }

    public final Object z(String str, Continuation<? super ValidateEmailAvailability> continuation) {
        return this.profileDataSource.z(str, continuation);
    }
}
