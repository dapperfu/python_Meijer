package com.meijer.mobile.meijer.activity.personalized.modals;

import Ao.C2898u;
import Ao.W;
import Co.ProductFullDetails;
import Co.StockInfo;
import Fq.ShoppingListItem;
import Hr.CouponCountDownStateDecorator;
import Ir.UserActionDialogInfo;
import Pj.a;
import Pk.Coupon;
import Qk.a;
import Qo.l;
import Sk.CouponOptions;
import Ul.ToastMessageData;
import Yk.CouponState;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse;
import com.meijer.mobile.meijer.C12687q;
import com.meijer.mobile.meijer.C12689s;
import com.meijer.mobile.meijer.InterfaceC12688r;
import com.meijer.mobile.meijer.search.EnumC12707c;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import dl.C13702d;
import el.CouponsResponse;
import ev.C13889a;
import fj.Entry;
import fj.EntryChange;
import fj.ShoppingCart;
import gi.C14375c;
import gi.EnumC14378f;
import gi.GoogleAdAnalytics;
import gi.GoogleAdData;
import hi.InterfaceC14523a;
import ii.AbstractC14762i;
import ii.C14756c;
import ii.TrackingData;
import ik.CartPreviewDecorator;
import io.constructor.BuildConfig;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import jj.FulfillmentSlot;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import mv.AbstractC15779K;
import mv.C15784P;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import pv.InterfaceC16562g;
import qp.C16753b;
import qw.a;
import retrofit2.HttpException;
import sp.ProductState;
import tn.Paginator;
import tr.C17284b;
import ts.ProductCardDecorator;
import uk.AbstractC17440a;
import uk.c;
import ur.AbstractC17454a;
import vr.AbstractC17720a;
import vs.CartProductListDecorator;
import vs.ProductListDecorator;
import wl.CartEntry;
import wl.ProductEligibility;
import wr.InterfaceC17909a;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000ø\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 è\u00022\u00020\u00012\u00020\u00012\u00020\u0002:\u0010à\u0001ä\u0001æ\u0001é\u0001Ú\u0001â\u0001Þ\u0001Ü\u0001B\u008b\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\b\u0001\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b&\u0010'J+\u0010-\u001a\u00020,2\u0006\u0010(\u001a\u00020%2\b\b\u0002\u0010*\u001a\u00020)2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010%¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u00020,2\u0006\u00100\u001a\u00020/2\b\b\u0002\u0010*\u001a\u00020)¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020,2\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020,2\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\u00020,2\u0006\u00108\u001a\u00020;¢\u0006\u0004\b<\u0010=J;\u0010E\u001a\u00020,2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020%0>2\u0006\u0010@\u001a\u00020%2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010A2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010C¢\u0006\u0004\bE\u0010FJ;\u0010G\u001a\u00020,2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020%0>2\u0006\u0010@\u001a\u00020%2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010A2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010C¢\u0006\u0004\bG\u0010FJ;\u0010J\u001a\u00020,2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020%0>2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010A2\b\b\u0002\u0010I\u001a\u00020)2\b\u0010D\u001a\u0004\u0018\u00010C¢\u0006\u0004\bJ\u0010KJ5\u0010L\u001a\u00020,2\u0006\u0010?\u001a\u00020%2\u0006\u0010@\u001a\u00020%2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010A2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010C¢\u0006\u0004\bL\u0010MJ\r\u0010N\u001a\u00020,¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020,H\u0016¢\u0006\u0004\bP\u0010OJ\u0019\u0010R\u001a\u00020)2\b\u0010Q\u001a\u0004\u0018\u00010%H\u0000¢\u0006\u0004\bR\u0010SJ\u001b\u0010U\u001a\u0004\u0018\u00010T2\b\u0010Q\u001a\u0004\u0018\u00010%H\u0007¢\u0006\u0004\bU\u0010VJC\u0010[\u001a\u00020,2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010/2(\b\u0002\u0010Z\u001a\"\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%\u0018\u00010Xj\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%\u0018\u0001`Y¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020,H\u0002¢\u0006\u0004\b]\u0010OJ'\u0010d\u001a\u00020,2\u0006\u0010_\u001a\u00020^2\u0006\u0010a\u001a\u00020`2\u0006\u0010c\u001a\u00020bH\u0002¢\u0006\u0004\bd\u0010eJ\u0017\u0010g\u001a\u00020,2\u0006\u0010f\u001a\u00020/H\u0002¢\u0006\u0004\bg\u0010hJ\u001d\u0010k\u001a\u00020,2\f\u0010j\u001a\b\u0012\u0004\u0012\u00020i0>H\u0002¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020,H\u0002¢\u0006\u0004\bm\u0010OJ#\u0010q\u001a\u00020,2\u0012\u0010p\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020o0n0>H\u0002¢\u0006\u0004\bq\u0010lJ\u000f\u0010r\u001a\u00020,H\u0002¢\u0006\u0004\br\u0010OJ\u000f\u0010s\u001a\u00020,H\u0002¢\u0006\u0004\bs\u0010OJ\u000f\u0010t\u001a\u00020,H\u0002¢\u0006\u0004\bt\u0010OJ!\u0010y\u001a\u00020,2\u0006\u0010v\u001a\u00020u2\b\u0010x\u001a\u0004\u0018\u00010wH\u0002¢\u0006\u0004\by\u0010zJ!\u0010~\u001a\u00020,2\u0006\u0010|\u001a\u00020{2\b\u0010}\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b~\u0010\u007fJ.\u0010\u0082\u0001\u001a\u00020,2\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0006\u0010|\u001a\u00020{2\b\u0010}\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J'\u0010\u0087\u0001\u001a\u00020,2\n\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u00012\u0007\u0010\u0086\u0001\u001a\u00020{H\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J#\u0010\u0089\u0001\u001a\u00020,2\u0006\u0010|\u001a\u00020{2\b\u0010}\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0005\b\u0089\u0001\u0010\u007fJ\u0013\u0010\u008a\u0001\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0005\b\u008a\u0001\u0010'J\u0013\u0010\u008b\u0001\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0005\b\u008b\u0001\u0010'J\u0019\u0010\u008c\u0001\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0005\b\u008c\u0001\u0010hJ\u001b\u0010\u008e\u0001\u001a\u00020,2\u0007\u00100\u001a\u00030\u008d\u0001H\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001d\u0010\u0091\u0001\u001a\u00020,2\t\b\u0002\u0010\u0090\u0001\u001a\u00020)H\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J)\u0010\u0096\u0001\u001a\u00020,2\n\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0093\u00012\t\u0010\u0095\u0001\u001a\u0004\u0018\u00010oH\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u0011\u0010\u0098\u0001\u001a\u00020,H\u0002¢\u0006\u0005\b\u0098\u0001\u0010OJ*\u0010\u009a\u0001\u001a\u00020,2\n\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0093\u00012\n\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0099\u0001H\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J8\u0010\u009c\u0001\u001a\u00020,2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020%0>2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010A2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010CH\u0002¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J0\u0010\u009e\u0001\u001a\u00020,2\b\u0010H\u001a\u0004\u0018\u00010A2\b\b\u0002\u0010I\u001a\u00020)2\b\u0010D\u001a\u0004\u0018\u00010CH\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J$\u0010¢\u0001\u001a\u00020,2\u0006\u0010D\u001a\u00020o2\b\u0010¡\u0001\u001a\u00030 \u0001H\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u0011\u0010¤\u0001\u001a\u00020,H\u0002¢\u0006\u0005\b¤\u0001\u0010OJ%\u0010¨\u0001\u001a\u00030§\u00012\u0007\u0010¥\u0001\u001a\u00020b2\u0007\u0010¦\u0001\u001a\u00020bH\u0002¢\u0006\u0006\b¨\u0001\u0010©\u0001J$\u0010ª\u0001\u001a\u00020,2\u0007\u0010¥\u0001\u001a\u00020b2\u0007\u0010¦\u0001\u001a\u00020bH\u0002¢\u0006\u0006\bª\u0001\u0010«\u0001J\u0019\u0010¬\u0001\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0005\b¬\u0001\u0010hJ\u001c\u0010¯\u0001\u001a\u00020,2\b\u0010®\u0001\u001a\u00030\u00ad\u0001H\u0002¢\u0006\u0006\b¯\u0001\u0010°\u0001J,\u0010±\u0001\u001a\u00020,2\u0006\u0010D\u001a\u00020o2\b\u0010f\u001a\u0004\u0018\u00010/2\u0006\u0010c\u001a\u00020bH\u0002¢\u0006\u0006\b±\u0001\u0010²\u0001J\u001b\u0010´\u0001\u001a\u00020,2\u0007\u0010³\u0001\u001a\u00020%H\u0002¢\u0006\u0006\b´\u0001\u0010µ\u0001J*\u0010·\u0001\u001a\u0005\u0018\u00010\u0084\u00012\b\u0010Q\u001a\u0004\u0018\u00010%2\t\b\u0002\u0010¶\u0001\u001a\u00020)H\u0002¢\u0006\u0006\b·\u0001\u0010¸\u0001J'\u0010¼\u0001\u001a\u000b\u0012\u0005\u0012\u00030»\u0001\u0018\u00010>2\n\u0010º\u0001\u001a\u0005\u0018\u00010¹\u0001H\u0002¢\u0006\u0006\b¼\u0001\u0010½\u0001J/\u0010¿\u0001\u001a\u0004\u0018\u00010b2\b\u0010\u0085\u0001\u001a\u00030\u0084\u00012\u000f\u0010º\u0001\u001a\n\u0012\u0005\u0012\u00030¹\u00010¾\u0001H\u0002¢\u0006\u0006\b¿\u0001\u0010À\u0001J'\u0010Ä\u0001\u001a\u00030Ã\u00012\u0007\u0010Á\u0001\u001a\u00020b2\t\b\u0002\u0010Â\u0001\u001a\u00020bH\u0002¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J#\u0010Æ\u0001\u001a\u00020)2\u000f\u0010º\u0001\u001a\n\u0012\u0005\u0012\u00030¹\u00010¾\u0001H\u0002¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001R\u0016\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R\u0016\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010Ï\u0001R\u0016\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\u0016\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R\u0016\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R\u0016\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R\u0016\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R\u0016\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÜ\u0001\u0010Ý\u0001R\u0016\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u0016\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\u0016\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R'\u0010í\u0001\u001a\t\u0012\u0004\u0012\u00020/0è\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bé\u0001\u0010ê\u0001\u001a\u0006\bë\u0001\u0010ì\u0001R\u001f\u0010ò\u0001\u001a\n\u0012\u0005\u0012\u00030ï\u00010î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bð\u0001\u0010ñ\u0001R\u0018\u0010ö\u0001\u001a\u00030ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bô\u0001\u0010õ\u0001R\u001e\u0010ù\u0001\u001a\t\u0012\u0004\u0012\u00020)0è\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b÷\u0001\u0010ø\u0001R#\u0010ÿ\u0001\u001a\t\u0012\u0004\u0012\u00020)0ú\u00018\u0006¢\u0006\u0010\n\u0006\bû\u0001\u0010ü\u0001\u001a\u0006\bý\u0001\u0010þ\u0001R\u001b\u0010\u0082\u0002\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0002\u0010\u0081\u0002R\u0019\u0010\u0085\u0002\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0002\u0010\u0084\u0002R*\u0010\u0089\u0002\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0086\u0002\u0010\u0084\u0002\u001a\u0005\b\u0087\u0002\u0010'\"\u0006\b\u0088\u0002\u0010µ\u0001R*\u0010\u008d\u0002\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u008a\u0002\u0010\u0084\u0002\u001a\u0005\b\u008b\u0002\u0010'\"\u0006\b\u008c\u0002\u0010µ\u0001R*\u0010\u0091\u0002\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u008e\u0002\u0010\u0084\u0002\u001a\u0005\b\u008f\u0002\u0010'\"\u0006\b\u0090\u0002\u0010µ\u0001R*\u0010\u0095\u0002\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0092\u0002\u0010\u0084\u0002\u001a\u0005\b\u0093\u0002\u0010'\"\u0006\b\u0094\u0002\u0010µ\u0001R*\u0010\u0099\u0002\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0096\u0002\u0010\u0084\u0002\u001a\u0005\b\u0097\u0002\u0010'\"\u0006\b\u0098\u0002\u0010µ\u0001R\u001c\u0010\u009d\u0002\u001a\u0005\u0018\u00010\u009a\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0002\u0010\u009c\u0002R\u001a\u0010+\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0002\u0010\u0084\u0002R\u001e\u0010¢\u0002\u001a\t\u0012\u0004\u0012\u00020%0\u009f\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0002\u0010¡\u0002R#\u0010¦\u0002\u001a\t\u0012\u0004\u0012\u00020%0\u009f\u00028\u0006¢\u0006\u0010\n\u0006\b£\u0002\u0010¡\u0002\u001a\u0006\b¤\u0002\u0010¥\u0002R#\u0010©\u0002\u001a\t\u0012\u0004\u0012\u00020%0\u009f\u00028\u0006¢\u0006\u0010\n\u0006\b§\u0002\u0010¡\u0002\u001a\u0006\b¨\u0002\u0010¥\u0002R\u001f\u0010\u00ad\u0002\u001a\n\u0012\u0005\u0012\u00030\u00ad\u00010ª\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0002\u0010¬\u0002R\u001e\u0010°\u0002\u001a\u00070%j\u0003`®\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0002\u0010\u0084\u0002R\u0018\u0010´\u0002\u001a\u00030±\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0002\u0010³\u0002R\u0018\u0010¸\u0002\u001a\u00030µ\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0002\u0010·\u0002R\u001f\u0010»\u0002\u001a\n\u0012\u0005\u0012\u00030¹\u00020è\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0002\u0010ø\u0001R$\u0010¾\u0002\u001a\n\u0012\u0005\u0012\u00030¹\u00020ú\u00018\u0006¢\u0006\u0010\n\u0006\b¼\u0002\u0010ü\u0001\u001a\u0006\b½\u0002\u0010þ\u0001R1\u0010Ç\u0002\u001a\u00030¿\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0006\bÀ\u0002\u0010Á\u0002\u0012\u0005\bÆ\u0002\u0010O\u001a\u0006\bÂ\u0002\u0010Ã\u0002\"\u0006\bÄ\u0002\u0010Å\u0002R\u001f\u0010Ê\u0002\u001a\n\u0012\u0005\u0012\u00030È\u00020î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÉ\u0002\u0010ñ\u0001R9\u0010Ó\u0002\u001a\u0005\u0018\u00010Ë\u00022\n\u0010Ì\u0002\u001a\u0005\u0018\u00010Ë\u00028B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\bÍ\u0002\u0010Î\u0002\u001a\u0006\bÏ\u0002\u0010Ð\u0002\"\u0006\bÑ\u0002\u0010Ò\u0002RD\u0010×\u0002\u001a\u000b\u0018\u00010%j\u0005\u0018\u0001`®\u00022\u0010\u0010Ì\u0002\u001a\u000b\u0018\u00010%j\u0005\u0018\u0001`®\u00028B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\bÔ\u0002\u0010Î\u0002\u001a\u0005\bÕ\u0002\u0010'\"\u0006\bÖ\u0002\u0010µ\u0001R*\u0010ß\u0002\u001a\u00030Ø\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÙ\u0002\u0010Ú\u0002\u001a\u0006\bÛ\u0002\u0010Ü\u0002\"\u0006\bÝ\u0002\u0010Þ\u0002R\u001c\u0010ã\u0002\u001a\n\u0012\u0005\u0012\u00030È\u00020à\u00028F¢\u0006\b\u001a\u0006\bá\u0002\u0010â\u0002R\u001a\u0010ç\u0002\u001a\u0005\u0018\u00010ä\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bå\u0002\u0010æ\u0002¨\u0006é\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G;", "", "Ljava/io/Closeable;", "LTq/j;", "storeProvider", "Lyo/k;", "userManager", "Lzl/k;", "featureManager", "Lsp/Y;", "productStateRepository", "Lil/m;", "cartRepository", "LEq/b;", "shoppingListRepository", "Lwr/f;", "cartInteractor", "Ltl/h;", "timeSlotRepository", "Ldl/d;", "couponsRepository", "Lcom/meijer/mobile/meijer/activity/personalized/modals/B0;", "productQueryPagingDataSource", "Lhi/a;", "analyticsEngine", "LRo/a;", "productAnalytics", "Lqp/b;", "beaconClient", "Lpp/e;", "sponsorshipsDataStore", "Lpp/d;", "productMetadataStore", "Lmv/K;", "ioDispatcher", "<init>", "(LTq/j;Lyo/k;Lzl/k;Lsp/Y;Lil/m;LEq/b;Lwr/f;Ltl/h;Ldl/d;Lcom/meijer/mobile/meijer/activity/personalized/modals/B0;Lhi/a;LRo/a;Lqp/b;Lpp/e;Lpp/d;Lmv/K;)V", "", "u3", "()Ljava/lang/String;", "term", "", "forceRefresh", "searchMethod", "", "r4", "(Ljava/lang/String;ZLjava/lang/String;)V", "LQo/l;", "query", "o4", "(LQo/l;Z)V", "Lvs/b;", "item", "l4", "(Lvs/b;)V", "LQk/a;", "action", "K3", "(LQk/a;)V", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j;", "M3", "(Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j;)V", "", "beacon", "formatLevelBeacon", "LUl/a;", "beaconType", "Lnk/c;", "product", "j4", "(Ljava/util/List;Ljava/lang/String;LUl/a;Lnk/c;)V", "g4", "type", "isFormatLevel", "e4", "(Ljava/util/List;LUl/a;ZLnk/c;)V", "h4", "(Ljava/lang/String;Ljava/lang/String;LUl/a;Lnk/c;)V", "E4", "()V", "close", "productCode", "t3", "(Ljava/lang/String;)Z", "LAo/W$a;", "J2", "(Ljava/lang/String;)LAo/W$a;", "initialProductQuery", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "departmentBreadcrumbs", "B3", "(LQo/l;Ljava/util/HashMap;)V", "C4", "Lts/a;", "itemClicked", "LPp/b;", "searchType", "", "position", "y3", "(Lts/a;LPp/b;I)V", "productQuery", "U3", "(LQo/l;)V", "LPj/a;", "loadingStates", "P3", "(Ljava/util/List;)V", "T1", "Lsp/b;", "LCo/h;", "productStates", "V3", "Y3", "G3", "b2", "LPk/c;", "couponIdentity", "Lii/f;", "trackingData", "j2", "(LPk/c;Lii/f;)V", "LPk/a;", "coupon", "couponLocation", "F1", "(LPk/a;Ljava/lang/String;)V", "Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;", "response", "O3", "(Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;LPk/a;Ljava/lang/String;)V", "LYk/c;", "couponState", "clippedCoupon", "u4", "(LYk/c;LPk/a;)V", "x4", "B2", "A2", "r2", "LQo/l$k;", "k4", "(LQo/l$k;)V", "overrideItemAlreadyInCart", "v4", "(Z)V", "Lnk/i;", "original", "alternative", "b4", "(Lnk/i;LCo/h;)V", "A4", "Lnk/f;", "w4", "(Lnk/i;Lnk/f;)V", "i4", "(Ljava/util/List;LUl/a;Lnk/c;)V", "d4", "(LUl/a;ZLnk/c;)V", "", "quantityToUpdate", "D4", "(LCo/h;D)V", "E3", "tokenMatchCount", "embeddingsCount", "Lcom/meijer/mobile/meijer/search/c;", "R1", "(II)Lcom/meijer/mobile/meijer/search/c;", "I4", "(II)V", "F3", "LTq/k;", "storeDetails", "Z3", "(LTq/k;)V", "a4", "(LCo/h;LQo/l;I)V", "event", "z4", "(Ljava/lang/String;)V", "logError", "N2", "(Ljava/lang/String;Z)LYk/c;", "Lfj/j;", "entryChange", "LPk/f;", "L2", "(Lfj/j;)Ljava/util/List;", "Luk/c;", "v2", "(LYk/c;Luk/c;)Ljava/lang/Integer;", "freeItemsCount", "rewardItemsCount", "Lbk/a;", "d3", "(II)Lbk/a;", "t4", "(Luk/c;)Z", "a", "LTq/j;", "b", "Lyo/k;", "c", "Lzl/k;", "d", "Lsp/Y;", "e", "Lil/m;", "f", "LEq/b;", "g", "Lwr/f;", "h", "Ltl/h;", "i", "Ldl/d;", "j", "Lcom/meijer/mobile/meijer/activity/personalized/modals/B0;", "k", "Lhi/a;", "l", "LRo/a;", "m", "Lqp/b;", "n", "Lpp/e;", "o", "Lpp/d;", "p", "Lmv/K;", "Lpv/B;", "q", "Lkotlin/Lazy;", "l3", "()Lpv/B;", "queryStore", "Lpv/A;", "LUl/e;", "r", "Lpv/A;", "_toastMessageData", "Lmv/O;", "s", "Lmv/O;", "coroutineScope", "t", "Lpv/B;", "_stepperClicked", "Lpv/P;", "u", "Lpv/P;", "getStepperClicked", "()Lpv/P;", "stepperClicked", "v", "Lvs/b;", "itemToSubstitute", "w", "Ljava/lang/String;", "carouselTitle", "x", "w2", "setCampaignIdValue", "campaignIdValue", "y", "D2", "setCmpid", "cmpid", "z", "H2", "setCollectionName", "collectionName", "A", "Z2", "setDepartmentCarouselAnalytics", "departmentCarouselAnalytics", "B", "z2", "setCarouselTitleAnalytics", "carouselTitleAnalytics", "LQo/l$i;", "C", "LQo/l$i;", "searchQuery", "D", "", "E", "Ljava/util/List;", "trackingLoadBeacon", "F", "getTrackingOnLoadFormatLevelBeacon", "()Ljava/util/List;", "trackingOnLoadFormatLevelBeacon", "G", "getTrackingOnViewFormatLevelBeacon", "trackingOnViewFormatLevelBeacon", "Lio/reactivex/l;", "H", "Lio/reactivex/l;", "currentStoreStream", "Lcom/meijer/mobile/core/model/common/ResourceId;", "I", "cartId", "LPj/c;", "J", "LPj/c;", "loadingStatesManager", "LJu/a;", "K", "LJu/a;", "disposables", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$q;", "L", "_viewState", "M", "v3", "viewState", "Ltn/a;", "N", "Ltn/a;", "f3", "()Ltn/a;", "m4", "(Ltn/a;)V", "getPaginator$annotations", "paginator", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n;", "O", "_event", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$m;", "<set-?>", "P", "Lkotlin/properties/ReadWriteProperty;", "g3", "()Lcom/meijer/mobile/meijer/activity/personalized/modals/G$m;", "n4", "(Lcom/meijer/mobile/meijer/activity/personalized/modals/G$m;)V", "productInQtyStepperInteraction", "Q", "o3", "q4", "resetStepperState", "Lcom/meijer/mobile/meijer/r;", "R", "Lcom/meijer/mobile/meijer/r;", "getAdManagerProvider", "()Lcom/meijer/mobile/meijer/r;", "setAdManagerProvider", "(Lcom/meijer/mobile/meijer/r;)V", "adManagerProvider", "Lpv/F;", "b3", "()Lpv/F;", "events", "Lvs/f;", "p3", "()Lvs/f;", "selectedProduct", "S", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class G implements Closeable {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private String departmentCarouselAnalytics;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private String carouselTitleAnalytics;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private l.Search searchQuery;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private String searchMethod;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final List<String> trackingLoadBeacon;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final List<String> trackingOnLoadFormatLevelBeacon;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final List<String> trackingOnViewFormatLevelBeacon;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final io.reactivex.l<Tq.k> currentStoreStream;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private String cartId;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final Pj.c loadingStatesManager;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _viewState;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final pv.P<ViewState> viewState;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private Paginator paginator;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<n> _event;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty productInQtyStepperInteraction;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty resetStepperState;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private InterfaceC12688r adManagerProvider;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final zl.k featureManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final sp.Y productStateRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final il.m cartRepository;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Eq.b shoppingListRepository;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final wr.f cartInteractor;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final tl.h timeSlotRepository;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final C13702d couponsRepository;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final B0 productQueryPagingDataSource;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Ro.a productAnalytics;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final C16753b beaconClient;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final pp.e sponsorshipsDataStore;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final pp.d productMetadataStore;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Lazy queryStore;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<ToastMessageData> _toastMessageData;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15783O coroutineScope;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<Boolean> _stepperClicked;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final pv.P<Boolean> stepperClicked;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private CartProductListDecorator itemToSubstitute;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private String carouselTitle;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private String campaignIdValue;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private String cmpid;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private String collectionName;

    /* renamed from: T, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f111467T = {Reflection.f(new MutablePropertyReference1Impl(G.class, "productInQtyStepperInteraction", "getProductInQtyStepperInteraction()Lcom/meijer/mobile/meijer/activity/personalized/modals/PLPStateHolder$EntryInQtyStepperInteraction;", 0)), Reflection.f(new MutablePropertyReference1Impl(G.class, "resetStepperState", "getResetStepperState()Ljava/lang/String;", 0))};

    /* renamed from: U, reason: collision with root package name */
    public static final int f111468U = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$onViewProductDetails$1", f = "PLPStateHolder.kt", l = {1782}, m = "invokeSuspend")
    static final class A extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111513a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ProductFullDetails f111515c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return G.this.new A(this.f111515c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        A(ProductFullDetails productFullDetails, Continuation<? super A> continuation) {
            super(2, continuation);
            this.f111515c = productFullDetails;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((A) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111513a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = G.this._event;
                n.ViewProductDetailsEvent viewProductDetailsEvent = new n.ViewProductDetailsEvent(this.f111515c);
                this.f111513a = 1;
                if (interfaceC16548A.emit(viewProductDetailsEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$proactiveSubstitute$1$1", f = "PLPStateHolder.kt", l = {959, 966, 973}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class B extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f111516a;

        /* renamed from: b, reason: collision with root package name */
        Object f111517b;

        /* renamed from: c, reason: collision with root package name */
        Object f111518c;

        /* renamed from: d, reason: collision with root package name */
        Object f111519d;

        /* renamed from: e, reason: collision with root package name */
        Object f111520e;

        /* renamed from: f, reason: collision with root package name */
        int f111521f;

        /* renamed from: g, reason: collision with root package name */
        int f111522g;

        /* renamed from: h, reason: collision with root package name */
        int f111523h;

        /* renamed from: i, reason: collision with root package name */
        int f111524i;

        /* renamed from: j, reason: collision with root package name */
        int f111525j;

        /* renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f111526k;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ nk.i f111528m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ ProductFullDetails f111529n;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            B b10 = G.this.new B(this.f111528m, this.f111529n, continuation);
            b10.f111526k = obj;
            return b10;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        B(nk.i iVar, ProductFullDetails productFullDetails, Continuation<? super B> continuation) {
            super(2, continuation);
            this.f111528m = iVar;
            this.f111529n = productFullDetails;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((B) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0106, code lost:
        
            if (r7.emit(r14, r15) == r8) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x014a, code lost:
        
            if (r0.emit(r2, r15) == r8) goto L42;
         */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x010c A[PHI: r3 r4
          0x010c: PHI (r3v5 java.lang.Object) = (r3v4 java.lang.Object), (r3v6 java.lang.Object) binds: [B:33:0x00db, B:37:0x0109] A[DONT_GENERATE, DONT_INLINE]
          0x010c: PHI (r4v2 mv.O) = (r4v1 mv.O), (r4v3 mv.O) binds: [B:33:0x00db, B:37:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0114  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
                Method dump skipped, instructions count: 336
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.personalized.modals.G.B.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$sendBeaconToastMessage$1", f = "PLPStateHolder.kt", l = {1367}, m = "invokeSuspend")
    static final class C extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f111530a;

        /* renamed from: b, reason: collision with root package name */
        int f111531b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f111532c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ G f111533d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Ul.a f111534e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ nk.c f111535f;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C(this.f111532c, this.f111533d, this.f111534e, this.f111535f, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C(boolean z10, G g10, Ul.a aVar, nk.c cVar, Continuation<? super C> continuation) {
            super(2, continuation);
            this.f111532c = z10;
            this.f111533d = g10;
            this.f111534e = aVar;
            this.f111535f = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            String displayName;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111531b;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                if (this.f111532c) {
                    str = "Format Level";
                } else {
                    str = "Sku level";
                }
                InterfaceC16548A interfaceC16548A = this.f111533d._toastMessageData;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(' ');
                Ul.a aVar = this.f111534e;
                if (aVar != null) {
                    displayName = aVar.getDisplayName();
                } else {
                    displayName = null;
                }
                sb2.append(displayName);
                sb2.append(" Beacon sent successfully!");
                ToastMessageData toastMessageData = new ToastMessageData(sb2.toString(), this.f111535f);
                this.f111530a = str;
                this.f111531b = 1;
                if (interfaceC16548A.emit(toastMessageData, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$sendCriteoBeacon$1", f = "PLPStateHolder.kt", l = {1283}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class D extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f111536a;

        /* renamed from: b, reason: collision with root package name */
        Object f111537b;

        /* renamed from: c, reason: collision with root package name */
        Object f111538c;

        /* renamed from: d, reason: collision with root package name */
        Object f111539d;

        /* renamed from: e, reason: collision with root package name */
        Object f111540e;

        /* renamed from: f, reason: collision with root package name */
        Object f111541f;

        /* renamed from: g, reason: collision with root package name */
        Object f111542g;

        /* renamed from: h, reason: collision with root package name */
        Object f111543h;

        /* renamed from: i, reason: collision with root package name */
        Object f111544i;

        /* renamed from: j, reason: collision with root package name */
        Object f111545j;

        /* renamed from: k, reason: collision with root package name */
        Object f111546k;

        /* renamed from: l, reason: collision with root package name */
        Object f111547l;

        /* renamed from: m, reason: collision with root package name */
        boolean f111548m;

        /* renamed from: n, reason: collision with root package name */
        int f111549n;

        /* renamed from: o, reason: collision with root package name */
        int f111550o;

        /* renamed from: p, reason: collision with root package name */
        int f111551p;

        /* renamed from: q, reason: collision with root package name */
        int f111552q;

        /* renamed from: r, reason: collision with root package name */
        int f111553r;

        /* renamed from: s, reason: collision with root package name */
        int f111554s;

        /* renamed from: t, reason: collision with root package name */
        int f111555t;

        /* renamed from: u, reason: collision with root package name */
        private /* synthetic */ Object f111556u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ List<String> f111557v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ boolean f111558w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ Ul.a f111559x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ G f111560y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ nk.c f111561z;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            D d10 = new D(this.f111557v, this.f111558w, this.f111559x, this.f111560y, this.f111561z, continuation);
            d10.f111556u = obj;
            return d10;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        D(List<String> list, boolean z10, Ul.a aVar, G g10, nk.c cVar, Continuation<? super D> continuation) {
            super(2, continuation);
            this.f111557v = list;
            this.f111558w = z10;
            this.f111559x = aVar;
            this.f111560y = g10;
            this.f111561z = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((D) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x00a9 A[Catch: Exception -> 0x006b, TryCatch #0 {Exception -> 0x006b, blocks: (B:6:0x004f, B:14:0x00a3, B:16:0x00a9, B:24:0x0125, B:26:0x0141, B:28:0x0147, B:13:0x0087), top: B:36:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x011e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0103 -> B:20:0x0111). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 399
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.personalized.modals.G.D.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$showFreeItemsSnackBarFromCartUpdate$1$1$1", f = "PLPStateHolder.kt", l = {2525}, m = "invokeSuspend")
    static final class E extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111562a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f111564c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return G.this.new E(this.f111564c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        E(AbstractC6392a abstractC6392a, Continuation<? super E> continuation) {
            super(2, continuation);
            this.f111564c = abstractC6392a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((E) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111562a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = G.this._event;
                n.ShowFreeItemsSnackbar showFreeItemsSnackbar = new n.ShowFreeItemsSnackbar(this.f111564c);
                this.f111562a = 1;
                if (interfaceC16548A.emit(showFreeItemsSnackbar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$showFreeItemsSnackBarFromCartUpdate$1$2$1", f = "PLPStateHolder.kt", l = {2532}, m = "invokeSuspend")
    static final class F extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111565a;

        F(Continuation<? super F> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return G.this.new F(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((F) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111565a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = G.this._event;
                n.d dVar = n.d.f111716a;
                this.f111565a = 1;
                if (interfaceC16548A.emit(dVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$showFreeItemsSnackBarFromClipCoupon$1$2$1", f = "PLPStateHolder.kt", l = {571}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$G, reason: collision with other inner class name */
    static final class C1713G extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111567a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f111569c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return G.this.new C1713G(this.f111569c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1713G(AbstractC6392a abstractC6392a, Continuation<? super C1713G> continuation) {
            super(2, continuation);
            this.f111569c = abstractC6392a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C1713G) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111567a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = G.this._event;
                n.ShowFreeItemsSnackbar showFreeItemsSnackbar = new n.ShowFreeItemsSnackbar(this.f111569c);
                this.f111567a = 1;
                if (interfaceC16548A.emit(showFreeItemsSnackbar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "Lkotlin/reflect/KProperty;", "property", "oldValue", "newValue", "", "afterChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class H extends ObservableProperty<EntryInQtyStepperInteraction> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ G f111570b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public H(Object obj, G g10) {
            super(obj);
            this.f111570b = g10;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty<?> property, EntryInQtyStepperInteraction oldValue, EntryInQtyStepperInteraction newValue) {
            Intrinsics.j(property, "property");
            this.f111570b.Y3();
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "Lkotlin/reflect/KProperty;", "property", "oldValue", "newValue", "", "afterChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class I extends ObservableProperty<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ G f111571b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I(Object obj, G g10) {
            super(obj);
            this.f111571b = g10;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty<?> property, String oldValue, String newValue) {
            Intrinsics.j(property, "property");
            this.f111571b.Y3();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$substituteOOSItem$1$1", f = "PLPStateHolder.kt", l = {910, 920, 922, 934}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class J extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f111572a;

        /* renamed from: b, reason: collision with root package name */
        Object f111573b;

        /* renamed from: c, reason: collision with root package name */
        Object f111574c;

        /* renamed from: d, reason: collision with root package name */
        Object f111575d;

        /* renamed from: e, reason: collision with root package name */
        int f111576e;

        /* renamed from: f, reason: collision with root package name */
        int f111577f;

        /* renamed from: g, reason: collision with root package name */
        int f111578g;

        /* renamed from: h, reason: collision with root package name */
        int f111579h;

        /* renamed from: i, reason: collision with root package name */
        int f111580i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f111581j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ nk.i f111583l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ nk.i f111584m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f111585n;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            J j10 = G.this.new J(this.f111583l, this.f111584m, this.f111585n, continuation);
            j10.f111581j = obj;
            return j10;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        J(nk.i iVar, nk.i iVar2, boolean z10, Continuation<? super J> continuation) {
            super(2, continuation);
            this.f111583l = iVar;
            this.f111584m = iVar2;
            this.f111585n = z10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((J) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:41:0x012d  */
        /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, mv.O] */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v22, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r1v35 */
        /* JADX WARN: Type inference failed for: r1v36 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 363
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.personalized.modals.G.J.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$updateCartItemCount$1", f = "PLPStateHolder.kt", l = {1380}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class K extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f111586a;

        /* renamed from: b, reason: collision with root package name */
        Object f111587b;

        /* renamed from: c, reason: collision with root package name */
        Object f111588c;

        /* renamed from: d, reason: collision with root package name */
        Object f111589d;

        /* renamed from: e, reason: collision with root package name */
        int f111590e;

        /* renamed from: f, reason: collision with root package name */
        int f111591f;

        /* renamed from: g, reason: collision with root package name */
        int f111592g;

        /* renamed from: h, reason: collision with root package name */
        int f111593h;

        /* renamed from: i, reason: collision with root package name */
        int f111594i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f111595j;

        K(Continuation<? super K> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            K k10 = G.this.new K(continuation);
            k10.f111595j = obj;
            return k10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((K) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111594i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f111595j;
                    G g10 = G.this;
                    Result.Companion companion = Result.INSTANCE;
                    wr.f fVar = g10.cartInteractor;
                    this.f111595j = interfaceC15783O;
                    this.f111586a = interfaceC15783O;
                    this.f111587b = this;
                    this.f111588c = this;
                    this.f111589d = interfaceC15783O;
                    this.f111590e = 0;
                    this.f111591f = 0;
                    this.f111592g = 0;
                    this.f111593h = 0;
                    this.f111594i = 1;
                    if (wr.f.n(fVar, false, false, this, 2, null) == objF) {
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
                qw.a.INSTANCE.l(thE, "fetchLatestCart failed in PLPStateHolder", new Object[0]);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class L extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        L(Object obj) {
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
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$10", f = "PLPStateHolder.kt", l = {284}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$a, reason: case insensitive filesystem */
    static final class C12551a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111597a;

        C12551a(Continuation<? super C12551a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return G.this.new C12551a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12551a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111597a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                sp.Y y10 = G.this.productStateRepository;
                this.f111597a = 1;
                obj = y10.F0(this);
                if (obj == objF) {
                    return objF;
                }
            }
            Dk.a.a((Ju.b) obj, G.this.disposables);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$b, reason: case insensitive filesystem */
    /* synthetic */ class C12552b extends AdaptedFunctionReference implements Function2<List<? extends Pj.a>, Continuation<? super Unit>, Object>, SuspendFunction {
        C12552b(Object obj) {
            super(2, obj, G.class, "onLoadingStates", "onLoadingStates(Ljava/util/List;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<? extends Pj.a> list, Continuation<? super Unit> continuation) {
            return G.s0((G) this.f143708a, list, continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lpv/g;", "", "LPj/a;", "", "it", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$2", f = "PLPStateHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$c, reason: case insensitive filesystem */
    static final class C12553c extends SuspendLambda implements Function3<InterfaceC16562g<? super List<? extends Pj.a>>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111599a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f111600b;

        C12553c(Continuation<? super C12553c> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super List<? extends Pj.a>> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            C12553c c12553c = new C12553c(continuation);
            c12553c.f111600b = th2;
            return c12553c.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f111599a == 0) {
                ResultKt.b(obj);
                qw.a.INSTANCE.f((Throwable) this.f111600b, "Caught exception on loadingStatesStream", new Object[0]);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$d, reason: case insensitive filesystem */
    /* synthetic */ class C12554d extends FunctionReferenceImpl implements Function1<List<? extends ProductState<ProductFullDetails>>, Unit> {
        C12554d(Object obj) {
            super(1, obj, G.class, "onProductsState", "onProductsState(Ljava/util/List;)V", 0);
        }

        public final void a(List<ProductState<ProductFullDetails>> p02) {
            Intrinsics.j(p02, "p0");
            ((G) this.receiver).V3(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends ProductState<ProductFullDetails>> list) {
            a(list);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$e, reason: case insensitive filesystem */
    /* synthetic */ class C12555e extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C12555e(Object obj) {
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "LQo/l;", "", "it", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$7", f = "PLPStateHolder.kt", l = {}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function3<InterfaceC16562g<? super Qo.l>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111604a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f111605b;

        g(Continuation<? super g> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super Qo.l> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            g gVar = new g(continuation);
            gVar.f111605b = th2;
            return gVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f111604a == 0) {
                ResultKt.b(obj);
                qw.a.INSTANCE.f((Throwable) this.f111605b, "Error in query state flow", new Object[0]);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$h, reason: case insensitive filesystem */
    /* synthetic */ class C12557h extends FunctionReferenceImpl implements Function1<Tq.k, Unit> {
        C12557h(Object obj) {
            super(1, obj, G.class, "onStoreChange", "onStoreChange(Lcom/meijer/mobile/store/model/common/StoreSummary;)V", 0);
        }

        public final void a(Tq.k p02) {
            Intrinsics.j(p02, "p0");
            ((G) this.receiver).Z3(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Tq.k kVar) {
            a(kVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$i, reason: case insensitive filesystem */
    /* synthetic */ class C12558i extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C12558i(Object obj) {
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

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0013\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()¨\u0006*"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j;", "", "<init>", "()V", "h", "a", "p", "e", "f", "m", "s", "q", "o", "r", "n", "c", "b", "g", "l", "i", "k", "j", "d", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$a;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$b;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$c;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$d;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$e;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$f;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$g;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$h;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$i;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$j;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$k;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$l;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$m;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$n;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$o;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$p;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$q;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$r;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$s;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$j, reason: case insensitive filesystem */
    public static abstract class AbstractC12559j {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$a;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$j$a */
        public static final /* data */ class a extends AbstractC12559j {

            /* renamed from: a, reason: collision with root package name */
            public static final a f111606a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 4587143;
            }

            public String toString() {
                return "AddProactiveSubstituteAction";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$b;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$j$b */
        public static final /* data */ class b extends AbstractC12559j {

            /* renamed from: a, reason: collision with root package name */
            public static final b f111607a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1935500881;
            }

            public String toString() {
                return "CollapseAllSteppers";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$c;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j;", "", "touchX", "touchY", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$j$c, reason: from toString */
        public static final /* data */ class CollapseQuantityStepperAction extends AbstractC12559j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int touchX;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int touchY;

            public CollapseQuantityStepperAction(int i10, int i11) {
                super(null);
                this.touchX = i10;
                this.touchY = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CollapseQuantityStepperAction)) {
                    return false;
                }
                CollapseQuantityStepperAction collapseQuantityStepperAction = (CollapseQuantityStepperAction) other;
                return this.touchX == collapseQuantityStepperAction.touchX && this.touchY == collapseQuantityStepperAction.touchY;
            }

            public int hashCode() {
                return (Integer.hashCode(this.touchX) * 31) + Integer.hashCode(this.touchY);
            }

            public String toString() {
                return "CollapseQuantityStepperAction(touchX=" + this.touchX + ", touchY=" + this.touchY + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getTouchX() {
                return this.touchX;
            }

            /* renamed from: b, reason: from getter */
            public final int getTouchY() {
                return this.touchY;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$d;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j;", "Lgi/a;", "analytics", "<init>", "(Lgi/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgi/a;", "()Lgi/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$j$d, reason: from toString */
        public static final /* data */ class GoogleAdClicked extends AbstractC12559j {

            /* renamed from: b, reason: collision with root package name */
            public static final int f111610b = GoogleAdAnalytics.f134240f;

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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GoogleAdClicked(GoogleAdAnalytics analytics) {
                super(null);
                Intrinsics.j(analytics, "analytics");
                this.analytics = analytics;
            }

            /* renamed from: a, reason: from getter */
            public final GoogleAdAnalytics getAnalytics() {
                return this.analytics;
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$e;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j;", "Lts/a;", "selectedItem", "LPp/b;", "searchType", "", "position", "<init>", "(Lts/a;LPp/b;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lts/a;", "c", "()Lts/a;", "b", "LPp/b;", "()LPp/b;", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$j$e, reason: from toString */
        public static final /* data */ class ItemSelectedAction extends AbstractC12559j {

            /* renamed from: d, reason: collision with root package name */
            public static final int f111612d = ProductCardDecorator.f163361E;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProductCardDecorator selectedItem;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Pp.b searchType;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int position;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ItemSelectedAction)) {
                    return false;
                }
                ItemSelectedAction itemSelectedAction = (ItemSelectedAction) other;
                return Intrinsics.e(this.selectedItem, itemSelectedAction.selectedItem) && this.searchType == itemSelectedAction.searchType && this.position == itemSelectedAction.position;
            }

            public int hashCode() {
                return (((this.selectedItem.hashCode() * 31) + this.searchType.hashCode()) * 31) + Integer.hashCode(this.position);
            }

            public String toString() {
                return "ItemSelectedAction(selectedItem=" + this.selectedItem + ", searchType=" + this.searchType + ", position=" + this.position + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ItemSelectedAction(ProductCardDecorator selectedItem, Pp.b searchType, int i10) {
                super(null);
                Intrinsics.j(selectedItem, "selectedItem");
                Intrinsics.j(searchType, "searchType");
                this.selectedItem = selectedItem;
                this.searchType = searchType;
                this.position = i10;
            }

            /* renamed from: a, reason: from getter */
            public final int getPosition() {
                return this.position;
            }

            /* renamed from: b, reason: from getter */
            public final Pp.b getSearchType() {
                return this.searchType;
            }

            /* renamed from: c, reason: from getter */
            public final ProductCardDecorator getSelectedItem() {
                return this.selectedItem;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$f;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$j$f */
        public static final /* data */ class f extends AbstractC12559j {

            /* renamed from: a, reason: collision with root package name */
            public static final f f111616a = new f();

            private f() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof f);
            }

            public int hashCode() {
                return -2032237222;
            }

            public String toString() {
                return "LoadMoreProductsAction";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0010\u001a\u00060\u0002j\u0002`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$g;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/meijer/mobile/core/model/common/ResourceId;", "a", "Ljava/lang/String;", "resourceId", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$j$g, reason: from toString */
        public static final /* data */ class ResetActiveStepper extends AbstractC12559j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String resourceId;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ResetActiveStepper) && Intrinsics.e(this.resourceId, ((ResetActiveStepper) other).resourceId);
            }

            public int hashCode() {
                return this.resourceId.hashCode();
            }

            public String toString() {
                return "ResetActiveStepper(resourceId=" + this.resourceId + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getResourceId() {
                return this.resourceId;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$h;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$j$h */
        public static final /* data */ class h extends AbstractC12559j {

            /* renamed from: a, reason: collision with root package name */
            public static final h f111618a = new h();

            private h() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof h);
            }

            public int hashCode() {
                return -1880370025;
            }

            public String toString() {
                return "RestartCartInteractorListener";
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$i;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j;", "", "", "beacon", "formatLevelBeacon", "LUl/a;", "beaconType", "Lnk/c;", "product", "<init>", "(Ljava/util/List;Ljava/lang/String;LUl/a;Lnk/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "LUl/a;", "()LUl/a;", "d", "Lnk/c;", "()Lnk/c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$j$i, reason: from toString */
        public static final /* data */ class SendCriteoClickBeacon extends AbstractC12559j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<String> beacon;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String formatLevelBeacon;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Ul.a beaconType;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final nk.c product;

            public /* synthetic */ SendCriteoClickBeacon(List list, String str, Ul.a aVar, nk.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, str, (i10 & 4) != 0 ? null : aVar, (i10 & 8) != 0 ? null : cVar);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SendCriteoClickBeacon)) {
                    return false;
                }
                SendCriteoClickBeacon sendCriteoClickBeacon = (SendCriteoClickBeacon) other;
                return Intrinsics.e(this.beacon, sendCriteoClickBeacon.beacon) && Intrinsics.e(this.formatLevelBeacon, sendCriteoClickBeacon.formatLevelBeacon) && this.beaconType == sendCriteoClickBeacon.beaconType && Intrinsics.e(this.product, sendCriteoClickBeacon.product);
            }

            public int hashCode() {
                int iHashCode = ((this.beacon.hashCode() * 31) + this.formatLevelBeacon.hashCode()) * 31;
                Ul.a aVar = this.beaconType;
                int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                nk.c cVar = this.product;
                return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
            }

            public String toString() {
                return "SendCriteoClickBeacon(beacon=" + this.beacon + ", formatLevelBeacon=" + this.formatLevelBeacon + ", beaconType=" + this.beaconType + ", product=" + this.product + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SendCriteoClickBeacon(List<String> beacon, String formatLevelBeacon, Ul.a aVar, nk.c cVar) {
                super(null);
                Intrinsics.j(beacon, "beacon");
                Intrinsics.j(formatLevelBeacon, "formatLevelBeacon");
                this.beacon = beacon;
                this.formatLevelBeacon = formatLevelBeacon;
                this.beaconType = aVar;
                this.product = cVar;
            }

            public final List<String> a() {
                return this.beacon;
            }

            /* renamed from: b, reason: from getter */
            public final Ul.a getBeaconType() {
                return this.beaconType;
            }

            /* renamed from: c, reason: from getter */
            public final String getFormatLevelBeacon() {
                return this.formatLevelBeacon;
            }

            /* renamed from: d, reason: from getter */
            public final nk.c getProduct() {
                return this.product;
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$j;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j;", "", "beacon", "formatLevelBeacon", "LUl/a;", "beaconType", "Lnk/c;", "product", "<init>", "(Ljava/lang/String;Ljava/lang/String;LUl/a;Lnk/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "LUl/a;", "()LUl/a;", "d", "Lnk/c;", "()Lnk/c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$j$j, reason: collision with other inner class name and from toString */
        public static final /* data */ class SendCriteoLoadBeacon extends AbstractC12559j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String beacon;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String formatLevelBeacon;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Ul.a beaconType;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final nk.c product;

            public /* synthetic */ SendCriteoLoadBeacon(String str, String str2, Ul.a aVar, nk.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i10 & 4) != 0 ? null : aVar, (i10 & 8) != 0 ? null : cVar);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SendCriteoLoadBeacon)) {
                    return false;
                }
                SendCriteoLoadBeacon sendCriteoLoadBeacon = (SendCriteoLoadBeacon) other;
                return Intrinsics.e(this.beacon, sendCriteoLoadBeacon.beacon) && Intrinsics.e(this.formatLevelBeacon, sendCriteoLoadBeacon.formatLevelBeacon) && this.beaconType == sendCriteoLoadBeacon.beaconType && Intrinsics.e(this.product, sendCriteoLoadBeacon.product);
            }

            public int hashCode() {
                int iHashCode = ((this.beacon.hashCode() * 31) + this.formatLevelBeacon.hashCode()) * 31;
                Ul.a aVar = this.beaconType;
                int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                nk.c cVar = this.product;
                return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
            }

            public String toString() {
                return "SendCriteoLoadBeacon(beacon=" + this.beacon + ", formatLevelBeacon=" + this.formatLevelBeacon + ", beaconType=" + this.beaconType + ", product=" + this.product + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SendCriteoLoadBeacon(String beacon, String formatLevelBeacon, Ul.a aVar, nk.c cVar) {
                super(null);
                Intrinsics.j(beacon, "beacon");
                Intrinsics.j(formatLevelBeacon, "formatLevelBeacon");
                this.beacon = beacon;
                this.formatLevelBeacon = formatLevelBeacon;
                this.beaconType = aVar;
                this.product = cVar;
            }

            /* renamed from: a, reason: from getter */
            public final String getBeacon() {
                return this.beacon;
            }

            /* renamed from: b, reason: from getter */
            public final Ul.a getBeaconType() {
                return this.beaconType;
            }

            /* renamed from: c, reason: from getter */
            public final String getFormatLevelBeacon() {
                return this.formatLevelBeacon;
            }

            /* renamed from: d, reason: from getter */
            public final nk.c getProduct() {
                return this.product;
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$k;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "beacon", "LUl/a;", "b", "LUl/a;", "()LUl/a;", "beaconType", "Lnk/c;", "c", "Lnk/c;", "()Lnk/c;", "product", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$j$k, reason: from toString */
        public static final /* data */ class SendCriteoQtyStepperBeacon extends AbstractC12559j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<String> beacon;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Ul.a beaconType;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final nk.c product;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SendCriteoQtyStepperBeacon)) {
                    return false;
                }
                SendCriteoQtyStepperBeacon sendCriteoQtyStepperBeacon = (SendCriteoQtyStepperBeacon) other;
                return Intrinsics.e(this.beacon, sendCriteoQtyStepperBeacon.beacon) && this.beaconType == sendCriteoQtyStepperBeacon.beaconType && Intrinsics.e(this.product, sendCriteoQtyStepperBeacon.product);
            }

            public int hashCode() {
                int iHashCode = this.beacon.hashCode() * 31;
                Ul.a aVar = this.beaconType;
                int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                nk.c cVar = this.product;
                return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
            }

            public String toString() {
                return "SendCriteoQtyStepperBeacon(beacon=" + this.beacon + ", beaconType=" + this.beaconType + ", product=" + this.product + ')';
            }

            public final List<String> a() {
                return this.beacon;
            }

            /* renamed from: b, reason: from getter */
            public final Ul.a getBeaconType() {
                return this.beaconType;
            }

            /* renamed from: c, reason: from getter */
            public final nk.c getProduct() {
                return this.product;
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$l;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j;", "", "", "beacon", "formatLevelBeacon", "LUl/a;", "beaconType", "Lnk/c;", "product", "<init>", "(Ljava/util/List;Ljava/lang/String;LUl/a;Lnk/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "LUl/a;", "()LUl/a;", "d", "Lnk/c;", "()Lnk/c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$j$l, reason: from toString */
        public static final /* data */ class SendCriteoViewBeacon extends AbstractC12559j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<String> beacon;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String formatLevelBeacon;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Ul.a beaconType;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final nk.c product;

            public /* synthetic */ SendCriteoViewBeacon(List list, String str, Ul.a aVar, nk.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, str, (i10 & 4) != 0 ? null : aVar, (i10 & 8) != 0 ? null : cVar);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SendCriteoViewBeacon)) {
                    return false;
                }
                SendCriteoViewBeacon sendCriteoViewBeacon = (SendCriteoViewBeacon) other;
                return Intrinsics.e(this.beacon, sendCriteoViewBeacon.beacon) && Intrinsics.e(this.formatLevelBeacon, sendCriteoViewBeacon.formatLevelBeacon) && this.beaconType == sendCriteoViewBeacon.beaconType && Intrinsics.e(this.product, sendCriteoViewBeacon.product);
            }

            public int hashCode() {
                int iHashCode = ((this.beacon.hashCode() * 31) + this.formatLevelBeacon.hashCode()) * 31;
                Ul.a aVar = this.beaconType;
                int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                nk.c cVar = this.product;
                return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
            }

            public String toString() {
                return "SendCriteoViewBeacon(beacon=" + this.beacon + ", formatLevelBeacon=" + this.formatLevelBeacon + ", beaconType=" + this.beaconType + ", product=" + this.product + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SendCriteoViewBeacon(List<String> beacon, String formatLevelBeacon, Ul.a aVar, nk.c cVar) {
                super(null);
                Intrinsics.j(beacon, "beacon");
                Intrinsics.j(formatLevelBeacon, "formatLevelBeacon");
                this.beacon = beacon;
                this.formatLevelBeacon = formatLevelBeacon;
                this.beaconType = aVar;
                this.product = cVar;
            }

            public final List<String> a() {
                return this.beacon;
            }

            /* renamed from: b, reason: from getter */
            public final Ul.a getBeaconType() {
                return this.beaconType;
            }

            /* renamed from: c, reason: from getter */
            public final String getFormatLevelBeacon() {
                return this.formatLevelBeacon;
            }

            /* renamed from: d, reason: from getter */
            public final nk.c getProduct() {
                return this.product;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u0004\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$m;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "title", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$j$m, reason: from toString */
        public static final /* data */ class SendTitle extends AbstractC12559j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private String title;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SendTitle) && Intrinsics.e(this.title, ((SendTitle) other).title);
            }

            public int hashCode() {
                return this.title.hashCode();
            }

            public String toString() {
                return "SendTitle(title=" + this.title + ')';
            }

            /* renamed from: a, reason: from getter */
            public final String getTitle() {
                return this.title;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$n;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j;", "LQo/l$k;", "query", "<init>", "(LQo/l$k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LQo/l$k;", "()LQo/l$k;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$j$n, reason: from toString */
        public static final /* data */ class SetFilterAndSortOptions extends AbstractC12559j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final l.k query;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SetFilterAndSortOptions) && Intrinsics.e(this.query, ((SetFilterAndSortOptions) other).query);
            }

            public int hashCode() {
                return this.query.hashCode();
            }

            public String toString() {
                return "SetFilterAndSortOptions(query=" + this.query + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetFilterAndSortOptions(l.k query) {
                super(null);
                Intrinsics.j(query, "query");
                this.query = query;
            }

            /* renamed from: a, reason: from getter */
            public final l.k getQuery() {
                return this.query;
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$o;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j;", "", "productCode", "", "quantityToUpdate", "Landroid/graphics/Rect;", "stepperHitRect", "<init>", "(Ljava/lang/String;DLandroid/graphics/Rect;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "D", "getQuantityToUpdate", "()D", "c", "Landroid/graphics/Rect;", "()Landroid/graphics/Rect;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$j$o, reason: from toString */
        public static final /* data */ class StepperStateChangedAction extends AbstractC12559j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String productCode;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final double quantityToUpdate;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Rect stepperHitRect;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StepperStateChangedAction)) {
                    return false;
                }
                StepperStateChangedAction stepperStateChangedAction = (StepperStateChangedAction) other;
                return Intrinsics.e(this.productCode, stepperStateChangedAction.productCode) && Double.compare(this.quantityToUpdate, stepperStateChangedAction.quantityToUpdate) == 0 && Intrinsics.e(this.stepperHitRect, stepperStateChangedAction.stepperHitRect);
            }

            public int hashCode() {
                return (((this.productCode.hashCode() * 31) + Double.hashCode(this.quantityToUpdate)) * 31) + this.stepperHitRect.hashCode();
            }

            public String toString() {
                return "StepperStateChangedAction(productCode=" + this.productCode + ", quantityToUpdate=" + this.quantityToUpdate + ", stepperHitRect=" + this.stepperHitRect + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StepperStateChangedAction(String productCode, double d10, Rect stepperHitRect) {
                super(null);
                Intrinsics.j(productCode, "productCode");
                Intrinsics.j(stepperHitRect, "stepperHitRect");
                this.productCode = productCode;
                this.quantityToUpdate = d10;
                this.stepperHitRect = stepperHitRect;
            }

            /* renamed from: a, reason: from getter */
            public final String getProductCode() {
                return this.productCode;
            }

            /* renamed from: b, reason: from getter */
            public final Rect getStepperHitRect() {
                return this.stepperHitRect;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$p;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$j$p */
        public static final /* data */ class p extends AbstractC12559j {

            /* renamed from: a, reason: collision with root package name */
            public static final p f111639a = new p();

            private p() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof p);
            }

            public int hashCode() {
                return -285030678;
            }

            public String toString() {
                return "SubstituteOosAction";
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$q;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j;", "LCo/h;", "product", "", "quantityToUpdate", "Landroid/graphics/Rect;", "stepperHitRect", "<init>", "(LCo/h;DLandroid/graphics/Rect;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "b", "D", "()D", "c", "Landroid/graphics/Rect;", "getStepperHitRect", "()Landroid/graphics/Rect;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$j$q, reason: from toString */
        public static final /* data */ class UpdateEntryAction extends AbstractC12559j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProductFullDetails product;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final double quantityToUpdate;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Rect stepperHitRect;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateEntryAction)) {
                    return false;
                }
                UpdateEntryAction updateEntryAction = (UpdateEntryAction) other;
                return Intrinsics.e(this.product, updateEntryAction.product) && Double.compare(this.quantityToUpdate, updateEntryAction.quantityToUpdate) == 0 && Intrinsics.e(this.stepperHitRect, updateEntryAction.stepperHitRect);
            }

            public int hashCode() {
                return (((this.product.hashCode() * 31) + Double.hashCode(this.quantityToUpdate)) * 31) + this.stepperHitRect.hashCode();
            }

            public String toString() {
                return "UpdateEntryAction(product=" + this.product + ", quantityToUpdate=" + this.quantityToUpdate + ", stepperHitRect=" + this.stepperHitRect + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateEntryAction(ProductFullDetails product, double d10, Rect stepperHitRect) {
                super(null);
                Intrinsics.j(product, "product");
                Intrinsics.j(stepperHitRect, "stepperHitRect");
                this.product = product;
                this.quantityToUpdate = d10;
                this.stepperHitRect = stepperHitRect;
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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$r;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j;", "Lur/a;", "cartUpdateRequest", "<init>", "(Lur/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lur/a;", "()Lur/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$j$r, reason: from toString */
        public static final /* data */ class UserAcceptAddToCartAction extends AbstractC12559j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC17454a cartUpdateRequest;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UserAcceptAddToCartAction) && Intrinsics.e(this.cartUpdateRequest, ((UserAcceptAddToCartAction) other).cartUpdateRequest);
            }

            public int hashCode() {
                return this.cartUpdateRequest.hashCode();
            }

            public String toString() {
                return "UserAcceptAddToCartAction(cartUpdateRequest=" + this.cartUpdateRequest + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UserAcceptAddToCartAction(AbstractC17454a cartUpdateRequest) {
                super(null);
                Intrinsics.j(cartUpdateRequest, "cartUpdateRequest");
                this.cartUpdateRequest = cartUpdateRequest;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC17454a getCartUpdateRequest() {
                return this.cartUpdateRequest;
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j$s;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$j;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LCo/h;", "a", "LCo/h;", "b", "()LCo/h;", "product", "LQo/l;", "LQo/l;", "c", "()LQo/l;", "query", "I", "position", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$j$s, reason: from toString */
        public static final /* data */ class ViewProductDetailsAction extends AbstractC12559j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProductFullDetails product;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Qo.l query;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int position;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ViewProductDetailsAction)) {
                    return false;
                }
                ViewProductDetailsAction viewProductDetailsAction = (ViewProductDetailsAction) other;
                return Intrinsics.e(this.product, viewProductDetailsAction.product) && Intrinsics.e(this.query, viewProductDetailsAction.query) && this.position == viewProductDetailsAction.position;
            }

            public int hashCode() {
                int iHashCode = this.product.hashCode() * 31;
                Qo.l lVar = this.query;
                return ((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31) + Integer.hashCode(this.position);
            }

            public String toString() {
                return "ViewProductDetailsAction(product=" + this.product + ", query=" + this.query + ", position=" + this.position + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getPosition() {
                return this.position;
            }

            /* renamed from: b, reason: from getter */
            public final ProductFullDetails getProduct() {
                return this.product;
            }

            /* renamed from: c, reason: from getter */
            public final Qo.l getQuery() {
                return this.query;
            }
        }

        public /* synthetic */ AbstractC12559j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC12559j() {
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J/\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J7\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0015\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0018\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0015\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u000e2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J%\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u0005\u0010!J)\u0010&\u001a\u00020\u000e\"\u0004\b\u0000\u0010\"2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00028\u00000#H\u0016¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$k;", "Lwr/a;", "<init>", "(Lcom/meijer/mobile/meijer/activity/personalized/modals/G;)V", "Lur/a;", "processedRequest", "", "b", "(Lur/a;)D", "Luk/c;", "Lfj/j;", "entryChange", "", "productCode", "", "c", "(Lur/a;Luk/c;Ljava/lang/String;)V", "f", "a", "", "requireCartOpenExtra", "entryUnitPrice", "d", "(ZLuk/c;DLjava/lang/String;)V", "e", "(Luk/c;DLjava/lang/String;)V", "Lfj/C;", "cartResource", "observeCart", "(Luk/c;)V", "LJu/a;", "getDisposable", "()LJu/a;", "(Lur/a;Luk/c;)V", "T", "Luk/a;", "Lvr/a;", "challenge", "throwChallenge", "(Luk/a;)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$k, reason: case insensitive filesystem */
    private final class C12560k implements InterfaceC17909a {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$k$a */
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
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$CartInteractionListener1$addCartEntry$1", f = "PLPStateHolder.kt", l = {2235}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$k$b */
        static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111648a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ G f111649b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(G g10, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f111649b = g10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f111649b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111648a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f111649b._event;
                    n.UpdateToCartFailedEvent updateToCartFailedEvent = new n.UpdateToCartFailedEvent(C17284b.f163279I0);
                    this.f111648a = 1;
                    if (interfaceC16548A.emit(updateToCartFailedEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$CartInteractionListener1$addCartEntry$2", f = "PLPStateHolder.kt", l = {2243}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$k$c */
        static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111650a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ G f111651b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(G g10, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f111651b = g10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new c(this.f111651b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111650a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f111651b._event;
                    AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
                    n.ShowError showError = new n.ShowError(companion.d(yr.Q.f171738F, new Object[0]), companion.d(yr.Q.f171737E, new Object[0]), companion.d(yr.Q.f171761b, new Object[0]));
                    this.f111650a = 1;
                    if (interfaceC16548A.emit(showError, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$CartInteractionListener1$addCartEntry$3", f = "PLPStateHolder.kt", l = {2256}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$k$d */
        static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111652a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ G f111653b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(G g10, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f111653b = g10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new d(this.f111653b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111652a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f111653b._event;
                    n.UpdateToCartFailedEvent updateToCartFailedEvent = new n.UpdateToCartFailedEvent(C17284b.f163293P0);
                    this.f111652a = 1;
                    if (interfaceC16548A.emit(updateToCartFailedEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$CartInteractionListener1$addCartEntry$4", f = "PLPStateHolder.kt", l = {2263}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$k$e */
        static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f111654a;

            /* renamed from: b, reason: collision with root package name */
            Object f111655b;

            /* renamed from: c, reason: collision with root package name */
            Object f111656c;

            /* renamed from: d, reason: collision with root package name */
            Object f111657d;

            /* renamed from: e, reason: collision with root package name */
            int f111658e;

            /* renamed from: f, reason: collision with root package name */
            int f111659f;

            /* renamed from: g, reason: collision with root package name */
            int f111660g;

            /* renamed from: h, reason: collision with root package name */
            int f111661h;

            /* renamed from: i, reason: collision with root package name */
            int f111662i;

            /* renamed from: j, reason: collision with root package name */
            private /* synthetic */ Object f111663j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ G f111664k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(G g10, Continuation<? super e> continuation) {
                super(2, continuation);
                this.f111664k = g10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                e eVar = new e(this.f111664k, continuation);
                eVar.f111663j = obj;
                return eVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objB;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111662i;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f111663j;
                        G g10 = this.f111664k;
                        Result.Companion companion = Result.INSTANCE;
                        wr.f fVar = g10.cartInteractor;
                        this.f111663j = interfaceC15783O;
                        this.f111654a = interfaceC15783O;
                        this.f111655b = this;
                        this.f111656c = this;
                        this.f111657d = interfaceC15783O;
                        this.f111658e = 0;
                        this.f111659f = 0;
                        this.f111660g = 0;
                        this.f111661h = 0;
                        this.f111662i = 1;
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
                    qw.a.INSTANCE.l(thE, "fetchLatestCart failed in PLPStateHolder", new Object[0]);
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$CartInteractionListener1$addCartEntry$5", f = "PLPStateHolder.kt", l = {2281}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$k$f */
        static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111665a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ G f111666b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ uk.c<EntryChange> f111667c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new f(this.f111666b, this.f111667c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(G g10, uk.c<EntryChange> cVar, Continuation<? super f> continuation) {
                super(2, continuation);
                this.f111666b = g10;
                this.f111667c = cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Entry entry;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111665a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f111666b._event;
                    int i11 = C17284b.f163319f;
                    int i12 = C17284b.f163301T0;
                    EntryChange entryChange = (EntryChange) ((c.Success) this.f111667c).a();
                    if (entryChange != null) {
                        entry = entryChange.getEntry();
                    } else {
                        entry = null;
                    }
                    n.CartUpdateSuccessEvent cartUpdateSuccessEvent = new n.CartUpdateSuccessEvent(i11, i12, entry);
                    this.f111665a = 1;
                    if (interfaceC16548A.emit(cartUpdateSuccessEvent, this) == objF) {
                        return objF;
                    }
                }
                Unit unit = Unit.f143329a;
                qw.a.INSTANCE.a("Emitting Event.CartUpdateSuccessEvent", new Object[0]);
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$CartInteractionListener1$addCartEntry$6$1", f = "PLPStateHolder.kt", l = {2299}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$k$g */
        static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111668a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ G f111669b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ CartProductListDecorator f111670c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new g(this.f111669b, this.f111670c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(G g10, CartProductListDecorator cartProductListDecorator, Continuation<? super g> continuation) {
                super(2, continuation);
                this.f111669b = g10;
                this.f111670c = cartProductListDecorator;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111668a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f111669b._event;
                    n.OpenLowStockScreenEvent openLowStockScreenEvent = new n.OpenLowStockScreenEvent(this.f111670c);
                    this.f111668a = 1;
                    if (interfaceC16548A.emit(openLowStockScreenEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$CartInteractionListener1$observeCart$1$1", f = "PLPStateHolder.kt", l = {2032}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$k$h */
        static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f111671a;

            /* renamed from: b, reason: collision with root package name */
            Object f111672b;

            /* renamed from: c, reason: collision with root package name */
            Object f111673c;

            /* renamed from: d, reason: collision with root package name */
            Object f111674d;

            /* renamed from: e, reason: collision with root package name */
            Object f111675e;

            /* renamed from: f, reason: collision with root package name */
            Object f111676f;

            /* renamed from: g, reason: collision with root package name */
            Object f111677g;

            /* renamed from: h, reason: collision with root package name */
            int f111678h;

            /* renamed from: i, reason: collision with root package name */
            int f111679i;

            /* renamed from: j, reason: collision with root package name */
            int f111680j;

            /* renamed from: k, reason: collision with root package name */
            int f111681k;

            /* renamed from: l, reason: collision with root package name */
            int f111682l;

            /* renamed from: m, reason: collision with root package name */
            int f111683m;

            /* renamed from: n, reason: collision with root package name */
            private /* synthetic */ Object f111684n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ uk.c<ShoppingCart> f111685o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ G f111686p;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                h hVar = new h(this.f111685o, this.f111686p, continuation);
                hVar.f111684n = obj;
                return hVar;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(uk.c<ShoppingCart> cVar, G g10, Continuation<? super h> continuation) {
                super(2, continuation);
                this.f111685o = cVar;
                this.f111686p = g10;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r31) {
                /*
                    Method dump skipped, instructions count: 248
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.personalized.modals.G.C12560k.h.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$CartInteractionListener1$removeCartEntry$1", f = "PLPStateHolder.kt", l = {2121}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$k$i */
        static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111687a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ G f111688b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ uk.c<EntryChange> f111689c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new i(this.f111688b, this.f111689c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(G g10, uk.c<EntryChange> cVar, Continuation<? super i> continuation) {
                super(2, continuation);
                this.f111688b = g10;
                this.f111689c = cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Entry entry;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111687a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f111688b._event;
                    int i11 = C17284b.f163336n0;
                    int i12 = C17284b.f163301T0;
                    EntryChange entryChange = (EntryChange) ((c.Success) this.f111689c).a();
                    if (entryChange != null) {
                        entry = entryChange.getEntry();
                    } else {
                        entry = null;
                    }
                    n.CartUpdateSuccessEvent cartUpdateSuccessEvent = new n.CartUpdateSuccessEvent(i11, i12, entry);
                    this.f111687a = 1;
                    if (interfaceC16548A.emit(cartUpdateSuccessEvent, this) == objF) {
                        return objF;
                    }
                }
                Unit unit = Unit.f143329a;
                qw.a.INSTANCE.a("Emitting Event.CartUpdateSuccessEvent", new Object[0]);
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$CartInteractionListener1$removeCartEntry$2", f = "PLPStateHolder.kt", l = {2138}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$k$j */
        static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111690a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ G f111691b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(G g10, Continuation<? super j> continuation) {
                super(2, continuation);
                this.f111691b = g10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new j(this.f111691b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111690a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f111691b._event;
                    AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
                    n.ShowError showError = new n.ShowError(companion.d(yr.Q.f171738F, new Object[0]), companion.d(yr.Q.f171737E, new Object[0]), companion.d(yr.Q.f171761b, new Object[0]));
                    this.f111690a = 1;
                    if (interfaceC16548A.emit(showError, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$CartInteractionListener1$removeCartEntry$3", f = "PLPStateHolder.kt", l = {2148}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$k$k, reason: collision with other inner class name */
        static final class C1715k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111692a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ G f111693b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1715k(G g10, Continuation<? super C1715k> continuation) {
                super(2, continuation);
                this.f111693b = g10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1715k(this.f111693b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C1715k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111692a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f111693b._event;
                    n.UpdateToCartFailedEvent updateToCartFailedEvent = new n.UpdateToCartFailedEvent(C17284b.f163293P0);
                    this.f111692a = 1;
                    if (interfaceC16548A.emit(updateToCartFailedEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$CartInteractionListener1$throwChallenge$1", f = "PLPStateHolder.kt", l = {2392}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$k$l */
        static final class l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111694a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ G f111695b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC17720a.ChokingHazardChallenge f111696c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new l(this.f111695b, this.f111696c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            l(G g10, AbstractC17720a.ChokingHazardChallenge chokingHazardChallenge, Continuation<? super l> continuation) {
                super(2, continuation);
                this.f111695b = g10;
                this.f111696c = chokingHazardChallenge;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111694a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f111695b._event;
                    n.ShowChokingWarningDialogEvent showChokingWarningDialogEvent = new n.ShowChokingWarningDialogEvent(this.f111696c.a());
                    this.f111694a = 1;
                    if (interfaceC16548A.emit(showChokingWarningDialogEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$CartInteractionListener1$updateCartEntry$1", f = "PLPStateHolder.kt", l = {2166}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$k$m */
        static final class m extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111697a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ G f111698b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            m(G g10, Continuation<? super m> continuation) {
                super(2, continuation);
                this.f111698b = g10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new m(this.f111698b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((m) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111697a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f111698b._event;
                    n.UpdateToCartFailedEvent updateToCartFailedEvent = new n.UpdateToCartFailedEvent(C17284b.f163293P0);
                    this.f111697a = 1;
                    if (interfaceC16548A.emit(updateToCartFailedEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$CartInteractionListener1$updateCartEntry$2", f = "PLPStateHolder.kt", l = {2172}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$k$n */
        static final class n extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111699a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ G f111700b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ uk.c<EntryChange> f111701c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new n(this.f111700b, this.f111701c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(G g10, uk.c<EntryChange> cVar, Continuation<? super n> continuation) {
                super(2, continuation);
                this.f111700b = g10;
                this.f111701c = cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((n) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Entry entry;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111699a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f111700b._event;
                    int i11 = C17284b.f163357y;
                    int i12 = C17284b.f163301T0;
                    EntryChange entryChangeA = this.f111701c.a();
                    if (entryChangeA != null) {
                        entry = entryChangeA.getEntry();
                    } else {
                        entry = null;
                    }
                    n.CartUpdateSuccessEvent cartUpdateSuccessEvent = new n.CartUpdateSuccessEvent(i11, i12, entry);
                    this.f111699a = 1;
                    if (interfaceC16548A.emit(cartUpdateSuccessEvent, this) == objF) {
                        return objF;
                    }
                }
                Unit unit = Unit.f143329a;
                qw.a.INSTANCE.a("Emitting Event.CartUpdateSuccessEvent", new Object[0]);
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$CartInteractionListener1$updateCartEntry$3$1", f = "PLPStateHolder.kt", l = {2208}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$k$o */
        static final class o extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111702a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ G f111703b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            o(G g10, Continuation<? super o> continuation) {
                super(2, continuation);
                this.f111703b = g10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new o(this.f111703b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((o) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111702a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f111703b._event;
                    n.UpdateToCartFailedEvent updateToCartFailedEvent = new n.UpdateToCartFailedEvent(C17284b.f163279I0);
                    this.f111702a = 1;
                    if (interfaceC16548A.emit(updateToCartFailedEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        public C12560k() {
        }

        private final void a(AbstractC17454a processedRequest, uk.c<EntryChange> entryChange, String productCode) {
            Entry entry;
            Entry entry2;
            ProductFullDetails productFullDetailsM;
            if (entryChange instanceof c.Failure) {
                c.Failure failure = (c.Failure) entryChange;
                EntryChange entryChange2 = (EntryChange) failure.a();
                if ((entryChange2 != null ? entryChange2.getStatusCode() : null) == EntryChange.c.f131921c) {
                    C15809k.d(G.this.coroutineScope, null, null, new b(G.this, null), 3, null);
                } else {
                    Throwable error = failure.getError();
                    HttpException httpException = error instanceof HttpException ? (HttpException) error : null;
                    if (httpException == null || httpException.code() != 503) {
                        qw.a.INSTANCE.f(failure.getError(), "Resource.Failure<EntryChange>", new Object[0]);
                        C15809k.d(G.this.coroutineScope, null, null, new d(G.this, null), 3, null);
                        G g10 = G.this;
                        EntryChange entryChange3 = (EntryChange) failure.a();
                        g10.q4((entryChange3 == null || (entry2 = entryChange3.getEntry()) == null || (productFullDetailsM = entry2.m()) == null) ? null : productFullDetailsM.getCode());
                        Unit unit = Unit.f143329a;
                    } else {
                        C15809k.d(G.this.coroutineScope, null, null, new c(G.this, null), 3, null);
                    }
                }
                C15809k.d(G.this.coroutineScope, null, null, new e(G.this, null), 3, null);
                return;
            }
            if (!(entryChange instanceof c.Success)) {
                if (!(entryChange instanceof c.Loading)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            d(true, entryChange, b(processedRequest), productCode);
            if (G.this.t4(entryChange)) {
                qw.a.INSTANCE.a("Not emitting Event.CartUpdateSuccessEvent because we show free snackbar from cart update", new Object[0]);
            } else {
                C15809k.d(G.this.coroutineScope, null, null, new f(G.this, entryChange, null), 3, null);
            }
            EntryChange entryChange4 = (EntryChange) ((c.Success) entryChange).a();
            if (entryChange4 == null || (entry = entryChange4.getEntry()) == null) {
                return;
            }
            G g11 = G.this;
            CartProductListDecorator cartProductListDecoratorB = CartProductListDecorator.Companion.b(CartProductListDecorator.INSTANCE, entry, false, 2, null);
            if (cartProductListDecoratorB.getStockInfo().c()) {
                C15809k.d(g11.coroutineScope, null, null, new g(g11, cartProductListDecoratorB, null), 3, null);
            }
        }

        private final double b(AbstractC17454a processedRequest) {
            ShoppingCart shoppingCart;
            List<Entry> listP;
            ProductFullDetails productFullDetailsM;
            nk.b bVarD;
            List<Entry> listP2;
            ProductFullDetails productFullDetailsM2;
            nk.b bVarD2;
            if (processedRequest instanceof AbstractC17454a.Add) {
                return Co.l.a(((AbstractC17454a.Add) processedRequest).getProduct()).D().getValue();
            }
            Object obj = null;
            if (processedRequest instanceof AbstractC17454a.Update) {
                ShoppingCart shoppingCart2 = G.this.v3().getValue().getShoppingCart();
                if (shoppingCart2 != null && (listP2 = shoppingCart2.p()) != null) {
                    Iterator<T> it = listP2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (Intrinsics.e(((Entry) next).m().getCode(), processedRequest.getProductCode())) {
                            obj = next;
                            break;
                        }
                    }
                    Entry entry = (Entry) obj;
                    if (entry != null && (productFullDetailsM2 = entry.m()) != null && (bVarD2 = productFullDetailsM2.D()) != null) {
                        return bVarD2.getValue();
                    }
                }
                return 0.0d;
            }
            if ((processedRequest instanceof AbstractC17454a.Remove) && (shoppingCart = G.this.v3().getValue().getShoppingCart()) != null && (listP = shoppingCart.p()) != null) {
                Iterator<T> it2 = listP.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (Intrinsics.e(((Entry) next2).m().getCode(), ((AbstractC17454a.Remove) processedRequest).getProduct().getCode())) {
                        obj = next2;
                        break;
                    }
                }
                Entry entry2 = (Entry) obj;
                if (entry2 != null && (productFullDetailsM = entry2.m()) != null && (bVarD = productFullDetailsM.D()) != null) {
                    return bVarD.getValue();
                }
            }
            return 0.0d;
        }

        private final void c(AbstractC17454a processedRequest, uk.c<EntryChange> entryChange, String productCode) {
            if (entryChange instanceof c.Success) {
                e(entryChange, b(processedRequest), productCode);
                if (!G.this.t4(entryChange)) {
                    C15809k.d(G.this.coroutineScope, null, null, new i(G.this, entryChange, null), 3, null);
                    return;
                } else {
                    qw.a.INSTANCE.a("Not emitting Event.CartUpdateSuccessEvent because we show free snackbar from cart update", new Object[0]);
                    Unit unit = Unit.f143329a;
                    return;
                }
            }
            if (!(entryChange instanceof c.Failure)) {
                Unit unit2 = Unit.f143329a;
                return;
            }
            c.Failure failure = (c.Failure) entryChange;
            qw.a.INSTANCE.f(failure.getError(), "Resource.Failure<EntryChange>", new Object[0]);
            if (failure.getError() instanceof HttpException) {
                Throwable error = failure.getError();
                Intrinsics.h(error, "null cannot be cast to non-null type retrofit2.HttpException");
                if (((HttpException) error).code() == 503) {
                    C15809k.d(G.this.coroutineScope, null, null, new j(G.this, null), 3, null);
                    return;
                }
            }
            C15809k.d(G.this.coroutineScope, null, null, new C1715k(G.this, null), 3, null);
        }

        private final void d(boolean requireCartOpenExtra, uk.c<EntryChange> entryChange, double entryUnitPrice, String productCode) {
            Entry entry;
            Entry entry2;
            ProductFullDetails productFullDetailsM;
            Entry entry3;
            ProductFullDetails productFullDetailsM2;
            G g10 = G.this;
            EntryChange entryChangeA = entryChange.a();
            W.ComplexPromo complexPromoJ2 = g10.J2((entryChangeA == null || (entry3 = entryChangeA.getEntry()) == null || (productFullDetailsM2 = entry3.m()) == null) ? null : productFullDetailsM2.getCode());
            pp.d dVar = G.this.productMetadataStore;
            EntryChange entryChangeA2 = entryChange.a();
            boolean zC = dVar.c((entryChangeA2 == null || (entry2 = entryChangeA2.getEntry()) == null || (productFullDetailsM = entry2.m()) == null) ? null : productFullDetailsM.getCode());
            boolean zT3 = G.this.t3(productCode);
            Iterator<ProductListDecorator> it = ((ViewState) G.this._viewState.getValue()).p().iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                }
                String code = it.next().getProduct().getCode();
                EntryChange entryChangeA3 = entryChange.a();
                if (Intrinsics.e(code, (entryChangeA3 == null || (entry = entryChangeA3.getEntry()) == null) ? null : entry.g2())) {
                    break;
                } else {
                    i10++;
                }
            }
            Integer numValueOf = Integer.valueOf(i10);
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            G.this.analyticsEngine.k(C2898u.f1904a.j0(entryChange, G.this.v3().getValue().g(), requireCartOpenExtra, (Qo.l) G.this.l3().getValue(), G.this.cartId, G.this.getCampaignIdValue(), G.this.getDepartmentCarouselAnalytics(), G.this.getCollectionName(), G.this.getCmpid(), G.this.sponsorshipsDataStore, zC, zT3, true, entryUnitPrice, complexPromoJ2, String.valueOf(numValueOf != null ? Integer.valueOf(numValueOf.intValue() + 1) : null), G.this.getCarouselTitleAnalytics(), false, "lowStock", "mPerks: Earn", String.valueOf(((ViewState) G.this._viewState.getValue()).getCartDecorator().getItemCount()), (2097152 & 2097152) != 0 ? null : null));
        }

        private final void e(uk.c<EntryChange> entryChange, double entryUnitPrice, String productCode) {
            Entry entry;
            ProductFullDetails productFullDetailsM;
            Entry entry2;
            Entry entry3;
            ProductFullDetails productFullDetailsM2;
            G g10 = G.this;
            EntryChange entryChangeA = entryChange.a();
            String code = null;
            int i10 = 0;
            CouponState couponStateU2 = G.U2(g10, (entryChangeA == null || (entry3 = entryChangeA.getEntry()) == null || (productFullDetailsM2 = entry3.m()) == null) ? null : productFullDetailsM2.getCode(), false, 2, null);
            Iterator<ProductListDecorator> it = ((ViewState) G.this._viewState.getValue()).p().iterator();
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                }
                String code2 = it.next().getProduct().getCode();
                EntryChange entryChangeA2 = entryChange.a();
                if (Intrinsics.e(code2, (entryChangeA2 == null || (entry2 = entryChangeA2.getEntry()) == null) ? null : entry2.g2())) {
                    break;
                } else {
                    i10++;
                }
            }
            Integer numValueOf = Integer.valueOf(i10);
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            Integer numValueOf2 = numValueOf != null ? Integer.valueOf(numValueOf.intValue() + 1) : null;
            InterfaceC14523a interfaceC14523a = G.this.analyticsEngine;
            C2898u c2898u = C2898u.f1904a;
            String strU3 = G.this.u3();
            String str = G.this.cartId;
            pp.d dVar = G.this.productMetadataStore;
            EntryChange entryChangeA3 = entryChange.a();
            if (entryChangeA3 != null && (entry = entryChangeA3.getEntry()) != null && (productFullDetailsM = entry.m()) != null) {
                code = productFullDetailsM.getCode();
            }
            interfaceC14523a.k(c2898u.m0(strU3, str, dVar.c(code), (Qo.l) G.this.l3().getValue(), entryChange, G.this.sponsorshipsDataStore, couponStateU2, G.this.L2(entryChange.a()), entryUnitPrice, G.this.t3(productCode), true, true, numValueOf2, String.valueOf(((ViewState) G.this._viewState.getValue()).getCartDecorator().getItemCount()), "lowStock", "mPerks: Earn", (65536 & 65536) != 0 ? null : null));
        }

        private final void f(AbstractC17454a processedRequest, uk.c<EntryChange> entryChange, String productCode) {
            if (entryChange instanceof c.Failure) {
                C15809k.d(G.this.coroutineScope, null, null, new m(G.this, null), 3, null);
            }
            if (G.this.t4(entryChange)) {
                qw.a.INSTANCE.a("Not emitting Event.CartUpdateSuccessEvent because we show free snackbar from cart update", new Object[0]);
            } else {
                C15809k.d(G.this.coroutineScope, null, null, new n(G.this, entryChange, null), 3, null);
            }
            EntryChange entryChangeA = entryChange.a();
            if (entryChangeA != null) {
                G g10 = G.this;
                int i10 = a.$EnumSwitchMapping$0[entryChangeA.getStatusCode().ordinal()];
                if (i10 != 1 && i10 != 2) {
                    if (i10 != 3) {
                        return;
                    }
                    C15809k.d(g10.coroutineScope, null, null, new o(g10, null), 3, null);
                    return;
                }
                g10.t4(entryChange);
                if (entryChangeA.getExpectedQuantityChange() < 0.0d) {
                    e(entryChange, b(processedRequest), productCode);
                } else if (entryChangeA.getExpectedQuantityChange() > 0.0d) {
                    d(false, entryChange, b(processedRequest), productCode);
                }
            }
        }

        @Override // wr.InterfaceC17909a
        /* renamed from: getDisposable */
        public Ju.a getDisposables() {
            return G.this.disposables;
        }

        @Override // wr.InterfaceC17909a
        public void observeCart(uk.c<ShoppingCart> cartResource) {
            Object value;
            if (G.this.userManager.b() && cartResource != null) {
                G g10 = G.this;
                C15809k.d(g10.coroutineScope, null, null, new h(cartResource, g10, null), 3, null);
                InterfaceC16549B interfaceC16549B = g10._viewState;
                do {
                    value = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value, ViewState.c((ViewState) value, null, null, null, null, null, null, null, null, null, cartResource.a(), null, null, false, null, null, null, null, null, null, null, false, null, null, null, 16776703, null).a()));
            }
        }

        @Override // wr.InterfaceC17909a
        public void processedRequest(AbstractC17454a processedRequest, uk.c<EntryChange> entryChange) {
            Intrinsics.j(processedRequest, "processedRequest");
            Intrinsics.j(entryChange, "entryChange");
            if (processedRequest instanceof AbstractC17454a.Add) {
                a(processedRequest, entryChange, processedRequest.getProductCode());
                return;
            }
            if (processedRequest instanceof AbstractC17454a.Update) {
                f(processedRequest, entryChange, processedRequest.getProductCode());
            } else if (processedRequest instanceof AbstractC17454a.Remove) {
                c(processedRequest, entryChange, processedRequest.getProductCode());
            } else if (!Intrinsics.e(processedRequest, AbstractC17454a.b.f164334b)) {
                throw new NoWhenBranchMatchedException();
            }
        }

        @Override // wr.InterfaceC17909a
        public <T> void throwChallenge(AbstractC17440a<AbstractC17720a, T> challenge) {
            Intrinsics.j(challenge, "challenge");
            if (!(challenge.f() instanceof AbstractC17720a.ChokingHazardChallenge)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC17720a abstractC17720aF = challenge.f();
            Intrinsics.h(abstractC17720aF, "null cannot be cast to non-null type com.meijer.mobile.ui.cart.challenges.CartChallenge.ChokingHazardChallenge");
            C15809k.d(G.this.coroutineScope, null, null, new l(G.this, (AbstractC17720a.ChokingHazardChallenge) abstractC17720aF, null), 3, null);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$m;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "resourceId", "Landroid/graphics/Rect;", "stepperHitRect", "", "loadingState", "<init>", "(Ljava/lang/String;Landroid/graphics/Rect;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Landroid/graphics/Rect;", "()Landroid/graphics/Rect;", "c", "Z", "getLoadingState", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$m, reason: from toString */
    public static final /* data */ class EntryInQtyStepperInteraction {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String resourceId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Rect stepperHitRect;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean loadingState;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EntryInQtyStepperInteraction)) {
                return false;
            }
            EntryInQtyStepperInteraction entryInQtyStepperInteraction = (EntryInQtyStepperInteraction) other;
            return Intrinsics.e(this.resourceId, entryInQtyStepperInteraction.resourceId) && Intrinsics.e(this.stepperHitRect, entryInQtyStepperInteraction.stepperHitRect) && this.loadingState == entryInQtyStepperInteraction.loadingState;
        }

        public int hashCode() {
            return (((this.resourceId.hashCode() * 31) + this.stepperHitRect.hashCode()) * 31) + Boolean.hashCode(this.loadingState);
        }

        public String toString() {
            return "EntryInQtyStepperInteraction(resourceId=" + this.resourceId + ", stepperHitRect=" + this.stepperHitRect + ", loadingState=" + this.loadingState + ')';
        }

        public EntryInQtyStepperInteraction(String resourceId, Rect stepperHitRect, boolean z10) {
            Intrinsics.j(resourceId, "resourceId");
            Intrinsics.j(stepperHitRect, "stepperHitRect");
            this.resourceId = resourceId;
            this.stepperHitRect = stepperHitRect;
            this.loadingState = z10;
        }

        /* renamed from: a, reason: from getter */
        public final String getResourceId() {
            return this.resourceId;
        }

        /* renamed from: b, reason: from getter */
        public final Rect getStepperHitRect() {
            return this.stepperHitRect;
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000f\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n;", "", "<init>", "()V", "f", "g", "l", "b", "e", "o", "m", "k", "n", "h", "i", "a", "c", "j", "d", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n$a;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n$b;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n$c;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n$d;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n$e;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n$f;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n$g;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n$h;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n$i;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n$j;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n$k;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n$l;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n$m;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n$n;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n$o;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class n {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n$a;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n;", "LQo/l$k;", "query", "<init>", "(LQo/l$k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LQo/l$k;", "()LQo/l$k;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$n$a, reason: from toString */
        public static final /* data */ class BubbleFacetsToFilterAndSort extends n {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final l.k query;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BubbleFacetsToFilterAndSort) && Intrinsics.e(this.query, ((BubbleFacetsToFilterAndSort) other).query);
            }

            public int hashCode() {
                return this.query.hashCode();
            }

            public String toString() {
                return "BubbleFacetsToFilterAndSort(query=" + this.query + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BubbleFacetsToFilterAndSort(l.k query) {
                super(null);
                Intrinsics.j(query, "query");
                this.query = query;
            }

            /* renamed from: a, reason: from getter */
            public final l.k getQuery() {
                return this.query;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n$b;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n;", "", "messageResId", "actionResId", "Lfj/i;", "entry", "<init>", "(IILfj/i;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "Lfj/i;", "getEntry", "()Lfj/i;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$n$b, reason: from toString */
        public static final /* data */ class CartUpdateSuccessEvent extends n {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int actionResId;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Entry entry;

            public CartUpdateSuccessEvent(int i10, int i11, Entry entry) {
                super(null);
                this.messageResId = i10;
                this.actionResId = i11;
                this.entry = entry;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CartUpdateSuccessEvent)) {
                    return false;
                }
                CartUpdateSuccessEvent cartUpdateSuccessEvent = (CartUpdateSuccessEvent) other;
                return this.messageResId == cartUpdateSuccessEvent.messageResId && this.actionResId == cartUpdateSuccessEvent.actionResId && Intrinsics.e(this.entry, cartUpdateSuccessEvent.entry);
            }

            public int hashCode() {
                int iHashCode = ((Integer.hashCode(this.messageResId) * 31) + Integer.hashCode(this.actionResId)) * 31;
                Entry entry = this.entry;
                return iHashCode + (entry == null ? 0 : entry.hashCode());
            }

            public String toString() {
                return "CartUpdateSuccessEvent(messageResId=" + this.messageResId + ", actionResId=" + this.actionResId + ", entry=" + this.entry + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getActionResId() {
                return this.actionResId;
            }

            /* renamed from: b, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n$c;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n;", "", "titleResId", "messageResId", "positiveButtonResId", "negativeButtonResId", "LPk/a;", "coupon", "<init>", "(IIIILPk/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "e", "b", "c", "d", "LPk/a;", "()LPk/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$n$c, reason: from toString */
        public static final /* data */ class ClipCouponFailedEvent extends n {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int titleResId;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int positiveButtonResId;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final int negativeButtonResId;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Coupon coupon;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ClipCouponFailedEvent)) {
                    return false;
                }
                ClipCouponFailedEvent clipCouponFailedEvent = (ClipCouponFailedEvent) other;
                return this.titleResId == clipCouponFailedEvent.titleResId && this.messageResId == clipCouponFailedEvent.messageResId && this.positiveButtonResId == clipCouponFailedEvent.positiveButtonResId && this.negativeButtonResId == clipCouponFailedEvent.negativeButtonResId && Intrinsics.e(this.coupon, clipCouponFailedEvent.coupon);
            }

            public int hashCode() {
                return (((((((Integer.hashCode(this.titleResId) * 31) + Integer.hashCode(this.messageResId)) * 31) + Integer.hashCode(this.positiveButtonResId)) * 31) + Integer.hashCode(this.negativeButtonResId)) * 31) + this.coupon.hashCode();
            }

            public String toString() {
                return "ClipCouponFailedEvent(titleResId=" + this.titleResId + ", messageResId=" + this.messageResId + ", positiveButtonResId=" + this.positiveButtonResId + ", negativeButtonResId=" + this.negativeButtonResId + ", coupon=" + this.coupon + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ClipCouponFailedEvent(int i10, int i11, int i12, int i13, Coupon coupon) {
                super(null);
                Intrinsics.j(coupon, "coupon");
                this.titleResId = i10;
                this.messageResId = i11;
                this.positiveButtonResId = i12;
                this.negativeButtonResId = i13;
                this.coupon = coupon;
            }

            /* renamed from: a, reason: from getter */
            public final Coupon getCoupon() {
                return this.coupon;
            }

            /* renamed from: b, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }

            /* renamed from: c, reason: from getter */
            public final int getNegativeButtonResId() {
                return this.negativeButtonResId;
            }

            /* renamed from: d, reason: from getter */
            public final int getPositiveButtonResId() {
                return this.positiveButtonResId;
            }

            /* renamed from: e, reason: from getter */
            public final int getTitleResId() {
                return this.titleResId;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n$d;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends n {

            /* renamed from: a, reason: collision with root package name */
            public static final d f111716a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -826973322;
            }

            public String toString() {
                return "DismissFreeItemsSnackbar";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n$e;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n;", "Lvs/b;", "decorator", "<init>", "(Lvs/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvs/b;", "()Lvs/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$n$e, reason: from toString */
        public static final /* data */ class OpenLowStockScreenEvent extends n {

            /* renamed from: b, reason: collision with root package name */
            public static final int f111717b = CartProductListDecorator.f166190s;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final CartProductListDecorator decorator;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OpenLowStockScreenEvent) && Intrinsics.e(this.decorator, ((OpenLowStockScreenEvent) other).decorator);
            }

            public int hashCode() {
                return this.decorator.hashCode();
            }

            public String toString() {
                return "OpenLowStockScreenEvent(decorator=" + this.decorator + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpenLowStockScreenEvent(CartProductListDecorator decorator) {
                super(null);
                Intrinsics.j(decorator, "decorator");
                this.decorator = decorator;
            }

            /* renamed from: a, reason: from getter */
            public final CartProductListDecorator getDecorator() {
                return this.decorator;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n$f;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class f extends n {

            /* renamed from: a, reason: collision with root package name */
            public static final f f111719a = new f();

            private f() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof f);
            }

            public int hashCode() {
                return -985340003;
            }

            public String toString() {
                return "ProactiveSubstituteSuccess";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n$g;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class g extends n {

            /* renamed from: a, reason: collision with root package name */
            public static final g f111720a = new g();

            private g() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof g);
            }

            public int hashCode() {
                return -1386785303;
            }

            public String toString() {
                return "ReactiveSubstituteSuccess";
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n$h;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n;", "LIr/a;", "Lur/a;", "dialogInfo", "<init>", "(LIr/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIr/a;", "()LIr/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$n$h, reason: from toString */
        public static final /* data */ class ShowChokingWarningDialogEvent extends n {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final UserActionDialogInfo<AbstractC17454a> dialogInfo;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowChokingWarningDialogEvent) && Intrinsics.e(this.dialogInfo, ((ShowChokingWarningDialogEvent) other).dialogInfo);
            }

            public int hashCode() {
                return this.dialogInfo.hashCode();
            }

            public String toString() {
                return "ShowChokingWarningDialogEvent(dialogInfo=" + this.dialogInfo + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowChokingWarningDialogEvent(UserActionDialogInfo<AbstractC17454a> dialogInfo) {
                super(null);
                Intrinsics.j(dialogInfo, "dialogInfo");
                this.dialogInfo = dialogInfo;
            }

            public final UserActionDialogInfo<AbstractC17454a> a() {
                return this.dialogInfo;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n$i;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n;", "Lbk/a;", "title", "message", "positiveButtonText", "<init>", "(Lbk/a;Lbk/a;Lbk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbk/a;", "c", "()Lbk/a;", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$n$i, reason: from toString */
        public static final /* data */ class ShowError extends n {

            /* renamed from: d, reason: collision with root package name */
            public static final int f111722d = AbstractC6392a.f60445b;

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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n$j;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n;", "Lbk/a;", "message", "<init>", "(Lbk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbk/a;", "()Lbk/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$n$j, reason: from toString */
        public static final /* data */ class ShowFreeItemsSnackbar extends n {

            /* renamed from: b, reason: collision with root package name */
            public static final int f111726b = AbstractC6392a.f60445b;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC6392a message;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowFreeItemsSnackbar) && Intrinsics.e(this.message, ((ShowFreeItemsSnackbar) other).message);
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "ShowFreeItemsSnackbar(message=" + this.message + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowFreeItemsSnackbar(AbstractC6392a message) {
                super(null);
                Intrinsics.j(message, "message");
                this.message = message;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC6392a getMessage() {
                return this.message;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n$k;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n;", "LCo/h;", "product", "<init>", "(LCo/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$n$k, reason: from toString */
        public static final /* data */ class ShowPDPEvent extends n {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProductFullDetails product;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowPDPEvent) && Intrinsics.e(this.product, ((ShowPDPEvent) other).product);
            }

            public int hashCode() {
                return this.product.hashCode();
            }

            public String toString() {
                return "ShowPDPEvent(product=" + this.product + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowPDPEvent(ProductFullDetails product) {
                super(null);
                Intrinsics.j(product, "product");
                this.product = product;
            }

            /* renamed from: a, reason: from getter */
            public final ProductFullDetails getProduct() {
                return this.product;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n$l;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n;", "", "messageResId", "titleResId", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$n$l, reason: from toString */
        public static final /* data */ class SubstitutionFailureEvent extends n {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int titleResId;

            public SubstitutionFailureEvent(int i10, int i11) {
                super(null);
                this.messageResId = i10;
                this.titleResId = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SubstitutionFailureEvent)) {
                    return false;
                }
                SubstitutionFailureEvent substitutionFailureEvent = (SubstitutionFailureEvent) other;
                return this.messageResId == substitutionFailureEvent.messageResId && this.titleResId == substitutionFailureEvent.titleResId;
            }

            public int hashCode() {
                return (Integer.hashCode(this.messageResId) * 31) + Integer.hashCode(this.titleResId);
            }

            public String toString() {
                return "SubstitutionFailureEvent(messageResId=" + this.messageResId + ", titleResId=" + this.titleResId + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }

            /* renamed from: b, reason: from getter */
            public final int getTitleResId() {
                return this.titleResId;
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n$m;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n;", "", "totalProductCount", "", "firstProductName", "outOfStockList", "lowStockList", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "Ljava/lang/String;", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$n$m, reason: from toString */
        public static final /* data */ class UpdateProductsInfoEvent extends n {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int totalProductCount;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String firstProductName;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String outOfStockList;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String lowStockList;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateProductsInfoEvent)) {
                    return false;
                }
                UpdateProductsInfoEvent updateProductsInfoEvent = (UpdateProductsInfoEvent) other;
                return this.totalProductCount == updateProductsInfoEvent.totalProductCount && Intrinsics.e(this.firstProductName, updateProductsInfoEvent.firstProductName) && Intrinsics.e(this.outOfStockList, updateProductsInfoEvent.outOfStockList) && Intrinsics.e(this.lowStockList, updateProductsInfoEvent.lowStockList);
            }

            public int hashCode() {
                return (((((Integer.hashCode(this.totalProductCount) * 31) + this.firstProductName.hashCode()) * 31) + this.outOfStockList.hashCode()) * 31) + this.lowStockList.hashCode();
            }

            public String toString() {
                return "UpdateProductsInfoEvent(totalProductCount=" + this.totalProductCount + ", firstProductName=" + this.firstProductName + ", outOfStockList=" + this.outOfStockList + ", lowStockList=" + this.lowStockList + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateProductsInfoEvent(int i10, String firstProductName, String outOfStockList, String lowStockList) {
                super(null);
                Intrinsics.j(firstProductName, "firstProductName");
                Intrinsics.j(outOfStockList, "outOfStockList");
                Intrinsics.j(lowStockList, "lowStockList");
                this.totalProductCount = i10;
                this.firstProductName = firstProductName;
                this.outOfStockList = outOfStockList;
                this.lowStockList = lowStockList;
            }

            /* renamed from: a, reason: from getter */
            public final String getFirstProductName() {
                return this.firstProductName;
            }

            /* renamed from: b, reason: from getter */
            public final String getLowStockList() {
                return this.lowStockList;
            }

            /* renamed from: c, reason: from getter */
            public final String getOutOfStockList() {
                return this.outOfStockList;
            }

            /* renamed from: d, reason: from getter */
            public final int getTotalProductCount() {
                return this.totalProductCount;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n$n;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n;", "", "messageResId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$n$n, reason: collision with other inner class name and from toString */
        public static final /* data */ class UpdateToCartFailedEvent extends n {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            public UpdateToCartFailedEvent(int i10) {
                super(null);
                this.messageResId = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateToCartFailedEvent) && this.messageResId == ((UpdateToCartFailedEvent) other).messageResId;
            }

            public int hashCode() {
                return Integer.hashCode(this.messageResId);
            }

            public String toString() {
                return "UpdateToCartFailedEvent(messageResId=" + this.messageResId + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n$o;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n;", "LCo/h;", "product", "<init>", "(LCo/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "getProduct", "()LCo/h;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$n$o, reason: from toString */
        public static final /* data */ class ViewProductDetailsEvent extends n {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProductFullDetails product;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ViewProductDetailsEvent) && Intrinsics.e(this.product, ((ViewProductDetailsEvent) other).product);
            }

            public int hashCode() {
                return this.product.hashCode();
            }

            public String toString() {
                return "ViewProductDetailsEvent(product=" + this.product + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ViewProductDetailsEvent(ProductFullDetails product) {
                super(null);
                Intrinsics.j(product, "product");
                this.product = product;
            }
        }

        public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private n() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$o;", "", "", "searchTerm", "spellSuggestionTerm", "", "noResultVisibility", "suggestionVisibility", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSearchTerm", "b", "c", "I", "getNoResultVisibility", "d", "getSuggestionVisibility", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$o, reason: from toString */
    public static final /* data */ class NoResultDecorator {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String searchTerm;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String spellSuggestionTerm;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int noResultVisibility;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int suggestionVisibility;

        public NoResultDecorator() {
            this(null, null, 0, 0, 15, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NoResultDecorator)) {
                return false;
            }
            NoResultDecorator noResultDecorator = (NoResultDecorator) other;
            return Intrinsics.e(this.searchTerm, noResultDecorator.searchTerm) && Intrinsics.e(this.spellSuggestionTerm, noResultDecorator.spellSuggestionTerm) && this.noResultVisibility == noResultDecorator.noResultVisibility && this.suggestionVisibility == noResultDecorator.suggestionVisibility;
        }

        public int hashCode() {
            int iHashCode = this.searchTerm.hashCode() * 31;
            String str = this.spellSuggestionTerm;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.noResultVisibility)) * 31) + Integer.hashCode(this.suggestionVisibility);
        }

        public String toString() {
            return "NoResultDecorator(searchTerm=" + this.searchTerm + ", spellSuggestionTerm=" + this.spellSuggestionTerm + ", noResultVisibility=" + this.noResultVisibility + ", suggestionVisibility=" + this.suggestionVisibility + ')';
        }

        public NoResultDecorator(String searchTerm, String str, int i10, int i11) {
            Intrinsics.j(searchTerm, "searchTerm");
            this.searchTerm = searchTerm;
            this.spellSuggestionTerm = str;
            this.noResultVisibility = i10;
            this.suggestionVisibility = i11;
        }

        /* renamed from: a, reason: from getter */
        public final String getSpellSuggestionTerm() {
            return this.spellSuggestionTerm;
        }

        public /* synthetic */ NoResultDecorator(String str, String str2, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? 4 : i10, (i12 & 8) != 0 ? 4 : i11);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$p;", "", "", "", "placementPositions", "", "Lvs/f;", "itemList", "sponsoredProducts", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getPlacementPositions", "()Ljava/util/List;", "b", "Ljava/util/Map;", "getItemList", "()Ljava/util/Map;", "c", "getSponsoredProducts", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$p, reason: from toString */
    public static final /* data */ class SponsoredProductsWrapper {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Integer> placementPositions;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<Integer, ProductListDecorator> itemList;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ProductListDecorator> sponsoredProducts;

        public SponsoredProductsWrapper() {
            this(null, null, null, 7, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SponsoredProductsWrapper)) {
                return false;
            }
            SponsoredProductsWrapper sponsoredProductsWrapper = (SponsoredProductsWrapper) other;
            return Intrinsics.e(this.placementPositions, sponsoredProductsWrapper.placementPositions) && Intrinsics.e(this.itemList, sponsoredProductsWrapper.itemList) && Intrinsics.e(this.sponsoredProducts, sponsoredProductsWrapper.sponsoredProducts);
        }

        public int hashCode() {
            return (((this.placementPositions.hashCode() * 31) + this.itemList.hashCode()) * 31) + this.sponsoredProducts.hashCode();
        }

        public String toString() {
            return "SponsoredProductsWrapper(placementPositions=" + this.placementPositions + ", itemList=" + this.itemList + ", sponsoredProducts=" + this.sponsoredProducts + ')';
        }

        public SponsoredProductsWrapper(List<Integer> placementPositions, Map<Integer, ProductListDecorator> itemList, List<ProductListDecorator> sponsoredProducts) {
            Intrinsics.j(placementPositions, "placementPositions");
            Intrinsics.j(itemList, "itemList");
            Intrinsics.j(sponsoredProducts, "sponsoredProducts");
            this.placementPositions = placementPositions;
            this.itemList = itemList;
            this.sponsoredProducts = sponsoredProducts;
        }

        public /* synthetic */ SponsoredProductsWrapper(List list, Map map, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? CollectionsKt.m() : list, (i10 & 2) != 0 ? new LinkedHashMap() : map, (i10 & 4) != 0 ? CollectionsKt.m() : list2);
        }
    }

    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bO\b\u0087\b\u0018\u00002\u00020\u0001B¹\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\n\u0012\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\n\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\n\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\n\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\n\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010&\u001a\u00020%\u0012\b\b\u0002\u0010'\u001a\u00020\u001c\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010(¢\u0006\u0004\b,\u0010-J\u001b\u0010/\u001a\u0004\u0018\u00010\u00062\b\u0010.\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u0000¢\u0006\u0004\b1\u00102JÆ\u0002\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\n2\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020\u001c2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010(HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010:\u001a\u00020\u001c2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001f\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\n8\u0006¢\u0006\f\n\u0004\bN\u0010K\u001a\u0004\bN\u0010MR'\u0010\u0011\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000f8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bO\u0010QR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bF\u0010dR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bb\u0010gR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\n8\u0006¢\u0006\f\n\u0004\bH\u0010K\u001a\u0004\bJ\u0010MR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\n8\u0006¢\u0006\f\n\u0004\bh\u0010K\u001a\u0004\bi\u0010MR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\n8\u0006¢\u0006\f\n\u0004\bL\u0010K\u001a\u0004\bj\u0010MR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\n8\u0006¢\u0006\f\n\u0004\b\\\u0010K\u001a\u0004\bk\u0010MR\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0019\u0010$\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b/\u0010l\u001a\u0004\bR\u0010nR\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\bm\u0010o\u001a\u0004\be\u0010pR\u0017\u0010'\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bq\u0010f\u001a\u0004\bh\u0010gR\u0019\u0010)\u001a\u0004\u0018\u00010(8\u0006¢\u0006\f\n\u0004\bi\u0010r\u001a\u0004\bV\u0010sR\u0019\u0010*\u001a\u0004\u0018\u00010(8\u0006¢\u0006\f\n\u0004\bt\u0010r\u001a\u0004\bZ\u0010sR\u0019\u0010+\u001a\u0004\u0018\u00010(8\u0006¢\u0006\f\n\u0004\bu\u0010r\u001a\u0004\b^\u0010sR\u0011\u0010v\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\bq\u00108¨\u0006w"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/G$q;", "", "LTq/k;", "storeDetails", "LQo/l;", "productQuery", "Lbk/a;", "title", "LPj/a;", "loadingState", "", "Lvs/f;", "products", "LYk/c;", "couponsStateList", "", "", "couponsStateMap", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$p;", "sponsoredProductsWrapper", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$o;", "noProductResult", "Lfj/C;", "shoppingCart", "Ljj/c;", "nextFulfillmentSlot", "Lik/a;", "cartDecorator", "", "itemSelected", "clickBeaconsSent", "viewBeaconsSent", "loadBeaconsSent", "stepperBeaconsSent", "", "tokenMatch", "embeddingsMatch", "Lcom/meijer/mobile/meijer/search/c;", "limitResultsScenario", "lowStockBackupTracked", "Lgi/d;", "googleAdSlot1", "googleAdSlot2", "googleAdSlot3", "<init>", "(LTq/k;LQo/l;Lbk/a;LPj/a;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/meijer/mobile/meijer/activity/personalized/modals/G$p;Lcom/meijer/mobile/meijer/activity/personalized/modals/G$o;Lfj/C;Ljj/c;Lik/a;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/meijer/mobile/meijer/search/c;ZLgi/d;Lgi/d;Lgi/d;)V", "query", "s", "(LQo/l;)Lbk/a;", "a", "()Lcom/meijer/mobile/meijer/activity/personalized/modals/G$q;", "b", "(LTq/k;LQo/l;Lbk/a;LPj/a;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/meijer/mobile/meijer/activity/personalized/modals/G$p;Lcom/meijer/mobile/meijer/activity/personalized/modals/G$o;Lfj/C;Ljj/c;Lik/a;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/meijer/mobile/meijer/search/c;ZLgi/d;Lgi/d;Lgi/d;)Lcom/meijer/mobile/meijer/activity/personalized/modals/G$q;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LTq/k;", "getStoreDetails", "()LTq/k;", "LQo/l;", "getProductQuery", "()LQo/l;", "c", "Lbk/a;", "getTitle", "()Lbk/a;", "d", "LPj/a;", "n", "()LPj/a;", "e", "Ljava/util/List;", "p", "()Ljava/util/List;", "f", "g", "Ljava/util/Map;", "()Ljava/util/Map;", "h", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$p;", "getSponsoredProductsWrapper", "()Lcom/meijer/mobile/meijer/activity/personalized/modals/G$p;", "i", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$o;", "getNoProductResult", "()Lcom/meijer/mobile/meijer/activity/personalized/modals/G$o;", "j", "Lfj/C;", "q", "()Lfj/C;", "k", "Ljj/c;", "getNextFulfillmentSlot", "()Ljj/c;", "l", "Lik/a;", "()Lik/a;", "m", "Z", "()Z", "o", "v", "getLoadBeaconsSent", "r", "Ljava/lang/Integer;", "t", "()Ljava/lang/Integer;", "Lcom/meijer/mobile/meijer/search/c;", "()Lcom/meijer/mobile/meijer/search/c;", "u", "Lgi/d;", "()Lgi/d;", "w", "x", "totalCount", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$q, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Tq.k storeDetails;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Qo.l productQuery;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a title;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Pj.a loadingState;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ProductListDecorator> products;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<CouponState> couponsStateList;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, CouponState> couponsStateMap;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final SponsoredProductsWrapper sponsoredProductsWrapper;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final NoResultDecorator noProductResult;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final ShoppingCart shoppingCart;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final FulfillmentSlot nextFulfillmentSlot;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final CartPreviewDecorator cartDecorator;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean itemSelected;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> clickBeaconsSent;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> viewBeaconsSent;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> loadBeaconsSent;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> stepperBeaconsSent;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer tokenMatch;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer embeddingsMatch;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnumC12707c limitResultsScenario;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean lowStockBackupTracked;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final GoogleAdData googleAdSlot1;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final GoogleAdData googleAdSlot2;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private final GoogleAdData googleAdSlot3;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$q$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[nk.d.values().length];
                try {
                    iArr[nk.d.f152478a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[nk.d.f152479b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public ViewState(Tq.k storeDetails, Qo.l productQuery, AbstractC6392a abstractC6392a, Pj.a loadingState, List<ProductListDecorator> products, List<CouponState> couponsStateList, Map<String, CouponState> couponsStateMap, SponsoredProductsWrapper sponsoredProductsWrapper, NoResultDecorator noProductResult, ShoppingCart shoppingCart, FulfillmentSlot fulfillmentSlot, CartPreviewDecorator cartDecorator, boolean z10, List<String> clickBeaconsSent, List<String> viewBeaconsSent, List<String> loadBeaconsSent, List<String> stepperBeaconsSent, Integer num, Integer num2, EnumC12707c limitResultsScenario, boolean z11, GoogleAdData googleAdData, GoogleAdData googleAdData2, GoogleAdData googleAdData3) {
            Intrinsics.j(storeDetails, "storeDetails");
            Intrinsics.j(productQuery, "productQuery");
            Intrinsics.j(loadingState, "loadingState");
            Intrinsics.j(products, "products");
            Intrinsics.j(couponsStateList, "couponsStateList");
            Intrinsics.j(couponsStateMap, "couponsStateMap");
            Intrinsics.j(sponsoredProductsWrapper, "sponsoredProductsWrapper");
            Intrinsics.j(noProductResult, "noProductResult");
            Intrinsics.j(cartDecorator, "cartDecorator");
            Intrinsics.j(clickBeaconsSent, "clickBeaconsSent");
            Intrinsics.j(viewBeaconsSent, "viewBeaconsSent");
            Intrinsics.j(loadBeaconsSent, "loadBeaconsSent");
            Intrinsics.j(stepperBeaconsSent, "stepperBeaconsSent");
            Intrinsics.j(limitResultsScenario, "limitResultsScenario");
            this.storeDetails = storeDetails;
            this.productQuery = productQuery;
            this.title = abstractC6392a;
            this.loadingState = loadingState;
            this.products = products;
            this.couponsStateList = couponsStateList;
            this.couponsStateMap = couponsStateMap;
            this.sponsoredProductsWrapper = sponsoredProductsWrapper;
            this.noProductResult = noProductResult;
            this.shoppingCart = shoppingCart;
            this.nextFulfillmentSlot = fulfillmentSlot;
            this.cartDecorator = cartDecorator;
            this.itemSelected = z10;
            this.clickBeaconsSent = clickBeaconsSent;
            this.viewBeaconsSent = viewBeaconsSent;
            this.loadBeaconsSent = loadBeaconsSent;
            this.stepperBeaconsSent = stepperBeaconsSent;
            this.tokenMatch = num;
            this.embeddingsMatch = num2;
            this.limitResultsScenario = limitResultsScenario;
            this.lowStockBackupTracked = z11;
            this.googleAdSlot1 = googleAdData;
            this.googleAdSlot2 = googleAdData2;
            this.googleAdSlot3 = googleAdData3;
        }

        public static /* synthetic */ ViewState c(ViewState viewState, Tq.k kVar, Qo.l lVar, AbstractC6392a abstractC6392a, Pj.a aVar, List list, List list2, Map map, SponsoredProductsWrapper sponsoredProductsWrapper, NoResultDecorator noResultDecorator, ShoppingCart shoppingCart, FulfillmentSlot fulfillmentSlot, CartPreviewDecorator cartPreviewDecorator, boolean z10, List list3, List list4, List list5, List list6, Integer num, Integer num2, EnumC12707c enumC12707c, boolean z11, GoogleAdData googleAdData, GoogleAdData googleAdData2, GoogleAdData googleAdData3, int i10, Object obj) {
            GoogleAdData googleAdData4;
            GoogleAdData googleAdData5;
            Tq.k kVar2 = (i10 & 1) != 0 ? viewState.storeDetails : kVar;
            Qo.l lVar2 = (i10 & 2) != 0 ? viewState.productQuery : lVar;
            AbstractC6392a abstractC6392a2 = (i10 & 4) != 0 ? viewState.title : abstractC6392a;
            Pj.a aVar2 = (i10 & 8) != 0 ? viewState.loadingState : aVar;
            List list7 = (i10 & 16) != 0 ? viewState.products : list;
            List list8 = (i10 & 32) != 0 ? viewState.couponsStateList : list2;
            Map map2 = (i10 & 64) != 0 ? viewState.couponsStateMap : map;
            SponsoredProductsWrapper sponsoredProductsWrapper2 = (i10 & 128) != 0 ? viewState.sponsoredProductsWrapper : sponsoredProductsWrapper;
            NoResultDecorator noResultDecorator2 = (i10 & 256) != 0 ? viewState.noProductResult : noResultDecorator;
            ShoppingCart shoppingCart2 = (i10 & 512) != 0 ? viewState.shoppingCart : shoppingCart;
            FulfillmentSlot fulfillmentSlot2 = (i10 & 1024) != 0 ? viewState.nextFulfillmentSlot : fulfillmentSlot;
            CartPreviewDecorator cartPreviewDecorator2 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? viewState.cartDecorator : cartPreviewDecorator;
            boolean z12 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? viewState.itemSelected : z10;
            List list9 = (i10 & 8192) != 0 ? viewState.clickBeaconsSent : list3;
            Tq.k kVar3 = kVar2;
            List list10 = (i10 & 16384) != 0 ? viewState.viewBeaconsSent : list4;
            List list11 = (i10 & 32768) != 0 ? viewState.loadBeaconsSent : list5;
            List list12 = (i10 & 65536) != 0 ? viewState.stepperBeaconsSent : list6;
            Integer num3 = (i10 & 131072) != 0 ? viewState.tokenMatch : num;
            Integer num4 = (i10 & 262144) != 0 ? viewState.embeddingsMatch : num2;
            EnumC12707c enumC12707c2 = (i10 & 524288) != 0 ? viewState.limitResultsScenario : enumC12707c;
            boolean z13 = (i10 & 1048576) != 0 ? viewState.lowStockBackupTracked : z11;
            GoogleAdData googleAdData6 = (i10 & 2097152) != 0 ? viewState.googleAdSlot1 : googleAdData;
            GoogleAdData googleAdData7 = (i10 & 4194304) != 0 ? viewState.googleAdSlot2 : googleAdData2;
            if ((i10 & 8388608) != 0) {
                googleAdData5 = googleAdData7;
                googleAdData4 = viewState.googleAdSlot3;
            } else {
                googleAdData4 = googleAdData3;
                googleAdData5 = googleAdData7;
            }
            return viewState.b(kVar3, lVar2, abstractC6392a2, aVar2, list7, list8, map2, sponsoredProductsWrapper2, noResultDecorator2, shoppingCart2, fulfillmentSlot2, cartPreviewDecorator2, z12, list9, list10, list11, list12, num3, num4, enumC12707c2, z13, googleAdData6, googleAdData5, googleAdData4);
        }

        public final ViewState b(Tq.k storeDetails, Qo.l productQuery, AbstractC6392a title, Pj.a loadingState, List<ProductListDecorator> products, List<CouponState> couponsStateList, Map<String, CouponState> couponsStateMap, SponsoredProductsWrapper sponsoredProductsWrapper, NoResultDecorator noProductResult, ShoppingCart shoppingCart, FulfillmentSlot nextFulfillmentSlot, CartPreviewDecorator cartDecorator, boolean itemSelected, List<String> clickBeaconsSent, List<String> viewBeaconsSent, List<String> loadBeaconsSent, List<String> stepperBeaconsSent, Integer tokenMatch, Integer embeddingsMatch, EnumC12707c limitResultsScenario, boolean lowStockBackupTracked, GoogleAdData googleAdSlot1, GoogleAdData googleAdSlot2, GoogleAdData googleAdSlot3) {
            Intrinsics.j(storeDetails, "storeDetails");
            Intrinsics.j(productQuery, "productQuery");
            Intrinsics.j(loadingState, "loadingState");
            Intrinsics.j(products, "products");
            Intrinsics.j(couponsStateList, "couponsStateList");
            Intrinsics.j(couponsStateMap, "couponsStateMap");
            Intrinsics.j(sponsoredProductsWrapper, "sponsoredProductsWrapper");
            Intrinsics.j(noProductResult, "noProductResult");
            Intrinsics.j(cartDecorator, "cartDecorator");
            Intrinsics.j(clickBeaconsSent, "clickBeaconsSent");
            Intrinsics.j(viewBeaconsSent, "viewBeaconsSent");
            Intrinsics.j(loadBeaconsSent, "loadBeaconsSent");
            Intrinsics.j(stepperBeaconsSent, "stepperBeaconsSent");
            Intrinsics.j(limitResultsScenario, "limitResultsScenario");
            return new ViewState(storeDetails, productQuery, title, loadingState, products, couponsStateList, couponsStateMap, sponsoredProductsWrapper, noProductResult, shoppingCart, nextFulfillmentSlot, cartDecorator, itemSelected, clickBeaconsSent, viewBeaconsSent, loadBeaconsSent, stepperBeaconsSent, tokenMatch, embeddingsMatch, limitResultsScenario, lowStockBackupTracked, googleAdSlot1, googleAdSlot2, googleAdSlot3);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.storeDetails, viewState.storeDetails) && Intrinsics.e(this.productQuery, viewState.productQuery) && Intrinsics.e(this.title, viewState.title) && Intrinsics.e(this.loadingState, viewState.loadingState) && Intrinsics.e(this.products, viewState.products) && Intrinsics.e(this.couponsStateList, viewState.couponsStateList) && Intrinsics.e(this.couponsStateMap, viewState.couponsStateMap) && Intrinsics.e(this.sponsoredProductsWrapper, viewState.sponsoredProductsWrapper) && Intrinsics.e(this.noProductResult, viewState.noProductResult) && Intrinsics.e(this.shoppingCart, viewState.shoppingCart) && Intrinsics.e(this.nextFulfillmentSlot, viewState.nextFulfillmentSlot) && Intrinsics.e(this.cartDecorator, viewState.cartDecorator) && this.itemSelected == viewState.itemSelected && Intrinsics.e(this.clickBeaconsSent, viewState.clickBeaconsSent) && Intrinsics.e(this.viewBeaconsSent, viewState.viewBeaconsSent) && Intrinsics.e(this.loadBeaconsSent, viewState.loadBeaconsSent) && Intrinsics.e(this.stepperBeaconsSent, viewState.stepperBeaconsSent) && Intrinsics.e(this.tokenMatch, viewState.tokenMatch) && Intrinsics.e(this.embeddingsMatch, viewState.embeddingsMatch) && this.limitResultsScenario == viewState.limitResultsScenario && this.lowStockBackupTracked == viewState.lowStockBackupTracked && Intrinsics.e(this.googleAdSlot1, viewState.googleAdSlot1) && Intrinsics.e(this.googleAdSlot2, viewState.googleAdSlot2) && Intrinsics.e(this.googleAdSlot3, viewState.googleAdSlot3);
        }

        public int hashCode() {
            int iHashCode = ((this.storeDetails.hashCode() * 31) + this.productQuery.hashCode()) * 31;
            AbstractC6392a abstractC6392a = this.title;
            int iHashCode2 = (((((((((((((iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31) + this.loadingState.hashCode()) * 31) + this.products.hashCode()) * 31) + this.couponsStateList.hashCode()) * 31) + this.couponsStateMap.hashCode()) * 31) + this.sponsoredProductsWrapper.hashCode()) * 31) + this.noProductResult.hashCode()) * 31;
            ShoppingCart shoppingCart = this.shoppingCart;
            int iHashCode3 = (iHashCode2 + (shoppingCart == null ? 0 : shoppingCart.hashCode())) * 31;
            FulfillmentSlot fulfillmentSlot = this.nextFulfillmentSlot;
            int iHashCode4 = (((((((((((((iHashCode3 + (fulfillmentSlot == null ? 0 : fulfillmentSlot.hashCode())) * 31) + this.cartDecorator.hashCode()) * 31) + Boolean.hashCode(this.itemSelected)) * 31) + this.clickBeaconsSent.hashCode()) * 31) + this.viewBeaconsSent.hashCode()) * 31) + this.loadBeaconsSent.hashCode()) * 31) + this.stepperBeaconsSent.hashCode()) * 31;
            Integer num = this.tokenMatch;
            int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.embeddingsMatch;
            int iHashCode6 = (((((iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.limitResultsScenario.hashCode()) * 31) + Boolean.hashCode(this.lowStockBackupTracked)) * 31;
            GoogleAdData googleAdData = this.googleAdSlot1;
            int iHashCode7 = (iHashCode6 + (googleAdData == null ? 0 : googleAdData.hashCode())) * 31;
            GoogleAdData googleAdData2 = this.googleAdSlot2;
            int iHashCode8 = (iHashCode7 + (googleAdData2 == null ? 0 : googleAdData2.hashCode())) * 31;
            GoogleAdData googleAdData3 = this.googleAdSlot3;
            return iHashCode8 + (googleAdData3 != null ? googleAdData3.hashCode() : 0);
        }

        public String toString() {
            return "ViewState(storeDetails=" + this.storeDetails + ", productQuery=" + this.productQuery + ", title=" + this.title + ", loadingState=" + this.loadingState + ", products=" + this.products + ", couponsStateList=" + this.couponsStateList + ", couponsStateMap=" + this.couponsStateMap + ", sponsoredProductsWrapper=" + this.sponsoredProductsWrapper + ", noProductResult=" + this.noProductResult + ", shoppingCart=" + this.shoppingCart + ", nextFulfillmentSlot=" + this.nextFulfillmentSlot + ", cartDecorator=" + this.cartDecorator + ", itemSelected=" + this.itemSelected + ", clickBeaconsSent=" + this.clickBeaconsSent + ", viewBeaconsSent=" + this.viewBeaconsSent + ", loadBeaconsSent=" + this.loadBeaconsSent + ", stepperBeaconsSent=" + this.stepperBeaconsSent + ", tokenMatch=" + this.tokenMatch + ", embeddingsMatch=" + this.embeddingsMatch + ", limitResultsScenario=" + this.limitResultsScenario + ", lowStockBackupTracked=" + this.lowStockBackupTracked + ", googleAdSlot1=" + this.googleAdSlot1 + ", googleAdSlot2=" + this.googleAdSlot2 + ", googleAdSlot3=" + this.googleAdSlot3 + ')';
        }

        private final AbstractC6392a s(Qo.l query) {
            int i10;
            if ((query instanceof l.Search) || (query instanceof l.BrowseCollection)) {
                return null;
            }
            if (query instanceof l.Favorites) {
                return AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100350Bi, new Object[0]);
            }
            if (query instanceof l.ShoppingList) {
                return AbstractC6392a.INSTANCE.d(Aq.b.f1974V, new Object[0]);
            }
            if (query instanceof l.Department) {
                return AbstractC6392a.INSTANCE.c(((l.Department) query).getDepartment().getName());
            }
            if (query instanceof l.Coupon) {
                return AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100924fd, new Object[0]);
            }
            if (query instanceof l.Reward) {
                return AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100924fd, new Object[0]);
            }
            if (query instanceof l.Recommendations) {
                return null;
            }
            if (!(query instanceof l.Personalized)) {
                if (query == null) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            int i11 = a.$EnumSwitchMapping$0[((l.Personalized) query).getCategory().ordinal()];
            if (i11 == 1) {
                i10 = com.meijer.mobile.meijer.Y.f100455H5;
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i10 = com.meijer.mobile.meijer.Y.f101150r0;
            }
            return AbstractC6392a.INSTANCE.d(i10, new Object[0]);
        }

        public final ViewState a() {
            String spellSuggestionTerm;
            boolean z10 = (this.loadingState instanceof a.Loading) || !this.products.isEmpty();
            Qo.l lVar = this.productQuery;
            l.Search search = lVar instanceof l.Search ? (l.Search) lVar : null;
            String term = search != null ? search.getTerm() : null;
            Qo.l lVar2 = this.productQuery;
            l.Search search2 = lVar2 instanceof l.Search ? (l.Search) lVar2 : null;
            String spellingSuggestion = search2 != null ? search2.getSpellingSuggestion() : null;
            if (term == null) {
                term = "";
            }
            return c(this, null, null, s(this.productQuery), null, null, null, null, null, new NoResultDecorator(term, spellingSuggestion, z10 ? 4 : 0, (z10 || (spellSuggestionTerm = this.noProductResult.getSpellSuggestionTerm()) == null || !(StringsKt.s0(spellSuggestionTerm) ^ true) || !this.products.isEmpty()) ? 4 : 0), null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, 16776955, null);
        }

        /* renamed from: d, reason: from getter */
        public final CartPreviewDecorator getCartDecorator() {
            return this.cartDecorator;
        }

        public final List<String> e() {
            return this.clickBeaconsSent;
        }

        public final List<CouponState> f() {
            return this.couponsStateList;
        }

        public final Map<String, CouponState> g() {
            return this.couponsStateMap;
        }

        /* renamed from: h, reason: from getter */
        public final Integer getEmbeddingsMatch() {
            return this.embeddingsMatch;
        }

        /* renamed from: i, reason: from getter */
        public final GoogleAdData getGoogleAdSlot1() {
            return this.googleAdSlot1;
        }

        /* renamed from: j, reason: from getter */
        public final GoogleAdData getGoogleAdSlot2() {
            return this.googleAdSlot2;
        }

        /* renamed from: k, reason: from getter */
        public final GoogleAdData getGoogleAdSlot3() {
            return this.googleAdSlot3;
        }

        /* renamed from: l, reason: from getter */
        public final boolean getItemSelected() {
            return this.itemSelected;
        }

        /* renamed from: m, reason: from getter */
        public final EnumC12707c getLimitResultsScenario() {
            return this.limitResultsScenario;
        }

        /* renamed from: n, reason: from getter */
        public final Pj.a getLoadingState() {
            return this.loadingState;
        }

        /* renamed from: o, reason: from getter */
        public final boolean getLowStockBackupTracked() {
            return this.lowStockBackupTracked;
        }

        public final List<ProductListDecorator> p() {
            return this.products;
        }

        /* renamed from: q, reason: from getter */
        public final ShoppingCart getShoppingCart() {
            return this.shoppingCart;
        }

        public final List<String> r() {
            return this.stepperBeaconsSent;
        }

        /* renamed from: t, reason: from getter */
        public final Integer getTokenMatch() {
            return this.tokenMatch;
        }

        public final int u() {
            Integer totalCount = this.productQuery.getTotalCount();
            return totalCount != null ? totalCount.intValue() : this.products.size();
        }

        public final List<String> v() {
            return this.viewBeaconsSent;
        }

        public /* synthetic */ ViewState(Tq.k kVar, Qo.l lVar, AbstractC6392a abstractC6392a, Pj.a aVar, List list, List list2, Map map, SponsoredProductsWrapper sponsoredProductsWrapper, NoResultDecorator noResultDecorator, ShoppingCart shoppingCart, FulfillmentSlot fulfillmentSlot, CartPreviewDecorator cartPreviewDecorator, boolean z10, List list3, List list4, List list5, List list6, Integer num, Integer num2, EnumC12707c enumC12707c, boolean z11, GoogleAdData googleAdData, GoogleAdData googleAdData2, GoogleAdData googleAdData3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(kVar, lVar, (i10 & 4) != 0 ? null : abstractC6392a, (i10 & 8) != 0 ? new a.Loading(BuildConfig.DEFAULT_ITEM_SECTION, null, 2, null) : aVar, (i10 & 16) != 0 ? CollectionsKt.m() : list, (i10 & 32) != 0 ? CollectionsKt.m() : list2, (i10 & 64) != 0 ? new LinkedHashMap() : map, (i10 & 128) != 0 ? new SponsoredProductsWrapper(null, null, null, 7, null) : sponsoredProductsWrapper, (i10 & 256) != 0 ? new NoResultDecorator(null, null, 0, 0, 15, null) : noResultDecorator, (i10 & 512) != 0 ? null : shoppingCart, (i10 & 1024) != 0 ? null : fulfillmentSlot, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? new CartPreviewDecorator(false, 0, 3, null) : cartPreviewDecorator, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z10, (i10 & 8192) != 0 ? CollectionsKt.m() : list3, (i10 & 16384) != 0 ? CollectionsKt.m() : list4, (32768 & i10) != 0 ? CollectionsKt.m() : list5, (65536 & i10) != 0 ? CollectionsKt.m() : list6, (131072 & i10) != 0 ? null : num, (262144 & i10) != 0 ? null : num2, (524288 & i10) != 0 ? EnumC12707c.f114096a : enumC12707c, (1048576 & i10) != 0 ? false : z11, (2097152 & i10) != 0 ? null : googleAdData, (4194304 & i10) != 0 ? null : googleAdData2, (i10 & 8388608) != 0 ? null : googleAdData3);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class r {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[nk.d.values().length];
            try {
                iArr[nk.d.f152478a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[nk.d.f152479b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EnumC12707c.values().length];
            try {
                iArr2[EnumC12707c.f114096a.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC12707c.f114097b.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC12707c.f114098c.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC12707c.f114099d.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$clipCoupon$2$1", f = "PLPStateHolder.kt", l = {514}, m = "invokeSuspend")
    static final class s extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111768a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Coupon f111770c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return G.this.new s(this.f111770c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(Coupon coupon, Continuation<? super s> continuation) {
            super(2, continuation);
            this.f111770c = coupon;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((s) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111768a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = G.this._event;
                n.ClipCouponFailedEvent clipCouponFailedEvent = new n.ClipCouponFailedEvent(Nr.g.f22702n, Nr.g.f22700m, com.meijer.mobile.meijer.Y.f100486Ih, Nr.g.f22664O, this.f111770c);
                this.f111768a = 1;
                if (interfaceC16548A.emit(clipCouponFailedEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$fetchCriteoSponsoredProducts$1", f = "PLPStateHolder.kt", l = {797}, m = "invokeSuspend")
    static final class u extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111771a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f111773c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Qo.l f111774d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return G.this.new u(this.f111773c, this.f111774d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(String str, Qo.l lVar, Continuation<? super u> continuation) {
            super(2, continuation);
            this.f111773c = str;
            this.f111774d = lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((u) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111771a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                sp.Y y10 = G.this.productStateRepository;
                String str = this.f111773c;
                Qo.l lVar = this.f111774d;
                boolean z10 = lVar instanceof l.Department;
                String strA = Oo.a.a(lVar);
                this.f111771a = 1;
                if (y10.d1(str, z10, strA, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$itemSelected$4", f = "PLPStateHolder.kt", l = {366}, m = "invokeSuspend")
    static final class v extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111775a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ProductCardDecorator f111777c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return G.this.new v(this.f111777c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(ProductCardDecorator productCardDecorator, Continuation<? super v> continuation) {
            super(2, continuation);
            this.f111777c = productCardDecorator;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((v) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111775a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = G.this._event;
                n.ShowPDPEvent showPDPEvent = new n.ShowPDPEvent(this.f111777c.getProduct());
                this.f111775a = 1;
                if (interfaceC16548A.emit(showPDPEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$loadProducts$1", f = "PLPStateHolder.kt", l = {1684, 1717}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class w extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f111778a;

        /* renamed from: b, reason: collision with root package name */
        Object f111779b;

        /* renamed from: c, reason: collision with root package name */
        Object f111780c;

        /* renamed from: d, reason: collision with root package name */
        Object f111781d;

        /* renamed from: e, reason: collision with root package name */
        Object f111782e;

        /* renamed from: f, reason: collision with root package name */
        Object f111783f;

        /* renamed from: g, reason: collision with root package name */
        int f111784g;

        /* renamed from: h, reason: collision with root package name */
        int f111785h;

        /* renamed from: i, reason: collision with root package name */
        int f111786i;

        /* renamed from: j, reason: collision with root package name */
        int f111787j;

        /* renamed from: k, reason: collision with root package name */
        int f111788k;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Qo.l f111790m;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return G.this.new w(this.f111790m, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(Qo.l lVar, Continuation<? super w> continuation) {
            super(2, continuation);
            this.f111790m = lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((w) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Qo.l lVar;
            G g10;
            Object value;
            Object value2;
            InterfaceC16549B interfaceC16549BL3;
            Object value3;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111788k;
            if (i10 == 0) {
                ResultKt.b(obj);
                B0 b02 = G.this.productQueryPagingDataSource;
                Qo.l lVar2 = this.f111790m;
                this.f111788k = 1;
                objA = b02.a(lVar2, this);
                if (objA != objF) {
                }
                return objF;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lVar = (Qo.l) this.f111783f;
                g10 = (G) this.f111779b;
                ResultKt.b(obj);
                g10.m4(Paginator.b(g10.getPaginator(), 0, 0, 0, 0, false, 15, null));
                interfaceC16549BL3 = g10.l3();
                do {
                    value3 = interfaceC16549BL3.getValue();
                } while (!interfaceC16549BL3.e(value3, lVar.o(false)));
                g10.loadingStatesManager.b(new a.Failed(BuildConfig.DEFAULT_ITEM_SECTION, null, 2, null));
                return Unit.f143329a;
            }
            ResultKt.b(obj);
            objA = obj;
            Qo.l lVar3 = (Qo.l) objA;
            G g11 = G.this;
            if (!lVar3.j() && !lVar3.getIsPending()) {
                InterfaceC16549B interfaceC16549BL32 = g11.l3();
                do {
                    value = interfaceC16549BL32.getValue();
                } while (!interfaceC16549BL32.e(value, lVar3));
                Paginator paginator = g11.getPaginator();
                Qo.l lVarC = lVar3.c();
                g11.m4(Paginator.b(paginator, lVarC != null ? lVarC.getPage() : lVar3.getPage(), 0, lVar3.getTotalPages(), 0, false, 10, null));
                g11.productStateRepository.l1(lVar3);
                boolean z10 = lVar3 instanceof l.Search;
                l.Search search = z10 ? (l.Search) lVar3 : null;
                Integer tokenMatch = search != null ? search.getTokenMatch() : null;
                l.Search search2 = z10 ? (l.Search) lVar3 : null;
                Integer embeddingsMatch = search2 != null ? search2.getEmbeddingsMatch() : null;
                if (tokenMatch != null && embeddingsMatch != null) {
                    g11.I4(tokenMatch.intValue(), embeddingsMatch.intValue());
                }
                InterfaceC16549B interfaceC16549B = g11._viewState;
                do {
                    value2 = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value2, ViewState.c((ViewState) value2, null, lVar3.a(), null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, tokenMatch, embeddingsMatch, null, false, null, null, null, 16383997, null).a()));
                g11.loadingStatesManager.b(new a.NotLoading(BuildConfig.DEFAULT_ITEM_SECTION));
                g11.A4();
            }
            G g12 = G.this;
            Throwable error = lVar3.getError();
            if (error != null) {
                qw.a.INSTANCE.f(lVar3.getError(), "Error loading product query " + lVar3.a(), new Object[0]);
                InterfaceC16548A interfaceC16548A = g12._event;
                AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
                n.ShowError showError = new n.ShowError(companion.d(yr.Q.f171738F, new Object[0]), companion.d(yr.Q.f171737E, new Object[0]), companion.d(yr.Q.f171761b, new Object[0]));
                this.f111778a = lVar3;
                this.f111779b = g12;
                this.f111780c = lVar3;
                this.f111781d = lVar3;
                this.f111782e = error;
                this.f111783f = lVar3;
                this.f111784g = 0;
                this.f111785h = 0;
                this.f111786i = 0;
                this.f111787j = 0;
                this.f111788k = 2;
                if (interfaceC16548A.emit(showError, this) != objF) {
                    lVar = lVar3;
                    g10 = g12;
                    g10.m4(Paginator.b(g10.getPaginator(), 0, 0, 0, 0, false, 15, null));
                    interfaceC16549BL3 = g10.l3();
                    do {
                        value3 = interfaceC16549BL3.getValue();
                    } while (!interfaceC16549BL3.e(value3, lVar.o(false)));
                    g10.loadingStatesManager.b(new a.Failed(BuildConfig.DEFAULT_ITEM_SECTION, null, 2, null));
                }
                return objF;
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$onGetClipCouponResponse$1", f = "PLPStateHolder.kt", l = {537}, m = "invokeSuspend")
    static final class x extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111791a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Coupon f111793c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return G.this.new x(this.f111793c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(Coupon coupon, Continuation<? super x> continuation) {
            super(2, continuation);
            this.f111793c = coupon;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((x) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111791a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = G.this._event;
                n.ClipCouponFailedEvent clipCouponFailedEvent = new n.ClipCouponFailedEvent(Nr.g.f22702n, Nr.g.f22700m, com.meijer.mobile.meijer.Y.f100486Ih, Nr.g.f22664O, this.f111793c);
                this.f111791a = 1;
                if (interfaceC16548A.emit(clipCouponFailedEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$onProductQuery$2", f = "PLPStateHolder.kt", l = {392}, m = "invokeSuspend")
    static final class y extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111794a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Qo.l f111796c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return G.this.new y(this.f111796c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(Qo.l lVar, Continuation<? super y> continuation) {
            super(2, continuation);
            this.f111796c = lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((y) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111794a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = G.this._event;
                n.BubbleFacetsToFilterAndSort bubbleFacetsToFilterAndSort = new n.BubbleFacetsToFilterAndSort((l.k) this.f111796c);
                this.f111794a = 1;
                if (interfaceC16548A.emit(bubbleFacetsToFilterAndSort, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$onProductsState$1", f = "PLPStateHolder.kt", l = {HttpResponseStatus.ERROR_UNPROCESSABLE_ENTITY}, m = "invokeSuspend")
    static final class z extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111797a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<ProductState<ProductFullDetails>> f111799c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f111800d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f111801e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(List<ProductState<ProductFullDetails>> list, String str, String str2, Continuation<? super z> continuation) {
            super(2, continuation);
            this.f111799c = list;
            this.f111800d = str;
            this.f111801e = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return G.this.new z(this.f111799c, this.f111800d, this.f111801e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((z) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String name;
            ProductFullDetails productFullDetails;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111797a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = G.this._event;
                int size = this.f111799c.size();
                ProductState productState = (ProductState) CollectionsKt.u0(this.f111799c);
                if (productState != null && (productFullDetails = (ProductFullDetails) productState.g()) != null) {
                    name = productFullDetails.getName();
                } else {
                    name = null;
                }
                if (name == null) {
                    name = "";
                }
                n.UpdateProductsInfoEvent updateProductsInfoEvent = new n.UpdateProductsInfoEvent(size, name, this.f111800d, this.f111801e);
                this.f111797a = 1;
                if (interfaceC16548A.emit(updateProductsInfoEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Pk.f> L2(EntryChange entryChange) {
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
            Iterator<T> it2 = this.viewState.getValue().f().iterator();
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

    private final AbstractC6392a d3(int freeItemsCount, int rewardItemsCount) {
        return freeItemsCount != 0 ? freeItemsCount != 1 ? freeItemsCount != 2 ? freeItemsCount != 3 ? freeItemsCount != 4 ? freeItemsCount != 5 ? AbstractC6392a.INSTANCE.d(Nr.g.f22667R, new Object[0]) : AbstractC6392a.INSTANCE.d(Nr.g.f22662M, new Object[0]) : AbstractC6392a.INSTANCE.d(Nr.g.f22663N, new Object[0]) : AbstractC6392a.INSTANCE.d(Nr.g.f22725y0, new Object[0]) : AbstractC6392a.INSTANCE.d(Nr.g.f22727z0, new Object[0]) : AbstractC6392a.INSTANCE.d(Nr.g.f22674Y, new Object[0]) : AbstractC6392a.INSTANCE.b(Nr.f.f22639c, rewardItemsCount, new Object[0]);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQo/l;", "it", "", "<anonymous>", "(LQo/l;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.PLPStateHolder$6", f = "PLPStateHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.G$f, reason: case insensitive filesystem */
    static final class C12556f extends SuspendLambda implements Function2<Qo.l, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111601a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f111602b;

        C12556f(Continuation<? super C12556f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12556f c12556f = G.this.new C12556f(continuation);
            c12556f.f111602b = obj;
            return c12556f;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Qo.l lVar, Continuation<? super Unit> continuation) {
            return ((C12556f) create(lVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f111601a == 0) {
                ResultKt.b(obj);
                G.this.U3((Qo.l) this.f111602b);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public G(Tq.j storeProvider, yo.k userManager, zl.k featureManager, sp.Y productStateRepository, il.m cartRepository, Eq.b shoppingListRepository, wr.f cartInteractor, tl.h timeSlotRepository, C13702d couponsRepository, B0 productQueryPagingDataSource, InterfaceC14523a analyticsEngine, Ro.a productAnalytics, C16753b beaconClient, pp.e sponsorshipsDataStore, pp.d productMetadataStore, AbstractC15779K ioDispatcher) {
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(productStateRepository, "productStateRepository");
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(shoppingListRepository, "shoppingListRepository");
        Intrinsics.j(cartInteractor, "cartInteractor");
        Intrinsics.j(timeSlotRepository, "timeSlotRepository");
        Intrinsics.j(couponsRepository, "couponsRepository");
        Intrinsics.j(productQueryPagingDataSource, "productQueryPagingDataSource");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(productAnalytics, "productAnalytics");
        Intrinsics.j(beaconClient, "beaconClient");
        Intrinsics.j(sponsorshipsDataStore, "sponsorshipsDataStore");
        Intrinsics.j(productMetadataStore, "productMetadataStore");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.storeProvider = storeProvider;
        this.userManager = userManager;
        this.featureManager = featureManager;
        this.productStateRepository = productStateRepository;
        this.cartRepository = cartRepository;
        this.shoppingListRepository = shoppingListRepository;
        this.cartInteractor = cartInteractor;
        this.timeSlotRepository = timeSlotRepository;
        this.couponsRepository = couponsRepository;
        this.productQueryPagingDataSource = productQueryPagingDataSource;
        this.analyticsEngine = analyticsEngine;
        this.productAnalytics = productAnalytics;
        this.beaconClient = beaconClient;
        this.sponsorshipsDataStore = sponsorshipsDataStore;
        this.productMetadataStore = productMetadataStore;
        this.ioDispatcher = ioDispatcher;
        this.queryStore = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.C
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return G.c4();
            }
        });
        this._toastMessageData = C16555H.b(0, 0, null, 7, null);
        InterfaceC15783O interfaceC15783OA = C15784P.a(ioDispatcher);
        this.coroutineScope = interfaceC15783OA;
        InterfaceC16549B<Boolean> interfaceC16549BA = pv.S.a(Boolean.FALSE);
        this._stepperClicked = interfaceC16549BA;
        this.stepperClicked = interfaceC16549BA;
        this.carouselTitle = "";
        this.trackingLoadBeacon = new ArrayList();
        this.trackingOnLoadFormatLevelBeacon = new ArrayList();
        this.trackingOnViewFormatLevelBeacon = new ArrayList();
        io.reactivex.l<Tq.k> lVarF = storeProvider.f();
        this.currentStoreStream = lVarF;
        this.cartId = "-1";
        Pj.c cVar = new Pj.c(CollectionsKt.e(new a.Loading(BuildConfig.DEFAULT_ITEM_SECTION, null, 2, null)));
        this.loadingStatesManager = cVar;
        Ju.a aVar = new Ju.a();
        this.disposables = aVar;
        InterfaceC16549B<ViewState> interfaceC16549BA2 = pv.S.a(new ViewState(storeProvider.a(), l3().getValue().a(), null, null, null, null, null, null, null, null, null, new CartPreviewDecorator(userManager.b(), 0), false, null, null, null, null, null, null, null, false, null, null, null, 16775164, null).a());
        this._viewState = interfaceC16549BA2;
        this.viewState = C16563h.c(interfaceC16549BA2);
        this.paginator = new Paginator(0, 0, 0, 0, false, 31, null);
        this._event = C16555H.b(0, 0, null, 7, null);
        Delegates delegates = Delegates.f143781a;
        this.productInQtyStepperInteraction = new H(null, this);
        this.resetStepperState = new I(null, this);
        this.adManagerProvider = new C12689s(featureManager, userManager);
        C16563h.J(C16563h.g(C16563h.O(cVar.a(), new C12552b(this)), new C12553c(null)), interfaceC15783OA);
        G3();
        io.reactivex.l<List<ProductState<ProductFullDetails>>> lVarSubscribeOn = productStateRepository.Y0().subscribeOn(C13889a.b());
        final C12554d c12554d = new C12554d(this);
        Lu.g<? super List<ProductState<ProductFullDetails>>> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.D
            @Override // Lu.g
            public final void accept(Object obj) {
                G.k0(c12554d, obj);
            }
        };
        a.Companion companion = qw.a.INSTANCE;
        final C12555e c12555e = new C12555e(companion);
        Dk.a.a(lVarSubscribeOn.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.E
            @Override // Lu.g
            public final void accept(Object obj) {
                G.m0(c12555e, obj);
            }
        }), aVar);
        C16563h.J(C16563h.g(C16563h.O(C16563h.s(C16563h.c(l3()), new Function2() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.F
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(G.n0((Qo.l) obj, (Qo.l) obj2));
            }
        }), new C12556f(null)), new g(null)), interfaceC15783OA);
        io.reactivex.l<Tq.k> lVarSubscribeOn2 = lVarF.distinctUntilChanged().subscribeOn(C13889a.b());
        final C12557h c12557h = new C12557h(this);
        Lu.g<? super Tq.k> gVar2 = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.f
            @Override // Lu.g
            public final void accept(Object obj) {
                G.o0(c12557h, obj);
            }
        };
        final C12558i c12558i = new C12558i(companion);
        Dk.a.a(lVarSubscribeOn2.subscribe(gVar2, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.g
            @Override // Lu.g
            public final void accept(Object obj) {
                G.r0(c12558i, obj);
            }
        }), aVar);
        T1();
        if (featureManager.e(AbstractC18503f.C18509g.f172878h)) {
            C15809k.d(interfaceC15783OA, null, null, new C12551a(null), 3, null);
        }
        E4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A3(int i10, G g10, ProductCardDecorator productCardDecorator, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("productRank", String.valueOf(i10));
        stageEvent.h("PDPfromsearch", "1");
        Ao.e0.a(g10.sponsorshipsDataStore.a(productCardDecorator.getProduct().getCode()), stageEvent);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A4() {
        ViewState value;
        CartProductListDecorator cartProductListDecorator = this.itemToSubstitute;
        if (cartProductListDecorator != null) {
            l.Search search = this.searchQuery;
            if ((search != null ? search.getTerm() : null) == null || this._viewState.getValue().getShoppingCart() == null) {
                cartProductListDecorator = null;
            }
            if (cartProductListDecorator != null) {
                if ((this._viewState.getValue().getLowStockBackupTracked() ? null : cartProductListDecorator) != null) {
                    this.analyticsEngine.c(C14756c.h("Find Substitution Page: Search"), new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.i
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return G.B4(this.f112320a, (TrackingData) obj);
                        }
                    });
                    Unit unit = Unit.f143329a;
                    InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
                    do {
                        value = interfaceC16549B.getValue();
                    } while (!interfaceC16549B.e(value, ViewState.c(value, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, true, null, null, null, 15728639, null).a()));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B4(G g10, TrackingData submitEvent) {
        ProductFullDetails product;
        List<Entry> listP;
        Intrinsics.j(submitEvent, "$this$submitEvent");
        submitEvent.h("searchMethod", "Search Suggestions");
        l.Search search = g10.searchQuery;
        String code = null;
        submitEvent.h("searchTerm", search != null ? search.getTerm() : null);
        submitEvent.h("numberOfSearchResults", String.valueOf(g10.viewState.getValue().u()));
        submitEvent.h("cartID", g10.cartId);
        ShoppingCart shoppingCart = g10._viewState.getValue().getShoppingCart();
        submitEvent.h("Cart Items Count", String.valueOf((shoppingCart == null || (listP = shoppingCart.p()) == null) ? null : Integer.valueOf(listP.size())));
        CartProductListDecorator cartProductListDecorator = g10.itemToSubstitute;
        if (cartProductListDecorator != null && (product = cartProductListDecorator.getProduct()) != null) {
            code = product.getCode();
        }
        submitEvent.h("productID", code);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C4() {
        ViewState value;
        ViewState viewState;
        ArrayList arrayList;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
            List<ProductListDecorator> listP = viewState.p();
            arrayList = new ArrayList(CollectionsKt.x(listP, 10));
            for (ProductListDecorator productListDecorator : listP) {
                arrayList.add(productListDecorator.u(((-201326593) & 1) != 0 ? productListDecorator.id : null, ((-201326593) & 2) != 0 ? productListDecorator.isSelected : false, ((-201326593) & 4) != 0 ? productListDecorator.upc : null, ((-201326593) & 8) != 0 ? productListDecorator.title : null, ((-201326593) & 16) != 0 ? productListDecorator.hasUnsavedShoppingListItem : false, ((-201326593) & 32) != 0 ? productListDecorator.listItemId : null, ((-201326593) & 64) != 0 ? productListDecorator.thumbnail : null, ((-201326593) & 128) != 0 ? productListDecorator.thumbnailUrl : null, ((-201326593) & 256) != 0 ? productListDecorator.thumbnailDescription : null, ((-201326593) & 512) != 0 ? productListDecorator.department : null, ((-201326593) & 1024) != 0 ? productListDecorator.isOnSale : false, ((-201326593) & RecyclerView.m.FLAG_MOVED) != 0 ? productListDecorator.showWeightInfo : false, ((-201326593) & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? productListDecorator.hasMPerksOffers : false, ((-201326593) & 8192) != 0 ? productListDecorator.currentPrice : null, ((-201326593) & 16384) != 0 ? productListDecorator.regularPrice : null, ((-201326593) & 32768) != 0 ? productListDecorator.weightUnitSizeAndPrice : null, ((-201326593) & 65536) != 0 ? productListDecorator.amountSaved : null, ((-201326593) & 131072) != 0 ? productListDecorator.quantityText : null, ((-201326593) & 262144) != 0 ? productListDecorator.priceGoodThroughDate : null, ((-201326593) & 524288) != 0 ? productListDecorator.isAddedToShoppingList : false, ((-201326593) & 1048576) != 0 ? productListDecorator.errorImageResource : 0, ((-201326593) & 2097152) != 0 ? productListDecorator.shoppingListItem : null, ((-201326593) & 4194304) != 0 ? productListDecorator.product : null, ((-201326593) & 8388608) != 0 ? productListDecorator.cartEntry : null, ((-201326593) & 16777216) != 0 ? productListDecorator.storeAvailability : null, ((-201326593) & 33554432) != 0 ? productListDecorator.cartEligibility : null, ((-201326593) & 67108864) != 0 ? productListDecorator.inQtyStepperInteraction : false, ((-201326593) & 134217728) != 0 ? productListDecorator.resetStepperState : false, ((-201326593) & 268435456) != 0 ? productListDecorator.productQuery : null, ((-201326593) & 536870912) != 0 ? productListDecorator.couponCountDownStateDecorator : null, ((-201326593) & 1073741824) != 0 ? productListDecorator.coupon : null, ((-201326593) & Integer.MIN_VALUE) != 0 ? productListDecorator.complexPromo : null, (511 & 1) != 0 ? productListDecorator.isBuyAgain : false, (511 & 2) != 0 ? productListDecorator.isBopas : false, (511 & 4) != 0 ? productListDecorator.sponsorship : null, (511 & 8) != 0 ? productListDecorator.productRatings : null, (511 & 16) != 0 ? productListDecorator.showQuantityRequested : false, (511 & 32) != 0 ? productListDecorator.quantityRequested : 0, (511 & 64) != 0 ? productListDecorator.currentPriceDescription : null, (511 & 128) != 0 ? productListDecorator.productContainsTag : false, (511 & 256) != 0 ? productListDecorator.regularPriceDescription : null));
            }
        } while (!interfaceC16549B.e(value, ViewState.c(viewState, null, null, null, null, arrayList, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, 16773103, null).a()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void D3(G g10, Qo.l lVar, HashMap map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        if ((i10 & 2) != 0) {
            map = null;
        }
        g10.B3(lVar, map);
    }

    private final void D4(ProductFullDetails product, double quantityToUpdate) {
        wr.f.M(this.cartInteractor, product, quantityToUpdate, false, null, 12, null);
    }

    private final void E3() {
        if (!this.paginator.g() || this.paginator.getIsPaginating()) {
            return;
        }
        this.paginator = Paginator.b(this.paginator, 0, 0, 0, 0, true, 15, null);
        Qo.l lVarC = l3().getValue().c();
        if (lVarC != null) {
            p4(this, lVarC, false, 2, null);
        }
    }

    private final void F1(final Coupon coupon, final String couponLocation) {
        io.reactivex.u<ClipUnclipCouponResponse> uVarK = this.couponsRepository.h(coupon).k(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return G.K1(this.f112375a, coupon, couponLocation, (ClipUnclipCouponResponse) obj);
            }
        };
        Lu.g<? super ClipUnclipCouponResponse> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.u
            @Override // Lu.g
            public final void accept(Object obj) {
                G.N1(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return G.P1(this.f112401a, coupon, (Throwable) obj);
            }
        };
        Dk.a.a(uVarK.o(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.w
            @Override // Lu.g
            public final void accept(Object obj) {
                G.Q1(function12, obj);
            }
        }), this.disposables);
    }

    private final void F3(Qo.l query) {
        this.loadingStatesManager.b(query.n() ? new a.Loading(BuildConfig.DEFAULT_ITEM_SECTION, null, 2, null) : new a.Paging(BuildConfig.DEFAULT_ITEM_SECTION, null, 2, null));
        r2(query);
        C15809k.d(this.coroutineScope, null, null, new w(query, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F4(G g10, Integer num) {
        ViewState value;
        boolean zB;
        InterfaceC16549B<ViewState> interfaceC16549B = g10._viewState;
        do {
            value = interfaceC16549B.getValue();
            zB = g10.userManager.b();
            Intrinsics.g(num);
        } while (!interfaceC16549B.e(value, ViewState.c(value, null, null, null, null, null, null, null, null, null, null, null, new CartPreviewDecorator(zB, num.intValue()), false, null, null, null, null, null, null, null, false, null, null, null, 16775167, null).a()));
        return Unit.f143329a;
    }

    private final void G3() {
        if (this.userManager.b()) {
            wr.f.r(this.cartInteractor, false, new C12560k(), 1, null);
            this.cartInteractor.p();
            b2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I4(int tokenMatchCount, int embeddingsCount) {
        EnumC12707c enumC12707cR1 = R1(tokenMatchCount, embeddingsCount);
        this.loadingStatesManager.b(new a.NotLoading(BuildConfig.DEFAULT_ITEM_SECTION));
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        while (true) {
            ViewState value = interfaceC16549B.getValue();
            InterfaceC16549B<ViewState> interfaceC16549B2 = interfaceC16549B;
            if (interfaceC16549B2.e(value, ViewState.c(value, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, enumC12707cR1, false, null, null, null, 16252927, null).a())) {
                return;
            } else {
                interfaceC16549B = interfaceC16549B2;
            }
        }
    }

    private final CouponState N2(final String productCode, boolean logError) {
        final Map<String, CouponState> mapG = this.viewState.getValue().g();
        try {
            return (CouponState) MapsKt.l(mapG, productCode);
        } catch (NoSuchElementException e10) {
            qw.a.INSTANCE.z("Bug #1517298").u(e10, "Failed to find " + productCode + " in couponStatesMap with keys " + mapG.keySet(), new Object[0]);
            if (!logError) {
                return null;
            }
            this.analyticsEngine.b(C14756c.h("bug:1517289"), new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return G.W2(productCode, mapG, (TrackingData) obj);
                }
            });
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P1(G g10, Coupon coupon, Throwable th2) {
        qw.a.INSTANCE.f(th2, "Failed to clip coupon", new Object[0]);
        C15809k.d(g10.coroutineScope, null, null, g10.new s(coupon, null), 3, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P3(List<? extends Pj.a> loadingStates) {
        ViewState value;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.c(value, null, null, null, Pj.b.a(loadingStates), null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, 16777207, null).a()));
    }

    private final EnumC12707c R1(int tokenMatchCount, int embeddingsCount) {
        return (embeddingsCount <= 0 || tokenMatchCount != 0) ? (embeddingsCount <= 0 || 1 > tokenMatchCount || tokenMatchCount >= 10) ? (embeddingsCount == 0 && tokenMatchCount == 0) ? EnumC12707c.f114099d : EnumC12707c.f114096a : EnumC12707c.f114098c : EnumC12707c.f114097b;
    }

    private final void T1() {
        io.reactivex.u uVarK = C13702d.B(this.couponsRepository, new CouponOptions(null, null, null, false, true, 0L, null, null, false, null, null, false, false, 8175, null), false, false, false, 14, null).k(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return G.V1((CouponsResponse) obj);
            }
        };
        Lu.g gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.q
            @Override // Lu.g
            public final void accept(Object obj) {
                G.W1(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return G.X1((Throwable) obj);
            }
        };
        Dk.a.a(uVarK.o(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.s
            @Override // Lu.g
            public final void accept(Object obj) {
                G.a2(function12, obj);
            }
        }), this.disposables);
    }

    static /* synthetic */ CouponState U2(G g10, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return g10.N2(str, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U3(Qo.l productQuery) {
        ViewState value;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.c(value, null, productQuery.a(), null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, 16773117, null).a()));
        if (productQuery.getIsPending()) {
            F3(productQuery);
        }
        if (productQuery instanceof l.k) {
            C15809k.d(this.coroutineScope, null, null, new y(productQuery, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V1(CouponsResponse couponsResponse) {
        qw.a.INSTANCE.a("Received " + couponsResponse.getCouponCount() + " coupons", new Object[0]);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V3(List<ProductState<ProductFullDetails>> productStates) {
        ViewState value;
        ViewState viewState;
        Tq.k kVarA;
        ArrayList arrayList;
        List listI0;
        LinkedHashMap linkedHashMap;
        List<ProductState<ProductFullDetails>> list = productStates;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((ProductFullDetails) ((ProductState) obj).g()).getStockInfo().e()) {
                arrayList2.add(obj);
            }
        }
        String strB0 = CollectionsKt.B0(arrayList2, ", ", null, null, 0, null, new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return G.W3((ProductState) obj2);
            }
        }, 30, null);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            if (((ProductFullDetails) ((ProductState) obj2).g()).getStockInfo().c()) {
                arrayList3.add(obj2);
            }
        }
        C15809k.d(this.coroutineScope, null, null, new z(productStates, strB0, CollectionsKt.B0(arrayList3, ", ", null, null, 0, null, new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return G.X3((ProductState) obj3);
            }
        }, 30, null), null), 3, null);
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
            kVarA = this.storeProvider.a();
            arrayList = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ProductState productState = (ProductState) it.next();
                CouponState couponState = (CouponState) CollectionsKt.u0(productState.d());
                ProductListDecorator.Companion companion = ProductListDecorator.INSTANCE;
                ProductFullDetails productFullDetails = (ProductFullDetails) productState.g();
                ShoppingListItem shoppingListItem = productState.getShoppingListItem();
                CartEntry cartEntry = productState.getCartEntry();
                String code = productState.getCode();
                EntryInQtyStepperInteraction entryInQtyStepperInteractionG3 = g3();
                Coupon coupon = null;
                boolean zE = Intrinsics.e(code, entryInQtyStepperInteractionG3 != null ? entryInQtyStepperInteractionG3.getResourceId() : null);
                ProductEligibility.a aVarI = productState.getEligibility().i();
                ProductEligibility.a aVarK = (productState.getSponsorship() == null || Intrinsics.e(productState.getEligibility().k(), ProductEligibility.a.l.f167280a)) ? productState.getEligibility().k() : ProductEligibility.a.C2660a.f167269a;
                boolean zE2 = Intrinsics.e(o3(), productState.getCode());
                Qo.l productQuery = productState.getProductQuery();
                CouponCountDownStateDecorator couponCountDownStateDecoratorD = couponState != null ? Qr.a.d(couponState) : null;
                if (couponState != null) {
                    coupon = couponState.getCoupon();
                }
                arrayList.add(ProductListDecorator.Companion.b(companion, productFullDetails, shoppingListItem, null, cartEntry, zE, aVarI, aVarK, zE2, productQuery, couponCountDownStateDecoratorD, coupon, this.productMetadataStore.c(((ProductFullDetails) productState.g()).getCode()), productState.getSponsorship(), productState.getProductRating(), false, 0, 49156, null));
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                CollectionsKt.C(arrayList4, ((ProductState) it2.next()).d());
            }
            listI0 = CollectionsKt.i0(arrayList4);
            HashSet hashSet = new HashSet();
            ArrayList<ProductState> arrayList5 = new ArrayList();
            for (Object obj3 : list) {
                if (hashSet.add(((ProductFullDetails) ((ProductState) obj3).g()).getCode())) {
                    arrayList5.add(obj3);
                }
            }
            linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(arrayList5, 10)), 16));
            for (ProductState productState2 : arrayList5) {
                Pair pairA = TuplesKt.a(((ProductFullDetails) productState2.g()).getCode(), CollectionsKt.u0(productState2.d()));
                linkedHashMap.put(pairA.c(), pairA.d());
            }
        } while (!interfaceC16549B.e(value, ViewState.c(viewState, kVarA, null, null, null, arrayList, listI0, linkedHashMap, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, 16777102, null).a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W2(String str, Map map, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("expectedUpc", str);
        track.h("availableKeys", CollectionsKt.B0(map.keySet(), ",", null, null, 0, null, null, 62, null));
        track.m(TrackingData.a.b.f137705a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence W3(ProductState it) {
        Intrinsics.j(it, "it");
        return it.getCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X1(Throwable th2) {
        qw.a.INSTANCE.f(th2, "Error loading coupons on PLP", new Object[0]);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence X3(ProductState it) {
        Intrinsics.j(it, "it");
        return it.getCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y3() {
        ViewState value;
        ViewState viewState;
        ArrayList arrayList;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
            List<ProductListDecorator> listP = viewState.p();
            arrayList = new ArrayList(CollectionsKt.x(listP, 10));
            for (ProductListDecorator productListDecorator : listP) {
                String upc = productListDecorator.getUpc();
                EntryInQtyStepperInteraction entryInQtyStepperInteractionG3 = g3();
                arrayList.add(productListDecorator.u(((-201326593) & 1) != 0 ? productListDecorator.id : null, ((-201326593) & 2) != 0 ? productListDecorator.isSelected : false, ((-201326593) & 4) != 0 ? productListDecorator.upc : null, ((-201326593) & 8) != 0 ? productListDecorator.title : null, ((-201326593) & 16) != 0 ? productListDecorator.hasUnsavedShoppingListItem : false, ((-201326593) & 32) != 0 ? productListDecorator.listItemId : null, ((-201326593) & 64) != 0 ? productListDecorator.thumbnail : null, ((-201326593) & 128) != 0 ? productListDecorator.thumbnailUrl : null, ((-201326593) & 256) != 0 ? productListDecorator.thumbnailDescription : null, ((-201326593) & 512) != 0 ? productListDecorator.department : null, ((-201326593) & 1024) != 0 ? productListDecorator.isOnSale : false, ((-201326593) & RecyclerView.m.FLAG_MOVED) != 0 ? productListDecorator.showWeightInfo : false, ((-201326593) & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? productListDecorator.hasMPerksOffers : false, ((-201326593) & 8192) != 0 ? productListDecorator.currentPrice : null, ((-201326593) & 16384) != 0 ? productListDecorator.regularPrice : null, ((-201326593) & 32768) != 0 ? productListDecorator.weightUnitSizeAndPrice : null, ((-201326593) & 65536) != 0 ? productListDecorator.amountSaved : null, ((-201326593) & 131072) != 0 ? productListDecorator.quantityText : null, ((-201326593) & 262144) != 0 ? productListDecorator.priceGoodThroughDate : null, ((-201326593) & 524288) != 0 ? productListDecorator.isAddedToShoppingList : false, ((-201326593) & 1048576) != 0 ? productListDecorator.errorImageResource : 0, ((-201326593) & 2097152) != 0 ? productListDecorator.shoppingListItem : null, ((-201326593) & 4194304) != 0 ? productListDecorator.product : null, ((-201326593) & 8388608) != 0 ? productListDecorator.cartEntry : null, ((-201326593) & 16777216) != 0 ? productListDecorator.storeAvailability : null, ((-201326593) & 33554432) != 0 ? productListDecorator.cartEligibility : null, ((-201326593) & 67108864) != 0 ? productListDecorator.inQtyStepperInteraction : Intrinsics.e(upc, entryInQtyStepperInteractionG3 != null ? entryInQtyStepperInteractionG3.getResourceId() : null), ((-201326593) & 134217728) != 0 ? productListDecorator.resetStepperState : Intrinsics.e(o3(), productListDecorator.getUpc()), ((-201326593) & 268435456) != 0 ? productListDecorator.productQuery : null, ((-201326593) & 536870912) != 0 ? productListDecorator.couponCountDownStateDecorator : null, ((-201326593) & 1073741824) != 0 ? productListDecorator.coupon : null, ((-201326593) & Integer.MIN_VALUE) != 0 ? productListDecorator.complexPromo : null, (511 & 1) != 0 ? productListDecorator.isBuyAgain : false, (511 & 2) != 0 ? productListDecorator.isBopas : false, (511 & 4) != 0 ? productListDecorator.sponsorship : null, (511 & 8) != 0 ? productListDecorator.productRatings : null, (511 & 16) != 0 ? productListDecorator.showQuantityRequested : false, (511 & 32) != 0 ? productListDecorator.quantityRequested : 0, (511 & 64) != 0 ? productListDecorator.currentPriceDescription : null, (511 & 128) != 0 ? productListDecorator.productContainsTag : false, (511 & 256) != 0 ? productListDecorator.regularPriceDescription : null));
            }
        } while (!interfaceC16549B.e(value, ViewState.c(viewState, null, null, null, null, arrayList, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, 16777199, null).a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z3(Tq.k storeDetails) {
        ViewState value;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.c(value, storeDetails, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, 16777214, null).a()));
        o4(l3().getValue().g(), true);
    }

    private final void b2() {
        io.reactivex.l<String> lVarSubscribeOn = this.cartRepository.N().subscribeOn(C13889a.b());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return G.c2(this.f112362a, (String) obj);
            }
        };
        Dk.a.a(lVarSubscribeOn.subscribe(new Lu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.y
            @Override // Lu.g
            public final void accept(Object obj) {
                G.g2(function1, obj);
            }
        }), this.disposables);
    }

    private final void b4(nk.i original, ProductFullDetails alternative) {
        if (original != null) {
            C15809k.d(this.coroutineScope, null, null, new B(original, alternative, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC16549B c4() {
        return pv.S.a(new l.Search("", null, null, 0, 0, null, null, 0, null, false, null, null, null, null, null, null, null, null, null, 523774, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d4(Ul.a type, boolean isFormatLevel, nk.c product) {
        C15809k.d(this.coroutineScope, null, null, new C(isFormatLevel, this, type, product, null), 3, null);
    }

    public static /* synthetic */ void f4(G g10, List list, Ul.a aVar, boolean z10, nk.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        g10.e4(list, aVar, z10, cVar);
    }

    private final EntryInQtyStepperInteraction g3() {
        return (EntryInQtyStepperInteraction) this.productInQtyStepperInteraction.getValue(this, f111467T[0]);
    }

    private final void i4(List<String> beacon, Ul.a beaconType, nk.c product) {
        ViewState value;
        ViewState viewState;
        if (this._viewState.getValue().r().containsAll(beacon)) {
            return;
        }
        f4(this, beacon, beaconType, false, product, 4, null);
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
        } while (!interfaceC16549B.e(value, ViewState.c(viewState, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, CollectionsKt.j1(CollectionsKt.P0(viewState.r(), beacon)), null, null, null, false, null, null, null, 16711679, null).a()));
    }

    private final void j2(Pk.c couponIdentity, final TrackingData trackingData) {
        io.reactivex.l<Coupon> lVarObserveOn = this.couponsRepository.k(couponIdentity).take(1L).observeOn(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return G.l2(this.f112443a, trackingData, (Coupon) obj);
            }
        };
        Lu.g<? super Coupon> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.A
            @Override // Lu.g
            public final void accept(Object obj) {
                G.n2(function1, obj);
            }
        };
        final t tVar = new t(qw.a.INSTANCE);
        Dk.a.a(lVarObserveOn.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.B
            @Override // Lu.g
            public final void accept(Object obj) {
                G.q2(tVar, obj);
            }
        }), this.disposables);
    }

    private final void k4(l.k query) {
        if (query instanceof l.Department) {
            Qo.l value = l3().getValue();
            l.Department department = value instanceof l.Department ? (l.Department) value : null;
            if (department != null) {
                l.Department department2 = (l.Department) query;
                if (Intrinsics.e(department.getSelectedSort(), department2.getSelectedSort()) && Intrinsics.e(department.F3(), department2.F3())) {
                    return;
                }
                o4(l.Department.v(department.g(), null, 0, 0, null, null, 0, null, false, null, null, null, null, department2.F3(), department2.getSelectedSort(), null, 20479, null), true);
                return;
            }
            return;
        }
        if (query instanceof l.Search) {
            Qo.l value2 = l3().getValue();
            l.Search search = value2 instanceof l.Search ? (l.Search) value2 : null;
            if (search != null) {
                l.Search search2 = (l.Search) query;
                if (Intrinsics.e(search.getSelectedSort(), search2.getSelectedSort()) && Intrinsics.e(search.F3(), search2.F3())) {
                    return;
                }
                o4(l.Search.v(search.g(), null, null, null, 0, 0, null, null, 0, null, false, null, null, search2.F3(), search2.getSelectedSort(), null, null, null, null, null, 511999, null), true);
                return;
            }
            return;
        }
        if (query instanceof l.BrowseCollection) {
            Qo.l value3 = l3().getValue();
            l.BrowseCollection browseCollection = value3 instanceof l.BrowseCollection ? (l.BrowseCollection) value3 : null;
            if (browseCollection != null) {
                l.BrowseCollection browseCollection2 = (l.BrowseCollection) query;
                if (Intrinsics.e(browseCollection.getSelectedSort(), browseCollection2.getSelectedSort()) && Intrinsics.e(browseCollection.F3(), browseCollection2.F3())) {
                    return;
                }
                o4(l.BrowseCollection.v(browseCollection.g(), null, 0, 0, null, null, 0, null, false, null, null, null, browseCollection2.F3(), browseCollection2.getSelectedSort(), null, null, 26623, null), true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC16549B<Qo.l> l3() {
        return (InterfaceC16549B) this.queryStore.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n0(Qo.l q12, Qo.l q22) {
        Intrinsics.j(q12, "q1");
        Intrinsics.j(q22, "q2");
        return Intrinsics.e(q12.a(), q22.a());
    }

    private final void n4(EntryInQtyStepperInteraction entryInQtyStepperInteraction) {
        this.productInQtyStepperInteraction.setValue(this, f111467T[0], entryInQtyStepperInteraction);
    }

    private final String o3() {
        return (String) this.resetStepperState.getValue(this, f111467T[1]);
    }

    private final ProductListDecorator p3() {
        Object next;
        Iterator<T> it = this._viewState.getValue().p().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ProductListDecorator) next).getIsSelected()) {
                break;
            }
        }
        return (ProductListDecorator) next;
    }

    public static /* synthetic */ void p4(G g10, Qo.l lVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        g10.o4(lVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q4(String str) {
        this.resetStepperState.setValue(this, f111467T[1], str);
    }

    private final void r2(Qo.l query) {
        String term;
        if (query instanceof l.Department) {
            term = ((l.Department) query).getDepartment().getId();
        } else if (!(query instanceof l.Search)) {
            return;
        } else {
            term = ((l.Search) query).getTerm();
        }
        if (term.length() <= 0 || !query.n()) {
            return;
        }
        C15809k.d(this.coroutineScope, null, null, new u(term, query, null), 3, null);
    }

    public static /* synthetic */ void s4(G g10, String str, boolean z10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        g10.r4(str, z10, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean t4(uk.c<EntryChange> entryChange) {
        Entry entry;
        ProductFullDetails productFullDetailsM;
        EntryChange entryChangeA = entryChange.a();
        CouponState couponStateN2 = N2((entryChangeA == null || (entry = entryChangeA.getEntry()) == null || (productFullDetailsM = entry.m()) == null) ? null : productFullDetailsM.getCode(), true);
        if (couponStateN2 == null || !(couponStateN2.getCoupon().getEarnCondition() instanceof Coupon.c.Buy) || !(couponStateN2.getCoupon().getReward() instanceof Coupon.e.Free) || !couponStateN2.getCoupon().x()) {
            return false;
        }
        Integer numV2 = v2(couponStateN2, entryChange);
        if (numV2 != null) {
            C15809k.d(this.coroutineScope, null, null, new E(d3(numV2.intValue(), (int) couponStateN2.getCoupon().getReward().getValue()), null), 3, null);
            return true;
        }
        C15809k.d(this.coroutineScope, null, null, new F(null), 3, null);
        return false;
    }

    private final void u4(CouponState couponState, Coupon clippedCoupon) {
        double actualQuantity;
        List<Entry> listP;
        if (couponState != null && (couponState.getCoupon().getEarnCondition() instanceof Coupon.c.Buy) && (couponState.getCoupon().getReward() instanceof Coupon.e.Free)) {
            ShoppingCart shoppingCart = this.viewState.getValue().getShoppingCart();
            if (shoppingCart == null || (listP = shoppingCart.p()) == null) {
                actualQuantity = 0.0d;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listP) {
                    List<Long> listO = ((Entry) obj).m().o();
                    if (listO != null) {
                        Long l10 = (Long) CollectionsKt.u0(listO);
                        long offerId = clippedCoupon.getOfferId();
                        if (l10 != null && l10.longValue() == offerId) {
                            arrayList.add(obj);
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                actualQuantity = 0.0d;
                while (it.hasNext()) {
                    actualQuantity += ((Entry) it.next()).getActualQuantity();
                }
            }
            if (couponState.getProgress().d()) {
                Double dValueOf = Double.valueOf((couponState.getCoupon().getReward().getValue() + couponState.getCoupon().getEarnCondition().getGoal()) - actualQuantity);
                if (dValueOf.doubleValue() < 0.0d) {
                    dValueOf = null;
                }
                if (dValueOf != null) {
                    C15809k.d(this.coroutineScope, null, null, new C1713G(d3((int) dValueOf.doubleValue(), (int) couponState.getCoupon().getReward().getValue()), null), 3, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w4(nk.i original, nk.f alternative) {
        ProductFullDetails productFullDetailsA;
        StockInfo stockInfo;
        nk.f product;
        ProductFullDetails productFullDetailsA2;
        nk.b price;
        List<Entry> listP;
        InterfaceC14523a interfaceC14523a = this.analyticsEngine;
        Ao.S s10 = Ao.S.f1688a;
        Boolean boolValueOf = null;
        String strG2 = original != null ? original.g2() : null;
        String code = alternative != null ? alternative.getCode() : null;
        l.Search search = this.searchQuery;
        String term = search != null ? search.getTerm() : null;
        String str = this.searchMethod;
        String str2 = this.cartId;
        ShoppingCart shoppingCart = this._viewState.getValue().getShoppingCart();
        String strValueOf = String.valueOf((shoppingCart == null || (listP = shoppingCart.p()) == null) ? null : Integer.valueOf(listP.size()));
        Double dValueOf = original != null ? Double.valueOf(original.getQuantity()) : null;
        Double dValueOf2 = (original == null || (product = original.getProduct()) == null || (productFullDetailsA2 = Co.l.a(product)) == null || (price = productFullDetailsA2.getPrice()) == null) ? null : Double.valueOf(price.getValue() * original.getQuantity());
        if (alternative != null && (productFullDetailsA = Co.l.a(alternative)) != null && (stockInfo = productFullDetailsA.getStockInfo()) != null) {
            boolValueOf = Boolean.valueOf(stockInfo.c());
        }
        interfaceC14523a.k(s10.d("product search page", strG2, code, term, str, str2, strValueOf, dValueOf, dValueOf2, boolValueOf));
    }

    private final void x4(final Coupon coupon, final String couponLocation) {
        Object next;
        Coupon coupon2;
        Iterator<T> it = this.viewState.getValue().f().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            CouponState couponState = (CouponState) next;
            if (couponState != null && (coupon2 = couponState.getCoupon()) != null && coupon2.getOfferId() == coupon.getOfferId()) {
                break;
            }
        }
        final CouponState couponState2 = (CouponState) next;
        u4(couponState2, coupon);
        this.analyticsEngine.b(C14756c.a("coupon clip"), new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return G.y4(this.f112436a, coupon, couponLocation, couponState2, (TrackingData) obj);
            }
        });
    }

    private final void y3(final ProductCardDecorator itemClicked, Pp.b searchType, int position) {
        ViewState value;
        ViewState viewState;
        ArrayList arrayList;
        Pp.b bVar = Pp.b.f26240c;
        if (searchType == bVar || searchType == Pp.b.f26241d) {
            if (searchType == bVar || searchType == Pp.b.f26241d) {
                InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
                do {
                    value = interfaceC16549B.getValue();
                    viewState = value;
                    List<ProductListDecorator> listP = viewState.p();
                    arrayList = new ArrayList(CollectionsKt.x(listP, 10));
                    for (ProductListDecorator productListDecorator : listP) {
                        arrayList.add(productListDecorator.u(((-201326593) & 1) != 0 ? productListDecorator.id : null, ((-201326593) & 2) != 0 ? productListDecorator.isSelected : Intrinsics.e(productListDecorator.getProduct().getEan(), itemClicked.getProduct().getEan()), ((-201326593) & 4) != 0 ? productListDecorator.upc : null, ((-201326593) & 8) != 0 ? productListDecorator.title : null, ((-201326593) & 16) != 0 ? productListDecorator.hasUnsavedShoppingListItem : false, ((-201326593) & 32) != 0 ? productListDecorator.listItemId : null, ((-201326593) & 64) != 0 ? productListDecorator.thumbnail : null, ((-201326593) & 128) != 0 ? productListDecorator.thumbnailUrl : null, ((-201326593) & 256) != 0 ? productListDecorator.thumbnailDescription : null, ((-201326593) & 512) != 0 ? productListDecorator.department : null, ((-201326593) & 1024) != 0 ? productListDecorator.isOnSale : false, ((-201326593) & RecyclerView.m.FLAG_MOVED) != 0 ? productListDecorator.showWeightInfo : false, ((-201326593) & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? productListDecorator.hasMPerksOffers : false, ((-201326593) & 8192) != 0 ? productListDecorator.currentPrice : null, ((-201326593) & 16384) != 0 ? productListDecorator.regularPrice : null, ((-201326593) & 32768) != 0 ? productListDecorator.weightUnitSizeAndPrice : null, ((-201326593) & 65536) != 0 ? productListDecorator.amountSaved : null, ((-201326593) & 131072) != 0 ? productListDecorator.quantityText : null, ((-201326593) & 262144) != 0 ? productListDecorator.priceGoodThroughDate : null, ((-201326593) & 524288) != 0 ? productListDecorator.isAddedToShoppingList : false, ((-201326593) & 1048576) != 0 ? productListDecorator.errorImageResource : 0, ((-201326593) & 2097152) != 0 ? productListDecorator.shoppingListItem : null, ((-201326593) & 4194304) != 0 ? productListDecorator.product : null, ((-201326593) & 8388608) != 0 ? productListDecorator.cartEntry : null, ((-201326593) & 16777216) != 0 ? productListDecorator.storeAvailability : null, ((-201326593) & 33554432) != 0 ? productListDecorator.cartEligibility : null, ((-201326593) & 67108864) != 0 ? productListDecorator.inQtyStepperInteraction : false, ((-201326593) & 134217728) != 0 ? productListDecorator.resetStepperState : false, ((-201326593) & 268435456) != 0 ? productListDecorator.productQuery : null, ((-201326593) & 536870912) != 0 ? productListDecorator.couponCountDownStateDecorator : null, ((-201326593) & 1073741824) != 0 ? productListDecorator.coupon : null, ((-201326593) & Integer.MIN_VALUE) != 0 ? productListDecorator.complexPromo : null, (511 & 1) != 0 ? productListDecorator.isBuyAgain : false, (511 & 2) != 0 ? productListDecorator.isBopas : false, (511 & 4) != 0 ? productListDecorator.sponsorship : null, (511 & 8) != 0 ? productListDecorator.productRatings : null, (511 & 16) != 0 ? productListDecorator.showQuantityRequested : false, (511 & 32) != 0 ? productListDecorator.quantityRequested : 0, (511 & 64) != 0 ? productListDecorator.currentPriceDescription : null, (511 & 128) != 0 ? productListDecorator.productContainsTag : false, (511 & 256) != 0 ? productListDecorator.regularPriceDescription : null));
                    }
                } while (!interfaceC16549B.e(value, ViewState.c(viewState, null, null, null, null, arrayList, null, null, null, null, null, null, null, true, null, null, null, null, null, null, null, false, null, null, null, 16773103, null).a()));
                return;
            }
            return;
        }
        if (g3() != null) {
            n4(null);
            return;
        }
        int i10 = 0;
        this.analyticsEngine.h(C14756c.a("event: search: product detail"), C14756c.c("mperks: search"), C14756c.g("search"));
        Iterator<ProductListDecorator> it = this.viewState.getValue().p().iterator();
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (Intrinsics.e(it.next().getProduct().getCode(), itemClicked.getProduct().getCode())) {
                break;
            } else {
                i10++;
            }
        }
        Integer numValueOf = Integer.valueOf(i10);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            final int iIntValue = Integer.valueOf(numValueOf.intValue() + 1).intValue();
            this.analyticsEngine.g(C14756c.h("Product Details Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return G.A3(iIntValue, this, itemClicked, (TrackingData) obj);
                }
            });
            this.analyticsEngine.k(C2898u.f1904a.h0(iIntValue));
        }
        this.productAnalytics.j(itemClicked.getProductQuery(), itemClicked.getProduct(), position);
        C15809k.d(this.coroutineScope, null, null, new v(itemClicked, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y4(G g10, Coupon coupon, String str, CouponState couponState, TrackingData track) {
        CouponState.b progress;
        Intrinsics.j(track, "$this$track");
        track.n(g10.B2());
        track.v(g10.A2());
        Rk.b bVar = Rk.b.f33418a;
        track.c(bVar.e(coupon));
        track.c(bVar.h(str));
        boolean z10 = false;
        if (couponState != null && (progress = couponState.getProgress()) != null && progress.d()) {
            z10 = true;
        }
        track.c(bVar.c(z10));
        return Unit.f143329a;
    }

    private final void z4(String event) {
        this.analyticsEngine.h(C14756c.a(event), C14756c.c("menu"), C14756c.g("menu"));
    }

    public final void B3(Qo.l initialProductQuery, HashMap<String, String> departmentBreadcrumbs) {
        ViewState value;
        C12687q c12687q;
        l.BrowseCollection browseCollection;
        AbstractC18503f.C c10;
        GoogleAdData googleAdDataA;
        EnumC14378f enumC14378f;
        ViewState value2;
        l.Search search;
        EnumC14378f enumC14378f2;
        GoogleAdData googleAdDataA2;
        InterfaceC12688r interfaceC12688r;
        EnumC14378f enumC14378f3;
        Integer num = 2;
        Integer num2 = 1;
        if (initialProductQuery instanceof l.Department) {
            InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
            while (true) {
                ViewState value3 = interfaceC16549B.getValue();
                C12687q c12687q2 = C12687q.f113757a;
                l.Department department = (l.Department) initialProductQuery;
                GoogleAdData googleAdDataC = C12687q.c(c12687q2, EnumC14378f.f134255d, department, departmentBreadcrumbs, true, this.userManager.y(), null, 32, null);
                EnumC14378f enumC14378f4 = EnumC14378f.f134258g;
                Integer num3 = num2;
                num2 = num3;
                InterfaceC16549B<ViewState> interfaceC16549B2 = interfaceC16549B;
                Integer num4 = num;
                num = num4;
                if (interfaceC16549B2.e(value3, ViewState.c(value3, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, googleAdDataC, c12687q2.b(enumC14378f4, department, departmentBreadcrumbs, true, this.userManager.y(), num3), c12687q2.b(enumC14378f4, department, departmentBreadcrumbs, true, this.userManager.y(), num4), 2097151, null).a())) {
                    break;
                } else {
                    interfaceC16549B = interfaceC16549B2;
                }
            }
        }
        if (initialProductQuery instanceof l.Search) {
            InterfaceC16549B<ViewState> interfaceC16549B3 = this._viewState;
            do {
                value2 = interfaceC16549B3.getValue();
                InterfaceC12688r interfaceC12688r2 = this.adManagerProvider;
                search = (l.Search) initialProductQuery;
                EnumC14378f enumC14378f5 = EnumC14378f.f134255d;
                enumC14378f2 = EnumC14378f.f134260i;
                googleAdDataA2 = interfaceC12688r2.a(search, 1, enumC14378f5, enumC14378f2);
                interfaceC12688r = this.adManagerProvider;
                enumC14378f3 = EnumC14378f.f134258g;
            } while (!interfaceC16549B3.e(value2, ViewState.c(value2, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, googleAdDataA2, interfaceC12688r.a(search, 2, enumC14378f3, enumC14378f2), this.adManagerProvider.a(search, 3, enumC14378f3, enumC14378f2), 2097151, null).a()));
        }
        if (initialProductQuery instanceof l.BrowseCollection) {
            InterfaceC16549B<ViewState> interfaceC16549B4 = this._viewState;
            do {
                value = interfaceC16549B4.getValue();
                c12687q = C12687q.f113757a;
                EnumC14378f enumC14378f6 = EnumC14378f.f134255d;
                browseCollection = (l.BrowseCollection) initialProductQuery;
                zl.k kVar = this.featureManager;
                c10 = AbstractC18503f.C.f172844h;
                googleAdDataA = c12687q.a(enumC14378f6, browseCollection, kVar.e(c10), this.userManager.y(), num2);
                enumC14378f = EnumC14378f.f134258g;
            } while (!interfaceC16549B4.e(value, ViewState.c(value, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, googleAdDataA, c12687q.a(enumC14378f, browseCollection, this.featureManager.e(c10), this.userManager.y(), num), c12687q.a(enumC14378f, browseCollection, this.featureManager.e(c10), this.userManager.y(), 3), 2097151, null).a()));
        }
    }

    /* renamed from: D2, reason: from getter */
    public final String getCmpid() {
        return this.cmpid;
    }

    public final void E4() {
        if (this.userManager.b()) {
            C15809k.d(this.coroutineScope, null, null, new K(null), 3, null);
            io.reactivex.l<Integer> lVarSubscribeOn = this.cartRepository.Q().subscribeOn(C13889a.b());
            final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return G.F4(this.f112336a, (Integer) obj);
                }
            };
            Lu.g<? super Integer> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.k
                @Override // Lu.g
                public final void accept(Object obj) {
                    G.G4(function1, obj);
                }
            };
            final L l10 = new L(qw.a.INSTANCE);
            Dk.a.a(lVarSubscribeOn.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.l
                @Override // Lu.g
                public final void accept(Object obj) {
                    G.H4(l10, obj);
                }
            }), this.disposables);
        }
    }

    /* renamed from: H2, reason: from getter */
    public final String getCollectionName() {
        return this.collectionName;
    }

    public final W.ComplexPromo J2(String productCode) {
        Object next;
        String promoText;
        Iterator<T> it = this.viewState.getValue().p().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.e(((ProductListDecorator) next).getProduct().getCode(), productCode)) {
                break;
            }
        }
        ProductListDecorator productListDecorator = (ProductListDecorator) next;
        ProductFullDetails product = productListDecorator != null ? productListDecorator.getProduct() : null;
        if (product == null || (promoText = product.getPromoText()) == null) {
            return null;
        }
        Double promoId = product.getPromoId();
        return new W.ComplexPromo(promoId != null ? Long.valueOf((long) promoId.doubleValue()) : null, promoText);
    }

    public void K3(Qk.a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.Clip) {
            a.Clip clip = (a.Clip) action;
            j2(clip.getCoupon(), clip.getTrackingData());
        } else if (!(action instanceof a.NotInterested) && !(action instanceof a.Unclip) && !(action instanceof a.ViewCouponDetails) && !(action instanceof a.ViewCouponList)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void M3(AbstractC12559j action) {
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC12559j.h) {
            G3();
            return;
        }
        if (action instanceof AbstractC12559j.a) {
            CartProductListDecorator cartProductListDecorator = this.itemToSubstitute;
            ProductListDecorator productListDecoratorP3 = p3();
            b4(cartProductListDecorator, productListDecoratorP3 != null ? productListDecoratorP3.getProduct() : null);
            return;
        }
        if (action instanceof AbstractC12559j.ItemSelectedAction) {
            AbstractC12559j.ItemSelectedAction itemSelectedAction = (AbstractC12559j.ItemSelectedAction) action;
            y3(itemSelectedAction.getSelectedItem(), itemSelectedAction.getSearchType(), itemSelectedAction.getPosition());
            return;
        }
        if (action instanceof AbstractC12559j.ViewProductDetailsAction) {
            AbstractC12559j.ViewProductDetailsAction viewProductDetailsAction = (AbstractC12559j.ViewProductDetailsAction) action;
            a4(viewProductDetailsAction.getProduct(), viewProductDetailsAction.getQuery(), viewProductDetailsAction.getPosition());
            return;
        }
        if (action instanceof AbstractC12559j.f) {
            E3();
            return;
        }
        if (action instanceof AbstractC12559j.UpdateEntryAction) {
            AbstractC12559j.UpdateEntryAction updateEntryAction = (AbstractC12559j.UpdateEntryAction) action;
            D4(updateEntryAction.getProduct(), updateEntryAction.getQuantityToUpdate());
            return;
        }
        if (action instanceof AbstractC12559j.UserAcceptAddToCartAction) {
            wr.f.B(this.cartInteractor, new AbstractC17440a.Accept(((AbstractC12559j.UserAcceptAddToCartAction) action).getCartUpdateRequest(), null, null, 4, null), false, null, 6, null);
            return;
        }
        if (action instanceof AbstractC12559j.CollapseQuantityStepperAction) {
            EntryInQtyStepperInteraction entryInQtyStepperInteractionG3 = g3();
            if (entryInQtyStepperInteractionG3 != null) {
                AbstractC12559j.CollapseQuantityStepperAction collapseQuantityStepperAction = (AbstractC12559j.CollapseQuantityStepperAction) action;
                if (entryInQtyStepperInteractionG3.getStepperHitRect().contains(collapseQuantityStepperAction.getTouchX(), collapseQuantityStepperAction.getTouchY()) || g3() == null) {
                    return;
                }
                n4(null);
                return;
            }
            return;
        }
        if (action instanceof AbstractC12559j.b) {
            n4(null);
            return;
        }
        if (action instanceof AbstractC12559j.StepperStateChangedAction) {
            AbstractC12559j.StepperStateChangedAction stepperStateChangedAction = (AbstractC12559j.StepperStateChangedAction) action;
            n4(new EntryInQtyStepperInteraction(stepperStateChangedAction.getProductCode(), stepperStateChangedAction.getStepperHitRect(), false));
            q4(null);
            return;
        }
        if (action instanceof AbstractC12559j.ResetActiveStepper) {
            q4(((AbstractC12559j.ResetActiveStepper) action).getResourceId());
            return;
        }
        if (action instanceof AbstractC12559j.SetFilterAndSortOptions) {
            k4(((AbstractC12559j.SetFilterAndSortOptions) action).getQuery());
            return;
        }
        if (action instanceof AbstractC12559j.SendTitle) {
            this.carouselTitle = ((AbstractC12559j.SendTitle) action).getTitle();
            return;
        }
        boolean z10 = action instanceof AbstractC12559j.SendCriteoClickBeacon;
        if (z10) {
            AbstractC12559j.SendCriteoClickBeacon sendCriteoClickBeacon = (AbstractC12559j.SendCriteoClickBeacon) action;
            g4(sendCriteoClickBeacon.a(), sendCriteoClickBeacon.getFormatLevelBeacon(), sendCriteoClickBeacon.getBeaconType(), sendCriteoClickBeacon.getProduct());
            return;
        }
        if (action instanceof AbstractC12559j.p) {
            v4(true);
            return;
        }
        if (action instanceof AbstractC12559j.SendCriteoQtyStepperBeacon) {
            AbstractC12559j.SendCriteoQtyStepperBeacon sendCriteoQtyStepperBeacon = (AbstractC12559j.SendCriteoQtyStepperBeacon) action;
            i4(sendCriteoQtyStepperBeacon.a(), sendCriteoQtyStepperBeacon.getBeaconType(), sendCriteoQtyStepperBeacon.getProduct());
            return;
        }
        if (action instanceof AbstractC12559j.SendCriteoViewBeacon) {
            AbstractC12559j.SendCriteoViewBeacon sendCriteoViewBeacon = (AbstractC12559j.SendCriteoViewBeacon) action;
            j4(sendCriteoViewBeacon.a(), sendCriteoViewBeacon.getFormatLevelBeacon(), sendCriteoViewBeacon.getBeaconType(), sendCriteoViewBeacon.getProduct());
            return;
        }
        if (action instanceof AbstractC12559j.SendCriteoLoadBeacon) {
            AbstractC12559j.SendCriteoLoadBeacon sendCriteoLoadBeacon = (AbstractC12559j.SendCriteoLoadBeacon) action;
            h4(sendCriteoLoadBeacon.getBeacon(), sendCriteoLoadBeacon.getFormatLevelBeacon(), sendCriteoLoadBeacon.getBeaconType(), sendCriteoLoadBeacon.getProduct());
        } else if (z10) {
            AbstractC12559j.SendCriteoClickBeacon sendCriteoClickBeacon2 = (AbstractC12559j.SendCriteoClickBeacon) action;
            g4(sendCriteoClickBeacon2.a(), sendCriteoClickBeacon2.getFormatLevelBeacon(), sendCriteoClickBeacon2.getBeaconType(), sendCriteoClickBeacon2.getProduct());
        } else {
            if (!(action instanceof AbstractC12559j.GoogleAdClicked)) {
                throw new NoWhenBranchMatchedException();
            }
            this.analyticsEngine.k(C14375c.b(((AbstractC12559j.GoogleAdClicked) action).getAnalytics(), "product search page"));
        }
    }

    /* renamed from: Z2, reason: from getter */
    public final String getDepartmentCarouselAnalytics() {
        return this.departmentCarouselAnalytics;
    }

    public final InterfaceC16553F<n> b3() {
        return C16563h.b(this._event);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.disposables.d();
        C15784P.e(this.coroutineScope, "PLPStateHolder Destroyed", null, 2, null);
    }

    public final void e4(List<String> beacon, Ul.a type, boolean isFormatLevel, nk.c product) {
        Intrinsics.j(beacon, "beacon");
        C15809k.d(this.coroutineScope, this.ioDispatcher, null, new D(beacon, isFormatLevel, type, this, product, null), 2, null);
    }

    /* renamed from: f3, reason: from getter */
    public final Paginator getPaginator() {
        return this.paginator;
    }

    public final void g4(List<String> beacon, String formatLevelBeacon, Ul.a beaconType, nk.c product) {
        ViewState value;
        ViewState viewState;
        Intrinsics.j(beacon, "beacon");
        Intrinsics.j(formatLevelBeacon, "formatLevelBeacon");
        if (this._viewState.getValue().e().containsAll(beacon)) {
            return;
        }
        f4(this, beacon, beaconType, false, product, 4, null);
        e4(CollectionsKt.e(formatLevelBeacon), beaconType, true, product);
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
        } while (!interfaceC16549B.e(value, ViewState.c(viewState, null, null, null, null, null, null, null, null, null, null, null, null, false, CollectionsKt.j1(CollectionsKt.P0(viewState.e(), beacon)), null, null, null, null, null, null, false, null, null, null, 16769023, null).a()));
    }

    public final void h4(String beacon, String formatLevelBeacon, Ul.a beaconType, nk.c product) {
        ViewState value;
        Intrinsics.j(beacon, "beacon");
        Intrinsics.j(formatLevelBeacon, "formatLevelBeacon");
        if (StringsKt.s0(beacon) || this.trackingLoadBeacon.contains(beacon)) {
            return;
        }
        f4(this, CollectionsKt.e(beacon), beaconType, false, product, 4, null);
        this.trackingLoadBeacon.add(beacon);
        if (!StringsKt.s0(formatLevelBeacon) && !this.trackingOnLoadFormatLevelBeacon.contains(formatLevelBeacon)) {
            e4(CollectionsKt.e(formatLevelBeacon), beaconType, true, product);
            this.trackingOnLoadFormatLevelBeacon.add(formatLevelBeacon);
        }
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.c(value, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, this.trackingLoadBeacon, null, null, null, null, false, null, null, null, 16744447, null).a()));
    }

    public final void j4(List<String> beacon, String formatLevelBeacon, Ul.a beaconType, nk.c product) {
        ViewState value;
        ViewState viewState;
        Intrinsics.j(beacon, "beacon");
        Intrinsics.j(formatLevelBeacon, "formatLevelBeacon");
        if (this._viewState.getValue().v().containsAll(beacon)) {
            return;
        }
        f4(this, beacon, beaconType, false, product, 4, null);
        if (!StringsKt.s0(formatLevelBeacon) && !this.trackingOnViewFormatLevelBeacon.contains(formatLevelBeacon)) {
            e4(CollectionsKt.e(formatLevelBeacon), beaconType, true, product);
            this.trackingOnViewFormatLevelBeacon.add(formatLevelBeacon);
        }
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
        } while (!interfaceC16549B.e(value, ViewState.c(viewState, null, null, null, null, null, null, null, null, null, null, null, null, false, null, CollectionsKt.j1(CollectionsKt.P0(viewState.v(), beacon)), null, null, null, null, null, false, null, null, null, 16760831, null).a()));
    }

    public final void l4(CartProductListDecorator item) {
        this.itemToSubstitute = item;
    }

    public final void m4(Paginator paginator) {
        Intrinsics.j(paginator, "<set-?>");
        this.paginator = paginator;
    }

    public final void o4(Qo.l query, boolean forceRefresh) {
        Intrinsics.j(query, "query");
        if (!forceRefresh && Intrinsics.e(query.g(), l3().getValue().g())) {
            InterfaceC16549B<Qo.l> interfaceC16549BL3 = l3();
            while (!interfaceC16549BL3.e(interfaceC16549BL3.getValue(), query)) {
            }
        } else {
            this.paginator = Paginator.b(this.paginator, 0, 0, 1, 0, false, 10, null);
            this.productStateRepository.i1(query);
            InterfaceC16549B<Qo.l> interfaceC16549BL32 = l3();
            while (!interfaceC16549BL32.e(interfaceC16549BL32.getValue(), query.g())) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r4(java.lang.String r25, boolean r26, java.lang.String r27) {
        /*
            r24 = this;
            r0 = r24
            r2 = r25
            java.lang.String r1 = "term"
            kotlin.jvm.internal.Intrinsics.j(r2, r1)
            pv.B r1 = r0.l3()
            java.lang.Object r1 = r1.getValue()
            boolean r3 = r1 instanceof Qo.l.Search
            r4 = 0
            if (r3 == 0) goto L19
            Qo.l$i r1 = (Qo.l.Search) r1
            goto L1a
        L19:
            r1 = r4
        L1a:
            r0.searchQuery = r1
            r3 = r27
            r0.searchMethod = r3
            if (r26 != 0) goto L32
            if (r1 == 0) goto L29
            java.lang.String r1 = r1.getTerm()
            goto L2a
        L29:
            r1 = r4
        L2a:
            boolean r1 = kotlin.jvm.internal.Intrinsics.e(r2, r1)
            if (r1 != 0) goto L31
            goto L32
        L31:
            return
        L32:
            Qo.l$i r1 = r0.searchQuery
            if (r1 == 0) goto L7a
            Qo.l$i r1 = r1.g()
            if (r1 == 0) goto L7a
            java.util.List r13 = kotlin.collections.CollectionsKt.m()
            java.util.List r12 = kotlin.collections.CollectionsKt.m()
            r21 = 508926(0x7c3fe, float:7.13157E-40)
            r22 = 0
            r3 = 0
            r5 = r4
            r4 = 0
            r6 = r5
            r5 = 0
            r7 = r6
            r6 = 0
            r8 = r7
            r7 = 0
            r9 = r8
            r8 = 0
            r10 = r9
            r9 = 0
            r11 = r10
            r10 = 0
            r14 = r11
            r11 = 0
            r15 = r14
            r14 = 0
            r16 = r15
            r15 = 0
            r17 = r16
            r16 = 0
            r18 = r17
            r17 = 0
            r19 = r18
            r18 = 0
            r20 = r19
            r19 = 0
            r23 = r20
            r20 = 0
            Qo.l$i r1 = Qo.l.Search.v(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            if (r1 == 0) goto L7a
            goto L9d
        L7a:
            Qo.l$i r1 = new Qo.l$i
            r21 = 524286(0x7fffe, float:7.34681E-40)
            r22 = 0
            r3 = 0
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
            r18 = 0
            r19 = 0
            r20 = 0
            r2 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L9d:
            r2 = 0
            r3 = 2
            r5 = 0
            p4(r0, r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.personalized.modals.G.r4(java.lang.String, boolean, java.lang.String):void");
    }

    public final boolean t3(String productCode) {
        if (productCode == null) {
            return false;
        }
        for (ProductListDecorator productListDecorator : this.viewState.getValue().p()) {
            if (Intrinsics.e(productListDecorator.getProduct().getCode(), productCode)) {
                return productListDecorator.getProduct().getIsSponsoredCriteo();
            }
        }
        return false;
    }

    public final pv.P<ViewState> v3() {
        return this.viewState;
    }

    /* renamed from: w2, reason: from getter */
    public final String getCampaignIdValue() {
        return this.campaignIdValue;
    }

    /* renamed from: z2, reason: from getter */
    public final String getCarouselTitleAnalytics() {
        return this.carouselTitleAnalytics;
    }

    private final String A2() {
        Qo.l value = l3().getValue();
        if (value instanceof l.Search) {
            return "search";
        }
        if (value instanceof l.Department) {
            return "category";
        }
        if (value instanceof l.Personalized) {
            return "home";
        }
        return null;
    }

    private final String B2() {
        Qo.l value = l3().getValue();
        if (value instanceof l.Search) {
            return "Product Search Results Page";
        }
        if (value instanceof l.Department) {
            return "category page";
        }
        if (value instanceof l.Personalized) {
            int i10 = r.$EnumSwitchMapping$0[((l.Personalized) value).getCategory().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return "Buy Again";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "Favorites on Sale";
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K1(G g10, Coupon coupon, String str, ClipUnclipCouponResponse clipUnclipCouponResponse) {
        Intrinsics.g(clipUnclipCouponResponse);
        g10.O3(clipUnclipCouponResponse, coupon, str);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void O3(ClipUnclipCouponResponse response, Coupon coupon, String couponLocation) {
        if (!StringsKt.I(response.getResult(), "Success", false, 2, null)) {
            C15809k.d(this.coroutineScope, null, null, new x(coupon, null), 3, null);
        } else {
            x4(coupon, couponLocation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void a4(ProductFullDetails product, Qo.l productQuery, int position) {
        Qo.l value = l3().getValue();
        if (value instanceof l.Personalized) {
            int i10 = r.$EnumSwitchMapping$0[((l.Personalized) value).getCategory().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    z4("event: shopping list: product detail view");
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                z4("event: favorites on sale modal: product detail view");
            }
        } else if (!(value instanceof l.Recommendations)) {
            if (value instanceof l.Favorites) {
                z4("event: favorites modal: product detail view");
            } else if (value instanceof l.ShoppingList) {
                z4("event: shopping list: show product details");
            } else if (value instanceof l.Search) {
                this.analyticsEngine.h(C14756c.a("event: search: product detail"), C14756c.c("mperks: search"), C14756c.g("search"));
            } else if (!(value instanceof l.BrowseCollection) && !(value instanceof l.Coupon) && !(value instanceof l.Reward) && !(value instanceof l.Department)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.productAnalytics.j(productQuery, product, position);
        C15809k.d(this.coroutineScope, null, null, new A(product, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c2(G g10, String str) {
        Intrinsics.g(str);
        g10.cartId = str;
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l2(G g10, TrackingData trackingData, Coupon coupon) {
        String value;
        List<AbstractC14762i> listK;
        AbstractC14762i abstractC14762i;
        Intrinsics.g(coupon);
        if (trackingData != null && (listK = trackingData.k()) != null && (abstractC14762i = (AbstractC14762i) CollectionsKt.u0(listK)) != null) {
            value = abstractC14762i.getValue();
        } else {
            value = null;
        }
        g10.F1(coupon, value);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object s0(G g10, List list, Continuation continuation) {
        g10.P3(list);
        return Unit.f143329a;
    }

    private final Integer v2(CouponState couponState, uk.c<EntryChange> entryChange) {
        Double dValueOf;
        EntryChange entryChangeA = entryChange.a();
        if (entryChangeA != null) {
            dValueOf = Double.valueOf(entryChangeA.getExpectedQuantityChange());
        } else {
            dValueOf = null;
        }
        Intrinsics.g(dValueOf);
        double dDoubleValue = dValueOf.doubleValue();
        Iterator<T> it = couponState.b().iterator();
        double quantity = 0.0d;
        while (it.hasNext()) {
            quantity += ((CartEntry) it.next()).getQuantity();
        }
        double d10 = dDoubleValue + quantity;
        if (d10 >= couponState.getCoupon().getEarnCondition().getGoal()) {
            Double dValueOf2 = Double.valueOf((couponState.getCoupon().getReward().getValue() + couponState.getCoupon().getEarnCondition().getGoal()) - d10);
            if (dValueOf2.doubleValue() < 0.0d) {
                dValueOf2 = null;
            }
            if (dValueOf2 != null) {
                return Integer.valueOf((int) dValueOf2.doubleValue());
            }
        }
        return null;
    }

    private final void v4(boolean overrideItemAlreadyInCart) {
        nk.i iVarC;
        ProductFullDetails product;
        ProductListDecorator productListDecoratorP3 = p3();
        if (productListDecoratorP3 != null) {
            nk.i iVarB = nk.k.b(Co.l.g(productListDecoratorP3.getProduct().getCode()), 1.0d);
            CartProductListDecorator cartProductListDecorator = this.itemToSubstitute;
            if (cartProductListDecorator != null && (product = cartProductListDecorator.getProduct()) != null) {
                iVarC = nk.k.c(product, 0.0d);
            } else {
                iVarC = null;
            }
            nk.i iVar = iVarC;
            if (iVar != null) {
                C15809k.d(this.coroutineScope, null, null, new J(iVar, iVarB, overrideItemAlreadyInCart, null), 3, null);
            }
        }
    }

    public final String u3() {
        Qo.l value = l3().getValue();
        if (value instanceof l.Search) {
            return "product search page";
        }
        if (value instanceof l.Department) {
            return "category page";
        }
        if (value instanceof l.Personalized) {
            int i10 = r.$EnumSwitchMapping$0[((l.Personalized) value).getCategory().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return "Buy Again";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "Favorites on Sale";
        }
        if (value instanceof l.Favorites) {
            return "favorite products page";
        }
        if (value instanceof l.BrowseCollection) {
            return "collection page";
        }
        if (!(value instanceof l.Reward)) {
            return "product search page";
        }
        return "mPerks:Reward Details Page:PLP";
    }
}
