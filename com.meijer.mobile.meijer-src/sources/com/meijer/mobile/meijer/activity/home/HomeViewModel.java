package com.meijer.mobile.meijer.activity.home;

import Ao.C2898u;
import Co.ProductFullDetails;
import Eh.EmailVerificationSpiffs;
import Hl.FlyBuyOrderDetail;
import Hr.CouponCountDownStateDecorator;
import Ir.UserActionDialogInfo;
import Pj.a;
import Pk.Coupon;
import Qk.a;
import Sk.CouponOptions;
import Tl.MarketingBannersDecorator;
import Ul.BeaconsTracker;
import Ul.ToastMessageData;
import Vl.DepartmentCard;
import Vl.MarketingBanner;
import Vl.e;
import Wl.AvailableReward;
import Wl.HomeMperks;
import Wl.HomeMperksClippedReward;
import Wl.MperksData;
import Yk.CouponState;
import android.graphics.Rect;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.InterfaceC6157f;
import androidx.view.InterfaceC6172s;
import bk.AbstractC6392a;
import co.RewardDetail;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.core.util.networking.NoAvailableNetworksException;
import com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse;
import com.meijer.mobile.meijer.activity.home.HomeViewModel;
import com.meijer.mobile.mperks.networking.domain.models.ExpiringPoints;
import dl.C13702d;
import ds.AbstractC13720b;
import ds.C13719a;
import el.CouponsResponse;
import es.AbstractC13870f;
import es.OrderStatusCardDecorator;
import ev.C13889a;
import fj.Entry;
import fj.EntryChange;
import fj.ShoppingCart;
import fm.AbstractC14019a;
import fm.AbstractC14021c;
import fm.AbstractC14029k;
import fs.AbstractC14072a;
import gi.C14375c;
import gi.C14377e;
import gi.EnumC14378f;
import gi.GoogleAdAnalytics;
import hi.InterfaceC14523a;
import hj.OrderDetail;
import hm.AbstractC14537b;
import hm.C14536a;
import ii.AbstractC14761h;
import ii.AbstractC14762i;
import ii.C14756c;
import ii.C14760g;
import ii.InterfaceC14754a;
import ii.TrackingData;
import im.C14781c;
import im.FullOrderResponseHolder;
import j$.time.Instant;
import j$.time.LocalDate;
import java.net.ConnectException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import jm.C15052a;
import jm.C15053b;
import jp.C15058b;
import kk.EnumC15218a;
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
import kotlin.coroutines.jvm.internal.ContinuationImpl;
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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import mv.AbstractC15779K;
import mv.C15809k;
import mv.InterfaceC15783O;
import pl.TipData;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import pv.InterfaceC16562g;
import qp.C16753b;
import qw.a;
import retrofit2.HttpException;
import sp.C17115a;
import sp.ProductState;
import tp.Builder;
import tp.EnumC17276a;
import uk.AbstractC17440a;
import uk.c;
import uo.OrderOutOfStockItem;
import ur.AbstractC17454a;
import vo.OrderSubstitutionItem;
import vr.AbstractC17720a;
import vs.C17728h;
import vs.CarouselDecorator;
import vs.ProductListDecorator;
import wl.CartEntry;
import wl.ProductEligibility;
import wr.InterfaceC17909a;
import xr.InterfaceC18214a;
import yk.C18328d;
import yo.C18335a;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000ö\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 á\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\nâ\u0002ã\u0002ä\u0002å\u0002á\u0002BÃ\u0001\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00102\u001a\u000201\u0012\b\b\u0001\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0010\u0010:\u001a\u000207H\u0080@¢\u0006\u0004\b8\u00109J%\u0010A\u001a\u0002072\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u000207¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u0002072\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u0002072\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bI\u0010HJ\u0017\u0010J\u001a\u0002072\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bJ\u0010HJ\u000f\u0010K\u001a\u000207H\u0014¢\u0006\u0004\bK\u0010DJ\r\u0010L\u001a\u000207¢\u0006\u0004\bL\u0010DJ)\u0010Q\u001a\u000207\"\u0004\b\u0000\u0010M2\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00028\u00000NH\u0016¢\u0006\u0004\bQ\u0010RJ\u001f\u0010V\u001a\u0002072\u000e\u0010U\u001a\n\u0012\u0004\u0012\u00020T\u0018\u00010SH\u0016¢\u0006\u0004\bV\u0010WJ\u000f\u0010Y\u001a\u00020XH\u0016¢\u0006\u0004\bY\u0010ZJ%\u0010\\\u001a\u0002072\u0006\u0010\\\u001a\u00020[2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020]0SH\u0016¢\u0006\u0004\b\\\u0010_J\u001d\u0010d\u001a\u0002072\u0006\u0010a\u001a\u00020`2\u0006\u0010c\u001a\u00020b¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u000207H\u0016¢\u0006\u0004\bf\u0010DJ\u0017\u0010i\u001a\u0002072\u0006\u0010h\u001a\u00020gH\u0016¢\u0006\u0004\bi\u0010jJ\u0015\u0010i\u001a\u0002072\u0006\u0010h\u001a\u00020k¢\u0006\u0004\bi\u0010lJ\u0015\u0010i\u001a\u0002072\u0006\u0010h\u001a\u00020m¢\u0006\u0004\bi\u0010nJ\u0017\u0010o\u001a\u0002072\u0006\u0010h\u001a\u00020\u0006H\u0016¢\u0006\u0004\bo\u0010pJ\u0015\u0010i\u001a\u0002072\u0006\u0010h\u001a\u00020q¢\u0006\u0004\bi\u0010rJ\u0015\u0010i\u001a\u0002072\u0006\u0010h\u001a\u00020s¢\u0006\u0004\bi\u0010tJ\u0015\u0010i\u001a\u0002072\u0006\u0010h\u001a\u00020u¢\u0006\u0004\bi\u0010vJ\u0015\u0010i\u001a\u0002072\u0006\u0010h\u001a\u00020w¢\u0006\u0004\bi\u0010xJ\u0015\u0010i\u001a\u0002072\u0006\u0010h\u001a\u00020y¢\u0006\u0004\bi\u0010zJ\u000f\u0010{\u001a\u000207H\u0002¢\u0006\u0004\b{\u0010DJ\u000f\u0010|\u001a\u000207H\u0002¢\u0006\u0004\b|\u0010DJ\u000f\u0010}\u001a\u000207H\u0002¢\u0006\u0004\b}\u0010DJ\u000f\u0010~\u001a\u000207H\u0002¢\u0006\u0004\b~\u0010DJ\u0010\u0010\u007f\u001a\u000207H\u0082@¢\u0006\u0004\b\u007f\u00109J#\u0010\u0083\u0001\u001a\u0002072\u000f\u0010\u0082\u0001\u001a\n\u0012\u0005\u0012\u00030\u0081\u00010\u0080\u0001H\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J#\u0010\u0087\u0001\u001a\u0002072\u000f\u0010\u0086\u0001\u001a\n\u0012\u0005\u0012\u00030\u0085\u00010\u0080\u0001H\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0084\u0001J3\u0010\u008c\u0001\u001a\u0002072\u0007\u0010\u0088\u0001\u001a\u00020\u00062\u0016\u0010\u008b\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u008a\u00010\u0089\u00010\u0080\u0001H\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u001f\u0010\u008f\u0001\u001a\u00030\u008e\u0001*\n\u0012\u0005\u0012\u00030\u008a\u00010\u0089\u0001H\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0011\u0010\u0091\u0001\u001a\u000207H\u0002¢\u0006\u0005\b\u0091\u0001\u0010DJ$\u0010\u0094\u0001\u001a\u0002072\b\u0010\u0093\u0001\u001a\u00030\u0092\u00012\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J%\u0010\u0099\u0001\u001a\u00030\u0098\u00012\b\u0010\u0097\u0001\u001a\u00030\u0096\u00012\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0011\u0010\u009b\u0001\u001a\u000207H\u0002¢\u0006\u0005\b\u009b\u0001\u0010DJ\u001c\u0010\u009e\u0001\u001a\u0002072\b\u0010\u009d\u0001\u001a\u00030\u009c\u0001H\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J0\u0010¤\u0001\u001a\u0002072\b\u0010¡\u0001\u001a\u00030 \u00012\b\u0010\u009d\u0001\u001a\u00030\u009c\u00012\b\u0010£\u0001\u001a\u00030¢\u0001H\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u0011\u0010¦\u0001\u001a\u000207H\u0002¢\u0006\u0005\b¦\u0001\u0010DJ&\u0010©\u0001\u001a\u0002072\b\u0010¡\u0001\u001a\u00030 \u00012\b\u0010¨\u0001\u001a\u00030§\u0001H\u0002¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u0011\u0010«\u0001\u001a\u000207H\u0002¢\u0006\u0005\b«\u0001\u0010DJ\u0011\u0010¬\u0001\u001a\u000207H\u0002¢\u0006\u0005\b¬\u0001\u0010DJ\u001b\u0010®\u0001\u001a\u0002072\u0007\u0010\u00ad\u0001\u001a\u00020?H\u0002¢\u0006\u0006\b®\u0001\u0010¯\u0001J!\u0010³\u0001\u001a\u0002072\r\u0010²\u0001\u001a\b0°\u0001j\u0003`±\u0001H\u0002¢\u0006\u0006\b³\u0001\u0010´\u0001J!\u0010µ\u0001\u001a\u0002072\r\u0010²\u0001\u001a\b0°\u0001j\u0003`±\u0001H\u0002¢\u0006\u0006\bµ\u0001\u0010´\u0001J\u0011\u0010¶\u0001\u001a\u000207H\u0002¢\u0006\u0005\b¶\u0001\u0010DJ$\u0010¹\u0001\u001a\u0002072\u000f\u0010¸\u0001\u001a\n\u0012\u0005\u0012\u00030·\u00010\u0080\u0001H\u0082@¢\u0006\u0006\b¹\u0001\u0010º\u0001J*\u0010¼\u0001\u001a\u0002072\r\u0010²\u0001\u001a\b0°\u0001j\u0003`±\u00012\u0007\u0010»\u0001\u001a\u00020?H\u0002¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u0011\u0010¾\u0001\u001a\u000207H\u0002¢\u0006\u0005\b¾\u0001\u0010DJ#\u0010Á\u0001\u001a\u0002072\u000f\u0010À\u0001\u001a\n\u0012\u0005\u0012\u00030¿\u00010\u0080\u0001H\u0002¢\u0006\u0006\bÁ\u0001\u0010\u0084\u0001J\u001c\u0010Ä\u0001\u001a\u0002072\b\u0010Ã\u0001\u001a\u00030Â\u0001H\u0002¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J\u001c\u0010Ç\u0001\u001a\u0002072\b\u0010Ã\u0001\u001a\u00030Æ\u0001H\u0002¢\u0006\u0006\bÇ\u0001\u0010È\u0001J'\u0010Ì\u0001\u001a\u0002072\b\u0010Ê\u0001\u001a\u00030É\u00012\b\u0010Ã\u0001\u001a\u00030Ë\u0001H\u0082@¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J\u001c\u0010Î\u0001\u001a\u0002072\b\u0010Ã\u0001\u001a\u00030Â\u0001H\u0002¢\u0006\u0006\bÎ\u0001\u0010Å\u0001J(\u0010Ñ\u0001\u001a\u0002072\n\u0010Ð\u0001\u001a\u0005\u0018\u00010Ï\u00012\b\u0010Ã\u0001\u001a\u00030Â\u0001H\u0002¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001J\u0011\u0010Ó\u0001\u001a\u000207H\u0002¢\u0006\u0005\bÓ\u0001\u0010DJ\u0011\u0010Ô\u0001\u001a\u000207H\u0002¢\u0006\u0005\bÔ\u0001\u0010DJ\u0011\u0010Õ\u0001\u001a\u000207H\u0002¢\u0006\u0005\bÕ\u0001\u0010DJ\u0011\u0010Ö\u0001\u001a\u000207H\u0002¢\u0006\u0005\bÖ\u0001\u0010DJ=\u0010Ü\u0001\u001a\u0002072\u0011\u0010Ø\u0001\u001a\f\u0018\u00010 \u0001j\u0005\u0018\u0001`×\u00012\r\u0010Ú\u0001\u001a\b0 \u0001j\u0003`Ù\u00012\u0007\u0010Û\u0001\u001a\u00020?H\u0002¢\u0006\u0006\bÜ\u0001\u0010Ý\u0001J\u001c\u0010à\u0001\u001a\u0002072\b\u0010ß\u0001\u001a\u00030Þ\u0001H\u0002¢\u0006\u0006\bà\u0001\u0010á\u0001J+\u0010ã\u0001\u001a\u0002072\b\u0010\u0093\u0001\u001a\u00030\u0092\u00012\f\b\u0002\u0010â\u0001\u001a\u0005\u0018\u00010\u0098\u0001H\u0082@¢\u0006\u0006\bã\u0001\u0010ä\u0001J+\u0010å\u0001\u001a\u0002072\b\u0010\u0097\u0001\u001a\u00030\u0096\u00012\f\b\u0002\u0010â\u0001\u001a\u0005\u0018\u00010\u0098\u0001H\u0082@¢\u0006\u0006\bå\u0001\u0010æ\u0001J5\u0010é\u0001\u001a\u0002072\b\u0010è\u0001\u001a\u00030ç\u00012\b\u0010\u0097\u0001\u001a\u00030\u0096\u00012\f\b\u0002\u0010â\u0001\u001a\u0005\u0018\u00010\u0098\u0001H\u0082@¢\u0006\u0006\bé\u0001\u0010ê\u0001J5\u0010ì\u0001\u001a\u0002072\u0006\u0010\\\u001a\u00020[2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020]0S2\n\u0010ë\u0001\u001a\u0005\u0018\u00010 \u0001H\u0082@¢\u0006\u0006\bì\u0001\u0010í\u0001J5\u0010î\u0001\u001a\u0002072\u0006\u0010\\\u001a\u00020[2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020]0S2\n\u0010ë\u0001\u001a\u0005\u0018\u00010 \u0001H\u0082@¢\u0006\u0006\bî\u0001\u0010í\u0001J5\u0010ï\u0001\u001a\u0002072\u0006\u0010\\\u001a\u00020[2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020]0S2\n\u0010ë\u0001\u001a\u0005\u0018\u00010 \u0001H\u0082@¢\u0006\u0006\bï\u0001\u0010í\u0001J;\u0010ó\u0001\u001a\u0002072\u0007\u0010ð\u0001\u001a\u00020?2\b\u0010^\u001a\u0004\u0018\u00010]2\n\u0010ë\u0001\u001a\u0005\u0018\u00010 \u00012\b\u0010ò\u0001\u001a\u00030ñ\u0001H\u0002¢\u0006\u0006\bó\u0001\u0010ô\u0001J&\u0010õ\u0001\u001a\u0002072\b\u0010^\u001a\u0004\u0018\u00010]2\b\u0010ò\u0001\u001a\u00030ñ\u0001H\u0002¢\u0006\u0006\bõ\u0001\u0010ö\u0001J,\u0010ø\u0001\u001a\u0005\u0018\u00010\u0085\u00012\n\u0010ë\u0001\u001a\u0005\u0018\u00010 \u00012\t\b\u0002\u0010÷\u0001\u001a\u00020?H\u0002¢\u0006\u0006\bø\u0001\u0010ù\u0001J&\u0010û\u0001\u001a\f\u0012\u0005\u0012\u00030ú\u0001\u0018\u00010\u0080\u00012\b\u0010^\u001a\u0004\u0018\u00010]H\u0002¢\u0006\u0006\bû\u0001\u0010ü\u0001J2\u0010þ\u0001\u001a\u00020?2\b\u0010ý\u0001\u001a\u00030\u0085\u00012\b\u0010^\u001a\u0004\u0018\u00010]2\n\b\u0002\u0010ò\u0001\u001a\u00030ñ\u0001H\u0002¢\u0006\u0006\bþ\u0001\u0010ÿ\u0001J\u001b\u0010\u0080\u0002\u001a\u00030ñ\u00012\u0006\u0010\\\u001a\u00020[H\u0002¢\u0006\u0006\b\u0080\u0002\u0010\u0081\u0002J\u001e\u0010\u0082\u0002\u001a\u0002072\n\u0010ë\u0001\u001a\u0005\u0018\u00010 \u0001H\u0002¢\u0006\u0006\b\u0082\u0002\u0010\u0083\u0002JO\u0010\u0088\u0002\u001a\n\u0012\u0005\u0012\u00030\u008e\u00010\u0080\u00012\u000f\u0010\u0084\u0002\u001a\n\u0012\u0005\u0012\u00030\u008e\u00010\u0080\u00012\f\b\u0002\u0010\u0085\u0002\u001a\u0005\u0018\u00010 \u00012\t\b\u0002\u0010\u0086\u0002\u001a\u00020?2\t\b\u0002\u0010\u0087\u0002\u001a\u00020?H\u0002¢\u0006\u0006\b\u0088\u0002\u0010\u0089\u0002J6\u0010\u008a\u0002\u001a\u0002072\f\b\u0002\u0010\u0085\u0002\u001a\u0005\u0018\u00010 \u00012\t\b\u0002\u0010\u0086\u0002\u001a\u00020?2\t\b\u0002\u0010\u0087\u0002\u001a\u00020?H\u0002¢\u0006\u0006\b\u008a\u0002\u0010\u008b\u0002J\u0011\u0010\u008c\u0002\u001a\u000207H\u0002¢\u0006\u0005\b\u008c\u0002\u0010DJ\u001f\u0010\u008e\u0002\u001a\u00030 \u00012\n\u0010\u008d\u0002\u001a\u0005\u0018\u00010\u008a\u0001H\u0002¢\u0006\u0006\b\u008e\u0002\u0010\u008f\u0002J\u001d\u0010\u008e\u0002\u001a\u0005\u0018\u00010 \u00012\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0006\b\u008e\u0002\u0010\u0090\u0002Jr\u0010\u009b\u0002\u001a\u0002072\b\u0010\u0091\u0002\u001a\u00030 \u00012\b\u0010\u0093\u0002\u001a\u00030\u0092\u00022\u0011\u0010\u0095\u0002\u001a\f\u0012\u0005\u0012\u00030\u0094\u0002\u0018\u00010\u0080\u00012\u0007\u0010\u0096\u0002\u001a\u00020?2\f\b\u0002\u0010\u0097\u0002\u001a\u0005\u0018\u00010 \u00012\f\b\u0002\u0010\u0098\u0002\u001a\u0005\u0018\u00010 \u00012\u0011\u0010\u009a\u0002\u001a\f\u0012\u0005\u0012\u00030\u0099\u0002\u0018\u00010\u0080\u0001H\u0082@¢\u0006\u0006\b\u009b\u0002\u0010\u009c\u0002JH\u0010¡\u0002\u001a\u0002072\u000f\u0010\u009d\u0002\u001a\n\u0012\u0005\u0012\u00030 \u00010\u0080\u00012\f\b\u0002\u0010\u009f\u0002\u001a\u0005\u0018\u00010\u009e\u00022\t\b\u0002\u0010 \u0002\u001a\u00020?2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010=H\u0002¢\u0006\u0006\b¡\u0002\u0010¢\u0002J5\u0010¤\u0002\u001a\u0002072\n\u0010\u009f\u0002\u001a\u0005\u0018\u00010\u009e\u00022\t\b\u0002\u0010 \u0002\u001a\u00020?2\n\u0010\u008d\u0002\u001a\u0005\u0018\u00010£\u0002H\u0002¢\u0006\u0006\b¤\u0002\u0010¥\u0002R\u0015\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010¦\u0002R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010§\u0002R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010¨\u0002R\u0015\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000e\u0010©\u0002R\u0015\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010ª\u0002R\u0015\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0012\u0010«\u0002R\u0015\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010¬\u0002R\u0015\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010\u00ad\u0002R\u0015\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010®\u0002R\u0015\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001a\u0010¯\u0002R\u0015\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001c\u0010°\u0002R\u0015\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001e\u0010±\u0002R\u0015\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b \u0010²\u0002R\u0015\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\"\u0010³\u0002R\u0015\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b$\u0010´\u0002R\u0015\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b&\u0010µ\u0002R\u0015\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b(\u0010¶\u0002R\u0015\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b*\u0010·\u0002R\u0015\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b,\u0010¸\u0002R\u0015\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b.\u0010¹\u0002R\u0015\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b0\u0010º\u0002R\u0015\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b2\u0010»\u0002R\u0015\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b4\u0010¼\u0002R\u0017\u0010½\u0002\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0002\u0010¾\u0002R\u001f\u0010Á\u0002\u001a\n\u0012\u0005\u0012\u00030À\u00020¿\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÁ\u0002\u0010Â\u0002R\u001f\u0010Ä\u0002\u001a\n\u0012\u0005\u0012\u00030Ã\u00020¿\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0002\u0010Â\u0002R\u0018\u0010Æ\u0002\u001a\u00030Å\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0002\u0010Ç\u0002R\u001f\u0010Ê\u0002\u001a\n\u0012\u0005\u0012\u00030É\u00020È\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÊ\u0002\u0010Ë\u0002R$\u0010Í\u0002\u001a\n\u0012\u0005\u0012\u00030É\u00020Ì\u00028\u0006¢\u0006\u0010\n\u0006\bÍ\u0002\u0010Î\u0002\u001a\u0006\bÏ\u0002\u0010Ð\u0002R\u001f\u0010Ñ\u0002\u001a\b0 \u0001j\u0003`×\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0002\u0010Ò\u0002R!\u0010Ô\u0002\u001a\n\u0012\u0005\u0012\u00030Ó\u00020\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0002\u0010Õ\u0002R\u0019\u0010Ö\u0002\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0002\u0010×\u0002R\u001c\u0010Ù\u0002\u001a\u0005\u0018\u00010Ø\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0002\u0010Ú\u0002R\u001c\u0010Þ\u0002\u001a\n\u0012\u0005\u0012\u00030À\u00020Û\u00028F¢\u0006\b\u001a\u0006\bÜ\u0002\u0010Ý\u0002R\u001c\u0010à\u0002\u001a\n\u0012\u0005\u0012\u00030Ã\u00020Û\u00028F¢\u0006\b\u001a\u0006\bß\u0002\u0010Ý\u0002¨\u0006æ\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "Lwr/a;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j;", "Lcom/meijer/mobile/meijer/activity/home/HomeDecoratorListener;", "", "Lyo/k;", "userManager", "Lzl/k;", "featureManager", "Lyo/a;", "appPrefManager", "Ljm/a;", "homeRepository", "Lhm/a;", "homeChipsRepository", "LCh/e;", "profileRepository", "LCh/c;", "accountsAMSRepository", "Lhi/a;", "analyticsEngine", "Lim/c;", "orderStatusRepository", "Lcom/meijer/mobile/digitalshopping/api/orders/a;", "ordersRepository", "Ldl/d;", "couponsRepository", "LYk/u;", "couponsStateRepository", "Lfo/e;", "rewardsRepository", "Lwr/f;", "cartInteractor", "Lsp/a;", "multiChannelProductsStateRepository", "Ljm/b;", "marketingBannerRepository", "Ljp/b;", "productRecommendationsRepository", "Lpp/d;", "productMetadataStore", "LDl/e;", "deeplinkParser", "Lqp/b;", "beaconClient", "LTq/j;", "storeProvider", "LRo/c;", "productsRepository", "Lmv/K;", "ioDispatcher", "<init>", "(Lyo/k;Lzl/k;Lyo/a;Ljm/a;Lhm/a;LCh/e;LCh/c;Lhi/a;Lim/c;Lcom/meijer/mobile/digitalshopping/api/orders/a;Ldl/d;LYk/u;Lfo/e;Lwr/f;Lsp/a;Ljm/b;Ljp/b;Lpp/d;LDl/e;Lqp/b;LTq/j;LRo/c;Lmv/K;)V", "", "observeStoreChanges$Meijer_playstoreRelease", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeStoreChanges", "", "position", "Lkk/a;", "carouselType", "", "isSponsoredCriteo", "updateHomeViewState", "(ILkk/a;Z)V", "loadGoogleAd", "()V", "Landroidx/lifecycle/s;", "owner", "onCreate", "(Landroidx/lifecycle/s;)V", "onResume", "onPause", "onCleared", "fetchAllBuyAgainUpcs", "T", "Luk/a;", "Lvr/a;", "challenge", "throwChallenge", "(Luk/a;)V", "Luk/c;", "Lfj/C;", "cartResource", "observeCart", "(Luk/c;)V", "LJu/a;", "getDisposable", "()LJu/a;", "Lur/a;", "processedRequest", "Lfj/j;", "entryChange", "(Lur/a;Luk/c;)V", "Ltp/b;", "builder", "Ltp/a;", "flowType", "updateRatedAndTippedOrder", "(Ltp/b;Ltp/a;)V", "onRefresh", "LQk/a;", "action", "onAction", "(LQk/a;)V", "Lfs/a;", "(Lfs/a;)V", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action;", "(Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action;)V", "performAction", "(Ljava/lang/Object;)V", "Lfm/c;", "(Lfm/c;)V", "Lds/b;", "(Lds/b;)V", "Lfm/a;", "(Lfm/a;)V", "Lfm/k;", "(Lfm/k;)V", "Les/f;", "(Les/f;)V", "loadHomeContent", "configureFeatureEntryPoints", "syncWhiteLabelFeatureFlagState", "refreshHomeContent", "getProfileInformation", "", "LPj/a;", "loadingStates", "onLoadingStates", "(Ljava/util/List;)V", "LYk/c;", "couponStateList", "onCouponState", "key", "Lsp/b;", "LCo/h;", "productStates", "onProductsState", "(Ljava/lang/Object;Ljava/util/List;)V", "Lvs/f;", "toProductListDecorator", "(Lsp/b;)Lvs/f;", "pushUserAuthenticationState", "LPk/c;", "couponIdentity", "onProductCouponButtonClicked", "(LPk/c;Lkk/a;)V", "LPk/a;", "coupon", "Lii/f;", "getClipCouponTrackingData", "(LPk/a;Lkk/a;)Lii/f;", "fetchActiveOrders", "LVl/e$c;", "departmentCarousel", "fetchDepartmentCarousel", "(LVl/e$c;)V", "", "loadingKey", "LVl/c;", "departmentCard", "updateDepartmentCarousels", "(Ljava/lang/String;LVl/e$c;LVl/c;)V", "fetchPersonalizedCards", "", "error", "setLoadingStateError", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "fetchBanners", "fetchEmailVerificationBannerSettings", "showLoading", "fetchMperks", "(Z)V", "", "Lcom/meijer/mobile/core/models/mperks/MperksCouponId;", "couponId", "claimMperks", "(J)V", "updateLoadingStateOfCoupon", "fetchMperksExpiringPoints", "Lcom/meijer/mobile/mperks/networking/domain/models/ExpiringPoints;", "expiringPoints", "setPointsExpiry", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isRedeemedSuccessfully", "processMperksState", "(JZ)V", "fetchHomeCards", "LVl/e;", "homeComponentList", "makeHomeCardsAPICalls", "LVl/e$f;", "homeComponent", "fetchPersonalizedProductCard", "(LVl/e$f;)V", "LVl/e$f$d$a;", "fetchWhiteLabel", "(LVl/e$f$d$a;)V", "LVl/k;", "productCard", "LVl/e$f$d;", "fetchProductsForV3Carousel", "(LVl/k;LVl/e$f$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCuratedCard", "LVl/j;", "productCardDataResource", "onGetCuratedResponse", "(LVl/j;LVl/e$f;)V", "fetchAllCoupons", "fetchSpecialOffers", "fetchEnrollmentOfferResendEmailResponse", "fetchTipAndNotification", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "Lcom/meijer/mobile/core/model/common/ExternalShopperId;", "externalShopperId", "navigateToTipActivity", "updateRateAndTipNotification", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Lgi/a;", "googleAdAnalytics", "trackGoogleAdAnalytics", "(Lgi/a;)V", "trackingData", "fetchCoupon", "(LPk/c;Lii/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clipCoupon", "(LPk/a;Lii/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;", "response", "onGetClipCouponResponse", "(Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;LPk/a;Lii/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "productCode", "updateCartEntry", "(Lur/a;Luk/c;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addCartEntry", "removeCartEntry", "requireCartOpenExtra", "", "entryUnitPrice", "trackCartAdditionAction", "(ZLfj/j;Ljava/lang/String;D)V", "trackCartRemovalAction", "(Lfj/j;D)V", "logError", "getCouponState", "(Ljava/lang/String;Z)LYk/c;", "LPk/f;", "getCouponList", "(Lfj/j;)Ljava/util/List;", "couponState", "isCouponEarned", "(LYk/c;Lfj/j;D)Z", "getProductUnitPrice", "(Lur/a;)D", "resetQuantitySteppers", "(Ljava/lang/String;)V", "productListDecorators", "activeStepperId", "resetStepper", "inTransition", "updateStepperState", "(Ljava/util/List;Ljava/lang/String;ZZ)Ljava/util/List;", "onStepperInteractionChange", "(Ljava/lang/String;ZZ)V", "dismissEmailVerificationBanner", "product", "getCarouselType", "(LCo/h;)Ljava/lang/String;", "(Lkk/a;)Ljava/lang/String;", "orderNumber", "Lvo/b;", "substitutionScreenType", "Lvo/a;", "listSubstitutedItems", "isOnMyWayClicked", "orderType", "pickupPersonName", "Luo/a;", "listOutOfStockItems", "onLaunchSubstitutionActivity", "(Ljava/lang/String;Lvo/b;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "beacon", "LUl/a;", "type", "isFormatLevel", "sendCriteoBeacon", "(Ljava/util/List;LUl/a;ZLkk/a;)V", "Lnk/c;", "sendBeaconToastMessage", "(LUl/a;ZLnk/c;)V", "Lyo/k;", "Lzl/k;", "Lyo/a;", "Ljm/a;", "Lhm/a;", "LCh/e;", "LCh/c;", "Lhi/a;", "Lim/c;", "Lcom/meijer/mobile/digitalshopping/api/orders/a;", "Ldl/d;", "LYk/u;", "Lfo/e;", "Lwr/f;", "Lsp/a;", "Ljm/b;", "Ljp/b;", "Lpp/d;", "LDl/e;", "Lqp/b;", "LTq/j;", "LRo/c;", "Lmv/K;", "disposables", "LJu/a;", "Lpv/A;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent;", "_events", "Lpv/A;", "LUl/e;", "_toastMessageData", "LPj/c;", "loadingStatesManager", "LPj/c;", "Lpv/B;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeViewState;", "_homeViewState", "Lpv/B;", "Lpv/P;", "homeViewState", "Lpv/P;", "getHomeViewState", "()Lpv/P;", "cartId", "Ljava/lang/String;", "Lfj/i;", "cartEntries", "Ljava/util/List;", "skipProductCarouselUpdates", "Z", "LJu/b;", "authenticateUserDisposable", "LJu/b;", "Lpv/F;", "getEvents", "()Lpv/F;", "events", "getToastMessageData", "toastMessageData", "Companion", "HomeViewState", "MperksPointsExpData", "Action", "HomeEvent", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class HomeViewModel extends androidx.view.c0 implements InterfaceC6157f, InterfaceC17909a, SwipeRefreshLayout.j, HomeDecoratorListener {
    public static final String ActiveOrdersLoadingKey = "active orders";
    public static final String EnrollmentOfferResendEmailLoadingKey = "enrollment offer email";
    public static final String FetchHomeCardsLoadingKey = "fetch home cards";
    public static final String MperksLoadingKey = "mperks rewards";
    public static final String SEASONAL_CAROUSEL_NAME_ANALYTIC_TEMPLATE = "{carousel_name}";
    public static final String SeasonalCarouselLoadingKey = "seasonalCarousel";
    public static final String ShopByDepartmentsLoadingKeyV2 = "shopByDepartmentsV2";
    public static final String SpecialOffersLoadingKey = "special offers";
    private final InterfaceC16548A<HomeEvent> _events;
    private final InterfaceC16549B<HomeViewState> _homeViewState;
    private final InterfaceC16548A<ToastMessageData> _toastMessageData;
    private final Ch.c accountsAMSRepository;
    private final InterfaceC14523a analyticsEngine;
    private final C18335a appPrefManager;
    private Ju.b authenticateUserDisposable;
    private final C16753b beaconClient;
    private List<Entry> cartEntries;
    private String cartId;
    private final wr.f cartInteractor;
    private final C13702d couponsRepository;
    private final Yk.u couponsStateRepository;
    private final Dl.e deeplinkParser;
    private final Ju.a disposables;
    private final zl.k featureManager;
    private final C14536a homeChipsRepository;
    private final C15052a homeRepository;
    private final pv.P<HomeViewState> homeViewState;
    private final AbstractC15779K ioDispatcher;
    private final Pj.c loadingStatesManager;
    private final C15053b marketingBannerRepository;
    private final C17115a multiChannelProductsStateRepository;
    private final C14781c orderStatusRepository;
    private final com.meijer.mobile.digitalshopping.api.orders.a ordersRepository;
    private final pp.d productMetadataStore;
    private final C15058b productRecommendationsRepository;
    private final Ro.c productsRepository;
    private final Ch.e profileRepository;
    private final fo.e rewardsRepository;
    private boolean skipProductCarouselUpdates;
    private final Tq.j storeProvider;
    private final yo.k userManager;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$fetchWhiteLabel$1", f = "HomeViewModel.kt", l = {1046, 1065}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class A extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f110159a;

        /* renamed from: b, reason: collision with root package name */
        Object f110160b;

        /* renamed from: c, reason: collision with root package name */
        Object f110161c;

        /* renamed from: d, reason: collision with root package name */
        Object f110162d;

        /* renamed from: e, reason: collision with root package name */
        Object f110163e;

        /* renamed from: f, reason: collision with root package name */
        int f110164f;

        /* renamed from: g, reason: collision with root package name */
        int f110165g;

        /* renamed from: h, reason: collision with root package name */
        int f110166h;

        /* renamed from: i, reason: collision with root package name */
        int f110167i;

        /* renamed from: j, reason: collision with root package name */
        int f110168j;

        /* renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f110169k;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ e.f.d.a f110171m;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            A a10 = HomeViewModel.this.new A(this.f110171m, continuation);
            a10.f110169k = obj;
            return a10;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        A(e.f.d.a aVar, Continuation<? super A> continuation) {
            super(2, continuation);
            this.f110171m = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((A) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r45) {
            /*
                Method dump skipped, instructions count: 387
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.home.HomeViewModel.A.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0011\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0011\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action;", "", "<init>", "()V", "HomeChipItemClicked", "UpdateOrderStatusPosition", "ProductItemClicked", "PersonalizedProductListClicked", "UpdateEntryAction", "StepperStateChanged", "IsAfterAccountCreatedAction", "UpdateNotification", "MarketBannerClickAction", "FetchCuratedCarousels", "FetchPersonalizedCarousels", "UserLoggedOutAction", "UserAcceptAddToCartAction", "ResetStepper", "RefreshScreen", "GoogleAdClicked", "FindYourListTrackAction", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$FetchCuratedCarousels;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$FetchPersonalizedCarousels;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$FindYourListTrackAction;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$GoogleAdClicked;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$HomeChipItemClicked;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$IsAfterAccountCreatedAction;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$MarketBannerClickAction;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$PersonalizedProductListClicked;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$ProductItemClicked;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$RefreshScreen;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$ResetStepper;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$StepperStateChanged;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$UpdateEntryAction;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$UpdateNotification;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$UpdateOrderStatusPosition;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$UserAcceptAddToCartAction;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$UserLoggedOutAction;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {
        public static final int $stable = 0;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$FetchCuratedCarousels;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action;", "LVl/e$f;", "component", "<init>", "(LVl/e$f;)V", "component1", "()LVl/e$f;", "copy", "(LVl/e$f;)Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$FetchCuratedCarousels;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LVl/e$f;", "getComponent", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class FetchCuratedCarousels extends Action {
            public static final int $stable = 8;
            private final e.f component;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FetchCuratedCarousels) && Intrinsics.e(this.component, ((FetchCuratedCarousels) other).component);
            }

            public int hashCode() {
                return this.component.hashCode();
            }

            public String toString() {
                return "FetchCuratedCarousels(component=" + this.component + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FetchCuratedCarousels(e.f component) {
                super(null);
                Intrinsics.j(component, "component");
                this.component = component;
            }

            public static /* synthetic */ FetchCuratedCarousels copy$default(FetchCuratedCarousels fetchCuratedCarousels, e.f fVar, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    fVar = fetchCuratedCarousels.component;
                }
                return fetchCuratedCarousels.copy(fVar);
            }

            /* renamed from: component1, reason: from getter */
            public final e.f getComponent() {
                return this.component;
            }

            public final FetchCuratedCarousels copy(e.f component) {
                Intrinsics.j(component, "component");
                return new FetchCuratedCarousels(component);
            }

            public final e.f getComponent() {
                return this.component;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$FetchPersonalizedCarousels;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action;", "LVl/e$f;", "component", "<init>", "(LVl/e$f;)V", "component1", "()LVl/e$f;", "copy", "(LVl/e$f;)Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$FetchPersonalizedCarousels;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LVl/e$f;", "getComponent", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class FetchPersonalizedCarousels extends Action {
            public static final int $stable = 8;
            private final e.f component;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FetchPersonalizedCarousels) && Intrinsics.e(this.component, ((FetchPersonalizedCarousels) other).component);
            }

            public int hashCode() {
                return this.component.hashCode();
            }

            public String toString() {
                return "FetchPersonalizedCarousels(component=" + this.component + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FetchPersonalizedCarousels(e.f component) {
                super(null);
                Intrinsics.j(component, "component");
                this.component = component;
            }

            public static /* synthetic */ FetchPersonalizedCarousels copy$default(FetchPersonalizedCarousels fetchPersonalizedCarousels, e.f fVar, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    fVar = fetchPersonalizedCarousels.component;
                }
                return fetchPersonalizedCarousels.copy(fVar);
            }

            /* renamed from: component1, reason: from getter */
            public final e.f getComponent() {
                return this.component;
            }

            public final FetchPersonalizedCarousels copy(e.f component) {
                Intrinsics.j(component, "component");
                return new FetchPersonalizedCarousels(component);
            }

            public final e.f getComponent() {
                return this.component;
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$FindYourListTrackAction;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class FindYourListTrackAction extends Action {
            public static final int $stable = 0;
            public static final FindYourListTrackAction INSTANCE = new FindYourListTrackAction();

            private FindYourListTrackAction() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof FindYourListTrackAction);
            }

            public int hashCode() {
                return 1406635823;
            }

            public String toString() {
                return "FindYourListTrackAction";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$GoogleAdClicked;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action;", "Lgi/a;", "analytics", "<init>", "(Lgi/a;)V", "component1", "()Lgi/a;", "copy", "(Lgi/a;)Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$GoogleAdClicked;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lgi/a;", "getAnalytics", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class GoogleAdClicked extends Action {
            public static final int $stable = GoogleAdAnalytics.f134240f;
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

            public static /* synthetic */ GoogleAdClicked copy$default(GoogleAdClicked googleAdClicked, GoogleAdAnalytics c14373a, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    c14373a = googleAdClicked.analytics;
                }
                return googleAdClicked.copy(c14373a);
            }

            /* renamed from: component1, reason: from getter */
            public final GoogleAdAnalytics getAnalytics() {
                return this.analytics;
            }

            public final GoogleAdClicked copy(GoogleAdAnalytics analytics) {
                Intrinsics.j(analytics, "analytics");
                return new GoogleAdClicked(analytics);
            }

            public final GoogleAdAnalytics getAnalytics() {
                return this.analytics;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$HomeChipItemClicked;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action;", "Lxr/a;", "homeChip", "<init>", "(Lxr/a;)V", "component1", "()Lxr/a;", "copy", "(Lxr/a;)Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$HomeChipItemClicked;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lxr/a;", "getHomeChip", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class HomeChipItemClicked extends Action {
            public static final int $stable = 8;
            private final InterfaceC18214a homeChip;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof HomeChipItemClicked) && Intrinsics.e(this.homeChip, ((HomeChipItemClicked) other).homeChip);
            }

            public int hashCode() {
                return this.homeChip.hashCode();
            }

            public String toString() {
                return "HomeChipItemClicked(homeChip=" + this.homeChip + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HomeChipItemClicked(InterfaceC18214a homeChip) {
                super(null);
                Intrinsics.j(homeChip, "homeChip");
                this.homeChip = homeChip;
            }

            public static /* synthetic */ HomeChipItemClicked copy$default(HomeChipItemClicked homeChipItemClicked, InterfaceC18214a interfaceC18214a, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    interfaceC18214a = homeChipItemClicked.homeChip;
                }
                return homeChipItemClicked.copy(interfaceC18214a);
            }

            /* renamed from: component1, reason: from getter */
            public final InterfaceC18214a getHomeChip() {
                return this.homeChip;
            }

            public final HomeChipItemClicked copy(InterfaceC18214a homeChip) {
                Intrinsics.j(homeChip, "homeChip");
                return new HomeChipItemClicked(homeChip);
            }

            public final InterfaceC18214a getHomeChip() {
                return this.homeChip;
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$IsAfterAccountCreatedAction;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action;", "status", "", "<init>", "(Z)V", "getStatus", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class IsAfterAccountCreatedAction extends Action {
            public static final int $stable = 0;
            private final boolean status;

            public IsAfterAccountCreatedAction(boolean z10) {
                super(null);
                this.status = z10;
            }

            public static /* synthetic */ IsAfterAccountCreatedAction copy$default(IsAfterAccountCreatedAction isAfterAccountCreatedAction, boolean z10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    z10 = isAfterAccountCreatedAction.status;
                }
                return isAfterAccountCreatedAction.copy(z10);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getStatus() {
                return this.status;
            }

            public final IsAfterAccountCreatedAction copy(boolean status) {
                return new IsAfterAccountCreatedAction(status);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof IsAfterAccountCreatedAction) && this.status == ((IsAfterAccountCreatedAction) other).status;
            }

            public int hashCode() {
                return Boolean.hashCode(this.status);
            }

            public String toString() {
                return "IsAfterAccountCreatedAction(status=" + this.status + ')';
            }

            public final boolean getStatus() {
                return this.status;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$MarketBannerClickAction;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action;", "LVl/i;", "banner", "<init>", "(LVl/i;)V", "component1", "()LVl/i;", "copy", "(LVl/i;)Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$MarketBannerClickAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LVl/i;", "getBanner", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class MarketBannerClickAction extends Action {
            public static final int $stable = 8;
            private final MarketingBanner banner;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MarketBannerClickAction) && Intrinsics.e(this.banner, ((MarketBannerClickAction) other).banner);
            }

            public int hashCode() {
                return this.banner.hashCode();
            }

            public String toString() {
                return "MarketBannerClickAction(banner=" + this.banner + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MarketBannerClickAction(MarketingBanner banner) {
                super(null);
                Intrinsics.j(banner, "banner");
                this.banner = banner;
            }

            public static /* synthetic */ MarketBannerClickAction copy$default(MarketBannerClickAction marketBannerClickAction, MarketingBanner iVar, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    iVar = marketBannerClickAction.banner;
                }
                return marketBannerClickAction.copy(iVar);
            }

            /* renamed from: component1, reason: from getter */
            public final MarketingBanner getBanner() {
                return this.banner;
            }

            public final MarketBannerClickAction copy(MarketingBanner banner) {
                Intrinsics.j(banner, "banner");
                return new MarketBannerClickAction(banner);
            }

            public final MarketingBanner getBanner() {
                return this.banner;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010JF\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\u0006\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\t\u0010\u0010¨\u0006$"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$PersonalizedProductListClicked;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action;", "", "uri", "carouselTitle", "", "isFromSeeMoreItems", "Lkk/a;", "carouselType", "isWhiteLabelCarousel", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLkk/a;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()Lkk/a;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLkk/a;Z)Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$PersonalizedProductListClicked;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUri", "getCarouselTitle", "Z", "Lkk/a;", "getCarouselType", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PersonalizedProductListClicked extends Action {
            public static final int $stable = 0;
            private final String carouselTitle;
            private final EnumC15218a carouselType;
            private final boolean isFromSeeMoreItems;
            private final boolean isWhiteLabelCarousel;
            private final String uri;

            /* renamed from: component1, reason: from getter */
            public final String getUri() {
                return this.uri;
            }

            /* renamed from: component2, reason: from getter */
            public final String getCarouselTitle() {
                return this.carouselTitle;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getIsFromSeeMoreItems() {
                return this.isFromSeeMoreItems;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getIsWhiteLabelCarousel() {
                return this.isWhiteLabelCarousel;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PersonalizedProductListClicked)) {
                    return false;
                }
                PersonalizedProductListClicked personalizedProductListClicked = (PersonalizedProductListClicked) other;
                return Intrinsics.e(this.uri, personalizedProductListClicked.uri) && Intrinsics.e(this.carouselTitle, personalizedProductListClicked.carouselTitle) && this.isFromSeeMoreItems == personalizedProductListClicked.isFromSeeMoreItems && this.carouselType == personalizedProductListClicked.carouselType && this.isWhiteLabelCarousel == personalizedProductListClicked.isWhiteLabelCarousel;
            }

            public int hashCode() {
                String str = this.uri;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.carouselTitle;
                return ((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isFromSeeMoreItems)) * 31) + this.carouselType.hashCode()) * 31) + Boolean.hashCode(this.isWhiteLabelCarousel);
            }

            public String toString() {
                return "PersonalizedProductListClicked(uri=" + this.uri + ", carouselTitle=" + this.carouselTitle + ", isFromSeeMoreItems=" + this.isFromSeeMoreItems + ", carouselType=" + this.carouselType + ", isWhiteLabelCarousel=" + this.isWhiteLabelCarousel + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PersonalizedProductListClicked(String str, String str2, boolean z10, EnumC15218a carouselType, boolean z11) {
                super(null);
                Intrinsics.j(carouselType, "carouselType");
                this.uri = str;
                this.carouselTitle = str2;
                this.isFromSeeMoreItems = z10;
                this.carouselType = carouselType;
                this.isWhiteLabelCarousel = z11;
            }

            public static /* synthetic */ PersonalizedProductListClicked copy$default(PersonalizedProductListClicked personalizedProductListClicked, String str, String str2, boolean z10, EnumC15218a enumC15218a, boolean z11, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = personalizedProductListClicked.uri;
                }
                if ((i10 & 2) != 0) {
                    str2 = personalizedProductListClicked.carouselTitle;
                }
                if ((i10 & 4) != 0) {
                    z10 = personalizedProductListClicked.isFromSeeMoreItems;
                }
                if ((i10 & 8) != 0) {
                    enumC15218a = personalizedProductListClicked.carouselType;
                }
                if ((i10 & 16) != 0) {
                    z11 = personalizedProductListClicked.isWhiteLabelCarousel;
                }
                boolean z12 = z11;
                boolean z13 = z10;
                return personalizedProductListClicked.copy(str, str2, z13, enumC15218a, z12);
            }

            /* renamed from: component4, reason: from getter */
            public final EnumC15218a getCarouselType() {
                return this.carouselType;
            }

            public final PersonalizedProductListClicked copy(String uri, String carouselTitle, boolean isFromSeeMoreItems, EnumC15218a carouselType, boolean isWhiteLabelCarousel) {
                Intrinsics.j(carouselType, "carouselType");
                return new PersonalizedProductListClicked(uri, carouselTitle, isFromSeeMoreItems, carouselType, isWhiteLabelCarousel);
            }

            public final String getCarouselTitle() {
                return this.carouselTitle;
            }

            public final EnumC15218a getCarouselType() {
                return this.carouselType;
            }

            public final String getUri() {
                return this.uri;
            }

            public final boolean isFromSeeMoreItems() {
                return this.isFromSeeMoreItems;
            }

            public final boolean isWhiteLabelCarousel() {
                return this.isWhiteLabelCarousel;
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f¨\u0006\""}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$ProductItemClicked;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action;", "Lnk/f;", "productIdentity", "Lii/h;", "trackingState", "", "addedToShoppingList", "<init>", "(Lnk/f;Lii/h;Z)V", "component1", "()Lnk/f;", "component2", "()Lii/h;", "component3", "()Z", "copy", "(Lnk/f;Lii/h;Z)Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$ProductItemClicked;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lnk/f;", "getProductIdentity", "Lii/h;", "getTrackingState", "Z", "getAddedToShoppingList", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ProductItemClicked extends Action {
            public static final int $stable = 8;
            private final boolean addedToShoppingList;
            private final nk.f productIdentity;
            private final AbstractC14761h trackingState;

            /* renamed from: component3, reason: from getter */
            public final boolean getAddedToShoppingList() {
                return this.addedToShoppingList;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ProductItemClicked)) {
                    return false;
                }
                ProductItemClicked productItemClicked = (ProductItemClicked) other;
                return Intrinsics.e(this.productIdentity, productItemClicked.productIdentity) && Intrinsics.e(this.trackingState, productItemClicked.trackingState) && this.addedToShoppingList == productItemClicked.addedToShoppingList;
            }

            public int hashCode() {
                int iHashCode = this.productIdentity.hashCode() * 31;
                AbstractC14761h abstractC14761h = this.trackingState;
                return ((iHashCode + (abstractC14761h == null ? 0 : abstractC14761h.hashCode())) * 31) + Boolean.hashCode(this.addedToShoppingList);
            }

            public String toString() {
                return "ProductItemClicked(productIdentity=" + this.productIdentity + ", trackingState=" + this.trackingState + ", addedToShoppingList=" + this.addedToShoppingList + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ProductItemClicked(nk.f productIdentity, AbstractC14761h abstractC14761h, boolean z10) {
                super(null);
                Intrinsics.j(productIdentity, "productIdentity");
                this.productIdentity = productIdentity;
                this.trackingState = abstractC14761h;
                this.addedToShoppingList = z10;
            }

            public static /* synthetic */ ProductItemClicked copy$default(ProductItemClicked productItemClicked, nk.f fVar, AbstractC14761h abstractC14761h, boolean z10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    fVar = productItemClicked.productIdentity;
                }
                if ((i10 & 2) != 0) {
                    abstractC14761h = productItemClicked.trackingState;
                }
                if ((i10 & 4) != 0) {
                    z10 = productItemClicked.addedToShoppingList;
                }
                return productItemClicked.copy(fVar, abstractC14761h, z10);
            }

            /* renamed from: component1, reason: from getter */
            public final nk.f getProductIdentity() {
                return this.productIdentity;
            }

            /* renamed from: component2, reason: from getter */
            public final AbstractC14761h getTrackingState() {
                return this.trackingState;
            }

            public final ProductItemClicked copy(nk.f productIdentity, AbstractC14761h trackingState, boolean addedToShoppingList) {
                Intrinsics.j(productIdentity, "productIdentity");
                return new ProductItemClicked(productIdentity, trackingState, addedToShoppingList);
            }

            public final boolean getAddedToShoppingList() {
                return this.addedToShoppingList;
            }

            public final nk.f getProductIdentity() {
                return this.productIdentity;
            }

            public final AbstractC14761h getTrackingState() {
                return this.trackingState;
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$RefreshScreen;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class RefreshScreen extends Action {
            public static final int $stable = 0;
            public static final RefreshScreen INSTANCE = new RefreshScreen();

            private RefreshScreen() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof RefreshScreen);
            }

            public int hashCode() {
                return -1280418913;
            }

            public String toString() {
                return "RefreshScreen";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$ResetStepper;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action;", "productCode", "", "<init>", "(Ljava/lang/String;)V", "getProductCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ResetStepper extends Action {
            public static final int $stable = 0;
            private final String productCode;

            public ResetStepper(String str) {
                super(null);
                this.productCode = str;
            }

            public static /* synthetic */ ResetStepper copy$default(ResetStepper resetStepper, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = resetStepper.productCode;
                }
                return resetStepper.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getProductCode() {
                return this.productCode;
            }

            public final ResetStepper copy(String productCode) {
                return new ResetStepper(productCode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ResetStepper) && Intrinsics.e(this.productCode, ((ResetStepper) other).productCode);
            }

            public int hashCode() {
                String str = this.productCode;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "ResetStepper(productCode=" + this.productCode + ')';
            }

            public final String getProductCode() {
                return this.productCode;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u000f¨\u0006#"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$StepperStateChanged;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action;", "LCo/h;", "product", "", "quantityToUpdate", "Landroid/graphics/Rect;", "stepperHitRect", "<init>", "(LCo/h;DLandroid/graphics/Rect;)V", "component1", "()LCo/h;", "component2", "()D", "component3", "()Landroid/graphics/Rect;", "copy", "(LCo/h;DLandroid/graphics/Rect;)Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$StepperStateChanged;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LCo/h;", "getProduct", "D", "getQuantityToUpdate", "Landroid/graphics/Rect;", "getStepperHitRect", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class StepperStateChanged extends Action {
            public static final int $stable = 8;
            private final ProductFullDetails product;
            private final double quantityToUpdate;
            private final Rect stepperHitRect;

            public /* synthetic */ StepperStateChanged(ProductFullDetails productFullDetails, double d10, Rect rect, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(productFullDetails, d10, (i10 & 4) != 0 ? null : rect);
            }

            /* renamed from: component2, reason: from getter */
            public final double getQuantityToUpdate() {
                return this.quantityToUpdate;
            }

            /* renamed from: component3, reason: from getter */
            public final Rect getStepperHitRect() {
                return this.stepperHitRect;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StepperStateChanged)) {
                    return false;
                }
                StepperStateChanged stepperStateChanged = (StepperStateChanged) other;
                return Intrinsics.e(this.product, stepperStateChanged.product) && Double.compare(this.quantityToUpdate, stepperStateChanged.quantityToUpdate) == 0 && Intrinsics.e(this.stepperHitRect, stepperStateChanged.stepperHitRect);
            }

            public int hashCode() {
                int iHashCode = ((this.product.hashCode() * 31) + Double.hashCode(this.quantityToUpdate)) * 31;
                Rect rect = this.stepperHitRect;
                return iHashCode + (rect == null ? 0 : rect.hashCode());
            }

            public String toString() {
                return "StepperStateChanged(product=" + this.product + ", quantityToUpdate=" + this.quantityToUpdate + ", stepperHitRect=" + this.stepperHitRect + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StepperStateChanged(ProductFullDetails product, double d10, Rect rect) {
                super(null);
                Intrinsics.j(product, "product");
                this.product = product;
                this.quantityToUpdate = d10;
                this.stepperHitRect = rect;
            }

            public static /* synthetic */ StepperStateChanged copy$default(StepperStateChanged stepperStateChanged, ProductFullDetails productFullDetails, double d10, Rect rect, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    productFullDetails = stepperStateChanged.product;
                }
                if ((i10 & 2) != 0) {
                    d10 = stepperStateChanged.quantityToUpdate;
                }
                if ((i10 & 4) != 0) {
                    rect = stepperStateChanged.stepperHitRect;
                }
                return stepperStateChanged.copy(productFullDetails, d10, rect);
            }

            /* renamed from: component1, reason: from getter */
            public final ProductFullDetails getProduct() {
                return this.product;
            }

            public final StepperStateChanged copy(ProductFullDetails product, double quantityToUpdate, Rect stepperHitRect) {
                Intrinsics.j(product, "product");
                return new StepperStateChanged(product, quantityToUpdate, stepperHitRect);
            }

            public final ProductFullDetails getProduct() {
                return this.product;
            }

            public final double getQuantityToUpdate() {
                return this.quantityToUpdate;
            }

            public final Rect getStepperHitRect() {
                return this.stepperHitRect;
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$UpdateEntryAction;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action;", "LCo/h;", "product", "", "quantityToUpdate", "<init>", "(LCo/h;D)V", "component1", "()LCo/h;", "component2", "()D", "copy", "(LCo/h;D)Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$UpdateEntryAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LCo/h;", "getProduct", "D", "getQuantityToUpdate", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class UpdateEntryAction extends Action {
            public static final int $stable = 8;
            private final ProductFullDetails product;
            private final double quantityToUpdate;

            /* renamed from: component2, reason: from getter */
            public final double getQuantityToUpdate() {
                return this.quantityToUpdate;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateEntryAction)) {
                    return false;
                }
                UpdateEntryAction updateEntryAction = (UpdateEntryAction) other;
                return Intrinsics.e(this.product, updateEntryAction.product) && Double.compare(this.quantityToUpdate, updateEntryAction.quantityToUpdate) == 0;
            }

            public int hashCode() {
                return (this.product.hashCode() * 31) + Double.hashCode(this.quantityToUpdate);
            }

            public String toString() {
                return "UpdateEntryAction(product=" + this.product + ", quantityToUpdate=" + this.quantityToUpdate + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateEntryAction(ProductFullDetails product, double d10) {
                super(null);
                Intrinsics.j(product, "product");
                this.product = product;
                this.quantityToUpdate = d10;
            }

            public static /* synthetic */ UpdateEntryAction copy$default(UpdateEntryAction updateEntryAction, ProductFullDetails productFullDetails, double d10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    productFullDetails = updateEntryAction.product;
                }
                if ((i10 & 2) != 0) {
                    d10 = updateEntryAction.quantityToUpdate;
                }
                return updateEntryAction.copy(productFullDetails, d10);
            }

            /* renamed from: component1, reason: from getter */
            public final ProductFullDetails getProduct() {
                return this.product;
            }

            public final UpdateEntryAction copy(ProductFullDetails product, double quantityToUpdate) {
                Intrinsics.j(product, "product");
                return new UpdateEntryAction(product, quantityToUpdate);
            }

            public final ProductFullDetails getProduct() {
                return this.product;
            }

            public final double getQuantityToUpdate() {
                return this.quantityToUpdate;
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0010\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004HÆ\u0003J\r\u0010\u0011\u001a\u00060\u0003j\u0002`\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\f\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0005\u001a\u00060\u0003j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$UpdateNotification;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action;", "orderId", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "externalShopperId", "Lcom/meijer/mobile/core/model/common/ExternalShopperId;", "shouldNavigate", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getOrderId", "()Ljava/lang/String;", "getExternalShopperId", "getShouldNavigate", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class UpdateNotification extends Action {
            public static final int $stable = 0;
            private final String externalShopperId;
            private final String orderId;
            private final boolean shouldNavigate;

            public static /* synthetic */ UpdateNotification copy$default(UpdateNotification updateNotification, String str, String str2, boolean z10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = updateNotification.orderId;
                }
                if ((i10 & 2) != 0) {
                    str2 = updateNotification.externalShopperId;
                }
                if ((i10 & 4) != 0) {
                    z10 = updateNotification.shouldNavigate;
                }
                return updateNotification.copy(str, str2, z10);
            }

            /* renamed from: component1, reason: from getter */
            public final String getOrderId() {
                return this.orderId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getExternalShopperId() {
                return this.externalShopperId;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getShouldNavigate() {
                return this.shouldNavigate;
            }

            public final UpdateNotification copy(String orderId, String externalShopperId, boolean shouldNavigate) {
                Intrinsics.j(externalShopperId, "externalShopperId");
                return new UpdateNotification(orderId, externalShopperId, shouldNavigate);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateNotification)) {
                    return false;
                }
                UpdateNotification updateNotification = (UpdateNotification) other;
                return Intrinsics.e(this.orderId, updateNotification.orderId) && Intrinsics.e(this.externalShopperId, updateNotification.externalShopperId) && this.shouldNavigate == updateNotification.shouldNavigate;
            }

            public int hashCode() {
                String str = this.orderId;
                return ((((str == null ? 0 : str.hashCode()) * 31) + this.externalShopperId.hashCode()) * 31) + Boolean.hashCode(this.shouldNavigate);
            }

            public String toString() {
                return "UpdateNotification(orderId=" + this.orderId + ", externalShopperId=" + this.externalShopperId + ", shouldNavigate=" + this.shouldNavigate + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateNotification(String str, String externalShopperId, boolean z10) {
                super(null);
                Intrinsics.j(externalShopperId, "externalShopperId");
                this.orderId = str;
                this.externalShopperId = externalShopperId;
                this.shouldNavigate = z10;
            }

            public final String getExternalShopperId() {
                return this.externalShopperId;
            }

            public final String getOrderId() {
                return this.orderId;
            }

            public final boolean getShouldNavigate() {
                return this.shouldNavigate;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$UpdateOrderStatusPosition;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action;", "position", "", "<init>", "(I)V", "getPosition", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class UpdateOrderStatusPosition extends Action {
            public static final int $stable = 0;
            private final int position;

            public UpdateOrderStatusPosition(int i10) {
                super(null);
                this.position = i10;
            }

            public static /* synthetic */ UpdateOrderStatusPosition copy$default(UpdateOrderStatusPosition updateOrderStatusPosition, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = updateOrderStatusPosition.position;
                }
                return updateOrderStatusPosition.copy(i10);
            }

            /* renamed from: component1, reason: from getter */
            public final int getPosition() {
                return this.position;
            }

            public final UpdateOrderStatusPosition copy(int position) {
                return new UpdateOrderStatusPosition(position);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateOrderStatusPosition) && this.position == ((UpdateOrderStatusPosition) other).position;
            }

            public int hashCode() {
                return Integer.hashCode(this.position);
            }

            public String toString() {
                return "UpdateOrderStatusPosition(position=" + this.position + ')';
            }

            public final int getPosition() {
                return this.position;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$UserAcceptAddToCartAction;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action;", "Lur/a;", "cartUpdateRequest", "<init>", "(Lur/a;)V", "component1", "()Lur/a;", "copy", "(Lur/a;)Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$UserAcceptAddToCartAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lur/a;", "getCartUpdateRequest", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class UserAcceptAddToCartAction extends Action {
            public static final int $stable = 8;
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

            public static /* synthetic */ UserAcceptAddToCartAction copy$default(UserAcceptAddToCartAction userAcceptAddToCartAction, AbstractC17454a abstractC17454a, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    abstractC17454a = userAcceptAddToCartAction.cartUpdateRequest;
                }
                return userAcceptAddToCartAction.copy(abstractC17454a);
            }

            /* renamed from: component1, reason: from getter */
            public final AbstractC17454a getCartUpdateRequest() {
                return this.cartUpdateRequest;
            }

            public final UserAcceptAddToCartAction copy(AbstractC17454a cartUpdateRequest) {
                Intrinsics.j(cartUpdateRequest, "cartUpdateRequest");
                return new UserAcceptAddToCartAction(cartUpdateRequest);
            }

            public final AbstractC17454a getCartUpdateRequest() {
                return this.cartUpdateRequest;
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action$UserLoggedOutAction;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class UserLoggedOutAction extends Action {
            public static final int $stable = 0;
            public static final UserLoggedOutAction INSTANCE = new UserLoggedOutAction();

            private UserLoggedOutAction() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof UserLoggedOutAction);
            }

            public int hashCode() {
                return -520736017;
            }

            public String toString() {
                return "UserLoggedOutAction";
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel", f = "HomeViewModel.kt", l = {442, 444}, m = "getProfileInformation")
    static final class B extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f110172a;

        /* renamed from: b, reason: collision with root package name */
        Object f110173b;

        /* renamed from: c, reason: collision with root package name */
        Object f110174c;

        /* renamed from: d, reason: collision with root package name */
        Object f110175d;

        /* renamed from: e, reason: collision with root package name */
        int f110176e;

        /* renamed from: f, reason: collision with root package name */
        int f110177f;

        /* renamed from: g, reason: collision with root package name */
        int f110178g;

        /* renamed from: h, reason: collision with root package name */
        int f110179h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f110180i;

        /* renamed from: k, reason: collision with root package name */
        int f110182k;

        B(Continuation<? super B> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f110180i = obj;
            this.f110182k |= Integer.MIN_VALUE;
            return HomeViewModel.this.getProfileInformation(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$loadHomeContent$1", f = "HomeViewModel.kt", l = {362}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class C extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f110183a;

        /* renamed from: b, reason: collision with root package name */
        Object f110184b;

        /* renamed from: c, reason: collision with root package name */
        Object f110185c;

        /* renamed from: d, reason: collision with root package name */
        Object f110186d;

        /* renamed from: e, reason: collision with root package name */
        int f110187e;

        /* renamed from: f, reason: collision with root package name */
        int f110188f;

        /* renamed from: g, reason: collision with root package name */
        int f110189g;

        /* renamed from: h, reason: collision with root package name */
        int f110190h;

        /* renamed from: i, reason: collision with root package name */
        int f110191i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f110192j;

        C(Continuation<? super C> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C c10 = HomeViewModel.this.new C(continuation);
            c10.f110192j = obj;
            return c10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110191i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f110192j;
                    HomeViewModel homeViewModel = HomeViewModel.this;
                    Result.Companion companion = Result.INSTANCE;
                    wr.f fVar = homeViewModel.cartInteractor;
                    this.f110192j = interfaceC15783O;
                    this.f110183a = interfaceC15783O;
                    this.f110184b = this;
                    this.f110185c = this;
                    this.f110186d = interfaceC15783O;
                    this.f110187e = 0;
                    this.f110188f = 0;
                    this.f110189g = 0;
                    this.f110190h = 0;
                    this.f110191i = 1;
                    if (wr.f.n(fVar, true, false, this, 2, null) == objF) {
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
                qw.a.INSTANCE.l(thE, "fetchLatestCart failed in HomeViewModel", new Object[0]);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$observeCart$1", f = "HomeViewModel.kt", l = {1360}, m = "invokeSuspend")
    static final class D extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110194a;

        D(Continuation<? super D> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new D(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((D) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110194a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = HomeViewModel.this._events;
                AbstractC6392a.Companion c1204a = AbstractC6392a.INSTANCE;
                HomeEvent.ShowError showError = new HomeEvent.ShowError(c1204a.d(yr.Q.f171738F, new Object[0]), c1204a.d(yr.Q.f171737E, new Object[0]), c1204a.d(yr.Q.f171761b, new Object[0]));
                this.f110194a = 1;
                if (interfaceC16548A.emit(showError, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$onAction$10", f = "HomeViewModel.kt", l = {2077}, m = "invokeSuspend")
    static final class F extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110198a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Action f110200c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        F(Action action, Continuation<? super F> continuation) {
            super(2, continuation);
            this.f110200c = action;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new F(this.f110200c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((F) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110198a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = HomeViewModel.this._events;
                HomeEvent.ViewProductDetails viewProductDetails = new HomeEvent.ViewProductDetails(((Action.ProductItemClicked) this.f110200c).getProductIdentity(), ((Action.ProductItemClicked) this.f110200c).getAddedToShoppingList(), ((Action.ProductItemClicked) this.f110200c).getTrackingState());
                this.f110198a = 1;
                if (interfaceC16548A.emit(viewProductDetails, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$onAction$11", f = "HomeViewModel.kt", l = {2136}, m = "invokeSuspend")
    static final class G extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110201a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f110203c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<AbstractC14761h> f110204d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Action f110205e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        G(Uri uri, Ref.ObjectRef<AbstractC14761h> objectRef, Action action, Continuation<? super G> continuation) {
            super(2, continuation);
            this.f110203c = uri;
            this.f110204d = objectRef;
            this.f110205e = action;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new G(this.f110203c, this.f110204d, this.f110205e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((G) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110201a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = HomeViewModel.this._events;
                HomeEvent.ViewPersonalizedProducts viewPersonalizedProducts = new HomeEvent.ViewPersonalizedProducts(this.f110203c, this.f110204d.f143742a, ((Action.PersonalizedProductListClicked) this.f110205e).getCarouselTitle(), ((Action.PersonalizedProductListClicked) this.f110205e).isFromSeeMoreItems(), ((Action.PersonalizedProductListClicked) this.f110205e).isWhiteLabelCarousel());
                this.f110201a = 1;
                if (interfaceC16548A.emit(viewPersonalizedProducts, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$onAction$13", f = "HomeViewModel.kt", l = {2165}, m = "invokeSuspend")
    static final class H extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110206a;

        H(Continuation<? super H> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new H(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((H) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110206a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = HomeViewModel.this._events;
                HomeEvent.LoginRequiredEvent loginRequiredEvent = new HomeEvent.LoginRequiredEvent(Cj.o.f5056d);
                this.f110206a = 1;
                if (interfaceC16548A.emit(loginRequiredEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u001a\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001dB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u001a\u001e\u001f !\"#$%&'()*+,-./01234567¨\u00068"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent;", "", "<init>", "()V", "HomeChipItemClickedEvent", "NavigateToOrderDetail", "NavigateToUpdatePaymentMethod", "NavigateToRateAndTip", "NavigateToCarouselDeeplink", "ShowResendEmailFailureEvent", "ViewProductDetails", "ViewPersonalizedProducts", "ViewCouponDetails", "ClipCouponFailedEvent", "UpdateCartSuccessEvent", "UpdateCartFailedEvent", "ShowError", "LoginRequiredEvent", "ShowRateAndTipNotification", "ViewRateAndTipActivity", "ViewBannerDeepLinkUrl", "ShowMperksPointsExpiringBottomSheet", "OrderSubstitutionEvent", "ViewSpecialOffers", "NavigateToRedeemMPerksDashboard", "NavigateToYourRewardsMPerksDashboard", "NavigateToLearnMore", "NavigateToMPerksRewards", "ShowMperksClaimRewardError", "ShowChokingWarningDialogEvent", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ClipCouponFailedEvent;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$HomeChipItemClickedEvent;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$LoginRequiredEvent;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$NavigateToCarouselDeeplink;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$NavigateToLearnMore;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$NavigateToMPerksRewards;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$NavigateToOrderDetail;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$NavigateToRateAndTip;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$NavigateToRedeemMPerksDashboard;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$NavigateToUpdatePaymentMethod;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$NavigateToYourRewardsMPerksDashboard;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$OrderSubstitutionEvent;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ShowChokingWarningDialogEvent;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ShowError;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ShowMperksClaimRewardError;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ShowMperksPointsExpiringBottomSheet;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ShowRateAndTipNotification;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ShowResendEmailFailureEvent;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$UpdateCartFailedEvent;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$UpdateCartSuccessEvent;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ViewBannerDeepLinkUrl;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ViewCouponDetails;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ViewPersonalizedProducts;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ViewProductDetails;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ViewRateAndTipActivity;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ViewSpecialOffers;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class HomeEvent {
        public static final int $stable = 0;

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JN\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b$\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b%\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010\u0013R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010\u0015¨\u0006*"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ClipCouponFailedEvent;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent;", "", "titleResId", "messageResId", "positiveButtonResId", "negativeButtonResId", "LPk/a;", "coupon", "Lii/f;", "trackingData", "<init>", "(IIIILPk/a;Lii/f;)V", "component1", "()I", "component2", "component3", "component4", "component5", "()LPk/a;", "component6", "()Lii/f;", "copy", "(IIIILPk/a;Lii/f;)Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ClipCouponFailedEvent;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTitleResId", "getMessageResId", "getPositiveButtonResId", "getNegativeButtonResId", "LPk/a;", "getCoupon", "Lii/f;", "getTrackingData", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ClipCouponFailedEvent extends HomeEvent {
            public static final int $stable = 8;
            private final Coupon coupon;
            private final int messageResId;
            private final int negativeButtonResId;
            private final int positiveButtonResId;
            private final int titleResId;
            private final TrackingData trackingData;

            /* renamed from: component1, reason: from getter */
            public final int getTitleResId() {
                return this.titleResId;
            }

            /* renamed from: component2, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }

            /* renamed from: component3, reason: from getter */
            public final int getPositiveButtonResId() {
                return this.positiveButtonResId;
            }

            /* renamed from: component4, reason: from getter */
            public final int getNegativeButtonResId() {
                return this.negativeButtonResId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ClipCouponFailedEvent)) {
                    return false;
                }
                ClipCouponFailedEvent clipCouponFailedEvent = (ClipCouponFailedEvent) other;
                return this.titleResId == clipCouponFailedEvent.titleResId && this.messageResId == clipCouponFailedEvent.messageResId && this.positiveButtonResId == clipCouponFailedEvent.positiveButtonResId && this.negativeButtonResId == clipCouponFailedEvent.negativeButtonResId && Intrinsics.e(this.coupon, clipCouponFailedEvent.coupon) && Intrinsics.e(this.trackingData, clipCouponFailedEvent.trackingData);
            }

            public int hashCode() {
                int iHashCode = ((((((((Integer.hashCode(this.titleResId) * 31) + Integer.hashCode(this.messageResId)) * 31) + Integer.hashCode(this.positiveButtonResId)) * 31) + Integer.hashCode(this.negativeButtonResId)) * 31) + this.coupon.hashCode()) * 31;
                TrackingData c14759f = this.trackingData;
                return iHashCode + (c14759f == null ? 0 : c14759f.hashCode());
            }

            public String toString() {
                return "ClipCouponFailedEvent(titleResId=" + this.titleResId + ", messageResId=" + this.messageResId + ", positiveButtonResId=" + this.positiveButtonResId + ", negativeButtonResId=" + this.negativeButtonResId + ", coupon=" + this.coupon + ", trackingData=" + this.trackingData + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ClipCouponFailedEvent(int i10, int i11, int i12, int i13, Coupon coupon, TrackingData c14759f) {
                super(null);
                Intrinsics.j(coupon, "coupon");
                this.titleResId = i10;
                this.messageResId = i11;
                this.positiveButtonResId = i12;
                this.negativeButtonResId = i13;
                this.coupon = coupon;
                this.trackingData = c14759f;
            }

            public static /* synthetic */ ClipCouponFailedEvent copy$default(ClipCouponFailedEvent clipCouponFailedEvent, int i10, int i11, int i12, int i13, Coupon coupon, TrackingData c14759f, int i14, Object obj) {
                if ((i14 & 1) != 0) {
                    i10 = clipCouponFailedEvent.titleResId;
                }
                if ((i14 & 2) != 0) {
                    i11 = clipCouponFailedEvent.messageResId;
                }
                if ((i14 & 4) != 0) {
                    i12 = clipCouponFailedEvent.positiveButtonResId;
                }
                if ((i14 & 8) != 0) {
                    i13 = clipCouponFailedEvent.negativeButtonResId;
                }
                if ((i14 & 16) != 0) {
                    coupon = clipCouponFailedEvent.coupon;
                }
                if ((i14 & 32) != 0) {
                    c14759f = clipCouponFailedEvent.trackingData;
                }
                Coupon coupon2 = coupon;
                TrackingData c14759f2 = c14759f;
                return clipCouponFailedEvent.copy(i10, i11, i12, i13, coupon2, c14759f2);
            }

            /* renamed from: component5, reason: from getter */
            public final Coupon getCoupon() {
                return this.coupon;
            }

            /* renamed from: component6, reason: from getter */
            public final TrackingData getTrackingData() {
                return this.trackingData;
            }

            public final ClipCouponFailedEvent copy(int titleResId, int messageResId, int positiveButtonResId, int negativeButtonResId, Coupon coupon, TrackingData trackingData) {
                Intrinsics.j(coupon, "coupon");
                return new ClipCouponFailedEvent(titleResId, messageResId, positiveButtonResId, negativeButtonResId, coupon, trackingData);
            }

            public final Coupon getCoupon() {
                return this.coupon;
            }

            public final int getMessageResId() {
                return this.messageResId;
            }

            public final int getNegativeButtonResId() {
                return this.negativeButtonResId;
            }

            public final int getPositiveButtonResId() {
                return this.positiveButtonResId;
            }

            public final int getTitleResId() {
                return this.titleResId;
            }

            public final TrackingData getTrackingData() {
                return this.trackingData;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$HomeChipItemClickedEvent;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent;", "Lxr/a;", "homeChip", "<init>", "(Lxr/a;)V", "component1", "()Lxr/a;", "copy", "(Lxr/a;)Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$HomeChipItemClickedEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lxr/a;", "getHomeChip", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class HomeChipItemClickedEvent extends HomeEvent {
            public static final int $stable = 8;
            private final InterfaceC18214a homeChip;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof HomeChipItemClickedEvent) && Intrinsics.e(this.homeChip, ((HomeChipItemClickedEvent) other).homeChip);
            }

            public int hashCode() {
                return this.homeChip.hashCode();
            }

            public String toString() {
                return "HomeChipItemClickedEvent(homeChip=" + this.homeChip + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HomeChipItemClickedEvent(InterfaceC18214a homeChip) {
                super(null);
                Intrinsics.j(homeChip, "homeChip");
                this.homeChip = homeChip;
            }

            public static /* synthetic */ HomeChipItemClickedEvent copy$default(HomeChipItemClickedEvent homeChipItemClickedEvent, InterfaceC18214a interfaceC18214a, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    interfaceC18214a = homeChipItemClickedEvent.homeChip;
                }
                return homeChipItemClickedEvent.copy(interfaceC18214a);
            }

            /* renamed from: component1, reason: from getter */
            public final InterfaceC18214a getHomeChip() {
                return this.homeChip;
            }

            public final HomeChipItemClickedEvent copy(InterfaceC18214a homeChip) {
                Intrinsics.j(homeChip, "homeChip");
                return new HomeChipItemClickedEvent(homeChip);
            }

            public final InterfaceC18214a getHomeChip() {
                return this.homeChip;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$LoginRequiredEvent;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent;", "errorMessageId", "", "<init>", "(I)V", "getErrorMessageId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LoginRequiredEvent extends HomeEvent {
            public static final int $stable = 0;
            private final int errorMessageId;

            public LoginRequiredEvent(int i10) {
                super(null);
                this.errorMessageId = i10;
            }

            public static /* synthetic */ LoginRequiredEvent copy$default(LoginRequiredEvent loginRequiredEvent, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = loginRequiredEvent.errorMessageId;
                }
                return loginRequiredEvent.copy(i10);
            }

            /* renamed from: component1, reason: from getter */
            public final int getErrorMessageId() {
                return this.errorMessageId;
            }

            public final LoginRequiredEvent copy(int errorMessageId) {
                return new LoginRequiredEvent(errorMessageId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof LoginRequiredEvent) && this.errorMessageId == ((LoginRequiredEvent) other).errorMessageId;
            }

            public int hashCode() {
                return Integer.hashCode(this.errorMessageId);
            }

            public String toString() {
                return "LoginRequiredEvent(errorMessageId=" + this.errorMessageId + ')';
            }

            public final int getErrorMessageId() {
                return this.errorMessageId;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$NavigateToCarouselDeeplink;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent;", "deeplink", "", "name", "analytics", "viewAll", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getDeeplink", "()Ljava/lang/String;", "getName", "getAnalytics", "getViewAll", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToCarouselDeeplink extends HomeEvent {
            public static final int $stable = 0;
            private final String analytics;
            private final String deeplink;
            private final String name;
            private final boolean viewAll;

            public static /* synthetic */ NavigateToCarouselDeeplink copy$default(NavigateToCarouselDeeplink navigateToCarouselDeeplink, String str, String str2, String str3, boolean z10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = navigateToCarouselDeeplink.deeplink;
                }
                if ((i10 & 2) != 0) {
                    str2 = navigateToCarouselDeeplink.name;
                }
                if ((i10 & 4) != 0) {
                    str3 = navigateToCarouselDeeplink.analytics;
                }
                if ((i10 & 8) != 0) {
                    z10 = navigateToCarouselDeeplink.viewAll;
                }
                return navigateToCarouselDeeplink.copy(str, str2, str3, z10);
            }

            /* renamed from: component1, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            /* renamed from: component2, reason: from getter */
            public final String getName() {
                return this.name;
            }

            /* renamed from: component3, reason: from getter */
            public final String getAnalytics() {
                return this.analytics;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getViewAll() {
                return this.viewAll;
            }

            public final NavigateToCarouselDeeplink copy(String deeplink, String name, String analytics, boolean viewAll) {
                Intrinsics.j(deeplink, "deeplink");
                Intrinsics.j(name, "name");
                return new NavigateToCarouselDeeplink(deeplink, name, analytics, viewAll);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NavigateToCarouselDeeplink)) {
                    return false;
                }
                NavigateToCarouselDeeplink navigateToCarouselDeeplink = (NavigateToCarouselDeeplink) other;
                return Intrinsics.e(this.deeplink, navigateToCarouselDeeplink.deeplink) && Intrinsics.e(this.name, navigateToCarouselDeeplink.name) && Intrinsics.e(this.analytics, navigateToCarouselDeeplink.analytics) && this.viewAll == navigateToCarouselDeeplink.viewAll;
            }

            public int hashCode() {
                int iHashCode = ((this.deeplink.hashCode() * 31) + this.name.hashCode()) * 31;
                String str = this.analytics;
                return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.viewAll);
            }

            public String toString() {
                return "NavigateToCarouselDeeplink(deeplink=" + this.deeplink + ", name=" + this.name + ", analytics=" + this.analytics + ", viewAll=" + this.viewAll + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToCarouselDeeplink(String deeplink, String name, String str, boolean z10) {
                super(null);
                Intrinsics.j(deeplink, "deeplink");
                Intrinsics.j(name, "name");
                this.deeplink = deeplink;
                this.name = name;
                this.analytics = str;
                this.viewAll = z10;
            }

            public final String getAnalytics() {
                return this.analytics;
            }

            public final String getDeeplink() {
                return this.deeplink;
            }

            public final String getName() {
                return this.name;
            }

            public final boolean getViewAll() {
                return this.viewAll;
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$NavigateToLearnMore;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToLearnMore extends HomeEvent {
            public static final int $stable = 0;
            public static final NavigateToLearnMore INSTANCE = new NavigateToLearnMore();

            private NavigateToLearnMore() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof NavigateToLearnMore);
            }

            public int hashCode() {
                return -113923222;
            }

            public String toString() {
                return "NavigateToLearnMore";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$NavigateToMPerksRewards;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent;", "Lco/k;", "rewardDescription", "", "isFromAvailableRewards", "<init>", "(Lco/k;Z)V", "component1", "()Lco/k;", "component2", "()Z", "copy", "(Lco/k;Z)Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$NavigateToMPerksRewards;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lco/k;", "getRewardDescription", "Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToMPerksRewards extends HomeEvent {
            public static final int $stable = 8;
            private final boolean isFromAvailableRewards;
            private final RewardDetail rewardDescription;

            public /* synthetic */ NavigateToMPerksRewards(RewardDetail c6539k, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(c6539k, (i10 & 2) != 0 ? false : z10);
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsFromAvailableRewards() {
                return this.isFromAvailableRewards;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NavigateToMPerksRewards)) {
                    return false;
                }
                NavigateToMPerksRewards navigateToMPerksRewards = (NavigateToMPerksRewards) other;
                return Intrinsics.e(this.rewardDescription, navigateToMPerksRewards.rewardDescription) && this.isFromAvailableRewards == navigateToMPerksRewards.isFromAvailableRewards;
            }

            public int hashCode() {
                return (this.rewardDescription.hashCode() * 31) + Boolean.hashCode(this.isFromAvailableRewards);
            }

            public String toString() {
                return "NavigateToMPerksRewards(rewardDescription=" + this.rewardDescription + ", isFromAvailableRewards=" + this.isFromAvailableRewards + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToMPerksRewards(RewardDetail rewardDescription, boolean z10) {
                super(null);
                Intrinsics.j(rewardDescription, "rewardDescription");
                this.rewardDescription = rewardDescription;
                this.isFromAvailableRewards = z10;
            }

            public static /* synthetic */ NavigateToMPerksRewards copy$default(NavigateToMPerksRewards navigateToMPerksRewards, RewardDetail c6539k, boolean z10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    c6539k = navigateToMPerksRewards.rewardDescription;
                }
                if ((i10 & 2) != 0) {
                    z10 = navigateToMPerksRewards.isFromAvailableRewards;
                }
                return navigateToMPerksRewards.copy(c6539k, z10);
            }

            /* renamed from: component1, reason: from getter */
            public final RewardDetail getRewardDescription() {
                return this.rewardDescription;
            }

            public final NavigateToMPerksRewards copy(RewardDetail rewardDescription, boolean isFromAvailableRewards) {
                Intrinsics.j(rewardDescription, "rewardDescription");
                return new NavigateToMPerksRewards(rewardDescription, isFromAvailableRewards);
            }

            public final RewardDetail getRewardDescription() {
                return this.rewardDescription;
            }

            public final boolean isFromAvailableRewards() {
                return this.isFromAvailableRewards;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$NavigateToOrderDetail;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent;", "orderNumber", "", "viewDetails", "", "previousTrackAction", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "getOrderNumber", "()Ljava/lang/String;", "getViewDetails", "()Z", "getPreviousTrackAction", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToOrderDetail extends HomeEvent {
            public static final int $stable = 0;
            private final String orderNumber;
            private final String previousTrackAction;
            private final boolean viewDetails;

            public static /* synthetic */ NavigateToOrderDetail copy$default(NavigateToOrderDetail navigateToOrderDetail, String str, boolean z10, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = navigateToOrderDetail.orderNumber;
                }
                if ((i10 & 2) != 0) {
                    z10 = navigateToOrderDetail.viewDetails;
                }
                if ((i10 & 4) != 0) {
                    str2 = navigateToOrderDetail.previousTrackAction;
                }
                return navigateToOrderDetail.copy(str, z10, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getOrderNumber() {
                return this.orderNumber;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getViewDetails() {
                return this.viewDetails;
            }

            /* renamed from: component3, reason: from getter */
            public final String getPreviousTrackAction() {
                return this.previousTrackAction;
            }

            public final NavigateToOrderDetail copy(String orderNumber, boolean viewDetails, String previousTrackAction) {
                Intrinsics.j(orderNumber, "orderNumber");
                Intrinsics.j(previousTrackAction, "previousTrackAction");
                return new NavigateToOrderDetail(orderNumber, viewDetails, previousTrackAction);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NavigateToOrderDetail)) {
                    return false;
                }
                NavigateToOrderDetail navigateToOrderDetail = (NavigateToOrderDetail) other;
                return Intrinsics.e(this.orderNumber, navigateToOrderDetail.orderNumber) && this.viewDetails == navigateToOrderDetail.viewDetails && Intrinsics.e(this.previousTrackAction, navigateToOrderDetail.previousTrackAction);
            }

            public int hashCode() {
                return (((this.orderNumber.hashCode() * 31) + Boolean.hashCode(this.viewDetails)) * 31) + this.previousTrackAction.hashCode();
            }

            public String toString() {
                return "NavigateToOrderDetail(orderNumber=" + this.orderNumber + ", viewDetails=" + this.viewDetails + ", previousTrackAction=" + this.previousTrackAction + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToOrderDetail(String orderNumber, boolean z10, String previousTrackAction) {
                super(null);
                Intrinsics.j(orderNumber, "orderNumber");
                Intrinsics.j(previousTrackAction, "previousTrackAction");
                this.orderNumber = orderNumber;
                this.viewDetails = z10;
                this.previousTrackAction = previousTrackAction;
            }

            public final String getOrderNumber() {
                return this.orderNumber;
            }

            public final String getPreviousTrackAction() {
                return this.previousTrackAction;
            }

            public final boolean getViewDetails() {
                return this.viewDetails;
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f¨\u0006!"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$NavigateToRateAndTip;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent;", "", "orderNumber", "Ltp/b;", "rateAndTipBuilder", "Ltp/a;", "flowType", "<init>", "(Ljava/lang/String;Ltp/b;Ltp/a;)V", "component1", "()Ljava/lang/String;", "component2", "()Ltp/b;", "component3", "()Ltp/a;", "copy", "(Ljava/lang/String;Ltp/b;Ltp/a;)Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$NavigateToRateAndTip;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrderNumber", "Ltp/b;", "getRateAndTipBuilder", "Ltp/a;", "getFlowType", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToRateAndTip extends HomeEvent {
            public static final int $stable = 8;
            private final EnumC17276a flowType;
            private final String orderNumber;
            private final Builder rateAndTipBuilder;

            /* renamed from: component1, reason: from getter */
            public final String getOrderNumber() {
                return this.orderNumber;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NavigateToRateAndTip)) {
                    return false;
                }
                NavigateToRateAndTip navigateToRateAndTip = (NavigateToRateAndTip) other;
                return Intrinsics.e(this.orderNumber, navigateToRateAndTip.orderNumber) && Intrinsics.e(this.rateAndTipBuilder, navigateToRateAndTip.rateAndTipBuilder) && this.flowType == navigateToRateAndTip.flowType;
            }

            public int hashCode() {
                return (((this.orderNumber.hashCode() * 31) + this.rateAndTipBuilder.hashCode()) * 31) + this.flowType.hashCode();
            }

            public String toString() {
                return "NavigateToRateAndTip(orderNumber=" + this.orderNumber + ", rateAndTipBuilder=" + this.rateAndTipBuilder + ", flowType=" + this.flowType + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToRateAndTip(String orderNumber, Builder rateAndTipBuilder, EnumC17276a flowType) {
                super(null);
                Intrinsics.j(orderNumber, "orderNumber");
                Intrinsics.j(rateAndTipBuilder, "rateAndTipBuilder");
                Intrinsics.j(flowType, "flowType");
                this.orderNumber = orderNumber;
                this.rateAndTipBuilder = rateAndTipBuilder;
                this.flowType = flowType;
            }

            public static /* synthetic */ NavigateToRateAndTip copy$default(NavigateToRateAndTip navigateToRateAndTip, String str, Builder c17277b, EnumC17276a enumC17276a, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = navigateToRateAndTip.orderNumber;
                }
                if ((i10 & 2) != 0) {
                    c17277b = navigateToRateAndTip.rateAndTipBuilder;
                }
                if ((i10 & 4) != 0) {
                    enumC17276a = navigateToRateAndTip.flowType;
                }
                return navigateToRateAndTip.copy(str, c17277b, enumC17276a);
            }

            /* renamed from: component2, reason: from getter */
            public final Builder getRateAndTipBuilder() {
                return this.rateAndTipBuilder;
            }

            /* renamed from: component3, reason: from getter */
            public final EnumC17276a getFlowType() {
                return this.flowType;
            }

            public final NavigateToRateAndTip copy(String orderNumber, Builder rateAndTipBuilder, EnumC17276a flowType) {
                Intrinsics.j(orderNumber, "orderNumber");
                Intrinsics.j(rateAndTipBuilder, "rateAndTipBuilder");
                Intrinsics.j(flowType, "flowType");
                return new NavigateToRateAndTip(orderNumber, rateAndTipBuilder, flowType);
            }

            public final EnumC17276a getFlowType() {
                return this.flowType;
            }

            public final String getOrderNumber() {
                return this.orderNumber;
            }

            public final Builder getRateAndTipBuilder() {
                return this.rateAndTipBuilder;
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$NavigateToRedeemMPerksDashboard;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToRedeemMPerksDashboard extends HomeEvent {
            public static final int $stable = 0;
            public static final NavigateToRedeemMPerksDashboard INSTANCE = new NavigateToRedeemMPerksDashboard();

            private NavigateToRedeemMPerksDashboard() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof NavigateToRedeemMPerksDashboard);
            }

            public int hashCode() {
                return -556693615;
            }

            public String toString() {
                return "NavigateToRedeemMPerksDashboard";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$NavigateToUpdatePaymentMethod;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent;", "orderNumber", "", "viewDetails", "", "previousTrackAction", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "getOrderNumber", "()Ljava/lang/String;", "getViewDetails", "()Z", "getPreviousTrackAction", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToUpdatePaymentMethod extends HomeEvent {
            public static final int $stable = 0;
            private final String orderNumber;
            private final String previousTrackAction;
            private final boolean viewDetails;

            public static /* synthetic */ NavigateToUpdatePaymentMethod copy$default(NavigateToUpdatePaymentMethod navigateToUpdatePaymentMethod, String str, boolean z10, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = navigateToUpdatePaymentMethod.orderNumber;
                }
                if ((i10 & 2) != 0) {
                    z10 = navigateToUpdatePaymentMethod.viewDetails;
                }
                if ((i10 & 4) != 0) {
                    str2 = navigateToUpdatePaymentMethod.previousTrackAction;
                }
                return navigateToUpdatePaymentMethod.copy(str, z10, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getOrderNumber() {
                return this.orderNumber;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getViewDetails() {
                return this.viewDetails;
            }

            /* renamed from: component3, reason: from getter */
            public final String getPreviousTrackAction() {
                return this.previousTrackAction;
            }

            public final NavigateToUpdatePaymentMethod copy(String orderNumber, boolean viewDetails, String previousTrackAction) {
                Intrinsics.j(orderNumber, "orderNumber");
                Intrinsics.j(previousTrackAction, "previousTrackAction");
                return new NavigateToUpdatePaymentMethod(orderNumber, viewDetails, previousTrackAction);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NavigateToUpdatePaymentMethod)) {
                    return false;
                }
                NavigateToUpdatePaymentMethod navigateToUpdatePaymentMethod = (NavigateToUpdatePaymentMethod) other;
                return Intrinsics.e(this.orderNumber, navigateToUpdatePaymentMethod.orderNumber) && this.viewDetails == navigateToUpdatePaymentMethod.viewDetails && Intrinsics.e(this.previousTrackAction, navigateToUpdatePaymentMethod.previousTrackAction);
            }

            public int hashCode() {
                return (((this.orderNumber.hashCode() * 31) + Boolean.hashCode(this.viewDetails)) * 31) + this.previousTrackAction.hashCode();
            }

            public String toString() {
                return "NavigateToUpdatePaymentMethod(orderNumber=" + this.orderNumber + ", viewDetails=" + this.viewDetails + ", previousTrackAction=" + this.previousTrackAction + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToUpdatePaymentMethod(String orderNumber, boolean z10, String previousTrackAction) {
                super(null);
                Intrinsics.j(orderNumber, "orderNumber");
                Intrinsics.j(previousTrackAction, "previousTrackAction");
                this.orderNumber = orderNumber;
                this.viewDetails = z10;
                this.previousTrackAction = previousTrackAction;
            }

            public final String getOrderNumber() {
                return this.orderNumber;
            }

            public final String getPreviousTrackAction() {
                return this.previousTrackAction;
            }

            public final boolean getViewDetails() {
                return this.viewDetails;
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$NavigateToYourRewardsMPerksDashboard;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent;", "", "LWl/c;", "clippedRewards", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$NavigateToYourRewardsMPerksDashboard;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getClippedRewards", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToYourRewardsMPerksDashboard extends HomeEvent {
            public static final int $stable = 8;
            private final List<HomeMperksClippedReward> clippedRewards;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ NavigateToYourRewardsMPerksDashboard copy$default(NavigateToYourRewardsMPerksDashboard navigateToYourRewardsMPerksDashboard, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    list = navigateToYourRewardsMPerksDashboard.clippedRewards;
                }
                return navigateToYourRewardsMPerksDashboard.copy(list);
            }

            public final List<HomeMperksClippedReward> component1() {
                return this.clippedRewards;
            }

            public final NavigateToYourRewardsMPerksDashboard copy(List<HomeMperksClippedReward> clippedRewards) {
                Intrinsics.j(clippedRewards, "clippedRewards");
                return new NavigateToYourRewardsMPerksDashboard(clippedRewards);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NavigateToYourRewardsMPerksDashboard) && Intrinsics.e(this.clippedRewards, ((NavigateToYourRewardsMPerksDashboard) other).clippedRewards);
            }

            public int hashCode() {
                return this.clippedRewards.hashCode();
            }

            public String toString() {
                return "NavigateToYourRewardsMPerksDashboard(clippedRewards=" + this.clippedRewards + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToYourRewardsMPerksDashboard(List<HomeMperksClippedReward> clippedRewards) {
                super(null);
                Intrinsics.j(clippedRewards, "clippedRewards");
                this.clippedRewards = clippedRewards;
            }

            public final List<HomeMperksClippedReward> getClippedRewards() {
                return this.clippedRewards;
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0012J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014Jf\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0012J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0012R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b\n\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b-\u0010\u0012R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b.\u0010\u0012R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b/\u0010\u0014¨\u00060"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$OrderSubstitutionEvent;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent;", "", "orderNumber", "", "Lvo/a;", "listSubstitutedItems", "Lvo/b;", "substitutionScreenType", "", "isOnMyWayClicked", "orderType", "pickupPersonName", "Luo/a;", "listOutOfStockItems", "<init>", "(Ljava/lang/String;Ljava/util/List;Lvo/b;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lvo/b;", "component4", "()Z", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/util/List;Lvo/b;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$OrderSubstitutionEvent;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrderNumber", "Ljava/util/List;", "getListSubstitutedItems", "Lvo/b;", "getSubstitutionScreenType", "Z", "getOrderType", "getPickupPersonName", "getListOutOfStockItems", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OrderSubstitutionEvent extends HomeEvent {
            public static final int $stable = 8;
            private final boolean isOnMyWayClicked;
            private final List<OrderOutOfStockItem> listOutOfStockItems;
            private final List<OrderSubstitutionItem> listSubstitutedItems;
            private final String orderNumber;
            private final String orderType;
            private final String pickupPersonName;
            private final vo.b substitutionScreenType;

            /* renamed from: component1, reason: from getter */
            public final String getOrderNumber() {
                return this.orderNumber;
            }

            public final List<OrderSubstitutionItem> component2() {
                return this.listSubstitutedItems;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getIsOnMyWayClicked() {
                return this.isOnMyWayClicked;
            }

            /* renamed from: component5, reason: from getter */
            public final String getOrderType() {
                return this.orderType;
            }

            /* renamed from: component6, reason: from getter */
            public final String getPickupPersonName() {
                return this.pickupPersonName;
            }

            public final List<OrderOutOfStockItem> component7() {
                return this.listOutOfStockItems;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OrderSubstitutionEvent)) {
                    return false;
                }
                OrderSubstitutionEvent orderSubstitutionEvent = (OrderSubstitutionEvent) other;
                return Intrinsics.e(this.orderNumber, orderSubstitutionEvent.orderNumber) && Intrinsics.e(this.listSubstitutedItems, orderSubstitutionEvent.listSubstitutedItems) && this.substitutionScreenType == orderSubstitutionEvent.substitutionScreenType && this.isOnMyWayClicked == orderSubstitutionEvent.isOnMyWayClicked && Intrinsics.e(this.orderType, orderSubstitutionEvent.orderType) && Intrinsics.e(this.pickupPersonName, orderSubstitutionEvent.pickupPersonName) && Intrinsics.e(this.listOutOfStockItems, orderSubstitutionEvent.listOutOfStockItems);
            }

            public int hashCode() {
                int iHashCode = ((((((this.orderNumber.hashCode() * 31) + this.listSubstitutedItems.hashCode()) * 31) + this.substitutionScreenType.hashCode()) * 31) + Boolean.hashCode(this.isOnMyWayClicked)) * 31;
                String str = this.orderType;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.pickupPersonName;
                return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.listOutOfStockItems.hashCode();
            }

            public String toString() {
                return "OrderSubstitutionEvent(orderNumber=" + this.orderNumber + ", listSubstitutedItems=" + this.listSubstitutedItems + ", substitutionScreenType=" + this.substitutionScreenType + ", isOnMyWayClicked=" + this.isOnMyWayClicked + ", orderType=" + this.orderType + ", pickupPersonName=" + this.pickupPersonName + ", listOutOfStockItems=" + this.listOutOfStockItems + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OrderSubstitutionEvent(String orderNumber, List<OrderSubstitutionItem> listSubstitutedItems, vo.b substitutionScreenType, boolean z10, String str, String str2, List<OrderOutOfStockItem> listOutOfStockItems) {
                super(null);
                Intrinsics.j(orderNumber, "orderNumber");
                Intrinsics.j(listSubstitutedItems, "listSubstitutedItems");
                Intrinsics.j(substitutionScreenType, "substitutionScreenType");
                Intrinsics.j(listOutOfStockItems, "listOutOfStockItems");
                this.orderNumber = orderNumber;
                this.listSubstitutedItems = listSubstitutedItems;
                this.substitutionScreenType = substitutionScreenType;
                this.isOnMyWayClicked = z10;
                this.orderType = str;
                this.pickupPersonName = str2;
                this.listOutOfStockItems = listOutOfStockItems;
            }

            public static /* synthetic */ OrderSubstitutionEvent copy$default(OrderSubstitutionEvent orderSubstitutionEvent, String str, List list, vo.b bVar, boolean z10, String str2, String str3, List list2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = orderSubstitutionEvent.orderNumber;
                }
                if ((i10 & 2) != 0) {
                    list = orderSubstitutionEvent.listSubstitutedItems;
                }
                if ((i10 & 4) != 0) {
                    bVar = orderSubstitutionEvent.substitutionScreenType;
                }
                if ((i10 & 8) != 0) {
                    z10 = orderSubstitutionEvent.isOnMyWayClicked;
                }
                if ((i10 & 16) != 0) {
                    str2 = orderSubstitutionEvent.orderType;
                }
                if ((i10 & 32) != 0) {
                    str3 = orderSubstitutionEvent.pickupPersonName;
                }
                if ((i10 & 64) != 0) {
                    list2 = orderSubstitutionEvent.listOutOfStockItems;
                }
                String str4 = str3;
                List list3 = list2;
                String str5 = str2;
                vo.b bVar2 = bVar;
                return orderSubstitutionEvent.copy(str, list, bVar2, z10, str5, str4, list3);
            }

            /* renamed from: component3, reason: from getter */
            public final vo.b getSubstitutionScreenType() {
                return this.substitutionScreenType;
            }

            public final OrderSubstitutionEvent copy(String orderNumber, List<OrderSubstitutionItem> listSubstitutedItems, vo.b substitutionScreenType, boolean isOnMyWayClicked, String orderType, String pickupPersonName, List<OrderOutOfStockItem> listOutOfStockItems) {
                Intrinsics.j(orderNumber, "orderNumber");
                Intrinsics.j(listSubstitutedItems, "listSubstitutedItems");
                Intrinsics.j(substitutionScreenType, "substitutionScreenType");
                Intrinsics.j(listOutOfStockItems, "listOutOfStockItems");
                return new OrderSubstitutionEvent(orderNumber, listSubstitutedItems, substitutionScreenType, isOnMyWayClicked, orderType, pickupPersonName, listOutOfStockItems);
            }

            public final List<OrderOutOfStockItem> getListOutOfStockItems() {
                return this.listOutOfStockItems;
            }

            public final List<OrderSubstitutionItem> getListSubstitutedItems() {
                return this.listSubstitutedItems;
            }

            public final String getOrderNumber() {
                return this.orderNumber;
            }

            public final String getOrderType() {
                return this.orderType;
            }

            public final String getPickupPersonName() {
                return this.pickupPersonName;
            }

            public final vo.b getSubstitutionScreenType() {
                return this.substitutionScreenType;
            }

            public final boolean isOnMyWayClicked() {
                return this.isOnMyWayClicked;
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ShowChokingWarningDialogEvent;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent;", "LIr/a;", "Lur/a;", "dialogInfo", "<init>", "(LIr/a;)V", "component1", "()LIr/a;", "copy", "(LIr/a;)Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ShowChokingWarningDialogEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LIr/a;", "getDialogInfo", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowChokingWarningDialogEvent extends HomeEvent {
            public static final int $stable = 8;
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

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ShowChokingWarningDialogEvent copy$default(ShowChokingWarningDialogEvent showChokingWarningDialogEvent, UserActionDialogInfo userActionDialogInfo, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    userActionDialogInfo = showChokingWarningDialogEvent.dialogInfo;
                }
                return showChokingWarningDialogEvent.copy(userActionDialogInfo);
            }

            public final UserActionDialogInfo<AbstractC17454a> component1() {
                return this.dialogInfo;
            }

            public final ShowChokingWarningDialogEvent copy(UserActionDialogInfo<AbstractC17454a> dialogInfo) {
                Intrinsics.j(dialogInfo, "dialogInfo");
                return new ShowChokingWarningDialogEvent(dialogInfo);
            }

            public final UserActionDialogInfo<AbstractC17454a> getDialogInfo() {
                return this.dialogInfo;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ShowError;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent;", "Lbk/a;", "title", "message", "positiveButtonText", "<init>", "(Lbk/a;Lbk/a;Lbk/a;)V", "component1", "()Lbk/a;", "component2", "component3", "copy", "(Lbk/a;Lbk/a;Lbk/a;)Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ShowError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbk/a;", "getTitle", "getMessage", "getPositiveButtonText", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowError extends HomeEvent {
            public static final int $stable = AbstractC6392a.f60445b;
            private final AbstractC6392a message;
            private final AbstractC6392a positiveButtonText;
            private final AbstractC6392a title;

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

            public static /* synthetic */ ShowError copy$default(ShowError showError, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    abstractC6392a = showError.title;
                }
                if ((i10 & 2) != 0) {
                    abstractC6392a2 = showError.message;
                }
                if ((i10 & 4) != 0) {
                    abstractC6392a3 = showError.positiveButtonText;
                }
                return showError.copy(abstractC6392a, abstractC6392a2, abstractC6392a3);
            }

            /* renamed from: component1, reason: from getter */
            public final AbstractC6392a getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final AbstractC6392a getMessage() {
                return this.message;
            }

            /* renamed from: component3, reason: from getter */
            public final AbstractC6392a getPositiveButtonText() {
                return this.positiveButtonText;
            }

            public final ShowError copy(AbstractC6392a title, AbstractC6392a message, AbstractC6392a positiveButtonText) {
                Intrinsics.j(title, "title");
                Intrinsics.j(message, "message");
                Intrinsics.j(positiveButtonText, "positiveButtonText");
                return new ShowError(title, message, positiveButtonText);
            }

            public final AbstractC6392a getMessage() {
                return this.message;
            }

            public final AbstractC6392a getPositiveButtonText() {
                return this.positiveButtonText;
            }

            public final AbstractC6392a getTitle() {
                return this.title;
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ShowMperksClaimRewardError;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowMperksClaimRewardError extends HomeEvent {
            public static final int $stable = 0;
            public static final ShowMperksClaimRewardError INSTANCE = new ShowMperksClaimRewardError();

            private ShowMperksClaimRewardError() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowMperksClaimRewardError);
            }

            public int hashCode() {
                return 1242956789;
            }

            public String toString() {
                return "ShowMperksClaimRewardError";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ShowMperksPointsExpiringBottomSheet;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent;", "mperksPointsExpData", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$MperksPointsExpData;", "<init>", "(Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$MperksPointsExpData;)V", "getMperksPointsExpData", "()Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$MperksPointsExpData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowMperksPointsExpiringBottomSheet extends HomeEvent {
            public static final int $stable = 8;
            private final MperksPointsExpData mperksPointsExpData;

            public static /* synthetic */ ShowMperksPointsExpiringBottomSheet copy$default(ShowMperksPointsExpiringBottomSheet showMperksPointsExpiringBottomSheet, MperksPointsExpData mperksPointsExpData, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    mperksPointsExpData = showMperksPointsExpiringBottomSheet.mperksPointsExpData;
                }
                return showMperksPointsExpiringBottomSheet.copy(mperksPointsExpData);
            }

            /* renamed from: component1, reason: from getter */
            public final MperksPointsExpData getMperksPointsExpData() {
                return this.mperksPointsExpData;
            }

            public final ShowMperksPointsExpiringBottomSheet copy(MperksPointsExpData mperksPointsExpData) {
                Intrinsics.j(mperksPointsExpData, "mperksPointsExpData");
                return new ShowMperksPointsExpiringBottomSheet(mperksPointsExpData);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowMperksPointsExpiringBottomSheet) && Intrinsics.e(this.mperksPointsExpData, ((ShowMperksPointsExpiringBottomSheet) other).mperksPointsExpData);
            }

            public int hashCode() {
                return this.mperksPointsExpData.hashCode();
            }

            public String toString() {
                return "ShowMperksPointsExpiringBottomSheet(mperksPointsExpData=" + this.mperksPointsExpData + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowMperksPointsExpiringBottomSheet(MperksPointsExpData mperksPointsExpData) {
                super(null);
                Intrinsics.j(mperksPointsExpData, "mperksPointsExpData");
                this.mperksPointsExpData = mperksPointsExpData;
            }

            public final MperksPointsExpData getMperksPointsExpData() {
                return this.mperksPointsExpData;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ShowRateAndTipNotification;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent;", "Lpl/a;", "tipData", "<init>", "(Lpl/a;)V", "component1", "()Lpl/a;", "copy", "(Lpl/a;)Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ShowRateAndTipNotification;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lpl/a;", "getTipData", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowRateAndTipNotification extends HomeEvent {
            public static final int $stable = 8;
            private final TipData tipData;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowRateAndTipNotification) && Intrinsics.e(this.tipData, ((ShowRateAndTipNotification) other).tipData);
            }

            public int hashCode() {
                return this.tipData.hashCode();
            }

            public String toString() {
                return "ShowRateAndTipNotification(tipData=" + this.tipData + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowRateAndTipNotification(TipData tipData) {
                super(null);
                Intrinsics.j(tipData, "tipData");
                this.tipData = tipData;
            }

            public static /* synthetic */ ShowRateAndTipNotification copy$default(ShowRateAndTipNotification showRateAndTipNotification, TipData c16462a, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    c16462a = showRateAndTipNotification.tipData;
                }
                return showRateAndTipNotification.copy(c16462a);
            }

            /* renamed from: component1, reason: from getter */
            public final TipData getTipData() {
                return this.tipData;
            }

            public final ShowRateAndTipNotification copy(TipData tipData) {
                Intrinsics.j(tipData, "tipData");
                return new ShowRateAndTipNotification(tipData);
            }

            public final TipData getTipData() {
                return this.tipData;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ShowResendEmailFailureEvent;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent;", "messageResId", "", "<init>", "(I)V", "getMessageResId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowResendEmailFailureEvent extends HomeEvent {
            public static final int $stable = 0;
            private final int messageResId;

            public ShowResendEmailFailureEvent(int i10) {
                super(null);
                this.messageResId = i10;
            }

            public static /* synthetic */ ShowResendEmailFailureEvent copy$default(ShowResendEmailFailureEvent showResendEmailFailureEvent, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = showResendEmailFailureEvent.messageResId;
                }
                return showResendEmailFailureEvent.copy(i10);
            }

            /* renamed from: component1, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }

            public final ShowResendEmailFailureEvent copy(int messageResId) {
                return new ShowResendEmailFailureEvent(messageResId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowResendEmailFailureEvent) && this.messageResId == ((ShowResendEmailFailureEvent) other).messageResId;
            }

            public int hashCode() {
                return Integer.hashCode(this.messageResId);
            }

            public String toString() {
                return "ShowResendEmailFailureEvent(messageResId=" + this.messageResId + ')';
            }

            public final int getMessageResId() {
                return this.messageResId;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$UpdateCartFailedEvent;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent;", "messageResId", "", "<init>", "(I)V", "getMessageResId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class UpdateCartFailedEvent extends HomeEvent {
            public static final int $stable = 0;
            private final int messageResId;

            public UpdateCartFailedEvent(int i10) {
                super(null);
                this.messageResId = i10;
            }

            public static /* synthetic */ UpdateCartFailedEvent copy$default(UpdateCartFailedEvent updateCartFailedEvent, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = updateCartFailedEvent.messageResId;
                }
                return updateCartFailedEvent.copy(i10);
            }

            /* renamed from: component1, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }

            public final UpdateCartFailedEvent copy(int messageResId) {
                return new UpdateCartFailedEvent(messageResId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateCartFailedEvent) && this.messageResId == ((UpdateCartFailedEvent) other).messageResId;
            }

            public int hashCode() {
                return Integer.hashCode(this.messageResId);
            }

            public String toString() {
                return "UpdateCartFailedEvent(messageResId=" + this.messageResId + ')';
            }

            public final int getMessageResId() {
                return this.messageResId;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$UpdateCartSuccessEvent;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent;", "", "messageResId", "actionResId", "Lfj/i;", "entry", "<init>", "(IILfj/i;)V", "component1", "()I", "component2", "component3", "()Lfj/i;", "copy", "(IILfj/i;)Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$UpdateCartSuccessEvent;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMessageResId", "getActionResId", "Lfj/i;", "getEntry", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class UpdateCartSuccessEvent extends HomeEvent {
            public static final int $stable = 8;
            private final int actionResId;
            private final Entry entry;
            private final int messageResId;

            public /* synthetic */ UpdateCartSuccessEvent(int i10, int i11, Entry entry, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10, i11, (i12 & 4) != 0 ? null : entry);
            }

            /* renamed from: component1, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }

            /* renamed from: component2, reason: from getter */
            public final int getActionResId() {
                return this.actionResId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateCartSuccessEvent)) {
                    return false;
                }
                UpdateCartSuccessEvent updateCartSuccessEvent = (UpdateCartSuccessEvent) other;
                return this.messageResId == updateCartSuccessEvent.messageResId && this.actionResId == updateCartSuccessEvent.actionResId && Intrinsics.e(this.entry, updateCartSuccessEvent.entry);
            }

            public int hashCode() {
                int iHashCode = ((Integer.hashCode(this.messageResId) * 31) + Integer.hashCode(this.actionResId)) * 31;
                Entry entry = this.entry;
                return iHashCode + (entry == null ? 0 : entry.hashCode());
            }

            public String toString() {
                return "UpdateCartSuccessEvent(messageResId=" + this.messageResId + ", actionResId=" + this.actionResId + ", entry=" + this.entry + ')';
            }

            public UpdateCartSuccessEvent(int i10, int i11, Entry entry) {
                super(null);
                this.messageResId = i10;
                this.actionResId = i11;
                this.entry = entry;
            }

            public static /* synthetic */ UpdateCartSuccessEvent copy$default(UpdateCartSuccessEvent updateCartSuccessEvent, int i10, int i11, Entry entry, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i10 = updateCartSuccessEvent.messageResId;
                }
                if ((i12 & 2) != 0) {
                    i11 = updateCartSuccessEvent.actionResId;
                }
                if ((i12 & 4) != 0) {
                    entry = updateCartSuccessEvent.entry;
                }
                return updateCartSuccessEvent.copy(i10, i11, entry);
            }

            /* renamed from: component3, reason: from getter */
            public final Entry getEntry() {
                return this.entry;
            }

            public final UpdateCartSuccessEvent copy(int messageResId, int actionResId, Entry entry) {
                return new UpdateCartSuccessEvent(messageResId, actionResId, entry);
            }

            public final int getActionResId() {
                return this.actionResId;
            }

            public final Entry getEntry() {
                return this.entry;
            }

            public final int getMessageResId() {
                return this.messageResId;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ViewBannerDeepLinkUrl;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent;", "bannerDeepLinkURL", "", "campaignIdValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBannerDeepLinkURL", "()Ljava/lang/String;", "getCampaignIdValue", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ViewBannerDeepLinkUrl extends HomeEvent {
            public static final int $stable = 0;
            private final String bannerDeepLinkURL;
            private final String campaignIdValue;

            public static /* synthetic */ ViewBannerDeepLinkUrl copy$default(ViewBannerDeepLinkUrl viewBannerDeepLinkUrl, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = viewBannerDeepLinkUrl.bannerDeepLinkURL;
                }
                if ((i10 & 2) != 0) {
                    str2 = viewBannerDeepLinkUrl.campaignIdValue;
                }
                return viewBannerDeepLinkUrl.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getBannerDeepLinkURL() {
                return this.bannerDeepLinkURL;
            }

            /* renamed from: component2, reason: from getter */
            public final String getCampaignIdValue() {
                return this.campaignIdValue;
            }

            public final ViewBannerDeepLinkUrl copy(String bannerDeepLinkURL, String campaignIdValue) {
                Intrinsics.j(bannerDeepLinkURL, "bannerDeepLinkURL");
                Intrinsics.j(campaignIdValue, "campaignIdValue");
                return new ViewBannerDeepLinkUrl(bannerDeepLinkURL, campaignIdValue);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ViewBannerDeepLinkUrl)) {
                    return false;
                }
                ViewBannerDeepLinkUrl viewBannerDeepLinkUrl = (ViewBannerDeepLinkUrl) other;
                return Intrinsics.e(this.bannerDeepLinkURL, viewBannerDeepLinkUrl.bannerDeepLinkURL) && Intrinsics.e(this.campaignIdValue, viewBannerDeepLinkUrl.campaignIdValue);
            }

            public int hashCode() {
                return (this.bannerDeepLinkURL.hashCode() * 31) + this.campaignIdValue.hashCode();
            }

            public String toString() {
                return "ViewBannerDeepLinkUrl(bannerDeepLinkURL=" + this.bannerDeepLinkURL + ", campaignIdValue=" + this.campaignIdValue + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ViewBannerDeepLinkUrl(String bannerDeepLinkURL, String campaignIdValue) {
                super(null);
                Intrinsics.j(bannerDeepLinkURL, "bannerDeepLinkURL");
                Intrinsics.j(campaignIdValue, "campaignIdValue");
                this.bannerDeepLinkURL = bannerDeepLinkURL;
                this.campaignIdValue = campaignIdValue;
            }

            public final String getBannerDeepLinkURL() {
                return this.bannerDeepLinkURL;
            }

            public final String getCampaignIdValue() {
                return this.campaignIdValue;
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ViewCouponDetails;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent;", "LPk/c;", "coupon", "Lii/f;", "trackingData", "<init>", "(LPk/c;Lii/f;)V", "component1", "()LPk/c;", "component2", "()Lii/f;", "copy", "(LPk/c;Lii/f;)Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ViewCouponDetails;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LPk/c;", "getCoupon", "Lii/f;", "getTrackingData", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ViewCouponDetails extends HomeEvent {
            public static final int $stable = 8;
            private final Pk.c coupon;
            private final TrackingData trackingData;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ViewCouponDetails)) {
                    return false;
                }
                ViewCouponDetails viewCouponDetails = (ViewCouponDetails) other;
                return Intrinsics.e(this.coupon, viewCouponDetails.coupon) && Intrinsics.e(this.trackingData, viewCouponDetails.trackingData);
            }

            public int hashCode() {
                int iHashCode = this.coupon.hashCode() * 31;
                TrackingData c14759f = this.trackingData;
                return iHashCode + (c14759f == null ? 0 : c14759f.hashCode());
            }

            public String toString() {
                return "ViewCouponDetails(coupon=" + this.coupon + ", trackingData=" + this.trackingData + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ViewCouponDetails(Pk.c coupon, TrackingData c14759f) {
                super(null);
                Intrinsics.j(coupon, "coupon");
                this.coupon = coupon;
                this.trackingData = c14759f;
            }

            public static /* synthetic */ ViewCouponDetails copy$default(ViewCouponDetails viewCouponDetails, Pk.c cVar, TrackingData c14759f, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    cVar = viewCouponDetails.coupon;
                }
                if ((i10 & 2) != 0) {
                    c14759f = viewCouponDetails.trackingData;
                }
                return viewCouponDetails.copy(cVar, c14759f);
            }

            /* renamed from: component1, reason: from getter */
            public final Pk.c getCoupon() {
                return this.coupon;
            }

            /* renamed from: component2, reason: from getter */
            public final TrackingData getTrackingData() {
                return this.trackingData;
            }

            public final ViewCouponDetails copy(Pk.c coupon, TrackingData trackingData) {
                Intrinsics.j(coupon, "coupon");
                return new ViewCouponDetails(coupon, trackingData);
            }

            public final Pk.c getCoupon() {
                return this.coupon;
            }

            public final TrackingData getTrackingData() {
                return this.trackingData;
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014JH\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b\t\u0010\u0014R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b\n\u0010\u0014¨\u0006'"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ViewPersonalizedProducts;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent;", "Landroid/net/Uri;", "uri", "Lii/h;", "trackingState", "", "carouselTitle", "", "isFromSeeMoreItems", "isWhiteLabelCarousel", "<init>", "(Landroid/net/Uri;Lii/h;Ljava/lang/String;ZZ)V", "component1", "()Landroid/net/Uri;", "component2", "()Lii/h;", "component3", "()Ljava/lang/String;", "component4", "()Z", "component5", "copy", "(Landroid/net/Uri;Lii/h;Ljava/lang/String;ZZ)Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ViewPersonalizedProducts;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/net/Uri;", "getUri", "Lii/h;", "getTrackingState", "Ljava/lang/String;", "getCarouselTitle", "Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ViewPersonalizedProducts extends HomeEvent {
            public static final int $stable = 8;
            private final String carouselTitle;
            private final boolean isFromSeeMoreItems;
            private final boolean isWhiteLabelCarousel;
            private final AbstractC14761h trackingState;
            private final Uri uri;

            public ViewPersonalizedProducts(Uri uri, AbstractC14761h abstractC14761h, String str, boolean z10, boolean z11) {
                super(null);
                this.uri = uri;
                this.trackingState = abstractC14761h;
                this.carouselTitle = str;
                this.isFromSeeMoreItems = z10;
                this.isWhiteLabelCarousel = z11;
            }

            /* renamed from: component1, reason: from getter */
            public final Uri getUri() {
                return this.uri;
            }

            /* renamed from: component3, reason: from getter */
            public final String getCarouselTitle() {
                return this.carouselTitle;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getIsFromSeeMoreItems() {
                return this.isFromSeeMoreItems;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getIsWhiteLabelCarousel() {
                return this.isWhiteLabelCarousel;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ViewPersonalizedProducts)) {
                    return false;
                }
                ViewPersonalizedProducts viewPersonalizedProducts = (ViewPersonalizedProducts) other;
                return Intrinsics.e(this.uri, viewPersonalizedProducts.uri) && Intrinsics.e(this.trackingState, viewPersonalizedProducts.trackingState) && Intrinsics.e(this.carouselTitle, viewPersonalizedProducts.carouselTitle) && this.isFromSeeMoreItems == viewPersonalizedProducts.isFromSeeMoreItems && this.isWhiteLabelCarousel == viewPersonalizedProducts.isWhiteLabelCarousel;
            }

            public int hashCode() {
                Uri uri = this.uri;
                int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
                AbstractC14761h abstractC14761h = this.trackingState;
                int iHashCode2 = (iHashCode + (abstractC14761h == null ? 0 : abstractC14761h.hashCode())) * 31;
                String str = this.carouselTitle;
                return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.isFromSeeMoreItems)) * 31) + Boolean.hashCode(this.isWhiteLabelCarousel);
            }

            public String toString() {
                return "ViewPersonalizedProducts(uri=" + this.uri + ", trackingState=" + this.trackingState + ", carouselTitle=" + this.carouselTitle + ", isFromSeeMoreItems=" + this.isFromSeeMoreItems + ", isWhiteLabelCarousel=" + this.isWhiteLabelCarousel + ')';
            }

            public static /* synthetic */ ViewPersonalizedProducts copy$default(ViewPersonalizedProducts viewPersonalizedProducts, Uri uri, AbstractC14761h abstractC14761h, String str, boolean z10, boolean z11, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    uri = viewPersonalizedProducts.uri;
                }
                if ((i10 & 2) != 0) {
                    abstractC14761h = viewPersonalizedProducts.trackingState;
                }
                if ((i10 & 4) != 0) {
                    str = viewPersonalizedProducts.carouselTitle;
                }
                if ((i10 & 8) != 0) {
                    z10 = viewPersonalizedProducts.isFromSeeMoreItems;
                }
                if ((i10 & 16) != 0) {
                    z11 = viewPersonalizedProducts.isWhiteLabelCarousel;
                }
                boolean z12 = z11;
                String str2 = str;
                return viewPersonalizedProducts.copy(uri, abstractC14761h, str2, z10, z12);
            }

            /* renamed from: component2, reason: from getter */
            public final AbstractC14761h getTrackingState() {
                return this.trackingState;
            }

            public final ViewPersonalizedProducts copy(Uri uri, AbstractC14761h trackingState, String carouselTitle, boolean isFromSeeMoreItems, boolean isWhiteLabelCarousel) {
                return new ViewPersonalizedProducts(uri, trackingState, carouselTitle, isFromSeeMoreItems, isWhiteLabelCarousel);
            }

            public final String getCarouselTitle() {
                return this.carouselTitle;
            }

            public final AbstractC14761h getTrackingState() {
                return this.trackingState;
            }

            public final Uri getUri() {
                return this.uri;
            }

            public final boolean isFromSeeMoreItems() {
                return this.isFromSeeMoreItems;
            }

            public final boolean isWhiteLabelCarousel() {
                return this.isWhiteLabelCarousel;
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f¨\u0006\""}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ViewProductDetails;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent;", "Lnk/f;", "productIdentity", "", "addedToShoppingList", "Lii/h;", "trackingState", "<init>", "(Lnk/f;ZLii/h;)V", "component1", "()Lnk/f;", "component2", "()Z", "component3", "()Lii/h;", "copy", "(Lnk/f;ZLii/h;)Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ViewProductDetails;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lnk/f;", "getProductIdentity", "Z", "getAddedToShoppingList", "Lii/h;", "getTrackingState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ViewProductDetails extends HomeEvent {
            public static final int $stable = 8;
            private final boolean addedToShoppingList;
            private final nk.f productIdentity;
            private final AbstractC14761h trackingState;

            /* renamed from: component2, reason: from getter */
            public final boolean getAddedToShoppingList() {
                return this.addedToShoppingList;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ViewProductDetails)) {
                    return false;
                }
                ViewProductDetails viewProductDetails = (ViewProductDetails) other;
                return Intrinsics.e(this.productIdentity, viewProductDetails.productIdentity) && this.addedToShoppingList == viewProductDetails.addedToShoppingList && Intrinsics.e(this.trackingState, viewProductDetails.trackingState);
            }

            public int hashCode() {
                int iHashCode = ((this.productIdentity.hashCode() * 31) + Boolean.hashCode(this.addedToShoppingList)) * 31;
                AbstractC14761h abstractC14761h = this.trackingState;
                return iHashCode + (abstractC14761h == null ? 0 : abstractC14761h.hashCode());
            }

            public String toString() {
                return "ViewProductDetails(productIdentity=" + this.productIdentity + ", addedToShoppingList=" + this.addedToShoppingList + ", trackingState=" + this.trackingState + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ViewProductDetails(nk.f productIdentity, boolean z10, AbstractC14761h abstractC14761h) {
                super(null);
                Intrinsics.j(productIdentity, "productIdentity");
                this.productIdentity = productIdentity;
                this.addedToShoppingList = z10;
                this.trackingState = abstractC14761h;
            }

            public static /* synthetic */ ViewProductDetails copy$default(ViewProductDetails viewProductDetails, nk.f fVar, boolean z10, AbstractC14761h abstractC14761h, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    fVar = viewProductDetails.productIdentity;
                }
                if ((i10 & 2) != 0) {
                    z10 = viewProductDetails.addedToShoppingList;
                }
                if ((i10 & 4) != 0) {
                    abstractC14761h = viewProductDetails.trackingState;
                }
                return viewProductDetails.copy(fVar, z10, abstractC14761h);
            }

            /* renamed from: component1, reason: from getter */
            public final nk.f getProductIdentity() {
                return this.productIdentity;
            }

            /* renamed from: component3, reason: from getter */
            public final AbstractC14761h getTrackingState() {
                return this.trackingState;
            }

            public final ViewProductDetails copy(nk.f productIdentity, boolean addedToShoppingList, AbstractC14761h trackingState) {
                Intrinsics.j(productIdentity, "productIdentity");
                return new ViewProductDetails(productIdentity, addedToShoppingList, trackingState);
            }

            public final boolean getAddedToShoppingList() {
                return this.addedToShoppingList;
            }

            public final nk.f getProductIdentity() {
                return this.productIdentity;
            }

            public final AbstractC14761h getTrackingState() {
                return this.trackingState;
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ViewRateAndTipActivity;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent;", "Ltp/b;", "builder", "Ltp/a;", "flowType", "<init>", "(Ltp/b;Ltp/a;)V", "component1", "()Ltp/b;", "component2", "()Ltp/a;", "copy", "(Ltp/b;Ltp/a;)Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ViewRateAndTipActivity;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltp/b;", "getBuilder", "Ltp/a;", "getFlowType", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ViewRateAndTipActivity extends HomeEvent {
            public static final int $stable = 8;
            private final Builder builder;
            private final EnumC17276a flowType;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ViewRateAndTipActivity)) {
                    return false;
                }
                ViewRateAndTipActivity viewRateAndTipActivity = (ViewRateAndTipActivity) other;
                return Intrinsics.e(this.builder, viewRateAndTipActivity.builder) && this.flowType == viewRateAndTipActivity.flowType;
            }

            public int hashCode() {
                return (this.builder.hashCode() * 31) + this.flowType.hashCode();
            }

            public String toString() {
                return "ViewRateAndTipActivity(builder=" + this.builder + ", flowType=" + this.flowType + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ViewRateAndTipActivity(Builder builder, EnumC17276a flowType) {
                super(null);
                Intrinsics.j(builder, "builder");
                Intrinsics.j(flowType, "flowType");
                this.builder = builder;
                this.flowType = flowType;
            }

            public static /* synthetic */ ViewRateAndTipActivity copy$default(ViewRateAndTipActivity viewRateAndTipActivity, Builder c17277b, EnumC17276a enumC17276a, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    c17277b = viewRateAndTipActivity.builder;
                }
                if ((i10 & 2) != 0) {
                    enumC17276a = viewRateAndTipActivity.flowType;
                }
                return viewRateAndTipActivity.copy(c17277b, enumC17276a);
            }

            /* renamed from: component1, reason: from getter */
            public final Builder getBuilder() {
                return this.builder;
            }

            /* renamed from: component2, reason: from getter */
            public final EnumC17276a getFlowType() {
                return this.flowType;
            }

            public final ViewRateAndTipActivity copy(Builder builder, EnumC17276a flowType) {
                Intrinsics.j(builder, "builder");
                Intrinsics.j(flowType, "flowType");
                return new ViewRateAndTipActivity(builder, flowType);
            }

            public final Builder getBuilder() {
                return this.builder;
            }

            public final EnumC17276a getFlowType() {
                return this.flowType;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent$ViewSpecialOffers;", "Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeEvent;", "previousTrackAction", "", "<init>", "(Ljava/lang/String;)V", "getPreviousTrackAction", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ViewSpecialOffers extends HomeEvent {
            public static final int $stable = 0;
            private final String previousTrackAction;

            public ViewSpecialOffers(String str) {
                super(null);
                this.previousTrackAction = str;
            }

            public static /* synthetic */ ViewSpecialOffers copy$default(ViewSpecialOffers viewSpecialOffers, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = viewSpecialOffers.previousTrackAction;
                }
                return viewSpecialOffers.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getPreviousTrackAction() {
                return this.previousTrackAction;
            }

            public final ViewSpecialOffers copy(String previousTrackAction) {
                return new ViewSpecialOffers(previousTrackAction);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ViewSpecialOffers) && Intrinsics.e(this.previousTrackAction, ((ViewSpecialOffers) other).previousTrackAction);
            }

            public int hashCode() {
                String str = this.previousTrackAction;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "ViewSpecialOffers(previousTrackAction=" + this.previousTrackAction + ')';
            }

            public final String getPreviousTrackAction() {
                return this.previousTrackAction;
            }
        }

        public /* synthetic */ HomeEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private HomeEvent() {
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b6\b\u0087\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010\u0013\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJ\u0010\u0010&\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001dJ \u0010+\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014HÆ\u0003¢\u0006\u0004\b/\u0010.J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014HÆ\u0003¢\u0006\u0004\b0\u0010.J\u0010\u00101\u001a\u00020\u0018HÆ\u0003¢\u0006\u0004\b1\u00102JÌ\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\u0018\b\u0002\u0010\u0013\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u0018HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b5\u0010\"J\u0010\u00106\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b6\u0010'J\u001a\u00108\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b\u0004\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b=\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\b?\u0010\"R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b@\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\bA\u0010\"R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b\u000b\u0010\u001dR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010'R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010)R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\b\u0010\u0010\u001dR'\u0010\u0013\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010F\u001a\u0004\bG\u0010,R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010H\u001a\u0004\bI\u0010.R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010H\u001a\u0004\bJ\u0010.R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00148\u0006¢\u0006\f\n\u0004\b\u0017\u0010H\u001a\u0004\bK\u0010.R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010L\u001a\u0004\bM\u00102¨\u0006N"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeViewState;", "", "", "authenticated", "isAfterCreateAccount", "Lcom/meijer/mobile/meijer/activity/home/HomeDecorator;", "homeDecorator", "", "mode", "resetStepper", "stepperIdInInteraction", "isStepperInTransition", "", "clickedProductPosition", "Lkk/a;", "clickedCarouselType", "isSponsoredCriteo", "", "LYk/c;", "couponsStateMap", "", "viewBeaconsSent", "loadBeaconsSent", "basketChangeBeacon", "LUl/b;", "beaconsTracker", "<init>", "(ZZLcom/meijer/mobile/meijer/activity/home/HomeDecorator;Ljava/lang/String;ZLjava/lang/String;ZILkk/a;ZLjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;LUl/b;)V", "component1", "()Z", "component2", "component3", "()Lcom/meijer/mobile/meijer/activity/home/HomeDecorator;", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "component8", "()I", "component9", "()Lkk/a;", "component10", "component11", "()Ljava/util/Map;", "component12", "()Ljava/util/List;", "component13", "component14", "component15", "()LUl/b;", "copy", "(ZZLcom/meijer/mobile/meijer/activity/home/HomeDecorator;Ljava/lang/String;ZLjava/lang/String;ZILkk/a;ZLjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;LUl/b;)Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$HomeViewState;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getAuthenticated", "Lcom/meijer/mobile/meijer/activity/home/HomeDecorator;", "getHomeDecorator", "Ljava/lang/String;", "getMode", "getResetStepper", "getStepperIdInInteraction", "I", "getClickedProductPosition", "Lkk/a;", "getClickedCarouselType", "Ljava/util/Map;", "getCouponsStateMap", "Ljava/util/List;", "getViewBeaconsSent", "getLoadBeaconsSent", "getBasketChangeBeacon", "LUl/b;", "getBeaconsTracker", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HomeViewState {
        public static final int $stable = 8;
        private final boolean authenticated;
        private final List<String> basketChangeBeacon;
        private final BeaconsTracker beaconsTracker;
        private final EnumC15218a clickedCarouselType;
        private final int clickedProductPosition;
        private final Map<String, CouponState> couponsStateMap;
        private final HomeDecorator homeDecorator;
        private final boolean isAfterCreateAccount;
        private final boolean isSponsoredCriteo;
        private final boolean isStepperInTransition;
        private final List<String> loadBeaconsSent;
        private final String mode;
        private final boolean resetStepper;
        private final String stepperIdInInteraction;
        private final List<String> viewBeaconsSent;

        public HomeViewState() {
            this(false, false, null, null, false, null, false, 0, null, false, null, null, null, null, null, 32767, null);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getAuthenticated() {
            return this.authenticated;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getIsSponsoredCriteo() {
            return this.isSponsoredCriteo;
        }

        public final Map<String, CouponState> component11() {
            return this.couponsStateMap;
        }

        public final List<String> component12() {
            return this.viewBeaconsSent;
        }

        public final List<String> component13() {
            return this.loadBeaconsSent;
        }

        public final List<String> component14() {
            return this.basketChangeBeacon;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsAfterCreateAccount() {
            return this.isAfterCreateAccount;
        }

        /* renamed from: component3, reason: from getter */
        public final HomeDecorator getHomeDecorator() {
            return this.homeDecorator;
        }

        /* renamed from: component4, reason: from getter */
        public final String getMode() {
            return this.mode;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getResetStepper() {
            return this.resetStepper;
        }

        /* renamed from: component6, reason: from getter */
        public final String getStepperIdInInteraction() {
            return this.stepperIdInInteraction;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsStepperInTransition() {
            return this.isStepperInTransition;
        }

        /* renamed from: component8, reason: from getter */
        public final int getClickedProductPosition() {
            return this.clickedProductPosition;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HomeViewState)) {
                return false;
            }
            HomeViewState homeViewState = (HomeViewState) other;
            return this.authenticated == homeViewState.authenticated && this.isAfterCreateAccount == homeViewState.isAfterCreateAccount && Intrinsics.e(this.homeDecorator, homeViewState.homeDecorator) && Intrinsics.e(this.mode, homeViewState.mode) && this.resetStepper == homeViewState.resetStepper && Intrinsics.e(this.stepperIdInInteraction, homeViewState.stepperIdInInteraction) && this.isStepperInTransition == homeViewState.isStepperInTransition && this.clickedProductPosition == homeViewState.clickedProductPosition && this.clickedCarouselType == homeViewState.clickedCarouselType && this.isSponsoredCriteo == homeViewState.isSponsoredCriteo && Intrinsics.e(this.couponsStateMap, homeViewState.couponsStateMap) && Intrinsics.e(this.viewBeaconsSent, homeViewState.viewBeaconsSent) && Intrinsics.e(this.loadBeaconsSent, homeViewState.loadBeaconsSent) && Intrinsics.e(this.basketChangeBeacon, homeViewState.basketChangeBeacon) && Intrinsics.e(this.beaconsTracker, homeViewState.beaconsTracker);
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.authenticated) * 31) + Boolean.hashCode(this.isAfterCreateAccount)) * 31;
            HomeDecorator homeDecorator = this.homeDecorator;
            int iHashCode2 = (((((iHashCode + (homeDecorator == null ? 0 : homeDecorator.hashCode())) * 31) + this.mode.hashCode()) * 31) + Boolean.hashCode(this.resetStepper)) * 31;
            String str = this.stepperIdInInteraction;
            return ((((((((((((((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.isStepperInTransition)) * 31) + Integer.hashCode(this.clickedProductPosition)) * 31) + this.clickedCarouselType.hashCode()) * 31) + Boolean.hashCode(this.isSponsoredCriteo)) * 31) + this.couponsStateMap.hashCode()) * 31) + this.viewBeaconsSent.hashCode()) * 31) + this.loadBeaconsSent.hashCode()) * 31) + this.basketChangeBeacon.hashCode()) * 31) + this.beaconsTracker.hashCode();
        }

        public String toString() {
            return "HomeViewState(authenticated=" + this.authenticated + ", isAfterCreateAccount=" + this.isAfterCreateAccount + ", homeDecorator=" + this.homeDecorator + ", mode=" + this.mode + ", resetStepper=" + this.resetStepper + ", stepperIdInInteraction=" + this.stepperIdInInteraction + ", isStepperInTransition=" + this.isStepperInTransition + ", clickedProductPosition=" + this.clickedProductPosition + ", clickedCarouselType=" + this.clickedCarouselType + ", isSponsoredCriteo=" + this.isSponsoredCriteo + ", couponsStateMap=" + this.couponsStateMap + ", viewBeaconsSent=" + this.viewBeaconsSent + ", loadBeaconsSent=" + this.loadBeaconsSent + ", basketChangeBeacon=" + this.basketChangeBeacon + ", beaconsTracker=" + this.beaconsTracker + ')';
        }

        public HomeViewState(boolean z10, boolean z11, HomeDecorator homeDecorator, String mode, boolean z12, String str, boolean z13, int i10, EnumC15218a clickedCarouselType, boolean z14, Map<String, CouponState> couponsStateMap, List<String> viewBeaconsSent, List<String> loadBeaconsSent, List<String> basketChangeBeacon, BeaconsTracker beaconsTracker) {
            Intrinsics.j(mode, "mode");
            Intrinsics.j(clickedCarouselType, "clickedCarouselType");
            Intrinsics.j(couponsStateMap, "couponsStateMap");
            Intrinsics.j(viewBeaconsSent, "viewBeaconsSent");
            Intrinsics.j(loadBeaconsSent, "loadBeaconsSent");
            Intrinsics.j(basketChangeBeacon, "basketChangeBeacon");
            Intrinsics.j(beaconsTracker, "beaconsTracker");
            this.authenticated = z10;
            this.isAfterCreateAccount = z11;
            this.homeDecorator = homeDecorator;
            this.mode = mode;
            this.resetStepper = z12;
            this.stepperIdInInteraction = str;
            this.isStepperInTransition = z13;
            this.clickedProductPosition = i10;
            this.clickedCarouselType = clickedCarouselType;
            this.isSponsoredCriteo = z14;
            this.couponsStateMap = couponsStateMap;
            this.viewBeaconsSent = viewBeaconsSent;
            this.loadBeaconsSent = loadBeaconsSent;
            this.basketChangeBeacon = basketChangeBeacon;
            this.beaconsTracker = beaconsTracker;
        }

        public static /* synthetic */ HomeViewState copy$default(HomeViewState homeViewState, boolean z10, boolean z11, HomeDecorator homeDecorator, String str, boolean z12, String str2, boolean z13, int i10, EnumC15218a enumC15218a, boolean z14, Map map, List list, List list2, List list3, BeaconsTracker beaconsTracker, int i11, Object obj) {
            return homeViewState.copy((i11 & 1) != 0 ? homeViewState.authenticated : z10, (i11 & 2) != 0 ? homeViewState.isAfterCreateAccount : z11, (i11 & 4) != 0 ? homeViewState.homeDecorator : homeDecorator, (i11 & 8) != 0 ? homeViewState.mode : str, (i11 & 16) != 0 ? homeViewState.resetStepper : z12, (i11 & 32) != 0 ? homeViewState.stepperIdInInteraction : str2, (i11 & 64) != 0 ? homeViewState.isStepperInTransition : z13, (i11 & 128) != 0 ? homeViewState.clickedProductPosition : i10, (i11 & 256) != 0 ? homeViewState.clickedCarouselType : enumC15218a, (i11 & 512) != 0 ? homeViewState.isSponsoredCriteo : z14, (i11 & 1024) != 0 ? homeViewState.couponsStateMap : map, (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? homeViewState.viewBeaconsSent : list, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? homeViewState.loadBeaconsSent : list2, (i11 & 8192) != 0 ? homeViewState.basketChangeBeacon : list3, (i11 & 16384) != 0 ? homeViewState.beaconsTracker : beaconsTracker);
        }

        /* renamed from: component15, reason: from getter */
        public final BeaconsTracker getBeaconsTracker() {
            return this.beaconsTracker;
        }

        /* renamed from: component9, reason: from getter */
        public final EnumC15218a getClickedCarouselType() {
            return this.clickedCarouselType;
        }

        public final HomeViewState copy(boolean authenticated, boolean isAfterCreateAccount, HomeDecorator homeDecorator, String mode, boolean resetStepper, String stepperIdInInteraction, boolean isStepperInTransition, int clickedProductPosition, EnumC15218a clickedCarouselType, boolean isSponsoredCriteo, Map<String, CouponState> couponsStateMap, List<String> viewBeaconsSent, List<String> loadBeaconsSent, List<String> basketChangeBeacon, BeaconsTracker beaconsTracker) {
            Intrinsics.j(mode, "mode");
            Intrinsics.j(clickedCarouselType, "clickedCarouselType");
            Intrinsics.j(couponsStateMap, "couponsStateMap");
            Intrinsics.j(viewBeaconsSent, "viewBeaconsSent");
            Intrinsics.j(loadBeaconsSent, "loadBeaconsSent");
            Intrinsics.j(basketChangeBeacon, "basketChangeBeacon");
            Intrinsics.j(beaconsTracker, "beaconsTracker");
            return new HomeViewState(authenticated, isAfterCreateAccount, homeDecorator, mode, resetStepper, stepperIdInInteraction, isStepperInTransition, clickedProductPosition, clickedCarouselType, isSponsoredCriteo, couponsStateMap, viewBeaconsSent, loadBeaconsSent, basketChangeBeacon, beaconsTracker);
        }

        public final boolean getAuthenticated() {
            return this.authenticated;
        }

        public final List<String> getBasketChangeBeacon() {
            return this.basketChangeBeacon;
        }

        public final BeaconsTracker getBeaconsTracker() {
            return this.beaconsTracker;
        }

        public final EnumC15218a getClickedCarouselType() {
            return this.clickedCarouselType;
        }

        public final int getClickedProductPosition() {
            return this.clickedProductPosition;
        }

        public final Map<String, CouponState> getCouponsStateMap() {
            return this.couponsStateMap;
        }

        public final HomeDecorator getHomeDecorator() {
            return this.homeDecorator;
        }

        public final List<String> getLoadBeaconsSent() {
            return this.loadBeaconsSent;
        }

        public final String getMode() {
            return this.mode;
        }

        public final boolean getResetStepper() {
            return this.resetStepper;
        }

        public final String getStepperIdInInteraction() {
            return this.stepperIdInInteraction;
        }

        public final List<String> getViewBeaconsSent() {
            return this.viewBeaconsSent;
        }

        public final boolean isAfterCreateAccount() {
            return this.isAfterCreateAccount;
        }

        public final boolean isSponsoredCriteo() {
            return this.isSponsoredCriteo;
        }

        public final boolean isStepperInTransition() {
            return this.isStepperInTransition;
        }

        public /* synthetic */ HomeViewState(boolean z10, boolean z11, HomeDecorator homeDecorator, String str, boolean z12, String str2, boolean z13, int i10, EnumC15218a enumC15218a, boolean z14, Map map, List list, List list2, List list3, BeaconsTracker beaconsTracker, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? new HomeDecorator(null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536870911, null) : homeDecorator, (i11 & 8) != 0 ? "" : str, (i11 & 16) != 0 ? false : z12, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? false : z13, (i11 & 128) != 0 ? -1 : i10, (i11 & 256) != 0 ? EnumC15218a.f142572f : enumC15218a, (i11 & 512) == 0 ? z14 : false, (i11 & 1024) != 0 ? new LinkedHashMap() : map, (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? new ArrayList() : list, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? new ArrayList() : list2, (i11 & 8192) != 0 ? new ArrayList() : list3, (i11 & 16384) != 0 ? new BeaconsTracker(null, null, null, null, null, null, null, null, l3.f93323c, null) : beaconsTracker);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$onAction$15", f = "HomeViewModel.kt", l = {2187}, m = "invokeSuspend")
    static final class I extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110208a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Action f110210c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I(Action action, Continuation<? super I> continuation) {
            super(2, continuation);
            this.f110210c = action;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new I(this.f110210c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((I) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110208a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                if (!HomeViewModel.this.userManager.b()) {
                    InterfaceC16548A interfaceC16548A = HomeViewModel.this._events;
                    HomeEvent.LoginRequiredEvent loginRequiredEvent = new HomeEvent.LoginRequiredEvent(Cj.o.f5056d);
                    this.f110208a = 1;
                    if (interfaceC16548A.emit(loginRequiredEvent, this) == objF) {
                        return objF;
                    }
                }
            }
            HomeViewModel.this.onStepperInteractionChange(((Action.StepperStateChanged) this.f110210c).getProduct().getCode(), !HomeViewModel.this.userManager.b(), true);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$onAction$16", f = "HomeViewModel.kt", l = {2208}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class J extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f110211a;

        /* renamed from: b, reason: collision with root package name */
        Object f110212b;

        /* renamed from: c, reason: collision with root package name */
        int f110213c;

        /* renamed from: d, reason: collision with root package name */
        int f110214d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Action f110215e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ HomeViewModel f110216f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        J(Action action, HomeViewModel homeViewModel, Continuation<? super J> continuation) {
            super(2, continuation);
            this.f110215e = action;
            this.f110216f = homeViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new J(this.f110215e, this.f110216f, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(String str, Action action, TrackingData c14759f) {
            c14759f.v("home");
            c14759f.n("home");
            c14759f.h("screenName", "New home screen");
            c14759f.h("campaignId", str);
            List<AbstractC14762i.Extra> listD = ((Action.MarketBannerClickAction) action).getBanner().d();
            if (listD == null) {
                listD = CollectionsKt.m();
            }
            c14759f.d(listD);
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((J) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r6.f110214d
                r2 = 1
                if (r1 == 0) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r6.f110212b
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r6.f110211a
                java.lang.String r0 = (java.lang.String) r0
                kotlin.ResultKt.b(r7)
                goto L8b
            L18:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L20:
                kotlin.ResultKt.b(r7)
                com.meijer.mobile.meijer.activity.home.HomeViewModel$Action r7 = r6.f110215e
                com.meijer.mobile.meijer.activity.home.HomeViewModel$Action$MarketBannerClickAction r7 = (com.meijer.mobile.meijer.activity.home.HomeViewModel.Action.MarketBannerClickAction) r7
                Vl.i r7 = r7.getBanner()
                java.util.List r7 = r7.d()
                r1 = 0
                if (r7 == 0) goto L5c
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.Iterator r7 = r7.iterator()
            L38:
                boolean r3 = r7.hasNext()
                if (r3 == 0) goto L52
                java.lang.Object r3 = r7.next()
                r4 = r3
                ii.i$b r4 = (ii.AbstractC14762i.Extra) r4
                java.lang.String r4 = r4.getKey()
                java.lang.String r5 = "campaignId"
                boolean r4 = kotlin.jvm.internal.Intrinsics.e(r4, r5)
                if (r4 == 0) goto L38
                goto L53
            L52:
                r3 = r1
            L53:
                ii.i$b r3 = (ii.AbstractC14762i.Extra) r3
                if (r3 == 0) goto L5c
                java.lang.String r7 = r3.getValue()
                goto L5d
            L5c:
                r7 = r1
            L5d:
                com.meijer.mobile.meijer.activity.home.HomeViewModel$Action r1 = r6.f110215e
                com.meijer.mobile.meijer.activity.home.HomeViewModel$Action$MarketBannerClickAction r1 = (com.meijer.mobile.meijer.activity.home.HomeViewModel.Action.MarketBannerClickAction) r1
                Vl.i r1 = r1.getBanner()
                java.lang.String r1 = r1.getLinkURL()
                if (r1 == 0) goto L8c
                com.meijer.mobile.meijer.activity.home.HomeViewModel r3 = r6.f110216f
                pv.A r3 = com.meijer.mobile.meijer.activity.home.HomeViewModel.access$get_events$p(r3)
                com.meijer.mobile.meijer.activity.home.HomeViewModel$HomeEvent$ViewBannerDeepLinkUrl r4 = new com.meijer.mobile.meijer.activity.home.HomeViewModel$HomeEvent$ViewBannerDeepLinkUrl
                java.lang.String r5 = java.lang.String.valueOf(r7)
                r4.<init>(r1, r5)
                r6.f110211a = r7
                r6.f110212b = r1
                r1 = 0
                r6.f110213c = r1
                r6.f110214d = r2
                java.lang.Object r1 = r3.emit(r4, r6)
                if (r1 != r0) goto L8a
                return r0
            L8a:
                r0 = r7
            L8b:
                r7 = r0
            L8c:
                com.meijer.mobile.meijer.activity.home.HomeViewModel r0 = r6.f110216f
                hi.a r0 = com.meijer.mobile.meijer.activity.home.HomeViewModel.access$getAnalyticsEngine$p(r0)
                java.lang.String r1 = "event: featured clicked"
                ii.h$a r1 = ii.C14756c.a(r1)
                com.meijer.mobile.meijer.activity.home.HomeViewModel$Action r2 = r6.f110215e
                com.meijer.mobile.meijer.activity.home.Y0 r3 = new com.meijer.mobile.meijer.activity.home.Y0
                r3.<init>()
                r0.b(r1, r3)
                kotlin.Unit r7 = kotlin.Unit.f143329a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.home.HomeViewModel.J.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$onAction$18", f = "HomeViewModel.kt", l = {2508}, m = "invokeSuspend")
    static final class K extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110217a;

        K(Continuation<? super K> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new K(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((K) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110217a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = HomeViewModel.this._events;
                HomeEvent.NavigateToLearnMore navigateToLearnMore = HomeEvent.NavigateToLearnMore.INSTANCE;
                this.f110217a = 1;
                if (interfaceC16548A.emit(navigateToLearnMore, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$onAction$19", f = "HomeViewModel.kt", l = {2512}, m = "invokeSuspend")
    static final class L extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110219a;

        L(Continuation<? super L> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new L(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((L) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110219a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = HomeViewModel.this._events;
                HomeEvent.NavigateToRedeemMPerksDashboard navigateToRedeemMPerksDashboard = HomeEvent.NavigateToRedeemMPerksDashboard.INSTANCE;
                this.f110219a = 1;
                if (interfaceC16548A.emit(navigateToRedeemMPerksDashboard, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$onAction$1", f = "HomeViewModel.kt", l = {1888}, m = "invokeSuspend")
    static final class M extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110221a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Qk.a f110223c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new M(this.f110223c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        M(Qk.a aVar, Continuation<? super M> continuation) {
            super(2, continuation);
            this.f110223c = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((M) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110221a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                HomeViewModel homeViewModel = HomeViewModel.this;
                Pk.c cVarA = ((a.Clip) this.f110223c).getCoupon();
                TrackingData c14759fB = ((a.Clip) this.f110223c).getTrackingData();
                this.f110221a = 1;
                if (homeViewModel.fetchCoupon(cVarA, c14759fB, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$MperksPointsExpData;", "", "", "showPointExpiryBanner", "", "pointsExpiringSoon", "j$/time/LocalDate", "pointsExpiryDate", "<init>", "(ZILj$/time/LocalDate;)V", "component1", "()Z", "component2", "()I", "component3", "()Lj$/time/LocalDate;", "copy", "(ZILj$/time/LocalDate;)Lcom/meijer/mobile/meijer/activity/home/HomeViewModel$MperksPointsExpData;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowPointExpiryBanner", "I", "getPointsExpiringSoon", "Lj$/time/LocalDate;", "getPointsExpiryDate", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MperksPointsExpData {
        public static final int $stable = 8;
        private final int pointsExpiringSoon;
        private final LocalDate pointsExpiryDate;
        private final boolean showPointExpiryBanner;

        public MperksPointsExpData() {
            this(false, 0, null, 7, null);
        }

        public static /* synthetic */ MperksPointsExpData copy$default(MperksPointsExpData mperksPointsExpData, boolean z10, int i10, LocalDate localDate, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z10 = mperksPointsExpData.showPointExpiryBanner;
            }
            if ((i11 & 2) != 0) {
                i10 = mperksPointsExpData.pointsExpiringSoon;
            }
            if ((i11 & 4) != 0) {
                localDate = mperksPointsExpData.pointsExpiryDate;
            }
            return mperksPointsExpData.copy(z10, i10, localDate);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowPointExpiryBanner() {
            return this.showPointExpiryBanner;
        }

        /* renamed from: component2, reason: from getter */
        public final int getPointsExpiringSoon() {
            return this.pointsExpiringSoon;
        }

        /* renamed from: component3, reason: from getter */
        public final LocalDate getPointsExpiryDate() {
            return this.pointsExpiryDate;
        }

        public final MperksPointsExpData copy(boolean showPointExpiryBanner, int pointsExpiringSoon, LocalDate pointsExpiryDate) {
            return new MperksPointsExpData(showPointExpiryBanner, pointsExpiringSoon, pointsExpiryDate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MperksPointsExpData)) {
                return false;
            }
            MperksPointsExpData mperksPointsExpData = (MperksPointsExpData) other;
            return this.showPointExpiryBanner == mperksPointsExpData.showPointExpiryBanner && this.pointsExpiringSoon == mperksPointsExpData.pointsExpiringSoon && Intrinsics.e(this.pointsExpiryDate, mperksPointsExpData.pointsExpiryDate);
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.showPointExpiryBanner) * 31) + Integer.hashCode(this.pointsExpiringSoon)) * 31;
            LocalDate localDate = this.pointsExpiryDate;
            return iHashCode + (localDate == null ? 0 : localDate.hashCode());
        }

        public String toString() {
            return "MperksPointsExpData(showPointExpiryBanner=" + this.showPointExpiryBanner + ", pointsExpiringSoon=" + this.pointsExpiringSoon + ", pointsExpiryDate=" + this.pointsExpiryDate + ')';
        }

        public MperksPointsExpData(boolean z10, int i10, LocalDate localDate) {
            this.showPointExpiryBanner = z10;
            this.pointsExpiringSoon = i10;
            this.pointsExpiryDate = localDate;
        }

        public final int getPointsExpiringSoon() {
            return this.pointsExpiringSoon;
        }

        public final LocalDate getPointsExpiryDate() {
            return this.pointsExpiryDate;
        }

        public final boolean getShowPointExpiryBanner() {
            return this.showPointExpiryBanner;
        }

        public /* synthetic */ MperksPointsExpData(boolean z10, int i10, LocalDate localDate, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? null : localDate);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$onAction$20", f = "HomeViewModel.kt", l = {2516}, m = "invokeSuspend")
    static final class N extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110224a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC14021c f110226c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new N(this.f110226c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        N(AbstractC14021c abstractC14021c, Continuation<? super N> continuation) {
            super(2, continuation);
            this.f110226c = abstractC14021c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((N) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110224a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = HomeViewModel.this._events;
                HomeEvent.NavigateToMPerksRewards navigateToMPerksRewards = new HomeEvent.NavigateToMPerksRewards(((AbstractC14021c.RewardsMPerksClicked) this.f110226c).getRewardDescription(), ((AbstractC14021c.RewardsMPerksClicked) this.f110226c).getIsFromAvailableRewards());
                this.f110224a = 1;
                if (interfaceC16548A.emit(navigateToMPerksRewards, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$onAction$21", f = "HomeViewModel.kt", l = {2525}, m = "invokeSuspend")
    static final class O extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110227a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC14021c f110229c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new O(this.f110229c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        O(AbstractC14021c abstractC14021c, Continuation<? super O> continuation) {
            super(2, continuation);
            this.f110229c = abstractC14021c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((O) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110227a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = HomeViewModel.this._events;
                HomeEvent.NavigateToYourRewardsMPerksDashboard navigateToYourRewardsMPerksDashboard = new HomeEvent.NavigateToYourRewardsMPerksDashboard(((AbstractC14021c.YourRewardsMPerksViewAllClicked) this.f110229c).getMperksDecorator().e());
                this.f110227a = 1;
                if (interfaceC16548A.emit(navigateToYourRewardsMPerksDashboard, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$onAction$22", f = "HomeViewModel.kt", l = {2564}, m = "invokeSuspend")
    static final class P extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110230a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC13720b f110232c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<String> f110233d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new P(this.f110232c, this.f110233d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        P(AbstractC13720b abstractC13720b, Ref.ObjectRef<String> objectRef, Continuation<? super P> continuation) {
            super(2, continuation);
            this.f110232c = abstractC13720b;
            this.f110233d = objectRef;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((P) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110230a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = HomeViewModel.this._events;
                HomeEvent.NavigateToCarouselDeeplink navigateToCarouselDeeplink = new HomeEvent.NavigateToCarouselDeeplink(((AbstractC13720b.ViewAll) this.f110232c).getDeeplink(), ((AbstractC13720b.ViewAll) this.f110232c).getCarouselTitle(), this.f110233d.f143742a, true);
                this.f110230a = 1;
                if (interfaceC16548A.emit(navigateToCarouselDeeplink, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$onAction$27", f = "HomeViewModel.kt", l = {2620}, m = "invokeSuspend")
    static final class Q extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110234a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC13720b f110236c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<String> f110237d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new Q(this.f110236c, this.f110237d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Q(AbstractC13720b abstractC13720b, Ref.ObjectRef<String> objectRef, Continuation<? super Q> continuation) {
            super(2, continuation);
            this.f110236c = abstractC13720b;
            this.f110237d = objectRef;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((Q) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110234a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = HomeViewModel.this._events;
                HomeEvent.NavigateToCarouselDeeplink navigateToCarouselDeeplink = new HomeEvent.NavigateToCarouselDeeplink(((AbstractC13720b.DepartmentClicked) this.f110236c).getDeeplink(), ((AbstractC13720b.DepartmentClicked) this.f110236c).getName(), this.f110237d.f143742a, false);
                this.f110234a = 1;
                if (interfaceC16548A.emit(navigateToCarouselDeeplink, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$onAction$28", f = "HomeViewModel.kt", l = {2649}, m = "invokeSuspend")
    static final class R extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110238a;

        R(Continuation<? super R> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new R(continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(TrackingData c14759f) {
            c14759f.v("home");
            c14759f.p("Special Offers: View All");
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((R) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110238a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                HomeViewModel.this.analyticsEngine.b(C14756c.h("special offers list page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.home.Z0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return HomeViewModel.R.g((TrackingData) obj2);
                    }
                });
                InterfaceC16548A interfaceC16548A = HomeViewModel.this._events;
                HomeEvent.ViewSpecialOffers viewSpecialOffers = new HomeEvent.ViewSpecialOffers("Special Offers: List Page: Offer Clicked");
                this.f110238a = 1;
                if (interfaceC16548A.emit(viewSpecialOffers, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$onAction$2", f = "HomeViewModel.kt", l = {1892}, m = "invokeSuspend")
    static final class S extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110240a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Qk.a f110242c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new S(this.f110242c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        S(Qk.a aVar, Continuation<? super S> continuation) {
            super(2, continuation);
            this.f110242c = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((S) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110240a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = HomeViewModel.this._events;
                HomeEvent.ViewCouponDetails viewCouponDetails = new HomeEvent.ViewCouponDetails(((a.ViewCouponDetails) this.f110242c).getCoupon(), ((a.ViewCouponDetails) this.f110242c).getTrackingData());
                this.f110240a = 1;
                if (interfaceC16548A.emit(viewCouponDetails, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$onAction$30", f = "HomeViewModel.kt", l = {2677}, m = "invokeSuspend")
    static final class T extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110243a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC13870f f110245c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new T(this.f110245c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        T(AbstractC13870f abstractC13870f, Continuation<? super T> continuation) {
            super(2, continuation);
            this.f110245c = abstractC13870f;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((T) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110243a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = HomeViewModel.this._events;
                HomeEvent.NavigateToRateAndTip navigateToRateAndTip = new HomeEvent.NavigateToRateAndTip(((AbstractC13870f.RateAndTip) this.f110245c).getOrderNumber(), ((AbstractC13870f.RateAndTip) this.f110245c).getRateAndTipBuilder(), ((AbstractC13870f.RateAndTip) this.f110245c).getFlowType());
                this.f110243a = 1;
                if (interfaceC16548A.emit(navigateToRateAndTip, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$onAction$31", f = "HomeViewModel.kt", l = {2687}, m = "invokeSuspend")
    static final class U extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110246a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC13870f f110248c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new U(this.f110248c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        U(AbstractC13870f abstractC13870f, Continuation<? super U> continuation) {
            super(2, continuation);
            this.f110248c = abstractC13870f;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((U) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110246a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = HomeViewModel.this._events;
                HomeEvent.NavigateToUpdatePaymentMethod navigateToUpdatePaymentMethod = new HomeEvent.NavigateToUpdatePaymentMethod(((AbstractC13870f.ViewDeclinedPayment) this.f110248c).getOrderNumber(), ((AbstractC13870f.ViewDeclinedPayment) this.f110248c).getViewDetails(), ((AbstractC13870f.ViewDeclinedPayment) this.f110248c).getPreviousTrackAction());
                this.f110246a = 1;
                if (interfaceC16548A.emit(navigateToUpdatePaymentMethod, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$onAction$32", f = "HomeViewModel.kt", l = {2697}, m = "invokeSuspend")
    static final class V extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110249a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC13870f f110251c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new V(this.f110251c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        V(AbstractC13870f abstractC13870f, Continuation<? super V> continuation) {
            super(2, continuation);
            this.f110251c = abstractC13870f;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((V) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110249a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = HomeViewModel.this._events;
                HomeEvent.NavigateToOrderDetail navigateToOrderDetail = new HomeEvent.NavigateToOrderDetail(((AbstractC13870f.ViewOrderDetail) this.f110251c).getOrderNumber(), ((AbstractC13870f.ViewOrderDetail) this.f110251c).getViewDetails(), ((AbstractC13870f.ViewOrderDetail) this.f110251c).getPreviousTrackAction());
                this.f110249a = 1;
                if (interfaceC16548A.emit(navigateToOrderDetail, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$onAction$33", f = "HomeViewModel.kt", l = {2708, 2717}, m = "invokeSuspend")
    static final class W extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110252a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC13870f f110253b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ HomeViewModel f110254c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new W(this.f110253b, this.f110254c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        W(AbstractC13870f abstractC13870f, HomeViewModel homeViewModel, Continuation<? super W> continuation) {
            super(2, continuation);
            this.f110253b = abstractC13870f;
            this.f110254c = homeViewModel;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((W) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
        
            if (com.meijer.mobile.meijer.activity.home.HomeViewModel.O(r0, r1, r3, r4, false, null, r6, r7, r12, 16, null) == r11) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0091, code lost:
        
            if (com.meijer.mobile.meijer.activity.home.HomeViewModel.O(r0, r2, r2, r4, false, null, r6, r7, r12, 16, null) == r11) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0093, code lost:
        
            return r11;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r12.f110252a
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L1c
                if (r0 == r2) goto L17
                if (r0 != r1) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L17:
                kotlin.ResultKt.b(r13)
                goto L94
            L1c:
                kotlin.ResultKt.b(r13)
                es.f r0 = r12.f110253b
                es.f$f r0 = (es.AbstractC13870f.ViewSubstitutions) r0
                vo.b r0 = r0.getSubstitutionScreenType()
                vo.b r3 = vo.b.f166128g
                if (r0 != r3) goto L5e
                com.meijer.mobile.meijer.activity.home.HomeViewModel r0 = r12.f110254c
                es.f r1 = r12.f110253b
                es.f$f r1 = (es.AbstractC13870f.ViewSubstitutions) r1
                java.lang.String r1 = r1.getOrderNumber()
                es.f r4 = r12.f110253b
                es.f$f r4 = (es.AbstractC13870f.ViewSubstitutions) r4
                java.util.List r4 = r4.f()
                es.f r5 = r12.f110253b
                es.f$f r5 = (es.AbstractC13870f.ViewSubstitutions) r5
                java.lang.String r6 = r5.getPickupPersonName()
                es.f r5 = r12.f110253b
                es.f$f r5 = (es.AbstractC13870f.ViewSubstitutions) r5
                java.util.List r7 = r5.e()
                r12.f110252a = r2
                r2 = r3
                r3 = r4
                r4 = 0
                r5 = 0
                r9 = 16
                r10 = 0
                r8 = r12
                java.lang.Object r0 = com.meijer.mobile.meijer.activity.home.HomeViewModel.O(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                if (r0 != r11) goto L94
                goto L93
            L5e:
                com.meijer.mobile.meijer.activity.home.HomeViewModel r0 = r12.f110254c
                es.f r2 = r12.f110253b
                es.f$f r2 = (es.AbstractC13870f.ViewSubstitutions) r2
                java.lang.String r2 = r2.getOrderNumber()
                r3 = r2
                vo.b r2 = vo.b.f166129h
                es.f r4 = r12.f110253b
                es.f$f r4 = (es.AbstractC13870f.ViewSubstitutions) r4
                java.util.List r4 = r4.f()
                es.f r5 = r12.f110253b
                es.f$f r5 = (es.AbstractC13870f.ViewSubstitutions) r5
                java.lang.String r6 = r5.getPickupPersonName()
                es.f r5 = r12.f110253b
                es.f$f r5 = (es.AbstractC13870f.ViewSubstitutions) r5
                java.util.List r7 = r5.e()
                r12.f110252a = r1
                r1 = r3
                r3 = r4
                r4 = 0
                r5 = 0
                r9 = 16
                r10 = 0
                r8 = r12
                java.lang.Object r0 = com.meijer.mobile.meijer.activity.home.HomeViewModel.O(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                if (r0 != r11) goto L94
            L93:
                return r11
            L94:
                kotlin.Unit r0 = kotlin.Unit.f143329a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.home.HomeViewModel.W.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            try {
                iArr[EntryChange.c.f131924f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EntryChange.c.f131925g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EntryChange.c.f131926h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EnumC15218a.values().length];
            try {
                iArr2[EnumC15218a.f142567a.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC15218a.f142568b.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC15218a.f142569c.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$onAction$7", f = "HomeViewModel.kt", l = {2068}, m = "invokeSuspend")
    static final class X extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110255a;

        X(Continuation<? super X> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new X(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((X) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110255a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C14536a c14536a = HomeViewModel.this.homeChipsRepository;
                this.f110255a = 1;
                if (c14536a.d(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$onAction$9", f = "HomeViewModel.kt", l = {2073}, m = "invokeSuspend")
    static final class Y extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110257a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Action f110259c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Y(Action action, Continuation<? super Y> continuation) {
            super(2, continuation);
            this.f110259c = action;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new Y(this.f110259c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((Y) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110257a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = HomeViewModel.this._events;
                HomeEvent.HomeChipItemClickedEvent homeChipItemClickedEvent = new HomeEvent.HomeChipItemClickedEvent(((Action.HomeChipItemClicked) this.f110259c).getHomeChip());
                this.f110257a = 1;
                if (interfaceC16548A.emit(homeChipItemClickedEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$onLoadingStates$3", f = "HomeViewModel.kt", l = {471}, m = "invokeSuspend")
    static final class Z extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110260a;

        Z(Continuation<? super Z> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new Z(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((Z) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110260a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = HomeViewModel.this._events;
                AbstractC6392a.Companion c1204a = AbstractC6392a.INSTANCE;
                HomeEvent.ShowError showError = new HomeEvent.ShowError(c1204a.d(yr.Q.f171738F, new Object[0]), c1204a.d(yr.Q.f171737E, new Object[0]), c1204a.d(yr.Q.f171761b, new Object[0]));
                this.f110260a = 1;
                if (interfaceC16548A.emit(showError, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.home.HomeViewModel$a, reason: case insensitive filesystem */
    /* synthetic */ class C12439a extends AdaptedFunctionReference implements Function2<List<? extends Pj.a>, Continuation<? super Unit>, Object>, SuspendFunction {
        C12439a(Object obj) {
            super(2, obj, HomeViewModel.class, "onLoadingStates", "onLoadingStates(Ljava/util/List;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<? extends Pj.a> list, Continuation<? super Unit> continuation) {
            return HomeViewModel._init_$onLoadingStates((HomeViewModel) this.f143708a, list, continuation);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a0 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        a0(Object obj) {
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

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lpv/g;", "", "LPj/a;", "", "it", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$2", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.home.HomeViewModel$b, reason: case insensitive filesystem */
    static final class C12440b extends SuspendLambda implements Function3<InterfaceC16562g<? super List<? extends Pj.a>>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110262a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f110263b;

        C12440b(Continuation<? super C12440b> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super List<? extends Pj.a>> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            C12440b c12440b = new C12440b(continuation);
            c12440b.f110263b = th2;
            return c12440b.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f110262a == 0) {
                ResultKt.b(obj);
                qw.a.INSTANCE.f((Throwable) this.f110263b, "Caught exception on loadingStateStream", new Object[0]);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$processedRequest$1", f = "HomeViewModel.kt", l = {1385}, m = "invokeSuspend")
    static final class b0 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110264a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC17454a f110266c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ uk.c<EntryChange> f110267d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new b0(this.f110266c, this.f110267d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(AbstractC17454a abstractC17454a, uk.c<EntryChange> cVar, Continuation<? super b0> continuation) {
            super(2, continuation);
            this.f110266c = abstractC17454a;
            this.f110267d = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b0) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110264a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                HomeViewModel homeViewModel = HomeViewModel.this;
                AbstractC17454a abstractC17454a = this.f110266c;
                uk.c<EntryChange> cVar = this.f110267d;
                String strA = abstractC17454a.getProductCode();
                this.f110264a = 1;
                if (homeViewModel.addCartEntry(abstractC17454a, cVar, strA, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.home.HomeViewModel$c, reason: case insensitive filesystem */
    /* synthetic */ class C12441c extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C12441c(Object obj) {
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
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$processedRequest$2", f = "HomeViewModel.kt", l = {1393}, m = "invokeSuspend")
    static final class c0 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110268a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC17454a f110270c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ uk.c<EntryChange> f110271d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new c0(this.f110270c, this.f110271d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(AbstractC17454a abstractC17454a, uk.c<EntryChange> cVar, Continuation<? super c0> continuation) {
            super(2, continuation);
            this.f110270c = abstractC17454a;
            this.f110271d = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c0) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110268a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                HomeViewModel homeViewModel = HomeViewModel.this;
                AbstractC17454a abstractC17454a = this.f110270c;
                uk.c<EntryChange> cVar = this.f110271d;
                String strA = abstractC17454a.getProductCode();
                this.f110268a = 1;
                if (homeViewModel.updateCartEntry(abstractC17454a, cVar, strA, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.home.HomeViewModel$d, reason: case insensitive filesystem */
    /* synthetic */ class C12442d extends FunctionReferenceImpl implements Function1<List<? extends CouponState>, Unit> {
        C12442d(Object obj) {
            super(1, obj, HomeViewModel.class, "onCouponState", "onCouponState(Ljava/util/List;)V", 0);
        }

        public final void a(List<CouponState> p02) {
            Intrinsics.j(p02, "p0");
            ((HomeViewModel) this.receiver).onCouponState(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends CouponState> list) {
            a(list);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$processedRequest$3", f = "HomeViewModel.kt", l = {1401}, m = "invokeSuspend")
    static final class d0 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110272a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC17454a f110274c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ uk.c<EntryChange> f110275d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new d0(this.f110274c, this.f110275d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(AbstractC17454a abstractC17454a, uk.c<EntryChange> cVar, Continuation<? super d0> continuation) {
            super(2, continuation);
            this.f110274c = abstractC17454a;
            this.f110275d = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d0) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110272a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                HomeViewModel homeViewModel = HomeViewModel.this;
                AbstractC17454a abstractC17454a = this.f110274c;
                uk.c<EntryChange> cVar = this.f110275d;
                String strA = abstractC17454a.getProductCode();
                this.f110272a = 1;
                if (homeViewModel.removeCartEntry(abstractC17454a, cVar, strA, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.home.HomeViewModel$e, reason: case insensitive filesystem */
    /* synthetic */ class C12443e extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C12443e(Object obj) {
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
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$refreshHomeContent$1", f = "HomeViewModel.kt", l = {432}, m = "invokeSuspend")
    static final class e0 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110276a;

        e0(Continuation<? super e0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new e0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e0) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110276a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C14536a c14536a = HomeViewModel.this.homeChipsRepository;
                this.f110276a = 1;
                if (c14536a.d(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$6", f = "HomeViewModel.kt", l = {276}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.home.HomeViewModel$f, reason: case insensitive filesystem */
    static final class C12444f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110278a;

        C12444f(Continuation<? super C12444f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new C12444f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12444f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110278a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C14536a c14536a = HomeViewModel.this.homeChipsRepository;
                this.f110278a = 1;
                if (c14536a.d(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$refreshHomeContent$2", f = "HomeViewModel.kt", l = {434}, m = "invokeSuspend")
    static final class f0 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110280a;

        f0(Continuation<? super f0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new f0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f0) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110280a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                HomeViewModel homeViewModel = HomeViewModel.this;
                this.f110280a = 1;
                if (homeViewModel.getProfileInformation(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lhm/b;", "chips", "", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$7", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.home.HomeViewModel$g, reason: case insensitive filesystem */
    static final class C12445g extends SuspendLambda implements Function2<List<? extends AbstractC14537b>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110282a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f110283b;

        C12445g(Continuation<? super C12445g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12445g c12445g = HomeViewModel.this.new C12445g(continuation);
            c12445g.f110283b = obj;
            return c12445g;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<? extends AbstractC14537b> list, Continuation<? super Unit> continuation) {
            return ((C12445g) create(list, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            HomeViewState homeViewState;
            Object obj2;
            HomeDecorator homeDecoratorCopy$default;
            IntrinsicsKt.f();
            if (this.f110282a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            List list = (List) this.f110283b;
            InterfaceC16549B interfaceC16549B = HomeViewModel.this._homeViewState;
            do {
                Object value = interfaceC16549B.getValue();
                homeViewState = (HomeViewState) value;
                HomeDecorator homeDecorator = homeViewState.getHomeDecorator();
                if (homeDecorator != null) {
                    obj2 = value;
                    homeDecoratorCopy$default = HomeDecorator.copy$default(homeDecorator, null, list, null, null, null, null, null, null, null, null, null, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536870909, null);
                } else {
                    obj2 = value;
                    homeDecoratorCopy$default = null;
                }
            } while (!interfaceC16549B.e(obj2, HomeViewState.copy$default(homeViewState, false, false, homeDecoratorCopy$default, null, false, null, false, 0, null, false, null, null, null, null, null, 32763, null)));
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel", f = "HomeViewModel.kt", l = {1574, 1583}, m = "removeCartEntry")
    static final class g0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f110285a;

        /* renamed from: b, reason: collision with root package name */
        Object f110286b;

        /* renamed from: c, reason: collision with root package name */
        Object f110287c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f110288d;

        /* renamed from: f, reason: collision with root package name */
        int f110290f;

        g0(Continuation<? super g0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f110288d = obj;
            this.f110290f |= Integer.MIN_VALUE;
            return HomeViewModel.this.removeCartEntry(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel", f = "HomeViewModel.kt", l = {1516, 1528, 1537, 1555}, m = "addCartEntry")
    /* renamed from: com.meijer.mobile.meijer.activity.home.HomeViewModel$h, reason: case insensitive filesystem */
    static final class C12446h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f110291a;

        /* renamed from: b, reason: collision with root package name */
        Object f110292b;

        /* renamed from: c, reason: collision with root package name */
        Object f110293c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f110294d;

        /* renamed from: f, reason: collision with root package name */
        int f110296f;

        C12446h(Continuation<? super C12446h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f110294d = obj;
            this.f110296f |= Integer.MIN_VALUE;
            return HomeViewModel.this.addCartEntry(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$sendBeaconToastMessage$1", f = "HomeViewModel.kt", l = {2492}, m = "invokeSuspend")
    static final class h0 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f110297a;

        /* renamed from: b, reason: collision with root package name */
        int f110298b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f110299c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ HomeViewModel f110300d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Ul.a f110301e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ nk.c f110302f;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new h0(this.f110299c, this.f110300d, this.f110301e, this.f110302f, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h0(boolean z10, HomeViewModel homeViewModel, Ul.a aVar, nk.c cVar, Continuation<? super h0> continuation) {
            super(2, continuation);
            this.f110299c = z10;
            this.f110300d = homeViewModel;
            this.f110301e = aVar;
            this.f110302f = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((h0) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            String strB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110298b;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                if (this.f110299c) {
                    str = "Format Level";
                } else {
                    str = "Sku level";
                }
                InterfaceC16548A interfaceC16548A = this.f110300d._toastMessageData;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(' ');
                Ul.a aVar = this.f110301e;
                if (aVar != null) {
                    strB = aVar.getDisplayName();
                } else {
                    strB = null;
                }
                sb2.append(strB);
                sb2.append(" Beacon sent successfully!");
                ToastMessageData eVar = new ToastMessageData(sb2.toString(), this.f110302f);
                this.f110297a = str;
                this.f110298b = 1;
                if (interfaceC16548A.emit(eVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$claimMperks$1", f = "HomeViewModel.kt", l = {859}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.home.HomeViewModel$i, reason: case insensitive filesystem */
    static final class C12447i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f110303a;

        /* renamed from: b, reason: collision with root package name */
        Object f110304b;

        /* renamed from: c, reason: collision with root package name */
        Object f110305c;

        /* renamed from: d, reason: collision with root package name */
        Object f110306d;

        /* renamed from: e, reason: collision with root package name */
        int f110307e;

        /* renamed from: f, reason: collision with root package name */
        int f110308f;

        /* renamed from: g, reason: collision with root package name */
        int f110309g;

        /* renamed from: h, reason: collision with root package name */
        int f110310h;

        /* renamed from: i, reason: collision with root package name */
        int f110311i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f110312j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f110314l;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$claimMperks$1$3$1", f = "HomeViewModel.kt", l = {867}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.home.HomeViewModel$i$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f110315a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ HomeViewModel f110316b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(HomeViewModel homeViewModel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f110316b = homeViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f110316b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f110315a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f110316b._events;
                    HomeEvent.ShowMperksClaimRewardError showMperksClaimRewardError = HomeEvent.ShowMperksClaimRewardError.INSTANCE;
                    this.f110315a = 1;
                    if (interfaceC16548A.emit(showMperksClaimRewardError, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12447i(long j10, Continuation<? super C12447i> continuation) {
            super(2, continuation);
            this.f110314l = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12447i c12447i = HomeViewModel.this.new C12447i(this.f110314l, continuation);
            c12447i.f110312j = obj;
            return c12447i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12447i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110311i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f110312j;
                    HomeViewModel homeViewModel = HomeViewModel.this;
                    long j10 = this.f110314l;
                    Result.Companion companion = Result.INSTANCE;
                    fo.e eVar = homeViewModel.rewardsRepository;
                    this.f110312j = interfaceC15783O;
                    this.f110303a = interfaceC15783O;
                    this.f110304b = this;
                    this.f110305c = this;
                    this.f110306d = interfaceC15783O;
                    this.f110307e = 0;
                    this.f110308f = 0;
                    this.f110309g = 0;
                    this.f110310h = 0;
                    this.f110311i = 1;
                    if (eVar.b(j10, this) == objF) {
                        return objF;
                    }
                }
                objB = Result.b(Unit.f143329a);
            } catch (Exception e10) {
                mv.E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            HomeViewModel homeViewModel2 = HomeViewModel.this;
            long j11 = this.f110314l;
            if (Result.h(objB)) {
                homeViewModel2.processMperksState(j11, true);
                homeViewModel2.fetchMperks(false);
            }
            HomeViewModel homeViewModel3 = HomeViewModel.this;
            long j12 = this.f110314l;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.e(thE);
                C15809k.d(androidx.view.d0.a(homeViewModel3), null, null, new a(homeViewModel3, null), 3, null);
                homeViewModel3.processMperksState(j12, false);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$sendCriteoBeacon$1", f = "HomeViewModel.kt", l = {2323}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class i0 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f110317a;

        /* renamed from: b, reason: collision with root package name */
        Object f110318b;

        /* renamed from: c, reason: collision with root package name */
        Object f110319c;

        /* renamed from: d, reason: collision with root package name */
        Object f110320d;

        /* renamed from: e, reason: collision with root package name */
        Object f110321e;

        /* renamed from: f, reason: collision with root package name */
        Object f110322f;

        /* renamed from: g, reason: collision with root package name */
        Object f110323g;

        /* renamed from: h, reason: collision with root package name */
        Object f110324h;

        /* renamed from: i, reason: collision with root package name */
        Object f110325i;

        /* renamed from: j, reason: collision with root package name */
        Object f110326j;

        /* renamed from: k, reason: collision with root package name */
        Object f110327k;

        /* renamed from: l, reason: collision with root package name */
        Object f110328l;

        /* renamed from: m, reason: collision with root package name */
        boolean f110329m;

        /* renamed from: n, reason: collision with root package name */
        int f110330n;

        /* renamed from: o, reason: collision with root package name */
        int f110331o;

        /* renamed from: p, reason: collision with root package name */
        int f110332p;

        /* renamed from: q, reason: collision with root package name */
        int f110333q;

        /* renamed from: r, reason: collision with root package name */
        int f110334r;

        /* renamed from: s, reason: collision with root package name */
        int f110335s;

        /* renamed from: t, reason: collision with root package name */
        int f110336t;

        /* renamed from: u, reason: collision with root package name */
        private /* synthetic */ Object f110337u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ List<String> f110338v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ boolean f110339w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ Ul.a f110340x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ EnumC15218a f110341y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ HomeViewModel f110342z;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            i0 i0Var = new i0(this.f110338v, this.f110339w, this.f110340x, this.f110341y, this.f110342z, continuation);
            i0Var.f110337u = obj;
            return i0Var;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i0(List<String> list, boolean z10, Ul.a aVar, EnumC15218a enumC15218a, HomeViewModel homeViewModel, Continuation<? super i0> continuation) {
            super(2, continuation);
            this.f110338v = list;
            this.f110339w = z10;
            this.f110340x = aVar;
            this.f110341y = enumC15218a;
            this.f110342z = homeViewModel;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((i0) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x00aa A[Catch: Exception -> 0x012a, TRY_LEAVE, TryCatch #1 {Exception -> 0x012a, blocks: (B:15:0x00a4, B:17:0x00aa), top: B:53:0x00a4 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x01a0  */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v16 */
        /* JADX WARN: Type inference failed for: r2v25 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0104 -> B:23:0x0116). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 442
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.home.HomeViewModel.i0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel", f = "HomeViewModel.kt", l = {1310, 1311, 1314}, m = "clipCoupon")
    /* renamed from: com.meijer.mobile.meijer.activity.home.HomeViewModel$j, reason: case insensitive filesystem */
    static final class C12448j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f110343a;

        /* renamed from: b, reason: collision with root package name */
        Object f110344b;

        /* renamed from: c, reason: collision with root package name */
        Object f110345c;

        /* renamed from: d, reason: collision with root package name */
        Object f110346d;

        /* renamed from: e, reason: collision with root package name */
        Object f110347e;

        /* renamed from: f, reason: collision with root package name */
        Object f110348f;

        /* renamed from: g, reason: collision with root package name */
        int f110349g;

        /* renamed from: h, reason: collision with root package name */
        int f110350h;

        /* renamed from: i, reason: collision with root package name */
        int f110351i;

        /* renamed from: j, reason: collision with root package name */
        int f110352j;

        /* renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f110353k;

        /* renamed from: m, reason: collision with root package name */
        int f110355m;

        C12448j(Continuation<? super C12448j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f110353k = obj;
            this.f110355m |= Integer.MIN_VALUE;
            return HomeViewModel.this.clipCoupon(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$syncWhiteLabelFeatureFlagState$1", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class j0 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110356a;

        j0(Continuation<? super j0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new j0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((j0) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            HomeViewState homeViewState;
            HomeDecorator homeDecorator;
            IntrinsicsKt.f();
            if (this.f110356a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC16549B interfaceC16549B = HomeViewModel.this._homeViewState;
            HomeViewModel homeViewModel = HomeViewModel.this;
            do {
                value = interfaceC16549B.getValue();
                homeViewState = (HomeViewState) value;
                homeDecorator = homeViewState.getHomeDecorator();
            } while (!interfaceC16549B.e(value, HomeViewState.copy$default(homeViewState, false, false, homeDecorator != null ? HomeDecorator.copy$default(homeDecorator, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, homeViewModel.featureManager.e(AbstractC18503f.S.f172858h), 268435455, null) : null, null, false, null, false, 0, null, false, null, null, null, null, null, 32763, null)));
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$configureFeatureEntryPoints$1", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.home.HomeViewModel$k, reason: case insensitive filesystem */
    static final class C12449k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110358a;

        C12449k(Continuation<? super C12449k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new C12449k(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12449k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            HomeViewState homeViewState;
            HomeDecorator homeDecorator;
            IntrinsicsKt.f();
            if (this.f110358a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC16549B interfaceC16549B = HomeViewModel.this._homeViewState;
            do {
                value = interfaceC16549B.getValue();
                homeViewState = (HomeViewState) value;
                homeDecorator = homeViewState.getHomeDecorator();
            } while (!interfaceC16549B.e(value, HomeViewState.copy$default(homeViewState, false, false, homeDecorator != null ? HomeDecorator.copy$default(homeDecorator, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, e.d.a.f39999g, false, 402653183, null) : null, null, false, null, false, 0, null, false, null, null, null, null, null, 32763, null)));
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$throwChallenge$1", f = "HomeViewModel.kt", l = {1286}, m = "invokeSuspend")
    static final class k0 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110360a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC17720a.ChokingHazardChallenge f110362c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new k0(this.f110362c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k0(AbstractC17720a.ChokingHazardChallenge c2629a, Continuation<? super k0> continuation) {
            super(2, continuation);
            this.f110362c = c2629a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((k0) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110360a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = HomeViewModel.this._events;
                HomeEvent.ShowChokingWarningDialogEvent showChokingWarningDialogEvent = new HomeEvent.ShowChokingWarningDialogEvent(this.f110362c.a());
                this.f110360a = 1;
                if (interfaceC16548A.emit(showChokingWarningDialogEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$fetchActiveOrders$1", f = "HomeViewModel.kt", l = {661}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.home.HomeViewModel$l, reason: case insensitive filesystem */
    static final class C12450l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f110363a;

        /* renamed from: b, reason: collision with root package name */
        Object f110364b;

        /* renamed from: c, reason: collision with root package name */
        Object f110365c;

        /* renamed from: d, reason: collision with root package name */
        Object f110366d;

        /* renamed from: e, reason: collision with root package name */
        int f110367e;

        /* renamed from: f, reason: collision with root package name */
        int f110368f;

        /* renamed from: g, reason: collision with root package name */
        int f110369g;

        /* renamed from: h, reason: collision with root package name */
        int f110370h;

        /* renamed from: i, reason: collision with root package name */
        int f110371i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f110372j;

        C12450l(Continuation<? super C12450l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12450l c12450l = HomeViewModel.this.new C12450l(continuation);
            c12450l.f110372j = obj;
            return c12450l;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12450l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            ArrayList arrayList;
            HomeDecorator homeDecoratorCopy$default;
            List<FlyBuyOrderDetail.FlyBuyOrder> listA;
            Object value;
            HomeViewState homeViewState;
            HomeDecorator homeDecorator;
            Object objE;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110371i;
            String str = HomeViewModel.ActiveOrdersLoadingKey;
            AbstractC6392a abstractC6392a = null;
            Object[] objArr = 0;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f110372j;
                    HomeViewModel.this.loadingStatesManager.b(new a.Loading(str, abstractC6392a, 2, objArr == true ? 1 : 0));
                    HomeViewModel homeViewModel = HomeViewModel.this;
                    Result.Companion companion = Result.INSTANCE;
                    C14781c c14781c = homeViewModel.orderStatusRepository;
                    this.f110372j = interfaceC15783O;
                    this.f110363a = interfaceC15783O;
                    this.f110364b = this;
                    this.f110365c = this;
                    this.f110366d = interfaceC15783O;
                    this.f110367e = 0;
                    this.f110368f = 0;
                    this.f110369g = 0;
                    this.f110370h = 0;
                    this.f110371i = 1;
                    objE = c14781c.e(this);
                    if (objE == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objE = obj;
                }
                objB = Result.b(objE);
            } catch (Exception e10) {
                mv.E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            HomeViewModel homeViewModel2 = HomeViewModel.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "Failed to retrieve order details in HomeViewModel", new Object[0]);
                InterfaceC16549B interfaceC16549B = homeViewModel2._homeViewState;
                do {
                    value = interfaceC16549B.getValue();
                    homeViewState = (HomeViewState) value;
                    homeDecorator = homeViewState.getHomeDecorator();
                } while (!interfaceC16549B.e(value, HomeViewState.copy$default(homeViewState, false, false, homeDecorator != null ? HomeDecorator.copy$default(homeDecorator, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, false, null, null, false, null, false, CollectionsKt.m(), 0, false, null, null, null, null, false, 534773759, null) : null, null, false, null, false, 0, null, false, null, null, null, null, null, 32763, null)));
            }
            HomeViewModel homeViewModel3 = HomeViewModel.this;
            if (Result.h(objB)) {
                List<FullOrderResponseHolder> list = (List) objB;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list, 10));
                for (FullOrderResponseHolder c14779a : list) {
                    OrderStatusCardDecorator.Companion companion3 = OrderStatusCardDecorator.INSTANCE;
                    OrderDetail orderDetailD = c14779a.getFullOrderDetails();
                    FlyBuyOrderDetail bVarC = c14779a.getFlyBuyResponse();
                    arrayList2.add(companion3.b(orderDetailD, (bVarC == null || (listA = bVarC.a()) == null) ? null : (FlyBuyOrderDetail.FlyBuyOrder) CollectionsKt.u0(listA), c14779a.getSubstitutionOrderDetails(), c14779a.g(), c14779a.e()));
                }
                InterfaceC16549B interfaceC16549B2 = homeViewModel3._homeViewState;
                while (true) {
                    Object value2 = interfaceC16549B2.getValue();
                    HomeViewState homeViewState2 = (HomeViewState) value2;
                    HomeDecorator homeDecorator2 = homeViewState2.getHomeDecorator();
                    if (homeDecorator2 != null) {
                        arrayList = arrayList2;
                        homeDecoratorCopy$default = HomeDecorator.copy$default(homeDecorator2, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, false, null, null, false, null, false, arrayList, 0, !arrayList2.isEmpty(), null, null, null, null, false, 526385151, null);
                    } else {
                        arrayList = arrayList2;
                        homeDecoratorCopy$default = null;
                    }
                    if (interfaceC16549B2.e(value2, HomeViewState.copy$default(homeViewState2, false, false, homeDecoratorCopy$default, null, false, null, false, 0, null, false, null, null, null, null, null, 32763, null))) {
                        break;
                    }
                    arrayList2 = arrayList;
                }
            }
            HomeViewModel.this.loadingStatesManager.b(new a.NotLoading(HomeViewModel.ActiveOrdersLoadingKey));
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel", f = "HomeViewModel.kt", l = {1420, 1446, 1454, 1474, 1482, 1490}, m = "updateCartEntry")
    static final class l0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f110374a;

        /* renamed from: b, reason: collision with root package name */
        Object f110375b;

        /* renamed from: c, reason: collision with root package name */
        Object f110376c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f110377d;

        /* renamed from: f, reason: collision with root package name */
        int f110379f;

        l0(Continuation<? super l0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f110377d = obj;
            this.f110379f |= Integer.MIN_VALUE;
            return HomeViewModel.this.updateCartEntry(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$fetchAllBuyAgainUpcs$1", f = "HomeViewModel.kt", l = {391}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.home.HomeViewModel$m, reason: case insensitive filesystem */
    static final class C12451m extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f110380a;

        /* renamed from: b, reason: collision with root package name */
        Object f110381b;

        /* renamed from: c, reason: collision with root package name */
        Object f110382c;

        /* renamed from: d, reason: collision with root package name */
        Object f110383d;

        /* renamed from: e, reason: collision with root package name */
        int f110384e;

        /* renamed from: f, reason: collision with root package name */
        int f110385f;

        /* renamed from: g, reason: collision with root package name */
        int f110386g;

        /* renamed from: h, reason: collision with root package name */
        int f110387h;

        /* renamed from: i, reason: collision with root package name */
        int f110388i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f110389j;

        C12451m(Continuation<? super C12451m> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12451m c12451m = HomeViewModel.this.new C12451m(continuation);
            c12451m.f110389j = obj;
            return c12451m;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12451m) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110388i;
            try {
            } catch (Exception e10) {
                mv.E0.i(getContext());
                Result.Companion companion = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f110389j;
                if (HomeViewModel.this.userManager.b()) {
                    HomeViewModel homeViewModel = HomeViewModel.this;
                    Result.Companion companion2 = Result.INSTANCE;
                    C15058b c15058b = homeViewModel.productRecommendationsRepository;
                    nk.d dVar = nk.d.f152479b;
                    this.f110389j = interfaceC15783O;
                    this.f110380a = interfaceC15783O;
                    this.f110381b = this;
                    this.f110382c = this;
                    this.f110383d = interfaceC15783O;
                    this.f110384e = 0;
                    this.f110385f = 0;
                    this.f110386g = 0;
                    this.f110387h = 0;
                    this.f110388i = 1;
                    obj = c15058b.c(dVar, this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    HomeViewModel.this.productMetadataStore.b();
                    return Unit.f143329a;
                }
            }
            objB = Result.b(obj);
            HomeViewModel homeViewModel2 = HomeViewModel.this;
            if (Result.h(objB)) {
                homeViewModel2.productMetadataStore.a((List) objB);
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "Fetch recommended or buy-again upc failed", new Object[0]);
            }
            Result.a(objB);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$updateRateAndTipNotification$1", f = "HomeViewModel.kt", l = {1261, 1261, 1266}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class m0 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f110391a;

        /* renamed from: b, reason: collision with root package name */
        Object f110392b;

        /* renamed from: c, reason: collision with root package name */
        Object f110393c;

        /* renamed from: d, reason: collision with root package name */
        Object f110394d;

        /* renamed from: e, reason: collision with root package name */
        Object f110395e;

        /* renamed from: f, reason: collision with root package name */
        Object f110396f;

        /* renamed from: g, reason: collision with root package name */
        Object f110397g;

        /* renamed from: h, reason: collision with root package name */
        int f110398h;

        /* renamed from: i, reason: collision with root package name */
        int f110399i;

        /* renamed from: j, reason: collision with root package name */
        int f110400j;

        /* renamed from: k, reason: collision with root package name */
        int f110401k;

        /* renamed from: l, reason: collision with root package name */
        int f110402l;

        /* renamed from: m, reason: collision with root package name */
        private /* synthetic */ Object f110403m;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f110405o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f110406p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f110407q;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lhj/c;", "<anonymous>", "(Lmv/O;)Lhj/c;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$updateRateAndTipNotification$1$1$orderFullDetails$1", f = "HomeViewModel.kt", l = {1254}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super OrderDetail>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f110408a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ HomeViewModel f110409b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f110410c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(HomeViewModel homeViewModel, String str, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f110409b = homeViewModel;
                this.f110410c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f110409b, this.f110410c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super OrderDetail> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f110408a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                com.meijer.mobile.digitalshopping.api.orders.a aVar = this.f110409b.ordersRepository;
                String str = this.f110410c;
                this.f110408a = 1;
                Object objY = aVar.y(str, this);
                if (objY == objF) {
                    return objF;
                }
                return objY;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$updateRateAndTipNotification$1$1$updateTipInfo$1", f = "HomeViewModel.kt", l = {1256}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f110411a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ HomeViewModel f110412b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f110413c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f110414d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(HomeViewModel homeViewModel, String str, String str2, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f110412b = homeViewModel;
                this.f110413c = str;
                this.f110414d = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f110412b, this.f110413c, this.f110414d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f110411a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                com.meijer.mobile.digitalshopping.api.orders.a aVar = this.f110412b.ordersRepository;
                String str = this.f110413c;
                String str2 = this.f110414d;
                this.f110411a = 1;
                Object objK = aVar.K(str, str2, this);
                if (objK == objF) {
                    return objF;
                }
                return objK;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m0(String str, String str2, boolean z10, Continuation<? super m0> continuation) {
            super(2, continuation);
            this.f110405o = str;
            this.f110406p = str2;
            this.f110407q = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            m0 m0Var = HomeViewModel.this.new m0(this.f110405o, this.f110406p, this.f110407q, continuation);
            m0Var.f110403m = obj;
            return m0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((m0) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x0162, code lost:
        
            if (r5.emit(r8, r16) == r2) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x016b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 376
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.home.HomeViewModel.m0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$fetchBanners$1", f = "HomeViewModel.kt", l = {789}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.home.HomeViewModel$n, reason: case insensitive filesystem */
    static final class C12452n extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f110415a;

        /* renamed from: b, reason: collision with root package name */
        Object f110416b;

        /* renamed from: c, reason: collision with root package name */
        Object f110417c;

        /* renamed from: d, reason: collision with root package name */
        Object f110418d;

        /* renamed from: e, reason: collision with root package name */
        int f110419e;

        /* renamed from: f, reason: collision with root package name */
        int f110420f;

        /* renamed from: g, reason: collision with root package name */
        int f110421g;

        /* renamed from: h, reason: collision with root package name */
        int f110422h;

        /* renamed from: i, reason: collision with root package name */
        int f110423i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f110424j;

        C12452n(Continuation<? super C12452n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12452n c12452n = HomeViewModel.this.new C12452n(continuation);
            c12452n.f110424j = obj;
            return c12452n;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12452n) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            HomeViewState homeViewState;
            HomeDecorator homeDecorator;
            Object objD;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110423i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f110424j;
                    HomeViewModel homeViewModel = HomeViewModel.this;
                    Result.Companion companion = Result.INSTANCE;
                    C15053b c15053b = homeViewModel.marketingBannerRepository;
                    this.f110424j = interfaceC15783O;
                    this.f110415a = interfaceC15783O;
                    this.f110416b = this;
                    this.f110417c = this;
                    this.f110418d = interfaceC15783O;
                    this.f110419e = 0;
                    this.f110420f = 0;
                    this.f110421g = 0;
                    this.f110422h = 0;
                    this.f110423i = 1;
                    objD = C15053b.d(c15053b, null, this, 1, null);
                    if (objD == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objD = obj;
                }
                objB = Result.b(objD);
            } catch (Exception e10) {
                mv.E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            HomeViewModel homeViewModel2 = HomeViewModel.this;
            if (Result.h(objB)) {
                MarketingBannersDecorator aVar = (MarketingBannersDecorator) objB;
                InterfaceC16549B interfaceC16549B = homeViewModel2._homeViewState;
                do {
                    value = interfaceC16549B.getValue();
                    homeViewState = (HomeViewState) value;
                    homeDecorator = homeViewState.getHomeDecorator();
                } while (!interfaceC16549B.e(value, HomeViewState.copy$default(homeViewState, false, false, homeDecorator != null ? HomeDecorator.copy$default(homeDecorator, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, false, aVar, null, false, null, false, null, 0, false, null, null, null, null, false, 536805375, null) : null, null, false, null, false, 0, null, false, null, null, null, null, null, 32763, null)));
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "Failed to fetch banners", new Object[0]);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel", f = "HomeViewModel.kt", l = {1304, 1305}, m = "fetchCoupon")
    /* renamed from: com.meijer.mobile.meijer.activity.home.HomeViewModel$o, reason: case insensitive filesystem */
    static final class C12453o extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f110426a;

        /* renamed from: b, reason: collision with root package name */
        Object f110427b;

        /* renamed from: c, reason: collision with root package name */
        Object f110428c;

        /* renamed from: d, reason: collision with root package name */
        Object f110429d;

        /* renamed from: e, reason: collision with root package name */
        Object f110430e;

        /* renamed from: f, reason: collision with root package name */
        Object f110431f;

        /* renamed from: g, reason: collision with root package name */
        int f110432g;

        /* renamed from: h, reason: collision with root package name */
        int f110433h;

        /* renamed from: i, reason: collision with root package name */
        int f110434i;

        /* renamed from: j, reason: collision with root package name */
        int f110435j;

        /* renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f110436k;

        /* renamed from: m, reason: collision with root package name */
        int f110438m;

        C12453o(Continuation<? super C12453o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f110436k = obj;
            this.f110438m |= Integer.MIN_VALUE;
            return HomeViewModel.this.fetchCoupon(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$fetchCuratedCard$1", f = "HomeViewModel.kt", l = {1100}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.home.HomeViewModel$p, reason: case insensitive filesystem */
    static final class C12454p extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f110439a;

        /* renamed from: b, reason: collision with root package name */
        Object f110440b;

        /* renamed from: c, reason: collision with root package name */
        Object f110441c;

        /* renamed from: d, reason: collision with root package name */
        Object f110442d;

        /* renamed from: e, reason: collision with root package name */
        int f110443e;

        /* renamed from: f, reason: collision with root package name */
        int f110444f;

        /* renamed from: g, reason: collision with root package name */
        int f110445g;

        /* renamed from: h, reason: collision with root package name */
        int f110446h;

        /* renamed from: i, reason: collision with root package name */
        int f110447i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f110448j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ e.f f110450l;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12454p c12454p = HomeViewModel.this.new C12454p(this.f110450l, continuation);
            c12454p.f110448j = obj;
            return c12454p;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12454p(e.f fVar, Continuation<? super C12454p> continuation) {
            super(2, continuation);
            this.f110450l = fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12454p) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110447i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f110448j;
                    HomeViewModel homeViewModel = HomeViewModel.this;
                    e.f fVar = this.f110450l;
                    Result.Companion companion = Result.INSTANCE;
                    C15052a c15052a = homeViewModel.homeRepository;
                    this.f110448j = interfaceC15783O;
                    this.f110439a = interfaceC15783O;
                    this.f110440b = this;
                    this.f110441c = this;
                    this.f110442d = interfaceC15783O;
                    this.f110443e = 0;
                    this.f110444f = 0;
                    this.f110445g = 0;
                    this.f110446h = 0;
                    this.f110447i = 1;
                    obj = c15052a.h(fVar, this);
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
            HomeViewModel homeViewModel2 = HomeViewModel.this;
            e.f fVar2 = this.f110450l;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                homeViewModel2.setLoadingStateError(fVar2.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), thE);
            }
            HomeViewModel homeViewModel3 = HomeViewModel.this;
            e.f fVar3 = this.f110450l;
            if (Result.h(objB)) {
                homeViewModel3.onGetCuratedResponse((Vl.j) objB, fVar3);
                homeViewModel3.loadingStatesManager.b(new a.NotLoading(fVar3.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()));
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$fetchDepartmentCarousel$1", f = "HomeViewModel.kt", l = {708}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.home.HomeViewModel$q, reason: case insensitive filesystem */
    static final class C12455q extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f110451a;

        /* renamed from: b, reason: collision with root package name */
        Object f110452b;

        /* renamed from: c, reason: collision with root package name */
        Object f110453c;

        /* renamed from: d, reason: collision with root package name */
        Object f110454d;

        /* renamed from: e, reason: collision with root package name */
        Object f110455e;

        /* renamed from: f, reason: collision with root package name */
        int f110456f;

        /* renamed from: g, reason: collision with root package name */
        int f110457g;

        /* renamed from: h, reason: collision with root package name */
        int f110458h;

        /* renamed from: i, reason: collision with root package name */
        int f110459i;

        /* renamed from: j, reason: collision with root package name */
        int f110460j;

        /* renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f110461k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ e.c f110462l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ HomeViewModel f110463m;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12455q c12455q = new C12455q(this.f110462l, this.f110463m, continuation);
            c12455q.f110461k = obj;
            return c12455q;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12455q(e.c cVar, HomeViewModel homeViewModel, Continuation<? super C12455q> continuation) {
            super(2, continuation);
            this.f110462l = cVar;
            this.f110463m = homeViewModel;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12455q) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r7.f110460j
                r2 = 1
                if (r1 == 0) goto L31
                if (r1 != r2) goto L29
                java.lang.Object r0 = r7.f110455e
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r7.f110454d
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                java.lang.Object r0 = r7.f110453c
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                java.lang.Object r0 = r7.f110452b
                mv.O r0 = (mv.InterfaceC15783O) r0
                java.lang.Object r0 = r7.f110451a
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r1 = r7.f110461k
                mv.O r1 = (mv.InterfaceC15783O) r1
                kotlin.ResultKt.b(r8)     // Catch: java.lang.Exception -> L27
                goto L80
            L27:
                r8 = move-exception
                goto L87
            L29:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L31:
                kotlin.ResultKt.b(r8)
                java.lang.Object r8 = r7.f110461k
                mv.O r8 = (mv.InterfaceC15783O) r8
                Vl.e$c r1 = r7.f110462l
                boolean r3 = r1 instanceof Vl.e.c.b
                if (r3 == 0) goto L41
                java.lang.String r1 = "shopByDepartmentsV2"
                goto L47
            L41:
                boolean r1 = r1 instanceof Vl.e.c.a
                if (r1 == 0) goto Lba
                java.lang.String r1 = "seasonalCarousel"
            L47:
                com.meijer.mobile.meijer.activity.home.HomeViewModel r3 = r7.f110463m
                Pj.c r3 = com.meijer.mobile.meijer.activity.home.HomeViewModel.access$getLoadingStatesManager$p(r3)
                Pj.a$b r4 = new Pj.a$b
                r5 = 2
                r6 = 0
                r4.<init>(r1, r6, r5, r6)
                r3.b(r4)
                com.meijer.mobile.meijer.activity.home.HomeViewModel r3 = r7.f110463m
                Vl.e$c r4 = r7.f110462l
                kotlin.Result$Companion r5 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L85
                jm.a r3 = com.meijer.mobile.meijer.activity.home.HomeViewModel.access$getHomeRepository$p(r3)     // Catch: java.lang.Exception -> L85
                r7.f110461k = r8     // Catch: java.lang.Exception -> L85
                r7.f110451a = r1     // Catch: java.lang.Exception -> L85
                r7.f110452b = r8     // Catch: java.lang.Exception -> L85
                r7.f110453c = r7     // Catch: java.lang.Exception -> L85
                r7.f110454d = r7     // Catch: java.lang.Exception -> L85
                r7.f110455e = r8     // Catch: java.lang.Exception -> L85
                r8 = 0
                r7.f110456f = r8     // Catch: java.lang.Exception -> L85
                r7.f110457g = r8     // Catch: java.lang.Exception -> L85
                r7.f110458h = r8     // Catch: java.lang.Exception -> L85
                r7.f110459i = r8     // Catch: java.lang.Exception -> L85
                r7.f110460j = r2     // Catch: java.lang.Exception -> L85
                java.lang.Object r8 = r3.b(r4, r7)     // Catch: java.lang.Exception -> L85
                if (r8 != r0) goto L7f
                return r0
            L7f:
                r0 = r1
            L80:
                java.lang.Object r8 = kotlin.Result.b(r8)     // Catch: java.lang.Exception -> L27
                goto L98
            L85:
                r8 = move-exception
                r0 = r1
            L87:
                kotlin.coroutines.CoroutineContext r1 = r7.getContext()
                mv.E0.i(r1)
                kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
                java.lang.Object r8 = kotlin.ResultKt.a(r8)
                java.lang.Object r8 = kotlin.Result.b(r8)
            L98:
                com.meijer.mobile.meijer.activity.home.HomeViewModel r1 = r7.f110463m
                java.lang.Throwable r2 = kotlin.Result.e(r8)
                if (r2 == 0) goto La8
                qw.a$a r3 = qw.a.INSTANCE
                r3.e(r2)
                com.meijer.mobile.meijer.activity.home.HomeViewModel.access$setLoadingStateError(r1, r0, r2)
            La8:
                com.meijer.mobile.meijer.activity.home.HomeViewModel r1 = r7.f110463m
                Vl.e$c r2 = r7.f110462l
                boolean r3 = kotlin.Result.h(r8)
                if (r3 == 0) goto Lb7
                Vl.c r8 = (Vl.DepartmentCard) r8
                com.meijer.mobile.meijer.activity.home.HomeViewModel.access$updateDepartmentCarousels(r1, r0, r2, r8)
            Lb7:
                kotlin.Unit r8 = kotlin.Unit.f143329a
                return r8
            Lba:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.home.HomeViewModel.C12455q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$fetchEmailVerificationBannerSettings$1", f = "HomeViewModel.kt", l = {807}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.home.HomeViewModel$r, reason: case insensitive filesystem */
    static final class C12456r extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f110464a;

        /* renamed from: b, reason: collision with root package name */
        Object f110465b;

        /* renamed from: c, reason: collision with root package name */
        Object f110466c;

        /* renamed from: d, reason: collision with root package name */
        Object f110467d;

        /* renamed from: e, reason: collision with root package name */
        int f110468e;

        /* renamed from: f, reason: collision with root package name */
        int f110469f;

        /* renamed from: g, reason: collision with root package name */
        int f110470g;

        /* renamed from: h, reason: collision with root package name */
        int f110471h;

        /* renamed from: i, reason: collision with root package name */
        int f110472i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f110473j;

        C12456r(Continuation<? super C12456r> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12456r c12456r = HomeViewModel.this.new C12456r(continuation);
            c12456r.f110473j = obj;
            return c12456r;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12456r) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            HomeViewState homeViewState;
            HomeDecorator homeDecoratorCopy$default;
            Object objC;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110472i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f110473j;
                    HomeViewModel homeViewModel = HomeViewModel.this;
                    Result.Companion companion = Result.INSTANCE;
                    C15052a c15052a = homeViewModel.homeRepository;
                    this.f110473j = interfaceC15783O;
                    this.f110464a = interfaceC15783O;
                    this.f110465b = this;
                    this.f110466c = this;
                    this.f110467d = interfaceC15783O;
                    this.f110468e = 0;
                    this.f110469f = 0;
                    this.f110470g = 0;
                    this.f110471h = 0;
                    this.f110472i = 1;
                    objC = c15052a.c(this);
                    if (objC == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objC = obj;
                }
                objB = Result.b(objC);
            } catch (Exception e10) {
                mv.E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            HomeViewModel homeViewModel2 = HomeViewModel.this;
            if (Result.h(objB)) {
                EmailVerificationSpiffs mVar = (EmailVerificationSpiffs) objB;
                homeViewModel2.appPrefManager.G(mVar.getSuccess() && !mVar.a().isEmpty());
                InterfaceC16549B interfaceC16549B = homeViewModel2._homeViewState;
                do {
                    value = interfaceC16549B.getValue();
                    homeViewState = (HomeViewState) value;
                    HomeDecorator homeDecorator = homeViewState.getHomeDecorator();
                    if (homeDecorator != null) {
                        homeDecoratorCopy$default = HomeDecorator.copy$default(homeDecorator, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, homeViewModel2.appPrefManager.J() && homeViewState.getAuthenticated(), false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536854527, null);
                    } else {
                        homeDecoratorCopy$default = null;
                    }
                } while (!interfaceC16549B.e(value, HomeViewState.copy$default(homeViewState, false, false, homeDecoratorCopy$default, null, false, null, false, 0, null, false, null, null, null, null, null, 32763, null)));
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "Failed to fetch email verification spiff.", new Object[0]);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$fetchEnrollmentOfferResendEmailResponse$1", f = "HomeViewModel.kt", l = {1186, 1202, 1206}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.home.HomeViewModel$s, reason: case insensitive filesystem */
    static final class C12457s extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f110475a;

        /* renamed from: b, reason: collision with root package name */
        Object f110476b;

        /* renamed from: c, reason: collision with root package name */
        Object f110477c;

        /* renamed from: d, reason: collision with root package name */
        Object f110478d;

        /* renamed from: e, reason: collision with root package name */
        int f110479e;

        /* renamed from: f, reason: collision with root package name */
        int f110480f;

        /* renamed from: g, reason: collision with root package name */
        int f110481g;

        /* renamed from: h, reason: collision with root package name */
        int f110482h;

        /* renamed from: i, reason: collision with root package name */
        int f110483i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f110484j;

        C12457s(Continuation<? super C12457s> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12457s c12457s = HomeViewModel.this.new C12457s(continuation);
            c12457s.f110484j = obj;
            return c12457s;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(TrackingData c14759f) {
            c14759f.v("mperks");
            c14759f.n("mperks: account creation confirmation");
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12457s) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0181 A[PHI: r0 r5
          0x0181: PHI (r0v15 java.lang.Object) = (r0v12 java.lang.Object), (r0v12 java.lang.Object), (r0v18 java.lang.Object) binds: [B:27:0x00bb, B:56:0x0181, B:42:0x0180] A[DONT_GENERATE, DONT_INLINE]
          0x0181: PHI (r5v7 mv.O) = (r5v5 mv.O), (r5v5 mv.O), (r5v8 mv.O) binds: [B:27:0x00bb, B:56:0x0181, B:42:0x0180] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0189  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r46) {
            /*
                Method dump skipped, instructions count: 461
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.home.HomeViewModel.C12457s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$fetchHomeCards$1", f = "HomeViewModel.kt", l = {951}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.home.HomeViewModel$t, reason: case insensitive filesystem */
    static final class C12458t extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f110486a;

        /* renamed from: b, reason: collision with root package name */
        Object f110487b;

        /* renamed from: c, reason: collision with root package name */
        Object f110488c;

        /* renamed from: d, reason: collision with root package name */
        Object f110489d;

        /* renamed from: e, reason: collision with root package name */
        int f110490e;

        /* renamed from: f, reason: collision with root package name */
        int f110491f;

        /* renamed from: g, reason: collision with root package name */
        int f110492g;

        /* renamed from: h, reason: collision with root package name */
        int f110493h;

        /* renamed from: i, reason: collision with root package name */
        int f110494i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f110495j;

        C12458t(Continuation<? super C12458t> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12458t c12458t = HomeViewModel.this.new C12458t(continuation);
            c12458t.f110495j = obj;
            return c12458t;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12458t) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110494i;
            int i11 = 2;
            String str = HomeViewModel.FetchHomeCardsLoadingKey;
            AbstractC6392a abstractC6392a = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f110495j;
                    HomeViewModel.this.loadingStatesManager.b(new a.Loading(str, objArr2 == true ? 1 : 0, i11, objArr == true ? 1 : 0));
                    HomeViewModel homeViewModel = HomeViewModel.this;
                    Result.Companion companion = Result.INSTANCE;
                    C15052a c15052a = homeViewModel.homeRepository;
                    this.f110495j = interfaceC15783O;
                    this.f110486a = interfaceC15783O;
                    this.f110487b = this;
                    this.f110488c = this;
                    this.f110489d = interfaceC15783O;
                    this.f110490e = 0;
                    this.f110491f = 0;
                    this.f110492g = 0;
                    this.f110493h = 0;
                    this.f110494i = 1;
                    obj = c15052a.e(this);
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
            HomeViewModel homeViewModel2 = HomeViewModel.this;
            if (Result.e(objB) != null) {
                homeViewModel2.loadingStatesManager.b(new a.Failed(str, abstractC6392a, i11, objArr3 == true ? 1 : 0));
            }
            HomeViewModel homeViewModel3 = HomeViewModel.this;
            if (Result.h(objB)) {
                homeViewModel3.makeHomeCardsAPICalls((List) objB);
                homeViewModel3.loadingStatesManager.b(new a.NotLoading(HomeViewModel.FetchHomeCardsLoadingKey));
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$fetchMperks$1", f = "HomeViewModel.kt", l = {831}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.home.HomeViewModel$u, reason: case insensitive filesystem */
    static final class C12459u extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f110497a;

        /* renamed from: b, reason: collision with root package name */
        Object f110498b;

        /* renamed from: c, reason: collision with root package name */
        Object f110499c;

        /* renamed from: d, reason: collision with root package name */
        Object f110500d;

        /* renamed from: e, reason: collision with root package name */
        int f110501e;

        /* renamed from: f, reason: collision with root package name */
        int f110502f;

        /* renamed from: g, reason: collision with root package name */
        int f110503g;

        /* renamed from: h, reason: collision with root package name */
        int f110504h;

        /* renamed from: i, reason: collision with root package name */
        int f110505i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f110506j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f110507k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ HomeViewModel f110508l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12459u(boolean z10, HomeViewModel homeViewModel, Continuation<? super C12459u> continuation) {
            super(2, continuation);
            this.f110507k = z10;
            this.f110508l = homeViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12459u c12459u = new C12459u(this.f110507k, this.f110508l, continuation);
            c12459u.f110506j = obj;
            return c12459u;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12459u) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            HomeViewState homeViewState;
            HomeDecorator homeDecorator;
            Object objF;
            Object objF2 = IntrinsicsKt.f();
            int i10 = this.f110505i;
            AbstractC6392a abstractC6392a = null;
            Object[] objArr = 0;
            String str = HomeViewModel.MperksLoadingKey;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f110506j;
                    if (this.f110507k) {
                        this.f110508l.loadingStatesManager.b(new a.Loading(str, abstractC6392a, 2, objArr == true ? 1 : 0));
                    }
                    HomeViewModel homeViewModel = this.f110508l;
                    Result.Companion companion = Result.INSTANCE;
                    C15052a c15052a = homeViewModel.homeRepository;
                    e.C0857e c0857e = e.C0857e.f40000a;
                    this.f110506j = interfaceC15783O;
                    this.f110497a = interfaceC15783O;
                    this.f110498b = this;
                    this.f110499c = this;
                    this.f110500d = interfaceC15783O;
                    this.f110501e = 0;
                    this.f110502f = 0;
                    this.f110503g = 0;
                    this.f110504h = 0;
                    this.f110505i = 1;
                    objF = c15052a.f(c0857e, this);
                    if (objF == objF2) {
                        return objF2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objF = obj;
                }
                objB = Result.b(objF);
            } catch (Exception e10) {
                mv.E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            HomeViewModel homeViewModel2 = this.f110508l;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "Resource.Failure<mperksResource>", new Object[0]);
                homeViewModel2.setLoadingStateError(HomeViewModel.MperksLoadingKey, thE);
            }
            HomeViewModel homeViewModel3 = this.f110508l;
            if (Result.h(objB)) {
                HomeMperks homeMperks = (HomeMperks) objB;
                InterfaceC16549B interfaceC16549B = homeViewModel3._homeViewState;
                do {
                    value = interfaceC16549B.getValue();
                    homeViewState = (HomeViewState) value;
                    homeDecorator = homeViewState.getHomeDecorator();
                } while (!interfaceC16549B.e(value, HomeViewState.copy$default(homeViewState, false, false, homeDecorator != null ? HomeDecorator.copy$default(homeDecorator, homeMperks, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536870910, null) : null, null, false, null, false, 0, null, false, null, null, null, null, null, 32763, null)));
                homeViewModel3.loadingStatesManager.b(new a.NotLoading(HomeViewModel.MperksLoadingKey));
                if (homeViewModel3.userManager.b()) {
                    homeViewModel3.appPrefManager.F(true);
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$fetchMperksExpiringPoints$1", f = "HomeViewModel.kt", l = {895, 897}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.home.HomeViewModel$v, reason: case insensitive filesystem */
    static final class C12460v extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f110509a;

        /* renamed from: b, reason: collision with root package name */
        Object f110510b;

        /* renamed from: c, reason: collision with root package name */
        Object f110511c;

        /* renamed from: d, reason: collision with root package name */
        Object f110512d;

        /* renamed from: e, reason: collision with root package name */
        int f110513e;

        /* renamed from: f, reason: collision with root package name */
        int f110514f;

        /* renamed from: g, reason: collision with root package name */
        int f110515g;

        /* renamed from: h, reason: collision with root package name */
        int f110516h;

        /* renamed from: i, reason: collision with root package name */
        int f110517i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f110518j;

        C12460v(Continuation<? super C12460v> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12460v c12460v = HomeViewModel.this.new C12460v(continuation);
            c12460v.f110518j = obj;
            return c12460v;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12460v) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
        /* JADX WARN: Type inference failed for: r1v17, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v23 */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r7.f110517i
                r2 = 2
                r3 = 0
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L41
                if (r1 == r4) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r0 = r7.f110510b
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r0 = r7.f110509a
                java.lang.Object r1 = r7.f110518j
                mv.O r1 = (mv.InterfaceC15783O) r1
                kotlin.ResultKt.b(r8)
                goto La3
            L1f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L27:
                java.lang.Object r1 = r7.f110512d
                mv.O r1 = (mv.InterfaceC15783O) r1
                java.lang.Object r1 = r7.f110511c
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r1 = r7.f110510b
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r1 = r7.f110509a
                mv.O r1 = (mv.InterfaceC15783O) r1
                java.lang.Object r1 = r7.f110518j
                mv.O r1 = (mv.InterfaceC15783O) r1
                kotlin.ResultKt.b(r8)     // Catch: java.lang.Exception -> L3f
                goto L6c
            L3f:
                r8 = move-exception
                goto L71
            L41:
                kotlin.ResultKt.b(r8)
                java.lang.Object r8 = r7.f110518j
                r1 = r8
                mv.O r1 = (mv.InterfaceC15783O) r1
                com.meijer.mobile.meijer.activity.home.HomeViewModel r8 = com.meijer.mobile.meijer.activity.home.HomeViewModel.this
                kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3f
                fo.e r8 = com.meijer.mobile.meijer.activity.home.HomeViewModel.access$getRewardsRepository$p(r8)     // Catch: java.lang.Exception -> L3f
                r7.f110518j = r1     // Catch: java.lang.Exception -> L3f
                r7.f110509a = r1     // Catch: java.lang.Exception -> L3f
                r7.f110510b = r7     // Catch: java.lang.Exception -> L3f
                r7.f110511c = r7     // Catch: java.lang.Exception -> L3f
                r7.f110512d = r1     // Catch: java.lang.Exception -> L3f
                r7.f110513e = r5     // Catch: java.lang.Exception -> L3f
                r7.f110514f = r5     // Catch: java.lang.Exception -> L3f
                r7.f110515g = r5     // Catch: java.lang.Exception -> L3f
                r7.f110516h = r5     // Catch: java.lang.Exception -> L3f
                r7.f110517i = r4     // Catch: java.lang.Exception -> L3f
                java.lang.Object r8 = fo.e.p(r8, r5, r7, r4, r3)     // Catch: java.lang.Exception -> L3f
                if (r8 != r0) goto L6c
                goto La1
            L6c:
                java.lang.Object r8 = kotlin.Result.b(r8)     // Catch: java.lang.Exception -> L3f
                goto L82
            L71:
                kotlin.coroutines.CoroutineContext r4 = r7.getContext()
                mv.E0.i(r4)
                kotlin.Result$Companion r4 = kotlin.Result.INSTANCE
                java.lang.Object r8 = kotlin.ResultKt.a(r8)
                java.lang.Object r8 = kotlin.Result.b(r8)
            L82:
                com.meijer.mobile.meijer.activity.home.HomeViewModel r4 = com.meijer.mobile.meijer.activity.home.HomeViewModel.this
                boolean r6 = kotlin.Result.h(r8)
                if (r6 == 0) goto La4
                r6 = r8
                java.util.List r6 = (java.util.List) r6
                r7.f110518j = r1
                r7.f110509a = r8
                r7.f110510b = r6
                r7.f110511c = r3
                r7.f110512d = r3
                r7.f110513e = r5
                r7.f110517i = r2
                java.lang.Object r1 = com.meijer.mobile.meijer.activity.home.HomeViewModel.access$setPointsExpiry(r4, r6, r7)
                if (r1 != r0) goto La2
            La1:
                return r0
            La2:
                r0 = r8
            La3:
                r8 = r0
            La4:
                java.lang.Throwable r8 = kotlin.Result.e(r8)
                if (r8 == 0) goto Lb3
                qw.a$a r0 = qw.a.INSTANCE
                java.lang.String r1 = "Failed to fetch Mperks expiring points"
                java.lang.Object[] r2 = new java.lang.Object[r5]
                r0.f(r8, r1, r2)
            Lb3:
                kotlin.Unit r8 = kotlin.Unit.f143329a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.home.HomeViewModel.C12460v.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$fetchPersonalizedProductCard$1", f = "HomeViewModel.kt", l = {992}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.home.HomeViewModel$w, reason: case insensitive filesystem */
    static final class C12461w extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f110520a;

        /* renamed from: b, reason: collision with root package name */
        Object f110521b;

        /* renamed from: c, reason: collision with root package name */
        Object f110522c;

        /* renamed from: d, reason: collision with root package name */
        Object f110523d;

        /* renamed from: e, reason: collision with root package name */
        int f110524e;

        /* renamed from: f, reason: collision with root package name */
        int f110525f;

        /* renamed from: g, reason: collision with root package name */
        int f110526g;

        /* renamed from: h, reason: collision with root package name */
        int f110527h;

        /* renamed from: i, reason: collision with root package name */
        int f110528i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f110529j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ e.f f110531l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ EnumC15218a f110532m;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12461w c12461w = HomeViewModel.this.new C12461w(this.f110531l, this.f110532m, continuation);
            c12461w.f110529j = obj;
            return c12461w;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12461w(e.f fVar, EnumC15218a enumC15218a, Continuation<? super C12461w> continuation) {
            super(2, continuation);
            this.f110531l = fVar;
            this.f110532m = enumC15218a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12461w) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object next;
            Vl.j jVar;
            InterfaceC16549B interfaceC16549B;
            ProductFullDetails productFullDetails;
            Object obj2;
            HomeDecorator homeDecoratorCopy$default;
            Object objH;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110528i;
            AbstractC6392a abstractC6392a = null;
            Object[] objArr = 0;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f110529j;
                    HomeViewModel.this.loadingStatesManager.b(new a.Loading(this.f110531l.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), abstractC6392a, 2, objArr == true ? 1 : 0));
                    HomeViewModel homeViewModel = HomeViewModel.this;
                    e.f fVar = this.f110531l;
                    Result.Companion companion = Result.INSTANCE;
                    C15052a c15052a = homeViewModel.homeRepository;
                    this.f110529j = interfaceC15783O;
                    this.f110520a = interfaceC15783O;
                    this.f110521b = this;
                    this.f110522c = this;
                    this.f110523d = interfaceC15783O;
                    this.f110524e = 0;
                    this.f110525f = 0;
                    this.f110526g = 0;
                    this.f110527h = 0;
                    this.f110528i = 1;
                    objH = c15052a.h(fVar, this);
                    if (objH == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objH = obj;
                }
                objB = Result.b(objH);
            } catch (Exception e10) {
                mv.E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            HomeViewModel homeViewModel2 = HomeViewModel.this;
            e.f fVar2 = this.f110531l;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                homeViewModel2.setLoadingStateError(fVar2.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), thE);
            }
            HomeViewModel homeViewModel3 = HomeViewModel.this;
            e.f fVar3 = this.f110531l;
            EnumC15218a enumC15218a = this.f110532m;
            if (Result.h(objB)) {
                Vl.j jVar2 = (Vl.j) objB;
                Iterator<T> it = jVar2.c().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((ProductFullDetails) next).getIsSponsoredCriteo()) {
                        break;
                    }
                }
                ProductFullDetails productFullDetails2 = (ProductFullDetails) next;
                InterfaceC16549B interfaceC16549B2 = homeViewModel3._homeViewState;
                while (true) {
                    Object value = interfaceC16549B2.getValue();
                    HomeViewState homeViewState = (HomeViewState) value;
                    HomeDecorator homeDecorator = homeViewState.getHomeDecorator();
                    if (homeDecorator != null) {
                        Map<e.f, CarouselDecorator> personalizedCarousels = homeViewState.getHomeDecorator().getPersonalizedCarousels();
                        String strH = jVar2.getCardTitle();
                        String strG = jVar2.getSeeAllDeepLink();
                        jVar = jVar2;
                        interfaceC16549B = interfaceC16549B2;
                        productFullDetails = productFullDetails2;
                        obj2 = value;
                        homeDecoratorCopy$default = HomeDecorator.copy$default(homeDecorator, null, null, null, null, null, null, null, null, null, null, null, null, MapsKt.u(personalizedCarousels, MapsKt.g(TuplesKt.a(fVar3, new CarouselDecorator(null, fVar3.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), null, null, strH, strG == null ? "" : strG, enumC15218a, 13, null)))), 0, false, false, null, null, false, null, homeViewModel3.userManager.b(), null, 0, false, null, null, null, null, false, 535818239, null);
                    } else {
                        jVar = jVar2;
                        interfaceC16549B = interfaceC16549B2;
                        productFullDetails = productFullDetails2;
                        obj2 = value;
                        homeDecoratorCopy$default = null;
                    }
                    if (interfaceC16549B.e(obj2, HomeViewState.copy$default(homeViewState, false, false, homeDecoratorCopy$default, null, false, null, false, 0, null, false, null, null, null, null, new BeaconsTracker(jVar.getViewBeaconUrl(), jVar.getLoadBeaconUrl(), null, null, null, null, null, null, 252, null), 16379, null))) {
                        break;
                    }
                    jVar2 = jVar;
                    interfaceC16549B2 = interfaceC16549B;
                    productFullDetails2 = productFullDetails;
                }
                String strE = jVar.getLoadBeaconUrl();
                if (strE == null) {
                    strE = "";
                }
                homeViewModel3.onAction(new AbstractC14072a.OnLoadBeacon(strE, productFullDetails, true, enumC15218a));
                homeViewModel3.multiChannelProductsStateRepository.c(fVar3, jVar.c());
                homeViewModel3.loadingStatesManager.b(new a.NotLoading(fVar3.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()));
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel", f = "HomeViewModel.kt", l = {1087}, m = "fetchProductsForV3Carousel")
    /* renamed from: com.meijer.mobile.meijer.activity.home.HomeViewModel$x, reason: case insensitive filesystem */
    static final class C12462x extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f110533a;

        /* renamed from: b, reason: collision with root package name */
        Object f110534b;

        /* renamed from: c, reason: collision with root package name */
        Object f110535c;

        /* renamed from: d, reason: collision with root package name */
        Object f110536d;

        /* renamed from: e, reason: collision with root package name */
        Object f110537e;

        /* renamed from: f, reason: collision with root package name */
        Object f110538f;

        /* renamed from: g, reason: collision with root package name */
        int f110539g;

        /* renamed from: h, reason: collision with root package name */
        int f110540h;

        /* renamed from: i, reason: collision with root package name */
        int f110541i;

        /* renamed from: j, reason: collision with root package name */
        int f110542j;

        /* renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f110543k;

        /* renamed from: m, reason: collision with root package name */
        int f110545m;

        C12462x(Continuation<? super C12462x> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f110543k = obj;
            this.f110545m |= Integer.MIN_VALUE;
            return HomeViewModel.this.fetchProductsForV3Carousel(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$fetchSpecialOffers$1", f = "HomeViewModel.kt", l = {1153}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.home.HomeViewModel$y, reason: case insensitive filesystem */
    static final class C12463y extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f110546a;

        /* renamed from: b, reason: collision with root package name */
        Object f110547b;

        /* renamed from: c, reason: collision with root package name */
        Object f110548c;

        /* renamed from: d, reason: collision with root package name */
        Object f110549d;

        /* renamed from: e, reason: collision with root package name */
        int f110550e;

        /* renamed from: f, reason: collision with root package name */
        int f110551f;

        /* renamed from: g, reason: collision with root package name */
        int f110552g;

        /* renamed from: h, reason: collision with root package name */
        int f110553h;

        /* renamed from: i, reason: collision with root package name */
        int f110554i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f110555j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ e.b.SpecialOffers f110557l;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12463y c12463y = HomeViewModel.this.new C12463y(this.f110557l, continuation);
            c12463y.f110555j = obj;
            return c12463y;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12463y(e.b.SpecialOffers aVar, Continuation<? super C12463y> continuation) {
            super(2, continuation);
            this.f110557l = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12463y) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            HomeViewState homeViewState;
            HomeDecorator homeDecoratorCopy$default;
            Object objA;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f110554i;
            String str = HomeViewModel.SpecialOffersLoadingKey;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f110555j;
                    HomeViewModel homeViewModel = HomeViewModel.this;
                    e.b.SpecialOffers aVar = this.f110557l;
                    Result.Companion companion = Result.INSTANCE;
                    homeViewModel.loadingStatesManager.b(new a.Loading(str, objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0));
                    C15052a c15052a = homeViewModel.homeRepository;
                    this.f110555j = interfaceC15783O;
                    this.f110546a = interfaceC15783O;
                    this.f110547b = this;
                    this.f110548c = this;
                    this.f110549d = interfaceC15783O;
                    this.f110550e = 0;
                    this.f110551f = 0;
                    this.f110552g = 0;
                    this.f110553h = 0;
                    this.f110554i = 1;
                    objA = c15052a.a(aVar, this);
                    if (objA == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objA = obj;
                }
                objB = Result.b(objA);
            } catch (Exception e10) {
                mv.E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            HomeViewModel homeViewModel2 = HomeViewModel.this;
            if (Result.h(objB)) {
                Vl.b bVar = (Vl.b) objB;
                InterfaceC16549B interfaceC16549B = homeViewModel2._homeViewState;
                do {
                    value = interfaceC16549B.getValue();
                    homeViewState = (HomeViewState) value;
                    HomeDecorator homeDecorator = homeViewState.getHomeDecorator();
                    if (homeDecorator != null) {
                        homeDecoratorCopy$default = HomeDecorator.copy$default(homeDecorator, null, null, null, null, null, null, null, null, null, null, null, null, null, bVar != null ? bVar.getTotalCount() : 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536862719, null);
                    } else {
                        homeDecoratorCopy$default = null;
                    }
                } while (!interfaceC16549B.e(value, HomeViewState.copy$default(homeViewState, false, false, homeDecoratorCopy$default, null, false, null, false, 0, null, false, null, null, null, null, null, 32763, null)));
                C13702d c13702d = homeViewModel2.couponsRepository;
                List<Coupon> listA = bVar != null ? bVar.a() : null;
                if (listA == null) {
                    listA = CollectionsKt.m();
                }
                c13702d.J(listA);
                Yk.u uVar = homeViewModel2.couponsStateRepository;
                List<Coupon> listA2 = bVar != null ? bVar.a() : null;
                if (listA2 == null) {
                    listA2 = CollectionsKt.m();
                }
                uVar.S(listA2);
                homeViewModel2.loadingStatesManager.b(new a.NotLoading(HomeViewModel.SpecialOffersLoadingKey));
            }
            HomeViewModel homeViewModel3 = HomeViewModel.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "Failed to fetch special offers.", new Object[0]);
                homeViewModel3.setLoadingStateError(HomeViewModel.SpecialOffersLoadingKey, thE);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$fetchTipAndNotification$1", f = "HomeViewModel.kt", l = {1219, 1227}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.home.HomeViewModel$z, reason: case insensitive filesystem */
    static final class C12464z extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f110558a;

        /* renamed from: b, reason: collision with root package name */
        Object f110559b;

        /* renamed from: c, reason: collision with root package name */
        Object f110560c;

        /* renamed from: d, reason: collision with root package name */
        Object f110561d;

        /* renamed from: e, reason: collision with root package name */
        int f110562e;

        /* renamed from: f, reason: collision with root package name */
        int f110563f;

        /* renamed from: g, reason: collision with root package name */
        int f110564g;

        /* renamed from: h, reason: collision with root package name */
        int f110565h;

        /* renamed from: i, reason: collision with root package name */
        int f110566i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f110567j;

        C12464z(Continuation<? super C12464z> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12464z c12464z = HomeViewModel.this.new C12464z(continuation);
            c12464z.f110567j = obj;
            return c12464z;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12464z) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
        /* JADX WARN: Type inference failed for: r1v17, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v23 */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 225
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.home.HomeViewModel.C12464z.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public HomeViewModel(yo.k userManager, zl.k featureManager, C18335a appPrefManager, C15052a homeRepository, C14536a homeChipsRepository, Ch.e profileRepository, Ch.c accountsAMSRepository, InterfaceC14523a analyticsEngine, C14781c orderStatusRepository, com.meijer.mobile.digitalshopping.api.orders.a ordersRepository, C13702d couponsRepository, Yk.u couponsStateRepository, fo.e rewardsRepository, wr.f cartInteractor, C17115a multiChannelProductsStateRepository, C15053b marketingBannerRepository, C15058b productRecommendationsRepository, pp.d productMetadataStore, Dl.e deeplinkParser, C16753b beaconClient, Tq.j storeProvider, Ro.c productsRepository, AbstractC15779K ioDispatcher) {
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(appPrefManager, "appPrefManager");
        Intrinsics.j(homeRepository, "homeRepository");
        Intrinsics.j(homeChipsRepository, "homeChipsRepository");
        Intrinsics.j(profileRepository, "profileRepository");
        Intrinsics.j(accountsAMSRepository, "accountsAMSRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(orderStatusRepository, "orderStatusRepository");
        Intrinsics.j(ordersRepository, "ordersRepository");
        Intrinsics.j(couponsRepository, "couponsRepository");
        Intrinsics.j(couponsStateRepository, "couponsStateRepository");
        Intrinsics.j(rewardsRepository, "rewardsRepository");
        Intrinsics.j(cartInteractor, "cartInteractor");
        Intrinsics.j(multiChannelProductsStateRepository, "multiChannelProductsStateRepository");
        Intrinsics.j(marketingBannerRepository, "marketingBannerRepository");
        Intrinsics.j(productRecommendationsRepository, "productRecommendationsRepository");
        Intrinsics.j(productMetadataStore, "productMetadataStore");
        Intrinsics.j(deeplinkParser, "deeplinkParser");
        Intrinsics.j(beaconClient, "beaconClient");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(productsRepository, "productsRepository");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.userManager = userManager;
        this.featureManager = featureManager;
        this.appPrefManager = appPrefManager;
        this.homeRepository = homeRepository;
        this.homeChipsRepository = homeChipsRepository;
        this.profileRepository = profileRepository;
        this.accountsAMSRepository = accountsAMSRepository;
        this.analyticsEngine = analyticsEngine;
        this.orderStatusRepository = orderStatusRepository;
        this.ordersRepository = ordersRepository;
        this.couponsRepository = couponsRepository;
        this.couponsStateRepository = couponsStateRepository;
        this.rewardsRepository = rewardsRepository;
        this.cartInteractor = cartInteractor;
        this.multiChannelProductsStateRepository = multiChannelProductsStateRepository;
        this.marketingBannerRepository = marketingBannerRepository;
        this.productRecommendationsRepository = productRecommendationsRepository;
        this.productMetadataStore = productMetadataStore;
        this.deeplinkParser = deeplinkParser;
        this.beaconClient = beaconClient;
        this.storeProvider = storeProvider;
        this.productsRepository = productsRepository;
        this.ioDispatcher = ioDispatcher;
        Ju.a aVar = new Ju.a();
        this.disposables = aVar;
        this._events = C16555H.b(0, 0, null, 7, null);
        this._toastMessageData = C16555H.b(0, 0, null, 7, null);
        Pj.c cVar = new Pj.c();
        this.loadingStatesManager = cVar;
        InterfaceC16549B<HomeViewState> interfaceC16549BA = pv.S.a(new HomeViewState(false, false, null, null, false, null, false, 0, null, false, null, null, null, null, null, 32767, null));
        this._homeViewState = interfaceC16549BA;
        this.homeViewState = C16563h.c(interfaceC16549BA);
        this.cartId = "-1";
        this.cartEntries = CollectionsKt.m();
        C16563h.J(C16563h.g(C16563h.O(cVar.a(), new C12439a(this)), new C12440b(null)), androidx.view.d0.a(this));
        multiChannelProductsStateRepository.b(new C17115a.InterfaceC2527a() { // from class: com.meijer.mobile.meijer.activity.home.V0
            @Override // sp.C17115a.InterfaceC2527a
            public final void a(Object obj, sp.Y y10) {
                HomeViewModel._init_$lambda$3(this.f110599a, obj, y10);
            }
        });
        io.reactivex.l<List<CouponState>> lVarSubscribeOn = couponsStateRepository.O().subscribeOn(C13889a.b());
        final C12442d c12442d = new C12442d(this);
        Lu.g<? super List<CouponState>> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.home.W0
            @Override // Lu.g
            public final void accept(Object obj) {
                c12442d.invoke(obj);
            }
        };
        final C12443e c12443e = new C12443e(qw.a.INSTANCE);
        Dk.a.a(lVarSubscribeOn.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.home.y0
            @Override // Lu.g
            public final void accept(Object obj) {
                c12443e.invoke(obj);
            }
        }), aVar);
        C15809k.d(androidx.view.d0.a(this), null, null, new C12444f(null), 3, null);
        C16563h.J(C16563h.O(homeChipsRepository.b(), new C12445g(null)), androidx.view.d0.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011f, code lost:
    
        if (r1.emit(r2, r7) == r8) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object addCartEntry(ur.AbstractC17454a r14, uk.c<fj.EntryChange> r15, java.lang.String r16, kotlin.coroutines.Continuation<? super kotlin.Unit> r17) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.home.HomeViewModel.addCartEntry(ur.a, uk.c, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x015f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String getCarouselType(Co.ProductFullDetails r9) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.home.HomeViewModel.getCarouselType(Co.h):java.lang.String");
    }

    private final List<Pk.f> getCouponList(EntryChange entryChange) {
        Entry entry;
        ProductFullDetails productFullDetailsM;
        List<Long> listO;
        Object next;
        Coupon couponC;
        if (entryChange == null || (entry = entryChange.getEntry()) == null || (productFullDetailsM = entry.m()) == null || (listO = productFullDetailsM.o()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listO.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            Iterator<T> it2 = this.homeViewState.getValue().getCouponsStateMap().values().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                CouponState cVar = (CouponState) next;
                if (cVar != null && (couponC = cVar.getCoupon()) != null && couponC.getOfferId() == jLongValue) {
                    break;
                }
            }
            CouponState cVar2 = (CouponState) next;
            Coupon couponC2 = cVar2 != null ? cVar2.getCoupon() : null;
            if (couponC2 != null) {
                arrayList.add(couponC2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double getProductUnitPrice$lambda$74() {
        return 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double getProductUnitPrice$lambda$76() {
        return 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object setPointsExpiry(List<ExpiringPoints> list, Continuation<? super Unit> continuation) {
        if (list.isEmpty()) {
            Object objEmit = this._events.emit(new HomeEvent.ShowMperksPointsExpiringBottomSheet(new MperksPointsExpData(false, 0, null)), continuation);
            return objEmit == IntrinsicsKt.f() ? objEmit : Unit.f143329a;
        }
        InterfaceC16548A<HomeEvent> interfaceC16548A = this._events;
        List<ExpiringPoints> list2 = list;
        Iterator<T> it = list2.iterator();
        int points = 0;
        while (it.hasNext()) {
            points += ((ExpiringPoints) it.next()).getPoints();
        }
        boolean z10 = (points == 0 || this.userManager.i0()) ? false : true;
        Iterator<T> it2 = list2.iterator();
        int points2 = 0;
        while (it2.hasNext()) {
            points2 += ((ExpiringPoints) it2.next()).getPoints();
        }
        Object objEmit2 = interfaceC16548A.emit(new HomeEvent.ShowMperksPointsExpiringBottomSheet(new MperksPointsExpData(z10, points2, list.get(0).getExpiresOn())), continuation);
        return objEmit2 == IntrinsicsKt.f() ? objEmit2 : Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double updateRatedAndTippedOrder$lambda$91() {
        return 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int updateRatedAndTippedOrder$lambda$92() {
        return 0;
    }

    public void onAction(Qk.a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.Clip) {
            C15809k.d(androidx.view.d0.a(this), null, null, new M(action, null), 3, null);
            return;
        }
        if (action instanceof a.ViewCouponDetails) {
            C15809k.d(androidx.view.d0.a(this), null, null, new S(action, null), 3, null);
        } else {
            if (!(action instanceof a.NotInterested) && !(action instanceof a.Unclip) && !(action instanceof a.ViewCouponList)) {
                throw new NoWhenBranchMatchedException();
            }
            Unit unit = Unit.f143329a;
        }
    }

    @Override // androidx.view.InterfaceC6157f
    public /* bridge */ /* synthetic */ void onDestroy(InterfaceC6172s interfaceC6172s) {
        super.onDestroy(interfaceC6172s);
    }

    @Override // androidx.view.InterfaceC6157f
    public /* bridge */ /* synthetic */ void onStart(InterfaceC6172s interfaceC6172s) {
        super.onStart(interfaceC6172s);
    }

    @Override // androidx.view.InterfaceC6157f
    public /* bridge */ /* synthetic */ void onStop(InterfaceC6172s interfaceC6172s) {
        super.onStop(interfaceC6172s);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTq/k;", "it", "", "<anonymous>", "(LTq/k;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.home.HomeViewModel$observeStoreChanges$2", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend")
    static final class E extends SuspendLambda implements Function2<Tq.k, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f110196a;

        E(Continuation<? super E> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new E(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Tq.k kVar, Continuation<? super Unit> continuation) {
            return ((E) create(kVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f110196a == 0) {
                ResultKt.b(obj);
                HomeViewModel.this.loadHomeContent();
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static /* synthetic */ CouponState N(HomeViewModel homeViewModel, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return homeViewModel.getCouponState(str, z10);
    }

    static /* synthetic */ Object O(HomeViewModel homeViewModel, String str, vo.b bVar, List list, boolean z10, String str2, String str3, List list2, Continuation continuation, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            str2 = null;
        }
        if ((i10 & 32) != 0) {
            str3 = null;
        }
        return homeViewModel.onLaunchSubstitutionActivity(str, bVar, list, z10, str2, str3, list2, continuation);
    }

    static /* synthetic */ void P(HomeViewModel homeViewModel, String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        homeViewModel.onStepperInteractionChange(str, z10, z11);
    }

    static /* synthetic */ void Q(HomeViewModel homeViewModel, Ul.a aVar, boolean z10, nk.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        homeViewModel.sendBeaconToastMessage(aVar, z10, cVar);
    }

    static /* synthetic */ void R(HomeViewModel homeViewModel, List list, Ul.a aVar, boolean z10, EnumC15218a enumC15218a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            enumC15218a = null;
        }
        homeViewModel.sendCriteoBeacon(list, aVar, z10, enumC15218a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(final HomeViewModel homeViewModel, final Object key, sp.Y repo) {
        Intrinsics.j(key, "key");
        Intrinsics.j(repo, "repo");
        io.reactivex.l<List<ProductState<ProductFullDetails>>> lVarSubscribeOn = repo.Y0().subscribeOn(C13889a.b());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.home.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeViewModel.v(this.f110672a, key, (List) obj);
            }
        };
        Lu.g<? super List<ProductState<ProductFullDetails>>> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.home.A0
            @Override // Lu.g
            public final void accept(Object obj) {
                HomeViewModel.E(function1, obj);
            }
        };
        final C12441c c12441c = new C12441c(qw.a.INSTANCE);
        Dk.a.a(lVarSubscribeOn.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.home.B0
            @Override // Lu.g
            public final void accept(Object obj) {
                HomeViewModel.J(c12441c, obj);
            }
        }), homeViewModel.disposables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0137, code lost:
    
        if (r5.emit(r11, r3) == r4) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object clipCoupon(Pk.Coupon r20, ii.TrackingData r21, kotlin.coroutines.Continuation<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.home.HomeViewModel.clipCoupon(Pk.a, ii.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void configureFeatureEntryPoints() {
        if (this.featureManager.e(AbstractC18503f.o0.f172893h)) {
            C15809k.d(androidx.view.d0.a(this), null, null, new C12449k(null), 3, null);
        }
    }

    private final void dismissEmailVerificationBanner() {
        HomeViewState value;
        HomeViewState homeViewState;
        HomeDecorator homeDecorator;
        this.appPrefManager.L(Instant.now().toEpochMilli());
        InterfaceC16549B<HomeViewState> interfaceC16549B = this._homeViewState;
        do {
            value = interfaceC16549B.getValue();
            homeViewState = value;
            homeDecorator = homeViewState.getHomeDecorator();
        } while (!interfaceC16549B.e(value, HomeViewState.copy$default(homeViewState, false, false, homeDecorator != null ? HomeDecorator.copy$default(homeDecorator, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536854527, null) : null, null, false, null, false, 0, null, false, null, null, null, null, null, 32763, null)));
    }

    private final void fetchAllCoupons() {
        io.reactivex.u uVarK = C13702d.B(this.couponsRepository, new CouponOptions(null, null, null, false, true, 0L, null, null, false, null, null, false, false, 8175, null), false, false, false, 14, null).k(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.home.J0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeViewModel.fetchAllCoupons$lambda$56((CouponsResponse) obj);
            }
        };
        Lu.g gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.home.K0
            @Override // Lu.g
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.meijer.mobile.meijer.activity.home.L0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeViewModel.fetchAllCoupons$lambda$58((Throwable) obj);
            }
        };
        Dk.a.a(uVarK.o(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.home.M0
            @Override // Lu.g
            public final void accept(Object obj) {
                function12.invoke(obj);
            }
        }), this.disposables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchAllCoupons$lambda$56(CouponsResponse c13814a) {
        qw.a.INSTANCE.a("Received " + c13814a.getCouponCount() + " coupons", new Object[0]);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchAllCoupons$lambda$58(Throwable th2) {
        qw.a.INSTANCE.e(th2);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c9, code lost:
    
        if (clipCoupon(r2, r6, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchCoupon(Pk.c r8, ii.TrackingData r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.home.HomeViewModel.fetchCoupon(Pk.c, ii.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void fetchDepartmentCarousel(e.c departmentCarousel) {
        if (!(departmentCarousel instanceof e.c.a) || this.featureManager.e(AbstractC18503f.c0.f172871h)) {
            C15809k.d(androidx.view.d0.a(this), null, null, new C12455q(departmentCarousel, this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchMperks(boolean showLoading) {
        if (this.userManager.b()) {
            C15809k.d(androidx.view.d0.a(this), null, null, new C12459u(showLoading, this, null), 3, null);
        }
    }

    private final void fetchPersonalizedProductCard(e.f homeComponent) {
        EnumC15218a enumC15218a = (!(homeComponent instanceof e.f.a) && (homeComponent instanceof e.f.c)) ? EnumC15218a.f142568b : EnumC15218a.f142567a;
        C15809k.d(androidx.view.d0.a(this), null, null, new C12461w(homeComponent, enumC15218a, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchProductsForV3Carousel(Vl.ProductCarouselV3 r5, Vl.e.f.d r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.meijer.mobile.meijer.activity.home.HomeViewModel.C12462x
            if (r0 == 0) goto L13
            r0 = r7
            com.meijer.mobile.meijer.activity.home.HomeViewModel$x r0 = (com.meijer.mobile.meijer.activity.home.HomeViewModel.C12462x) r0
            int r1 = r0.f110545m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f110545m = r1
            goto L18
        L13:
            com.meijer.mobile.meijer.activity.home.HomeViewModel$x r0 = new com.meijer.mobile.meijer.activity.home.HomeViewModel$x
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f110543k
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f110545m
            r3 = 1
            if (r2 == 0) goto L4c
            if (r2 != r3) goto L44
            java.lang.Object r5 = r0.f110538f
            com.meijer.mobile.meijer.activity.home.HomeViewModel r5 = (com.meijer.mobile.meijer.activity.home.HomeViewModel) r5
            java.lang.Object r5 = r0.f110537e
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f110536d
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f110535c
            com.meijer.mobile.meijer.activity.home.HomeViewModel r5 = (com.meijer.mobile.meijer.activity.home.HomeViewModel) r5
            java.lang.Object r5 = r0.f110534b
            r6 = r5
            Vl.e$f$d r6 = (Vl.e.f.d) r6
            java.lang.Object r5 = r0.f110533a
            Vl.k r5 = (Vl.ProductCarouselV3) r5
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Exception -> L42
            goto L77
        L42:
            r5 = move-exception
            goto L7c
        L44:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L4c:
            kotlin.ResultKt.b(r7)
            kotlin.Result$Companion r7 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L42
            Ro.c r7 = access$getProductsRepository$p(r4)     // Catch: java.lang.Exception -> L42
            java.util.List r2 = r5.i()     // Catch: java.lang.Exception -> L42
            r0.f110533a = r5     // Catch: java.lang.Exception -> L42
            r0.f110534b = r6     // Catch: java.lang.Exception -> L42
            r0.f110535c = r4     // Catch: java.lang.Exception -> L42
            r0.f110536d = r0     // Catch: java.lang.Exception -> L42
            r0.f110537e = r0     // Catch: java.lang.Exception -> L42
            r0.f110538f = r4     // Catch: java.lang.Exception -> L42
            r5 = 0
            r0.f110539g = r5     // Catch: java.lang.Exception -> L42
            r0.f110540h = r5     // Catch: java.lang.Exception -> L42
            r0.f110541i = r5     // Catch: java.lang.Exception -> L42
            r0.f110542j = r5     // Catch: java.lang.Exception -> L42
            r0.f110545m = r3     // Catch: java.lang.Exception -> L42
            java.lang.Object r7 = r7.j(r2, r0)     // Catch: java.lang.Exception -> L42
            if (r7 != r1) goto L77
            return r1
        L77:
            java.lang.Object r5 = kotlin.Result.b(r7)     // Catch: java.lang.Exception -> L42
            goto L8d
        L7c:
            kotlin.coroutines.CoroutineContext r7 = r0.getContext()
            mv.E0.i(r7)
            kotlin.Result$Companion r7 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
        L8d:
            java.lang.Throwable r7 = kotlin.Result.e(r5)
            if (r7 == 0) goto L9a
            java.lang.String r0 = r6.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()
            r4.setLoadingStateError(r0, r7)
        L9a:
            boolean r7 = kotlin.Result.h(r5)
            if (r7 == 0) goto La7
            java.util.List r5 = (java.util.List) r5
            sp.a r7 = r4.multiChannelProductsStateRepository
            r7.c(r6, r5)
        La7:
            kotlin.Unit r5 = kotlin.Unit.f143329a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.home.HomeViewModel.fetchProductsForV3Carousel(Vl.k, Vl.e$f$d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void fetchSpecialOffers() {
        C15809k.d(androidx.view.d0.a(this), null, null, new C12463y(new e.b.SpecialOffers(0, 1, null), null), 3, null);
    }

    private final void fetchWhiteLabel(e.f.d.a homeComponent) {
        if (this.featureManager.e(AbstractC18503f.w0.f172911h) && this.userManager.b()) {
            C15809k.d(androidx.view.d0.a(this), null, null, new A(homeComponent, null), 3, null);
        }
    }

    private final TrackingData getClipCouponTrackingData(final Coupon coupon, final EnumC15218a carouselType) {
        Object next;
        Coupon couponC;
        Iterator<T> it = this.homeViewState.getValue().getCouponsStateMap().values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            CouponState cVar = (CouponState) next;
            if (cVar != null && (couponC = cVar.getCoupon()) != null && couponC.getOfferId() == coupon.getOfferId()) {
                break;
            }
        }
        final CouponState cVar2 = (CouponState) next;
        return C14760g.a(C14756c.a("coupon clip"), new Function1() { // from class: com.meijer.mobile.meijer.activity.home.O0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeViewModel.getClipCouponTrackingData$lambda$40(coupon, this, carouselType, cVar2, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getClipCouponTrackingData$lambda$40(Coupon coupon, HomeViewModel homeViewModel, EnumC15218a enumC15218a, CouponState cVar, TrackingData TrackingData) {
        CouponState.b bVarE;
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n("home");
        TrackingData.v("home");
        Rk.b bVar = Rk.b.f33418a;
        TrackingData.c(bVar.f(CollectionsKt.e(coupon)));
        TrackingData.c(bVar.h(homeViewModel.getCarouselType(enumC15218a)));
        boolean z10 = false;
        if (cVar != null && (bVarE = cVar.getProgress()) != null && bVarE.d()) {
            z10 = true;
        }
        TrackingData.c(bVar.c(z10));
        return Unit.f143329a;
    }

    private final CouponState getCouponState(final String productCode, boolean logError) {
        final Map<String, CouponState> couponsStateMap = this.homeViewState.getValue().getCouponsStateMap();
        try {
            return (CouponState) MapsKt.l(couponsStateMap, productCode);
        } catch (NoSuchElementException e10) {
            qw.a.INSTANCE.z("Bug #1517298").u(e10, "Failed to find " + productCode + " in couponStatesMap with keys " + couponsStateMap.keySet(), new Object[0]);
            if (!logError) {
                return null;
            }
            this.analyticsEngine.b(C14756c.h("bug:1517289"), new Function1() { // from class: com.meijer.mobile.meijer.activity.home.D0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HomeViewModel.getCouponState$lambda$68$lambda$67(productCode, couponsStateMap, (TrackingData) obj);
                }
            });
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCouponState$lambda$68$lambda$67(String str, Map map, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("expectedUpc", str);
        track.h("availableKeys", CollectionsKt.B0(map.keySet(), ",", null, null, 0, null, null, 62, null));
        track.m(TrackingData.a.b.f137705a);
        return Unit.f143329a;
    }

    private final double getProductUnitPrice(AbstractC17454a processedRequest) {
        Object next;
        ProductFullDetails productFullDetailsM;
        nk.b bVarD;
        Object next2;
        ProductFullDetails productFullDetailsM2;
        nk.b bVarD2;
        if (processedRequest instanceof AbstractC17454a.Add) {
            return Co.l.a(((AbstractC17454a.Add) processedRequest).getProduct()).D().getValue();
        }
        Double dValueOf = null;
        if (processedRequest instanceof AbstractC17454a.Update) {
            Iterator<T> it = this.cartEntries.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                if (Intrinsics.e(((Entry) next2).m().getCode(), processedRequest.getProductCode())) {
                    break;
                }
            }
            Entry entry = (Entry) next2;
            if (entry != null && (productFullDetailsM2 = entry.m()) != null && (bVarD2 = productFullDetailsM2.D()) != null) {
                dValueOf = Double.valueOf(bVarD2.getValue());
            }
            return C18328d.a(dValueOf, new Function0() { // from class: com.meijer.mobile.meijer.activity.home.P0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Double.valueOf(HomeViewModel.getProductUnitPrice$lambda$74());
                }
            });
        }
        if (!(processedRequest instanceof AbstractC17454a.Remove)) {
            return 0.0d;
        }
        Iterator<T> it2 = this.cartEntries.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (Intrinsics.e(((Entry) next).m().getCode(), ((AbstractC17454a.Remove) processedRequest).getProduct().getCode())) {
                break;
            }
        }
        Entry entry2 = (Entry) next;
        if (entry2 != null && (productFullDetailsM = entry2.m()) != null && (bVarD = productFullDetailsM.D()) != null) {
            dValueOf = Double.valueOf(bVarD.getValue());
        }
        return C18328d.a(dValueOf, new Function0() { // from class: com.meijer.mobile.meijer.activity.home.Q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Double.valueOf(HomeViewModel.getProductUnitPrice$lambda$76());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getProfileInformation(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.meijer.mobile.meijer.activity.home.HomeViewModel.B
            if (r0 == 0) goto L13
            r0 = r7
            com.meijer.mobile.meijer.activity.home.HomeViewModel$B r0 = (com.meijer.mobile.meijer.activity.home.HomeViewModel.B) r0
            int r1 = r0.f110182k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f110182k = r1
            goto L18
        L13:
            com.meijer.mobile.meijer.activity.home.HomeViewModel$B r0 = new com.meijer.mobile.meijer.activity.home.HomeViewModel$B
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f110180i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f110182k
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L58
            if (r2 == r4) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r1 = r0.f110175d
            com.meijer.mobile.meijer.activity.home.HomeViewModel r1 = (com.meijer.mobile.meijer.activity.home.HomeViewModel) r1
            java.lang.Object r1 = r0.f110174c
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f110173b
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f110172a
            com.meijer.mobile.meijer.activity.home.HomeViewModel r1 = (com.meijer.mobile.meijer.activity.home.HomeViewModel) r1
        L39:
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Exception -> L3d
            goto La3
        L3d:
            r7 = move-exception
            goto La8
        L3f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L47:
            java.lang.Object r1 = r0.f110175d
            com.meijer.mobile.meijer.activity.home.HomeViewModel r1 = (com.meijer.mobile.meijer.activity.home.HomeViewModel) r1
            java.lang.Object r1 = r0.f110174c
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f110173b
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f110172a
            com.meijer.mobile.meijer.activity.home.HomeViewModel r1 = (com.meijer.mobile.meijer.activity.home.HomeViewModel) r1
            goto L39
        L58:
            kotlin.ResultKt.b(r7)
            kotlin.Result$Companion r7 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3d
            zl.k r7 = access$getFeatureManager$p(r6)     // Catch: java.lang.Exception -> L3d
            zl.f$c r2 = zl.AbstractC18503f.C18506c.f172870h     // Catch: java.lang.Exception -> L3d
            boolean r7 = r7.e(r2)     // Catch: java.lang.Exception -> L3d
            if (r7 == 0) goto L86
            Ch.c r7 = access$getAccountsAMSRepository$p(r6)     // Catch: java.lang.Exception -> L3d
            r0.f110172a = r6     // Catch: java.lang.Exception -> L3d
            r0.f110173b = r0     // Catch: java.lang.Exception -> L3d
            r0.f110174c = r0     // Catch: java.lang.Exception -> L3d
            r0.f110175d = r6     // Catch: java.lang.Exception -> L3d
            r0.f110176e = r5     // Catch: java.lang.Exception -> L3d
            r0.f110177f = r5     // Catch: java.lang.Exception -> L3d
            r0.f110178g = r5     // Catch: java.lang.Exception -> L3d
            r0.f110179h = r5     // Catch: java.lang.Exception -> L3d
            r0.f110182k = r4     // Catch: java.lang.Exception -> L3d
            java.lang.Object r7 = r7.g(r0)     // Catch: java.lang.Exception -> L3d
            if (r7 != r1) goto La3
            goto La2
        L86:
            Ch.e r7 = access$getProfileRepository$p(r6)     // Catch: java.lang.Exception -> L3d
            r0.f110172a = r6     // Catch: java.lang.Exception -> L3d
            r0.f110173b = r0     // Catch: java.lang.Exception -> L3d
            r0.f110174c = r0     // Catch: java.lang.Exception -> L3d
            r0.f110175d = r6     // Catch: java.lang.Exception -> L3d
            r0.f110176e = r5     // Catch: java.lang.Exception -> L3d
            r0.f110177f = r5     // Catch: java.lang.Exception -> L3d
            r0.f110178g = r5     // Catch: java.lang.Exception -> L3d
            r0.f110179h = r5     // Catch: java.lang.Exception -> L3d
            r0.f110182k = r3     // Catch: java.lang.Exception -> L3d
            java.lang.Object r7 = r7.l(r0)     // Catch: java.lang.Exception -> L3d
            if (r7 != r1) goto La3
        La2:
            return r1
        La3:
            java.lang.Object r7 = kotlin.Result.b(r7)     // Catch: java.lang.Exception -> L3d
            goto Lb9
        La8:
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            mv.E0.i(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r7 = kotlin.ResultKt.a(r7)
            java.lang.Object r7 = kotlin.Result.b(r7)
        Lb9:
            java.lang.Throwable r7 = kotlin.Result.e(r7)
            if (r7 == 0) goto Lc8
            qw.a$a r0 = qw.a.INSTANCE
            java.lang.String r1 = "Failure reloading profile info on home screen"
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r0.f(r7, r1, r2)
        Lc8:
            kotlin.Unit r7 = kotlin.Unit.f143329a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.home.HomeViewModel.getProfileInformation(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadHomeContent() {
        if (this.userManager.b()) {
            wr.f.r(this.cartInteractor, false, this, 1, null);
            this.cartInteractor.p();
            C15809k.d(androidx.view.d0.a(this), null, null, new C(null), 3, null);
            fetchAllBuyAgainUpcs();
            fetchMperksExpiringPoints();
            fetchActiveOrders();
            fetchSpecialOffers();
            fetchPersonalizedCards();
        }
        fetchHomeCards();
        fetchAllCoupons();
        configureFeatureEntryPoints();
        syncWhiteLabelFeatureFlagState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void makeHomeCardsAPICalls(List<? extends Vl.e> homeComponentList) {
        for (Vl.e eVar : homeComponentList) {
            if (eVar instanceof e.c.b) {
                fetchDepartmentCarousel((e.c) eVar);
            } else if (eVar instanceof e.c.a) {
                fetchDepartmentCarousel((e.c) eVar);
            } else if (eVar instanceof e.f.a) {
                fetchPersonalizedProductCard((e.f) eVar);
            } else if (eVar instanceof e.f.c) {
                fetchPersonalizedProductCard((e.f) eVar);
            } else if (eVar instanceof e.f.b) {
                fetchCuratedCard((e.f) eVar);
            } else if (eVar instanceof e.f.d.a) {
                fetchWhiteLabel((e.f.d.a) eVar);
            }
        }
    }

    private static final boolean onAction$hasBeaconBeenSent(HomeViewModel homeViewModel, EnumC15218a enumC15218a, List<String> list) {
        return homeViewModel._homeViewState.getValue().getBeaconsTracker().g(enumC15218a).containsAll(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAction$lambda$103(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("Teacher's List");
        track.n("home");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAction$lambda$105(AbstractC13720b abstractC13720b, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        AbstractC13720b.DepartmentClicked aVar = (AbstractC13720b.DepartmentClicked) abstractC13720b;
        track.h("tierName", aVar.getName());
        track.p(aVar.getCarouselTitle() + ": carousel option click");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAction$lambda$106(AbstractC13720b abstractC13720b, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("collections");
        track.o("collections");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Collection|");
        AbstractC13720b.DepartmentClicked aVar = (AbstractC13720b.DepartmentClicked) abstractC13720b;
        sb2.append(aVar.getName());
        track.h("hier1", sb2.toString());
        track.p(aVar.getCarouselTitle() + ": carousel option click");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAction$lambda$107(AbstractC13720b abstractC13720b, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        AbstractC13720b.DepartmentClicked aVar = (AbstractC13720b.DepartmentClicked) abstractC13720b;
        track.h("tierName", aVar.getName());
        track.o("category");
        track.p(aVar.getCarouselTitle() + ": carousel option click");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAction$lambda$108(AbstractC13720b abstractC13720b, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("tierName", ((AbstractC13720b.DepartmentClicked) abstractC13720b).getName());
        track.p("shop department carousel: tier 1 category");
        return Unit.f143329a;
    }

    private static final void onAction$markBeaconAsSent(HomeViewModel homeViewModel, EnumC15218a enumC15218a, List<String> list) {
        HomeViewState value;
        HomeViewState homeViewState;
        InterfaceC16549B<HomeViewState> interfaceC16549B = homeViewModel._homeViewState;
        do {
            value = interfaceC16549B.getValue();
            homeViewState = value;
        } while (!interfaceC16549B.e(value, HomeViewState.copy$default(homeViewState, false, false, null, null, false, null, false, 0, null, false, null, null, null, null, Ul.c.a(homeViewState.getBeaconsTracker(), enumC15218a, list), 16383, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCouponState(List<CouponState> couponStateList) {
        HomeViewState value;
        HomeViewState homeViewState;
        HomeDecorator homeDecoratorCopy$default;
        InterfaceC16549B<HomeViewState> interfaceC16549B = this._homeViewState;
        do {
            value = interfaceC16549B.getValue();
            homeViewState = value;
            HomeDecorator homeDecorator = homeViewState.getHomeDecorator();
            if (homeDecorator != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : couponStateList) {
                    if (((CouponState) obj).getCoupon().getIsSpecialOffer()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.x(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Qr.a.o(((CouponState) it.next()).getCoupon()));
                }
                homeDecoratorCopy$default = HomeDecorator.copy$default(homeDecorator, null, null, arrayList2, null, null, null, null, null, null, null, null, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536870907, null);
            } else {
                homeDecoratorCopy$default = null;
            }
        } while (!interfaceC16549B.e(value, HomeViewState.copy$default(homeViewState, false, false, homeDecoratorCopy$default, null, false, null, false, 0, null, false, null, null, null, null, null, 32763, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onGetCuratedResponse(Vl.j productCardDataResource, e.f homeComponent) {
        HomeViewState value;
        HomeViewState homeViewState;
        HomeDecorator homeDecoratorCopy$default;
        if (productCardDataResource != null) {
            InterfaceC16549B<HomeViewState> interfaceC16549B = this._homeViewState;
            do {
                value = interfaceC16549B.getValue();
                homeViewState = value;
                HomeDecorator homeDecorator = homeViewState.getHomeDecorator();
                if (homeDecorator != null) {
                    Map<e.f, CarouselDecorator> curatedCarousels = homeViewState.getHomeDecorator().getCuratedCarousels();
                    String strH = productCardDataResource.getCardTitle();
                    String strG = productCardDataResource.getSeeAllDeepLink();
                    if (strG == null) {
                        strG = "";
                    }
                    String strF = productCardDataResource.getCarouselBanner();
                    EnumC15218a enumC15218a = EnumC15218a.f142569c;
                    homeDecoratorCopy$default = HomeDecorator.copy$default(homeDecorator, null, null, null, null, null, null, null, null, null, null, null, MapsKt.u(curatedCarousels, MapsKt.g(TuplesKt.a(homeComponent, new CarouselDecorator(strF, homeComponent.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), null, null, strH, strG, enumC15218a, 12, null)))), null, 0, false, false, null, null, false, null, this.userManager.b(), null, 0, false, null, null, null, null, false, 535820287, null);
                } else {
                    homeDecoratorCopy$default = null;
                }
            } while (!interfaceC16549B.e(value, HomeViewState.copy$default(homeViewState, false, false, homeDecoratorCopy$default, null, false, null, false, 0, null, false, null, null, null, null, null, 32763, null)));
            this.multiChannelProductsStateRepository.c(homeComponent, productCardDataResource.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onLaunchSubstitutionActivity(String str, vo.b bVar, List<OrderSubstitutionItem> list, boolean z10, String str2, String str3, List<OrderOutOfStockItem> list2, Continuation<? super Unit> continuation) {
        InterfaceC16548A<HomeEvent> interfaceC16548A = this._events;
        if (list == null) {
            list = CollectionsKt.m();
        }
        Object objEmit = interfaceC16548A.emit(new HomeEvent.OrderSubstitutionEvent(str, list, bVar, z10, str2, str3, list2 == null ? CollectionsKt.m() : list2), continuation);
        return objEmit == IntrinsicsKt.f() ? objEmit : Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onLoadingStates(java.util.List<? extends Pj.a> r39) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.home.HomeViewModel.onLoadingStates(java.util.List):void");
    }

    private final void onProductCouponButtonClicked(final Pk.c couponIdentity, final EnumC15218a carouselType) {
        io.reactivex.l<Coupon> lVarObserveOn = this.couponsRepository.k(couponIdentity).take(1L).subscribeOn(C13889a.b()).observeOn(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.home.S0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeViewModel.onProductCouponButtonClicked$lambda$36(this.f110589a, couponIdentity, carouselType, (Coupon) obj);
            }
        };
        Lu.g<? super Coupon> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.home.T0
            @Override // Lu.g
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final a0 a0Var = new a0(qw.a.INSTANCE);
        Dk.a.a(lVarObserveOn.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.home.U0
            @Override // Lu.g
            public final void accept(Object obj) {
                a0Var.invoke(obj);
            }
        }), this.disposables);
    }

    private final void onProductsState(Object key, List<ProductState<ProductFullDetails>> productStates) {
        HomeViewState value;
        HomeViewState homeViewState;
        Map<String, CouponState> couponsStateMap;
        LinkedHashMap linkedHashMap;
        HomeViewState value2;
        HomeViewState homeViewStateCopy$default;
        if (!this.skipProductCarouselUpdates) {
            InterfaceC16549B<HomeViewState> interfaceC16549B = this._homeViewState;
            do {
                value2 = interfaceC16549B.getValue();
                HomeViewState homeViewState2 = value2;
                HomeDecorator homeDecoratorCopy$default = null;
                if (Intrinsics.e(key, e.f.a.f40004d)) {
                    HomeDecorator homeDecorator = homeViewState2.getHomeDecorator();
                    if (homeDecorator != null) {
                        List listM1 = CollectionsKt.m1(homeViewState2.getHomeDecorator().getPersonalizedProducts());
                        List<ProductState<ProductFullDetails>> list = productStates;
                        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(toProductListDecorator((ProductState) it.next()));
                        }
                        listM1.set(0, C17728h.c(arrayList, this.featureManager.e(AbstractC18503f.k0.f172887h), this.featureManager.e(AbstractC18503f.l0.f172889h)));
                        Unit unit = Unit.f143329a;
                        homeDecoratorCopy$default = HomeDecorator.copy$default(homeDecorator, null, null, null, null, null, null, null, null, null, null, listM1, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536869887, null);
                    }
                    homeViewStateCopy$default = HomeViewState.copy$default(homeViewState2, false, false, homeDecoratorCopy$default, null, false, null, false, 0, null, false, null, null, null, null, null, 32763, null);
                } else if (Intrinsics.e(key, e.f.c.f40008d)) {
                    HomeDecorator homeDecorator2 = homeViewState2.getHomeDecorator();
                    if (homeDecorator2 != null) {
                        List listM12 = CollectionsKt.m1(homeViewState2.getHomeDecorator().getPersonalizedProducts());
                        List<ProductState<ProductFullDetails>> list2 = productStates;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list2, 10));
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(toProductListDecorator((ProductState) it2.next()));
                        }
                        C17728h.c((List) listM12.set(1, arrayList2), this.featureManager.e(AbstractC18503f.k0.f172887h), this.featureManager.e(AbstractC18503f.l0.f172889h));
                        Unit unit2 = Unit.f143329a;
                        homeDecoratorCopy$default = HomeDecorator.copy$default(homeDecorator2, null, null, null, null, null, null, null, null, null, null, listM12, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536869887, null);
                    }
                    homeViewStateCopy$default = HomeViewState.copy$default(homeViewState2, false, false, homeDecoratorCopy$default, null, false, null, false, 0, null, false, null, null, null, null, null, 32763, null);
                } else if (Intrinsics.e(key, e.f.b.a.f40005d)) {
                    HomeDecorator homeDecorator3 = homeViewState2.getHomeDecorator();
                    if (homeDecorator3 != null) {
                        List listM13 = CollectionsKt.m1(homeViewState2.getHomeDecorator().getCuratedProducts());
                        List<ProductState<ProductFullDetails>> list3 = productStates;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.x(list3, 10));
                        Iterator<T> it3 = list3.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(toProductListDecorator((ProductState) it3.next()));
                        }
                        listM13.set(0, arrayList3);
                        Unit unit3 = Unit.f143329a;
                        homeDecoratorCopy$default = HomeDecorator.copy$default(homeDecorator3, null, null, null, null, null, null, null, null, null, listM13, null, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536870399, null);
                    }
                    homeViewStateCopy$default = HomeViewState.copy$default(homeViewState2, false, false, homeDecoratorCopy$default, null, false, null, false, 0, null, false, null, null, null, null, null, 32763, null);
                } else if (Intrinsics.e(key, e.f.b.C0858b.f40006d)) {
                    HomeDecorator homeDecorator4 = homeViewState2.getHomeDecorator();
                    if (homeDecorator4 != null) {
                        List listM14 = CollectionsKt.m1(homeViewState2.getHomeDecorator().getCuratedProducts());
                        List<ProductState<ProductFullDetails>> list4 = productStates;
                        ArrayList arrayList4 = new ArrayList(CollectionsKt.x(list4, 10));
                        Iterator<T> it4 = list4.iterator();
                        while (it4.hasNext()) {
                            arrayList4.add(toProductListDecorator((ProductState) it4.next()));
                        }
                        listM14.set(1, arrayList4);
                        Unit unit4 = Unit.f143329a;
                        homeDecoratorCopy$default = HomeDecorator.copy$default(homeDecorator4, null, null, null, null, null, null, null, null, null, listM14, null, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536870399, null);
                    }
                    homeViewStateCopy$default = HomeViewState.copy$default(homeViewState2, false, false, homeDecoratorCopy$default, null, false, null, false, 0, null, false, null, null, null, null, null, 32763, null);
                } else if (Intrinsics.e(key, e.f.b.c.f40007d)) {
                    HomeDecorator homeDecorator5 = homeViewState2.getHomeDecorator();
                    if (homeDecorator5 != null) {
                        List listM15 = CollectionsKt.m1(homeViewState2.getHomeDecorator().getCuratedProducts());
                        List<ProductState<ProductFullDetails>> list5 = productStates;
                        ArrayList arrayList5 = new ArrayList(CollectionsKt.x(list5, 10));
                        Iterator<T> it5 = list5.iterator();
                        while (it5.hasNext()) {
                            arrayList5.add(toProductListDecorator((ProductState) it5.next()));
                        }
                        listM15.set(2, arrayList5);
                        Unit unit5 = Unit.f143329a;
                        homeDecoratorCopy$default = HomeDecorator.copy$default(homeDecorator5, null, null, null, null, null, null, null, null, null, listM15, null, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536870399, null);
                    }
                    homeViewStateCopy$default = HomeViewState.copy$default(homeViewState2, false, false, homeDecoratorCopy$default, null, false, null, false, 0, null, false, null, null, null, null, null, 32763, null);
                } else if (Intrinsics.e(key, e.f.d.a.f40010e)) {
                    HomeDecorator homeDecorator6 = homeViewState2.getHomeDecorator();
                    if (homeDecorator6 != null) {
                        List<ProductState<ProductFullDetails>> list6 = productStates;
                        ArrayList arrayList6 = new ArrayList(CollectionsKt.x(list6, 10));
                        Iterator<T> it6 = list6.iterator();
                        while (it6.hasNext()) {
                            arrayList6.add(toProductListDecorator((ProductState) it6.next()));
                        }
                        homeDecoratorCopy$default = HomeDecorator.copy$default(homeDecorator6, null, null, null, null, null, null, null, arrayList6, null, null, null, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536870783, null);
                    }
                    homeViewStateCopy$default = HomeViewState.copy$default(homeViewState2, false, false, homeDecoratorCopy$default, null, false, null, false, 0, null, false, null, null, null, null, null, 32763, null);
                } else {
                    homeViewStateCopy$default = HomeViewState.copy$default(homeViewState2, false, false, null, null, false, null, false, 0, null, false, null, null, null, null, null, 32767, null);
                }
            } while (!interfaceC16549B.e(value2, homeViewStateCopy$default));
        }
        this.skipProductCarouselUpdates = false;
        InterfaceC16549B<HomeViewState> interfaceC16549B2 = this._homeViewState;
        do {
            value = interfaceC16549B2.getValue();
            homeViewState = value;
            couponsStateMap = homeViewState.getCouponsStateMap();
            List<ProductState<ProductFullDetails>> list7 = productStates;
            linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(list7, 10)), 16));
            Iterator<T> it7 = list7.iterator();
            while (it7.hasNext()) {
                ProductState c17116b = (ProductState) it7.next();
                Pair pairA = TuplesKt.a(((ProductFullDetails) c17116b.g()).getCode(), CollectionsKt.u0(c17116b.d()));
                linkedHashMap.put(pairA.c(), pairA.d());
            }
        } while (!interfaceC16549B2.e(value, HomeViewState.copy$default(homeViewState, false, false, null, null, false, null, false, 0, null, false, MapsKt.u(couponsStateMap, linkedHashMap), null, null, null, null, 31743, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onStepperInteractionChange(String activeStepperId, boolean resetStepper, boolean inTransition) {
        HomeDecorator homeDecoratorCopy$default;
        HomeViewModel homeViewModel = this;
        String str = activeStepperId;
        boolean z10 = resetStepper;
        boolean z11 = inTransition;
        InterfaceC16549B<HomeViewState> interfaceC16549B = homeViewModel._homeViewState;
        while (true) {
            HomeViewState value = interfaceC16549B.getValue();
            InterfaceC16549B<HomeViewState> interfaceC16549B2 = interfaceC16549B;
            HomeViewState homeViewState = value;
            HomeDecorator homeDecorator = homeViewState.getHomeDecorator();
            if (homeDecorator != null) {
                List<List<ProductListDecorator>> personalizedProducts = homeViewState.getHomeDecorator().getPersonalizedProducts();
                ArrayList arrayList = new ArrayList(CollectionsKt.x(personalizedProducts, 10));
                Iterator<T> it = personalizedProducts.iterator();
                while (it.hasNext()) {
                    arrayList.add(homeViewModel.updateStepperState((List) it.next(), str, z10, z11));
                }
                List<List<ProductListDecorator>> curatedProducts = homeViewState.getHomeDecorator().getCuratedProducts();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.x(curatedProducts, 10));
                Iterator<T> it2 = curatedProducts.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(homeViewModel.updateStepperState((List) it2.next(), str, z10, z11));
                }
                homeDecoratorCopy$default = HomeDecorator.copy$default(homeDecorator, null, null, null, null, null, null, null, homeViewModel.updateStepperState(homeViewState.getHomeDecorator().getWhiteLabelProducts(), str, z10, z11), null, arrayList2, arrayList, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536869247, null);
            } else {
                homeDecoratorCopy$default = null;
            }
            if (interfaceC16549B2.e(value, HomeViewState.copy$default(homeViewState, false, false, homeDecoratorCopy$default, null, z10, str, z11, 0, null, false, null, null, null, null, null, 32651, null))) {
                return;
            }
            str = activeStepperId;
            z10 = resetStepper;
            z11 = inTransition;
            interfaceC16549B = interfaceC16549B2;
            homeViewModel = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processMperksState(long couponId, boolean isRedeemedSuccessfully) {
        HomeViewState value;
        HomeViewState homeViewState;
        HomeDecorator homeDecoratorCopy$default;
        InterfaceC16549B<HomeViewState> interfaceC16549B = this._homeViewState;
        do {
            value = interfaceC16549B.getValue();
            homeViewState = value;
            HomeDecorator homeDecorator = homeViewState.getHomeDecorator();
            homeDecoratorCopy$default = null;
            HomeMperks homeMperksB = null;
            if (homeDecorator != null) {
                HomeMperks homeMperksModel = homeViewState.getHomeDecorator().getHomeMperksModel();
                if (homeMperksModel != null) {
                    MperksData mperksData = homeViewState.getHomeDecorator().getHomeMperksModel().getMperksData();
                    List<AvailableReward> listC = homeViewState.getHomeDecorator().getHomeMperksModel().getMperksData().c();
                    ArrayList arrayList = new ArrayList(CollectionsKt.x(listC, 10));
                    for (AvailableReward availableRewardB : listC) {
                        if (availableRewardB.getCouponId() == couponId) {
                            availableRewardB = AvailableReward.b(availableRewardB, 0L, null, null, null, null, null, 0, null, isRedeemedSuccessfully, false, l3.f93323c, null);
                        }
                        arrayList.add(availableRewardB);
                    }
                    homeMperksB = HomeMperks.b(homeMperksModel, null, null, null, MperksData.b(mperksData, arrayList, null, 0, 6, null), 7, null);
                }
                homeDecoratorCopy$default = HomeDecorator.copy$default(homeDecorator, homeMperksB, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536870910, null);
            }
        } while (!interfaceC16549B.e(value, HomeViewState.copy$default(homeViewState, false, false, homeDecoratorCopy$default, null, false, null, false, 0, null, false, null, null, null, null, null, 32763, null)));
    }

    private final void pushUserAuthenticationState() {
        HomeViewState value;
        HomeViewState homeViewState;
        boolean zB;
        HomeDecorator homeDecorator;
        InterfaceC16549B<HomeViewState> interfaceC16549B = this._homeViewState;
        do {
            value = interfaceC16549B.getValue();
            homeViewState = value;
            zB = this.userManager.b();
            homeDecorator = homeViewState.getHomeDecorator();
        } while (!interfaceC16549B.e(value, HomeViewState.copy$default(homeViewState, zB, false, homeDecorator != null ? HomeDecorator.copy$default(homeDecorator, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, false, null, null, false, null, false, null, 0, this.userManager.b(), new Function2() { // from class: com.meijer.mobile.meijer.activity.home.N0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return HomeViewModel.pushUserAuthenticationState$lambda$35$lambda$34(this.f110575a, (Pk.c) obj, (EnumC15218a) obj2);
            }
        }, null, null, null, false, 511705087, null) : null, null, false, null, false, 0, null, false, null, null, null, null, null, 32762, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pushUserAuthenticationState$lambda$35$lambda$34(HomeViewModel homeViewModel, Pk.c couponIdentity, EnumC15218a type) {
        Intrinsics.j(couponIdentity, "couponIdentity");
        Intrinsics.j(type, "type");
        homeViewModel.onProductCouponButtonClicked(couponIdentity, type);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ba, code lost:
    
        if (r15.emit(r4, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object removeCartEntry(ur.AbstractC17454a r12, uk.c<fj.EntryChange> r13, java.lang.String r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.meijer.mobile.meijer.activity.home.HomeViewModel.g0
            if (r0 == 0) goto L13
            r0 = r15
            com.meijer.mobile.meijer.activity.home.HomeViewModel$g0 r0 = (com.meijer.mobile.meijer.activity.home.HomeViewModel.g0) r0
            int r1 = r0.f110290f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f110290f = r1
            goto L18
        L13:
            com.meijer.mobile.meijer.activity.home.HomeViewModel$g0 r0 = new com.meijer.mobile.meijer.activity.home.HomeViewModel$g0
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f110288d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f110290f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L53
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r12 = r0.f110287c
            r14 = r12
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r12 = r0.f110286b
            uk.c r12 = (uk.c) r12
            java.lang.Object r12 = r0.f110285a
            ur.a r12 = (ur.AbstractC17454a) r12
            kotlin.ResultKt.b(r15)
            r2 = r11
            goto Lbd
        L3b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L43:
            java.lang.Object r12 = r0.f110287c
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r0.f110286b
            uk.c r12 = (uk.c) r12
            java.lang.Object r12 = r0.f110285a
            ur.a r12 = (ur.AbstractC17454a) r12
            kotlin.ResultKt.b(r15)
            goto L9a
        L53:
            kotlin.ResultKt.b(r15)
            boolean r15 = r13 instanceof uk.c.Success
            if (r15 == 0) goto La4
            r15 = r13
            uk.c$d r15 = (uk.c.Success) r15
            java.lang.Object r2 = r15.a()
            fj.j r2 = (fj.EntryChange) r2
            if (r2 == 0) goto L6a
            fj.j$c r2 = r2.getStatusCode()
            goto L6b
        L6a:
            r2 = 0
        L6b:
            fj.j$c r5 = fj.EntryChange.c.f131924f
            if (r2 != r5) goto La4
            java.lang.Object r15 = r15.a()
            fj.j r15 = (fj.EntryChange) r15
            double r2 = r11.getProductUnitPrice(r12)
            r11.trackCartRemovalAction(r15, r2)
            pv.A<com.meijer.mobile.meijer.activity.home.HomeViewModel$HomeEvent> r15 = r11._events
            com.meijer.mobile.meijer.activity.home.HomeViewModel$HomeEvent$UpdateCartSuccessEvent r5 = new com.meijer.mobile.meijer.activity.home.HomeViewModel$HomeEvent$UpdateCartSuccessEvent
            int r6 = tr.C17284b.f163336n0
            int r7 = tr.C17284b.f163301T0
            r9 = 4
            r10 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r0.f110285a = r12
            r0.f110286b = r13
            r0.f110287c = r14
            r0.f110290f = r4
            java.lang.Object r12 = r15.emit(r5, r0)
            if (r12 != r1) goto L9a
            r2 = r11
            goto Lbc
        L9a:
            r6 = 7
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r2 = r11
            P(r2, r3, r4, r5, r6, r7)
            goto Lc0
        La4:
            r2 = r11
            pv.A<com.meijer.mobile.meijer.activity.home.HomeViewModel$HomeEvent> r15 = r2._events
            com.meijer.mobile.meijer.activity.home.HomeViewModel$HomeEvent$UpdateCartFailedEvent r4 = new com.meijer.mobile.meijer.activity.home.HomeViewModel$HomeEvent$UpdateCartFailedEvent
            int r5 = tr.C17284b.f163293P0
            r4.<init>(r5)
            r0.f110285a = r12
            r0.f110286b = r13
            r0.f110287c = r14
            r0.f110290f = r3
            java.lang.Object r12 = r15.emit(r4, r0)
            if (r12 != r1) goto Lbd
        Lbc:
            return r1
        Lbd:
            r11.resetQuantitySteppers(r14)
        Lc0:
            kotlin.Unit r12 = kotlin.Unit.f143329a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.home.HomeViewModel.removeCartEntry(ur.a, uk.c, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void resetQuantitySteppers(String productCode) {
        if (productCode != null) {
            if (productCode.length() <= 0) {
                productCode = null;
            }
            if (productCode != null) {
                onStepperInteractionChange(productCode, true, false);
            }
        }
    }

    private final void trackCartAdditionAction(boolean requireCartOpenExtra, EntryChange entryChange, String productCode, double entryUnitPrice) {
        Entry entry;
        ProductFullDetails productFullDetailsM;
        Entry entry2;
        ProductFullDetails productFullDetailsM2;
        Entry entry3;
        Boolean boolValueOf = null;
        String carouselType = getCarouselType((entryChange == null || (entry3 = entryChange.getEntry()) == null) ? null : entry3.m());
        boolean zC = this.productMetadataStore.c((entryChange == null || (entry2 = entryChange.getEntry()) == null || (productFullDetailsM2 = entry2.m()) == null) ? null : productFullDetailsM2.getCode());
        boolean zIsSponsoredCriteo = this._homeViewState.getValue().isSponsoredCriteo();
        int clickedProductPosition = this._homeViewState.getValue().getClickedProductPosition();
        EnumC15218a clickedCarouselType = this._homeViewState.getValue().getClickedCarouselType();
        InterfaceC14523a interfaceC14523a = this.analyticsEngine;
        C2898u c2898u = C2898u.f1904a;
        String str = this.cartId;
        Map<String, CouponState> couponsStateMap = this.homeViewState.getValue().getCouponsStateMap();
        if (entryChange != null && (entry = entryChange.getEntry()) != null && (productFullDetailsM = entry.m()) != null) {
            boolValueOf = Boolean.valueOf(productFullDetailsM.getHasMPerksOffers());
        }
        interfaceC14523a.k(c2898u.R(requireCartOpenExtra, clickedCarouselType, entryChange, str, zIsSponsoredCriteo, carouselType, couponsStateMap, zC, false, entryUnitPrice, boolValueOf, productCode, false, Integer.valueOf(clickedProductPosition)));
    }

    private final void trackCartRemovalAction(EntryChange entryChange, double entryUnitPrice) {
        Entry entry;
        ProductFullDetails productFullDetailsM;
        Entry entry2;
        Entry entry3;
        ProductFullDetails productFullDetailsM2;
        this.analyticsEngine.k(C2898u.f1904a.T(this.cartId, this._homeViewState.getValue().isSponsoredCriteo(), this._homeViewState.getValue().getClickedCarouselType(), this.productMetadataStore.c((entryChange == null || (entry3 = entryChange.getEntry()) == null || (productFullDetailsM2 = entry3.m()) == null) ? null : productFullDetailsM2.getCode()), entryChange, getCarouselType((entryChange == null || (entry2 = entryChange.getEntry()) == null) ? null : entry2.m()), N(this, (entryChange == null || (entry = entryChange.getEntry()) == null || (productFullDetailsM = entry.m()) == null) ? null : productFullDetailsM.getCode(), false, 2, null), entryUnitPrice, false, true, getCouponList(entryChange)));
    }

    private final void trackGoogleAdAnalytics(final GoogleAdAnalytics googleAdAnalytics) {
        this.analyticsEngine.b(C14756c.a("RMN Ad clicked"), new Function1() { // from class: com.meijer.mobile.meijer.activity.home.C0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeViewModel.trackGoogleAdAnalytics$lambda$60(googleAdAnalytics, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit trackGoogleAdAnalytics$lambda$60(GoogleAdAnalytics c14373a, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("home");
        track.o(c14373a.getPageType());
        track.h("RMNAdType", c14373a.getAdType());
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateCartEntry(ur.AbstractC17454a r13, uk.c<fj.EntryChange> r14, java.lang.String r15, kotlin.coroutines.Continuation<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.home.HomeViewModel.updateCartEntry(ur.a, uk.c, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r9v6 */
    public final void updateDepartmentCarousels(String loadingKey, e.c departmentCarousel, DepartmentCard departmentCard) {
        HomeViewState value;
        HomeViewState homeViewStateCopy$default;
        Object next;
        Object next2;
        InterfaceC16549B<HomeViewState> interfaceC16549B = this._homeViewState;
        do {
            value = interfaceC16549B.getValue();
            HomeViewState homeViewState = value;
            this.loadingStatesManager.b(new a.NotLoading(loadingKey));
            int i10 = 1;
            HomeDecorator homeDecoratorCopy$default = 0;
            HomeDecorator homeDecoratorCopy$default2 = null;
            if (departmentCarousel instanceof e.c.b) {
                HomeDecorator homeDecorator = homeViewState.getHomeDecorator();
                if (homeDecorator != null) {
                    Iterator<T> it = homeViewState.getHomeDecorator().getLoadingStates().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        } else {
                            next2 = it.next();
                            if (Intrinsics.e(((Pj.a) next2).getKey(), loadingKey)) {
                                break;
                            }
                        }
                    }
                    Pj.a cVar = (Pj.a) next2;
                    if (cVar == null) {
                        cVar = new a.NotLoading(homeDecoratorCopy$default, i10, homeDecoratorCopy$default);
                    }
                    homeDecoratorCopy$default2 = HomeDecorator.copy$default(homeDecorator, null, null, null, null, C13719a.a(departmentCard, cVar), null, null, null, null, null, null, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536870895, null);
                }
                homeViewStateCopy$default = HomeViewState.copy$default(homeViewState, false, false, homeDecoratorCopy$default2, null, false, null, false, 0, null, false, null, null, null, null, null, 32763, null);
            } else {
                if (!(departmentCarousel instanceof e.c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                HomeDecorator homeDecorator2 = homeViewState.getHomeDecorator();
                if (homeDecorator2 != null) {
                    Iterator<T> it2 = homeViewState.getHomeDecorator().getLoadingStates().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it2.next();
                            if (Intrinsics.e(((Pj.a) next).getKey(), loadingKey)) {
                                break;
                            }
                        }
                    }
                    Pj.a cVar2 = (Pj.a) next;
                    if (cVar2 == null) {
                        cVar2 = new a.NotLoading(homeDecoratorCopy$default, i10, homeDecoratorCopy$default);
                    }
                    homeDecoratorCopy$default = HomeDecorator.copy$default(homeDecorator2, null, null, null, null, null, C13719a.a(departmentCard, cVar2), null, null, null, null, null, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536870879, null);
                }
                homeViewStateCopy$default = HomeViewState.copy$default(homeViewState, false, false, homeDecoratorCopy$default, null, false, null, false, 0, null, false, null, null, null, null, null, 32763, null);
            }
        } while (!interfaceC16549B.e(value, homeViewStateCopy$default));
    }

    private final void updateLoadingStateOfCoupon(long couponId) {
        HomeViewState value;
        HomeViewState homeViewState;
        HomeDecorator homeDecoratorCopy$default;
        InterfaceC16549B<HomeViewState> interfaceC16549B = this._homeViewState;
        do {
            value = interfaceC16549B.getValue();
            homeViewState = value;
            HomeDecorator homeDecorator = homeViewState.getHomeDecorator();
            homeDecoratorCopy$default = null;
            HomeMperks homeMperksB = null;
            if (homeDecorator != null) {
                HomeMperks homeMperksModel = homeViewState.getHomeDecorator().getHomeMperksModel();
                if (homeMperksModel != null) {
                    MperksData mperksData = homeViewState.getHomeDecorator().getHomeMperksModel().getMperksData();
                    List<AvailableReward> listC = homeViewState.getHomeDecorator().getHomeMperksModel().getMperksData().c();
                    ArrayList arrayList = new ArrayList(CollectionsKt.x(listC, 10));
                    for (AvailableReward availableRewardB : listC) {
                        if (availableRewardB.getCouponId() == couponId) {
                            availableRewardB = AvailableReward.b(availableRewardB, 0L, null, null, null, null, null, 0, null, false, true, 511, null);
                        }
                        arrayList.add(availableRewardB);
                    }
                    homeMperksB = HomeMperks.b(homeMperksModel, null, null, null, MperksData.b(mperksData, arrayList, null, 0, 6, null), 7, null);
                }
                homeDecoratorCopy$default = HomeDecorator.copy$default(homeDecorator, homeMperksB, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536870910, null);
            }
        } while (!interfaceC16549B.e(value, HomeViewState.copy$default(homeViewState, false, false, homeDecoratorCopy$default, null, false, null, false, 0, null, false, null, null, null, null, null, 32763, null)));
    }

    private final void updateRateAndTipNotification(String orderId, String externalShopperId, boolean navigateToTipActivity) {
        if (orderId == null || orderId.length() == 0) {
            return;
        }
        C15809k.d(androidx.view.d0.a(this), null, null, new m0(orderId, externalShopperId, navigateToTipActivity, null), 3, null);
    }

    private final List<ProductListDecorator> updateStepperState(List<ProductListDecorator> productListDecorators, String activeStepperId, boolean resetStepper, boolean inTransition) {
        List<ProductListDecorator> list = productListDecorators;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        for (ProductListDecorator productListDecorator : list) {
            arrayList.add(productListDecorator.u(((-201326593) & 1) != 0 ? productListDecorator.id : null, ((-201326593) & 2) != 0 ? productListDecorator.isSelected : false, ((-201326593) & 4) != 0 ? productListDecorator.upc : null, ((-201326593) & 8) != 0 ? productListDecorator.title : null, ((-201326593) & 16) != 0 ? productListDecorator.hasUnsavedShoppingListItem : false, ((-201326593) & 32) != 0 ? productListDecorator.listItemId : null, ((-201326593) & 64) != 0 ? productListDecorator.thumbnail : null, ((-201326593) & 128) != 0 ? productListDecorator.thumbnailUrl : null, ((-201326593) & 256) != 0 ? productListDecorator.thumbnailDescription : null, ((-201326593) & 512) != 0 ? productListDecorator.department : null, ((-201326593) & 1024) != 0 ? productListDecorator.isOnSale : false, ((-201326593) & RecyclerView.m.FLAG_MOVED) != 0 ? productListDecorator.showWeightInfo : false, ((-201326593) & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? productListDecorator.hasMPerksOffers : false, ((-201326593) & 8192) != 0 ? productListDecorator.currentPrice : null, ((-201326593) & 16384) != 0 ? productListDecorator.regularPrice : null, ((-201326593) & 32768) != 0 ? productListDecorator.weightUnitSizeAndPrice : null, ((-201326593) & 65536) != 0 ? productListDecorator.amountSaved : null, ((-201326593) & 131072) != 0 ? productListDecorator.quantityText : null, ((-201326593) & 262144) != 0 ? productListDecorator.priceGoodThroughDate : null, ((-201326593) & 524288) != 0 ? productListDecorator.isAddedToShoppingList : false, ((-201326593) & 1048576) != 0 ? productListDecorator.errorImageResource : 0, ((-201326593) & 2097152) != 0 ? productListDecorator.shoppingListItem : null, ((-201326593) & 4194304) != 0 ? productListDecorator.product : null, ((-201326593) & 8388608) != 0 ? productListDecorator.cartEntry : null, ((-201326593) & 16777216) != 0 ? productListDecorator.storeAvailability : null, ((-201326593) & 33554432) != 0 ? productListDecorator.cartEligibility : null, ((-201326593) & 67108864) != 0 ? productListDecorator.inQtyStepperInteraction : Intrinsics.e(productListDecorator.getUpc(), activeStepperId) && inTransition, ((-201326593) & 134217728) != 0 ? productListDecorator.resetStepperState : Intrinsics.e(productListDecorator.getUpc(), activeStepperId) && resetStepper, ((-201326593) & 268435456) != 0 ? productListDecorator.productQuery : null, ((-201326593) & 536870912) != 0 ? productListDecorator.couponCountDownStateDecorator : null, ((-201326593) & 1073741824) != 0 ? productListDecorator.coupon : null, ((-201326593) & Integer.MIN_VALUE) != 0 ? productListDecorator.complexPromo : null, (511 & 1) != 0 ? productListDecorator.isBuyAgain : false, (511 & 2) != 0 ? productListDecorator.isBopas : false, (511 & 4) != 0 ? productListDecorator.sponsorship : null, (511 & 8) != 0 ? productListDecorator.productRatings : null, (511 & 16) != 0 ? productListDecorator.showQuantityRequested : false, (511 & 32) != 0 ? productListDecorator.quantityRequested : 0, (511 & 64) != 0 ? productListDecorator.currentPriceDescription : null, (511 & 128) != 0 ? productListDecorator.productContainsTag : false, (511 & 256) != 0 ? productListDecorator.regularPriceDescription : null));
        }
        return arrayList;
    }

    @Override // wr.InterfaceC17909a
    /* renamed from: getDisposable, reason: from getter */
    public Ju.a getDisposables() {
        return this.disposables;
    }

    public final InterfaceC16553F<HomeEvent> getEvents() {
        return C16563h.b(this._events);
    }

    public final pv.P<HomeViewState> getHomeViewState() {
        return this.homeViewState;
    }

    public final InterfaceC16553F<ToastMessageData> getToastMessageData() {
        return C16563h.b(this._toastMessageData);
    }

    public final void loadGoogleAd() {
        HomeViewState value;
        HomeViewState homeViewState;
        HomeDecorator homeDecoratorCopy$default;
        InterfaceC16549B<HomeViewState> interfaceC16549B = this._homeViewState;
        do {
            value = interfaceC16549B.getValue();
            homeViewState = value;
            HomeDecorator homeDecorator = homeViewState.getHomeDecorator();
            if (homeDecorator != null) {
                C14377e c14377e = C14377e.f134254a;
                EnumC14378f enumC14378f = EnumC14378f.f134255d;
                homeDecoratorCopy$default = HomeDecorator.copy$default(homeDecorator, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, C14377e.b(c14377e, enumC14378f, "homepage", true, null, this.userManager.y(), 1, 8, null), C14377e.b(c14377e, enumC14378f, "homepage", true, null, this.userManager.y(), 2, 8, null), null, false, 436207615, null);
            } else {
                homeDecoratorCopy$default = null;
            }
        } while (!interfaceC16549B.e(value, HomeViewState.copy$default(homeViewState, false, false, homeDecoratorCopy$default, null, false, null, false, 0, null, false, null, null, null, null, null, 32763, null)));
    }

    @Override // wr.InterfaceC17909a
    public void observeCart(uk.c<ShoppingCart> cartResource) {
        List<Entry> listM;
        if (cartResource instanceof c.Success) {
            c.Success success = (c.Success) cartResource;
            ShoppingCart shoppingCart = (ShoppingCart) success.a();
            String code = shoppingCart != null ? shoppingCart.getCode() : null;
            if (code == null) {
                code = "";
            }
            this.cartId = code;
            ShoppingCart shoppingCart2 = (ShoppingCart) success.a();
            if (shoppingCart2 == null || (listM = shoppingCart2.p()) == null) {
                listM = CollectionsKt.m();
            }
            this.cartEntries = listM;
            return;
        }
        if (!(cartResource instanceof c.Failure)) {
            if (!(cartResource instanceof c.Loading) && cartResource != null) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        c.Failure failure = (c.Failure) cartResource;
        qw.a.INSTANCE.f(failure.getError(), "Resource.Failure<ShoppingCart>", new Object[0]);
        Throwable error = failure.getError();
        HttpException httpException = error instanceof HttpException ? (HttpException) error : null;
        if (httpException == null || httpException.code() != 503) {
            return;
        }
        C15809k.d(androidx.view.d0.a(this), null, null, new D(null), 3, null);
    }

    public final Object observeStoreChanges$Meijer_playstoreRelease(Continuation<? super Unit> continuation) {
        Object objK = C16563h.k(this.storeProvider.c(), new E(null), continuation);
        return objK == IntrinsicsKt.f() ? objK : Unit.f143329a;
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        HomeViewState value;
        HomeViewState homeViewState;
        HomeDecorator homeDecorator;
        this.multiChannelProductsStateRepository.b(null);
        InterfaceC16549B<HomeViewState> interfaceC16549B = this._homeViewState;
        do {
            value = interfaceC16549B.getValue();
            homeViewState = value;
            homeDecorator = homeViewState.getHomeDecorator();
        } while (!interfaceC16549B.e(value, HomeViewState.copy$default(homeViewState, false, false, homeDecorator != null ? HomeDecorator.copy$default(homeDecorator, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536739839, null) : null, null, false, null, false, 0, null, false, null, null, null, null, null, 32763, null)));
        this.disposables.d();
        super.onCleared();
    }

    @Override // androidx.view.InterfaceC6157f
    public void onCreate(InterfaceC6172s owner) {
        Intrinsics.j(owner, "owner");
        pushUserAuthenticationState();
        loadHomeContent();
    }

    @Override // androidx.view.InterfaceC6157f
    public void onPause(InterfaceC6172s owner) {
        Intrinsics.j(owner, "owner");
        super.onPause(owner);
        Ju.b bVar = this.authenticateUserDisposable;
        if (bVar != null) {
            if (bVar.isDisposed()) {
                bVar = null;
            }
            if (bVar != null) {
                bVar.dispose();
            }
        }
    }

    @Override // androidx.view.InterfaceC6157f
    public void onResume(InterfaceC6172s owner) {
        HomeViewState homeViewState;
        HomeViewModel homeViewModel;
        InterfaceC16549B<HomeViewState> interfaceC16549B;
        HomeDecorator homeDecoratorCopy$default;
        HomeViewModel homeViewModel2 = this;
        Intrinsics.j(owner, "owner");
        super.onResume(owner);
        InterfaceC16549B<HomeViewState> interfaceC16549B2 = homeViewModel2._homeViewState;
        while (true) {
            HomeViewState value = interfaceC16549B2.getValue();
            HomeViewState homeViewState2 = value;
            InterfaceC16549B<HomeViewState> interfaceC16549B3 = interfaceC16549B2;
            HomeDecorator homeDecorator = homeViewState2.getHomeDecorator();
            if (homeDecorator != null) {
                HomeViewModel homeViewModel3 = homeViewModel2;
                interfaceC16549B = interfaceC16549B3;
                homeViewState = value;
                homeDecoratorCopy$default = HomeDecorator.copy$default(homeDecorator, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, false, null, homeViewModel3, false, null, false, null, 0, false, null, null, null, null, false, 536739839, null);
                homeViewModel = homeViewModel3;
            } else {
                homeViewState = value;
                homeViewModel = homeViewModel2;
                interfaceC16549B = interfaceC16549B3;
                homeDecoratorCopy$default = null;
            }
            if (interfaceC16549B.e(homeViewState, HomeViewState.copy$default(homeViewState2, false, false, homeDecoratorCopy$default, null, false, null, false, 0, null, false, null, null, null, null, null, 32763, null))) {
                homeViewModel.cartInteractor.I(homeViewModel);
                homeViewModel.fetchMperks(false);
                homeViewModel.syncWhiteLabelFeatureFlagState();
                return;
            }
            interfaceC16549B2 = interfaceC16549B;
            homeViewModel2 = homeViewModel;
        }
    }

    @Override // com.meijer.mobile.meijer.activity.home.HomeDecoratorListener
    public void performAction(Object action) {
        Intrinsics.j(action, "action");
        Action action2 = action instanceof Action ? (Action) action : null;
        if (action2 != null) {
            onAction(action2);
        }
    }

    @Override // wr.InterfaceC17909a
    public void processedRequest(AbstractC17454a processedRequest, uk.c<EntryChange> entryChange) {
        Intrinsics.j(processedRequest, "processedRequest");
        Intrinsics.j(entryChange, "entryChange");
        if (processedRequest instanceof AbstractC17454a.Add) {
            C15809k.d(androidx.view.d0.a(this), null, null, new b0(processedRequest, entryChange, null), 3, null);
            return;
        }
        if (processedRequest instanceof AbstractC17454a.Update) {
            C15809k.d(androidx.view.d0.a(this), null, null, new c0(processedRequest, entryChange, null), 3, null);
            return;
        }
        if (processedRequest instanceof AbstractC17454a.Remove) {
            C15809k.d(androidx.view.d0.a(this), null, null, new d0(processedRequest, entryChange, null), 3, null);
        } else {
            if (!(processedRequest instanceof AbstractC17454a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            resetQuantitySteppers(processedRequest.getProductCode());
            Unit unit = Unit.f143329a;
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
        C15809k.d(androidx.view.d0.a(this), null, null, new k0((AbstractC17720a.ChokingHazardChallenge) abstractC17720aF, null), 3, null);
    }

    public final void updateHomeViewState(int position, EnumC15218a carouselType, boolean isSponsoredCriteo) {
        EnumC15218a carouselType2 = carouselType;
        Intrinsics.j(carouselType2, "carouselType");
        InterfaceC16549B<HomeViewState> interfaceC16549B = this._homeViewState;
        while (true) {
            HomeViewState value = interfaceC16549B.getValue();
            InterfaceC16549B<HomeViewState> interfaceC16549B2 = interfaceC16549B;
            if (interfaceC16549B2.e(value, HomeViewState.copy$default(value, false, false, null, null, false, null, false, position, carouselType2, isSponsoredCriteo, null, null, null, null, null, 31871, null))) {
                return;
            }
            carouselType2 = carouselType;
            interfaceC16549B = interfaceC16549B2;
        }
    }

    public final void updateRatedAndTippedOrder(Builder builder, EnumC17276a flowType) {
        boolean z10;
        InterfaceC16549B<HomeViewState> interfaceC16549B;
        HomeViewState homeViewState;
        ArrayList arrayList;
        boolean z11;
        InterfaceC16549B<HomeViewState> interfaceC16549B2;
        HomeViewState homeViewState2;
        ArrayList arrayList2;
        Builder builder2 = builder;
        Intrinsics.j(builder2, "builder");
        Intrinsics.j(flowType, "flowType");
        boolean z12 = C18328d.a(builder2.getTipAmount(), new Function0() { // from class: com.meijer.mobile.meijer.activity.home.x0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Double.valueOf(HomeViewModel.updateRatedAndTippedOrder$lambda$91());
            }
        }) > 0.0d;
        boolean z13 = C18328d.b(builder2.getRating(), new Function0() { // from class: com.meijer.mobile.meijer.activity.home.I0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(HomeViewModel.updateRatedAndTippedOrder$lambda$92());
            }
        }) > 0;
        InterfaceC16549B<HomeViewState> interfaceC16549B3 = this._homeViewState;
        while (true) {
            HomeViewState value = interfaceC16549B3.getValue();
            HomeViewState homeViewState3 = value;
            HomeDecorator homeDecorator = homeViewState3.getHomeDecorator();
            HomeDecorator homeDecoratorCopy$default = null;
            if (homeDecorator != null) {
                List<OrderStatusCardDecorator> orderStatusCards = homeViewState3.getHomeDecorator().getOrderStatusCards();
                if (orderStatusCards != null) {
                    List<OrderStatusCardDecorator> list = orderStatusCards;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.x(list, 10));
                    for (OrderStatusCardDecorator orderStatusCardDecoratorD : list) {
                        if (Intrinsics.e(orderStatusCardDecoratorD.getOrderNumber(), builder2.getOrderId())) {
                            boolean z14 = (z13 && z12) ? false : true;
                            z11 = z12;
                            arrayList2 = arrayList3;
                            interfaceC16549B2 = interfaceC16549B3;
                            homeViewState2 = value;
                            orderStatusCardDecoratorD = OrderStatusCardDecorator.d(orderStatusCardDecoratorD, null, null, 0, null, null, null, null, 0, false, false, false, false, z14, null, false, null, null, null, null, null, flowType, 1044479, null);
                        } else {
                            z11 = z12;
                            interfaceC16549B2 = interfaceC16549B3;
                            homeViewState2 = value;
                            arrayList2 = arrayList3;
                        }
                        arrayList2.add(orderStatusCardDecoratorD);
                        arrayList3 = arrayList2;
                        value = homeViewState2;
                        z12 = z11;
                        interfaceC16549B3 = interfaceC16549B2;
                        builder2 = builder;
                    }
                    z10 = z12;
                    arrayList = arrayList3;
                } else {
                    z10 = z12;
                    arrayList = null;
                }
                interfaceC16549B = interfaceC16549B3;
                homeViewState = value;
                homeDecoratorCopy$default = HomeDecorator.copy$default(homeDecorator, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, false, null, null, false, null, false, arrayList, 0, false, null, null, null, null, false, 534773759, null);
            } else {
                z10 = z12;
                interfaceC16549B = interfaceC16549B3;
                homeViewState = value;
            }
            InterfaceC16549B<HomeViewState> interfaceC16549B4 = interfaceC16549B;
            if (interfaceC16549B4.e(homeViewState, HomeViewState.copy$default(homeViewState3, false, false, homeDecoratorCopy$default, null, false, null, false, 0, null, false, null, null, null, null, null, 32763, null))) {
                return;
            }
            builder2 = builder;
            interfaceC16549B3 = interfaceC16549B4;
            z12 = z10;
        }
    }

    public static void E(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static void J(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object _init_$onLoadingStates(HomeViewModel homeViewModel, List list, Continuation continuation) {
        homeViewModel.onLoadingStates(list);
        return Unit.f143329a;
    }

    private final void claimMperks(long couponId) {
        updateLoadingStateOfCoupon(couponId);
        C15809k.d(androidx.view.d0.a(this), null, null, new C12447i(couponId, null), 3, null);
    }

    private final void fetchActiveOrders() {
        C15809k.d(androidx.view.d0.a(this), null, null, new C12450l(null), 3, null);
    }

    private final void fetchBanners() {
        C15809k.d(androidx.view.d0.a(this), null, null, new C12452n(null), 3, null);
    }

    private final void fetchCuratedCard(e.f homeComponent) {
        C15809k.d(androidx.view.d0.a(this), null, null, new C12454p(homeComponent, null), 3, null);
    }

    private final void fetchEmailVerificationBannerSettings() {
        C15809k.d(androidx.view.d0.a(this), null, null, new C12456r(null), 3, null);
    }

    private final void fetchEnrollmentOfferResendEmailResponse() {
        C15809k.d(androidx.view.d0.a(this), null, null, new C12457s(null), 3, null);
    }

    private final void fetchHomeCards() {
        C15809k.d(androidx.view.d0.a(this), null, null, new C12458t(null), 3, null);
    }

    private final void fetchMperksExpiringPoints() {
        C15809k.d(androidx.view.d0.a(this), null, null, new C12460v(null), 3, null);
    }

    private final void fetchPersonalizedCards() {
        fetchBanners();
        fetchEmailVerificationBannerSettings();
        fetchTipAndNotification();
    }

    private final void fetchTipAndNotification() {
        C15809k.d(androidx.view.d0.a(this), null, null, new C12464z(null), 3, null);
    }

    private final boolean isCouponEarned(CouponState couponState, EntryChange entryChange, double entryUnitPrice) {
        Coupon couponC = couponState.getCoupon();
        Coupon.c earnCondition = couponC.getEarnCondition();
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
                if (dDoubleValue + quantity < couponC.getEarnCondition().getGoal()) {
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
                if (dDoubleValue2 + quantity < couponC.getEarnCondition().getGoal()) {
                    return false;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (couponC.x()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onGetClipCouponResponse(ClipUnclipCouponResponse clipUnclipCouponResponse, Coupon coupon, TrackingData c14759f, Continuation<? super Unit> continuation) {
        if (StringsKt.I(clipUnclipCouponResponse.getResult(), "Success", false, 2, null)) {
            this.analyticsEngine.k(c14759f);
            return Unit.f143329a;
        }
        Object objEmit = this._events.emit(new HomeEvent.ClipCouponFailedEvent(Nr.g.f22702n, Nr.g.f22700m, com.meijer.mobile.meijer.Y.f100486Ih, Nr.g.f22664O, coupon, c14759f), continuation);
        if (objEmit == IntrinsicsKt.f()) {
            return objEmit;
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onProductCouponButtonClicked$lambda$36(HomeViewModel homeViewModel, Pk.c cVar, EnumC15218a enumC15218a, Coupon coupon) {
        if (coupon.x()) {
            homeViewModel.onAction(new a.ViewCouponDetails(cVar, null));
        } else {
            Intrinsics.g(coupon);
            homeViewModel.onAction(new a.Clip(cVar, homeViewModel.getClipCouponTrackingData(coupon, enumC15218a)));
        }
        return Unit.f143329a;
    }

    private final void refreshHomeContent() {
        loadHomeContent();
        C15809k.d(androidx.view.d0.a(this), null, null, new e0(null), 3, null);
        if (this.userManager.b()) {
            C15809k.d(androidx.view.d0.a(this), null, null, new f0(null), 3, null);
            fetchActiveOrders();
        }
    }

    private final void sendBeaconToastMessage(Ul.a type, boolean isFormatLevel, nk.c product) {
        C15809k.d(androidx.view.d0.a(this), null, null, new h0(isFormatLevel, this, type, product, null), 3, null);
    }

    private final void sendCriteoBeacon(List<String> beacon, Ul.a type, boolean isFormatLevel, EnumC15218a carouselType) {
        C15809k.d(androidx.view.d0.a(this), this.ioDispatcher, null, new i0(beacon, isFormatLevel, type, carouselType, this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setLoadingStateError(String loadingKey, Throwable error) {
        if (error.getCause() instanceof HttpException) {
            Throwable cause = error.getCause();
            Intrinsics.h(cause, "null cannot be cast to non-null type retrofit2.HttpException");
            if (((HttpException) cause).code() == 503) {
                this.loadingStatesManager.b(new a.Failed(loadingKey, AbstractC6392a.INSTANCE.d(yr.Q.f171737E, new Object[0])));
                return;
            }
        }
        if ((!(error instanceof RetrofitException) || ((RetrofitException) error).getExceptionKind() != RetrofitException.b.f97000b) && !(error instanceof ConnectException) && !(error instanceof NoAvailableNetworksException)) {
            this.loadingStatesManager.b(new a.Failed(loadingKey, null, 2, 0 == true ? 1 : 0));
        } else {
            this.loadingStatesManager.b(new a.Failed(loadingKey, AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f101115p5, new Object[0])));
        }
    }

    private final void syncWhiteLabelFeatureFlagState() {
        C15809k.d(androidx.view.d0.a(this), null, null, new j0(null), 3, null);
    }

    private final ProductListDecorator toProductListDecorator(ProductState<ProductFullDetails> c17116b) {
        boolean z10;
        boolean z11;
        CouponCountDownStateDecorator eVarD;
        CouponState cVar = (CouponState) CollectionsKt.u0(c17116b.d());
        HomeViewState value = this._homeViewState.getValue();
        ProductListDecorator.Companion companion = ProductListDecorator.INSTANCE;
        ProductFullDetails productFullDetails = (ProductFullDetails) c17116b.g();
        CartEntry c17900aA = c17116b.getCartEntry();
        boolean z12 = true;
        if (Intrinsics.e(c17116b.getCode(), value.getStepperIdInInteraction()) && value.isStepperInTransition()) {
            z10 = true;
        } else {
            z10 = true;
            z12 = false;
        }
        ProductEligibility.a aVarI = c17116b.getEligibility().i();
        ProductEligibility.a aVarK = c17116b.getEligibility().k();
        if (Intrinsics.e(c17116b.getCode(), value.getStepperIdInInteraction()) && value.getResetStepper()) {
            z11 = z10;
        } else {
            z11 = false;
        }
        Coupon couponC = null;
        if (cVar != null) {
            eVarD = Qr.a.d(cVar);
        } else {
            eVarD = null;
        }
        if (cVar != null) {
            couponC = cVar.getCoupon();
        }
        return ProductListDecorator.Companion.b(companion, productFullDetails, null, null, c17900aA, z12, aVarI, aVarK, z11, null, eVarD, couponC, false, null, null, false, 0, 63750, null);
    }

    public static Unit v(HomeViewModel homeViewModel, Object obj, List list) {
        Intrinsics.g(list);
        homeViewModel.onProductsState(obj, list);
        return Unit.f143329a;
    }

    public final void fetchAllBuyAgainUpcs() {
        C15809k.d(androidx.view.d0.a(this), this.ioDispatcher, null, new C12451m(null), 2, null);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
    public void onRefresh() {
        refreshHomeContent();
    }

    public final void onAction(AbstractC14072a action) {
        HomeViewState value;
        HomeViewState homeViewState;
        HomeViewState value2;
        HomeViewState homeViewState2;
        HomeViewState value3;
        HomeViewState homeViewState3;
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC14072a.OnLoadBeacon) {
            AbstractC14072a.OnLoadBeacon cVar = (AbstractC14072a.OnLoadBeacon) action;
            if (cVar.getBeaconUrl().length() <= 0 || this._homeViewState.getValue().getBeaconsTracker().f().contains(cVar.getBeaconUrl())) {
                return;
            }
            List<String> listE = CollectionsKt.e(cVar.getBeaconUrl());
            Ul.a aVar = Ul.a.f37566b;
            sendCriteoBeacon(listE, aVar, cVar.getIsFormatLevel(), cVar.getCarouselType());
            sendBeaconToastMessage(aVar, cVar.getIsFormatLevel(), cVar.getProduct());
            InterfaceC16549B<HomeViewState> interfaceC16549B = this._homeViewState;
            do {
                value3 = interfaceC16549B.getValue();
                homeViewState3 = value3;
            } while (!interfaceC16549B.e(value3, HomeViewState.copy$default(homeViewState3, false, false, null, null, false, null, false, 0, null, false, null, null, null, null, BeaconsTracker.b(homeViewState3.getBeaconsTracker(), null, null, null, CollectionsKt.P0(homeViewState3.getBeaconsTracker().f(), CollectionsKt.e(cVar.getBeaconUrl())), null, null, null, null, 247, null), 16383, null)));
            return;
        }
        if (action instanceof AbstractC14072a.OnViewBeacon) {
            AbstractC14072a.OnViewBeacon dVar = (AbstractC14072a.OnViewBeacon) action;
            EnumC15218a enumC15218aB = dVar.getCarouselType();
            if (enumC15218aB == null) {
                return;
            }
            if (!onAction$hasBeaconBeenSent(this, enumC15218aB, dVar.a())) {
                List<String> listA = dVar.a();
                Ul.a aVar2 = Ul.a.f37567c;
                sendCriteoBeacon(listA, aVar2, dVar.getIsFormatLevel(), enumC15218aB);
                sendBeaconToastMessage(aVar2, dVar.getIsFormatLevel(), dVar.getProduct());
                onAction$markBeaconAsSent(this, enumC15218aB, dVar.a());
                qw.a.INSTANCE.z("sentBeacon").a("Beacon sent for URL: " + dVar.a() + " for carousel type: " + enumC15218aB, new Object[0]);
                return;
            }
            qw.a.INSTANCE.z("sentBeacon").a("Beacon already sent for URL: " + dVar.a() + " for carousel type: " + enumC15218aB, new Object[0]);
            return;
        }
        if (action instanceof AbstractC14072a.OnBasketChangeBeacon) {
            AbstractC14072a.OnBasketChangeBeacon c2108a = (AbstractC14072a.OnBasketChangeBeacon) action;
            if (this._homeViewState.getValue().getBeaconsTracker().c().contains(c2108a.getBeaconUrl())) {
                return;
            }
            List listE2 = CollectionsKt.e(c2108a.getBeaconUrl());
            Ul.a aVar3 = Ul.a.f37569e;
            R(this, listE2, aVar3, false, c2108a.getCarouselType(), 4, null);
            Q(this, aVar3, false, c2108a.getProduct(), 2, null);
            InterfaceC16549B<HomeViewState> interfaceC16549B2 = this._homeViewState;
            do {
                value2 = interfaceC16549B2.getValue();
                homeViewState2 = value2;
            } while (!interfaceC16549B2.e(value2, HomeViewState.copy$default(homeViewState2, false, false, null, null, false, null, false, 0, null, false, null, null, null, null, BeaconsTracker.b(homeViewState2.getBeaconsTracker(), null, null, null, null, null, CollectionsKt.P0(homeViewState2.getBeaconsTracker().c(), CollectionsKt.e(c2108a.getBeaconUrl())), null, null, 223, null), 16383, null)));
            return;
        }
        if (action instanceof AbstractC14072a.OnClickBeacon) {
            AbstractC14072a.OnClickBeacon bVar = (AbstractC14072a.OnClickBeacon) action;
            if (this._homeViewState.getValue().getBeaconsTracker().d().containsAll(bVar.a())) {
                return;
            }
            List<String> listA2 = bVar.a();
            Ul.a aVar4 = Ul.a.f37568d;
            sendCriteoBeacon(listA2, aVar4, bVar.getIsFormatLevel(), bVar.getCarouselType());
            sendBeaconToastMessage(aVar4, bVar.getIsFormatLevel(), bVar.getProduct());
            InterfaceC16549B<HomeViewState> interfaceC16549B3 = this._homeViewState;
            do {
                value = interfaceC16549B3.getValue();
                homeViewState = value;
            } while (!interfaceC16549B3.e(value, HomeViewState.copy$default(homeViewState, false, false, null, null, false, null, false, 0, null, false, null, null, null, null, BeaconsTracker.b(homeViewState.getBeaconsTracker(), null, null, null, null, CollectionsKt.P0(homeViewState.getBeaconsTracker().d(), bVar.a()), null, null, null, 239, null), 16383, null)));
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String getCarouselType(EnumC15218a carouselType) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[carouselType.ordinal()];
        if (i10 == 1) {
            return "Buy Again: Carousel";
        }
        if (i10 == 2) {
            return "Favorites on Sale: Carousel";
        }
        if (i10 != 3) {
            return null;
        }
        return "Curated Carousel";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v49, types: [T, ii.h$b] */
    /* JADX WARN: Type inference failed for: r10v14, types: [T, ii.h$b] */
    /* JADX WARN: Type inference failed for: r10v16, types: [T, ii.h$b] */
    /* JADX WARN: Type inference failed for: r2v21, types: [T, ii.h$b] */
    /* JADX WARN: Type inference failed for: r2v23, types: [T, ii.h$b] */
    public final void onAction(Action action) {
        HomeViewState value;
        HomeViewState homeViewState;
        HomeDecorator homeDecorator;
        Uri uri;
        String carouselTitle;
        T tH;
        HomeViewState value2;
        Intrinsics.j(action, "action");
        if (action instanceof Action.IsAfterAccountCreatedAction) {
            InterfaceC16549B<HomeViewState> interfaceC16549B = this._homeViewState;
            do {
                value2 = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value2, HomeViewState.copy$default(value2, false, ((Action.IsAfterAccountCreatedAction) action).getStatus(), null, null, false, null, false, 0, null, false, null, null, null, null, null, 32765, null)));
            return;
        }
        if (action instanceof Action.UserLoggedOutAction) {
            pushUserAuthenticationState();
            loadHomeContent();
            C15809k.d(androidx.view.d0.a(this), null, null, new X(null), 3, null);
            return;
        }
        if (action instanceof Action.HomeChipItemClicked) {
            Action.HomeChipItemClicked homeChipItemClicked = (Action.HomeChipItemClicked) action;
            InterfaceC18214a homeChip = homeChipItemClicked.getHomeChip();
            if ((homeChip instanceof AbstractC14537b ? (AbstractC14537b) homeChip : null) != null) {
                this.analyticsEngine.e((InterfaceC14754a) homeChipItemClicked.getHomeChip());
            }
            C15809k.d(androidx.view.d0.a(this), null, null, new Y(action, null), 3, null);
            return;
        }
        if (action instanceof Action.ProductItemClicked) {
            C15809k.d(androidx.view.d0.a(this), null, null, new F(action, null), 3, null);
            return;
        }
        if (action instanceof Action.PersonalizedProductListClicked) {
            Action.PersonalizedProductListClicked personalizedProductListClicked = (Action.PersonalizedProductListClicked) action;
            String uri2 = personalizedProductListClicked.getUri();
            if (uri2 == null || (uri = Uri.parse(uri2)) == null) {
                uri = Uri.EMPTY;
            }
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Set<String> queryParameterNames = uri != null ? uri.getQueryParameterNames() : null;
            if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
                String query = uri.getQuery();
                if (query == null) {
                    query = "";
                }
                Set<String> queryParameterNames2 = uri.getQueryParameterNames();
                if (queryParameterNames2 != null && queryParameterNames2.contains("list")) {
                    if (StringsKt.d0(query, "buyAgain", false, 2, null)) {
                        objectRef.f143742a = C14756c.h("Buy Again: View All");
                    } else if (StringsKt.d0(query, "favoritesOnSale", false, 2, null)) {
                        objectRef.f143742a = C14756c.h("Favorites on Sale: View All");
                    }
                }
                Set<String> queryParameterNames3 = uri.getQueryParameterNames();
                if (queryParameterNames3 != null && queryParameterNames3.contains("department")) {
                    if (StringsKt.d0(query, "L2-10778", false, 2, null)) {
                        if (personalizedProductListClicked.isWhiteLabelCarousel()) {
                            tH = C14756c.h(personalizedProductListClicked.getCarouselTitle() + ": View All");
                        } else {
                            tH = C14756c.h("Produce-L2-10778: View All");
                        }
                        objectRef.f143742a = tH;
                    } else if (StringsKt.d0(query, "L2-9974", false, 2, null)) {
                        objectRef.f143742a = C14756c.h("Dairy-L2-9974: View All");
                    } else if (StringsKt.d0(query, "L2-9980", false, 2, null)) {
                        objectRef.f143742a = C14756c.h("Snacks-L2-9980: View All");
                    }
                }
            }
            if (personalizedProductListClicked.getCarouselType() == EnumC15218a.f142569c && (carouselTitle = personalizedProductListClicked.getCarouselTitle()) != null && carouselTitle.length() != 0) {
                objectRef.f143742a = C14756c.h(personalizedProductListClicked.getCarouselTitle() + ": View All");
            }
            C15809k.d(androidx.view.d0.a(this), null, null, new G(uri, objectRef, action, null), 3, null);
            return;
        }
        if (action instanceof Action.UpdateOrderStatusPosition) {
            InterfaceC16549B<HomeViewState> interfaceC16549B2 = this._homeViewState;
            do {
                value = interfaceC16549B2.getValue();
                homeViewState = value;
                homeDecorator = homeViewState.getHomeDecorator();
            } while (!interfaceC16549B2.e(value, HomeViewState.copy$default(homeViewState, false, false, homeDecorator != null ? HomeDecorator.copy$default(homeDecorator, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, false, null, null, false, null, false, null, ((Action.UpdateOrderStatusPosition) action).getPosition(), false, null, null, null, null, false, 532676607, null) : null, null, false, null, false, 0, null, false, null, null, null, null, null, 32763, null)));
            return;
        }
        if (action instanceof Action.UpdateEntryAction) {
            if (!this.userManager.b()) {
                onStepperInteractionChange(((Action.UpdateEntryAction) action).getProduct().getCode(), true, true);
                C15809k.d(androidx.view.d0.a(this), null, null, new H(null), 3, null);
                return;
            }
            Action.UpdateEntryAction updateEntryAction = (Action.UpdateEntryAction) action;
            onStepperInteractionChange(updateEntryAction.getProduct().getCode(), false, true);
            if (fj.l.a(this.cartEntries, updateEntryAction.getProduct().getCode()) == null) {
                this.skipProductCarouselUpdates = true;
            }
            wr.f.M(this.cartInteractor, updateEntryAction.getProduct(), updateEntryAction.getQuantityToUpdate(), false, null, 12, null);
            return;
        }
        if (action instanceof Action.StepperStateChanged) {
            C15809k.d(androidx.view.d0.a(this), null, null, new I(action, null), 3, null);
            return;
        }
        if (action instanceof Action.UpdateNotification) {
            Action.UpdateNotification updateNotification = (Action.UpdateNotification) action;
            updateRateAndTipNotification(updateNotification.getOrderId(), updateNotification.getExternalShopperId(), updateNotification.getShouldNavigate());
            return;
        }
        if (action instanceof Action.MarketBannerClickAction) {
            C15809k.d(androidx.view.d0.a(this), null, null, new J(action, this, null), 3, null);
            return;
        }
        if (action instanceof Action.FetchCuratedCarousels) {
            fetchCuratedCard(((Action.FetchCuratedCarousels) action).getComponent());
            return;
        }
        if (action instanceof Action.FetchPersonalizedCarousels) {
            fetchPersonalizedProductCard(((Action.FetchPersonalizedCarousels) action).getComponent());
            return;
        }
        if (action instanceof Action.UserAcceptAddToCartAction) {
            wr.f.B(this.cartInteractor, new AbstractC17440a.Accept(((Action.UserAcceptAddToCartAction) action).getCartUpdateRequest(), null, null, 4, null), false, null, 6, null);
            return;
        }
        if (action instanceof Action.ResetStepper) {
            resetQuantitySteppers(((Action.ResetStepper) action).getProductCode());
            return;
        }
        if (action instanceof Action.RefreshScreen) {
            refreshHomeContent();
        } else if (action instanceof Action.GoogleAdClicked) {
            this.analyticsEngine.k(C14375c.b(((Action.GoogleAdClicked) action).getAnalytics(), "home"));
        } else {
            if (action instanceof Action.FindYourListTrackAction) {
                this.analyticsEngine.b(C14756c.a("Find Your List:Teacher's List homescreen component"), new Function1() { // from class: com.meijer.mobile.meijer.activity.home.R0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HomeViewModel.onAction$lambda$103((TrackingData) obj);
                    }
                });
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void onAction(AbstractC14021c action) {
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC14021c.OnClaimRewardClicked) {
            claimMperks(((AbstractC14021c.OnClaimRewardClicked) action).getCouponId());
            Unit unit = Unit.f143329a;
        } else if (Intrinsics.e(action, AbstractC14021c.a.f132024a)) {
            fetchMperks(true);
            Unit unit2 = Unit.f143329a;
        } else if (Intrinsics.e(action, AbstractC14021c.d.f132030a)) {
            C15809k.d(androidx.view.d0.a(this), null, null, new K(null), 3, null);
        } else if (action instanceof AbstractC14021c.RedeemMPerksViewAllClicked) {
            C15809k.d(androidx.view.d0.a(this), null, null, new L(null), 3, null);
        } else if (action instanceof AbstractC14021c.RewardsMPerksClicked) {
            C15809k.d(androidx.view.d0.a(this), null, null, new N(action, null), 3, null);
        } else if (action instanceof AbstractC14021c.YourRewardsMPerksViewAllClicked) {
            C15809k.d(androidx.view.d0.a(this), null, null, new O(action, null), 3, null);
        } else {
            if (!(action instanceof AbstractC14021c.OnClaimForButtonClicked) && !(action instanceof AbstractC14021c.OnRedeemRewardsTabClicked) && !(action instanceof AbstractC14021c.OnYourRewardsTabClicked)) {
                throw new NoWhenBranchMatchedException();
            }
            Unit unit3 = Unit.f143329a;
        }
        this.analyticsEngine.e(action);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, java.lang.String] */
    public final void onAction(final AbstractC13720b action) {
        Intrinsics.j(action, "action");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f143742a = "shop department carousel:";
        if (action instanceof AbstractC13720b.Retry) {
            fetchDepartmentCarousel(((AbstractC13720b.Retry) action).getCarouselType());
            Unit unit = Unit.f143329a;
            return;
        }
        if (action instanceof AbstractC13720b.ViewAll) {
            AbstractC13720b.ViewAll cVar = (AbstractC13720b.ViewAll) action;
            e.c cVarB = cVar.getCarouselType();
            if (cVarB instanceof e.c.b) {
                this.analyticsEngine.h(C14756c.a("Event: shop department carousel: view all"), new AbstractC14762i[0]);
            } else if (cVarB instanceof e.c.a) {
                this.analyticsEngine.h(C14756c.a(StringsKt.Q("Event: {carousel_name} carousel: view all", SEASONAL_CAROUSEL_NAME_ANALYTIC_TEMPLATE, cVar.getCarouselTitle(), false, 4, null)), new AbstractC14762i[0]);
                objectRef.f143742a = "shop department carousel:" + cVar.getCarouselTitle();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            C15809k.d(androidx.view.d0.a(this), null, null, new P(action, objectRef, null), 3, null);
            return;
        }
        if (action instanceof AbstractC13720b.DepartmentClicked) {
            AbstractC13720b.DepartmentClicked aVar = (AbstractC13720b.DepartmentClicked) action;
            int iP = this.deeplinkParser.P(aVar.getDeeplink());
            if (Intrinsics.e(aVar.getCarouselType(), e.c.a.f39991b)) {
                if (iP == 4000) {
                    this.analyticsEngine.b(C14756c.h("T1:" + aVar.getName()), new Function1() { // from class: com.meijer.mobile.meijer.activity.home.G0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HomeViewModel.onAction$lambda$107(action, (TrackingData) obj);
                        }
                    });
                } else if (iP == 4100) {
                    this.analyticsEngine.b(C14756c.h("Collection:" + aVar.getCarouselTitle()), new Function1() { // from class: com.meijer.mobile.meijer.activity.home.F0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HomeViewModel.onAction$lambda$106(action, (TrackingData) obj);
                        }
                    });
                    objectRef.f143742a = "shop department carousel:" + aVar.getName();
                } else if (iP == 4200) {
                    this.analyticsEngine.b(C14756c.a("shopDepartmentMenu"), new Function1() { // from class: com.meijer.mobile.meijer.activity.home.E0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HomeViewModel.onAction$lambda$105(action, (TrackingData) obj);
                        }
                    });
                }
            } else if (iP == 4200) {
                this.analyticsEngine.b(C14756c.h("shopDepartmentTierLevel"), new Function1() { // from class: com.meijer.mobile.meijer.activity.home.H0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HomeViewModel.onAction$lambda$108(action, (TrackingData) obj);
                    }
                });
            }
            C15809k.d(androidx.view.d0.a(this), null, null, new Q(action, objectRef, null), 3, null);
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void onAction(AbstractC14019a action) {
        Intrinsics.j(action, "action");
        if (Intrinsics.e(action, AbstractC14019a.C2090a.f132021a)) {
            fetchEnrollmentOfferResendEmailResponse();
        } else {
            if (!Intrinsics.e(action, AbstractC14019a.b.f132022a)) {
                throw new NoWhenBranchMatchedException();
            }
            dismissEmailVerificationBanner();
        }
    }

    public final void onAction(AbstractC14029k action) {
        Intrinsics.j(action, "action");
        if (Intrinsics.e(action, AbstractC14029k.a.f132057a)) {
            fetchSpecialOffers();
        } else {
            if (action instanceof AbstractC14029k.ViewAll) {
                C15809k.d(androidx.view.d0.a(this), null, null, new R(null), 3, null);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void onAction(AbstractC13870f action) {
        HomeViewState value;
        HomeViewState homeViewState;
        HomeDecorator homeDecoratorCopy$default;
        ArrayList arrayList;
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC13870f.Dismiss) {
            InterfaceC16549B<HomeViewState> interfaceC16549B = this._homeViewState;
            do {
                value = interfaceC16549B.getValue();
                homeViewState = value;
                HomeDecorator homeDecorator = homeViewState.getHomeDecorator();
                if (homeDecorator != null) {
                    List<OrderStatusCardDecorator> orderStatusCards = homeViewState.getHomeDecorator().getOrderStatusCards();
                    if (orderStatusCards != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : orderStatusCards) {
                            if (!Intrinsics.e(((OrderStatusCardDecorator) obj).getOrderNumber(), ((AbstractC13870f.Dismiss) action).getOrderNumber())) {
                                arrayList2.add(obj);
                            }
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    homeDecoratorCopy$default = HomeDecorator.copy$default(homeDecorator, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, false, null, null, false, null, false, arrayList, homeViewState.getHomeDecorator().getInLastPosition() ? homeViewState.getHomeDecorator().getOrderStatusPosition() - 1 : homeViewState.getHomeDecorator().getOrderStatusPosition(), false, null, null, null, null, false, 530579455, null);
                } else {
                    homeDecoratorCopy$default = null;
                }
            } while (!interfaceC16549B.e(value, HomeViewState.copy$default(homeViewState, false, false, homeDecoratorCopy$default, null, false, null, false, 0, null, false, null, null, null, null, null, 32763, null)));
            this.appPrefManager.b(((AbstractC13870f.Dismiss) action).getOrderNumber());
            Unit unit = Unit.f143329a;
        } else if (action instanceof AbstractC13870f.RateAndTip) {
            C15809k.d(androidx.view.d0.a(this), null, null, new T(action, null), 3, null);
        } else if (action instanceof AbstractC13870f.ViewDeclinedPayment) {
            C15809k.d(androidx.view.d0.a(this), null, null, new U(action, null), 3, null);
        } else if (action instanceof AbstractC13870f.ViewOrderDetail) {
            C15809k.d(androidx.view.d0.a(this), null, null, new V(action, null), 3, null);
        } else if (action instanceof AbstractC13870f.ViewSubstitutions) {
            C15809k.d(androidx.view.d0.a(this), null, null, new W(action, this, null), 3, null);
        } else {
            if (!(action instanceof AbstractC13870f.OrderRatedAndTipped)) {
                throw new NoWhenBranchMatchedException();
            }
            fetchActiveOrders();
            Unit unit2 = Unit.f143329a;
        }
        this.analyticsEngine.e(action);
    }
}
