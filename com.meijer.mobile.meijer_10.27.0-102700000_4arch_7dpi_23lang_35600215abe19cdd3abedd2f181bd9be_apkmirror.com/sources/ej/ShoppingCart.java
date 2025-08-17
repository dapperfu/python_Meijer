package ej;

import Fo.Savings;
import Tq.PointOfService;
import androidx.recyclerview.widget.RecyclerView;
import ci.CustomerAddress;
import fj.PickupPerson;
import gk.PaymentOption;
import ij.FulfillmentSlot;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\\\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 ¯\u00012\u00020\u0001:\u0001FB\u0093\u0004\u0012\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\b\b\u0002\u0010!\u001a\u00020\u001f\u0012\b\b\u0002\u0010\"\u001a\u00020\u001f\u0012\b\b\u0002\u0010#\u001a\u00020\u001f\u0012\b\b\u0002\u0010$\u001a\u00020\u001f\u0012\b\b\u0002\u0010%\u001a\u00020\u0013\u0012\b\b\u0002\u0010&\u001a\u00020\u0013\u0012\b\b\u0002\u0010'\u001a\u00020\u0013\u0012\b\b\u0002\u0010(\u001a\u00020\u0013\u0012\b\b\u0002\u0010)\u001a\u00020\u0013\u0012\b\b\u0002\u0010*\u001a\u00020\u0013\u0012\b\b\u0002\u0010+\u001a\u00020\u0013\u0012\b\b\u0002\u0010,\u001a\u00020\u0013\u0012\b\b\u0002\u0010-\u001a\u00020\u0013\u0012\b\b\u0002\u0010.\u001a\u00020\u0013\u0012\b\b\u0002\u0010/\u001a\u00020\u0013\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u00102\u001a\u000201\u0012\b\b\u0002\u00104\u001a\u000203\u0012\u0010\b\u0002\u00105\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\b\b\u0002\u00106\u001a\u000203\u0012\b\b\u0002\u00107\u001a\u000203\u0012\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u0002080\u0005\u0012\b\b\u0002\u0010:\u001a\u000203\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u0005\u0012\b\b\u0002\u0010@\u001a\u00020\u0013\u0012\b\b\u0002\u0010A\u001a\u00020\u0013\u0012\b\b\u0002\u0010B\u001a\u00020\u0013\u0012\b\b\u0002\u0010C\u001a\u00020\u0013¢\u0006\u0004\bD\u0010EJ\u009c\u0004\u0010F\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020\u001f2\b\b\u0002\u0010#\u001a\u00020\u001f2\b\b\u0002\u0010$\u001a\u00020\u001f2\b\b\u0002\u0010%\u001a\u00020\u00132\b\b\u0002\u0010&\u001a\u00020\u00132\b\b\u0002\u0010'\u001a\u00020\u00132\b\b\u0002\u0010(\u001a\u00020\u00132\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020\u00132\b\b\u0002\u0010+\u001a\u00020\u00132\b\b\u0002\u0010,\u001a\u00020\u00132\b\b\u0002\u0010-\u001a\u00020\u00132\b\b\u0002\u0010.\u001a\u00020\u00132\b\b\u0002\u0010/\u001a\u00020\u00132\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00104\u001a\u0002032\u0010\b\u0002\u00105\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\b\b\u0002\u00106\u001a\u0002032\b\b\u0002\u00107\u001a\u0002032\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u0002080\u00052\b\b\u0002\u0010:\u001a\u0002032\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00052\b\b\u0002\u0010@\u001a\u00020\u00132\b\b\u0002\u0010A\u001a\u00020\u00132\b\b\u0002\u0010B\u001a\u00020\u00132\b\b\u0002\u0010C\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u000201HÖ\u0001¢\u0006\u0004\bJ\u0010KJ\u001a\u0010N\u001a\u0002032\b\u0010M\u001a\u0004\u0018\u00010LHÖ\u0003¢\u0006\u0004\bN\u0010OR\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010IR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b[\u0010T\u001a\u0004\b\\\u0010VR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bg\u0010i\u001a\u0004\b]\u0010jR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010 \u001a\u00020\u001f8\u0006¢\u0006\u000f\n\u0005\bU\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001a\u0010!\u001a\u00020\u001f8\u0006¢\u0006\u000f\n\u0005\bm\u0010\u0083\u0001\u001a\u0006\b\u0086\u0001\u0010\u0085\u0001R\u001b\u0010\"\u001a\u00020\u001f8\u0006¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0083\u0001\u001a\u0006\b\u0088\u0001\u0010\u0085\u0001R\u001b\u0010#\u001a\u00020\u001f8\u0006¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u0083\u0001\u001a\u0006\b\u008a\u0001\u0010\u0085\u0001R\u001b\u0010$\u001a\u00020\u001f8\u0006¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u0083\u0001\u001a\u0006\b\u008c\u0001\u0010\u0085\u0001R\u0019\u0010%\u001a\u00020\u00138\u0006¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010l\u001a\u0005\b\u008e\u0001\u0010nR\u0019\u0010&\u001a\u00020\u00138\u0006¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010l\u001a\u0005\b\u0090\u0001\u0010nR\u0018\u0010'\u001a\u00020\u00138\u0006¢\u0006\r\n\u0005\b\u0086\u0001\u0010l\u001a\u0004\bk\u0010nR\u0017\u0010(\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\by\u0010l\u001a\u0004\be\u0010nR\u0019\u0010)\u001a\u00020\u00138\u0006¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010l\u001a\u0005\b\u0092\u0001\u0010nR\u0018\u0010*\u001a\u00020\u00138\u0006¢\u0006\r\n\u0004\b\\\u0010l\u001a\u0005\b\u0093\u0001\u0010nR\u0019\u0010+\u001a\u00020\u00138\u0006¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010l\u001a\u0005\b\u008f\u0001\u0010nR\u0018\u0010,\u001a\u00020\u00138\u0006¢\u0006\r\n\u0004\bq\u0010l\u001a\u0005\b\u0095\u0001\u0010nR\u0018\u0010-\u001a\u00020\u00138\u0006¢\u0006\r\n\u0004\b_\u0010l\u001a\u0005\b\u0096\u0001\u0010nR\u0018\u0010.\u001a\u00020\u00138\u0006¢\u0006\r\n\u0004\bu\u0010l\u001a\u0005\b\u0097\u0001\u0010nR\u0019\u0010/\u001a\u00020\u00138\u0006¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010l\u001a\u0005\b\u0098\u0001\u0010nR\u001a\u00100\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\r\n\u0005\b\u0092\u0001\u0010l\u001a\u0004\b[\u0010nR\u001a\u00102\u001a\u0002018\u0006¢\u0006\u000f\n\u0006\b\u008a\u0001\u0010\u0099\u0001\u001a\u0005\b\u0099\u0001\u0010KR\u001b\u00104\u001a\u0002038\u0006¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R!\u00105\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010Q\u001a\u0005\b\u0091\u0001\u0010IR\u001b\u00106\u001a\u0002038\u0006¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u009a\u0001\u001a\u0006\b\u009d\u0001\u0010\u009c\u0001R\u001a\u00107\u001a\u0002038\u0006¢\u0006\u000f\n\u0006\b\u008c\u0001\u0010\u009a\u0001\u001a\u0005\ba\u0010\u009c\u0001R\u001f\u00109\u001a\b\u0012\u0004\u0012\u0002080\u00058\u0006¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010T\u001a\u0005\b\u008b\u0001\u0010VR\u001a\u0010:\u001a\u0002038\u0006¢\u0006\u000f\n\u0006\b\u009e\u0001\u0010\u009a\u0001\u001a\u0005\bo\u0010\u009c\u0001R\u001b\u0010;\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010Q\u001a\u0005\b \u0001\u0010IR\u001b\u0010<\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010Q\u001a\u0005\b\u0087\u0001\u0010IR\u001b\u0010=\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b¡\u0001\u0010Q\u001a\u0005\b\u0094\u0001\u0010IR\u001e\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00058\u0006¢\u0006\r\n\u0005\b¢\u0001\u0010T\u001a\u0004\bS\u0010VR\u0018\u0010@\u001a\u00020\u00138\u0006¢\u0006\r\n\u0005\b£\u0001\u0010l\u001a\u0004\bs\u0010nR\u0018\u0010A\u001a\u00020\u00138\u0006¢\u0006\r\n\u0005\b¤\u0001\u0010l\u001a\u0004\bw\u0010nR\u0018\u0010B\u001a\u00020\u00138\u0006¢\u0006\r\n\u0005\b¥\u0001\u0010l\u001a\u0004\b\u007f\u0010nR\u0018\u0010C\u001a\u00020\u00138\u0006¢\u0006\r\n\u0005\b¦\u0001\u0010l\u001a\u0004\b{\u0010nR\u001b\u0010¨\u0001\u001a\u0002038\u0006¢\u0006\u000f\n\u0006\b§\u0001\u0010\u009a\u0001\u001a\u0005\bW\u0010\u009c\u0001R\u001b\u0010ª\u0001\u001a\u000701j\u0003`©\u00018VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010KR\u0014\u0010«\u0001\u001a\u0002038F¢\u0006\b\u001a\u0006\b¡\u0001\u0010\u009c\u0001R\u0014\u0010¬\u0001\u001a\u0002038F¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u009c\u0001R\u0014\u0010\u00ad\u0001\u001a\u0002038F¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010\u009c\u0001R\u0014\u0010®\u0001\u001a\u0002038F¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009c\u0001¨\u0006°\u0001"}, d2 = {"Lej/C;", "Lej/f;", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "code", "", "Lej/i;", "entries", "Lej/g;", "customerData", "outOfStockEntries", "LTq/c;", "pointOfService", "Lej/D;", "substitutePreference", "Lej/h;", "deliveryMode", "Lci/c;", "deliveryAddress", "Lmk/b;", "extendedDeliveryCost", "Lej/u;", "paymentInfo", "Lgk/f;", "selectedPaymentOption", "Lej/s;", "multiTenderPaymentInfo", "Lfj/b;", "pickUpPerson", "Lij/c;", "pickUpSlotInfo", "LFo/c;", "specialSavings", "mperksSavings", "couponsSavings", "teamMemberSavings", "totalSavings", "productDiscounts", "orderDiscounts", "depositPrice", "deliveryCost", "subTotal", "totalDiscounts", "itemsTotal", "totalCosts", "totalPrice", "totalTax", "totalPriceWithTax", "creditTransactionAmount", "", "totalItems", "", "tippedAndRated", "originalOrderId", "isEditingDryOrder", "deliveryAddressIsAlcoholEligible", "Lej/p;", "highValuePromos", "earlyDeliveryAvailable", "promoCodeMessage", "fulfillmentEligibility", "partnerEligibility", "Lej/b;", "availableFulfillmentEligibilities", "ebtEligibleTotal", "ebtNonEligibleTotal", "ebtSurchargePrice", "ebtSuggestedTotal", "<init>", "(Ljava/lang/String;Ljava/util/List;Lej/g;Ljava/util/List;LTq/c;Lej/D;Lej/h;Lci/c;Lmk/b;Lej/u;Lgk/f;Lej/s;Lfj/b;Lij/c;LFo/c;LFo/c;LFo/c;LFo/c;LFo/c;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;IZLjava/lang/String;ZZLjava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lmk/b;Lmk/b;Lmk/b;Lmk/b;)V", "a", "(Ljava/lang/String;Ljava/util/List;Lej/g;Ljava/util/List;LTq/c;Lej/D;Lej/h;Lci/c;Lmk/b;Lej/u;Lgk/f;Lej/s;Lfj/b;Lij/c;LFo/c;LFo/c;LFo/c;LFo/c;LFo/c;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;IZLjava/lang/String;ZZLjava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lmk/b;Lmk/b;Lmk/b;Lmk/b;)Lej/C;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "getCode", "c", "Ljava/util/List;", "p", "()Ljava/util/List;", "d", "Lej/g;", "getCustomerData", "()Lej/g;", "e", "z", "f", "LTq/c;", "C", "()LTq/c;", "g", "Lej/D;", "getSubstitutePreference", "()Lej/D;", "h", "Lej/h;", "i", "()Lej/h;", "Lci/c;", "()Lci/c;", "j", "Lmk/b;", "q", "()Lmk/b;", "k", "Lej/u;", "B", "()Lej/u;", "l", "Lgk/f;", "D", "()Lgk/f;", "m", "Lej/s;", "x", "()Lej/s;", "n", "Lfj/b;", "getPickUpPerson", "()Lfj/b;", "o", "Lij/c;", "getPickUpSlotInfo", "()Lij/c;", "LFo/c;", "E", "()LFo/c;", "w", "r", "getCouponsSavings", "s", "G", "t", "K", "u", "getProductDiscounts", "v", "getOrderDiscounts", "y", "F", "getTotalDiscounts", "A", "H", "getTotalPrice", "L", "J", "I", "Z", "getTippedAndRated", "()Z", "O", "M", "N", "getPromoCodeMessage", "P", "Q", "R", "S", "T", "U", "V", "containsAlcohol", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "isOrderEdit", "hasEbtProducts", "isEbtEligible", "isBopasEligible", "W", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ej.C, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class ShoppingCart implements InterfaceC13678f {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b itemsTotal;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b totalCosts;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b totalPrice;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b totalTax;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b totalPriceWithTax;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b creditTransactionAmount;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata and from toString */
    private final int totalItems;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean tippedAndRated;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata and from toString */
    private final String originalOrderId;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEditingDryOrder;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean deliveryAddressIsAlcoholEligible;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HighValuePromoData> highValuePromos;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean earlyDeliveryAvailable;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promoCodeMessage;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fulfillmentEligibility;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerEligibility;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AvailableFulfillmentEligibility> availableFulfillmentEligibilities;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b ebtEligibleTotal;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b ebtNonEligibleTotal;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b ebtSurchargePrice;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b ebtSuggestedTotal;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    private final boolean containsAlcohol;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Entry> entries;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final CustomerData customerData;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Entry> outOfStockEntries;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final PointOfService pointOfService;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final SubstitutePreference substitutePreference;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryMode deliveryMode;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final CustomerAddress deliveryAddress;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b extendedDeliveryCost;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentDetailItem paymentInfo;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentOption selectedPaymentOption;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final MultiTenderPaymentInfo multiTenderPaymentInfo;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final PickupPerson pickUpPerson;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final FulfillmentSlot pickUpSlotInfo;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final Savings specialSavings;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final Savings mperksSavings;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final Savings couponsSavings;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final Savings teamMemberSavings;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final Savings totalSavings;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b productDiscounts;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b orderDiscounts;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b depositPrice;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b deliveryCost;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b subTotal;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b totalDiscounts;

    public ShoppingCart() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, null, false, false, null, false, null, null, null, null, null, null, null, null, -1, 16383, null);
    }

    public final ShoppingCart a(String code, List<Entry> entries, CustomerData customerData, List<Entry> outOfStockEntries, PointOfService pointOfService, SubstitutePreference substitutePreference, DeliveryMode deliveryMode, CustomerAddress deliveryAddress, mk.b extendedDeliveryCost, PaymentDetailItem paymentInfo, PaymentOption selectedPaymentOption, MultiTenderPaymentInfo multiTenderPaymentInfo, PickupPerson pickUpPerson, FulfillmentSlot pickUpSlotInfo, Savings specialSavings, Savings mperksSavings, Savings couponsSavings, Savings teamMemberSavings, Savings totalSavings, mk.b productDiscounts, mk.b orderDiscounts, mk.b depositPrice, mk.b deliveryCost, mk.b subTotal, mk.b totalDiscounts, mk.b itemsTotal, mk.b totalCosts, mk.b totalPrice, mk.b totalTax, mk.b totalPriceWithTax, mk.b creditTransactionAmount, int totalItems, boolean tippedAndRated, String originalOrderId, boolean isEditingDryOrder, boolean deliveryAddressIsAlcoholEligible, List<HighValuePromoData> highValuePromos, boolean earlyDeliveryAvailable, String promoCodeMessage, String fulfillmentEligibility, String partnerEligibility, List<AvailableFulfillmentEligibility> availableFulfillmentEligibilities, mk.b ebtEligibleTotal, mk.b ebtNonEligibleTotal, mk.b ebtSurchargePrice, mk.b ebtSuggestedTotal) {
        Intrinsics.j(code, "code");
        Intrinsics.j(entries, "entries");
        Intrinsics.j(outOfStockEntries, "outOfStockEntries");
        Intrinsics.j(pointOfService, "pointOfService");
        Intrinsics.j(specialSavings, "specialSavings");
        Intrinsics.j(mperksSavings, "mperksSavings");
        Intrinsics.j(couponsSavings, "couponsSavings");
        Intrinsics.j(teamMemberSavings, "teamMemberSavings");
        Intrinsics.j(totalSavings, "totalSavings");
        Intrinsics.j(productDiscounts, "productDiscounts");
        Intrinsics.j(orderDiscounts, "orderDiscounts");
        Intrinsics.j(depositPrice, "depositPrice");
        Intrinsics.j(deliveryCost, "deliveryCost");
        Intrinsics.j(subTotal, "subTotal");
        Intrinsics.j(totalDiscounts, "totalDiscounts");
        Intrinsics.j(itemsTotal, "itemsTotal");
        Intrinsics.j(totalCosts, "totalCosts");
        Intrinsics.j(totalPrice, "totalPrice");
        Intrinsics.j(totalTax, "totalTax");
        Intrinsics.j(totalPriceWithTax, "totalPriceWithTax");
        Intrinsics.j(highValuePromos, "highValuePromos");
        Intrinsics.j(availableFulfillmentEligibilities, "availableFulfillmentEligibilities");
        Intrinsics.j(ebtEligibleTotal, "ebtEligibleTotal");
        Intrinsics.j(ebtNonEligibleTotal, "ebtNonEligibleTotal");
        Intrinsics.j(ebtSurchargePrice, "ebtSurchargePrice");
        Intrinsics.j(ebtSuggestedTotal, "ebtSuggestedTotal");
        return new ShoppingCart(code, entries, customerData, outOfStockEntries, pointOfService, substitutePreference, deliveryMode, deliveryAddress, extendedDeliveryCost, paymentInfo, selectedPaymentOption, multiTenderPaymentInfo, pickUpPerson, pickUpSlotInfo, specialSavings, mperksSavings, couponsSavings, teamMemberSavings, totalSavings, productDiscounts, orderDiscounts, depositPrice, deliveryCost, subTotal, totalDiscounts, itemsTotal, totalCosts, totalPrice, totalTax, totalPriceWithTax, creditTransactionAmount, totalItems, tippedAndRated, originalOrderId, isEditingDryOrder, deliveryAddressIsAlcoholEligible, highValuePromos, earlyDeliveryAvailable, promoCodeMessage, fulfillmentEligibility, partnerEligibility, availableFulfillmentEligibilities, ebtEligibleTotal, ebtNonEligibleTotal, ebtSurchargePrice, ebtSuggestedTotal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShoppingCart)) {
            return false;
        }
        ShoppingCart shoppingCart = (ShoppingCart) other;
        return Intrinsics.e(this.code, shoppingCart.code) && Intrinsics.e(this.entries, shoppingCart.entries) && Intrinsics.e(this.customerData, shoppingCart.customerData) && Intrinsics.e(this.outOfStockEntries, shoppingCart.outOfStockEntries) && Intrinsics.e(this.pointOfService, shoppingCart.pointOfService) && Intrinsics.e(this.substitutePreference, shoppingCart.substitutePreference) && Intrinsics.e(this.deliveryMode, shoppingCart.deliveryMode) && Intrinsics.e(this.deliveryAddress, shoppingCart.deliveryAddress) && Intrinsics.e(this.extendedDeliveryCost, shoppingCart.extendedDeliveryCost) && Intrinsics.e(this.paymentInfo, shoppingCart.paymentInfo) && Intrinsics.e(this.selectedPaymentOption, shoppingCart.selectedPaymentOption) && Intrinsics.e(this.multiTenderPaymentInfo, shoppingCart.multiTenderPaymentInfo) && Intrinsics.e(this.pickUpPerson, shoppingCart.pickUpPerson) && Intrinsics.e(this.pickUpSlotInfo, shoppingCart.pickUpSlotInfo) && Intrinsics.e(this.specialSavings, shoppingCart.specialSavings) && Intrinsics.e(this.mperksSavings, shoppingCart.mperksSavings) && Intrinsics.e(this.couponsSavings, shoppingCart.couponsSavings) && Intrinsics.e(this.teamMemberSavings, shoppingCart.teamMemberSavings) && Intrinsics.e(this.totalSavings, shoppingCart.totalSavings) && Intrinsics.e(this.productDiscounts, shoppingCart.productDiscounts) && Intrinsics.e(this.orderDiscounts, shoppingCart.orderDiscounts) && Intrinsics.e(this.depositPrice, shoppingCart.depositPrice) && Intrinsics.e(this.deliveryCost, shoppingCart.deliveryCost) && Intrinsics.e(this.subTotal, shoppingCart.subTotal) && Intrinsics.e(this.totalDiscounts, shoppingCart.totalDiscounts) && Intrinsics.e(this.itemsTotal, shoppingCart.itemsTotal) && Intrinsics.e(this.totalCosts, shoppingCart.totalCosts) && Intrinsics.e(this.totalPrice, shoppingCart.totalPrice) && Intrinsics.e(this.totalTax, shoppingCart.totalTax) && Intrinsics.e(this.totalPriceWithTax, shoppingCart.totalPriceWithTax) && Intrinsics.e(this.creditTransactionAmount, shoppingCart.creditTransactionAmount) && this.totalItems == shoppingCart.totalItems && this.tippedAndRated == shoppingCart.tippedAndRated && Intrinsics.e(this.originalOrderId, shoppingCart.originalOrderId) && this.isEditingDryOrder == shoppingCart.isEditingDryOrder && this.deliveryAddressIsAlcoholEligible == shoppingCart.deliveryAddressIsAlcoholEligible && Intrinsics.e(this.highValuePromos, shoppingCart.highValuePromos) && this.earlyDeliveryAvailable == shoppingCart.earlyDeliveryAvailable && Intrinsics.e(this.promoCodeMessage, shoppingCart.promoCodeMessage) && Intrinsics.e(this.fulfillmentEligibility, shoppingCart.fulfillmentEligibility) && Intrinsics.e(this.partnerEligibility, shoppingCart.partnerEligibility) && Intrinsics.e(this.availableFulfillmentEligibilities, shoppingCart.availableFulfillmentEligibilities) && Intrinsics.e(this.ebtEligibleTotal, shoppingCart.ebtEligibleTotal) && Intrinsics.e(this.ebtNonEligibleTotal, shoppingCart.ebtNonEligibleTotal) && Intrinsics.e(this.ebtSurchargePrice, shoppingCart.ebtSurchargePrice) && Intrinsics.e(this.ebtSuggestedTotal, shoppingCart.ebtSuggestedTotal);
    }

    public ShoppingCart(String code, List<Entry> entries, CustomerData c13679g, List<Entry> outOfStockEntries, PointOfService pointOfService, SubstitutePreference d10, DeliveryMode c13680h, CustomerAddress c6395c, mk.b bVar, PaymentDetailItem uVar, PaymentOption fVar, MultiTenderPaymentInfo sVar, PickupPerson c13911b, FulfillmentSlot cVar, Savings specialSavings, Savings mperksSavings, Savings couponsSavings, Savings teamMemberSavings, Savings totalSavings, mk.b productDiscounts, mk.b orderDiscounts, mk.b depositPrice, mk.b deliveryCost, mk.b subTotal, mk.b totalDiscounts, mk.b itemsTotal, mk.b totalCosts, mk.b totalPrice, mk.b totalTax, mk.b totalPriceWithTax, mk.b bVar2, int i10, boolean z10, String str, boolean z11, boolean z12, List<HighValuePromoData> highValuePromos, boolean z13, String str2, String str3, String str4, List<AvailableFulfillmentEligibility> availableFulfillmentEligibilities, mk.b ebtEligibleTotal, mk.b ebtNonEligibleTotal, mk.b ebtSurchargePrice, mk.b ebtSuggestedTotal) {
        Intrinsics.j(code, "code");
        Intrinsics.j(entries, "entries");
        Intrinsics.j(outOfStockEntries, "outOfStockEntries");
        Intrinsics.j(pointOfService, "pointOfService");
        Intrinsics.j(specialSavings, "specialSavings");
        Intrinsics.j(mperksSavings, "mperksSavings");
        Intrinsics.j(couponsSavings, "couponsSavings");
        Intrinsics.j(teamMemberSavings, "teamMemberSavings");
        Intrinsics.j(totalSavings, "totalSavings");
        Intrinsics.j(productDiscounts, "productDiscounts");
        Intrinsics.j(orderDiscounts, "orderDiscounts");
        Intrinsics.j(depositPrice, "depositPrice");
        Intrinsics.j(deliveryCost, "deliveryCost");
        Intrinsics.j(subTotal, "subTotal");
        Intrinsics.j(totalDiscounts, "totalDiscounts");
        Intrinsics.j(itemsTotal, "itemsTotal");
        Intrinsics.j(totalCosts, "totalCosts");
        Intrinsics.j(totalPrice, "totalPrice");
        Intrinsics.j(totalTax, "totalTax");
        Intrinsics.j(totalPriceWithTax, "totalPriceWithTax");
        Intrinsics.j(highValuePromos, "highValuePromos");
        Intrinsics.j(availableFulfillmentEligibilities, "availableFulfillmentEligibilities");
        Intrinsics.j(ebtEligibleTotal, "ebtEligibleTotal");
        Intrinsics.j(ebtNonEligibleTotal, "ebtNonEligibleTotal");
        Intrinsics.j(ebtSurchargePrice, "ebtSurchargePrice");
        Intrinsics.j(ebtSuggestedTotal, "ebtSuggestedTotal");
        this.code = code;
        this.entries = entries;
        this.customerData = c13679g;
        this.outOfStockEntries = outOfStockEntries;
        this.pointOfService = pointOfService;
        this.substitutePreference = d10;
        this.deliveryMode = c13680h;
        this.deliveryAddress = c6395c;
        this.extendedDeliveryCost = bVar;
        this.paymentInfo = uVar;
        this.selectedPaymentOption = fVar;
        this.multiTenderPaymentInfo = sVar;
        this.pickUpPerson = c13911b;
        this.pickUpSlotInfo = cVar;
        this.specialSavings = specialSavings;
        this.mperksSavings = mperksSavings;
        this.couponsSavings = couponsSavings;
        this.teamMemberSavings = teamMemberSavings;
        this.totalSavings = totalSavings;
        this.productDiscounts = productDiscounts;
        this.orderDiscounts = orderDiscounts;
        this.depositPrice = depositPrice;
        this.deliveryCost = deliveryCost;
        this.subTotal = subTotal;
        this.totalDiscounts = totalDiscounts;
        this.itemsTotal = itemsTotal;
        this.totalCosts = totalCosts;
        this.totalPrice = totalPrice;
        this.totalTax = totalTax;
        this.totalPriceWithTax = totalPriceWithTax;
        this.creditTransactionAmount = bVar2;
        this.totalItems = i10;
        this.tippedAndRated = z10;
        this.originalOrderId = str;
        this.isEditingDryOrder = z11;
        this.deliveryAddressIsAlcoholEligible = z12;
        this.highValuePromos = highValuePromos;
        this.earlyDeliveryAvailable = z13;
        this.promoCodeMessage = str2;
        this.fulfillmentEligibility = str3;
        this.partnerEligibility = str4;
        this.availableFulfillmentEligibilities = availableFulfillmentEligibilities;
        this.ebtEligibleTotal = ebtEligibleTotal;
        this.ebtNonEligibleTotal = ebtNonEligibleTotal;
        this.ebtSurchargePrice = ebtSurchargePrice;
        this.ebtSuggestedTotal = ebtSuggestedTotal;
        List<Entry> list = entries;
        boolean z14 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((Entry) it.next()).m().getIsAlcohol()) {
                    z14 = true;
                    break;
                }
            }
        }
        this.containsAlcohol = z14;
    }

    /* renamed from: A, reason: from getter */
    public final String getPartnerEligibility() {
        return this.partnerEligibility;
    }

    /* renamed from: B, reason: from getter */
    public final PaymentDetailItem getPaymentInfo() {
        return this.paymentInfo;
    }

    /* renamed from: C, reason: from getter */
    public final PointOfService getPointOfService() {
        return this.pointOfService;
    }

    /* renamed from: D, reason: from getter */
    public final PaymentOption getSelectedPaymentOption() {
        return this.selectedPaymentOption;
    }

    /* renamed from: E, reason: from getter */
    public final Savings getSpecialSavings() {
        return this.specialSavings;
    }

    /* renamed from: F, reason: from getter */
    public final mk.b getSubTotal() {
        return this.subTotal;
    }

    /* renamed from: G, reason: from getter */
    public final Savings getTeamMemberSavings() {
        return this.teamMemberSavings;
    }

    /* renamed from: H, reason: from getter */
    public final mk.b getTotalCosts() {
        return this.totalCosts;
    }

    /* renamed from: I, reason: from getter */
    public final int getTotalItems() {
        return this.totalItems;
    }

    /* renamed from: J, reason: from getter */
    public final mk.b getTotalPriceWithTax() {
        return this.totalPriceWithTax;
    }

    /* renamed from: K, reason: from getter */
    public final Savings getTotalSavings() {
        return this.totalSavings;
    }

    /* renamed from: L, reason: from getter */
    public final mk.b getTotalTax() {
        return this.totalTax;
    }

    public final boolean M() {
        return Intrinsics.e(this.fulfillmentEligibility, "BOPASELIGIBLE");
    }

    /* renamed from: O, reason: from getter */
    public final boolean getIsEditingDryOrder() {
        return this.isEditingDryOrder;
    }

    public final boolean P() {
        return this.originalOrderId != null;
    }

    public final List<AvailableFulfillmentEligibility> c() {
        return this.availableFulfillmentEligibilities;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getContainsAlcohol() {
        return this.containsAlcohol;
    }

    /* renamed from: e, reason: from getter */
    public final mk.b getCreditTransactionAmount() {
        return this.creditTransactionAmount;
    }

    /* renamed from: f, reason: from getter */
    public final CustomerAddress getDeliveryAddress() {
        return this.deliveryAddress;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getDeliveryAddressIsAlcoholEligible() {
        return this.deliveryAddressIsAlcoholEligible;
    }

    @Override // ej.InterfaceC13678f
    public String getCode() {
        return this.code;
    }

    /* renamed from: h, reason: from getter */
    public final mk.b getDeliveryCost() {
        return this.deliveryCost;
    }

    public int hashCode() {
        int iHashCode = ((this.code.hashCode() * 31) + this.entries.hashCode()) * 31;
        CustomerData c13679g = this.customerData;
        int iHashCode2 = (((((iHashCode + (c13679g == null ? 0 : c13679g.hashCode())) * 31) + this.outOfStockEntries.hashCode()) * 31) + this.pointOfService.hashCode()) * 31;
        SubstitutePreference d10 = this.substitutePreference;
        int iHashCode3 = (iHashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
        DeliveryMode c13680h = this.deliveryMode;
        int iHashCode4 = (iHashCode3 + (c13680h == null ? 0 : c13680h.hashCode())) * 31;
        CustomerAddress c6395c = this.deliveryAddress;
        int iHashCode5 = (iHashCode4 + (c6395c == null ? 0 : c6395c.hashCode())) * 31;
        mk.b bVar = this.extendedDeliveryCost;
        int iHashCode6 = (iHashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        PaymentDetailItem uVar = this.paymentInfo;
        int iHashCode7 = (iHashCode6 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        PaymentOption fVar = this.selectedPaymentOption;
        int iHashCode8 = (iHashCode7 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        MultiTenderPaymentInfo sVar = this.multiTenderPaymentInfo;
        int iHashCode9 = (iHashCode8 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        PickupPerson c13911b = this.pickUpPerson;
        int iHashCode10 = (iHashCode9 + (c13911b == null ? 0 : c13911b.hashCode())) * 31;
        FulfillmentSlot cVar = this.pickUpSlotInfo;
        int iHashCode11 = (((((((((((((((((((((((((((((((((iHashCode10 + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.specialSavings.hashCode()) * 31) + this.mperksSavings.hashCode()) * 31) + this.couponsSavings.hashCode()) * 31) + this.teamMemberSavings.hashCode()) * 31) + this.totalSavings.hashCode()) * 31) + this.productDiscounts.hashCode()) * 31) + this.orderDiscounts.hashCode()) * 31) + this.depositPrice.hashCode()) * 31) + this.deliveryCost.hashCode()) * 31) + this.subTotal.hashCode()) * 31) + this.totalDiscounts.hashCode()) * 31) + this.itemsTotal.hashCode()) * 31) + this.totalCosts.hashCode()) * 31) + this.totalPrice.hashCode()) * 31) + this.totalTax.hashCode()) * 31) + this.totalPriceWithTax.hashCode()) * 31;
        mk.b bVar2 = this.creditTransactionAmount;
        int iHashCode12 = (((((iHashCode11 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31) + Integer.hashCode(this.totalItems)) * 31) + Boolean.hashCode(this.tippedAndRated)) * 31;
        String str = this.originalOrderId;
        int iHashCode13 = (((((((((iHashCode12 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isEditingDryOrder)) * 31) + Boolean.hashCode(this.deliveryAddressIsAlcoholEligible)) * 31) + this.highValuePromos.hashCode()) * 31) + Boolean.hashCode(this.earlyDeliveryAvailable)) * 31;
        String str2 = this.promoCodeMessage;
        int iHashCode14 = (iHashCode13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fulfillmentEligibility;
        int iHashCode15 = (iHashCode14 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.partnerEligibility;
        return ((((((((((iHashCode15 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.availableFulfillmentEligibilities.hashCode()) * 31) + this.ebtEligibleTotal.hashCode()) * 31) + this.ebtNonEligibleTotal.hashCode()) * 31) + this.ebtSurchargePrice.hashCode()) * 31) + this.ebtSuggestedTotal.hashCode();
    }

    /* renamed from: i, reason: from getter */
    public final DeliveryMode getDeliveryMode() {
        return this.deliveryMode;
    }

    /* renamed from: j, reason: from getter */
    public final mk.b getDepositPrice() {
        return this.depositPrice;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getEarlyDeliveryAvailable() {
        return this.earlyDeliveryAvailable;
    }

    /* renamed from: l, reason: from getter */
    public final mk.b getEbtEligibleTotal() {
        return this.ebtEligibleTotal;
    }

    /* renamed from: m, reason: from getter */
    public final mk.b getEbtNonEligibleTotal() {
        return this.ebtNonEligibleTotal;
    }

    /* renamed from: n, reason: from getter */
    public final mk.b getEbtSuggestedTotal() {
        return this.ebtSuggestedTotal;
    }

    /* renamed from: o, reason: from getter */
    public final mk.b getEbtSurchargePrice() {
        return this.ebtSurchargePrice;
    }

    public final List<Entry> p() {
        return this.entries;
    }

    /* renamed from: q, reason: from getter */
    public final mk.b getExtendedDeliveryCost() {
        return this.extendedDeliveryCost;
    }

    /* renamed from: r, reason: from getter */
    public final String getFulfillmentEligibility() {
        return this.fulfillmentEligibility;
    }

    public final boolean s() {
        List<Entry> list = this.entries;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((Entry) it.next()).m().getIsEbtProduct()) {
                return true;
            }
        }
        return false;
    }

    public final List<HighValuePromoData> t() {
        return this.highValuePromos;
    }

    public String toString() {
        return "ShoppingCart(code=" + this.code + ", entries=" + this.entries + ", customerData=" + this.customerData + ", outOfStockEntries=" + this.outOfStockEntries + ", pointOfService=" + this.pointOfService + ", substitutePreference=" + this.substitutePreference + ", deliveryMode=" + this.deliveryMode + ", deliveryAddress=" + this.deliveryAddress + ", extendedDeliveryCost=" + this.extendedDeliveryCost + ", paymentInfo=" + this.paymentInfo + ", selectedPaymentOption=" + this.selectedPaymentOption + ", multiTenderPaymentInfo=" + this.multiTenderPaymentInfo + ", pickUpPerson=" + this.pickUpPerson + ", pickUpSlotInfo=" + this.pickUpSlotInfo + ", specialSavings=" + this.specialSavings + ", mperksSavings=" + this.mperksSavings + ", couponsSavings=" + this.couponsSavings + ", teamMemberSavings=" + this.teamMemberSavings + ", totalSavings=" + this.totalSavings + ", productDiscounts=" + this.productDiscounts + ", orderDiscounts=" + this.orderDiscounts + ", depositPrice=" + this.depositPrice + ", deliveryCost=" + this.deliveryCost + ", subTotal=" + this.subTotal + ", totalDiscounts=" + this.totalDiscounts + ", itemsTotal=" + this.itemsTotal + ", totalCosts=" + this.totalCosts + ", totalPrice=" + this.totalPrice + ", totalTax=" + this.totalTax + ", totalPriceWithTax=" + this.totalPriceWithTax + ", creditTransactionAmount=" + this.creditTransactionAmount + ", totalItems=" + this.totalItems + ", tippedAndRated=" + this.tippedAndRated + ", originalOrderId=" + this.originalOrderId + ", isEditingDryOrder=" + this.isEditingDryOrder + ", deliveryAddressIsAlcoholEligible=" + this.deliveryAddressIsAlcoholEligible + ", highValuePromos=" + this.highValuePromos + ", earlyDeliveryAvailable=" + this.earlyDeliveryAvailable + ", promoCodeMessage=" + this.promoCodeMessage + ", fulfillmentEligibility=" + this.fulfillmentEligibility + ", partnerEligibility=" + this.partnerEligibility + ", availableFulfillmentEligibilities=" + this.availableFulfillmentEligibilities + ", ebtEligibleTotal=" + this.ebtEligibleTotal + ", ebtNonEligibleTotal=" + this.ebtNonEligibleTotal + ", ebtSurchargePrice=" + this.ebtSurchargePrice + ", ebtSuggestedTotal=" + this.ebtSuggestedTotal + ')';
    }

    @Override // ej.InterfaceC13678f
    public int u() {
        return this.pointOfService.getStoreId();
    }

    /* renamed from: v, reason: from getter */
    public final mk.b getItemsTotal() {
        return this.itemsTotal;
    }

    /* renamed from: w, reason: from getter */
    public final Savings getMperksSavings() {
        return this.mperksSavings;
    }

    /* renamed from: x, reason: from getter */
    public final MultiTenderPaymentInfo getMultiTenderPaymentInfo() {
        return this.multiTenderPaymentInfo;
    }

    /* renamed from: y, reason: from getter */
    public final String getOriginalOrderId() {
        return this.originalOrderId;
    }

    public final List<Entry> z() {
        return this.outOfStockEntries;
    }

    public final boolean N() {
        if (s() && this.pointOfService.getEbtEnabled()) {
            return true;
        }
        return false;
    }

    public /* synthetic */ ShoppingCart(String str, List list, CustomerData c13679g, List list2, PointOfService cVar, SubstitutePreference d10, DeliveryMode c13680h, CustomerAddress c6395c, mk.b bVar, PaymentDetailItem uVar, PaymentOption fVar, MultiTenderPaymentInfo sVar, PickupPerson c13911b, FulfillmentSlot cVar2, Savings cVar3, Savings cVar4, Savings cVar5, Savings cVar6, Savings cVar7, mk.b bVar2, mk.b bVar3, mk.b bVar4, mk.b bVar5, mk.b bVar6, mk.b bVar7, mk.b bVar8, mk.b bVar9, mk.b bVar10, mk.b bVar11, mk.b bVar12, mk.b bVar13, int i10, boolean z10, String str2, boolean z11, boolean z12, List list3, boolean z13, String str3, String str4, String str5, List list4, mk.b bVar14, mk.b bVar15, mk.b bVar16, mk.b bVar17, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "-1" : str, (i11 & 2) != 0 ? CollectionsKt.m() : list, (i11 & 4) != 0 ? null : c13679g, (i11 & 8) != 0 ? CollectionsKt.m() : list2, (i11 & 16) != 0 ? new PointOfService(0, null, null, false, 0.0d, null, null, false, 0.0d, null, null, false, false, null, null, null, null, null, null, false, false, false, 4194302, null) : cVar, (i11 & 32) != 0 ? null : d10, (i11 & 64) != 0 ? null : c13680h, (i11 & 128) != 0 ? null : c6395c, (i11 & 256) != 0 ? null : bVar, (i11 & 512) != 0 ? null : uVar, (i11 & 1024) != 0 ? null : fVar, (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? null : sVar, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : c13911b, (i11 & 8192) != 0 ? null : cVar2, (i11 & 16384) != 0 ? new Savings(null, 0.0d, 3, null) : cVar3, (i11 & 32768) != 0 ? new Savings(null, 0.0d, 3, null) : cVar4, (i11 & 65536) != 0 ? new Savings(null, 0.0d, 3, null) : cVar5, (i11 & 131072) != 0 ? new Savings(null, 0.0d, 3, null) : cVar6, (i11 & 262144) != 0 ? new Savings(null, 0.0d, 3, null) : cVar7, (i11 & 524288) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar2, (i11 & 1048576) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar3, (i11 & 2097152) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar4, (i11 & 4194304) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar5, (i11 & 8388608) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar6, (i11 & 16777216) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar7, (i11 & 33554432) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar8, (i11 & 67108864) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar9, (i11 & 134217728) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar10, (i11 & 268435456) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar11, (i11 & 536870912) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar12, (i11 & 1073741824) != 0 ? null : bVar13, (i11 & Integer.MIN_VALUE) != 0 ? 0 : i10, (i12 & 1) != 0 ? false : z10, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? false : z11, (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? CollectionsKt.m() : list3, (i12 & 32) == 0 ? z13 : false, (i12 & 64) != 0 ? null : str3, (i12 & 128) != 0 ? null : str4, (i12 & 256) != 0 ? null : str5, (i12 & 512) != 0 ? CollectionsKt.m() : list4, (i12 & 1024) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar14, (i12 & RecyclerView.m.FLAG_MOVED) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar15, (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar16, (i12 & 8192) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar17);
    }
}
