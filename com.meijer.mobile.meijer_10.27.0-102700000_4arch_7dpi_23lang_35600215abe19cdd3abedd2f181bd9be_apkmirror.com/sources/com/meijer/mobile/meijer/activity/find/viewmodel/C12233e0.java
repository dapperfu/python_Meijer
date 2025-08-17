package com.meijer.mobile.meijer.activity.find.viewmodel;

import Ao.C2930u;
import Ao.W;
import Co.ProductFullDetails;
import Co.ProductVariant;
import Co.ProductVariantGroup;
import Eo.NutritionLabel;
import Fq.FavoriteListItem;
import Fq.ShoppingListItem;
import Gp.ProductInfoForReviewSubmit;
import Gp.ProductInformation;
import Ho.ProductSponsorship;
import Kp.ProductReviewFullDetails;
import M0.SnapshotStateList;
import Ok.Coupon;
import Pk.a;
import Wk.ProductComplexPromo;
import Xk.CouponState;
import Xr.CouponListItemDecorator;
import androidx.compose.runtime.InterfaceC5726j0;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.view.InterfaceC6015f;
import androidx.view.InterfaceC6030s;
import bn.ProductVariantDecorator;
import bn.ProductVariantGroupDecorator;
import cl.C6412d;
import com.fullstory.FS;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse;
import com.meijer.mobile.coupons.domain.models.CouponException;
import com.meijer.mobile.meijer.C12561q;
import com.meijer.mobile.meijer.activity.find.productdetail.AbstractC12120f;
import com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailFeatureFlags;
import com.meijer.mobile.meijer.activity.find.productdetail.SuggestedProductCarouselDecorator;
import com.meijer.mobile.meijer.activity.find.productdetail.a2;
import com.meijer.mobile.meijer.activity.find.productdetail.m2;
import com.meijer.mobile.meijer.activity.find.productdetail.n2;
import com.meijer.mobile.meijer.activity.find.viewmodel.AbstractC12200a;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0;
import dl.CouponsResponse;
import ej.Entry;
import ej.EntryChange;
import ej.ShoppingCart;
import ej.n;
import fi.C13902c;
import fi.EnumC13905f;
import fi.GoogleAdAnalytics;
import fi.GoogleAdData;
import gi.InterfaceC14261a;
import hi.C14476c;
import hi.TrackingData;
import iv.C14764a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kk.AbstractC15172a;
import kk.AbstractC15173b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import pp.SponsoredProduct;
import qp.C16594b;
import qv.AbstractC16618K;
import qv.C16648k;
import qv.InterfaceC16622O;
import qv.InterfaceC16654n;
import sp.C16992a;
import sp.ProductState;
import tk.AbstractC17116a;
import tk.c;
import tr.C17135b;
import tv.C17154h;
import tv.InterfaceC17140B;
import ur.AbstractC17302a;
import uw.a;
import vl.CartEntry;
import vl.ProductEligibility;
import vr.AbstractC17604a;
import vs.ProductNutritionLabelDecorator;
import vs.ProductPriceDecorator;
import wr.InterfaceC17847a;
import yl.AbstractC18227f;
import zs.C18570a;

