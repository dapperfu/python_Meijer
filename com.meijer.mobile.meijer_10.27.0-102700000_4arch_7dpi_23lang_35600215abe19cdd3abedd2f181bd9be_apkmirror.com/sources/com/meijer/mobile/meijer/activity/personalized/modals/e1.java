package com.meijer.mobile.meijer.activity.personalized.modals;

import Ao.C2930u;
import Ao.W;
import Co.ProductFullDetails;
import Co.StockInfo;
import Fq.ShoppingListItem;
import Hr.CouponCountDownStateDecorator;
import Ir.UserActionDialogInfo;
import Oj.a;
import Ok.Coupon;
import Pk.a;
import Qo.l;
import Rk.CouponOptions;
import Tl.ToastMessageData;
import Xk.CouponState;
import ak.AbstractC5607a;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC6015f;
import androidx.view.InterfaceC6030s;
import cl.C6412d;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse;
import com.meijer.mobile.meijer.C12561q;
import com.meijer.mobile.meijer.C12563s;
import com.meijer.mobile.meijer.InterfaceC12562r;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import dl.CouponsResponse;
import ej.Entry;
import ej.EntryChange;
import ej.ShoppingCart;
import fi.C13902c;
import fi.EnumC13905f;
import fi.GoogleAdAnalytics;
import fi.GoogleAdData;
import gi.InterfaceC14261a;
import hi.AbstractC14482i;
import hi.C14476c;
import hi.TrackingData;
import hk.CartPreviewDecorator;
import ij.FulfillmentSlot;
import io.constructor.BuildConfig;
import io.constructor.data.model.common.FilterGroup;
import iv.C14764a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
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
import qp.C16594b;
import qv.AbstractC16618K;
import qv.C16648k;
import qv.InterfaceC16622O;
import retrofit2.HttpException;
import sn.Paginator;
import sp.ProductState;
import tk.AbstractC17116a;
import tk.c;
import tr.C17135b;
import ts.ProductCardDecorator;
import tv.C17146H;
import tv.C17154h;
import tv.InterfaceC17139A;
import tv.InterfaceC17140B;
import tv.InterfaceC17144F;
import tv.InterfaceC17153g;
import ur.AbstractC17302a;
import uw.a;
import vl.CartEntry;
import vl.ProductEligibility;
import vr.AbstractC17604a;
import vs.C17612h;
import vs.CartProductListDecorator;
import vs.ProductListDecorator;
import wr.InterfaceC17847a;
import yl.AbstractC18227f;
import ys.C18301b;

