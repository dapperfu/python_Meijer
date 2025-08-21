package com.meijer.mobile.home.ux;

import Ao.C2898u;
import Co.ProductFullDetails;
import Eh.EmailVerificationSpiffs;
import Hl.FlyBuyOrderDetail;
import Ir.UserActionDialogInfo;
import Ki.C;
import Pj.a;
import Pk.Coupon;
import Qk.a;
import Tl.MarketingBannersDecorator;
import Ul.BeaconsTracker;
import Ul.ToastMessageData;
import Vl.DepartmentCard;
import Vl.MarketingBanner;
import Vl.e;
import Wl.HomeMperks;
import Wl.HomeMperksClippedReward;
import Yk.CouponState;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import co.RewardDetail;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse;
import com.meijer.mobile.home.ux.k0;
import com.meijer.mobile.meijer.activity.home.HomeViewModel;
import com.meijer.mobile.mperks.networking.domain.models.ExpiringPoints;
import cs.AbstractC13555a;
import dl.C13702d;
import ds.AbstractC13720b;
import ds.C13719a;
import ds.DepartmentCarouselDecorator;
import el.SpecialOffer;
import es.AbstractC13870f;
import es.OrderStatusCardDecorator;
import ev.C13889a;
import fj.Entry;
import fj.EntryChange;
import fj.ShoppingCart;
import fm.AbstractC14019a;
import fm.AbstractC14020b;
import fm.AbstractC14021c;
import fm.AbstractC14029k;
import fs.AbstractC14072a;
import gi.C14377e;
import gi.EnumC14378f;
import gi.GoogleAdData;
import gm.HomeEmailBannerDecorator;
import gm.HomeMperksDecorator;
import gm.SpecialOffersCarouselDecorator;
import gm.TeachersListCardDecorator;
import hi.InterfaceC14523a;
import hj.OrderDetail;
import hm.AbstractC14537b;
import hm.C14536a;
import ii.AbstractC14762i;
import ii.C14756c;
import ii.C14760g;
import ii.TrackingData;
import il.InterfaceC14774f;
import im.C14781c;
import im.FullOrderResponseHolder;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
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
import kotlin.comparisons.ComparisonsKt;
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
import mv.E0;
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
import sp.C17115a;
import sp.ProductState;
import tp.Builder;
import tp.EnumC17276a;
import uk.AbstractC17440a;
import uk.c;
import ur.AbstractC17454a;
import vr.AbstractC17720a;
import vs.C17728h;
import vs.CarouselDecorator;
import vs.ProductListDecorator;
import wk.C17898a;
import wl.CartEntry;
import wr.InterfaceC17909a;
import xr.InterfaceC18214a;
import yk.C18328d;
import yo.C18335a;
import yo.MeijerUser;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000Â\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ß\u00022\u00020\u00012\u00020\u0002:\u000e\u0098\u0002\u0096\u0002\u0094\u0002\u0092\u0002\u008c\u0002\u008e\u0002\u0090\u0002B«\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\b\b\u0001\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\r\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020-¢\u0006\u0004\b0\u0010/J\r\u00101\u001a\u00020-¢\u0006\u0004\b1\u0010/J\u0017\u00104\u001a\u00020-2\u0006\u00103\u001a\u000202H\u0000¢\u0006\u0004\b4\u00105J\u0015\u00108\u001a\u00020-2\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\u00020-2\u0006\u00107\u001a\u00020:¢\u0006\u0004\b;\u0010<J\u0015\u00108\u001a\u00020-2\u0006\u00107\u001a\u00020=¢\u0006\u0004\b8\u0010>J\u0015\u0010A\u001a\u00020-2\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\u0015\u00108\u001a\u00020-2\u0006\u00107\u001a\u00020C¢\u0006\u0004\b8\u0010DJ\u0015\u00108\u001a\u00020-2\u0006\u00107\u001a\u00020E¢\u0006\u0004\b8\u0010FJ\u0015\u00108\u001a\u00020-2\u0006\u00107\u001a\u00020G¢\u0006\u0004\b8\u0010HJ\u0015\u0010J\u001a\u00020-2\u0006\u00107\u001a\u00020I¢\u0006\u0004\bJ\u0010KJ\u0015\u00108\u001a\u00020-2\u0006\u00107\u001a\u00020L¢\u0006\u0004\b8\u0010MJ\u0015\u00108\u001a\u00020-2\u0006\u00107\u001a\u00020N¢\u0006\u0004\b8\u0010OJ\u0015\u0010Q\u001a\u00020-2\u0006\u00107\u001a\u00020P¢\u0006\u0004\bQ\u0010RJ\u001d\u0010W\u001a\u00020-2\u0006\u0010T\u001a\u00020S2\u0006\u0010V\u001a\u00020U¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020-H\u0014¢\u0006\u0004\bY\u0010/J\u0015\u0010[\u001a\u00020-2\u0006\u00107\u001a\u00020Z¢\u0006\u0004\b[\u0010\\J\u001f\u0010`\u001a\u00020-2\u000e\u0010_\u001a\n\u0012\u0004\u0012\u00020^\u0018\u00010]H\u0016¢\u0006\u0004\b`\u0010aJ\u000f\u0010c\u001a\u00020bH\u0016¢\u0006\u0004\bc\u0010dJ%\u0010f\u001a\u00020-2\u0006\u0010f\u001a\u00020e2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020g0]H\u0016¢\u0006\u0004\bf\u0010iJ)\u0010n\u001a\u00020-\"\u0004\b\u0000\u0010j2\u0012\u0010m\u001a\u000e\u0012\u0004\u0012\u00020l\u0012\u0004\u0012\u00028\u00000kH\u0016¢\u0006\u0004\bn\u0010oJ+\u0010v\u001a\u00020-2\u0006\u0010q\u001a\u00020p2\u0012\u0010u\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020t0s0rH\u0002¢\u0006\u0004\bv\u0010wJ\u001d\u0010z\u001a\u00020-2\f\u0010y\u001a\b\u0012\u0004\u0012\u00020x0rH\u0002¢\u0006\u0004\bz\u0010{J\u000f\u0010|\u001a\u00020-H\u0002¢\u0006\u0004\b|\u0010/J\u000f\u0010}\u001a\u00020-H\u0002¢\u0006\u0004\b}\u0010/J\u001f\u0010\u0080\u0001\u001a\u00020-2\f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020~0rH\u0002¢\u0006\u0005\b\u0080\u0001\u0010{J\u0011\u0010\u0081\u0001\u001a\u00020-H\u0002¢\u0006\u0005\b\u0081\u0001\u0010/J\u0011\u0010\u0082\u0001\u001a\u00020-H\u0002¢\u0006\u0005\b\u0082\u0001\u0010/J\u001c\u0010\u0085\u0001\u001a\u00020-2\b\u0010\u0084\u0001\u001a\u00030\u0083\u0001H\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0013\u0010\u0087\u0001\u001a\u00020-H\u0082@¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0011\u0010\u0089\u0001\u001a\u00020-H\u0002¢\u0006\u0005\b\u0089\u0001\u0010/J\u0011\u0010\u008a\u0001\u001a\u00020-H\u0002¢\u0006\u0005\b\u008a\u0001\u0010/J\u001c\u0010\u008d\u0001\u001a\u00020-2\b\u0010\u008c\u0001\u001a\u00030\u008b\u0001H\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0011\u0010\u008f\u0001\u001a\u00020-H\u0002¢\u0006\u0005\b\u008f\u0001\u0010/J\u0011\u0010\u0090\u0001\u001a\u00020-H\u0002¢\u0006\u0005\b\u0090\u0001\u0010/J\u0011\u0010\u0091\u0001\u001a\u00020-H\u0002¢\u0006\u0005\b\u0091\u0001\u0010/J\u001b\u0010\u0093\u0001\u001a\u00020-2\u0007\u0010\u0092\u0001\u001a\u00020pH\u0002¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J;\u0010\u009a\u0001\u001a\u00030\u0099\u0001*\b\u0012\u0004\u0012\u00020t0s2\n\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u00012\u0007\u0010\u0097\u0001\u001a\u0002022\u0007\u0010\u0098\u0001\u001a\u000202H\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u001c\u0010\u009e\u0001\u001a\u00020-2\b\u0010\u009d\u0001\u001a\u00030\u009c\u0001H\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J/\u0010¤\u0001\u001a\u00020-2\b\u0010¡\u0001\u001a\u00030 \u00012\b\u0010£\u0001\u001a\u00030¢\u00012\u0007\u0010\u0092\u0001\u001a\u00020pH\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001J(\u0010¨\u0001\u001a\u00020-2\n\u0010§\u0001\u001a\u0005\u0018\u00010¦\u00012\b\u0010\u0092\u0001\u001a\u00030\u009c\u0001H\u0002¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u001b\u0010ª\u0001\u001a\u00020-2\u0007\u0010\u0092\u0001\u001a\u00020pH\u0002¢\u0006\u0006\bª\u0001\u0010\u0094\u0001J&\u0010\u00ad\u0001\u001a\u00020-2\b\u0010¬\u0001\u001a\u00030«\u00012\b\u0010£\u0001\u001a\u00030¢\u0001H\u0002¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J'\u0010²\u0001\u001a\u00030±\u00012\b\u0010°\u0001\u001a\u00030¯\u00012\b\u0010£\u0001\u001a\u00030¢\u0001H\u0002¢\u0006\u0006\b²\u0001\u0010³\u0001J\u001f\u0010´\u0001\u001a\u0005\u0018\u00010\u0095\u00012\b\u0010£\u0001\u001a\u00030¢\u0001H\u0002¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u001c\u0010·\u0001\u001a\u00020-2\b\u0010\u0092\u0001\u001a\u00030¶\u0001H\u0002¢\u0006\u0006\b·\u0001\u0010¸\u0001J'\u0010»\u0001\u001a\u00020-2\b\u0010º\u0001\u001a\u00030¹\u00012\b\u0010\u0092\u0001\u001a\u00030¶\u0001H\u0082@¢\u0006\u0006\b»\u0001\u0010¼\u0001JI\u0010Á\u0001\u001a\u00020-2\u000e\u0010½\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010r2\f\b\u0002\u0010¿\u0001\u001a\u0005\u0018\u00010¾\u00012\t\b\u0002\u0010À\u0001\u001a\u0002022\f\b\u0002\u0010£\u0001\u001a\u0005\u0018\u00010¢\u0001H\u0002¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J%\u0010Æ\u0001\u001a\u00020-2\u0007\u0010Ã\u0001\u001a\u00020t2\b\u0010Å\u0001\u001a\u00030Ä\u0001H\u0002¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J6\u0010Ê\u0001\u001a\u00020-2\f\b\u0002\u0010È\u0001\u001a\u0005\u0018\u00010\u0095\u00012\t\b\u0002\u0010\u0098\u0001\u001a\u0002022\t\b\u0002\u0010É\u0001\u001a\u000202H\u0002¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J\u001c\u0010Í\u0001\u001a\u00020-2\u0007\u00107\u001a\u00030Ì\u0001H\u0082@¢\u0006\u0006\bÍ\u0001\u0010Î\u0001J+\u0010Ð\u0001\u001a\u00020-2\b\u0010°\u0001\u001a\u00030¯\u00012\f\b\u0002\u0010Ï\u0001\u001a\u0005\u0018\u00010±\u0001H\u0082@¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J5\u0010Ô\u0001\u001a\u00020-2\b\u0010Ó\u0001\u001a\u00030Ò\u00012\b\u0010°\u0001\u001a\u00030¯\u00012\f\b\u0002\u0010Ï\u0001\u001a\u0005\u0018\u00010±\u0001H\u0082@¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001J!\u0010Ù\u0001\u001a\u00020-2\r\u0010Ø\u0001\u001a\b0Ö\u0001j\u0003`×\u0001H\u0002¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J*\u0010Ü\u0001\u001a\u00020-2\r\u0010Ø\u0001\u001a\b0Ö\u0001j\u0003`×\u00012\u0007\u0010Û\u0001\u001a\u000202H\u0002¢\u0006\u0006\bÜ\u0001\u0010Ý\u0001J!\u0010Þ\u0001\u001a\u00020-2\r\u0010Ø\u0001\u001a\b0Ö\u0001j\u0003`×\u0001H\u0002¢\u0006\u0006\bÞ\u0001\u0010Ú\u0001J5\u0010à\u0001\u001a\u00020-2\n\u0010¿\u0001\u001a\u0005\u0018\u00010¾\u00012\t\b\u0002\u0010À\u0001\u001a\u0002022\n\u0010Ã\u0001\u001a\u0005\u0018\u00010ß\u0001H\u0002¢\u0006\u0006\bà\u0001\u0010á\u0001J\u0011\u0010â\u0001\u001a\u00020-H\u0002¢\u0006\u0005\bâ\u0001\u0010/J=\u0010è\u0001\u001a\u00020-2\u0011\u0010ä\u0001\u001a\f\u0018\u00010\u0095\u0001j\u0005\u0018\u0001`ã\u00012\r\u0010æ\u0001\u001a\b0\u0095\u0001j\u0003`å\u00012\u0007\u0010ç\u0001\u001a\u000202H\u0002¢\u0006\u0006\bè\u0001\u0010é\u0001J5\u0010ë\u0001\u001a\u00020-2\u0006\u0010f\u001a\u00020e2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020g0]2\n\u0010ê\u0001\u001a\u0005\u0018\u00010\u0095\u0001H\u0082@¢\u0006\u0006\bë\u0001\u0010ì\u0001J\u001e\u0010í\u0001\u001a\u00020-2\n\u0010ê\u0001\u001a\u0005\u0018\u00010\u0095\u0001H\u0002¢\u0006\u0006\bí\u0001\u0010î\u0001J\u001b\u0010ï\u0001\u001a\u00030Ä\u00012\u0006\u0010f\u001a\u00020eH\u0002¢\u0006\u0006\bï\u0001\u0010ð\u0001J5\u0010ñ\u0001\u001a\u00020-2\u0006\u0010f\u001a\u00020e2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020g0]2\n\u0010ê\u0001\u001a\u0005\u0018\u00010\u0095\u0001H\u0082@¢\u0006\u0006\bñ\u0001\u0010ì\u0001J5\u0010ò\u0001\u001a\u00020-2\u0006\u0010f\u001a\u00020e2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020g0]2\n\u0010ê\u0001\u001a\u0005\u0018\u00010\u0095\u0001H\u0082@¢\u0006\u0006\bò\u0001\u0010ì\u0001J\u001e\u0010´\u0001\u001a\u00030\u0095\u00012\t\u0010Ã\u0001\u001a\u0004\u0018\u00010tH\u0002¢\u0006\u0006\b´\u0001\u0010ó\u0001J;\u0010ö\u0001\u001a\u00020-2\u0007\u0010ô\u0001\u001a\u0002022\b\u0010h\u001a\u0004\u0018\u00010g2\n\u0010ê\u0001\u001a\u0005\u0018\u00010\u0095\u00012\b\u0010õ\u0001\u001a\u00030Ä\u0001H\u0002¢\u0006\u0006\bö\u0001\u0010÷\u0001J&\u0010ø\u0001\u001a\u00020-2\b\u0010h\u001a\u0004\u0018\u00010g2\b\u0010õ\u0001\u001a\u00030Ä\u0001H\u0002¢\u0006\u0006\bø\u0001\u0010ù\u0001J+\u0010û\u0001\u001a\u0004\u0018\u00010x2\n\u0010ê\u0001\u001a\u0005\u0018\u00010\u0095\u00012\t\b\u0002\u0010ú\u0001\u001a\u000202H\u0002¢\u0006\u0006\bû\u0001\u0010ü\u0001J%\u0010þ\u0001\u001a\u000b\u0012\u0005\u0012\u00030ý\u0001\u0018\u00010r2\b\u0010h\u001a\u0004\u0018\u00010gH\u0002¢\u0006\u0006\bþ\u0001\u0010ÿ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0002\u0010\u0081\u0002R\u0016\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0002\u0010\u0083\u0002R\u0016\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0002\u0010\u0085\u0002R\u0016\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0002\u0010\u0087\u0002R\u0016\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0002\u0010\u0089\u0002R\u0016\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0002\u0010\u008b\u0002R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0002\u0010\u008d\u0002R\u0016\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0002\u0010\u008f\u0002R\u0016\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0002\u0010\u0091\u0002R\u0016\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0002\u0010\u0093\u0002R\u0016\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0002\u0010\u0095\u0002R\u0016\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0002\u0010\u0097\u0002R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0002\u0010\u0099\u0002R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0002\u0010\u009b\u0002R\u0016\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0002\u0010\u009d\u0002R\u0016\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0002\u0010\u009f\u0002R\u0016\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0002\u0010¡\u0002R\u0016\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0002\u0010£\u0002R\u0016\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0002\u0010¥\u0002R\u0016\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0002\u0010§\u0002R\u0018\u0010«\u0002\u001a\u00030¨\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0002\u0010ª\u0002R\u0017\u0010®\u0002\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0002\u0010\u00ad\u0002R\u001f\u0010³\u0002\u001a\n\u0012\u0005\u0012\u00030°\u00020¯\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0002\u0010²\u0002R$\u0010¹\u0002\u001a\n\u0012\u0005\u0012\u00030°\u00020´\u00028\u0006¢\u0006\u0010\n\u0006\bµ\u0002\u0010¶\u0002\u001a\u0006\b·\u0002\u0010¸\u0002R\u001f\u0010¾\u0002\u001a\n\u0012\u0005\u0012\u00030»\u00020º\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0002\u0010½\u0002R$\u0010Ä\u0002\u001a\n\u0012\u0005\u0012\u00030»\u00020¿\u00028\u0006¢\u0006\u0010\n\u0006\bÀ\u0002\u0010Á\u0002\u001a\u0006\bÂ\u0002\u0010Ã\u0002R\u001f\u0010Ç\u0002\u001a\n\u0012\u0005\u0012\u00030Å\u00020¯\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0002\u0010²\u0002R$\u0010Ê\u0002\u001a\n\u0012\u0005\u0012\u00030Å\u00020´\u00028\u0006¢\u0006\u0010\n\u0006\bÈ\u0002\u0010¶\u0002\u001a\u0006\bÉ\u0002\u0010¸\u0002R\u001e\u0010Ì\u0002\u001a\t\u0012\u0004\u0012\u00020?0º\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bË\u0002\u0010½\u0002R#\u0010Ï\u0002\u001a\t\u0012\u0004\u0012\u00020?0¿\u00028\u0006¢\u0006\u0010\n\u0006\bÍ\u0002\u0010Á\u0002\u001a\u0006\bÎ\u0002\u0010Ã\u0002R\u001f\u0010Ò\u0002\u001a\n\u0012\u0005\u0012\u00030Ð\u00020º\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÑ\u0002\u0010½\u0002R\u001f\u0010Õ\u0002\u001a\b0\u0095\u0001j\u0003`ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0002\u0010Ô\u0002R\u0019\u0010Ø\u0002\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0002\u0010×\u0002R \u0010Ü\u0002\u001a\t\u0012\u0005\u0012\u00030Ù\u00020r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0002\u0010Û\u0002R\u001c\u0010Þ\u0002\u001a\n\u0012\u0005\u0012\u00030Ð\u00020¿\u00028F¢\u0006\b\u001a\u0006\bÝ\u0002\u0010Ã\u0002¨\u0006à\u0002"}, d2 = {"Lcom/meijer/mobile/home/ux/k0;", "Landroidx/lifecycle/c0;", "Lwr/a;", "Lyo/k;", "userManager", "Lil/f;", "cartProvider", "Lhm/a;", "homeChipsRepository", "Lim/c;", "orderStatusRepository", "Lzl/k;", "featureManager", "Ljm/a;", "homeRepository", "LYk/u;", "couponsStateRepository", "Ldl/d;", "couponsRepository", "Lhi/a;", "analyticsEngine", "Lyo/a;", "appPrefManager", "LDl/e;", "deeplinkParser", "Ljm/b;", "marketingBannerRepository", "Lfo/e;", "rewardsRepository", "Lwr/f;", "cartInteractor", "Ljp/b;", "productRecommendationsRepository", "Lpp/d;", "productMetadataStore", "LRo/c;", "productRepository", "Lqp/b;", "beaconClient", "Lsp/a;", "multiChannelProductsStateRepository", "Lmv/K;", "ioDispatcher", "<init>", "(Lyo/k;Lil/f;Lhm/a;Lim/c;Lzl/k;Ljm/a;LYk/u;Ldl/d;Lhi/a;Lyo/a;LDl/e;Ljm/b;Lfo/e;Lwr/f;Ljp/b;Lpp/d;LRo/c;Lqp/b;Lsp/a;Lmv/K;)V", "", "loadGoogleAd", "()V", "W0", "G0", "", "showLoading", "t0", "(Z)V", "Lfs/a;", "action", "onAction", "(Lfs/a;)V", "Lcs/a;", "J0", "(Lcs/a;)V", "Lds/b;", "(Lds/b;)V", "Lcom/meijer/mobile/home/ux/k0$j;", "dialog", "n0", "(Lcom/meijer/mobile/home/ux/k0$j;)V", "LQk/a;", "(LQk/a;)V", "Lfm/c;", "(Lfm/c;)V", "Lfm/k;", "(Lfm/k;)V", "Lfm/b;", "K0", "(Lfm/b;)V", "Lfm/a;", "(Lfm/a;)V", "Les/f;", "(Les/f;)V", "Lcom/meijer/mobile/home/ux/k0$g;", "H0", "(Lcom/meijer/mobile/home/ux/k0$g;)V", "Ltp/b;", "builder", "Ltp/a;", "flowType", "updateRatedAndTippedOrder", "(Ltp/b;Ltp/a;)V", "onCleared", "Lcom/meijer/mobile/home/ux/k0$l;", "I0", "(Lcom/meijer/mobile/home/ux/k0$l;)V", "Luk/c;", "Lfj/C;", "cartResource", "observeCart", "(Luk/c;)V", "LJu/a;", "getDisposable", "()LJu/a;", "Lur/a;", "processedRequest", "Lfj/j;", "entryChange", "(Lur/a;Luk/c;)V", "T", "Luk/a;", "Lvr/a;", "challenge", "throwChallenge", "(Luk/a;)V", "LVl/e$f;", "key", "", "Lsp/b;", "LCo/h;", "productState", "T0", "(LVl/e$f;Ljava/util/List;)V", "LYk/c;", "couponStateList", "onCouponState", "(Ljava/util/List;)V", "s0", "fetchMperksExpiringPoints", "Lcom/meijer/mobile/mperks/networking/domain/models/ExpiringPoints;", "expiringPoints", "a1", "configureFeatureEntryPoints", "r0", "LVl/e;", "homeComponent", "q0", "(LVl/e;)V", "o0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchActiveOrders", "fetchSpecialOffers", "LVl/e$c;", "component", "fetchDepartmentCarousel", "(LVl/e$c;)V", "fetchEnrollmentOfferResendEmailResponse", "fetchEmailVerificationBannerSettings", "dismissEmailVerificationBanner", "productComponent", "u0", "(LVl/e$f;)V", "", "stepperIdInInteraction", "isStepperInTransition", "resetStepper", "Lvs/f;", "b1", "(Lsp/b;Ljava/lang/String;ZZ)Lvs/f;", "LVl/e$f$b;", "curatedCarousel", "p0", "(LVl/e$f$b;)V", "LPj/a;", "loadingState", "Lkk/a;", "carouselType", "c1", "(LPj/a;Lkk/a;LVl/e$f;)V", "LVl/j;", "productCardDataResource", "S0", "(LVl/j;LVl/e$f$b;)V", "fetchPersonalizedProductCard", "LPk/c;", "couponIdentity", "onProductCouponButtonClicked", "(LPk/c;Lkk/a;)V", "LPk/a;", "coupon", "Lii/f;", "getClipCouponTrackingData", "(LPk/a;Lkk/a;)Lii/f;", "getCarouselType", "(Lkk/a;)Ljava/lang/String;", "LVl/e$f$d;", "v0", "(LVl/e$f$d;)V", "LVl/k;", "productCard", "fetchProductsForV3Carousel", "(LVl/k;LVl/e$f$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "beacon", "LUl/a;", "type", "isFormatLevel", "sendCriteoBeacon", "(Ljava/util/List;LUl/a;ZLkk/a;)V", "product", "", "quantityToUpdate", "V0", "(LCo/h;D)V", "activeStepperId", "inTransition", "onStepperInteractionChange", "(Ljava/lang/String;ZZ)V", "LQk/a$a;", "X0", "(LQk/a$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackingData", "clipCoupon", "(LPk/a;Lii/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;", "response", "onGetClipCouponResponse", "(Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;LPk/a;Lii/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/meijer/mobile/core/models/mperks/MperksCouponId;", "couponId", "updateLoadingStateOfCoupon", "(J)V", "isRedeemedSuccessfully", "processMperksState", "(JZ)V", "claimMperks", "Lnk/c;", "sendBeaconToastMessage", "(LUl/a;ZLnk/c;)V", "fetchTipAndNotification", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "Lcom/meijer/mobile/core/model/common/ExternalShopperId;", "externalShopperId", "navigateToTipActivity", "updateRateAndTipNotification", "(Ljava/lang/String;Ljava/lang/String;Z)V", "productCode", "updateCartEntry", "(Lur/a;Luk/c;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetQuantitySteppers", "(Ljava/lang/String;)V", "getProductUnitPrice", "(Lur/a;)D", "addCartEntry", "removeCartEntry", "(LCo/h;)Ljava/lang/String;", "requireCartOpenExtra", "entryUnitPrice", "trackCartAdditionAction", "(ZLfj/j;Ljava/lang/String;D)V", "trackCartRemovalAction", "(Lfj/j;D)V", "logError", "getCouponState", "(Ljava/lang/String;Z)LYk/c;", "LPk/f;", "getCouponList", "(Lfj/j;)Ljava/util/List;", "a", "Lyo/k;", "b", "Lil/f;", "c", "Lhm/a;", "d", "Lim/c;", "e", "Lzl/k;", "f", "Ljm/a;", "g", "LYk/u;", "h", "Ldl/d;", "i", "Lhi/a;", "j", "Lyo/a;", "k", "LDl/e;", "l", "Ljm/b;", "m", "Lfo/e;", "n", "Lwr/f;", "o", "Ljp/b;", "p", "Lpp/d;", "q", "LRo/c;", "r", "Lqp/b;", "s", "Lsp/a;", "t", "Lmv/K;", "LPj/c;", "u", "LPj/c;", "loadingStateManager", "v", "LJu/a;", "disposables", "Lpv/B;", "Lcom/meijer/mobile/home/ux/k0$m;", "w", "Lpv/B;", "_viewState", "Lpv/P;", "x", "Lpv/P;", "F0", "()Lpv/P;", "viewState", "Lpv/A;", "Lcom/meijer/mobile/home/ux/k0$k;", "y", "Lpv/A;", "_effectsFlow", "Lpv/F;", "z", "Lpv/F;", "B0", "()Lpv/F;", "effectsFlow", "Lcom/meijer/mobile/home/ux/k0$h;", "A", "_bottomSheetContentStateFlow", "B", "w0", "bottomSheetContentStateFlow", "C", "_dialogFlow", "D", "A0", "dialogFlow", "LUl/e;", "E", "_toastMessageData", "F", "Ljava/lang/String;", "cartId", "G", "Z", "skipProductCarouselUpdates", "Lfj/i;", "H", "Ljava/util/List;", "cartEntries", "getToastMessageData", "toastMessageData", "I", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class k0 extends androidx.view.c0 implements InterfaceC17909a {

    /* renamed from: J, reason: collision with root package name */
    public static final int f98845J = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<AbstractC11774h> _bottomSheetContentStateFlow;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final pv.P<AbstractC11774h> bottomSheetContentStateFlow;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<AbstractC11776j> _dialogFlow;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16553F<AbstractC11776j> dialogFlow;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<ToastMessageData> _toastMessageData;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private String cartId;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private boolean skipProductCarouselUpdates;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private List<Entry> cartEntries;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14774f cartProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C14536a homeChipsRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C14781c orderStatusRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final zl.k featureManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C15052a homeRepository;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Yk.u couponsStateRepository;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C13702d couponsRepository;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final C18335a appPrefManager;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Dl.e deeplinkParser;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final C15053b marketingBannerRepository;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final fo.e rewardsRepository;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final wr.f cartInteractor;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final C15058b productRecommendationsRepository;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final pp.d productMetadataStore;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Ro.c productRepository;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final C16753b beaconClient;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final C17115a multiChannelProductsStateRepository;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Pj.c loadingStateManager;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _viewState;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final pv.P<ViewState> viewState;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<AbstractC11777k> _effectsFlow;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16553F<AbstractC11777k> effectsFlow;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$fetchMperks$1", f = "HomeViewModel.kt", l = {547}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class A extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f98880a;

        /* renamed from: b, reason: collision with root package name */
        Object f98881b;

        /* renamed from: c, reason: collision with root package name */
        Object f98882c;

        /* renamed from: d, reason: collision with root package name */
        Object f98883d;

        /* renamed from: e, reason: collision with root package name */
        int f98884e;

        /* renamed from: f, reason: collision with root package name */
        int f98885f;

        /* renamed from: g, reason: collision with root package name */
        int f98886g;

        /* renamed from: h, reason: collision with root package name */
        int f98887h;

        /* renamed from: i, reason: collision with root package name */
        int f98888i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f98889j;

        A(Continuation<? super A> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            A a10 = k0.this.new A(continuation);
            a10.f98889j = obj;
            return a10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((A) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            Object objF;
            Object objF2 = IntrinsicsKt.f();
            int i10 = this.f98888i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f98889j;
                    k0 k0Var = k0.this;
                    Result.Companion companion = Result.INSTANCE;
                    C15052a c15052a = k0Var.homeRepository;
                    e.C0857e c0857e = e.C0857e.f40000a;
                    this.f98889j = interfaceC15783O;
                    this.f98880a = interfaceC15783O;
                    this.f98881b = this;
                    this.f98882c = this;
                    this.f98883d = interfaceC15783O;
                    this.f98884e = 0;
                    this.f98885f = 0;
                    this.f98886g = 0;
                    this.f98887h = 0;
                    this.f98888i = 1;
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
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "Resource.Failure<mperksResource>", new Object[0]);
            }
            k0 k0Var2 = k0.this;
            if (Result.h(objB)) {
                HomeMperks homeMperks = (HomeMperks) objB;
                InterfaceC16549B interfaceC16549B = k0Var2._viewState;
                do {
                    value = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value, ViewState.b((ViewState) value, null, null, 0, null, null, false, null, null, null, null, null, null, null, HomeMperksDecorator.INSTANCE.a(homeMperks, new a.NotLoading(null, 1, null)), false, null, null, null, null, null, false, false, null, 0, null, false, 67100671, null)));
                if (k0Var2.userManager.b()) {
                    k0Var2.appPrefManager.F(true);
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$fetchMperksExpiringPoints$1", f = "HomeViewModel.kt", l = {433}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class B extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f98891a;

        /* renamed from: b, reason: collision with root package name */
        Object f98892b;

        /* renamed from: c, reason: collision with root package name */
        Object f98893c;

        /* renamed from: d, reason: collision with root package name */
        Object f98894d;

        /* renamed from: e, reason: collision with root package name */
        int f98895e;

        /* renamed from: f, reason: collision with root package name */
        int f98896f;

        /* renamed from: g, reason: collision with root package name */
        int f98897g;

        /* renamed from: h, reason: collision with root package name */
        int f98898h;

        /* renamed from: i, reason: collision with root package name */
        int f98899i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f98900j;

        B(Continuation<? super B> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            B b10 = k0.this.new B(continuation);
            b10.f98900j = obj;
            return b10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((B) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f98899i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f98900j;
                    k0 k0Var = k0.this;
                    Result.Companion companion = Result.INSTANCE;
                    fo.e eVar = k0Var.rewardsRepository;
                    this.f98900j = interfaceC15783O;
                    this.f98891a = interfaceC15783O;
                    this.f98892b = this;
                    this.f98893c = this;
                    this.f98894d = interfaceC15783O;
                    this.f98895e = 0;
                    this.f98896f = 0;
                    this.f98897g = 0;
                    this.f98898h = 0;
                    this.f98899i = 1;
                    obj = fo.e.p(eVar, 0, this, 1, null);
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
            k0 k0Var2 = k0.this;
            if (Result.h(objB)) {
                k0Var2.a1((List) objB);
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "Failed to fetch Mperks Expiring Points", new Object[0]);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$fetchPersonalizedProductCard$1", f = "HomeViewModel.kt", l = {898}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class C extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f98902a;

        /* renamed from: b, reason: collision with root package name */
        Object f98903b;

        /* renamed from: c, reason: collision with root package name */
        Object f98904c;

        /* renamed from: d, reason: collision with root package name */
        Object f98905d;

        /* renamed from: e, reason: collision with root package name */
        int f98906e;

        /* renamed from: f, reason: collision with root package name */
        int f98907f;

        /* renamed from: g, reason: collision with root package name */
        int f98908g;

        /* renamed from: h, reason: collision with root package name */
        int f98909h;

        /* renamed from: i, reason: collision with root package name */
        int f98910i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f98911j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ EnumC15218a f98913l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ e.f f98914m;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C c10 = k0.this.new C(this.f98913l, this.f98914m, continuation);
            c10.f98911j = obj;
            return c10;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C(EnumC15218a enumC15218a, e.f fVar, Continuation<? super C> continuation) {
            super(2, continuation);
            this.f98913l = enumC15218a;
            this.f98914m = fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker] */
        /* JADX WARN: Type inference failed for: r6v8 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object next;
            Object objH;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f98910i;
            int i11 = 1;
            ?? r62 = 0;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f98911j;
                    k0.this.c1(new a.Loading(null, null, 3, null), this.f98913l, this.f98914m);
                    k0 k0Var = k0.this;
                    e.f fVar = this.f98914m;
                    Result.Companion companion = Result.INSTANCE;
                    C15052a c15052a = k0Var.homeRepository;
                    this.f98911j = interfaceC15783O;
                    this.f98902a = interfaceC15783O;
                    this.f98903b = this;
                    this.f98904c = this;
                    this.f98905d = interfaceC15783O;
                    this.f98906e = 0;
                    this.f98907f = 0;
                    this.f98908g = 0;
                    this.f98909h = 0;
                    this.f98910i = 1;
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
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            k0 k0Var2 = k0.this;
            EnumC15218a enumC15218a = this.f98913l;
            e.f fVar2 = this.f98914m;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                k0Var2.c1(new a.Failed(null, null, 3, null), enumC15218a, fVar2);
                qw.a.INSTANCE.f(thE, "Failed to fetch personalized product card for " + fVar2, new Object[0]);
            }
            k0 k0Var3 = k0.this;
            EnumC15218a enumC15218a2 = this.f98913l;
            e.f fVar3 = this.f98914m;
            if (Result.h(objB)) {
                Vl.j jVar = (Vl.j) objB;
                InterfaceC16549B interfaceC16549B = k0Var3._viewState;
                while (true) {
                    Object value = interfaceC16549B.getValue();
                    ViewState viewState = (ViewState) value;
                    Map<e.f, CarouselDecorator> mapQ = viewState.q();
                    String cardTitle = jVar.getCardTitle();
                    String seeAllDeepLink = jVar.getSeeAllDeepLink();
                    if (interfaceC16549B.e(value, ViewState.b(viewState, null, null, 0, null, null, false, null, null, null, null, null, null, null, null, false, null, null, MapsKt.u(mapQ, MapsKt.g(TuplesKt.a(fVar3, new CarouselDecorator(null, fVar3.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), new a.NotLoading(r62, i11, r62), null, cardTitle, seeAllDeepLink == null ? "" : seeAllDeepLink, enumC15218a2, 9, null)))), null, null, false, false, new BeaconsTracker(jVar.getViewBeaconUrl(), jVar.getLoadBeaconUrl(), null, null, null, null, null, null, 252, null), 0, null, false, 62783487, null))) {
                        break;
                    }
                    i11 = 1;
                    r62 = 0;
                }
                String loadBeaconUrl = jVar.getLoadBeaconUrl();
                if (loadBeaconUrl == null) {
                    loadBeaconUrl = "";
                }
                Iterator<T> it = jVar.c().iterator();
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
                k0Var3.onAction(new AbstractC14072a.OnLoadBeacon(loadBeaconUrl, (nk.c) next, true, enumC15218a2));
                k0Var3.multiChannelProductsStateRepository.c(fVar3, jVar.c());
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel", f = "HomeViewModel.kt", l = {1040}, m = "fetchProductsForV3Carousel")
    static final class D extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f98915a;

        /* renamed from: b, reason: collision with root package name */
        Object f98916b;

        /* renamed from: c, reason: collision with root package name */
        Object f98917c;

        /* renamed from: d, reason: collision with root package name */
        Object f98918d;

        /* renamed from: e, reason: collision with root package name */
        Object f98919e;

        /* renamed from: f, reason: collision with root package name */
        Object f98920f;

        /* renamed from: g, reason: collision with root package name */
        int f98921g;

        /* renamed from: h, reason: collision with root package name */
        int f98922h;

        /* renamed from: i, reason: collision with root package name */
        int f98923i;

        /* renamed from: j, reason: collision with root package name */
        int f98924j;

        /* renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f98925k;

        /* renamed from: m, reason: collision with root package name */
        int f98927m;

        D(Continuation<? super D> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f98925k = obj;
            this.f98927m |= Integer.MIN_VALUE;
            return k0.this.fetchProductsForV3Carousel(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$fetchSpecialOffers$1", f = "HomeViewModel.kt", l = {608}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class E extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f98928a;

        /* renamed from: b, reason: collision with root package name */
        Object f98929b;

        /* renamed from: c, reason: collision with root package name */
        Object f98930c;

        /* renamed from: d, reason: collision with root package name */
        Object f98931d;

        /* renamed from: e, reason: collision with root package name */
        int f98932e;

        /* renamed from: f, reason: collision with root package name */
        int f98933f;

        /* renamed from: g, reason: collision with root package name */
        int f98934g;

        /* renamed from: h, reason: collision with root package name */
        int f98935h;

        /* renamed from: i, reason: collision with root package name */
        int f98936i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f98937j;

        E(Continuation<? super E> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            E e10 = k0.this.new E(continuation);
            e10.f98937j = obj;
            return e10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((E) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            ViewState viewState;
            Object objA;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f98936i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f98937j;
                    k0 k0Var = k0.this;
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC16549B interfaceC16549B = k0Var._viewState;
                    do {
                        value = interfaceC16549B.getValue();
                        viewState = (ViewState) value;
                    } while (!interfaceC16549B.e(value, ViewState.b(viewState, null, null, 0, null, null, false, SpecialOffersCarouselDecorator.b(viewState.getSpecialOffersCarouselDecorator(), null, null, null, null, null, new a.Loading(null, null, 3, null), 0, 95, null), null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, 0, null, false, 67108799, null)));
                    C15052a c15052a = k0Var.homeRepository;
                    e.b.SpecialOffers specialOffers = new e.b.SpecialOffers(0, 1, null);
                    this.f98937j = interfaceC15783O;
                    this.f98928a = interfaceC15783O;
                    this.f98929b = this;
                    this.f98930c = this;
                    this.f98931d = interfaceC15783O;
                    this.f98932e = 0;
                    this.f98933f = 0;
                    this.f98934g = 0;
                    this.f98935h = 0;
                    this.f98936i = 1;
                    objA = c15052a.a(specialOffers, this);
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
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            k0 k0Var2 = k0.this;
            if (Result.h(objB)) {
                Vl.b bVar = (Vl.b) objB;
                List<Coupon> listA = bVar != null ? bVar.a() : null;
                if (listA == null) {
                    listA = CollectionsKt.m();
                }
                k0Var2.couponsRepository.J(listA);
                k0Var2.couponsStateRepository.S(listA);
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "Failed to retrieve special offers in HomeViewModel", new Object[0]);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$fetchTipAndNotification$1", f = "HomeViewModel.kt", l = {1703, 1708}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class F extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f98939a;

        /* renamed from: b, reason: collision with root package name */
        Object f98940b;

        /* renamed from: c, reason: collision with root package name */
        Object f98941c;

        /* renamed from: d, reason: collision with root package name */
        Object f98942d;

        /* renamed from: e, reason: collision with root package name */
        int f98943e;

        /* renamed from: f, reason: collision with root package name */
        int f98944f;

        /* renamed from: g, reason: collision with root package name */
        int f98945g;

        /* renamed from: h, reason: collision with root package name */
        int f98946h;

        /* renamed from: i, reason: collision with root package name */
        int f98947i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f98948j;

        F(Continuation<? super F> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            F f10 = k0.this.new F(continuation);
            f10.f98948j = obj;
            return f10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((F) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x010e, code lost:
        
            if (r4.emit(r12, r25) == r2) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0117  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 291
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.home.ux.k0.F.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$fetchWhiteLabel$1", f = "HomeViewModel.kt", l = {1013, 1021}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class G extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f98950a;

        /* renamed from: b, reason: collision with root package name */
        Object f98951b;

        /* renamed from: c, reason: collision with root package name */
        Object f98952c;

        /* renamed from: d, reason: collision with root package name */
        Object f98953d;

        /* renamed from: e, reason: collision with root package name */
        int f98954e;

        /* renamed from: f, reason: collision with root package name */
        int f98955f;

        /* renamed from: g, reason: collision with root package name */
        int f98956g;

        /* renamed from: h, reason: collision with root package name */
        int f98957h;

        /* renamed from: i, reason: collision with root package name */
        int f98958i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f98959j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ e.f.d f98961l;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            G g10 = k0.this.new G(this.f98961l, continuation);
            g10.f98959j = obj;
            return g10;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        G(e.f.d dVar, Continuation<? super G> continuation) {
            super(2, continuation);
            this.f98961l = dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((G) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x00c4, code lost:
        
            if (r2.fetchProductsForV3Carousel(r7, r4, r10) == r0) goto L28;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v15, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, mv.O] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r10.f98958i
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                r6 = 0
                if (r1 == 0) goto L40
                if (r1 == r4) goto L26
                if (r1 != r3) goto L1e
                java.lang.Object r0 = r10.f98951b
                Vl.k r0 = (Vl.ProductCarouselV3) r0
                java.lang.Object r0 = r10.f98959j
                mv.O r0 = (mv.InterfaceC15783O) r0
                kotlin.ResultKt.b(r11)
                goto Lc7
            L1e:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L26:
                java.lang.Object r1 = r10.f98953d
                mv.O r1 = (mv.InterfaceC15783O) r1
                java.lang.Object r1 = r10.f98952c
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r1 = r10.f98951b
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r1 = r10.f98950a
                mv.O r1 = (mv.InterfaceC15783O) r1
                java.lang.Object r1 = r10.f98959j
                mv.O r1 = (mv.InterfaceC15783O) r1
                kotlin.ResultKt.b(r11)     // Catch: java.lang.Exception -> L3e
                goto L7b
            L3e:
                r11 = move-exception
                goto L80
            L40:
                kotlin.ResultKt.b(r11)
                java.lang.Object r11 = r10.f98959j
                r1 = r11
                mv.O r1 = (mv.InterfaceC15783O) r1
                com.meijer.mobile.home.ux.k0 r11 = com.meijer.mobile.home.ux.k0.this
                Pj.a$b r7 = new Pj.a$b
                r7.<init>(r6, r6, r2, r6)
                kk.a r8 = kk.EnumC15218a.f142569c
                Vl.e$f$d r9 = r10.f98961l
                com.meijer.mobile.home.ux.k0.m0(r11, r7, r8, r9)
                com.meijer.mobile.home.ux.k0 r11 = com.meijer.mobile.home.ux.k0.this
                Vl.e$f$d r7 = r10.f98961l
                kotlin.Result$Companion r8 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3e
                jm.a r11 = com.meijer.mobile.home.ux.k0.S(r11)     // Catch: java.lang.Exception -> L3e
                r10.f98959j = r1     // Catch: java.lang.Exception -> L3e
                r10.f98950a = r1     // Catch: java.lang.Exception -> L3e
                r10.f98951b = r10     // Catch: java.lang.Exception -> L3e
                r10.f98952c = r10     // Catch: java.lang.Exception -> L3e
                r10.f98953d = r1     // Catch: java.lang.Exception -> L3e
                r10.f98954e = r5     // Catch: java.lang.Exception -> L3e
                r10.f98955f = r5     // Catch: java.lang.Exception -> L3e
                r10.f98956g = r5     // Catch: java.lang.Exception -> L3e
                r10.f98957h = r5     // Catch: java.lang.Exception -> L3e
                r10.f98958i = r4     // Catch: java.lang.Exception -> L3e
                java.lang.Object r11 = r11.g(r7, r10)     // Catch: java.lang.Exception -> L3e
                if (r11 != r0) goto L7b
                goto Lc6
            L7b:
                java.lang.Object r11 = kotlin.Result.b(r11)     // Catch: java.lang.Exception -> L3e
                goto L91
            L80:
                kotlin.coroutines.CoroutineContext r4 = r10.getContext()
                mv.E0.i(r4)
                kotlin.Result$Companion r4 = kotlin.Result.INSTANCE
                java.lang.Object r11 = kotlin.ResultKt.a(r11)
                java.lang.Object r11 = kotlin.Result.b(r11)
            L91:
                com.meijer.mobile.home.ux.k0 r4 = com.meijer.mobile.home.ux.k0.this
                Vl.e$f$d r7 = r10.f98961l
                java.lang.Throwable r8 = kotlin.Result.e(r11)
                if (r8 == 0) goto La5
                Pj.a$a r8 = new Pj.a$a
                r8.<init>(r6, r6, r2, r6)
                kk.a r2 = kk.EnumC15218a.f142569c
                com.meijer.mobile.home.ux.k0.m0(r4, r8, r2, r7)
            La5:
                com.meijer.mobile.home.ux.k0 r2 = com.meijer.mobile.home.ux.k0.this
                Vl.e$f$d r4 = r10.f98961l
                boolean r7 = kotlin.Result.h(r11)
                if (r7 == 0) goto Lc7
                r7 = r11
                Vl.k r7 = (Vl.ProductCarouselV3) r7
                r10.f98959j = r1
                r10.f98950a = r11
                r10.f98951b = r7
                r10.f98952c = r6
                r10.f98953d = r6
                r10.f98954e = r5
                r10.f98958i = r3
                java.lang.Object r11 = com.meijer.mobile.home.ux.k0.J(r2, r7, r4, r10)
                if (r11 != r0) goto Lc7
            Lc6:
                return r0
            Lc7:
                kotlin.Unit r11 = kotlin.Unit.f143329a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.home.ux.k0.G.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$observeCart$1", f = "HomeViewModel.kt", l = {1846}, m = "invokeSuspend")
    static final class H extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f98962a;

        H(Continuation<? super H> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k0.this.new H(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((H) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f98962a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = k0.this._dialogFlow;
                AbstractC11776j.CartLoadFailedAlert cartLoadFailedAlert = new AbstractC11776j.CartLoadFailedAlert(yr.Q.f171738F, yr.Q.f171737E, yr.Q.f171761b);
                this.f98962a = 1;
                if (interfaceC16548A.emit(cartLoadFailedAlert, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$onAction$10", f = "HomeViewModel.kt", l = {1422}, m = "invokeSuspend")
    static final class I extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f98964a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC13720b f98966c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<String> f98967d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k0.this.new I(this.f98966c, this.f98967d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I(AbstractC13720b abstractC13720b, Ref.ObjectRef<String> objectRef, Continuation<? super I> continuation) {
            super(2, continuation);
            this.f98966c = abstractC13720b;
            this.f98967d = objectRef;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((I) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f98964a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = k0.this._effectsFlow;
                AbstractC11777k.NavigateToDepartments navigateToDepartments = new AbstractC11777k.NavigateToDepartments(((AbstractC13720b.DepartmentClicked) this.f98966c).getDeeplink(), ((AbstractC13720b.DepartmentClicked) this.f98966c).getName(), this.f98967d.f143742a, false);
                this.f98964a = 1;
                if (interfaceC16548A.emit(navigateToDepartments, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$onAction$11", f = "HomeViewModel.kt", l = {1559}, m = "invokeSuspend")
    static final class J extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f98968a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Qk.a f98970c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k0.this.new J(this.f98970c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        J(Qk.a aVar, Continuation<? super J> continuation) {
            super(2, continuation);
            this.f98970c = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((J) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f98968a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                k0 k0Var = k0.this;
                a.Clip clip = (a.Clip) this.f98970c;
                this.f98968a = 1;
                if (k0Var.X0(clip, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$onAction$12", f = "HomeViewModel.kt", l = {1564}, m = "invokeSuspend")
    static final class K extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f98971a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Qk.a f98973c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k0.this.new K(this.f98973c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        K(Qk.a aVar, Continuation<? super K> continuation) {
            super(2, continuation);
            this.f98973c = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((K) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f98971a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = k0.this._effectsFlow;
                AbstractC11777k.NavigateToCouponDetails navigateToCouponDetails = new AbstractC11777k.NavigateToCouponDetails(((a.ViewCouponDetails) this.f98973c).getCoupon(), ((a.ViewCouponDetails) this.f98973c).getTrackingData());
                this.f98971a = 1;
                if (interfaceC16548A.emit(navigateToCouponDetails, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$onAction$13", f = "HomeViewModel.kt", l = {1589}, m = "invokeSuspend")
    static final class L extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f98974a;

        L(Continuation<? super L> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k0.this.new L(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((L) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f98974a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = k0.this._effectsFlow;
                AbstractC11777k.c cVar = AbstractC11777k.c.f99131a;
                this.f98974a = 1;
                if (interfaceC16548A.emit(cVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$onAction$14", f = "HomeViewModel.kt", l = {1593}, m = "invokeSuspend")
    static final class M extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f98976a;

        M(Continuation<? super M> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k0.this.new M(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((M) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f98976a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = k0.this._effectsFlow;
                AbstractC11777k.f fVar = AbstractC11777k.f.f99136a;
                this.f98976a = 1;
                if (interfaceC16548A.emit(fVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$onAction$15", f = "HomeViewModel.kt", l = {1597}, m = "invokeSuspend")
    static final class N extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f98978a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC14021c f98980c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k0.this.new N(this.f98980c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        N(AbstractC14021c abstractC14021c, Continuation<? super N> continuation) {
            super(2, continuation);
            this.f98980c = abstractC14021c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((N) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f98978a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = k0.this._effectsFlow;
                AbstractC11777k.NavigateToMPerksRewards navigateToMPerksRewards = new AbstractC11777k.NavigateToMPerksRewards(((AbstractC14021c.RewardsMPerksClicked) this.f98980c).getRewardDescription(), ((AbstractC14021c.RewardsMPerksClicked) this.f98980c).getIsFromAvailableRewards());
                this.f98978a = 1;
                if (interfaceC16548A.emit(navigateToMPerksRewards, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$onAction$16", f = "HomeViewModel.kt", l = {1606}, m = "invokeSuspend")
    static final class O extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f98981a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC14021c f98983c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k0.this.new O(this.f98983c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        O(AbstractC14021c abstractC14021c, Continuation<? super O> continuation) {
            super(2, continuation);
            this.f98983c = abstractC14021c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((O) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f98981a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = k0.this._effectsFlow;
                AbstractC11777k.NavigateToYourRewardsMPerksDashboard navigateToYourRewardsMPerksDashboard = new AbstractC11777k.NavigateToYourRewardsMPerksDashboard(((AbstractC14021c.YourRewardsMPerksViewAllClicked) this.f98983c).getMperksDecorator().e());
                this.f98981a = 1;
                if (interfaceC16548A.emit(navigateToYourRewardsMPerksDashboard, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$onAction$17", f = "HomeViewModel.kt", l = {1629}, m = "invokeSuspend")
    static final class P extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f98984a;

        P(Continuation<? super P> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k0.this.new P(continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(TrackingData trackingData) {
            trackingData.v("home");
            trackingData.p("Special Offers: View All");
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((P) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f98984a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                k0.this.analyticsEngine.b(C14756c.h("special offers list page"), new Function1() { // from class: com.meijer.mobile.home.ux.m0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return k0.P.g((TrackingData) obj2);
                    }
                });
                InterfaceC16548A interfaceC16548A = k0.this._effectsFlow;
                AbstractC11777k.NavigateToSpecialOffers navigateToSpecialOffers = new AbstractC11777k.NavigateToSpecialOffers("Special Offers: List Page: Offer Clicked");
                this.f98984a = 1;
                if (interfaceC16548A.emit(navigateToSpecialOffers, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$onAction$20", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class Q extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f98986a;

        Q(Continuation<? super Q> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k0.this.new Q(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((Q) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f98986a == 0) {
                ResultKt.b(obj);
                InterfaceC16549B interfaceC16549B = k0.this._bottomSheetContentStateFlow;
                do {
                    value = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value, AbstractC11774h.b.f99060a));
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$onAction$21", f = "HomeViewModel.kt", l = {1808}, m = "invokeSuspend")
    static final class R extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f98988a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC11778l f98990c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        R(AbstractC11778l abstractC11778l, Continuation<? super R> continuation) {
            super(2, continuation);
            this.f98990c = abstractC11778l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k0.this.new R(this.f98990c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((R) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f98988a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = k0.this._effectsFlow;
                AbstractC11777k.ShowSubstitutionToast showSubstitutionToast = new AbstractC11777k.ShowSubstitutionToast(((AbstractC11778l.DisplaySubstitutionToast) this.f98990c).getMessageResId());
                this.f98988a = 1;
                if (interfaceC16548A.emit(showSubstitutionToast, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$onAction$22", f = "HomeViewModel.kt", l = {1820}, m = "invokeSuspend")
    static final class S extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f98991a;

        S(Continuation<? super S> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k0.this.new S(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((S) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f98991a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = k0.this._dialogFlow;
                AbstractC11776j.f fVar = AbstractC11776j.f.f99091a;
                this.f98991a = 1;
                if (interfaceC16548A.emit(fVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$onAction$23", f = "HomeViewModel.kt", l = {1827}, m = "invokeSuspend")
    static final class T extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f98993a;

        T(Continuation<? super T> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k0.this.new T(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((T) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f98993a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = k0.this._dialogFlow;
                AbstractC11776j.f fVar = AbstractC11776j.f.f99091a;
                this.f98993a = 1;
                if (interfaceC16548A.emit(fVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$onAction$5", f = "HomeViewModel.kt", l = {1358}, m = "invokeSuspend")
    static final class U extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f98995a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC13720b f98997c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<String> f98998d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k0.this.new U(this.f98997c, this.f98998d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        U(AbstractC13720b abstractC13720b, Ref.ObjectRef<String> objectRef, Continuation<? super U> continuation) {
            super(2, continuation);
            this.f98997c = abstractC13720b;
            this.f98998d = objectRef;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((U) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f98995a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = k0.this._effectsFlow;
                AbstractC11777k.NavigateToDepartments navigateToDepartments = new AbstractC11777k.NavigateToDepartments(((AbstractC13720b.ViewAll) this.f98997c).getDeeplink(), ((AbstractC13720b.ViewAll) this.f98997c).getCarouselTitle(), this.f98998d.f143742a, true);
                this.f98995a = 1;
                if (interfaceC16548A.emit(navigateToDepartments, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class V<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(((SpecialOffer) t11).getRedemptionStartDate(), ((SpecialOffer) t10).getRedemptionStartDate());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class W<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f98999a;

        public W(Comparator comparator) {
            this.f98999a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f98999a.compare(t10, t11);
            return iCompare != 0 ? iCompare : ComparisonsKt.d(Boolean.valueOf(SpecialOffer.i((SpecialOffer) t11, null, 1, null)), Boolean.valueOf(SpecialOffer.i((SpecialOffer) t10, null, 1, null)));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "LPk/a;", "", "it", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$onProductCouponButtonClicked$1", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend")
    static final class X extends SuspendLambda implements Function3<InterfaceC16562g<? super Coupon>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f99000a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f99001b;

        X(Continuation<? super X> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super Coupon> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            X x10 = new X(continuation);
            x10.f99001b = th2;
            return x10.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f99000a == 0) {
                ResultKt.b(obj);
                qw.a.INSTANCE.f((Throwable) this.f99001b, "Error clipping product coupon", new Object[0]);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPk/a;", "coupon", "", "<anonymous>", "(LPk/a;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$onProductCouponButtonClicked$2", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend")
    static final class Y extends SuspendLambda implements Function2<Coupon, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f99002a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f99003b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Pk.c f99005d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ EnumC15218a f99006e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            Y y10 = k0.this.new Y(this.f99005d, this.f99006e, continuation);
            y10.f99003b = obj;
            return y10;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Y(Pk.c cVar, EnumC15218a enumC15218a, Continuation<? super Y> continuation) {
            super(2, continuation);
            this.f99005d = cVar;
            this.f99006e = enumC15218a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Coupon coupon, Continuation<? super Unit> continuation) {
            return ((Y) create(coupon, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f99002a == 0) {
                ResultKt.b(obj);
                Coupon coupon = (Coupon) this.f99003b;
                if (coupon.x()) {
                    k0.this.onAction(new a.ViewCouponDetails(this.f99005d, null));
                } else {
                    k0 k0Var = k0.this;
                    k0Var.onAction(new a.Clip(this.f99005d, k0Var.getClipCouponTrackingData(coupon, this.f99006e)));
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$onUpdateProductEntry$1", f = "HomeViewModel.kt", l = {1262}, m = "invokeSuspend")
    static final class Z extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f99007a;

        Z(Continuation<? super Z> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k0.this.new Z(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((Z) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f99007a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = k0.this._dialogFlow;
                AbstractC11776j.LoginAlert loginAlert = new AbstractC11776j.LoginAlert(Cj.o.f5056d);
                this.f99007a = 1;
                if (interfaceC16548A.emit(loginAlert, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyo/c;", "user", "", "<anonymous>", "(Lyo/c;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$1", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.home.ux.k0$a, reason: case insensitive filesystem */
    static final class C11767a extends SuspendLambda implements Function2<MeijerUser, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f99009a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f99010b;

        C11767a(Continuation<? super C11767a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11767a c11767a = k0.this.new C11767a(continuation);
            c11767a.f99010b = obj;
            return c11767a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f99009a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            MeijerUser meijerUser = (MeijerUser) this.f99010b;
            InterfaceC16549B interfaceC16549B = k0.this._viewState;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, ViewState.b((ViewState) value, null, meijerUser, 0, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, 0, null, false, 67108861, null)));
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MeijerUser meijerUser, Continuation<? super Unit> continuation) {
            return ((C11767a) create(meijerUser, continuation)).invokeSuspend(Unit.f143329a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$processedRequest$1", f = "HomeViewModel.kt", l = {1871}, m = "invokeSuspend")
    static final class a0 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f99012a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC17454a f99014c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ uk.c<EntryChange> f99015d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k0.this.new a0(this.f99014c, this.f99015d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(AbstractC17454a abstractC17454a, uk.c<EntryChange> cVar, Continuation<? super a0> continuation) {
            super(2, continuation);
            this.f99014c = abstractC17454a;
            this.f99015d = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a0) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f99012a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                k0 k0Var = k0.this;
                AbstractC17454a abstractC17454a = this.f99014c;
                uk.c<EntryChange> cVar = this.f99015d;
                String productCode = abstractC17454a.getProductCode();
                this.f99012a = 1;
                if (k0Var.addCartEntry(abstractC17454a, cVar, productCode, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "count", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$2", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.home.ux.k0$b, reason: case insensitive filesystem */
    static final class C11768b extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f99016a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ int f99017b;

        C11768b(Continuation<? super C11768b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11768b c11768b = k0.this.new C11768b(continuation);
            c11768b.f99017b = ((Number) obj).intValue();
            return c11768b;
        }

        public final Object d(int i10, Continuation<? super Unit> continuation) {
            return ((C11768b) create(Integer.valueOf(i10), continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return d(num.intValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f99016a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            int i10 = this.f99017b;
            InterfaceC16549B interfaceC16549B = k0.this._viewState;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, ViewState.b((ViewState) value, null, null, i10, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, 0, null, false, 67108859, null)));
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$processedRequest$2", f = "HomeViewModel.kt", l = {1879}, m = "invokeSuspend")
    static final class b0 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f99019a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC17454a f99021c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ uk.c<EntryChange> f99022d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k0.this.new b0(this.f99021c, this.f99022d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(AbstractC17454a abstractC17454a, uk.c<EntryChange> cVar, Continuation<? super b0> continuation) {
            super(2, continuation);
            this.f99021c = abstractC17454a;
            this.f99022d = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b0) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f99019a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                k0 k0Var = k0.this;
                AbstractC17454a abstractC17454a = this.f99021c;
                uk.c<EntryChange> cVar = this.f99022d;
                String productCode = abstractC17454a.getProductCode();
                this.f99019a = 1;
                if (k0Var.updateCartEntry(abstractC17454a, cVar, productCode, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lhm/b;", "chips", "", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$3", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.home.ux.k0$c, reason: case insensitive filesystem */
    static final class C11769c extends SuspendLambda implements Function2<List<? extends AbstractC14537b>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f99023a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f99024b;

        C11769c(Continuation<? super C11769c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11769c c11769c = k0.this.new C11769c(continuation);
            c11769c.f99024b = obj;
            return c11769c;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<? extends AbstractC14537b> list, Continuation<? super Unit> continuation) {
            return ((C11769c) create(list, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            IntrinsicsKt.f();
            if (this.f99023a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            List list = (List) this.f99024b;
            InterfaceC16549B interfaceC16549B = k0.this._viewState;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, ViewState.b((ViewState) value, null, null, 0, list, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, 0, null, false, 67108855, null)));
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$processedRequest$3", f = "HomeViewModel.kt", l = {1887}, m = "invokeSuspend")
    static final class c0 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f99026a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC17454a f99028c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ uk.c<EntryChange> f99029d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k0.this.new c0(this.f99028c, this.f99029d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(AbstractC17454a abstractC17454a, uk.c<EntryChange> cVar, Continuation<? super c0> continuation) {
            super(2, continuation);
            this.f99028c = abstractC17454a;
            this.f99029d = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c0) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f99026a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                k0 k0Var = k0.this;
                AbstractC17454a abstractC17454a = this.f99028c;
                uk.c<EntryChange> cVar = this.f99029d;
                String productCode = abstractC17454a.getProductCode();
                this.f99026a = 1;
                if (k0Var.removeCartEntry(abstractC17454a, cVar, productCode, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lpv/g;", "", "LYk/c;", "", "it", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$4", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.home.ux.k0$d, reason: case insensitive filesystem */
    static final class C11770d extends SuspendLambda implements Function3<InterfaceC16562g<? super List<? extends CouponState>>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f99030a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f99031b;

        C11770d(Continuation<? super C11770d> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super List<CouponState>> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            C11770d c11770d = new C11770d(continuation);
            c11770d.f99031b = th2;
            return c11770d.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f99030a == 0) {
                ResultKt.b(obj);
                qw.a.INSTANCE.f((Throwable) this.f99031b, "Error fetching coupon state", new Object[0]);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$reload$2", f = "HomeViewModel.kt", l = {334}, m = "invokeSuspend")
    static final class d0 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f99032a;

        d0(Continuation<? super d0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k0.this.new d0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d0) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f99032a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C14536a c14536a = k0.this.homeChipsRepository;
                this.f99032a = 1;
                if (c14536a.d(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.home.ux.k0$e, reason: case insensitive filesystem */
    /* synthetic */ class C11771e extends AdaptedFunctionReference implements Function2<List<? extends CouponState>, Continuation<? super Unit>, Object>, SuspendFunction {
        C11771e(Object obj) {
            super(2, obj, k0.class, "onCouponState", "onCouponState(Ljava/util/List;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<CouponState> list, Continuation<? super Unit> continuation) {
            return k0.D((k0) this.f143708a, list, continuation);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$reload$3", f = "HomeViewModel.kt", l = {335}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class e0 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f99034a;

        /* renamed from: b, reason: collision with root package name */
        Object f99035b;

        /* renamed from: c, reason: collision with root package name */
        Object f99036c;

        /* renamed from: d, reason: collision with root package name */
        Object f99037d;

        /* renamed from: e, reason: collision with root package name */
        int f99038e;

        /* renamed from: f, reason: collision with root package name */
        int f99039f;

        /* renamed from: g, reason: collision with root package name */
        int f99040g;

        /* renamed from: h, reason: collision with root package name */
        int f99041h;

        /* renamed from: i, reason: collision with root package name */
        int f99042i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f99043j;

        e0(Continuation<? super e0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e0 e0Var = k0.this.new e0(continuation);
            e0Var.f99043j = obj;
            return e0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e0) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f99042i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f99043j;
                    k0 k0Var = k0.this;
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC14774f interfaceC14774f = k0Var.cartProvider;
                    this.f99043j = interfaceC15783O;
                    this.f99034a = interfaceC15783O;
                    this.f99035b = this;
                    this.f99036c = this;
                    this.f99037d = interfaceC15783O;
                    this.f99038e = 0;
                    this.f99039f = 0;
                    this.f99040g = 0;
                    this.f99041h = 0;
                    this.f99042i = 1;
                    if (InterfaceC14774f.e(interfaceC14774f, false, false, this, 3, null) == objF) {
                        return objF;
                    }
                }
                Result.b(Unit.f143329a);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                Result.b(ResultKt.a(e10));
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.home.ux.k0$f, reason: case insensitive filesystem */
    /* synthetic */ class C11772f extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C11772f(Object obj) {
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
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$reload$5", f = "HomeViewModel.kt", l = {345}, m = "invokeSuspend")
    static final class f0 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f99045a;

        f0(Continuation<? super f0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k0.this.new f0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f0) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f99045a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                k0 k0Var = k0.this;
                this.f99045a = 1;
                if (k0Var.o0(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$g;", "", "<init>", "()V", "a", "Lcom/meijer/mobile/home/ux/k0$g$a;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.home.ux.k0$g, reason: case insensitive filesystem */
    public static abstract class AbstractC11773g {

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u001b\u0010\u0006\u001a\u00060\u0002j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$g$a;", "Lcom/meijer/mobile/home/ux/k0$g;", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "Lcom/meijer/mobile/core/model/common/ExternalShopperId;", "externalShopperId", "", "navigateToTipActivity", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Z", "()Z", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.home.ux.k0$g$a, reason: from toString */
        public static final /* data */ class UpdateRateAndTipNotification extends AbstractC11773g {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String orderId;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String externalShopperId;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean navigateToTipActivity;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateRateAndTipNotification)) {
                    return false;
                }
                UpdateRateAndTipNotification updateRateAndTipNotification = (UpdateRateAndTipNotification) other;
                return Intrinsics.e(this.orderId, updateRateAndTipNotification.orderId) && Intrinsics.e(this.externalShopperId, updateRateAndTipNotification.externalShopperId) && this.navigateToTipActivity == updateRateAndTipNotification.navigateToTipActivity;
            }

            public int hashCode() {
                String str = this.orderId;
                return ((((str == null ? 0 : str.hashCode()) * 31) + this.externalShopperId.hashCode()) * 31) + Boolean.hashCode(this.navigateToTipActivity);
            }

            public String toString() {
                return "UpdateRateAndTipNotification(orderId=" + this.orderId + ", externalShopperId=" + this.externalShopperId + ", navigateToTipActivity=" + this.navigateToTipActivity + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateRateAndTipNotification(String str, String externalShopperId, boolean z10) {
                super(null);
                Intrinsics.j(externalShopperId, "externalShopperId");
                this.orderId = str;
                this.externalShopperId = externalShopperId;
                this.navigateToTipActivity = z10;
            }

            /* renamed from: a, reason: from getter */
            public final String getExternalShopperId() {
                return this.externalShopperId;
            }

            /* renamed from: b, reason: from getter */
            public final boolean getNavigateToTipActivity() {
                return this.navigateToTipActivity;
            }

            /* renamed from: c, reason: from getter */
            public final String getOrderId() {
                return this.orderId;
            }
        }

        public /* synthetic */ AbstractC11773g(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC11773g() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel", f = "HomeViewModel.kt", l = {2098, 2107}, m = "removeCartEntry")
    static final class g0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f99050a;

        /* renamed from: b, reason: collision with root package name */
        Object f99051b;

        /* renamed from: c, reason: collision with root package name */
        Object f99052c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f99053d;

        /* renamed from: f, reason: collision with root package name */
        int f99055f;

        g0(Continuation<? super g0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f99053d = obj;
            this.f99055f |= Integer.MIN_VALUE;
            return k0.this.removeCartEntry(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$h;", "", "<init>", "()V", "a", "b", "Lcom/meijer/mobile/home/ux/k0$h$a;", "Lcom/meijer/mobile/home/ux/k0$h$b;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.home.ux.k0$h, reason: case insensitive filesystem */
    public static abstract class AbstractC11774h {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$h$a;", "Lcom/meijer/mobile/home/ux/k0$h;", "", "expiringPoints", "Lbk/a;", "expirationDate", "daysLeftForPointsToExpire", "<init>", "(ILbk/a;Lbk/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Lbk/a;", "()Lbk/a;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.home.ux.k0$h$a, reason: from toString */
        public static final /* data */ class MperksPointsExpiryBottomSheet extends AbstractC11774h {

            /* renamed from: d, reason: collision with root package name */
            public static final int f99056d = AbstractC6392a.f60445b;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int expiringPoints;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC6392a expirationDate;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC6392a daysLeftForPointsToExpire;

            public MperksPointsExpiryBottomSheet(int i10, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2) {
                super(null);
                this.expiringPoints = i10;
                this.expirationDate = abstractC6392a;
                this.daysLeftForPointsToExpire = abstractC6392a2;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MperksPointsExpiryBottomSheet)) {
                    return false;
                }
                MperksPointsExpiryBottomSheet mperksPointsExpiryBottomSheet = (MperksPointsExpiryBottomSheet) other;
                return this.expiringPoints == mperksPointsExpiryBottomSheet.expiringPoints && Intrinsics.e(this.expirationDate, mperksPointsExpiryBottomSheet.expirationDate) && Intrinsics.e(this.daysLeftForPointsToExpire, mperksPointsExpiryBottomSheet.daysLeftForPointsToExpire);
            }

            public int hashCode() {
                int iHashCode = Integer.hashCode(this.expiringPoints) * 31;
                AbstractC6392a abstractC6392a = this.expirationDate;
                int iHashCode2 = (iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31;
                AbstractC6392a abstractC6392a2 = this.daysLeftForPointsToExpire;
                return iHashCode2 + (abstractC6392a2 != null ? abstractC6392a2.hashCode() : 0);
            }

            public String toString() {
                return "MperksPointsExpiryBottomSheet(expiringPoints=" + this.expiringPoints + ", expirationDate=" + this.expirationDate + ", daysLeftForPointsToExpire=" + this.daysLeftForPointsToExpire + ')';
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC6392a getDaysLeftForPointsToExpire() {
                return this.daysLeftForPointsToExpire;
            }

            /* renamed from: b, reason: from getter */
            public final AbstractC6392a getExpirationDate() {
                return this.expirationDate;
            }

            /* renamed from: c, reason: from getter */
            public final int getExpiringPoints() {
                return this.expiringPoints;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$h$b;", "Lcom/meijer/mobile/home/ux/k0$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.home.ux.k0$h$b */
        public static final /* data */ class b extends AbstractC11774h {

            /* renamed from: a, reason: collision with root package name */
            public static final b f99060a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1511883952;
            }

            public String toString() {
                return "None";
            }
        }

        public /* synthetic */ AbstractC11774h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC11774h() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel", f = "HomeViewModel.kt", l = {1437, 1438}, m = "safeClipCoupon")
    static final class h0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f99061a;

        /* renamed from: b, reason: collision with root package name */
        Object f99062b;

        /* renamed from: c, reason: collision with root package name */
        Object f99063c;

        /* renamed from: d, reason: collision with root package name */
        Object f99064d;

        /* renamed from: e, reason: collision with root package name */
        Object f99065e;

        /* renamed from: f, reason: collision with root package name */
        int f99066f;

        /* renamed from: g, reason: collision with root package name */
        int f99067g;

        /* renamed from: h, reason: collision with root package name */
        int f99068h;

        /* renamed from: i, reason: collision with root package name */
        int f99069i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f99070j;

        /* renamed from: l, reason: collision with root package name */
        int f99072l;

        h0(Continuation<? super h0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f99070j = obj;
            this.f99072l |= Integer.MIN_VALUE;
            return k0.this.X0(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$sendBeaconToastMessage$1", f = "HomeViewModel.kt", l = {1547}, m = "invokeSuspend")
    static final class i0 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f99073a;

        /* renamed from: b, reason: collision with root package name */
        int f99074b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f99075c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k0 f99076d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Ul.a f99077e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ nk.c f99078f;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new i0(this.f99075c, this.f99076d, this.f99077e, this.f99078f, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i0(boolean z10, k0 k0Var, Ul.a aVar, nk.c cVar, Continuation<? super i0> continuation) {
            super(2, continuation);
            this.f99075c = z10;
            this.f99076d = k0Var;
            this.f99077e = aVar;
            this.f99078f = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((i0) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            String displayName;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f99074b;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                if (this.f99075c) {
                    str = "Format Level";
                } else {
                    str = "Sku level";
                }
                InterfaceC16548A interfaceC16548A = this.f99076d._toastMessageData;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(' ');
                Ul.a aVar = this.f99077e;
                if (aVar != null) {
                    displayName = aVar.getDisplayName();
                } else {
                    displayName = null;
                }
                sb2.append(displayName);
                sb2.append(" Beacon sent successfully!");
                ToastMessageData toastMessageData = new ToastMessageData(sb2.toString(), this.f99078f);
                this.f99073a = str;
                this.f99074b = 1;
                if (interfaceC16548A.emit(toastMessageData, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$j;", "", "<init>", "()V", "c", "e", "d", "j", "h", "i", "g", "a", "b", "f", "Lcom/meijer/mobile/home/ux/k0$j$a;", "Lcom/meijer/mobile/home/ux/k0$j$b;", "Lcom/meijer/mobile/home/ux/k0$j$c;", "Lcom/meijer/mobile/home/ux/k0$j$d;", "Lcom/meijer/mobile/home/ux/k0$j$e;", "Lcom/meijer/mobile/home/ux/k0$j$f;", "Lcom/meijer/mobile/home/ux/k0$j$g;", "Lcom/meijer/mobile/home/ux/k0$j$h;", "Lcom/meijer/mobile/home/ux/k0$j$i;", "Lcom/meijer/mobile/home/ux/k0$j$j;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.home.ux.k0$j, reason: case insensitive filesystem */
    public static abstract class AbstractC11776j {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$j$a;", "Lcom/meijer/mobile/home/ux/k0$j;", "", "title", "message", "positiveButtonText", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.home.ux.k0$j$a, reason: from toString */
        public static final /* data */ class CartLoadFailedAlert extends AbstractC11776j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int title;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int message;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int positiveButtonText;

            public CartLoadFailedAlert(int i10, int i11, int i12) {
                super(null);
                this.title = i10;
                this.message = i11;
                this.positiveButtonText = i12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CartLoadFailedAlert)) {
                    return false;
                }
                CartLoadFailedAlert cartLoadFailedAlert = (CartLoadFailedAlert) other;
                return this.title == cartLoadFailedAlert.title && this.message == cartLoadFailedAlert.message && this.positiveButtonText == cartLoadFailedAlert.positiveButtonText;
            }

            public int hashCode() {
                return (((Integer.hashCode(this.title) * 31) + Integer.hashCode(this.message)) * 31) + Integer.hashCode(this.positiveButtonText);
            }

            public String toString() {
                return "CartLoadFailedAlert(title=" + this.title + ", message=" + this.message + ", positiveButtonText=" + this.positiveButtonText + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getMessage() {
                return this.message;
            }

            /* renamed from: b, reason: from getter */
            public final int getPositiveButtonText() {
                return this.positiveButtonText;
            }

            /* renamed from: c, reason: from getter */
            public final int getTitle() {
                return this.title;
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$j$b;", "Lcom/meijer/mobile/home/ux/k0$j;", "LIr/a;", "Lur/a;", "dialogInfo", "<init>", "(LIr/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIr/a;", "()LIr/a;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.home.ux.k0$j$b, reason: from toString */
        public static final /* data */ class ChokeWarningAlert extends AbstractC11776j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final UserActionDialogInfo<AbstractC17454a> dialogInfo;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ChokeWarningAlert) && Intrinsics.e(this.dialogInfo, ((ChokeWarningAlert) other).dialogInfo);
            }

            public int hashCode() {
                return this.dialogInfo.hashCode();
            }

            public String toString() {
                return "ChokeWarningAlert(dialogInfo=" + this.dialogInfo + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ChokeWarningAlert(UserActionDialogInfo<AbstractC17454a> dialogInfo) {
                super(null);
                Intrinsics.j(dialogInfo, "dialogInfo");
                this.dialogInfo = dialogInfo;
            }

            public final UserActionDialogInfo<AbstractC17454a> a() {
                return this.dialogInfo;
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u0017\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, d2 = {"Lcom/meijer/mobile/home/ux/k0$j$c;", "Lcom/meijer/mobile/home/ux/k0$j;", "", "titleResId", "messageResId", "positiveButtonResId", "negativeButtonResId", "LPk/a;", "coupon", "Lii/f;", "trackingData", "<init>", "(IIIILPk/a;Lii/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "e", "b", "c", "d", "LPk/a;", "()LPk/a;", "f", "Lii/f;", "()Lii/f;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.home.ux.k0$j$c, reason: from toString */
        public static final /* data */ class ClipCouponFailedAlert extends AbstractC11776j {

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

            /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final TrackingData trackingData;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ClipCouponFailedAlert)) {
                    return false;
                }
                ClipCouponFailedAlert clipCouponFailedAlert = (ClipCouponFailedAlert) other;
                return this.titleResId == clipCouponFailedAlert.titleResId && this.messageResId == clipCouponFailedAlert.messageResId && this.positiveButtonResId == clipCouponFailedAlert.positiveButtonResId && this.negativeButtonResId == clipCouponFailedAlert.negativeButtonResId && Intrinsics.e(this.coupon, clipCouponFailedAlert.coupon) && Intrinsics.e(this.trackingData, clipCouponFailedAlert.trackingData);
            }

            public int hashCode() {
                int iHashCode = ((((((((Integer.hashCode(this.titleResId) * 31) + Integer.hashCode(this.messageResId)) * 31) + Integer.hashCode(this.positiveButtonResId)) * 31) + Integer.hashCode(this.negativeButtonResId)) * 31) + this.coupon.hashCode()) * 31;
                TrackingData trackingData = this.trackingData;
                return iHashCode + (trackingData == null ? 0 : trackingData.hashCode());
            }

            public String toString() {
                return "ClipCouponFailedAlert(titleResId=" + this.titleResId + ", messageResId=" + this.messageResId + ", positiveButtonResId=" + this.positiveButtonResId + ", negativeButtonResId=" + this.negativeButtonResId + ", coupon=" + this.coupon + ", trackingData=" + this.trackingData + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ClipCouponFailedAlert(int i10, int i11, int i12, int i13, Coupon coupon, TrackingData trackingData) {
                super(null);
                Intrinsics.j(coupon, "coupon");
                this.titleResId = i10;
                this.messageResId = i11;
                this.positiveButtonResId = i12;
                this.negativeButtonResId = i13;
                this.coupon = coupon;
                this.trackingData = trackingData;
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

            /* renamed from: f, reason: from getter */
            public final TrackingData getTrackingData() {
                return this.trackingData;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$j$d;", "Lcom/meijer/mobile/home/ux/k0$j;", "", "messageResId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.home.ux.k0$j$d, reason: from toString */
        public static final /* data */ class LoginAlert extends AbstractC11776j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            public LoginAlert(int i10) {
                super(null);
                this.messageResId = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof LoginAlert) && this.messageResId == ((LoginAlert) other).messageResId;
            }

            public int hashCode() {
                return Integer.hashCode(this.messageResId);
            }

            public String toString() {
                return "LoginAlert(messageResId=" + this.messageResId + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$j$e;", "Lcom/meijer/mobile/home/ux/k0$j;", "", "deeplinkCode", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.home.ux.k0$j$e, reason: from toString */
        public static final /* data */ class NoStoreAlert extends AbstractC11776j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int deeplinkCode;

            public NoStoreAlert(int i10) {
                super(null);
                this.deeplinkCode = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NoStoreAlert) && this.deeplinkCode == ((NoStoreAlert) other).deeplinkCode;
            }

            public int hashCode() {
                return Integer.hashCode(this.deeplinkCode);
            }

            public String toString() {
                return "NoStoreAlert(deeplinkCode=" + this.deeplinkCode + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getDeeplinkCode() {
                return this.deeplinkCode;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$j$f;", "Lcom/meijer/mobile/home/ux/k0$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.home.ux.k0$j$f */
        public static final /* data */ class f extends AbstractC11776j {

            /* renamed from: a, reason: collision with root package name */
            public static final f f99091a = new f();

            private f() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof f);
            }

            public int hashCode() {
                return 638017832;
            }

            public String toString() {
                return "None";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$j$g;", "Lcom/meijer/mobile/home/ux/k0$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.home.ux.k0$j$g */
        public static final /* data */ class g extends AbstractC11776j {

            /* renamed from: a, reason: collision with root package name */
            public static final g f99092a = new g();

            private g() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof g);
            }

            public int hashCode() {
                return 325766981;
            }

            public String toString() {
                return "NotificationPermissionDenied";
            }
        }

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\n\u0010\b\u001a\u00060\u0004j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u000eR\u001b\u0010\b\u001a\u00060\u0004j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$j$h;", "Lcom/meijer/mobile/home/ux/k0$j;", "Lbk/a;", "title", "", "Lcom/meijer/mobile/core/model/common/ExternalShopperId;", "externalShopperId", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "Ltp/b;", "rateAndTipBuilder", "<init>", "(Lbk/a;Ljava/lang/String;Ljava/lang/String;Ltp/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbk/a;", "c", "()Lbk/a;", "b", "Ljava/lang/String;", "d", "Ltp/b;", "getRateAndTipBuilder", "()Ltp/b;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.home.ux.k0$j$h, reason: from toString */
        public static final /* data */ class RateAndTipAlert extends AbstractC11776j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC6392a title;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String externalShopperId;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String orderId;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Builder rateAndTipBuilder;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RateAndTipAlert)) {
                    return false;
                }
                RateAndTipAlert rateAndTipAlert = (RateAndTipAlert) other;
                return Intrinsics.e(this.title, rateAndTipAlert.title) && Intrinsics.e(this.externalShopperId, rateAndTipAlert.externalShopperId) && Intrinsics.e(this.orderId, rateAndTipAlert.orderId) && Intrinsics.e(this.rateAndTipBuilder, rateAndTipAlert.rateAndTipBuilder);
            }

            public int hashCode() {
                return (((((this.title.hashCode() * 31) + this.externalShopperId.hashCode()) * 31) + this.orderId.hashCode()) * 31) + this.rateAndTipBuilder.hashCode();
            }

            public String toString() {
                return "RateAndTipAlert(title=" + this.title + ", externalShopperId=" + this.externalShopperId + ", orderId=" + this.orderId + ", rateAndTipBuilder=" + this.rateAndTipBuilder + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RateAndTipAlert(AbstractC6392a title, String externalShopperId, String orderId, Builder rateAndTipBuilder) {
                super(null);
                Intrinsics.j(title, "title");
                Intrinsics.j(externalShopperId, "externalShopperId");
                Intrinsics.j(orderId, "orderId");
                Intrinsics.j(rateAndTipBuilder, "rateAndTipBuilder");
                this.title = title;
                this.externalShopperId = externalShopperId;
                this.orderId = orderId;
                this.rateAndTipBuilder = rateAndTipBuilder;
            }

            /* renamed from: a, reason: from getter */
            public final String getExternalShopperId() {
                return this.externalShopperId;
            }

            /* renamed from: b, reason: from getter */
            public final String getOrderId() {
                return this.orderId;
            }

            /* renamed from: c, reason: from getter */
            public final AbstractC6392a getTitle() {
                return this.title;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$j$i;", "Lcom/meijer/mobile/home/ux/k0$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.home.ux.k0$j$i */
        public static final /* data */ class i extends AbstractC11776j {

            /* renamed from: a, reason: collision with root package name */
            public static final i f99097a = new i();

            private i() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof i);
            }

            public int hashCode() {
                return 2065398339;
            }

            public String toString() {
                return "RequestNotificationPermissionAlert";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$j$j;", "Lcom/meijer/mobile/home/ux/k0$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.home.ux.k0$j$j, reason: collision with other inner class name */
        public static final /* data */ class C1406j extends AbstractC11776j {

            /* renamed from: a, reason: collision with root package name */
            public static final C1406j f99098a = new C1406j();

            private C1406j() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1406j);
            }

            public int hashCode() {
                return -1470426158;
            }

            public String toString() {
                return "TeachersListLoginAlert";
            }
        }

        public /* synthetic */ AbstractC11776j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC11776j() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$sendCriteoBeacon$1", f = "HomeViewModel.kt", l = {1082}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class j0 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f99099a;

        /* renamed from: b, reason: collision with root package name */
        Object f99100b;

        /* renamed from: c, reason: collision with root package name */
        Object f99101c;

        /* renamed from: d, reason: collision with root package name */
        Object f99102d;

        /* renamed from: e, reason: collision with root package name */
        Object f99103e;

        /* renamed from: f, reason: collision with root package name */
        Object f99104f;

        /* renamed from: g, reason: collision with root package name */
        Object f99105g;

        /* renamed from: h, reason: collision with root package name */
        Object f99106h;

        /* renamed from: i, reason: collision with root package name */
        Object f99107i;

        /* renamed from: j, reason: collision with root package name */
        Object f99108j;

        /* renamed from: k, reason: collision with root package name */
        Object f99109k;

        /* renamed from: l, reason: collision with root package name */
        Object f99110l;

        /* renamed from: m, reason: collision with root package name */
        boolean f99111m;

        /* renamed from: n, reason: collision with root package name */
        int f99112n;

        /* renamed from: o, reason: collision with root package name */
        int f99113o;

        /* renamed from: p, reason: collision with root package name */
        int f99114p;

        /* renamed from: q, reason: collision with root package name */
        int f99115q;

        /* renamed from: r, reason: collision with root package name */
        int f99116r;

        /* renamed from: s, reason: collision with root package name */
        int f99117s;

        /* renamed from: t, reason: collision with root package name */
        int f99118t;

        /* renamed from: u, reason: collision with root package name */
        private /* synthetic */ Object f99119u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ List<String> f99120v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ boolean f99121w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ Ul.a f99122x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ EnumC15218a f99123y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ k0 f99124z;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            j0 j0Var = new j0(this.f99120v, this.f99121w, this.f99122x, this.f99123y, this.f99124z, continuation);
            j0Var.f99119u = obj;
            return j0Var;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j0(List<String> list, boolean z10, Ul.a aVar, EnumC15218a enumC15218a, k0 k0Var, Continuation<? super j0> continuation) {
            super(2, continuation);
            this.f99120v = list;
            this.f99121w = z10;
            this.f99122x = aVar;
            this.f99123y = enumC15218a;
            this.f99124z = k0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((j0) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.home.ux.k0.j0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$k;", "", "<init>", "()V", "b", "g", "a", "h", "d", "f", "i", "c", "e", "l", "k", "j", "Lcom/meijer/mobile/home/ux/k0$k$a;", "Lcom/meijer/mobile/home/ux/k0$k$b;", "Lcom/meijer/mobile/home/ux/k0$k$c;", "Lcom/meijer/mobile/home/ux/k0$k$d;", "Lcom/meijer/mobile/home/ux/k0$k$e;", "Lcom/meijer/mobile/home/ux/k0$k$f;", "Lcom/meijer/mobile/home/ux/k0$k$g;", "Lcom/meijer/mobile/home/ux/k0$k$h;", "Lcom/meijer/mobile/home/ux/k0$k$i;", "Lcom/meijer/mobile/home/ux/k0$k$j;", "Lcom/meijer/mobile/home/ux/k0$k$k;", "Lcom/meijer/mobile/home/ux/k0$k$l;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.home.ux.k0$k, reason: case insensitive filesystem */
    public static abstract class AbstractC11777k {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$k$a;", "Lcom/meijer/mobile/home/ux/k0$k;", "LPk/c;", "coupon", "Lii/f;", "trackingData", "<init>", "(LPk/c;Lii/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LPk/c;", "()LPk/c;", "b", "Lii/f;", "()Lii/f;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.home.ux.k0$k$a, reason: from toString */
        public static final /* data */ class NavigateToCouponDetails extends AbstractC11777k {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Pk.c coupon;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final TrackingData trackingData;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NavigateToCouponDetails)) {
                    return false;
                }
                NavigateToCouponDetails navigateToCouponDetails = (NavigateToCouponDetails) other;
                return Intrinsics.e(this.coupon, navigateToCouponDetails.coupon) && Intrinsics.e(this.trackingData, navigateToCouponDetails.trackingData);
            }

            public int hashCode() {
                int iHashCode = this.coupon.hashCode() * 31;
                TrackingData trackingData = this.trackingData;
                return iHashCode + (trackingData == null ? 0 : trackingData.hashCode());
            }

            public String toString() {
                return "NavigateToCouponDetails(coupon=" + this.coupon + ", trackingData=" + this.trackingData + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToCouponDetails(Pk.c coupon, TrackingData trackingData) {
                super(null);
                Intrinsics.j(coupon, "coupon");
                this.coupon = coupon;
                this.trackingData = trackingData;
            }

            /* renamed from: a, reason: from getter */
            public final Pk.c getCoupon() {
                return this.coupon;
            }

            /* renamed from: b, reason: from getter */
            public final TrackingData getTrackingData() {
                return this.trackingData;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$k$b;", "Lcom/meijer/mobile/home/ux/k0$k;", "", "deeplink", "name", "analytics", "", "isFromViewAll", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "Z", "()Z", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.home.ux.k0$k$b, reason: from toString */
        public static final /* data */ class NavigateToDepartments extends AbstractC11777k {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String deeplink;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String name;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String analytics;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isFromViewAll;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NavigateToDepartments)) {
                    return false;
                }
                NavigateToDepartments navigateToDepartments = (NavigateToDepartments) other;
                return Intrinsics.e(this.deeplink, navigateToDepartments.deeplink) && Intrinsics.e(this.name, navigateToDepartments.name) && Intrinsics.e(this.analytics, navigateToDepartments.analytics) && this.isFromViewAll == navigateToDepartments.isFromViewAll;
            }

            public int hashCode() {
                int iHashCode = ((this.deeplink.hashCode() * 31) + this.name.hashCode()) * 31;
                String str = this.analytics;
                return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isFromViewAll);
            }

            public String toString() {
                return "NavigateToDepartments(deeplink=" + this.deeplink + ", name=" + this.name + ", analytics=" + this.analytics + ", isFromViewAll=" + this.isFromViewAll + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToDepartments(String deeplink, String name, String str, boolean z10) {
                super(null);
                Intrinsics.j(deeplink, "deeplink");
                Intrinsics.j(name, "name");
                this.deeplink = deeplink;
                this.name = name;
                this.analytics = str;
                this.isFromViewAll = z10;
            }

            /* renamed from: a, reason: from getter */
            public final String getAnalytics() {
                return this.analytics;
            }

            /* renamed from: b, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            /* renamed from: c, reason: from getter */
            public final String getName() {
                return this.name;
            }

            /* renamed from: d, reason: from getter */
            public final boolean getIsFromViewAll() {
                return this.isFromViewAll;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$k$c;", "Lcom/meijer/mobile/home/ux/k0$k;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.home.ux.k0$k$c */
        public static final /* data */ class c extends AbstractC11777k {

            /* renamed from: a, reason: collision with root package name */
            public static final c f99131a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -1252558037;
            }

            public String toString() {
                return "NavigateToLearnMore";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$k$d;", "Lcom/meijer/mobile/home/ux/k0$k;", "Lco/k;", "rewardDescription", "", "isFromAvailableRewards", "<init>", "(Lco/k;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lco/k;", "()Lco/k;", "b", "Z", "()Z", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.home.ux.k0$k$d, reason: from toString */
        public static final /* data */ class NavigateToMPerksRewards extends AbstractC11777k {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final RewardDetail rewardDescription;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isFromAvailableRewards;

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

            /* renamed from: a, reason: from getter */
            public final RewardDetail getRewardDescription() {
                return this.rewardDescription;
            }

            /* renamed from: b, reason: from getter */
            public final boolean getIsFromAvailableRewards() {
                return this.isFromAvailableRewards;
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$k$e;", "Lcom/meijer/mobile/home/ux/k0$k;", "Ltp/b;", "builder", "Ltp/a;", "flowType", "<init>", "(Ltp/b;Ltp/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltp/b;", "()Ltp/b;", "b", "Ltp/a;", "()Ltp/a;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.home.ux.k0$k$e, reason: from toString */
        public static final /* data */ class NavigateToRateAndTip extends AbstractC11777k {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Builder builder;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final EnumC17276a flowType;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NavigateToRateAndTip)) {
                    return false;
                }
                NavigateToRateAndTip navigateToRateAndTip = (NavigateToRateAndTip) other;
                return Intrinsics.e(this.builder, navigateToRateAndTip.builder) && this.flowType == navigateToRateAndTip.flowType;
            }

            public int hashCode() {
                return (this.builder.hashCode() * 31) + this.flowType.hashCode();
            }

            public String toString() {
                return "NavigateToRateAndTip(builder=" + this.builder + ", flowType=" + this.flowType + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToRateAndTip(Builder builder, EnumC17276a flowType) {
                super(null);
                Intrinsics.j(builder, "builder");
                Intrinsics.j(flowType, "flowType");
                this.builder = builder;
                this.flowType = flowType;
            }

            /* renamed from: a, reason: from getter */
            public final Builder getBuilder() {
                return this.builder;
            }

            /* renamed from: b, reason: from getter */
            public final EnumC17276a getFlowType() {
                return this.flowType;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$k$f;", "Lcom/meijer/mobile/home/ux/k0$k;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.home.ux.k0$k$f */
        public static final /* data */ class f extends AbstractC11777k {

            /* renamed from: a, reason: collision with root package name */
            public static final f f99136a = new f();

            private f() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof f);
            }

            public int hashCode() {
                return 880590290;
            }

            public String toString() {
                return "NavigateToRedeemMPerksDashboard";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$k$g;", "Lcom/meijer/mobile/home/ux/k0$k;", "", "previousTrackAction", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.home.ux.k0$k$g, reason: from toString */
        public static final /* data */ class NavigateToSpecialOffers extends AbstractC11777k {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String previousTrackAction;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NavigateToSpecialOffers) && Intrinsics.e(this.previousTrackAction, ((NavigateToSpecialOffers) other).previousTrackAction);
            }

            public int hashCode() {
                return this.previousTrackAction.hashCode();
            }

            public String toString() {
                return "NavigateToSpecialOffers(previousTrackAction=" + this.previousTrackAction + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigateToSpecialOffers(String previousTrackAction) {
                super(null);
                Intrinsics.j(previousTrackAction, "previousTrackAction");
                this.previousTrackAction = previousTrackAction;
            }

            /* renamed from: a, reason: from getter */
            public final String getPreviousTrackAction() {
                return this.previousTrackAction;
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$k$h;", "Lcom/meijer/mobile/home/ux/k0$k;", "", "LWl/c;", "clippedRewards", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.home.ux.k0$k$h, reason: from toString */
        public static final /* data */ class NavigateToYourRewardsMPerksDashboard extends AbstractC11777k {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<HomeMperksClippedReward> clippedRewards;

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

            public final List<HomeMperksClippedReward> a() {
                return this.clippedRewards;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$k$i;", "Lcom/meijer/mobile/home/ux/k0$k;", "", "message", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.home.ux.k0$k$i, reason: from toString */
        public static final /* data */ class ShowErrorToast extends AbstractC11777k {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int message;

            public ShowErrorToast(int i10) {
                super(null);
                this.message = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowErrorToast) && this.message == ((ShowErrorToast) other).message;
            }

            public int hashCode() {
                return Integer.hashCode(this.message);
            }

            public String toString() {
                return "ShowErrorToast(message=" + this.message + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getMessage() {
                return this.message;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$k$j;", "Lcom/meijer/mobile/home/ux/k0$k;", "", "messageResId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.home.ux.k0$k$j, reason: from toString */
        public static final /* data */ class ShowSubstitutionToast extends AbstractC11777k {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            public ShowSubstitutionToast(int i10) {
                super(null);
                this.messageResId = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowSubstitutionToast) && this.messageResId == ((ShowSubstitutionToast) other).messageResId;
            }

            public int hashCode() {
                return Integer.hashCode(this.messageResId);
            }

            public String toString() {
                return "ShowSubstitutionToast(messageResId=" + this.messageResId + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$k$k;", "Lcom/meijer/mobile/home/ux/k0$k;", "", "messageResId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.home.ux.k0$k$k, reason: collision with other inner class name and from toString */
        public static final /* data */ class UpdateCartFailedToast extends AbstractC11777k {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            public UpdateCartFailedToast(int i10) {
                super(null);
                this.messageResId = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateCartFailedToast) && this.messageResId == ((UpdateCartFailedToast) other).messageResId;
            }

            public int hashCode() {
                return Integer.hashCode(this.messageResId);
            }

            public String toString() {
                return "UpdateCartFailedToast(messageResId=" + this.messageResId + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$k$l;", "Lcom/meijer/mobile/home/ux/k0$k;", "", "messageResId", "actionResId", "Lfj/i;", "entry", "<init>", "(IILfj/i;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Lfj/i;", "()Lfj/i;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.home.ux.k0$k$l, reason: from toString */
        public static final /* data */ class UpdateCartSuccessToast extends AbstractC11777k {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int actionResId;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Entry entry;

            public /* synthetic */ UpdateCartSuccessToast(int i10, int i11, Entry entry, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10, i11, (i12 & 4) != 0 ? null : entry);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateCartSuccessToast)) {
                    return false;
                }
                UpdateCartSuccessToast updateCartSuccessToast = (UpdateCartSuccessToast) other;
                return this.messageResId == updateCartSuccessToast.messageResId && this.actionResId == updateCartSuccessToast.actionResId && Intrinsics.e(this.entry, updateCartSuccessToast.entry);
            }

            public int hashCode() {
                int iHashCode = ((Integer.hashCode(this.messageResId) * 31) + Integer.hashCode(this.actionResId)) * 31;
                Entry entry = this.entry;
                return iHashCode + (entry == null ? 0 : entry.hashCode());
            }

            public String toString() {
                return "UpdateCartSuccessToast(messageResId=" + this.messageResId + ", actionResId=" + this.actionResId + ", entry=" + this.entry + ')';
            }

            public UpdateCartSuccessToast(int i10, int i11, Entry entry) {
                super(null);
                this.messageResId = i10;
                this.actionResId = i11;
                this.entry = entry;
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
        }

        public /* synthetic */ AbstractC11777k(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC11777k() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$throwChallenge$1", f = "HomeViewModel.kt", l = {1903}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.home.ux.k0$k0, reason: collision with other inner class name */
    static final class C1408k0 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f99145a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC17720a.ChokingHazardChallenge f99147c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k0.this.new C1408k0(this.f99147c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1408k0(AbstractC17720a.ChokingHazardChallenge chokingHazardChallenge, Continuation<? super C1408k0> continuation) {
            super(2, continuation);
            this.f99147c = chokingHazardChallenge;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C1408k0) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f99145a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = k0.this._dialogFlow;
                AbstractC11776j.ChokeWarningAlert chokeWarningAlert = new AbstractC11776j.ChokeWarningAlert(this.f99147c.a());
                this.f99145a = 1;
                if (interfaceC16548A.emit(chokeWarningAlert, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$l;", "", "<init>", "()V", "b", "c", "d", "a", "Lcom/meijer/mobile/home/ux/k0$l$a;", "Lcom/meijer/mobile/home/ux/k0$l$b;", "Lcom/meijer/mobile/home/ux/k0$l$c;", "Lcom/meijer/mobile/home/ux/k0$l$d;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.home.ux.k0$l, reason: case insensitive filesystem */
    public static abstract class AbstractC11778l {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$l$a;", "Lcom/meijer/mobile/home/ux/k0$l;", "Lur/a;", "cartUpdateRequest", "<init>", "(Lur/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lur/a;", "()Lur/a;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.home.ux.k0$l$a, reason: from toString */
        public static final /* data */ class AcceptAddToCartChallenge extends AbstractC11778l {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC17454a cartUpdateRequest;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AcceptAddToCartChallenge) && Intrinsics.e(this.cartUpdateRequest, ((AcceptAddToCartChallenge) other).cartUpdateRequest);
            }

            public int hashCode() {
                return this.cartUpdateRequest.hashCode();
            }

            public String toString() {
                return "AcceptAddToCartChallenge(cartUpdateRequest=" + this.cartUpdateRequest + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AcceptAddToCartChallenge(AbstractC17454a cartUpdateRequest) {
                super(null);
                Intrinsics.j(cartUpdateRequest, "cartUpdateRequest");
                this.cartUpdateRequest = cartUpdateRequest;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC17454a getCartUpdateRequest() {
                return this.cartUpdateRequest;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$l$b;", "Lcom/meijer/mobile/home/ux/k0$l;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.home.ux.k0$l$b */
        public static final /* data */ class b extends AbstractC11778l {

            /* renamed from: a, reason: collision with root package name */
            public static final b f99149a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 2053490401;
            }

            public String toString() {
                return "DismissBottomSheet";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$l$c;", "Lcom/meijer/mobile/home/ux/k0$l;", "", "messageResId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.home.ux.k0$l$c, reason: from toString */
        public static final /* data */ class DisplaySubstitutionToast extends AbstractC11778l {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            public DisplaySubstitutionToast(int i10) {
                super(null);
                this.messageResId = i10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DisplaySubstitutionToast) && this.messageResId == ((DisplaySubstitutionToast) other).messageResId;
            }

            public int hashCode() {
                return Integer.hashCode(this.messageResId);
            }

            public String toString() {
                return "DisplaySubstitutionToast(messageResId=" + this.messageResId + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$l$d;", "Lcom/meijer/mobile/home/ux/k0$l;", "", "productCode", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.home.ux.k0$l$d, reason: from toString */
        public static final /* data */ class ResetStepperState extends AbstractC11778l {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String productCode;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ResetStepperState) && Intrinsics.e(this.productCode, ((ResetStepperState) other).productCode);
            }

            public int hashCode() {
                return this.productCode.hashCode();
            }

            public String toString() {
                return "ResetStepperState(productCode=" + this.productCode + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ResetStepperState(String productCode) {
                super(null);
                Intrinsics.j(productCode, "productCode");
                this.productCode = productCode;
            }

            /* renamed from: a, reason: from getter */
            public final String getProductCode() {
                return this.productCode;
            }
        }

        public /* synthetic */ AbstractC11778l(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC11778l() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel", f = "HomeViewModel.kt", l = {1917, 1943, 1951, 1969, 1977, 1985}, m = "updateCartEntry")
    static final class l0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f99152a;

        /* renamed from: b, reason: collision with root package name */
        Object f99153b;

        /* renamed from: c, reason: collision with root package name */
        Object f99154c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f99155d;

        /* renamed from: f, reason: collision with root package name */
        int f99157f;

        l0(Continuation<? super l0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f99155d = obj;
            this.f99157f |= Integer.MIN_VALUE;
            return k0.this.updateCartEntry(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bC\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BÛ\u0002\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\r\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u001a\b\u0002\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00020 \u0012\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020#0 \u0012\u0018\b\u0002\u0010'\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0006\u0012\u0004\u0018\u00010&0 \u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010)\u001a\u00020\r\u0012\b\b\u0002\u0010*\u001a\u00020\r\u0012\b\b\u0002\u0010,\u001a\u00020+\u0012\b\b\u0002\u0010-\u001a\u00020\u0007\u0012\b\b\u0002\u0010/\u001a\u00020.\u0012\b\b\u0002\u00100\u001a\u00020\r¢\u0006\u0004\b1\u00102Jä\u0002\u00103\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\r2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u001a\b\u0002\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00020 2\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020#0 2\u0018\b\u0002\u0010'\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0006\u0012\u0004\u0018\u00010&0 2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010)\u001a\u00020\r2\b\b\u0002\u0010*\u001a\u00020\r2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020\u00072\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020%HÖ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010:\u001a\u00020\r2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b:\u0010;R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b3\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bC\u00108R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006¢\u0006\f\n\u0004\bE\u0010<\u001a\u0004\bE\u0010>R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0006¢\u0006\f\n\u0004\bF\u0010<\u001a\u0004\bG\u0010>R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b=\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bS\u0010P\u001a\u0004\bT\u0010RR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bU\u0010WR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bX\u0010V\u001a\u0004\bX\u0010WR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00028\u0006¢\u0006\f\n\u0004\bY\u0010<\u001a\u0004\bZ\u0010>R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\b_\u0010aR\u0017\u0010\u001d\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bZ\u0010I\u001a\u0004\bb\u0010KR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\bG\u0010c\u001a\u0004\b[\u0010dR)\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00020 8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR#\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020#0 8\u0006¢\u0006\f\n\u0004\bg\u0010f\u001a\u0004\be\u0010hR'\u0010'\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0006\u0012\u0004\u0018\u00010&0 8\u0006¢\u0006\f\n\u0004\bi\u0010f\u001a\u0004\bO\u0010hR\u0019\u0010(\u001a\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\bT\u0010j\u001a\u0004\bk\u00106R\u0017\u0010)\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bQ\u0010I\u001a\u0004\bl\u0010KR\u0017\u0010*\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bM\u0010I\u001a\u0004\bi\u0010KR\u0017\u0010,\u001a\u00020+8\u0006¢\u0006\f\n\u0004\bk\u0010m\u001a\u0004\bS\u0010nR\u0017\u0010-\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b]\u0010D\u001a\u0004\bH\u00108R\u0017\u0010/\u001a\u00020.8\u0006¢\u0006\f\n\u0004\bA\u0010o\u001a\u0004\bF\u0010pR\u0017\u00100\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bJ\u0010I\u001a\u0004\bq\u0010KR\u0017\u0010u\u001a\u00020r8\u0006¢\u0006\f\n\u0004\bq\u0010s\u001a\u0004\bY\u0010t¨\u0006v"}, d2 = {"Lcom/meijer/mobile/home/ux/k0$m;", "", "", "LVl/e$f;", "components", "Lyo/c;", "user", "", "cartItemCount", "Lxr/a;", "chips", "Les/i;", "orderStatusCards", "", "isRefreshing", "Lgm/c;", "specialOffersCarouselDecorator", "Lds/c;", "shopByDepartmentDecorator", "seasonalCarouselDecorator", "Lgi/d;", "googleAdSlot1", "googleAdSlot2", "LVl/i;", "marketingBannerList", "Lgm/d;", "teacherListsCardDecorator", "Lgm/b;", "mPerksDecorator", "shouldShowEmailVerificationBanner", "Lgm/a;", "homeEmailBannerDecorator", "", "Lvs/f;", "productListDecorators", "Lvs/a;", "productCarouselsDecorators", "", "LYk/c;", "couponsStateMap", "stepperIdInInteraction", "isStepperInTransition", "resetStepper", "LUl/b;", "criteoBeaconsTracker", "clickedProductPosition", "Lkk/a;", "clickedCarouselType", "isSponsoredCriteo", "<init>", "(Ljava/util/List;Lyo/c;ILjava/util/List;Ljava/util/List;ZLgm/c;Lds/c;Lds/c;Lgi/d;Lgi/d;Ljava/util/List;Lgm/d;Lgm/b;ZLgm/a;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;ZZLUl/b;ILkk/a;Z)V", "a", "(Ljava/util/List;Lyo/c;ILjava/util/List;Ljava/util/List;ZLgm/c;Lds/c;Lds/c;Lgi/d;Lgi/d;Ljava/util/List;Lgm/d;Lgm/b;ZLgm/a;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;ZZLUl/b;ILkk/a;Z)Lcom/meijer/mobile/home/ux/k0$m;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "g", "()Ljava/util/List;", "b", "Lyo/c;", "y", "()Lyo/c;", "c", "I", "d", "e", "p", "f", "Z", "z", "()Z", "Lgm/c;", "v", "()Lgm/c;", "h", "Lds/c;", "u", "()Lds/c;", "i", "t", "j", "Lgi/d;", "()Lgi/d;", "k", "l", "o", "m", "Lgm/d;", "x", "()Lgm/d;", "n", "Lgm/b;", "()Lgm/b;", "getShouldShowEmailVerificationBanner", "Lgm/a;", "()Lgm/a;", "q", "Ljava/util/Map;", "r", "()Ljava/util/Map;", "s", "Ljava/lang/String;", "w", "B", "LUl/b;", "()LUl/b;", "Lkk/a;", "()Lkk/a;", "A", "Lbk/a;", "Lbk/a;", "()Lbk/a;", "greeting", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.home.ux.k0$m, reason: case insensitive filesystem and from toString */
    public static final /* data */ class ViewState {

        /* renamed from: A, reason: collision with root package name and from kotlin metadata */
        private final AbstractC6392a greeting;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<e.f> components;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final MeijerUser user;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int cartItemCount;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<InterfaceC18214a> chips;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<OrderStatusCardDecorator> orderStatusCards;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isRefreshing;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final SpecialOffersCarouselDecorator specialOffersCarouselDecorator;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final DepartmentCarouselDecorator shopByDepartmentDecorator;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final DepartmentCarouselDecorator seasonalCarouselDecorator;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final GoogleAdData googleAdSlot1;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final GoogleAdData googleAdSlot2;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<MarketingBanner> marketingBannerList;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final TeachersListCardDecorator teacherListsCardDecorator;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final HomeMperksDecorator mPerksDecorator;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldShowEmailVerificationBanner;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final HomeEmailBannerDecorator homeEmailBannerDecorator;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<e.f, List<ProductListDecorator>> productListDecorators;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<e.f, CarouselDecorator> productCarouselsDecorators;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, CouponState> couponsStateMap;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final String stepperIdInInteraction;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isStepperInTransition;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean resetStepper;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final BeaconsTracker criteoBeaconsTracker;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private final int clickedProductPosition;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnumC15218a clickedCarouselType;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isSponsoredCriteo;

        public ViewState() {
            this(null, null, 0, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, 0, null, false, 67108863, null);
        }

        public static /* synthetic */ ViewState b(ViewState viewState, List list, MeijerUser meijerUser, int i10, List list2, List list3, boolean z10, SpecialOffersCarouselDecorator specialOffersCarouselDecorator, DepartmentCarouselDecorator departmentCarouselDecorator, DepartmentCarouselDecorator departmentCarouselDecorator2, GoogleAdData googleAdData, GoogleAdData googleAdData2, List list4, TeachersListCardDecorator teachersListCardDecorator, HomeMperksDecorator homeMperksDecorator, boolean z11, HomeEmailBannerDecorator homeEmailBannerDecorator, Map map, Map map2, Map map3, String str, boolean z12, boolean z13, BeaconsTracker beaconsTracker, int i11, EnumC15218a enumC15218a, boolean z14, int i12, Object obj) {
            boolean z15;
            EnumC15218a enumC15218a2;
            List list5 = (i12 & 1) != 0 ? viewState.components : list;
            MeijerUser meijerUser2 = (i12 & 2) != 0 ? viewState.user : meijerUser;
            int i13 = (i12 & 4) != 0 ? viewState.cartItemCount : i10;
            List list6 = (i12 & 8) != 0 ? viewState.chips : list2;
            List list7 = (i12 & 16) != 0 ? viewState.orderStatusCards : list3;
            boolean z16 = (i12 & 32) != 0 ? viewState.isRefreshing : z10;
            SpecialOffersCarouselDecorator specialOffersCarouselDecorator2 = (i12 & 64) != 0 ? viewState.specialOffersCarouselDecorator : specialOffersCarouselDecorator;
            DepartmentCarouselDecorator departmentCarouselDecorator3 = (i12 & 128) != 0 ? viewState.shopByDepartmentDecorator : departmentCarouselDecorator;
            DepartmentCarouselDecorator departmentCarouselDecorator4 = (i12 & 256) != 0 ? viewState.seasonalCarouselDecorator : departmentCarouselDecorator2;
            GoogleAdData googleAdData3 = (i12 & 512) != 0 ? viewState.googleAdSlot1 : googleAdData;
            GoogleAdData googleAdData4 = (i12 & 1024) != 0 ? viewState.googleAdSlot2 : googleAdData2;
            List list8 = (i12 & RecyclerView.m.FLAG_MOVED) != 0 ? viewState.marketingBannerList : list4;
            TeachersListCardDecorator teachersListCardDecorator2 = (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? viewState.teacherListsCardDecorator : teachersListCardDecorator;
            HomeMperksDecorator homeMperksDecorator2 = (i12 & 8192) != 0 ? viewState.mPerksDecorator : homeMperksDecorator;
            List list9 = list5;
            boolean z17 = (i12 & 16384) != 0 ? viewState.shouldShowEmailVerificationBanner : z11;
            HomeEmailBannerDecorator homeEmailBannerDecorator2 = (i12 & 32768) != 0 ? viewState.homeEmailBannerDecorator : homeEmailBannerDecorator;
            Map map4 = (i12 & 65536) != 0 ? viewState.productListDecorators : map;
            Map map5 = (i12 & 131072) != 0 ? viewState.productCarouselsDecorators : map2;
            Map map6 = (i12 & 262144) != 0 ? viewState.couponsStateMap : map3;
            String str2 = (i12 & 524288) != 0 ? viewState.stepperIdInInteraction : str;
            boolean z18 = (i12 & 1048576) != 0 ? viewState.isStepperInTransition : z12;
            boolean z19 = (i12 & 2097152) != 0 ? viewState.resetStepper : z13;
            BeaconsTracker beaconsTracker2 = (i12 & 4194304) != 0 ? viewState.criteoBeaconsTracker : beaconsTracker;
            int i14 = (i12 & 8388608) != 0 ? viewState.clickedProductPosition : i11;
            EnumC15218a enumC15218a3 = (i12 & 16777216) != 0 ? viewState.clickedCarouselType : enumC15218a;
            if ((i12 & 33554432) != 0) {
                enumC15218a2 = enumC15218a3;
                z15 = viewState.isSponsoredCriteo;
            } else {
                z15 = z14;
                enumC15218a2 = enumC15218a3;
            }
            return viewState.a(list9, meijerUser2, i13, list6, list7, z16, specialOffersCarouselDecorator2, departmentCarouselDecorator3, departmentCarouselDecorator4, googleAdData3, googleAdData4, list8, teachersListCardDecorator2, homeMperksDecorator2, z17, homeEmailBannerDecorator2, map4, map5, map6, str2, z18, z19, beaconsTracker2, i14, enumC15218a2, z15);
        }

        public final ViewState a(List<? extends e.f> components, MeijerUser user, int cartItemCount, List<? extends InterfaceC18214a> chips, List<OrderStatusCardDecorator> orderStatusCards, boolean isRefreshing, SpecialOffersCarouselDecorator specialOffersCarouselDecorator, DepartmentCarouselDecorator shopByDepartmentDecorator, DepartmentCarouselDecorator seasonalCarouselDecorator, GoogleAdData googleAdSlot1, GoogleAdData googleAdSlot2, List<MarketingBanner> marketingBannerList, TeachersListCardDecorator teacherListsCardDecorator, HomeMperksDecorator mPerksDecorator, boolean shouldShowEmailVerificationBanner, HomeEmailBannerDecorator homeEmailBannerDecorator, Map<e.f, ? extends List<ProductListDecorator>> productListDecorators, Map<e.f, CarouselDecorator> productCarouselsDecorators, Map<String, CouponState> couponsStateMap, String stepperIdInInteraction, boolean isStepperInTransition, boolean resetStepper, BeaconsTracker criteoBeaconsTracker, int clickedProductPosition, EnumC15218a clickedCarouselType, boolean isSponsoredCriteo) {
            Intrinsics.j(components, "components");
            Intrinsics.j(user, "user");
            Intrinsics.j(chips, "chips");
            Intrinsics.j(orderStatusCards, "orderStatusCards");
            Intrinsics.j(specialOffersCarouselDecorator, "specialOffersCarouselDecorator");
            Intrinsics.j(shopByDepartmentDecorator, "shopByDepartmentDecorator");
            Intrinsics.j(seasonalCarouselDecorator, "seasonalCarouselDecorator");
            Intrinsics.j(marketingBannerList, "marketingBannerList");
            Intrinsics.j(mPerksDecorator, "mPerksDecorator");
            Intrinsics.j(productListDecorators, "productListDecorators");
            Intrinsics.j(productCarouselsDecorators, "productCarouselsDecorators");
            Intrinsics.j(couponsStateMap, "couponsStateMap");
            Intrinsics.j(criteoBeaconsTracker, "criteoBeaconsTracker");
            Intrinsics.j(clickedCarouselType, "clickedCarouselType");
            return new ViewState(components, user, cartItemCount, chips, orderStatusCards, isRefreshing, specialOffersCarouselDecorator, shopByDepartmentDecorator, seasonalCarouselDecorator, googleAdSlot1, googleAdSlot2, marketingBannerList, teacherListsCardDecorator, mPerksDecorator, shouldShowEmailVerificationBanner, homeEmailBannerDecorator, productListDecorators, productCarouselsDecorators, couponsStateMap, stepperIdInInteraction, isStepperInTransition, resetStepper, criteoBeaconsTracker, clickedProductPosition, clickedCarouselType, isSponsoredCriteo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.components, viewState.components) && Intrinsics.e(this.user, viewState.user) && this.cartItemCount == viewState.cartItemCount && Intrinsics.e(this.chips, viewState.chips) && Intrinsics.e(this.orderStatusCards, viewState.orderStatusCards) && this.isRefreshing == viewState.isRefreshing && Intrinsics.e(this.specialOffersCarouselDecorator, viewState.specialOffersCarouselDecorator) && Intrinsics.e(this.shopByDepartmentDecorator, viewState.shopByDepartmentDecorator) && Intrinsics.e(this.seasonalCarouselDecorator, viewState.seasonalCarouselDecorator) && Intrinsics.e(this.googleAdSlot1, viewState.googleAdSlot1) && Intrinsics.e(this.googleAdSlot2, viewState.googleAdSlot2) && Intrinsics.e(this.marketingBannerList, viewState.marketingBannerList) && Intrinsics.e(this.teacherListsCardDecorator, viewState.teacherListsCardDecorator) && Intrinsics.e(this.mPerksDecorator, viewState.mPerksDecorator) && this.shouldShowEmailVerificationBanner == viewState.shouldShowEmailVerificationBanner && Intrinsics.e(this.homeEmailBannerDecorator, viewState.homeEmailBannerDecorator) && Intrinsics.e(this.productListDecorators, viewState.productListDecorators) && Intrinsics.e(this.productCarouselsDecorators, viewState.productCarouselsDecorators) && Intrinsics.e(this.couponsStateMap, viewState.couponsStateMap) && Intrinsics.e(this.stepperIdInInteraction, viewState.stepperIdInInteraction) && this.isStepperInTransition == viewState.isStepperInTransition && this.resetStepper == viewState.resetStepper && Intrinsics.e(this.criteoBeaconsTracker, viewState.criteoBeaconsTracker) && this.clickedProductPosition == viewState.clickedProductPosition && this.clickedCarouselType == viewState.clickedCarouselType && this.isSponsoredCriteo == viewState.isSponsoredCriteo;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((this.components.hashCode() * 31) + this.user.hashCode()) * 31) + Integer.hashCode(this.cartItemCount)) * 31) + this.chips.hashCode()) * 31) + this.orderStatusCards.hashCode()) * 31) + Boolean.hashCode(this.isRefreshing)) * 31) + this.specialOffersCarouselDecorator.hashCode()) * 31) + this.shopByDepartmentDecorator.hashCode()) * 31) + this.seasonalCarouselDecorator.hashCode()) * 31;
            GoogleAdData googleAdData = this.googleAdSlot1;
            int iHashCode2 = (iHashCode + (googleAdData == null ? 0 : googleAdData.hashCode())) * 31;
            GoogleAdData googleAdData2 = this.googleAdSlot2;
            int iHashCode3 = (((iHashCode2 + (googleAdData2 == null ? 0 : googleAdData2.hashCode())) * 31) + this.marketingBannerList.hashCode()) * 31;
            TeachersListCardDecorator teachersListCardDecorator = this.teacherListsCardDecorator;
            int iHashCode4 = (((((iHashCode3 + (teachersListCardDecorator == null ? 0 : teachersListCardDecorator.hashCode())) * 31) + this.mPerksDecorator.hashCode()) * 31) + Boolean.hashCode(this.shouldShowEmailVerificationBanner)) * 31;
            HomeEmailBannerDecorator homeEmailBannerDecorator = this.homeEmailBannerDecorator;
            int iHashCode5 = (((((((iHashCode4 + (homeEmailBannerDecorator == null ? 0 : homeEmailBannerDecorator.hashCode())) * 31) + this.productListDecorators.hashCode()) * 31) + this.productCarouselsDecorators.hashCode()) * 31) + this.couponsStateMap.hashCode()) * 31;
            String str = this.stepperIdInInteraction;
            return ((((((((((((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.isStepperInTransition)) * 31) + Boolean.hashCode(this.resetStepper)) * 31) + this.criteoBeaconsTracker.hashCode()) * 31) + Integer.hashCode(this.clickedProductPosition)) * 31) + this.clickedCarouselType.hashCode()) * 31) + Boolean.hashCode(this.isSponsoredCriteo);
        }

        public String toString() {
            return "ViewState(components=" + this.components + ", user=" + this.user + ", cartItemCount=" + this.cartItemCount + ", chips=" + this.chips + ", orderStatusCards=" + this.orderStatusCards + ", isRefreshing=" + this.isRefreshing + ", specialOffersCarouselDecorator=" + this.specialOffersCarouselDecorator + ", shopByDepartmentDecorator=" + this.shopByDepartmentDecorator + ", seasonalCarouselDecorator=" + this.seasonalCarouselDecorator + ", googleAdSlot1=" + this.googleAdSlot1 + ", googleAdSlot2=" + this.googleAdSlot2 + ", marketingBannerList=" + this.marketingBannerList + ", teacherListsCardDecorator=" + this.teacherListsCardDecorator + ", mPerksDecorator=" + this.mPerksDecorator + ", shouldShowEmailVerificationBanner=" + this.shouldShowEmailVerificationBanner + ", homeEmailBannerDecorator=" + this.homeEmailBannerDecorator + ", productListDecorators=" + this.productListDecorators + ", productCarouselsDecorators=" + this.productCarouselsDecorators + ", couponsStateMap=" + this.couponsStateMap + ", stepperIdInInteraction=" + this.stepperIdInInteraction + ", isStepperInTransition=" + this.isStepperInTransition + ", resetStepper=" + this.resetStepper + ", criteoBeaconsTracker=" + this.criteoBeaconsTracker + ", clickedProductPosition=" + this.clickedProductPosition + ", clickedCarouselType=" + this.clickedCarouselType + ", isSponsoredCriteo=" + this.isSponsoredCriteo + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ViewState(List<? extends e.f> components, MeijerUser user, int i10, List<? extends InterfaceC18214a> chips, List<OrderStatusCardDecorator> orderStatusCards, boolean z10, SpecialOffersCarouselDecorator specialOffersCarouselDecorator, DepartmentCarouselDecorator shopByDepartmentDecorator, DepartmentCarouselDecorator seasonalCarouselDecorator, GoogleAdData googleAdData, GoogleAdData googleAdData2, List<MarketingBanner> marketingBannerList, TeachersListCardDecorator teachersListCardDecorator, HomeMperksDecorator mPerksDecorator, boolean z11, HomeEmailBannerDecorator homeEmailBannerDecorator, Map<e.f, ? extends List<ProductListDecorator>> productListDecorators, Map<e.f, CarouselDecorator> productCarouselsDecorators, Map<String, CouponState> couponsStateMap, String str, boolean z12, boolean z13, BeaconsTracker criteoBeaconsTracker, int i11, EnumC15218a clickedCarouselType, boolean z14) {
            Intrinsics.j(components, "components");
            Intrinsics.j(user, "user");
            Intrinsics.j(chips, "chips");
            Intrinsics.j(orderStatusCards, "orderStatusCards");
            Intrinsics.j(specialOffersCarouselDecorator, "specialOffersCarouselDecorator");
            Intrinsics.j(shopByDepartmentDecorator, "shopByDepartmentDecorator");
            Intrinsics.j(seasonalCarouselDecorator, "seasonalCarouselDecorator");
            Intrinsics.j(marketingBannerList, "marketingBannerList");
            Intrinsics.j(mPerksDecorator, "mPerksDecorator");
            Intrinsics.j(productListDecorators, "productListDecorators");
            Intrinsics.j(productCarouselsDecorators, "productCarouselsDecorators");
            Intrinsics.j(couponsStateMap, "couponsStateMap");
            Intrinsics.j(criteoBeaconsTracker, "criteoBeaconsTracker");
            Intrinsics.j(clickedCarouselType, "clickedCarouselType");
            this.components = components;
            this.user = user;
            this.cartItemCount = i10;
            this.chips = chips;
            this.orderStatusCards = orderStatusCards;
            this.isRefreshing = z10;
            this.specialOffersCarouselDecorator = specialOffersCarouselDecorator;
            this.shopByDepartmentDecorator = shopByDepartmentDecorator;
            this.seasonalCarouselDecorator = seasonalCarouselDecorator;
            this.googleAdSlot1 = googleAdData;
            this.googleAdSlot2 = googleAdData2;
            this.marketingBannerList = marketingBannerList;
            this.teacherListsCardDecorator = teachersListCardDecorator;
            this.mPerksDecorator = mPerksDecorator;
            this.shouldShowEmailVerificationBanner = z11;
            this.homeEmailBannerDecorator = homeEmailBannerDecorator;
            this.productListDecorators = productListDecorators;
            this.productCarouselsDecorators = productCarouselsDecorators;
            this.couponsStateMap = couponsStateMap;
            this.stepperIdInInteraction = str;
            this.isStepperInTransition = z12;
            this.resetStepper = z13;
            this.criteoBeaconsTracker = criteoBeaconsTracker;
            this.clickedProductPosition = i11;
            this.clickedCarouselType = clickedCarouselType;
            this.isSponsoredCriteo = z14;
            this.greeting = user.getIsLoggedIn() ? AbstractC6392a.INSTANCE.d(r0.f99348g, user.getFirstName()) : AbstractC6392a.INSTANCE.d(r0.f99347f, new Object[0]);
        }

        /* renamed from: A, reason: from getter */
        public final boolean getIsSponsoredCriteo() {
            return this.isSponsoredCriteo;
        }

        /* renamed from: B, reason: from getter */
        public final boolean getIsStepperInTransition() {
            return this.isStepperInTransition;
        }

        /* renamed from: c, reason: from getter */
        public final int getCartItemCount() {
            return this.cartItemCount;
        }

        public final List<InterfaceC18214a> d() {
            return this.chips;
        }

        /* renamed from: e, reason: from getter */
        public final EnumC15218a getClickedCarouselType() {
            return this.clickedCarouselType;
        }

        /* renamed from: f, reason: from getter */
        public final int getClickedProductPosition() {
            return this.clickedProductPosition;
        }

        public final List<e.f> g() {
            return this.components;
        }

        public final Map<String, CouponState> h() {
            return this.couponsStateMap;
        }

        /* renamed from: i, reason: from getter */
        public final BeaconsTracker getCriteoBeaconsTracker() {
            return this.criteoBeaconsTracker;
        }

        /* renamed from: j, reason: from getter */
        public final GoogleAdData getGoogleAdSlot1() {
            return this.googleAdSlot1;
        }

        /* renamed from: k, reason: from getter */
        public final GoogleAdData getGoogleAdSlot2() {
            return this.googleAdSlot2;
        }

        /* renamed from: l, reason: from getter */
        public final AbstractC6392a getGreeting() {
            return this.greeting;
        }

        /* renamed from: m, reason: from getter */
        public final HomeEmailBannerDecorator getHomeEmailBannerDecorator() {
            return this.homeEmailBannerDecorator;
        }

        /* renamed from: n, reason: from getter */
        public final HomeMperksDecorator getMPerksDecorator() {
            return this.mPerksDecorator;
        }

        public final List<MarketingBanner> o() {
            return this.marketingBannerList;
        }

        public final List<OrderStatusCardDecorator> p() {
            return this.orderStatusCards;
        }

        public final Map<e.f, CarouselDecorator> q() {
            return this.productCarouselsDecorators;
        }

        public final Map<e.f, List<ProductListDecorator>> r() {
            return this.productListDecorators;
        }

        /* renamed from: s, reason: from getter */
        public final boolean getResetStepper() {
            return this.resetStepper;
        }

        /* renamed from: t, reason: from getter */
        public final DepartmentCarouselDecorator getSeasonalCarouselDecorator() {
            return this.seasonalCarouselDecorator;
        }

        /* renamed from: u, reason: from getter */
        public final DepartmentCarouselDecorator getShopByDepartmentDecorator() {
            return this.shopByDepartmentDecorator;
        }

        /* renamed from: v, reason: from getter */
        public final SpecialOffersCarouselDecorator getSpecialOffersCarouselDecorator() {
            return this.specialOffersCarouselDecorator;
        }

        /* renamed from: w, reason: from getter */
        public final String getStepperIdInInteraction() {
            return this.stepperIdInInteraction;
        }

        /* renamed from: x, reason: from getter */
        public final TeachersListCardDecorator getTeacherListsCardDecorator() {
            return this.teacherListsCardDecorator;
        }

        /* renamed from: y, reason: from getter */
        public final MeijerUser getUser() {
            return this.user;
        }

        /* renamed from: z, reason: from getter */
        public final boolean getIsRefreshing() {
            return this.isRefreshing;
        }

        public /* synthetic */ ViewState(List list, MeijerUser meijerUser, int i10, List list2, List list3, boolean z10, SpecialOffersCarouselDecorator specialOffersCarouselDecorator, DepartmentCarouselDecorator departmentCarouselDecorator, DepartmentCarouselDecorator departmentCarouselDecorator2, GoogleAdData googleAdData, GoogleAdData googleAdData2, List list4, TeachersListCardDecorator teachersListCardDecorator, HomeMperksDecorator homeMperksDecorator, boolean z11, HomeEmailBannerDecorator homeEmailBannerDecorator, Map map, Map map2, Map map3, String str, boolean z12, boolean z13, BeaconsTracker beaconsTracker, int i11, EnumC15218a enumC15218a, boolean z14, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? CollectionsKt.p(e.f.a.f40004d, e.f.c.f40008d, e.f.b.a.f40005d, e.f.b.C0858b.f40006d, e.f.b.c.f40007d, e.f.d.a.f40010e) : list, (i12 & 2) != 0 ? new MeijerUser(null, null, null, null, null, false, null, false, false, 511, null) : meijerUser, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? C14536a.INSTANCE.a() : list2, (i12 & 16) != 0 ? CollectionsKt.m() : list3, (i12 & 32) != 0 ? false : z10, (i12 & 64) != 0 ? new SpecialOffersCarouselDecorator(null, null, null, null, null, null, 0, l3.f93324d, null) : specialOffersCarouselDecorator, (i12 & 128) != 0 ? new DepartmentCarouselDecorator(null, null, null, null, null, 31, null) : departmentCarouselDecorator, (i12 & 256) != 0 ? new DepartmentCarouselDecorator(null, null, null, null, null, 31, null) : departmentCarouselDecorator2, (i12 & 512) != 0 ? null : googleAdData, (i12 & 1024) != 0 ? null : googleAdData2, (i12 & RecyclerView.m.FLAG_MOVED) != 0 ? CollectionsKt.m() : list4, (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : teachersListCardDecorator, (i12 & 8192) != 0 ? new HomeMperksDecorator(null, null, 0, null, null, null, null, false, l3.f93323c, null) : homeMperksDecorator, (i12 & 16384) != 0 ? false : z11, (i12 & 32768) != 0 ? null : homeEmailBannerDecorator, (i12 & 65536) != 0 ? MapsKt.k() : map, (i12 & 131072) != 0 ? MapsKt.k() : map2, (i12 & 262144) != 0 ? MapsKt.k() : map3, (i12 & 524288) != 0 ? null : str, (i12 & 1048576) != 0 ? false : z12, (i12 & 2097152) != 0 ? false : z13, (i12 & 4194304) != 0 ? new BeaconsTracker(null, null, null, null, null, null, null, null, l3.f93323c, null) : beaconsTracker, (i12 & 8388608) != 0 ? -1 : i11, (i12 & 16777216) != 0 ? EnumC15218a.f142572f : enumC15218a, (i12 & 33554432) != 0 ? false : z14);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$updateRateAndTipNotification$1", f = "HomeViewModel.kt", l = {1763, 1765, 1772}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class m0 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f99185a;

        /* renamed from: b, reason: collision with root package name */
        Object f99186b;

        /* renamed from: c, reason: collision with root package name */
        Object f99187c;

        /* renamed from: d, reason: collision with root package name */
        Object f99188d;

        /* renamed from: e, reason: collision with root package name */
        int f99189e;

        /* renamed from: f, reason: collision with root package name */
        int f99190f;

        /* renamed from: g, reason: collision with root package name */
        int f99191g;

        /* renamed from: h, reason: collision with root package name */
        int f99192h;

        /* renamed from: i, reason: collision with root package name */
        int f99193i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f99194j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f99196l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f99197m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f99198n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m0(String str, String str2, boolean z10, Continuation<? super m0> continuation) {
            super(2, continuation);
            this.f99196l = str;
            this.f99197m = str2;
            this.f99198n = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            m0 m0Var = k0.this.new m0(this.f99196l, this.f99197m, this.f99198n, continuation);
            m0Var.f99194j = obj;
            return m0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((m0) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
        /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v23, types: [mv.O] */
        /* JADX WARN: Type inference failed for: r1v28 */
        /* JADX WARN: Type inference failed for: r1v29 */
        /* JADX WARN: Type inference failed for: r1v30 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 246
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.home.ux.k0.m0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.home.ux.k0$n, reason: case insensitive filesystem */
    public /* synthetic */ class C11780n {
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
            try {
                iArr[EnumC15218a.f142569c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EntryChange.c.values().length];
            try {
                iArr2[EntryChange.c.f131920b.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EntryChange.c.f131922d.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EntryChange.c.f131921c.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EntryChange.c.f131923e.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EntryChange.c.f131924f.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EntryChange.c.f131925g.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EntryChange.c.f131926h.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel", f = "HomeViewModel.kt", l = {2036, 2054, 2063, 2079}, m = "addCartEntry")
    /* renamed from: com.meijer.mobile.home.ux.k0$o, reason: case insensitive filesystem */
    static final class C11781o extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f99199a;

        /* renamed from: b, reason: collision with root package name */
        Object f99200b;

        /* renamed from: c, reason: collision with root package name */
        Object f99201c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f99202d;

        /* renamed from: f, reason: collision with root package name */
        int f99204f;

        C11781o(Continuation<? super C11781o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f99202d = obj;
            this.f99204f |= Integer.MIN_VALUE;
            return k0.this.addCartEntry(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$claimMperks$1", f = "HomeViewModel.kt", l = {1523}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.home.ux.k0$p, reason: case insensitive filesystem */
    static final class C11782p extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f99205a;

        /* renamed from: b, reason: collision with root package name */
        Object f99206b;

        /* renamed from: c, reason: collision with root package name */
        Object f99207c;

        /* renamed from: d, reason: collision with root package name */
        Object f99208d;

        /* renamed from: e, reason: collision with root package name */
        int f99209e;

        /* renamed from: f, reason: collision with root package name */
        int f99210f;

        /* renamed from: g, reason: collision with root package name */
        int f99211g;

        /* renamed from: h, reason: collision with root package name */
        int f99212h;

        /* renamed from: i, reason: collision with root package name */
        int f99213i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f99214j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f99216l;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$claimMperks$1$3$1", f = "HomeViewModel.kt", l = {1531}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.home.ux.k0$p$a */
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f99217a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k0 f99218b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k0 k0Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f99218b = k0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f99218b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f99217a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f99218b._effectsFlow;
                    AbstractC11777k.ShowErrorToast showErrorToast = new AbstractC11777k.ShowErrorToast(r0.f99340B);
                    this.f99217a = 1;
                    if (interfaceC16548A.emit(showErrorToast, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11782p(long j10, Continuation<? super C11782p> continuation) {
            super(2, continuation);
            this.f99216l = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11782p c11782p = k0.this.new C11782p(this.f99216l, continuation);
            c11782p.f99214j = obj;
            return c11782p;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C11782p) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f99213i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f99214j;
                    k0 k0Var = k0.this;
                    long j10 = this.f99216l;
                    Result.Companion companion = Result.INSTANCE;
                    fo.e eVar = k0Var.rewardsRepository;
                    this.f99214j = interfaceC15783O;
                    this.f99205a = interfaceC15783O;
                    this.f99206b = this;
                    this.f99207c = this;
                    this.f99208d = interfaceC15783O;
                    this.f99209e = 0;
                    this.f99210f = 0;
                    this.f99211g = 0;
                    this.f99212h = 0;
                    this.f99213i = 1;
                    if (eVar.b(j10, this) == objF) {
                        return objF;
                    }
                }
                objB = Result.b(Unit.f143329a);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            k0 k0Var2 = k0.this;
            long j11 = this.f99216l;
            if (Result.h(objB)) {
                k0Var2.processMperksState(j11, true);
                k0Var2.t0(false);
            }
            k0 k0Var3 = k0.this;
            long j12 = this.f99216l;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.e(thE);
                C15809k.d(androidx.view.d0.a(k0Var3), null, null, new a(k0Var3, null), 3, null);
                k0Var3.processMperksState(j12, false);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel", f = "HomeViewModel.kt", l = {1446, 1447, 1450}, m = "clipCoupon")
    /* renamed from: com.meijer.mobile.home.ux.k0$q, reason: case insensitive filesystem */
    static final class C11783q extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f99219a;

        /* renamed from: b, reason: collision with root package name */
        Object f99220b;

        /* renamed from: c, reason: collision with root package name */
        Object f99221c;

        /* renamed from: d, reason: collision with root package name */
        Object f99222d;

        /* renamed from: e, reason: collision with root package name */
        Object f99223e;

        /* renamed from: f, reason: collision with root package name */
        Object f99224f;

        /* renamed from: g, reason: collision with root package name */
        int f99225g;

        /* renamed from: h, reason: collision with root package name */
        int f99226h;

        /* renamed from: i, reason: collision with root package name */
        int f99227i;

        /* renamed from: j, reason: collision with root package name */
        int f99228j;

        /* renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f99229k;

        /* renamed from: m, reason: collision with root package name */
        int f99231m;

        C11783q(Continuation<? super C11783q> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f99229k = obj;
            this.f99231m |= Integer.MIN_VALUE;
            return k0.this.clipCoupon(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$emitDialogEvent$1", f = "HomeViewModel.kt", l = {1486}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.home.ux.k0$r, reason: case insensitive filesystem */
    static final class C11784r extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f99232a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC11776j f99234c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11784r(AbstractC11776j abstractC11776j, Continuation<? super C11784r> continuation) {
            super(2, continuation);
            this.f99234c = abstractC11776j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return k0.this.new C11784r(this.f99234c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C11784r) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f99232a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = k0.this._dialogFlow;
                AbstractC11776j abstractC11776j = this.f99234c;
                this.f99232a = 1;
                if (interfaceC16548A.emit(abstractC11776j, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$fetchActiveOrders$1", f = "HomeViewModel.kt", l = {574}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.home.ux.k0$s, reason: case insensitive filesystem */
    static final class C11785s extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f99235a;

        /* renamed from: b, reason: collision with root package name */
        Object f99236b;

        /* renamed from: c, reason: collision with root package name */
        Object f99237c;

        /* renamed from: d, reason: collision with root package name */
        Object f99238d;

        /* renamed from: e, reason: collision with root package name */
        int f99239e;

        /* renamed from: f, reason: collision with root package name */
        int f99240f;

        /* renamed from: g, reason: collision with root package name */
        int f99241g;

        /* renamed from: h, reason: collision with root package name */
        int f99242h;

        /* renamed from: i, reason: collision with root package name */
        int f99243i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f99244j;

        C11785s(Continuation<? super C11785s> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11785s c11785s = k0.this.new C11785s(continuation);
            c11785s.f99244j = obj;
            return c11785s;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C11785s) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            Object value2;
            List<FlyBuyOrderDetail.FlyBuyOrder> listA;
            Object objE;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f99243i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f99244j;
                    k0.this.loadingStateManager.b(new a.Loading(HomeViewModel.ActiveOrdersLoadingKey, null, 2, null));
                    k0 k0Var = k0.this;
                    Result.Companion companion = Result.INSTANCE;
                    C14781c c14781c = k0Var.orderStatusRepository;
                    this.f99244j = interfaceC15783O;
                    this.f99235a = interfaceC15783O;
                    this.f99236b = this;
                    this.f99237c = this;
                    this.f99238d = interfaceC15783O;
                    this.f99239e = 0;
                    this.f99240f = 0;
                    this.f99241g = 0;
                    this.f99242h = 0;
                    this.f99243i = 1;
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
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            k0 k0Var2 = k0.this;
            if (Result.h(objB)) {
                List<FullOrderResponseHolder> list = (List) objB;
                ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
                for (FullOrderResponseHolder fullOrderResponseHolder : list) {
                    OrderStatusCardDecorator.Companion companion3 = OrderStatusCardDecorator.INSTANCE;
                    OrderDetail fullOrderDetails = fullOrderResponseHolder.getFullOrderDetails();
                    FlyBuyOrderDetail flyBuyResponse = fullOrderResponseHolder.getFlyBuyResponse();
                    arrayList.add(companion3.b(fullOrderDetails, (flyBuyResponse == null || (listA = flyBuyResponse.a()) == null) ? null : (FlyBuyOrderDetail.FlyBuyOrder) CollectionsKt.u0(listA), fullOrderResponseHolder.getSubstitutionOrderDetails(), fullOrderResponseHolder.g(), fullOrderResponseHolder.e()));
                }
                InterfaceC16549B interfaceC16549B = k0Var2._viewState;
                do {
                    value2 = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value2, ViewState.b((ViewState) value2, null, null, 0, null, arrayList, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, 0, null, false, 67108847, null)));
            }
            k0 k0Var3 = k0.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "Failed to retrieve order details in HomeViewModel", new Object[0]);
                InterfaceC16549B interfaceC16549B2 = k0Var3._viewState;
                do {
                    value = interfaceC16549B2.getValue();
                } while (!interfaceC16549B2.e(value, ViewState.b((ViewState) value, null, null, 0, null, CollectionsKt.m(), false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, 0, null, false, 67108847, null)));
            }
            k0.this.loadingStateManager.b(new a.NotLoading(HomeViewModel.ActiveOrdersLoadingKey));
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel", f = "HomeViewModel.kt", l = {531}, m = "fetchAllBuyAgainUpcs")
    /* renamed from: com.meijer.mobile.home.ux.k0$t, reason: case insensitive filesystem */
    static final class C11786t extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f99246a;

        /* renamed from: b, reason: collision with root package name */
        Object f99247b;

        /* renamed from: c, reason: collision with root package name */
        Object f99248c;

        /* renamed from: d, reason: collision with root package name */
        Object f99249d;

        /* renamed from: e, reason: collision with root package name */
        int f99250e;

        /* renamed from: f, reason: collision with root package name */
        int f99251f;

        /* renamed from: g, reason: collision with root package name */
        int f99252g;

        /* renamed from: h, reason: collision with root package name */
        int f99253h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f99254i;

        /* renamed from: k, reason: collision with root package name */
        int f99256k;

        C11786t(Continuation<? super C11786t> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f99254i = obj;
            this.f99256k |= Integer.MIN_VALUE;
            return k0.this.o0(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$fetchCuratedCard$1", f = "HomeViewModel.kt", l = {821}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.home.ux.k0$u, reason: case insensitive filesystem */
    static final class C11787u extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f99257a;

        /* renamed from: b, reason: collision with root package name */
        Object f99258b;

        /* renamed from: c, reason: collision with root package name */
        Object f99259c;

        /* renamed from: d, reason: collision with root package name */
        Object f99260d;

        /* renamed from: e, reason: collision with root package name */
        int f99261e;

        /* renamed from: f, reason: collision with root package name */
        int f99262f;

        /* renamed from: g, reason: collision with root package name */
        int f99263g;

        /* renamed from: h, reason: collision with root package name */
        int f99264h;

        /* renamed from: i, reason: collision with root package name */
        int f99265i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f99266j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ e.f.b f99268l;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11787u c11787u = k0.this.new C11787u(this.f99268l, continuation);
            c11787u.f99266j = obj;
            return c11787u;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11787u(e.f.b bVar, Continuation<? super C11787u> continuation) {
            super(2, continuation);
            this.f99268l = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C11787u) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f99265i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f99266j;
                    k0.this.c1(new a.Loading(null, null, 3, null), EnumC15218a.f142569c, this.f99268l);
                    k0 k0Var = k0.this;
                    e.f.b bVar = this.f99268l;
                    Result.Companion companion = Result.INSTANCE;
                    C15052a c15052a = k0Var.homeRepository;
                    this.f99266j = interfaceC15783O;
                    this.f99257a = interfaceC15783O;
                    this.f99258b = this;
                    this.f99259c = this;
                    this.f99260d = interfaceC15783O;
                    this.f99261e = 0;
                    this.f99262f = 0;
                    this.f99263g = 0;
                    this.f99264h = 0;
                    this.f99265i = 1;
                    obj = c15052a.h(bVar, this);
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
            k0 k0Var2 = k0.this;
            e.f.b bVar2 = this.f99268l;
            if (Result.e(objB) != null) {
                k0Var2.c1(new a.Failed(null, null, 3, null), EnumC15218a.f142569c, bVar2);
            }
            k0 k0Var3 = k0.this;
            e.f.b bVar3 = this.f99268l;
            if (Result.h(objB)) {
                k0Var3.S0((Vl.j) objB, bVar3);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$fetchDepartmentCarousel$1", f = "HomeViewModel.kt", l = {645}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.home.ux.k0$v, reason: case insensitive filesystem */
    static final class C11788v extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f99269a;

        /* renamed from: b, reason: collision with root package name */
        Object f99270b;

        /* renamed from: c, reason: collision with root package name */
        Object f99271c;

        /* renamed from: d, reason: collision with root package name */
        Object f99272d;

        /* renamed from: e, reason: collision with root package name */
        int f99273e;

        /* renamed from: f, reason: collision with root package name */
        int f99274f;

        /* renamed from: g, reason: collision with root package name */
        int f99275g;

        /* renamed from: h, reason: collision with root package name */
        int f99276h;

        /* renamed from: i, reason: collision with root package name */
        int f99277i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f99278j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ e.c f99280l;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11788v c11788v = k0.this.new C11788v(this.f99280l, continuation);
            c11788v.f99278j = obj;
            return c11788v;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11788v(e.c cVar, Continuation<? super C11788v> continuation) {
            super(2, continuation);
            this.f99280l = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C11788v) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            ViewState viewStateB;
            Object value2;
            ViewState viewStateB2;
            Object value3;
            ViewState viewStateB3;
            Object objB2;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f99277i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f99278j;
                    k0 k0Var = k0.this;
                    e.c cVar = this.f99280l;
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC16549B interfaceC16549B = k0Var._viewState;
                    do {
                        value3 = interfaceC16549B.getValue();
                        ViewState viewState = (ViewState) value3;
                        if (Intrinsics.e(cVar, e.c.b.f39992b)) {
                            viewStateB3 = ViewState.b(viewState, null, null, 0, null, null, false, null, DepartmentCarouselDecorator.b(viewState.getShopByDepartmentDecorator(), null, null, null, new a.NotLoading(null, 1, null), null, 23, null), null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, 0, null, false, 67108735, null);
                        } else {
                            if (!Intrinsics.e(cVar, e.c.a.f39991b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            viewStateB3 = ViewState.b(viewState, null, null, 0, null, null, false, null, null, DepartmentCarouselDecorator.b(viewState.getSeasonalCarouselDecorator(), null, null, null, new a.NotLoading(null, 1, null), null, 23, null), null, null, null, null, null, false, null, null, null, null, null, false, false, null, 0, null, false, 67108607, null);
                        }
                    } while (!interfaceC16549B.e(value3, viewStateB3));
                    C15052a c15052a = k0Var.homeRepository;
                    this.f99278j = interfaceC15783O;
                    this.f99269a = interfaceC15783O;
                    this.f99270b = this;
                    this.f99271c = this;
                    this.f99272d = interfaceC15783O;
                    this.f99273e = 0;
                    this.f99274f = 0;
                    this.f99275g = 0;
                    this.f99276h = 0;
                    this.f99277i = 1;
                    objB2 = c15052a.b(cVar, this);
                    if (objB2 == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objB2 = obj;
                }
                objB = Result.b(objB2);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            k0 k0Var2 = k0.this;
            e.c cVar2 = this.f99280l;
            if (Result.h(objB)) {
                DepartmentCard departmentCard = (DepartmentCard) objB;
                InterfaceC16549B interfaceC16549B2 = k0Var2._viewState;
                do {
                    value2 = interfaceC16549B2.getValue();
                    ViewState viewState2 = (ViewState) value2;
                    if (Intrinsics.e(cVar2, e.c.b.f39992b)) {
                        viewStateB2 = ViewState.b(viewState2, null, null, 0, null, null, false, null, C13719a.a(departmentCard, new a.NotLoading(null, 1, null)), null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, 0, null, false, 67108735, null);
                    } else {
                        if (!Intrinsics.e(cVar2, e.c.a.f39991b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        viewStateB2 = ViewState.b(viewState2, null, null, 0, null, null, false, null, null, C13719a.a(departmentCard, new a.NotLoading(null, 1, null)), null, null, null, null, null, false, null, null, null, null, null, false, false, null, 0, null, false, 67108607, null);
                    }
                } while (!interfaceC16549B2.e(value2, viewStateB2));
            }
            e.c cVar3 = this.f99280l;
            k0 k0Var3 = k0.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "Error Fetching " + cVar3.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), new Object[0]);
                InterfaceC16549B interfaceC16549B3 = k0Var3._viewState;
                do {
                    value = interfaceC16549B3.getValue();
                    ViewState viewState3 = (ViewState) value;
                    if (Intrinsics.e(cVar3, e.c.b.f39992b)) {
                        viewStateB = ViewState.b(viewState3, null, null, 0, null, null, false, null, DepartmentCarouselDecorator.b(viewState3.getShopByDepartmentDecorator(), null, null, null, new a.Failed(null, null, 3, null), null, 23, null), null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, 0, null, false, 67108735, null);
                    } else {
                        if (!Intrinsics.e(cVar3, e.c.a.f39991b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        viewStateB = ViewState.b(viewState3, null, null, 0, null, null, false, null, null, DepartmentCarouselDecorator.b(viewState3.getShopByDepartmentDecorator(), null, null, null, new a.Failed(null, null, 3, null), null, 23, null), null, null, null, null, null, false, null, null, null, null, null, false, false, null, 0, null, false, 67108607, null);
                    }
                } while (!interfaceC16549B3.e(value, viewStateB));
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$fetchEmailVerificationBannerSettings$1", f = "HomeViewModel.kt", l = {738}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.home.ux.k0$w, reason: case insensitive filesystem */
    static final class C11789w extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f99281a;

        /* renamed from: b, reason: collision with root package name */
        Object f99282b;

        /* renamed from: c, reason: collision with root package name */
        Object f99283c;

        /* renamed from: d, reason: collision with root package name */
        Object f99284d;

        /* renamed from: e, reason: collision with root package name */
        int f99285e;

        /* renamed from: f, reason: collision with root package name */
        int f99286f;

        /* renamed from: g, reason: collision with root package name */
        int f99287g;

        /* renamed from: h, reason: collision with root package name */
        int f99288h;

        /* renamed from: i, reason: collision with root package name */
        int f99289i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f99290j;

        C11789w(Continuation<? super C11789w> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11789w c11789w = k0.this.new C11789w(continuation);
            c11789w.f99290j = obj;
            return c11789w;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C11789w) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            ViewState viewState;
            HomeEmailBannerDecorator homeEmailBannerDecorator;
            Object objC;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f99289i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f99290j;
                    k0 k0Var = k0.this;
                    Result.Companion companion = Result.INSTANCE;
                    C15052a c15052a = k0Var.homeRepository;
                    this.f99290j = interfaceC15783O;
                    this.f99281a = interfaceC15783O;
                    this.f99282b = this;
                    this.f99283c = this;
                    this.f99284d = interfaceC15783O;
                    this.f99285e = 0;
                    this.f99286f = 0;
                    this.f99287g = 0;
                    this.f99288h = 0;
                    this.f99289i = 1;
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
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            k0 k0Var2 = k0.this;
            if (Result.h(objB)) {
                EmailVerificationSpiffs emailVerificationSpiffs = (EmailVerificationSpiffs) objB;
                k0Var2.appPrefManager.G(emailVerificationSpiffs.getSuccess() && !emailVerificationSpiffs.a().isEmpty());
                InterfaceC16549B interfaceC16549B = k0Var2._viewState;
                do {
                    value = interfaceC16549B.getValue();
                    viewState = (ViewState) value;
                    AbstractC6392a.Companion companion3 = AbstractC6392a.INSTANCE;
                    homeEmailBannerDecorator = new HomeEmailBannerDecorator(companion3.d(r0.f99345d, new Object[0]), companion3.d(r0.f99344c, new Object[0]), C.b.a.f.f16921e, companion3.d(r0.f99360s, new Object[0]), false, false, 16, null);
                    if (!(k0Var2.appPrefManager.J() && k0Var2.userManager.b())) {
                        homeEmailBannerDecorator = null;
                    }
                } while (!interfaceC16549B.e(value, ViewState.b(viewState, null, null, 0, null, null, false, null, null, null, null, null, null, null, null, false, homeEmailBannerDecorator, null, null, null, null, false, false, null, 0, null, false, 67076095, null)));
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "Failed to fetch email verification spiff.", new Object[0]);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$fetchEnrollmentOfferResendEmailResponse$1", f = "HomeViewModel.kt", l = {690, 708, 718}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.home.ux.k0$x, reason: case insensitive filesystem */
    static final class C11790x extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f99292a;

        /* renamed from: b, reason: collision with root package name */
        Object f99293b;

        /* renamed from: c, reason: collision with root package name */
        Object f99294c;

        /* renamed from: d, reason: collision with root package name */
        Object f99295d;

        /* renamed from: e, reason: collision with root package name */
        int f99296e;

        /* renamed from: f, reason: collision with root package name */
        int f99297f;

        /* renamed from: g, reason: collision with root package name */
        int f99298g;

        /* renamed from: h, reason: collision with root package name */
        int f99299h;

        /* renamed from: i, reason: collision with root package name */
        int f99300i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f99301j;

        C11790x(Continuation<? super C11790x> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11790x c11790x = k0.this.new C11790x(continuation);
            c11790x.f99301j = obj;
            return c11790x;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(TrackingData trackingData) {
            trackingData.v("mperks");
            trackingData.n("mperks: account creation confirmation");
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C11790x) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x01d1  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x01e4  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0224 A[PHI: r0 r5
          0x0224: PHI (r0v16 java.lang.Object) = (r0v12 java.lang.Object), (r0v12 java.lang.Object), (r0v22 java.lang.Object) binds: [B:35:0x0110, B:78:0x0224, B:53:0x0222] A[DONT_GENERATE, DONT_INLINE]
          0x0224: PHI (r5v7 mv.O) = (r5v5 mv.O), (r5v5 mv.O), (r5v10 mv.O) binds: [B:35:0x0110, B:78:0x0224, B:53:0x0222] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x022c  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x025f  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0270  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r41) {
            /*
                Method dump skipped, instructions count: 716
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.home.ux.k0.C11790x.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$fetchHomeComponents$1", f = "HomeViewModel.kt", l = {493}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.home.ux.k0$y, reason: case insensitive filesystem */
    static final class C11791y extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f99303a;

        /* renamed from: b, reason: collision with root package name */
        Object f99304b;

        /* renamed from: c, reason: collision with root package name */
        Object f99305c;

        /* renamed from: d, reason: collision with root package name */
        Object f99306d;

        /* renamed from: e, reason: collision with root package name */
        int f99307e;

        /* renamed from: f, reason: collision with root package name */
        int f99308f;

        /* renamed from: g, reason: collision with root package name */
        int f99309g;

        /* renamed from: h, reason: collision with root package name */
        int f99310h;

        /* renamed from: i, reason: collision with root package name */
        int f99311i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f99312j;

        C11791y(Continuation<? super C11791y> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11791y c11791y = k0.this.new C11791y(continuation);
            c11791y.f99312j = obj;
            return c11791y;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C11791y) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f99311i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f99312j;
                    k0 k0Var = k0.this;
                    Result.Companion companion = Result.INSTANCE;
                    C15052a c15052a = k0Var.homeRepository;
                    this.f99312j = interfaceC15783O;
                    this.f99303a = interfaceC15783O;
                    this.f99304b = this;
                    this.f99305c = this;
                    this.f99306d = interfaceC15783O;
                    this.f99307e = 0;
                    this.f99308f = 0;
                    this.f99309g = 0;
                    this.f99310h = 0;
                    this.f99311i = 1;
                    obj = c15052a.e(this);
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
            k0 k0Var2 = k0.this;
            if (Result.h(objB)) {
                Iterator it = ((List) objB).iterator();
                while (it.hasNext()) {
                    k0Var2.q0((Vl.e) it.next());
                }
            }
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "Failed to retrieve home cards in HomeViewModel", new Object[0]);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.ux.HomeViewModel$fetchMarketingBanners$1", f = "HomeViewModel.kt", l = {351}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.home.ux.k0$z, reason: case insensitive filesystem */
    static final class C11792z extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f99314a;

        /* renamed from: b, reason: collision with root package name */
        Object f99315b;

        /* renamed from: c, reason: collision with root package name */
        Object f99316c;

        /* renamed from: d, reason: collision with root package name */
        Object f99317d;

        /* renamed from: e, reason: collision with root package name */
        int f99318e;

        /* renamed from: f, reason: collision with root package name */
        int f99319f;

        /* renamed from: g, reason: collision with root package name */
        int f99320g;

        /* renamed from: h, reason: collision with root package name */
        int f99321h;

        /* renamed from: i, reason: collision with root package name */
        int f99322i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f99323j;

        C11792z(Continuation<? super C11792z> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11792z c11792z = k0.this.new C11792z(continuation);
            c11792z.f99323j = obj;
            return c11792z;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C11792z) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            ViewState viewState;
            List<MarketingBanner> listA;
            Object objD;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f99322i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f99323j;
                    k0 k0Var = k0.this;
                    Result.Companion companion = Result.INSTANCE;
                    C15053b c15053b = k0Var.marketingBannerRepository;
                    this.f99323j = interfaceC15783O;
                    this.f99314a = interfaceC15783O;
                    this.f99315b = this;
                    this.f99316c = this;
                    this.f99317d = interfaceC15783O;
                    this.f99318e = 0;
                    this.f99319f = 0;
                    this.f99320g = 0;
                    this.f99321h = 0;
                    this.f99322i = 1;
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
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            k0 k0Var2 = k0.this;
            if (Result.h(objB)) {
                MarketingBannersDecorator marketingBannersDecorator = (MarketingBannersDecorator) objB;
                InterfaceC16549B interfaceC16549B = k0Var2._viewState;
                do {
                    value = interfaceC16549B.getValue();
                    viewState = (ViewState) value;
                    listA = marketingBannersDecorator.a();
                    if (listA == null) {
                        listA = CollectionsKt.m();
                    }
                } while (!interfaceC16549B.e(value, ViewState.b(viewState, null, null, 0, null, null, false, SpecialOffersCarouselDecorator.b(viewState.getSpecialOffersCarouselDecorator(), null, null, null, marketingBannersDecorator.getSpecialOffersBanner(), null, null, 0, 119, null), null, null, null, null, listA, null, null, false, null, null, null, null, null, false, false, null, 0, null, false, 67106751, null)));
            }
            return Unit.f143329a;
        }
    }

    public k0(yo.k userManager, InterfaceC14774f cartProvider, C14536a homeChipsRepository, C14781c orderStatusRepository, zl.k featureManager, C15052a homeRepository, Yk.u couponsStateRepository, C13702d couponsRepository, InterfaceC14523a analyticsEngine, C18335a appPrefManager, Dl.e deeplinkParser, C15053b marketingBannerRepository, fo.e rewardsRepository, wr.f cartInteractor, C15058b productRecommendationsRepository, pp.d productMetadataStore, Ro.c productRepository, C16753b beaconClient, C17115a multiChannelProductsStateRepository, AbstractC15779K ioDispatcher) {
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(cartProvider, "cartProvider");
        Intrinsics.j(homeChipsRepository, "homeChipsRepository");
        Intrinsics.j(orderStatusRepository, "orderStatusRepository");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(homeRepository, "homeRepository");
        Intrinsics.j(couponsStateRepository, "couponsStateRepository");
        Intrinsics.j(couponsRepository, "couponsRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(appPrefManager, "appPrefManager");
        Intrinsics.j(deeplinkParser, "deeplinkParser");
        Intrinsics.j(marketingBannerRepository, "marketingBannerRepository");
        Intrinsics.j(rewardsRepository, "rewardsRepository");
        Intrinsics.j(cartInteractor, "cartInteractor");
        Intrinsics.j(productRecommendationsRepository, "productRecommendationsRepository");
        Intrinsics.j(productMetadataStore, "productMetadataStore");
        Intrinsics.j(productRepository, "productRepository");
        Intrinsics.j(beaconClient, "beaconClient");
        Intrinsics.j(multiChannelProductsStateRepository, "multiChannelProductsStateRepository");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.userManager = userManager;
        this.cartProvider = cartProvider;
        this.homeChipsRepository = homeChipsRepository;
        this.orderStatusRepository = orderStatusRepository;
        this.featureManager = featureManager;
        this.homeRepository = homeRepository;
        this.couponsStateRepository = couponsStateRepository;
        this.couponsRepository = couponsRepository;
        this.analyticsEngine = analyticsEngine;
        this.appPrefManager = appPrefManager;
        this.deeplinkParser = deeplinkParser;
        this.marketingBannerRepository = marketingBannerRepository;
        this.rewardsRepository = rewardsRepository;
        this.cartInteractor = cartInteractor;
        this.productRecommendationsRepository = productRecommendationsRepository;
        this.productMetadataStore = productMetadataStore;
        this.productRepository = productRepository;
        this.beaconClient = beaconClient;
        this.multiChannelProductsStateRepository = multiChannelProductsStateRepository;
        this.ioDispatcher = ioDispatcher;
        this.loadingStateManager = new Pj.c();
        this.disposables = new Ju.a();
        InterfaceC16549B<ViewState> interfaceC16549BA = pv.S.a(new ViewState(null, null, 0, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, 0, null, false, 67108863, null));
        this._viewState = interfaceC16549BA;
        this.viewState = C16563h.c(interfaceC16549BA);
        InterfaceC16548A<AbstractC11777k> interfaceC16548AB = C16555H.b(0, 0, null, 7, null);
        this._effectsFlow = interfaceC16548AB;
        this.effectsFlow = C16563h.b(interfaceC16548AB);
        InterfaceC16549B<AbstractC11774h> interfaceC16549BA2 = pv.S.a(AbstractC11774h.b.f99060a);
        this._bottomSheetContentStateFlow = interfaceC16549BA2;
        this.bottomSheetContentStateFlow = C16563h.c(interfaceC16549BA2);
        InterfaceC16548A<AbstractC11776j> interfaceC16548AB2 = C16555H.b(1, 0, null, 6, null);
        this._dialogFlow = interfaceC16548AB2;
        this.dialogFlow = C16563h.b(interfaceC16548AB2);
        this._toastMessageData = C16555H.b(0, 0, null, 7, null);
        this.cartId = "-1";
        this.cartEntries = CollectionsKt.m();
        C16563h.J(C16563h.O(userManager.E(), new C11767a(null)), androidx.view.d0.a(this));
        C16563h.J(C16563h.O(C16563h.r(cartProvider.a()), new C11768b(null)), androidx.view.d0.a(this));
        C16563h.J(C16563h.O(homeChipsRepository.b(), new C11769c(null)), androidx.view.d0.a(this));
        if (featureManager.e(AbstractC18503f.C.f172844h)) {
            loadGoogleAd();
        }
        C16563h.J(C16563h.O(C16563h.g(C16563h.H(couponsStateRepository.M(), ioDispatcher), new C11770d(null)), new C11771e(this)), androidx.view.d0.a(this));
        multiChannelProductsStateRepository.b(new C17115a.InterfaceC2527a() { // from class: com.meijer.mobile.home.ux.X
            @Override // sp.C17115a.InterfaceC2527a
            public final void a(Object obj, sp.Y y10) {
                k0.C(this.f98825a, obj, y10);
            }
        });
        configureFeatureEntryPoints();
        fetchEmailVerificationBannerSettings();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double C0() {
        return 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double E0() {
        return 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a1(List<ExpiringPoints> expiringPoints) {
        AbstractC11774h value;
        int points;
        AbstractC6392a.Companion companion;
        AbstractC6392a abstractC6392aD;
        int iB;
        if (expiringPoints.isEmpty()) {
            return;
        }
        List<ExpiringPoints> list = expiringPoints;
        Iterator<T> it = list.iterator();
        int points2 = 0;
        while (it.hasNext()) {
            points2 += ((ExpiringPoints) it.next()).getPoints();
        }
        if (points2 == 0 || this.userManager.i0()) {
            return;
        }
        yo.k kVar = this.userManager;
        String string = LocalDateTime.now().toString();
        Intrinsics.i(string, "toString(...)");
        kVar.L(string);
        LocalDate expiresOn = ((ExpiringPoints) CollectionsKt.s0(expiringPoints)).getExpiresOn();
        if (expiresOn != null) {
            InterfaceC16549B<AbstractC11774h> interfaceC16549B = this._bottomSheetContentStateFlow;
            do {
                value = interfaceC16549B.getValue();
                Iterator<T> it2 = list.iterator();
                points = 0;
                while (it2.hasNext()) {
                    points += ((ExpiringPoints) it2.next()).getPoints();
                }
                companion = AbstractC6392a.INSTANCE;
                abstractC6392aD = companion.d(ns.u.f153197r, expiresOn.format(C17898a.DATE_SLASHES_SHORT));
                iB = os.g0.b(expiresOn, null, 1, null);
            } while (!interfaceC16549B.e(value, new AbstractC11774h.MperksPointsExpiryBottomSheet(points, abstractC6392aD, iB == 0 ? companion.d(ns.u.f153195q, new Object[0]) : companion.b(ns.t.f153136a, iB, new Object[0]))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double d1() {
        return 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e1() {
        return 0;
    }

    private final String getCarouselType(EnumC15218a carouselType) {
        int i10 = C11780n.$EnumSwitchMapping$0[carouselType.ordinal()];
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

    private final List<Pk.f> getCouponList(EntryChange entryChange) {
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
            Iterator<T> it2 = this.viewState.getValue().h().values().iterator();
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

    public final void onAction(AbstractC14072a action) {
        ViewState value;
        ViewState viewState;
        ViewState value2;
        ViewState viewState2;
        ViewState value3;
        ViewState viewState3;
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC14072a.OnLoadBeacon) {
            AbstractC14072a.OnLoadBeacon onLoadBeacon = (AbstractC14072a.OnLoadBeacon) action;
            if (onLoadBeacon.getBeaconUrl().length() <= 0 || this.viewState.getValue().getCriteoBeaconsTracker().f().contains(onLoadBeacon.getBeaconUrl())) {
                return;
            }
            List<String> listE = CollectionsKt.e(onLoadBeacon.getBeaconUrl());
            Ul.a aVar = Ul.a.f37566b;
            sendCriteoBeacon(listE, aVar, onLoadBeacon.getIsFormatLevel(), onLoadBeacon.getCarouselType());
            sendBeaconToastMessage(aVar, onLoadBeacon.getIsFormatLevel(), onLoadBeacon.getProduct());
            InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
            do {
                value3 = interfaceC16549B.getValue();
                viewState3 = value3;
            } while (!interfaceC16549B.e(value3, ViewState.b(viewState3, null, null, 0, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, BeaconsTracker.b(viewState3.getCriteoBeaconsTracker(), null, null, null, CollectionsKt.P0(viewState3.getCriteoBeaconsTracker().f(), CollectionsKt.e(onLoadBeacon.getBeaconUrl())), null, null, null, null, 247, null), 0, null, false, 62914559, null)));
            return;
        }
        if (action instanceof AbstractC14072a.OnViewBeacon) {
            AbstractC14072a.OnViewBeacon onViewBeacon = (AbstractC14072a.OnViewBeacon) action;
            EnumC15218a carouselType = onViewBeacon.getCarouselType();
            if (carouselType == null) {
                return;
            }
            if (L0(this, carouselType, onViewBeacon.a())) {
                qw.a.INSTANCE.z("sentBeacon").a("Beacon already sent for URL: " + onViewBeacon.a() + " for carousel type: " + carouselType, new Object[0]);
                return;
            }
            List<String> listA = onViewBeacon.a();
            Ul.a aVar2 = Ul.a.f37567c;
            sendCriteoBeacon(listA, aVar2, onViewBeacon.getIsFormatLevel(), carouselType);
            sendBeaconToastMessage(aVar2, onViewBeacon.getIsFormatLevel(), onViewBeacon.getProduct());
            R0(this, carouselType, onViewBeacon.a());
            qw.a.INSTANCE.z("sentBeacon").a("Beacon sent for URL: " + onViewBeacon.a() + " for carousel type: " + carouselType, new Object[0]);
            return;
        }
        if (action instanceof AbstractC14072a.OnBasketChangeBeacon) {
            AbstractC14072a.OnBasketChangeBeacon onBasketChangeBeacon = (AbstractC14072a.OnBasketChangeBeacon) action;
            if (this._viewState.getValue().getCriteoBeaconsTracker().c().contains(onBasketChangeBeacon.getBeaconUrl())) {
                return;
            }
            List listE2 = CollectionsKt.e(onBasketChangeBeacon.getBeaconUrl());
            Ul.a aVar3 = Ul.a.f37569e;
            Z0(this, listE2, aVar3, false, onBasketChangeBeacon.getCarouselType(), 4, null);
            Y0(this, aVar3, false, onBasketChangeBeacon.getProduct(), 2, null);
            InterfaceC16549B<ViewState> interfaceC16549B2 = this._viewState;
            do {
                value2 = interfaceC16549B2.getValue();
                viewState2 = value2;
            } while (!interfaceC16549B2.e(value2, ViewState.b(viewState2, null, null, 0, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, BeaconsTracker.b(viewState2.getCriteoBeaconsTracker(), null, null, null, null, null, CollectionsKt.P0(viewState2.getCriteoBeaconsTracker().c(), CollectionsKt.e(onBasketChangeBeacon.getBeaconUrl())), null, null, 223, null), 0, null, false, 62914559, null)));
            return;
        }
        if (!(action instanceof AbstractC14072a.OnClickBeacon)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC14072a.OnClickBeacon onClickBeacon = (AbstractC14072a.OnClickBeacon) action;
        if (this._viewState.getValue().getCriteoBeaconsTracker().d().containsAll(onClickBeacon.a())) {
            return;
        }
        List<String> listA2 = onClickBeacon.a();
        Ul.a aVar4 = Ul.a.f37568d;
        sendCriteoBeacon(listA2, aVar4, onClickBeacon.getIsFormatLevel(), onClickBeacon.getCarouselType());
        sendBeaconToastMessage(aVar4, onClickBeacon.getIsFormatLevel(), onClickBeacon.getProduct());
        InterfaceC16549B<ViewState> interfaceC16549B3 = this._viewState;
        do {
            value = interfaceC16549B3.getValue();
            viewState = value;
        } while (!interfaceC16549B3.e(value, ViewState.b(viewState, null, null, 0, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, BeaconsTracker.b(viewState.getCriteoBeaconsTracker(), null, null, null, null, CollectionsKt.P0(viewState.getCriteoBeaconsTracker().d(), onClickBeacon.a()), null, null, null, 239, null), 0, null, false, 62914559, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(final k0 k0Var, final Object key, sp.Y repo) {
        Intrinsics.j(key, "key");
        Intrinsics.j(repo, "repo");
        io.reactivex.l<List<ProductState<ProductFullDetails>>> lVarSubscribeOn = repo.Y0().subscribeOn(C13889a.b());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.home.ux.Y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k0.n(key, k0Var, (List) obj);
            }
        };
        Lu.g<? super List<ProductState<ProductFullDetails>>> gVar = new Lu.g() { // from class: com.meijer.mobile.home.ux.Z
            @Override // Lu.g
            public final void accept(Object obj) {
                k0.w(function1, obj);
            }
        };
        final C11772f c11772f = new C11772f(qw.a.INSTANCE);
        Dk.a.a(lVarSubscribeOn.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.home.ux.a0
            @Override // Lu.g
            public final void accept(Object obj) {
                k0.B(c11772f, obj);
            }
        }), k0Var.disposables);
    }

    private static final boolean L0(k0 k0Var, EnumC15218a enumC15218a, List<String> list) {
        return k0Var._viewState.getValue().getCriteoBeaconsTracker().g(enumC15218a).containsAll(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M0(AbstractC13720b abstractC13720b, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        AbstractC13720b.DepartmentClicked departmentClicked = (AbstractC13720b.DepartmentClicked) abstractC13720b;
        track.h("tierName", departmentClicked.getName());
        track.p(departmentClicked.getCarouselTitle() + ": carousel option click");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N0(AbstractC13720b abstractC13720b, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("collections");
        track.o("collections");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Collection|");
        AbstractC13720b.DepartmentClicked departmentClicked = (AbstractC13720b.DepartmentClicked) abstractC13720b;
        sb2.append(departmentClicked.getName());
        track.h("hier1", sb2.toString());
        track.p(departmentClicked.getCarouselTitle() + ": carousel option click");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O0(AbstractC13720b abstractC13720b, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        AbstractC13720b.DepartmentClicked departmentClicked = (AbstractC13720b.DepartmentClicked) abstractC13720b;
        track.h("tierName", departmentClicked.getName());
        track.o("category");
        track.p(departmentClicked.getCarouselTitle() + ": carousel option click");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P0(AbstractC13720b abstractC13720b, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("tierName", ((AbstractC13720b.DepartmentClicked) abstractC13720b).getName());
        track.p("shop department carousel: tier 1 category");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q0(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("Teacher's List");
        track.n("home");
        return Unit.f143329a;
    }

    private static final void R0(k0 k0Var, EnumC15218a enumC15218a, List<String> list) {
        ViewState value;
        ViewState viewState;
        InterfaceC16549B<ViewState> interfaceC16549B = k0Var._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
        } while (!interfaceC16549B.e(value, ViewState.b(viewState, null, null, 0, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, Ul.c.a(viewState.getCriteoBeaconsTracker(), enumC15218a, list), 0, null, false, 62914559, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S0(Vl.j productCardDataResource, e.f.b productComponent) {
        ViewState value;
        ViewState viewState;
        Map<e.f, CarouselDecorator> mapQ;
        String cardTitle;
        String str;
        String carouselBanner;
        EnumC15218a enumC15218a;
        if (productCardDataResource != null) {
            InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
            do {
                value = interfaceC16549B.getValue();
                viewState = value;
                mapQ = viewState.q();
                cardTitle = productCardDataResource.getCardTitle();
                String seeAllDeepLink = productCardDataResource.getSeeAllDeepLink();
                if (seeAllDeepLink == null) {
                    seeAllDeepLink = "";
                }
                str = seeAllDeepLink;
                carouselBanner = productCardDataResource.getCarouselBanner();
                enumC15218a = EnumC15218a.f142569c;
            } while (!interfaceC16549B.e(value, ViewState.b(viewState, null, null, 0, null, null, false, null, null, null, null, null, null, null, null, false, null, null, MapsKt.u(mapQ, MapsKt.g(TuplesKt.a(productComponent, new CarouselDecorator(carouselBanner, productComponent.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), new a.NotLoading(null, 1, null), Integer.valueOf(Cj.i.f4768c), cardTitle, str, enumC15218a)))), null, null, false, false, null, 0, null, false, 66977791, null)));
            this.multiChannelProductsStateRepository.c(productComponent, productCardDataResource.c());
        }
    }

    private final void T0(e.f key, List<ProductState<ProductFullDetails>> productState) {
        ViewState value;
        ViewState viewState;
        Map<String, CouponState> mapH;
        LinkedHashMap linkedHashMap;
        ViewState value2;
        ViewState viewState2;
        Map<e.f, List<ProductListDecorator>> mapR;
        ArrayList arrayList;
        if (!this.skipProductCarouselUpdates) {
            InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
            do {
                value2 = interfaceC16549B.getValue();
                viewState2 = value2;
                mapR = viewState2.r();
                List<ProductState<ProductFullDetails>> list = productState;
                arrayList = new ArrayList(CollectionsKt.x(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(b1((ProductState) it.next(), viewState2.getStepperIdInInteraction(), viewState2.getIsStepperInTransition(), viewState2.getResetStepper()));
                }
            } while (!interfaceC16549B.e(value2, ViewState.b(viewState2, null, null, 0, null, null, false, null, null, null, null, null, null, null, null, false, null, MapsKt.u(mapR, MapsKt.g(TuplesKt.a(key, C17728h.c(arrayList, this.featureManager.e(AbstractC18503f.k0.f172887h), this.featureManager.e(AbstractC18503f.l0.f172889h))))), null, null, null, false, false, null, 0, null, false, 67043327, null)));
        }
        this.skipProductCarouselUpdates = false;
        InterfaceC16549B<ViewState> interfaceC16549B2 = this._viewState;
        do {
            value = interfaceC16549B2.getValue();
            viewState = value;
            mapH = viewState.h();
            List<ProductState<ProductFullDetails>> list2 = productState;
            linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(list2, 10)), 16));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                ProductState productState2 = (ProductState) it2.next();
                Pair pairA = TuplesKt.a(((ProductFullDetails) productState2.g()).getCode(), CollectionsKt.u0(productState2.d()));
                linkedHashMap.put(pairA.c(), pairA.d());
            }
        } while (!interfaceC16549B2.e(value, ViewState.b(viewState, null, null, 0, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, MapsKt.u(mapH, linkedHashMap), null, false, false, null, 0, null, false, 66846719, null)));
    }

    static /* synthetic */ void U0(k0 k0Var, String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        k0Var.onStepperInteractionChange(str, z10, z11);
    }

    private final void V0(ProductFullDetails product, double quantityToUpdate) {
        if (!this.userManager.b()) {
            onStepperInteractionChange(product.getCode(), true, true);
            C15809k.d(androidx.view.d0.a(this), null, null, new Z(null), 3, null);
        } else {
            onStepperInteractionChange(product.getCode(), false, true);
            if (fj.l.a(this.cartEntries, product.getCode()) == null) {
                this.skipProductCarouselUpdates = true;
            }
            wr.f.M(this.cartInteractor, product, quantityToUpdate, false, null, 12, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c0, code lost:
    
        if (clipCoupon(r2, r4, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X0(Qk.a.Clip r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.meijer.mobile.home.ux.k0.h0
            if (r0 == 0) goto L13
            r0 = r9
            com.meijer.mobile.home.ux.k0$h0 r0 = (com.meijer.mobile.home.ux.k0.h0) r0
            int r1 = r0.f99072l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f99072l = r1
            goto L18
        L13:
            com.meijer.mobile.home.ux.k0$h0 r0 = new com.meijer.mobile.home.ux.k0$h0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f99070j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f99072l
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L5a
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r8 = r0.f99063c
            Pk.a r8 = (Pk.Coupon) r8
            java.lang.Object r8 = r0.f99062b
            java.lang.Object r0 = r0.f99061a
            Qk.a$a r0 = (Qk.a.Clip) r0
            kotlin.ResultKt.b(r9)
            goto Lc3
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            java.lang.Object r8 = r0.f99065e
            com.meijer.mobile.home.ux.k0 r8 = (com.meijer.mobile.home.ux.k0) r8
            java.lang.Object r8 = r0.f99064d
            kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
            java.lang.Object r8 = r0.f99063c
            kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
            java.lang.Object r8 = r0.f99062b
            com.meijer.mobile.home.ux.k0 r8 = (com.meijer.mobile.home.ux.k0) r8
            java.lang.Object r8 = r0.f99061a
            Qk.a$a r8 = (Qk.a.Clip) r8
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Exception -> L58
            goto L86
        L58:
            r9 = move-exception
            goto L8e
        L5a:
            kotlin.ResultKt.b(r9)
            kotlin.Result$Companion r9 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L58
            dl.d r9 = P(r7)     // Catch: java.lang.Exception -> L58
            Pk.c r2 = r8.getCoupon()     // Catch: java.lang.Exception -> L58
            pv.f r9 = r9.j(r2)     // Catch: java.lang.Exception -> L58
            r0.f99061a = r8     // Catch: java.lang.Exception -> L58
            r0.f99062b = r7     // Catch: java.lang.Exception -> L58
            r0.f99063c = r0     // Catch: java.lang.Exception -> L58
            r0.f99064d = r0     // Catch: java.lang.Exception -> L58
            r0.f99065e = r7     // Catch: java.lang.Exception -> L58
            r0.f99066f = r5     // Catch: java.lang.Exception -> L58
            r0.f99067g = r5     // Catch: java.lang.Exception -> L58
            r0.f99068h = r5     // Catch: java.lang.Exception -> L58
            r0.f99069i = r5     // Catch: java.lang.Exception -> L58
            r0.f99072l = r4     // Catch: java.lang.Exception -> L58
            java.lang.Object r9 = pv.C16563h.A(r9, r0)     // Catch: java.lang.Exception -> L58
            if (r9 != r1) goto L86
            goto Lc2
        L86:
            java.lang.Object r9 = kotlin.Result.b(r9)     // Catch: java.lang.Exception -> L58
        L8a:
            r6 = r9
            r9 = r8
            r8 = r6
            goto La0
        L8e:
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            mv.E0.i(r2)
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            java.lang.Object r9 = kotlin.ResultKt.a(r9)
            java.lang.Object r9 = kotlin.Result.b(r9)
            goto L8a
        La0:
            boolean r2 = kotlin.Result.h(r8)
            if (r2 == 0) goto Lc3
            r2 = r8
            Pk.a r2 = (Pk.Coupon) r2
            ii.f r4 = r9.getTrackingData()
            r0.f99061a = r9
            r0.f99062b = r8
            r0.f99063c = r2
            r9 = 0
            r0.f99064d = r9
            r0.f99065e = r9
            r0.f99066f = r5
            r0.f99072l = r3
            java.lang.Object r9 = r7.clipCoupon(r2, r4, r0)
            if (r9 != r1) goto Lc3
        Lc2:
            return r1
        Lc3:
            java.lang.Throwable r8 = kotlin.Result.e(r8)
            if (r8 == 0) goto Ld2
            qw.a$a r9 = qw.a.INSTANCE
            java.lang.String r0 = "Failed to fetch coupon on home screen."
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r9.f(r8, r0, r1)
        Ld2:
            kotlin.Unit r8 = kotlin.Unit.f143329a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.home.ux.k0.X0(Qk.a$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static /* synthetic */ void Y0(k0 k0Var, Ul.a aVar, boolean z10, nk.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        k0Var.sendBeaconToastMessage(aVar, z10, cVar);
    }

    static /* synthetic */ void Z0(k0 k0Var, List list, Ul.a aVar, boolean z10, EnumC15218a enumC15218a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            enumC15218a = null;
        }
        k0Var.sendCriteoBeacon(list, aVar, z10, enumC15218a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object addCartEntry(ur.AbstractC17454a r14, uk.c<fj.EntryChange> r15, java.lang.String r16, kotlin.coroutines.Continuation<? super kotlin.Unit> r17) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.home.ux.k0.addCartEntry(ur.a, uk.c, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final ProductListDecorator b1(ProductState<ProductFullDetails> productState, String str, boolean z10, boolean z11) {
        boolean z12;
        CouponState couponState = (CouponState) CollectionsKt.u0(productState.d());
        ProductListDecorator.Companion companion = ProductListDecorator.INSTANCE;
        ProductFullDetails productFullDetails = (ProductFullDetails) productState.g();
        CartEntry cartEntry = productState.getCartEntry();
        boolean z13 = true;
        if (Intrinsics.e(productState.getCode(), str) && z10) {
            z12 = true;
        } else {
            z12 = true;
            z13 = false;
        }
        return ProductListDecorator.Companion.b(companion, productFullDetails, null, null, cartEntry, z13, productState.getEligibility().i(), productState.getEligibility().k(), (Intrinsics.e(productState.getCode(), str) && z11) ? z12 : false, null, couponState != null ? Qr.a.d(couponState) : null, couponState != null ? couponState.getCoupon() : null, false, null, null, false, 0, 63750, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c1(Pj.a loadingState, EnumC15218a carouselType, e.f productComponent) {
        ViewState value;
        ViewState viewState;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
        } while (!interfaceC16549B.e(value, ViewState.b(viewState, null, null, 0, null, null, false, null, null, null, null, null, null, null, null, false, null, null, MapsKt.u(viewState.q(), MapsKt.g(TuplesKt.a(productComponent, new CarouselDecorator(null, productComponent.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), loadingState, null, "", "", carouselType, 9, null)))), null, null, false, false, null, 0, null, false, 66977791, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x016e, code lost:
    
        if (r8.emit(r11, r3) == r4) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f4 A[PHI: r0 r2 r5
      0x00f4: PHI (r0v14 Pk.a) = (r0v11 Pk.a), (r0v16 Pk.a) binds: [B:36:0x00d5, B:41:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x00f4: PHI (r2v6 java.lang.Object) = (r2v4 java.lang.Object), (r2v7 java.lang.Object) binds: [B:36:0x00d5, B:41:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x00f4: PHI (r5v7 ii.f) = (r5v5 ii.f), (r5v8 ii.f) binds: [B:36:0x00d5, B:41:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object clipCoupon(Pk.Coupon r52, ii.TrackingData r53, kotlin.coroutines.Continuation<? super kotlin.Unit> r54) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.home.ux.k0.clipCoupon(Pk.a, ii.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void configureFeatureEntryPoints() {
        ViewState value;
        e.d.a aVar;
        AbstractC6392a.Companion companion;
        if (this.featureManager.e(AbstractC18503f.o0.f172893h)) {
            InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
            do {
                value = interfaceC16549B.getValue();
                aVar = e.d.a.f39999g;
                companion = AbstractC6392a.INSTANCE;
            } while (!interfaceC16549B.e(value, ViewState.b(value, null, null, 0, null, null, false, null, null, null, null, null, null, new TeachersListCardDecorator(companion.d(aVar.getTitle(), new Object[0]), companion.d(aVar.getDescription(), new Object[0]), companion.d(aVar.getActionButtonTitle(), new Object[0]), aVar.getImage(), aVar.getDestinationDeeplink()), null, false, null, null, null, null, null, false, false, null, 0, null, false, 67104767, null)));
        }
    }

    private final void dismissEmailVerificationBanner() {
        ViewState value;
        this.appPrefManager.L(Instant.now().toEpochMilli());
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, null, null, 0, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, 0, null, false, 67076095, null)));
    }

    private final void fetchDepartmentCarousel(e.c component) {
        if (!(component instanceof e.c.a) || this.featureManager.e(AbstractC18503f.c0.f172871h)) {
            C15809k.d(androidx.view.d0.a(this), null, null, new C11788v(component, null), 3, null);
        }
    }

    private final void fetchPersonalizedProductCard(e.f productComponent) {
        EnumC15218a enumC15218a = (!(productComponent instanceof e.f.a) && (productComponent instanceof e.f.c)) ? EnumC15218a.f142568b : EnumC15218a.f142567a;
        C15809k.d(androidx.view.d0.a(this), null, null, new C(enumC15218a, productComponent, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchProductsForV3Carousel(Vl.ProductCarouselV3 r38, Vl.e.f.d r39, kotlin.coroutines.Continuation<? super kotlin.Unit> r40) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.home.ux.k0.fetchProductsForV3Carousel(Vl.k, Vl.e$f$d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrackingData getClipCouponTrackingData(final Coupon coupon, final EnumC15218a carouselType) {
        Object next;
        Coupon coupon2;
        Iterator<T> it = this.viewState.getValue().h().values().iterator();
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
        return C14760g.a(C14756c.a("coupon clip"), new Function1() { // from class: com.meijer.mobile.home.ux.W
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k0.x0(coupon, this, carouselType, couponState2, (TrackingData) obj);
            }
        });
    }

    private final CouponState getCouponState(final String productCode, boolean logError) {
        final Map<String, CouponState> mapH = this.viewState.getValue().h();
        try {
            return (CouponState) MapsKt.l(mapH, productCode);
        } catch (NoSuchElementException e10) {
            qw.a.INSTANCE.z("Bug #1517298").u(e10, "Failed to find " + productCode + " in couponStatesMap with keys " + mapH.keySet(), new Object[0]);
            if (!logError) {
                return null;
            }
            this.analyticsEngine.b(C14756c.h("bug:1517289"), new Function1() { // from class: com.meijer.mobile.home.ux.V
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k0.z0(productCode, mapH, (TrackingData) obj);
                }
            });
            return null;
        }
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
            return C18328d.a(dValueOf, new Function0() { // from class: com.meijer.mobile.home.ux.b0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Double.valueOf(k0.C0());
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
        return C18328d.a(dValueOf, new Function0() { // from class: com.meijer.mobile.home.ux.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Double.valueOf(k0.E0());
            }
        });
    }

    public static Unit n(Object obj, k0 k0Var, List list) {
        if ((obj instanceof e.f ? (e.f) obj : null) != null) {
            Intrinsics.g(list);
            k0Var.T0((e.f) obj, list);
        } else {
            qw.a.INSTANCE.k("Received products state unsupported key: " + obj, new Object[0]);
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o0(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.meijer.mobile.home.ux.k0.C11786t
            if (r0 == 0) goto L13
            r0 = r6
            com.meijer.mobile.home.ux.k0$t r0 = (com.meijer.mobile.home.ux.k0.C11786t) r0
            int r1 = r0.f99256k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f99256k = r1
            goto L18
        L13:
            com.meijer.mobile.home.ux.k0$t r0 = new com.meijer.mobile.home.ux.k0$t
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f99254i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f99256k
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r1 = r0.f99249d
            com.meijer.mobile.home.ux.k0 r1 = (com.meijer.mobile.home.ux.k0) r1
            java.lang.Object r1 = r0.f99248c
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f99247b
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f99246a
            com.meijer.mobile.home.ux.k0 r1 = (com.meijer.mobile.home.ux.k0) r1
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Exception -> L3a
            goto L70
        L3a:
            r6 = move-exception
            goto L75
        L3c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L44:
            kotlin.ResultKt.b(r6)
            yo.k r6 = r5.userManager
            boolean r6 = r6.b()
            if (r6 == 0) goto La7
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3a
            jp.b r6 = X(r5)     // Catch: java.lang.Exception -> L3a
            nk.d r2 = nk.d.f152479b     // Catch: java.lang.Exception -> L3a
            r0.f99246a = r5     // Catch: java.lang.Exception -> L3a
            r0.f99247b = r0     // Catch: java.lang.Exception -> L3a
            r0.f99248c = r0     // Catch: java.lang.Exception -> L3a
            r0.f99249d = r5     // Catch: java.lang.Exception -> L3a
            r0.f99250e = r4     // Catch: java.lang.Exception -> L3a
            r0.f99251f = r4     // Catch: java.lang.Exception -> L3a
            r0.f99252g = r4     // Catch: java.lang.Exception -> L3a
            r0.f99253h = r4     // Catch: java.lang.Exception -> L3a
            r0.f99256k = r3     // Catch: java.lang.Exception -> L3a
            java.lang.Object r6 = r6.c(r2, r0)     // Catch: java.lang.Exception -> L3a
            if (r6 != r1) goto L70
            return r1
        L70:
            java.lang.Object r6 = kotlin.Result.b(r6)     // Catch: java.lang.Exception -> L3a
            goto L86
        L75:
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            mv.E0.i(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r6 = kotlin.ResultKt.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
        L86:
            boolean r0 = kotlin.Result.h(r6)
            if (r0 == 0) goto L94
            r0 = r6
            java.util.List r0 = (java.util.List) r0
            pp.d r1 = r5.productMetadataStore
            r1.a(r0)
        L94:
            java.lang.Throwable r0 = kotlin.Result.e(r6)
            if (r0 == 0) goto La3
            qw.a$a r1 = qw.a.INSTANCE
            java.lang.String r2 = "Fetch recommended or buy-again upc failed"
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r1.f(r0, r2, r3)
        La3:
            kotlin.Result.a(r6)
            goto Lac
        La7:
            pp.d r6 = r5.productMetadataStore
            r6.b()
        Lac:
            kotlin.Unit r6 = kotlin.Unit.f143329a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.home.ux.k0.o0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void onCouponState(List<CouponState> couponStateList) {
        ViewState value;
        ViewState viewState;
        SpecialOffersCarouselDecorator specialOffersCarouselDecorator;
        AbstractC6392a abstractC6392aD;
        List listB1;
        int i10;
        int size;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
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
            List listZ0 = CollectionsKt.Z0(arrayList2, new W(new V()));
            specialOffersCarouselDecorator = viewState.getSpecialOffersCarouselDecorator();
            abstractC6392aD = AbstractC6392a.INSTANCE.d(r0.f99366y, Integer.valueOf(listZ0.size()));
            listB1 = CollectionsKt.b1(listZ0, 3);
            i10 = Cj.i.f4799j2;
            size = listZ0.size();
        } while (!interfaceC16549B.e(value, ViewState.b(viewState, null, null, 0, null, null, false, SpecialOffersCarouselDecorator.b(specialOffersCarouselDecorator, abstractC6392aD, null, listB1, null, Integer.valueOf(i10), new a.NotLoading(null, 1, null), size, 10, null), null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, 0, null, false, 67108799, null)));
    }

    private final void onProductCouponButtonClicked(Pk.c couponIdentity, EnumC15218a carouselType) {
        C16563h.J(C16563h.O(C16563h.g(C16563h.H(C16563h.Z(this.couponsRepository.j(couponIdentity), 1), this.ioDispatcher), new X(null)), new Y(couponIdentity, carouselType, null)), androidx.view.d0.a(this));
    }

    private final void onStepperInteractionChange(String activeStepperId, boolean resetStepper, boolean inTransition) {
        String str = activeStepperId;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        while (true) {
            ViewState value = interfaceC16549B.getValue();
            ViewState viewState = value;
            Map<e.f, List<ProductListDecorator>> mapR = viewState.r();
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.f(mapR.size()));
            Iterator<T> it = mapR.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                List<ProductListDecorator> list = (List) entry.getValue();
                ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
                for (ProductListDecorator productListDecorator : list) {
                    arrayList.add(productListDecorator.u(((-201326593) & 1) != 0 ? productListDecorator.id : null, ((-201326593) & 2) != 0 ? productListDecorator.isSelected : false, ((-201326593) & 4) != 0 ? productListDecorator.upc : null, ((-201326593) & 8) != 0 ? productListDecorator.title : null, ((-201326593) & 16) != 0 ? productListDecorator.hasUnsavedShoppingListItem : false, ((-201326593) & 32) != 0 ? productListDecorator.listItemId : null, ((-201326593) & 64) != 0 ? productListDecorator.thumbnail : null, ((-201326593) & 128) != 0 ? productListDecorator.thumbnailUrl : null, ((-201326593) & 256) != 0 ? productListDecorator.thumbnailDescription : null, ((-201326593) & 512) != 0 ? productListDecorator.department : null, ((-201326593) & 1024) != 0 ? productListDecorator.isOnSale : false, ((-201326593) & RecyclerView.m.FLAG_MOVED) != 0 ? productListDecorator.showWeightInfo : false, ((-201326593) & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? productListDecorator.hasMPerksOffers : false, ((-201326593) & 8192) != 0 ? productListDecorator.currentPrice : null, ((-201326593) & 16384) != 0 ? productListDecorator.regularPrice : null, ((-201326593) & 32768) != 0 ? productListDecorator.weightUnitSizeAndPrice : null, ((-201326593) & 65536) != 0 ? productListDecorator.amountSaved : null, ((-201326593) & 131072) != 0 ? productListDecorator.quantityText : null, ((-201326593) & 262144) != 0 ? productListDecorator.priceGoodThroughDate : null, ((-201326593) & 524288) != 0 ? productListDecorator.isAddedToShoppingList : false, ((-201326593) & 1048576) != 0 ? productListDecorator.errorImageResource : 0, ((-201326593) & 2097152) != 0 ? productListDecorator.shoppingListItem : null, ((-201326593) & 4194304) != 0 ? productListDecorator.product : null, ((-201326593) & 8388608) != 0 ? productListDecorator.cartEntry : null, ((-201326593) & 16777216) != 0 ? productListDecorator.storeAvailability : null, ((-201326593) & 33554432) != 0 ? productListDecorator.cartEligibility : null, ((-201326593) & 67108864) != 0 ? productListDecorator.inQtyStepperInteraction : Intrinsics.e(productListDecorator.getUpc(), str) && inTransition, ((-201326593) & 134217728) != 0 ? productListDecorator.resetStepperState : Intrinsics.e(productListDecorator.getUpc(), str) && resetStepper, ((-201326593) & 268435456) != 0 ? productListDecorator.productQuery : null, ((-201326593) & 536870912) != 0 ? productListDecorator.couponCountDownStateDecorator : null, ((-201326593) & 1073741824) != 0 ? productListDecorator.coupon : null, ((-201326593) & Integer.MIN_VALUE) != 0 ? productListDecorator.complexPromo : null, (511 & 1) != 0 ? productListDecorator.isBuyAgain : false, (511 & 2) != 0 ? productListDecorator.isBopas : false, (511 & 4) != 0 ? productListDecorator.sponsorship : null, (511 & 8) != 0 ? productListDecorator.productRatings : null, (511 & 16) != 0 ? productListDecorator.showQuantityRequested : false, (511 & 32) != 0 ? productListDecorator.quantityRequested : 0, (511 & 64) != 0 ? productListDecorator.currentPriceDescription : null, (511 & 128) != 0 ? productListDecorator.productContainsTag : false, (511 & 256) != 0 ? productListDecorator.regularPriceDescription : null));
                }
                linkedHashMap.put(key, arrayList);
            }
            InterfaceC16549B<ViewState> interfaceC16549B2 = interfaceC16549B;
            if (interfaceC16549B2.e(value, ViewState.b(viewState, null, null, 0, null, null, false, null, null, null, null, null, null, null, null, false, null, linkedHashMap, null, null, str, inTransition, resetStepper, null, 0, null, false, 63373311, null))) {
                return;
            }
            interfaceC16549B = interfaceC16549B2;
            str = activeStepperId;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processMperksState(long couponId, boolean isRedeemedSuccessfully) {
        ViewState value;
        ViewState viewState;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
        } while (!interfaceC16549B.e(value, ViewState.b(viewState, null, null, 0, null, null, false, null, null, null, null, null, null, null, HomeMperksDecorator.b(viewState.getMPerksDecorator(), null, null, 0, null, null, null, viewState.getMPerksDecorator().j(couponId, isRedeemedSuccessfully), false, 191, null), false, null, null, null, null, null, false, false, null, 0, null, false, 67100671, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0(Vl.e homeComponent) {
        if (homeComponent instanceof e.b.SpecialOffers) {
            if (this.userManager.b()) {
                fetchSpecialOffers();
            }
        } else {
            if (homeComponent instanceof e.c) {
                fetchDepartmentCarousel((e.c) homeComponent);
                return;
            }
            if (Intrinsics.e(homeComponent, e.C0857e.f40000a)) {
                t0(true);
            } else if (homeComponent instanceof e.f) {
                u0((e.f) homeComponent);
            } else if (!(homeComponent instanceof e.a) && !Intrinsics.e(homeComponent, e.d.a.f39999g)) {
                throw new NoWhenBranchMatchedException();
            }
        }
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
            boolean r0 = r15 instanceof com.meijer.mobile.home.ux.k0.g0
            if (r0 == 0) goto L13
            r0 = r15
            com.meijer.mobile.home.ux.k0$g0 r0 = (com.meijer.mobile.home.ux.k0.g0) r0
            int r1 = r0.f99055f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f99055f = r1
            goto L18
        L13:
            com.meijer.mobile.home.ux.k0$g0 r0 = new com.meijer.mobile.home.ux.k0$g0
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f99053d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f99055f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L53
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r12 = r0.f99052c
            r14 = r12
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r12 = r0.f99051b
            uk.c r12 = (uk.c) r12
            java.lang.Object r12 = r0.f99050a
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
            java.lang.Object r12 = r0.f99052c
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r0.f99051b
            uk.c r12 = (uk.c) r12
            java.lang.Object r12 = r0.f99050a
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
            pv.A<com.meijer.mobile.home.ux.k0$k> r15 = r11._effectsFlow
            com.meijer.mobile.home.ux.k0$k$l r5 = new com.meijer.mobile.home.ux.k0$k$l
            int r6 = tr.C17284b.f163336n0
            int r7 = tr.C17284b.f163301T0
            r9 = 4
            r10 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r0.f99050a = r12
            r0.f99051b = r13
            r0.f99052c = r14
            r0.f99055f = r4
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
            U0(r2, r3, r4, r5, r6, r7)
            goto Lc0
        La4:
            r2 = r11
            pv.A<com.meijer.mobile.home.ux.k0$k> r15 = r2._effectsFlow
            com.meijer.mobile.home.ux.k0$k$k r4 = new com.meijer.mobile.home.ux.k0$k$k
            int r5 = tr.C17284b.f163293P0
            r4.<init>(r5)
            r0.f99050a = r12
            r0.f99051b = r13
            r0.f99052c = r14
            r0.f99055f = r3
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
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.home.ux.k0.removeCartEntry(ur.a, uk.c, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
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
        boolean isSponsoredCriteo = this.viewState.getValue().getIsSponsoredCriteo();
        int clickedProductPosition = this.viewState.getValue().getClickedProductPosition();
        EnumC15218a clickedCarouselType = this.viewState.getValue().getClickedCarouselType();
        InterfaceC14523a interfaceC14523a = this.analyticsEngine;
        C2898u c2898u = C2898u.f1904a;
        String str = this.cartId;
        Map<String, CouponState> mapH = this.viewState.getValue().h();
        if (entryChange != null && (entry = entryChange.getEntry()) != null && (productFullDetailsM = entry.m()) != null) {
            boolValueOf = Boolean.valueOf(productFullDetailsM.getHasMPerksOffers());
        }
        interfaceC14523a.k(c2898u.R(requireCartOpenExtra, clickedCarouselType, entryChange, str, isSponsoredCriteo, carouselType, mapH, zC, false, entryUnitPrice, boolValueOf, productCode, false, Integer.valueOf(clickedProductPosition)));
    }

    private final void trackCartRemovalAction(EntryChange entryChange, double entryUnitPrice) {
        Entry entry;
        ProductFullDetails productFullDetailsM;
        Entry entry2;
        Entry entry3;
        ProductFullDetails productFullDetailsM2;
        this.analyticsEngine.k(C2898u.f1904a.T(this.cartId, this._viewState.getValue().getIsSponsoredCriteo(), this._viewState.getValue().getClickedCarouselType(), this.productMetadataStore.c((entryChange == null || (entry3 = entryChange.getEntry()) == null || (productFullDetailsM2 = entry3.m()) == null) ? null : productFullDetailsM2.getCode()), entryChange, getCarouselType((entryChange == null || (entry2 = entryChange.getEntry()) == null) ? null : entry2.m()), y0(this, (entryChange == null || (entry = entryChange.getEntry()) == null || (productFullDetailsM = entry.m()) == null) ? null : productFullDetailsM.getCode(), false, 2, null), entryUnitPrice, false, true, getCouponList(entryChange)));
    }

    private final void u0(e.f productComponent) {
        if (Intrinsics.e(productComponent, e.f.a.f40004d) || Intrinsics.e(productComponent, e.f.c.f40008d)) {
            fetchPersonalizedProductCard(productComponent);
            return;
        }
        if (productComponent instanceof e.f.b) {
            p0((e.f.b) productComponent);
        } else {
            if (!(productComponent instanceof e.f.d)) {
                throw new NoWhenBranchMatchedException();
            }
            e.f.d dVar = (e.f.d) productComponent;
            if (!Intrinsics.e(dVar, e.f.d.a.f40010e)) {
                throw new NoWhenBranchMatchedException();
            }
            v0(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateCartEntry(ur.AbstractC17454a r13, uk.c<fj.EntryChange> r14, java.lang.String r15, kotlin.coroutines.Continuation<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.home.ux.k0.updateCartEntry(ur.a, uk.c, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void updateLoadingStateOfCoupon(long couponId) {
        ViewState value;
        ViewState viewState;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
        } while (!interfaceC16549B.e(value, ViewState.b(viewState, null, null, 0, null, null, false, null, null, null, null, null, null, null, HomeMperksDecorator.b(viewState.getMPerksDecorator(), null, null, 0, null, null, null, viewState.getMPerksDecorator().k(couponId, true), false, 191, null), false, null, null, null, null, null, false, false, null, 0, null, false, 67100671, null)));
    }

    private final void updateRateAndTipNotification(String orderId, String externalShopperId, boolean navigateToTipActivity) {
        if (orderId == null || orderId.length() == 0) {
            return;
        }
        C15809k.d(androidx.view.d0.a(this), null, null, new m0(orderId, externalShopperId, navigateToTipActivity, null), 3, null);
    }

    private final void v0(e.f.d productComponent) {
        if (this.featureManager.e(AbstractC18503f.w0.f172911h) && this.userManager.b()) {
            C15809k.d(androidx.view.d0.a(this), null, null, new G(productComponent, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x0(Coupon coupon, k0 k0Var, EnumC15218a enumC15218a, CouponState couponState, TrackingData TrackingData) {
        CouponState.b progress;
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n("home");
        TrackingData.v("home");
        Rk.b bVar = Rk.b.f33418a;
        TrackingData.c(bVar.f(CollectionsKt.e(coupon)));
        TrackingData.c(bVar.h(k0Var.getCarouselType(enumC15218a)));
        boolean z10 = false;
        if (couponState != null && (progress = couponState.getProgress()) != null && progress.d()) {
            z10 = true;
        }
        TrackingData.c(bVar.c(z10));
        return Unit.f143329a;
    }

    static /* synthetic */ CouponState y0(k0 k0Var, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return k0Var.getCouponState(str, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z0(String str, Map map, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("expectedUpc", str);
        track.h("availableKeys", CollectionsKt.B0(map.keySet(), ",", null, null, 0, null, null, 62, null));
        track.m(TrackingData.a.b.f137705a);
        return Unit.f143329a;
    }

    public final InterfaceC16553F<AbstractC11776j> A0() {
        return this.dialogFlow;
    }

    public final InterfaceC16553F<AbstractC11777k> B0() {
        return this.effectsFlow;
    }

    public final pv.P<ViewState> F0() {
        return this.viewState;
    }

    public final void G0() {
        if (this.userManager.b()) {
            wr.f.r(this.cartInteractor, false, this, 1, null);
        }
    }

    public final void H0(AbstractC11773g action) {
        Intrinsics.j(action, "action");
        if (!(action instanceof AbstractC11773g.UpdateRateAndTipNotification)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC11773g.UpdateRateAndTipNotification updateRateAndTipNotification = (AbstractC11773g.UpdateRateAndTipNotification) action;
        updateRateAndTipNotification(updateRateAndTipNotification.getOrderId(), updateRateAndTipNotification.getExternalShopperId(), updateRateAndTipNotification.getNavigateToTipActivity());
    }

    public final void I0(AbstractC11778l action) {
        Intrinsics.j(action, "action");
        if (Intrinsics.e(action, AbstractC11778l.b.f99149a)) {
            C15809k.d(androidx.view.d0.a(this), null, null, new Q(null), 3, null);
            return;
        }
        if (action instanceof AbstractC11778l.DisplaySubstitutionToast) {
            C15809k.d(androidx.view.d0.a(this), null, null, new R(action, null), 3, null);
            return;
        }
        if (action instanceof AbstractC11778l.AcceptAddToCartChallenge) {
            wr.f.B(this.cartInteractor, new AbstractC17440a.Accept(((AbstractC11778l.AcceptAddToCartChallenge) action).getCartUpdateRequest(), null, null, 4, null), false, null, 6, null);
            C15809k.d(androidx.view.d0.a(this), null, null, new S(null), 3, null);
        } else {
            if (!(action instanceof AbstractC11778l.ResetStepperState)) {
                throw new NoWhenBranchMatchedException();
            }
            resetQuantitySteppers(((AbstractC11778l.ResetStepperState) action).getProductCode());
            C15809k.d(androidx.view.d0.a(this), null, null, new T(null), 3, null);
        }
    }

    public final void J0(AbstractC13555a action) {
        ViewState value;
        AbstractC13555a.ProductClickedPosition productClickedPosition;
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC13555a.ProductClickedPosition) {
            InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
            do {
                value = interfaceC16549B.getValue();
                productClickedPosition = (AbstractC13555a.ProductClickedPosition) action;
            } while (!interfaceC16549B.e(value, ViewState.b(value, null, null, 0, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, productClickedPosition.getPosition(), productClickedPosition.getCarouselType(), productClickedPosition.getIsSponsoredCriteo(), 8388607, null)));
            return;
        }
        if (action instanceof AbstractC13555a.ProductCouponClicked) {
            AbstractC13555a.ProductCouponClicked productCouponClicked = (AbstractC13555a.ProductCouponClicked) action;
            onProductCouponButtonClicked(productCouponClicked.getCoupon(), productCouponClicked.getCarouselType());
        } else if (action instanceof AbstractC13555a.UpdateProductEntry) {
            AbstractC13555a.UpdateProductEntry updateProductEntry = (AbstractC13555a.UpdateProductEntry) action;
            V0(updateProductEntry.getProduct(), updateProductEntry.getQuantityToUpdate());
        } else if (action instanceof AbstractC13555a.Retry) {
            u0(((AbstractC13555a.Retry) action).getProductComponent());
        } else if (!(action instanceof AbstractC13555a.ProductClicked) && !(action instanceof AbstractC13555a.ViewAll)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void K0(AbstractC14020b action) {
        Intrinsics.j(action, "action");
        if (!(action instanceof AbstractC14020b.NavigateToTeachersList)) {
            throw new NoWhenBranchMatchedException();
        }
        this.analyticsEngine.b(C14756c.a("Find Your List:Teacher's List homescreen component"), new Function1() { // from class: com.meijer.mobile.home.ux.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k0.Q0((TrackingData) obj);
            }
        });
    }

    public final void W0() {
        ViewState value;
        ViewState value2;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.b(value, null, null, 0, null, null, true, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, 0, null, false, 67108831, null)));
        C15809k.d(androidx.view.d0.a(this), null, null, new d0(null), 3, null);
        C15809k.d(androidx.view.d0.a(this), null, null, new e0(null), 3, null);
        InterfaceC16549B<ViewState> interfaceC16549B2 = this._viewState;
        do {
            value2 = interfaceC16549B2.getValue();
        } while (!interfaceC16549B2.e(value2, ViewState.b(value2, null, null, 0, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, 0, null, false, 67108831, null)));
        r0();
        G0();
        if (this.userManager.b()) {
            fetchSpecialOffers();
            fetchActiveOrders();
            fetchTipAndNotification();
            fetchMperksExpiringPoints();
        }
        C15809k.d(androidx.view.d0.a(this), null, null, new f0(null), 3, null);
        s0();
    }

    @Override // wr.InterfaceC17909a
    /* renamed from: getDisposable, reason: from getter */
    public Ju.a getDisposables() {
        return this.disposables;
    }

    public final InterfaceC16553F<ToastMessageData> getToastMessageData() {
        return C16563h.b(this._toastMessageData);
    }

    public final void loadGoogleAd() {
        ViewState value;
        C14377e c14377e;
        EnumC14378f enumC14378f;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            c14377e = C14377e.f134254a;
            enumC14378f = EnumC14378f.f134255d;
        } while (!interfaceC16549B.e(value, ViewState.b(value, null, null, 0, null, null, false, null, null, null, C14377e.b(c14377e, enumC14378f, "homepage", true, null, this.userManager.y(), 1, 8, null), C14377e.b(c14377e, enumC14378f, "homepage", true, null, this.userManager.y(), 2, 8, null), null, null, null, false, null, null, null, null, null, false, false, null, 0, null, false, 67107327, null)));
    }

    public final void n0(AbstractC11776j dialog) {
        Intrinsics.j(dialog, "dialog");
        C15809k.d(androidx.view.d0.a(this), null, null, new C11784r(dialog, null), 3, null);
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
        C15809k.d(androidx.view.d0.a(this), null, null, new H(null), 3, null);
    }

    @Override // wr.InterfaceC17909a
    public void processedRequest(AbstractC17454a processedRequest, uk.c<EntryChange> entryChange) {
        Intrinsics.j(processedRequest, "processedRequest");
        Intrinsics.j(entryChange, "entryChange");
        if (processedRequest instanceof AbstractC17454a.Add) {
            C15809k.d(androidx.view.d0.a(this), null, null, new a0(processedRequest, entryChange, null), 3, null);
            return;
        }
        if (processedRequest instanceof AbstractC17454a.Update) {
            C15809k.d(androidx.view.d0.a(this), null, null, new b0(processedRequest, entryChange, null), 3, null);
            return;
        }
        if (processedRequest instanceof AbstractC17454a.Remove) {
            C15809k.d(androidx.view.d0.a(this), null, null, new c0(processedRequest, entryChange, null), 3, null);
        } else {
            if (!(processedRequest instanceof AbstractC17454a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            resetQuantitySteppers(processedRequest.getProductCode());
            Unit unit = Unit.f143329a;
        }
    }

    public final void t0(boolean showLoading) {
        if (this.userManager.b()) {
            C15809k.d(androidx.view.d0.a(this), null, null, new A(null), 3, null);
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
        C15809k.d(androidx.view.d0.a(this), null, null, new C1408k0((AbstractC17720a.ChokingHazardChallenge) abstractC17720aF, null), 3, null);
    }

    public final void updateRatedAndTippedOrder(Builder builder, EnumC17276a flowType) {
        boolean z10;
        InterfaceC16549B<ViewState> interfaceC16549B;
        ViewState viewState;
        ArrayList arrayList;
        Builder builder2 = builder;
        Intrinsics.j(builder2, "builder");
        Intrinsics.j(flowType, "flowType");
        boolean z11 = C18328d.a(builder2.getTipAmount(), new Function0() { // from class: com.meijer.mobile.home.ux.d0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Double.valueOf(k0.d1());
            }
        }) > 0.0d;
        boolean z12 = C18328d.b(builder2.getRating(), new Function0() { // from class: com.meijer.mobile.home.ux.e0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(k0.e1());
            }
        }) > 0;
        InterfaceC16549B<ViewState> interfaceC16549B2 = this._viewState;
        while (true) {
            ViewState value = interfaceC16549B2.getValue();
            ViewState viewState2 = value;
            List<OrderStatusCardDecorator> listP = viewState2.p();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listP, 10));
            for (OrderStatusCardDecorator orderStatusCardDecoratorD : listP) {
                if (Intrinsics.e(orderStatusCardDecoratorD.getOrderNumber(), builder2.getOrderId())) {
                    boolean z13 = (z12 && z11) ? false : true;
                    z10 = z11;
                    interfaceC16549B = interfaceC16549B2;
                    viewState = value;
                    arrayList = arrayList2;
                    orderStatusCardDecoratorD = OrderStatusCardDecorator.d(orderStatusCardDecoratorD, null, null, 0, null, null, null, null, 0, false, false, false, false, z13, null, false, null, null, null, null, null, flowType, 1044479, null);
                } else {
                    z10 = z11;
                    interfaceC16549B = interfaceC16549B2;
                    viewState = value;
                    arrayList = arrayList2;
                }
                arrayList.add(orderStatusCardDecoratorD);
                arrayList2 = arrayList;
                value = viewState;
                z11 = z10;
                interfaceC16549B2 = interfaceC16549B;
                builder2 = builder;
            }
            boolean z14 = z11;
            InterfaceC16549B<ViewState> interfaceC16549B3 = interfaceC16549B2;
            if (interfaceC16549B3.e(value, ViewState.b(viewState2, null, null, 0, null, arrayList2, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, 0, null, false, 67108847, null))) {
                return;
            }
            builder2 = builder;
            interfaceC16549B2 = interfaceC16549B3;
            z11 = z14;
        }
    }

    public final pv.P<AbstractC11774h> w0() {
        return this.bottomSheetContentStateFlow;
    }

    public static void B(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object D(k0 k0Var, List list, Continuation continuation) {
        k0Var.onCouponState(list);
        return Unit.f143329a;
    }

    private final void claimMperks(long couponId) {
        updateLoadingStateOfCoupon(couponId);
        C15809k.d(androidx.view.d0.a(this), null, null, new C11782p(couponId, null), 3, null);
    }

    private final void fetchActiveOrders() {
        C15809k.d(androidx.view.d0.a(this), null, null, new C11785s(null), 3, null);
    }

    private final void fetchEmailVerificationBannerSettings() {
        C15809k.d(androidx.view.d0.a(this), null, null, new C11789w(null), 3, null);
    }

    private final void fetchEnrollmentOfferResendEmailResponse() {
        C15809k.d(androidx.view.d0.a(this), null, null, new C11790x(null), 3, null);
    }

    private final void fetchMperksExpiringPoints() {
        C15809k.d(androidx.view.d0.a(this), null, null, new B(null), 3, null);
    }

    private final void fetchSpecialOffers() {
        C15809k.d(androidx.view.d0.a(this), null, null, new E(null), 3, null);
    }

    private final void fetchTipAndNotification() {
        C15809k.d(androidx.view.d0.a(this), null, null, new F(null), 3, null);
    }

    private final Object onGetClipCouponResponse(ClipUnclipCouponResponse clipUnclipCouponResponse, Coupon coupon, TrackingData trackingData, Continuation<? super Unit> continuation) {
        if (StringsKt.I(clipUnclipCouponResponse.getResult(), "Success", false, 2, null)) {
            this.analyticsEngine.k(trackingData);
            return Unit.f143329a;
        }
        Object objEmit = this._dialogFlow.emit(new AbstractC11776j.ClipCouponFailedAlert(Nr.g.f22702n, Nr.g.f22700m, r0.f99339A, Nr.g.f22664O, coupon, trackingData), continuation);
        if (objEmit == IntrinsicsKt.f()) {
            return objEmit;
        }
        return Unit.f143329a;
    }

    private final void p0(e.f.b curatedCarousel) {
        C15809k.d(androidx.view.d0.a(this), null, null, new C11787u(curatedCarousel, null), 3, null);
    }

    private final void r0() {
        C15809k.d(androidx.view.d0.a(this), null, null, new C11791y(null), 3, null);
    }

    private final void s0() {
        C15809k.d(androidx.view.d0.a(this), null, null, new C11792z(null), 3, null);
    }

    private final void sendBeaconToastMessage(Ul.a type, boolean isFormatLevel, nk.c product) {
        C15809k.d(androidx.view.d0.a(this), null, null, new i0(isFormatLevel, this, type, product, null), 3, null);
    }

    private final void sendCriteoBeacon(List<String> beacon, Ul.a type, boolean isFormatLevel, EnumC15218a carouselType) {
        C15809k.d(androidx.view.d0.a(this), this.ioDispatcher, null, new j0(beacon, isFormatLevel, type, carouselType, this, null), 2, null);
    }

    public static void w(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        super.onCleared();
        this.disposables.d();
    }

    private final String getCarouselType(ProductFullDetails product) {
        if (product == null) {
            return "";
        }
        Set<e.f> setKeySet = this.viewState.getValue().r().keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((e.f) obj) instanceof e.f.b) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                e.f fVar = (e.f) it.next();
                List<ProductListDecorator> list = this.viewState.getValue().r().get(fVar);
                if (list != null) {
                    List<ProductListDecorator> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.e(((ProductListDecorator) it2.next()).getUpc(), product.getCode())) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("customEntry - ");
                                CarouselDecorator carouselDecorator = this.viewState.getValue().q().get(fVar);
                                sb2.append(carouselDecorator != null ? carouselDecorator.getTitle() : null);
                                return sb2.toString();
                            }
                        }
                    }
                }
            } else {
                Set<e.f> setKeySet2 = this.viewState.getValue().r().keySet();
                ArrayList<e.f> arrayList2 = new ArrayList();
                for (Object obj2 : setKeySet2) {
                    e.f fVar2 = (e.f) obj2;
                    if ((fVar2 instanceof e.f.a) || (fVar2 instanceof e.f.c)) {
                        arrayList2.add(obj2);
                    }
                }
                for (e.f fVar3 : arrayList2) {
                    if (this.viewState.getValue().r().get(fVar3) != null) {
                        if (fVar3 instanceof e.f.a) {
                            CarouselDecorator carouselDecorator2 = this.viewState.getValue().q().get(fVar3);
                            return Intrinsics.e(carouselDecorator2 != null ? carouselDecorator2.getTitle() : null, "Buy Again") ? "Buy Again" : "Produce-L2-10778";
                        }
                        if (fVar3 instanceof e.f.c) {
                            CarouselDecorator carouselDecorator3 = this.viewState.getValue().q().get(fVar3);
                            return Intrinsics.e(carouselDecorator3 != null ? carouselDecorator3.getTitle() : null, "Favorites on Sale") ? "Favorites on Sale" : "Dairy-L2-9974";
                        }
                    }
                }
                return "";
            }
        }
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
            AbstractC13720b.ViewAll viewAll = (AbstractC13720b.ViewAll) action;
            e.c carouselType = viewAll.getCarouselType();
            if (carouselType instanceof e.c.b) {
                this.analyticsEngine.h(C14756c.a("Event: shop department carousel: view all"), new AbstractC14762i[0]);
            } else if (carouselType instanceof e.c.a) {
                this.analyticsEngine.h(C14756c.a(StringsKt.Q("Event: {carousel_name} carousel: view all", HomeViewModel.SEASONAL_CAROUSEL_NAME_ANALYTIC_TEMPLATE, viewAll.getCarouselTitle(), false, 4, null)), new AbstractC14762i[0]);
                objectRef.f143742a = "shop department carousel:" + viewAll.getCarouselTitle();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            C15809k.d(androidx.view.d0.a(this), null, null, new U(action, objectRef, null), 3, null);
            return;
        }
        if (action instanceof AbstractC13720b.DepartmentClicked) {
            AbstractC13720b.DepartmentClicked departmentClicked = (AbstractC13720b.DepartmentClicked) action;
            int iP = this.deeplinkParser.P(departmentClicked.getDeeplink());
            if (Intrinsics.e(departmentClicked.getCarouselType(), e.c.a.f39991b)) {
                if (iP == 4000) {
                    this.analyticsEngine.b(C14756c.h("T1:" + departmentClicked.getName()), new Function1() { // from class: com.meijer.mobile.home.ux.h0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return k0.O0(action, (TrackingData) obj);
                        }
                    });
                } else if (iP == 4100) {
                    this.analyticsEngine.b(C14756c.h("Collection:" + departmentClicked.getCarouselTitle()), new Function1() { // from class: com.meijer.mobile.home.ux.g0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return k0.N0(action, (TrackingData) obj);
                        }
                    });
                    objectRef.f143742a = "shop department carousel:" + departmentClicked.getName();
                } else if (iP == 4200) {
                    this.analyticsEngine.b(C14756c.a("shopDepartmentMenu"), new Function1() { // from class: com.meijer.mobile.home.ux.f0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return k0.M0(action, (TrackingData) obj);
                        }
                    });
                }
            } else if (iP == 4200) {
                this.analyticsEngine.b(C14756c.h("shopDepartmentTierLevel"), new Function1() { // from class: com.meijer.mobile.home.ux.i0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return k0.P0(action, (TrackingData) obj);
                    }
                });
            }
            C15809k.d(androidx.view.d0.a(this), null, null, new I(action, objectRef, null), 3, null);
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void onAction(Qk.a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.Clip) {
            C15809k.d(androidx.view.d0.a(this), null, null, new J(action, null), 3, null);
            return;
        }
        if (action instanceof a.ViewCouponDetails) {
            C15809k.d(androidx.view.d0.a(this), null, null, new K(action, null), 3, null);
        } else {
            if (!(action instanceof a.NotInterested) && !(action instanceof a.Unclip) && !(action instanceof a.ViewCouponList)) {
                throw new NoWhenBranchMatchedException();
            }
            Unit unit = Unit.f143329a;
        }
    }

    public final void onAction(AbstractC14021c action) {
        Intrinsics.j(action, "action");
        if (Intrinsics.e(action, AbstractC14021c.a.f132024a)) {
            t0(true);
            Unit unit = Unit.f143329a;
        } else if (action instanceof AbstractC14021c.OnClaimRewardClicked) {
            claimMperks(((AbstractC14021c.OnClaimRewardClicked) action).getCouponId());
            Unit unit2 = Unit.f143329a;
        } else if (Intrinsics.e(action, AbstractC14021c.d.f132030a)) {
            C15809k.d(androidx.view.d0.a(this), null, null, new L(null), 3, null);
        } else if (action instanceof AbstractC14021c.RedeemMPerksViewAllClicked) {
            C15809k.d(androidx.view.d0.a(this), null, null, new M(null), 3, null);
        } else if (action instanceof AbstractC14021c.RewardsMPerksClicked) {
            C15809k.d(androidx.view.d0.a(this), null, null, new N(action, null), 3, null);
        } else if (action instanceof AbstractC14021c.YourRewardsMPerksViewAllClicked) {
            C15809k.d(androidx.view.d0.a(this), null, null, new O(action, null), 3, null);
        } else {
            if (!(action instanceof AbstractC14021c.OnRedeemRewardsTabClicked) && !(action instanceof AbstractC14021c.OnYourRewardsTabClicked) && !(action instanceof AbstractC14021c.OnClaimForButtonClicked)) {
                throw new NoWhenBranchMatchedException();
            }
            Unit unit3 = Unit.f143329a;
        }
        this.analyticsEngine.e(action);
    }

    public final void onAction(AbstractC14029k action) {
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC14029k.ViewAll) {
            C15809k.d(androidx.view.d0.a(this), null, null, new P(null), 3, null);
        } else {
            if (!Intrinsics.e(action, AbstractC14029k.a.f132057a)) {
                throw new NoWhenBranchMatchedException();
            }
            fetchSpecialOffers();
        }
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

    public final void onAction(AbstractC13870f action) {
        ViewState value;
        ViewState viewState;
        ArrayList arrayList;
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC13870f.Dismiss) {
            InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
            do {
                value = interfaceC16549B.getValue();
                viewState = value;
                List<OrderStatusCardDecorator> listP = viewState.p();
                arrayList = new ArrayList();
                for (Object obj : listP) {
                    if (!Intrinsics.e(((OrderStatusCardDecorator) obj).getOrderNumber(), ((AbstractC13870f.Dismiss) action).getOrderNumber())) {
                        arrayList.add(obj);
                    }
                }
            } while (!interfaceC16549B.e(value, ViewState.b(viewState, null, null, 0, null, arrayList, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, 0, null, false, 67108847, null)));
            this.appPrefManager.b(((AbstractC13870f.Dismiss) action).getOrderNumber());
        } else if (action instanceof AbstractC13870f.OrderRatedAndTipped) {
            fetchActiveOrders();
        } else if (!(action instanceof AbstractC13870f.RateAndTip) && !(action instanceof AbstractC13870f.ViewSubstitutions) && !(action instanceof AbstractC13870f.ViewDeclinedPayment) && !(action instanceof AbstractC13870f.ViewOrderDetail)) {
            throw new NoWhenBranchMatchedException();
        }
        this.analyticsEngine.e(action);
    }
}