@Metadata(d1 = {"\u0000Ò\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0001\u0018\u0000 þ\u00022\u00020\u00012\u00020\u0002:\u000e®\u0002¬\u0002ª\u0002°\u0002¤\u0002¦\u0002¨\u0002B£\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\b\b\u0001\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00103\u001a\u00020-2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u000200H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020-2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J!\u00109\u001a\u00020-2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00102\u001a\u000200H\u0002¢\u0006\u0004\b9\u00104J'\u0010<\u001a\u00020-2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020-2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020-2\u0006\u0010B\u001a\u000205H\u0002¢\u0006\u0004\bC\u00108J\u000f\u0010D\u001a\u00020-H\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020-2\u0006\u00106\u001a\u00020FH\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020-2\u0006\u0010,\u001a\u00020IH\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020-H\u0002¢\u0006\u0004\bL\u0010EJ\u000f\u0010M\u001a\u00020-H\u0002¢\u0006\u0004\bM\u0010EJ\u000f\u0010N\u001a\u00020-H\u0002¢\u0006\u0004\bN\u0010EJ\u000f\u0010O\u001a\u00020-H\u0002¢\u0006\u0004\bO\u0010EJ%\u0010T\u001a\u0004\u0018\u00010-2\u0012\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0Q0PH\u0002¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020-2\u0006\u0010V\u001a\u00020RH\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020-2\u0006\u0010V\u001a\u00020RH\u0002¢\u0006\u0004\bY\u0010XJ\u001f\u0010\\\u001a\u00020-2\u0006\u0010V\u001a\u00020R2\u0006\u0010[\u001a\u00020ZH\u0002¢\u0006\u0004\b\\\u0010]J\u0019\u0010`\u001a\u00020-2\b\u0010_\u001a\u0004\u0018\u00010^H\u0002¢\u0006\u0004\b`\u0010aJ\u001d\u0010d\u001a\u00020-2\f\u0010c\u001a\b\u0012\u0004\u0012\u00020b0PH\u0002¢\u0006\u0004\bd\u0010eJ\u001d\u0010h\u001a\u00020-2\f\u0010g\u001a\b\u0012\u0004\u0012\u00020f0PH\u0002¢\u0006\u0004\bh\u0010eJ\u0019\u0010k\u001a\u00020-2\b\u0010j\u001a\u0004\u0018\u00010iH\u0002¢\u0006\u0004\bk\u0010lJ\u0019\u0010n\u001a\u00020-2\b\u0010j\u001a\u0004\u0018\u00010mH\u0002¢\u0006\u0004\bn\u0010oJ\u0017\u0010r\u001a\u00020-2\u0006\u0010q\u001a\u00020pH\u0002¢\u0006\u0004\br\u0010sJ!\u0010v\u001a\u00020-2\u0006\u0010V\u001a\u00020R2\b\u0010u\u001a\u0004\u0018\u00010tH\u0002¢\u0006\u0004\bv\u0010wJ\u001f\u0010x\u001a\u00020-2\u0006\u0010V\u001a\u00020R2\u0006\u0010q\u001a\u00020pH\u0002¢\u0006\u0004\bx\u0010yJ\u001d\u0010|\u001a\u00020-2\f\u0010{\u001a\b\u0012\u0004\u0012\u00020z0PH\u0002¢\u0006\u0004\b|\u0010eJ\u001d\u0010~\u001a\u00020-2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020z0PH\u0002¢\u0006\u0004\b~\u0010eJ\u0010\u0010\u007f\u001a\u000200H\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0012\u0010\u0081\u0001\u001a\u000200H\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0080\u0001J\u001c\u0010\u0084\u0001\u001a\u00020-2\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0019\u0010\u0086\u0001\u001a\u00020-2\u0006\u0010V\u001a\u00020RH\u0002¢\u0006\u0005\b\u0086\u0001\u0010XJ\u001c\u0010\u0089\u0001\u001a\u00020-2\b\u0010\u0088\u0001\u001a\u00030\u0087\u0001H\u0002¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0015\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008b\u0001H\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J1\u0010\u0091\u0001\u001a\u00020-2\b\u0010\u008f\u0001\u001a\u00030\u008e\u00012\u0013\u0010\u0090\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0Q0PH\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J4\u0010\u0094\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0Q0P2\u0014\u0010\u0090\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0Q0\u0093\u0001H\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001b\u0010\u0097\u0001\u001a\u00020-2\u0007\u0010\u0096\u0001\u001a\u00020:H\u0002¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001JV\u0010\u009e\u0001\u001a\u00020-\"\n\b\u0000\u0010\u0099\u0001*\u00030\u008e\u0001*\t\u0012\u0004\u0012\u00028\u00000\u009a\u00012\u0014\u0010\u009c\u0001\u001a\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020-0\u009b\u00012\u0015\u0010\u009d\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u0082\u0001\u0012\u0004\u0012\u00020-0\u009b\u0001H\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u001b\u0010 \u0001\u001a\u00020-2\u0007\u0010\u0096\u0001\u001a\u00020:H\u0002¢\u0006\u0006\b \u0001\u0010\u0098\u0001J\u0011\u0010¡\u0001\u001a\u00020-H\u0002¢\u0006\u0005\b¡\u0001\u0010EJ\u0011\u0010¢\u0001\u001a\u00020-H\u0002¢\u0006\u0005\b¢\u0001\u0010EJ\u001b\u0010£\u0001\u001a\u00020-2\u0007\u0010\u0096\u0001\u001a\u00020:H\u0002¢\u0006\u0006\b£\u0001\u0010\u0098\u0001J\u001c\u0010¤\u0001\u001a\u00020-2\u0007\u0010\u0096\u0001\u001a\u00020:H\u0082@¢\u0006\u0006\b¤\u0001\u0010¥\u0001J)\u0010¦\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0P0\u009a\u00012\u0007\u0010\u0096\u0001\u001a\u00020:H\u0082@¢\u0006\u0006\b¦\u0001\u0010¥\u0001J \u0010¨\u0001\u001a\u00020-2\r\u0010§\u0001\u001a\b\u0012\u0004\u0012\u00020R0PH\u0002¢\u0006\u0005\b¨\u0001\u0010eJ\u001c\u0010©\u0001\u001a\u00020-2\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001H\u0002¢\u0006\u0006\b©\u0001\u0010\u0085\u0001J2\u0010«\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ª\u00010P0\u009a\u00012\u0007\u0010\u0096\u0001\u001a\u00020:2\u0006\u0010V\u001a\u00020RH\u0082@¢\u0006\u0006\b«\u0001\u0010¬\u0001J!\u0010®\u0001\u001a\u00020-2\u000e\u0010\u00ad\u0001\u001a\t\u0012\u0005\u0012\u00030ª\u00010PH\u0002¢\u0006\u0005\b®\u0001\u0010eJ\u001c\u0010¯\u0001\u001a\u00020-2\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001H\u0002¢\u0006\u0006\b¯\u0001\u0010\u0085\u0001J\u001e\u0010°\u0001\u001a\u0004\u0018\u00010R2\u0007\u0010\u0096\u0001\u001a\u00020:H\u0082@¢\u0006\u0006\b°\u0001\u0010¥\u0001J)\u0010±\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020z0P0\u009a\u00012\u0007\u0010\u0096\u0001\u001a\u00020:H\u0082@¢\u0006\u0006\b±\u0001\u0010¥\u0001J,\u0010³\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u009a\u0001\"\u0005\b\u0000\u0010\u0099\u0001*\t\u0012\u0004\u0012\u00028\u00000²\u0001H\u0082@¢\u0006\u0006\b³\u0001\u0010´\u0001J$\u0010¶\u0001\u001a\n\u0012\u0005\u0012\u00030µ\u00010\u009a\u00012\u0007\u0010\u0096\u0001\u001a\u00020:H\u0082@¢\u0006\u0006\b¶\u0001\u0010¥\u0001J\u001c\u0010¸\u0001\u001a\u00020-2\b\u0010·\u0001\u001a\u00030µ\u0001H\u0002¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u001c\u0010º\u0001\u001a\u00020-2\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001H\u0002¢\u0006\u0006\bº\u0001\u0010\u0085\u0001J$\u0010¼\u0001\u001a\n\u0012\u0005\u0012\u00030»\u00010\u009a\u00012\u0007\u0010\u0096\u0001\u001a\u00020:H\u0082@¢\u0006\u0006\b¼\u0001\u0010¥\u0001J\u001c\u0010¾\u0001\u001a\u00020-2\b\u0010½\u0001\u001a\u00030»\u0001H\u0002¢\u0006\u0006\b¾\u0001\u0010¿\u0001J\u001c\u0010À\u0001\u001a\u00020-2\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001H\u0002¢\u0006\u0006\bÀ\u0001\u0010\u0085\u0001J%\u0010Ä\u0001\u001a\u00020-2\u0007\u0010Á\u0001\u001a\u0002002\b\u0010Ã\u0001\u001a\u00030Â\u0001H\u0002¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J\u001a\u0010Ç\u0001\u001a\u00020-2\u0007\u0010Æ\u0001\u001a\u00020RH\u0002¢\u0006\u0005\bÇ\u0001\u0010XJ\u001f\u0010É\u0001\u001a\u00020-2\u000b\u0010;\u001a\u000700j\u0003`È\u0001H\u0002¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J\u001c\u0010Í\u0001\u001a\u00020-2\b\u0010Ì\u0001\u001a\u00030Ë\u0001H\u0002¢\u0006\u0006\bÍ\u0001\u0010Î\u0001J\u0011\u0010Ï\u0001\u001a\u00020-H\u0002¢\u0006\u0005\bÏ\u0001\u0010EJ2\u0010Ó\u0001\u001a\u00020-2\u000e\u0010Ñ\u0001\u001a\t\u0012\u0004\u0012\u00020-0Ð\u00012\u000e\u0010Ò\u0001\u001a\t\u0012\u0004\u0012\u00020-0Ð\u0001H\u0002¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001J\u001e\u0010×\u0001\u001a\u00020-2\n\b\u0001\u0010Ö\u0001\u001a\u00030Õ\u0001H\u0002¢\u0006\u0006\b×\u0001\u0010Ø\u0001J\u001b\u0010Ú\u0001\u001a\u00020-2\u0007\u0010V\u001a\u00030Ù\u0001H\u0002¢\u0006\u0006\bÚ\u0001\u0010Û\u0001J\u001b\u0010Ü\u0001\u001a\u00020-2\u0007\u0010V\u001a\u00030Ù\u0001H\u0002¢\u0006\u0006\bÜ\u0001\u0010Û\u0001J\u001b\u0010Þ\u0001\u001a\u00020-2\u0007\u00106\u001a\u00030Ý\u0001H\u0002¢\u0006\u0006\bÞ\u0001\u0010ß\u0001J\u001b\u0010à\u0001\u001a\u00020-2\u0007\u0010V\u001a\u00030Ù\u0001H\u0002¢\u0006\u0006\bà\u0001\u0010Û\u0001J\u001a\u0010á\u0001\u001a\u00020-2\u0006\u0010V\u001a\u00020:H\u0002¢\u0006\u0006\bá\u0001\u0010\u0098\u0001J\u001b\u0010ã\u0001\u001a\u00020-2\u0007\u00106\u001a\u00030â\u0001H\u0002¢\u0006\u0006\bã\u0001\u0010ä\u0001J\u001b\u0010å\u0001\u001a\u00020-2\u0007\u0010V\u001a\u00030Ù\u0001H\u0002¢\u0006\u0006\bå\u0001\u0010Û\u0001J\u001b\u0010æ\u0001\u001a\u00020-2\u0007\u0010V\u001a\u00030Ù\u0001H\u0002¢\u0006\u0006\bæ\u0001\u0010Û\u0001J*\u0010è\u0001\u001a\u00020-2\r\u0010\u00ad\u0001\u001a\b\u0012\u0004\u0012\u00020R0P2\u0007\u0010ç\u0001\u001a\u000205H\u0002¢\u0006\u0006\bè\u0001\u0010é\u0001J \u0010ë\u0001\u001a\u00020-2\r\u0010ê\u0001\u001a\b\u0012\u0004\u0012\u0002000PH\u0002¢\u0006\u0005\bë\u0001\u0010eJ\u001c\u0010î\u0001\u001a\u00020-2\b\u0010í\u0001\u001a\u00030ì\u0001H\u0002¢\u0006\u0006\bî\u0001\u0010ï\u0001J\u001c\u0010ò\u0001\u001a\u00020-2\b\u0010ñ\u0001\u001a\u00030ð\u0001H\u0002¢\u0006\u0006\bò\u0001\u0010ó\u0001J\u001c\u0010ô\u0001\u001a\u00020-2\b\u0010ñ\u0001\u001a\u00030ð\u0001H\u0002¢\u0006\u0006\bô\u0001\u0010ó\u0001J\u001c\u0010÷\u0001\u001a\u00020-2\b\u0010ö\u0001\u001a\u00030õ\u0001H\u0002¢\u0006\u0006\b÷\u0001\u0010ø\u0001J\u001b\u0010ú\u0001\u001a\u00020-2\u0007\u00106\u001a\u00030ù\u0001H\u0002¢\u0006\u0006\bú\u0001\u0010û\u0001J\u001b\u0010ý\u0001\u001a\u00020-2\u0007\u00106\u001a\u00030ü\u0001H\u0002¢\u0006\u0006\bý\u0001\u0010þ\u0001J\u001c\u0010\u0081\u0002\u001a\u00020-2\b\u0010\u0080\u0002\u001a\u00030ÿ\u0001H\u0002¢\u0006\u0006\b\u0081\u0002\u0010\u0082\u0002J\u001b\u0010\u0084\u0002\u001a\u00020-2\u0007\u00106\u001a\u00030\u0083\u0002H\u0002¢\u0006\u0006\b\u0084\u0002\u0010\u0085\u0002J\u001b\u0010\u0087\u0002\u001a\u00020-2\u0007\u00106\u001a\u00030\u0086\u0002H\u0002¢\u0006\u0006\b\u0087\u0002\u0010\u0088\u0002J\u0011\u0010\u0089\u0002\u001a\u00020-H\u0000¢\u0006\u0005\b\u0089\u0002\u0010EJ*\u0010\u008c\u0002\u001a\u00020-2\u0006\u00106\u001a\u0002052\b\u0010\u008b\u0002\u001a\u00030\u008a\u00022\u0006\u00102\u001a\u000200¢\u0006\u0006\b\u008c\u0002\u0010\u008d\u0002J\u0011\u0010\u008e\u0002\u001a\u00020-H\u0000¢\u0006\u0005\b\u008e\u0002\u0010EJ\u0019\u0010\u008f\u0002\u001a\u00020-2\u0007\u0010\u0096\u0001\u001a\u00020:¢\u0006\u0006\b\u008f\u0002\u0010\u0098\u0001J\u001a\u0010\u0091\u0002\u001a\u00020-2\u0007\u0010\u0090\u0002\u001a\u000205H\u0000¢\u0006\u0005\b\u0091\u0002\u00108J\u001c\u0010\u0094\u0002\u001a\u00020-2\b\u0010\u0093\u0002\u001a\u00030\u0092\u0002H\u0016¢\u0006\u0006\b\u0094\u0002\u0010\u0095\u0002J\u0011\u0010\u0096\u0002\u001a\u00020-H\u0014¢\u0006\u0005\b\u0096\u0002\u0010EJ\u0019\u0010\u0098\u0002\u001a\u00020-2\u0007\u00106\u001a\u00030\u0097\u0002¢\u0006\u0006\b\u0098\u0002\u0010\u0099\u0002J\u0019\u0010\u009b\u0002\u001a\u00020-2\u0007\u00106\u001a\u00030\u009a\u0002¢\u0006\u0006\b\u009b\u0002\u0010\u009c\u0002J\u001a\u0010\u009f\u0002\u001a\u00020-2\b\u0010\u009e\u0002\u001a\u00030\u009d\u0002¢\u0006\u0006\b\u009f\u0002\u0010 \u0002J\u001a\u0010¢\u0002\u001a\u00020-2\b\u0010½\u0001\u001a\u00030¡\u0002¢\u0006\u0006\b¢\u0002\u0010£\u0002R\u0016\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0002\u0010¥\u0002R\u0016\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0002\u0010§\u0002R\u0016\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0002\u0010©\u0002R\u0016\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0002\u0010«\u0002R\u0016\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0002\u0010\u00ad\u0002R\u0016\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0002\u0010¯\u0002R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0002\u0010±\u0002R\u0016\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0002\u0010³\u0002R\u0016\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0002\u0010µ\u0002R\u0016\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0002\u0010·\u0002R\u0016\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0002\u0010¹\u0002R\u0016\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0002\u0010»\u0002R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0002\u0010½\u0002R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0002\u0010¿\u0002R\u0016\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0002\u0010Á\u0002R\u0016\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0002\u0010Ã\u0002R\u0016\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0002\u0010Å\u0002R\u0016\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0002\u0010Ç\u0002R\u0016\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0002\u0010É\u0002R$\u0010Ì\u0002\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0Q0Ê\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010Ë\u0002R)\u0010Ò\u0002\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0Q0Í\u00028\u0006¢\u0006\u0010\n\u0006\bÎ\u0002\u0010Ï\u0002\u001a\u0006\bÐ\u0002\u0010Ñ\u0002R\u0018\u0010Ö\u0002\u001a\u00030Ó\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0002\u0010Õ\u0002R\u001d\u0010Ü\u0002\u001a\u00030×\u00028\u0006¢\u0006\u0010\n\u0006\bØ\u0002\u0010Ù\u0002\u001a\u0006\bÚ\u0002\u0010Û\u0002R\u0018\u0010à\u0002\u001a\u00030Ý\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÞ\u0002\u0010ß\u0002R\u001f\u0010ã\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00020Ê\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bâ\u0002\u0010Ë\u0002R$\u0010æ\u0002\u001a\n\u0012\u0005\u0012\u00030á\u00020Í\u00028\u0006¢\u0006\u0010\n\u0006\bä\u0002\u0010Ï\u0002\u001a\u0006\bå\u0002\u0010Ñ\u0002R\u001e\u0010ê\u0002\u001a\u000700j\u0003`ç\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bè\u0002\u0010é\u0002R\u0018\u0010í\u0002\u001a\u00030Õ\u00018\u0002X\u0082D¢\u0006\b\n\u0006\bë\u0002\u0010ì\u0002R+\u0010ñ\u0002\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bî\u0002\u0010é\u0002\u001a\u0006\bï\u0002\u0010\u0080\u0001\"\u0006\bð\u0002\u0010Ê\u0001R+\u0010õ\u0002\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bò\u0002\u0010é\u0002\u001a\u0006\bó\u0002\u0010\u0080\u0001\"\u0006\bô\u0002\u0010Ê\u0001R\u0019\u0010ø\u0002\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bö\u0002\u0010÷\u0002R(\u0010ý\u0002\u001a\u0002058\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bù\u0002\u0010÷\u0002\u001a\u0006\bú\u0002\u0010û\u0002\"\u0005\bü\u0002\u00108¨\u0006ÿ\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "LRo/c;", "productsRepository", "Lhl/m;", "cartRepository", "LTq/j;", "storeProvider", "Lyo/k;", "userManager", "LEq/a;", "favoritesListRepository", "LEq/b;", "shoppingListRepository", "Lwr/f;", "cartInteractor", "Lcom/google/firebase/crashlytics/a;", "firebaseCrashlytics", "Lyl/k;", "featureManager", "Lgi/a;", "analyticsEngine", "Lqp/b;", "beaconClient", "Lsp/Y;", "productStateRepository", "Lsp/a;", "multiChannelProductsStateRepository", "Lpp/g;", "suggestionsRepository", "Lpp/e;", "sponsorshipsDataStore", "Lpp/d;", "productMetadataStore", "LKp/g;", "bazaarVoiceManager", "Lcl/d;", "couponsRepository", "Lqv/K;", "ioDispatcher", "<init>", "(LRo/c;Lhl/m;LTq/j;Lyo/k;LEq/a;LEq/b;Lwr/f;Lcom/google/firebase/crashlytics/a;Lyl/k;Lgi/a;Lqp/b;Lsp/Y;Lsp/a;Lpp/g;Lpp/e;Lpp/d;LKp/g;Lcl/d;Lqv/K;)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "vsUpdate", "", "f2", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;)V", "", "variantType", "variantName", "V2", "(Ljava/lang/String;Ljava/lang/String;)V", "", "action", "z1", "(Z)V", "P0", "Lmk/f;", "productCode", "L2", "(Ljava/lang/String;Ljava/lang/String;Lmk/f;)V", "Lfi/a;", "analytics", "E2", "(Lfi/a;)V", "isFromCLP", "Y2", "l2", "()V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$k;", "N2", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$k;)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$b;", "f1", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$b;)V", "O1", "J1", "E1", "F1", "", "Lsp/b;", "LCo/h;", "productStates", "i3", "(Ljava/util/List;)Lkotlin/Unit;", "product", "b3", "(LCo/h;)V", "a3", "LTq/k;", PlaceTypes.STORE, "e3", "(LCo/h;LTq/k;)V", "LEo/g;", "nutritionLabel", "d3", "(LEo/g;)V", "LXk/c;", "coupons", "U2", "(Ljava/util/List;)V", "LWk/a;", "complexPromos", "T2", "LFq/c;", "item", "f3", "(LFq/c;)V", "LFq/a;", "W2", "(LFq/a;)V", "Lvl/b;", "eligibility", "R2", "(Lvl/b;)V", "Lvl/a;", "cartEntry", "S2", "(LCo/h;Lvl/a;)V", "c3", "(LCo/h;Lvl/b;)V", "LCo/k;", "productVariantGroups", "h3", "variantGroups", "B1", "s2", "()Ljava/lang/String;", "r2", "", "t", "j3", "(Ljava/lang/Throwable;)V", "X2", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$l;", "update", "Z2", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$l;)V", "LAo/W$a;", "u1", "()LAo/W$a;", "", "key", "productState", "e2", "(Ljava/lang/Object;Ljava/util/List;)V", "", "D1", "(Ljava/util/List;)Ljava/util/List;", "productIdentity", "v2", "(Lmk/f;)V", "T", "Lkotlin/Result;", "Lkotlin/Function1;", "onSuccess", "onFailure", "c1", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "n1", "r1", "h1", "m1", "A1", "(Lmk/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "l1", "results", "V0", "U0", "Lpp/f;", "p1", "(Lmk/f;LCo/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "productList", "C2", "B2", "o1", "q1", "Lio/reactivex/y;", "m2", "(Lio/reactivex/y;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ldl/a;", "k1", "response", "e1", "(Ldl/a;)V", "d1", "LKp/c;", "g1", "result", "k2", "(LKp/c;)V", "S0", "reviewId", "LKp/a;", "reviewFeedbackVote", "D2", "(Ljava/lang/String;LKp/a;)V", "productDetails", "F2", "Lcom/meijer/mobile/core/models/products/ProductCode;", "I2", "(Ljava/lang/String;)V", "", "quantityToUpdate", "Q2", "(D)V", "W0", "Lkotlin/Function0;", "isLoggedIn", "isNotLoggedIn", "y1", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "message", "A2", "(I)V", "Lmk/c;", "l3", "(Lmk/c;)V", "k3", "Lkk/b;", "a2", "(Lkk/b;)V", "R0", "i2", "Lkk/a;", "W1", "(Lkk/a;)V", "Q0", "h2", "isFrequentlyBoughtTogetherImpression", "T0", "(Ljava/util/List;Z)V", "beacon", "t2", "LOk/c;", "couponIdentity", "n2", "(LOk/c;)V", "LOk/a;", "coupon", "X0", "(LOk/a;)V", "U1", "Lcom/meijer/mobile/coupons/domain/models/CouponException;", "exception", "T1", "(Lcom/meijer/mobile/coupons/domain/models/CouponException;)V", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2;", "R1", "(Lcom/meijer/mobile/meijer/activity/find/productdetail/a2;)V", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2$a;", "g2", "(Lcom/meijer/mobile/meijer/activity/find/productdetail/a2$a;)V", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2$d;", "showGallery", "y2", "(Lcom/meijer/mobile/meijer/activity/find/productdetail/a2$d;)V", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2$g;", "n3", "(Lcom/meijer/mobile/meijer/activity/find/productdetail/a2$g;)V", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2$c;", "q2", "(Lcom/meijer/mobile/meijer/activity/find/productdetail/a2$c;)V", "M2", "Lbn/i;", "productVariantDecorator", "g3", "(ZLbn/i;Ljava/lang/String;)V", "j2", "x2", "isVisible", "z2", "Landroidx/lifecycle/s;", "owner", "onResume", "(Landroidx/lifecycle/s;)V", "onCleared", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/a;", "S1", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/a;)V", "LPk/a;", "V1", "(LPk/a;)V", "Lcom/meijer/mobile/meijer/activity/find/productdetail/n2;", "reloadable", "Z1", "(Lcom/meijer/mobile/meijer/activity/find/productdetail/n2;)V", "Lcom/meijer/mobile/meijer/activity/find/productdetail/m2;", "d2", "(Lcom/meijer/mobile/meijer/activity/find/productdetail/m2;)V", "a", "LRo/c;", "b", "Lhl/m;", "c", "LTq/j;", "d", "Lyo/k;", "e", "LEq/a;", "f", "LEq/b;", "g", "Lwr/f;", "h", "Lcom/google/firebase/crashlytics/a;", "i", "Lyl/k;", "j", "Lgi/a;", "k", "Lqp/b;", "l", "Lsp/Y;", "m", "Lsp/a;", "n", "Lpp/g;", "o", "Lpp/e;", "p", "Lpp/d;", "q", "LKp/g;", "r", "Lcl/d;", "s", "Lqv/K;", "Ltv/B;", "Ltv/B;", "_productStateFlow", "Ltv/P;", "u", "Ltv/P;", "w1", "()Ltv/P;", "productStateFlow", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$g;", "v", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$g;", "_viewState", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$d;", "w", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$d;", "x1", "()Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$d;", "viewState", "LNu/a;", "x", "LNu/a;", "disposables", "Lcom/meijer/mobile/meijer/activity/find/productdetail/W0;", "y", "_featureFlags", "z", "v1", "featureFlags", "Lcom/meijer/mobile/core/model/common/ResourceId;", "A", "Ljava/lang/String;", "cartId", "B", "I", "limitReviews", "C", "getPreviousTrackAction", "w2", "previousTrackAction", "D", "t1", "u2", "campaignIdValue", "E", "Z", "quantityChangeForFBT", "F", "getCarouselIsVisibleEncountered", "()Z", "setCarouselIsVisibleEncountered", "carouselIsVisibleEncountered", "G", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C12233e0 extends androidx.view.c0 implements InterfaceC6015f {

    /* renamed from: H, reason: collision with root package name */
    public static final int f108422H = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private String cartId;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int limitReviews;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private String previousTrackAction;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private String campaignIdValue;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private boolean quantityChangeForFBT;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private boolean carouselIsVisibleEncountered;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ro.c productsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hl.m cartRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Eq.a favoritesListRepository;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Eq.b shoppingListRepository;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final wr.f cartInteractor;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final com.google.firebase.crashlytics.a firebaseCrashlytics;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final yl.k featureManager;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14261a analyticsEngine;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final C16594b beaconClient;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final sp.Y productStateRepository;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final C16992a multiChannelProductsStateRepository;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final pp.g suggestionsRepository;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final pp.e sponsorshipsDataStore;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final pp.d productMetadataStore;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Kp.g bazaarVoiceManager;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final C6412d couponsRepository;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ProductState<ProductFullDetails>> _productStateFlow;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final tv.P<ProductState<ProductFullDetails>> productStateFlow;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final C12240g _viewState;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC12237d viewState;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Nu.a disposables;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ProductDetailFeatureFlags> _featureFlags;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final tv.P<ProductDetailFeatureFlags> featureFlags;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$removeFromShoppingList$1", f = "ProductDetailComposeViewModel.kt", l = {2024}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$A */
    static final class A extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f108455a;

        /* renamed from: b, reason: collision with root package name */
        Object f108456b;

        /* renamed from: c, reason: collision with root package name */
        Object f108457c;

        /* renamed from: d, reason: collision with root package name */
        Object f108458d;

        /* renamed from: e, reason: collision with root package name */
        int f108459e;

        /* renamed from: f, reason: collision with root package name */
        int f108460f;

        /* renamed from: g, reason: collision with root package name */
        int f108461g;

        /* renamed from: h, reason: collision with root package name */
        int f108462h;

        /* renamed from: i, reason: collision with root package name */
        int f108463i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f108464j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ mk.f f108466l;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$removeFromShoppingList$1$4$1", f = "ProductDetailComposeViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$A$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f108467a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12233e0 f108468b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C12233e0 c12233e0, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f108468b = c12233e0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f108468b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f108467a == 0) {
                    ResultKt.b(obj);
                    this.f108468b._viewState.J().add(new InterfaceC12238e.UpdateShoppingOrFavoriteListFailed(null, C18570a.f173241i, C18570a.f173242j, 1, null));
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            A a10 = C12233e0.this.new A(this.f108466l, continuation);
            a10.f108464j = obj;
            return a10;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        A(mk.f fVar, Continuation<? super A> continuation) {
            super(2, continuation);
            this.f108466l = fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((A) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            Object next;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108463i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f108464j;
                    C12233e0 c12233e0 = C12233e0.this;
                    mk.f fVar = this.f108466l;
                    Result.Companion companion = Result.INSTANCE;
                    Eq.b bVar = c12233e0.shoppingListRepository;
                    this.f108464j = interfaceC16622O;
                    this.f108455a = interfaceC16622O;
                    this.f108456b = this;
                    this.f108457c = this;
                    this.f108458d = interfaceC16622O;
                    this.f108459e = 0;
                    this.f108460f = 0;
                    this.f108461g = 0;
                    this.f108462h = 0;
                    this.f108463i = 1;
                    obj = bVar.p(fVar, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                qv.E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            mk.f fVar2 = this.f108466l;
            if (Result.h(objB)) {
                Iterator it = ((List) objB).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (Fq.d.c((ShoppingListItem) next, fVar2)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                objB = TuplesKt.a(fVar2, next);
            }
            Object objB2 = Result.b(objB);
            if (Result.h(objB2)) {
                uw.a.INSTANCE.k("Removed product from shopping list successfully.", new Object[0]);
            }
            C12233e0 c12233e02 = C12233e0.this;
            Throwable thE = Result.e(objB2);
            if (thE != null) {
                uw.a.INSTANCE.f(thE, "Failed to remove shopping list entry.", new Object[0]);
                C16648k.d(androidx.view.d0.a(c12233e02), null, null, new a(c12233e02, null), 3, null);
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$resetQuantitySteppers$1", f = "ProductDetailComposeViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$B */
    static final class B extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108469a;

        B(Continuation<? super B> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12233e0.this.new B(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((B) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f108469a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            List<SuggestedProductCarouselDecorator> value = C12233e0.this._viewState.O().getValue();
            InterfaceC5730l0<List<SuggestedProductCarouselDecorator>> interfaceC5730l0O = C12233e0.this._viewState.O();
            List<SuggestedProductCarouselDecorator> list = value;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(SuggestedProductCarouselDecorator.v((SuggestedProductCarouselDecorator) it.next(), null, null, null, null, null, null, false, false, null, null, null, null, 0.0d, false, true, null, null, null, false, null, 1023999, null));
            }
            interfaceC5730l0O.setValue(arrayList);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel", f = "ProductDetailComposeViewModel.kt", l = {2432}, m = "rxAwait-gIAlu-s")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$C */
    static final class C<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f108471a;

        /* renamed from: b, reason: collision with root package name */
        int f108472b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f108473c;

        /* renamed from: e, reason: collision with root package name */
        int f108475e;

        C(Continuation<? super C> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f108473c = obj;
            this.f108475e |= Integer.MIN_VALUE;
            Object objM2 = C12233e0.this.m2(null, this);
            return objM2 == IntrinsicsKt.f() ? objM2 : Result.a(objM2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\b\u00028\u0000H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b9¨\u0006\u000e"}, d2 = {"com/meijer/mobile/meijer/activity/find/viewmodel/e0$D", "Lio/reactivex/w;", "LNu/b;", "d", "", "onSubscribe", "(LNu/b;)V", "t", "onSuccess", "(Ljava/lang/Object;)V", "", "error", "onError", "(Ljava/lang/Throwable;)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$D */
    public static final class D<T> implements io.reactivex.w<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16654n<Result<? extends T>> f108476a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C12233e0 f108477b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$D$a */
        static final class a implements Function1<Throwable, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Nu.b f108478a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12233e0 f108479b;

            a(Nu.b bVar, C12233e0 c12233e0) {
                this.f108478a = bVar;
                this.f108479b = c12233e0;
            }

            public final void a(Throwable th2) {
                Ck.a.a(this.f108478a, this.f108479b.disposables);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                a(th2);
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        D(InterfaceC16654n<? super Result<? extends T>> interfaceC16654n, C12233e0 c12233e0) {
            this.f108476a = interfaceC16654n;
            this.f108477b = c12233e0;
        }

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onError(Throwable error) {
            Intrinsics.j(error, "error");
            InterfaceC16654n<Result<? extends T>> interfaceC16654n = this.f108476a;
            Result.Companion companion = Result.INSTANCE;
            interfaceC16654n.resumeWith(Result.b(Result.a(Result.b(ResultKt.a(error)))));
        }

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onSubscribe(Nu.b d10) {
            Intrinsics.j(d10, "d");
            this.f108476a.F(new a(d10, this.f108477b));
        }

        @Override // io.reactivex.w, io.reactivex.i
        public void onSuccess(T t10) {
            Intrinsics.j(t10, "t");
            this.f108476a.resumeWith(Result.b(Result.a(Result.b(t10))));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$E */
    /* synthetic */ class E extends FunctionReferenceImpl implements Function1<Coupon, Unit> {
        E(Object obj) {
            super(1, obj, C12233e0.class, "clipCoupon", "clipCoupon(Lcom/meijer/mobile/coupon/model/common/Coupon;)V", 0);
        }

        public final void a(Coupon p02) {
            Intrinsics.j(p02, "p0");
            ((C12233e0) this.receiver).X0(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Coupon coupon) {
            a(coupon);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$F */
    /* synthetic */ class F extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        F(Object obj) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$sendCriteoBeacon$1", f = "ProductDetailComposeViewModel.kt", l = {2213}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$G */
    static final class G extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f108480a;

        /* renamed from: b, reason: collision with root package name */
        Object f108481b;

        /* renamed from: c, reason: collision with root package name */
        Object f108482c;

        /* renamed from: d, reason: collision with root package name */
        Object f108483d;

        /* renamed from: e, reason: collision with root package name */
        Object f108484e;

        /* renamed from: f, reason: collision with root package name */
        Object f108485f;

        /* renamed from: g, reason: collision with root package name */
        Object f108486g;

        /* renamed from: h, reason: collision with root package name */
        Object f108487h;

        /* renamed from: i, reason: collision with root package name */
        Object f108488i;

        /* renamed from: j, reason: collision with root package name */
        int f108489j;

        /* renamed from: k, reason: collision with root package name */
        int f108490k;

        /* renamed from: l, reason: collision with root package name */
        int f108491l;

        /* renamed from: m, reason: collision with root package name */
        int f108492m;

        /* renamed from: n, reason: collision with root package name */
        int f108493n;

        /* renamed from: o, reason: collision with root package name */
        int f108494o;

        /* renamed from: p, reason: collision with root package name */
        int f108495p;

        /* renamed from: q, reason: collision with root package name */
        private /* synthetic */ Object f108496q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ List<String> f108497r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ C12233e0 f108498s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        G(List<String> list, C12233e0 c12233e0, Continuation<? super G> continuation) {
            super(2, continuation);
            this.f108497r = list;
            this.f108498s = c12233e0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            G g10 = new G(this.f108497r, this.f108498s, continuation);
            g10.f108496q = obj;
            return g10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((G) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0076 A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:6:0x003b, B:14:0x0070, B:16:0x0076, B:21:0x00c4, B:13:0x005b), top: B:29:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00c4 A[Catch: Exception -> 0x0045, TRY_LEAVE, TryCatch #0 {Exception -> 0x0045, blocks: (B:6:0x003b, B:14:0x0070, B:16:0x0076, B:21:0x00c4, B:13:0x005b), top: B:29:0x0009 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00bd -> B:20:0x00be). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 239
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.G.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$showRequireLoginAlert$1", f = "ProductDetailComposeViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$H */
    static final class H extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108499a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f108501c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        H(int i10, Continuation<? super H> continuation) {
            super(2, continuation);
            this.f108501c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12233e0.this.new H(this.f108501c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((H) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f108499a == 0) {
                ResultKt.b(obj);
                C12233e0.this._viewState.J().add(new InterfaceC12238e.RequireLogin(null, this.f108501c, 1, 0 == true ? 1 : 0));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$submitBazaarVoiceFeedback$1", f = "ProductDetailComposeViewModel.kt", l = {1814}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$I */
    static final class I extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f108502a;

        /* renamed from: b, reason: collision with root package name */
        Object f108503b;

        /* renamed from: c, reason: collision with root package name */
        Object f108504c;

        /* renamed from: d, reason: collision with root package name */
        Object f108505d;

        /* renamed from: e, reason: collision with root package name */
        int f108506e;

        /* renamed from: f, reason: collision with root package name */
        int f108507f;

        /* renamed from: g, reason: collision with root package name */
        int f108508g;

        /* renamed from: h, reason: collision with root package name */
        int f108509h;

        /* renamed from: i, reason: collision with root package name */
        int f108510i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f108511j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f108513l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Kp.a f108514m;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            I i10 = C12233e0.this.new I(this.f108513l, this.f108514m, continuation);
            i10.f108511j = obj;
            return i10;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I(String str, Kp.a aVar, Continuation<? super I> continuation) {
            super(2, continuation);
            this.f108513l = str;
            this.f108514m = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((I) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108510i;
            int i11 = 1;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f108511j;
                    C12233e0 c12233e0 = C12233e0.this;
                    String str = this.f108513l;
                    Kp.a aVar = this.f108514m;
                    Result.Companion companion = Result.INSTANCE;
                    Kp.g gVar = c12233e0.bazaarVoiceManager;
                    this.f108511j = interfaceC16622O;
                    this.f108502a = interfaceC16622O;
                    this.f108503b = this;
                    this.f108504c = this;
                    this.f108505d = interfaceC16622O;
                    this.f108506e = 0;
                    this.f108507f = 0;
                    this.f108508g = 0;
                    this.f108509h = 0;
                    this.f108510i = 1;
                    if (gVar.d(str, aVar, this) == objF) {
                        return objF;
                    }
                }
                objB = Result.b(Unit.f142422a);
            } catch (Exception e10) {
                qv.E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            C12233e0 c12233e02 = C12233e0.this;
            Kp.a aVar2 = this.f108514m;
            if (Result.h(objB)) {
                c12233e02._viewState.J().add(new InterfaceC12238e.d.BazaarVoiceFeedbackSubmitted(null, aVar2, i11, 0 == true ? 1 : 0));
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                uw.a.INSTANCE.f(thE, "submitFeedback: Failed to get submitFeedback", new Object[0]);
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$trackProductAnalytics$1$1$1", f = "ProductDetailComposeViewModel.kt", l = {1851}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$J */
    static final class J extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f108515a;

        /* renamed from: b, reason: collision with root package name */
        Object f108516b;

        /* renamed from: c, reason: collision with root package name */
        Object f108517c;

        /* renamed from: d, reason: collision with root package name */
        Object f108518d;

        /* renamed from: e, reason: collision with root package name */
        Object f108519e;

        /* renamed from: f, reason: collision with root package name */
        int f108520f;

        /* renamed from: g, reason: collision with root package name */
        int f108521g;

        /* renamed from: h, reason: collision with root package name */
        int f108522h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ProductFullDetails f108523i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C12233e0 f108524j;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new J(this.f108523i, this.f108524j, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        J(ProductFullDetails productFullDetails, C12233e0 c12233e0, Continuation<? super J> continuation) {
            super(2, continuation);
            this.f108523i = productFullDetails;
            this.f108524j = c12233e0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((J) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            Iterable iterable;
            C12233e0 c12233e0;
            int i10;
            Object objF = IntrinsicsKt.f();
            int i11 = this.f108522h;
            if (i11 != 0) {
                if (i11 == 1) {
                    i10 = this.f108520f;
                    it = (Iterator) this.f108517c;
                    c12233e0 = (C12233e0) this.f108516b;
                    iterable = (Iterable) this.f108515a;
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                List<String> listE = this.f108523i.getBeaconInfo().e();
                C12233e0 c12233e02 = this.f108524j;
                it = listE.iterator();
                iterable = listE;
                c12233e0 = c12233e02;
                i10 = 0;
            }
            while (it.hasNext()) {
                Object next = it.next();
                String str = (String) next;
                C16594b c16594b = c12233e0.beaconClient;
                String strF = Ak.b.f(str);
                this.f108515a = iterable;
                this.f108516b = c12233e0;
                this.f108517c = it;
                this.f108518d = next;
                this.f108519e = str;
                this.f108520f = i10;
                this.f108521g = 0;
                this.f108522h = 1;
                if (c16594b.a(strF, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$updateCart$1", f = "ProductDetailComposeViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$K */
    static final class K extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108525a;

        K(Continuation<? super K> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12233e0.this.new K(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((K) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f108525a == 0) {
                ResultKt.b(obj);
                C12233e0.this._viewState.J().add(new InterfaceC12238e.RefreshCartOnListPageEvent(null, true, 1 == true ? 1 : 0, 0 == true ? 1 : 0));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$updateItem$1", f = "ProductDetailComposeViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$L */
    static final class L extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108527a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC12239f.UpdateItem f108528b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C12233e0 f108529c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        L(InterfaceC12239f.UpdateItem updateItem, C12233e0 c12233e0, Continuation<? super L> continuation) {
            super(2, continuation);
            this.f108528b = updateItem;
            this.f108529c = c12233e0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new L(this.f108528b, this.f108529c, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(C12233e0 c12233e0) {
            c12233e0.A2(Bj.o.f3011d);
            return Unit.f142422a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((L) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(C12233e0 c12233e0, InterfaceC12239f.UpdateItem updateItem) {
            c12233e0._viewState.G().setValue(InterfaceC12234a.d.f108539a);
            if (c12233e0.quantityChangeForFBT) {
                c12233e0.quantityChangeForFBT = false;
            }
            c12233e0.Q2(((AbstractC12120f.Update) updateItem.getAction()).getNewProductQuantity().getQuantity());
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f108527a == 0) {
                ResultKt.b(obj);
                if (this.f108528b.getAction() instanceof AbstractC12120f.Update) {
                    final C12233e0 c12233e0 = this.f108529c;
                    final InterfaceC12239f.UpdateItem updateItem = this.f108528b;
                    Function0 function0 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.B0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C12233e0.L.k(c12233e0, updateItem);
                        }
                    };
                    final C12233e0 c12233e02 = this.f108529c;
                    c12233e0.y1(function0, new Function0() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.C0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C12233e0.L.l(c12233e02);
                        }
                    });
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$viewInFavoriteList$1", f = "ProductDetailComposeViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$M */
    static final class M extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108530a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ mk.c f108532c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12233e0.this.new M(this.f108532c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        M(mk.c cVar, Continuation<? super M> continuation) {
            super(2, continuation);
            this.f108532c = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((M) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f108530a == 0) {
                ResultKt.b(obj);
                C12233e0.this._viewState.J().add(new InterfaceC12238e.ViewOnFavoriteList(null, this.f108532c, 1, 0 == true ? 1 : 0));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$viewInShoppingList$1", f = "ProductDetailComposeViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$N */
    static final class N extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108533a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ mk.c f108535c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12233e0.this.new N(this.f108535c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        N(mk.c cVar, Continuation<? super N> continuation) {
            super(2, continuation);
            this.f108535c = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((N) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f108533a == 0) {
                ResultKt.b(obj);
                C12233e0.this._viewState.J().add(new InterfaceC12238e.ViewOnShoppingList(null, this.f108535c, 1, 0 == true ? 1 : 0));
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a;", "", "b", "d", "e", "a", "c", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a$b;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a$c;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a$d;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a$e;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$a, reason: case insensitive filesystem */
    public interface InterfaceC12234a {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a;", "", "text", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$a$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class AddToCart implements InterfaceC12234a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int text;

            public AddToCart() {
                this(0, 1, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AddToCart) && this.text == ((AddToCart) other).text;
            }

            public int hashCode() {
                return Integer.hashCode(this.text);
            }

            public String toString() {
                return "AddToCart(text=" + this.text + ')';
            }

            public AddToCart(int i10) {
                this.text = i10;
            }

            /* renamed from: a, reason: from getter */
            public final int getText() {
                return this.text;
            }

            public /* synthetic */ AddToCart(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? C17135b.f162015d : i10);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a$c;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a;", "", "text", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$a$c, reason: from toString */
        public static final /* data */ class InStore implements InterfaceC12234a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int text;

            public InStore() {
                this(0, 1, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InStore) && this.text == ((InStore) other).text;
            }

            public int hashCode() {
                return Integer.hashCode(this.text);
            }

            public String toString() {
                return "InStore(text=" + this.text + ')';
            }

            public InStore(int i10) {
                this.text = i10;
            }

            /* renamed from: a, reason: from getter */
            public final int getText() {
                return this.text;
            }

            public /* synthetic */ InStore(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? com.meijer.mobile.meijer.Y.f99619Ic : i10);
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a$b;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$a$b */
        public static final /* data */ class b implements InterfaceC12234a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f108537a = new b();

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1061986534;
            }

            public String toString() {
                return "Hidden";
            }

            private b() {
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a$d;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$a$d */
        public static final /* data */ class d implements InterfaceC12234a {

            /* renamed from: a, reason: collision with root package name */
            public static final d f108539a = new d();

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -2014100096;
            }

            public String toString() {
                return "Loading";
            }

            private d() {
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a$e;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$a$e */
        public static final /* data */ class e implements InterfaceC12234a {

            /* renamed from: a, reason: collision with root package name */
            public static final e f108540a = new e();

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public int hashCode() {
                return 103389194;
            }

            public String toString() {
                return "QuantityStepper";
            }

            private e() {
            }
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\f\u0010\tJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u0004\u0018\u00010\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00072\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\tJ\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010 \u001a\u00020\u0007\"\u0004\b\u0000\u0010\u001c2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u00000\u001dH\u0016¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$b;", "Lwr/a;", "<init>", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0;)V", "Ltk/c;", "Lej/j;", "changeRes", "", "j", "(Ltk/c;)V", "entryChange", "i", "f", "", "k", "()Ljava/lang/String;", "d", "(Ltk/c;)Ljava/lang/String;", "e", "Lej/C;", "cartResource", "observeCart", "LNu/a;", "getDisposable", "()LNu/a;", "Lur/a;", "processedRequest", "(Lur/a;Ltk/c;)V", "T", "Ltk/a;", "Lvr/a;", "challenge", "throwChallenge", "(Ltk/a;)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$b, reason: case insensitive filesystem */
    public final class C12235b implements InterfaceC17847a {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$b$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EntryChange.c.values().length];
                try {
                    iArr[EntryChange.c.f128931b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EntryChange.c.f128933d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EntryChange.c.f128932c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EntryChange.c.f128934e.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$CartInteractionListenerImpl$handleCartAddition$3", f = "ProductDetailComposeViewModel.kt", l = {1197}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$b$b, reason: collision with other inner class name */
        static final class C1640b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f108542a;

            /* renamed from: b, reason: collision with root package name */
            Object f108543b;

            /* renamed from: c, reason: collision with root package name */
            Object f108544c;

            /* renamed from: d, reason: collision with root package name */
            Object f108545d;

            /* renamed from: e, reason: collision with root package name */
            int f108546e;

            /* renamed from: f, reason: collision with root package name */
            int f108547f;

            /* renamed from: g, reason: collision with root package name */
            int f108548g;

            /* renamed from: h, reason: collision with root package name */
            int f108549h;

            /* renamed from: i, reason: collision with root package name */
            int f108550i;

            /* renamed from: j, reason: collision with root package name */
            private /* synthetic */ Object f108551j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ C12233e0 f108552k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1640b(C12233e0 c12233e0, Continuation<? super C1640b> continuation) {
                super(2, continuation);
                this.f108552k = c12233e0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C1640b c1640b = new C1640b(this.f108552k, continuation);
                c1640b.f108551j = obj;
                return c1640b;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C1640b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objB;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f108550i;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f108551j;
                        C12233e0 c12233e0 = this.f108552k;
                        Result.Companion companion = Result.INSTANCE;
                        wr.f fVar = c12233e0.cartInteractor;
                        this.f108551j = interfaceC16622O;
                        this.f108542a = interfaceC16622O;
                        this.f108543b = this;
                        this.f108544c = this;
                        this.f108545d = interfaceC16622O;
                        this.f108546e = 0;
                        this.f108547f = 0;
                        this.f108548g = 0;
                        this.f108549h = 0;
                        this.f108550i = 1;
                        if (wr.f.n(fVar, false, false, this, 3, null) == objF) {
                            return objF;
                        }
                    }
                    objB = Result.b(Unit.f142422a);
                } catch (Exception e10) {
                    qv.E0.i(getContext());
                    Result.Companion companion2 = Result.INSTANCE;
                    objB = Result.b(ResultKt.a(e10));
                }
                Throwable thE = Result.e(objB);
                if (thE != null) {
                    uw.a.INSTANCE.l(thE, "fetchLatestCart failed in ProductDetailViewModelCompose", new Object[0]);
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$CartInteractionListenerImpl$observeCart$1", f = "ProductDetailComposeViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$b$c */
        static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f108553a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12233e0 f108554b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C12233e0 c12233e0, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f108554b = c12233e0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new c(this.f108554b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f108553a == 0) {
                    ResultKt.b(obj);
                    this.f108554b._viewState.J().add(new InterfaceC12238e.RefreshCartOnListPageEvent(null, false, 1, 0 == true ? 1 : 0));
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$CartInteractionListenerImpl$processedRequest$1", f = "ProductDetailComposeViewModel.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$b$d */
        static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f108555a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12233e0 f108556b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC17302a f108557c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new d(this.f108556b, this.f108557c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(C12233e0 c12233e0, AbstractC17302a abstractC17302a, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f108556b = c12233e0;
                this.f108557c = abstractC17302a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f108555a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                List<SuggestedProductCarouselDecorator> value = this.f108556b._viewState.O().getValue();
                InterfaceC5730l0<List<SuggestedProductCarouselDecorator>> interfaceC5730l0O = this.f108556b._viewState.O();
                List<SuggestedProductCarouselDecorator> list = value;
                AbstractC17302a abstractC17302a = this.f108557c;
                ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
                for (SuggestedProductCarouselDecorator suggestedProductCarouselDecoratorV : list) {
                    if (Intrinsics.e(suggestedProductCarouselDecoratorV.getProduct().getCode(), abstractC17302a.getProductCode())) {
                        suggestedProductCarouselDecoratorV = SuggestedProductCarouselDecorator.v(suggestedProductCarouselDecoratorV, null, null, null, null, null, null, false, false, null, null, null, null, 0.0d, false, false, null, null, null, false, null, 1040383, null);
                    }
                    arrayList.add(suggestedProductCarouselDecoratorV);
                }
                interfaceC5730l0O.setValue(arrayList);
                return Unit.f142422a;
            }
        }

        public C12235b() {
        }

        private final String d(tk.c<EntryChange> entryChange) {
            Entry entry;
            ProductFullDetails productFullDetailsM;
            if (C12233e0.this.quantityChangeForFBT) {
                Iterator<SuggestedProductCarouselDecorator> it = C12233e0.this._viewState.O().getValue().iterator();
                int i10 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i10 = -1;
                        break;
                    }
                    String code = it.next().getProduct().getCode();
                    EntryChange entryChangeA = entryChange.a();
                    if (Intrinsics.e(code, (entryChangeA == null || (entry = entryChangeA.getEntry()) == null || (productFullDetailsM = entry.m()) == null) ? null : productFullDetailsM.getCode())) {
                        break;
                    }
                    i10++;
                }
                Integer numValueOf = Integer.valueOf(i10);
                if (numValueOf.intValue() < 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    return Integer.valueOf(numValueOf.intValue() + 1).toString();
                }
            }
            return null;
        }

        private final String e() {
            return C12233e0.this.quantityChangeForFBT ? "edaa - Frequently Bought Together" : "product details page";
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:62:0x014c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void f(tk.c<ej.EntryChange> r82) {
            /*
                Method dump skipped, instructions count: 714
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.C12235b.f(tk.c):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(TrackingData track) {
            Intrinsics.j(track, "$this$track");
            track.h("errorMessage", "add to cart error");
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit h(TrackingData track) {
            Intrinsics.j(track, "$this$track");
            track.h("errorMessage", "add to cart error");
            return Unit.f142422a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.util.UUID, kotlin.jvm.internal.DefaultConstructorMarker] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5 */
        private final void i(tk.c<EntryChange> entryChange) {
            Entry entry;
            ProductFullDetails productFullDetailsM;
            ProductFullDetails productFullDetailsM2;
            int i10 = 1;
            ProductSponsorship productSponsorshipA = 0;
            productSponsorshipA = 0;
            productSponsorshipA = 0;
            if (entryChange instanceof c.Failure) {
                C12233e0.this._viewState.J().add(new InterfaceC12238e.d.UpdateToCartFailed(productSponsorshipA, C17135b.f161993P0, i10, productSponsorshipA));
                return;
            }
            if (entryChange instanceof c.Success) {
                W.ComplexPromo complexPromoU1 = C12233e0.this.u1();
                c.Success success = (c.Success) entryChange;
                EntryChange entryChange2 = (EntryChange) success.a();
                if (entryChange2 != null) {
                    C12233e0 c12233e0 = C12233e0.this;
                    pp.d dVar = c12233e0.productMetadataStore;
                    Entry entry2 = entryChange2.getEntry();
                    boolean zC = dVar.c((entry2 == null || (productFullDetailsM2 = entry2.m()) == null) ? null : productFullDetailsM2.getCode());
                    int i11 = a.$EnumSwitchMapping$0[entryChange2.getStatusCode().ordinal()];
                    if (i11 != 1 && i11 != 2) {
                        if (i11 != 3) {
                            return;
                        }
                        c12233e0._viewState.J().add(new InterfaceC12238e.d.UpdateToCartFailed(productSponsorshipA, C17135b.f161993P0, i10, productSponsorshipA));
                    } else if (entryChange2.getExpectedQuantityChange() >= 0.0d) {
                        if (entryChange2.getExpectedQuantityChange() > 0.0d) {
                            c12233e0.analyticsEngine.e(C2930u.f1407a.Y(c12233e0.cartId, c12233e0.getCampaignIdValue(), entryChange2, d(entryChange), entryChange, c12233e0.sponsorshipsDataStore, e(), complexPromoU1, zC));
                        }
                    } else {
                        EntryChange entryChange3 = (EntryChange) success.a();
                        if (entryChange3 != null && (entry = entryChange3.getEntry()) != null && (productFullDetailsM = entry.m()) != null) {
                            productSponsorshipA = c12233e0.sponsorshipsDataStore.a(productFullDetailsM.getCode());
                        }
                        c12233e0.analyticsEngine.e(C2930u.f1407a.a0(c12233e0.cartId, entryChange2, zC, d(entryChange), productSponsorshipA, e()));
                    }
                }
            }
        }

        private final String k() {
            if (!C12233e0.this.getViewState().z().getValue().booleanValue() || C12233e0.this.getViewState().K().isEmpty()) {
                return null;
            }
            return CollectionsKt.B0(C12233e0.this.getViewState().K().entrySet(), "-", null, null, 0, null, new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.h0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C12233e0.C12235b.l((Map.Entry) obj);
                }
            }, 30, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence l(Map.Entry entry) {
            Intrinsics.j(entry, "<destruct>");
            return ((String) entry.getKey()) + ':' + ((String) entry.getValue());
        }

        @Override // wr.InterfaceC17847a
        /* renamed from: getDisposable */
        public Nu.a getDisposables() {
            return C12233e0.this.disposables;
        }

        @Override // wr.InterfaceC17847a
        public void observeCart(tk.c<ShoppingCart> cartResource) {
            if (Intrinsics.e(C12233e0.this._viewState.m().getValue().getId(), new ProductFullDetails(null, null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -1, 268435455, null))) {
                C16648k.d(androidx.view.d0.a(C12233e0.this), null, null, new c(C12233e0.this, null), 3, null);
            }
        }

        @Override // wr.InterfaceC17847a
        public void processedRequest(AbstractC17302a processedRequest, tk.c<EntryChange> entryChange) {
            Intrinsics.j(processedRequest, "processedRequest");
            Intrinsics.j(entryChange, "entryChange");
            if (entryChange instanceof c.Failure) {
                C12233e0.this.j2();
            } else if (entryChange instanceof c.Success) {
                C16648k.d(androidx.view.d0.a(C12233e0.this), null, null, new d(C12233e0.this, processedRequest, null), 3, null);
            }
            if (processedRequest instanceof AbstractC17302a.Add) {
                f(entryChange);
            } else if (processedRequest instanceof AbstractC17302a.Update) {
                i(entryChange);
            } else if (processedRequest instanceof AbstractC17302a.Remove) {
                j(entryChange);
            } else if (!Intrinsics.e(processedRequest, AbstractC17302a.b.f163256b)) {
                throw new NoWhenBranchMatchedException();
            }
            C12233e0.this.M2();
        }

        @Override // wr.InterfaceC17847a
        public <T> void throwChallenge(AbstractC17116a<AbstractC17604a, T> challenge) {
            Intrinsics.j(challenge, "challenge");
            if (!(challenge.f() instanceof AbstractC17604a.ChokingHazardChallenge)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC17604a abstractC17604aF = challenge.f();
            Intrinsics.h(abstractC17604aF, "null cannot be cast to non-null type com.meijer.mobile.ui.cart.challenges.CartChallenge.ChokingHazardChallenge");
            wr.f.B(C12233e0.this.cartInteractor, new AbstractC17116a.Accept(((AbstractC17604a.ChokingHazardChallenge) abstractC17604aF).a().b(), null, null, 4, null), false, null, 6, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.util.UUID, kotlin.jvm.internal.DefaultConstructorMarker] */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5 */
        private final void j(tk.c<EntryChange> changeRes) {
            ProductSponsorship productSponsorshipA;
            Entry entry;
            ProductFullDetails productFullDetailsM;
            Entry entry2;
            ProductFullDetails productFullDetailsM2;
            EntryChange entryChangeA = changeRes.a();
            int i10 = 1;
            String code = 0;
            code = 0;
            code = 0;
            if (entryChangeA != null && entryChangeA.h()) {
                EntryChange entryChangeA2 = changeRes.a();
                if (entryChangeA2 != null && (entry2 = entryChangeA2.getEntry()) != null && (productFullDetailsM2 = entry2.m()) != null) {
                    productSponsorshipA = C12233e0.this.sponsorshipsDataStore.a(productFullDetailsM2.getCode());
                } else {
                    productSponsorshipA = null;
                }
                InterfaceC14261a interfaceC14261a = C12233e0.this.analyticsEngine;
                C2930u c2930u = C2930u.f1407a;
                String str = C12233e0.this.cartId;
                pp.d dVar = C12233e0.this.productMetadataStore;
                EntryChange entryChangeA3 = changeRes.a();
                if (entryChangeA3 != null && (entry = entryChangeA3.getEntry()) != null && (productFullDetailsM = entry.m()) != null) {
                    code = productFullDetailsM.getCode();
                }
                interfaceC14261a.e(c2930u.c0(str, dVar.c(code), changeRes.a(), d(changeRes), productSponsorshipA, e()));
                return;
            }
            C12233e0.this._viewState.J().add(new InterfaceC12238e.d.UpdateToCartFailed(code, C17135b.f161993P0, i10, code));
        }
    }

    @Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0010R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0010R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0010R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0010R \u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\b0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0010R \u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\b0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0010R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0010R \u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\b0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0010R&\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000204030\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0010R \u00109\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000204038&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R&\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000204030\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0010R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020<0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0010R\u0014\u0010B\u001a\u00020?8&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u0010R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u0010R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u0010R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010\u0010R\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u0010R\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010\u0010R\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010\u0010R\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u0010R\u001c\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010S0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bT\u0010\u0010R\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020V0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bW\u0010\u0010R\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020Y0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\\À\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$d;", "", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "", "I", "()Lkotlin/jvm/functions/Function1;", "onUpdate", "", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;", "J", "()Ljava/util/List;", "effectsInMotion", "Landroidx/compose/runtime/z1;", "", "y", "()Landroidx/compose/runtime/z1;", "isLoadingVisible", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a;", "G", "bottomActionBarState", "LCo/h;", "w", "domain", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/h1;", "m", "product", "Lvs/m;", "l", "price", "LKp/c;", "F", "reviews", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/m1;", "P", "storeLocation", "Lvs/l;", "A", "nutritionLabel", "LXr/c;", "a", "coupons", "Lcom/meijer/mobile/meijer/activity/find/productdetail/o2;", "O", "frequentlyBoughtTogether", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/w;", "T", "complexPromo", "Lbn/j;", "D", "productVariants", "", "", "S", "initialSelectedVariants", "K", "()Ljava/util/Map;", "allInteractedVariants", "E", "selectedVariant", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/v;", "Q", "cartEntry", "Landroidx/compose/runtime/Q;", "N", "()Landroidx/compose/runtime/Q;", "cartItemCount", "H", "isOnShoppingList", "L", "isOnFavoritesList", "z", "isVariantInteracted", "o", "isEligibleForCart", "B", "isBuyAgain", "x", "isLowStock", "n", "isOutOfStock", "C", "isInStoreOnly", "Lfi/d;", "R", "googleAdData", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/b;", "M", "criteoBeaconTracker", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/r;", "U", "frequentlyBoughtTogetherProductsLoadingStatus", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$d, reason: case insensitive filesystem */
    public interface InterfaceC12237d {
        androidx.compose.runtime.z1<ProductNutritionLabelDecorator> A();

        androidx.compose.runtime.z1<Boolean> B();

        androidx.compose.runtime.z1<Boolean> C();

        androidx.compose.runtime.z1<List<ProductVariantGroupDecorator>> D();

        androidx.compose.runtime.z1<Map<String, String>> E();

        androidx.compose.runtime.z1<ProductReviewFullDetails> F();

        androidx.compose.runtime.z1<InterfaceC12234a> G();

        androidx.compose.runtime.z1<Boolean> H();

        Function1<InterfaceC12239f, Unit> I();

        List<InterfaceC12238e> J();

        Map<String, String> K();

        androidx.compose.runtime.z1<Boolean> L();

        androidx.compose.runtime.z1<C12203b> M();

        androidx.compose.runtime.Q N();

        androidx.compose.runtime.z1<List<SuggestedProductCarouselDecorator>> O();

        androidx.compose.runtime.z1<ProductStoreLocationDecorator> P();

        androidx.compose.runtime.z1<ProductCartEntryDecorator> Q();

        androidx.compose.runtime.z1<GoogleAdData> R();

        androidx.compose.runtime.z1<Map<String, String>> S();

        androidx.compose.runtime.z1<ProductComplexPromoDecorator> T();

        androidx.compose.runtime.z1<com.meijer.mobile.meijer.activity.find.viewmodel.r> U();

        androidx.compose.runtime.z1<List<CouponListItemDecorator>> a();

        androidx.compose.runtime.z1<ProductPriceDecorator> l();

        androidx.compose.runtime.z1<ProductDetailsDecorator> m();

        androidx.compose.runtime.z1<Boolean> n();

        androidx.compose.runtime.z1<Boolean> o();

        androidx.compose.runtime.z1<ProductFullDetails> w();

        androidx.compose.runtime.z1<Boolean> x();

        androidx.compose.runtime.z1<Boolean> y();

        androidx.compose.runtime.z1<Boolean> z();
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;", "", "b", "e", "a", "c", "g", "f", "d", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$b;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$c;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$e;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$f;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$g;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e, reason: case insensitive filesystem */
    public interface InterfaceC12238e {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;", "Ljava/util/UUID;", "uuid", "", "shouldRefresh", "<init>", "(Ljava/util/UUID;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "b", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$a, reason: from toString */
        public static final /* data */ class RefreshCartOnListPageEvent implements InterfaceC12238e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final UUID uuid;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean shouldRefresh;

            public RefreshCartOnListPageEvent(UUID uuid, boolean z10) {
                Intrinsics.j(uuid, "uuid");
                this.uuid = uuid;
                this.shouldRefresh = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RefreshCartOnListPageEvent)) {
                    return false;
                }
                RefreshCartOnListPageEvent refreshCartOnListPageEvent = (RefreshCartOnListPageEvent) other;
                return Intrinsics.e(this.uuid, refreshCartOnListPageEvent.uuid) && this.shouldRefresh == refreshCartOnListPageEvent.shouldRefresh;
            }

            public int hashCode() {
                return (this.uuid.hashCode() * 31) + Boolean.hashCode(this.shouldRefresh);
            }

            public String toString() {
                return "RefreshCartOnListPageEvent(uuid=" + this.uuid + ", shouldRefresh=" + this.shouldRefresh + ')';
            }

            /* renamed from: a, reason: from getter */
            public final boolean getShouldRefresh() {
                return this.shouldRefresh;
            }

            public /* synthetic */ RefreshCartOnListPageEvent(UUID uuid, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? UUID.randomUUID() : uuid, z10);
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$b;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;", "Ljava/util/UUID;", "uuid", "", "messageResId", "<init>", "(Ljava/util/UUID;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "b", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$b, reason: from toString */
        public static final /* data */ class RequireLogin implements InterfaceC12238e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final UUID uuid;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            public RequireLogin(UUID uuid, int i10) {
                Intrinsics.j(uuid, "uuid");
                this.uuid = uuid;
                this.messageResId = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RequireLogin)) {
                    return false;
                }
                RequireLogin requireLogin = (RequireLogin) other;
                return Intrinsics.e(this.uuid, requireLogin.uuid) && this.messageResId == requireLogin.messageResId;
            }

            public int hashCode() {
                return (this.uuid.hashCode() * 31) + Integer.hashCode(this.messageResId);
            }

            public String toString() {
                return "RequireLogin(uuid=" + this.uuid + ", messageResId=" + this.messageResId + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }

            public /* synthetic */ RequireLogin(UUID uuid, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? UUID.randomUUID() : uuid, i10);
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001c\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001f¨\u0006 "}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$c;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;", "Ljava/util/UUID;", "uuid", "", "title", "message", "positiveButtonText", "negativeButtonText", "<init>", "(Ljava/util/UUID;IIILjava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "b", "I", "d", "c", "e", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$c, reason: from toString */
        public static final /* data */ class ShowError implements InterfaceC12238e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final UUID uuid;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int title;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int message;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final int positiveButtonText;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Integer negativeButtonText;

            public ShowError(UUID uuid, int i10, int i11, int i12, Integer num) {
                Intrinsics.j(uuid, "uuid");
                this.uuid = uuid;
                this.title = i10;
                this.message = i11;
                this.positiveButtonText = i12;
                this.negativeButtonText = num;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShowError)) {
                    return false;
                }
                ShowError showError = (ShowError) other;
                return Intrinsics.e(this.uuid, showError.uuid) && this.title == showError.title && this.message == showError.message && this.positiveButtonText == showError.positiveButtonText && Intrinsics.e(this.negativeButtonText, showError.negativeButtonText);
            }

            public int hashCode() {
                int iHashCode = ((((((this.uuid.hashCode() * 31) + Integer.hashCode(this.title)) * 31) + Integer.hashCode(this.message)) * 31) + Integer.hashCode(this.positiveButtonText)) * 31;
                Integer num = this.negativeButtonText;
                return iHashCode + (num == null ? 0 : num.hashCode());
            }

            public String toString() {
                return "ShowError(uuid=" + this.uuid + ", title=" + this.title + ", message=" + this.message + ", positiveButtonText=" + this.positiveButtonText + ", negativeButtonText=" + this.negativeButtonText + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getMessage() {
                return this.message;
            }

            /* renamed from: b, reason: from getter */
            public final Integer getNegativeButtonText() {
                return this.negativeButtonText;
            }

            /* renamed from: c, reason: from getter */
            public final int getPositiveButtonText() {
                return this.positiveButtonText;
            }

            /* renamed from: d, reason: from getter */
            public final int getTitle() {
                return this.title;
            }

            public /* synthetic */ ShowError(UUID uuid, int i10, int i11, int i12, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this((i13 & 1) != 0 ? UUID.randomUUID() : uuid, i10, i11, i12, num);
            }
        }

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;", "g", "i", "d", "a", "m", "c", "b", "e", "f", "h", "l", "j", "k", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$b;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$c;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$d;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$e;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$f;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$g;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$h;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$i;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$j;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$k;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$l;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$m;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d */
        public interface d extends InterfaceC12238e {

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0015\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "Ljava/util/UUID;", "uuid", "", "messageResId", "actionResId", "Lej/i;", "entry", "<init>", "(Ljava/util/UUID;IILej/i;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "b", "I", "c", "d", "Lej/i;", "()Lej/i;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$a, reason: from toString */
            public static final /* data */ class AddToCartSuccess implements d {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final UUID uuid;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final int messageResId;

                /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final int actionResId;

                /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                private final Entry entry;

                public AddToCartSuccess(UUID uuid, int i10, int i11, Entry entry) {
                    Intrinsics.j(uuid, "uuid");
                    this.uuid = uuid;
                    this.messageResId = i10;
                    this.actionResId = i11;
                    this.entry = entry;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof AddToCartSuccess)) {
                        return false;
                    }
                    AddToCartSuccess addToCartSuccess = (AddToCartSuccess) other;
                    return Intrinsics.e(this.uuid, addToCartSuccess.uuid) && this.messageResId == addToCartSuccess.messageResId && this.actionResId == addToCartSuccess.actionResId && Intrinsics.e(this.entry, addToCartSuccess.entry);
                }

                public int hashCode() {
                    int iHashCode = ((((this.uuid.hashCode() * 31) + Integer.hashCode(this.messageResId)) * 31) + Integer.hashCode(this.actionResId)) * 31;
                    Entry entry = this.entry;
                    return iHashCode + (entry == null ? 0 : entry.hashCode());
                }

                public String toString() {
                    return "AddToCartSuccess(uuid=" + this.uuid + ", messageResId=" + this.messageResId + ", actionResId=" + this.actionResId + ", entry=" + this.entry + ')';
                }

                /* renamed from: a, reason: from getter */
                public final int getActionResId() {
                    return this.actionResId;
                }

                /* renamed from: b, reason: from getter */
                public final Entry getEntry() {
                    return this.entry;
                }

                /* renamed from: c, reason: from getter */
                public final int getMessageResId() {
                    return this.messageResId;
                }

                public /* synthetic */ AddToCartSuccess(UUID uuid, int i10, int i11, Entry entry, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i12 & 1) != 0 ? UUID.randomUUID() : uuid, i10, i11, (i12 & 8) != 0 ? null : entry);
                }
            }

            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$b;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "Ljava/util/UUID;", "uuid", "", "message", "<init>", "(Ljava/util/UUID;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "b", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$b, reason: from toString */
            public static final /* data */ class BazaarVoiceFeedbackAttemptWithoutLogin implements d {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final UUID uuid;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final int message;

                public BazaarVoiceFeedbackAttemptWithoutLogin(UUID uuid, int i10) {
                    Intrinsics.j(uuid, "uuid");
                    this.uuid = uuid;
                    this.message = i10;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof BazaarVoiceFeedbackAttemptWithoutLogin)) {
                        return false;
                    }
                    BazaarVoiceFeedbackAttemptWithoutLogin bazaarVoiceFeedbackAttemptWithoutLogin = (BazaarVoiceFeedbackAttemptWithoutLogin) other;
                    return Intrinsics.e(this.uuid, bazaarVoiceFeedbackAttemptWithoutLogin.uuid) && this.message == bazaarVoiceFeedbackAttemptWithoutLogin.message;
                }

                public int hashCode() {
                    return (this.uuid.hashCode() * 31) + Integer.hashCode(this.message);
                }

                public String toString() {
                    return "BazaarVoiceFeedbackAttemptWithoutLogin(uuid=" + this.uuid + ", message=" + this.message + ')';
                }

                /* renamed from: a, reason: from getter */
                public final int getMessage() {
                    return this.message;
                }

                public /* synthetic */ BazaarVoiceFeedbackAttemptWithoutLogin(UUID uuid, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i11 & 1) != 0 ? UUID.randomUUID() : uuid, i10);
                }
            }

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$c;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "Ljava/util/UUID;", "uuid", "LKp/a;", "feedbackVote", "<init>", "(Ljava/util/UUID;LKp/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "b", "LKp/a;", "()LKp/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$c, reason: from toString */
            public static final /* data */ class BazaarVoiceFeedbackSubmitted implements d {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final UUID uuid;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final Kp.a feedbackVote;

                public BazaarVoiceFeedbackSubmitted(UUID uuid, Kp.a feedbackVote) {
                    Intrinsics.j(uuid, "uuid");
                    Intrinsics.j(feedbackVote, "feedbackVote");
                    this.uuid = uuid;
                    this.feedbackVote = feedbackVote;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof BazaarVoiceFeedbackSubmitted)) {
                        return false;
                    }
                    BazaarVoiceFeedbackSubmitted bazaarVoiceFeedbackSubmitted = (BazaarVoiceFeedbackSubmitted) other;
                    return Intrinsics.e(this.uuid, bazaarVoiceFeedbackSubmitted.uuid) && this.feedbackVote == bazaarVoiceFeedbackSubmitted.feedbackVote;
                }

                public int hashCode() {
                    return (this.uuid.hashCode() * 31) + this.feedbackVote.hashCode();
                }

                public String toString() {
                    return "BazaarVoiceFeedbackSubmitted(uuid=" + this.uuid + ", feedbackVote=" + this.feedbackVote + ')';
                }

                /* renamed from: a, reason: from getter */
                public final Kp.a getFeedbackVote() {
                    return this.feedbackVote;
                }

                public /* synthetic */ BazaarVoiceFeedbackSubmitted(UUID uuid, Kp.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? UUID.randomUUID() : uuid, aVar);
                }
            }

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$d;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "Ljava/util/UUID;", "uuid", "Lmk/c;", "product", "<init>", "(Ljava/util/UUID;Lmk/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "b", "Lmk/c;", "()Lmk/c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$d, reason: collision with other inner class name and from toString */
            public static final /* data */ class FavoriteListItemAdded implements d {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final UUID uuid;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final mk.c product;

                public FavoriteListItemAdded(UUID uuid, mk.c product) {
                    Intrinsics.j(uuid, "uuid");
                    Intrinsics.j(product, "product");
                    this.uuid = uuid;
                    this.product = product;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof FavoriteListItemAdded)) {
                        return false;
                    }
                    FavoriteListItemAdded favoriteListItemAdded = (FavoriteListItemAdded) other;
                    return Intrinsics.e(this.uuid, favoriteListItemAdded.uuid) && Intrinsics.e(this.product, favoriteListItemAdded.product);
                }

                public int hashCode() {
                    return (this.uuid.hashCode() * 31) + this.product.hashCode();
                }

                public String toString() {
                    return "FavoriteListItemAdded(uuid=" + this.uuid + ", product=" + this.product + ')';
                }

                /* renamed from: a, reason: from getter */
                public final mk.c getProduct() {
                    return this.product;
                }

                public /* synthetic */ FavoriteListItemAdded(UUID uuid, mk.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? UUID.randomUUID() : uuid, cVar);
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$e;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "Ljava/util/UUID;", "uuid", "<init>", "(Ljava/util/UUID;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$e, reason: collision with other inner class name and from toString */
            public static final /* data */ class ProductAddedWithBackup implements d {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final UUID uuid;

                /* JADX WARN: Multi-variable type inference failed */
                public ProductAddedWithBackup() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ProductAddedWithBackup) && Intrinsics.e(this.uuid, ((ProductAddedWithBackup) other).uuid);
                }

                public int hashCode() {
                    return this.uuid.hashCode();
                }

                public String toString() {
                    return "ProductAddedWithBackup(uuid=" + this.uuid + ')';
                }

                public ProductAddedWithBackup(UUID uuid) {
                    Intrinsics.j(uuid, "uuid");
                    this.uuid = uuid;
                }

                public /* synthetic */ ProductAddedWithBackup(UUID uuid, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? UUID.randomUUID() : uuid);
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$f;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "Ljava/util/UUID;", "uuid", "<init>", "(Ljava/util/UUID;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$f, reason: from toString */
            public static final /* data */ class ProductAddedWithoutBackup implements d {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final UUID uuid;

                /* JADX WARN: Multi-variable type inference failed */
                public ProductAddedWithoutBackup() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ProductAddedWithoutBackup) && Intrinsics.e(this.uuid, ((ProductAddedWithoutBackup) other).uuid);
                }

                public int hashCode() {
                    return this.uuid.hashCode();
                }

                public String toString() {
                    return "ProductAddedWithoutBackup(uuid=" + this.uuid + ')';
                }

                public ProductAddedWithoutBackup(UUID uuid) {
                    Intrinsics.j(uuid, "uuid");
                    this.uuid = uuid;
                }

                public /* synthetic */ ProductAddedWithoutBackup(UUID uuid, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? UUID.randomUUID() : uuid);
                }
            }

            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$g;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "uuid", "Lmk/f;", "b", "Lmk/f;", "()Lmk/f;", "product", "c", "I", "messageResId", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$g, reason: from toString */
            public static final /* data */ class ProductLoadError implements d {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final UUID uuid;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final mk.f product;

                /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final int messageResId;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ProductLoadError)) {
                        return false;
                    }
                    ProductLoadError productLoadError = (ProductLoadError) other;
                    return Intrinsics.e(this.uuid, productLoadError.uuid) && Intrinsics.e(this.product, productLoadError.product) && this.messageResId == productLoadError.messageResId;
                }

                public int hashCode() {
                    return (((this.uuid.hashCode() * 31) + this.product.hashCode()) * 31) + Integer.hashCode(this.messageResId);
                }

                public String toString() {
                    return "ProductLoadError(uuid=" + this.uuid + ", product=" + this.product + ", messageResId=" + this.messageResId + ')';
                }

                /* renamed from: a, reason: from getter */
                public final int getMessageResId() {
                    return this.messageResId;
                }

                /* renamed from: b, reason: from getter */
                public final mk.f getProduct() {
                    return this.product;
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$h;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "Ljava/util/UUID;", "uuid", "<init>", "(Ljava/util/UUID;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$h, reason: from toString */
            public static final /* data */ class ReviewSubmittedSuccess implements d {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final UUID uuid;

                /* JADX WARN: Multi-variable type inference failed */
                public ReviewSubmittedSuccess() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ReviewSubmittedSuccess) && Intrinsics.e(this.uuid, ((ReviewSubmittedSuccess) other).uuid);
                }

                public int hashCode() {
                    return this.uuid.hashCode();
                }

                public String toString() {
                    return "ReviewSubmittedSuccess(uuid=" + this.uuid + ')';
                }

                public ReviewSubmittedSuccess(UUID uuid) {
                    Intrinsics.j(uuid, "uuid");
                    this.uuid = uuid;
                }

                public /* synthetic */ ReviewSubmittedSuccess(UUID uuid, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? UUID.randomUUID() : uuid);
                }
            }

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$i;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "Ljava/util/UUID;", "uuid", "Lmk/c;", "product", "<init>", "(Ljava/util/UUID;Lmk/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "b", "Lmk/c;", "()Lmk/c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$i, reason: from toString */
            public static final /* data */ class ShoppingListItemAdded implements d {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final UUID uuid;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final mk.c product;

                public ShoppingListItemAdded(UUID uuid, mk.c product) {
                    Intrinsics.j(uuid, "uuid");
                    Intrinsics.j(product, "product");
                    this.uuid = uuid;
                    this.product = product;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ShoppingListItemAdded)) {
                        return false;
                    }
                    ShoppingListItemAdded shoppingListItemAdded = (ShoppingListItemAdded) other;
                    return Intrinsics.e(this.uuid, shoppingListItemAdded.uuid) && Intrinsics.e(this.product, shoppingListItemAdded.product);
                }

                public int hashCode() {
                    return (this.uuid.hashCode() * 31) + this.product.hashCode();
                }

                public String toString() {
                    return "ShoppingListItemAdded(uuid=" + this.uuid + ", product=" + this.product + ')';
                }

                /* renamed from: a, reason: from getter */
                public final mk.c getProduct() {
                    return this.product;
                }

                public /* synthetic */ ShoppingListItemAdded(UUID uuid, mk.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? UUID.randomUUID() : uuid, cVar);
                }
            }

            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$j;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "Ljava/util/UUID;", "uuid", "", "titleResId", "LOk/a;", "coupon", "<init>", "(Ljava/util/UUID;ILOk/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "b", "I", "c", "LOk/a;", "()LOk/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$j, reason: from toString */
            public static final /* data */ class ShowClipCouponError implements d {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final UUID uuid;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final int titleResId;

                /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final Coupon coupon;

                public ShowClipCouponError(UUID uuid, int i10, Coupon coupon) {
                    Intrinsics.j(uuid, "uuid");
                    Intrinsics.j(coupon, "coupon");
                    this.uuid = uuid;
                    this.titleResId = i10;
                    this.coupon = coupon;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ShowClipCouponError)) {
                        return false;
                    }
                    ShowClipCouponError showClipCouponError = (ShowClipCouponError) other;
                    return Intrinsics.e(this.uuid, showClipCouponError.uuid) && this.titleResId == showClipCouponError.titleResId && Intrinsics.e(this.coupon, showClipCouponError.coupon);
                }

                public int hashCode() {
                    return (((this.uuid.hashCode() * 31) + Integer.hashCode(this.titleResId)) * 31) + this.coupon.hashCode();
                }

                public String toString() {
                    return "ShowClipCouponError(uuid=" + this.uuid + ", titleResId=" + this.titleResId + ", coupon=" + this.coupon + ')';
                }

                /* renamed from: a, reason: from getter */
                public final Coupon getCoupon() {
                    return this.coupon;
                }

                /* renamed from: b, reason: from getter */
                public final int getTitleResId() {
                    return this.titleResId;
                }

                public /* synthetic */ ShowClipCouponError(UUID uuid, int i10, Coupon coupon, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i11 & 1) != 0 ? UUID.randomUUID() : uuid, i10, coupon);
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$k;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "Ljava/util/UUID;", "uuid", "<init>", "(Ljava/util/UUID;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$k, reason: from toString */
            public static final /* data */ class ShowClipLimitReached implements d {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final UUID uuid;

                /* JADX WARN: Multi-variable type inference failed */
                public ShowClipLimitReached() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ShowClipLimitReached) && Intrinsics.e(this.uuid, ((ShowClipLimitReached) other).uuid);
                }

                public int hashCode() {
                    return this.uuid.hashCode();
                }

                public String toString() {
                    return "ShowClipLimitReached(uuid=" + this.uuid + ')';
                }

                public ShowClipLimitReached(UUID uuid) {
                    Intrinsics.j(uuid, "uuid");
                    this.uuid = uuid;
                }

                public /* synthetic */ ShowClipLimitReached(UUID uuid, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? UUID.randomUUID() : uuid);
                }
            }

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$l;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "Ljava/util/UUID;", "uuid", "LOk/a;", "coupon", "<init>", "(Ljava/util/UUID;LOk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "b", "LOk/a;", "()LOk/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$l, reason: from toString */
            public static final /* data */ class ShowCouponClipped implements d {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final UUID uuid;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final Coupon coupon;

                public ShowCouponClipped(UUID uuid, Coupon coupon) {
                    Intrinsics.j(uuid, "uuid");
                    Intrinsics.j(coupon, "coupon");
                    this.uuid = uuid;
                    this.coupon = coupon;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ShowCouponClipped)) {
                        return false;
                    }
                    ShowCouponClipped showCouponClipped = (ShowCouponClipped) other;
                    return Intrinsics.e(this.uuid, showCouponClipped.uuid) && Intrinsics.e(this.coupon, showCouponClipped.coupon);
                }

                public int hashCode() {
                    return (this.uuid.hashCode() * 31) + this.coupon.hashCode();
                }

                public String toString() {
                    return "ShowCouponClipped(uuid=" + this.uuid + ", coupon=" + this.coupon + ')';
                }

                /* renamed from: a, reason: from getter */
                public final Coupon getCoupon() {
                    return this.coupon;
                }

                public /* synthetic */ ShowCouponClipped(UUID uuid, Coupon coupon, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? UUID.randomUUID() : uuid, coupon);
                }
            }

            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$m;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "Ljava/util/UUID;", "uuid", "", "messageResId", "<init>", "(Ljava/util/UUID;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "b", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$m, reason: from toString */
            public static final /* data */ class UpdateToCartFailed implements d {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final UUID uuid;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final int messageResId;

                public UpdateToCartFailed(UUID uuid, int i10) {
                    Intrinsics.j(uuid, "uuid");
                    this.uuid = uuid;
                    this.messageResId = i10;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof UpdateToCartFailed)) {
                        return false;
                    }
                    UpdateToCartFailed updateToCartFailed = (UpdateToCartFailed) other;
                    return Intrinsics.e(this.uuid, updateToCartFailed.uuid) && this.messageResId == updateToCartFailed.messageResId;
                }

                public int hashCode() {
                    return (this.uuid.hashCode() * 31) + Integer.hashCode(this.messageResId);
                }

                public String toString() {
                    return "UpdateToCartFailed(uuid=" + this.uuid + ", messageResId=" + this.messageResId + ')';
                }

                /* renamed from: a, reason: from getter */
                public final int getMessageResId() {
                    return this.messageResId;
                }

                public /* synthetic */ UpdateToCartFailed(UUID uuid, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i11 & 1) != 0 ? UUID.randomUUID() : uuid, i10);
                }
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$e;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;", "Ljava/util/UUID;", "uuid", "", "messageResId", "titleResId", "<init>", "(Ljava/util/UUID;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "b", "I", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$e, reason: collision with other inner class name and from toString */
        public static final /* data */ class UpdateShoppingOrFavoriteListFailed implements InterfaceC12238e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final UUID uuid;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int titleResId;

            public UpdateShoppingOrFavoriteListFailed(UUID uuid, int i10, int i11) {
                Intrinsics.j(uuid, "uuid");
                this.uuid = uuid;
                this.messageResId = i10;
                this.titleResId = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateShoppingOrFavoriteListFailed)) {
                    return false;
                }
                UpdateShoppingOrFavoriteListFailed updateShoppingOrFavoriteListFailed = (UpdateShoppingOrFavoriteListFailed) other;
                return Intrinsics.e(this.uuid, updateShoppingOrFavoriteListFailed.uuid) && this.messageResId == updateShoppingOrFavoriteListFailed.messageResId && this.titleResId == updateShoppingOrFavoriteListFailed.titleResId;
            }

            public int hashCode() {
                return (((this.uuid.hashCode() * 31) + Integer.hashCode(this.messageResId)) * 31) + Integer.hashCode(this.titleResId);
            }

            public String toString() {
                return "UpdateShoppingOrFavoriteListFailed(uuid=" + this.uuid + ", messageResId=" + this.messageResId + ", titleResId=" + this.titleResId + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }

            /* renamed from: b, reason: from getter */
            public final int getTitleResId() {
                return this.titleResId;
            }

            public /* synthetic */ UpdateShoppingOrFavoriteListFailed(UUID uuid, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this((i12 & 1) != 0 ? UUID.randomUUID() : uuid, i10, i11);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$f;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;", "Ljava/util/UUID;", "uuid", "Lmk/f;", "product", "<init>", "(Ljava/util/UUID;Lmk/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "b", "Lmk/f;", "()Lmk/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$f, reason: from toString */
        public static final /* data */ class ViewOnFavoriteList implements InterfaceC12238e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final UUID uuid;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final mk.f product;

            public ViewOnFavoriteList(UUID uuid, mk.f product) {
                Intrinsics.j(uuid, "uuid");
                Intrinsics.j(product, "product");
                this.uuid = uuid;
                this.product = product;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ViewOnFavoriteList)) {
                    return false;
                }
                ViewOnFavoriteList viewOnFavoriteList = (ViewOnFavoriteList) other;
                return Intrinsics.e(this.uuid, viewOnFavoriteList.uuid) && Intrinsics.e(this.product, viewOnFavoriteList.product);
            }

            public int hashCode() {
                return (this.uuid.hashCode() * 31) + this.product.hashCode();
            }

            public String toString() {
                return "ViewOnFavoriteList(uuid=" + this.uuid + ", product=" + this.product + ')';
            }

            /* renamed from: a, reason: from getter */
            public final mk.f getProduct() {
                return this.product;
            }

            public /* synthetic */ ViewOnFavoriteList(UUID uuid, mk.f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? UUID.randomUUID() : uuid, fVar);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$g;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;", "Ljava/util/UUID;", "uuid", "Lmk/f;", "product", "<init>", "(Ljava/util/UUID;Lmk/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "b", "Lmk/f;", "()Lmk/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$g, reason: from toString */
        public static final /* data */ class ViewOnShoppingList implements InterfaceC12238e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final UUID uuid;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final mk.f product;

            public ViewOnShoppingList(UUID uuid, mk.f product) {
                Intrinsics.j(uuid, "uuid");
                Intrinsics.j(product, "product");
                this.uuid = uuid;
                this.product = product;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ViewOnShoppingList)) {
                    return false;
                }
                ViewOnShoppingList viewOnShoppingList = (ViewOnShoppingList) other;
                return Intrinsics.e(this.uuid, viewOnShoppingList.uuid) && Intrinsics.e(this.product, viewOnShoppingList.product);
            }

            public int hashCode() {
                return (this.uuid.hashCode() * 31) + this.product.hashCode();
            }

            public String toString() {
                return "ViewOnShoppingList(uuid=" + this.uuid + ", product=" + this.product + ')';
            }

            /* renamed from: a, reason: from getter */
            public final mk.f getProduct() {
                return this.product;
            }

            public /* synthetic */ ViewOnShoppingList(UUID uuid, mk.f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? UUID.randomUUID() : uuid, fVar);
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "", "l", "j", "c", "g", "a", "h", "f", "k", "d", "i", "e", "b", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$b;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$c;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$d;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$e;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$f;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$g;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$h;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$i;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$j;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$k;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$l;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$f, reason: case insensitive filesystem */
    public interface InterfaceC12239f {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "LPk/a;", "action", "<init>", "(LPk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LPk/a;", "()LPk/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$f$a, reason: from toString */
        public static final /* data */ class Coupon implements InterfaceC12239f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Pk.a action;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Coupon) && Intrinsics.e(this.action, ((Coupon) other).action);
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            public String toString() {
                return "Coupon(action=" + this.action + ')';
            }

            public Coupon(Pk.a action) {
                Intrinsics.j(action, "action");
                this.action = action;
            }

            /* renamed from: a, reason: from getter */
            public final Pk.a getAction() {
                return this.action;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$b;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;", "event", "<init>", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;", "()Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$f$b, reason: from toString */
        public static final /* data */ class DisposeEffect implements InterfaceC12239f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final InterfaceC12238e event;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DisposeEffect) && Intrinsics.e(this.event, ((DisposeEffect) other).event);
            }

            public int hashCode() {
                return this.event.hashCode();
            }

            public String toString() {
                return "DisposeEffect(event=" + this.event + ')';
            }

            public DisposeEffect(InterfaceC12238e event) {
                Intrinsics.j(event, "event");
                this.event = event;
            }

            /* renamed from: a, reason: from getter */
            public final InterfaceC12238e getEvent() {
                return this.event;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$c;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "Lkk/a;", "action", "<init>", "(Lkk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkk/a;", "()Lkk/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$f$c, reason: from toString */
        public static final /* data */ class FavoritesList implements InterfaceC12239f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC15172a action;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FavoritesList) && Intrinsics.e(this.action, ((FavoritesList) other).action);
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            public String toString() {
                return "FavoritesList(action=" + this.action + ')';
            }

            public FavoritesList(AbstractC15172a action) {
                Intrinsics.j(action, "action");
                this.action = action;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC15172a getAction() {
                return this.action;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$d;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmk/f;", "a", "Lmk/f;", "()Lmk/f;", "productIdentity", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$f$d, reason: from toString */
        public static final /* data */ class GetFrequentlyBoughtTogetherProducts implements InterfaceC12239f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final mk.f productIdentity;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GetFrequentlyBoughtTogetherProducts) && Intrinsics.e(this.productIdentity, ((GetFrequentlyBoughtTogetherProducts) other).productIdentity);
            }

            public int hashCode() {
                return this.productIdentity.hashCode();
            }

            public String toString() {
                return "GetFrequentlyBoughtTogetherProducts(productIdentity=" + this.productIdentity + ')';
            }

            /* renamed from: a, reason: from getter */
            public final mk.f getProductIdentity() {
                return this.productIdentity;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$e;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "Lfi/a;", "analytics", "<init>", "(Lfi/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfi/a;", "()Lfi/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$f$e, reason: from toString */
        public static final /* data */ class GoogleAdClicked implements InterfaceC12239f {

            /* renamed from: b, reason: collision with root package name */
            public static final int f108604b = GoogleAdAnalytics.f131141f;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final GoogleAdAnalytics analytics;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GoogleAdClicked) && Intrinsics.e(this.analytics, ((GoogleAdClicked) other).analytics);
            }

            public int hashCode() {
                return this.analytics.hashCode();
            }

            public String toString() {
                return "GoogleAdClicked(analytics=" + this.analytics + ')';
            }

            public GoogleAdClicked(GoogleAdAnalytics analytics) {
                Intrinsics.j(analytics, "analytics");
                this.analytics = analytics;
            }

            /* renamed from: a, reason: from getter */
            public final GoogleAdAnalytics getAnalytics() {
                return this.analytics;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$f;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "", "isFromCLP", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$f$f, reason: collision with other inner class name and from toString */
        public static final /* data */ class IsFromCLP implements InterfaceC12239f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isFromCLP;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof IsFromCLP) && this.isFromCLP == ((IsFromCLP) other).isFromCLP;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isFromCLP);
            }

            public String toString() {
                return "IsFromCLP(isFromCLP=" + this.isFromCLP + ')';
            }

            /* renamed from: a, reason: from getter */
            public final boolean getIsFromCLP() {
                return this.isFromCLP;
            }

            public IsFromCLP(boolean z10) {
                this.isFromCLP = z10;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$g;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2;", "action", "<init>", "(Lcom/meijer/mobile/meijer/activity/find/productdetail/a2;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2;", "()Lcom/meijer/mobile/meijer/activity/find/productdetail/a2;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$f$g, reason: from toString */
        public static final /* data */ class ProductReview implements InterfaceC12239f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final a2 action;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ProductReview) && Intrinsics.e(this.action, ((ProductReview) other).action);
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            public String toString() {
                return "ProductReview(action=" + this.action + ')';
            }

            public ProductReview(a2 action) {
                Intrinsics.j(action, "action");
                this.action = action;
            }

            /* renamed from: a, reason: from getter */
            public final a2 getAction() {
                return this.action;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$h;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/n2;", "action", "<init>", "(Lcom/meijer/mobile/meijer/activity/find/productdetail/n2;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/find/productdetail/n2;", "()Lcom/meijer/mobile/meijer/activity/find/productdetail/n2;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$f$h, reason: from toString */
        public static final /* data */ class Reload implements InterfaceC12239f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final n2 action;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Reload) && Intrinsics.e(this.action, ((Reload) other).action);
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            public String toString() {
                return "Reload(action=" + this.action + ')';
            }

            public Reload(n2 action) {
                Intrinsics.j(action, "action");
                this.action = action;
            }

            /* renamed from: a, reason: from getter */
            public final n2 getAction() {
                return this.action;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$j;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "Lkk/b;", "action", "<init>", "(Lkk/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkk/b;", "()Lkk/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$f$j, reason: from toString */
        public static final /* data */ class ShoppingList implements InterfaceC12239f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC15173b action;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShoppingList) && Intrinsics.e(this.action, ((ShoppingList) other).action);
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            public String toString() {
                return "ShoppingList(action=" + this.action + ')';
            }

            public ShoppingList(AbstractC15173b action) {
                Intrinsics.j(action, "action");
                this.action = action;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC15173b getAction() {
                return this.action;
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$k;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "LCo/h;", "product", "", "quantityToUpdate", "<init>", "(LCo/h;D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "b", "D", "()D", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$f$k, reason: from toString */
        public static final /* data */ class UpdateCarouselProductEntry implements InterfaceC12239f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProductFullDetails product;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final double quantityToUpdate;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateCarouselProductEntry)) {
                    return false;
                }
                UpdateCarouselProductEntry updateCarouselProductEntry = (UpdateCarouselProductEntry) other;
                return Intrinsics.e(this.product, updateCarouselProductEntry.product) && Double.compare(this.quantityToUpdate, updateCarouselProductEntry.quantityToUpdate) == 0;
            }

            public int hashCode() {
                return (this.product.hashCode() * 31) + Double.hashCode(this.quantityToUpdate);
            }

            public String toString() {
                return "UpdateCarouselProductEntry(product=" + this.product + ", quantityToUpdate=" + this.quantityToUpdate + ')';
            }

            public UpdateCarouselProductEntry(ProductFullDetails product, double d10) {
                Intrinsics.j(product, "product");
                this.product = product;
                this.quantityToUpdate = d10;
            }

            /* renamed from: a, reason: from getter */
            public final ProductFullDetails getProduct() {
                return this.product;
            }

            /* renamed from: b, reason: from getter */
            public final double getQuantityToUpdate() {
                return this.quantityToUpdate;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$l;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/f;", "action", "<init>", "(Lcom/meijer/mobile/meijer/activity/find/productdetail/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/find/productdetail/f;", "()Lcom/meijer/mobile/meijer/activity/find/productdetail/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$f$l, reason: from toString */
        public static final /* data */ class UpdateItem implements InterfaceC12239f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC12120f action;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateItem) && Intrinsics.e(this.action, ((UpdateItem) other).action);
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            public String toString() {
                return "UpdateItem(action=" + this.action + ')';
            }

            public UpdateItem(AbstractC12120f action) {
                Intrinsics.j(action, "action");
                this.action = action;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC12120f getAction() {
                return this.action;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$i;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$f$i */
        public static final /* data */ class i implements InterfaceC12239f {

            /* renamed from: a, reason: collision with root package name */
            public static final i f108609a = new i();

            public boolean equals(Object other) {
                return this == other || (other instanceof i);
            }

            public int hashCode() {
                return 1687093579;
            }

            public String toString() {
                return "ReviewSubmittedSuccessAction";
            }

            private i() {
            }
        }
    }

    @Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bC\b\u0002\u0018\u00002\u00020\u0001Bñ\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\t\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\t\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\t\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\t\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\t\u0012\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\t\u0012\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001a0\t\u0012\u0014\b\u0002\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001a0\t\u0012\u001a\b\u0002\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0!0\t\u0012\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0$\u0012\u001a\b\u0002\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0!0\t\u0012\u0010\b\u0002\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\t\u0012\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\t\u0012\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u00104\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u00105\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u00106\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u00108\u001a\u000207\u0012\u0010\b\u0002\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090\t\u0012\u000e\b\u0002\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\t\u0012\u000e\b\u0002\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\t\u0012\u000e\b\u0002\u0010?\u001a\b\u0012\u0004\u0012\u00020=0\t¢\u0006\u0004\b@\u0010AR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010K\u001a\u0004\bJ\u0010MR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010K\u001a\u0004\bP\u0010MR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010K\u001a\u0004\bR\u0010MR\"\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010K\u001a\u0004\bT\u0010MR\"\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010K\u001a\u0004\bV\u0010MR\"\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010K\u001a\u0004\bW\u0010MR\"\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010K\u001a\u0004\bX\u0010MR&\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010K\u001a\u0004\bS\u0010MR&\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001a0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010K\u001a\u0004\bY\u0010MR&\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001a0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010K\u001a\u0004\b\\\u0010MR,\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0!0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010K\u001a\u0004\b^\u0010MR&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR,\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0!0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010K\u001a\u0004\bd\u0010MR\"\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\be\u0010K\u001a\u0004\bQ\u0010MR \u0010*\u001a\b\u0012\u0004\u0012\u00020)0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b^\u0010K\u001a\u0004\bN\u0010MR \u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010K\u001a\u0004\bf\u0010MR \u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010K\u001a\u0004\bg\u0010MR \u0010-\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010K\u001a\u0004\bh\u0010MR \u0010.\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010K\u001a\u0004\bi\u0010MR \u0010/\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bj\u0010K\u001a\u0004\bk\u0010MR \u00100\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bl\u0010K\u001a\u0004\bm\u0010MR \u00101\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bn\u0010K\u001a\u0004\bo\u0010MR \u00102\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bp\u0010K\u001a\u0004\bq\u0010MR \u00103\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\br\u0010K\u001a\u0004\bs\u0010MR \u00104\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bt\u0010K\u001a\u0004\bu\u0010MR \u00105\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bv\u0010K\u001a\u0004\bw\u0010MR \u00106\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bx\u0010K\u001a\u0004\by\u0010MR\u001a\u00108\u001a\u0002078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\bO\u0010|R\"\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b}\u0010K\u001a\u0004\be\u0010MR \u0010<\u001a\b\u0012\u0004\u0012\u00020;0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b~\u0010K\u001a\u0004\bU\u0010MR \u0010>\u001a\b\u0012\u0004\u0012\u00020=0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u007f\u0010K\u001a\u0004\bc\u0010MR \u0010?\u001a\b\u0012\u0004\u0012\u00020=0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010K\u001a\u0004\bF\u0010M¨\u0006\u0080\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$g;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$d;", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "", "onUpdate", "LM0/m;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;", "effectsInMotion", "Landroidx/compose/runtime/l0;", "", "isLoadingVisible", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a;", "bottomActionBarState", "LCo/h;", "domain", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/h1;", "product", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/m1;", "storeLocation", "Lvs/m;", "price", "LKp/c;", "reviews", "Lvs/l;", "nutritionLabel", "", "LXr/c;", "coupons", "Lcom/meijer/mobile/meijer/activity/find/productdetail/o2;", "frequentlyBoughtTogether", "Lbn/j;", "productVariants", "", "", "initialSelectedVariants", "", "allInteractedVariants", "selectedVariant", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/w;", "complexPromo", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/v;", "cartEntry", "isVariantInteracted", "isOnShoppingList", "isOnFavoritesList", "isFromCLP", "isEligibleForCart", "isBuyAgain", "isInStoreOnly", "isAvailable", "isLowStock", "isOutOfStock", "isDelivery", "isPickup", "Landroidx/compose/runtime/j0;", "cartItemCount", "Lfi/d;", "googleAdData", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/b;", "criteoBeaconTracker", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/r;", "frequentlyBoughtTogetherProductsLoadingStatus", "bazaarVoiceProductDisplayStatus", "<init>", "(Lkotlin/jvm/functions/Function1;LM0/m;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Ljava/util/Map;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/j0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;)V", "a", "Lkotlin/jvm/functions/Function1;", "I", "()Lkotlin/jvm/functions/Function1;", "b", "LM0/m;", "j", "()LM0/m;", "c", "Landroidx/compose/runtime/l0;", "e0", "()Landroidx/compose/runtime/l0;", "d", "e", "i", "f", "u", "g", "X", "h", "t", "V", "s", "k", "l", "m", "v", "n", "r", "o", "Ljava/util/Map;", "K", "()Ljava/util/Map;", "p", "W", "q", "k0", "h0", "g0", "c0", "w", "b0", "x", "Z", "y", "d0", "z", "Y", "A", "f0", "B", "i0", "C", "a0", "D", "j0", "E", "Landroidx/compose/runtime/j0;", "()Landroidx/compose/runtime/j0;", "F", "G", "H", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$g, reason: case insensitive filesystem */
    private static final class C12240g implements InterfaceC12237d {

        /* renamed from: A, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<Boolean> isLowStock;

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<Boolean> isOutOfStock;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<Boolean> isDelivery;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<Boolean> isPickup;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5726j0 cartItemCount;

        /* renamed from: F, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<GoogleAdData> googleAdData;

        /* renamed from: G, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<C12203b> criteoBeaconTracker;

        /* renamed from: H, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<com.meijer.mobile.meijer.activity.find.viewmodel.r> frequentlyBoughtTogetherProductsLoadingStatus;

        /* renamed from: I, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<com.meijer.mobile.meijer.activity.find.viewmodel.r> bazaarVoiceProductDisplayStatus;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Function1<InterfaceC12239f, Unit> onUpdate;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final SnapshotStateList<InterfaceC12238e> effectsInMotion;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<Boolean> isLoadingVisible;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<InterfaceC12234a> bottomActionBarState;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<ProductFullDetails> domain;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<ProductDetailsDecorator> product;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<ProductStoreLocationDecorator> storeLocation;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<ProductPriceDecorator> price;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<ProductReviewFullDetails> reviews;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<ProductNutritionLabelDecorator> nutritionLabel;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<List<CouponListItemDecorator>> coupons;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<List<SuggestedProductCarouselDecorator>> frequentlyBoughtTogether;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<List<ProductVariantGroupDecorator>> productVariants;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<Map<String, String>> initialSelectedVariants;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final Map<String, String> allInteractedVariants;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<Map<String, String>> selectedVariant;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<ProductComplexPromoDecorator> complexPromo;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<ProductCartEntryDecorator> cartEntry;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<Boolean> isVariantInteracted;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<Boolean> isOnShoppingList;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<Boolean> isOnFavoritesList;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<Boolean> isFromCLP;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<Boolean> isEligibleForCart;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<Boolean> isBuyAgain;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<Boolean> isInStoreOnly;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0<Boolean> isAvailable;

        /* JADX WARN: Multi-variable type inference failed */
        public C12240g(Function1<? super InterfaceC12239f, Unit> onUpdate, SnapshotStateList<InterfaceC12238e> effectsInMotion, InterfaceC5730l0<Boolean> isLoadingVisible, InterfaceC5730l0<InterfaceC12234a> bottomActionBarState, InterfaceC5730l0<ProductFullDetails> domain, InterfaceC5730l0<ProductDetailsDecorator> product, InterfaceC5730l0<ProductStoreLocationDecorator> storeLocation, InterfaceC5730l0<ProductPriceDecorator> price, InterfaceC5730l0<ProductReviewFullDetails> reviews, InterfaceC5730l0<ProductNutritionLabelDecorator> nutritionLabel, InterfaceC5730l0<List<CouponListItemDecorator>> coupons, InterfaceC5730l0<List<SuggestedProductCarouselDecorator>> frequentlyBoughtTogether, InterfaceC5730l0<List<ProductVariantGroupDecorator>> productVariants, InterfaceC5730l0<Map<String, String>> initialSelectedVariants, Map<String, String> allInteractedVariants, InterfaceC5730l0<Map<String, String>> selectedVariant, InterfaceC5730l0<ProductComplexPromoDecorator> complexPromo, InterfaceC5730l0<ProductCartEntryDecorator> cartEntry, InterfaceC5730l0<Boolean> isVariantInteracted, InterfaceC5730l0<Boolean> isOnShoppingList, InterfaceC5730l0<Boolean> isOnFavoritesList, InterfaceC5730l0<Boolean> isFromCLP, InterfaceC5730l0<Boolean> isEligibleForCart, InterfaceC5730l0<Boolean> isBuyAgain, InterfaceC5730l0<Boolean> isInStoreOnly, InterfaceC5730l0<Boolean> isAvailable, InterfaceC5730l0<Boolean> isLowStock, InterfaceC5730l0<Boolean> isOutOfStock, InterfaceC5730l0<Boolean> isDelivery, InterfaceC5730l0<Boolean> isPickup, InterfaceC5726j0 cartItemCount, InterfaceC5730l0<GoogleAdData> googleAdData, InterfaceC5730l0<C12203b> criteoBeaconTracker, InterfaceC5730l0<com.meijer.mobile.meijer.activity.find.viewmodel.r> frequentlyBoughtTogetherProductsLoadingStatus, InterfaceC5730l0<com.meijer.mobile.meijer.activity.find.viewmodel.r> bazaarVoiceProductDisplayStatus) {
            Intrinsics.j(onUpdate, "onUpdate");
            Intrinsics.j(effectsInMotion, "effectsInMotion");
            Intrinsics.j(isLoadingVisible, "isLoadingVisible");
            Intrinsics.j(bottomActionBarState, "bottomActionBarState");
            Intrinsics.j(domain, "domain");
            Intrinsics.j(product, "product");
            Intrinsics.j(storeLocation, "storeLocation");
            Intrinsics.j(price, "price");
            Intrinsics.j(reviews, "reviews");
            Intrinsics.j(nutritionLabel, "nutritionLabel");
            Intrinsics.j(coupons, "coupons");
            Intrinsics.j(frequentlyBoughtTogether, "frequentlyBoughtTogether");
            Intrinsics.j(productVariants, "productVariants");
            Intrinsics.j(initialSelectedVariants, "initialSelectedVariants");
            Intrinsics.j(allInteractedVariants, "allInteractedVariants");
            Intrinsics.j(selectedVariant, "selectedVariant");
            Intrinsics.j(complexPromo, "complexPromo");
            Intrinsics.j(cartEntry, "cartEntry");
            Intrinsics.j(isVariantInteracted, "isVariantInteracted");
            Intrinsics.j(isOnShoppingList, "isOnShoppingList");
            Intrinsics.j(isOnFavoritesList, "isOnFavoritesList");
            Intrinsics.j(isFromCLP, "isFromCLP");
            Intrinsics.j(isEligibleForCart, "isEligibleForCart");
            Intrinsics.j(isBuyAgain, "isBuyAgain");
            Intrinsics.j(isInStoreOnly, "isInStoreOnly");
            Intrinsics.j(isAvailable, "isAvailable");
            Intrinsics.j(isLowStock, "isLowStock");
            Intrinsics.j(isOutOfStock, "isOutOfStock");
            Intrinsics.j(isDelivery, "isDelivery");
            Intrinsics.j(isPickup, "isPickup");
            Intrinsics.j(cartItemCount, "cartItemCount");
            Intrinsics.j(googleAdData, "googleAdData");
            Intrinsics.j(criteoBeaconTracker, "criteoBeaconTracker");
            Intrinsics.j(frequentlyBoughtTogetherProductsLoadingStatus, "frequentlyBoughtTogetherProductsLoadingStatus");
            Intrinsics.j(bazaarVoiceProductDisplayStatus, "bazaarVoiceProductDisplayStatus");
            this.onUpdate = onUpdate;
            this.effectsInMotion = effectsInMotion;
            this.isLoadingVisible = isLoadingVisible;
            this.bottomActionBarState = bottomActionBarState;
            this.domain = domain;
            this.product = product;
            this.storeLocation = storeLocation;
            this.price = price;
            this.reviews = reviews;
            this.nutritionLabel = nutritionLabel;
            this.coupons = coupons;
            this.frequentlyBoughtTogether = frequentlyBoughtTogether;
            this.productVariants = productVariants;
            this.initialSelectedVariants = initialSelectedVariants;
            this.allInteractedVariants = allInteractedVariants;
            this.selectedVariant = selectedVariant;
            this.complexPromo = complexPromo;
            this.cartEntry = cartEntry;
            this.isVariantInteracted = isVariantInteracted;
            this.isOnShoppingList = isOnShoppingList;
            this.isOnFavoritesList = isOnFavoritesList;
            this.isFromCLP = isFromCLP;
            this.isEligibleForCart = isEligibleForCart;
            this.isBuyAgain = isBuyAgain;
            this.isInStoreOnly = isInStoreOnly;
            this.isAvailable = isAvailable;
            this.isLowStock = isLowStock;
            this.isOutOfStock = isOutOfStock;
            this.isDelivery = isDelivery;
            this.isPickup = isPickup;
            this.cartItemCount = cartItemCount;
            this.googleAdData = googleAdData;
            this.criteoBeaconTracker = criteoBeaconTracker;
            this.frequentlyBoughtTogetherProductsLoadingStatus = frequentlyBoughtTogetherProductsLoadingStatus;
            this.bazaarVoiceProductDisplayStatus = bazaarVoiceProductDisplayStatus;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d
        public Function1<InterfaceC12239f, Unit> I() {
            return this.onUpdate;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d
        public Map<String, String> K() {
            return this.allInteractedVariants;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d
        /* renamed from: V, reason: merged with bridge method [inline-methods] */
        public InterfaceC5730l0<ProductReviewFullDetails> F() {
            return this.reviews;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d
        /* renamed from: W, reason: merged with bridge method [inline-methods] */
        public InterfaceC5730l0<Map<String, String>> E() {
            return this.selectedVariant;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d
        /* renamed from: X, reason: merged with bridge method [inline-methods] */
        public InterfaceC5730l0<ProductStoreLocationDecorator> P() {
            return this.storeLocation;
        }

        public InterfaceC5730l0<Boolean> Y() {
            return this.isAvailable;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public InterfaceC5730l0<Boolean> B() {
            return this.isBuyAgain;
        }

        public InterfaceC5730l0<Boolean> a0() {
            return this.isDelivery;
        }

        public InterfaceC5730l0<com.meijer.mobile.meijer.activity.find.viewmodel.r> b() {
            return this.bazaarVoiceProductDisplayStatus;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d
        /* renamed from: b0, reason: merged with bridge method [inline-methods] */
        public InterfaceC5730l0<Boolean> o() {
            return this.isEligibleForCart;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC5730l0<InterfaceC12234a> G() {
            return this.bottomActionBarState;
        }

        public InterfaceC5730l0<Boolean> c0() {
            return this.isFromCLP;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public InterfaceC5730l0<ProductCartEntryDecorator> Q() {
            return this.cartEntry;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d
        /* renamed from: d0, reason: merged with bridge method [inline-methods] */
        public InterfaceC5730l0<Boolean> C() {
            return this.isInStoreOnly;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d
        /* renamed from: e, reason: from getter and merged with bridge method [inline-methods] */
        public InterfaceC5726j0 N() {
            return this.cartItemCount;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d
        /* renamed from: e0, reason: merged with bridge method [inline-methods] */
        public InterfaceC5730l0<Boolean> y() {
            return this.isLoadingVisible;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public InterfaceC5730l0<ProductComplexPromoDecorator> T() {
            return this.complexPromo;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d
        /* renamed from: f0, reason: merged with bridge method [inline-methods] */
        public InterfaceC5730l0<Boolean> x() {
            return this.isLowStock;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public InterfaceC5730l0<List<CouponListItemDecorator>> a() {
            return this.coupons;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d
        /* renamed from: g0, reason: merged with bridge method [inline-methods] */
        public InterfaceC5730l0<Boolean> L() {
            return this.isOnFavoritesList;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public InterfaceC5730l0<C12203b> M() {
            return this.criteoBeaconTracker;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d
        /* renamed from: h0, reason: merged with bridge method [inline-methods] */
        public InterfaceC5730l0<Boolean> H() {
            return this.isOnShoppingList;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public InterfaceC5730l0<ProductFullDetails> w() {
            return this.domain;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d
        /* renamed from: i0, reason: merged with bridge method [inline-methods] */
        public InterfaceC5730l0<Boolean> n() {
            return this.isOutOfStock;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public SnapshotStateList<InterfaceC12238e> J() {
            return this.effectsInMotion;
        }

        public InterfaceC5730l0<Boolean> j0() {
            return this.isPickup;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public InterfaceC5730l0<List<SuggestedProductCarouselDecorator>> O() {
            return this.frequentlyBoughtTogether;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d
        /* renamed from: k0, reason: merged with bridge method [inline-methods] */
        public InterfaceC5730l0<Boolean> z() {
            return this.isVariantInteracted;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public InterfaceC5730l0<com.meijer.mobile.meijer.activity.find.viewmodel.r> U() {
            return this.frequentlyBoughtTogetherProductsLoadingStatus;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public InterfaceC5730l0<GoogleAdData> R() {
            return this.googleAdData;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public InterfaceC5730l0<Map<String, String>> S() {
            return this.initialSelectedVariants;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public InterfaceC5730l0<ProductNutritionLabelDecorator> A() {
            return this.nutritionLabel;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public InterfaceC5730l0<ProductPriceDecorator> l() {
            return this.price;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public InterfaceC5730l0<ProductDetailsDecorator> m() {
            return this.product;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12237d
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public InterfaceC5730l0<List<ProductVariantGroupDecorator>> D() {
            return this.productVariants;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ C12240g(kotlin.jvm.functions.Function1 r73, M0.SnapshotStateList r74, androidx.compose.runtime.InterfaceC5730l0 r75, androidx.compose.runtime.InterfaceC5730l0 r76, androidx.compose.runtime.InterfaceC5730l0 r77, androidx.compose.runtime.InterfaceC5730l0 r78, androidx.compose.runtime.InterfaceC5730l0 r79, androidx.compose.runtime.InterfaceC5730l0 r80, androidx.compose.runtime.InterfaceC5730l0 r81, androidx.compose.runtime.InterfaceC5730l0 r82, androidx.compose.runtime.InterfaceC5730l0 r83, androidx.compose.runtime.InterfaceC5730l0 r84, androidx.compose.runtime.InterfaceC5730l0 r85, androidx.compose.runtime.InterfaceC5730l0 r86, java.util.Map r87, androidx.compose.runtime.InterfaceC5730l0 r88, androidx.compose.runtime.InterfaceC5730l0 r89, androidx.compose.runtime.InterfaceC5730l0 r90, androidx.compose.runtime.InterfaceC5730l0 r91, androidx.compose.runtime.InterfaceC5730l0 r92, androidx.compose.runtime.InterfaceC5730l0 r93, androidx.compose.runtime.InterfaceC5730l0 r94, androidx.compose.runtime.InterfaceC5730l0 r95, androidx.compose.runtime.InterfaceC5730l0 r96, androidx.compose.runtime.InterfaceC5730l0 r97, androidx.compose.runtime.InterfaceC5730l0 r98, androidx.compose.runtime.InterfaceC5730l0 r99, androidx.compose.runtime.InterfaceC5730l0 r100, androidx.compose.runtime.InterfaceC5730l0 r101, androidx.compose.runtime.InterfaceC5730l0 r102, androidx.compose.runtime.InterfaceC5726j0 r103, androidx.compose.runtime.InterfaceC5730l0 r104, androidx.compose.runtime.InterfaceC5730l0 r105, androidx.compose.runtime.InterfaceC5730l0 r106, androidx.compose.runtime.InterfaceC5730l0 r107, int r108, int r109, kotlin.jvm.internal.DefaultConstructorMarker r110) {
            /*
                Method dump skipped, instructions count: 887
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.C12240g.<init>(kotlin.jvm.functions.Function1, M0.m, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, java.util.Map, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.j0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$addToFavoriteList$1", f = "ProductDetailComposeViewModel.kt", l = {2060}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$h, reason: case insensitive filesystem */
    static final class C12241h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f108649a;

        /* renamed from: b, reason: collision with root package name */
        Object f108650b;

        /* renamed from: c, reason: collision with root package name */
        Object f108651c;

        /* renamed from: d, reason: collision with root package name */
        Object f108652d;

        /* renamed from: e, reason: collision with root package name */
        int f108653e;

        /* renamed from: f, reason: collision with root package name */
        int f108654f;

        /* renamed from: g, reason: collision with root package name */
        int f108655g;

        /* renamed from: h, reason: collision with root package name */
        int f108656h;

        /* renamed from: i, reason: collision with root package name */
        int f108657i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f108658j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ mk.c f108660l;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$addToFavoriteList$1$4$1", f = "ProductDetailComposeViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$h$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f108661a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12233e0 f108662b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C12233e0 c12233e0, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f108662b = c12233e0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f108662b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f108661a == 0) {
                    ResultKt.b(obj);
                    this.f108662b._viewState.J().add(new InterfaceC12238e.UpdateShoppingOrFavoriteListFailed(null, C18570a.f173240h, C18570a.f173242j, 1, null));
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12241h c12241h = C12233e0.this.new C12241h(this.f108660l, continuation);
            c12241h.f108658j = obj;
            return c12241h;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12241h(mk.c cVar, Continuation<? super C12241h> continuation) {
            super(2, continuation);
            this.f108660l = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C12241h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object next;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108657i;
            int i11 = 1;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f108658j;
                    C12233e0 c12233e0 = C12233e0.this;
                    mk.c cVar = this.f108660l;
                    Result.Companion companion = Result.INSTANCE;
                    Eq.a aVar = c12233e0.favoritesListRepository;
                    FavoriteListItem favoriteListItem = new FavoriteListItem(cVar);
                    this.f108658j = interfaceC16622O;
                    this.f108649a = interfaceC16622O;
                    this.f108650b = this;
                    this.f108651c = this;
                    this.f108652d = interfaceC16622O;
                    this.f108653e = 0;
                    this.f108654f = 0;
                    this.f108655g = 0;
                    this.f108656h = 0;
                    this.f108657i = 1;
                    obj = aVar.c(favoriteListItem, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                qv.E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            mk.c cVar2 = this.f108660l;
            UUID uuid = null;
            Object[] objArr = 0;
            if (Result.h(objB)) {
                Iterator it = ((List) objB).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((FavoriteListItem) next).h(cVar2)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                objB = TuplesKt.a(cVar2, next);
            }
            Object objB2 = Result.b(objB);
            C12233e0 c12233e02 = C12233e0.this;
            if (Result.h(objB2)) {
                c12233e02._viewState.J().add(new InterfaceC12238e.d.FavoriteListItemAdded(uuid, (mk.c) ((Pair) objB2).a(), i11, objArr == true ? 1 : 0));
            }
            mk.c cVar3 = this.f108660l;
            C12233e0 c12233e03 = C12233e0.this;
            Throwable thE = Result.e(objB2);
            if (thE != null) {
                uw.a.INSTANCE.f(thE, "Failed to add to favorites: " + cVar3, new Object[0]);
                C16648k.d(androidx.view.d0.a(c12233e03), null, null, new a(c12233e03, null), 3, null);
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$addToShoppingList$1", f = "ProductDetailComposeViewModel.kt", l = {1987}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$i, reason: case insensitive filesystem */
    static final class C12242i extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f108663a;

        /* renamed from: b, reason: collision with root package name */
        Object f108664b;

        /* renamed from: c, reason: collision with root package name */
        Object f108665c;

        /* renamed from: d, reason: collision with root package name */
        Object f108666d;

        /* renamed from: e, reason: collision with root package name */
        int f108667e;

        /* renamed from: f, reason: collision with root package name */
        int f108668f;

        /* renamed from: g, reason: collision with root package name */
        int f108669g;

        /* renamed from: h, reason: collision with root package name */
        int f108670h;

        /* renamed from: i, reason: collision with root package name */
        int f108671i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f108672j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ mk.c f108674l;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$addToShoppingList$1$4$1", f = "ProductDetailComposeViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$i$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f108675a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12233e0 f108676b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C12233e0 c12233e0, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f108676b = c12233e0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f108676b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f108675a == 0) {
                    ResultKt.b(obj);
                    this.f108676b._viewState.J().add(new InterfaceC12238e.UpdateShoppingOrFavoriteListFailed(null, C18570a.f173235c, C18570a.f173236d, 1, null));
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12242i c12242i = C12233e0.this.new C12242i(this.f108674l, continuation);
            c12242i.f108672j = obj;
            return c12242i;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12242i(mk.c cVar, Continuation<? super C12242i> continuation) {
            super(2, continuation);
            this.f108674l = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(mk.c cVar, TrackingData trackingData) {
            trackingData.h("productID", cVar.getCode());
            trackingData.n("product detail page");
            trackingData.v("shopping list");
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(TrackingData trackingData) {
            trackingData.n("product detail page");
            trackingData.v("mperks");
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(TrackingData trackingData) {
            trackingData.h("errorMessage", "add to shopping list error");
            return Unit.f142422a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C12242i) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            Object next;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108671i;
            int i11 = 1;
            UUID uuid = null;
            Object[] objArr = 0;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f108672j;
                    C12233e0 c12233e0 = C12233e0.this;
                    mk.c cVar = this.f108674l;
                    Result.Companion companion = Result.INSTANCE;
                    Eq.b bVar = c12233e0.shoppingListRepository;
                    ShoppingListItem shoppingListItemH = Fq.d.h(cVar, 0, 1, null);
                    this.f108672j = interfaceC16622O;
                    this.f108663a = interfaceC16622O;
                    this.f108664b = this;
                    this.f108665c = this;
                    this.f108666d = interfaceC16622O;
                    this.f108667e = 0;
                    this.f108668f = 0;
                    this.f108669g = 0;
                    this.f108670h = 0;
                    this.f108671i = 1;
                    obj = bVar.d(shoppingListItemH, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                qv.E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            mk.c cVar2 = this.f108674l;
            if (Result.h(objB)) {
                Iterator it = ((List) objB).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (Fq.d.c((ShoppingListItem) next, cVar2)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                objB = TuplesKt.a(cVar2, next);
            }
            Object objB2 = Result.b(objB);
            C12233e0 c12233e02 = C12233e0.this;
            if (Result.h(objB2)) {
                final mk.c cVar3 = (mk.c) ((Pair) objB2).a();
                c12233e02._viewState.J().add(new InterfaceC12238e.d.ShoppingListItemAdded(uuid, cVar3, i11, objArr == true ? 1 : 0));
                c12233e02.analyticsEngine.h(C14476c.a("product added to shopping list:Product Details Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.m0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return C12233e0.C12242i.l(cVar3, (TrackingData) obj2);
                    }
                });
            }
            C12233e0 c12233e03 = C12233e0.this;
            Throwable thE = Result.e(objB2);
            if (thE != null) {
                uw.a.INSTANCE.e(thE);
                C16648k.d(androidx.view.d0.a(c12233e03), null, null, new a(c12233e03, null), 3, null);
                c12233e03.analyticsEngine.h(C14476c.a("event: products: add to shopping list"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.n0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return C12233e0.C12242i.o((TrackingData) obj2);
                    }
                });
                c12233e03.analyticsEngine.h(C14476c.h("Meijer:ShoppingList:PDP"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.o0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return C12233e0.C12242i.p((TrackingData) obj2);
                    }
                });
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel", f = "ProductDetailComposeViewModel.kt", l = {1779}, m = "fetchBazaarVoiceReviews-gIAlu-s")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$j, reason: case insensitive filesystem */
    static final class C12243j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f108677a;

        /* renamed from: b, reason: collision with root package name */
        Object f108678b;

        /* renamed from: c, reason: collision with root package name */
        Object f108679c;

        /* renamed from: d, reason: collision with root package name */
        Object f108680d;

        /* renamed from: e, reason: collision with root package name */
        Object f108681e;

        /* renamed from: f, reason: collision with root package name */
        int f108682f;

        /* renamed from: g, reason: collision with root package name */
        int f108683g;

        /* renamed from: h, reason: collision with root package name */
        int f108684h;

        /* renamed from: i, reason: collision with root package name */
        int f108685i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f108686j;

        /* renamed from: l, reason: collision with root package name */
        int f108688l;

        C12243j(Continuation<? super C12243j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f108686j = obj;
            this.f108688l |= Integer.MIN_VALUE;
            Object objG1 = C12233e0.this.g1(null, this);
            return objG1 == IntrinsicsKt.f() ? objG1 : Result.a(objG1);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel", f = "ProductDetailComposeViewModel.kt", l = {1765}, m = "fetchCoupon-gIAlu-s")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$k, reason: case insensitive filesystem */
    static final class C12244k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f108689a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f108690b;

        /* renamed from: d, reason: collision with root package name */
        int f108692d;

        C12244k(Continuation<? super C12244k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f108690b = obj;
            this.f108692d |= Integer.MIN_VALUE;
            Object objK1 = C12233e0.this.k1(null, this);
            return objK1 == IntrinsicsKt.f() ? objK1 : Result.a(objK1);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel", f = "ProductDetailComposeViewModel.kt", l = {1652}, m = "fetchFrequentlyBoughtTogether-gIAlu-s")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$l, reason: case insensitive filesystem */
    static final class C12245l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f108693a;

        /* renamed from: b, reason: collision with root package name */
        Object f108694b;

        /* renamed from: c, reason: collision with root package name */
        Object f108695c;

        /* renamed from: d, reason: collision with root package name */
        Object f108696d;

        /* renamed from: e, reason: collision with root package name */
        Object f108697e;

        /* renamed from: f, reason: collision with root package name */
        int f108698f;

        /* renamed from: g, reason: collision with root package name */
        int f108699g;

        /* renamed from: h, reason: collision with root package name */
        int f108700h;

        /* renamed from: i, reason: collision with root package name */
        int f108701i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f108702j;

        /* renamed from: l, reason: collision with root package name */
        int f108704l;

        C12245l(Continuation<? super C12245l> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f108702j = obj;
            this.f108704l |= Integer.MIN_VALUE;
            Object objL1 = C12233e0.this.l1(null, this);
            return objL1 == IntrinsicsKt.f() ? objL1 : Result.a(objL1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$fetchFrequentlyBoughtTogetherProducts$1", f = "ProductDetailComposeViewModel.kt", l = {1600, 1604}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$m, reason: case insensitive filesystem */
    static final class C12246m extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f108705a;

        /* renamed from: b, reason: collision with root package name */
        Object f108706b;

        /* renamed from: c, reason: collision with root package name */
        Object f108707c;

        /* renamed from: d, reason: collision with root package name */
        Object f108708d;

        /* renamed from: e, reason: collision with root package name */
        int f108709e;

        /* renamed from: f, reason: collision with root package name */
        int f108710f;

        /* renamed from: g, reason: collision with root package name */
        int f108711g;

        /* renamed from: h, reason: collision with root package name */
        int f108712h;

        /* renamed from: i, reason: collision with root package name */
        int f108713i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f108714j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ mk.f f108716l;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12246m c12246m = C12233e0.this.new C12246m(this.f108716l, continuation);
            c12246m.f108714j = obj;
            return c12246m;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12246m(mk.f fVar, Continuation<? super C12246m> continuation) {
            super(2, continuation);
            this.f108716l = fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C12246m) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
        
            if (r7 == r0) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00f2  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instructions count: 267
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.C12246m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$fetchProduct$1", f = "ProductDetailComposeViewModel.kt", l = {1473, 1528}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$n, reason: case insensitive filesystem */
    static final class C12247n extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108717a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f108718b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ mk.f f108720d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$fetchProduct$1$1", f = "ProductDetailComposeViewModel.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$n$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f108721a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f108722b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C12233e0 f108723c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ mk.f f108724d;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$fetchProduct$1$1$1", f = "ProductDetailComposeViewModel.kt", l = {1478}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$n$a$a, reason: collision with other inner class name */
            static final class C1645a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                Object f108725a;

                /* renamed from: b, reason: collision with root package name */
                int f108726b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C12233e0 f108727c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ mk.f f108728d;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1645a(this.f108727c, this.f108728d, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1645a(C12233e0 c12233e0, mk.f fVar, Continuation<? super C1645a> continuation) {
                    super(2, continuation);
                    this.f108727c = c12233e0;
                    this.f108728d = fVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C1645a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit k(C12233e0 c12233e0, CouponsResponse couponsResponse) {
                    c12233e0.e1(couponsResponse);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit l(C12233e0 c12233e0, Throwable th2) {
                    c12233e0.d1(th2);
                    return Unit.f142422a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C12233e0 c12233e0;
                    Object value;
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f108726b;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            c12233e0 = (C12233e0) this.f108725a;
                            ResultKt.b(obj);
                            value = ((Result) obj).getValue();
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C12233e0 c12233e02 = this.f108727c;
                        mk.f fVar = this.f108728d;
                        this.f108725a = c12233e02;
                        this.f108726b = 1;
                        Object objK1 = c12233e02.k1(fVar, this);
                        if (objK1 == objF) {
                            return objF;
                        }
                        c12233e0 = c12233e02;
                        value = objK1;
                    }
                    final C12233e0 c12233e03 = this.f108727c;
                    Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.p0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return C12233e0.C12247n.a.C1645a.k(c12233e03, (CouponsResponse) obj2);
                        }
                    };
                    final C12233e0 c12233e04 = this.f108727c;
                    c12233e0.c1(value, function1, new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.q0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return C12233e0.C12247n.a.C1645a.l(c12233e04, (Throwable) obj2);
                        }
                    });
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$fetchProduct$1$1$2", f = "ProductDetailComposeViewModel.kt", l = {1489}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$n$a$b */
            static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                Object f108729a;

                /* renamed from: b, reason: collision with root package name */
                int f108730b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C12233e0 f108731c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ mk.f f108732d;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f108731c, this.f108732d, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C12233e0 c12233e0, mk.f fVar, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f108731c = c12233e0;
                    this.f108732d = fVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit k(C12233e0 c12233e0, List list) {
                    c12233e0.h3(list);
                    c12233e0.B1(list);
                    c12233e0.I2(c12233e0.getViewState().m().getValue().getId().getCode());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit l(C12233e0 c12233e0, Throwable th2) {
                    c12233e0.j3(th2);
                    return Unit.f142422a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C12233e0 c12233e0;
                    Object value;
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f108730b;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            c12233e0 = (C12233e0) this.f108729a;
                            ResultKt.b(obj);
                            value = ((Result) obj).getValue();
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C12233e0 c12233e02 = this.f108731c;
                        mk.f fVar = this.f108732d;
                        this.f108729a = c12233e02;
                        this.f108730b = 1;
                        Object objQ1 = c12233e02.q1(fVar, this);
                        if (objQ1 == objF) {
                            return objF;
                        }
                        c12233e0 = c12233e02;
                        value = objQ1;
                    }
                    final C12233e0 c12233e03 = this.f108731c;
                    Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.r0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return C12233e0.C12247n.a.b.k(c12233e03, (List) obj2);
                        }
                    };
                    final C12233e0 c12233e04 = this.f108731c;
                    c12233e0.c1(value, function1, new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.s0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return C12233e0.C12247n.a.b.l(c12233e04, (Throwable) obj2);
                        }
                    });
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$fetchProduct$1$1$3", f = "ProductDetailComposeViewModel.kt", l = {1502}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$n$a$c */
            static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                Object f108733a;

                /* renamed from: b, reason: collision with root package name */
                int f108734b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C12233e0 f108735c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ mk.f f108736d;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new c(this.f108735c, this.f108736d, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(C12233e0 c12233e0, mk.f fVar, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f108735c = c12233e0;
                    this.f108736d = fVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit k(C12233e0 c12233e0, ProductReviewFullDetails productReviewFullDetails) {
                    c12233e0.k2(productReviewFullDetails);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit l(C12233e0 c12233e0, Throwable th2) {
                    c12233e0.S0(th2);
                    return Unit.f142422a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C12233e0 c12233e0;
                    Object value;
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f108734b;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            c12233e0 = (C12233e0) this.f108733a;
                            ResultKt.b(obj);
                            value = ((Result) obj).getValue();
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C12233e0 c12233e02 = this.f108735c;
                        mk.f fVar = this.f108736d;
                        this.f108733a = c12233e02;
                        this.f108734b = 1;
                        Object objG1 = c12233e02.g1(fVar, this);
                        if (objG1 == objF) {
                            return objF;
                        }
                        c12233e0 = c12233e02;
                        value = objG1;
                    }
                    final C12233e0 c12233e03 = this.f108735c;
                    Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.t0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return C12233e0.C12247n.a.c.k(c12233e03, (ProductReviewFullDetails) obj2);
                        }
                    };
                    final C12233e0 c12233e04 = this.f108735c;
                    c12233e0.c1(value, function1, new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.u0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return C12233e0.C12247n.a.c.l(c12233e04, (Throwable) obj2);
                        }
                    });
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$fetchProduct$1$1$4", f = "ProductDetailComposeViewModel.kt", l = {1511}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$n$a$d */
            static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                Object f108737a;

                /* renamed from: b, reason: collision with root package name */
                int f108738b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C12233e0 f108739c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ mk.f f108740d;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new d(this.f108739c, this.f108740d, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(C12233e0 c12233e0, mk.f fVar, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f108739c = c12233e0;
                    this.f108740d = fVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit k(C12233e0 c12233e0, List list) {
                    c12233e0.V0(list);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit l(C12233e0 c12233e0, Throwable th2) {
                    c12233e0.U0(th2);
                    return Unit.f142422a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C12233e0 c12233e0;
                    Object value;
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f108738b;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            c12233e0 = (C12233e0) this.f108737a;
                            ResultKt.b(obj);
                            value = ((Result) obj).getValue();
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C12233e0 c12233e02 = this.f108739c;
                        mk.f fVar = this.f108740d;
                        this.f108737a = c12233e02;
                        this.f108738b = 1;
                        Object objL1 = c12233e02.l1(fVar, this);
                        if (objL1 == objF) {
                            return objF;
                        }
                        c12233e0 = c12233e02;
                        value = objL1;
                    }
                    final C12233e0 c12233e03 = this.f108739c;
                    Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.v0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return C12233e0.C12247n.a.d.k(c12233e03, (List) obj2);
                        }
                    };
                    final C12233e0 c12233e04 = this.f108739c;
                    c12233e0.c1(value, function1, new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.w0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return C12233e0.C12247n.a.d.l(c12233e04, (Throwable) obj2);
                        }
                    });
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$fetchProduct$1$1$5", f = "ProductDetailComposeViewModel.kt", l = {1522}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$n$a$e */
            static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                Object f108741a;

                /* renamed from: b, reason: collision with root package name */
                int f108742b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C12233e0 f108743c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ mk.f f108744d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ ProductFullDetails f108745e;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new e(this.f108743c, this.f108744d, this.f108745e, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(C12233e0 c12233e0, mk.f fVar, ProductFullDetails productFullDetails, Continuation<? super e> continuation) {
                    super(2, continuation);
                    this.f108743c = c12233e0;
                    this.f108744d = fVar;
                    this.f108745e = productFullDetails;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit k(C12233e0 c12233e0, List list) {
                    c12233e0.C2(list);
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit l(C12233e0 c12233e0, Throwable th2) {
                    c12233e0.B2(th2);
                    return Unit.f142422a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C12233e0 c12233e0;
                    Object value;
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f108742b;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            c12233e0 = (C12233e0) this.f108741a;
                            ResultKt.b(obj);
                            value = ((Result) obj).getValue();
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C12233e0 c12233e02 = this.f108743c;
                        mk.f fVar = this.f108744d;
                        ProductFullDetails productFullDetails = this.f108745e;
                        this.f108741a = c12233e02;
                        this.f108742b = 1;
                        Object objP1 = c12233e02.p1(fVar, productFullDetails, this);
                        if (objP1 == objF) {
                            return objF;
                        }
                        c12233e0 = c12233e02;
                        value = objP1;
                    }
                    final C12233e0 c12233e03 = this.f108743c;
                    Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.x0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return C12233e0.C12247n.a.e.k(c12233e03, (List) obj2);
                        }
                    };
                    final C12233e0 c12233e04 = this.f108743c;
                    c12233e0.c1(value, function1, new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.y0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return C12233e0.C12247n.a.e.l(c12233e04, (Throwable) obj2);
                        }
                    });
                    return Unit.f142422a;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f108723c, this.f108724d, continuation);
                aVar.f108722b = obj;
                return aVar;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C12233e0 c12233e0, mk.f fVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f108723c = c12233e0;
                this.f108724d = fVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f108721a == 0) {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f108722b;
                    C16648k.d(interfaceC16622O, this.f108723c.ioDispatcher, null, new C1645a(this.f108723c, this.f108724d, null), 2, null);
                    if (!this.f108723c.featureManager.e(AbstractC18227f.W.f170562h) && this.f108723c.featureManager.e(AbstractC18227f.C18246t.f170604h)) {
                        C16648k.d(interfaceC16622O, this.f108723c.ioDispatcher, null, new b(this.f108723c, this.f108724d, null), 2, null);
                    }
                    C16648k.d(interfaceC16622O, this.f108723c.ioDispatcher, null, new c(this.f108723c, this.f108724d, null), 2, null);
                    if (this.f108723c.featureManager.e(AbstractC18227f.X.f170563h)) {
                        C16648k.d(interfaceC16622O, this.f108723c.ioDispatcher, null, new d(this.f108723c, this.f108724d, null), 2, null);
                    }
                    ProductFullDetails value = this.f108723c._viewState.w().getValue();
                    if (value.getDepartment().length() <= 0) {
                        value = null;
                    }
                    ProductFullDetails productFullDetails = value;
                    if (this.f108723c.featureManager.e(AbstractC18227f.C18242p.f170594h) && productFullDetails != null) {
                        C16648k.d(interfaceC16622O, this.f108723c.ioDispatcher, null, new e(this.f108723c, this.f108724d, productFullDetails, null), 2, null);
                    }
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12247n c12247n = C12233e0.this.new C12247n(this.f108720d, continuation);
            c12247n.f108718b = obj;
            return c12247n;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12247n(mk.f fVar, Continuation<? super C12247n> continuation) {
            super(2, continuation);
            this.f108720d = fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C12247n) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
        
            if (r10.n0(r9) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r9.f108717a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r9.f108718b
                qv.O r0 = (qv.InterfaceC16622O) r0
                kotlin.ResultKt.b(r10)
                goto L75
            L16:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1e:
                java.lang.Object r1 = r9.f108718b
                qv.O r1 = (qv.InterfaceC16622O) r1
                kotlin.ResultKt.b(r10)
            L25:
                r3 = r1
                goto L52
            L27:
                kotlin.ResultKt.b(r10)
                java.lang.Object r10 = r9.f108718b
                r1 = r10
                qv.O r1 = (qv.InterfaceC16622O) r1
                com.meijer.mobile.meijer.activity.find.viewmodel.e0 r10 = com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.this
                r10.z2(r3)
                com.meijer.mobile.meijer.activity.find.viewmodel.e0 r10 = com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.this
                com.meijer.mobile.meijer.activity.find.viewmodel.e0$g r10 = com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.A0(r10)
                androidx.compose.runtime.l0 r10 = r10.G()
                com.meijer.mobile.meijer.activity.find.viewmodel.e0$a$b r4 = com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.InterfaceC12234a.b.f108537a
                r10.setValue(r4)
                com.meijer.mobile.meijer.activity.find.viewmodel.e0 r10 = com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.this
                mk.f r4 = r9.f108720d
                r9.f108718b = r1
                r9.f108717a = r3
                java.lang.Object r10 = com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.d0(r10, r4, r9)
                if (r10 != r0) goto L25
                goto L74
            L52:
                if (r10 == 0) goto L86
                com.meijer.mobile.meijer.activity.find.viewmodel.e0 r10 = com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.this
                qv.K r4 = com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.q0(r10)
                com.meijer.mobile.meijer.activity.find.viewmodel.e0$n$a r6 = new com.meijer.mobile.meijer.activity.find.viewmodel.e0$n$a
                com.meijer.mobile.meijer.activity.find.viewmodel.e0 r10 = com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.this
                mk.f r1 = r9.f108720d
                r5 = 0
                r6.<init>(r10, r1, r5)
                r7 = 2
                r8 = 0
                qv.C0 r10 = qv.C16644i.d(r3, r4, r5, r6, r7, r8)
                r9.f108718b = r3
                r9.f108717a = r2
                java.lang.Object r10 = r10.n0(r9)
                if (r10 != r0) goto L75
            L74:
                return r0
            L75:
                com.meijer.mobile.meijer.activity.find.viewmodel.e0 r10 = com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.this
                com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.g0(r10)
                com.meijer.mobile.meijer.activity.find.viewmodel.e0 r10 = com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.this
                r0 = 0
                r10.z2(r0)
                com.meijer.mobile.meijer.activity.find.viewmodel.e0 r10 = com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.this
                r10.M2()
                goto L8b
            L86:
                com.meijer.mobile.meijer.activity.find.viewmodel.e0 r10 = com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.this
                r10.M2()
            L8b:
                kotlin.Unit r10 = kotlin.Unit.f142422a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.C12247n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel", f = "ProductDetailComposeViewModel.kt", l = {1704}, m = "fetchProductDetails")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$o */
    static final class o extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f108746a;

        /* renamed from: b, reason: collision with root package name */
        Object f108747b;

        /* renamed from: c, reason: collision with root package name */
        Object f108748c;

        /* renamed from: d, reason: collision with root package name */
        Object f108749d;

        /* renamed from: e, reason: collision with root package name */
        Object f108750e;

        /* renamed from: f, reason: collision with root package name */
        int f108751f;

        /* renamed from: g, reason: collision with root package name */
        int f108752g;

        /* renamed from: h, reason: collision with root package name */
        int f108753h;

        /* renamed from: i, reason: collision with root package name */
        int f108754i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f108755j;

        /* renamed from: l, reason: collision with root package name */
        int f108757l;

        o(Continuation<? super o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f108755j = obj;
            this.f108757l |= Integer.MIN_VALUE;
            return C12233e0.this.o1(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel", f = "ProductDetailComposeViewModel.kt", l = {1681}, m = "fetchSponsoredProducts-0E7RQCE")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$p */
    static final class p extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f108758a;

        /* renamed from: b, reason: collision with root package name */
        Object f108759b;

        /* renamed from: c, reason: collision with root package name */
        Object f108760c;

        /* renamed from: d, reason: collision with root package name */
        Object f108761d;

        /* renamed from: e, reason: collision with root package name */
        Object f108762e;

        /* renamed from: f, reason: collision with root package name */
        Object f108763f;

        /* renamed from: g, reason: collision with root package name */
        int f108764g;

        /* renamed from: h, reason: collision with root package name */
        int f108765h;

        /* renamed from: i, reason: collision with root package name */
        int f108766i;

        /* renamed from: j, reason: collision with root package name */
        int f108767j;

        /* renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f108768k;

        /* renamed from: m, reason: collision with root package name */
        int f108770m;

        p(Continuation<? super p> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f108768k = obj;
            this.f108770m |= Integer.MIN_VALUE;
            Object objP1 = C12233e0.this.p1(null, null, this);
            return objP1 == IntrinsicsKt.f() ? objP1 : Result.a(objP1);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel", f = "ProductDetailComposeViewModel.kt", l = {1729}, m = "fetchVariants-gIAlu-s")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$q */
    static final class q extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f108771a;

        /* renamed from: b, reason: collision with root package name */
        Object f108772b;

        /* renamed from: c, reason: collision with root package name */
        Object f108773c;

        /* renamed from: d, reason: collision with root package name */
        Object f108774d;

        /* renamed from: e, reason: collision with root package name */
        Object f108775e;

        /* renamed from: f, reason: collision with root package name */
        int f108776f;

        /* renamed from: g, reason: collision with root package name */
        int f108777g;

        /* renamed from: h, reason: collision with root package name */
        int f108778h;

        /* renamed from: i, reason: collision with root package name */
        int f108779i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f108780j;

        /* renamed from: l, reason: collision with root package name */
        int f108782l;

        q(Continuation<? super q> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f108780j = obj;
            this.f108782l |= Integer.MIN_VALUE;
            Object objQ1 = C12233e0.this.q1(null, this);
            return objQ1 == IntrinsicsKt.f() ? objQ1 : Result.a(objQ1);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel", f = "ProductDetailComposeViewModel.kt", l = {1626}, m = "loadSponsoredProducts")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$r */
    static final class r extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f108783a;

        /* renamed from: b, reason: collision with root package name */
        Object f108784b;

        /* renamed from: c, reason: collision with root package name */
        Object f108785c;

        /* renamed from: d, reason: collision with root package name */
        Object f108786d;

        /* renamed from: e, reason: collision with root package name */
        Object f108787e;

        /* renamed from: f, reason: collision with root package name */
        Object f108788f;

        /* renamed from: g, reason: collision with root package name */
        Object f108789g;

        /* renamed from: h, reason: collision with root package name */
        int f108790h;

        /* renamed from: i, reason: collision with root package name */
        int f108791i;

        /* renamed from: j, reason: collision with root package name */
        int f108792j;

        /* renamed from: k, reason: collision with root package name */
        int f108793k;

        /* renamed from: l, reason: collision with root package name */
        int f108794l;

        /* renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f108795m;

        /* renamed from: o, reason: collision with root package name */
        int f108797o;

        r(Continuation<? super r> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f108795m = obj;
            this.f108797o |= Integer.MIN_VALUE;
            return C12233e0.this.A1(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$s */
    /* synthetic */ class s extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        s(Object obj) {
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$t */
    /* synthetic */ class t extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        t(Object obj) {
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$u */
    /* synthetic */ class u extends AdaptedFunctionReference implements Function1<List<? extends ProductState<ProductFullDetails>>, Unit> {
        u(Object obj) {
            super(1, obj, C12233e0.class, "updateViewState", "updateViewState(Ljava/util/List;)Lkotlin/Unit;", 8);
        }

        public final void a(List<ProductState<ProductFullDetails>> p02) {
            Intrinsics.j(p02, "p0");
            ((C12233e0) this.f142801a).i3(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends ProductState<ProductFullDetails>> list) {
            a(list);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$v */
    /* synthetic */ class v extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        v(Object obj) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$onClipCouponCallFailure$1", f = "ProductDetailComposeViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$w */
    static final class w extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108798a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CouponException f108799b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C12233e0 f108800c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(CouponException couponException, C12233e0 c12233e0, Continuation<? super w> continuation) {
            super(2, continuation);
            this.f108799b = couponException;
            this.f108800c = c12233e0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new w(this.f108799b, this.f108800c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((w) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r6.f108798a
                if (r0 != 0) goto Laa
                kotlin.ResultKt.b(r7)
                com.meijer.mobile.coupons.domain.models.CouponException r7 = r6.f108799b
                rk.b r7 = r7.getErrorType()
                if (r7 == 0) goto L23
                com.meijer.mobile.coupons.domain.models.CouponException r7 = r6.f108799b
                rk.b r7 = r7.getErrorType()
                kotlin.jvm.internal.Intrinsics.g(r7)
                int r7 = r7.getResultCode()
                r0 = 30
                if (r7 > r0) goto La7
            L23:
                com.meijer.mobile.coupons.domain.models.CouponException r7 = r6.f108799b
                com.meijer.mobile.core.networking.exceptions.RetrofitException$b r7 = r7.getExceptionKind()
                com.meijer.mobile.core.networking.exceptions.RetrofitException$b r0 = com.meijer.mobile.core.networking.exceptions.RetrofitException.b.f96142b
                if (r7 != r0) goto L4b
                com.meijer.mobile.meijer.activity.find.viewmodel.e0 r7 = r6.f108800c
                com.meijer.mobile.meijer.activity.find.viewmodel.e0$g r7 = com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.A0(r7)
                M0.m r7 = r7.J()
                com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$j r0 = new com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$j
                int r2 = Nr.g.f22758t
                com.meijer.mobile.coupons.domain.models.CouponException r1 = r6.f108799b
                Ok.a r3 = r1.getCoupon()
                r4 = 1
                r5 = 0
                r1 = 0
                r0.<init>(r1, r2, r3, r4, r5)
                r7.add(r0)
                goto La7
            L4b:
                com.meijer.mobile.coupons.domain.models.CouponException r7 = r6.f108799b
                rk.b r7 = r7.getErrorType()
                if (r7 == 0) goto L72
                com.meijer.mobile.coupons.domain.models.CouponException r7 = r6.f108799b
                rk.b r7 = r7.getErrorType()
                com.meijer.mobile.coupons.api.models.AddOfferErrorType r0 = com.meijer.mobile.coupons.api.models.AddOfferErrorType.CLIPPED_COUPONS_LIMIT_ERROR
                if (r7 != r0) goto L72
                com.meijer.mobile.meijer.activity.find.viewmodel.e0 r7 = r6.f108800c
                com.meijer.mobile.meijer.activity.find.viewmodel.e0$g r7 = com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.A0(r7)
                M0.m r7 = r7.J()
                com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$k r0 = new com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$k
                r1 = 1
                r2 = 0
                r0.<init>(r2, r1, r2)
                r7.add(r0)
                goto La7
            L72:
                com.meijer.mobile.meijer.activity.find.viewmodel.e0 r7 = r6.f108800c
                com.meijer.mobile.meijer.activity.find.viewmodel.e0$g r7 = com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.A0(r7)
                M0.m r7 = r7.J()
                com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$j r0 = new com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$j
                com.meijer.mobile.coupons.domain.models.CouponException r1 = r6.f108799b
                rk.b r1 = r1.getErrorType()
                if (r1 == 0) goto L95
                com.meijer.mobile.coupons.domain.models.CouponException r1 = r6.f108799b
                rk.b r1 = r1.getErrorType()
                kotlin.jvm.internal.Intrinsics.g(r1)
                int r1 = r1.getErrorResourceId()
            L93:
                r2 = r1
                goto L98
            L95:
                int r1 = Nr.g.f22746n
                goto L93
            L98:
                com.meijer.mobile.coupons.domain.models.CouponException r1 = r6.f108799b
                Ok.a r3 = r1.getCoupon()
                r4 = 1
                r5 = 0
                r1 = 0
                r0.<init>(r1, r2, r3, r4, r5)
                r7.add(r0)
            La7:
                kotlin.Unit r7 = kotlin.Unit.f142422a
                return r7
            Laa:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.w.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$onReload$1", f = "ProductDetailComposeViewModel.kt", l = {2324}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$x */
    static final class x extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f108801a;

        /* renamed from: b, reason: collision with root package name */
        int f108802b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ n2 f108804d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(n2 n2Var, Continuation<? super x> continuation) {
            super(2, continuation);
            this.f108804d = n2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12233e0.this.new x(this.f108804d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((x) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(C12233e0 c12233e0, ProductReviewFullDetails productReviewFullDetails) {
            c12233e0.k2(productReviewFullDetails);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(C12233e0 c12233e0, Throwable th2) {
            c12233e0.S0(th2);
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C12233e0 c12233e0;
            Object value;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108802b;
            if (i10 != 0) {
                if (i10 == 1) {
                    c12233e0 = (C12233e0) this.f108801a;
                    ResultKt.b(obj);
                    value = ((Result) obj).getValue();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C12233e0 c12233e02 = C12233e0.this;
                mk.f product = ((n2.BazaarVoiceReviews) this.f108804d).getProduct();
                this.f108801a = c12233e02;
                this.f108802b = 1;
                Object objG1 = c12233e02.g1(product, this);
                if (objG1 == objF) {
                    return objF;
                }
                c12233e0 = c12233e02;
                value = objG1;
            }
            final C12233e0 c12233e03 = C12233e0.this;
            Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.z0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return C12233e0.x.k(c12233e03, (ProductReviewFullDetails) obj2);
                }
            };
            final C12233e0 c12233e04 = C12233e0.this;
            c12233e0.c1(value, function1, new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.A0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return C12233e0.x.l(c12233e04, (Throwable) obj2);
                }
            });
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$onSubstitutionResult$1", f = "ProductDetailComposeViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$y */
    static final class y extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108805a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m2 f108806b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C12233e0 f108807c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(m2 m2Var, C12233e0 c12233e0, Continuation<? super y> continuation) {
            super(2, continuation);
            this.f108806b = m2Var;
            this.f108807c = c12233e0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new y(this.f108806b, this.f108807c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((y) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f108805a == 0) {
                ResultKt.b(obj);
                m2 m2Var = this.f108806b;
                int i10 = 1;
                UUID uuid = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                if (Intrinsics.e(m2Var, m2.a.f107651a)) {
                    this.f108807c._viewState.J().add(new InterfaceC12238e.d.ProductAddedWithBackup(uuid, i10, objArr3 == true ? 1 : 0));
                } else if (Intrinsics.e(m2Var, m2.b.f107652a)) {
                    this.f108807c._viewState.J().add(new InterfaceC12238e.d.ProductAddedWithoutBackup(objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$removeFromFavoriteList$1", f = "ProductDetailComposeViewModel.kt", l = {2081}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$z */
    static final class z extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f108808a;

        /* renamed from: b, reason: collision with root package name */
        Object f108809b;

        /* renamed from: c, reason: collision with root package name */
        Object f108810c;

        /* renamed from: d, reason: collision with root package name */
        Object f108811d;

        /* renamed from: e, reason: collision with root package name */
        int f108812e;

        /* renamed from: f, reason: collision with root package name */
        int f108813f;

        /* renamed from: g, reason: collision with root package name */
        int f108814g;

        /* renamed from: h, reason: collision with root package name */
        int f108815h;

        /* renamed from: i, reason: collision with root package name */
        int f108816i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f108817j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ mk.c f108819l;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$removeFromFavoriteList$1$4$1", f = "ProductDetailComposeViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$z$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f108820a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12233e0 f108821b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C12233e0 c12233e0, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f108821b = c12233e0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f108821b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f108820a == 0) {
                    ResultKt.b(obj);
                    this.f108821b._viewState.J().add(new InterfaceC12238e.UpdateShoppingOrFavoriteListFailed(null, C18570a.f173240h, C18570a.f173242j, 1, null));
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            z zVar = C12233e0.this.new z(this.f108819l, continuation);
            zVar.f108817j = obj;
            return zVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(mk.c cVar, Continuation<? super z> continuation) {
            super(2, continuation);
            this.f108819l = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((z) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            Object next;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108816i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f108817j;
                    C12233e0 c12233e0 = C12233e0.this;
                    mk.c cVar = this.f108819l;
                    Result.Companion companion = Result.INSTANCE;
                    Eq.a aVar = c12233e0.favoritesListRepository;
                    this.f108817j = interfaceC16622O;
                    this.f108808a = interfaceC16622O;
                    this.f108809b = this;
                    this.f108810c = this;
                    this.f108811d = interfaceC16622O;
                    this.f108812e = 0;
                    this.f108813f = 0;
                    this.f108814g = 0;
                    this.f108815h = 0;
                    this.f108816i = 1;
                    obj = aVar.j(cVar, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                qv.E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            mk.c cVar2 = this.f108819l;
            if (Result.h(objB)) {
                Iterator it = ((List) objB).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((FavoriteListItem) next).h(cVar2)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                objB = TuplesKt.a(cVar2, next);
            }
            Object objB2 = Result.b(objB);
            if (Result.h(objB2)) {
                uw.a.INSTANCE.k("Successfully removed product from favorites.", new Object[0]);
            }
            C12233e0 c12233e02 = C12233e0.this;
            Throwable thE = Result.e(objB2);
            if (thE != null) {
                uw.a.INSTANCE.f(thE, "Failed to remove product from favorites.", new Object[0]);
                C16648k.d(androidx.view.d0.a(c12233e02), null, null, new a(c12233e02, null), 3, null);
            }
            return Unit.f142422a;
        }
    }

    public C12233e0(Ro.c productsRepository, hl.m cartRepository, Tq.j storeProvider, yo.k userManager, Eq.a favoritesListRepository, Eq.b shoppingListRepository, wr.f cartInteractor, com.google.firebase.crashlytics.a firebaseCrashlytics, yl.k featureManager, InterfaceC14261a analyticsEngine, C16594b beaconClient, sp.Y productStateRepository, C16992a multiChannelProductsStateRepository, pp.g suggestionsRepository, pp.e sponsorshipsDataStore, pp.d productMetadataStore, Kp.g bazaarVoiceManager, C6412d couponsRepository, AbstractC16618K ioDispatcher) {
        Intrinsics.j(productsRepository, "productsRepository");
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(favoritesListRepository, "favoritesListRepository");
        Intrinsics.j(shoppingListRepository, "shoppingListRepository");
        Intrinsics.j(cartInteractor, "cartInteractor");
        Intrinsics.j(firebaseCrashlytics, "firebaseCrashlytics");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(beaconClient, "beaconClient");
        Intrinsics.j(productStateRepository, "productStateRepository");
        Intrinsics.j(multiChannelProductsStateRepository, "multiChannelProductsStateRepository");
        Intrinsics.j(suggestionsRepository, "suggestionsRepository");
        Intrinsics.j(sponsorshipsDataStore, "sponsorshipsDataStore");
        Intrinsics.j(productMetadataStore, "productMetadataStore");
        Intrinsics.j(bazaarVoiceManager, "bazaarVoiceManager");
        Intrinsics.j(couponsRepository, "couponsRepository");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.productsRepository = productsRepository;
        this.cartRepository = cartRepository;
        this.storeProvider = storeProvider;
        this.userManager = userManager;
        this.favoritesListRepository = favoritesListRepository;
        this.shoppingListRepository = shoppingListRepository;
        this.cartInteractor = cartInteractor;
        this.firebaseCrashlytics = firebaseCrashlytics;
        this.featureManager = featureManager;
        this.analyticsEngine = analyticsEngine;
        this.beaconClient = beaconClient;
        this.productStateRepository = productStateRepository;
        this.multiChannelProductsStateRepository = multiChannelProductsStateRepository;
        this.suggestionsRepository = suggestionsRepository;
        this.sponsorshipsDataStore = sponsorshipsDataStore;
        this.productMetadataStore = productMetadataStore;
        this.bazaarVoiceManager = bazaarVoiceManager;
        this.couponsRepository = couponsRepository;
        this.ioDispatcher = ioDispatcher;
        InterfaceC5730l0 interfaceC5730l0 = null;
        InterfaceC5730l0 interfaceC5730l02 = null;
        InterfaceC5730l0 interfaceC5730l03 = null;
        InterfaceC5730l0 interfaceC5730l04 = null;
        InterfaceC5730l0 interfaceC5730l05 = null;
        InterfaceC5730l0 interfaceC5730l06 = null;
        InterfaceC17140B<ProductState<ProductFullDetails>> interfaceC17140BA = tv.S.a(new ProductState(new ProductFullDetails(null, null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -1, 268435455, null), null, null, null, null, null, null, null, null, null, null, null, null, 8190, null));
        this._productStateFlow = interfaceC17140BA;
        this.productStateFlow = C17154h.c(interfaceC17140BA);
        Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.B
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12233e0.S(this.f107872a, (C12233e0.InterfaceC12239f) obj);
            }
        };
        InterfaceC5730l0 interfaceC5730l07 = null;
        InterfaceC5730l0 interfaceC5730l08 = null;
        InterfaceC5730l0 interfaceC5730l09 = null;
        InterfaceC5730l0 interfaceC5730l010 = null;
        InterfaceC5730l0 interfaceC5730l011 = null;
        InterfaceC5730l0 interfaceC5730l012 = null;
        InterfaceC5730l0 interfaceC5730l013 = null;
        InterfaceC5730l0 interfaceC5730l014 = null;
        InterfaceC5730l0 interfaceC5730l015 = null;
        InterfaceC5730l0 interfaceC5730l016 = null;
        InterfaceC5726j0 interfaceC5726j0 = null;
        int i10 = -2;
        C12240g c12240g = new C12240g(function1, null, null, interfaceC5730l0, interfaceC5730l02, interfaceC5730l03, interfaceC5730l04, null, null, null, null, interfaceC5730l05, interfaceC5730l06, interfaceC5730l07, null, interfaceC5730l08, interfaceC5730l09, interfaceC5730l010, null, interfaceC5730l011, null, null, interfaceC5730l012, null, interfaceC5730l013, interfaceC5730l014, null, interfaceC5730l015, interfaceC5730l016, null, interfaceC5726j0, null, null, null, null, i10, 7, null);
        this._viewState = c12240g;
        this.viewState = c12240g;
        Nu.a aVar = new Nu.a();
        this.disposables = aVar;
        InterfaceC17140B<ProductDetailFeatureFlags> interfaceC17140BA2 = tv.S.a(new ProductDetailFeatureFlags(false, false, false, false, false, false, false, false, l3.f92484c, null));
        this._featureFlags = interfaceC17140BA2;
        this.featureFlags = C17154h.c(interfaceC17140BA2);
        this.cartId = "-1";
        this.limitReviews = 5;
        E1();
        O1();
        J1();
        if (userManager.b()) {
            cartInteractor.p();
            F1();
            h1();
        }
        Ck.a.a(productStateRepository.q0(), aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<ProductState<ProductFullDetails>> D1(List<ProductState<ProductFullDetails>> productState) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : productState) {
            if (((ProductFullDetails) ((ProductState) obj).g()).F()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return productState;
        }
        productState.removeAll(arrayList);
        List listB1 = CollectionsKt.b1(arrayList, 2);
        Iterator it = listB1.iterator();
        while (it.hasNext()) {
            S1(new AbstractC12200a.OnLoadCriteoBeacon((ProductFullDetails) ((ProductState) it.next()).g()));
        }
        List listP = CollectionsKt.p(1, 4);
        int size = listB1.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (i10 < listP.size()) {
                int iIntValue = ((Number) listP.get(i10)).intValue();
                if (iIntValue > productState.size()) {
                    productState.addAll(listB1.subList(i10, listB1.size()));
                    break;
                }
                productState.add(iIntValue, listB1.get(i10));
            }
            i10++;
        }
        return CollectionsKt.j1(productState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j3(Throwable t10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A1(mk.f r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.A1(mk.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B1(List<ProductVariantGroup> variantGroups) {
        InterfaceC5730l0<Map<String, String>> interfaceC5730l0S = this._viewState.S();
        List<ProductVariantGroup> list = variantGroups;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(list, 10)), 16));
        for (ProductVariantGroup productVariantGroup : list) {
            String name = productVariantGroup.getName();
            List<ProductVariant> listA = productVariantGroup.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listA) {
                if (Intrinsics.e(this.viewState.m().getValue().getId().getCode(), ((ProductVariant) obj).getId().getCode())) {
                    arrayList.add(obj);
                }
            }
            Pair pairA = TuplesKt.a(name, CollectionsKt.B0(arrayList, "", null, null, 0, null, new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.Z
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return C12233e0.C1((ProductVariant) obj2);
                }
            }, 30, null));
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        interfaceC5730l0S.setValue(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B2(Throwable t10) {
        uw.a.INSTANCE.f(t10, "Failed to fetch sponsored product from Criteo.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence C1(ProductVariant variant) {
        Intrinsics.j(variant, "variant");
        return variant.getAttribute();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C2(List<SponsoredProduct> productList) {
        pp.e eVar = this.sponsorshipsDataStore;
        List<SponsoredProduct> list = productList;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SponsoredProduct) it.next()).getSponsorship());
        }
        eVar.d(arrayList);
        C16992a c16992a = this.multiChannelProductsStateRepository;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((SponsoredProduct) it2.next()).getProduct());
        }
        c16992a.c("frequently bought together", arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void D2(String reviewId, Kp.a reviewFeedbackVote) {
        UUID uuid = null;
        Object[] objArr = 0;
        if (this.userManager.b()) {
            C16648k.d(androidx.view.d0.a(this), null, null, new I(reviewId, reviewFeedbackVote, null), 3, null);
        } else {
            this._viewState.J().add(new InterfaceC12238e.d.BazaarVoiceFeedbackAttemptWithoutLogin(uuid, Lp.c.f18634d0, 1, objArr == true ? 1 : 0));
        }
    }

    private final void E1() {
        if (this.userManager.b()) {
            this.cartInteractor.q(false, new C12235b());
        }
    }

    private final void E2(GoogleAdAnalytics analytics) {
        this.analyticsEngine.e(C13902c.b(analytics, "product details page"));
    }

    private final void F1() {
        io.reactivex.l<Integer> lVarSubscribeOn = this.cartRepository.Q().subscribeOn(C14764a.b());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.H
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12233e0.G1(this.f107918a, (Integer) obj);
            }
        };
        Pu.g<? super Integer> gVar = new Pu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.I
            @Override // Pu.g
            public final void accept(Object obj) {
                C12233e0.H1(function1, obj);
            }
        };
        final s sVar = new s(uw.a.INSTANCE);
        Ck.a.a(lVarSubscribeOn.subscribe(gVar, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.K
            @Override // Pu.g
            public final void accept(Object obj) {
                C12233e0.I1(sVar, obj);
            }
        }), this.disposables);
    }

    private final void F2(final ProductFullDetails productDetails) {
        String str = this.previousTrackAction;
        if (str == null || str.length() == 0) {
            this.analyticsEngine.i(C14476c.h("Product Details Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C12233e0.G2(productDetails, this, (TrackingData) obj);
                }
            });
        } else {
            this.analyticsEngine.i(C14476c.h("Product Details Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.J
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C12233e0.H2(productDetails, this, (TrackingData) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G1(C12233e0 c12233e0, Integer num) {
        InterfaceC5726j0 interfaceC5726j0N = c12233e0._viewState.N();
        Intrinsics.g(num);
        interfaceC5726j0N.j(num.intValue());
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G2(ProductFullDetails productFullDetails, C12233e0 c12233e0, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.c(Ao.W.f1200a.h(productFullDetails));
        stageEvent.h("pageName", "Meijer:Search Results Page: Product Details Page");
        ProductSponsorship productSponsorshipA = c12233e0.sponsorshipsDataStore.a(productFullDetails.getCode());
        if (productSponsorshipA != null) {
            Ao.e0.a(productSponsorshipA, stageEvent);
            if (productSponsorshipA.getSponsorSource() == Ho.b.f13065c) {
                C16648k.d(androidx.view.d0.a(c12233e0), c12233e0.ioDispatcher, null, new J(productFullDetails, c12233e0, null), 2, null);
            }
        }
        stageEvent.h("isProductOutOfStock", productFullDetails.getStockInfo().e() ? "true" : "false");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H2(ProductFullDetails productFullDetails, C12233e0 c12233e0, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.c(Ao.W.f1200a.h(productFullDetails));
        stageEvent.h("pageName", "Meijer:Search Results Page: Product Details Page");
        stageEvent.h("isProductOutOfStock", productFullDetails.getStockInfo().e() ? "true" : "false");
        Ao.e0.a(c12233e0.sponsorshipsDataStore.a(productFullDetails.getCode()), stageEvent);
        stageEvent.p(c12233e0.previousTrackAction);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I2(final String productCode) {
        if (!this.viewState.D().getValue().isEmpty()) {
            final boolean zBooleanValue = this.viewState.z().getValue().booleanValue();
            final String strS2 = zBooleanValue ? (String) CollectionsKt.r0(this.viewState.E().getValue().keySet()) : s2();
            final String strR2 = zBooleanValue ? (String) CollectionsKt.r0(this.viewState.E().getValue().values()) : r2();
            this.analyticsEngine.i(C14476c.h("Product Details Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.X
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C12233e0.J2(productCode, zBooleanValue, strS2, strR2, (TrackingData) obj);
                }
            });
        }
        this.analyticsEngine.f(C14476c.h("Product Details Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.Y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12233e0.K2((TrackingData) obj);
            }
        });
    }

    private final void J1() {
        this.multiChannelProductsStateRepository.b(new C16992a.InterfaceC2509a() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.C
            @Override // sp.C16992a.InterfaceC2509a
            public final void a(Object obj, sp.Y y10) {
                C12233e0.K1(this.f107876a, obj, y10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(String str, boolean z10, String str2, String str3, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        Ao.e0.b(stageEvent, str, z10, str2, str3);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K1(final C12233e0 c12233e0, final Object key, sp.Y repo) {
        Intrinsics.j(key, "key");
        Intrinsics.j(repo, "repo");
        io.reactivex.l<List<ProductState<ProductFullDetails>>> lVarSubscribeOn = repo.Y0().subscribeOn(C14764a.b());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.S
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12233e0.L1(this.f108097a, key, (List) obj);
            }
        };
        Pu.g<? super List<ProductState<ProductFullDetails>>> gVar = new Pu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.T
            @Override // Pu.g
            public final void accept(Object obj) {
                C12233e0.M1(function1, obj);
            }
        };
        final t tVar = new t(uw.a.INSTANCE);
        Ck.a.a(lVarSubscribeOn.subscribe(gVar, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.U
            @Override // Pu.g
            public final void accept(Object obj) {
                C12233e0.N1(tVar, obj);
            }
        }), c12233e0.disposables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K2(TrackingData submitEvent) {
        Intrinsics.j(submitEvent, "$this$submitEvent");
        return Unit.f142422a;
    }

    private final void L2(String variantType, String variantName, mk.f productCode) {
        this.analyticsEngine.e(Ao.g0.f1298a.b(variantName, variantType, productCode.getCode()));
    }

    private final void N2(final InterfaceC12239f.UpdateCarouselProductEntry action) {
        y1(new Function0() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.N
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C12233e0.O2(this.f108086a, action);
            }
        }, new Function0() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.O
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C12233e0.P2(this.f108089a);
            }
        });
    }

    private final void O1() {
        io.reactivex.l<List<ProductState<ProductFullDetails>>> lVarDistinctUntilChanged = this.productStateRepository.Y0().distinctUntilChanged();
        final u uVar = new u(this);
        Pu.g<? super List<ProductState<ProductFullDetails>>> gVar = new Pu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.F
            @Override // Pu.g
            public final void accept(Object obj) {
                C12233e0.Q1(uVar, obj);
            }
        };
        final v vVar = new v(uw.a.INSTANCE);
        Ck.a.a(lVarDistinctUntilChanged.subscribe(gVar, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.G
            @Override // Pu.g
            public final void accept(Object obj) {
                C12233e0.P1(vVar, obj);
            }
        }), this.disposables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O2(C12233e0 c12233e0, InterfaceC12239f.UpdateCarouselProductEntry updateCarouselProductEntry) {
        InterfaceC5730l0<List<SuggestedProductCarouselDecorator>> interfaceC5730l0O = c12233e0._viewState.O();
        List<SuggestedProductCarouselDecorator> value = c12233e0._viewState.O().getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(value, 10));
        for (SuggestedProductCarouselDecorator suggestedProductCarouselDecoratorV : value) {
            if (suggestedProductCarouselDecoratorV.getResetStepperState()) {
                suggestedProductCarouselDecoratorV = SuggestedProductCarouselDecorator.v(suggestedProductCarouselDecoratorV, null, null, null, null, null, null, false, false, null, null, null, null, 0.0d, false, false, null, null, null, false, null, 1032191, null);
            }
            arrayList.add(suggestedProductCarouselDecoratorV);
        }
        interfaceC5730l0O.setValue(arrayList);
        if (!c12233e0.quantityChangeForFBT) {
            c12233e0.quantityChangeForFBT = true;
        }
        wr.f.M(c12233e0.cartInteractor, updateCarouselProductEntry.getProduct(), updateCarouselProductEntry.getQuantityToUpdate(), false, null, 12, null);
        return Unit.f142422a;
    }

    private final void P0(String variantType, String variantName) {
        if (variantType != null) {
            this._viewState.K().put(variantType, variantName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q2(double quantityToUpdate) {
        C16648k.d(androidx.view.d0.a(this), null, null, new K(null), 3, null);
        mk.f id2 = this._viewState.m().getValue().getId();
        ProductFullDetails productFullDetails = id2 instanceof ProductFullDetails ? (ProductFullDetails) id2 : null;
        if (productFullDetails != null) {
            wr.f.M(this.cartInteractor, productFullDetails, quantityToUpdate, this._viewState.c0().getValue().booleanValue(), null, 8, null);
        } else {
            this._viewState.G().setValue(InterfaceC12234a.b.f108537a);
        }
    }

    private final void R1(a2 action) {
        if (action instanceof a2.ReadMore) {
            g2((a2.ReadMore) action);
            return;
        }
        if (action instanceof a2.ShowReviewGallery) {
            y2((a2.ShowReviewGallery) action);
            return;
        }
        if (action instanceof a2.SeeAll) {
            q2((a2.SeeAll) action);
            return;
        }
        if (action instanceof a2.WriteReview) {
            n3((a2.WriteReview) action);
            return;
        }
        if (action instanceof a2.Report) {
            D2(((a2.Report) action).getReviewDetails().getReviewId(), Kp.a.f17434a);
        } else if (action instanceof a2.VotePositive) {
            D2(((a2.VotePositive) action).getReviewDetails().getReviewId(), Kp.a.f17435b);
        } else {
            if (!(action instanceof a2.VoteNegative)) {
                throw new NoWhenBranchMatchedException();
            }
            D2(((a2.VoteNegative) action).getReviewDetails().getReviewId(), Kp.a.f17436c);
        }
    }

    private final void R2(ProductEligibility eligibility) {
        this._viewState.o().setValue(Boolean.valueOf(Intrinsics.e(eligibility.k(), ProductEligibility.a.C2600a.f164847a) || Intrinsics.e(eligibility.k(), ProductEligibility.a.c.f164849a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(C12233e0 c12233e0, InterfaceC12239f it) {
        Intrinsics.j(it, "it");
        c12233e0.f2(it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S0(Throwable t10) {
        this._viewState.b().setValue(com.meijer.mobile.meijer.activity.find.viewmodel.r.f108961b);
        uw.a.INSTANCE.f(t10, "ProductDisplayPage: Failed to get bulk ratings", new Object[0]);
    }

    private final void S2(ProductFullDetails product, CartEntry cartEntry) {
        this._viewState.Q().setValue(ProductCartEntryDecorator.INSTANCE.a(cartEntry, product));
    }

    private final void T0(List<ProductFullDetails> productList, boolean isFrequentlyBoughtTogetherImpression) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : productList) {
            ProductFullDetails productFullDetails = (ProductFullDetails) obj;
            if (productFullDetails.F() && !this.viewState.M().getValue().a().contains(productFullDetails.getCode())) {
                arrayList.add(obj);
            }
        }
        List<ProductFullDetails> listM1 = CollectionsKt.m1(arrayList);
        if (listM1.isEmpty()) {
            return;
        }
        InterfaceC5730l0<C12203b> interfaceC5730l0M = this._viewState.M();
        C12203b value = this.viewState.M().getValue();
        List<String> listA = value.a();
        List<ProductFullDetails> list = listM1;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ProductFullDetails) it.next()).getCode());
        }
        listA.addAll(arrayList2);
        interfaceC5730l0M.setValue(value);
        this.analyticsEngine.e(Ao.M.f1171a.b(isFrequentlyBoughtTogetherImpression, this.cartId, listM1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U0(Throwable t10) {
        uw.a.INSTANCE.f(t10, "Failed to fetch frequently bought together products", new Object[0]);
        this._viewState.U().setValue(com.meijer.mobile.meijer.activity.find.viewmodel.r.f108961b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void U1(Coupon coupon) {
        this._viewState.J().add(new InterfaceC12238e.d.ShowCouponClipped(null, coupon, 1, 0 == true ? 1 : 0));
    }

    private final void U2(List<CouponState> coupons) {
        InterfaceC5730l0<List<CouponListItemDecorator>> interfaceC5730l0A = this._viewState.a();
        List<CouponState> list = coupons;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(CouponListItemDecorator.INSTANCE.a(((CouponState) it.next()).getCoupon()));
        }
        interfaceC5730l0A.setValue(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V0(List<ProductFullDetails> results) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : results) {
            if (!((ProductFullDetails) obj).getStockInfo().e()) {
                arrayList.add(obj);
            }
        }
        this.multiChannelProductsStateRepository.c("frequently bought together", CollectionsKt.b1(arrayList, 10));
        this._viewState.U().setValue(com.meijer.mobile.meijer.activity.find.viewmodel.r.f108960a);
    }

    private final void V2(String variantType, String variantName) {
        this._viewState.E().setValue(MapsKt.g(TuplesKt.a(variantType, variantName)));
    }

    private final void W0() {
        this.analyticsEngine.j(C14476c.h("Product Details Page"));
    }

    private final void W1(final AbstractC15172a action) {
        if (action instanceof AbstractC15172a.Add) {
            y1(new Function0() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.L
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C12233e0.X1(this.f108076a, action);
                }
            }, new Function0() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.M
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C12233e0.Y1(this.f108079a);
                }
            });
        } else if (action instanceof AbstractC15172a.Remove) {
            h2(((AbstractC15172a.Remove) action).getProduct());
        } else {
            if (!(action instanceof AbstractC15172a.View)) {
                throw new NoWhenBranchMatchedException();
            }
            k3(((AbstractC15172a.View) action).getProduct());
        }
    }

    private final void W2(FavoriteListItem item) {
        this._viewState.L().setValue(Boolean.valueOf(item != null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X0(final Coupon coupon) {
        io.reactivex.u<ClipUnclipCouponResponse> uVarK = this.couponsRepository.h(coupon).k(Mu.a.a());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12233e0.Y0(this.f108146a, coupon, (ClipUnclipCouponResponse) obj);
            }
        };
        Pu.g<? super ClipUnclipCouponResponse> gVar = new Pu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.d0
            @Override // Pu.g
            public final void accept(Object obj) {
                C12233e0.Z0(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12233e0.a1(this.f109058a, coupon, (Throwable) obj);
            }
        };
        Ck.a.a(uVarK.o(gVar, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.A
            @Override // Pu.g
            public final void accept(Object obj) {
                C12233e0.b1(function12, obj);
            }
        }), this.disposables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X1(C12233e0 c12233e0, AbstractC15172a abstractC15172a) {
        c12233e0.Q0(((AbstractC15172a.Add) abstractC15172a).getProduct());
        return Unit.f142422a;
    }

    private final void X2(ProductFullDetails product) {
        this._viewState.R().setValue(C12561q.f112905a.d(EnumC13905f.f131156d, "pdp", product.getCode(), product.d(), this.featureManager.e(AbstractC18227f.C.f170544h), this.userManager.y()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y1(C12233e0 c12233e0) {
        c12233e0.A2(C18570a.f173237e);
        return Unit.f142422a;
    }

    private final void Y2(boolean isFromCLP) {
        this._viewState.c0().setValue(Boolean.valueOf(isFromCLP));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a1(C12233e0 c12233e0, Coupon coupon, Throwable throwable) {
        Intrinsics.j(throwable, "throwable");
        c12233e0.T1(new CouponException(throwable, coupon));
        return Unit.f142422a;
    }

    private final void a2(final AbstractC15173b action) {
        if (action instanceof AbstractC15173b.Add) {
            y1(new Function0() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.D
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C12233e0.b2(this.f107882a, action);
                }
            }, new Function0() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.E
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C12233e0.c2(this.f107886a);
                }
            });
        } else if (action instanceof AbstractC15173b.View) {
            l3(((AbstractC15173b.View) action).getProduct());
        } else {
            if (!(action instanceof AbstractC15173b.Remove)) {
                throw new NoWhenBranchMatchedException();
            }
            i2(((AbstractC15173b.Remove) action).getProduct());
        }
    }

    private final void a3(ProductFullDetails product) {
        this._viewState.l().setValue(new ProductPriceDecorator(product, false, 0.0d, 6, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b2(C12233e0 c12233e0, AbstractC15173b abstractC15173b) {
        c12233e0.R0(((AbstractC15173b.Add) abstractC15173b).getProduct());
        return Unit.f142422a;
    }

    private final void b3(ProductFullDetails product) {
        this._viewState.m().setValue(ProductDetailsDecorator.INSTANCE.b(product));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c2(C12233e0 c12233e0) {
        c12233e0.A2(C18570a.f173237e);
        return Unit.f142422a;
    }

    private final void c3(ProductFullDetails product, ProductEligibility eligibility) {
        this._viewState.n().setValue(Boolean.valueOf(Intrinsics.e(eligibility.k(), ProductEligibility.a.l.f164858a)));
        this._viewState.x().setValue(Boolean.valueOf(Intrinsics.e(eligibility.k(), ProductEligibility.a.c.f164849a)));
        this._viewState.Y().setValue(Boolean.valueOf(Intrinsics.e(eligibility.k(), ProductEligibility.a.C2600a.f164847a)));
        this._viewState.C().setValue(Boolean.valueOf(Intrinsics.e(eligibility.k(), ProductEligibility.a.C2601b.f164848a)));
        this._viewState.a0().setValue(Boolean.valueOf(eligibility.getFulfillmentMode() instanceof n.Delivery));
        this._viewState.j0().setValue(Boolean.valueOf(eligibility.getFulfillmentMode() instanceof n.Pickup));
        this._viewState.B().setValue(Boolean.valueOf(this.productMetadataStore.c(product.getCode())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d1(Throwable t10) {
        uw.a.INSTANCE.f(t10, "Error fetching coupons.", new Object[0]);
    }

    private final void d3(NutritionLabel nutritionLabel) {
        InterfaceC5730l0<ProductNutritionLabelDecorator> interfaceC5730l0A = this._viewState.A();
        ProductNutritionLabelDecorator productNutritionLabelDecorator = null;
        if (nutritionLabel != null) {
            if (nutritionLabel.getIsEmpty()) {
                nutritionLabel = null;
            }
            if (nutritionLabel != null) {
                productNutritionLabelDecorator = new ProductNutritionLabelDecorator(nutritionLabel);
            }
        }
        interfaceC5730l0A.setValue(productNutritionLabelDecorator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e1(CouponsResponse response) {
        C6412d c6412d = this.couponsRepository;
        List<Coupon> listF = response.f();
        if (listF == null) {
            listF = CollectionsKt.m();
        }
        c6412d.J(listF);
    }

    private final void e2(Object key, List<ProductState<ProductFullDetails>> productState) {
        if (Intrinsics.e(key, "frequently bought together")) {
            List<ProductState<ProductFullDetails>> listD1 = D1(CollectionsKt.m1(productState));
            InterfaceC5730l0<List<SuggestedProductCarouselDecorator>> interfaceC5730l0O = this._viewState.O();
            List<ProductState<ProductFullDetails>> list = listD1;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(SuggestedProductCarouselDecorator.INSTANCE.a((ProductState) it.next()));
            }
            interfaceC5730l0O.setValue(arrayList);
        }
    }

    private final void e3(ProductFullDetails product, Tq.k store) {
        this._viewState.P().setValue(ProductStoreLocationDecorator.INSTANCE.a(product, store));
    }

    private final void f1(InterfaceC12239f.DisposeEffect vsUpdate) {
        InterfaceC12238e next;
        Iterator<InterfaceC12238e> it = this._viewState.J().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next == vsUpdate.getEvent()) {
                    break;
                }
            }
        }
        InterfaceC12238e interfaceC12238e = next;
        if (interfaceC12238e != null) {
            this._viewState.J().remove(interfaceC12238e);
        }
    }

    private final void f2(InterfaceC12239f vsUpdate) {
        if (vsUpdate instanceof InterfaceC12239f.ShoppingList) {
            a2(((InterfaceC12239f.ShoppingList) vsUpdate).getAction());
            return;
        }
        if (vsUpdate instanceof InterfaceC12239f.FavoritesList) {
            W1(((InterfaceC12239f.FavoritesList) vsUpdate).getAction());
            return;
        }
        if (vsUpdate instanceof InterfaceC12239f.ProductReview) {
            R1(((InterfaceC12239f.ProductReview) vsUpdate).getAction());
            return;
        }
        if (vsUpdate instanceof InterfaceC12239f.Coupon) {
            V1(((InterfaceC12239f.Coupon) vsUpdate).getAction());
            return;
        }
        if (vsUpdate instanceof InterfaceC12239f.Reload) {
            Z1(((InterfaceC12239f.Reload) vsUpdate).getAction());
            return;
        }
        if (vsUpdate instanceof InterfaceC12239f.UpdateItem) {
            Z2((InterfaceC12239f.UpdateItem) vsUpdate);
            return;
        }
        if (vsUpdate instanceof InterfaceC12239f.IsFromCLP) {
            Y2(((InterfaceC12239f.IsFromCLP) vsUpdate).getIsFromCLP());
            return;
        }
        if (vsUpdate instanceof InterfaceC12239f.UpdateCarouselProductEntry) {
            N2((InterfaceC12239f.UpdateCarouselProductEntry) vsUpdate);
            return;
        }
        if (vsUpdate instanceof InterfaceC12239f.GetFrequentlyBoughtTogetherProducts) {
            m1(((InterfaceC12239f.GetFrequentlyBoughtTogetherProducts) vsUpdate).getProductIdentity());
            return;
        }
        if (vsUpdate instanceof InterfaceC12239f.GoogleAdClicked) {
            E2(((InterfaceC12239f.GoogleAdClicked) vsUpdate).getAnalytics());
        } else if (vsUpdate instanceof InterfaceC12239f.i) {
            l2();
        } else {
            if (!(vsUpdate instanceof InterfaceC12239f.DisposeEffect)) {
                throw new NoWhenBranchMatchedException();
            }
            f1((InterfaceC12239f.DisposeEffect) vsUpdate);
        }
    }

    private final void f3(ShoppingListItem item) {
        this._viewState.H().setValue(Boolean.valueOf((item == null || item.getIsComplete()) ? false : true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g1(mk.f r6, kotlin.coroutines.Continuation<? super kotlin.Result<Kp.ProductReviewFullDetails>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.C12243j
            if (r0 == 0) goto L13
            r0 = r7
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$j r0 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.C12243j) r0
            int r1 = r0.f108688l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f108688l = r1
            goto L18
        L13:
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$j r0 = new com.meijer.mobile.meijer.activity.find.viewmodel.e0$j
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f108686j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f108688l
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r6 = r0.f108681e
            com.meijer.mobile.meijer.activity.find.viewmodel.e0 r6 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0) r6
            java.lang.Object r6 = r0.f108680d
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            java.lang.Object r6 = r0.f108679c
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            java.lang.Object r6 = r0.f108678b
            com.meijer.mobile.meijer.activity.find.viewmodel.e0 r6 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0) r6
            java.lang.Object r6 = r0.f108677a
            mk.f r6 = (mk.f) r6
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Exception -> L3d
            goto L81
        L3d:
            r6 = move-exception
            goto L86
        L3f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L47:
            kotlin.ResultKt.b(r7)
            kotlin.Result$Companion r7 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3d
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$g r7 = A0(r5)     // Catch: java.lang.Exception -> L3d
            androidx.compose.runtime.l0 r7 = r7.b()     // Catch: java.lang.Exception -> L3d
            com.meijer.mobile.meijer.activity.find.viewmodel.r r2 = com.meijer.mobile.meijer.activity.find.viewmodel.r.f108962c     // Catch: java.lang.Exception -> L3d
            r7.setValue(r2)     // Catch: java.lang.Exception -> L3d
            Kp.g r7 = i0(r5)     // Catch: java.lang.Exception -> L3d
            java.lang.String r2 = r6.getCode()     // Catch: java.lang.Exception -> L3d
            int r4 = r0(r5)     // Catch: java.lang.Exception -> L3d
            r0.f108677a = r6     // Catch: java.lang.Exception -> L3d
            r0.f108678b = r5     // Catch: java.lang.Exception -> L3d
            r0.f108679c = r0     // Catch: java.lang.Exception -> L3d
            r0.f108680d = r0     // Catch: java.lang.Exception -> L3d
            r0.f108681e = r5     // Catch: java.lang.Exception -> L3d
            r6 = 0
            r0.f108682f = r6     // Catch: java.lang.Exception -> L3d
            r0.f108683g = r6     // Catch: java.lang.Exception -> L3d
            r0.f108684h = r6     // Catch: java.lang.Exception -> L3d
            r0.f108685i = r6     // Catch: java.lang.Exception -> L3d
            r0.f108688l = r3     // Catch: java.lang.Exception -> L3d
            java.lang.Object r7 = r7.c(r2, r4, r0)     // Catch: java.lang.Exception -> L3d
            if (r7 != r1) goto L81
            return r1
        L81:
            java.lang.Object r6 = kotlin.Result.b(r7)     // Catch: java.lang.Exception -> L3d
            return r6
        L86:
            kotlin.coroutines.CoroutineContext r7 = r0.getContext()
            qv.E0.i(r7)
            kotlin.Result$Companion r7 = kotlin.Result.INSTANCE
            java.lang.Object r6 = kotlin.ResultKt.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.g1(mk.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void g2(a2.ReadMore action) {
        this._viewState.J().add(new ReadReview(null, action.getReviewItem(), 1, null));
    }

    private final void h1() {
        io.reactivex.l<String> lVarSubscribeOn = this.cartRepository.N().subscribeOn(C14764a.b());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.P
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12233e0.i1(this.f108091a, (String) obj);
            }
        };
        Ck.a.a(lVarSubscribeOn.subscribe(new Pu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.Q
            @Override // Pu.g
            public final void accept(Object obj) {
                C12233e0.j1(function1, obj);
            }
        }), this.disposables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h3(List<ProductVariantGroup> productVariantGroups) {
        InterfaceC5730l0<List<ProductVariantGroupDecorator>> interfaceC5730l0D = this._viewState.D();
        List<ProductVariantGroup> list = productVariantGroups;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ProductVariantGroupDecorator.INSTANCE.a((ProductVariantGroup) it.next()));
        }
        interfaceC5730l0D.setValue(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k1(mk.f r24, kotlin.coroutines.Continuation<? super kotlin.Result<dl.CouponsResponse>> r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            boolean r2 = r1 instanceof com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.C12244k
            if (r2 == 0) goto L17
            r2 = r1
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$k r2 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.C12244k) r2
            int r3 = r2.f108692d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f108692d = r3
            goto L1c
        L17:
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$k r2 = new com.meijer.mobile.meijer.activity.find.viewmodel.e0$k
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f108690b
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r4 = r2.f108692d
            r5 = 1
            if (r4 == 0) goto L3f
            if (r4 != r5) goto L37
            java.lang.Object r2 = r2.f108689a
            mk.f r2 = (mk.f) r2
            kotlin.ResultKt.b(r1)
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.getValue()
            return r1
        L37:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3f:
            kotlin.ResultKt.b(r1)
            cl.d r1 = r0.couponsRepository
            java.lang.String r4 = r24.getCode()
            long r6 = java.lang.Long.parseLong(r4)
            java.lang.Long r4 = kotlin.coroutines.jvm.internal.Boxing.e(r6)
            java.lang.Long[] r4 = new java.lang.Long[]{r4}
            java.util.List r18 = kotlin.collections.CollectionsKt.s(r4)
            com.meijer.mobile.coupon.model.search.CouponsSortType r9 = com.meijer.mobile.coupon.model.search.CouponsSortType.EXPIRING
            Rk.a r6 = new Rk.a
            r21 = 7163(0x1bfb, float:1.0038E-41)
            r22 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r4 = 0
            io.reactivex.u r1 = r1.z(r6, r5, r4, r4)
            r4 = r24
            r2.f108689a = r4
            r2.f108692d = r5
            java.lang.Object r1 = r0.m2(r1, r2)
            if (r1 != r3) goto L85
            return r3
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.k1(mk.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k2(ProductReviewFullDetails result) {
        this._viewState.F().setValue(result);
        this._viewState.b().setValue(com.meijer.mobile.meijer.activity.find.viewmodel.r.f108960a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l1(mk.f r5, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<Co.ProductFullDetails>>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.C12245l
            if (r0 == 0) goto L13
            r0 = r6
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$l r0 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.C12245l) r0
            int r1 = r0.f108704l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f108704l = r1
            goto L18
        L13:
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$l r0 = new com.meijer.mobile.meijer.activity.find.viewmodel.e0$l
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f108702j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f108704l
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r5 = r0.f108697e
            com.meijer.mobile.meijer.activity.find.viewmodel.e0 r5 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0) r5
            java.lang.Object r5 = r0.f108696d
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f108695c
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f108694b
            com.meijer.mobile.meijer.activity.find.viewmodel.e0 r5 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0) r5
            java.lang.Object r5 = r0.f108693a
            mk.f r5 = (mk.f) r5
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Exception -> L3d
            goto L70
        L3d:
            r5 = move-exception
            goto L75
        L3f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L47:
            kotlin.ResultKt.b(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3d
            pp.g r6 = z0(r4)     // Catch: java.lang.Exception -> L3d
            java.lang.String r2 = r5.getCode()     // Catch: java.lang.Exception -> L3d
            r0.f108693a = r5     // Catch: java.lang.Exception -> L3d
            r0.f108694b = r4     // Catch: java.lang.Exception -> L3d
            r0.f108695c = r0     // Catch: java.lang.Exception -> L3d
            r0.f108696d = r0     // Catch: java.lang.Exception -> L3d
            r0.f108697e = r4     // Catch: java.lang.Exception -> L3d
            r5 = 0
            r0.f108698f = r5     // Catch: java.lang.Exception -> L3d
            r0.f108699g = r5     // Catch: java.lang.Exception -> L3d
            r0.f108700h = r5     // Catch: java.lang.Exception -> L3d
            r0.f108701i = r5     // Catch: java.lang.Exception -> L3d
            r0.f108704l = r3     // Catch: java.lang.Exception -> L3d
            java.lang.Object r6 = r6.a(r2, r0)     // Catch: java.lang.Exception -> L3d
            if (r6 != r1) goto L70
            return r1
        L70:
            java.lang.Object r5 = kotlin.Result.b(r6)     // Catch: java.lang.Exception -> L3d
            return r5
        L75:
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            qv.E0.i(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.l1(mk.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void l2() {
        this._viewState.J().add(new InterfaceC12238e.d.ReviewSubmittedSuccess(null, 1, 0 == true ? 1 : 0));
    }

    private final void m1(mk.f productIdentity) {
        if (this.featureManager.e(AbstractC18227f.X.f170563h)) {
            this._viewState.U().setValue(com.meijer.mobile.meijer.activity.find.viewmodel.r.f108962c);
            C16648k.d(androidx.view.d0.a(this), null, null, new C12246m(productIdentity, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object m2(io.reactivex.y<T> r5, kotlin.coroutines.Continuation<? super kotlin.Result<? extends T>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.C
            if (r0 == 0) goto L13
            r0 = r6
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$C r0 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.C) r0
            int r1 = r0.f108475e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f108475e = r1
            goto L18
        L13:
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$C r0 = new com.meijer.mobile.meijer.activity.find.viewmodel.e0$C
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f108473c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f108475e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f108471a
            io.reactivex.y r5 = (io.reactivex.y) r5
            kotlin.ResultKt.b(r6)
            goto L63
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.b(r6)
            r0.f108471a = r5
            r6 = 0
            r0.f108472b = r6
            r0.f108475e = r3
            qv.p r6 = new qv.p
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.c(r0)
            r6.<init>(r2, r3)
            r6.C()
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$D r2 = new com.meijer.mobile.meijer.activity.find.viewmodel.e0$D
            r2.<init>(r6, r4)
            r5.a(r2)
            java.lang.Object r6 = r6.v()
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            if (r6 != r5) goto L60
            kotlin.coroutines.jvm.internal.DebugProbesKt.c(r0)
        L60:
            if (r6 != r1) goto L63
            return r1
        L63:
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.getValue()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.m2(io.reactivex.y, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m3(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("product detail page");
        track.v("mperks");
        return Unit.f142422a;
    }

    private final void n2(Ok.c couponIdentity) {
        io.reactivex.l<Coupon> lVarObserveOn = this.couponsRepository.k(couponIdentity).take(1L).subscribeOn(C14764a.b()).observeOn(Mu.a.a());
        final E e10 = new E(this);
        Pu.g<? super Coupon> gVar = new Pu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.a0
            @Override // Pu.g
            public final void accept(Object obj) {
                C12233e0.o2(e10, obj);
            }
        };
        final F f10 = new F(uw.a.INSTANCE);
        Ck.a.a(lVarObserveOn.subscribe(gVar, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.b0
            @Override // Pu.g
            public final void accept(Object obj) {
                C12233e0.p2(f10, obj);
            }
        }), this.disposables);
    }

    private final void n3(a2.WriteReview action) {
        this._viewState.J().add(new WriteReview(null, new ProductInfoForReviewSubmit(action.getProduct().getCode(), action.getImageUrl(), action.getProduct().getName()), 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o1(mk.f r9, kotlin.coroutines.Continuation<? super Co.ProductFullDetails> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.o
            if (r0 == 0) goto L14
            r0 = r10
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$o r0 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.o) r0
            int r1 = r0.f108757l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f108757l = r1
        L12:
            r10 = r0
            goto L1a
        L14:
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$o r0 = new com.meijer.mobile.meijer.activity.find.viewmodel.e0$o
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r0 = r10.f108755j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r10.f108757l
            r3 = 1
            if (r2 == 0) goto L4a
            if (r2 != r3) goto L42
            java.lang.Object r9 = r10.f108750e
            com.meijer.mobile.meijer.activity.find.viewmodel.e0 r9 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0) r9
            java.lang.Object r9 = r10.f108749d
            kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
            java.lang.Object r9 = r10.f108748c
            kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
            java.lang.Object r9 = r10.f108747b
            com.meijer.mobile.meijer.activity.find.viewmodel.e0 r9 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0) r9
            java.lang.Object r9 = r10.f108746a
            mk.f r9 = (mk.f) r9
            kotlin.ResultKt.b(r0)     // Catch: java.lang.Exception -> L3f
            goto L73
        L3f:
            r0 = move-exception
            r9 = r0
            goto L78
        L42:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L4a:
            kotlin.ResultKt.b(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3f
            Ro.c r0 = u0(r8)     // Catch: java.lang.Exception -> L3f
            java.lang.String r2 = r9.getCode()     // Catch: java.lang.Exception -> L3f
            r10.f108746a = r9     // Catch: java.lang.Exception -> L3f
            r10.f108747b = r8     // Catch: java.lang.Exception -> L3f
            r10.f108748c = r10     // Catch: java.lang.Exception -> L3f
            r10.f108749d = r10     // Catch: java.lang.Exception -> L3f
            r10.f108750e = r8     // Catch: java.lang.Exception -> L3f
            r9 = 0
            r10.f108751f = r9     // Catch: java.lang.Exception -> L3f
            r10.f108752g = r9     // Catch: java.lang.Exception -> L3f
            r10.f108753h = r9     // Catch: java.lang.Exception -> L3f
            r10.f108754i = r9     // Catch: java.lang.Exception -> L3f
            r10.f108757l = r3     // Catch: java.lang.Exception -> L3f
            java.lang.Object r0 = r0.l(r2, r10)     // Catch: java.lang.Exception -> L3f
            if (r0 != r1) goto L73
            return r1
        L73:
            java.lang.Object r9 = kotlin.Result.b(r0)     // Catch: java.lang.Exception -> L3f
            goto L89
        L78:
            kotlin.coroutines.CoroutineContext r10 = r10.getContext()
            qv.E0.i(r10)
            kotlin.Result$Companion r10 = kotlin.Result.INSTANCE
            java.lang.Object r9 = kotlin.ResultKt.a(r9)
            java.lang.Object r9 = kotlin.Result.b(r9)
        L89:
            boolean r10 = kotlin.Result.h(r9)
            if (r10 == 0) goto La8
            r10 = r9
            Co.h r10 = (Co.ProductFullDetails) r10
            sp.Y r0 = r8.productStateRepository
            java.util.List r1 = kotlin.collections.CollectionsKt.e(r10)
            r0.j1(r1)
            java.util.List r0 = r10.A()
            r8.h3(r0)
            r8.W0()
            r8.F2(r10)
        La8:
            java.lang.Throwable r10 = kotlin.Result.e(r9)
            if (r10 == 0) goto Ld0
            uw.a$a r0 = uw.a.INSTANCE
            r0.e(r10)
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$g r10 = r8._viewState
            M0.m r10 = r10.J()
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$c r0 = new com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$c
            int r2 = yr.Q.f170983Z
            int r3 = yr.Q.f171010s
            int r4 = yr.Q.f170980W
            int r1 = yr.Q.f170994f
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.d(r1)
            r6 = 1
            r7 = 0
            r1 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.add(r0)
        Ld0:
            boolean r10 = kotlin.Result.g(r9)
            if (r10 == 0) goto Ld7
            r9 = 0
        Ld7:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.o1(mk.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p1(mk.f r9, Co.ProductFullDetails r10, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<pp.SponsoredProduct>>> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.p
            if (r0 == 0) goto L14
            r0 = r11
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$p r0 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.p) r0
            int r1 = r0.f108770m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f108770m = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$p r0 = new com.meijer.mobile.meijer.activity.find.viewmodel.e0$p
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r7.f108768k
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r7.f108770m
            r2 = 1
            if (r1 == 0) goto L4e
            if (r1 != r2) goto L46
            java.lang.Object r9 = r7.f108763f
            com.meijer.mobile.meijer.activity.find.viewmodel.e0 r9 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0) r9
            java.lang.Object r9 = r7.f108762e
            kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
            java.lang.Object r9 = r7.f108761d
            kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
            java.lang.Object r9 = r7.f108760c
            com.meijer.mobile.meijer.activity.find.viewmodel.e0 r9 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0) r9
            java.lang.Object r9 = r7.f108759b
            Co.h r9 = (Co.ProductFullDetails) r9
            java.lang.Object r9 = r7.f108758a
            mk.f r9 = (mk.f) r9
            kotlin.ResultKt.b(r11)     // Catch: java.lang.Exception -> L43
            goto L94
        L43:
            r0 = move-exception
            r9 = r0
            goto L99
        L46:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L4e:
            kotlin.ResultKt.b(r11)
            kotlin.Result$Companion r11 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L43
            pp.g r1 = z0(r8)     // Catch: java.lang.Exception -> L43
            java.lang.String r3 = r10.getDepartment()     // Catch: java.lang.Exception -> L43
            mk.b r11 = r10.getPrice()     // Catch: java.lang.Exception -> L43
            double r4 = r11.getValue()     // Catch: java.lang.Exception -> L43
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$g r11 = A0(r8)     // Catch: java.lang.Exception -> L43
            androidx.compose.runtime.l0 r11 = r11.Y()     // Catch: java.lang.Exception -> L43
            java.lang.Object r11 = r11.getValue()     // Catch: java.lang.Exception -> L43
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Exception -> L43
            boolean r6 = r11.booleanValue()     // Catch: java.lang.Exception -> L43
            r7.f108758a = r9     // Catch: java.lang.Exception -> L43
            r7.f108759b = r10     // Catch: java.lang.Exception -> L43
            r7.f108760c = r8     // Catch: java.lang.Exception -> L43
            r7.f108761d = r7     // Catch: java.lang.Exception -> L43
            r7.f108762e = r7     // Catch: java.lang.Exception -> L43
            r7.f108763f = r8     // Catch: java.lang.Exception -> L43
            r10 = 0
            r7.f108764g = r10     // Catch: java.lang.Exception -> L43
            r7.f108765h = r10     // Catch: java.lang.Exception -> L43
            r7.f108766i = r10     // Catch: java.lang.Exception -> L43
            r7.f108767j = r10     // Catch: java.lang.Exception -> L43
            r7.f108770m = r2     // Catch: java.lang.Exception -> L43
            r2 = r9
            java.lang.Object r11 = r1.b(r2, r3, r4, r6, r7)     // Catch: java.lang.Exception -> L43
            if (r11 != r0) goto L94
            return r0
        L94:
            java.lang.Object r9 = kotlin.Result.b(r11)     // Catch: java.lang.Exception -> L43
            return r9
        L99:
            kotlin.coroutines.CoroutineContext r10 = r7.getContext()
            qv.E0.i(r10)
            kotlin.Result$Companion r10 = kotlin.Result.INSTANCE
            java.lang.Object r9 = kotlin.ResultKt.a(r9)
            java.lang.Object r9 = kotlin.Result.b(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.p1(mk.f, Co.h, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q1(mk.f r5, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<Co.ProductVariantGroup>>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.q
            if (r0 == 0) goto L13
            r0 = r6
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$q r0 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.q) r0
            int r1 = r0.f108782l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f108782l = r1
            goto L18
        L13:
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$q r0 = new com.meijer.mobile.meijer.activity.find.viewmodel.e0$q
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f108780j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f108782l
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r5 = r0.f108775e
            com.meijer.mobile.meijer.activity.find.viewmodel.e0 r5 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0) r5
            java.lang.Object r5 = r0.f108774d
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f108773c
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f108772b
            com.meijer.mobile.meijer.activity.find.viewmodel.e0 r5 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0) r5
            java.lang.Object r5 = r0.f108771a
            mk.f r5 = (mk.f) r5
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Exception -> L3d
            goto L70
        L3d:
            r5 = move-exception
            goto L75
        L3f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L47:
            kotlin.ResultKt.b(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3d
            Ro.c r6 = u0(r4)     // Catch: java.lang.Exception -> L3d
            java.lang.String r2 = r5.getCode()     // Catch: java.lang.Exception -> L3d
            r0.f108771a = r5     // Catch: java.lang.Exception -> L3d
            r0.f108772b = r4     // Catch: java.lang.Exception -> L3d
            r0.f108773c = r0     // Catch: java.lang.Exception -> L3d
            r0.f108774d = r0     // Catch: java.lang.Exception -> L3d
            r0.f108775e = r4     // Catch: java.lang.Exception -> L3d
            r5 = 0
            r0.f108776f = r5     // Catch: java.lang.Exception -> L3d
            r0.f108777g = r5     // Catch: java.lang.Exception -> L3d
            r0.f108778h = r5     // Catch: java.lang.Exception -> L3d
            r0.f108779i = r5     // Catch: java.lang.Exception -> L3d
            r0.f108782l = r3     // Catch: java.lang.Exception -> L3d
            java.lang.Object r6 = r6.m(r2, r0)     // Catch: java.lang.Exception -> L3d
            if (r6 != r1) goto L70
            return r1
        L70:
            java.lang.Object r5 = kotlin.Result.b(r6)     // Catch: java.lang.Exception -> L3d
            return r5
        L75:
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            qv.E0.i(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12233e0.q1(mk.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void q2(a2.SeeAll action) {
        this._viewState.J().add(new SeeAllReviews(null, new ProductInformation(action.getProduct().getCode(), action.getProduct().getName(), action.getImageUrl()), 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r1() {
        String strB0 = CollectionsKt.B0(this.viewState.S().getValue().entrySet(), " | ", null, null, 0, null, new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.V
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12233e0.s1((Map.Entry) obj);
            }
        }, 30, null);
        mk.c name = this.viewState.m().getValue().getName();
        Intrinsics.h(name, "null cannot be cast to non-null type com.meijer.mobile.product.model.fulldetails.ProductFullDetails");
        ProductFullDetails productFullDetails = (ProductFullDetails) name;
        String str = productFullDetails.getName() + " | " + strB0 + " | " + productFullDetails.getPrice().getFormattedValue();
        Map mapR = MapsKt.r(TuplesKt.a("upc", this.viewState.m().getValue().getId().getCode()), TuplesKt.a("storeId", Integer.valueOf(Co.l.a(this.viewState.m().getValue().getId()).getStoreId())));
        if (strB0.length() > 0) {
            mapR.put("variant_str", str);
        }
        FS.page("Product Details Page", mapR).start();
    }

    private final String r2() {
        String string = ((StringBuilder) CollectionsKt___CollectionsKt.y0(this.viewState.S().getValue().values(), new StringBuilder(), (124 & 2) != 0 ? ", " : "|", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence s1(Map.Entry it) {
        Intrinsics.j(it, "it");
        return ((String) it.getKey()) + " | " + ((String) it.getValue());
    }

    private final String s2() {
        String string = ((StringBuilder) CollectionsKt___CollectionsKt.y0(this.viewState.S().getValue().keySet(), new StringBuilder(), (124 & 2) != 0 ? ", " : "|", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final W.ComplexPromo u1() {
        if (this.quantityChangeForFBT) {
            return null;
        }
        ProductComplexPromoDecorator value = this._viewState.T().getValue();
        ProductComplexPromoDecorator productComplexPromoDecorator = value;
        String text = productComplexPromoDecorator != null ? productComplexPromoDecorator.getText() : null;
        if (text == null || text.length() == 0) {
            value = null;
        }
        ProductComplexPromoDecorator productComplexPromoDecorator2 = value;
        if (productComplexPromoDecorator2 != null) {
            return new W.ComplexPromo(Long.valueOf(productComplexPromoDecorator2.getId()), productComplexPromoDecorator2.getText());
        }
        return null;
    }

    private final void v2(mk.f productIdentity) {
        this.firebaseCrashlytics.h("PRODUCT_ID", productIdentity.getCode());
        this.firebaseCrashlytics.g("STORE_ID", this.storeProvider.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y1(Function0<Unit> isLoggedIn, Function0<Unit> isNotLoggedIn) {
        if (this.userManager.b()) {
            isLoggedIn.invoke();
        } else {
            isNotLoggedIn.invoke();
        }
    }

    private final void y2(a2.ShowReviewGallery showGallery) {
        this._viewState.J().add(new ReviewGallery(null, showGallery.getReviewItem().c(), showGallery.getIndex(), 1, null));
    }

    private final void z1(boolean action) {
        this._viewState.z().setValue(Boolean.valueOf(action));
    }

    public final void M2() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i10 = 1;
        int i11 = 0;
        this._viewState.G().setValue((this.userManager.b() && !this._viewState.y().getValue().booleanValue() && this._viewState.o().getValue().booleanValue()) ? this._viewState.Q().getValue().getActualQuantity() > 0.0d ? InterfaceC12234a.e.f108540a : new InterfaceC12234a.AddToCart(i11, i10, defaultConstructorMarker) : this._viewState.C().getValue().booleanValue() ? new InterfaceC12234a.InStore(i11, i10, defaultConstructorMarker) : InterfaceC12234a.b.f108537a);
    }

    public final void S1(AbstractC12200a action) {
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC12200a.CarouselIsVisible) {
            if (this.carouselIsVisibleEncountered) {
                return;
            }
            T0(((AbstractC12200a.CarouselIsVisible) action).a(), true);
            this.carouselIsVisibleEncountered = true;
            return;
        }
        if (action instanceof AbstractC12200a.NewItemScrolling) {
            T0(((AbstractC12200a.NewItemScrolling) action).a(), false);
            return;
        }
        if (action instanceof AbstractC12200a.OnViewCriteoBeacon) {
            AbstractC12200a.OnViewCriteoBeacon onViewCriteoBeacon = (AbstractC12200a.OnViewCriteoBeacon) action;
            if (this.viewState.M().getValue().d().containsAll(onViewCriteoBeacon.getProductList().getBeaconInfo().g())) {
                return;
            }
            t2(onViewCriteoBeacon.getProductList().getBeaconInfo().g());
            t2(CollectionsKt.e(onViewCriteoBeacon.getProductList().getBeaconInfo().getFormatLevelOnViewBeacon()));
            InterfaceC5730l0<C12203b> interfaceC5730l0M = this._viewState.M();
            C12203b value = this.viewState.M().getValue();
            C12203b c12203b = value;
            c12203b.d().addAll(onViewCriteoBeacon.getProductList().getBeaconInfo().g());
            c12203b.d().add(onViewCriteoBeacon.getProductList().getBeaconInfo().getFormatLevelOnViewBeacon());
            interfaceC5730l0M.setValue(value);
            return;
        }
        if (action instanceof AbstractC12200a.OnClickCriteoBeacon) {
            AbstractC12200a.OnClickCriteoBeacon onClickCriteoBeacon = (AbstractC12200a.OnClickCriteoBeacon) action;
            if (this.viewState.M().getValue().b().containsAll(onClickCriteoBeacon.getProductList().getBeaconInfo().e())) {
                return;
            }
            t2(onClickCriteoBeacon.getProductList().getBeaconInfo().e());
            t2(CollectionsKt.e(onClickCriteoBeacon.getProductList().getBeaconInfo().getFormatLevelOnClickBeacon()));
            InterfaceC5730l0<C12203b> interfaceC5730l0M2 = this._viewState.M();
            C12203b value2 = this.viewState.M().getValue();
            value2.b().addAll(CollectionsKt.Q0(onClickCriteoBeacon.getProductList().getBeaconInfo().e(), onClickCriteoBeacon.getProductList().getBeaconInfo().getFormatLevelOnClickBeacon()));
            interfaceC5730l0M2.setValue(value2);
            return;
        }
        if (!(action instanceof AbstractC12200a.OnLoadCriteoBeacon)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC12200a.OnLoadCriteoBeacon onLoadCriteoBeacon = (AbstractC12200a.OnLoadCriteoBeacon) action;
        if (this.viewState.M().getValue().c().contains(onLoadCriteoBeacon.getProductList().getBeaconInfo().getOnLoadBeacon())) {
            return;
        }
        t2(CollectionsKt.e(onLoadCriteoBeacon.getProductList().getBeaconInfo().getOnLoadBeacon()));
        t2(CollectionsKt.e(onLoadCriteoBeacon.getProductList().getBeaconInfo().getFormatLevelOnLoadBeacon()));
        InterfaceC5730l0<C12203b> interfaceC5730l0M3 = this._viewState.M();
        C12203b value3 = this.viewState.M().getValue();
        value3.c().addAll(CollectionsKt.p(onLoadCriteoBeacon.getProductList().getBeaconInfo().getOnLoadBeacon(), onLoadCriteoBeacon.getProductList().getBeaconInfo().getFormatLevelOnLoadBeacon()));
        interfaceC5730l0M3.setValue(value3);
    }

    public final void V1(Pk.a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.Clip) {
            n2(((a.Clip) action).getCoupon());
        } else if (!(action instanceof a.NotInterested) && !(action instanceof a.Unclip) && !(action instanceof a.ViewCouponList) && !(action instanceof a.ViewCouponDetails)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void Z1(n2 reloadable) {
        Intrinsics.j(reloadable, "reloadable");
        if (reloadable instanceof n2.FrequentlyBoughtTogether) {
            m1(((n2.FrequentlyBoughtTogether) reloadable).getProduct());
        } else if (reloadable instanceof n2.BazaarVoiceReviews) {
            C16648k.d(androidx.view.d0.a(this), this.ioDispatcher, null, new x(reloadable, null), 2, null);
        } else {
            if (!(reloadable instanceof n2.Product)) {
                throw new NoWhenBranchMatchedException();
            }
            x2(((n2.Product) reloadable).getProduct());
        }
    }

    public final void d2(m2 result) {
        Intrinsics.j(result, "result");
        C16648k.d(androidx.view.d0.a(this), null, null, new y(result, this, null), 3, null);
    }

    public final void g3(boolean action, ProductVariantDecorator productVariantDecorator, String variantName) {
        Object next;
        Intrinsics.j(productVariantDecorator, "productVariantDecorator");
        Intrinsics.j(variantName, "variantName");
        Iterator<T> it = this.viewState.D().getValue().iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            List<ProductVariantDecorator> listB = ((ProductVariantGroupDecorator) next).b();
            if (!(listB instanceof Collection) || !listB.isEmpty()) {
                Iterator<T> it2 = listB.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.e(((ProductVariantDecorator) it2.next()).getTitle(), variantName)) {
                        break loop0;
                    }
                }
            }
        }
        ProductVariantGroupDecorator productVariantGroupDecorator = (ProductVariantGroupDecorator) next;
        String name = productVariantGroupDecorator != null ? productVariantGroupDecorator.getName() : null;
        L2(name == null ? "" : name, variantName, productVariantDecorator.getId());
        z1(action);
        V2(name != null ? name : "", variantName);
        P0(name, variantName);
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        this.disposables.d();
        W0();
        super.onCleared();
    }

    @Override // androidx.view.InterfaceC6015f
    public void onResume(InterfaceC6030s owner) {
        ProductDetailFeatureFlags value;
        boolean zE;
        boolean zE2;
        Intrinsics.j(owner, "owner");
        E1();
        InterfaceC17140B<ProductDetailFeatureFlags> interfaceC17140B = this._featureFlags;
        do {
            value = interfaceC17140B.getValue();
            zE = this.featureManager.e(AbstractC18227f.A.f170542h);
            zE2 = this.featureManager.e(AbstractC18227f.O.f170554h);
        } while (!interfaceC17140B.e(value, new ProductDetailFeatureFlags(this.featureManager.e(AbstractC18227f.C2748f.f170576h), zE, zE2, this.featureManager.e(AbstractC18227f.C.f170544h), this.featureManager.e(AbstractC18227f.V.f170561h), this.featureManager.e(AbstractC18227f.W.f170562h), this.featureManager.e(AbstractC18227f.C18246t.f170604h), this.featureManager.e(AbstractC18227f.Z.f170565h))));
    }

    /* renamed from: t1, reason: from getter */
    public final String getCampaignIdValue() {
        return this.campaignIdValue;
    }

    public final void u2(String str) {
        this.campaignIdValue = str;
    }

    public final tv.P<ProductDetailFeatureFlags> v1() {
        return this.featureFlags;
    }

    public final tv.P<ProductState<ProductFullDetails>> w1() {
        return this.productStateFlow;
    }

    public final void w2(String str) {
        this.previousTrackAction = str;
    }

    /* renamed from: x1, reason: from getter */
    public final InterfaceC12237d getViewState() {
        return this.viewState;
    }

    public final void x2(mk.f productIdentity) {
        Intrinsics.j(productIdentity, "productIdentity");
        v2(productIdentity);
        n1(productIdentity);
    }

    public final void z2(boolean isVisible) {
        this._viewState.y().setValue(Boolean.valueOf(isVisible));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A2(int message) {
        C16648k.d(androidx.view.d0.a(this), null, null, new H(message, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L1(C12233e0 c12233e0, Object obj, List list) {
        Intrinsics.g(list);
        c12233e0.e2(obj, list);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit P2(C12233e0 c12233e0) {
        c12233e0.j2();
        c12233e0._viewState.J().add(new InterfaceC12238e.RequireLogin(null, Bj.o.f3011d, 1, 0 == true ? 1 : 0));
        return Unit.f142422a;
    }

    private final void Q0(mk.c product) {
        C16648k.d(androidx.view.d0.a(this), null, null, new C12241h(product, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void R0(mk.c product) {
        C16648k.d(androidx.view.d0.a(this), null, null, new C12242i(product, null), 3, null);
    }

    private final void T1(CouponException exception) {
        C16648k.d(androidx.view.d0.a(this), null, null, new w(exception, this, null), 3, null);
    }

    private final void T2(List<ProductComplexPromo> complexPromos) {
        ProductComplexPromo productComplexPromo = (ProductComplexPromo) CollectionsKt.u0(complexPromos);
        if (productComplexPromo != null) {
            this._viewState.T().setValue(ProductComplexPromoDecorator.INSTANCE.a(productComplexPromo));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y0(C12233e0 c12233e0, Coupon coupon, ClipUnclipCouponResponse clipUnclipCouponResponse) {
        c12233e0.U1(coupon);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void Z2(InterfaceC12239f.UpdateItem update) {
        C16648k.d(androidx.view.d0.a(this), null, null, new L(update, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> void c1(Object obj, Function1<? super T, Unit> function1, Function1<? super Throwable, Unit> function12) {
        if (Result.h(obj)) {
            if (Result.g(obj)) {
                obj = null;
            }
            if (obj != null) {
                function1.invoke(obj);
                return;
            }
            return;
        }
        Throwable thE = Result.e(obj);
        if (thE != null) {
            function12.invoke(thE);
        }
    }

    private final void h2(mk.c product) {
        C16648k.d(androidx.view.d0.a(this), null, null, new z(product, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i1(C12233e0 c12233e0, String str) {
        Intrinsics.g(str);
        c12233e0.cartId = str;
        return Unit.f142422a;
    }

    private final void i2(mk.f product) {
        C16648k.d(androidx.view.d0.a(this), null, null, new A(product, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Unit i3(List<ProductState<ProductFullDetails>> productStates) {
        ProductState<ProductFullDetails> productState = (ProductState) CollectionsKt.u0(productStates);
        if (productState != null) {
            InterfaceC17140B<ProductState<ProductFullDetails>> interfaceC17140B = this._productStateFlow;
            while (!interfaceC17140B.e(interfaceC17140B.getValue(), productState)) {
            }
            b3((ProductFullDetails) productState.g());
            a3((ProductFullDetails) productState.g());
            e3((ProductFullDetails) productState.g(), this.storeProvider.a());
            d3(((ProductFullDetails) productState.g()).getNutritionLabel());
            U2(productState.d());
            T2(productState.c());
            f3(productState.getShoppingListItem());
            W2(productState.getFavoriteListItem());
            S2((ProductFullDetails) productState.g(), productState.getCartEntry());
            R2(productState.getEligibility());
            c3((ProductFullDetails) productState.g(), productState.getEligibility());
            X2((ProductFullDetails) productState.g());
            M2();
            return Unit.f142422a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void k3(mk.c product) {
        C16648k.d(androidx.view.d0.a(this), null, null, new M(product, null), 3, null);
    }

    private final void l3(mk.c product) {
        C16648k.d(androidx.view.d0.a(this), null, null, new N(product, null), 3, null);
        this.analyticsEngine.h(C14476c.a("event: products: view on shopping list"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.W
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12233e0.m3((TrackingData) obj);
            }
        });
    }

    private final void n1(mk.f productIdentity) {
        C16648k.d(androidx.view.d0.a(this), this.ioDispatcher, null, new C12247n(productIdentity, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void t2(List<String> beacon) {
        C16648k.d(androidx.view.d0.a(this), this.ioDispatcher, null, new G(beacon, this, null), 2, null);
    }

    public final void j2() {
        C16648k.d(androidx.view.d0.a(this), null, null, new B(null), 3, null);
    }
}
