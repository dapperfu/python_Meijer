package Hn;

import Co.ProductFullDetails;
import Ds.n;
import Fq.FavoriteListItem;
import Fq.ShoppingListItem;
import Hn.g0;
import Js.WeeklyAdItem;
import Pk.Coupon;
import com.meijer.mobile.core.design.widget.howTo.WalkThroughType;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.coupon.model.search.CouponsSortType;
import com.meijer.mobile.coupons.api.models.CouponsRequest;
import com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListItemDialogFragment;
import com.meijer.mobile.meijer.activity.shoppinglist.view.BaseShoppingListView;
import com.meijer.mobile.widget.WalkThroughView;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import dl.C13702d;
import el.CouponsResponse;
import ev.C13889a;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mv.AbstractC15779K;
import mv.InterfaceC15783O;
import um.AbstractC17446a;
import um.InterfaceC17447b;
import vm.C17693b;
import yo.C18335a;

@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0006\u009e\u0001\u009f\u0001 \u0001B_\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u001b\u0010/\u001a\u00020\u001e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u001eH\u0016¢\u0006\u0004\b1\u00102J\u0011\u00104\u001a\u0004\u0018\u000103H\u0014¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u001eH\u0016¢\u0006\u0004\b6\u00102J\r\u00107\u001a\u00020\u001e¢\u0006\u0004\b7\u00102J\u000f\u00108\u001a\u00020\u001eH\u0016¢\u0006\u0004\b8\u00102J\r\u00109\u001a\u00020\u001e¢\u0006\u0004\b9\u00102J\u0015\u0010;\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020!¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020=H\u0007¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u001eH\u0016¢\u0006\u0004\bA\u00102J\u0017\u0010B\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\bB\u0010 J\u000f\u0010C\u001a\u00020\u001eH\u0016¢\u0006\u0004\bC\u00102J\u0017\u0010D\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\bD\u0010 J\u0017\u0010E\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\bE\u0010 J\u0017\u0010F\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\bF\u0010 J\u0017\u0010G\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\bG\u0010 J\u0017\u0010H\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\bH\u0010 J\u000f\u0010I\u001a\u00020\u001eH\u0016¢\u0006\u0004\bI\u00102J\u001f\u0010L\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u001eH\u0016¢\u0006\u0004\bN\u00102J!\u0010Q\u001a\u00020\u001e2\u0006\u0010O\u001a\u00020\u00062\b\u0010P\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bQ\u0010RJ'\u0010W\u001a\u00020\u001e2\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020!2\u0006\u0010V\u001a\u00020!H\u0016¢\u0006\u0004\bW\u0010XJ\u0017\u0010Z\u001a\u00020\u001e2\u0006\u0010Y\u001a\u00020$H\u0016¢\u0006\u0004\bZ\u0010'J\u0017\u0010[\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b[\u0010 J\u0017\u0010\\\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\\\u0010 J\u0017\u0010]\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b]\u0010 J\u0017\u0010^\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b^\u0010 J\u0017\u0010a\u001a\u00020\u001e2\u0006\u0010`\u001a\u00020_H\u0016¢\u0006\u0004\ba\u0010bJ\u0017\u0010c\u001a\u00020\u001e2\u0006\u0010`\u001a\u00020_H\u0016¢\u0006\u0004\bc\u0010bJ\u0017\u0010d\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\bd\u0010 J\u000f\u0010e\u001a\u00020\u001eH\u0016¢\u0006\u0004\be\u00102J\u001f\u0010f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bf\u0010MJ\u0019\u0010g\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bg\u0010 J\u0015\u0010h\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\bh\u0010 J\u0017\u0010k\u001a\u00020j2\u0006\u0010i\u001a\u00020JH\u0000¢\u0006\u0004\bk\u0010lR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010uR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010xR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010yR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u001a\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020_0|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u001b\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010~R \u0010\u0082\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0081\u0001\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010~R\u0018\u0010\u0084\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010^R)\u0010\u0089\u0001\u001a\u00020!2\u0007\u0010\u0085\u0001\u001a\u00020!8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010#R\u0018\u0010\u008a\u0001\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bW\u0010\u0087\u0001R\u0019\u0010\u008c\u0001\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0087\u0001R\u0018\u0010\u008d\u0001\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\\\u0010\u0087\u0001R\u001e\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020-0|8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010~R0\u0010\u0097\u0001\u001a\u00030\u0090\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\be\u0010\u0091\u0001\u0012\u0005\b\u0096\u0001\u00102\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u0098\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0013\u0010\u009d\u0001\u001a\u00020!8F¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010#¨\u0006¡\u0001"}, d2 = {"LHn/g0;", "Lum/a;", "", "Lcom/meijer/mobile/widget/WalkThroughView$b;", "Lcom/meijer/mobile/meijer/activity/shoppinglist/ShoppingListItemDialogFragment$b;", "LDs/n$b;", "LFq/c;", "Lvm/b;", "appBackgroundManager", "Lhi/a;", "analyticsEngine", "Lyo/a;", "appPrefManager", "Lnk/f;", "productToShow", "LPk/c;", "couponToShow", "LJs/b;", "weeklyAdToShow", "LEq/b;", "shoppingListRepository", "LEq/a;", "favoriteListRepository", "Ldl/d;", "couponsRepository", "Lmv/K;", "ioDispatcher", "<init>", "(Lvm/b;Lhi/a;Lyo/a;Lnk/f;LPk/c;LJs/b;LEq/b;LEq/a;Ldl/d;Lmv/K;)V", "item", "", "I1", "(LFq/c;)V", "", "s3", "()Z", "", "offerId", "N3", "(J)V", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "exception", "C2", "(Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;)V", "", "LCo/h;", "products", "f2", "(Ljava/util/List;)V", "Q", "()V", "LHn/g0$a;", "S1", "()LHn/g0$a;", "S", "r3", "P", "U2", "justCompleted", "i2", "(Z)V", "Lel/a;", "data", "E", "(Lel/a;)V", "onScan", "h", "F0", "j3", "F2", "m3", "k3", "h3", "h2", "", "position", "R2", "(LFq/c;I)V", "E2", "itemToMove", "itemBelow", "M2", "(LFq/c;LFq/c;)V", "Lcom/meijer/mobile/core/design/widget/howTo/WalkThroughType;", "type", "isComplete", "forceShow", "r", "(Lcom/meijer/mobile/core/design/widget/howTo/WalkThroughType;ZZ)V", "couponId", "n", "L", "t", "x", "J", "LFq/a;", "favoriteItem", "k", "(LFq/a;)V", "o", "j", "v", "q3", "p3", "S2", "countOfCouponsOrShoppingItems", "", "P1", "(I)Ljava/lang/String;", "d", "Lhi/a;", "e", "Lyo/a;", "f", "Lnk/f;", "g", "LPk/c;", "LJs/b;", "i", "LEq/b;", "LEq/a;", "Ldl/d;", "l", "Lmv/K;", "", "m", "Ljava/util/List;", "favoriteListItems", "shoppingListItems", "LPk/a;", "clippedOffersList", "p", "pendingOfferId", "value", "q", "Z", "U1", "isFetchingShoppingList", "isAddingShoppingListItemsList", "s", "isFetchingClippedCoupons", "itemDetailsEnabled", "u", "pendingProductsToAdd", "LDs/k;", "LDs/k;", "getItemDetailsOpeningThrottle", "()LDs/k;", "setItemDetailsOpeningThrottle", "(LDs/k;)V", "getItemDetailsOpeningThrottle$annotations", "itemDetailsOpeningThrottle", "LJu/a;", "w", "LJu/a;", "disposables", "V1", "isFetchingShoppingListAndFavorites", "c", "a", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class g0 extends AbstractC17446a implements BaseShoppingListView.a, WalkThroughView.b, ShoppingListItemDialogFragment.b, n.b<ShoppingListItem> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C18335a appPrefManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private nk.f productToShow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Pk.c couponToShow;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private WeeklyAdItem weeklyAdToShow;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Eq.b shoppingListRepository;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Eq.a favoriteListRepository;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final C13702d couponsRepository;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final List<FavoriteListItem> favoriteListItems;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final List<ShoppingListItem> shoppingListItems;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private List<Coupon> clippedOffersList;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private long pendingOfferId;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean isFetchingShoppingList;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean isAddingShoppingListItemsList;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean isFetchingClippedCoupons;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean itemDetailsEnabled;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private List<ProductFullDetails> pendingProductsToAdd;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Ds.k itemDetailsOpeningThrottle;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J%\u0010\u000b\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H&¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0002H&¢\u0006\u0004\b\u001a\u0010\u0004J\u001f\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u001b\u0010\u0017J\u000f\u0010\u001c\u001a\u00020\u0002H&¢\u0006\u0004\b\u001c\u0010\u0004J\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0014H&¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010!\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006H&¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0002H&¢\u0006\u0004\b#\u0010\u0004J\u0017\u0010&\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H&¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0014H&¢\u0006\u0004\b)\u0010\u001fJ\u0017\u0010,\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H&¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0007H&¢\u0006\u0004\b.\u0010/J\u0019\u00101\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u000100H&¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0007H&¢\u0006\u0004\b3\u0010/J\u0017\u00104\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0007H&¢\u0006\u0004\b4\u0010/J\u0017\u00105\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0007H&¢\u0006\u0004\b5\u0010/J\u0017\u00106\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0007H&¢\u0006\u0004\b6\u0010/J\u000f\u00107\u001a\u00020\u0002H&¢\u0006\u0004\b7\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00068À\u0006\u0001"}, d2 = {"LHn/g0$a;", "Lum/b;", "", "onScan", "()V", "R0", "", "LFq/c;", "shoppingList", "", "itemDetailsEnabled", "r", "(Ljava/util/List;Z)V", "t", "(Z)V", "LFq/a;", "favoriteListItems", "s", "(Ljava/util/List;)V", "item", "", "position", "I0", "(LFq/c;I)V", "B0", "T0", "J", "Z0", "z", "errorResId", "y0", "(I)V", "favoritesList", "c", "(LFq/c;Ljava/util/List;)V", "f1", "LPk/a;", "coupon", "q", "(LPk/a;)V", "listingId", "m", "Lnk/f;", "productIdentity", "g", "(Lnk/f;)V", "G0", "(LFq/c;)V", "", "P", "(Ljava/lang/String;)V", "T", "O0", "q0", "W", "v", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a extends InterfaceC17447b {
        void B0();

        void G0(ShoppingListItem item);

        void I0(ShoppingListItem item, int position);

        void J();

        void O0(ShoppingListItem item);

        void P(String shoppingList);

        void R0();

        void T(ShoppingListItem item);

        void T0();

        void W(ShoppingListItem item);

        void Z0(ShoppingListItem item, int position);

        void c(ShoppingListItem item, List<FavoriteListItem> favoritesList);

        void f1();

        void g(nk.f productIdentity);

        void m(int listingId);

        void onScan();

        void q(Coupon coupon);

        void q0(ShoppingListItem item);

        void r(List<ShoppingListItem> shoppingList, boolean itemDetailsEnabled);

        void s(List<FavoriteListItem> favoriteListItems);

        void t(boolean itemDetailsEnabled);

        void v();

        void y0(int errorResId);

        void z();
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0017"}, d2 = {"LHn/g0$b;", "", "", "LFq/c;", "shoppingListItems", "LFq/a;", "favoriteListItems", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Hn.g0$b, reason: from toString */
    public static final /* data */ class ListsContainer {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ShoppingListItem> shoppingListItems;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<FavoriteListItem> favoriteListItems;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ListsContainer)) {
                return false;
            }
            ListsContainer listsContainer = (ListsContainer) other;
            return Intrinsics.e(this.shoppingListItems, listsContainer.shoppingListItems) && Intrinsics.e(this.favoriteListItems, listsContainer.favoriteListItems);
        }

        public ListsContainer(List<ShoppingListItem> shoppingListItems, List<FavoriteListItem> favoriteListItems) {
            Intrinsics.j(shoppingListItems, "shoppingListItems");
            Intrinsics.j(favoriteListItems, "favoriteListItems");
            this.shoppingListItems = shoppingListItems;
            this.favoriteListItems = favoriteListItems;
        }

        public final List<FavoriteListItem> a() {
            return this.favoriteListItems;
        }

        public final List<ShoppingListItem> b() {
            return this.shoppingListItems;
        }

        public int hashCode() {
            return (this.shoppingListItems.hashCode() * 31) + this.favoriteListItems.hashCode();
        }

        public String toString() {
            return "ListsContainer(shoppingListItems=" + this.shoppingListItems + ", favoriteListItems=" + this.favoriteListItems + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"LHn/g0$c;", "", "", "LFq/c;", "shoppingList", "", "F", "(Ljava/util/List;)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface c {
        void F(List<ShoppingListItem> shoppingList);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "LFq/c;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.shoppinglist.viewmodel.ShoppingListAuthenticatedViewModel$commitDelete$1", f = "ShoppingListAuthenticatedViewModel.kt", l = {225}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends ShoppingListItem>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f13789a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ShoppingListItem f13791c;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends ShoppingListItem>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<ShoppingListItem>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ShoppingListItem shoppingListItem, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f13791c = shoppingListItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g0.this.new d(this.f13791c, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<ShoppingListItem>> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f13789a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Eq.b bVar = g0.this.shoppingListRepository;
            ShoppingListItem shoppingListItem = this.f13791c;
            this.f13789a = 1;
            Object objN = bVar.n(shoppingListItem, this);
            if (objN == objF) {
                return objF;
            }
            return objN;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "LFq/c;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.shoppinglist.viewmodel.ShoppingListAuthenticatedViewModel$onAddItem$2", f = "ShoppingListAuthenticatedViewModel.kt", l = {HttpResponseStatus.ERROR_METHOD_NOT_ALLOWED}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends ShoppingListItem>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f13792a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ShoppingListItem f13794c;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends ShoppingListItem>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<ShoppingListItem>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ShoppingListItem shoppingListItem, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f13794c = shoppingListItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g0.this.new e(this.f13794c, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<ShoppingListItem>> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f13792a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Eq.b bVar = g0.this.shoppingListRepository;
            ShoppingListItem shoppingListItem = this.f13794c;
            this.f13792a = 1;
            Object objD = bVar.d(shoppingListItem, this);
            if (objD == objF) {
                return objF;
            }
            return objD;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "LFq/c;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.shoppinglist.viewmodel.ShoppingListAuthenticatedViewModel$onClearShoppingListConfirmed$1", f = "ShoppingListAuthenticatedViewModel.kt", l = {275, 277}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends ShoppingListItem>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f13795a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f13796b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g0 f13797c;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends ShoppingListItem>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<ShoppingListItem>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z10, g0 g0Var, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f13796b = z10;
            this.f13797c = g0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f13796b, this.f13797c, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<ShoppingListItem>> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        
            if (r5 == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
        
            if (r5 == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r4.f13795a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r5)
                goto L46
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.ResultKt.b(r5)
                goto L34
            L1e:
                kotlin.ResultKt.b(r5)
                boolean r5 = r4.f13796b
                if (r5 == 0) goto L37
                Hn.g0 r5 = r4.f13797c
                Eq.b r5 = Hn.g0.H1(r5)
                r4.f13795a = r3
                java.lang.Object r5 = r5.m(r4)
                if (r5 != r0) goto L34
                goto L45
            L34:
                java.util.List r5 = (java.util.List) r5
                return r5
            L37:
                Hn.g0 r5 = r4.f13797c
                Eq.b r5 = Hn.g0.H1(r5)
                r4.f13795a = r2
                java.lang.Object r5 = r5.l(r4)
                if (r5 != r0) goto L46
            L45:
                return r0
            L46:
                java.util.List r5 = (java.util.List) r5
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: Hn.g0.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "LFq/a;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.shoppinglist.viewmodel.ShoppingListAuthenticatedViewModel$onFavoriteAdded$1", f = "ShoppingListAuthenticatedViewModel.kt", l = {561}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends FavoriteListItem>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f13798a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FavoriteListItem f13800c;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends FavoriteListItem>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<FavoriteListItem>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(FavoriteListItem favoriteListItem, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f13800c = favoriteListItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g0.this.new g(this.f13800c, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<FavoriteListItem>> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f13798a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Eq.a aVar = g0.this.favoriteListRepository;
            FavoriteListItem favoriteListItem = this.f13800c;
            this.f13798a = 1;
            Object objC = aVar.c(favoriteListItem, this);
            if (objC == objF) {
                return objF;
            }
            return objC;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "LFq/a;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.shoppinglist.viewmodel.ShoppingListAuthenticatedViewModel$onFavoriteDeleted$1", f = "ShoppingListAuthenticatedViewModel.kt", l = {574}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends FavoriteListItem>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f13801a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FavoriteListItem f13803c;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends FavoriteListItem>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<FavoriteListItem>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(FavoriteListItem favoriteListItem, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f13803c = favoriteListItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g0.this.new h(this.f13803c, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<FavoriteListItem>> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f13801a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Eq.a aVar = g0.this.favoriteListRepository;
            FavoriteListItem favoriteListItem = this.f13803c;
            this.f13801a = 1;
            Object objI = aVar.i(favoriteListItem, this);
            if (objI == objF) {
                return objF;
            }
            return objI;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LFq/c;", "<anonymous>", "(Lmv/O;)LFq/c;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.shoppinglist.viewmodel.ShoppingListAuthenticatedViewModel$onItemCompletedChange$request$2", f = "ShoppingListAuthenticatedViewModel.kt", l = {451}, m = "invokeSuspend")
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super ShoppingListItem>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f13804a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ShoppingListItem f13806c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(ShoppingListItem shoppingListItem, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f13806c = shoppingListItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g0.this.new i(this.f13806c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super ShoppingListItem> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f13804a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Eq.b bVar = g0.this.shoppingListRepository;
            ShoppingListItem shoppingListItem = this.f13806c;
            this.f13804a = 1;
            Object objK = bVar.k(shoppingListItem, this);
            if (objK == objF) {
                return objF;
            }
            return objK;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LFq/c;", "<anonymous>", "(Lmv/O;)LFq/c;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.shoppinglist.viewmodel.ShoppingListAuthenticatedViewModel$onItemCompletedChange$request$3", f = "ShoppingListAuthenticatedViewModel.kt", l = {453}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super ShoppingListItem>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f13807a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ShoppingListItem f13809c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ShoppingListItem shoppingListItem, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f13809c = shoppingListItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g0.this.new j(this.f13809c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super ShoppingListItem> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f13807a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Eq.b bVar = g0.this.shoppingListRepository;
            ShoppingListItem shoppingListItem = this.f13809c;
            this.f13807a = 1;
            Object objJ = bVar.j(shoppingListItem, this);
            if (objJ == objF) {
                return objF;
            }
            return objJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "LFq/c;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.shoppinglist.viewmodel.ShoppingListAuthenticatedViewModel$onMoveInProgressItem$1", f = "ShoppingListAuthenticatedViewModel.kt", l = {519}, m = "invokeSuspend")
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends ShoppingListItem>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f13810a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ShoppingListItem f13812c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ShoppingListItem f13813d;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends ShoppingListItem>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<ShoppingListItem>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(ShoppingListItem shoppingListItem, ShoppingListItem shoppingListItem2, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f13812c = shoppingListItem;
            this.f13813d = shoppingListItem2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g0.this.new k(this.f13812c, this.f13813d, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<ShoppingListItem>> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f13810a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Eq.b bVar = g0.this.shoppingListRepository;
            ShoppingListItem shoppingListItem = this.f13812c;
            ShoppingListItem shoppingListItem2 = this.f13813d;
            this.f13810a = 1;
            Object objQ = bVar.q(shoppingListItem, shoppingListItem2, this);
            if (objQ == objF) {
                return objF;
            }
            return objQ;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "LFq/c;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.shoppinglist.viewmodel.ShoppingListAuthenticatedViewModel$onShareListTapped$1", f = "ShoppingListAuthenticatedViewModel.kt", l = {248}, m = "invokeSuspend")
    static final class l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends ShoppingListItem>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f13814a;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends ShoppingListItem>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<ShoppingListItem>>) continuation);
        }

        l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g0.this.new l(continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<ShoppingListItem>> continuation) {
            return ((l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f13814a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Eq.b bVar = g0.this.shoppingListRepository;
            this.f13814a = 1;
            Object objG = Eq.b.g(bVar, false, this, 1, null);
            if (objG == objF) {
                return objF;
            }
            return objG;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LFq/c;", "<anonymous>", "(Lmv/O;)LFq/c;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.shoppinglist.viewmodel.ShoppingListAuthenticatedViewModel$onShoppingListItemChange$1", f = "ShoppingListAuthenticatedViewModel.kt", l = {590}, m = "invokeSuspend")
    static final class m extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super ShoppingListItem>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f13816a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ShoppingListItem f13818c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(ShoppingListItem shoppingListItem, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f13818c = shoppingListItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g0.this.new m(this.f13818c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super ShoppingListItem> continuation) {
            return ((m) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f13816a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Eq.b bVar = g0.this.shoppingListRepository;
            ShoppingListItem shoppingListItem = this.f13818c;
            this.f13816a = 1;
            Object objR = bVar.r(shoppingListItem, this);
            if (objR == objF) {
                return objF;
            }
            return objR;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "LFq/c;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.shoppinglist.viewmodel.ShoppingListAuthenticatedViewModel$postRefreshTasks$1", f = "ShoppingListAuthenticatedViewModel.kt", l = {334}, m = "invokeSuspend")
    static final class n extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends ShoppingListItem>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f13819a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<ShoppingListItem> f13821c;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends ShoppingListItem>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<ShoppingListItem>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(List<ShoppingListItem> list, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f13821c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g0.this.new n(this.f13821c, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<ShoppingListItem>> continuation) {
            return ((n) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f13819a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Eq.b bVar = g0.this.shoppingListRepository;
            List<ShoppingListItem> list = this.f13821c;
            this.f13819a = 1;
            Object objE = bVar.e(list, this);
            if (objE == objF) {
                return objF;
            }
            return objE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "LFq/a;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.shoppinglist.viewmodel.ShoppingListAuthenticatedViewModel$refreshData$1", f = "ShoppingListAuthenticatedViewModel.kt", l = {166}, m = "invokeSuspend")
    static final class o extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends FavoriteListItem>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f13822a;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends FavoriteListItem>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<FavoriteListItem>>) continuation);
        }

        o(Continuation<? super o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g0.this.new o(continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<FavoriteListItem>> continuation) {
            return ((o) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f13822a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Eq.a aVar = g0.this.favoriteListRepository;
            this.f13822a = 1;
            Object objH = Eq.a.h(aVar, false, this, 1, null);
            if (objH == objF) {
                return objF;
            }
            return objH;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "LFq/c;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.shoppinglist.viewmodel.ShoppingListAuthenticatedViewModel$refreshData$2", f = "ShoppingListAuthenticatedViewModel.kt", l = {170}, m = "invokeSuspend")
    static final class p extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends ShoppingListItem>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f13824a;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends ShoppingListItem>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<ShoppingListItem>>) continuation);
        }

        p(Continuation<? super p> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g0.this.new p(continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<ShoppingListItem>> continuation) {
            return ((p) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f13824a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Eq.b bVar = g0.this.shoppingListRepository;
            this.f13824a = 1;
            Object objG = Eq.b.g(bVar, false, this, 1, null);
            if (objG == objF) {
                return objF;
            }
            return objG;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y2(g0 g0Var, Throwable th2) {
        g0Var.isFetchingShoppingList = false;
        a aVarS1 = g0Var.S1();
        if (aVarS1 != null) {
            aVarS1.S0(false, 0);
            aVarS1.y0(Aq.b.f1969Q);
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d2(g0 g0Var, Throwable th2) {
        g0Var.isAddingShoppingListItemsList = false;
        a aVarS1 = g0Var.S1();
        if (aVarS1 != null) {
            aVarS1.y0(Aq.b.f1963K);
            aVarS1.S0(false, 0);
        }
        return Unit.f143329a;
    }

    public final void U2() {
        this.isFetchingShoppingList = true;
        a aVarS1 = S1();
        if (aVarS1 != null) {
            aVarS1.S0(true, com.meijer.mobile.meijer.Y.f100983ic);
        }
        io.reactivex.u uVarK = tv.n.b(this.ioDispatcher, new l(null)).q(C13889a.b()).k(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: Hn.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.V2(this.f13827a, (List) obj);
            }
        };
        Lu.g gVar = new Lu.g() { // from class: Hn.j
            @Override // Lu.g
            public final void accept(Object obj) {
                g0.X2(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: Hn.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.Y2(this.f13830a, (Throwable) obj);
            }
        };
        Dk.a.a(uVarK.o(gVar, new Lu.g() { // from class: Hn.m
            @Override // Lu.g
            public final void accept(Object obj) {
                g0.a3(function12, obj);
            }
        }), this.disposables);
    }

    public final void r3() {
        this.isFetchingShoppingList = false;
        this.isAddingShoppingListItemsList = false;
        this.isFetchingClippedCoupons = false;
        this.clippedOffersList = null;
        this.itemDetailsEnabled = false;
        a aVarS1 = S1();
        if (aVarS1 != null) {
            aVarS1.S0(false, 0);
        }
        this.f164283b = AbstractC17446a.EnumC2605a.NEEDS_REFRESH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(C17693b appBackgroundManager, InterfaceC14523a analyticsEngine, C18335a appPrefManager, nk.f fVar, Pk.c cVar, WeeklyAdItem bVar, Eq.b shoppingListRepository, Eq.a favoriteListRepository, C13702d couponsRepository, AbstractC15779K ioDispatcher) {
        super(appBackgroundManager);
        Intrinsics.j(appBackgroundManager, "appBackgroundManager");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(appPrefManager, "appPrefManager");
        Intrinsics.j(shoppingListRepository, "shoppingListRepository");
        Intrinsics.j(favoriteListRepository, "favoriteListRepository");
        Intrinsics.j(couponsRepository, "couponsRepository");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.analyticsEngine = analyticsEngine;
        this.appPrefManager = appPrefManager;
        this.productToShow = fVar;
        this.couponToShow = cVar;
        this.weeklyAdToShow = bVar;
        this.shoppingListRepository = shoppingListRepository;
        this.favoriteListRepository = favoriteListRepository;
        this.couponsRepository = couponsRepository;
        this.ioDispatcher = ioDispatcher;
        this.favoriteListItems = new ArrayList();
        this.shoppingListItems = new ArrayList();
        String strB = Vj.b.SHOPPING_LIST.b();
        Intrinsics.i(strB, "getValue(...)");
        this.itemDetailsEnabled = appPrefManager.o(strB);
        this.pendingProductsToAdd = new ArrayList();
        this.itemDetailsOpeningThrottle = new Ds.k(HttpResponseStatus.SUCCESS_OK);
        this.disposables = new Ju.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ListsContainer B3(List favoriteListItems, List shoppingListItems) {
        Intrinsics.j(favoriteListItems, "favoriteListItems");
        Intrinsics.j(shoppingListItems, "shoppingListItems");
        return new ListsContainer(shoppingListItems, favoriteListItems);
    }

    private final void C2(RetrofitException exception) {
        qw.a.INSTANCE.e(exception);
        this.isFetchingClippedCoupons = false;
        a aVarS1 = S1();
        if (aVarS1 != null) {
            aVarS1.S0(false, 0);
        }
        a aVarS12 = S1();
        if (aVarS12 != null) {
            sk.b errorType = exception.getErrorType();
            aVarS12.y0(errorType != null ? errorType.getErrorResourceId() : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ListsContainer C3(Function2 function2, Object p02, Object p12) {
        Intrinsics.j(p02, "p0");
        Intrinsics.j(p12, "p1");
        return (ListsContainer) function2.invoke(p02, p12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G2(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("Shopping List");
        track.v("shopping list");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H2(g0 g0Var, ShoppingListItem shoppingListItem) {
        Intrinsics.j(shoppingListItem, "shoppingListItem");
        a aVarS1 = g0Var.S1();
        if (aVarS1 != null) {
            aVarS1.W(shoppingListItem);
            aVarS1.z();
            aVarS1.v();
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H3(g0 g0Var, ListsContainer successResult) {
        Intrinsics.j(successResult, "successResult");
        g0Var.isFetchingShoppingList = false;
        g0Var.shoppingListItems.clear();
        g0Var.shoppingListItems.addAll(successResult.b());
        g0Var.favoriteListItems.clear();
        g0Var.favoriteListItems.addAll(successResult.a());
        a aVarS1 = g0Var.S1();
        if (aVarS1 != null) {
            aVarS1.r(g0Var.shoppingListItems, g0Var.itemDetailsEnabled);
            aVarS1.s(g0Var.favoriteListItems);
            aVarS1.z();
            if (!g0Var.s3()) {
                aVarS1.S0(false, 0);
            }
        }
        g0Var.f164283b = AbstractC17446a.EnumC2605a.IDLE;
        return Unit.f143329a;
    }

    private final void I1(final ShoppingListItem item) {
        if (item == null) {
            return;
        }
        io.reactivex.u uVarK = tv.n.b(this.ioDispatcher, new d(item, null)).q(C13889a.b()).k(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: Hn.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.M1(this.f13755a, item, (List) obj);
            }
        };
        Lu.g gVar = new Lu.g() { // from class: Hn.l
            @Override // Lu.g
            public final void accept(Object obj) {
                g0.O1(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: Hn.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.J1(this.f13867a, item, (Throwable) obj);
            }
        };
        Dk.a.a(uVarK.o(gVar, new Lu.g() { // from class: Hn.H
            @Override // Lu.g
            public final void accept(Object obj) {
                g0.L1(function12, obj);
            }
        }), this.disposables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N2(List list) {
        qw.a.INSTANCE.a("moved item", new Object[0]);
        return Unit.f143329a;
    }

    private final void N3(long offerId) {
        List<Coupon> list = this.clippedOffersList;
        Object obj = null;
        if (list == null) {
            if (this.isFetchingClippedCoupons) {
                return;
            }
            this.isFetchingClippedCoupons = true;
            this.pendingOfferId = offerId;
            a aVarS1 = S1();
            if (aVarS1 != null) {
                aVarS1.S0(true, 0);
            }
            io.reactivex.u uVarK = C13702d.C(this.couponsRepository, CouponsRequest.INSTANCE.a(CouponsSortType.CATEGORY_RELEVANCE, ""), false, 2, null).q(C13889a.b()).k(Iu.a.a());
            final Function1 function1 = new Function1() { // from class: Hn.X
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return g0.Q3(this.f13752a, (CouponsResponse) obj2);
                }
            };
            Lu.g gVar = new Lu.g() { // from class: Hn.Y
                @Override // Lu.g
                public final void accept(Object obj2) {
                    g0.R3(function1, obj2);
                }
            };
            final Function1 function12 = new Function1() { // from class: Hn.Z
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return g0.S3(this.f13754a, (Throwable) obj2);
                }
            };
            Dk.a.a(uVarK.o(gVar, new Lu.g() { // from class: Hn.a0
                @Override // Lu.g
                public final void accept(Object obj2) {
                    g0.T3(function12, obj2);
                }
            }), this.disposables);
            return;
        }
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((Coupon) next).getOfferId() == offerId) {
                    obj = next;
                    break;
                }
            }
            Coupon coupon = (Coupon) obj;
            if (coupon != null) {
                a aVarS12 = S1();
                if (aVarS12 != null) {
                    aVarS12.q(coupon);
                    return;
                }
                return;
            }
        }
        a aVarS13 = S1();
        if (aVarS13 != null) {
            aVarS13.y0(com.meijer.mobile.meijer.Y.f100386De);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P2(Throwable th2) {
        qw.a.INSTANCE.f(th2, "Error moving item", new Object[0]);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T2(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("Shopping List");
        track.v("shopping list");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V2(final g0 g0Var, final List shoppingList) {
        Intrinsics.j(shoppingList, "shoppingList");
        g0Var.isFetchingShoppingList = false;
        a aVarS1 = g0Var.S1();
        if (aVarS1 != null) {
            aVarS1.S0(false, 0);
        }
        a aVarS12 = g0Var.S1();
        if (aVarS12 != null) {
            aVarS12.P(Eq.d.b(shoppingList));
        }
        g0Var.analyticsEngine.b(C14756c.h("shopping list: my list"), new Function1() { // from class: Hn.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.W2(this.f13852a, shoppingList, (TrackingData) obj);
            }
        });
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W2(g0 g0Var, List list, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("shopping list");
        track.h("clippedCoupons", g0Var.P1(0));
        track.h("itemsInShoppingList", g0Var.P1(list.size()));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y1(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("shopping list: my list: add to shopping list:native input");
        track.v("shopping list");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z1(g0 g0Var, List updatedList) {
        Intrinsics.j(updatedList, "updatedList");
        g0Var.isAddingShoppingListItemsList = false;
        a aVarS1 = g0Var.S1();
        if (aVarS1 != null) {
            aVarS1.S0(false, 0);
            aVarS1.r(updatedList, false);
            aVarS1.v();
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c3(g0 g0Var, ShoppingListItem updatedItem) {
        Intrinsics.j(updatedItem, "updatedItem");
        a aVarS1 = g0Var.S1();
        if (aVarS1 != null) {
            aVarS1.q0(updatedItem);
        }
        a aVarS12 = g0Var.S1();
        if (aVarS12 != null) {
            aVarS12.v();
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i3(ShoppingListItem shoppingListItem, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("Shopping List");
        track.v("shopping list");
        track.h("couponId", String.valueOf(shoppingListItem.getCouponId()));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j2(g0 g0Var, List list) {
        g0Var.shoppingListItems.clear();
        List<ShoppingListItem> list2 = g0Var.shoppingListItems;
        Intrinsics.g(list);
        list2.addAll(list);
        a aVarS1 = g0Var.S1();
        if (aVarS1 != null) {
            aVarS1.r(g0Var.shoppingListItems, false);
            aVarS1.S0(false, 0);
            aVarS1.v();
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l3(ShoppingListItem shoppingListItem, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("Shopping List");
        track.v("shopping list");
        nk.c cVarJ = shoppingListItem.j();
        track.h("ProductSKU", cVarJ != null ? cVarJ.getCode() : null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n3(ShoppingListItem shoppingListItem, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("Shopping List");
        track.v("shopping list");
        track.h("listingId", shoppingListItem.getListingId());
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o2(List itemAdded) {
        Intrinsics.j(itemAdded, "itemAdded");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s2(g0 g0Var, Throwable th2) {
        qw.a.INSTANCE.e(th2);
        a aVarS1 = g0Var.S1();
        if (aVarS1 != null) {
            aVarS1.y0(com.meijer.mobile.meijer.Y.f100357C5);
        }
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean s3() {
        /*
            r5 = this;
            boolean r0 = r5.itemDetailsEnabled
            r1 = 0
            if (r0 == 0) goto L71
            Pk.c r0 = r5.couponToShow
            if (r0 == 0) goto L27
            java.util.List<Fq.c> r0 = r5.shoppingListItems
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L65
            java.lang.Object r2 = r0.next()
            Fq.c r2 = (Fq.ShoppingListItem) r2
            Pk.c r3 = r5.couponToShow
            kotlin.jvm.internal.Intrinsics.g(r3)
            boolean r3 = Fq.d.b(r2, r3)
            if (r3 == 0) goto Lf
            goto L66
        L27:
            nk.f r0 = r5.productToShow
            if (r0 == 0) goto L46
            java.util.List<Fq.c> r0 = r5.shoppingListItems
            java.util.Iterator r0 = r0.iterator()
        L31:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L65
            java.lang.Object r2 = r0.next()
            Fq.c r2 = (Fq.ShoppingListItem) r2
            nk.f r3 = r5.productToShow
            boolean r3 = Fq.d.c(r2, r3)
            if (r3 == 0) goto L31
            goto L66
        L46:
            Js.b r0 = r5.weeklyAdToShow
            if (r0 == 0) goto L65
            java.util.List<Fq.c> r0 = r5.shoppingListItems
            java.util.Iterator r0 = r0.iterator()
        L50:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L65
            java.lang.Object r2 = r0.next()
            Fq.c r2 = (Fq.ShoppingListItem) r2
            Js.b r3 = r5.weeklyAdToShow
            boolean r3 = Fq.d.a(r2, r3)
            if (r3 == 0) goto L50
            goto L66
        L65:
            r2 = r1
        L66:
            if (r2 == 0) goto L71
            r5.j3(r2)
            r5.couponToShow = r1
            r5.productToShow = r1
            r5.weeklyAdToShow = r1
        L71:
            java.util.List<Co.h> r0 = r5.pendingProductsToAdd
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Le5
            java.util.List<Co.h> r0 = r5.pendingProductsToAdd
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.CollectionsKt.x(r0, r3)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L8e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto La6
            java.lang.Object r3 = r0.next()
            Co.h r3 = (Co.ProductFullDetails) r3
            int r4 = r3.getQuantity()
            Fq.c r3 = Fq.d.g(r3, r4)
            r2.add(r3)
            goto L8e
        La6:
            java.util.List<Co.h> r0 = r5.pendingProductsToAdd
            r0.clear()
            mv.K r0 = r5.ioDispatcher
            Hn.g0$n r3 = new Hn.g0$n
            r3.<init>(r2, r1)
            io.reactivex.u r0 = tv.n.b(r0, r3)
            io.reactivex.t r1 = Iu.a.a()
            io.reactivex.u r0 = r0.k(r1)
            io.reactivex.t r1 = ev.C13889a.b()
            io.reactivex.u r0 = r0.q(r1)
            Hn.f0 r1 = new Hn.f0
            r1.<init>()
            Hn.b r2 = new Hn.b
            r2.<init>()
            Hn.c r1 = new Hn.c
            r1.<init>()
            Hn.d r3 = new Hn.d
            r3.<init>()
            Ju.b r0 = r0.o(r2, r3)
            Ju.a r1 = r5.disposables
            Dk.a.a(r0, r1)
            r0 = 1
            return r0
        Le5:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Hn.g0.s3():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u2(List list) {
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w3(g0 g0Var, List newShoppingList) {
        Intrinsics.j(newShoppingList, "newShoppingList");
        a aVarS1 = g0Var.S1();
        if (aVarS1 != null) {
            aVarS1.S0(false, 0);
            aVarS1.r(newShoppingList, false);
            aVarS1.v();
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y2(g0 g0Var, Throwable th2) {
        qw.a.INSTANCE.e(th2);
        a aVarS1 = g0Var.S1();
        if (aVarS1 != null) {
            aVarS1.y0(com.meijer.mobile.meijer.Y.f100357C5);
        }
        return Unit.f143329a;
    }

    public final void E(CouponsResponse data) {
        Intrinsics.j(data, "data");
        a aVarS1 = S1();
        if (aVarS1 != null) {
            aVarS1.S0(false, 0);
        }
        this.isFetchingClippedCoupons = false;
        this.clippedOffersList = data.f();
        N3(this.pendingOfferId);
    }

    public void F2(ShoppingListItem item) {
        io.reactivex.u uVarB;
        Intrinsics.j(item, "item");
        if (item.getIsComplete()) {
            this.analyticsEngine.b(C14756c.a("event: add completed item back to list"), new Function1() { // from class: Hn.L
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g0.G2((TrackingData) obj);
                }
            });
            uVarB = tv.n.b(this.ioDispatcher, new i(item, null));
        } else {
            uVarB = tv.n.b(this.ioDispatcher, new j(item, null));
        }
        io.reactivex.u uVarK = uVarB.q(C13889a.b()).k(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: Hn.M
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.H2(this.f13743a, (ShoppingListItem) obj);
            }
        };
        Lu.g gVar = new Lu.g() { // from class: Hn.N
            @Override // Lu.g
            public final void accept(Object obj) {
                g0.I2(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: Hn.O
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.K2(this.f13745a, (Throwable) obj);
            }
        };
        Dk.a.a(uVarK.o(gVar, new Lu.g() { // from class: Hn.P
            @Override // Lu.g
            public final void accept(Object obj) {
                g0.L2(function12, obj);
            }
        }), this.disposables);
        a aVarS1 = S1();
        if (aVarS1 != null) {
            aVarS1.f1();
        }
    }

    @Override // com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListItemDialogFragment.b
    public void J(ShoppingListItem item) {
        Intrinsics.j(item, "item");
        I1(item);
    }

    @Override // com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListItemDialogFragment.b
    public void L(ShoppingListItem item) {
        Intrinsics.j(item, "item");
        m3(item);
    }

    public void M2(ShoppingListItem itemToMove, ShoppingListItem itemBelow) {
        Intrinsics.j(itemToMove, "itemToMove");
        io.reactivex.u uVarK = tv.n.b(this.ioDispatcher, new k(itemToMove, itemBelow, null)).q(C13889a.b()).k(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: Hn.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.N2((List) obj);
            }
        };
        Lu.g gVar = new Lu.g() { // from class: Hn.f
            @Override // Lu.g
            public final void accept(Object obj) {
                g0.O2(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: Hn.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.P2((Throwable) obj);
            }
        };
        Dk.a.a(uVarK.o(gVar, new Lu.g() { // from class: Hn.h
            @Override // Lu.g
            public final void accept(Object obj) {
                g0.Q2(function12, obj);
            }
        }), this.disposables);
        a aVarS1 = S1();
        if (aVarS1 != null) {
            aVarS1.f1();
        }
    }

    public void R2(ShoppingListItem item, int position) {
        Intrinsics.j(item, "item");
        a aVarS1 = S1();
        if (aVarS1 != null) {
            aVarS1.I0(item, position);
        }
    }

    public final void S2(ShoppingListItem item) {
        Intrinsics.j(item, "item");
        this.analyticsEngine.b(C14756c.a("event: shopping list: show search item results"), new Function1() { // from class: Hn.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.T2((TrackingData) obj);
            }
        });
        a aVarS1 = S1();
        if (aVarS1 != null) {
            aVarS1.G0(item);
        }
    }

    /* renamed from: U1, reason: from getter */
    public final boolean getIsFetchingShoppingList() {
        return this.isFetchingShoppingList;
    }

    public final boolean V1() {
        return this.f164283b == AbstractC17446a.EnumC2605a.REFRESHING_DATA;
    }

    public final void f2(List<ProductFullDetails> products) {
        Intrinsics.j(products, "products");
        this.pendingProductsToAdd.addAll(products);
    }

    @Override // com.meijer.mobile.meijer.activity.shoppinglist.view.BaseShoppingListView.a
    public void h(ShoppingListItem item) {
        Intrinsics.j(item, "item");
        if (this.isAddingShoppingListItemsList) {
            return;
        }
        this.analyticsEngine.b(C14756c.a("event: add item to list"), new Function1() { // from class: Hn.T
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.Y1((TrackingData) obj);
            }
        });
        this.isAddingShoppingListItemsList = true;
        io.reactivex.u uVarQ = tv.n.b(this.ioDispatcher, new e(item, null)).k(Iu.a.a()).q(C13889a.b());
        final Function1 function1 = new Function1() { // from class: Hn.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.Z1(this.f13759a, (List) obj);
            }
        };
        Lu.g gVar = new Lu.g() { // from class: Hn.c0
            @Override // Lu.g
            public final void accept(Object obj) {
                g0.b2(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: Hn.d0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.d2(this.f13763a, (Throwable) obj);
            }
        };
        Dk.a.a(uVarQ.o(gVar, new Lu.g() { // from class: Hn.e0
            @Override // Lu.g
            public final void accept(Object obj) {
                g0.e2(function12, obj);
            }
        }), this.disposables);
        a aVarS1 = S1();
        if (aVarS1 != null) {
            aVarS1.f1();
        }
    }

    public void h3(final ShoppingListItem item) {
        Intrinsics.j(item, "item");
        this.analyticsEngine.b(C14756c.a("event: shopping list: show coupon item"), new Function1() { // from class: Hn.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.i3(item, (TrackingData) obj);
            }
        });
        N3(item.getCouponId());
    }

    @Override // com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListItemDialogFragment.b
    public void j(ShoppingListItem item) {
        Intrinsics.j(item, "item");
        String itemDescription = item.getItemDescription();
        if ((itemDescription != null && itemDescription.length() == 0) || item.getQuantity() == 0) {
            I1(item);
            return;
        }
        io.reactivex.u uVarQ = tv.n.b(this.ioDispatcher, new m(item, null)).k(Iu.a.a()).q(C13889a.b());
        final Function1 function1 = new Function1() { // from class: Hn.B
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.c3(this.f13734a, (ShoppingListItem) obj);
            }
        };
        Lu.g gVar = new Lu.g() { // from class: Hn.C
            @Override // Lu.g
            public final void accept(Object obj) {
                g0.e3(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: Hn.D
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.f3(this.f13736a, (Throwable) obj);
            }
        };
        Intrinsics.g(Dk.a.a(uVarQ.o(gVar, new Lu.g() { // from class: Hn.E
            @Override // Lu.g
            public final void accept(Object obj) {
                g0.g3(function12, obj);
            }
        }), this.disposables));
    }

    public void j3(ShoppingListItem item) {
        Intrinsics.j(item, "item");
        if (this.itemDetailsEnabled && this.itemDetailsOpeningThrottle.d()) {
            this.itemDetailsOpeningThrottle.c();
            a aVarS1 = S1();
            if (aVarS1 != null) {
                aVarS1.c(item, this.favoriteListItems);
            }
            a aVarS12 = S1();
            if (aVarS12 != null) {
                aVarS12.f1();
            }
        }
    }

    @Override // com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListItemDialogFragment.b
    public void k(FavoriteListItem favoriteItem) {
        Intrinsics.j(favoriteItem, "favoriteItem");
        io.reactivex.u uVarK = tv.n.b(this.ioDispatcher, new g(favoriteItem, null)).q(C13889a.b()).k(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: Hn.F
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.o2((List) obj);
            }
        };
        Lu.g gVar = new Lu.g() { // from class: Hn.G
            @Override // Lu.g
            public final void accept(Object obj) {
                g0.p2(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: Hn.I
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.s2(this.f13740a, (Throwable) obj);
            }
        };
        Dk.a.a(uVarK.o(gVar, new Lu.g() { // from class: Hn.J
            @Override // Lu.g
            public final void accept(Object obj) {
                g0.t2(function12, obj);
            }
        }), this.disposables);
    }

    public void k3(final ShoppingListItem item) {
        a aVarS1;
        Intrinsics.j(item, "item");
        this.analyticsEngine.b(C14756c.a("event: shopping list: show product details"), new Function1() { // from class: Hn.Q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.l3(item, (TrackingData) obj);
            }
        });
        nk.c cVarJ = item.j();
        if (cVarJ == null || (aVarS1 = S1()) == null) {
            return;
        }
        aVarS1.g(cVarJ);
    }

    public void m3(final ShoppingListItem item) {
        Intrinsics.j(item, "item");
        this.analyticsEngine.b(C14756c.a("event: shopping list: show weekly ad item"), new Function1() { // from class: Hn.K
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.n3(item, (TrackingData) obj);
            }
        });
        String listingId = item.getListingId();
        if (listingId == null || StringsKt.s0(listingId)) {
            a aVarS1 = S1();
            if (aVarS1 != null) {
                aVarS1.y0(Bs.a.f3664f);
                return;
            }
            return;
        }
        a aVarS12 = S1();
        if (aVarS12 != null) {
            Integer numValueOf = Integer.valueOf(item.getListingId());
            Intrinsics.i(numValueOf, "valueOf(...)");
            aVarS12.m(numValueOf.intValue());
        }
    }

    @Override // com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListItemDialogFragment.b
    public void o(FavoriteListItem favoriteItem) {
        Intrinsics.j(favoriteItem, "favoriteItem");
        io.reactivex.u uVarK = tv.n.b(this.ioDispatcher, new h(favoriteItem, null)).q(C13889a.b()).k(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: Hn.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.u2((List) obj);
            }
        };
        Lu.g gVar = new Lu.g() { // from class: Hn.y
            @Override // Lu.g
            public final void accept(Object obj) {
                g0.x2(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: Hn.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.y2(this.f13870a, (Throwable) obj);
            }
        };
        Dk.a.a(uVarK.o(gVar, new Lu.g() { // from class: Hn.A
            @Override // Lu.g
            public final void accept(Object obj) {
                g0.B2(function12, obj);
            }
        }), this.disposables);
    }

    @Override // Ds.n.b
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public void q(ShoppingListItem item, int position) {
        Intrinsics.j(item, "item");
        a aVarS1 = S1();
        if (aVarS1 != null) {
            aVarS1.Z0(item, position);
        }
    }

    @Override // com.meijer.mobile.widget.WalkThroughView.b
    public void r(WalkThroughType type, boolean isComplete, boolean forceShow) {
        Intrinsics.j(type, "type");
        this.itemDetailsEnabled = true;
        s3();
    }

    @Override // com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListItemDialogFragment.b
    public void t(ShoppingListItem item) {
        Intrinsics.j(item, "item");
        k3(item);
    }

    @Override // com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListItemDialogFragment.b
    public void v() {
        this.itemDetailsOpeningThrottle.e();
    }

    @Override // com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListItemDialogFragment.b
    public void x(ShoppingListItem item) {
        Intrinsics.j(item, "item");
        S2(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J1(g0 g0Var, ShoppingListItem shoppingListItem, Throwable th2) {
        a aVarS1 = g0Var.S1();
        if (aVarS1 != null) {
            aVarS1.y0(com.meijer.mobile.meijer.Y.f100337B5);
            aVarS1.T(shoppingListItem);
            aVarS1.v();
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J3(g0 g0Var, Throwable th2) {
        a aVarS1 = g0Var.S1();
        if (aVarS1 != null) {
            aVarS1.S0(false, 0);
        }
        a aVarS12 = g0Var.S1();
        if (aVarS12 != null) {
            aVarS12.t(g0Var.itemDetailsEnabled);
        }
        g0Var.f164283b = AbstractC17446a.EnumC2605a.NEEDS_REFRESH;
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K2(g0 g0Var, Throwable th2) {
        a aVarS1 = g0Var.S1();
        if (aVarS1 != null) {
            aVarS1.y0(com.meijer.mobile.meijer.Y.f100357C5);
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M1(g0 g0Var, ShoppingListItem shoppingListItem, List list) {
        a aVarS1 = g0Var.S1();
        if (aVarS1 != null) {
            aVarS1.z();
            aVarS1.O0(shoppingListItem);
            aVarS1.v();
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q3(g0 g0Var, CouponsResponse c13814a) {
        Intrinsics.g(c13814a);
        g0Var.E(c13814a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S3(g0 g0Var, Throwable th2) {
        Intrinsics.g(th2);
        g0Var.C2(com.meijer.mobile.core.networking.exceptions.a.a(th2));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f3(g0 g0Var, Throwable th2) {
        a aVarS1 = g0Var.S1();
        if (aVarS1 != null) {
            aVarS1.y0(com.meijer.mobile.meijer.Y.f100357C5);
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m2(g0 g0Var, Throwable th2) {
        a aVarS1 = g0Var.S1();
        if (aVarS1 != null) {
            aVarS1.S0(false, 0);
            aVarS1.y0(qk.f.f158513k);
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z3(g0 g0Var, Throwable th2) {
        a aVarS1 = g0Var.S1();
        if (aVarS1 != null) {
            aVarS1.S0(false, 0);
            aVarS1.y0(com.meijer.mobile.meijer.Y.f100317A5);
        }
        return Unit.f143329a;
    }

    public void E2() {
        a aVarS1 = S1();
        if (aVarS1 != null) {
            aVarS1.J();
        }
    }

    @Override // com.meijer.mobile.meijer.activity.shoppinglist.view.BaseShoppingListView.a
    public void F0() {
        a aVarS1 = S1();
        if (aVarS1 != null) {
            aVarS1.B0();
        }
    }

    @Override // um.AbstractC17446a
    public void P() {
        super.P();
        this.disposables.d();
    }

    public final String P1(int countOfCouponsOrShoppingItems) {
        switch (countOfCouponsOrShoppingItems) {
            case 0:
                return "0";
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return "1-5";
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return "6-10";
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return "11-15";
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return "16-20";
            default:
                return "21+";
        }
    }

    @Override // um.AbstractC17446a
    public void Q() {
        a aVarS1;
        super.Q();
        C18335a c18335a = this.appPrefManager;
        String strB = Vj.b.SHOPPING_LIST.b();
        Intrinsics.i(strB, "getValue(...)");
        this.itemDetailsEnabled = c18335a.o(strB);
        if (this.f164283b != AbstractC17446a.EnumC2605a.REFRESHING_DATA) {
            s3();
        }
        if (!this.itemDetailsEnabled && (aVarS1 = S1()) != null) {
            aVarS1.R0();
        }
    }

    @Override // um.AbstractC17446a
    public void S() {
        a aVarS1 = S1();
        if (aVarS1 != null) {
            aVarS1.S0(true, 0);
        }
        io.reactivex.u uVarM = tv.n.b(this.ioDispatcher, new o(null)).q(C13889a.b()).m(new ArrayList());
        io.reactivex.u uVarQ = tv.n.b(this.ioDispatcher, new p(null)).q(C13889a.b());
        final Function2 function2 = new Function2() { // from class: Hn.n
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return g0.B3((List) obj, (List) obj2);
            }
        };
        io.reactivex.u uVarK = uVarM.v(uVarQ, new Lu.c() { // from class: Hn.o
            @Override // Lu.c
            public final Object apply(Object obj, Object obj2) {
                return g0.C3(function2, obj, obj2);
            }
        }).q(C13889a.b()).k(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: Hn.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.H3(this.f13842a, (g0.ListsContainer) obj);
            }
        };
        Lu.g gVar = new Lu.g() { // from class: Hn.q
            @Override // Lu.g
            public final void accept(Object obj) {
                g0.I3(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: Hn.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.J3(this.f13845a, (Throwable) obj);
            }
        };
        Dk.a.a(uVarK.o(gVar, new Lu.g() { // from class: Hn.s
            @Override // Lu.g
            public final void accept(Object obj) {
                g0.L3(function12, obj);
            }
        }), this.disposables);
        this.f164283b = AbstractC17446a.EnumC2605a.REFRESHING_DATA;
        this.isFetchingShoppingList = true;
    }

    protected a S1() {
        return (a) super.M();
    }

    public void h2() {
        a aVarS1 = S1();
        if (aVarS1 != null) {
            aVarS1.T0();
        }
        a aVarS12 = S1();
        if (aVarS12 != null) {
            aVarS12.f1();
        }
    }

    public final void i2(boolean justCompleted) {
        a aVarS1 = S1();
        if (aVarS1 != null) {
            aVarS1.S0(true, 0);
        }
        io.reactivex.u uVarK = tv.n.b(this.ioDispatcher, new f(justCompleted, this, null)).q(C13889a.b()).k(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: Hn.S
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.j2(this.f13748a, (List) obj);
            }
        };
        Lu.g gVar = new Lu.g() { // from class: Hn.U
            @Override // Lu.g
            public final void accept(Object obj) {
                g0.k2(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: Hn.V
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.m2(this.f13750a, (Throwable) obj);
            }
        };
        Dk.a.a(uVarK.o(gVar, new Lu.g() { // from class: Hn.W
            @Override // Lu.g
            public final void accept(Object obj) {
                g0.n2(function12, obj);
            }
        }), this.disposables);
    }

    @Override // com.meijer.mobile.meijer.activity.shoppinglist.ShoppingListItemDialogFragment.b
    public void n(long couponId) {
        N3(couponId);
    }

    @Override // com.meijer.mobile.meijer.activity.shoppinglist.view.BaseShoppingListView.a
    public void onScan() {
        a aVarS1 = S1();
        if (aVarS1 != null) {
            aVarS1.onScan();
        }
    }

    @Override // Ds.n.b
    /* renamed from: p3, reason: merged with bridge method [inline-methods] */
    public void i(ShoppingListItem item) {
        I1(item);
    }
}
