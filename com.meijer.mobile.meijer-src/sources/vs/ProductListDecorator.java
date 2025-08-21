package vs;

import Co.Image;
import Co.ProductFullDetails;
import Fq.ShoppingListItem;
import Gp.ProductRatings;
import Ho.ProductSponsorship;
import Ho.SponsoredData;
import Hr.CouponCountDownStateDecorator;
import Pk.Coupon;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import fj.Entry;
import io.constructor.data.local.PreferencesHelper;
import j$.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import nk.InterfaceC15960a;
import ts.ProductCardDecorator;
import us.C17456B;
import us.C17457C;
import vs.ProductLocationDecorator;
import wk.C17898a;
import wl.CartEntry;
import wl.ProductEligibility;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\bW\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 S2\u00020\u0001:\u0002ROB»\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010$\u001a\u00020#\u0012\b\b\u0002\u0010%\u001a\u00020#\u0012\b\b\u0002\u0010&\u001a\u00020\u0004\u0012\b\b\u0002\u0010'\u001a\u00020\u0004\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010/\u001a\u00020\u0004\u0012\b\b\u0002\u00100\u001a\u00020\u0004\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103\u0012\b\b\u0002\u00105\u001a\u00020\u0004\u0012\b\b\u0002\u00106\u001a\u00020\u001b\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u00108\u001a\u00020\u0004\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b:\u0010;J\u0015\u0010=\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u0000¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u00042\b\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\bA\u0010BJ\r\u0010D\u001a\u00020C¢\u0006\u0004\bD\u0010EJÐ\u0003\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u00132\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020\u00042\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010/\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020\u00042\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\n\b\u0002\u00104\u001a\u0004\u0018\u0001032\b\b\u0002\u00105\u001a\u00020\u00042\b\b\u0002\u00106\u001a\u00020\u001b2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u00108\u001a\u00020\u00042\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\bJ\u0010KJ\u001a\u0010M\u001a\u00020\u00042\b\u0010<\u001a\u0004\u0018\u00010LHÖ\u0003¢\u0006\u0004\bM\u0010NR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010IR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010P\u001a\u0004\bW\u0010IR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010P\u001a\u0004\bY\u0010IR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bZ\u0010S\u001a\u0004\b[\u0010UR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bd\u0010P\u001a\u0004\bZ\u0010IR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\be\u0010P\u001a\u0004\bf\u0010IR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bg\u0010P\u001a\u0004\bh\u0010IR\u001a\u0010\u0010\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bi\u0010S\u001a\u0004\bj\u0010UR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bk\u0010S\u001a\u0004\bl\u0010UR\u001a\u0010\u0012\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010S\u001a\u0004\bn\u0010UR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\bs\u0010p\u001a\u0004\bt\u0010rR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bu\u0010p\u001a\u0004\bv\u0010rR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\bt\u0010p\u001a\u0004\bR\u0010rR\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bw\u0010p\u001a\u0004\bx\u0010rR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bj\u0010p\u001a\u0004\by\u0010rR\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bz\u0010S\u001a\u0004\b\u001a\u0010UR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bF\u0010x\u001a\u0004\b{\u0010KR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007fR\u001d\u0010 \u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0005\bm\u0010\u0082\u0001R\u001b\u0010\"\u001a\u00020!8\u0006¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001b\u0010$\u001a\u00020#8\u0006¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001d\u0010%\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u008a\u0001\u0010\u0087\u0001\u001a\u0005\bX\u0010\u0089\u0001R\u0019\u0010&\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010S\u001a\u0005\b\u008c\u0001\u0010UR\u001a\u0010'\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b{\u0010S\u001a\u0004\bk\u0010UR\u001c\u0010)\u001a\u0004\u0018\u00010(8\u0006¢\u0006\u000f\n\u0005\bn\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001e\u0010+\u001a\u0004\u0018\u00010*8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bq\u0010\u0090\u0001\u001a\u0005\bz\u0010\u0091\u0001R\u001d\u0010-\u001a\u0004\u0018\u00010,8\u0006¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u0092\u0001\u001a\u0006\b\u008b\u0001\u0010\u0093\u0001R\u001b\u0010.\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010p\u001a\u0005\b\u008a\u0001\u0010rR\u0019\u0010/\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010S\u001a\u0005\b\u0096\u0001\u0010UR\u0018\u00100\u001a\u00020\u00048\u0006¢\u0006\r\n\u0005\b\u0097\u0001\u0010S\u001a\u0004\b0\u0010UR\u001c\u00102\u001a\u0004\u0018\u0001018\u0006¢\u0006\u000f\n\u0005\bx\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001c\u00104\u001a\u0004\u0018\u0001038\u0006¢\u0006\u000f\n\u0005\b~\u0010\u009b\u0001\u001a\u0006\b\u0095\u0001\u0010\u009c\u0001R\u0019\u00105\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010S\u001a\u0005\b\u009d\u0001\u0010UR\u0018\u00106\u001a\u00020\u001b8\u0006¢\u0006\r\n\u0004\bl\u0010x\u001a\u0005\b\u0097\u0001\u0010KR\u001d\u00107\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\r\n\u0005\b\u0099\u0001\u0010p\u001a\u0004\b`\u0010rR\u001a\u00108\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bf\u0010S\u001a\u0004\bg\u0010UR\u001c\u00109\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010p\u001a\u0004\bV\u0010rR\u001b\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\r\n\u0004\bv\u0010p\u001a\u0005\b\u0094\u0001\u0010rR\u001c\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010p\u001a\u0005\b\u0080\u0001\u0010rR\u001b\u0010 \u0001\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010S\u001a\u0004\bi\u0010UR\u001e\u0010¢\u0001\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\r\n\u0005\b¡\u0001\u0010p\u001a\u0004\bO\u0010rR\u001b\u0010£\u0001\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010S\u001a\u0004\b\\\u0010UR\u001d\u0010¦\u0001\u001a\u00030¤\u00018\u0016X\u0096\u0004¢\u0006\r\n\u0004\bT\u0010q\u001a\u0005\be\u0010¥\u0001R\u001b\u0010§\u0001\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010S\u001a\u0004\bw\u0010UR!\u0010¬\u0001\u001a\u0005\u0018\u00010¨\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0005\bu\u0010«\u0001R!\u0010±\u0001\u001a\u0005\u0018\u00010\u00ad\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0005\bd\u0010°\u0001R\u001c\u0010´\u0001\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\u000e\n\u0005\b²\u0001\u0010p\u001a\u0005\b³\u0001\u0010rR\u0015\u0010µ\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010UR\u0015\u0010¶\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010UR\u0013\u0010·\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010UR\u0016\u0010¸\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010U¨\u0006¹\u0001"}, d2 = {"Lvs/f;", "Lvs/c;", "", PreferencesHelper.PREF_ID, "", "isSelected", "upc", "title", "hasUnsavedShoppingListItem", "", "listItemId", "Lnk/g;", "thumbnail", "thumbnailUrl", "thumbnailDescription", "department", "isOnSale", "showWeightInfo", "hasMPerksOffers", "Lbk/a;", "currentPrice", "regularPrice", "weightUnitSizeAndPrice", "amountSaved", "quantityText", "priceGoodThroughDate", "isAddedToShoppingList", "", "errorImageResource", "LFq/c;", "shoppingListItem", "LCo/h;", "product", "Lvs/f$a;", "cartEntry", "Lwl/b$a;", "storeAvailability", "cartEligibility", "inQtyStepperInteraction", "resetStepperState", "LQo/l;", "productQuery", "LHr/e;", "couponCountDownStateDecorator", "LPk/a;", "coupon", "complexPromo", "isBuyAgain", "isBopas", "LHo/a;", "sponsorship", "LGp/c;", "productRatings", "showQuantityRequested", "quantityRequested", "currentPriceDescription", "productContainsTag", "regularPriceDescription", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Lnk/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;ZILFq/c;LCo/h;Lvs/f$a;Lwl/b$a;Lwl/b$a;ZZLQo/l;LHr/e;LPk/a;Lbk/a;ZZLHo/a;LGp/c;ZILbk/a;ZLbk/a;)V", "other", "T", "(Lvs/f;)Z", "Lvs/b;", "itemToSubstitute", "R", "(Lvs/b;)Z", "Lts/a;", "V", "()Lts/a;", "u", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Lnk/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;Lbk/a;ZILFq/c;LCo/h;Lvs/f$a;Lwl/b$a;Lwl/b$a;ZZLQo/l;LHr/e;LPk/a;Lbk/a;ZZLHo/a;LGp/c;ZILbk/a;ZLbk/a;)Lvs/f;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Z", "U", "()Z", "c", "O", "d", "getTitle", "e", "getHasUnsavedShoppingListItem", "f", "Ljava/lang/Long;", "getListItemId", "()Ljava/lang/Long;", "g", "Lnk/g;", "getThumbnail", "()Lnk/g;", "h", "i", "N", "j", "getDepartment", "k", "s", "l", "L", "m", "C", "n", "Lbk/a;", "D", "()Lbk/a;", "o", "q", "p", "P", "r", "I", "getPriceGoodThroughDate", "t", "B", "v", "LFq/c;", "J", "()LFq/c;", "w", "LCo/h;", "()LCo/h;", "x", "Lvs/f$a;", "y", "()Lvs/f$a;", "Lwl/b$a;", "getStoreAvailability", "()Lwl/b$a;", "z", "A", "E", "LQo/l;", "getProductQuery", "()LQo/l;", "LHr/e;", "()LHr/e;", "LPk/a;", "()LPk/a;", "F", "G", "Q", "H", "LHo/a;", "M", "()LHo/a;", "LGp/c;", "()LGp/c;", "K", "location", "availabilityStatus", "hasDeposit", "S", "weight", "shouldShowWeight", "", "()D", "actualQuantity", "inQtyStepperTransition", "LPk/c;", "W", "LPk/c;", "()LPk/c;", "couponIdentity", "LHo/c;", "X", "LHo/c;", "()LHo/c;", "criteoInfo", "Y", "getCartEligibilityStatus", "cartEligibilityStatus", "isEligibleForCart", "isOutOfStock", "isInStoreOnly", "isLowStock", "products_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: vs.f, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class ProductListDecorator implements InterfaceC17723c {

    /* renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a0, reason: collision with root package name */
    public static final int f166221a0 = 8;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean inQtyStepperInteraction;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean resetStepperState;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
    private final Qo.l productQuery;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
    private final CouponCountDownStateDecorator couponCountDownStateDecorator;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
    private final Coupon coupon;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a complexPromo;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isBuyAgain;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isBopas;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductSponsorship sponsorship;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductRatings productRatings;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showQuantityRequested;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata and from toString */
    private final int quantityRequested;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a currentPriceDescription;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean productContainsTag;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a regularPriceDescription;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6392a location;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6392a availabilityStatus;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private final boolean hasDeposit;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6392a weight;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldShowWeight;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final double actualQuantity;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    private final boolean inQtyStepperTransition;

    /* renamed from: W, reason: collision with root package name and from kotlin metadata */
    private final Pk.c couponIdentity;

    /* renamed from: X, reason: collision with root package name and from kotlin metadata */
    private final SponsoredData criteoInfo;

    /* renamed from: Y, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6392a cartEligibilityStatus;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSelected;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String upc;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasUnsavedShoppingListItem;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long listItemId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.g thumbnail;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String thumbnailUrl;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String thumbnailDescription;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String department;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOnSale;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showWeightInfo;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasMPerksOffers;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a currentPrice;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a regularPrice;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a weightUnitSizeAndPrice;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a amountSaved;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a quantityText;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a priceGoodThroughDate;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAddedToShoppingList;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final int errorImageResource;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final ShoppingListItem shoppingListItem;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductFullDetails product;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final CartEntryDecorator cartEntry;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductEligibility.a storeAvailability;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductEligibility.a cartEligibility;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u001f¨\u0006\""}, d2 = {"Lvs/f$a;", "Landroid/os/Parcelable;", "", "Lcom/meijer/mobile/cart/model/common/EntryNumber;", "entryNumber", "", "actualQuantity", "qtyIncrement", "<init>", "(IDD)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "D", "()D", "c", "r2", "products_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vs.f$a, reason: from toString */
    public static final /* data */ class CartEntryDecorator implements Parcelable {
        public static final Parcelable.Creator<CartEntryDecorator> CREATOR = new C2631a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int entryNumber;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final double actualQuantity;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final double qtyIncrement;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: vs.f$a$a, reason: collision with other inner class name */
        public static final class C2631a implements Parcelable.Creator<CartEntryDecorator> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CartEntryDecorator createFromParcel(Parcel parcel) {
                Intrinsics.j(parcel, "parcel");
                return new CartEntryDecorator(parcel.readInt(), parcel.readDouble(), parcel.readDouble());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CartEntryDecorator[] newArray(int i10) {
                return new CartEntryDecorator[i10];
            }
        }

        public CartEntryDecorator() {
            this(0, 0.0d, 0.0d, 7, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CartEntryDecorator)) {
                return false;
            }
            CartEntryDecorator cartEntryDecorator = (CartEntryDecorator) other;
            return this.entryNumber == cartEntryDecorator.entryNumber && Double.compare(this.actualQuantity, cartEntryDecorator.actualQuantity) == 0 && Double.compare(this.qtyIncrement, cartEntryDecorator.qtyIncrement) == 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.j(dest, "dest");
            dest.writeInt(this.entryNumber);
            dest.writeDouble(this.actualQuantity);
            dest.writeDouble(this.qtyIncrement);
        }

        public CartEntryDecorator(int i10, double d10, double d11) {
            this.entryNumber = i10;
            this.actualQuantity = d10;
            this.qtyIncrement = d11;
        }

        /* renamed from: a, reason: from getter */
        public final double getActualQuantity() {
            return this.actualQuantity;
        }

        /* renamed from: b, reason: from getter */
        public final int getEntryNumber() {
            return this.entryNumber;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.entryNumber) * 31) + Double.hashCode(this.actualQuantity)) * 31) + Double.hashCode(this.qtyIncrement);
        }

        /* renamed from: r2, reason: from getter */
        public final double getQtyIncrement() {
            return this.qtyIncrement;
        }

        public String toString() {
            return "CartEntryDecorator(entryNumber=" + this.entryNumber + ", actualQuantity=" + this.actualQuantity + ", qtyIncrement=" + this.qtyIncrement + ')';
        }

        public /* synthetic */ CartEntryDecorator(int i10, double d10, double d11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? -1 : i10, (i11 & 2) != 0 ? 0.0d : d10, (i11 & 4) != 0 ? 1.0d : d11);
        }
    }

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J½\u0001\u0010!\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\f2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u001e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u001e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b%\u0010$¨\u0006&"}, d2 = {"Lvs/f$b;", "", "<init>", "()V", "LCo/h;", "product", "LFq/c;", "shoppingListItem", "Lfj/i;", "cartEntry", "Lwl/a;", "otherCartEntry", "", "inQtyStepperInteraction", "Lwl/b$a;", "storeAvailability", "cartEligibility", "resetStepperState", "LQo/l;", "productQuery", "LHr/e;", "couponCountDownStateDecorator", "LPk/a;", "coupon", "isBuyAgain", "LHo/a;", "sponsorship", "LGp/c;", "productRatings", "showQuantityRequested", "", "quantityRequested", "Lvs/f;", "a", "(LCo/h;LFq/c;Lfj/i;Lwl/a;ZLwl/b$a;Lwl/b$a;ZLQo/l;LHr/e;LPk/a;ZLHo/a;LGp/c;ZI)Lvs/f;", "FIRST_INSERT_INDEX", "I", "SECOND_INSERT_INDEX", "products_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: vs.f$b, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: vs.f$b$a */
        public static final class a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return ComparisonsKt.d(Boolean.valueOf(((nk.g) t10).z()), Boolean.valueOf(((nk.g) t11).z()));
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: vs.f$b$b, reason: collision with other inner class name */
        public static final class C2632b<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return ComparisonsKt.d(Integer.valueOf(((Image) t10).f()), Integer.valueOf(((Image) t11).f()));
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: vs.f$b$c */
        public static final class c<T> implements Comparator {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Comparator f166276a;

            public c(Comparator comparator) {
                this.f166276a = comparator;
            }

            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                int iCompare = this.f166276a.compare(t10, t11);
                return iCompare != 0 ? iCompare : ComparisonsKt.d(((nk.g) t10).Z0(), ((nk.g) t11).Z0());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @JvmOverloads
        public final ProductListDecorator a(ProductFullDetails product, ShoppingListItem shoppingListItem, Entry cartEntry, CartEntry otherCartEntry, boolean inQtyStepperInteraction, ProductEligibility.a storeAvailability, ProductEligibility.a cartEligibility, boolean resetStepperState, Qo.l productQuery, CouponCountDownStateDecorator couponCountDownStateDecorator, Coupon coupon, boolean isBuyAgain, ProductSponsorship sponsorship, ProductRatings productRatings, boolean showQuantityRequested, int quantityRequested) {
            Image eVar;
            boolean z10;
            String str;
            boolean z11;
            Image eVar2;
            ProductPriceDecorator c17733m;
            AbstractC6392a abstractC6392aA;
            AbstractC6392a abstractC6392a;
            String str2;
            AbstractC6392a abstractC6392aD;
            OffsetDateTime offsetDateTimeK0;
            Intrinsics.j(product, "product");
            Intrinsics.j(storeAvailability, "storeAvailability");
            Intrinsics.j(cartEligibility, "cartEligibility");
            List<Image> listJ = product.j();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listJ) {
                if (((Image) obj).h()) {
                    arrayList.add(obj);
                }
            }
            List listZ0 = CollectionsKt.Z0(CollectionsKt.Z0(arrayList, new c(new a())), new C2632b());
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : listZ0) {
                if (((Image) obj2).f() <= 200) {
                    arrayList2.add(obj2);
                } else {
                    arrayList3.add(obj2);
                }
            }
            Pair pair = new Pair(arrayList2, arrayList3);
            List list = (List) pair.a();
            List list2 = (List) pair.b();
            Image eVarJ = (Image) CollectionsKt.F0(list);
            if (eVarJ != null) {
                eVar = eVarJ;
            } else {
                Image eVar3 = (Image) CollectionsKt.u0(list2);
                if (eVar3 != null) {
                    eVarJ = eVar3.j(HttpResponseStatus.SUCCESS_OK);
                    eVar = eVarJ;
                } else {
                    eVar = null;
                }
            }
            ProductPriceDecorator c17733m2 = new ProductPriceDecorator(product, false, 0.0d, 6, null);
            ShoppingListItem cVar = (shoppingListItem == null || shoppingListItem.getIsComplete()) ? null : shoppingListItem;
            boolean z12 = product.getStockInfo().e() || product.getStockInfo().c() || product.getIsAgeRestricted() || product.getHasMPerksOffers();
            String string = UUID.randomUUID().toString();
            Intrinsics.i(string, "toString(...)");
            String code = product.getCode();
            boolean z13 = false;
            String name = product.getName();
            if (cVar == null || cVar.getListItemId() != 0) {
                z10 = false;
            } else {
                z10 = false;
                z13 = true;
            }
            Long lValueOf = cVar != null ? Long.valueOf(cVar.getListItemId()) : null;
            String url = eVar != null ? eVar.getUrl() : null;
            String strE0 = eVar != null ? eVar.getAltText() : null;
            boolean z14 = z10;
            Long l10 = lValueOf;
            String department = product.getDepartment();
            if (product.getDiscount() == null || product.getDiscountedPrice() == null || product.getIsMap()) {
                str = url;
                z11 = z14;
            } else {
                str = url;
                z11 = true;
            }
            String str3 = strE0;
            boolean zW = c17733m2.getIsEstimatedUnitPrice();
            boolean hasMPerksOffers = product.getHasMPerksOffers();
            AbstractC6392a abstractC6392aH = c17733m2.h();
            AbstractC6392a abstractC6392aS = c17733m2.getRegularPrice();
            AbstractC6392a abstractC6392aP = c17733m2.p();
            AbstractC6392a abstractC6392aJ = c17733m2.j();
            if (product.getQuantity() > 0) {
                eVar2 = eVar;
                c17733m = c17733m2;
                abstractC6392aA = AbstractC6392a.INSTANCE.d(C17457C.f164394M, Integer.valueOf(product.getQuantity()));
            } else {
                eVar2 = eVar;
                c17733m = c17733m2;
                abstractC6392aA = AbstractC6392a.INSTANCE.a();
            }
            InterfaceC15960a discount = product.getDiscount();
            if (discount == null || (offsetDateTimeK0 = discount.getPriceGoodThrough()) == null) {
                abstractC6392a = abstractC6392aA;
                str2 = string;
                abstractC6392aD = null;
            } else {
                abstractC6392a = abstractC6392aA;
                str2 = string;
                abstractC6392aD = AbstractC6392a.INSTANCE.d(C17457C.f164401T, offsetDateTimeK0.format(C17898a.DATE_SLASHES_SHORT));
            }
            boolean z15 = cVar != null ? true : z14;
            ProductPriceDecorator c17733m3 = c17733m;
            int i10 = C17456B.f164381a;
            CartEntryDecorator cartEntryDecorator = new CartEntryDecorator(otherCartEntry != null ? otherCartEntry.getEntryNumber() : -1, otherCartEntry != null ? otherCartEntry.getQuantity() : 0.0d, product.getQtyIncrement());
            Qo.l lVarG = productQuery != null ? productQuery.g() : null;
            String promoText = product.getPromoText();
            return new ProductListDecorator(str2, false, code, name, z13, l10, eVar2, str, str3, department, z11, zW, hasMPerksOffers, abstractC6392aH, abstractC6392aS, abstractC6392aP, abstractC6392aJ, abstractC6392a, abstractC6392aD, z15, i10, cVar, product, cartEntryDecorator, storeAvailability, cartEligibility, inQtyStepperInteraction, resetStepperState, lVarG, couponCountDownStateDecorator, coupon, promoText != null ? AbstractC6392a.INSTANCE.c(promoText) : null, isBuyAgain, product.getIsBopas(), sponsorship, productRatings, showQuantityRequested, quantityRequested, c17733m3.c(), z12, c17733m3.t());
        }

        private Companion() {
        }

        public static /* synthetic */ ProductListDecorator b(Companion companion, ProductFullDetails productFullDetails, ShoppingListItem cVar, Entry entry, CartEntry c17900a, boolean z10, ProductEligibility.a aVar, ProductEligibility.a aVar2, boolean z11, Qo.l lVar, CouponCountDownStateDecorator eVar, Coupon coupon, boolean z12, ProductSponsorship aVar3, ProductRatings cVar2, boolean z13, int i10, int i11, Object obj) {
            ShoppingListItem cVar3 = (i11 & 2) != 0 ? null : cVar;
            Entry entry2 = (i11 & 4) != 0 ? null : entry;
            return companion.a(productFullDetails, cVar3, entry2, (i11 & 8) != 0 ? entry2 != null ? CartEntry.INSTANCE.a(entry2) : null : c17900a, (i11 & 16) != 0 ? false : z10, (i11 & 32) != 0 ? ProductEligibility.a.e.f167273a : aVar, (i11 & 64) != 0 ? ProductEligibility.a.e.f167273a : aVar2, (i11 & 128) != 0 ? false : z11, (i11 & 256) != 0 ? null : lVar, (i11 & 512) != 0 ? null : eVar, (i11 & 1024) != 0 ? null : coupon, (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? false : z12, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : aVar3, (i11 & 8192) == 0 ? cVar2 : null, (i11 & 16384) != 0 ? false : z13, (i11 & 32768) != 0 ? 0 : i10);
        }
    }

    public ProductListDecorator(String id2, boolean z10, String upc, String title, boolean z11, Long l10, nk.g gVar, String str, String str2, String str3, boolean z12, boolean z13, boolean z14, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, AbstractC6392a abstractC6392a4, AbstractC6392a quantityText, AbstractC6392a abstractC6392a5, boolean z15, int i10, ShoppingListItem cVar, ProductFullDetails product, CartEntryDecorator cartEntry, ProductEligibility.a storeAvailability, ProductEligibility.a cartEligibility, boolean z16, boolean z17, Qo.l lVar, CouponCountDownStateDecorator eVar, Coupon coupon, AbstractC6392a abstractC6392a6, boolean z18, boolean z19, ProductSponsorship aVar, ProductRatings cVar2, boolean z20, int i11, AbstractC6392a abstractC6392a7, boolean z21, AbstractC6392a abstractC6392a8) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(upc, "upc");
        Intrinsics.j(title, "title");
        Intrinsics.j(quantityText, "quantityText");
        Intrinsics.j(product, "product");
        Intrinsics.j(cartEntry, "cartEntry");
        Intrinsics.j(storeAvailability, "storeAvailability");
        Intrinsics.j(cartEligibility, "cartEligibility");
        this.id = id2;
        this.isSelected = z10;
        this.upc = upc;
        this.title = title;
        this.hasUnsavedShoppingListItem = z11;
        this.listItemId = l10;
        this.thumbnail = gVar;
        this.thumbnailUrl = str;
        this.thumbnailDescription = str2;
        this.department = str3;
        this.isOnSale = z12;
        this.showWeightInfo = z13;
        this.hasMPerksOffers = z14;
        this.currentPrice = abstractC6392a;
        this.regularPrice = abstractC6392a2;
        this.weightUnitSizeAndPrice = abstractC6392a3;
        this.amountSaved = abstractC6392a4;
        this.quantityText = quantityText;
        this.priceGoodThroughDate = abstractC6392a5;
        this.isAddedToShoppingList = z15;
        this.errorImageResource = i10;
        this.shoppingListItem = cVar;
        this.product = product;
        this.cartEntry = cartEntry;
        this.storeAvailability = storeAvailability;
        this.cartEligibility = cartEligibility;
        this.inQtyStepperInteraction = z16;
        this.resetStepperState = z17;
        this.productQuery = lVar;
        this.couponCountDownStateDecorator = eVar;
        this.coupon = coupon;
        this.complexPromo = abstractC6392a6;
        this.isBuyAgain = z18;
        this.isBopas = z19;
        this.sponsorship = aVar;
        this.productRatings = cVar2;
        this.showQuantityRequested = z20;
        this.quantityRequested = i11;
        this.currentPriceDescription = abstractC6392a7;
        this.productContainsTag = z21;
        this.regularPriceDescription = abstractC6392a8;
        ProductLocationDecorator productLocationDecoratorB = ProductLocationDecorator.Companion.b(ProductLocationDecorator.INSTANCE, getProduct(), null, 2, null);
        this.location = productLocationDecoratorB != null ? productLocationDecoratorB.getDisplayLocation() : null;
        this.availabilityStatus = C17725e.a(storeAvailability);
        this.hasDeposit = getProduct().getDepositPrice() != null;
        this.weight = abstractC6392a3;
        this.shouldShowWeight = z13;
        this.actualQuantity = cartEntry.getActualQuantity();
        this.inQtyStepperTransition = z16;
        this.cartEligibilityStatus = C17725e.a(getCartEligibility());
    }

    public final boolean R(CartProductListDecorator itemToSubstitute) {
        ProductFullDetails productFullDetailsK;
        return (itemToSubstitute == null || (productFullDetailsK = itemToSubstitute.getProduct()) == null || !productFullDetailsK.getIsAlcohol()) ? o() && !getProduct().getIsAlcohol() : o();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductListDecorator)) {
            return false;
        }
        ProductListDecorator productListDecorator = (ProductListDecorator) other;
        return Intrinsics.e(this.id, productListDecorator.id) && this.isSelected == productListDecorator.isSelected && Intrinsics.e(this.upc, productListDecorator.upc) && Intrinsics.e(this.title, productListDecorator.title) && this.hasUnsavedShoppingListItem == productListDecorator.hasUnsavedShoppingListItem && Intrinsics.e(this.listItemId, productListDecorator.listItemId) && Intrinsics.e(this.thumbnail, productListDecorator.thumbnail) && Intrinsics.e(this.thumbnailUrl, productListDecorator.thumbnailUrl) && Intrinsics.e(this.thumbnailDescription, productListDecorator.thumbnailDescription) && Intrinsics.e(this.department, productListDecorator.department) && this.isOnSale == productListDecorator.isOnSale && this.showWeightInfo == productListDecorator.showWeightInfo && this.hasMPerksOffers == productListDecorator.hasMPerksOffers && Intrinsics.e(this.currentPrice, productListDecorator.currentPrice) && Intrinsics.e(this.regularPrice, productListDecorator.regularPrice) && Intrinsics.e(this.weightUnitSizeAndPrice, productListDecorator.weightUnitSizeAndPrice) && Intrinsics.e(this.amountSaved, productListDecorator.amountSaved) && Intrinsics.e(this.quantityText, productListDecorator.quantityText) && Intrinsics.e(this.priceGoodThroughDate, productListDecorator.priceGoodThroughDate) && this.isAddedToShoppingList == productListDecorator.isAddedToShoppingList && this.errorImageResource == productListDecorator.errorImageResource && Intrinsics.e(this.shoppingListItem, productListDecorator.shoppingListItem) && Intrinsics.e(this.product, productListDecorator.product) && Intrinsics.e(this.cartEntry, productListDecorator.cartEntry) && Intrinsics.e(this.storeAvailability, productListDecorator.storeAvailability) && Intrinsics.e(this.cartEligibility, productListDecorator.cartEligibility) && this.inQtyStepperInteraction == productListDecorator.inQtyStepperInteraction && this.resetStepperState == productListDecorator.resetStepperState && Intrinsics.e(this.productQuery, productListDecorator.productQuery) && Intrinsics.e(this.couponCountDownStateDecorator, productListDecorator.couponCountDownStateDecorator) && Intrinsics.e(this.coupon, productListDecorator.coupon) && Intrinsics.e(this.complexPromo, productListDecorator.complexPromo) && this.isBuyAgain == productListDecorator.isBuyAgain && this.isBopas == productListDecorator.isBopas && Intrinsics.e(this.sponsorship, productListDecorator.sponsorship) && Intrinsics.e(this.productRatings, productListDecorator.productRatings) && this.showQuantityRequested == productListDecorator.showQuantityRequested && this.quantityRequested == productListDecorator.quantityRequested && Intrinsics.e(this.currentPriceDescription, productListDecorator.currentPriceDescription) && this.productContainsTag == productListDecorator.productContainsTag && Intrinsics.e(this.regularPriceDescription, productListDecorator.regularPriceDescription);
    }

    public final ProductListDecorator u(String id2, boolean isSelected, String upc, String title, boolean hasUnsavedShoppingListItem, Long listItemId, nk.g thumbnail, String thumbnailUrl, String thumbnailDescription, String department, boolean isOnSale, boolean showWeightInfo, boolean hasMPerksOffers, AbstractC6392a currentPrice, AbstractC6392a regularPrice, AbstractC6392a weightUnitSizeAndPrice, AbstractC6392a amountSaved, AbstractC6392a quantityText, AbstractC6392a priceGoodThroughDate, boolean isAddedToShoppingList, int errorImageResource, ShoppingListItem shoppingListItem, ProductFullDetails product, CartEntryDecorator cartEntry, ProductEligibility.a storeAvailability, ProductEligibility.a cartEligibility, boolean inQtyStepperInteraction, boolean resetStepperState, Qo.l productQuery, CouponCountDownStateDecorator couponCountDownStateDecorator, Coupon coupon, AbstractC6392a complexPromo, boolean isBuyAgain, boolean isBopas, ProductSponsorship sponsorship, ProductRatings productRatings, boolean showQuantityRequested, int quantityRequested, AbstractC6392a currentPriceDescription, boolean productContainsTag, AbstractC6392a regularPriceDescription) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(upc, "upc");
        Intrinsics.j(title, "title");
        Intrinsics.j(quantityText, "quantityText");
        Intrinsics.j(product, "product");
        Intrinsics.j(cartEntry, "cartEntry");
        Intrinsics.j(storeAvailability, "storeAvailability");
        Intrinsics.j(cartEligibility, "cartEligibility");
        return new ProductListDecorator(id2, isSelected, upc, title, hasUnsavedShoppingListItem, listItemId, thumbnail, thumbnailUrl, thumbnailDescription, department, isOnSale, showWeightInfo, hasMPerksOffers, currentPrice, regularPrice, weightUnitSizeAndPrice, amountSaved, quantityText, priceGoodThroughDate, isAddedToShoppingList, errorImageResource, shoppingListItem, product, cartEntry, storeAvailability, cartEligibility, inQtyStepperInteraction, resetStepperState, productQuery, couponCountDownStateDecorator, coupon, complexPromo, isBuyAgain, isBopas, sponsorship, productRatings, showQuantityRequested, quantityRequested, currentPriceDescription, productContainsTag, regularPriceDescription);
    }

    /* renamed from: A, reason: from getter */
    public final Coupon getCoupon() {
        return this.coupon;
    }

    /* renamed from: B, reason: from getter */
    public final int getErrorImageResource() {
        return this.errorImageResource;
    }

    /* renamed from: C, reason: from getter */
    public boolean getHasMPerksOffers() {
        return this.hasMPerksOffers;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: D, reason: from getter */
    public AbstractC6392a getCurrentPrice() {
        return this.currentPrice;
    }

    /* renamed from: E, reason: from getter */
    public final boolean getInQtyStepperInteraction() {
        return this.inQtyStepperInteraction;
    }

    /* renamed from: F, reason: from getter */
    public final AbstractC6392a getLocation() {
        return this.location;
    }

    /* renamed from: G, reason: from getter */
    public final ProductRatings getProductRatings() {
        return this.productRatings;
    }

    /* renamed from: H, reason: from getter */
    public final int getQuantityRequested() {
        return this.quantityRequested;
    }

    /* renamed from: I, reason: from getter */
    public final AbstractC6392a getQuantityText() {
        return this.quantityText;
    }

    /* renamed from: J, reason: from getter */
    public final ShoppingListItem getShoppingListItem() {
        return this.shoppingListItem;
    }

    /* renamed from: K, reason: from getter */
    public final boolean getShowQuantityRequested() {
        return this.showQuantityRequested;
    }

    /* renamed from: L, reason: from getter */
    public final boolean getShowWeightInfo() {
        return this.showWeightInfo;
    }

    /* renamed from: M, reason: from getter */
    public final ProductSponsorship getSponsorship() {
        return this.sponsorship;
    }

    /* renamed from: N, reason: from getter */
    public String getThumbnailDescription() {
        return this.thumbnailDescription;
    }

    /* renamed from: O, reason: from getter */
    public String getUpc() {
        return this.upc;
    }

    /* renamed from: P, reason: from getter */
    public final AbstractC6392a getWeightUnitSizeAndPrice() {
        return this.weightUnitSizeAndPrice;
    }

    /* renamed from: Q, reason: from getter */
    public final boolean getIsBuyAgain() {
        return this.isBuyAgain;
    }

    public final boolean T(ProductListDecorator other) {
        Intrinsics.j(other, "other");
        return Intrinsics.e(other.getUpc(), getUpc());
    }

    /* renamed from: U, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final ProductCardDecorator V() {
        ProductFullDetails productFullDetails;
        double dIntValue;
        AbstractC6392a amountSaved = getAmountSaved();
        ProductFullDetails product = getProduct();
        String thumbnailUrl = getThumbnailUrl();
        ProductEligibility.a cartEligibility = getCartEligibility();
        AbstractC6392a currentPrice = getCurrentPrice();
        boolean isOnSale = getIsOnSale();
        AbstractC6392a regularPrice = getRegularPrice();
        AbstractC6392a abstractC6392a = this.weightUnitSizeAndPrice;
        double actualQuantity = this.cartEntry.getActualQuantity();
        int entryNumber = this.cartEntry.getEntryNumber();
        double qtyIncrement = this.cartEntry.getQtyIncrement();
        String itemUnitOfMeasure = getProduct().getItemUnitOfMeasure();
        Integer maxOrderQuantity = getProduct().getMaxOrderQuantity();
        if (maxOrderQuantity != null) {
            productFullDetails = product;
            dIntValue = maxOrderQuantity.intValue();
        } else {
            productFullDetails = product;
            dIntValue = 2.147483647E9d;
        }
        return new ProductCardDecorator(productFullDetails, isOnSale, currentPrice, null, regularPrice, null, amountSaved, abstractC6392a, thumbnailUrl, cartEligibility, entryNumber, actualQuantity, qtyIncrement, itemUnitOfMeasure, dIntValue, Intrinsics.e(getCartEligibility(), ProductEligibility.a.c.f167271a), getIsOutOfStock(), getHasMPerksOffers(), o(), this.productQuery, this.complexPromo, this.inQtyStepperInteraction, this.isBuyAgain, this.isBopas, S(), this.sponsorship, this.productRatings, null, false, null, 671088680, null);
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: a, reason: from getter */
    public AbstractC6392a getWeight() {
        return this.weight;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: b, reason: from getter */
    public AbstractC6392a getAmountSaved() {
        return this.amountSaved;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: c, reason: from getter */
    public AbstractC6392a getRegularPriceDescription() {
        return this.regularPriceDescription;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: d, reason: from getter */
    public ProductEligibility.a getCartEligibility() {
        return this.cartEligibility;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: e, reason: from getter */
    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: f, reason: from getter */
    public boolean getShouldShowWeight() {
        return this.shouldShowWeight;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: g, reason: from getter */
    public AbstractC6392a getCurrentPriceDescription() {
        return this.currentPriceDescription;
    }

    @Override // vs.InterfaceC17723c
    public String getTitle() {
        return this.title;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: h, reason: from getter */
    public SponsoredData getCriteoInfo() {
        return this.criteoInfo;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.id.hashCode() * 31) + Boolean.hashCode(this.isSelected)) * 31) + this.upc.hashCode()) * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.hasUnsavedShoppingListItem)) * 31;
        Long l10 = this.listItemId;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        nk.g gVar = this.thumbnail;
        int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        String str = this.thumbnailUrl;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.thumbnailDescription;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.department;
        int iHashCode6 = (((((((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.isOnSale)) * 31) + Boolean.hashCode(this.showWeightInfo)) * 31) + Boolean.hashCode(this.hasMPerksOffers)) * 31;
        AbstractC6392a abstractC6392a = this.currentPrice;
        int iHashCode7 = (iHashCode6 + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31;
        AbstractC6392a abstractC6392a2 = this.regularPrice;
        int iHashCode8 = (iHashCode7 + (abstractC6392a2 == null ? 0 : abstractC6392a2.hashCode())) * 31;
        AbstractC6392a abstractC6392a3 = this.weightUnitSizeAndPrice;
        int iHashCode9 = (iHashCode8 + (abstractC6392a3 == null ? 0 : abstractC6392a3.hashCode())) * 31;
        AbstractC6392a abstractC6392a4 = this.amountSaved;
        int iHashCode10 = (((iHashCode9 + (abstractC6392a4 == null ? 0 : abstractC6392a4.hashCode())) * 31) + this.quantityText.hashCode()) * 31;
        AbstractC6392a abstractC6392a5 = this.priceGoodThroughDate;
        int iHashCode11 = (((((iHashCode10 + (abstractC6392a5 == null ? 0 : abstractC6392a5.hashCode())) * 31) + Boolean.hashCode(this.isAddedToShoppingList)) * 31) + Integer.hashCode(this.errorImageResource)) * 31;
        ShoppingListItem cVar = this.shoppingListItem;
        int iHashCode12 = (((((((((((((iHashCode11 + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.product.hashCode()) * 31) + this.cartEntry.hashCode()) * 31) + this.storeAvailability.hashCode()) * 31) + this.cartEligibility.hashCode()) * 31) + Boolean.hashCode(this.inQtyStepperInteraction)) * 31) + Boolean.hashCode(this.resetStepperState)) * 31;
        Qo.l lVar = this.productQuery;
        int iHashCode13 = (iHashCode12 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        CouponCountDownStateDecorator eVar = this.couponCountDownStateDecorator;
        int iHashCode14 = (iHashCode13 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Coupon coupon = this.coupon;
        int iHashCode15 = (iHashCode14 + (coupon == null ? 0 : coupon.hashCode())) * 31;
        AbstractC6392a abstractC6392a6 = this.complexPromo;
        int iHashCode16 = (((((iHashCode15 + (abstractC6392a6 == null ? 0 : abstractC6392a6.hashCode())) * 31) + Boolean.hashCode(this.isBuyAgain)) * 31) + Boolean.hashCode(this.isBopas)) * 31;
        ProductSponsorship aVar = this.sponsorship;
        int iHashCode17 = (iHashCode16 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        ProductRatings cVar2 = this.productRatings;
        int iHashCode18 = (((((iHashCode17 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31) + Boolean.hashCode(this.showQuantityRequested)) * 31) + Integer.hashCode(this.quantityRequested)) * 31;
        AbstractC6392a abstractC6392a7 = this.currentPriceDescription;
        int iHashCode19 = (((iHashCode18 + (abstractC6392a7 == null ? 0 : abstractC6392a7.hashCode())) * 31) + Boolean.hashCode(this.productContainsTag)) * 31;
        AbstractC6392a abstractC6392a8 = this.regularPriceDescription;
        return iHashCode19 + (abstractC6392a8 != null ? abstractC6392a8.hashCode() : 0);
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: i, reason: from getter */
    public double getActualQuantity() {
        return this.actualQuantity;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: j, reason: from getter */
    public boolean getProductContainsTag() {
        return this.productContainsTag;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: k, reason: from getter */
    public boolean getHasDeposit() {
        return this.hasDeposit;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: l, reason: from getter */
    public boolean getResetStepperState() {
        return this.resetStepperState;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: m, reason: from getter */
    public ProductFullDetails getProduct() {
        return this.product;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: p, reason: from getter */
    public Pk.c getCouponIdentity() {
        return this.couponIdentity;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: q, reason: from getter */
    public AbstractC6392a getRegularPrice() {
        return this.regularPrice;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: r, reason: from getter */
    public boolean getInQtyStepperTransition() {
        return this.inQtyStepperTransition;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: s, reason: from getter */
    public boolean getIsOnSale() {
        return this.isOnSale;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: t, reason: from getter */
    public CouponCountDownStateDecorator getCouponCountDownStateDecorator() {
        return this.couponCountDownStateDecorator;
    }

    public String toString() {
        return "ProductListDecorator(id=" + this.id + ", isSelected=" + this.isSelected + ", upc=" + this.upc + ", title=" + this.title + ", hasUnsavedShoppingListItem=" + this.hasUnsavedShoppingListItem + ", listItemId=" + this.listItemId + ", thumbnail=" + this.thumbnail + ", thumbnailUrl=" + this.thumbnailUrl + ", thumbnailDescription=" + this.thumbnailDescription + ", department=" + this.department + ", isOnSale=" + this.isOnSale + ", showWeightInfo=" + this.showWeightInfo + ", hasMPerksOffers=" + this.hasMPerksOffers + ", currentPrice=" + this.currentPrice + ", regularPrice=" + this.regularPrice + ", weightUnitSizeAndPrice=" + this.weightUnitSizeAndPrice + ", amountSaved=" + this.amountSaved + ", quantityText=" + this.quantityText + ", priceGoodThroughDate=" + this.priceGoodThroughDate + ", isAddedToShoppingList=" + this.isAddedToShoppingList + ", errorImageResource=" + this.errorImageResource + ", shoppingListItem=" + this.shoppingListItem + ", product=" + this.product + ", cartEntry=" + this.cartEntry + ", storeAvailability=" + this.storeAvailability + ", cartEligibility=" + this.cartEligibility + ", inQtyStepperInteraction=" + this.inQtyStepperInteraction + ", resetStepperState=" + this.resetStepperState + ", productQuery=" + this.productQuery + ", couponCountDownStateDecorator=" + this.couponCountDownStateDecorator + ", coupon=" + this.coupon + ", complexPromo=" + this.complexPromo + ", isBuyAgain=" + this.isBuyAgain + ", isBopas=" + this.isBopas + ", sponsorship=" + this.sponsorship + ", productRatings=" + this.productRatings + ", showQuantityRequested=" + this.showQuantityRequested + ", quantityRequested=" + this.quantityRequested + ", currentPriceDescription=" + this.currentPriceDescription + ", productContainsTag=" + this.productContainsTag + ", regularPriceDescription=" + this.regularPriceDescription + ')';
    }

    /* renamed from: w, reason: from getter */
    public final AbstractC6392a getAvailabilityStatus() {
        return this.availabilityStatus;
    }

    /* renamed from: y, reason: from getter */
    public final CartEntryDecorator getCartEntry() {
        return this.cartEntry;
    }

    /* renamed from: z, reason: from getter */
    public final AbstractC6392a getComplexPromo() {
        return this.complexPromo;
    }

    public final boolean S() {
        return Intrinsics.e(getCartEligibility(), ProductEligibility.a.C2661b.f167270a);
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: n */
    public boolean getIsOutOfStock() {
        return Intrinsics.e(getCartEligibility(), ProductEligibility.a.l.f167280a);
    }

    @Override // vs.InterfaceC17723c
    public boolean o() {
        ProductEligibility.a cartEligibility = getCartEligibility();
        qw.a.INSTANCE.a("Eligibility checked: " + cartEligibility, new Object[0]);
        if (!Intrinsics.e(cartEligibility, ProductEligibility.a.C2660a.f167269a) && !Intrinsics.e(getCartEligibility(), ProductEligibility.a.c.f167271a)) {
            return false;
        }
        return true;
    }

    @Override // vs.InterfaceC17723c
    /* renamed from: x */
    public boolean getIsLowStock() {
        return Intrinsics.e(getCartEligibility(), ProductEligibility.a.c.f167271a);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ ProductListDecorator(java.lang.String r47, boolean r48, java.lang.String r49, java.lang.String r50, boolean r51, java.lang.Long r52, nk.g r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, boolean r57, boolean r58, boolean r59, bk.AbstractC6392a r60, bk.AbstractC6392a r61, bk.AbstractC6392a r62, bk.AbstractC6392a r63, bk.AbstractC6392a r64, bk.AbstractC6392a r65, boolean r66, int r67, Fq.ShoppingListItem r68, Co.ProductFullDetails r69, vs.ProductListDecorator.CartEntryDecorator r70, wl.ProductEligibility.a r71, wl.ProductEligibility.a r72, boolean r73, boolean r74, Qo.l r75, Hr.CouponCountDownStateDecorator r76, Pk.Coupon r77, bk.AbstractC6392a r78, boolean r79, boolean r80, Ho.ProductSponsorship r81, Gp.ProductRatings r82, boolean r83, int r84, bk.AbstractC6392a r85, boolean r86, bk.AbstractC6392a r87, int r88, int r89, kotlin.jvm.internal.DefaultConstructorMarker r90) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vs.ProductListDecorator.<init>(java.lang.String, boolean, java.lang.String, java.lang.String, boolean, java.lang.Long, nk.g, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, bk.a, bk.a, bk.a, bk.a, bk.a, bk.a, boolean, int, Fq.c, Co.h, vs.f$a, wl.b$a, wl.b$a, boolean, boolean, Qo.l, Hr.e, Pk.a, bk.a, boolean, boolean, Ho.a, Gp.c, boolean, int, bk.a, boolean, bk.a, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
