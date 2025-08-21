package Lm;

import Fq.ShoppingListItem;
import Pk.Coupon;
import Sk.CouponOptions;
import Tr.A;
import Tr.C5371b;
import Tr.CouponsListChange;
import Ur.d;
import bk.AbstractC6392a;
import com.meijer.mobile.core.models.coupon.CouponAd;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.coupons.api.models.AddOfferErrorType;
import com.meijer.mobile.coupons.api.models.CouponsRequest;
import com.meijer.mobile.ui.legacy.progressview.ProgressView;
import dl.C13702d;
import el.CouponsResponse;
import ev.C13889a;
import gi.GoogleAdAnalytics;
import gi.GoogleAdData;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pv.P;
import um.AbstractC17446a;
import um.InterfaceC17447b;
import vm.C17693b;
import yo.C18335a;
import ys.C18372b;

@Metadata(d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 O2\u00020\u00012\u00020\u00022\u00020\u0003:\u0004Þ\u0001ß\u0001Ba\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020 2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0011\u0010*\u001a\u0004\u0018\u00010)H\u0014¢\u0006\u0004\b*\u0010+J\u001b\u0010.\u001a\u00020 2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00180,¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020 ¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020 H\u0016¢\u0006\u0004\b2\u00101J\u000f\u00103\u001a\u00020 H\u0016¢\u0006\u0004\b3\u00101J\u000f\u00104\u001a\u00020 H\u0016¢\u0006\u0004\b4\u00101J\u000f\u00105\u001a\u00020\u001eH\u0016¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020 ¢\u0006\u0004\b7\u00101J\r\u00108\u001a\u00020 ¢\u0006\u0004\b8\u00101J\u0017\u0010;\u001a\u00020 2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020 2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J\u001d\u0010C\u001a\u00020 2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020A0,H\u0016¢\u0006\u0004\bC\u0010/J\u001d\u0010F\u001a\u00020 2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020D0,H\u0016¢\u0006\u0004\bF\u0010/J\u001f\u0010I\u001a\u00020 2\u0006\u0010H\u001a\u00020G2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\bI\u0010JJ\u001f\u0010K\u001a\u00020 2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020 2\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020 H\u0016¢\u0006\u0004\bQ\u00101J\u000f\u0010R\u001a\u00020 H\u0016¢\u0006\u0004\bR\u00101J\u000f\u0010S\u001a\u00020\u001eH\u0016¢\u0006\u0004\bS\u00106J\u000f\u0010T\u001a\u00020\u001eH\u0016¢\u0006\u0004\bT\u00106J\u000f\u0010U\u001a\u00020\u001eH\u0016¢\u0006\u0004\bU\u00106J\u001f\u0010W\u001a\u00020 2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010V\u001a\u00020\u001e¢\u0006\u0004\bW\u0010XJ\u001f\u0010\\\u001a\u00020G2\b\b\u0001\u0010Y\u001a\u00020G2\u0006\u0010[\u001a\u00020Z¢\u0006\u0004\b\\\u0010]J5\u0010a\u001a\b\u0012\u0004\u0012\u00020Z0,2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020M0,2\u0006\u0010_\u001a\u00020\u001e2\b\u0010`\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\ba\u0010bJ1\u0010g\u001a\u00020\u001e2\u0006\u0010c\u001a\u00020\u00162\u001a\u0010f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180dj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0018`e¢\u0006\u0004\bg\u0010hJ\u0017\u0010i\u001a\u00020\u001e2\u0006\u0010_\u001a\u00020\u001eH\u0016¢\u0006\u0004\bi\u0010jJ\u001f\u0010m\u001a\u00020 2\u0006\u0010k\u001a\u00020G2\u0006\u0010l\u001a\u00020GH\u0016¢\u0006\u0004\bm\u0010nJ\u0017\u0010o\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\bo\u0010$J\u0015\u0010p\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\bp\u0010$J\u000f\u0010q\u001a\u00020 H\u0004¢\u0006\u0004\bq\u00101J\u0017\u0010r\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\br\u0010$J\u001f\u0010t\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010s\u001a\u00020\u001eH\u0014¢\u0006\u0004\bt\u0010\"J\u001f\u0010u\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010s\u001a\u00020\u001eH\u0014¢\u0006\u0004\bu\u0010\"J\u0017\u0010x\u001a\u00020 2\b\u0010w\u001a\u0004\u0018\u00010v¢\u0006\u0004\bx\u0010yJ\r\u0010z\u001a\u00020 ¢\u0006\u0004\bz\u00101R\u001a\u0010\u0007\u001a\u00020\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\bF\u0010{\u001a\u0004\b|\u0010}R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bC\u0010\u0080\u0001R\u001e\u0010\r\u001a\u00020\f8\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001e\u0010\u000f\u001a\u00020\u000e8\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001e\u0010\u0011\u001a\u00020\u00108\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001e\u0010\u0013\u001a\u00020\u00128\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001e\u0010\u0015\u001a\u00020\u00148\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001b\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001b\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010 \u0001\u001a\u00030\u009d\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0018\u0010¢\u0001\u001a\u00030\u009d\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010\u009f\u0001R\u0018\u0010¤\u0001\u001a\u00030\u009d\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b£\u0001\u0010\u009f\u0001R\u0018\u0010¦\u0001\u001a\u00030\u009d\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010\u009f\u0001R\u001f\u0010«\u0001\u001a\n\u0012\u0005\u0012\u00030¨\u00010§\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u001c\u0010®\u0001\u001a\u00030\u009d\u00018\u0006¢\u0006\u000f\n\u0005\bK\u0010\u009f\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u001d\u0010±\u0001\u001a\u00030\u009d\u00018\u0006¢\u0006\u0010\n\u0006\b¯\u0001\u0010\u009f\u0001\u001a\u0006\b°\u0001\u0010\u00ad\u0001R$\u0010µ\u0001\u001a\n\u0012\u0005\u0012\u00030¨\u00010§\u00018\u0006¢\u0006\u0010\n\u0006\b²\u0001\u0010ª\u0001\u001a\u0006\b³\u0001\u0010´\u0001R\u001c\u0010¹\u0001\u001a\u0005\u0018\u00010¶\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u0018\u0010»\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bº\u0001\u0010qR(\u0010Á\u0001\u001a\u00020G8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b¼\u0001\u0010?\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001R'\u0010Ä\u0001\u001a\u00020G8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0004\bR\u0010?\u001a\u0006\bÂ\u0001\u0010¾\u0001\"\u0006\bÃ\u0001\u0010À\u0001R/\u0010Ë\u0001\u001a\u0012\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Æ\u00010,\u0018\u00010Å\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÇ\u0001\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001R\u0017\u0010Í\u0001\u001a\u00020G8gX¦\u0004¢\u0006\b\u001a\u0006\bÌ\u0001\u0010¾\u0001R\u0016\u0010Ï\u0001\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0007\u001a\u0005\bÎ\u0001\u00106R\u0018\u0010Ó\u0001\u001a\u00030Ð\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÑ\u0001\u0010Ò\u0001R\u0017\u0010Õ\u0001\u001a\u00020G8WX\u0096\u0004¢\u0006\b\u001a\u0006\bÔ\u0001\u0010¾\u0001R\u0017\u0010×\u0001\u001a\u00020G8WX\u0096\u0004¢\u0006\b\u001a\u0006\bÖ\u0001\u0010¾\u0001R\u0017\u0010Ù\u0001\u001a\u00020\u00188VX\u0096\u0004¢\u0006\b\u001a\u0006\bØ\u0001\u0010\u009c\u0001R\u0018\u0010Ý\u0001\u001a\u00030Ú\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÛ\u0001\u0010Ü\u0001¨\u0006à\u0001"}, d2 = {"LLm/h;", "Lum/a;", "LTr/A$a;", "Lcom/meijer/mobile/ui/legacy/progressview/ProgressView$d;", "Lvm/b;", "appBackgroundManager", "Lyo/k;", "userManager", "Lil/m;", "cartRepository", "Ldl/d;", "couponsRepository", "Lhi/a;", "analyticsEngine", "Lyo/a;", "appPrefManager", "LTq/j;", "storeProvider", "LTr/b;", "couponChangeManager", "LTr/A;", "couponsCommandManager", "LSk/a;", "couponOptions", "", "tag", "<init>", "(Lvm/b;Lyo/k;Lil/m;Ldl/d;Lhi/a;Lyo/a;LTq/j;LTr/b;LTr/A;LSk/a;Ljava/lang/String;)V", "LTr/B;", "change", "", "sendNetworkRequest", "", "U0", "(LTr/B;Z)V", "M0", "(LTr/B;)V", "Lgi/a;", "analytics", "d1", "(Lgi/a;)V", "LLm/h$b;", "D0", "()LLm/h$b;", "", "siblingPageTags", "h1", "(Ljava/util/List;)V", "i1", "()V", "Q", "P", "S", "T", "()Z", "j1", "p1", "Lel/a;", "couponsResponse", "E", "(Lel/a;)V", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "exception", "I", "(Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;)V", "Lcom/meijer/mobile/core/models/coupon/CouponAd;", "ads", "f", "LFq/c;", "shoppingList", "d", "", "messageResId", "F", "(ILTr/B;)V", "s", "(Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;LTr/B;)V", "LPk/a;", "coupon", "A", "(LPk/a;)V", "G", "y", "N0", "t1", "u1", "refreshNow", "s1", "(LSk/a;Z)V", "itemViewType", "LUr/d$j;", "item", "w0", "(ILUr/d$j;)I", "listOfCoupons", "hasSpecialOffers", "specialOffersUrl", "a0", "(Ljava/util/List;ZLjava/lang/String;)Ljava/util/List;", "newOptions", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "filterCategories", "b1", "(LSk/a;Ljava/util/ArrayList;)Z", "v1", "(Z)Z", "couponsCount", "totalCoupons", "w1", "(II)V", "R0", "V0", "Z", "I0", "updateCoupon", "L0", "G0", "LUr/d$l;", "removal", "X0", "(LUr/d$l;)V", "g1", "Lyo/k;", "B0", "()Lyo/k;", "e", "Lil/m;", "Ldl/d;", "g", "Lhi/a;", "b0", "()Lhi/a;", "h", "Lyo/a;", "getAppPrefManager", "()Lyo/a;", "i", "LTq/j;", "v0", "()LTq/j;", "j", "LTr/b;", "c0", "()LTr/b;", "k", "LTr/A;", "g0", "()LTr/A;", "l", "LSk/a;", "f0", "()LSk/a;", "m", "Ljava/lang/String;", "y0", "()Ljava/lang/String;", "Landroidx/databinding/j;", "n", "Landroidx/databinding/j;", "couponsViewVisibility", "o", "noCouponsTextVisibility", "p", "couponsHeaderVisibility", "q", "unauthenticatedVisibility", "Landroidx/databinding/i;", "Lbk/a;", "r", "Landroidx/databinding/i;", "couponsHeaderText", "t0", "()Landroidx/databinding/j;", "searchNoCouponsViewVisibility", "t", "getCartItemCount", "cartItemCount", "u", "u0", "()Landroidx/databinding/i;", "searchTerm", "LJu/b;", "v", "LJu/b;", "cartDisposable", "w", "shouldDelayRefresh", "x", "d0", "()I", "setCouponCount", "(I)V", "couponCount", "z0", "setTotalCouponCount", "totalCouponCount", "Lpv/P;", "Lgi/d;", "z", "Lpv/P;", "l0", "()Lpv/P;", "googleAdsListState", "q0", "noCouponsTextResourceId", "O0", "isBasePage", "LQk/c;", "r0", "()LQk/c;", "pageType", "i0", "errorMessageResourceId", "p0", "loadingMessageResourceId", "A0", "trackingPage", "Lcom/meijer/mobile/coupons/api/models/CouponsRequest;", "h0", "()Lcom/meijer/mobile/coupons/api/models/CouponsRequest;", "couponsRequest", "b", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class h extends AbstractC17446a implements A.a, ProgressView.d {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: B, reason: collision with root package name */
    public static final int f19233B = 8;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final il.m cartRepository;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C13702d couponsRepository;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C18335a appPrefManager;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final C5371b couponChangeManager;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final A couponsCommandManager;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final CouponOptions couponOptions;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final String tag;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final androidx.databinding.j couponsViewVisibility;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final androidx.databinding.j noCouponsTextVisibility;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final androidx.databinding.j couponsHeaderVisibility;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final androidx.databinding.j unauthenticatedVisibility;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final androidx.databinding.i<AbstractC6392a> couponsHeaderText;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final androidx.databinding.j searchNoCouponsViewVisibility;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final androidx.databinding.j cartItemCount;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final androidx.databinding.i<AbstractC6392a> searchTerm;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Ju.b cartDisposable;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean shouldDelayRefresh;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private int couponCount;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private int totalCouponCount;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final P<List<GoogleAdData>> googleAdsListState;

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u007f\u0010 \u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"LLm/h$a;", "", "<init>", "()V", "LQk/c;", "couponPage", "Lvm/b;", "appBackgroundManager", "Lyo/k;", "userManager", "Lil/m;", "cartRepository", "Ldl/d;", "couponsRepository", "Lhi/a;", "analyticsEngine", "Lyo/a;", "appPrefManager", "LTq/j;", "storeProvider", "LTr/b;", "couponChangeManager", "LTr/A;", "couponsCommandManager", "LSk/a;", "couponOptions", "", "LPk/a;", "specialOffers", "", "tag", "LLm/h;", "a", "(LQk/c;Lvm/b;Lyo/k;Lil/m;Ldl/d;Lhi/a;Lyo/a;LTq/j;LTr/b;LTr/A;LSk/a;Ljava/util/List;Ljava/lang/String;)LLm/h;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Lm.h$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Lm.h$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0337a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Qk.c.values().length];
                try {
                    iArr[Qk.c.f31046j.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Qk.c.f31047k.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Qk.c.f31042f.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Qk.c.f31048l.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Qk.c.f31050n.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Qk.c.f31041e.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Qk.c.f31043g.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[Qk.c.f31044h.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[Qk.c.f31049m.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[Qk.c.f31045i.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[Qk.c.f31040d.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public final h a(Qk.c couponPage, C17693b appBackgroundManager, yo.k userManager, il.m cartRepository, C13702d couponsRepository, InterfaceC14523a analyticsEngine, C18335a appPrefManager, Tq.j storeProvider, C5371b couponChangeManager, A couponsCommandManager, CouponOptions couponOptions, List<Coupon> specialOffers, String tag) {
            Intrinsics.j(couponPage, "couponPage");
            Intrinsics.j(appBackgroundManager, "appBackgroundManager");
            Intrinsics.j(userManager, "userManager");
            Intrinsics.j(cartRepository, "cartRepository");
            Intrinsics.j(couponsRepository, "couponsRepository");
            Intrinsics.j(analyticsEngine, "analyticsEngine");
            Intrinsics.j(appPrefManager, "appPrefManager");
            Intrinsics.j(storeProvider, "storeProvider");
            Intrinsics.j(couponChangeManager, "couponChangeManager");
            Intrinsics.j(couponsCommandManager, "couponsCommandManager");
            Intrinsics.j(couponOptions, "couponOptions");
            Intrinsics.j(tag, "tag");
            switch (C0337a.$EnumSwitchMapping$0[couponPage.ordinal()]) {
                case 1:
                    return new a(appBackgroundManager, userManager, cartRepository, couponsRepository, analyticsEngine, appPrefManager, storeProvider, couponChangeManager, couponsCommandManager, couponOptions, tag);
                case 2:
                    return new i(appBackgroundManager, userManager, cartRepository, couponsRepository, analyticsEngine, appPrefManager, storeProvider, couponChangeManager, couponsCommandManager, couponOptions, tag);
                case 3:
                    return new v(appBackgroundManager, userManager, cartRepository, couponsRepository, analyticsEngine, appPrefManager, storeProvider, couponChangeManager, couponsCommandManager, couponOptions, tag);
                case 4:
                    return new x(appBackgroundManager, userManager, cartRepository, couponsRepository, analyticsEngine, appPrefManager, storeProvider, couponChangeManager, couponsCommandManager, couponOptions, specialOffers, tag);
                case 5:
                    return new p(appBackgroundManager, userManager, cartRepository, couponsRepository, analyticsEngine, appPrefManager, storeProvider, couponChangeManager, couponsCommandManager, couponOptions, tag);
                case 6:
                    return new j(appBackgroundManager, userManager, cartRepository, couponsRepository, analyticsEngine, appPrefManager, storeProvider, couponChangeManager, couponsCommandManager, couponOptions, tag);
                case 7:
                case 8:
                case 9:
                    return new t(appBackgroundManager, userManager, cartRepository, couponsRepository, analyticsEngine, appPrefManager, storeProvider, couponChangeManager, couponsCommandManager, couponOptions, tag, couponPage);
                case 10:
                    return new u(appBackgroundManager, userManager, cartRepository, couponsRepository, analyticsEngine, appPrefManager, storeProvider, couponChangeManager, couponsCommandManager, couponOptions, tag);
                case 11:
                    return new Lm.c(appBackgroundManager, userManager, cartRepository, couponsRepository, analyticsEngine, appPrefManager, storeProvider, couponChangeManager, couponsCommandManager, couponOptions, tag);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002H&¢\u0006\u0004\b\u000e\u0010\u0007J\u001d\u0010\u0011\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002H&¢\u0006\u0004\b\u0011\u0010\u0007J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\bH&¢\u0006\u0004\b\u0013\u0010\u000bJ\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010!\u001a\u00020\u00052\b\b\u0001\u0010\u001f\u001a\u00020\b2\b\b\u0001\u0010 \u001a\u00020\bH&¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b#\u0010\u001aJ\u000f\u0010$\u001a\u00020\u0005H&¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\bH&¢\u0006\u0004\b&\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006'À\u0006\u0001"}, d2 = {"LLm/h$b;", "Lum/b;", "", "LUr/d$j;", "coupons", "", "a0", "(Ljava/util/List;)V", "", "errorMessageResId", "P0", "(I)V", "LFq/c;", "shoppingList", "d", "Lcom/meijer/mobile/core/models/coupon/CouponAd;", "ads", "f", "couponCount", "j", "LPk/a;", "coupon", "LUr/d$l;", "D", "(LPk/a;)LUr/d$l;", "m0", "(LPk/a;)V", "LTr/B;", "change", "c1", "(LTr/B;)V", "title", "message", "k0", "(II)V", "p", "X0", "()V", "e0", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b extends InterfaceC17447b {
        d.Removal D(Coupon coupon);

        void P0(int errorMessageResId);

        void X0();

        void a0(List<d.j> coupons);

        void c1(CouponsListChange change);

        void d(List<ShoppingListItem> shoppingList);

        void e0(int couponCount);

        void f(List<CouponAd> ads);

        void j(int couponCount);

        void k0(int title, int message);

        void m0(Coupon coupon);

        void p(Coupon coupon);
    }

    public boolean N0() {
        return false;
    }

    public abstract boolean O0();

    public void d1(GoogleAdAnalytics analytics) {
        Intrinsics.j(analytics, "analytics");
    }

    public final void i1() {
        this.shouldDelayRefresh = false;
        this.f164283b = AbstractC17446a.EnumC2605a.NEEDS_REFRESH;
    }

    public abstract int q0();

    /* renamed from: r0 */
    public abstract Qk.c getPageType();

    public boolean t1() {
        return false;
    }

    public boolean u1() {
        return false;
    }

    public boolean v1(boolean hasSpecialOffers) {
        return hasSpecialOffers;
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CouponsListChange.a.values().length];
            try {
                iArr[CouponsListChange.a.f36746c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CouponsListChange.a.f36745b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CouponsListChange.a.f36744a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CouponsListChange.a.f36747d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C17693b appBackgroundManager, yo.k userManager, il.m cartRepository, C13702d couponsRepository, InterfaceC14523a analyticsEngine, C18335a appPrefManager, Tq.j storeProvider, C5371b couponChangeManager, A couponsCommandManager, CouponOptions couponOptions, String tag) {
        super(appBackgroundManager);
        Intrinsics.j(appBackgroundManager, "appBackgroundManager");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(couponsRepository, "couponsRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(appPrefManager, "appPrefManager");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(couponChangeManager, "couponChangeManager");
        Intrinsics.j(couponsCommandManager, "couponsCommandManager");
        Intrinsics.j(couponOptions, "couponOptions");
        Intrinsics.j(tag, "tag");
        this.userManager = userManager;
        this.cartRepository = cartRepository;
        this.couponsRepository = couponsRepository;
        this.analyticsEngine = analyticsEngine;
        this.appPrefManager = appPrefManager;
        this.storeProvider = storeProvider;
        this.couponChangeManager = couponChangeManager;
        this.couponsCommandManager = couponsCommandManager;
        this.couponOptions = couponOptions;
        this.tag = tag;
        this.couponsViewVisibility = new androidx.databinding.j(0);
        this.noCouponsTextVisibility = new androidx.databinding.j(8);
        this.couponsHeaderVisibility = new androidx.databinding.j(8);
        this.unauthenticatedVisibility = new androidx.databinding.j(8);
        this.couponsHeaderText = new androidx.databinding.i<>();
        this.searchNoCouponsViewVisibility = new androidx.databinding.j(8);
        this.cartItemCount = new androidx.databinding.j(0);
        this.searchTerm = new androidx.databinding.i<>(AbstractC6392a.INSTANCE.d(C18372b.f172059j, couponOptions.getSearchCriteria()));
        couponsCommandManager.n0(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k1(h hVar, Integer num) {
        androidx.databinding.j jVar = hVar.cartItemCount;
        Intrinsics.g(num);
        jVar.N(num.intValue());
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m1(Throwable th2) {
        qw.a.INSTANCE.e(th2);
        return Unit.f143329a;
    }

    @Override // Tr.A.a
    public void A(Coupon coupon) {
        Intrinsics.j(coupon, "coupon");
        if (N()) {
            b bVarD0 = D0();
            Intrinsics.g(bVarD0);
            bVarD0.p(coupon);
        }
    }

    public String A0() {
        return "mperks: coupons";
    }

    /* renamed from: B0, reason: from getter */
    protected final yo.k getUserManager() {
        return this.userManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E(el.CouponsResponse r6) {
        /*
            r5 = this;
            java.lang.String r0 = "couponsResponse"
            kotlin.jvm.internal.Intrinsics.j(r6, r0)
            java.util.List r0 = r6.f()
            if (r0 != 0) goto L12
            java.util.List r0 = kotlin.collections.CollectionsKt.m()
            r6.k(r0)
        L12:
            boolean r0 = r5.N()
            r1 = 0
            if (r0 == 0) goto L63
            Lm.h$b r0 = r5.D0()
            kotlin.jvm.internal.Intrinsics.g(r0)
            java.util.List r2 = r6.f()
            kotlin.jvm.internal.Intrinsics.g(r2)
            boolean r3 = r6.getHasSpecialOffers()
            java.lang.String r4 = r6.getSpecialOffersUrl()
            java.util.List r2 = r5.a0(r2, r3, r4)
            r0.a0(r2)
            Lm.h$b r0 = r5.D0()
            kotlin.jvm.internal.Intrinsics.g(r0)
            r0.S0(r1, r1)
            Lm.h$b r0 = r5.D0()
            kotlin.jvm.internal.Intrinsics.g(r0)
            java.util.List r2 = r6.f()
            kotlin.jvm.internal.Intrinsics.g(r2)
            int r2 = r2.size()
            r0.j(r2)
            Lm.h$b r0 = r5.D0()
            kotlin.jvm.internal.Intrinsics.g(r0)
            int r2 = r6.getAvailableCouponCount()
            r0.e0(r2)
        L63:
            androidx.databinding.j r0 = r5.couponsViewVisibility
            java.util.List r2 = r6.f()
            kotlin.jvm.internal.Intrinsics.g(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r3 = 8
            if (r2 != 0) goto L78
            r2 = r1
            goto L79
        L78:
            r2 = r3
        L79:
            r0.N(r2)
            androidx.databinding.j r0 = r5.noCouponsTextVisibility
            java.util.List r2 = r6.f()
            kotlin.jvm.internal.Intrinsics.g(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L8f
            r2 = r3
            goto L90
        L8f:
            r2 = r1
        L90:
            r0.N(r2)
            androidx.databinding.j r0 = r5.searchNoCouponsViewVisibility
            Qk.c r2 = r5.getPageType()
            Qk.c r4 = Qk.c.f31042f
            if (r2 != r4) goto Lac
            java.util.List r2 = r6.f()
            kotlin.jvm.internal.Intrinsics.g(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Lb2
        Lac:
            Qk.c r2 = r5.getPageType()
            if (r2 == r4) goto Lb3
        Lb2:
            r1 = r3
        Lb3:
            r0.N(r1)
            int r0 = r6.getCouponCount()
            int r6 = r6.getAvailableCouponCount()
            r5.w1(r0, r6)
            r5.p1()
            um.a$a r6 = um.AbstractC17446a.EnumC2605a.IDLE
            r5.f164283b = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Lm.h.E(el.a):void");
    }

    @Override // Tr.A.a
    public void F(int messageResId, CouponsListChange change) {
        Intrinsics.j(change, "change");
        U0(change, false);
        if (N()) {
            b bVarD0 = D0();
            Intrinsics.g(bVarD0);
            bVarD0.c1(change);
            b bVarD02 = D0();
            Intrinsics.g(bVarD02);
            bVarD02.k0(0, messageResId);
        }
    }

    protected void G0(CouponsListChange change, boolean updateCoupon) {
        Intrinsics.j(change, "change");
        if (N() && updateCoupon) {
            b bVarD0 = D0();
            Intrinsics.g(bVarD0);
            Coupon coupon = change.getCoupon();
            Intrinsics.g(coupon);
            bVarD0.m0(coupon);
        }
    }

    @Override // Tr.A.a
    public void I(RetrofitException exception) {
        Intrinsics.j(exception, "exception");
        if (N()) {
            if (exception.getErrorType() instanceof CouponsResponse.EnumC2049a) {
                b bVarD0 = D0();
                Intrinsics.g(bVarD0);
                sk.b errorType = exception.getErrorType();
                Intrinsics.h(errorType, "null cannot be cast to non-null type com.meijer.mobile.coupons.domain.models.CouponsResponse.CouponsResponseCode");
                bVarD0.k0(0, ((CouponsResponse.EnumC2049a) errorType).getErrorResourceId());
                this.noCouponsTextVisibility.N(0);
                this.searchNoCouponsViewVisibility.N(getPageType() == Qk.c.f31042f ? 0 : 8);
            } else {
                b bVarD02 = D0();
                Intrinsics.g(bVarD02);
                bVarD02.P0(i0());
            }
            b bVarD03 = D0();
            Intrinsics.g(bVarD03);
            bVarD03.a0(CollectionsKt.m());
            b bVarD04 = D0();
            Intrinsics.g(bVarD04);
            bVarD04.j(0);
            b bVarD05 = D0();
            Intrinsics.g(bVarD05);
            bVarD05.e0(0);
        }
    }

    protected void I0(CouponsListChange change) {
        Intrinsics.j(change, "change");
        if (N()) {
            b bVarD0 = D0();
            Intrinsics.g(bVarD0);
            Coupon coupon = change.getCoupon();
            Intrinsics.g(coupon);
            if (bVarD0.D(coupon) != null) {
                w1(this.couponCount - 1, this.totalCouponCount);
                b bVarD02 = D0();
                Intrinsics.g(bVarD02);
                bVarD02.j(this.couponCount);
            }
        }
    }

    protected void L0(CouponsListChange change, boolean updateCoupon) {
        Intrinsics.j(change, "change");
        if (N() && updateCoupon) {
            b bVarD0 = D0();
            Intrinsics.g(bVarD0);
            Coupon coupon = change.getCoupon();
            Intrinsics.g(coupon);
            bVarD0.m0(coupon);
        }
    }

    public void R0(CouponsListChange change) {
        Intrinsics.j(change, "change");
        U0(change, true);
        if (!O0()) {
            this.couponChangeManager.a(change);
        }
        if (N()) {
            b bVarD0 = D0();
            Intrinsics.g(bVarD0);
            bVarD0.c1(change);
        }
    }

    @Override // um.AbstractC17446a
    public boolean T() {
        if (this.shouldDelayRefresh) {
            return false;
        }
        return super.T() || this.couponChangeManager.f(this.tag);
    }

    public final void V0(CouponsListChange change) {
        Intrinsics.j(change, "change");
        U0(change, false);
    }

    public final void X0(d.Removal removal) {
        if (removal != null) {
            w1(this.couponCount - 1, this.totalCouponCount);
        }
    }

    protected final void Z() {
        if (this.couponChangeManager.e()) {
            Iterator<CouponsListChange> it = this.couponChangeManager.c().iterator();
            while (it.hasNext()) {
                U0(it.next(), false);
            }
        }
    }

    public List<d.j> a0(List<Coupon> listOfCoupons, boolean hasSpecialOffers, String specialOffersUrl) {
        Intrinsics.j(listOfCoupons, "listOfCoupons");
        return Km.v.f17576a.b(listOfCoupons, this.couponOptions.getIsShowCategoryHeaders(), v1(hasSpecialOffers), specialOffersUrl, this.couponsRepository);
    }

    /* renamed from: b0, reason: from getter */
    protected final InterfaceC14523a getAnalyticsEngine() {
        return this.analyticsEngine;
    }

    public final boolean b1(CouponOptions newOptions, ArrayList<String> filterCategories) {
        Intrinsics.j(newOptions, "newOptions");
        Intrinsics.j(filterCategories, "filterCategories");
        TrackingData trackingData = new TrackingData(C14756c.a("event: coupon refine apply"), null, 2, null);
        if (!Intrinsics.e(newOptions.e(), this.couponOptions.e())) {
            if (newOptions.e().isEmpty()) {
                trackingData.h("departmentID", "Clear");
            } else {
                trackingData.h("departmentID", filterCategories.toString());
            }
        }
        newOptions.i();
        this.userManager.Q(getPageType().name(), newOptions.i().name());
        trackingData.h("Sortby", newOptions.i().l());
        if (newOptions.getIsShowCategoryHeaders() != this.couponOptions.getIsShowCategoryHeaders()) {
            this.userManager.X(getPageType().name(), newOptions.getIsShowCategoryHeaders());
            trackingData.h("Showcategoryheaders", newOptions.getIsShowCategoryHeaders() ? "yes" : "no");
        }
        if (newOptions.getIsShowClippedCoupons() != this.couponOptions.getIsShowClippedCoupons()) {
            this.userManager.W(getPageType().name(), newOptions.getIsShowClippedCoupons());
        }
        if (!trackingData.k().isEmpty()) {
            this.analyticsEngine.k(trackingData.n(getPageType() == Qk.c.f31041e ? "mperks: clipped" : "mperks: coupons").v("mperks"));
        }
        newOptions.i();
        boolean z10 = (newOptions.i() == this.couponOptions.i() && Intrinsics.e(newOptions.e(), this.couponOptions.e()) && newOptions.getIsShowCategoryHeaders() == this.couponOptions.getIsShowCategoryHeaders() && newOptions.getIsShowClippedCoupons() == this.couponOptions.getIsShowClippedCoupons()) ? false : true;
        s1(newOptions, false);
        return z10;
    }

    /* renamed from: c0, reason: from getter */
    protected final C5371b getCouponChangeManager() {
        return this.couponChangeManager;
    }

    @Override // Tr.A.a
    public void d(List<ShoppingListItem> shoppingList) {
        Intrinsics.j(shoppingList, "shoppingList");
        if (N()) {
            b bVarD0 = D0();
            Intrinsics.g(bVarD0);
            bVarD0.d(shoppingList);
        }
    }

    /* renamed from: d0, reason: from getter */
    public final int getCouponCount() {
        return this.couponCount;
    }

    @Override // Tr.A.a
    public void f(List<CouponAd> ads) {
        Intrinsics.j(ads, "ads");
        Collections.shuffle(CollectionsKt.m1(ads));
        if (N()) {
            b bVarD0 = D0();
            Intrinsics.g(bVarD0);
            bVarD0.f(ads);
        }
    }

    /* renamed from: f0, reason: from getter */
    public final CouponOptions getCouponOptions() {
        return this.couponOptions;
    }

    /* renamed from: g0, reason: from getter */
    protected final A getCouponsCommandManager() {
        return this.couponsCommandManager;
    }

    public final void g1() {
        w1(this.couponCount + 1, this.totalCouponCount);
    }

    public final androidx.databinding.j getCartItemCount() {
        return this.cartItemCount;
    }

    public CouponsRequest h0() {
        return CouponsRequest.INSTANCE.b(this.couponOptions, this.storeProvider.h().getZipCode(), this.storeProvider.h().getStoreId());
    }

    public final void h1(List<String> siblingPageTags) {
        Intrinsics.j(siblingPageTags, "siblingPageTags");
        if (O0()) {
            this.couponChangeManager.g(this.tag, siblingPageTags);
        }
    }

    public int i0() {
        return Nr.g.f22658I;
    }

    public final void j1() {
        this.couponsCommandManager.d0(h0());
        this.f164283b = AbstractC17446a.EnumC2605a.REFRESHING_DATA;
    }

    public P<List<GoogleAdData>> l0() {
        return this.googleAdsListState;
    }

    public int p0() {
        return Nr.g.f22659J;
    }

    public final void p1() {
        if (this.userManager.b()) {
            this.couponsCommandManager.i0();
        }
    }

    @Override // Tr.A.a
    public void s(RetrofitException exception, CouponsListChange change) {
        Intrinsics.j(exception, "exception");
        Intrinsics.j(change, "change");
        U0(change, false);
        if (N()) {
            b bVarD0 = D0();
            Intrinsics.g(bVarD0);
            bVarD0.c1(change);
            if (exception.getExceptionKind() == RetrofitException.b.f97000b) {
                b bVarD02 = D0();
                Intrinsics.g(bVarD02);
                bVarD02.k0(0, qk.f.f158513k);
            } else if (exception.getErrorType() == null) {
                b bVarD03 = D0();
                Intrinsics.g(bVarD03);
                bVarD03.k0(0, Nr.g.f22712s);
            } else {
                b bVarD04 = D0();
                Intrinsics.g(bVarD04);
                int i10 = exception.getErrorType() == AddOfferErrorType.CLIPPED_COUPONS_LIMIT_ERROR ? Nr.g.f22656G : 0;
                sk.b errorType = exception.getErrorType();
                Intrinsics.g(errorType);
                bVarD04.k0(i10, errorType.getErrorResourceId());
            }
        }
    }

    public final void s1(CouponOptions couponOptions, boolean refreshNow) {
        CouponOptions couponOptions2 = this.couponOptions;
        Intrinsics.g(couponOptions);
        couponOptions2.c(couponOptions);
        this.searchTerm.N(AbstractC6392a.INSTANCE.d(C18372b.f172059j, this.couponOptions.getSearchCriteria()));
        this.f164283b = AbstractC17446a.EnumC2605a.NEEDS_REFRESH;
        if (refreshNow) {
            S();
        }
    }

    /* renamed from: t0, reason: from getter */
    public final androidx.databinding.j getSearchNoCouponsViewVisibility() {
        return this.searchNoCouponsViewVisibility;
    }

    public final androidx.databinding.i<AbstractC6392a> u0() {
        return this.searchTerm;
    }

    /* renamed from: v0, reason: from getter */
    protected final Tq.j getStoreProvider() {
        return this.storeProvider;
    }

    public final int w0(int itemViewType, d.j item) {
        Intrinsics.j(item, "item");
        if (this.userManager.b() && itemViewType == Nr.e.f22636e) {
            Object obj = item.value;
            Intrinsics.h(obj, "null cannot be cast to non-null type com.meijer.mobile.coupon.model.common.Coupon");
            Coupon coupon = (Coupon) obj;
            boolean isHidden = coupon.getIsHidden();
            boolean isClipped = coupon.getIsClipped();
            boolean zC = coupon.c();
            if (!isClipped && !isHidden && !zC) {
                return 48;
            }
        }
        return 0;
    }

    public void w1(int couponsCount, int totalCoupons) {
        this.couponCount = couponsCount;
        this.totalCouponCount = totalCoupons;
        this.noCouponsTextVisibility.N(couponsCount > 0 ? 8 : 0);
        androidx.databinding.j jVar = this.searchNoCouponsViewVisibility;
        Qk.c pageType = getPageType();
        Qk.c cVar = Qk.c.f31042f;
        jVar.N(((pageType == cVar && this.couponCount > 0) || getPageType() != cVar) ? 8 : 0);
        if (N()) {
            b bVarD0 = D0();
            Intrinsics.g(bVarD0);
            bVarD0.j(this.couponCount);
        }
    }

    @Override // com.meijer.mobile.ui.legacy.progressview.ProgressView.d
    public void y() {
        this.f164283b = AbstractC17446a.EnumC2605a.NEEDS_REFRESH;
        S();
    }

    /* renamed from: y0, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* renamed from: z0, reason: from getter */
    public final int getTotalCouponCount() {
        return this.totalCouponCount;
    }

    private final void M0(CouponsListChange change) {
        if (N()) {
            b bVarD0 = D0();
            Intrinsics.g(bVarD0);
            Coupon coupon = change.getCoupon();
            Intrinsics.g(coupon);
            bVarD0.m0(coupon);
        }
    }

    private final void U0(CouponsListChange change, boolean sendNetworkRequest) {
        int i10 = c.$EnumSwitchMapping$0[change.getType().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        M0(change);
                        return;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (sendNetworkRequest) {
                    A a10 = this.couponsCommandManager;
                    Coupon coupon = change.getCoupon();
                    Intrinsics.g(coupon);
                    a10.A(coupon);
                }
                G0(change, !sendNetworkRequest);
                return;
            }
            if (sendNetworkRequest) {
                A a11 = this.couponsCommandManager;
                Coupon coupon2 = change.getCoupon();
                Intrinsics.g(coupon2);
                a11.o0(coupon2);
            }
            L0(change, !sendNetworkRequest);
            return;
        }
        if (sendNetworkRequest) {
            A a12 = this.couponsCommandManager;
            Coupon coupon3 = change.getCoupon();
            Intrinsics.g(coupon3);
            a12.F(coupon3);
        }
        I0(change);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    protected b D0() {
        return (b) super.M();
    }

    @Override // Tr.A.a
    public void G() {
        if (N()) {
            b bVarD0 = D0();
            Intrinsics.g(bVarD0);
            bVarD0.X0();
        }
    }

    @Override // um.AbstractC17446a
    public void P() {
        super.P();
        if (O0()) {
            this.couponChangeManager.h(this.tag);
            this.couponsCommandManager.z();
        }
        Ju.b bVar = this.cartDisposable;
        if (bVar != null) {
            Intrinsics.g(bVar);
            if (!bVar.isDisposed()) {
                Ju.b bVar2 = this.cartDisposable;
                Intrinsics.g(bVar2);
                bVar2.dispose();
            }
        }
    }

    @Override // um.AbstractC17446a
    public void Q() {
        S();
    }

    @Override // um.AbstractC17446a
    public void S() {
        if (T()) {
            this.couponsViewVisibility.N(8);
            this.couponsHeaderVisibility.N(8);
            this.noCouponsTextVisibility.N(8);
            this.searchNoCouponsViewVisibility.N(8);
            if (N()) {
                b bVarD0 = D0();
                Intrinsics.g(bVarD0);
                bVarD0.S0(true, p0());
            }
            j1();
        } else {
            p1();
            Z();
        }
        if (O0() && this.couponChangeManager.e()) {
            this.couponChangeManager.b(this.tag);
        }
        if (this.userManager.b()) {
            io.reactivex.l<Integer> lVarObserveOn = this.cartRepository.Q().subscribeOn(C13889a.b()).observeOn(Iu.a.a());
            final Function1 function1 = new Function1() { // from class: Lm.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return h.k1(this.f19229a, (Integer) obj);
                }
            };
            Lu.g<? super Integer> gVar = new Lu.g() { // from class: Lm.e
                @Override // Lu.g
                public final void accept(Object obj) {
                    h.l1(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: Lm.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return h.m1((Throwable) obj);
                }
            };
            this.cartDisposable = lVarObserveOn.subscribe(gVar, new Lu.g() { // from class: Lm.g
                @Override // Lu.g
                public final void accept(Object obj) {
                    h.o1(function12, obj);
                }
            });
        }
        this.shouldDelayRefresh = false;
    }
}
