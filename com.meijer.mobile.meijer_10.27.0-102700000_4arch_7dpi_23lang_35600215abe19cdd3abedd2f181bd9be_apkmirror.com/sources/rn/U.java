package rn;

import Ao.C2930u;
import Ao.W;
import Co.Image;
import Co.ProductFullDetails;
import Gk.UIEvent;
import Ir.UserActionDialogInfo;
import ak.AbstractC5607a;
import androidx.recyclerview.widget.RecyclerView;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import ej.Entry;
import ej.EntryChange;
import ej.EntryUpdate;
import ej.ShoppingCart;
import gi.InterfaceC14261a;
import gj.OrderDetail;
import gn.OrderDetailSummaryDecorator;
import gn.OrderOutOfStockListDecorator;
import gn.OrderSubstitutionsListDecorator;
import gn.ReadOnlyProductListDecorator;
import hi.C14476c;
import hi.TrackingData;
import hk.CartPreviewDecorator;
import iv.C14764a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import ln.StackedPromo;
import qv.C16648k;
import qv.E0;
import qv.InterfaceC16622O;
import tk.AbstractC17116a;
import tk.c;
import tr.C17135b;
import tv.C17154h;
import tv.InterfaceC17140B;
import uo.OrderOutOfStockItem;
import ur.AbstractC17302a;
import uw.a;
import vo.OrderSubstitutionItem;
import vr.AbstractC17604a;
import wr.InterfaceC17847a;

