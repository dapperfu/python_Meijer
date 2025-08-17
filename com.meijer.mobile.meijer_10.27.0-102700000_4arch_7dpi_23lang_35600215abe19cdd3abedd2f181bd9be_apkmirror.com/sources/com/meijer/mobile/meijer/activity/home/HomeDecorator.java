package com.meijer.mobile.meijer.activity.home;

import Ji.C;
import Sl.MarketingBannersDecorator;
import Ul.HomeDepartment;
import Ul.MarketingBanner;
import Ul.e;
import Vl.HomeMperks;
import ak.AbstractC5607a;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.meijer.activity.home.HomeViewModel;
import dl.SpecialOffer;
import ds.DepartmentCarouselDecorator;
import es.OrderStatusCardDecorator;
import fi.GoogleAdData;
import fm.HomeEmailBannerDecorator;
import fm.HomeMperksDecorator;
import fm.SpecialOffersCarouselDecorator;
import gm.AbstractC14275b;
import gm.C14274a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jk.EnumC14984a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import vs.CarouselDecorator;
import vs.ProductCarouselDecorator;
import vs.ProductListDecorator;
import xk.C18066d;

@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u000e\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BÃ\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u0004\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u0004\u0012\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\u0016\u0012\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\u0016\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001c\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010#\u001a\u00020\u001c\u0012\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\b\b\u0002\u0010%\u001a\u00020\u001c\u0012\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u0004\u0012\b\b\u0002\u0010(\u001a\u00020\u001a\u0012\b\b\u0002\u0010)\u001a\u00020\u001c\u00128\b\u0002\u00102\u001a2\u0012\u0013\u0012\u00110+¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110/¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(0\u0012\u0004\u0012\u0002010*\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000103\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000106\u0012\b\b\u0002\u00108\u001a\u00020\u001c¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0016\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003¢\u0006\u0004\b?\u0010>J\u0016\u0010@\u001a\b\u0012\u0004\u0012\u00020\t0\u0004HÆ\u0003¢\u0006\u0004\b@\u0010>J\u0012\u0010A\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bC\u0010BJ\u0012\u0010D\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0016\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004HÆ\u0003¢\u0006\u0004\bF\u0010>J\u0012\u0010G\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bG\u0010HJ\u001c\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u0004HÆ\u0003¢\u0006\u0004\bI\u0010>J\u001c\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u0004HÆ\u0003¢\u0006\u0004\bJ\u0010>J\u001c\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\u0016HÆ\u0003¢\u0006\u0004\bK\u0010LJ\u001c\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\u0016HÆ\u0003¢\u0006\u0004\bM\u0010LJ\u0010\u0010N\u001a\u00020\u001aHÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020\u001cHÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u00020\u001cHÆ\u0003¢\u0006\u0004\bR\u0010QJ\u0012\u0010S\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bS\u0010TJ\u0012\u0010U\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0010\u0010W\u001a\u00020\u001cHÆ\u0003¢\u0006\u0004\bW\u0010QJ\u0016\u0010X\u001a\b\u0012\u0004\u0012\u00020\t0\u0004HÆ\u0003¢\u0006\u0004\bX\u0010>J\u0010\u0010Y\u001a\u00020\u001cHÆ\u0003¢\u0006\u0004\bY\u0010QJ\u0018\u0010Z\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bZ\u0010>J\u0010\u0010[\u001a\u00020\u001aHÆ\u0003¢\u0006\u0004\b[\u0010OJ\u0010\u0010\\\u001a\u00020\u001cHÆ\u0003¢\u0006\u0004\b\\\u0010QJ@\u0010]\u001a2\u0012\u0013\u0012\u00110+¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110/¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(0\u0012\u0004\u0012\u0002010*HÆ\u0003¢\u0006\u0004\b]\u0010^J\u0012\u0010_\u001a\u0004\u0018\u000103HÆ\u0003¢\u0006\u0004\b_\u0010`J\u0012\u0010a\u001a\u0004\u0018\u000103HÆ\u0003¢\u0006\u0004\ba\u0010`J\u0012\u0010b\u001a\u0004\u0018\u000106HÆ\u0003¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020\u001cHÆ\u0003¢\u0006\u0004\bd\u0010QJÌ\u0003\u0010e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u00042\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u00042\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\u00162\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010#\u001a\u00020\u001c2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0002\u0010%\u001a\u00020\u001c2\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u00042\b\b\u0002\u0010(\u001a\u00020\u001a2\b\b\u0002\u0010)\u001a\u00020\u001c28\b\u0002\u00102\u001a2\u0012\u0013\u0012\u00110+¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110/¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(0\u0012\u0004\u0012\u0002010*2\n\b\u0002\u00104\u001a\u0004\u0018\u0001032\n\b\u0002\u00105\u001a\u0004\u0018\u0001032\n\b\u0002\u00107\u001a\u0004\u0018\u0001062\b\b\u0002\u00108\u001a\u00020\u001cHÆ\u0001¢\u0006\u0004\be\u0010fJ\u0010\u0010h\u001a\u00020gHÖ\u0001¢\u0006\u0004\bh\u0010iJ\u0010\u0010j\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\bj\u0010OJ\u001a\u0010l\u001a\u00020\u001c2\b\u0010k\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bl\u0010mR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010n\u001a\u0004\bo\u0010<R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010p\u001a\u0004\bq\u0010>R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010p\u001a\u0004\br\u0010>R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010p\u001a\u0004\bs\u0010>R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010t\u001a\u0004\bu\u0010BR\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010t\u001a\u0004\bv\u0010BR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010w\u001a\u0004\bx\u0010ER\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010p\u001a\u0004\by\u0010>R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010z\u001a\u0004\b{\u0010HR#\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010p\u001a\u0004\b|\u0010>R#\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010p\u001a\u0004\b}\u0010>R#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010~\u001a\u0004\b\u007f\u0010LR$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\u00168\u0006¢\u0006\r\n\u0004\b\u0019\u0010~\u001a\u0005\b\u0080\u0001\u0010LR\u0019\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\u000e\n\u0005\b\u001b\u0010\u0081\u0001\u001a\u0005\b\u0082\u0001\u0010OR\u0019\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\u000e\n\u0005\b\u001d\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010QR\u0018\u0010\u001e\u001a\u00020\u001c8\u0006¢\u0006\r\n\u0005\b\u001e\u0010\u0083\u0001\u001a\u0004\b\u001e\u0010QR\u001b\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\u000e\n\u0005\b \u0010\u0085\u0001\u001a\u0005\b\u0086\u0001\u0010TR\u001b\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\u000e\n\u0005\b\"\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010VR\u0018\u0010#\u001a\u00020\u001c8\u0006¢\u0006\r\n\u0005\b#\u0010\u0083\u0001\u001a\u0004\b#\u0010QR\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006¢\u0006\r\n\u0004\b$\u0010p\u001a\u0005\b\u0089\u0001\u0010>R\u0018\u0010%\u001a\u00020\u001c8\u0006¢\u0006\r\n\u0005\b%\u0010\u0083\u0001\u001a\u0004\b%\u0010QR \u0010'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u00048\u0006¢\u0006\r\n\u0004\b'\u0010p\u001a\u0005\b\u008a\u0001\u0010>R&\u0010(\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b(\u0010\u0081\u0001\u001a\u0005\b\u008b\u0001\u0010O\"\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0019\u0010)\u001a\u00020\u001c8\u0006¢\u0006\u000e\n\u0005\b)\u0010\u0083\u0001\u001a\u0005\b\u008e\u0001\u0010QRI\u00102\u001a2\u0012\u0013\u0012\u00110+¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110/¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(0\u0012\u0004\u0012\u0002010*8\u0006¢\u0006\u000e\n\u0005\b2\u0010\u008f\u0001\u001a\u0005\b\u0090\u0001\u0010^R\u001b\u00104\u001a\u0004\u0018\u0001038\u0006¢\u0006\u000e\n\u0005\b4\u0010\u0091\u0001\u001a\u0005\b\u0092\u0001\u0010`R\u001b\u00105\u001a\u0004\u0018\u0001038\u0006¢\u0006\u000e\n\u0005\b5\u0010\u0091\u0001\u001a\u0005\b\u0093\u0001\u0010`R\u001b\u00107\u001a\u0004\u0018\u0001068\u0006¢\u0006\u000e\n\u0005\b7\u0010\u0094\u0001\u001a\u0005\b\u0095\u0001\u0010cR\u0018\u00108\u001a\u00020\u001c8\u0006¢\u0006\r\n\u0005\b8\u0010\u0083\u0001\u001a\u0004\b8\u0010QR\u001d\u0010\u0097\u0001\u001a\t\u0012\u0005\u0012\u00030\u0096\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010pR\u001c\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010pR\u0013\u0010\u009a\u0001\u001a\u00020\u001a8F¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010OR\u0015\u0010\u009e\u0001\u001a\u00030\u009b\u00018F¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001a\u0010¡\u0001\u001a\t\u0012\u0005\u0012\u00030\u009f\u00010\u00048F¢\u0006\u0007\u001a\u0005\b \u0001\u0010>R\u0013\u0010£\u0001\u001a\u00020\u001c8F¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010QR\u0016\u0010¦\u0001\u001a\u0004\u0018\u00010\u001a8F¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001R\u0015\u0010ª\u0001\u001a\u00030§\u00018F¢\u0006\b\u001a\u0006\b¨\u0001\u0010©\u0001R\u001a\u0010¬\u0001\u001a\t\u0012\u0005\u0012\u00030§\u00010\u00048F¢\u0006\u0007\u001a\u0005\b«\u0001\u0010>R\u001a\u0010®\u0001\u001a\t\u0012\u0005\u0012\u00030§\u00010\u00048F¢\u0006\u0007\u001a\u0005\b\u00ad\u0001\u0010>R\u0015\u0010²\u0001\u001a\u00030¯\u00018F¢\u0006\b\u001a\u0006\b°\u0001\u0010±\u0001R\u0017\u0010¶\u0001\u001a\u0005\u0018\u00010³\u00018F¢\u0006\b\u001a\u0006\b´\u0001\u0010µ\u0001¨\u0006·\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/HomeDecorator;", "", "LVl/b;", "homeMperksModel", "", "Lgm/b;", "chips", "Ldl/b;", "specialOffersList", "LOj/a;", "loadingStates", "Lds/c;", "shopByDepartmentsCarouselItems", "seasonalCarouselItems", "Lvs/a;", "whiteLabelCarousel", "Lvs/f;", "whiteLabelProducts", "Lwr/f;", "cartInteractor", "curatedProducts", "personalizedProducts", "", "LUl/e$f;", "curatedCarousels", "personalizedCarousels", "", "totalSpecialOffersCount", "", "shouldShowEmailVerificationBanner", "isResendEmailSuccess", "LSl/a;", "marketingBannersDecorator", "Lcom/meijer/mobile/meijer/activity/home/HomeDecoratorListener;", "listener", "isLoadingContent", "errorStates", "isLoggedIn", "Les/i;", "orderStatusCards", "orderStatusPosition", "showOrderStatus", "Lkotlin/Function2;", "LOk/c;", "Lkotlin/ParameterName;", "name", "couponIdentity", "Ljk/a;", "carouselType", "", "productCouponButtonClicked", "Lfi/d;", "googleAdSlot1", "googleAdSlot2", "LUl/e$d$a;", "teacherListsCard", "isNewDeeplinkEnabled", "<init>", "(LVl/b;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lds/c;Lds/c;Lvs/a;Ljava/util/List;Lwr/f;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;IZZLSl/a;Lcom/meijer/mobile/meijer/activity/home/HomeDecoratorListener;ZLjava/util/List;ZLjava/util/List;IZLkotlin/jvm/functions/Function2;Lfi/d;Lfi/d;LUl/e$d$a;Z)V", "component1", "()LVl/b;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "()Lds/c;", "component6", "component7", "()Lvs/a;", "component8", "component9", "()Lwr/f;", "component10", "component11", "component12", "()Ljava/util/Map;", "component13", "component14", "()I", "component15", "()Z", "component16", "component17", "()LSl/a;", "component18", "()Lcom/meijer/mobile/meijer/activity/home/HomeDecoratorListener;", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "()Lkotlin/jvm/functions/Function2;", "component26", "()Lfi/d;", "component27", "component28", "()LUl/e$d$a;", "component29", "copy", "(LVl/b;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lds/c;Lds/c;Lvs/a;Ljava/util/List;Lwr/f;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;IZZLSl/a;Lcom/meijer/mobile/meijer/activity/home/HomeDecoratorListener;ZLjava/util/List;ZLjava/util/List;IZLkotlin/jvm/functions/Function2;Lfi/d;Lfi/d;LUl/e$d$a;Z)Lcom/meijer/mobile/meijer/activity/home/HomeDecorator;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "LVl/b;", "getHomeMperksModel", "Ljava/util/List;", "getChips", "getSpecialOffersList", "getLoadingStates", "Lds/c;", "getShopByDepartmentsCarouselItems", "getSeasonalCarouselItems", "Lvs/a;", "getWhiteLabelCarousel", "getWhiteLabelProducts", "Lwr/f;", "getCartInteractor", "getCuratedProducts", "getPersonalizedProducts", "Ljava/util/Map;", "getCuratedCarousels", "getPersonalizedCarousels", "I", "getTotalSpecialOffersCount", "Z", "getShouldShowEmailVerificationBanner", "LSl/a;", "getMarketingBannersDecorator", "Lcom/meijer/mobile/meijer/activity/home/HomeDecoratorListener;", "getListener", "getErrorStates", "getOrderStatusCards", "getOrderStatusPosition", "setOrderStatusPosition", "(I)V", "getShowOrderStatus", "Lkotlin/jvm/functions/Function2;", "getProductCouponButtonClicked", "Lfi/d;", "getGoogleAdSlot1", "getGoogleAdSlot2", "LUl/e$d$a;", "getTeacherListsCard", "LUl/e$f$b;", "curatedKeys", "personalizedKeys", "getOrderStatusItemCount", "orderStatusItemCount", "Lfm/b;", "getMperksSection", "()Lfm/b;", "mperksSection", "LUl/i;", "getBottomBannerList", "bottomBannerList", "getInLastPosition", "inLastPosition", "getFirstBottomBannerPosition", "()Ljava/lang/Integer;", "firstBottomBannerPosition", "Lvs/d;", "getWhiteLabel", "()Lvs/d;", "whiteLabel", "getCuratedCarouselList", "curatedCarouselList", "getProductCarouselList", "productCarouselList", "Lfm/c;", "getSpecialOffersCarousel", "()Lfm/c;", "specialOffersCarousel", "Lfm/a;", "getHomeEmailBannerDecorator", "()Lfm/a;", "homeEmailBannerDecorator", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final /* data */ class HomeDecorator {
    public static final int $stable = 8;
    private final wr.f cartInteractor;
    private final List<AbstractC14275b> chips;
    private final Map<e.f, CarouselDecorator> curatedCarousels;
    private final List<e.f.b> curatedKeys;
    private final List<List<ProductListDecorator>> curatedProducts;
    private final List<Oj.a> errorStates;
    private final GoogleAdData googleAdSlot1;
    private final GoogleAdData googleAdSlot2;
    private final HomeMperks homeMperksModel;
    private final boolean isLoadingContent;
    private final boolean isLoggedIn;
    private final boolean isNewDeeplinkEnabled;
    private final boolean isResendEmailSuccess;
    private final HomeDecoratorListener listener;
    private final List<Oj.a> loadingStates;
    private final MarketingBannersDecorator marketingBannersDecorator;
    private final List<OrderStatusCardDecorator> orderStatusCards;
    private int orderStatusPosition;
    private final Map<e.f, CarouselDecorator> personalizedCarousels;
    private final List<e.f> personalizedKeys;
    private final List<List<ProductListDecorator>> personalizedProducts;
    private final Function2<Ok.c, EnumC14984a, Unit> productCouponButtonClicked;
    private final DepartmentCarouselDecorator seasonalCarouselItems;
    private final DepartmentCarouselDecorator shopByDepartmentsCarouselItems;
    private final boolean shouldShowEmailVerificationBanner;
    private final boolean showOrderStatus;
    private final List<SpecialOffer> specialOffersList;
    private final e.d.a teacherListsCard;
    private final int totalSpecialOffersCount;
    private final CarouselDecorator whiteLabelCarousel;
    private final List<ProductListDecorator> whiteLabelProducts;

    public HomeDecorator() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, false, null, null, false, null, false, null, 0, false, null, null, null, null, false, 536870911, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int _get_orderStatusItemCount_$lambda$1() {
        return 0;
    }

    public static /* synthetic */ HomeDecorator copy$default(HomeDecorator homeDecorator, HomeMperks bVar, List list, List list2, List list3, DepartmentCarouselDecorator c13566c, DepartmentCarouselDecorator c13566c2, CarouselDecorator c17605a, List list4, wr.f fVar, List list5, List list6, Map map, Map map2, int i10, boolean z10, boolean z11, MarketingBannersDecorator aVar, HomeDecoratorListener homeDecoratorListener, boolean z12, List list7, boolean z13, List list8, int i11, boolean z14, Function2 function2, GoogleAdData c13903d, GoogleAdData c13903d2, e.d.a aVar2, boolean z15, int i12, Object obj) {
        boolean z16;
        e.d.a aVar3;
        HomeMperks bVar2 = (i12 & 1) != 0 ? homeDecorator.homeMperksModel : bVar;
        List list9 = (i12 & 2) != 0 ? homeDecorator.chips : list;
        List list10 = (i12 & 4) != 0 ? homeDecorator.specialOffersList : list2;
        List list11 = (i12 & 8) != 0 ? homeDecorator.loadingStates : list3;
        DepartmentCarouselDecorator c13566c3 = (i12 & 16) != 0 ? homeDecorator.shopByDepartmentsCarouselItems : c13566c;
        DepartmentCarouselDecorator c13566c4 = (i12 & 32) != 0 ? homeDecorator.seasonalCarouselItems : c13566c2;
        CarouselDecorator c17605a2 = (i12 & 64) != 0 ? homeDecorator.whiteLabelCarousel : c17605a;
        List list12 = (i12 & 128) != 0 ? homeDecorator.whiteLabelProducts : list4;
        wr.f fVar2 = (i12 & 256) != 0 ? homeDecorator.cartInteractor : fVar;
        List list13 = (i12 & 512) != 0 ? homeDecorator.curatedProducts : list5;
        List list14 = (i12 & 1024) != 0 ? homeDecorator.personalizedProducts : list6;
        Map map3 = (i12 & RecyclerView.m.FLAG_MOVED) != 0 ? homeDecorator.curatedCarousels : map;
        Map map4 = (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? homeDecorator.personalizedCarousels : map2;
        int i13 = (i12 & 8192) != 0 ? homeDecorator.totalSpecialOffersCount : i10;
        HomeMperks bVar3 = bVar2;
        boolean z17 = (i12 & 16384) != 0 ? homeDecorator.shouldShowEmailVerificationBanner : z10;
        boolean z18 = (i12 & 32768) != 0 ? homeDecorator.isResendEmailSuccess : z11;
        MarketingBannersDecorator aVar4 = (i12 & 65536) != 0 ? homeDecorator.marketingBannersDecorator : aVar;
        HomeDecoratorListener homeDecoratorListener2 = (i12 & 131072) != 0 ? homeDecorator.listener : homeDecoratorListener;
        boolean z19 = (i12 & 262144) != 0 ? homeDecorator.isLoadingContent : z12;
        List list15 = (i12 & 524288) != 0 ? homeDecorator.errorStates : list7;
        boolean z20 = (i12 & 1048576) != 0 ? homeDecorator.isLoggedIn : z13;
        List list16 = (i12 & 2097152) != 0 ? homeDecorator.orderStatusCards : list8;
        int i14 = (i12 & 4194304) != 0 ? homeDecorator.orderStatusPosition : i11;
        boolean z21 = (i12 & 8388608) != 0 ? homeDecorator.showOrderStatus : z14;
        Function2 function22 = (i12 & 16777216) != 0 ? homeDecorator.productCouponButtonClicked : function2;
        GoogleAdData c13903d3 = (i12 & 33554432) != 0 ? homeDecorator.googleAdSlot1 : c13903d;
        GoogleAdData c13903d4 = (i12 & 67108864) != 0 ? homeDecorator.googleAdSlot2 : c13903d2;
        e.d.a aVar5 = (i12 & 134217728) != 0 ? homeDecorator.teacherListsCard : aVar2;
        if ((i12 & 268435456) != 0) {
            aVar3 = aVar5;
            z16 = homeDecorator.isNewDeeplinkEnabled;
        } else {
            z16 = z15;
            aVar3 = aVar5;
        }
        return homeDecorator.copy(bVar3, list9, list10, list11, c13566c3, c13566c4, c17605a2, list12, fVar2, list13, list14, map3, map4, i13, z17, z18, aVar4, homeDecoratorListener2, z19, list15, z20, list16, i14, z21, function22, c13903d3, c13903d4, aVar3, z16);
    }

    public final List<List<ProductListDecorator>> component10() {
        return this.curatedProducts;
    }

    public final List<List<ProductListDecorator>> component11() {
        return this.personalizedProducts;
    }

    public final Map<e.f, CarouselDecorator> component12() {
        return this.curatedCarousels;
    }

    public final Map<e.f, CarouselDecorator> component13() {
        return this.personalizedCarousels;
    }

    /* renamed from: component14, reason: from getter */
    public final int getTotalSpecialOffersCount() {
        return this.totalSpecialOffersCount;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getShouldShowEmailVerificationBanner() {
        return this.shouldShowEmailVerificationBanner;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getIsResendEmailSuccess() {
        return this.isResendEmailSuccess;
    }

    /* renamed from: component18, reason: from getter */
    public final HomeDecoratorListener getListener() {
        return this.listener;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getIsLoadingContent() {
        return this.isLoadingContent;
    }

    public final List<AbstractC14275b> component2() {
        return this.chips;
    }

    public final List<Oj.a> component20() {
        return this.errorStates;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getIsLoggedIn() {
        return this.isLoggedIn;
    }

    public final List<OrderStatusCardDecorator> component22() {
        return this.orderStatusCards;
    }

    /* renamed from: component23, reason: from getter */
    public final int getOrderStatusPosition() {
        return this.orderStatusPosition;
    }

    /* renamed from: component24, reason: from getter */
    public final boolean getShowOrderStatus() {
        return this.showOrderStatus;
    }

    public final Function2<Ok.c, EnumC14984a, Unit> component25() {
        return this.productCouponButtonClicked;
    }

    /* renamed from: component29, reason: from getter */
    public final boolean getIsNewDeeplinkEnabled() {
        return this.isNewDeeplinkEnabled;
    }

    public final List<SpecialOffer> component3() {
        return this.specialOffersList;
    }

    public final List<Oj.a> component4() {
        return this.loadingStates;
    }

    public final List<ProductListDecorator> component8() {
        return this.whiteLabelProducts;
    }

    public final HomeDecorator copy(HomeMperks homeMperksModel, List<? extends AbstractC14275b> chips, List<SpecialOffer> specialOffersList, List<? extends Oj.a> loadingStates, DepartmentCarouselDecorator shopByDepartmentsCarouselItems, DepartmentCarouselDecorator seasonalCarouselItems, CarouselDecorator whiteLabelCarousel, List<ProductListDecorator> whiteLabelProducts, wr.f cartInteractor, List<? extends List<ProductListDecorator>> curatedProducts, List<? extends List<ProductListDecorator>> personalizedProducts, Map<e.f, CarouselDecorator> curatedCarousels, Map<e.f, CarouselDecorator> personalizedCarousels, int totalSpecialOffersCount, boolean shouldShowEmailVerificationBanner, boolean isResendEmailSuccess, MarketingBannersDecorator marketingBannersDecorator, HomeDecoratorListener listener, boolean isLoadingContent, List<? extends Oj.a> errorStates, boolean isLoggedIn, List<OrderStatusCardDecorator> orderStatusCards, int orderStatusPosition, boolean showOrderStatus, Function2<? super Ok.c, ? super EnumC14984a, Unit> productCouponButtonClicked, GoogleAdData googleAdSlot1, GoogleAdData googleAdSlot2, e.d.a teacherListsCard, boolean isNewDeeplinkEnabled) {
        Intrinsics.j(chips, "chips");
        Intrinsics.j(specialOffersList, "specialOffersList");
        Intrinsics.j(loadingStates, "loadingStates");
        Intrinsics.j(whiteLabelProducts, "whiteLabelProducts");
        Intrinsics.j(curatedProducts, "curatedProducts");
        Intrinsics.j(personalizedProducts, "personalizedProducts");
        Intrinsics.j(curatedCarousels, "curatedCarousels");
        Intrinsics.j(personalizedCarousels, "personalizedCarousels");
        Intrinsics.j(errorStates, "errorStates");
        Intrinsics.j(productCouponButtonClicked, "productCouponButtonClicked");
        return new HomeDecorator(homeMperksModel, chips, specialOffersList, loadingStates, shopByDepartmentsCarouselItems, seasonalCarouselItems, whiteLabelCarousel, whiteLabelProducts, cartInteractor, curatedProducts, personalizedProducts, curatedCarousels, personalizedCarousels, totalSpecialOffersCount, shouldShowEmailVerificationBanner, isResendEmailSuccess, marketingBannersDecorator, listener, isLoadingContent, errorStates, isLoggedIn, orderStatusCards, orderStatusPosition, showOrderStatus, productCouponButtonClicked, googleAdSlot1, googleAdSlot2, teacherListsCard, isNewDeeplinkEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeDecorator)) {
            return false;
        }
        HomeDecorator homeDecorator = (HomeDecorator) other;
        return Intrinsics.e(this.homeMperksModel, homeDecorator.homeMperksModel) && Intrinsics.e(this.chips, homeDecorator.chips) && Intrinsics.e(this.specialOffersList, homeDecorator.specialOffersList) && Intrinsics.e(this.loadingStates, homeDecorator.loadingStates) && Intrinsics.e(this.shopByDepartmentsCarouselItems, homeDecorator.shopByDepartmentsCarouselItems) && Intrinsics.e(this.seasonalCarouselItems, homeDecorator.seasonalCarouselItems) && Intrinsics.e(this.whiteLabelCarousel, homeDecorator.whiteLabelCarousel) && Intrinsics.e(this.whiteLabelProducts, homeDecorator.whiteLabelProducts) && Intrinsics.e(this.cartInteractor, homeDecorator.cartInteractor) && Intrinsics.e(this.curatedProducts, homeDecorator.curatedProducts) && Intrinsics.e(this.personalizedProducts, homeDecorator.personalizedProducts) && Intrinsics.e(this.curatedCarousels, homeDecorator.curatedCarousels) && Intrinsics.e(this.personalizedCarousels, homeDecorator.personalizedCarousels) && this.totalSpecialOffersCount == homeDecorator.totalSpecialOffersCount && this.shouldShowEmailVerificationBanner == homeDecorator.shouldShowEmailVerificationBanner && this.isResendEmailSuccess == homeDecorator.isResendEmailSuccess && Intrinsics.e(this.marketingBannersDecorator, homeDecorator.marketingBannersDecorator) && Intrinsics.e(this.listener, homeDecorator.listener) && this.isLoadingContent == homeDecorator.isLoadingContent && Intrinsics.e(this.errorStates, homeDecorator.errorStates) && this.isLoggedIn == homeDecorator.isLoggedIn && Intrinsics.e(this.orderStatusCards, homeDecorator.orderStatusCards) && this.orderStatusPosition == homeDecorator.orderStatusPosition && this.showOrderStatus == homeDecorator.showOrderStatus && Intrinsics.e(this.productCouponButtonClicked, homeDecorator.productCouponButtonClicked) && Intrinsics.e(this.googleAdSlot1, homeDecorator.googleAdSlot1) && Intrinsics.e(this.googleAdSlot2, homeDecorator.googleAdSlot2) && Intrinsics.e(this.teacherListsCard, homeDecorator.teacherListsCard) && this.isNewDeeplinkEnabled == homeDecorator.isNewDeeplinkEnabled;
    }

    public final Integer getFirstBottomBannerPosition() {
        List<HomeDepartment> listC;
        List<HomeDepartment> listC2;
        ArrayList arrayList = new ArrayList();
        if (!this.personalizedProducts.get(0).isEmpty()) {
            arrayList.add(1);
        }
        if (!this.personalizedProducts.get(1).isEmpty()) {
            arrayList.add(1);
        }
        DepartmentCarouselDecorator c13566c = this.shopByDepartmentsCarouselItems;
        if (c13566c != null && (listC2 = c13566c.c()) != null) {
            if (listC2.isEmpty()) {
                listC2 = null;
            }
            if (listC2 != null) {
                arrayList.add(1);
            }
        }
        DepartmentCarouselDecorator c13566c2 = this.seasonalCarouselItems;
        if (c13566c2 != null && (listC = c13566c2.c()) != null) {
            if (listC.isEmpty()) {
                listC = null;
            }
            if (listC != null) {
                arrayList.add(1);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        if (!this.personalizedProducts.get(2).isEmpty()) {
            arrayList2.add(1);
        }
        if (arrayList.size() == 3) {
            return 1;
        }
        if (this.personalizedProducts.get(2).isEmpty() || arrayList.size() != 2) {
            return (this.specialOffersList.isEmpty() || arrayList2.size() != 2) ? null : 3;
        }
        return 2;
    }

    public int hashCode() {
        HomeMperks bVar = this.homeMperksModel;
        int iHashCode = (((((((bVar == null ? 0 : bVar.hashCode()) * 31) + this.chips.hashCode()) * 31) + this.specialOffersList.hashCode()) * 31) + this.loadingStates.hashCode()) * 31;
        DepartmentCarouselDecorator c13566c = this.shopByDepartmentsCarouselItems;
        int iHashCode2 = (iHashCode + (c13566c == null ? 0 : c13566c.hashCode())) * 31;
        DepartmentCarouselDecorator c13566c2 = this.seasonalCarouselItems;
        int iHashCode3 = (iHashCode2 + (c13566c2 == null ? 0 : c13566c2.hashCode())) * 31;
        CarouselDecorator c17605a = this.whiteLabelCarousel;
        int iHashCode4 = (((iHashCode3 + (c17605a == null ? 0 : c17605a.hashCode())) * 31) + this.whiteLabelProducts.hashCode()) * 31;
        wr.f fVar = this.cartInteractor;
        int iHashCode5 = (((((((((((((((iHashCode4 + (fVar == null ? 0 : fVar.hashCode())) * 31) + this.curatedProducts.hashCode()) * 31) + this.personalizedProducts.hashCode()) * 31) + this.curatedCarousels.hashCode()) * 31) + this.personalizedCarousels.hashCode()) * 31) + Integer.hashCode(this.totalSpecialOffersCount)) * 31) + Boolean.hashCode(this.shouldShowEmailVerificationBanner)) * 31) + Boolean.hashCode(this.isResendEmailSuccess)) * 31;
        MarketingBannersDecorator aVar = this.marketingBannersDecorator;
        int iHashCode6 = (iHashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        HomeDecoratorListener homeDecoratorListener = this.listener;
        int iHashCode7 = (((((((iHashCode6 + (homeDecoratorListener == null ? 0 : homeDecoratorListener.hashCode())) * 31) + Boolean.hashCode(this.isLoadingContent)) * 31) + this.errorStates.hashCode()) * 31) + Boolean.hashCode(this.isLoggedIn)) * 31;
        List<OrderStatusCardDecorator> list = this.orderStatusCards;
        int iHashCode8 = (((((((iHashCode7 + (list == null ? 0 : list.hashCode())) * 31) + Integer.hashCode(this.orderStatusPosition)) * 31) + Boolean.hashCode(this.showOrderStatus)) * 31) + this.productCouponButtonClicked.hashCode()) * 31;
        GoogleAdData c13903d = this.googleAdSlot1;
        int iHashCode9 = (iHashCode8 + (c13903d == null ? 0 : c13903d.hashCode())) * 31;
        GoogleAdData c13903d2 = this.googleAdSlot2;
        int iHashCode10 = (iHashCode9 + (c13903d2 == null ? 0 : c13903d2.hashCode())) * 31;
        e.d.a aVar2 = this.teacherListsCard;
        return ((iHashCode10 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isNewDeeplinkEnabled);
    }

    public String toString() {
        return "HomeDecorator(homeMperksModel=" + this.homeMperksModel + ", chips=" + this.chips + ", specialOffersList=" + this.specialOffersList + ", loadingStates=" + this.loadingStates + ", shopByDepartmentsCarouselItems=" + this.shopByDepartmentsCarouselItems + ", seasonalCarouselItems=" + this.seasonalCarouselItems + ", whiteLabelCarousel=" + this.whiteLabelCarousel + ", whiteLabelProducts=" + this.whiteLabelProducts + ", cartInteractor=" + this.cartInteractor + ", curatedProducts=" + this.curatedProducts + ", personalizedProducts=" + this.personalizedProducts + ", curatedCarousels=" + this.curatedCarousels + ", personalizedCarousels=" + this.personalizedCarousels + ", totalSpecialOffersCount=" + this.totalSpecialOffersCount + ", shouldShowEmailVerificationBanner=" + this.shouldShowEmailVerificationBanner + ", isResendEmailSuccess=" + this.isResendEmailSuccess + ", marketingBannersDecorator=" + this.marketingBannersDecorator + ", listener=" + this.listener + ", isLoadingContent=" + this.isLoadingContent + ", errorStates=" + this.errorStates + ", isLoggedIn=" + this.isLoggedIn + ", orderStatusCards=" + this.orderStatusCards + ", orderStatusPosition=" + this.orderStatusPosition + ", showOrderStatus=" + this.showOrderStatus + ", productCouponButtonClicked=" + this.productCouponButtonClicked + ", googleAdSlot1=" + this.googleAdSlot1 + ", googleAdSlot2=" + this.googleAdSlot2 + ", teacherListsCard=" + this.teacherListsCard + ", isNewDeeplinkEnabled=" + this.isNewDeeplinkEnabled + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeDecorator(HomeMperks bVar, List<? extends AbstractC14275b> chips, List<SpecialOffer> specialOffersList, List<? extends Oj.a> loadingStates, DepartmentCarouselDecorator c13566c, DepartmentCarouselDecorator c13566c2, CarouselDecorator c17605a, List<ProductListDecorator> whiteLabelProducts, wr.f fVar, List<? extends List<ProductListDecorator>> curatedProducts, List<? extends List<ProductListDecorator>> personalizedProducts, Map<e.f, CarouselDecorator> curatedCarousels, Map<e.f, CarouselDecorator> personalizedCarousels, int i10, boolean z10, boolean z11, MarketingBannersDecorator aVar, HomeDecoratorListener homeDecoratorListener, boolean z12, List<? extends Oj.a> errorStates, boolean z13, List<OrderStatusCardDecorator> list, int i11, boolean z14, Function2<? super Ok.c, ? super EnumC14984a, Unit> productCouponButtonClicked, GoogleAdData c13903d, GoogleAdData c13903d2, e.d.a aVar2, boolean z15) {
        Intrinsics.j(chips, "chips");
        Intrinsics.j(specialOffersList, "specialOffersList");
        Intrinsics.j(loadingStates, "loadingStates");
        Intrinsics.j(whiteLabelProducts, "whiteLabelProducts");
        Intrinsics.j(curatedProducts, "curatedProducts");
        Intrinsics.j(personalizedProducts, "personalizedProducts");
        Intrinsics.j(curatedCarousels, "curatedCarousels");
        Intrinsics.j(personalizedCarousels, "personalizedCarousels");
        Intrinsics.j(errorStates, "errorStates");
        Intrinsics.j(productCouponButtonClicked, "productCouponButtonClicked");
        this.homeMperksModel = bVar;
        this.chips = chips;
        this.specialOffersList = specialOffersList;
        this.loadingStates = loadingStates;
        this.shopByDepartmentsCarouselItems = c13566c;
        this.seasonalCarouselItems = c13566c2;
        this.whiteLabelCarousel = c17605a;
        this.whiteLabelProducts = whiteLabelProducts;
        this.cartInteractor = fVar;
        this.curatedProducts = curatedProducts;
        this.personalizedProducts = personalizedProducts;
        this.curatedCarousels = curatedCarousels;
        this.personalizedCarousels = personalizedCarousels;
        this.totalSpecialOffersCount = i10;
        this.shouldShowEmailVerificationBanner = z10;
        this.isResendEmailSuccess = z11;
        this.marketingBannersDecorator = aVar;
        this.listener = homeDecoratorListener;
        this.isLoadingContent = z12;
        this.errorStates = errorStates;
        this.isLoggedIn = z13;
        this.orderStatusCards = list;
        this.orderStatusPosition = i11;
        this.showOrderStatus = z14;
        this.productCouponButtonClicked = productCouponButtonClicked;
        this.googleAdSlot1 = c13903d;
        this.googleAdSlot2 = c13903d2;
        this.teacherListsCard = aVar2;
        this.isNewDeeplinkEnabled = z15;
        this.curatedKeys = CollectionsKt.p(e.f.b.a.f36124d, e.f.b.C0793b.f36125d, e.f.b.c.f36126d);
        this.personalizedKeys = CollectionsKt.p(e.f.a.f36123d, e.f.c.f36127d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(Ok.c cVar, EnumC14984a enumC14984a) {
        Intrinsics.j(cVar, "<unused var>");
        Intrinsics.j(enumC14984a, "<unused var>");
        return Unit.f142422a;
    }

    /* renamed from: component1, reason: from getter */
    public final HomeMperks getHomeMperksModel() {
        return this.homeMperksModel;
    }

    /* renamed from: component17, reason: from getter */
    public final MarketingBannersDecorator getMarketingBannersDecorator() {
        return this.marketingBannersDecorator;
    }

    /* renamed from: component26, reason: from getter */
    public final GoogleAdData getGoogleAdSlot1() {
        return this.googleAdSlot1;
    }

    /* renamed from: component27, reason: from getter */
    public final GoogleAdData getGoogleAdSlot2() {
        return this.googleAdSlot2;
    }

    /* renamed from: component28, reason: from getter */
    public final e.d.a getTeacherListsCard() {
        return this.teacherListsCard;
    }

    /* renamed from: component5, reason: from getter */
    public final DepartmentCarouselDecorator getShopByDepartmentsCarouselItems() {
        return this.shopByDepartmentsCarouselItems;
    }

    /* renamed from: component6, reason: from getter */
    public final DepartmentCarouselDecorator getSeasonalCarouselItems() {
        return this.seasonalCarouselItems;
    }

    /* renamed from: component7, reason: from getter */
    public final CarouselDecorator getWhiteLabelCarousel() {
        return this.whiteLabelCarousel;
    }

    /* renamed from: component9, reason: from getter */
    public final wr.f getCartInteractor() {
        return this.cartInteractor;
    }

    public final List<MarketingBanner> getBottomBannerList() {
        List<MarketingBanner> listA;
        ArrayList arrayList = new ArrayList();
        MarketingBannersDecorator aVar = this.marketingBannersDecorator;
        if (aVar != null && (listA = aVar.a()) != null) {
            if (getFirstBottomBannerPosition() == null) {
                arrayList.addAll(CollectionsKt.j0(listA, 1));
                return arrayList;
            }
            arrayList.addAll(CollectionsKt.j0(listA, 2));
        }
        return arrayList;
    }

    public final wr.f getCartInteractor() {
        return this.cartInteractor;
    }

    public final List<AbstractC14275b> getChips() {
        return this.chips;
    }

    public final List<ProductCarouselDecorator> getCuratedCarouselList() {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : this.curatedKeys) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            e.f.b bVar = (e.f.b) obj;
            CarouselDecorator c17605a = this.curatedCarousels.get(bVar);
            String strD = null;
            String strG = c17605a != null ? c17605a.getTitle() : null;
            List<ProductListDecorator> list = this.curatedProducts.get(i10);
            String strA = c17605a != null ? c17605a.getBanner() : null;
            if (c17605a != null) {
                strD = c17605a.getDeepLink();
            }
            int i12 = Bj.i.f2723c;
            mk.d dVar = null;
            arrayList.add(i10, new ProductCarouselDecorator(EnumC14984a.f140314c, new HomeViewModel.Action.FetchCuratedCarousels(bVar), strG, dVar, list, Oj.b.b(this.loadingStates, bVar.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()), strA, Integer.valueOf(i12), strD, this.isLoggedIn, this.productCouponButtonClicked, 8, null));
            i10 = i11;
        }
        return arrayList;
    }

    public final Map<e.f, CarouselDecorator> getCuratedCarousels() {
        return this.curatedCarousels;
    }

    public final List<List<ProductListDecorator>> getCuratedProducts() {
        return this.curatedProducts;
    }

    public final List<Oj.a> getErrorStates() {
        return this.errorStates;
    }

    public final GoogleAdData getGoogleAdSlot1() {
        return this.googleAdSlot1;
    }

    public final GoogleAdData getGoogleAdSlot2() {
        return this.googleAdSlot2;
    }

    public final HomeEmailBannerDecorator getHomeEmailBannerDecorator() {
        if (!this.shouldShowEmailVerificationBanner) {
            return null;
        }
        if (this.isResendEmailSuccess) {
            AbstractC5607a.Companion c0948a = AbstractC5607a.INSTANCE;
            return new HomeEmailBannerDecorator(c0948a.d(com.meijer.mobile.home.ux.r0.f98506w, new Object[0]), c0948a.d(com.meijer.mobile.home.ux.r0.f98504u, new Object[0]), C.f.m.f15519e, c0948a.d(com.meijer.mobile.home.ux.r0.f98505v, new Object[0]), false, false, 32, null);
        }
        AbstractC5607a.Companion c0948a2 = AbstractC5607a.INSTANCE;
        return new HomeEmailBannerDecorator(c0948a2.d(com.meijer.mobile.home.ux.r0.f98487d, new Object[0]), c0948a2.d(com.meijer.mobile.home.ux.r0.f98486c, new Object[0]), C.b.a.f.f15377e, c0948a2.d(com.meijer.mobile.home.ux.r0.f98502s, new Object[0]), false, false, 48, null);
    }

    public final HomeMperks getHomeMperksModel() {
        return this.homeMperksModel;
    }

    public final boolean getInLastPosition() {
        return this.orderStatusPosition == getOrderStatusItemCount();
    }

    public final HomeDecoratorListener getListener() {
        return this.listener;
    }

    public final List<Oj.a> getLoadingStates() {
        return this.loadingStates;
    }

    public final MarketingBannersDecorator getMarketingBannersDecorator() {
        return this.marketingBannersDecorator;
    }

    public final HomeMperksDecorator getMperksSection() {
        return HomeMperksDecorator.INSTANCE.a(this.homeMperksModel, Oj.b.b(this.loadingStates, HomeViewModel.MperksLoadingKey));
    }

    public final List<OrderStatusCardDecorator> getOrderStatusCards() {
        return this.orderStatusCards;
    }

    public final int getOrderStatusItemCount() {
        List<OrderStatusCardDecorator> list = this.orderStatusCards;
        return C18066d.b(list != null ? Integer.valueOf(list.size()) : null, new Function0() { // from class: com.meijer.mobile.meijer.activity.home.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(HomeDecorator._get_orderStatusItemCount_$lambda$1());
            }
        });
    }

    public final int getOrderStatusPosition() {
        return this.orderStatusPosition;
    }

    public final Map<e.f, CarouselDecorator> getPersonalizedCarousels() {
        return this.personalizedCarousels;
    }

    public final List<List<ProductListDecorator>> getPersonalizedProducts() {
        return this.personalizedProducts;
    }

    public final List<ProductCarouselDecorator> getProductCarouselList() {
        EnumC14984a enumC14984aC;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : this.personalizedKeys) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            e.f fVar = (e.f) obj;
            CarouselDecorator c17605a = this.personalizedCarousels.get(fVar);
            String strD = null;
            String strG = c17605a != null ? c17605a.getTitle() : null;
            mk.d dVar = mk.d.f150121b;
            List<ProductListDecorator> list = this.personalizedProducts.get(i10);
            Oj.a aVarB = Oj.b.b(this.loadingStates, c17605a != null ? c17605a.getKey() : null);
            HomeViewModel.Action.FetchPersonalizedCarousels fetchPersonalizedCarousels = new HomeViewModel.Action.FetchPersonalizedCarousels(fVar);
            if (this.isNewDeeplinkEnabled) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("meijerapp://plp/upc?source=personalized&id=");
                sb2.append(c17605a != null ? c17605a.getCarouselType() : null);
                strD = sb2.toString();
            } else if (c17605a != null) {
                strD = c17605a.getDeepLink();
            }
            String str = strD;
            boolean z10 = this.isLoggedIn;
            Function2<Ok.c, EnumC14984a, Unit> function2 = this.productCouponButtonClicked;
            if (c17605a == null || (enumC14984aC = c17605a.getCarouselType()) == null) {
                enumC14984aC = EnumC14984a.f140312a;
            }
            arrayList.add(i10, new ProductCarouselDecorator(enumC14984aC, fetchPersonalizedCarousels, strG, dVar, list, aVarB, null, null, str, z10, function2, 192, null));
            i10 = i11;
        }
        return arrayList;
    }

    public final Function2<Ok.c, EnumC14984a, Unit> getProductCouponButtonClicked() {
        return this.productCouponButtonClicked;
    }

    public final DepartmentCarouselDecorator getSeasonalCarouselItems() {
        return this.seasonalCarouselItems;
    }

    public final DepartmentCarouselDecorator getShopByDepartmentsCarouselItems() {
        return this.shopByDepartmentsCarouselItems;
    }

    public final boolean getShouldShowEmailVerificationBanner() {
        return this.shouldShowEmailVerificationBanner;
    }

    public final boolean getShowOrderStatus() {
        return this.showOrderStatus;
    }

    public final SpecialOffersCarouselDecorator getSpecialOffersCarousel() {
        AbstractC5607a abstractC5607aD = AbstractC5607a.INSTANCE.d(com.meijer.mobile.home.ux.r0.f98508y, Integer.valueOf(this.totalSpecialOffersCount));
        List listB1 = CollectionsKt.b1(this.specialOffersList, 3);
        MarketingBannersDecorator aVar = this.marketingBannersDecorator;
        return new SpecialOffersCarouselDecorator(abstractC5607aD, null, listB1, aVar != null ? aVar.getSpecialOffersBanner() : null, Integer.valueOf(Bj.i.f2754j2), Oj.b.b(this.loadingStates, HomeViewModel.SpecialOffersLoadingKey), this.totalSpecialOffersCount, 2, null);
    }

    public final List<SpecialOffer> getSpecialOffersList() {
        return this.specialOffersList;
    }

    public final e.d.a getTeacherListsCard() {
        return this.teacherListsCard;
    }

    public final int getTotalSpecialOffersCount() {
        return this.totalSpecialOffersCount;
    }

    public final ProductCarouselDecorator getWhiteLabel() {
        CarouselDecorator c17605a = this.whiteLabelCarousel;
        String strD = null;
        String strG = c17605a != null ? c17605a.getTitle() : null;
        List<ProductListDecorator> list = this.whiteLabelProducts;
        String strA = c17605a != null ? c17605a.getBanner() : null;
        if (this.isNewDeeplinkEnabled) {
            strD = "meijerapp://plp/upc?source=personalized&id=meijerRecommendations";
        } else if (c17605a != null) {
            strD = c17605a.getDeepLink();
        }
        String str = strD;
        int i10 = Bj.i.f2723c;
        List<Oj.a> list2 = this.loadingStates;
        e.f.d.a aVar = e.f.d.a.f36129e;
        return new ProductCarouselDecorator(EnumC14984a.f140314c, new HomeViewModel.Action.FetchCuratedCarousels(aVar), strG, null, list, Oj.b.b(list2, aVar.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()), strA, Integer.valueOf(i10), str, this.isLoggedIn, this.productCouponButtonClicked, 8, null);
    }

    public final CarouselDecorator getWhiteLabelCarousel() {
        return this.whiteLabelCarousel;
    }

    public final List<ProductListDecorator> getWhiteLabelProducts() {
        return this.whiteLabelProducts;
    }

    public final boolean isLoadingContent() {
        return this.isLoadingContent;
    }

    public final boolean isLoggedIn() {
        return this.isLoggedIn;
    }

    public final boolean isNewDeeplinkEnabled() {
        return this.isNewDeeplinkEnabled;
    }

    public final boolean isResendEmailSuccess() {
        return this.isResendEmailSuccess;
    }

    public final void setOrderStatusPosition(int i10) {
        this.orderStatusPosition = i10;
    }

    public /* synthetic */ HomeDecorator(HomeMperks bVar, List list, List list2, List list3, DepartmentCarouselDecorator c13566c, DepartmentCarouselDecorator c13566c2, CarouselDecorator c17605a, List list4, wr.f fVar, List list5, List list6, Map map, Map map2, int i10, boolean z10, boolean z11, MarketingBannersDecorator aVar, HomeDecoratorListener homeDecoratorListener, boolean z12, List list7, boolean z13, List list8, int i11, boolean z14, Function2 function2, GoogleAdData c13903d, GoogleAdData c13903d2, e.d.a aVar2, boolean z15, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : bVar, (i12 & 2) != 0 ? C14274a.INSTANCE.a() : list, (i12 & 4) != 0 ? CollectionsKt.m() : list2, (i12 & 8) != 0 ? CollectionsKt.m() : list3, (i12 & 16) != 0 ? null : c13566c, (i12 & 32) != 0 ? null : c13566c2, (i12 & 64) != 0 ? null : c17605a, (i12 & 128) != 0 ? CollectionsKt.m() : list4, (i12 & 256) != 0 ? null : fVar, (i12 & 512) != 0 ? CollectionsKt.p(CollectionsKt.m(), CollectionsKt.m(), CollectionsKt.m()) : list5, (i12 & 1024) != 0 ? CollectionsKt.p(CollectionsKt.m(), CollectionsKt.m(), CollectionsKt.m()) : list6, (i12 & RecyclerView.m.FLAG_MOVED) != 0 ? MapsKt.k() : map, (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? MapsKt.k() : map2, (i12 & 8192) != 0 ? 0 : i10, (i12 & 16384) != 0 ? false : z10, (i12 & 32768) != 0 ? false : z11, (i12 & 65536) != 0 ? null : aVar, (i12 & 131072) != 0 ? null : homeDecoratorListener, (i12 & 262144) != 0 ? false : z12, (i12 & 524288) != 0 ? CollectionsKt.m() : list7, (i12 & 1048576) != 0 ? true : z13, (i12 & 2097152) != 0 ? CollectionsKt.m() : list8, (i12 & 4194304) != 0 ? 1 : i11, (i12 & 8388608) != 0 ? false : z14, (i12 & 16777216) != 0 ? new Function2() { // from class: com.meijer.mobile.meijer.activity.home.s
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return HomeDecorator._init_$lambda$0((Ok.c) obj, (EnumC14984a) obj2);
            }
        } : function2, (i12 & 33554432) != 0 ? null : c13903d, (i12 & 67108864) != 0 ? null : c13903d2, (i12 & 134217728) != 0 ? null : aVar2, (i12 & 268435456) != 0 ? false : z15);
    }
}
