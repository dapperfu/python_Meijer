package tl;

import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.digitalshopping.api.timeslots.model.DTMFulfillmentSlotRequest;
import com.meijer.mobile.digitalshopping.api.timeslots.model.DeliveryPartner;
import com.meijer.mobile.digitalshopping.api.timeslots.model.FulfillmentSlotRequest;
import com.meijer.mobile.digitalshopping.api.timeslots.model.GetDTMReservationSlotsResponse;
import com.meijer.mobile.digitalshopping.api.timeslots.model.GetReservationSlotsOmsResponse;
import com.meijer.mobile.digitalshopping.api.timeslots.model.GetReservationSlotsOmsV1Request;
import com.meijer.mobile.digitalshopping.api.timeslots.model.GetReservationSlotsOmsV2Request;
import com.meijer.mobile.digitalshopping.api.timeslots.model.LineItem;
import com.meijer.mobile.digitalshopping.api.timeslots.model.OmsCustomerRequest;
import com.meijer.mobile.digitalshopping.api.timeslots.model.ReservationSlotValidationResponse;
import com.meijer.mobile.digitalshopping.api.timeslots.model.Schedules;
import com.meijer.mobile.digitalshopping.api.timeslots.model.TimeSlotsRequestDeliveryAddress;
import com.meijer.mobile.digitalshopping.api.timeslots.model.ValidateDtmReservationSlotRequest;
import com.meijer.mobile.digitalshopping.api.timeslots.model.ValidateReservationSlotOmsRequest;
import com.meijer.mobile.digitalshopping.api.timeslots.model.ValidateReservationSlotOmsResponse;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import di.CustomerAddress;
import fj.DeliveryMode;
import fj.Entry;
import fj.ShoppingCart;
import j$.time.Duration;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jj.FulfillmentSlot;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.AbstractC15779K;
import mv.C15805i;
import mv.InterfaceC15783O;
import retrofit2.HttpException;
import retrofit2.Response;
import ul.C17442b;
import ul.FulfillmentDTMDeliveryPartner;
import ul.FulfillmentDay;
import ul.FulfillmentSchedule;
import ul.ReservationSlotValidation;
import vl.C17690g;
import vl.C17691h;
import wv.InterfaceC17929a;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BE\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016JN\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001d0 2\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0082@¢\u0006\u0004\b\"\u0010#J*\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0082@¢\u0006\u0004\b$\u0010%J.\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010'\u001a\u00020&2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0082@¢\u0006\u0004\b)\u0010*J.\u0010+\u001a\u0004\u0018\u00010(2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010'\u001a\u00020&2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0082@¢\u0006\u0004\b+\u0010*J*\u0010.\u001a\u0004\u0018\u00010(2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010'\u001a\u00020&2\u0006\u0010-\u001a\u00020,H\u0082@¢\u0006\u0004\b.\u0010/J\u001d\u00102\u001a\u00020\u0014*\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b2\u00103J0\u00108\u001a\b\u0012\u0004\u0012\u00020&0\u001d2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0086@¢\u0006\u0004\b8\u00109J(\u0010:\u001a\b\u0012\u0004\u0012\u00020&0\u001d2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u00105\u001a\u000204H\u0086@¢\u0006\u0004\b:\u0010;J$\u0010=\u001a\u0002002\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0017H\u0086@¢\u0006\u0004\b=\u0010%J4\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u001d0 2\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010>\u001a\u00020\u0017H\u0080@¢\u0006\u0004\b@\u0010AJ&\u0010C\u001a\b\u0012\u0004\u0012\u00020B0 2\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0013\u001a\u00020\u0012H\u0080@¢\u0006\u0004\bC\u0010DJ \u0010E\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010'\u001a\u00020&H\u0080@¢\u0006\u0004\bE\u0010FR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006Y"}, d2 = {"Ltl/h;", "", "LYi/a;", "tokenProvider", "Ltl/c;", "timeSlotApi", "Ltl/g;", "timeSlotOmsApi", "Ltl/b;", "timeSlotsStore", "Lzl/k;", "featureManager", "Lyo/k;", "userManager", "Lmv/K;", "ioDispatcher", "<init>", "(LYi/a;Ltl/c;Ltl/g;Ltl/b;Lzl/k;Lyo/k;Lmv/K;)V", "Lfj/C;", "cart", "Ltl/a;", "t", "(Lfj/C;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/meijer/mobile/authentication/core/AccessToken;", "accessToken", "", "isEZCDEnabled", "isBunchaEnabled", "", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/DeliveryPartner;", "deliveryPartners", "Lretrofit2/Response;", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/GetReservationSlotsOmsResponse;", "p", "(Lfj/C;Ljava/lang/String;ZZLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o", "(Lfj/C;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljj/c;", "fulfillmentSlot", "Lul/e;", "x", "(Lfj/C;Ljj/c;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "w", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authToken", "y", "(Lfj/C;Ljj/c;Lcom/meijer/mobile/authentication/core/model/BearerToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lul/d;", "fulfillmentMode", "v", "(Lul/d;Ljava/lang/String;)Ltl/a;", "j$/time/Duration", "staleDuration", "j$/time/Instant", "now", "q", "(Lfj/C;Lj$/time/Duration;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "r", "(Lfj/C;Lj$/time/Duration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectedDeliveryPartner", "m", "fulfillmentType", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/GetDTMReservationSlotsResponse;", "l", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lfj/C;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/Schedules;", "u", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lfj/C;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "k", "(Lfj/C;Ljj/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LYi/a;", "b", "Ltl/c;", "c", "Ltl/g;", "d", "Ltl/b;", "e", "Lzl/k;", "f", "Lyo/k;", "g", "Lmv/K;", "Lwv/a;", "h", "Lwv/a;", "mutex", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Yi.a tokenProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17272c timeSlotApi;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final tl.g timeSlotOmsApi;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C17271b timeSlotsStore;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final zl.k featureManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17929a mutex;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.timeslots.TimeSlotRepository", f = "TimeSlotRepository.kt", l = {573, 582, 589, 595, 608, 620, 626}, m = "checkReservationSlot$digitalshopping_release")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f163118a;

        /* renamed from: b, reason: collision with root package name */
        Object f163119b;

        /* renamed from: c, reason: collision with root package name */
        Object f163120c;

        /* renamed from: d, reason: collision with root package name */
        int f163121d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f163122e;

        /* renamed from: g, reason: collision with root package name */
        int f163124g;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f163122e = obj;
            this.f163124g |= Integer.MIN_VALUE;
            return h.this.k(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmv/O;", "Lretrofit2/Response;", "", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/GetDTMReservationSlotsResponse;", "<anonymous>", "(Lmv/O;)Lretrofit2/Response;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.timeslots.TimeSlotRepository$getDTMTimeslotReservationSlots$2", f = "TimeSlotRepository.kt", l = {491}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Response<List<? extends GetDTMReservationSlotsResponse>>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f163125a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ BearerToken f163127c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ShoppingCart f163128d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f163129e;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Response<List<? extends GetDTMReservationSlotsResponse>>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super Response<List<GetDTMReservationSlotsResponse>>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(BearerToken bearerToken, ShoppingCart shoppingCart, String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f163127c = bearerToken;
            this.f163128d = shoppingCart;
            this.f163129e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new b(this.f163127c, this.f163128d, this.f163129e, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super Response<List<GetDTMReservationSlotsResponse>>> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f163125a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC17272c interfaceC17272c = h.this.timeSlotApi;
            String accessToken = this.f163127c.getAccessToken();
            String code = this.f163128d.getCode();
            OmsCustomerRequest omsCustomerRequest = new OmsCustomerRequest(h.this.userManager.a(), h.this.userManager.a(), h.this.userManager.h(), h.this.userManager.p(), h.this.userManager.q(), "0000000000");
            int storeId = this.f163128d.getPointOfService().getStoreId();
            String partnerEligibility = this.f163128d.getPartnerEligibility();
            if (partnerEligibility == null) {
                partnerEligibility = "";
            }
            DTMFulfillmentSlotRequest dTMFulfillmentSlotRequest = new DTMFulfillmentSlotRequest(code, omsCustomerRequest, CollectionsKt.e(C17442b.a(new FulfillmentDTMDeliveryPartner(storeId, partnerEligibility, this.f163128d.getFulfillmentEligibility()))));
            String str = this.f163129e;
            this.f163125a = 1;
            Object objA = interfaceC17272c.a(accessToken, dTMFulfillmentSlotRequest, str, this);
            if (objA == objF) {
                return objF;
            }
            return objA;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lul/d;", "<anonymous>", "(Lmv/O;)Lul/d;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.timeslots.TimeSlotRepository$getFulfillmentSchedule$2", f = "TimeSlotRepository.kt", l = {174, 194, 210, 246, 273}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super FulfillmentSchedule>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f163130a;

        /* renamed from: b, reason: collision with root package name */
        Object f163131b;

        /* renamed from: c, reason: collision with root package name */
        Object f163132c;

        /* renamed from: d, reason: collision with root package name */
        Object f163133d;

        /* renamed from: e, reason: collision with root package name */
        Object f163134e;

        /* renamed from: f, reason: collision with root package name */
        Object f163135f;

        /* renamed from: g, reason: collision with root package name */
        Object f163136g;

        /* renamed from: h, reason: collision with root package name */
        int f163137h;

        /* renamed from: i, reason: collision with root package name */
        int f163138i;

        /* renamed from: j, reason: collision with root package name */
        int f163139j;

        /* renamed from: k, reason: collision with root package name */
        int f163140k;

        /* renamed from: l, reason: collision with root package name */
        int f163141l;

        /* renamed from: m, reason: collision with root package name */
        int f163142m;

        /* renamed from: n, reason: collision with root package name */
        int f163143n;

        /* renamed from: o, reason: collision with root package name */
        int f163144o;

        /* renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f163145p;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ ShoppingCart f163147r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f163148s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ShoppingCart shoppingCart, String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f163147r = shoppingCart;
            this.f163148s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = h.this.new c(this.f163147r, this.f163148s, continuation);
            cVar.f163145p = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super FulfillmentSchedule> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:105:0x0349 A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:10:0x003b, B:165:0x0535, B:167:0x053d, B:168:0x0559, B:170:0x055f, B:171:0x057a, B:173:0x0580, B:174:0x0592, B:175:0x0596, B:176:0x059f, B:177:0x05a4, B:178:0x05a9, B:17:0x006e, B:139:0x0456, B:141:0x045e, B:143:0x0469, B:144:0x046f, B:146:0x0475, B:150:0x0488, B:153:0x0494, B:154:0x04b1, B:156:0x04b7, B:157:0x04d5, B:158:0x04e0, B:159:0x04fd, B:151:0x048b, B:160:0x04fe, B:161:0x0503, B:20:0x009a, B:103:0x0341, B:105:0x0349, B:107:0x0354, B:108:0x035a, B:110:0x0360, B:114:0x0373, B:117:0x037f, B:118:0x039c, B:120:0x03a2, B:121:0x03c0, B:123:0x03cc, B:124:0x03e9, B:115:0x0376, B:125:0x03ea, B:126:0x03ef, B:23:0x00c2, B:87:0x0260, B:89:0x0268, B:90:0x028e, B:92:0x0294, B:93:0x02b2, B:94:0x02bd, B:95:0x02c2, B:26:0x00f4, B:34:0x015a, B:37:0x0174, B:39:0x0182, B:41:0x0188, B:43:0x018e, B:48:0x0199, B:50:0x01a7, B:52:0x01ad, B:54:0x01b3, B:56:0x01b9, B:58:0x01c3, B:61:0x01cd, B:62:0x01d1, B:64:0x01d7, B:69:0x01f5, B:71:0x01fb, B:73:0x0201, B:75:0x0207, B:77:0x0213, B:82:0x0224, B:84:0x022e, B:96:0x02c3, B:97:0x02e8, B:99:0x02ee, B:100:0x0309, B:127:0x03f0, B:129:0x03fd, B:132:0x040e, B:134:0x0414, B:136:0x0422, B:162:0x0504, B:30:0x0120), top: B:182:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:125:0x03ea A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:10:0x003b, B:165:0x0535, B:167:0x053d, B:168:0x0559, B:170:0x055f, B:171:0x057a, B:173:0x0580, B:174:0x0592, B:175:0x0596, B:176:0x059f, B:177:0x05a4, B:178:0x05a9, B:17:0x006e, B:139:0x0456, B:141:0x045e, B:143:0x0469, B:144:0x046f, B:146:0x0475, B:150:0x0488, B:153:0x0494, B:154:0x04b1, B:156:0x04b7, B:157:0x04d5, B:158:0x04e0, B:159:0x04fd, B:151:0x048b, B:160:0x04fe, B:161:0x0503, B:20:0x009a, B:103:0x0341, B:105:0x0349, B:107:0x0354, B:108:0x035a, B:110:0x0360, B:114:0x0373, B:117:0x037f, B:118:0x039c, B:120:0x03a2, B:121:0x03c0, B:123:0x03cc, B:124:0x03e9, B:115:0x0376, B:125:0x03ea, B:126:0x03ef, B:23:0x00c2, B:87:0x0260, B:89:0x0268, B:90:0x028e, B:92:0x0294, B:93:0x02b2, B:94:0x02bd, B:95:0x02c2, B:26:0x00f4, B:34:0x015a, B:37:0x0174, B:39:0x0182, B:41:0x0188, B:43:0x018e, B:48:0x0199, B:50:0x01a7, B:52:0x01ad, B:54:0x01b3, B:56:0x01b9, B:58:0x01c3, B:61:0x01cd, B:62:0x01d1, B:64:0x01d7, B:69:0x01f5, B:71:0x01fb, B:73:0x0201, B:75:0x0207, B:77:0x0213, B:82:0x0224, B:84:0x022e, B:96:0x02c3, B:97:0x02e8, B:99:0x02ee, B:100:0x0309, B:127:0x03f0, B:129:0x03fd, B:132:0x040e, B:134:0x0414, B:136:0x0422, B:162:0x0504, B:30:0x0120), top: B:182:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:127:0x03f0 A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:10:0x003b, B:165:0x0535, B:167:0x053d, B:168:0x0559, B:170:0x055f, B:171:0x057a, B:173:0x0580, B:174:0x0592, B:175:0x0596, B:176:0x059f, B:177:0x05a4, B:178:0x05a9, B:17:0x006e, B:139:0x0456, B:141:0x045e, B:143:0x0469, B:144:0x046f, B:146:0x0475, B:150:0x0488, B:153:0x0494, B:154:0x04b1, B:156:0x04b7, B:157:0x04d5, B:158:0x04e0, B:159:0x04fd, B:151:0x048b, B:160:0x04fe, B:161:0x0503, B:20:0x009a, B:103:0x0341, B:105:0x0349, B:107:0x0354, B:108:0x035a, B:110:0x0360, B:114:0x0373, B:117:0x037f, B:118:0x039c, B:120:0x03a2, B:121:0x03c0, B:123:0x03cc, B:124:0x03e9, B:115:0x0376, B:125:0x03ea, B:126:0x03ef, B:23:0x00c2, B:87:0x0260, B:89:0x0268, B:90:0x028e, B:92:0x0294, B:93:0x02b2, B:94:0x02bd, B:95:0x02c2, B:26:0x00f4, B:34:0x015a, B:37:0x0174, B:39:0x0182, B:41:0x0188, B:43:0x018e, B:48:0x0199, B:50:0x01a7, B:52:0x01ad, B:54:0x01b3, B:56:0x01b9, B:58:0x01c3, B:61:0x01cd, B:62:0x01d1, B:64:0x01d7, B:69:0x01f5, B:71:0x01fb, B:73:0x0201, B:75:0x0207, B:77:0x0213, B:82:0x0224, B:84:0x022e, B:96:0x02c3, B:97:0x02e8, B:99:0x02ee, B:100:0x0309, B:127:0x03f0, B:129:0x03fd, B:132:0x040e, B:134:0x0414, B:136:0x0422, B:162:0x0504, B:30:0x0120), top: B:182:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:141:0x045e A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:10:0x003b, B:165:0x0535, B:167:0x053d, B:168:0x0559, B:170:0x055f, B:171:0x057a, B:173:0x0580, B:174:0x0592, B:175:0x0596, B:176:0x059f, B:177:0x05a4, B:178:0x05a9, B:17:0x006e, B:139:0x0456, B:141:0x045e, B:143:0x0469, B:144:0x046f, B:146:0x0475, B:150:0x0488, B:153:0x0494, B:154:0x04b1, B:156:0x04b7, B:157:0x04d5, B:158:0x04e0, B:159:0x04fd, B:151:0x048b, B:160:0x04fe, B:161:0x0503, B:20:0x009a, B:103:0x0341, B:105:0x0349, B:107:0x0354, B:108:0x035a, B:110:0x0360, B:114:0x0373, B:117:0x037f, B:118:0x039c, B:120:0x03a2, B:121:0x03c0, B:123:0x03cc, B:124:0x03e9, B:115:0x0376, B:125:0x03ea, B:126:0x03ef, B:23:0x00c2, B:87:0x0260, B:89:0x0268, B:90:0x028e, B:92:0x0294, B:93:0x02b2, B:94:0x02bd, B:95:0x02c2, B:26:0x00f4, B:34:0x015a, B:37:0x0174, B:39:0x0182, B:41:0x0188, B:43:0x018e, B:48:0x0199, B:50:0x01a7, B:52:0x01ad, B:54:0x01b3, B:56:0x01b9, B:58:0x01c3, B:61:0x01cd, B:62:0x01d1, B:64:0x01d7, B:69:0x01f5, B:71:0x01fb, B:73:0x0201, B:75:0x0207, B:77:0x0213, B:82:0x0224, B:84:0x022e, B:96:0x02c3, B:97:0x02e8, B:99:0x02ee, B:100:0x0309, B:127:0x03f0, B:129:0x03fd, B:132:0x040e, B:134:0x0414, B:136:0x0422, B:162:0x0504, B:30:0x0120), top: B:182:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:160:0x04fe A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:10:0x003b, B:165:0x0535, B:167:0x053d, B:168:0x0559, B:170:0x055f, B:171:0x057a, B:173:0x0580, B:174:0x0592, B:175:0x0596, B:176:0x059f, B:177:0x05a4, B:178:0x05a9, B:17:0x006e, B:139:0x0456, B:141:0x045e, B:143:0x0469, B:144:0x046f, B:146:0x0475, B:150:0x0488, B:153:0x0494, B:154:0x04b1, B:156:0x04b7, B:157:0x04d5, B:158:0x04e0, B:159:0x04fd, B:151:0x048b, B:160:0x04fe, B:161:0x0503, B:20:0x009a, B:103:0x0341, B:105:0x0349, B:107:0x0354, B:108:0x035a, B:110:0x0360, B:114:0x0373, B:117:0x037f, B:118:0x039c, B:120:0x03a2, B:121:0x03c0, B:123:0x03cc, B:124:0x03e9, B:115:0x0376, B:125:0x03ea, B:126:0x03ef, B:23:0x00c2, B:87:0x0260, B:89:0x0268, B:90:0x028e, B:92:0x0294, B:93:0x02b2, B:94:0x02bd, B:95:0x02c2, B:26:0x00f4, B:34:0x015a, B:37:0x0174, B:39:0x0182, B:41:0x0188, B:43:0x018e, B:48:0x0199, B:50:0x01a7, B:52:0x01ad, B:54:0x01b3, B:56:0x01b9, B:58:0x01c3, B:61:0x01cd, B:62:0x01d1, B:64:0x01d7, B:69:0x01f5, B:71:0x01fb, B:73:0x0201, B:75:0x0207, B:77:0x0213, B:82:0x0224, B:84:0x022e, B:96:0x02c3, B:97:0x02e8, B:99:0x02ee, B:100:0x0309, B:127:0x03f0, B:129:0x03fd, B:132:0x040e, B:134:0x0414, B:136:0x0422, B:162:0x0504, B:30:0x0120), top: B:182:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:167:0x053d A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:10:0x003b, B:165:0x0535, B:167:0x053d, B:168:0x0559, B:170:0x055f, B:171:0x057a, B:173:0x0580, B:174:0x0592, B:175:0x0596, B:176:0x059f, B:177:0x05a4, B:178:0x05a9, B:17:0x006e, B:139:0x0456, B:141:0x045e, B:143:0x0469, B:144:0x046f, B:146:0x0475, B:150:0x0488, B:153:0x0494, B:154:0x04b1, B:156:0x04b7, B:157:0x04d5, B:158:0x04e0, B:159:0x04fd, B:151:0x048b, B:160:0x04fe, B:161:0x0503, B:20:0x009a, B:103:0x0341, B:105:0x0349, B:107:0x0354, B:108:0x035a, B:110:0x0360, B:114:0x0373, B:117:0x037f, B:118:0x039c, B:120:0x03a2, B:121:0x03c0, B:123:0x03cc, B:124:0x03e9, B:115:0x0376, B:125:0x03ea, B:126:0x03ef, B:23:0x00c2, B:87:0x0260, B:89:0x0268, B:90:0x028e, B:92:0x0294, B:93:0x02b2, B:94:0x02bd, B:95:0x02c2, B:26:0x00f4, B:34:0x015a, B:37:0x0174, B:39:0x0182, B:41:0x0188, B:43:0x018e, B:48:0x0199, B:50:0x01a7, B:52:0x01ad, B:54:0x01b3, B:56:0x01b9, B:58:0x01c3, B:61:0x01cd, B:62:0x01d1, B:64:0x01d7, B:69:0x01f5, B:71:0x01fb, B:73:0x0201, B:75:0x0207, B:77:0x0213, B:82:0x0224, B:84:0x022e, B:96:0x02c3, B:97:0x02e8, B:99:0x02ee, B:100:0x0309, B:127:0x03f0, B:129:0x03fd, B:132:0x040e, B:134:0x0414, B:136:0x0422, B:162:0x0504, B:30:0x0120), top: B:182:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:177:0x05a4 A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:10:0x003b, B:165:0x0535, B:167:0x053d, B:168:0x0559, B:170:0x055f, B:171:0x057a, B:173:0x0580, B:174:0x0592, B:175:0x0596, B:176:0x059f, B:177:0x05a4, B:178:0x05a9, B:17:0x006e, B:139:0x0456, B:141:0x045e, B:143:0x0469, B:144:0x046f, B:146:0x0475, B:150:0x0488, B:153:0x0494, B:154:0x04b1, B:156:0x04b7, B:157:0x04d5, B:158:0x04e0, B:159:0x04fd, B:151:0x048b, B:160:0x04fe, B:161:0x0503, B:20:0x009a, B:103:0x0341, B:105:0x0349, B:107:0x0354, B:108:0x035a, B:110:0x0360, B:114:0x0373, B:117:0x037f, B:118:0x039c, B:120:0x03a2, B:121:0x03c0, B:123:0x03cc, B:124:0x03e9, B:115:0x0376, B:125:0x03ea, B:126:0x03ef, B:23:0x00c2, B:87:0x0260, B:89:0x0268, B:90:0x028e, B:92:0x0294, B:93:0x02b2, B:94:0x02bd, B:95:0x02c2, B:26:0x00f4, B:34:0x015a, B:37:0x0174, B:39:0x0182, B:41:0x0188, B:43:0x018e, B:48:0x0199, B:50:0x01a7, B:52:0x01ad, B:54:0x01b3, B:56:0x01b9, B:58:0x01c3, B:61:0x01cd, B:62:0x01d1, B:64:0x01d7, B:69:0x01f5, B:71:0x01fb, B:73:0x0201, B:75:0x0207, B:77:0x0213, B:82:0x0224, B:84:0x022e, B:96:0x02c3, B:97:0x02e8, B:99:0x02ee, B:100:0x0309, B:127:0x03f0, B:129:0x03fd, B:132:0x040e, B:134:0x0414, B:136:0x0422, B:162:0x0504, B:30:0x0120), top: B:182:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x01a7 A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:10:0x003b, B:165:0x0535, B:167:0x053d, B:168:0x0559, B:170:0x055f, B:171:0x057a, B:173:0x0580, B:174:0x0592, B:175:0x0596, B:176:0x059f, B:177:0x05a4, B:178:0x05a9, B:17:0x006e, B:139:0x0456, B:141:0x045e, B:143:0x0469, B:144:0x046f, B:146:0x0475, B:150:0x0488, B:153:0x0494, B:154:0x04b1, B:156:0x04b7, B:157:0x04d5, B:158:0x04e0, B:159:0x04fd, B:151:0x048b, B:160:0x04fe, B:161:0x0503, B:20:0x009a, B:103:0x0341, B:105:0x0349, B:107:0x0354, B:108:0x035a, B:110:0x0360, B:114:0x0373, B:117:0x037f, B:118:0x039c, B:120:0x03a2, B:121:0x03c0, B:123:0x03cc, B:124:0x03e9, B:115:0x0376, B:125:0x03ea, B:126:0x03ef, B:23:0x00c2, B:87:0x0260, B:89:0x0268, B:90:0x028e, B:92:0x0294, B:93:0x02b2, B:94:0x02bd, B:95:0x02c2, B:26:0x00f4, B:34:0x015a, B:37:0x0174, B:39:0x0182, B:41:0x0188, B:43:0x018e, B:48:0x0199, B:50:0x01a7, B:52:0x01ad, B:54:0x01b3, B:56:0x01b9, B:58:0x01c3, B:61:0x01cd, B:62:0x01d1, B:64:0x01d7, B:69:0x01f5, B:71:0x01fb, B:73:0x0201, B:75:0x0207, B:77:0x0213, B:82:0x0224, B:84:0x022e, B:96:0x02c3, B:97:0x02e8, B:99:0x02ee, B:100:0x0309, B:127:0x03f0, B:129:0x03fd, B:132:0x040e, B:134:0x0414, B:136:0x0422, B:162:0x0504, B:30:0x0120), top: B:182:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x01f4  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x01fb A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:10:0x003b, B:165:0x0535, B:167:0x053d, B:168:0x0559, B:170:0x055f, B:171:0x057a, B:173:0x0580, B:174:0x0592, B:175:0x0596, B:176:0x059f, B:177:0x05a4, B:178:0x05a9, B:17:0x006e, B:139:0x0456, B:141:0x045e, B:143:0x0469, B:144:0x046f, B:146:0x0475, B:150:0x0488, B:153:0x0494, B:154:0x04b1, B:156:0x04b7, B:157:0x04d5, B:158:0x04e0, B:159:0x04fd, B:151:0x048b, B:160:0x04fe, B:161:0x0503, B:20:0x009a, B:103:0x0341, B:105:0x0349, B:107:0x0354, B:108:0x035a, B:110:0x0360, B:114:0x0373, B:117:0x037f, B:118:0x039c, B:120:0x03a2, B:121:0x03c0, B:123:0x03cc, B:124:0x03e9, B:115:0x0376, B:125:0x03ea, B:126:0x03ef, B:23:0x00c2, B:87:0x0260, B:89:0x0268, B:90:0x028e, B:92:0x0294, B:93:0x02b2, B:94:0x02bd, B:95:0x02c2, B:26:0x00f4, B:34:0x015a, B:37:0x0174, B:39:0x0182, B:41:0x0188, B:43:0x018e, B:48:0x0199, B:50:0x01a7, B:52:0x01ad, B:54:0x01b3, B:56:0x01b9, B:58:0x01c3, B:61:0x01cd, B:62:0x01d1, B:64:0x01d7, B:69:0x01f5, B:71:0x01fb, B:73:0x0201, B:75:0x0207, B:77:0x0213, B:82:0x0224, B:84:0x022e, B:96:0x02c3, B:97:0x02e8, B:99:0x02ee, B:100:0x0309, B:127:0x03f0, B:129:0x03fd, B:132:0x040e, B:134:0x0414, B:136:0x0422, B:162:0x0504, B:30:0x0120), top: B:182:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0200  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0221  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0224 A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:10:0x003b, B:165:0x0535, B:167:0x053d, B:168:0x0559, B:170:0x055f, B:171:0x057a, B:173:0x0580, B:174:0x0592, B:175:0x0596, B:176:0x059f, B:177:0x05a4, B:178:0x05a9, B:17:0x006e, B:139:0x0456, B:141:0x045e, B:143:0x0469, B:144:0x046f, B:146:0x0475, B:150:0x0488, B:153:0x0494, B:154:0x04b1, B:156:0x04b7, B:157:0x04d5, B:158:0x04e0, B:159:0x04fd, B:151:0x048b, B:160:0x04fe, B:161:0x0503, B:20:0x009a, B:103:0x0341, B:105:0x0349, B:107:0x0354, B:108:0x035a, B:110:0x0360, B:114:0x0373, B:117:0x037f, B:118:0x039c, B:120:0x03a2, B:121:0x03c0, B:123:0x03cc, B:124:0x03e9, B:115:0x0376, B:125:0x03ea, B:126:0x03ef, B:23:0x00c2, B:87:0x0260, B:89:0x0268, B:90:0x028e, B:92:0x0294, B:93:0x02b2, B:94:0x02bd, B:95:0x02c2, B:26:0x00f4, B:34:0x015a, B:37:0x0174, B:39:0x0182, B:41:0x0188, B:43:0x018e, B:48:0x0199, B:50:0x01a7, B:52:0x01ad, B:54:0x01b3, B:56:0x01b9, B:58:0x01c3, B:61:0x01cd, B:62:0x01d1, B:64:0x01d7, B:69:0x01f5, B:71:0x01fb, B:73:0x0201, B:75:0x0207, B:77:0x0213, B:82:0x0224, B:84:0x022e, B:96:0x02c3, B:97:0x02e8, B:99:0x02ee, B:100:0x0309, B:127:0x03f0, B:129:0x03fd, B:132:0x040e, B:134:0x0414, B:136:0x0422, B:162:0x0504, B:30:0x0120), top: B:182:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0268 A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:10:0x003b, B:165:0x0535, B:167:0x053d, B:168:0x0559, B:170:0x055f, B:171:0x057a, B:173:0x0580, B:174:0x0592, B:175:0x0596, B:176:0x059f, B:177:0x05a4, B:178:0x05a9, B:17:0x006e, B:139:0x0456, B:141:0x045e, B:143:0x0469, B:144:0x046f, B:146:0x0475, B:150:0x0488, B:153:0x0494, B:154:0x04b1, B:156:0x04b7, B:157:0x04d5, B:158:0x04e0, B:159:0x04fd, B:151:0x048b, B:160:0x04fe, B:161:0x0503, B:20:0x009a, B:103:0x0341, B:105:0x0349, B:107:0x0354, B:108:0x035a, B:110:0x0360, B:114:0x0373, B:117:0x037f, B:118:0x039c, B:120:0x03a2, B:121:0x03c0, B:123:0x03cc, B:124:0x03e9, B:115:0x0376, B:125:0x03ea, B:126:0x03ef, B:23:0x00c2, B:87:0x0260, B:89:0x0268, B:90:0x028e, B:92:0x0294, B:93:0x02b2, B:94:0x02bd, B:95:0x02c2, B:26:0x00f4, B:34:0x015a, B:37:0x0174, B:39:0x0182, B:41:0x0188, B:43:0x018e, B:48:0x0199, B:50:0x01a7, B:52:0x01ad, B:54:0x01b3, B:56:0x01b9, B:58:0x01c3, B:61:0x01cd, B:62:0x01d1, B:64:0x01d7, B:69:0x01f5, B:71:0x01fb, B:73:0x0201, B:75:0x0207, B:77:0x0213, B:82:0x0224, B:84:0x022e, B:96:0x02c3, B:97:0x02e8, B:99:0x02ee, B:100:0x0309, B:127:0x03f0, B:129:0x03fd, B:132:0x040e, B:134:0x0414, B:136:0x0422, B:162:0x0504, B:30:0x0120), top: B:182:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:94:0x02bd A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:10:0x003b, B:165:0x0535, B:167:0x053d, B:168:0x0559, B:170:0x055f, B:171:0x057a, B:173:0x0580, B:174:0x0592, B:175:0x0596, B:176:0x059f, B:177:0x05a4, B:178:0x05a9, B:17:0x006e, B:139:0x0456, B:141:0x045e, B:143:0x0469, B:144:0x046f, B:146:0x0475, B:150:0x0488, B:153:0x0494, B:154:0x04b1, B:156:0x04b7, B:157:0x04d5, B:158:0x04e0, B:159:0x04fd, B:151:0x048b, B:160:0x04fe, B:161:0x0503, B:20:0x009a, B:103:0x0341, B:105:0x0349, B:107:0x0354, B:108:0x035a, B:110:0x0360, B:114:0x0373, B:117:0x037f, B:118:0x039c, B:120:0x03a2, B:121:0x03c0, B:123:0x03cc, B:124:0x03e9, B:115:0x0376, B:125:0x03ea, B:126:0x03ef, B:23:0x00c2, B:87:0x0260, B:89:0x0268, B:90:0x028e, B:92:0x0294, B:93:0x02b2, B:94:0x02bd, B:95:0x02c2, B:26:0x00f4, B:34:0x015a, B:37:0x0174, B:39:0x0182, B:41:0x0188, B:43:0x018e, B:48:0x0199, B:50:0x01a7, B:52:0x01ad, B:54:0x01b3, B:56:0x01b9, B:58:0x01c3, B:61:0x01cd, B:62:0x01d1, B:64:0x01d7, B:69:0x01f5, B:71:0x01fb, B:73:0x0201, B:75:0x0207, B:77:0x0213, B:82:0x0224, B:84:0x022e, B:96:0x02c3, B:97:0x02e8, B:99:0x02ee, B:100:0x0309, B:127:0x03f0, B:129:0x03fd, B:132:0x040e, B:134:0x0414, B:136:0x0422, B:162:0x0504, B:30:0x0120), top: B:182:0x0013 }] */
        /* JADX WARN: Type inference failed for: r11v5, types: [kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r20v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r26v0, types: [boolean] */
        /* JADX WARN: Type inference failed for: r4v16, types: [kotlin.coroutines.Continuation] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r30) throws com.meijer.mobile.digitalshopping.api.timeslots.TimeSlotNotFoundException {
            /*
                Method dump skipped, instructions count: 1471
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: tl.h.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lul/d;", "<anonymous>", "(Lmv/O;)Lul/d;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.timeslots.TimeSlotRepository$getFulfillmentSchedule$3", f = "TimeSlotRepository.kt", l = {297, 314, 330, 366, 392}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super FulfillmentSchedule>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f163149a;

        /* renamed from: b, reason: collision with root package name */
        Object f163150b;

        /* renamed from: c, reason: collision with root package name */
        Object f163151c;

        /* renamed from: d, reason: collision with root package name */
        Object f163152d;

        /* renamed from: e, reason: collision with root package name */
        Object f163153e;

        /* renamed from: f, reason: collision with root package name */
        Object f163154f;

        /* renamed from: g, reason: collision with root package name */
        Object f163155g;

        /* renamed from: h, reason: collision with root package name */
        int f163156h;

        /* renamed from: i, reason: collision with root package name */
        int f163157i;

        /* renamed from: j, reason: collision with root package name */
        int f163158j;

        /* renamed from: k, reason: collision with root package name */
        int f163159k;

        /* renamed from: l, reason: collision with root package name */
        int f163160l;

        /* renamed from: m, reason: collision with root package name */
        int f163161m;

        /* renamed from: n, reason: collision with root package name */
        int f163162n;

        /* renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f163163o;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ShoppingCart f163165q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f163166r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ShoppingCart shoppingCart, String str, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f163165q = shoppingCart;
            this.f163166r = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = h.this.new d(this.f163165q, this.f163166r, continuation);
            dVar.f163163o = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super FulfillmentSchedule> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:80:0x0245, code lost:
        
            if (r0 == r2) goto L81;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0332 A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:10:0x003b, B:109:0x032a, B:111:0x0332, B:112:0x034e, B:114:0x0354, B:115:0x036f, B:117:0x0375, B:118:0x0387, B:119:0x038b, B:162:0x053c, B:120:0x0396, B:121:0x039b, B:17:0x006d, B:82:0x024a, B:84:0x0252, B:86:0x025d, B:87:0x0263, B:89:0x0269, B:93:0x027c, B:96:0x0288, B:97:0x02a5, B:99:0x02ab, B:100:0x02c9, B:101:0x02d4, B:102:0x02f1, B:94:0x027f, B:103:0x02f2, B:104:0x02f7, B:20:0x0099, B:143:0x04b4, B:145:0x04bc, B:147:0x04c7, B:148:0x04cd, B:150:0x04d3, B:154:0x04e6, B:157:0x04f2, B:158:0x050f, B:160:0x0515, B:161:0x0533, B:163:0x0541, B:164:0x055e, B:155:0x04e9, B:165:0x055f, B:166:0x0564, B:23:0x00c1, B:127:0x03d6, B:129:0x03de, B:130:0x0404, B:132:0x040a, B:133:0x0428, B:134:0x0434, B:135:0x0439, B:26:0x00f3, B:34:0x0152, B:37:0x016c, B:39:0x017a, B:41:0x0180, B:43:0x0186, B:48:0x0191, B:50:0x019f, B:52:0x01a5, B:54:0x01ab, B:56:0x01b1, B:58:0x01bb, B:61:0x01c5, B:62:0x01c9, B:64:0x01cf, B:71:0x01fc, B:73:0x0202, B:75:0x0208, B:77:0x020e, B:79:0x021a, B:105:0x02f8, B:122:0x039c, B:124:0x03a6, B:136:0x043a, B:137:0x045f, B:139:0x0465, B:140:0x0480, B:30:0x0119), top: B:170:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:120:0x0396 A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:10:0x003b, B:109:0x032a, B:111:0x0332, B:112:0x034e, B:114:0x0354, B:115:0x036f, B:117:0x0375, B:118:0x0387, B:119:0x038b, B:162:0x053c, B:120:0x0396, B:121:0x039b, B:17:0x006d, B:82:0x024a, B:84:0x0252, B:86:0x025d, B:87:0x0263, B:89:0x0269, B:93:0x027c, B:96:0x0288, B:97:0x02a5, B:99:0x02ab, B:100:0x02c9, B:101:0x02d4, B:102:0x02f1, B:94:0x027f, B:103:0x02f2, B:104:0x02f7, B:20:0x0099, B:143:0x04b4, B:145:0x04bc, B:147:0x04c7, B:148:0x04cd, B:150:0x04d3, B:154:0x04e6, B:157:0x04f2, B:158:0x050f, B:160:0x0515, B:161:0x0533, B:163:0x0541, B:164:0x055e, B:155:0x04e9, B:165:0x055f, B:166:0x0564, B:23:0x00c1, B:127:0x03d6, B:129:0x03de, B:130:0x0404, B:132:0x040a, B:133:0x0428, B:134:0x0434, B:135:0x0439, B:26:0x00f3, B:34:0x0152, B:37:0x016c, B:39:0x017a, B:41:0x0180, B:43:0x0186, B:48:0x0191, B:50:0x019f, B:52:0x01a5, B:54:0x01ab, B:56:0x01b1, B:58:0x01bb, B:61:0x01c5, B:62:0x01c9, B:64:0x01cf, B:71:0x01fc, B:73:0x0202, B:75:0x0208, B:77:0x020e, B:79:0x021a, B:105:0x02f8, B:122:0x039c, B:124:0x03a6, B:136:0x043a, B:137:0x045f, B:139:0x0465, B:140:0x0480, B:30:0x0119), top: B:170:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:124:0x03a6 A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:10:0x003b, B:109:0x032a, B:111:0x0332, B:112:0x034e, B:114:0x0354, B:115:0x036f, B:117:0x0375, B:118:0x0387, B:119:0x038b, B:162:0x053c, B:120:0x0396, B:121:0x039b, B:17:0x006d, B:82:0x024a, B:84:0x0252, B:86:0x025d, B:87:0x0263, B:89:0x0269, B:93:0x027c, B:96:0x0288, B:97:0x02a5, B:99:0x02ab, B:100:0x02c9, B:101:0x02d4, B:102:0x02f1, B:94:0x027f, B:103:0x02f2, B:104:0x02f7, B:20:0x0099, B:143:0x04b4, B:145:0x04bc, B:147:0x04c7, B:148:0x04cd, B:150:0x04d3, B:154:0x04e6, B:157:0x04f2, B:158:0x050f, B:160:0x0515, B:161:0x0533, B:163:0x0541, B:164:0x055e, B:155:0x04e9, B:165:0x055f, B:166:0x0564, B:23:0x00c1, B:127:0x03d6, B:129:0x03de, B:130:0x0404, B:132:0x040a, B:133:0x0428, B:134:0x0434, B:135:0x0439, B:26:0x00f3, B:34:0x0152, B:37:0x016c, B:39:0x017a, B:41:0x0180, B:43:0x0186, B:48:0x0191, B:50:0x019f, B:52:0x01a5, B:54:0x01ab, B:56:0x01b1, B:58:0x01bb, B:61:0x01c5, B:62:0x01c9, B:64:0x01cf, B:71:0x01fc, B:73:0x0202, B:75:0x0208, B:77:0x020e, B:79:0x021a, B:105:0x02f8, B:122:0x039c, B:124:0x03a6, B:136:0x043a, B:137:0x045f, B:139:0x0465, B:140:0x0480, B:30:0x0119), top: B:170:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:129:0x03de A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:10:0x003b, B:109:0x032a, B:111:0x0332, B:112:0x034e, B:114:0x0354, B:115:0x036f, B:117:0x0375, B:118:0x0387, B:119:0x038b, B:162:0x053c, B:120:0x0396, B:121:0x039b, B:17:0x006d, B:82:0x024a, B:84:0x0252, B:86:0x025d, B:87:0x0263, B:89:0x0269, B:93:0x027c, B:96:0x0288, B:97:0x02a5, B:99:0x02ab, B:100:0x02c9, B:101:0x02d4, B:102:0x02f1, B:94:0x027f, B:103:0x02f2, B:104:0x02f7, B:20:0x0099, B:143:0x04b4, B:145:0x04bc, B:147:0x04c7, B:148:0x04cd, B:150:0x04d3, B:154:0x04e6, B:157:0x04f2, B:158:0x050f, B:160:0x0515, B:161:0x0533, B:163:0x0541, B:164:0x055e, B:155:0x04e9, B:165:0x055f, B:166:0x0564, B:23:0x00c1, B:127:0x03d6, B:129:0x03de, B:130:0x0404, B:132:0x040a, B:133:0x0428, B:134:0x0434, B:135:0x0439, B:26:0x00f3, B:34:0x0152, B:37:0x016c, B:39:0x017a, B:41:0x0180, B:43:0x0186, B:48:0x0191, B:50:0x019f, B:52:0x01a5, B:54:0x01ab, B:56:0x01b1, B:58:0x01bb, B:61:0x01c5, B:62:0x01c9, B:64:0x01cf, B:71:0x01fc, B:73:0x0202, B:75:0x0208, B:77:0x020e, B:79:0x021a, B:105:0x02f8, B:122:0x039c, B:124:0x03a6, B:136:0x043a, B:137:0x045f, B:139:0x0465, B:140:0x0480, B:30:0x0119), top: B:170:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:134:0x0434 A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:10:0x003b, B:109:0x032a, B:111:0x0332, B:112:0x034e, B:114:0x0354, B:115:0x036f, B:117:0x0375, B:118:0x0387, B:119:0x038b, B:162:0x053c, B:120:0x0396, B:121:0x039b, B:17:0x006d, B:82:0x024a, B:84:0x0252, B:86:0x025d, B:87:0x0263, B:89:0x0269, B:93:0x027c, B:96:0x0288, B:97:0x02a5, B:99:0x02ab, B:100:0x02c9, B:101:0x02d4, B:102:0x02f1, B:94:0x027f, B:103:0x02f2, B:104:0x02f7, B:20:0x0099, B:143:0x04b4, B:145:0x04bc, B:147:0x04c7, B:148:0x04cd, B:150:0x04d3, B:154:0x04e6, B:157:0x04f2, B:158:0x050f, B:160:0x0515, B:161:0x0533, B:163:0x0541, B:164:0x055e, B:155:0x04e9, B:165:0x055f, B:166:0x0564, B:23:0x00c1, B:127:0x03d6, B:129:0x03de, B:130:0x0404, B:132:0x040a, B:133:0x0428, B:134:0x0434, B:135:0x0439, B:26:0x00f3, B:34:0x0152, B:37:0x016c, B:39:0x017a, B:41:0x0180, B:43:0x0186, B:48:0x0191, B:50:0x019f, B:52:0x01a5, B:54:0x01ab, B:56:0x01b1, B:58:0x01bb, B:61:0x01c5, B:62:0x01c9, B:64:0x01cf, B:71:0x01fc, B:73:0x0202, B:75:0x0208, B:77:0x020e, B:79:0x021a, B:105:0x02f8, B:122:0x039c, B:124:0x03a6, B:136:0x043a, B:137:0x045f, B:139:0x0465, B:140:0x0480, B:30:0x0119), top: B:170:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:136:0x043a A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:10:0x003b, B:109:0x032a, B:111:0x0332, B:112:0x034e, B:114:0x0354, B:115:0x036f, B:117:0x0375, B:118:0x0387, B:119:0x038b, B:162:0x053c, B:120:0x0396, B:121:0x039b, B:17:0x006d, B:82:0x024a, B:84:0x0252, B:86:0x025d, B:87:0x0263, B:89:0x0269, B:93:0x027c, B:96:0x0288, B:97:0x02a5, B:99:0x02ab, B:100:0x02c9, B:101:0x02d4, B:102:0x02f1, B:94:0x027f, B:103:0x02f2, B:104:0x02f7, B:20:0x0099, B:143:0x04b4, B:145:0x04bc, B:147:0x04c7, B:148:0x04cd, B:150:0x04d3, B:154:0x04e6, B:157:0x04f2, B:158:0x050f, B:160:0x0515, B:161:0x0533, B:163:0x0541, B:164:0x055e, B:155:0x04e9, B:165:0x055f, B:166:0x0564, B:23:0x00c1, B:127:0x03d6, B:129:0x03de, B:130:0x0404, B:132:0x040a, B:133:0x0428, B:134:0x0434, B:135:0x0439, B:26:0x00f3, B:34:0x0152, B:37:0x016c, B:39:0x017a, B:41:0x0180, B:43:0x0186, B:48:0x0191, B:50:0x019f, B:52:0x01a5, B:54:0x01ab, B:56:0x01b1, B:58:0x01bb, B:61:0x01c5, B:62:0x01c9, B:64:0x01cf, B:71:0x01fc, B:73:0x0202, B:75:0x0208, B:77:0x020e, B:79:0x021a, B:105:0x02f8, B:122:0x039c, B:124:0x03a6, B:136:0x043a, B:137:0x045f, B:139:0x0465, B:140:0x0480, B:30:0x0119), top: B:170:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:145:0x04bc A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:10:0x003b, B:109:0x032a, B:111:0x0332, B:112:0x034e, B:114:0x0354, B:115:0x036f, B:117:0x0375, B:118:0x0387, B:119:0x038b, B:162:0x053c, B:120:0x0396, B:121:0x039b, B:17:0x006d, B:82:0x024a, B:84:0x0252, B:86:0x025d, B:87:0x0263, B:89:0x0269, B:93:0x027c, B:96:0x0288, B:97:0x02a5, B:99:0x02ab, B:100:0x02c9, B:101:0x02d4, B:102:0x02f1, B:94:0x027f, B:103:0x02f2, B:104:0x02f7, B:20:0x0099, B:143:0x04b4, B:145:0x04bc, B:147:0x04c7, B:148:0x04cd, B:150:0x04d3, B:154:0x04e6, B:157:0x04f2, B:158:0x050f, B:160:0x0515, B:161:0x0533, B:163:0x0541, B:164:0x055e, B:155:0x04e9, B:165:0x055f, B:166:0x0564, B:23:0x00c1, B:127:0x03d6, B:129:0x03de, B:130:0x0404, B:132:0x040a, B:133:0x0428, B:134:0x0434, B:135:0x0439, B:26:0x00f3, B:34:0x0152, B:37:0x016c, B:39:0x017a, B:41:0x0180, B:43:0x0186, B:48:0x0191, B:50:0x019f, B:52:0x01a5, B:54:0x01ab, B:56:0x01b1, B:58:0x01bb, B:61:0x01c5, B:62:0x01c9, B:64:0x01cf, B:71:0x01fc, B:73:0x0202, B:75:0x0208, B:77:0x020e, B:79:0x021a, B:105:0x02f8, B:122:0x039c, B:124:0x03a6, B:136:0x043a, B:137:0x045f, B:139:0x0465, B:140:0x0480, B:30:0x0119), top: B:170:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:165:0x055f A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:10:0x003b, B:109:0x032a, B:111:0x0332, B:112:0x034e, B:114:0x0354, B:115:0x036f, B:117:0x0375, B:118:0x0387, B:119:0x038b, B:162:0x053c, B:120:0x0396, B:121:0x039b, B:17:0x006d, B:82:0x024a, B:84:0x0252, B:86:0x025d, B:87:0x0263, B:89:0x0269, B:93:0x027c, B:96:0x0288, B:97:0x02a5, B:99:0x02ab, B:100:0x02c9, B:101:0x02d4, B:102:0x02f1, B:94:0x027f, B:103:0x02f2, B:104:0x02f7, B:20:0x0099, B:143:0x04b4, B:145:0x04bc, B:147:0x04c7, B:148:0x04cd, B:150:0x04d3, B:154:0x04e6, B:157:0x04f2, B:158:0x050f, B:160:0x0515, B:161:0x0533, B:163:0x0541, B:164:0x055e, B:155:0x04e9, B:165:0x055f, B:166:0x0564, B:23:0x00c1, B:127:0x03d6, B:129:0x03de, B:130:0x0404, B:132:0x040a, B:133:0x0428, B:134:0x0434, B:135:0x0439, B:26:0x00f3, B:34:0x0152, B:37:0x016c, B:39:0x017a, B:41:0x0180, B:43:0x0186, B:48:0x0191, B:50:0x019f, B:52:0x01a5, B:54:0x01ab, B:56:0x01b1, B:58:0x01bb, B:61:0x01c5, B:62:0x01c9, B:64:0x01cf, B:71:0x01fc, B:73:0x0202, B:75:0x0208, B:77:0x020e, B:79:0x021a, B:105:0x02f8, B:122:0x039c, B:124:0x03a6, B:136:0x043a, B:137:0x045f, B:139:0x0465, B:140:0x0480, B:30:0x0119), top: B:170:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x019f A[Catch: Exception -> 0x0042, TryCatch #0 {Exception -> 0x0042, blocks: (B:10:0x003b, B:109:0x032a, B:111:0x0332, B:112:0x034e, B:114:0x0354, B:115:0x036f, B:117:0x0375, B:118:0x0387, B:119:0x038b, B:162:0x053c, B:120:0x0396, B:121:0x039b, B:17:0x006d, B:82:0x024a, B:84:0x0252, B:86:0x025d, B:87:0x0263, B:89:0x0269, B:93:0x027c, B:96:0x0288, B:97:0x02a5, B:99:0x02ab, B:100:0x02c9, B:101:0x02d4, B:102:0x02f1, B:94:0x027f, B:103:0x02f2, B:104:0x02f7, B:20:0x0099, B:143:0x04b4, B:145:0x04bc, B:147:0x04c7, B:148:0x04cd, B:150:0x04d3, B:154:0x04e6, B:157:0x04f2, B:158:0x050f, B:160:0x0515, B:161:0x0533, B:163:0x0541, B:164:0x055e, B:155:0x04e9, B:165:0x055f, B:166:0x0564, B:23:0x00c1, B:127:0x03d6, B:129:0x03de, B:130:0x0404, B:132:0x040a, B:133:0x0428, B:134:0x0434, B:135:0x0439, B:26:0x00f3, B:34:0x0152, B:37:0x016c, B:39:0x017a, B:41:0x0180, B:43:0x0186, B:48:0x0191, B:50:0x019f, B:52:0x01a5, B:54:0x01ab, B:56:0x01b1, B:58:0x01bb, B:61:0x01c5, B:62:0x01c9, B:64:0x01cf, B:71:0x01fc, B:73:0x0202, B:75:0x0208, B:77:0x020e, B:79:0x021a, B:105:0x02f8, B:122:0x039c, B:124:0x03a6, B:136:0x043a, B:137:0x045f, B:139:0x0465, B:140:0x0480, B:30:0x0119), top: B:170:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x01e7  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x01ec  */
        /* JADX WARN: Type inference failed for: r10v8, types: [kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r13v3, types: [kotlin.coroutines.Continuation] */
        /* JADX WARN: Type inference failed for: r18v0, types: [boolean] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r28) throws com.meijer.mobile.digitalshopping.api.timeslots.TimeSlotNotFoundException {
            /*
                Method dump skipped, instructions count: 1402
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: tl.h.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "Lretrofit2/Response;", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/GetReservationSlotsOmsResponse;", "<anonymous>", "(Lmv/O;)Lretrofit2/Response;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.timeslots.TimeSlotRepository$getOmsReservationSlotsV1$2", f = "TimeSlotRepository.kt", l = {458}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Response<GetReservationSlotsOmsResponse>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f163167a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f163169c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ShoppingCart f163170d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, ShoppingCart shoppingCart, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f163169c = str;
            this.f163170d = shoppingCart;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new e(this.f163169c, this.f163170d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Response<GetReservationSlotsOmsResponse>> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f163167a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            tl.g gVar = h.this.timeSlotOmsApi;
            String str = this.f163169c;
            String partnerEligibility = this.f163170d.getPartnerEligibility();
            if (partnerEligibility == null) {
                partnerEligibility = "";
            }
            GetReservationSlotsOmsV1Request getReservationSlotsOmsV1Request = new GetReservationSlotsOmsV1Request(partnerEligibility, this.f163170d.getCode(), String.valueOf(this.f163170d.getPointOfService().getStoreId()), new OmsCustomerRequest(h.this.userManager.a(), h.this.userManager.a(), h.this.userManager.h(), h.this.userManager.p(), h.this.userManager.q(), "0000000000"));
            this.f163167a = 1;
            Object objC = gVar.c(str, getReservationSlotsOmsV1Request, this);
            if (objC == objF) {
                return objF;
            }
            return objC;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmv/O;", "Lretrofit2/Response;", "", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/GetReservationSlotsOmsResponse;", "<anonymous>", "(Lmv/O;)Lretrofit2/Response;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.timeslots.TimeSlotRepository$getOmsReservationSlotsV2$2", f = "TimeSlotRepository.kt", l = {423}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Response<List<? extends GetReservationSlotsOmsResponse>>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f163171a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f163173c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ShoppingCart f163174d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f163175e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<DeliveryPartner> f163176f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f163177g;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Response<List<? extends GetReservationSlotsOmsResponse>>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super Response<List<GetReservationSlotsOmsResponse>>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, ShoppingCart shoppingCart, boolean z10, List<DeliveryPartner> list, boolean z11, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f163173c = str;
            this.f163174d = shoppingCart;
            this.f163175e = z10;
            this.f163176f = list;
            this.f163177g = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new f(this.f163173c, this.f163174d, this.f163175e, this.f163176f, this.f163177g, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super Response<List<GetReservationSlotsOmsResponse>>> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String strA;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f163171a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            tl.g gVar = h.this.timeSlotOmsApi;
            String str = this.f163173c;
            String code = this.f163174d.getCode();
            String strA2 = h.this.userManager.a();
            if (this.f163175e) {
                strA = "";
            } else {
                strA = h.this.userManager.a();
            }
            GetReservationSlotsOmsV2Request getReservationSlotsOmsV2Request = new GetReservationSlotsOmsV2Request(code, new OmsCustomerRequest(strA2, strA, h.this.userManager.h(), h.this.userManager.p(), h.this.userManager.q(), "0000000000"), this.f163176f);
            boolean z10 = this.f163177g;
            boolean z11 = this.f163175e;
            this.f163171a = 1;
            Object objD = gVar.d(str, getReservationSlotsOmsV2Request, z10, z11, this);
            if (objD == objF) {
                return objF;
            }
            return objD;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Ltl/a;", "<anonymous>", "(Lmv/O;)Ltl/a;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.timeslots.TimeSlotRepository$getTimeSlots$2", f = "TimeSlotRepository.kt", l = {709, 103}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super FulfillmentSlotSet>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f163178a;

        /* renamed from: b, reason: collision with root package name */
        Object f163179b;

        /* renamed from: c, reason: collision with root package name */
        Object f163180c;

        /* renamed from: d, reason: collision with root package name */
        Object f163181d;

        /* renamed from: e, reason: collision with root package name */
        Object f163182e;

        /* renamed from: f, reason: collision with root package name */
        Object f163183f;

        /* renamed from: g, reason: collision with root package name */
        Object f163184g;

        /* renamed from: h, reason: collision with root package name */
        Object f163185h;

        /* renamed from: i, reason: collision with root package name */
        Object f163186i;

        /* renamed from: j, reason: collision with root package name */
        Object f163187j;

        /* renamed from: k, reason: collision with root package name */
        Object f163188k;

        /* renamed from: l, reason: collision with root package name */
        int f163189l;

        /* renamed from: m, reason: collision with root package name */
        int f163190m;

        /* renamed from: n, reason: collision with root package name */
        int f163191n;

        /* renamed from: o, reason: collision with root package name */
        int f163192o;

        /* renamed from: p, reason: collision with root package name */
        int f163193p;

        /* renamed from: q, reason: collision with root package name */
        int f163194q;

        /* renamed from: r, reason: collision with root package name */
        boolean f163195r;

        /* renamed from: s, reason: collision with root package name */
        int f163196s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f163197t;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ ShoppingCart f163199v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ Duration f163200w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ Instant f163201x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ShoppingCart shoppingCart, Duration duration, Instant instant, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f163199v = shoppingCart;
            this.f163200w = duration;
            this.f163201x = instant;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = h.this.new g(this.f163199v, this.f163200w, this.f163201x, continuation);
            gVar.f163197t = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super FulfillmentSlotSet> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0145 A[Catch: all -> 0x015c, TryCatch #4 {all -> 0x015c, blocks: (B:36:0x013f, B:38:0x0145, B:41:0x0160, B:43:0x0166, B:44:0x0179, B:48:0x0188, B:47:0x0180), top: B:60:0x013f }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0166 A[Catch: all -> 0x015c, TryCatch #4 {all -> 0x015c, blocks: (B:36:0x013f, B:38:0x0145, B:41:0x0160, B:43:0x0166, B:44:0x0179, B:48:0x0188, B:47:0x0180), top: B:60:0x013f }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0180 A[Catch: all -> 0x015c, TryCatch #4 {all -> 0x015c, blocks: (B:36:0x013f, B:38:0x0145, B:41:0x0160, B:43:0x0166, B:44:0x0179, B:48:0x0188, B:47:0x0180), top: B:60:0x013f }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 404
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: tl.h.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.timeslots.TimeSlotRepository", f = "TimeSlotRepository.kt", l = {BinsView.TOTE_WIDTH_DP}, m = "getTimeSlotsFromServer")
    /* renamed from: tl.h$h, reason: collision with other inner class name */
    static final class C2576h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f163202a;

        /* renamed from: b, reason: collision with root package name */
        Object f163203b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f163204c;

        /* renamed from: e, reason: collision with root package name */
        int f163206e;

        C2576h(Continuation<? super C2576h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f163204c = obj;
            this.f163206e |= Integer.MIN_VALUE;
            return h.this.t(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "Lretrofit2/Response;", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/Schedules;", "<anonymous>", "(Lmv/O;)Lretrofit2/Response;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.timeslots.TimeSlotRepository$getTimeslotReservationSlots$2", f = "TimeSlotRepository.kt", l = {530}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Response<Schedules>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f163207a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ BearerToken f163209c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ShoppingCart f163210d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(BearerToken bearerToken, ShoppingCart shoppingCart, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f163209c = bearerToken;
            this.f163210d = shoppingCart;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new i(this.f163209c, this.f163210d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Response<Schedules>> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String code;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f163207a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return obj;
            }
            ResultKt.b(obj);
            InterfaceC17272c interfaceC17272c = h.this.timeSlotApi;
            BearerToken bearerToken = this.f163209c;
            Integer mfcStoreId = this.f163210d.getPointOfService().getMfcStoreId();
            String deliveryPartner = this.f163210d.getPointOfService().getDeliveryPartner();
            DeliveryMode deliveryMode = this.f163210d.getDeliveryMode();
            if (deliveryMode == null || (code = deliveryMode.getCode()) == null) {
                code = "pickup";
            }
            String fulfillmentEligibility = this.f163210d.getFulfillmentEligibility();
            if (!h.this.featureManager.e(AbstractC18503f.C18511i.f172882h)) {
                fulfillmentEligibility = null;
            }
            String curbsidePartner = this.f163210d.getPointOfService().getCurbsidePartner();
            String strValueOf = String.valueOf(this.f163210d.getPointOfService().getStoreId());
            CustomerAddress deliveryAddress = this.f163210d.getDeliveryAddress();
            TimeSlotsRequestDeliveryAddress timeSlotsRequestDeliveryAddress = deliveryAddress != null ? new TimeSlotsRequestDeliveryAddress(deliveryAddress.getLine1() + ' ' + deliveryAddress.getLine2(), deliveryAddress.getTown(), deliveryAddress.getRegion().getIsoCodeShort(), deliveryAddress.getPostalCode()) : null;
            List<Entry> listP = this.f163210d.p();
            ArrayList arrayList = new ArrayList(CollectionsKt.x(listP, 10));
            for (Entry entry : listP) {
                String code2 = entry.m().getCode();
                String upcType = entry.m().getUpcType();
                if (upcType == null) {
                    upcType = "";
                }
                arrayList.add(new LineItem(code2, upcType, entry.getActualQuantity(), Boxing.a(entry.m().getIsAlcohol())));
            }
            FulfillmentSlotRequest fulfillmentSlotRequest = new FulfillmentSlotRequest(strValueOf, timeSlotsRequestDeliveryAddress, null, null, arrayList, 12, null);
            this.f163207a = 1;
            Object objB = interfaceC17272c.b(bearerToken, mfcStoreId, deliveryPartner, code, fulfillmentEligibility, curbsidePartner, fulfillmentSlotRequest, this);
            return objB == objF ? objF : objB;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lul/e;", "<anonymous>", "(Lmv/O;)Lul/e;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.timeslots.TimeSlotRepository$validateDtmReservationSlot$2", f = "TimeSlotRepository.kt", l = {660}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super ReservationSlotValidation>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f163211a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f163213c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ShoppingCart f163214d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FulfillmentSlot f163215e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, ShoppingCart shoppingCart, FulfillmentSlot fulfillmentSlot, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f163213c = str;
            this.f163214d = shoppingCart;
            this.f163215e = fulfillmentSlot;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new j(this.f163213c, this.f163214d, this.f163215e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super ReservationSlotValidation> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f163211a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                tl.g gVar = h.this.timeSlotOmsApi;
                String str = this.f163213c;
                String partnerEligibility = this.f163214d.getPartnerEligibility();
                String str2 = "";
                if (partnerEligibility == null) {
                    partnerEligibility = "";
                }
                String code = this.f163214d.getCode();
                String strValueOf = String.valueOf(this.f163214d.getPointOfService().getStoreId());
                String strA = h.this.userManager.a();
                String strA2 = h.this.userManager.a();
                String id2 = this.f163215e.getId();
                String fulfillmentEligibility = this.f163214d.getFulfillmentEligibility();
                if (fulfillmentEligibility != null) {
                    str2 = fulfillmentEligibility;
                }
                String string = this.f163215e.getDate().toString();
                Intrinsics.i(string, "toString(...)");
                ValidateDtmReservationSlotRequest validateDtmReservationSlotRequest = new ValidateDtmReservationSlotRequest(partnerEligibility, code, strValueOf, strA, strA2, id2, str2, string);
                this.f163211a = 1;
                obj = gVar.a(str, validateDtmReservationSlotRequest, this);
                if (obj == objF) {
                    return objF;
                }
            }
            Response response = (Response) obj;
            if (response.isSuccessful()) {
                ValidateReservationSlotOmsResponse validateReservationSlotOmsResponse = (ValidateReservationSlotOmsResponse) response.body();
                if (validateReservationSlotOmsResponse != null) {
                    return C17691h.a(validateReservationSlotOmsResponse);
                }
                return null;
            }
            throw new HttpException(response);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lul/e;", "<anonymous>", "(Lmv/O;)Lul/e;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.timeslots.TimeSlotRepository$validateOmsReservationSlot$2", f = "TimeSlotRepository.kt", l = {641}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super ReservationSlotValidation>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f163216a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f163218c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ShoppingCart f163219d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FulfillmentSlot f163220e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, ShoppingCart shoppingCart, FulfillmentSlot fulfillmentSlot, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f163218c = str;
            this.f163219d = shoppingCart;
            this.f163220e = fulfillmentSlot;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new k(this.f163218c, this.f163219d, this.f163220e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super ReservationSlotValidation> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f163216a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                tl.g gVar = h.this.timeSlotOmsApi;
                String str = this.f163218c;
                String partnerEligibility = this.f163219d.getPartnerEligibility();
                if (partnerEligibility == null) {
                    partnerEligibility = "";
                }
                ValidateReservationSlotOmsRequest validateReservationSlotOmsRequest = new ValidateReservationSlotOmsRequest(partnerEligibility, this.f163219d.getCode(), String.valueOf(this.f163219d.getPointOfService().getStoreId()), h.this.userManager.a(), h.this.userManager.a(), this.f163220e.getId());
                this.f163216a = 1;
                obj = gVar.b(str, validateReservationSlotOmsRequest, this);
                if (obj == objF) {
                    return objF;
                }
            }
            Response response = (Response) obj;
            if (response.isSuccessful()) {
                ValidateReservationSlotOmsResponse validateReservationSlotOmsResponse = (ValidateReservationSlotOmsResponse) response.body();
                if (validateReservationSlotOmsResponse != null) {
                    return C17691h.a(validateReservationSlotOmsResponse);
                }
                return null;
            }
            throw new HttpException(response);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lul/e;", "<anonymous>", "(Lmv/O;)Lul/e;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.digitalshopping.api.timeslots.TimeSlotRepository$validateTimeslotReservationSlot$2", f = "TimeSlotRepository.kt", l = {681}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super ReservationSlotValidation>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f163221a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ BearerToken f163223c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ShoppingCart f163224d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FulfillmentSlot f163225e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(BearerToken bearerToken, ShoppingCart shoppingCart, FulfillmentSlot fulfillmentSlot, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f163223c = bearerToken;
            this.f163224d = shoppingCart;
            this.f163225e = fulfillmentSlot;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new l(this.f163223c, this.f163224d, this.f163225e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super ReservationSlotValidation> continuation) {
            return ((l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String code;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f163221a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17272c interfaceC17272c = h.this.timeSlotApi;
                BearerToken bearerToken = this.f163223c;
                Integer mfcStoreId = this.f163224d.getPointOfService().getMfcStoreId();
                String deliveryPartner = this.f163224d.getPointOfService().getDeliveryPartner();
                DeliveryMode deliveryMode = this.f163224d.getDeliveryMode();
                if (deliveryMode != null) {
                    code = deliveryMode.getCode();
                } else {
                    code = null;
                }
                String fulfillmentEligibility = this.f163224d.getFulfillmentEligibility();
                String curbsidePartner = this.f163224d.getPointOfService().getCurbsidePartner();
                String id2 = this.f163225e.getId();
                int storeId = this.f163224d.getPointOfService().getStoreId();
                this.f163221a = 1;
                obj = interfaceC17272c.c(bearerToken, mfcStoreId, deliveryPartner, code, fulfillmentEligibility, curbsidePartner, id2, storeId, this);
                if (obj == objF) {
                    return objF;
                }
            }
            Response response = (Response) obj;
            if (response.isSuccessful()) {
                ReservationSlotValidationResponse reservationSlotValidationResponse = (ReservationSlotValidationResponse) response.body();
                if (reservationSlotValidationResponse == null) {
                    return null;
                }
                return C17690g.a(reservationSlotValidationResponse);
            }
            throw new HttpException(response);
        }
    }

    public h(Yi.a tokenProvider, InterfaceC17272c timeSlotApi, tl.g timeSlotOmsApi, C17271b timeSlotsStore, zl.k featureManager, yo.k userManager, AbstractC15779K ioDispatcher) {
        Intrinsics.j(tokenProvider, "tokenProvider");
        Intrinsics.j(timeSlotApi, "timeSlotApi");
        Intrinsics.j(timeSlotOmsApi, "timeSlotOmsApi");
        Intrinsics.j(timeSlotsStore, "timeSlotsStore");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.tokenProvider = tokenProvider;
        this.timeSlotApi = timeSlotApi;
        this.timeSlotOmsApi = timeSlotOmsApi;
        this.timeSlotsStore = timeSlotsStore;
        this.featureManager = featureManager;
        this.userManager = userManager;
        this.ioDispatcher = ioDispatcher;
        this.mutex = wv.g.b(false, 1, null);
    }

    public static /* synthetic */ Object n(h hVar, ShoppingCart shoppingCart, String str, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return hVar.m(shoppingCart, str, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object o(ShoppingCart shoppingCart, String str, Continuation<? super Response<GetReservationSlotsOmsResponse>> continuation) {
        return C15805i.g(this.ioDispatcher, new e(str, shoppingCart, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object p(ShoppingCart shoppingCart, String str, boolean z10, boolean z11, List<DeliveryPartner> list, Continuation<? super Response<List<GetReservationSlotsOmsResponse>>> continuation) {
        return C15805i.g(this.ioDispatcher, new f(str, shoppingCart, z11, list, z10, null), continuation);
    }

    public static /* synthetic */ Object s(h hVar, ShoppingCart shoppingCart, Duration duration, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            duration = Duration.ofMinutes(2L);
        }
        return hVar.r(shoppingCart, duration, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(fj.ShoppingCart r8, kotlin.coroutines.Continuation<? super tl.FulfillmentSlotSet> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof tl.h.C2576h
            if (r0 == 0) goto L14
            r0 = r9
            tl.h$h r0 = (tl.h.C2576h) r0
            int r1 = r0.f163206e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f163206e = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            tl.h$h r0 = new tl.h$h
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.f163204c
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r4.f163206e
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 != r2) goto L33
            java.lang.Object r8 = r4.f163203b
            tl.h r8 = (tl.h) r8
            java.lang.Object r0 = r4.f163202a
            fj.C r0 = (fj.ShoppingCart) r0
            kotlin.ResultKt.b(r9)
            goto L7d
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            kotlin.ResultKt.b(r9)
            qw.a$a r9 = qw.a.INSTANCE
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Cache miss ["
            r1.append(r3)
            tl.b$a r3 = tl.C17271b.INSTANCE
            java.lang.String r3 = r3.b(r8)
            r1.append(r3)
            java.lang.String r3 = "]! Updating time slots for store "
            r1.append(r3)
            int r3 = r8.u()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r9.a(r1, r3)
            r4.f163202a = r8
            r4.f163203b = r7
            r4.f163206e = r2
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r7
            r2 = r8
            java.lang.Object r9 = n(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L7b
            return r0
        L7b:
            r8 = r7
            r0 = r2
        L7d:
            ul.d r9 = (ul.FulfillmentSchedule) r9
            fj.h r0 = r0.getDeliveryMode()
            if (r0 == 0) goto L8a
            java.lang.String r0 = r0.getCode()
            goto L8b
        L8a:
            r0 = 0
        L8b:
            tl.a r8 = r8.v(r9, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tl.h.t(fj.C, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Object w(ShoppingCart shoppingCart, FulfillmentSlot fulfillmentSlot, String str, Continuation<? super ReservationSlotValidation> continuation) {
        return C15805i.g(this.ioDispatcher, new j(str, shoppingCart, fulfillmentSlot, null), continuation);
    }

    private final Object x(ShoppingCart shoppingCart, FulfillmentSlot fulfillmentSlot, String str, Continuation<? super ReservationSlotValidation> continuation) {
        return C15805i.g(this.ioDispatcher, new k(str, shoppingCart, fulfillmentSlot, null), continuation);
    }

    private final Object y(ShoppingCart shoppingCart, FulfillmentSlot fulfillmentSlot, BearerToken bearerToken, Continuation<? super ReservationSlotValidation> continuation) {
        return C15805i.g(this.ioDispatcher, new l(bearerToken, shoppingCart, fulfillmentSlot, null), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e6, code lost:
    
        if (r10 == r1) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0116, code lost:
    
        if (r10 == r1) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0134, code lost:
    
        if (r10 == r1) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016c, code lost:
    
        if (r10 == r1) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c0, code lost:
    
        if (r10 == r1) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01db, code lost:
    
        if (r10 == r1) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(fj.ShoppingCart r8, jj.FulfillmentSlot r9, kotlin.coroutines.Continuation<? super java.lang.Boolean> r10) throws android.security.keystore.UserNotAuthenticatedException {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tl.h.k(fj.C, jj.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object l(BearerToken bearerToken, ShoppingCart shoppingCart, String str, Continuation<? super Response<List<GetDTMReservationSlotsResponse>>> continuation) {
        return C15805i.g(this.ioDispatcher, new b(bearerToken, shoppingCart, str, null), continuation);
    }

    public final Object m(ShoppingCart shoppingCart, String str, Continuation<? super FulfillmentSchedule> continuation) {
        return this.featureManager.e(AbstractC18503f.Q.f172856h) ? C15805i.g(this.ioDispatcher, new c(shoppingCart, str, null), continuation) : C15805i.g(this.ioDispatcher, new d(shoppingCart, str, null), continuation);
    }

    public final Object q(ShoppingCart shoppingCart, Duration duration, Instant instant, Continuation<? super List<FulfillmentSlot>> continuation) {
        return C15805i.g(this.ioDispatcher, new g(shoppingCart, duration, instant, null), continuation);
    }

    public final Object u(BearerToken bearerToken, ShoppingCart shoppingCart, Continuation<? super Response<Schedules>> continuation) {
        return C15805i.g(this.ioDispatcher, new i(bearerToken, shoppingCart, null), continuation);
    }

    private final FulfillmentSlotSet v(FulfillmentSchedule fulfillmentSchedule, String str) {
        int storeId = fulfillmentSchedule.getStoreId();
        List<FulfillmentDay> listC = fulfillmentSchedule.c();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            CollectionsKt.C(arrayList, ((FulfillmentDay) it.next()).d());
        }
        return new FulfillmentSlotSet(storeId, str, arrayList, null, null, null, 56, null);
    }

    public final Object r(ShoppingCart shoppingCart, Duration duration, Continuation<? super List<FulfillmentSlot>> continuation) {
        Instant instantNow = Instant.now();
        Intrinsics.i(instantNow, "now(...)");
        return q(shoppingCart, duration, instantNow, continuation);
    }
}