@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 p2\u00020\u00012\u00020\u0002:\u0004h`d^B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00112\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0014H\u0016¢\u0006\u0004\b\u001d\u0010 J)\u0010%\u001a\u00020\u0011\"\u0004\b\u0000\u0010!2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00028\u00000\"H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00112\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u001f\u0010/\u001a\u00020-2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u0019\u00101\u001a\u0004\u0018\u00010-2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0011H\u0002¢\u0006\u0004\b3\u00104J%\u0010:\u001a\u00020\u00112\u0006\u00106\u001a\u0002052\f\u00109\u001a\b\u0012\u0004\u0012\u00020807H\u0002¢\u0006\u0004\b:\u0010;J%\u0010>\u001a\u00020\u00112\u0006\u00106\u001a\u0002052\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<07H\u0002¢\u0006\u0004\b>\u0010;J3\u0010D\u001a\u00020\u00112\u0006\u0010@\u001a\u00020?2\f\u0010B\u001a\b\u0012\u0004\u0012\u0002080A2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020<0AH\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u00112\u0006\u0010F\u001a\u00020?H\u0002¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0011H\u0002¢\u0006\u0004\bI\u00104J+\u0010N\u001a\u00020\u00112\u0012\b\u0002\u0010K\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010J\u0018\u00010A2\u0006\u0010M\u001a\u00020LH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010R\u001a\u00020Q2\u0006\u0010P\u001a\u00020LH\u0002¢\u0006\u0004\bR\u0010SJ+\u0010W\u001a\u00020\u00112\u0006\u0010U\u001a\u00020T2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010T2\u0006\u0010V\u001a\u00020LH\u0002¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u0011H\u0002¢\u0006\u0004\bY\u00104R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020c0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u001d\u0010l\u001a\b\u0012\u0004\u0012\u00020c0g8\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u0014\u0010o\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010n¨\u0006q"}, d2 = {"Lrn/U;", "Landroidx/lifecycle/c0;", "Lwr/a;", "Lcom/meijer/mobile/digitalshopping/api/orders/a;", "ordersRepository", "Lwr/f;", "cartInteractor", "Lhl/m;", "cartRepository", "Lyo/k;", "userManager", "Lgi/a;", "analyticsEngine", "<init>", "(Lcom/meijer/mobile/digitalshopping/api/orders/a;Lwr/f;Lhl/m;Lyo/k;Lgi/a;)V", "Lrn/U$d;", "action", "", "G", "(Lrn/U$d;)V", "Ltk/c;", "Lej/C;", "cartResource", "observeCart", "(Ltk/c;)V", "LNu/a;", "getDisposable", "()LNu/a;", "Lur/a;", "processedRequest", "Lej/j;", "entryChange", "(Lur/a;Ltk/c;)V", "T", "Ltk/a;", "Lvr/a;", "challenge", "throwChallenge", "(Ltk/a;)V", "", "itemCount", "H", "(I)V", "LCo/h;", "product", "", "qtyIncrement", "D", "(LCo/h;D)D", "L", "(LCo/h;)Ljava/lang/Double;", "F", "()V", "Lej/i;", "entry", "", "Lvo/a;", "listSubstitutedItems", "K", "(Lej/i;Ljava/util/List;)V", "Luo/a;", "listOutOfStockItems", "J", "Lgj/c;", "response", "", "orderSubstitutionList", "orderOutOfStockList", "I", "(Lgj/c;Ljava/util/List;Ljava/util/List;)V", "orderResponse", "Q", "(Lgj/c;)V", "C", "Lgn/r;", "products", "", "addSingleItem", "O", "(Ljava/util/List;Z)V", "singleItem", "", "B", "(Z)Ljava/lang/String;", "Lak/a;", "message", "isError", "M", "(Lak/a;Lak/a;Z)V", "A", "a", "Lcom/meijer/mobile/digitalshopping/api/orders/a;", "b", "Lwr/f;", "c", "Lhl/m;", "d", "Lgi/a;", "Ltv/B;", "Lrn/U$f;", "e", "Ltv/B;", "_viewState", "Ltv/P;", "f", "Ltv/P;", "E", "()Ltv/P;", "viewState", "g", "LNu/a;", "compositeDisposable", "h", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class U extends androidx.view.c0 implements InterfaceC17847a {

    /* renamed from: i, reason: collision with root package name */
    public static final int f159358i = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private com.meijer.mobile.digitalshopping.api.orders.a ordersRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private wr.f cartInteractor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private hl.m cartRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14261a analyticsEngine;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ViewState> _viewState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final tv.P<ViewState> viewState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Nu.a compositeDisposable;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        a(Object obj) {
            super(1, obj, U.class, "onCartCount", "onCartCount(I)V", 0);
        }

        public final void a(int i10) {
            ((U) this.receiver).H(i10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.f142422a;
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
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\r\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lrn/U$d;", "", "<init>", "()V", "i", "j", "h", "g", "c", "d", "a", "b", "l", "m", "k", "e", "f", "Lrn/U$d$a;", "Lrn/U$d$b;", "Lrn/U$d$c;", "Lrn/U$d$d;", "Lrn/U$d$e;", "Lrn/U$d$f;", "Lrn/U$d$g;", "Lrn/U$d$h;", "Lrn/U$d$i;", "Lrn/U$d$j;", "Lrn/U$d$k;", "Lrn/U$d$l;", "Lrn/U$d$m;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class d {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/U$d$a;", "Lrn/U$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final a f159366a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public String toString() {
                return "AddAllItemsToCartAction";
            }

            public int hashCode() {
                return -1974262658;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lrn/U$d$b;", "Lrn/U$d;", "LCo/h;", "product", "<init>", "(LCo/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.U$d$b, reason: from toString */
        public static final /* data */ class AddToCartAction extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProductFullDetails product;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AddToCartAction) && Intrinsics.e(this.product, ((AddToCartAction) other).product);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddToCartAction(ProductFullDetails product) {
                super(null);
                Intrinsics.j(product, "product");
                this.product = product;
            }

            /* renamed from: a, reason: from getter */
            public final ProductFullDetails getProduct() {
                return this.product;
            }

            public int hashCode() {
                return this.product.hashCode();
            }

            public String toString() {
                return "AddToCartAction(product=" + this.product + ')';
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\rR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0018\u0010\u001b¨\u0006\u001c"}, d2 = {"Lrn/U$d$c;", "Lrn/U$d;", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderID", "", "Lvo/a;", "orderSubstitutedItems", "Luo/a;", "orderOutOfStockItems", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.U$d$c, reason: from toString */
        public static final /* data */ class FetchDetails extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String orderID;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<OrderSubstitutionItem> orderSubstitutedItems;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<OrderOutOfStockItem> orderOutOfStockItems;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FetchDetails)) {
                    return false;
                }
                FetchDetails fetchDetails = (FetchDetails) other;
                return Intrinsics.e(this.orderID, fetchDetails.orderID) && Intrinsics.e(this.orderSubstitutedItems, fetchDetails.orderSubstitutedItems) && Intrinsics.e(this.orderOutOfStockItems, fetchDetails.orderOutOfStockItems);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FetchDetails(String orderID, List<OrderSubstitutionItem> orderSubstitutedItems, List<OrderOutOfStockItem> orderOutOfStockItems) {
                super(null);
                Intrinsics.j(orderID, "orderID");
                Intrinsics.j(orderSubstitutedItems, "orderSubstitutedItems");
                Intrinsics.j(orderOutOfStockItems, "orderOutOfStockItems");
                this.orderID = orderID;
                this.orderSubstitutedItems = orderSubstitutedItems;
                this.orderOutOfStockItems = orderOutOfStockItems;
            }

            /* renamed from: a, reason: from getter */
            public final String getOrderID() {
                return this.orderID;
            }

            public final List<OrderOutOfStockItem> b() {
                return this.orderOutOfStockItems;
            }

            public final List<OrderSubstitutionItem> c() {
                return this.orderSubstitutedItems;
            }

            public int hashCode() {
                return (((this.orderID.hashCode() * 31) + this.orderSubstitutedItems.hashCode()) * 31) + this.orderOutOfStockItems.hashCode();
            }

            public String toString() {
                return "FetchDetails(orderID=" + this.orderID + ", orderSubstitutedItems=" + this.orderSubstitutedItems + ", orderOutOfStockItems=" + this.orderOutOfStockItems + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lrn/U$d$d;", "Lrn/U$d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LCo/h;", "a", "LCo/h;", "()LCo/h;", "product", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.U$d$d, reason: collision with other inner class name and from toString */
        public static final /* data */ class GoProductDetailAction extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProductFullDetails product;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GoProductDetailAction) && Intrinsics.e(this.product, ((GoProductDetailAction) other).product);
            }

            /* renamed from: a, reason: from getter */
            public final ProductFullDetails getProduct() {
                return this.product;
            }

            public int hashCode() {
                return this.product.hashCode();
            }

            public String toString() {
                return "GoProductDetailAction(product=" + this.product + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lrn/U$d$e;", "Lrn/U$d;", "Lgn/r;", "item", "<init>", "(Lgn/r;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgn/r;", "()Lgn/r;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.U$d$e, reason: from toString */
        public static final /* data */ class GoToSavingsLink extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ReadOnlyProductListDecorator item;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GoToSavingsLink) && Intrinsics.e(this.item, ((GoToSavingsLink) other).item);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GoToSavingsLink(ReadOnlyProductListDecorator item) {
                super(null);
                Intrinsics.j(item, "item");
                this.item = item;
            }

            /* renamed from: a, reason: from getter */
            public final ReadOnlyProductListDecorator getItem() {
                return this.item;
            }

            public int hashCode() {
                return this.item.hashCode();
            }

            public String toString() {
                return "GoToSavingsLink(item=" + this.item + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lrn/U$d$f;", "Lrn/U$d;", "LCo/h;", "product", "<init>", "(LCo/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.U$d$f, reason: from toString */
        public static final /* data */ class NavigateToProductDetail extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProductFullDetails product;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NavigateToProductDetail) && Intrinsics.e(this.product, ((NavigateToProductDetail) other).product);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToProductDetail(ProductFullDetails product) {
                super(null);
                Intrinsics.j(product, "product");
                this.product = product;
            }

            /* renamed from: a, reason: from getter */
            public final ProductFullDetails getProduct() {
                return this.product;
            }

            public int hashCode() {
                return this.product.hashCode();
            }

            public String toString() {
                return "NavigateToProductDetail(product=" + this.product + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/U$d$g;", "Lrn/U$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class g extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final g f159374a = new g();

            private g() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof g);
            }

            public String toString() {
                return "ShowCreditCardTransactionHistory";
            }

            public int hashCode() {
                return -473898513;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/U$d$h;", "Lrn/U$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class h extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final h f159375a = new h();

            private h() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof h);
            }

            public String toString() {
                return "ShowExtendedRangeInfo";
            }

            public int hashCode() {
                return 611898306;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/U$d$i;", "Lrn/U$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class i extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final i f159376a = new i();

            private i() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof i);
            }

            public String toString() {
                return "ShowSummaryViewEBTPaperTrailBottomSheet";
            }

            public int hashCode() {
                return 877790846;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/U$d$j;", "Lrn/U$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class j extends d {

            /* renamed from: a, reason: collision with root package name */
            public static final j f159377a = new j();

            private j() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof j);
            }

            public String toString() {
                return "ShowSummaryViewPreAuthorizationBottomSheet";
            }

            public int hashCode() {
                return -1491341405;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lrn/U$d$k;", "Lrn/U$d;", "", "index", "", "isExpanded", "<init>", "(IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.U$d$k, reason: from toString */
        public static final /* data */ class UpdateStackedPromosExpandedView extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int index;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isExpanded;

            public UpdateStackedPromosExpandedView(int i10, boolean z10) {
                super(null);
                this.index = i10;
                this.isExpanded = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateStackedPromosExpandedView)) {
                    return false;
                }
                UpdateStackedPromosExpandedView updateStackedPromosExpandedView = (UpdateStackedPromosExpandedView) other;
                return this.index == updateStackedPromosExpandedView.index && this.isExpanded == updateStackedPromosExpandedView.isExpanded;
            }

            /* renamed from: a, reason: from getter */
            public final int getIndex() {
                return this.index;
            }

            /* renamed from: b, reason: from getter */
            public final boolean getIsExpanded() {
                return this.isExpanded;
            }

            public int hashCode() {
                return (Integer.hashCode(this.index) * 31) + Boolean.hashCode(this.isExpanded);
            }

            public String toString() {
                return "UpdateStackedPromosExpandedView(index=" + this.index + ", isExpanded=" + this.isExpanded + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lrn/U$d$l;", "Lrn/U$d;", "Lur/a;", "cartUpdateRequest", "<init>", "(Lur/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lur/a;", "()Lur/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.U$d$l, reason: from toString */
        public static final /* data */ class UserAcceptAddToCartAction extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC17302a cartUpdateRequest;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UserAcceptAddToCartAction) && Intrinsics.e(this.cartUpdateRequest, ((UserAcceptAddToCartAction) other).cartUpdateRequest);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UserAcceptAddToCartAction(AbstractC17302a cartUpdateRequest) {
                super(null);
                Intrinsics.j(cartUpdateRequest, "cartUpdateRequest");
                this.cartUpdateRequest = cartUpdateRequest;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC17302a getCartUpdateRequest() {
                return this.cartUpdateRequest;
            }

            public int hashCode() {
                return this.cartUpdateRequest.hashCode();
            }

            public String toString() {
                return "UserAcceptAddToCartAction(cartUpdateRequest=" + this.cartUpdateRequest + ')';
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lrn/U$d$m;", "Lrn/U$d;", "", "displayAppliedOffer", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.U$d$m, reason: from toString */
        public static final /* data */ class ViewAppliedOffer extends d {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean displayAppliedOffer;

            public ViewAppliedOffer(boolean z10) {
                super(null);
                this.displayAppliedOffer = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ViewAppliedOffer) && this.displayAppliedOffer == ((ViewAppliedOffer) other).displayAppliedOffer;
            }

            /* renamed from: a, reason: from getter */
            public final boolean getDisplayAppliedOffer() {
                return this.displayAppliedOffer;
            }

            public int hashCode() {
                return Boolean.hashCode(this.displayAppliedOffer);
            }

            public String toString() {
                return "ViewAppliedOffer(displayAppliedOffer=" + this.displayAppliedOffer + ')';
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0012\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0012\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Lrn/U$e;", "", "<init>", "()V", "d", "h", "c", "l", "a", "j", "i", "b", "k", "m", "e", "r", "f", "p", "q", "o", "n", "g", "Lrn/U$e$a;", "Lrn/U$e$b;", "Lrn/U$e$c;", "Lrn/U$e$d;", "Lrn/U$e$e;", "Lrn/U$e$f;", "Lrn/U$e$g;", "Lrn/U$e$h;", "Lrn/U$e$i;", "Lrn/U$e$j;", "Lrn/U$e$k;", "Lrn/U$e$l;", "Lrn/U$e$m;", "Lrn/U$e$n;", "Lrn/U$e$o;", "Lrn/U$e$p;", "Lrn/U$e$q;", "Lrn/U$e$r;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class e {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/U$e$a;", "Lrn/U$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends e {

            /* renamed from: a, reason: collision with root package name */
            public static final a f159382a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public String toString() {
                return "AddItemsFailEvent";
            }

            public int hashCode() {
                return -1825915120;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lrn/U$e$b;", "Lrn/U$e;", "Lak/a;", "title", "message", "positiveButtonText", "<init>", "(Lak/a;Lak/a;Lak/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "c", "()Lak/a;", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.U$e$b, reason: from toString */
        public static final /* data */ class CartLoadingError extends e {

            /* renamed from: d, reason: collision with root package name */
            public static final int f159383d = AbstractC5607a.f45514b;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a title;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a message;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a positiveButtonText;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CartLoadingError)) {
                    return false;
                }
                CartLoadingError cartLoadingError = (CartLoadingError) other;
                return Intrinsics.e(this.title, cartLoadingError.title) && Intrinsics.e(this.message, cartLoadingError.message) && Intrinsics.e(this.positiveButtonText, cartLoadingError.positiveButtonText);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CartLoadingError(AbstractC5607a title, AbstractC5607a message, AbstractC5607a positiveButtonText) {
                super(null);
                Intrinsics.j(title, "title");
                Intrinsics.j(message, "message");
                Intrinsics.j(positiveButtonText, "positiveButtonText");
                this.title = title;
                this.message = message;
                this.positiveButtonText = positiveButtonText;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC5607a getMessage() {
                return this.message;
            }

            /* renamed from: b, reason: from getter */
            public final AbstractC5607a getPositiveButtonText() {
                return this.positiveButtonText;
            }

            /* renamed from: c, reason: from getter */
            public final AbstractC5607a getTitle() {
                return this.title;
            }

            public int hashCode() {
                return (((this.title.hashCode() * 31) + this.message.hashCode()) * 31) + this.positiveButtonText.hashCode();
            }

            public String toString() {
                return "CartLoadingError(title=" + this.title + ", message=" + this.message + ", positiveButtonText=" + this.positiveButtonText + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/U$e$c;", "Lrn/U$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends e {

            /* renamed from: a, reason: collision with root package name */
            public static final c f159387a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public String toString() {
                return "CompletedOrderEvent";
            }

            public int hashCode() {
                return -797233750;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/U$e$d;", "Lrn/U$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends e {

            /* renamed from: a, reason: collision with root package name */
            public static final d f159388a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public String toString() {
                return "FailEvent";
            }

            public int hashCode() {
                return -88196369;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lrn/U$e$e;", "Lrn/U$e;", "LCo/h;", "product", "<init>", "(LCo/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.U$e$e, reason: collision with other inner class name and from toString */
        public static final /* data */ class GoProductDetailEvent extends e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProductFullDetails product;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GoProductDetailEvent) && Intrinsics.e(this.product, ((GoProductDetailEvent) other).product);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GoProductDetailEvent(ProductFullDetails product) {
                super(null);
                Intrinsics.j(product, "product");
                this.product = product;
            }

            /* renamed from: a, reason: from getter */
            public final ProductFullDetails getProduct() {
                return this.product;
            }

            public int hashCode() {
                return this.product.hashCode();
            }

            public String toString() {
                return "GoProductDetailEvent(product=" + this.product + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lrn/U$e$f;", "Lrn/U$e;", "Lgn/r;", "item", "<init>", "(Lgn/r;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgn/r;", "()Lgn/r;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.U$e$f, reason: from toString */
        public static final /* data */ class GoToSavingsLinkEvent extends e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ReadOnlyProductListDecorator item;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GoToSavingsLinkEvent) && Intrinsics.e(this.item, ((GoToSavingsLinkEvent) other).item);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GoToSavingsLinkEvent(ReadOnlyProductListDecorator item) {
                super(null);
                Intrinsics.j(item, "item");
                this.item = item;
            }

            /* renamed from: a, reason: from getter */
            public final ReadOnlyProductListDecorator getItem() {
                return this.item;
            }

            public int hashCode() {
                return this.item.hashCode();
            }

            public String toString() {
                return "GoToSavingsLinkEvent(item=" + this.item + ')';
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrn/U$e$g;", "Lrn/U$e;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class g extends e {
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/U$e$h;", "Lrn/U$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class h extends e {

            /* renamed from: a, reason: collision with root package name */
            public static final h f159391a = new h();

            private h() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof h);
            }

            public String toString() {
                return "InProgressOrderEvent";
            }

            public int hashCode() {
                return 475763019;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lrn/U$e$i;", "Lrn/U$e;", "Lak/a;", "message", "<init>", "(Lak/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "()Lak/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.U$e$i, reason: from toString */
        public static final /* data */ class ItemNotAddedError extends e {

            /* renamed from: b, reason: collision with root package name */
            public static final int f159392b = AbstractC5607a.f45514b;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a message;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ItemNotAddedError) && Intrinsics.e(this.message, ((ItemNotAddedError) other).message);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ItemNotAddedError(AbstractC5607a message) {
                super(null);
                Intrinsics.j(message, "message");
                this.message = message;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC5607a getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "ItemNotAddedError(message=" + this.message + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"Lrn/U$e$j;", "Lrn/U$e;", "Lak/a;", "message", "action", "<init>", "(Lak/a;Lak/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "b", "()Lak/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.U$e$j, reason: from toString */
        public static final /* data */ class ItemSuccessfullyAdded extends e {

            /* renamed from: c, reason: collision with root package name */
            public static final int f159394c = AbstractC5607a.f45514b;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a message;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a action;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ItemSuccessfullyAdded)) {
                    return false;
                }
                ItemSuccessfullyAdded itemSuccessfullyAdded = (ItemSuccessfullyAdded) other;
                return Intrinsics.e(this.message, itemSuccessfullyAdded.message) && Intrinsics.e(this.action, itemSuccessfullyAdded.action);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ItemSuccessfullyAdded(AbstractC5607a message, AbstractC5607a action) {
                super(null);
                Intrinsics.j(message, "message");
                Intrinsics.j(action, "action");
                this.message = message;
                this.action = action;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC5607a getAction() {
                return this.action;
            }

            /* renamed from: b, reason: from getter */
            public final AbstractC5607a getMessage() {
                return this.message;
            }

            public int hashCode() {
                return (this.message.hashCode() * 31) + this.action.hashCode();
            }

            public String toString() {
                return "ItemSuccessfullyAdded(message=" + this.message + ", action=" + this.action + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lrn/U$e$k;", "Lrn/U$e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lak/a;", "a", "Lak/a;", "c", "()Lak/a;", "title", "b", "message", "positiveButtonText", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.U$e$k, reason: from toString */
        public static final /* data */ class OutOfStockDialogEvent extends e {

            /* renamed from: d, reason: collision with root package name */
            public static final int f159397d = AbstractC5607a.f45514b;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a title;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a message;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a positiveButtonText;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OutOfStockDialogEvent)) {
                    return false;
                }
                OutOfStockDialogEvent outOfStockDialogEvent = (OutOfStockDialogEvent) other;
                return Intrinsics.e(this.title, outOfStockDialogEvent.title) && Intrinsics.e(this.message, outOfStockDialogEvent.message) && Intrinsics.e(this.positiveButtonText, outOfStockDialogEvent.positiveButtonText);
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC5607a getMessage() {
                return this.message;
            }

            /* renamed from: b, reason: from getter */
            public final AbstractC5607a getPositiveButtonText() {
                return this.positiveButtonText;
            }

            /* renamed from: c, reason: from getter */
            public final AbstractC5607a getTitle() {
                return this.title;
            }

            public int hashCode() {
                return (((this.title.hashCode() * 31) + this.message.hashCode()) * 31) + this.positiveButtonText.hashCode();
            }

            public String toString() {
                return "OutOfStockDialogEvent(title=" + this.title + ", message=" + this.message + ", positiveButtonText=" + this.positiveButtonText + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/U$e$l;", "Lrn/U$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class l extends e {

            /* renamed from: a, reason: collision with root package name */
            public static final l f159401a = new l();

            private l() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof l);
            }

            public String toString() {
                return "ReviewOrderEvent";
            }

            public int hashCode() {
                return -1089629903;
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lrn/U$e$m;", "Lrn/U$e;", "LIr/a;", "Lur/a;", "dialogInfo", "<init>", "(LIr/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIr/a;", "()LIr/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.U$e$m, reason: from toString */
        public static final /* data */ class ShowChokingWarningDialogEvent extends e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final UserActionDialogInfo<AbstractC17302a> dialogInfo;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowChokingWarningDialogEvent) && Intrinsics.e(this.dialogInfo, ((ShowChokingWarningDialogEvent) other).dialogInfo);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowChokingWarningDialogEvent(UserActionDialogInfo<AbstractC17302a> dialogInfo) {
                super(null);
                Intrinsics.j(dialogInfo, "dialogInfo");
                this.dialogInfo = dialogInfo;
            }

            public final UserActionDialogInfo<AbstractC17302a> a() {
                return this.dialogInfo;
            }

            public int hashCode() {
                return this.dialogInfo.hashCode();
            }

            public String toString() {
                return "ShowChokingWarningDialogEvent(dialogInfo=" + this.dialogInfo + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/U$e$n;", "Lrn/U$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class n extends e {

            /* renamed from: a, reason: collision with root package name */
            public static final n f159403a = new n();

            private n() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof n);
            }

            public String toString() {
                return "ShowCreditCardTransactionSheet";
            }

            public int hashCode() {
                return 1733166804;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/U$e$o;", "Lrn/U$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class o extends e {

            /* renamed from: a, reason: collision with root package name */
            public static final o f159404a = new o();

            private o() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof o);
            }

            public String toString() {
                return "ShowExtendedRangeInfo";
            }

            public int hashCode() {
                return 1561261352;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/U$e$p;", "Lrn/U$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class p extends e {

            /* renamed from: a, reason: collision with root package name */
            public static final p f159405a = new p();

            private p() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof p);
            }

            public String toString() {
                return "ShowSummaryViewEBTPaperTrailBottomSheet";
            }

            public int hashCode() {
                return -1679500700;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrn/U$e$q;", "Lrn/U$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class q extends e {

            /* renamed from: a, reason: collision with root package name */
            public static final q f159406a = new q();

            private q() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof q);
            }

            public String toString() {
                return "ShowSummaryViewPreAuthorizationBottomSheet";
            }

            public int hashCode() {
                return -1633891843;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lrn/U$e$r;", "Lrn/U$e;", "", "displayAppliedOffer", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rn.U$e$r, reason: from toString */
        public static final /* data */ class ViewAppliedOfferEvent extends e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean displayAppliedOffer;

            public ViewAppliedOfferEvent(boolean z10) {
                super(null);
                this.displayAppliedOffer = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ViewAppliedOfferEvent) && this.displayAppliedOffer == ((ViewAppliedOfferEvent) other).displayAppliedOffer;
            }

            /* renamed from: a, reason: from getter */
            public final boolean getDisplayAppliedOffer() {
                return this.displayAppliedOffer;
            }

            public int hashCode() {
                return Boolean.hashCode(this.displayAppliedOffer);
            }

            public String toString() {
                return "ViewAppliedOfferEvent(displayAppliedOffer=" + this.displayAppliedOffer + ')';
            }
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private e() {
        }
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001Bñ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0012\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#Jú\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00122\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00122\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00122\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u00100R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u00100R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b4\u00107\u001a\u0004\b8\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b9\u0010CR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b8\u0010D\u001a\u0004\b=\u0010ER\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bA\u0010HR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00128\u0006¢\u0006\f\n\u0004\b?\u0010G\u001a\u0004\bI\u0010HR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00128\u0006¢\u0006\f\n\u0004\bI\u0010G\u001a\u0004\bF\u0010HR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b/\u0010G\u001a\u0004\bJ\u0010HR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00128\u0006¢\u0006\f\n\u0004\b;\u0010G\u001a\u0004\bK\u0010HR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\b5\u0010NR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\bK\u0010M\u001a\u0004\b3\u0010NR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bO\u0010.\u001a\u0004\b\u001f\u00100R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010.\u001a\u0004\bL\u00100R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bP\u0010.\u001a\u0004\bO\u00100¨\u0006Q"}, d2 = {"Lrn/U$f;", "", "", "progressIsVisible", "viewPagerIsVisible", "canDisplaySubsAndUnfulfilledItems", "isFinalOrder", "", "orderNumber", "Lej/C;", "shoppingCart", "LGk/a;", "Lrn/U$e;", "orderSummaryUIEvent", "Lhk/a;", "cartDecorator", "Lgn/n;", "orderDetailSummaryDecorator", "", "Lgn/r;", "orderItemsList", "Lgn/p;", "orderUnfulfilledItemsList", "Lgn/q;", "orderSubstitutionItemsList", "filteredOrderItemsList", "Lln/n;", "stackedPromos", "Lak/a;", "bottomSheetHeader", "bottomSheetButtonLabel", "isBottomSheetVisible", "showInformation", "isErrorSnackBar", "<init>", "(ZZZZLjava/lang/String;Lej/C;LGk/a;Lhk/a;Lgn/n;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lak/a;Lak/a;ZZZ)V", "a", "(ZZZZLjava/lang/String;Lej/C;LGk/a;Lhk/a;Lgn/n;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lak/a;Lak/a;ZZZ)Lrn/U$f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "m", "()Z", "b", "getViewPagerIsVisible", "c", "e", "d", "r", "Ljava/lang/String;", "i", "f", "Lej/C;", "n", "()Lej/C;", "g", "LGk/a;", "k", "()LGk/a;", "h", "Lhk/a;", "()Lhk/a;", "Lgn/n;", "()Lgn/n;", "j", "Ljava/util/List;", "()Ljava/util/List;", "l", "getFilteredOrderItemsList", "p", "o", "Lak/a;", "()Lak/a;", "q", "s", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rn.U$f, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean progressIsVisible;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean viewPagerIsVisible;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean canDisplaySubsAndUnfulfilledItems;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFinalOrder;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String orderNumber;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final ShoppingCart shoppingCart;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final UIEvent<e> orderSummaryUIEvent;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final CartPreviewDecorator cartDecorator;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final OrderDetailSummaryDecorator orderDetailSummaryDecorator;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ReadOnlyProductListDecorator> orderItemsList;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<OrderOutOfStockListDecorator> orderUnfulfilledItemsList;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<OrderSubstitutionsListDecorator> orderSubstitutionItemsList;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ReadOnlyProductListDecorator> filteredOrderItemsList;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<StackedPromo> stackedPromos;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a bottomSheetHeader;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a bottomSheetButtonLabel;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isBottomSheetVisible;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showInformation;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isErrorSnackBar;

        public ViewState() {
            this(false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, 524287, null);
        }

        public static /* synthetic */ ViewState b(ViewState viewState, boolean z10, boolean z11, boolean z12, boolean z13, String str, ShoppingCart shoppingCart, UIEvent uIEvent, CartPreviewDecorator cartPreviewDecorator, OrderDetailSummaryDecorator orderDetailSummaryDecorator, List list, List list2, List list3, List list4, List list5, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, boolean z14, boolean z15, boolean z16, int i10, Object obj) {
            boolean z17;
            boolean z18;
            boolean z19 = (i10 & 1) != 0 ? viewState.progressIsVisible : z10;
            boolean z20 = (i10 & 2) != 0 ? viewState.viewPagerIsVisible : z11;
            boolean z21 = (i10 & 4) != 0 ? viewState.canDisplaySubsAndUnfulfilledItems : z12;
            boolean z22 = (i10 & 8) != 0 ? viewState.isFinalOrder : z13;
            String str2 = (i10 & 16) != 0 ? viewState.orderNumber : str;
            ShoppingCart shoppingCart2 = (i10 & 32) != 0 ? viewState.shoppingCart : shoppingCart;
            UIEvent uIEvent2 = (i10 & 64) != 0 ? viewState.orderSummaryUIEvent : uIEvent;
            CartPreviewDecorator cartPreviewDecorator2 = (i10 & 128) != 0 ? viewState.cartDecorator : cartPreviewDecorator;
            OrderDetailSummaryDecorator orderDetailSummaryDecorator2 = (i10 & 256) != 0 ? viewState.orderDetailSummaryDecorator : orderDetailSummaryDecorator;
            List list6 = (i10 & 512) != 0 ? viewState.orderItemsList : list;
            List list7 = (i10 & 1024) != 0 ? viewState.orderUnfulfilledItemsList : list2;
            List list8 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? viewState.orderSubstitutionItemsList : list3;
            List list9 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? viewState.filteredOrderItemsList : list4;
            List list10 = (i10 & 8192) != 0 ? viewState.stackedPromos : list5;
            boolean z23 = z19;
            AbstractC5607a abstractC5607a3 = (i10 & 16384) != 0 ? viewState.bottomSheetHeader : abstractC5607a;
            AbstractC5607a abstractC5607a4 = (i10 & 32768) != 0 ? viewState.bottomSheetButtonLabel : abstractC5607a2;
            boolean z24 = (i10 & 65536) != 0 ? viewState.isBottomSheetVisible : z14;
            boolean z25 = (i10 & 131072) != 0 ? viewState.showInformation : z15;
            if ((i10 & 262144) != 0) {
                z18 = z25;
                z17 = viewState.isErrorSnackBar;
            } else {
                z17 = z16;
                z18 = z25;
            }
            return viewState.a(z23, z20, z21, z22, str2, shoppingCart2, uIEvent2, cartPreviewDecorator2, orderDetailSummaryDecorator2, list6, list7, list8, list9, list10, abstractC5607a3, abstractC5607a4, z24, z18, z17);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return this.progressIsVisible == viewState.progressIsVisible && this.viewPagerIsVisible == viewState.viewPagerIsVisible && this.canDisplaySubsAndUnfulfilledItems == viewState.canDisplaySubsAndUnfulfilledItems && this.isFinalOrder == viewState.isFinalOrder && Intrinsics.e(this.orderNumber, viewState.orderNumber) && Intrinsics.e(this.shoppingCart, viewState.shoppingCart) && Intrinsics.e(this.orderSummaryUIEvent, viewState.orderSummaryUIEvent) && Intrinsics.e(this.cartDecorator, viewState.cartDecorator) && Intrinsics.e(this.orderDetailSummaryDecorator, viewState.orderDetailSummaryDecorator) && Intrinsics.e(this.orderItemsList, viewState.orderItemsList) && Intrinsics.e(this.orderUnfulfilledItemsList, viewState.orderUnfulfilledItemsList) && Intrinsics.e(this.orderSubstitutionItemsList, viewState.orderSubstitutionItemsList) && Intrinsics.e(this.filteredOrderItemsList, viewState.filteredOrderItemsList) && Intrinsics.e(this.stackedPromos, viewState.stackedPromos) && Intrinsics.e(this.bottomSheetHeader, viewState.bottomSheetHeader) && Intrinsics.e(this.bottomSheetButtonLabel, viewState.bottomSheetButtonLabel) && this.isBottomSheetVisible == viewState.isBottomSheetVisible && this.showInformation == viewState.showInformation && this.isErrorSnackBar == viewState.isErrorSnackBar;
        }

        public ViewState(boolean z10, boolean z11, boolean z12, boolean z13, String str, ShoppingCart shoppingCart, UIEvent<e> orderSummaryUIEvent, CartPreviewDecorator cartDecorator, OrderDetailSummaryDecorator orderDetailSummaryDecorator, List<ReadOnlyProductListDecorator> orderItemsList, List<OrderOutOfStockListDecorator> orderUnfulfilledItemsList, List<OrderSubstitutionsListDecorator> orderSubstitutionItemsList, List<ReadOnlyProductListDecorator> filteredOrderItemsList, List<StackedPromo> stackedPromos, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, boolean z14, boolean z15, boolean z16) {
            Intrinsics.j(orderSummaryUIEvent, "orderSummaryUIEvent");
            Intrinsics.j(cartDecorator, "cartDecorator");
            Intrinsics.j(orderDetailSummaryDecorator, "orderDetailSummaryDecorator");
            Intrinsics.j(orderItemsList, "orderItemsList");
            Intrinsics.j(orderUnfulfilledItemsList, "orderUnfulfilledItemsList");
            Intrinsics.j(orderSubstitutionItemsList, "orderSubstitutionItemsList");
            Intrinsics.j(filteredOrderItemsList, "filteredOrderItemsList");
            Intrinsics.j(stackedPromos, "stackedPromos");
            this.progressIsVisible = z10;
            this.viewPagerIsVisible = z11;
            this.canDisplaySubsAndUnfulfilledItems = z12;
            this.isFinalOrder = z13;
            this.orderNumber = str;
            this.shoppingCart = shoppingCart;
            this.orderSummaryUIEvent = orderSummaryUIEvent;
            this.cartDecorator = cartDecorator;
            this.orderDetailSummaryDecorator = orderDetailSummaryDecorator;
            this.orderItemsList = orderItemsList;
            this.orderUnfulfilledItemsList = orderUnfulfilledItemsList;
            this.orderSubstitutionItemsList = orderSubstitutionItemsList;
            this.filteredOrderItemsList = filteredOrderItemsList;
            this.stackedPromos = stackedPromos;
            this.bottomSheetHeader = abstractC5607a;
            this.bottomSheetButtonLabel = abstractC5607a2;
            this.isBottomSheetVisible = z14;
            this.showInformation = z15;
            this.isErrorSnackBar = z16;
        }

        public final ViewState a(boolean progressIsVisible, boolean viewPagerIsVisible, boolean canDisplaySubsAndUnfulfilledItems, boolean isFinalOrder, String orderNumber, ShoppingCart shoppingCart, UIEvent<e> orderSummaryUIEvent, CartPreviewDecorator cartDecorator, OrderDetailSummaryDecorator orderDetailSummaryDecorator, List<ReadOnlyProductListDecorator> orderItemsList, List<OrderOutOfStockListDecorator> orderUnfulfilledItemsList, List<OrderSubstitutionsListDecorator> orderSubstitutionItemsList, List<ReadOnlyProductListDecorator> filteredOrderItemsList, List<StackedPromo> stackedPromos, AbstractC5607a bottomSheetHeader, AbstractC5607a bottomSheetButtonLabel, boolean isBottomSheetVisible, boolean showInformation, boolean isErrorSnackBar) {
            Intrinsics.j(orderSummaryUIEvent, "orderSummaryUIEvent");
            Intrinsics.j(cartDecorator, "cartDecorator");
            Intrinsics.j(orderDetailSummaryDecorator, "orderDetailSummaryDecorator");
            Intrinsics.j(orderItemsList, "orderItemsList");
            Intrinsics.j(orderUnfulfilledItemsList, "orderUnfulfilledItemsList");
            Intrinsics.j(orderSubstitutionItemsList, "orderSubstitutionItemsList");
            Intrinsics.j(filteredOrderItemsList, "filteredOrderItemsList");
            Intrinsics.j(stackedPromos, "stackedPromos");
            return new ViewState(progressIsVisible, viewPagerIsVisible, canDisplaySubsAndUnfulfilledItems, isFinalOrder, orderNumber, shoppingCart, orderSummaryUIEvent, cartDecorator, orderDetailSummaryDecorator, orderItemsList, orderUnfulfilledItemsList, orderSubstitutionItemsList, filteredOrderItemsList, stackedPromos, bottomSheetHeader, bottomSheetButtonLabel, isBottomSheetVisible, showInformation, isErrorSnackBar);
        }

        /* renamed from: c, reason: from getter */
        public final AbstractC5607a getBottomSheetButtonLabel() {
            return this.bottomSheetButtonLabel;
        }

        /* renamed from: d, reason: from getter */
        public final AbstractC5607a getBottomSheetHeader() {
            return this.bottomSheetHeader;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getCanDisplaySubsAndUnfulfilledItems() {
            return this.canDisplaySubsAndUnfulfilledItems;
        }

        /* renamed from: f, reason: from getter */
        public final CartPreviewDecorator getCartDecorator() {
            return this.cartDecorator;
        }

        /* renamed from: g, reason: from getter */
        public final OrderDetailSummaryDecorator getOrderDetailSummaryDecorator() {
            return this.orderDetailSummaryDecorator;
        }

        public final List<ReadOnlyProductListDecorator> h() {
            return this.orderItemsList;
        }

        public int hashCode() {
            int iHashCode = ((((((Boolean.hashCode(this.progressIsVisible) * 31) + Boolean.hashCode(this.viewPagerIsVisible)) * 31) + Boolean.hashCode(this.canDisplaySubsAndUnfulfilledItems)) * 31) + Boolean.hashCode(this.isFinalOrder)) * 31;
            String str = this.orderNumber;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ShoppingCart shoppingCart = this.shoppingCart;
            int iHashCode3 = (((((((((((((((((iHashCode2 + (shoppingCart == null ? 0 : shoppingCart.hashCode())) * 31) + this.orderSummaryUIEvent.hashCode()) * 31) + this.cartDecorator.hashCode()) * 31) + this.orderDetailSummaryDecorator.hashCode()) * 31) + this.orderItemsList.hashCode()) * 31) + this.orderUnfulfilledItemsList.hashCode()) * 31) + this.orderSubstitutionItemsList.hashCode()) * 31) + this.filteredOrderItemsList.hashCode()) * 31) + this.stackedPromos.hashCode()) * 31;
            AbstractC5607a abstractC5607a = this.bottomSheetHeader;
            int iHashCode4 = (iHashCode3 + (abstractC5607a == null ? 0 : abstractC5607a.hashCode())) * 31;
            AbstractC5607a abstractC5607a2 = this.bottomSheetButtonLabel;
            return ((((((iHashCode4 + (abstractC5607a2 != null ? abstractC5607a2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isBottomSheetVisible)) * 31) + Boolean.hashCode(this.showInformation)) * 31) + Boolean.hashCode(this.isErrorSnackBar);
        }

        /* renamed from: i, reason: from getter */
        public final String getOrderNumber() {
            return this.orderNumber;
        }

        public final List<OrderSubstitutionsListDecorator> j() {
            return this.orderSubstitutionItemsList;
        }

        public final UIEvent<e> k() {
            return this.orderSummaryUIEvent;
        }

        public final List<OrderOutOfStockListDecorator> l() {
            return this.orderUnfulfilledItemsList;
        }

        /* renamed from: m, reason: from getter */
        public final boolean getProgressIsVisible() {
            return this.progressIsVisible;
        }

        /* renamed from: n, reason: from getter */
        public final ShoppingCart getShoppingCart() {
            return this.shoppingCart;
        }

        /* renamed from: o, reason: from getter */
        public final boolean getShowInformation() {
            return this.showInformation;
        }

        public final List<StackedPromo> p() {
            return this.stackedPromos;
        }

        /* renamed from: q, reason: from getter */
        public final boolean getIsErrorSnackBar() {
            return this.isErrorSnackBar;
        }

        /* renamed from: r, reason: from getter */
        public final boolean getIsFinalOrder() {
            return this.isFinalOrder;
        }

        public String toString() {
            return "ViewState(progressIsVisible=" + this.progressIsVisible + ", viewPagerIsVisible=" + this.viewPagerIsVisible + ", canDisplaySubsAndUnfulfilledItems=" + this.canDisplaySubsAndUnfulfilledItems + ", isFinalOrder=" + this.isFinalOrder + ", orderNumber=" + this.orderNumber + ", shoppingCart=" + this.shoppingCart + ", orderSummaryUIEvent=" + this.orderSummaryUIEvent + ", cartDecorator=" + this.cartDecorator + ", orderDetailSummaryDecorator=" + this.orderDetailSummaryDecorator + ", orderItemsList=" + this.orderItemsList + ", orderUnfulfilledItemsList=" + this.orderUnfulfilledItemsList + ", orderSubstitutionItemsList=" + this.orderSubstitutionItemsList + ", filteredOrderItemsList=" + this.filteredOrderItemsList + ", stackedPromos=" + this.stackedPromos + ", bottomSheetHeader=" + this.bottomSheetHeader + ", bottomSheetButtonLabel=" + this.bottomSheetButtonLabel + ", isBottomSheetVisible=" + this.isBottomSheetVisible + ", showInformation=" + this.showInformation + ", isErrorSnackBar=" + this.isErrorSnackBar + ')';
        }

        public /* synthetic */ ViewState(boolean z10, boolean z11, boolean z12, boolean z13, String str, ShoppingCart shoppingCart, UIEvent uIEvent, CartPreviewDecorator cartPreviewDecorator, OrderDetailSummaryDecorator orderDetailSummaryDecorator, List list, List list2, List list3, List list4, List list5, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, boolean z14, boolean z15, boolean z16, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? null : str, (i10 & 32) != 0 ? null : shoppingCart, (i10 & 64) != 0 ? new UIEvent(null, 1, null) : uIEvent, (i10 & 128) != 0 ? new CartPreviewDecorator(false, 0, 3, null) : cartPreviewDecorator, (i10 & 256) != 0 ? new OrderDetailSummaryDecorator(null, null, null, false, null, null, null, null, null, null, null, null, false, false, 16383, null) : orderDetailSummaryDecorator, (i10 & 512) != 0 ? CollectionsKt.m() : list, (i10 & 1024) != 0 ? CollectionsKt.m() : list2, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? CollectionsKt.m() : list3, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? CollectionsKt.m() : list4, (i10 & 8192) != 0 ? ln.i.u() : list5, (i10 & 16384) != 0 ? null : abstractC5607a, (i10 & 32768) != 0 ? null : abstractC5607a2, (i10 & 65536) != 0 ? false : z14, (i10 & 131072) != 0 ? false : z15, (i10 & 262144) != 0 ? false : z16);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.OrderSummaryViewModel$addAllItemsToCartFromSelectedOrder$2$1", f = "OrderSummaryViewModel.kt", l = {602}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f159427a;

        /* renamed from: b, reason: collision with root package name */
        int f159428b;

        /* renamed from: c, reason: collision with root package name */
        int f159429c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f159430d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<EntryUpdate> f159432f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(List<EntryUpdate> list, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f159432f = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = U.this.new g(this.f159432f, continuation);
            gVar.f159430d = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r8.f159429c
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r8.f159427a
                qv.O r0 = (qv.InterfaceC16622O) r0
                java.lang.Object r0 = r8.f159430d
                qv.O r0 = (qv.InterfaceC16622O) r0
                kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L18
                goto L44
            L18:
                r9 = move-exception
                goto L4f
            L1a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L22:
                kotlin.ResultKt.b(r9)
                java.lang.Object r9 = r8.f159430d
                qv.O r9 = (qv.InterfaceC16622O) r9
                rn.U r1 = rn.U.this
                java.util.List<ej.m> r4 = r8.f159432f
                kotlin.Result$Companion r5 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L4b
                hl.m r1 = rn.U.t(r1)     // Catch: java.lang.Throwable -> L4b
                r8.f159430d = r9     // Catch: java.lang.Throwable -> L4b
                r8.f159427a = r9     // Catch: java.lang.Throwable -> L4b
                r8.f159428b = r3     // Catch: java.lang.Throwable -> L4b
                r8.f159429c = r2     // Catch: java.lang.Throwable -> L4b
                java.lang.Object r1 = r1.u(r4, r8)     // Catch: java.lang.Throwable -> L4b
                if (r1 != r0) goto L42
                return r0
            L42:
                r0 = r9
                r9 = r1
            L44:
                ej.e r9 = (ej.CartChanges) r9     // Catch: java.lang.Throwable -> L18
                java.lang.Object r9 = kotlin.Result.b(r9)     // Catch: java.lang.Throwable -> L18
                goto L59
            L4b:
                r0 = move-exception
                r7 = r0
                r0 = r9
                r9 = r7
            L4f:
                kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
                java.lang.Object r9 = kotlin.ResultKt.a(r9)
                java.lang.Object r9 = kotlin.Result.b(r9)
            L59:
                rn.U r1 = rn.U.this
                boolean r4 = kotlin.Result.h(r9)
                if (r4 == 0) goto L7d
                r4 = r9
                ej.e r4 = (ej.CartChanges) r4
                r4 = 0
                rn.U.P(r1, r4, r3, r2, r4)
                ak.a$a r2 = ak.AbstractC5607a.INSTANCE
                int r4 = tr.C17135b.f162017e
                java.lang.Object[] r5 = new java.lang.Object[r3]
                ak.a r4 = r2.d(r4, r5)
                int r5 = tr.C17135b.f162001T0
                java.lang.Object[] r6 = new java.lang.Object[r3]
                ak.a r2 = r2.d(r5, r6)
                rn.U.y(r1, r4, r2, r3)
            L7d:
                rn.U r1 = rn.U.this
                java.lang.Throwable r9 = kotlin.Result.e(r9)
                if (r9 == 0) goto L9e
                kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
                qv.E0.i(r0)
                boolean r0 = r9 instanceof java.lang.Error
                if (r0 != 0) goto L9d
                uw.a$a r0 = uw.a.INSTANCE
                java.lang.String r2 = "Add all Items to cart Failed"
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r0.f(r9, r2, r3)
                rn.U.r(r1)
                goto L9e
            L9d:
                throw r9
            L9e:
                kotlin.Unit r9 = kotlin.Unit.f142422a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: rn.U.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.OrderSummaryViewModel$observeCartInteractor$2", f = "OrderSummaryViewModel.kt", l = {298}, m = "invokeSuspend")
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f159433a;

        /* renamed from: b, reason: collision with root package name */
        int f159434b;

        /* renamed from: c, reason: collision with root package name */
        int f159435c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f159436d;

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            h hVar = U.this.new h(continuation);
            hVar.f159436d = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v2, types: [qv.O] */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, qv.O] */
        /* JADX WARN: Type inference failed for: r1v8, types: [qv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r12;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f159435c;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ?? r13 = (InterfaceC16622O) this.f159436d;
                        ResultKt.b(obj);
                        i10 = r13;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    ?? r14 = (InterfaceC16622O) this.f159436d;
                    U u10 = U.this;
                    Result.Companion companion = Result.INSTANCE;
                    wr.f fVar = u10.cartInteractor;
                    this.f159436d = r14;
                    this.f159433a = r14;
                    this.f159434b = 0;
                    this.f159435c = 1;
                    i10 = r14;
                    if (wr.f.n(fVar, true, false, this, 2, null) == objF) {
                        return objF;
                    }
                }
                objB = Result.b(Unit.f142422a);
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
                    uw.a.INSTANCE.l(thE, "fetchLatestCart failed in OrderSummaryViewModel", new Object[0]);
                } else {
                    throw thE;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.viewmodel.OrderSummaryViewModel$onAction$1", f = "OrderSummaryViewModel.kt", l = {HttpResponseStatus.INFORMATIONAL_CONTINUE}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class i extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f159438a;

        /* renamed from: b, reason: collision with root package name */
        int f159439b;

        /* renamed from: c, reason: collision with root package name */
        int f159440c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f159441d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f159443f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(d dVar, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f159443f = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            i iVar = U.this.new i(this.f159443f, continuation);
            iVar.f159441d = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v12, types: [qv.O] */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v2, types: [qv.O] */
        /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, qv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            ?? r22;
            Object value;
            Object objS;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f159440c;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    ?? r23 = (InterfaceC16622O) this.f159441d;
                    U u10 = U.this;
                    d dVar = this.f159443f;
                    Result.Companion companion = Result.INSTANCE;
                    com.meijer.mobile.digitalshopping.api.orders.a aVar = u10.ordersRepository;
                    String orderID = ((d.FetchDetails) dVar).getOrderID();
                    this.f159441d = r23;
                    this.f159438a = r23;
                    this.f159439b = 0;
                    this.f159440c = 1;
                    objS = aVar.s(orderID, this);
                    i10 = r23;
                    if (objS == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r24 = (InterfaceC16622O) this.f159441d;
                    ResultKt.b(obj);
                    objS = obj;
                    i10 = r24;
                }
                objB = Result.b((OrderDetail) objS);
                r22 = i10;
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
                r22 = i10;
            }
            U u11 = U.this;
            d dVar2 = this.f159443f;
            if (Result.h(objB)) {
                d.FetchDetails fetchDetails = (d.FetchDetails) dVar2;
                u11.I((OrderDetail) objB, fetchDetails.c(), fetchDetails.b());
            }
            U u12 = U.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                E0.i(r22.getCoroutineContext());
                if (thE instanceof Error) {
                    throw thE;
                }
                uw.a.INSTANCE.f(thE, "Error getting order details in OrderSummaryViewModel", new Object[0]);
                InterfaceC17140B interfaceC17140B = u12._viewState;
                do {
                    value = interfaceC17140B.getValue();
                } while (!interfaceC17140B.e(value, ViewState.b((ViewState) value, false, false, false, false, null, null, new UIEvent(e.d.f159388a), null, null, null, null, null, null, null, null, null, false, false, false, 524222, null)));
            }
            return Unit.f142422a;
        }
    }

    public U(com.meijer.mobile.digitalshopping.api.orders.a ordersRepository, wr.f cartInteractor, hl.m cartRepository, yo.k userManager, InterfaceC14261a analyticsEngine) {
        Intrinsics.j(ordersRepository, "ordersRepository");
        Intrinsics.j(cartInteractor, "cartInteractor");
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.ordersRepository = ordersRepository;
        this.cartInteractor = cartInteractor;
        this.cartRepository = cartRepository;
        this.analyticsEngine = analyticsEngine;
        InterfaceC17140B<ViewState> interfaceC17140BA = tv.S.a(new ViewState(false, false, false, false, null, null, null, new CartPreviewDecorator(userManager.b(), 0, 2, null), null, null, null, null, null, null, null, null, false, false, false, 524159, null));
        this._viewState = interfaceC17140BA;
        this.viewState = C17154h.c(interfaceC17140BA);
        Nu.a aVar = new Nu.a();
        this.compositeDisposable = aVar;
        F();
        this.cartInteractor.p();
        if (userManager.b()) {
            io.reactivex.l<Integer> lVarSubscribeOn = this.cartRepository.Q().distinctUntilChanged().subscribeOn(C14764a.b());
            final a aVar2 = new a(this);
            Pu.g<? super Integer> gVar = new Pu.g() { // from class: rn.S
                @Override // Pu.g
                public final void accept(Object obj) {
                    U.p(aVar2, obj);
                }
            };
            final b bVar = new b(uw.a.INSTANCE);
            Ck.a.a(lVarSubscribeOn.subscribe(gVar, new Pu.g() { // from class: rn.T
                @Override // Pu.g
                public final void accept(Object obj) {
                    U.q(bVar, obj);
                }
            }), aVar);
        }
    }

    private final void A() {
        List<ReadOnlyProductListDecorator> listH = this.viewState.getValue().h();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listH, 10));
        for (ReadOnlyProductListDecorator readOnlyProductListDecorator : listH) {
            arrayList.add(new EntryUpdate(readOnlyProductListDecorator.getProduct(), readOnlyProductListDecorator.getQuantity()));
        }
        C16648k.d(androidx.view.d0.a(this), null, null, new g(arrayList, null), 3, null);
    }

    private final String B(boolean singleItem) {
        boolean isFinalOrder = this._viewState.getValue().getIsFinalOrder();
        return (!singleItem || isFinalOrder) ? (singleItem && isFinalOrder) ? "add from previous final order" : (singleItem || isFinalOrder) ? "add from previous final order: Reorder All items" : "add from previous original order: Reorder All items" : "add from previous original order";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        ViewState value;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.b(value, false, false, false, false, null, null, new UIEvent(e.a.f159382a), null, null, null, null, null, null, null, null, null, false, false, false, 524223, null)));
    }

    private final void F() {
        ViewState value;
        wr.f.r(this.cartInteractor, false, this, 1, null);
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.b(value, false, false, false, false, null, this._viewState.getValue().getShoppingCart(), null, null, null, null, null, null, null, null, null, null, false, false, false, 524255, null)));
        this.cartInteractor.p();
        C16648k.d(androidx.view.d0.a(this), null, null, new h(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(int itemCount) {
        ViewState value;
        ViewState viewState;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            viewState = value;
        } while (!interfaceC17140B.e(value, ViewState.b(viewState, false, false, false, false, null, null, null, CartPreviewDecorator.b(viewState.getCartDecorator(), false, itemCount, 1, null), null, null, null, null, null, null, null, null, false, false, false, 524159, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(gj.OrderDetail r38, java.util.List<vo.OrderSubstitutionItem> r39, java.util.List<uo.OrderOutOfStockItem> r40) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.U.I(gj.c, java.util.List, java.util.List):void");
    }

    private final Double L(ProductFullDetails product) {
        List<Entry> listP;
        Entry entryA;
        ShoppingCart shoppingCart = this._viewState.getValue().getShoppingCart();
        if (shoppingCart == null || (listP = shoppingCart.p()) == null || (entryA = ej.l.a(listP, product.getCode())) == null) {
            return null;
        }
        return Double.valueOf(entryA.getActualQuantity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(AbstractC5607a message, AbstractC5607a action, boolean isError) {
        ViewState value;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.b(value, false, false, false, false, null, null, new UIEvent(isError ? new e.ItemNotAddedError(message) : action != null ? new e.ItemSuccessfullyAdded(message, action) : null), null, null, null, null, null, null, null, null, null, false, false, isError, 262079, null)));
    }

    static /* synthetic */ void N(U u10, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            abstractC5607a2 = null;
        }
        u10.M(abstractC5607a, abstractC5607a2, z10);
    }

    private final void O(List<ReadOnlyProductListDecorator> products, boolean addSingleItem) {
        ProductFullDetails product;
        ProductFullDetails product2;
        String totalPriceRawValue;
        String strK;
        List<ReadOnlyProductListDecorator> listH = products == null ? this._viewState.getValue().h() : products;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listH, 10));
        Iterator<T> it = listH.iterator();
        while (true) {
            boolValueOf = null;
            Boolean boolValueOf = null;
            if (!it.hasNext()) {
                break;
            }
            ReadOnlyProductListDecorator readOnlyProductListDecorator = (ReadOnlyProductListDecorator) it.next();
            Double dValueOf = (readOnlyProductListDecorator == null || (totalPriceRawValue = readOnlyProductListDecorator.getTotalPriceRawValue()) == null || (strK = new Regex("[$,.]").k(totalPriceRawValue, "")) == null) ? null : Double.valueOf(Double.parseDouble(strK) / 100);
            String code = (readOnlyProductListDecorator == null || (product2 = readOnlyProductListDecorator.getProduct()) == null) ? null : product2.getCode();
            Double dValueOf2 = readOnlyProductListDecorator != null ? Double.valueOf(readOnlyProductListDecorator.getQuantity()) : null;
            if (readOnlyProductListDecorator != null && (product = readOnlyProductListDecorator.getProduct()) != null) {
                boolValueOf = Boolean.valueOf(product.getIsAlcohol());
            }
            arrayList.add(new W.Details(code, null, null, dValueOf2, dValueOf, null, null, boolValueOf, null, null, null, null, null, null, null, null, B(addSingleItem), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65690, 16383, null));
        }
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        C2930u c2930u = C2930u.f1407a;
        ShoppingCart shoppingCart = this._viewState.getValue().getShoppingCart();
        interfaceC14261a.e(c2930u.W(shoppingCart != null ? shoppingCart.getCode() : null, this._viewState.getValue().getIsFinalOrder(), this._viewState.getValue().getOrderNumber(), arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void P(U u10, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = null;
        }
        u10.O(list, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(OrderDetail orderDetail, List list, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("Order History");
        track.h("order status", orderDetail.getStatusDisplay());
        track.h("purchaseID", orderDetail.getCode());
        track.c(Ao.W.f1200a.d(list));
        return Unit.f142422a;
    }

    public final tv.P<ViewState> E() {
        return this.viewState;
    }

    public final void G(d action) {
        ViewState value;
        AbstractC5607a.Companion companion;
        ViewState value2;
        AbstractC5607a.Companion companion2;
        ViewState value3;
        AbstractC5607a.Companion companion3;
        ViewState value4;
        AbstractC5607a.Companion companion4;
        ViewState value5;
        ViewState value6;
        ViewState viewState;
        ArrayList arrayList;
        ViewState value7;
        ViewState value8;
        ViewState value9;
        Intrinsics.j(action, "action");
        Object obj = null;
        if (action instanceof d.FetchDetails) {
            F();
            C16648k.d(androidx.view.d0.a(this), null, null, new i(action, null), 3, null);
            return;
        }
        if (action instanceof d.GoProductDetailAction) {
            InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
            do {
                value9 = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value9, ViewState.b(value9, false, false, false, false, null, null, new UIEvent(new e.GoProductDetailEvent(((d.GoProductDetailAction) action).getProduct())), null, null, null, null, null, null, null, null, null, false, false, false, 524223, null)));
            return;
        }
        if (action instanceof d.a) {
            A();
            return;
        }
        if (action instanceof d.AddToCartAction) {
            Iterator<T> it = this.viewState.getValue().h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.e(((ReadOnlyProductListDecorator) next).getProduct(), ((d.AddToCartAction) action).getProduct())) {
                    obj = next;
                    break;
                }
            }
            O(CollectionsKt.e((ReadOnlyProductListDecorator) obj), true);
            d.AddToCartAction addToCartAction = (d.AddToCartAction) action;
            wr.f.M(this.cartInteractor, addToCartAction.getProduct(), D(addToCartAction.getProduct(), addToCartAction.getProduct().getQtyIncrement()), false, null, 12, null);
            return;
        }
        if (action instanceof d.UserAcceptAddToCartAction) {
            wr.f.B(this.cartInteractor, new AbstractC17116a.Accept(((d.UserAcceptAddToCartAction) action).getCartUpdateRequest(), null, null, 4, null), false, null, 6, null);
            return;
        }
        if (action instanceof d.GoToSavingsLink) {
            InterfaceC17140B<ViewState> interfaceC17140B2 = this._viewState;
            do {
                value8 = interfaceC17140B2.getValue();
            } while (!interfaceC17140B2.e(value8, ViewState.b(value8, false, false, false, false, null, null, new UIEvent(new e.GoToSavingsLinkEvent(((d.GoToSavingsLink) action).getItem())), null, null, null, null, null, null, null, null, null, false, false, false, 524223, null)));
            return;
        }
        if (action instanceof d.ViewAppliedOffer) {
            InterfaceC17140B<ViewState> interfaceC17140B3 = this._viewState;
            do {
                value7 = interfaceC17140B3.getValue();
            } while (!interfaceC17140B3.e(value7, ViewState.b(value7, false, false, false, false, null, null, new UIEvent(new e.ViewAppliedOfferEvent(((d.ViewAppliedOffer) action).getDisplayAppliedOffer())), null, null, null, null, null, null, null, null, null, false, false, false, 524223, null)));
            return;
        }
        if (action instanceof d.UpdateStackedPromosExpandedView) {
            InterfaceC17140B<ViewState> interfaceC17140B4 = this._viewState;
            do {
                value6 = interfaceC17140B4.getValue();
                viewState = value6;
                List<StackedPromo> listP = viewState.p();
                arrayList = new ArrayList(CollectionsKt.x(listP, 10));
                for (StackedPromo stackedPromo : listP) {
                    d.UpdateStackedPromosExpandedView updateStackedPromosExpandedView = (d.UpdateStackedPromosExpandedView) action;
                    Boolean boolValueOf = Boolean.valueOf(updateStackedPromosExpandedView.getIsExpanded());
                    if (stackedPromo.getIndex() != updateStackedPromosExpandedView.getIndex()) {
                        boolValueOf = null;
                    }
                    arrayList.add(StackedPromo.b(stackedPromo, null, null, 0, boolValueOf != null ? boolValueOf.booleanValue() : false, 7, null));
                }
            } while (!interfaceC17140B4.e(value6, ViewState.b(viewState, false, false, false, false, null, null, null, null, null, null, null, null, null, arrayList, null, null, false, false, false, 516095, null)));
            return;
        }
        if (action instanceof d.NavigateToProductDetail) {
            InterfaceC17140B<ViewState> interfaceC17140B5 = this._viewState;
            do {
                value5 = interfaceC17140B5.getValue();
            } while (!interfaceC17140B5.e(value5, ViewState.b(value5, false, false, false, false, null, null, new UIEvent(new e.GoProductDetailEvent(((d.NavigateToProductDetail) action).getProduct())), null, null, null, null, null, null, null, null, null, false, false, false, 524223, null)));
            return;
        }
        if (action instanceof d.i) {
            InterfaceC17140B<ViewState> interfaceC17140B6 = this._viewState;
            do {
                value4 = interfaceC17140B6.getValue();
                companion4 = AbstractC5607a.INSTANCE;
            } while (!interfaceC17140B6.e(value4, ViewState.b(value4, false, false, false, false, null, null, new UIEvent(e.p.f159405a), null, null, null, null, null, null, null, companion4.d(com.meijer.mobile.meijer.Y.f99629J3, new Object[0]), companion4.d(com.meijer.mobile.meijer.Y.f100169l1, new Object[0]), true, false, false, 278463, null)));
            return;
        }
        if (action instanceof d.j) {
            InterfaceC17140B<ViewState> interfaceC17140B7 = this._viewState;
            do {
                value3 = interfaceC17140B7.getValue();
                companion3 = AbstractC5607a.INSTANCE;
            } while (!interfaceC17140B7.e(value3, ViewState.b(value3, false, false, false, false, null, null, new UIEvent(e.q.f159406a), null, null, null, null, null, null, null, companion3.d(com.meijer.mobile.meijer.Y.f100326si, new Object[0]), companion3.d(com.meijer.mobile.meijer.Y.f100135j7, new Object[0]), true, true, false, 278463, null)));
            return;
        }
        if (action instanceof d.h) {
            InterfaceC17140B<ViewState> interfaceC17140B8 = this._viewState;
            do {
                value2 = interfaceC17140B8.getValue();
                companion2 = AbstractC5607a.INSTANCE;
            } while (!interfaceC17140B8.e(value2, ViewState.b(value2, false, false, false, false, null, null, new UIEvent(e.o.f159404a), null, null, null, null, null, null, null, companion2.d(com.meijer.mobile.meijer.Y.f100393w5, new Object[0]), companion2.d(com.meijer.mobile.meijer.Y.f100135j7, new Object[0]), true, true, false, 278463, null)));
            return;
        }
        if (!(action instanceof d.g)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC17140B<ViewState> interfaceC17140B9 = this._viewState;
        do {
            value = interfaceC17140B9.getValue();
            companion = AbstractC5607a.INSTANCE;
        } while (!interfaceC17140B9.e(value, ViewState.b(value, false, false, false, false, null, null, new UIEvent(e.n.f159403a), null, null, null, null, null, null, null, companion.d(com.meijer.mobile.meijer.Y.f99855V1, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f100169l1, new Object[0]), true, false, false, 278463, null)));
    }

    @Override // wr.InterfaceC17847a
    /* renamed from: getDisposable, reason: from getter */
    public Nu.a getDisposables() {
        return this.compositeDisposable;
    }

    @Override // wr.InterfaceC17847a
    public void observeCart(tk.c<ShoppingCart> cartResource) {
        ViewState value;
        if (cartResource == null) {
            return;
        }
        if (cartResource instanceof c.Failure) {
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            new e.CartLoadingError(companion.d(C17135b.f161990O, new Object[0]), companion.d(C17135b.f161992P, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f99529Dh, new Object[0]));
        } else {
            InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
            do {
                value = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value, ViewState.b(value, false, false, false, false, null, cartResource.a(), null, null, null, null, null, null, null, null, null, null, false, false, false, 524255, null)));
            Unit unit = Unit.f142422a;
        }
    }

    @Override // wr.InterfaceC17847a
    public void processedRequest(AbstractC17302a processedRequest, tk.c<EntryChange> entryChange) {
        Intrinsics.j(processedRequest, "processedRequest");
        Intrinsics.j(entryChange, "entryChange");
        if ((processedRequest instanceof AbstractC17302a.Add) || (processedRequest instanceof AbstractC17302a.Update)) {
            if (entryChange instanceof c.Failure) {
                EntryChange entryChange2 = (EntryChange) ((c.Failure) entryChange).a();
                if ((entryChange2 != null ? entryChange2.getStatusCode() : null) == EntryChange.c.f128932c) {
                    N(this, AbstractC5607a.INSTANCE.d(C17135b.f161979I0, new Object[0]), null, true, 2, null);
                    return;
                } else {
                    N(this, AbstractC5607a.INSTANCE.d(C17135b.f161995Q0, new Object[0]), null, true, 2, null);
                    return;
                }
            }
            if (entryChange instanceof c.Success) {
                AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
                M(companion.d(C17135b.f162019f, new Object[0]), companion.d(C17135b.f162001T0, new Object[0]), false);
            } else if (!(entryChange instanceof c.Loading)) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override // wr.InterfaceC17847a
    public <T> void throwChallenge(AbstractC17116a<AbstractC17604a, T> challenge) {
        ViewState value;
        Intrinsics.j(challenge, "challenge");
        if (!(challenge.f() instanceof AbstractC17604a.ChokingHazardChallenge)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC17604a abstractC17604aF = challenge.f();
        Intrinsics.h(abstractC17604aF, "null cannot be cast to non-null type com.meijer.mobile.ui.cart.challenges.CartChallenge.ChokingHazardChallenge");
        AbstractC17604a.ChokingHazardChallenge chokingHazardChallenge = (AbstractC17604a.ChokingHazardChallenge) abstractC17604aF;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.b(value, false, false, false, false, null, null, new UIEvent(new e.ShowChokingWarningDialogEvent(chokingHazardChallenge.a())), null, null, null, null, null, null, null, null, null, false, false, false, 524223, null)));
    }

    private final double D(ProductFullDetails product, double qtyIncrement) {
        double dDoubleValue;
        Double dL = L(product);
        if (dL != null) {
            dDoubleValue = dL.doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        if (dDoubleValue > 0.0d) {
            return dDoubleValue + qtyIncrement;
        }
        return qtyIncrement;
    }

    private final void J(Entry entry, List<OrderOutOfStockItem> listOutOfStockItems) {
        List<Image> listJ = entry.m().j();
        ProductFullDetails productFullDetailsM = entry.m();
        listOutOfStockItems.add(new OrderOutOfStockItem(null, entry.m().getName(), listJ, entry.m().getQtyIncrement(), entry.m().getPrice(), productFullDetailsM, 1, null));
    }

    private final void K(Entry entry, List<OrderSubstitutionItem> listSubstitutedItems) {
        listSubstitutedItems.add(new OrderSubstitutionItem(entry.m().getStoreId(), null, entry.m().getName(), null, entry.m().j(), entry.m().getQtyIncrement(), null, entry.m().getPrice(), null, entry.m(), null, false, 3402, null));
    }

    private final void Q(final OrderDetail orderResponse) {
        List<Entry> listU = orderResponse.u();
        final ArrayList arrayList = new ArrayList(CollectionsKt.x(listU, 10));
        for (Entry entry : listU) {
            arrayList.add(new W.Details(entry.m().getCode(), null, null, Double.valueOf(entry.getActualQuantity()), Double.valueOf(entry.getTotalPrice().getValue()), null, null, Boolean.valueOf(entry.m().getIsAlcohol()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -154, 16383, null));
        }
        this.analyticsEngine.h(C14476c.h("order details: items in order"), new Function1() { // from class: rn.Q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return U.R(orderResponse, arrayList, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
