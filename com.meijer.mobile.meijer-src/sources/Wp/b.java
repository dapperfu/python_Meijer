package Wp;

import Pk.Coupon;
import Pl.PicklistItem;
import Up.ShopAndScanCouponEntity;
import Vp.ActiveTripRequest;
import Vp.AddItemRequest;
import Xp.ShopAndScanLookupItem;
import Xp.ShopAndScanTrip;
import Xp.a;
import com.meijer.mobile.greenville.model.domain.CartItem;
import com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity;
import com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import io.constructor.data.local.PreferencesHelper;
import j$.time.Duration;
import j$.time.LocalDateTime;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.AbstractC15779K;
import mv.C15784P;
import mv.C15800f0;
import mv.C15805i;
import mv.C15809k;
import mv.InterfaceC15783O;
import mv.X0;
import om.C16221a;
import pv.C16563h;
import pv.InterfaceC16553F;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import pv.L;

@Metadata(d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B3\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u001fH\u0096@¢\u0006\u0004\b \u0010!J\u0018\u0010$\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\"H\u0096@¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b&\u0010\u001bJ\u001a\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010\u000f\u001a\u00020'H\u0096@¢\u0006\u0004\b)\u0010*J$\u0010.\u001a\u00020\u00192\n\u0010-\u001a\u00060+j\u0002`,2\u0006\u0010#\u001a\u00020\"H\u0096@¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b0\u0010\u001bJ\u0018\u00103\u001a\u00020\u00192\u0006\u00102\u001a\u000201H\u0096@¢\u0006\u0004\b3\u00104J\u001a\u00107\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u000205H\u0082@¢\u0006\u0004\b7\u00108J\u0018\u00109\u001a\u0002012\u0006\u00106\u001a\u000205H\u0082@¢\u0006\u0004\b9\u00108J\u001b\u0010:\u001a\u000201*\u0002052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b:\u0010;J \u0010<\u001a\u00020\u00192\u0006\u00106\u001a\u0002052\u0006\u0010\u000f\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b<\u0010=J$\u0010@\u001a\u00020>*\u00020>2\u0006\u0010\u000f\u001a\u00020?2\u0006\u00106\u001a\u000205H\u0082@¢\u0006\u0004\b@\u0010AJ(\u0010C\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u001f2\u0006\u00106\u001a\u0002052\u0006\u0010B\u001a\u00020>H\u0082@¢\u0006\u0004\bC\u0010DJ$\u0010F\u001a\u00020>*\u00020>2\u0006\u0010\u000f\u001a\u00020E2\u0006\u00106\u001a\u000205H\u0082@¢\u0006\u0004\bF\u0010GJ8\u0010O\u001a\u00020>*\u00020>2\b\b\u0002\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020J2\u0006\u0010M\u001a\u00020L2\b\b\u0002\u0010N\u001a\u00020\"H\u0082@¢\u0006\u0004\bO\u0010PJ.\u0010S\u001a\u00020>*\u00020>2\u0006\u0010K\u001a\u00020J2\u0006\u0010I\u001a\u00020H2\b\u0010R\u001a\u0004\u0018\u00010QH\u0082@¢\u0006\u0004\bS\u0010TJ\u001c\u0010W\u001a\u000205*\u0002052\u0006\u0010V\u001a\u00020UH\u0082@¢\u0006\u0004\bW\u0010XJ\u0018\u0010Z\u001a\u00020\u00192\u0006\u0010Y\u001a\u00020>H\u0082@¢\u0006\u0004\bZ\u0010[J$\u0010]\u001a\u00020\u0019*\u00020>2\u0006\u0010\u000f\u001a\u00020\\2\u0006\u00106\u001a\u000205H\u0082@¢\u0006\u0004\b]\u0010^J\u0019\u0010`\u001a\u0004\u0018\u00010(2\u0006\u0010_\u001a\u00020\"H\u0002¢\u0006\u0004\b`\u0010aJ$\u0010e\u001a\u00020>*\u00020>2\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u000201H\u0082@¢\u0006\u0004\be\u0010fJ\u0017\u0010i\u001a\u00020b2\u0006\u0010h\u001a\u00020gH\u0002¢\u0006\u0004\bi\u0010jJ\u0018\u0010k\u001a\u00020\u00192\u0006\u0010c\u001a\u000205H\u0082@¢\u0006\u0004\bk\u00108J\u0018\u0010l\u001a\u00020\u00192\u0006\u0010c\u001a\u00020>H\u0082@¢\u0006\u0004\bl\u0010[J\u001c\u0010o\u001a\u00020>*\u00020>2\u0006\u0010n\u001a\u00020mH\u0082@¢\u0006\u0004\bo\u0010pJ4\u0010s\u001a\u00020>*\u00020>2\u0006\u0010K\u001a\u00020J2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010H2\n\b\u0002\u0010r\u001a\u0004\u0018\u00010qH\u0082@¢\u0006\u0004\bs\u0010tJ\u001a\u0010v\u001a\u0004\u0018\u00010>2\u0006\u0010u\u001a\u00020\"H\u0082@¢\u0006\u0004\bv\u0010%J\u001c\u0010y\u001a\u00020>2\n\u0010x\u001a\u00060\"j\u0002`wH\u0082@¢\u0006\u0004\by\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010|R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010}R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010~R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u007fR\u0017\u0010\u0082\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b&\u0010\u0081\u0001R \u0010\u0086\u0001\u001a\n\u0012\u0005\u0012\u00030\u0084\u00010\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b.\u0010\u0085\u0001R&\u0010\u008a\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0087\u00018\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0014\u0010\u0088\u0001\u001a\u0005\bz\u0010\u0089\u0001¨\u0006\u008b\u0001"}, d2 = {"LWp/b;", "LWp/a;", "LTp/g;", "shopAndScanTripDAO", "LTp/a;", "shopAndScanItemDAO", "LSl/a;", "greenvilleRepository", "Lom/a;", "couponDataSource", "Lmv/K;", "ioDispatcher", "<init>", "(LTp/g;LTp/a;LSl/a;Lom/a;Lmv/K;)V", "LVp/a;", "request", "LXp/f;", "k", "(LVp/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LVp/f;", "h", "(LVp/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LVp/e;", "d", "(LVp/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "j", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LVp/b;", "c", "(LVp/b;)V", "LVp/i;", "e", "(LVp/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "itemId", "l", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "LVp/d;", "LXp/d;", "i", "(LVp/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "offerId", "g", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "H", "", "isCheckoutInProgress", "b", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity;", "localTrip", "I", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "N", "O", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity;LVp/a;)Z", "G", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity;LVp/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity;", "Lcom/meijer/mobile/greenville/model/request/item/add/AddItemRequest;", "F", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity;Lcom/meijer/mobile/greenville/model/request/item/add/AddItemRequest;Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "localItem", "U", "(LVp/i;Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity;Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/item/update/UpdateItemRequest;", "V", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity;Lcom/meijer/mobile/greenville/model/request/item/update/UpdateItemRequest;Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$a;", "action", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$h;", "state", "Lcom/meijer/mobile/greenville/model/domain/a;", "greenvilleItem", "timeUpdated", "Z", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity;Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$a;Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$h;Lcom/meijer/mobile/greenville/model/domain/a;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/domain/TransactionException;", "exception", "b0", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity;Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$h;Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$a;Lcom/meijer/mobile/greenville/model/domain/TransactionException;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LPl/a;", "cartTotals", "S", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity;LPl/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "item", "R", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/item/remove/RemoveItemRequest;", "Q", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity;Lcom/meijer/mobile/greenville/model/request/item/remove/RemoveItemRequest;Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanTripEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lookupItemPLU", "L", "(Ljava/lang/String;)LXp/d;", "LUp/a;", "entity", "isClipped", "T", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity;LUp/a;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LPk/a;", "coupon", "P", "(LPk/a;)LUp/a;", "M", "E", "", "quantity", "W", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$f;", "restriction", "X", "(Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity;Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$h;Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$a;Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity$f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "barcode", "J", "Lcom/meijer/mobile/shopandscan/domain/model/ShopAndScanItemLocalID;", PreferencesHelper.PREF_ID, "K", "a", "LTp/g;", "LTp/a;", "LSl/a;", "Lom/a;", "Lmv/K;", "Lmv/O;", "Lmv/O;", "repositoryScope", "", "LPl/d;", "Ljava/util/List;", "localPicklist", "Lpv/F;", "Lpv/F;", "()Lpv/F;", "tripStream", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Tp.g shopAndScanTripDAO;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Tp.a shopAndScanItemDAO;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Sl.a greenvilleRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C16221a couponDataSource;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15783O repositoryScope;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private List<PicklistItem> localPicklist;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16553F<ShopAndScanTrip> tripStream;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.data.repository.ShopAndScanRepositoryImpl", f = "ShopAndScanRepositoryImpl.kt", l = {652}, m = "updateItemQuantity")
    static final class A extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f41185a;

        /* renamed from: b, reason: collision with root package name */
        Object f41186b;

        /* renamed from: c, reason: collision with root package name */
        Object f41187c;

        /* renamed from: d, reason: collision with root package name */
        int f41188d;

        /* renamed from: e, reason: collision with root package name */
        int f41189e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f41190f;

        /* renamed from: h, reason: collision with root package name */
        int f41192h;

        A(Continuation<? super A> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f41190f = obj;
            this.f41192h |= Integer.MIN_VALUE;
            return b.this.W(null, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.data.repository.ShopAndScanRepositoryImpl", f = "ShopAndScanRepositoryImpl.kt", l = {666}, m = "updateItemState")
    static final class B extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f41193a;

        /* renamed from: b, reason: collision with root package name */
        Object f41194b;

        /* renamed from: c, reason: collision with root package name */
        Object f41195c;

        /* renamed from: d, reason: collision with root package name */
        Object f41196d;

        /* renamed from: e, reason: collision with root package name */
        Object f41197e;

        /* renamed from: f, reason: collision with root package name */
        Object f41198f;

        /* renamed from: g, reason: collision with root package name */
        int f41199g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f41200h;

        /* renamed from: j, reason: collision with root package name */
        int f41202j;

        B(Continuation<? super B> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f41200h = obj;
            this.f41202j |= Integer.MIN_VALUE;
            return b.this.X(null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.data.repository.ShopAndScanRepositoryImpl", f = "ShopAndScanRepositoryImpl.kt", l = {HttpResponseStatus.ERROR_UNPROCESSABLE_ENTITY}, m = "updateLocalItemWithGreenvilleData")
    static final class C extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f41203a;

        /* renamed from: b, reason: collision with root package name */
        Object f41204b;

        /* renamed from: c, reason: collision with root package name */
        Object f41205c;

        /* renamed from: d, reason: collision with root package name */
        Object f41206d;

        /* renamed from: e, reason: collision with root package name */
        Object f41207e;

        /* renamed from: f, reason: collision with root package name */
        Object f41208f;

        /* renamed from: g, reason: collision with root package name */
        Object f41209g;

        /* renamed from: h, reason: collision with root package name */
        int f41210h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f41211i;

        /* renamed from: k, reason: collision with root package name */
        int f41213k;

        C(Continuation<? super C> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f41211i = obj;
            this.f41213k |= Integer.MIN_VALUE;
            return b.this.Z(null, null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.data.repository.ShopAndScanRepositoryImpl", f = "ShopAndScanRepositoryImpl.kt", l = {435}, m = "updateLocalItemWithGreenvilleException")
    static final class D extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f41214a;

        /* renamed from: b, reason: collision with root package name */
        Object f41215b;

        /* renamed from: c, reason: collision with root package name */
        Object f41216c;

        /* renamed from: d, reason: collision with root package name */
        Object f41217d;

        /* renamed from: e, reason: collision with root package name */
        Object f41218e;

        /* renamed from: f, reason: collision with root package name */
        Object f41219f;

        /* renamed from: g, reason: collision with root package name */
        int f41220g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f41221h;

        /* renamed from: j, reason: collision with root package name */
        int f41223j;

        D(Continuation<? super D> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f41221h = obj;
            this.f41223j |= Integer.MIN_VALUE;
            return b.this.b0(null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.data.repository.ShopAndScanRepositoryImpl", f = "ShopAndScanRepositoryImpl.kt", l = {108, 111, 114}, m = "activeTrip")
    /* renamed from: Wp.b$a, reason: case insensitive filesystem */
    static final class C5549a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f41224a;

        /* renamed from: b, reason: collision with root package name */
        Object f41225b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f41226c;

        /* renamed from: e, reason: collision with root package name */
        int f41228e;

        C5549a(Continuation<? super C5549a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f41226c = obj;
            this.f41228e |= Integer.MIN_VALUE;
            return b.this.k(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.data.repository.ShopAndScanRepositoryImpl$addItem$1", f = "ShopAndScanRepositoryImpl.kt", l = {HttpResponseStatus.SUCCESS_ACCEPTED, HttpResponseStatus.SUCCESS_NO_CONTENT, 212, 213, 222, 238}, m = "invokeSuspend")
    /* renamed from: Wp.b$b, reason: collision with other inner class name */
    static final class C0886b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f41229a;

        /* renamed from: b, reason: collision with root package name */
        Object f41230b;

        /* renamed from: c, reason: collision with root package name */
        int f41231c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AddItemRequest f41233e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0886b(AddItemRequest addItemRequest, Continuation<? super C0886b> continuation) {
            super(2, continuation);
            this.f41233e = addItemRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new C0886b(this.f41233e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C0886b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00c5, code lost:
        
            if (r12.F(r1, r3, r2, r11) != r0) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00fb, code lost:
        
            if (r12.U(r1, r2, r4, r11) == r0) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x010e, code lost:
        
            if (r12.G(r2, r1, r11) != r0) goto L49;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 294
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Wp.b.C0886b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.data.repository.ShopAndScanRepositoryImpl", f = "ShopAndScanRepositoryImpl.kt", l = {273, 283, 286, 293}, m = "addItemToGreenville")
    /* renamed from: Wp.b$c, reason: case insensitive filesystem */
    static final class C5550c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f41234a;

        /* renamed from: b, reason: collision with root package name */
        Object f41235b;

        /* renamed from: c, reason: collision with root package name */
        Object f41236c;

        /* renamed from: d, reason: collision with root package name */
        Object f41237d;

        /* renamed from: e, reason: collision with root package name */
        Object f41238e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f41239f;

        /* renamed from: h, reason: collision with root package name */
        int f41241h;

        C5550c(Continuation<? super C5550c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f41239f = obj;
            this.f41241h |= Integer.MIN_VALUE;
            return b.this.F(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.data.repository.ShopAndScanRepositoryImpl", f = "ShopAndScanRepositoryImpl.kt", l = {257, 260, 264}, m = "addNewItem")
    /* renamed from: Wp.b$d, reason: case insensitive filesystem */
    static final class C5551d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f41242a;

        /* renamed from: b, reason: collision with root package name */
        Object f41243b;

        /* renamed from: c, reason: collision with root package name */
        Object f41244c;

        /* renamed from: d, reason: collision with root package name */
        Object f41245d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f41246e;

        /* renamed from: g, reason: collision with root package name */
        int f41248g;

        C5551d(Continuation<? super C5551d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f41246e = obj;
            this.f41248g |= Integer.MIN_VALUE;
            return b.this.G(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.data.repository.ShopAndScanRepositoryImpl", f = "ShopAndScanRepositoryImpl.kt", l = {164, 172, 174, 177}, m = "cancelTrip")
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f41249a;

        /* renamed from: b, reason: collision with root package name */
        Object f41250b;

        /* renamed from: c, reason: collision with root package name */
        Object f41251c;

        /* renamed from: d, reason: collision with root package name */
        Object f41252d;

        /* renamed from: e, reason: collision with root package name */
        Object f41253e;

        /* renamed from: f, reason: collision with root package name */
        Object f41254f;

        /* renamed from: g, reason: collision with root package name */
        int f41255g;

        /* renamed from: h, reason: collision with root package name */
        int f41256h;

        /* renamed from: i, reason: collision with root package name */
        int f41257i;

        /* renamed from: j, reason: collision with root package name */
        int f41258j;

        /* renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f41259k;

        /* renamed from: m, reason: collision with root package name */
        int f41261m;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f41259k = obj;
            this.f41261m |= Integer.MIN_VALUE;
            return b.this.j(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.data.repository.ShopAndScanRepositoryImpl", f = "ShopAndScanRepositoryImpl.kt", l = {631}, m = "clearLocalTrip")
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f41262a;

        /* renamed from: c, reason: collision with root package name */
        int f41264c;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f41262a = obj;
            this.f41264c |= Integer.MIN_VALUE;
            return b.this.H(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.data.repository.ShopAndScanRepositoryImpl$clearLocalTrip$2", f = "ShopAndScanRepositoryImpl.kt", l = {632}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f41265a;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f41265a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Tp.g gVar = b.this.shopAndScanTripDAO;
                this.f41265a = 1;
                if (gVar.a(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.data.repository.ShopAndScanRepositoryImpl", f = "ShopAndScanRepositoryImpl.kt", l = {556, 558, 562, 564, 569, 576, 578, 583}, m = "couponAction")
    static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        long f41267a;

        /* renamed from: b, reason: collision with root package name */
        long f41268b;

        /* renamed from: c, reason: collision with root package name */
        Object f41269c;

        /* renamed from: d, reason: collision with root package name */
        Object f41270d;

        /* renamed from: e, reason: collision with root package name */
        Object f41271e;

        /* renamed from: f, reason: collision with root package name */
        Object f41272f;

        /* renamed from: g, reason: collision with root package name */
        Object f41273g;

        /* renamed from: h, reason: collision with root package name */
        Object f41274h;

        /* renamed from: i, reason: collision with root package name */
        int f41275i;

        /* renamed from: j, reason: collision with root package name */
        int f41276j;

        /* renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f41277k;

        /* renamed from: m, reason: collision with root package name */
        int f41279m;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f41277k = obj;
            this.f41279m |= Integer.MIN_VALUE;
            return b.this.g(0L, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.data.repository.ShopAndScanRepositoryImpl", f = "ShopAndScanRepositoryImpl.kt", l = {343, 346}, m = "dismissRestriction")
    static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f41280a;

        /* renamed from: b, reason: collision with root package name */
        Object f41281b;

        /* renamed from: c, reason: collision with root package name */
        Object f41282c;

        /* renamed from: d, reason: collision with root package name */
        int f41283d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f41284e;

        /* renamed from: g, reason: collision with root package name */
        int f41286g;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f41284e = obj;
            this.f41286g |= Integer.MIN_VALUE;
            return b.this.l(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.data.repository.ShopAndScanRepositoryImpl", f = "ShopAndScanRepositoryImpl.kt", l = {495, 499}, m = "fetchPicklist")
    static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f41287a;

        /* renamed from: b, reason: collision with root package name */
        Object f41288b;

        /* renamed from: c, reason: collision with root package name */
        int f41289c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f41290d;

        /* renamed from: f, reason: collision with root package name */
        int f41292f;

        j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f41290d = obj;
            this.f41292f |= Integer.MIN_VALUE;
            return b.this.f(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.data.repository.ShopAndScanRepositoryImpl", f = "ShopAndScanRepositoryImpl.kt", l = {129}, m = "getGreenvilleActiveTrip")
    static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f41293a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f41294b;

        /* renamed from: d, reason: collision with root package name */
        int f41296d;

        k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f41294b = obj;
            this.f41296d |= Integer.MIN_VALUE;
            return b.this.I(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.data.repository.ShopAndScanRepositoryImpl$getLocalItemByBarcode$2", f = "ShopAndScanRepositoryImpl.kt", l = {672}, m = "invokeSuspend")
    static final class l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super ShopAndScanItemEntity>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f41297a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f41299c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f41299c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new l(this.f41299c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super ShopAndScanItemEntity> continuation) {
            return ((l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f41297a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Tp.a aVar = b.this.shopAndScanItemDAO;
            String str = this.f41299c;
            this.f41297a = 1;
            Object objC = aVar.c(str, this);
            if (objC == objF) {
                return objF;
            }
            return objC;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/shopandscan/data/local/entity/ShopAndScanItemEntity;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.data.repository.ShopAndScanRepositoryImpl$getLocalItemById$2", f = "ShopAndScanRepositoryImpl.kt", l = {678}, m = "invokeSuspend")
    static final class m extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super ShopAndScanItemEntity>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f41300a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f41302c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f41302c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new m(this.f41302c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super ShopAndScanItemEntity> continuation) {
            return ((m) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f41300a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Tp.a aVar = b.this.shopAndScanItemDAO;
            String str = this.f41302c;
            this.f41300a = 1;
            Object objA = aVar.a(str, this);
            if (objA == objF) {
                return objF;
            }
            return objA;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.data.repository.ShopAndScanRepositoryImpl", f = "ShopAndScanRepositoryImpl.kt", l = {146}, m = "isGreenvilleTripActive")
    static final class n extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f41303a;

        /* renamed from: b, reason: collision with root package name */
        Object f41304b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f41305c;

        /* renamed from: e, reason: collision with root package name */
        int f41307e;

        n(Continuation<? super n> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f41305c = obj;
            this.f41307e |= Integer.MIN_VALUE;
            return b.this.N(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.data.repository.ShopAndScanRepositoryImpl", f = "ShopAndScanRepositoryImpl.kt", l = {HttpResponseStatus.ERROR_HTTP_VERSION_NOT_SUPPORTED, 506}, m = "lookupItem")
    static final class o extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f41308a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f41309b;

        /* renamed from: d, reason: collision with root package name */
        int f41311d;

        o(Continuation<? super o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f41309b = obj;
            this.f41311d |= Integer.MIN_VALUE;
            return b.this.i(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.data.repository.ShopAndScanRepositoryImpl", f = "ShopAndScanRepositoryImpl.kt", l = {485, 486, 487}, m = "removeGreenvilleItem")
    static final class p extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f41312a;

        /* renamed from: b, reason: collision with root package name */
        Object f41313b;

        /* renamed from: c, reason: collision with root package name */
        Object f41314c;

        /* renamed from: d, reason: collision with root package name */
        Object f41315d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f41316e;

        /* renamed from: g, reason: collision with root package name */
        int f41318g;

        p(Continuation<? super p> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f41316e = obj;
            this.f41318g |= Integer.MIN_VALUE;
            return b.this.Q(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.data.repository.ShopAndScanRepositoryImpl", f = "ShopAndScanRepositoryImpl.kt", l = {460, 462, 474, 477}, m = "removeItem")
    static final class q extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f41319a;

        /* renamed from: b, reason: collision with root package name */
        Object f41320b;

        /* renamed from: c, reason: collision with root package name */
        Object f41321c;

        /* renamed from: d, reason: collision with root package name */
        Object f41322d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f41323e;

        /* renamed from: g, reason: collision with root package name */
        int f41325g;

        q(Continuation<? super q> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f41323e = obj;
            this.f41325g |= Integer.MIN_VALUE;
            return b.this.R(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.data.repository.ShopAndScanRepositoryImpl", f = "ShopAndScanRepositoryImpl.kt", l = {159}, m = "resumeTrip")
    static final class r extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f41326a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f41327b;

        /* renamed from: d, reason: collision with root package name */
        int f41329d;

        r(Continuation<? super r> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f41327b = obj;
            this.f41329d |= Integer.MIN_VALUE;
            return b.this.d(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class s implements InterfaceC16561f<ShopAndScanTrip> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f41330a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f41331a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.shopandscan.data.repository.ShopAndScanRepositoryImpl$special$$inlined$map$1$2", f = "ShopAndScanRepositoryImpl.kt", l = {50}, m = "emit")
            /* renamed from: Wp.b$s$a$a, reason: collision with other inner class name */
            public static final class C0887a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f41332a;

                /* renamed from: b, reason: collision with root package name */
                int f41333b;

                /* renamed from: c, reason: collision with root package name */
                Object f41334c;

                /* renamed from: e, reason: collision with root package name */
                Object f41336e;

                /* renamed from: f, reason: collision with root package name */
                Object f41337f;

                /* renamed from: g, reason: collision with root package name */
                Object f41338g;

                /* renamed from: h, reason: collision with root package name */
                int f41339h;

                public C0887a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f41332a = obj;
                    this.f41333b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC16562g interfaceC16562g) {
                this.f41331a = interfaceC16562g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Wp.b.s.a.C0887a
                    if (r0 == 0) goto L13
                    r0 = r6
                    Wp.b$s$a$a r0 = (Wp.b.s.a.C0887a) r0
                    int r1 = r0.f41333b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f41333b = r1
                    goto L18
                L13:
                    Wp.b$s$a$a r0 = new Wp.b$s$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f41332a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f41333b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r5 = r0.f41338g
                    pv.g r5 = (pv.InterfaceC16562g) r5
                    java.lang.Object r5 = r0.f41336e
                    Wp.b$s$a$a r5 = (Wp.b.s.a.C0887a) r5
                    kotlin.ResultKt.b(r6)
                    goto L5d
                L31:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L39:
                    kotlin.ResultKt.b(r6)
                    pv.g r6 = r4.f41331a
                    r2 = r5
                    Tp.q r2 = (Tp.ShopAndScanTripWithItems) r2
                    if (r2 == 0) goto L48
                    Xp.f r2 = Tp.r.a(r2)
                    goto L49
                L48:
                    r2 = 0
                L49:
                    r0.f41334c = r5
                    r0.f41336e = r0
                    r0.f41337f = r5
                    r0.f41338g = r6
                    r5 = 0
                    r0.f41339h = r5
                    r0.f41333b = r3
                    java.lang.Object r5 = r6.emit(r2, r0)
                    if (r5 != r1) goto L5d
                    return r1
                L5d:
                    kotlin.Unit r5 = kotlin.Unit.f143329a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Wp.b.s.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public s(InterfaceC16561f interfaceC16561f) {
            this.f41330a = interfaceC16561f;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super ShopAndScanTrip> interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f41330a.collect(new a(interfaceC16562g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.data.repository.ShopAndScanRepositoryImpl", f = "ShopAndScanRepositoryImpl.kt", l = {122, 124}, m = "startTrip")
    static final class t extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f41340a;

        /* renamed from: b, reason: collision with root package name */
        Object f41341b;

        /* renamed from: c, reason: collision with root package name */
        Object f41342c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f41343d;

        /* renamed from: f, reason: collision with root package name */
        int f41345f;

        t(Continuation<? super t> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f41343d = obj;
            this.f41345f |= Integer.MIN_VALUE;
            return b.this.h(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.data.repository.ShopAndScanRepositoryImpl", f = "ShopAndScanRepositoryImpl.kt", l = {451}, m = "updateCartTotalsWithGreenvilleData")
    static final class u extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f41346a;

        /* renamed from: b, reason: collision with root package name */
        Object f41347b;

        /* renamed from: c, reason: collision with root package name */
        Object f41348c;

        /* renamed from: d, reason: collision with root package name */
        Object f41349d;

        /* renamed from: e, reason: collision with root package name */
        int f41350e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f41351f;

        /* renamed from: h, reason: collision with root package name */
        int f41353h;

        u(Continuation<? super u> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f41351f = obj;
            this.f41353h |= Integer.MIN_VALUE;
            return b.this.S(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.data.repository.ShopAndScanRepositoryImpl", f = "ShopAndScanRepositoryImpl.kt", l = {607}, m = "updateCoupon")
    static final class v extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f41354a;

        /* renamed from: b, reason: collision with root package name */
        Object f41355b;

        /* renamed from: c, reason: collision with root package name */
        Object f41356c;

        /* renamed from: d, reason: collision with root package name */
        Object f41357d;

        /* renamed from: e, reason: collision with root package name */
        boolean f41358e;

        /* renamed from: f, reason: collision with root package name */
        int f41359f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f41360g;

        /* renamed from: i, reason: collision with root package name */
        int f41362i;

        v(Continuation<? super v> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f41360g = obj;
            this.f41362i |= Integer.MIN_VALUE;
            return b.this.T(null, null, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.data.repository.ShopAndScanRepositoryImpl", f = "ShopAndScanRepositoryImpl.kt", l = {331, 334}, m = "updateExistingItem")
    static final class w extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f41363a;

        /* renamed from: b, reason: collision with root package name */
        Object f41364b;

        /* renamed from: c, reason: collision with root package name */
        Object f41365c;

        /* renamed from: d, reason: collision with root package name */
        Object f41366d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f41367e;

        /* renamed from: g, reason: collision with root package name */
        int f41369g;

        w(Continuation<? super w> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f41367e = obj;
            this.f41369g |= Integer.MIN_VALUE;
            return b.this.U(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.data.repository.ShopAndScanRepositoryImpl", f = "ShopAndScanRepositoryImpl.kt", l = {355, 364, 367, 374}, m = "updateGreenvilleItemQuantity")
    static final class x extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f41370a;

        /* renamed from: b, reason: collision with root package name */
        Object f41371b;

        /* renamed from: c, reason: collision with root package name */
        Object f41372c;

        /* renamed from: d, reason: collision with root package name */
        Object f41373d;

        /* renamed from: e, reason: collision with root package name */
        Object f41374e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f41375f;

        /* renamed from: h, reason: collision with root package name */
        int f41377h;

        x(Continuation<? super x> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f41375f = obj;
            this.f41377h |= Integer.MIN_VALUE;
            return b.this.V(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.data.repository.ShopAndScanRepositoryImpl$updateIsCheckoutInProgress$2", f = "ShopAndScanRepositoryImpl.kt", l = {687, 686}, m = "invokeSuspend")
    static final class y extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f41378a;

        /* renamed from: b, reason: collision with root package name */
        int f41379b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f41381d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(boolean z10, Continuation<? super y> continuation) {
            super(2, continuation);
            this.f41381d = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new y(this.f41381d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((y) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            if (r1.g((java.lang.String) r6, r3, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r5.f41379b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r6)
                goto L4c
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f41378a
                Tp.g r1 = (Tp.g) r1
                kotlin.ResultKt.b(r6)
                goto L3c
            L22:
                kotlin.ResultKt.b(r6)
                Wp.b r6 = Wp.b.this
                Tp.g r1 = Wp.b.s(r6)
                Wp.b r6 = Wp.b.this
                Tp.g r6 = Wp.b.s(r6)
                r5.f41378a = r1
                r5.f41379b = r3
                java.lang.Object r6 = r6.e(r5)
                if (r6 != r0) goto L3c
                goto L4b
            L3c:
                java.lang.String r6 = (java.lang.String) r6
                boolean r3 = r5.f41381d
                r4 = 0
                r5.f41378a = r4
                r5.f41379b = r2
                java.lang.Object r6 = r1.g(r6, r3, r5)
                if (r6 != r0) goto L4c
            L4b:
                return r0
            L4c:
                kotlin.Unit r6 = kotlin.Unit.f143329a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Wp.b.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.data.repository.ShopAndScanRepositoryImpl", f = "ShopAndScanRepositoryImpl.kt", l = {306, HttpResponseStatus.REDIRECTION_TEMPORARY_REDIRECT, 311, 312, 314}, m = "updateItem")
    static final class z extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f41382a;

        /* renamed from: b, reason: collision with root package name */
        Object f41383b;

        /* renamed from: c, reason: collision with root package name */
        Object f41384c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f41385d;

        /* renamed from: f, reason: collision with root package name */
        int f41387f;

        z(Continuation<? super z> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f41385d = obj;
            this.f41387f |= Integer.MIN_VALUE;
            return b.this.e(null, this);
        }
    }

    public b(Tp.g shopAndScanTripDAO, Tp.a shopAndScanItemDAO, Sl.a greenvilleRepository, C16221a couponDataSource, AbstractC15779K ioDispatcher) {
        Intrinsics.j(shopAndScanTripDAO, "shopAndScanTripDAO");
        Intrinsics.j(shopAndScanItemDAO, "shopAndScanItemDAO");
        Intrinsics.j(greenvilleRepository, "greenvilleRepository");
        Intrinsics.j(couponDataSource, "couponDataSource");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.shopAndScanTripDAO = shopAndScanTripDAO;
        this.shopAndScanItemDAO = shopAndScanItemDAO;
        this.greenvilleRepository = greenvilleRepository;
        this.couponDataSource = couponDataSource;
        this.ioDispatcher = ioDispatcher;
        InterfaceC15783O interfaceC15783OA = C15784P.a(X0.b(null, 1, null).n0(C15800f0.a()));
        this.repositoryScope = interfaceC15783OA;
        this.localPicklist = CollectionsKt.m();
        this.tripStream = C16563h.V(C16563h.r(new s(shopAndScanTripDAO.b())), interfaceC15783OA, L.INSTANCE.d(), 1);
    }

    private final Object E(ShopAndScanItemEntity shopAndScanItemEntity, Continuation<? super Unit> continuation) {
        Object objB = this.shopAndScanItemDAO.b(shopAndScanItemEntity, continuation);
        return objB == IntrinsicsKt.f() ? objB : Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r11, com.meijer.mobile.greenville.model.request.item.add.AddItemRequest r12, com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity r13, kotlin.coroutines.Continuation<? super com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity> r14) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Wp.b.F(com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity, com.meijer.mobile.greenville.model.request.item.add.AddItemRequest, com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d8, code lost:
    
        if (F(r14, r2, r13, r6) == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity r12, Vp.AddItemRequest r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Wp.b.G(com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity, Vp.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity r5, kotlin.coroutines.Continuation<? super com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Wp.b.k
            if (r0 == 0) goto L13
            r0 = r6
            Wp.b$k r0 = (Wp.b.k) r0
            int r1 = r0.f41296d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41296d = r1
            goto L18
        L13:
            Wp.b$k r0 = new Wp.b$k
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f41294b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f41296d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f41293a
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity r5 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity) r5
            kotlin.ResultKt.b(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.b(r6)
            r0.f41293a = r5
            r0.f41296d = r3
            java.lang.Object r6 = r4.N(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L4c
            return r5
        L4c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Wp.b.I(com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object J(String str, Continuation<? super ShopAndScanItemEntity> continuation) {
        return C15805i.g(this.ioDispatcher, new l(str, null), continuation);
    }

    private final Object K(String str, Continuation<? super ShopAndScanItemEntity> continuation) {
        return C15805i.g(this.ioDispatcher, new m(str, null), continuation);
    }

    private final ShopAndScanLookupItem L(String lookupItemPLU) {
        Object next;
        Iterator<T> it = this.localPicklist.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            List<String> listC = ((PicklistItem) next).c();
            if (!(listC instanceof Collection) || !listC.isEmpty()) {
                Iterator<T> it2 = listC.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.e((String) it2.next(), lookupItemPLU)) {
                        break loop0;
                    }
                }
            }
        }
        PicklistItem picklistItem = (PicklistItem) next;
        if (picklistItem == null) {
            return null;
        }
        String string = UUID.randomUUID().toString();
        Intrinsics.i(string, "toString(...)");
        return new ShopAndScanLookupItem(string, picklistItem.getCustomerFacingDescription(), 1, new a.PLU(lookupItemPLU), null, picklistItem.getImageUrl(), picklistItem.getWeightRequired());
    }

    private final Object M(ShopAndScanTripEntity shopAndScanTripEntity, Continuation<? super Unit> continuation) {
        Object objD = this.shopAndScanTripDAO.d(shopAndScanTripEntity, continuation);
        return objD == IntrinsicsKt.f() ? objD : Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity r8, kotlin.coroutines.Continuation<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof Wp.b.n
            if (r0 == 0) goto L13
            r0 = r9
            Wp.b$n r0 = (Wp.b.n) r0
            int r1 = r0.f41307e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41307e = r1
            goto L18
        L13:
            Wp.b$n r0 = new Wp.b$n
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f41305c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f41307e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r8 = r0.f41304b
            com.meijer.mobile.greenville.model.request.transferstatus.TransferStatusRequest r8 = (com.meijer.mobile.greenville.model.request.transferstatus.TransferStatusRequest) r8
            java.lang.Object r8 = r0.f41303a
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity r8 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity) r8
            kotlin.ResultKt.b(r9)
            goto L6c
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            kotlin.ResultKt.b(r9)
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity$d r9 = r8.getHeader()
            if (r9 == 0) goto L9b
            com.meijer.mobile.greenville.model.request.transferstatus.TransferStatusRequest r9 = new com.meijer.mobile.greenville.model.request.transferstatus.TransferStatusRequest
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity$d r2 = r8.getHeader()
            com.meijer.mobile.greenville.model.request.trip.status.TransactionHeaderRequest r2 = com.meijer.mobile.shopandscan.data.local.entity.b.c(r2)
            com.meijer.mobile.greenville.model.request.transferstatus.EventData r5 = new com.meijer.mobile.greenville.model.request.transferstatus.EventData
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity$e r6 = r8.getUser()
            java.lang.String r6 = r6.getMPerksBarcode()
            r5.<init>(r6)
            r9.<init>(r2, r5)
            Sl.a r2 = r7.greenvilleRepository
            r0.f41303a = r8
            r0.f41304b = r9
            r0.f41307e = r4
            java.lang.Object r9 = r2.b(r9, r0)
            if (r9 != r1) goto L6c
            return r1
        L6c:
            Pl.e r9 = (Pl.Transaction) r9
            Pl.c r8 = r9.getHeader()
            java.lang.String r8 = r8.getTransactionStatus()
            Pl.f r9 = Pl.f.f26199b
            java.lang.String r9 = r9.getStatus()
            boolean r9 = kotlin.jvm.internal.Intrinsics.e(r8, r9)
            if (r9 != 0) goto L9a
            Pl.f r9 = Pl.f.f26200c
            java.lang.String r9 = r9.getStatus()
            boolean r9 = kotlin.jvm.internal.Intrinsics.e(r8, r9)
            if (r9 != 0) goto L9a
            Pl.f r9 = Pl.f.f26201d
            java.lang.String r9 = r9.getStatus()
            boolean r8 = kotlin.jvm.internal.Intrinsics.e(r8, r9)
            if (r8 == 0) goto L9b
        L9a:
            r3 = r4
        L9b:
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.Boxing.a(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Wp.b.N(com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final ShopAndScanCouponEntity P(Coupon coupon) {
        return new ShopAndScanCouponEntity(coupon.getOfferId(), coupon.getTitle(), coupon.getDescription(), String.valueOf(coupon.getRedemptionStartDate()), String.valueOf(coupon.getRedemptionEndDate()), coupon.getImageURL(), coupon.x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b2, code lost:
    
        if (r10.d(r4, r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q(com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r7, com.meijer.mobile.greenville.model.request.item.remove.RemoveItemRequest r8, com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof Wp.b.p
            if (r0 == 0) goto L13
            r0 = r10
            Wp.b$p r0 = (Wp.b.p) r0
            int r1 = r0.f41318g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41318g = r1
            goto L18
        L13:
            Wp.b$p r0 = new Wp.b$p
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f41316e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f41318g
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L6e
            if (r2 == r5) goto L5c
            if (r2 == r4) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r7 = r0.f41315d
            Pl.e r7 = (Pl.Transaction) r7
            java.lang.Object r7 = r0.f41314c
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity r7 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity) r7
            java.lang.Object r7 = r0.f41313b
            com.meijer.mobile.greenville.model.request.item.remove.RemoveItemRequest r7 = (com.meijer.mobile.greenville.model.request.item.remove.RemoveItemRequest) r7
            java.lang.Object r7 = r0.f41312a
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r7 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity) r7
            kotlin.ResultKt.b(r10)
            goto Lb5
        L40:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L48:
            java.lang.Object r7 = r0.f41315d
            Pl.e r7 = (Pl.Transaction) r7
            java.lang.Object r8 = r0.f41314c
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity r8 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity) r8
            java.lang.Object r9 = r0.f41313b
            com.meijer.mobile.greenville.model.request.item.remove.RemoveItemRequest r9 = (com.meijer.mobile.greenville.model.request.item.remove.RemoveItemRequest) r9
            java.lang.Object r2 = r0.f41312a
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r2 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity) r2
            kotlin.ResultKt.b(r10)
            goto L9e
        L5c:
            java.lang.Object r7 = r0.f41314c
            r9 = r7
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity r9 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity) r9
            java.lang.Object r7 = r0.f41313b
            r8 = r7
            com.meijer.mobile.greenville.model.request.item.remove.RemoveItemRequest r8 = (com.meijer.mobile.greenville.model.request.item.remove.RemoveItemRequest) r8
            java.lang.Object r7 = r0.f41312a
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r7 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity) r7
            kotlin.ResultKt.b(r10)
            goto L82
        L6e:
            kotlin.ResultKt.b(r10)
            Sl.a r10 = r6.greenvilleRepository
            r0.f41312a = r7
            r0.f41313b = r8
            r0.f41314c = r9
            r0.f41318g = r5
            java.lang.Object r10 = r10.e(r8, r0)
            if (r10 != r1) goto L82
            goto Lb4
        L82:
            Pl.e r10 = (Pl.Transaction) r10
            Pl.a r2 = r10.getCartTotals()
            r0.f41312a = r7
            r0.f41313b = r8
            r0.f41314c = r9
            r0.f41315d = r10
            r0.f41318g = r4
            java.lang.Object r2 = r6.S(r9, r2, r0)
            if (r2 != r1) goto L99
            goto Lb4
        L99:
            r2 = r9
            r9 = r8
            r8 = r2
            r2 = r7
            r7 = r10
        L9e:
            Tp.a r10 = r6.shopAndScanItemDAO
            java.lang.String r4 = r2.getItemId()
            r0.f41312a = r2
            r0.f41313b = r9
            r0.f41314c = r8
            r0.f41315d = r7
            r0.f41318g = r3
            java.lang.Object r7 = r10.d(r4, r0)
            if (r7 != r1) goto Lb5
        Lb4:
            return r1
        Lb5:
            kotlin.Unit r7 = kotlin.Unit.f143329a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Wp.b.Q(com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity, com.meijer.mobile.greenville.model.request.item.remove.RemoveItemRequest, com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f3, code lost:
    
        if (Q(r14, r3, r13, r6) == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010e, code lost:
    
        if (r3.d(r4, r6) == r0) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R(com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Wp.b.R(com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S(com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity r19, Pl.CartTotals r20, kotlin.coroutines.Continuation<? super com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity> r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            boolean r2 = r1 instanceof Wp.b.u
            if (r2 == 0) goto L17
            r2 = r1
            Wp.b$u r2 = (Wp.b.u) r2
            int r3 = r2.f41353h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f41353h = r3
            goto L1c
        L17:
            Wp.b$u r2 = new Wp.b$u
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f41351f
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r4 = r2.f41353h
            r5 = 1
            if (r4 == 0) goto L45
            if (r4 != r5) goto L3d
            java.lang.Object r3 = r2.f41349d
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity r3 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity) r3
            java.lang.Object r3 = r2.f41348c
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity r3 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity) r3
            java.lang.Object r4 = r2.f41347b
            Pl.a r4 = (Pl.CartTotals) r4
            java.lang.Object r2 = r2.f41346a
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity r2 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity) r2
            kotlin.ResultKt.b(r1)
            return r3
        L3d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L45:
            kotlin.ResultKt.b(r1)
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity$b r6 = new com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity$b
            double r7 = r20.getCartWasTotal()
            double r9 = r20.getCartNowTotal()
            double r11 = r20.getCartTaxTotal()
            double r13 = r20.getCartSavingsTotal()
            double r15 = r20.getCartTotalWithTax()
            r6.<init>(r7, r9, r11, r13, r15)
            r16 = 503(0x1f7, float:7.05E-43)
            r17 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r10 = r6
            r6 = r19
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity r1 = com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            Tp.g r4 = r0.shopAndScanTripDAO
            r2.f41346a = r6
            r6 = r20
            r2.f41347b = r6
            r2.f41348c = r1
            r2.f41349d = r1
            r6 = 0
            r2.f41350e = r6
            r2.f41353h = r5
            java.lang.Object r2 = r4.c(r1, r2)
            if (r2 != r3) goto L8c
            return r3
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Wp.b.S(com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity, Pl.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T(com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r29, Up.ShopAndScanCouponEntity r30, boolean r31, kotlin.coroutines.Continuation<? super com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity> r32) {
        /*
            r28 = this;
            r0 = r28
            r1 = r32
            boolean r2 = r1 instanceof Wp.b.v
            if (r2 == 0) goto L17
            r2 = r1
            Wp.b$v r2 = (Wp.b.v) r2
            int r3 = r2.f41362i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f41362i = r3
            goto L1c
        L17:
            Wp.b$v r2 = new Wp.b$v
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f41360g
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r4 = r2.f41362i
            r5 = 1
            if (r4 == 0) goto L45
            if (r4 != r5) goto L3d
            java.lang.Object r3 = r2.f41357d
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r3 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity) r3
            java.lang.Object r3 = r2.f41356c
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r3 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity) r3
            java.lang.Object r4 = r2.f41355b
            Up.a r4 = (Up.ShopAndScanCouponEntity) r4
            java.lang.Object r2 = r2.f41354a
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r2 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity) r2
            kotlin.ResultKt.b(r1)
            return r3
        L3d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L45:
            kotlin.ResultKt.b(r1)
            Up.a r14 = new Up.a
            long r7 = r30.getOfferId()
            java.lang.String r9 = r30.getCouponTitle()
            java.lang.String r10 = r30.getDescription()
            java.lang.String r11 = r30.getRedemptionStartDate()
            java.lang.String r12 = r30.getRedemptionEndDate()
            java.lang.String r13 = r30.getProductImageUrl()
            r6 = r14
            r14 = r31
            r6.<init>(r7, r9, r10, r11, r12, r13, r14)
            r14 = r6
            r26 = 524159(0x7ff7f, float:7.34503E-40)
            r27 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r6 = r29
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r1 = com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            Tp.a r4 = r0.shopAndScanItemDAO
            r2.f41354a = r6
            r6 = r30
            r2.f41355b = r6
            r2.f41356c = r1
            r2.f41357d = r1
            r14 = r31
            r2.f41358e = r14
            r6 = 0
            r2.f41359f = r6
            r2.f41362i = r5
            java.lang.Object r2 = r4.b(r1, r2)
            if (r2 != r3) goto Lac
            return r3
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Wp.b.T(com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity, Up.a, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e6, code lost:
    
        if (V(r1, r2, r11, r5) == r8) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U(Vp.UpdateItemRequest r33, com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity r34, com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r35, kotlin.coroutines.Continuation<? super kotlin.Unit> r36) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Wp.b.U(Vp.i, com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity, com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r11, com.meijer.mobile.greenville.model.request.item.update.UpdateItemRequest r12, com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity r13, kotlin.coroutines.Continuation<? super com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity> r14) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Wp.b.V(com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity, com.meijer.mobile.greenville.model.request.item.update.UpdateItemRequest, com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W(com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r29, int r30, kotlin.coroutines.Continuation<? super com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity> r31) {
        /*
            r28 = this;
            r0 = r28
            r1 = r31
            boolean r2 = r1 instanceof Wp.b.A
            if (r2 == 0) goto L17
            r2 = r1
            Wp.b$A r2 = (Wp.b.A) r2
            int r3 = r2.f41192h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f41192h = r3
            goto L1c
        L17:
            Wp.b$A r2 = new Wp.b$A
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f41190f
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r4 = r2.f41192h
            r5 = 1
            if (r4 == 0) goto L41
            if (r4 != r5) goto L39
            java.lang.Object r3 = r2.f41187c
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r3 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity) r3
            java.lang.Object r3 = r2.f41186b
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r3 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity) r3
            java.lang.Object r2 = r2.f41185a
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r2 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity) r2
            kotlin.ResultKt.b(r1)
            return r3
        L39:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L41:
            kotlin.ResultKt.b(r1)
            r26 = 522239(0x7f7ff, float:7.31813E-40)
            r27 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r6 = r29
            r18 = r30
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r1 = com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            Tp.a r4 = r0.shopAndScanItemDAO
            r2.f41185a = r6
            r2.f41186b = r1
            r2.f41187c = r1
            r6 = r30
            r2.f41188d = r6
            r6 = 0
            r2.f41189e = r6
            r2.f41192h = r5
            java.lang.Object r2 = r4.b(r1, r2)
            if (r2 != r3) goto L84
            return r3
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Wp.b.W(com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X(com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r31, com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity.h r32, com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity.a r33, com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity.Restriction r34, kotlin.coroutines.Continuation<? super com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity> r35) {
        /*
            r30 = this;
            r0 = r30
            r1 = r33
            r2 = r34
            r3 = r35
            boolean r4 = r3 instanceof Wp.b.B
            if (r4 == 0) goto L1b
            r4 = r3
            Wp.b$B r4 = (Wp.b.B) r4
            int r5 = r4.f41202j
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.f41202j = r5
            goto L20
        L1b:
            Wp.b$B r4 = new Wp.b$B
            r4.<init>(r3)
        L20:
            java.lang.Object r3 = r4.f41200h
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r6 = r4.f41202j
            r7 = 1
            if (r6 == 0) goto L51
            if (r6 != r7) goto L49
            java.lang.Object r1 = r4.f41198f
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r1 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity) r1
            java.lang.Object r1 = r4.f41197e
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r1 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity) r1
            java.lang.Object r2 = r4.f41196d
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity$f r2 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity.Restriction) r2
            java.lang.Object r2 = r4.f41195c
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity$a r2 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity.a) r2
            java.lang.Object r2 = r4.f41194b
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity$h r2 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity.h) r2
            java.lang.Object r2 = r4.f41193a
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r2 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity) r2
            kotlin.ResultKt.b(r3)
            return r1
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L51:
            kotlin.ResultKt.b(r3)
            if (r1 != 0) goto L5d
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity$a r3 = r31.getAction()
            r22 = r3
            goto L5f
        L5d:
            r22 = r1
        L5f:
            if (r2 != 0) goto L67
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity$f r3 = r31.getRestriction()
            r15 = r3
            goto L68
        L67:
            r15 = r2
        L68:
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity$i r3 = r31.getTimestamps()
            j$.time.LocalDateTime r6 = j$.time.LocalDateTime.now()
            java.lang.String r6 = r6.toString()
            java.lang.String r8 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.i(r6, r8)
            r8 = 0
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity$i r10 = com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity.Timestamp.b(r3, r8, r6, r7, r8)
            r28 = 511933(0x7cfbd, float:7.17371E-40)
            r29 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r8 = r31
            r21 = r32
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r3 = com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity.b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            Tp.a r6 = r0.shopAndScanItemDAO
            r4.f41193a = r8
            r8 = r32
            r4.f41194b = r8
            r4.f41195c = r1
            r4.f41196d = r2
            r4.f41197e = r3
            r4.f41198f = r3
            r1 = 0
            r4.f41199g = r1
            r4.f41202j = r7
            java.lang.Object r1 = r6.b(r3, r4)
            if (r1 != r5) goto Lc0
            return r5
        Lc0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Wp.b.X(com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity, com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity$h, com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity$a, com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity$f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static /* synthetic */ Object Y(b bVar, ShopAndScanItemEntity shopAndScanItemEntity, ShopAndScanItemEntity.h hVar, ShopAndScanItemEntity.a aVar, ShopAndScanItemEntity.Restriction restriction, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        if ((i10 & 4) != 0) {
            restriction = null;
        }
        return bVar.X(shopAndScanItemEntity, hVar, aVar, restriction, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z(com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r33, com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity.a r34, com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity.h r35, com.meijer.mobile.greenville.model.domain.CartItem r36, java.lang.String r37, kotlin.coroutines.Continuation<? super com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity> r38) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Wp.b.Z(com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity, com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity$a, com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity$h, com.meijer.mobile.greenville.model.domain.a, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static /* synthetic */ Object a0(b bVar, ShopAndScanItemEntity shopAndScanItemEntity, ShopAndScanItemEntity.a aVar, ShopAndScanItemEntity.h hVar, CartItem cartItem, String str, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = shopAndScanItemEntity.getAction();
        }
        ShopAndScanItemEntity.a aVar2 = aVar;
        if ((i10 & 8) != 0) {
            str = LocalDateTime.now().toString();
        }
        return bVar.Z(shopAndScanItemEntity, aVar2, hVar, cartItem, str, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b0(com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r30, com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity.h r31, com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity.a r32, com.meijer.mobile.greenville.model.domain.TransactionException r33, kotlin.coroutines.Continuation<? super com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity> r34) {
        /*
            r29 = this;
            r0 = r29
            r1 = r33
            r2 = r34
            boolean r3 = r2 instanceof Wp.b.D
            if (r3 == 0) goto L19
            r3 = r2
            Wp.b$D r3 = (Wp.b.D) r3
            int r4 = r3.f41223j
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f41223j = r4
            goto L1e
        L19:
            Wp.b$D r3 = new Wp.b$D
            r3.<init>(r2)
        L1e:
            java.lang.Object r2 = r3.f41221h
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r5 = r3.f41223j
            r6 = 1
            if (r5 == 0) goto L4f
            if (r5 != r6) goto L47
            java.lang.Object r1 = r3.f41219f
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r1 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity) r1
            java.lang.Object r1 = r3.f41218e
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r1 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity) r1
            java.lang.Object r4 = r3.f41217d
            com.meijer.mobile.greenville.model.domain.TransactionException r4 = (com.meijer.mobile.greenville.model.domain.TransactionException) r4
            java.lang.Object r4 = r3.f41216c
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity$a r4 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity.a) r4
            java.lang.Object r4 = r3.f41215b
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity$h r4 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity.h) r4
            java.lang.Object r3 = r3.f41214a
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r3 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity) r3
            kotlin.ResultKt.b(r2)
            return r1
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L4f:
            kotlin.ResultKt.b(r2)
            if (r1 == 0) goto L61
            java.lang.Throwable r2 = r1.getCause()
            if (r2 == 0) goto L61
            java.lang.String r2 = r2.getMessage()
        L5e:
            r23 = r2
            goto L63
        L61:
            r2 = 0
            goto L5e
        L63:
            r27 = 479231(0x74fff, float:6.71546E-40)
            r28 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r7 = r30
            r20 = r31
            r21 = r32
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r2 = com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            Tp.a r5 = r0.shopAndScanItemDAO
            r3.f41214a = r7
            r7 = r31
            r3.f41215b = r7
            r7 = r32
            r3.f41216c = r7
            r3.f41217d = r1
            r3.f41218e = r2
            r3.f41219f = r2
            r1 = 0
            r3.f41220g = r1
            r3.f41223j = r6
            java.lang.Object r1 = r5.b(r2, r3)
            if (r1 != r4) goto La8
            return r4
        La8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Wp.b.b0(com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity, com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity$h, com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity$a, com.meijer.mobile.greenville.model.domain.TransactionException, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object H(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof Wp.b.f
            if (r0 == 0) goto L13
            r0 = r6
            Wp.b$f r0 = (Wp.b.f) r0
            int r1 = r0.f41264c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41264c = r1
            goto L18
        L13:
            Wp.b$f r0 = new Wp.b$f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f41262a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f41264c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            kotlin.ResultKt.b(r6)
            mv.K r6 = r5.ioDispatcher
            Wp.b$g r2 = new Wp.b$g
            r4 = 0
            r2.<init>(r4)
            r0.f41264c = r3
            java.lang.Object r6 = mv.C15805i.g(r6, r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            kotlin.Unit r6 = kotlin.Unit.f143329a
            qw.a$a r6 = qw.a.INSTANCE
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Shop & Scan database cleared."
            r6.a(r1, r0)
            kotlin.Unit r6 = kotlin.Unit.f143329a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Wp.b.H(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // Wp.a
    public InterfaceC16553F<ShopAndScanTrip> a() {
        return this.tripStream;
    }

    @Override // Wp.a
    public Object b(boolean z10, Continuation<? super Unit> continuation) {
        Object objG = C15805i.g(this.ioDispatcher, new y(z10, null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f143329a;
    }

    @Override // Wp.a
    public void c(AddItemRequest request) {
        Intrinsics.j(request, "request");
        C15809k.d(this.repositoryScope, null, null, new C0886b(request, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Wp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(Vp.ResumeTripRequest r5, kotlin.coroutines.Continuation<? super Xp.ShopAndScanTrip> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Wp.b.r
            if (r0 == 0) goto L13
            r0 = r6
            Wp.b$r r0 = (Wp.b.r) r0
            int r1 = r0.f41329d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41329d = r1
            goto L18
        L13:
            Wp.b$r r0 = new Wp.b$r
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f41327b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f41329d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f41326a
            Vp.e r5 = (Vp.ResumeTripRequest) r5
            kotlin.ResultKt.b(r6)
            goto L45
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.b(r6)
            Tp.g r6 = r4.shopAndScanTripDAO
            r0.f41326a = r5
            r0.f41329d = r3
            java.lang.Object r6 = r6.f(r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity r6 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity) r6
            if (r6 == 0) goto L50
            Xp.f r5 = com.meijer.mobile.shopandscan.data.local.entity.b.b(r6)
            if (r5 == 0) goto L50
            return r5
        L50:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Wp.b.d(Vp.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d7, code lost:
    
        if (U(r3, r2, r10, r0) != r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e9, code lost:
    
        if (R(r11, r0) == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Wp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(Vp.UpdateItemRequest r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Wp.b.e(Vp.i, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Wp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof Wp.b.j
            if (r0 == 0) goto L13
            r0 = r6
            Wp.b$j r0 = (Wp.b.j) r0
            int r1 = r0.f41292f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41292f = r1
            goto L18
        L13:
            Wp.b$j r0 = new Wp.b$j
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f41290d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f41292f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r1 = r0.f41288b
            Wp.b r1 = (Wp.b) r1
            java.lang.Object r0 = r0.f41287a
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity r0 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity) r0
            kotlin.ResultKt.b(r6)
            goto L7d
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3c:
            kotlin.ResultKt.b(r6)
            goto L4e
        L40:
            kotlin.ResultKt.b(r6)
            Tp.g r6 = r5.shopAndScanTripDAO
            r0.f41292f = r4
            java.lang.Object r6 = r6.f(r0)
            if (r6 != r1) goto L4e
            goto L7b
        L4e:
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity r6 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity) r6
            if (r6 == 0) goto L81
            boolean r2 = r6.getIsGreenville()
            if (r2 == 0) goto L81
            java.util.List<Pl.d> r2 = r5.localPicklist
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L81
            Sl.a r2 = r5.greenvilleRepository
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity$c r4 = r6.getStore()
            int r4 = r4.getId()
            r0.f41287a = r6
            r0.f41288b = r5
            r6 = 0
            r0.f41289c = r6
            r0.f41292f = r3
            java.lang.Object r6 = r2.f(r4, r0)
            if (r6 != r1) goto L7c
        L7b:
            return r1
        L7c:
            r1 = r5
        L7d:
            java.util.List r6 = (java.util.List) r6
            r1.localPicklist = r6
        L81:
            kotlin.Unit r6 = kotlin.Unit.f143329a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Wp.b.f(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01db, code lost:
    
        if (T(r11, r14, true, r4) == r5) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x027d, code lost:
    
        if (T(r6, r13, false, r4) == r5) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b6 A[PHI: r2 r3 r6 r9 r11 r12 r13
      0x01b6: PHI (r2v17 int) = (r2v14 int), (r2v14 int), (r2v19 int) binds: [B:56:0x0190, B:58:0x01b2, B:19:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x01b6: PHI (r3v10 java.lang.Object) = (r3v4 java.lang.Object), (r3v4 java.lang.Object), (r3v14 java.lang.Object) binds: [B:56:0x0190, B:58:0x01b2, B:19:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x01b6: PHI (r6v16 Up.a) = (r6v12 Up.a), (r6v12 Up.a), (r6v18 Up.a) binds: [B:56:0x0190, B:58:0x01b2, B:19:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x01b6: PHI (r9v10 long) = (r9v7 long), (r9v7 long), (r9v11 long) binds: [B:56:0x0190, B:58:0x01b2, B:19:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x01b6: PHI (r11v10 com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity) = 
      (r11v6 com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity)
      (r11v6 com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity)
      (r11v12 com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity)
     binds: [B:56:0x0190, B:58:0x01b2, B:19:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x01b6: PHI (r12v13 com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest) = 
      (r12v9 com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest)
      (r12v9 com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest)
      (r12v15 com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest)
     binds: [B:56:0x0190, B:58:0x01b2, B:19:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x01b6: PHI (r13v3 java.lang.String) = (r13v2 java.lang.String), (r13v2 java.lang.String), (r13v5 java.lang.String) binds: [B:56:0x0190, B:58:0x01b2, B:19:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025f  */
    @Override // Wp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(long r19, java.lang.String r21, kotlin.coroutines.Continuation<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Wp.b.g(long, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Wp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(Vp.StartTripRequest r6, kotlin.coroutines.Continuation<? super Xp.ShopAndScanTrip> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Wp.b.t
            if (r0 == 0) goto L13
            r0 = r7
            Wp.b$t r0 = (Wp.b.t) r0
            int r1 = r0.f41345f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41345f = r1
            goto L18
        L13:
            Wp.b$t r0 = new Wp.b$t
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f41343d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f41345f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.f41342c
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity r6 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity) r6
            java.lang.Object r1 = r0.f41341b
            Pl.e r1 = (Pl.Transaction) r1
            java.lang.Object r0 = r0.f41340a
            Vp.f r0 = (Vp.StartTripRequest) r0
            kotlin.ResultKt.b(r7)
            goto L7e
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            java.lang.Object r6 = r0.f41340a
            Vp.f r6 = (Vp.StartTripRequest) r6
            kotlin.ResultKt.b(r7)
            goto L5c
        L48:
            kotlin.ResultKt.b(r7)
            Sl.a r7 = r5.greenvilleRepository
            com.meijer.mobile.greenville.model.request.trip.start.StartTripRequest r2 = Vp.g.a(r6)
            r0.f41340a = r6
            r0.f41345f = r4
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L5c
            goto L7c
        L5c:
            Pl.e r7 = (Pl.Transaction) r7
            Pl.c r2 = r7.getHeader()
            java.lang.String r2 = r2.getTransactionId()
            Pl.c r4 = r7.getHeader()
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity r2 = com.meijer.mobile.shopandscan.data.local.entity.b.a(r6, r2, r4)
            r0.f41340a = r6
            r0.f41341b = r7
            r0.f41342c = r2
            r0.f41345f = r3
            java.lang.Object r6 = r5.M(r2, r0)
            if (r6 != r1) goto L7d
        L7c:
            return r1
        L7d:
            r6 = r2
        L7e:
            Xp.f r6 = com.meijer.mobile.shopandscan.data.local.entity.b.b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Wp.b.h(Vp.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (r10 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Wp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(Vp.LookupItemRequest r9, kotlin.coroutines.Continuation<? super Xp.ShopAndScanLookupItem> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof Wp.b.o
            if (r0 == 0) goto L13
            r0 = r10
            Wp.b$o r0 = (Wp.b.o) r0
            int r1 = r0.f41311d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41311d = r1
            goto L18
        L13:
            Wp.b$o r0 = new Wp.b$o
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f41309b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f41311d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r9 = r0.f41308a
            Vp.d r9 = (Vp.LookupItemRequest) r9
            kotlin.ResultKt.b(r10)
            goto L6e
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.Object r9 = r0.f41308a
            Vp.d r9 = (Vp.LookupItemRequest) r9
            kotlin.ResultKt.b(r10)
            goto L56
        L40:
            kotlin.ResultKt.b(r10)
            java.util.List<Pl.d> r10 = r8.localPicklist
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L56
            r0.f41308a = r9
            r0.f41311d = r4
            java.lang.Object r10 = r8.f(r0)
            if (r10 != r1) goto L56
            goto L6d
        L56:
            Xp.a$e r10 = new Xp.a$e
            java.lang.String r2 = r9.getPluNumber()
            r10.<init>(r2)
            java.lang.String r10 = r10.getData()
            r0.f41308a = r9
            r0.f41311d = r3
            java.lang.Object r10 = r8.J(r10, r0)
            if (r10 != r1) goto L6e
        L6d:
            return r1
        L6e:
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r10 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity) r10
            if (r10 != 0) goto L7b
            java.lang.String r9 = r9.getPluNumber()
            Xp.d r9 = r8.L(r9)
            return r9
        L7b:
            java.lang.String r1 = r10.getItemId()
            java.lang.String r2 = r10.getTitle()
            int r3 = r10.getQuantity()
            r9 = r4
            Xp.a$h r4 = new Xp.a$h
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity$b r0 = r10.getBarcode()
            java.lang.String r0 = r0.getData()
            r4.<init>(r0)
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity$e r0 = r10.getPrice()
            if (r0 == 0) goto La1
            java.lang.Double r0 = r0.getNetPrice()
        L9f:
            r5 = r0
            goto La3
        La1:
            r0 = 0
            goto L9f
        La3:
            boolean r0 = r10.getIsQuantityUpdateAllowed()
            r7 = r0 ^ 1
            java.lang.String r6 = r10.getImageUrl()
            Xp.d r0 = new Xp.d
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Wp.b.i(Vp.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0119 A[PHI: r2 r5 r13
      0x0119: PHI (r2v9 java.lang.Object) = (r2v7 java.lang.Object), (r2v10 java.lang.Object) binds: [B:44:0x00fb, B:49:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r5v9 com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity) = 
      (r5v7 com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity)
      (r5v10 com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity)
     binds: [B:44:0x00fb, B:49:0x0118] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r13v16 com.meijer.mobile.greenville.model.request.trip.cancel.CancelTripRequest) = 
      (r13v13 com.meijer.mobile.greenville.model.request.trip.cancel.CancelTripRequest)
      (r13v18 com.meijer.mobile.greenville.model.request.trip.cancel.CancelTripRequest)
     binds: [B:44:0x00fb, B:49:0x0118] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Wp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(kotlin.coroutines.Continuation<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Wp.b.j(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
    
        if (H(r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Wp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(Vp.ActiveTripRequest r8, kotlin.coroutines.Continuation<? super Xp.ShopAndScanTrip> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof Wp.b.C5549a
            if (r0 == 0) goto L13
            r0 = r9
            Wp.b$a r0 = (Wp.b.C5549a) r0
            int r1 = r0.f41228e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41228e = r1
            goto L18
        L13:
            Wp.b$a r0 = new Wp.b$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f41226c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f41228e
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L54
            if (r2 == r6) goto L4c
            if (r2 == r5) goto L40
            if (r2 != r4) goto L38
            java.lang.Object r8 = r0.f41225b
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity r8 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity) r8
            java.lang.Object r8 = r0.f41224a
            Vp.a r8 = (Vp.ActiveTripRequest) r8
            kotlin.ResultKt.b(r9)
            goto L8b
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            java.lang.Object r8 = r0.f41225b
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity r8 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity) r8
            java.lang.Object r8 = r0.f41224a
            Vp.a r8 = (Vp.ActiveTripRequest) r8
            kotlin.ResultKt.b(r9)
            goto L7b
        L4c:
            java.lang.Object r8 = r0.f41224a
            Vp.a r8 = (Vp.ActiveTripRequest) r8
            kotlin.ResultKt.b(r9)
            goto L64
        L54:
            kotlin.ResultKt.b(r9)
            Tp.g r9 = r7.shopAndScanTripDAO
            r0.f41224a = r8
            r0.f41228e = r6
            java.lang.Object r9 = r9.f(r0)
            if (r9 != r1) goto L64
            goto L8a
        L64:
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity r9 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity) r9
            if (r9 == 0) goto L7e
            boolean r2 = r7.O(r9, r8)
            if (r2 == 0) goto L7e
            r0.f41224a = r8
            r0.f41225b = r9
            r0.f41228e = r5
            java.lang.Object r9 = r7.I(r9, r0)
            if (r9 != r1) goto L7b
            goto L8a
        L7b:
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity r9 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanTripEntity) r9
            goto L8c
        L7e:
            r0.f41224a = r8
            r0.f41225b = r9
            r0.f41228e = r4
            java.lang.Object r8 = r7.H(r0)
            if (r8 != r1) goto L8b
        L8a:
            return r1
        L8b:
            r9 = r3
        L8c:
            if (r9 == 0) goto L93
            Xp.f r8 = com.meijer.mobile.shopandscan.data.local.entity.b.b(r9)
            return r8
        L93:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Wp.b.k(Vp.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a9, code lost:
    
        if (r5.b(r2, r3) == r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // Wp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l(java.lang.String r30, kotlin.coroutines.Continuation<? super kotlin.Unit> r31) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            boolean r3 = r2 instanceof Wp.b.i
            if (r3 == 0) goto L19
            r3 = r2
            Wp.b$i r3 = (Wp.b.i) r3
            int r4 = r3.f41286g
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f41286g = r4
            goto L1e
        L19:
            Wp.b$i r3 = new Wp.b$i
            r3.<init>(r2)
        L1e:
            java.lang.Object r2 = r3.f41284e
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r5 = r3.f41286g
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L4e
            if (r5 == r7) goto L46
            if (r5 != r6) goto L3e
            java.lang.Object r1 = r3.f41282c
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r1 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity) r1
            java.lang.Object r1 = r3.f41281b
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r1 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity) r1
            java.lang.Object r1 = r3.f41280a
            java.lang.String r1 = (java.lang.String) r1
            kotlin.ResultKt.b(r2)
            goto Lac
        L3e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L46:
            java.lang.Object r1 = r3.f41280a
            java.lang.String r1 = (java.lang.String) r1
            kotlin.ResultKt.b(r2)
            goto L5c
        L4e:
            kotlin.ResultKt.b(r2)
            r3.f41280a = r1
            r3.f41286g = r7
            java.lang.Object r2 = r0.K(r1, r3)
            if (r2 != r4) goto L5c
            goto Lab
        L5c:
            r7 = r2
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r7 = (com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity) r7
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity$f r8 = r7.getRestriction()
            if (r8 == 0) goto L70
            r12 = 3
            r13 = 0
            r9 = 0
            r10 = 0
            r11 = 1
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity$f r2 = com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity.Restriction.b(r8, r9, r10, r11, r12, r13)
        L6e:
            r14 = r2
            goto L72
        L70:
            r2 = 0
            goto L6e
        L72:
            r27 = 524223(0x7ffbf, float:7.34593E-40)
            r28 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity r2 = com.meijer.mobile.shopandscan.data.local.entity.ShopAndScanItemEntity.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            Tp.a r5 = r0.shopAndScanItemDAO
            r3.f41280a = r1
            r3.f41281b = r2
            r3.f41282c = r2
            r1 = 0
            r3.f41283d = r1
            r3.f41286g = r6
            java.lang.Object r1 = r5.b(r2, r3)
            if (r1 != r4) goto Lac
        Lab:
            return r4
        Lac:
            kotlin.Unit r1 = kotlin.Unit.f143329a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Wp.b.l(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final boolean O(ShopAndScanTripEntity shopAndScanTripEntity, ActiveTripRequest activeTripRequest) {
        boolean z10;
        boolean z11;
        boolean zE = Intrinsics.e(activeTripRequest.getMPerksBarcode(), shopAndScanTripEntity.getUser().getMPerksBarcode());
        if (activeTripRequest.getStore().getId() == shopAndScanTripEntity.getStore().getId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (Duration.between(LocalDateTime.parse(shopAndScanTripEntity.getStartTime()), activeTripRequest.getCurrentTime()).toHours() <= 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!zE || !z10 || !z11) {
            return false;
        }
        return true;
    }
}
