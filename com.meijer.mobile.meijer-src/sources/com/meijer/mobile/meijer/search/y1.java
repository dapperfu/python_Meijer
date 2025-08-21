package com.meijer.mobile.meijer.search;

import Ao.C2898u;
import Co.ProductFullDetails;
import Go.SearchSuggestions;
import Go.Suggestion;
import Ho.ProductSponsorship;
import Hr.CouponCountDownStateDecorator;
import M0.SnapshotStateList;
import M0.SnapshotStateMap;
import Pj.a;
import Pk.Coupon;
import Pp.SearchQuery;
import Qk.a;
import Qo.FilterFacet;
import Qo.FilterFacetOption;
import Qo.FilterSortOption;
import Qo.l;
import Sk.CouponOptions;
import Vl.DepartmentCard;
import Vl.e;
import Yk.CouponState;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C6173t;
import androidx.view.InterfaceC6172s;
import bk.AbstractC6392a;
import com.fullstory.FS;
import com.meijer.mobile.architecture.j;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.core.util.networking.NoAvailableNetworksException;
import com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse;
import com.meijer.mobile.meijer.activity.home.HomeDecorator;
import com.meijer.mobile.meijer.activity.home.HomeViewModel;
import com.meijer.mobile.meijer.activity.orderoptions.OrderOptionsActivity;
import com.meijer.mobile.meijer.activity.personalized.modals.G;
import com.meijer.mobile.meijer.search.InterfaceC12713e;
import com.meijer.mobile.meijer.search.R1;
import dl.C13702d;
import ev.C13889a;
import fj.ShoppingCart;
import g.C14274a;
import gi.GoogleAdAnalytics;
import hi.InterfaceC14523a;
import ii.AbstractC14761h;
import ii.AbstractC14762i;
import ii.C14756c;
import ii.C14760g;
import ii.TrackingData;
import ik.CartPreviewDecorator;
import java.net.ConnectException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jm.C15052a;
import ki.q1;
import kk.EnumC15218a;
import kotlin.KotlinNothingValueException;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import mv.AbstractC15779K;
import mv.C15799f;
import mv.C15809k;
import mv.InterfaceC15783O;
import nk.l;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16553F;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import qw.a;
import retrofit2.HttpException;
import sp.C17115a;
import sp.ProductState;
import ss.InterfaceC17146a;
import tr.C17284b;
import ts.ProductCardDecorator;
import ur.AbstractC17454a;
import vs.CarouselDecorator;
import vs.CartProductListDecorator;
import vs.ProductListDecorator;
import wl.CartEntry;
import wl.ProductEligibility;
import ys.C18371a;
import ys.C18372b;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000Ò\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b(\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0083\u0001\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\b\u0001\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b*\u0010)J\u000f\u0010+\u001a\u00020'H\u0015¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020'2\u0006\u0010-\u001a\u00020\u0002H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020'2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020'2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020'H\u0002¢\u0006\u0004\b8\u0010,J\u000f\u00109\u001a\u00020'H\u0002¢\u0006\u0004\b9\u0010,J\u000f\u0010:\u001a\u00020'H\u0002¢\u0006\u0004\b:\u0010,J\u000f\u0010;\u001a\u00020'H\u0002¢\u0006\u0004\b;\u0010,J\u000f\u0010<\u001a\u00020'H\u0002¢\u0006\u0004\b<\u0010,J\u001f\u0010A\u001a\u00020'2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bA\u0010BJ\u0019\u0010C\u001a\u00020'2\b\u0010>\u001a\u0004\u0018\u00010=H\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020'H\u0002¢\u0006\u0004\bE\u0010,J\u0017\u0010H\u001a\u00020'2\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020'H\u0002¢\u0006\u0004\bJ\u0010,J\u000f\u0010K\u001a\u00020'H\u0002¢\u0006\u0004\bK\u0010,J\u000f\u0010L\u001a\u00020'H\u0002¢\u0006\u0004\bL\u0010,J\u001d\u0010P\u001a\u00020'2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020N0MH\u0002¢\u0006\u0004\bP\u0010QJ\u0017\u0010T\u001a\u00020'2\u0006\u0010S\u001a\u00020RH\u0002¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020'H\u0002¢\u0006\u0004\bV\u0010,J\u001f\u0010[\u001a\u00020'2\u0006\u0010X\u001a\u00020W2\u0006\u0010Z\u001a\u00020YH\u0002¢\u0006\u0004\b[\u0010\\J%\u0010a\u001a\u00020'2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020^0]2\u0006\u0010`\u001a\u00020^H\u0002¢\u0006\u0004\ba\u0010bJ\u001f\u0010c\u001a\u00020'2\u0006\u0010_\u001a\u00020^2\u0006\u0010`\u001a\u00020^H\u0002¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020'2\u0006\u0010e\u001a\u00020WH\u0002¢\u0006\u0004\bf\u0010gJ\u0019\u0010i\u001a\u00020?2\b\b\u0001\u0010h\u001a\u00020FH\u0002¢\u0006\u0004\bi\u0010jJ!\u0010l\u001a\u00020'2\u0006\u0010>\u001a\u00020^2\b\u0010k\u001a\u0004\u0018\u00010^H\u0002¢\u0006\u0004\bl\u0010dJ\u000f\u0010m\u001a\u00020'H\u0002¢\u0006\u0004\bm\u0010,J\u0017\u0010o\u001a\u00020'2\u0006\u0010n\u001a\u00020FH\u0002¢\u0006\u0004\bo\u0010IJ\u0017\u0010p\u001a\u00020'2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\bp\u0010DJ\u0017\u0010r\u001a\u00020'2\u0006\u0010q\u001a\u00020?H\u0002¢\u0006\u0004\br\u0010sJ\u0017\u0010u\u001a\u00020'2\u0006\u0010t\u001a\u00020FH\u0002¢\u0006\u0004\bu\u0010IJ\u0017\u0010w\u001a\u00020'2\u0006\u0010v\u001a\u00020^H\u0002¢\u0006\u0004\bw\u0010xJ\u0017\u0010z\u001a\u00020'2\u0006\u0010y\u001a\u00020^H\u0002¢\u0006\u0004\bz\u0010xJ\u0017\u0010{\u001a\u00020'2\u0006\u0010y\u001a\u00020^H\u0002¢\u0006\u0004\b{\u0010xJ\u0017\u0010|\u001a\u00020'2\u0006\u0010t\u001a\u00020FH\u0002¢\u0006\u0004\b|\u0010IJ4\u0010\u0082\u0001\u001a\u00020'2\u0006\u0010~\u001a\u00020}2\u0006\u0010\u007f\u001a\u00020F2\u0007\u0010\u0080\u0001\u001a\u00020F2\u0007\u0010\u0081\u0001\u001a\u00020FH\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001a\u0010\u0084\u0001\u001a\u00020'2\u0006\u0010~\u001a\u00020}H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J%\u0010\u0089\u0001\u001a\u00020'2\b\u0010\u0087\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u0088\u0001\u001a\u00020FH\u0002¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0011\u0010\u008b\u0001\u001a\u00020'H\u0002¢\u0006\u0005\b\u008b\u0001\u0010,J\u0011\u0010\u008c\u0001\u001a\u00020'H\u0002¢\u0006\u0005\b\u008c\u0001\u0010,J\u001c\u0010\u008f\u0001\u001a\u00020'2\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001c\u0010\u0093\u0001\u001a\u00020'2\b\u0010\u0092\u0001\u001a\u00030\u0091\u0001H\u0002¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u001c\u0010\u0097\u0001\u001a\u00020'2\b\u0010\u0096\u0001\u001a\u00030\u0095\u0001H\u0002¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u0011\u0010\u0099\u0001\u001a\u00020'H\u0002¢\u0006\u0005\b\u0099\u0001\u0010,J\u0011\u0010\u009a\u0001\u001a\u00020'H\u0002¢\u0006\u0005\b\u009a\u0001\u0010,J\u0011\u0010\u009b\u0001\u001a\u00020'H\u0002¢\u0006\u0005\b\u009b\u0001\u0010,J\u001c\u0010\u009e\u0001\u001a\u00020'2\b\u0010\u009d\u0001\u001a\u00030\u009c\u0001H\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u0011\u0010 \u0001\u001a\u00020'H\u0002¢\u0006\u0005\b \u0001\u0010,J\u001a\u0010¢\u0001\u001a\u00020'2\u0007\u0010¡\u0001\u001a\u00020^H\u0002¢\u0006\u0005\b¢\u0001\u0010xJ\u001a\u0010¤\u0001\u001a\u00020'2\u0007\u0010£\u0001\u001a\u00020^H\u0002¢\u0006\u0005\b¤\u0001\u0010xJ\u001a\u0010¦\u0001\u001a\u00020'2\u0007\u0010¥\u0001\u001a\u00020^H\u0002¢\u0006\u0005\b¦\u0001\u0010xJ\u001a\u0010¨\u0001\u001a\u00020'2\u0007\u0010§\u0001\u001a\u00020^H\u0002¢\u0006\u0005\b¨\u0001\u0010xJ\u001c\u0010«\u0001\u001a\u00020'2\b\u0010ª\u0001\u001a\u00030©\u0001H\u0002¢\u0006\u0006\b«\u0001\u0010¬\u0001J$\u0010¯\u0001\u001a\u00020'2\u0007\u0010O\u001a\u00030\u00ad\u00012\u0007\u0010®\u0001\u001a\u00020?H\u0002¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u0011\u0010±\u0001\u001a\u00020'H\u0002¢\u0006\u0005\b±\u0001\u0010,J\u0011\u0010²\u0001\u001a\u00020'H\u0002¢\u0006\u0005\b²\u0001\u0010,J\u0011\u0010³\u0001\u001a\u00020'H\u0002¢\u0006\u0005\b³\u0001\u0010,J\u001c\u0010µ\u0001\u001a\u00020'2\b\u0010ª\u0001\u001a\u00030´\u0001H\u0002¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\u001c\u0010¸\u0001\u001a\u00020'2\b\u0010ª\u0001\u001a\u00030·\u0001H\u0002¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u001c\u0010»\u0001\u001a\u00020'2\b\u0010ª\u0001\u001a\u00030º\u0001H\u0002¢\u0006\u0006\b»\u0001\u0010¼\u0001J\u001c\u0010¿\u0001\u001a\u00020'2\b\u0010¾\u0001\u001a\u00030½\u0001H\u0002¢\u0006\u0006\b¿\u0001\u0010À\u0001J\u0011\u0010Á\u0001\u001a\u00020'H\u0002¢\u0006\u0005\bÁ\u0001\u0010,J&\u0010Ã\u0001\u001a\u00020'2\u0007\u0010§\u0001\u001a\u00020^2\t\b\u0002\u0010Â\u0001\u001a\u00020?H\u0002¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J&\u0010Ç\u0001\u001a\u00020'2\b\u0010Æ\u0001\u001a\u00030Å\u00012\b\u0010k\u001a\u0004\u0018\u00010^H\u0002¢\u0006\u0006\bÇ\u0001\u0010È\u0001J\u001c\u0010Ë\u0001\u001a\u00020'2\b\u0010Ê\u0001\u001a\u00030É\u0001H\u0002¢\u0006\u0006\bË\u0001\u0010Ì\u0001J\u001a\u0010Î\u0001\u001a\u00020'2\u0007\u0010Í\u0001\u001a\u00020FH\u0002¢\u0006\u0005\bÎ\u0001\u0010IJ\u001b\u0010Ð\u0001\u001a\u00020?2\u0007\u0010Ï\u0001\u001a\u00020}H\u0002¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J\u001b\u0010Ò\u0001\u001a\u00020?2\u0007\u0010Ï\u0001\u001a\u00020}H\u0002¢\u0006\u0006\bÒ\u0001\u0010Ñ\u0001J\u001b\u0010Ó\u0001\u001a\u00020?2\u0007\u0010Ï\u0001\u001a\u00020}H\u0002¢\u0006\u0006\bÓ\u0001\u0010Ñ\u0001J5\u0010Ô\u0001\u001a\u00020F2\u0007\u0010Ï\u0001\u001a\u00020}2\u0006\u0010\u007f\u001a\u00020F2\u0007\u0010\u0080\u0001\u001a\u00020F2\u0007\u0010\u0081\u0001\u001a\u00020FH\u0002¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001J'\u0010×\u0001\u001a\u0005\u0018\u00010Ö\u00012\u0007\u0010Ï\u0001\u001a\u00020}2\u0007\u0010§\u0001\u001a\u00020^H\u0002¢\u0006\u0006\b×\u0001\u0010Ø\u0001J9\u0010Ù\u0001\u001a\u0005\u0018\u00010Ö\u00012\u0007\u0010Ï\u0001\u001a\u00020}2\u0007\u0010\u0080\u0001\u001a\u00020F2\u0007\u0010\u0081\u0001\u001a\u00020F2\u0007\u0010§\u0001\u001a\u00020^H\u0002¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J'\u0010Ü\u0001\u001a\u0005\u0018\u00010Ö\u00012\u0007\u0010Ï\u0001\u001a\u00020}2\u0007\u0010Û\u0001\u001a\u00020FH\u0002¢\u0006\u0006\bÜ\u0001\u0010Ý\u0001J\u001c\u0010ß\u0001\u001a\u00020'2\b\u0010ª\u0001\u001a\u00030Þ\u0001H\u0002¢\u0006\u0006\bß\u0001\u0010à\u0001J2\u0010å\u0001\u001a\u00020'2\b\u0010â\u0001\u001a\u00030á\u00012\u0014\u0010ä\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020W0ã\u00010]H\u0002¢\u0006\u0006\bå\u0001\u0010æ\u0001J\u001e\u0010è\u0001\u001a\u00030ç\u0001*\t\u0012\u0004\u0012\u00020W0ã\u0001H\u0002¢\u0006\u0006\bè\u0001\u0010é\u0001J#\u0010ì\u0001\u001a\b\u0012\u0004\u0012\u00020N0M2\b\u0010ë\u0001\u001a\u00030ê\u0001H\u0082@¢\u0006\u0006\bì\u0001\u0010í\u0001J%\u0010ñ\u0001\u001a\u00020'2\u0007\u0010î\u0001\u001a\u00020^2\b\u0010ð\u0001\u001a\u00030ï\u0001H\u0002¢\u0006\u0006\bñ\u0001\u0010ò\u0001J\u001c\u0010õ\u0001\u001a\u00020'2\b\u0010ô\u0001\u001a\u00030ó\u0001H\u0002¢\u0006\u0006\bõ\u0001\u0010ö\u0001J5\u0010ú\u0001\u001a\u00020'2\u000b\b\u0002\u0010÷\u0001\u001a\u0004\u0018\u00010^2\t\b\u0002\u0010ø\u0001\u001a\u00020?2\t\b\u0002\u0010ù\u0001\u001a\u00020?H\u0002¢\u0006\u0006\bú\u0001\u0010û\u0001JL\u0010ý\u0001\u001a\t\u0012\u0005\u0012\u00030ç\u00010]2\u000e\u0010ü\u0001\u001a\t\u0012\u0005\u0012\u00030ç\u00010]2\u000b\b\u0002\u0010÷\u0001\u001a\u0004\u0018\u00010^2\t\b\u0002\u0010ø\u0001\u001a\u00020?2\t\b\u0002\u0010ù\u0001\u001a\u00020?H\u0002¢\u0006\u0006\bý\u0001\u0010þ\u0001J\u001c\u0010\u0080\u0002\u001a\u00020'2\b\u0010ª\u0001\u001a\u00030ÿ\u0001H\u0002¢\u0006\u0006\b\u0080\u0002\u0010\u0081\u0002J\u0011\u0010\u0082\u0002\u001a\u00020'H\u0002¢\u0006\u0005\b\u0082\u0002\u0010,J&\u0010\u0087\u0002\u001a\u00020'2\b\u0010\u0084\u0002\u001a\u00030\u0083\u00022\b\u0010\u0086\u0002\u001a\u00030\u0085\u0002H\u0002¢\u0006\u0006\b\u0087\u0002\u0010\u0088\u0002J\u001c\u0010\u008b\u0002\u001a\u00020'2\b\u0010\u008a\u0002\u001a\u00030\u0089\u0002H\u0002¢\u0006\u0006\b\u008b\u0002\u0010\u008c\u0002J*\u0010\u008f\u0002\u001a\u00020'2\b\u0010\u0084\u0002\u001a\u00030\u0083\u00022\f\b\u0002\u0010\u008e\u0002\u001a\u0005\u0018\u00010\u008d\u0002H\u0002¢\u0006\u0006\b\u008f\u0002\u0010\u0090\u0002J(\u0010\u0093\u0002\u001a\u00020'2\b\u0010\u0092\u0002\u001a\u00030\u0091\u00022\n\u0010\u008e\u0002\u001a\u0005\u0018\u00010\u008d\u0002H\u0002¢\u0006\u0006\b\u0093\u0002\u0010\u0094\u0002J\u001c\u0010\u0097\u0002\u001a\u00020'2\b\u0010\u0096\u0002\u001a\u00030\u0095\u0002H\u0002¢\u0006\u0006\b\u0097\u0002\u0010\u0098\u0002J\u0011\u0010\u0099\u0002\u001a\u00020'H\u0002¢\u0006\u0005\b\u0099\u0002\u0010,J*\u0010\u009a\u0002\u001a\u00020'2\b\u0010\u0092\u0002\u001a\u00030\u0091\u00022\f\b\u0002\u0010\u008e\u0002\u001a\u0005\u0018\u00010\u008d\u0002H\u0002¢\u0006\u0006\b\u009a\u0002\u0010\u0094\u0002J\u0011\u0010\u009b\u0002\u001a\u00020'H\u0002¢\u0006\u0005\b\u009b\u0002\u0010,J4\u0010\u009e\u0002\u001a\u00020'2\b\u0010\u009d\u0002\u001a\u00030\u009c\u00022\b\u0010\u0092\u0002\u001a\u00030\u0091\u00022\f\b\u0002\u0010\u008e\u0002\u001a\u0005\u0018\u00010\u008d\u0002H\u0002¢\u0006\u0006\b\u009e\u0002\u0010\u009f\u0002J'\u0010 \u0002\u001a\u00030\u008d\u00022\b\u0010\u0092\u0002\u001a\u00030\u0091\u00022\b\u0010\u0086\u0002\u001a\u00030\u0085\u0002H\u0002¢\u0006\u0006\b \u0002\u0010¡\u0002J\u001e\u0010¢\u0002\u001a\u0004\u0018\u00010^2\b\u0010\u0086\u0002\u001a\u00030\u0085\u0002H\u0002¢\u0006\u0006\b¢\u0002\u0010£\u0002J\u001a\u0010¥\u0002\u001a\t\u0012\u0005\u0012\u00030¤\u00020MH\u0082@¢\u0006\u0006\b¥\u0002\u0010¦\u0002J\u0011\u0010§\u0002\u001a\u00020'H\u0002¢\u0006\u0005\b§\u0002\u0010,J \u0010¨\u0002\u001a\u00020'2\r\u0010O\u001a\t\u0012\u0005\u0012\u00030¤\u00020MH\u0002¢\u0006\u0005\b¨\u0002\u0010QJ\u0011\u0010©\u0002\u001a\u00020'H\u0002¢\u0006\u0005\b©\u0002\u0010,J#\u0010\u00ad\u0002\u001a\u00020'2\u000f\u0010¬\u0002\u001a\n\u0012\u0005\u0012\u00030«\u00020ª\u0002H\u0002¢\u0006\u0006\b\u00ad\u0002\u0010®\u0002R\u0016\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0002\u0010°\u0002R\u0016\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0002\u0010²\u0002R\u0016\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0002\u0010´\u0002R\u0016\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0002\u0010¶\u0002R\u0016\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0002\u0010¸\u0002R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0002\u0010º\u0002R\u0016\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0002\u0010¼\u0002R\u0016\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0002\u0010¾\u0002R\u0016\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0002\u0010À\u0002R\u0016\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÁ\u0002\u0010Â\u0002R\u0016\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0002\u0010Ä\u0002R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0002\u0010Æ\u0002R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÇ\u0002\u0010È\u0002R\u0016\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÉ\u0002\u0010Ê\u0002R\u0016\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bË\u0002\u0010Ì\u0002R&\u0010Ò\u0002\u001a\u00020\u00048\u0014X\u0095\u0004¢\u0006\u0017\n\u0006\bÍ\u0002\u0010Î\u0002\u0012\u0005\bÑ\u0002\u0010,\u001a\u0006\bÏ\u0002\u0010Ð\u0002¨\u0006Ó\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/search/y1;", "Lcom/meijer/mobile/architecture/i;", "Lcom/meijer/mobile/meijer/search/R1;", "Lcom/meijer/mobile/meijer/search/b;", "Lcom/meijer/mobile/meijer/search/S1;", "LRo/c;", "productsRepository", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G;", "plpStateHolder", "Ltl/h;", "timeSlotRepository", "Lyo/k;", "userManager", "LRo/a;", "productAnalytics", "Lil/m;", "cartRepository", "Ljm/a;", "homeRepository", "Lhi/a;", "analyticsEngine", "LDl/e;", "meijerIntent", "Lzl/k;", "featureManager", "LBl/g;", "featureEntryPoint", "Ldl/d;", "couponsRepository", "Lsp/a;", "multiChannelProductsStateRepository", "Lpp/e;", "sponsorshipsDataStore", "Lmv/K;", "ioDispatcher", "<init>", "(LRo/c;Lcom/meijer/mobile/meijer/activity/personalized/modals/G;Ltl/h;Lyo/k;LRo/a;Lil/m;Ljm/a;Lhi/a;LDl/e;Lzl/k;LBl/g;Ldl/d;Lsp/a;Lpp/e;Lmv/K;)V", "Landroidx/lifecycle/s;", "owner", "", "onCreate", "(Landroidx/lifecycle/s;)V", "onResume", "onCleared", "()V", "searchVSUpdate", "t4", "(Lcom/meijer/mobile/meijer/search/R1;)V", "Lcom/meijer/mobile/meijer/search/R1$q;", "initializeViewModel", "N3", "(Lcom/meijer/mobile/meijer/search/R1$q;)V", "LPp/b;", "searchType", "m4", "(LPp/b;)V", "y1", "i2", "C1", "O1", "s2", "LQo/l$k;", "query", "", "resetDeeplinkFacet", "v4", "(LQo/l$k;Z)V", "j4", "(LQo/l$k;)V", "h4", "", "resultCode", "B2", "(I)V", "L3", "J3", "r2", "Lkotlin/Result;", "LVl/j;", "result", "T3", "(Ljava/lang/Object;)V", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n;", "event", "T1", "(Lcom/meijer/mobile/meijer/activity/personalized/modals/G$n;)V", "f4", "LCo/h;", "productToAdd", "", "quantity", "I3", "(LCo/h;D)V", "", "", "beacon", "formatLevelBeacon", "e4", "(Ljava/util/List;Ljava/lang/String;)V", "d4", "(Ljava/lang/String;Ljava/lang/String;)V", "product", "t2", "(LCo/h;)V", "errorMessageId", "B4", "(I)Z", "searchMethod", "l4", "o4", "count", "n3", "n2", "itemSelected", "C3", "(Z)V", "totalCount", "z4", "productTitle", "k4", "(Ljava/lang/String;)V", "firstItemDescription", "w3", "x4", "w4", "Lcom/meijer/mobile/meijer/search/c;", "scenario", "totalResults", "tokenMatchCount", "embeddingsCount", "A4", "(Lcom/meijer/mobile/meijer/search/c;III)V", "y4", "(Lcom/meijer/mobile/meijer/search/c;)V", "Lts/a;", "itemClicked", "position", "r3", "(Lts/a;I)V", "b4", "H2", "Lgi/a;", "googleAdAnalytics", "k3", "(Lgi/a;)V", "Lcom/meijer/mobile/meijer/search/R1$h;", "csa", "S1", "(Lcom/meijer/mobile/meijer/search/R1$h;)V", "Lcom/meijer/mobile/meijer/search/R1$w;", "processOnResumeSearchExtra", "c4", "(Lcom/meijer/mobile/meijer/search/R1$w;)V", "m3", "l3", "s4", "Lcom/meijer/mobile/meijer/search/R1$E;", "stepper", "E3", "(Lcom/meijer/mobile/meijer/search/R1$E;)V", "G1", "term", "B3", "newTerm", "I2", "toAdd", "x1", "searchTerm", "u3", "Lcom/meijer/mobile/meijer/search/R1$b;", "vsu", "z1", "(Lcom/meijer/mobile/meijer/search/R1$b;)V", "Lg/a;", "hasScannedProductExtra", "z2", "(Lg/a;Z)V", "E1", "G4", "v2", "Lcom/meijer/mobile/meijer/search/R1$x;", "U3", "(Lcom/meijer/mobile/meijer/search/R1$x;)V", "Lcom/meijer/mobile/meijer/search/R1$v;", "S3", "(Lcom/meijer/mobile/meijer/search/R1$v;)V", "Lcom/meijer/mobile/meijer/search/R1$y;", "V3", "(Lcom/meijer/mobile/meijer/search/R1$y;)V", "LGo/c;", "suggestion", "F3", "(LGo/c;)V", "z3", "isScannedUPC", "y3", "(Ljava/lang/String;Z)V", "LPp/a;", "searchQuery", "O3", "(LPp/a;Ljava/lang/String;)V", "LGo/a;", "suggestions", "H3", "(LGo/a;)V", "itemCount", "J2", "limitedResultsScenario", "r4", "(Lcom/meijer/mobile/meijer/search/c;)Z", "p4", "q4", "m2", "(Lcom/meijer/mobile/meijer/search/c;III)I", "Lbk/a;", "k2", "(Lcom/meijer/mobile/meijer/search/c;Ljava/lang/String;)Lbk/a;", "j2", "(Lcom/meijer/mobile/meijer/search/c;IILjava/lang/String;)Lbk/a;", "number", "l2", "(Lcom/meijer/mobile/meijer/search/c;I)Lbk/a;", "Lcom/meijer/mobile/meijer/search/R1$u;", "P3", "(Lcom/meijer/mobile/meijer/search/R1$u;)V", "", "key", "Lsp/b;", "productStates", "onProductsState", "(Ljava/lang/Object;Ljava/util/List;)V", "Lvs/f;", "toProductListDecorator", "(Lsp/b;)Lvs/f;", "LVl/e$f;", "homeComponent", "q2", "(LVl/e$f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadingKey", "", "error", "setLoadingStateError", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Lcom/meijer/mobile/meijer/search/R1$H;", "updateEntry", "c3", "(Lcom/meijer/mobile/meijer/search/R1$H;)V", "activeStepperId", "resetStepper", "inTransition", "onStepperInteractionChange", "(Ljava/lang/String;ZZ)V", "productListDecorators", "updateStepperState", "(Ljava/util/List;Ljava/lang/String;ZZ)Ljava/util/List;", "Lcom/meijer/mobile/meijer/search/R1$j;", "Z2", "(Lcom/meijer/mobile/meijer/search/R1$j;)V", "pushUserAuthenticationState", "LPk/c;", "couponIdentity", "Lkk/a;", "carouselType", "onProductCouponButtonClicked", "(LPk/c;Lkk/a;)V", "LQk/a;", "action", "K2", "(LQk/a;)V", "Lii/f;", "trackingData", "X3", "(LPk/c;Lii/f;)V", "LPk/a;", "coupon", "x3", "(LPk/a;Lii/f;)V", "Lur/a;", "cartUpdateRequest", "u4", "(Lur/a;)V", "Q1", "H1", "R1", "Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;", "response", "h3", "(Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;LPk/a;Lii/f;)V", "getClipCouponTrackingData", "(LPk/a;Lkk/a;)Lii/f;", "getCarouselType", "(Lkk/a;)Ljava/lang/String;", "LVl/c;", "o2", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p2", "R3", "E2", "Luk/c;", "Lfj/C;", "shoppingCartResource", "D3", "(Luk/c;)V", "e", "LRo/c;", "f", "Lcom/meijer/mobile/meijer/activity/personalized/modals/G;", "g", "Ltl/h;", "h", "Lyo/k;", "i", "LRo/a;", "j", "Lil/m;", "k", "Ljm/a;", "l", "Lhi/a;", "m", "LDl/e;", "n", "Lzl/k;", "o", "LBl/g;", "p", "Ldl/d;", "q", "Lsp/a;", "r", "Lpp/e;", "s", "Lmv/K;", "t", "Lcom/meijer/mobile/meijer/search/S1;", "y2", "()Lcom/meijer/mobile/meijer/search/S1;", "getViewState$annotations", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class y1 extends com.meijer.mobile.architecture.i<R1, InterfaceC12704b, S1> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Ro.c productsRepository;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final com.meijer.mobile.meijer.activity.personalized.modals.G plpStateHolder;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final tl.h timeSlotRepository;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Ro.a productAnalytics;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final il.m cartRepository;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final C15052a homeRepository;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Dl.e meijerIntent;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final zl.k featureManager;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Bl.g featureEntryPoint;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final C13702d couponsRepository;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final C17115a multiChannelProductsStateRepository;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final pp.e sponsorshipsDataStore;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final S1 viewState;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[EnumC12707c.values().length];
            try {
                iArr[EnumC12707c.f114097b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC12707c.f114098c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC12707c.f114099d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC12707c.f114096a.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Pp.b.values().length];
            try {
                iArr2[Pp.b.f26240c.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Pp.b.f26241d.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[EnumC15218a.values().length];
            try {
                iArr3[EnumC15218a.f142567a.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[EnumC15218a.f142568b.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[EnumC15218a.f142569c.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.search.SearchProductViewModelCompose", f = "SearchProductViewModelCompose.kt", l = {2380}, m = "fetchCarouselDepartments-IoAF18A")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f114206a;

        /* renamed from: b, reason: collision with root package name */
        Object f114207b;

        /* renamed from: c, reason: collision with root package name */
        Object f114208c;

        /* renamed from: d, reason: collision with root package name */
        Object f114209d;

        /* renamed from: e, reason: collision with root package name */
        int f114210e;

        /* renamed from: f, reason: collision with root package name */
        int f114211f;

        /* renamed from: g, reason: collision with root package name */
        int f114212g;

        /* renamed from: h, reason: collision with root package name */
        int f114213h;

        /* renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f114214i;

        /* renamed from: k, reason: collision with root package name */
        int f114216k;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f114214i = obj;
            this.f114216k |= Integer.MIN_VALUE;
            Object objO2 = y1.this.o2(this);
            return objO2 == IntrinsicsKt.f() ? objO2 : Result.a(objO2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.search.SearchProductViewModelCompose$fetchCarouselDepartmentsOuter$1", f = "SearchProductViewModelCompose.kt", l = {2388}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f114217a;

        /* renamed from: b, reason: collision with root package name */
        Object f114218b;

        /* renamed from: c, reason: collision with root package name */
        Object f114219c;

        /* renamed from: d, reason: collision with root package name */
        Object f114220d;

        /* renamed from: e, reason: collision with root package name */
        Object f114221e;

        /* renamed from: f, reason: collision with root package name */
        int f114222f;

        /* renamed from: g, reason: collision with root package name */
        int f114223g;

        /* renamed from: h, reason: collision with root package name */
        int f114224h;

        /* renamed from: i, reason: collision with root package name */
        int f114225i;

        /* renamed from: j, reason: collision with root package name */
        int f114226j;

        /* renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f114227k;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = y1.this.new c(continuation);
            cVar.f114227k = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            Object objO2;
            y1 y1Var;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f114226j;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        y1Var = (y1) this.f114221e;
                        ResultKt.b(obj);
                        objO2 = ((Result) obj).getValue();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f114227k;
                    y1 y1Var2 = y1.this;
                    Result.Companion companion = Result.INSTANCE;
                    y1Var2.s().O().setValue(new LoadingDecorator(null, null, 3, null));
                    this.f114227k = interfaceC15783O;
                    this.f114217a = interfaceC15783O;
                    this.f114218b = this;
                    this.f114219c = this;
                    this.f114220d = interfaceC15783O;
                    this.f114221e = y1Var2;
                    this.f114222f = 0;
                    this.f114223g = 0;
                    this.f114224h = 0;
                    this.f114225i = 0;
                    this.f114226j = 1;
                    objO2 = y1Var2.o2(this);
                    if (objO2 == objF) {
                        return objF;
                    }
                    y1Var = y1Var2;
                }
                y1Var.R3(objO2);
                objB = Result.b(Unit.f143329a);
            } catch (Exception e10) {
                mv.E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            y1 y1Var3 = y1.this;
            if (Result.h(objB)) {
                y1Var3.s().O().setValue(null);
            }
            y1 y1Var4 = y1.this;
            if (Result.e(objB) != null) {
                y1Var4.s().O().setValue(null);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.meijer.search.SearchProductViewModelCompose", f = "SearchProductViewModelCompose.kt", l = {2005}, m = "fetchCarouselRecommendedForYouProducts-gIAlu-s")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f114229a;

        /* renamed from: b, reason: collision with root package name */
        Object f114230b;

        /* renamed from: c, reason: collision with root package name */
        Object f114231c;

        /* renamed from: d, reason: collision with root package name */
        Object f114232d;

        /* renamed from: e, reason: collision with root package name */
        Object f114233e;

        /* renamed from: f, reason: collision with root package name */
        int f114234f;

        /* renamed from: g, reason: collision with root package name */
        int f114235g;

        /* renamed from: h, reason: collision with root package name */
        int f114236h;

        /* renamed from: i, reason: collision with root package name */
        int f114237i;

        /* renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f114238j;

        /* renamed from: l, reason: collision with root package name */
        int f114240l;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f114238j = obj;
            this.f114240l |= Integer.MIN_VALUE;
            Object objQ2 = y1.this.q2(null, this);
            return objQ2 == IntrinsicsKt.f() ? objQ2 : Result.a(objQ2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.search.SearchProductViewModelCompose$fetchCarouselRecommendedProductsOuter$1", f = "SearchProductViewModelCompose.kt", l = {638}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f114241a;

        /* renamed from: b, reason: collision with root package name */
        Object f114242b;

        /* renamed from: c, reason: collision with root package name */
        Object f114243c;

        /* renamed from: d, reason: collision with root package name */
        Object f114244d;

        /* renamed from: e, reason: collision with root package name */
        Object f114245e;

        /* renamed from: f, reason: collision with root package name */
        int f114246f;

        /* renamed from: g, reason: collision with root package name */
        int f114247g;

        /* renamed from: h, reason: collision with root package name */
        int f114248h;

        /* renamed from: i, reason: collision with root package name */
        int f114249i;

        /* renamed from: j, reason: collision with root package name */
        int f114250j;

        /* renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f114251k;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = y1.this.new e(continuation);
            eVar.f114251k = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objQ2;
            y1 y1Var;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f114250j;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        y1Var = (y1) this.f114245e;
                        ResultKt.b(obj);
                        objQ2 = ((Result) obj).getValue();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f114251k;
                    y1 y1Var2 = y1.this;
                    Result.Companion companion = Result.INSTANCE;
                    y1Var2.s().O().setValue(new LoadingDecorator(null, null, 3, null));
                    e.f.a aVar = e.f.a.f40004d;
                    this.f114251k = interfaceC15783O;
                    this.f114241a = interfaceC15783O;
                    this.f114242b = this;
                    this.f114243c = this;
                    this.f114244d = interfaceC15783O;
                    this.f114245e = y1Var2;
                    this.f114246f = 0;
                    this.f114247g = 0;
                    this.f114248h = 0;
                    this.f114249i = 0;
                    this.f114250j = 1;
                    objQ2 = y1Var2.q2(aVar, this);
                    if (objQ2 == objF) {
                        return objF;
                    }
                    y1Var = y1Var2;
                }
                y1Var.T3(objQ2);
                objB = Result.b(Unit.f143329a);
            } catch (Exception e10) {
                mv.E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            y1 y1Var3 = y1.this;
            if (Result.h(objB)) {
                y1Var3.s().O().setValue(null);
            }
            y1 y1Var4 = y1.this;
            if (Result.e(objB) != null) {
                y1Var4.s().O().setValue(null);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.search.SearchProductViewModelCompose$filterAndSortCollector$1", f = "SearchProductViewModelCompose.kt", l = {534}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f114253a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ y1 f114255a;

            a(y1 y1Var) {
                this.f114255a = y1Var;
            }

            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(l.k kVar, Continuation<? super Unit> continuation) {
                this.f114255a.plpStateHolder.M3(new G.AbstractC12559j.SetFilterAndSortOptions(kVar));
                return Unit.f143329a;
            }
        }

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return y1.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f114253a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                InterfaceC16548A<l.k> interfaceC16548AP0 = y1.this.s().p0();
                a aVar = new a(y1.this);
                this.f114253a = 1;
                if (interfaceC16548AP0.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class g extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        g(Object obj) {
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class h implements InterfaceC16561f<SearchSuggestions> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f114256a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f114257a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.meijer.search.SearchProductViewModelCompose$onCreate$$inlined$map$1$2", f = "SearchProductViewModelCompose.kt", l = {50}, m = "emit")
            /* renamed from: com.meijer.mobile.meijer.search.y1$h$a$a, reason: collision with other inner class name */
            public static final class C1806a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f114258a;

                /* renamed from: b, reason: collision with root package name */
                int f114259b;

                /* renamed from: c, reason: collision with root package name */
                Object f114260c;

                /* renamed from: e, reason: collision with root package name */
                Object f114262e;

                /* renamed from: f, reason: collision with root package name */
                Object f114263f;

                /* renamed from: g, reason: collision with root package name */
                Object f114264g;

                /* renamed from: h, reason: collision with root package name */
                int f114265h;

                public C1806a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f114258a = obj;
                    this.f114259b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC16562g interfaceC16562g) {
                this.f114257a = interfaceC16562g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // pv.InterfaceC16562g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.meijer.mobile.meijer.search.y1.h.a.C1806a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.meijer.mobile.meijer.search.y1$h$a$a r0 = (com.meijer.mobile.meijer.search.y1.h.a.C1806a) r0
                    int r1 = r0.f114259b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f114259b = r1
                    goto L18
                L13:
                    com.meijer.mobile.meijer.search.y1$h$a$a r0 = new com.meijer.mobile.meijer.search.y1$h$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f114258a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f114259b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r6 = r0.f114264g
                    pv.g r6 = (pv.InterfaceC16562g) r6
                    java.lang.Object r6 = r0.f114262e
                    com.meijer.mobile.meijer.search.y1$h$a$a r6 = (com.meijer.mobile.meijer.search.y1.h.a.C1806a) r6
                    kotlin.ResultKt.b(r7)
                    goto L5e
                L31:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L39:
                    kotlin.ResultKt.b(r7)
                    pv.g r7 = r5.f114257a
                    r2 = r6
                    Go.d r2 = (Go.SuggestionResult) r2
                    Go.a r4 = new Go.a
                    java.util.List r2 = r2.a()
                    r4.<init>(r2)
                    r0.f114260c = r6
                    r0.f114262e = r0
                    r0.f114263f = r6
                    r0.f114264g = r7
                    r6 = 0
                    r0.f114265h = r6
                    r0.f114259b = r3
                    java.lang.Object r6 = r7.emit(r4, r0)
                    if (r6 != r1) goto L5e
                    return r1
                L5e:
                    kotlin.Unit r6 = kotlin.Unit.f143329a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.search.y1.h.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public h(InterfaceC16561f interfaceC16561f) {
            this.f114256a = interfaceC16561f;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super SearchSuggestions> interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f114256a.collect(new a(interfaceC16562g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.search.SearchProductViewModelCompose$onCreate$10", f = "SearchProductViewModelCompose.kt", l = {271}, m = "invokeSuspend")
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f114266a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ y1 f114268a;

            a(y1 y1Var) {
                this.f114268a = y1Var;
            }

            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(G.n nVar, Continuation<? super Unit> continuation) {
                this.f114268a.T1(nVar);
                return Unit.f143329a;
            }
        }

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return y1.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f114266a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                InterfaceC16553F<G.n> interfaceC16553FB3 = y1.this.plpStateHolder.b3();
                a aVar = new a(y1.this);
                this.f114266a = 1;
                if (interfaceC16553FB3.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.search.SearchProductViewModelCompose$onCreate$11", f = "SearchProductViewModelCompose.kt", l = {275}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f114269a;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return y1.this.new j(continuation);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ y1 f114271a;

            a(y1 y1Var) {
                this.f114271a = y1Var;
            }

            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(G.ViewState viewState, Continuation<? super Unit> continuation) {
                String title;
                List<ProductListDecorator> listP = viewState.p();
                y1 y1Var = this.f114271a;
                for (ProductListDecorator productListDecorator : listP) {
                    ProductSponsorship sponsorship = productListDecorator.getSponsorship();
                    if (sponsorship != null && sponsorship.getSponsorSource() == Ho.b.f13875c) {
                        y1Var.d4(productListDecorator.getProduct().getBeaconInfo().getOnLoadBeacon(), productListDecorator.getProduct().getBeaconInfo().getFormatLevelOnLoadBeacon());
                    }
                }
                this.f114271a.w4(viewState.u());
                if (viewState.getTokenMatch() != null && viewState.getEmbeddingsMatch() != null && !viewState.getLoadingState().getIsLoading()) {
                    this.f114271a.A4(viewState.getLimitResultsScenario(), viewState.u(), viewState.getTokenMatch().intValue(), viewState.getEmbeddingsMatch().intValue());
                }
                this.f114271a.C3(viewState.getItemSelected());
                S1 s1S = this.f114271a.s();
                SnapshotStateList<ProductListDecorator> snapshotStateListE = s1S.E();
                snapshotStateListE.clear();
                snapshotStateListE.addAll(viewState.p());
                s1S.z().setValue(viewState.getGoogleAdSlot1());
                s1S.r().setValue(viewState.getGoogleAdSlot2());
                s1S.t().setValue(viewState.getGoogleAdSlot3());
                SearchQuery value = this.f114271a.s().o0().getValue();
                if (value != null && value.getIsScannedUPC()) {
                    this.f114271a.s();
                    ProductListDecorator productListDecorator2 = (ProductListDecorator) CollectionsKt.u0(viewState.p());
                    if (productListDecorator2 != null && (title = productListDecorator2.getTitle()) != null) {
                        this.f114271a.x4(title);
                    }
                }
                return Unit.f143329a;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f114269a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                pv.P<G.ViewState> pV3 = y1.this.plpStateHolder.v3();
                a aVar = new a(y1.this);
                this.f114269a = 1;
                if (pV3.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class k extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        k(Object obj) {
            super(1, obj, y1.class, "onCartCount", "onCartCount(I)V", 0);
        }

        public final void a(int i10) {
            ((y1) this.receiver).J2(i10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class l extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        l(Object obj) {
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
    /* synthetic */ class m extends FunctionReferenceImpl implements Function1<uk.c<ShoppingCart>, Unit> {
        m(Object obj) {
            super(1, obj, y1.class, "onShoppingCartStreamSuccess", "onShoppingCartStreamSuccess(Lcom/meijer/mobile/core/util/content/Resource;)V", 0);
        }

        public final void a(uk.c<ShoppingCart> p02) {
            Intrinsics.j(p02, "p0");
            ((y1) this.receiver).D3(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(uk.c<ShoppingCart> cVar) {
            a(cVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class n extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        n(Object obj) {
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
    /* synthetic */ class o extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        o(Object obj) {
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
    /* synthetic */ class p extends AdaptedFunctionReference implements Function2<SearchSuggestions, Continuation<? super Unit>, Object>, SuspendFunction {
        p(Object obj) {
            super(2, obj, y1.class, "onTypeAheadSuggestions", "onTypeAheadSuggestions(Lcom/meijer/mobile/product/model/fulldetails/models/search/SearchSuggestions;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SearchSuggestions searchSuggestions, Continuation<? super Unit> continuation) {
            return y1.Y2((y1) this.f143708a, searchSuggestions, continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "LGo/a;", "", "it", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.search.SearchProductViewModelCompose$onCreate$8", f = "SearchProductViewModelCompose.kt", l = {}, m = "invokeSuspend")
    static final class q extends SuspendLambda implements Function3<InterfaceC16562g<? super SearchSuggestions>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f114272a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f114273b;

        q(Continuation<? super q> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super SearchSuggestions> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            q qVar = new q(continuation);
            qVar.f114273b = th2;
            return qVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f114272a == 0) {
                ResultKt.b(obj);
                qw.a.INSTANCE.e((Throwable) this.f114273b);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class r extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        r(Object obj) {
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
    @DebugMetadata(c = "com.meijer.mobile.meijer.search.SearchProductViewModelCompose$onShoppingCartStreamSuccess$1", f = "SearchProductViewModelCompose.kt", l = {2460}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class s extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f114274a;

        /* renamed from: b, reason: collision with root package name */
        Object f114275b;

        /* renamed from: c, reason: collision with root package name */
        Object f114276c;

        /* renamed from: d, reason: collision with root package name */
        Object f114277d;

        /* renamed from: e, reason: collision with root package name */
        Object f114278e;

        /* renamed from: f, reason: collision with root package name */
        Object f114279f;

        /* renamed from: g, reason: collision with root package name */
        Object f114280g;

        /* renamed from: h, reason: collision with root package name */
        int f114281h;

        /* renamed from: i, reason: collision with root package name */
        int f114282i;

        /* renamed from: j, reason: collision with root package name */
        int f114283j;

        /* renamed from: k, reason: collision with root package name */
        int f114284k;

        /* renamed from: l, reason: collision with root package name */
        int f114285l;

        /* renamed from: m, reason: collision with root package name */
        int f114286m;

        /* renamed from: n, reason: collision with root package name */
        private /* synthetic */ Object f114287n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ uk.c<ShoppingCart> f114288o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ y1 f114289p;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            s sVar = new s(this.f114288o, this.f114289p, continuation);
            sVar.f114287n = obj;
            return sVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(uk.c<ShoppingCart> cVar, y1 y1Var, Continuation<? super s> continuation) {
            super(2, continuation);
            this.f114288o = cVar;
            this.f114289p = y1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((s) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x011a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 305
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.search.y1.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class t extends FunctionReferenceImpl implements Function2<Pk.c, EnumC15218a, Unit> {
        t(Object obj) {
            super(2, obj, y1.class, "onProductCouponButtonClicked", "onProductCouponButtonClicked(Lcom/meijer/mobile/coupon/model/common/CouponIdentity;Lcom/meijer/mobile/core/models/home/CarouselType;)V", 0);
        }

        public final void a(Pk.c p02, EnumC15218a p12) {
            Intrinsics.j(p02, "p0");
            Intrinsics.j(p12, "p1");
            ((y1) this.receiver).onProductCouponButtonClicked(p02, p12);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Pk.c cVar, EnumC15218a enumC15218a) {
            a(cVar, enumC15218a);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class u extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        u(Object obj) {
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
    @DebugMetadata(c = "com.meijer.mobile.meijer.search.SearchProductViewModelCompose$setSendSearchResultsAnalytics$1", f = "SearchProductViewModelCompose.kt", l = {1015}, m = "invokeSuspend")
    static final class v extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f114290a;

        v(Continuation<? super v> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return y1.this.new v(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((v) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f114290a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                this.f114290a = 1;
                if (mv.Z.b(3000L, this) == objF) {
                    return objF;
                }
            }
            y1.this.f4();
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.search.SearchProductViewModelCompose$updateFacetBuffer$1$1", f = "SearchProductViewModelCompose.kt", l = {557}, m = "invokeSuspend")
    static final class w extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f114292a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ S1 f114293b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l.k f114294c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new w(this.f114293b, this.f114294c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(S1 s12, l.k kVar, Continuation<? super w> continuation) {
            super(2, continuation);
            this.f114293b = s12;
            this.f114294c = kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((w) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f114292a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A<l.k> interfaceC16548AP0 = this.f114293b.p0();
                l.k kVar = this.f114294c;
                this.f114292a = 1;
                if (interfaceC16548AP0.emit(kVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.search.SearchProductViewModelCompose$updateFacetBuffer$2", f = "SearchProductViewModelCompose.kt", l = {565, 572}, m = "invokeSuspend")
    static final class x extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f114295a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l.k f114296b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l.k f114297c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ y1 f114298d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new x(this.f114296b, this.f114297c, this.f114298d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(l.k kVar, l.k kVar2, y1 y1Var, Continuation<? super x> continuation) {
            super(2, continuation);
            this.f114296b = kVar;
            this.f114297c = kVar2;
            this.f114298d = y1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((x) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
        
            return r0;
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
                int r1 = r4.f114295a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.ResultKt.b(r5)
                goto L60
            L1b:
                kotlin.ResultKt.b(r5)
                Qo.l$k r5 = r4.f114296b
                if (r5 == 0) goto L4b
                Qo.l$k r5 = r4.f114297c
                java.util.List r5 = r5.c1()
                java.util.Collection r5 = (java.util.Collection) r5
                boolean r5 = r5.isEmpty()
                if (r5 != 0) goto L4b
                com.meijer.mobile.meijer.search.y1 r5 = r4.f114298d
                com.meijer.mobile.meijer.search.S1 r5 = r5.s()
                pv.A r5 = r5.p0()
                Qo.l$k r1 = r4.f114296b
                Qo.l$k r2 = r4.f114297c
                Qo.l$k r1 = Qo.K.b(r1, r2)
                r4.f114295a = r3
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L60
                goto L5f
            L4b:
                com.meijer.mobile.meijer.search.y1 r5 = r4.f114298d
                com.meijer.mobile.meijer.search.S1 r5 = r5.s()
                pv.A r5 = r5.p0()
                Qo.l$k r1 = r4.f114297c
                r4.f114295a = r2
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L60
            L5f:
                return r0
            L60:
                kotlin.Unit r5 = kotlin.Unit.f143329a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.search.y1.x.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.search.SearchProductViewModelCompose$updateTokenAndEmbeddingsResults$4", f = "SearchProductViewModelCompose.kt", l = {1171}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class y extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f114299a;

        /* renamed from: b, reason: collision with root package name */
        Object f114300b;

        /* renamed from: c, reason: collision with root package name */
        Object f114301c;

        /* renamed from: d, reason: collision with root package name */
        Object f114302d;

        /* renamed from: e, reason: collision with root package name */
        Object f114303e;

        /* renamed from: f, reason: collision with root package name */
        Object f114304f;

        /* renamed from: g, reason: collision with root package name */
        int f114305g;

        /* renamed from: h, reason: collision with root package name */
        int f114306h;

        /* renamed from: i, reason: collision with root package name */
        int f114307i;

        /* renamed from: j, reason: collision with root package name */
        int f114308j;

        /* renamed from: k, reason: collision with root package name */
        int f114309k;

        /* renamed from: l, reason: collision with root package name */
        private /* synthetic */ Object f114310l;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ EnumC12707c f114312n;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.search.SearchProductViewModelCompose$updateTokenAndEmbeddingsResults$4$1$departments$1", f = "SearchProductViewModelCompose.kt", l = {1164}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f114313a;

            /* renamed from: b, reason: collision with root package name */
            int f114314b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ y1 f114315c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y1 y1Var, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f114315c = y1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f114315c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                y1 y1Var;
                Object value;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f114314b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        y1Var = (y1) this.f114313a;
                        ResultKt.b(obj);
                        value = ((Result) obj).getValue();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    y1 y1Var2 = this.f114315c;
                    this.f114313a = y1Var2;
                    this.f114314b = 1;
                    Object objO2 = y1Var2.o2(this);
                    if (objO2 == objF) {
                        return objF;
                    }
                    y1Var = y1Var2;
                    value = objO2;
                }
                y1Var.R3(value);
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.search.SearchProductViewModelCompose$updateTokenAndEmbeddingsResults$4$1$personalized$1", f = "SearchProductViewModelCompose.kt", l = {1168}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f114316a;

            /* renamed from: b, reason: collision with root package name */
            int f114317b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ y1 f114318c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(y1 y1Var, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f114318c = y1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f114318c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                y1 y1Var;
                Object value;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f114317b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        y1Var = (y1) this.f114316a;
                        ResultKt.b(obj);
                        value = ((Result) obj).getValue();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    y1 y1Var2 = this.f114318c;
                    e.f.a aVar = e.f.a.f40004d;
                    this.f114316a = y1Var2;
                    this.f114317b = 1;
                    Object objQ2 = y1Var2.q2(aVar, this);
                    if (objQ2 == objF) {
                        return objF;
                    }
                    y1Var = y1Var2;
                    value = objQ2;
                }
                y1Var.T3(value);
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(EnumC12707c enumC12707c, Continuation<? super y> continuation) {
            super(2, continuation);
            this.f114312n = enumC12707c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            y yVar = y1.this.new y(this.f114312n, continuation);
            yVar.f114310l = obj;
            return yVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((y) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f114309k;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f114310l;
                    y1 y1Var = y1.this;
                    Result.Companion companion = Result.INSTANCE;
                    y1Var.s().O().setValue(new LoadingDecorator(null, null, 3, null));
                    mv.C0 c0D = C15809k.d(interfaceC15783O, y1Var.ioDispatcher, null, new a(y1Var, null), 2, null);
                    mv.C0 c0D2 = C15809k.d(interfaceC15783O, y1Var.ioDispatcher, null, new b(y1Var, null), 2, null);
                    mv.C0[] c0Arr = {c0D, c0D2};
                    this.f114310l = interfaceC15783O;
                    this.f114299a = interfaceC15783O;
                    this.f114300b = this;
                    this.f114301c = this;
                    this.f114302d = interfaceC15783O;
                    this.f114303e = c0D;
                    this.f114304f = c0D2;
                    this.f114305g = 0;
                    this.f114306h = 0;
                    this.f114307i = 0;
                    this.f114308j = 0;
                    this.f114309k = 1;
                    if (C15799f.c(c0Arr, this) == objF) {
                        return objF;
                    }
                }
                objB = Result.b(Unit.f143329a);
            } catch (Exception e10) {
                mv.E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            y1 y1Var2 = y1.this;
            EnumC12707c enumC12707c = this.f114312n;
            if (Result.h(objB)) {
                y1Var2.s().O().setValue(null);
                y1Var2.y4(enumC12707c);
            }
            y1 y1Var3 = y1.this;
            EnumC12707c enumC12707c2 = this.f114312n;
            if (Result.e(objB) != null) {
                y1Var3.s().O().setValue(null);
                y1Var3.y4(enumC12707c2);
            }
            return Unit.f143329a;
        }
    }

    public y1(Ro.c productsRepository, com.meijer.mobile.meijer.activity.personalized.modals.G plpStateHolder, tl.h timeSlotRepository, yo.k userManager, Ro.a productAnalytics, il.m cartRepository, C15052a homeRepository, InterfaceC14523a analyticsEngine, Dl.e meijerIntent, zl.k featureManager, Bl.g featureEntryPoint, C13702d couponsRepository, C17115a multiChannelProductsStateRepository, pp.e sponsorshipsDataStore, AbstractC15779K ioDispatcher) {
        Intrinsics.j(productsRepository, "productsRepository");
        Intrinsics.j(plpStateHolder, "plpStateHolder");
        Intrinsics.j(timeSlotRepository, "timeSlotRepository");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(productAnalytics, "productAnalytics");
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(homeRepository, "homeRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(meijerIntent, "meijerIntent");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(featureEntryPoint, "featureEntryPoint");
        Intrinsics.j(couponsRepository, "couponsRepository");
        Intrinsics.j(multiChannelProductsStateRepository, "multiChannelProductsStateRepository");
        Intrinsics.j(sponsorshipsDataStore, "sponsorshipsDataStore");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.productsRepository = productsRepository;
        this.plpStateHolder = plpStateHolder;
        this.timeSlotRepository = timeSlotRepository;
        this.userManager = userManager;
        this.productAnalytics = productAnalytics;
        this.cartRepository = cartRepository;
        this.homeRepository = homeRepository;
        this.analyticsEngine = analyticsEngine;
        this.meijerIntent = meijerIntent;
        this.featureManager = featureManager;
        this.featureEntryPoint = featureEntryPoint;
        this.couponsRepository = couponsRepository;
        this.multiChannelProductsStateRepository = multiChannelProductsStateRepository;
        this.sponsorshipsDataStore = sponsorshipsDataStore;
        this.ioDispatcher = ioDispatcher;
        SnapshotStateList snapshotStateListS = androidx.compose.runtime.o1.s(userManager.v());
        InterfaceC5872l0 interfaceC5872l0 = null;
        InterfaceC5872l0 interfaceC5872l02 = null;
        InterfaceC5872l0 interfaceC5872l03 = null;
        InterfaceC5872l0 interfaceC5872l04 = null;
        InterfaceC5872l0 interfaceC5872l05 = null;
        InterfaceC5872l0 interfaceC5872l06 = null;
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
        SnapshotStateList snapshotStateList = null;
        InterfaceC5872l0 interfaceC5872l017 = null;
        InterfaceC5872l0 interfaceC5872l018 = null;
        InterfaceC5872l0 interfaceC5872l019 = null;
        InterfaceC5872l0 interfaceC5872l020 = null;
        InterfaceC5872l0 interfaceC5872l021 = null;
        InterfaceC5872l0 interfaceC5872l022 = null;
        InterfaceC5872l0 interfaceC5872l023 = null;
        InterfaceC5872l0 interfaceC5872l024 = null;
        InterfaceC5872l0 interfaceC5872l025 = null;
        InterfaceC5872l0 interfaceC5872l026 = null;
        this.viewState = new S1(new Function1() { // from class: com.meijer.mobile.meijer.search.H0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.I4(this.f113808a, (R1) obj);
            }
        }, interfaceC5872l0, interfaceC5872l02, interfaceC5872l03, interfaceC5872l04, androidx.compose.runtime.t1.e(Pp.b.f26238a, null, 2, null), interfaceC5872l05, interfaceC5872l06, interfaceC5872l07, interfaceC5872l08, interfaceC5872l09, interfaceC5872l010, interfaceC5872l011, interfaceC5872l012, snapshotStateListS, interfaceC5872l013, interfaceC5872l014, interfaceC5872l015, interfaceC5872l016, snapshotStateList, interfaceC5872l017, interfaceC5872l018, interfaceC5872l019, interfaceC5872l020, interfaceC5872l021, interfaceC5872l022, interfaceC5872l023, interfaceC5872l024, interfaceC5872l025, interfaceC5872l026, androidx.compose.runtime.t1.e(Boolean.valueOf(featureManager.e(AbstractC18503f.C18509g.f172878h)), null, 2, null), androidx.compose.runtime.t1.e(Boolean.valueOf(featureManager.e(AbstractC18503f.k0.f172887h)), null, 2, null), androidx.compose.runtime.t1.e(Boolean.valueOf(featureManager.e(AbstractC18503f.l0.f172889h)), null, 2, null), androidx.compose.runtime.t1.e(Boolean.valueOf(featureManager.e(AbstractC18503f.C18526x.f172912h)), null, 2, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073725406, 1073741820, null);
    }

    private final void B2(int resultCode) {
        int i10;
        switch (resultCode) {
            case 867530912:
                i10 = C17284b.f163321g;
                break;
            case 867530913:
                i10 = C17284b.f163319f;
                break;
            default:
                i10 = 0;
                break;
        }
        if (i10 != 0) {
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            n(y(new j.Toast(null, companion.d(i10, new Object[0]), 0.0f, companion.d(C17284b.f163301T0, new Object[0]), null, false, null, 117, null), new Function0() { // from class: com.meijer.mobile.meijer.search.w0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(y1.C2(this.f114180a));
                }
            }));
        }
    }

    private final void v4(l.k query, boolean resetDeeplinkFacet) {
        if (!resetDeeplinkFacet) {
            C15809k.d(androidx.view.d0.a(this), null, null, new x(s().T().getValue(), query, this, null), 3, null);
        } else {
            S1 s1S = s();
            s1S.T().setValue(null);
            C15809k.d(androidx.view.d0.a(this), null, null, new w(s1S, query, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent A1(y1 y1Var, Context setProvideIntent) {
        Intrinsics.j(setProvideIntent, "$this$setProvideIntent");
        return Bl.h.k(setProvideIntent, true, true, y1Var.featureManager.e(AbstractC18503f.L.f172851h));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A2(String str, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("searchTerm", str);
        stageEvent.h("searchMethod", "Barcode Search");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A3(y1 y1Var, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("trackState", "Search icon action triggered on tap");
        stageEvent.h("searchTerm", y1Var.s().d().getValue());
        stageEvent.h("searchMethod", "Typed Search");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B1(y1 y1Var, R1.BarcodeIconTapped barcodeIconTapped, C14274a result) {
        Intrinsics.j(result, "result");
        y1Var.z2(result, barcodeIconTapped.getHasScannedProductExtra());
        return Unit.f143329a;
    }

    private final boolean B4(int errorMessageId) {
        if (this.userManager.b()) {
            return true;
        }
        final S1 s1S = s();
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        n(v(A(new j.Dialog(null, null, companion.d(errorMessageId, new Object[0]), companion.d(Cj.o.f5016F0, new Object[0]), companion.d(Cj.o.f5090u, new Object[0]), null, false, null, 227, null), new Function2() { // from class: com.meijer.mobile.meijer.search.Z0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return y1.C4(this.f114087a, s1S, (DialogInterface) obj, ((Integer) obj2).intValue());
            }
        }), new Function2() { // from class: com.meijer.mobile.meijer.search.a1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return y1.E4(this.f114092a, (DialogInterface) obj, ((Integer) obj2).intValue());
            }
        }));
        return false;
    }

    private final void C1() {
        n(u(new j.NavigateTo(null, 1, null), new Function1() { // from class: com.meijer.mobile.meijer.search.o1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.D1(this.f114151a, (Context) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C2(final y1 y1Var) {
        y1Var.n(y1Var.u(new j.NavigateTo(null, 1, null), new Function1() { // from class: com.meijer.mobile.meijer.search.y0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.D2(this.f114189a, (Context) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C4(y1 y1Var, final S1 s12, DialogInterface dialog, int i10) {
        Intrinsics.j(dialog, "dialog");
        dialog.dismiss();
        y1Var.n(y1Var.u(new j.NavigateTo(null, 1, null), new Function1() { // from class: com.meijer.mobile.meijer.search.s1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.D4(s12, (Context) obj);
            }
        }));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent D1(y1 y1Var, Context setNavigate) {
        Intrinsics.j(setNavigate, "$this$setNavigate");
        return Dl.e.j(y1Var.meijerIntent, setNavigate, Qk.c.f31040d, y1Var.featureManager.e(AbstractC18503f.M.f172852h), y1Var.featureManager.e(AbstractC18503f.N.f172853h), 0, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent D2(y1 y1Var, Context setNavigate) {
        Intrinsics.j(setNavigate, "$this$setNavigate");
        return y1Var.featureEntryPoint.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent D4(S1 s12, Context setNavigate) {
        Intrinsics.j(setNavigate, "$this$setNavigate");
        return Bl.k.b(setNavigate, false, null, 536872912, null, null, null, 118, null).putExtra("unauth_search_term", s12.d().getValue());
    }

    private final void E1() {
        n(u(new j.NavigateTo(null, 1, null), new Function1() { // from class: com.meijer.mobile.meijer.search.O0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.F1(this.f113852a, (Context) obj);
            }
        }));
    }

    private final void E3(R1.StepperStateChanged stepper) {
        this.plpStateHolder.M3(new G.AbstractC12559j.StepperStateChangedAction(stepper.getProductCode(), 0.0d, new Rect()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E4(final y1 y1Var, DialogInterface dialog, int i10) {
        Intrinsics.j(dialog, "dialog");
        dialog.dismiss();
        y1Var.n(y1Var.u(new j.NavigateTo(null, 1, null), new Function1() { // from class: com.meijer.mobile.meijer.search.q1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.F4(this.f114158a, (Context) obj);
            }
        }));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent F1(y1 y1Var, Context setNavigate) {
        Intrinsics.j(setNavigate, "$this$setNavigate");
        return y1Var.featureEntryPoint.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent F2(y1 y1Var, l.k kVar, Context setProvideIntent) {
        Intrinsics.j(setProvideIntent, "$this$setProvideIntent");
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(y1Var.s().h0().getValue(), y1Var.s().W().getValue()));
        intent.putExtra("FILTER_AND_SORT_ACTIVITY_LAUNCH_KEY", com.meijer.mobile.meijer.activity.find.filter.h.f107564a);
        intent.putExtra("SEARCH", kVar);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent F4(y1 y1Var, Context setNavigate) {
        Intrinsics.j(setNavigate, "$this$setNavigate");
        return Bl.f.f3124a.a(setNavigate, y1Var.featureManager.e(AbstractC18503f.h0.f172881h));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G2(y1 y1Var, C14274a result) {
        Intent data;
        Parcelable parcelable;
        String displayName;
        Intrinsics.j(result, "result");
        if (result.getResultCode() == -1 && (data = result.getData()) != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) data.getParcelableExtra("SEARCH", l.Search.class);
            } else {
                Parcelable parcelableExtra = data.getParcelableExtra("SEARCH");
                if (!(parcelableExtra instanceof l.Search)) {
                    parcelableExtra = null;
                }
                parcelable = (l.Search) parcelableExtra;
            }
            l.Search search = (l.Search) parcelable;
            if (search != null) {
                S1 s1S = y1Var.s();
                y1Var.v4(search, true);
                InterfaceC5872l0<String> interfaceC5872l0Y0 = s1S.y0();
                FilterSortOption selectedSort = search.getSelectedSort();
                if (selectedSort == null || (displayName = selectedSort.getDisplayName()) == null) {
                    displayName = "Most Relevant";
                }
                interfaceC5872l0Y0.setValue(displayName);
            }
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G3(Suggestion suggestion, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("searchTerm", suggestion.b());
        stageEvent.h("searchMethod", "Search Suggestions");
        return Unit.f143329a;
    }

    private final void G4() {
        n(u(new j.NavigateTo(null, 1, null), new Function1() { // from class: com.meijer.mobile.meijer.search.V0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.H4(this.f114079a, (Context) obj);
            }
        }));
    }

    private final void H1(final Coupon coupon, final TrackingData trackingData) {
        io.reactivex.u<ClipUnclipCouponResponse> uVarK = this.couponsRepository.h(coupon).k(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.search.C0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.I1(this.f113767a, coupon, trackingData, (ClipUnclipCouponResponse) obj);
            }
        };
        Lu.g<? super ClipUnclipCouponResponse> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.search.D0
            @Override // Lu.g
            public final void accept(Object obj) {
                y1.J1(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.meijer.mobile.meijer.search.E0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.K1(this.f113792a, coupon, trackingData, (Throwable) obj);
            }
        };
        Dk.a.a(uVarK.o(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.search.G0
            @Override // Lu.g
            public final void accept(Object obj) {
                y1.N1(function12, obj);
            }
        }), getDisposables());
    }

    private final void H2() {
        this.plpStateHolder.M3(G.AbstractC12559j.f.f111616a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent H4(y1 y1Var, Context setNavigate) {
        Intrinsics.j(setNavigate, "$this$setNavigate");
        y1Var.analyticsEngine.h(C14756c.a("Event: shop department carousel: view all"), new AbstractC14762i[0]);
        return Bl.g.B(y1Var.featureEntryPoint, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I4(y1 y1Var, R1 it) {
        Intrinsics.j(it, "it");
        y1Var.t4(it);
        return Unit.f143329a;
    }

    private final void J3() {
        this.analyticsEngine.h(C14756c.a("shopDepartmentMenu"), new AbstractC14762i[0]);
        n(u(new j.NavigateTo(null, 1, null), new Function1() { // from class: com.meijer.mobile.meijer.search.n1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.K3(this.f114148a, (Context) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K1(final y1 y1Var, final Coupon coupon, final TrackingData trackingData, Throwable th2) {
        qw.a.INSTANCE.e(th2);
        y1Var.s();
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        y1Var.n(y1Var.v(y1Var.A(new j.Dialog(null, companion.d(Nr.g.f22702n, new Object[0]), companion.d(Nr.g.f22700m, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f100486Ih, new Object[0]), companion.d(Nr.g.f22664O, new Object[0]), null, false, null, 225, null), new Function2() { // from class: com.meijer.mobile.meijer.search.T0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return y1.L1(this.f114072a, coupon, trackingData, (DialogInterface) obj, ((Integer) obj2).intValue());
            }
        }), new Function2() { // from class: com.meijer.mobile.meijer.search.U0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return y1.M1((DialogInterface) obj, ((Integer) obj2).intValue());
            }
        }));
        return Unit.f143329a;
    }

    private final void K2(final Qk.a action) {
        if (action instanceof a.Clip) {
            io.reactivex.l<Coupon> lVarObserveOn = this.couponsRepository.k(((a.Clip) action).getCoupon()).take(1L).observeOn(Iu.a.a());
            final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.search.r0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return y1.L2(this.f114159a, action, (Coupon) obj);
                }
            };
            Lu.g<? super Coupon> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.search.s0
                @Override // Lu.g
                public final void accept(Object obj) {
                    y1.M2(function1, obj);
                }
            };
            final g gVar2 = new g(qw.a.INSTANCE);
            Dk.a.a(lVarObserveOn.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.search.t0
                @Override // Lu.g
                public final void accept(Object obj) {
                    y1.N2(gVar2, obj);
                }
            }), getDisposables());
            return;
        }
        if (action instanceof a.ViewCouponDetails) {
            n(u(new j.NavigateTo(null, 1, null), new Function1() { // from class: com.meijer.mobile.meijer.search.v0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return y1.O2(this.f114174a, action, (Context) obj);
                }
            }));
        } else if (!(action instanceof a.NotInterested) && !(action instanceof a.Unclip) && !(action instanceof a.ViewCouponList)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent K3(y1 y1Var, Context setNavigate) {
        Intrinsics.j(setNavigate, "$this$setNavigate");
        return Bl.g.B(y1Var.featureEntryPoint, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L1(y1 y1Var, Coupon coupon, TrackingData trackingData, DialogInterface dialog, int i10) {
        Intrinsics.j(dialog, "dialog");
        dialog.dismiss();
        y1Var.K2(new a.Clip(coupon, trackingData));
        return Unit.f143329a;
    }

    private final void L3() {
        this.analyticsEngine.h(C14756c.a("viewFavoritesMenu"), new AbstractC14762i[0]);
        n(u(new j.NavigateTo(null, 1, null), new Function1() { // from class: com.meijer.mobile.meijer.search.I0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.M3(this.f113815a, (Context) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M1(DialogInterface dialog, int i10) {
        Intrinsics.j(dialog, "dialog");
        dialog.dismiss();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent M3(y1 y1Var, Context setNavigate) {
        Intrinsics.j(setNavigate, "$this$setNavigate");
        return y1Var.featureEntryPoint.K(l.d.f152504a);
    }

    private final void O1() {
        n(u(new j.NavigateTo(null, 1, null), new Function1() { // from class: com.meijer.mobile.meijer.search.f1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.P1(this.f114123a, (Context) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent O2(y1 y1Var, Qk.a aVar, Context setNavigate) {
        AbstractC14761h event;
        Intrinsics.j(setNavigate, "$this$setNavigate");
        Dl.e eVar = y1Var.meijerIntent;
        a.ViewCouponDetails viewCouponDetails = (a.ViewCouponDetails) aVar;
        Pk.c coupon = viewCouponDetails.getCoupon();
        TrackingData trackingData = viewCouponDetails.getTrackingData();
        return eVar.f(coupon, true, true, true, (trackingData == null || (event = trackingData.getEvent()) == null) ? null : event.getValue());
    }

    private final void O3(SearchQuery searchQuery, String searchMethod) {
        s().o0().setValue(searchQuery);
        String queryString = searchQuery.getQueryString();
        if (queryString == null) {
            queryString = "";
        }
        l4(queryString, searchMethod);
        CouponOptions couponOptions = new CouponOptions(null, null, null, false, false, 0L, null, null, false, null, null, false, false, 8191, null);
        couponOptions.s(searchQuery);
        s().i().setValue(couponOptions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent P1(y1 y1Var, Context setNavigate) {
        Intrinsics.j(setNavigate, "$this$setNavigate");
        return Dl.e.j(y1Var.meijerIntent, setNavigate, null, y1Var.featureManager.e(AbstractC18503f.M.f172852h), y1Var.featureManager.e(AbstractC18503f.N.f172853h), 1, 2, null);
    }

    private final void P3(final R1.PersonalizedProductListClicked vsu) {
        n(u(new j.NavigateTo(null, 1, null), new Function1() { // from class: com.meijer.mobile.meijer.search.L0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.Q3(vsu, this, (Context) obj);
            }
        }));
    }

    private final void Q1() {
        this.plpStateHolder.M3(G.AbstractC12559j.b.f111607a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q2(TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("pageName", "Meijer:Search Results Page");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.content.Intent Q3(com.meijer.mobile.meijer.search.R1.PersonalizedProductListClicked r12, com.meijer.mobile.meijer.search.y1 r13, android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.search.y1.Q3(com.meijer.mobile.meijer.search.R1$u, com.meijer.mobile.meijer.search.y1, android.content.Context):android.content.Intent");
    }

    private final void R1() {
        this.plpStateHolder.M3(new G.AbstractC12559j.CollapseQuantityStepperAction(0, 0));
    }

    private final void S1(R1.CompleteSearchAction csa) {
        n(new j.DismissKeyboard(null, 1, null));
        R1.CompleteSearchAction completeSearchAction = csa.getIsSuggestion() ? csa : null;
        if (completeSearchAction != null) {
            this.productAnalytics.b(completeSearchAction.getSearchTerm(), completeSearchAction.getOriginalTerm());
        }
        S1 s1S = s();
        s1S.d().setValue(csa.getSearchTerm());
        s1S.O0().setValue(Boolean.valueOf(csa.getIsScannedUpc()));
        y3(csa.getSearchTerm(), csa.getIsScannedUpc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T1(final G.n event) {
        if (event instanceof G.n.UpdateProductsInfoEvent) {
            G.n.UpdateProductsInfoEvent updateProductsInfoEvent = (G.n.UpdateProductsInfoEvent) event;
            if (updateProductsInfoEvent.getTotalProductCount() > 0) {
                k4(updateProductsInfoEvent.getFirstProductName());
            }
            if (s().v0().getValue().booleanValue()) {
                this.analyticsEngine.g(C14756c.h("Product Search Page"), new Function1() { // from class: com.meijer.mobile.meijer.search.Z
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return y1.U1(event, (TrackingData) obj);
                    }
                });
                return;
            }
            return;
        }
        if (event instanceof G.n.UpdateToCartFailedEvent) {
            Q1();
            n(new j.Toast(null, AbstractC6392a.INSTANCE.d(((G.n.UpdateToCartFailedEvent) event).getMessageResId(), new Object[0]), 0.0f, null, Hi.e.f13557b, false, q1.m.a.b.f142368a, 13, null));
            return;
        }
        if (event instanceof G.n.CartUpdateSuccessEvent) {
            Q1();
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            G.n.CartUpdateSuccessEvent cartUpdateSuccessEvent = (G.n.CartUpdateSuccessEvent) event;
            n(y(new j.Toast(null, companion.d(cartUpdateSuccessEvent.getMessageResId(), new Object[0]), 0.0f, companion.d(cartUpdateSuccessEvent.getActionResId(), new Object[0]), Hi.e.f13557b, true, q1.m.a.d.f142372a, 5, null), new Function0() { // from class: com.meijer.mobile.meijer.search.c0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(y1.V1(this.f114102a));
                }
            }));
            return;
        }
        if (event instanceof G.n.OpenLowStockScreenEvent) {
            n(w(B(new j.ActivityResultEffect(null, "findSubstitutionResult", 1, null), new Function1() { // from class: com.meijer.mobile.meijer.search.d0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return y1.X1(this.f114107a, event, (Context) obj);
                }
            }), new Function1() { // from class: com.meijer.mobile.meijer.search.e0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return y1.Y1(this.f114115a, (C14274a) obj);
                }
            }));
            return;
        }
        if (event instanceof G.n.ShowChokingWarningDialogEvent) {
            AbstractC6392a.Companion companion2 = AbstractC6392a.INSTANCE;
            G.n.ShowChokingWarningDialogEvent showChokingWarningDialogEvent = (G.n.ShowChokingWarningDialogEvent) event;
            n(v(A(new j.Dialog(null, companion2.d(showChokingWarningDialogEvent.a().getTitle(), new Object[0]), companion2.d(showChokingWarningDialogEvent.a().getBody(), new Object[0]), companion2.d(showChokingWarningDialogEvent.a().getPositiveButtonText(), new Object[0]), companion2.d(showChokingWarningDialogEvent.a().getNegativeButtonText(), new Object[0]), null, false, Integer.valueOf(Cj.i.f4711J1), 33, null), new Function2() { // from class: com.meijer.mobile.meijer.search.f0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return y1.Z1(this.f114121a, event, (DialogInterface) obj, ((Integer) obj2).intValue());
                }
            }), new Function2() { // from class: com.meijer.mobile.meijer.search.g0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return y1.a2(this.f114125a, (DialogInterface) obj, ((Integer) obj2).intValue());
                }
            }));
            return;
        }
        if (event instanceof G.n.BubbleFacetsToFilterAndSort) {
            n2(((G.n.BubbleFacetsToFilterAndSort) event).getQuery());
            return;
        }
        if (event instanceof G.n.ShowError) {
            s().O().setValue(null);
            G.n.ShowError showError = (G.n.ShowError) event;
            n(A(new j.Dialog(null, showError.getTitle(), showError.getMessage(), showError.getPositiveButtonText(), null, null, false, null, 241, null), new Function2() { // from class: com.meijer.mobile.meijer.search.h0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return y1.b2((DialogInterface) obj, ((Integer) obj2).intValue());
                }
            }));
            return;
        }
        if (event instanceof G.n.ClipCouponFailedEvent) {
            AbstractC6392a.Companion companion3 = AbstractC6392a.INSTANCE;
            G.n.ClipCouponFailedEvent clipCouponFailedEvent = (G.n.ClipCouponFailedEvent) event;
            n(v(A(new j.Dialog(null, companion3.d(clipCouponFailedEvent.getTitleResId(), new Object[0]), companion3.d(clipCouponFailedEvent.getMessageResId(), new Object[0]), companion3.d(clipCouponFailedEvent.getPositiveButtonResId(), new Object[0]), companion3.d(clipCouponFailedEvent.getNegativeButtonResId(), new Object[0]), null, false, null, 225, null), new Function2() { // from class: com.meijer.mobile.meijer.search.i0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return y1.c2(this.f114131a, event, (DialogInterface) obj, ((Integer) obj2).intValue());
                }
            }), new Function2() { // from class: com.meijer.mobile.meijer.search.k0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return y1.e2((DialogInterface) obj, ((Integer) obj2).intValue());
                }
            }));
            return;
        }
        if ((event instanceof G.n.f) || (event instanceof G.n.g)) {
            n(x(new j.FinishActivity(null, 1, null), new Function1() { // from class: com.meijer.mobile.meijer.search.l0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return y1.f2((Wi.a) obj);
                }
            }));
            return;
        }
        if (event instanceof G.n.SubstitutionFailureEvent) {
            AbstractC6392a.Companion companion4 = AbstractC6392a.INSTANCE;
            G.n.SubstitutionFailureEvent substitutionFailureEvent = (G.n.SubstitutionFailureEvent) event;
            n(A(new j.Dialog(null, companion4.d(substitutionFailureEvent.getTitleResId(), new Object[0]), companion4.d(substitutionFailureEvent.getMessageResId(), new Object[0]), companion4.d(C17284b.f163305W, new Object[0]), null, null, false, null, 241, null), new Function2() { // from class: com.meijer.mobile.meijer.search.a0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return y1.g2((DialogInterface) obj, ((Integer) obj2).intValue());
                }
            }));
        } else if (event instanceof G.n.ShowFreeItemsSnackbar) {
            n(new j.Toast(null, ((G.n.ShowFreeItemsSnackbar) event).getMessage(), 0.0f, null, Hi.e.f13557b, true, null, 77, null));
        } else {
            if ((event instanceof G.n.d) || !(event instanceof G.n.ShowPDPEvent)) {
                return;
            }
            n(u(new j.NavigateTo(null, 1, null), new Function1() { // from class: com.meijer.mobile.meijer.search.b0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return y1.h2(this.f114093a, event, (Context) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T3(Object result) {
        e.f.a aVar = e.f.a.f40004d;
        Throwable thE = Result.e(result);
        if (thE != null) {
            setLoadingStateError(aVar.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), thE);
        }
        if (Result.h(result)) {
            Vl.j jVar = (Vl.j) result;
            s().g0().getValue().b(new a.NotLoading(aVar.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()));
            Map mapD = MapsKt.D(s().x().getValue().getPersonalizedCarousels());
            String cardTitle = jVar.getCardTitle();
            String seeAllDeepLink = jVar.getSeeAllDeepLink();
            if (seeAllDeepLink == null) {
                seeAllDeepLink = "";
            }
            s().x().setValue(HomeDecorator.copy$default(s().x().getValue(), null, null, null, null, null, null, null, null, null, null, null, null, MapsKt.v(mapD, TuplesKt.a(aVar, new CarouselDecorator(null, aVar.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), null, null, cardTitle, seeAllDeepLink, EnumC15218a.f142567a, 13, null))), 0, false, false, null, null, false, null, this.userManager.b(), null, 0, false, null, null, null, null, false, 535818239, null));
            this.multiChannelProductsStateRepository.c(aVar, jVar.c());
            s().I().setValue(Boolean.valueOf(this.userManager.b() && !jVar.c().isEmpty()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U1(G.n nVar, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        G.n.UpdateProductsInfoEvent updateProductsInfoEvent = (G.n.UpdateProductsInfoEvent) nVar;
        stageEvent.h("outOfStockProductList", updateProductsInfoEvent.getOutOfStockList());
        stageEvent.h("lowStockProducts", updateProductsInfoEvent.getLowStockList());
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U2(final y1 y1Var, final Object key, sp.Y repo) {
        Intrinsics.j(key, "key");
        Intrinsics.j(repo, "repo");
        io.reactivex.l<List<ProductState<ProductFullDetails>>> lVarSubscribeOn = repo.Y0().subscribeOn(C13889a.b());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.search.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.V2(this.f114144a, key, (List) obj);
            }
        };
        Lu.g<? super List<ProductState<ProductFullDetails>>> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.search.n0
            @Override // Lu.g
            public final void accept(Object obj) {
                y1.W2(function1, obj);
            }
        };
        final o oVar = new o(qw.a.INSTANCE);
        Dk.a.a(lVarSubscribeOn.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.search.o0
            @Override // Lu.g
            public final void accept(Object obj) {
                y1.X2(oVar, obj);
            }
        }), y1Var.getDisposables());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean V1(final y1 y1Var) {
        y1Var.n(y1Var.u(new j.NavigateTo(null, 1, null), new Function1() { // from class: com.meijer.mobile.meijer.search.p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.W1(this.f114155a, (Context) obj);
            }
        }));
        return true;
    }

    private final void V3(final R1.ProductFromBuyAgainCarouselTapped vsu) {
        n(u(new j.NavigateTo(null, 1, null), new Function1() { // from class: com.meijer.mobile.meijer.search.l1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.W3(this.f114141a, vsu, (Context) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent W1(y1 y1Var, Context setNavigate) {
        Intrinsics.j(setNavigate, "$this$setNavigate");
        return y1Var.featureEntryPoint.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent W3(y1 y1Var, R1.ProductFromBuyAgainCarouselTapped productFromBuyAgainCarouselTapped, Context setNavigate) {
        Intrinsics.j(setNavigate, "$this$setNavigate");
        return y1Var.featureEntryPoint.s(productFromBuyAgainCarouselTapped.getProduct(), false, true, productFromBuyAgainCarouselTapped.getTrackingState());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent X1(y1 y1Var, G.n nVar, Context setProvideIntent) {
        Intrinsics.j(setProvideIntent, "$this$setProvideIntent");
        return Bl.t.d(Bl.t.f3152a, new ComponentName(y1Var.s().h0().getValue(), y1Var.s().Y().getValue()), ((G.n.OpenLowStockScreenEvent) nVar).getDecorator(), Pp.c.f26248d, null, "product search page", 8, null);
    }

    private final void X3(Pk.c couponIdentity, final TrackingData trackingData) {
        io.reactivex.l<Coupon> lVarObserveOn = this.couponsRepository.k(couponIdentity).take(1L).observeOn(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.search.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.Y3(this.f114320a, trackingData, (Coupon) obj);
            }
        };
        Lu.g<? super Coupon> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.search.A0
            @Override // Lu.g
            public final void accept(Object obj) {
                y1.Z3(function1, obj);
            }
        };
        final u uVar = new u(qw.a.INSTANCE);
        Dk.a.a(lVarObserveOn.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.search.B0
            @Override // Lu.g
            public final void accept(Object obj) {
                y1.a4(uVar, obj);
            }
        }), getDisposables());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y1(y1 y1Var, C14274a result) {
        Intrinsics.j(result, "result");
        y1Var.B2(result.getResultCode());
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z1(y1 y1Var, G.n nVar, DialogInterface dialog, int i10) {
        Intrinsics.j(dialog, "dialog");
        dialog.dismiss();
        y1Var.u4(((G.n.ShowChokingWarningDialogEvent) nVar).a().b());
        return Unit.f143329a;
    }

    private final void Z2(final R1.DepartmentItemClicked vsu) {
        this.analyticsEngine.b(C14756c.h("shopDepartmentTierLevel"), new Function1() { // from class: com.meijer.mobile.meijer.search.d1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.a3(vsu, (TrackingData) obj);
            }
        });
        n(u(new j.NavigateTo(null, 1, null), new Function1() { // from class: com.meijer.mobile.meijer.search.e1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.b3(this.f114116a, vsu, (Context) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a2(y1 y1Var, DialogInterface dialog, int i10) {
        Intrinsics.j(dialog, "dialog");
        dialog.dismiss();
        y1Var.Q1();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a3(R1.DepartmentItemClicked departmentItemClicked, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.s("tierName", departmentItemClicked.getName());
        track.p("shop department carousel: tier 1 category");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b2(DialogInterface dialog, int i10) {
        Intrinsics.j(dialog, "dialog");
        dialog.dismiss();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent b3(y1 y1Var, R1.DepartmentItemClicked departmentItemClicked, Context setNavigate) {
        Intrinsics.j(setNavigate, "$this$setNavigate");
        return y1Var.meijerIntent.n(setNavigate, departmentItemClicked.getDeeplink());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c2(y1 y1Var, G.n nVar, DialogInterface dialog, int i10) {
        Intrinsics.j(dialog, "dialog");
        dialog.dismiss();
        y1Var.x3(((G.n.ClipCouponFailedEvent) nVar).getCoupon(), C14760g.a(C14756c.a("coupon clip"), new Function1() { // from class: com.meijer.mobile.meijer.search.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.d2((TrackingData) obj);
            }
        }));
        return Unit.f143329a;
    }

    private final void c3(R1.UpdateEntry updateEntry) {
        if (this.userManager.b()) {
            onStepperInteractionChange(updateEntry.getProduct().getCode(), false, true);
            if (fj.l.a(s().Q(), updateEntry.getProduct().getCode()) == null) {
                s().x0().setValue(Boolean.TRUE);
            }
            this.plpStateHolder.M3(new G.AbstractC12559j.UpdateEntryAction(updateEntry.getProduct(), updateEntry.getQuantityToUpdate(), new Rect(0, 0, 0, 0)));
            return;
        }
        onStepperInteractionChange(updateEntry.getProduct().getCode(), true, true);
        s();
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        n(v(A(new j.Dialog(null, null, companion.d(Cj.o.f5056d, new Object[0]), companion.d(Cj.o.f5016F0, new Object[0]), companion.d(Cj.o.f5090u, new Object[0]), null, false, null, 227, null), new Function2() { // from class: com.meijer.mobile.meijer.search.M0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return y1.d3(this.f113835a, (DialogInterface) obj, ((Integer) obj2).intValue());
            }
        }), new Function2() { // from class: com.meijer.mobile.meijer.search.N0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return y1.f3(this.f113842a, (DialogInterface) obj, ((Integer) obj2).intValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d2(TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n("Product Search Results Page");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d3(final y1 y1Var, DialogInterface dialog, int i10) {
        Intrinsics.j(dialog, "dialog");
        dialog.dismiss();
        y1Var.n(y1Var.u(new j.NavigateTo(null, 1, null), new Function1() { // from class: com.meijer.mobile.meijer.search.u1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.e3(this.f114172a, (Context) obj);
            }
        }));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d4(String beacon, String formatLevelBeacon) {
        this.plpStateHolder.M3(new G.AbstractC12559j.SendCriteoLoadBeacon(beacon, formatLevelBeacon, null, null, 12, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e2(DialogInterface dialog, int i10) {
        Intrinsics.j(dialog, "dialog");
        dialog.dismiss();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent e3(y1 y1Var, Context setNavigate) {
        Intrinsics.j(setNavigate, "$this$setNavigate");
        return Bl.k.b(setNavigate, false, null, 536872912, null, null, null, 118, null).putExtra("unauth_search_term", y1Var.s().d().getValue());
    }

    private final void e4(List<String> beacon, String formatLevelBeacon) {
        this.plpStateHolder.M3(new G.AbstractC12559j.SendCriteoViewBeacon(beacon, formatLevelBeacon, null, null, 12, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f2(Wi.a setOnFinish) {
        Intrinsics.j(setOnFinish, "$this$setOnFinish");
        setOnFinish.H();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f3(final y1 y1Var, DialogInterface dialog, int i10) {
        Intrinsics.j(dialog, "dialog");
        dialog.dismiss();
        y1Var.n(y1Var.u(new j.NavigateTo(null, 1, null), new Function1() { // from class: com.meijer.mobile.meijer.search.p1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.g3(this.f114156a, (Context) obj);
            }
        }));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g2(DialogInterface dialog, int i10) {
        Intrinsics.j(dialog, "dialog");
        dialog.dismiss();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent g3(y1 y1Var, Context setNavigate) {
        Intrinsics.j(setNavigate, "$this$setNavigate");
        return Bl.f.f3124a.a(setNavigate, y1Var.featureManager.e(AbstractC18503f.h0.f172881h));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g4(y1 y1Var, TrackingData submitEvent) {
        Intrinsics.j(submitEvent, "$this$submitEvent");
        submitEvent.h("numberOfSearchResults", String.valueOf(y1Var.s().getTotalProductCount().a()));
        return Unit.f143329a;
    }

    private final String getCarouselType(EnumC15218a carouselType) {
        int i10 = a.$EnumSwitchMapping$2[carouselType.ordinal()];
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent h2(y1 y1Var, G.n nVar, Context setNavigate) {
        Intrinsics.j(setNavigate, "$this$setNavigate");
        return Bl.g.t(y1Var.featureEntryPoint, ((G.n.ShowPDPEvent) nVar).getProduct(), true, false, null, 12, null);
    }

    private final void h4() {
        this.analyticsEngine.g(C14756c.h("Product Search Page"), new Function1() { // from class: com.meijer.mobile.meijer.search.Y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.i4(this.f114085a, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i3(y1 y1Var, Coupon coupon, TrackingData trackingData, DialogInterface dialog, int i10) {
        Intrinsics.j(dialog, "dialog");
        dialog.dismiss();
        y1Var.K2(new a.Clip(coupon, trackingData));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i4(y1 y1Var, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.v("search");
        stageEvent.h("productSortBy", y1Var.s().y0().getValue());
        return Unit.f143329a;
    }

    private final AbstractC6392a j2(EnumC12707c limitedResultsScenario, int tokenMatchCount, int embeddingsCount, String searchTerm) {
        int i10 = a.$EnumSwitchMapping$0[limitedResultsScenario.ordinal()];
        if (i10 == 1) {
            return AbstractC6392a.INSTANCE.d(C18372b.f172055f, Integer.valueOf(tokenMatchCount));
        }
        if (i10 == 2) {
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            return companion.d(C18372b.f172054e, companion.b(C18371a.f172043b, tokenMatchCount, searchTerm), companion.b(C18371a.f172044c, embeddingsCount, new Object[0]));
        }
        if (i10 == 3 || i10 == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j3(DialogInterface dialog, int i10) {
        Intrinsics.j(dialog, "dialog");
        dialog.dismiss();
        return Unit.f143329a;
    }

    private final AbstractC6392a k2(EnumC12707c limitedResultsScenario, String searchTerm) {
        int i10 = a.$EnumSwitchMapping$0[limitedResultsScenario.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return AbstractC6392a.INSTANCE.d(C18372b.f172053d, searchTerm);
            }
            if (i10 != 3) {
                if (i10 == 4) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return AbstractC6392a.INSTANCE.d(C18372b.f172056g, searchTerm);
    }

    private final void k3(GoogleAdAnalytics googleAdAnalytics) {
        this.plpStateHolder.M3(new G.AbstractC12559j.GoogleAdClicked(googleAdAnalytics));
    }

    private final AbstractC6392a l2(EnumC12707c limitedResultsScenario, int number) {
        int i10 = a.$EnumSwitchMapping$0[limitedResultsScenario.ordinal()];
        if (i10 == 1) {
            return AbstractC6392a.INSTANCE.b(C18371a.f172045d, number, new Object[0]);
        }
        if (i10 == 2) {
            return AbstractC6392a.INSTANCE.b(C18371a.f172049h, number, new Object[0]);
        }
        if (i10 == 3) {
            return null;
        }
        if (i10 == 4) {
            return AbstractC6392a.INSTANCE.b(C18371a.f172046e, number, new Object[0]);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [bk.a, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r13v4 */
    private final void l4(String query, String searchMethod) {
        ?? r13;
        if (!this.featureManager.e(AbstractC18503f.C.f172844h) || Intrinsics.e(query, s().d().getValue())) {
            r13 = 0;
        } else {
            r13 = 0;
            com.meijer.mobile.meijer.activity.personalized.modals.G.D3(this.plpStateHolder, new l.Search(query, null, null, 0, 0, null, null, 0, null, false, null, null, null, null, null, null, null, null, null, 524286, null), null, 2, null);
        }
        s().d().setValue(query);
        s().O().setValue(new LoadingDecorator(r13, r13, 3, r13));
        com.meijer.mobile.meijer.activity.personalized.modals.G.s4(this.plpStateHolder, query, false, searchMethod, 2, null);
    }

    private final int m2(EnumC12707c limitedResultsScenario, int totalResults, int tokenMatchCount, int embeddingsCount) {
        int i10 = a.$EnumSwitchMapping$0[limitedResultsScenario.ordinal()];
        if (i10 == 1) {
            return embeddingsCount;
        }
        if (i10 == 2) {
            return tokenMatchCount + embeddingsCount;
        }
        if (i10 == 3) {
            return 0;
        }
        if (i10 == 4) {
            return totalResults;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void m3() {
        n(new j.FinishActivity(null, 1, null));
    }

    private final void m4(Pp.b searchType) {
        Pp.b bVar = Pp.b.f26241d;
        boolean z10 = false;
        if (searchType == bVar) {
            InterfaceC5872l0<AbstractC6392a> interfaceC5872l0F = s().f();
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            interfaceC5872l0F.setValue(companion.d(C17284b.f163328j0, new Object[0]));
            s().p().setValue(companion.d(C17284b.f163291O0, new Object[0]));
        }
        if (searchType == Pp.b.f26239b) {
            this.analyticsEngine.g(C14756c.h("Product Search Page"), new Function1() { // from class: com.meijer.mobile.meijer.search.R0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return y1.n4((TrackingData) obj);
                }
            });
            S1 s1S = s();
            s1S.F().setValue(Boolean.valueOf(this.userManager.b()));
            InterfaceC5872l0<Boolean> interfaceC5872l0S = s1S.s();
            Boolean bool = Boolean.FALSE;
            interfaceC5872l0S.setValue(bool);
            s1S.k().setValue(bool);
            s1S.B().setValue(bool);
        } else if (searchType == Pp.b.f26240c || searchType == bVar) {
            S1 s1S2 = s();
            InterfaceC5872l0<Boolean> interfaceC5872l0F2 = s1S2.F();
            Boolean bool2 = Boolean.FALSE;
            interfaceC5872l0F2.setValue(bool2);
            s1S2.s().setValue(Boolean.TRUE);
            s1S2.k().setValue(bool2);
            s1S2.B().setValue(bool2);
        }
        InterfaceC5872l0<Boolean> interfaceC5872l0N = s().N();
        Pp.b bVar2 = Pp.b.f26240c;
        interfaceC5872l0N.setValue(Boolean.valueOf(searchType == bVar2 || searchType == bVar));
        s().B().setValue(Boolean.valueOf(this.userManager.b() && this.featureManager.e(AbstractC18503f.A.f172842h) && searchType == Pp.b.f26238a));
        s().y().setValue(searchType);
        s().A().setValue(Boolean.valueOf((!this.userManager.b() || s().y().getValue() == bVar2 || s().y().getValue() == bVar) ? false : true));
        InterfaceC5872l0<Boolean> interfaceC5872l0F3 = s().F();
        if (this.userManager.b() && s().y().getValue() != bVar2 && s().y().getValue() != bVar) {
            z10 = true;
        }
        interfaceC5872l0F3.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n4(TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("searchLocation", "coupons");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o2(kotlin.coroutines.Continuation<? super kotlin.Result<Vl.DepartmentCard>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.meijer.mobile.meijer.search.y1.b
            if (r0 == 0) goto L13
            r0 = r8
            com.meijer.mobile.meijer.search.y1$b r0 = (com.meijer.mobile.meijer.search.y1.b) r0
            int r1 = r0.f114216k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114216k = r1
            goto L18
        L13:
            com.meijer.mobile.meijer.search.y1$b r0 = new com.meijer.mobile.meijer.search.y1$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f114214i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f114216k
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r1 = r0.f114209d
            com.meijer.mobile.meijer.search.y1 r1 = (com.meijer.mobile.meijer.search.y1) r1
            java.lang.Object r1 = r0.f114208c
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f114207b
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r1 = r0.f114206a
            com.meijer.mobile.meijer.search.y1 r1 = (com.meijer.mobile.meijer.search.y1) r1
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Exception -> L39
            goto L7c
        L39:
            r8 = move-exception
            goto L81
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L43:
            kotlin.ResultKt.b(r8)
            kotlin.Result$Companion r8 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L39
            com.meijer.mobile.meijer.search.S1 r8 = r7.s()     // Catch: java.lang.Exception -> L39
            androidx.compose.runtime.l0 r8 = r8.w()     // Catch: java.lang.Exception -> L39
            Pj.a$b r2 = new Pj.a$b     // Catch: java.lang.Exception -> L39
            java.lang.String r4 = "shopByDepartmentsV2"
            r5 = 2
            r6 = 0
            r2.<init>(r4, r6, r5, r6)     // Catch: java.lang.Exception -> L39
            r8.setValue(r2)     // Catch: java.lang.Exception -> L39
            jm.a r8 = g1(r7)     // Catch: java.lang.Exception -> L39
            Vl.e$c$b r2 = Vl.e.c.b.f39992b     // Catch: java.lang.Exception -> L39
            r0.f114206a = r7     // Catch: java.lang.Exception -> L39
            r0.f114207b = r0     // Catch: java.lang.Exception -> L39
            r0.f114208c = r0     // Catch: java.lang.Exception -> L39
            r0.f114209d = r7     // Catch: java.lang.Exception -> L39
            r4 = 0
            r0.f114210e = r4     // Catch: java.lang.Exception -> L39
            r0.f114211f = r4     // Catch: java.lang.Exception -> L39
            r0.f114212g = r4     // Catch: java.lang.Exception -> L39
            r0.f114213h = r4     // Catch: java.lang.Exception -> L39
            r0.f114216k = r3     // Catch: java.lang.Exception -> L39
            java.lang.Object r8 = r8.b(r2, r0)     // Catch: java.lang.Exception -> L39
            if (r8 != r1) goto L7c
            return r1
        L7c:
            java.lang.Object r8 = kotlin.Result.b(r8)     // Catch: java.lang.Exception -> L39
            return r8
        L81:
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            mv.E0.i(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r8 = kotlin.ResultKt.a(r8)
            java.lang.Object r8 = kotlin.Result.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.search.y1.o2(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onProductCouponButtonClicked(final Pk.c couponIdentity, final EnumC15218a carouselType) {
        io.reactivex.l<Coupon> lVarObserveOn = this.couponsRepository.k(couponIdentity).take(1L).subscribeOn(C13889a.b()).observeOn(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.search.v1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.o3(this.f114176a, couponIdentity, carouselType, (Coupon) obj);
            }
        };
        Lu.g<? super Coupon> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.search.w1
            @Override // Lu.g
            public final void accept(Object obj) {
                y1.p3(function1, obj);
            }
        };
        final r rVar = new r(qw.a.INSTANCE);
        Dk.a.a(lVarObserveOn.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.search.x1
            @Override // Lu.g
            public final void accept(Object obj) {
                y1.q3(rVar, obj);
            }
        }), getDisposables());
    }

    private final void onProductsState(Object key, List<ProductState<ProductFullDetails>> productStates) {
        if (!s().x0().getValue().booleanValue()) {
            if (Intrinsics.e(key, e.f.a.f40004d)) {
                InterfaceC5872l0<HomeDecorator> interfaceC5872l0X = s().x();
                HomeDecorator value = s().x().getValue();
                List listM1 = CollectionsKt.m1(s().x().getValue().getPersonalizedProducts());
                List<ProductState<ProductFullDetails>> list = productStates;
                ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(toProductListDecorator((ProductState) it.next()));
                }
                listM1.set(0, arrayList);
                Unit unit = Unit.f143329a;
                interfaceC5872l0X.setValue(HomeDecorator.copy$default(value, null, null, null, null, null, null, null, null, null, null, listM1, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536869887, null));
            } else if (Intrinsics.e(key, e.f.c.f40008d)) {
                InterfaceC5872l0<HomeDecorator> interfaceC5872l0X2 = s().x();
                HomeDecorator value2 = s().x().getValue();
                List listM12 = CollectionsKt.m1(s().x().getValue().getPersonalizedProducts());
                List<ProductState<ProductFullDetails>> list2 = productStates;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(toProductListDecorator((ProductState) it2.next()));
                }
                listM12.set(1, arrayList2);
                Unit unit2 = Unit.f143329a;
                interfaceC5872l0X2.setValue(HomeDecorator.copy$default(value2, null, null, null, null, null, null, null, null, null, null, listM12, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536869887, null));
            } else if (Intrinsics.e(key, e.f.b.a.f40005d)) {
                InterfaceC5872l0<HomeDecorator> interfaceC5872l0X3 = s().x();
                HomeDecorator value3 = s().x().getValue();
                List listM13 = CollectionsKt.m1(s().x().getValue().getCuratedProducts());
                List<ProductState<ProductFullDetails>> list3 = productStates;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.x(list3, 10));
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(toProductListDecorator((ProductState) it3.next()));
                }
                listM13.set(0, arrayList3);
                Unit unit3 = Unit.f143329a;
                interfaceC5872l0X3.setValue(HomeDecorator.copy$default(value3, null, null, null, null, null, null, null, null, null, listM13, null, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536870399, null));
            } else if (Intrinsics.e(key, e.f.b.C0858b.f40006d)) {
                InterfaceC5872l0<HomeDecorator> interfaceC5872l0X4 = s().x();
                HomeDecorator value4 = s().x().getValue();
                List listM14 = CollectionsKt.m1(s().x().getValue().getCuratedProducts());
                List<ProductState<ProductFullDetails>> list4 = productStates;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.x(list4, 10));
                Iterator<T> it4 = list4.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(toProductListDecorator((ProductState) it4.next()));
                }
                listM14.set(1, arrayList4);
                Unit unit4 = Unit.f143329a;
                interfaceC5872l0X4.setValue(HomeDecorator.copy$default(value4, null, null, null, null, null, null, null, null, null, listM14, null, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536870399, null));
            } else if (Intrinsics.e(key, e.f.b.c.f40007d)) {
                InterfaceC5872l0<HomeDecorator> interfaceC5872l0X5 = s().x();
                HomeDecorator value5 = s().x().getValue();
                List listM15 = CollectionsKt.m1(s().x().getValue().getCuratedProducts());
                List<ProductState<ProductFullDetails>> list5 = productStates;
                ArrayList arrayList5 = new ArrayList(CollectionsKt.x(list5, 10));
                Iterator<T> it5 = list5.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(toProductListDecorator((ProductState) it5.next()));
                }
                listM15.set(2, arrayList5);
                Unit unit5 = Unit.f143329a;
                interfaceC5872l0X5.setValue(HomeDecorator.copy$default(value5, null, null, null, null, null, null, null, null, null, listM15, null, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536870399, null));
            }
        }
        S1 s1S = s();
        s1S.x0().setValue(Boolean.FALSE);
        SnapshotStateMap<String, CouponState> snapshotStateMapS = s1S.S();
        List<ProductState<ProductFullDetails>> list6 = productStates;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(list6, 10)), 16));
        Iterator<T> it6 = list6.iterator();
        while (it6.hasNext()) {
            ProductState productState = (ProductState) it6.next();
            Pair pairA = TuplesKt.a(((ProductFullDetails) productState.g()).getCode(), CollectionsKt.u0(productState.d()));
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        snapshotStateMapS.putAll(linkedHashMap);
    }

    private final void onStepperInteractionChange(String activeStepperId, boolean resetStepper, boolean inTransition) {
        S1 s1S = s();
        InterfaceC5872l0<HomeDecorator> interfaceC5872l0X = s1S.x();
        HomeDecorator value = s1S.x().getValue();
        List<List<ProductListDecorator>> personalizedProducts = s().x().getValue().getPersonalizedProducts();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(personalizedProducts, 10));
        Iterator<T> it = personalizedProducts.iterator();
        while (it.hasNext()) {
            arrayList.add(updateStepperState((List) it.next(), activeStepperId, resetStepper, inTransition));
        }
        List<List<ProductListDecorator>> curatedProducts = s().x().getValue().getCuratedProducts();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(curatedProducts, 10));
        Iterator<T> it2 = curatedProducts.iterator();
        while (it2.hasNext()) {
            arrayList2.add(updateStepperState((List) it2.next(), activeStepperId, resetStepper, inTransition));
        }
        interfaceC5872l0X.setValue(HomeDecorator.copy$default(value, null, null, null, null, null, null, null, null, null, arrayList2, arrayList, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536869375, null));
        s1S.R0().setValue(Boolean.valueOf(inTransition));
        s1S.z0().setValue(activeStepperId);
        s1S.k0().setValue(Boolean.valueOf(resetStepper));
    }

    private final boolean p4(EnumC12707c limitedResultsScenario) {
        return limitedResultsScenario == EnumC12707c.f114097b || limitedResultsScenario == EnumC12707c.f114098c;
    }

    private final void pushUserAuthenticationState() {
        s().x().setValue(HomeDecorator.copy$default(s().x().getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, false, null, null, false, null, false, null, 0, this.userManager.b(), new t(this), null, null, null, false, 511705087, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q2(Vl.e.f r8, kotlin.coroutines.Continuation<? super kotlin.Result<? extends Vl.j>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.meijer.mobile.meijer.search.y1.d
            if (r0 == 0) goto L13
            r0 = r9
            com.meijer.mobile.meijer.search.y1$d r0 = (com.meijer.mobile.meijer.search.y1.d) r0
            int r1 = r0.f114240l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114240l = r1
            goto L18
        L13:
            com.meijer.mobile.meijer.search.y1$d r0 = new com.meijer.mobile.meijer.search.y1$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f114238j
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f114240l
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r8 = r0.f114233e
            com.meijer.mobile.meijer.search.y1 r8 = (com.meijer.mobile.meijer.search.y1) r8
            java.lang.Object r8 = r0.f114232d
            kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
            java.lang.Object r8 = r0.f114231c
            kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
            java.lang.Object r8 = r0.f114230b
            com.meijer.mobile.meijer.search.y1 r8 = (com.meijer.mobile.meijer.search.y1) r8
            java.lang.Object r8 = r0.f114229a
            Vl.e$f r8 = (Vl.e.f) r8
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Exception -> L3d
            goto L88
        L3d:
            r8 = move-exception
            goto L8d
        L3f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L47:
            kotlin.ResultKt.b(r9)
            kotlin.Result$Companion r9 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3d
            com.meijer.mobile.meijer.search.S1 r9 = r7.s()     // Catch: java.lang.Exception -> L3d
            androidx.compose.runtime.l0 r9 = r9.g0()     // Catch: java.lang.Exception -> L3d
            java.lang.Object r9 = r9.getValue()     // Catch: java.lang.Exception -> L3d
            Pj.c r9 = (Pj.c) r9     // Catch: java.lang.Exception -> L3d
            Pj.a$b r2 = new Pj.a$b     // Catch: java.lang.Exception -> L3d
            java.lang.String r4 = r8.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()     // Catch: java.lang.Exception -> L3d
            r5 = 2
            r6 = 0
            r2.<init>(r4, r6, r5, r6)     // Catch: java.lang.Exception -> L3d
            r9.b(r2)     // Catch: java.lang.Exception -> L3d
            jm.a r9 = g1(r7)     // Catch: java.lang.Exception -> L3d
            r0.f114229a = r8     // Catch: java.lang.Exception -> L3d
            r0.f114230b = r7     // Catch: java.lang.Exception -> L3d
            r0.f114231c = r0     // Catch: java.lang.Exception -> L3d
            r0.f114232d = r0     // Catch: java.lang.Exception -> L3d
            r0.f114233e = r7     // Catch: java.lang.Exception -> L3d
            r2 = 0
            r0.f114234f = r2     // Catch: java.lang.Exception -> L3d
            r0.f114235g = r2     // Catch: java.lang.Exception -> L3d
            r0.f114236h = r2     // Catch: java.lang.Exception -> L3d
            r0.f114237i = r2     // Catch: java.lang.Exception -> L3d
            r0.f114240l = r3     // Catch: java.lang.Exception -> L3d
            java.lang.Object r9 = r9.h(r8, r0)     // Catch: java.lang.Exception -> L3d
            if (r9 != r1) goto L88
            return r1
        L88:
            java.lang.Object r8 = kotlin.Result.b(r9)     // Catch: java.lang.Exception -> L3d
            return r8
        L8d:
            kotlin.coroutines.CoroutineContext r9 = r0.getContext()
            mv.E0.i(r9)
            kotlin.Result$Companion r9 = kotlin.Result.INSTANCE
            java.lang.Object r8 = kotlin.ResultKt.a(r8)
            java.lang.Object r8 = kotlin.Result.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.search.y1.q2(Vl.e$f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final boolean q4(EnumC12707c limitedResultsScenario) {
        return limitedResultsScenario != EnumC12707c.f114096a;
    }

    private final boolean r4(EnumC12707c limitedResultsScenario) {
        return limitedResultsScenario != EnumC12707c.f114099d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s3(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("mperks: search");
        track.v("search");
        return Unit.f143329a;
    }

    private final void s4() {
        this.productAnalytics.f(s().d().getValue());
    }

    private final void t2(final ProductFullDetails product) {
        if (B4(Cj.o.f5058e)) {
            n(u(new j.NavigateTo(null, 1, null), new Function1() { // from class: com.meijer.mobile.meijer.search.c1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return y1.u2(product, (Context) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t3(int i10, y1 y1Var, ProductCardDecorator productCardDecorator, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("productRank", String.valueOf(i10));
        stageEvent.h("PDPfromsearch", "1");
        Ao.e0.a(y1Var.sponsorshipsDataStore.a(productCardDecorator.getProduct().getCode()), stageEvent);
        return Unit.f143329a;
    }

    private final void t4(R1 searchVSUpdate) {
        if (searchVSUpdate instanceof R1.InitializeViewModel) {
            N3((R1.InitializeViewModel) searchVSUpdate);
            return;
        }
        if (searchVSUpdate instanceof R1.t) {
            m3();
            return;
        }
        if (searchVSUpdate instanceof R1.s) {
            l3();
            return;
        }
        if (searchVSUpdate instanceof R1.F) {
            s4();
            return;
        }
        if (searchVSUpdate instanceof R1.C12694e) {
            G1();
            return;
        }
        if (searchVSUpdate instanceof R1.K) {
            L3();
            return;
        }
        if (searchVSUpdate instanceof R1.J) {
            J3();
            return;
        }
        if (searchVSUpdate instanceof R1.HandleSubstitutionResult) {
            B2(((R1.HandleSubstitutionResult) searchVSUpdate).getResultCode());
            return;
        }
        if (searchVSUpdate instanceof R1.r) {
            H2();
            return;
        }
        if (searchVSUpdate instanceof R1.C12696g) {
            R1();
            return;
        }
        if (searchVSUpdate instanceof R1.A) {
            b4();
            return;
        }
        if (searchVSUpdate instanceof R1.GoogleAdClicked) {
            k3(((R1.GoogleAdClicked) searchVSUpdate).getGoogleAdAnalytics());
            return;
        }
        if (searchVSUpdate instanceof R1.CompleteSearchAction) {
            S1((R1.CompleteSearchAction) searchVSUpdate);
            return;
        }
        if (searchVSUpdate instanceof R1.TypingSearchTerm) {
            B3(((R1.TypingSearchTerm) searchVSUpdate).getNewTerm());
            return;
        }
        if (searchVSUpdate instanceof R1.SetDeeplinkFacet) {
            j4(((R1.SetDeeplinkFacet) searchVSUpdate).getQuery());
            return;
        }
        if (searchVSUpdate instanceof R1.AutocompleteSelected) {
            I2(((R1.AutocompleteSelected) searchVSUpdate).getNewTerm());
            return;
        }
        if (searchVSUpdate instanceof R1.BarcodeIconTapped) {
            z1((R1.BarcodeIconTapped) searchVSUpdate);
            return;
        }
        if (searchVSUpdate instanceof R1.C12693d) {
            E1();
            return;
        }
        if (searchVSUpdate instanceof R1.I) {
            G4();
            return;
        }
        if (searchVSUpdate instanceof R1.ProcessProductCardAction) {
            U3((R1.ProcessProductCardAction) searchVSUpdate);
            return;
        }
        if (searchVSUpdate instanceof R1.n) {
            v2();
            return;
        }
        if (searchVSUpdate instanceof R1.ProcessCouponAction) {
            S3((R1.ProcessCouponAction) searchVSUpdate);
            return;
        }
        if (searchVSUpdate instanceof R1.ProductFromBuyAgainCarouselTapped) {
            V3((R1.ProductFromBuyAgainCarouselTapped) searchVSUpdate);
            return;
        }
        if (searchVSUpdate instanceof R1.SearchSuggestionTapped) {
            F3(((R1.SearchSuggestionTapped) searchVSUpdate).getSuggestion());
            return;
        }
        if (searchVSUpdate instanceof R1.RecentSearchItemTapped) {
            u3(((R1.RecentSearchItemTapped) searchVSUpdate).getSearchTerm());
            return;
        }
        if (searchVSUpdate instanceof R1.B) {
            z3();
            return;
        }
        if (searchVSUpdate instanceof R1.StepperStateChanged) {
            E3((R1.StepperStateChanged) searchVSUpdate);
            return;
        }
        if (searchVSUpdate instanceof R1.m) {
            E2();
            return;
        }
        if (searchVSUpdate instanceof R1.ProcessOnResumeSearchExtra) {
            c4((R1.ProcessOnResumeSearchExtra) searchVSUpdate);
            return;
        }
        if (searchVSUpdate instanceof R1.C12700k) {
            p2();
            return;
        }
        if (searchVSUpdate instanceof R1.l) {
            r2();
            return;
        }
        if (searchVSUpdate instanceof R1.DepartmentItemClicked) {
            Z2((R1.DepartmentItemClicked) searchVSUpdate);
            return;
        }
        if (searchVSUpdate instanceof R1.UpdateEntry) {
            c3((R1.UpdateEntry) searchVSUpdate);
            return;
        }
        if (searchVSUpdate instanceof R1.PersonalizedProductListClicked) {
            P3((R1.PersonalizedProductListClicked) searchVSUpdate);
            return;
        }
        if (searchVSUpdate instanceof R1.C12698i) {
            i2();
        } else if (searchVSUpdate instanceof R1.C12692c) {
            C1();
        } else {
            if (!(searchVSUpdate instanceof R1.C12695f)) {
                throw new NoWhenBranchMatchedException();
            }
            O1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent u2(ProductFullDetails productFullDetails, Context setNavigate) {
        Intrinsics.j(setNavigate, "$this$setNavigate");
        return Bl.t.e(Bl.t.f3152a, setNavigate, null, Pp.c.f26247c, productFullDetails, "product search page", 2, null);
    }

    private final void u4(AbstractC17454a cartUpdateRequest) {
        this.plpStateHolder.M3(new G.AbstractC12559j.UserAcceptAddToCartAction(cartUpdateRequest));
    }

    private final List<ProductListDecorator> updateStepperState(List<ProductListDecorator> productListDecorators, String activeStepperId, boolean resetStepper, boolean inTransition) {
        List<ProductListDecorator> list = productListDecorators;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        for (ProductListDecorator productListDecorator : list) {
            boolean z10 = false;
            boolean z11 = Intrinsics.e(productListDecorator.getUpc(), activeStepperId) ? inTransition : false;
            if (Intrinsics.e(productListDecorator.getUpc(), activeStepperId) && resetStepper) {
                z10 = true;
            }
            arrayList.add(productListDecorator.u(((-201326593) & 1) != 0 ? productListDecorator.id : null, ((-201326593) & 2) != 0 ? productListDecorator.isSelected : false, ((-201326593) & 4) != 0 ? productListDecorator.upc : null, ((-201326593) & 8) != 0 ? productListDecorator.title : null, ((-201326593) & 16) != 0 ? productListDecorator.hasUnsavedShoppingListItem : false, ((-201326593) & 32) != 0 ? productListDecorator.listItemId : null, ((-201326593) & 64) != 0 ? productListDecorator.thumbnail : null, ((-201326593) & 128) != 0 ? productListDecorator.thumbnailUrl : null, ((-201326593) & 256) != 0 ? productListDecorator.thumbnailDescription : null, ((-201326593) & 512) != 0 ? productListDecorator.department : null, ((-201326593) & 1024) != 0 ? productListDecorator.isOnSale : false, ((-201326593) & RecyclerView.m.FLAG_MOVED) != 0 ? productListDecorator.showWeightInfo : false, ((-201326593) & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? productListDecorator.hasMPerksOffers : false, ((-201326593) & 8192) != 0 ? productListDecorator.currentPrice : null, ((-201326593) & 16384) != 0 ? productListDecorator.regularPrice : null, ((-201326593) & 32768) != 0 ? productListDecorator.weightUnitSizeAndPrice : null, ((-201326593) & 65536) != 0 ? productListDecorator.amountSaved : null, ((-201326593) & 131072) != 0 ? productListDecorator.quantityText : null, ((-201326593) & 262144) != 0 ? productListDecorator.priceGoodThroughDate : null, ((-201326593) & 524288) != 0 ? productListDecorator.isAddedToShoppingList : false, ((-201326593) & 1048576) != 0 ? productListDecorator.errorImageResource : 0, ((-201326593) & 2097152) != 0 ? productListDecorator.shoppingListItem : null, ((-201326593) & 4194304) != 0 ? productListDecorator.product : null, ((-201326593) & 8388608) != 0 ? productListDecorator.cartEntry : null, ((-201326593) & 16777216) != 0 ? productListDecorator.storeAvailability : null, ((-201326593) & 33554432) != 0 ? productListDecorator.cartEligibility : null, ((-201326593) & 67108864) != 0 ? productListDecorator.inQtyStepperInteraction : z11, ((-201326593) & 134217728) != 0 ? productListDecorator.resetStepperState : z10, ((-201326593) & 268435456) != 0 ? productListDecorator.productQuery : null, ((-201326593) & 536870912) != 0 ? productListDecorator.couponCountDownStateDecorator : null, ((-201326593) & 1073741824) != 0 ? productListDecorator.coupon : null, ((-201326593) & Integer.MIN_VALUE) != 0 ? productListDecorator.complexPromo : null, (511 & 1) != 0 ? productListDecorator.isBuyAgain : false, (511 & 2) != 0 ? productListDecorator.isBopas : false, (511 & 4) != 0 ? productListDecorator.sponsorship : null, (511 & 8) != 0 ? productListDecorator.productRatings : null, (511 & 16) != 0 ? productListDecorator.showQuantityRequested : false, (511 & 32) != 0 ? productListDecorator.quantityRequested : 0, (511 & 64) != 0 ? productListDecorator.currentPriceDescription : null, (511 & 128) != 0 ? productListDecorator.productContainsTag : false, (511 & 256) != 0 ? productListDecorator.regularPriceDescription : null));
        }
        return arrayList;
    }

    private final void v2() {
        n(u(new j.NavigateTo(null, 1, null), new Function1() { // from class: com.meijer.mobile.meijer.search.S0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.w2(this.f113916a, (Context) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v3(String str, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("searchTerm", str);
        stageEvent.h("searchMethod", "Recent Search");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent w2(y1 y1Var, Context setNavigate) {
        Intrinsics.j(setNavigate, "$this$setNavigate");
        return y1Var.s().J0().getValue().booleanValue() ? y1Var.featureEntryPoint.d() : OrderOptionsActivity.INSTANCE.b(setNavigate, "search: search page");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x2(Coupon coupon, y1 y1Var, EnumC15218a enumC15218a, CouponState couponState, TrackingData TrackingData) {
        CouponState.b progress;
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n("home");
        TrackingData.v("home");
        Rk.b bVar = Rk.b.f33418a;
        TrackingData.c(bVar.f(CollectionsKt.e(coupon)));
        TrackingData.c(bVar.h(y1Var.getCarouselType(enumC15218a)));
        boolean z10 = false;
        if (couponState != null && (progress = couponState.getProgress()) != null && progress.d()) {
            z10 = true;
        }
        TrackingData.c(bVar.c(z10));
        return Unit.f143329a;
    }

    private final void x3(Coupon coupon, TrackingData trackingData) {
        this.plpStateHolder.K3(new a.Clip(coupon, trackingData));
    }

    private final void z1(final R1.BarcodeIconTapped vsu) {
        n(w(B(new j.ActivityResultEffect(null, "scannerResultLauncher", 1, null), new Function1() { // from class: com.meijer.mobile.meijer.search.J0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.A1(this.f113820a, (Context) obj);
            }
        }), new Function1() { // from class: com.meijer.mobile.meijer.search.K0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.B1(this.f113823a, vsu, (C14274a) obj);
            }
        }));
    }

    private final void z2(C14274a result, boolean hasScannedProductExtra) {
        if (result.getResultCode() != -1) {
            if (result.getResultCode() == 0 && hasScannedProductExtra) {
                n(new j.FinishActivity(null, 1, null));
                return;
            }
            return;
        }
        Intent data = result.getData();
        String stringExtra = data != null ? data.getStringExtra("barcode") : null;
        if (stringExtra == null) {
            stringExtra = "";
        }
        final String str = stringExtra;
        if (StringsKt.s0(str)) {
            n(new j.Dialog(null, null, AbstractC6392a.INSTANCE.d(Aq.b.f1967O, new Object[0]), null, null, null, false, null, 251, null));
            return;
        }
        s().C0().setValue("Barcode Search");
        n(new j.DismissKeyboard(null, 1, null));
        s().a().invoke(new R1.CompleteSearchAction(str, null, true, false, 10, null));
        this.analyticsEngine.g(C14756c.h("Product Search Page"), new Function1() { // from class: com.meijer.mobile.meijer.search.t1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.A2(str, (TrackingData) obj);
            }
        });
    }

    @Override // androidx.view.InterfaceC6157f
    public void onCreate(InterfaceC6172s owner) {
        Intrinsics.j(owner, "owner");
        super.onCreate(owner);
        pushUserAuthenticationState();
        if (this.userManager.b()) {
            io.reactivex.l<Integer> lVarSubscribeOn = this.cartRepository.Q().distinctUntilChanged().subscribeOn(C13889a.b());
            final k kVar = new k(this);
            Lu.g<? super Integer> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.search.j0
                @Override // Lu.g
                public final void accept(Object obj) {
                    y1.P2(kVar, obj);
                }
            };
            a.Companion companion = qw.a.INSTANCE;
            final l lVar = new l(companion);
            Dk.a.a(lVarSubscribeOn.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.search.u0
                @Override // Lu.g
                public final void accept(Object obj) {
                    y1.R2(lVar, obj);
                }
            }), getDisposables());
            io.reactivex.l<uk.c<ShoppingCart>> lVarSubscribeOn2 = this.cartRepository.b().distinctUntilChanged().subscribeOn(C13889a.b());
            final m mVar = new m(this);
            Lu.g<? super uk.c<ShoppingCart>> gVar2 = new Lu.g() { // from class: com.meijer.mobile.meijer.search.F0
                @Override // Lu.g
                public final void accept(Object obj) {
                    y1.S2(mVar, obj);
                }
            };
            final n nVar = new n(companion);
            Dk.a.a(lVarSubscribeOn2.subscribe(gVar2, new Lu.g() { // from class: com.meijer.mobile.meijer.search.Q0
                @Override // Lu.g
                public final void accept(Object obj) {
                    y1.T2(nVar, obj);
                }
            }), getDisposables());
            this.multiChannelProductsStateRepository.b(new C17115a.InterfaceC2527a() { // from class: com.meijer.mobile.meijer.search.b1
                @Override // sp.C17115a.InterfaceC2527a
                public final void a(Object obj, sp.Y y10) {
                    y1.U2(this.f114095a, obj, y10);
                }
            });
        }
        C16563h.J(C16563h.g(C16563h.O(new h(this.productsRepository.t()), new p(this)), new q(null)), androidx.view.d0.a(this));
        s().m().setValue(new CartPreviewDecorator(this.userManager.b(), 0, 2, null));
        this.analyticsEngine.g(C14756c.h("Product Search Page"), new Function1() { // from class: com.meijer.mobile.meijer.search.m1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.Q2((TrackingData) obj);
            }
        });
        s2();
        C15809k.d(C6173t.a(owner), null, null, new i(null), 3, null);
        C15809k.d(C6173t.a(owner), null, null, new j(null), 3, null);
    }

    @Override // androidx.view.InterfaceC6157f
    public void onResume(InterfaceC6172s owner) {
        Intrinsics.j(owner, "owner");
        super.onResume(owner);
        FS.page("Product Search Results Page").start();
        if (StringsKt.s0(s().d().getValue())) {
            n(new j.DismissKeyboard(null, 1, null));
        } else {
            n(new j.OpenKeyboard(null, 1, null));
        }
        h4();
        this.plpStateHolder.M3(G.AbstractC12559j.h.f111618a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.meijer.mobile.architecture.i
    /* renamed from: y2, reason: from getter and merged with bridge method [inline-methods] */
    public S1 s() {
        return this.viewState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A4(EnumC12707c scenario, int totalResults, int tokenMatchCount, int embeddingsCount) {
        int iM2 = m2(scenario, totalResults, tokenMatchCount, embeddingsCount);
        AbstractC6392a abstractC6392aK2 = k2(scenario, s().d().getValue());
        if (abstractC6392aK2 != null) {
            s().G().setValue(abstractC6392aK2);
        }
        AbstractC6392a abstractC6392aJ2 = j2(scenario, tokenMatchCount, embeddingsCount, s().d().getValue());
        if (abstractC6392aJ2 != null) {
            s().C().setValue(abstractC6392aJ2);
        }
        AbstractC6392a abstractC6392aL2 = l2(scenario, iM2);
        if (abstractC6392aL2 != null) {
            s().h().setValue(abstractC6392aL2);
        }
        if (scenario == EnumC12707c.f114099d) {
            C15809k.d(androidx.view.d0.a(this), this.ioDispatcher, null, new y(scenario, null), 2, null);
        } else {
            y4(scenario);
            s().O().setValue(null);
        }
    }

    private final void B3(String term) {
        boolean z10;
        S1 s1S = s();
        boolean z11 = true;
        if (!StringsKt.s0(term)) {
            s1S.d().setValue(term);
            InterfaceC5872l0<Boolean> interfaceC5872l0K = s1S.k();
            Pp.b value = s1S.y().getValue();
            Pp.b bVar = Pp.b.f26238a;
            if (value == bVar) {
                z10 = true;
            } else {
                z10 = false;
            }
            interfaceC5872l0K.setValue(Boolean.valueOf(z10));
            InterfaceC5872l0<Boolean> interfaceC5872l0B = s1S.B();
            if (!this.featureManager.e(AbstractC18503f.A.f172842h) || !this.userManager.b() || s1S.y().getValue() != bVar) {
                z11 = false;
            }
            interfaceC5872l0B.setValue(Boolean.valueOf(z11));
        } else {
            s1S.d().setValue(term);
            s1S.g().setValue(new SearchSuggestions(null, 1, null));
            s1S.H().setValue(InterfaceC12713e.b.f114111a);
            y1();
        }
        this.productsRepository.v(term);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C3(boolean itemSelected) {
        s().n().setValue(Boolean.valueOf(itemSelected));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D3(uk.c<ShoppingCart> shoppingCartResource) {
        C15809k.d(androidx.view.d0.a(this), null, null, new s(shoppingCartResource, this, null), 3, null);
    }

    private final void E2() {
        final l.k kVar = (l.k) CollectionsKt.u0(s().p0().d());
        if (kVar != null) {
            n(w(B(new j.ActivityResultEffect(null, "launchFilterAndSort", 1, null), new Function1() { // from class: com.meijer.mobile.meijer.search.g1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return y1.F2(this.f114126a, kVar, (Context) obj);
                }
            }), new Function1() { // from class: com.meijer.mobile.meijer.search.h1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return y1.G2(this.f114129a, (C14274a) obj);
                }
            }));
        }
    }

    private final void F3(final Suggestion suggestion) {
        s().C0().setValue("Search Suggestions");
        S1(new R1.CompleteSearchAction(s().d().getValue(), suggestion.b(), false, true, 4, null));
        this.analyticsEngine.g(C14756c.h("Product Search Page"), new Function1() { // from class: com.meijer.mobile.meijer.search.i1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.G3(suggestion, (TrackingData) obj);
            }
        });
        o4();
    }

    private final void G1() {
        s().v().clear();
        this.userManager.M(CollectionsKt.m(), true);
    }

    private final void H3(SearchSuggestions suggestions) {
        SearchSuggestions searchSuggestions;
        S1 s1S = s();
        InterfaceC5872l0<SearchSuggestions> interfaceC5872l0G = s1S.g();
        if (!StringsKt.s0(s1S.d().getValue())) {
            searchSuggestions = suggestions;
        } else {
            searchSuggestions = null;
        }
        if (searchSuggestions == null) {
            searchSuggestions = new SearchSuggestions(null, 1, null);
        }
        interfaceC5872l0G.setValue(searchSuggestions);
        if (!suggestions.a().isEmpty()) {
            s1S.H().setValue(InterfaceC12713e.d.f114113a);
            n(new j.AnnounceForAccessibility(null, AbstractC6392a.INSTANCE.d(C18372b.f172065p, new Object[0]), 1, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I1(y1 y1Var, Coupon coupon, TrackingData trackingData, ClipUnclipCouponResponse clipUnclipCouponResponse) {
        Intrinsics.g(clipUnclipCouponResponse);
        y1Var.h3(clipUnclipCouponResponse, coupon, trackingData);
        return Unit.f143329a;
    }

    private final void I2(String newTerm) {
        S1 s1S = s();
        this.productAnalytics.b(newTerm, s1S.d().getValue());
        s1S.d().setValue(StringsKt.C1(newTerm).toString() + ' ');
        y1();
    }

    private final void I3(ProductFullDetails productToAdd, double quantity) {
        s().v0().setValue(Boolean.FALSE);
        if (B4(Cj.o.f5056d)) {
            this.plpStateHolder.M3(new G.AbstractC12559j.UpdateEntryAction(productToAdd, quantity, new Rect(0, 0, 0, 0)));
            ProductSponsorship productSponsorshipA = this.sponsorshipsDataStore.a(productToAdd.getCode());
            if (productSponsorshipA != null && productSponsorshipA.getSponsorSource() == Ho.b.f13875c) {
                e4(productToAdd.getBeaconInfo().e(), productToAdd.getBeaconInfo().getFormatLevelOnClickBeacon());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J2(int itemCount) {
        s().m().setValue(CartPreviewDecorator.b(s().m().getValue(), false, itemCount, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L2(y1 y1Var, Qk.a aVar, Coupon coupon) {
        Intrinsics.g(coupon);
        y1Var.X3(coupon, ((a.Clip) aVar).getTrackingData());
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void N3(R1.InitializeViewModel initializeViewModel) {
        boolean z10;
        CartProductListDecorator itemToSubstitute = initializeViewModel.getItemToSubstitute();
        Pp.b searchType = initializeViewModel.getSearchType();
        String initialSearchTerm = initializeViewModel.getInitialSearchTerm();
        S1 s1S = s();
        s1S.b().setValue(Boolean.valueOf(this.userManager.b()));
        s1S.J().setValue(itemToSubstitute);
        s1S.h0().setValue(initializeViewModel.getPackageName());
        s1S.Y().setValue(initializeViewModel.getFindSubstitutionName());
        s1S.W().setValue(initializeViewModel.getFilterActivityClassName());
        s1S.H().setValue(InterfaceC12713e.b.f114111a);
        y1();
        InterfaceC5872l0<Boolean> interfaceC5872l0K = s1S.k();
        Pp.b bVar = Pp.b.f26238a;
        boolean z11 = false;
        if (searchType == bVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        interfaceC5872l0K.setValue(Boolean.valueOf(z10));
        InterfaceC5872l0<Boolean> interfaceC5872l0B = s1S.B();
        if (this.featureManager.e(AbstractC18503f.A.f172842h) && this.userManager.b() && searchType == bVar) {
            z11 = true;
        }
        interfaceC5872l0B.setValue(Boolean.valueOf(z11));
        this.plpStateHolder.l4(itemToSubstitute);
        if (searchType != null) {
            m4(searchType);
        }
        if (initialSearchTerm != null) {
            s().d().setValue(initialSearchTerm);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R3(Object result) throws Throwable {
        Throwable thE = Result.e(result);
        if (thE != null) {
            S1 s1S = s();
            qw.a.INSTANCE.e(com.meijer.mobile.core.networking.exceptions.a.a(thE));
            s1S.w().setValue(new a.Failed(HomeViewModel.ShopByDepartmentsLoadingKeyV2, null, 2, null));
        }
        if (Result.h(result)) {
            DepartmentCard departmentCard = (DepartmentCard) result;
            S1 s1S2 = s();
            s1S2.e().clear();
            s1S2.e().addAll(departmentCard.b());
            s1S2.w().setValue(new a.NotLoading(HomeViewModel.ShopByDepartmentsLoadingKeyV2));
            s1S2.l().setValue(AbstractC6392a.INSTANCE.c(departmentCard.getSeeAllTitle()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void S3(R1.ProcessCouponAction vsu) {
        K2(vsu.getCouponAction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void U3(R1.ProcessProductCardAction vsu) {
        InterfaceC17146a productCardAction = vsu.getProductCardAction();
        if (productCardAction instanceof InterfaceC17146a.FindSimilarItems) {
            t2(((InterfaceC17146a.FindSimilarItems) vsu.getProductCardAction()).getProduct());
            return;
        }
        if (productCardAction instanceof InterfaceC17146a.UpdateEntry) {
            I3(((InterfaceC17146a.UpdateEntry) vsu.getProductCardAction()).getProductToAdd(), ((InterfaceC17146a.UpdateEntry) vsu.getProductCardAction()).getQuantity());
            return;
        }
        if (productCardAction instanceof InterfaceC17146a.ProductItemClicked) {
            r3(((InterfaceC17146a.ProductItemClicked) vsu.getProductCardAction()).getItemClicked(), ((InterfaceC17146a.ProductItemClicked) vsu.getProductCardAction()).getPosition());
        } else if (productCardAction instanceof InterfaceC17146a.SendCriteoLoadBeacon) {
            d4(((InterfaceC17146a.SendCriteoLoadBeacon) vsu.getProductCardAction()).getBeacon(), ((InterfaceC17146a.SendCriteoLoadBeacon) vsu.getProductCardAction()).getFormatLevelBeacon());
        } else {
            if (productCardAction instanceof InterfaceC17146a.SendCriteoOnViewBeacon) {
                e4(((InterfaceC17146a.SendCriteoOnViewBeacon) vsu.getProductCardAction()).a(), ((InterfaceC17146a.SendCriteoOnViewBeacon) vsu.getProductCardAction()).getFormatLevelBeacon());
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V2(y1 y1Var, Object obj, List list) {
        Intrinsics.g(list);
        y1Var.onProductsState(obj, list);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object Y2(y1 y1Var, SearchSuggestions searchSuggestions, Continuation continuation) {
        y1Var.H3(searchSuggestions);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y3(y1 y1Var, TrackingData trackingData, Coupon coupon) {
        Intrinsics.g(coupon);
        y1Var.H1(coupon, trackingData);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void b4() {
        int i10 = a.$EnumSwitchMapping$1[s().y().getValue().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            this.plpStateHolder.M3(G.AbstractC12559j.p.f111639a);
            return;
        }
        this.plpStateHolder.M3(G.AbstractC12559j.a.f111606a);
    }

    private final void c4(R1.ProcessOnResumeSearchExtra processOnResumeSearchExtra) {
        y3(processOnResumeSearchExtra.getSearchTerm(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f4() {
        if (s().v0().getValue().booleanValue() && !StringsKt.s0(s().d().getValue())) {
            s().v0().setValue(Boolean.FALSE);
            this.analyticsEngine.c(C14756c.h("Product Search Page"), new Function1() { // from class: com.meijer.mobile.meijer.search.r1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return y1.g4(this.f114161a, (TrackingData) obj);
                }
            });
        }
    }

    private final TrackingData getClipCouponTrackingData(final Coupon coupon, final EnumC15218a carouselType) {
        Object next;
        Coupon coupon2;
        Iterator<T> it = s().S().values().iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                CouponState couponState = (CouponState) next;
                if (couponState != null && (coupon2 = couponState.getCoupon()) != null && coupon2.getOfferId() == coupon.getOfferId()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        final CouponState couponState2 = (CouponState) next;
        return C14760g.a(C14756c.a("coupon clip"), new Function1() { // from class: com.meijer.mobile.meijer.search.x0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.x2(coupon, this, carouselType, couponState2, (TrackingData) obj);
            }
        });
    }

    private final void h3(ClipUnclipCouponResponse response, final Coupon coupon, final TrackingData trackingData) {
        if (StringsKt.I(response.getResult(), "Success", false, 2, null)) {
            this.analyticsEngine.k(trackingData);
            return;
        }
        s();
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        n(v(A(new j.Dialog(null, companion.d(Nr.g.f22702n, new Object[0]), companion.d(Nr.g.f22700m, new Object[0]), companion.d(com.meijer.mobile.meijer.Y.f100486Ih, new Object[0]), companion.d(Nr.g.f22664O, new Object[0]), null, false, null, 225, null), new Function2() { // from class: com.meijer.mobile.meijer.search.X0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return y1.i3(this.f114082a, coupon, trackingData, (DialogInterface) obj, ((Integer) obj2).intValue());
            }
        }), new Function2() { // from class: com.meijer.mobile.meijer.search.Y0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return y1.j3((DialogInterface) obj, ((Integer) obj2).intValue());
            }
        }));
    }

    private final void i2() {
        s().o().setValue(Boolean.TRUE);
    }

    private final void j4(l.k query) {
        s().T().setValue(query);
    }

    private final void k4(String productTitle) {
        w3(productTitle);
    }

    private final void l3() {
        s();
        n(new j.DismissKeyboard(null, 1, null));
        n(new j.FinishActivity(null, 1, null));
    }

    private final void n2(l.k query) {
        int size;
        AbstractC6392a abstractC6392aD;
        Collection<List<FilterFacetOption>> collectionValues;
        Map<FilterFacet, List<FilterFacetOption>> mapF3;
        S1 s1S = s();
        InterfaceC5872l0<Boolean> interfaceC5872l0J = s1S.j();
        boolean z10 = true;
        if (query.u3().isEmpty() && query.getSelectedSort() == null && (((mapF3 = query.F3()) == null || !(!mapF3.isEmpty())) && query.c1().isEmpty() && query.u3().isEmpty())) {
            z10 = false;
        }
        interfaceC5872l0J.setValue(Boolean.valueOf(z10));
        Map<FilterFacet, List<FilterFacetOption>> mapF32 = query.F3();
        if (mapF32 != null && (collectionValues = mapF32.values()) != null) {
            Iterator<T> it = collectionValues.iterator();
            size = 0;
            while (it.hasNext()) {
                size += ((List) it.next()).size();
            }
        } else {
            size = 0;
        }
        InterfaceC5872l0<AbstractC6392a> interfaceC5872l0U = s1S.u();
        if (size == 0) {
            abstractC6392aD = AbstractC6392a.INSTANCE.d(C18372b.f172051b, "");
        } else {
            abstractC6392aD = AbstractC6392a.INSTANCE.d(C18372b.f172051b, " (" + size + ')');
        }
        interfaceC5872l0U.setValue(abstractC6392aD);
        v4(query, false);
    }

    private final void n3(int count) {
        z4(count);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o3(y1 y1Var, Pk.c cVar, EnumC15218a enumC15218a, Coupon coupon) {
        if (coupon.x()) {
            y1Var.K2(new a.ViewCouponDetails(cVar, null));
        } else {
            Intrinsics.g(coupon);
            y1Var.K2(new a.Clip(cVar, y1Var.getClipCouponTrackingData(coupon, enumC15218a)));
        }
        return Unit.f143329a;
    }

    private final void o4() {
        s().v0().setValue(Boolean.TRUE);
        C15809k.d(androidx.view.d0.a(this), null, null, new v(null), 3, null);
    }

    private final void p2() {
        C15809k.d(androidx.view.d0.a(this), this.ioDispatcher, null, new c(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void r2() {
        C15809k.d(androidx.view.d0.a(this), this.ioDispatcher, null, new e(null), 2, null);
    }

    private final void r3(final ProductCardDecorator itemClicked, int position) {
        if (s().y().getValue() != Pp.b.f26240c && s().y().getValue() != Pp.b.f26241d) {
            this.analyticsEngine.b(C14756c.a("event: search: product detail"), new Function1() { // from class: com.meijer.mobile.meijer.search.j1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return y1.s3((TrackingData) obj);
                }
            });
            Iterator<ProductListDecorator> it = this.plpStateHolder.v3().getValue().p().iterator();
            int i10 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (Intrinsics.e(it.next().getProduct().getCode(), itemClicked.getProduct().getCode())) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
            Integer numValueOf = Integer.valueOf(i10);
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                final int iIntValue = Integer.valueOf(numValueOf.intValue() + 1).intValue();
                this.analyticsEngine.g(C14756c.h("Product Details Page"), new Function1() { // from class: com.meijer.mobile.meijer.search.k1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return y1.t3(iIntValue, this, itemClicked, (TrackingData) obj);
                    }
                });
                this.analyticsEngine.k(C2898u.f1904a.h0(iIntValue));
            }
        }
        this.plpStateHolder.M3(new G.AbstractC12559j.ItemSelectedAction(itemClicked, s().y().getValue(), position));
        ProductSponsorship sponsorship = itemClicked.getSponsorship();
        if (sponsorship != null && sponsorship.getSponsorSource() == Ho.b.f13875c) {
            this.plpStateHolder.M3(new G.AbstractC12559j.SendCriteoClickBeacon(itemClicked.getProduct().getBeaconInfo().e(), itemClicked.getProduct().getBeaconInfo().getFormatLevelOnClickBeacon(), null, null, 12, null));
        }
    }

    private final void s2() {
        if (s().p0().c().getValue().intValue() < 1) {
            C15809k.d(androidx.view.d0.a(this), null, null, new f(null), 3, null);
        } else {
            qw.a.INSTANCE.d("SearchProductViewModelCompose attempted to register multiple collectors on the Filter and Sort replay buffer. This means the last collector was dropped!! Please only use one collector for the direct view child.", new Object[0]);
        }
    }

    private final void setLoadingStateError(String loadingKey, Throwable error) {
        if (error.getCause() instanceof HttpException) {
            Throwable cause = error.getCause();
            Intrinsics.h(cause, "null cannot be cast to non-null type retrofit2.HttpException");
            if (((HttpException) cause).code() == 503) {
                s().g0().getValue().b(new a.Failed(loadingKey, AbstractC6392a.INSTANCE.d(yr.Q.f171737E, new Object[0])));
                return;
            }
        }
        if ((!(error instanceof RetrofitException) || ((RetrofitException) error).getExceptionKind() != RetrofitException.b.f97000b) && !(error instanceof ConnectException) && !(error instanceof NoAvailableNetworksException)) {
            s().g0().getValue().b(new a.Failed(loadingKey, null, 2, null));
        } else {
            s().g0().getValue().b(new a.Failed(loadingKey, AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f101115p5, new Object[0])));
        }
    }

    private final ProductListDecorator toProductListDecorator(ProductState<ProductFullDetails> productState) {
        boolean zBooleanValue;
        CouponCountDownStateDecorator couponCountDownStateDecoratorD;
        CouponState couponState = (CouponState) CollectionsKt.u0(productState.d());
        ProductListDecorator.Companion companion = ProductListDecorator.INSTANCE;
        ProductFullDetails productFullDetails = (ProductFullDetails) productState.g();
        CartEntry cartEntry = productState.getCartEntry();
        boolean z10 = false;
        if (Intrinsics.e(productState.getCode(), s().z0().getValue())) {
            zBooleanValue = s().R0().getValue().booleanValue();
        } else {
            zBooleanValue = false;
        }
        ProductEligibility.a aVarI = productState.getEligibility().i();
        ProductEligibility.a aVarK = productState.getEligibility().k();
        if (Intrinsics.e(productState.getCode(), s().z0().getValue()) && s().k0().getValue().booleanValue()) {
            z10 = true;
        }
        boolean z11 = z10;
        Coupon coupon = null;
        if (couponState != null) {
            couponCountDownStateDecoratorD = Qr.a.d(couponState);
        } else {
            couponCountDownStateDecoratorD = null;
        }
        if (couponState != null) {
            coupon = couponState.getCoupon();
        }
        return ProductListDecorator.Companion.b(companion, productFullDetails, null, null, cartEntry, zBooleanValue, aVarI, aVarK, z11, null, couponCountDownStateDecoratorD, coupon, false, null, null, false, 0, 63750, null);
    }

    private final void u3(final String searchTerm) {
        s().C0().setValue("Recent Search");
        S1(new R1.CompleteSearchAction(searchTerm, searchTerm, false, false));
        this.analyticsEngine.g(C14756c.h("Product Search Page"), new Function1() { // from class: com.meijer.mobile.meijer.search.P0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.v3(searchTerm, (TrackingData) obj);
            }
        });
        o4();
    }

    private final void w3(String firstItemDescription) {
        x4(firstItemDescription);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w4(int totalCount) {
        s().getTotalProductCount().i(totalCount);
        n3(totalCount);
    }

    private final void x1(String toAdd) {
        List<String> listQ0 = CollectionsKt.Q0(CollectionsKt.M0(CollectionsKt.i0(s().v()), toAdd), toAdd);
        this.userManager.M(listQ0, false);
        SnapshotStateList<String> snapshotStateListV = s().v();
        snapshotStateListV.clear();
        snapshotStateListV.addAll(listQ0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x4(String firstItemDescription) {
        String queryString;
        String str;
        SearchQuery value = s().o0().getValue();
        if (value != null) {
            queryString = value.getQueryString();
        } else {
            queryString = null;
        }
        if (queryString == null) {
            queryString = "";
        }
        if (Ds.j.d(queryString) && !StringsKt.s0(firstItemDescription)) {
            str = firstItemDescription;
        } else {
            str = queryString;
        }
        String strQ = StringsKt.Q(str, ",", " ", false, 4, null);
        if (StringsKt.C1(strQ).toString().length() > 0) {
            x1(strQ);
        }
    }

    private final void y1() {
        if (!s().v().isEmpty() && Intrinsics.e(s().H().getValue(), InterfaceC12713e.b.f114111a)) {
            n(new j.AnnounceForAccessibility(null, AbstractC6392a.INSTANCE.d(C18372b.f172060k, new Object[0]), 1, null));
        }
    }

    private final void y3(String searchTerm, boolean isScannedUPC) {
        S1 s1S = s();
        InterfaceC5872l0<Boolean> interfaceC5872l0K = s1S.k();
        Boolean bool = Boolean.FALSE;
        interfaceC5872l0K.setValue(bool);
        s1S.B().setValue(bool);
        s1S.j().setValue(Boolean.TRUE);
        O3(new SearchQuery(searchTerm, s().y().getValue(), isScannedUPC), s().C0().getValue());
        if (s().y().getValue() == Pp.b.f26239b) {
            s().j().setValue(bool);
        }
        h4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y4(EnumC12707c scenario) {
        InterfaceC12713e interfaceC12713e;
        S1 s1S = s();
        s1S.K().setValue(Boolean.valueOf(q4(scenario)));
        s1S.L().setValue(Boolean.valueOf(p4(scenario)));
        s1S.o().setValue(Boolean.valueOf(r4(scenario)));
        InterfaceC5872l0<InterfaceC12713e> interfaceC5872l0H = s1S.H();
        int i10 = a.$EnumSwitchMapping$0[scenario.ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    interfaceC12713e = InterfaceC12713e.c.f114112a;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                interfaceC12713e = InterfaceC12713e.C1805e.f114114a;
            }
        } else {
            interfaceC12713e = InterfaceC12713e.a.f114110a;
        }
        interfaceC5872l0H.setValue(interfaceC12713e);
    }

    private final void z3() {
        if (!StringsKt.s0(s().d().getValue())) {
            s().C0().setValue("Typed Search");
            S1(new R1.CompleteSearchAction(s().d().getValue(), s().d().getValue(), false, false));
            o4();
            this.analyticsEngine.g(C14756c.h("Product Search Page"), new Function1() { // from class: com.meijer.mobile.meijer.search.W0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return y1.A3(this.f114081a, (TrackingData) obj);
                }
            });
        }
    }

    private final void z4(int totalCount) {
        s().o().setValue(Boolean.valueOf(r4(EnumC12707c.f114096a)));
    }

    @Override // com.meijer.mobile.architecture.i, androidx.view.c0
    protected void onCleared() {
        super.onCleared();
        this.plpStateHolder.close();
    }
}
