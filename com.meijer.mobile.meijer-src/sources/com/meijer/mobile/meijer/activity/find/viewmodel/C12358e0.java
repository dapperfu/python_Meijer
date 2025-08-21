package com.meijer.mobile.meijer.activity.find.viewmodel;

import Ao.C2898u;
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
import Pk.Coupon;
import Qk.a;
import Xk.ProductComplexPromo;
import Xr.CouponListItemDecorator;
import Yk.CouponState;
import androidx.compose.runtime.InterfaceC5868j0;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC6157f;
import androidx.view.InterfaceC6172s;
import cn.ProductVariantDecorator;
import cn.ProductVariantGroupDecorator;
import com.fullstory.FS;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse;
import com.meijer.mobile.coupons.domain.models.CouponException;
import com.meijer.mobile.meijer.C12687q;
import com.meijer.mobile.meijer.activity.find.productdetail.AbstractC12245f;
import com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailFeatureFlags;
import com.meijer.mobile.meijer.activity.find.productdetail.SuggestedProductCarouselDecorator;
import com.meijer.mobile.meijer.activity.find.productdetail.a2;
import com.meijer.mobile.meijer.activity.find.productdetail.m2;
import com.meijer.mobile.meijer.activity.find.productdetail.n2;
import com.meijer.mobile.meijer.activity.find.viewmodel.AbstractC12325a;
import com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0;
import dl.C13702d;
import el.CouponsResponse;
import ev.C13889a;
import fj.Entry;
import fj.EntryChange;
import fj.ShoppingCart;
import fj.n;
import gi.C14375c;
import gi.EnumC14378f;
import gi.GoogleAdAnalytics;
import gi.GoogleAdData;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
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
import lk.AbstractC15516a;
import lk.AbstractC15517b;
import mv.AbstractC15779K;
import mv.C15809k;
import mv.InterfaceC15783O;
import mv.InterfaceC15815n;
import pp.SponsoredProduct;
import pv.C16563h;
import pv.InterfaceC16549B;
import qp.C16753b;
import qw.a;
import sp.C17115a;
import sp.ProductState;
import tr.C17284b;
import uk.AbstractC17440a;
import uk.c;
import ur.AbstractC17454a;
import vr.AbstractC17720a;
import vs.ProductNutritionLabelDecorator;
import vs.ProductPriceDecorator;
import wl.CartEntry;
import wl.ProductEligibility;
import wr.InterfaceC17909a;
import zl.AbstractC18503f;
import zs.C18546a;

