package com.meijer.mobile.meijer.activity.personalized.modals;

import Ao.C2898u;
import Ao.W;
import Co.ProductFullDetails;
import Co.StockInfo;
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
import androidx.view.InterfaceC6157f;
import androidx.view.InterfaceC6172s;
import bk.AbstractC6392a;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse;
import com.meijer.mobile.meijer.C12687q;
import com.meijer.mobile.meijer.C12689s;
import com.meijer.mobile.meijer.InterfaceC12688r;
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
import io.constructor.data.model.common.FilterGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
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
import kotlin.Result;
import kotlin.ResultKt;
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
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import mv.AbstractC15779K;
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
import vs.C17728h;
import vs.CartProductListDecorator;
import vs.ProductListDecorator;
import wl.CartEntry;
import wr.InterfaceC17909a;
import ys.C18372b;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000î\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 ö\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0003:\u0010ì\u0001ð\u0001ò\u0001õ\u0001æ\u0001î\u0001ê\u0001è\u0001B\u008b\u0001\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\b\b\u0001\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J'\u0010/\u001a\u00020&2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020&2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u001d\u00108\u001a\u00020&2\f\u00107\u001a\b\u0012\u0004\u0012\u00020605H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020&H\u0002¢\u0006\u0004\b:\u0010(J#\u0010>\u001a\u00020&2\u0012\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0;05H\u0002¢\u0006\u0004\b>\u00109J\u000f\u0010?\u001a\u00020&H\u0002¢\u0006\u0004\b?\u0010(J\u000f\u0010@\u001a\u00020&H\u0002¢\u0006\u0004\b@\u0010(J\u000f\u0010A\u001a\u00020&H\u0002¢\u0006\u0004\bA\u0010(J!\u0010F\u001a\u00020&2\u0006\u0010C\u001a\u00020B2\b\u0010E\u001a\u0004\u0018\u00010DH\u0002¢\u0006\u0004\bF\u0010GJ!\u0010L\u001a\u00020&2\u0006\u0010I\u001a\u00020H2\b\u0010K\u001a\u0004\u0018\u00010JH\u0002¢\u0006\u0004\bL\u0010MJ)\u0010P\u001a\u00020&2\u0006\u0010O\u001a\u00020N2\u0006\u0010I\u001a\u00020H2\b\u0010K\u001a\u0004\u0018\u00010JH\u0002¢\u0006\u0004\bP\u0010QJ!\u0010U\u001a\u00020&2\b\u0010S\u001a\u0004\u0018\u00010R2\u0006\u0010T\u001a\u00020HH\u0002¢\u0006\u0004\bU\u0010VJ!\u0010W\u001a\u00020&2\u0006\u0010I\u001a\u00020H2\b\u0010K\u001a\u0004\u0018\u00010JH\u0002¢\u0006\u0004\bW\u0010MJ\u0011\u0010X\u001a\u0004\u0018\u00010JH\u0002¢\u0006\u0004\bX\u0010YJ\u0011\u0010Z\u001a\u0004\u0018\u00010JH\u0002¢\u0006\u0004\bZ\u0010YJ\u0017\u0010\\\u001a\u00020&2\u0006\u0010[\u001a\u000201H\u0002¢\u0006\u0004\b\\\u00104J\u0017\u0010^\u001a\u00020&2\u0006\u0010[\u001a\u00020]H\u0002¢\u0006\u0004\b^\u0010_J\u0019\u0010b\u001a\u00020&2\b\b\u0002\u0010a\u001a\u00020`H\u0002¢\u0006\u0004\bb\u0010cJ\u001b\u0010f\u001a\u00020&2\n\u0010e\u001a\u00060-j\u0002`dH\u0002¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020&H\u0002¢\u0006\u0004\bh\u0010(J\u000f\u0010i\u001a\u00020&H\u0002¢\u0006\u0004\bi\u0010(J\u000f\u0010j\u001a\u00020&H\u0002¢\u0006\u0004\bj\u0010(J\u0017\u0010l\u001a\u00020&2\u0006\u0010k\u001a\u00020`H\u0002¢\u0006\u0004\bl\u0010cJ5\u0010r\u001a\u00020&2\f\u0010m\u001a\b\u0012\u0004\u0012\u00020J052\n\b\u0002\u0010o\u001a\u0004\u0018\u00010n2\n\b\u0002\u0010q\u001a\u0004\u0018\u00010pH\u0002¢\u0006\u0004\br\u0010sJ\u000f\u0010t\u001a\u00020&H\u0002¢\u0006\u0004\bt\u0010(J-\u0010w\u001a\u00020&2\b\u0010u\u001a\u0004\u0018\u00010n2\b\b\u0002\u0010v\u001a\u00020`2\b\u0010q\u001a\u0004\u0018\u00010pH\u0002¢\u0006\u0004\bw\u0010xJ\u001f\u0010{\u001a\u00020&2\u0006\u0010q\u001a\u00020<2\u0006\u0010z\u001a\u00020yH\u0002¢\u0006\u0004\b{\u0010|J\u000f\u0010}\u001a\u00020&H\u0002¢\u0006\u0004\b}\u0010(J\u001a\u0010\u0080\u0001\u001a\u00020&2\u0006\u0010\u007f\u001a\u00020~H\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0011\u0010\u0082\u0001\u001a\u00020&H\u0002¢\u0006\u0005\b\u0082\u0001\u0010(J\u0019\u0010\u0083\u0001\u001a\u00020&2\u0006\u0010[\u001a\u000201H\u0002¢\u0006\u0005\b\u0083\u0001\u00104J\u001c\u0010\u0086\u0001\u001a\u00020&2\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J,\u0010\u0088\u0001\u001a\u00020&2\u0006\u0010q\u001a\u00020<2\b\u00102\u001a\u0004\u0018\u0001012\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001b\u0010\u008b\u0001\u001a\u00020&2\u0007\u0010\u008a\u0001\u001a\u00020JH\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J*\u0010\u008f\u0001\u001a\u0004\u0018\u00010R2\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010J2\t\b\u0002\u0010\u008e\u0001\u001a\u00020`H\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J'\u0010\u0094\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0093\u0001\u0018\u0001052\n\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0091\u0001H\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J-\u0010\u0097\u0001\u001a\u0004\u0018\u00010-2\u0006\u0010S\u001a\u00020R2\u000f\u0010\u0092\u0001\u001a\n\u0012\u0005\u0012\u00030\u0091\u00010\u0096\u0001H\u0002¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J'\u0010\u009c\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u0099\u0001\u001a\u00020-2\t\b\u0002\u0010\u009a\u0001\u001a\u00020-H\u0002¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J#\u0010\u009e\u0001\u001a\u00020`2\u000f\u0010\u0092\u0001\u001a\n\u0012\u0005\u0012\u00030\u0091\u00010\u0096\u0001H\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u0018\u0010¡\u0001\u001a\u00020&2\u0007\u0010 \u0001\u001a\u00020`¢\u0006\u0005\b¡\u0001\u0010cJ\u000f\u0010¢\u0001\u001a\u00020&¢\u0006\u0005\b¢\u0001\u0010(J\u0011\u0010£\u0001\u001a\u00020JH\u0000¢\u0006\u0005\b£\u0001\u0010YJ1\u0010§\u0001\u001a\u00020&2\u0007\u0010¤\u0001\u001a\u00020J2\t\b\u0002\u0010¥\u0001\u001a\u00020`2\u000b\b\u0002\u0010¦\u0001\u001a\u0004\u0018\u00010J¢\u0006\u0006\b§\u0001\u0010¨\u0001J#\u0010©\u0001\u001a\u00020&2\u0006\u0010[\u001a\u0002012\t\b\u0002\u0010¥\u0001\u001a\u00020`¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u001c\u0010\u00ad\u0001\u001a\u00020&2\n\u0010¬\u0001\u001a\u0005\u0018\u00010«\u0001¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J\u001b\u0010°\u0001\u001a\u00020&2\u0007\u0010\u007f\u001a\u00030¯\u0001H\u0016¢\u0006\u0006\b°\u0001\u0010±\u0001J\u0018\u0010²\u0001\u001a\u00020&2\u0006\u0010\u007f\u001a\u00020~¢\u0006\u0006\b²\u0001\u0010\u0081\u0001J?\u0010´\u0001\u001a\u00020&2\f\u0010m\u001a\b\u0012\u0004\u0012\u00020J052\u0007\u0010³\u0001\u001a\u00020J2\n\b\u0002\u0010o\u001a\u0004\u0018\u00010n2\n\b\u0002\u0010q\u001a\u0004\u0018\u00010p¢\u0006\u0006\b´\u0001\u0010µ\u0001J?\u0010¶\u0001\u001a\u00020&2\f\u0010m\u001a\b\u0012\u0004\u0012\u00020J052\u0007\u0010³\u0001\u001a\u00020J2\n\b\u0002\u0010o\u001a\u0004\u0018\u00010n2\n\b\u0002\u0010q\u001a\u0004\u0018\u00010p¢\u0006\u0006\b¶\u0001\u0010µ\u0001J>\u0010·\u0001\u001a\u00020&2\f\u0010m\u001a\b\u0012\u0004\u0012\u00020J052\n\b\u0002\u0010u\u001a\u0004\u0018\u00010n2\b\b\u0002\u0010v\u001a\u00020`2\b\u0010q\u001a\u0004\u0018\u00010p¢\u0006\u0006\b·\u0001\u0010¸\u0001J9\u0010¹\u0001\u001a\u00020&2\u0006\u0010m\u001a\u00020J2\u0007\u0010³\u0001\u001a\u00020J2\n\b\u0002\u0010o\u001a\u0004\u0018\u00010n2\n\b\u0002\u0010q\u001a\u0004\u0018\u00010p¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u001c\u0010½\u0001\u001a\u00020&2\b\u0010¼\u0001\u001a\u00030»\u0001H\u0016¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u001c\u0010¿\u0001\u001a\u00020&2\b\u0010¼\u0001\u001a\u00030»\u0001H\u0016¢\u0006\u0006\b¿\u0001\u0010¾\u0001J\u000f\u0010À\u0001\u001a\u00020&¢\u0006\u0005\bÀ\u0001\u0010(J\u0011\u0010Á\u0001\u001a\u00020&H\u0014¢\u0006\u0005\bÁ\u0001\u0010(J\u001d\u0010Â\u0001\u001a\u00020`2\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010JH\u0000¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J\u0011\u0010Ä\u0001\u001a\u0004\u0018\u00010J¢\u0006\u0005\bÄ\u0001\u0010YJ \u0010Æ\u0001\u001a\u0005\u0018\u00010Å\u00012\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010JH\u0007¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001JJ\u0010Ì\u0001\u001a\u00020&2\u000b\b\u0002\u0010È\u0001\u001a\u0004\u0018\u0001012+\b\u0002\u0010Ë\u0001\u001a$\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020J\u0018\u00010É\u0001j\u0011\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020J\u0018\u0001`Ê\u0001¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J4\u0010Ò\u0001\u001a\u00020J2\u0007\u0010Î\u0001\u001a\u00020J2\u0007\u0010Ï\u0001\u001a\u00020J2\u0010\u0010Ñ\u0001\u001a\u000b\u0012\u0005\u0012\u00030Ð\u0001\u0018\u000105¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÜ\u0001\u0010Ý\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\b\n\u0006\bè\u0001\u0010é\u0001R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bê\u0001\u0010ë\u0001R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bì\u0001\u0010í\u0001R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bî\u0001\u0010ï\u0001R\u0016\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bð\u0001\u0010ñ\u0001R\u0016\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bò\u0001\u0010ó\u0001R'\u0010ù\u0001\u001a\t\u0012\u0004\u0012\u0002010ô\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bõ\u0001\u0010ö\u0001\u001a\u0006\b÷\u0001\u0010ø\u0001R\u001f\u0010þ\u0001\u001a\n\u0012\u0005\u0012\u00030û\u00010ú\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bü\u0001\u0010ý\u0001R\u001e\u0010\u0081\u0002\u001a\t\u0012\u0004\u0012\u00020`0ô\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÿ\u0001\u0010\u0080\u0002R#\u0010\u0087\u0002\u001a\t\u0012\u0004\u0012\u00020`0\u0082\u00028\u0006¢\u0006\u0010\n\u0006\b\u0083\u0002\u0010\u0084\u0002\u001a\u0006\b\u0085\u0002\u0010\u0086\u0002R*\u0010\u008f\u0002\u001a\u00030\u0088\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0089\u0002\u0010\u008a\u0002\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002\"\u0006\b\u008d\u0002\u0010\u008e\u0002R\u001c\u0010\u0092\u0002\u001a\u0005\u0018\u00010«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0002\u0010\u0091\u0002R\u0019\u0010\u0095\u0002\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0002\u0010\u0094\u0002R*\u0010\u0099\u0002\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0096\u0002\u0010\u0094\u0002\u001a\u0005\b\u0097\u0002\u0010Y\"\u0006\b\u0098\u0002\u0010\u008c\u0001R*\u0010\u009d\u0002\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u009a\u0002\u0010\u0094\u0002\u001a\u0005\b\u009b\u0002\u0010Y\"\u0006\b\u009c\u0002\u0010\u008c\u0001R*\u0010¡\u0002\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u009e\u0002\u0010\u0094\u0002\u001a\u0005\b\u009f\u0002\u0010Y\"\u0006\b \u0002\u0010\u008c\u0001R*\u0010¥\u0002\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¢\u0002\u0010\u0094\u0002\u001a\u0005\b£\u0002\u0010Y\"\u0006\b¤\u0002\u0010\u008c\u0001R*\u0010©\u0002\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¦\u0002\u0010\u0094\u0002\u001a\u0005\b§\u0002\u0010Y\"\u0006\b¨\u0002\u0010\u008c\u0001R*\u0010\u00ad\u0002\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bª\u0002\u0010\u0094\u0002\u001a\u0005\b«\u0002\u0010Y\"\u0006\b¬\u0002\u0010\u008c\u0001R\u001c\u0010±\u0002\u001a\u0005\u0018\u00010®\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0002\u0010°\u0002R\u001b\u0010¦\u0001\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0002\u0010\u0094\u0002R\u001e\u0010¶\u0002\u001a\t\u0012\u0004\u0012\u00020J0³\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0002\u0010µ\u0002R#\u0010º\u0002\u001a\t\u0012\u0004\u0012\u00020J0³\u00028\u0006¢\u0006\u0010\n\u0006\b·\u0002\u0010µ\u0002\u001a\u0006\b¸\u0002\u0010¹\u0002R#\u0010½\u0002\u001a\t\u0012\u0004\u0012\u00020J0³\u00028\u0006¢\u0006\u0010\n\u0006\b»\u0002\u0010µ\u0002\u001a\u0006\b¼\u0002\u0010¹\u0002R\u001f\u0010Á\u0002\u001a\n\u0012\u0005\u0012\u00030\u0084\u00010¾\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0002\u0010À\u0002R\u001e\u0010Ä\u0002\u001a\u00070Jj\u0003`Â\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0002\u0010\u0094\u0002R\u0018\u0010È\u0002\u001a\u00030Å\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0002\u0010Ç\u0002R\u0018\u0010Ì\u0002\u001a\u00030É\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÊ\u0002\u0010Ë\u0002R\u001f\u0010Ï\u0002\u001a\n\u0012\u0005\u0012\u00030Í\u00020ô\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0002\u0010\u0080\u0002R$\u0010Ò\u0002\u001a\n\u0012\u0005\u0012\u00030Í\u00020\u0082\u00028\u0006¢\u0006\u0010\n\u0006\bÐ\u0002\u0010\u0084\u0002\u001a\u0006\bÑ\u0002\u0010\u0086\u0002R1\u0010Û\u0002\u001a\u00030Ó\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0006\bÔ\u0002\u0010Õ\u0002\u0012\u0005\bÚ\u0002\u0010(\u001a\u0006\bÖ\u0002\u0010×\u0002\"\u0006\bØ\u0002\u0010Ù\u0002R\u001f\u0010Þ\u0002\u001a\n\u0012\u0005\u0012\u00030Ü\u00020ú\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÝ\u0002\u0010ý\u0001R9\u0010ç\u0002\u001a\u0005\u0018\u00010ß\u00022\n\u0010à\u0002\u001a\u0005\u0018\u00010ß\u00028B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\bá\u0002\u0010â\u0002\u001a\u0006\bã\u0002\u0010ä\u0002\"\u0006\bå\u0002\u0010æ\u0002RD\u0010ë\u0002\u001a\u000b\u0018\u00010Jj\u0005\u0018\u0001`Â\u00022\u0010\u0010à\u0002\u001a\u000b\u0018\u00010Jj\u0005\u0018\u0001`Â\u00028B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\bè\u0002\u0010â\u0002\u001a\u0005\bé\u0002\u0010Y\"\u0006\bê\u0002\u0010\u008c\u0001R\u001a\u0010ï\u0002\u001a\u0005\u0018\u00010ì\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bí\u0002\u0010î\u0002R\u001c\u0010ó\u0002\u001a\n\u0012\u0005\u0012\u00030û\u00010ð\u00028F¢\u0006\b\u001a\u0006\bñ\u0002\u0010ò\u0002R\u001c\u0010õ\u0002\u001a\n\u0012\u0005\u0012\u00030Ü\u00020ð\u00028F¢\u0006\b\u001a\u0006\bô\u0002\u0010ò\u0002¨\u0006÷\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "", "LTq/j;", "storeProvider", "Lyo/k;", "userManager", "Lzl/k;", "featureManager", "Lsp/Y;", "productStateRepository", "Lil/m;", "cartRepository", "LEq/b;", "shoppingListRepository", "Lwr/f;", "cartInteractor", "Ltl/h;", "timeSlotRepository", "Ldl/d;", "couponsRepository", "Lcom/meijer/mobile/meijer/activity/personalized/modals/B0;", "productQueryPagingDataSource", "Lhi/a;", "analyticsEngine", "LRo/a;", "productAnalytics", "Lqp/b;", "beaconClient", "Lpp/e;", "sponsorshipsDataStore", "Lpp/d;", "productMetadataStore", "Lmv/K;", "ioDispatcher", "<init>", "(LTq/j;Lyo/k;Lzl/k;Lsp/Y;Lil/m;LEq/b;Lwr/f;Ltl/h;Ldl/d;Lcom/meijer/mobile/meijer/activity/personalized/modals/B0;Lhi/a;LRo/a;Lqp/b;Lpp/e;Lpp/d;Lmv/K;)V", "", "s2", "()V", "Lts/a;", "itemClicked", "LPp/b;", "searchType", "", "position", "r1", "(Lts/a;LPp/b;I)V", "LQo/l;", "productQuery", "C1", "(LQo/l;)V", "", "LPj/a;", "loadingStates", "onLoadingStates", "(Ljava/util/List;)V", "fetchAllCoupons", "Lsp/b;", "LCo/h;", "productStates", "D1", "G1", "z1", "L0", "LPk/c;", "couponIdentity", "Lii/f;", "trackingData", "O0", "(LPk/c;Lii/f;)V", "LPk/a;", "coupon", "", "couponLocation", "B0", "(LPk/a;Ljava/lang/String;)V", "Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;", "response", "B1", "(Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;LPk/a;Ljava/lang/String;)V", "LYk/c;", "couponState", "clippedCoupon", "k2", "(LYk/c;LPk/a;)V", "n2", "X0", "()Ljava/lang/String;", "W0", "query", "S0", "LQo/l$k;", "W1", "(LQo/l$k;)V", "", "overrideItemAlreadyInCart", "l2", "(Z)V", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "J1", "(I)V", "q2", "m2", "Z1", "shouldShowZeroResults", "i2", "beacon", "LUl/a;", "beaconType", "Lnk/c;", "product", "P1", "(Ljava/util/List;LUl/a;Lnk/c;)V", "y1", "type", "isFormatLevel", "sendBeaconToastMessage", "(LUl/a;ZLnk/c;)V", "", "quantityToUpdate", "t2", "(LCo/h;D)V", "t1", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "action", "q1", "(Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;)V", "w1", "x1", "LTq/k;", "storeDetails", "H1", "(LTq/k;)V", "I1", "(LCo/h;LQo/l;I)V", "event", "p2", "(Ljava/lang/String;)V", "productCode", "logError", "getCouponState", "(Ljava/lang/String;Z)LYk/c;", "Lfj/j;", "entryChange", "LPk/f;", "getCouponList", "(Lfj/j;)Ljava/util/List;", "Luk/c;", "T0", "(LYk/c;Luk/c;)Ljava/lang/Integer;", "freeItemsCount", "rewardItemsCount", "Lbk/a;", "e1", "(II)Lbk/a;", "j2", "(Luk/c;)Z", "value", "g2", "y2", "n1", "term", "forceRefresh", "searchMethod", "e2", "(Ljava/lang/String;ZLjava/lang/String;)V", "b2", "(LQo/l;Z)V", "Lvs/b;", "item", "X1", "(Lvs/b;)V", "LQk/a;", "onAction", "(LQk/a;)V", "A1", "formatLevelBeacon", "Q1", "(Ljava/util/List;Ljava/lang/String;LUl/a;Lnk/c;)V", "N1", "L1", "(Ljava/util/List;LUl/a;ZLnk/c;)V", "O1", "(Ljava/lang/String;Ljava/lang/String;LUl/a;Lnk/c;)V", "Landroidx/lifecycle/s;", "owner", "onCreate", "(Landroidx/lifecycle/s;)V", "onResume", "u2", "onCleared", "l1", "(Ljava/lang/String;)Z", "i1", "LAo/W$a;", "a1", "(Ljava/lang/String;)LAo/W$a;", "initialProductQuery", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "departmentBreadcrumbs", "u1", "(LQo/l;Ljava/util/HashMap;)V", "departmentId", "departmentName", "Lio/constructor/data/model/common/FilterGroup;", "parents", "A0", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;", "a", "LTq/j;", "b", "Lyo/k;", "c", "Lzl/k;", "d", "Lsp/Y;", "e", "Lil/m;", "f", "LEq/b;", "g", "Lwr/f;", "h", "Ltl/h;", "i", "Ldl/d;", "j", "Lcom/meijer/mobile/meijer/activity/personalized/modals/B0;", "k", "Lhi/a;", "l", "LRo/a;", "m", "Lqp/b;", "n", "Lpp/e;", "o", "Lpp/d;", "p", "Lmv/K;", "Lpv/B;", "q", "Lkotlin/Lazy;", "h1", "()Lpv/B;", "queryStore", "Lpv/A;", "LUl/e;", "r", "Lpv/A;", "_toastMessageData", "s", "Lpv/B;", "_stepperClicked", "Lpv/P;", "t", "Lpv/P;", "m1", "()Lpv/P;", "stepperClicked", "Lcom/meijer/mobile/meijer/r;", "u", "Lcom/meijer/mobile/meijer/r;", "getAdManagerProvider", "()Lcom/meijer/mobile/meijer/r;", "setAdManagerProvider", "(Lcom/meijer/mobile/meijer/r;)V", "adManagerProvider", "v", "Lvs/b;", "itemToSubstitute", "w", "Ljava/lang/String;", "carouselTitle", "x", "U0", "R1", "campaignIdValue", "y", "Y0", "T1", "cmpid", "z", "Z0", "U1", "collectionName", "A", "p1", "h2", "whiteLabelFallbackCarousel", "B", "d1", "V1", "departmentCarouselAnalytics", "C", "V0", "S1", "carouselTitleAnalytics", "LQo/l$i;", "D", "LQo/l$i;", "searchQuery", "E", "", "F", "Ljava/util/List;", "trackingLoadBeacon", "G", "getTrackingOnLoadFormatLevelBeacon", "()Ljava/util/List;", "trackingOnLoadFormatLevelBeacon", "H", "getTrackingOnViewFormatLevelBeacon", "trackingOnViewFormatLevelBeacon", "Lio/reactivex/l;", "I", "Lio/reactivex/l;", "currentStoreStream", "Lcom/meijer/mobile/core/model/common/ResourceId;", "J", "cartId", "LPj/c;", "K", "LPj/c;", "loadingStatesManager", "LJu/a;", "L", "LJu/a;", "disposables", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$q;", "M", "_viewState", "N", "o1", "viewState", "Ltn/a;", "O", "Ltn/a;", "f1", "()Ltn/a;", "Y1", "(Ltn/a;)V", "getPaginator$annotations", "paginator", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "P", "_event", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$m;", "<set-?>", "Q", "Lkotlin/properties/ReadWriteProperty;", "g1", "()Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$m;", "a2", "(Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$m;)V", "productInQtyStepperInteraction", "R", "j1", "d2", "resetStepperState", "Lvs/f;", "k1", "()Lvs/f;", "selectedProduct", "Lpv/F;", "getToastMessageData", "()Lpv/F;", "toastMessageData", "getEvents", "events", "S", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class e1 extends androidx.view.c0 implements InterfaceC6157f {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private String whiteLabelFallbackCarousel;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private String departmentCarouselAnalytics;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private String carouselTitleAnalytics;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private l.Search searchQuery;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private String searchMethod;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final List<String> trackingLoadBeacon;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final List<String> trackingOnLoadFormatLevelBeacon;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final List<String> trackingOnViewFormatLevelBeacon;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final io.reactivex.l<Tq.k> currentStoreStream;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private String cartId;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final Pj.c loadingStatesManager;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _viewState;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final pv.P<ViewState> viewState;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Paginator paginator;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<AbstractC12585n> _event;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty productInQtyStepperInteraction;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty resetStepperState;

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
    private final InterfaceC16549B<Boolean> _stepperClicked;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final pv.P<Boolean> stepperClicked;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private InterfaceC12688r adManagerProvider;

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
    static final /* synthetic */ KProperty<Object>[] f111943T = {Reflection.f(new MutablePropertyReference1Impl(e1.class, "productInQtyStepperInteraction", "getProductInQtyStepperInteraction()Lcom/meijer/mobile/meijer/activity/personalized/modals/ProductsViewModel$EntryInQtyStepperInteraction;", 0)), Reflection.f(new MutablePropertyReference1Impl(e1.class, "resetStepperState", "getResetStepperState()Ljava/lang/String;", 0))};

    /* renamed from: U, reason: collision with root package name */
    public static final int f111944U = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$onGetClipCouponResponse$1", f = "ProductsViewModel.kt", l = {527}, m = "invokeSuspend")
    static final class A extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111989a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Coupon f111991c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e1.this.new A(this.f111991c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        A(Coupon coupon, Continuation<? super A> continuation) {
            super(2, continuation);
            this.f111991c = coupon;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((A) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111989a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = e1.this._event;
                AbstractC12585n.ClipCouponFailedEvent clipCouponFailedEvent = new AbstractC12585n.ClipCouponFailedEvent(Nr.g.f22702n, Nr.g.f22700m, com.meijer.mobile.meijer.Y.f100486Ih, Nr.g.f22664O, this.f111991c);
                this.f111989a = 1;
                if (interfaceC16548A.emit(clipCouponFailedEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$onProductQuery$2", f = "ProductsViewModel.kt", l = {382}, m = "invokeSuspend")
    static final class B extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111992a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Qo.l f111994c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e1.this.new B(this.f111994c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        B(Qo.l lVar, Continuation<? super B> continuation) {
            super(2, continuation);
            this.f111994c = lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((B) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111992a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = e1.this._event;
                AbstractC12585n.BubbleFacetsToFilterAndSort bubbleFacetsToFilterAndSort = new AbstractC12585n.BubbleFacetsToFilterAndSort((l.k) this.f111994c);
                this.f111992a = 1;
                if (interfaceC16548A.emit(bubbleFacetsToFilterAndSort, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$onProductsState$1", f = "ProductsViewModel.kt", l = {HttpResponseStatus.ERROR_PRECONDITION_FAILED}, m = "invokeSuspend")
    static final class C extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f111995a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<ProductState<ProductFullDetails>> f111997c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f111998d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f111999e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C(List<ProductState<ProductFullDetails>> list, String str, String str2, Continuation<? super C> continuation) {
            super(2, continuation);
            this.f111997c = list;
            this.f111998d = str;
            this.f111999e = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e1.this.new C(this.f111997c, this.f111998d, this.f111999e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String name;
            ProductFullDetails productFullDetails;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f111995a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = e1.this._event;
                int size = this.f111997c.size();
                ProductState c17116b = (ProductState) CollectionsKt.u0(this.f111997c);
                if (c17116b != null && (productFullDetails = (ProductFullDetails) c17116b.g()) != null) {
                    name = productFullDetails.getName();
                } else {
                    name = null;
                }
                if (name == null) {
                    name = "";
                }
                AbstractC12585n.UpdateProductsInfoEvent updateProductsInfoEvent = new AbstractC12585n.UpdateProductsInfoEvent(size, name, this.f111998d, this.f111999e);
                this.f111995a = 1;
                if (interfaceC16548A.emit(updateProductsInfoEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$onViewProductDetails$1", f = "ProductsViewModel.kt", l = {1650}, m = "invokeSuspend")
    static final class D extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112000a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ProductFullDetails f112002c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e1.this.new D(this.f112002c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        D(ProductFullDetails productFullDetails, Continuation<? super D> continuation) {
            super(2, continuation);
            this.f112002c = productFullDetails;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((D) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f112000a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = e1.this._event;
                AbstractC12585n.ViewProductDetailsEvent viewProductDetailsEvent = new AbstractC12585n.ViewProductDetailsEvent(this.f112002c);
                this.f112000a = 1;
                if (interfaceC16548A.emit(viewProductDetailsEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$proactiveSubstitute$1$1", f = "ProductsViewModel.kt", l = {952, 958, 963}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class E extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f112003a;

        /* renamed from: b, reason: collision with root package name */
        Object f112004b;

        /* renamed from: c, reason: collision with root package name */
        Object f112005c;

        /* renamed from: d, reason: collision with root package name */
        Object f112006d;

        /* renamed from: e, reason: collision with root package name */
        int f112007e;

        /* renamed from: f, reason: collision with root package name */
        int f112008f;

        /* renamed from: g, reason: collision with root package name */
        int f112009g;

        /* renamed from: h, reason: collision with root package name */
        int f112010h;

        /* renamed from: i, reason: collision with root package name */
        int f112011i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f112012j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ CartProductListDecorator f112014l;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            E e10 = e1.this.new E(this.f112014l, continuation);
            e10.f112012j = obj;
            return e10;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        E(CartProductListDecorator cartProductListDecorator, Continuation<? super E> continuation) {
            super(2, continuation);
            this.f112014l = cartProductListDecorator;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((E) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
          0x00f6: PHI (r2v10 mv.O) = (r2v9 mv.O), (r2v11 mv.O) binds: [B:31:0x00d3, B:35:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$sendBeaconToastMessage$1", f = "ProductsViewModel.kt", l = {1367}, m = "invokeSuspend")
    static final class F extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f112015a;

        /* renamed from: b, reason: collision with root package name */
        int f112016b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f112017c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e1 f112018d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Ul.a f112019e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ nk.c f112020f;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new F(this.f112017c, this.f112018d, this.f112019e, this.f112020f, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        F(boolean z10, e1 e1Var, Ul.a aVar, nk.c cVar, Continuation<? super F> continuation) {
            super(2, continuation);
            this.f112017c = z10;
            this.f112018d = e1Var;
            this.f112019e = aVar;
            this.f112020f = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((F) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            String displayName;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f112016b;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                if (this.f112017c) {
                    str = "Format Level";
                } else {
                    str = "Sku level";
                }
                InterfaceC16548A interfaceC16548A = this.f112018d._toastMessageData;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(' ');
                Ul.a aVar = this.f112019e;
                if (aVar != null) {
                    displayName = aVar.getDisplayName();
                } else {
                    displayName = null;
                }
                sb2.append(displayName);
                sb2.append(" Beacon sent successfully!");
                ToastMessageData toastMessageData = new ToastMessageData(sb2.toString(), this.f112020f);
                this.f112015a = str;
                this.f112016b = 1;
                if (interfaceC16548A.emit(toastMessageData, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$sendCriteoBeacon$1", f = "ProductsViewModel.kt", l = {1276}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class G extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f112021a;

        /* renamed from: b, reason: collision with root package name */
        Object f112022b;

        /* renamed from: c, reason: collision with root package name */
        Object f112023c;

        /* renamed from: d, reason: collision with root package name */
        Object f112024d;

        /* renamed from: e, reason: collision with root package name */
        Object f112025e;

        /* renamed from: f, reason: collision with root package name */
        Object f112026f;

        /* renamed from: g, reason: collision with root package name */
        Object f112027g;

        /* renamed from: h, reason: collision with root package name */
        Object f112028h;

        /* renamed from: i, reason: collision with root package name */
        Object f112029i;

        /* renamed from: j, reason: collision with root package name */
        Object f112030j;

        /* renamed from: k, reason: collision with root package name */
        Object f112031k;

        /* renamed from: l, reason: collision with root package name */
        Object f112032l;

        /* renamed from: m, reason: collision with root package name */
        boolean f112033m;

        /* renamed from: n, reason: collision with root package name */
        int f112034n;

        /* renamed from: o, reason: collision with root package name */
        int f112035o;

        /* renamed from: p, reason: collision with root package name */
        int f112036p;

        /* renamed from: q, reason: collision with root package name */
        int f112037q;

        /* renamed from: r, reason: collision with root package name */
        int f112038r;

        /* renamed from: s, reason: collision with root package name */
        int f112039s;

        /* renamed from: t, reason: collision with root package name */
        int f112040t;

        /* renamed from: u, reason: collision with root package name */
        private /* synthetic */ Object f112041u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ List<String> f112042v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ boolean f112043w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ Ul.a f112044x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ e1 f112045y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ nk.c f112046z;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            G g10 = new G(this.f112042v, this.f112043w, this.f112044x, this.f112045y, this.f112046z, continuation);
            g10.f112041u = obj;
            return g10;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        G(List<String> list, boolean z10, Ul.a aVar, e1 e1Var, nk.c cVar, Continuation<? super G> continuation) {
            super(2, continuation);
            this.f112042v = list;
            this.f112043w = z10;
            this.f112044x = aVar;
            this.f112045y = e1Var;
            this.f112046z = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((G) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$setPreviousTrackState$1", f = "ProductsViewModel.kt", l = {1144}, m = "invokeSuspend")
    static final class H extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112047a;

        H(Continuation<? super H> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e1.this.new H(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((H) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f112047a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = e1.this._event;
                AbstractC12585n.i iVar = AbstractC12585n.i.f112213a;
                this.f112047a = 1;
                if (interfaceC16548A.emit(iVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$showFreeItemsSnackBarFromCartUpdate$1$1$1", f = "ProductsViewModel.kt", l = {2398}, m = "invokeSuspend")
    static final class I extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112049a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f112051c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e1.this.new I(this.f112051c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I(AbstractC6392a abstractC6392a, Continuation<? super I> continuation) {
            super(2, continuation);
            this.f112051c = abstractC6392a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((I) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f112049a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = e1.this._event;
                AbstractC12585n.ShowFreeItemsSnackbar showFreeItemsSnackbar = new AbstractC12585n.ShowFreeItemsSnackbar(this.f112051c);
                this.f112049a = 1;
                if (interfaceC16548A.emit(showFreeItemsSnackbar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$showFreeItemsSnackBarFromCartUpdate$1$2$1", f = "ProductsViewModel.kt", l = {2405}, m = "invokeSuspend")
    static final class J extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112052a;

        J(Continuation<? super J> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e1.this.new J(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((J) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f112052a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = e1.this._event;
                AbstractC12585n.e eVar = AbstractC12585n.e.f112208a;
                this.f112052a = 1;
                if (interfaceC16548A.emit(eVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$showFreeItemsSnackBarFromClipCoupon$1$2$1", f = "ProductsViewModel.kt", l = {561}, m = "invokeSuspend")
    static final class K extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112054a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f112056c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e1.this.new K(this.f112056c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        K(AbstractC6392a abstractC6392a, Continuation<? super K> continuation) {
            super(2, continuation);
            this.f112056c = abstractC6392a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((K) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f112054a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = e1.this._event;
                AbstractC12585n.ShowFreeItemsSnackbar showFreeItemsSnackbar = new AbstractC12585n.ShowFreeItemsSnackbar(this.f112056c);
                this.f112054a = 1;
                if (interfaceC16548A.emit(showFreeItemsSnackbar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "Lkotlin/reflect/KProperty;", "property", "oldValue", "newValue", "", "afterChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class L extends ObservableProperty<EntryInQtyStepperInteraction> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e1 f112057b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public L(Object obj, e1 e1Var) {
            super(obj);
            this.f112057b = e1Var;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty<?> property, EntryInQtyStepperInteraction oldValue, EntryInQtyStepperInteraction newValue) {
            Intrinsics.j(property, "property");
            this.f112057b.G1();
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "Lkotlin/reflect/KProperty;", "property", "oldValue", "newValue", "", "afterChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class M extends ObservableProperty<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e1 f112058b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public M(Object obj, e1 e1Var) {
            super(obj);
            this.f112058b = e1Var;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty<?> property, String oldValue, String newValue) {
            Intrinsics.j(property, "property");
            this.f112058b.G1();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$substituteOOSItem$1$1", f = "ProductsViewModel.kt", l = {909, 917, 919, 929}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class N extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f112059a;

        /* renamed from: b, reason: collision with root package name */
        Object f112060b;

        /* renamed from: c, reason: collision with root package name */
        Object f112061c;

        /* renamed from: d, reason: collision with root package name */
        Object f112062d;

        /* renamed from: e, reason: collision with root package name */
        int f112063e;

        /* renamed from: f, reason: collision with root package name */
        int f112064f;

        /* renamed from: g, reason: collision with root package name */
        int f112065g;

        /* renamed from: h, reason: collision with root package name */
        int f112066h;

        /* renamed from: i, reason: collision with root package name */
        int f112067i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f112068j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ nk.i f112070l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ nk.i f112071m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f112072n;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            N n10 = e1.this.new N(this.f112070l, this.f112071m, this.f112072n, continuation);
            n10.f112068j = obj;
            return n10;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        N(nk.i iVar, nk.i iVar2, boolean z10, Continuation<? super N> continuation) {
            super(2, continuation);
            this.f112070l = iVar;
            this.f112071m = iVar2;
            this.f112072n = z10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((N) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0114  */
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
                Method dump skipped, instructions count: 340
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.personalized.modals.e1.N.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$updateCartItemCount$1", f = "ProductsViewModel.kt", l = {1380}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class O extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f112073a;

        /* renamed from: b, reason: collision with root package name */
        Object f112074b;

        /* renamed from: c, reason: collision with root package name */
        Object f112075c;

        /* renamed from: d, reason: collision with root package name */
        Object f112076d;

        /* renamed from: e, reason: collision with root package name */
        int f112077e;

        /* renamed from: f, reason: collision with root package name */
        int f112078f;

        /* renamed from: g, reason: collision with root package name */
        int f112079g;

        /* renamed from: h, reason: collision with root package name */
        int f112080h;

        /* renamed from: i, reason: collision with root package name */
        int f112081i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f112082j;

        O(Continuation<? super O> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            O o10 = e1.this.new O(continuation);
            o10.f112082j = obj;
            return o10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((O) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f112081i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f112082j;
                    e1 e1Var = e1.this;
                    Result.Companion companion = Result.INSTANCE;
                    wr.f fVar = e1Var.cartInteractor;
                    this.f112082j = interfaceC15783O;
                    this.f112073a = interfaceC15783O;
                    this.f112074b = this;
                    this.f112075c = this;
                    this.f112076d = interfaceC15783O;
                    this.f112077e = 0;
                    this.f112078f = 0;
                    this.f112079g = 0;
                    this.f112080h = 0;
                    this.f112081i = 1;
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
                qw.a.INSTANCE.l(thE, "fetchLatestCart failed in ProductsViewModel", new Object[0]);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class P extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        P(Object obj) {
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
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$10", f = "ProductsViewModel.kt", l = {281}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$a, reason: case insensitive filesystem */
    static final class C12572a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112084a;

        C12572a(Continuation<? super C12572a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e1.this.new C12572a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C12572a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f112084a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                sp.Y y10 = e1.this.productStateRepository;
                this.f112084a = 1;
                obj = y10.F0(this);
                if (obj == objF) {
                    return objF;
                }
            }
            Dk.a.a((Ju.b) obj, e1.this.disposables);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$b, reason: case insensitive filesystem */
    /* synthetic */ class C12573b extends AdaptedFunctionReference implements Function2<List<? extends Pj.a>, Continuation<? super Unit>, Object>, SuspendFunction {
        C12573b(Object obj) {
            super(2, obj, e1.class, "onLoadingStates", "onLoadingStates(Ljava/util/List;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<? extends Pj.a> list, Continuation<? super Unit> continuation) {
            return e1.T((e1) this.f143708a, list, continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lpv/g;", "", "LPj/a;", "", "it", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$2", f = "ProductsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$c, reason: case insensitive filesystem */
    static final class C12574c extends SuspendLambda implements Function3<InterfaceC16562g<? super List<? extends Pj.a>>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112086a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f112087b;

        C12574c(Continuation<? super C12574c> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super List<? extends Pj.a>> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            C12574c c12574c = new C12574c(continuation);
            c12574c.f112087b = th2;
            return c12574c.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f112086a == 0) {
                ResultKt.b(obj);
                qw.a.INSTANCE.f((Throwable) this.f112087b, "Caught exception on loadingStatesStream", new Object[0]);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$d, reason: case insensitive filesystem */
    /* synthetic */ class C12575d extends FunctionReferenceImpl implements Function1<List<? extends ProductState<ProductFullDetails>>, Unit> {
        C12575d(Object obj) {
            super(1, obj, e1.class, "onProductsState", "onProductsState(Ljava/util/List;)V", 0);
        }

        public final void a(List<ProductState<ProductFullDetails>> p02) {
            Intrinsics.j(p02, "p0");
            ((e1) this.receiver).D1(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends ProductState<ProductFullDetails>> list) {
            a(list);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$e, reason: case insensitive filesystem */
    /* synthetic */ class C12576e extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C12576e(Object obj) {
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
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$7", f = "ProductsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$g, reason: case insensitive filesystem */
    static final class C12578g extends SuspendLambda implements Function3<InterfaceC16562g<? super Qo.l>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112091a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f112092b;

        C12578g(Continuation<? super C12578g> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super Qo.l> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            C12578g c12578g = new C12578g(continuation);
            c12578g.f112092b = th2;
            return c12578g.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f112091a == 0) {
                ResultKt.b(obj);
                qw.a.INSTANCE.f((Throwable) this.f112092b, "Error in query state flow", new Object[0]);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$h, reason: case insensitive filesystem */
    /* synthetic */ class C12579h extends FunctionReferenceImpl implements Function1<Tq.k, Unit> {
        C12579h(Object obj) {
            super(1, obj, e1.class, "onStoreChange", "onStoreChange(Lcom/meijer/mobile/store/model/common/StoreSummary;)V", 0);
        }

        public final void a(Tq.k p02) {
            Intrinsics.j(p02, "p0");
            ((e1) this.receiver).H1(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Tq.k kVar) {
            a(kVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$i, reason: case insensitive filesystem */
    /* synthetic */ class C12580i extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C12580i(Object obj) {
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

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0015\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0015\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-¨\u0006."}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "", "<init>", "()V", "a", "p", "e", "t", "g", "f", "m", "s", "q", "u", "o", "r", "n", "b", "h", "c", "l", "i", "k", "j", "d", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$a;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$b;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$c;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$d;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$e;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$f;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$g;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$h;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$i;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$j;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$k;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$l;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$m;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$n;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$o;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$p;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$q;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$r;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$s;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$t;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$u;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j, reason: case insensitive filesystem */
    public static abstract class AbstractC12581j {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$a;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$a */
        public static final /* data */ class a extends AbstractC12581j {

            /* renamed from: a, reason: collision with root package name */
            public static final a f112093a = new a();

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
        public static final /* data */ class CollapseQuantityStepperAction extends AbstractC12581j {

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
        public static abstract class c extends AbstractC12581j {

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$c$a;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$c$a */
            public static final /* data */ class a extends c {

                /* renamed from: a, reason: collision with root package name */
                public static final a f112096a = new a();

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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$d;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "Lgi/a;", "analytics", "<init>", "(Lgi/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgi/a;", "()Lgi/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$d, reason: from toString */
        public static final /* data */ class GoogleAdClicked extends AbstractC12581j {

            /* renamed from: b, reason: collision with root package name */
            public static final int f112097b = GoogleAdAnalytics.f134240f;

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
        public static final /* data */ class ItemSelectedAction extends AbstractC12581j {

            /* renamed from: d, reason: collision with root package name */
            public static final int f112099d = ProductCardDecorator.f163361E;

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
        public static final /* data */ class f extends AbstractC12581j {

            /* renamed from: a, reason: collision with root package name */
            public static final f f112103a = new f();

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
        public static final /* data */ class g extends AbstractC12581j {

            /* renamed from: a, reason: collision with root package name */
            public static final g f112104a = new g();

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
        public static final /* data */ class ResetActiveStepper extends AbstractC12581j {

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

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$i;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "", "", "beacon", "formatLevelBeacon", "LUl/a;", "beaconType", "Lnk/c;", "product", "<init>", "(Ljava/util/List;Ljava/lang/String;LUl/a;Lnk/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "LUl/a;", "()LUl/a;", "d", "Lnk/c;", "()Lnk/c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$i, reason: from toString */
        public static final /* data */ class SendCriteoClickBeacon extends AbstractC12581j {

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

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$j;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "", "beacon", "formatLevelBeacon", "LUl/a;", "beaconType", "Lnk/c;", "product", "<init>", "(Ljava/lang/String;Ljava/lang/String;LUl/a;Lnk/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "LUl/a;", "()LUl/a;", "d", "Lnk/c;", "()Lnk/c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$j, reason: collision with other inner class name and from toString */
        public static final /* data */ class SendCriteoLoadBeacon extends AbstractC12581j {

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

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$k;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "", "", "beacon", "LUl/a;", "beaconType", "Lnk/c;", "product", "<init>", "(Ljava/util/List;LUl/a;Lnk/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "LUl/a;", "()LUl/a;", "c", "Lnk/c;", "()Lnk/c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$k, reason: from toString */
        public static final /* data */ class SendCriteoQtyStepperBeacon extends AbstractC12581j {

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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SendCriteoQtyStepperBeacon(List<String> beacon, Ul.a aVar, nk.c cVar) {
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
            public final Ul.a getBeaconType() {
                return this.beaconType;
            }

            /* renamed from: c, reason: from getter */
            public final nk.c getProduct() {
                return this.product;
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$l;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "", "", "beacon", "formatLevelBeacon", "LUl/a;", "beaconType", "Lnk/c;", "product", "<init>", "(Ljava/util/List;Ljava/lang/String;LUl/a;Lnk/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "LUl/a;", "()LUl/a;", "d", "Lnk/c;", "()Lnk/c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$l, reason: from toString */
        public static final /* data */ class SendCriteoViewBeacon extends AbstractC12581j {

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

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0012\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$m;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "", "title", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "setTitle", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$m, reason: from toString */
        public static final /* data */ class SendTitle extends AbstractC12581j {

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
        public static final /* data */ class SetFilterAndSortOptions extends AbstractC12581j {

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
        public static final /* data */ class StepperStateChangedAction extends AbstractC12581j {

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
        public static final /* data */ class p extends AbstractC12581j {

            /* renamed from: a, reason: collision with root package name */
            public static final p f112126a = new p();

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
        public static final /* data */ class UpdateEntryAction extends AbstractC12581j {

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
        public static final /* data */ class UserAcceptAddToCartAction extends AbstractC12581j {

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

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j$s;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$j;", "LCo/h;", "product", "LQo/l;", "query", "", "position", "<init>", "(LCo/h;LQo/l;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "b", "()LCo/h;", "LQo/l;", "c", "()LQo/l;", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$j$s, reason: from toString */
        public static final /* data */ class ViewProductDetailsAction extends AbstractC12581j {

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
        public static final /* data */ class t extends AbstractC12581j {

            /* renamed from: a, reason: collision with root package name */
            public static final t f112134a = new t();

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
        public static final /* data */ class ZeroResultsVisibilityAction extends AbstractC12581j {

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

        public /* synthetic */ AbstractC12581j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC12581j() {
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J/\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J7\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0015\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0018\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0015\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u000e2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J%\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u0005\u0010!J)\u0010&\u001a\u00020\u000e\"\u0004\b\u0000\u0010\"2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00028\u00000#H\u0016¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$k;", "Lwr/a;", "<init>", "(Lcom/meijer/mobile/meijer/activity/personalized/modals/e1;)V", "Lur/a;", "processedRequest", "", "b", "(Lur/a;)D", "Luk/c;", "Lfj/j;", "entryChange", "", "productCode", "", "c", "(Lur/a;Luk/c;Ljava/lang/String;)V", "f", "a", "", "requireCartOpenExtra", "entryUnitPrice", "d", "(ZLuk/c;DLjava/lang/String;)V", "e", "(Luk/c;DLjava/lang/String;)V", "Lfj/C;", "cartResource", "observeCart", "(Luk/c;)V", "LJu/a;", "getDisposable", "()LJu/a;", "(Lur/a;Luk/c;)V", "T", "Luk/a;", "Lvr/a;", "challenge", "throwChallenge", "(Luk/a;)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k, reason: case insensitive filesystem */
    private final class C12582k implements InterfaceC17909a {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k$a */
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
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$CartInteractionListener1$addCartEntry$1", f = "ProductsViewModel.kt", l = {2089}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k$b */
        static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f112137a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f112138b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(e1 e1Var, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f112138b = e1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f112138b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f112137a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f112138b._event;
                    AbstractC12585n.UpdateToCartFailedEvent updateToCartFailedEvent = new AbstractC12585n.UpdateToCartFailedEvent(C17284b.f163279I0);
                    this.f112137a = 1;
                    if (interfaceC16548A.emit(updateToCartFailedEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$CartInteractionListener1$addCartEntry$2", f = "ProductsViewModel.kt", l = {2097}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k$c */
        static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f112139a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f112140b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(e1 e1Var, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f112140b = e1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new c(this.f112140b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f112139a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f112140b._event;
                    AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
                    AbstractC12585n.ShowError showError = new AbstractC12585n.ShowError(companion.d(yr.Q.f171738F, new Object[0]), companion.d(yr.Q.f171737E, new Object[0]), companion.d(yr.Q.f171761b, new Object[0]));
                    this.f112139a = 1;
                    if (interfaceC16548A.emit(showError, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$CartInteractionListener1$addCartEntry$3", f = "ProductsViewModel.kt", l = {2110}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k$d */
        static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f112141a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f112142b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(e1 e1Var, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f112142b = e1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new d(this.f112142b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f112141a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f112142b._event;
                    AbstractC12585n.UpdateToCartFailedEvent updateToCartFailedEvent = new AbstractC12585n.UpdateToCartFailedEvent(C17284b.f163293P0);
                    this.f112141a = 1;
                    if (interfaceC16548A.emit(updateToCartFailedEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$CartInteractionListener1$addCartEntry$4", f = "ProductsViewModel.kt", l = {2117}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k$e */
        static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f112143a;

            /* renamed from: b, reason: collision with root package name */
            Object f112144b;

            /* renamed from: c, reason: collision with root package name */
            Object f112145c;

            /* renamed from: d, reason: collision with root package name */
            Object f112146d;

            /* renamed from: e, reason: collision with root package name */
            int f112147e;

            /* renamed from: f, reason: collision with root package name */
            int f112148f;

            /* renamed from: g, reason: collision with root package name */
            int f112149g;

            /* renamed from: h, reason: collision with root package name */
            int f112150h;

            /* renamed from: i, reason: collision with root package name */
            int f112151i;

            /* renamed from: j, reason: collision with root package name */
            private /* synthetic */ Object f112152j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ e1 f112153k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(e1 e1Var, Continuation<? super e> continuation) {
                super(2, continuation);
                this.f112153k = e1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                e eVar = new e(this.f112153k, continuation);
                eVar.f112152j = obj;
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
                int i10 = this.f112151i;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f112152j;
                        e1 e1Var = this.f112153k;
                        Result.Companion companion = Result.INSTANCE;
                        wr.f fVar = e1Var.cartInteractor;
                        this.f112152j = interfaceC15783O;
                        this.f112143a = interfaceC15783O;
                        this.f112144b = this;
                        this.f112145c = this;
                        this.f112146d = interfaceC15783O;
                        this.f112147e = 0;
                        this.f112148f = 0;
                        this.f112149g = 0;
                        this.f112150h = 0;
                        this.f112151i = 1;
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
                    qw.a.INSTANCE.l(thE, "fetchLatestCart failed in ProductsViewModel", new Object[0]);
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$CartInteractionListener1$addCartEntry$5", f = "ProductsViewModel.kt", l = {2135}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k$f */
        static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f112154a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f112155b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ uk.c<EntryChange> f112156c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new f(this.f112155b, this.f112156c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(e1 e1Var, uk.c<EntryChange> cVar, Continuation<? super f> continuation) {
                super(2, continuation);
                this.f112155b = e1Var;
                this.f112156c = cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Entry entry;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f112154a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f112155b._event;
                    int i11 = C17284b.f163319f;
                    int i12 = C17284b.f163301T0;
                    EntryChange entryChange = (EntryChange) ((c.Success) this.f112156c).a();
                    if (entryChange != null) {
                        entry = entryChange.getEntry();
                    } else {
                        entry = null;
                    }
                    AbstractC12585n.CartUpdateSuccessEvent cartUpdateSuccessEvent = new AbstractC12585n.CartUpdateSuccessEvent(i11, i12, entry);
                    this.f112154a = 1;
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
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$CartInteractionListener1$addCartEntry$6$1", f = "ProductsViewModel.kt", l = {2153}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k$g */
        static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f112157a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f112158b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ CartProductListDecorator f112159c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new g(this.f112158b, this.f112159c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(e1 e1Var, CartProductListDecorator cartProductListDecorator, Continuation<? super g> continuation) {
                super(2, continuation);
                this.f112158b = e1Var;
                this.f112159c = cartProductListDecorator;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f112157a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f112158b._event;
                    AbstractC12585n.OpenLowStockScreenEvent openLowStockScreenEvent = new AbstractC12585n.OpenLowStockScreenEvent(this.f112159c);
                    this.f112157a = 1;
                    if (interfaceC16548A.emit(openLowStockScreenEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$CartInteractionListener1$observeCart$1$1", f = "ProductsViewModel.kt", l = {1886}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k$h */
        static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f112160a;

            /* renamed from: b, reason: collision with root package name */
            Object f112161b;

            /* renamed from: c, reason: collision with root package name */
            Object f112162c;

            /* renamed from: d, reason: collision with root package name */
            Object f112163d;

            /* renamed from: e, reason: collision with root package name */
            Object f112164e;

            /* renamed from: f, reason: collision with root package name */
            Object f112165f;

            /* renamed from: g, reason: collision with root package name */
            Object f112166g;

            /* renamed from: h, reason: collision with root package name */
            int f112167h;

            /* renamed from: i, reason: collision with root package name */
            int f112168i;

            /* renamed from: j, reason: collision with root package name */
            int f112169j;

            /* renamed from: k, reason: collision with root package name */
            int f112170k;

            /* renamed from: l, reason: collision with root package name */
            int f112171l;

            /* renamed from: m, reason: collision with root package name */
            int f112172m;

            /* renamed from: n, reason: collision with root package name */
            private /* synthetic */ Object f112173n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ uk.c<ShoppingCart> f112174o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ e1 f112175p;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                h hVar = new h(this.f112174o, this.f112175p, continuation);
                hVar.f112173n = obj;
                return hVar;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(uk.c<ShoppingCart> cVar, e1 e1Var, Continuation<? super h> continuation) {
                super(2, continuation);
                this.f112174o = cVar;
                this.f112175p = e1Var;
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
            public final java.lang.Object invokeSuspend(java.lang.Object r35) {
                /*
                    Method dump skipped, instructions count: 255
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.personalized.modals.e1.C12582k.h.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$CartInteractionListener1$removeCartEntry$1", f = "ProductsViewModel.kt", l = {1975}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k$i */
        static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f112176a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f112177b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ uk.c<EntryChange> f112178c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new i(this.f112177b, this.f112178c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(e1 e1Var, uk.c<EntryChange> cVar, Continuation<? super i> continuation) {
                super(2, continuation);
                this.f112177b = e1Var;
                this.f112178c = cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Entry entry;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f112176a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f112177b._event;
                    int i11 = C17284b.f163336n0;
                    int i12 = C17284b.f163301T0;
                    EntryChange entryChange = (EntryChange) ((c.Success) this.f112178c).a();
                    if (entryChange != null) {
                        entry = entryChange.getEntry();
                    } else {
                        entry = null;
                    }
                    AbstractC12585n.CartUpdateSuccessEvent cartUpdateSuccessEvent = new AbstractC12585n.CartUpdateSuccessEvent(i11, i12, entry);
                    this.f112176a = 1;
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
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$CartInteractionListener1$removeCartEntry$2", f = "ProductsViewModel.kt", l = {1992}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k$j */
        static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f112179a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f112180b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(e1 e1Var, Continuation<? super j> continuation) {
                super(2, continuation);
                this.f112180b = e1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new j(this.f112180b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f112179a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f112180b._event;
                    AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
                    AbstractC12585n.ShowError showError = new AbstractC12585n.ShowError(companion.d(yr.Q.f171738F, new Object[0]), companion.d(yr.Q.f171737E, new Object[0]), companion.d(yr.Q.f171761b, new Object[0]));
                    this.f112179a = 1;
                    if (interfaceC16548A.emit(showError, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$CartInteractionListener1$removeCartEntry$3", f = "ProductsViewModel.kt", l = {2002}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k$k, reason: collision with other inner class name */
        static final class C1726k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f112181a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f112182b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1726k(e1 e1Var, Continuation<? super C1726k> continuation) {
                super(2, continuation);
                this.f112182b = e1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1726k(this.f112182b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C1726k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f112181a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f112182b._event;
                    AbstractC12585n.UpdateToCartFailedEvent updateToCartFailedEvent = new AbstractC12585n.UpdateToCartFailedEvent(C17284b.f163293P0);
                    this.f112181a = 1;
                    if (interfaceC16548A.emit(updateToCartFailedEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$CartInteractionListener1$throwChallenge$1", f = "ProductsViewModel.kt", l = {2251}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k$l */
        static final class l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f112183a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f112184b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC17720a.ChokingHazardChallenge f112185c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new l(this.f112184b, this.f112185c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            l(e1 e1Var, AbstractC17720a.ChokingHazardChallenge chokingHazardChallenge, Continuation<? super l> continuation) {
                super(2, continuation);
                this.f112184b = e1Var;
                this.f112185c = chokingHazardChallenge;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f112183a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f112184b._event;
                    AbstractC12585n.ShowChokingWarningDialogEvent showChokingWarningDialogEvent = new AbstractC12585n.ShowChokingWarningDialogEvent(this.f112185c.a());
                    this.f112183a = 1;
                    if (interfaceC16548A.emit(showChokingWarningDialogEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$CartInteractionListener1$updateCartEntry$1", f = "ProductsViewModel.kt", l = {2020}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k$m */
        static final class m extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f112186a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f112187b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            m(e1 e1Var, Continuation<? super m> continuation) {
                super(2, continuation);
                this.f112187b = e1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new m(this.f112187b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((m) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f112186a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f112187b._event;
                    AbstractC12585n.UpdateToCartFailedEvent updateToCartFailedEvent = new AbstractC12585n.UpdateToCartFailedEvent(C17284b.f163293P0);
                    this.f112186a = 1;
                    if (interfaceC16548A.emit(updateToCartFailedEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$CartInteractionListener1$updateCartEntry$2", f = "ProductsViewModel.kt", l = {2026}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k$n */
        static final class n extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f112188a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f112189b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ uk.c<EntryChange> f112190c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new n(this.f112189b, this.f112190c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(e1 e1Var, uk.c<EntryChange> cVar, Continuation<? super n> continuation) {
                super(2, continuation);
                this.f112189b = e1Var;
                this.f112190c = cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((n) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Entry entry;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f112188a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f112189b._event;
                    int i11 = C17284b.f163357y;
                    int i12 = C17284b.f163301T0;
                    EntryChange entryChangeA = this.f112190c.a();
                    if (entryChangeA != null) {
                        entry = entryChangeA.getEntry();
                    } else {
                        entry = null;
                    }
                    AbstractC12585n.CartUpdateSuccessEvent cartUpdateSuccessEvent = new AbstractC12585n.CartUpdateSuccessEvent(i11, i12, entry);
                    this.f112188a = 1;
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
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$CartInteractionListener1$updateCartEntry$3$1", f = "ProductsViewModel.kt", l = {2062}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$k$o */
        static final class o extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f112191a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e1 f112192b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            o(e1 e1Var, Continuation<? super o> continuation) {
                super(2, continuation);
                this.f112192b = e1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new o(this.f112192b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((o) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f112191a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16548A interfaceC16548A = this.f112192b._event;
                    AbstractC12585n.UpdateToCartFailedEvent updateToCartFailedEvent = new AbstractC12585n.UpdateToCartFailedEvent(C17284b.f163279I0);
                    this.f112191a = 1;
                    if (interfaceC16548A.emit(updateToCartFailedEvent, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        public C12582k() {
        }

        private final void a(AbstractC17454a processedRequest, uk.c<EntryChange> entryChange, String productCode) {
            Entry entry;
            Entry entry2;
            ProductFullDetails productFullDetailsM;
            if (entryChange instanceof c.Failure) {
                c.Failure failure = (c.Failure) entryChange;
                EntryChange entryChange2 = (EntryChange) failure.a();
                if ((entryChange2 != null ? entryChange2.getStatusCode() : null) == EntryChange.c.f131921c) {
                    C15809k.d(androidx.view.d0.a(e1.this), null, null, new b(e1.this, null), 3, null);
                } else {
                    Throwable error = failure.getError();
                    HttpException httpException = error instanceof HttpException ? (HttpException) error : null;
                    if (httpException == null || httpException.code() != 503) {
                        qw.a.INSTANCE.f(failure.getError(), "Resource.Failure<EntryChange>", new Object[0]);
                        C15809k.d(androidx.view.d0.a(e1.this), null, null, new d(e1.this, null), 3, null);
                        e1 e1Var = e1.this;
                        EntryChange entryChange3 = (EntryChange) failure.a();
                        e1Var.d2((entryChange3 == null || (entry2 = entryChange3.getEntry()) == null || (productFullDetailsM = entry2.m()) == null) ? null : productFullDetailsM.getCode());
                        Unit unit = Unit.f143329a;
                    } else {
                        C15809k.d(androidx.view.d0.a(e1.this), null, null, new c(e1.this, null), 3, null);
                    }
                }
                C15809k.d(androidx.view.d0.a(e1.this), null, null, new e(e1.this, null), 3, null);
                return;
            }
            if (!(entryChange instanceof c.Success)) {
                if (!(entryChange instanceof c.Loading)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            d(true, entryChange, b(processedRequest), productCode);
            if (e1.this.j2(entryChange)) {
                qw.a.INSTANCE.a("Not emitting Event.CartUpdateSuccessEvent because we show free snackbar from cart update", new Object[0]);
            } else {
                C15809k.d(androidx.view.d0.a(e1.this), null, null, new f(e1.this, entryChange, null), 3, null);
            }
            EntryChange entryChange4 = (EntryChange) ((c.Success) entryChange).a();
            if (entryChange4 == null || (entry = entryChange4.getEntry()) == null) {
                return;
            }
            e1 e1Var2 = e1.this;
            CartProductListDecorator cartProductListDecoratorB = CartProductListDecorator.Companion.b(CartProductListDecorator.INSTANCE, entry, false, 2, null);
            if (cartProductListDecoratorB.getStockInfo().c()) {
                C15809k.d(androidx.view.d0.a(e1Var2), null, null, new g(e1Var2, cartProductListDecoratorB, null), 3, null);
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
                ShoppingCart shoppingCart2 = e1.this.o1().getValue().getShoppingCart();
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
            if ((processedRequest instanceof AbstractC17454a.Remove) && (shoppingCart = e1.this.o1().getValue().getShoppingCart()) != null && (listP = shoppingCart.p()) != null) {
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
                if (!e1.this.j2(entryChange)) {
                    C15809k.d(androidx.view.d0.a(e1.this), null, null, new i(e1.this, entryChange, null), 3, null);
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
                    C15809k.d(androidx.view.d0.a(e1.this), null, null, new j(e1.this, null), 3, null);
                    return;
                }
            }
            C15809k.d(androidx.view.d0.a(e1.this), null, null, new C1726k(e1.this, null), 3, null);
        }

        private final void d(boolean requireCartOpenExtra, uk.c<EntryChange> entryChange, double entryUnitPrice, String productCode) {
            Entry entry;
            Entry entry2;
            ProductFullDetails productFullDetailsM;
            Entry entry3;
            ProductFullDetails productFullDetailsM2;
            e1 e1Var = e1.this;
            EntryChange entryChangeA = entryChange.a();
            W.ComplexPromo aVarA1 = e1Var.a1((entryChangeA == null || (entry3 = entryChangeA.getEntry()) == null || (productFullDetailsM2 = entry3.m()) == null) ? null : productFullDetailsM2.getCode());
            pp.d dVar = e1.this.productMetadataStore;
            EntryChange entryChangeA2 = entryChange.a();
            boolean zC = dVar.c((entryChangeA2 == null || (entry2 = entryChangeA2.getEntry()) == null || (productFullDetailsM = entry2.m()) == null) ? null : productFullDetailsM.getCode());
            boolean zL1 = e1.this.l1(productCode);
            String strI1 = e1.this.i1();
            Iterator<ProductListDecorator> it = ((ViewState) e1.this._viewState.getValue()).q().iterator();
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
            e1.this.analyticsEngine.k(C2898u.f1904a.j0(entryChange, e1.this.o1().getValue().g(), requireCartOpenExtra, (Qo.l) e1.this.h1().getValue(), e1.this.cartId, e1.this.getCampaignIdValue(), e1.this.getDepartmentCarouselAnalytics(), e1.this.getCollectionName(), e1.this.getCmpid(), e1.this.sponsorshipsDataStore, zC, zL1, true, entryUnitPrice, aVarA1, String.valueOf(numValueOf != null ? Integer.valueOf(numValueOf.intValue() + 1) : null), e1.this.getCarouselTitleAnalytics(), false, "lowStock", "mPerks: Earn", String.valueOf(((ViewState) e1.this._viewState.getValue()).getCartDecorator().getItemCount()), strI1));
        }

        private final void e(uk.c<EntryChange> entryChange, double entryUnitPrice, String productCode) {
            Entry entry;
            ProductFullDetails productFullDetailsM;
            Entry entry2;
            Entry entry3;
            ProductFullDetails productFullDetailsM2;
            e1 e1Var = e1.this;
            EntryChange entryChangeA = entryChange.a();
            String code = null;
            int i10 = 0;
            CouponState cVarB1 = e1.b1(e1Var, (entryChangeA == null || (entry3 = entryChangeA.getEntry()) == null || (productFullDetailsM2 = entry3.m()) == null) ? null : productFullDetailsM2.getCode(), false, 2, null);
            Iterator<ProductListDecorator> it = ((ViewState) e1.this._viewState.getValue()).q().iterator();
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
            String strI1 = e1.this.i1();
            InterfaceC14523a interfaceC14523a = e1.this.analyticsEngine;
            C2898u c2898u = C2898u.f1904a;
            String strN1 = e1.this.n1();
            String str = e1.this.cartId;
            pp.d dVar = e1.this.productMetadataStore;
            EntryChange entryChangeA3 = entryChange.a();
            if (entryChangeA3 != null && (entry = entryChangeA3.getEntry()) != null && (productFullDetailsM = entry.m()) != null) {
                code = productFullDetailsM.getCode();
            }
            interfaceC14523a.k(c2898u.m0(strN1, str, dVar.c(code), (Qo.l) e1.this.h1().getValue(), entryChange, e1.this.sponsorshipsDataStore, cVarB1, e1.this.getCouponList(entryChange.a()), entryUnitPrice, e1.this.l1(productCode), true, true, numValueOf2, String.valueOf(((ViewState) e1.this._viewState.getValue()).getCartDecorator().getItemCount()), "lowStock", "mPerks: Earn", strI1));
        }

        private final void f(AbstractC17454a processedRequest, uk.c<EntryChange> entryChange, String productCode) {
            if (entryChange instanceof c.Failure) {
                C15809k.d(androidx.view.d0.a(e1.this), null, null, new m(e1.this, null), 3, null);
            }
            if (e1.this.j2(entryChange)) {
                qw.a.INSTANCE.a("Not emitting Event.CartUpdateSuccessEvent because we show free snackbar from cart update", new Object[0]);
            } else {
                C15809k.d(androidx.view.d0.a(e1.this), null, null, new n(e1.this, entryChange, null), 3, null);
            }
            EntryChange entryChangeA = entryChange.a();
            if (entryChangeA != null) {
                e1 e1Var = e1.this;
                int i10 = a.$EnumSwitchMapping$0[entryChangeA.getStatusCode().ordinal()];
                if (i10 != 1 && i10 != 2) {
                    if (i10 != 3) {
                        return;
                    }
                    C15809k.d(androidx.view.d0.a(e1Var), null, null, new o(e1Var, null), 3, null);
                    return;
                }
                e1Var.j2(entryChange);
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
            return e1.this.disposables;
        }

        @Override // wr.InterfaceC17909a
        public void observeCart(uk.c<ShoppingCart> cartResource) {
            Object value;
            if (e1.this.userManager.b() && cartResource != null) {
                e1 e1Var = e1.this;
                C15809k.d(androidx.view.d0.a(e1Var), null, null, new h(cartResource, e1Var, null), 3, null);
                InterfaceC16549B interfaceC16549B = e1Var._viewState;
                do {
                    value = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value, ViewState.c((ViewState) value, null, null, null, null, false, false, false, null, null, null, null, null, null, cartResource.a(), null, null, false, null, null, null, null, 0, 0, false, false, null, null, null, 268427263, null).a()));
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
            C15809k.d(androidx.view.d0.a(e1.this), null, null, new l(e1.this, (AbstractC17720a.ChokingHazardChallenge) abstractC17720aF, null), 3, null);
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

    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0018\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0018\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123¨\u00064"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "", "<init>", "()V", "k", "l", "x", "g", "j", "m", "i", "s", "n", "a", "c", "h", "v", "w", "t", "r", "u", "o", "p", "f", "b", "d", "q", "e", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$a;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$b;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$c;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$d;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$e;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$f;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$g;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$h;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$i;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$j;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$k;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$l;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$m;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$n;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$o;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$p;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$q;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$r;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$s;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$t;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$u;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$v;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$w;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$x;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n, reason: case insensitive filesystem */
    public static abstract class AbstractC12585n {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0007R\u0017\u0010\u0016\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$a;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lnk/c;", "a", "Lnk/c;", "c", "()Lnk/c;", "product", "b", "I", "messageResId", "actionResId", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$a, reason: from toString */
        public static final /* data */ class AddToShoppingListSuccessEvent extends AbstractC12585n {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final nk.c product;

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
            public final nk.c getProduct() {
                return this.product;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$b;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "LQo/l$k;", "query", "<init>", "(LQo/l$k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LQo/l$k;", "()LQo/l$k;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$b, reason: from toString */
        public static final /* data */ class BubbleFacetsToFilterAndSort extends AbstractC12585n {

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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$c;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "", "messageResId", "actionResId", "Lfj/i;", "entry", "<init>", "(IILfj/i;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "Lfj/i;", "getEntry", "()Lfj/i;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$c, reason: from toString */
        public static final /* data */ class CartUpdateSuccessEvent extends AbstractC12585n {

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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$d;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "", "titleResId", "messageResId", "positiveButtonResId", "negativeButtonResId", "LPk/a;", "coupon", "<init>", "(IIIILPk/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "e", "b", "c", "d", "LPk/a;", "()LPk/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$d, reason: from toString */
        public static final /* data */ class ClipCouponFailedEvent extends AbstractC12585n {

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
        public static final /* data */ class e extends AbstractC12585n {

            /* renamed from: a, reason: collision with root package name */
            public static final e f112208a = new e();

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
        public static final /* data */ class LaunchFilterAndSortEvent extends AbstractC12585n {

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
        public static final /* data */ class g extends AbstractC12585n {

            /* renamed from: a, reason: collision with root package name */
            public static final g f112210a = new g();

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
        public static final /* data */ class OpenLowStockScreenEvent extends AbstractC12585n {

            /* renamed from: b, reason: collision with root package name */
            public static final int f112211b = CartProductListDecorator.f166190s;

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
        public static final /* data */ class i extends AbstractC12585n {

            /* renamed from: a, reason: collision with root package name */
            public static final i f112213a = new i();

            private i() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof i);
            }

            public int hashCode() {
                return -2078363535;
            }

            public String toString() {
                return "PreviousTrackState";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$j;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$j */
        public static final /* data */ class j extends AbstractC12585n {

            /* renamed from: a, reason: collision with root package name */
            public static final j f112214a = new j();

            private j() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof j);
            }

            public int hashCode() {
                return 348589674;
            }

            public String toString() {
                return "ProactiveSubstituteSuccess";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$k;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "a", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "()Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "retrofitException", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$k, reason: from toString */
        public static final /* data */ class ProductListErrorEvent extends AbstractC12585n {

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

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$l;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "messageResId", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$l, reason: from toString */
        public static final /* data */ class ProductListSuccess extends AbstractC12585n {

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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$m;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$m */
        public static final /* data */ class m extends AbstractC12585n {

            /* renamed from: a, reason: collision with root package name */
            public static final m f112217a = new m();

            private m() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof m);
            }

            public int hashCode() {
                return 180265340;
            }

            public String toString() {
                return "ReactiveSubstituteSuccess";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u0007R\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$n;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "messageResId", "b", "titleResId", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$n, reason: collision with other inner class name and from toString */
        public static final /* data */ class ShoppingListUpdateFailedEvent extends AbstractC12585n {

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

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$o;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "LIr/a;", "Lur/a;", "dialogInfo", "<init>", "(LIr/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIr/a;", "()LIr/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$o, reason: from toString */
        public static final /* data */ class ShowChokingWarningDialogEvent extends AbstractC12585n {

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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$p;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "Lbk/a;", "title", "message", "positiveButtonText", "<init>", "(Lbk/a;Lbk/a;Lbk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbk/a;", "c", "()Lbk/a;", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$p, reason: from toString */
        public static final /* data */ class ShowError extends AbstractC12585n {

            /* renamed from: d, reason: collision with root package name */
            public static final int f112221d = AbstractC6392a.f60445b;

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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$q;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "Lbk/a;", "message", "<init>", "(Lbk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbk/a;", "()Lbk/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$q, reason: from toString */
        public static final /* data */ class ShowFreeItemsSnackbar extends AbstractC12585n {

            /* renamed from: b, reason: collision with root package name */
            public static final int f112225b = AbstractC6392a.f60445b;

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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$r;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "LCo/h;", "product", "<init>", "(LCo/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$r, reason: from toString */
        public static final /* data */ class ShowPlpEvent extends AbstractC12585n {

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

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$s;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "", "messageResId", "titleResId", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$s, reason: from toString */
        public static final /* data */ class SubstitutionFailureEvent extends AbstractC12585n {

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

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$t;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "", "totalProductCount", "", "firstProductName", "outOfStockList", "lowStockList", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "Ljava/lang/String;", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$t, reason: from toString */
        public static final /* data */ class UpdateProductsInfoEvent extends AbstractC12585n {

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

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$u;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "", "messageResId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$u, reason: from toString */
        public static final /* data */ class UpdateToCartFailedEvent extends AbstractC12585n {

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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$v;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lnk/f;", "a", "Lnk/f;", "()Lnk/f;", "product", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$v, reason: from toString */
        public static final /* data */ class ViewItemInShoppingListEvent extends AbstractC12585n {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final nk.f product;

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
            public final nk.f getProduct() {
                return this.product;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$w;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "LCo/h;", "product", "<init>", "(LCo/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$w, reason: from toString */
        public static final /* data */ class ViewProductDetailsEvent extends AbstractC12585n {

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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n$x;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$n;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$n$x */
        public static final /* data */ class x extends AbstractC12585n {

            /* renamed from: a, reason: collision with root package name */
            public static final x f112237a = new x();

            private x() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof x);
            }

            public int hashCode() {
                return 341556059;
            }

            public String toString() {
                return "ViewShoppingListEvent";
            }
        }

        public /* synthetic */ AbstractC12585n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC12585n() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0011\u0010\u001b\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$o;", "", "", "searchTerm", "spellSuggestionTerm", "", "noResultVisibility", "suggestionVisibility", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSearchTerm", "b", "c", "I", "d", "Lbk/a;", "()Lbk/a;", "noResultSearchMessage", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

        public final AbstractC6392a a() {
            return AbstractC6392a.INSTANCE.d(C18372b.f172059j, this.searchTerm);
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
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$p, reason: case insensitive filesystem and from toString */
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

    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bN\b\u0087\b\u0018\u00002\u00020\u0001Bß\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000f\u0012\u0018\b\u0002\u0010\u0016\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0014\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\b\b\u0002\u0010!\u001a\u00020\t\u0012\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f\u0012\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f\u0012\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f\u0012\b\b\u0002\u0010'\u001a\u00020&\u0012\b\b\u0002\u0010(\u001a\u00020&\u0012\b\b\u0002\u0010)\u001a\u00020\t\u0012\b\b\u0002\u0010*\u001a\u00020\t\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010+¢\u0006\u0004\b/\u00100J\u001b\u00102\u001a\u0004\u0018\u00010\u00062\b\u00101\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u0000¢\u0006\u0004\b4\u00105Jì\u0002\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000f2\u0018\b\u0002\u0010\u0016\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\t2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020\t2\b\b\u0002\u0010*\u001a\u00020\t2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010+HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020&HÖ\u0001¢\u0006\u0004\b:\u0010;J\u001a\u0010=\u001a\u00020\t2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bI\u0010F\u001a\u0004\bJ\u0010HR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bO\u0010L\u001a\u0004\bP\u0010NR\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bQ\u0010L\u001a\u0004\bR\u0010NR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u001f\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000f8\u0006¢\u0006\f\n\u0004\b[\u0010X\u001a\u0004\bO\u0010ZR'\u0010\u0016\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00148\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\bQ\u0010^R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bU\u0010c\u001a\u0004\bd\u0010eR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bd\u0010j\u001a\u0004\bk\u0010lR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bC\u0010m\u001a\u0004\bI\u0010nR\u0017\u0010!\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bY\u0010L\u001a\u0004\b_\u0010NR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f8\u0006¢\u0006\f\n\u0004\bh\u0010X\u001a\u0004\bK\u0010ZR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f8\u0006¢\u0006\f\n\u0004\bo\u0010X\u001a\u0004\bp\u0010ZR\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f8\u0006¢\u0006\f\n\u0004\bq\u0010X\u001a\u0004\br\u0010ZR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f8\u0006¢\u0006\f\n\u0004\bG\u0010X\u001a\u0004\bq\u0010ZR\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b2\u0010s\u001a\u0004\bt\u0010;R\u0017\u0010(\u001a\u00020&8\u0006¢\u0006\f\n\u0004\bt\u0010s\u001a\u0004\bS\u0010;R\u0017\u0010)\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bu\u0010L\u001a\u0004\bo\u0010NR\u0017\u0010*\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bp\u0010L\u001a\u0004\bf\u0010NR\u0019\u0010,\u001a\u0004\u0018\u00010+8\u0006¢\u0006\f\n\u0004\bM\u0010v\u001a\u0004\bW\u0010wR\u0019\u0010-\u001a\u0004\u0018\u00010+8\u0006¢\u0006\f\n\u0004\bP\u0010v\u001a\u0004\b[\u0010wR\u0019\u0010.\u001a\u0004\u0018\u00010+8\u0006¢\u0006\f\n\u0004\bR\u0010v\u001a\u0004\b\\\u0010wR\u0011\u0010x\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\bu\u0010;¨\u0006y"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$q;", "", "LTq/k;", "storeDetails", "LQo/l;", "productQuery", "Lbk/a;", "title", "recommendationCarouselTitle", "", "isBuyAgain", "isFavoriteOnSale", "isWhiteLabelCarousel", "LPj/a;", "loadingState", "", "Lvs/f;", "products", "LYk/c;", "couponsStateList", "", "", "couponsStateMap", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$p;", "sponsoredProductsWrapper", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$o;", "noProductResult", "Lfj/C;", "shoppingCart", "Ljj/c;", "nextFulfillmentSlot", "Lik/a;", "cartDecorator", "itemSelected", "clickBeaconsSent", "viewBeaconsSent", "loadBeaconsSent", "stepperBeaconsSent", "", "tokenMatch", "embeddingsMatch", "shouldShowZeroResults", "lowStockBackupTracked", "Lgi/d;", "googleAdSlot1", "googleAdSlot2", "googleAdSlot3", "<init>", "(LTq/k;LQo/l;Lbk/a;Lbk/a;ZZZLPj/a;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$p;Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$o;Lfj/C;Ljj/c;Lik/a;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;IIZZLgi/d;Lgi/d;Lgi/d;)V", "query", "v", "(LQo/l;)Lbk/a;", "a", "()Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$q;", "b", "(LTq/k;LQo/l;Lbk/a;Lbk/a;ZZZLPj/a;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$p;Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$o;Lfj/C;Ljj/c;Lik/a;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;IIZZLgi/d;Lgi/d;Lgi/d;)Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$q;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LTq/k;", "getStoreDetails", "()LTq/k;", "LQo/l;", "p", "()LQo/l;", "c", "Lbk/a;", "u", "()Lbk/a;", "d", "getRecommendationCarouselTitle", "e", "Z", "z", "()Z", "f", "A", "g", "B", "h", "LPj/a;", "m", "()LPj/a;", "i", "Ljava/util/List;", "q", "()Ljava/util/List;", "j", "k", "Ljava/util/Map;", "()Ljava/util/Map;", "l", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$p;", "getSponsoredProductsWrapper", "()Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$p;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$o;", "o", "()Lcom/meijer/mobile/meijer/activity/personalized/modals/e1$o;", "n", "Lfj/C;", "r", "()Lfj/C;", "Ljj/c;", "getNextFulfillmentSlot", "()Ljj/c;", "Lik/a;", "()Lik/a;", "s", "y", "t", "getLoadBeaconsSent", "I", "w", "x", "Lgi/d;", "()Lgi/d;", "totalCount", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$q, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
        private final GoogleAdData googleAdSlot2;

        /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
        private final GoogleAdData googleAdSlot3;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Tq.k storeDetails;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Qo.l productQuery;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a title;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a recommendationCarouselTitle;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isBuyAgain;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFavoriteOnSale;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isWhiteLabelCarousel;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final Pj.a loadingState;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ProductListDecorator> products;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<CouponState> couponsStateList;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, CouponState> couponsStateMap;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final SponsoredProductsWrapper sponsoredProductsWrapper;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final NoResultDecorator noProductResult;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final ShoppingCart shoppingCart;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final FulfillmentSlot nextFulfillmentSlot;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final CartPreviewDecorator cartDecorator;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean itemSelected;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> clickBeaconsSent;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> viewBeaconsSent;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> loadBeaconsSent;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> stepperBeaconsSent;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final int tokenMatch;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final int embeddingsMatch;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldShowZeroResults;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean lowStockBackupTracked;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        private final GoogleAdData googleAdSlot1;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.e1$q$a */
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

        public ViewState(Tq.k storeDetails, Qo.l productQuery, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, boolean z10, boolean z11, boolean z12, Pj.a loadingState, List<ProductListDecorator> products, List<CouponState> couponsStateList, Map<String, CouponState> couponsStateMap, SponsoredProductsWrapper sponsoredProductsWrapper, NoResultDecorator noProductResult, ShoppingCart shoppingCart, FulfillmentSlot fulfillmentSlot, CartPreviewDecorator cartDecorator, boolean z13, List<String> clickBeaconsSent, List<String> viewBeaconsSent, List<String> loadBeaconsSent, List<String> stepperBeaconsSent, int i10, int i11, boolean z14, boolean z15, GoogleAdData googleAdData, GoogleAdData googleAdData2, GoogleAdData googleAdData3) {
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
            this.title = abstractC6392a;
            this.recommendationCarouselTitle = abstractC6392a2;
            this.isBuyAgain = z10;
            this.isFavoriteOnSale = z11;
            this.isWhiteLabelCarousel = z12;
            this.loadingState = loadingState;
            this.products = products;
            this.couponsStateList = couponsStateList;
            this.couponsStateMap = couponsStateMap;
            this.sponsoredProductsWrapper = sponsoredProductsWrapper;
            this.noProductResult = noProductResult;
            this.shoppingCart = shoppingCart;
            this.nextFulfillmentSlot = fulfillmentSlot;
            this.cartDecorator = cartDecorator;
            this.itemSelected = z13;
            this.clickBeaconsSent = clickBeaconsSent;
            this.viewBeaconsSent = viewBeaconsSent;
            this.loadBeaconsSent = loadBeaconsSent;
            this.stepperBeaconsSent = stepperBeaconsSent;
            this.tokenMatch = i10;
            this.embeddingsMatch = i11;
            this.shouldShowZeroResults = z14;
            this.lowStockBackupTracked = z15;
            this.googleAdSlot1 = googleAdData;
            this.googleAdSlot2 = googleAdData2;
            this.googleAdSlot3 = googleAdData3;
        }

        public static /* synthetic */ ViewState c(ViewState viewState, Tq.k kVar, Qo.l lVar, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, boolean z10, boolean z11, boolean z12, Pj.a aVar, List list, List list2, Map map, SponsoredProductsWrapper sponsoredProductsWrapper, NoResultDecorator noResultDecorator, ShoppingCart shoppingCart, FulfillmentSlot fulfillmentSlot, CartPreviewDecorator cartPreviewDecorator, boolean z13, List list3, List list4, List list5, List list6, int i10, int i11, boolean z14, boolean z15, GoogleAdData googleAdData, GoogleAdData googleAdData2, GoogleAdData googleAdData3, int i12, Object obj) {
            GoogleAdData googleAdData4;
            GoogleAdData googleAdData5;
            Tq.k kVar2 = (i12 & 1) != 0 ? viewState.storeDetails : kVar;
            Qo.l lVar2 = (i12 & 2) != 0 ? viewState.productQuery : lVar;
            AbstractC6392a abstractC6392a3 = (i12 & 4) != 0 ? viewState.title : abstractC6392a;
            AbstractC6392a abstractC6392a4 = (i12 & 8) != 0 ? viewState.recommendationCarouselTitle : abstractC6392a2;
            boolean z16 = (i12 & 16) != 0 ? viewState.isBuyAgain : z10;
            boolean z17 = (i12 & 32) != 0 ? viewState.isFavoriteOnSale : z11;
            boolean z18 = (i12 & 64) != 0 ? viewState.isWhiteLabelCarousel : z12;
            Pj.a aVar2 = (i12 & 128) != 0 ? viewState.loadingState : aVar;
            List list7 = (i12 & 256) != 0 ? viewState.products : list;
            List list8 = (i12 & 512) != 0 ? viewState.couponsStateList : list2;
            Map map2 = (i12 & 1024) != 0 ? viewState.couponsStateMap : map;
            SponsoredProductsWrapper sponsoredProductsWrapper2 = (i12 & RecyclerView.m.FLAG_MOVED) != 0 ? viewState.sponsoredProductsWrapper : sponsoredProductsWrapper;
            NoResultDecorator noResultDecorator2 = (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? viewState.noProductResult : noResultDecorator;
            ShoppingCart shoppingCart2 = (i12 & 8192) != 0 ? viewState.shoppingCart : shoppingCart;
            Tq.k kVar3 = kVar2;
            FulfillmentSlot fulfillmentSlot2 = (i12 & 16384) != 0 ? viewState.nextFulfillmentSlot : fulfillmentSlot;
            CartPreviewDecorator cartPreviewDecorator2 = (i12 & 32768) != 0 ? viewState.cartDecorator : cartPreviewDecorator;
            boolean z19 = (i12 & 65536) != 0 ? viewState.itemSelected : z13;
            List list9 = (i12 & 131072) != 0 ? viewState.clickBeaconsSent : list3;
            List list10 = (i12 & 262144) != 0 ? viewState.viewBeaconsSent : list4;
            List list11 = (i12 & 524288) != 0 ? viewState.loadBeaconsSent : list5;
            List list12 = (i12 & 1048576) != 0 ? viewState.stepperBeaconsSent : list6;
            int i13 = (i12 & 2097152) != 0 ? viewState.tokenMatch : i10;
            int i14 = (i12 & 4194304) != 0 ? viewState.embeddingsMatch : i11;
            boolean z20 = (i12 & 8388608) != 0 ? viewState.shouldShowZeroResults : z14;
            boolean z21 = (i12 & 16777216) != 0 ? viewState.lowStockBackupTracked : z15;
            GoogleAdData googleAdData6 = (i12 & 33554432) != 0 ? viewState.googleAdSlot1 : googleAdData;
            GoogleAdData googleAdData7 = (i12 & 67108864) != 0 ? viewState.googleAdSlot2 : googleAdData2;
            if ((i12 & 134217728) != 0) {
                googleAdData5 = googleAdData7;
                googleAdData4 = viewState.googleAdSlot3;
            } else {
                googleAdData4 = googleAdData3;
                googleAdData5 = googleAdData7;
            }
            return viewState.b(kVar3, lVar2, abstractC6392a3, abstractC6392a4, z16, z17, z18, aVar2, list7, list8, map2, sponsoredProductsWrapper2, noResultDecorator2, shoppingCart2, fulfillmentSlot2, cartPreviewDecorator2, z19, list9, list10, list11, list12, i13, i14, z20, z21, googleAdData6, googleAdData5, googleAdData4);
        }

        public final ViewState b(Tq.k storeDetails, Qo.l productQuery, AbstractC6392a title, AbstractC6392a recommendationCarouselTitle, boolean isBuyAgain, boolean isFavoriteOnSale, boolean isWhiteLabelCarousel, Pj.a loadingState, List<ProductListDecorator> products, List<CouponState> couponsStateList, Map<String, CouponState> couponsStateMap, SponsoredProductsWrapper sponsoredProductsWrapper, NoResultDecorator noProductResult, ShoppingCart shoppingCart, FulfillmentSlot nextFulfillmentSlot, CartPreviewDecorator cartDecorator, boolean itemSelected, List<String> clickBeaconsSent, List<String> viewBeaconsSent, List<String> loadBeaconsSent, List<String> stepperBeaconsSent, int tokenMatch, int embeddingsMatch, boolean shouldShowZeroResults, boolean lowStockBackupTracked, GoogleAdData googleAdSlot1, GoogleAdData googleAdSlot2, GoogleAdData googleAdSlot3) {
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
            return new ViewState(storeDetails, productQuery, title, recommendationCarouselTitle, isBuyAgain, isFavoriteOnSale, isWhiteLabelCarousel, loadingState, products, couponsStateList, couponsStateMap, sponsoredProductsWrapper, noProductResult, shoppingCart, nextFulfillmentSlot, cartDecorator, itemSelected, clickBeaconsSent, viewBeaconsSent, loadBeaconsSent, stepperBeaconsSent, tokenMatch, embeddingsMatch, shouldShowZeroResults, lowStockBackupTracked, googleAdSlot1, googleAdSlot2, googleAdSlot3);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.e(this.storeDetails, viewState.storeDetails) && Intrinsics.e(this.productQuery, viewState.productQuery) && Intrinsics.e(this.title, viewState.title) && Intrinsics.e(this.recommendationCarouselTitle, viewState.recommendationCarouselTitle) && this.isBuyAgain == viewState.isBuyAgain && this.isFavoriteOnSale == viewState.isFavoriteOnSale && this.isWhiteLabelCarousel == viewState.isWhiteLabelCarousel && Intrinsics.e(this.loadingState, viewState.loadingState) && Intrinsics.e(this.products, viewState.products) && Intrinsics.e(this.couponsStateList, viewState.couponsStateList) && Intrinsics.e(this.couponsStateMap, viewState.couponsStateMap) && Intrinsics.e(this.sponsoredProductsWrapper, viewState.sponsoredProductsWrapper) && Intrinsics.e(this.noProductResult, viewState.noProductResult) && Intrinsics.e(this.shoppingCart, viewState.shoppingCart) && Intrinsics.e(this.nextFulfillmentSlot, viewState.nextFulfillmentSlot) && Intrinsics.e(this.cartDecorator, viewState.cartDecorator) && this.itemSelected == viewState.itemSelected && Intrinsics.e(this.clickBeaconsSent, viewState.clickBeaconsSent) && Intrinsics.e(this.viewBeaconsSent, viewState.viewBeaconsSent) && Intrinsics.e(this.loadBeaconsSent, viewState.loadBeaconsSent) && Intrinsics.e(this.stepperBeaconsSent, viewState.stepperBeaconsSent) && this.tokenMatch == viewState.tokenMatch && this.embeddingsMatch == viewState.embeddingsMatch && this.shouldShowZeroResults == viewState.shouldShowZeroResults && this.lowStockBackupTracked == viewState.lowStockBackupTracked && Intrinsics.e(this.googleAdSlot1, viewState.googleAdSlot1) && Intrinsics.e(this.googleAdSlot2, viewState.googleAdSlot2) && Intrinsics.e(this.googleAdSlot3, viewState.googleAdSlot3);
        }

        public int hashCode() {
            int iHashCode = ((this.storeDetails.hashCode() * 31) + this.productQuery.hashCode()) * 31;
            AbstractC6392a abstractC6392a = this.title;
            int iHashCode2 = (iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31;
            AbstractC6392a abstractC6392a2 = this.recommendationCarouselTitle;
            int iHashCode3 = (((((((((((((((((((iHashCode2 + (abstractC6392a2 == null ? 0 : abstractC6392a2.hashCode())) * 31) + Boolean.hashCode(this.isBuyAgain)) * 31) + Boolean.hashCode(this.isFavoriteOnSale)) * 31) + Boolean.hashCode(this.isWhiteLabelCarousel)) * 31) + this.loadingState.hashCode()) * 31) + this.products.hashCode()) * 31) + this.couponsStateList.hashCode()) * 31) + this.couponsStateMap.hashCode()) * 31) + this.sponsoredProductsWrapper.hashCode()) * 31) + this.noProductResult.hashCode()) * 31;
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
            return "ViewState(storeDetails=" + this.storeDetails + ", productQuery=" + this.productQuery + ", title=" + this.title + ", recommendationCarouselTitle=" + this.recommendationCarouselTitle + ", isBuyAgain=" + this.isBuyAgain + ", isFavoriteOnSale=" + this.isFavoriteOnSale + ", isWhiteLabelCarousel=" + this.isWhiteLabelCarousel + ", loadingState=" + this.loadingState + ", products=" + this.products + ", couponsStateList=" + this.couponsStateList + ", couponsStateMap=" + this.couponsStateMap + ", sponsoredProductsWrapper=" + this.sponsoredProductsWrapper + ", noProductResult=" + this.noProductResult + ", shoppingCart=" + this.shoppingCart + ", nextFulfillmentSlot=" + this.nextFulfillmentSlot + ", cartDecorator=" + this.cartDecorator + ", itemSelected=" + this.itemSelected + ", clickBeaconsSent=" + this.clickBeaconsSent + ", viewBeaconsSent=" + this.viewBeaconsSent + ", loadBeaconsSent=" + this.loadBeaconsSent + ", stepperBeaconsSent=" + this.stepperBeaconsSent + ", tokenMatch=" + this.tokenMatch + ", embeddingsMatch=" + this.embeddingsMatch + ", shouldShowZeroResults=" + this.shouldShowZeroResults + ", lowStockBackupTracked=" + this.lowStockBackupTracked + ", googleAdSlot1=" + this.googleAdSlot1 + ", googleAdSlot2=" + this.googleAdSlot2 + ", googleAdSlot3=" + this.googleAdSlot3 + ')';
        }

        private final AbstractC6392a v(Qo.l query) {
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
                i10 = com.meijer.mobile.meijer.Y.f100455H5;
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i10 = com.meijer.mobile.meijer.Y.f101150r0;
            }
            return AbstractC6392a.INSTANCE.d(i10, new Object[0]);
        }

        /* renamed from: A, reason: from getter */
        public final boolean getIsFavoriteOnSale() {
            return this.isFavoriteOnSale;
        }

        /* renamed from: B, reason: from getter */
        public final boolean getIsWhiteLabelCarousel() {
            return this.isWhiteLabelCarousel;
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
            int i10 = 4;
            int i11 = z10 ? 4 : 0;
            if (!z10 && (spellSuggestionTerm = this.noProductResult.getSpellSuggestionTerm()) != null && (!StringsKt.s0(spellSuggestionTerm)) && this.products.isEmpty()) {
                i10 = 0;
            }
            NoResultDecorator noResultDecorator = new NoResultDecorator(term, spellingSuggestion, i11, i10);
            AbstractC6392a abstractC6392a = this.recommendationCarouselTitle;
            AbstractC6392a abstractC6392aV = v(this.productQuery);
            AbstractC6392a abstractC6392a2 = this.title;
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            boolean zE = Intrinsics.e(abstractC6392a2, companion.d(com.meijer.mobile.meijer.Y.f101150r0, new Object[0]));
            boolean zE2 = Intrinsics.e(this.title, companion.d(com.meijer.mobile.meijer.Y.f100455H5, new Object[0]));
            AbstractC6392a abstractC6392aA = this.title;
            if (abstractC6392aA == null) {
                abstractC6392aA = companion.a();
            }
            return c(this, null, null, abstractC6392aV, abstractC6392a, zE, zE2, Intrinsics.e(abstractC6392aA, this.recommendationCarouselTitle), null, null, null, null, null, noResultDecorator, null, null, null, false, null, null, null, null, 0, 0, false, false, null, null, null, 268431235, null);
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
        public final Pj.a getLoadingState() {
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
        public final AbstractC6392a getTitle() {
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

        /* renamed from: z, reason: from getter */
        public final boolean getIsBuyAgain() {
            return this.isBuyAgain;
        }

        public /* synthetic */ ViewState(Tq.k kVar, Qo.l lVar, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, boolean z10, boolean z11, boolean z12, Pj.a aVar, List list, List list2, Map map, SponsoredProductsWrapper sponsoredProductsWrapper, NoResultDecorator noResultDecorator, ShoppingCart shoppingCart, FulfillmentSlot fulfillmentSlot, CartPreviewDecorator cartPreviewDecorator, boolean z13, List list3, List list4, List list5, List list6, int i10, int i11, boolean z14, boolean z15, GoogleAdData googleAdData, GoogleAdData googleAdData2, GoogleAdData googleAdData3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(kVar, lVar, (i12 & 4) != 0 ? null : abstractC6392a, (i12 & 8) != 0 ? null : abstractC6392a2, (i12 & 16) != 0 ? false : z10, (i12 & 32) != 0 ? false : z11, (i12 & 64) != 0 ? false : z12, (i12 & 128) != 0 ? new a.Loading(BuildConfig.DEFAULT_ITEM_SECTION, null, 2, null) : aVar, (i12 & 256) != 0 ? CollectionsKt.m() : list, (i12 & 512) != 0 ? CollectionsKt.m() : list2, (i12 & 1024) != 0 ? new LinkedHashMap() : map, (i12 & RecyclerView.m.FLAG_MOVED) != 0 ? new SponsoredProductsWrapper(null, null, null, 7, null) : sponsoredProductsWrapper, (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? new NoResultDecorator(null, null, 0, 0, 15, null) : noResultDecorator, (i12 & 8192) != 0 ? null : shoppingCart, (i12 & 16384) != 0 ? null : fulfillmentSlot, (32768 & i12) != 0 ? new CartPreviewDecorator(false, 0, 3, null) : cartPreviewDecorator, (65536 & i12) != 0 ? false : z13, (131072 & i12) != 0 ? CollectionsKt.m() : list3, (262144 & i12) != 0 ? CollectionsKt.m() : list4, (524288 & i12) != 0 ? CollectionsKt.m() : list5, (1048576 & i12) != 0 ? CollectionsKt.m() : list6, (2097152 & i12) != 0 ? 0 : i10, (4194304 & i12) != 0 ? 0 : i11, (8388608 & i12) != 0 ? false : z14, (16777216 & i12) != 0 ? false : z15, (33554432 & i12) != 0 ? null : googleAdData, (67108864 & i12) != 0 ? null : googleAdData2, (i12 & 134217728) != 0 ? null : googleAdData3);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class r {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$clipCoupon$2$1", f = "ProductsViewModel.kt", l = {HttpResponseStatus.ERROR_GATEWAY_TIMEOUT}, m = "invokeSuspend")
    static final class s extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112273a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Coupon f112275c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e1.this.new s(this.f112275c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(Coupon coupon, Continuation<? super s> continuation) {
            super(2, continuation);
            this.f112275c = coupon;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((s) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f112273a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = e1.this._event;
                AbstractC12585n.ClipCouponFailedEvent clipCouponFailedEvent = new AbstractC12585n.ClipCouponFailedEvent(Nr.g.f22702n, Nr.g.f22700m, com.meijer.mobile.meijer.Y.f100486Ih, Nr.g.f22664O, this.f112275c);
                this.f112273a = 1;
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
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$fetchCriteoSponsoredProducts$1", f = "ProductsViewModel.kt", l = {796}, m = "invokeSuspend")
    static final class u extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112276a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f112278c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Qo.l f112279d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e1.this.new u(this.f112278c, this.f112279d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(String str, Qo.l lVar, Continuation<? super u> continuation) {
            super(2, continuation);
            this.f112278c = str;
            this.f112279d = lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((u) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f112276a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                sp.Y y10 = e1.this.productStateRepository;
                String str = this.f112278c;
                Qo.l lVar = this.f112279d;
                boolean z10 = lVar instanceof l.Department;
                String strA = Oo.a.a(lVar);
                this.f112276a = 1;
                if (y10.d1(str, z10, strA, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$handleViewShoppingList$1", f = "ProductsViewModel.kt", l = {1515}, m = "invokeSuspend")
    static final class v extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112280a;

        v(Continuation<? super v> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e1.this.new v(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((v) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f112280a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = e1.this._event;
                AbstractC12585n.x xVar = AbstractC12585n.x.f112237a;
                this.f112280a = 1;
                if (interfaceC16548A.emit(xVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$itemSelected$4", f = "ProductsViewModel.kt", l = {361}, m = "invokeSuspend")
    static final class w extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112282a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ProductCardDecorator f112284c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e1.this.new w(this.f112284c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(ProductCardDecorator productCardDecorator, Continuation<? super w> continuation) {
            super(2, continuation);
            this.f112284c = productCardDecorator;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((w) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f112282a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = e1.this._event;
                AbstractC12585n.ShowPlpEvent showPlpEvent = new AbstractC12585n.ShowPlpEvent(this.f112284c.getProduct());
                this.f112282a = 1;
                if (interfaceC16548A.emit(showPlpEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$launchFilterAndSortActivity$1", f = "ProductsViewModel.kt", l = {1441}, m = "invokeSuspend")
    static final class x extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112285a;

        x(Continuation<? super x> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e1.this.new x(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((x) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f112285a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = e1.this._event;
                AbstractC12585n.LaunchFilterAndSortEvent launchFilterAndSortEvent = new AbstractC12585n.LaunchFilterAndSortEvent((Qo.l) e1.this.h1().getValue());
                this.f112285a = 1;
                if (interfaceC16548A.emit(launchFilterAndSortEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$loadProducts$1", f = "ProductsViewModel.kt", l = {1546, 1573}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class y extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f112287a;

        /* renamed from: b, reason: collision with root package name */
        Object f112288b;

        /* renamed from: c, reason: collision with root package name */
        Object f112289c;

        /* renamed from: d, reason: collision with root package name */
        Object f112290d;

        /* renamed from: e, reason: collision with root package name */
        Object f112291e;

        /* renamed from: f, reason: collision with root package name */
        Object f112292f;

        /* renamed from: g, reason: collision with root package name */
        Object f112293g;

        /* renamed from: h, reason: collision with root package name */
        Object f112294h;

        /* renamed from: i, reason: collision with root package name */
        Object f112295i;

        /* renamed from: j, reason: collision with root package name */
        Object f112296j;

        /* renamed from: k, reason: collision with root package name */
        int f112297k;

        /* renamed from: l, reason: collision with root package name */
        int f112298l;

        /* renamed from: m, reason: collision with root package name */
        int f112299m;

        /* renamed from: n, reason: collision with root package name */
        int f112300n;

        /* renamed from: o, reason: collision with root package name */
        int f112301o;

        /* renamed from: p, reason: collision with root package name */
        int f112302p;

        /* renamed from: q, reason: collision with root package name */
        int f112303q;

        /* renamed from: r, reason: collision with root package name */
        int f112304r;

        /* renamed from: s, reason: collision with root package name */
        int f112305s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f112306t;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ Qo.l f112308v;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            y yVar = e1.this.new y(this.f112308v, continuation);
            yVar.f112306t = obj;
            return yVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(Qo.l lVar, Continuation<? super y> continuation) {
            super(2, continuation);
            this.f112308v = lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((y) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:85:0x02b2  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x02bf  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r51) {
            /*
                Method dump skipped, instructions count: 796
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.personalized.modals.e1.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.personalized.modals.ProductsViewModel$navigateToCart$1", f = "ProductsViewModel.kt", l = {1353}, m = "invokeSuspend")
    static final class z extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112309a;

        z(Continuation<? super z> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e1.this.new z(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((z) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f112309a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = e1.this._event;
                AbstractC12585n.g gVar = AbstractC12585n.g.f112210a;
                this.f112309a = 1;
                if (interfaceC16548A.emit(gVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    private final AbstractC6392a e1(int freeItemsCount, int rewardItemsCount) {
        return freeItemsCount != 0 ? freeItemsCount != 1 ? freeItemsCount != 2 ? freeItemsCount != 3 ? freeItemsCount != 4 ? freeItemsCount != 5 ? AbstractC6392a.INSTANCE.d(Nr.g.f22667R, new Object[0]) : AbstractC6392a.INSTANCE.d(Nr.g.f22662M, new Object[0]) : AbstractC6392a.INSTANCE.d(Nr.g.f22663N, new Object[0]) : AbstractC6392a.INSTANCE.d(Nr.g.f22725y0, new Object[0]) : AbstractC6392a.INSTANCE.d(Nr.g.f22727z0, new Object[0]) : AbstractC6392a.INSTANCE.d(Nr.g.f22674Y, new Object[0]) : AbstractC6392a.INSTANCE.b(Nr.f.f22639c, rewardItemsCount, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Pk.f> getCouponList(EntryChange entryChange) {
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
    static final class C12577f extends SuspendLambda implements Function2<Qo.l, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112088a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f112089b;

        C12577f(Continuation<? super C12577f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12577f c12577f = e1.this.new C12577f(continuation);
            c12577f.f112089b = obj;
            return c12577f;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Qo.l lVar, Continuation<? super Unit> continuation) {
            return ((C12577f) create(lVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f112088a == 0) {
                ResultKt.b(obj);
                e1.this.C1((Qo.l) this.f112089b);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public e1(Tq.j storeProvider, yo.k userManager, zl.k featureManager, sp.Y productStateRepository, il.m cartRepository, Eq.b shoppingListRepository, wr.f cartInteractor, tl.h timeSlotRepository, C13702d couponsRepository, B0 productQueryPagingDataSource, InterfaceC14523a analyticsEngine, Ro.a productAnalytics, C16753b beaconClient, pp.e sponsorshipsDataStore, pp.d productMetadataStore, AbstractC15779K ioDispatcher) {
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
                return e1.K1();
            }
        });
        this._toastMessageData = C16555H.b(0, 0, null, 7, null);
        InterfaceC16549B<Boolean> interfaceC16549BA = pv.S.a(Boolean.FALSE);
        this._stepperClicked = interfaceC16549BA;
        this.stepperClicked = interfaceC16549BA;
        this.adManagerProvider = new C12689s(featureManager, userManager);
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
        InterfaceC16549B<ViewState> interfaceC16549BA2 = pv.S.a(new ViewState(storeProvider.a(), h1().getValue().a(), null, null, false, false, false, null, null, null, null, null, null, null, null, new CartPreviewDecorator(userManager.b(), 0), false, null, null, null, null, 0, 0, false, false, null, null, null, 268402684, null).a());
        this._viewState = interfaceC16549BA2;
        this.viewState = C16563h.c(interfaceC16549BA2);
        this.paginator = new Paginator(0, 0, 0, 0, false, 31, null);
        this._event = C16555H.b(0, 0, null, 7, null);
        Delegates delegates = Delegates.f143781a;
        this.productInQtyStepperInteraction = new L(null, this);
        this.resetStepperState = new M(null, this);
        C16563h.J(C16563h.g(C16563h.O(cVar.a(), new C12573b(this)), new C12574c(null)), androidx.view.d0.a(this));
        z1();
        io.reactivex.l<List<ProductState<ProductFullDetails>>> lVarSubscribeOn = productStateRepository.Y0().subscribeOn(C13889a.b());
        final C12575d c12575d = new C12575d(this);
        Lu.g<? super List<ProductState<ProductFullDetails>>> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.J0
            @Override // Lu.g
            public final void accept(Object obj) {
                e1.P(c12575d, obj);
            }
        };
        a.Companion companion = qw.a.INSTANCE;
        final C12576e c12576e = new C12576e(companion);
        Dk.a.a(lVarSubscribeOn.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.K0
            @Override // Lu.g
            public final void accept(Object obj) {
                c12576e.invoke(obj);
            }
        }), aVar);
        C16563h.J(C16563h.g(C16563h.O(C16563h.s(C16563h.c(h1()), new Function2() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.L0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(e1.Q((Qo.l) obj, (Qo.l) obj2));
            }
        }), new C12577f(null)), new C12578g(null)), androidx.view.d0.a(this));
        io.reactivex.l<Tq.k> lVarSubscribeOn2 = lVarF.distinctUntilChanged().subscribeOn(C13889a.b());
        final C12579h c12579h = new C12579h(this);
        Lu.g<? super Tq.k> gVar2 = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.M0
            @Override // Lu.g
            public final void accept(Object obj) {
                e1.R(c12579h, obj);
            }
        };
        final C12580i c12580i = new C12580i(companion);
        Dk.a.a(lVarSubscribeOn2.subscribe(gVar2, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.O0
            @Override // Lu.g
            public final void accept(Object obj) {
                e1.S(c12580i, obj);
            }
        }), aVar);
        fetchAllCoupons();
        if (featureManager.e(AbstractC18503f.C18509g.f172878h)) {
            C15809k.d(androidx.view.d0.a(this), null, null, new C12572a(null), 3, null);
        }
    }

    private final void B0(final Coupon coupon, final String couponLocation) {
        io.reactivex.u<ClipUnclipCouponResponse> uVarK = this.couponsRepository.h(coupon).k(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.D0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e1.C0(this.f111459a, coupon, couponLocation, (ClipUnclipCouponResponse) obj);
            }
        };
        Lu.g<? super ClipUnclipCouponResponse> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.E0
            @Override // Lu.g
            public final void accept(Object obj) {
                e1.E0(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.F0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e1.F0(this.f111464a, coupon, (Throwable) obj);
            }
        };
        Dk.a.a(uVarK.o(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.G0
            @Override // Lu.g
            public final void accept(Object obj) {
                e1.G0(function12, obj);
            }
        }), this.disposables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C1(Qo.l productQuery) {
        ViewState value;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.c(value, null, productQuery.a(), null, null, false, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 0, 0, false, false, null, null, null, 268369917, null).a()));
        if (productQuery.getIsPending()) {
            x1(productQuery);
        }
        if (productQuery instanceof l.k) {
            C15809k.d(androidx.view.d0.a(this), null, null, new B(productQuery, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D1(java.util.List<sp.ProductState<Co.ProductFullDetails>> r39) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.personalized.modals.e1.D1(java.util.List):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence E1(ProductState it) {
        Intrinsics.j(it, "it");
        return it.getCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F0(e1 e1Var, Coupon coupon, Throwable th2) {
        qw.a.INSTANCE.f(th2, "Failed to clip coupon", new Object[0]);
        C15809k.d(androidx.view.d0.a(e1Var), null, null, e1Var.new s(coupon, null), 3, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence F1(ProductState it) {
        Intrinsics.j(it, "it");
        return it.getCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G1() {
        ViewState value;
        ViewState viewState;
        ArrayList arrayList;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
            List<ProductListDecorator> listQ = viewState.q();
            arrayList = new ArrayList(CollectionsKt.x(listQ, 10));
            for (ProductListDecorator productListDecorator : listQ) {
                String upc = productListDecorator.getUpc();
                EntryInQtyStepperInteraction entryInQtyStepperInteractionG1 = g1();
                arrayList.add(productListDecorator.u(((-201326593) & 1) != 0 ? productListDecorator.id : null, ((-201326593) & 2) != 0 ? productListDecorator.isSelected : false, ((-201326593) & 4) != 0 ? productListDecorator.upc : null, ((-201326593) & 8) != 0 ? productListDecorator.title : null, ((-201326593) & 16) != 0 ? productListDecorator.hasUnsavedShoppingListItem : false, ((-201326593) & 32) != 0 ? productListDecorator.listItemId : null, ((-201326593) & 64) != 0 ? productListDecorator.thumbnail : null, ((-201326593) & 128) != 0 ? productListDecorator.thumbnailUrl : null, ((-201326593) & 256) != 0 ? productListDecorator.thumbnailDescription : null, ((-201326593) & 512) != 0 ? productListDecorator.department : null, ((-201326593) & 1024) != 0 ? productListDecorator.isOnSale : false, ((-201326593) & RecyclerView.m.FLAG_MOVED) != 0 ? productListDecorator.showWeightInfo : false, ((-201326593) & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? productListDecorator.hasMPerksOffers : false, ((-201326593) & 8192) != 0 ? productListDecorator.currentPrice : null, ((-201326593) & 16384) != 0 ? productListDecorator.regularPrice : null, ((-201326593) & 32768) != 0 ? productListDecorator.weightUnitSizeAndPrice : null, ((-201326593) & 65536) != 0 ? productListDecorator.amountSaved : null, ((-201326593) & 131072) != 0 ? productListDecorator.quantityText : null, ((-201326593) & 262144) != 0 ? productListDecorator.priceGoodThroughDate : null, ((-201326593) & 524288) != 0 ? productListDecorator.isAddedToShoppingList : false, ((-201326593) & 1048576) != 0 ? productListDecorator.errorImageResource : 0, ((-201326593) & 2097152) != 0 ? productListDecorator.shoppingListItem : null, ((-201326593) & 4194304) != 0 ? productListDecorator.product : null, ((-201326593) & 8388608) != 0 ? productListDecorator.cartEntry : null, ((-201326593) & 16777216) != 0 ? productListDecorator.storeAvailability : null, ((-201326593) & 33554432) != 0 ? productListDecorator.cartEligibility : null, ((-201326593) & 67108864) != 0 ? productListDecorator.inQtyStepperInteraction : Intrinsics.e(upc, entryInQtyStepperInteractionG1 != null ? entryInQtyStepperInteractionG1.getResourceId() : null), ((-201326593) & 134217728) != 0 ? productListDecorator.resetStepperState : Intrinsics.e(j1(), productListDecorator.getUpc()), ((-201326593) & 268435456) != 0 ? productListDecorator.productQuery : null, ((-201326593) & 536870912) != 0 ? productListDecorator.couponCountDownStateDecorator : null, ((-201326593) & 1073741824) != 0 ? productListDecorator.coupon : null, ((-201326593) & Integer.MIN_VALUE) != 0 ? productListDecorator.complexPromo : null, (511 & 1) != 0 ? productListDecorator.isBuyAgain : false, (511 & 2) != 0 ? productListDecorator.isBopas : false, (511 & 4) != 0 ? productListDecorator.sponsorship : null, (511 & 8) != 0 ? productListDecorator.productRatings : null, (511 & 16) != 0 ? productListDecorator.showQuantityRequested : false, (511 & 32) != 0 ? productListDecorator.quantityRequested : 0, (511 & 64) != 0 ? productListDecorator.currentPriceDescription : null, (511 & 128) != 0 ? productListDecorator.productContainsTag : false, (511 & 256) != 0 ? productListDecorator.regularPriceDescription : null));
            }
        } while (!interfaceC16549B.e(value, ViewState.c(viewState, null, null, null, null, false, false, false, null, arrayList, null, null, null, null, null, null, null, false, null, null, null, null, 0, 0, false, false, null, null, null, 268435199, null).a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H0(CouponsResponse c13814a) {
        qw.a.INSTANCE.a("Received " + c13814a.getCouponCount() + " coupons", new Object[0]);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H1(Tq.k storeDetails) {
        ViewState value;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.c(value, storeDetails, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 0, 0, false, false, null, null, null, 268435454, null).a()));
        b2(h1().getValue().g(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J0(Throwable th2) {
        qw.a.INSTANCE.f(th2, "Error loading coupons on PLP", new Object[0]);
        return Unit.f143329a;
    }

    private final void J1(int storeId) {
        CartProductListDecorator cartProductListDecorator = this.itemToSubstitute;
        if (cartProductListDecorator != null) {
            C15809k.d(androidx.view.d0.a(this), null, null, new E(cartProductListDecorator, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC16549B K1() {
        return pv.S.a(new l.Search("", null, null, 0, 0, null, null, 0, null, false, null, null, null, null, null, null, null, null, null, 523774, null));
    }

    private final void L0() {
        io.reactivex.l<String> lVarSubscribeOn = this.cartRepository.N().subscribeOn(C13889a.b());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.Z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e1.M0(this.f111910a, (String) obj);
            }
        };
        Dk.a.a(lVarSubscribeOn.subscribe(new Lu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.a1
            @Override // Lu.g
            public final void accept(Object obj) {
                e1.N0(function1, obj);
            }
        }), this.disposables);
    }

    public static /* synthetic */ void M1(e1 e1Var, List list, Ul.a aVar, boolean z10, nk.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        e1Var.L1(list, aVar, z10, cVar);
    }

    private final void O0(Pk.c couponIdentity, final TrackingData trackingData) {
        io.reactivex.l<Coupon> lVarObserveOn = this.couponsRepository.k(couponIdentity).take(1L).observeOn(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.b1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e1.P0(this.f111930a, trackingData, (Coupon) obj);
            }
        };
        Lu.g<? super Coupon> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.c1
            @Override // Lu.g
            public final void accept(Object obj) {
                e1.Q0(function1, obj);
            }
        };
        final t tVar = new t(qw.a.INSTANCE);
        Dk.a.a(lVarObserveOn.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.d1
            @Override // Lu.g
            public final void accept(Object obj) {
                e1.R0(tVar, obj);
            }
        }), this.disposables);
    }

    private final void P1(List<String> beacon, Ul.a beaconType, nk.c product) {
        ViewState value;
        ViewState viewState;
        if (this._viewState.getValue().t().containsAll(beacon)) {
            return;
        }
        M1(this, beacon, beaconType, false, product, 4, null);
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
        } while (!interfaceC16549B.e(value, ViewState.c(viewState, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, CollectionsKt.j1(CollectionsKt.P0(viewState.t(), beacon)), 0, 0, false, false, null, null, null, 267386879, null).a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Q(Qo.l q12, Qo.l q22) {
        Intrinsics.j(q12, "q1");
        Intrinsics.j(q22, "q2");
        return Intrinsics.e(q12.a(), q22.a());
    }

    private final void S0(Qo.l query) {
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
        C15809k.d(androidx.view.d0.a(this), null, null, new u(term, query, null), 3, null);
    }

    private final void W1(l.k query) {
        if (query instanceof l.Department) {
            Qo.l value = h1().getValue();
            l.Department department = value instanceof l.Department ? (l.Department) value : null;
            if (department != null) {
                l.Department department2 = (l.Department) query;
                if (Intrinsics.e(department.getSelectedSort(), department2.getSelectedSort()) && Intrinsics.e(department.F3(), department2.F3())) {
                    return;
                }
                b2(l.Department.v(department.g(), null, 0, 0, null, null, 0, null, false, null, null, null, null, department2.F3(), department2.getSelectedSort(), null, 20479, null), true);
                return;
            }
            return;
        }
        if (query instanceof l.Search) {
            Qo.l value2 = h1().getValue();
            l.Search search = value2 instanceof l.Search ? (l.Search) value2 : null;
            if (search != null) {
                l.Search search2 = (l.Search) query;
                if (Intrinsics.e(search.getSelectedSort(), search2.getSelectedSort()) && Intrinsics.e(search.F3(), search2.F3())) {
                    return;
                }
                b2(l.Search.v(search.g(), null, null, null, 0, 0, null, null, 0, null, false, null, null, search2.F3(), search2.getSelectedSort(), null, null, null, null, null, 511999, null), true);
                return;
            }
            return;
        }
        if (query instanceof l.BrowseCollection) {
            Qo.l value3 = h1().getValue();
            l.BrowseCollection browseCollection = value3 instanceof l.BrowseCollection ? (l.BrowseCollection) value3 : null;
            if (browseCollection != null) {
                l.BrowseCollection browseCollection2 = (l.BrowseCollection) query;
                if (Intrinsics.e(browseCollection.getSelectedSort(), browseCollection2.getSelectedSort()) && Intrinsics.e(browseCollection.F3(), browseCollection2.F3())) {
                    return;
                }
                b2(l.BrowseCollection.v(browseCollection.g(), null, 0, 0, null, null, 0, null, false, null, null, null, browseCollection2.F3(), browseCollection2.getSelectedSort(), null, null, 26623, null), true);
            }
        }
    }

    private final void a2(EntryInQtyStepperInteraction entryInQtyStepperInteraction) {
        this.productInQtyStepperInteraction.setValue(this, f111943T[0], entryInQtyStepperInteraction);
    }

    static /* synthetic */ CouponState b1(e1 e1Var, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return e1Var.getCouponState(str, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c1(String str, Map map, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("expectedUpc", str);
        track.h("availableKeys", CollectionsKt.B0(map.keySet(), ",", null, null, 0, null, null, 62, null));
        track.m(TrackingData.a.b.f137705a);
        return Unit.f143329a;
    }

    public static /* synthetic */ void c2(e1 e1Var, Qo.l lVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        e1Var.b2(lVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d2(String str) {
        this.resetStepperState.setValue(this, f111943T[1], str);
    }

    public static /* synthetic */ void f2(e1 e1Var, String str, boolean z10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        e1Var.e2(str, z10, str2);
    }

    private final void fetchAllCoupons() {
        io.reactivex.u uVarK = C13702d.B(this.couponsRepository, new CouponOptions(null, null, null, false, true, 0L, null, null, false, null, null, false, false, 8175, null), false, false, false, 14, null).k(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.Q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e1.H0((CouponsResponse) obj);
            }
        };
        Lu.g gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.R0
            @Override // Lu.g
            public final void accept(Object obj) {
                e1.I0(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.S0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e1.J0((Throwable) obj);
            }
        };
        Dk.a.a(uVarK.o(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.T0
            @Override // Lu.g
            public final void accept(Object obj) {
                e1.K0(function12, obj);
            }
        }), this.disposables);
    }

    private final EntryInQtyStepperInteraction g1() {
        return (EntryInQtyStepperInteraction) this.productInQtyStepperInteraction.getValue(this, f111943T[0]);
    }

    private final CouponState getCouponState(final String productCode, boolean logError) {
        final Map<String, CouponState> mapG = this.viewState.getValue().g();
        try {
            return (CouponState) MapsKt.l(mapG, productCode);
        } catch (NoSuchElementException e10) {
            qw.a.INSTANCE.z("Bug #1517298").u(e10, "Failed to find " + productCode + " in couponStatesMap with keys " + mapG.keySet(), new Object[0]);
            if (!logError) {
                return null;
            }
            this.analyticsEngine.b(C14756c.h("bug:1517289"), new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.C0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e1.c1(productCode, mapG, (TrackingData) obj);
                }
            });
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC16549B<Qo.l> h1() {
        return (InterfaceC16549B) this.queryStore.getValue();
    }

    private final void i2(boolean shouldShowZeroResults) {
        ViewState value;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.c(value, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 0, 0, shouldShowZeroResults, false, null, null, null, 260046847, null).a()));
    }

    private final String j1() {
        return (String) this.resetStepperState.getValue(this, f111943T[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j2(uk.c<EntryChange> entryChange) {
        Entry entry;
        ProductFullDetails productFullDetailsM;
        EntryChange entryChangeA = entryChange.a();
        CouponState couponState = getCouponState((entryChangeA == null || (entry = entryChangeA.getEntry()) == null || (productFullDetailsM = entry.m()) == null) ? null : productFullDetailsM.getCode(), true);
        if (couponState == null || !(couponState.getCoupon().getEarnCondition() instanceof Coupon.c.Buy) || !(couponState.getCoupon().getReward() instanceof Coupon.e.Free) || !couponState.getCoupon().x()) {
            return false;
        }
        Integer numT0 = T0(couponState, entryChange);
        if (numT0 != null) {
            C15809k.d(androidx.view.d0.a(this), null, null, new I(e1(numT0.intValue(), (int) couponState.getCoupon().getReward().getValue()), null), 3, null);
            return true;
        }
        C15809k.d(androidx.view.d0.a(this), null, null, new J(null), 3, null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProductListDecorator k1() {
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

    private final void k2(CouponState couponState, Coupon clippedCoupon) {
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
                    C15809k.d(androidx.view.d0.a(this), null, null, new K(e1((int) dValueOf.doubleValue(), (int) couponState.getCoupon().getReward().getValue()), null), 3, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m2() {
        Double dValueOf;
        ProductFullDetails product;
        StockInfo stockInfo;
        ProductFullDetails product2;
        nk.b price;
        List<Entry> listP;
        ProductFullDetails product3;
        InterfaceC14523a interfaceC14523a = this.analyticsEngine;
        Ao.S s10 = Ao.S.f1688a;
        CartProductListDecorator cartProductListDecorator = this.itemToSubstitute;
        Boolean boolValueOf = null;
        String code = (cartProductListDecorator == null || (product3 = cartProductListDecorator.getProduct()) == null) ? null : product3.getCode();
        ProductListDecorator productListDecoratorK1 = k1();
        String upc = productListDecoratorK1 != null ? productListDecoratorK1.getUpc() : null;
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
        ProductListDecorator productListDecoratorK12 = k1();
        if (productListDecoratorK12 != null && (product = productListDecoratorK12.getProduct()) != null && (stockInfo = product.getStockInfo()) != null) {
            boolValueOf = Boolean.valueOf(stockInfo.c());
        }
        interfaceC14523a.k(s10.d("product search page", code, upc, term, str, str2, strValueOf, dValueOf2, dValueOf, boolValueOf));
    }

    private final void n2(final Coupon coupon, final String couponLocation) {
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
        k2(cVar2, coupon);
        this.analyticsEngine.b(C14756c.a("coupon clip"), new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.H0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e1.o2(this.f111804a, coupon, couponLocation, cVar2, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o2(e1 e1Var, Coupon coupon, String str, CouponState cVar, TrackingData track) {
        CouponState.b bVarE;
        Intrinsics.j(track, "$this$track");
        track.n(e1Var.X0());
        track.v(e1Var.W0());
        Rk.b bVar = Rk.b.f33418a;
        track.c(bVar.e(coupon));
        track.c(bVar.h(str));
        boolean z10 = false;
        if (cVar != null && (bVarE = cVar.getProgress()) != null && bVarE.d()) {
            z10 = true;
        }
        track.c(bVar.c(z10));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLoadingStates(List<? extends Pj.a> loadingStates) {
        ViewState value;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.c(value, null, null, null, null, false, false, false, Pj.b.a(loadingStates), null, null, null, null, null, null, null, null, false, null, null, null, null, 0, 0, false, false, null, null, null, 268435327, null).a()));
    }

    private final void p2(String event) {
        this.analyticsEngine.h(C14756c.a(event), C14756c.c("menu"), C14756c.g("menu"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q2() {
        ViewState value;
        CartProductListDecorator cartProductListDecorator = this.itemToSubstitute;
        if (cartProductListDecorator != null) {
            l.Search search = this.searchQuery;
            if ((search != null ? search.getTerm() : null) == null || this._viewState.getValue().getShoppingCart() == null) {
                cartProductListDecorator = null;
            }
            if (cartProductListDecorator != null) {
                if ((this._viewState.getValue().getLowStockBackupTracked() ? null : cartProductListDecorator) != null) {
                    this.analyticsEngine.c(C14756c.h("Find Substitution Page: Search"), new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.P0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return e1.r2(this.f111828a, (TrackingData) obj);
                        }
                    });
                    Unit unit = Unit.f143329a;
                    InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
                    do {
                        value = interfaceC16549B.getValue();
                    } while (!interfaceC16549B.e(value, ViewState.c(value, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 0, 0, false, true, null, null, null, 251658239, null).a()));
                }
            }
        }
    }

    private final void r1(final ProductCardDecorator itemClicked, Pp.b searchType, int position) {
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
                    List<ProductListDecorator> listQ = viewState.q();
                    arrayList = new ArrayList(CollectionsKt.x(listQ, 10));
                    for (ProductListDecorator productListDecorator : listQ) {
                        arrayList.add(productListDecorator.u(((-201326593) & 1) != 0 ? productListDecorator.id : null, ((-201326593) & 2) != 0 ? productListDecorator.isSelected : Intrinsics.e(productListDecorator.getProduct().getEan(), itemClicked.getProduct().getEan()), ((-201326593) & 4) != 0 ? productListDecorator.upc : null, ((-201326593) & 8) != 0 ? productListDecorator.title : null, ((-201326593) & 16) != 0 ? productListDecorator.hasUnsavedShoppingListItem : false, ((-201326593) & 32) != 0 ? productListDecorator.listItemId : null, ((-201326593) & 64) != 0 ? productListDecorator.thumbnail : null, ((-201326593) & 128) != 0 ? productListDecorator.thumbnailUrl : null, ((-201326593) & 256) != 0 ? productListDecorator.thumbnailDescription : null, ((-201326593) & 512) != 0 ? productListDecorator.department : null, ((-201326593) & 1024) != 0 ? productListDecorator.isOnSale : false, ((-201326593) & RecyclerView.m.FLAG_MOVED) != 0 ? productListDecorator.showWeightInfo : false, ((-201326593) & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? productListDecorator.hasMPerksOffers : false, ((-201326593) & 8192) != 0 ? productListDecorator.currentPrice : null, ((-201326593) & 16384) != 0 ? productListDecorator.regularPrice : null, ((-201326593) & 32768) != 0 ? productListDecorator.weightUnitSizeAndPrice : null, ((-201326593) & 65536) != 0 ? productListDecorator.amountSaved : null, ((-201326593) & 131072) != 0 ? productListDecorator.quantityText : null, ((-201326593) & 262144) != 0 ? productListDecorator.priceGoodThroughDate : null, ((-201326593) & 524288) != 0 ? productListDecorator.isAddedToShoppingList : false, ((-201326593) & 1048576) != 0 ? productListDecorator.errorImageResource : 0, ((-201326593) & 2097152) != 0 ? productListDecorator.shoppingListItem : null, ((-201326593) & 4194304) != 0 ? productListDecorator.product : null, ((-201326593) & 8388608) != 0 ? productListDecorator.cartEntry : null, ((-201326593) & 16777216) != 0 ? productListDecorator.storeAvailability : null, ((-201326593) & 33554432) != 0 ? productListDecorator.cartEligibility : null, ((-201326593) & 67108864) != 0 ? productListDecorator.inQtyStepperInteraction : false, ((-201326593) & 134217728) != 0 ? productListDecorator.resetStepperState : false, ((-201326593) & 268435456) != 0 ? productListDecorator.productQuery : null, ((-201326593) & 536870912) != 0 ? productListDecorator.couponCountDownStateDecorator : null, ((-201326593) & 1073741824) != 0 ? productListDecorator.coupon : null, ((-201326593) & Integer.MIN_VALUE) != 0 ? productListDecorator.complexPromo : null, (511 & 1) != 0 ? productListDecorator.isBuyAgain : false, (511 & 2) != 0 ? productListDecorator.isBopas : false, (511 & 4) != 0 ? productListDecorator.sponsorship : null, (511 & 8) != 0 ? productListDecorator.productRatings : null, (511 & 16) != 0 ? productListDecorator.showQuantityRequested : false, (511 & 32) != 0 ? productListDecorator.quantityRequested : 0, (511 & 64) != 0 ? productListDecorator.currentPriceDescription : null, (511 & 128) != 0 ? productListDecorator.productContainsTag : false, (511 & 256) != 0 ? productListDecorator.regularPriceDescription : null));
                    }
                } while (!interfaceC16549B.e(value, ViewState.c(viewState, null, null, null, null, false, false, false, null, arrayList, null, null, null, null, null, null, null, true, null, null, null, null, 0, 0, false, false, null, null, null, 268369663, null).a()));
                return;
            }
            return;
        }
        if (g1() != null) {
            a2(null);
            return;
        }
        int i10 = 0;
        this.analyticsEngine.h(C14756c.a("event: search: product detail"), C14756c.c("mperks: search"), C14756c.g("search"));
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
            this.analyticsEngine.g(C14756c.h("Product Details Page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.Y0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e1.s1(iIntValue, this, itemClicked, (TrackingData) obj);
                }
            });
            this.analyticsEngine.k(C2898u.f1904a.h0(iIntValue));
        }
        this.productAnalytics.j(itemClicked.getProductQuery(), itemClicked.getProduct(), position);
        C15809k.d(androidx.view.d0.a(this), null, null, new w(itemClicked, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r2(e1 e1Var, TrackingData submitEvent) {
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
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s1(int i10, e1 e1Var, ProductCardDecorator productCardDecorator, TrackingData stageEvent) {
        Intrinsics.j(stageEvent, "$this$stageEvent");
        stageEvent.h("productRank", String.valueOf(i10));
        stageEvent.h("PDPfromsearch", "1");
        Ao.e0.a(e1Var.sponsorshipsDataStore.a(productCardDecorator.getProduct().getCode()), stageEvent);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s2() {
        ViewState value;
        ViewState viewState;
        ArrayList arrayList;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
            List<ProductListDecorator> listQ = viewState.q();
            arrayList = new ArrayList(CollectionsKt.x(listQ, 10));
            for (ProductListDecorator productListDecorator : listQ) {
                arrayList.add(productListDecorator.u(((-201326593) & 1) != 0 ? productListDecorator.id : null, ((-201326593) & 2) != 0 ? productListDecorator.isSelected : false, ((-201326593) & 4) != 0 ? productListDecorator.upc : null, ((-201326593) & 8) != 0 ? productListDecorator.title : null, ((-201326593) & 16) != 0 ? productListDecorator.hasUnsavedShoppingListItem : false, ((-201326593) & 32) != 0 ? productListDecorator.listItemId : null, ((-201326593) & 64) != 0 ? productListDecorator.thumbnail : null, ((-201326593) & 128) != 0 ? productListDecorator.thumbnailUrl : null, ((-201326593) & 256) != 0 ? productListDecorator.thumbnailDescription : null, ((-201326593) & 512) != 0 ? productListDecorator.department : null, ((-201326593) & 1024) != 0 ? productListDecorator.isOnSale : false, ((-201326593) & RecyclerView.m.FLAG_MOVED) != 0 ? productListDecorator.showWeightInfo : false, ((-201326593) & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? productListDecorator.hasMPerksOffers : false, ((-201326593) & 8192) != 0 ? productListDecorator.currentPrice : null, ((-201326593) & 16384) != 0 ? productListDecorator.regularPrice : null, ((-201326593) & 32768) != 0 ? productListDecorator.weightUnitSizeAndPrice : null, ((-201326593) & 65536) != 0 ? productListDecorator.amountSaved : null, ((-201326593) & 131072) != 0 ? productListDecorator.quantityText : null, ((-201326593) & 262144) != 0 ? productListDecorator.priceGoodThroughDate : null, ((-201326593) & 524288) != 0 ? productListDecorator.isAddedToShoppingList : false, ((-201326593) & 1048576) != 0 ? productListDecorator.errorImageResource : 0, ((-201326593) & 2097152) != 0 ? productListDecorator.shoppingListItem : null, ((-201326593) & 4194304) != 0 ? productListDecorator.product : null, ((-201326593) & 8388608) != 0 ? productListDecorator.cartEntry : null, ((-201326593) & 16777216) != 0 ? productListDecorator.storeAvailability : null, ((-201326593) & 33554432) != 0 ? productListDecorator.cartEligibility : null, ((-201326593) & 67108864) != 0 ? productListDecorator.inQtyStepperInteraction : false, ((-201326593) & 134217728) != 0 ? productListDecorator.resetStepperState : false, ((-201326593) & 268435456) != 0 ? productListDecorator.productQuery : null, ((-201326593) & 536870912) != 0 ? productListDecorator.couponCountDownStateDecorator : null, ((-201326593) & 1073741824) != 0 ? productListDecorator.coupon : null, ((-201326593) & Integer.MIN_VALUE) != 0 ? productListDecorator.complexPromo : null, (511 & 1) != 0 ? productListDecorator.isBuyAgain : false, (511 & 2) != 0 ? productListDecorator.isBopas : false, (511 & 4) != 0 ? productListDecorator.sponsorship : null, (511 & 8) != 0 ? productListDecorator.productRatings : null, (511 & 16) != 0 ? productListDecorator.showQuantityRequested : false, (511 & 32) != 0 ? productListDecorator.quantityRequested : 0, (511 & 64) != 0 ? productListDecorator.currentPriceDescription : null, (511 & 128) != 0 ? productListDecorator.productContainsTag : false, (511 & 256) != 0 ? productListDecorator.regularPriceDescription : null));
            }
        } while (!interfaceC16549B.e(value, ViewState.c(viewState, null, null, null, null, false, false, false, null, arrayList, null, null, null, null, null, null, null, false, null, null, null, null, 0, 0, false, false, null, null, null, 268369663, null).a()));
    }

    private final void t2(ProductFullDetails product, double quantityToUpdate) {
        wr.f.M(this.cartInteractor, product, quantityToUpdate, false, null, 12, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void v1(e1 e1Var, Qo.l lVar, HashMap map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        if ((i10 & 2) != 0) {
            map = null;
        }
        e1Var.u1(lVar, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v2(e1 e1Var, Integer num) {
        ViewState value;
        boolean zB;
        InterfaceC16549B<ViewState> interfaceC16549B = e1Var._viewState;
        do {
            value = interfaceC16549B.getValue();
            zB = e1Var.userManager.b();
            Intrinsics.g(num);
        } while (!interfaceC16549B.e(value, ViewState.c(value, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, new CartPreviewDecorator(zB, num.intValue()), false, null, null, null, null, 0, 0, false, false, null, null, null, 268402687, null).a()));
        return Unit.f143329a;
    }

    private final void w1() {
        if (!this.paginator.g() || this.paginator.getIsPaginating()) {
            return;
        }
        this.paginator = Paginator.b(this.paginator, 0, 0, 0, 0, true, 15, null);
        Qo.l lVarC = h1().getValue().c();
        if (lVarC != null) {
            c2(this, lVarC, false, 2, null);
        }
    }

    private final void x1(Qo.l query) {
        this.loadingStatesManager.b(query.n() ? new a.Loading(BuildConfig.DEFAULT_ITEM_SECTION, null, 2, null) : new a.Paging(BuildConfig.DEFAULT_ITEM_SECTION, null, 2, null));
        if (!this.featureManager.e(AbstractC18503f.b0.f172869h)) {
            S0(query);
        }
        C15809k.d(androidx.view.d0.a(this), null, null, new y(query, null), 3, null);
    }

    private final void z1() {
        if (this.userManager.b()) {
            wr.f.r(this.cartInteractor, false, new C12582k(), 1, null);
            this.cartInteractor.p();
            L0();
        }
    }

    public final String A0(String departmentId, String departmentName, List<FilterGroup> parents) throws IOException {
        Intrinsics.j(departmentId, "departmentId");
        Intrinsics.j(departmentName, "departmentName");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("T");
        String strN1 = StringsKt.N1(departmentId, 2);
        StringBuilder sb3 = new StringBuilder();
        int length = strN1.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = strN1.charAt(i10);
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

    public final void A1(AbstractC12581j action) {
        ViewState value;
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC12581j.a) {
            J1(this.storeProvider.g());
            return;
        }
        if (action instanceof AbstractC12581j.ItemSelectedAction) {
            AbstractC12581j.ItemSelectedAction itemSelectedAction = (AbstractC12581j.ItemSelectedAction) action;
            r1(itemSelectedAction.getSelectedItem(), itemSelectedAction.getSearchType(), itemSelectedAction.getPosition());
            return;
        }
        if (action instanceof AbstractC12581j.t) {
            q1(action);
            return;
        }
        if (action instanceof AbstractC12581j.g) {
            y1();
            return;
        }
        if (action instanceof AbstractC12581j.ViewProductDetailsAction) {
            AbstractC12581j.ViewProductDetailsAction viewProductDetailsAction = (AbstractC12581j.ViewProductDetailsAction) action;
            I1(viewProductDetailsAction.getProduct(), viewProductDetailsAction.getQuery(), viewProductDetailsAction.getPosition());
            return;
        }
        if (action instanceof AbstractC12581j.f) {
            w1();
            return;
        }
        if (action instanceof AbstractC12581j.UpdateEntryAction) {
            AbstractC12581j.UpdateEntryAction updateEntryAction = (AbstractC12581j.UpdateEntryAction) action;
            t2(updateEntryAction.getProduct(), updateEntryAction.getQuantityToUpdate());
            return;
        }
        if (action instanceof AbstractC12581j.UserAcceptAddToCartAction) {
            wr.f fVar = this.cartInteractor;
            AbstractC17440a.Accept accept = new AbstractC17440a.Accept(((AbstractC12581j.UserAcceptAddToCartAction) action).getCartUpdateRequest(), null, null, 4, null);
            Qo.l value2 = h1().getValue();
            l.Search search = value2 instanceof l.Search ? (l.Search) value2 : null;
            wr.f.B(fVar, accept, false, search != null ? search.getTerm() : null, 2, null);
            return;
        }
        if (action instanceof AbstractC12581j.CollapseQuantityStepperAction) {
            EntryInQtyStepperInteraction entryInQtyStepperInteractionG1 = g1();
            if (entryInQtyStepperInteractionG1 != null) {
                AbstractC12581j.CollapseQuantityStepperAction collapseQuantityStepperAction = (AbstractC12581j.CollapseQuantityStepperAction) action;
                if (entryInQtyStepperInteractionG1.getStepperHitRect().contains(collapseQuantityStepperAction.getTouchX(), collapseQuantityStepperAction.getTouchY()) || g1() == null) {
                    return;
                }
                a2(null);
                return;
            }
            return;
        }
        if (action instanceof AbstractC12581j.StepperStateChangedAction) {
            AbstractC12581j.StepperStateChangedAction stepperStateChangedAction = (AbstractC12581j.StepperStateChangedAction) action;
            a2(new EntryInQtyStepperInteraction(stepperStateChangedAction.getProductCode(), stepperStateChangedAction.getStepperHitRect(), false));
            d2(null);
            return;
        }
        if (action instanceof AbstractC12581j.ResetActiveStepper) {
            d2(((AbstractC12581j.ResetActiveStepper) action).getResourceId());
            return;
        }
        if (action instanceof AbstractC12581j.SetFilterAndSortOptions) {
            W1(((AbstractC12581j.SetFilterAndSortOptions) action).getQuery());
            return;
        }
        if (action instanceof AbstractC12581j.c.a) {
            t1();
            return;
        }
        if (action instanceof AbstractC12581j.SendTitle) {
            this.carouselTitle = ((AbstractC12581j.SendTitle) action).getTitle();
            InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, ViewState.c(value, null, null, null, AbstractC6392a.INSTANCE.c(this.carouselTitle), false, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 0, 0, false, false, null, null, null, 268435447, null).a()));
            return;
        }
        if (action instanceof AbstractC12581j.SendCriteoClickBeacon) {
            AbstractC12581j.SendCriteoClickBeacon sendCriteoClickBeacon = (AbstractC12581j.SendCriteoClickBeacon) action;
            N1(sendCriteoClickBeacon.a(), sendCriteoClickBeacon.getFormatLevelBeacon(), sendCriteoClickBeacon.getBeaconType(), sendCriteoClickBeacon.getProduct());
            return;
        }
        if (action instanceof AbstractC12581j.p) {
            l2(true);
            return;
        }
        if (action instanceof AbstractC12581j.SendCriteoQtyStepperBeacon) {
            AbstractC12581j.SendCriteoQtyStepperBeacon sendCriteoQtyStepperBeacon = (AbstractC12581j.SendCriteoQtyStepperBeacon) action;
            P1(sendCriteoQtyStepperBeacon.a(), sendCriteoQtyStepperBeacon.getBeaconType(), sendCriteoQtyStepperBeacon.getProduct());
            return;
        }
        if (action instanceof AbstractC12581j.SendCriteoViewBeacon) {
            AbstractC12581j.SendCriteoViewBeacon sendCriteoViewBeacon = (AbstractC12581j.SendCriteoViewBeacon) action;
            Q1(sendCriteoViewBeacon.a(), sendCriteoViewBeacon.getFormatLevelBeacon(), sendCriteoViewBeacon.getBeaconType(), sendCriteoViewBeacon.getProduct());
        } else if (action instanceof AbstractC12581j.SendCriteoLoadBeacon) {
            AbstractC12581j.SendCriteoLoadBeacon sendCriteoLoadBeacon = (AbstractC12581j.SendCriteoLoadBeacon) action;
            O1(sendCriteoLoadBeacon.getBeacon(), sendCriteoLoadBeacon.getFormatLevelBeacon(), sendCriteoLoadBeacon.getBeaconType(), sendCriteoLoadBeacon.getProduct());
        } else if (action instanceof AbstractC12581j.ZeroResultsVisibilityAction) {
            i2(((AbstractC12581j.ZeroResultsVisibilityAction) action).getShouldShow());
        } else {
            if (!(action instanceof AbstractC12581j.GoogleAdClicked)) {
                throw new NoWhenBranchMatchedException();
            }
            this.analyticsEngine.k(C14375c.b(((AbstractC12581j.GoogleAdClicked) action).getAnalytics(), "product search page"));
        }
    }

    public final void L1(List<String> beacon, Ul.a type, boolean isFormatLevel, nk.c product) {
        Intrinsics.j(beacon, "beacon");
        C15809k.d(androidx.view.d0.a(this), this.ioDispatcher, null, new G(beacon, isFormatLevel, type, this, product, null), 2, null);
    }

    public final void N1(List<String> beacon, String formatLevelBeacon, Ul.a beaconType, nk.c product) {
        ViewState value;
        ViewState viewState;
        Intrinsics.j(beacon, "beacon");
        Intrinsics.j(formatLevelBeacon, "formatLevelBeacon");
        if (this._viewState.getValue().e().containsAll(beacon)) {
            return;
        }
        M1(this, beacon, beaconType, false, product, 4, null);
        if (formatLevelBeacon.length() > 0) {
            L1(CollectionsKt.e(formatLevelBeacon), beaconType, true, product);
        }
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
        } while (!interfaceC16549B.e(value, ViewState.c(viewState, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, false, CollectionsKt.j1(CollectionsKt.P0(viewState.e(), beacon)), null, null, null, 0, 0, false, false, null, null, null, 268304383, null).a()));
    }

    public final void O1(String beacon, String formatLevelBeacon, Ul.a beaconType, nk.c product) {
        ViewState value;
        Intrinsics.j(beacon, "beacon");
        Intrinsics.j(formatLevelBeacon, "formatLevelBeacon");
        if (StringsKt.s0(beacon) || this.trackingLoadBeacon.contains(beacon)) {
            return;
        }
        M1(this, CollectionsKt.e(beacon), beaconType, false, product, 4, null);
        this.trackingLoadBeacon.add(beacon);
        if (!StringsKt.s0(formatLevelBeacon) && !this.trackingOnLoadFormatLevelBeacon.contains(formatLevelBeacon)) {
            L1(CollectionsKt.e(formatLevelBeacon), beaconType, true, product);
            this.trackingOnLoadFormatLevelBeacon.add(formatLevelBeacon);
        }
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, ViewState.c(value, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, false, null, null, this.trackingLoadBeacon, null, 0, 0, false, false, null, null, null, 267911167, null).a()));
    }

    public final void Q1(List<String> beacon, String formatLevelBeacon, Ul.a beaconType, nk.c product) {
        ViewState value;
        ViewState viewState;
        Intrinsics.j(beacon, "beacon");
        Intrinsics.j(formatLevelBeacon, "formatLevelBeacon");
        if (this._viewState.getValue().y().containsAll(beacon)) {
            return;
        }
        M1(this, beacon, beaconType, false, product, 4, null);
        if (!StringsKt.s0(formatLevelBeacon) && !this.trackingOnViewFormatLevelBeacon.contains(formatLevelBeacon)) {
            L1(CollectionsKt.e(formatLevelBeacon), beaconType, true, product);
            this.trackingOnViewFormatLevelBeacon.add(formatLevelBeacon);
        }
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
        } while (!interfaceC16549B.e(value, ViewState.c(viewState, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, false, null, CollectionsKt.j1(CollectionsKt.P0(viewState.y(), beacon)), null, null, 0, 0, false, false, null, null, null, 268173311, null).a()));
    }

    public final void R1(String str) {
        this.campaignIdValue = str;
    }

    public final void S1(String str) {
        this.carouselTitleAnalytics = str;
    }

    public final void T1(String str) {
        this.cmpid = str;
    }

    /* renamed from: U0, reason: from getter */
    public final String getCampaignIdValue() {
        return this.campaignIdValue;
    }

    public final void U1(String str) {
        this.collectionName = str;
    }

    /* renamed from: V0, reason: from getter */
    public final String getCarouselTitleAnalytics() {
        return this.carouselTitleAnalytics;
    }

    public final void V1(String str) {
        this.departmentCarouselAnalytics = str;
    }

    public final void X1(CartProductListDecorator item) {
        this.itemToSubstitute = item;
    }

    /* renamed from: Y0, reason: from getter */
    public final String getCmpid() {
        return this.cmpid;
    }

    public final void Y1(Paginator paginator) {
        Intrinsics.j(paginator, "<set-?>");
        this.paginator = paginator;
    }

    /* renamed from: Z0, reason: from getter */
    public final String getCollectionName() {
        return this.collectionName;
    }

    public final W.ComplexPromo a1(String productCode) {
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

    public final void b2(Qo.l query, boolean forceRefresh) {
        Intrinsics.j(query, "query");
        if (!forceRefresh && Intrinsics.e(query.g(), h1().getValue().g())) {
            InterfaceC16549B<Qo.l> interfaceC16549BH1 = h1();
            while (!interfaceC16549BH1.e(interfaceC16549BH1.getValue(), query)) {
            }
        } else {
            this.paginator = Paginator.b(this.paginator, 0, 0, 1, 0, false, 10, null);
            this.productStateRepository.i1(query);
            InterfaceC16549B<Qo.l> interfaceC16549BH12 = h1();
            while (!interfaceC16549BH12.e(interfaceC16549BH12.getValue(), query.g())) {
            }
        }
    }

    /* renamed from: d1, reason: from getter */
    public final String getDepartmentCarouselAnalytics() {
        return this.departmentCarouselAnalytics;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e2(java.lang.String r25, boolean r26, java.lang.String r27) {
        /*
            r24 = this;
            r0 = r24
            r2 = r25
            java.lang.String r1 = "term"
            kotlin.jvm.internal.Intrinsics.j(r2, r1)
            pv.B r1 = r0.h1()
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
            c2(r0, r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.personalized.modals.e1.e2(java.lang.String, boolean, java.lang.String):void");
    }

    /* renamed from: f1, reason: from getter */
    public final Paginator getPaginator() {
        return this.paginator;
    }

    public final void g2(boolean value) {
        this._stepperClicked.setValue(Boolean.valueOf(value));
    }

    public final InterfaceC16553F<AbstractC12585n> getEvents() {
        return C16563h.b(this._event);
    }

    public final InterfaceC16553F<ToastMessageData> getToastMessageData() {
        return C16563h.b(this._toastMessageData);
    }

    public final void h2(String str) {
        this.whiteLabelFallbackCarousel = str;
    }

    public final String i1() {
        Qo.l productQuery = this.viewState.getValue().getProductQuery();
        if ((productQuery instanceof l.Recommendations) && Intrinsics.e(((l.Recommendations) productQuery).getRecommendationProductType(), "meijerRecommendations")) {
            return this.carouselTitle;
        }
        String str = this.whiteLabelFallbackCarousel;
        if (str == null || StringsKt.s0(str)) {
            return null;
        }
        return this.whiteLabelFallbackCarousel;
    }

    public final boolean l1(String productCode) {
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

    public final pv.P<Boolean> m1() {
        return this.stepperClicked;
    }

    public final pv.P<ViewState> o1() {
        return this.viewState;
    }

    public void onAction(Qk.a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.Clip) {
            a.Clip clip = (a.Clip) action;
            O0(clip.getCoupon(), clip.getTrackingData());
        } else if (!(action instanceof a.NotInterested) && !(action instanceof a.Unclip) && !(action instanceof a.ViewCouponDetails) && !(action instanceof a.ViewCouponList)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // androidx.view.InterfaceC6157f
    public void onCreate(InterfaceC6172s owner) {
        Intrinsics.j(owner, "owner");
        u2();
    }

    @Override // androidx.view.InterfaceC6157f
    public void onResume(InterfaceC6172s owner) {
        Intrinsics.j(owner, "owner");
        z1();
    }

    /* renamed from: p1, reason: from getter */
    public final String getWhiteLabelFallbackCarousel() {
        return this.whiteLabelFallbackCarousel;
    }

    public final void u1(Qo.l initialProductQuery, HashMap<String, String> departmentBreadcrumbs) {
        ViewState value;
        EnumC14378f enumC14378f;
        GoogleAdData googleAdDataB;
        InterfaceC12688r interfaceC12688r;
        EnumC14378f enumC14378f2;
        ViewState value2;
        l.Search search;
        EnumC14378f enumC14378f3;
        GoogleAdData googleAdDataA;
        InterfaceC12688r interfaceC12688r2;
        EnumC14378f enumC14378f4;
        Integer num = 2;
        Integer num2 = 1;
        if (initialProductQuery instanceof l.Department) {
            InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
            while (true) {
                ViewState value3 = interfaceC16549B.getValue();
                C12687q c12687q = C12687q.f113757a;
                l.Department department = (l.Department) initialProductQuery;
                GoogleAdData googleAdDataC = C12687q.c(c12687q, EnumC14378f.f134255d, department, departmentBreadcrumbs, true, this.userManager.y(), null, 32, null);
                EnumC14378f enumC14378f5 = EnumC14378f.f134258g;
                Integer num3 = num2;
                num2 = num3;
                InterfaceC16549B<ViewState> interfaceC16549B2 = interfaceC16549B;
                Integer num4 = num;
                num = num4;
                if (interfaceC16549B2.e(value3, ViewState.c(value3, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 0, 0, false, false, googleAdDataC, c12687q.b(enumC14378f5, department, departmentBreadcrumbs, true, this.userManager.y(), num3), c12687q.b(enumC14378f5, department, departmentBreadcrumbs, true, this.userManager.y(), num4), 33554431, null).a())) {
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
                InterfaceC12688r interfaceC12688r3 = this.adManagerProvider;
                search = (l.Search) initialProductQuery;
                EnumC14378f enumC14378f6 = EnumC14378f.f134255d;
                enumC14378f3 = EnumC14378f.f134260i;
                googleAdDataA = interfaceC12688r3.a(search, 1, enumC14378f6, enumC14378f3);
                interfaceC12688r2 = this.adManagerProvider;
                enumC14378f4 = EnumC14378f.f134258g;
            } while (!interfaceC16549B3.e(value2, ViewState.c(value2, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 0, 0, false, false, googleAdDataA, interfaceC12688r2.a(search, 2, enumC14378f4, enumC14378f3), this.adManagerProvider.a(search, 3, enumC14378f4, enumC14378f3), 33554431, null).a()));
        }
        if (initialProductQuery instanceof l.BrowseCollection) {
            InterfaceC16549B<ViewState> interfaceC16549B4 = this._viewState;
            while (true) {
                ViewState value4 = interfaceC16549B4.getValue();
                C12687q c12687q2 = C12687q.f113757a;
                EnumC14378f enumC14378f7 = EnumC14378f.f134255d;
                l.BrowseCollection browseCollection = (l.BrowseCollection) initialProductQuery;
                zl.k kVar = this.featureManager;
                AbstractC18503f.C c10 = AbstractC18503f.C.f172844h;
                GoogleAdData googleAdDataA2 = c12687q2.a(enumC14378f7, browseCollection, kVar.e(c10), this.userManager.y(), num2);
                EnumC14378f enumC14378f8 = EnumC14378f.f134258g;
                InterfaceC16549B<ViewState> interfaceC16549B5 = interfaceC16549B4;
                if (interfaceC16549B5.e(value4, ViewState.c(value4, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 0, 0, false, false, googleAdDataA2, c12687q2.a(enumC14378f8, browseCollection, this.featureManager.e(c10), this.userManager.y(), num), c12687q2.a(enumC14378f8, browseCollection, this.featureManager.e(c10), this.userManager.y(), 3), 33554431, null).a())) {
                    break;
                } else {
                    interfaceC16549B4 = interfaceC16549B5;
                }
            }
        }
        if (initialProductQuery instanceof l.Personalized) {
            l.Personalized personalized = (l.Personalized) initialProductQuery;
            int i10 = r.$EnumSwitchMapping$0[personalized.getCategory().ordinal()];
            if (i10 != 1 && i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC16549B<ViewState> interfaceC16549B6 = this._viewState;
            do {
                value = interfaceC16549B6.getValue();
                InterfaceC12688r interfaceC12688r4 = this.adManagerProvider;
                EnumC14378f enumC14378f9 = EnumC14378f.f134255d;
                enumC14378f = EnumC14378f.f134260i;
                googleAdDataB = interfaceC12688r4.b(personalized, 1, enumC14378f9, enumC14378f);
                interfaceC12688r = this.adManagerProvider;
                enumC14378f2 = EnumC14378f.f134258g;
            } while (!interfaceC16549B6.e(value, ViewState.c(value, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 0, 0, false, false, googleAdDataB, interfaceC12688r.b(personalized, 2, enumC14378f2, enumC14378f), this.adManagerProvider.b(personalized, 3, enumC14378f2, enumC14378f), 33554431, null).a()));
        }
    }

    public final void u2() {
        if (this.userManager.b()) {
            C15809k.d(androidx.view.d0.a(this), null, null, new O(null), 3, null);
            io.reactivex.l<Integer> lVarSubscribeOn = this.cartRepository.Q().subscribeOn(C13889a.b());
            final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.N0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e1.v2(this.f111823a, (Integer) obj);
                }
            };
            Lu.g<? super Integer> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.W0
                @Override // Lu.g
                public final void accept(Object obj) {
                    e1.w2(function1, obj);
                }
            };
            final P p10 = new P(qw.a.INSTANCE);
            Dk.a.a(lVarSubscribeOn.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.personalized.modals.X0
                @Override // Lu.g
                public final void accept(Object obj) {
                    e1.x2(p10, obj);
                }
            }), this.disposables);
        }
    }

    public final void y2() {
        ViewState value;
        ViewState viewState;
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            viewState = value;
        } while (!interfaceC16549B.e(value, ViewState.c(viewState, null, null, null, null, false, false, false, null, C17728h.b(viewState.q(), this.featureManager.e(AbstractC18503f.k0.f172887h), this.featureManager.e(AbstractC18503f.l0.f172889h)), null, null, null, null, null, null, null, false, null, null, null, null, 0, 0, false, false, null, null, null, 268435199, null)));
    }

    private final void B1(ClipUnclipCouponResponse response, Coupon coupon, String couponLocation) {
        if (!StringsKt.I(response.getResult(), "Success", false, 2, null)) {
            C15809k.d(androidx.view.d0.a(this), null, null, new A(coupon, null), 3, null);
        } else {
            n2(coupon, couponLocation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C0(e1 e1Var, Coupon coupon, String str, ClipUnclipCouponResponse clipUnclipCouponResponse) {
        Intrinsics.g(clipUnclipCouponResponse);
        e1Var.B1(clipUnclipCouponResponse, coupon, str);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void I1(ProductFullDetails product, Qo.l productQuery, int position) {
        Qo.l value = h1().getValue();
        if (value instanceof l.Personalized) {
            int i10 = r.$EnumSwitchMapping$0[((l.Personalized) value).getCategory().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    p2("event: shopping list: product detail view");
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                p2("event: favorites on sale modal: product detail view");
            }
        } else if (!(value instanceof l.Recommendations)) {
            if (value instanceof l.Favorites) {
                p2("event: favorites modal: product detail view");
            } else if (value instanceof l.ShoppingList) {
                p2("event: shopping list: show product details");
            } else if (value instanceof l.Search) {
                this.analyticsEngine.h(C14756c.a("event: search: product detail"), C14756c.c("mperks: search"), C14756c.g("search"));
            } else if (!(value instanceof l.BrowseCollection) && !(value instanceof l.Coupon) && !(value instanceof l.Reward) && !(value instanceof l.Department)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.productAnalytics.j(productQuery, product, position);
        C15809k.d(androidx.view.d0.a(this), null, null, new D(product, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M0(e1 e1Var, String str) {
        Intrinsics.g(str);
        e1Var.cartId = str;
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P0(e1 e1Var, TrackingData trackingData, Coupon coupon) {
        String value;
        List<AbstractC14762i> listK;
        AbstractC14762i abstractC14762i;
        Intrinsics.g(coupon);
        if (trackingData != null && (listK = trackingData.k()) != null && (abstractC14762i = (AbstractC14762i) CollectionsKt.u0(listK)) != null) {
            value = abstractC14762i.getValue();
        } else {
            value = null;
        }
        e1Var.B0(coupon, value);
        return Unit.f143329a;
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
    public static final void R0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object T(e1 e1Var, List list, Continuation continuation) {
        e1Var.onLoadingStates(list);
        return Unit.f143329a;
    }

    private final Integer T0(CouponState couponState, uk.c<EntryChange> entryChange) {
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

    private final String W0() {
        Qo.l value = h1().getValue();
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

    private final String X0() {
        Qo.l value = h1().getValue();
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
    public final void Z1() {
        C15809k.d(androidx.view.d0.a(this), null, null, new H(null), 3, null);
    }

    private final void l2(boolean overrideItemAlreadyInCart) {
        nk.i iVarC;
        ProductFullDetails product;
        ProductListDecorator productListDecoratorK1 = k1();
        if (productListDecoratorK1 != null) {
            nk.i iVarB = nk.k.b(Co.l.g(productListDecoratorK1.getProduct().getCode()), 1.0d);
            CartProductListDecorator cartProductListDecorator = this.itemToSubstitute;
            if (cartProductListDecorator != null && (product = cartProductListDecorator.getProduct()) != null) {
                iVarC = nk.k.c(product, 0.0d);
            } else {
                iVarC = null;
            }
            this.loadingStatesManager.b(new a.Loading(null, null, 3, null));
            if (iVarC != null) {
                C15809k.d(androidx.view.d0.a(this), null, null, new N(iVarC, iVarB, overrideItemAlreadyInCart, null), 3, null);
            }
        }
    }

    private final void q1(AbstractC12581j action) {
        Qo.l value = h1().getValue();
        if (value instanceof l.Favorites) {
            this.analyticsEngine.h(C14756c.a("event: favorites modal: view shopping list"), C14756c.c("menu"), C14756c.g("menu"));
        } else if (!(value instanceof l.ShoppingList) && !(value instanceof l.Department) && !(value instanceof l.BrowseCollection) && !(value instanceof l.Search) && !(value instanceof l.Coupon) && !(value instanceof l.Reward)) {
            if (value instanceof l.Personalized) {
                int i10 = r.$EnumSwitchMapping$0[((l.Personalized) value).getCategory().ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        this.analyticsEngine.h(C14756c.a("event: shopping list: view shopping list"), C14756c.c("Shopping List"), C14756c.g("shopping list"));
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    this.analyticsEngine.h(C14756c.a("event: favorites on sale modal: shopping list icon"), C14756c.c("menu"), C14756c.g("menu"));
                }
            } else if (!(value instanceof l.Recommendations)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        C15809k.d(androidx.view.d0.a(this), null, null, new v(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendBeaconToastMessage(Ul.a type, boolean isFormatLevel, nk.c product) {
        C15809k.d(androidx.view.d0.a(this), null, null, new F(isFormatLevel, this, type, product, null), 3, null);
    }

    private final void t1() {
        if ((h1().getValue() instanceof l.Department) || (h1().getValue() instanceof l.BrowseCollection)) {
            C15809k.d(androidx.view.d0.a(this), null, null, new x(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void y1() {
        C15809k.d(androidx.view.d0.a(this), null, null, new z(null), 3, null);
    }

    public final String n1() {
        Qo.l value = h1().getValue();
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
