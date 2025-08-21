package sn;

import Ao.W;
import Co.ProductFullDetails;
import Hk.UIEvent;
import Hl.FlyBuyOrderDetail;
import Qj.DialogEvent;
import Rn.FlyBuyState;
import Tq.PointOfService;
import android.annotation.SuppressLint;
import android.view.animation.AnticipateOvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import com.adobe.marketing.mobile.InterfaceC6543a;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.meijer.mobile.digitalshopping.api.orders.model.orderrewards.OrderRewardPointsForOrderResponse;
import com.meijer.mobile.home.ux.orders.NullOrderException;
import com.meijer.mobile.storeinfo.api.model.StoreInfo;
import es.AbstractC13866b;
import es.FetchSubstitutedProducts;
import es.OrderDetailStatusDayDateTimeDecorator;
import es.OrderDetailStatusDecorator;
import es.OrderHeaderDecorator;
import es.OrderSubstitutionsDetailBannerDecorator;
import ev.C13889a;
import fj.DeliveryMode;
import fj.Entry;
import fj.ShoppingCart;
import fj.TendersItem;
import gj.PickupPerson;
import hi.InterfaceC14523a;
import hj.EbtTransaction;
import hj.OrderDetail;
import hn.C14543b;
import hn.C14544c;
import hn.EbtTransactionItemDecorator;
import hn.OrderDetailAddressDecorator;
import hn.OrderDetailContactNumberDecorator;
import hn.OrderDetailEditOrderDecorator;
import hn.OrderDetailOrderedItemsDecorator;
import hn.OrderDetailPaymentDecorator;
import hn.OrderDetailPickupHoursDecorator;
import hn.OrderDetailShopperInfoDecorator;
import hn.OrderDetailSummaryDecorator;
import hn.OrderDetailWhatsNextDecorator;
import ii.C14756c;
import ii.TrackingData;
import ik.CartPreviewDecorator;
import il.InterfaceC14774f;
import im.C14782d;
import im.OrderResponseHolder;
import j$.time.LocalDateTime;
import j$.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import mv.C15809k;
import mv.E0;
import mv.InterfaceC15783O;
import pk.StoreDetails;
import pv.C16563h;
import pv.InterfaceC16549B;
import qw.a;
import rn.C16929a;
import rn.C16930b;
import tp.Builder;
import tp.EnumC17276a;
import uo.OrderOutOfStockItem;
import vo.OrderSubstitutionItem;
import xl.OrderSubstitutionsDetail;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000\u0098\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u00002\u00020\u0001:\u0006\u0095\u0001\u008f\u0001\u0091\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020\u00142\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0014H\u0002¢\u0006\u0004\b)\u0010\u0016J\u000f\u0010*\u001a\u00020\u0014H\u0002¢\u0006\u0004\b*\u0010\u0016J\u000f\u0010+\u001a\u00020\u0014H\u0002¢\u0006\u0004\b+\u0010\u0016J\u000f\u0010,\u001a\u00020\u0014H\u0002¢\u0006\u0004\b,\u0010\u0016J\u0017\u0010/\u001a\u00020\u00142\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J+\u00105\u001a\u00020\u00142\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020#2\n\b\u0002\u00104\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0014H\u0002¢\u0006\u0004\b7\u0010\u0016J\u000f\u00108\u001a\u00020\u0014H\u0002¢\u0006\u0004\b8\u0010\u0016J\u000f\u00109\u001a\u00020\u0014H\u0002¢\u0006\u0004\b9\u0010\u0016J\u001b\u0010<\u001a\u00020\u00142\n\u0010;\u001a\u00060-j\u0002`:H\u0002¢\u0006\u0004\b<\u00100J\u001b\u0010=\u001a\u00020\u00142\n\u0010;\u001a\u00060-j\u0002`:H\u0002¢\u0006\u0004\b=\u00100J$\u0010@\u001a\u00020\u00142\n\u0010;\u001a\u00060-j\u0002`:2\u0006\u0010?\u001a\u00020>H\u0082@¢\u0006\u0004\b@\u0010AJ#\u0010D\u001a\u00020\u00142\u0006\u0010?\u001a\u00020>2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010BH\u0002¢\u0006\u0004\bD\u0010EJ\u001b\u0010I\u001a\u00020\u00142\n\u0010H\u001a\u00060Fj\u0002`GH\u0002¢\u0006\u0004\bI\u0010JJ#\u0010L\u001a\u00020\u00142\u0006\u0010?\u001a\u00020>2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010BH\u0002¢\u0006\u0004\bL\u0010EJ\u0017\u0010O\u001a\u00020\u00142\u0006\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bO\u0010PJ3\u0010W\u001a\b\u0012\u0004\u0012\u00020V0U2\u0006\u0010R\u001a\u00020Q2\b\u0010T\u001a\u0004\u0018\u00010S2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010BH\u0002¢\u0006\u0004\bW\u0010XJ\u000f\u0010Z\u001a\u00020YH\u0002¢\u0006\u0004\bZ\u0010[J+\u0010_\u001a\u00020\u00142\u0006\u0010]\u001a\u00020\\2\n\u0010;\u001a\u00060-j\u0002`:2\u0006\u0010^\u001a\u00020-H\u0003¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020\u0014H\u0002¢\u0006\u0004\ba\u0010\u0016J\u000f\u0010b\u001a\u00020\u0014H\u0002¢\u0006\u0004\bb\u0010\u0016J\u000f\u0010c\u001a\u00020\u0014H\u0002¢\u0006\u0004\bc\u0010\u0016J\u000f\u0010d\u001a\u00020\u0014H\u0002¢\u0006\u0004\bd\u0010\u0016J\u000f\u0010e\u001a\u00020\u0014H\u0002¢\u0006\u0004\be\u0010\u0016J\u000f\u0010f\u001a\u00020\u0014H\u0002¢\u0006\u0004\bf\u0010\u0016J\u001f\u0010i\u001a\u00020\u00142\u000e\u0010h\u001a\n\u0012\u0004\u0012\u00020g\u0018\u00010UH\u0002¢\u0006\u0004\bi\u0010jJ'\u0010m\u001a\u00020\u00142\u000e\u0010k\u001a\n\u0012\u0004\u0012\u00020g\u0018\u00010U2\u0006\u0010l\u001a\u00020#H\u0002¢\u0006\u0004\bm\u0010nJ\u001f\u0010q\u001a\u00020\u00142\u0006\u0010o\u001a\u00020#2\u0006\u0010p\u001a\u00020#H\u0002¢\u0006\u0004\bq\u0010rJ#\u0010u\u001a\u00020\u00142\u0012\u0010t\u001a\u000e\u0012\b\u0012\u00060-j\u0002`s\u0018\u00010UH\u0002¢\u0006\u0004\bu\u0010jJ\u000f\u0010v\u001a\u00020\u0014H\u0002¢\u0006\u0004\bv\u0010\u0016J\u000f\u0010w\u001a\u00020\u0014H\u0002¢\u0006\u0004\bw\u0010\u0016J\u000f\u0010x\u001a\u00020\u0014H\u0002¢\u0006\u0004\bx\u0010\u0016J\u000f\u0010y\u001a\u00020\u0014H\u0002¢\u0006\u0004\by\u0010\u0016J\u000f\u0010z\u001a\u00020\u0014H\u0002¢\u0006\u0004\bz\u0010\u0016J\u000f\u0010{\u001a\u00020\u0014H\u0002¢\u0006\u0004\b{\u0010\u0016J\u000f\u0010|\u001a\u00020\u0014H\u0002¢\u0006\u0004\b|\u0010\u0016J\u000f\u0010}\u001a\u00020\u0014H\u0002¢\u0006\u0004\b}\u0010\u0016J\u000f\u0010~\u001a\u00020\u0014H\u0002¢\u0006\u0004\b~\u0010\u0016J\u000f\u0010\u007f\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u007f\u0010\u0016J\u001a\u0010\u0081\u0001\u001a\u00020\u00142\u0007\u0010\u0080\u0001\u001a\u00020-H\u0002¢\u0006\u0005\b\u0081\u0001\u00100J\u001a\u0010\u0082\u0001\u001a\u00020\u00142\u0006\u0010R\u001a\u00020QH\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0011\u0010\u0084\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b\u0084\u0001\u0010\u0016R\u0016\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001f\u0010\u0097\u0001\u001a\n\u0012\u0005\u0012\u00030\u0094\u00010\u0093\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R$\u0010\u009d\u0001\u001a\n\u0012\u0005\u0012\u00030\u0094\u00010\u0098\u00018\u0006¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010¡\u0001\u001a\u00030\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0019\u0010¤\u0001\u001a\u00020Q8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u001c\u0010¨\u0001\u001a\u0005\u0018\u00010¥\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R \u0010h\u001a\n\u0012\u0004\u0012\u00020g\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R!\u0010®\u0001\u001a\n\u0012\u0005\u0012\u00030¬\u00010«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010ª\u0001R!\u0010±\u0001\u001a\n\u0012\u0005\u0012\u00030¯\u00010«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010ª\u0001R!\u0010³\u0001\u001a\n\u0012\u0005\u0012\u00030¯\u00010«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010ª\u0001R!\u0010¶\u0001\u001a\n\u0012\u0005\u0012\u00030´\u00010«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010ª\u0001R\u0019\u0010¹\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u0019\u0010¼\u0001\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R!\u0010¿\u0001\u001a\n\u0018\u00010-j\u0004\u0018\u0001`:8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u0019\u0010Á\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010¸\u0001R\u0019\u0010Ã\u0001\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010¾\u0001R\u0016\u0010\u001c\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÄ\u0001\u0010Å\u0001¨\u0006Æ\u0001"}, d2 = {"Lsn/L;", "Landroidx/lifecycle/c0;", "Lcom/meijer/mobile/digitalshopping/api/orders/a;", "ordersRepository", "Lyo/k;", "userManager", "Lil/m;", "cartRepository", "Lzl/k;", "featureManager", "LRo/c;", "productsRepository", "LZq/b;", "storeInfoRepository", "LRn/I;", "flyBuyManager", "Lhi/a;", "analyticsEngine", "<init>", "(Lcom/meijer/mobile/digitalshopping/api/orders/a;Lyo/k;Lil/m;Lzl/k;LRo/c;LZq/b;LRn/I;Lhi/a;)V", "", "onCleared", "()V", "Lsn/L$f;", "action", "M0", "(Lsn/L$f;)V", "LRn/K;", "flyBuyState", "b1", "(LRn/K;)V", "Lcom/meijer/mobile/storeinfo/api/model/StoreInfo;", "storeInfo", "z0", "(Lcom/meijer/mobile/storeinfo/api/model/StoreInfo;)V", "", "isOnMyWayAction", "j$/time/LocalDateTime", "currentDateTime", "I0", "(ZLj$/time/LocalDateTime;)V", "H0", "K0", "Y0", "W0", "", PlaceTypes.ROUTE, "L0", "(Ljava/lang/String;)V", "Lvo/b;", "substitutionScreenType", "isOnMyWayClicked", "orderType", "Z0", "(Lvo/b;ZLjava/lang/String;)V", "m0", "f1", "V0", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "x0", "w0", "Lim/b;", "orderResponseHolder", "y0", "(Ljava/lang/String;Lim/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/digitalshopping/api/orders/model/orderrewards/OrderRewardPointsForOrderResponse;", "mperksPointsBySale", "P0", "(Lim/b;Lcom/meijer/mobile/digitalshopping/api/orders/model/orderrewards/OrderRewardPointsForOrderResponse;)V", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "A0", "(I)V", "mperksPointsBySaleResponse", "S0", "", "throwable", "R0", "(Ljava/lang/Throwable;)V", "Lhj/c;", "orderDetails", "LHl/b$c;", "flyBuyOrder", "", "Les/b;", "n0", "(Lhj/c;LHl/b$c;Lcom/meijer/mobile/digitalshopping/api/orders/model/orderrewards/OrderRewardPointsForOrderResponse;)Ljava/util/List;", "Landroid/view/animation/AnticipateOvershootInterpolator;", "r0", "()Landroid/view/animation/AnticipateOvershootInterpolator;", "Lfj/h;", "deliveryMode", "pickupPersonName", "s1", "(Lfj/h;Ljava/lang/String;Ljava/lang/String;)V", "o0", "q1", "s0", "N0", "O0", "B0", "LCo/h;", "productDetailsList", "m1", "(Ljava/util/List;)V", "productsDetailList", "isRejectedItem", "l1", "(Ljava/util/List;Z)V", "isParkingSpotButtonShowed", "hasFlyBuyOrderData", "q0", "(ZZ)V", "Lcom/meijer/mobile/core/models/products/ProductCode;", "listUPCSubstitutedItems", "F0", "p0", "e1", "k1", "j1", "g1", "d1", "i1", "c1", "h1", "X0", "shortCode", "G0", "n1", "(Lhj/c;)V", "t0", "a", "Lcom/meijer/mobile/digitalshopping/api/orders/a;", "b", "Lil/m;", "c", "Lzl/k;", "d", "LRo/c;", "e", "LZq/b;", "f", "LRn/I;", "g", "Lhi/a;", "Lpv/B;", "Lsn/L$h;", "h", "Lpv/B;", "_orderDetailsViewState", "Lpv/P;", "i", "Lpv/P;", "E0", "()Lpv/P;", "orderDetailsViewState", "LJu/a;", "j", "LJu/a;", "compositeDisposable", "k", "Lhj/c;", "fetchedOrder", "Lxl/a;", "l", "Lxl/a;", "fetchedOrderWithSubstitution", "m", "Ljava/util/List;", "", "Lvo/a;", "n", "listSubstitutedItems", "Luo/a;", "o", "listOutOfStockItems", "p", "listRejectedSubstitutedItems", "Les/a;", "q", "listUPCItems", "r", "Z", "shouldShowBannerWithFlyBuy", "s", "I", "currentCartSize", "t", "Ljava/lang/String;", "currentCartOriginalOrderId", "u", "hasAnimated", "v", "previousTrackAction", "C0", "()LRn/K;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class L extends androidx.view.c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.meijer.mobile.digitalshopping.api.orders.a ordersRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final il.m cartRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final zl.k featureManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Ro.c productsRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Zq.b storeInfoRepository;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Rn.I flyBuyManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<OrderDetailsViewState> _orderDetailsViewState;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final pv.P<OrderDetailsViewState> orderDetailsViewState;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Ju.a compositeDisposable;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private OrderDetail fetchedOrder;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private OrderSubstitutionsDetail fetchedOrderWithSubstitution;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private List<ProductFullDetails> productDetailsList;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private List<OrderSubstitutionItem> listSubstitutedItems;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private List<OrderOutOfStockItem> listOutOfStockItems;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private List<OrderOutOfStockItem> listRejectedSubstitutedItems;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private List<FetchSubstitutedProducts> listUPCItems;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean shouldShowBannerWithFlyBuy;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int currentCartSize;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private String currentCartOriginalOrderId;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean hasAnimated;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private String previousTrackAction;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        a(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        b(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        c(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class d extends FunctionReferenceImpl implements Function1<FlyBuyState, Unit> {
        d(Object obj) {
            super(1, obj, L.class, "onNewFlyBuyState", "onNewFlyBuyState(Lcom/meijer/mobile/meijer/managers/FlyBuyState;)V", 0);
        }

        public final void a(FlyBuyState p02) {
            Intrinsics.j(p02, "p0");
            ((L) this.receiver).b1(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FlyBuyState flyBuyState) {
            a(flyBuyState);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class e extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        e(Object obj) {
            super(1, obj, a.Companion.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((a.Companion) this.receiver).e(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0019\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001cB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0019\u001d\u001e\u001f !\"#$%&'()*+,-./012345¨\u00066"}, d2 = {"Lsn/L$f;", "", "<init>", "()V", "e", "d", "n", "x", "m", "y", "h", "i", "a", "b", "q", "p", "s", "u", "t", "r", "v", "c", "k", "o", "g", "f", "l", "w", "j", "Lsn/L$f$a;", "Lsn/L$f$b;", "Lsn/L$f$c;", "Lsn/L$f$d;", "Lsn/L$f$e;", "Lsn/L$f$f;", "Lsn/L$f$g;", "Lsn/L$f$h;", "Lsn/L$f$i;", "Lsn/L$f$j;", "Lsn/L$f$k;", "Lsn/L$f$l;", "Lsn/L$f$m;", "Lsn/L$f$n;", "Lsn/L$f$o;", "Lsn/L$f$p;", "Lsn/L$f$q;", "Lsn/L$f$r;", "Lsn/L$f$s;", "Lsn/L$f$t;", "Lsn/L$f$u;", "Lsn/L$f$v;", "Lsn/L$f$w;", "Lsn/L$f$x;", "Lsn/L$f$y;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class f {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/L$f$a;", "Lsn/L$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final a f160916a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public String toString() {
                return "CancelOrder";
            }

            public int hashCode() {
                return -43025347;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/L$f$b;", "Lsn/L$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final b f160917a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public String toString() {
                return "CancelOrderWarning";
            }

            public int hashCode() {
                return 1347615903;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/L$f$c;", "Lsn/L$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final c f160918a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public String toString() {
                return "ClearEvent";
            }

            public int hashCode() {
                return 678498276;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/L$f$d;", "Lsn/L$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final d f160919a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public String toString() {
                return "ContinueCustomerImHere";
            }

            public int hashCode() {
                return -731666864;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/L$f$e;", "Lsn/L$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class e extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final e f160920a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public String toString() {
                return "ContinueCustomerOnTheWay";
            }

            public int hashCode() {
                return 48166809;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lsn/L$f$f;", "Lsn/L$f;", "j$/time/LocalDateTime", "currentDateTime", "<init>", "(Lj$/time/LocalDateTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj$/time/LocalDateTime;", "()Lj$/time/LocalDateTime;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.L$f$f, reason: collision with other inner class name and from toString */
        public static final /* data */ class CustomerIsHere extends f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final LocalDateTime currentDateTime;

            /* JADX WARN: Multi-variable type inference failed */
            public CustomerIsHere() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CustomerIsHere) && Intrinsics.e(this.currentDateTime, ((CustomerIsHere) other).currentDateTime);
            }

            public /* synthetic */ CustomerIsHere(LocalDateTime localDateTime, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? LocalDateTime.now() : localDateTime);
            }

            /* renamed from: a, reason: from getter */
            public final LocalDateTime getCurrentDateTime() {
                return this.currentDateTime;
            }

            public int hashCode() {
                return this.currentDateTime.hashCode();
            }

            public String toString() {
                return "CustomerIsHere(currentDateTime=" + this.currentDateTime + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CustomerIsHere(LocalDateTime currentDateTime) {
                super(null);
                Intrinsics.j(currentDateTime, "currentDateTime");
                this.currentDateTime = currentDateTime;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lsn/L$f$g;", "Lsn/L$f;", "j$/time/LocalDateTime", "currentDateTime", "<init>", "(Lj$/time/LocalDateTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj$/time/LocalDateTime;", "()Lj$/time/LocalDateTime;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.L$f$g, reason: from toString */
        public static final /* data */ class CustomerOnTheWay extends f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final LocalDateTime currentDateTime;

            /* JADX WARN: Multi-variable type inference failed */
            public CustomerOnTheWay() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CustomerOnTheWay) && Intrinsics.e(this.currentDateTime, ((CustomerOnTheWay) other).currentDateTime);
            }

            public /* synthetic */ CustomerOnTheWay(LocalDateTime localDateTime, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? LocalDateTime.now() : localDateTime);
            }

            /* renamed from: a, reason: from getter */
            public final LocalDateTime getCurrentDateTime() {
                return this.currentDateTime;
            }

            public int hashCode() {
                return this.currentDateTime.hashCode();
            }

            public String toString() {
                return "CustomerOnTheWay(currentDateTime=" + this.currentDateTime + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CustomerOnTheWay(LocalDateTime currentDateTime) {
                super(null);
                Intrinsics.j(currentDateTime, "currentDateTime");
                this.currentDateTime = currentDateTime;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/L$f$h;", "Lsn/L$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class h extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final h f160923a = new h();

            private h() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof h);
            }

            public String toString() {
                return "EditOrder";
            }

            public int hashCode() {
                return -2111654675;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/L$f$i;", "Lsn/L$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class i extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final i f160924a = new i();

            private i() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof i);
            }

            public String toString() {
                return "EditPhoneNumber";
            }

            public int hashCode() {
                return -1486949194;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Lsn/L$f$j;", "Lsn/L$f;", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "previousTrackAction", "shortCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.L$f$j, reason: from toString */
        public static final /* data */ class FetchDetails extends f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String orderId;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String previousTrackAction;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String shortCode;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FetchDetails)) {
                    return false;
                }
                FetchDetails fetchDetails = (FetchDetails) other;
                return Intrinsics.e(this.orderId, fetchDetails.orderId) && Intrinsics.e(this.previousTrackAction, fetchDetails.previousTrackAction) && Intrinsics.e(this.shortCode, fetchDetails.shortCode);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FetchDetails(String orderId, String previousTrackAction, String shortCode) {
                super(null);
                Intrinsics.j(orderId, "orderId");
                Intrinsics.j(previousTrackAction, "previousTrackAction");
                Intrinsics.j(shortCode, "shortCode");
                this.orderId = orderId;
                this.previousTrackAction = previousTrackAction;
                this.shortCode = shortCode;
            }

            /* renamed from: a, reason: from getter */
            public final String getOrderId() {
                return this.orderId;
            }

            /* renamed from: b, reason: from getter */
            public final String getPreviousTrackAction() {
                return this.previousTrackAction;
            }

            /* renamed from: c, reason: from getter */
            public final String getShortCode() {
                return this.shortCode;
            }

            public int hashCode() {
                return (((this.orderId.hashCode() * 31) + this.previousTrackAction.hashCode()) * 31) + this.shortCode.hashCode();
            }

            public String toString() {
                return "FetchDetails(orderId=" + this.orderId + ", previousTrackAction=" + this.previousTrackAction + ", shortCode=" + this.shortCode + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/L$f$k;", "Lsn/L$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class k extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final k f160928a = new k();

            private k() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof k);
            }

            public String toString() {
                return "HideBottomSheet";
            }

            public int hashCode() {
                return 611257883;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lsn/L$f$l;", "Lsn/L$f;", "", "isOrderEditable", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.L$f$l, reason: from toString */
        public static final /* data */ class IsOrderEditable extends f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isOrderEditable;

            public IsOrderEditable(boolean z10) {
                super(null);
                this.isOrderEditable = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof IsOrderEditable) && this.isOrderEditable == ((IsOrderEditable) other).isOrderEditable;
            }

            /* renamed from: a, reason: from getter */
            public final boolean getIsOrderEditable() {
                return this.isOrderEditable;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isOrderEditable);
            }

            public String toString() {
                return "IsOrderEditable(isOrderEditable=" + this.isOrderEditable + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/L$f$m;", "Lsn/L$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class m extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final m f160930a = new m();

            private m() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof m);
            }

            public String toString() {
                return "NavigateToArrivedScreen";
            }

            public int hashCode() {
                return 113541270;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/L$f$n;", "Lsn/L$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class n extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final n f160931a = new n();

            private n() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof n);
            }

            public String toString() {
                return "NavigateUserToSlotChange";
            }

            public int hashCode() {
                return 764130940;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/L$f$o;", "Lsn/L$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class o extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final o f160932a = new o();

            private o() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof o);
            }

            public String toString() {
                return "OrderSubstitutionBannerAction";
            }

            public int hashCode() {
                return -1523321706;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/L$f$p;", "Lsn/L$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class p extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final p f160933a = new p();

            private p() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof p);
            }

            public String toString() {
                return "RateShopper";
            }

            public int hashCode() {
                return 1123127472;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/L$f$q;", "Lsn/L$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class q extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final q f160934a = new q();

            private q() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof q);
            }

            public String toString() {
                return "ReplaceCart";
            }

            public int hashCode() {
                return 1973108541;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/L$f$r;", "Lsn/L$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class r extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final r f160935a = new r();

            private r() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof r);
            }

            public String toString() {
                return "ShowCreditCardTransactionHistory";
            }

            public int hashCode() {
                return -766308525;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/L$f$s;", "Lsn/L$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class s extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final s f160936a = new s();

            private s() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof s);
            }

            public String toString() {
                return "ShowEBTPaperTrailBottomSheet";
            }

            public int hashCode() {
                return 1744589431;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/L$f$t;", "Lsn/L$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class t extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final t f160937a = new t();

            private t() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof t);
            }

            public String toString() {
                return "ShowExtendedRangeInfoDetail";
            }

            public int hashCode() {
                return -785481009;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/L$f$u;", "Lsn/L$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class u extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final u f160938a = new u();

            private u() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof u);
            }

            public String toString() {
                return "ShowPreAuthorizationBottomSheet";
            }

            public int hashCode() {
                return -38079222;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0013"}, d2 = {"Lsn/L$f$v;", "Lsn/L$f;", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.L$f$v, reason: from toString */
        public static final /* data */ class ShowStoreInfo extends f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int storeId;

            public ShowStoreInfo(int i10) {
                super(null);
                this.storeId = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowStoreInfo) && this.storeId == ((ShowStoreInfo) other).storeId;
            }

            /* renamed from: a, reason: from getter */
            public final int getStoreId() {
                return this.storeId;
            }

            public int hashCode() {
                return Integer.hashCode(this.storeId);
            }

            public String toString() {
                return "ShowStoreInfo(storeId=" + this.storeId + ')';
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lsn/L$f$w;", "Lsn/L$f;", "", "progress", "", "duration", "color", "<init>", "(Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Float;", "c", "()Ljava/lang/Float;", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.L$f$w, reason: from toString */
        public static final /* data */ class UpdateProgressIndicator extends f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Float progress;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Integer duration;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Integer color;

            public /* synthetic */ UpdateProgressIndicator(Float f10, Integer num, Integer num2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(f10, (i10 & 2) != 0 ? null : num, num2);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateProgressIndicator)) {
                    return false;
                }
                UpdateProgressIndicator updateProgressIndicator = (UpdateProgressIndicator) other;
                return Intrinsics.e(this.progress, updateProgressIndicator.progress) && Intrinsics.e(this.duration, updateProgressIndicator.duration) && Intrinsics.e(this.color, updateProgressIndicator.color);
            }

            public UpdateProgressIndicator(Float f10, Integer num, Integer num2) {
                super(null);
                this.progress = f10;
                this.duration = num;
                this.color = num2;
            }

            /* renamed from: a, reason: from getter */
            public final Integer getColor() {
                return this.color;
            }

            /* renamed from: b, reason: from getter */
            public final Integer getDuration() {
                return this.duration;
            }

            /* renamed from: c, reason: from getter */
            public final Float getProgress() {
                return this.progress;
            }

            public int hashCode() {
                Float f10 = this.progress;
                int iHashCode = (f10 == null ? 0 : f10.hashCode()) * 31;
                Integer num = this.duration;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.color;
                return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
            }

            public String toString() {
                return "UpdateProgressIndicator(progress=" + this.progress + ", duration=" + this.duration + ", color=" + this.color + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/L$f$x;", "Lsn/L$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class x extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final x f160943a = new x();

            private x() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof x);
            }

            public String toString() {
                return "ViewMperksDashBoard";
            }

            public int hashCode() {
                return 55592768;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/L$f$y;", "Lsn/L$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class y extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final y f160944a = new y();

            private y() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof y);
            }

            public String toString() {
                return "ViewOrder";
            }

            public int hashCode() {
                return -1818652366;
            }
        }

        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private f() {
        }
    }

    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0019\n\u000b\f\r\u0006\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !B\u0015\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0019\"#$%&'()*+,-./0123456789:¨\u0006;"}, d2 = {"Lsn/L$g;", "", "LQj/b;", "dialogEvent", "<init>", "(LQj/b;)V", "a", "LQj/b;", "getDialogEvent", "()LQj/b;", "f", "g", "j", "p", "y", "s", "e", "o", "t", "l", "h", "k", "b", "c", "m", "q", "n", "r", "d", "v", "x", "w", "u", "i", "Lsn/L$g$a;", "Lsn/L$g$b;", "Lsn/L$g$c;", "Lsn/L$g$d;", "Lsn/L$g$e;", "Lsn/L$g$f;", "Lsn/L$g$g;", "Lsn/L$g$h;", "Lsn/L$g$i;", "Lsn/L$g$j;", "Lsn/L$g$k;", "Lsn/L$g$l;", "Lsn/L$g$m;", "Lsn/L$g$n;", "Lsn/L$g$o;", "Lsn/L$g$p;", "Lsn/L$g$q;", "Lsn/L$g$r;", "Lsn/L$g$s;", "Lsn/L$g$t;", "Lsn/L$g$u;", "Lsn/L$g$v;", "Lsn/L$g$w;", "Lsn/L$g$x;", "Lsn/L$g$y;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class g {

        /* renamed from: b, reason: collision with root package name */
        public static final int f160945b = DialogEvent.f30991f;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final DialogEvent dialogEvent;

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lsn/L$g$a;", "Lsn/L$g;", "", "progressColor", "progress", "", "duration", "Landroid/view/animation/AnticipateOvershootInterpolator;", "interpolator", "<init>", "(Ljava/lang/Integer;IJLandroid/view/animation/AnticipateOvershootInterpolator;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "d", "I", "b", "e", "J", "a", "()J", "f", "Landroid/view/animation/AnticipateOvershootInterpolator;", "getInterpolator", "()Landroid/view/animation/AnticipateOvershootInterpolator;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.L$g$a, reason: from toString */
        public static final /* data */ class AnimateProgressBarEvent extends g {

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Integer progressColor;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final int progress;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final long duration;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final AnticipateOvershootInterpolator interpolator;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AnimateProgressBarEvent)) {
                    return false;
                }
                AnimateProgressBarEvent animateProgressBarEvent = (AnimateProgressBarEvent) other;
                return Intrinsics.e(this.progressColor, animateProgressBarEvent.progressColor) && this.progress == animateProgressBarEvent.progress && this.duration == animateProgressBarEvent.duration && Intrinsics.e(this.interpolator, animateProgressBarEvent.interpolator);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnimateProgressBarEvent(Integer num, int i10, long j10, AnticipateOvershootInterpolator interpolator) {
                super(null, 1, 0 == true ? 1 : 0);
                Intrinsics.j(interpolator, "interpolator");
                this.progressColor = num;
                this.progress = i10;
                this.duration = j10;
                this.interpolator = interpolator;
            }

            /* renamed from: a, reason: from getter */
            public final long getDuration() {
                return this.duration;
            }

            /* renamed from: b, reason: from getter */
            public final int getProgress() {
                return this.progress;
            }

            /* renamed from: c, reason: from getter */
            public final Integer getProgressColor() {
                return this.progressColor;
            }

            public int hashCode() {
                Integer num = this.progressColor;
                return ((((((num == null ? 0 : num.hashCode()) * 31) + Integer.hashCode(this.progress)) * 31) + Long.hashCode(this.duration)) * 31) + this.interpolator.hashCode();
            }

            public String toString() {
                return "AnimateProgressBarEvent(progressColor=" + this.progressColor + ", progress=" + this.progress + ", duration=" + this.duration + ", interpolator=" + this.interpolator + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lsn/L$g$b;", "Lsn/L$g;", "LQj/b;", "dialogEvent", "<init>", "(LQj/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "LQj/b;", "a", "()LQj/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.L$g$b, reason: from toString */
        public static final /* data */ class CancelOrderSuccessDialogEvent extends g {

            /* renamed from: d, reason: collision with root package name */
            public static final int f160951d = DialogEvent.f30991f;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final DialogEvent dialogEvent;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CancelOrderSuccessDialogEvent) && Intrinsics.e(this.dialogEvent, ((CancelOrderSuccessDialogEvent) other).dialogEvent);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CancelOrderSuccessDialogEvent(DialogEvent dialogEvent) {
                super(dialogEvent, null);
                Intrinsics.j(dialogEvent, "dialogEvent");
                this.dialogEvent = dialogEvent;
            }

            /* renamed from: a, reason: from getter */
            public DialogEvent getDialogEvent() {
                return this.dialogEvent;
            }

            public int hashCode() {
                return this.dialogEvent.hashCode();
            }

            public String toString() {
                return "CancelOrderSuccessDialogEvent(dialogEvent=" + this.dialogEvent + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lsn/L$g$c;", "Lsn/L$g;", "LQj/b;", "dialogEvent", "<init>", "(LQj/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "LQj/b;", "a", "()LQj/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.L$g$c, reason: from toString */
        public static final /* data */ class CancelOrderWarningDialogEvent extends g {

            /* renamed from: d, reason: collision with root package name */
            public static final int f160953d = DialogEvent.f30991f;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final DialogEvent dialogEvent;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CancelOrderWarningDialogEvent) && Intrinsics.e(this.dialogEvent, ((CancelOrderWarningDialogEvent) other).dialogEvent);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CancelOrderWarningDialogEvent(DialogEvent dialogEvent) {
                super(dialogEvent, null);
                Intrinsics.j(dialogEvent, "dialogEvent");
                this.dialogEvent = dialogEvent;
            }

            /* renamed from: a, reason: from getter */
            public DialogEvent getDialogEvent() {
                return this.dialogEvent;
            }

            public int hashCode() {
                return this.dialogEvent.hashCode();
            }

            public String toString() {
                return "CancelOrderWarningDialogEvent(dialogEvent=" + this.dialogEvent + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lsn/L$g$d;", "Lsn/L$g;", "LQj/b;", "dialogEvent", "<init>", "(LQj/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "LQj/b;", "a", "()LQj/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.L$g$d, reason: from toString */
        public static final /* data */ class CustomerArrivedDialogEvent extends g {

            /* renamed from: d, reason: collision with root package name */
            public static final int f160955d = DialogEvent.f30991f;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final DialogEvent dialogEvent;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CustomerArrivedDialogEvent) && Intrinsics.e(this.dialogEvent, ((CustomerArrivedDialogEvent) other).dialogEvent);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CustomerArrivedDialogEvent(DialogEvent dialogEvent) {
                super(dialogEvent, null);
                Intrinsics.j(dialogEvent, "dialogEvent");
                this.dialogEvent = dialogEvent;
            }

            /* renamed from: a, reason: from getter */
            public DialogEvent getDialogEvent() {
                return this.dialogEvent;
            }

            public int hashCode() {
                return this.dialogEvent.hashCode();
            }

            public String toString() {
                return "CustomerArrivedDialogEvent(dialogEvent=" + this.dialogEvent + ')';
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, d2 = {"Lsn/L$g$e;", "Lsn/L$g;", "", PlaceTypes.ROUTE, "orderType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "b", "d", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.L$g$e, reason: from toString */
        public static final /* data */ class CustomerCheckInEvent extends g {

            /* renamed from: e, reason: collision with root package name */
            public static final int f160957e = DialogEvent.f30991f;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String route;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String orderType;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CustomerCheckInEvent)) {
                    return false;
                }
                CustomerCheckInEvent customerCheckInEvent = (CustomerCheckInEvent) other;
                return Intrinsics.e(this.route, customerCheckInEvent.route) && Intrinsics.e(this.orderType, customerCheckInEvent.orderType);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public CustomerCheckInEvent(String route, String orderType) {
                super(null, 1, 0 == true ? 1 : 0);
                Intrinsics.j(route, "route");
                Intrinsics.j(orderType, "orderType");
                this.route = route;
                this.orderType = orderType;
            }

            /* renamed from: a, reason: from getter */
            public final String getOrderType() {
                return this.orderType;
            }

            /* renamed from: b, reason: from getter */
            public final String getRoute() {
                return this.route;
            }

            public int hashCode() {
                return (this.route.hashCode() * 31) + this.orderType.hashCode();
            }

            public String toString() {
                return "CustomerCheckInEvent(route=" + this.route + ", orderType=" + this.orderType + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/L$g$f;", "Lsn/L$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class f extends g {

            /* renamed from: c, reason: collision with root package name */
            public static final f f160960c = new f();

            /* renamed from: d, reason: collision with root package name */
            public static final int f160961d = DialogEvent.f30991f;

            /* JADX WARN: Multi-variable type inference failed */
            private f() {
                super(null, 1, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof f);
            }

            public String toString() {
                return "EditOrderEvent";
            }

            public int hashCode() {
                return 1634905791;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/L$g$g;", "Lsn/L$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.L$g$g, reason: collision with other inner class name */
        public static final /* data */ class C2507g extends g {

            /* renamed from: c, reason: collision with root package name */
            public static final C2507g f160962c = new C2507g();

            /* renamed from: d, reason: collision with root package name */
            public static final int f160963d = DialogEvent.f30991f;

            /* JADX WARN: Multi-variable type inference failed */
            private C2507g() {
                super(null, 1, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2507g);
            }

            public String toString() {
                return "EditPhoneNumberEvent";
            }

            public int hashCode() {
                return -1031778538;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lsn/L$g$h;", "Lsn/L$g;", "LQj/b;", "dialogEvent", "<init>", "(LQj/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "LQj/b;", "a", "()LQj/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.L$g$h, reason: from toString */
        public static final /* data */ class FailureDialogEvent extends g {

            /* renamed from: d, reason: collision with root package name */
            public static final int f160964d = DialogEvent.f30991f;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final DialogEvent dialogEvent;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FailureDialogEvent) && Intrinsics.e(this.dialogEvent, ((FailureDialogEvent) other).dialogEvent);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FailureDialogEvent(DialogEvent dialogEvent) {
                super(dialogEvent, null);
                Intrinsics.j(dialogEvent, "dialogEvent");
                this.dialogEvent = dialogEvent;
            }

            /* renamed from: a, reason: from getter */
            public DialogEvent getDialogEvent() {
                return this.dialogEvent;
            }

            public int hashCode() {
                return this.dialogEvent.hashCode();
            }

            public String toString() {
                return "FailureDialogEvent(dialogEvent=" + this.dialogEvent + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/L$g$i;", "Lsn/L$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class i extends g {

            /* renamed from: c, reason: collision with root package name */
            public static final i f160966c = new i();

            /* renamed from: d, reason: collision with root package name */
            public static final int f160967d = DialogEvent.f30991f;

            /* JADX WARN: Multi-variable type inference failed */
            private i() {
                super(null, 1, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof i);
            }

            public String toString() {
                return "HideBottomSheet";
            }

            public int hashCode() {
                return -1183524023;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/L$g$j;", "Lsn/L$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class j extends g {

            /* renamed from: c, reason: collision with root package name */
            public static final j f160968c = new j();

            /* renamed from: d, reason: collision with root package name */
            public static final int f160969d = DialogEvent.f30991f;

            /* JADX WARN: Multi-variable type inference failed */
            private j() {
                super(null, 1, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof j);
            }

            public String toString() {
                return "LaunchOrdersActivity";
            }

            public int hashCode() {
                return 1796885008;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lsn/L$g$k;", "Lsn/L$g;", "LQj/b;", "dialogEvent", "<init>", "(LQj/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "LQj/b;", "a", "()LQj/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.L$g$k, reason: from toString */
        public static final /* data */ class MultiOrderUnderModificationDialogEvent extends g {

            /* renamed from: d, reason: collision with root package name */
            public static final int f160970d = DialogEvent.f30991f;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final DialogEvent dialogEvent;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MultiOrderUnderModificationDialogEvent) && Intrinsics.e(this.dialogEvent, ((MultiOrderUnderModificationDialogEvent) other).dialogEvent);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MultiOrderUnderModificationDialogEvent(DialogEvent dialogEvent) {
                super(dialogEvent, null);
                Intrinsics.j(dialogEvent, "dialogEvent");
                this.dialogEvent = dialogEvent;
            }

            /* renamed from: a, reason: from getter */
            public DialogEvent getDialogEvent() {
                return this.dialogEvent;
            }

            public int hashCode() {
                return this.dialogEvent.hashCode();
            }

            public String toString() {
                return "MultiOrderUnderModificationDialogEvent(dialogEvent=" + this.dialogEvent + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lsn/L$g$l;", "Lsn/L$g;", "LQj/b;", "dialogEvent", "<init>", "(LQj/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "LQj/b;", "a", "()LQj/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.L$g$l, reason: from toString */
        public static final /* data */ class NullOrderFailureDialogEvent extends g {

            /* renamed from: d, reason: collision with root package name */
            public static final int f160972d = DialogEvent.f30991f;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final DialogEvent dialogEvent;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NullOrderFailureDialogEvent) && Intrinsics.e(this.dialogEvent, ((NullOrderFailureDialogEvent) other).dialogEvent);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NullOrderFailureDialogEvent(DialogEvent dialogEvent) {
                super(dialogEvent, null);
                Intrinsics.j(dialogEvent, "dialogEvent");
                this.dialogEvent = dialogEvent;
            }

            /* renamed from: a, reason: from getter */
            public DialogEvent getDialogEvent() {
                return this.dialogEvent;
            }

            public int hashCode() {
                return this.dialogEvent.hashCode();
            }

            public String toString() {
                return "NullOrderFailureDialogEvent(dialogEvent=" + this.dialogEvent + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lsn/L$g$m;", "Lsn/L$g;", "LQj/b;", "dialogEvent", "<init>", "(LQj/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "LQj/b;", "a", "()LQj/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.L$g$m, reason: from toString */
        public static final /* data */ class OrderNotCancelableDialogEvent extends g {

            /* renamed from: d, reason: collision with root package name */
            public static final int f160974d = DialogEvent.f30991f;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final DialogEvent dialogEvent;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OrderNotCancelableDialogEvent) && Intrinsics.e(this.dialogEvent, ((OrderNotCancelableDialogEvent) other).dialogEvent);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OrderNotCancelableDialogEvent(DialogEvent dialogEvent) {
                super(dialogEvent, null);
                Intrinsics.j(dialogEvent, "dialogEvent");
                this.dialogEvent = dialogEvent;
            }

            /* renamed from: a, reason: from getter */
            public DialogEvent getDialogEvent() {
                return this.dialogEvent;
            }

            public int hashCode() {
                return this.dialogEvent.hashCode();
            }

            public String toString() {
                return "OrderNotCancelableDialogEvent(dialogEvent=" + this.dialogEvent + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lsn/L$g$n;", "Lsn/L$g;", "LQj/b;", "dialogEvent", "<init>", "(LQj/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "LQj/b;", "a", "()LQj/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.L$g$n, reason: from toString */
        public static final /* data */ class OrderNotEditableDialogEvent extends g {

            /* renamed from: d, reason: collision with root package name */
            public static final int f160976d = DialogEvent.f30991f;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final DialogEvent dialogEvent;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OrderNotEditableDialogEvent) && Intrinsics.e(this.dialogEvent, ((OrderNotEditableDialogEvent) other).dialogEvent);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OrderNotEditableDialogEvent(DialogEvent dialogEvent) {
                super(dialogEvent, null);
                Intrinsics.j(dialogEvent, "dialogEvent");
                this.dialogEvent = dialogEvent;
            }

            /* renamed from: a, reason: from getter */
            public DialogEvent getDialogEvent() {
                return this.dialogEvent;
            }

            public int hashCode() {
                return this.dialogEvent.hashCode();
            }

            public String toString() {
                return "OrderNotEditableDialogEvent(dialogEvent=" + this.dialogEvent + ')';
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b\u001d\u0010\u0011R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001a\u001a\u0004\b'\u0010\u001c¨\u0006("}, d2 = {"Lsn/L$g$o;", "Lsn/L$g;", "", "Lvo/a;", "listSubstitutedItems", "Lvo/b;", "substitutionScreenType", "", "isOnMyWayClicked", "", "orderType", "pickupPersonName", "Luo/a;", "listOutOfStockItems", "<init>", "(Ljava/util/List;Lvo/b;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/util/List;", "b", "()Ljava/util/List;", "d", "Lvo/b;", "e", "()Lvo/b;", "Z", "f", "()Z", "Ljava/lang/String;", "g", "h", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.L$g$o, reason: from toString */
        public static final /* data */ class OrderSubstitutionEvent extends g {

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<OrderSubstitutionItem> listSubstitutedItems;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final vo.b substitutionScreenType;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isOnMyWayClicked;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final String orderType;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final String pickupPersonName;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<OrderOutOfStockItem> listOutOfStockItems;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OrderSubstitutionEvent)) {
                    return false;
                }
                OrderSubstitutionEvent orderSubstitutionEvent = (OrderSubstitutionEvent) other;
                return Intrinsics.e(this.listSubstitutedItems, orderSubstitutionEvent.listSubstitutedItems) && this.substitutionScreenType == orderSubstitutionEvent.substitutionScreenType && this.isOnMyWayClicked == orderSubstitutionEvent.isOnMyWayClicked && Intrinsics.e(this.orderType, orderSubstitutionEvent.orderType) && Intrinsics.e(this.pickupPersonName, orderSubstitutionEvent.pickupPersonName) && Intrinsics.e(this.listOutOfStockItems, orderSubstitutionEvent.listOutOfStockItems);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OrderSubstitutionEvent(List<OrderSubstitutionItem> listSubstitutedItems, vo.b substitutionScreenType, boolean z10, String str, String pickupPersonName, List<OrderOutOfStockItem> listOutOfStockItems) {
                super(null, 1, 0 == true ? 1 : 0);
                Intrinsics.j(listSubstitutedItems, "listSubstitutedItems");
                Intrinsics.j(substitutionScreenType, "substitutionScreenType");
                Intrinsics.j(pickupPersonName, "pickupPersonName");
                Intrinsics.j(listOutOfStockItems, "listOutOfStockItems");
                this.listSubstitutedItems = listSubstitutedItems;
                this.substitutionScreenType = substitutionScreenType;
                this.isOnMyWayClicked = z10;
                this.orderType = str;
                this.pickupPersonName = pickupPersonName;
                this.listOutOfStockItems = listOutOfStockItems;
            }

            public final List<OrderOutOfStockItem> a() {
                return this.listOutOfStockItems;
            }

            public final List<OrderSubstitutionItem> b() {
                return this.listSubstitutedItems;
            }

            /* renamed from: c, reason: from getter */
            public final String getOrderType() {
                return this.orderType;
            }

            /* renamed from: d, reason: from getter */
            public final String getPickupPersonName() {
                return this.pickupPersonName;
            }

            /* renamed from: e, reason: from getter */
            public final vo.b getSubstitutionScreenType() {
                return this.substitutionScreenType;
            }

            /* renamed from: f, reason: from getter */
            public final boolean getIsOnMyWayClicked() {
                return this.isOnMyWayClicked;
            }

            public int hashCode() {
                int iHashCode = ((((this.listSubstitutedItems.hashCode() * 31) + this.substitutionScreenType.hashCode()) * 31) + Boolean.hashCode(this.isOnMyWayClicked)) * 31;
                String str = this.orderType;
                return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.pickupPersonName.hashCode()) * 31) + this.listOutOfStockItems.hashCode();
            }

            public String toString() {
                return "OrderSubstitutionEvent(listSubstitutedItems=" + this.listSubstitutedItems + ", substitutionScreenType=" + this.substitutionScreenType + ", isOnMyWayClicked=" + this.isOnMyWayClicked + ", orderType=" + this.orderType + ", pickupPersonName=" + this.pickupPersonName + ", listOutOfStockItems=" + this.listOutOfStockItems + ')';
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Lsn/L$g$p;", "Lsn/L$g;", "", "Lvo/a;", "orderSubstitutionList", "Luo/a;", "orderOutOfStockList", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/util/List;", "b", "()Ljava/util/List;", "d", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.L$g$p, reason: from toString */
        public static final /* data */ class OrderSummaryEvent extends g {

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<OrderSubstitutionItem> orderSubstitutionList;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<OrderOutOfStockItem> orderOutOfStockList;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OrderSummaryEvent)) {
                    return false;
                }
                OrderSummaryEvent orderSummaryEvent = (OrderSummaryEvent) other;
                return Intrinsics.e(this.orderSubstitutionList, orderSummaryEvent.orderSubstitutionList) && Intrinsics.e(this.orderOutOfStockList, orderSummaryEvent.orderOutOfStockList);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OrderSummaryEvent(List<OrderSubstitutionItem> orderSubstitutionList, List<OrderOutOfStockItem> orderOutOfStockList) {
                super(null, 1, 0 == true ? 1 : 0);
                Intrinsics.j(orderSubstitutionList, "orderSubstitutionList");
                Intrinsics.j(orderOutOfStockList, "orderOutOfStockList");
                this.orderSubstitutionList = orderSubstitutionList;
                this.orderOutOfStockList = orderOutOfStockList;
            }

            public final List<OrderOutOfStockItem> a() {
                return this.orderOutOfStockList;
            }

            public final List<OrderSubstitutionItem> b() {
                return this.orderSubstitutionList;
            }

            public int hashCode() {
                return (this.orderSubstitutionList.hashCode() * 31) + this.orderOutOfStockList.hashCode();
            }

            public String toString() {
                return "OrderSummaryEvent(orderSubstitutionList=" + this.orderSubstitutionList + ", orderOutOfStockList=" + this.orderOutOfStockList + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lsn/L$g$q;", "Lsn/L$g;", "LQj/b;", "dialogEvent", "<init>", "(LQj/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "LQj/b;", "a", "()LQj/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.L$g$q, reason: from toString */
        public static final /* data */ class OrderUnderModificationNotCancelableDialogEvent extends g {

            /* renamed from: d, reason: collision with root package name */
            public static final int f160986d = DialogEvent.f30991f;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final DialogEvent dialogEvent;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OrderUnderModificationNotCancelableDialogEvent) && Intrinsics.e(this.dialogEvent, ((OrderUnderModificationNotCancelableDialogEvent) other).dialogEvent);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OrderUnderModificationNotCancelableDialogEvent(DialogEvent dialogEvent) {
                super(dialogEvent, null);
                Intrinsics.j(dialogEvent, "dialogEvent");
                this.dialogEvent = dialogEvent;
            }

            /* renamed from: a, reason: from getter */
            public DialogEvent getDialogEvent() {
                return this.dialogEvent;
            }

            public int hashCode() {
                return this.dialogEvent.hashCode();
            }

            public String toString() {
                return "OrderUnderModificationNotCancelableDialogEvent(dialogEvent=" + this.dialogEvent + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lsn/L$g$r;", "Lsn/L$g;", "", "isOnMyWayClicked", "LQj/b;", "dialogEvent", "<init>", "(ZLQj/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "Z", "b", "()Z", "d", "LQj/b;", "a", "()LQj/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.L$g$r, reason: from toString */
        public static final /* data */ class PickupOutsideOfStoreHoursDialogEvent extends g {

            /* renamed from: e, reason: collision with root package name */
            public static final int f160988e = DialogEvent.f30991f;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isOnMyWayClicked;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final DialogEvent dialogEvent;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PickupOutsideOfStoreHoursDialogEvent)) {
                    return false;
                }
                PickupOutsideOfStoreHoursDialogEvent pickupOutsideOfStoreHoursDialogEvent = (PickupOutsideOfStoreHoursDialogEvent) other;
                return this.isOnMyWayClicked == pickupOutsideOfStoreHoursDialogEvent.isOnMyWayClicked && Intrinsics.e(this.dialogEvent, pickupOutsideOfStoreHoursDialogEvent.dialogEvent);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PickupOutsideOfStoreHoursDialogEvent(boolean z10, DialogEvent dialogEvent) {
                super(dialogEvent, null);
                Intrinsics.j(dialogEvent, "dialogEvent");
                this.isOnMyWayClicked = z10;
                this.dialogEvent = dialogEvent;
            }

            /* renamed from: a, reason: from getter */
            public DialogEvent getDialogEvent() {
                return this.dialogEvent;
            }

            /* renamed from: b, reason: from getter */
            public final boolean getIsOnMyWayClicked() {
                return this.isOnMyWayClicked;
            }

            public int hashCode() {
                return (Boolean.hashCode(this.isOnMyWayClicked) * 31) + this.dialogEvent.hashCode();
            }

            public String toString() {
                return "PickupOutsideOfStoreHoursDialogEvent(isOnMyWayClicked=" + this.isOnMyWayClicked + ", dialogEvent=" + this.dialogEvent + ')';
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lsn/L$g$s;", "Lsn/L$g;", "Ltp/b;", "rateAndTip", "Ltp/a;", "flowType", "<init>", "(Ltp/b;Ltp/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ltp/b;", "b", "()Ltp/b;", "d", "Ltp/a;", "a", "()Ltp/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.L$g$s, reason: from toString */
        public static final /* data */ class RateShopperEvent extends g {

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Builder rateAndTip;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final EnumC17276a flowType;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RateShopperEvent)) {
                    return false;
                }
                RateShopperEvent rateShopperEvent = (RateShopperEvent) other;
                return Intrinsics.e(this.rateAndTip, rateShopperEvent.rateAndTip) && this.flowType == rateShopperEvent.flowType;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public RateShopperEvent(Builder rateAndTip, EnumC17276a flowType) {
                super(null, 1, 0 == true ? 1 : 0);
                Intrinsics.j(rateAndTip, "rateAndTip");
                Intrinsics.j(flowType, "flowType");
                this.rateAndTip = rateAndTip;
                this.flowType = flowType;
            }

            /* renamed from: a, reason: from getter */
            public final EnumC17276a getFlowType() {
                return this.flowType;
            }

            /* renamed from: b, reason: from getter */
            public final Builder getRateAndTip() {
                return this.rateAndTip;
            }

            public int hashCode() {
                return (this.rateAndTip.hashCode() * 31) + this.flowType.hashCode();
            }

            public String toString() {
                return "RateShopperEvent(rateAndTip=" + this.rateAndTip + ", flowType=" + this.flowType + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lsn/L$g$t;", "Lsn/L$g;", "LQj/b;", "dialogEvent", "<init>", "(LQj/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "LQj/b;", "a", "()LQj/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.L$g$t, reason: from toString */
        public static final /* data */ class ReplaceCurrentCartWarningDialogEvent extends g {

            /* renamed from: d, reason: collision with root package name */
            public static final int f160993d = DialogEvent.f30991f;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final DialogEvent dialogEvent;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ReplaceCurrentCartWarningDialogEvent) && Intrinsics.e(this.dialogEvent, ((ReplaceCurrentCartWarningDialogEvent) other).dialogEvent);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReplaceCurrentCartWarningDialogEvent(DialogEvent dialogEvent) {
                super(dialogEvent, null);
                Intrinsics.j(dialogEvent, "dialogEvent");
                this.dialogEvent = dialogEvent;
            }

            /* renamed from: a, reason: from getter */
            public DialogEvent getDialogEvent() {
                return this.dialogEvent;
            }

            public int hashCode() {
                return this.dialogEvent.hashCode();
            }

            public String toString() {
                return "ReplaceCurrentCartWarningDialogEvent(dialogEvent=" + this.dialogEvent + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/L$g$u;", "Lsn/L$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class u extends g {

            /* renamed from: c, reason: collision with root package name */
            public static final u f160995c = new u();

            /* renamed from: d, reason: collision with root package name */
            public static final int f160996d = DialogEvent.f30991f;

            /* JADX WARN: Multi-variable type inference failed */
            private u() {
                super(null, 1, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof u);
            }

            public String toString() {
                return "ShowCreditCardTransactionSheet";
            }

            public int hashCode() {
                return -1462854416;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/L$g$v;", "Lsn/L$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class v extends g {

            /* renamed from: c, reason: collision with root package name */
            public static final v f160997c = new v();

            /* renamed from: d, reason: collision with root package name */
            public static final int f160998d = DialogEvent.f30991f;

            /* JADX WARN: Multi-variable type inference failed */
            private v() {
                super(null, 1, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof v);
            }

            public String toString() {
                return "ShowEBTPaperTrailBottomSheet";
            }

            public int hashCode() {
                return 325443593;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/L$g$w;", "Lsn/L$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class w extends g {

            /* renamed from: c, reason: collision with root package name */
            public static final w f160999c = new w();

            /* renamed from: d, reason: collision with root package name */
            public static final int f161000d = DialogEvent.f30991f;

            /* JADX WARN: Multi-variable type inference failed */
            private w() {
                super(null, 1, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof w);
            }

            public String toString() {
                return "ShowExtendedRangeInfoDetail";
            }

            public int hashCode() {
                return -831259907;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsn/L$g$x;", "Lsn/L$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class x extends g {

            /* renamed from: c, reason: collision with root package name */
            public static final x f161001c = new x();

            /* renamed from: d, reason: collision with root package name */
            public static final int f161002d = DialogEvent.f30991f;

            /* JADX WARN: Multi-variable type inference failed */
            private x() {
                super(null, 1, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof x);
            }

            public String toString() {
                return "ShowPreAuthorizationBottomSheet";
            }

            public int hashCode() {
                return 1846322744;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, d2 = {"Lsn/L$g$y;", "Lsn/L$g;", "", "progressColor", "progress", "<init>", "(Ljava/lang/Integer;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "d", "I", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sn.L$g$y, reason: from toString */
        public static final /* data */ class UpdateProgressBarWithOutAnimation extends g {

            /* renamed from: e, reason: collision with root package name */
            public static final int f161003e = DialogEvent.f30991f;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Integer progressColor;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final int progress;

            /* JADX WARN: Multi-variable type inference failed */
            public UpdateProgressBarWithOutAnimation(Integer num, int i10) {
                super(null, 1, 0 == true ? 1 : 0);
                this.progressColor = num;
                this.progress = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateProgressBarWithOutAnimation)) {
                    return false;
                }
                UpdateProgressBarWithOutAnimation updateProgressBarWithOutAnimation = (UpdateProgressBarWithOutAnimation) other;
                return Intrinsics.e(this.progressColor, updateProgressBarWithOutAnimation.progressColor) && this.progress == updateProgressBarWithOutAnimation.progress;
            }

            /* renamed from: a, reason: from getter */
            public final int getProgress() {
                return this.progress;
            }

            /* renamed from: b, reason: from getter */
            public final Integer getProgressColor() {
                return this.progressColor;
            }

            public int hashCode() {
                Integer num = this.progressColor;
                return ((num == null ? 0 : num.hashCode()) * 31) + Integer.hashCode(this.progress);
            }

            public String toString() {
                return "UpdateProgressBarWithOutAnimation(progressColor=" + this.progressColor + ", progress=" + this.progress + ')';
            }
        }

        public /* synthetic */ g(DialogEvent dialogEvent, DefaultConstructorMarker defaultConstructorMarker) {
            this(dialogEvent);
        }

        private g(DialogEvent dialogEvent) {
            this.dialogEvent = dialogEvent;
        }

        public /* synthetic */ g(DialogEvent dialogEvent, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : dialogEvent, null);
        }
    }

    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\bB\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\f\b\u0002\u0010\u0007\u001a\u00060\u0004j\u0002`\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\b\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010#\u001a\u00020\u0002\u0012\b\b\u0002\u0010$\u001a\u00020\u0002\u0012\b\b\u0002\u0010%\u001a\u00020\u0002\u0012\b\b\u0002\u0010&\u001a\u00020\u0002\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0003\u0010+\u001a\u0004\u0018\u00010)¢\u0006\u0004\b,\u0010-J¾\u0002\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\b\u0002\u0010\u0007\u001a\u00060\u0004j\u0002`\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\b\b\u0002\u0010\u0019\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00022\b\b\u0002\u0010&\u001a\u00020\u00022\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0003\u0010+\u001a\u0004\u0018\u00010)HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020)HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020\u00022\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u00101R\u001b\u0010\u0007\u001a\u00060\u0004j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b=\u0010;\u001a\u0004\b>\u00101R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\bA\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bC\u0010TR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\b8\u0006¢\u0006\f\n\u0004\bU\u0010@\u001a\u0004\bR\u0010BR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\b8\u0006¢\u0006\f\n\u0004\bP\u0010@\u001a\u0004\bK\u0010BR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\bV\u00101R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b<\u0010W\u001a\u0004\bU\u0010XR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\bV\u0010Y\u001a\u0004\bZ\u0010[R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\bG\u0010^R\u0019\u0010 \u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b_\u0010H\u001a\u0004\b?\u0010JR\u0019\u0010!\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b8\u0010H\u001a\u0004\b=\u0010JR\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b`\u0010D\u001a\u0004\ba\u0010FR\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bb\u00107\u001a\u0004\b#\u00109R\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bc\u00107\u001a\u0004\bd\u00109R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bd\u00107\u001a\u0004\bc\u00109R\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bZ\u00107\u001a\u0004\bb\u00109R\u0019\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\ba\u0010e\u001a\u0004\b`\u0010fR\u0019\u0010*\u001a\u0004\u0018\u00010)8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\b_\u0010iR\u0019\u0010+\u001a\u0004\u0018\u00010)8\u0006¢\u0006\f\n\u0004\bj\u0010h\u001a\u0004\b\\\u0010i¨\u0006k"}, d2 = {"Lsn/L$h;", "", "", "progressIsVisible", "", "orderType", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "", "Les/b;", "decoratorList", "orderCancelable", "Lbk/a;", "orderCancellationReason", "j$/time/ZonedDateTime", "statusUpdateTimestamp", "LHk/a;", "Lsn/L$g;", "orderDetailUIEvent", "Lik/a;", "cartDecorator", "Lhn/d;", "ebtTransactionList", "Lhn/c;", "creditCardTransactionList", "pickupPersonName", "LRn/K;", "flyBuyState", "Lcom/meijer/mobile/storeinfo/api/model/StoreInfo;", "storeInfo", "Lpk/h;", "checkInStoreDetails", "bottomSheetHeader", "bottomSheetButtonLabel", "isOrderEditable", "isBottomSheetVisible", "showPreAuthMessage", "showEBTBottomSheet", "showCreditCardBottomSheet", "", "progressValue", "", "progressDuration", "progressColor", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Lbk/a;Lj$/time/ZonedDateTime;LHk/a;Lik/a;Ljava/util/List;Ljava/util/List;Ljava/lang/String;LRn/K;Lcom/meijer/mobile/storeinfo/api/model/StoreInfo;Lpk/h;Lbk/a;Lbk/a;Ljava/lang/Boolean;ZZZZLjava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "(ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Lbk/a;Lj$/time/ZonedDateTime;LHk/a;Lik/a;Ljava/util/List;Ljava/util/List;Ljava/lang/String;LRn/K;Lcom/meijer/mobile/storeinfo/api/model/StoreInfo;Lpk/h;Lbk/a;Lbk/a;Ljava/lang/Boolean;ZZZZLjava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;)Lsn/L$h;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "q", "()Z", "b", "Ljava/lang/String;", "m", "c", "l", "d", "Ljava/util/List;", "h", "()Ljava/util/List;", "e", "Ljava/lang/Boolean;", "getOrderCancelable", "()Ljava/lang/Boolean;", "f", "Lbk/a;", "getOrderCancellationReason", "()Lbk/a;", "g", "Lj$/time/ZonedDateTime;", "getStatusUpdateTimestamp", "()Lj$/time/ZonedDateTime;", "LHk/a;", "k", "()LHk/a;", "i", "Lik/a;", "()Lik/a;", "j", "n", "LRn/K;", "()LRn/K;", "Lcom/meijer/mobile/storeinfo/api/model/StoreInfo;", "v", "()Lcom/meijer/mobile/storeinfo/api/model/StoreInfo;", "o", "Lpk/h;", "()Lpk/h;", "p", "r", "w", "s", "t", "u", "Ljava/lang/Float;", "()Ljava/lang/Float;", "x", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "y", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sn.L$h, reason: from toString */
    public static final /* data */ class OrderDetailsViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean progressIsVisible;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String orderType;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String orderId;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<AbstractC13866b> decoratorList;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean orderCancelable;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a orderCancellationReason;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final ZonedDateTime statusUpdateTimestamp;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final UIEvent<g> orderDetailUIEvent;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final CartPreviewDecorator cartDecorator;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<EbtTransactionItemDecorator> ebtTransactionList;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<C14544c> creditCardTransactionList;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final String pickupPersonName;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final FlyBuyState flyBuyState;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final StoreInfo storeInfo;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final StoreDetails checkInStoreDetails;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a bottomSheetHeader;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a bottomSheetButtonLabel;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isOrderEditable;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isBottomSheetVisible;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showPreAuthMessage;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showEBTBottomSheet;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showCreditCardBottomSheet;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final Float progressValue;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer progressDuration;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer progressColor;

        public OrderDetailsViewState() {
            this(false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, 33554431, null);
        }

        public static /* synthetic */ OrderDetailsViewState b(OrderDetailsViewState orderDetailsViewState, boolean z10, String str, String str2, List list, Boolean bool, AbstractC6392a abstractC6392a, ZonedDateTime zonedDateTime, UIEvent uIEvent, CartPreviewDecorator cartPreviewDecorator, List list2, List list3, String str3, FlyBuyState flyBuyState, StoreInfo storeInfo, StoreDetails storeDetails, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, Boolean bool2, boolean z11, boolean z12, boolean z13, boolean z14, Float f10, Integer num, Integer num2, int i10, Object obj) {
            Integer num3;
            Integer num4;
            boolean z15 = (i10 & 1) != 0 ? orderDetailsViewState.progressIsVisible : z10;
            String str4 = (i10 & 2) != 0 ? orderDetailsViewState.orderType : str;
            String str5 = (i10 & 4) != 0 ? orderDetailsViewState.orderId : str2;
            List list4 = (i10 & 8) != 0 ? orderDetailsViewState.decoratorList : list;
            Boolean bool3 = (i10 & 16) != 0 ? orderDetailsViewState.orderCancelable : bool;
            AbstractC6392a abstractC6392a4 = (i10 & 32) != 0 ? orderDetailsViewState.orderCancellationReason : abstractC6392a;
            ZonedDateTime zonedDateTime2 = (i10 & 64) != 0 ? orderDetailsViewState.statusUpdateTimestamp : zonedDateTime;
            UIEvent uIEvent2 = (i10 & 128) != 0 ? orderDetailsViewState.orderDetailUIEvent : uIEvent;
            CartPreviewDecorator cartPreviewDecorator2 = (i10 & 256) != 0 ? orderDetailsViewState.cartDecorator : cartPreviewDecorator;
            List list5 = (i10 & 512) != 0 ? orderDetailsViewState.ebtTransactionList : list2;
            List list6 = (i10 & 1024) != 0 ? orderDetailsViewState.creditCardTransactionList : list3;
            String str6 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? orderDetailsViewState.pickupPersonName : str3;
            FlyBuyState flyBuyState2 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? orderDetailsViewState.flyBuyState : flyBuyState;
            StoreInfo storeInfo2 = (i10 & 8192) != 0 ? orderDetailsViewState.storeInfo : storeInfo;
            boolean z16 = z15;
            StoreDetails storeDetails2 = (i10 & 16384) != 0 ? orderDetailsViewState.checkInStoreDetails : storeDetails;
            AbstractC6392a abstractC6392a5 = (i10 & 32768) != 0 ? orderDetailsViewState.bottomSheetHeader : abstractC6392a2;
            AbstractC6392a abstractC6392a6 = (i10 & 65536) != 0 ? orderDetailsViewState.bottomSheetButtonLabel : abstractC6392a3;
            Boolean bool4 = (i10 & 131072) != 0 ? orderDetailsViewState.isOrderEditable : bool2;
            boolean z17 = (i10 & 262144) != 0 ? orderDetailsViewState.isBottomSheetVisible : z11;
            boolean z18 = (i10 & 524288) != 0 ? orderDetailsViewState.showPreAuthMessage : z12;
            boolean z19 = (i10 & 1048576) != 0 ? orderDetailsViewState.showEBTBottomSheet : z13;
            boolean z20 = (i10 & 2097152) != 0 ? orderDetailsViewState.showCreditCardBottomSheet : z14;
            Float f11 = (i10 & 4194304) != 0 ? orderDetailsViewState.progressValue : f10;
            Integer num5 = (i10 & 8388608) != 0 ? orderDetailsViewState.progressDuration : num;
            if ((i10 & 16777216) != 0) {
                num4 = num5;
                num3 = orderDetailsViewState.progressColor;
            } else {
                num3 = num2;
                num4 = num5;
            }
            return orderDetailsViewState.a(z16, str4, str5, list4, bool3, abstractC6392a4, zonedDateTime2, uIEvent2, cartPreviewDecorator2, list5, list6, str6, flyBuyState2, storeInfo2, storeDetails2, abstractC6392a5, abstractC6392a6, bool4, z17, z18, z19, z20, f11, num4, num3);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderDetailsViewState)) {
                return false;
            }
            OrderDetailsViewState orderDetailsViewState = (OrderDetailsViewState) other;
            return this.progressIsVisible == orderDetailsViewState.progressIsVisible && Intrinsics.e(this.orderType, orderDetailsViewState.orderType) && Intrinsics.e(this.orderId, orderDetailsViewState.orderId) && Intrinsics.e(this.decoratorList, orderDetailsViewState.decoratorList) && Intrinsics.e(this.orderCancelable, orderDetailsViewState.orderCancelable) && Intrinsics.e(this.orderCancellationReason, orderDetailsViewState.orderCancellationReason) && Intrinsics.e(this.statusUpdateTimestamp, orderDetailsViewState.statusUpdateTimestamp) && Intrinsics.e(this.orderDetailUIEvent, orderDetailsViewState.orderDetailUIEvent) && Intrinsics.e(this.cartDecorator, orderDetailsViewState.cartDecorator) && Intrinsics.e(this.ebtTransactionList, orderDetailsViewState.ebtTransactionList) && Intrinsics.e(this.creditCardTransactionList, orderDetailsViewState.creditCardTransactionList) && Intrinsics.e(this.pickupPersonName, orderDetailsViewState.pickupPersonName) && Intrinsics.e(this.flyBuyState, orderDetailsViewState.flyBuyState) && Intrinsics.e(this.storeInfo, orderDetailsViewState.storeInfo) && Intrinsics.e(this.checkInStoreDetails, orderDetailsViewState.checkInStoreDetails) && Intrinsics.e(this.bottomSheetHeader, orderDetailsViewState.bottomSheetHeader) && Intrinsics.e(this.bottomSheetButtonLabel, orderDetailsViewState.bottomSheetButtonLabel) && Intrinsics.e(this.isOrderEditable, orderDetailsViewState.isOrderEditable) && this.isBottomSheetVisible == orderDetailsViewState.isBottomSheetVisible && this.showPreAuthMessage == orderDetailsViewState.showPreAuthMessage && this.showEBTBottomSheet == orderDetailsViewState.showEBTBottomSheet && this.showCreditCardBottomSheet == orderDetailsViewState.showCreditCardBottomSheet && Intrinsics.e(this.progressValue, orderDetailsViewState.progressValue) && Intrinsics.e(this.progressDuration, orderDetailsViewState.progressDuration) && Intrinsics.e(this.progressColor, orderDetailsViewState.progressColor);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OrderDetailsViewState(boolean z10, String orderType, String orderId, List<? extends AbstractC13866b> decoratorList, Boolean bool, AbstractC6392a abstractC6392a, ZonedDateTime zonedDateTime, UIEvent<g> orderDetailUIEvent, CartPreviewDecorator cartDecorator, List<EbtTransactionItemDecorator> ebtTransactionList, List<C14544c> creditCardTransactionList, String pickupPersonName, FlyBuyState flyBuyState, StoreInfo storeInfo, StoreDetails storeDetails, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, Boolean bool2, boolean z11, boolean z12, boolean z13, boolean z14, Float f10, Integer num, Integer num2) {
            Intrinsics.j(orderType, "orderType");
            Intrinsics.j(orderId, "orderId");
            Intrinsics.j(decoratorList, "decoratorList");
            Intrinsics.j(orderDetailUIEvent, "orderDetailUIEvent");
            Intrinsics.j(cartDecorator, "cartDecorator");
            Intrinsics.j(ebtTransactionList, "ebtTransactionList");
            Intrinsics.j(creditCardTransactionList, "creditCardTransactionList");
            Intrinsics.j(pickupPersonName, "pickupPersonName");
            this.progressIsVisible = z10;
            this.orderType = orderType;
            this.orderId = orderId;
            this.decoratorList = decoratorList;
            this.orderCancelable = bool;
            this.orderCancellationReason = abstractC6392a;
            this.statusUpdateTimestamp = zonedDateTime;
            this.orderDetailUIEvent = orderDetailUIEvent;
            this.cartDecorator = cartDecorator;
            this.ebtTransactionList = ebtTransactionList;
            this.creditCardTransactionList = creditCardTransactionList;
            this.pickupPersonName = pickupPersonName;
            this.flyBuyState = flyBuyState;
            this.storeInfo = storeInfo;
            this.checkInStoreDetails = storeDetails;
            this.bottomSheetHeader = abstractC6392a2;
            this.bottomSheetButtonLabel = abstractC6392a3;
            this.isOrderEditable = bool2;
            this.isBottomSheetVisible = z11;
            this.showPreAuthMessage = z12;
            this.showEBTBottomSheet = z13;
            this.showCreditCardBottomSheet = z14;
            this.progressValue = f10;
            this.progressDuration = num;
            this.progressColor = num2;
        }

        public final OrderDetailsViewState a(boolean progressIsVisible, String orderType, String orderId, List<? extends AbstractC13866b> decoratorList, Boolean orderCancelable, AbstractC6392a orderCancellationReason, ZonedDateTime statusUpdateTimestamp, UIEvent<g> orderDetailUIEvent, CartPreviewDecorator cartDecorator, List<EbtTransactionItemDecorator> ebtTransactionList, List<C14544c> creditCardTransactionList, String pickupPersonName, FlyBuyState flyBuyState, StoreInfo storeInfo, StoreDetails checkInStoreDetails, AbstractC6392a bottomSheetHeader, AbstractC6392a bottomSheetButtonLabel, Boolean isOrderEditable, boolean isBottomSheetVisible, boolean showPreAuthMessage, boolean showEBTBottomSheet, boolean showCreditCardBottomSheet, Float progressValue, Integer progressDuration, Integer progressColor) {
            Intrinsics.j(orderType, "orderType");
            Intrinsics.j(orderId, "orderId");
            Intrinsics.j(decoratorList, "decoratorList");
            Intrinsics.j(orderDetailUIEvent, "orderDetailUIEvent");
            Intrinsics.j(cartDecorator, "cartDecorator");
            Intrinsics.j(ebtTransactionList, "ebtTransactionList");
            Intrinsics.j(creditCardTransactionList, "creditCardTransactionList");
            Intrinsics.j(pickupPersonName, "pickupPersonName");
            return new OrderDetailsViewState(progressIsVisible, orderType, orderId, decoratorList, orderCancelable, orderCancellationReason, statusUpdateTimestamp, orderDetailUIEvent, cartDecorator, ebtTransactionList, creditCardTransactionList, pickupPersonName, flyBuyState, storeInfo, checkInStoreDetails, bottomSheetHeader, bottomSheetButtonLabel, isOrderEditable, isBottomSheetVisible, showPreAuthMessage, showEBTBottomSheet, showCreditCardBottomSheet, progressValue, progressDuration, progressColor);
        }

        /* renamed from: c, reason: from getter */
        public final AbstractC6392a getBottomSheetButtonLabel() {
            return this.bottomSheetButtonLabel;
        }

        /* renamed from: d, reason: from getter */
        public final AbstractC6392a getBottomSheetHeader() {
            return this.bottomSheetHeader;
        }

        /* renamed from: e, reason: from getter */
        public final CartPreviewDecorator getCartDecorator() {
            return this.cartDecorator;
        }

        /* renamed from: f, reason: from getter */
        public final StoreDetails getCheckInStoreDetails() {
            return this.checkInStoreDetails;
        }

        public final List<C14544c> g() {
            return this.creditCardTransactionList;
        }

        public final List<AbstractC13866b> h() {
            return this.decoratorList;
        }

        public int hashCode() {
            int iHashCode = ((((((Boolean.hashCode(this.progressIsVisible) * 31) + this.orderType.hashCode()) * 31) + this.orderId.hashCode()) * 31) + this.decoratorList.hashCode()) * 31;
            Boolean bool = this.orderCancelable;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            AbstractC6392a abstractC6392a = this.orderCancellationReason;
            int iHashCode3 = (iHashCode2 + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31;
            ZonedDateTime zonedDateTime = this.statusUpdateTimestamp;
            int iHashCode4 = (((((((((((iHashCode3 + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31) + this.orderDetailUIEvent.hashCode()) * 31) + this.cartDecorator.hashCode()) * 31) + this.ebtTransactionList.hashCode()) * 31) + this.creditCardTransactionList.hashCode()) * 31) + this.pickupPersonName.hashCode()) * 31;
            FlyBuyState flyBuyState = this.flyBuyState;
            int iHashCode5 = (iHashCode4 + (flyBuyState == null ? 0 : flyBuyState.hashCode())) * 31;
            StoreInfo storeInfo = this.storeInfo;
            int iHashCode6 = (iHashCode5 + (storeInfo == null ? 0 : storeInfo.hashCode())) * 31;
            StoreDetails storeDetails = this.checkInStoreDetails;
            int iHashCode7 = (iHashCode6 + (storeDetails == null ? 0 : storeDetails.hashCode())) * 31;
            AbstractC6392a abstractC6392a2 = this.bottomSheetHeader;
            int iHashCode8 = (iHashCode7 + (abstractC6392a2 == null ? 0 : abstractC6392a2.hashCode())) * 31;
            AbstractC6392a abstractC6392a3 = this.bottomSheetButtonLabel;
            int iHashCode9 = (iHashCode8 + (abstractC6392a3 == null ? 0 : abstractC6392a3.hashCode())) * 31;
            Boolean bool2 = this.isOrderEditable;
            int iHashCode10 = (((((((((iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + Boolean.hashCode(this.isBottomSheetVisible)) * 31) + Boolean.hashCode(this.showPreAuthMessage)) * 31) + Boolean.hashCode(this.showEBTBottomSheet)) * 31) + Boolean.hashCode(this.showCreditCardBottomSheet)) * 31;
            Float f10 = this.progressValue;
            int iHashCode11 = (iHashCode10 + (f10 == null ? 0 : f10.hashCode())) * 31;
            Integer num = this.progressDuration;
            int iHashCode12 = (iHashCode11 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.progressColor;
            return iHashCode12 + (num2 != null ? num2.hashCode() : 0);
        }

        public final List<EbtTransactionItemDecorator> i() {
            return this.ebtTransactionList;
        }

        /* renamed from: j, reason: from getter */
        public final FlyBuyState getFlyBuyState() {
            return this.flyBuyState;
        }

        public final UIEvent<g> k() {
            return this.orderDetailUIEvent;
        }

        /* renamed from: l, reason: from getter */
        public final String getOrderId() {
            return this.orderId;
        }

        /* renamed from: m, reason: from getter */
        public final String getOrderType() {
            return this.orderType;
        }

        /* renamed from: n, reason: from getter */
        public final String getPickupPersonName() {
            return this.pickupPersonName;
        }

        /* renamed from: o, reason: from getter */
        public final Integer getProgressColor() {
            return this.progressColor;
        }

        /* renamed from: p, reason: from getter */
        public final Integer getProgressDuration() {
            return this.progressDuration;
        }

        /* renamed from: q, reason: from getter */
        public final boolean getProgressIsVisible() {
            return this.progressIsVisible;
        }

        /* renamed from: r, reason: from getter */
        public final Float getProgressValue() {
            return this.progressValue;
        }

        /* renamed from: s, reason: from getter */
        public final boolean getShowCreditCardBottomSheet() {
            return this.showCreditCardBottomSheet;
        }

        /* renamed from: t, reason: from getter */
        public final boolean getShowEBTBottomSheet() {
            return this.showEBTBottomSheet;
        }

        public String toString() {
            return "OrderDetailsViewState(progressIsVisible=" + this.progressIsVisible + ", orderType=" + this.orderType + ", orderId=" + this.orderId + ", decoratorList=" + this.decoratorList + ", orderCancelable=" + this.orderCancelable + ", orderCancellationReason=" + this.orderCancellationReason + ", statusUpdateTimestamp=" + this.statusUpdateTimestamp + ", orderDetailUIEvent=" + this.orderDetailUIEvent + ", cartDecorator=" + this.cartDecorator + ", ebtTransactionList=" + this.ebtTransactionList + ", creditCardTransactionList=" + this.creditCardTransactionList + ", pickupPersonName=" + this.pickupPersonName + ", flyBuyState=" + this.flyBuyState + ", storeInfo=" + this.storeInfo + ", checkInStoreDetails=" + this.checkInStoreDetails + ", bottomSheetHeader=" + this.bottomSheetHeader + ", bottomSheetButtonLabel=" + this.bottomSheetButtonLabel + ", isOrderEditable=" + this.isOrderEditable + ", isBottomSheetVisible=" + this.isBottomSheetVisible + ", showPreAuthMessage=" + this.showPreAuthMessage + ", showEBTBottomSheet=" + this.showEBTBottomSheet + ", showCreditCardBottomSheet=" + this.showCreditCardBottomSheet + ", progressValue=" + this.progressValue + ", progressDuration=" + this.progressDuration + ", progressColor=" + this.progressColor + ')';
        }

        /* renamed from: u, reason: from getter */
        public final boolean getShowPreAuthMessage() {
            return this.showPreAuthMessage;
        }

        /* renamed from: v, reason: from getter */
        public final StoreInfo getStoreInfo() {
            return this.storeInfo;
        }

        /* renamed from: w, reason: from getter */
        public final Boolean getIsOrderEditable() {
            return this.isOrderEditable;
        }

        public /* synthetic */ OrderDetailsViewState(boolean z10, String str, String str2, List list, Boolean bool, AbstractC6392a abstractC6392a, ZonedDateTime zonedDateTime, UIEvent uIEvent, CartPreviewDecorator cartPreviewDecorator, List list2, List list3, String str3, FlyBuyState flyBuyState, StoreInfo storeInfo, StoreDetails storeDetails, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, Boolean bool2, boolean z11, boolean z12, boolean z13, boolean z14, Float f10, Integer num, Integer num2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? CollectionsKt.m() : list, (i10 & 16) != 0 ? null : bool, (i10 & 32) != 0 ? null : abstractC6392a, (i10 & 64) != 0 ? null : zonedDateTime, (i10 & 128) != 0 ? new UIEvent(null, 1, null) : uIEvent, (i10 & 256) != 0 ? new CartPreviewDecorator(false, 0, 3, null) : cartPreviewDecorator, (i10 & 512) != 0 ? CollectionsKt.m() : list2, (i10 & 1024) != 0 ? CollectionsKt.m() : list3, (i10 & RecyclerView.m.FLAG_MOVED) == 0 ? str3 : "", (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : flyBuyState, (i10 & 8192) != 0 ? null : storeInfo, (i10 & 16384) != 0 ? null : storeDetails, (i10 & 32768) != 0 ? null : abstractC6392a2, (i10 & 65536) != 0 ? null : abstractC6392a3, (i10 & 131072) != 0 ? Boolean.FALSE : bool2, (i10 & 262144) != 0 ? false : z11, (i10 & 524288) != 0 ? false : z12, (i10 & 1048576) != 0 ? false : z13, (i10 & 2097152) != 0 ? false : z14, (i10 & 4194304) != 0 ? Float.valueOf(0.0f) : f10, (i10 & 8388608) != 0 ? 0 : num, (i10 & 16777216) != 0 ? 0 : num2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.OrderDetailViewModel$addCurrentOrderToCart$1", f = "OrderDetailViewModel.kt", l = {616}, m = "invokeSuspend")
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f161031a;

        /* renamed from: b, reason: collision with root package name */
        int f161032b;

        /* renamed from: c, reason: collision with root package name */
        int f161033c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f161034d;

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            i iVar = L.this.new i(continuation);
            iVar.f161034d = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r6.f161033c
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 != r3) goto L1a
                java.lang.Object r0 = r6.f161031a
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r6.f161034d
                mv.O r0 = (mv.InterfaceC15783O) r0
                kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L18
                goto L59
            L18:
                r7 = move-exception
                goto L60
            L1a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L22:
                kotlin.ResultKt.b(r7)
                java.lang.Object r7 = r6.f161034d
                mv.O r7 = (mv.InterfaceC15783O) r7
                sn.L r1 = sn.L.this
                sn.L.g0(r1)
                sn.L r1 = sn.L.this
                kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L43
                com.meijer.mobile.digitalshopping.api.orders.a r4 = sn.L.T(r1)     // Catch: java.lang.Throwable -> L43
                hj.c r1 = sn.L.R(r1)     // Catch: java.lang.Throwable -> L43
                if (r1 != 0) goto L48
                java.lang.String r1 = "fetchedOrder"
                kotlin.jvm.internal.Intrinsics.x(r1)     // Catch: java.lang.Throwable -> L43
                r1 = 0
                goto L48
            L43:
                r0 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
                goto L60
            L48:
                r6.f161034d = r7     // Catch: java.lang.Throwable -> L43
                r6.f161031a = r7     // Catch: java.lang.Throwable -> L43
                r6.f161032b = r2     // Catch: java.lang.Throwable -> L43
                r6.f161033c = r3     // Catch: java.lang.Throwable -> L43
                java.lang.Object r1 = r4.p(r1, r6)     // Catch: java.lang.Throwable -> L43
                if (r1 != r0) goto L57
                return r0
            L57:
                r0 = r7
                r7 = r1
            L59:
                fj.e r7 = (fj.CartChanges) r7     // Catch: java.lang.Throwable -> L18
                java.lang.Object r7 = kotlin.Result.b(r7)     // Catch: java.lang.Throwable -> L18
                goto L6a
            L60:
                kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
                java.lang.Object r7 = kotlin.ResultKt.a(r7)
                java.lang.Object r7 = kotlin.Result.b(r7)
            L6a:
                java.lang.Throwable r1 = kotlin.Result.e(r7)
                if (r1 == 0) goto L86
                kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
                mv.E0.i(r0)
                boolean r0 = r1 instanceof java.lang.Error
                if (r0 != 0) goto L85
                qw.a$a r0 = qw.a.INSTANCE
                java.lang.String r3 = "Error editing order in OrderDetailViewModel"
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r0.f(r1, r3, r2)
                goto L86
            L85:
                throw r1
            L86:
                sn.L r0 = sn.L.this
                boolean r1 = kotlin.Result.h(r7)
                if (r1 == 0) goto L93
                fj.e r7 = (fj.CartChanges) r7
                sn.L.X(r0)
            L93:
                kotlin.Unit r7 = kotlin.Unit.f143329a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: sn.L.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.OrderDetailViewModel$cancelOrder$1", f = "OrderDetailViewModel.kt", l = {952}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f161036a;

        /* renamed from: b, reason: collision with root package name */
        int f161037b;

        /* renamed from: c, reason: collision with root package name */
        int f161038c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f161039d;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            j jVar = L.this.new j(continuation);
            jVar.f161039d = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r6.f161038c
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 != r3) goto L1a
                java.lang.Object r0 = r6.f161036a
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r6.f161039d
                mv.O r0 = (mv.InterfaceC15783O) r0
                kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L18
                goto L54
            L18:
                r7 = move-exception
                goto L5b
            L1a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L22:
                kotlin.ResultKt.b(r7)
                java.lang.Object r7 = r6.f161039d
                mv.O r7 = (mv.InterfaceC15783O) r7
                sn.L r1 = sn.L.this
                kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L3e
                com.meijer.mobile.digitalshopping.api.orders.a r4 = sn.L.T(r1)     // Catch: java.lang.Throwable -> L3e
                hj.c r1 = sn.L.R(r1)     // Catch: java.lang.Throwable -> L3e
                if (r1 != 0) goto L43
                java.lang.String r1 = "fetchedOrder"
                kotlin.jvm.internal.Intrinsics.x(r1)     // Catch: java.lang.Throwable -> L3e
                r1 = 0
                goto L43
            L3e:
                r0 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
                goto L5b
            L43:
                r6.f161039d = r7     // Catch: java.lang.Throwable -> L3e
                r6.f161036a = r7     // Catch: java.lang.Throwable -> L3e
                r6.f161037b = r2     // Catch: java.lang.Throwable -> L3e
                r6.f161038c = r3     // Catch: java.lang.Throwable -> L3e
                java.lang.Object r1 = r4.n(r1, r6)     // Catch: java.lang.Throwable -> L3e
                if (r1 != r0) goto L52
                return r0
            L52:
                r0 = r7
                r7 = r1
            L54:
                java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L18
                java.lang.Object r7 = kotlin.Result.b(r7)     // Catch: java.lang.Throwable -> L18
                goto L65
            L5b:
                kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
                java.lang.Object r7 = kotlin.ResultKt.a(r7)
                java.lang.Object r7 = kotlin.Result.b(r7)
            L65:
                sn.L r1 = sn.L.this
                java.lang.Throwable r3 = kotlin.Result.e(r7)
                if (r3 == 0) goto L86
                kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
                mv.E0.i(r0)
                boolean r0 = r3 instanceof java.lang.Error
                if (r0 != 0) goto L85
                qw.a$a r0 = qw.a.INSTANCE
                java.lang.String r4 = "Error cancelling order in OrderDetailViewModel"
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r0.f(r3, r4, r2)
                sn.L.h0(r1)
                goto L86
            L85:
                throw r3
            L86:
                sn.L r0 = sn.L.this
                boolean r1 = kotlin.Result.h(r7)
                if (r1 == 0) goto L96
                java.lang.String r7 = (java.lang.String) r7
                sn.L.e0(r0)
                sn.L.l0(r0)
            L96:
                kotlin.Unit r7 = kotlin.Unit.f143329a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: sn.L.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.OrderDetailViewModel$checkIsOrderEditableBeforeEditingPhoneNumber$1", f = "OrderDetailViewModel.kt", l = {1161}, m = "invokeSuspend")
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f161041a;

        /* renamed from: b, reason: collision with root package name */
        int f161042b;

        /* renamed from: c, reason: collision with root package name */
        int f161043c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f161044d;

        k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            k kVar = L.this.new k(continuation);
            kVar.f161044d = obj;
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r6.f161043c
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 != r3) goto L1a
                java.lang.Object r0 = r6.f161041a
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r6.f161044d
                mv.O r0 = (mv.InterfaceC15783O) r0
                kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L18
                goto L59
            L18:
                r7 = move-exception
                goto L60
            L1a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L22:
                kotlin.ResultKt.b(r7)
                java.lang.Object r7 = r6.f161044d
                mv.O r7 = (mv.InterfaceC15783O) r7
                sn.L r1 = sn.L.this
                sn.L.g0(r1)
                sn.L r1 = sn.L.this
                kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L43
                com.meijer.mobile.digitalshopping.api.orders.a r4 = sn.L.T(r1)     // Catch: java.lang.Throwable -> L43
                hj.c r1 = sn.L.R(r1)     // Catch: java.lang.Throwable -> L43
                if (r1 != 0) goto L48
                java.lang.String r1 = "fetchedOrder"
                kotlin.jvm.internal.Intrinsics.x(r1)     // Catch: java.lang.Throwable -> L43
                r1 = 0
                goto L48
            L43:
                r0 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
                goto L60
            L48:
                r6.f161044d = r7     // Catch: java.lang.Throwable -> L43
                r6.f161041a = r7     // Catch: java.lang.Throwable -> L43
                r6.f161042b = r2     // Catch: java.lang.Throwable -> L43
                r6.f161043c = r3     // Catch: java.lang.Throwable -> L43
                java.lang.Object r1 = r4.F(r1, r6)     // Catch: java.lang.Throwable -> L43
                if (r1 != r0) goto L57
                return r0
            L57:
                r0 = r7
                r7 = r1
            L59:
                com.meijer.mobile.digitalshopping.api.orders.model.ordercancelable.OrderIsEditCancelableResponse r7 = (com.meijer.mobile.digitalshopping.api.orders.model.ordercancelable.OrderIsEditCancelableResponse) r7     // Catch: java.lang.Throwable -> L18
                java.lang.Object r7 = kotlin.Result.b(r7)     // Catch: java.lang.Throwable -> L18
                goto L6a
            L60:
                kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
                java.lang.Object r7 = kotlin.ResultKt.a(r7)
                java.lang.Object r7 = kotlin.Result.b(r7)
            L6a:
                sn.L r1 = sn.L.this
                boolean r3 = kotlin.Result.h(r7)
                if (r3 == 0) goto L82
                r3 = r7
                com.meijer.mobile.digitalshopping.api.orders.model.ordercancelable.OrderIsEditCancelableResponse r3 = (com.meijer.mobile.digitalshopping.api.orders.model.ordercancelable.OrderIsEditCancelableResponse) r3
                boolean r3 = r3.getStatus()
                if (r3 == 0) goto L7f
                sn.L.Y(r1)
                goto L82
            L7f:
                sn.L.i0(r1)
            L82:
                sn.L r1 = sn.L.this
                java.lang.Throwable r7 = kotlin.Result.e(r7)
                if (r7 == 0) goto La3
                kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
                mv.E0.i(r0)
                boolean r0 = r7 instanceof java.lang.Error
                if (r0 != 0) goto La2
                qw.a$a r0 = qw.a.INSTANCE
                java.lang.String r3 = "Error checking isOrderEditable in OrderDetailViewModel"
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r0.f(r7, r3, r2)
                sn.L.f0(r1)
                goto La3
            La2:
                throw r7
            La3:
                kotlin.Unit r7 = kotlin.Unit.f143329a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: sn.L.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.OrderDetailViewModel$editOrder$1", f = "OrderDetailViewModel.kt", l = {986}, m = "invokeSuspend")
    static final class l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f161046a;

        /* renamed from: b, reason: collision with root package name */
        int f161047b;

        /* renamed from: c, reason: collision with root package name */
        int f161048c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f161049d;

        l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            l lVar = L.this.new l(continuation);
            lVar.f161049d = obj;
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r6.f161048c
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 != r3) goto L1a
                java.lang.Object r0 = r6.f161046a
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r6.f161049d
                mv.O r0 = (mv.InterfaceC15783O) r0
                kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L18
                goto L59
            L18:
                r7 = move-exception
                goto L60
            L1a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L22:
                kotlin.ResultKt.b(r7)
                java.lang.Object r7 = r6.f161049d
                mv.O r7 = (mv.InterfaceC15783O) r7
                sn.L r1 = sn.L.this
                sn.L.g0(r1)
                sn.L r1 = sn.L.this
                kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L43
                com.meijer.mobile.digitalshopping.api.orders.a r4 = sn.L.T(r1)     // Catch: java.lang.Throwable -> L43
                hj.c r1 = sn.L.R(r1)     // Catch: java.lang.Throwable -> L43
                if (r1 != 0) goto L48
                java.lang.String r1 = "fetchedOrder"
                kotlin.jvm.internal.Intrinsics.x(r1)     // Catch: java.lang.Throwable -> L43
                r1 = 0
                goto L48
            L43:
                r0 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
                goto L60
            L48:
                r6.f161049d = r7     // Catch: java.lang.Throwable -> L43
                r6.f161046a = r7     // Catch: java.lang.Throwable -> L43
                r6.f161047b = r2     // Catch: java.lang.Throwable -> L43
                r6.f161048c = r3     // Catch: java.lang.Throwable -> L43
                java.lang.Object r1 = r4.p(r1, r6)     // Catch: java.lang.Throwable -> L43
                if (r1 != r0) goto L57
                return r0
            L57:
                r0 = r7
                r7 = r1
            L59:
                fj.e r7 = (fj.CartChanges) r7     // Catch: java.lang.Throwable -> L18
                java.lang.Object r7 = kotlin.Result.b(r7)     // Catch: java.lang.Throwable -> L18
                goto L6a
            L60:
                kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
                java.lang.Object r7 = kotlin.ResultKt.a(r7)
                java.lang.Object r7 = kotlin.Result.b(r7)
            L6a:
                sn.L r1 = sn.L.this
                boolean r3 = kotlin.Result.h(r7)
                if (r3 == 0) goto L78
                r3 = r7
                fj.e r3 = (fj.CartChanges) r3
                sn.L.X(r1)
            L78:
                sn.L r1 = sn.L.this
                java.lang.Throwable r7 = kotlin.Result.e(r7)
                if (r7 == 0) goto L99
                kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
                mv.E0.i(r0)
                boolean r0 = r7 instanceof java.lang.Error
                if (r0 != 0) goto L98
                qw.a$a r0 = qw.a.INSTANCE
                java.lang.String r3 = "error editing order in OrderDetailViewModel"
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r0.f(r7, r3, r2)
                sn.L.i0(r1)
                goto L99
            L98:
                throw r7
            L99:
                sn.L r7 = sn.L.this
                sn.L.b0(r7)
                kotlin.Unit r7 = kotlin.Unit.f143329a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: sn.L.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.OrderDetailViewModel$fetchOrderDetails$1", f = "OrderDetailViewModel.kt", l = {691, 692}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class m extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f161051a;

        /* renamed from: b, reason: collision with root package name */
        Object f161052b;

        /* renamed from: c, reason: collision with root package name */
        Object f161053c;

        /* renamed from: d, reason: collision with root package name */
        Object f161054d;

        /* renamed from: e, reason: collision with root package name */
        Object f161055e;

        /* renamed from: f, reason: collision with root package name */
        int f161056f;

        /* renamed from: g, reason: collision with root package name */
        int f161057g;

        /* renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f161058h;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f161060j;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LHl/b;", "<anonymous>", "(Lmv/O;)LHl/b;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.OrderDetailViewModel$fetchOrderDetails$1$1$flyBuyOrder$1", f = "OrderDetailViewModel.kt", l = {688}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super FlyBuyOrderDetail>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f161061a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f161062b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f161063c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(L l10, String str, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f161062b = l10;
                this.f161063c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f161062b, this.f161063c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super FlyBuyOrderDetail> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int iIntValue;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f161061a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                com.meijer.mobile.digitalshopping.api.orders.a aVar = this.f161062b.ordersRepository;
                Integer numV = StringsKt.v(this.f161063c);
                if (numV != null) {
                    iIntValue = numV.intValue();
                } else {
                    iIntValue = 0;
                }
                this.f161061a = 1;
                Object objV = aVar.v(iIntValue, this);
                if (objV == objF) {
                    return objF;
                }
                return objV;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lhj/c;", "<anonymous>", "(Lmv/O;)Lhj/c;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.OrderDetailViewModel$fetchOrderDetails$1$1$orderDetails$1", f = "OrderDetailViewModel.kt", l = {685}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super OrderDetail>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f161064a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ L f161065b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f161066c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(L l10, String str, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f161065b = l10;
                this.f161066c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f161065b, this.f161066c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super OrderDetail> continuation) {
                return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f161064a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                com.meijer.mobile.digitalshopping.api.orders.a aVar = this.f161065b.ordersRepository;
                String str = this.f161066c;
                this.f161064a = 1;
                Object objS = aVar.s(str, this);
                if (objS == objF) {
                    return objF;
                }
                return objS;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f161060j = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            m mVar = L.this.new m(this.f161060j, continuation);
            mVar.f161058h = obj;
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((m) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00cc A[Catch: all -> 0x002d, TryCatch #2 {all -> 0x002d, blocks: (B:7:0x0028, B:27:0x00bb, B:32:0x00cc, B:34:0x00d8), top: B:57:0x0028 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0113  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Exception {
            /*
                Method dump skipped, instructions count: 294
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: sn.L.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.OrderDetailViewModel$fetchOrderDetailsWithMperks$1", f = "OrderDetailViewModel.kt", l = {642}, m = "invokeSuspend")
    static final class n extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f161067a;

        /* renamed from: b, reason: collision with root package name */
        int f161068b;

        /* renamed from: c, reason: collision with root package name */
        int f161069c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f161070d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f161072f;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmv/O;", "Lkotlin/Pair;", "Lim/b;", "Lcom/meijer/mobile/digitalshopping/api/orders/model/orderrewards/OrderRewardPointsForOrderResponse;", "<anonymous>", "(Lmv/O;)Lkotlin/Pair;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.OrderDetailViewModel$fetchOrderDetailsWithMperks$1$1$1", f = "OrderDetailViewModel.kt", l = {652, 653, 657}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Pair<? extends OrderResponseHolder, ? extends OrderRewardPointsForOrderResponse>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f161073a;

            /* renamed from: b, reason: collision with root package name */
            Object f161074b;

            /* renamed from: c, reason: collision with root package name */
            Object f161075c;

            /* renamed from: d, reason: collision with root package name */
            int f161076d;

            /* renamed from: e, reason: collision with root package name */
            int f161077e;

            /* renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f161078f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ L f161079g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ String f161080h;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LHl/b;", "<anonymous>", "(Lmv/O;)LHl/b;"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.OrderDetailViewModel$fetchOrderDetailsWithMperks$1$1$1$flyBuyOrderDetail$1", f = "OrderDetailViewModel.kt", l = {648}, m = "invokeSuspend")
            /* renamed from: sn.L$n$a$a, reason: collision with other inner class name */
            static final class C2508a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super FlyBuyOrderDetail>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f161081a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ L f161082b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f161083c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2508a(L l10, String str, Continuation<? super C2508a> continuation) {
                    super(2, continuation);
                    this.f161082b = l10;
                    this.f161083c = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C2508a(this.f161082b, this.f161083c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super FlyBuyOrderDetail> continuation) {
                    return ((C2508a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    int iIntValue;
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f161081a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    com.meijer.mobile.digitalshopping.api.orders.a aVar = this.f161082b.ordersRepository;
                    Integer numV = StringsKt.v(this.f161083c);
                    if (numV != null) {
                        iIntValue = numV.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    this.f161081a = 1;
                    Object objV = aVar.v(iIntValue, this);
                    if (objV == objF) {
                        return objF;
                    }
                    return objV;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lhj/c;", "<anonymous>", "(Lmv/O;)Lhj/c;"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.OrderDetailViewModel$fetchOrderDetailsWithMperks$1$1$1$orderDetails$1", f = "OrderDetailViewModel.kt", l = {644}, m = "invokeSuspend")
            static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super OrderDetail>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f161084a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ L f161085b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f161086c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(L l10, String str, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f161085b = l10;
                    this.f161086c = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f161085b, this.f161086c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super OrderDetail> continuation) {
                    return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f161084a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    com.meijer.mobile.digitalshopping.api.orders.a aVar = this.f161085b.ordersRepository;
                    String str = this.f161086c;
                    this.f161084a = 1;
                    Object objS = aVar.s(str, this);
                    if (objS == objF) {
                        return objF;
                    }
                    return objS;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Pair<? extends OrderResponseHolder, ? extends OrderRewardPointsForOrderResponse>> continuation) {
                return invoke2(interfaceC15783O, (Continuation<? super Pair<OrderResponseHolder, OrderRewardPointsForOrderResponse>>) continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(L l10, String str, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f161079g = l10;
                this.f161080h = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f161079g, this.f161080h, continuation);
                aVar.f161078f = obj;
                return aVar;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super Pair<OrderResponseHolder, OrderRewardPointsForOrderResponse>> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00fe A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    Method dump skipped, instructions count: 255
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: sn.L.n.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f161072f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            n nVar = L.this.new n(this.f161072f, continuation);
            nVar.f161070d = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((n) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Exception {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r8.f161069c
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 != r3) goto L1a
                java.lang.Object r0 = r8.f161067a
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r8.f161070d
                mv.O r0 = (mv.InterfaceC15783O) r0
                kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L18
                goto L46
            L18:
                r9 = move-exception
                goto L51
            L1a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L22:
                kotlin.ResultKt.b(r9)
                java.lang.Object r9 = r8.f161070d
                mv.O r9 = (mv.InterfaceC15783O) r9
                sn.L r1 = sn.L.this
                java.lang.String r4 = r8.f161072f
                kotlin.Result$Companion r5 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L4d
                sn.L$n$a r5 = new sn.L$n$a     // Catch: java.lang.Throwable -> L4d
                r6 = 0
                r5.<init>(r1, r4, r6)     // Catch: java.lang.Throwable -> L4d
                r8.f161070d = r9     // Catch: java.lang.Throwable -> L4d
                r8.f161067a = r9     // Catch: java.lang.Throwable -> L4d
                r8.f161068b = r2     // Catch: java.lang.Throwable -> L4d
                r8.f161069c = r3     // Catch: java.lang.Throwable -> L4d
                java.lang.Object r1 = mv.C15784P.g(r5, r8)     // Catch: java.lang.Throwable -> L4d
                if (r1 != r0) goto L44
                return r0
            L44:
                r0 = r9
                r9 = r1
            L46:
                kotlin.Pair r9 = (kotlin.Pair) r9     // Catch: java.lang.Throwable -> L18
                java.lang.Object r9 = kotlin.Result.b(r9)     // Catch: java.lang.Throwable -> L18
                goto L5b
            L4d:
                r0 = move-exception
                r7 = r0
                r0 = r9
                r9 = r7
            L51:
                kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
                java.lang.Object r9 = kotlin.ResultKt.a(r9)
                java.lang.Object r9 = kotlin.Result.b(r9)
            L5b:
                sn.L r1 = sn.L.this
                java.lang.Throwable r3 = kotlin.Result.e(r9)
                if (r3 == 0) goto L7c
                kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
                mv.E0.i(r0)
                boolean r0 = r3 instanceof java.lang.Error
                if (r0 != 0) goto L7b
                qw.a$a r0 = qw.a.INSTANCE
                java.lang.String r4 = "Error fetching order details with mperks in  OrderDetailViewModel"
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r0.f(r3, r4, r2)
                sn.L.Z(r1, r3)
                goto L7c
            L7b:
                throw r3
            L7c:
                sn.L r0 = sn.L.this
                boolean r1 = kotlin.Result.h(r9)
                if (r1 == 0) goto La0
                kotlin.Pair r9 = (kotlin.Pair) r9
                if (r9 != 0) goto L91
                com.meijer.mobile.home.ux.orders.NullOrderException r9 = new com.meijer.mobile.home.ux.orders.NullOrderException
                r9.<init>()
                sn.L.Z(r0, r9)
                goto La0
            L91:
                java.lang.Object r1 = r9.a()
                im.b r1 = (im.OrderResponseHolder) r1
                java.lang.Object r9 = r9.b()
                com.meijer.mobile.digitalshopping.api.orders.model.orderrewards.OrderRewardPointsForOrderResponse r9 = (com.meijer.mobile.digitalshopping.api.orders.model.orderrewards.OrderRewardPointsForOrderResponse) r9
                sn.L.a0(r0, r1, r9)
            La0:
                kotlin.Unit r9 = kotlin.Unit.f143329a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: sn.L.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.OrderDetailViewModel", f = "OrderDetailViewModel.kt", l = {716}, m = "fetchOrderSubstitution")
    static final class o extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f161087a;

        /* renamed from: b, reason: collision with root package name */
        Object f161088b;

        /* renamed from: c, reason: collision with root package name */
        Object f161089c;

        /* renamed from: d, reason: collision with root package name */
        int f161090d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f161091e;

        /* renamed from: g, reason: collision with root package name */
        int f161093g;

        o(Continuation<? super o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f161091e = obj;
            this.f161093g |= Integer.MIN_VALUE;
            return L.this.y0(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.OrderDetailViewModel$fetchStoreInfo$1", f = "OrderDetailViewModel.kt", l = {811}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class p extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f161094a;

        /* renamed from: b, reason: collision with root package name */
        int f161095b;

        /* renamed from: c, reason: collision with root package name */
        int f161096c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f161097d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f161099f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(int i10, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f161099f = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            p pVar = L.this.new p(this.f161099f, continuation);
            pVar.f161097d = obj;
            return pVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((p) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v11, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v2, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r22;
            StoreInfo storeInfo;
            Object objE;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f161096c;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    ?? r23 = (InterfaceC15783O) this.f161097d;
                    L l10 = L.this;
                    int i11 = this.f161099f;
                    Result.Companion companion = Result.INSTANCE;
                    Zq.b bVar = l10.storeInfoRepository;
                    this.f161097d = r23;
                    this.f161094a = r23;
                    this.f161095b = 0;
                    this.f161096c = 1;
                    objE = bVar.e(i11, this);
                    i10 = r23;
                    if (objE == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r24 = (InterfaceC15783O) this.f161097d;
                    ResultKt.b(obj);
                    objE = obj;
                    i10 = r24;
                }
                objB = Result.b((StoreInfo) objE);
                r22 = i10;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
                r22 = i10;
            }
            L l11 = L.this;
            if (Result.h(objB)) {
                StoreInfo storeInfo2 = (StoreInfo) objB;
                InterfaceC16549B interfaceC16549B = l11._orderDetailsViewState;
                while (true) {
                    Object value = interfaceC16549B.getValue();
                    storeInfo = storeInfo2;
                    if (interfaceC16549B.e(value, OrderDetailsViewState.b((OrderDetailsViewState) value, false, null, null, null, null, null, null, null, null, null, null, null, null, storeInfo2, null, null, null, null, false, false, false, false, null, null, null, 33546239, null))) {
                        break;
                    }
                    storeInfo2 = storeInfo;
                }
                l11.flyBuyManager.a0(storeInfo);
                l11.z0(storeInfo);
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                E0.i(r22.getCoroutineContext());
                if (thE instanceof Error) {
                    throw thE;
                }
                qw.a.INSTANCE.f(thE, "Error in getting storeInfo", new Object[0]);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.OrderDetailViewModel$getProductsDetailList$1", f = "OrderDetailViewModel.kt", l = {1147}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class q extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f161100a;

        /* renamed from: b, reason: collision with root package name */
        Object f161101b;

        /* renamed from: c, reason: collision with root package name */
        Object f161102c;

        /* renamed from: d, reason: collision with root package name */
        Object f161103d;

        /* renamed from: e, reason: collision with root package name */
        int f161104e;

        /* renamed from: f, reason: collision with root package name */
        int f161105f;

        /* renamed from: g, reason: collision with root package name */
        int f161106g;

        /* renamed from: h, reason: collision with root package name */
        int f161107h;

        /* renamed from: i, reason: collision with root package name */
        int f161108i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f161109j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ List<String> f161111l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(List<String> list, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f161111l = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            q qVar = L.this.new q(this.f161111l, continuation);
            qVar.f161109j = obj;
            return qVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((q) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f161108i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f161109j;
                    L l10 = L.this;
                    List<String> listM = this.f161111l;
                    Result.Companion companion = Result.INSTANCE;
                    Ro.c cVar = l10.productsRepository;
                    if (listM == null) {
                        listM = CollectionsKt.m();
                    }
                    this.f161109j = interfaceC15783O;
                    this.f161100a = interfaceC15783O;
                    this.f161101b = this;
                    this.f161102c = this;
                    this.f161103d = interfaceC15783O;
                    this.f161104e = 0;
                    this.f161105f = 0;
                    this.f161106g = 0;
                    this.f161107h = 0;
                    this.f161108i = 1;
                    obj = cVar.j(listM, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            L l11 = L.this;
            if (Result.h(objB)) {
                l11.m1((List) objB);
            }
            L l12 = L.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "Failed to fetch product list for Order Details", new Object[0]);
                l12.m1(null);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.OrderDetailViewModel$getShortUrlInfo$1", f = "OrderDetailViewModel.kt", l = {1325}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class r extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f161112a;

        /* renamed from: b, reason: collision with root package name */
        int f161113b;

        /* renamed from: c, reason: collision with root package name */
        int f161114c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f161115d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f161117f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, Continuation<? super r> continuation) {
            super(2, continuation);
            this.f161117f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            r rVar = L.this.new r(this.f161117f, continuation);
            rVar.f161115d = obj;
            return rVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((r) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r6.f161114c
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r0 = r6.f161112a
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r6.f161115d
                mv.O r0 = (mv.InterfaceC15783O) r0
                kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L17
                goto L44
            L17:
                r7 = move-exception
                goto L4f
            L19:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L21:
                kotlin.ResultKt.b(r7)
                java.lang.Object r7 = r6.f161115d
                mv.O r7 = (mv.InterfaceC15783O) r7
                sn.L r1 = sn.L.this
                java.lang.String r3 = r6.f161117f
                kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L4b
                com.meijer.mobile.digitalshopping.api.orders.a r1 = sn.L.T(r1)     // Catch: java.lang.Throwable -> L4b
                r6.f161115d = r7     // Catch: java.lang.Throwable -> L4b
                r6.f161112a = r7     // Catch: java.lang.Throwable -> L4b
                r4 = 0
                r6.f161113b = r4     // Catch: java.lang.Throwable -> L4b
                r6.f161114c = r2     // Catch: java.lang.Throwable -> L4b
                java.lang.Object r1 = r1.C(r3, r6)     // Catch: java.lang.Throwable -> L4b
                if (r1 != r0) goto L42
                return r0
            L42:
                r0 = r7
                r7 = r1
            L44:
                com.meijer.mobile.fulfillment.flybuy.api.models.UrlShortnerResponse r7 = (com.meijer.mobile.fulfillment.flybuy.api.models.UrlShortnerResponse) r7     // Catch: java.lang.Throwable -> L17
                java.lang.Object r7 = kotlin.Result.b(r7)     // Catch: java.lang.Throwable -> L17
                goto L59
            L4b:
                r0 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
            L4f:
                kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
                java.lang.Object r7 = kotlin.ResultKt.a(r7)
                java.lang.Object r7 = kotlin.Result.b(r7)
            L59:
                sn.L r1 = sn.L.this
                boolean r2 = kotlin.Result.h(r7)
                if (r2 == 0) goto L8a
                r2 = r7
                com.meijer.mobile.fulfillment.flybuy.api.models.UrlShortnerResponse r2 = (com.meijer.mobile.fulfillment.flybuy.api.models.UrlShortnerResponse) r2
                if (r2 == 0) goto L84
                java.lang.String r2 = r2.getDestinationUrl()
                if (r2 == 0) goto L79
                android.net.Uri r2 = android.net.Uri.parse(r2)
                if (r2 == 0) goto L79
                java.lang.String r3 = "orderID"
                java.lang.String r2 = r2.getQueryParameter(r3)
                goto L7a
            L79:
                r2 = 0
            L7a:
                if (r2 == 0) goto L80
                sn.L.N(r1, r2)
                goto L8a
            L80:
                sn.L.c0(r1)
                goto L8a
            L84:
                com.meijer.mobile.home.ux.orders.NullOrderException r7 = new com.meijer.mobile.home.ux.orders.NullOrderException
                r7.<init>()
                throw r7
            L8a:
                sn.L r1 = sn.L.this
                java.lang.Throwable r7 = kotlin.Result.e(r7)
                if (r7 == 0) goto La7
                kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
                mv.E0.i(r0)
                boolean r0 = r7 instanceof java.lang.Error
                if (r0 != 0) goto La6
                qw.a$a r0 = qw.a.INSTANCE
                r0.e(r7)
                sn.L.c0(r1)
                goto La7
            La6:
                throw r7
            La7:
                kotlin.Unit r7 = kotlin.Unit.f143329a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: sn.L.r.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.OrderDetailViewModel$loadCart$1", f = "OrderDetailViewModel.kt", l = {529}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class s extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f161118a;

        /* renamed from: b, reason: collision with root package name */
        int f161119b;

        /* renamed from: c, reason: collision with root package name */
        int f161120c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f161121d;

        s(Continuation<? super s> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            s sVar = L.this.new s(continuation);
            sVar.f161121d = obj;
            return sVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((s) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v2, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, mv.O] */
        /* JADX WARN: Type inference failed for: r1v8, types: [mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r12;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f161120c;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ?? r13 = (InterfaceC15783O) this.f161121d;
                        ResultKt.b(obj);
                        i10 = r13;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    ?? r14 = (InterfaceC15783O) this.f161121d;
                    L l10 = L.this;
                    Result.Companion companion = Result.INSTANCE;
                    il.m mVar = l10.cartRepository;
                    this.f161121d = r14;
                    this.f161118a = r14;
                    this.f161119b = 0;
                    this.f161120c = 1;
                    i10 = r14;
                    if (InterfaceC14774f.e(mVar, true, false, this, 2, null) == objF) {
                        return objF;
                    }
                }
                objB = Result.b(Unit.f143329a);
                r12 = i10;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
                r12 = i10;
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                E0.i(r12.getCoroutineContext());
                if (!(thE instanceof Error)) {
                    qw.a.INSTANCE.l(thE, "Load Cart failed in OrderDetailViewModel", new Object[0]);
                } else {
                    throw thE;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.OrderDetailViewModel$onFetchDetailsSuccess$1$1$1", f = "OrderDetailViewModel.kt", l = {844}, m = "invokeSuspend")
    static final class t extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f161123a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ OrderDetail f161125c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<OrderResponseHolder> f161126d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(OrderDetail orderDetail, Ref.ObjectRef<OrderResponseHolder> objectRef, Continuation<? super t> continuation) {
            super(2, continuation);
            this.f161125c = orderDetail;
            this.f161126d = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return L.this.new t(this.f161125c, this.f161126d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((t) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f161123a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                L l10 = L.this;
                String code = this.f161125c.getCode();
                OrderResponseHolder orderResponseHolder = this.f161126d.f143742a;
                this.f161123a = 1;
                if (l10.y0(code, orderResponseHolder, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public L(com.meijer.mobile.digitalshopping.api.orders.a ordersRepository, yo.k userManager, il.m cartRepository, zl.k featureManager, Ro.c productsRepository, Zq.b storeInfoRepository, Rn.I flyBuyManager, InterfaceC14523a analyticsEngine) {
        Intrinsics.j(ordersRepository, "ordersRepository");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(productsRepository, "productsRepository");
        Intrinsics.j(storeInfoRepository, "storeInfoRepository");
        Intrinsics.j(flyBuyManager, "flyBuyManager");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.ordersRepository = ordersRepository;
        this.cartRepository = cartRepository;
        this.featureManager = featureManager;
        this.productsRepository = productsRepository;
        this.storeInfoRepository = storeInfoRepository;
        this.flyBuyManager = flyBuyManager;
        this.analyticsEngine = analyticsEngine;
        InterfaceC16549B<OrderDetailsViewState> interfaceC16549BA = pv.S.a(new OrderDetailsViewState(false, null, null, null, null, null, null, null, new CartPreviewDecorator(userManager.b(), 0, 2, null), null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, 33554175, null));
        this._orderDetailsViewState = interfaceC16549BA;
        this.orderDetailsViewState = C16563h.c(interfaceC16549BA);
        Ju.a aVar = new Ju.a();
        this.compositeDisposable = aVar;
        this.listSubstitutedItems = new ArrayList();
        this.listOutOfStockItems = new ArrayList();
        this.listRejectedSubstitutedItems = new ArrayList();
        this.listUPCItems = new ArrayList();
        this.previousTrackAction = "";
        io.reactivex.l<Integer> lVarSubscribeOn = cartRepository.Q().subscribeOn(C13889a.b());
        final Function1 function1 = new Function1() { // from class: sn.H
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return L.E(this.f160890a, (Integer) obj);
            }
        };
        Lu.g<? super Integer> gVar = new Lu.g() { // from class: sn.J
            @Override // Lu.g
            public final void accept(Object obj) {
                L.F(function1, obj);
            }
        };
        a.Companion companion = qw.a.INSTANCE;
        final a aVar2 = new a(companion);
        Dk.a.a(lVarSubscribeOn.subscribe(gVar, new Lu.g() { // from class: sn.K
            @Override // Lu.g
            public final void accept(Object obj) {
                L.I(aVar2, obj);
            }
        }), aVar);
        io.reactivex.l<uk.c<ShoppingCart>> lVarSubscribeOn2 = cartRepository.b().subscribeOn(C13889a.b());
        final Function1 function12 = new Function1() { // from class: sn.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return L.J(this.f161544a, (uk.c) obj);
            }
        };
        Lu.g<? super uk.c<ShoppingCart>> gVar2 = new Lu.g() { // from class: sn.w
            @Override // Lu.g
            public final void accept(Object obj) {
                function12.invoke(obj);
            }
        };
        final b bVar = new b(companion);
        Dk.a.a(lVarSubscribeOn2.subscribe(gVar2, new Lu.g() { // from class: sn.x
            @Override // Lu.g
            public final void accept(Object obj) {
                bVar.invoke(obj);
            }
        }), aVar);
        if (userManager.b()) {
            io.reactivex.l<Integer> lVarSubscribeOn3 = cartRepository.Q().distinctUntilChanged().subscribeOn(C13889a.b());
            final Function1 function13 = new Function1() { // from class: sn.y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return L.K(this.f161547a, (Integer) obj);
                }
            };
            Lu.g<? super Integer> gVar3 = new Lu.g() { // from class: sn.z
                @Override // Lu.g
                public final void accept(Object obj) {
                    L.L(function13, obj);
                }
            };
            final c cVar = new c(companion);
            Dk.a.a(lVarSubscribeOn3.subscribe(gVar3, new Lu.g() { // from class: sn.A
                @Override // Lu.g
                public final void accept(Object obj) {
                    L.M(cVar, obj);
                }
            }), aVar);
        }
        io.reactivex.l<FlyBuyState> lVarSubscribeOn4 = flyBuyManager.J().subscribeOn(C13889a.b());
        final d dVar = new d(this);
        Lu.g<? super FlyBuyState> gVar4 = new Lu.g() { // from class: sn.B
            @Override // Lu.g
            public final void accept(Object obj) {
                L.G(dVar, obj);
            }
        };
        final e eVar = new e(companion);
        Dk.a.a(lVarSubscribeOn4.subscribe(gVar4, new Lu.g() { // from class: sn.I
            @Override // Lu.g
            public final void accept(Object obj) {
                L.H(eVar, obj);
            }
        }), aVar);
    }

    private final void B0() {
        List<OrderSubstitutionsDetail.LineItem> listB;
        String upc;
        String upcSubstitutedFor;
        List<OrderSubstitutionsDetail.LineItem> listB2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        this.listUPCItems.clear();
        arrayList3.clear();
        arrayList4.clear();
        OrderSubstitutionsDetail orderSubstitutionsDetail = this.fetchedOrderWithSubstitution;
        if (orderSubstitutionsDetail != null && (listB2 = orderSubstitutionsDetail.b()) != null) {
            for (OrderSubstitutionsDetail.LineItem lineItem : listB2) {
                if (lineItem.getUpcSubstitutedFor() != null) {
                    String upcSubstitutedFor2 = lineItem.getUpcSubstitutedFor();
                    if (upcSubstitutedFor2 == null) {
                        upcSubstitutedFor2 = "";
                    }
                    arrayList2.add(upcSubstitutedFor2);
                }
            }
        }
        OrderSubstitutionsDetail orderSubstitutionsDetail2 = this.fetchedOrderWithSubstitution;
        OrderDetail orderDetail = null;
        if (orderSubstitutionsDetail2 != null && (listB = orderSubstitutionsDetail2.b()) != null) {
            for (OrderSubstitutionsDetail.LineItem lineItem2 : listB) {
                String upcSubstitutedFor3 = lineItem2.getUpcSubstitutedFor();
                if (upcSubstitutedFor3 == null || upcSubstitutedFor3.length() == 0) {
                    Double actualQuantityPicked = lineItem2.getActualQuantityPicked();
                    if (actualQuantityPicked == null || actualQuantityPicked.doubleValue() > 0.0d || CollectionsKt.h0(arrayList2, lineItem2.getUpc())) {
                        lineItem2 = null;
                    }
                    if (lineItem2 != null && (upc = lineItem2.getUpc()) != null) {
                        arrayList3.add(upc);
                    }
                } else {
                    this.listUPCItems.add(new FetchSubstitutedProducts(lineItem2.getUpcSubstitutedFor(), lineItem2.getUpc(), lineItem2.getItemId(), lineItem2.getActualQuantityPicked(), lineItem2.getCustomerSubstitutionPreference(), lineItem2.getName(), lineItem2.getPrice(), lineItem2.getPricePerUnit()));
                    String upc2 = lineItem2.getUpc();
                    if (upc2 != null) {
                        arrayList.add(upc2);
                    }
                    String upcSubstitutedFor4 = lineItem2.getUpcSubstitutedFor();
                    if (upcSubstitutedFor4 != null) {
                        arrayList.add(upcSubstitutedFor4);
                    }
                    if (lineItem2.getCustomerSubstitutionPreference() != null && StringsKt.I(lineItem2.getCustomerSubstitutionPreference(), "REJECTED", false, 2, null) && (upcSubstitutedFor = lineItem2.getUpcSubstitutedFor()) != null) {
                        arrayList4.add(upcSubstitutedFor);
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            F0(arrayList);
        }
        C14782d c14782d = C14782d.f138348a;
        OrderDetail orderDetail2 = this.fetchedOrder;
        if (orderDetail2 == null) {
            Intrinsics.x("fetchedOrder");
            orderDetail2 = null;
        }
        l1(c14782d.d(orderDetail2, arrayList3), false);
        if (arrayList4.isEmpty()) {
            return;
        }
        OrderDetail orderDetail3 = this.fetchedOrder;
        if (orderDetail3 == null) {
            Intrinsics.x("fetchedOrder");
        } else {
            orderDetail = orderDetail3;
        }
        l1(c14782d.d(orderDetail, arrayList4), true);
    }

    private final FlyBuyState C0() {
        FlyBuyState flyBuyState = this._orderDetailsViewState.getValue().getFlyBuyState();
        return flyBuyState == null ? new FlyBuyState(null, null, null, false, null, false, false, false, false, false, false, null, null, null, 16383, null) : flyBuyState;
    }

    private final void H0() {
        es.K k10 = es.K.f130659a;
        OrderDetail orderDetail = this.fetchedOrder;
        if (orderDetail == null) {
            Intrinsics.x("fetchedOrder");
            orderDetail = null;
        }
        if (k10.f(orderDetail) && C14782d.f138348a.b(this.fetchedOrderWithSubstitution)) {
            Z0(vo.b.f166129h, true, this.orderDetailsViewState.getValue().getOrderType());
        } else {
            L0("im_here");
        }
    }

    private final void I0(boolean isOnMyWayAction, LocalDateTime currentDateTime) {
        OrderDetailsViewState value;
        AbstractC6392a.Companion companion;
        InterfaceC14523a interfaceC14523a = this.analyticsEngine;
        Kn.n nVar = Kn.n.f17594a;
        TrackingData trackingDataI = nVar.I(C0());
        if (!isOnMyWayAction) {
            trackingDataI = null;
        }
        if (trackingDataI == null) {
            trackingDataI = nVar.F(C0(), true);
        }
        interfaceC14523a.k(trackingDataI);
        StoreInfo storeInfo = this.orderDetailsViewState.getValue().getStoreInfo();
        if (storeInfo == null) {
            J0(this, isOnMyWayAction);
            return;
        }
        if (!OrderDetailPickupHoursDecorator.INSTANCE.a(storeInfo, currentDateTime).getIsOutsideOfPickupHours()) {
            J0(this, isOnMyWayAction);
            return;
        }
        InterfaceC16549B<OrderDetailsViewState> interfaceC16549B = this._orderDetailsViewState;
        do {
            value = interfaceC16549B.getValue();
            companion = AbstractC6392a.INSTANCE;
        } while (!interfaceC16549B.e(value, OrderDetailsViewState.b(value, false, null, null, null, null, null, null, new UIEvent(new g.PickupOutsideOfStoreHoursDialogEvent(isOnMyWayAction, new DialogEvent(companion.d(com.meijer.mobile.meijer.Y.f101241vb, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f101221ub, new Object[0]), companion.d(yr.Q.f171761b, new Object[0]), null, null, 24, null))), null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, 33554303, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(L l10, Integer num) {
        OrderDetailsViewState value;
        OrderDetailsViewState orderDetailsViewState;
        CartPreviewDecorator cartDecorator;
        InterfaceC16549B<OrderDetailsViewState> interfaceC16549B = l10._orderDetailsViewState;
        do {
            value = interfaceC16549B.getValue();
            orderDetailsViewState = value;
            cartDecorator = orderDetailsViewState.getCartDecorator();
            Intrinsics.g(num);
        } while (!interfaceC16549B.e(value, OrderDetailsViewState.b(orderDetailsViewState, false, null, null, null, null, null, null, null, CartPreviewDecorator.b(cartDecorator, false, num.intValue(), 1, null), null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, 33554175, null)));
        return Unit.f143329a;
    }

    private final void L0(String route) {
        OrderDetailsViewState value;
        OrderDetailsViewState orderDetailsViewState;
        InterfaceC16549B<OrderDetailsViewState> interfaceC16549B = this._orderDetailsViewState;
        do {
            value = interfaceC16549B.getValue();
            orderDetailsViewState = value;
        } while (!interfaceC16549B.e(value, OrderDetailsViewState.b(orderDetailsViewState, false, null, null, null, null, null, null, new UIEvent(new g.CustomerCheckInEvent(route, orderDetailsViewState.getOrderType())), null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, 33554302, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N0() {
        OrderDetailsViewState value;
        InterfaceC16549B<OrderDetailsViewState> interfaceC16549B = this._orderDetailsViewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, OrderDetailsViewState.b(value, false, null, null, null, null, null, null, new UIEvent(g.f.f160960c), null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, 33554302, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O0() {
        OrderDetailsViewState value;
        InterfaceC16549B<OrderDetailsViewState> interfaceC16549B = this._orderDetailsViewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, OrderDetailsViewState.b(value, false, null, null, null, null, null, null, new UIEvent(g.C2507g.f160962c), null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, 33554302, null)));
    }

    private final void P0(OrderResponseHolder orderResponseHolder, OrderRewardPointsForOrderResponse mperksPointsBySale) {
        DeliveryMode deliveryMode;
        OrderDetailsViewState value;
        OrderDetailsViewState orderDetailsViewStateB;
        List<FlyBuyOrderDetail.FlyBuyOrder> listA;
        OrderDetail fullOrderDetails = orderResponseHolder.getFullOrderDetails();
        FlyBuyOrderDetail flyBuyResponse = orderResponseHolder.getFlyBuyResponse();
        FlyBuyOrderDetail.FlyBuyOrder flyBuyOrder = (flyBuyResponse == null || (listA = flyBuyResponse.a()) == null) ? null : (FlyBuyOrderDetail.FlyBuyOrder) CollectionsKt.u0(listA);
        boolean z10 = flyBuyOrder != null;
        if (fullOrderDetails == null || (deliveryMode = fullOrderDetails.getDeliveryMode()) == null) {
            return;
        }
        PickupPerson pickUpPerson = fullOrderDetails.getPickUpPerson();
        String strB0 = pickUpPerson != null ? CollectionsKt.B0(CollectionsKt.r(pickUpPerson.getFirstName(), pickUpPerson.getLastName()), " ", null, null, 0, null, null, 62, null) : null;
        if (strB0 == null) {
            strB0 = "";
        }
        s1(deliveryMode, fullOrderDetails.getCode(), strB0);
        FlyBuyOrderDetail.FlyBuyOrder flyBuyOrder2 = flyBuyOrder;
        OrderDetailStatusDecorator orderDetailStatusDecoratorB = OrderDetailStatusDecorator.Companion.b(OrderDetailStatusDecorator.INSTANCE, fullOrderDetails, flyBuyOrder2, null, null, 12, null);
        q0(orderDetailStatusDecoratorB.getShouldShowParkingSpotInfo(), z10);
        InterfaceC16549B<OrderDetailsViewState> interfaceC16549B = this._orderDetailsViewState;
        do {
            value = interfaceC16549B.getValue();
            OrderDetailsViewState orderDetailsViewState = value;
            if (this.hasAnimated) {
                List<AbstractC13866b> listN0 = n0(fullOrderDetails, flyBuyOrder2, mperksPointsBySale);
                Boolean boolValueOf = Boolean.valueOf(OrderDetail.INSTANCE.a(fullOrderDetails));
                AbstractC6392a statusUpdateReason = fullOrderDetails.getStatusUpdateReason();
                ZonedDateTime statusUpdateTimestamp = fullOrderDetails.getStatusUpdateTimestamp();
                TendersItem tendersItemR = fullOrderDetails.r();
                List<EbtTransaction> listS = fullOrderDetails.s();
                if (listS == null) {
                    listS = CollectionsKt.m();
                }
                orderDetailsViewStateB = OrderDetailsViewState.b(orderDetailsViewState, false, null, null, listN0, boolValueOf, statusUpdateReason, statusUpdateTimestamp, null, null, C16930b.c(tendersItemR, listS), C16930b.b(fullOrderDetails.R()), null, null, null, null, null, null, null, false, false, false, false, null, null, null, 33552774, null);
            } else {
                this.hasAnimated = true;
                List<AbstractC13866b> listN02 = n0(fullOrderDetails, flyBuyOrder2, mperksPointsBySale);
                TendersItem tendersItemR2 = fullOrderDetails.r();
                List<EbtTransaction> listS2 = fullOrderDetails.s();
                if (listS2 == null) {
                    listS2 = CollectionsKt.m();
                }
                orderDetailsViewStateB = OrderDetailsViewState.b(orderDetailsViewState, false, null, null, listN02, Boolean.valueOf(OrderDetail.INSTANCE.a(fullOrderDetails)), fullOrderDetails.getStatusUpdateReason(), fullOrderDetails.getStatusUpdateTimestamp(), new UIEvent(orderDetailStatusDecoratorB.getShouldAnimateProgressValue() ? new g.AnimateProgressBarEvent(orderDetailStatusDecoratorB.getProgressBarResId(), orderDetailStatusDecoratorB.getOrderProgress(), orderDetailStatusDecoratorB.getOrderProgress() * 15, r0()) : new g.UpdateProgressBarWithOutAnimation(orderDetailStatusDecoratorB.getProgressBarResId(), orderDetailStatusDecoratorB.getOrderProgress())), null, C16930b.c(tendersItemR2, listS2), C16930b.b(fullOrderDetails.R()), null, null, null, null, null, null, null, false, false, false, false, null, null, null, 33552646, null);
            }
        } while (!interfaceC16549B.e(value, orderDetailsViewStateB));
    }

    static /* synthetic */ void Q0(L l10, OrderResponseHolder orderResponseHolder, OrderRewardPointsForOrderResponse orderRewardPointsForOrderResponse, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            orderRewardPointsForOrderResponse = null;
        }
        l10.P0(orderResponseHolder, orderRewardPointsForOrderResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R0(Throwable throwable) {
        OrderDetailsViewState value;
        OrderDetailsViewState orderDetailsViewState;
        Object failureDialogEvent;
        qw.a.INSTANCE.t(throwable);
        InterfaceC16549B<OrderDetailsViewState> interfaceC16549B = this._orderDetailsViewState;
        do {
            value = interfaceC16549B.getValue();
            orderDetailsViewState = value;
            if (throwable instanceof NullOrderException) {
                AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
                failureDialogEvent = new g.NullOrderFailureDialogEvent(new DialogEvent(companion.d(com.meijer.mobile.meijer.Y.f100821aa, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f100801Z9, new Object[0]), companion.d(yr.Q.f171761b, new Object[0]), null, null, 24, null));
            } else {
                AbstractC6392a.Companion companion2 = AbstractC6392a.INSTANCE;
                failureDialogEvent = new g.FailureDialogEvent(new DialogEvent(companion2.d(com.meijer.mobile.meijer.Y.f100725V9, new Object[0]), companion2.d(com.meijer.mobile.meijer.Y.f100706U9, new Object[0]), companion2.d(yr.Q.f171761b, new Object[0]), null, null, 24, null));
            }
        } while (!interfaceC16549B.e(value, OrderDetailsViewState.b(orderDetailsViewState, false, null, null, null, null, null, null, new UIEvent(failureDialogEvent), null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, 33554302, null)));
        t0();
    }

    static /* synthetic */ void T0(L l10, OrderResponseHolder orderResponseHolder, OrderRewardPointsForOrderResponse orderRewardPointsForOrderResponse, int i10, Object obj) throws Exception {
        if ((i10 & 2) != 0) {
            orderRewardPointsForOrderResponse = null;
        }
        l10.S0(orderResponseHolder, orderRewardPointsForOrderResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [T, im.b] */
    public static final Unit U0(Ref.ObjectRef objectRef, OrderResponseHolder orderResponseHolder, OrderDetail orderDetail, L l10, OrderRewardPointsForOrderResponse orderRewardPointsForOrderResponse, Boolean bool) {
        if (Intrinsics.e(bool, Boolean.FALSE)) {
            objectRef.f143742a = new OrderResponseHolder(orderResponseHolder.getFullOrderDetails(), null, 2, null);
        }
        if (orderDetail != null) {
            es.K k10 = es.K.f130659a;
            OrderDetail orderDetail2 = l10.fetchedOrder;
            if (orderDetail2 == null) {
                Intrinsics.x("fetchedOrder");
                orderDetail2 = null;
            }
            if (k10.f(orderDetail2)) {
                C15809k.d(androidx.view.d0.a(l10), null, null, l10.new t(orderDetail, objectRef, null), 3, null);
            }
        }
        l10.P0((OrderResponseHolder) objectRef.f143742a, orderRewardPointsForOrderResponse);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V0() {
        OrderDetailsViewState value;
        InterfaceC16549B<OrderDetailsViewState> interfaceC16549B = this._orderDetailsViewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, OrderDetailsViewState.b(value, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, 33554430, null)));
    }

    private final void W0() {
        OrderDetailsViewState value;
        OrderDetailsViewState orderDetailsViewState;
        ArrayList arrayList;
        InterfaceC16549B<OrderDetailsViewState> interfaceC16549B = this._orderDetailsViewState;
        do {
            value = interfaceC16549B.getValue();
            orderDetailsViewState = value;
            List<OrderSubstitutionItem> list = this.listSubstitutedItems;
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.e(((OrderSubstitutionItem) obj).getCustomerSubstitutionPreference(), "ACCEPTED")) {
                    arrayList.add(obj);
                }
            }
        } while (!interfaceC16549B.e(value, OrderDetailsViewState.b(orderDetailsViewState, false, null, null, null, null, null, null, new UIEvent(new g.OrderSummaryEvent(arrayList, CollectionsKt.P0(this.listOutOfStockItems, this.listRejectedSubstitutedItems))), null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, 33554302, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X0() {
        OrderDetailsViewState value;
        InterfaceC16549B<OrderDetailsViewState> interfaceC16549B = this._orderDetailsViewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, OrderDetailsViewState.b(value, false, null, null, null, null, null, null, new UIEvent(g.j.f160968c), null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, 33554303, null)));
    }

    private final void Y0() {
        OrderDetailsViewState value;
        OrderDetail orderDetail = this.fetchedOrder;
        Object obj = null;
        if (orderDetail == null) {
            Intrinsics.x("fetchedOrder");
            orderDetail = null;
        }
        Builder builderG0 = orderDetail.g0();
        Iterator<T> it = this.orderDetailsViewState.getValue().h().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((AbstractC13866b) next) instanceof OrderDetailShopperInfoDecorator) {
                obj = next;
                break;
            }
        }
        Intrinsics.h(obj, "null cannot be cast to non-null type com.meijer.mobile.meijer.activity.orders.decorators.OrderDetailShopperInfoDecorator");
        EnumC17276a enumC17276aD = ((OrderDetailShopperInfoDecorator) obj).d();
        InterfaceC16549B<OrderDetailsViewState> interfaceC16549B = this._orderDetailsViewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, OrderDetailsViewState.b(value, false, null, null, null, null, null, null, new UIEvent(new g.RateShopperEvent(builderG0, enumC17276aD)), null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, 33554302, null)));
    }

    private final void Z0(vo.b substitutionScreenType, boolean isOnMyWayClicked, String orderType) {
        OrderDetailsViewState value;
        OrderDetailsViewState orderDetailsViewState;
        this.flyBuyManager.c0(this.listSubstitutedItems);
        InterfaceC16549B<OrderDetailsViewState> interfaceC16549B = this._orderDetailsViewState;
        do {
            value = interfaceC16549B.getValue();
            orderDetailsViewState = value;
        } while (!interfaceC16549B.e(value, OrderDetailsViewState.b(orderDetailsViewState, false, null, null, null, null, null, null, new UIEvent(new g.OrderSubstitutionEvent(this.listSubstitutedItems, substitutionScreenType, isOnMyWayClicked, orderType, orderDetailsViewState.getPickupPersonName(), this.listOutOfStockItems)), null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, 33554303, null)));
    }

    static /* synthetic */ void a1(L l10, vo.b bVar, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        l10.Z0(bVar, z10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b1(FlyBuyState flyBuyState) {
        OrderDetailsViewState value;
        InterfaceC16549B<OrderDetailsViewState> interfaceC16549B = this._orderDetailsViewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, OrderDetailsViewState.b(value, false, null, null, null, null, null, null, null, null, null, null, null, flyBuyState, null, null, null, null, null, false, false, false, false, null, null, null, 33550335, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c1() {
        OrderDetailsViewState value;
        AbstractC6392a.Companion companion;
        InterfaceC16549B<OrderDetailsViewState> interfaceC16549B = this._orderDetailsViewState;
        do {
            value = interfaceC16549B.getValue();
            companion = AbstractC6392a.INSTANCE;
        } while (!interfaceC16549B.e(value, OrderDetailsViewState.b(value, false, null, null, null, null, null, null, new UIEvent(new g.CancelOrderSuccessDialogEvent(new DialogEvent(companion.d(com.meijer.mobile.meijer.Y.f101270x0, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f101250w0, new Object[0]), companion.d(yr.Q.f171761b, new Object[0]), null, null, 24, null))), null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, 33554302, null)));
    }

    private final void d1() {
        OrderDetailsViewState value;
        AbstractC6392a.Companion companion;
        InterfaceC16549B<OrderDetailsViewState> interfaceC16549B = this._orderDetailsViewState;
        do {
            value = interfaceC16549B.getValue();
            companion = AbstractC6392a.INSTANCE;
        } while (!interfaceC16549B.e(value, OrderDetailsViewState.b(value, false, null, null, null, null, null, null, new UIEvent(new g.CancelOrderWarningDialogEvent(new DialogEvent(companion.d(com.meijer.mobile.meijer.Y.f101230v0, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f101210u0, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f101190t0, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f100999j9, new Object[0]), null, 16, null))), null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, 33554302, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e1() {
        OrderDetailsViewState value;
        AbstractC6392a.Companion companion;
        InterfaceC16549B<OrderDetailsViewState> interfaceC16549B = this._orderDetailsViewState;
        do {
            value = interfaceC16549B.getValue();
            companion = AbstractC6392a.INSTANCE;
        } while (!interfaceC16549B.e(value, OrderDetailsViewState.b(value, false, null, null, null, null, null, null, new UIEvent(new g.FailureDialogEvent(new DialogEvent(companion.d(com.meijer.mobile.meijer.Y.f100725V9, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f100706U9, new Object[0]), companion.d(yr.Q.f171761b, new Object[0]), null, null, 24, null))), null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, 33554302, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f1() {
        OrderDetailsViewState value;
        InterfaceC16549B<OrderDetailsViewState> interfaceC16549B = this._orderDetailsViewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, OrderDetailsViewState.b(value, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, 33554430, null)));
    }

    private final void g1() {
        OrderDetailsViewState value;
        AbstractC6392a.Companion companion;
        InterfaceC16549B<OrderDetailsViewState> interfaceC16549B = this._orderDetailsViewState;
        do {
            value = interfaceC16549B.getValue();
            companion = AbstractC6392a.INSTANCE;
        } while (!interfaceC16549B.e(value, OrderDetailsViewState.b(value, false, null, null, null, null, null, null, new UIEvent(new g.MultiOrderUnderModificationDialogEvent(new DialogEvent(companion.d(com.meijer.mobile.meijer.Y.f100782Y9, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f100763X9, new Object[0]), companion.d(yr.Q.f171761b, new Object[0]), null, null, 24, null))), null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, 33554302, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h1() {
        OrderDetailsViewState value;
        AbstractC6392a.Companion companion;
        InterfaceC16549B<OrderDetailsViewState> interfaceC16549B = this._orderDetailsViewState;
        do {
            value = interfaceC16549B.getValue();
            companion = AbstractC6392a.INSTANCE;
        } while (!interfaceC16549B.e(value, OrderDetailsViewState.b(value, false, null, null, null, null, null, null, new UIEvent(new g.OrderNotCancelableDialogEvent(new DialogEvent(companion.d(com.meijer.mobile.meijer.Y.f100901ea, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f100881da, new Object[0]), companion.d(yr.Q.f171761b, new Object[0]), null, null, 24, null))), null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, 33554302, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i1() {
        OrderDetailsViewState value;
        AbstractC6392a.Companion companion;
        InterfaceC16549B<OrderDetailsViewState> interfaceC16549B = this._orderDetailsViewState;
        do {
            value = interfaceC16549B.getValue();
            companion = AbstractC6392a.INSTANCE;
        } while (!interfaceC16549B.e(value, OrderDetailsViewState.b(value, false, null, null, null, null, null, null, new UIEvent(new g.OrderNotEditableDialogEvent(new DialogEvent(companion.d(com.meijer.mobile.meijer.Y.f100498Ja, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f100479Ia, new Object[0]), companion.d(yr.Q.f171761b, new Object[0]), null, null, 24, null))), null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, 33554302, null)));
    }

    private final void j1() {
        OrderDetailsViewState value;
        AbstractC6392a.Companion companion;
        InterfaceC16549B<OrderDetailsViewState> interfaceC16549B = this._orderDetailsViewState;
        do {
            value = interfaceC16549B.getValue();
            companion = AbstractC6392a.INSTANCE;
        } while (!interfaceC16549B.e(value, OrderDetailsViewState.b(value, false, null, null, null, null, null, null, new UIEvent(new g.OrderUnderModificationNotCancelableDialogEvent(new DialogEvent(companion.d(com.meijer.mobile.meijer.Y.f101141qb, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f101121pb, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f100627Q6, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f101313z3, new Object[0]), null, 16, null))), null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, 33554302, null)));
    }

    private final void k1() {
        OrderDetailsViewState value;
        AbstractC6392a.Companion companion;
        InterfaceC16549B<OrderDetailsViewState> interfaceC16549B = this._orderDetailsViewState;
        do {
            value = interfaceC16549B.getValue();
            companion = AbstractC6392a.INSTANCE;
        } while (!interfaceC16549B.e(value, OrderDetailsViewState.b(value, false, null, null, null, null, null, null, new UIEvent(new g.ReplaceCurrentCartWarningDialogEvent(new DialogEvent(companion.d(com.meijer.mobile.meijer.Y.f100941ga, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f100921fa, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f100622Q1, new Object[0]), companion.d(Cj.o.f5084r, new Object[0]), null, 16, null))), null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, null, 33554302, null)));
    }

    private final void l1(List<ProductFullDetails> productsDetailList, boolean isRejectedItem) {
        if (isRejectedItem) {
            this.listRejectedSubstitutedItems.clear();
            if (productsDetailList != null) {
                for (ProductFullDetails productFullDetails : productsDetailList) {
                    this.listRejectedSubstitutedItems.add(new OrderOutOfStockItem(null, productFullDetails.getName(), productFullDetails.j(), productFullDetails.getQtyIncrement(), productFullDetails.getPrice(), productFullDetails, 1, null));
                }
                return;
            }
            return;
        }
        this.listOutOfStockItems.clear();
        if (productsDetailList != null) {
            for (ProductFullDetails productFullDetails2 : productsDetailList) {
                this.listOutOfStockItems.add(new OrderOutOfStockItem(null, productFullDetails2.getName(), productFullDetails2.j(), productFullDetails2.getQtyIncrement(), productFullDetails2.getPrice(), productFullDetails2, 1, null));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m1(List<ProductFullDetails> productDetailsList) {
        this.productDetailsList = productDetailsList;
        this.listSubstitutedItems.clear();
        List<FetchSubstitutedProducts> list = this.listUPCItems;
        List<OrderSubstitutionItem> list2 = this.listSubstitutedItems;
        for (FetchSubstitutedProducts fetchSubstitutedProducts : list) {
            OrderDetail orderDetail = this.fetchedOrder;
            if (orderDetail == null) {
                Intrinsics.x("fetchedOrder");
                orderDetail = null;
            }
            list2.add(M.a(fetchSubstitutedProducts, orderDetail, productDetailsList == null ? CollectionsKt.m() : productDetailsList));
        }
    }

    private final List<AbstractC13866b> n0(OrderDetail orderDetails, FlyBuyOrderDetail.FlyBuyOrder flyBuyOrder, OrderRewardPointsForOrderResponse mperksPointsBySale) {
        OrderDetailStatusDecorator.Companion companion = OrderDetailStatusDecorator.INSTANCE;
        OrderSubstitutionsDetailBannerDecorator.Companion companion2 = OrderSubstitutionsDetailBannerDecorator.INSTANCE;
        C14782d c14782d = C14782d.f138348a;
        OrderDetail orderDetail = this.fetchedOrder;
        if (orderDetail == null) {
            Intrinsics.x("fetchedOrder");
            orderDetail = null;
        }
        return CollectionsKt.s(companion.a(orderDetails, flyBuyOrder, mperksPointsBySale, companion2.a(c14782d.c(orderDetail, this.fetchedOrderWithSubstitution), c14782d.b(this.fetchedOrderWithSubstitution), this.shouldShowBannerWithFlyBuy, c14782d.a(this.fetchedOrderWithSubstitution, this.listOutOfStockItems))), OrderHeaderDecorator.INSTANCE.a(orderDetails), OrderDetailStatusDayDateTimeDecorator.Companion.b(OrderDetailStatusDayDateTimeDecorator.INSTANCE, orderDetails, false, 2, null), OrderDetailAddressDecorator.INSTANCE.a(orderDetails), OrderDetailOrderedItemsDecorator.INSTANCE.a(orderDetails), OrderDetailContactNumberDecorator.INSTANCE.a(orderDetails), OrderDetailShopperInfoDecorator.INSTANCE.a(orderDetails), OrderDetailWhatsNextDecorator.INSTANCE.a(orderDetails), OrderDetailPaymentDecorator.INSTANCE.c(orderDetails), OrderDetailSummaryDecorator.INSTANCE.b(orderDetails, this.featureManager.e(AbstractC18503f.C18524v.f172908h), this.featureManager.e(AbstractC18503f.C18528z.f172916h), this.featureManager.e(AbstractC18503f.f0.f172877h)), OrderDetailEditOrderDecorator.INSTANCE.a(orderDetails));
    }

    private final void n1(final OrderDetail orderDetails) {
        FlyBuyState flyBuyState = this._orderDetailsViewState.getValue().getFlyBuyState();
        if (flyBuyState != null && flyBuyState.getIsOrderDetailSubstitutionTrackStateEnabled()) {
            this.analyticsEngine.k(Kn.n.f17594a.K(C0()));
            this.flyBuyManager.t0(false);
            return;
        }
        OrderDetail orderDetail = this.fetchedOrder;
        if (orderDetail == null) {
            Intrinsics.x("fetchedOrder");
            orderDetail = null;
        }
        final FlyBuyState flyBuyState2 = new FlyBuyState(null, orderDetail, null, false, null, false, false, false, false, false, false, null, null, null, 16381, null);
        com.adobe.marketing.mobile.r.d(new InterfaceC6543a() { // from class: sn.E
            @Override // com.adobe.marketing.mobile.InterfaceC6543a
            public final void a(Object obj) {
                L.o1(this.f160882a, orderDetails, flyBuyState2, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o1(final L l10, final OrderDetail orderDetail, final FlyBuyState flyBuyState, final String str) {
        l10.analyticsEngine.b(C14756c.h("Meijer:Order Details Page"), new Function1() { // from class: sn.G
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return L.p1(orderDetail, str, l10, flyBuyState, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p1(OrderDetail orderDetail, String str, L l10, FlyBuyState flyBuyState, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("orderDetailsOrderNumber", orderDetail.getCode());
        track.h("orderDetailsOrderStatus", orderDetail.getOrderStatus().name());
        if (str == null) {
            str = "";
        }
        track.h("mcid", str);
        track.h("siteSection", "Order History");
        track.p(l10.previousTrackAction);
        C16929a c16929a = C16929a.f159600a;
        track.h("timeslotSelected", c16929a.t(flyBuyState));
        track.h("pickupDate", c16929a.k(flyBuyState));
        track.h("phoneNumber", c16929a.j(flyBuyState));
        track.h("pickupStore", c16929a.l(flyBuyState));
        if (flyBuyState.getIsBopasTimeSlot()) {
            OrderDetail currentOrderDetails = flyBuyState.getCurrentOrderDetails();
            if ((currentOrderDetails != null ? currentOrderDetails.getOrderStatus() : null) == hj.f.f135699p) {
                track.h("bopasOrderCanceledByStore", "true");
            }
        }
        return Unit.f143329a;
    }

    private final void q0(boolean isParkingSpotButtonShowed, boolean hasFlyBuyOrderData) {
        this.shouldShowBannerWithFlyBuy = (hasFlyBuyOrderData && isParkingSpotButtonShowed) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q1() {
        OrderDetail orderDetail = this.fetchedOrder;
        if (orderDetail == null) {
            Intrinsics.x("fetchedOrder");
            orderDetail = null;
        }
        List<Entry> listU = orderDetail.u();
        final ArrayList arrayList = new ArrayList(CollectionsKt.x(listU, 10));
        for (Entry entry : listU) {
            arrayList.add(new W.Details(entry.m().getCode(), null, null, Double.valueOf(entry.getActualQuantity()), Double.valueOf(entry.m().getPrice().getValue()), null, entry.m().getDepartment(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -90, 16383, null));
        }
        this.analyticsEngine.b(C14756c.h("Meijer:Order Details Page"), new Function1() { // from class: sn.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return L.r1(this.f161542a, arrayList, (TrackingData) obj);
            }
        });
    }

    private final AnticipateOvershootInterpolator r0() {
        return new AnticipateOvershootInterpolator(1.0f, 3.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r1(L l10, List list, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("trackAction", "Cancel Order");
        OrderDetail orderDetail = l10.fetchedOrder;
        if (orderDetail == null) {
            Intrinsics.x("fetchedOrder");
            orderDetail = null;
        }
        track.h("purchaseID", orderDetail.getCode());
        track.e(Ao.W.j(list));
        return Unit.f143329a;
    }

    @SuppressLint({"DefaultLocale"})
    private final void s1(DeliveryMode deliveryMode, String orderId, String pickupPersonName) {
        OrderDetailsViewState value;
        OrderDetailsViewState orderDetailsViewState;
        String strValueOf;
        String strValueOf2;
        InterfaceC16549B<OrderDetailsViewState> interfaceC16549B = this._orderDetailsViewState;
        do {
            value = interfaceC16549B.getValue();
            orderDetailsViewState = value;
            strValueOf = String.valueOf(deliveryMode.getCode());
            if (strValueOf.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                char cCharAt = strValueOf.charAt(0);
                if (Character.isLowerCase(cCharAt)) {
                    Locale locale = Locale.getDefault();
                    Intrinsics.i(locale, "getDefault(...)");
                    strValueOf2 = CharsKt.e(cCharAt, locale);
                } else {
                    strValueOf2 = String.valueOf(cCharAt);
                }
                sb2.append((Object) strValueOf2);
                String strSubstring = strValueOf.substring(1);
                Intrinsics.i(strSubstring, "substring(...)");
                sb2.append(strSubstring);
                strValueOf = sb2.toString();
            }
        } while (!interfaceC16549B.e(value, OrderDetailsViewState.b(orderDetailsViewState, false, strValueOf, orderId, null, null, null, null, null, null, null, null, pickupPersonName, null, null, null, null, null, null, false, false, false, false, null, null, null, 33552377, null)));
    }

    private final void t0() {
        com.adobe.marketing.mobile.r.d(new InterfaceC6543a() { // from class: sn.D
            @Override // com.adobe.marketing.mobile.InterfaceC6543a
            public final void a(Object obj) {
                L.u0(this.f160881a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(L l10, final String str) {
        l10.analyticsEngine.b(C14756c.h("Meijer:Order Details Page"), new Function1() { // from class: sn.F
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return L.v0(str, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v0(String str, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        Intrinsics.g(str);
        track.h("mcid", str);
        track.h("errorDisplayingOrderDetail", "1");
        track.h("siteSection", "Order History");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y0(java.lang.String r6, im.OrderResponseHolder r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof sn.L.o
            if (r0 == 0) goto L13
            r0 = r8
            sn.L$o r0 = (sn.L.o) r0
            int r1 = r0.f161093g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f161093g = r1
            goto L18
        L13:
            sn.L$o r0 = new sn.L$o
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f161091e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f161093g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 != r4) goto L39
            java.lang.Object r6 = r0.f161089c
            sn.L r6 = (sn.L) r6
            java.lang.Object r6 = r0.f161088b
            r7 = r6
            im.b r7 = (im.OrderResponseHolder) r7
            java.lang.Object r6 = r0.f161087a
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L37
            goto L59
        L37:
            r6 = move-exception
            goto L60
        L39:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L41:
            kotlin.ResultKt.b(r8)
            kotlin.Result$Companion r8 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L37
            com.meijer.mobile.digitalshopping.api.orders.a r8 = r5.ordersRepository     // Catch: java.lang.Throwable -> L37
            r0.f161087a = r6     // Catch: java.lang.Throwable -> L37
            r0.f161088b = r7     // Catch: java.lang.Throwable -> L37
            r0.f161089c = r5     // Catch: java.lang.Throwable -> L37
            r0.f161090d = r3     // Catch: java.lang.Throwable -> L37
            r0.f161093g = r4     // Catch: java.lang.Throwable -> L37
            java.lang.Object r8 = r8.x(r6, r0)     // Catch: java.lang.Throwable -> L37
            if (r8 != r1) goto L59
            return r1
        L59:
            xl.a r8 = (xl.OrderSubstitutionsDetail) r8     // Catch: java.lang.Throwable -> L37
            java.lang.Object r6 = kotlin.Result.b(r8)     // Catch: java.lang.Throwable -> L37
            goto L6a
        L60:
            kotlin.Result$Companion r8 = kotlin.Result.INSTANCE
            java.lang.Object r6 = kotlin.ResultKt.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
        L6a:
            boolean r8 = kotlin.Result.h(r6)
            if (r8 == 0) goto L7d
            r8 = r6
            xl.a r8 = (xl.OrderSubstitutionsDetail) r8
            r5.fetchedOrderWithSubstitution = r8
            r8 = 2
            r1 = 0
            Q0(r5, r7, r1, r8, r1)
            r5.B0()
        L7d:
            java.lang.Throwable r6 = kotlin.Result.e(r6)
            if (r6 == 0) goto L99
            kotlin.coroutines.CoroutineContext r7 = r0.getContext()
            mv.E0.i(r7)
            boolean r7 = r6 instanceof java.lang.Error
            if (r7 != 0) goto L98
            qw.a$a r7 = qw.a.INSTANCE
            java.lang.String r8 = "Fetch order substitution failed"
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r7.f(r6, r8, r0)
            goto L99
        L98:
            throw r6
        L99:
            kotlin.Unit r6 = kotlin.Unit.f143329a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sn.L.y0(java.lang.String, im.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z0(StoreInfo storeInfo) {
        OrderDetailsViewState value;
        InterfaceC16549B<OrderDetailsViewState> interfaceC16549B = this._orderDetailsViewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, OrderDetailsViewState.b(value, false, null, null, null, null, null, null, null, null, null, null, null, null, null, C14543b.a(storeInfo), null, null, null, false, false, false, false, null, null, null, 33538047, null)));
    }

    public final pv.P<OrderDetailsViewState> E0() {
        return this.orderDetailsViewState;
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x02e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M0(sn.L.f r37) {
        /*
            Method dump skipped, instructions count: 1334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sn.L.M0(sn.L$f):void");
    }

    private final void A0(int storeId) {
        C15809k.d(androidx.view.d0.a(this), null, null, new p(storeId, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(L l10, Integer num) {
        Intrinsics.g(num);
        l10.currentCartSize = num.intValue();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void F0(List<String> listUPCSubstitutedItems) {
        C15809k.d(androidx.view.d0.a(this), null, null, new q(listUPCSubstitutedItems, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void G0(String shortCode) {
        C15809k.d(androidx.view.d0.a(this), null, null, new r(shortCode, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(L l10, uk.c cVar) {
        String originalOrderId;
        ShoppingCart shoppingCart = (ShoppingCart) cVar.a();
        if (shoppingCart != null) {
            originalOrderId = shoppingCart.getOriginalOrderId();
        } else {
            originalOrderId = null;
        }
        l10.currentCartOriginalOrderId = originalOrderId;
        return Unit.f143329a;
    }

    private static final void J0(L l10, boolean z10) {
        l10.H0();
        Unit unit = Unit.f143329a;
        if (!z10) {
            unit = null;
        }
        if (unit == null) {
            l10.L0("check_in");
        }
    }

    private final void K0() {
        C15809k.d(androidx.view.d0.a(this), null, null, new s(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void S0(final OrderResponseHolder orderResponseHolder, final OrderRewardPointsForOrderResponse mperksPointsBySaleResponse) throws Exception {
        OrderDetail fullOrderDetails = orderResponseHolder.getFullOrderDetails();
        if (fullOrderDetails != null) {
            PointOfService pointOfService = fullOrderDetails.getPointOfService();
            if (pointOfService != null) {
                A0(pointOfService.getStoreId());
            }
            n1(fullOrderDetails);
        } else {
            fullOrderDetails = null;
        }
        final OrderDetail orderDetail = fullOrderDetails;
        FlyBuyOrderDetail flyBuyResponse = orderResponseHolder.getFlyBuyResponse();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f143742a = orderResponseHolder;
        this.flyBuyManager.N(orderDetail, flyBuyResponse, new Function1() { // from class: sn.C
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return L.U0(objectRef, orderResponseHolder, orderDetail, this, mperksPointsBySaleResponse, (Boolean) obj);
            }
        });
    }

    private final void m0() {
        C15809k.d(androidx.view.d0.a(this), null, null, new i(null), 3, null);
    }

    private final void o0() {
        C15809k.d(androidx.view.d0.a(this), null, null, new j(null), 3, null);
    }

    private final void p0() {
        C15809k.d(androidx.view.d0.a(this), null, null, new k(null), 3, null);
    }

    private final void s0() {
        C15809k.d(androidx.view.d0.a(this), null, null, new l(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w0(String orderId) {
        C15809k.d(androidx.view.d0.a(this), null, null, new m(orderId, null), 3, null);
    }

    private final void x0(String orderId) {
        C15809k.d(androidx.view.d0.a(this), null, null, new n(orderId, null), 3, null);
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        super.onCleared();
        this.compositeDisposable.d();
    }
}
