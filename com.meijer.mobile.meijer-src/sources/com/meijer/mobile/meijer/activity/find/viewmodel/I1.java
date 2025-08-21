package com.meijer.mobile.meijer.activity.find.viewmodel;

import Co.ProductFullDetails;
import Go.SearchSuggestions;
import Pj.a;
import Pk.Coupon;
import Qk.a;
import Qo.l;
import Vl.DepartmentCard;
import Vl.HomeDepartment;
import Vl.e;
import Yk.CouponState;
import android.net.Uri;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC6157f;
import androidx.view.InterfaceC6172s;
import bk.AbstractC6392a;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.core.util.networking.NoAvailableNetworksException;
import com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse;
import com.meijer.mobile.meijer.activity.find.viewmodel.AbstractC12412s;
import com.meijer.mobile.meijer.activity.find.viewmodel.AbstractC12415t;
import com.meijer.mobile.meijer.activity.home.HomeDecorator;
import com.meijer.mobile.meijer.activity.home.HomeViewModel;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import dl.C13702d;
import ev.C13889a;
import fj.Entry;
import fj.ShoppingCart;
import hi.InterfaceC14523a;
import ii.AbstractC14761h;
import ii.AbstractC14762i;
import ii.C14756c;
import ii.C14760g;
import ii.TrackingData;
import ik.CartPreviewDecorator;
import java.net.ConnectException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import jm.C15052a;
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
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import qw.a;
import retrofit2.HttpException;
import sp.C17115a;
import sp.ProductState;
import vs.C17728h;
import vs.CarouselDecorator;
import vs.ProductListDecorator;
import wl.CartEntry;
import wl.ProductEligibility;
import ys.C18371a;
import ys.C18372b;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000\u0080\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002©\u0001Ba\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u001e2\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0015\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020)2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b,\u0010+J\u0015\u0010-\u001a\u00020)2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b-\u0010+J\u0015\u0010.\u001a\u00020)2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b.\u0010+J-\u00103\u001a\u00020/2\u0006\u0010(\u001a\u00020'2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/2\u0006\u00102\u001a\u00020/¢\u0006\u0004\b3\u00104J\u001f\u00108\u001a\u0004\u0018\u0001072\u0006\u0010(\u001a\u00020'2\u0006\u00106\u001a\u000205¢\u0006\u0004\b8\u00109J/\u0010:\u001a\u0004\u0018\u0001072\u0006\u0010(\u001a\u00020'2\u0006\u00101\u001a\u00020/2\u0006\u00102\u001a\u00020/2\u0006\u00106\u001a\u000205¢\u0006\u0004\b:\u0010;J\u001f\u0010=\u001a\u0004\u0018\u0001072\u0006\u0010(\u001a\u00020'2\u0006\u0010<\u001a\u00020/¢\u0006\u0004\b=\u0010>J\u001d\u0010?\u001a\u00020'2\u0006\u00101\u001a\u00020/2\u0006\u00102\u001a\u00020/¢\u0006\u0004\b?\u0010@J\u0015\u0010C\u001a\u00020\u001e2\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\u001e2\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ\u001b\u0010L\u001a\u00020\u001e2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020J0I¢\u0006\u0004\bL\u0010MJ\r\u0010N\u001a\u00020\u001e¢\u0006\u0004\bN\u0010\"J\u0017\u0010Q\u001a\u00020\u001e2\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bQ\u0010RJ \u0010T\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020#2\u0006\u0010S\u001a\u00020)H\u0082@¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020\u001e2\u0006\u0010V\u001a\u00020/H\u0002¢\u0006\u0004\bW\u0010XJ+\u0010\\\u001a\u00020\u001e2\b\u0010Y\u001a\u0004\u0018\u0001052\b\u0010Z\u001a\u0004\u0018\u0001052\u0006\u0010[\u001a\u00020)H\u0002¢\u0006\u0004\b\\\u0010]J+\u0010c\u001a\u00020\u001e2\u0006\u0010^\u001a\u00020\u00022\u0012\u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020a0`0_H\u0002¢\u0006\u0004\bc\u0010dJ\u0019\u0010f\u001a\u00020e*\b\u0012\u0004\u0012\u00020a0`H\u0002¢\u0006\u0004\bf\u0010gJ\u0017\u0010j\u001a\u00020\u001e2\u0006\u0010i\u001a\u00020hH\u0002¢\u0006\u0004\bj\u0010kJ\u001f\u0010o\u001a\u00020\u001e2\u0006\u0010l\u001a\u0002052\u0006\u0010n\u001a\u00020mH\u0002¢\u0006\u0004\bo\u0010pJ\u0017\u0010r\u001a\u00020\u001e2\u0006\u0010B\u001a\u00020qH\u0002¢\u0006\u0004\br\u0010sJ/\u0010w\u001a\u00020\u001e2\n\b\u0002\u0010t\u001a\u0004\u0018\u0001052\b\b\u0002\u0010u\u001a\u00020)2\b\b\u0002\u0010v\u001a\u00020)H\u0002¢\u0006\u0004\bw\u0010xJC\u0010z\u001a\b\u0012\u0004\u0012\u00020e0_2\f\u0010y\u001a\b\u0012\u0004\u0012\u00020e0_2\n\b\u0002\u0010t\u001a\u0004\u0018\u0001052\b\b\u0002\u0010u\u001a\u00020)2\b\b\u0002\u0010v\u001a\u00020)H\u0002¢\u0006\u0004\bz\u0010{J\u0017\u0010}\u001a\u00020\u001e2\u0006\u0010B\u001a\u00020|H\u0002¢\u0006\u0004\b}\u0010~J\u000f\u0010\u007f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u007f\u0010\"J&\u0010\u0084\u0001\u001a\u00020\u001e2\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J*\u0010\u0088\u0001\u001a\u00020\u001e2\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\f\b\u0002\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u0001H\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J*\u0010\u008c\u0001\u001a\u00020\u001e2\b\u0010\u008b\u0001\u001a\u00030\u008a\u00012\f\b\u0002\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u0001H\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J4\u0010\u0090\u0001\u001a\u00020\u001e2\b\u0010\u008f\u0001\u001a\u00030\u008e\u00012\b\u0010\u008b\u0001\u001a\u00030\u008a\u00012\f\b\u0002\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u0001H\u0002¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J'\u0010\u0092\u0001\u001a\u00030\u0086\u00012\b\u0010\u008b\u0001\u001a\u00030\u008a\u00012\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001H\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u001e\u0010\u0094\u0001\u001a\u0004\u0018\u0001052\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001H\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u0011\u0010\u0096\u0001\u001a\u00020\u001eH\u0002¢\u0006\u0005\b\u0096\u0001\u0010\"J\u0011\u0010\u0097\u0001\u001a\u00020\u001eH\u0002¢\u0006\u0005\b\u0097\u0001\u0010\"J\u0011\u0010\u0098\u0001\u001a\u00020\u001eH\u0002¢\u0006\u0005\b\u0098\u0001\u0010\"J\u001a\u0010\u0099\u0001\u001a\u00020\u001e2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u0018\u0010´\u0001\u001a\u00030±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u0018\u0010¸\u0001\u001a\u00030µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u0019\u0010»\u0001\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R \u0010¿\u0001\u001a\t\u0012\u0005\u0012\u00030¼\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u001e\u0010Ã\u0001\u001a\t\u0012\u0004\u0012\u00020#0À\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\u001f\u0010È\u0001\u001a\n\u0012\u0005\u0012\u00030Å\u00010Ä\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R#\u0010Î\u0001\u001a\t\u0012\u0004\u0012\u00020)0É\u00018\u0006¢\u0006\u0010\n\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001R#\u0010Ñ\u0001\u001a\t\u0012\u0004\u0012\u00020)0É\u00018\u0006¢\u0006\u0010\n\u0006\bÏ\u0001\u0010Ë\u0001\u001a\u0006\bÐ\u0001\u0010Í\u0001R#\u0010Ô\u0001\u001a\t\u0012\u0004\u0012\u0002050É\u00018\u0006¢\u0006\u0010\n\u0006\bÒ\u0001\u0010Ë\u0001\u001a\u0006\bÓ\u0001\u0010Í\u0001R#\u0010×\u0001\u001a\t\u0012\u0004\u0012\u0002050É\u00018\u0006¢\u0006\u0010\n\u0006\bÕ\u0001\u0010Ë\u0001\u001a\u0006\bÖ\u0001\u0010Í\u0001R#\u0010Ú\u0001\u001a\t\u0012\u0004\u0012\u00020)0É\u00018\u0006¢\u0006\u0010\n\u0006\bØ\u0001\u0010Ë\u0001\u001a\u0006\bÙ\u0001\u0010Í\u0001R#\u0010Ý\u0001\u001a\t\u0012\u0004\u0012\u00020)0É\u00018\u0006¢\u0006\u0010\n\u0006\bÛ\u0001\u0010Ë\u0001\u001a\u0006\bÜ\u0001\u0010Í\u0001R#\u0010à\u0001\u001a\t\u0012\u0004\u0012\u00020)0É\u00018\u0006¢\u0006\u0010\n\u0006\bÞ\u0001\u0010Ë\u0001\u001a\u0006\bß\u0001\u0010Í\u0001R#\u0010ã\u0001\u001a\t\u0012\u0004\u0012\u0002050É\u00018\u0006¢\u0006\u0010\n\u0006\bá\u0001\u0010Ë\u0001\u001a\u0006\bâ\u0001\u0010Í\u0001R#\u0010æ\u0001\u001a\t\u0012\u0004\u0012\u0002050É\u00018\u0006¢\u0006\u0010\n\u0006\bä\u0001\u0010Ë\u0001\u001a\u0006\bå\u0001\u0010Í\u0001R#\u0010é\u0001\u001a\t\u0012\u0004\u0012\u00020)0É\u00018\u0006¢\u0006\u0010\n\u0006\bç\u0001\u0010Ë\u0001\u001a\u0006\bè\u0001\u0010Í\u0001R*\u0010í\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ê\u00010_0É\u00018\u0006¢\u0006\u0010\n\u0006\bë\u0001\u0010Ë\u0001\u001a\u0006\bì\u0001\u0010Í\u0001R$\u0010ñ\u0001\u001a\n\u0012\u0005\u0012\u00030î\u00010É\u00018\u0006¢\u0006\u0010\n\u0006\bï\u0001\u0010Ë\u0001\u001a\u0006\bð\u0001\u0010Í\u0001R#\u0010ô\u0001\u001a\t\u0012\u0004\u0012\u0002070É\u00018\u0006¢\u0006\u0010\n\u0006\bò\u0001\u0010Ë\u0001\u001a\u0006\bó\u0001\u0010Í\u0001R$\u0010ø\u0001\u001a\n\u0012\u0005\u0012\u00030õ\u00010É\u00018\u0006¢\u0006\u0010\n\u0006\bö\u0001\u0010Ë\u0001\u001a\u0006\b÷\u0001\u0010Í\u0001R0\u0010ü\u0001\u001a\u001b\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u000105\u0012\u0007\u0012\u0005\u0018\u00010ú\u00010ù\u00010É\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bû\u0001\u0010Ë\u0001R\u001d\u0010u\u001a\t\u0012\u0004\u0012\u00020)0É\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bý\u0001\u0010Ë\u0001R \u0010ÿ\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u0001050É\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bþ\u0001\u0010Ë\u0001R\u001e\u0010\u0081\u0002\u001a\t\u0012\u0004\u0012\u00020)0É\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0002\u0010Ë\u0001R\u001f\u0010\u0084\u0002\u001a\n\u0012\u0005\u0012\u00030\u0082\u00020À\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0002\u0010Â\u0001R\u001c\u0010\u0088\u0002\u001a\n\u0012\u0005\u0012\u00030Å\u00010\u0085\u00028F¢\u0006\b\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002R\u001c\u0010\u008c\u0002\u001a\n\u0012\u0005\u0012\u00030\u0082\u00020\u0089\u00028F¢\u0006\b\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002¨\u0006\u008d\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/I1;", "Landroidx/lifecycle/c0;", "", "Landroidx/lifecycle/f;", "LRo/c;", "productsRepository", "Ltl/h;", "timeSlotRepository", "Lyo/k;", "userManager", "LRo/a;", "productAnalytics", "Lil/m;", "cartRepository", "Ljm/a;", "homeRepository", "Lhi/a;", "analyticsEngine", "Lzl/k;", "featureManager", "Ldl/d;", "couponsRepository", "Lsp/a;", "multiChannelProductsStateRepository", "Lwr/f;", "cartInteractor", "<init>", "(LRo/c;Ltl/h;Lyo/k;LRo/a;Lil/m;Ljm/a;Lhi/a;Lzl/k;Ldl/d;Lsp/a;Lwr/f;)V", "Landroidx/lifecycle/s;", "owner", "", "onCreate", "(Landroidx/lifecycle/s;)V", "onCleared", "()V", "LQo/l$k;", "query", "U0", "(LQo/l$k;)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/I1$h;", "limitedResultsScenario", "", "Y0", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/I1$h;)Z", "X0", "V0", "W0", "", "totalResults", "tokenMatchCount", "embeddingsCount", "k0", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/I1$h;III)I", "", "searchTerm", "Lbk/a;", "h0", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/I1$h;Ljava/lang/String;)Lbk/a;", "g0", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/I1$h;IILjava/lang/String;)Lbk/a;", "number", "i0", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/I1$h;I)Lbk/a;", "j0", "(II)Lcom/meijer/mobile/meijer/activity/find/viewmodel/I1$h;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t;", "oldSearchViewModelAction", "O0", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/t;)V", "LQk/a;", "action", "onAction", "(LQk/a;)V", "Luk/c;", "Lfj/C;", "shoppingCartResource", "R0", "(Luk/c;)V", "Z0", "LGo/a;", "suggestions", "S0", "(LGo/a;)V", "resetDeeplinkFacet", "a1", "(LQo/l$k;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "itemCount", "J0", "(I)V", "uriString", "carouselTitle", "isFromSeeMoreItems", "T0", "(Ljava/lang/String;Ljava/lang/String;Z)V", "key", "", "Lsp/b;", "LCo/h;", "productStates", "onProductsState", "(Ljava/lang/Object;Ljava/util/List;)V", "Lvs/f;", "toProductListDecorator", "(Lsp/b;)Lvs/f;", "LVl/e$f;", "homeComponent", "m0", "(LVl/e$f;)V", "loadingKey", "", "error", "setLoadingStateError", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$p;", "M0", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$p;)V", "activeStepperId", "resetStepper", "inTransition", "onStepperInteractionChange", "(Ljava/lang/String;ZZ)V", "productListDecorators", "updateStepperState", "(Ljava/util/List;Ljava/lang/String;ZZ)Ljava/util/List;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$e;", "K0", "(Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$e;)V", "pushUserAuthenticationState", "LPk/c;", "couponIdentity", "Lkk/a;", "carouselType", "onProductCouponButtonClicked", "(LPk/c;Lkk/a;)V", "Lii/f;", "trackingData", "n0", "(LPk/c;Lii/f;)V", "LPk/a;", "coupon", "b0", "(LPk/a;Lii/f;)V", "Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;", "response", "N0", "(Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;LPk/a;Lii/f;)V", "getClipCouponTrackingData", "(LPk/a;Lkk/a;)Lii/f;", "getCarouselType", "(Lkk/a;)Ljava/lang/String;", "l0", "I0", "a0", "Q0", "(Ljava/lang/String;)V", "a", "LRo/c;", "b", "Ltl/h;", "c", "Lyo/k;", "d", "LRo/a;", "e", "Lil/m;", "f", "Ljm/a;", "g", "Lhi/a;", "h", "Lzl/k;", "i", "Ldl/d;", "j", "Lsp/a;", "k", "Lwr/f;", "LJu/a;", "l", "LJu/a;", "disposables", "LPj/c;", "m", "LPj/c;", "loadingStatesManager", "n", "Z", "skipProductCarouselUpdates", "Lfj/i;", "o", "Ljava/util/List;", "cartEntries", "Lpv/A;", "p", "Lpv/A;", "searchReplayBuffer", "Lpv/B;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/u;", "q", "Lpv/B;", "_viewState", "Landroidx/compose/runtime/l0;", "r", "Landroidx/compose/runtime/l0;", "E0", "()Landroidx/compose/runtime/l0;", "isResultsExplanationLayoutVisible", "s", "C0", "isResultsExplanationBodyVisible", "t", "x0", "resultsExplanationTitleText", "u", "w0", "resultsExplanationBodyText", "v", "F0", "isSortAndFilterLayoutVisible", "w", "G0", "isZeroResultsSectionVisible", "x", "H0", "isZeroResultsTopCarouselVisible", "y", "y0", "searchResultsHeaderText", "z", "u0", "filterAndSortButtonText", "A", "B0", "isFilterAndSortButtonVisible", "LVl/g;", "B", "s0", "departmentsList", "LPj/a;", "C", "t0", "departmentsLoadingState", "D", "z0", "shopByDepartmentCarouselViewAllTitle", "Lcom/meijer/mobile/meijer/activity/home/HomeDecorator;", "E", "v0", "homeDecorator", "", "LYk/c;", "F", "couponsStateMap", "G", "H", "stepperIdInInteraction", "I", "isStepperInTransition", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/s;", "J", "_event", "Lpv/P;", "A0", "()Lpv/P;", "viewState", "Lpv/F;", "getEvents", "()Lpv/F;", "events", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class I1 extends androidx.view.c0 implements InterfaceC6157f {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Boolean> isFilterAndSortButtonVisible;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<List<HomeDepartment>> departmentsList;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Pj.a> departmentsLoadingState;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<AbstractC6392a> shopByDepartmentCarouselViewAllTitle;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<HomeDecorator> homeDecorator;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Map<String, CouponState>> couponsStateMap;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Boolean> resetStepper;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<String> stepperIdInInteraction;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Boolean> isStepperInTransition;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<AbstractC12412s> _event;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ro.c productsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final tl.h timeSlotRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Ro.a productAnalytics;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final il.m cartRepository;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C15052a homeRepository;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final zl.k featureManager;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final C13702d couponsRepository;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final C17115a multiChannelProductsStateRepository;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final wr.f cartInteractor;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Pj.c loadingStatesManager;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean skipProductCarouselUpdates;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private List<Entry> cartEntries;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<l.k> searchReplayBuffer;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<OldSearchViewState> _viewState;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Boolean> isResultsExplanationLayoutVisible;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Boolean> isResultsExplanationBodyVisible;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<String> resultsExplanationTitleText;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<String> resultsExplanationBodyText;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Boolean> isSortAndFilterLayoutVisible;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Boolean> isZeroResultsSectionVisible;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Boolean> isZeroResultsTopCarouselVisible;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<String> searchResultsHeaderText;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<String> filterAndSortButtonText;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.SearchProductViewModel$onShoppingCartStreamSuccess$1", f = "SearchProductViewModel.kt", l = {1076}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class A extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f108820a;

        /* renamed from: b, reason: collision with root package name */
        Object f108821b;

        /* renamed from: c, reason: collision with root package name */
        Object f108822c;

        /* renamed from: d, reason: collision with root package name */
        Object f108823d;

        /* renamed from: e, reason: collision with root package name */
        Object f108824e;

        /* renamed from: f, reason: collision with root package name */
        Object f108825f;

        /* renamed from: g, reason: collision with root package name */
        Object f108826g;

        /* renamed from: h, reason: collision with root package name */
        int f108827h;

        /* renamed from: i, reason: collision with root package name */
        int f108828i;

        /* renamed from: j, reason: collision with root package name */
        int f108829j;

        /* renamed from: k, reason: collision with root package name */
        int f108830k;

        /* renamed from: l, reason: collision with root package name */
        int f108831l;

        /* renamed from: m, reason: collision with root package name */
        int f108832m;

        /* renamed from: n, reason: collision with root package name */
        private /* synthetic */ Object f108833n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ uk.c<ShoppingCart> f108834o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ I1 f108835p;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            A a10 = new A(this.f108834o, this.f108835p, continuation);
            a10.f108833n = obj;
            return a10;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        A(uk.c<ShoppingCart> cVar, I1 i12, Continuation<? super A> continuation) {
            super(2, continuation);
            this.f108834o = cVar;
            this.f108835p = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((A) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00fe  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 266
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.I1.A.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.SearchProductViewModel$personalizedProductListClicked$1", f = "SearchProductViewModel.kt", l = {635}, m = "invokeSuspend")
    static final class B extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108836a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f108838c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<AbstractC14761h> f108839d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f108840e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f108841f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        B(Uri uri, Ref.ObjectRef<AbstractC14761h> objectRef, String str, boolean z10, Continuation<? super B> continuation) {
            super(2, continuation);
            this.f108838c = uri;
            this.f108839d = objectRef;
            this.f108840e = str;
            this.f108841f = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return I1.this.new B(this.f108838c, this.f108839d, this.f108840e, this.f108841f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((B) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108836a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = I1.this._event;
                AbstractC12412s.ViewPersonalizedProducts viewPersonalizedProducts = new AbstractC12412s.ViewPersonalizedProducts(this.f108838c, this.f108839d.f143742a, this.f108840e, this.f108841f);
                this.f108836a = 1;
                if (interfaceC16548A.emit(viewPersonalizedProducts, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class C extends FunctionReferenceImpl implements Function2<Pk.c, EnumC15218a, Unit> {
        C(Object obj) {
            super(2, obj, I1.class, "onProductCouponButtonClicked", "onProductCouponButtonClicked(Lcom/meijer/mobile/coupon/model/common/CouponIdentity;Lcom/meijer/mobile/core/models/home/CarouselType;)V", 0);
        }

        public final void a(Pk.c p02, EnumC15218a p12) {
            Intrinsics.j(p02, "p0");
            Intrinsics.j(p12, "p1");
            ((I1) this.receiver).onProductCouponButtonClicked(p02, p12);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Pk.c cVar, EnumC15218a enumC15218a) {
            a(cVar, enumC15218a);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.SearchProductViewModel$showKeyBoard$1", f = "SearchProductViewModel.kt", l = {1098}, m = "invokeSuspend")
    static final class D extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108842a;

        D(Continuation<? super D> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return I1.this.new D(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((D) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108842a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = I1.this._event;
                AbstractC12412s.ToggleKeyboardEvent toggleKeyboardEvent = new AbstractC12412s.ToggleKeyboardEvent(true);
                this.f108842a = 1;
                if (interfaceC16548A.emit(toggleKeyboardEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class E implements InterfaceC16561f<SearchSuggestions> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f f108844a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16562g f108845a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.SearchProductViewModel$special$$inlined$map$1$2", f = "SearchProductViewModel.kt", l = {50}, m = "emit")
            /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.I1$E$a$a, reason: collision with other inner class name */
            public static final class C1643a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f108846a;

                /* renamed from: b, reason: collision with root package name */
                int f108847b;

                /* renamed from: c, reason: collision with root package name */
                Object f108848c;

                /* renamed from: e, reason: collision with root package name */
                Object f108850e;

                /* renamed from: f, reason: collision with root package name */
                Object f108851f;

                /* renamed from: g, reason: collision with root package name */
                Object f108852g;

                /* renamed from: h, reason: collision with root package name */
                int f108853h;

                public C1643a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f108846a = obj;
                    this.f108847b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC16562g interfaceC16562g) {
                this.f108845a = interfaceC16562g;
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
                    boolean r0 = r7 instanceof com.meijer.mobile.meijer.activity.find.viewmodel.I1.E.a.C1643a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.meijer.mobile.meijer.activity.find.viewmodel.I1$E$a$a r0 = (com.meijer.mobile.meijer.activity.find.viewmodel.I1.E.a.C1643a) r0
                    int r1 = r0.f108847b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f108847b = r1
                    goto L18
                L13:
                    com.meijer.mobile.meijer.activity.find.viewmodel.I1$E$a$a r0 = new com.meijer.mobile.meijer.activity.find.viewmodel.I1$E$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f108846a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f108847b
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r6 = r0.f108852g
                    pv.g r6 = (pv.InterfaceC16562g) r6
                    java.lang.Object r6 = r0.f108850e
                    com.meijer.mobile.meijer.activity.find.viewmodel.I1$E$a$a r6 = (com.meijer.mobile.meijer.activity.find.viewmodel.I1.E.a.C1643a) r6
                    kotlin.ResultKt.b(r7)
                    goto L5e
                L31:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L39:
                    kotlin.ResultKt.b(r7)
                    pv.g r7 = r5.f108845a
                    r2 = r6
                    Go.d r2 = (Go.SuggestionResult) r2
                    Go.a r4 = new Go.a
                    java.util.List r2 = r2.a()
                    r4.<init>(r2)
                    r0.f108848c = r6
                    r0.f108850e = r0
                    r0.f108851f = r6
                    r0.f108852g = r7
                    r6 = 0
                    r0.f108853h = r6
                    r0.f108847b = r3
                    java.lang.Object r6 = r7.emit(r4, r0)
                    if (r6 != r1) goto L5e
                    return r1
                L5e:
                    kotlin.Unit r6 = kotlin.Unit.f143329a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.I1.E.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public E(InterfaceC16561f interfaceC16561f) {
            this.f108844a = interfaceC16561f;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super SearchSuggestions> interfaceC16562g, Continuation continuation) {
            Object objCollect = this.f108844a.collect(new a(interfaceC16562g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.SearchProductViewModel$updateFacetBuffer$3$1", f = "SearchProductViewModel.kt", l = {281}, m = "invokeSuspend")
    static final class F extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108854a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l.k f108856c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return I1.this.new F(this.f108856c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        F(l.k kVar, Continuation<? super F> continuation) {
            super(2, continuation);
            this.f108856c = kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((F) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108854a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = I1.this.searchReplayBuffer;
                l.k kVar = this.f108856c;
                this.f108854a = 1;
                if (interfaceC16548A.emit(kVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.SearchProductViewModel$updateFacetBuffer$4", f = "SearchProductViewModel.kt", l = {288, 295}, m = "invokeSuspend")
    static final class G extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108857a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l.k f108858b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l.k f108859c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ I1 f108860d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new G(this.f108858b, this.f108859c, this.f108860d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        G(l.k kVar, l.k kVar2, I1 i12, Continuation<? super G> continuation) {
            super(2, continuation);
            this.f108858b = kVar;
            this.f108859c = kVar2;
            this.f108860d = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((G) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
        
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
                int r1 = r4.f108857a
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
                goto L58
            L1b:
                kotlin.ResultKt.b(r5)
                Qo.l$k r5 = r4.f108858b
                if (r5 == 0) goto L47
                Qo.l$k r5 = r4.f108859c
                java.util.List r5 = r5.c1()
                java.util.Collection r5 = (java.util.Collection) r5
                boolean r5 = r5.isEmpty()
                if (r5 != 0) goto L47
                com.meijer.mobile.meijer.activity.find.viewmodel.I1 r5 = r4.f108860d
                pv.A r5 = com.meijer.mobile.meijer.activity.find.viewmodel.I1.R(r5)
                Qo.l$k r1 = r4.f108858b
                Qo.l$k r2 = r4.f108859c
                Qo.l$k r1 = Qo.K.b(r1, r2)
                r4.f108857a = r3
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L58
                goto L57
            L47:
                com.meijer.mobile.meijer.activity.find.viewmodel.I1 r5 = r4.f108860d
                pv.A r5 = com.meijer.mobile.meijer.activity.find.viewmodel.I1.R(r5)
                Qo.l$k r1 = r4.f108859c
                r4.f108857a = r2
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L58
            L57:
                return r0
            L58:
                kotlin.Unit r5 = kotlin.Unit.f143329a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.viewmodel.I1.G.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.I1$a, reason: case insensitive filesystem */
    /* synthetic */ class C12318a extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        C12318a(Object obj) {
            super(1, obj, I1.class, "onCartCount", "onCartCount(I)V", 0);
        }

        public final void a(int i10) {
            ((I1) this.receiver).J0(i10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.I1$b, reason: case insensitive filesystem */
    /* synthetic */ class C12319b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C12319b(Object obj) {
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
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.I1$c, reason: case insensitive filesystem */
    /* synthetic */ class C12320c extends FunctionReferenceImpl implements Function1<uk.c<ShoppingCart>, Unit> {
        C12320c(Object obj) {
            super(1, obj, I1.class, "onShoppingCartStreamSuccess", "onShoppingCartStreamSuccess(Lcom/meijer/mobile/core/util/content/Resource;)V", 0);
        }

        public final void a(uk.c<ShoppingCart> p02) {
            Intrinsics.j(p02, "p0");
            ((I1) this.receiver).R0(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(uk.c<ShoppingCart> cVar) {
            a(cVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.I1$d, reason: case insensitive filesystem */
    /* synthetic */ class C12321d extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C12321d(Object obj) {
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
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.I1$e, reason: case insensitive filesystem */
    /* synthetic */ class C12322e extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C12322e(Object obj) {
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
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.I1$f, reason: case insensitive filesystem */
    /* synthetic */ class C12323f extends AdaptedFunctionReference implements Function2<SearchSuggestions, Continuation<? super Unit>, Object>, SuspendFunction {
        C12323f(Object obj) {
            super(2, obj, I1.class, "onTypeAheadSuggestions", "onTypeAheadSuggestions(Lcom/meijer/mobile/product/model/fulldetails/models/search/SearchSuggestions;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SearchSuggestions searchSuggestions, Continuation<? super Unit> continuation) {
            return I1.M((I1) this.f143708a, searchSuggestions, continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "LGo/a;", "", "it", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.SearchProductViewModel$8", f = "SearchProductViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.I1$g, reason: case insensitive filesystem */
    static final class C12324g extends SuspendLambda implements Function3<InterfaceC16562g<? super SearchSuggestions>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108861a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f108862b;

        C12324g(Continuation<? super C12324g> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super SearchSuggestions> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            C12324g c12324g = new C12324g(continuation);
            c12324g.f108862b = th2;
            return c12324g.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f108861a == 0) {
                ResultKt.b(obj);
                qw.a.INSTANCE.e((Throwable) this.f108862b);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/I1$h;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public static final h f108863a = new h("LIMITED_RESULTS_FEATURE_DOES_NOT_APPLY", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final h f108864b = new h("NO_TOKEN_MATCHES_PLUS_SOME_EMBEDDINGS", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final h f108865c = new h("LIMITED_TOKEN_MATCHES_PLUS_SOME_EMBEDDINGS", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final h f108866d = new h("NO_TOKENS_MATCHES_PLUS_NO_EMBEDDINGS", 3);

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ h[] f108867e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f108868f;

        private static final /* synthetic */ h[] a() {
            return new h[]{f108863a, f108864b, f108865c, f108866d};
        }

        static {
            h[] hVarArrA = a();
            f108867e = hVarArrA;
            f108868f = EnumEntriesKt.a(hVarArrA);
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) f108867e.clone();
        }

        private h(String str, int i10) {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class i {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.f108863a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.f108864b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.f108865c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.f108866d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EnumC15218a.values().length];
            try {
                iArr2[EnumC15218a.f142567a.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC15218a.f142568b.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC15218a.f142569c.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.SearchProductViewModel$clipCoupon$2$1", f = "SearchProductViewModel.kt", l = {948}, m = "invokeSuspend")
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108869a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Coupon f108871c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TrackingData f108872d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return I1.this.new j(this.f108871c, this.f108872d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Coupon coupon, TrackingData trackingData, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f108871c = coupon;
            this.f108872d = trackingData;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108869a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = I1.this._event;
                AbstractC12412s.ClipCouponFailedEvent clipCouponFailedEvent = new AbstractC12412s.ClipCouponFailedEvent(Nr.g.f22702n, Nr.g.f22700m, com.meijer.mobile.meijer.Y.f100486Ih, Nr.g.f22664O, this.f108871c, this.f108872d);
                this.f108869a = 1;
                if (interfaceC16548A.emit(clipCouponFailedEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.SearchProductViewModel$fetchCarouselDepartments$1", f = "SearchProductViewModel.kt", l = {1025}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f108873a;

        /* renamed from: b, reason: collision with root package name */
        Object f108874b;

        /* renamed from: c, reason: collision with root package name */
        Object f108875c;

        /* renamed from: d, reason: collision with root package name */
        Object f108876d;

        /* renamed from: e, reason: collision with root package name */
        int f108877e;

        /* renamed from: f, reason: collision with root package name */
        int f108878f;

        /* renamed from: g, reason: collision with root package name */
        int f108879g;

        /* renamed from: h, reason: collision with root package name */
        int f108880h;

        /* renamed from: i, reason: collision with root package name */
        int f108881i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f108882j;

        k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            k kVar = I1.this.new k(continuation);
            kVar.f108882j = obj;
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108881i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f108882j;
                    I1.this.t0().setValue(new a.Loading(HomeViewModel.ShopByDepartmentsLoadingKeyV2, null, 2, null));
                    I1 i12 = I1.this;
                    Result.Companion companion = Result.INSTANCE;
                    C15052a c15052a = i12.homeRepository;
                    e.c.b bVar = e.c.b.f39992b;
                    this.f108882j = interfaceC15783O;
                    this.f108873a = interfaceC15783O;
                    this.f108874b = this;
                    this.f108875c = this;
                    this.f108876d = interfaceC15783O;
                    this.f108877e = 0;
                    this.f108878f = 0;
                    this.f108879g = 0;
                    this.f108880h = 0;
                    this.f108881i = 1;
                    obj = c15052a.b(bVar, this);
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
            I1 i13 = I1.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.e(com.meijer.mobile.core.networking.exceptions.a.a(thE));
                i13.t0().setValue(new a.Failed(HomeViewModel.ShopByDepartmentsLoadingKeyV2, null, 2, null));
            }
            I1 i14 = I1.this;
            if (Result.h(objB)) {
                DepartmentCard departmentCard = (DepartmentCard) objB;
                i14.s0().setValue(departmentCard.b());
                i14.t0().setValue(new a.NotLoading(HomeViewModel.ShopByDepartmentsLoadingKeyV2));
                i14.z0().setValue(AbstractC6392a.INSTANCE.c(departmentCard.getSeeAllTitle()));
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.SearchProductViewModel$fetchCarouselRecommendedForYouProducts$1", f = "SearchProductViewModel.kt", l = {739}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f108884a;

        /* renamed from: b, reason: collision with root package name */
        Object f108885b;

        /* renamed from: c, reason: collision with root package name */
        Object f108886c;

        /* renamed from: d, reason: collision with root package name */
        Object f108887d;

        /* renamed from: e, reason: collision with root package name */
        int f108888e;

        /* renamed from: f, reason: collision with root package name */
        int f108889f;

        /* renamed from: g, reason: collision with root package name */
        int f108890g;

        /* renamed from: h, reason: collision with root package name */
        int f108891h;

        /* renamed from: i, reason: collision with root package name */
        int f108892i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f108893j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ e.f f108895l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ EnumC15218a f108896m;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            l lVar = I1.this.new l(this.f108895l, this.f108896m, continuation);
            lVar.f108893j = obj;
            return lVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(e.f fVar, EnumC15218a enumC15218a, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f108895l = fVar;
            this.f108896m = enumC15218a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objH;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108892i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f108893j;
                    I1.this.loadingStatesManager.b(new a.Loading(this.f108895l.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), null, 2, null));
                    I1 i12 = I1.this;
                    e.f fVar = this.f108895l;
                    Result.Companion companion = Result.INSTANCE;
                    C15052a c15052a = i12.homeRepository;
                    this.f108893j = interfaceC15783O;
                    this.f108884a = interfaceC15783O;
                    this.f108885b = this;
                    this.f108886c = this;
                    this.f108887d = interfaceC15783O;
                    this.f108888e = 0;
                    this.f108889f = 0;
                    this.f108890g = 0;
                    this.f108891h = 0;
                    this.f108892i = 1;
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
            I1 i13 = I1.this;
            e.f fVar2 = this.f108895l;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                i13.setLoadingStateError(fVar2.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), thE);
            }
            I1 i14 = I1.this;
            e.f fVar3 = this.f108895l;
            EnumC15218a enumC15218a = this.f108896m;
            if (Result.h(objB)) {
                Vl.j jVar = (Vl.j) objB;
                InterfaceC5872l0<HomeDecorator> interfaceC5872l0V0 = i14.v0();
                HomeDecorator value = i14.v0().getValue();
                Map<e.f, CarouselDecorator> personalizedCarousels = i14.v0().getValue().getPersonalizedCarousels();
                String cardTitle = jVar.getCardTitle();
                String seeAllDeepLink = jVar.getSeeAllDeepLink();
                if (seeAllDeepLink == null) {
                    seeAllDeepLink = "";
                }
                interfaceC5872l0V0.setValue(HomeDecorator.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, MapsKt.u(personalizedCarousels, MapsKt.g(TuplesKt.a(fVar3, new CarouselDecorator(null, fVar3.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), null, null, cardTitle, seeAllDeepLink, enumC15218a, 13, null)))), 0, false, false, null, null, false, null, i14.userManager.b(), null, 0, false, null, null, null, null, false, 535818239, null));
                i14.multiChannelProductsStateRepository.c(fVar3, jVar.c());
                i14.H0().setValue(Boxing.a(i14.userManager.b() && !jVar.c().isEmpty()));
                i14.loadingStatesManager.b(new a.NotLoading(fVar3.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()));
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class m extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        m(Object obj) {
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
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.SearchProductViewModel$launchFilterAndSortActivity$1$1", f = "SearchProductViewModel.kt", l = {1045}, m = "invokeSuspend")
    static final class n extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108897a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l.k f108899c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return I1.this.new n(this.f108899c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(l.k kVar, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f108899c = kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((n) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108897a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = I1.this._event;
                AbstractC12412s.LaunchFilterAndSort launchFilterAndSort = new AbstractC12412s.LaunchFilterAndSort(this.f108899c);
                this.f108897a = 1;
                if (interfaceC16548A.emit(launchFilterAndSort, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.SearchProductViewModel$onAction$1", f = "SearchProductViewModel.kt", l = {914}, m = "invokeSuspend")
    static final class o extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108900a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Qk.a f108902c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return I1.this.new o(this.f108902c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(Qk.a aVar, Continuation<? super o> continuation) {
            super(2, continuation);
            this.f108902c = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((o) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108900a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = I1.this._event;
                AbstractC12412s.ViewCouponDetails viewCouponDetails = new AbstractC12412s.ViewCouponDetails(((a.ViewCouponDetails) this.f108902c).getCoupon(), ((a.ViewCouponDetails) this.f108902c).getTrackingData());
                this.f108900a = 1;
                if (interfaceC16548A.emit(viewCouponDetails, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.SearchProductViewModel$onEntryUpdated$1", f = "SearchProductViewModel.kt", l = {798}, m = "invokeSuspend")
    static final class p extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108903a;

        p(Continuation<? super p> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return I1.this.new p(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((p) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108903a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = I1.this._event;
                AbstractC12412s.LoginRequiredEvent loginRequiredEvent = new AbstractC12412s.LoginRequiredEvent(Cj.o.f5056d);
                this.f108903a = 1;
                if (interfaceC16548A.emit(loginRequiredEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.SearchProductViewModel$onGetClipCouponResponse$1", f = "SearchProductViewModel.kt", l = {972}, m = "invokeSuspend")
    static final class q extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108905a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Coupon f108907c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TrackingData f108908d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return I1.this.new q(this.f108907c, this.f108908d, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(Coupon coupon, TrackingData trackingData, Continuation<? super q> continuation) {
            super(2, continuation);
            this.f108907c = coupon;
            this.f108908d = trackingData;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((q) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108905a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = I1.this._event;
                AbstractC12412s.ClipCouponFailedEvent clipCouponFailedEvent = new AbstractC12412s.ClipCouponFailedEvent(Nr.g.f22702n, Nr.g.f22700m, com.meijer.mobile.meijer.Y.f100486Ih, Nr.g.f22664O, this.f108907c, this.f108908d);
                this.f108905a = 1;
                if (interfaceC16548A.emit(clipCouponFailedEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.SearchProductViewModel$onOldAction$12", f = "SearchProductViewModel.kt", l = {552}, m = "invokeSuspend")
    static final class r extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108909a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC12415t f108911c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(AbstractC12415t abstractC12415t, Continuation<? super r> continuation) {
            super(2, continuation);
            this.f108911c = abstractC12415t;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return I1.this.new r(this.f108911c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((r) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108909a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                I1 i12 = I1.this;
                l.k query = ((AbstractC12415t.UpdateFacetBuffer) this.f108911c).getQuery();
                boolean resetDeeplinkFacet = ((AbstractC12415t.UpdateFacetBuffer) this.f108911c).getResetDeeplinkFacet();
                this.f108909a = 1;
                if (i12.a1(query, resetDeeplinkFacet, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.SearchProductViewModel$onOldAction$13", f = "SearchProductViewModel.kt", l = {560}, m = "invokeSuspend")
    static final class s extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108912a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC12415t f108914c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC12415t f108915a;

            a(AbstractC12415t abstractC12415t) {
                this.f108915a = abstractC12415t;
            }

            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(l.k kVar, Continuation<? super Unit> continuation) {
                ((AbstractC12415t.FilterAndSortCollectorForSharedFlow) this.f108915a).a().invoke(kVar);
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(AbstractC12415t abstractC12415t, Continuation<? super s> continuation) {
            super(2, continuation);
            this.f108914c = abstractC12415t;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return I1.this.new s(this.f108914c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((s) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108912a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = I1.this.searchReplayBuffer;
                a aVar = new a(this.f108914c);
                this.f108912a = 1;
                if (interfaceC16548A.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.SearchProductViewModel$onOldAction$1", f = "SearchProductViewModel.kt", l = {HttpResponseStatus.ERROR_SERVICE_UNAVAILABLE}, m = "invokeSuspend")
    static final class t extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108916a;

        t(Continuation<? super t> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return I1.this.new t(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((t) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108916a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = I1.this._event;
                AbstractC12412s.e eVar = AbstractC12412s.e.f109838a;
                this.f108916a = 1;
                if (interfaceC16548A.emit(eVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.SearchProductViewModel$onOldAction$2", f = "SearchProductViewModel.kt", l = {HttpResponseStatus.ERROR_GATEWAY_TIMEOUT}, m = "invokeSuspend")
    static final class u extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108918a;

        u(Continuation<? super u> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return I1.this.new u(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((u) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108918a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = I1.this._event;
                AbstractC12412s.ToggleKeyboardEvent toggleKeyboardEvent = new AbstractC12412s.ToggleKeyboardEvent(false);
                this.f108918a = 1;
                if (interfaceC16548A.emit(toggleKeyboardEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.SearchProductViewModel$onOldAction$3", f = "SearchProductViewModel.kt", l = {508}, m = "invokeSuspend")
    static final class v extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108920a;

        v(Continuation<? super v> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return I1.this.new v(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((v) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108920a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = I1.this._event;
                AbstractC12412s.ToggleKeyboardEvent toggleKeyboardEvent = new AbstractC12412s.ToggleKeyboardEvent(false);
                this.f108920a = 1;
                if (interfaceC16548A.emit(toggleKeyboardEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.SearchProductViewModel$onOldAction$4", f = "SearchProductViewModel.kt", l = {509}, m = "invokeSuspend")
    static final class w extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108922a;

        w(Continuation<? super w> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return I1.this.new w(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((w) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108922a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = I1.this._event;
                AbstractC12412s.b bVar = AbstractC12412s.b.f109835a;
                this.f108922a = 1;
                if (interfaceC16548A.emit(bVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.SearchProductViewModel$onOldAction$5", f = "SearchProductViewModel.kt", l = {513}, m = "invokeSuspend")
    static final class x extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108924a;

        x(Continuation<? super x> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return I1.this.new x(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((x) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108924a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = I1.this._event;
                AbstractC12412s.f fVar = AbstractC12412s.f.f109839a;
                this.f108924a = 1;
                if (interfaceC16548A.emit(fVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.viewmodel.SearchProductViewModel$onOldAction$6", f = "SearchProductViewModel.kt", l = {517}, m = "invokeSuspend")
    static final class y extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f108926a;

        y(Continuation<? super y> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return I1.this.new y(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((y) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f108926a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = I1.this._event;
                AbstractC12412s.ToggleKeyboardEvent toggleKeyboardEvent = new AbstractC12412s.ToggleKeyboardEvent(false);
                this.f108926a = 1;
                if (interfaceC16548A.emit(toggleKeyboardEvent, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class z extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        z(Object obj) {
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

    public I1(Ro.c productsRepository, tl.h timeSlotRepository, yo.k userManager, Ro.a productAnalytics, il.m cartRepository, C15052a homeRepository, InterfaceC14523a analyticsEngine, zl.k featureManager, C13702d couponsRepository, C17115a multiChannelProductsStateRepository, wr.f cartInteractor) {
        Intrinsics.j(productsRepository, "productsRepository");
        Intrinsics.j(timeSlotRepository, "timeSlotRepository");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(productAnalytics, "productAnalytics");
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(homeRepository, "homeRepository");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(couponsRepository, "couponsRepository");
        Intrinsics.j(multiChannelProductsStateRepository, "multiChannelProductsStateRepository");
        Intrinsics.j(cartInteractor, "cartInteractor");
        this.productsRepository = productsRepository;
        this.timeSlotRepository = timeSlotRepository;
        this.userManager = userManager;
        this.productAnalytics = productAnalytics;
        this.cartRepository = cartRepository;
        this.homeRepository = homeRepository;
        this.analyticsEngine = analyticsEngine;
        this.featureManager = featureManager;
        this.couponsRepository = couponsRepository;
        this.multiChannelProductsStateRepository = multiChannelProductsStateRepository;
        this.cartInteractor = cartInteractor;
        Ju.a aVar = new Ju.a();
        this.disposables = aVar;
        this.loadingStatesManager = new Pj.c();
        this.cartEntries = CollectionsKt.m();
        this.searchReplayBuffer = C16555H.b(1, 0, null, 6, null);
        this._viewState = pv.S.a(new OldSearchViewState(new RecentSearches(userManager.v(), 0, 2, null), new SearchSuggestions(CollectionsKt.m()), null, false, false, new CartPreviewDecorator(userManager.b(), 0, 2, null), null, false, null, 476, null));
        Boolean bool = Boolean.FALSE;
        this.isResultsExplanationLayoutVisible = androidx.compose.runtime.t1.e(bool, null, 2, null);
        this.isResultsExplanationBodyVisible = androidx.compose.runtime.t1.e(bool, null, 2, null);
        this.resultsExplanationTitleText = androidx.compose.runtime.t1.e("", null, 2, null);
        this.resultsExplanationBodyText = androidx.compose.runtime.t1.e("", null, 2, null);
        Boolean bool2 = Boolean.TRUE;
        this.isSortAndFilterLayoutVisible = androidx.compose.runtime.t1.e(bool2, null, 2, null);
        this.isZeroResultsSectionVisible = androidx.compose.runtime.t1.e(bool, null, 2, null);
        this.isZeroResultsTopCarouselVisible = androidx.compose.runtime.t1.e(bool, null, 2, null);
        this.searchResultsHeaderText = androidx.compose.runtime.t1.e("", null, 2, null);
        this.filterAndSortButtonText = androidx.compose.runtime.t1.e("", null, 2, null);
        this.isFilterAndSortButtonVisible = androidx.compose.runtime.t1.e(bool2, null, 2, null);
        this.departmentsList = androidx.compose.runtime.t1.e(CollectionsKt.m(), null, 2, null);
        this.departmentsLoadingState = androidx.compose.runtime.t1.e(new a.NotLoading(HomeViewModel.ShopByDepartmentsLoadingKeyV2), null, 2, null);
        this.shopByDepartmentCarouselViewAllTitle = androidx.compose.runtime.t1.e(AbstractC6392a.INSTANCE.d(Cj.o.f5042S0, new Object[0]), null, 2, null);
        this.homeDecorator = androidx.compose.runtime.t1.e(new HomeDecorator(null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536870911, null), null, 2, null);
        this.couponsStateMap = androidx.compose.runtime.t1.e(new LinkedHashMap(), null, 2, null);
        this.resetStepper = androidx.compose.runtime.t1.e(bool, null, 2, null);
        this.stepperIdInInteraction = androidx.compose.runtime.t1.e(null, null, 2, null);
        this.isStepperInTransition = androidx.compose.runtime.t1.e(bool, null, 2, null);
        this._event = C16555H.b(0, 0, null, 7, null);
        if (userManager.b()) {
            io.reactivex.l<Integer> lVarSubscribeOn = cartRepository.Q().distinctUntilChanged().subscribeOn(C13889a.b());
            final C12318a c12318a = new C12318a(this);
            Lu.g<? super Integer> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.r1
                @Override // Lu.g
                public final void accept(Object obj) {
                    I1.H(c12318a, obj);
                }
            };
            a.Companion companion = qw.a.INSTANCE;
            final C12319b c12319b = new C12319b(companion);
            Dk.a.a(lVarSubscribeOn.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.s1
                @Override // Lu.g
                public final void accept(Object obj) {
                    I1.I(c12319b, obj);
                }
            }), aVar);
            io.reactivex.l<uk.c<ShoppingCart>> lVarSubscribeOn2 = cartRepository.b().distinctUntilChanged().subscribeOn(C13889a.b());
            final C12320c c12320c = new C12320c(this);
            Lu.g<? super uk.c<ShoppingCart>> gVar2 = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.t1
                @Override // Lu.g
                public final void accept(Object obj) {
                    I1.J(c12320c, obj);
                }
            };
            final C12321d c12321d = new C12321d(companion);
            Dk.a.a(lVarSubscribeOn2.subscribe(gVar2, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.u1
                @Override // Lu.g
                public final void accept(Object obj) {
                    I1.K(c12321d, obj);
                }
            }), aVar);
            multiChannelProductsStateRepository.b(new C17115a.InterfaceC2527a() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.v1
                @Override // sp.C17115a.InterfaceC2527a
                public final void a(Object obj, sp.Y y10) {
                    I1.L(this.f109895a, obj, y10);
                }
            });
        }
        C16563h.J(C16563h.g(C16563h.O(new E(productsRepository.t()), new C12323f(this)), new C12324g(null)), androidx.view.d0.a(this));
    }

    private final void I0() {
        l.k kVar = (l.k) CollectionsKt.u0(this.searchReplayBuffer.d());
        if (kVar != null) {
            C15809k.d(androidx.view.d0.a(this), null, null, new n(kVar, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J0(int itemCount) {
        OldSearchViewState value;
        OldSearchViewState oldSearchViewState;
        InterfaceC16549B<OldSearchViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            oldSearchViewState = value;
        } while (!interfaceC16549B.e(value, OldSearchViewState.b(oldSearchViewState, null, null, null, false, false, CartPreviewDecorator.b(oldSearchViewState.getCartDecorator(), false, itemCount, 1, null), null, false, null, 479, null)));
    }

    private final void K0(final AbstractC12415t.DepartmentItemClicked oldSearchViewModelAction) {
        this.analyticsEngine.b(C14756c.h("shopDepartmentTierLevel"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.o1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I1.L0(oldSearchViewModelAction, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(final I1 i12, final Object key, sp.Y repo) {
        Intrinsics.j(key, "key");
        Intrinsics.j(repo, "repo");
        io.reactivex.l<List<ProductState<ProductFullDetails>>> lVarSubscribeOn = repo.Y0().subscribeOn(C13889a.b());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.w1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I1.t(this.f109902a, key, (List) obj);
            }
        };
        Lu.g<? super List<ProductState<ProductFullDetails>>> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.x1
            @Override // Lu.g
            public final void accept(Object obj) {
                I1.n(function1, obj);
            }
        };
        final C12322e c12322e = new C12322e(qw.a.INSTANCE);
        Dk.a.a(lVarSubscribeOn.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.y1
            @Override // Lu.g
            public final void accept(Object obj) {
                I1.B(c12322e, obj);
            }
        }), i12.disposables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L0(AbstractC12415t.DepartmentItemClicked departmentItemClicked, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.s("tierName", departmentItemClicked.getName());
        track.p("shop department carousel: tier 1 category");
        return Unit.f143329a;
    }

    private final void M0(AbstractC12415t.UpdateEntryAction oldSearchViewModelAction) {
        if (!this.userManager.b()) {
            onStepperInteractionChange(oldSearchViewModelAction.getProduct().getCode(), true, true);
            C15809k.d(androidx.view.d0.a(this), null, null, new p(null), 3, null);
        } else {
            onStepperInteractionChange(oldSearchViewModelAction.getProduct().getCode(), false, true);
            if (fj.l.a(this.cartEntries, oldSearchViewModelAction.getProduct().getCode()) == null) {
                this.skipProductCarouselUpdates = true;
            }
            wr.f.M(this.cartInteractor, oldSearchViewModelAction.getProduct(), oldSearchViewModelAction.getQuantityToUpdate(), false, null, 12, null);
        }
    }

    private final void Q0(String searchTerm) {
        String str;
        OldSearchViewState oldSearchViewStateB;
        InterfaceC16549B<OldSearchViewState> interfaceC16549B = this._viewState;
        while (true) {
            OldSearchViewState value = interfaceC16549B.getValue();
            OldSearchViewState oldSearchViewState = value;
            if (StringsKt.s0(searchTerm)) {
                str = searchTerm;
                oldSearchViewStateB = OldSearchViewState.b(oldSearchViewState, null, new SearchSuggestions(null, 1, null), str, false, false, null, null, false, null, 497, null);
            } else {
                str = searchTerm;
                oldSearchViewStateB = OldSearchViewState.b(oldSearchViewState, null, null, str, Intrinsics.e(searchTerm, oldSearchViewState.getSearchTerm()), false, null, null, false, null, 499, null);
            }
            if (interfaceC16549B.e(value, oldSearchViewStateB)) {
                this.productsRepository.v(str);
                return;
            }
            searchTerm = str;
        }
    }

    private final void S0(SearchSuggestions suggestions) {
        OldSearchViewState value;
        OldSearchViewState oldSearchViewState;
        SearchSuggestions searchSuggestions;
        InterfaceC16549B<OldSearchViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
            oldSearchViewState = value;
            searchSuggestions = !StringsKt.s0(oldSearchViewState.getSearchTerm()) ? suggestions : null;
            if (searchSuggestions == null) {
                searchSuggestions = new SearchSuggestions(null, 1, null);
            }
        } while (!interfaceC16549B.e(value, OldSearchViewState.b(oldSearchViewState, null, searchSuggestions, null, false, false, null, null, false, null, 509, null)));
    }

    /* JADX WARN: Type inference failed for: r11v11, types: [T, ii.h$b] */
    /* JADX WARN: Type inference failed for: r11v7, types: [T, ii.h$b] */
    /* JADX WARN: Type inference failed for: r11v9, types: [T, ii.h$b] */
    /* JADX WARN: Type inference failed for: r1v15, types: [T, ii.h$b] */
    /* JADX WARN: Type inference failed for: r1v17, types: [T, ii.h$b] */
    private final void T0(String uriString, String carouselTitle, boolean isFromSeeMoreItems) {
        Uri uri;
        if (uriString == null || (uri = Uri.parse(uriString)) == null) {
            uri = Uri.EMPTY;
        }
        Uri uri2 = uri;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Set<String> queryParameterNames = uri2 != null ? uri2.getQueryParameterNames() : null;
        if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
            String query = uri2.getQuery();
            if (query == null) {
                query = "";
            }
            Set<String> queryParameterNames2 = uri2.getQueryParameterNames();
            if (queryParameterNames2 != null && queryParameterNames2.contains("list")) {
                if (StringsKt.d0(query, "buyAgain", false, 2, null)) {
                    objectRef.f143742a = C14756c.h("Buy Again: View All");
                } else if (StringsKt.d0(query, "favoritesOnSale", false, 2, null)) {
                    objectRef.f143742a = C14756c.h("Favorites on Sale: View All");
                }
            }
            Set<String> queryParameterNames3 = uri2.getQueryParameterNames();
            if (queryParameterNames3 != null && queryParameterNames3.contains("department")) {
                if (StringsKt.d0(query, "L2-10778", false, 2, null)) {
                    objectRef.f143742a = C14756c.h("Produce-L2-10778: View All");
                } else if (StringsKt.d0(query, "L2-9974", false, 2, null)) {
                    objectRef.f143742a = C14756c.h("Dairy-L2-9974: View All");
                } else if (StringsKt.d0(query, "L2-9980", false, 2, null)) {
                    objectRef.f143742a = C14756c.h("Snacks-L2-9980: View All");
                }
            }
        }
        C15809k.d(androidx.view.d0.a(this), null, null, new B(uri2, objectRef, carouselTitle, isFromSeeMoreItems, null), 3, null);
    }

    private final void a0() {
        OldSearchViewState value;
        this.userManager.M(CollectionsKt.m(), true);
        InterfaceC16549B<OldSearchViewState> interfaceC16549B = this._viewState;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, OldSearchViewState.b(value, new RecentSearches(null, 0, 3, null), null, null, false, false, null, null, false, null, 510, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a1(l.k kVar, boolean z10, Continuation<? super Unit> continuation) {
        OldSearchViewState value;
        if (z10) {
            InterfaceC16549B<OldSearchViewState> interfaceC16549B = this._viewState;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, OldSearchViewState.b(value, null, null, null, false, false, null, null, false, null, l3.f93323c, null)));
            C15809k.d(androidx.view.d0.a(this), null, null, new F(kVar, null), 3, null);
        } else {
            C15809k.d(androidx.view.d0.a(this), null, null, new G(A0().getValue().getDeeplinkFacets(), kVar, this, null), 3, null);
        }
        return Unit.f143329a;
    }

    private final void b0(final Coupon coupon, final TrackingData trackingData) {
        io.reactivex.u<ClipUnclipCouponResponse> uVarK = this.couponsRepository.h(coupon).k(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.G1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I1.c0(this.f108773a, coupon, trackingData, (ClipUnclipCouponResponse) obj);
            }
        };
        Lu.g<? super ClipUnclipCouponResponse> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.H1
            @Override // Lu.g
            public final void accept(Object obj) {
                I1.d0(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.p1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I1.e0(this.f109815a, coupon, trackingData, (Throwable) obj);
            }
        };
        Dk.a.a(uVarK.o(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.q1
            @Override // Lu.g
            public final void accept(Object obj) {
                I1.f0(function12, obj);
            }
        }), this.disposables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e0(I1 i12, Coupon coupon, TrackingData trackingData, Throwable th2) {
        qw.a.INSTANCE.e(th2);
        C15809k.d(androidx.view.d0.a(i12), null, null, i12.new j(coupon, trackingData, null), 3, null);
        return Unit.f143329a;
    }

    private final String getCarouselType(EnumC15218a carouselType) {
        int i10 = i.$EnumSwitchMapping$1[carouselType.ordinal()];
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

    private final TrackingData getClipCouponTrackingData(final Coupon coupon, final EnumC15218a carouselType) {
        Object next;
        Coupon coupon2;
        Iterator<T> it = this.couponsStateMap.getValue().values().iterator();
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
        return C14760g.a(C14756c.a("coupon clip"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.C1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I1.r0(coupon, this, carouselType, couponState2, (TrackingData) obj);
            }
        });
    }

    private final void m0(e.f homeComponent) {
        EnumC15218a enumC15218a = (!(homeComponent instanceof e.f.a) && (homeComponent instanceof e.f.c)) ? EnumC15218a.f142568b : EnumC15218a.f142567a;
        C15809k.d(androidx.view.d0.a(this), null, null, new l(homeComponent, enumC15218a, null), 3, null);
    }

    private final void n0(Pk.c couponIdentity, final TrackingData trackingData) {
        io.reactivex.l<Coupon> lVarObserveOn = this.couponsRepository.k(couponIdentity).take(1L).observeOn(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.D1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I1.o0(this.f108742a, trackingData, (Coupon) obj);
            }
        };
        Lu.g<? super Coupon> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.E1
            @Override // Lu.g
            public final void accept(Object obj) {
                I1.p0(function1, obj);
            }
        };
        final m mVar = new m(qw.a.INSTANCE);
        Dk.a.a(lVarObserveOn.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.F1
            @Override // Lu.g
            public final void accept(Object obj) {
                I1.q0(mVar, obj);
            }
        }), this.disposables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onProductCouponButtonClicked(final Pk.c couponIdentity, final EnumC15218a carouselType) {
        io.reactivex.l<Coupon> lVarObserveOn = this.couponsRepository.k(couponIdentity).take(1L).subscribeOn(C13889a.b()).observeOn(Iu.a.a());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.z1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I1.P0(this.f109922a, couponIdentity, carouselType, (Coupon) obj);
            }
        };
        Lu.g<? super Coupon> gVar = new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.A1
            @Override // Lu.g
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final z zVar = new z(qw.a.INSTANCE);
        Dk.a.a(lVarObserveOn.subscribe(gVar, new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.viewmodel.B1
            @Override // Lu.g
            public final void accept(Object obj) {
                zVar.invoke(obj);
            }
        }), this.disposables);
    }

    private final void onProductsState(Object key, List<ProductState<ProductFullDetails>> productStates) {
        if (!this.skipProductCarouselUpdates) {
            if (Intrinsics.e(key, e.f.a.f40004d)) {
                HomeDecorator value = this.homeDecorator.getValue();
                List listM1 = CollectionsKt.m1(this.homeDecorator.getValue().getPersonalizedProducts());
                List<ProductState<ProductFullDetails>> list = productStates;
                ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(toProductListDecorator((ProductState) it.next()));
                }
                C17728h.c((List) listM1.set(0, arrayList), this.featureManager.e(AbstractC18503f.k0.f172887h), this.featureManager.e(AbstractC18503f.l0.f172889h));
                Unit unit = Unit.f143329a;
                HomeDecorator.copy$default(value, null, null, null, null, null, null, null, null, null, null, listM1, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536869887, null);
            } else if (Intrinsics.e(key, e.f.c.f40008d)) {
                HomeDecorator value2 = this.homeDecorator.getValue();
                List listM12 = CollectionsKt.m1(this.homeDecorator.getValue().getPersonalizedProducts());
                List<ProductState<ProductFullDetails>> list2 = productStates;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(toProductListDecorator((ProductState) it2.next()));
                }
                C17728h.c((List) listM12.set(1, arrayList2), this.featureManager.e(AbstractC18503f.k0.f172887h), this.featureManager.e(AbstractC18503f.l0.f172889h));
                Unit unit2 = Unit.f143329a;
                HomeDecorator.copy$default(value2, null, null, null, null, null, null, null, null, null, null, listM12, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536869887, null);
            } else if (Intrinsics.e(key, e.f.b.a.f40005d)) {
                HomeDecorator value3 = this.homeDecorator.getValue();
                List listM13 = CollectionsKt.m1(this.homeDecorator.getValue().getCuratedProducts());
                List<ProductState<ProductFullDetails>> list3 = productStates;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.x(list3, 10));
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(toProductListDecorator((ProductState) it3.next()));
                }
                listM13.set(0, arrayList3);
                Unit unit3 = Unit.f143329a;
                HomeDecorator.copy$default(value3, null, null, null, null, null, null, null, null, null, listM13, null, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536870399, null);
            } else if (Intrinsics.e(key, e.f.b.C0858b.f40006d)) {
                HomeDecorator value4 = this.homeDecorator.getValue();
                List listM14 = CollectionsKt.m1(this.homeDecorator.getValue().getCuratedProducts());
                List<ProductState<ProductFullDetails>> list4 = productStates;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.x(list4, 10));
                Iterator<T> it4 = list4.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(toProductListDecorator((ProductState) it4.next()));
                }
                listM14.set(1, arrayList4);
                Unit unit4 = Unit.f143329a;
                HomeDecorator.copy$default(value4, null, null, null, null, null, null, null, null, null, listM14, null, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536870399, null);
            } else if (Intrinsics.e(key, e.f.b.c.f40007d)) {
                HomeDecorator value5 = this.homeDecorator.getValue();
                List listM15 = CollectionsKt.m1(this.homeDecorator.getValue().getCuratedProducts());
                List<ProductState<ProductFullDetails>> list5 = productStates;
                ArrayList arrayList5 = new ArrayList(CollectionsKt.x(list5, 10));
                Iterator<T> it5 = list5.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(toProductListDecorator((ProductState) it5.next()));
                }
                listM15.set(2, arrayList5);
                Unit unit5 = Unit.f143329a;
                HomeDecorator.copy$default(value5, null, null, null, null, null, null, null, null, null, listM15, null, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536870399, null);
            } else {
                Unit unit6 = Unit.f143329a;
            }
        }
        this.skipProductCarouselUpdates = false;
        InterfaceC5872l0<Map<String, CouponState>> interfaceC5872l0 = this.couponsStateMap;
        Map<String, CouponState> value6 = interfaceC5872l0.getValue();
        List<ProductState<ProductFullDetails>> list6 = productStates;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(list6, 10)), 16));
        Iterator<T> it6 = list6.iterator();
        while (it6.hasNext()) {
            ProductState productState = (ProductState) it6.next();
            Pair pairA = TuplesKt.a(((ProductFullDetails) productState.g()).getCode(), CollectionsKt.u0(productState.d()));
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        interfaceC5872l0.setValue(MapsKt.u(value6, linkedHashMap));
    }

    private final void onStepperInteractionChange(String activeStepperId, boolean resetStepper, boolean inTransition) {
        InterfaceC5872l0<HomeDecorator> interfaceC5872l0 = this.homeDecorator;
        HomeDecorator value = interfaceC5872l0.getValue();
        List<List<ProductListDecorator>> personalizedProducts = this.homeDecorator.getValue().getPersonalizedProducts();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(personalizedProducts, 10));
        Iterator<T> it = personalizedProducts.iterator();
        while (it.hasNext()) {
            arrayList.add(updateStepperState((List) it.next(), activeStepperId, resetStepper, inTransition));
        }
        List<List<ProductListDecorator>> curatedProducts = this.homeDecorator.getValue().getCuratedProducts();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(curatedProducts, 10));
        Iterator<T> it2 = curatedProducts.iterator();
        while (it2.hasNext()) {
            arrayList2.add(updateStepperState((List) it2.next(), activeStepperId, resetStepper, inTransition));
        }
        interfaceC5872l0.setValue(HomeDecorator.copy$default(value, null, null, null, null, null, null, null, null, null, arrayList2, arrayList, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536869375, null));
        this.isStepperInTransition.setValue(Boolean.valueOf(inTransition));
        this.stepperIdInInteraction.setValue(activeStepperId);
        this.resetStepper.setValue(Boolean.valueOf(resetStepper));
    }

    private final void pushUserAuthenticationState() {
        InterfaceC5872l0<HomeDecorator> interfaceC5872l0 = this.homeDecorator;
        interfaceC5872l0.setValue(HomeDecorator.copy$default(interfaceC5872l0.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, false, null, null, false, null, false, null, 0, this.userManager.b(), new C(this), null, null, null, false, 511705087, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r0(Coupon coupon, I1 i12, EnumC15218a enumC15218a, CouponState couponState, TrackingData TrackingData) {
        CouponState.b progress;
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n("home");
        TrackingData.v("home");
        Rk.b bVar = Rk.b.f33418a;
        TrackingData.c(bVar.f(CollectionsKt.e(coupon)));
        TrackingData.c(bVar.h(i12.getCarouselType(enumC15218a)));
        boolean z10 = false;
        if (couponState != null && (progress = couponState.getProgress()) != null && progress.d()) {
            z10 = true;
        }
        TrackingData.c(bVar.c(z10));
        return Unit.f143329a;
    }

    private final ProductListDecorator toProductListDecorator(ProductState<ProductFullDetails> productState) {
        CouponState couponState = (CouponState) CollectionsKt.u0(productState.d());
        ProductListDecorator.Companion companion = ProductListDecorator.INSTANCE;
        ProductFullDetails productFullDetails = (ProductFullDetails) productState.g();
        CartEntry cartEntry = productState.getCartEntry();
        boolean z10 = false;
        boolean zBooleanValue = Intrinsics.e(productState.getCode(), this.stepperIdInInteraction.getValue()) ? this.isStepperInTransition.getValue().booleanValue() : false;
        ProductEligibility.a aVarI = productState.getEligibility().i();
        ProductEligibility.a aVarK = productState.getEligibility().k();
        if (Intrinsics.e(productState.getCode(), this.stepperIdInInteraction.getValue()) && this.resetStepper.getValue().booleanValue()) {
            z10 = true;
        }
        return ProductListDecorator.Companion.b(companion, productFullDetails, null, null, cartEntry, zBooleanValue, aVarI, aVarK, z10, null, couponState != null ? Qr.a.d(couponState) : null, couponState != null ? couponState.getCoupon() : null, false, null, null, false, 0, 63750, null);
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

    public final pv.P<OldSearchViewState> A0() {
        return C16563h.c(this._viewState);
    }

    public final InterfaceC5872l0<Boolean> B0() {
        return this.isFilterAndSortButtonVisible;
    }

    public final InterfaceC5872l0<Boolean> C0() {
        return this.isResultsExplanationBodyVisible;
    }

    public final InterfaceC5872l0<Boolean> E0() {
        return this.isResultsExplanationLayoutVisible;
    }

    public final InterfaceC5872l0<Boolean> F0() {
        return this.isSortAndFilterLayoutVisible;
    }

    public final InterfaceC5872l0<Boolean> G0() {
        return this.isZeroResultsSectionVisible;
    }

    public final InterfaceC5872l0<Boolean> H0() {
        return this.isZeroResultsTopCarouselVisible;
    }

    public final void O0(AbstractC12415t oldSearchViewModelAction) {
        OldSearchViewState value;
        OldSearchViewState value2;
        OldSearchViewState value3;
        AbstractC12415t oldSearchViewModelAction2 = oldSearchViewModelAction;
        Intrinsics.j(oldSearchViewModelAction2, "oldSearchViewModelAction");
        if (Intrinsics.e(oldSearchViewModelAction2, AbstractC12415t.c.f109852a)) {
            Q0("");
            return;
        }
        if (oldSearchViewModelAction2 instanceof AbstractC12415t.SearchStartedAction) {
            Q0(((AbstractC12415t.SearchStartedAction) oldSearchViewModelAction2).getSearchTerm());
            return;
        }
        if (Intrinsics.e(oldSearchViewModelAction2, AbstractC12415t.m.f109868a)) {
            C15809k.d(androidx.view.d0.a(this), null, null, new t(null), 3, null);
            C15809k.d(androidx.view.d0.a(this), null, null, new u(null), 3, null);
            return;
        }
        if (Intrinsics.e(oldSearchViewModelAction2, AbstractC12415t.g.f109860a)) {
            C15809k.d(androidx.view.d0.a(this), null, null, new v(null), 3, null);
            C15809k.d(androidx.view.d0.a(this), null, null, new w(null), 3, null);
            return;
        }
        if (Intrinsics.e(oldSearchViewModelAction2, AbstractC12415t.o.f109870a)) {
            C15809k.d(androidx.view.d0.a(this), null, null, new x(null), 3, null);
            return;
        }
        if (oldSearchViewModelAction2 instanceof AbstractC12415t.CompleteSearchAction) {
            C15809k.d(androidx.view.d0.a(this), null, null, new y(null), 3, null);
            AbstractC12415t.CompleteSearchAction completeSearchAction = (AbstractC12415t.CompleteSearchAction) oldSearchViewModelAction2;
            if (!completeSearchAction.getIsSuggestion()) {
                oldSearchViewModelAction2 = null;
            }
            AbstractC12415t.CompleteSearchAction completeSearchAction2 = (AbstractC12415t.CompleteSearchAction) oldSearchViewModelAction2;
            if (completeSearchAction2 != null) {
                this.productAnalytics.b(completeSearchAction2.getSearchTerm(), completeSearchAction2.getOriginalTerm());
            }
            InterfaceC16549B<OldSearchViewState> interfaceC16549B = this._viewState;
            do {
                value3 = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value3, OldSearchViewState.b(value3, null, null, completeSearchAction.getSearchTerm(), true, completeSearchAction.getIsScannedUpc(), null, null, false, null, 483, null)));
            return;
        }
        if (oldSearchViewModelAction2 instanceof AbstractC12415t.AutoFillSearchAction) {
            AbstractC12415t.AutoFillSearchAction autoFillSearchAction = (AbstractC12415t.AutoFillSearchAction) oldSearchViewModelAction2;
            this.productAnalytics.b(autoFillSearchAction.getSearchTerm(), autoFillSearchAction.getOriginalQuery());
            InterfaceC16549B<OldSearchViewState> interfaceC16549B2 = this._viewState;
            do {
                value2 = interfaceC16549B2.getValue();
            } while (!interfaceC16549B2.e(value2, OldSearchViewState.b(value2, null, null, autoFillSearchAction.getSearchTerm() + ' ', false, false, null, null, false, null, 499, null)));
            return;
        }
        if (Intrinsics.e(oldSearchViewModelAction2, AbstractC12415t.b.f109851a)) {
            a0();
            return;
        }
        if (Intrinsics.e(oldSearchViewModelAction2, AbstractC12415t.r.f109875a)) {
            InterfaceC16549B<OldSearchViewState> interfaceC16549B3 = this._viewState;
            do {
                value = interfaceC16549B3.getValue();
            } while (!interfaceC16549B3.e(value, OldSearchViewState.b(value, new RecentSearches(this.userManager.v(), 0, 2, null), null, null, false, false, null, null, false, null, 510, null)));
            return;
        }
        if (Intrinsics.e(oldSearchViewModelAction2, AbstractC12415t.j.f109863a)) {
            I0();
            return;
        }
        if (oldSearchViewModelAction2 instanceof AbstractC12415t.UpdateFacetBuffer) {
            C15809k.d(androidx.view.d0.a(this), null, null, new r(oldSearchViewModelAction2, null), 3, null);
            return;
        }
        if (oldSearchViewModelAction2 instanceof AbstractC12415t.FilterAndSortCollectorForSharedFlow) {
            if (this.searchReplayBuffer.c().getValue().intValue() < 1) {
                C15809k.d(androidx.view.d0.a(this), null, null, new s(oldSearchViewModelAction2, null), 3, null);
                return;
            } else {
                qw.a.INSTANCE.d("SearchProductViewModel attempted to register multiple collectors on the Filter and Sort replay buffer. This means the last collector was dropped!! Please only use one collector for the direct view child.", new Object[0]);
                return;
            }
        }
        if (oldSearchViewModelAction2 instanceof AbstractC12415t.h) {
            l0();
            return;
        }
        if (oldSearchViewModelAction2 instanceof AbstractC12415t.f) {
            this.analyticsEngine.h(C14756c.a("Event: shop department carousel: view all"), new AbstractC14762i[0]);
            return;
        }
        if (oldSearchViewModelAction2 instanceof AbstractC12415t.i) {
            m0(e.f.a.f40004d);
            return;
        }
        if (oldSearchViewModelAction2 instanceof AbstractC12415t.DepartmentItemClicked) {
            K0((AbstractC12415t.DepartmentItemClicked) oldSearchViewModelAction2);
            return;
        }
        if (oldSearchViewModelAction2 instanceof AbstractC12415t.UpdateEntryAction) {
            M0((AbstractC12415t.UpdateEntryAction) oldSearchViewModelAction2);
        } else {
            if (!(oldSearchViewModelAction2 instanceof AbstractC12415t.PersonalizedProductListClicked)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC12415t.PersonalizedProductListClicked personalizedProductListClicked = (AbstractC12415t.PersonalizedProductListClicked) oldSearchViewModelAction2;
            T0(personalizedProductListClicked.getUriString(), personalizedProductListClicked.getCarouselTitle(), personalizedProductListClicked.getIsFromSeeMoreItems());
        }
    }

    public final void R0(uk.c<ShoppingCart> shoppingCartResource) {
        Intrinsics.j(shoppingCartResource, "shoppingCartResource");
        C15809k.d(androidx.view.d0.a(this), null, null, new A(shoppingCartResource, this, null), 3, null);
    }

    public final void U0(l.k query) {
        InterfaceC16549B<OldSearchViewState> interfaceC16549B = this._viewState;
        while (true) {
            OldSearchViewState value = interfaceC16549B.getValue();
            l.k kVar = query;
            if (interfaceC16549B.e(value, OldSearchViewState.b(value, null, null, null, false, false, null, null, false, kVar, l3.f93323c, null))) {
                return;
            } else {
                query = kVar;
            }
        }
    }

    public final boolean V0(h limitedResultsScenario) {
        Intrinsics.j(limitedResultsScenario, "limitedResultsScenario");
        return limitedResultsScenario == h.f108864b || limitedResultsScenario == h.f108865c;
    }

    public final boolean W0(h limitedResultsScenario) {
        Intrinsics.j(limitedResultsScenario, "limitedResultsScenario");
        return limitedResultsScenario != h.f108863a;
    }

    public final boolean X0(h limitedResultsScenario) {
        Intrinsics.j(limitedResultsScenario, "limitedResultsScenario");
        return limitedResultsScenario != h.f108866d;
    }

    public final boolean Y0(h limitedResultsScenario) {
        Intrinsics.j(limitedResultsScenario, "limitedResultsScenario");
        return limitedResultsScenario == h.f108866d;
    }

    public final AbstractC6392a g0(h limitedResultsScenario, int tokenMatchCount, int embeddingsCount, String searchTerm) {
        Intrinsics.j(limitedResultsScenario, "limitedResultsScenario");
        Intrinsics.j(searchTerm, "searchTerm");
        int i10 = i.$EnumSwitchMapping$0[limitedResultsScenario.ordinal()];
        if (i10 == 1) {
            return null;
        }
        if (i10 == 2) {
            return AbstractC6392a.INSTANCE.d(C18372b.f172055f, Integer.valueOf(tokenMatchCount));
        }
        if (i10 == 3) {
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            return companion.d(C18372b.f172054e, companion.b(C18371a.f172043b, tokenMatchCount, searchTerm), companion.b(C18371a.f172044c, embeddingsCount, new Object[0]));
        }
        if (i10 == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC16553F<AbstractC12412s> getEvents() {
        return C16563h.b(this._event);
    }

    public final AbstractC6392a h0(h limitedResultsScenario, String searchTerm) {
        Intrinsics.j(limitedResultsScenario, "limitedResultsScenario");
        Intrinsics.j(searchTerm, "searchTerm");
        int i10 = i.$EnumSwitchMapping$0[limitedResultsScenario.ordinal()];
        if (i10 == 1) {
            return null;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return AbstractC6392a.INSTANCE.d(C18372b.f172053d, searchTerm);
            }
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return AbstractC6392a.INSTANCE.d(C18372b.f172056g, searchTerm);
    }

    public final AbstractC6392a i0(h limitedResultsScenario, int number) {
        Intrinsics.j(limitedResultsScenario, "limitedResultsScenario");
        int i10 = i.$EnumSwitchMapping$0[limitedResultsScenario.ordinal()];
        if (i10 == 1) {
            return AbstractC6392a.INSTANCE.b(C18371a.f172042a, number, NumberFormat.getNumberInstance(Locale.getDefault()).format(Integer.valueOf(number)));
        }
        if (i10 == 2) {
            return AbstractC6392a.INSTANCE.b(C18371a.f172045d, number, new Object[0]);
        }
        if (i10 == 3) {
            return AbstractC6392a.INSTANCE.b(C18371a.f172049h, number, new Object[0]);
        }
        if (i10 == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final h j0(int tokenMatchCount, int embeddingsCount) {
        return (embeddingsCount <= 0 || tokenMatchCount != 0) ? (embeddingsCount <= 0 || 1 > tokenMatchCount || tokenMatchCount >= 10) ? (embeddingsCount == 0 && tokenMatchCount == 0) ? h.f108866d : h.f108863a : h.f108865c : h.f108864b;
    }

    public final int k0(h limitedResultsScenario, int totalResults, int tokenMatchCount, int embeddingsCount) {
        Intrinsics.j(limitedResultsScenario, "limitedResultsScenario");
        int i10 = i.$EnumSwitchMapping$0[limitedResultsScenario.ordinal()];
        if (i10 == 1) {
            return totalResults;
        }
        if (i10 == 2) {
            return embeddingsCount;
        }
        if (i10 == 3) {
            return tokenMatchCount + embeddingsCount;
        }
        if (i10 == 4) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public void onAction(Qk.a action) {
        Intrinsics.j(action, "action");
        if (action instanceof a.Clip) {
            a.Clip clip = (a.Clip) action;
            n0(clip.getCoupon(), clip.getTrackingData());
        } else if (action instanceof a.ViewCouponDetails) {
            C15809k.d(androidx.view.d0.a(this), null, null, new o(action, null), 3, null);
        } else if (!(action instanceof a.NotInterested) && !(action instanceof a.Unclip) && !(action instanceof a.ViewCouponList)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // androidx.view.InterfaceC6157f
    public void onCreate(InterfaceC6172s owner) {
        Intrinsics.j(owner, "owner");
        pushUserAuthenticationState();
    }

    public final InterfaceC5872l0<List<HomeDepartment>> s0() {
        return this.departmentsList;
    }

    public final InterfaceC5872l0<Pj.a> t0() {
        return this.departmentsLoadingState;
    }

    public final InterfaceC5872l0<String> u0() {
        return this.filterAndSortButtonText;
    }

    public final InterfaceC5872l0<HomeDecorator> v0() {
        return this.homeDecorator;
    }

    public final InterfaceC5872l0<String> w0() {
        return this.resultsExplanationBodyText;
    }

    public final InterfaceC5872l0<String> x0() {
        return this.resultsExplanationTitleText;
    }

    public final InterfaceC5872l0<String> y0() {
        return this.searchResultsHeaderText;
    }

    public final InterfaceC5872l0<AbstractC6392a> z0() {
        return this.shopByDepartmentCarouselViewAllTitle;
    }

    public static void B(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object M(I1 i12, SearchSuggestions searchSuggestions, Continuation continuation) {
        i12.S0(searchSuggestions);
        return Unit.f143329a;
    }

    private final void N0(ClipUnclipCouponResponse response, Coupon coupon, TrackingData trackingData) {
        if (!StringsKt.I(response.getResult(), "Success", false, 2, null)) {
            C15809k.d(androidx.view.d0.a(this), null, null, new q(coupon, trackingData, null), 3, null);
        } else {
            this.analyticsEngine.k(trackingData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P0(I1 i12, Pk.c cVar, EnumC15218a enumC15218a, Coupon coupon) {
        if (coupon.x()) {
            i12.onAction(new a.ViewCouponDetails(cVar, null));
        } else {
            Intrinsics.g(coupon);
            i12.onAction(new a.Clip(cVar, i12.getClipCouponTrackingData(coupon, enumC15218a)));
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c0(I1 i12, Coupon coupon, TrackingData trackingData, ClipUnclipCouponResponse clipUnclipCouponResponse) {
        Intrinsics.g(clipUnclipCouponResponse);
        i12.N0(clipUnclipCouponResponse, coupon, trackingData);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void l0() {
        C15809k.d(androidx.view.d0.a(this), null, null, new k(null), 3, null);
    }

    public static void n(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o0(I1 i12, TrackingData trackingData, Coupon coupon) {
        Intrinsics.g(coupon);
        i12.b0(coupon, trackingData);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
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
            this.loadingStatesManager.b(new a.Failed(loadingKey, null, 2, null));
        } else {
            this.loadingStatesManager.b(new a.Failed(loadingKey, AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f101115p5, new Object[0])));
        }
    }

    public static Unit t(I1 i12, Object obj, List list) {
        Intrinsics.g(list);
        i12.onProductsState(obj, list);
        return Unit.f143329a;
    }

    public final void Z0() {
        C15809k.d(androidx.view.d0.a(this), null, null, new D(null), 3, null);
    }

    @Override // androidx.view.c0
    protected void onCleared() {
        super.onCleared();
        this.disposables.d();
    }
}
