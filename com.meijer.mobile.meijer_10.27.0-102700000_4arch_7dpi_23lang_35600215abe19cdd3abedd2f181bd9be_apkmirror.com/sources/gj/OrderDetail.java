package gj;

import Fo.Savings;
import Tq.PointOfService;
import ak.AbstractC5607a;
import androidx.recyclerview.widget.RecyclerView;
import ci.CustomerAddress;
import com.google.android.libraries.places.api.model.PlaceTypes;
import ej.C13671B;
import ej.CardType;
import ej.CustomerData;
import ej.DeliveryMode;
import ej.Entry;
import ej.LightningCartReward;
import ej.MultiTenderPaymentInfo;
import ej.PaymentDetailItem;
import ej.SubstitutePreference;
import ej.Tender;
import ej.TendersItem;
import fj.PickupPerson;
import fj.PickupSlotInfo;
import hj.Principal;
import j$.time.OffsetDateTime;
import j$.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import tp.Builder;

@Metadata(d1 = {"\u0000\u0087\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0003\bÊ\u0001\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u0000 Û\u00022\u00020\u0001:\u0004\u008f\u0001\u009a\u0001B¡\t\u0012\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\f\b\u0002\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u0018\u0012\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u0018\u0012\b\b\u0002\u0010&\u001a\u00020\r\u0012\b\b\u0002\u0010'\u001a\u00020\r\u0012\b\b\u0002\u0010(\u001a\u00020\r\u0012\b\b\u0002\u0010*\u001a\u00020)\u0012\b\b\u0002\u0010+\u001a\u00020\u0002\u0012\b\b\u0002\u0010,\u001a\u00020\r\u0012\b\b\u0002\u0010.\u001a\u00020-\u0012\b\b\u0002\u0010/\u001a\u00020\r\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u00101\u001a\u00020\u0002\u0012\b\b\u0002\u00102\u001a\u00020\u0002\u0012\b\b\u0002\u00103\u001a\u00020-\u0012\b\b\u0002\u00104\u001a\u00020-\u0012\b\b\u0002\u00105\u001a\u00020-\u0012\b\b\u0002\u00106\u001a\u00020-\u0012\f\b\u0002\u00108\u001a\u00060\u0002j\u0002`7\u0012\b\b\u0002\u00109\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u0018\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<\u0012\b\b\u0002\u0010>\u001a\u00020\u001b\u0012\b\b\u0002\u0010?\u001a\u00020\u001b\u0012\b\b\u0002\u0010@\u001a\u00020\u001b\u0012\u000e\b\u0002\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u0018\u0012\f\b\u0002\u0010C\u001a\u00060\u0002j\u0002`7\u0012\b\b\u0002\u0010D\u001a\u00020\r\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010E\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010G\u0012\b\b\u0002\u0010I\u001a\u00020\u0006\u0012\b\b\u0002\u0010K\u001a\u00020J\u0012\b\b\u0002\u0010L\u001a\u00020J\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010O\u0012\b\b\u0002\u0010Q\u001a\u00020\u0006\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010T\u001a\u00020\u0006\u0012\b\b\u0002\u0010U\u001a\u00020\u0006\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010V\u0012\b\b\u0002\u0010X\u001a\u00020\r\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010Z\u0012\b\b\u0002\u0010\\\u001a\u00020\u0006\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010]\u0012\b\b\u0002\u0010`\u001a\u00020_\u0012\b\b\u0002\u0010a\u001a\u00020\u0002\u0012\b\b\u0002\u0010b\u001a\u00020\u0006\u0012\n\b\u0002\u0010c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010f\u001a\b\u0012\u0004\u0012\u00020e0\u0018\u0012\b\b\u0002\u0010g\u001a\u00020\u0006\u0012\b\b\u0002\u0010h\u001a\u00020\u0006\u0012\b\b\u0002\u0010i\u001a\u00020\u0002\u0012\b\b\u0002\u0010j\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010l\u001a\b\u0012\u0004\u0012\u00020k0\u0018\u0012\u0010\b\u0002\u0010n\u001a\n\u0012\u0004\u0012\u00020m\u0018\u00010\u0018\u0012\n\b\u0002\u0010p\u001a\u0004\u0018\u00010o\u0012\n\b\u0002\u0010q\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010s\u001a\u0004\u0018\u00010]\u0012\n\b\u0002\u0010t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010u\u001a\u0004\u0018\u00010\u001b\u0012\u000e\b\u0002\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\n\b\u0002\u0010x\u001a\u0004\u0018\u00010w\u0012\n\b\u0002\u0010z\u001a\u0004\u0018\u00010y\u0012\n\b\u0002\u0010{\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010|\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010}\u001a\u00020\r\u0012\b\b\u0002\u0010~\u001a\u00020\r\u0012\b\b\u0002\u0010\u007f\u001a\u00020\r\u0012\u000b\b\u0002\u0010\u0080\u0001\u001a\u0004\u0018\u00010\r\u0012\t\b\u0002\u0010\u0081\u0001\u001a\u00020\r\u0012\u0012\b\u0002\u0010\u0083\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0082\u0001\u0018\u00010\u0018\u0012\f\b\u0002\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u0001\u0012\n\b\u0002\u0010\u0087\u0001\u001a\u00030\u0086\u0001\u0012\u0010\b\u0002\u0010\u0089\u0001\u001a\t\u0012\u0005\u0012\u00030\u0088\u00010\u0018¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0011\u0010\u008d\u0001\u001a\u00030\u008c\u0001¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J«\t\u0010\u008f\u0001\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\f\b\u0002\u0010\u0005\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00182\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u00182\b\b\u0002\u0010&\u001a\u00020\r2\b\b\u0002\u0010'\u001a\u00020\r2\b\b\u0002\u0010(\u001a\u00020\r2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020\u00022\b\b\u0002\u0010,\u001a\u00020\r2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020\r2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\r2\b\b\u0002\u00101\u001a\u00020\u00022\b\b\u0002\u00102\u001a\u00020\u00022\b\b\u0002\u00103\u001a\u00020-2\b\b\u0002\u00104\u001a\u00020-2\b\b\u0002\u00105\u001a\u00020-2\b\b\u0002\u00106\u001a\u00020-2\f\b\u0002\u00108\u001a\u00060\u0002j\u0002`72\b\b\u0002\u00109\u001a\u00020\u00062\u000e\b\u0002\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u00182\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<2\b\b\u0002\u0010>\u001a\u00020\u001b2\b\b\u0002\u0010?\u001a\u00020\u001b2\b\b\u0002\u0010@\u001a\u00020\u001b2\u000e\b\u0002\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u00182\f\b\u0002\u0010C\u001a\u00060\u0002j\u0002`72\b\b\u0002\u0010D\u001a\u00020\r2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010E2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010G2\b\b\u0002\u0010I\u001a\u00020\u00062\b\b\u0002\u0010K\u001a\u00020J2\b\b\u0002\u0010L\u001a\u00020J2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010P\u001a\u0004\u0018\u00010O2\b\b\u0002\u0010Q\u001a\u00020\u00062\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010T\u001a\u00020\u00062\b\b\u0002\u0010U\u001a\u00020\u00062\n\b\u0002\u0010W\u001a\u0004\u0018\u00010V2\b\b\u0002\u0010X\u001a\u00020\r2\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010[\u001a\u0004\u0018\u00010Z2\b\b\u0002\u0010\\\u001a\u00020\u00062\n\b\u0002\u0010^\u001a\u0004\u0018\u00010]2\b\b\u0002\u0010`\u001a\u00020_2\b\b\u0002\u0010a\u001a\u00020\u00022\b\b\u0002\u0010b\u001a\u00020\u00062\n\b\u0002\u0010c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010f\u001a\b\u0012\u0004\u0012\u00020e0\u00182\b\b\u0002\u0010g\u001a\u00020\u00062\b\b\u0002\u0010h\u001a\u00020\u00062\b\b\u0002\u0010i\u001a\u00020\u00022\b\b\u0002\u0010j\u001a\u00020\u00022\u000e\b\u0002\u0010l\u001a\b\u0012\u0004\u0012\u00020k0\u00182\u0010\b\u0002\u0010n\u001a\n\u0012\u0004\u0012\u00020m\u0018\u00010\u00182\n\b\u0002\u0010p\u001a\u0004\u0018\u00010o2\n\b\u0002\u0010q\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010s\u001a\u0004\u0018\u00010]2\n\b\u0002\u0010t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010u\u001a\u0004\u0018\u00010\u001b2\u000e\b\u0002\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\n\b\u0002\u0010x\u001a\u0004\u0018\u00010w2\n\b\u0002\u0010z\u001a\u0004\u0018\u00010y2\n\b\u0002\u0010{\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010|\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010}\u001a\u00020\r2\b\b\u0002\u0010~\u001a\u00020\r2\b\b\u0002\u0010\u007f\u001a\u00020\r2\u000b\b\u0002\u0010\u0080\u0001\u001a\u0004\u0018\u00010\r2\t\b\u0002\u0010\u0081\u0001\u001a\u00020\r2\u0012\b\u0002\u0010\u0083\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0082\u0001\u0018\u00010\u00182\f\b\u0002\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u00012\n\b\u0002\u0010\u0087\u0001\u001a\u00030\u0086\u00012\u0010\b\u0002\u0010\u0089\u0001\u001a\t\u0012\u0005\u0012\u00030\u0088\u00010\u0018HÆ\u0001¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0013\u0010\u0091\u0001\u001a\u00020\u0002HÖ\u0001¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0013\u0010\u0093\u0001\u001a\u00020\u001bHÖ\u0001¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u001e\u0010\u0096\u0001\u001a\u00020\u00062\t\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001f\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u0092\u0001R\u001f\u0010\u0005\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u0098\u0001\u001a\u0006\b\u009b\u0001\u0010\u0092\u0001R\u001b\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001b\u0010\b\u001a\u00020\u00068\u0006¢\u0006\u0010\n\u0006\b \u0001\u0010\u009d\u0001\u001a\u0006\b\u009c\u0001\u0010\u009f\u0001R\u001d\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u0098\u0001\u001a\u0006\b¡\u0001\u0010\u0092\u0001R\u001d\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u0098\u0001\u001a\u0006\b¢\u0001\u0010\u0092\u0001R\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\b£\u0001\u0010\u0098\u0001\u001a\u0006\b¤\u0001\u0010\u0092\u0001R\u001b\u0010\f\u001a\u00020\u00068\u0006¢\u0006\u0010\n\u0006\b¥\u0001\u0010\u009d\u0001\u001a\u0006\b¦\u0001\u0010\u009f\u0001R\u001b\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\u0010\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b\u009d\u0001\u0010©\u0001R\u001b\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\u0010\n\u0006\bª\u0001\u0010¨\u0001\u001a\u0006\b«\u0001\u0010©\u0001R\u001b\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\u0010\n\u0006\b¬\u0001\u0010¨\u0001\u001a\u0006\b\u00ad\u0001\u0010©\u0001R\u001b\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\u0010\n\u0006\b®\u0001\u0010¨\u0001\u001a\u0006\b¯\u0001\u0010©\u0001R\u001b\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\u0010\n\u0006\b°\u0001\u0010¨\u0001\u001a\u0006\b±\u0001\u0010©\u0001R\u001b\u0010\u0013\u001a\u00020\r8\u0006¢\u0006\u0010\n\u0006\b²\u0001\u0010¨\u0001\u001a\u0006\b³\u0001\u0010©\u0001R\u001b\u0010\u0014\u001a\u00020\r8\u0006¢\u0006\u0010\n\u0006\b´\u0001\u0010¨\u0001\u001a\u0006\bµ\u0001\u0010©\u0001R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u0010\n\u0006\b¶\u0001\u0010¨\u0001\u001a\u0006\b¥\u0001\u0010©\u0001R\u001b\u0010\u0016\u001a\u00020\r8\u0006¢\u0006\u0010\n\u0006\b·\u0001\u0010¨\u0001\u001a\u0006\b¬\u0001\u0010©\u0001R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u0010\n\u0006\b¸\u0001\u0010¨\u0001\u001a\u0006\b¹\u0001\u0010©\u0001R!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006¢\u0006\u0010\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001R\u001b\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\u0010\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010\u0094\u0001R\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\u0010\n\u0006\b¼\u0001\u0010Á\u0001\u001a\u0006\b®\u0001\u0010Â\u0001R\u001d\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\u0010\n\u0006\b¹\u0001\u0010Ã\u0001\u001a\u0006\bª\u0001\u0010Ä\u0001R\u001d\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\u0010\n\u0006\bÅ\u0001\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001R!\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00188\u0006¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010»\u0001\u001a\u0006\bÉ\u0001\u0010½\u0001R!\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u00188\u0006¢\u0006\u0010\n\u0006\bÊ\u0001\u0010»\u0001\u001a\u0006\bË\u0001\u0010½\u0001R\u001b\u0010&\u001a\u00020\r8\u0006¢\u0006\u0010\n\u0006\bÌ\u0001\u0010¨\u0001\u001a\u0006\bÍ\u0001\u0010©\u0001R\u001b\u0010'\u001a\u00020\r8\u0006¢\u0006\u0010\n\u0006\bÎ\u0001\u0010¨\u0001\u001a\u0006\bÏ\u0001\u0010©\u0001R\u001b\u0010(\u001a\u00020\r8\u0006¢\u0006\u0010\n\u0006\bÐ\u0001\u0010¨\u0001\u001a\u0006\bÑ\u0001\u0010©\u0001R\u001b\u0010*\u001a\u00020)8\u0006¢\u0006\u0010\n\u0006\bÒ\u0001\u0010Ç\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001R\u001b\u0010+\u001a\u00020\u00028\u0006¢\u0006\u0010\n\u0006\bÇ\u0001\u0010\u0098\u0001\u001a\u0006\bÕ\u0001\u0010\u0092\u0001R\u001b\u0010,\u001a\u00020\r8\u0006¢\u0006\u0010\n\u0006\bÖ\u0001\u0010¨\u0001\u001a\u0006\b×\u0001\u0010©\u0001R\u001b\u0010.\u001a\u00020-8\u0006¢\u0006\u0010\n\u0006\bØ\u0001\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001R\u001b\u0010/\u001a\u00020\r8\u0006¢\u0006\u0010\n\u0006\bÜ\u0001\u0010¨\u0001\u001a\u0006\bÝ\u0001\u0010©\u0001R\u001d\u00100\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u0010\n\u0006\bÞ\u0001\u0010¨\u0001\u001a\u0006\bß\u0001\u0010©\u0001R\u001b\u00101\u001a\u00020\u00028\u0006¢\u0006\u0010\n\u0006\b¿\u0001\u0010\u0098\u0001\u001a\u0006\bà\u0001\u0010\u0092\u0001R\u001b\u00102\u001a\u00020\u00028\u0006¢\u0006\u0010\n\u0006\bá\u0001\u0010\u0098\u0001\u001a\u0006\bâ\u0001\u0010\u0092\u0001R\u001b\u00103\u001a\u00020-8\u0006¢\u0006\u0010\n\u0006\bã\u0001\u0010Ù\u0001\u001a\u0006\bä\u0001\u0010Û\u0001R\u001b\u00104\u001a\u00020-8\u0006¢\u0006\u0010\n\u0006\bå\u0001\u0010Ù\u0001\u001a\u0006\bÊ\u0001\u0010Û\u0001R\u001b\u00105\u001a\u00020-8\u0006¢\u0006\u0010\n\u0006\bæ\u0001\u0010Ù\u0001\u001a\u0006\bã\u0001\u0010Û\u0001R\u001b\u00106\u001a\u00020-8\u0006¢\u0006\u0010\n\u0006\bç\u0001\u0010Ù\u0001\u001a\u0006\bè\u0001\u0010Û\u0001R\u001f\u00108\u001a\u00060\u0002j\u0002`78\u0006¢\u0006\u0010\n\u0006\b³\u0001\u0010\u0098\u0001\u001a\u0006\bé\u0001\u0010\u0092\u0001R\u001b\u00109\u001a\u00020\u00068\u0006¢\u0006\u0010\n\u0006\bê\u0001\u0010\u009d\u0001\u001a\u0006\bë\u0001\u0010\u009f\u0001R!\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u00188\u0006¢\u0006\u0010\n\u0006\bè\u0001\u0010»\u0001\u001a\u0006\bì\u0001\u0010½\u0001R\u001d\u0010=\u001a\u0004\u0018\u00010<8\u0006¢\u0006\u0010\n\u0006\bí\u0001\u0010î\u0001\u001a\u0006\bï\u0001\u0010ð\u0001R\u001b\u0010>\u001a\u00020\u001b8\u0006¢\u0006\u0010\n\u0006\bñ\u0001\u0010¿\u0001\u001a\u0006\bò\u0001\u0010\u0094\u0001R\u001b\u0010?\u001a\u00020\u001b8\u0006¢\u0006\u0010\n\u0006\bó\u0001\u0010¿\u0001\u001a\u0006\bô\u0001\u0010\u0094\u0001R\u001b\u0010@\u001a\u00020\u001b8\u0006¢\u0006\u0010\n\u0006\bõ\u0001\u0010¿\u0001\u001a\u0006\bö\u0001\u0010\u0094\u0001R!\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u00188\u0006¢\u0006\u0010\n\u0006\b÷\u0001\u0010»\u0001\u001a\u0006\bø\u0001\u0010½\u0001R\u001f\u0010C\u001a\u00060\u0002j\u0002`78\u0006¢\u0006\u0010\n\u0006\bù\u0001\u0010\u0098\u0001\u001a\u0006\bú\u0001\u0010\u0092\u0001R\u001b\u0010D\u001a\u00020\r8\u0006¢\u0006\u0010\n\u0006\b¯\u0001\u0010¨\u0001\u001a\u0006\b°\u0001\u0010©\u0001R\u001d\u0010F\u001a\u0004\u0018\u00010E8\u0006¢\u0006\u0010\n\u0006\bÀ\u0001\u0010û\u0001\u001a\u0006\bÜ\u0001\u0010ü\u0001R\u001d\u0010H\u001a\u0004\u0018\u00010G8\u0006¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010ý\u0001\u001a\u0006\bê\u0001\u0010þ\u0001R\u001b\u0010I\u001a\u00020\u00068\u0006¢\u0006\u0010\n\u0006\bÚ\u0001\u0010\u009d\u0001\u001a\u0006\bÿ\u0001\u0010\u009f\u0001R\u001b\u0010K\u001a\u00020J8\u0006¢\u0006\u0010\n\u0006\b±\u0001\u0010\u0080\u0002\u001a\u0006\bØ\u0001\u0010\u0081\u0002R\u001b\u0010L\u001a\u00020J8\u0006¢\u0006\u0010\n\u0006\b\u0082\u0002\u0010\u0080\u0002\u001a\u0006\bÐ\u0001\u0010\u0081\u0002R\u001d\u0010M\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\b\u0083\u0002\u0010\u0098\u0001\u001a\u0006\b\u0084\u0002\u0010\u0092\u0001R\u001d\u0010N\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u0098\u0001\u001a\u0006\b\u0085\u0002\u0010\u0092\u0001R\u001d\u0010P\u001a\u0004\u0018\u00010O8\u0006¢\u0006\u0010\n\u0006\b\u0086\u0002\u0010\u0087\u0002\u001a\u0006\b§\u0001\u0010\u0088\u0002R\u001b\u0010Q\u001a\u00020\u00068\u0006¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u009d\u0001\u001a\u0006\b¾\u0001\u0010\u009f\u0001R\u001d\u0010R\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\b\u0089\u0002\u0010\u0098\u0001\u001a\u0006\b\u008a\u0002\u0010\u0092\u0001R\u001d\u0010S\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\b\u008b\u0002\u0010\u0098\u0001\u001a\u0006\b\u008c\u0002\u0010\u0092\u0001R\u001b\u0010T\u001a\u00020\u00068\u0006¢\u0006\u0010\n\u0006\b\u008d\u0002\u0010\u009d\u0001\u001a\u0006\b\u008e\u0002\u0010\u009f\u0001R\u001b\u0010U\u001a\u00020\u00068\u0006¢\u0006\u0010\n\u0006\b\u008f\u0002\u0010\u009d\u0001\u001a\u0006\b\u0090\u0002\u0010\u009f\u0001R\u001d\u0010W\u001a\u0004\u0018\u00010V8\u0006¢\u0006\u0010\n\u0006\b\u0091\u0002\u0010\u0092\u0002\u001a\u0006\bá\u0001\u0010\u0093\u0002R\u001b\u0010X\u001a\u00020\r8\u0006¢\u0006\u0010\n\u0006\b\u0094\u0002\u0010¨\u0001\u001a\u0006\b\u0095\u0002\u0010©\u0001R\u001d\u0010Y\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\b\u0096\u0002\u0010\u0098\u0001\u001a\u0006\b\u0097\u0002\u0010\u0092\u0001R\u001d\u0010[\u001a\u0004\u0018\u00010Z8\u0006¢\u0006\u0010\n\u0006\b\u0098\u0002\u0010\u0099\u0002\u001a\u0006\bñ\u0001\u0010\u009a\u0002R\u001b\u0010\\\u001a\u00020\u00068\u0006¢\u0006\u0010\n\u0006\b\u009b\u0002\u0010\u009d\u0001\u001a\u0006\b\u0086\u0002\u0010\u009f\u0001R\u001d\u0010^\u001a\u0004\u0018\u00010]8\u0006¢\u0006\u0010\n\u0006\b\u009c\u0002\u0010\u009d\u0002\u001a\u0006\b£\u0001\u0010\u009e\u0002R\u001b\u0010`\u001a\u00020_8\u0006¢\u0006\u0010\n\u0006\b\u009f\u0002\u0010 \u0002\u001a\u0006\bÎ\u0001\u0010¡\u0002R\u001b\u0010a\u001a\u00020\u00028\u0006¢\u0006\u0010\n\u0006\b¢\u0002\u0010\u0098\u0001\u001a\u0006\bå\u0001\u0010\u0092\u0001R\u001b\u0010b\u001a\u00020\u00068\u0006¢\u0006\u0010\n\u0006\b£\u0002\u0010\u009d\u0001\u001a\u0006\b¤\u0002\u0010\u009f\u0001R\u001d\u0010c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\b¥\u0002\u0010\u0098\u0001\u001a\u0006\b¦\u0002\u0010\u0092\u0001R\u001d\u0010d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\b§\u0002\u0010\u0098\u0001\u001a\u0006\b¨\u0002\u0010\u0092\u0001R!\u0010f\u001a\b\u0012\u0004\u0012\u00020e0\u00188\u0006¢\u0006\u0010\n\u0006\b©\u0002\u0010»\u0001\u001a\u0006\bª\u0002\u0010½\u0001R\u001b\u0010g\u001a\u00020\u00068\u0006¢\u0006\u0010\n\u0006\b«\u0002\u0010\u009d\u0001\u001a\u0006\b¬\u0002\u0010\u009f\u0001R\u001b\u0010h\u001a\u00020\u00068\u0006¢\u0006\u0010\n\u0006\b\u00ad\u0002\u0010\u009d\u0001\u001a\u0006\b®\u0002\u0010\u009f\u0001R\u001b\u0010i\u001a\u00020\u00028\u0006¢\u0006\u0010\n\u0006\b¯\u0002\u0010\u0098\u0001\u001a\u0006\b°\u0002\u0010\u0092\u0001R\u001b\u0010j\u001a\u00020\u00028\u0006¢\u0006\u0010\n\u0006\b±\u0002\u0010\u0098\u0001\u001a\u0006\b²\u0002\u0010\u0092\u0001R!\u0010l\u001a\b\u0012\u0004\u0012\u00020k0\u00188\u0006¢\u0006\u0010\n\u0006\b³\u0002\u0010»\u0001\u001a\u0006\b´\u0002\u0010½\u0001R#\u0010n\u001a\n\u0012\u0004\u0012\u00020m\u0018\u00010\u00188\u0006¢\u0006\u0010\n\u0006\bµ\u0002\u0010»\u0001\u001a\u0006\b¶\u0002\u0010½\u0001R\u001d\u0010p\u001a\u0004\u0018\u00010o8\u0006¢\u0006\u0010\n\u0006\b·\u0002\u0010¸\u0002\u001a\u0006\bÖ\u0001\u0010¹\u0002R\u001d\u0010q\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\bº\u0002\u0010\u0098\u0001\u001a\u0006\bõ\u0001\u0010\u0092\u0001R\u001d\u0010r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\b»\u0002\u0010\u0098\u0001\u001a\u0006\b÷\u0001\u0010\u0092\u0001R\u001d\u0010s\u001a\u0004\u0018\u00010]8\u0006¢\u0006\u0010\n\u0006\b¼\u0002\u0010\u009d\u0002\u001a\u0006\bù\u0001\u0010\u009e\u0002R\u001d\u0010t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\b½\u0002\u0010\u0098\u0001\u001a\u0006\b \u0001\u0010\u0092\u0001R\u001d\u0010u\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\u0010\n\u0006\b¾\u0002\u0010¿\u0002\u001a\u0006\bÞ\u0001\u0010À\u0002R!\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006¢\u0006\u0010\n\u0006\bÁ\u0002\u0010»\u0001\u001a\u0006\b\u0082\u0002\u0010½\u0001R\u001d\u0010x\u001a\u0004\u0018\u00010w8\u0006¢\u0006\u0010\n\u0006\bÂ\u0002\u0010Ã\u0002\u001a\u0006\bæ\u0001\u0010Ä\u0002R\u001d\u0010z\u001a\u0004\u0018\u00010y8\u0006¢\u0006\u0010\n\u0006\bÅ\u0002\u0010Æ\u0002\u001a\u0006\bç\u0001\u0010Ç\u0002R\u001d\u0010{\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\bÈ\u0002\u0010\u0098\u0001\u001a\u0006\bÅ\u0001\u0010\u0092\u0001R\u001d\u0010|\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0010\n\u0006\bÉ\u0002\u0010\u0098\u0001\u001a\u0006\bÒ\u0001\u0010\u0092\u0001R\u001b\u0010}\u001a\u00020\r8\u0006¢\u0006\u0010\n\u0006\bÊ\u0002\u0010¨\u0001\u001a\u0006\b´\u0001\u0010©\u0001R\u001b\u0010~\u001a\u00020\r8\u0006¢\u0006\u0010\n\u0006\bË\u0002\u0010¨\u0001\u001a\u0006\b¶\u0001\u0010©\u0001R\u001b\u0010\u007f\u001a\u00020\r8\u0006¢\u0006\u0010\n\u0006\bÌ\u0002\u0010¨\u0001\u001a\u0006\b²\u0001\u0010©\u0001R\u001e\u0010\u0080\u0001\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u0010\n\u0006\bÍ\u0002\u0010¨\u0001\u001a\u0006\b¿\u0001\u0010©\u0001R\u001c\u0010\u0081\u0001\u001a\u00020\r8\u0006¢\u0006\u0010\n\u0006\bÎ\u0002\u0010¨\u0001\u001a\u0006\b·\u0001\u0010©\u0001R%\u0010\u0083\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0082\u0001\u0018\u00010\u00188\u0006¢\u0006\u0010\n\u0006\bÏ\u0002\u0010»\u0001\u001a\u0006\bº\u0001\u0010½\u0001R\u001f\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0006¢\u0006\u0010\n\u0006\bÐ\u0002\u0010Ñ\u0002\u001a\u0006\bÌ\u0001\u0010Ò\u0002R\u001d\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0006¢\u0006\u0010\n\u0006\bÓ\u0002\u0010Ô\u0002\u001a\u0006\bó\u0001\u0010Õ\u0002R#\u0010\u0089\u0001\u001a\t\u0012\u0005\u0012\u00030\u0088\u00010\u00188\u0006¢\u0006\u0010\n\u0006\bÖ\u0002\u0010»\u0001\u001a\u0006\bí\u0001\u0010½\u0001R\u0017\u0010Ù\u0002\u001a\u0005\u0018\u00010×\u00028F¢\u0006\b\u001a\u0006\b¸\u0001\u0010Ø\u0002R\u0014\u0010Ú\u0002\u001a\u00020\u00068F¢\u0006\b\u001a\u0006\b\u0083\u0002\u0010\u009f\u0001¨\u0006Ü\u0002"}, d2 = {"Lgj/c;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "code", "cartCode", "", "isFinal", "canDisplaySubsAndUnfulfilledItems", "name", "description", "expirationTime", "net", "Lmk/b;", "totalPriceWithTax", "totalPrice", "itemsTotal", "totalCosts", "totalTax", "subTotal", "subTotalWithoutQuoteDiscounts", "creditTransactionAmount", "deliveryCost", "extendedDeliveryCost", "", "Lej/i;", "entries", "", "totalItems", "Lej/h;", "deliveryMode", "Lci/c;", "deliveryAddress", "Lej/u;", "paymentInfo", "Lgj/j;", "appliedOrderPromotions", "appliedProductPromotions", "productDiscounts", "orderDiscounts", "quoteDiscounts", "", "quoteDiscountsRate", "quoteDiscountsType", "totalDiscounts", "LFo/c;", "totalSavings", "totalDiscountsWithQuoteDiscounts", "subTotalWithDiscounts", "site", PlaceTypes.STORE, "couponsSavings", "mperksSavings", "specialsSavings", "teamMemberSavings", "Lcom/meijer/mobile/core/model/common/Guid;", "guid", "calculated", "Lgj/r;", "appliedVouchers", "Lhj/a;", "user", "pickupItemsQuantity", "deliveryItemsQuantity", "totalUnitCount", "Lgj/e;", "orderPrices", "merchantCustomerId", "depositPrice", "LTq/c;", "pointOfService", "Lej/D;", "substitutePreference", "phoneNumberTextable", "Lfj/c;", "pickUpSlotInfo", "originalPickUpSlotInfo", "vehicleDescription", "validAgeAcknowledgementTime", "Lej/g;", "customerData", "editable", "originalOrderId", "orderNotes", "tippablePartner", "tippedAndRated", "Lgj/l;", "shopperInfo", "convenienceFee", "deliveryNote", "Lgj/m;", "tipAmount", "isMfc", "j$/time/OffsetDateTime", "created", "Lgj/f;", "orderStatus", "statusDisplay", "guestCustomer", "deliveryStatus", "deliveryStatusDisplay", "Lgj/d;", "unconsignedEntries", "cancellable", "returnable", "timeZone", "rtsCartId", "Lgj/q;", "totalTaxValues", "Lej/q;", "lightningCartReward", "Lfj/b;", "pickUpPerson", "tipAuthCode", "tipCode", "tipDate", "captureAuthCode", "rating", "unfulfilledEntries", "Lak/a;", "statusUpdateReason", "j$/time/ZonedDateTime", "statusUpdateTimestamp", "fulfillmentEligibility", "partnerEligibility", "ebtEligibleTotal", "ebtNonEligibleTotal", "ebtCapturedBalance", "rtsCapturedBalance", "ebtSurchargePrice", "Lgj/b;", "ebtTransactionList", "Lej/s;", "multiTenderPaymentInfo", "Lgj/n;", "tipAndRateDetails", "Lej/F;", "tenders", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Ljava/util/List;ILej/h;Lci/c;Lej/u;Ljava/util/List;Ljava/util/List;Lmk/b;Lmk/b;Lmk/b;DLjava/lang/String;Lmk/b;LFo/c;Lmk/b;Lmk/b;Ljava/lang/String;Ljava/lang/String;LFo/c;LFo/c;LFo/c;LFo/c;Ljava/lang/String;ZLjava/util/List;Lhj/a;IIILjava/util/List;Ljava/lang/String;Lmk/b;LTq/c;Lej/D;ZLfj/c;Lfj/c;Ljava/lang/String;Ljava/lang/String;Lej/g;ZLjava/lang/String;Ljava/lang/String;ZZLgj/l;Lmk/b;Ljava/lang/String;Lgj/m;ZLj$/time/OffsetDateTime;Lgj/f;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lfj/b;Ljava/lang/String;Ljava/lang/String;Lj$/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lak/a;Lj$/time/ZonedDateTime;Ljava/lang/String;Ljava/lang/String;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Ljava/util/List;Lej/s;Lgj/n;Ljava/util/List;)V", "Ltp/b;", "g0", "()Ltp/b;", "a", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Ljava/util/List;ILej/h;Lci/c;Lej/u;Ljava/util/List;Ljava/util/List;Lmk/b;Lmk/b;Lmk/b;DLjava/lang/String;Lmk/b;LFo/c;Lmk/b;Lmk/b;Ljava/lang/String;Ljava/lang/String;LFo/c;LFo/c;LFo/c;LFo/c;Ljava/lang/String;ZLjava/util/List;Lhj/a;IIILjava/util/List;Ljava/lang/String;Lmk/b;LTq/c;Lej/D;ZLfj/c;Lfj/c;Ljava/lang/String;Ljava/lang/String;Lej/g;ZLjava/lang/String;Ljava/lang/String;ZZLgj/l;Lmk/b;Ljava/lang/String;Lgj/m;ZLj$/time/OffsetDateTime;Lgj/f;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lfj/b;Ljava/lang/String;Ljava/lang/String;Lj$/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lak/a;Lj$/time/ZonedDateTime;Ljava/lang/String;Ljava/lang/String;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Lmk/b;Ljava/util/List;Lej/s;Lgj/n;Ljava/util/List;)Lgj/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "b", "e", "c", "Z", "e0", "()Z", "d", "getName", "getDescription", "g", "getExpirationTime", "h", "getNet", "i", "Lmk/b;", "()Lmk/b;", "j", "getTotalPrice", "k", "x", "l", "X", "m", "b0", "n", "O", "o", "getSubTotalWithoutQuoteDiscounts", "p", "q", "r", "v", "s", "Ljava/util/List;", "u", "()Ljava/util/List;", "t", "I", "Y", "Lej/h;", "()Lej/h;", "Lci/c;", "()Lci/c;", "w", "Lej/u;", "D", "()Lej/u;", "getAppliedOrderPromotions", "y", "getAppliedProductPromotions", "z", "getProductDiscounts", "A", "getOrderDiscounts", "B", "getQuoteDiscounts", "C", "getQuoteDiscountsRate", "()D", "getQuoteDiscountsType", "E", "getTotalDiscounts", "F", "LFo/c;", "a0", "()LFo/c;", "G", "getTotalDiscountsWithQuoteDiscounts", "H", "getSubTotalWithDiscounts", "getSite", "J", "getStore", "K", "getCouponsSavings", "L", "M", "N", "Q", "getGuid", "P", "getCalculated", "getAppliedVouchers", "R", "Lhj/a;", "getUser", "()Lhj/a;", "S", "getPickupItemsQuantity", "T", "getDeliveryItemsQuantity", "U", "getTotalUnitCount", "V", "getOrderPrices", "W", "getMerchantCustomerId", "LTq/c;", "()LTq/c;", "Lej/D;", "()Lej/D;", "getPhoneNumberTextable", "Lfj/c;", "()Lfj/c;", "c0", "d0", "getVehicleDescription", "getValidAgeAcknowledgementTime", "f0", "Lej/g;", "()Lej/g;", "h0", "getOriginalOrderId", "i0", "getOrderNotes", "j0", "getTippablePartner", "k0", "getTippedAndRated", "l0", "Lgj/l;", "()Lgj/l;", "m0", "getConvenienceFee", "n0", "getDeliveryNote", "o0", "Lgj/m;", "()Lgj/m;", "p0", "q0", "Lj$/time/OffsetDateTime;", "()Lj$/time/OffsetDateTime;", "r0", "Lgj/f;", "()Lgj/f;", "s0", "t0", "getGuestCustomer", "u0", "getDeliveryStatus", "v0", "getDeliveryStatusDisplay", "w0", "getUnconsignedEntries", "x0", "getCancellable", "y0", "getReturnable", "z0", "getTimeZone", "A0", "getRtsCartId", "B0", "getTotalTaxValues", "C0", "getLightningCartReward", "D0", "Lfj/b;", "()Lfj/b;", "E0", "F0", "G0", "H0", "I0", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "J0", "K0", "Lak/a;", "()Lak/a;", "L0", "Lj$/time/ZonedDateTime;", "()Lj$/time/ZonedDateTime;", "M0", "N0", "O0", "P0", "Q0", "R0", "S0", "T0", "U0", "Lej/s;", "()Lej/s;", "V0", "Lgj/n;", "()Lgj/n;", "W0", "Lej/G;", "()Lej/G;", "ebtTender", "isEbtOrder", "X0", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: gj.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class OrderDetail {

    /* renamed from: X0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b orderDiscounts;

    /* renamed from: A0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String rtsCartId;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b quoteDiscounts;

    /* renamed from: B0, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<TotalTaxValue> totalTaxValues;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quoteDiscountsRate;

    /* renamed from: C0, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<LightningCartReward> lightningCartReward;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
    private final String quoteDiscountsType;

    /* renamed from: D0, reason: collision with root package name and from kotlin metadata and from toString */
    private final PickupPerson pickUpPerson;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b totalDiscounts;

    /* renamed from: E0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tipAuthCode;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata and from toString */
    private final Savings totalSavings;

    /* renamed from: F0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tipCode;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b totalDiscountsWithQuoteDiscounts;

    /* renamed from: G0, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime tipDate;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b subTotalWithDiscounts;

    /* renamed from: H0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String captureAuthCode;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata and from toString */
    private final String site;

    /* renamed from: I0, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer rating;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata and from toString */
    private final String store;

    /* renamed from: J0, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Entry> unfulfilledEntries;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata and from toString */
    private final Savings couponsSavings;

    /* renamed from: K0, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a statusUpdateReason;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata and from toString */
    private final Savings mperksSavings;

    /* renamed from: L0, reason: collision with root package name and from kotlin metadata and from toString */
    private final ZonedDateTime statusUpdateTimestamp;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata and from toString */
    private final Savings specialsSavings;

    /* renamed from: M0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fulfillmentEligibility;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata and from toString */
    private final Savings teamMemberSavings;

    /* renamed from: N0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerEligibility;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private final String guid;

    /* renamed from: O0, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b ebtEligibleTotal;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean calculated;

    /* renamed from: P0, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b ebtNonEligibleTotal;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Voucher> appliedVouchers;

    /* renamed from: Q0, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b ebtCapturedBalance;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata and from toString */
    private final Principal user;

    /* renamed from: R0, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b rtsCapturedBalance;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata and from toString */
    private final int pickupItemsQuantity;

    /* renamed from: S0, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b ebtSurchargePrice;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata and from toString */
    private final int deliveryItemsQuantity;

    /* renamed from: T0, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<EbtTransaction> ebtTransactionList;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata and from toString */
    private final int totalUnitCount;

    /* renamed from: U0, reason: collision with root package name and from kotlin metadata and from toString */
    private final MultiTenderPaymentInfo multiTenderPaymentInfo;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<OrderPrice> orderPrices;

    /* renamed from: V0, reason: collision with root package name and from kotlin metadata and from toString */
    private final TipAndRateDetails tipAndRateDetails;

    /* renamed from: W, reason: collision with root package name and from kotlin metadata and from toString */
    private final String merchantCustomerId;

    /* renamed from: W0, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Tender> tenders;

    /* renamed from: X, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b depositPrice;

    /* renamed from: Y, reason: collision with root package name and from kotlin metadata and from toString */
    private final PointOfService pointOfService;

    /* renamed from: Z, reason: collision with root package name and from kotlin metadata and from toString */
    private final SubstitutePreference substitutePreference;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean phoneNumberTextable;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cartCode;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata and from toString */
    private final PickupSlotInfo pickUpSlotInfo;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFinal;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata and from toString */
    private final PickupSlotInfo originalPickUpSlotInfo;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean canDisplaySubsAndUnfulfilledItems;

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String vehicleDescription;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: e0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String validAgeAcknowledgementTime;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: f0, reason: collision with root package name and from kotlin metadata and from toString */
    private final CustomerData customerData;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String expirationTime;

    /* renamed from: g0, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean editable;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean net;

    /* renamed from: h0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String originalOrderId;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b totalPriceWithTax;

    /* renamed from: i0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderNotes;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b totalPrice;

    /* renamed from: j0, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean tippablePartner;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b itemsTotal;

    /* renamed from: k0, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean tippedAndRated;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b totalCosts;

    /* renamed from: l0, reason: collision with root package name and from kotlin metadata and from toString */
    private final ShopperInfo shopperInfo;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b totalTax;

    /* renamed from: m0, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b convenienceFee;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b subTotal;

    /* renamed from: n0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryNote;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b subTotalWithoutQuoteDiscounts;

    /* renamed from: o0, reason: collision with root package name and from kotlin metadata and from toString */
    private final TipAmount tipAmount;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b creditTransactionAmount;

    /* renamed from: p0, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMfc;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b deliveryCost;

    /* renamed from: q0, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime created;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b extendedDeliveryCost;

    /* renamed from: r0, reason: collision with root package name and from kotlin metadata and from toString */
    private final f orderStatus;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Entry> entries;

    /* renamed from: s0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String statusDisplay;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final int totalItems;

    /* renamed from: t0, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean guestCustomer;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryMode deliveryMode;

    /* renamed from: u0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryStatus;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final CustomerAddress deliveryAddress;

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deliveryStatusDisplay;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentDetailItem paymentInfo;

    /* renamed from: w0, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<OrderEntry> unconsignedEntries;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PromotionResult> appliedOrderPromotions;

    /* renamed from: x0, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean cancellable;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PromotionResult> appliedProductPromotions;

    /* renamed from: y0, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean returnable;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b productDiscounts;

    /* renamed from: z0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String timeZone;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgj/c$a;", "", "<init>", "()V", "Lgj/c;", "", "a", "(Lgj/c;)Z", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gj.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gj.c$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C2098a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[f.values().length];
                try {
                    iArr[f.f133633p.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[f.f133630m.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[f.f133632o.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[f.f133631n.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[f.f133628k.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[f.f133635r.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[f.f133629l.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[f.f133636s.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[f.f133623f.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public final boolean a(OrderDetail orderDetail) {
            Intrinsics.j(orderDetail, "<this>");
            switch (C2098a.$EnumSwitchMapping$0[orderDetail.getOrderStatus().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return false;
                default:
                    return true;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lgj/c$b;", "", "", "description", "<init>", "(Ljava/lang/String;II)V", "a", "I", "b", "()I", "c", "d", "e", "f", "g", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gj.c$b */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f133593b = new b("ITEMS_OOS", 0, C13671B.f128742b);

        /* renamed from: c, reason: collision with root package name */
        public static final b f133594c = new b("CANCELLATION_REQUESTED", 1, C13671B.f128744d);

        /* renamed from: d, reason: collision with root package name */
        public static final b f133595d = new b("CANCELLATION_SUBSTITUTIONS", 2, C13671B.f128745e);

        /* renamed from: e, reason: collision with root package name */
        public static final b f133596e = new b("CANCELLATION_NOT_ON_TIME", 3, C13671B.f128741a);

        /* renamed from: f, reason: collision with root package name */
        public static final b f133597f = new b("CANCELLATION_PAYMENT", 4, C13671B.f128743c);

        /* renamed from: g, reason: collision with root package name */
        public static final b f133598g = new b("CANCELLATION_GENERAL", 5, C13671B.f128746f);

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ b[] f133599h;

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f133600i;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int description;

        static {
            b[] bVarArrA = a();
            f133599h = bVarArrA;
            f133600i = EnumEntriesKt.a(bVarArrA);
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f133593b, f133594c, f133595d, f133596e, f133597f, f133598g};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f133599h.clone();
        }

        /* renamed from: b, reason: from getter */
        public final int getDescription() {
            return this.description;
        }

        private b(String str, int i10, int i11) {
            this.description = i11;
        }
    }

    public OrderDetail() {
        this(null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, 0.0d, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, 0, 0, 0, null, null, null, null, null, false, null, null, null, null, null, false, null, null, false, false, null, null, null, null, false, null, null, null, false, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, 31, null);
    }

    public static /* synthetic */ OrderDetail b(OrderDetail orderDetail, String str, String str2, boolean z10, boolean z11, String str3, String str4, String str5, boolean z12, mk.b bVar, mk.b bVar2, mk.b bVar3, mk.b bVar4, mk.b bVar5, mk.b bVar6, mk.b bVar7, mk.b bVar8, mk.b bVar9, mk.b bVar10, List list, int i10, DeliveryMode c13680h, CustomerAddress c6395c, PaymentDetailItem uVar, List list2, List list3, mk.b bVar11, mk.b bVar12, mk.b bVar13, double d10, String str6, mk.b bVar14, Savings cVar, mk.b bVar15, mk.b bVar16, String str7, String str8, Savings cVar2, Savings cVar3, Savings cVar4, Savings cVar5, String str9, boolean z13, List list4, Principal c14484a, int i11, int i12, int i13, List list5, String str10, mk.b bVar17, PointOfService cVar6, SubstitutePreference d11, boolean z14, PickupSlotInfo cVar7, PickupSlotInfo cVar8, String str11, String str12, CustomerData c13679g, boolean z15, String str13, String str14, boolean z16, boolean z17, ShopperInfo lVar, mk.b bVar18, String str15, TipAmount mVar, boolean z18, OffsetDateTime offsetDateTime, f fVar, String str16, boolean z19, String str17, String str18, List list6, boolean z20, boolean z21, String str19, String str20, List list7, List list8, PickupPerson c13911b, String str21, String str22, OffsetDateTime offsetDateTime2, String str23, Integer num, List list9, AbstractC5607a abstractC5607a, ZonedDateTime zonedDateTime, String str24, String str25, mk.b bVar19, mk.b bVar20, mk.b bVar21, mk.b bVar22, mk.b bVar23, List list10, MultiTenderPaymentInfo sVar, TipAndRateDetails nVar, List list11, int i14, int i15, int i16, int i17, Object obj) {
        mk.b bVar24;
        String str26;
        double d12;
        List list12;
        TipAndRateDetails nVar2;
        String str27;
        String str28;
        OffsetDateTime offsetDateTime3;
        String str29;
        Integer num2;
        List list13;
        AbstractC5607a abstractC5607a2;
        ZonedDateTime zonedDateTime2;
        String str30;
        String str31;
        mk.b bVar25;
        mk.b bVar26;
        mk.b bVar27;
        mk.b bVar28;
        List list14;
        MultiTenderPaymentInfo sVar2;
        mk.b bVar29;
        TipAmount mVar2;
        boolean z22;
        OffsetDateTime offsetDateTime4;
        f fVar2;
        String str32;
        boolean z23;
        String str33;
        String str34;
        List list15;
        boolean z24;
        boolean z25;
        String str35;
        String str36;
        List list16;
        List list17;
        PickupPerson c13911b2;
        ShopperInfo lVar2;
        PointOfService cVar9;
        SubstitutePreference d13;
        boolean z26;
        PickupSlotInfo cVar10;
        PickupSlotInfo cVar11;
        String str37;
        String str38;
        CustomerData c13679g2;
        boolean z27;
        String str39;
        String str40;
        boolean z28;
        boolean z29;
        mk.b bVar30;
        String str41;
        String str42;
        Savings cVar12;
        Savings cVar13;
        Savings cVar14;
        Savings cVar15;
        String str43;
        boolean z30;
        List list18;
        Principal c14484a2;
        int i18;
        int i19;
        int i20;
        List list19;
        String str44;
        mk.b bVar31;
        double d14;
        CustomerAddress c6395c2;
        PaymentDetailItem uVar2;
        List list20;
        List list21;
        mk.b bVar32;
        mk.b bVar33;
        mk.b bVar34;
        String str45;
        mk.b bVar35;
        Savings cVar16;
        mk.b bVar36;
        mk.b bVar37;
        String str46;
        mk.b bVar38;
        mk.b bVar39;
        mk.b bVar40;
        mk.b bVar41;
        mk.b bVar42;
        mk.b bVar43;
        mk.b bVar44;
        mk.b bVar45;
        mk.b bVar46;
        mk.b bVar47;
        List list22;
        int i21;
        DeliveryMode c13680h2;
        String str47;
        boolean z31;
        boolean z32;
        String str48;
        String str49;
        String str50;
        boolean z33;
        String str51 = (i14 & 1) != 0 ? orderDetail.code : str;
        String str52 = (i14 & 2) != 0 ? orderDetail.cartCode : str2;
        boolean z34 = (i14 & 4) != 0 ? orderDetail.isFinal : z10;
        boolean z35 = (i14 & 8) != 0 ? orderDetail.canDisplaySubsAndUnfulfilledItems : z11;
        String str53 = (i14 & 16) != 0 ? orderDetail.name : str3;
        String str54 = (i14 & 32) != 0 ? orderDetail.description : str4;
        String str55 = (i14 & 64) != 0 ? orderDetail.expirationTime : str5;
        boolean z36 = (i14 & 128) != 0 ? orderDetail.net : z12;
        mk.b bVar48 = (i14 & 256) != 0 ? orderDetail.totalPriceWithTax : bVar;
        mk.b bVar49 = (i14 & 512) != 0 ? orderDetail.totalPrice : bVar2;
        mk.b bVar50 = (i14 & 1024) != 0 ? orderDetail.itemsTotal : bVar3;
        mk.b bVar51 = (i14 & RecyclerView.m.FLAG_MOVED) != 0 ? orderDetail.totalCosts : bVar4;
        String str56 = str51;
        mk.b bVar52 = (i14 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? orderDetail.totalTax : bVar5;
        mk.b bVar53 = (i14 & 8192) != 0 ? orderDetail.subTotal : bVar6;
        mk.b bVar54 = (i14 & 16384) != 0 ? orderDetail.subTotalWithoutQuoteDiscounts : bVar7;
        mk.b bVar55 = (i14 & 32768) != 0 ? orderDetail.creditTransactionAmount : bVar8;
        mk.b bVar56 = (i14 & 65536) != 0 ? orderDetail.deliveryCost : bVar9;
        mk.b bVar57 = (i14 & 131072) != 0 ? orderDetail.extendedDeliveryCost : bVar10;
        List list23 = (i14 & 262144) != 0 ? orderDetail.entries : list;
        int i22 = (i14 & 524288) != 0 ? orderDetail.totalItems : i10;
        DeliveryMode c13680h3 = (i14 & 1048576) != 0 ? orderDetail.deliveryMode : c13680h;
        CustomerAddress c6395c3 = (i14 & 2097152) != 0 ? orderDetail.deliveryAddress : c6395c;
        PaymentDetailItem uVar3 = (i14 & 4194304) != 0 ? orderDetail.paymentInfo : uVar;
        List list24 = (i14 & 8388608) != 0 ? orderDetail.appliedOrderPromotions : list2;
        List list25 = (i14 & 16777216) != 0 ? orderDetail.appliedProductPromotions : list3;
        mk.b bVar58 = (i14 & 33554432) != 0 ? orderDetail.productDiscounts : bVar11;
        mk.b bVar59 = (i14 & 67108864) != 0 ? orderDetail.orderDiscounts : bVar12;
        mk.b bVar60 = (i14 & 134217728) != 0 ? orderDetail.quoteDiscounts : bVar13;
        if ((i14 & 268435456) != 0) {
            bVar24 = bVar54;
            str26 = str52;
            d12 = orderDetail.quoteDiscountsRate;
        } else {
            bVar24 = bVar54;
            str26 = str52;
            d12 = d10;
        }
        mk.b bVar61 = bVar60;
        String str57 = (i14 & 536870912) != 0 ? orderDetail.quoteDiscountsType : str6;
        mk.b bVar62 = (i14 & 1073741824) != 0 ? orderDetail.totalDiscounts : bVar14;
        Savings cVar17 = (i14 & Integer.MIN_VALUE) != 0 ? orderDetail.totalSavings : cVar;
        mk.b bVar63 = (i15 & 1) != 0 ? orderDetail.totalDiscountsWithQuoteDiscounts : bVar15;
        mk.b bVar64 = (i15 & 2) != 0 ? orderDetail.subTotalWithDiscounts : bVar16;
        String str58 = (i15 & 4) != 0 ? orderDetail.site : str7;
        String str59 = (i15 & 8) != 0 ? orderDetail.store : str8;
        Savings cVar18 = (i15 & 16) != 0 ? orderDetail.couponsSavings : cVar2;
        Savings cVar19 = (i15 & 32) != 0 ? orderDetail.mperksSavings : cVar3;
        Savings cVar20 = (i15 & 64) != 0 ? orderDetail.specialsSavings : cVar4;
        Savings cVar21 = (i15 & 128) != 0 ? orderDetail.teamMemberSavings : cVar5;
        String str60 = (i15 & 256) != 0 ? orderDetail.guid : str9;
        boolean z37 = (i15 & 512) != 0 ? orderDetail.calculated : z13;
        List list26 = (i15 & 1024) != 0 ? orderDetail.appliedVouchers : list4;
        Principal c14484a3 = (i15 & RecyclerView.m.FLAG_MOVED) != 0 ? orderDetail.user : c14484a;
        int i23 = (i15 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? orderDetail.pickupItemsQuantity : i11;
        int i24 = (i15 & 8192) != 0 ? orderDetail.deliveryItemsQuantity : i12;
        int i25 = (i15 & 16384) != 0 ? orderDetail.totalUnitCount : i13;
        List list27 = (i15 & 32768) != 0 ? orderDetail.orderPrices : list5;
        String str61 = (i15 & 65536) != 0 ? orderDetail.merchantCustomerId : str10;
        mk.b bVar65 = (i15 & 131072) != 0 ? orderDetail.depositPrice : bVar17;
        PointOfService cVar22 = (i15 & 262144) != 0 ? orderDetail.pointOfService : cVar6;
        SubstitutePreference d15 = (i15 & 524288) != 0 ? orderDetail.substitutePreference : d11;
        boolean z38 = (i15 & 1048576) != 0 ? orderDetail.phoneNumberTextable : z14;
        PickupSlotInfo cVar23 = (i15 & 2097152) != 0 ? orderDetail.pickUpSlotInfo : cVar7;
        PickupSlotInfo cVar24 = (i15 & 4194304) != 0 ? orderDetail.originalPickUpSlotInfo : cVar8;
        String str62 = (i15 & 8388608) != 0 ? orderDetail.vehicleDescription : str11;
        String str63 = (i15 & 16777216) != 0 ? orderDetail.validAgeAcknowledgementTime : str12;
        CustomerData c13679g3 = (i15 & 33554432) != 0 ? orderDetail.customerData : c13679g;
        boolean z39 = (i15 & 67108864) != 0 ? orderDetail.editable : z15;
        String str64 = (i15 & 134217728) != 0 ? orderDetail.originalOrderId : str13;
        String str65 = (i15 & 268435456) != 0 ? orderDetail.orderNotes : str14;
        boolean z40 = (i15 & 536870912) != 0 ? orderDetail.tippablePartner : z16;
        boolean z41 = (i15 & 1073741824) != 0 ? orderDetail.tippedAndRated : z17;
        ShopperInfo lVar3 = (i15 & Integer.MIN_VALUE) != 0 ? orderDetail.shopperInfo : lVar;
        boolean z42 = z41;
        mk.b bVar66 = (i16 & 1) != 0 ? orderDetail.convenienceFee : bVar18;
        String str66 = (i16 & 2) != 0 ? orderDetail.deliveryNote : str15;
        TipAmount mVar3 = (i16 & 4) != 0 ? orderDetail.tipAmount : mVar;
        boolean z43 = (i16 & 8) != 0 ? orderDetail.isMfc : z18;
        OffsetDateTime offsetDateTime5 = (i16 & 16) != 0 ? orderDetail.created : offsetDateTime;
        f fVar3 = (i16 & 32) != 0 ? orderDetail.orderStatus : fVar;
        String str67 = (i16 & 64) != 0 ? orderDetail.statusDisplay : str16;
        boolean z44 = (i16 & 128) != 0 ? orderDetail.guestCustomer : z19;
        String str68 = (i16 & 256) != 0 ? orderDetail.deliveryStatus : str17;
        String str69 = (i16 & 512) != 0 ? orderDetail.deliveryStatusDisplay : str18;
        List list28 = (i16 & 1024) != 0 ? orderDetail.unconsignedEntries : list6;
        boolean z45 = (i16 & RecyclerView.m.FLAG_MOVED) != 0 ? orderDetail.cancellable : z20;
        boolean z46 = (i16 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? orderDetail.returnable : z21;
        String str70 = (i16 & 8192) != 0 ? orderDetail.timeZone : str19;
        String str71 = (i16 & 16384) != 0 ? orderDetail.rtsCartId : str20;
        List list29 = (i16 & 32768) != 0 ? orderDetail.totalTaxValues : list7;
        List list30 = (i16 & 65536) != 0 ? orderDetail.lightningCartReward : list8;
        PickupPerson c13911b3 = (i16 & 131072) != 0 ? orderDetail.pickUpPerson : c13911b;
        String str72 = (i16 & 262144) != 0 ? orderDetail.tipAuthCode : str21;
        String str73 = (i16 & 524288) != 0 ? orderDetail.tipCode : str22;
        OffsetDateTime offsetDateTime6 = (i16 & 1048576) != 0 ? orderDetail.tipDate : offsetDateTime2;
        String str74 = (i16 & 2097152) != 0 ? orderDetail.captureAuthCode : str23;
        Integer num3 = (i16 & 4194304) != 0 ? orderDetail.rating : num;
        List list31 = (i16 & 8388608) != 0 ? orderDetail.unfulfilledEntries : list9;
        AbstractC5607a abstractC5607a3 = (i16 & 16777216) != 0 ? orderDetail.statusUpdateReason : abstractC5607a;
        ZonedDateTime zonedDateTime3 = (i16 & 33554432) != 0 ? orderDetail.statusUpdateTimestamp : zonedDateTime;
        String str75 = (i16 & 67108864) != 0 ? orderDetail.fulfillmentEligibility : str24;
        String str76 = (i16 & 134217728) != 0 ? orderDetail.partnerEligibility : str25;
        mk.b bVar67 = (i16 & 268435456) != 0 ? orderDetail.ebtEligibleTotal : bVar19;
        mk.b bVar68 = (i16 & 536870912) != 0 ? orderDetail.ebtNonEligibleTotal : bVar20;
        mk.b bVar69 = (i16 & 1073741824) != 0 ? orderDetail.ebtCapturedBalance : bVar21;
        mk.b bVar70 = (i16 & Integer.MIN_VALUE) != 0 ? orderDetail.rtsCapturedBalance : bVar22;
        mk.b bVar71 = bVar69;
        mk.b bVar72 = (i17 & 1) != 0 ? orderDetail.ebtSurchargePrice : bVar23;
        List list32 = (i17 & 2) != 0 ? orderDetail.ebtTransactionList : list10;
        MultiTenderPaymentInfo sVar3 = (i17 & 4) != 0 ? orderDetail.multiTenderPaymentInfo : sVar;
        TipAndRateDetails nVar3 = (i17 & 8) != 0 ? orderDetail.tipAndRateDetails : nVar;
        if ((i17 & 16) != 0) {
            nVar2 = nVar3;
            list12 = orderDetail.tenders;
            str28 = str73;
            offsetDateTime3 = offsetDateTime6;
            str29 = str74;
            num2 = num3;
            list13 = list31;
            abstractC5607a2 = abstractC5607a3;
            zonedDateTime2 = zonedDateTime3;
            str30 = str75;
            str31 = str76;
            bVar25 = bVar67;
            bVar26 = bVar68;
            bVar27 = bVar71;
            bVar28 = bVar72;
            list14 = list32;
            sVar2 = sVar3;
            bVar29 = bVar70;
            z22 = z43;
            offsetDateTime4 = offsetDateTime5;
            fVar2 = fVar3;
            str32 = str67;
            z23 = z44;
            str33 = str68;
            str34 = str69;
            list15 = list28;
            z24 = z45;
            z25 = z46;
            str35 = str70;
            str36 = str71;
            list16 = list29;
            list17 = list30;
            c13911b2 = c13911b3;
            str27 = str72;
            lVar2 = lVar3;
            d13 = d15;
            z26 = z38;
            cVar10 = cVar23;
            cVar11 = cVar24;
            str37 = str62;
            str38 = str63;
            c13679g2 = c13679g3;
            z27 = z39;
            str39 = str64;
            str40 = str65;
            z28 = z40;
            z29 = z42;
            bVar30 = bVar66;
            str41 = str66;
            mVar2 = mVar3;
            cVar12 = cVar18;
            cVar13 = cVar19;
            cVar14 = cVar20;
            cVar15 = cVar21;
            str43 = str60;
            z30 = z37;
            list18 = list26;
            c14484a2 = c14484a3;
            i18 = i23;
            i19 = i24;
            i20 = i25;
            list19 = list27;
            str44 = str61;
            bVar31 = bVar65;
            cVar9 = cVar22;
            d14 = d12;
            uVar2 = uVar3;
            list20 = list24;
            list21 = list25;
            bVar32 = bVar58;
            bVar33 = bVar59;
            bVar34 = bVar61;
            str45 = str57;
            bVar35 = bVar62;
            cVar16 = cVar17;
            bVar36 = bVar63;
            bVar37 = bVar64;
            str46 = str58;
            str42 = str59;
            bVar39 = bVar49;
            bVar40 = bVar50;
            bVar41 = bVar51;
            bVar42 = bVar24;
            bVar43 = bVar52;
            bVar44 = bVar53;
            bVar45 = bVar55;
            bVar46 = bVar56;
            bVar47 = bVar57;
            list22 = list23;
            i21 = i22;
            c13680h2 = c13680h3;
            c6395c2 = c6395c3;
            str47 = str26;
            z31 = z34;
            z32 = z35;
            str48 = str53;
            str49 = str54;
            str50 = str55;
            z33 = z36;
            bVar38 = bVar48;
        } else {
            list12 = list11;
            nVar2 = nVar3;
            str27 = str72;
            str28 = str73;
            offsetDateTime3 = offsetDateTime6;
            str29 = str74;
            num2 = num3;
            list13 = list31;
            abstractC5607a2 = abstractC5607a3;
            zonedDateTime2 = zonedDateTime3;
            str30 = str75;
            str31 = str76;
            bVar25 = bVar67;
            bVar26 = bVar68;
            bVar27 = bVar71;
            bVar28 = bVar72;
            list14 = list32;
            sVar2 = sVar3;
            bVar29 = bVar70;
            mVar2 = mVar3;
            z22 = z43;
            offsetDateTime4 = offsetDateTime5;
            fVar2 = fVar3;
            str32 = str67;
            z23 = z44;
            str33 = str68;
            str34 = str69;
            list15 = list28;
            z24 = z45;
            z25 = z46;
            str35 = str70;
            str36 = str71;
            list16 = list29;
            list17 = list30;
            c13911b2 = c13911b3;
            lVar2 = lVar3;
            cVar9 = cVar22;
            d13 = d15;
            z26 = z38;
            cVar10 = cVar23;
            cVar11 = cVar24;
            str37 = str62;
            str38 = str63;
            c13679g2 = c13679g3;
            z27 = z39;
            str39 = str64;
            str40 = str65;
            z28 = z40;
            z29 = z42;
            bVar30 = bVar66;
            str41 = str66;
            str42 = str59;
            cVar12 = cVar18;
            cVar13 = cVar19;
            cVar14 = cVar20;
            cVar15 = cVar21;
            str43 = str60;
            z30 = z37;
            list18 = list26;
            c14484a2 = c14484a3;
            i18 = i23;
            i19 = i24;
            i20 = i25;
            list19 = list27;
            str44 = str61;
            bVar31 = bVar65;
            d14 = d12;
            c6395c2 = c6395c3;
            uVar2 = uVar3;
            list20 = list24;
            list21 = list25;
            bVar32 = bVar58;
            bVar33 = bVar59;
            bVar34 = bVar61;
            str45 = str57;
            bVar35 = bVar62;
            cVar16 = cVar17;
            bVar36 = bVar63;
            bVar37 = bVar64;
            str46 = str58;
            bVar38 = bVar48;
            bVar39 = bVar49;
            bVar40 = bVar50;
            bVar41 = bVar51;
            bVar42 = bVar24;
            bVar43 = bVar52;
            bVar44 = bVar53;
            bVar45 = bVar55;
            bVar46 = bVar56;
            bVar47 = bVar57;
            list22 = list23;
            i21 = i22;
            c13680h2 = c13680h3;
            str47 = str26;
            z31 = z34;
            z32 = z35;
            str48 = str53;
            str49 = str54;
            str50 = str55;
            z33 = z36;
        }
        return orderDetail.a(str56, str47, z31, z32, str48, str49, str50, z33, bVar38, bVar39, bVar40, bVar41, bVar43, bVar44, bVar42, bVar45, bVar46, bVar47, list22, i21, c13680h2, c6395c2, uVar2, list20, list21, bVar32, bVar33, bVar34, d14, str45, bVar35, cVar16, bVar36, bVar37, str46, str42, cVar12, cVar13, cVar14, cVar15, str43, z30, list18, c14484a2, i18, i19, i20, list19, str44, bVar31, cVar9, d13, z26, cVar10, cVar11, str37, str38, c13679g2, z27, str39, str40, z28, z29, lVar2, bVar30, str41, mVar2, z22, offsetDateTime4, fVar2, str32, z23, str33, str34, list15, z24, z25, str35, str36, list16, list17, c13911b2, str27, str28, offsetDateTime3, str29, num2, list13, abstractC5607a2, zonedDateTime2, str30, str31, bVar25, bVar26, bVar27, bVar29, bVar28, list14, sVar2, nVar2, list12);
    }

    public final OrderDetail a(String code, String cartCode, boolean isFinal, boolean canDisplaySubsAndUnfulfilledItems, String name, String description, String expirationTime, boolean net2, mk.b totalPriceWithTax, mk.b totalPrice, mk.b itemsTotal, mk.b totalCosts, mk.b totalTax, mk.b subTotal, mk.b subTotalWithoutQuoteDiscounts, mk.b creditTransactionAmount, mk.b deliveryCost, mk.b extendedDeliveryCost, List<Entry> entries, int totalItems, DeliveryMode deliveryMode, CustomerAddress deliveryAddress, PaymentDetailItem paymentInfo, List<PromotionResult> appliedOrderPromotions, List<PromotionResult> appliedProductPromotions, mk.b productDiscounts, mk.b orderDiscounts, mk.b quoteDiscounts, double quoteDiscountsRate, String quoteDiscountsType, mk.b totalDiscounts, Savings totalSavings, mk.b totalDiscountsWithQuoteDiscounts, mk.b subTotalWithDiscounts, String site, String store, Savings couponsSavings, Savings mperksSavings, Savings specialsSavings, Savings teamMemberSavings, String guid, boolean calculated, List<Voucher> appliedVouchers, Principal user, int pickupItemsQuantity, int deliveryItemsQuantity, int totalUnitCount, List<OrderPrice> orderPrices, String merchantCustomerId, mk.b depositPrice, PointOfService pointOfService, SubstitutePreference substitutePreference, boolean phoneNumberTextable, PickupSlotInfo pickUpSlotInfo, PickupSlotInfo originalPickUpSlotInfo, String vehicleDescription, String validAgeAcknowledgementTime, CustomerData customerData, boolean editable, String originalOrderId, String orderNotes, boolean tippablePartner, boolean tippedAndRated, ShopperInfo shopperInfo, mk.b convenienceFee, String deliveryNote, TipAmount tipAmount, boolean isMfc, OffsetDateTime created, f orderStatus, String statusDisplay, boolean guestCustomer, String deliveryStatus, String deliveryStatusDisplay, List<OrderEntry> unconsignedEntries, boolean cancellable, boolean returnable, String timeZone, String rtsCartId, List<TotalTaxValue> totalTaxValues, List<LightningCartReward> lightningCartReward, PickupPerson pickUpPerson, String tipAuthCode, String tipCode, OffsetDateTime tipDate, String captureAuthCode, Integer rating, List<Entry> unfulfilledEntries, AbstractC5607a statusUpdateReason, ZonedDateTime statusUpdateTimestamp, String fulfillmentEligibility, String partnerEligibility, mk.b ebtEligibleTotal, mk.b ebtNonEligibleTotal, mk.b ebtCapturedBalance, mk.b rtsCapturedBalance, mk.b ebtSurchargePrice, List<EbtTransaction> ebtTransactionList, MultiTenderPaymentInfo multiTenderPaymentInfo, TipAndRateDetails tipAndRateDetails, List<Tender> tenders) {
        Intrinsics.j(code, "code");
        Intrinsics.j(cartCode, "cartCode");
        Intrinsics.j(totalPriceWithTax, "totalPriceWithTax");
        Intrinsics.j(totalPrice, "totalPrice");
        Intrinsics.j(itemsTotal, "itemsTotal");
        Intrinsics.j(totalCosts, "totalCosts");
        Intrinsics.j(totalTax, "totalTax");
        Intrinsics.j(subTotal, "subTotal");
        Intrinsics.j(subTotalWithoutQuoteDiscounts, "subTotalWithoutQuoteDiscounts");
        Intrinsics.j(deliveryCost, "deliveryCost");
        Intrinsics.j(entries, "entries");
        Intrinsics.j(appliedOrderPromotions, "appliedOrderPromotions");
        Intrinsics.j(appliedProductPromotions, "appliedProductPromotions");
        Intrinsics.j(productDiscounts, "productDiscounts");
        Intrinsics.j(orderDiscounts, "orderDiscounts");
        Intrinsics.j(quoteDiscounts, "quoteDiscounts");
        Intrinsics.j(quoteDiscountsType, "quoteDiscountsType");
        Intrinsics.j(totalDiscounts, "totalDiscounts");
        Intrinsics.j(totalSavings, "totalSavings");
        Intrinsics.j(totalDiscountsWithQuoteDiscounts, "totalDiscountsWithQuoteDiscounts");
        Intrinsics.j(site, "site");
        Intrinsics.j(store, "store");
        Intrinsics.j(couponsSavings, "couponsSavings");
        Intrinsics.j(mperksSavings, "mperksSavings");
        Intrinsics.j(specialsSavings, "specialsSavings");
        Intrinsics.j(teamMemberSavings, "teamMemberSavings");
        Intrinsics.j(guid, "guid");
        Intrinsics.j(appliedVouchers, "appliedVouchers");
        Intrinsics.j(orderPrices, "orderPrices");
        Intrinsics.j(merchantCustomerId, "merchantCustomerId");
        Intrinsics.j(depositPrice, "depositPrice");
        Intrinsics.j(pickUpSlotInfo, "pickUpSlotInfo");
        Intrinsics.j(originalPickUpSlotInfo, "originalPickUpSlotInfo");
        Intrinsics.j(convenienceFee, "convenienceFee");
        Intrinsics.j(orderStatus, "orderStatus");
        Intrinsics.j(statusDisplay, "statusDisplay");
        Intrinsics.j(unconsignedEntries, "unconsignedEntries");
        Intrinsics.j(timeZone, "timeZone");
        Intrinsics.j(rtsCartId, "rtsCartId");
        Intrinsics.j(totalTaxValues, "totalTaxValues");
        Intrinsics.j(unfulfilledEntries, "unfulfilledEntries");
        Intrinsics.j(ebtEligibleTotal, "ebtEligibleTotal");
        Intrinsics.j(ebtNonEligibleTotal, "ebtNonEligibleTotal");
        Intrinsics.j(ebtCapturedBalance, "ebtCapturedBalance");
        Intrinsics.j(ebtSurchargePrice, "ebtSurchargePrice");
        Intrinsics.j(tipAndRateDetails, "tipAndRateDetails");
        Intrinsics.j(tenders, "tenders");
        return new OrderDetail(code, cartCode, isFinal, canDisplaySubsAndUnfulfilledItems, name, description, expirationTime, net2, totalPriceWithTax, totalPrice, itemsTotal, totalCosts, totalTax, subTotal, subTotalWithoutQuoteDiscounts, creditTransactionAmount, deliveryCost, extendedDeliveryCost, entries, totalItems, deliveryMode, deliveryAddress, paymentInfo, appliedOrderPromotions, appliedProductPromotions, productDiscounts, orderDiscounts, quoteDiscounts, quoteDiscountsRate, quoteDiscountsType, totalDiscounts, totalSavings, totalDiscountsWithQuoteDiscounts, subTotalWithDiscounts, site, store, couponsSavings, mperksSavings, specialsSavings, teamMemberSavings, guid, calculated, appliedVouchers, user, pickupItemsQuantity, deliveryItemsQuantity, totalUnitCount, orderPrices, merchantCustomerId, depositPrice, pointOfService, substitutePreference, phoneNumberTextable, pickUpSlotInfo, originalPickUpSlotInfo, vehicleDescription, validAgeAcknowledgementTime, customerData, editable, originalOrderId, orderNotes, tippablePartner, tippedAndRated, shopperInfo, convenienceFee, deliveryNote, tipAmount, isMfc, created, orderStatus, statusDisplay, guestCustomer, deliveryStatus, deliveryStatusDisplay, unconsignedEntries, cancellable, returnable, timeZone, rtsCartId, totalTaxValues, lightningCartReward, pickUpPerson, tipAuthCode, tipCode, tipDate, captureAuthCode, rating, unfulfilledEntries, statusUpdateReason, statusUpdateTimestamp, fulfillmentEligibility, partnerEligibility, ebtEligibleTotal, ebtNonEligibleTotal, ebtCapturedBalance, rtsCapturedBalance, ebtSurchargePrice, ebtTransactionList, multiTenderPaymentInfo, tipAndRateDetails, tenders);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDetail)) {
            return false;
        }
        OrderDetail orderDetail = (OrderDetail) other;
        return Intrinsics.e(this.code, orderDetail.code) && Intrinsics.e(this.cartCode, orderDetail.cartCode) && this.isFinal == orderDetail.isFinal && this.canDisplaySubsAndUnfulfilledItems == orderDetail.canDisplaySubsAndUnfulfilledItems && Intrinsics.e(this.name, orderDetail.name) && Intrinsics.e(this.description, orderDetail.description) && Intrinsics.e(this.expirationTime, orderDetail.expirationTime) && this.net == orderDetail.net && Intrinsics.e(this.totalPriceWithTax, orderDetail.totalPriceWithTax) && Intrinsics.e(this.totalPrice, orderDetail.totalPrice) && Intrinsics.e(this.itemsTotal, orderDetail.itemsTotal) && Intrinsics.e(this.totalCosts, orderDetail.totalCosts) && Intrinsics.e(this.totalTax, orderDetail.totalTax) && Intrinsics.e(this.subTotal, orderDetail.subTotal) && Intrinsics.e(this.subTotalWithoutQuoteDiscounts, orderDetail.subTotalWithoutQuoteDiscounts) && Intrinsics.e(this.creditTransactionAmount, orderDetail.creditTransactionAmount) && Intrinsics.e(this.deliveryCost, orderDetail.deliveryCost) && Intrinsics.e(this.extendedDeliveryCost, orderDetail.extendedDeliveryCost) && Intrinsics.e(this.entries, orderDetail.entries) && this.totalItems == orderDetail.totalItems && Intrinsics.e(this.deliveryMode, orderDetail.deliveryMode) && Intrinsics.e(this.deliveryAddress, orderDetail.deliveryAddress) && Intrinsics.e(this.paymentInfo, orderDetail.paymentInfo) && Intrinsics.e(this.appliedOrderPromotions, orderDetail.appliedOrderPromotions) && Intrinsics.e(this.appliedProductPromotions, orderDetail.appliedProductPromotions) && Intrinsics.e(this.productDiscounts, orderDetail.productDiscounts) && Intrinsics.e(this.orderDiscounts, orderDetail.orderDiscounts) && Intrinsics.e(this.quoteDiscounts, orderDetail.quoteDiscounts) && Double.compare(this.quoteDiscountsRate, orderDetail.quoteDiscountsRate) == 0 && Intrinsics.e(this.quoteDiscountsType, orderDetail.quoteDiscountsType) && Intrinsics.e(this.totalDiscounts, orderDetail.totalDiscounts) && Intrinsics.e(this.totalSavings, orderDetail.totalSavings) && Intrinsics.e(this.totalDiscountsWithQuoteDiscounts, orderDetail.totalDiscountsWithQuoteDiscounts) && Intrinsics.e(this.subTotalWithDiscounts, orderDetail.subTotalWithDiscounts) && Intrinsics.e(this.site, orderDetail.site) && Intrinsics.e(this.store, orderDetail.store) && Intrinsics.e(this.couponsSavings, orderDetail.couponsSavings) && Intrinsics.e(this.mperksSavings, orderDetail.mperksSavings) && Intrinsics.e(this.specialsSavings, orderDetail.specialsSavings) && Intrinsics.e(this.teamMemberSavings, orderDetail.teamMemberSavings) && Intrinsics.e(this.guid, orderDetail.guid) && this.calculated == orderDetail.calculated && Intrinsics.e(this.appliedVouchers, orderDetail.appliedVouchers) && Intrinsics.e(this.user, orderDetail.user) && this.pickupItemsQuantity == orderDetail.pickupItemsQuantity && this.deliveryItemsQuantity == orderDetail.deliveryItemsQuantity && this.totalUnitCount == orderDetail.totalUnitCount && Intrinsics.e(this.orderPrices, orderDetail.orderPrices) && Intrinsics.e(this.merchantCustomerId, orderDetail.merchantCustomerId) && Intrinsics.e(this.depositPrice, orderDetail.depositPrice) && Intrinsics.e(this.pointOfService, orderDetail.pointOfService) && Intrinsics.e(this.substitutePreference, orderDetail.substitutePreference) && this.phoneNumberTextable == orderDetail.phoneNumberTextable && Intrinsics.e(this.pickUpSlotInfo, orderDetail.pickUpSlotInfo) && Intrinsics.e(this.originalPickUpSlotInfo, orderDetail.originalPickUpSlotInfo) && Intrinsics.e(this.vehicleDescription, orderDetail.vehicleDescription) && Intrinsics.e(this.validAgeAcknowledgementTime, orderDetail.validAgeAcknowledgementTime) && Intrinsics.e(this.customerData, orderDetail.customerData) && this.editable == orderDetail.editable && Intrinsics.e(this.originalOrderId, orderDetail.originalOrderId) && Intrinsics.e(this.orderNotes, orderDetail.orderNotes) && this.tippablePartner == orderDetail.tippablePartner && this.tippedAndRated == orderDetail.tippedAndRated && Intrinsics.e(this.shopperInfo, orderDetail.shopperInfo) && Intrinsics.e(this.convenienceFee, orderDetail.convenienceFee) && Intrinsics.e(this.deliveryNote, orderDetail.deliveryNote) && Intrinsics.e(this.tipAmount, orderDetail.tipAmount) && this.isMfc == orderDetail.isMfc && Intrinsics.e(this.created, orderDetail.created) && this.orderStatus == orderDetail.orderStatus && Intrinsics.e(this.statusDisplay, orderDetail.statusDisplay) && this.guestCustomer == orderDetail.guestCustomer && Intrinsics.e(this.deliveryStatus, orderDetail.deliveryStatus) && Intrinsics.e(this.deliveryStatusDisplay, orderDetail.deliveryStatusDisplay) && Intrinsics.e(this.unconsignedEntries, orderDetail.unconsignedEntries) && this.cancellable == orderDetail.cancellable && this.returnable == orderDetail.returnable && Intrinsics.e(this.timeZone, orderDetail.timeZone) && Intrinsics.e(this.rtsCartId, orderDetail.rtsCartId) && Intrinsics.e(this.totalTaxValues, orderDetail.totalTaxValues) && Intrinsics.e(this.lightningCartReward, orderDetail.lightningCartReward) && Intrinsics.e(this.pickUpPerson, orderDetail.pickUpPerson) && Intrinsics.e(this.tipAuthCode, orderDetail.tipAuthCode) && Intrinsics.e(this.tipCode, orderDetail.tipCode) && Intrinsics.e(this.tipDate, orderDetail.tipDate) && Intrinsics.e(this.captureAuthCode, orderDetail.captureAuthCode) && Intrinsics.e(this.rating, orderDetail.rating) && Intrinsics.e(this.unfulfilledEntries, orderDetail.unfulfilledEntries) && Intrinsics.e(this.statusUpdateReason, orderDetail.statusUpdateReason) && Intrinsics.e(this.statusUpdateTimestamp, orderDetail.statusUpdateTimestamp) && Intrinsics.e(this.fulfillmentEligibility, orderDetail.fulfillmentEligibility) && Intrinsics.e(this.partnerEligibility, orderDetail.partnerEligibility) && Intrinsics.e(this.ebtEligibleTotal, orderDetail.ebtEligibleTotal) && Intrinsics.e(this.ebtNonEligibleTotal, orderDetail.ebtNonEligibleTotal) && Intrinsics.e(this.ebtCapturedBalance, orderDetail.ebtCapturedBalance) && Intrinsics.e(this.rtsCapturedBalance, orderDetail.rtsCapturedBalance) && Intrinsics.e(this.ebtSurchargePrice, orderDetail.ebtSurchargePrice) && Intrinsics.e(this.ebtTransactionList, orderDetail.ebtTransactionList) && Intrinsics.e(this.multiTenderPaymentInfo, orderDetail.multiTenderPaymentInfo) && Intrinsics.e(this.tipAndRateDetails, orderDetail.tipAndRateDetails) && Intrinsics.e(this.tenders, orderDetail.tenders);
    }

    public int hashCode() {
        int iHashCode = ((((((this.code.hashCode() * 31) + this.cartCode.hashCode()) * 31) + Boolean.hashCode(this.isFinal)) * 31) + Boolean.hashCode(this.canDisplaySubsAndUnfulfilledItems)) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.expirationTime;
        int iHashCode4 = (((((((((((((((((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.net)) * 31) + this.totalPriceWithTax.hashCode()) * 31) + this.totalPrice.hashCode()) * 31) + this.itemsTotal.hashCode()) * 31) + this.totalCosts.hashCode()) * 31) + this.totalTax.hashCode()) * 31) + this.subTotal.hashCode()) * 31) + this.subTotalWithoutQuoteDiscounts.hashCode()) * 31;
        mk.b bVar = this.creditTransactionAmount;
        int iHashCode5 = (((iHashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.deliveryCost.hashCode()) * 31;
        mk.b bVar2 = this.extendedDeliveryCost;
        int iHashCode6 = (((((iHashCode5 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31) + this.entries.hashCode()) * 31) + Integer.hashCode(this.totalItems)) * 31;
        DeliveryMode c13680h = this.deliveryMode;
        int iHashCode7 = (iHashCode6 + (c13680h == null ? 0 : c13680h.hashCode())) * 31;
        CustomerAddress c6395c = this.deliveryAddress;
        int iHashCode8 = (iHashCode7 + (c6395c == null ? 0 : c6395c.hashCode())) * 31;
        PaymentDetailItem uVar = this.paymentInfo;
        int iHashCode9 = (((((((((((((((((((((iHashCode8 + (uVar == null ? 0 : uVar.hashCode())) * 31) + this.appliedOrderPromotions.hashCode()) * 31) + this.appliedProductPromotions.hashCode()) * 31) + this.productDiscounts.hashCode()) * 31) + this.orderDiscounts.hashCode()) * 31) + this.quoteDiscounts.hashCode()) * 31) + Double.hashCode(this.quoteDiscountsRate)) * 31) + this.quoteDiscountsType.hashCode()) * 31) + this.totalDiscounts.hashCode()) * 31) + this.totalSavings.hashCode()) * 31) + this.totalDiscountsWithQuoteDiscounts.hashCode()) * 31;
        mk.b bVar3 = this.subTotalWithDiscounts;
        int iHashCode10 = (((((((((((((((((((iHashCode9 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31) + this.site.hashCode()) * 31) + this.store.hashCode()) * 31) + this.couponsSavings.hashCode()) * 31) + this.mperksSavings.hashCode()) * 31) + this.specialsSavings.hashCode()) * 31) + this.teamMemberSavings.hashCode()) * 31) + this.guid.hashCode()) * 31) + Boolean.hashCode(this.calculated)) * 31) + this.appliedVouchers.hashCode()) * 31;
        Principal c14484a = this.user;
        int iHashCode11 = (((((((((((((iHashCode10 + (c14484a == null ? 0 : c14484a.hashCode())) * 31) + Integer.hashCode(this.pickupItemsQuantity)) * 31) + Integer.hashCode(this.deliveryItemsQuantity)) * 31) + Integer.hashCode(this.totalUnitCount)) * 31) + this.orderPrices.hashCode()) * 31) + this.merchantCustomerId.hashCode()) * 31) + this.depositPrice.hashCode()) * 31;
        PointOfService cVar = this.pointOfService;
        int iHashCode12 = (iHashCode11 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        SubstitutePreference d10 = this.substitutePreference;
        int iHashCode13 = (((((((iHashCode12 + (d10 == null ? 0 : d10.hashCode())) * 31) + Boolean.hashCode(this.phoneNumberTextable)) * 31) + this.pickUpSlotInfo.hashCode()) * 31) + this.originalPickUpSlotInfo.hashCode()) * 31;
        String str4 = this.vehicleDescription;
        int iHashCode14 = (iHashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.validAgeAcknowledgementTime;
        int iHashCode15 = (iHashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        CustomerData c13679g = this.customerData;
        int iHashCode16 = (((iHashCode15 + (c13679g == null ? 0 : c13679g.hashCode())) * 31) + Boolean.hashCode(this.editable)) * 31;
        String str6 = this.originalOrderId;
        int iHashCode17 = (iHashCode16 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.orderNotes;
        int iHashCode18 = (((((iHashCode17 + (str7 == null ? 0 : str7.hashCode())) * 31) + Boolean.hashCode(this.tippablePartner)) * 31) + Boolean.hashCode(this.tippedAndRated)) * 31;
        ShopperInfo lVar = this.shopperInfo;
        int iHashCode19 = (((iHashCode18 + (lVar == null ? 0 : lVar.hashCode())) * 31) + this.convenienceFee.hashCode()) * 31;
        String str8 = this.deliveryNote;
        int iHashCode20 = (iHashCode19 + (str8 == null ? 0 : str8.hashCode())) * 31;
        TipAmount mVar = this.tipAmount;
        int iHashCode21 = (((iHashCode20 + (mVar == null ? 0 : mVar.hashCode())) * 31) + Boolean.hashCode(this.isMfc)) * 31;
        OffsetDateTime offsetDateTime = this.created;
        int iHashCode22 = (((((((iHashCode21 + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31) + this.orderStatus.hashCode()) * 31) + this.statusDisplay.hashCode()) * 31) + Boolean.hashCode(this.guestCustomer)) * 31;
        String str9 = this.deliveryStatus;
        int iHashCode23 = (iHashCode22 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.deliveryStatusDisplay;
        int iHashCode24 = (((((((((((((iHashCode23 + (str10 == null ? 0 : str10.hashCode())) * 31) + this.unconsignedEntries.hashCode()) * 31) + Boolean.hashCode(this.cancellable)) * 31) + Boolean.hashCode(this.returnable)) * 31) + this.timeZone.hashCode()) * 31) + this.rtsCartId.hashCode()) * 31) + this.totalTaxValues.hashCode()) * 31;
        List<LightningCartReward> list = this.lightningCartReward;
        int iHashCode25 = (iHashCode24 + (list == null ? 0 : list.hashCode())) * 31;
        PickupPerson c13911b = this.pickUpPerson;
        int iHashCode26 = (iHashCode25 + (c13911b == null ? 0 : c13911b.hashCode())) * 31;
        String str11 = this.tipAuthCode;
        int iHashCode27 = (iHashCode26 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.tipCode;
        int iHashCode28 = (iHashCode27 + (str12 == null ? 0 : str12.hashCode())) * 31;
        OffsetDateTime offsetDateTime2 = this.tipDate;
        int iHashCode29 = (iHashCode28 + (offsetDateTime2 == null ? 0 : offsetDateTime2.hashCode())) * 31;
        String str13 = this.captureAuthCode;
        int iHashCode30 = (iHashCode29 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num = this.rating;
        int iHashCode31 = (((iHashCode30 + (num == null ? 0 : num.hashCode())) * 31) + this.unfulfilledEntries.hashCode()) * 31;
        AbstractC5607a abstractC5607a = this.statusUpdateReason;
        int iHashCode32 = (iHashCode31 + (abstractC5607a == null ? 0 : abstractC5607a.hashCode())) * 31;
        ZonedDateTime zonedDateTime = this.statusUpdateTimestamp;
        int iHashCode33 = (iHashCode32 + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        String str14 = this.fulfillmentEligibility;
        int iHashCode34 = (iHashCode33 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.partnerEligibility;
        int iHashCode35 = (((((((iHashCode34 + (str15 == null ? 0 : str15.hashCode())) * 31) + this.ebtEligibleTotal.hashCode()) * 31) + this.ebtNonEligibleTotal.hashCode()) * 31) + this.ebtCapturedBalance.hashCode()) * 31;
        mk.b bVar4 = this.rtsCapturedBalance;
        int iHashCode36 = (((iHashCode35 + (bVar4 == null ? 0 : bVar4.hashCode())) * 31) + this.ebtSurchargePrice.hashCode()) * 31;
        List<EbtTransaction> list2 = this.ebtTransactionList;
        int iHashCode37 = (iHashCode36 + (list2 == null ? 0 : list2.hashCode())) * 31;
        MultiTenderPaymentInfo sVar = this.multiTenderPaymentInfo;
        return ((((iHashCode37 + (sVar != null ? sVar.hashCode() : 0)) * 31) + this.tipAndRateDetails.hashCode()) * 31) + this.tenders.hashCode();
    }

    public String toString() {
        return "OrderDetail(code=" + this.code + ", cartCode=" + this.cartCode + ", isFinal=" + this.isFinal + ", canDisplaySubsAndUnfulfilledItems=" + this.canDisplaySubsAndUnfulfilledItems + ", name=" + this.name + ", description=" + this.description + ", expirationTime=" + this.expirationTime + ", net=" + this.net + ", totalPriceWithTax=" + this.totalPriceWithTax + ", totalPrice=" + this.totalPrice + ", itemsTotal=" + this.itemsTotal + ", totalCosts=" + this.totalCosts + ", totalTax=" + this.totalTax + ", subTotal=" + this.subTotal + ", subTotalWithoutQuoteDiscounts=" + this.subTotalWithoutQuoteDiscounts + ", creditTransactionAmount=" + this.creditTransactionAmount + ", deliveryCost=" + this.deliveryCost + ", extendedDeliveryCost=" + this.extendedDeliveryCost + ", entries=" + this.entries + ", totalItems=" + this.totalItems + ", deliveryMode=" + this.deliveryMode + ", deliveryAddress=" + this.deliveryAddress + ", paymentInfo=" + this.paymentInfo + ", appliedOrderPromotions=" + this.appliedOrderPromotions + ", appliedProductPromotions=" + this.appliedProductPromotions + ", productDiscounts=" + this.productDiscounts + ", orderDiscounts=" + this.orderDiscounts + ", quoteDiscounts=" + this.quoteDiscounts + ", quoteDiscountsRate=" + this.quoteDiscountsRate + ", quoteDiscountsType=" + this.quoteDiscountsType + ", totalDiscounts=" + this.totalDiscounts + ", totalSavings=" + this.totalSavings + ", totalDiscountsWithQuoteDiscounts=" + this.totalDiscountsWithQuoteDiscounts + ", subTotalWithDiscounts=" + this.subTotalWithDiscounts + ", site=" + this.site + ", store=" + this.store + ", couponsSavings=" + this.couponsSavings + ", mperksSavings=" + this.mperksSavings + ", specialsSavings=" + this.specialsSavings + ", teamMemberSavings=" + this.teamMemberSavings + ", guid=" + this.guid + ", calculated=" + this.calculated + ", appliedVouchers=" + this.appliedVouchers + ", user=" + this.user + ", pickupItemsQuantity=" + this.pickupItemsQuantity + ", deliveryItemsQuantity=" + this.deliveryItemsQuantity + ", totalUnitCount=" + this.totalUnitCount + ", orderPrices=" + this.orderPrices + ", merchantCustomerId=" + this.merchantCustomerId + ", depositPrice=" + this.depositPrice + ", pointOfService=" + this.pointOfService + ", substitutePreference=" + this.substitutePreference + ", phoneNumberTextable=" + this.phoneNumberTextable + ", pickUpSlotInfo=" + this.pickUpSlotInfo + ", originalPickUpSlotInfo=" + this.originalPickUpSlotInfo + ", vehicleDescription=" + this.vehicleDescription + ", validAgeAcknowledgementTime=" + this.validAgeAcknowledgementTime + ", customerData=" + this.customerData + ", editable=" + this.editable + ", originalOrderId=" + this.originalOrderId + ", orderNotes=" + this.orderNotes + ", tippablePartner=" + this.tippablePartner + ", tippedAndRated=" + this.tippedAndRated + ", shopperInfo=" + this.shopperInfo + ", convenienceFee=" + this.convenienceFee + ", deliveryNote=" + this.deliveryNote + ", tipAmount=" + this.tipAmount + ", isMfc=" + this.isMfc + ", created=" + this.created + ", orderStatus=" + this.orderStatus + ", statusDisplay=" + this.statusDisplay + ", guestCustomer=" + this.guestCustomer + ", deliveryStatus=" + this.deliveryStatus + ", deliveryStatusDisplay=" + this.deliveryStatusDisplay + ", unconsignedEntries=" + this.unconsignedEntries + ", cancellable=" + this.cancellable + ", returnable=" + this.returnable + ", timeZone=" + this.timeZone + ", rtsCartId=" + this.rtsCartId + ", totalTaxValues=" + this.totalTaxValues + ", lightningCartReward=" + this.lightningCartReward + ", pickUpPerson=" + this.pickUpPerson + ", tipAuthCode=" + this.tipAuthCode + ", tipCode=" + this.tipCode + ", tipDate=" + this.tipDate + ", captureAuthCode=" + this.captureAuthCode + ", rating=" + this.rating + ", unfulfilledEntries=" + this.unfulfilledEntries + ", statusUpdateReason=" + this.statusUpdateReason + ", statusUpdateTimestamp=" + this.statusUpdateTimestamp + ", fulfillmentEligibility=" + this.fulfillmentEligibility + ", partnerEligibility=" + this.partnerEligibility + ", ebtEligibleTotal=" + this.ebtEligibleTotal + ", ebtNonEligibleTotal=" + this.ebtNonEligibleTotal + ", ebtCapturedBalance=" + this.ebtCapturedBalance + ", rtsCapturedBalance=" + this.rtsCapturedBalance + ", ebtSurchargePrice=" + this.ebtSurchargePrice + ", ebtTransactionList=" + this.ebtTransactionList + ", multiTenderPaymentInfo=" + this.multiTenderPaymentInfo + ", tipAndRateDetails=" + this.tipAndRateDetails + ", tenders=" + this.tenders + ')';
    }

    public OrderDetail(String code, String cartCode, boolean z10, boolean z11, String str, String str2, String str3, boolean z12, mk.b totalPriceWithTax, mk.b totalPrice, mk.b itemsTotal, mk.b totalCosts, mk.b totalTax, mk.b subTotal, mk.b subTotalWithoutQuoteDiscounts, mk.b bVar, mk.b deliveryCost, mk.b bVar2, List<Entry> entries, int i10, DeliveryMode c13680h, CustomerAddress c6395c, PaymentDetailItem uVar, List<PromotionResult> appliedOrderPromotions, List<PromotionResult> appliedProductPromotions, mk.b productDiscounts, mk.b orderDiscounts, mk.b quoteDiscounts, double d10, String quoteDiscountsType, mk.b totalDiscounts, Savings totalSavings, mk.b totalDiscountsWithQuoteDiscounts, mk.b bVar3, String site, String store, Savings couponsSavings, Savings mperksSavings, Savings specialsSavings, Savings teamMemberSavings, String guid, boolean z13, List<Voucher> appliedVouchers, Principal c14484a, int i11, int i12, int i13, List<OrderPrice> orderPrices, String merchantCustomerId, mk.b depositPrice, PointOfService cVar, SubstitutePreference d11, boolean z14, PickupSlotInfo pickUpSlotInfo, PickupSlotInfo originalPickUpSlotInfo, String str4, String str5, CustomerData c13679g, boolean z15, String str6, String str7, boolean z16, boolean z17, ShopperInfo lVar, mk.b convenienceFee, String str8, TipAmount mVar, boolean z18, OffsetDateTime offsetDateTime, f orderStatus, String statusDisplay, boolean z19, String str9, String str10, List<OrderEntry> unconsignedEntries, boolean z20, boolean z21, String timeZone, String rtsCartId, List<TotalTaxValue> totalTaxValues, List<LightningCartReward> list, PickupPerson c13911b, String str11, String str12, OffsetDateTime offsetDateTime2, String str13, Integer num, List<Entry> unfulfilledEntries, AbstractC5607a abstractC5607a, ZonedDateTime zonedDateTime, String str14, String str15, mk.b ebtEligibleTotal, mk.b ebtNonEligibleTotal, mk.b ebtCapturedBalance, mk.b bVar4, mk.b ebtSurchargePrice, List<EbtTransaction> list2, MultiTenderPaymentInfo sVar, TipAndRateDetails tipAndRateDetails, List<Tender> tenders) {
        Intrinsics.j(code, "code");
        Intrinsics.j(cartCode, "cartCode");
        Intrinsics.j(totalPriceWithTax, "totalPriceWithTax");
        Intrinsics.j(totalPrice, "totalPrice");
        Intrinsics.j(itemsTotal, "itemsTotal");
        Intrinsics.j(totalCosts, "totalCosts");
        Intrinsics.j(totalTax, "totalTax");
        Intrinsics.j(subTotal, "subTotal");
        Intrinsics.j(subTotalWithoutQuoteDiscounts, "subTotalWithoutQuoteDiscounts");
        Intrinsics.j(deliveryCost, "deliveryCost");
        Intrinsics.j(entries, "entries");
        Intrinsics.j(appliedOrderPromotions, "appliedOrderPromotions");
        Intrinsics.j(appliedProductPromotions, "appliedProductPromotions");
        Intrinsics.j(productDiscounts, "productDiscounts");
        Intrinsics.j(orderDiscounts, "orderDiscounts");
        Intrinsics.j(quoteDiscounts, "quoteDiscounts");
        Intrinsics.j(quoteDiscountsType, "quoteDiscountsType");
        Intrinsics.j(totalDiscounts, "totalDiscounts");
        Intrinsics.j(totalSavings, "totalSavings");
        Intrinsics.j(totalDiscountsWithQuoteDiscounts, "totalDiscountsWithQuoteDiscounts");
        Intrinsics.j(site, "site");
        Intrinsics.j(store, "store");
        Intrinsics.j(couponsSavings, "couponsSavings");
        Intrinsics.j(mperksSavings, "mperksSavings");
        Intrinsics.j(specialsSavings, "specialsSavings");
        Intrinsics.j(teamMemberSavings, "teamMemberSavings");
        Intrinsics.j(guid, "guid");
        Intrinsics.j(appliedVouchers, "appliedVouchers");
        Intrinsics.j(orderPrices, "orderPrices");
        Intrinsics.j(merchantCustomerId, "merchantCustomerId");
        Intrinsics.j(depositPrice, "depositPrice");
        Intrinsics.j(pickUpSlotInfo, "pickUpSlotInfo");
        Intrinsics.j(originalPickUpSlotInfo, "originalPickUpSlotInfo");
        Intrinsics.j(convenienceFee, "convenienceFee");
        Intrinsics.j(orderStatus, "orderStatus");
        Intrinsics.j(statusDisplay, "statusDisplay");
        Intrinsics.j(unconsignedEntries, "unconsignedEntries");
        Intrinsics.j(timeZone, "timeZone");
        Intrinsics.j(rtsCartId, "rtsCartId");
        Intrinsics.j(totalTaxValues, "totalTaxValues");
        Intrinsics.j(unfulfilledEntries, "unfulfilledEntries");
        Intrinsics.j(ebtEligibleTotal, "ebtEligibleTotal");
        Intrinsics.j(ebtNonEligibleTotal, "ebtNonEligibleTotal");
        Intrinsics.j(ebtCapturedBalance, "ebtCapturedBalance");
        Intrinsics.j(ebtSurchargePrice, "ebtSurchargePrice");
        Intrinsics.j(tipAndRateDetails, "tipAndRateDetails");
        Intrinsics.j(tenders, "tenders");
        this.code = code;
        this.cartCode = cartCode;
        this.isFinal = z10;
        this.canDisplaySubsAndUnfulfilledItems = z11;
        this.name = str;
        this.description = str2;
        this.expirationTime = str3;
        this.net = z12;
        this.totalPriceWithTax = totalPriceWithTax;
        this.totalPrice = totalPrice;
        this.itemsTotal = itemsTotal;
        this.totalCosts = totalCosts;
        this.totalTax = totalTax;
        this.subTotal = subTotal;
        this.subTotalWithoutQuoteDiscounts = subTotalWithoutQuoteDiscounts;
        this.creditTransactionAmount = bVar;
        this.deliveryCost = deliveryCost;
        this.extendedDeliveryCost = bVar2;
        this.entries = entries;
        this.totalItems = i10;
        this.deliveryMode = c13680h;
        this.deliveryAddress = c6395c;
        this.paymentInfo = uVar;
        this.appliedOrderPromotions = appliedOrderPromotions;
        this.appliedProductPromotions = appliedProductPromotions;
        this.productDiscounts = productDiscounts;
        this.orderDiscounts = orderDiscounts;
        this.quoteDiscounts = quoteDiscounts;
        this.quoteDiscountsRate = d10;
        this.quoteDiscountsType = quoteDiscountsType;
        this.totalDiscounts = totalDiscounts;
        this.totalSavings = totalSavings;
        this.totalDiscountsWithQuoteDiscounts = totalDiscountsWithQuoteDiscounts;
        this.subTotalWithDiscounts = bVar3;
        this.site = site;
        this.store = store;
        this.couponsSavings = couponsSavings;
        this.mperksSavings = mperksSavings;
        this.specialsSavings = specialsSavings;
        this.teamMemberSavings = teamMemberSavings;
        this.guid = guid;
        this.calculated = z13;
        this.appliedVouchers = appliedVouchers;
        this.user = c14484a;
        this.pickupItemsQuantity = i11;
        this.deliveryItemsQuantity = i12;
        this.totalUnitCount = i13;
        this.orderPrices = orderPrices;
        this.merchantCustomerId = merchantCustomerId;
        this.depositPrice = depositPrice;
        this.pointOfService = cVar;
        this.substitutePreference = d11;
        this.phoneNumberTextable = z14;
        this.pickUpSlotInfo = pickUpSlotInfo;
        this.originalPickUpSlotInfo = originalPickUpSlotInfo;
        this.vehicleDescription = str4;
        this.validAgeAcknowledgementTime = str5;
        this.customerData = c13679g;
        this.editable = z15;
        this.originalOrderId = str6;
        this.orderNotes = str7;
        this.tippablePartner = z16;
        this.tippedAndRated = z17;
        this.shopperInfo = lVar;
        this.convenienceFee = convenienceFee;
        this.deliveryNote = str8;
        this.tipAmount = mVar;
        this.isMfc = z18;
        this.created = offsetDateTime;
        this.orderStatus = orderStatus;
        this.statusDisplay = statusDisplay;
        this.guestCustomer = z19;
        this.deliveryStatus = str9;
        this.deliveryStatusDisplay = str10;
        this.unconsignedEntries = unconsignedEntries;
        this.cancellable = z20;
        this.returnable = z21;
        this.timeZone = timeZone;
        this.rtsCartId = rtsCartId;
        this.totalTaxValues = totalTaxValues;
        this.lightningCartReward = list;
        this.pickUpPerson = c13911b;
        this.tipAuthCode = str11;
        this.tipCode = str12;
        this.tipDate = offsetDateTime2;
        this.captureAuthCode = str13;
        this.rating = num;
        this.unfulfilledEntries = unfulfilledEntries;
        this.statusUpdateReason = abstractC5607a;
        this.statusUpdateTimestamp = zonedDateTime;
        this.fulfillmentEligibility = str14;
        this.partnerEligibility = str15;
        this.ebtEligibleTotal = ebtEligibleTotal;
        this.ebtNonEligibleTotal = ebtNonEligibleTotal;
        this.ebtCapturedBalance = ebtCapturedBalance;
        this.rtsCapturedBalance = bVar4;
        this.ebtSurchargePrice = ebtSurchargePrice;
        this.ebtTransactionList = list2;
        this.multiTenderPaymentInfo = sVar;
        this.tipAndRateDetails = tipAndRateDetails;
        this.tenders = tenders;
    }

    /* renamed from: A, reason: from getter */
    public final f getOrderStatus() {
        return this.orderStatus;
    }

    /* renamed from: B, reason: from getter */
    public final PickupSlotInfo getOriginalPickUpSlotInfo() {
        return this.originalPickUpSlotInfo;
    }

    /* renamed from: C, reason: from getter */
    public final String getPartnerEligibility() {
        return this.partnerEligibility;
    }

    /* renamed from: D, reason: from getter */
    public final PaymentDetailItem getPaymentInfo() {
        return this.paymentInfo;
    }

    /* renamed from: E, reason: from getter */
    public final PickupPerson getPickUpPerson() {
        return this.pickUpPerson;
    }

    /* renamed from: F, reason: from getter */
    public final PickupSlotInfo getPickUpSlotInfo() {
        return this.pickUpSlotInfo;
    }

    /* renamed from: G, reason: from getter */
    public final PointOfService getPointOfService() {
        return this.pointOfService;
    }

    /* renamed from: H, reason: from getter */
    public final Integer getRating() {
        return this.rating;
    }

    /* renamed from: I, reason: from getter */
    public final mk.b getRtsCapturedBalance() {
        return this.rtsCapturedBalance;
    }

    /* renamed from: J, reason: from getter */
    public final ShopperInfo getShopperInfo() {
        return this.shopperInfo;
    }

    /* renamed from: K, reason: from getter */
    public final Savings getSpecialsSavings() {
        return this.specialsSavings;
    }

    /* renamed from: L, reason: from getter */
    public final String getStatusDisplay() {
        return this.statusDisplay;
    }

    /* renamed from: M, reason: from getter */
    public final AbstractC5607a getStatusUpdateReason() {
        return this.statusUpdateReason;
    }

    /* renamed from: N, reason: from getter */
    public final ZonedDateTime getStatusUpdateTimestamp() {
        return this.statusUpdateTimestamp;
    }

    /* renamed from: O, reason: from getter */
    public final mk.b getSubTotal() {
        return this.subTotal;
    }

    /* renamed from: P, reason: from getter */
    public final SubstitutePreference getSubstitutePreference() {
        return this.substitutePreference;
    }

    /* renamed from: Q, reason: from getter */
    public final Savings getTeamMemberSavings() {
        return this.teamMemberSavings;
    }

    public final List<Tender> R() {
        return this.tenders;
    }

    /* renamed from: S, reason: from getter */
    public final TipAmount getTipAmount() {
        return this.tipAmount;
    }

    /* renamed from: T, reason: from getter */
    public final TipAndRateDetails getTipAndRateDetails() {
        return this.tipAndRateDetails;
    }

    /* renamed from: U, reason: from getter */
    public final String getTipAuthCode() {
        return this.tipAuthCode;
    }

    /* renamed from: V, reason: from getter */
    public final String getTipCode() {
        return this.tipCode;
    }

    /* renamed from: W, reason: from getter */
    public final OffsetDateTime getTipDate() {
        return this.tipDate;
    }

    /* renamed from: X, reason: from getter */
    public final mk.b getTotalCosts() {
        return this.totalCosts;
    }

    /* renamed from: Y, reason: from getter */
    public final int getTotalItems() {
        return this.totalItems;
    }

    /* renamed from: Z, reason: from getter */
    public final mk.b getTotalPriceWithTax() {
        return this.totalPriceWithTax;
    }

    /* renamed from: a0, reason: from getter */
    public final Savings getTotalSavings() {
        return this.totalSavings;
    }

    /* renamed from: b0, reason: from getter */
    public final mk.b getTotalTax() {
        return this.totalTax;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getCanDisplaySubsAndUnfulfilledItems() {
        return this.canDisplaySubsAndUnfulfilledItems;
    }

    public final List<Entry> c0() {
        return this.unfulfilledEntries;
    }

    /* renamed from: d, reason: from getter */
    public final String getCaptureAuthCode() {
        return this.captureAuthCode;
    }

    /* renamed from: e, reason: from getter */
    public final String getCartCode() {
        return this.cartCode;
    }

    /* renamed from: e0, reason: from getter */
    public final boolean getIsFinal() {
        return this.isFinal;
    }

    /* renamed from: f, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: f0, reason: from getter */
    public final boolean getIsMfc() {
        return this.isMfc;
    }

    /* renamed from: g, reason: from getter */
    public final OffsetDateTime getCreated() {
        return this.created;
    }

    public final Builder g0() {
        String strA;
        CardType c13676dD;
        String strJ;
        String strC;
        String strA2;
        String strB;
        Builder c17128b = new Builder(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        c17128b.d(this.code);
        c17128b.i(this.subTotal.getValue());
        c17128b.k(this.totalPrice.getValue());
        PointOfService cVar = this.pointOfService;
        if (cVar != null) {
            c17128b.h(Integer.valueOf(cVar.getStoreId()).intValue());
        }
        ShopperInfo lVar = this.shopperInfo;
        if (lVar != null && (strB = lVar.getName()) != null) {
            c17128b.g(strB);
        }
        ShopperInfo lVar2 = this.shopperInfo;
        if (lVar2 != null && (strA2 = lVar2.getImage()) != null) {
            c17128b.f(strA2);
        }
        PaymentDetailItem uVar = this.paymentInfo;
        if (uVar != null && (strC = uVar.getCardNumber()) != null) {
            c17128b.b(strC);
        }
        PaymentDetailItem uVar2 = this.paymentInfo;
        if (uVar2 != null && (c13676dD = uVar2.getCardType()) != null && (strJ = c13676dD.getName()) != null) {
            c17128b.a(strJ);
        }
        DeliveryMode c13680h = this.deliveryMode;
        if (c13680h != null && (strA = c13680h.getCode()) != null) {
            c17128b.c(strA);
        }
        TipAndRateDetails nVar = this.tipAndRateDetails;
        c17128b.e(nVar.getRateDetails().getRating());
        c17128b.j(nVar.getTipDetails().getTipAmount().getValue());
        return c17128b;
    }

    /* renamed from: h, reason: from getter */
    public final mk.b getCreditTransactionAmount() {
        return this.creditTransactionAmount;
    }

    /* renamed from: i, reason: from getter */
    public final CustomerData getCustomerData() {
        return this.customerData;
    }

    /* renamed from: j, reason: from getter */
    public final CustomerAddress getDeliveryAddress() {
        return this.deliveryAddress;
    }

    /* renamed from: k, reason: from getter */
    public final mk.b getDeliveryCost() {
        return this.deliveryCost;
    }

    /* renamed from: l, reason: from getter */
    public final DeliveryMode getDeliveryMode() {
        return this.deliveryMode;
    }

    /* renamed from: m, reason: from getter */
    public final mk.b getDepositPrice() {
        return this.depositPrice;
    }

    /* renamed from: n, reason: from getter */
    public final mk.b getEbtCapturedBalance() {
        return this.ebtCapturedBalance;
    }

    /* renamed from: o, reason: from getter */
    public final mk.b getEbtEligibleTotal() {
        return this.ebtEligibleTotal;
    }

    /* renamed from: p, reason: from getter */
    public final mk.b getEbtNonEligibleTotal() {
        return this.ebtNonEligibleTotal;
    }

    /* renamed from: q, reason: from getter */
    public final mk.b getEbtSurchargePrice() {
        return this.ebtSurchargePrice;
    }

    public final TendersItem r() {
        List<TendersItem> listA;
        MultiTenderPaymentInfo sVar = this.multiTenderPaymentInfo;
        Object obj = null;
        if (sVar == null || (listA = sVar.a()) == null) {
            return null;
        }
        Iterator<T> it = listA.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            TendersItem g10 = (TendersItem) next;
            if (Intrinsics.e(g10 != null ? g10.getTenderType() : null, "EBTSnap")) {
                obj = next;
                break;
            }
        }
        return (TendersItem) obj;
    }

    public final List<EbtTransaction> s() {
        return this.ebtTransactionList;
    }

    /* renamed from: t, reason: from getter */
    public final boolean getEditable() {
        return this.editable;
    }

    public final List<Entry> u() {
        return this.entries;
    }

    /* renamed from: v, reason: from getter */
    public final mk.b getExtendedDeliveryCost() {
        return this.extendedDeliveryCost;
    }

    /* renamed from: w, reason: from getter */
    public final String getFulfillmentEligibility() {
        return this.fulfillmentEligibility;
    }

    /* renamed from: x, reason: from getter */
    public final mk.b getItemsTotal() {
        return this.itemsTotal;
    }

    /* renamed from: y, reason: from getter */
    public final Savings getMperksSavings() {
        return this.mperksSavings;
    }

    /* renamed from: z, reason: from getter */
    public final MultiTenderPaymentInfo getMultiTenderPaymentInfo() {
        return this.multiTenderPaymentInfo;
    }

    public final boolean d0() {
        if (r() != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OrderDetail(String str, String str2, boolean z10, boolean z11, String str3, String str4, String str5, boolean z12, mk.b bVar, mk.b bVar2, mk.b bVar3, mk.b bVar4, mk.b bVar5, mk.b bVar6, mk.b bVar7, mk.b bVar8, mk.b bVar9, mk.b bVar10, List list, int i10, DeliveryMode c13680h, CustomerAddress c6395c, PaymentDetailItem uVar, List list2, List list3, mk.b bVar11, mk.b bVar12, mk.b bVar13, double d10, String str6, mk.b bVar14, Savings cVar, mk.b bVar15, mk.b bVar16, String str7, String str8, Savings cVar2, Savings cVar3, Savings cVar4, Savings cVar5, String str9, boolean z13, List list4, Principal c14484a, int i11, int i12, int i13, List list5, String str10, mk.b bVar17, PointOfService cVar6, SubstitutePreference d11, boolean z14, PickupSlotInfo cVar7, PickupSlotInfo cVar8, String str11, String str12, CustomerData c13679g, boolean z15, String str13, String str14, boolean z16, boolean z17, ShopperInfo lVar, mk.b bVar18, String str15, TipAmount mVar, boolean z18, OffsetDateTime offsetDateTime, f fVar, String str16, boolean z19, String str17, String str18, List list6, boolean z20, boolean z21, String str19, String str20, List list7, List list8, PickupPerson c13911b, String str21, String str22, OffsetDateTime offsetDateTime2, String str23, Integer num, List list9, AbstractC5607a abstractC5607a, ZonedDateTime zonedDateTime, String str24, String str25, mk.b bVar19, mk.b bVar20, mk.b bVar21, mk.b bVar22, mk.b bVar23, List list10, MultiTenderPaymentInfo sVar, TipAndRateDetails nVar, List list11, int i14, int i15, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        String str26 = (i14 & 1) != 0 ? "-1" : str;
        this(str26, (i14 & 2) != 0 ? "-1" : str2, (i14 & 4) != 0 ? false : z10, (i14 & 8) != 0 ? false : z11, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? null : str4, (i14 & 64) != 0 ? null : str5, (i14 & 128) != 0 ? false : z12, (i14 & 256) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar, (i14 & 512) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar2, (i14 & 1024) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar3, (i14 & RecyclerView.m.FLAG_MOVED) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar4, (i14 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar5, (i14 & 8192) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar6, (i14 & 16384) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar7, (i14 & 32768) != 0 ? null : bVar8, (i14 & 65536) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar9, (i14 & 131072) != 0 ? null : bVar10, (i14 & 262144) != 0 ? CollectionsKt.m() : list, (i14 & 524288) != 0 ? 0 : i10, (i14 & 1048576) != 0 ? null : c13680h, (i14 & 2097152) != 0 ? null : c6395c, (i14 & 4194304) != 0 ? null : uVar, (i14 & 8388608) != 0 ? CollectionsKt.m() : list2, (i14 & 16777216) != 0 ? CollectionsKt.m() : list3, (i14 & 33554432) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar11, (i14 & 67108864) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar12, (i14 & 134217728) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar13, (i14 & 268435456) != 0 ? 0.0d : d10, (i14 & 536870912) != 0 ? "" : str6, (i14 & 1073741824) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar14, (i14 & Integer.MIN_VALUE) != 0 ? new Savings(null, 0.0d, 3, null) : cVar, (i15 & 1) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar15, (i15 & 2) != 0 ? null : bVar16, (i15 & 4) != 0 ? "" : str7, (i15 & 8) != 0 ? "" : str8, (i15 & 16) != 0 ? new Savings(null, 0.0d, 3, null) : cVar2, (i15 & 32) != 0 ? new Savings(null, 0.0d, 3, null) : cVar3, (i15 & 64) != 0 ? new Savings(null, 0.0d, 3, null) : cVar4, (i15 & 128) != 0 ? new Savings(null, 0.0d, 3, null) : cVar5, (i15 & 256) != 0 ? "" : str9, (i15 & 512) != 0 ? false : z13, (i15 & 1024) != 0 ? CollectionsKt.m() : list4, (i15 & RecyclerView.m.FLAG_MOVED) != 0 ? null : c14484a, (i15 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? 0 : i11, (i15 & 8192) != 0 ? 0 : i12, (i15 & 16384) != 0 ? 0 : i13, (i15 & 32768) != 0 ? CollectionsKt.m() : list5, (i15 & 65536) != 0 ? "" : str10, (i15 & 131072) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar17, (i15 & 262144) != 0 ? null : cVar6, (i15 & 524288) != 0 ? null : d11, (i15 & 1048576) != 0 ? false : z14, (i15 & 2097152) != 0 ? new PickupSlotInfo(null, null, null, null, null, null, false, null, null, null, null, null, false, 8191, null) : cVar7, (i15 & 4194304) != 0 ? new PickupSlotInfo(null, null, null, null, null, null, false, null, null, null, null, null, false, 8191, null) : cVar8, (i15 & 8388608) != 0 ? null : str11, (i15 & 16777216) != 0 ? null : str12, (i15 & 33554432) != 0 ? null : c13679g, (i15 & 67108864) != 0 ? false : z15, (i15 & 134217728) != 0 ? null : str13, (i15 & 268435456) != 0 ? null : str14, (i15 & 536870912) != 0 ? false : z16, (i15 & 1073741824) != 0 ? false : z17, (i15 & Integer.MIN_VALUE) != 0 ? null : lVar, (i16 & 1) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar18, (i16 & 2) != 0 ? null : str15, (i16 & 4) != 0 ? null : mVar, (i16 & 8) != 0 ? false : z18, (i16 & 16) != 0 ? null : offsetDateTime, (i16 & 32) != 0 ? f.f133637t : fVar, (i16 & 64) != 0 ? "" : str16, (i16 & 128) != 0 ? false : z19, (i16 & 256) != 0 ? null : str17, (i16 & 512) != 0 ? null : str18, (i16 & 1024) != 0 ? CollectionsKt.m() : list6, (i16 & RecyclerView.m.FLAG_MOVED) != 0 ? false : z20, (i16 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z21, (i16 & 8192) != 0 ? "" : str19, (i16 & 16384) == 0 ? str20 : "", (i16 & 32768) != 0 ? CollectionsKt.m() : list7, (i16 & 65536) != 0 ? CollectionsKt.m() : list8, (i16 & 131072) != 0 ? null : c13911b, (i16 & 262144) != 0 ? null : str21, (i16 & 524288) != 0 ? null : str22, (i16 & 1048576) != 0 ? null : offsetDateTime2, (i16 & 2097152) != 0 ? null : str23, (i16 & 4194304) != 0 ? null : num, (i16 & 8388608) != 0 ? CollectionsKt.m() : list9, (i16 & 16777216) != 0 ? null : abstractC5607a, (i16 & 33554432) != 0 ? null : zonedDateTime, (i16 & 67108864) != 0 ? null : str24, (i16 & 134217728) != 0 ? null : str25, (i16 & 268435456) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar19, (i16 & 536870912) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar20, (i16 & 1073741824) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar21, (i16 & Integer.MIN_VALUE) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar22, (i17 & 1) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar23, (i17 & 2) != 0 ? null : list10, (i17 & 4) != 0 ? null : sVar, (i17 & 8) != 0 ? new TipAndRateDetails(false, null, null, 7, null) : nVar, (i17 & 16) != 0 ? CollectionsKt.m() : list11);
    }
}
