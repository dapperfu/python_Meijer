package Bh;

import Cs.MeijerAccount;
import Dh.AndroidPayLoyaltyCardInfoResponse;
import Dh.CustomerPreference;
import Dh.PasswordChangeInfo;
import Dh.ProfileInformation;
import Dh.UpdateConfirmationResponse;
import Dh.ValidateEmailAvailability;
import Dh.ValidatePhoneAvailability;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.P;
import tv.S;
import yo.C18265b;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u0086@¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u001bH\u0086@¢\u0006\u0004\b\u001c\u0010\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0086@¢\u0006\u0004\b\u001f\u0010\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001dH\u0086@¢\u0006\u0004\b!\u0010\u0016J \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0086@¢\u0006\u0004\b&\u0010'J\u0018\u0010)\u001a\u00020%2\u0006\u0010(\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b)\u0010*J\u001a\u0010+\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b+\u0010\u0013J\u0018\u0010.\u001a\u00020%2\u0006\u0010-\u001a\u00020,H\u0086@¢\u0006\u0004\b.\u0010/J \u00104\u001a\u0002032\u0006\u00100\u001a\u00020\"2\u0006\u00102\u001a\u000201H\u0086@¢\u0006\u0004\b4\u00105J\u0018\u00107\u001a\u0002062\u0006\u00100\u001a\u00020\"H\u0086@¢\u0006\u0004\b7\u00108J\u0018\u0010;\u001a\u00020:2\u0006\u00109\u001a\u00020\"H\u0086@¢\u0006\u0004\b;\u00108J\u0018\u0010<\u001a\u00020%2\u0006\u0010(\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b<\u0010*J\u0018\u0010>\u001a\u00020%2\u0006\u0010=\u001a\u00020\u001eH\u0086@¢\u0006\u0004\b>\u0010?J \u0010B\u001a\u00020%2\u0006\u0010@\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\"H\u0086@¢\u0006\u0004\bB\u0010CJ \u0010D\u001a\u00020%2\u0006\u0010@\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\"H\u0086@¢\u0006\u0004\bD\u0010CJ\u0018\u0010E\u001a\u00020%2\u0006\u0010@\u001a\u00020\u000eH\u0086@¢\u0006\u0004\bE\u0010\u0013J\u0018\u0010F\u001a\u00020%2\u0006\u00109\u001a\u00020\"H\u0086@¢\u0006\u0004\bF\u00108J$\u0010I\u001a\u00020H2\b\u0010(\u001a\u0004\u0018\u00010\u00142\b\u0010G\u001a\u0004\u0018\u00010\"H\u0086@¢\u0006\u0004\bI\u0010JJ$\u0010L\u001a\u00020K2\b\u0010(\u001a\u0004\u0018\u00010\u00142\b\u0010-\u001a\u0004\u0018\u00010,H\u0086@¢\u0006\u0004\bL\u0010MJ$\u0010R\u001a\u00020Q2\b\u0010N\u001a\u0004\u0018\u00010\"2\b\u0010P\u001a\u0004\u0018\u00010OH\u0086@¢\u0006\u0004\bR\u0010SR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010ZR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010[R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020]0\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010^R\u001d\u0010d\u001a\b\u0012\u0004\u0012\u00020]0`8\u0006¢\u0006\f\n\u0004\b\u0012\u0010a\u001a\u0004\bb\u0010c¨\u0006e"}, d2 = {"LBh/e;", "", "Lzh/k;", "profileDataSource", "LZq/b;", "storeInfoRepository", "Lyo/k;", "userManager", "Lyo/f;", "storeManager", "Lyo/b;", "barcodeFileManager", "<init>", "(Lzh/k;LZq/b;Lyo/k;Lyo/f;Lyo/b;)V", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "Lok/h;", "g", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LCs/a;", "l", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LDh/f;", "h", "Ljava/io/File;", "j", "LDh/I;", "n", "", "LDh/k;", "i", "LEh/b;", "k", "", "currentPin", "newPin", "LDh/C;", "u", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "meijerAccount", "p", "(LCs/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "x", "LDh/n;", "passwordChangeInfo", "w", "(LDh/n;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newPhoneNumber", "", "activateViaText", "LEh/f;", "t", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LDh/G;", "A", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emailAddress", "LDh/F;", "z", "d", "customerPreference", "s", "(LDh/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "vehicleId", "vehicleDescription", "e", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "y", "f", "o", "phoneNumber", "LDh/B;", "r", "(LCs/a;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LDh/A;", "q", "(LCs/a;LDh/n;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectedSubstitution", "LDh/H;", "vehicleDescriptionChangeInfo", "LDh/D;", "v", "(Ljava/lang/String;LDh/H;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lzh/k;", "b", "LZq/b;", "c", "Lyo/k;", "Lyo/f;", "Lyo/b;", "Ltv/B;", "LDh/v;", "Ltv/B;", "_profileInformationFlow", "Ltv/P;", "Ltv/P;", "m", "()Ltv/P;", "profileInformationFlow", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final zh.k profileDataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Zq.b storeInfoRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yo.f storeManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C18265b barcodeFileManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ProfileInformation> _profileInformationFlow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final P<ProfileInformation> profileInformationFlow;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.ProfileRepository", f = "ProfileRepository.kt", l = {68}, m = "fetchStoreInfo")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        int f2423a;

        /* renamed from: b, reason: collision with root package name */
        int f2424b;

        /* renamed from: c, reason: collision with root package name */
        int f2425c;

        /* renamed from: d, reason: collision with root package name */
        int f2426d;

        /* renamed from: e, reason: collision with root package name */
        int f2427e;

        /* renamed from: f, reason: collision with root package name */
        Object f2428f;

        /* renamed from: g, reason: collision with root package name */
        Object f2429g;

        /* renamed from: h, reason: collision with root package name */
        Object f2430h;

        /* renamed from: i, reason: collision with root package name */
        Object f2431i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f2432j;

        /* renamed from: l, reason: collision with root package name */
        int f2434l;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2432j = obj;
            this.f2434l |= Integer.MIN_VALUE;
            return e.this.g(0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.ProfileRepository", f = "ProfileRepository.kt", l = {117}, m = "getCustomerPreferences")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f2435a;

        /* renamed from: c, reason: collision with root package name */
        int f2437c;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2435a = obj;
            this.f2437c |= Integer.MIN_VALUE;
            return e.this.i(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.ProfileRepository", f = "ProfileRepository.kt", l = {102, 104}, m = "getMperksBarcode")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f2438a;

        /* renamed from: b, reason: collision with root package name */
        int f2439b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f2440c;

        /* renamed from: e, reason: collision with root package name */
        int f2442e;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2440c = obj;
            this.f2442e |= Integer.MIN_VALUE;
            return e.this.j(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.ProfileRepository", f = "ProfileRepository.kt", l = {125}, m = "getPreferenceDiscreteChoices")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f2443a;

        /* renamed from: c, reason: collision with root package name */
        int f2445c;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2443a = obj;
            this.f2445c |= Integer.MIN_VALUE;
            return e.this.k(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.ProfileRepository", f = "ProfileRepository.kt", l = {57, 61}, m = "getProfileInformation")
    /* renamed from: Bh.e$e, reason: collision with other inner class name */
    static final class C0052e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f2446a;

        /* renamed from: b, reason: collision with root package name */
        Object f2447b;

        /* renamed from: c, reason: collision with root package name */
        Object f2448c;

        /* renamed from: d, reason: collision with root package name */
        Object f2449d;

        /* renamed from: e, reason: collision with root package name */
        Object f2450e;

        /* renamed from: f, reason: collision with root package name */
        Object f2451f;

        /* renamed from: g, reason: collision with root package name */
        Object f2452g;

        /* renamed from: h, reason: collision with root package name */
        int f2453h;

        /* renamed from: i, reason: collision with root package name */
        int f2454i;

        /* renamed from: j, reason: collision with root package name */
        int f2455j;

        /* renamed from: k, reason: collision with root package name */
        int f2456k;

        /* renamed from: l, reason: collision with root package name */
        int f2457l;

        /* renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f2458m;

        /* renamed from: o, reason: collision with root package name */
        int f2460o;

        C0052e(Continuation<? super C0052e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2458m = obj;
            this.f2460o |= Integer.MIN_VALUE;
            return e.this.l(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.ProfileRepository", f = "ProfileRepository.kt", l = {109}, m = "getVehicleInformation")
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f2461a;

        /* renamed from: c, reason: collision with root package name */
        int f2463c;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2461a = obj;
            this.f2463c |= Integer.MIN_VALUE;
            return e.this.n(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.ProfileRepository", f = "ProfileRepository.kt", l = {244, 247, 251}, m = "updateAccountInfo")
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f2464a;

        /* renamed from: b, reason: collision with root package name */
        Object f2465b;

        /* renamed from: c, reason: collision with root package name */
        Object f2466c;

        /* renamed from: d, reason: collision with root package name */
        Object f2467d;

        /* renamed from: e, reason: collision with root package name */
        int f2468e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f2469f;

        /* renamed from: h, reason: collision with root package name */
        int f2471h;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2469f = obj;
            this.f2471h |= Integer.MIN_VALUE;
            return e.this.q(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.ProfileRepository", f = "ProfileRepository.kt", l = {224, 226, 233}, m = "updateBasicInfo")
    static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f2472a;

        /* renamed from: b, reason: collision with root package name */
        Object f2473b;

        /* renamed from: c, reason: collision with root package name */
        Object f2474c;

        /* renamed from: d, reason: collision with root package name */
        Object f2475d;

        /* renamed from: e, reason: collision with root package name */
        int f2476e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f2477f;

        /* renamed from: h, reason: collision with root package name */
        int f2479h;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2477f = obj;
            this.f2479h |= Integer.MIN_VALUE;
            return e.this.r(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.ProfileRepository", f = "ProfileRepository.kt", l = {134, 141}, m = "updateMperksPin")
    static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f2480a;

        /* renamed from: b, reason: collision with root package name */
        Object f2481b;

        /* renamed from: c, reason: collision with root package name */
        Object f2482c;

        /* renamed from: d, reason: collision with root package name */
        Object f2483d;

        /* renamed from: e, reason: collision with root package name */
        int f2484e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f2485f;

        /* renamed from: h, reason: collision with root package name */
        int f2487h;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2485f = obj;
            this.f2487h |= Integer.MIN_VALUE;
            return e.this.u(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.ProfileRepository", f = "ProfileRepository.kt", l = {262, 274, 281, 290, HttpResponseStatus.REDIRECTION_SEE_OTHER, HttpResponseStatus.REDIRECTION_NOT_MODIFIED, HttpResponseStatus.REDIRECTION_TEMPORARY_REDIRECT}, m = "updateOrderPreferences")
    static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f2488a;

        /* renamed from: b, reason: collision with root package name */
        Object f2489b;

        /* renamed from: c, reason: collision with root package name */
        Object f2490c;

        /* renamed from: d, reason: collision with root package name */
        Object f2491d;

        /* renamed from: e, reason: collision with root package name */
        int f2492e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f2493f;

        /* renamed from: h, reason: collision with root package name */
        int f2495h;

        j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2493f = obj;
            this.f2495h |= Integer.MIN_VALUE;
            return e.this.v(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.domain.ProfileRepository", f = "ProfileRepository.kt", l = {152, 154}, m = "updateStore")
    static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        int f2496a;

        /* renamed from: b, reason: collision with root package name */
        int f2497b;

        /* renamed from: c, reason: collision with root package name */
        int f2498c;

        /* renamed from: d, reason: collision with root package name */
        int f2499d;

        /* renamed from: e, reason: collision with root package name */
        int f2500e;

        /* renamed from: f, reason: collision with root package name */
        Object f2501f;

        /* renamed from: g, reason: collision with root package name */
        Object f2502g;

        /* renamed from: h, reason: collision with root package name */
        Object f2503h;

        /* renamed from: i, reason: collision with root package name */
        Object f2504i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f2505j;

        /* renamed from: l, reason: collision with root package name */
        int f2507l;

        k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2505j = obj;
            this.f2507l |= Integer.MIN_VALUE;
            return e.this.x(0, this);
        }
    }

    public e(zh.k profileDataSource, Zq.b storeInfoRepository, yo.k userManager, yo.f storeManager, C18265b barcodeFileManager) {
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
        InterfaceC17140B<ProfileInformation> interfaceC17140BA = S.a(new ProfileInformation(null, 0, null, null, null, null, 63, null));
        this._profileInformationFlow = interfaceC17140BA;
        this.profileInformationFlow = C17154h.c(interfaceC17140BA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(int r18, kotlin.coroutines.Continuation<? super ok.StoreDetails> r19) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bh.e.g(int, kotlin.coroutines.Continuation):java.lang.Object");
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
    public final java.lang.Object i(kotlin.coroutines.Continuation<? super java.util.List<Dh.CustomerPreference>> r12) throws android.security.keystore.UserNotAuthenticatedException {
        /*
            r11 = this;
            boolean r0 = r12 instanceof Bh.e.b
            if (r0 == 0) goto L13
            r0 = r12
            Bh.e$b r0 = (Bh.e.b) r0
            int r1 = r0.f2437c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2437c = r1
            goto L18
        L13:
            Bh.e$b r0 = new Bh.e$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f2435a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f2437c
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
            zh.k r12 = r11.profileDataSource
            r0.f2437c = r3
            java.lang.Object r12 = r12.l(r0)
            if (r12 != r1) goto L3f
            return r1
        L3f:
            r4 = r12
            java.util.List r4 = (java.util.List) r4
            tv.B<Dh.v> r9 = r11._profileInformationFlow
        L44:
            java.lang.Object r10 = r9.getValue()
            r0 = r10
            Dh.v r0 = (Dh.ProfileInformation) r0
            r7 = 55
            r8 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            Dh.v r0 = Dh.ProfileInformation.b(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = r9.e(r10, r0)
            if (r0 == 0) goto L44
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: Bh.e.i(kotlin.coroutines.Continuation):java.lang.Object");
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
            boolean r0 = r7 instanceof Bh.e.c
            if (r0 == 0) goto L13
            r0 = r7
            Bh.e$c r0 = (Bh.e.c) r0
            int r1 = r0.f2442e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2442e = r1
            goto L18
        L13:
            Bh.e$c r0 = new Bh.e$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f2440c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f2442e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r0 = r0.f2438a
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
            java.lang.Object r2 = r0.f2438a
            Bh.e r2 = (Bh.e) r2
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
            zh.k r7 = r6.profileDataSource     // Catch: java.lang.Throwable -> L43
            r0.f2438a = r6     // Catch: java.lang.Throwable -> L43
            r0.f2439b = r3     // Catch: java.lang.Throwable -> L43
            r0.f2442e = r5     // Catch: java.lang.Throwable -> L43
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
            r0.f2438a = r7     // Catch: java.lang.Throwable -> L31
            r0.f2439b = r3     // Catch: java.lang.Throwable -> L31
            r0.f2442e = r4     // Catch: java.lang.Throwable -> L31
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
        throw new UnsupportedOperationException("Method not decompiled: Bh.e.j(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(kotlin.coroutines.Continuation<? super java.util.List<Eh.DiscretePreferenceChoice>> r12) throws android.security.keystore.UserNotAuthenticatedException {
        /*
            r11 = this;
            boolean r0 = r12 instanceof Bh.e.d
            if (r0 == 0) goto L13
            r0 = r12
            Bh.e$d r0 = (Bh.e.d) r0
            int r1 = r0.f2445c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2445c = r1
            goto L18
        L13:
            Bh.e$d r0 = new Bh.e$d
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f2443a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f2445c
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
            zh.k r12 = r11.profileDataSource
            r0.f2445c = r3
            java.lang.Object r12 = r12.n(r0)
            if (r12 != r1) goto L3f
            return r1
        L3f:
            r6 = r12
            java.util.List r6 = (java.util.List) r6
            tv.B<Dh.v> r9 = r11._profileInformationFlow
        L44:
            java.lang.Object r10 = r9.getValue()
            r0 = r10
            Dh.v r0 = (Dh.ProfileInformation) r0
            r7 = 31
            r8 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            Dh.v r0 = Dh.ProfileInformation.b(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = r9.e(r10, r0)
            if (r0 == 0) goto L44
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: Bh.e.k(kotlin.coroutines.Continuation):java.lang.Object");
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
        throw new UnsupportedOperationException("Method not decompiled: Bh.e.l(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final P<ProfileInformation> m() {
        return this.profileInformationFlow;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(kotlin.coroutines.Continuation<? super Dh.VehicleInformation> r12) throws android.security.keystore.UserNotAuthenticatedException {
        /*
            r11 = this;
            boolean r0 = r12 instanceof Bh.e.f
            if (r0 == 0) goto L13
            r0 = r12
            Bh.e$f r0 = (Bh.e.f) r0
            int r1 = r0.f2463c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2463c = r1
            goto L18
        L13:
            Bh.e$f r0 = new Bh.e$f
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f2461a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f2463c
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
            zh.k r12 = r11.profileDataSource
            r0.f2463c = r3
            java.lang.Object r12 = r12.p(r0)
            if (r12 != r1) goto L3f
            return r1
        L3f:
            r5 = r12
            Dh.I r5 = (Dh.VehicleInformation) r5
            tv.B<Dh.v> r9 = r11._profileInformationFlow
        L44:
            java.lang.Object r10 = r9.getValue()
            r0 = r10
            Dh.v r0 = (Dh.ProfileInformation) r0
            r7 = 47
            r8 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            Dh.v r0 = Dh.ProfileInformation.b(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = r9.e(r10, r0)
            if (r0 == 0) goto L44
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: Bh.e.n(kotlin.coroutines.Continuation):java.lang.Object");
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
      0x00ac: PHI (r3v1 Dh.C) = (r3v0 Dh.C), (r3v3 Dh.C) binds: [B:26:0x008e, B:31:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r10v5 Dh.C) = (r10v2 Dh.C), (r10v8 Dh.C) binds: [B:26:0x008e, B:31:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r11v6 Cs.a) = (r11v2 Cs.a), (r11v8 Cs.a) binds: [B:26:0x008e, B:31:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r12v9 Dh.n) = (r12v4 Dh.n), (r12v11 Dh.n) binds: [B:26:0x008e, B:31:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(Cs.MeijerAccount r10, Dh.PasswordChangeInfo r11, kotlin.coroutines.Continuation<? super Dh.UpdateAccountInformationResponse> r12) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bh.e.q(Cs.a, Dh.n, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        if (r12 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac A[PHI: r3 r10 r11 r12
      0x00ac: PHI (r3v1 Eh.f) = (r3v0 Eh.f), (r3v3 Eh.f) binds: [B:26:0x008e, B:31:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r10v5 Dh.C) = (r10v2 Dh.C), (r10v8 Dh.C) binds: [B:26:0x008e, B:31:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r11v6 Cs.a) = (r11v2 Cs.a), (r11v8 Cs.a) binds: [B:26:0x008e, B:31:0x00a7] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r12v9 java.lang.String) = (r12v4 java.lang.String), (r12v11 java.lang.String) binds: [B:26:0x008e, B:31:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(Cs.MeijerAccount r10, java.lang.String r11, kotlin.coroutines.Continuation<? super Dh.UpdateBasicInfoResponse> r12) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bh.e.r(Cs.a, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object s(CustomerPreference customerPreference, Continuation<? super UpdateConfirmationResponse> continuation) {
        return this.profileDataSource.s(customerPreference, continuation);
    }

    public final Object t(String str, boolean z10, Continuation<? super Eh.f> continuation) {
        return this.profileDataSource.t(str, z10, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.String r11, java.lang.String r12, kotlin.coroutines.Continuation<? super Dh.UpdateConfirmationResponse> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof Bh.e.i
            if (r0 == 0) goto L14
            r0 = r13
            Bh.e$i r0 = (Bh.e.i) r0
            int r1 = r0.f2487h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f2487h = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            Bh.e$i r0 = new Bh.e$i
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r5.f2485f
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r5.f2487h
            r8 = 2
            r2 = 1
            r9 = 0
            if (r1 == 0) goto L52
            if (r1 == r2) goto L45
            if (r1 != r8) goto L3d
            java.lang.Object r11 = r5.f2483d
            Dh.C r11 = (Dh.UpdateConfirmationResponse) r11
            java.lang.Object r11 = r5.f2482c
            java.lang.Object r12 = r5.f2481b
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r5.f2480a
            java.lang.String r12 = (java.lang.String) r12
            kotlin.ResultKt.b(r13)
            goto La3
        L3d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L45:
            java.lang.Object r11 = r5.f2481b
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r5.f2480a
            java.lang.String r11 = (java.lang.String) r11
            kotlin.ResultKt.b(r13)
            goto L6b
        L52:
            kotlin.ResultKt.b(r13)
            zh.k r1 = r10.profileDataSource
            r5.f2480a = r11
            r5.f2481b = r12
            r5.f2487h = r2
            r4 = 0
            r6 = 4
            r7 = 0
            r2 = r11
            r3 = r12
            java.lang.Object r13 = zh.k.v(r1, r2, r3, r4, r5, r6, r7)
            if (r13 != r0) goto L69
            goto La1
        L69:
            r11 = r2
            r12 = r3
        L6b:
            r1 = r13
            Dh.C r1 = (Dh.UpdateConfirmationResponse) r1
            boolean r2 = r1.getIsSuccess()
            if (r2 != 0) goto L8f
            uw.a$a r11 = uw.a.INSTANCE
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            rk.a r0 = r1.getErrorType()
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
            r5.f2480a = r11
            r5.f2481b = r12
            r5.f2482c = r13
            r5.f2483d = r1
            r5.f2484e = r9
            r5.f2487h = r8
            java.lang.Object r11 = r10.l(r5)
            if (r11 != r0) goto La2
        La1:
            return r0
        La2:
            r11 = r13
        La3:
            uw.a$a r12 = uw.a.INSTANCE
            java.lang.String r13 = "Customer successfully changed PIN."
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r12.k(r13, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Bh.e.u(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e8, code lost:
    
        if (r10 == r1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01f1, code lost:
    
        if (k(r0) != r1) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bd A[PHI: r3 r8 r9 r10
      0x01bd: PHI (r3v8 Dh.C) = (r3v0 Dh.C), (r3v0 Dh.C), (r3v0 Dh.C), (r3v0 Dh.C), (r3v0 Dh.C), (r3v0 Dh.C), (r3v10 Dh.C) binds: [B:27:0x00f6, B:58:0x0173, B:60:0x0179, B:63:0x0180, B:65:0x0186, B:68:0x0195, B:42:0x0131] A[DONT_GENERATE, DONT_INLINE]
      0x01bd: PHI (r8v16 Dh.C) = (r8v2 Dh.C), (r8v2 Dh.C), (r8v2 Dh.C), (r8v2 Dh.C), (r8v2 Dh.C), (r8v2 Dh.C), (r8v22 Dh.C) binds: [B:27:0x00f6, B:58:0x0173, B:60:0x0179, B:63:0x0180, B:65:0x0186, B:68:0x0195, B:42:0x0131] A[DONT_GENERATE, DONT_INLINE]
      0x01bd: PHI (r9v20 java.lang.String) = 
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
      (r9v2 java.lang.String)
      (r9v23 java.lang.String)
     binds: [B:27:0x00f6, B:58:0x0173, B:60:0x0179, B:63:0x0180, B:65:0x0186, B:68:0x0195, B:42:0x0131] A[DONT_GENERATE, DONT_INLINE]
      0x01bd: PHI (r10v14 Dh.H) = (r10v5 Dh.H), (r10v5 Dh.H), (r10v5 Dh.H), (r10v5 Dh.H), (r10v5 Dh.H), (r10v5 Dh.H), (r10v15 Dh.H) binds: [B:27:0x00f6, B:58:0x0173, B:60:0x0179, B:63:0x0180, B:65:0x0186, B:68:0x0195, B:42:0x0131] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.String r8, Dh.VehicleDescriptionChangeInfo r9, kotlin.coroutines.Continuation<? super Dh.UpdateOrderPreferencesResponse> r10) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bh.e.v(java.lang.String, Dh.H, kotlin.coroutines.Continuation):java.lang.Object");
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
    public final java.lang.Object x(int r7, kotlin.coroutines.Continuation<? super ok.StoreDetails> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof Bh.e.k
            if (r0 == 0) goto L13
            r0 = r8
            Bh.e$k r0 = (Bh.e.k) r0
            int r1 = r0.f2507l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2507l = r1
            goto L18
        L13:
            Bh.e$k r0 = new Bh.e$k
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f2505j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f2507l
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L52
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.f2501f
            Dh.E r7 = (Dh.UpdateStoreResponse) r7
            kotlin.ResultKt.b(r8)
            goto Ld1
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            int r7 = r0.f2496a
            java.lang.Object r2 = r0.f2504i
            Bh.e r2 = (Bh.e) r2
            java.lang.Object r2 = r0.f2503h
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r2 = r0.f2502g
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r2 = r0.f2501f
            Bh.e r2 = (Bh.e) r2
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Exception -> L50
            goto L76
        L50:
            r8 = move-exception
            goto L7b
        L52:
            kotlin.ResultKt.b(r8)
            kotlin.Result$Companion r8 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L50
            zh.k r8 = b(r6)     // Catch: java.lang.Exception -> L50
            r0.f2501f = r6     // Catch: java.lang.Exception -> L50
            r0.f2502g = r0     // Catch: java.lang.Exception -> L50
            r0.f2503h = r0     // Catch: java.lang.Exception -> L50
            r0.f2504i = r6     // Catch: java.lang.Exception -> L50
            r0.f2496a = r7     // Catch: java.lang.Exception -> L50
            r0.f2497b = r5     // Catch: java.lang.Exception -> L50
            r0.f2498c = r5     // Catch: java.lang.Exception -> L50
            r0.f2499d = r5     // Catch: java.lang.Exception -> L50
            r0.f2500e = r5     // Catch: java.lang.Exception -> L50
            r0.f2507l = r4     // Catch: java.lang.Exception -> L50
            java.lang.Object r8 = r8.x(r7, r0)     // Catch: java.lang.Exception -> L50
            if (r8 != r1) goto L76
            goto Ld0
        L76:
            java.lang.Object r8 = kotlin.Result.b(r8)     // Catch: java.lang.Exception -> L50
            goto L8c
        L7b:
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            qv.E0.i(r2)
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            java.lang.Object r8 = kotlin.ResultKt.a(r8)
            java.lang.Object r8 = kotlin.Result.b(r8)
        L8c:
            boolean r2 = kotlin.Result.h(r8)
            if (r2 == 0) goto Laf
            Dh.E r8 = (Dh.UpdateStoreResponse) r8     // Catch: java.lang.Throwable -> L9f
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
            Dh.E r8 = (Dh.UpdateStoreResponse) r8
            r0.f2501f = r8
            r8 = 0
            r0.f2502g = r8
            r0.f2503h = r8
            r0.f2504i = r8
            r0.f2496a = r7
            r0.f2497b = r5
            r0.f2507l = r3
            java.lang.Object r8 = r6.g(r7, r0)
            if (r8 != r1) goto Ld1
        Ld0:
            return r1
        Ld1:
            ok.h r8 = (ok.StoreDetails) r8
        Ld3:
            java.lang.Object r7 = kotlin.Result.b(r8)
            kotlin.ResultKt.b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Bh.e.x(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object y(int i10, String str, Continuation<? super UpdateConfirmationResponse> continuation) {
        return this.profileDataSource.y(i10, str, continuation);
    }

    public final Object z(String str, Continuation<? super ValidateEmailAvailability> continuation) {
        return this.profileDataSource.z(str, continuation);
    }
}
