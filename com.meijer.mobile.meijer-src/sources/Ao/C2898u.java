package Ao;

import Ao.W;
import Co.ProductFullDetails;
import Ho.ProductSponsorship;
import Pk.Coupon;
import Qo.l;
import Yk.CouponState;
import androidx.recyclerview.widget.RecyclerView;
import fj.Entry;
import fj.EntryChange;
import ii.AbstractC14762i;
import ii.C14756c;
import ii.C14760g;
import ii.TrackingData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kk.EnumC15218a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import wl.CartEntry;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0016\u0010\u0011\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00042\u0016\u0010\u0011\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010!\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b'\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010\u00062\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b(\u0010&J\u0017\u0010)\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b)\u0010&J=\u00101\u001a\u0002002\u000e\u0010+\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`*2\u0006\u0010,\u001a\u00020\u00042\b\u0010-\u001a\u0004\u0018\u00010\u00062\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u0012¢\u0006\u0004\b1\u00102J9\u00104\u001a\u0002002\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u000e\u00103\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`*2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b4\u00105JO\u00109\u001a\u0002002\u0006\u00106\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u000e\u00103\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`*2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r072\u0006\u00108\u001a\u00020\u0004¢\u0006\u0004\b9\u0010:JA\u0010;\u001a\u0002002\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u000e\u00103\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`*2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00108\u001a\u00020\u0004¢\u0006\u0004\b;\u0010<J5\u0010@\u001a\u0002002\u0006\u0010=\u001a\u00020\u00062\u000e\u0010>\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`*2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010?\u001a\u00020\u0013¢\u0006\u0004\b@\u0010AJ7\u0010C\u001a\u0002002\u0006\u0010=\u001a\u00020\u00062\u000e\u0010>\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`*2\b\u0010B\u001a\u0004\u0018\u00010\r2\u0006\u0010?\u001a\u00020\u0013¢\u0006\u0004\bC\u0010AJ\u0015\u0010F\u001a\u0002002\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GJ\u009b\u0001\u0010Q\u001a\u0002002\u0006\u0010H\u001a\u00020\u00042\u0006\u0010J\u001a\u00020I2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0010K\u001a\u00060\u0006j\u0002`*2\u0006\u0010L\u001a\u00020\u00042\b\u0010M\u001a\u0004\u0018\u00010\u00062\u0016\u0010\u0011\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u00108\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\b\u0010O\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010P\u001a\u00020\u00042\b\u0010E\u001a\u0004\u0018\u00010D¢\u0006\u0004\bQ\u0010RJu\u0010T\u001a\u0002002\n\u0010K\u001a\u00060\u0006j\u0002`*2\u0006\u0010L\u001a\u00020\u00042\u0006\u0010J\u001a\u00020I2\u0006\u00108\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010M\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u00102\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010N\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u00042\u000e\u0010S\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\u0004\bT\u0010UJ[\u0010]\u001a\u0002002\b\u0010W\u001a\u0004\u0018\u00010V2\n\u0010K\u001a\u00060\u0006j\u0002`*2\u0006\u0010E\u001a\u00020\u00062\u000e\u0010X\u001a\n\u0012\u0004\u0012\u00020V\u0018\u00010\u00122\b\u0010Y\u001a\u0004\u0018\u00010\u00062\b\u0010Z\u001a\u0004\u0018\u00010\u00062\n\u0010\\\u001a\u00060\u0006j\u0002`[¢\u0006\u0004\b]\u0010^Jç\u0001\u0010l\u001a\u0002002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r072\u0016\u0010\u0011\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010H\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#2\n\u0010K\u001a\u00060\u0006j\u0002`*2\b\u0010_\u001a\u0004\u0018\u00010\u00062\b\u0010`\u001a\u0004\u0018\u00010\u00062\b\u0010a\u001a\u0004\u0018\u00010\u00062\b\u0010b\u001a\u0004\u0018\u00010\u00062\u0006\u0010d\u001a\u00020c2\u0006\u00108\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\b\u0010f\u001a\u0004\u0018\u00010e2\u0006\u0010E\u001a\u00020\u00062\b\u0010g\u001a\u0004\u0018\u00010\u00062\u0006\u0010P\u001a\u00020\u00042\u0006\u0010h\u001a\u00020\u00062\u0006\u0010i\u001a\u00020\u00062\u0006\u0010j\u001a\u00020\u00062\n\b\u0002\u0010k\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\bl\u0010mJ±\u0001\u0010q\u001a\u0002002\b\u0010n\u001a\u0004\u0018\u00010\u00062\n\u0010K\u001a\u00060\u0006j\u0002`*2\u0006\u00108\u001a\u00020\u00042\u0006\u0010o\u001a\u00020#2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r072\u0006\u0010d\u001a\u00020c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00102\u000e\u0010S\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010L\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u00042\b\u0010E\u001a\u0004\u0018\u00010D2\u0006\u0010j\u001a\u00020\u00062\u0006\u0010p\u001a\u00020\u00062\u0006\u0010i\u001a\u00020\u00062\n\b\u0002\u0010k\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\bq\u0010rJs\u0010w\u001a\u0002002\n\u0010K\u001a\u00060\u0006j\u0002`*2\b\u0010_\u001a\u0004\u0018\u00010\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r072\b\u0010E\u001a\u0004\u0018\u00010\u00062\u0006\u0010n\u001a\u00020\u00062\u0006\u0010s\u001a\u00020\u00042\b\u0010f\u001a\u0004\u0018\u00010e2\b\u0010u\u001a\u0004\u0018\u00010t2\u0006\u00108\u001a\u00020\u00042\n\b\u0002\u0010v\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\bw\u0010xJe\u0010z\u001a\u0002002\n\u0010K\u001a\u00060\u0006j\u0002`*2\b\u0010_\u001a\u0004\u0018\u00010\u00062\u0006\u0010y\u001a\u00020\r2\b\u0010E\u001a\u0004\u0018\u00010\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r072\u0006\u0010d\u001a\u00020c2\u0006\u0010n\u001a\u00020\u00062\b\u0010f\u001a\u0004\u0018\u00010e2\u0006\u00108\u001a\u00020\u0004¢\u0006\u0004\bz\u0010{JA\u0010~\u001a\u0002002\u0006\u0010K\u001a\u00020\u00062\u0006\u0010y\u001a\u00020\r2\u0006\u00108\u001a\u00020\u00042\b\u0010|\u001a\u0004\u0018\u00010\u00062\b\u0010}\u001a\u0004\u0018\u00010t2\u0006\u0010n\u001a\u00020\u0006¢\u0006\u0004\b~\u0010\u007fJJ\u0010\u0080\u0001\u001a\u0002002\n\u0010K\u001a\u00060\u0006j\u0002`*2\u0006\u00108\u001a\u00020\u00042\b\u0010y\u001a\u0004\u0018\u00010\r2\b\u0010E\u001a\u0004\u0018\u00010\u00062\b\u0010}\u001a\u0004\u0018\u00010t2\u0006\u0010n\u001a\u00020\u0006¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001Jg\u0010\u0085\u0001\u001a\u0002002\u0007\u0010\u0082\u0001\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010K\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`*2\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00062\u0006\u0010j\u001a\u00020\u00062\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010D2\u0006\u0010=\u001a\u00020\u00062\u0006\u0010n\u001a\u00020\u00062\u0006\u0010p\u001a\u00020\u0006¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001d\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001c\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0087\u00012\u0007\u0010\u008a\u0001\u001a\u00020\u0004¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0013\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u0087\u0001¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u001e\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0087\u00012\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0006¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0092\u0001"}, d2 = {"LAo/u;", "", "<init>", "()V", "", "isOriginalOrder", "", "s", "(Z)Ljava/lang/String;", "isEditMode", "isEditOrder", "Q", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Ljava/lang/String;", "Lfj/j;", "entryChange", "", "LYk/c;", "couponsStateMap", "", "LPk/f;", "K", "(Lfj/j;Ljava/util/Map;)Ljava/util/List;", "productCode", "logError", "L", "(Ljava/lang/String;ZLjava/util/Map;)LYk/c;", "states", "", "H", "(Ljava/lang/String;Ljava/lang/String;)V", "couponState", "", "entryUnitPrice", "V", "(LYk/c;Lfj/j;D)Z", "LQo/l;", "queryValue", "O", "(LQo/l;)Ljava/lang/String;", "N", "J", "P", "Lcom/meijer/mobile/core/model/common/ResourceId;", "shoppingCartCode", "isFinalOrder", "orderNumber", "LAo/W$b;", "listOfProductDetails", "Lii/f;", "W", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;)Lii/f;", "cartDataCode", "x", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lfj/j;)Lii/f;", "isCartRemovalFromAction", "Luk/c;", "isBuyAgain", "z", "(ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Luk/c;Z)Lii/f;", "B", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lfj/j;Z)Lii/f;", "page", "cartCode", "coupon", "D", "(Ljava/lang/String;Ljava/lang/String;Lfj/j;LPk/f;)Lii/f;", "entryChangeWithoutAlcohol", "F", "", "productRank", "h0", "(I)Lii/f;", "requireCartOpenExtra", "Lkk/a;", "homeCarouselType", "cartId", "isSponsoredCriteo", "carouselType", "isAddedFromPlp", "couponAvailable", "isTrackCartRemoval", "R", "(ZLkk/a;Lfj/j;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;ZZDLjava/lang/Boolean;Ljava/lang/String;ZLjava/lang/Integer;)Lii/f;", "coupons", "T", "(Ljava/lang/String;ZLkk/a;ZLfj/j;Ljava/lang/String;LYk/c;DZZLjava/util/List;)Lii/f;", "Lfj/i;", "entry", "shoppingCartEntries", "teacherListSchoolName", "teacherListClassroomName", "Lcom/meijer/mobile/core/models/products/ProductCode;", "itemToSubstituteCode", "r0", "(Lfj/i;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lii/f;", "campaignIdValue", "departmentCarouselAnalytics", "collectionName", "cmpid", "Lpp/e;", "sponsorshipsDataStore", "LAo/W$a;", "complexPromo", "carouselTitleAnalytics", "lowStock", "pageTypeMperks", "itemCount", "recommendationCarouselTitle", "j0", "(Luk/c;Ljava/util/Map;ZLQo/l;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpp/e;ZZZDLAo/W$a;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lii/f;", "pageType", "query", "lowStockKey", "m0", "(Ljava/lang/String;Ljava/lang/String;ZLQo/l;Luk/c;Lpp/e;LYk/c;Ljava/util/List;DZZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lii/f;", "isCarouselSponsoredAdded", "LHo/a;", "sponsorship", "variantInteractedList", "e0", "(Ljava/lang/String;Ljava/lang/String;Luk/c;Ljava/lang/String;Ljava/lang/String;ZLAo/W$a;LHo/a;ZLjava/lang/String;)Lii/f;", "change", "Y", "(Ljava/lang/String;Ljava/lang/String;Lfj/j;Ljava/lang/String;Luk/c;Lpp/e;Ljava/lang/String;LAo/W$a;Z)Lii/f;", "productPosition", "productSponsorship", "a0", "(Ljava/lang/String;Lfj/j;ZLjava/lang/String;LHo/a;Ljava/lang/String;)Lii/f;", "c0", "(Ljava/lang/String;ZLfj/j;Ljava/lang/String;LHo/a;Ljava/lang/String;)Lii/f;", "isCartAddition", "rewardIdDetail", "rank", "p0", "(ZLfj/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lii/f;", "Lii/i;", "v", "(Lfj/j;)Lii/i;", "isNewCart", "w", "(Z)Lii/i;", "u", "()Lii/i;", "location", "t", "(Ljava/lang/String;)Lii/i;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Ao.u, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C2898u {

    /* renamed from: a, reason: collision with root package name */
    public static final C2898u f1904a = new C2898u();

    private final List<Pk.f> K(EntryChange entryChange, Map<String, CouponState> couponsStateMap) {
        Entry entry;
        ProductFullDetails productFullDetailsM;
        List<Long> listO;
        Object next;
        Coupon coupon;
        if (entryChange == null || (entry = entryChange.getEntry()) == null || (productFullDetailsM = entry.m()) == null || (listO = productFullDetailsM.o()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listO.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            Iterator<T> it2 = couponsStateMap.values().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                CouponState couponState = (CouponState) next;
                if (couponState != null && (coupon = couponState.getCoupon()) != null && coupon.getOfferId() == jLongValue) {
                    break;
                }
            }
            CouponState couponState2 = (CouponState) next;
            Coupon coupon2 = couponState2 != null ? couponState2.getCoupon() : null;
            if (coupon2 != null) {
                arrayList.add(coupon2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit l0(java.lang.String r24, boolean r25, uk.c r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, Qo.l r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, Ao.W.ComplexPromo r36, java.util.Map r37, Yk.CouponState r38, boolean r39, boolean r40, boolean r41, boolean r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, pp.e r46, double r47, ii.TrackingData r49) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ao.C2898u.l0(java.lang.String, boolean, uk.c, java.lang.String, java.lang.String, java.lang.String, Qo.l, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, Ao.W$a, java.util.Map, Yk.c, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, pp.e, double, ii.f):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit o0(java.lang.String r29, java.lang.String r30, Qo.l r31, boolean r32, uk.c r33, java.lang.String r34, Yk.CouponState r35, java.util.List r36, boolean r37, boolean r38, boolean r39, java.lang.Integer r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, pp.e r45, double r46, ii.TrackingData r48) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ao.C2898u.o0(java.lang.String, java.lang.String, Qo.l, boolean, uk.c, java.lang.String, Yk.c, java.util.List, boolean, boolean, boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, pp.e, double, ii.f):kotlin.Unit");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ii.TrackingData j0(final uk.c<fj.EntryChange> r28, final java.util.Map<java.lang.String, Yk.CouponState> r29, final boolean r30, final Qo.l r31, final java.lang.String r32, final java.lang.String r33, final java.lang.String r34, final java.lang.String r35, final java.lang.String r36, final pp.e r37, final boolean r38, final boolean r39, final boolean r40, final double r41, final Ao.W.ComplexPromo r43, final java.lang.String r44, final java.lang.String r45, final boolean r46, final java.lang.String r47, final java.lang.String r48, final java.lang.String r49, final java.lang.String r50) {
        /*
            r27 = this;
            r7 = r31
            java.lang.String r0 = "entryChange"
            r3 = r28
            kotlin.jvm.internal.Intrinsics.j(r3, r0)
            java.lang.String r0 = "couponsStateMap"
            r11 = r29
            kotlin.jvm.internal.Intrinsics.j(r11, r0)
            java.lang.String r0 = "queryValue"
            kotlin.jvm.internal.Intrinsics.j(r7, r0)
            java.lang.String r0 = "cartId"
            r4 = r32
            kotlin.jvm.internal.Intrinsics.j(r4, r0)
            java.lang.String r0 = "sponsorshipsDataStore"
            r1 = r37
            kotlin.jvm.internal.Intrinsics.j(r1, r0)
            java.lang.String r0 = "productRank"
            r5 = r44
            kotlin.jvm.internal.Intrinsics.j(r5, r0)
            java.lang.String r0 = "lowStock"
            r2 = r47
            kotlin.jvm.internal.Intrinsics.j(r2, r0)
            java.lang.String r0 = "pageTypeMperks"
            r6 = r48
            kotlin.jvm.internal.Intrinsics.j(r6, r0)
            java.lang.String r0 = "itemCount"
            r14 = r49
            kotlin.jvm.internal.Intrinsics.j(r14, r0)
            java.lang.Object r0 = r3.a()
            fj.j r0 = (fj.EntryChange) r0
            r15 = 0
            if (r0 == 0) goto L5a
            fj.i r0 = r0.getEntry()
            if (r0 == 0) goto L5a
            Co.h r0 = r0.m()
            if (r0 == 0) goto L5a
            java.lang.String r0 = r0.getCode()
            r9 = r0
            goto L5b
        L5a:
            r9 = r15
        L5b:
            r12 = 2
            r13 = 0
            r10 = 0
            r8 = r27
            Yk.c r0 = M(r8, r9, r10, r11, r12, r13)
            if (r50 == 0) goto L70
            int r8 = r50.length()
            if (r8 <= 0) goto L6e
            r15 = r50
        L6e:
            if (r15 != 0) goto L73
        L70:
            r8 = r27
            goto L76
        L73:
            r8 = r27
            goto L7a
        L76:
            java.lang.String r15 = r8.O(r7)
        L7a:
            java.lang.String r9 = "Cart Addition"
            ii.h$a r9 = ii.C14756c.a(r9)
            r1 = r15
            r15 = r0
            Ao.e r0 = new Ao.e
            r8 = r34
            r10 = r35
            r11 = r36
            r23 = r37
            r16 = r38
            r17 = r39
            r18 = r40
            r24 = r41
            r13 = r43
            r19 = r46
            r12 = r50
            r21 = r2
            r20 = r6
            r26 = r9
            r22 = r14
            r14 = r29
            r2 = r30
            r6 = r33
            r9 = r45
            r0.<init>()
            r1 = r0
            r0 = r26
            ii.f r0 = ii.C14760g.a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ao.C2898u.j0(uk.c, java.util.Map, boolean, Qo.l, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, pp.e, boolean, boolean, boolean, double, Ao.W$a, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):ii.f");
    }

    public final AbstractC14762i v(EntryChange entryChange) {
        Entry entry;
        boolean z10 = false;
        if (entryChange != null && (entry = entryChange.getEntry()) != null && entry.getEntryNumber() == 0) {
            z10 = true;
        }
        return w(z10);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ao.u$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EnumC15218a.values().length];
            try {
                iArr[EnumC15218a.f142567a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC15218a.f142568b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[nk.d.values().length];
            try {
                iArr2[nk.d.f152478a.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[nk.d.f152479b.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(String str, String str2, uk.c cVar, boolean z10, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n(str);
        if (str2 == null) {
            str2 = "";
        }
        TrackingData.h("cartID", str2);
        W w10 = W.f1694a;
        TrackingData.c(w10.f((EntryChange) cVar.a()));
        EntryChange entryChange = (EntryChange) cVar.a();
        TrackingData.c(w10.k(entryChange != null ? Double.valueOf(entryChange.getActualQuantityChange()) : null));
        if ((z10 ? Boolean.valueOf(z10) : null) != null) {
            TrackingData.h("buyAgain", "true");
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(String str, String str2, EntryChange entryChange, boolean z10, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n(str);
        TrackingData.h("cartID", str2 == null ? "" : str2);
        TrackingData.e(W.i(W.Details.Companion.e(W.Details.INSTANCE, entryChange, str, null, null, null, null, null, null, null, null, null, 2044, null)));
        if (z10) {
            TrackingData.h("buyAgain", "true");
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(String str, String str2, EntryChange entryChange, Pk.f fVar, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.v("coupons");
        TrackingData.n(str);
        TrackingData.h("cartID", str2);
        TrackingData.c(f1904a.v(entryChange));
        TrackingData.e(W.i(W.Details.Companion.e(W.Details.INSTANCE, entryChange, str, null, null, null, null, null, null, null, null, null, 2044, null)));
        TrackingData.c(Rk.b.f33418a.e(fVar));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(String str, String str2, EntryChange entryChange, Pk.f fVar, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.v("coupons");
        TrackingData.n(str);
        TrackingData.h("cartID", str2);
        TrackingData.e(W.i(W.Details.Companion.e(W.Details.INSTANCE, entryChange, str, null, null, null, null, null, null, null, null, null, 2044, null)));
        TrackingData.c(Rk.b.f33418a.e(fVar));
        return Unit.f143329a;
    }

    private final void H(final String productCode, final String states) {
        C14760g.a(C14756c.a("bug:1517289"), new Function1() { // from class: Ao.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2898u.I(productCode, states, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(String str, String str2, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.h("expectedUpc", str);
        TrackingData.h("availableKeys", str2);
        return Unit.f143329a;
    }

    private final String J(Qo.l queryValue) {
        if (queryValue instanceof l.Search) {
            return "Product Search Page";
        }
        if ((queryValue instanceof l.Department) || (queryValue instanceof l.BrowseCollection)) {
            return "collection page";
        }
        return null;
    }

    static /* synthetic */ CouponState M(C2898u c2898u, String str, boolean z10, Map map, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return c2898u.L(str, z10, map);
    }

    private final String N(Qo.l queryValue) {
        return ((queryValue instanceof l.Search) || (queryValue instanceof l.Department)) ? "product list page" : ((queryValue instanceof l.Personalized) || (queryValue instanceof l.BrowseCollection)) ? "home" : "product list page";
    }

    private final String O(Qo.l queryValue) {
        if (queryValue instanceof l.Search) {
            return "product search page";
        }
        if (queryValue instanceof l.Department) {
            return "category page";
        }
        if (!(queryValue instanceof l.Personalized)) {
            return queryValue instanceof l.Recommendations ? "PLP" : queryValue instanceof l.Favorites ? "favorite products page" : queryValue instanceof l.BrowseCollection ? "collection page" : queryValue instanceof l.Reward ? "mPerks:Reward Details Page:PLP" : "product search page";
        }
        int i10 = a.$EnumSwitchMapping$1[((l.Personalized) queryValue).getCategory().ordinal()];
        if (i10 == 1) {
            return "Favorites on Sale";
        }
        if (i10 == 2) {
            return "Buy Again";
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String P(Qo.l queryValue) {
        return ((queryValue instanceof l.Search) || (queryValue instanceof l.Department)) ? "product list page" : ((queryValue instanceof l.Personalized) || (queryValue instanceof l.BrowseCollection)) ? "home" : queryValue instanceof l.Reward ? "mPerks 4.0" : "product list page";
    }

    private final String Q(Boolean isEditMode, Boolean isEditOrder) {
        Boolean bool = Boolean.TRUE;
        return Intrinsics.e(isEditMode, bool) ? "edit order page" : Intrinsics.e(isEditOrder, bool) ? "add from previous order" : "cart page";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(boolean z10, EntryChange entryChange, String str, Integer num, boolean z11, EnumC15218a enumC15218a, String str2, Map map, CouponState couponState, boolean z12, boolean z13, boolean z14, Boolean bool, double d10, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n("home");
        TrackingData.v("home");
        if (z10) {
            TrackingData.c(f1904a.v(entryChange));
        } else {
            TrackingData.c(f1904a.u());
        }
        TrackingData.h("cartID", str);
        TrackingData.h("productRank", String.valueOf(num));
        if (z11) {
            int i10 = a.$EnumSwitchMapping$0[enumC15218a.ordinal()];
            String str3 = i10 != 1 ? i10 != 2 ? null : "favorites on sale" : "buy again";
            if (str3 != null) {
                TrackingData.h("componentName", str3);
            }
        }
        W.Details.Companion companion = W.Details.INSTANCE;
        int i11 = a.$EnumSwitchMapping$0[enumC15218a.ordinal()];
        String str4 = i11 != 1 ? i11 != 2 ? str2 : "Favorites on Sale" : "Buy Again";
        C2898u c2898u = f1904a;
        TrackingData.e(W.i(W.Details.Companion.e(companion, entryChange, str4, null, c2898u.K(entryChange, map), couponState != null ? Boolean.valueOf(c2898u.V(couponState, entryChange, d10)) : null, null, Boolean.valueOf(z12), Boolean.valueOf(z11), Boolean.valueOf(z13), Boolean.valueOf(z14), null, 1060, null)));
        Rk.b bVar = Rk.b.f33418a;
        Boolean bool2 = Boolean.TRUE;
        TrackingData.c(bVar.d(Intrinsics.e(bool, bool2)));
        if (Intrinsics.e(bool, bool2) && couponState != null) {
            TrackingData.c(bVar.c(c2898u.V(couponState, entryChange, d10)));
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit U(java.lang.String r21, boolean r22, kk.EnumC15218a r23, boolean r24, fj.EntryChange r25, java.lang.String r26, java.util.List r27, Yk.CouponState r28, boolean r29, boolean r30, double r31, ii.TrackingData r33) {
        /*
            r0 = r28
            r1 = r33
            java.lang.String r2 = "$this$TrackingData"
            kotlin.jvm.internal.Intrinsics.j(r1, r2)
            java.lang.String r2 = "home"
            r1.n(r2)
            r1.v(r2)
            java.lang.String r2 = "cartID"
            r3 = r21
            r1.h(r2, r3)
            r2 = 2
            r3 = 1
            r4 = 0
            if (r22 == 0) goto L37
            int[] r5 = Ao.C2898u.a.$EnumSwitchMapping$0
            int r6 = r23.ordinal()
            r5 = r5[r6]
            if (r5 == r3) goto L2e
            if (r5 == r2) goto L2b
            r5 = r4
            goto L30
        L2b:
            java.lang.String r5 = "favorites on sale"
            goto L30
        L2e:
            java.lang.String r5 = "buy again"
        L30:
            if (r5 == 0) goto L37
            java.lang.String r6 = "componentName"
            r1.h(r6, r5)
        L37:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r24)
            if (r24 == 0) goto L3e
            goto L3f
        L3e:
            r5 = r4
        L3f:
            if (r5 == 0) goto L48
            java.lang.String r5 = "buyAgain"
            java.lang.String r6 = "true"
            r1.h(r5, r6)
        L48:
            Ao.W$b$a r7 = Ao.W.Details.INSTANCE
            int[] r5 = Ao.C2898u.a.$EnumSwitchMapping$0
            int r6 = r23.ordinal()
            r5 = r5[r6]
            if (r5 == r3) goto L5d
            if (r5 == r2) goto L59
            r9 = r26
            goto L60
        L59:
            java.lang.String r2 = "Favorites on Sale"
        L5b:
            r9 = r2
            goto L60
        L5d:
            java.lang.String r2 = "Buy Again"
            goto L5b
        L60:
            if (r0 == 0) goto L72
            Ao.u r2 = Ao.C2898u.f1904a
            r8 = r25
            r3 = r31
            boolean r0 = r2.V(r0, r8, r3)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L70:
            r12 = r4
            goto L75
        L72:
            r8 = r25
            goto L70
        L75:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r24)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r22)
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r29)
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r30)
            r19 = 1060(0x424, float:1.485E-42)
            r20 = 0
            r10 = 0
            r13 = 0
            r18 = 0
            r11 = r27
            Ao.W$b r0 = Ao.W.Details.Companion.e(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            ii.i[] r0 = Ao.W.i(r0)
            r1.e(r0)
            kotlin.Unit r0 = kotlin.Unit.f143329a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ao.C2898u.U(java.lang.String, boolean, kk.a, boolean, fj.j, java.lang.String, java.util.List, Yk.c, boolean, boolean, double, ii.f):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(String str, boolean z10, String str2, List list, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.v("order details");
        TrackingData.n("add from previous order");
        TrackingData.h("cartID", str);
        C2898u c2898u = f1904a;
        TrackingData.c(c2898u.t(c2898u.s(!z10)));
        TrackingData.c(c2898u.w(true));
        TrackingData.h("purchaseID", str2);
        TrackingData.e(W.j(list));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(String str, String str2, String str3, uk.c cVar, String str4, EntryChange entryChange, W.ComplexPromo complexPromo, boolean z10, pp.e eVar, TrackingData TrackingData) {
        Entry entry;
        ProductFullDetails productFullDetailsM;
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n("product details page");
        TrackingData.v("products view");
        TrackingData.h("cartID", str);
        TrackingData.h("campaignIdAttribution", str2);
        if (str3 != null) {
            TrackingData.h("productRank", str3);
        }
        EntryChange entryChange2 = (EntryChange) cVar.a();
        ProductSponsorship productSponsorshipA = (entryChange2 == null || (entry = entryChange2.getEntry()) == null || (productFullDetailsM = entry.m()) == null) ? null : eVar.a(productFullDetailsM.getCode());
        TrackingData.c(f1904a.t(str4));
        TrackingData.e(W.i(W.Details.Companion.e(W.Details.INSTANCE, entryChange, str4, complexPromo, null, null, productSponsorshipA, Boolean.valueOf(z10), null, null, null, null, 1944, null)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(String str, boolean z10, String str2, String str3, EntryChange entryChange, ProductSponsorship productSponsorship, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n("product details page");
        TrackingData.v("products view");
        TrackingData.h("cartID", str);
        Boolean boolValueOf = Boolean.valueOf(z10);
        if (!z10) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            TrackingData.h("buyAgain", "true");
        }
        if (str2 != null) {
            TrackingData.h("productRank", str2);
        }
        TrackingData.c(f1904a.t(str3));
        TrackingData.e(W.i(W.Details.Companion.e(W.Details.INSTANCE, entryChange, str3, null, null, null, productSponsorship, null, null, null, null, null, 2012, null)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d0(String str, boolean z10, String str2, String str3, EntryChange entryChange, ProductSponsorship productSponsorship, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n("product details page");
        TrackingData.v("products view");
        TrackingData.h("cartID", str);
        Boolean boolValueOf = Boolean.valueOf(z10);
        if (!z10) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            TrackingData.h("buyAgain", "true");
        }
        if (str2 != null) {
            TrackingData.h("productRank", str2);
        }
        if (Intrinsics.e(str3, "edaa - Frequently Bought Together")) {
            TrackingData.h("componentName", "Frequently Bought Together");
        }
        TrackingData.e(W.i(W.Details.Companion.e(W.Details.INSTANCE, entryChange, str3, null, null, null, productSponsorship, Boolean.valueOf(z10), null, null, null, null, 1948, null)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g0(String str, String str2, uk.c cVar, String str3, boolean z10, String str4, W.ComplexPromo complexPromo, ProductSponsorship productSponsorship, boolean z11, String str5, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n("product details page");
        TrackingData.v("products view");
        TrackingData.h("cartID", str);
        TrackingData.h("campaignIdAttribution", str2);
        EntryChange entryChange = (EntryChange) cVar.a();
        if (entryChange != null) {
            TrackingData.c(f1904a.v(entryChange));
        }
        TrackingData.h("productRank", str3);
        if (z10) {
            TrackingData.h("&&events", "event201");
            TrackingData.h("componentName", "Frequently Bought Together");
        }
        TrackingData.c(f1904a.t(str4));
        W.Details detailsE = W.Details.Companion.e(W.Details.INSTANCE, (EntryChange) cVar.a(), str4, complexPromo, null, null, productSponsorship, Boolean.valueOf(z11), null, null, null, str5, 920, null);
        TrackingData.e(W.i(detailsE.h(((-65626) & 1) != 0 ? detailsE.upc : null, ((-65626) & 2) != 0 ? detailsE.productSubstitutedUpc : null, ((-65626) & 4) != 0 ? detailsE.backupProductUpc : null, ((-65626) & 8) != 0 ? detailsE.quantity : null, ((-65626) & 16) != 0 ? detailsE.price : null, ((-65626) & 32) != 0 ? detailsE.sumTotal : null, ((-65626) & 64) != 0 ? detailsE.department : null, ((-65626) & 128) != 0 ? detailsE.isAlcohol : null, ((-65626) & 256) != 0 ? detailsE.isSuccess : null, ((-65626) & 512) != 0 ? detailsE.isBuyAgain : null, ((-65626) & 1024) != 0 ? detailsE.isOutOfStock : null, ((-65626) & RecyclerView.m.FLAG_MOVED) != 0 ? detailsE.isBackup : null, ((-65626) & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? detailsE.itemSelectedFromRecommendation : null, ((-65626) & 8192) != 0 ? detailsE.isLowStock : null, ((-65626) & 16384) != 0 ? detailsE.doNotSubstitute : null, ((-65626) & 32768) != 0 ? detailsE.providedByRecommendations : null, ((-65626) & 65536) != 0 ? detailsE.pageType : null, ((-65626) & 131072) != 0 ? detailsE.isOutOfStockItemRemoved : null, ((-65626) & 262144) != 0 ? detailsE.discountDetails : null, ((-65626) & 524288) != 0 ? detailsE.isSubstitution : null, ((-65626) & 1048576) != 0 ? detailsE.isSubstitutionComplete : null, ((-65626) & 2097152) != 0 ? detailsE.isSubstitutionFindSimilar : null, ((-65626) & 4194304) != 0 ? detailsE.addingFindSimilarSubToCart : null, ((-65626) & 8388608) != 0 ? detailsE.isBopasPlacedOrder : null, ((-65626) & 16777216) != 0 ? detailsE.isBopasEligibleCart : null, ((-65626) & 33554432) != 0 ? detailsE.isSponsoredCriteo : null, ((-65626) & 67108864) != 0 ? detailsE.isAddedFromPlp : null, ((-65626) & 134217728) != 0 ? detailsE.isTrackCartRemoval : null, ((-65626) & 268435456) != 0 ? detailsE.coupons : null, ((-65626) & 536870912) != 0 ? detailsE.isCouponApplied : null, ((-65626) & 1073741824) != 0 ? detailsE.complexPromo : null, ((-65626) & Integer.MIN_VALUE) != 0 ? detailsE.isLowStockItemAdded : null, (16383 & 1) != 0 ? detailsE.isLowStockItemRemoved : null, (16383 & 2) != 0 ? detailsE.sponsorship : null, (16383 & 4) != 0 ? detailsE.isCarouselSponsoredAdded : Boolean.valueOf(z10), (16383 & 8) != 0 ? detailsE.isCarouselSponsored : null, (16383 & 16) != 0 ? detailsE.isPreOrderEBTOrder : null, (16383 & 32) != 0 ? detailsE.isPostOrderEBTOrder : null, (16383 & 64) != 0 ? detailsE.orderEbtEligibleTotal : null, (16383 & 128) != 0 ? detailsE.ebtCapturedAmount : null, (16383 & 256) != 0 ? detailsE.isEZCDOrder : null, (16383 & 512) != 0 ? detailsE.qtyRequestedAvailableItemTL : null, (16383 & 1024) != 0 ? detailsE.returnedUnavailableItems : null, (16383 & RecyclerView.m.FLAG_MOVED) != 0 ? detailsE.qtyRequestedOOSItemTL : null, (16383 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? detailsE.qtyAddedFromAddAllButtonTL : null, (16383 & 8192) != 0 ? detailsE.variantsInteracted : null)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i0(int i10, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.h("productRank", String.valueOf(i10));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q0(String str, String str2, String str3, boolean z10, String str4, String str5, String str6, EntryChange entryChange, Integer num, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.v("mPerks 4.0");
        TrackingData.n(str);
        TrackingData.o(str2);
        TrackingData.h("cartID", str3);
        if (z10) {
            TrackingData.h("rewardID", str4);
        }
        TrackingData.h("Cart Items Count", str5);
        TrackingData.h(str6, entryChange.getStatusCode() == EntryChange.c.f131922d ? "true" : "false");
        TrackingData.h("productRank", String.valueOf(num));
        TrackingData.c(f1904a.v(entryChange));
        TrackingData.e(W.i(W.Details.Companion.e(W.Details.INSTANCE, entryChange, "mPerks:Reward Details Page:Carousel", null, null, null, null, null, null, null, null, null, 2044, null)));
        return Unit.f143329a;
    }

    private final String s(boolean isOriginalOrder) {
        String str = isOriginalOrder ? "Meijer:Original Order Details Page" : null;
        return str == null ? "Meijer:Final Order Details Page" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s0(Entry entry, String str, String str2, List list, String str3, String str4, String str5, TrackingData TrackingData) {
        nk.b totalPrice;
        Intrinsics.j(TrackingData, "$this$TrackingData");
        Double dValueOf = null;
        TrackingData.h("productID", entry != null ? entry.g2() : null);
        TrackingData.h("cartID", str);
        TrackingData.h("productRank", str2);
        List list2 = list;
        TrackingData.c(f1904a.w(list2 == null || list2.isEmpty()));
        TrackingData.h("Cart Items Count", String.valueOf(list != null ? Integer.valueOf(list.size()) : null));
        if (str3 != null) {
            TrackingData.h("schoolSelected", str3);
        }
        if (str4 != null) {
            TrackingData.h("classSelected", str4);
        }
        String strG2 = entry != null ? entry.g2() : null;
        Double dValueOf2 = entry != null ? Double.valueOf(entry.getQuantity()) : null;
        if (entry != null && (totalPrice = entry.getTotalPrice()) != null) {
            dValueOf = Double.valueOf(totalPrice.getValue());
        }
        TrackingData.e(W.i(new W.Details(strG2, str5, null, dValueOf2, dValueOf, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.TRUE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4194332, 16383, null)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(String str, String str2, EntryChange entryChange, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n(str);
        TrackingData.h("cartID", str2 == null ? "" : str2);
        TrackingData.e(W.i(W.Details.Companion.e(W.Details.INSTANCE, entryChange, str, null, null, null, null, null, null, null, null, null, 2044, null)));
        return Unit.f143329a;
    }

    public final TrackingData B(Boolean isEditMode, Boolean isEditOrder, final String cartDataCode, final EntryChange entryChange, final boolean isBuyAgain) {
        Intrinsics.j(entryChange, "entryChange");
        final String strQ = Q(isEditMode, isEditOrder);
        return C14760g.a(C14756c.a("Cart Removal"), new Function1() { // from class: Ao.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2898u.C(strQ, cartDataCode, entryChange, isBuyAgain, (TrackingData) obj);
            }
        });
    }

    public final TrackingData D(final String page, final String cartCode, final EntryChange entryChange, final Pk.f coupon) {
        Intrinsics.j(page, "page");
        Intrinsics.j(entryChange, "entryChange");
        Intrinsics.j(coupon, "coupon");
        return C14760g.a(C14756c.a("Cart Addition"), new Function1() { // from class: Ao.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2898u.E(page, cartCode, entryChange, coupon, (TrackingData) obj);
            }
        });
    }

    public final TrackingData F(final String page, final String cartCode, final EntryChange entryChangeWithoutAlcohol, final Pk.f coupon) {
        Intrinsics.j(page, "page");
        Intrinsics.j(coupon, "coupon");
        return C14760g.a(C14756c.a("Cart Removal"), new Function1() { // from class: Ao.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2898u.G(page, cartCode, entryChangeWithoutAlcohol, coupon, (TrackingData) obj);
            }
        });
    }

    public final TrackingData R(final boolean requireCartOpenExtra, final EnumC15218a homeCarouselType, final EntryChange entryChange, final String cartId, final boolean isSponsoredCriteo, final String carouselType, final Map<String, CouponState> couponsStateMap, final boolean isBuyAgain, final boolean isAddedFromPlp, final double entryUnitPrice, final Boolean couponAvailable, String productCode, final boolean isTrackCartRemoval, final Integer productRank) {
        Intrinsics.j(homeCarouselType, "homeCarouselType");
        Intrinsics.j(cartId, "cartId");
        Intrinsics.j(couponsStateMap, "couponsStateMap");
        final CouponState couponStateM = M(this, productCode, false, couponsStateMap, 2, null);
        return C14760g.a(C14756c.a("Cart Addition"), new Function1() { // from class: Ao.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2898u.S(requireCartOpenExtra, entryChange, cartId, productRank, isSponsoredCriteo, homeCarouselType, carouselType, couponsStateMap, couponStateM, isBuyAgain, isAddedFromPlp, isTrackCartRemoval, couponAvailable, entryUnitPrice, (TrackingData) obj);
            }
        });
    }

    public final TrackingData T(final String cartId, final boolean isSponsoredCriteo, final EnumC15218a homeCarouselType, final boolean isBuyAgain, final EntryChange entryChange, final String carouselType, final CouponState couponState, final double entryUnitPrice, final boolean isAddedFromPlp, final boolean isTrackCartRemoval, final List<? extends Pk.f> coupons) {
        Intrinsics.j(cartId, "cartId");
        Intrinsics.j(homeCarouselType, "homeCarouselType");
        Intrinsics.j(carouselType, "carouselType");
        return C14760g.a(C14756c.a("Cart Removal"), new Function1() { // from class: Ao.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2898u.U(cartId, isSponsoredCriteo, homeCarouselType, isBuyAgain, entryChange, carouselType, coupons, couponState, isAddedFromPlp, isTrackCartRemoval, entryUnitPrice, (TrackingData) obj);
            }
        });
    }

    public final TrackingData W(final String shoppingCartCode, final boolean isFinalOrder, final String orderNumber, final List<W.Details> listOfProductDetails) {
        Intrinsics.j(listOfProductDetails, "listOfProductDetails");
        return C14760g.a(C14756c.a("Cart Addition"), new Function1() { // from class: Ao.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2898u.X(shoppingCartCode, isFinalOrder, orderNumber, listOfProductDetails, (TrackingData) obj);
            }
        });
    }

    public final TrackingData Y(final String cartId, final String campaignIdValue, final EntryChange change, final String productRank, final uk.c<EntryChange> entryChange, final pp.e sponsorshipsDataStore, final String pageType, final W.ComplexPromo complexPromo, final boolean isBuyAgain) {
        Intrinsics.j(cartId, "cartId");
        Intrinsics.j(change, "change");
        Intrinsics.j(entryChange, "entryChange");
        Intrinsics.j(sponsorshipsDataStore, "sponsorshipsDataStore");
        Intrinsics.j(pageType, "pageType");
        return C14760g.a(C14756c.a("Cart Addition"), new Function1() { // from class: Ao.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2898u.Z(cartId, campaignIdValue, productRank, entryChange, pageType, change, complexPromo, isBuyAgain, sponsorshipsDataStore, (TrackingData) obj);
            }
        });
    }

    public final TrackingData a0(final String cartId, final EntryChange change, final boolean isBuyAgain, final String productPosition, final ProductSponsorship productSponsorship, final String pageType) {
        Intrinsics.j(cartId, "cartId");
        Intrinsics.j(change, "change");
        Intrinsics.j(pageType, "pageType");
        return C14760g.a(C14756c.a("Cart Removal"), new Function1() { // from class: Ao.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2898u.b0(cartId, isBuyAgain, productPosition, pageType, change, productSponsorship, (TrackingData) obj);
            }
        });
    }

    public final TrackingData c0(final String cartId, final boolean isBuyAgain, final EntryChange change, final String productRank, final ProductSponsorship productSponsorship, final String pageType) {
        Intrinsics.j(cartId, "cartId");
        Intrinsics.j(pageType, "pageType");
        return C14760g.a(C14756c.a("Cart Removal"), new Function1() { // from class: Ao.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2898u.d0(cartId, isBuyAgain, productRank, pageType, change, productSponsorship, (TrackingData) obj);
            }
        });
    }

    public final TrackingData e0(final String cartId, final String campaignIdValue, final uk.c<EntryChange> entryChange, final String productRank, final String pageType, final boolean isCarouselSponsoredAdded, final W.ComplexPromo complexPromo, final ProductSponsorship sponsorship, final boolean isBuyAgain, final String variantInteractedList) {
        Intrinsics.j(cartId, "cartId");
        Intrinsics.j(entryChange, "entryChange");
        Intrinsics.j(pageType, "pageType");
        return C14760g.a(C14756c.a("Cart Addition"), new Function1() { // from class: Ao.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2898u.g0(cartId, campaignIdValue, entryChange, productRank, isCarouselSponsoredAdded, pageType, complexPromo, sponsorship, isBuyAgain, variantInteractedList, (TrackingData) obj);
            }
        });
    }

    public final TrackingData h0(final int productRank) {
        return C14760g.a(C14756c.a("Cart Addition"), new Function1() { // from class: Ao.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2898u.i0(productRank, (TrackingData) obj);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ii.TrackingData m0(final java.lang.String r22, final java.lang.String r23, final boolean r24, final Qo.l r25, final uk.c<fj.EntryChange> r26, final pp.e r27, final Yk.CouponState r28, final java.util.List<? extends Pk.f> r29, final double r30, final boolean r32, final boolean r33, final boolean r34, final java.lang.Integer r35, final java.lang.String r36, final java.lang.String r37, final java.lang.String r38, final java.lang.String r39) {
        /*
            r21 = this;
            java.lang.String r0 = "cartId"
            r3 = r23
            kotlin.jvm.internal.Intrinsics.j(r3, r0)
            java.lang.String r0 = "query"
            r4 = r25
            kotlin.jvm.internal.Intrinsics.j(r4, r0)
            java.lang.String r0 = "entryChange"
            r6 = r26
            kotlin.jvm.internal.Intrinsics.j(r6, r0)
            java.lang.String r0 = "sponsorshipsDataStore"
            r1 = r27
            kotlin.jvm.internal.Intrinsics.j(r1, r0)
            java.lang.String r0 = "itemCount"
            r2 = r36
            kotlin.jvm.internal.Intrinsics.j(r2, r0)
            java.lang.String r0 = "lowStockKey"
            r15 = r37
            kotlin.jvm.internal.Intrinsics.j(r15, r0)
            java.lang.String r0 = "pageTypeMperks"
            r14 = r38
            kotlin.jvm.internal.Intrinsics.j(r14, r0)
            if (r39 == 0) goto L3f
            int r0 = r39.length()
            if (r0 <= 0) goto L3c
            r0 = r39
            goto L3d
        L3c:
            r0 = 0
        L3d:
            if (r0 != 0) goto L41
        L3f:
            r0 = r22
        L41:
            java.lang.String r5 = "Cart Removal"
            ii.h$a r5 = ii.C14756c.a(r5)
            Ao.d r1 = new Ao.d
            r7 = r22
            r18 = r27
            r8 = r28
            r9 = r29
            r19 = r30
            r10 = r32
            r11 = r33
            r12 = r34
            r13 = r35
            r17 = r39
            r16 = r2
            r2 = r0
            r0 = r5
            r5 = r24
            r1.<init>()
            ii.f r0 = ii.C14760g.a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ao.C2898u.m0(java.lang.String, java.lang.String, boolean, Qo.l, uk.c, pp.e, Yk.c, java.util.List, double, boolean, boolean, boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String):ii.f");
    }

    public final TrackingData p0(final boolean isCartAddition, final EntryChange entryChange, final String cartId, final String rewardIdDetail, final String itemCount, final Integer rank, final String page, final String pageType, final String lowStockKey) {
        Intrinsics.j(entryChange, "entryChange");
        Intrinsics.j(itemCount, "itemCount");
        Intrinsics.j(page, "page");
        Intrinsics.j(pageType, "pageType");
        Intrinsics.j(lowStockKey, "lowStockKey");
        return C14760g.a(C14756c.a(isCartAddition ? "Cart Addition" : "Cart Removal"), new Function1() { // from class: Ao.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2898u.q0(page, pageType, cartId, isCartAddition, rewardIdDetail, itemCount, lowStockKey, entryChange, rank, (TrackingData) obj);
            }
        });
    }

    public final TrackingData r0(final Entry entry, final String cartId, final String productRank, final List<Entry> shoppingCartEntries, final String teacherListSchoolName, final String teacherListClassroomName, final String itemToSubstituteCode) {
        Intrinsics.j(cartId, "cartId");
        Intrinsics.j(productRank, "productRank");
        Intrinsics.j(itemToSubstituteCode, "itemToSubstituteCode");
        return C14760g.a(C14756c.a("Cart Addition"), new Function1() { // from class: Ao.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2898u.s0(entry, cartId, productRank, shoppingCartEntries, teacherListSchoolName, teacherListClassroomName, itemToSubstituteCode, (TrackingData) obj);
            }
        });
    }

    public final AbstractC14762i t(String location) {
        if (location != null) {
            return C14756c.b("addToCartLocation", location);
        }
        return null;
    }

    public final AbstractC14762i u() {
        return C14756c.b("cartOpen", "0");
    }

    public final AbstractC14762i w(boolean isNewCart) {
        return C14756c.b("cartOpen", isNewCart ? "1" : "0");
    }

    public final TrackingData x(Boolean isEditMode, Boolean isEditOrder, final String cartDataCode, final EntryChange entryChange) {
        Intrinsics.j(entryChange, "entryChange");
        final String strQ = Q(isEditMode, isEditOrder);
        return C14760g.a(C14756c.a("Cart Addition"), new Function1() { // from class: Ao.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2898u.y(strQ, cartDataCode, entryChange, (TrackingData) obj);
            }
        });
    }

    public final TrackingData z(boolean isCartRemovalFromAction, Boolean isEditMode, Boolean isEditOrder, final String cartDataCode, final uk.c<EntryChange> entryChange, final boolean isBuyAgain) {
        Intrinsics.j(entryChange, "entryChange");
        final String strQ = Q(isEditMode, isEditOrder);
        return C14760g.a(isCartRemovalFromAction ? C14756c.a("Cart Removal From Action") : C14756c.a("Cart Removal"), new Function1() { // from class: Ao.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2898u.A(strQ, cartDataCode, entryChange, isBuyAgain, (TrackingData) obj);
            }
        });
    }

    private C2898u() {
    }

    private final CouponState L(String productCode, boolean logError, Map<String, CouponState> couponsStateMap) {
        try {
            return (CouponState) MapsKt.l(couponsStateMap, productCode);
        } catch (NoSuchElementException e10) {
            qw.a.INSTANCE.z("Bug #1517298").u(e10, "Failed to find " + productCode + " in couponStatesMap with keys " + couponsStateMap.keySet(), new Object[0]);
            if (logError) {
                f1904a.H(productCode, CollectionsKt.B0(couponsStateMap.keySet(), ",", null, null, 0, null, null, 62, null));
                return null;
            }
            return null;
        }
    }

    private final boolean V(CouponState couponState, EntryChange entryChange, double entryUnitPrice) {
        Coupon coupon = couponState.getCoupon();
        Coupon.c earnCondition = coupon.getEarnCondition();
        if (!Intrinsics.e(earnCondition, Coupon.c.b.f26149b)) {
            double quantity = 0.0d;
            Double dValueOf = null;
            if (earnCondition instanceof Coupon.c.Spend) {
                if (entryChange != null) {
                    dValueOf = Double.valueOf(entryChange.getExpectedQuantityChange());
                }
                Intrinsics.g(dValueOf);
                double dDoubleValue = dValueOf.doubleValue() * entryUnitPrice;
                Iterator<T> it = couponState.b().iterator();
                while (it.hasNext()) {
                    quantity += ((CartEntry) it.next()).getTotalPrice();
                }
                if (dDoubleValue + quantity < coupon.getEarnCondition().getGoal()) {
                    return false;
                }
            } else if (earnCondition instanceof Coupon.c.Buy) {
                if (entryChange != null) {
                    dValueOf = Double.valueOf(entryChange.getExpectedQuantityChange());
                }
                Intrinsics.g(dValueOf);
                double dDoubleValue2 = dValueOf.doubleValue();
                Iterator<T> it2 = couponState.b().iterator();
                while (it2.hasNext()) {
                    quantity += ((CartEntry) it2.next()).getQuantity();
                }
                if (dDoubleValue2 + quantity < coupon.getEarnCondition().getGoal()) {
                    return false;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (coupon.x()) {
            return true;
        }
        return false;
    }
}