@Metadata(d1 = {"\u0000î\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 ð\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0003:\u0010ê\u0001î\u0001ð\u0001ó\u0001ä\u0001ì\u0001è\u0001æ\u0001B\u008b\u0001\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\b\b\u0001\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J'\u0010/\u001a\u00020&2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020&2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u001d\u00108\u001a\u00020&2\f\u00107\u001a\b\u0012\u0004\u0012\u00020605H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020&H\u0002¢\u0006\u0004\b:\u0010(J#\u0010>\u001a\u00020&2\u0012\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0;05H\u0002¢\u0006\u0004\b>\u00109J\u000f\u0010?\u001a\u00020&H\u0002¢\u0006\u0004\b?\u0010(J\u000f\u0010@\u001a\u00020&H\u0002¢\u0006\u0004\b@\u0010(J\u000f\u0010A\u001a\u00020&H\u0002¢\u0006\u0004\bA\u0010(J!\u0010F\u001a\u00020&2\u0006\u0010C\u001a\u00020B2\b\u0010E\u001a\u0004\u0018\u00010DH\u0002¢\u0006\u0004\bF\u0010GJ!\u0010L\u001a\u00020&2\u0006\u0010I\u001a\u00020H2\b\u0010K\u001a\u0004\u0018\u00010JH\u0002¢\u0006\u0004\bL\u0010MJ)\u0010P\u001a\u00020&2\u0006\u0010O\u001a\u00020N2\u0006\u0010I\u001a\u00020H2\b\u0010K\u001a\u0004\u0018\u00010JH\u0002¢\u0006\u0004\bP\u0010QJ!\u0010U\u001a\u00020&2\b\u0010S\u001a\u0004\u0018\u00010R2\u0006\u0010T\u001a\u00020HH\u0002¢\u0006\u0004\bU\u0010VJ!\u0010W\u001a\u00020&2\u0006\u0010I\u001a\u00020H2\b\u0010K\u001a\u0004\u0018\u00010JH\u0002¢\u0006\u0004\bW\u0010MJ\u0011\u0010X\u001a\u0004\u0018\u00010JH\u0002¢\u0006\u0004\bX\u0010YJ\u0011\u0010Z\u001a\u0004\u0018\u00010JH\u0002¢\u0006\u0004\bZ\u0010YJ\u0017\u0010\\\u001a\u00020&2\u0006\u0010[\u001a\u000201H\u0002¢\u0006\u0004\b\\\u00104J\u0017\u0010^\u001a\u00020&2\u0006\u0010[\u001a\u00020]H\u0002¢\u0006\u0004\b^\u0010_J\u0019\u0010b\u001a\u00020&2\b\b\u0002\u0010a\u001a\u00020`H\u0002¢\u0006\u0004\bb\u0010cJ\u001b\u0010f\u001a\u00020&2\n\u0010e\u001a\u00060-j\u0002`dH\u0002¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020&H\u0002¢\u0006\u0004\bh\u0010(J\u000f\u0010i\u001a\u00020&H\u0002¢\u0006\u0004\bi\u0010(J\u0017\u0010k\u001a\u00020&2\u0006\u0010j\u001a\u00020`H\u0002¢\u0006\u0004\bk\u0010cJ5\u0010q\u001a\u00020&2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020J052\n\b\u0002\u0010n\u001a\u0004\u0018\u00010m2\n\b\u0002\u0010p\u001a\u0004\u0018\u00010oH\u0002¢\u0006\u0004\bq\u0010rJ\u000f\u0010s\u001a\u00020&H\u0002¢\u0006\u0004\bs\u0010(J-\u0010v\u001a\u00020&2\b\u0010t\u001a\u0004\u0018\u00010m2\b\b\u0002\u0010u\u001a\u00020`2\b\u0010p\u001a\u0004\u0018\u00010oH\u0002¢\u0006\u0004\bv\u0010wJ\u001f\u0010z\u001a\u00020&2\u0006\u0010p\u001a\u00020<2\u0006\u0010y\u001a\u00020xH\u0002¢\u0006\u0004\bz\u0010{J\u000f\u0010|\u001a\u00020&H\u0002¢\u0006\u0004\b|\u0010(J\u0018\u0010\u007f\u001a\u00020&2\u0006\u0010~\u001a\u00020}H\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0011\u0010\u0081\u0001\u001a\u00020&H\u0002¢\u0006\u0005\b\u0081\u0001\u0010(J\u0019\u0010\u0082\u0001\u001a\u00020&2\u0006\u0010[\u001a\u000201H\u0002¢\u0006\u0005\b\u0082\u0001\u00104J\u001c\u0010\u0085\u0001\u001a\u00020&2\b\u0010\u0084\u0001\u001a\u00030\u0083\u0001H\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J,\u0010\u0087\u0001\u001a\u00020&2\u0006\u0010p\u001a\u00020<2\b\u00102\u001a\u0004\u0018\u0001012\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001b\u0010\u008a\u0001\u001a\u00020&2\u0007\u0010\u0089\u0001\u001a\u00020JH\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J*\u0010\u008e\u0001\u001a\u0004\u0018\u00010R2\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010J2\t\b\u0002\u0010\u008d\u0001\u001a\u00020`H\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J'\u0010\u0093\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0092\u0001\u0018\u0001052\n\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u0001H\u0002¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J-\u0010\u0096\u0001\u001a\u0004\u0018\u00010-2\u0006\u0010S\u001a\u00020R2\u000f\u0010\u0091\u0001\u001a\n\u0012\u0005\u0012\u00030\u0090\u00010\u0095\u0001H\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J'\u0010\u009b\u0001\u001a\u00030\u009a\u00012\u0007\u0010\u0098\u0001\u001a\u00020-2\t\b\u0002\u0010\u0099\u0001\u001a\u00020-H\u0002¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J#\u0010\u009d\u0001\u001a\u00020`2\u000f\u0010\u0091\u0001\u001a\n\u0012\u0005\u0012\u00030\u0090\u00010\u0095\u0001H\u0002¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u0018\u0010 \u0001\u001a\u00020&2\u0007\u0010\u009f\u0001\u001a\u00020`¢\u0006\u0005\b \u0001\u0010cJ\u000f\u0010¡\u0001\u001a\u00020&¢\u0006\u0005\b¡\u0001\u0010(J\u0011\u0010¢\u0001\u001a\u00020JH\u0000¢\u0006\u0005\b¢\u0001\u0010YJ1\u0010¦\u0001\u001a\u00020&2\u0007\u0010£\u0001\u001a\u00020J2\t\b\u0002\u0010¤\u0001\u001a\u00020`2\u000b\b\u0002\u0010¥\u0001\u001a\u0004\u0018\u00010J¢\u0006\u0006\b¦\u0001\u0010§\u0001J#\u0010¨\u0001\u001a\u00020&2\u0006\u0010[\u001a\u0002012\t\b\u0002\u0010¤\u0001\u001a\u00020`¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u001c\u0010¬\u0001\u001a\u00020&2\n\u0010«\u0001\u001a\u0005\u0018\u00010ª\u0001¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J\u001b\u0010¯\u0001\u001a\u00020&2\u0007\u0010~\u001a\u00030®\u0001H\u0016¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u0018\u0010±\u0001\u001a\u00020&2\u0006\u0010~\u001a\u00020}¢\u0006\u0006\b±\u0001\u0010\u0080\u0001J?\u0010³\u0001\u001a\u00020&2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020J052\u0007\u0010²\u0001\u001a\u00020J2\n\b\u0002\u0010n\u001a\u0004\u0018\u00010m2\n\b\u0002\u0010p\u001a\u0004\u0018\u00010o¢\u0006\u0006\b³\u0001\u0010´\u0001J?\u0010µ\u0001\u001a\u00020&2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020J052\u0007\u0010²\u0001\u001a\u00020J2\n\b\u0002\u0010n\u001a\u0004\u0018\u00010m2\n\b\u0002\u0010p\u001a\u0004\u0018\u00010o¢\u0006\u0006\bµ\u0001\u0010´\u0001J>\u0010¶\u0001\u001a\u00020&2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020J052\n\b\u0002\u0010t\u001a\u0004\u0018\u00010m2\b\b\u0002\u0010u\u001a\u00020`2\b\u0010p\u001a\u0004\u0018\u00010o¢\u0006\u0006\b¶\u0001\u0010·\u0001J9\u0010¸\u0001\u001a\u00020&2\u0006\u0010l\u001a\u00020J2\u0007\u0010²\u0001\u001a\u00020J2\n\b\u0002\u0010n\u001a\u0004\u0018\u00010m2\n\b\u0002\u0010p\u001a\u0004\u0018\u00010o¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u001c\u0010¼\u0001\u001a\u00020&2\b\u0010»\u0001\u001a\u00030º\u0001H\u0016¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u001c\u0010¾\u0001\u001a\u00020&2\b\u0010»\u0001\u001a\u00030º\u0001H\u0016¢\u0006\u0006\b¾\u0001\u0010½\u0001J\u000f\u0010¿\u0001\u001a\u00020&¢\u0006\u0005\b¿\u0001\u0010(J\u0011\u0010À\u0001\u001a\u00020&H\u0014¢\u0006\u0005\bÀ\u0001\u0010(J\u001d\u0010Á\u0001\u001a\u00020`2\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010JH\u0000¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J \u0010Ä\u0001\u001a\u0005\u0018\u00010Ã\u00012\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010JH\u0007¢\u0006\u0006\bÄ\u0001\u0010Å\u0001JJ\u0010Ê\u0001\u001a\u00020&2\u000b\b\u0002\u0010Æ\u0001\u001a\u0004\u0018\u0001012+\b\u0002\u0010É\u0001\u001a$\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020J\u0018\u00010Ç\u0001j\u0011\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020J\u0018\u0001`È\u0001¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J4\u0010Ð\u0001\u001a\u00020J2\u0007\u0010Ì\u0001\u001a\u00020J2\u0007\u0010Í\u0001\u001a\u00020J2\u0010\u0010Ï\u0001\u001a\u000b\u0012\u0005\u0012\u00030Î\u0001\u0018\u000105¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÜ\u0001\u0010Ý\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bè\u0001\u0010é\u0001R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bê\u0001\u0010ë\u0001R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bì\u0001\u0010í\u0001R\u0016\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bî\u0001\u0010ï\u0001R\u0016\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bð\u0001\u0010ñ\u0001R'\u0010÷\u0001\u001a\t\u0012\u0004\u0012\u0002010ò\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bó\u0001\u0010ô\u0001\u001a\u0006\bõ\u0001\u0010ö\u0001R\u001f\u0010ü\u0001\u001a\n\u0012\u0005\u0012\u00030ù\u00010ø\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bú\u0001\u0010û\u0001R\u001e\u0010ÿ\u0001\u001a\t\u0012\u0004\u0012\u00020`0ò\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bý\u0001\u0010þ\u0001R#\u0010\u0085\u0002\u001a\t\u0012\u0004\u0012\u00020`0\u0080\u00028\u0006¢\u0006\u0010\n\u0006\b\u0081\u0002\u0010\u0082\u0002\u001a\u0006\b\u0083\u0002\u0010\u0084\u0002R*\u0010\u008d\u0002\u001a\u00030\u0086\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0087\u0002\u0010\u0088\u0002\u001a\u0006\b\u0089\u0002\u0010\u008a\u0002\"\u0006\b\u008b\u0002\u0010\u008c\u0002R\u001c\u0010\u0090\u0002\u001a\u0005\u0018\u00010ª\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0002\u0010\u008f\u0002R\u0019\u0010\u0093\u0002\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0002\u0010\u0092\u0002R*\u0010\u0097\u0002\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0094\u0002\u0010\u0092\u0002\u001a\u0005\b\u0095\u0002\u0010Y\"\u0006\b\u0096\u0002\u0010\u008b\u0001R*\u0010\u009b\u0002\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0098\u0002\u0010\u0092\u0002\u001a\u0005\b\u0099\u0002\u0010Y\"\u0006\b\u009a\u0002\u0010\u008b\u0001R*\u0010\u009f\u0002\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u009c\u0002\u0010\u0092\u0002\u001a\u0005\b\u009d\u0002\u0010Y\"\u0006\b\u009e\u0002\u0010\u008b\u0001R*\u0010£\u0002\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b \u0002\u0010\u0092\u0002\u001a\u0005\b¡\u0002\u0010Y\"\u0006\b¢\u0002\u0010\u008b\u0001R*\u0010§\u0002\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¤\u0002\u0010\u0092\u0002\u001a\u0005\b¥\u0002\u0010Y\"\u0006\b¦\u0002\u0010\u008b\u0001R\u001c\u0010«\u0002\u001a\u0005\u0018\u00010¨\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0002\u0010ª\u0002R\u001b\u0010¥\u0001\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0002\u0010\u0092\u0002R\u001e\u0010°\u0002\u001a\t\u0012\u0004\u0012\u00020J0\u00ad\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0002\u0010¯\u0002R#\u0010´\u0002\u001a\t\u0012\u0004\u0012\u00020J0\u00ad\u00028\u0006¢\u0006\u0010\n\u0006\b±\u0002\u0010¯\u0002\u001a\u0006\b²\u0002\u0010³\u0002R#\u0010·\u0002\u001a\t\u0012\u0004\u0012\u00020J0\u00ad\u00028\u0006¢\u0006\u0010\n\u0006\bµ\u0002\u0010¯\u0002\u001a\u0006\b¶\u0002\u0010³\u0002R\u001f\u0010»\u0002\u001a\n\u0012\u0005\u0012\u00030\u0083\u00010¸\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0002\u0010º\u0002R\u001e\u0010¾\u0002\u001a\u00070Jj\u0003`¼\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0002\u0010\u0092\u0002R\u0018\u0010Â\u0002\u001a\u00030¿\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0002\u0010Á\u0002R\u0018\u0010Æ\u0002\u001a\u00030Ã\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0002\u0010Å\u0002R\u001f\u0010É\u0002\u001a\n\u0012\u0005\u0012\u00030Ç\u00020ò\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0002\u0010þ\u0001R$\u0010Ì\u0002\u001a\n\u0012\u0005\u0012\u00030Ç\u00020\u0080\u00028\u0006¢\u0006\u0010\n\u0006\bÊ\u0002\u0010\u0082\u0002\u001a\u0006\bË\u0002\u0010\u0084\u0002R1\u0010Õ\u0002\u001a\u00030Í\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0006\bÎ\u0002\u0010Ï\u0002\u0012\u0005\bÔ\u0002\u0010(\u001a\u0006\bÐ\u0002\u0010Ñ\u0002\"\u0006\bÒ\u0002\u0010Ó\u0002R\u001f\u0010Ø\u0002\u001a\n\u0012\u0005\u0012\u00030Ö\u00020ø\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b×\u0002\u0010û\u0001R9\u0010á\u0002\u001a\u0005\u0018\u00010Ù\u00022\n\u0010Ú\u0002\u001a\u0005\u0018\u00010Ù\u00028B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\bÛ\u0002\u0010Ü\u0002\u001a\u0006\bÝ\u0002\u0010Þ\u0002\"\u0006\bß\u0002\u0010à\u0002RD\u0010å\u0002\u001a\u000b\u0018\u00010Jj\u0005\u0018\u0001`¼\u00022\u0010\u0010Ú\u0002\u001a\u000b\u0018\u00010Jj\u0005\u0018\u0001`¼\u00028B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\bâ\u0002\u0010Ü\u0002\u001a\u0005\bã\u0002\u0010Y\"\u0006\bä\u0002\u0010\u008b\u0001R\u001a\u0010é\u0002\u001a\u0005\u0018\u00010æ\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bç\u0002\u0010è\u0002R\u001c\u0010í\u0002\u001a\n\u0012\u0005\u0012\u00030ù\u00010ê\u00028F¢\u0006\b\u001a\u0006\bë\u0002\u0010ì\u0002R\u001c\u0010ï\u0002\u001a\n\u0012\u0005\u0012\u00030Ö\u00020ê\u00028F¢\u0006\b\u001a\u0006\bî\u0002\u0010ì\u0002¨\u0006ñ\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "", "LTq/j;", "storeProvider", "Lyo/k;", "userManager", "Lyl/k;", "featureManager", "Lsp/Y;", "productStateRepository", "Lhl/m;", "cartRepository", "LEq/b;", "shoppingListRepository", "Lwr/f;", "cartInteractor", "Lsl/h;", "timeSlotRepository", "Lcl/d;", "couponsRepository", "Lcom/meijer/mobile/meijer/activity/personalized/modals/B0;", "productQueryPagingDataSource", "Lgi/a;", "analyticsEngine", "LRo/a;", "productAnalytics", "Lqp/b;", "beaconClient", "Lpp/e;", "sponsorshipsDataStore", "Lpp/d;", "productMetadataStore", "Lqv/K;", "ioDispatcher", "<init>", "(LTq/j;Lyo/k;Lyl/k;Lsp/Y;Lhl/m;LEq/b;Lwr/f;Lsl/h;Lcl/d;Lcom/meijer/mobile/meijer/activity/personalized/modals/B0;Lgi/a;LRo/a;Lqp/b;Lpp/e;Lpp/d;Lqv/K;)V", "", "n2", "()V", "Lts/a;", "itemClicked", "LPp/b;", "searchType", "", "position", "o1", "(Lts/a;LPp/b;I)V", "LQo/l;", "productQuery", "z1", "(LQo/l;)V", "", "LOj/a;", "loadingStates", "onLoadingStates", "(Ljava/util/List;)V", "fetchAllCoupons", "Lsp/b;", "LCo/h;", "productStates", "A1", "D1", "w1", "K0", "LOk/c;", "couponIdentity", "Lhi/f;", "trackingData", "N0", "(LOk/c;Lhi/f;)V", "LOk/a;", "coupon", "", "couponLocation", "B0", "(LOk/a;Ljava/lang/String;)V", "Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;", "response", "y1", "(Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;LOk/a;Ljava/lang/String;)V", "LXk/c;", "couponState", "clippedCoupon", "f2", "(LXk/c;LOk/a;)V", "i2", "W0", "()Ljava/lang/String;", "V0", "query", "R0", "LQo/l$k;", "T1", "(LQo/l$k;)V", "", "overrideItemAlreadyInCart", "g2", "(Z)V", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "G1", "(I)V", "l2", "h2", "shouldShowZeroResults", "d2", "beacon", "LTl/a;", "beaconType", "Lmk/c;", "product", "M1", "(Ljava/util/List;LTl/a;Lmk/c;)V", "v1", "type", "isFormatLevel", "sendBeaconToastMessage", "(LTl/a;ZLmk/c;)V", "", "quantityToUpdate", "o2", "(LCo/h;D)V", "q1", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "action", "n1", "(Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;)V", "t1", "u1", "LTq/k;", "storeDetails", "E1", "(LTq/k;)V", "F1", "(LCo/h;LQo/l;I)V", "event", "k2", "(Ljava/lang/String;)V", "productCode", "logError", "getCouponState", "(Ljava/lang/String;Z)LXk/c;", "Lej/j;", "entryChange", "LOk/f;", "getCouponList", "(Lej/j;)Ljava/util/List;", "Ltk/c;", "S0", "(LXk/c;Ltk/c;)Ljava/lang/Integer;", "freeItemsCount", "rewardItemsCount", "Lak/a;", "d1", "(II)Lak/a;", "e2", "(Ltk/c;)Z", "value", "c2", "t2", "l1", "term", "forceRefresh", "searchMethod", "a2", "(Ljava/lang/String;ZLjava/lang/String;)V", "X1", "(LQo/l;Z)V", "Lvs/b;", "item", "U1", "(Lvs/b;)V", "LPk/a;", "onAction", "(LPk/a;)V", "x1", "formatLevelBeacon", "N1", "(Ljava/util/List;Ljava/lang/String;LTl/a;Lmk/c;)V", "K1", "I1", "(Ljava/util/List;LTl/a;ZLmk/c;)V", "L1", "(Ljava/lang/String;Ljava/lang/String;LTl/a;Lmk/c;)V", "Landroidx/lifecycle/s;", "owner", "onCreate", "(Landroidx/lifecycle/s;)V", "onResume", "p2", "onCleared", "j1", "(Ljava/lang/String;)Z", "LAo/W$a;", "Z0", "(Ljava/lang/String;)LAo/W$a;", "initialProductQuery", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "departmentBreadcrumbs", "r1", "(LQo/l;Ljava/util/HashMap;)V", "departmentId", "departmentName", "Lio/constructor/data/model/common/FilterGroup;", "parents", "A0", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;", "a", "LTq/j;", "b", "Lyo/k;", "c", "Lyl/k;", "d", "Lsp/Y;", "e", "Lhl/m;", "f", "LEq/b;", "g", "Lwr/f;", "h", "Lsl/h;", "i", "Lcl/d;", "j", "Lcom/meijer/mobile/meijer/activity/personalized/modals/B0;", "k", "Lgi/a;", "l", "LRo/a;", "m", "Lqp/b;", "n", "Lpp/e;", "o", "Lpp/d;", "p", "Lqv/K;", "Ltv/B;", "q", "Lkotlin/Lazy;", "g1", "()Ltv/B;", "queryStore", "Ltv/A;", "LTl/e;", "r", "Ltv/A;", "_toastMessageData", "s", "Ltv/B;", "_stepperClicked", "Ltv/P;", "t", "Ltv/P;", "k1", "()Ltv/P;", "stepperClicked", "Lcom/meijer/mobile/meijer/r;", "u", "Lcom/meijer/mobile/meijer/r;", "getAdManagerProvider", "()Lcom/meijer/mobile/meijer/r;", "setAdManagerProvider", "(Lcom/meijer/mobile/meijer/r;)V", "adManagerProvider", "v", "Lvs/b;", "itemToSubstitute", "w", "Ljava/lang/String;", "carouselTitle", "x", "T0", "O1", "campaignIdValue", "y", "X0", "Q1", "cmpid", "z", "Y0", "R1", "collectionName", "A", "c1", "S1", "departmentCarouselAnalytics", "B", "U0", "P1", "carouselTitleAnalytics", "LQo/l$i;", "C", "LQo/l$i;", "searchQuery", "D", "", "E", "Ljava/util/List;", "trackingLoadBeacon", "F", "getTrackingOnLoadFormatLevelBeacon", "()Ljava/util/List;", "trackingOnLoadFormatLevelBeacon", "G", "getTrackingOnViewFormatLevelBeacon", "trackingOnViewFormatLevelBeacon", "Lio/reactivex/l;", "H", "Lio/reactivex/l;", "currentStoreStream", "Lcom/meijer/mobile/core/model/common/ResourceId;", "I", "cartId", "LOj/c;", "J", "LOj/c;", "loadingStatesManager", "LNu/a;", "K", "LNu/a;", "disposables", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$q;", "L", "_viewState", "M", "m1", "viewState", "Lsn/a;", "N", "Lsn/a;", "e1", "()Lsn/a;", "V1", "(Lsn/a;)V", "getPaginator$annotations", "paginator", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "O", "_event", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$m;", "<set-?>", "P", "Lkotlin/properties/ReadWriteProperty;", "f1", "()Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$m;", "W1", "(Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$m;)V", "productInQtyStepperInteraction", "Q", "h1", "Z1", "resetStepperState", "Lvs/f;", "i1", "()Lvs/f;", "selectedProduct", "Ltv/F;", "getToastMessageData", "()Ltv/F;", "toastMessageData", "getEvents", "events", "R", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class e1 extends androidx.view.c0 implements InterfaceC6015f {

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
    private final Oj.c loadingStatesManager;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final Nu.a disposables;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<ViewState> _viewState;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final tv.P<ViewState> viewState;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private Paginator paginator;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<AbstractC12460n> _event;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty productInQtyStepperInteraction;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty resetStepperState;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Tq.j storeProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yl.k featureManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final sp.Y productStateRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hl.m cartRepository;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Eq.b shoppingListRepository;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final wr.f cartInteractor;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final sl.h timeSlotRepository;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final C6412d couponsRepository;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final B0 productQueryPagingDataSource;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14261a analyticsEngine;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Ro.a productAnalytics;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final C16594b beaconClient;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final pp.e sponsorshipsDataStore;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final pp.d productMetadataStore;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Lazy queryStore;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<ToastMessageData> _toastMessageData;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<Boolean> _stepperClicked;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final tv.P<Boolean> stepperClicked;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private InterfaceC12562r adManagerProvider;

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

    /* renamed from: S, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f111081S = {Reflection.f(new MutablePropertyReference1Impl(e1.class, "productInQtyStepperInteraction", "getProductInQtyStepperInteraction()Lcom/meijer/mobile/meijer/activity/personalized/modals/ProductsViewModel$EntryInQtyStepperInteraction;", 0)), Reflection.f(new MutablePropertyReference1Impl(e1.class, "resetStepperState", "getResetStepperState()Ljava/lang/String;", 0))};

    /* renamed from: T, reason: collision with root package name */
    public static final int f111082T = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$onGetClipCouponResponse$1", f = "ProductsViewModel.kt", l = {524}, m = "invokeSuspend")
    static final class A extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111126a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Coupon f111128c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e1.this.new A(this.f111128c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        A(Coupon coupon, Continuation<? super A> continuation) {
            super(2, continuation);
            this.f111128c = coupon;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((A) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111126a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = e1.this._event;
                AbstractC12460n.ClipCouponFailedEvent clipCouponFailedEvent = new AbstractC12460n.ClipCouponFailedEvent(Nr.g.f22746n, Nr.g.f22744m, com.meijer.mobile.meijer.Y.f99529Dh, Nr.g.f22708O, this.f111128c);
                this.f111126a = 1;
                if (interfaceC17139A.emit(clipCouponFailedEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$onProductQuery$2", f = "ProductsViewModel.kt", l = {379}, m = "invokeSuspend")
    static final class B extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111129a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Qo.l f111131c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e1.this.new B(this.f111131c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        B(Qo.l lVar, Continuation<? super B> continuation) {
            super(2, continuation);
            this.f111131c = lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((B) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111129a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = e1.this._event;
                AbstractC12460n.BubbleFacetsToFilterAndSort bubbleFacetsToFilterAndSort = new AbstractC12460n.BubbleFacetsToFilterAndSort((l.k) this.f111131c);
                this.f111129a = 1;
                if (interfaceC17139A.emit(bubbleFacetsToFilterAndSort, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$onProductsState$1", f = "ProductsViewModel.kt", l = {HttpResponseStatus.ERROR_CONFLICT}, m = "invokeSuspend")
    static final class C extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111132a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<ProductState<ProductFullDetails>> f111134c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f111135d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f111136e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C(List<ProductState<ProductFullDetails>> list, String str, String str2, Continuation<? super C> continuation) {
            super(2, continuation);
            this.f111134c = list;
            this.f111135d = str;
            this.f111136e = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e1.this.new C(this.f111134c, this.f111135d, this.f111136e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String name;
            ProductFullDetails productFullDetails;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111132a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = e1.this._event;
                int size = this.f111134c.size();
                ProductState c16993b = (ProductState) CollectionsKt.u0(this.f111134c);
                if (c16993b != null && (productFullDetails = (ProductFullDetails) c16993b.g()) != null) {
                    name = productFullDetails.getName();
                } else {
                    name = null;
                }
                if (name == null) {
                    name = "";
                }
                AbstractC12460n.UpdateProductsInfoEvent updateProductsInfoEvent = new AbstractC12460n.UpdateProductsInfoEvent(size, name, this.f111135d, this.f111136e);
                this.f111132a = 1;
                if (interfaceC17139A.emit(updateProductsInfoEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$onViewProductDetails$1", f = "ProductsViewModel.kt", l = {1632}, m = "invokeSuspend")
    static final class D extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111137a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ProductFullDetails f111139c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e1.this.new D(this.f111139c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        D(ProductFullDetails productFullDetails, Continuation<? super D> continuation) {
            super(2, continuation);
            this.f111139c = productFullDetails;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((D) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111137a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = e1.this._event;
                AbstractC12460n.ViewProductDetailsEvent viewProductDetailsEvent = new AbstractC12460n.ViewProductDetailsEvent(this.f111139c);
                this.f111137a = 1;
                if (interfaceC17139A.emit(viewProductDetailsEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$proactiveSubstitute$1$1", f = "ProductsViewModel.kt", l = {943, 949, 954}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class E extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f111140a;

        /* renamed from: b, reason: collision with root package name */
        Object f111141b;

        /* renamed from: c, reason: collision with root package name */
        Object f111142c;

        /* renamed from: d, reason: collision with root package name */
        Object f111143d;

        /* renamed from: e, reason: collision with root package name */
        int f111144e;

        /* renamed from: f, reason: collision with root package name */
        int f111145f;

        /* renamed from: g, reason: collision with root package name */
        int f111146g;

        /* renamed from: h, reason: collision with root package name */
        int f111147h;

        /* renamed from: i, reason: collision with root package name */
        int f111148i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f111149j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ CartProductListDecorator f111151l;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            E e10 = e1.this.new E(this.f111151l, continuation);
            e10.f111149j = obj;
            return e10;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        E(CartProductListDecorator cartProductListDecorator, Continuation<? super E> continuation) {
            super(2, continuation);
            this.f111151l = cartProductListDecorator;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((E) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x00f0, code lost:
        
            if (r4.emit(r6, r15) == r8) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0126, code lost:
        
            if (r0.emit(r4, r15) == r8) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00f6 A[PHI: r1 r2
          0x00f6: PHI (r1v11 java.lang.Object) = (r1v9 java.lang.Object), (r1v12 java.lang.Object) binds: [B:31:0x00d3, B:35:0x00f3] A[DONT_GENERATE, DONT_INLINE]
          0x00f6: PHI (r2v10 qv.O) = (r2v9 qv.O), (r2v11 qv.O) binds: [B:31:0x00d3, B:35:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00fe  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
                Method dump skipped, instructions count: 314
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.personalized.modals.e1.E.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$sendBeaconToastMessage$1", f = "ProductsViewModel.kt", l = {1352}, m = "invokeSuspend")
    static final class F extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f111152a;

        /* renamed from: b, reason: collision with root package name */
        int f111153b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f111154c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e1 f111155d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Tl.a f111156e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ mk.c f111157f;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new F(this.f111154c, this.f111155d, this.f111156e, this.f111157f, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        F(boolean z10, e1 e1Var, Tl.a aVar, mk.c cVar, Continuation<? super F> continuation) {
            super(2, continuation);
            this.f111154c = z10;
            this.f111155d = e1Var;
            this.f111156e = aVar;
            this.f111157f = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((F) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            String displayName;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111153b;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                if (this.f111154c) {
                    str = "Format Level";
                } else {
                    str = "Sku level";
                }
                InterfaceC17139A interfaceC17139A = this.f111155d._toastMessageData;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(' ');
                Tl.a aVar = this.f111156e;
                if (aVar != null) {
                    displayName = aVar.getDisplayName();
                } else {
                    displayName = null;
                }
                sb2.append(displayName);
                sb2.append(" Beacon sent successfully!");
                ToastMessageData toastMessageData = new ToastMessageData(sb2.toString(), this.f111157f);
                this.f111152a = str;
                this.f111153b = 1;
                if (interfaceC17139A.emit(toastMessageData, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$sendCriteoBeacon$1", f = "ProductsViewModel.kt", l = {1261}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class G extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f111158a;

        /* renamed from: b, reason: collision with root package name */
        Object f111159b;

        /* renamed from: c, reason: collision with root package name */
        Object f111160c;

        /* renamed from: d, reason: collision with root package name */
        Object f111161d;

        /* renamed from: e, reason: collision with root package name */
        Object f111162e;

        /* renamed from: f, reason: collision with root package name */
        Object f111163f;

        /* renamed from: g, reason: collision with root package name */
        Object f111164g;

        /* renamed from: h, reason: collision with root package name */
        Object f111165h;

        /* renamed from: i, reason: collision with root package name */
        Object f111166i;

        /* renamed from: j, reason: collision with root package name */
        Object f111167j;

        /* renamed from: k, reason: collision with root package name */
        Object f111168k;

        /* renamed from: l, reason: collision with root package name */
        Object f111169l;

        /* renamed from: m, reason: collision with root package name */
        boolean f111170m;

        /* renamed from: n, reason: collision with root package name */
        int f111171n;

        /* renamed from: o, reason: collision with root package name */
        int f111172o;

        /* renamed from: p, reason: collision with root package name */
        int f111173p;

        /* renamed from: q, reason: collision with root package name */
        int f111174q;

        /* renamed from: r, reason: collision with root package name */
        int f111175r;

        /* renamed from: s, reason: collision with root package name */
        int f111176s;

        /* renamed from: t, reason: collision with root package name */
        int f111177t;

        /* renamed from: u, reason: collision with root package name */
        private /* synthetic */ Object f111178u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ List<String> f111179v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ boolean f111180w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ Tl.a f111181x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ e1 f111182y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ mk.c f111183z;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            G g10 = new G(this.f111179v, this.f111180w, this.f111181x, this.f111182y, this.f111183z, continuation);
            g10.f111178u = obj;
            return g10;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        G(List<String> list, boolean z10, Tl.a aVar, e1 e1Var, mk.c cVar, Continuation<? super G> continuation) {
            super(2, continuation);
            this.f111179v = list;
            this.f111180w = z10;
            this.f111181x = aVar;
            this.f111182y = e1Var;
            this.f111183z = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((G) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
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
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.personalized.modals.e1.G.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$showFreeItemsSnackBarFromCartUpdate$1$1$1", f = "ProductsViewModel.kt", l = {2361}, m = "invokeSuspend")
    static final class H extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111184a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f111186c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e1.this.new H(this.f111186c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        H(AbstractC5607a abstractC5607a, Continuation<? super H> continuation) {
            super(2, continuation);
            this.f111186c = abstractC5607a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((H) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111184a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = e1.this._event;
                AbstractC12460n.ShowFreeItemsSnackbar showFreeItemsSnackbar = new AbstractC12460n.ShowFreeItemsSnackbar(this.f111186c);
                this.f111184a = 1;
                if (interfaceC17139A.emit(showFreeItemsSnackbar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$showFreeItemsSnackBarFromCartUpdate$1$2$1", f = "ProductsViewModel.kt", l = {2368}, m = "invokeSuspend")
    static final class I extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111187a;

        I(Continuation<? super I> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e1.this.new I(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((I) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111187a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = e1.this._event;
                AbstractC12460n.e eVar = AbstractC12460n.e.f111343a;
                this.f111187a = 1;
                if (interfaceC17139A.emit(eVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$showFreeItemsSnackBarFromClipCoupon$1$2$1", f = "ProductsViewModel.kt", l = {558}, m = "invokeSuspend")
    static final class J extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111189a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f111191c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e1.this.new J(this.f111191c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        J(AbstractC5607a abstractC5607a, Continuation<? super J> continuation) {
            super(2, continuation);
            this.f111191c = abstractC5607a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((J) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111189a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = e1.this._event;
                AbstractC12460n.ShowFreeItemsSnackbar showFreeItemsSnackbar = new AbstractC12460n.ShowFreeItemsSnackbar(this.f111191c);
                this.f111189a = 1;
                if (interfaceC17139A.emit(showFreeItemsSnackbar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "Lkotlin/reflect/KProperty;", "property", "oldValue", "newValue", "", "afterChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class K extends ObservableProperty<EntryInQtyStepperInteraction> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e1 f111192b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public K(Object obj, e1 e1Var) {
            super(obj);
            this.f111192b = e1Var;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty<?> property, EntryInQtyStepperInteraction oldValue, EntryInQtyStepperInteraction newValue) {
            Intrinsics.j(property, "property");
            this.f111192b.D1();
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "Lkotlin/reflect/KProperty;", "property", "oldValue", "newValue", "", "afterChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class L extends ObservableProperty<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e1 f111193b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public L(Object obj, e1 e1Var) {
            super(obj);
            this.f111193b = e1Var;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty<?> property, String oldValue, String newValue) {
            Intrinsics.j(property, "property");
            this.f111193b.D1();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$substituteOOSItem$1$1", f = "ProductsViewModel.kt", l = {900, 908, 910, 920}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class M extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f111194a;

        /* renamed from: b, reason: collision with root package name */
        Object f111195b;

        /* renamed from: c, reason: collision with root package name */
        Object f111196c;

        /* renamed from: d, reason: collision with root package name */
        Object f111197d;

        /* renamed from: e, reason: collision with root package name */
        int f111198e;

        /* renamed from: f, reason: collision with root package name */
        int f111199f;

        /* renamed from: g, reason: collision with root package name */
        int f111200g;

        /* renamed from: h, reason: collision with root package name */
        int f111201h;

        /* renamed from: i, reason: collision with root package name */
        int f111202i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f111203j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ mk.i f111205l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ mk.i f111206m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f111207n;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            M m10 = e1.this.new M(this.f111205l, this.f111206m, this.f111207n, continuation);
            m10.f111203j = obj;
            return m10;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        M(mk.i iVar, mk.i iVar2, boolean z10, Continuation<? super M> continuation) {
            super(2, continuation);
            this.f111205l = iVar;
            this.f111206m = iVar2;
            this.f111207n = z10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((M) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0114  */
        /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, qv.O] */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v22, types: [qv.O] */
        /* JADX WARN: Type inference failed for: r1v35 */
        /* JADX WARN: Type inference failed for: r1v36 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 340
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.personalized.modals.e1.M.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$updateCartItemCount$1", f = "ProductsViewModel.kt", l = {1365}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class N extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f111208a;

        /* renamed from: b, reason: collision with root package name */
        Object f111209b;

        /* renamed from: c, reason: collision with root package name */
        Object f111210c;

        /* renamed from: d, reason: collision with root package name */
        Object f111211d;

        /* renamed from: e, reason: collision with root package name */
        int f111212e;

        /* renamed from: f, reason: collision with root package name */
        int f111213f;

        /* renamed from: g, reason: collision with root package name */
        int f111214g;

        /* renamed from: h, reason: collision with root package name */
        int f111215h;

        /* renamed from: i, reason: collision with root package name */
        int f111216i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f111217j;

        N(Continuation<? super N> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            N n10 = e1.this.new N(continuation);
            n10.f111217j = obj;
            return n10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((N) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111216i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f111217j;
                    e1 e1Var = e1.this;
                    Result.Companion companion = Result.INSTANCE;
                    wr.f fVar = e1Var.cartInteractor;
                    this.f111217j = interfaceC16622O;
                    this.f111208a = interfaceC16622O;
                    this.f111209b = this;
                    this.f111210c = this;
                    this.f111211d = interfaceC16622O;
                    this.f111212e = 0;
                    this.f111213f = 0;
                    this.f111214g = 0;
                    this.f111215h = 0;
                    this.f111216i = 1;
                    if (wr.f.n(fVar, false, false, this, 2, null) == objF) {
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
                uw.a.INSTANCE.l(thE, "fetchLatestCart failed in ProductsViewModel", new Object[0]);
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class O extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        O(Object obj) {
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
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$10", f = "ProductsViewModel.kt", l = {278}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$a, reason: case insensitive filesystem */
    static final class C12447a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111219a;

        C12447a(Continuation<? super C12447a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e1.this.new C12447a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C12447a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111219a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                sp.Y y10 = e1.this.productStateRepository;
                this.f111219a = 1;
                obj = y10.F0(this);
                if (obj == objF) {
                    return objF;
                }
            }
            Ck.a.a((Nu.b) obj, e1.this.disposables);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$b, reason: case insensitive filesystem */
    /* synthetic */ class C12448b extends AdaptedFunctionReference implements Function2<List<? extends Oj.a>, Continuation<? super Unit>, Object>, SuspendFunction {
        C12448b(Object obj) {
            super(2, obj, e1.class, "onLoadingStates", "onLoadingStates(Ljava/util/List;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<? extends Oj.a> list, Continuation<? super Unit> continuation) {
            return e1.T((e1) this.f142801a, list, continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ltv/g;", "", "LOj/a;", "", "it", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$2", f = "ProductsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$c, reason: case insensitive filesystem */
    static final class C12449c extends SuspendLambda implements Function3<InterfaceC17153g<? super List<? extends Oj.a>>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111221a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f111222b;

        C12449c(Continuation<? super C12449c> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super List<? extends Oj.a>> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            C12449c c12449c = new C12449c(continuation);
            c12449c.f111222b = th2;
            return c12449c.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f111221a == 0) {
                ResultKt.b(obj);
                uw.a.INSTANCE.f((Throwable) this.f111222b, "Caught exception on loadingStatesStream", new Object[0]);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$d, reason: case insensitive filesystem */
    /* synthetic */ class C12450d extends FunctionReferenceImpl implements Function1<List<? extends ProductState<ProductFullDetails>>, Unit> {
        C12450d(Object obj) {
            super(1, obj, e1.class, "onProductsState", "onProductsState(Ljava/util/List;)V", 0);
        }

        public final void a(List<ProductState<ProductFullDetails>> p02) {
            Intrinsics.j(p02, "p0");
            ((e1) this.receiver).A1(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends ProductState<ProductFullDetails>> list) {
            a(list);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$e, reason: case insensitive filesystem */
    /* synthetic */ class C12451e extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C12451e(Object obj) {
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "LQo/l;", "", "it", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$7", f = "ProductsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$g, reason: case insensitive filesystem */
    static final class C12453g extends SuspendLambda implements Function3<InterfaceC17153g<? super Qo.l>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111226a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f111227b;

        C12453g(Continuation<? super C12453g> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super Qo.l> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            C12453g c12453g = new C12453g(continuation);
            c12453g.f111227b = th2;
            return c12453g.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f111226a == 0) {
                ResultKt.b(obj);
                uw.a.INSTANCE.f((Throwable) this.f111227b, "Error in query state flow", new Object[0]);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$h, reason: case insensitive filesystem */
    /* synthetic */ class C12454h extends FunctionReferenceImpl implements Function1<Tq.k, Unit> {
        C12454h(Object obj) {
            super(1, obj, e1.class, "onStoreChange", "onStoreChange(Lcom/meijer/mobile/store/model/common/StoreSummary;)V", 0);
        }

        public final void a(Tq.k p02) {
            Intrinsics.j(p02, "p0");
            ((e1) this.receiver).E1(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Tq.k kVar) {
            a(kVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$i, reason: case insensitive filesystem */
    /* synthetic */ class C12455i extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C12455i(Object obj) {
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

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0015\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0015\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-¨\u0006."}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "", "<init>", "()V", "a", "p", "e", "t", "g", "f", "m", "s", "q", "u", "o", "r", "n", "b", "h", "c", "l", "i", "k", "j", "d", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$a;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$b;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$c;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$d;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$e;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$f;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$g;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$h;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$i;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$j;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$k;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$l;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$m;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$n;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$o;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$p;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$q;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$r;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$s;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$t;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$u;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j, reason: case insensitive filesystem */
    public static abstract class AbstractC12456j {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$a;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$a */
        public static final /* data */ class a extends AbstractC12456j {

            /* renamed from: a, reason: collision with root package name */
            public static final a f111228a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 2066172058;
            }

            public String toString() {
                return "AddProactiveSubstituteAction";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$b;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "", "touchX", "touchY", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$b, reason: from toString */
        public static final /* data */ class CollapseQuantityStepperAction extends AbstractC12456j {

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

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$c;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "<init>", "()V", "a", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$c$a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$c */
        public static abstract class c extends AbstractC12456j {

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$c$a;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$c$a */
            public static final /* data */ class a extends c {

                /* renamed from: a, reason: collision with root package name */
                public static final a f111231a = new a();

                private a() {
                    super(null);
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof a);
                }

                public int hashCode() {
                    return -64336504;
                }

                public String toString() {
                    return "FilterAndSort";
                }
            }

            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private c() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$d;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "Lfi/a;", "analytics", "<init>", "(Lfi/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfi/a;", "()Lfi/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$d, reason: from toString */
        public static final /* data */ class GoogleAdClicked extends AbstractC12456j {

            /* renamed from: b, reason: collision with root package name */
            public static final int f111232b = GoogleAdAnalytics.f131141f;

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

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$e;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "Lts/a;", "selectedItem", "LPp/b;", "searchType", "", "position", "<init>", "(Lts/a;LPp/b;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lts/a;", "c", "()Lts/a;", "b", "LPp/b;", "()LPp/b;", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$e, reason: from toString */
        public static final /* data */ class ItemSelectedAction extends AbstractC12456j {

            /* renamed from: d, reason: collision with root package name */
            public static final int f111234d = ProductCardDecorator.f162061C;

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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$f;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$f */
        public static final /* data */ class f extends AbstractC12456j {

            /* renamed from: a, reason: collision with root package name */
            public static final f f111238a = new f();

            private f() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof f);
            }

            public int hashCode() {
                return 1857657261;
            }

            public String toString() {
                return "LoadMoreProductsAction";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$g;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$g */
        public static final /* data */ class g extends AbstractC12456j {

            /* renamed from: a, reason: collision with root package name */
            public static final g f111239a = new g();

            private g() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof g);
            }

            public int hashCode() {
                return 1609463578;
            }

            public String toString() {
                return "NavigateToCartAction";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$h;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "resourceId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$h, reason: from toString */
        public static final /* data */ class ResetActiveStepper extends AbstractC12456j {

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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ResetActiveStepper(String resourceId) {
                super(null);
                Intrinsics.j(resourceId, "resourceId");
                this.resourceId = resourceId;
            }

            /* renamed from: a, reason: from getter */
            public final String getResourceId() {
                return this.resourceId;
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$i;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "", "", "beacon", "formatLevelBeacon", "LTl/a;", "beaconType", "Lmk/c;", "product", "<init>", "(Ljava/util/List;Ljava/lang/String;LTl/a;Lmk/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "LTl/a;", "()LTl/a;", "d", "Lmk/c;", "()Lmk/c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$i, reason: from toString */
        public static final /* data */ class SendCriteoClickBeacon extends AbstractC12456j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<String> beacon;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String formatLevelBeacon;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Tl.a beaconType;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final mk.c product;

            public /* synthetic */ SendCriteoClickBeacon(List list, String str, Tl.a aVar, mk.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
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
                Tl.a aVar = this.beaconType;
                int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                mk.c cVar = this.product;
                return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
            }

            public String toString() {
                return "SendCriteoClickBeacon(beacon=" + this.beacon + ", formatLevelBeacon=" + this.formatLevelBeacon + ", beaconType=" + this.beaconType + ", product=" + this.product + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SendCriteoClickBeacon(List<String> beacon, String formatLevelBeacon, Tl.a aVar, mk.c cVar) {
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
            public final Tl.a getBeaconType() {
                return this.beaconType;
            }

            /* renamed from: c, reason: from getter */
            public final String getFormatLevelBeacon() {
                return this.formatLevelBeacon;
            }

            /* renamed from: d, reason: from getter */
            public final mk.c getProduct() {
                return this.product;
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$j;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "", "beacon", "formatLevelBeacon", "LTl/a;", "beaconType", "Lmk/c;", "product", "<init>", "(Ljava/lang/String;Ljava/lang/String;LTl/a;Lmk/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "LTl/a;", "()LTl/a;", "d", "Lmk/c;", "()Lmk/c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$j, reason: collision with other inner class name and from toString */
        public static final /* data */ class SendCriteoLoadBeacon extends AbstractC12456j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String beacon;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String formatLevelBeacon;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Tl.a beaconType;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final mk.c product;

            public /* synthetic */ SendCriteoLoadBeacon(String str, String str2, Tl.a aVar, mk.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
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
                Tl.a aVar = this.beaconType;
                int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                mk.c cVar = this.product;
                return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
            }

            public String toString() {
                return "SendCriteoLoadBeacon(beacon=" + this.beacon + ", formatLevelBeacon=" + this.formatLevelBeacon + ", beaconType=" + this.beaconType + ", product=" + this.product + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SendCriteoLoadBeacon(String beacon, String formatLevelBeacon, Tl.a aVar, mk.c cVar) {
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
            public final Tl.a getBeaconType() {
                return this.beaconType;
            }

            /* renamed from: c, reason: from getter */
            public final String getFormatLevelBeacon() {
                return this.formatLevelBeacon;
            }

            /* renamed from: d, reason: from getter */
            public final mk.c getProduct() {
                return this.product;
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$k;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "", "", "beacon", "LTl/a;", "beaconType", "Lmk/c;", "product", "<init>", "(Ljava/util/List;LTl/a;Lmk/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "LTl/a;", "()LTl/a;", "c", "Lmk/c;", "()Lmk/c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$k, reason: from toString */
        public static final /* data */ class SendCriteoQtyStepperBeacon extends AbstractC12456j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<String> beacon;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Tl.a beaconType;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final mk.c product;

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
                Tl.a aVar = this.beaconType;
                int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                mk.c cVar = this.product;
                return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
            }

            public String toString() {
                return "SendCriteoQtyStepperBeacon(beacon=" + this.beacon + ", beaconType=" + this.beaconType + ", product=" + this.product + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SendCriteoQtyStepperBeacon(List<String> beacon, Tl.a aVar, mk.c cVar) {
                super(null);
                Intrinsics.j(beacon, "beacon");
                this.beacon = beacon;
                this.beaconType = aVar;
                this.product = cVar;
            }

            public final List<String> a() {
                return this.beacon;
            }

            /* renamed from: b, reason: from getter */
            public final Tl.a getBeaconType() {
                return this.beaconType;
            }

            /* renamed from: c, reason: from getter */
            public final mk.c getProduct() {
                return this.product;
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$l;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "", "", "beacon", "formatLevelBeacon", "LTl/a;", "beaconType", "Lmk/c;", "product", "<init>", "(Ljava/util/List;Ljava/lang/String;LTl/a;Lmk/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "LTl/a;", "()LTl/a;", "d", "Lmk/c;", "()Lmk/c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$l, reason: from toString */
        public static final /* data */ class SendCriteoViewBeacon extends AbstractC12456j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<String> beacon;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String formatLevelBeacon;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Tl.a beaconType;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final mk.c product;

            public /* synthetic */ SendCriteoViewBeacon(List list, String str, Tl.a aVar, mk.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
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
                Tl.a aVar = this.beaconType;
                int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
                mk.c cVar = this.product;
                return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
            }

            public String toString() {
                return "SendCriteoViewBeacon(beacon=" + this.beacon + ", formatLevelBeacon=" + this.formatLevelBeacon + ", beaconType=" + this.beaconType + ", product=" + this.product + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SendCriteoViewBeacon(List<String> beacon, String formatLevelBeacon, Tl.a aVar, mk.c cVar) {
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
            public final Tl.a getBeaconType() {
                return this.beaconType;
            }

            /* renamed from: c, reason: from getter */
            public final String getFormatLevelBeacon() {
                return this.formatLevelBeacon;
            }

            /* renamed from: d, reason: from getter */
            public final mk.c getProduct() {
                return this.product;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0012\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$m;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "", "title", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "setTitle", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$m, reason: from toString */
        public static final /* data */ class SendTitle extends AbstractC12456j {

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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SendTitle(String title) {
                super(null);
                Intrinsics.j(title, "title");
                this.title = title;
            }

            /* renamed from: a, reason: from getter */
            public final String getTitle() {
                return this.title;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$n;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "LQo/l$k;", "query", "<init>", "(LQo/l$k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LQo/l$k;", "()LQo/l$k;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$n, reason: from toString */
        public static final /* data */ class SetFilterAndSortOptions extends AbstractC12456j {

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

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$o;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "", "productCode", "", "quantityToUpdate", "Landroid/graphics/Rect;", "stepperHitRect", "<init>", "(Ljava/lang/String;DLandroid/graphics/Rect;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "D", "getQuantityToUpdate", "()D", "c", "Landroid/graphics/Rect;", "()Landroid/graphics/Rect;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$o, reason: from toString */
        public static final /* data */ class StepperStateChangedAction extends AbstractC12456j {

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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$p;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$p */
        public static final /* data */ class p extends AbstractC12456j {

            /* renamed from: a, reason: collision with root package name */
            public static final p f111261a = new p();

            private p() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof p);
            }

            public int hashCode() {
                return 2041138039;
            }

            public String toString() {
                return "SubstituteOosAction";
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$q;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "LCo/h;", "product", "", "quantityToUpdate", "Landroid/graphics/Rect;", "stepperHitRect", "<init>", "(LCo/h;DLandroid/graphics/Rect;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "b", "D", "()D", "c", "Landroid/graphics/Rect;", "getStepperHitRect", "()Landroid/graphics/Rect;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$q, reason: from toString */
        public static final /* data */ class UpdateEntryAction extends AbstractC12456j {

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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$r;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "Lur/a;", "cartUpdateRequest", "<init>", "(Lur/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lur/a;", "()Lur/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$r, reason: from toString */
        public static final /* data */ class UserAcceptAddToCartAction extends AbstractC12456j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC17302a cartUpdateRequest;

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
            public UserAcceptAddToCartAction(AbstractC17302a cartUpdateRequest) {
                super(null);
                Intrinsics.j(cartUpdateRequest, "cartUpdateRequest");
                this.cartUpdateRequest = cartUpdateRequest;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC17302a getCartUpdateRequest() {
                return this.cartUpdateRequest;
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$s;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "LCo/h;", "product", "LQo/l;", "query", "", "position", "<init>", "(LCo/h;LQo/l;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "b", "()LCo/h;", "LQo/l;", "c", "()LQo/l;", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$s, reason: from toString */
        public static final /* data */ class ViewProductDetailsAction extends AbstractC12456j {

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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ViewProductDetailsAction(ProductFullDetails product, Qo.l lVar, int i10) {
                super(null);
                Intrinsics.j(product, "product");
                this.product = product;
                this.query = lVar;
                this.position = i10;
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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$t;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$t */
        public static final /* data */ class t extends AbstractC12456j {

            /* renamed from: a, reason: collision with root package name */
            public static final t f111269a = new t();

            private t() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof t);
            }

            public int hashCode() {
                return -1677793735;
            }

            public String toString() {
                return "ViewShoppingListAction";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$u;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "", "shouldShow", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$u, reason: from toString */
        public static final /* data */ class ZeroResultsVisibilityAction extends AbstractC12456j {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean shouldShow;

            public ZeroResultsVisibilityAction(boolean z10) {
                super(null);
                this.shouldShow = z10;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ZeroResultsVisibilityAction) && this.shouldShow == ((ZeroResultsVisibilityAction) other).shouldShow;
            }

            public int hashCode() {
                return Boolean.hashCode(this.shouldShow);
            }

            public String toString() {
                return "ZeroResultsVisibilityAction(shouldShow=" + this.shouldShow + ')';
            }

            /* renamed from: a, reason: from getter */
            public final boolean getShouldShow() {
                return this.shouldShow;
            }
        }

        public /* synthetic */ AbstractC12456j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC12456j() {
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J/\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J7\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0015\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0018\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0015\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u000e2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J%\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u0005\u0010!J)\u0010&\u001a\u00020\u000e\"\u0004\b\u0000\u0010\"2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00028\u00000#H\u0016¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$k;", "Lwr/a;", "<init>", "(Lcom/meijer/mobile/meijer/activity/personalized/modals/e1;)V", "Lur/a;", "processedRequest", "", "b", "(Lur/a;)D", "Ltk/c;", "Lej/j;", "entryChange", "", "productCode", "", "c", "(Lur/a;Ltk/c;Ljava/lang/String;)V", "f", "a", "", "requireCartOpenExtra", "entryUnitPrice", "d", "(ZLtk/c;DLjava/lang/String;)V", "e", "(Ltk/c;DLjava/lang/String;)V", "Lej/C;", "cartResource", "observeCart", "(Ltk/c;)V", "LNu/a;", "getDisposable", "()LNu/a;", "(Lur/a;Ltk/c;)V", "T", "Ltk/a;", "Lvr/a;", "challenge", "throwChallenge", "(Ltk/a;)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k, reason: case insensitive filesystem */
    private final class C12457k implements InterfaceC17847a {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k$a */
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
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$CartInteractionListener1$addCartEntry$1", f = "ProductsViewModel.kt", l = {2071}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k$b */
        static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111272a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f111273b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(e1 e1Var, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f111273b = e1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f111273b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111272a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f111273b._event;
                    AbstractC12460n.UpdateToCartFailedEvent updateToCartFailedEvent = new AbstractC12460n.UpdateToCartFailedEvent(C17135b.f161979I0);
                    this.f111272a = 1;
                    if (interfaceC17139A.emit(updateToCartFailedEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$CartInteractionListener1$addCartEntry$2", f = "ProductsViewModel.kt", l = {2079}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k$c */
        static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111274a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f111275b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(e1 e1Var, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f111275b = e1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new c(this.f111275b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111274a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f111275b._event;
                    AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
                    AbstractC12460n.ShowError showError = new AbstractC12460n.ShowError(companion.d(yr.Q.f170963F, new Object[0]), companion.d(yr.Q.f170962E, new Object[0]), companion.d(yr.Q.f170986b, new Object[0]));
                    this.f111274a = 1;
                    if (interfaceC17139A.emit(showError, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$CartInteractionListener1$addCartEntry$3", f = "ProductsViewModel.kt", l = {2092}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k$d */
        static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111276a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f111277b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(e1 e1Var, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f111277b = e1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new d(this.f111277b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111276a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f111277b._event;
                    AbstractC12460n.UpdateToCartFailedEvent updateToCartFailedEvent = new AbstractC12460n.UpdateToCartFailedEvent(C17135b.f161993P0);
                    this.f111276a = 1;
                    if (interfaceC17139A.emit(updateToCartFailedEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$CartInteractionListener1$addCartEntry$4", f = "ProductsViewModel.kt", l = {2099}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k$e */
        static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f111278a;

            /* renamed from: b, reason: collision with root package name */
            Object f111279b;

            /* renamed from: c, reason: collision with root package name */
            Object f111280c;

            /* renamed from: d, reason: collision with root package name */
            Object f111281d;

            /* renamed from: e, reason: collision with root package name */
            int f111282e;

            /* renamed from: f, reason: collision with root package name */
            int f111283f;

            /* renamed from: g, reason: collision with root package name */
            int f111284g;

            /* renamed from: h, reason: collision with root package name */
            int f111285h;

            /* renamed from: i, reason: collision with root package name */
            int f111286i;

            /* renamed from: j, reason: collision with root package name */
            private /* synthetic */ Object f111287j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ e1 f111288k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(e1 e1Var, Continuation<? super e> continuation) {
                super(2, continuation);
                this.f111288k = e1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                e eVar = new e(this.f111288k, continuation);
                eVar.f111287j = obj;
                return eVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objB;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111286i;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f111287j;
                        e1 e1Var = this.f111288k;
                        Result.Companion companion = Result.INSTANCE;
                        wr.f fVar = e1Var.cartInteractor;
                        this.f111287j = interfaceC16622O;
                        this.f111278a = interfaceC16622O;
                        this.f111279b = this;
                        this.f111280c = this;
                        this.f111281d = interfaceC16622O;
                        this.f111282e = 0;
                        this.f111283f = 0;
                        this.f111284g = 0;
                        this.f111285h = 0;
                        this.f111286i = 1;
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
                    uw.a.INSTANCE.l(thE, "fetchLatestCart failed in ProductsViewModel", new Object[0]);
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$CartInteractionListener1$addCartEntry$5", f = "ProductsViewModel.kt", l = {2117}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k$f */
        static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111289a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f111290b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ tk.c<EntryChange> f111291c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new f(this.f111290b, this.f111291c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(e1 e1Var, tk.c<EntryChange> cVar, Continuation<? super f> continuation) {
                super(2, continuation);
                this.f111290b = e1Var;
                this.f111291c = cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Entry entry;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111289a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f111290b._event;
                    int i11 = C17135b.f162019f;
                    int i12 = C17135b.f162001T0;
                    EntryChange entryChange = (EntryChange) ((c.Success) this.f111291c).a();
                    if (entryChange != null) {
                        entry = entryChange.getEntry();
                    } else {
                        entry = null;
                    }
                    AbstractC12460n.CartUpdateSuccessEvent cartUpdateSuccessEvent = new AbstractC12460n.CartUpdateSuccessEvent(i11, i12, entry);
                    this.f111289a = 1;
                    if (interfaceC17139A.emit(cartUpdateSuccessEvent, this) == objF) {
                        return objF;
                    }
                }
                Unit unit = Unit.f142422a;
                uw.a.INSTANCE.a("Emitting Event.CartUpdateSuccessEvent", new Object[0]);
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$CartInteractionListener1$addCartEntry$6$1", f = "ProductsViewModel.kt", l = {2135}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k$g */
        static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111292a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f111293b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ CartProductListDecorator f111294c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new g(this.f111293b, this.f111294c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(e1 e1Var, CartProductListDecorator cartProductListDecorator, Continuation<? super g> continuation) {
                super(2, continuation);
                this.f111293b = e1Var;
                this.f111294c = cartProductListDecorator;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111292a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f111293b._event;
                    AbstractC12460n.OpenLowStockScreenEvent openLowStockScreenEvent = new AbstractC12460n.OpenLowStockScreenEvent(this.f111294c);
                    this.f111292a = 1;
                    if (interfaceC17139A.emit(openLowStockScreenEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$CartInteractionListener1$observeCart$1$1", f = "ProductsViewModel.kt", l = {1868}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k$h */
        static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f111295a;

            /* renamed from: b, reason: collision with root package name */
            Object f111296b;

            /* renamed from: c, reason: collision with root package name */
            Object f111297c;

            /* renamed from: d, reason: collision with root package name */
            Object f111298d;

            /* renamed from: e, reason: collision with root package name */
            Object f111299e;

            /* renamed from: f, reason: collision with root package name */
            Object f111300f;

            /* renamed from: g, reason: collision with root package name */
            Object f111301g;

            /* renamed from: h, reason: collision with root package name */
            int f111302h;

            /* renamed from: i, reason: collision with root package name */
            int f111303i;

            /* renamed from: j, reason: collision with root package name */
            int f111304j;

            /* renamed from: k, reason: collision with root package name */
            int f111305k;

            /* renamed from: l, reason: collision with root package name */
            int f111306l;

            /* renamed from: m, reason: collision with root package name */
            int f111307m;

            /* renamed from: n, reason: collision with root package name */
            private /* synthetic */ Object f111308n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ tk.c<ShoppingCart> f111309o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ e1 f111310p;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                h hVar = new h(this.f111309o, this.f111310p, continuation);
                hVar.f111308n = obj;
                return hVar;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(tk.c<ShoppingCart> cVar, e1 e1Var, Continuation<? super h> continuation) {
                super(2, continuation);
                this.f111309o = cVar;
                this.f111310p = e1Var;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r32) {
                /*
                    Method dump skipped, instructions count: 250
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.personalized.modals.e1.C12457k.h.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$CartInteractionListener1$removeCartEntry$1", f = "ProductsViewModel.kt", l = {1957}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k$i */
        static final class i extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111311a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f111312b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ tk.c<EntryChange> f111313c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new i(this.f111312b, this.f111313c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(e1 e1Var, tk.c<EntryChange> cVar, Continuation<? super i> continuation) {
                super(2, continuation);
                this.f111312b = e1Var;
                this.f111313c = cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((i) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Entry entry;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111311a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f111312b._event;
                    int i11 = C17135b.f162036n0;
                    int i12 = C17135b.f162001T0;
                    EntryChange entryChange = (EntryChange) ((c.Success) this.f111313c).a();
                    if (entryChange != null) {
                        entry = entryChange.getEntry();
                    } else {
                        entry = null;
                    }
                    AbstractC12460n.CartUpdateSuccessEvent cartUpdateSuccessEvent = new AbstractC12460n.CartUpdateSuccessEvent(i11, i12, entry);
                    this.f111311a = 1;
                    if (interfaceC17139A.emit(cartUpdateSuccessEvent, this) == objF) {
                        return objF;
                    }
                }
                Unit unit = Unit.f142422a;
                uw.a.INSTANCE.a("Emitting Event.CartUpdateSuccessEvent", new Object[0]);
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$CartInteractionListener1$removeCartEntry$2", f = "ProductsViewModel.kt", l = {1974}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k$j */
        static final class j extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111314a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f111315b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(e1 e1Var, Continuation<? super j> continuation) {
                super(2, continuation);
                this.f111315b = e1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new j(this.f111315b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((j) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111314a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f111315b._event;
                    AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
                    AbstractC12460n.ShowError showError = new AbstractC12460n.ShowError(companion.d(yr.Q.f170963F, new Object[0]), companion.d(yr.Q.f170962E, new Object[0]), companion.d(yr.Q.f170986b, new Object[0]));
                    this.f111314a = 1;
                    if (interfaceC17139A.emit(showError, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$CartInteractionListener1$removeCartEntry$3", f = "ProductsViewModel.kt", l = {1984}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k$k, reason: collision with other inner class name */
        static final class C1717k extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111316a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f111317b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1717k(e1 e1Var, Continuation<? super C1717k> continuation) {
                super(2, continuation);
                this.f111317b = e1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1717k(this.f111317b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C1717k) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111316a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f111317b._event;
                    AbstractC12460n.UpdateToCartFailedEvent updateToCartFailedEvent = new AbstractC12460n.UpdateToCartFailedEvent(C17135b.f161993P0);
                    this.f111316a = 1;
                    if (interfaceC17139A.emit(updateToCartFailedEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$CartInteractionListener1$throwChallenge$1", f = "ProductsViewModel.kt", l = {2228}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k$l */
        static final class l extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111318a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f111319b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC17604a.ChokingHazardChallenge f111320c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new l(this.f111319b, this.f111320c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            l(e1 e1Var, AbstractC17604a.ChokingHazardChallenge chokingHazardChallenge, Continuation<? super l> continuation) {
                super(2, continuation);
                this.f111319b = e1Var;
                this.f111320c = chokingHazardChallenge;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((l) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111318a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f111319b._event;
                    AbstractC12460n.ShowChokingWarningDialogEvent showChokingWarningDialogEvent = new AbstractC12460n.ShowChokingWarningDialogEvent(this.f111320c.a());
                    this.f111318a = 1;
                    if (interfaceC17139A.emit(showChokingWarningDialogEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$CartInteractionListener1$updateCartEntry$1", f = "ProductsViewModel.kt", l = {2002}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k$m */
        static final class m extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111321a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f111322b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            m(e1 e1Var, Continuation<? super m> continuation) {
                super(2, continuation);
                this.f111322b = e1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new m(this.f111322b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((m) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111321a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f111322b._event;
                    AbstractC12460n.UpdateToCartFailedEvent updateToCartFailedEvent = new AbstractC12460n.UpdateToCartFailedEvent(C17135b.f161993P0);
                    this.f111321a = 1;
                    if (interfaceC17139A.emit(updateToCartFailedEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$CartInteractionListener1$updateCartEntry$2", f = "ProductsViewModel.kt", l = {2008}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k$n */
        static final class n extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111323a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f111324b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ tk.c<EntryChange> f111325c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new n(this.f111324b, this.f111325c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(e1 e1Var, tk.c<EntryChange> cVar, Continuation<? super n> continuation) {
                super(2, continuation);
                this.f111324b = e1Var;
                this.f111325c = cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((n) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Entry entry;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111323a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f111324b._event;
                    int i11 = C17135b.f162057y;
                    int i12 = C17135b.f162001T0;
                    EntryChange entryChangeA = this.f111325c.a();
                    if (entryChangeA != null) {
                        entry = entryChangeA.getEntry();
                    } else {
                        entry = null;
                    }
                    AbstractC12460n.CartUpdateSuccessEvent cartUpdateSuccessEvent = new AbstractC12460n.CartUpdateSuccessEvent(i11, i12, entry);
                    this.f111323a = 1;
                    if (interfaceC17139A.emit(cartUpdateSuccessEvent, this) == objF) {
                        return objF;
                    }
                }
                Unit unit = Unit.f142422a;
                uw.a.INSTANCE.a("Emitting Event.CartUpdateSuccessEvent", new Object[0]);
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$CartInteractionListener1$updateCartEntry$3$1", f = "ProductsViewModel.kt", l = {2044}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k$o */
        static final class o extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111326a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f111327b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            o(e1 e1Var, Continuation<? super o> continuation) {
                super(2, continuation);
                this.f111327b = e1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new o(this.f111327b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((o) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111326a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17139A interfaceC17139A = this.f111327b._event;
                    AbstractC12460n.UpdateToCartFailedEvent updateToCartFailedEvent = new AbstractC12460n.UpdateToCartFailedEvent(C17135b.f161979I0);
                    this.f111326a = 1;
                    if (interfaceC17139A.emit(updateToCartFailedEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        public C12457k() {
        }

        private final void a(AbstractC17302a processedRequest, tk.c<EntryChange> entryChange, String productCode) {
            Entry entry;
            Entry entry2;
            ProductFullDetails productFullDetailsM;
            if (entryChange instanceof c.Failure) {
                c.Failure failure = (c.Failure) entryChange;
                EntryChange entryChange2 = (EntryChange) failure.a();
                if ((entryChange2 != null ? entryChange2.getStatusCode() : null) == EntryChange.c.f128932c) {
                    C16648k.d(androidx.view.d0.a(e1.this), null, null, new b(e1.this, null), 3, null);
                } else {
                    Throwable error = failure.getError();
                    HttpException httpException = error instanceof HttpException ? (HttpException) error : null;
                    if (httpException == null || httpException.code() != 503) {
                        uw.a.INSTANCE.f(failure.getError(), "Resource.Failure<EntryChange>", new Object[0]);
                        C16648k.d(androidx.view.d0.a(e1.this), null, null, new d(e1.this, null), 3, null);
                        e1 e1Var = e1.this;
                        EntryChange entryChange3 = (EntryChange) failure.a();
                        e1Var.Z1((entryChange3 == null || (entry2 = entryChange3.getEntry()) == null || (productFullDetailsM = entry2.m()) == null) ? null : productFullDetailsM.getCode());
                        Unit unit = Unit.f142422a;
                    } else {
                        C16648k.d(androidx.view.d0.a(e1.this), null, null, new c(e1.this, null), 3, null);
                    }
                }
                C16648k.d(androidx.view.d0.a(e1.this), null, null, new e(e1.this, null), 3, null);
                return;
            }
            if (!(entryChange instanceof c.Success)) {
                if (!(entryChange instanceof c.Loading)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            d(true, entryChange, b(processedRequest), productCode);
            if (e1.this.e2(entryChange)) {
                uw.a.INSTANCE.a("Not emitting Event.CartUpdateSuccessEvent because we show free snackbar from cart update", new Object[0]);
            } else {
                C16648k.d(androidx.view.d0.a(e1.this), null, null, new f(e1.this, entryChange, null), 3, null);
            }
            EntryChange entryChange4 = (EntryChange) ((c.Success) entryChange).a();
            if (entryChange4 == null || (entry = entryChange4.getEntry()) == null) {
                return;
            }
            e1 e1Var2 = e1.this;
            CartProductListDecorator cartProductListDecoratorB = CartProductListDecorator.Companion.b(CartProductListDecorator.INSTANCE, entry, false, 2, null);
            if (cartProductListDecoratorB.getStockInfo().c()) {
                C16648k.d(androidx.view.d0.a(e1Var2), null, null, new g(e1Var2, cartProductListDecoratorB, null), 3, null);
            }
        }

        private final double b(AbstractC17302a processedRequest) {
            ShoppingCart shoppingCart;
            List<Entry> listP;
            ProductFullDetails productFullDetailsM;
            mk.b bVarD;
            List<Entry> listP2;
            ProductFullDetails productFullDetailsM2;
            mk.b bVarD2;
            if (processedRequest instanceof AbstractC17302a.Add) {
                return Co.l.a(((AbstractC17302a.Add) processedRequest).getProduct()).D().getValue();
            }
            Object obj = null;
            if (processedRequest instanceof AbstractC17302a.Update) {
                ShoppingCart shoppingCart2 = e1.this.m1().getValue().getShoppingCart();
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
            if ((processedRequest instanceof AbstractC17302a.Remove) && (shoppingCart = e1.this.m1().getValue().getShoppingCart()) != null && (listP = shoppingCart.p()) != null) {
                Iterator<T> it2 = listP.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (Intrinsics.e(((Entry) next2).m().getCode(), ((AbstractC17302a.Remove) processedRequest).getProduct().getCode())) {
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

        private final void c(AbstractC17302a processedRequest, tk.c<EntryChange> entryChange, String productCode) {
            if (entryChange instanceof c.Success) {
                e(entryChange, b(processedRequest), productCode);
                if (!e1.this.e2(entryChange)) {
                    C16648k.d(androidx.view.d0.a(e1.this), null, null, new i(e1.this, entryChange, null), 3, null);
                    return;
                } else {
                    uw.a.INSTANCE.a("Not emitting Event.CartUpdateSuccessEvent because we show free snackbar from cart update", new Object[0]);
                    Unit unit = Unit.f142422a;
                    return;
                }
            }
            if (!(entryChange instanceof c.Failure)) {
                Unit unit2 = Unit.f142422a;
                return;
            }
            c.Failure failure = (c.Failure) entryChange;
            uw.a.INSTANCE.f(failure.getError(), "Resource.Failure<EntryChange>", new Object[0]);
            if (failure.getError() instanceof HttpException) {
                Throwable error = failure.getError();
                Intrinsics.h(error, "null cannot be cast to non-null type retrofit2.HttpException");
                if (((HttpException) error).code() == 503) {
                    C16648k.d(androidx.view.d0.a(e1.this), null, null, new j(e1.this, null), 3, null);
                    return;
                }
            }
            C16648k.d(androidx.view.d0.a(e1.this), null, null, new C1717k(e1.this, null), 3, null);
        }

        private final void d(boolean requireCartOpenExtra, tk.c<EntryChange> entryChange, double entryUnitPrice, String productCode) {
            Entry entry;
            Entry entry2;
            ProductFullDetails productFullDetailsM;
            Entry entry3;
            ProductFullDetails productFullDetailsM2;
            e1 e1Var = e1.this;
            EntryChange entryChangeA = entryChange.a();
            W.ComplexPromo aVarZ0 = e1Var.Z0((entryChangeA == null || (entry3 = entryChangeA.getEntry()) == null || (productFullDetailsM2 = entry3.m()) == null) ? null : productFullDetailsM2.getCode());
            pp.d dVar = e1.this.productMetadataStore;
            EntryChange entryChangeA2 = entryChange.a();
            boolean zC = dVar.c((entryChangeA2 == null || (entry2 = entryChangeA2.getEntry()) == null || (productFullDetailsM = entry2.m()) == null) ? null : productFullDetailsM.getCode());
            boolean zJ1 = e1.this.j1(productCode);
            Iterator<ProductListDecorator> it = ((ViewState) e1.this._viewState.getValue()).q().iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                }
                String code = it.next().getProduct().getCode();
                EntryChange entryChangeA3 = entryChange.a();
                if (Intrinsics.e(code, (entryChangeA3 == null || (entry = entryChangeA3.getEntry()) == null) ? null : entry.h2())) {
                    break;
                } else {
                    i10++;
                }
            }
            Integer numValueOf = Integer.valueOf(i10);
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            e1.this.analyticsEngine.e(C2930u.f1407a.j0(entryChange, e1.this.m1().getValue().g(), requireCartOpenExtra, (Qo.l) e1.this.g1().getValue(), e1.this.cartId, e1.this.getCampaignIdValue(), e1.this.getDepartmentCarouselAnalytics(), e1.this.getCollectionName(), e1.this.getCmpid(), e1.this.sponsorshipsDataStore, zC, zJ1, true, entryUnitPrice, aVarZ0, String.valueOf(numValueOf != null ? Integer.valueOf(numValueOf.intValue() + 1) : null), e1.this.getCarouselTitleAnalytics(), false, "lowStock", "mPerks: Earn", String.valueOf(((ViewState) e1.this._viewState.getValue()).getCartDecorator().getItemCount())));
        }

        private final void e(tk.c<EntryChange> entryChange, double entryUnitPrice, String productCode) {
            Entry entry;
            ProductFullDetails productFullDetailsM;
            Entry entry2;
            Entry entry3;
            ProductFullDetails productFullDetailsM2;
            e1 e1Var = e1.this;
            EntryChange entryChangeA = entryChange.a();
            String code = null;
            int i10 = 0;
            CouponState cVarA1 = e1.a1(e1Var, (entryChangeA == null || (entry3 = entryChangeA.getEntry()) == null || (productFullDetailsM2 = entry3.m()) == null) ? null : productFullDetailsM2.getCode(), false, 2, null);
            Iterator<ProductListDecorator> it = ((ViewState) e1.this._viewState.getValue()).q().iterator();
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                }
                String code2 = it.next().getProduct().getCode();
                EntryChange entryChangeA2 = entryChange.a();
                if (Intrinsics.e(code2, (entryChangeA2 == null || (entry2 = entryChangeA2.getEntry()) == null) ? null : entry2.h2())) {
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
            InterfaceC14261a interfaceC14261a = e1.this.analyticsEngine;
            C2930u c2930u = C2930u.f1407a;
            String strL1 = e1.this.l1();
            String str = e1.this.cartId;
            pp.d dVar = e1.this.productMetadataStore;
            EntryChange entryChangeA3 = entryChange.a();
            if (entryChangeA3 != null && (entry = entryChangeA3.getEntry()) != null && (productFullDetailsM = entry.m()) != null) {
                code = productFullDetailsM.getCode();
            }
            interfaceC14261a.e(c2930u.l0(strL1, str, dVar.c(code), (Qo.l) e1.this.g1().getValue(), entryChange, e1.this.sponsorshipsDataStore, cVarA1, e1.this.getCouponList(entryChange.a()), entryUnitPrice, e1.this.j1(productCode), true, true, numValueOf2, String.valueOf(((ViewState) e1.this._viewState.getValue()).getCartDecorator().getItemCount()), "lowStock", "mPerks: Earn"));
        }

        private final void f(AbstractC17302a processedRequest, tk.c<EntryChange> entryChange, String productCode) {
            if (entryChange instanceof c.Failure) {
                C16648k.d(androidx.view.d0.a(e1.this), null, null, new m(e1.this, null), 3, null);
            }
            if (e1.this.e2(entryChange)) {
                uw.a.INSTANCE.a("Not emitting Event.CartUpdateSuccessEvent because we show free snackbar from cart update", new Object[0]);
            } else {
                C16648k.d(androidx.view.d0.a(e1.this), null, null, new n(e1.this, entryChange, null), 3, null);
            }
            EntryChange entryChangeA = entryChange.a();
            if (entryChangeA != null) {
                e1 e1Var = e1.this;
                int i10 = a.$EnumSwitchMapping$0[entryChangeA.getStatusCode().ordinal()];
                if (i10 != 1 && i10 != 2) {
                    if (i10 != 3) {
                        return;
                    }
                    C16648k.d(androidx.view.d0.a(e1Var), null, null, new o(e1Var, null), 3, null);
                    return;
                }
                e1Var.e2(entryChange);
                if (entryChangeA.getExpectedQuantityChange() < 0.0d) {
                    e(entryChange, b(processedRequest), productCode);
                } else if (entryChangeA.getExpectedQuantityChange() > 0.0d) {
                    d(false, entryChange, b(processedRequest), productCode);
                }
            }
        }

        @Override // wr.InterfaceC17847a
        /* renamed from: getDisposable */
        public Nu.a getDisposables() {
            return e1.this.disposables;
        }

        @Override // wr.InterfaceC17847a
        public void observeCart(tk.c<ShoppingCart> cartResource) {
            Object value;
            if (e1.this.userManager.b() && cartResource != null) {
                e1 e1Var = e1.this;
                C16648k.d(androidx.view.d0.a(e1Var), null, null, new h(cartResource, e1Var, null), 3, null);
                InterfaceC17140B interfaceC17140B = e1Var._viewState;
                do {
                    value = interfaceC17140B.getValue();
                } while (!interfaceC17140B.e(value, ViewState.c((ViewState) value, null, null, null, null, null, null, null, null, null, null, cartResource.a(), null, null, false, null, null, null, null, 0, 0, false, false, null, null, null, 33553407, null).a()));
            }
        }

        @Override // wr.InterfaceC17847a
        public void processedRequest(AbstractC17302a processedRequest, tk.c<EntryChange> entryChange) {
            Intrinsics.j(processedRequest, "processedRequest");
            Intrinsics.j(entryChange, "entryChange");
            if (processedRequest instanceof AbstractC17302a.Add) {
                a(processedRequest, entryChange, processedRequest.getProductCode());
                return;
            }
            if (processedRequest instanceof AbstractC17302a.Update) {
                f(processedRequest, entryChange, processedRequest.getProductCode());
            } else if (processedRequest instanceof AbstractC17302a.Remove) {
                c(processedRequest, entryChange, processedRequest.getProductCode());
            } else if (!Intrinsics.e(processedRequest, AbstractC17302a.b.f163256b)) {
                throw new NoWhenBranchMatchedException();
            }
        }

        @Override // wr.InterfaceC17847a
        public <T> void throwChallenge(AbstractC17116a<AbstractC17604a, T> challenge) {
            Intrinsics.j(challenge, "challenge");
            if (!(challenge.f() instanceof AbstractC17604a.ChokingHazardChallenge)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC17604a abstractC17604aF = challenge.f();
            Intrinsics.h(abstractC17604aF, "null cannot be cast to non-null type com.meijer.mobile.ui.cart.challenges.CartChallenge.ChokingHazardChallenge");
            C16648k.d(androidx.view.d0.a(e1.this), null, null, new l(e1.this, (AbstractC17604a.ChokingHazardChallenge) abstractC17604aF, null), 3, null);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$m;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "resourceId", "Landroid/graphics/Rect;", "stepperHitRect", "", "loadingState", "<init>", "(Ljava/lang/String;Landroid/graphics/Rect;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Landroid/graphics/Rect;", "()Landroid/graphics/Rect;", "c", "Z", "getLoadingState", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$m, reason: case insensitive filesystem and from toString */
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

    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0017\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001aB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0017\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./01¨\u00062"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "", "<init>", "()V", "j", "k", "w", "g", "i", "l", "r", "m", "a", "c", "h", "u", "v", "s", "q", "t", "n", "o", "f", "b", "d", "p", "e", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$a;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$b;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$c;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$d;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$e;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$f;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$g;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$h;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$i;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$j;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$k;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$l;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$m;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$n;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$o;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$p;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$q;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$r;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$s;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$t;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$u;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$v;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$w;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n, reason: case insensitive filesystem */
    public static abstract class AbstractC12460n {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0007R\u0017\u0010\u0016\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$a;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmk/c;", "a", "Lmk/c;", "c", "()Lmk/c;", "product", "b", "I", "messageResId", "actionResId", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$a, reason: from toString */
        public static final /* data */ class AddToShoppingListSuccessEvent extends AbstractC12460n {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final mk.c product;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int actionResId;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AddToShoppingListSuccessEvent)) {
                    return false;
                }
                AddToShoppingListSuccessEvent addToShoppingListSuccessEvent = (AddToShoppingListSuccessEvent) other;
                return Intrinsics.e(this.product, addToShoppingListSuccessEvent.product) && this.messageResId == addToShoppingListSuccessEvent.messageResId && this.actionResId == addToShoppingListSuccessEvent.actionResId;
            }

            public int hashCode() {
                return (((this.product.hashCode() * 31) + Integer.hashCode(this.messageResId)) * 31) + Integer.hashCode(this.actionResId);
            }

            public String toString() {
                return "AddToShoppingListSuccessEvent(product=" + this.product + ", messageResId=" + this.messageResId + ", actionResId=" + this.actionResId + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getActionResId() {
                return this.actionResId;
            }

            /* renamed from: b, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }

            /* renamed from: c, reason: from getter */
            public final mk.c getProduct() {
                return this.product;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$b;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "LQo/l$k;", "query", "<init>", "(LQo/l$k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LQo/l$k;", "()LQo/l$k;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$b, reason: from toString */
        public static final /* data */ class BubbleFacetsToFilterAndSort extends AbstractC12460n {

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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$c;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "", "messageResId", "actionResId", "Lej/i;", "entry", "<init>", "(IILej/i;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "Lej/i;", "getEntry", "()Lej/i;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$c, reason: from toString */
        public static final /* data */ class CartUpdateSuccessEvent extends AbstractC12460n {

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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$d;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "", "titleResId", "messageResId", "positiveButtonResId", "negativeButtonResId", "LOk/a;", "coupon", "<init>", "(IIIILOk/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "e", "b", "c", "d", "LOk/a;", "()LOk/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$d, reason: from toString */
        public static final /* data */ class ClipCouponFailedEvent extends AbstractC12460n {

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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$e;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$e */
        public static final /* data */ class e extends AbstractC12460n {

            /* renamed from: a, reason: collision with root package name */
            public static final e f111343a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public int hashCode() {
                return -499328637;
            }

            public String toString() {
                return "DismissFreeItemsSnackbar";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$f;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "LQo/l;", "query", "<init>", "(LQo/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LQo/l;", "()LQo/l;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$f, reason: from toString */
        public static final /* data */ class LaunchFilterAndSortEvent extends AbstractC12460n {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Qo.l query;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof LaunchFilterAndSortEvent) && Intrinsics.e(this.query, ((LaunchFilterAndSortEvent) other).query);
            }

            public int hashCode() {
                return this.query.hashCode();
            }

            public String toString() {
                return "LaunchFilterAndSortEvent(query=" + this.query + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LaunchFilterAndSortEvent(Qo.l query) {
                super(null);
                Intrinsics.j(query, "query");
                this.query = query;
            }

            /* renamed from: a, reason: from getter */
            public final Qo.l getQuery() {
                return this.query;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$g;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$g */
        public static final /* data */ class g extends AbstractC12460n {

            /* renamed from: a, reason: collision with root package name */
            public static final g f111345a = new g();

            private g() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof g);
            }

            public int hashCode() {
                return 1894450010;
            }

            public String toString() {
                return "NavigateToCartEvent";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$h;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "Lvs/b;", "decorator", "<init>", "(Lvs/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvs/b;", "()Lvs/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$h, reason: from toString */
        public static final /* data */ class OpenLowStockScreenEvent extends AbstractC12460n {

            /* renamed from: b, reason: collision with root package name */
            public static final int f111346b = CartProductListDecorator.f164957s;

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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$i;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$i */
        public static final /* data */ class i extends AbstractC12460n {

            /* renamed from: a, reason: collision with root package name */
            public static final i f111348a = new i();

            private i() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof i);
            }

            public int hashCode() {
                return 348589674;
            }

            public String toString() {
                return "ProactiveSubstituteSuccess";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$j;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "a", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "()Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "retrofitException", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$j, reason: from toString */
        public static final /* data */ class ProductListErrorEvent extends AbstractC12460n {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final RetrofitException retrofitException;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ProductListErrorEvent) && Intrinsics.e(this.retrofitException, ((ProductListErrorEvent) other).retrofitException);
            }

            public int hashCode() {
                return this.retrofitException.hashCode();
            }

            public String toString() {
                return "ProductListErrorEvent(retrofitException=" + this.retrofitException + ')';
            }

            /* renamed from: a, reason: from getter */
            public final RetrofitException getRetrofitException() {
                return this.retrofitException;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$k;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "messageResId", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$k, reason: from toString */
        public static final /* data */ class ProductListSuccess extends AbstractC12460n {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ProductListSuccess) && this.messageResId == ((ProductListSuccess) other).messageResId;
            }

            public int hashCode() {
                return Integer.hashCode(this.messageResId);
            }

            public String toString() {
                return "ProductListSuccess(messageResId=" + this.messageResId + ')';
            }

            /* renamed from: a, reason: from getter */
            public final int getMessageResId() {
                return this.messageResId;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$l;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$l */
        public static final /* data */ class l extends AbstractC12460n {

            /* renamed from: a, reason: collision with root package name */
            public static final l f111351a = new l();

            private l() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof l);
            }

            public int hashCode() {
                return 180265340;
            }

            public String toString() {
                return "ReactiveSubstituteSuccess";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u0007R\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$m;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "messageResId", "b", "titleResId", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$m, reason: from toString */
        public static final /* data */ class ShoppingListUpdateFailedEvent extends AbstractC12460n {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final int messageResId;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int titleResId;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShoppingListUpdateFailedEvent)) {
                    return false;
                }
                ShoppingListUpdateFailedEvent shoppingListUpdateFailedEvent = (ShoppingListUpdateFailedEvent) other;
                return this.messageResId == shoppingListUpdateFailedEvent.messageResId && this.titleResId == shoppingListUpdateFailedEvent.titleResId;
            }

            public int hashCode() {
                return (Integer.hashCode(this.messageResId) * 31) + Integer.hashCode(this.titleResId);
            }

            public String toString() {
                return "ShoppingListUpdateFailedEvent(messageResId=" + this.messageResId + ", titleResId=" + this.titleResId + ')';
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

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$n;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "LIr/a;", "Lur/a;", "dialogInfo", "<init>", "(LIr/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIr/a;", "()LIr/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$n, reason: collision with other inner class name and from toString */
        public static final /* data */ class ShowChokingWarningDialogEvent extends AbstractC12460n {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final UserActionDialogInfo<AbstractC17302a> dialogInfo;

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
            public ShowChokingWarningDialogEvent(UserActionDialogInfo<AbstractC17302a> dialogInfo) {
                super(null);
                Intrinsics.j(dialogInfo, "dialogInfo");
                this.dialogInfo = dialogInfo;
            }

            public final UserActionDialogInfo<AbstractC17302a> a() {
                return this.dialogInfo;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$o;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "Lak/a;", "title", "message", "positiveButtonText", "<init>", "(Lak/a;Lak/a;Lak/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "c", "()Lak/a;", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$o, reason: from toString */
        public static final /* data */ class ShowError extends AbstractC12460n {

            /* renamed from: d, reason: collision with root package name */
            public static final int f111355d = AbstractC5607a.f45514b;

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
            public ShowError(AbstractC5607a title, AbstractC5607a message, AbstractC5607a positiveButtonText) {
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
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$p;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "Lak/a;", "message", "<init>", "(Lak/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "()Lak/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$p, reason: from toString */
        public static final /* data */ class ShowFreeItemsSnackbar extends AbstractC12460n {

            /* renamed from: b, reason: collision with root package name */
            public static final int f111359b = AbstractC5607a.f45514b;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final AbstractC5607a message;

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
            public ShowFreeItemsSnackbar(AbstractC5607a message) {
                super(null);
                Intrinsics.j(message, "message");
                this.message = message;
            }

            /* renamed from: a, reason: from getter */
            public final AbstractC5607a getMessage() {
                return this.message;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$q;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "LCo/h;", "product", "<init>", "(LCo/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$q, reason: from toString */
        public static final /* data */ class ShowPlpEvent extends AbstractC12460n {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ProductFullDetails product;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowPlpEvent) && Intrinsics.e(this.product, ((ShowPlpEvent) other).product);
            }

            public int hashCode() {
                return this.product.hashCode();
            }

            public String toString() {
                return "ShowPlpEvent(product=" + this.product + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowPlpEvent(ProductFullDetails product) {
                super(null);
                Intrinsics.j(product, "product");
                this.product = product;
            }

            /* renamed from: a, reason: from getter */
            public final ProductFullDetails getProduct() {
                return this.product;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$r;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "", "messageResId", "titleResId", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$r, reason: from toString */
        public static final /* data */ class SubstitutionFailureEvent extends AbstractC12460n {

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

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$s;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "", "totalProductCount", "", "firstProductName", "outOfStockList", "lowStockList", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "Ljava/lang/String;", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$s, reason: from toString */
        public static final /* data */ class UpdateProductsInfoEvent extends AbstractC12460n {

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

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$t;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "", "messageResId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$t, reason: from toString */
        public static final /* data */ class UpdateToCartFailedEvent extends AbstractC12460n {

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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$u;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmk/f;", "a", "Lmk/f;", "()Lmk/f;", "product", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$u, reason: from toString */
        public static final /* data */ class ViewItemInShoppingListEvent extends AbstractC12460n {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final mk.f product;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ViewItemInShoppingListEvent) && Intrinsics.e(this.product, ((ViewItemInShoppingListEvent) other).product);
            }

            public int hashCode() {
                return this.product.hashCode();
            }

            public String toString() {
                return "ViewItemInShoppingListEvent(product=" + this.product + ')';
            }

            /* renamed from: a, reason: from getter */
            public final mk.f getProduct() {
                return this.product;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$v;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "LCo/h;", "product", "<init>", "(LCo/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$v, reason: from toString */
        public static final /* data */ class ViewProductDetailsEvent extends AbstractC12460n {

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

            /* renamed from: a, reason: from getter */
            public final ProductFullDetails getProduct() {
                return this.product;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$w;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$w */
        public static final /* data */ class w extends AbstractC12460n {

            /* renamed from: a, reason: collision with root package name */
            public static final w f111371a = new w();

            private w() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof w);
            }

            public int hashCode() {
                return 341556059;
            }

            public String toString() {
                return "ViewShoppingListEvent";
            }
        }

        public /* synthetic */ AbstractC12460n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC12460n() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0011\u0010\u001b\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$o;", "", "", "searchTerm", "spellSuggestionTerm", "", "noResultVisibility", "suggestionVisibility", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSearchTerm", "b", "c", "I", "d", "Lak/a;", "()Lak/a;", "noResultSearchMessage", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$o, reason: case insensitive filesystem and from toString */
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

        public final AbstractC5607a a() {
            return AbstractC5607a.INSTANCE.d(C18301b.f171284j, this.searchTerm);
        }

        /* renamed from: b, reason: from getter */
        public final int getNoResultVisibility() {
            return this.noResultVisibility;
        }

        /* renamed from: c, reason: from getter */
        public final String getSpellSuggestionTerm() {
            return this.spellSuggestionTerm;
        }

        /* renamed from: d, reason: from getter */
        public final int getSuggestionVisibility() {
            return this.suggestionVisibility;
        }

        public /* synthetic */ NoResultDecorator(String str, String str2, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? 4 : i10, (i12 & 8) != 0 ? 4 : i11);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$p;", "", "", "", "placementPositions", "", "Lvs/f;", "itemList", "sponsoredProducts", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getPlacementPositions", "()Ljava/util/List;", "b", "Ljava/util/Map;", "getItemList", "()Ljava/util/Map;", "c", "getSponsoredProducts", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$p, reason: from toString */
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

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bK\b\u0087\b\u0018\u00002\u00020\u0001BÁ\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b\u0012\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u000b\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b\u0012\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b\u0012\b\b\u0002\u0010$\u001a\u00020#\u0012\b\b\u0002\u0010%\u001a\u00020#\u0012\b\b\u0002\u0010&\u001a\u00020\u001d\u0012\b\b\u0002\u0010'\u001a\u00020\u001d\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010(¢\u0006\u0004\b,\u0010-J\u001b\u0010/\u001a\u0004\u0018\u00010\u00062\b\u0010.\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u0000¢\u0006\u0004\b1\u00102JÎ\u0002\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b2\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020\u001d2\b\b\u0002\u0010'\u001a\u00020\u001d2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010(HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020#HÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010:\u001a\u00020\u001d2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bG\u0010ER\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001f\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b8\u0006¢\u0006\f\n\u0004\bP\u0010M\u001a\u0004\bL\u0010OR'\u0010\u0012\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00108\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bP\u0010SR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bJ\u0010d\u001a\u0004\bF\u0010eR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\b`\u0010hR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b8\u0006¢\u0006\f\n\u0004\bZ\u0010M\u001a\u0004\bH\u0010OR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u000b8\u0006¢\u0006\f\n\u0004\b@\u0010M\u001a\u0004\bi\u0010OR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b8\u0006¢\u0006\f\n\u0004\bN\u0010M\u001a\u0004\bj\u0010OR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b8\u0006¢\u0006\f\n\u0004\b^\u0010M\u001a\u0004\bk\u0010OR\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u00108R\u0017\u0010%\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bk\u0010m\u001a\u0004\bQ\u00108R\u0017\u0010&\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\bD\u0010g\u001a\u0004\bl\u0010hR\u0017\u0010'\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b/\u0010g\u001a\u0004\bf\u0010hR\u0019\u0010)\u001a\u0004\u0018\u00010(8\u0006¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bT\u0010pR\u0019\u0010*\u001a\u0004\u0018\u00010(8\u0006¢\u0006\f\n\u0004\bq\u0010o\u001a\u0004\bX\u0010pR\u0019\u0010+\u001a\u0004\u0018\u00010(8\u0006¢\u0006\f\n\u0004\bi\u0010o\u001a\u0004\b\\\u0010pR\u0011\u0010r\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bq\u00108¨\u0006s"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$q;", "", "LTq/k;", "storeDetails", "LQo/l;", "productQuery", "Lak/a;", "title", "recommendationCarouselTitle", "LOj/a;", "loadingState", "", "Lvs/f;", "products", "LXk/c;", "couponsStateList", "", "", "couponsStateMap", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$p;", "sponsoredProductsWrapper", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$o;", "noProductResult", "Lej/C;", "shoppingCart", "Lij/c;", "nextFulfillmentSlot", "Lhk/a;", "cartDecorator", "", "itemSelected", "clickBeaconsSent", "viewBeaconsSent", "loadBeaconsSent", "stepperBeaconsSent", "", "tokenMatch", "embeddingsMatch", "shouldShowZeroResults", "lowStockBackupTracked", "Lfi/d;", "googleAdSlot1", "googleAdSlot2", "googleAdSlot3", "<init>", "(LTq/k;LQo/l;Lak/a;Lak/a;LOj/a;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$p;Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$o;Lej/C;Lij/c;Lhk/a;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;IIZZLfi/d;Lfi/d;Lfi/d;)V", "query", "v", "(LQo/l;)Lak/a;", "a", "()Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$q;", "b", "(LTq/k;LQo/l;Lak/a;Lak/a;LOj/a;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$p;Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$o;Lej/C;Lij/c;Lhk/a;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;IIZZLfi/d;Lfi/d;Lfi/d;)Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$q;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LTq/k;", "getStoreDetails", "()LTq/k;", "LQo/l;", "p", "()LQo/l;", "c", "Lak/a;", "u", "()Lak/a;", "d", "getRecommendationCarouselTitle", "e", "LOj/a;", "m", "()LOj/a;", "f", "Ljava/util/List;", "q", "()Ljava/util/List;", "g", "h", "Ljava/util/Map;", "()Ljava/util/Map;", "i", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$p;", "getSponsoredProductsWrapper", "()Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$p;", "j", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$o;", "o", "()Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$o;", "k", "Lej/C;", "r", "()Lej/C;", "l", "Lij/c;", "getNextFulfillmentSlot", "()Lij/c;", "Lhk/a;", "()Lhk/a;", "n", "Z", "()Z", "y", "getLoadBeaconsSent", "t", "s", "I", "w", "Lfi/d;", "()Lfi/d;", "x", "totalCount", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$q, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Tq.k storeDetails;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Qo.l productQuery;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a title;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a recommendationCarouselTitle;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Oj.a loadingState;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ProductListDecorator> products;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<CouponState> couponsStateList;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, CouponState> couponsStateMap;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final SponsoredProductsWrapper sponsoredProductsWrapper;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final NoResultDecorator noProductResult;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final ShoppingCart shoppingCart;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final FulfillmentSlot nextFulfillmentSlot;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final CartPreviewDecorator cartDecorator;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean itemSelected;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> clickBeaconsSent;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> viewBeaconsSent;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> loadBeaconsSent;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> stepperBeaconsSent;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final int tokenMatch;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final int embeddingsMatch;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldShowZeroResults;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean lowStockBackupTracked;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final GoogleAdData googleAdSlot1;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private final GoogleAdData googleAdSlot2;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        private final GoogleAdData googleAdSlot3;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$q$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[mk.d.values().length];
                try {
                    iArr[mk.d.f150120a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[mk.d.f150121b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public ViewState(Tq.k storeDetails, Qo.l productQuery, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, Oj.a loadingState, List<ProductListDecorator> products, List<CouponState> couponsStateList, Map<String, CouponState> couponsStateMap, SponsoredProductsWrapper sponsoredProductsWrapper, NoResultDecorator noProductResult, ShoppingCart shoppingCart, FulfillmentSlot fulfillmentSlot, CartPreviewDecorator cartDecorator, boolean z10, List<String> clickBeaconsSent, List<String> viewBeaconsSent, List<String> loadBeaconsSent, List<String> stepperBeaconsSent, int i10, int i11, boolean z11, boolean z12, GoogleAdData googleAdData, GoogleAdData googleAdData2, GoogleAdData googleAdData3) {
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
            this.storeDetails = storeDetails;
            this.productQuery = productQuery;
            this.title = abstractC5607a;
            this.recommendationCarouselTitle = abstractC5607a2;
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
            this.tokenMatch = i10;
            this.embeddingsMatch = i11;
            this.shouldShowZeroResults = z11;
            this.lowStockBackupTracked = z12;
            this.googleAdSlot1 = googleAdData;
            this.googleAdSlot2 = googleAdData2;
            this.googleAdSlot3 = googleAdData3;
        }

        public static /* synthetic */ ViewState c(ViewState viewState, Tq.k kVar, Qo.l lVar, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, Oj.a aVar, List list, List list2, Map map, SponsoredProductsWrapper sponsoredProductsWrapper, NoResultDecorator noResultDecorator, ShoppingCart shoppingCart, FulfillmentSlot fulfillmentSlot, CartPreviewDecorator cartPreviewDecorator, boolean z10, List list3, List list4, List list5, List list6, int i10, int i11, boolean z11, boolean z12, GoogleAdData googleAdData, GoogleAdData googleAdData2, GoogleAdData googleAdData3, int i12, Object obj) {
            GoogleAdData googleAdData4;
            GoogleAdData googleAdData5;
            Tq.k kVar2 = (i12 & 1) != 0 ? viewState.storeDetails : kVar;
            Qo.l lVar2 = (i12 & 2) != 0 ? viewState.productQuery : lVar;
            AbstractC5607a abstractC5607a3 = (i12 & 4) != 0 ? viewState.title : abstractC5607a;
            AbstractC5607a abstractC5607a4 = (i12 & 8) != 0 ? viewState.recommendationCarouselTitle : abstractC5607a2;
            Oj.a aVar2 = (i12 & 16) != 0 ? viewState.loadingState : aVar;
            List list7 = (i12 & 32) != 0 ? viewState.products : list;
            List list8 = (i12 & 64) != 0 ? viewState.couponsStateList : list2;
            Map map2 = (i12 & 128) != 0 ? viewState.couponsStateMap : map;
            SponsoredProductsWrapper sponsoredProductsWrapper2 = (i12 & 256) != 0 ? viewState.sponsoredProductsWrapper : sponsoredProductsWrapper;
            NoResultDecorator noResultDecorator2 = (i12 & 512) != 0 ? viewState.noProductResult : noResultDecorator;
            ShoppingCart shoppingCart2 = (i12 & 1024) != 0 ? viewState.shoppingCart : shoppingCart;
            FulfillmentSlot fulfillmentSlot2 = (i12 & RecyclerView.m.FLAG_MOVED) != 0 ? viewState.nextFulfillmentSlot : fulfillmentSlot;
            CartPreviewDecorator cartPreviewDecorator2 = (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? viewState.cartDecorator : cartPreviewDecorator;
            boolean z13 = (i12 & 8192) != 0 ? viewState.itemSelected : z10;
            Tq.k kVar3 = kVar2;
            List list9 = (i12 & 16384) != 0 ? viewState.clickBeaconsSent : list3;
            List list10 = (i12 & 32768) != 0 ? viewState.viewBeaconsSent : list4;
            List list11 = (i12 & 65536) != 0 ? viewState.loadBeaconsSent : list5;
            List list12 = (i12 & 131072) != 0 ? viewState.stepperBeaconsSent : list6;
            int i13 = (i12 & 262144) != 0 ? viewState.tokenMatch : i10;
            int i14 = (i12 & 524288) != 0 ? viewState.embeddingsMatch : i11;
            boolean z14 = (i12 & 1048576) != 0 ? viewState.shouldShowZeroResults : z11;
            boolean z15 = (i12 & 2097152) != 0 ? viewState.lowStockBackupTracked : z12;
            GoogleAdData googleAdData6 = (i12 & 4194304) != 0 ? viewState.googleAdSlot1 : googleAdData;
            GoogleAdData googleAdData7 = (i12 & 8388608) != 0 ? viewState.googleAdSlot2 : googleAdData2;
            if ((i12 & 16777216) != 0) {
                googleAdData5 = googleAdData7;
                googleAdData4 = viewState.googleAdSlot3;
            } else {
                googleAdData4 = googleAdData3;
                googleAdData5 = googleAdData7;
            }
            return viewState.b(kVar3, lVar2, abstractC5607a3, abstractC5607a4, aVar2, list7, list8, map2, sponsoredProductsWrapper2, noResultDecorator2, shoppingCart2, fulfillmentSlot2, cartPreviewDecorator2, z13, list9, list10, list11, list12, i13, i14, z14, z15, googleAdData6, googleAdData5, googleAdData4);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.storeDetails, viewState.storeDetails) && Intrinsics.e(this.productQuery, viewState.productQuery) && Intrinsics.e(this.title, viewState.title) && Intrinsics.e(this.recommendationCarouselTitle, viewState.recommendationCarouselTitle) && Intrinsics.e(this.loadingState, viewState.loadingState) && Intrinsics.e(this.products, viewState.products) && Intrinsics.e(this.couponsStateList, viewState.couponsStateList) && Intrinsics.e(this.couponsStateMap, viewState.couponsStateMap) && Intrinsics.e(this.sponsoredProductsWrapper, viewState.sponsoredProductsWrapper) && Intrinsics.e(this.noProductResult, viewState.noProductResult) && Intrinsics.e(this.shoppingCart, viewState.shoppingCart) && Intrinsics.e(this.nextFulfillmentSlot, viewState.nextFulfillmentSlot) && Intrinsics.e(this.cartDecorator, viewState.cartDecorator) && this.itemSelected == viewState.itemSelected && Intrinsics.e(this.clickBeaconsSent, viewState.clickBeaconsSent) && Intrinsics.e(this.viewBeaconsSent, viewState.viewBeaconsSent) && Intrinsics.e(this.loadBeaconsSent, viewState.loadBeaconsSent) && Intrinsics.e(this.stepperBeaconsSent, viewState.stepperBeaconsSent) && this.tokenMatch == viewState.tokenMatch && this.embeddingsMatch == viewState.embeddingsMatch && this.shouldShowZeroResults == viewState.shouldShowZeroResults && this.lowStockBackupTracked == viewState.lowStockBackupTracked && Intrinsics.e(this.googleAdSlot1, viewState.googleAdSlot1) && Intrinsics.e(this.googleAdSlot2, viewState.googleAdSlot2) && Intrinsics.e(this.googleAdSlot3, viewState.googleAdSlot3);
        }

        public int hashCode() {
            int iHashCode = ((this.storeDetails.hashCode() * 31) + this.productQuery.hashCode()) * 31;
            AbstractC5607a abstractC5607a = this.title;
            int iHashCode2 = (iHashCode + (abstractC5607a == null ? 0 : abstractC5607a.hashCode())) * 31;
            AbstractC5607a abstractC5607a2 = this.recommendationCarouselTitle;
            int iHashCode3 = (((((((((((((iHashCode2 + (abstractC5607a2 == null ? 0 : abstractC5607a2.hashCode())) * 31) + this.loadingState.hashCode()) * 31) + this.products.hashCode()) * 31) + this.couponsStateList.hashCode()) * 31) + this.couponsStateMap.hashCode()) * 31) + this.sponsoredProductsWrapper.hashCode()) * 31) + this.noProductResult.hashCode()) * 31;
            ShoppingCart shoppingCart = this.shoppingCart;
            int iHashCode4 = (iHashCode3 + (shoppingCart == null ? 0 : shoppingCart.hashCode())) * 31;
            FulfillmentSlot fulfillmentSlot = this.nextFulfillmentSlot;
            int iHashCode5 = (((((((((((((((((((((iHashCode4 + (fulfillmentSlot == null ? 0 : fulfillmentSlot.hashCode())) * 31) + this.cartDecorator.hashCode()) * 31) + Boolean.hashCode(this.itemSelected)) * 31) + this.clickBeaconsSent.hashCode()) * 31) + this.viewBeaconsSent.hashCode()) * 31) + this.loadBeaconsSent.hashCode()) * 31) + this.stepperBeaconsSent.hashCode()) * 31) + Integer.hashCode(this.tokenMatch)) * 31) + Integer.hashCode(this.embeddingsMatch)) * 31) + Boolean.hashCode(this.shouldShowZeroResults)) * 31) + Boolean.hashCode(this.lowStockBackupTracked)) * 31;
            GoogleAdData googleAdData = this.googleAdSlot1;
            int iHashCode6 = (iHashCode5 + (googleAdData == null ? 0 : googleAdData.hashCode())) * 31;
            GoogleAdData googleAdData2 = this.googleAdSlot2;
            int iHashCode7 = (iHashCode6 + (googleAdData2 == null ? 0 : googleAdData2.hashCode())) * 31;
            GoogleAdData googleAdData3 = this.googleAdSlot3;
            return iHashCode7 + (googleAdData3 != null ? googleAdData3.hashCode() : 0);
        }

        public String toString() {
            return "ViewState(storeDetails=" + this.storeDetails + ", productQuery=" + this.productQuery + ", title=" + this.title + ", recommendationCarouselTitle=" + this.recommendationCarouselTitle + ", loadingState=" + this.loadingState + ", products=" + this.products + ", couponsStateList=" + this.couponsStateList + ", couponsStateMap=" + this.couponsStateMap + ", sponsoredProductsWrapper=" + this.sponsoredProductsWrapper + ", noProductResult=" + this.noProductResult + ", shoppingCart=" + this.shoppingCart + ", nextFulfillmentSlot=" + this.nextFulfillmentSlot + ", cartDecorator=" + this.cartDecorator + ", itemSelected=" + this.itemSelected + ", clickBeaconsSent=" + this.clickBeaconsSent + ", viewBeaconsSent=" + this.viewBeaconsSent + ", loadBeaconsSent=" + this.loadBeaconsSent + ", stepperBeaconsSent=" + this.stepperBeaconsSent + ", tokenMatch=" + this.tokenMatch + ", embeddingsMatch=" + this.embeddingsMatch + ", shouldShowZeroResults=" + this.shouldShowZeroResults + ", lowStockBackupTracked=" + this.lowStockBackupTracked + ", googleAdSlot1=" + this.googleAdSlot1 + ", googleAdSlot2=" + this.googleAdSlot2 + ", googleAdSlot3=" + this.googleAdSlot3 + ')';
        }

        private final AbstractC5607a v(Qo.l query) {
            int i10;
            if ((query instanceof l.Search) || (query instanceof l.BrowseCollection)) {
                return null;
            }
            if (query instanceof l.Favorites) {
                return AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100406wi, new Object[0]);
            }
            if (query instanceof l.ShoppingList) {
                return AbstractC5607a.INSTANCE.d(Aq.b.f1477V, new Object[0]);
            }
            if (query instanceof l.Department) {
                return AbstractC5607a.INSTANCE.c(((l.Department) query).getDepartment().getName());
            }
            if (query instanceof l.Coupon) {
                return AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100002cd, new Object[0]);
            }
            if (query instanceof l.Reward) {
                return AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100002cd, new Object[0]);
            }
            if (query instanceof l.Recommendations) {
                return this.recommendationCarouselTitle;
            }
            if (!(query instanceof l.Personalized)) {
                if (query == null) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            int i11 = a.$EnumSwitchMapping$0[((l.Personalized) query).getCategory().ordinal()];
            if (i11 == 1) {
                i10 = com.meijer.mobile.meijer.Y.f99593H5;
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i10 = com.meijer.mobile.meijer.Y.f100288r0;
            }
            return AbstractC5607a.INSTANCE.d(i10, new Object[0]);
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
            return c(this, null, null, v(this.productQuery), this.recommendationCarouselTitle, null, null, null, null, null, new NoResultDecorator(term, spellingSuggestion, z10 ? 4 : 0, (z10 || (spellSuggestionTerm = this.noProductResult.getSpellSuggestionTerm()) == null || !(StringsKt.r0(spellSuggestionTerm) ^ true) || !this.products.isEmpty()) ? 4 : 0), null, null, null, false, null, null, null, null, 0, 0, false, false, null, null, null, 33553907, null);
        }

        public final ViewState b(Tq.k storeDetails, Qo.l productQuery, AbstractC5607a title, AbstractC5607a recommendationCarouselTitle, Oj.a loadingState, List<ProductListDecorator> products, List<CouponState> couponsStateList, Map<String, CouponState> couponsStateMap, SponsoredProductsWrapper sponsoredProductsWrapper, NoResultDecorator noProductResult, ShoppingCart shoppingCart, FulfillmentSlot nextFulfillmentSlot, CartPreviewDecorator cartDecorator, boolean itemSelected, List<String> clickBeaconsSent, List<String> viewBeaconsSent, List<String> loadBeaconsSent, List<String> stepperBeaconsSent, int tokenMatch, int embeddingsMatch, boolean shouldShowZeroResults, boolean lowStockBackupTracked, GoogleAdData googleAdSlot1, GoogleAdData googleAdSlot2, GoogleAdData googleAdSlot3) {
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
            return new ViewState(storeDetails, productQuery, title, recommendationCarouselTitle, loadingState, products, couponsStateList, couponsStateMap, sponsoredProductsWrapper, noProductResult, shoppingCart, nextFulfillmentSlot, cartDecorator, itemSelected, clickBeaconsSent, viewBeaconsSent, loadBeaconsSent, stepperBeaconsSent, tokenMatch, embeddingsMatch, shouldShowZeroResults, lowStockBackupTracked, googleAdSlot1, googleAdSlot2, googleAdSlot3);
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
        public final int getEmbeddingsMatch() {
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
        public final Oj.a getLoadingState() {
            return this.loadingState;
        }

        /* renamed from: n, reason: from getter */
        public final boolean getLowStockBackupTracked() {
            return this.lowStockBackupTracked;
        }

        /* renamed from: o, reason: from getter */
        public final NoResultDecorator getNoProductResult() {
            return this.noProductResult;
        }

        /* renamed from: p, reason: from getter */
        public final Qo.l getProductQuery() {
            return this.productQuery;
        }

        public final List<ProductListDecorator> q() {
            return this.products;
        }

        /* renamed from: r, reason: from getter */
        public final ShoppingCart getShoppingCart() {
            return this.shoppingCart;
        }

        /* renamed from: s, reason: from getter */
        public final boolean getShouldShowZeroResults() {
            return this.shouldShowZeroResults;
        }

        public final List<String> t() {
            return this.stepperBeaconsSent;
        }

        /* renamed from: u, reason: from getter */
        public final AbstractC5607a getTitle() {
            return this.title;
        }

        /* renamed from: w, reason: from getter */
        public final int getTokenMatch() {
            return this.tokenMatch;
        }

        public final int x() {
            Integer totalCount = this.productQuery.getTotalCount();
            return totalCount != null ? totalCount.intValue() : this.products.size();
        }

        public final List<String> y() {
            return this.viewBeaconsSent;
        }

        public /* synthetic */ ViewState(Tq.k kVar, Qo.l lVar, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, Oj.a aVar, List list, List list2, Map map, SponsoredProductsWrapper sponsoredProductsWrapper, NoResultDecorator noResultDecorator, ShoppingCart shoppingCart, FulfillmentSlot fulfillmentSlot, CartPreviewDecorator cartPreviewDecorator, boolean z10, List list3, List list4, List list5, List list6, int i10, int i11, boolean z11, boolean z12, GoogleAdData googleAdData, GoogleAdData googleAdData2, GoogleAdData googleAdData3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(kVar, lVar, (i12 & 4) != 0 ? null : abstractC5607a, (i12 & 8) != 0 ? null : abstractC5607a2, (i12 & 16) != 0 ? new a.Loading(BuildConfig.DEFAULT_ITEM_SECTION, null, 2, null) : aVar, (i12 & 32) != 0 ? CollectionsKt.m() : list, (i12 & 64) != 0 ? CollectionsKt.m() : list2, (i12 & 128) != 0 ? new LinkedHashMap() : map, (i12 & 256) != 0 ? new SponsoredProductsWrapper(null, null, null, 7, null) : sponsoredProductsWrapper, (i12 & 512) != 0 ? new NoResultDecorator(null, null, 0, 0, 15, null) : noResultDecorator, (i12 & 1024) != 0 ? null : shoppingCart, (i12 & RecyclerView.m.FLAG_MOVED) != 0 ? null : fulfillmentSlot, (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? new CartPreviewDecorator(false, 0, 3, null) : cartPreviewDecorator, (i12 & 8192) != 0 ? false : z10, (i12 & 16384) != 0 ? CollectionsKt.m() : list3, (32768 & i12) != 0 ? CollectionsKt.m() : list4, (65536 & i12) != 0 ? CollectionsKt.m() : list5, (131072 & i12) != 0 ? CollectionsKt.m() : list6, (262144 & i12) != 0 ? 0 : i10, (524288 & i12) != 0 ? 0 : i11, (1048576 & i12) != 0 ? false : z11, (2097152 & i12) != 0 ? false : z12, (4194304 & i12) != 0 ? null : googleAdData, (8388608 & i12) != 0 ? null : googleAdData2, (i12 & 16777216) != 0 ? null : googleAdData3);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class r {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[mk.d.values().length];
            try {
                iArr[mk.d.f150120a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mk.d.f150121b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$clipCoupon$2$1", f = "ProductsViewModel.kt", l = {HttpResponseStatus.ERROR_NOT_IMPLEMENTED}, m = "invokeSuspend")
    static final class s extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111404a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Coupon f111406c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e1.this.new s(this.f111406c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(Coupon coupon, Continuation<? super s> continuation) {
            super(2, continuation);
            this.f111406c = coupon;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((s) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111404a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = e1.this._event;
                AbstractC12460n.ClipCouponFailedEvent clipCouponFailedEvent = new AbstractC12460n.ClipCouponFailedEvent(Nr.g.f22746n, Nr.g.f22744m, com.meijer.mobile.meijer.Y.f99529Dh, Nr.g.f22708O, this.f111406c);
                this.f111404a = 1;
                if (interfaceC17139A.emit(clipCouponFailedEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
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
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$fetchCriteoSponsoredProducts$1", f = "ProductsViewModel.kt", l = {787}, m = "invokeSuspend")
    static final class u extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111407a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f111409c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Qo.l f111410d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e1.this.new u(this.f111409c, this.f111410d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(String str, Qo.l lVar, Continuation<? super u> continuation) {
            super(2, continuation);
            this.f111409c = str;
            this.f111410d = lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((u) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111407a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                sp.Y y10 = e1.this.productStateRepository;
                String str = this.f111409c;
                Qo.l lVar = this.f111410d;
                boolean z10 = lVar instanceof l.Department;
                String strA = Oo.a.a(lVar);
                this.f111407a = 1;
                if (y10.d1(str, z10, strA, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$handleViewShoppingList$1", f = "ProductsViewModel.kt", l = {1500}, m = "invokeSuspend")
    static final class v extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111411a;

        v(Continuation<? super v> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e1.this.new v(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((v) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111411a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = e1.this._event;
                AbstractC12460n.w wVar = AbstractC12460n.w.f111371a;
                this.f111411a = 1;
                if (interfaceC17139A.emit(wVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$itemSelected$4", f = "ProductsViewModel.kt", l = {358}, m = "invokeSuspend")
    static final class w extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111413a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ProductCardDecorator f111415c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e1.this.new w(this.f111415c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(ProductCardDecorator productCardDecorator, Continuation<? super w> continuation) {
            super(2, continuation);
            this.f111415c = productCardDecorator;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((w) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111413a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = e1.this._event;
                AbstractC12460n.ShowPlpEvent showPlpEvent = new AbstractC12460n.ShowPlpEvent(this.f111415c.getProduct());
                this.f111413a = 1;
                if (interfaceC17139A.emit(showPlpEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$launchFilterAndSortActivity$1", f = "ProductsViewModel.kt", l = {1426}, m = "invokeSuspend")
    static final class x extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111416a;

        x(Continuation<? super x> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e1.this.new x(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((x) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111416a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = e1.this._event;
                AbstractC12460n.LaunchFilterAndSortEvent launchFilterAndSortEvent = new AbstractC12460n.LaunchFilterAndSortEvent((Qo.l) e1.this.g1().getValue());
                this.f111416a = 1;
                if (interfaceC17139A.emit(launchFilterAndSortEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$loadProducts$1", f = "ProductsViewModel.kt", l = {1531, 1556}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class y extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f111418a;

        /* renamed from: b, reason: collision with root package name */
        Object f111419b;

        /* renamed from: c, reason: collision with root package name */
        Object f111420c;

        /* renamed from: d, reason: collision with root package name */
        Object f111421d;

        /* renamed from: e, reason: collision with root package name */
        Object f111422e;

        /* renamed from: f, reason: collision with root package name */
        Object f111423f;

        /* renamed from: g, reason: collision with root package name */
        Object f111424g;

        /* renamed from: h, reason: collision with root package name */
        Object f111425h;

        /* renamed from: i, reason: collision with root package name */
        Object f111426i;

        /* renamed from: j, reason: collision with root package name */
        Object f111427j;

        /* renamed from: k, reason: collision with root package name */
        int f111428k;

        /* renamed from: l, reason: collision with root package name */
        int f111429l;

        /* renamed from: m, reason: collision with root package name */
        int f111430m;

        /* renamed from: n, reason: collision with root package name */
        int f111431n;

        /* renamed from: o, reason: collision with root package name */
        int f111432o;

        /* renamed from: p, reason: collision with root package name */
        int f111433p;

        /* renamed from: q, reason: collision with root package name */
        int f111434q;

        /* renamed from: r, reason: collision with root package name */
        int f111435r;

        /* renamed from: s, reason: collision with root package name */
        int f111436s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f111437t;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ Qo.l f111439v;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            y yVar = e1.this.new y(this.f111439v, continuation);
            yVar.f111437t = obj;
            return yVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(Qo.l lVar, Continuation<? super y> continuation) {
            super(2, continuation);
            this.f111439v = lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((y) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:85:0x02a6  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x02b3  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r48) {
            /*
                Method dump skipped, instructions count: 781
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.personalized.modals.e1.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$navigateToCart$1", f = "ProductsViewModel.kt", l = {1338}, m = "invokeSuspend")
    static final class z extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111440a;

        z(Continuation<? super z> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e1.this.new z(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((z) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111440a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = e1.this._event;
                AbstractC12460n.g gVar = AbstractC12460n.g.f111345a;
                this.f111440a = 1;
                if (interfaceC17139A.emit(gVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    private final AbstractC5607a d1(int freeItemsCount, int rewardItemsCount) {
        return freeItemsCount != 0 ? freeItemsCount != 1 ? freeItemsCount != 2 ? freeItemsCount != 3 ? freeItemsCount != 4 ? freeItemsCount != 5 ? AbstractC5607a.INSTANCE.d(Nr.g.f22711R, new Object[0]) : AbstractC5607a.INSTANCE.d(Nr.g.f22706M, new Object[0]) : AbstractC5607a.INSTANCE.d(Nr.g.f22707N, new Object[0]) : AbstractC5607a.INSTANCE.d(Nr.g.f22769y0, new Object[0]) : AbstractC5607a.INSTANCE.d(Nr.g.f22771z0, new Object[0]) : AbstractC5607a.INSTANCE.d(Nr.g.f22718Y, new Object[0]) : AbstractC5607a.INSTANCE.b(Nr.f.f22683c, rewardItemsCount, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Ok.f> getCouponList(EntryChange entryChange) {
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
            Iterator<T> it2 = this.viewState.getValue().f().iterator();
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQo/l;", "it", "", "<anonymous>", "(LQo/l;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$6", f = "ProductsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$f, reason: case insensitive filesystem */
    static final class C12452f extends SuspendLambda implements Function2<Qo.l, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111223a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f111224b;

        C12452f(Continuation<? super C12452f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12452f c12452f = e1.this.new C12452f(continuation);
            c12452f.f111224b = obj;
            return c12452f;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Qo.l lVar, Continuation<? super Unit> continuation) {
            return ((C12452f) create(lVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f111223a == 0) {
                ResultKt.b(obj);
                e1.this.z1((Qo.l) this.f111224b);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public e1(Tq.j storeProvider, yo.k userManager, yl.k featureManager, sp.Y productStateRepository, hl.m cartRepository, Eq.b shoppingListRepository, wr.f cartInteractor, sl.h timeSlotRepository, C6412d couponsRepository, B0 productQueryPagingDataSource, InterfaceC14261a analyticsEngine, Ro.a productAnalytics, C16594b beaconClient, pp.e sponsorshipsDataStore, pp.d productMetadataStore, AbstractC16618K ioDispatcher) {
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
        this.queryStore = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.I0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e1.H1();
            }
        });
        this._toastMessageData = C17146H.b(0, 0, null, 7, null);
        InterfaceC17140B<Boolean> interfaceC17140BA = tv.S.a(Boolean.FALSE);
        this._stepperClicked = interfaceC17140BA;
        this.stepperClicked = interfaceC17140BA;
        this.adManagerProvider = new C12563s(featureManager, userManager);
        this.carouselTitle = "";
        this.trackingLoadBeacon = new ArrayList();
        this.trackingOnLoadFormatLevelBeacon = new ArrayList();
        this.trackingOnViewFormatLevelBeacon = new ArrayList();
        io.reactivex.l<Tq.k> lVarF = storeProvider.f();
        this.currentStoreStream = lVarF;
        this.cartId = "-1";
        Oj.c cVar = new Oj.c(CollectionsKt.e(new a.Loading(BuildConfig.DEFAULT_ITEM_SECTION, null, 2, null)));
        this.loadingStatesManager = cVar;
        Nu.a aVar = new Nu.a();
        this.disposables = aVar;
        InterfaceC17140B<ViewState> interfaceC17140BA2 = tv.S.a(new ViewState(storeProvider.a(), g1().getValue().a(), null, null, null, null, null, null, null, null, null, null, new CartPreviewDecorator(userManager.b(), 0), false, null, null, null, null, 0, 0, false, false, null, null, null, 33550332, null).a());
        this._viewState = interfaceC17140BA2;
        this.viewState = C17154h.c(interfaceC17140BA2);
        this.paginator = new Paginator(0, 0, 0, 0, false, 31, null);
        this._event = C17146H.b(0, 0, null, 7, null);
        Delegates delegates = Delegates.f142874a;
        this.productInQtyStepperInteraction = new K(null, this);
        this.resetStepperState = new L(null, this);
        C17154h.J(C17154h.g(C17154h.O(cVar.a(), new C12448b(this)), new C12449c(null)), androidx.view.d0.a(this));
        w1();
        io.reactivex.l<List<ProductState<ProductFullDetails>>> lVarSubscribeOn = productStateRepository.Y0().subscribeOn(C14764a.b());
        final C12450d c12450d = new C12450d(this);
        Pu.g<? super List<ProductState<ProductFullDetails>>> gVar = new Pu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.J0
            @Override // Pu.g
            public final void accept(Object obj) {
                e1.P(c12450d, obj);
            }
        };
        a.Companion companion = uw.a.INSTANCE;
        final C12451e c12451e = new C12451e(companion);
        Ck.a.a(lVarSubscribeOn.subscribe(gVar, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.K0
            @Override // Pu.g
            public final void accept(Object obj) {
                c12451e.invoke(obj);
            }
        }), aVar);
        C17154h.J(C17154h.g(C17154h.O(C17154h.s(C17154h.c(g1()), new Function2() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.L0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(e1.Q((Qo.l) obj, (Qo.l) obj2));
            }
        }), new C12452f(null)), new C12453g(null)), androidx.view.d0.a(this));
        io.reactivex.l<Tq.k> lVarSubscribeOn2 = lVarF.distinctUntilChanged().subscribeOn(C14764a.b());
        final C12454h c12454h = new C12454h(this);
        Pu.g<? super Tq.k> gVar2 = new Pu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.M0
            @Override // Pu.g
            public final void accept(Object obj) {
                e1.R(c12454h, obj);
            }
        };
        final C12455i c12455i = new C12455i(companion);
        Ck.a.a(lVarSubscribeOn2.subscribe(gVar2, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.O0
            @Override // Pu.g
            public final void accept(Object obj) {
                e1.S(c12455i, obj);
            }
        }), aVar);
        fetchAllCoupons();
        if (featureManager.e(AbstractC18227f.C18233g.f170578h)) {
            C16648k.d(androidx.view.d0.a(this), null, null, new C12447a(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A1(List<ProductState<ProductFullDetails>> productStates) {
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
        String strB0 = CollectionsKt.B0(arrayList2, ", ", null, null, 0, null, new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.U0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return e1.B1((ProductState) obj2);
            }
        }, 30, null);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            if (((ProductFullDetails) ((ProductState) obj2).g()).getStockInfo().c()) {
                arrayList3.add(obj2);
            }
        }
        C16648k.d(androidx.view.d0.a(this), null, null, new C(productStates, strB0, CollectionsKt.B0(arrayList3, ", ", null, null, 0, null, new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.V0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return e1.C1((ProductState) obj3);
            }
        }, 30, null), null), 3, null);
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            viewState = value;
            kVarA = this.storeProvider.a();
            arrayList = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ProductState c16993b = (ProductState) it.next();
                CouponState cVar = (CouponState) CollectionsKt.u0(c16993b.d());
                ProductListDecorator.Companion companion = ProductListDecorator.INSTANCE;
                ProductFullDetails productFullDetails = (ProductFullDetails) c16993b.g();
                ShoppingListItem shoppingListItemJ = c16993b.getShoppingListItem();
                CartEntry cartEntryA = c16993b.getCartEntry();
                String strB = c16993b.getCode();
                EntryInQtyStepperInteraction entryInQtyStepperInteractionF1 = f1();
                Coupon couponC = null;
                boolean zE = Intrinsics.e(strB, entryInQtyStepperInteractionF1 != null ? entryInQtyStepperInteractionF1.getResourceId() : null);
                ProductEligibility.a aVarI = c16993b.getEligibility().i();
                ProductEligibility.a aVarK = (c16993b.getSponsorship() == null || Intrinsics.e(c16993b.getEligibility().k(), ProductEligibility.a.l.f164858a)) ? c16993b.getEligibility().k() : ProductEligibility.a.C2600a.f164847a;
                boolean zE2 = Intrinsics.e(h1(), c16993b.getCode());
                Qo.l lVarH = c16993b.getProductQuery();
                CouponCountDownStateDecorator couponCountDownStateDecoratorD = cVar != null ? Qr.a.d(cVar) : null;
                if (cVar != null) {
                    couponC = cVar.getCoupon();
                }
                arrayList.add(ProductListDecorator.Companion.b(companion, productFullDetails, shoppingListItemJ, null, cartEntryA, zE, aVarI, aVarK, zE2, lVarH, couponCountDownStateDecoratorD, couponC, this.productMetadataStore.c(((ProductFullDetails) c16993b.g()).getCode()), c16993b.getSponsorship(), c16993b.getProductRating(), false, 0, 49156, null));
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
            for (ProductState c16993b2 : arrayList5) {
                Pair pairA = TuplesKt.a(((ProductFullDetails) c16993b2.g()).getCode(), CollectionsKt.u0(c16993b2.d()));
                linkedHashMap.put(pairA.c(), pairA.d());
            }
        } while (!interfaceC17140B.e(value, ViewState.c(viewState, kVarA, null, null, null, null, arrayList, listI0, linkedHashMap, null, null, null, null, null, false, null, null, null, null, 0, 0, false, false, null, null, null, 33554206, null).a()));
    }

    private final void B0(final Coupon coupon, final String couponLocation) {
        io.reactivex.u<ClipUnclipCouponResponse> uVarK = this.couponsRepository.h(coupon).k(Mu.a.a());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.D0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e1.C0(this.f110598a, coupon, couponLocation, (ClipUnclipCouponResponse) obj);
            }
        };
        Pu.g<? super ClipUnclipCouponResponse> gVar = new Pu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.E0
            @Override // Pu.g
            public final void accept(Object obj) {
                e1.D0(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.F0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e1.E0(this.f110603a, coupon, (Throwable) obj);
            }
        };
        Ck.a.a(uVarK.o(gVar, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.G0
            @Override // Pu.g
            public final void accept(Object obj) {
                e1.F0(function12, obj);
            }
        }), this.disposables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence B1(ProductState it) {
        Intrinsics.j(it, "it");
        return it.getCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence C1(ProductState it) {
        Intrinsics.j(it, "it");
        return it.getCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D1() {
        ViewState value;
        ViewState viewState;
        ArrayList arrayList;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            viewState = value;
            List<ProductListDecorator> listQ = viewState.q();
            arrayList = new ArrayList(CollectionsKt.x(listQ, 10));
            for (ProductListDecorator productListDecorator : listQ) {
                String upc = productListDecorator.getUpc();
                EntryInQtyStepperInteraction entryInQtyStepperInteractionF1 = f1();
                arrayList.add(productListDecorator.u(((-201326593) & 1) != 0 ? productListDecorator.id : null, ((-201326593) & 2) != 0 ? productListDecorator.isSelected : false, ((-201326593) & 4) != 0 ? productListDecorator.upc : null, ((-201326593) & 8) != 0 ? productListDecorator.title : null, ((-201326593) & 16) != 0 ? productListDecorator.hasUnsavedShoppingListItem : false, ((-201326593) & 32) != 0 ? productListDecorator.listItemId : null, ((-201326593) & 64) != 0 ? productListDecorator.thumbnail : null, ((-201326593) & 128) != 0 ? productListDecorator.thumbnailUrl : null, ((-201326593) & 256) != 0 ? productListDecorator.thumbnailDescription : null, ((-201326593) & 512) != 0 ? productListDecorator.department : null, ((-201326593) & 1024) != 0 ? productListDecorator.isOnSale : false, ((-201326593) & RecyclerView.m.FLAG_MOVED) != 0 ? productListDecorator.showWeightInfo : false, ((-201326593) & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? productListDecorator.hasMPerksOffers : false, ((-201326593) & 8192) != 0 ? productListDecorator.currentPrice : null, ((-201326593) & 16384) != 0 ? productListDecorator.regularPrice : null, ((-201326593) & 32768) != 0 ? productListDecorator.weightUnitSizeAndPrice : null, ((-201326593) & 65536) != 0 ? productListDecorator.amountSaved : null, ((-201326593) & 131072) != 0 ? productListDecorator.quantityText : null, ((-201326593) & 262144) != 0 ? productListDecorator.priceGoodThroughDate : null, ((-201326593) & 524288) != 0 ? productListDecorator.isAddedToShoppingList : false, ((-201326593) & 1048576) != 0 ? productListDecorator.errorImageResource : 0, ((-201326593) & 2097152) != 0 ? productListDecorator.shoppingListItem : null, ((-201326593) & 4194304) != 0 ? productListDecorator.product : null, ((-201326593) & 8388608) != 0 ? productListDecorator.cartEntry : null, ((-201326593) & 16777216) != 0 ? productListDecorator.storeAvailability : null, ((-201326593) & 33554432) != 0 ? productListDecorator.cartEligibility : null, ((-201326593) & 67108864) != 0 ? productListDecorator.inQtyStepperInteraction : Intrinsics.e(upc, entryInQtyStepperInteractionF1 != null ? entryInQtyStepperInteractionF1.getResourceId() : null), ((-201326593) & 134217728) != 0 ? productListDecorator.resetStepperState : Intrinsics.e(h1(), productListDecorator.getUpc()), ((-201326593) & 268435456) != 0 ? productListDecorator.productQuery : null, ((-201326593) & 536870912) != 0 ? productListDecorator.couponCountDownStateDecorator : null, ((-201326593) & 1073741824) != 0 ? productListDecorator.coupon : null, ((-201326593) & Integer.MIN_VALUE) != 0 ? productListDecorator.complexPromo : null, (511 & 1) != 0 ? productListDecorator.isBuyAgain : false, (511 & 2) != 0 ? productListDecorator.isBopas : false, (511 & 4) != 0 ? productListDecorator.sponsorship : null, (511 & 8) != 0 ? productListDecorator.productRatings : null, (511 & 16) != 0 ? productListDecorator.showQuantityRequested : false, (511 & 32) != 0 ? productListDecorator.quantityRequested : 0, (511 & 64) != 0 ? productListDecorator.currentPriceDescription : null, (511 & 128) != 0 ? productListDecorator.productContainsTag : false, (511 & 256) != 0 ? productListDecorator.regularPriceDescription : null));
            }
        } while (!interfaceC17140B.e(value, ViewState.c(viewState, null, null, null, null, null, arrayList, null, null, null, null, null, null, null, false, null, null, null, null, 0, 0, false, false, null, null, null, 33554399, null).a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E0(e1 e1Var, Coupon coupon, Throwable th2) {
        uw.a.INSTANCE.f(th2, "Failed to clip coupon", new Object[0]);
        C16648k.d(androidx.view.d0.a(e1Var), null, null, e1Var.new s(coupon, null), 3, null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E1(Tq.k storeDetails) {
        ViewState value;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.c(value, storeDetails, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 0, 0, false, false, null, null, null, 33554430, null).a()));
        X1(g1().getValue().g(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G0(CouponsResponse c13538a) {
        uw.a.INSTANCE.a("Received " + c13538a.getCouponCount() + " coupons", new Object[0]);
        return Unit.f142422a;
    }

    private final void G1(int storeId) {
        CartProductListDecorator cartProductListDecorator = this.itemToSubstitute;
        if (cartProductListDecorator != null) {
            C16648k.d(androidx.view.d0.a(this), null, null, new E(cartProductListDecorator, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC17140B H1() {
        return tv.S.a(new l.Search("", null, null, 0, 0, null, null, 0, null, false, null, null, null, null, null, null, null, null, null, 523774, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I0(Throwable th2) {
        uw.a.INSTANCE.f(th2, "Error loading coupons on PLP", new Object[0]);
        return Unit.f142422a;
    }

    public static /* synthetic */ void J1(e1 e1Var, List list, Tl.a aVar, boolean z10, mk.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        e1Var.I1(list, aVar, z10, cVar);
    }

    private final void K0() {
        io.reactivex.l<String> lVarSubscribeOn = this.cartRepository.N().subscribeOn(C14764a.b());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.Z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e1.L0(this.f111048a, (String) obj);
            }
        };
        Ck.a.a(lVarSubscribeOn.subscribe(new Pu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.a1
            @Override // Pu.g
            public final void accept(Object obj) {
                e1.M0(function1, obj);
            }
        }), this.disposables);
    }

    private final void M1(List<String> beacon, Tl.a beaconType, mk.c product) {
        ViewState value;
        ViewState viewState;
        if (this._viewState.getValue().t().containsAll(beacon)) {
            return;
        }
        J1(this, beacon, beaconType, false, product, 4, null);
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            viewState = value;
        } while (!interfaceC17140B.e(value, ViewState.c(viewState, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, CollectionsKt.j1(CollectionsKt.P0(viewState.t(), beacon)), 0, 0, false, false, null, null, null, 33423359, null).a()));
    }

    private final void N0(Ok.c couponIdentity, final TrackingData trackingData) {
        io.reactivex.l<Coupon> lVarObserveOn = this.couponsRepository.k(couponIdentity).take(1L).observeOn(Mu.a.a());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.b1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e1.O0(this.f111067a, trackingData, (Coupon) obj);
            }
        };
        Pu.g<? super Coupon> gVar = new Pu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.c1
            @Override // Pu.g
            public final void accept(Object obj) {
                e1.P0(function1, obj);
            }
        };
        final t tVar = new t(uw.a.INSTANCE);
        Ck.a.a(lVarObserveOn.subscribe(gVar, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.d1
            @Override // Pu.g
            public final void accept(Object obj) {
                e1.Q0(tVar, obj);
            }
        }), this.disposables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Q(Qo.l q12, Qo.l q22) {
        Intrinsics.j(q12, "q1");
        Intrinsics.j(q22, "q2");
        return Intrinsics.e(q12.a(), q22.a());
    }

    private final void R0(Qo.l query) {
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
        C16648k.d(androidx.view.d0.a(this), null, null, new u(term, query, null), 3, null);
    }

    private final void T1(l.k query) {
        if (query instanceof l.Department) {
            Qo.l value = g1().getValue();
            l.Department department = value instanceof l.Department ? (l.Department) value : null;
            if (department != null) {
                l.Department department2 = (l.Department) query;
                if (Intrinsics.e(department.getSelectedSort(), department2.getSelectedSort()) && Intrinsics.e(department.G3(), department2.G3())) {
                    return;
                }
                X1(l.Department.v(department.g(), null, 0, 0, null, null, 0, null, false, null, null, null, null, department2.G3(), department2.getSelectedSort(), null, 20479, null), true);
                return;
            }
            return;
        }
        if (query instanceof l.Search) {
            Qo.l value2 = g1().getValue();
            l.Search search = value2 instanceof l.Search ? (l.Search) value2 : null;
            if (search != null) {
                l.Search search2 = (l.Search) query;
                if (Intrinsics.e(search.getSelectedSort(), search2.getSelectedSort()) && Intrinsics.e(search.G3(), search2.G3())) {
                    return;
                }
                X1(l.Search.v(search.g(), null, null, null, 0, 0, null, null, 0, null, false, null, null, search2.G3(), search2.getSelectedSort(), null, null, null, null, null, 511999, null), true);
                return;
            }
            return;
        }
        if (query instanceof l.BrowseCollection) {
            Qo.l value3 = g1().getValue();
            l.BrowseCollection browseCollection = value3 instanceof l.BrowseCollection ? (l.BrowseCollection) value3 : null;
            if (browseCollection != null) {
                l.BrowseCollection browseCollection2 = (l.BrowseCollection) query;
                if (Intrinsics.e(browseCollection.getSelectedSort(), browseCollection2.getSelectedSort()) && Intrinsics.e(browseCollection.G3(), browseCollection2.G3())) {
                    return;
                }
                X1(l.BrowseCollection.v(browseCollection.g(), null, 0, 0, null, null, 0, null, false, null, null, null, browseCollection2.G3(), browseCollection2.getSelectedSort(), null, null, 26623, null), true);
            }
        }
    }

    private final void W1(EntryInQtyStepperInteraction entryInQtyStepperInteraction) {
        this.productInQtyStepperInteraction.setValue(this, f111081S[0], entryInQtyStepperInteraction);
    }

    public static /* synthetic */ void Y1(e1 e1Var, Qo.l lVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        e1Var.X1(lVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z1(String str) {
        this.resetStepperState.setValue(this, f111081S[1], str);
    }

    static /* synthetic */ CouponState a1(e1 e1Var, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return e1Var.getCouponState(str, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b1(String str, Map map, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("expectedUpc", str);
        track.h("availableKeys", CollectionsKt.B0(map.keySet(), ",", null, null, 0, null, null, 62, null));
        track.m(TrackingData.a.b.f135065a);
        return Unit.f142422a;
    }

    public static /* synthetic */ void b2(e1 e1Var, String str, boolean z10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        e1Var.a2(str, z10, str2);
    }

    private final void d2(boolean shouldShowZeroResults) {
        ViewState value;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.c(value, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 0, 0, shouldShowZeroResults, false, null, null, null, 32505855, null).a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e2(tk.c<EntryChange> entryChange) {
        Entry entry;
        ProductFullDetails productFullDetailsM;
        EntryChange entryChangeA = entryChange.a();
        CouponState couponState = getCouponState((entryChangeA == null || (entry = entryChangeA.getEntry()) == null || (productFullDetailsM = entry.m()) == null) ? null : productFullDetailsM.getCode(), true);
        if (couponState == null || !(couponState.getCoupon().getEarnCondition() instanceof Coupon.c.Buy) || !(couponState.getCoupon().getReward() instanceof Coupon.e.Free) || !couponState.getCoupon().x()) {
            return false;
        }
        Integer numS0 = S0(couponState, entryChange);
        if (numS0 != null) {
            C16648k.d(androidx.view.d0.a(this), null, null, new H(d1(numS0.intValue(), (int) couponState.getCoupon().getReward().getValue()), null), 3, null);
            return true;
        }
        C16648k.d(androidx.view.d0.a(this), null, null, new I(null), 3, null);
        return false;
    }

    private final EntryInQtyStepperInteraction f1() {
        return (EntryInQtyStepperInteraction) this.productInQtyStepperInteraction.getValue(this, f111081S[0]);
    }

    private final void f2(CouponState couponState, Coupon clippedCoupon) {
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
                    C16648k.d(androidx.view.d0.a(this), null, null, new J(d1((int) dValueOf.doubleValue(), (int) couponState.getCoupon().getReward().getValue()), null), 3, null);
                }
            }
        }
    }

    private final void fetchAllCoupons() {
        io.reactivex.u uVarK = C6412d.B(this.couponsRepository, new CouponOptions(null, null, null, false, true, 0L, null, null, false, null, null, false, false, 8175, null), false, false, false, 14, null).k(Mu.a.a());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.Q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e1.G0((CouponsResponse) obj);
            }
        };
        Pu.g gVar = new Pu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.R0
            @Override // Pu.g
            public final void accept(Object obj) {
                e1.H0(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.S0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e1.I0((Throwable) obj);
            }
        };
        Ck.a.a(uVarK.o(gVar, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.T0
            @Override // Pu.g
            public final void accept(Object obj) {
                e1.J0(function12, obj);
            }
        }), this.disposables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC17140B<Qo.l> g1() {
        return (InterfaceC17140B) this.queryStore.getValue();
    }

    private final CouponState getCouponState(final String productCode, boolean logError) {
        final Map<String, CouponState> mapG = this.viewState.getValue().g();
        try {
            return (CouponState) MapsKt.l(mapG, productCode);
        } catch (NoSuchElementException e10) {
            uw.a.INSTANCE.x("Bug #1517298").u(e10, "Failed to find " + productCode + " in couponStatesMap with keys " + mapG.keySet(), new Object[0]);
            if (!logError) {
                return null;
            }
            this.analyticsEngine.h(C14476c.h("bug:1517289"), new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.C0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e1.b1(productCode, mapG, (TrackingData) obj);
                }
            });
            return null;
        }
    }

    private final String h1() {
        return (String) this.resetStepperState.getValue(this, f111081S[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h2() {
        Double dValueOf;
        ProductFullDetails product;
        StockInfo stockInfo;
        ProductFullDetails product2;
        mk.b price;
        List<Entry> listP;
        ProductFullDetails product3;
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        Ao.S s10 = Ao.S.f1194a;
        CartProductListDecorator cartProductListDecorator = this.itemToSubstitute;
        Boolean boolValueOf = null;
        String code = (cartProductListDecorator == null || (product3 = cartProductListDecorator.getProduct()) == null) ? null : product3.getCode();
        ProductListDecorator productListDecoratorI1 = i1();
        String upc = productListDecoratorI1 != null ? productListDecoratorI1.getUpc() : null;
        l.Search search = this.searchQuery;
        String term = search != null ? search.getTerm() : null;
        String str = this.searchMethod;
        String str2 = this.cartId;
        ShoppingCart shoppingCart = this._viewState.getValue().getShoppingCart();
        String strValueOf = String.valueOf((shoppingCart == null || (listP = shoppingCart.p()) == null) ? null : Integer.valueOf(listP.size()));
        CartProductListDecorator cartProductListDecorator2 = this.itemToSubstitute;
        Double dValueOf2 = cartProductListDecorator2 != null ? Double.valueOf(cartProductListDecorator2.getQuantity()) : null;
        CartProductListDecorator cartProductListDecorator3 = this.itemToSubstitute;
        if (cartProductListDecorator3 == null || (product2 = cartProductListDecorator3.getProduct()) == null || (price = product2.getPrice()) == null) {
            dValueOf = null;
        } else {
            double value = price.getValue();
            CartProductListDecorator cartProductListDecorator4 = this.itemToSubstitute;
            dValueOf = Double.valueOf(value * (cartProductListDecorator4 != null ? cartProductListDecorator4.getQuantity() : 1.0d));
        }
        ProductListDecorator productListDecoratorI12 = i1();
        if (productListDecoratorI12 != null && (product = productListDecoratorI12.getProduct()) != null && (stockInfo = product.getStockInfo()) != null) {
            boolValueOf = Boolean.valueOf(stockInfo.c());
        }
        interfaceC14261a.e(s10.d("product search page", code, upc, term, str, str2, strValueOf, dValueOf2, dValueOf, boolValueOf));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProductListDecorator i1() {
        Object next;
        Iterator<T> it = this._viewState.getValue().q().iterator();
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

    private final void i2(final Coupon coupon, final String couponLocation) {
        Object next;
        Coupon couponC;
        Iterator<T> it = this.viewState.getValue().f().iterator();
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
        f2(cVar2, coupon);
        this.analyticsEngine.h(C14476c.a("coupon clip"), new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.H0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e1.j2(this.f110943a, coupon, couponLocation, cVar2, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j2(e1 e1Var, Coupon coupon, String str, CouponState cVar, TrackingData track) {
        CouponState.b bVarE;
        Intrinsics.j(track, "$this$track");
        track.n(e1Var.W0());
        track.v(e1Var.V0());
        Qk.b bVar = Qk.b.f30831a;
        track.c(bVar.e(coupon));
        track.c(bVar.h(str));
        boolean z10 = false;
        if (cVar != null && (bVarE = cVar.getProgress()) != null && bVarE.d()) {
            z10 = true;
        }
        track.c(bVar.c(z10));
        return Unit.f142422a;
    }

    private final void k2(String event) {
        this.analyticsEngine.b(C14476c.a(event), C14476c.c("menu"), C14476c.g("menu"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l2() {
        ViewState value;
        CartProductListDecorator cartProductListDecorator = this.itemToSubstitute;
        if (cartProductListDecorator != null) {
            l.Search search = this.searchQuery;
            if ((search != null ? search.getTerm() : null) == null || this._viewState.getValue().getShoppingCart() == null) {
                cartProductListDecorator = null;
            }
            if (cartProductListDecorator != null) {
                if ((this._viewState.getValue().getLowStockBackupTracked() ? null : cartProductListDecorator) != null) {
                    this.analyticsEngine.f(C14476c.h("Find Substitution Page: Search"), new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.P0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return e1.m2(this.f110967a, (TrackingData) obj);
                        }
                    });
                    Unit unit = Unit.f142422a;
                    InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
                    do {
                        value = interfaceC17140B.getValue();
                    } while (!interfaceC17140B.e(value, ViewState.c(value, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 0, 0, false, true, null, null, null, 31457279, null).a()));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m2(e1 e1Var, TrackingData submitEvent) {
        ProductFullDetails product;
        List<Entry> listP;
        Intrinsics.j(submitEvent, "$this$submitEvent");
        submitEvent.h("searchMethod", "Search Suggestions");
        l.Search search = e1Var.searchQuery;
        String code = null;
        submitEvent.h("searchTerm", search != null ? search.getTerm() : null);
        submitEvent.h("numberOfSearchResults", String.valueOf(e1Var.viewState.getValue().x()));
        submitEvent.h("cartID", e1Var.cartId);
        ShoppingCart shoppingCart = e1Var._viewState.getValue().getShoppingCart();
        submitEvent.h("Cart Items Count", String.valueOf((shoppingCart == null || (listP = shoppingCart.p()) == null) ? null : Integer.valueOf(listP.size())));
        CartProductListDecorator cartProductListDecorator = e1Var.itemToSubstitute;
        if (cartProductListDecorator != null && (product = cartProductListDecorator.getProduct()) != null) {
            code = product.getCode();
        }
        submitEvent.h("productID", code);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n2() {
        ViewState value;
        ViewState viewState;
        ArrayList arrayList;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            viewState = value;
            List<ProductListDecorator> listQ = viewState.q();
            arrayList = new ArrayList(CollectionsKt.x(listQ, 10));
            for (ProductListDecorator productListDecorator : listQ) {
                arrayList.add(productListDecorator.u(((-201326593) & 1) != 0 ? productListDecorator.id : null, ((-201326593) & 2) != 0 ? productListDecorator.isSelected : false, ((-201326593) & 4) != 0 ? productListDecorator.upc : null, ((-201326593) & 8) != 0 ? productListDecorator.title : null, ((-201326593) & 16) != 0 ? productListDecorator.hasUnsavedShoppingListItem : false, ((-201326593) & 32) != 0 ? productListDecorator.listItemId : null, ((-201326593) & 64) != 0 ? productListDecorator.thumbnail : null, ((-201326593) & 128) != 0 ? productListDecorator.thumbnailUrl : null, ((-201326593) & 256) != 0 ? productListDecorator.thumbnailDescription : null, ((-201326593) & 512) != 0 ? productListDecorator.department : null, ((-201326593) & 1024) != 0 ? productListDecorator.isOnSale : false, ((-201326593) & RecyclerView.m.FLAG_MOVED) != 0 ? productListDecorator.showWeightInfo : false, ((-201326593) & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? productListDecorator.hasMPerksOffers : false, ((-201326593) & 8192) != 0 ? productListDecorator.currentPrice : null, ((-201326593) & 16384) != 0 ? productListDecorator.regularPrice : null, ((-201326593) & 32768) != 0 ? productListDecorator.weightUnitSizeAndPrice : null, ((-201326593) & 65536) != 0 ? productListDecorator.amountSaved : null, ((-201326593) & 131072) != 0 ? productListDecorator.quantityText : null, ((-201326593) & 262144) != 0 ? productListDecorator.priceGoodThroughDate : null, ((-201326593) & 524288) != 0 ? productListDecorator.isAddedToShoppingList : false, ((-201326593) & 1048576) != 0 ? productListDecorator.errorImageResource : 0, ((-201326593) & 2097152) != 0 ? productListDecorator.shoppingListItem : null, ((-201326593) & 4194304) != 0 ? productListDecorator.product : null, ((-201326593) & 8388608) != 0 ? productListDecorator.cartEntry : null, ((-201326593) & 16777216) != 0 ? productListDecorator.storeAvailability : null, ((-201326593) & 33554432) != 0 ? productListDecorator.cartEligibility : null, ((-201326593) & 67108864) != 0 ? productListDecorator.inQtyStepperInteraction : false, ((-201326593) & 134217728) != 0 ? productListDecorator.resetStepperState : false, ((-201326593) & 268435456) != 0 ? productListDecorator.productQuery : null, ((-201326593) & 536870912) != 0 ? productListDecorator.couponCountDownStateDecorator : null, ((-201326593) & 1073741824) != 0 ? productListDecorator.coupon : null, ((-201326593) & Integer.MIN_VALUE) != 0 ? productListDecorator.complexPromo : null, (511 & 1) != 0 ? productListDecorator.isBuyAgain : false, (511 & 2) != 0 ? productListDecorator.isBopas : false, (511 & 4) != 0 ? productListDecorator.sponsorship : null, (511 & 8) != 0 ? productListDecorator.productRatings : null, (511 & 16) != 0 ? productListDecorator.showQuantityRequested : false, (511 & 32) != 0 ? productListDecorator.quantityRequested : 0, (511 & 64) != 0 ? productListDecorator.currentPriceDescription : null, (511 & 128) != 0 ? productListDecorator.productContainsTag : false, (511 & 256) != 0 ? productListDecorator.regularPriceDescription : null));
            }
        } while (!interfaceC17140B.e(value, ViewState.c(viewState, null, null, null, null, null, arrayList, null, null, null, null, null, null, null, false, null, null, null, null, 0, 0, false, false, null, null, null, 33546207, null).a()));
    }

    private final void o1(final ProductCardDecorator itemClicked, Pp.b searchType, int position) {
        ViewState value;
        ViewState viewState;
        ArrayList arrayList;
        Pp.b bVar = Pp.b.f28358c;
        if (searchType == bVar || searchType == Pp.b.f28359d) {
            if (searchType == bVar || searchType == Pp.b.f28359d) {
                InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
                do {
                    value = interfaceC17140B.getValue();
                    viewState = value;
                    List<ProductListDecorator> listQ = viewState.q();
                    arrayList = new ArrayList(CollectionsKt.x(listQ, 10));
                    for (ProductListDecorator productListDecorator : listQ) {
                        arrayList.add(productListDecorator.u(((-201326593) & 1) != 0 ? productListDecorator.id : null, ((-201326593) & 2) != 0 ? productListDecorator.isSelected : Intrinsics.e(productListDecorator.getProduct().getEan(), itemClicked.getProduct().getEan()), ((-201326593) & 4) != 0 ? productListDecorator.upc : null, ((-201326593) & 8) != 0 ? productListDecorator.title : null, ((-201326593) & 16) != 0 ? productListDecorator.hasUnsavedShoppingListItem : false, ((-201326593) & 32) != 0 ? productListDecorator.listItemId : null, ((-201326593) & 64) != 0 ? productListDecorator.thumbnail : null, ((-201326593) & 128) != 0 ? productListDecorator.thumbnailUrl : null, ((-201326593) & 256) != 0 ? productListDecorator.thumbnailDescription : null, ((-201326593) & 512) != 0 ? productListDecorator.department : null, ((-201326593) & 1024) != 0 ? productListDecorator.isOnSale : false, ((-201326593) & RecyclerView.m.FLAG_MOVED) != 0 ? productListDecorator.showWeightInfo : false, ((-201326593) & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? productListDecorator.hasMPerksOffers : false, ((-201326593) & 8192) != 0 ? productListDecorator.currentPrice : null, ((-201326593) & 16384) != 0 ? productListDecorator.regularPrice : null, ((-201326593) & 32768) != 0 ? productListDecorator.weightUnitSizeAndPrice : null, ((-201326593) & 65536) != 0 ? productListDecorator.amountSaved : null, ((-201326593) & 131072) != 0 ? productListDecorator.quantityText : null, ((-201326593) & 262144) != 0 ? productListDecorator.priceGoodThroughDate : null, ((-201326593) & 524288) != 0 ? productListDecorator.isAddedToShoppingList : false, ((-201326593) & 1048576) != 0 ? productListDecorator.errorImageResource : 0, ((-201326593) & 2097152) != 0 ? productListDecorator.shoppingListItem : null, ((-201326593) & 4194304) != 0 ? productListDecorator.product : null, ((-201326593) & 8388608) != 0 ? productListDecorator.cartEntry : null, ((-201326593) & 16777216) != 0 ? productListDecorator.storeAvailability : null, ((-201326593) & 33554432) != 0 ? productListDecorator.cartEligibility : null, ((-201326593) & 67108864) != 0 ? productListDecorator.inQtyStepperInteraction : false, ((-201326593) & 134217728) != 0 ? productListDecorator.resetStepperState : false, ((-201326593) & 268435456) != 0 ? productListDecorator.productQuery : null, ((-201326593) & 536870912) != 0 ? productListDecorator.couponCountDownStateDecorator : null, ((-201326593) & 1073741824) != 0 ? productListDecorator.coupon : null, ((-201326593) & Integer.MIN_VALUE) != 0 ? productListDecorator.complexPromo : null, (511 & 1) != 0 ? productListDecorator.isBuyAgain : false, (511 & 2) != 0 ? productListDecorator.isBopas : false, (511 & 4) != 0 ? productListDecorator.sponsorship : null, (511 & 8) != 0 ? productListDecorator.productRatings : null, (511 & 16) != 0 ? productListDecorator.showQuantityRequested : false, (511 & 32) != 0 ? productListDecorator.quantityRequested : 0, (511 & 64) != 0 ? productListDecorator.currentPriceDescription : null, (511 & 128) != 0 ? productListDecorator.productContainsTag : false, (511 & 256) != 0 ? productListDecorator.regularPriceDescription : null));
                    }
                } while (!interfaceC17140B.e(value, ViewState.c(viewState, null, null, null, null, null, arrayList, null, null, null, null, null, null, null, true, null, null, null, null, 0, 0, false, false, null, null, null, 33546207, null).a()));
                return;
            }
            return;
        }
        if (f1() != null) {
            W1(null);
            return;
        }
        int i10 = 0;
        this.analyticsEngine.b(C14476c.a("event: search: product detail"), C14476c.c("mperks: search"), C14476c.g("search"));
        Iterator<ProductListDecorator> it = this.viewState.getValue().q().iterator();
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
            this.analyticsEngine.i(C14476c.h("Product Details Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.Y0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e1.p1(iIntValue, this, itemClicked, (TrackingData) obj);
                }
            });
            this.analyticsEngine.e(C2930u.f1407a.h0(iIntValue));
        }
        this.productAnalytics.j(itemClicked.getProductQuery(), itemClicked.getProduct(), position);
        C16648k.d(androidx.view.d0.a(this), null, null, new w(itemClicked, null), 3, null);
    }

    private final void o2(ProductFullDetails product, double quantityToUpdate) {
        wr.f.M(this.cartInteractor, product, quantityToUpdate, false, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLoadingStates(List<? extends Oj.a> loadingStates) {
        ViewState value;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.c(value, null, null, null, null, Oj.b.a(loadingStates), null, null, null, null, null, null, null, null, false, null, null, null, null, 0, 0, false, false, null, null, null, 33554415, null).a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p1(int i10, e1 e1Var, ProductCardDecorator productCardDecorator, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("productRank", String.valueOf(i10));
        stageEvent.h("PDPfromsearch", "1");
        Ao.e0.a(e1Var.sponsorshipsDataStore.a(productCardDecorator.getProduct().getCode()), stageEvent);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q2(e1 e1Var, Integer num) {
        ViewState value;
        boolean zB;
        InterfaceC17140B<ViewState> interfaceC17140B = e1Var._viewState;
        do {
            value = interfaceC17140B.getValue();
            zB = e1Var.userManager.b();
            Intrinsics.g(num);
        } while (!interfaceC17140B.e(value, ViewState.c(value, null, null, null, null, null, null, null, null, null, null, null, null, new CartPreviewDecorator(zB, num.intValue()), false, null, null, null, null, 0, 0, false, false, null, null, null, 33550335, null).a()));
        return Unit.f142422a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void s1(e1 e1Var, Qo.l lVar, HashMap map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        if ((i10 & 2) != 0) {
            map = null;
        }
        e1Var.r1(lVar, map);
    }

    private final void t1() {
        if (!this.paginator.g() || this.paginator.getIsPaginating()) {
            return;
        }
        this.paginator = Paginator.b(this.paginator, 0, 0, 0, 0, true, 15, null);
        Qo.l lVarC = g1().getValue().c();
        if (lVarC != null) {
            Y1(this, lVarC, false, 2, null);
        }
    }

    private final void u1(Qo.l query) {
        this.loadingStatesManager.b(query.n() ? new a.Loading(BuildConfig.DEFAULT_ITEM_SECTION, null, 2, null) : new a.Paging(BuildConfig.DEFAULT_ITEM_SECTION, null, 2, null));
        if (!this.featureManager.e(AbstractC18227f.b0.f170569h)) {
            R0(query);
        }
        C16648k.d(androidx.view.d0.a(this), null, null, new y(query, null), 3, null);
    }

    private final void w1() {
        if (this.userManager.b()) {
            wr.f.r(this.cartInteractor, false, new C12457k(), 1, null);
            this.cartInteractor.p();
            K0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z1(Qo.l productQuery) {
        ViewState value;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.c(value, null, productQuery.a(), null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 0, 0, false, false, null, null, null, 33546237, null).a()));
        if (productQuery.getIsPending()) {
            u1(productQuery);
        }
        if (productQuery instanceof l.k) {
            C16648k.d(androidx.view.d0.a(this), null, null, new B(productQuery, null), 3, null);
        }
    }

    public final String A0(String departmentId, String departmentName, List<FilterGroup> parents) throws IOException {
        Intrinsics.j(departmentId, "departmentId");
        Intrinsics.j(departmentName, "departmentName");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("T");
        String strJ1 = StringsKt.J1(departmentId, 2);
        StringBuilder sb3 = new StringBuilder();
        int length = strJ1.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = strJ1.charAt(i10);
            if (Character.isDigit(cCharAt)) {
                sb3.append(cCharAt);
            }
        }
        sb2.append(sb3.toString());
        if (parents != null) {
            ArrayList<FilterGroup> arrayList = new ArrayList();
            for (Object obj : parents) {
                if (!Intrinsics.e(((FilterGroup) obj).getDisplayName(), "All")) {
                    arrayList.add(obj);
                }
            }
            for (FilterGroup filterGroup : arrayList) {
                sb2.append(":");
                sb2.append(filterGroup.getDisplayName());
            }
        }
        sb2.append(":");
        sb2.append(departmentName);
        return sb2.toString();
    }

    public final void I1(List<String> beacon, Tl.a type, boolean isFormatLevel, mk.c product) {
        Intrinsics.j(beacon, "beacon");
        C16648k.d(androidx.view.d0.a(this), this.ioDispatcher, null, new G(beacon, isFormatLevel, type, this, product, null), 2, null);
    }

    public final void K1(List<String> beacon, String formatLevelBeacon, Tl.a beaconType, mk.c product) {
        ViewState value;
        ViewState viewState;
        Intrinsics.j(beacon, "beacon");
        Intrinsics.j(formatLevelBeacon, "formatLevelBeacon");
        if (this._viewState.getValue().e().containsAll(beacon)) {
            return;
        }
        J1(this, beacon, beaconType, false, product, 4, null);
        if (formatLevelBeacon.length() > 0) {
            I1(CollectionsKt.e(formatLevelBeacon), beaconType, true, product);
        }
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            viewState = value;
        } while (!interfaceC17140B.e(value, ViewState.c(viewState, null, null, null, null, null, null, null, null, null, null, null, null, null, false, CollectionsKt.j1(CollectionsKt.P0(viewState.e(), beacon)), null, null, null, 0, 0, false, false, null, null, null, 33538047, null).a()));
    }

    public final void L1(String beacon, String formatLevelBeacon, Tl.a beaconType, mk.c product) {
        ViewState value;
        Intrinsics.j(beacon, "beacon");
        Intrinsics.j(formatLevelBeacon, "formatLevelBeacon");
        if (StringsKt.r0(beacon) || this.trackingLoadBeacon.contains(beacon)) {
            return;
        }
        J1(this, CollectionsKt.e(beacon), beaconType, false, product, 4, null);
        this.trackingLoadBeacon.add(beacon);
        if (!StringsKt.r0(formatLevelBeacon) && !this.trackingOnLoadFormatLevelBeacon.contains(formatLevelBeacon)) {
            I1(CollectionsKt.e(formatLevelBeacon), beaconType, true, product);
            this.trackingOnLoadFormatLevelBeacon.add(formatLevelBeacon);
        }
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
        } while (!interfaceC17140B.e(value, ViewState.c(value, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, this.trackingLoadBeacon, null, 0, 0, false, false, null, null, null, 33488895, null).a()));
    }

    public final void N1(List<String> beacon, String formatLevelBeacon, Tl.a beaconType, mk.c product) {
        ViewState value;
        ViewState viewState;
        Intrinsics.j(beacon, "beacon");
        Intrinsics.j(formatLevelBeacon, "formatLevelBeacon");
        if (this._viewState.getValue().y().containsAll(beacon)) {
            return;
        }
        J1(this, beacon, beaconType, false, product, 4, null);
        if (!StringsKt.r0(formatLevelBeacon) && !this.trackingOnViewFormatLevelBeacon.contains(formatLevelBeacon)) {
            I1(CollectionsKt.e(formatLevelBeacon), beaconType, true, product);
            this.trackingOnViewFormatLevelBeacon.add(formatLevelBeacon);
        }
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            viewState = value;
        } while (!interfaceC17140B.e(value, ViewState.c(viewState, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, CollectionsKt.j1(CollectionsKt.P0(viewState.y(), beacon)), null, null, 0, 0, false, false, null, null, null, 33521663, null).a()));
    }

    public final void O1(String str) {
        this.campaignIdValue = str;
    }

    public final void P1(String str) {
        this.carouselTitleAnalytics = str;
    }

    public final void Q1(String str) {
        this.cmpid = str;
    }

    public final void R1(String str) {
        this.collectionName = str;
    }

    public final void S1(String str) {
        this.departmentCarouselAnalytics = str;
    }

    /* renamed from: T0, reason: from getter */
    public final String getCampaignIdValue() {
        return this.campaignIdValue;
    }

    /* renamed from: U0, reason: from getter */
    public final String getCarouselTitleAnalytics() {
        return this.carouselTitleAnalytics;
    }

    public final void U1(CartProductListDecorator item) {
        this.itemToSubstitute = item;
    }

    public final void V1(Paginator paginator) {
        Intrinsics.j(paginator, "<set-?>");
        this.paginator = paginator;
    }

    /* renamed from: X0, reason: from getter */
    public final String getCmpid() {
        return this.cmpid;
    }

    public final void X1(Qo.l query, boolean forceRefresh) {
        Intrinsics.j(query, "query");
        if (!forceRefresh && Intrinsics.e(query.g(), g1().getValue().g())) {
            InterfaceC17140B<Qo.l> interfaceC17140BG1 = g1();
            while (!interfaceC17140BG1.e(interfaceC17140BG1.getValue(), query)) {
            }
        } else {
            this.paginator = Paginator.b(this.paginator, 0, 0, 1, 0, false, 10, null);
            this.productStateRepository.i1(query);
            InterfaceC17140B<Qo.l> interfaceC17140BG12 = g1();
            while (!interfaceC17140BG12.e(interfaceC17140BG12.getValue(), query.g())) {
            }
        }
    }

    /* renamed from: Y0, reason: from getter */
    public final String getCollectionName() {
        return this.collectionName;
    }

    public final W.ComplexPromo Z0(String productCode) {
        Object next;
        String promoText;
        Iterator<T> it = this.viewState.getValue().q().iterator();
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

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a2(java.lang.String r25, boolean r26, java.lang.String r27) {
        /*
            r24 = this;
            r0 = r24
            r2 = r25
            java.lang.String r1 = "term"
            kotlin.jvm.internal.Intrinsics.j(r2, r1)
            tv.B r1 = r0.g1()
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
            r21 = 492542(0x783fe, float:6.90198E-40)
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
            Y1(r0, r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.personalized.modals.e1.a2(java.lang.String, boolean, java.lang.String):void");
    }

    /* renamed from: c1, reason: from getter */
    public final String getDepartmentCarouselAnalytics() {
        return this.departmentCarouselAnalytics;
    }

    public final void c2(boolean value) {
        this._stepperClicked.setValue(Boolean.valueOf(value));
    }

    /* renamed from: e1, reason: from getter */
    public final Paginator getPaginator() {
        return this.paginator;
    }

    public final InterfaceC17144F<AbstractC12460n> getEvents() {
        return C17154h.b(this._event);
    }

    public final InterfaceC17144F<ToastMessageData> getToastMessageData() {
        return C17154h.b(this._toastMessageData);
    }

    public final boolean j1(String productCode) {
        if (productCode == null) {
            return false;
        }
        for (ProductListDecorator productListDecorator : this.viewState.getValue().q()) {
            if (Intrinsics.e(productListDecorator.getProduct().getCode(), productCode)) {
                return productListDecorator.getProduct().getIsSponsoredCriteo();
            }
        }
        return false;
    }

    public final tv.P<Boolean> k1() {
        return this.stepperClicked;
    }

    public final tv.P<ViewState> m1() {
        return this.viewState;
    }

    public void onAction(Pk.a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.Clip) {
            a.Clip clip = (a.Clip) action;
            N0(clip.getCoupon(), clip.getTrackingData());
        } else if (!(action instanceof a.NotInterested) && !(action instanceof a.Unclip) && !(action instanceof a.ViewCouponDetails) && !(action instanceof a.ViewCouponList)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // androidx.view.InterfaceC6015f
    public void onCreate(InterfaceC6030s owner) {
        Intrinsics.j(owner, "owner");
        p2();
    }

    @Override // androidx.view.InterfaceC6015f
    public void onResume(InterfaceC6030s owner) {
        Intrinsics.j(owner, "owner");
        w1();
    }

    public final void p2() {
        if (this.userManager.b()) {
            C16648k.d(androidx.view.d0.a(this), null, null, new N(null), 3, null);
            io.reactivex.l<Integer> lVarSubscribeOn = this.cartRepository.Q().subscribeOn(C14764a.b());
            final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.N0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e1.q2(this.f110961a, (Integer) obj);
                }
            };
            Pu.g<? super Integer> gVar = new Pu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.W0
                @Override // Pu.g
                public final void accept(Object obj) {
                    e1.r2(function1, obj);
                }
            };
            final O o10 = new O(uw.a.INSTANCE);
            Ck.a.a(lVarSubscribeOn.subscribe(gVar, new Pu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.X0
                @Override // Pu.g
                public final void accept(Object obj) {
                    e1.s2(o10, obj);
                }
            }), this.disposables);
        }
    }

    public final void r1(Qo.l initialProductQuery, HashMap<String, String> departmentBreadcrumbs) {
        ViewState value;
        EnumC13905f enumC13905f;
        GoogleAdData googleAdDataB;
        InterfaceC12562r interfaceC12562r;
        EnumC13905f enumC13905f2;
        ViewState value2;
        l.Search search;
        EnumC13905f enumC13905f3;
        GoogleAdData googleAdDataA;
        InterfaceC12562r interfaceC12562r2;
        EnumC13905f enumC13905f4;
        Integer num = 2;
        Integer num2 = 1;
        if (initialProductQuery instanceof l.Department) {
            InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
            while (true) {
                ViewState value3 = interfaceC17140B.getValue();
                C12561q c12561q = C12561q.f112905a;
                l.Department department = (l.Department) initialProductQuery;
                GoogleAdData googleAdDataC = C12561q.c(c12561q, EnumC13905f.f131156d, department, departmentBreadcrumbs, true, this.userManager.y(), null, 32, null);
                EnumC13905f enumC13905f5 = EnumC13905f.f131159g;
                Integer num3 = num2;
                num2 = num3;
                InterfaceC17140B<ViewState> interfaceC17140B2 = interfaceC17140B;
                Integer num4 = num;
                num = num4;
                if (interfaceC17140B2.e(value3, ViewState.c(value3, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 0, 0, false, false, googleAdDataC, c12561q.b(enumC13905f5, department, departmentBreadcrumbs, true, this.userManager.y(), num3), c12561q.b(enumC13905f5, department, departmentBreadcrumbs, true, this.userManager.y(), num4), 4194303, null).a())) {
                    break;
                } else {
                    interfaceC17140B = interfaceC17140B2;
                }
            }
        }
        if (initialProductQuery instanceof l.Search) {
            InterfaceC17140B<ViewState> interfaceC17140B3 = this._viewState;
            do {
                value2 = interfaceC17140B3.getValue();
                InterfaceC12562r interfaceC12562r3 = this.adManagerProvider;
                search = (l.Search) initialProductQuery;
                EnumC13905f enumC13905f6 = EnumC13905f.f131156d;
                enumC13905f3 = EnumC13905f.f131161i;
                googleAdDataA = interfaceC12562r3.a(search, 1, enumC13905f6, enumC13905f3);
                interfaceC12562r2 = this.adManagerProvider;
                enumC13905f4 = EnumC13905f.f131159g;
            } while (!interfaceC17140B3.e(value2, ViewState.c(value2, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 0, 0, false, false, googleAdDataA, interfaceC12562r2.a(search, 2, enumC13905f4, enumC13905f3), this.adManagerProvider.a(search, 3, enumC13905f4, enumC13905f3), 4194303, null).a()));
        }
        if (initialProductQuery instanceof l.BrowseCollection) {
            InterfaceC17140B<ViewState> interfaceC17140B4 = this._viewState;
            while (true) {
                ViewState value4 = interfaceC17140B4.getValue();
                C12561q c12561q2 = C12561q.f112905a;
                EnumC13905f enumC13905f7 = EnumC13905f.f131156d;
                l.BrowseCollection browseCollection = (l.BrowseCollection) initialProductQuery;
                yl.k kVar = this.featureManager;
                AbstractC18227f.C c10 = AbstractC18227f.C.f170544h;
                GoogleAdData googleAdDataA2 = c12561q2.a(enumC13905f7, browseCollection, kVar.e(c10), this.userManager.y(), num2);
                EnumC13905f enumC13905f8 = EnumC13905f.f131159g;
                InterfaceC17140B<ViewState> interfaceC17140B5 = interfaceC17140B4;
                if (interfaceC17140B5.e(value4, ViewState.c(value4, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 0, 0, false, false, googleAdDataA2, c12561q2.a(enumC13905f8, browseCollection, this.featureManager.e(c10), this.userManager.y(), num), c12561q2.a(enumC13905f8, browseCollection, this.featureManager.e(c10), this.userManager.y(), 3), 4194303, null).a())) {
                    break;
                } else {
                    interfaceC17140B4 = interfaceC17140B5;
                }
            }
        }
        if (initialProductQuery instanceof l.Personalized) {
            l.Personalized personalized = (l.Personalized) initialProductQuery;
            int i10 = r.$EnumSwitchMapping$0[personalized.getCategory().ordinal()];
            if (i10 != 1 && i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC17140B<ViewState> interfaceC17140B6 = this._viewState;
            do {
                value = interfaceC17140B6.getValue();
                InterfaceC12562r interfaceC12562r4 = this.adManagerProvider;
                EnumC13905f enumC13905f9 = EnumC13905f.f131156d;
                enumC13905f = EnumC13905f.f131161i;
                googleAdDataB = interfaceC12562r4.b(personalized, 1, enumC13905f9, enumC13905f);
                interfaceC12562r = this.adManagerProvider;
                enumC13905f2 = EnumC13905f.f131159g;
            } while (!interfaceC17140B6.e(value, ViewState.c(value, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 0, 0, false, false, googleAdDataB, interfaceC12562r.b(personalized, 2, enumC13905f2, enumC13905f), this.adManagerProvider.b(personalized, 3, enumC13905f2, enumC13905f), 4194303, null).a()));
        }
    }

    public final void t2() {
        ViewState value;
        ViewState viewState;
        InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
        do {
            value = interfaceC17140B.getValue();
            viewState = value;
        } while (!interfaceC17140B.e(value, ViewState.c(viewState, null, null, null, null, null, C17612h.b(viewState.q(), this.featureManager.e(AbstractC18227f.k0.f170587h), this.featureManager.e(AbstractC18227f.l0.f170589h)), null, null, null, null, null, null, null, false, null, null, null, null, 0, 0, false, false, null, null, null, 33554399, null)));
    }

    public final void x1(AbstractC12456j action) {
        ViewState value;
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC12456j.a) {
            G1(this.storeProvider.g());
            return;
        }
        if (action instanceof AbstractC12456j.ItemSelectedAction) {
            AbstractC12456j.ItemSelectedAction itemSelectedAction = (AbstractC12456j.ItemSelectedAction) action;
            o1(itemSelectedAction.getSelectedItem(), itemSelectedAction.getSearchType(), itemSelectedAction.getPosition());
            return;
        }
        if (action instanceof AbstractC12456j.t) {
            n1(action);
            return;
        }
        if (action instanceof AbstractC12456j.g) {
            v1();
            return;
        }
        if (action instanceof AbstractC12456j.ViewProductDetailsAction) {
            AbstractC12456j.ViewProductDetailsAction viewProductDetailsAction = (AbstractC12456j.ViewProductDetailsAction) action;
            F1(viewProductDetailsAction.getProduct(), viewProductDetailsAction.getQuery(), viewProductDetailsAction.getPosition());
            return;
        }
        if (action instanceof AbstractC12456j.f) {
            t1();
            return;
        }
        if (action instanceof AbstractC12456j.UpdateEntryAction) {
            AbstractC12456j.UpdateEntryAction updateEntryAction = (AbstractC12456j.UpdateEntryAction) action;
            o2(updateEntryAction.getProduct(), updateEntryAction.getQuantityToUpdate());
            return;
        }
        if (action instanceof AbstractC12456j.UserAcceptAddToCartAction) {
            wr.f fVar = this.cartInteractor;
            AbstractC17116a.Accept accept = new AbstractC17116a.Accept(((AbstractC12456j.UserAcceptAddToCartAction) action).getCartUpdateRequest(), null, null, 4, null);
            Qo.l value2 = g1().getValue();
            l.Search search = value2 instanceof l.Search ? (l.Search) value2 : null;
            wr.f.B(fVar, accept, false, search != null ? search.getTerm() : null, 2, null);
            return;
        }
        if (action instanceof AbstractC12456j.CollapseQuantityStepperAction) {
            EntryInQtyStepperInteraction entryInQtyStepperInteractionF1 = f1();
            if (entryInQtyStepperInteractionF1 != null) {
                AbstractC12456j.CollapseQuantityStepperAction collapseQuantityStepperAction = (AbstractC12456j.CollapseQuantityStepperAction) action;
                if (entryInQtyStepperInteractionF1.getStepperHitRect().contains(collapseQuantityStepperAction.getTouchX(), collapseQuantityStepperAction.getTouchY()) || f1() == null) {
                    return;
                }
                W1(null);
                return;
            }
            return;
        }
        if (action instanceof AbstractC12456j.StepperStateChangedAction) {
            AbstractC12456j.StepperStateChangedAction stepperStateChangedAction = (AbstractC12456j.StepperStateChangedAction) action;
            W1(new EntryInQtyStepperInteraction(stepperStateChangedAction.getProductCode(), stepperStateChangedAction.getStepperHitRect(), false));
            Z1(null);
            return;
        }
        if (action instanceof AbstractC12456j.ResetActiveStepper) {
            Z1(((AbstractC12456j.ResetActiveStepper) action).getResourceId());
            return;
        }
        if (action instanceof AbstractC12456j.SetFilterAndSortOptions) {
            T1(((AbstractC12456j.SetFilterAndSortOptions) action).getQuery());
            return;
        }
        if (action instanceof AbstractC12456j.c.a) {
            q1();
            return;
        }
        if (action instanceof AbstractC12456j.SendTitle) {
            this.carouselTitle = ((AbstractC12456j.SendTitle) action).getTitle();
            InterfaceC17140B<ViewState> interfaceC17140B = this._viewState;
            do {
                value = interfaceC17140B.getValue();
            } while (!interfaceC17140B.e(value, ViewState.c(value, null, null, null, AbstractC5607a.INSTANCE.c(this.carouselTitle), null, null, null, null, null, null, null, null, null, false, null, null, null, null, 0, 0, false, false, null, null, null, 33554423, null).a()));
            return;
        }
        if (action instanceof AbstractC12456j.SendCriteoClickBeacon) {
            AbstractC12456j.SendCriteoClickBeacon sendCriteoClickBeacon = (AbstractC12456j.SendCriteoClickBeacon) action;
            K1(sendCriteoClickBeacon.a(), sendCriteoClickBeacon.getFormatLevelBeacon(), sendCriteoClickBeacon.getBeaconType(), sendCriteoClickBeacon.getProduct());
            return;
        }
        if (action instanceof AbstractC12456j.p) {
            g2(true);
            return;
        }
        if (action instanceof AbstractC12456j.SendCriteoQtyStepperBeacon) {
            AbstractC12456j.SendCriteoQtyStepperBeacon sendCriteoQtyStepperBeacon = (AbstractC12456j.SendCriteoQtyStepperBeacon) action;
            M1(sendCriteoQtyStepperBeacon.a(), sendCriteoQtyStepperBeacon.getBeaconType(), sendCriteoQtyStepperBeacon.getProduct());
            return;
        }
        if (action instanceof AbstractC12456j.SendCriteoViewBeacon) {
            AbstractC12456j.SendCriteoViewBeacon sendCriteoViewBeacon = (AbstractC12456j.SendCriteoViewBeacon) action;
            N1(sendCriteoViewBeacon.a(), sendCriteoViewBeacon.getFormatLevelBeacon(), sendCriteoViewBeacon.getBeaconType(), sendCriteoViewBeacon.getProduct());
        } else if (action instanceof AbstractC12456j.SendCriteoLoadBeacon) {
            AbstractC12456j.SendCriteoLoadBeacon sendCriteoLoadBeacon = (AbstractC12456j.SendCriteoLoadBeacon) action;
            L1(sendCriteoLoadBeacon.getBeacon(), sendCriteoLoadBeacon.getFormatLevelBeacon(), sendCriteoLoadBeacon.getBeaconType(), sendCriteoLoadBeacon.getProduct());
        } else if (action instanceof AbstractC12456j.ZeroResultsVisibilityAction) {
            d2(((AbstractC12456j.ZeroResultsVisibilityAction) action).getShouldShow());
        } else {
            if (!(action instanceof AbstractC12456j.GoogleAdClicked)) {
                throw new NoWhenBranchMatchedException();
            }
            this.analyticsEngine.e(C13902c.b(((AbstractC12456j.GoogleAdClicked) action).getAnalytics(), "product search page"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C0(e1 e1Var, Coupon coupon, String str, ClipUnclipCouponResponse clipUnclipCouponResponse) {
        Intrinsics.g(clipUnclipCouponResponse);
        e1Var.y1(clipUnclipCouponResponse, coupon, str);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void F1(ProductFullDetails product, Qo.l productQuery, int position) {
        Qo.l value = g1().getValue();
        if (value instanceof l.Personalized) {
            int i10 = r.$EnumSwitchMapping$0[((l.Personalized) value).getCategory().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    k2("event: shopping list: product detail view");
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                k2("event: favorites on sale modal: product detail view");
            }
        } else if (!(value instanceof l.Recommendations)) {
            if (value instanceof l.Favorites) {
                k2("event: favorites modal: product detail view");
            } else if (value instanceof l.ShoppingList) {
                k2("event: shopping list: show product details");
            } else if (value instanceof l.Search) {
                this.analyticsEngine.b(C14476c.a("event: search: product detail"), C14476c.c("mperks: search"), C14476c.g("search"));
            } else if (!(value instanceof l.BrowseCollection) && !(value instanceof l.Coupon) && !(value instanceof l.Reward) && !(value instanceof l.Department)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.productAnalytics.j(productQuery, product, position);
        C16648k.d(androidx.view.d0.a(this), null, null, new D(product, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L0(e1 e1Var, String str) {
        Intrinsics.g(str);
        e1Var.cartId = str;
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O0(e1 e1Var, TrackingData trackingData, Coupon coupon) {
        String value;
        List<AbstractC14482i> listK;
        AbstractC14482i abstractC14482i;
        Intrinsics.g(coupon);
        if (trackingData != null && (listK = trackingData.k()) != null && (abstractC14482i = (AbstractC14482i) CollectionsKt.u0(listK)) != null) {
            value = abstractC14482i.getValue();
        } else {
            value = null;
        }
        e1Var.B0(coupon, value);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final Integer S0(CouponState couponState, tk.c<EntryChange> entryChange) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object T(e1 e1Var, List list, Continuation continuation) {
        e1Var.onLoadingStates(list);
        return Unit.f142422a;
    }

    private final String V0() {
        Qo.l value = g1().getValue();
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

    private final String W0() {
        Qo.l value = g1().getValue();
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

    private final void g2(boolean overrideItemAlreadyInCart) {
        mk.i iVarC;
        ProductFullDetails product;
        ProductListDecorator productListDecoratorI1 = i1();
        if (productListDecoratorI1 != null) {
            mk.i iVarB = mk.k.b(Co.l.g(productListDecoratorI1.getProduct().getCode()), 1.0d);
            CartProductListDecorator cartProductListDecorator = this.itemToSubstitute;
            if (cartProductListDecorator != null && (product = cartProductListDecorator.getProduct()) != null) {
                iVarC = mk.k.c(product, 0.0d);
            } else {
                iVarC = null;
            }
            this.loadingStatesManager.b(new a.Loading(null, null, 3, null));
            if (iVarC != null) {
                C16648k.d(androidx.view.d0.a(this), null, null, new M(iVarC, iVarB, overrideItemAlreadyInCart, null), 3, null);
            }
        }
    }

    private final void n1(AbstractC12456j action) {
        Qo.l value = g1().getValue();
        if (value instanceof l.Favorites) {
            this.analyticsEngine.b(C14476c.a("event: favorites modal: view shopping list"), C14476c.c("menu"), C14476c.g("menu"));
        } else if (!(value instanceof l.ShoppingList) && !(value instanceof l.Department) && !(value instanceof l.BrowseCollection) && !(value instanceof l.Search) && !(value instanceof l.Coupon) && !(value instanceof l.Reward)) {
            if (value instanceof l.Personalized) {
                int i10 = r.$EnumSwitchMapping$0[((l.Personalized) value).getCategory().ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        this.analyticsEngine.b(C14476c.a("event: shopping list: view shopping list"), C14476c.c("Shopping List"), C14476c.g("shopping list"));
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    this.analyticsEngine.b(C14476c.a("event: favorites on sale modal: shopping list icon"), C14476c.c("menu"), C14476c.g("menu"));
                }
            } else if (!(value instanceof l.Recommendations)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        C16648k.d(androidx.view.d0.a(this), null, null, new v(null), 3, null);
    }

    private final void q1() {
        if ((g1().getValue() instanceof l.Department) || (g1().getValue() instanceof l.BrowseCollection)) {
            C16648k.d(androidx.view.d0.a(this), null, null, new x(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendBeaconToastMessage(Tl.a type, boolean isFormatLevel, mk.c product) {
        C16648k.d(androidx.view.d0.a(this), null, null, new F(isFormatLevel, this, type, product, null), 3, null);
    }

    private final void v1() {
        C16648k.d(androidx.view.d0.a(this), null, null, new z(null), 3, null);
    }

    private final void y1(ClipUnclipCouponResponse response, Coupon coupon, String couponLocation) {
        if (!StringsKt.I(response.getResult(), "Success", false, 2, null)) {
            C16648k.d(androidx.view.d0.a(this), null, null, new A(coupon, null), 3, null);
        } else {
            i2(coupon, couponLocation);
        }
    }

    public final String l1() {
        Qo.l value = g1().getValue();
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

    @Override // androidx.view.c0
    protected void onCleared() {
        super.onCleared();
        this.disposables.d();
    }
}
