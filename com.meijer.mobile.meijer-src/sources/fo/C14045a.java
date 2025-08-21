package fo;

import co.AbstractC6530b;
import co.AutoClaimReward;
import co.EarnReward;
import com.meijer.mobile.mperks.networking.api.models.MperksClaimRewardResponse;
import com.meijer.mobile.mperks.networking.api.models.MperksErrorJson;
import com.meijer.mobile.mperks.networking.domain.models.AutoClaimAccountInfo;
import com.meijer.mobile.mperks.networking.domain.models.AvailableRewardCoupon;
import com.meijer.mobile.mperks.networking.domain.models.ExpiringPoints;
import com.meijer.mobile.mperks.networking.domain.models.MperksCreditCardInfo;
import com.meijer.mobile.mperks.networking.domain.models.MperksRewardEarnedDetail;
import com.meijer.mobile.mperks.networking.domain.models.MperksTransaction;
import com.meijer.mobile.mperks.networking.domain.models.PaginatedResult;
import com.meijer.mobile.mperks.networking.domain.models.errors.MperksApiException;
import com.meijer.mobile.mperks.networking.domain.models.errors.MperksError;
import com.squareup.moshi.t;
import ho.InterfaceC14561a;
import ho.InterfaceC14562b;
import io.C14835b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.AbstractC15779K;
import mv.C15805i;
import mv.InterfaceC15783O;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;