@Metadata(d1 = {"\u0000Ò\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0001\u0018\u0000 \u0080\u00032\u00020\u00012\u00020\u0002:\u000e°\u0002®\u0002¬\u0002²\u0002¦\u0002¨\u0002ª\u0002B£\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\b\b\u0001\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00103\u001a\u00020-2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u000200H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020-2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J!\u00109\u001a\u00020-2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00102\u001a\u000200H\u0002¢\u0006\u0004\b9\u00104J'\u0010<\u001a\u00020-2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020-2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020-2\u0006\u0010B\u001a\u000205H\u0002¢\u0006\u0004\bC\u00108J\u000f\u0010D\u001a\u00020-H\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020-2\u0006\u0010F\u001a\u000205H\u0002¢\u0006\u0004\bG\u00108J\u0017\u0010I\u001a\u00020-2\u0006\u00106\u001a\u00020HH\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020-2\u0006\u0010,\u001a\u00020KH\u0002¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020-H\u0002¢\u0006\u0004\bN\u0010EJ\u000f\u0010O\u001a\u00020-H\u0002¢\u0006\u0004\bO\u0010EJ\u000f\u0010P\u001a\u00020-H\u0002¢\u0006\u0004\bP\u0010EJ\u000f\u0010Q\u001a\u00020-H\u0002¢\u0006\u0004\bQ\u0010EJ%\u0010V\u001a\u0004\u0018\u00010-2\u0012\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0S0RH\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u00020-2\u0006\u0010X\u001a\u00020TH\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020-2\u0006\u0010X\u001a\u00020TH\u0002¢\u0006\u0004\b[\u0010ZJ\u001f\u0010^\u001a\u00020-2\u0006\u0010X\u001a\u00020T2\u0006\u0010]\u001a\u00020\\H\u0002¢\u0006\u0004\b^\u0010_J\u0019\u0010b\u001a\u00020-2\b\u0010a\u001a\u0004\u0018\u00010`H\u0002¢\u0006\u0004\bb\u0010cJ\u001d\u0010f\u001a\u00020-2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020d0RH\u0002¢\u0006\u0004\bf\u0010gJ\u001d\u0010j\u001a\u00020-2\f\u0010i\u001a\b\u0012\u0004\u0012\u00020h0RH\u0002¢\u0006\u0004\bj\u0010gJ\u0019\u0010m\u001a\u00020-2\b\u0010l\u001a\u0004\u0018\u00010kH\u0002¢\u0006\u0004\bm\u0010nJ\u0019\u0010p\u001a\u00020-2\b\u0010l\u001a\u0004\u0018\u00010oH\u0002¢\u0006\u0004\bp\u0010qJ\u0017\u0010t\u001a\u00020-2\u0006\u0010s\u001a\u00020rH\u0002¢\u0006\u0004\bt\u0010uJ!\u0010x\u001a\u00020-2\u0006\u0010X\u001a\u00020T2\b\u0010w\u001a\u0004\u0018\u00010vH\u0002¢\u0006\u0004\bx\u0010yJ\u001f\u0010z\u001a\u00020-2\u0006\u0010X\u001a\u00020T2\u0006\u0010s\u001a\u00020rH\u0002¢\u0006\u0004\bz\u0010{J\u001d\u0010~\u001a\u00020-2\f\u0010}\u001a\b\u0012\u0004\u0012\u00020|0RH\u0002¢\u0006\u0004\b~\u0010gJ\u001f\u0010\u0080\u0001\u001a\u00020-2\f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020|0RH\u0002¢\u0006\u0005\b\u0080\u0001\u0010gJ\u0012\u0010\u0081\u0001\u001a\u000200H\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0012\u0010\u0083\u0001\u001a\u000200H\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0082\u0001J\u001c\u0010\u0086\u0001\u001a\u00020-2\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0019\u0010\u0088\u0001\u001a\u00020-2\u0006\u0010X\u001a\u00020TH\u0002¢\u0006\u0005\b\u0088\u0001\u0010ZJ\u001c\u0010\u008b\u0001\u001a\u00020-2\b\u0010\u008a\u0001\u001a\u00030\u0089\u0001H\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0015\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u0001H\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J1\u0010\u0093\u0001\u001a\u00020-2\b\u0010\u0091\u0001\u001a\u00030\u0090\u00012\u0013\u0010\u0092\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0S0RH\u0002¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J4\u0010\u0096\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0S0R2\u0014\u0010\u0092\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0S0\u0095\u0001H\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001b\u0010\u0099\u0001\u001a\u00020-2\u0007\u0010\u0098\u0001\u001a\u00020:H\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001JV\u0010 \u0001\u001a\u00020-\"\n\b\u0000\u0010\u009b\u0001*\u00030\u0090\u0001*\t\u0012\u0004\u0012\u00028\u00000\u009c\u00012\u0014\u0010\u009e\u0001\u001a\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020-0\u009d\u00012\u0015\u0010\u009f\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u0084\u0001\u0012\u0004\u0012\u00020-0\u009d\u0001H\u0002¢\u0006\u0006\b \u0001\u0010¡\u0001J\u001b\u0010¢\u0001\u001a\u00020-2\u0007\u0010\u0098\u0001\u001a\u00020:H\u0002¢\u0006\u0006\b¢\u0001\u0010\u009a\u0001J\u0011\u0010£\u0001\u001a\u00020-H\u0002¢\u0006\u0005\b£\u0001\u0010EJ\u0011\u0010¤\u0001\u001a\u00020-H\u0002¢\u0006\u0005\b¤\u0001\u0010EJ\u001b\u0010¥\u0001\u001a\u00020-2\u0007\u0010\u0098\u0001\u001a\u00020:H\u0002¢\u0006\u0006\b¥\u0001\u0010\u009a\u0001J\u001c\u0010¦\u0001\u001a\u00020-2\u0007\u0010\u0098\u0001\u001a\u00020:H\u0082@¢\u0006\u0006\b¦\u0001\u0010§\u0001J)\u0010¨\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0R0\u009c\u00012\u0007\u0010\u0098\u0001\u001a\u00020:H\u0082@¢\u0006\u0006\b¨\u0001\u0010§\u0001J \u0010ª\u0001\u001a\u00020-2\r\u0010©\u0001\u001a\b\u0012\u0004\u0012\u00020T0RH\u0002¢\u0006\u0005\bª\u0001\u0010gJ\u001c\u0010«\u0001\u001a\u00020-2\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0002¢\u0006\u0006\b«\u0001\u0010\u0087\u0001J2\u0010\u00ad\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¬\u00010R0\u009c\u00012\u0007\u0010\u0098\u0001\u001a\u00020:2\u0006\u0010X\u001a\u00020TH\u0082@¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J!\u0010°\u0001\u001a\u00020-2\u000e\u0010¯\u0001\u001a\t\u0012\u0005\u0012\u00030¬\u00010RH\u0002¢\u0006\u0005\b°\u0001\u0010gJ\u001c\u0010±\u0001\u001a\u00020-2\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0002¢\u0006\u0006\b±\u0001\u0010\u0087\u0001J\u001e\u0010²\u0001\u001a\u0004\u0018\u00010T2\u0007\u0010\u0098\u0001\u001a\u00020:H\u0082@¢\u0006\u0006\b²\u0001\u0010§\u0001J)\u0010³\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020|0R0\u009c\u00012\u0007\u0010\u0098\u0001\u001a\u00020:H\u0082@¢\u0006\u0006\b³\u0001\u0010§\u0001J,\u0010µ\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u009c\u0001\"\u0005\b\u0000\u0010\u009b\u0001*\t\u0012\u0004\u0012\u00028\u00000´\u0001H\u0082@¢\u0006\u0006\bµ\u0001\u0010¶\u0001J$\u0010¸\u0001\u001a\n\u0012\u0005\u0012\u00030·\u00010\u009c\u00012\u0007\u0010\u0098\u0001\u001a\u00020:H\u0082@¢\u0006\u0006\b¸\u0001\u0010§\u0001J\u001c\u0010º\u0001\u001a\u00020-2\b\u0010¹\u0001\u001a\u00030·\u0001H\u0002¢\u0006\u0006\bº\u0001\u0010»\u0001J\u001c\u0010¼\u0001\u001a\u00020-2\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0002¢\u0006\u0006\b¼\u0001\u0010\u0087\u0001J$\u0010¾\u0001\u001a\n\u0012\u0005\u0012\u00030½\u00010\u009c\u00012\u0007\u0010\u0098\u0001\u001a\u00020:H\u0082@¢\u0006\u0006\b¾\u0001\u0010§\u0001J\u001c\u0010À\u0001\u001a\u00020-2\b\u0010¿\u0001\u001a\u00030½\u0001H\u0002¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J\u001c\u0010Â\u0001\u001a\u00020-2\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0002¢\u0006\u0006\bÂ\u0001\u0010\u0087\u0001J%\u0010Æ\u0001\u001a\u00020-2\u0007\u0010Ã\u0001\u001a\u0002002\b\u0010Å\u0001\u001a\u00030Ä\u0001H\u0002¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J\u001a\u0010É\u0001\u001a\u00020-2\u0007\u0010È\u0001\u001a\u00020TH\u0002¢\u0006\u0005\bÉ\u0001\u0010ZJ\u001f\u0010Ë\u0001\u001a\u00020-2\u000b\u0010;\u001a\u000700j\u0003`Ê\u0001H\u0002¢\u0006\u0006\bË\u0001\u0010Ì\u0001J\u001c\u0010Ï\u0001\u001a\u00020-2\b\u0010Î\u0001\u001a\u00030Í\u0001H\u0002¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001J\u0011\u0010Ñ\u0001\u001a\u00020-H\u0002¢\u0006\u0005\bÑ\u0001\u0010EJ2\u0010Õ\u0001\u001a\u00020-2\u000e\u0010Ó\u0001\u001a\t\u0012\u0004\u0012\u00020-0Ò\u00012\u000e\u0010Ô\u0001\u001a\t\u0012\u0004\u0012\u00020-0Ò\u0001H\u0002¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J\u001e\u0010Ù\u0001\u001a\u00020-2\n\b\u0001\u0010Ø\u0001\u001a\u00030×\u0001H\u0002¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J\u001b\u0010Ü\u0001\u001a\u00020-2\u0007\u0010X\u001a\u00030Û\u0001H\u0002¢\u0006\u0006\bÜ\u0001\u0010Ý\u0001J\u001b\u0010Þ\u0001\u001a\u00020-2\u0007\u0010X\u001a\u00030Û\u0001H\u0002¢\u0006\u0006\bÞ\u0001\u0010Ý\u0001J\u001b\u0010à\u0001\u001a\u00020-2\u0007\u00106\u001a\u00030ß\u0001H\u0002¢\u0006\u0006\bà\u0001\u0010á\u0001J\u001b\u0010â\u0001\u001a\u00020-2\u0007\u0010X\u001a\u00030Û\u0001H\u0002¢\u0006\u0006\bâ\u0001\u0010Ý\u0001J\u001a\u0010ã\u0001\u001a\u00020-2\u0006\u0010X\u001a\u00020:H\u0002¢\u0006\u0006\bã\u0001\u0010\u009a\u0001J\u001b\u0010å\u0001\u001a\u00020-2\u0007\u00106\u001a\u00030ä\u0001H\u0002¢\u0006\u0006\bå\u0001\u0010æ\u0001J\u001b\u0010ç\u0001\u001a\u00020-2\u0007\u0010X\u001a\u00030Û\u0001H\u0002¢\u0006\u0006\bç\u0001\u0010Ý\u0001J\u001b\u0010è\u0001\u001a\u00020-2\u0007\u0010X\u001a\u00030Û\u0001H\u0002¢\u0006\u0006\bè\u0001\u0010Ý\u0001J*\u0010ê\u0001\u001a\u00020-2\r\u0010¯\u0001\u001a\b\u0012\u0004\u0012\u00020T0R2\u0007\u0010é\u0001\u001a\u000205H\u0002¢\u0006\u0006\bê\u0001\u0010ë\u0001J \u0010í\u0001\u001a\u00020-2\r\u0010ì\u0001\u001a\b\u0012\u0004\u0012\u0002000RH\u0002¢\u0006\u0005\bí\u0001\u0010gJ\u001c\u0010ð\u0001\u001a\u00020-2\b\u0010ï\u0001\u001a\u00030î\u0001H\u0002¢\u0006\u0006\bð\u0001\u0010ñ\u0001J\u001c\u0010ô\u0001\u001a\u00020-2\b\u0010ó\u0001\u001a\u00030ò\u0001H\u0002¢\u0006\u0006\bô\u0001\u0010õ\u0001J\u001c\u0010ö\u0001\u001a\u00020-2\b\u0010ó\u0001\u001a\u00030ò\u0001H\u0002¢\u0006\u0006\bö\u0001\u0010õ\u0001J\u001c\u0010ù\u0001\u001a\u00020-2\b\u0010ø\u0001\u001a\u00030÷\u0001H\u0002¢\u0006\u0006\bù\u0001\u0010ú\u0001J\u001b\u0010ü\u0001\u001a\u00020-2\u0007\u00106\u001a\u00030û\u0001H\u0002¢\u0006\u0006\bü\u0001\u0010ý\u0001J\u001b\u0010ÿ\u0001\u001a\u00020-2\u0007\u00106\u001a\u00030þ\u0001H\u0002¢\u0006\u0006\bÿ\u0001\u0010\u0080\u0002J\u001c\u0010\u0083\u0002\u001a\u00020-2\b\u0010\u0082\u0002\u001a\u00030\u0081\u0002H\u0002¢\u0006\u0006\b\u0083\u0002\u0010\u0084\u0002J\u001b\u0010\u0086\u0002\u001a\u00020-2\u0007\u00106\u001a\u00030\u0085\u0002H\u0002¢\u0006\u0006\b\u0086\u0002\u0010\u0087\u0002J\u001b\u0010\u0089\u0002\u001a\u00020-2\u0007\u00106\u001a\u00030\u0088\u0002H\u0002¢\u0006\u0006\b\u0089\u0002\u0010\u008a\u0002J\u0011\u0010\u008b\u0002\u001a\u00020-H\u0000¢\u0006\u0005\b\u008b\u0002\u0010EJ*\u0010\u008e\u0002\u001a\u00020-2\u0006\u00106\u001a\u0002052\b\u0010\u008d\u0002\u001a\u00030\u008c\u00022\u0006\u00102\u001a\u000200¢\u0006\u0006\b\u008e\u0002\u0010\u008f\u0002J\u0011\u0010\u0090\u0002\u001a\u00020-H\u0000¢\u0006\u0005\b\u0090\u0002\u0010EJ\u0019\u0010\u0091\u0002\u001a\u00020-2\u0007\u0010\u0098\u0001\u001a\u00020:¢\u0006\u0006\b\u0091\u0002\u0010\u009a\u0001J\u001a\u0010\u0093\u0002\u001a\u00020-2\u0007\u0010\u0092\u0002\u001a\u000205H\u0000¢\u0006\u0005\b\u0093\u0002\u00108J\u001c\u0010\u0096\u0002\u001a\u00020-2\b\u0010\u0095\u0002\u001a\u00030\u0094\u0002H\u0016¢\u0006\u0006\b\u0096\u0002\u0010\u0097\u0002J\u0011\u0010\u0098\u0002\u001a\u00020-H\u0014¢\u0006\u0005\b\u0098\u0002\u0010EJ\u0019\u0010\u009a\u0002\u001a\u00020-2\u0007\u00106\u001a\u00030\u0099\u0002¢\u0006\u0006\b\u009a\u0002\u0010\u009b\u0002J\u0019\u0010\u009d\u0002\u001a\u00020-2\u0007\u00106\u001a\u00030\u009c\u0002¢\u0006\u0006\b\u009d\u0002\u0010\u009e\u0002J\u001a\u0010¡\u0002\u001a\u00020-2\b\u0010 \u0002\u001a\u00030\u009f\u0002¢\u0006\u0006\b¡\u0002\u0010¢\u0002J\u001a\u0010¤\u0002\u001a\u00020-2\b\u0010¿\u0001\u001a\u00030£\u0002¢\u0006\u0006\b¤\u0002\u0010¥\u0002R\u0016\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0002\u0010§\u0002R\u0016\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0002\u0010©\u0002R\u0016\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0002\u0010«\u0002R\u0016\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0002\u0010\u00ad\u0002R\u0016\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0002\u0010¯\u0002R\u0016\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0002\u0010±\u0002R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0002\u0010³\u0002R\u0016\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0002\u0010µ\u0002R\u0016\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0002\u0010·\u0002R\u0016\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0002\u0010¹\u0002R\u0016\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0002\u0010»\u0002R\u0016\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0002\u0010½\u0002R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0002\u0010¿\u0002R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0002\u0010Á\u0002R\u0016\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0002\u0010Ã\u0002R\u0016\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0002\u0010Å\u0002R\u0016\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0002\u0010Ç\u0002R\u0016\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0002\u0010É\u0002R\u0016\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÊ\u0002\u0010Ë\u0002R$\u0010Î\u0002\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0S0Ì\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010Í\u0002R)\u0010Ô\u0002\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0S0Ï\u00028\u0006¢\u0006\u0010\n\u0006\bÐ\u0002\u0010Ñ\u0002\u001a\u0006\bÒ\u0002\u0010Ó\u0002R\u0018\u0010Ø\u0002\u001a\u00030Õ\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0002\u0010×\u0002R\u001d\u0010Þ\u0002\u001a\u00030Ù\u00028\u0006¢\u0006\u0010\n\u0006\bÚ\u0002\u0010Û\u0002\u001a\u0006\bÜ\u0002\u0010Ý\u0002R\u0018\u0010â\u0002\u001a\u00030ß\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bà\u0002\u0010á\u0002R\u001f\u0010å\u0002\u001a\n\u0012\u0005\u0012\u00030ã\u00020Ì\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bä\u0002\u0010Í\u0002R$\u0010è\u0002\u001a\n\u0012\u0005\u0012\u00030ã\u00020Ï\u00028\u0006¢\u0006\u0010\n\u0006\bæ\u0002\u0010Ñ\u0002\u001a\u0006\bç\u0002\u0010Ó\u0002R\u001e\u0010ì\u0002\u001a\u000700j\u0003`é\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bê\u0002\u0010ë\u0002R\u0018\u0010ï\u0002\u001a\u00030×\u00018\u0002X\u0082D¢\u0006\b\n\u0006\bí\u0002\u0010î\u0002R+\u0010ó\u0002\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bð\u0002\u0010ë\u0002\u001a\u0006\bñ\u0002\u0010\u0082\u0001\"\u0006\bò\u0002\u0010Ì\u0001R+\u0010÷\u0002\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bô\u0002\u0010ë\u0002\u001a\u0006\bõ\u0002\u0010\u0082\u0001\"\u0006\bö\u0002\u0010Ì\u0001R\u0019\u0010ú\u0002\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bø\u0002\u0010ù\u0002R(\u0010ÿ\u0002\u001a\u0002058\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bû\u0002\u0010ù\u0002\u001a\u0006\bü\u0002\u0010ý\u0002\"\u0005\bþ\u0002\u00108¨\u0006\u0081\u0003"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "LRo/c;", "productsRepository", "Lil/m;", "cartRepository", "LTq/j;", "storeProvider", "Lyo/k;", "userManager", "LEq/a;", "favoritesListRepository", "LEq/b;", "shoppingListRepository", "Lwr/f;", "cartInteractor", "Lcom/google/firebase/crashlytics/a;", "firebaseCrashlytics", "Lzl/k;", "featureManager", "Lhi/a;", "analyticsEngine", "Lqp/b;", "beaconClient", "Lsp/Y;", "productStateRepository", "Lsp/a;", "multiChannelProductsStateRepository", "Lpp/g;", "suggestionsRepository", "Lpp/e;", "sponsorshipsDataStore", "Lpp/d;", "productMetadataStore", "LKp/g;", "bazaarVoiceManager", "Ldl/d;", "couponsRepository", "Lmv/K;", "ioDispatcher", "<init>", "(LRo/c;Lil/m;LTq/j;Lyo/k;LEq/a;LEq/b;Lwr/f;Lcom/google/firebase/crashlytics/a;Lzl/k;Lhi/a;Lqp/b;Lsp/Y;Lsp/a;Lpp/g;Lpp/e;Lpp/d;LKp/g;Ldl/d;Lmv/K;)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "vsUpdate", "", "g2", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;)V", "", "variantType", "variantName", "W2", "(Ljava/lang/String;Ljava/lang/String;)V", "", "action", "A1", "(Z)V", "P0", "Lnk/f;", "productCode", "M2", "(Ljava/lang/String;Ljava/lang/String;Lnk/f;)V", "Lgi/a;", "analytics", "F2", "(Lgi/a;)V", "isFromCLP", "Z2", "m2", "()V", "isSuccess", "T0", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$l;", "O2", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$l;)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$c;", "g1", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$c;)V", "P1", "K1", "F1", "G1", "", "Lsp/b;", "LCo/h;", "productStates", "j3", "(Ljava/util/List;)Lkotlin/Unit;", "product", "c3", "(LCo/h;)V", "b3", "LTq/k;", PlaceTypes.STORE, "f3", "(LCo/h;LTq/k;)V", "LEo/g;", "nutritionLabel", "e3", "(LEo/g;)V", "LYk/c;", "coupons", "V2", "(Ljava/util/List;)V", "LXk/a;", "complexPromos", "U2", "LFq/c;", "item", "g3", "(LFq/c;)V", "LFq/a;", "X2", "(LFq/a;)V", "Lwl/b;", "eligibility", "S2", "(Lwl/b;)V", "Lwl/a;", "cartEntry", "T2", "(LCo/h;Lwl/a;)V", "d3", "(LCo/h;Lwl/b;)V", "LCo/k;", "productVariantGroups", "i3", "variantGroups", "C1", "t2", "()Ljava/lang/String;", "s2", "", "t", "k3", "(Ljava/lang/Throwable;)V", "Y2", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$m;", "update", "a3", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$m;)V", "LAo/W$a;", "v1", "()LAo/W$a;", "", "key", "productState", "f2", "(Ljava/lang/Object;Ljava/util/List;)V", "", "E1", "(Ljava/util/List;)Ljava/util/List;", "productIdentity", "w2", "(Lnk/f;)V", "T", "Lkotlin/Result;", "Lkotlin/Function1;", "onSuccess", "onFailure", "d1", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "o1", "s1", "i1", "n1", "B1", "(Lnk/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "m1", "results", "W0", "V0", "Lpp/f;", "q1", "(Lnk/f;LCo/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "productList", "D2", "C2", "p1", "r1", "Lio/reactivex/y;", "n2", "(Lio/reactivex/y;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lel/a;", "l1", "response", "f1", "(Lel/a;)V", "e1", "LKp/c;", "h1", "result", "l2", "(LKp/c;)V", "S0", "reviewId", "LKp/a;", "reviewFeedbackVote", "E2", "(Ljava/lang/String;LKp/a;)V", "productDetails", "G2", "Lcom/meijer/mobile/core/models/products/ProductCode;", "J2", "(Ljava/lang/String;)V", "", "quantityToUpdate", "R2", "(D)V", "X0", "Lkotlin/Function0;", "isLoggedIn", "isNotLoggedIn", "z1", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "message", "B2", "(I)V", "Lnk/c;", "m3", "(Lnk/c;)V", "l3", "Llk/b;", "b2", "(Llk/b;)V", "R0", "j2", "Llk/a;", "X1", "(Llk/a;)V", "Q0", "i2", "isFrequentlyBoughtTogetherImpression", "U0", "(Ljava/util/List;Z)V", "beacon", "u2", "LPk/c;", "couponIdentity", "o2", "(LPk/c;)V", "LPk/a;", "coupon", "Y0", "(LPk/a;)V", "V1", "Lcom/meijer/mobile/coupons/domain/models/CouponException;", "exception", "U1", "(Lcom/meijer/mobile/coupons/domain/models/CouponException;)V", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2;", "S1", "(Lcom/meijer/mobile/meijer/activity/find/productdetail/a2;)V", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2$a;", "h2", "(Lcom/meijer/mobile/meijer/activity/find/productdetail/a2$a;)V", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2$d;", "showGallery", "z2", "(Lcom/meijer/mobile/meijer/activity/find/productdetail/a2$d;)V", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2$g;", "o3", "(Lcom/meijer/mobile/meijer/activity/find/productdetail/a2$g;)V", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2$c;", "r2", "(Lcom/meijer/mobile/meijer/activity/find/productdetail/a2$c;)V", "N2", "Lcn/i;", "productVariantDecorator", "h3", "(ZLcn/i;Ljava/lang/String;)V", "k2", "y2", "isVisible", "A2", "Landroidx/lifecycle/s;", "owner", "onResume", "(Landroidx/lifecycle/s;)V", "onCleared", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/a;", "T1", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/a;)V", "LQk/a;", "W1", "(LQk/a;)V", "Lcom/meijer/mobile/meijer/activity/find/productdetail/n2;", "reloadable", "a2", "(Lcom/meijer/mobile/meijer/activity/find/productdetail/n2;)V", "Lcom/meijer/mobile/meijer/activity/find/productdetail/m2;", "e2", "(Lcom/meijer/mobile/meijer/activity/find/productdetail/m2;)V", "a", "LRo/c;", "b", "Lil/m;", "c", "LTq/j;", "d", "Lyo/k;", "e", "LEq/a;", "f", "LEq/b;", "g", "Lwr/f;", "h", "Lcom/google/firebase/crashlytics/a;", "i", "Lzl/k;", "j", "Lhi/a;", "k", "Lqp/b;", "l", "Lsp/Y;", "m", "Lsp/a;", "n", "Lpp/g;", "o", "Lpp/e;", "p", "Lpp/d;", "q", "LKp/g;", "r", "Ldl/d;", "s", "Lmv/K;", "Lpv/B;", "Lpv/B;", "_productStateFlow", "Lpv/P;", "u", "Lpv/P;", "x1", "()Lpv/P;", "productStateFlow", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$g;", "v", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$g;", "_viewState", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$d;", "w", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$d;", "y1", "()Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$d;", "viewState", "LJu/a;", "x", "LJu/a;", "disposables", "Lcom/meijer/mobile/meijer/activity/find/productdetail/W0;", "y", "_featureFlags", "z", "w1", "featureFlags", "Lcom/meijer/mobile/core/model/common/ResourceId;", "A", "Ljava/lang/String;", "cartId", "B", "I", "limitReviews", "C", "getPreviousTrackAction", "x2", "previousTrackAction", "D", "u1", "v2", "campaignIdValue", "E", "Z", "quantityChangeForFBT", "F", "getCarouselIsVisibleEncountered", "()Z", "setCarouselIsVisibleEncountered", "carouselIsVisibleEncountered", "G", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C12358e0 extends androidx.view.c0 implements InterfaceC6157f {

    /* renamed from: H, reason: collision with root package name */
    public static final int f109280H = 8;

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
    private final il.m cartRepository;

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
    private final zl.k featureManager;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final C16753b beaconClient;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final sp.Y productStateRepository;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final C17115a multiChannelProductsStateRepository;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final pp.g suggestionsRepository;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final pp.e sponsorshipsDataStore;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final pp.d productMetadataStore;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Kp.g bazaarVoiceManager;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final C13702d couponsRepository;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ProductState<ProductFullDetails>> _productStateFlow;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final pv.P<ProductState<ProductFullDetails>> productStateFlow;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final C12365g _viewState;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC12362d viewState;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ProductDetailFeatureFlags> _featureFlags;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final pv.P<ProductDetailFeatureFlags> featureFlags;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$removeFromShoppingList$1", f = "ProductDetailComposeViewModel.kt", l = {RecyclerView.m.FLAG_MOVED}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$A */
    static final class A extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f109313a;

        /* renamed from: b, reason: collision with root package name */
        Object f109314b;

        /* renamed from: c, reason: collision with root package name */
        Object f109315c;

        /* renamed from: d, reason: collision with root package name */
        Object f109316d;

        /* renamed from: e, reason: collision with root package name */
        int f109317e;

        /* renamed from: f, reason: collision with root package name */
        int f109318f;

        /* renamed from: g, reason: collision with root package name */
        int f109319g;

        /* renamed from: h, reason: collision with root package name */
        int f109320h;

        /* renamed from: i, reason: collision with root package name */
        int f109321i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f109322j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ nk.f f109324l;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$removeFromShoppingList$1$4$1", f = "ProductDetailComposeViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$A$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f109325a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12358e0 f109326b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C12358e0 c12358e0, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f109326b = c12358e0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f109326b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f109325a == 0) {
                    ResultKt.b(obj);
                    this.f109326b._viewState.J().add(new InterfaceC12363e.UpdateShoppingOrFavoriteListFailed(null, C18546a.f173202i, C18546a.f173203j, 1, null));
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            A a10 = C12358e0.this.new A(this.f109324l, continuation);
            a10.f109322j = obj;
            return a10;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        A(nk.f fVar, Continuation<? super A> continuation) {
            super(2, continuation);
            this.f109324l = fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((A) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            Object next;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109321i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f109322j;
                    C12358e0 c12358e0 = C12358e0.this;
                    nk.f fVar = this.f109324l;
                    Result.Companion companion = Result.INSTANCE;
                    Eq.b bVar = c12358e0.shoppingListRepository;
                    this.f109322j = interfaceC15783O;
                    this.f109313a = interfaceC15783O;
                    this.f109314b = this;
                    this.f109315c = this;
                    this.f109316d = interfaceC15783O;
                    this.f109317e = 0;
                    this.f109318f = 0;
                    this.f109319g = 0;
                    this.f109320h = 0;
                    this.f109321i = 1;
                    obj = bVar.p(fVar, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                mv.E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            nk.f fVar2 = this.f109324l;
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
                qw.a.INSTANCE.k("Removed product from shopping list successfully.", new Object[0]);
            }
            C12358e0 c12358e02 = C12358e0.this;
            Throwable thE = Result.e(objB2);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "Failed to remove shopping list entry.", new Object[0]);
                C15809k.d(androidx.view.d0.a(c12358e02), null, null, new a(c12358e02, null), 3, null);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$resetQuantitySteppers$1", f = "ProductDetailComposeViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$B */
    static final class B extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109327a;

        B(Continuation<? super B> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12358e0.this.new B(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((B) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f109327a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            List<SuggestedProductCarouselDecorator> value = C12358e0.this._viewState.O().getValue();
            InterfaceC5872l0<List<SuggestedProductCarouselDecorator>> interfaceC5872l0O = C12358e0.this._viewState.O();
            List<SuggestedProductCarouselDecorator> list = value;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(SuggestedProductCarouselDecorator.v((SuggestedProductCarouselDecorator) it.next(), null, null, null, null, null, null, false, false, null, null, null, null, 0.0d, false, true, null, null, null, false, null, 1023999, null));
            }
            interfaceC5872l0O.setValue(arrayList);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel", f = "ProductDetailComposeViewModel.kt", l = {2456}, m = "rxAwait-gIAlu-s")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$C */
    static final class C<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f109329a;

        /* renamed from: b, reason: collision with root package name */
        int f109330b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f109331c;

        /* renamed from: e, reason: collision with root package name */
        int f109333e;

        C(Continuation<? super C> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f109331c = obj;
            this.f109333e |= Integer.MIN_VALUE;
            Object objN2 = C12358e0.this.n2(null, this);
            return objN2 == IntrinsicsKt.f() ? objN2 : Result.a(objN2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\b\u00028\u0000H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b9¨\u0006\u000e"}, d2 = {"com/meijer/mobile/meijer/activity/find/viewmodel/e0$D", "Lio/reactivex/w;", "LJu/b;", "d", "", "onSubscribe", "(LJu/b;)V", "t", "onSuccess", "(Ljava/lang/Object;)V", "", "error", "onError", "(Ljava/lang/Throwable;)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$D */
    public static final class D<T> implements io.reactivex.w<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC15815n<Result<? extends T>> f109334a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C12358e0 f109335b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$D$a */
        static final class a implements Function1<Throwable, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ju.b f109336a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12358e0 f109337b;

            a(Ju.b bVar, C12358e0 c12358e0) {
                this.f109336a = bVar;
                this.f109337b = c12358e0;
            }

            public final void a(Throwable th2) {
                Dk.a.a(this.f109336a, this.f109337b.disposables);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                a(th2);
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        D(InterfaceC15815n<? super Result<? extends T>> interfaceC15815n, C12358e0 c12358e0) {
            this.f109334a = interfaceC15815n;
            this.f109335b = c12358e0;
        }

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onError(Throwable error) {
            Intrinsics.j(error, "error");
            InterfaceC15815n<Result<? extends T>> interfaceC15815n = this.f109334a;
            Result.Companion companion = Result.INSTANCE;
            interfaceC15815n.resumeWith(Result.b(Result.a(Result.b(ResultKt.a(error)))));
        }

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onSubscribe(Ju.b d10) {
            Intrinsics.j(d10, "d");
            this.f109334a.F(new a(d10, this.f109335b));
        }

        @Override // io.reactivex.w, io.reactivex.i
        public void onSuccess(T t10) {
            Intrinsics.j(t10, "t");
            this.f109334a.resumeWith(Result.b(Result.a(Result.b(t10))));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$E */
    /* synthetic */ class E extends FunctionReferenceImpl implements Function1<Coupon, Unit> {
        E(Object obj) {
            super(1, obj, C12358e0.class, "clipCoupon", "clipCoupon(Lcom/meijer/mobile/coupon/model/common/Coupon;)V", 0);
        }

        public final void a(Coupon p02) {
            Intrinsics.j(p02, "p0");
            ((C12358e0) this.receiver).Y0(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Coupon coupon) {
            a(coupon);
            return Unit.f143329a;
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
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$sendCriteoBeacon$1", f = "ProductDetailComposeViewModel.kt", l = {2237}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$G */
    static final class G extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f109338a;

        /* renamed from: b, reason: collision with root package name */
        Object f109339b;

        /* renamed from: c, reason: collision with root package name */
        Object f109340c;

        /* renamed from: d, reason: collision with root package name */
        Object f109341d;

        /* renamed from: e, reason: collision with root package name */
        Object f109342e;

        /* renamed from: f, reason: collision with root package name */
        Object f109343f;

        /* renamed from: g, reason: collision with root package name */
        Object f109344g;

        /* renamed from: h, reason: collision with root package name */
        Object f109345h;

        /* renamed from: i, reason: collision with root package name */
        Object f109346i;

        /* renamed from: j, reason: collision with root package name */
        int f109347j;

        /* renamed from: k, reason: collision with root package name */
        int f109348k;

        /* renamed from: l, reason: collision with root package name */
        int f109349l;

        /* renamed from: m, reason: collision with root package name */
        int f109350m;

        /* renamed from: n, reason: collision with root package name */
        int f109351n;

        /* renamed from: o, reason: collision with root package name */
        int f109352o;

        /* renamed from: p, reason: collision with root package name */
        int f109353p;

        /* renamed from: q, reason: collision with root package name */
        private /* synthetic */ Object f109354q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ List<String> f109355r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ C12358e0 f109356s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        G(List<String> list, C12358e0 c12358e0, Continuation<? super G> continuation) {
            super(2, continuation);
            this.f109355r = list;
            this.f109356s = c12358e0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            G g10 = new G(this.f109355r, this.f109356s, continuation);
            g10.f109354q = obj;
            return g10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((G) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.G.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$showRequireLoginAlert$1", f = "ProductDetailComposeViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$H */
    static final class H extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109357a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f109359c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        H(int i10, Continuation<? super H> continuation) {
            super(2, continuation);
            this.f109359c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12358e0.this.new H(this.f109359c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((H) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f109357a == 0) {
                ResultKt.b(obj);
                C12358e0.this._viewState.J().add(new InterfaceC12363e.RequireLogin(null, this.f109359c, 1, 0 == true ? 1 : 0));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$submitBazaarVoiceFeedback$1", f = "ProductDetailComposeViewModel.kt", l = {1838}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$I */
    static final class I extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f109360a;

        /* renamed from: b, reason: collision with root package name */
        Object f109361b;

        /* renamed from: c, reason: collision with root package name */
        Object f109362c;

        /* renamed from: d, reason: collision with root package name */
        Object f109363d;

        /* renamed from: e, reason: collision with root package name */
        int f109364e;

        /* renamed from: f, reason: collision with root package name */
        int f109365f;

        /* renamed from: g, reason: collision with root package name */
        int f109366g;

        /* renamed from: h, reason: collision with root package name */
        int f109367h;

        /* renamed from: i, reason: collision with root package name */
        int f109368i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f109369j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f109371l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Kp.a f109372m;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            I i10 = C12358e0.this.new I(this.f109371l, this.f109372m, continuation);
            i10.f109369j = obj;
            return i10;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I(String str, Kp.a aVar, Continuation<? super I> continuation) {
            super(2, continuation);
            this.f109371l = str;
            this.f109372m = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((I) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109368i;
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
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f109369j;
                    C12358e0 c12358e0 = C12358e0.this;
                    String str = this.f109371l;
                    Kp.a aVar = this.f109372m;
                    Result.Companion companion = Result.INSTANCE;
                    Kp.g gVar = c12358e0.bazaarVoiceManager;
                    this.f109369j = interfaceC15783O;
                    this.f109360a = interfaceC15783O;
                    this.f109361b = this;
                    this.f109362c = this;
                    this.f109363d = interfaceC15783O;
                    this.f109364e = 0;
                    this.f109365f = 0;
                    this.f109366g = 0;
                    this.f109367h = 0;
                    this.f109368i = 1;
                    if (gVar.d(str, aVar, this) == objF) {
                        return objF;
                    }
                }
                objB = Result.b(Unit.f143329a);
            } catch (Exception e10) {
                mv.E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            C12358e0 c12358e02 = C12358e0.this;
            Kp.a aVar2 = this.f109372m;
            if (Result.h(objB)) {
                c12358e02._viewState.J().add(new InterfaceC12363e.d.BazaarVoiceFeedbackSubmitted(null, aVar2, i11, 0 == true ? 1 : 0));
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "submitFeedback: Failed to get submitFeedback", new Object[0]);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$trackProductAnalytics$1$1$1", f = "ProductDetailComposeViewModel.kt", l = {1875}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$J */
    static final class J extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f109373a;

        /* renamed from: b, reason: collision with root package name */
        Object f109374b;

        /* renamed from: c, reason: collision with root package name */
        Object f109375c;

        /* renamed from: d, reason: collision with root package name */
        Object f109376d;

        /* renamed from: e, reason: collision with root package name */
        Object f109377e;

        /* renamed from: f, reason: collision with root package name */
        int f109378f;

        /* renamed from: g, reason: collision with root package name */
        int f109379g;

        /* renamed from: h, reason: collision with root package name */
        int f109380h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ProductFullDetails f109381i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C12358e0 f109382j;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new J(this.f109381i, this.f109382j, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        J(ProductFullDetails productFullDetails, C12358e0 c12358e0, Continuation<? super J> continuation) {
            super(2, continuation);
            this.f109381i = productFullDetails;
            this.f109382j = c12358e0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((J) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            Iterable iterable;
            C12358e0 c12358e0;
            int i10;
            Object objF = IntrinsicsKt.f();
            int i11 = this.f109380h;
            if (i11 != 0) {
                if (i11 == 1) {
                    i10 = this.f109378f;
                    it = (Iterator) this.f109375c;
                    c12358e0 = (C12358e0) this.f109374b;
                    iterable = (Iterable) this.f109373a;
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                List<String> listE = this.f109381i.getBeaconInfo().e();
                C12358e0 c12358e02 = this.f109382j;
                it = listE.iterator();
                iterable = listE;
                c12358e0 = c12358e02;
                i10 = 0;
            }
            while (it.hasNext()) {
                Object next = it.next();
                String str = (String) next;
                C16753b c16753b = c12358e0.beaconClient;
                String strF = Bk.b.f(str);
                this.f109373a = iterable;
                this.f109374b = c12358e0;
                this.f109375c = it;
                this.f109376d = next;
                this.f109377e = str;
                this.f109378f = i10;
                this.f109379g = 0;
                this.f109380h = 1;
                if (c16753b.a(strF, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$updateCart$1", f = "ProductDetailComposeViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$K */
    static final class K extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109383a;

        K(Continuation<? super K> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12358e0.this.new K(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((K) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f109383a == 0) {
                ResultKt.b(obj);
                C12358e0.this._viewState.J().add(new InterfaceC12363e.RefreshCartOnListPageEvent(null, true, 1 == true ? 1 : 0, 0 == true ? 1 : 0));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$updateItem$1", f = "ProductDetailComposeViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$L */
    static final class L extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109385a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC12364f.UpdateItem f109386b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C12358e0 f109387c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        L(InterfaceC12364f.UpdateItem updateItem, C12358e0 c12358e0, Continuation<? super L> continuation) {
            super(2, continuation);
            this.f109386b = updateItem;
            this.f109387c = c12358e0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new L(this.f109386b, this.f109387c, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(C12358e0 c12358e0) {
            c12358e0.B2(Cj.o.f5056d);
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((L) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(C12358e0 c12358e0, InterfaceC12364f.UpdateItem updateItem) {
            c12358e0._viewState.G().setValue(InterfaceC12359a.d.f109397a);
            if (c12358e0.quantityChangeForFBT) {
                c12358e0.quantityChangeForFBT = false;
            }
            c12358e0.R2(((AbstractC12245f.Update) updateItem.getAction()).getNewProductQuantity().getQuantity());
            return Unit.f143329a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f109385a == 0) {
                ResultKt.b(obj);
                if (this.f109386b.getAction() instanceof AbstractC12245f.Update) {
                    final C12358e0 c12358e0 = this.f109387c;
                    final InterfaceC12364f.UpdateItem updateItem = this.f109386b;
                    Function0 function0 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.B0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C12358e0.L.k(c12358e0, updateItem);
                        }
                    };
                    final C12358e0 c12358e02 = this.f109387c;
                    c12358e0.z1(function0, new Function0() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.C0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C12358e0.L.l(c12358e02);
                        }
                    });
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$viewInFavoriteList$1", f = "ProductDetailComposeViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$M */
    static final class M extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109388a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ nk.c f109390c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12358e0.this.new M(this.f109390c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        M(nk.c cVar, Continuation<? super M> continuation) {
            super(2, continuation);
            this.f109390c = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((M) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f109388a == 0) {
                ResultKt.b(obj);
                C12358e0.this._viewState.J().add(new InterfaceC12363e.ViewOnFavoriteList(null, this.f109390c, 1, 0 == true ? 1 : 0));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$viewInShoppingList$1", f = "ProductDetailComposeViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$N */
    static final class N extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109391a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ nk.c f109393c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12358e0.this.new N(this.f109393c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        N(nk.c cVar, Continuation<? super N> continuation) {
            super(2, continuation);
            this.f109393c = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((N) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f109391a == 0) {
                ResultKt.b(obj);
                C12358e0.this._viewState.J().add(new InterfaceC12363e.ViewOnShoppingList(null, this.f109393c, 1, 0 == true ? 1 : 0));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a;", "", "b", "d", "e", "a", "c", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a$b;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a$c;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a$d;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a$e;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$a, reason: case insensitive filesystem */
    public interface InterfaceC12359a {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a;", "", "text", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$a$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class AddToCart implements InterfaceC12359a {

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
                this((i11 & 1) != 0 ? C17284b.f163315d : i10);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a$c;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a;", "", "text", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$a$c, reason: from toString */
        public static final /* data */ class InStore implements InterfaceC12359a {

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
                this((i11 & 1) != 0 ? com.meijer.mobile.meijer.Y.f100538Lc : i10);
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a$b;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$a$b */
        public static final /* data */ class b implements InterfaceC12359a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f109395a = new b();

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
        public static final /* data */ class d implements InterfaceC12359a {

            /* renamed from: a, reason: collision with root package name */
            public static final d f109397a = new d();

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
        public static final /* data */ class e implements InterfaceC12359a {

            /* renamed from: a, reason: collision with root package name */
            public static final e f109398a = new e();

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

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\f\u0010\tJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u0004\u0018\u00010\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00072\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\tJ\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010 \u001a\u00020\u0007\"\u0004\b\u0000\u0010\u001c2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u00000\u001dH\u0016¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$b;", "Lwr/a;", "<init>", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0;)V", "Luk/c;", "Lfj/j;", "changeRes", "", "j", "(Luk/c;)V", "entryChange", "i", "f", "", "k", "()Ljava/lang/String;", "d", "(Luk/c;)Ljava/lang/String;", "e", "Lfj/C;", "cartResource", "observeCart", "LJu/a;", "getDisposable", "()LJu/a;", "Lur/a;", "processedRequest", "(Lur/a;Luk/c;)V", "T", "Luk/a;", "Lvr/a;", "challenge", "throwChallenge", "(Luk/a;)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$b, reason: case insensitive filesystem */
    public final class C12360b implements InterfaceC17909a {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$b$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EntryChange.c.values().length];
                try {
                    iArr[EntryChange.c.f131920b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EntryChange.c.f131922d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EntryChange.c.f131921c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EntryChange.c.f131923e.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$CartInteractionListenerImpl$handleCartAddition$3", f = "ProductDetailComposeViewModel.kt", l = {1221}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$b$b, reason: collision with other inner class name */
        static final class C1649b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f109400a;

            /* renamed from: b, reason: collision with root package name */
            Object f109401b;

            /* renamed from: c, reason: collision with root package name */
            Object f109402c;

            /* renamed from: d, reason: collision with root package name */
            Object f109403d;

            /* renamed from: e, reason: collision with root package name */
            int f109404e;

            /* renamed from: f, reason: collision with root package name */
            int f109405f;

            /* renamed from: g, reason: collision with root package name */
            int f109406g;

            /* renamed from: h, reason: collision with root package name */
            int f109407h;

            /* renamed from: i, reason: collision with root package name */
            int f109408i;

            /* renamed from: j, reason: collision with root package name */
            private /* synthetic */ Object f109409j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ C12358e0 f109410k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1649b(C12358e0 c12358e0, Continuation<? super C1649b> continuation) {
                super(2, continuation);
                this.f109410k = c12358e0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C1649b c1649b = new C1649b(this.f109410k, continuation);
                c1649b.f109409j = obj;
                return c1649b;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C1649b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objB;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f109408i;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f109409j;
                        C12358e0 c12358e0 = this.f109410k;
                        Result.Companion companion = Result.INSTANCE;
                        wr.f fVar = c12358e0.cartInteractor;
                        this.f109409j = interfaceC15783O;
                        this.f109400a = interfaceC15783O;
                        this.f109401b = this;
                        this.f109402c = this;
                        this.f109403d = interfaceC15783O;
                        this.f109404e = 0;
                        this.f109405f = 0;
                        this.f109406g = 0;
                        this.f109407h = 0;
                        this.f109408i = 1;
                        if (wr.f.n(fVar, false, false, this, 3, null) == objF) {
                            return objF;
                        }
                    }
                    objB = Result.b(Unit.f143329a);
                } catch (Exception e10) {
                    mv.E0.i(getContext());
                    Result.Companion companion2 = Result.INSTANCE;
                    objB = Result.b(ResultKt.a(e10));
                }
                Throwable thE = Result.e(objB);
                if (thE != null) {
                    qw.a.INSTANCE.l(thE, "fetchLatestCart failed in ProductDetailViewModelCompose", new Object[0]);
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$CartInteractionListenerImpl$observeCart$1", f = "ProductDetailComposeViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$b$c */
        static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f109411a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12358e0 f109412b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C12358e0 c12358e0, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f109412b = c12358e0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new c(this.f109412b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f109411a == 0) {
                    ResultKt.b(obj);
                    this.f109412b._viewState.J().add(new InterfaceC12363e.RefreshCartOnListPageEvent(null, false, 1, 0 == true ? 1 : 0));
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$CartInteractionListenerImpl$processedRequest$1", f = "ProductDetailComposeViewModel.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$b$d */
        static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f109413a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12358e0 f109414b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC17454a f109415c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new d(this.f109414b, this.f109415c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(C12358e0 c12358e0, AbstractC17454a abstractC17454a, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f109414b = c12358e0;
                this.f109415c = abstractC17454a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f109413a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                List<SuggestedProductCarouselDecorator> value = this.f109414b._viewState.O().getValue();
                InterfaceC5872l0<List<SuggestedProductCarouselDecorator>> interfaceC5872l0O = this.f109414b._viewState.O();
                List<SuggestedProductCarouselDecorator> list = value;
                AbstractC17454a abstractC17454a = this.f109415c;
                ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
                for (SuggestedProductCarouselDecorator suggestedProductCarouselDecoratorV : list) {
                    if (Intrinsics.e(suggestedProductCarouselDecoratorV.getProduct().getCode(), abstractC17454a.getProductCode())) {
                        suggestedProductCarouselDecoratorV = SuggestedProductCarouselDecorator.v(suggestedProductCarouselDecoratorV, null, null, null, null, null, null, false, false, null, null, null, null, 0.0d, false, false, null, null, null, false, null, 1040383, null);
                    }
                    arrayList.add(suggestedProductCarouselDecoratorV);
                }
                interfaceC5872l0O.setValue(arrayList);
                return Unit.f143329a;
            }
        }

        public C12360b() {
        }

        private final String d(uk.c<EntryChange> entryChange) {
            Entry entry;
            ProductFullDetails productFullDetailsM;
            if (C12358e0.this.quantityChangeForFBT) {
                Iterator<SuggestedProductCarouselDecorator> it = C12358e0.this._viewState.O().getValue().iterator();
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
            return C12358e0.this.quantityChangeForFBT ? "edaa - Frequently Bought Together" : "product details page";
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:62:0x014c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void f(uk.c<fj.EntryChange> r82) {
            /*
                Method dump skipped, instructions count: 714
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.C12360b.f(uk.c):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(TrackingData track) {
            Intrinsics.j(track, "$this$track");
            track.h("errorMessage", "add to cart error");
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit h(TrackingData track) {
            Intrinsics.j(track, "$this$track");
            track.h("errorMessage", "add to cart error");
            return Unit.f143329a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.util.UUID, kotlin.jvm.internal.DefaultConstructorMarker] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5 */
        private final void i(uk.c<EntryChange> entryChange) {
            Entry entry;
            ProductFullDetails productFullDetailsM;
            ProductFullDetails productFullDetailsM2;
            int i10 = 1;
            ProductSponsorship productSponsorshipA = 0;
            productSponsorshipA = 0;
            productSponsorshipA = 0;
            if (entryChange instanceof c.Failure) {
                C12358e0.this._viewState.J().add(new InterfaceC12363e.d.UpdateToCartFailed(productSponsorshipA, C17284b.f163293P0, i10, productSponsorshipA));
                return;
            }
            if (entryChange instanceof c.Success) {
                W.ComplexPromo complexPromoV1 = C12358e0.this.v1();
                c.Success success = (c.Success) entryChange;
                EntryChange entryChange2 = (EntryChange) success.a();
                if (entryChange2 != null) {
                    C12358e0 c12358e0 = C12358e0.this;
                    pp.d dVar = c12358e0.productMetadataStore;
                    Entry entry2 = entryChange2.getEntry();
                    boolean zC = dVar.c((entry2 == null || (productFullDetailsM2 = entry2.m()) == null) ? null : productFullDetailsM2.getCode());
                    int i11 = a.$EnumSwitchMapping$0[entryChange2.getStatusCode().ordinal()];
                    if (i11 != 1 && i11 != 2) {
                        if (i11 != 3) {
                            return;
                        }
                        c12358e0._viewState.J().add(new InterfaceC12363e.d.UpdateToCartFailed(productSponsorshipA, C17284b.f163293P0, i10, productSponsorshipA));
                    } else if (entryChange2.getExpectedQuantityChange() >= 0.0d) {
                        if (entryChange2.getExpectedQuantityChange() > 0.0d) {
                            c12358e0.analyticsEngine.k(C2898u.f1904a.Y(c12358e0.cartId, c12358e0.getCampaignIdValue(), entryChange2, d(entryChange), entryChange, c12358e0.sponsorshipsDataStore, e(), complexPromoV1, zC));
                        }
                    } else {
                        EntryChange entryChange3 = (EntryChange) success.a();
                        if (entryChange3 != null && (entry = entryChange3.getEntry()) != null && (productFullDetailsM = entry.m()) != null) {
                            productSponsorshipA = c12358e0.sponsorshipsDataStore.a(productFullDetailsM.getCode());
                        }
                        c12358e0.analyticsEngine.k(C2898u.f1904a.a0(c12358e0.cartId, entryChange2, zC, d(entryChange), productSponsorshipA, e()));
                    }
                }
            }
        }

        private final String k() {
            if (!C12358e0.this.getViewState().z().getValue().booleanValue() || C12358e0.this.getViewState().K().isEmpty()) {
                return null;
            }
            return CollectionsKt.B0(C12358e0.this.getViewState().K().entrySet(), "-", null, null, 0, null, new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.h0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C12358e0.C12360b.l((Map.Entry) obj);
                }
            }, 30, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence l(Map.Entry entry) {
            Intrinsics.j(entry, "<destruct>");
            return ((String) entry.getKey()) + ':' + ((String) entry.getValue());
        }

        @Override // wr.InterfaceC17909a
        /* renamed from: getDisposable */
        public Ju.a getDisposables() {
            return C12358e0.this.disposables;
        }

        @Override // wr.InterfaceC17909a
        public void observeCart(uk.c<ShoppingCart> cartResource) {
            if (Intrinsics.e(C12358e0.this._viewState.m().getValue().getId(), new ProductFullDetails(null, null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -1, 268435455, null))) {
                C15809k.d(androidx.view.d0.a(C12358e0.this), null, null, new c(C12358e0.this, null), 3, null);
            }
        }

        @Override // wr.InterfaceC17909a
        public void processedRequest(AbstractC17454a processedRequest, uk.c<EntryChange> entryChange) {
            Intrinsics.j(processedRequest, "processedRequest");
            Intrinsics.j(entryChange, "entryChange");
            if (entryChange instanceof c.Failure) {
                C12358e0.this.k2();
            } else if (entryChange instanceof c.Success) {
                C15809k.d(androidx.view.d0.a(C12358e0.this), null, null, new d(C12358e0.this, processedRequest, null), 3, null);
            }
            if (processedRequest instanceof AbstractC17454a.Add) {
                f(entryChange);
            } else if (processedRequest instanceof AbstractC17454a.Update) {
                i(entryChange);
            } else if (processedRequest instanceof AbstractC17454a.Remove) {
                j(entryChange);
            } else if (!Intrinsics.e(processedRequest, AbstractC17454a.b.f164334b)) {
                throw new NoWhenBranchMatchedException();
            }
            C12358e0.this.N2();
        }

        @Override // wr.InterfaceC17909a
        public <T> void throwChallenge(AbstractC17440a<AbstractC17720a, T> challenge) {
            Intrinsics.j(challenge, "challenge");
            if (!(challenge.f() instanceof AbstractC17720a.ChokingHazardChallenge)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC17720a abstractC17720aF = challenge.f();
            Intrinsics.h(abstractC17720aF, "null cannot be cast to non-null type com.meijer.mobile.ui.cart.challenges.CartChallenge.ChokingHazardChallenge");
            wr.f.B(C12358e0.this.cartInteractor, new AbstractC17440a.Accept(((AbstractC17720a.ChokingHazardChallenge) abstractC17720aF).a().b(), null, null, 4, null), false, null, 6, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.util.UUID, kotlin.jvm.internal.DefaultConstructorMarker] */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5 */
        private final void j(uk.c<EntryChange> changeRes) {
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
                    productSponsorshipA = C12358e0.this.sponsorshipsDataStore.a(productFullDetailsM2.getCode());
                } else {
                    productSponsorshipA = null;
                }
                InterfaceC14523a interfaceC14523a = C12358e0.this.analyticsEngine;
                C2898u c2898u = C2898u.f1904a;
                String str = C12358e0.this.cartId;
                pp.d dVar = C12358e0.this.productMetadataStore;
                EntryChange entryChangeA3 = changeRes.a();
                if (entryChangeA3 != null && (entry = entryChangeA3.getEntry()) != null && (productFullDetailsM = entry.m()) != null) {
                    code = productFullDetailsM.getCode();
                }
                interfaceC14523a.k(c2898u.c0(str, dVar.c(code), changeRes.a(), d(changeRes), productSponsorshipA, e()));
                return;
            }
            C12358e0.this._viewState.J().add(new InterfaceC12363e.d.UpdateToCartFailed(code, C17284b.f163293P0, i10, code));
        }
    }

    @Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0010R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0010R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0010R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0010R \u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\b0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0010R \u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\b0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0010R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0010R \u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\b0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0010R&\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000204030\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0010R \u00109\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000204038&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R&\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000204030\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0010R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020<0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0010R\u0014\u0010B\u001a\u00020?8&X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u0010R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u0010R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u0010R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010\u0010R\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u0010R\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010\u0010R\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010\u0010R\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u0010R\u001c\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010S0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bT\u0010\u0010R\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020V0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bW\u0010\u0010R\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020Y0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\\À\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$d;", "", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "", "I", "()Lkotlin/jvm/functions/Function1;", "onUpdate", "", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;", "J", "()Ljava/util/List;", "effectsInMotion", "Landroidx/compose/runtime/z1;", "", "y", "()Landroidx/compose/runtime/z1;", "isLoadingVisible", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a;", "G", "bottomActionBarState", "LCo/h;", "w", "domain", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/h1;", "m", "product", "Lvs/m;", "l", "price", "LKp/c;", "F", "reviews", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/m1;", "P", "storeLocation", "Lvs/l;", "A", "nutritionLabel", "LXr/c;", "a", "coupons", "Lcom/meijer/mobile/meijer/activity/find/productdetail/o2;", "O", "frequentlyBoughtTogether", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/w;", "T", "complexPromo", "Lcn/j;", "D", "productVariants", "", "", "S", "initialSelectedVariants", "K", "()Ljava/util/Map;", "allInteractedVariants", "E", "selectedVariant", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/v;", "Q", "cartEntry", "Landroidx/compose/runtime/Q;", "N", "()Landroidx/compose/runtime/Q;", "cartItemCount", "H", "isOnShoppingList", "L", "isOnFavoritesList", "z", "isVariantInteracted", "o", "isEligibleForCart", "B", "isBuyAgain", "x", "isLowStock", "n", "isOutOfStock", "C", "isInStoreOnly", "Lgi/d;", "R", "googleAdData", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/b;", "M", "criteoBeaconTracker", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/r;", "U", "frequentlyBoughtTogetherProductsLoadingStatus", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$d, reason: case insensitive filesystem */
    public interface InterfaceC12362d {
        androidx.compose.runtime.z1<ProductNutritionLabelDecorator> A();

        androidx.compose.runtime.z1<Boolean> B();

        androidx.compose.runtime.z1<Boolean> C();

        androidx.compose.runtime.z1<List<ProductVariantGroupDecorator>> D();

        androidx.compose.runtime.z1<Map<String, String>> E();

        androidx.compose.runtime.z1<ProductReviewFullDetails> F();

        androidx.compose.runtime.z1<InterfaceC12359a> G();

        androidx.compose.runtime.z1<Boolean> H();

        Function1<InterfaceC12364f, Unit> I();

        List<InterfaceC12363e> J();

        Map<String, String> K();

        androidx.compose.runtime.z1<Boolean> L();

        androidx.compose.runtime.z1<C12328b> M();

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
    public interface InterfaceC12363e {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;", "Ljava/util/UUID;", "uuid", "", "shouldRefresh", "<init>", "(Ljava/util/UUID;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "b", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$a, reason: from toString */
        public static final /* data */ class RefreshCartOnListPageEvent implements InterfaceC12363e {

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
        public static final /* data */ class RequireLogin implements InterfaceC12363e {

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
        public static final /* data */ class ShowError implements InterfaceC12363e {

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

        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006 À\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;", "i", "k", "f", "a", "o", "c", "b", "g", "h", "j", "n", "l", "m", "e", "d", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$b;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$c;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$d;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$e;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$f;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$g;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$h;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$i;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$j;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$k;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$l;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$m;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$n;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$o;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d */
        public interface d extends InterfaceC12363e {

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0015\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "Ljava/util/UUID;", "uuid", "", "messageResId", "actionResId", "Lfj/i;", "entry", "<init>", "(Ljava/util/UUID;IILfj/i;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "b", "I", "c", "d", "Lfj/i;", "()Lfj/i;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$d;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "Ljava/util/UUID;", "uuid", "<init>", "(Ljava/util/UUID;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$d, reason: collision with other inner class name and from toString */
            public static final /* data */ class CancelSubscriptionFailure implements d {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final UUID uuid;

                /* JADX WARN: Multi-variable type inference failed */
                public CancelSubscriptionFailure() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof CancelSubscriptionFailure) && Intrinsics.e(this.uuid, ((CancelSubscriptionFailure) other).uuid);
                }

                public int hashCode() {
                    return this.uuid.hashCode();
                }

                public String toString() {
                    return "CancelSubscriptionFailure(uuid=" + this.uuid + ')';
                }

                public CancelSubscriptionFailure(UUID uuid) {
                    Intrinsics.j(uuid, "uuid");
                    this.uuid = uuid;
                }

                public /* synthetic */ CancelSubscriptionFailure(UUID uuid, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? UUID.randomUUID() : uuid);
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$e;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "Ljava/util/UUID;", "uuid", "<init>", "(Ljava/util/UUID;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$e, reason: collision with other inner class name and from toString */
            public static final /* data */ class CancelSubscriptionSuccess implements d {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final UUID uuid;

                /* JADX WARN: Multi-variable type inference failed */
                public CancelSubscriptionSuccess() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof CancelSubscriptionSuccess) && Intrinsics.e(this.uuid, ((CancelSubscriptionSuccess) other).uuid);
                }

                public int hashCode() {
                    return this.uuid.hashCode();
                }

                public String toString() {
                    return "CancelSubscriptionSuccess(uuid=" + this.uuid + ')';
                }

                public CancelSubscriptionSuccess(UUID uuid) {
                    Intrinsics.j(uuid, "uuid");
                    this.uuid = uuid;
                }

                public /* synthetic */ CancelSubscriptionSuccess(UUID uuid, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? UUID.randomUUID() : uuid);
                }
            }

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$f;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "Ljava/util/UUID;", "uuid", "Lnk/c;", "product", "<init>", "(Ljava/util/UUID;Lnk/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "b", "Lnk/c;", "()Lnk/c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$f, reason: from toString */
            public static final /* data */ class FavoriteListItemAdded implements d {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final UUID uuid;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final nk.c product;

                public FavoriteListItemAdded(UUID uuid, nk.c product) {
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
                public final nk.c getProduct() {
                    return this.product;
                }

                public /* synthetic */ FavoriteListItemAdded(UUID uuid, nk.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? UUID.randomUUID() : uuid, cVar);
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$g;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "Ljava/util/UUID;", "uuid", "<init>", "(Ljava/util/UUID;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$g, reason: from toString */
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

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$h;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "Ljava/util/UUID;", "uuid", "<init>", "(Ljava/util/UUID;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$h, reason: from toString */
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

            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$i;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "uuid", "Lnk/f;", "b", "Lnk/f;", "()Lnk/f;", "product", "c", "I", "messageResId", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$i, reason: from toString */
            public static final /* data */ class ProductLoadError implements d {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final UUID uuid;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final nk.f product;

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
                public final nk.f getProduct() {
                    return this.product;
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$j;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "Ljava/util/UUID;", "uuid", "<init>", "(Ljava/util/UUID;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$j, reason: from toString */
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

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$k;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "Ljava/util/UUID;", "uuid", "Lnk/c;", "product", "<init>", "(Ljava/util/UUID;Lnk/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "b", "Lnk/c;", "()Lnk/c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$k, reason: from toString */
            public static final /* data */ class ShoppingListItemAdded implements d {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final UUID uuid;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final nk.c product;

                public ShoppingListItemAdded(UUID uuid, nk.c product) {
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
                public final nk.c getProduct() {
                    return this.product;
                }

                public /* synthetic */ ShoppingListItemAdded(UUID uuid, nk.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i10 & 1) != 0 ? UUID.randomUUID() : uuid, cVar);
                }
            }

            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$l;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "Ljava/util/UUID;", "uuid", "", "titleResId", "LPk/a;", "coupon", "<init>", "(Ljava/util/UUID;ILPk/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "b", "I", "c", "LPk/a;", "()LPk/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$l, reason: from toString */
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

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$m;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "Ljava/util/UUID;", "uuid", "<init>", "(Ljava/util/UUID;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$m, reason: from toString */
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

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$n;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "Ljava/util/UUID;", "uuid", "LPk/a;", "coupon", "<init>", "(Ljava/util/UUID;LPk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "b", "LPk/a;", "()LPk/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$n, reason: from toString */
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

            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d$o;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$d;", "Ljava/util/UUID;", "uuid", "", "messageResId", "<init>", "(Ljava/util/UUID;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "b", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$o, reason: from toString */
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
        public static final /* data */ class UpdateShoppingOrFavoriteListFailed implements InterfaceC12363e {

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

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$f;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;", "Ljava/util/UUID;", "uuid", "Lnk/f;", "product", "<init>", "(Ljava/util/UUID;Lnk/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "b", "Lnk/f;", "()Lnk/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$f, reason: from toString */
        public static final /* data */ class ViewOnFavoriteList implements InterfaceC12363e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final UUID uuid;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final nk.f product;

            public ViewOnFavoriteList(UUID uuid, nk.f product) {
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
            public final nk.f getProduct() {
                return this.product;
            }

            public /* synthetic */ ViewOnFavoriteList(UUID uuid, nk.f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? UUID.randomUUID() : uuid, fVar);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e$g;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;", "Ljava/util/UUID;", "uuid", "Lnk/f;", "product", "<init>", "(Ljava/util/UUID;Lnk/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "getUuid", "()Ljava/util/UUID;", "b", "Lnk/f;", "()Lnk/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$g, reason: from toString */
        public static final /* data */ class ViewOnShoppingList implements InterfaceC12363e {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final UUID uuid;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final nk.f product;

            public ViewOnShoppingList(UUID uuid, nk.f product) {
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
            public final nk.f getProduct() {
                return this.product;
            }

            public /* synthetic */ ViewOnShoppingList(UUID uuid, nk.f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? UUID.randomUUID() : uuid, fVar);
            }
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "", "m", "k", "d", "h", "b", "i", "g", "l", "e", "j", "f", "c", "a", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$b;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$c;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$d;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$e;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$f;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$g;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$h;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$i;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$j;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$k;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$l;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$m;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$f, reason: case insensitive filesystem */
    public interface InterfaceC12364f {

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "", "isSuccess", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$f$a, reason: from toString */
        public static final /* data */ class CancelSubscriptionAction implements InterfaceC12364f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isSuccess;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CancelSubscriptionAction) && this.isSuccess == ((CancelSubscriptionAction) other).isSuccess;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isSuccess);
            }

            public String toString() {
                return "CancelSubscriptionAction(isSuccess=" + this.isSuccess + ')';
            }

            /* renamed from: a, reason: from getter */
            public final boolean getIsSuccess() {
                return this.isSuccess;
            }

            public CancelSubscriptionAction(boolean z10) {
                this.isSuccess = z10;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$b;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "LQk/a;", "action", "<init>", "(LQk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LQk/a;", "()LQk/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$f$b, reason: from toString */
        public static final /* data */ class Coupon implements InterfaceC12364f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Qk.a action;

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

            public Coupon(Qk.a action) {
                Intrinsics.j(action, "action");
                this.action = action;
            }

            /* renamed from: a, reason: from getter */
            public final Qk.a getAction() {
                return this.action;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$c;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;", "event", "<init>", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;", "()Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$f$c, reason: from toString */
        public static final /* data */ class DisposeEffect implements InterfaceC12364f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final InterfaceC12363e event;

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

            public DisposeEffect(InterfaceC12363e event) {
                Intrinsics.j(event, "event");
                this.event = event;
            }

            /* renamed from: a, reason: from getter */
            public final InterfaceC12363e getEvent() {
                return this.event;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$d;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "Llk/a;", "action", "<init>", "(Llk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llk/a;", "()Llk/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$f$d, reason: from toString */
        public static final /* data */ class FavoritesList implements InterfaceC12364f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC15516a action;

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

            public FavoritesList(AbstractC15516a action) {
                Intrinsics.j(action, "action");
                this.action = action;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC15516a getAction() {
                return this.action;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$e;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lnk/f;", "a", "Lnk/f;", "()Lnk/f;", "productIdentity", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$f$e, reason: from toString */
        public static final /* data */ class GetFrequentlyBoughtTogetherProducts implements InterfaceC12364f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final nk.f productIdentity;

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
            public final nk.f getProductIdentity() {
                return this.productIdentity;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$f;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "Lgi/a;", "analytics", "<init>", "(Lgi/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgi/a;", "()Lgi/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$f$f, reason: collision with other inner class name and from toString */
        public static final /* data */ class GoogleAdClicked implements InterfaceC12364f {

            /* renamed from: b, reason: collision with root package name */
            public static final int f109465b = GoogleAdAnalytics.f134240f;

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

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$g;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "", "isFromCLP", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$f$g, reason: from toString */
        public static final /* data */ class IsFromCLP implements InterfaceC12364f {

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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$h;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2;", "action", "<init>", "(Lcom/meijer/mobile/meijer/activity/find/productdetail/a2;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/find/productdetail/a2;", "()Lcom/meijer/mobile/meijer/activity/find/productdetail/a2;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$f$h, reason: from toString */
        public static final /* data */ class ProductReview implements InterfaceC12364f {

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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$i;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/n2;", "action", "<init>", "(Lcom/meijer/mobile/meijer/activity/find/productdetail/n2;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/find/productdetail/n2;", "()Lcom/meijer/mobile/meijer/activity/find/productdetail/n2;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$f$i, reason: from toString */
        public static final /* data */ class Reload implements InterfaceC12364f {

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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$k;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "Llk/b;", "action", "<init>", "(Llk/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llk/b;", "()Llk/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$f$k, reason: from toString */
        public static final /* data */ class ShoppingList implements InterfaceC12364f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC15517b action;

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

            public ShoppingList(AbstractC15517b action) {
                Intrinsics.j(action, "action");
                this.action = action;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC15517b getAction() {
                return this.action;
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$l;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "LCo/h;", "product", "", "quantityToUpdate", "<init>", "(LCo/h;D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "b", "D", "()D", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$f$l, reason: from toString */
        public static final /* data */ class UpdateCarouselProductEntry implements InterfaceC12364f {

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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$m;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/f;", "action", "<init>", "(Lcom/meijer/mobile/meijer/activity/find/productdetail/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/find/productdetail/f;", "()Lcom/meijer/mobile/meijer/activity/find/productdetail/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$f$m, reason: from toString */
        public static final /* data */ class UpdateItem implements InterfaceC12364f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC12245f action;

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

            public UpdateItem(AbstractC12245f action) {
                Intrinsics.j(action, "action");
                this.action = action;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC12245f getAction() {
                return this.action;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f$j;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$f$j */
        public static final /* data */ class j implements InterfaceC12364f {

            /* renamed from: a, reason: collision with root package name */
            public static final j f109470a = new j();

            public boolean equals(Object other) {
                return this == other || (other instanceof j);
            }

            public int hashCode() {
                return 1687093579;
            }

            public String toString() {
                return "ReviewSubmittedSuccessAction";
            }

            private j() {
            }
        }
    }

    @Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bC\b\u0002\u0018\u00002\u00020\u0001Bñ\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\t\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\t\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\t\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\t\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\t\u0012\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\t\u0012\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001a0\t\u0012\u0014\b\u0002\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001a0\t\u0012\u001a\b\u0002\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0!0\t\u0012\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0$\u0012\u001a\b\u0002\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0!0\t\u0012\u0010\b\u0002\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\t\u0012\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\t\u0012\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u00104\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u00105\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u00106\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u00108\u001a\u000207\u0012\u0010\b\u0002\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090\t\u0012\u000e\b\u0002\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\t\u0012\u000e\b\u0002\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\t\u0012\u000e\b\u0002\u0010?\u001a\b\u0012\u0004\u0012\u00020=0\t¢\u0006\u0004\b@\u0010AR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010K\u001a\u0004\bJ\u0010MR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010K\u001a\u0004\bP\u0010MR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010K\u001a\u0004\bR\u0010MR\"\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010K\u001a\u0004\bT\u0010MR\"\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010K\u001a\u0004\bV\u0010MR\"\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010K\u001a\u0004\bW\u0010MR\"\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010K\u001a\u0004\bX\u0010MR&\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010K\u001a\u0004\bS\u0010MR&\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001a0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010K\u001a\u0004\bY\u0010MR&\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001a0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010K\u001a\u0004\b\\\u0010MR,\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0!0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010K\u001a\u0004\b^\u0010MR&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR,\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0!0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010K\u001a\u0004\bd\u0010MR\"\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\be\u0010K\u001a\u0004\bQ\u0010MR \u0010*\u001a\b\u0012\u0004\u0012\u00020)0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b^\u0010K\u001a\u0004\bN\u0010MR \u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010K\u001a\u0004\bf\u0010MR \u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010K\u001a\u0004\bg\u0010MR \u0010-\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010K\u001a\u0004\bh\u0010MR \u0010.\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010K\u001a\u0004\bi\u0010MR \u0010/\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bj\u0010K\u001a\u0004\bk\u0010MR \u00100\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bl\u0010K\u001a\u0004\bm\u0010MR \u00101\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bn\u0010K\u001a\u0004\bo\u0010MR \u00102\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bp\u0010K\u001a\u0004\bq\u0010MR \u00103\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\br\u0010K\u001a\u0004\bs\u0010MR \u00104\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bt\u0010K\u001a\u0004\bu\u0010MR \u00105\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bv\u0010K\u001a\u0004\bw\u0010MR \u00106\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bx\u0010K\u001a\u0004\by\u0010MR\u001a\u00108\u001a\u0002078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\bO\u0010|R\"\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b}\u0010K\u001a\u0004\be\u0010MR \u0010<\u001a\b\u0012\u0004\u0012\u00020;0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b~\u0010K\u001a\u0004\bU\u0010MR \u0010>\u001a\b\u0012\u0004\u0012\u00020=0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u007f\u0010K\u001a\u0004\bc\u0010MR \u0010?\u001a\b\u0012\u0004\u0012\u00020=0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010K\u001a\u0004\bF\u0010M¨\u0006\u0080\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$g;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$d;", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$f;", "", "onUpdate", "LM0/m;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$e;", "effectsInMotion", "Landroidx/compose/runtime/l0;", "", "isLoadingVisible", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/e0$a;", "bottomActionBarState", "LCo/h;", "domain", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/h1;", "product", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/m1;", "storeLocation", "Lvs/m;", "price", "LKp/c;", "reviews", "Lvs/l;", "nutritionLabel", "", "LXr/c;", "coupons", "Lcom/meijer/mobile/meijer/activity/find/productdetail/o2;", "frequentlyBoughtTogether", "Lcn/j;", "productVariants", "", "", "initialSelectedVariants", "", "allInteractedVariants", "selectedVariant", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/w;", "complexPromo", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/v;", "cartEntry", "isVariantInteracted", "isOnShoppingList", "isOnFavoritesList", "isFromCLP", "isEligibleForCart", "isBuyAgain", "isInStoreOnly", "isAvailable", "isLowStock", "isOutOfStock", "isDelivery", "isPickup", "Landroidx/compose/runtime/j0;", "cartItemCount", "Lgi/d;", "googleAdData", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/b;", "criteoBeaconTracker", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/r;", "frequentlyBoughtTogetherProductsLoadingStatus", "bazaarVoiceProductDisplayStatus", "<init>", "(Lkotlin/jvm/functions/Function1;LM0/m;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Ljava/util/Map;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/j0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;Landroidx/compose/runtime/l0;)V", "a", "Lkotlin/jvm/functions/Function1;", "I", "()Lkotlin/jvm/functions/Function1;", "b", "LM0/m;", "j", "()LM0/m;", "c", "Landroidx/compose/runtime/l0;", "e0", "()Landroidx/compose/runtime/l0;", "d", "e", "i", "f", "u", "g", "X", "h", "t", "V", "s", "k", "l", "m", "v", "n", "r", "o", "Ljava/util/Map;", "K", "()Ljava/util/Map;", "p", "W", "q", "k0", "h0", "g0", "c0", "w", "b0", "x", "Z", "y", "d0", "z", "Y", "A", "f0", "B", "i0", "C", "a0", "D", "j0", "E", "Landroidx/compose/runtime/j0;", "()Landroidx/compose/runtime/j0;", "F", "G", "H", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$g, reason: case insensitive filesystem */
    private static final class C12365g implements InterfaceC12362d {

        /* renamed from: A, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<Boolean> isLowStock;

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<Boolean> isOutOfStock;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<Boolean> isDelivery;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<Boolean> isPickup;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5868j0 cartItemCount;

        /* renamed from: F, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<GoogleAdData> googleAdData;

        /* renamed from: G, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<C12328b> criteoBeaconTracker;

        /* renamed from: H, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<com.meijer.mobile.meijer.activity.find.viewmodel.r> frequentlyBoughtTogetherProductsLoadingStatus;

        /* renamed from: I, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<com.meijer.mobile.meijer.activity.find.viewmodel.r> bazaarVoiceProductDisplayStatus;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Function1<InterfaceC12364f, Unit> onUpdate;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final SnapshotStateList<InterfaceC12363e> effectsInMotion;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<Boolean> isLoadingVisible;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<InterfaceC12359a> bottomActionBarState;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<ProductFullDetails> domain;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<ProductDetailsDecorator> product;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<ProductStoreLocationDecorator> storeLocation;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<ProductPriceDecorator> price;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<ProductReviewFullDetails> reviews;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<ProductNutritionLabelDecorator> nutritionLabel;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<List<CouponListItemDecorator>> coupons;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<List<SuggestedProductCarouselDecorator>> frequentlyBoughtTogether;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<List<ProductVariantGroupDecorator>> productVariants;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<Map<String, String>> initialSelectedVariants;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final Map<String, String> allInteractedVariants;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<Map<String, String>> selectedVariant;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<ProductComplexPromoDecorator> complexPromo;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<ProductCartEntryDecorator> cartEntry;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<Boolean> isVariantInteracted;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<Boolean> isOnShoppingList;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<Boolean> isOnFavoritesList;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<Boolean> isFromCLP;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<Boolean> isEligibleForCart;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<Boolean> isBuyAgain;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<Boolean> isInStoreOnly;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0<Boolean> isAvailable;

        /* JADX WARN: Multi-variable type inference failed */
        public C12365g(Function1<? super InterfaceC12364f, Unit> onUpdate, SnapshotStateList<InterfaceC12363e> effectsInMotion, InterfaceC5872l0<Boolean> isLoadingVisible, InterfaceC5872l0<InterfaceC12359a> bottomActionBarState, InterfaceC5872l0<ProductFullDetails> domain, InterfaceC5872l0<ProductDetailsDecorator> product, InterfaceC5872l0<ProductStoreLocationDecorator> storeLocation, InterfaceC5872l0<ProductPriceDecorator> price, InterfaceC5872l0<ProductReviewFullDetails> reviews, InterfaceC5872l0<ProductNutritionLabelDecorator> nutritionLabel, InterfaceC5872l0<List<CouponListItemDecorator>> coupons, InterfaceC5872l0<List<SuggestedProductCarouselDecorator>> frequentlyBoughtTogether, InterfaceC5872l0<List<ProductVariantGroupDecorator>> productVariants, InterfaceC5872l0<Map<String, String>> initialSelectedVariants, Map<String, String> allInteractedVariants, InterfaceC5872l0<Map<String, String>> selectedVariant, InterfaceC5872l0<ProductComplexPromoDecorator> complexPromo, InterfaceC5872l0<ProductCartEntryDecorator> cartEntry, InterfaceC5872l0<Boolean> isVariantInteracted, InterfaceC5872l0<Boolean> isOnShoppingList, InterfaceC5872l0<Boolean> isOnFavoritesList, InterfaceC5872l0<Boolean> isFromCLP, InterfaceC5872l0<Boolean> isEligibleForCart, InterfaceC5872l0<Boolean> isBuyAgain, InterfaceC5872l0<Boolean> isInStoreOnly, InterfaceC5872l0<Boolean> isAvailable, InterfaceC5872l0<Boolean> isLowStock, InterfaceC5872l0<Boolean> isOutOfStock, InterfaceC5872l0<Boolean> isDelivery, InterfaceC5872l0<Boolean> isPickup, InterfaceC5868j0 cartItemCount, InterfaceC5872l0<GoogleAdData> googleAdData, InterfaceC5872l0<C12328b> criteoBeaconTracker, InterfaceC5872l0<com.meijer.mobile.meijer.activity.find.viewmodel.r> frequentlyBoughtTogetherProductsLoadingStatus, InterfaceC5872l0<com.meijer.mobile.meijer.activity.find.viewmodel.r> bazaarVoiceProductDisplayStatus) {
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

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
        public Function1<InterfaceC12364f, Unit> I() {
            return this.onUpdate;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
        public Map<String, String> K() {
            return this.allInteractedVariants;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
        /* renamed from: V, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<ProductReviewFullDetails> F() {
            return this.reviews;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
        /* renamed from: W, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<Map<String, String>> E() {
            return this.selectedVariant;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
        /* renamed from: X, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<ProductStoreLocationDecorator> P() {
            return this.storeLocation;
        }

        public InterfaceC5872l0<Boolean> Y() {
            return this.isAvailable;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<Boolean> B() {
            return this.isBuyAgain;
        }

        public InterfaceC5872l0<Boolean> a0() {
            return this.isDelivery;
        }

        public InterfaceC5872l0<com.meijer.mobile.meijer.activity.find.viewmodel.r> b() {
            return this.bazaarVoiceProductDisplayStatus;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
        /* renamed from: b0, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<Boolean> o() {
            return this.isEligibleForCart;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<InterfaceC12359a> G() {
            return this.bottomActionBarState;
        }

        public InterfaceC5872l0<Boolean> c0() {
            return this.isFromCLP;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<ProductCartEntryDecorator> Q() {
            return this.cartEntry;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
        /* renamed from: d0, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<Boolean> C() {
            return this.isInStoreOnly;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
        /* renamed from: e, reason: from getter and merged with bridge method [inline-methods] */
        public InterfaceC5868j0 N() {
            return this.cartItemCount;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
        /* renamed from: e0, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<Boolean> y() {
            return this.isLoadingVisible;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<ProductComplexPromoDecorator> T() {
            return this.complexPromo;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
        /* renamed from: f0, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<Boolean> x() {
            return this.isLowStock;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<List<CouponListItemDecorator>> a() {
            return this.coupons;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
        /* renamed from: g0, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<Boolean> L() {
            return this.isOnFavoritesList;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<C12328b> M() {
            return this.criteoBeaconTracker;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
        /* renamed from: h0, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<Boolean> H() {
            return this.isOnShoppingList;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<ProductFullDetails> w() {
            return this.domain;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
        /* renamed from: i0, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<Boolean> n() {
            return this.isOutOfStock;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public SnapshotStateList<InterfaceC12363e> J() {
            return this.effectsInMotion;
        }

        public InterfaceC5872l0<Boolean> j0() {
            return this.isPickup;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<List<SuggestedProductCarouselDecorator>> O() {
            return this.frequentlyBoughtTogether;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
        /* renamed from: k0, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<Boolean> z() {
            return this.isVariantInteracted;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<com.meijer.mobile.meijer.activity.find.viewmodel.r> U() {
            return this.frequentlyBoughtTogetherProductsLoadingStatus;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<GoogleAdData> R() {
            return this.googleAdData;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<Map<String, String>> S() {
            return this.initialSelectedVariants;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<ProductNutritionLabelDecorator> A() {
            return this.nutritionLabel;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<ProductPriceDecorator> l() {
            return this.price;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<ProductDetailsDecorator> m() {
            return this.product;
        }

        @Override // com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12362d
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public InterfaceC5872l0<List<ProductVariantGroupDecorator>> D() {
            return this.productVariants;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ C12365g(kotlin.jvm.functions.Function1 r73, M0.SnapshotStateList r74, androidx.compose.runtime.InterfaceC5872l0 r75, androidx.compose.runtime.InterfaceC5872l0 r76, androidx.compose.runtime.InterfaceC5872l0 r77, androidx.compose.runtime.InterfaceC5872l0 r78, androidx.compose.runtime.InterfaceC5872l0 r79, androidx.compose.runtime.InterfaceC5872l0 r80, androidx.compose.runtime.InterfaceC5872l0 r81, androidx.compose.runtime.InterfaceC5872l0 r82, androidx.compose.runtime.InterfaceC5872l0 r83, androidx.compose.runtime.InterfaceC5872l0 r84, androidx.compose.runtime.InterfaceC5872l0 r85, androidx.compose.runtime.InterfaceC5872l0 r86, java.util.Map r87, androidx.compose.runtime.InterfaceC5872l0 r88, androidx.compose.runtime.InterfaceC5872l0 r89, androidx.compose.runtime.InterfaceC5872l0 r90, androidx.compose.runtime.InterfaceC5872l0 r91, androidx.compose.runtime.InterfaceC5872l0 r92, androidx.compose.runtime.InterfaceC5872l0 r93, androidx.compose.runtime.InterfaceC5872l0 r94, androidx.compose.runtime.InterfaceC5872l0 r95, androidx.compose.runtime.InterfaceC5872l0 r96, androidx.compose.runtime.InterfaceC5872l0 r97, androidx.compose.runtime.InterfaceC5872l0 r98, androidx.compose.runtime.InterfaceC5872l0 r99, androidx.compose.runtime.InterfaceC5872l0 r100, androidx.compose.runtime.InterfaceC5872l0 r101, androidx.compose.runtime.InterfaceC5872l0 r102, androidx.compose.runtime.InterfaceC5868j0 r103, androidx.compose.runtime.InterfaceC5872l0 r104, androidx.compose.runtime.InterfaceC5872l0 r105, androidx.compose.runtime.InterfaceC5872l0 r106, androidx.compose.runtime.InterfaceC5872l0 r107, int r108, int r109, kotlin.jvm.internal.DefaultConstructorMarker r110) {
            /*
                Method dump skipped, instructions count: 887
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.C12365g.<init>(kotlin.jvm.functions.Function1, M0.m, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, java.util.Map, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.j0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, androidx.compose.runtime.l0, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$addToFavoriteList$1", f = "ProductDetailComposeViewModel.kt", l = {2084}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$h, reason: case insensitive filesystem */
    static final class C12366h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f109510a;

        /* renamed from: b, reason: collision with root package name */
        Object f109511b;

        /* renamed from: c, reason: collision with root package name */
        Object f109512c;

        /* renamed from: d, reason: collision with root package name */
        Object f109513d;

        /* renamed from: e, reason: collision with root package name */
        int f109514e;

        /* renamed from: f, reason: collision with root package name */
        int f109515f;

        /* renamed from: g, reason: collision with root package name */
        int f109516g;

        /* renamed from: h, reason: collision with root package name */
        int f109517h;

        /* renamed from: i, reason: collision with root package name */
        int f109518i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f109519j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ nk.c f109521l;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$addToFavoriteList$1$4$1", f = "ProductDetailComposeViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$h$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f109522a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12358e0 f109523b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C12358e0 c12358e0, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f109523b = c12358e0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f109523b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f109522a == 0) {
                    ResultKt.b(obj);
                    this.f109523b._viewState.J().add(new InterfaceC12363e.UpdateShoppingOrFavoriteListFailed(null, C18546a.f173201h, C18546a.f173203j, 1, null));
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12366h c12366h = C12358e0.this.new C12366h(this.f109521l, continuation);
            c12366h.f109519j = obj;
            return c12366h;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12366h(nk.c cVar, Continuation<? super C12366h> continuation) {
            super(2, continuation);
            this.f109521l = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12366h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object next;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109518i;
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
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f109519j;
                    C12358e0 c12358e0 = C12358e0.this;
                    nk.c cVar = this.f109521l;
                    Result.Companion companion = Result.INSTANCE;
                    Eq.a aVar = c12358e0.favoritesListRepository;
                    FavoriteListItem favoriteListItem = new FavoriteListItem(cVar);
                    this.f109519j = interfaceC15783O;
                    this.f109510a = interfaceC15783O;
                    this.f109511b = this;
                    this.f109512c = this;
                    this.f109513d = interfaceC15783O;
                    this.f109514e = 0;
                    this.f109515f = 0;
                    this.f109516g = 0;
                    this.f109517h = 0;
                    this.f109518i = 1;
                    obj = aVar.c(favoriteListItem, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                mv.E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            nk.c cVar2 = this.f109521l;
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
            C12358e0 c12358e02 = C12358e0.this;
            if (Result.h(objB2)) {
                c12358e02._viewState.J().add(new InterfaceC12363e.d.FavoriteListItemAdded(uuid, (nk.c) ((Pair) objB2).a(), i11, objArr == true ? 1 : 0));
            }
            nk.c cVar3 = this.f109521l;
            C12358e0 c12358e03 = C12358e0.this;
            Throwable thE = Result.e(objB2);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "Failed to add to favorites: " + cVar3, new Object[0]);
                C15809k.d(androidx.view.d0.a(c12358e03), null, null, new a(c12358e03, null), 3, null);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$addToShoppingList$1", f = "ProductDetailComposeViewModel.kt", l = {2011}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$i, reason: case insensitive filesystem */
    static final class C12367i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f109524a;

        /* renamed from: b, reason: collision with root package name */
        Object f109525b;

        /* renamed from: c, reason: collision with root package name */
        Object f109526c;

        /* renamed from: d, reason: collision with root package name */
        Object f109527d;

        /* renamed from: e, reason: collision with root package name */
        int f109528e;

        /* renamed from: f, reason: collision with root package name */
        int f109529f;

        /* renamed from: g, reason: collision with root package name */
        int f109530g;

        /* renamed from: h, reason: collision with root package name */
        int f109531h;

        /* renamed from: i, reason: collision with root package name */
        int f109532i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f109533j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ nk.c f109535l;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$addToShoppingList$1$4$1", f = "ProductDetailComposeViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$i$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f109536a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12358e0 f109537b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C12358e0 c12358e0, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f109537b = c12358e0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f109537b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f109536a == 0) {
                    ResultKt.b(obj);
                    this.f109537b._viewState.J().add(new InterfaceC12363e.UpdateShoppingOrFavoriteListFailed(null, C18546a.f173196c, C18546a.f173197d, 1, null));
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12367i c12367i = C12358e0.this.new C12367i(this.f109535l, continuation);
            c12367i.f109533j = obj;
            return c12367i;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12367i(nk.c cVar, Continuation<? super C12367i> continuation) {
            super(2, continuation);
            this.f109535l = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(nk.c cVar, TrackingData trackingData) {
            trackingData.h("productID", cVar.getCode());
            trackingData.n("product detail page");
            trackingData.v("shopping list");
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(TrackingData trackingData) {
            trackingData.n("product detail page");
            trackingData.v("mperks");
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(TrackingData trackingData) {
            trackingData.h("errorMessage", "add to shopping list error");
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12367i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            Object next;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109532i;
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
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f109533j;
                    C12358e0 c12358e0 = C12358e0.this;
                    nk.c cVar = this.f109535l;
                    Result.Companion companion = Result.INSTANCE;
                    Eq.b bVar = c12358e0.shoppingListRepository;
                    ShoppingListItem shoppingListItemH = Fq.d.h(cVar, 0, 1, null);
                    this.f109533j = interfaceC15783O;
                    this.f109524a = interfaceC15783O;
                    this.f109525b = this;
                    this.f109526c = this;
                    this.f109527d = interfaceC15783O;
                    this.f109528e = 0;
                    this.f109529f = 0;
                    this.f109530g = 0;
                    this.f109531h = 0;
                    this.f109532i = 1;
                    obj = bVar.d(shoppingListItemH, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                mv.E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            nk.c cVar2 = this.f109535l;
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
            C12358e0 c12358e02 = C12358e0.this;
            if (Result.h(objB2)) {
                final nk.c cVar3 = (nk.c) ((Pair) objB2).a();
                c12358e02._viewState.J().add(new InterfaceC12363e.d.ShoppingListItemAdded(uuid, cVar3, i11, objArr == true ? 1 : 0));
                c12358e02.analyticsEngine.b(C14756c.a("product added to shopping list:Product Details Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.m0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return C12358e0.C12367i.l(cVar3, (TrackingData) obj2);
                    }
                });
            }
            C12358e0 c12358e03 = C12358e0.this;
            Throwable thE = Result.e(objB2);
            if (thE != null) {
                qw.a.INSTANCE.e(thE);
                C15809k.d(androidx.view.d0.a(c12358e03), null, null, new a(c12358e03, null), 3, null);
                c12358e03.analyticsEngine.b(C14756c.a("event: products: add to shopping list"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.n0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return C12358e0.C12367i.o((TrackingData) obj2);
                    }
                });
                c12358e03.analyticsEngine.b(C14756c.h("Meijer:ShoppingList:PDP"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.o0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return C12358e0.C12367i.p((TrackingData) obj2);
                    }
                });
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel", f = "ProductDetailComposeViewModel.kt", l = {1803}, m = "fetchBazaarVoiceReviews-gIAlu-s")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$j, reason: case insensitive filesystem */
    static final class C12368j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f109538a;

        /* renamed from: b, reason: collision with root package name */
        Object f109539b;

        /* renamed from: c, reason: collision with root package name */
        Object f109540c;

        /* renamed from: d, reason: collision with root package name */
        Object f109541d;

        /* renamed from: e, reason: collision with root package name */
        Object f109542e;

        /* renamed from: f, reason: collision with root package name */
        int f109543f;

        /* renamed from: g, reason: collision with root package name */
        int f109544g;

        /* renamed from: h, reason: collision with root package name */
        int f109545h;

        /* renamed from: i, reason: collision with root package name */
        int f109546i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f109547j;

        /* renamed from: l, reason: collision with root package name */
        int f109549l;

        C12368j(Continuation<? super C12368j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f109547j = obj;
            this.f109549l |= Integer.MIN_VALUE;
            Object objH1 = C12358e0.this.h1(null, this);
            return objH1 == IntrinsicsKt.f() ? objH1 : Result.a(objH1);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel", f = "ProductDetailComposeViewModel.kt", l = {1789}, m = "fetchCoupon-gIAlu-s")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$k, reason: case insensitive filesystem */
    static final class C12369k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f109550a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f109551b;

        /* renamed from: d, reason: collision with root package name */
        int f109553d;

        C12369k(Continuation<? super C12369k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f109551b = obj;
            this.f109553d |= Integer.MIN_VALUE;
            Object objL1 = C12358e0.this.l1(null, this);
            return objL1 == IntrinsicsKt.f() ? objL1 : Result.a(objL1);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel", f = "ProductDetailComposeViewModel.kt", l = {1676}, m = "fetchFrequentlyBoughtTogether-gIAlu-s")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$l, reason: case insensitive filesystem */
    static final class C12370l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f109554a;

        /* renamed from: b, reason: collision with root package name */
        Object f109555b;

        /* renamed from: c, reason: collision with root package name */
        Object f109556c;

        /* renamed from: d, reason: collision with root package name */
        Object f109557d;

        /* renamed from: e, reason: collision with root package name */
        Object f109558e;

        /* renamed from: f, reason: collision with root package name */
        int f109559f;

        /* renamed from: g, reason: collision with root package name */
        int f109560g;

        /* renamed from: h, reason: collision with root package name */
        int f109561h;

        /* renamed from: i, reason: collision with root package name */
        int f109562i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f109563j;

        /* renamed from: l, reason: collision with root package name */
        int f109565l;

        C12370l(Continuation<? super C12370l> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f109563j = obj;
            this.f109565l |= Integer.MIN_VALUE;
            Object objM1 = C12358e0.this.m1(null, this);
            return objM1 == IntrinsicsKt.f() ? objM1 : Result.a(objM1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$fetchFrequentlyBoughtTogetherProducts$1", f = "ProductDetailComposeViewModel.kt", l = {1624, 1628}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$m, reason: case insensitive filesystem */
    static final class C12371m extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f109566a;

        /* renamed from: b, reason: collision with root package name */
        Object f109567b;

        /* renamed from: c, reason: collision with root package name */
        Object f109568c;

        /* renamed from: d, reason: collision with root package name */
        Object f109569d;

        /* renamed from: e, reason: collision with root package name */
        int f109570e;

        /* renamed from: f, reason: collision with root package name */
        int f109571f;

        /* renamed from: g, reason: collision with root package name */
        int f109572g;

        /* renamed from: h, reason: collision with root package name */
        int f109573h;

        /* renamed from: i, reason: collision with root package name */
        int f109574i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f109575j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ nk.f f109577l;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12371m c12371m = C12358e0.this.new C12371m(this.f109577l, continuation);
            c12371m.f109575j = obj;
            return c12371m;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12371m(nk.f fVar, Continuation<? super C12371m> continuation) {
            super(2, continuation);
            this.f109577l = fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12371m) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.C12371m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$fetchProduct$1", f = "ProductDetailComposeViewModel.kt", l = {1497, 1552}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$n, reason: case insensitive filesystem */
    static final class C12372n extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109578a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f109579b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ nk.f f109581d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$fetchProduct$1$1", f = "ProductDetailComposeViewModel.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$n$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f109582a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f109583b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C12358e0 f109584c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ nk.f f109585d;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$fetchProduct$1$1$1", f = "ProductDetailComposeViewModel.kt", l = {1502}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$n$a$a, reason: collision with other inner class name */
            static final class C1654a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                Object f109586a;

                /* renamed from: b, reason: collision with root package name */
                int f109587b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C12358e0 f109588c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ nk.f f109589d;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1654a(this.f109588c, this.f109589d, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1654a(C12358e0 c12358e0, nk.f fVar, Continuation<? super C1654a> continuation) {
                    super(2, continuation);
                    this.f109588c = c12358e0;
                    this.f109589d = fVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C1654a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit k(C12358e0 c12358e0, CouponsResponse couponsResponse) {
                    c12358e0.f1(couponsResponse);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit l(C12358e0 c12358e0, Throwable th2) {
                    c12358e0.e1(th2);
                    return Unit.f143329a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C12358e0 c12358e0;
                    Object value;
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f109587b;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            c12358e0 = (C12358e0) this.f109586a;
                            ResultKt.b(obj);
                            value = ((Result) obj).getValue();
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C12358e0 c12358e02 = this.f109588c;
                        nk.f fVar = this.f109589d;
                        this.f109586a = c12358e02;
                        this.f109587b = 1;
                        Object objL1 = c12358e02.l1(fVar, this);
                        if (objL1 == objF) {
                            return objF;
                        }
                        c12358e0 = c12358e02;
                        value = objL1;
                    }
                    final C12358e0 c12358e03 = this.f109588c;
                    Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.p0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return C12358e0.C12372n.a.C1654a.k(c12358e03, (CouponsResponse) obj2);
                        }
                    };
                    final C12358e0 c12358e04 = this.f109588c;
                    c12358e0.d1(value, function1, new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.q0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return C12358e0.C12372n.a.C1654a.l(c12358e04, (Throwable) obj2);
                        }
                    });
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$fetchProduct$1$1$2", f = "ProductDetailComposeViewModel.kt", l = {1513}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$n$a$b */
            static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                Object f109590a;

                /* renamed from: b, reason: collision with root package name */
                int f109591b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C12358e0 f109592c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ nk.f f109593d;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f109592c, this.f109593d, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C12358e0 c12358e0, nk.f fVar, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f109592c = c12358e0;
                    this.f109593d = fVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit k(C12358e0 c12358e0, List list) {
                    c12358e0.i3(list);
                    c12358e0.C1(list);
                    c12358e0.J2(c12358e0.getViewState().m().getValue().getId().getCode());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit l(C12358e0 c12358e0, Throwable th2) {
                    c12358e0.k3(th2);
                    return Unit.f143329a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C12358e0 c12358e0;
                    Object value;
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f109591b;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            c12358e0 = (C12358e0) this.f109590a;
                            ResultKt.b(obj);
                            value = ((Result) obj).getValue();
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C12358e0 c12358e02 = this.f109592c;
                        nk.f fVar = this.f109593d;
                        this.f109590a = c12358e02;
                        this.f109591b = 1;
                        Object objR1 = c12358e02.r1(fVar, this);
                        if (objR1 == objF) {
                            return objF;
                        }
                        c12358e0 = c12358e02;
                        value = objR1;
                    }
                    final C12358e0 c12358e03 = this.f109592c;
                    Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.r0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return C12358e0.C12372n.a.b.k(c12358e03, (List) obj2);
                        }
                    };
                    final C12358e0 c12358e04 = this.f109592c;
                    c12358e0.d1(value, function1, new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.s0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return C12358e0.C12372n.a.b.l(c12358e04, (Throwable) obj2);
                        }
                    });
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$fetchProduct$1$1$3", f = "ProductDetailComposeViewModel.kt", l = {1526}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$n$a$c */
            static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                Object f109594a;

                /* renamed from: b, reason: collision with root package name */
                int f109595b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C12358e0 f109596c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ nk.f f109597d;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new c(this.f109596c, this.f109597d, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(C12358e0 c12358e0, nk.f fVar, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f109596c = c12358e0;
                    this.f109597d = fVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit k(C12358e0 c12358e0, ProductReviewFullDetails productReviewFullDetails) {
                    c12358e0.l2(productReviewFullDetails);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit l(C12358e0 c12358e0, Throwable th2) {
                    c12358e0.S0(th2);
                    return Unit.f143329a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C12358e0 c12358e0;
                    Object value;
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f109595b;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            c12358e0 = (C12358e0) this.f109594a;
                            ResultKt.b(obj);
                            value = ((Result) obj).getValue();
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C12358e0 c12358e02 = this.f109596c;
                        nk.f fVar = this.f109597d;
                        this.f109594a = c12358e02;
                        this.f109595b = 1;
                        Object objH1 = c12358e02.h1(fVar, this);
                        if (objH1 == objF) {
                            return objF;
                        }
                        c12358e0 = c12358e02;
                        value = objH1;
                    }
                    final C12358e0 c12358e03 = this.f109596c;
                    Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.t0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return C12358e0.C12372n.a.c.k(c12358e03, (ProductReviewFullDetails) obj2);
                        }
                    };
                    final C12358e0 c12358e04 = this.f109596c;
                    c12358e0.d1(value, function1, new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.u0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return C12358e0.C12372n.a.c.l(c12358e04, (Throwable) obj2);
                        }
                    });
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$fetchProduct$1$1$4", f = "ProductDetailComposeViewModel.kt", l = {1535}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$n$a$d */
            static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                Object f109598a;

                /* renamed from: b, reason: collision with root package name */
                int f109599b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C12358e0 f109600c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ nk.f f109601d;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new d(this.f109600c, this.f109601d, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(C12358e0 c12358e0, nk.f fVar, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f109600c = c12358e0;
                    this.f109601d = fVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit k(C12358e0 c12358e0, List list) {
                    c12358e0.W0(list);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit l(C12358e0 c12358e0, Throwable th2) {
                    c12358e0.V0(th2);
                    return Unit.f143329a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C12358e0 c12358e0;
                    Object value;
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f109599b;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            c12358e0 = (C12358e0) this.f109598a;
                            ResultKt.b(obj);
                            value = ((Result) obj).getValue();
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C12358e0 c12358e02 = this.f109600c;
                        nk.f fVar = this.f109601d;
                        this.f109598a = c12358e02;
                        this.f109599b = 1;
                        Object objM1 = c12358e02.m1(fVar, this);
                        if (objM1 == objF) {
                            return objF;
                        }
                        c12358e0 = c12358e02;
                        value = objM1;
                    }
                    final C12358e0 c12358e03 = this.f109600c;
                    Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.v0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return C12358e0.C12372n.a.d.k(c12358e03, (List) obj2);
                        }
                    };
                    final C12358e0 c12358e04 = this.f109600c;
                    c12358e0.d1(value, function1, new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.w0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return C12358e0.C12372n.a.d.l(c12358e04, (Throwable) obj2);
                        }
                    });
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$fetchProduct$1$1$5", f = "ProductDetailComposeViewModel.kt", l = {1546}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$n$a$e */
            static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                Object f109602a;

                /* renamed from: b, reason: collision with root package name */
                int f109603b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C12358e0 f109604c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ nk.f f109605d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ ProductFullDetails f109606e;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new e(this.f109604c, this.f109605d, this.f109606e, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(C12358e0 c12358e0, nk.f fVar, ProductFullDetails productFullDetails, Continuation<? super e> continuation) {
                    super(2, continuation);
                    this.f109604c = c12358e0;
                    this.f109605d = fVar;
                    this.f109606e = productFullDetails;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit k(C12358e0 c12358e0, List list) {
                    c12358e0.D2(list);
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit l(C12358e0 c12358e0, Throwable th2) {
                    c12358e0.C2(th2);
                    return Unit.f143329a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C12358e0 c12358e0;
                    Object value;
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f109603b;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            c12358e0 = (C12358e0) this.f109602a;
                            ResultKt.b(obj);
                            value = ((Result) obj).getValue();
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C12358e0 c12358e02 = this.f109604c;
                        nk.f fVar = this.f109605d;
                        ProductFullDetails productFullDetails = this.f109606e;
                        this.f109602a = c12358e02;
                        this.f109603b = 1;
                        Object objQ1 = c12358e02.q1(fVar, productFullDetails, this);
                        if (objQ1 == objF) {
                            return objF;
                        }
                        c12358e0 = c12358e02;
                        value = objQ1;
                    }
                    final C12358e0 c12358e03 = this.f109604c;
                    Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.x0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return C12358e0.C12372n.a.e.k(c12358e03, (List) obj2);
                        }
                    };
                    final C12358e0 c12358e04 = this.f109604c;
                    c12358e0.d1(value, function1, new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.y0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return C12358e0.C12372n.a.e.l(c12358e04, (Throwable) obj2);
                        }
                    });
                    return Unit.f143329a;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f109584c, this.f109585d, continuation);
                aVar.f109583b = obj;
                return aVar;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C12358e0 c12358e0, nk.f fVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f109584c = c12358e0;
                this.f109585d = fVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f109582a == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f109583b;
                    C15809k.d(interfaceC15783O, this.f109584c.ioDispatcher, null, new C1654a(this.f109584c, this.f109585d, null), 2, null);
                    if (!this.f109584c.featureManager.e(AbstractC18503f.W.f172862h) && this.f109584c.featureManager.e(AbstractC18503f.C18522t.f172904h)) {
                        C15809k.d(interfaceC15783O, this.f109584c.ioDispatcher, null, new b(this.f109584c, this.f109585d, null), 2, null);
                    }
                    C15809k.d(interfaceC15783O, this.f109584c.ioDispatcher, null, new c(this.f109584c, this.f109585d, null), 2, null);
                    if (this.f109584c.featureManager.e(AbstractC18503f.X.f172863h)) {
                        C15809k.d(interfaceC15783O, this.f109584c.ioDispatcher, null, new d(this.f109584c, this.f109585d, null), 2, null);
                    }
                    ProductFullDetails value = this.f109584c._viewState.w().getValue();
                    if (value.getDepartment().length() <= 0) {
                        value = null;
                    }
                    ProductFullDetails productFullDetails = value;
                    if (this.f109584c.featureManager.e(AbstractC18503f.C18518p.f172894h) && productFullDetails != null) {
                        C15809k.d(interfaceC15783O, this.f109584c.ioDispatcher, null, new e(this.f109584c, this.f109585d, productFullDetails, null), 2, null);
                    }
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12372n c12372n = C12358e0.this.new C12372n(this.f109581d, continuation);
            c12372n.f109579b = obj;
            return c12372n;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12372n(nk.f fVar, Continuation<? super C12372n> continuation) {
            super(2, continuation);
            this.f109581d = fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12372n) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
        
            if (r10.o0(r9) == r0) goto L17;
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
                int r1 = r9.f109578a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r9.f109579b
                mv.O r0 = (mv.InterfaceC15783O) r0
                kotlin.ResultKt.b(r10)
                goto L75
            L16:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1e:
                java.lang.Object r1 = r9.f109579b
                mv.O r1 = (mv.InterfaceC15783O) r1
                kotlin.ResultKt.b(r10)
            L25:
                r3 = r1
                goto L52
            L27:
                kotlin.ResultKt.b(r10)
                java.lang.Object r10 = r9.f109579b
                r1 = r10
                mv.O r1 = (mv.InterfaceC15783O) r1
                com.meijer.mobile.meijer.activity.find.viewmodel.e0 r10 = com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.this
                r10.A2(r3)
                com.meijer.mobile.meijer.activity.find.viewmodel.e0 r10 = com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.this
                com.meijer.mobile.meijer.activity.find.viewmodel.e0$g r10 = com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.z0(r10)
                androidx.compose.runtime.l0 r10 = r10.G()
                com.meijer.mobile.meijer.activity.find.viewmodel.e0$a$b r4 = com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.InterfaceC12359a.b.f109395a
                r10.setValue(r4)
                com.meijer.mobile.meijer.activity.find.viewmodel.e0 r10 = com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.this
                nk.f r4 = r9.f109581d
                r9.f109579b = r1
                r9.f109578a = r3
                java.lang.Object r10 = com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.d0(r10, r4, r9)
                if (r10 != r0) goto L25
                goto L74
            L52:
                if (r10 == 0) goto L86
                com.meijer.mobile.meijer.activity.find.viewmodel.e0 r10 = com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.this
                mv.K r4 = com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.q0(r10)
                com.meijer.mobile.meijer.activity.find.viewmodel.e0$n$a r6 = new com.meijer.mobile.meijer.activity.find.viewmodel.e0$n$a
                com.meijer.mobile.meijer.activity.find.viewmodel.e0 r10 = com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.this
                nk.f r1 = r9.f109581d
                r5 = 0
                r6.<init>(r10, r1, r5)
                r7 = 2
                r8 = 0
                mv.C0 r10 = mv.C15805i.d(r3, r4, r5, r6, r7, r8)
                r9.f109579b = r3
                r9.f109578a = r2
                java.lang.Object r10 = r10.o0(r9)
                if (r10 != r0) goto L75
            L74:
                return r0
            L75:
                com.meijer.mobile.meijer.activity.find.viewmodel.e0 r10 = com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.this
                com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.g0(r10)
                com.meijer.mobile.meijer.activity.find.viewmodel.e0 r10 = com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.this
                r0 = 0
                r10.A2(r0)
                com.meijer.mobile.meijer.activity.find.viewmodel.e0 r10 = com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.this
                r10.N2()
                goto L8b
            L86:
                com.meijer.mobile.meijer.activity.find.viewmodel.e0 r10 = com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.this
                r10.N2()
            L8b:
                kotlin.Unit r10 = kotlin.Unit.f143329a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.C12372n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel", f = "ProductDetailComposeViewModel.kt", l = {1728}, m = "fetchProductDetails")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$o */
    static final class o extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f109607a;

        /* renamed from: b, reason: collision with root package name */
        Object f109608b;

        /* renamed from: c, reason: collision with root package name */
        Object f109609c;

        /* renamed from: d, reason: collision with root package name */
        Object f109610d;

        /* renamed from: e, reason: collision with root package name */
        Object f109611e;

        /* renamed from: f, reason: collision with root package name */
        int f109612f;

        /* renamed from: g, reason: collision with root package name */
        int f109613g;

        /* renamed from: h, reason: collision with root package name */
        int f109614h;

        /* renamed from: i, reason: collision with root package name */
        int f109615i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f109616j;

        /* renamed from: l, reason: collision with root package name */
        int f109618l;

        o(Continuation<? super o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f109616j = obj;
            this.f109618l |= Integer.MIN_VALUE;
            return C12358e0.this.p1(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel", f = "ProductDetailComposeViewModel.kt", l = {1705}, m = "fetchSponsoredProducts-0E7RQCE")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$p */
    static final class p extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f109619a;

        /* renamed from: b, reason: collision with root package name */
        Object f109620b;

        /* renamed from: c, reason: collision with root package name */
        Object f109621c;

        /* renamed from: d, reason: collision with root package name */
        Object f109622d;

        /* renamed from: e, reason: collision with root package name */
        Object f109623e;

        /* renamed from: f, reason: collision with root package name */
        Object f109624f;

        /* renamed from: g, reason: collision with root package name */
        int f109625g;

        /* renamed from: h, reason: collision with root package name */
        int f109626h;

        /* renamed from: i, reason: collision with root package name */
        int f109627i;

        /* renamed from: j, reason: collision with root package name */
        int f109628j;

        /* renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f109629k;

        /* renamed from: m, reason: collision with root package name */
        int f109631m;

        p(Continuation<? super p> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f109629k = obj;
            this.f109631m |= Integer.MIN_VALUE;
            Object objQ1 = C12358e0.this.q1(null, null, this);
            return objQ1 == IntrinsicsKt.f() ? objQ1 : Result.a(objQ1);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel", f = "ProductDetailComposeViewModel.kt", l = {1753}, m = "fetchVariants-gIAlu-s")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$q */
    static final class q extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f109632a;

        /* renamed from: b, reason: collision with root package name */
        Object f109633b;

        /* renamed from: c, reason: collision with root package name */
        Object f109634c;

        /* renamed from: d, reason: collision with root package name */
        Object f109635d;

        /* renamed from: e, reason: collision with root package name */
        Object f109636e;

        /* renamed from: f, reason: collision with root package name */
        int f109637f;

        /* renamed from: g, reason: collision with root package name */
        int f109638g;

        /* renamed from: h, reason: collision with root package name */
        int f109639h;

        /* renamed from: i, reason: collision with root package name */
        int f109640i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f109641j;

        /* renamed from: l, reason: collision with root package name */
        int f109643l;

        q(Continuation<? super q> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f109641j = obj;
            this.f109643l |= Integer.MIN_VALUE;
            Object objR1 = C12358e0.this.r1(null, this);
            return objR1 == IntrinsicsKt.f() ? objR1 : Result.a(objR1);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel", f = "ProductDetailComposeViewModel.kt", l = {1650}, m = "loadSponsoredProducts")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$r */
    static final class r extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f109644a;

        /* renamed from: b, reason: collision with root package name */
        Object f109645b;

        /* renamed from: c, reason: collision with root package name */
        Object f109646c;

        /* renamed from: d, reason: collision with root package name */
        Object f109647d;

        /* renamed from: e, reason: collision with root package name */
        Object f109648e;

        /* renamed from: f, reason: collision with root package name */
        Object f109649f;

        /* renamed from: g, reason: collision with root package name */
        Object f109650g;

        /* renamed from: h, reason: collision with root package name */
        int f109651h;

        /* renamed from: i, reason: collision with root package name */
        int f109652i;

        /* renamed from: j, reason: collision with root package name */
        int f109653j;

        /* renamed from: k, reason: collision with root package name */
        int f109654k;

        /* renamed from: l, reason: collision with root package name */
        int f109655l;

        /* renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f109656m;

        /* renamed from: o, reason: collision with root package name */
        int f109658o;

        r(Continuation<? super r> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f109656m = obj;
            this.f109658o |= Integer.MIN_VALUE;
            return C12358e0.this.B1(null, this);
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
            return Unit.f143329a;
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
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$u */
    /* synthetic */ class u extends AdaptedFunctionReference implements Function1<List<? extends ProductState<ProductFullDetails>>, Unit> {
        u(Object obj) {
            super(1, obj, C12358e0.class, "updateViewState", "updateViewState(Ljava/util/List;)Lkotlin/Unit;", 8);
        }

        public final void a(List<ProductState<ProductFullDetails>> p02) {
            Intrinsics.j(p02, "p0");
            ((C12358e0) this.f143708a).j3(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends ProductState<ProductFullDetails>> list) {
            a(list);
            return Unit.f143329a;
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
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$onClipCouponCallFailure$1", f = "ProductDetailComposeViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$w */
    static final class w extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109659a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CouponException f109660b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C12358e0 f109661c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(CouponException couponException, C12358e0 c12358e0, Continuation<? super w> continuation) {
            super(2, continuation);
            this.f109660b = couponException;
            this.f109661c = c12358e0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new w(this.f109660b, this.f109661c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((w) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                int r0 = r6.f109659a
                if (r0 != 0) goto Laa
                kotlin.ResultKt.b(r7)
                com.meijer.mobile.coupons.domain.models.CouponException r7 = r6.f109660b
                sk.b r7 = r7.getErrorType()
                if (r7 == 0) goto L23
                com.meijer.mobile.coupons.domain.models.CouponException r7 = r6.f109660b
                sk.b r7 = r7.getErrorType()
                kotlin.jvm.internal.Intrinsics.g(r7)
                int r7 = r7.getResultCode()
                r0 = 30
                if (r7 > r0) goto La7
            L23:
                com.meijer.mobile.coupons.domain.models.CouponException r7 = r6.f109660b
                com.meijer.mobile.core.networking.exceptions.RetrofitException$b r7 = r7.getExceptionKind()
                com.meijer.mobile.core.networking.exceptions.RetrofitException$b r0 = com.meijer.mobile.core.networking.exceptions.RetrofitException.b.f97000b
                if (r7 != r0) goto L4b
                com.meijer.mobile.meijer.activity.find.viewmodel.e0 r7 = r6.f109661c
                com.meijer.mobile.meijer.activity.find.viewmodel.e0$g r7 = com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.z0(r7)
                M0.m r7 = r7.J()
                com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$l r0 = new com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$l
                int r2 = Nr.g.f22714t
                com.meijer.mobile.coupons.domain.models.CouponException r1 = r6.f109660b
                Pk.a r3 = r1.getCoupon()
                r4 = 1
                r5 = 0
                r1 = 0
                r0.<init>(r1, r2, r3, r4, r5)
                r7.add(r0)
                goto La7
            L4b:
                com.meijer.mobile.coupons.domain.models.CouponException r7 = r6.f109660b
                sk.b r7 = r7.getErrorType()
                if (r7 == 0) goto L72
                com.meijer.mobile.coupons.domain.models.CouponException r7 = r6.f109660b
                sk.b r7 = r7.getErrorType()
                com.meijer.mobile.coupons.api.models.AddOfferErrorType r0 = com.meijer.mobile.coupons.api.models.AddOfferErrorType.CLIPPED_COUPONS_LIMIT_ERROR
                if (r7 != r0) goto L72
                com.meijer.mobile.meijer.activity.find.viewmodel.e0 r7 = r6.f109661c
                com.meijer.mobile.meijer.activity.find.viewmodel.e0$g r7 = com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.z0(r7)
                M0.m r7 = r7.J()
                com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$m r0 = new com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$m
                r1 = 1
                r2 = 0
                r0.<init>(r2, r1, r2)
                r7.add(r0)
                goto La7
            L72:
                com.meijer.mobile.meijer.activity.find.viewmodel.e0 r7 = r6.f109661c
                com.meijer.mobile.meijer.activity.find.viewmodel.e0$g r7 = com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.z0(r7)
                M0.m r7 = r7.J()
                com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$l r0 = new com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$d$l
                com.meijer.mobile.coupons.domain.models.CouponException r1 = r6.f109660b
                sk.b r1 = r1.getErrorType()
                if (r1 == 0) goto L95
                com.meijer.mobile.coupons.domain.models.CouponException r1 = r6.f109660b
                sk.b r1 = r1.getErrorType()
                kotlin.jvm.internal.Intrinsics.g(r1)
                int r1 = r1.getErrorResourceId()
            L93:
                r2 = r1
                goto L98
            L95:
                int r1 = Nr.g.f22702n
                goto L93
            L98:
                com.meijer.mobile.coupons.domain.models.CouponException r1 = r6.f109660b
                Pk.a r3 = r1.getCoupon()
                r4 = 1
                r5 = 0
                r1 = 0
                r0.<init>(r1, r2, r3, r4, r5)
                r7.add(r0)
            La7:
                kotlin.Unit r7 = kotlin.Unit.f143329a
                return r7
            Laa:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.w.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$onReload$1", f = "ProductDetailComposeViewModel.kt", l = {2348}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$x */
    static final class x extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f109662a;

        /* renamed from: b, reason: collision with root package name */
        int f109663b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ n2 f109665d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(n2 n2Var, Continuation<? super x> continuation) {
            super(2, continuation);
            this.f109665d = n2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C12358e0.this.new x(this.f109665d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((x) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(C12358e0 c12358e0, ProductReviewFullDetails productReviewFullDetails) {
            c12358e0.l2(productReviewFullDetails);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(C12358e0 c12358e0, Throwable th2) {
            c12358e0.S0(th2);
            return Unit.f143329a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C12358e0 c12358e0;
            Object value;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109663b;
            if (i10 != 0) {
                if (i10 == 1) {
                    c12358e0 = (C12358e0) this.f109662a;
                    ResultKt.b(obj);
                    value = ((Result) obj).getValue();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C12358e0 c12358e02 = C12358e0.this;
                nk.f product = ((n2.BazaarVoiceReviews) this.f109665d).getProduct();
                this.f109662a = c12358e02;
                this.f109663b = 1;
                Object objH1 = c12358e02.h1(product, this);
                if (objH1 == objF) {
                    return objF;
                }
                c12358e0 = c12358e02;
                value = objH1;
            }
            final C12358e0 c12358e03 = C12358e0.this;
            Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.z0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return C12358e0.x.k(c12358e03, (ProductReviewFullDetails) obj2);
                }
            };
            final C12358e0 c12358e04 = C12358e0.this;
            c12358e0.d1(value, function1, new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.A0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return C12358e0.x.l(c12358e04, (Throwable) obj2);
                }
            });
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$onSubstitutionResult$1", f = "ProductDetailComposeViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$y */
    static final class y extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f109666a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m2 f109667b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C12358e0 f109668c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(m2 m2Var, C12358e0 c12358e0, Continuation<? super y> continuation) {
            super(2, continuation);
            this.f109667b = m2Var;
            this.f109668c = c12358e0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new y(this.f109667b, this.f109668c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((y) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f109666a == 0) {
                ResultKt.b(obj);
                m2 m2Var = this.f109667b;
                int i10 = 1;
                UUID uuid = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                if (Intrinsics.e(m2Var, m2.a.f108509a)) {
                    this.f109668c._viewState.J().add(new InterfaceC12363e.d.ProductAddedWithBackup(uuid, i10, objArr3 == true ? 1 : 0));
                } else if (Intrinsics.e(m2Var, m2.b.f108510a)) {
                    this.f109668c._viewState.J().add(new InterfaceC12363e.d.ProductAddedWithoutBackup(objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$removeFromFavoriteList$1", f = "ProductDetailComposeViewModel.kt", l = {2105}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$z */
    static final class z extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f109669a;

        /* renamed from: b, reason: collision with root package name */
        Object f109670b;

        /* renamed from: c, reason: collision with root package name */
        Object f109671c;

        /* renamed from: d, reason: collision with root package name */
        Object f109672d;

        /* renamed from: e, reason: collision with root package name */
        int f109673e;

        /* renamed from: f, reason: collision with root package name */
        int f109674f;

        /* renamed from: g, reason: collision with root package name */
        int f109675g;

        /* renamed from: h, reason: collision with root package name */
        int f109676h;

        /* renamed from: i, reason: collision with root package name */
        int f109677i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f109678j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ nk.c f109680l;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.ProductDetailComposeViewModel$removeFromFavoriteList$1$4$1", f = "ProductDetailComposeViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.e0$z$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f109681a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C12358e0 f109682b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C12358e0 c12358e0, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f109682b = c12358e0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f109682b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f109681a == 0) {
                    ResultKt.b(obj);
                    this.f109682b._viewState.J().add(new InterfaceC12363e.UpdateShoppingOrFavoriteListFailed(null, C18546a.f173201h, C18546a.f173203j, 1, null));
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            z zVar = C12358e0.this.new z(this.f109680l, continuation);
            zVar.f109678j = obj;
            return zVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(nk.c cVar, Continuation<? super z> continuation) {
            super(2, continuation);
            this.f109680l = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((z) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            Object next;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f109677i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f109678j;
                    C12358e0 c12358e0 = C12358e0.this;
                    nk.c cVar = this.f109680l;
                    Result.Companion companion = Result.INSTANCE;
                    Eq.a aVar = c12358e0.favoritesListRepository;
                    this.f109678j = interfaceC15783O;
                    this.f109669a = interfaceC15783O;
                    this.f109670b = this;
                    this.f109671c = this;
                    this.f109672d = interfaceC15783O;
                    this.f109673e = 0;
                    this.f109674f = 0;
                    this.f109675g = 0;
                    this.f109676h = 0;
                    this.f109677i = 1;
                    obj = aVar.j(cVar, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                mv.E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            nk.c cVar2 = this.f109680l;
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
                qw.a.INSTANCE.k("Successfully removed product from favorites.", new Object[0]);
            }
            C12358e0 c12358e02 = C12358e0.this;
            Throwable thE = Result.e(objB2);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "Failed to remove product from favorites.", new Object[0]);
                C15809k.d(androidx.view.d0.a(c12358e02), null, null, new a(c12358e02, null), 3, null);
            }
            return Unit.f143329a;
        }
    }

    public C12358e0(Ro.c productsRepository, il.m cartRepository, Tq.j storeProvider, yo.k userManager, Eq.a favoritesListRepository, Eq.b shoppingListRepository, wr.f cartInteractor, com.google.firebase.crashlytics.a firebaseCrashlytics, zl.k featureManager, InterfaceC14523a analyticsEngine, C16753b beaconClient, sp.Y productStateRepository, C17115a multiChannelProductsStateRepository, pp.g suggestionsRepository, pp.e sponsorshipsDataStore, pp.d productMetadataStore, Kp.g bazaarVoiceManager, C13702d couponsRepository, AbstractC15779K ioDispatcher) {
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
        InterfaceC5872l0 interfaceC5872l0 = null;
        InterfaceC5872l0 interfaceC5872l02 = null;
        InterfaceC5872l0 interfaceC5872l03 = null;
        InterfaceC5872l0 interfaceC5872l04 = null;
        InterfaceC5872l0 interfaceC5872l05 = null;
        InterfaceC5872l0 interfaceC5872l06 = null;
        InterfaceC16549B<ProductState<ProductFullDetails>> interfaceC16549BA = pv.S.a(new ProductState(new ProductFullDetails(null, null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -1, 268435455, null), null, null, null, null, null, null, null, null, null, null, null, null, 8190, null));
        this._productStateFlow = interfaceC16549BA;
        this.productStateFlow = C16563h.c(interfaceC16549BA);
        Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.B
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12358e0.S(this.f108730a, (C12358e0.InterfaceC12364f) obj);
            }
        };
        InterfaceC5872l0 interfaceC5872l07 = null;
        InterfaceC5872l0 interfaceC5872l08 = null;
        InterfaceC5872l0 interfaceC5872l09 = null;
        InterfaceC5872l0 interfaceC5872l010 = null;
        InterfaceC5872l0 interfaceC5872l011 = null;
        InterfaceC5872l0 interfaceC5872l012 = null;
        InterfaceC5872l0 interfaceC5872l013 = null;
        InterfaceC5872l0 interfaceC5872l014 = null;
        InterfaceC5872l0 interfaceC5872l015 = null;
        InterfaceC5872l0 interfaceC5872l016 = null;
        InterfaceC5868j0 interfaceC5868j0 = null;
        int i10 = -2;
        C12365g c12365g = new C12365g(function1, null, null, interfaceC5872l0, interfaceC5872l02, interfaceC5872l03, interfaceC5872l04, null, null, null, null, interfaceC5872l05, interfaceC5872l06, interfaceC5872l07, null, interfaceC5872l08, interfaceC5872l09, interfaceC5872l010, null, interfaceC5872l011, null, null, interfaceC5872l012, null, interfaceC5872l013, interfaceC5872l014, null, interfaceC5872l015, interfaceC5872l016, null, interfaceC5868j0, null, null, null, null, i10, 7, null);
        this._viewState = c12365g;
        this.viewState = c12365g;
        Ju.a aVar = new Ju.a();
        this.disposables = aVar;
        InterfaceC16549B<ProductDetailFeatureFlags> interfaceC16549BA2 = pv.S.a(new ProductDetailFeatureFlags(false, false, false, false, false, false, false, false, l3.f93323c, null));
        this._featureFlags = interfaceC16549BA2;
        this.featureFlags = C16563h.c(interfaceC16549BA2);
        this.cartId = "-1";
        this.limitReviews = 5;
        F1();
        P1();
        K1();
        if (userManager.b()) {
            cartInteractor.p();
            G1();
            i1();
        }
        Dk.a.a(productStateRepository.q0(), aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<ProductState<ProductFullDetails>> E1(List<ProductState<ProductFullDetails>> productState) {
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
            T1(new AbstractC12325a.OnLoadCriteoBeacon((ProductFullDetails) ((ProductState) it.next()).g()));
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

    /* JADX WARN: Multi-variable type inference failed */
    private final void T0(boolean isSuccess) {
        InterfaceC12363e cancelSubscriptionFailure;
        int i10 = 1;
        UUID uuid = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (isSuccess) {
            qw.a.INSTANCE.k("Dispatching CancelSubscriptionSuccess toast effect", new Object[0]);
            cancelSubscriptionFailure = new InterfaceC12363e.d.CancelSubscriptionSuccess(uuid, i10, objArr3 == true ? 1 : 0);
        } else {
            qw.a.INSTANCE.s("Dispatching CancelSubscriptionFailure toast effect", new Object[0]);
            cancelSubscriptionFailure = new InterfaceC12363e.d.CancelSubscriptionFailure(objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0);
        }
        this._viewState.J().add(cancelSubscriptionFailure);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k3(Throwable t10) {
    }

    private final void A1(boolean action) {
        this._viewState.z().setValue(Boolean.valueOf(action));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B1(nk.f r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.B1(nk.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C1(List<ProductVariantGroup> variantGroups) {
        InterfaceC5872l0<Map<String, String>> interfaceC5872l0S = this._viewState.S();
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
                    return C12358e0.D1((ProductVariant) obj2);
                }
            }, 30, null));
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        interfaceC5872l0S.setValue(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C2(Throwable t10) {
        qw.a.INSTANCE.f(t10, "Failed to fetch sponsored product from Criteo.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence D1(ProductVariant variant) {
        Intrinsics.j(variant, "variant");
        return variant.getAttribute();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D2(List<SponsoredProduct> productList) {
        pp.e eVar = this.sponsorshipsDataStore;
        List<SponsoredProduct> list = productList;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SponsoredProduct) it.next()).getSponsorship());
        }
        eVar.d(arrayList);
        C17115a c17115a = this.multiChannelProductsStateRepository;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((SponsoredProduct) it2.next()).getProduct());
        }
        c17115a.c("frequently bought together", arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void E2(String reviewId, Kp.a reviewFeedbackVote) {
        UUID uuid = null;
        Object[] objArr = 0;
        if (this.userManager.b()) {
            C15809k.d(androidx.view.d0.a(this), null, null, new I(reviewId, reviewFeedbackVote, null), 3, null);
        } else {
            this._viewState.J().add(new InterfaceC12363e.d.BazaarVoiceFeedbackAttemptWithoutLogin(uuid, Lp.c.f19378d0, 1, objArr == true ? 1 : 0));
        }
    }

    private final void F1() {
        if (this.userManager.b()) {
            this.cartInteractor.q(false, new C12360b());
        }
    }

    private final void F2(GoogleAdAnalytics analytics) {
        this.analyticsEngine.k(C14375c.b(analytics, "product details page"));
    }

    private final void G1() {
        io.reactivex.l<Integer> lVarSubscribeOn = this.cartRepository.Q().subscribeOn(C13889a.b());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.H
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12358e0.H1(this.f108776a, (Integer) obj);
            }
        };
        Lu.g<? super Integer> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.I
            @Override // Lu.g
            public final void accept(Object obj) {
                C12358e0.I1(function1, obj);
            }
        };
        final s sVar = new s(qw.a.INSTANCE);
        Dk.a.a(lVarSubscribeOn.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.K
            @Override // Lu.g
            public final void accept(Object obj) {
                C12358e0.J1(sVar, obj);
            }
        }), this.disposables);
    }

    private final void G2(final ProductFullDetails productDetails) {
        String str = this.previousTrackAction;
        if (str == null || str.length() == 0) {
            this.analyticsEngine.g(C14756c.h("Product Details Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C12358e0.H2(productDetails, this, (TrackingData) obj);
                }
            });
        } else {
            this.analyticsEngine.g(C14756c.h("Product Details Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.J
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C12358e0.I2(productDetails, this, (TrackingData) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H1(C12358e0 c12358e0, Integer num) {
        InterfaceC5868j0 interfaceC5868j0N = c12358e0._viewState.N();
        Intrinsics.g(num);
        interfaceC5868j0N.i(num.intValue());
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H2(ProductFullDetails productFullDetails, C12358e0 c12358e0, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.c(Ao.W.f1694a.h(productFullDetails));
        stageEvent.h("pageName", "Meijer:Search Results Page: Product Details Page");
        ProductSponsorship productSponsorshipA = c12358e0.sponsorshipsDataStore.a(productFullDetails.getCode());
        if (productSponsorshipA != null) {
            Ao.e0.a(productSponsorshipA, stageEvent);
            if (productSponsorshipA.getSponsorSource() == Ho.b.f13875c) {
                C15809k.d(androidx.view.d0.a(c12358e0), c12358e0.ioDispatcher, null, new J(productFullDetails, c12358e0, null), 2, null);
            }
        }
        stageEvent.h("isProductOutOfStock", productFullDetails.getStockInfo().e() ? "true" : "false");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I2(ProductFullDetails productFullDetails, C12358e0 c12358e0, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.c(Ao.W.f1694a.h(productFullDetails));
        stageEvent.h("pageName", "Meijer:Search Results Page: Product Details Page");
        stageEvent.h("isProductOutOfStock", productFullDetails.getStockInfo().e() ? "true" : "false");
        Ao.e0.a(c12358e0.sponsorshipsDataStore.a(productFullDetails.getCode()), stageEvent);
        stageEvent.p(c12358e0.previousTrackAction);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J2(final String productCode) {
        if (!this.viewState.D().getValue().isEmpty()) {
            final boolean zBooleanValue = this.viewState.z().getValue().booleanValue();
            final String strT2 = zBooleanValue ? (String) CollectionsKt.r0(this.viewState.E().getValue().keySet()) : t2();
            final String strS2 = zBooleanValue ? (String) CollectionsKt.r0(this.viewState.E().getValue().values()) : s2();
            this.analyticsEngine.g(C14756c.h("Product Details Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.X
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C12358e0.K2(productCode, zBooleanValue, strT2, strS2, (TrackingData) obj);
                }
            });
        }
        this.analyticsEngine.c(C14756c.h("Product Details Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.Y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12358e0.L2((TrackingData) obj);
            }
        });
    }

    private final void K1() {
        this.multiChannelProductsStateRepository.b(new C17115a.InterfaceC2527a() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.C
            @Override // sp.C17115a.InterfaceC2527a
            public final void a(Object obj, sp.Y y10) {
                C12358e0.L1(this.f108734a, obj, y10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K2(String str, boolean z10, String str2, String str3, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        Ao.e0.b(stageEvent, str, z10, str2, str3);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L1(final C12358e0 c12358e0, final Object key, sp.Y repo) {
        Intrinsics.j(key, "key");
        Intrinsics.j(repo, "repo");
        io.reactivex.l<List<ProductState<ProductFullDetails>>> lVarSubscribeOn = repo.Y0().subscribeOn(C13889a.b());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.S
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12358e0.M1(this.f108955a, key, (List) obj);
            }
        };
        Lu.g<? super List<ProductState<ProductFullDetails>>> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.T
            @Override // Lu.g
            public final void accept(Object obj) {
                C12358e0.N1(function1, obj);
            }
        };
        final t tVar = new t(qw.a.INSTANCE);
        Dk.a.a(lVarSubscribeOn.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.U
            @Override // Lu.g
            public final void accept(Object obj) {
                C12358e0.O1(tVar, obj);
            }
        }), c12358e0.disposables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L2(TrackingData submitEvent) {
        Intrinsics.j(submitEvent, "$this$submitEvent");
        return Unit.f143329a;
    }

    private final void M2(String variantType, String variantName, nk.f productCode) {
        this.analyticsEngine.k(Ao.g0.f1821a.b(variantName, variantType, productCode.getCode()));
    }

    private final void O2(final InterfaceC12364f.UpdateCarouselProductEntry action) {
        z1(new Function0() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.N
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C12358e0.P2(this.f108944a, action);
            }
        }, new Function0() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.O
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C12358e0.Q2(this.f108947a);
            }
        });
    }

    private final void P0(String variantType, String variantName) {
        if (variantType != null) {
            this._viewState.K().put(variantType, variantName);
        }
    }

    private final void P1() {
        io.reactivex.l<List<ProductState<ProductFullDetails>>> lVarDistinctUntilChanged = this.productStateRepository.Y0().distinctUntilChanged();
        final u uVar = new u(this);
        Lu.g<? super List<ProductState<ProductFullDetails>>> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.F
            @Override // Lu.g
            public final void accept(Object obj) {
                C12358e0.R1(uVar, obj);
            }
        };
        final v vVar = new v(qw.a.INSTANCE);
        Dk.a.a(lVarDistinctUntilChanged.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.G
            @Override // Lu.g
            public final void accept(Object obj) {
                C12358e0.Q1(vVar, obj);
            }
        }), this.disposables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P2(C12358e0 c12358e0, InterfaceC12364f.UpdateCarouselProductEntry updateCarouselProductEntry) {
        InterfaceC5872l0<List<SuggestedProductCarouselDecorator>> interfaceC5872l0O = c12358e0._viewState.O();
        List<SuggestedProductCarouselDecorator> value = c12358e0._viewState.O().getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(value, 10));
        for (SuggestedProductCarouselDecorator suggestedProductCarouselDecoratorV : value) {
            if (suggestedProductCarouselDecoratorV.getResetStepperState()) {
                suggestedProductCarouselDecoratorV = SuggestedProductCarouselDecorator.v(suggestedProductCarouselDecoratorV, null, null, null, null, null, null, false, false, null, null, null, null, 0.0d, false, false, null, null, null, false, null, 1032191, null);
            }
            arrayList.add(suggestedProductCarouselDecoratorV);
        }
        interfaceC5872l0O.setValue(arrayList);
        if (!c12358e0.quantityChangeForFBT) {
            c12358e0.quantityChangeForFBT = true;
        }
        wr.f.M(c12358e0.cartInteractor, updateCarouselProductEntry.getProduct(), updateCarouselProductEntry.getQuantityToUpdate(), false, null, 12, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R2(double quantityToUpdate) {
        C15809k.d(androidx.view.d0.a(this), null, null, new K(null), 3, null);
        nk.f id2 = this._viewState.m().getValue().getId();
        ProductFullDetails productFullDetails = id2 instanceof ProductFullDetails ? (ProductFullDetails) id2 : null;
        if (productFullDetails != null) {
            wr.f.M(this.cartInteractor, productFullDetails, quantityToUpdate, this._viewState.c0().getValue().booleanValue(), null, 8, null);
        } else {
            this._viewState.G().setValue(InterfaceC12359a.b.f109395a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(C12358e0 c12358e0, InterfaceC12364f it) {
        Intrinsics.j(it, "it");
        c12358e0.g2(it);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S0(Throwable t10) {
        this._viewState.b().setValue(com.meijer.mobile.meijer.activity.find.viewmodel.r.f109822b);
        qw.a.INSTANCE.f(t10, "ProductDisplayPage: Failed to get bulk ratings", new Object[0]);
    }

    private final void S1(a2 action) {
        if (action instanceof a2.ReadMore) {
            h2((a2.ReadMore) action);
            return;
        }
        if (action instanceof a2.ShowReviewGallery) {
            z2((a2.ShowReviewGallery) action);
            return;
        }
        if (action instanceof a2.SeeAll) {
            r2((a2.SeeAll) action);
            return;
        }
        if (action instanceof a2.WriteReview) {
            o3((a2.WriteReview) action);
            return;
        }
        if (action instanceof a2.Report) {
            E2(((a2.Report) action).getReviewDetails().getReviewId(), Kp.a.f17595a);
        } else if (action instanceof a2.VotePositive) {
            E2(((a2.VotePositive) action).getReviewDetails().getReviewId(), Kp.a.f17596b);
        } else {
            if (!(action instanceof a2.VoteNegative)) {
                throw new NoWhenBranchMatchedException();
            }
            E2(((a2.VoteNegative) action).getReviewDetails().getReviewId(), Kp.a.f17597c);
        }
    }

    private final void S2(ProductEligibility eligibility) {
        this._viewState.o().setValue(Boolean.valueOf(Intrinsics.e(eligibility.k(), ProductEligibility.a.C2660a.f167269a) || Intrinsics.e(eligibility.k(), ProductEligibility.a.c.f167271a)));
    }

    private final void T2(ProductFullDetails product, CartEntry cartEntry) {
        this._viewState.Q().setValue(ProductCartEntryDecorator.INSTANCE.a(cartEntry, product));
    }

    private final void U0(List<ProductFullDetails> productList, boolean isFrequentlyBoughtTogetherImpression) {
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
        InterfaceC5872l0<C12328b> interfaceC5872l0M = this._viewState.M();
        C12328b value = this.viewState.M().getValue();
        List<String> listA = value.a();
        List<ProductFullDetails> list = listM1;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ProductFullDetails) it.next()).getCode());
        }
        listA.addAll(arrayList2);
        interfaceC5872l0M.setValue(value);
        this.analyticsEngine.k(Ao.M.f1665a.b(isFrequentlyBoughtTogetherImpression, this.cartId, listM1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V0(Throwable t10) {
        qw.a.INSTANCE.f(t10, "Failed to fetch frequently bought together products", new Object[0]);
        this._viewState.U().setValue(com.meijer.mobile.meijer.activity.find.viewmodel.r.f109822b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void V1(Coupon coupon) {
        this._viewState.J().add(new InterfaceC12363e.d.ShowCouponClipped(null, coupon, 1, 0 == true ? 1 : 0));
    }

    private final void V2(List<CouponState> coupons) {
        InterfaceC5872l0<List<CouponListItemDecorator>> interfaceC5872l0A = this._viewState.a();
        List<CouponState> list = coupons;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(CouponListItemDecorator.INSTANCE.a(((CouponState) it.next()).getCoupon()));
        }
        interfaceC5872l0A.setValue(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W0(List<ProductFullDetails> results) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : results) {
            if (!((ProductFullDetails) obj).getStockInfo().e()) {
                arrayList.add(obj);
            }
        }
        this.multiChannelProductsStateRepository.c("frequently bought together", CollectionsKt.b1(arrayList, 10));
        this._viewState.U().setValue(com.meijer.mobile.meijer.activity.find.viewmodel.r.f109821a);
    }

    private final void W2(String variantType, String variantName) {
        this._viewState.E().setValue(MapsKt.g(TuplesKt.a(variantType, variantName)));
    }

    private final void X0() {
        this.analyticsEngine.d(C14756c.h("Product Details Page"));
    }

    private final void X1(final AbstractC15516a action) {
        if (action instanceof AbstractC15516a.Add) {
            z1(new Function0() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.L
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C12358e0.Y1(this.f108934a, action);
                }
            }, new Function0() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.M
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C12358e0.Z1(this.f108937a);
                }
            });
        } else if (action instanceof AbstractC15516a.Remove) {
            i2(((AbstractC15516a.Remove) action).getProduct());
        } else {
            if (!(action instanceof AbstractC15516a.View)) {
                throw new NoWhenBranchMatchedException();
            }
            l3(((AbstractC15516a.View) action).getProduct());
        }
    }

    private final void X2(FavoriteListItem item) {
        this._viewState.L().setValue(Boolean.valueOf(item != null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y0(final Coupon coupon) {
        io.reactivex.u<ClipUnclipCouponResponse> uVarK = this.couponsRepository.h(coupon).k(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12358e0.Z0(this.f109004a, coupon, (ClipUnclipCouponResponse) obj);
            }
        };
        Lu.g<? super ClipUnclipCouponResponse> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.d0
            @Override // Lu.g
            public final void accept(Object obj) {
                C12358e0.a1(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12358e0.b1(this.f109919a, coupon, (Throwable) obj);
            }
        };
        Dk.a.a(uVarK.o(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.A
            @Override // Lu.g
            public final void accept(Object obj) {
                C12358e0.c1(function12, obj);
            }
        }), this.disposables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y1(C12358e0 c12358e0, AbstractC15516a abstractC15516a) {
        c12358e0.Q0(((AbstractC15516a.Add) abstractC15516a).getProduct());
        return Unit.f143329a;
    }

    private final void Y2(ProductFullDetails product) {
        this._viewState.R().setValue(C12687q.f113757a.d(EnumC14378f.f134255d, "pdp", product.getCode(), product.d(), this.featureManager.e(AbstractC18503f.C.f172844h), this.userManager.y()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z1(C12358e0 c12358e0) {
        c12358e0.B2(C18546a.f173198e);
        return Unit.f143329a;
    }

    private final void Z2(boolean isFromCLP) {
        this._viewState.c0().setValue(Boolean.valueOf(isFromCLP));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b1(C12358e0 c12358e0, Coupon coupon, Throwable throwable) {
        Intrinsics.j(throwable, "throwable");
        c12358e0.U1(new CouponException(throwable, coupon));
        return Unit.f143329a;
    }

    private final void b2(final AbstractC15517b action) {
        if (action instanceof AbstractC15517b.Add) {
            z1(new Function0() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.D
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C12358e0.c2(this.f108740a, action);
                }
            }, new Function0() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.E
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C12358e0.d2(this.f108744a);
                }
            });
        } else if (action instanceof AbstractC15517b.View) {
            m3(((AbstractC15517b.View) action).getProduct());
        } else {
            if (!(action instanceof AbstractC15517b.Remove)) {
                throw new NoWhenBranchMatchedException();
            }
            j2(((AbstractC15517b.Remove) action).getProduct());
        }
    }

    private final void b3(ProductFullDetails product) {
        this._viewState.l().setValue(new ProductPriceDecorator(product, false, 0.0d, 6, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c2(C12358e0 c12358e0, AbstractC15517b abstractC15517b) {
        c12358e0.R0(((AbstractC15517b.Add) abstractC15517b).getProduct());
        return Unit.f143329a;
    }

    private final void c3(ProductFullDetails product) {
        this._viewState.m().setValue(ProductDetailsDecorator.INSTANCE.b(product));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d2(C12358e0 c12358e0) {
        c12358e0.B2(C18546a.f173198e);
        return Unit.f143329a;
    }

    private final void d3(ProductFullDetails product, ProductEligibility eligibility) {
        this._viewState.n().setValue(Boolean.valueOf(Intrinsics.e(eligibility.k(), ProductEligibility.a.l.f167280a)));
        this._viewState.x().setValue(Boolean.valueOf(Intrinsics.e(eligibility.k(), ProductEligibility.a.c.f167271a)));
        this._viewState.Y().setValue(Boolean.valueOf(Intrinsics.e(eligibility.k(), ProductEligibility.a.C2660a.f167269a)));
        this._viewState.C().setValue(Boolean.valueOf(Intrinsics.e(eligibility.k(), ProductEligibility.a.C2661b.f167270a)));
        this._viewState.a0().setValue(Boolean.valueOf(eligibility.getFulfillmentMode() instanceof n.Delivery));
        this._viewState.j0().setValue(Boolean.valueOf(eligibility.getFulfillmentMode() instanceof n.Pickup));
        this._viewState.B().setValue(Boolean.valueOf(this.productMetadataStore.c(product.getCode())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e1(Throwable t10) {
        qw.a.INSTANCE.f(t10, "Error fetching coupons.", new Object[0]);
    }

    private final void e3(NutritionLabel nutritionLabel) {
        InterfaceC5872l0<ProductNutritionLabelDecorator> interfaceC5872l0A = this._viewState.A();
        ProductNutritionLabelDecorator productNutritionLabelDecorator = null;
        if (nutritionLabel != null) {
            if (nutritionLabel.getIsEmpty()) {
                nutritionLabel = null;
            }
            if (nutritionLabel != null) {
                productNutritionLabelDecorator = new ProductNutritionLabelDecorator(nutritionLabel);
            }
        }
        interfaceC5872l0A.setValue(productNutritionLabelDecorator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f1(CouponsResponse response) {
        C13702d c13702d = this.couponsRepository;
        List<Coupon> listF = response.f();
        if (listF == null) {
            listF = CollectionsKt.m();
        }
        c13702d.J(listF);
    }

    private final void f2(Object key, List<ProductState<ProductFullDetails>> productState) {
        if (Intrinsics.e(key, "frequently bought together")) {
            List<ProductState<ProductFullDetails>> listE1 = E1(CollectionsKt.m1(productState));
            InterfaceC5872l0<List<SuggestedProductCarouselDecorator>> interfaceC5872l0O = this._viewState.O();
            List<ProductState<ProductFullDetails>> list = listE1;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(SuggestedProductCarouselDecorator.INSTANCE.a((ProductState) it.next()));
            }
            interfaceC5872l0O.setValue(arrayList);
        }
    }

    private final void f3(ProductFullDetails product, Tq.k store) {
        this._viewState.P().setValue(ProductStoreLocationDecorator.INSTANCE.a(product, store));
    }

    private final void g1(InterfaceC12364f.DisposeEffect vsUpdate) {
        InterfaceC12363e next;
        Iterator<InterfaceC12363e> it = this._viewState.J().iterator();
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
        InterfaceC12363e interfaceC12363e = next;
        if (interfaceC12363e != null) {
            this._viewState.J().remove(interfaceC12363e);
        }
    }

    private final void g2(InterfaceC12364f vsUpdate) {
        if (vsUpdate instanceof InterfaceC12364f.ShoppingList) {
            b2(((InterfaceC12364f.ShoppingList) vsUpdate).getAction());
            return;
        }
        if (vsUpdate instanceof InterfaceC12364f.FavoritesList) {
            X1(((InterfaceC12364f.FavoritesList) vsUpdate).getAction());
            return;
        }
        if (vsUpdate instanceof InterfaceC12364f.ProductReview) {
            S1(((InterfaceC12364f.ProductReview) vsUpdate).getAction());
            return;
        }
        if (vsUpdate instanceof InterfaceC12364f.Coupon) {
            W1(((InterfaceC12364f.Coupon) vsUpdate).getAction());
            return;
        }
        if (vsUpdate instanceof InterfaceC12364f.Reload) {
            a2(((InterfaceC12364f.Reload) vsUpdate).getAction());
            return;
        }
        if (vsUpdate instanceof InterfaceC12364f.UpdateItem) {
            a3((InterfaceC12364f.UpdateItem) vsUpdate);
            return;
        }
        if (vsUpdate instanceof InterfaceC12364f.IsFromCLP) {
            Z2(((InterfaceC12364f.IsFromCLP) vsUpdate).getIsFromCLP());
            return;
        }
        if (vsUpdate instanceof InterfaceC12364f.UpdateCarouselProductEntry) {
            O2((InterfaceC12364f.UpdateCarouselProductEntry) vsUpdate);
            return;
        }
        if (vsUpdate instanceof InterfaceC12364f.GetFrequentlyBoughtTogetherProducts) {
            n1(((InterfaceC12364f.GetFrequentlyBoughtTogetherProducts) vsUpdate).getProductIdentity());
            return;
        }
        if (vsUpdate instanceof InterfaceC12364f.GoogleAdClicked) {
            F2(((InterfaceC12364f.GoogleAdClicked) vsUpdate).getAnalytics());
            return;
        }
        if (vsUpdate instanceof InterfaceC12364f.j) {
            m2();
        } else if (vsUpdate instanceof InterfaceC12364f.DisposeEffect) {
            g1((InterfaceC12364f.DisposeEffect) vsUpdate);
        } else {
            if (!(vsUpdate instanceof InterfaceC12364f.CancelSubscriptionAction)) {
                throw new NoWhenBranchMatchedException();
            }
            T0(((InterfaceC12364f.CancelSubscriptionAction) vsUpdate).getIsSuccess());
        }
    }

    private final void g3(ShoppingListItem item) {
        this._viewState.H().setValue(Boolean.valueOf((item == null || item.getIsComplete()) ? false : true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h1(nk.f r6, kotlin.coroutines.Continuation<? super kotlin.Result<Kp.ProductReviewFullDetails>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.C12368j
            if (r0 == 0) goto L13
            r0 = r7
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$j r0 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.C12368j) r0
            int r1 = r0.f109549l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109549l = r1
            goto L18
        L13:
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$j r0 = new com.meijer.mobile.meijer.activity.find.viewmodel.e0$j
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f109547j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f109549l
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r6 = r0.f109542e
            com.meijer.mobile.meijer.activity.find.viewmodel.e0 r6 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0) r6
            java.lang.Object r6 = r0.f109541d
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            java.lang.Object r6 = r0.f109540c
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            java.lang.Object r6 = r0.f109539b
            com.meijer.mobile.meijer.activity.find.viewmodel.e0 r6 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0) r6
            java.lang.Object r6 = r0.f109538a
            nk.f r6 = (nk.f) r6
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
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$g r7 = z0(r5)     // Catch: java.lang.Exception -> L3d
            androidx.compose.runtime.l0 r7 = r7.b()     // Catch: java.lang.Exception -> L3d
            com.meijer.mobile.meijer.activity.find.viewmodel.r r2 = com.meijer.mobile.meijer.activity.find.viewmodel.r.f109823c     // Catch: java.lang.Exception -> L3d
            r7.setValue(r2)     // Catch: java.lang.Exception -> L3d
            Kp.g r7 = i0(r5)     // Catch: java.lang.Exception -> L3d
            java.lang.String r2 = r6.getCode()     // Catch: java.lang.Exception -> L3d
            int r4 = r0(r5)     // Catch: java.lang.Exception -> L3d
            r0.f109538a = r6     // Catch: java.lang.Exception -> L3d
            r0.f109539b = r5     // Catch: java.lang.Exception -> L3d
            r0.f109540c = r0     // Catch: java.lang.Exception -> L3d
            r0.f109541d = r0     // Catch: java.lang.Exception -> L3d
            r0.f109542e = r5     // Catch: java.lang.Exception -> L3d
            r6 = 0
            r0.f109543f = r6     // Catch: java.lang.Exception -> L3d
            r0.f109544g = r6     // Catch: java.lang.Exception -> L3d
            r0.f109545h = r6     // Catch: java.lang.Exception -> L3d
            r0.f109546i = r6     // Catch: java.lang.Exception -> L3d
            r0.f109549l = r3     // Catch: java.lang.Exception -> L3d
            java.lang.Object r7 = r7.c(r2, r4, r0)     // Catch: java.lang.Exception -> L3d
            if (r7 != r1) goto L81
            return r1
        L81:
            java.lang.Object r6 = kotlin.Result.b(r7)     // Catch: java.lang.Exception -> L3d
            return r6
        L86:
            kotlin.coroutines.CoroutineContext r7 = r0.getContext()
            mv.E0.i(r7)
            kotlin.Result$Companion r7 = kotlin.Result.INSTANCE
            java.lang.Object r6 = kotlin.ResultKt.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.h1(nk.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void h2(a2.ReadMore action) {
        this._viewState.J().add(new ReadReview(null, action.getReviewItem(), 1, null));
    }

    private final void i1() {
        io.reactivex.l<String> lVarSubscribeOn = this.cartRepository.N().subscribeOn(C13889a.b());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.P
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12358e0.j1(this.f108949a, (String) obj);
            }
        };
        Dk.a.a(lVarSubscribeOn.subscribe(new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.Q
            @Override // Lu.g
            public final void accept(Object obj) {
                C12358e0.k1(function1, obj);
            }
        }), this.disposables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i3(List<ProductVariantGroup> productVariantGroups) {
        InterfaceC5872l0<List<ProductVariantGroupDecorator>> interfaceC5872l0D = this._viewState.D();
        List<ProductVariantGroup> list = productVariantGroups;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ProductVariantGroupDecorator.INSTANCE.a((ProductVariantGroup) it.next()));
        }
        interfaceC5872l0D.setValue(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l1(nk.f r24, kotlin.coroutines.Continuation<? super kotlin.Result<el.CouponsResponse>> r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            boolean r2 = r1 instanceof com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.C12369k
            if (r2 == 0) goto L17
            r2 = r1
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$k r2 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.C12369k) r2
            int r3 = r2.f109553d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f109553d = r3
            goto L1c
        L17:
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$k r2 = new com.meijer.mobile.meijer.activity.find.viewmodel.e0$k
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f109551b
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r4 = r2.f109553d
            r5 = 1
            if (r4 == 0) goto L3f
            if (r4 != r5) goto L37
            java.lang.Object r2 = r2.f109550a
            nk.f r2 = (nk.f) r2
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
            dl.d r1 = r0.couponsRepository
            java.lang.String r4 = r24.getCode()
            long r6 = java.lang.Long.parseLong(r4)
            java.lang.Long r4 = kotlin.coroutines.jvm.internal.Boxing.e(r6)
            java.lang.Long[] r4 = new java.lang.Long[]{r4}
            java.util.List r18 = kotlin.collections.CollectionsKt.s(r4)
            com.meijer.mobile.coupon.model.search.CouponsSortType r9 = com.meijer.mobile.coupon.model.search.CouponsSortType.EXPIRING
            Sk.a r6 = new Sk.a
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
            r2.f109550a = r4
            r2.f109553d = r5
            java.lang.Object r1 = r0.n2(r1, r2)
            if (r1 != r3) goto L85
            return r3
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.l1(nk.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l2(ProductReviewFullDetails result) {
        this._viewState.F().setValue(result);
        this._viewState.b().setValue(com.meijer.mobile.meijer.activity.find.viewmodel.r.f109821a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1(nk.f r5, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<Co.ProductFullDetails>>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.C12370l
            if (r0 == 0) goto L13
            r0 = r6
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$l r0 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.C12370l) r0
            int r1 = r0.f109565l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109565l = r1
            goto L18
        L13:
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$l r0 = new com.meijer.mobile.meijer.activity.find.viewmodel.e0$l
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f109563j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f109565l
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r5 = r0.f109558e
            com.meijer.mobile.meijer.activity.find.viewmodel.e0 r5 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0) r5
            java.lang.Object r5 = r0.f109557d
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f109556c
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f109555b
            com.meijer.mobile.meijer.activity.find.viewmodel.e0 r5 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0) r5
            java.lang.Object r5 = r0.f109554a
            nk.f r5 = (nk.f) r5
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
            pp.g r6 = y0(r4)     // Catch: java.lang.Exception -> L3d
            java.lang.String r2 = r5.getCode()     // Catch: java.lang.Exception -> L3d
            r0.f109554a = r5     // Catch: java.lang.Exception -> L3d
            r0.f109555b = r4     // Catch: java.lang.Exception -> L3d
            r0.f109556c = r0     // Catch: java.lang.Exception -> L3d
            r0.f109557d = r0     // Catch: java.lang.Exception -> L3d
            r0.f109558e = r4     // Catch: java.lang.Exception -> L3d
            r5 = 0
            r0.f109559f = r5     // Catch: java.lang.Exception -> L3d
            r0.f109560g = r5     // Catch: java.lang.Exception -> L3d
            r0.f109561h = r5     // Catch: java.lang.Exception -> L3d
            r0.f109562i = r5     // Catch: java.lang.Exception -> L3d
            r0.f109565l = r3     // Catch: java.lang.Exception -> L3d
            java.lang.Object r6 = r6.a(r2, r0)     // Catch: java.lang.Exception -> L3d
            if (r6 != r1) goto L70
            return r1
        L70:
            java.lang.Object r5 = kotlin.Result.b(r6)     // Catch: java.lang.Exception -> L3d
            return r5
        L75:
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            mv.E0.i(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.m1(nk.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void m2() {
        this._viewState.J().add(new InterfaceC12363e.d.ReviewSubmittedSuccess(null, 1, 0 == true ? 1 : 0));
    }

    private final void n1(nk.f productIdentity) {
        if (this.featureManager.e(AbstractC18503f.X.f172863h)) {
            this._viewState.U().setValue(com.meijer.mobile.meijer.activity.find.viewmodel.r.f109823c);
            C15809k.d(androidx.view.d0.a(this), null, null, new C12371m(productIdentity, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object n2(io.reactivex.y<T> r5, kotlin.coroutines.Continuation<? super kotlin.Result<? extends T>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.C
            if (r0 == 0) goto L13
            r0 = r6
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$C r0 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.C) r0
            int r1 = r0.f109333e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109333e = r1
            goto L18
        L13:
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$C r0 = new com.meijer.mobile.meijer.activity.find.viewmodel.e0$C
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f109331c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f109333e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f109329a
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
            r0.f109329a = r5
            r6 = 0
            r0.f109330b = r6
            r0.f109333e = r3
            mv.p r6 = new mv.p
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.c(r0)
            r6.<init>(r2, r3)
            r6.C()
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$D r2 = new com.meijer.mobile.meijer.activity.find.viewmodel.e0$D
            r2.<init>(r6, r4)
            r5.a(r2)
            java.lang.Object r6 = r6.u()
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
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.n2(io.reactivex.y, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n3(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("product detail page");
        track.v("mperks");
        return Unit.f143329a;
    }

    private final void o2(Pk.c couponIdentity) {
        io.reactivex.l<Coupon> lVarObserveOn = this.couponsRepository.k(couponIdentity).take(1L).subscribeOn(C13889a.b()).observeOn(Iu.a.a());
        final E e10 = new E(this);
        Lu.g<? super Coupon> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.a0
            @Override // Lu.g
            public final void accept(Object obj) {
                C12358e0.p2(e10, obj);
            }
        };
        final F f10 = new F(qw.a.INSTANCE);
        Dk.a.a(lVarObserveOn.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.b0
            @Override // Lu.g
            public final void accept(Object obj) {
                C12358e0.q2(f10, obj);
            }
        }), this.disposables);
    }

    private final void o3(a2.WriteReview action) {
        this._viewState.J().add(new WriteReview(null, new ProductInfoForReviewSubmit(action.getProduct().getCode(), action.getImageUrl(), action.getProduct().getName()), 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p1(nk.f r9, kotlin.coroutines.Continuation<? super Co.ProductFullDetails> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.o
            if (r0 == 0) goto L14
            r0 = r10
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$o r0 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.o) r0
            int r1 = r0.f109618l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f109618l = r1
        L12:
            r10 = r0
            goto L1a
        L14:
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$o r0 = new com.meijer.mobile.meijer.activity.find.viewmodel.e0$o
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r0 = r10.f109616j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r10.f109618l
            r3 = 1
            if (r2 == 0) goto L4a
            if (r2 != r3) goto L42
            java.lang.Object r9 = r10.f109611e
            com.meijer.mobile.meijer.activity.find.viewmodel.e0 r9 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0) r9
            java.lang.Object r9 = r10.f109610d
            kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
            java.lang.Object r9 = r10.f109609c
            kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
            java.lang.Object r9 = r10.f109608b
            com.meijer.mobile.meijer.activity.find.viewmodel.e0 r9 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0) r9
            java.lang.Object r9 = r10.f109607a
            nk.f r9 = (nk.f) r9
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
            r10.f109607a = r9     // Catch: java.lang.Exception -> L3f
            r10.f109608b = r8     // Catch: java.lang.Exception -> L3f
            r10.f109609c = r10     // Catch: java.lang.Exception -> L3f
            r10.f109610d = r10     // Catch: java.lang.Exception -> L3f
            r10.f109611e = r8     // Catch: java.lang.Exception -> L3f
            r9 = 0
            r10.f109612f = r9     // Catch: java.lang.Exception -> L3f
            r10.f109613g = r9     // Catch: java.lang.Exception -> L3f
            r10.f109614h = r9     // Catch: java.lang.Exception -> L3f
            r10.f109615i = r9     // Catch: java.lang.Exception -> L3f
            r10.f109618l = r3     // Catch: java.lang.Exception -> L3f
            java.lang.Object r0 = r0.l(r2, r10)     // Catch: java.lang.Exception -> L3f
            if (r0 != r1) goto L73
            return r1
        L73:
            java.lang.Object r9 = kotlin.Result.b(r0)     // Catch: java.lang.Exception -> L3f
            goto L89
        L78:
            kotlin.coroutines.CoroutineContext r10 = r10.getContext()
            mv.E0.i(r10)
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
            r8.i3(r0)
            r8.X0()
            r8.G2(r10)
        La8:
            java.lang.Throwable r10 = kotlin.Result.e(r9)
            if (r10 == 0) goto Ld0
            qw.a$a r0 = qw.a.INSTANCE
            r0.e(r10)
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$g r10 = r8._viewState
            M0.m r10 = r10.J()
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$c r0 = new com.meijer.mobile.meijer.activity.find.viewmodel.e0$e$c
            int r2 = yr.Q.f171758Z
            int r3 = yr.Q.f171785s
            int r4 = yr.Q.f171755W
            int r1 = yr.Q.f171769f
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
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.p1(nk.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q1(nk.f r9, Co.ProductFullDetails r10, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<pp.SponsoredProduct>>> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.p
            if (r0 == 0) goto L14
            r0 = r11
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$p r0 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.p) r0
            int r1 = r0.f109631m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f109631m = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$p r0 = new com.meijer.mobile.meijer.activity.find.viewmodel.e0$p
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r7.f109629k
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r7.f109631m
            r2 = 1
            if (r1 == 0) goto L4e
            if (r1 != r2) goto L46
            java.lang.Object r9 = r7.f109624f
            com.meijer.mobile.meijer.activity.find.viewmodel.e0 r9 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0) r9
            java.lang.Object r9 = r7.f109623e
            kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
            java.lang.Object r9 = r7.f109622d
            kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
            java.lang.Object r9 = r7.f109621c
            com.meijer.mobile.meijer.activity.find.viewmodel.e0 r9 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0) r9
            java.lang.Object r9 = r7.f109620b
            Co.h r9 = (Co.ProductFullDetails) r9
            java.lang.Object r9 = r7.f109619a
            nk.f r9 = (nk.f) r9
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
            pp.g r1 = y0(r8)     // Catch: java.lang.Exception -> L43
            java.lang.String r3 = r10.getDepartment()     // Catch: java.lang.Exception -> L43
            nk.b r11 = r10.getPrice()     // Catch: java.lang.Exception -> L43
            double r4 = r11.getValue()     // Catch: java.lang.Exception -> L43
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$g r11 = z0(r8)     // Catch: java.lang.Exception -> L43
            androidx.compose.runtime.l0 r11 = r11.Y()     // Catch: java.lang.Exception -> L43
            java.lang.Object r11 = r11.getValue()     // Catch: java.lang.Exception -> L43
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Exception -> L43
            boolean r6 = r11.booleanValue()     // Catch: java.lang.Exception -> L43
            r7.f109619a = r9     // Catch: java.lang.Exception -> L43
            r7.f109620b = r10     // Catch: java.lang.Exception -> L43
            r7.f109621c = r8     // Catch: java.lang.Exception -> L43
            r7.f109622d = r7     // Catch: java.lang.Exception -> L43
            r7.f109623e = r7     // Catch: java.lang.Exception -> L43
            r7.f109624f = r8     // Catch: java.lang.Exception -> L43
            r10 = 0
            r7.f109625g = r10     // Catch: java.lang.Exception -> L43
            r7.f109626h = r10     // Catch: java.lang.Exception -> L43
            r7.f109627i = r10     // Catch: java.lang.Exception -> L43
            r7.f109628j = r10     // Catch: java.lang.Exception -> L43
            r7.f109631m = r2     // Catch: java.lang.Exception -> L43
            r2 = r9
            java.lang.Object r11 = r1.b(r2, r3, r4, r6, r7)     // Catch: java.lang.Exception -> L43
            if (r11 != r0) goto L94
            return r0
        L94:
            java.lang.Object r9 = kotlin.Result.b(r11)     // Catch: java.lang.Exception -> L43
            return r9
        L99:
            kotlin.coroutines.CoroutineContext r10 = r7.getContext()
            mv.E0.i(r10)
            kotlin.Result$Companion r10 = kotlin.Result.INSTANCE
            java.lang.Object r9 = kotlin.ResultKt.a(r9)
            java.lang.Object r9 = kotlin.Result.b(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.q1(nk.f, Co.h, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r1(nk.f r5, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<Co.ProductVariantGroup>>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.q
            if (r0 == 0) goto L13
            r0 = r6
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$q r0 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.q) r0
            int r1 = r0.f109643l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109643l = r1
            goto L18
        L13:
            com.meijer.mobile.meijer.activity.find.viewmodel.e0$q r0 = new com.meijer.mobile.meijer.activity.find.viewmodel.e0$q
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f109641j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f109643l
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r5 = r0.f109636e
            com.meijer.mobile.meijer.activity.find.viewmodel.e0 r5 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0) r5
            java.lang.Object r5 = r0.f109635d
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f109634c
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f109633b
            com.meijer.mobile.meijer.activity.find.viewmodel.e0 r5 = (com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0) r5
            java.lang.Object r5 = r0.f109632a
            nk.f r5 = (nk.f) r5
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
            r0.f109632a = r5     // Catch: java.lang.Exception -> L3d
            r0.f109633b = r4     // Catch: java.lang.Exception -> L3d
            r0.f109634c = r0     // Catch: java.lang.Exception -> L3d
            r0.f109635d = r0     // Catch: java.lang.Exception -> L3d
            r0.f109636e = r4     // Catch: java.lang.Exception -> L3d
            r5 = 0
            r0.f109637f = r5     // Catch: java.lang.Exception -> L3d
            r0.f109638g = r5     // Catch: java.lang.Exception -> L3d
            r0.f109639h = r5     // Catch: java.lang.Exception -> L3d
            r0.f109640i = r5     // Catch: java.lang.Exception -> L3d
            r0.f109643l = r3     // Catch: java.lang.Exception -> L3d
            java.lang.Object r6 = r6.m(r2, r0)     // Catch: java.lang.Exception -> L3d
            if (r6 != r1) goto L70
            return r1
        L70:
            java.lang.Object r5 = kotlin.Result.b(r6)     // Catch: java.lang.Exception -> L3d
            return r5
        L75:
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            mv.E0.i(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.C12358e0.r1(nk.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void r2(a2.SeeAll action) {
        this._viewState.J().add(new SeeAllReviews(null, new ProductInformation(action.getProduct().getCode(), action.getProduct().getName(), action.getImageUrl()), 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s1() {
        String strB0 = CollectionsKt.B0(this.viewState.S().getValue().entrySet(), " | ", null, null, 0, null, new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.V
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12358e0.t1((Map.Entry) obj);
            }
        }, 30, null);
        nk.c name = this.viewState.m().getValue().getName();
        Intrinsics.h(name, "null cannot be cast to non-null type com.meijer.mobile.product.model.fulldetails.ProductFullDetails");
        ProductFullDetails productFullDetails = (ProductFullDetails) name;
        String str = productFullDetails.getName() + " | " + strB0 + " | " + productFullDetails.getPrice().getFormattedValue();
        Map mapR = MapsKt.r(TuplesKt.a("upc", this.viewState.m().getValue().getId().getCode()), TuplesKt.a("storeId", Integer.valueOf(Co.l.a(this.viewState.m().getValue().getId()).getStoreId())));
        if (strB0.length() > 0) {
            mapR.put("variant_str", str);
        }
        FS.page("Product Details Page", mapR).start();
    }

    private final String s2() {
        String string = ((StringBuilder) CollectionsKt___CollectionsKt.y0(this.viewState.S().getValue().values(), new StringBuilder(), (124 & 2) != 0 ? ", " : "|", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence t1(Map.Entry it) {
        Intrinsics.j(it, "it");
        return ((String) it.getKey()) + " | " + ((String) it.getValue());
    }

    private final String t2() {
        String string = ((StringBuilder) CollectionsKt___CollectionsKt.y0(this.viewState.S().getValue().keySet(), new StringBuilder(), (124 & 2) != 0 ? ", " : "|", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final W.ComplexPromo v1() {
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

    private final void w2(nk.f productIdentity) {
        this.firebaseCrashlytics.h("PRODUCT_ID", productIdentity.getCode());
        this.firebaseCrashlytics.g("STORE_ID", this.storeProvider.g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z1(Function0<Unit> isLoggedIn, Function0<Unit> isNotLoggedIn) {
        if (this.userManager.b()) {
            isLoggedIn.invoke();
        } else {
            isNotLoggedIn.invoke();
        }
    }

    private final void z2(a2.ShowReviewGallery showGallery) {
        this._viewState.J().add(new ReviewGallery(null, showGallery.getReviewItem().c(), showGallery.getIndex(), 1, null));
    }

    public final void A2(boolean isVisible) {
        this._viewState.y().setValue(Boolean.valueOf(isVisible));
    }

    public final void N2() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i10 = 1;
        int i11 = 0;
        this._viewState.G().setValue((this.userManager.b() && !this._viewState.y().getValue().booleanValue() && this._viewState.o().getValue().booleanValue()) ? this._viewState.Q().getValue().getActualQuantity() > 0.0d ? InterfaceC12359a.e.f109398a : new InterfaceC12359a.AddToCart(i11, i10, defaultConstructorMarker) : this._viewState.C().getValue().booleanValue() ? new InterfaceC12359a.InStore(i11, i10, defaultConstructorMarker) : InterfaceC12359a.b.f109395a);
    }

    public final void T1(AbstractC12325a action) {
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC12325a.CarouselIsVisible) {
            if (this.carouselIsVisibleEncountered) {
                return;
            }
            U0(((AbstractC12325a.CarouselIsVisible) action).a(), true);
            this.carouselIsVisibleEncountered = true;
            return;
        }
        if (action instanceof AbstractC12325a.NewItemScrolling) {
            U0(((AbstractC12325a.NewItemScrolling) action).a(), false);
            return;
        }
        if (action instanceof AbstractC12325a.OnViewCriteoBeacon) {
            AbstractC12325a.OnViewCriteoBeacon onViewCriteoBeacon = (AbstractC12325a.OnViewCriteoBeacon) action;
            if (this.viewState.M().getValue().d().containsAll(onViewCriteoBeacon.getProductList().getBeaconInfo().g())) {
                return;
            }
            u2(onViewCriteoBeacon.getProductList().getBeaconInfo().g());
            u2(CollectionsKt.e(onViewCriteoBeacon.getProductList().getBeaconInfo().getFormatLevelOnViewBeacon()));
            InterfaceC5872l0<C12328b> interfaceC5872l0M = this._viewState.M();
            C12328b value = this.viewState.M().getValue();
            C12328b c12328b = value;
            c12328b.d().addAll(onViewCriteoBeacon.getProductList().getBeaconInfo().g());
            c12328b.d().add(onViewCriteoBeacon.getProductList().getBeaconInfo().getFormatLevelOnViewBeacon());
            interfaceC5872l0M.setValue(value);
            return;
        }
        if (action instanceof AbstractC12325a.OnClickCriteoBeacon) {
            AbstractC12325a.OnClickCriteoBeacon onClickCriteoBeacon = (AbstractC12325a.OnClickCriteoBeacon) action;
            if (this.viewState.M().getValue().b().containsAll(onClickCriteoBeacon.getProductList().getBeaconInfo().e())) {
                return;
            }
            u2(onClickCriteoBeacon.getProductList().getBeaconInfo().e());
            u2(CollectionsKt.e(onClickCriteoBeacon.getProductList().getBeaconInfo().getFormatLevelOnClickBeacon()));
            InterfaceC5872l0<C12328b> interfaceC5872l0M2 = this._viewState.M();
            C12328b value2 = this.viewState.M().getValue();
            value2.b().addAll(CollectionsKt.Q0(onClickCriteoBeacon.getProductList().getBeaconInfo().e(), onClickCriteoBeacon.getProductList().getBeaconInfo().getFormatLevelOnClickBeacon()));
            interfaceC5872l0M2.setValue(value2);
            return;
        }
        if (!(action instanceof AbstractC12325a.OnLoadCriteoBeacon)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC12325a.OnLoadCriteoBeacon onLoadCriteoBeacon = (AbstractC12325a.OnLoadCriteoBeacon) action;
        if (this.viewState.M().getValue().c().contains(onLoadCriteoBeacon.getProductList().getBeaconInfo().getOnLoadBeacon())) {
            return;
        }
        u2(CollectionsKt.e(onLoadCriteoBeacon.getProductList().getBeaconInfo().getOnLoadBeacon()));
        u2(CollectionsKt.e(onLoadCriteoBeacon.getProductList().getBeaconInfo().getFormatLevelOnLoadBeacon()));
        InterfaceC5872l0<C12328b> interfaceC5872l0M3 = this._viewState.M();
        C12328b value3 = this.viewState.M().getValue();
        value3.c().addAll(CollectionsKt.p(onLoadCriteoBeacon.getProductList().getBeaconInfo().getOnLoadBeacon(), onLoadCriteoBeacon.getProductList().getBeaconInfo().getFormatLevelOnLoadBeacon()));
        interfaceC5872l0M3.setValue(value3);
    }

    public final void W1(Qk.a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.Clip) {
            o2(((a.Clip) action).getCoupon());
        } else if (!(action instanceof a.NotInterested) && !(action instanceof a.Unclip) && !(action instanceof a.ViewCouponList) && !(action instanceof a.ViewCouponDetails)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void a2(n2 reloadable) {
        Intrinsics.j(reloadable, "reloadable");
        if (reloadable instanceof n2.FrequentlyBoughtTogether) {
            n1(((n2.FrequentlyBoughtTogether) reloadable).getProduct());
        } else if (reloadable instanceof n2.BazaarVoiceReviews) {
            C15809k.d(androidx.view.d0.a(this), this.ioDispatcher, null, new x(reloadable, null), 2, null);
        } else {
            if (!(reloadable instanceof n2.Product)) {
                throw new NoWhenBranchMatchedException();
            }
            y2(((n2.Product) reloadable).getProduct());
        }
    }

    public final void e2(m2 result) {
        Intrinsics.j(result, "result");
        C15809k.d(androidx.view.d0.a(this), null, null, new y(result, this, null), 3, null);
    }

    public final void h3(boolean action, ProductVariantDecorator productVariantDecorator, String variantName) {
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
        M2(name == null ? "" : name, variantName, productVariantDecorator.getId());
        A1(action);
        W2(name != null ? name : "", variantName);
        P0(name, variantName);
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        this.disposables.d();
        X0();
        super.onCleared();
    }

    @Override // androidx.view.InterfaceC6157f
    public void onResume(InterfaceC6172s owner) {
        ProductDetailFeatureFlags value;
        boolean zE;
        boolean zE2;
        Intrinsics.j(owner, "owner");
        F1();
        InterfaceC16549B<ProductDetailFeatureFlags> interfaceC16549B = this._featureFlags;
        do {
            value = interfaceC16549B.getValue();
            zE = this.featureManager.e(AbstractC18503f.A.f172842h);
            zE2 = this.featureManager.e(AbstractC18503f.O.f172854h);
        } while (!interfaceC16549B.e(value, new ProductDetailFeatureFlags(this.featureManager.e(AbstractC18503f.C2788f.f172876h), zE, zE2, this.featureManager.e(AbstractC18503f.C.f172844h), this.featureManager.e(AbstractC18503f.V.f172861h), this.featureManager.e(AbstractC18503f.W.f172862h), this.featureManager.e(AbstractC18503f.C18522t.f172904h), this.featureManager.e(AbstractC18503f.Z.f172865h))));
    }

    /* renamed from: u1, reason: from getter */
    public final String getCampaignIdValue() {
        return this.campaignIdValue;
    }

    public final void v2(String str) {
        this.campaignIdValue = str;
    }

    public final pv.P<ProductDetailFeatureFlags> w1() {
        return this.featureFlags;
    }

    public final pv.P<ProductState<ProductFullDetails>> x1() {
        return this.productStateFlow;
    }

    public final void x2(String str) {
        this.previousTrackAction = str;
    }

    /* renamed from: y1, reason: from getter */
    public final InterfaceC12362d getViewState() {
        return this.viewState;
    }

    public final void y2(nk.f productIdentity) {
        Intrinsics.j(productIdentity, "productIdentity");
        w2(productIdentity);
        o1(productIdentity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B2(int message) {
        C15809k.d(androidx.view.d0.a(this), null, null, new H(message, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M1(C12358e0 c12358e0, Object obj, List list) {
        Intrinsics.g(list);
        c12358e0.f2(obj, list);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void Q0(nk.c product) {
        C15809k.d(androidx.view.d0.a(this), null, null, new C12366h(product, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit Q2(C12358e0 c12358e0) {
        c12358e0.k2();
        c12358e0._viewState.J().add(new InterfaceC12363e.RequireLogin(null, Cj.o.f5056d, 1, 0 == true ? 1 : 0));
        return Unit.f143329a;
    }

    private final void R0(nk.c product) {
        C15809k.d(androidx.view.d0.a(this), null, null, new C12367i(product, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void U1(CouponException exception) {
        C15809k.d(androidx.view.d0.a(this), null, null, new w(exception, this, null), 3, null);
    }

    private final void U2(List<ProductComplexPromo> complexPromos) {
        ProductComplexPromo productComplexPromo = (ProductComplexPromo) CollectionsKt.u0(complexPromos);
        if (productComplexPromo != null) {
            this._viewState.T().setValue(ProductComplexPromoDecorator.INSTANCE.a(productComplexPromo));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z0(C12358e0 c12358e0, Coupon coupon, ClipUnclipCouponResponse clipUnclipCouponResponse) {
        c12358e0.V1(coupon);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void a3(InterfaceC12364f.UpdateItem update) {
        C15809k.d(androidx.view.d0.a(this), null, null, new L(update, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> void d1(Object obj, Function1<? super T, Unit> function1, Function1<? super Throwable, Unit> function12) {
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

    private final void i2(nk.c product) {
        C15809k.d(androidx.view.d0.a(this), null, null, new z(product, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j1(C12358e0 c12358e0, String str) {
        Intrinsics.g(str);
        c12358e0.cartId = str;
        return Unit.f143329a;
    }

    private final void j2(nk.f product) {
        C15809k.d(androidx.view.d0.a(this), null, null, new A(product, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Unit j3(List<ProductState<ProductFullDetails>> productStates) {
        ProductState<ProductFullDetails> productState = (ProductState) CollectionsKt.u0(productStates);
        if (productState != null) {
            InterfaceC16549B<ProductState<ProductFullDetails>> interfaceC16549B = this._productStateFlow;
            while (!interfaceC16549B.e(interfaceC16549B.getValue(), productState)) {
            }
            c3((ProductFullDetails) productState.g());
            b3((ProductFullDetails) productState.g());
            f3((ProductFullDetails) productState.g(), this.storeProvider.a());
            e3(((ProductFullDetails) productState.g()).getNutritionLabel());
            V2(productState.d());
            U2(productState.c());
            g3(productState.getShoppingListItem());
            X2(productState.getFavoriteListItem());
            T2((ProductFullDetails) productState.g(), productState.getCartEntry());
            S2(productState.getEligibility());
            d3((ProductFullDetails) productState.g(), productState.getEligibility());
            Y2((ProductFullDetails) productState.g());
            N2();
            return Unit.f143329a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void l3(nk.c product) {
        C15809k.d(androidx.view.d0.a(this), null, null, new M(product, null), 3, null);
    }

    private final void m3(nk.c product) {
        C15809k.d(androidx.view.d0.a(this), null, null, new N(product, null), 3, null);
        this.analyticsEngine.b(C14756c.a("event: products: view on shopping list"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.W
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12358e0.n3((TrackingData) obj);
            }
        });
    }

    private final void o1(nk.f productIdentity) {
        C15809k.d(androidx.view.d0.a(this), this.ioDispatcher, null, new C12372n(productIdentity, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void u2(List<String> beacon) {
        C15809k.d(androidx.view.d0.a(this), this.ioDispatcher, null, new G(beacon, this, null), 2, null);
    }

    public final void k2() {
        C15809k.d(androidx.view.d0.a(this), null, null, new B(null), 3, null);
    }
}
