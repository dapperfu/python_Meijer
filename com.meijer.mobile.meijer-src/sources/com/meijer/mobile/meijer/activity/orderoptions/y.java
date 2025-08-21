package com.meijer.mobile.meijer.activity.orderoptions;

import Eh.AccountAddress;
import Eh.EnumC3241e;
import Tq.PointOfService;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.c0;
import androidx.view.d0;
import bk.AbstractC6392a;
import com.meijer.mobile.digitalshopping.api.cart.ChangeFulfillmentModeChallenge;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.checkout.review.StoreDecorator;
import com.meijer.mobile.onlineshopping.errors.DigitalShoppingApiException;
import com.meijer.mobile.serverapi.rxjava.observables.store.SearchStoresCall;
import com.squareup.moshi.JsonEncodingException;
import di.C13687e;
import di.Country;
import di.CustomerAddress;
import di.Region;
import fj.CartChanges;
import fj.DeliveryMode;
import fj.EntryChange;
import fj.ShoppingCart;
import fj.n;
import hi.InterfaceC14523a;
import hl.C14535b;
import ii.AbstractC14762i;
import ii.C14756c;
import ii.TrackingData;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mv.C15809k;
import mv.E0;
import mv.InterfaceC15783O;
import pk.StoreDetails;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.InterfaceC16561f;
import pv.P;
import pv.S;
import qw.a;
import uk.AbstractC17440a;
import uk.c;
import yr.Q;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000  \u00012\u00020\u0001:\u0007|\u0082\u0001\u0080\u0001~zBI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u0018\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00192\u000e\u0010\u0018\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\u00020\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140\u001eH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J'\u0010*\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020#H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0019H\u0002¢\u0006\u0004\b,\u0010-J!\u00102\u001a\u00020\u00192\u0006\u0010/\u001a\u00020.2\b\b\u0002\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u001f\u00107\u001a\u00020\u00192\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u000200H\u0002¢\u0006\u0004\b7\u00108J!\u0010;\u001a\u00020\u00192\u0006\u0010:\u001a\u0002092\b\b\u0002\u00101\u001a\u000200H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00192\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u00192\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b?\u0010@J\u001f\u0010C\u001a\u00020\u00192\u0006\u0010B\u001a\u00020A2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\u00192\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\u00192\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\bI\u0010@J\u000f\u0010J\u001a\u00020\u0019H\u0002¢\u0006\u0004\bJ\u0010-J+\u0010P\u001a\u00020\u00192\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020M0K2\u0006\u0010O\u001a\u000200H\u0002¢\u0006\u0004\bP\u0010QJ1\u0010T\u001a\u00020\u00192\b\b\u0002\u0010$\u001a\u00020#2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\bT\u0010UJ!\u0010Y\u001a\u00020\u00192\u0006\u0010V\u001a\u0002002\b\u0010X\u001a\u0004\u0018\u00010WH\u0002¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\u0019H\u0002¢\u0006\u0004\b[\u0010-J\u001f\u0010_\u001a\u00020\u00192\u0006\u0010]\u001a\u00020\\2\u0006\u0010^\u001a\u00020\\H\u0002¢\u0006\u0004\b_\u0010`J\u001f\u0010a\u001a\u00020\u00192\u0006\u0010]\u001a\u00020\\2\u0006\u0010^\u001a\u00020\\H\u0002¢\u0006\u0004\ba\u0010`J\u001d\u0010d\u001a\u00020\u00192\f\u0010c\u001a\b\u0012\u0004\u0012\u0002090bH\u0002¢\u0006\u0004\bd\u0010eJ\u0017\u0010g\u001a\u00020\u00192\u0006\u0010f\u001a\u00020EH\u0002¢\u0006\u0004\bg\u0010HJ\u000f\u0010h\u001a\u00020\u0019H\u0002¢\u0006\u0004\bh\u0010-J\u001d\u0010j\u001a\u00020\u00192\f\u0010i\u001a\b\u0012\u0004\u0012\u0002040bH\u0002¢\u0006\u0004\bj\u0010eJ\u0017\u0010k\u001a\u00020\u00192\u0006\u0010f\u001a\u00020EH\u0002¢\u0006\u0004\bk\u0010HJ\u0017\u0010l\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\bl\u0010\u001dJ\u0017\u0010o\u001a\u00020\u00192\u0006\u0010n\u001a\u00020mH\u0002¢\u0006\u0004\bo\u0010pJ\u000f\u0010q\u001a\u00020\u0019H\u0014¢\u0006\u0004\bq\u0010-J\u0015\u0010t\u001a\u00020\u00192\u0006\u0010s\u001a\u00020r¢\u0006\u0004\bt\u0010uR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0016\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R.\u0010\u008d\u0001\u001a\n\u0012\u0005\u0012\u00030\u0087\u00010\u0086\u00018\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u0012\u0005\b\u008c\u0001\u0010-\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001e\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020m0\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0097\u0001\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010PR\u001c\u0010\u009b\u0001\u001a\n\u0012\u0005\u0012\u00030\u0087\u00010\u0098\u00018F¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001b\u0010\u009f\u0001\u001a\t\u0012\u0004\u0012\u00020m0\u009c\u00018F¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001¨\u0006¡\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y;", "Landroidx/lifecycle/c0;", "Lyo/f;", "storeManager", "Ltl/h;", "timeSlotRepository", "LZq/b;", "storeInfoRepository", "Lil/m;", "cartRepository", "LCh/a;", "accountAddressesRepository", "Lcom/meijer/mobile/serverapi/rxjava/observables/store/SearchStoresCall;", "searchStoresCall", "Lhi/a;", "analyticsEngine", "Lzl/k;", "featureManager", "<init>", "(Lyo/f;Ltl/h;LZq/b;Lil/m;LCh/a;Lcom/meijer/mobile/serverapi/rxjava/observables/store/SearchStoresCall;Lhi/a;Lzl/k;)V", "Lfj/C;", "cart", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "deliveryModeCode", "", "d0", "(Lfj/C;Ljava/lang/String;)V", "c0", "(Ljava/lang/String;)V", "Luk/c;", "cartResource", "observeCart", "(Luk/c;)V", "deliveryMode", "", "storeId", "q0", "(Ljava/lang/String;I)V", "selectedFulfillmentMode", "oldStoreId", "newStoreId", "o0", "(Ljava/lang/String;II)V", "s0", "()V", "Ldi/c;", "deliveryAddress", "", "isEditedByUser", "n0", "(Ldi/c;Z)V", "LEh/a;", "accountAddress", "wasSavedToAccountAddresses", "e0", "(LEh/a;Z)V", "Lpk/h;", "storeDetails", "j0", "(Lpk/h;Z)V", "v0", "(Lpk/h;)V", "Q", "(I)V", "Lcom/meijer/mobile/storeinfo/api/model/StoreInfo;", "storeInfo", "V", "(Lcom/meijer/mobile/storeinfo/api/model/StoreInfo;I)V", "", "error", "U", "(Ljava/lang/Throwable;)V", "P", "O", "Luk/a;", "Lfj/n;", "Lfj/e;", "challenge", "isPickupStoreChallenge", "Z", "(Luk/a;Z)V", "storeName", "storeZip", "t0", "(ILjava/lang/String;Ljava/lang/String;)V", "isInProgress", "Lbk/a;", "loadingMessage", "m0", "(ZLbk/a;)V", "T", "", "latitude", "longitude", "g0", "(DD)V", "h0", "", "storeDetailsList", "i0", "(Ljava/util/List;)V", "throwable", "f0", "R", "savedAddresses", "b0", "a0", "l0", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f;", "event", "k0", "(Lcom/meijer/mobile/meijer/activity/orderoptions/y$f;)V", "onCleared", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;", "action", "Y", "(Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;)V", "a", "Lyo/f;", "b", "Ltl/h;", "c", "LZq/b;", "d", "Lil/m;", "e", "LCh/a;", "f", "Lcom/meijer/mobile/serverapi/rxjava/observables/store/SearchStoresCall;", "g", "Lhi/a;", "h", "Lzl/k;", "Lpv/B;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$g;", "i", "Lpv/B;", "X", "()Lpv/B;", "get_viewState$annotations", "_viewState", "Lov/g;", "j", "Lov/g;", "_events", "LJu/a;", "k", "LJu/a;", "disposables", "l", "isCartFirstLoad", "Lpv/P;", "W", "()Lpv/P;", "viewState", "Lpv/f;", "S", "()Lpv/f;", "events", "m", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class y extends c0 {

    /* renamed from: n, reason: collision with root package name */
    public static final int f110855n = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yo.f storeManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final tl.h timeSlotRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Zq.b storeInfoRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final il.m cartRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Ch.a accountAddressesRepository;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final SearchStoresCall searchStoresCall;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final zl.k featureManager;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<OrderOptionsViewState> _viewState;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ov.g<f> _events;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean isCartFirstLoad;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<uk.c<ShoppingCart>, Unit> {
        a(Object obj) {
            super(1, obj, y.class, "observeCart", "observeCart(Lcom/meijer/mobile/core/util/content/Resource;)V", 0);
        }

        public final void a(uk.c<ShoppingCart> p02) {
            Intrinsics.j(p02, "p0");
            ((y) this.receiver).observeCart(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(uk.c<ShoppingCart> cVar) {
            a(cVar);
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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$d;", "", "", "isLoading", "Lbk/a;", "loadingMessage", "<init>", "(ZLbk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Lbk/a;", "()Lbk/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.y$d, reason: from toString */
    public static final /* data */ class LoadingState {

        /* renamed from: c, reason: collision with root package name */
        public static final int f110868c = AbstractC6392a.f60445b;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a loadingMessage;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadingState)) {
                return false;
            }
            LoadingState loadingState = (LoadingState) other;
            return this.isLoading == loadingState.isLoading && Intrinsics.e(this.loadingMessage, loadingState.loadingMessage);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isLoading) * 31;
            AbstractC6392a abstractC6392a = this.loadingMessage;
            return iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode());
        }

        public String toString() {
            return "LoadingState(isLoading=" + this.isLoading + ", loadingMessage=" + this.loadingMessage + ')';
        }

        /* renamed from: a, reason: from getter */
        public final AbstractC6392a getLoadingMessage() {
            return this.loadingMessage;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public LoadingState(boolean z10, AbstractC6392a abstractC6392a) {
            this.isLoading = z10;
            this.loadingMessage = abstractC6392a;
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0013\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()¨\u0006*"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;", "", "<init>", "()V", "n", "q", "o", "e", "a", "l", "p", "s", "h", "f", "g", "m", "j", "k", "i", "r", "b", "d", "c", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$a;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$b;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$c;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$d;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$e;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$f;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$g;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$h;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$i;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$j;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$k;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$l;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$m;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$n;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$o;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$p;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$q;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$r;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$s;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class e {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$a;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;", "LEh/a;", "accountAddress", "", "wasSavedToAccountAddresses", "", "serviceTier", "<init>", "(LEh/a;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LEh/a;", "()LEh/a;", "b", "Z", "c", "()Z", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.y$e$a, reason: from toString */
        public static final /* data */ class AccountAddressToDeliveryAddress extends e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AccountAddress accountAddress;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean wasSavedToAccountAddresses;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String serviceTier;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AccountAddressToDeliveryAddress)) {
                    return false;
                }
                AccountAddressToDeliveryAddress accountAddressToDeliveryAddress = (AccountAddressToDeliveryAddress) other;
                return Intrinsics.e(this.accountAddress, accountAddressToDeliveryAddress.accountAddress) && this.wasSavedToAccountAddresses == accountAddressToDeliveryAddress.wasSavedToAccountAddresses && Intrinsics.e(this.serviceTier, accountAddressToDeliveryAddress.serviceTier);
            }

            public int hashCode() {
                int iHashCode = ((this.accountAddress.hashCode() * 31) + Boolean.hashCode(this.wasSavedToAccountAddresses)) * 31;
                String str = this.serviceTier;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "AccountAddressToDeliveryAddress(accountAddress=" + this.accountAddress + ", wasSavedToAccountAddresses=" + this.wasSavedToAccountAddresses + ", serviceTier=" + this.serviceTier + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AccountAddressToDeliveryAddress(AccountAddress accountAddress, boolean z10, String str) {
                super(null);
                Intrinsics.j(accountAddress, "accountAddress");
                this.accountAddress = accountAddress;
                this.wasSavedToAccountAddresses = z10;
                this.serviceTier = str;
            }

            /* renamed from: a, reason: from getter */
            public final AccountAddress getAccountAddress() {
                return this.accountAddress;
            }

            /* renamed from: b, reason: from getter */
            public final String getServiceTier() {
                return this.serviceTier;
            }

            /* renamed from: c, reason: from getter */
            public final boolean getWasSavedToAccountAddresses() {
                return this.wasSavedToAccountAddresses;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$b;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends e {

            /* renamed from: a, reason: collision with root package name */
            public static final b f110874a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -1709127697;
            }

            public String toString() {
                return "AddSavedAddressCanceled";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$c;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends e {

            /* renamed from: a, reason: collision with root package name */
            public static final c f110875a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -1283808317;
            }

            public String toString() {
                return "BackPressed";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$d;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends e {

            /* renamed from: a, reason: collision with root package name */
            public static final d f110876a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -2098813193;
            }

            public String toString() {
                return "FetchCurrentDeliveryAddresses";
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$e;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;", "Luk/a;", "Lfj/n;", "Lfj/e;", "cartChallenge", "", "isPickupStoreChallenge", "<init>", "(Luk/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Luk/a;", "()Luk/a;", "b", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.y$e$e, reason: collision with other inner class name and from toString */
        public static final /* data */ class FulfillmentModeChallengeResult extends e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC17440a<fj.n, CartChanges> cartChallenge;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isPickupStoreChallenge;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FulfillmentModeChallengeResult)) {
                    return false;
                }
                FulfillmentModeChallengeResult fulfillmentModeChallengeResult = (FulfillmentModeChallengeResult) other;
                return Intrinsics.e(this.cartChallenge, fulfillmentModeChallengeResult.cartChallenge) && this.isPickupStoreChallenge == fulfillmentModeChallengeResult.isPickupStoreChallenge;
            }

            public int hashCode() {
                return (this.cartChallenge.hashCode() * 31) + Boolean.hashCode(this.isPickupStoreChallenge);
            }

            public String toString() {
                return "FulfillmentModeChallengeResult(cartChallenge=" + this.cartChallenge + ", isPickupStoreChallenge=" + this.isPickupStoreChallenge + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FulfillmentModeChallengeResult(AbstractC17440a<fj.n, CartChanges> cartChallenge, boolean z10) {
                super(null);
                Intrinsics.j(cartChallenge, "cartChallenge");
                this.cartChallenge = cartChallenge;
                this.isPickupStoreChallenge = z10;
            }

            public final AbstractC17440a<fj.n, CartChanges> a() {
                return this.cartChallenge;
            }

            /* renamed from: b, reason: from getter */
            public final boolean getIsPickupStoreChallenge() {
                return this.isPickupStoreChallenge;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$f;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;", "Lcom/meijer/mobile/meijer/activity/orderoptions/s;", "orderOptionsListItem", "<init>", "(Lcom/meijer/mobile/meijer/activity/orderoptions/s;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/orderoptions/s;", "()Lcom/meijer/mobile/meijer/activity/orderoptions/s;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.y$e$f, reason: from toString */
        public static final /* data */ class NavigateListItemToAddressDetail extends e {

            /* renamed from: b, reason: collision with root package name */
            public static final int f110879b = AbstractC6392a.f60445b;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final OrderOptionsListItem orderOptionsListItem;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NavigateListItemToAddressDetail) && Intrinsics.e(this.orderOptionsListItem, ((NavigateListItemToAddressDetail) other).orderOptionsListItem);
            }

            public int hashCode() {
                return this.orderOptionsListItem.hashCode();
            }

            public String toString() {
                return "NavigateListItemToAddressDetail(orderOptionsListItem=" + this.orderOptionsListItem + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateListItemToAddressDetail(OrderOptionsListItem orderOptionsListItem) {
                super(null);
                Intrinsics.j(orderOptionsListItem, "orderOptionsListItem");
                this.orderOptionsListItem = orderOptionsListItem;
            }

            /* renamed from: a, reason: from getter */
            public final OrderOptionsListItem getOrderOptionsListItem() {
                return this.orderOptionsListItem;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$g;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;", "Lcom/meijer/mobile/meijer/activity/orderoptions/s;", "orderOptionsListItem", "<init>", "(Lcom/meijer/mobile/meijer/activity/orderoptions/s;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/orderoptions/s;", "()Lcom/meijer/mobile/meijer/activity/orderoptions/s;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.y$e$g, reason: from toString */
        public static final /* data */ class NavigateListItemToStoreDetail extends e {

            /* renamed from: b, reason: collision with root package name */
            public static final int f110881b = AbstractC6392a.f60445b;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final OrderOptionsListItem orderOptionsListItem;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NavigateListItemToStoreDetail) && Intrinsics.e(this.orderOptionsListItem, ((NavigateListItemToStoreDetail) other).orderOptionsListItem);
            }

            public int hashCode() {
                return this.orderOptionsListItem.hashCode();
            }

            public String toString() {
                return "NavigateListItemToStoreDetail(orderOptionsListItem=" + this.orderOptionsListItem + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateListItemToStoreDetail(OrderOptionsListItem orderOptionsListItem) {
                super(null);
                Intrinsics.j(orderOptionsListItem, "orderOptionsListItem");
                this.orderOptionsListItem = orderOptionsListItem;
            }

            /* renamed from: a, reason: from getter */
            public final OrderOptionsListItem getOrderOptionsListItem() {
                return this.orderOptionsListItem;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$h;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LEh/a;", "a", "LEh/a;", "()LEh/a;", "accountAddress", "b", "I", "savedAddressCount", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.y$e$h, reason: from toString */
        public static final /* data */ class NavigateToAddressDetail extends e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AccountAddress accountAddress;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int savedAddressCount;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NavigateToAddressDetail)) {
                    return false;
                }
                NavigateToAddressDetail navigateToAddressDetail = (NavigateToAddressDetail) other;
                return Intrinsics.e(this.accountAddress, navigateToAddressDetail.accountAddress) && this.savedAddressCount == navigateToAddressDetail.savedAddressCount;
            }

            public int hashCode() {
                return (this.accountAddress.hashCode() * 31) + Integer.hashCode(this.savedAddressCount);
            }

            public String toString() {
                return "NavigateToAddressDetail(accountAddress=" + this.accountAddress + ", savedAddressCount=" + this.savedAddressCount + ')';
            }

            /* renamed from: a, reason: from getter */
            public final AccountAddress getAccountAddress() {
                return this.accountAddress;
            }

            /* renamed from: b, reason: from getter */
            public final int getSavedAddressCount() {
                return this.savedAddressCount;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$i;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class i extends e {

            /* renamed from: a, reason: collision with root package name */
            public static final i f110885a = new i();

            private i() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof i);
            }

            public int hashCode() {
                return -1694612264;
            }

            public String toString() {
                return "NavigateToAddressSearch";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$j;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class j extends e {

            /* renamed from: a, reason: collision with root package name */
            public static final j f110886a = new j();

            private j() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof j);
            }

            public int hashCode() {
                return 1317449861;
            }

            public String toString() {
                return "NavigateToStoreDetails";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$k;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class k extends e {

            /* renamed from: a, reason: collision with root package name */
            public static final k f110887a = new k();

            private k() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof k);
            }

            public int hashCode() {
                return -498445563;
            }

            public String toString() {
                return "NavigateToStoreSearch";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$l;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;", "", "latitude", "longitude", "<init>", "(DD)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.y$e$l, reason: from toString */
        public static final /* data */ class PopulateNearbyStores extends e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final double latitude;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final double longitude;

            public PopulateNearbyStores(double d10, double d11) {
                super(null);
                this.latitude = d10;
                this.longitude = d11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PopulateNearbyStores)) {
                    return false;
                }
                PopulateNearbyStores populateNearbyStores = (PopulateNearbyStores) other;
                return Double.compare(this.latitude, populateNearbyStores.latitude) == 0 && Double.compare(this.longitude, populateNearbyStores.longitude) == 0;
            }

            public int hashCode() {
                return (Double.hashCode(this.latitude) * 31) + Double.hashCode(this.longitude);
            }

            public String toString() {
                return "PopulateNearbyStores(latitude=" + this.latitude + ", longitude=" + this.longitude + ')';
            }

            /* renamed from: a, reason: from getter */
            public final double getLatitude() {
                return this.latitude;
            }

            /* renamed from: b, reason: from getter */
            public final double getLongitude() {
                return this.longitude;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$m;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class m extends e {

            /* renamed from: a, reason: collision with root package name */
            public static final m f110890a = new m();

            private m() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof m);
            }

            public int hashCode() {
                return 204364539;
            }

            public String toString() {
                return "PopulateStoresNearHome";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$n;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;", "", "deliveryModeCode", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.y$e$n, reason: from toString */
        public static final /* data */ class SetFulfillmentMode extends e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String deliveryModeCode;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetFulfillmentMode) && Intrinsics.e(this.deliveryModeCode, ((SetFulfillmentMode) other).deliveryModeCode);
            }

            public int hashCode() {
                return this.deliveryModeCode.hashCode();
            }

            public String toString() {
                return "SetFulfillmentMode(deliveryModeCode=" + this.deliveryModeCode + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetFulfillmentMode(String deliveryModeCode) {
                super(null);
                Intrinsics.j(deliveryModeCode, "deliveryModeCode");
                this.deliveryModeCode = deliveryModeCode;
            }

            /* renamed from: a, reason: from getter */
            public final String getDeliveryModeCode() {
                return this.deliveryModeCode;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$o;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;", "Lpk/h;", "storeDetails", "", "isEditedByUser", "<init>", "(Lpk/h;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lpk/h;", "()Lpk/h;", "b", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.y$e$o, reason: from toString */
        public static final /* data */ class SetPickupStore extends e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final StoreDetails storeDetails;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isEditedByUser;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SetPickupStore)) {
                    return false;
                }
                SetPickupStore setPickupStore = (SetPickupStore) other;
                return Intrinsics.e(this.storeDetails, setPickupStore.storeDetails) && this.isEditedByUser == setPickupStore.isEditedByUser;
            }

            public int hashCode() {
                return (this.storeDetails.hashCode() * 31) + Boolean.hashCode(this.isEditedByUser);
            }

            public String toString() {
                return "SetPickupStore(storeDetails=" + this.storeDetails + ", isEditedByUser=" + this.isEditedByUser + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetPickupStore(StoreDetails storeDetails, boolean z10) {
                super(null);
                Intrinsics.j(storeDetails, "storeDetails");
                this.storeDetails = storeDetails;
                this.isEditedByUser = z10;
            }

            /* renamed from: a, reason: from getter */
            public final StoreDetails getStoreDetails() {
                return this.storeDetails;
            }

            /* renamed from: b, reason: from getter */
            public final boolean getIsEditedByUser() {
                return this.isEditedByUser;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$p;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;", "", "previousPageName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.y$e$p, reason: from toString */
        public static final /* data */ class SetPreviousPageName extends e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String previousPageName;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetPreviousPageName) && Intrinsics.e(this.previousPageName, ((SetPreviousPageName) other).previousPageName);
            }

            public int hashCode() {
                return this.previousPageName.hashCode();
            }

            public String toString() {
                return "SetPreviousPageName(previousPageName=" + this.previousPageName + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetPreviousPageName(String previousPageName) {
                super(null);
                Intrinsics.j(previousPageName, "previousPageName");
                this.previousPageName = previousPageName;
            }

            /* renamed from: a, reason: from getter */
            public final String getPreviousPageName() {
                return this.previousPageName;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$q;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;", "Ldi/c;", "deliveryAddress", "", "isEditedByUser", "<init>", "(Ldi/c;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ldi/c;", "()Ldi/c;", "b", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.y$e$q, reason: from toString */
        public static final /* data */ class SetSelectedSavedAddress extends e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final CustomerAddress deliveryAddress;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isEditedByUser;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SetSelectedSavedAddress)) {
                    return false;
                }
                SetSelectedSavedAddress setSelectedSavedAddress = (SetSelectedSavedAddress) other;
                return Intrinsics.e(this.deliveryAddress, setSelectedSavedAddress.deliveryAddress) && this.isEditedByUser == setSelectedSavedAddress.isEditedByUser;
            }

            public int hashCode() {
                return (this.deliveryAddress.hashCode() * 31) + Boolean.hashCode(this.isEditedByUser);
            }

            public String toString() {
                return "SetSelectedSavedAddress(deliveryAddress=" + this.deliveryAddress + ", isEditedByUser=" + this.isEditedByUser + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetSelectedSavedAddress(CustomerAddress deliveryAddress, boolean z10) {
                super(null);
                Intrinsics.j(deliveryAddress, "deliveryAddress");
                this.deliveryAddress = deliveryAddress;
                this.isEditedByUser = z10;
            }

            /* renamed from: a, reason: from getter */
            public final CustomerAddress getDeliveryAddress() {
                return this.deliveryAddress;
            }

            /* renamed from: b, reason: from getter */
            public final boolean getIsEditedByUser() {
                return this.isEditedByUser;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$r;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class r extends e {

            /* renamed from: a, reason: collision with root package name */
            public static final r f110897a = new r();

            private r() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof r);
            }

            public int hashCode() {
                return 1581693777;
            }

            public String toString() {
                return "UpdateOrderOptions";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$e$s;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;", "Lpk/h;", "storeDetail", "<init>", "(Lpk/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpk/h;", "()Lpk/h;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.y$e$s, reason: from toString */
        public static final /* data */ class UpdatedNewSelectPickupStore extends e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final StoreDetails storeDetail;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdatedNewSelectPickupStore) && Intrinsics.e(this.storeDetail, ((UpdatedNewSelectPickupStore) other).storeDetail);
            }

            public int hashCode() {
                return this.storeDetail.hashCode();
            }

            public String toString() {
                return "UpdatedNewSelectPickupStore(storeDetail=" + this.storeDetail + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdatedNewSelectPickupStore(StoreDetails storeDetail) {
                super(null);
                Intrinsics.j(storeDetail, "storeDetail");
                this.storeDetail = storeDetail;
            }

            /* renamed from: a, reason: from getter */
            public final StoreDetails getStoreDetail() {
                return this.storeDetail;
            }
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private e() {
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0010\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0010\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$f;", "", "<init>", "()V", "c", "m", "d", "n", "o", "e", "j", "g", "f", "i", "h", "b", "k", "p", "l", "a", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$a;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$b;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$c;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$d;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$e;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$f;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$g;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$h;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$i;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$j;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$k;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$l;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$m;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$n;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$o;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$p;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class f {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$a;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final a f110899a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 2042101318;
            }

            public String toString() {
                return "CloseOrderOptionsEvent";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$b;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f;", "", "shouldDisplayDialog", "", "deliveryModeCode", "<init>", "(ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.y$f$b, reason: from toString */
        public static final /* data */ class DisplaySaveChangesDialog extends f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean shouldDisplayDialog;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String deliveryModeCode;

            public DisplaySaveChangesDialog(boolean z10, String str) {
                super(null);
                this.shouldDisplayDialog = z10;
                this.deliveryModeCode = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DisplaySaveChangesDialog)) {
                    return false;
                }
                DisplaySaveChangesDialog displaySaveChangesDialog = (DisplaySaveChangesDialog) other;
                return this.shouldDisplayDialog == displaySaveChangesDialog.shouldDisplayDialog && Intrinsics.e(this.deliveryModeCode, displaySaveChangesDialog.deliveryModeCode);
            }

            public int hashCode() {
                int iHashCode = Boolean.hashCode(this.shouldDisplayDialog) * 31;
                String str = this.deliveryModeCode;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "DisplaySaveChangesDialog(shouldDisplayDialog=" + this.shouldDisplayDialog + ", deliveryModeCode=" + this.deliveryModeCode + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getDeliveryModeCode() {
                return this.deliveryModeCode;
            }

            /* renamed from: b, reason: from getter */
            public final boolean getShouldDisplayDialog() {
                return this.shouldDisplayDialog;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$c;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f;", "", "messageResId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.y$f$c, reason: from toString */
        public static final /* data */ class FailEvent extends f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            public FailEvent(int i10) {
                super(null);
                this.messageResId = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FailEvent) && this.messageResId == ((FailEvent) other).messageResId;
            }

            public int hashCode() {
                return Integer.hashCode(this.messageResId);
            }

            public String toString() {
                return "FailEvent(messageResId=" + this.messageResId + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$d;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f;", "", "fulfillmentMode", "Lcom/meijer/mobile/digitalshopping/api/cart/ChangeFulfillmentModeChallenge;", "cartChangesResource", "Lfj/e;", "data", "<init>", "(Ljava/lang/String;Lcom/meijer/mobile/digitalshopping/api/cart/ChangeFulfillmentModeChallenge;Lfj/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lcom/meijer/mobile/digitalshopping/api/cart/ChangeFulfillmentModeChallenge;", "()Lcom/meijer/mobile/digitalshopping/api/cart/ChangeFulfillmentModeChallenge;", "Lfj/e;", "()Lfj/e;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.y$f$d, reason: from toString */
        public static final /* data */ class FulfillmentChangeCallout extends f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String fulfillmentMode;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final ChangeFulfillmentModeChallenge cartChangesResource;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final CartChanges data;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FulfillmentChangeCallout)) {
                    return false;
                }
                FulfillmentChangeCallout fulfillmentChangeCallout = (FulfillmentChangeCallout) other;
                return Intrinsics.e(this.fulfillmentMode, fulfillmentChangeCallout.fulfillmentMode) && Intrinsics.e(this.cartChangesResource, fulfillmentChangeCallout.cartChangesResource) && Intrinsics.e(this.data, fulfillmentChangeCallout.data);
            }

            public int hashCode() {
                int iHashCode = ((this.fulfillmentMode.hashCode() * 31) + this.cartChangesResource.hashCode()) * 31;
                CartChanges cartChanges = this.data;
                return iHashCode + (cartChanges == null ? 0 : cartChanges.hashCode());
            }

            public String toString() {
                return "FulfillmentChangeCallout(fulfillmentMode=" + this.fulfillmentMode + ", cartChangesResource=" + this.cartChangesResource + ", data=" + this.data + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FulfillmentChangeCallout(String fulfillmentMode, ChangeFulfillmentModeChallenge cartChangesResource, CartChanges cartChanges) {
                super(null);
                Intrinsics.j(fulfillmentMode, "fulfillmentMode");
                Intrinsics.j(cartChangesResource, "cartChangesResource");
                this.fulfillmentMode = fulfillmentMode;
                this.cartChangesResource = cartChangesResource;
                this.data = cartChanges;
            }

            /* renamed from: a, reason: from getter */
            public final ChangeFulfillmentModeChallenge getCartChangesResource() {
                return this.cartChangesResource;
            }

            /* renamed from: b, reason: from getter */
            public final CartChanges getData() {
                return this.data;
            }

            /* renamed from: c, reason: from getter */
            public final String getFulfillmentMode() {
                return this.fulfillmentMode;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$e;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f;", "", "messageTitleId", "messageResId", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.y$f$e, reason: from toString */
        public static final /* data */ class GenericFailureEvent extends f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageTitleId;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            public GenericFailureEvent(int i10, int i11) {
                super(null);
                this.messageTitleId = i10;
                this.messageResId = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GenericFailureEvent)) {
                    return false;
                }
                GenericFailureEvent genericFailureEvent = (GenericFailureEvent) other;
                return this.messageTitleId == genericFailureEvent.messageTitleId && this.messageResId == genericFailureEvent.messageResId;
            }

            public int hashCode() {
                return (Integer.hashCode(this.messageTitleId) * 31) + Integer.hashCode(this.messageResId);
            }

            public String toString() {
                return "GenericFailureEvent(messageTitleId=" + this.messageTitleId + ", messageResId=" + this.messageResId + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }

            /* renamed from: b, reason: from getter */
            public final int getMessageTitleId() {
                return this.messageTitleId;
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$f;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f;", "", "savedAddressCount", "LEh/a;", "accountAddress", "<init>", "(ILEh/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "LEh/a;", "()LEh/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.y$f$f, reason: collision with other inner class name and from toString */
        public static final /* data */ class NavigateToAddressDetailScreenEvent extends f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int savedAddressCount;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final AccountAddress accountAddress;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NavigateToAddressDetailScreenEvent)) {
                    return false;
                }
                NavigateToAddressDetailScreenEvent navigateToAddressDetailScreenEvent = (NavigateToAddressDetailScreenEvent) other;
                return this.savedAddressCount == navigateToAddressDetailScreenEvent.savedAddressCount && Intrinsics.e(this.accountAddress, navigateToAddressDetailScreenEvent.accountAddress);
            }

            public int hashCode() {
                return (Integer.hashCode(this.savedAddressCount) * 31) + this.accountAddress.hashCode();
            }

            public String toString() {
                return "NavigateToAddressDetailScreenEvent(savedAddressCount=" + this.savedAddressCount + ", accountAddress=" + this.accountAddress + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToAddressDetailScreenEvent(int i10, AccountAddress accountAddress) {
                super(null);
                Intrinsics.j(accountAddress, "accountAddress");
                this.savedAddressCount = i10;
                this.accountAddress = accountAddress;
            }

            /* renamed from: a, reason: from getter */
            public final AccountAddress getAccountAddress() {
                return this.accountAddress;
            }

            /* renamed from: b, reason: from getter */
            public final int getSavedAddressCount() {
                return this.savedAddressCount;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$g;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f;", "", "savedAddressCount", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.y$f$g, reason: from toString */
        public static final /* data */ class NavigateToAddressSearchEvent extends f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int savedAddressCount;

            public NavigateToAddressSearchEvent(int i10) {
                super(null);
                this.savedAddressCount = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NavigateToAddressSearchEvent) && this.savedAddressCount == ((NavigateToAddressSearchEvent) other).savedAddressCount;
            }

            public int hashCode() {
                return Integer.hashCode(this.savedAddressCount);
            }

            public String toString() {
                return "NavigateToAddressSearchEvent(savedAddressCount=" + this.savedAddressCount + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getSavedAddressCount() {
                return this.savedAddressCount;
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u001b\u0010\u0014\u001a\u00060\u0005j\u0002`\u00118\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007R\u0017\u0010\u0019\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001b\u001a\u0004\b\r\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$h;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "deliveryMode", "Lcom/meijer/mobile/core/model/common/StoreId;", "I", "d", "storeId", "LTq/c;", "c", "LTq/c;", "()LTq/c;", "pointOfService", "Ldi/c;", "Ldi/c;", "()Ldi/c;", "deliveryAddress", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.y$f$h, reason: from toString */
        public static final /* data */ class NavigateToFulfillmentSlotsEvent extends f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String deliveryMode;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int storeId;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final PointOfService pointOfService;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final CustomerAddress deliveryAddress;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NavigateToFulfillmentSlotsEvent)) {
                    return false;
                }
                NavigateToFulfillmentSlotsEvent navigateToFulfillmentSlotsEvent = (NavigateToFulfillmentSlotsEvent) other;
                return Intrinsics.e(this.deliveryMode, navigateToFulfillmentSlotsEvent.deliveryMode) && this.storeId == navigateToFulfillmentSlotsEvent.storeId && Intrinsics.e(this.pointOfService, navigateToFulfillmentSlotsEvent.pointOfService) && Intrinsics.e(this.deliveryAddress, navigateToFulfillmentSlotsEvent.deliveryAddress);
            }

            public int hashCode() {
                int iHashCode = ((((this.deliveryMode.hashCode() * 31) + Integer.hashCode(this.storeId)) * 31) + this.pointOfService.hashCode()) * 31;
                CustomerAddress customerAddress = this.deliveryAddress;
                return iHashCode + (customerAddress == null ? 0 : customerAddress.hashCode());
            }

            public String toString() {
                return "NavigateToFulfillmentSlotsEvent(deliveryMode=" + this.deliveryMode + ", storeId=" + this.storeId + ", pointOfService=" + this.pointOfService + ", deliveryAddress=" + this.deliveryAddress + ')';
            }

            /* renamed from: a, reason: from getter */
            public final CustomerAddress getDeliveryAddress() {
                return this.deliveryAddress;
            }

            /* renamed from: b, reason: from getter */
            public final String getDeliveryMode() {
                return this.deliveryMode;
            }

            /* renamed from: c, reason: from getter */
            public final PointOfService getPointOfService() {
                return this.pointOfService;
            }

            /* renamed from: d, reason: from getter */
            public final int getStoreId() {
                return this.storeId;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$i;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f;", "", "storeId", "", "storeName", "Lpk/i;", "storeSearchType", "<init>", "(ILjava/lang/String;Lpk/i;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "c", "Lpk/i;", "()Lpk/i;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.y$f$i, reason: from toString */
        public static final /* data */ class NavigateToStoreDetailScreenEvent extends f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int storeId;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String storeName;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final pk.i storeSearchType;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NavigateToStoreDetailScreenEvent)) {
                    return false;
                }
                NavigateToStoreDetailScreenEvent navigateToStoreDetailScreenEvent = (NavigateToStoreDetailScreenEvent) other;
                return this.storeId == navigateToStoreDetailScreenEvent.storeId && Intrinsics.e(this.storeName, navigateToStoreDetailScreenEvent.storeName) && this.storeSearchType == navigateToStoreDetailScreenEvent.storeSearchType;
            }

            public int hashCode() {
                return (((Integer.hashCode(this.storeId) * 31) + this.storeName.hashCode()) * 31) + this.storeSearchType.hashCode();
            }

            public String toString() {
                return "NavigateToStoreDetailScreenEvent(storeId=" + this.storeId + ", storeName=" + this.storeName + ", storeSearchType=" + this.storeSearchType + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToStoreDetailScreenEvent(int i10, String storeName, pk.i storeSearchType) {
                super(null);
                Intrinsics.j(storeName, "storeName");
                Intrinsics.j(storeSearchType, "storeSearchType");
                this.storeId = i10;
                this.storeName = storeName;
                this.storeSearchType = storeSearchType;
            }

            /* renamed from: a, reason: from getter */
            public final int getStoreId() {
                return this.storeId;
            }

            /* renamed from: b, reason: from getter */
            public final String getStoreName() {
                return this.storeName;
            }

            /* renamed from: c, reason: from getter */
            public final pk.i getStoreSearchType() {
                return this.storeSearchType;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$j;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f;", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "storeName", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.y$f$j, reason: from toString */
        public static final /* data */ class NavigateToStoreDetailsEvent extends f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int storeId;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String storeName;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NavigateToStoreDetailsEvent)) {
                    return false;
                }
                NavigateToStoreDetailsEvent navigateToStoreDetailsEvent = (NavigateToStoreDetailsEvent) other;
                return this.storeId == navigateToStoreDetailsEvent.storeId && Intrinsics.e(this.storeName, navigateToStoreDetailsEvent.storeName);
            }

            public int hashCode() {
                return (Integer.hashCode(this.storeId) * 31) + this.storeName.hashCode();
            }

            public String toString() {
                return "NavigateToStoreDetailsEvent(storeId=" + this.storeId + ", storeName=" + this.storeName + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToStoreDetailsEvent(int i10, String storeName) {
                super(null);
                Intrinsics.j(storeName, "storeName");
                this.storeId = i10;
                this.storeName = storeName;
            }

            /* renamed from: a, reason: from getter */
            public final int getStoreId() {
                return this.storeId;
            }

            /* renamed from: b, reason: from getter */
            public final String getStoreName() {
                return this.storeName;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$k;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f;", "", "isPickUpMode", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.y$f$k, reason: from toString */
        public static final /* data */ class NavigateToStoreSearchEvent extends f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isPickUpMode;

            public NavigateToStoreSearchEvent(boolean z10) {
                super(null);
                this.isPickUpMode = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NavigateToStoreSearchEvent) && this.isPickUpMode == ((NavigateToStoreSearchEvent) other).isPickUpMode;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isPickUpMode);
            }

            public String toString() {
                return "NavigateToStoreSearchEvent(isPickUpMode=" + this.isPickUpMode + ')';
            }

            /* renamed from: a, reason: from getter */
            public final boolean getIsPickUpMode() {
                return this.isPickUpMode;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$l;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class l extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final l f110921a = new l();

            private l() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof l);
            }

            public int hashCode() {
                return 2128528853;
            }

            public String toString() {
                return "PopulateNearbyAddressesEvent";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$m;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f;", "Lbk/a;", "title", "message", "positiveButtonText", "<init>", "(Lbk/a;Lbk/a;Lbk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbk/a;", "c", "()Lbk/a;", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.y$f$m, reason: from toString */
        public static final /* data */ class ShowError extends f {

            /* renamed from: d, reason: collision with root package name */
            public static final int f110922d = AbstractC6392a.f60445b;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC6392a title;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC6392a message;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC6392a positiveButtonText;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowError)) {
                    return false;
                }
                ShowError showError = (ShowError) other;
                return Intrinsics.e(this.title, showError.title) && Intrinsics.e(this.message, showError.message) && Intrinsics.e(this.positiveButtonText, showError.positiveButtonText);
            }

            public int hashCode() {
                return (((this.title.hashCode() * 31) + this.message.hashCode()) * 31) + this.positiveButtonText.hashCode();
            }

            public String toString() {
                return "ShowError(title=" + this.title + ", message=" + this.message + ", positiveButtonText=" + this.positiveButtonText + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowError(AbstractC6392a title, AbstractC6392a message, AbstractC6392a positiveButtonText) {
                super(null);
                Intrinsics.j(title, "title");
                Intrinsics.j(message, "message");
                Intrinsics.j(positiveButtonText, "positiveButtonText");
                this.title = title;
                this.message = message;
                this.positiveButtonText = positiveButtonText;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC6392a getMessage() {
                return this.message;
            }

            /* renamed from: b, reason: from getter */
            public final AbstractC6392a getPositiveButtonText() {
                return this.positiveButtonText;
            }

            /* renamed from: c, reason: from getter */
            public final AbstractC6392a getTitle() {
                return this.title;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$n;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f;", "Lcom/meijer/mobile/digitalshopping/api/cart/ChangeFulfillmentModeChallenge;", "challenge", "", "title", "message", "", "isPickupStoreChallenge", "<init>", "(Lcom/meijer/mobile/digitalshopping/api/cart/ChangeFulfillmentModeChallenge;IIZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/digitalshopping/api/cart/ChangeFulfillmentModeChallenge;", "()Lcom/meijer/mobile/digitalshopping/api/cart/ChangeFulfillmentModeChallenge;", "b", "I", "c", "d", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.y$f$n, reason: from toString */
        public static final /* data */ class ShowFulfillmentModeChallengeEvent extends f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ChangeFulfillmentModeChallenge challenge;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int title;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int message;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isPickupStoreChallenge;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowFulfillmentModeChallengeEvent)) {
                    return false;
                }
                ShowFulfillmentModeChallengeEvent showFulfillmentModeChallengeEvent = (ShowFulfillmentModeChallengeEvent) other;
                return Intrinsics.e(this.challenge, showFulfillmentModeChallengeEvent.challenge) && this.title == showFulfillmentModeChallengeEvent.title && this.message == showFulfillmentModeChallengeEvent.message && this.isPickupStoreChallenge == showFulfillmentModeChallengeEvent.isPickupStoreChallenge;
            }

            public int hashCode() {
                return (((((this.challenge.hashCode() * 31) + Integer.hashCode(this.title)) * 31) + Integer.hashCode(this.message)) * 31) + Boolean.hashCode(this.isPickupStoreChallenge);
            }

            public String toString() {
                return "ShowFulfillmentModeChallengeEvent(challenge=" + this.challenge + ", title=" + this.title + ", message=" + this.message + ", isPickupStoreChallenge=" + this.isPickupStoreChallenge + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowFulfillmentModeChallengeEvent(ChangeFulfillmentModeChallenge challenge, int i10, int i11, boolean z10) {
                super(null);
                Intrinsics.j(challenge, "challenge");
                this.challenge = challenge;
                this.title = i10;
                this.message = i11;
                this.isPickupStoreChallenge = z10;
            }

            /* renamed from: a, reason: from getter */
            public final ChangeFulfillmentModeChallenge getChallenge() {
                return this.challenge;
            }

            /* renamed from: b, reason: from getter */
            public final int getMessage() {
                return this.message;
            }

            /* renamed from: c, reason: from getter */
            public final int getTitle() {
                return this.title;
            }

            /* renamed from: d, reason: from getter */
            public final boolean getIsPickupStoreChallenge() {
                return this.isPickupStoreChallenge;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$o;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.y$f$o, reason: from toString */
        public static final /* data */ class ShowNoDeliveryStoresNearbyDialogEvent extends f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String message;

            public ShowNoDeliveryStoresNearbyDialogEvent(String str) {
                super(null);
                this.message = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowNoDeliveryStoresNearbyDialogEvent) && Intrinsics.e(this.message, ((ShowNoDeliveryStoresNearbyDialogEvent) other).message);
            }

            public int hashCode() {
                String str = this.message;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "ShowNoDeliveryStoresNearbyDialogEvent(message=" + this.message + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getMessage() {
                return this.message;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$f$p;", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class p extends f {

            /* renamed from: a, reason: collision with root package name */
            public static final p f110931a = new p();

            private p() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof p);
            }

            public int hashCode() {
                return 1418908458;
            }

            public String toString() {
                return "ShowPickupNotSupportedDialogEvent";
            }
        }

        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private f() {
        }
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B«\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ´\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b,\u00102\u001a\u0004\b3\u00104R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b(\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010'\u001a\u0004\b=\u0010)R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\b8\u0006¢\u0006\f\n\u0004\b>\u00102\u001a\u0004\b8\u00104R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b=\u0010?\u001a\u0004\b@\u0010#R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010'\u001a\u0004\b>\u0010)R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010'\u001a\u0004\bA\u0010)R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b<\u0010DR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bE\u0010!R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b3\u0010G\u001a\u0004\b.\u0010HR\u001d\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\b8\u0006¢\u0006\f\n\u0004\b:\u00102\u001a\u0004\bB\u00104¨\u0006K"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/y$g;", "", "", "changingOptions", "Lfj/C;", "cart", "Lcom/meijer/mobile/meijer/activity/orderoptions/r;", "orderOptionsDecorator", "", "Lpk/h;", "storeDetailsList", "Lfj/e;", "cartChanges", "Lcom/meijer/mobile/meijer/activity/orderoptions/t;", "timeSlotDecorator", "newStoreSelected", "Ldi/c;", "listOfSavedAddresses", "", "numberOfSavedAddresses", "newDeliveryAddressSelected", "isEditedByUser", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$d;", "loadingState", "", "previousPageName", "Lbk/a;", "calloutViewMessage", "<init>", "(ZLfj/C;Lcom/meijer/mobile/meijer/activity/orderoptions/r;Ljava/util/List;Lfj/e;Lcom/meijer/mobile/meijer/activity/orderoptions/t;ZLjava/util/List;IZZLcom/meijer/mobile/meijer/activity/orderoptions/y$d;Ljava/lang/String;Lbk/a;)V", "a", "(ZLfj/C;Lcom/meijer/mobile/meijer/activity/orderoptions/r;Ljava/util/List;Lfj/e;Lcom/meijer/mobile/meijer/activity/orderoptions/t;ZLjava/util/List;IZZLcom/meijer/mobile/meijer/activity/orderoptions/y$d;Ljava/lang/String;Lbk/a;)Lcom/meijer/mobile/meijer/activity/orderoptions/y$g;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "e", "()Z", "b", "Lfj/C;", "d", "()Lfj/C;", "c", "Lcom/meijer/mobile/meijer/activity/orderoptions/r;", "k", "()Lcom/meijer/mobile/meijer/activity/orderoptions/r;", "Ljava/util/List;", "n", "()Ljava/util/List;", "Lfj/e;", "getCartChanges", "()Lfj/e;", "f", "Lcom/meijer/mobile/meijer/activity/orderoptions/t;", "o", "()Lcom/meijer/mobile/meijer/activity/orderoptions/t;", "g", "i", "h", "I", "j", "p", "l", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$d;", "()Lcom/meijer/mobile/meijer/activity/orderoptions/y$d;", "m", "Ljava/lang/String;", "Lbk/a;", "()Lbk/a;", "Lcom/meijer/mobile/meijer/activity/orderoptions/s;", "orderOptionsList", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.orderoptions.y$g, reason: from toString */
    public static final /* data */ class OrderOptionsViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean changingOptions;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ShoppingCart cart;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final OrderOptionsDecorator orderOptionsDecorator;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<StoreDetails> storeDetailsList;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final CartChanges cartChanges;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final OrderOptionsTimeDecorator timeSlotDecorator;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean newStoreSelected;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<CustomerAddress> listOfSavedAddresses;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final int numberOfSavedAddresses;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean newDeliveryAddressSelected;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isEditedByUser;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final LoadingState loadingState;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final String previousPageName;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a calloutViewMessage;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final List<OrderOptionsListItem> orderOptionsList;

        public OrderOptionsViewState() {
            this(false, null, null, null, null, null, false, null, 0, false, false, null, null, null, 16383, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderOptionsViewState)) {
                return false;
            }
            OrderOptionsViewState orderOptionsViewState = (OrderOptionsViewState) other;
            return this.changingOptions == orderOptionsViewState.changingOptions && Intrinsics.e(this.cart, orderOptionsViewState.cart) && Intrinsics.e(this.orderOptionsDecorator, orderOptionsViewState.orderOptionsDecorator) && Intrinsics.e(this.storeDetailsList, orderOptionsViewState.storeDetailsList) && Intrinsics.e(this.cartChanges, orderOptionsViewState.cartChanges) && Intrinsics.e(this.timeSlotDecorator, orderOptionsViewState.timeSlotDecorator) && this.newStoreSelected == orderOptionsViewState.newStoreSelected && Intrinsics.e(this.listOfSavedAddresses, orderOptionsViewState.listOfSavedAddresses) && this.numberOfSavedAddresses == orderOptionsViewState.numberOfSavedAddresses && this.newDeliveryAddressSelected == orderOptionsViewState.newDeliveryAddressSelected && this.isEditedByUser == orderOptionsViewState.isEditedByUser && Intrinsics.e(this.loadingState, orderOptionsViewState.loadingState) && Intrinsics.e(this.previousPageName, orderOptionsViewState.previousPageName) && Intrinsics.e(this.calloutViewMessage, orderOptionsViewState.calloutViewMessage);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.changingOptions) * 31;
            ShoppingCart shoppingCart = this.cart;
            int iHashCode2 = (iHashCode + (shoppingCart == null ? 0 : shoppingCart.hashCode())) * 31;
            OrderOptionsDecorator orderOptionsDecorator = this.orderOptionsDecorator;
            int iHashCode3 = (((iHashCode2 + (orderOptionsDecorator == null ? 0 : orderOptionsDecorator.hashCode())) * 31) + this.storeDetailsList.hashCode()) * 31;
            CartChanges cartChanges = this.cartChanges;
            int iHashCode4 = (iHashCode3 + (cartChanges == null ? 0 : cartChanges.hashCode())) * 31;
            OrderOptionsTimeDecorator tVar = this.timeSlotDecorator;
            int iHashCode5 = (((((((((((((iHashCode4 + (tVar == null ? 0 : tVar.hashCode())) * 31) + Boolean.hashCode(this.newStoreSelected)) * 31) + this.listOfSavedAddresses.hashCode()) * 31) + Integer.hashCode(this.numberOfSavedAddresses)) * 31) + Boolean.hashCode(this.newDeliveryAddressSelected)) * 31) + Boolean.hashCode(this.isEditedByUser)) * 31) + this.loadingState.hashCode()) * 31;
            String str = this.previousPageName;
            int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            AbstractC6392a abstractC6392a = this.calloutViewMessage;
            return iHashCode6 + (abstractC6392a != null ? abstractC6392a.hashCode() : 0);
        }

        public String toString() {
            return "OrderOptionsViewState(changingOptions=" + this.changingOptions + ", cart=" + this.cart + ", orderOptionsDecorator=" + this.orderOptionsDecorator + ", storeDetailsList=" + this.storeDetailsList + ", cartChanges=" + this.cartChanges + ", timeSlotDecorator=" + this.timeSlotDecorator + ", newStoreSelected=" + this.newStoreSelected + ", listOfSavedAddresses=" + this.listOfSavedAddresses + ", numberOfSavedAddresses=" + this.numberOfSavedAddresses + ", newDeliveryAddressSelected=" + this.newDeliveryAddressSelected + ", isEditedByUser=" + this.isEditedByUser + ", loadingState=" + this.loadingState + ", previousPageName=" + this.previousPageName + ", calloutViewMessage=" + this.calloutViewMessage + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00e9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public OrderOptionsViewState(boolean r34, fj.ShoppingCart r35, com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsDecorator r36, java.util.List<pk.StoreDetails> r37, fj.CartChanges r38, com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsTimeDecorator r39, boolean r40, java.util.List<di.CustomerAddress> r41, int r42, boolean r43, boolean r44, com.meijer.mobile.meijer.activity.orderoptions.y.LoadingState r45, java.lang.String r46, bk.AbstractC6392a r47) {
            /*
                Method dump skipped, instructions count: 1014
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.orderoptions.y.OrderOptionsViewState.<init>(boolean, fj.C, com.meijer.mobile.meijer.activity.orderoptions.r, java.util.List, fj.e, com.meijer.mobile.meijer.activity.orderoptions.t, boolean, java.util.List, int, boolean, boolean, com.meijer.mobile.meijer.activity.orderoptions.y$d, java.lang.String, bk.a):void");
        }

        public static /* synthetic */ OrderOptionsViewState b(OrderOptionsViewState orderOptionsViewState, boolean z10, ShoppingCart shoppingCart, OrderOptionsDecorator orderOptionsDecorator, List list, CartChanges cartChanges, OrderOptionsTimeDecorator tVar, boolean z11, List list2, int i10, boolean z12, boolean z13, LoadingState loadingState, String str, AbstractC6392a abstractC6392a, int i11, Object obj) {
            return orderOptionsViewState.a((i11 & 1) != 0 ? orderOptionsViewState.changingOptions : z10, (i11 & 2) != 0 ? orderOptionsViewState.cart : shoppingCart, (i11 & 4) != 0 ? orderOptionsViewState.orderOptionsDecorator : orderOptionsDecorator, (i11 & 8) != 0 ? orderOptionsViewState.storeDetailsList : list, (i11 & 16) != 0 ? orderOptionsViewState.cartChanges : cartChanges, (i11 & 32) != 0 ? orderOptionsViewState.timeSlotDecorator : tVar, (i11 & 64) != 0 ? orderOptionsViewState.newStoreSelected : z11, (i11 & 128) != 0 ? orderOptionsViewState.listOfSavedAddresses : list2, (i11 & 256) != 0 ? orderOptionsViewState.numberOfSavedAddresses : i10, (i11 & 512) != 0 ? orderOptionsViewState.newDeliveryAddressSelected : z12, (i11 & 1024) != 0 ? orderOptionsViewState.isEditedByUser : z13, (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? orderOptionsViewState.loadingState : loadingState, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? orderOptionsViewState.previousPageName : str, (i11 & 8192) != 0 ? orderOptionsViewState.calloutViewMessage : abstractC6392a);
        }

        public final OrderOptionsViewState a(boolean changingOptions, ShoppingCart cart, OrderOptionsDecorator orderOptionsDecorator, List<StoreDetails> storeDetailsList, CartChanges cartChanges, OrderOptionsTimeDecorator timeSlotDecorator, boolean newStoreSelected, List<CustomerAddress> listOfSavedAddresses, int numberOfSavedAddresses, boolean newDeliveryAddressSelected, boolean isEditedByUser, LoadingState loadingState, String previousPageName, AbstractC6392a calloutViewMessage) {
            Intrinsics.j(storeDetailsList, "storeDetailsList");
            Intrinsics.j(listOfSavedAddresses, "listOfSavedAddresses");
            Intrinsics.j(loadingState, "loadingState");
            return new OrderOptionsViewState(changingOptions, cart, orderOptionsDecorator, storeDetailsList, cartChanges, timeSlotDecorator, newStoreSelected, listOfSavedAddresses, numberOfSavedAddresses, newDeliveryAddressSelected, isEditedByUser, loadingState, previousPageName, calloutViewMessage);
        }

        /* renamed from: c, reason: from getter */
        public final AbstractC6392a getCalloutViewMessage() {
            return this.calloutViewMessage;
        }

        /* renamed from: d, reason: from getter */
        public final ShoppingCart getCart() {
            return this.cart;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getChangingOptions() {
            return this.changingOptions;
        }

        public final List<CustomerAddress> f() {
            return this.listOfSavedAddresses;
        }

        /* renamed from: g, reason: from getter */
        public final LoadingState getLoadingState() {
            return this.loadingState;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getNewDeliveryAddressSelected() {
            return this.newDeliveryAddressSelected;
        }

        /* renamed from: i, reason: from getter */
        public final boolean getNewStoreSelected() {
            return this.newStoreSelected;
        }

        /* renamed from: j, reason: from getter */
        public final int getNumberOfSavedAddresses() {
            return this.numberOfSavedAddresses;
        }

        /* renamed from: k, reason: from getter */
        public final OrderOptionsDecorator getOrderOptionsDecorator() {
            return this.orderOptionsDecorator;
        }

        public final List<OrderOptionsListItem> l() {
            return this.orderOptionsList;
        }

        /* renamed from: m, reason: from getter */
        public final String getPreviousPageName() {
            return this.previousPageName;
        }

        public final List<StoreDetails> n() {
            return this.storeDetailsList;
        }

        /* renamed from: o, reason: from getter */
        public final OrderOptionsTimeDecorator getTimeSlotDecorator() {
            return this.timeSlotDecorator;
        }

        /* renamed from: p, reason: from getter */
        public final boolean getIsEditedByUser() {
            return this.isEditedByUser;
        }

        public /* synthetic */ OrderOptionsViewState(boolean z10, ShoppingCart shoppingCart, OrderOptionsDecorator orderOptionsDecorator, List list, CartChanges cartChanges, OrderOptionsTimeDecorator tVar, boolean z11, List list2, int i10, boolean z12, boolean z13, LoadingState loadingState, String str, AbstractC6392a abstractC6392a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? null : shoppingCart, (i11 & 4) != 0 ? new OrderOptionsDecorator(null, null, null, null, null, null, 63, null) : orderOptionsDecorator, (i11 & 8) != 0 ? CollectionsKt.m() : list, (i11 & 16) != 0 ? null : cartChanges, (i11 & 32) != 0 ? null : tVar, (i11 & 64) != 0 ? false : z11, (i11 & 128) != 0 ? CollectionsKt.m() : list2, (i11 & 256) != 0 ? 0 : i10, (i11 & 512) != 0 ? false : z12, (i11 & 1024) != 0 ? false : z13, (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? new LoadingState(false, null) : loadingState, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str, (i11 & 8192) != 0 ? null : abstractC6392a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsViewModel$changeToDelivery$1$1", f = "OrderOptionsViewModel.kt", l = {703}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f110947a;

        /* renamed from: b, reason: collision with root package name */
        int f110948b;

        /* renamed from: c, reason: collision with root package name */
        int f110949c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f110950d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Integer f110952f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ OrderOptionsViewState f110953g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Integer num, OrderOptionsViewState orderOptionsViewState, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f110952f = num;
            this.f110953g = orderOptionsViewState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            h hVar = y.this.new h(this.f110952f, this.f110953g, continuation);
            hVar.f110950d = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v13, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v2, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r22;
            OrderOptionsViewState value;
            OrderOptionsViewState value2;
            List<EntryChange> listC;
            Integer storeId;
            Integer storeId2;
            OrderOptionsViewState value3;
            Object objD;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110949c;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    ?? r23 = (InterfaceC15783O) this.f110950d;
                    y.this.m0(true, AbstractC6392a.INSTANCE.d(Il.h.f14957q, new Object[0]));
                    InterfaceC16549B<OrderOptionsViewState> interfaceC16549BX = y.this.X();
                    do {
                        value3 = interfaceC16549BX.getValue();
                    } while (!interfaceC16549BX.e(value3, OrderOptionsViewState.b(value3, true, null, null, null, null, null, false, null, 0, false, false, null, null, null, 16382, null)));
                    y yVar = y.this;
                    Integer num = this.f110952f;
                    OrderOptionsViewState orderOptionsViewState = this.f110953g;
                    Result.Companion companion = Result.INSTANCE;
                    il.m mVar = yVar.cartRepository;
                    OrderOptionsDecorator orderOptionsDecorator = orderOptionsViewState.getOrderOptionsDecorator();
                    CustomerAddress deliveryAddress = orderOptionsDecorator != null ? orderOptionsDecorator.getDeliveryAddress() : null;
                    Intrinsics.g(deliveryAddress);
                    n.Delivery delivery = new n.Delivery(num, deliveryAddress, false, 4, null);
                    this.f110950d = r23;
                    this.f110947a = r23;
                    this.f110948b = 0;
                    this.f110949c = 1;
                    objD = mVar.D(delivery, this);
                    i10 = r23;
                    if (objD == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r24 = (InterfaceC15783O) this.f110950d;
                    ResultKt.b(obj);
                    objD = obj;
                    i10 = r24;
                }
                objB = Result.b((uk.c) objD);
                r22 = i10;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
                r22 = i10;
            }
            y yVar2 = y.this;
            Integer num2 = this.f110952f;
            if (Result.h(objB)) {
                uk.c cVar = (uk.c) objB;
                if (cVar instanceof c.Success) {
                    int iIntValue = num2 != null ? num2.intValue() : 0;
                    c.Success success = (c.Success) cVar;
                    CartChanges cartChanges = (CartChanges) success.a();
                    yVar2.o0("delivery", iIntValue, (cartChanges == null || (storeId2 = cartChanges.getStoreId()) == null) ? num2 != null ? num2.intValue() : 0 : storeId2.intValue());
                    CartChanges cartChanges2 = (CartChanges) success.a();
                    y.u0(yVar2, (cartChanges2 == null || (storeId = cartChanges2.getStoreId()) == null) ? 0 : storeId.intValue(), null, null, 6, null);
                    yVar2.k0(f.a.f110899a);
                } else if (cVar instanceof c.Failure) {
                    InterfaceC16549B<OrderOptionsViewState> interfaceC16549BX2 = yVar2.X();
                    do {
                        value2 = interfaceC16549BX2.getValue();
                    } while (!interfaceC16549BX2.e(value2, OrderOptionsViewState.b(value2, false, null, null, null, null, null, false, null, 0, false, false, null, null, null, 16382, null)));
                    c.Failure failure = (c.Failure) cVar;
                    Throwable error = failure.getError();
                    if (error instanceof ChangeFulfillmentModeChallenge) {
                        Throwable error2 = failure.getError();
                        Intrinsics.h(error2, "null cannot be cast to non-null type com.meijer.mobile.digitalshopping.api.cart.ChangeFulfillmentModeChallenge");
                        ChangeFulfillmentModeChallenge changeFulfillmentModeChallenge = (ChangeFulfillmentModeChallenge) error2;
                        Throwable error3 = failure.getError();
                        Intrinsics.h(error3, "null cannot be cast to non-null type com.meijer.mobile.digitalshopping.api.cart.ChangeFulfillmentModeChallenge");
                        ChangeFulfillmentModeChallenge changeFulfillmentModeChallenge2 = (ChangeFulfillmentModeChallenge) error3;
                        CartChanges cartChanges3 = (CartChanges) failure.a();
                        if (cartChanges3 == null || (listC = cartChanges3.c()) == null || !Boxing.d(listC.size()).equals(Boxing.d(0))) {
                            yVar2.k0(new f.FulfillmentChangeCallout("delivery", changeFulfillmentModeChallenge2, (CartChanges) failure.a()));
                        } else {
                            yVar2.k0(new f.ShowFulfillmentModeChallengeEvent(changeFulfillmentModeChallenge, Il.h.f14954n, Il.h.f14953m, false));
                        }
                    } else if (error instanceof DigitalShoppingApiException) {
                        yVar2.k0(new f.ShowNoDeliveryStoresNearbyDialogEvent(failure.getError().getMessage()));
                    } else if (error instanceof JsonEncodingException) {
                        yVar2.k0(new f.GenericFailureEvent(Q.f171792z, Q.f171791y));
                    }
                } else if (!(cVar instanceof c.Loading)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            y yVar3 = y.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                E0.i(r22.getCoroutineContext());
                if (thE instanceof Error) {
                    throw thE;
                }
                InterfaceC16549B<OrderOptionsViewState> interfaceC16549BX3 = yVar3.X();
                do {
                    value = interfaceC16549BX3.getValue();
                } while (!interfaceC16549BX3.e(value, OrderOptionsViewState.b(value, false, null, null, null, null, null, false, null, 0, false, false, null, null, null, 16382, null)));
                qw.a.INSTANCE.c(com.meijer.mobile.core.networking.exceptions.a.a(thE), "Change fulfillment mode to delivery failed.", new Object[0]);
                yVar3.k0(new f.FailEvent(Y.f100392E0));
            }
            y.this.m0(false, null);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsViewModel$changeToPickup$1$1", f = "OrderOptionsViewModel.kt", l = {619}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f110954a;

        /* renamed from: b, reason: collision with root package name */
        int f110955b;

        /* renamed from: c, reason: collision with root package name */
        int f110956c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f110957d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f110959f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Integer f110960g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ OrderOptionsViewState f110961h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i10, Integer num, OrderOptionsViewState orderOptionsViewState, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f110959f = i10;
            this.f110960g = num;
            this.f110961h = orderOptionsViewState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            i iVar = y.this.new i(this.f110959f, this.f110960g, this.f110961h, continuation);
            iVar.f110957d = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v12, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v2, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r22;
            OrderOptionsViewState value;
            OrderOptionsViewState value2;
            List<EntryChange> listC;
            StoreDecorator store;
            StoreDecorator store2;
            StoreDecorator store3;
            Integer storeId;
            Integer storeId2;
            OrderOptionsViewState value3;
            Object objD;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110956c;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    ?? r23 = (InterfaceC15783O) this.f110957d;
                    InterfaceC16549B<OrderOptionsViewState> interfaceC16549BX = y.this.X();
                    do {
                        value3 = interfaceC16549BX.getValue();
                    } while (!interfaceC16549BX.e(value3, OrderOptionsViewState.b(value3, true, null, null, null, null, null, false, null, 0, false, false, null, null, null, 16382, null)));
                    y.this.m0(true, AbstractC6392a.INSTANCE.d(Il.h.f14959s, new Object[0]));
                    y yVar = y.this;
                    int i11 = this.f110959f;
                    Result.Companion companion = Result.INSTANCE;
                    il.m mVar = yVar.cartRepository;
                    n.Pickup pickup = new n.Pickup(Boxing.d(i11));
                    this.f110957d = r23;
                    this.f110954a = r23;
                    this.f110955b = 0;
                    this.f110956c = 1;
                    objD = mVar.D(pickup, this);
                    i10 = r23;
                    if (objD == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r24 = (InterfaceC15783O) this.f110957d;
                    ResultKt.b(obj);
                    objD = obj;
                    i10 = r24;
                }
                objB = Result.b((uk.c) objD);
                r22 = i10;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
                r22 = i10;
            }
            y yVar2 = y.this;
            Integer num = this.f110960g;
            OrderOptionsViewState orderOptionsViewState = this.f110961h;
            if (Result.h(objB)) {
                uk.c cVar = (uk.c) objB;
                if (cVar instanceof c.Success) {
                    int iIntValue = num != null ? num.intValue() : 0;
                    CartChanges cartChanges = (CartChanges) ((c.Success) cVar).a();
                    yVar2.o0("pickup", iIntValue, (cartChanges == null || (storeId2 = cartChanges.getStoreId()) == null) ? 0 : storeId2.intValue());
                    OrderOptionsDecorator orderOptionsDecorator = orderOptionsViewState.getOrderOptionsDecorator();
                    int iIntValue2 = (orderOptionsDecorator == null || (store3 = orderOptionsDecorator.getStore()) == null || (storeId = store3.getStoreId()) == null) ? 0 : storeId.intValue();
                    OrderOptionsDecorator orderOptionsDecorator2 = orderOptionsViewState.getOrderOptionsDecorator();
                    String name = (orderOptionsDecorator2 == null || (store2 = orderOptionsDecorator2.getStore()) == null) ? null : store2.getName();
                    OrderOptionsDecorator orderOptionsDecorator3 = orderOptionsViewState.getOrderOptionsDecorator();
                    yVar2.t0(iIntValue2, name, (orderOptionsDecorator3 == null || (store = orderOptionsDecorator3.getStore()) == null) ? null : store.getZipCode());
                    yVar2.k0(f.a.f110899a);
                } else if (cVar instanceof c.Failure) {
                    InterfaceC16549B<OrderOptionsViewState> interfaceC16549BX2 = yVar2.X();
                    do {
                        value2 = interfaceC16549BX2.getValue();
                    } while (!interfaceC16549BX2.e(value2, OrderOptionsViewState.b(value2, false, null, null, null, null, null, false, null, 0, false, false, null, null, null, 16382, null)));
                    c.Failure failure = (c.Failure) cVar;
                    Throwable error = failure.getError();
                    if (error instanceof ChangeFulfillmentModeChallenge) {
                        Throwable error2 = failure.getError();
                        Intrinsics.h(error2, "null cannot be cast to non-null type com.meijer.mobile.digitalshopping.api.cart.ChangeFulfillmentModeChallenge");
                        ChangeFulfillmentModeChallenge changeFulfillmentModeChallenge = (ChangeFulfillmentModeChallenge) error2;
                        CartChanges cartChanges2 = (CartChanges) failure.a();
                        if (cartChanges2 == null || (listC = cartChanges2.c()) == null || !Boxing.d(listC.size()).equals(Boxing.d(0))) {
                            yVar2.k0(new f.FulfillmentChangeCallout("pickup", changeFulfillmentModeChallenge, (CartChanges) failure.a()));
                        }
                    } else if (error instanceof DigitalShoppingApiException) {
                        qw.a.INSTANCE.f(com.meijer.mobile.core.networking.exceptions.a.a(failure.getError()), "Error checking cart changes", new Object[0]);
                        yVar2.m0(false, null);
                        yVar2.k0(new f.FailEvent(Il.h.f14952l));
                    }
                } else if (!(cVar instanceof c.Loading)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            y yVar3 = y.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                E0.i(r22.getCoroutineContext());
                if (thE instanceof Error) {
                    throw thE;
                }
                InterfaceC16549B<OrderOptionsViewState> interfaceC16549BX3 = yVar3.X();
                do {
                    value = interfaceC16549BX3.getValue();
                } while (!interfaceC16549BX3.e(value, OrderOptionsViewState.b(value, false, null, null, null, null, null, false, null, 0, false, false, null, null, null, 16382, null)));
                yVar3.k0(new f.FailEvent(Il.h.f14952l));
            }
            y.this.m0(false, null);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsViewModel$checkForPickupSupport$1", f = "OrderOptionsViewModel.kt", l = {567}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f110962a;

        /* renamed from: b, reason: collision with root package name */
        int f110963b;

        /* renamed from: c, reason: collision with root package name */
        int f110964c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f110965d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f110967f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i10, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f110967f = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            j jVar = y.this.new j(this.f110967f, continuation);
            jVar.f110965d = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r9.f110964c
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r0 = r9.f110962a
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r9.f110965d
                mv.O r0 = (mv.InterfaceC15783O) r0
                kotlin.ResultKt.b(r10)     // Catch: java.lang.Throwable -> L17
                goto L51
            L17:
                r10 = move-exception
                goto L5c
            L19:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L21:
                kotlin.ResultKt.b(r10)
                java.lang.Object r10 = r9.f110965d
                mv.O r10 = (mv.InterfaceC15783O) r10
                com.meijer.mobile.meijer.activity.orderoptions.y r1 = com.meijer.mobile.meijer.activity.orderoptions.y.this
                int r3 = r9.f110967f
                kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L58
                bk.a$a r4 = bk.AbstractC6392a.INSTANCE     // Catch: java.lang.Throwable -> L58
                int r5 = Il.h.f14960t     // Catch: java.lang.Throwable -> L58
                r6 = 0
                java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L58
                bk.a r4 = r4.d(r5, r7)     // Catch: java.lang.Throwable -> L58
                com.meijer.mobile.meijer.activity.orderoptions.y.L(r1, r2, r4)     // Catch: java.lang.Throwable -> L58
                Zq.b r1 = com.meijer.mobile.meijer.activity.orderoptions.y.y(r1)     // Catch: java.lang.Throwable -> L58
                r9.f110965d = r10     // Catch: java.lang.Throwable -> L58
                r9.f110962a = r10     // Catch: java.lang.Throwable -> L58
                r9.f110963b = r6     // Catch: java.lang.Throwable -> L58
                r9.f110964c = r2     // Catch: java.lang.Throwable -> L58
                java.lang.Object r1 = r1.e(r3, r9)     // Catch: java.lang.Throwable -> L58
                if (r1 != r0) goto L4f
                return r0
            L4f:
                r0 = r10
                r10 = r1
            L51:
                com.meijer.mobile.storeinfo.api.model.StoreInfo r10 = (com.meijer.mobile.storeinfo.api.model.StoreInfo) r10     // Catch: java.lang.Throwable -> L17
                java.lang.Object r10 = kotlin.Result.b(r10)     // Catch: java.lang.Throwable -> L17
                goto L66
            L58:
                r0 = move-exception
                r8 = r0
                r0 = r10
                r10 = r8
            L5c:
                kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
                java.lang.Object r10 = kotlin.ResultKt.a(r10)
                java.lang.Object r10 = kotlin.Result.b(r10)
            L66:
                com.meijer.mobile.meijer.activity.orderoptions.y r1 = com.meijer.mobile.meijer.activity.orderoptions.y.this
                int r2 = r9.f110967f
                boolean r3 = kotlin.Result.h(r10)
                if (r3 == 0) goto L76
                r3 = r10
                com.meijer.mobile.storeinfo.api.model.StoreInfo r3 = (com.meijer.mobile.storeinfo.api.model.StoreInfo) r3
                com.meijer.mobile.meijer.activity.orderoptions.y.A(r1, r3, r2)
            L76:
                com.meijer.mobile.meijer.activity.orderoptions.y r1 = com.meijer.mobile.meijer.activity.orderoptions.y.this
                java.lang.Throwable r10 = kotlin.Result.e(r10)
                if (r10 == 0) goto L8e
                kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
                mv.E0.i(r0)
                boolean r0 = r10 instanceof java.lang.Error
                if (r0 != 0) goto L8d
                com.meijer.mobile.meijer.activity.orderoptions.y.x(r1, r10)
                goto L8e
            L8d:
                throw r10
            L8e:
                kotlin.Unit r10 = kotlin.Unit.f143329a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.orderoptions.y.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsViewModel$fetchSavedAddresses$1", f = "OrderOptionsViewModel.kt", l = {1016}, m = "invokeSuspend")
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f110968a;

        /* renamed from: b, reason: collision with root package name */
        int f110969b;

        /* renamed from: c, reason: collision with root package name */
        int f110970c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f110971d;

        k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            k kVar = y.this.new k(continuation);
            kVar.f110971d = obj;
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r5.f110970c
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r0 = r5.f110968a
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r5.f110971d
                mv.O r0 = (mv.InterfaceC15783O) r0
                kotlin.ResultKt.b(r6)     // Catch: java.lang.Throwable -> L17
                goto L42
            L17:
                r6 = move-exception
                goto L4d
            L19:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L21:
                kotlin.ResultKt.b(r6)
                java.lang.Object r6 = r5.f110971d
                mv.O r6 = (mv.InterfaceC15783O) r6
                com.meijer.mobile.meijer.activity.orderoptions.y r1 = com.meijer.mobile.meijer.activity.orderoptions.y.this
                kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L49
                Ch.a r1 = com.meijer.mobile.meijer.activity.orderoptions.y.t(r1)     // Catch: java.lang.Throwable -> L49
                r5.f110971d = r6     // Catch: java.lang.Throwable -> L49
                r5.f110968a = r6     // Catch: java.lang.Throwable -> L49
                r3 = 0
                r5.f110969b = r3     // Catch: java.lang.Throwable -> L49
                r5.f110970c = r2     // Catch: java.lang.Throwable -> L49
                java.lang.Object r1 = r1.c(r5)     // Catch: java.lang.Throwable -> L49
                if (r1 != r0) goto L40
                return r0
            L40:
                r0 = r6
                r6 = r1
            L42:
                java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L17
                java.lang.Object r6 = kotlin.Result.b(r6)     // Catch: java.lang.Throwable -> L17
                goto L57
            L49:
                r0 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
            L4d:
                kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
                java.lang.Object r6 = kotlin.ResultKt.a(r6)
                java.lang.Object r6 = kotlin.Result.b(r6)
            L57:
                com.meijer.mobile.meijer.activity.orderoptions.y r1 = com.meijer.mobile.meijer.activity.orderoptions.y.this
                boolean r2 = kotlin.Result.h(r6)
                if (r2 == 0) goto L65
                r2 = r6
                java.util.List r2 = (java.util.List) r2
                com.meijer.mobile.meijer.activity.orderoptions.y.G(r1, r2)
            L65:
                com.meijer.mobile.meijer.activity.orderoptions.y r1 = com.meijer.mobile.meijer.activity.orderoptions.y.this
                java.lang.Throwable r6 = kotlin.Result.e(r6)
                if (r6 == 0) goto L7d
                kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
                mv.E0.i(r0)
                boolean r0 = r6 instanceof java.lang.Error
                if (r0 != 0) goto L7c
                com.meijer.mobile.meijer.activity.orderoptions.y.F(r1, r6)
                goto L7d
            L7c:
                throw r6
            L7d:
                kotlin.Unit r6 = kotlin.Unit.f143329a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.orderoptions.y.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsViewModel$getHomeStore$1", f = "OrderOptionsViewModel.kt", l = {942}, m = "invokeSuspend")
    static final class l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f110973a;

        /* renamed from: b, reason: collision with root package name */
        int f110974b;

        /* renamed from: c, reason: collision with root package name */
        int f110975c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f110976d;

        l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            l lVar = y.this.new l(continuation);
            lVar.f110976d = obj;
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r8.f110975c
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r0 = r8.f110973a
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r8.f110976d
                mv.O r0 = (mv.InterfaceC15783O) r0
                kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L17
                goto L4a
            L17:
                r9 = move-exception
                goto L55
            L19:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L21:
                kotlin.ResultKt.b(r9)
                java.lang.Object r9 = r8.f110976d
                mv.O r9 = (mv.InterfaceC15783O) r9
                com.meijer.mobile.meijer.activity.orderoptions.y r1 = com.meijer.mobile.meijer.activity.orderoptions.y.this
                kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L51
                Zq.b r3 = com.meijer.mobile.meijer.activity.orderoptions.y.y(r1)     // Catch: java.lang.Throwable -> L51
                yo.f r1 = com.meijer.mobile.meijer.activity.orderoptions.y.B(r1)     // Catch: java.lang.Throwable -> L51
                int r1 = r1.b()     // Catch: java.lang.Throwable -> L51
                r8.f110976d = r9     // Catch: java.lang.Throwable -> L51
                r8.f110973a = r9     // Catch: java.lang.Throwable -> L51
                r4 = 0
                r8.f110974b = r4     // Catch: java.lang.Throwable -> L51
                r8.f110975c = r2     // Catch: java.lang.Throwable -> L51
                java.lang.Object r1 = r3.e(r1, r8)     // Catch: java.lang.Throwable -> L51
                if (r1 != r0) goto L48
                return r0
            L48:
                r0 = r9
                r9 = r1
            L4a:
                com.meijer.mobile.storeinfo.api.model.StoreInfo r9 = (com.meijer.mobile.storeinfo.api.model.StoreInfo) r9     // Catch: java.lang.Throwable -> L17
                java.lang.Object r9 = kotlin.Result.b(r9)     // Catch: java.lang.Throwable -> L17
                goto L5f
            L51:
                r0 = move-exception
                r7 = r0
                r0 = r9
                r9 = r7
            L55:
                kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
                java.lang.Object r9 = kotlin.ResultKt.a(r9)
                java.lang.Object r9 = kotlin.Result.b(r9)
            L5f:
                com.meijer.mobile.meijer.activity.orderoptions.y r1 = com.meijer.mobile.meijer.activity.orderoptions.y.this
                boolean r2 = kotlin.Result.h(r9)
                if (r2 == 0) goto L8d
                r2 = r9
                com.meijer.mobile.storeinfo.api.model.StoreInfo r2 = (com.meijer.mobile.storeinfo.api.model.StoreInfo) r2
                java.util.List r2 = r2.a()
                java.lang.Object r2 = kotlin.collections.CollectionsKt.u0(r2)
                com.meijer.mobile.storeinfo.api.model.Store r2 = (com.meijer.mobile.storeinfo.api.model.Store) r2
                if (r2 == 0) goto L8d
                java.lang.Double r3 = r2.getLatitude()
                if (r3 == 0) goto L8d
                double r3 = r3.doubleValue()
                java.lang.Double r2 = r2.getLongitude()
                if (r2 == 0) goto L8d
                double r5 = r2.doubleValue()
                com.meijer.mobile.meijer.activity.orderoptions.y.I(r1, r3, r5)
            L8d:
                com.meijer.mobile.meijer.activity.orderoptions.y r1 = com.meijer.mobile.meijer.activity.orderoptions.y.this
                java.lang.Throwable r9 = kotlin.Result.e(r9)
                if (r9 == 0) goto La5
                kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
                mv.E0.i(r0)
                boolean r0 = r9 instanceof java.lang.Error
                if (r0 != 0) goto La4
                com.meijer.mobile.meijer.activity.orderoptions.y.H(r1, r9)
                goto La5
            La4:
                throw r9
            La5:
                kotlin.Unit r9 = kotlin.Unit.f143329a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.orderoptions.y.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsViewModel$onFulfillmentChallengeResult$1$1", f = "OrderOptionsViewModel.kt", l = {822}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class m extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f110978a;

        /* renamed from: b, reason: collision with root package name */
        int f110979b;

        /* renamed from: c, reason: collision with root package name */
        int f110980c;

        /* renamed from: d, reason: collision with root package name */
        int f110981d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f110982e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC17440a<fj.n, CartChanges> f110983f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ y f110984g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Integer f110985h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ OrderOptionsViewState f110986i;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            m mVar = new m(this.f110983f, this.f110984g, this.f110985h, this.f110986i, continuation);
            mVar.f110982e = obj;
            return mVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(AbstractC17440a<fj.n, CartChanges> abstractC17440a, y yVar, Integer num, OrderOptionsViewState orderOptionsViewState, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f110983f = abstractC17440a;
            this.f110984g = yVar;
            this.f110985h = num;
            this.f110986i = orderOptionsViewState;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((m) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v13, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v2, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r22;
            OrderOptionsViewState value;
            OrderOptionsViewState value2;
            int i10;
            int i11;
            Integer storeId;
            Integer storeId2;
            StoreDecorator store;
            StoreDecorator store2;
            StoreDecorator store3;
            Integer storeId3;
            int i12;
            OrderOptionsViewState value3;
            Object objE;
            Object objF = IntrinsicsKt.f();
            int i13 = this.f110981d;
            try {
                if (i13 == 0) {
                    ResultKt.b(obj);
                    ?? r23 = (InterfaceC15783O) this.f110982e;
                    fj.n nVarF = this.f110983f.f();
                    if (nVarF instanceof n.Delivery) {
                        i12 = Il.h.f14957q;
                    } else {
                        if (!(nVarF instanceof n.Pickup)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i12 = Il.h.f14958r;
                    }
                    this.f110984g.m0(true, AbstractC6392a.INSTANCE.d(i12, new Object[0]));
                    InterfaceC16549B<OrderOptionsViewState> interfaceC16549BX = this.f110984g.X();
                    do {
                        value3 = interfaceC16549BX.getValue();
                    } while (!interfaceC16549BX.e(value3, OrderOptionsViewState.b(value3, true, null, null, null, null, null, false, null, 0, false, false, null, null, null, 16382, null)));
                    y yVar = this.f110984g;
                    AbstractC17440a<fj.n, CartChanges> abstractC17440a = this.f110983f;
                    Result.Companion companion = Result.INSTANCE;
                    il.m mVar = yVar.cartRepository;
                    this.f110982e = r23;
                    this.f110978a = r23;
                    this.f110979b = i12;
                    this.f110980c = 0;
                    this.f110981d = 1;
                    objE = mVar.E(abstractC17440a, this);
                    i13 = r23;
                    if (objE == objF) {
                        return objF;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r24 = (InterfaceC15783O) this.f110982e;
                    ResultKt.b(obj);
                    objE = obj;
                    i13 = r24;
                }
                objB = Result.b((uk.c) objE);
                r22 = i13;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
                r22 = i13;
            }
            y yVar2 = this.f110984g;
            AbstractC17440a<fj.n, CartChanges> abstractC17440a2 = this.f110983f;
            Integer num = this.f110985h;
            OrderOptionsViewState orderOptionsViewState = this.f110986i;
            if (Result.h(objB)) {
                uk.c cVar = (uk.c) objB;
                if (cVar instanceof c.Success) {
                    String str = abstractC17440a2.f() instanceof n.Delivery ? "delivery" : "pickup";
                    int iIntValue = num != null ? num.intValue() : 0;
                    c.Success success = (c.Success) cVar;
                    CartChanges cartChanges = (CartChanges) success.a();
                    yVar2.o0(str, iIntValue, ((cartChanges == null || (storeId = cartChanges.getStoreId()) == null) && (storeId = abstractC17440a2.f().getStoreId()) == null) ? 0 : storeId.intValue());
                    if (abstractC17440a2.f() instanceof n.Pickup) {
                        OrderOptionsDecorator orderOptionsDecorator = orderOptionsViewState.getOrderOptionsDecorator();
                        int iIntValue2 = (orderOptionsDecorator == null || (store3 = orderOptionsDecorator.getStore()) == null || (storeId3 = store3.getStoreId()) == null) ? 0 : storeId3.intValue();
                        OrderOptionsDecorator orderOptionsDecorator2 = orderOptionsViewState.getOrderOptionsDecorator();
                        String name = (orderOptionsDecorator2 == null || (store2 = orderOptionsDecorator2.getStore()) == null) ? null : store2.getName();
                        OrderOptionsDecorator orderOptionsDecorator3 = orderOptionsViewState.getOrderOptionsDecorator();
                        yVar2.t0(iIntValue2, name, (orderOptionsDecorator3 == null || (store = orderOptionsDecorator3.getStore()) == null) ? null : store.getZipCode());
                    } else {
                        CartChanges cartChanges2 = (CartChanges) success.a();
                        y.u0(yVar2, ((cartChanges2 == null || (storeId2 = cartChanges2.getStoreId()) == null) && (storeId2 = abstractC17440a2.f().getStoreId()) == null) ? 0 : storeId2.intValue(), null, null, 6, null);
                    }
                    if (!(abstractC17440a2 instanceof AbstractC17440a.Cancel)) {
                        yVar2.k0(f.a.f110899a);
                    }
                } else if (cVar instanceof c.Failure) {
                    InterfaceC16549B<OrderOptionsViewState> interfaceC16549BX2 = yVar2.X();
                    do {
                        value2 = interfaceC16549BX2.getValue();
                    } while (!interfaceC16549BX2.e(value2, OrderOptionsViewState.b(value2, false, null, null, null, null, null, false, null, 0, false, false, null, null, null, 16382, null)));
                    fj.n nVarF2 = abstractC17440a2.f();
                    if (nVarF2 instanceof n.Delivery) {
                        i10 = Il.h.f14954n;
                    } else {
                        if (!(nVarF2 instanceof n.Pickup)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i10 = Il.h.f14956p;
                    }
                    fj.n nVarF3 = abstractC17440a2.f();
                    if (nVarF3 instanceof n.Delivery) {
                        i11 = Il.h.f14953m;
                    } else {
                        if (!(nVarF3 instanceof n.Pickup)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i11 = Il.h.f14955o;
                    }
                    c.Failure failure = (c.Failure) cVar;
                    Throwable error = failure.getError();
                    if (error instanceof ChangeFulfillmentModeChallenge) {
                        Throwable error2 = failure.getError();
                        Intrinsics.h(error2, "null cannot be cast to non-null type com.meijer.mobile.digitalshopping.api.cart.ChangeFulfillmentModeChallenge");
                        yVar2.k0(new f.ShowFulfillmentModeChallengeEvent((ChangeFulfillmentModeChallenge) error2, i10, i11, abstractC17440a2.f() instanceof n.Pickup));
                    } else if (error instanceof DigitalShoppingApiException) {
                        qw.a.INSTANCE.f(com.meijer.mobile.core.networking.exceptions.a.a(failure.getError()), "Error accepting Challenge", new Object[0]);
                        yVar2.m0(false, null);
                        yVar2.k0(new f.FailEvent(Il.h.f14952l));
                    }
                } else if (!(cVar instanceof c.Loading)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            y yVar3 = this.f110984g;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                E0.i(r22.getCoroutineContext());
                if (thE instanceof Error) {
                    throw thE;
                }
                InterfaceC16549B<OrderOptionsViewState> interfaceC16549BX3 = yVar3.X();
                do {
                    value = interfaceC16549BX3.getValue();
                } while (!interfaceC16549BX3.e(value, OrderOptionsViewState.b(value, false, null, null, null, null, null, false, null, 0, false, false, null, null, null, 16382, null)));
                qw.a.INSTANCE.c(com.meijer.mobile.core.networking.exceptions.a.a(thE), "onFulfillmentChallengeResult failed.", new Object[0]);
                yVar3.k0(new f.FailEvent(Y.f100392E0));
            }
            this.f110984g.m0(false, null);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class n<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(Boolean.valueOf(((AccountAddress) t11).getIsPrimary()), Boolean.valueOf(((AccountAddress) t10).getIsPrimary()));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsViewModel$refreshLocations$1", f = "OrderOptionsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class o extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110987a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f110989c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsViewModel$refreshLocations$1$1", f = "OrderOptionsViewModel.kt", l = {334}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f110990a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y f110991b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y yVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f110991b = yVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f110991b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f110990a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    ov.g gVar = this.f110991b._events;
                    f.l lVar = f.l.f110921a;
                    this.f110990a = 1;
                    if (gVar.r(lVar, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f110989c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return y.this.new o(this.f110989c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((o) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f110987a == 0) {
                ResultKt.b(obj);
                y.this.m0(true, AbstractC6392a.INSTANCE.d(Il.h.f14966z, new Object[0]));
                if (Intrinsics.e(this.f110989c, "delivery")) {
                    y.this.R();
                } else {
                    C15809k.d(d0.a(y.this), null, null, new a(y.this, null), 3, null);
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsViewModel$refreshTimeSlots$1", f = "OrderOptionsViewModel.kt", l = {281}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class p extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f110992a;

        /* renamed from: b, reason: collision with root package name */
        int f110993b;

        /* renamed from: c, reason: collision with root package name */
        int f110994c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f110995d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ShoppingCart f110997f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f110998g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<OrderOptionsTimeDecorator> f110999h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsViewModel$refreshTimeSlots$1$4$2", f = "OrderOptionsViewModel.kt", l = {316}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111000a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ y f111001b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y yVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f111001b = yVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f111001b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111000a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    ov.g gVar = this.f111001b._events;
                    f.l lVar = f.l.f110921a;
                    this.f111000a = 1;
                    if (gVar.r(lVar, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            p pVar = y.this.new p(this.f110997f, this.f110998g, this.f110999h, continuation);
            pVar.f110995d = obj;
            return pVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(ShoppingCart shoppingCart, String str, Ref.ObjectRef<OrderOptionsTimeDecorator> objectRef, Continuation<? super p> continuation) {
            super(2, continuation);
            this.f110997f = shoppingCart;
            this.f110998g = str;
            this.f110999h = objectRef;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((p) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0137  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x017c  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0180  */
        /* JADX WARN: Type inference failed for: r4v8, types: [T, com.meijer.mobile.meijer.activity.orderoptions.t] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r62) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 404
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.orderoptions.y.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsViewModel$searchStores$1", f = "OrderOptionsViewModel.kt", l = {971}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class q extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f111002a;

        /* renamed from: b, reason: collision with root package name */
        int f111003b;

        /* renamed from: c, reason: collision with root package name */
        int f111004c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f111005d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ double f111007f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ double f111008g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(double d10, double d11, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f111007f = d10;
            this.f111008g = d11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            q qVar = y.this.new q(this.f111007f, this.f111008g, continuation);
            qVar.f111005d = obj;
            return qVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((q) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 240
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.orderoptions.y.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsViewModel$sendEvent$1", f = "OrderOptionsViewModel.kt", l = {1130}, m = "invokeSuspend")
    static final class r extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111009a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f111011c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(f fVar, Continuation<? super r> continuation) {
            super(2, continuation);
            this.f111011c = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return y.this.new r(this.f111011c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((r) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111009a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                ov.g gVar = y.this._events;
                f fVar = this.f111011c;
                this.f111009a = 1;
                if (gVar.r(fVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public y(yo.f storeManager, tl.h timeSlotRepository, Zq.b storeInfoRepository, il.m cartRepository, Ch.a accountAddressesRepository, SearchStoresCall searchStoresCall, InterfaceC14523a analyticsEngine, zl.k featureManager) {
        Intrinsics.j(storeManager, "storeManager");
        Intrinsics.j(timeSlotRepository, "timeSlotRepository");
        Intrinsics.j(storeInfoRepository, "storeInfoRepository");
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(accountAddressesRepository, "accountAddressesRepository");
        Intrinsics.j(searchStoresCall, "searchStoresCall");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(featureManager, "featureManager");
        this.storeManager = storeManager;
        this.timeSlotRepository = timeSlotRepository;
        this.storeInfoRepository = storeInfoRepository;
        this.cartRepository = cartRepository;
        this.accountAddressesRepository = accountAddressesRepository;
        this.searchStoresCall = searchStoresCall;
        this.analyticsEngine = analyticsEngine;
        this.featureManager = featureManager;
        this._viewState = S.a(new OrderOptionsViewState(false, null, null, null, null, null, false, null, 0, false, false, null, null, null, 16383, null));
        this._events = ov.j.b(0, null, null, 7, null);
        Ju.a aVar = new Ju.a();
        this.disposables = aVar;
        this.isCartFirstLoad = true;
        io.reactivex.l<uk.c<ShoppingCart>> lVarB = cartRepository.b();
        final a aVar2 = new a(this);
        Lu.g<? super uk.c<ShoppingCart>> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.orderoptions.v
            @Override // Lu.g
            public final void accept(Object obj) {
                y.q(aVar2, obj);
            }
        };
        final b bVar = new b(qw.a.INSTANCE);
        Dk.a.a(lVarB.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.orderoptions.w
            @Override // Lu.g
            public final void accept(Object obj) {
                y.r(bVar, obj);
            }
        }), aVar);
    }

    private final void O() {
        OrderOptionsViewState value = this._viewState.getValue();
        ShoppingCart cart = value.getCart();
        C15809k.d(d0.a(this), null, null, new h(cart != null ? Integer.valueOf(cart.u()) : null, value, null), 3, null);
    }

    private final void P(int storeId) {
        OrderOptionsViewState value = this._viewState.getValue();
        ShoppingCart cart = value.getCart();
        C15809k.d(d0.a(this), null, null, new i(storeId, cart != null ? Integer.valueOf(cart.u()) : null, value, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(Throwable error) {
        qw.a.INSTANCE.f(error, "Error getting storeInfo", new Object[0]);
        m0(false, null);
        k0(new f.FailEvent(Il.h.f14917N));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(com.meijer.mobile.storeinfo.api.model.StoreInfo r21, int r22) {
        /*
            r20 = this;
            r0 = r20
            java.util.List r1 = r21.a()
            java.lang.Object r1 = kotlin.collections.CollectionsKt.s0(r1)
            com.meijer.mobile.storeinfo.api.model.Store r1 = (com.meijer.mobile.storeinfo.api.model.Store) r1
            java.util.List r1 = r1.v()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            r3 = 0
            if (r2 == 0) goto L22
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L22
        L20:
            r5 = r3
            goto L53
        L22:
            java.util.Iterator r1 = r1.iterator()
        L26:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L20
            java.lang.Object r2 = r1.next()
            com.meijer.mobile.storeinfo.api.model.FulfillmentInfo r2 = (com.meijer.mobile.storeinfo.api.model.FulfillmentInfo) r2
            java.lang.Integer r4 = r2.getFulfillmentTypeId()
            r5 = 1
            if (r4 != 0) goto L3a
            goto L50
        L3a:
            int r4 = r4.intValue()
            if (r4 != r5) goto L50
            java.lang.Boolean r2 = r2.getIsEnabled()
            if (r2 == 0) goto L4b
            boolean r2 = r2.booleanValue()
            goto L4c
        L4b:
            r2 = r3
        L4c:
            if (r2 == 0) goto L50
            r2 = r5
            goto L51
        L50:
            r2 = r3
        L51:
            if (r2 == 0) goto L26
        L53:
            if (r5 == 0) goto L5b
            r1 = r22
            r0.P(r1)
            return
        L5b:
            r1 = 0
            r0.m0(r3, r1)
            pv.B<com.meijer.mobile.meijer.activity.orderoptions.y$g> r1 = r0._viewState
        L61:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            com.meijer.mobile.meijer.activity.orderoptions.y$g r3 = (com.meijer.mobile.meijer.activity.orderoptions.y.OrderOptionsViewState) r3
            r18 = 16319(0x3fbf, float:2.2868E-41)
            r19 = 0
            r4 = 0
            r5 = 0
            r6 = 0
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
            com.meijer.mobile.meijer.activity.orderoptions.y$g r3 = com.meijer.mobile.meijer.activity.orderoptions.y.OrderOptionsViewState.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r2 = r1.e(r2, r3)
            if (r2 == 0) goto L61
            com.meijer.mobile.meijer.activity.orderoptions.y$f$p r1 = com.meijer.mobile.meijer.activity.orderoptions.y.f.p.f110931a
            r0.k0(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.orderoptions.y.V(com.meijer.mobile.storeinfo.api.model.StoreInfo, int):void");
    }

    private final void Z(AbstractC17440a<fj.n, CartChanges> challenge, boolean isPickupStoreChallenge) {
        if (isPickupStoreChallenge) {
            this.analyticsEngine.h(C14756c.a(challenge instanceof AbstractC17440a.Accept ? "Store change required alert Accepted" : "Store change required alert Canceled"), new AbstractC14762i[0]);
        }
        OrderOptionsViewState value = this._viewState.getValue();
        ShoppingCart cart = value.getCart();
        C15809k.d(d0.a(this), null, null, new m(challenge, this, cart != null ? Integer.valueOf(cart.u()) : null, value, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(Throwable throwable) {
        OrderOptionsViewState value;
        qw.a.INSTANCE.c(com.meijer.mobile.core.networking.exceptions.a.a(throwable), "Failed to load saved addresses", new Object[0]);
        InterfaceC16549B<OrderOptionsViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, OrderOptionsViewState.b(value, false, null, null, null, null, null, false, null, 0, false, false, new LoadingState(false, null), null, null, 14335, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(List<AccountAddress> savedAddresses) {
        OrderOptionsViewState value;
        ArrayList arrayList = new ArrayList();
        for (Object obj : savedAddresses) {
            if (((AccountAddress) obj).getAddressType() == EnumC3241e.f7540d) {
                arrayList.add(obj);
            }
        }
        List listZ0 = CollectionsKt.Z0(arrayList, new n());
        boolean z10 = false;
        if (listZ0.isEmpty()) {
            InterfaceC16549B<OrderOptionsViewState> interfaceC16549B = this._viewState;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, OrderOptionsViewState.b(value, false, null, null, null, null, null, false, CollectionsKt.m(), 0, false, false, new LoadingState(false, null), null, null, 13951, null)));
            return;
        }
        InterfaceC16549B<OrderOptionsViewState> interfaceC16549B2 = this._viewState;
        while (true) {
            OrderOptionsViewState value2 = interfaceC16549B2.getValue();
            OrderOptionsViewState orderOptionsViewState = value2;
            int size = listZ0.size();
            List<AccountAddress> list = listZ0;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list, 10));
            for (AccountAddress accountAddress : list) {
                String strValueOf = String.valueOf(accountAddress.getId());
                Country country = new Country("US", null, 2, null);
                boolean isPrimary = accountAddress.getIsPrimary();
                String name = accountAddress.getName();
                String firstName = accountAddress.getFirstName();
                String str = firstName == null ? "" : firstName;
                String lastName = accountAddress.getLastName();
                String str2 = lastName == null ? "" : lastName;
                String addressLine1 = accountAddress.getAddressLine1();
                String str3 = addressLine1 == null ? "" : addressLine1;
                String addressLine2 = accountAddress.getAddressLine2();
                String phoneNumber = accountAddress.getPhoneNumber();
                String zipCode = accountAddress.getZipCode();
                String str4 = zipCode == null ? "" : zipCode;
                Region region = new Region("US-" + accountAddress.getState(), null, accountAddress.getState(), null, 10, null);
                boolean z11 = accountAddress.getAddressType() == EnumC3241e.f7540d ? true : z10;
                String city = accountAddress.getCity();
                arrayList2.add(new CustomerAddress(strValueOf, name, null, null, str, str2, null, str3, addressLine2, city == null ? "" : city, region, str4, country, phoneNumber, null, z11, false, isPrimary, false, null, 868428, null));
            }
            if (interfaceC16549B2.e(value2, OrderOptionsViewState.b(orderOptionsViewState, false, null, null, null, null, null, false, arrayList2, size, false, false, new LoadingState(z10, null), null, null, 13951, null))) {
                break;
            } else {
                z10 = false;
            }
        }
        OrderOptionsViewState value3 = this._viewState.getValue();
        OrderOptionsDecorator orderOptionsDecorator = value3.getOrderOptionsDecorator();
        if ((orderOptionsDecorator != null ? orderOptionsDecorator.getDeliveryAddress() : null) != null || value3.f().isEmpty()) {
            return;
        }
        n0((CustomerAddress) CollectionsKt.s0(value3.f()), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, com.meijer.mobile.meijer.activity.orderoptions.t] */
    private final void d0(ShoppingCart cart, String deliveryModeCode) {
        if (this.featureManager.e(AbstractC18503f.K.f172850h)) {
            c0(deliveryModeCode);
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f143742a = new OrderOptionsTimeDecorator(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        C15809k.d(d0.a(this), null, null, new p(cart, deliveryModeCode, objectRef, null), 3, null);
    }

    private final void e0(AccountAddress accountAddress, boolean wasSavedToAccountAddresses) {
        OrderOptionsViewState value;
        OrderOptionsViewState orderOptionsViewState;
        List listQ0;
        CustomerAddress customerAddress;
        ShoppingCart shoppingCart;
        ShoppingCart shoppingCartA;
        String strValueOf = String.valueOf(accountAddress.getId());
        Country country = new Country("US", null, 2, null);
        boolean isPrimary = accountAddress.getIsPrimary();
        String name = accountAddress.getName();
        String firstName = accountAddress.getFirstName();
        String str = firstName == null ? "" : firstName;
        String lastName = accountAddress.getLastName();
        String str2 = lastName == null ? "" : lastName;
        String addressLine1 = accountAddress.getAddressLine1();
        String str3 = addressLine1 == null ? "" : addressLine1;
        String addressLine2 = accountAddress.getAddressLine2();
        String phoneNumber = accountAddress.getPhoneNumber();
        String zipCode = accountAddress.getZipCode();
        String str4 = zipCode == null ? "" : zipCode;
        String str5 = "US-" + accountAddress.getState();
        String state = accountAddress.getState();
        Region region = new Region(str5, null, state == null ? "" : state, null, 10, null);
        boolean z10 = accountAddress.getAddressType() == EnumC3241e.f7540d;
        String city = accountAddress.getCity();
        CustomerAddress customerAddress2 = new CustomerAddress(strValueOf, name, null, null, str, str2, null, str3, addressLine2, city == null ? "" : city, region, str4, country, phoneNumber, null, z10, false, isPrimary, false, null, 868428, null);
        InterfaceC16549B<OrderOptionsViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            orderOptionsViewState = value;
            List<CustomerAddress> listF = orderOptionsViewState.f();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listF) {
                if (!Intrinsics.e(((CustomerAddress) obj).getId(), customerAddress2.getId())) {
                    arrayList.add(obj);
                }
            }
            listQ0 = CollectionsKt.Q0(arrayList, customerAddress2);
            ShoppingCart cart = orderOptionsViewState.getCart();
            if (cart != null) {
                CustomerAddress deliveryAddress = cart.getDeliveryAddress();
                if (Intrinsics.e(deliveryAddress != null ? deliveryAddress.getId() : null, customerAddress2.getId())) {
                    customerAddress = customerAddress2;
                    shoppingCartA = cart.a((2147483645 & 1) != 0 ? cart.code : null, (2147483645 & 2) != 0 ? cart.entries : null, (2147483645 & 4) != 0 ? cart.customerData : null, (2147483645 & 8) != 0 ? cart.outOfStockEntries : null, (2147483645 & 16) != 0 ? cart.pointOfService : null, (2147483645 & 32) != 0 ? cart.substitutePreference : null, (2147483645 & 64) != 0 ? cart.deliveryMode : null, (2147483645 & 128) != 0 ? cart.deliveryAddress : customerAddress, (2147483645 & 256) != 0 ? cart.extendedDeliveryCost : null, (2147483645 & 512) != 0 ? cart.paymentInfo : null, (2147483645 & 1024) != 0 ? cart.selectedPaymentOption : null, (2147483645 & RecyclerView.m.FLAG_MOVED) != 0 ? cart.multiTenderPaymentInfo : null, (2147483645 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? cart.pickUpPerson : null, (2147483645 & 8192) != 0 ? cart.pickUpSlotInfo : null, (2147483645 & 16384) != 0 ? cart.specialSavings : null, (2147483645 & 32768) != 0 ? cart.mperksSavings : null, (2147483645 & 65536) != 0 ? cart.couponsSavings : null, (2147483645 & 131072) != 0 ? cart.teamMemberSavings : null, (2147483645 & 262144) != 0 ? cart.totalSavings : null, (2147483645 & 524288) != 0 ? cart.productDiscounts : null, (2147483645 & 1048576) != 0 ? cart.orderDiscounts : null, (2147483645 & 2097152) != 0 ? cart.depositPrice : null, (2147483645 & 4194304) != 0 ? cart.deliveryCost : null, (2147483645 & 8388608) != 0 ? cart.subTotal : null, (2147483645 & 16777216) != 0 ? cart.totalDiscounts : null, (2147483645 & 33554432) != 0 ? cart.itemsTotal : null, (2147483645 & 67108864) != 0 ? cart.totalCosts : null, (2147483645 & 134217728) != 0 ? cart.totalPrice : null, (2147483645 & 268435456) != 0 ? cart.totalTax : null, (2147483645 & 536870912) != 0 ? cart.totalPriceWithTax : null, (2147483645 & 1073741824) != 0 ? cart.creditTransactionAmount : null, (2147483645 & Integer.MIN_VALUE) != 0 ? cart.totalItems : 0, (16383 & 1) != 0 ? cart.tippedAndRated : false, (16383 & 2) != 0 ? cart.originalOrderId : null, (16383 & 4) != 0 ? cart.isEditingDryOrder : false, (16383 & 8) != 0 ? cart.deliveryAddressIsAlcoholEligible : false, (16383 & 16) != 0 ? cart.highValuePromos : null, (16383 & 32) != 0 ? cart.earlyDeliveryAvailable : false, (16383 & 64) != 0 ? cart.promoCodeMessage : null, (16383 & 128) != 0 ? cart.fulfillmentEligibility : null, (16383 & 256) != 0 ? cart.partnerEligibility : null, (16383 & 512) != 0 ? cart.availableFulfillmentEligibilities : null, (16383 & 1024) != 0 ? cart.ebtEligibleTotal : null, (16383 & RecyclerView.m.FLAG_MOVED) != 0 ? cart.ebtNonEligibleTotal : null, (16383 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? cart.ebtSurchargePrice : null, (16383 & 8192) != 0 ? cart.ebtSuggestedTotal : null);
                } else {
                    customerAddress = customerAddress2;
                    shoppingCartA = cart;
                }
                shoppingCart = shoppingCartA;
            } else {
                customerAddress = customerAddress2;
                shoppingCart = null;
            }
            customerAddress2 = customerAddress;
        } while (!interfaceC16549B.e(value, OrderOptionsViewState.b(orderOptionsViewState, false, shoppingCart, null, null, null, null, false, listQ0, wasSavedToAccountAddresses ? orderOptionsViewState.getNumberOfSavedAddresses() + 1 : orderOptionsViewState.getNumberOfSavedAddresses(), false, false, null, null, null, 15997, null)));
        n0(customerAddress2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(Throwable throwable) {
        OrderOptionsViewState value;
        qw.a.INSTANCE.c(com.meijer.mobile.core.networking.exceptions.a.a(throwable), "Fail to load address details", new Object[0]);
        InterfaceC16549B<OrderOptionsViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, OrderOptionsViewState.b(value, false, null, null, null, null, null, false, null, 0, false, false, new LoadingState(false, null), null, null, 14335, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0(double latitude, double longitude) {
        m0(true, AbstractC6392a.INSTANCE.d(Il.h.f14964x, new Object[0]));
        C15809k.d(d0.a(this), null, null, new q(latitude, longitude, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0(List<StoreDetails> storeDetailsList) {
        OrderOptionsViewState value;
        InterfaceC16549B<OrderOptionsViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, OrderOptionsViewState.b(value, false, null, null, storeDetailsList, null, null, false, null, 0, false, false, new LoadingState(false, null), null, null, 14327, null)));
    }

    private final void j0(StoreDetails storeDetails, boolean isEditedByUser) {
        OrderOptionsViewState value;
        OrderOptionsViewState orderOptionsViewState;
        OrderOptionsDecorator orderOptionsDecoratorB;
        boolean z10;
        DeliveryMode deliveryMode;
        InterfaceC16549B<OrderOptionsViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            orderOptionsViewState = value;
            ShoppingCart cart = orderOptionsViewState.getCart();
            boolean z11 = true;
            orderOptionsDecoratorB = null;
            if (cart != null && (deliveryMode = cart.getDeliveryMode()) != null && deliveryMode.f()) {
                DeliveryMode deliveryMode2 = orderOptionsViewState.getCart().getDeliveryMode();
                String code = deliveryMode2 != null ? deliveryMode2.getCode() : null;
                if (code != null && !StringsKt.s0(code) && storeDetails.getStoreId() == orderOptionsViewState.getCart().getPointOfService().getStoreId()) {
                    z11 = false;
                }
            }
            z10 = z11;
            OrderOptionsDecorator orderOptionsDecorator = orderOptionsViewState.getOrderOptionsDecorator();
            if (orderOptionsDecorator != null) {
                orderOptionsDecoratorB = OrderOptionsDecorator.b(orderOptionsDecorator, null, null, null, null, StoreDecorator.Companion.d(StoreDecorator.INSTANCE, storeDetails, null, 2, null), null, 47, null);
            }
        } while (!interfaceC16549B.e(value, OrderOptionsViewState.b(orderOptionsViewState, false, null, orderOptionsDecoratorB, null, null, null, z10, null, 0, false, isEditedByUser, null, null, null, 15291, null)));
    }

    private final void l0(String deliveryModeCode) {
        OrderOptionsViewState value;
        OrderOptionsViewState orderOptionsViewState;
        String str;
        OrderOptionsDecorator orderOptionsDecoratorB;
        boolean z10;
        boolean newStoreSelected;
        ShoppingCart cart;
        DeliveryMode deliveryMode;
        DeliveryMode deliveryMode2;
        DeliveryMode deliveryMode3;
        InterfaceC16549B<OrderOptionsViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            orderOptionsViewState = value;
            OrderOptionsDecorator orderOptionsDecorator = orderOptionsViewState.getOrderOptionsDecorator();
            String code = null;
            if (orderOptionsDecorator != null) {
                str = deliveryModeCode;
                orderOptionsDecoratorB = OrderOptionsDecorator.b(orderOptionsDecorator, str, null, null, null, null, null, 62, null);
            } else {
                str = deliveryModeCode;
                orderOptionsDecoratorB = null;
            }
            ShoppingCart cart2 = orderOptionsViewState.getCart();
            if (cart2 != null && (deliveryMode3 = cart2.getDeliveryMode()) != null) {
                code = deliveryMode3.getCode();
            }
            z10 = !Intrinsics.e(code, str);
            ShoppingCart cart3 = W().getValue().getCart();
            newStoreSelected = (cart3 == null || (deliveryMode2 = cart3.getDeliveryMode()) == null || !deliveryMode2.f()) ? true : orderOptionsViewState.getNewStoreSelected();
            cart = W().getValue().getCart();
        } while (!interfaceC16549B.e(value, OrderOptionsViewState.b(orderOptionsViewState, false, null, orderOptionsDecoratorB, null, null, null, newStoreSelected, null, 0, (cart == null || (deliveryMode = cart.getDeliveryMode()) == null || !deliveryMode.f()) ? orderOptionsViewState.getNewDeliveryAddressSelected() : true, z10, null, null, null, 14779, null)));
        ShoppingCart cart4 = this._viewState.getValue().getCart();
        if (cart4 != null) {
            d0(cart4, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(boolean isInProgress, AbstractC6392a loadingMessage) {
        OrderOptionsViewState value;
        InterfaceC16549B<OrderOptionsViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, OrderOptionsViewState.b(value, false, null, null, null, null, null, false, null, 0, false, false, new LoadingState(isInProgress, loadingMessage), null, null, 14335, null)));
    }

    private final void n0(CustomerAddress deliveryAddress, boolean isEditedByUser) {
        OrderOptionsViewState value;
        OrderOptionsViewState orderOptionsViewState;
        boolean z10;
        CustomerAddress customerAddress;
        OrderOptionsDecorator orderOptionsDecorator;
        DeliveryMode deliveryMode;
        InterfaceC16549B<OrderOptionsViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            orderOptionsViewState = value;
            ShoppingCart cart = orderOptionsViewState.getCart();
            z10 = true;
            if (cart == null || (deliveryMode = cart.getDeliveryMode()) == null || !deliveryMode.c()) {
                customerAddress = deliveryAddress;
            } else {
                customerAddress = deliveryAddress;
                if (C13687e.f(customerAddress, orderOptionsViewState.getCart().getDeliveryAddress())) {
                    z10 = false;
                }
            }
            orderOptionsDecorator = orderOptionsViewState.getOrderOptionsDecorator();
        } while (!interfaceC16549B.e(value, OrderOptionsViewState.b(orderOptionsViewState, false, null, orderOptionsDecorator != null ? OrderOptionsDecorator.b(orderOptionsDecorator, null, null, null, customerAddress, null, null, 55, null) : null, null, null, null, false, null, 0, z10, isEditedByUser, null, null, null, 14843, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0(final String selectedFulfillmentMode, final int oldStoreId, final int newStoreId) {
        this.analyticsEngine.b(C14756c.h("fulfillment method change"), new Function1() { // from class: com.meijer.mobile.meijer.activity.orderoptions.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.p0(this.f110846a, selectedFulfillmentMode, oldStoreId, newStoreId, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8 A[PHI: r8
      0x00e8: PHI (r8v15 java.lang.String) = (r8v11 java.lang.String), (r8v16 java.lang.String) binds: [B:53:0x0100, B:44:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void observeCart(uk.c<fj.ShoppingCart> r26) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.orderoptions.y.observeCart(uk.c):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p0(y yVar, String str, int i10, int i11, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        String previousPageName = yVar._viewState.getValue().getPreviousPageName();
        if (previousPageName == null) {
            previousPageName = "";
        }
        track.h("pageName", previousPageName);
        track.h("fulfillmentType", str);
        track.h("previousStoreId", String.valueOf(i10));
        track.h("storeid", String.valueOf(i11));
        return Unit.f143329a;
    }

    private final void q0(final String deliveryMode, final int storeId) {
        this.analyticsEngine.b(C14756c.h("Order Options: Meijer Fulfillment Method Selection"), new Function1() { // from class: com.meijer.mobile.meijer.activity.orderoptions.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y.r0(deliveryMode, storeId, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r0(String str, int i10, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("fulfillmentType", str);
        track.h("storeid", String.valueOf(i10));
        return Unit.f143329a;
    }

    private final void s0() {
        String selectedDeliveryMode;
        Integer storeId;
        OrderOptionsViewState value = this._viewState.getValue();
        OrderOptionsDecorator orderOptionsDecorator = value.getOrderOptionsDecorator();
        if (orderOptionsDecorator == null || (selectedDeliveryMode = orderOptionsDecorator.getSelectedDeliveryMode()) == null) {
            return;
        }
        if (!Intrinsics.e(selectedDeliveryMode, "pickup")) {
            if (Intrinsics.e(selectedDeliveryMode, "delivery")) {
                O();
            }
        } else {
            StoreDecorator store = value.getOrderOptionsDecorator().getStore();
            if (store == null || (storeId = store.getStoreId()) == null) {
                return;
            }
            Q(storeId.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0(int storeId, String storeName, String storeZip) {
        yo.f.q(this.storeManager, yo.d.f171589b, storeId, storeName, null, storeZip, 8, null);
    }

    static /* synthetic */ void u0(y yVar, int i10, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        yVar.t0(i10, str, str2);
    }

    private final void v0(StoreDetails storeDetails) {
        OrderOptionsViewState value;
        OrderOptionsViewState orderOptionsViewState;
        List listP0;
        InterfaceC16549B<OrderOptionsViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            orderOptionsViewState = value;
            Iterator<StoreDetails> it = orderOptionsViewState.n().iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                } else if (Intrinsics.e(it.next().getName(), storeDetails.getName())) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 != -1) {
                List<StoreDetails> listN = orderOptionsViewState.n();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listN) {
                    if (!Intrinsics.e(((StoreDetails) obj).getName(), storeDetails.getName())) {
                        arrayList.add(obj);
                    }
                }
                listP0 = CollectionsKt.P0(CollectionsKt.e(storeDetails), arrayList);
            } else {
                listP0 = CollectionsKt.P0(CollectionsKt.e(storeDetails), orderOptionsViewState.n());
            }
        } while (!interfaceC16549B.e(value, OrderOptionsViewState.b(orderOptionsViewState, false, null, null, listP0, null, null, false, null, 0, false, false, null, null, null, 16375, null)));
    }

    public final InterfaceC16561f<f> S() {
        return C16563h.R(this._events);
    }

    public final P<OrderOptionsViewState> W() {
        return C16563h.c(this._viewState);
    }

    public final InterfaceC16549B<OrderOptionsViewState> X() {
        return this._viewState;
    }

    public final void Y(e action) {
        OrderOptionsViewState value;
        OrderOptionsViewState orderOptionsViewState;
        OrderOptionsDecorator orderOptionsDecorator;
        Object next;
        DeliveryMode deliveryMode;
        PointOfService pointOfService;
        StoreDecorator store;
        OrderOptionsViewState value2;
        OrderOptionsViewState value3;
        OrderOptionsViewState value4;
        Intrinsics.j(action, "action");
        if (action instanceof e.SetFulfillmentMode) {
            l0(((e.SetFulfillmentMode) action).getDeliveryModeCode());
            return;
        }
        if (action instanceof e.SetSelectedSavedAddress) {
            InterfaceC16549B<OrderOptionsViewState> interfaceC16549B = this._viewState;
            do {
                value4 = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value4, OrderOptionsViewState.b(value4, false, null, null, null, null, null, false, null, 0, false, false, null, null, null, 8191, null)));
            e.SetSelectedSavedAddress setSelectedSavedAddress = (e.SetSelectedSavedAddress) action;
            n0(setSelectedSavedAddress.getDeliveryAddress(), setSelectedSavedAddress.getIsEditedByUser());
            return;
        }
        if (action instanceof e.SetPickupStore) {
            InterfaceC16549B<OrderOptionsViewState> interfaceC16549B2 = this._viewState;
            do {
                value3 = interfaceC16549B2.getValue();
            } while (!interfaceC16549B2.e(value3, OrderOptionsViewState.b(value3, false, null, null, null, null, null, false, null, 0, false, false, null, null, null, 8191, null)));
            e.SetPickupStore setPickupStore = (e.SetPickupStore) action;
            j0(setPickupStore.getStoreDetails(), setPickupStore.getIsEditedByUser());
            return;
        }
        if (action instanceof e.FulfillmentModeChallengeResult) {
            e.FulfillmentModeChallengeResult fulfillmentModeChallengeResult = (e.FulfillmentModeChallengeResult) action;
            Z(fulfillmentModeChallengeResult.a(), fulfillmentModeChallengeResult.getIsPickupStoreChallenge());
            return;
        }
        if (action instanceof e.AccountAddressToDeliveryAddress) {
            e.AccountAddressToDeliveryAddress accountAddressToDeliveryAddress = (e.AccountAddressToDeliveryAddress) action;
            this.analyticsEngine.k(C14535b.f135840a.c(accountAddressToDeliveryAddress.getWasSavedToAccountAddresses(), accountAddressToDeliveryAddress.getServiceTier()));
            e0(accountAddressToDeliveryAddress.getAccountAddress(), accountAddressToDeliveryAddress.getWasSavedToAccountAddresses());
            return;
        }
        if (action instanceof e.PopulateNearbyStores) {
            e.PopulateNearbyStores populateNearbyStores = (e.PopulateNearbyStores) action;
            g0(populateNearbyStores.getLatitude(), populateNearbyStores.getLongitude());
            return;
        }
        if (action instanceof e.SetPreviousPageName) {
            InterfaceC16549B<OrderOptionsViewState> interfaceC16549B3 = this._viewState;
            do {
                value2 = interfaceC16549B3.getValue();
            } while (!interfaceC16549B3.e(value2, OrderOptionsViewState.b(value2, false, null, null, null, null, null, false, null, 0, false, false, null, ((e.SetPreviousPageName) action).getPreviousPageName(), null, 12287, null)));
            return;
        }
        if (action instanceof e.m) {
            T();
            return;
        }
        if (action instanceof e.j) {
            OrderOptionsViewState value5 = this._viewState.getValue();
            OrderOptionsDecorator orderOptionsDecorator2 = value5.getOrderOptionsDecorator();
            if (orderOptionsDecorator2 != null && (store = orderOptionsDecorator2.getStore()) != null) {
                Integer storeId = store.getStoreId();
                Intrinsics.g(storeId);
                int iIntValue = storeId.intValue();
                String name = store.getName();
                Intrinsics.g(name);
                k0(new f.NavigateToStoreDetailsEvent(iIntValue, name));
                return;
            }
            ShoppingCart cart = value5.getCart();
            if (cart == null || (pointOfService = cart.getPointOfService()) == null) {
                k0(new f.FailEvent(Il.h.f14929Z));
            } else {
                int storeId2 = pointOfService.getStoreId();
                String displayName = pointOfService.getDisplayName();
                if (displayName == null) {
                    displayName = String.valueOf(pointOfService.getStoreId());
                }
                k0(new f.NavigateToStoreDetailsEvent(storeId2, displayName));
            }
            Unit unit = Unit.f143329a;
            return;
        }
        code = null;
        String code = null;
        CustomerAddress customerAddress = null;
        Object obj = null;
        if (action instanceof e.k) {
            ShoppingCart cart2 = this._viewState.getValue().getCart();
            if (cart2 != null && (deliveryMode = cart2.getDeliveryMode()) != null) {
                code = deliveryMode.getCode();
            }
            k0(new f.NavigateToStoreSearchEvent(Intrinsics.e(code, "pickup")));
            return;
        }
        if (action instanceof e.i) {
            k0(new f.NavigateToAddressSearchEvent(this._viewState.getValue().getNumberOfSavedAddresses()));
            return;
        }
        if (action instanceof e.r) {
            s0();
            return;
        }
        if (action instanceof e.NavigateToAddressDetail) {
            this._viewState.getValue();
            e.NavigateToAddressDetail navigateToAddressDetail = (e.NavigateToAddressDetail) action;
            k0(new f.NavigateToAddressDetailScreenEvent(navigateToAddressDetail.getSavedAddressCount(), navigateToAddressDetail.getAccountAddress()));
            return;
        }
        if (action instanceof e.NavigateListItemToAddressDetail) {
            OrderOptionsViewState value6 = this._viewState.getValue();
            Iterator<T> it = value6.f().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.e(((CustomerAddress) next).getId(), ((e.NavigateListItemToAddressDetail) action).getOrderOptionsListItem().getId())) {
                        break;
                    }
                }
            }
            CustomerAddress customerAddress2 = (CustomerAddress) next;
            if (customerAddress2 == null) {
                ShoppingCart cart3 = value6.getCart();
                CustomerAddress deliveryAddress = cart3 != null ? cart3.getDeliveryAddress() : null;
                if (Intrinsics.e(deliveryAddress != null ? deliveryAddress.getId() : null, ((e.NavigateListItemToAddressDetail) action).getOrderOptionsListItem().getId())) {
                    customerAddress = deliveryAddress;
                }
            } else {
                customerAddress = customerAddress2;
            }
            if (customerAddress != null) {
                String id2 = customerAddress.getId();
                long j10 = id2 != null ? Long.parseLong(id2) : 0L;
                boolean isDefault = customerAddress.getIsDefault();
                String name2 = customerAddress.getName();
                String firstName = customerAddress.getFirstName();
                String lastName = customerAddress.getLastName();
                k0(new f.NavigateToAddressDetailScreenEvent(value6.f().size(), new AccountAddress(j10, 0L, name2, customerAddress.getLine1(), customerAddress.getLine2(), customerAddress.getTown(), customerAddress.getRegion().getIsoCodeShort(), customerAddress.getPostalCode(), customerAddress.getIsShippingAddress() ? EnumC3241e.f7540d : EnumC3241e.f7539c, null, 0L, firstName, lastName, null, customerAddress.getPhone(), isDefault, null, null, null, null, 992770, null)));
                return;
            }
            return;
        }
        if (action instanceof e.NavigateListItemToStoreDetail) {
            Iterator<T> it2 = this._viewState.getValue().n().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (Intrinsics.e(String.valueOf(((StoreDetails) next2).getStoreId()), ((e.NavigateListItemToStoreDetail) action).getOrderOptionsListItem().getId())) {
                    obj = next2;
                    break;
                }
            }
            StoreDetails storeDetails = (StoreDetails) obj;
            if (storeDetails != null) {
                k0(new f.NavigateToStoreDetailScreenEvent(storeDetails.getStoreId(), String.valueOf(storeDetails.getName()), pk.i.f156745c));
                return;
            }
            return;
        }
        if (action instanceof e.d) {
            R();
            return;
        }
        if (!(action instanceof e.b)) {
            if (!(action instanceof e.c)) {
                if (!(action instanceof e.UpdatedNewSelectPickupStore)) {
                    throw new NoWhenBranchMatchedException();
                }
                v0(((e.UpdatedNewSelectPickupStore) action).getStoreDetail());
                return;
            } else {
                OrderOptionsViewState value7 = this._viewState.getValue();
                boolean z10 = (value7.getIsEditedByUser() && value7.getNewDeliveryAddressSelected()) || (value7.getIsEditedByUser() && value7.getNewStoreSelected());
                OrderOptionsDecorator orderOptionsDecorator3 = value7.getOrderOptionsDecorator();
                k0(new f.DisplaySaveChangesDialog(z10, orderOptionsDecorator3 != null ? orderOptionsDecorator3.getSelectedDeliveryMode() : null));
                return;
            }
        }
        this.analyticsEngine.k(C14535b.f135840a.b());
        if (this._viewState.getValue().f().isEmpty()) {
            InterfaceC16549B<OrderOptionsViewState> interfaceC16549B4 = this._viewState;
            do {
                value = interfaceC16549B4.getValue();
                orderOptionsViewState = value;
                orderOptionsDecorator = orderOptionsViewState.getOrderOptionsDecorator();
            } while (!interfaceC16549B4.e(value, OrderOptionsViewState.b(orderOptionsViewState, false, null, orderOptionsDecorator != null ? OrderOptionsDecorator.b(orderOptionsDecorator, "pickup", null, null, null, null, null, 62, null) : null, null, null, null, false, null, 0, false, false, null, null, null, 16379, null)));
            ShoppingCart cart4 = this._viewState.getValue().getCart();
            if (cart4 != null) {
                d0(cart4, "pickup");
            }
        }
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        this.disposables.d();
        super.onCleared();
    }

    private final void Q(int storeId) {
        C15809k.d(d0.a(this), null, null, new j(storeId, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R() {
        C15809k.d(d0.a(this), null, null, new k(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T() {
        C15809k.d(d0.a(this), null, null, new l(null), 3, null);
    }

    private final void c0(String deliveryModeCode) {
        C15809k.d(d0.a(this), null, null, new o(deliveryModeCode, null), 3, null);
    }

    private final void g0(double latitude, double longitude) {
        h0(latitude, longitude);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0(f event) {
        C15809k.d(d0.a(this), null, null, new r(event, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