@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B5\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J4\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0086@¢\u0006\u0004\b \u0010\u0014J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0086@¢\u0006\u0004\b!\u0010\u0014J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001eH\u0086@¢\u0006\u0004\b#\u0010\u0014J*\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u001e2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0086@¢\u0006\u0004\b)\u0010*J,\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020\u00182\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010%\u001a\u0004\u0018\u00010$H\u0086@¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/H\u0086@¢\u0006\u0004\b0\u0010\u0014J8\u00105\u001a\f\u0012\b\u0012\u00060\u0016j\u0002`40\u001a2\b\u00101\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00162\u0006\u00103\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b5\u00106J\u001e\u00109\u001a\b\u0012\u0004\u0012\u0002080\u001e2\u0006\u00107\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b9\u0010:J\u001c\u0010>\u001a\u00020,2\n\u0010=\u001a\u00060;j\u0002`<H\u0086@¢\u0006\u0004\b>\u0010?J\u0010\u0010A\u001a\u00020@H\u0086@¢\u0006\u0004\bA\u0010\u0014J\u0010\u0010C\u001a\u00020BH\u0086@¢\u0006\u0004\bC\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010O¨\u0006Q"}, d2 = {"Lfo/a;", "", "Lho/a;", "mperksCustomerApi", "Lho/b;", "mperksRewardApi", "LTq/j;", "storeProvider", "LYi/a;", "authTokenProvider", "Lmv/K;", "ioDispatcher", "<init>", "(Lho/a;Lho/b;LTq/j;LYi/a;Lmv/K;)V", "Lretrofit2/HttpException;", "Lcom/meijer/mobile/mperks/networking/domain/models/errors/MperksApiException;", "s", "(Lretrofit2/HttpException;)Lcom/meijer/mobile/mperks/networking/domain/models/errors/MperksApiException;", "", "o", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "maxItemCount", "", "xContinuationToken", "", "includeAdjustmentDetails", "Lcom/meijer/mobile/mperks/networking/domain/models/PaginatedResult;", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransaction;", "p", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lco/g;", "m", "j", "Lcom/meijer/mobile/mperks/networking/domain/models/AvailableRewardCoupon;", "k", "Lco/b;", "autoClaimType", "", "autoClaimAmount", "Lco/a;", "i", "(Lco/b;Ljava/lang/Double;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enroll", "", "g", "(ZLjava/lang/Double;Lco/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/mperks/networking/domain/models/AutoClaimAccountInfo;", "h", "perPageCount", "continuationToken", "rewardId", "Lcom/meijer/mobile/core/models/products/ProductCode;", "r", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "days", "Lcom/meijer/mobile/mperks/networking/domain/models/ExpiringPoints;", "q", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/meijer/mobile/core/models/mperks/MperksCouponId;", "couponId", "f", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksRewardEarnedDetail;", "l", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksCreditCardInfo;", "n", "a", "Lho/a;", "b", "Lho/b;", "c", "LTq/j;", "d", "LYi/a;", "e", "Lmv/K;", "Lcom/squareup/moshi/t;", "Lcom/squareup/moshi/t;", "moshi", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: fo.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14045a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14561a mperksCustomerApi;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14562b mperksRewardApi;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Yi.a authTokenProvider;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t moshi;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.MperksDataSource$buyCoupon$2", f = "MperksDataSource.kt", l = {246, 245}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: fo.a$a, reason: collision with other inner class name */
    static final class C2105a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f132288a;

        /* renamed from: b, reason: collision with root package name */
        Object f132289b;

        /* renamed from: c, reason: collision with root package name */
        Object f132290c;

        /* renamed from: d, reason: collision with root package name */
        Object f132291d;

        /* renamed from: e, reason: collision with root package name */
        Object f132292e;

        /* renamed from: f, reason: collision with root package name */
        Object f132293f;

        /* renamed from: g, reason: collision with root package name */
        long f132294g;

        /* renamed from: h, reason: collision with root package name */
        int f132295h;

        /* renamed from: i, reason: collision with root package name */
        int f132296i;

        /* renamed from: j, reason: collision with root package name */
        int f132297j;

        /* renamed from: k, reason: collision with root package name */
        int f132298k;

        /* renamed from: l, reason: collision with root package name */
        int f132299l;

        /* renamed from: m, reason: collision with root package name */
        private /* synthetic */ Object f132300m;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ long f132302o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2105a(long j10, Continuation<? super C2105a> continuation) {
            super(2, continuation);
            this.f132302o = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2105a c2105a = C14045a.this.new C2105a(this.f132302o, continuation);
            c2105a.f132300m = obj;
            return c2105a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C2105a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00ea, code lost:
        
            if (r0 == r6) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 373
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fo.C14045a.C2105a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.MperksDataSource$enrollInAutoClaim$2", f = "MperksDataSource.kt", l = {170, 169}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: fo.a$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f132303a;

        /* renamed from: b, reason: collision with root package name */
        Object f132304b;

        /* renamed from: c, reason: collision with root package name */
        Object f132305c;

        /* renamed from: d, reason: collision with root package name */
        Object f132306d;

        /* renamed from: e, reason: collision with root package name */
        Object f132307e;

        /* renamed from: f, reason: collision with root package name */
        Object f132308f;

        /* renamed from: g, reason: collision with root package name */
        Object f132309g;

        /* renamed from: h, reason: collision with root package name */
        boolean f132310h;

        /* renamed from: i, reason: collision with root package name */
        int f132311i;

        /* renamed from: j, reason: collision with root package name */
        int f132312j;

        /* renamed from: k, reason: collision with root package name */
        int f132313k;

        /* renamed from: l, reason: collision with root package name */
        int f132314l;

        /* renamed from: m, reason: collision with root package name */
        int f132315m;

        /* renamed from: n, reason: collision with root package name */
        private /* synthetic */ Object f132316n;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f132318p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Double f132319q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ AbstractC6530b f132320r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, Double d10, AbstractC6530b abstractC6530b, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f132318p = z10;
            this.f132319q = d10;
            this.f132320r = abstractC6530b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = C14045a.this.new b(this.f132318p, this.f132319q, this.f132320r, continuation);
            bVar.f132316n = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00fb A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:7:0x0024, B:28:0x00f3, B:30:0x00fb, B:31:0x0104, B:32:0x0109, B:14:0x0060, B:21:0x00b5, B:23:0x00bd, B:25:0x00cb, B:17:0x007d), top: B:65:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0104 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:7:0x0024, B:28:0x00f3, B:30:0x00fb, B:31:0x0104, B:32:0x0109, B:14:0x0060, B:21:0x00b5, B:23:0x00bd, B:25:0x00cb, B:17:0x007d), top: B:65:0x000a }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 379
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fo.C14045a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/mperks/networking/domain/models/AutoClaimAccountInfo;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/mperks/networking/domain/models/AutoClaimAccountInfo;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.MperksDataSource$getAutoClaimAccountInfo$2", f = "MperksDataSource.kt", l = {193, 193}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: fo.a$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super AutoClaimAccountInfo>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f132321a;

        /* renamed from: b, reason: collision with root package name */
        Object f132322b;

        /* renamed from: c, reason: collision with root package name */
        Object f132323c;

        /* renamed from: d, reason: collision with root package name */
        Object f132324d;

        /* renamed from: e, reason: collision with root package name */
        Object f132325e;

        /* renamed from: f, reason: collision with root package name */
        int f132326f;

        /* renamed from: g, reason: collision with root package name */
        int f132327g;

        /* renamed from: h, reason: collision with root package name */
        int f132328h;

        /* renamed from: i, reason: collision with root package name */
        int f132329i;

        /* renamed from: j, reason: collision with root package name */
        int f132330j;

        /* renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f132331k;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = C14045a.this.new c(continuation);
            cVar.f132331k = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super AutoClaimAccountInfo> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00ac, code lost:
        
            if (r13 == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 228
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fo.C14045a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "Lco/a;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.MperksDataSource$getAvailableAutoClaimOptions$2", f = "MperksDataSource.kt", l = {147, 146}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: fo.a$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends AutoClaimReward>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f132333a;

        /* renamed from: b, reason: collision with root package name */
        Object f132334b;

        /* renamed from: c, reason: collision with root package name */
        Object f132335c;

        /* renamed from: d, reason: collision with root package name */
        Object f132336d;

        /* renamed from: e, reason: collision with root package name */
        Object f132337e;

        /* renamed from: f, reason: collision with root package name */
        Object f132338f;

        /* renamed from: g, reason: collision with root package name */
        Object f132339g;

        /* renamed from: h, reason: collision with root package name */
        int f132340h;

        /* renamed from: i, reason: collision with root package name */
        int f132341i;

        /* renamed from: j, reason: collision with root package name */
        int f132342j;

        /* renamed from: k, reason: collision with root package name */
        int f132343k;

        /* renamed from: l, reason: collision with root package name */
        int f132344l;

        /* renamed from: m, reason: collision with root package name */
        private /* synthetic */ Object f132345m;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ AbstractC6530b f132347o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Double f132348p;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends AutoClaimReward>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<AutoClaimReward>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(AbstractC6530b abstractC6530b, Double d10, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f132347o = abstractC6530b;
            this.f132348p = d10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = C14045a.this.new d(this.f132347o, this.f132348p, continuation);
            dVar.f132345m = obj;
            return dVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<AutoClaimReward>> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00de, code lost:
        
            if (r2 == r0) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 314
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fo.C14045a.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "Lco/g;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.MperksDataSource$getAvailableEarnRewards$2", f = "MperksDataSource.kt", l = {111, 111}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: fo.a$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends EarnReward>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f132349a;

        /* renamed from: b, reason: collision with root package name */
        Object f132350b;

        /* renamed from: c, reason: collision with root package name */
        Object f132351c;

        /* renamed from: d, reason: collision with root package name */
        Object f132352d;

        /* renamed from: e, reason: collision with root package name */
        Object f132353e;

        /* renamed from: f, reason: collision with root package name */
        int f132354f;

        /* renamed from: g, reason: collision with root package name */
        int f132355g;

        /* renamed from: h, reason: collision with root package name */
        int f132356h;

        /* renamed from: i, reason: collision with root package name */
        int f132357i;

        /* renamed from: j, reason: collision with root package name */
        int f132358j;

        /* renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f132359k;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends EarnReward>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<EarnReward>>) continuation);
        }

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = C14045a.this.new e(continuation);
            eVar.f132359k = obj;
            return eVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<EarnReward>> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00ac, code lost:
        
            if (r13 == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 264
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fo.C14045a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "Lcom/meijer/mobile/mperks/networking/domain/models/AvailableRewardCoupon;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.MperksDataSource$getAvailableRewardCoupons$2", f = "MperksDataSource.kt", l = {125, 125}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: fo.a$f */
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends AvailableRewardCoupon>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f132361a;

        /* renamed from: b, reason: collision with root package name */
        Object f132362b;

        /* renamed from: c, reason: collision with root package name */
        Object f132363c;

        /* renamed from: d, reason: collision with root package name */
        Object f132364d;

        /* renamed from: e, reason: collision with root package name */
        Object f132365e;

        /* renamed from: f, reason: collision with root package name */
        int f132366f;

        /* renamed from: g, reason: collision with root package name */
        int f132367g;

        /* renamed from: h, reason: collision with root package name */
        int f132368h;

        /* renamed from: i, reason: collision with root package name */
        int f132369i;

        /* renamed from: j, reason: collision with root package name */
        int f132370j;

        /* renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f132371k;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends AvailableRewardCoupon>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<AvailableRewardCoupon>>) continuation);
        }

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = C14045a.this.new f(continuation);
            fVar.f132371k = obj;
            return fVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<AvailableRewardCoupon>> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00ac, code lost:
        
            if (r14 == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 270
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fo.C14045a.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksRewardEarnedDetail;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/mperks/networking/domain/models/MperksRewardEarnedDetail;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.MperksDataSource$getEarnedRewards$2", f = "MperksDataSource.kt", l = {264, 263}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: fo.a$g */
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super MperksRewardEarnedDetail>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f132373a;

        /* renamed from: b, reason: collision with root package name */
        Object f132374b;

        /* renamed from: c, reason: collision with root package name */
        Object f132375c;

        /* renamed from: d, reason: collision with root package name */
        Object f132376d;

        /* renamed from: e, reason: collision with root package name */
        Object f132377e;

        /* renamed from: f, reason: collision with root package name */
        Object f132378f;

        /* renamed from: g, reason: collision with root package name */
        int f132379g;

        /* renamed from: h, reason: collision with root package name */
        int f132380h;

        /* renamed from: i, reason: collision with root package name */
        int f132381i;

        /* renamed from: j, reason: collision with root package name */
        int f132382j;

        /* renamed from: k, reason: collision with root package name */
        int f132383k;

        /* renamed from: l, reason: collision with root package name */
        private /* synthetic */ Object f132384l;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = C14045a.this.new g(continuation);
            gVar.f132384l = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super MperksRewardEarnedDetail> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00be, code lost:
        
            if (r15 == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 246
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fo.C14045a.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "Lco/g;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.MperksDataSource$getInProgressEarnRewards$2", f = "MperksDataSource.kt", l = {98, 98}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: fo.a$h */
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends EarnReward>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f132386a;

        /* renamed from: b, reason: collision with root package name */
        Object f132387b;

        /* renamed from: c, reason: collision with root package name */
        Object f132388c;

        /* renamed from: d, reason: collision with root package name */
        Object f132389d;

        /* renamed from: e, reason: collision with root package name */
        Object f132390e;

        /* renamed from: f, reason: collision with root package name */
        int f132391f;

        /* renamed from: g, reason: collision with root package name */
        int f132392g;

        /* renamed from: h, reason: collision with root package name */
        int f132393h;

        /* renamed from: i, reason: collision with root package name */
        int f132394i;

        /* renamed from: j, reason: collision with root package name */
        int f132395j;

        /* renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f132396k;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends EarnReward>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<EarnReward>>) continuation);
        }

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            h hVar = C14045a.this.new h(continuation);
            hVar.f132396k = obj;
            return hVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<EarnReward>> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00ac, code lost:
        
            if (r13 == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 264
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fo.C14045a.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksCreditCardInfo;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/mperks/networking/domain/models/MperksCreditCardInfo;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.MperksDataSource$getMperksCreditCardInfo$2", f = "MperksDataSource.kt", l = {275, 275}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: fo.a$i */
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super MperksCreditCardInfo>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f132398a;

        /* renamed from: b, reason: collision with root package name */
        Object f132399b;

        /* renamed from: c, reason: collision with root package name */
        Object f132400c;

        /* renamed from: d, reason: collision with root package name */
        Object f132401d;

        /* renamed from: e, reason: collision with root package name */
        Object f132402e;

        /* renamed from: f, reason: collision with root package name */
        int f132403f;

        /* renamed from: g, reason: collision with root package name */
        int f132404g;

        /* renamed from: h, reason: collision with root package name */
        int f132405h;

        /* renamed from: i, reason: collision with root package name */
        int f132406i;

        /* renamed from: j, reason: collision with root package name */
        int f132407j;

        /* renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f132408k;

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            i iVar = C14045a.this.new i(continuation);
            iVar.f132408k = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super MperksCreditCardInfo> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00ac, code lost:
        
            if (r13 == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 228
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fo.C14045a.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)I"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.MperksDataSource$getMperksPointBalance$2", f = "MperksDataSource.kt", l = {62, 63}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: fo.a$j */
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Integer>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f132410a;

        /* renamed from: b, reason: collision with root package name */
        Object f132411b;

        /* renamed from: c, reason: collision with root package name */
        Object f132412c;

        /* renamed from: d, reason: collision with root package name */
        Object f132413d;

        /* renamed from: e, reason: collision with root package name */
        Object f132414e;

        /* renamed from: f, reason: collision with root package name */
        int f132415f;

        /* renamed from: g, reason: collision with root package name */
        int f132416g;

        /* renamed from: h, reason: collision with root package name */
        int f132417h;

        /* renamed from: i, reason: collision with root package name */
        int f132418i;

        /* renamed from: j, reason: collision with root package name */
        int f132419j;

        /* renamed from: k, reason: collision with root package name */
        int f132420k;

        /* renamed from: l, reason: collision with root package name */
        private /* synthetic */ Object f132421l;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: fo.a$j$a, reason: collision with other inner class name */
        static final class C2106a implements Function0<Integer> {

            /* renamed from: a, reason: collision with root package name */
            public static final C2106a f132423a = new C2106a();

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke() {
                return 0;
            }

            C2106a() {
            }
        }

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            j jVar = C14045a.this.new j(continuation);
            jVar.f132421l = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Integer> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x00b4, code lost:
        
            if (r14 == r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 259
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fo.C14045a.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/mperks/networking/domain/models/PaginatedResult;", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransaction;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/mperks/networking/domain/models/PaginatedResult;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.MperksDataSource$getMperksTransactionHistory$2", f = "MperksDataSource.kt", l = {84, 83}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: fo.a$k */
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super PaginatedResult<MperksTransaction>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f132424a;

        /* renamed from: b, reason: collision with root package name */
        Object f132425b;

        /* renamed from: c, reason: collision with root package name */
        Object f132426c;

        /* renamed from: d, reason: collision with root package name */
        Object f132427d;

        /* renamed from: e, reason: collision with root package name */
        Object f132428e;

        /* renamed from: f, reason: collision with root package name */
        Object f132429f;

        /* renamed from: g, reason: collision with root package name */
        Object f132430g;

        /* renamed from: h, reason: collision with root package name */
        Object f132431h;

        /* renamed from: i, reason: collision with root package name */
        int f132432i;

        /* renamed from: j, reason: collision with root package name */
        int f132433j;

        /* renamed from: k, reason: collision with root package name */
        int f132434k;

        /* renamed from: l, reason: collision with root package name */
        int f132435l;

        /* renamed from: m, reason: collision with root package name */
        int f132436m;

        /* renamed from: n, reason: collision with root package name */
        private /* synthetic */ Object f132437n;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f132439p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Integer f132440q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Boolean f132441r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, Integer num, Boolean bool, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f132439p = str;
            this.f132440q = num;
            this.f132441r = bool;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            k kVar = C14045a.this.new k(this.f132439p, this.f132440q, this.f132441r, continuation);
            kVar.f132437n = obj;
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super PaginatedResult<MperksTransaction>> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00e7, code lost:
        
            if (r0 == r6) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 287
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fo.C14045a.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "Lcom/meijer/mobile/mperks/networking/domain/models/ExpiringPoints;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.MperksDataSource$getPointsExpirySummary$2", f = "MperksDataSource.kt", l = {230, 229}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: fo.a$l */
    static final class l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends ExpiringPoints>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f132442a;

        /* renamed from: b, reason: collision with root package name */
        Object f132443b;

        /* renamed from: c, reason: collision with root package name */
        Object f132444c;

        /* renamed from: d, reason: collision with root package name */
        Object f132445d;

        /* renamed from: e, reason: collision with root package name */
        Object f132446e;

        /* renamed from: f, reason: collision with root package name */
        int f132447f;

        /* renamed from: g, reason: collision with root package name */
        int f132448g;

        /* renamed from: h, reason: collision with root package name */
        int f132449h;

        /* renamed from: i, reason: collision with root package name */
        int f132450i;

        /* renamed from: j, reason: collision with root package name */
        int f132451j;

        /* renamed from: k, reason: collision with root package name */
        int f132452k;

        /* renamed from: l, reason: collision with root package name */
        private /* synthetic */ Object f132453l;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f132455n;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends ExpiringPoints>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<ExpiringPoints>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(int i10, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f132455n = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            l lVar = C14045a.this.new l(this.f132455n, continuation);
            lVar.f132453l = obj;
            return lVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<ExpiringPoints>> continuation) {
            return ((l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00b2, code lost:
        
            if (r15 == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 279
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fo.C14045a.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/mperks/networking/domain/models/PaginatedResult;", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/mperks/networking/domain/models/PaginatedResult;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.mperks.networking.api.MperksDataSource$getRewardIncludedUpcs$2", f = "MperksDataSource.kt", l = {212, 211}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: fo.a$m */
    static final class m extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super PaginatedResult<String>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f132456a;

        /* renamed from: b, reason: collision with root package name */
        Object f132457b;

        /* renamed from: c, reason: collision with root package name */
        Object f132458c;

        /* renamed from: d, reason: collision with root package name */
        Object f132459d;

        /* renamed from: e, reason: collision with root package name */
        Object f132460e;

        /* renamed from: f, reason: collision with root package name */
        Object f132461f;

        /* renamed from: g, reason: collision with root package name */
        Object f132462g;

        /* renamed from: h, reason: collision with root package name */
        Object f132463h;

        /* renamed from: i, reason: collision with root package name */
        int f132464i;

        /* renamed from: j, reason: collision with root package name */
        int f132465j;

        /* renamed from: k, reason: collision with root package name */
        int f132466k;

        /* renamed from: l, reason: collision with root package name */
        int f132467l;

        /* renamed from: m, reason: collision with root package name */
        int f132468m;

        /* renamed from: n, reason: collision with root package name */
        private /* synthetic */ Object f132469n;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f132471p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f132472q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Integer f132473r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, String str2, Integer num, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f132471p = str;
            this.f132472q = str2;
            this.f132473r = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            m mVar = C14045a.this.new m(this.f132471p, this.f132472q, this.f132473r, continuation);
            mVar.f132469n = obj;
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super PaginatedResult<String>> continuation) {
            return ((m) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00e7, code lost:
        
            if (r0 == r6) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 287
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fo.C14045a.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C14045a(InterfaceC14561a mperksCustomerApi, InterfaceC14562b mperksRewardApi, Tq.j storeProvider, Yi.a authTokenProvider, AbstractC15779K ioDispatcher) {
        Intrinsics.j(mperksCustomerApi, "mperksCustomerApi");
        Intrinsics.j(mperksRewardApi, "mperksRewardApi");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(authTokenProvider, "authTokenProvider");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.mperksCustomerApi = mperksCustomerApi;
        this.mperksRewardApi = mperksRewardApi;
        this.storeProvider = storeProvider;
        this.authTokenProvider = authTokenProvider;
        this.ioDispatcher = ioDispatcher;
        this.moshi = C14835b.f138793a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MperksApiException s(HttpException httpException) {
        Object objB;
        Object objB2;
        MperksErrorJson error;
        MperksError mperksErrorA;
        ResponseBody responseBodyErrorBody;
        try {
            Result.Companion companion = Result.INSTANCE;
            Response<?> response = httpException.response();
            MperksApiException exception = null;
            String strString = (response == null || (responseBodyErrorBody = response.errorBody()) == null) ? null : responseBodyErrorBody.string();
            if (strString == null) {
                strString = "";
            }
            MperksClaimRewardResponse mperksClaimRewardResponse = (MperksClaimRewardResponse) this.moshi.c(MperksClaimRewardResponse.class).fromJson(strString);
            if (mperksClaimRewardResponse != null && (error = mperksClaimRewardResponse.getError()) != null && (mperksErrorA = go.i.a(error)) != null) {
                exception = mperksErrorA.toException(httpException);
            }
            objB = Result.b(exception);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        if (Result.h(objB)) {
            try {
                MperksApiException mperksApiException = (MperksApiException) objB;
                if (mperksApiException == null) {
                    throw httpException;
                }
                objB2 = Result.b(mperksApiException);
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.INSTANCE;
                objB2 = Result.b(ResultKt.a(th3));
            }
        } else {
            objB2 = Result.b(objB);
        }
        ResultKt.b(objB2);
        return (MperksApiException) objB2;
    }

    public final Object f(long j10, Continuation<? super Unit> continuation) {
        Object objG = C15805i.g(this.ioDispatcher, new C2105a(j10, null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f143329a;
    }

    public final Object g(boolean z10, Double d10, AbstractC6530b abstractC6530b, Continuation<? super Unit> continuation) {
        Object objG = C15805i.g(this.ioDispatcher, new b(z10, d10, abstractC6530b, null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f143329a;
    }

    public final Object h(Continuation<? super AutoClaimAccountInfo> continuation) {
        return C15805i.g(this.ioDispatcher, new c(null), continuation);
    }

    public final Object i(AbstractC6530b abstractC6530b, Double d10, Continuation<? super List<AutoClaimReward>> continuation) {
        return C15805i.g(this.ioDispatcher, new d(abstractC6530b, d10, null), continuation);
    }

    public final Object j(Continuation<? super List<EarnReward>> continuation) {
        return C15805i.g(this.ioDispatcher, new e(null), continuation);
    }

    public final Object k(Continuation<? super List<AvailableRewardCoupon>> continuation) {
        return C15805i.g(this.ioDispatcher, new f(null), continuation);
    }

    public final Object l(Continuation<? super MperksRewardEarnedDetail> continuation) {
        return C15805i.g(this.ioDispatcher, new g(null), continuation);
    }

    public final Object m(Continuation<? super List<EarnReward>> continuation) {
        return C15805i.g(this.ioDispatcher, new h(null), continuation);
    }

    public final Object n(Continuation<? super MperksCreditCardInfo> continuation) {
        return C15805i.g(this.ioDispatcher, new i(null), continuation);
    }

    public final Object o(Continuation<? super Integer> continuation) {
        return C15805i.g(this.ioDispatcher, new j(null), continuation);
    }

    public final Object p(Integer num, String str, Boolean bool, Continuation<? super PaginatedResult<MperksTransaction>> continuation) {
        return C15805i.g(this.ioDispatcher, new k(str, num, bool, null), continuation);
    }

    public final Object q(int i10, Continuation<? super List<ExpiringPoints>> continuation) {
        return C15805i.g(this.ioDispatcher, new l(i10, null), continuation);
    }

    public final Object r(Integer num, String str, String str2, Continuation<? super PaginatedResult<String>> continuation) {
        return C15805i.g(this.ioDispatcher, new m(str, str2, num, null), continuation);
    }
}
