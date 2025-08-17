package ok;

import Tq.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0081\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0003\b©\u0001\b\u0087\b\u0018\u0000 \u009d\u00022\u00020\u00012\u00020\u0002:\u0001{B\u008f\b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000106\u0012\u0010\b\u0002\u00109\u001a\n\u0012\u0004\u0012\u000208\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010;\u001a\n\u0012\u0004\u0012\u00020:\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010=\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u0005\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010c\u001a\u0004\u0018\u00010b¢\u0006\u0004\bd\u0010eJ\r\u0010f\u001a\u00020\u001b¢\u0006\u0004\bf\u0010gJ\u0017\u0010j\u001a\u0004\u0018\u00010\u000e2\u0006\u0010i\u001a\u00020h¢\u0006\u0004\bj\u0010kJ\u000f\u0010l\u001a\u00020\u0003H\u0016¢\u0006\u0004\bl\u0010mJ\u001a\u0010p\u001a\u00020\u001b2\b\u0010o\u001a\u0004\u0018\u00010nH\u0096\u0002¢\u0006\u0004\bp\u0010qJ\u001d\u0010v\u001a\u00020u2\u0006\u0010s\u001a\u00020r2\u0006\u0010t\u001a\u00020\u0003¢\u0006\u0004\bv\u0010wJ\r\u0010x\u001a\u00020\u0003¢\u0006\u0004\bx\u0010mJ\u0010\u0010y\u001a\u00020\bHÖ\u0001¢\u0006\u0004\by\u0010zR\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b{\u0010|\u001a\u0004\b}\u0010m\"\u0004\b~\u0010\u007fR!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000f\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0005\b\u0086\u0001\u0010zR)\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0087\u0001\u0010\u0085\u0001\u001a\u0005\b\u0088\u0001\u0010z\"\u0006\b\u0089\u0001\u0010\u008a\u0001R)\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u008b\u0001\u0010\u0085\u0001\u001a\u0005\b\u0080\u0001\u0010z\"\u0006\b\u008c\u0001\u0010\u008a\u0001R)\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u008d\u0001\u0010\u0085\u0001\u001a\u0005\b\u008e\u0001\u0010z\"\u0006\b\u008f\u0001\u0010\u008a\u0001R)\u0010\r\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0006\b\u0090\u0001\u0010\u0085\u0001\u001a\u0005\b\u0091\u0001\u0010z\"\u0006\b\u0092\u0001\u0010\u008a\u0001R*\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R)\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bj\u0010\u0094\u0001\u001a\u0006\b\u0099\u0001\u0010\u0096\u0001\"\u0006\b\u009a\u0001\u0010\u0098\u0001R(\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u009b\u0001\u0010\u0085\u0001\u001a\u0004\b|\u0010z\"\u0006\b\u009c\u0001\u0010\u008a\u0001R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\b¡\u0001\u0010\u009e\u0001\u001a\u0006\b¢\u0001\u0010 \u0001R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\b£\u0001\u0010\u009e\u0001\u001a\u0006\b¤\u0001\u0010 \u0001R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u009e\u0001\u001a\u0006\b¥\u0001\u0010 \u0001R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009e\u0001\u001a\u0006\b¦\u0001\u0010 \u0001R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\b§\u0001\u0010\u009e\u0001\u001a\u0006\b¨\u0001\u0010 \u0001R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\b©\u0001\u0010\u009e\u0001\u001a\u0006\bª\u0001\u0010 \u0001R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\b«\u0001\u0010\u009e\u0001\u001a\u0006\b¬\u0001\u0010 \u0001R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\u0010\n\u0006\b±\u0001\u0010®\u0001\u001a\u0006\b²\u0001\u0010°\u0001R\u001b\u0010\u001e\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000e\n\u0005\b}\u0010\u0085\u0001\u001a\u0005\b³\u0001\u0010zR\u001b\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000e\n\u0006\b´\u0001\u0010\u0085\u0001\u001a\u0004\b\u001f\u0010zR\u001b\u0010 \u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000e\n\u0006\bµ\u0001\u0010\u0085\u0001\u001a\u0004\b \u0010zR*\u0010!\u001a\u0004\u0018\u00010\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b¶\u0001\u0010\u0094\u0001\u001a\u0006\b·\u0001\u0010\u0096\u0001\"\u0006\b¸\u0001\u0010\u0098\u0001R)\u0010\"\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0006\b¹\u0001\u0010\u0085\u0001\u001a\u0005\bº\u0001\u0010z\"\u0006\b»\u0001\u0010\u008a\u0001R)\u0010#\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¼\u0001\u0010\u0085\u0001\u001a\u0005\b½\u0001\u0010z\"\u0006\b¾\u0001\u0010\u008a\u0001R)\u0010$\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¿\u0001\u0010\u0085\u0001\u001a\u0005\b¶\u0001\u0010z\"\u0006\bÀ\u0001\u0010\u008a\u0001R\u001d\u0010%\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\bÁ\u0001\u0010\u009e\u0001\u001a\u0006\bÂ\u0001\u0010 \u0001R\u001d\u0010&\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\bÃ\u0001\u0010\u009e\u0001\u001a\u0006\bÄ\u0001\u0010 \u0001R\u001d\u0010'\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\bÅ\u0001\u0010\u009e\u0001\u001a\u0006\b¿\u0001\u0010 \u0001R\u001d\u0010(\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\bÄ\u0001\u0010\u009e\u0001\u001a\u0006\b¹\u0001\u0010 \u0001R\u001d\u0010)\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\bÂ\u0001\u0010\u009e\u0001\u001a\u0006\bÃ\u0001\u0010 \u0001R\u001d\u0010*\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u009e\u0001\u001a\u0006\bÁ\u0001\u0010 \u0001R\u001d\u0010+\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\bÆ\u0001\u0010\u009e\u0001\u001a\u0006\bÇ\u0001\u0010 \u0001R\u001c\u0010,\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u000f\n\u0005\b|\u0010\u009e\u0001\u001a\u0006\bÈ\u0001\u0010 \u0001R\u001d\u0010-\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\b½\u0001\u0010\u009e\u0001\u001a\u0006\bµ\u0001\u0010 \u0001R\u001d\u0010.\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\bÉ\u0001\u0010\u009e\u0001\u001a\u0006\b´\u0001\u0010 \u0001R\u001d\u0010/\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\b¥\u0001\u0010\u009e\u0001\u001a\u0006\b«\u0001\u0010 \u0001R\u001d\u00100\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\b¤\u0001\u0010\u009e\u0001\u001a\u0006\b©\u0001\u0010 \u0001R\u001d\u00101\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\b¨\u0001\u0010\u009e\u0001\u001a\u0006\b±\u0001\u0010 \u0001R\u001d\u00102\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\b¦\u0001\u0010\u009e\u0001\u001a\u0006\b\u00ad\u0001\u0010 \u0001R\u001c\u00103\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000f\n\u0006\b¢\u0001\u0010\u0085\u0001\u001a\u0005\bÊ\u0001\u0010zR\u001c\u00104\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000f\n\u0006\b\u009f\u0001\u0010\u0085\u0001\u001a\u0005\bË\u0001\u0010zR)\u00105\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0091\u0001\u0010\u0085\u0001\u001a\u0005\bÌ\u0001\u0010z\"\u0006\bÍ\u0001\u0010\u008a\u0001R)\u00107\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0088\u0001\u0010Î\u0001\u001a\u0005\b{\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R/\u00109\u001a\n\u0012\u0004\u0012\u000208\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bf\u0010\u0081\u0001\u001a\u0006\b\u009b\u0001\u0010\u0083\u0001\"\u0006\bÒ\u0001\u0010Ó\u0001R0\u0010;\u001a\n\u0012\u0004\u0012\u00020:\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÔ\u0001\u0010\u0081\u0001\u001a\u0006\b\u009d\u0001\u0010\u0083\u0001\"\u0006\bÕ\u0001\u0010Ó\u0001R0\u0010=\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÖ\u0001\u0010\u0081\u0001\u001a\u0006\b×\u0001\u0010\u0083\u0001\"\u0006\bØ\u0001\u0010Ó\u0001R!\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00058\u0006¢\u0006\u0010\n\u0006\bÙ\u0001\u0010\u0081\u0001\u001a\u0006\bÚ\u0001\u0010\u0083\u0001R\u001c\u0010@\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000f\n\u0006\bÛ\u0001\u0010\u0085\u0001\u001a\u0005\bÜ\u0001\u0010zR\u001c\u0010A\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000f\n\u0006\bÝ\u0001\u0010\u0085\u0001\u001a\u0005\bÞ\u0001\u0010zR\u001c\u0010B\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000f\n\u0006\bß\u0001\u0010\u0085\u0001\u001a\u0005\bà\u0001\u0010zR\u001c\u0010C\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000f\n\u0006\bá\u0001\u0010\u0085\u0001\u001a\u0005\bâ\u0001\u0010zR\u001c\u0010D\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000f\n\u0006\bã\u0001\u0010\u0085\u0001\u001a\u0005\bä\u0001\u0010zR\u001c\u0010E\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000f\n\u0006\bå\u0001\u0010\u0085\u0001\u001a\u0005\bæ\u0001\u0010zR\u001c\u0010F\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000f\n\u0006\bç\u0001\u0010\u0085\u0001\u001a\u0005\bè\u0001\u0010zR\u001c\u0010G\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000f\n\u0006\bé\u0001\u0010\u0085\u0001\u001a\u0005\bê\u0001\u0010zR\u001d\u0010H\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\bë\u0001\u0010\u009e\u0001\u001a\u0006\b\u0093\u0001\u0010 \u0001R\u001d\u0010I\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\bì\u0001\u0010\u009e\u0001\u001a\u0006\b\u0090\u0001\u0010 \u0001R\u001d\u0010J\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\bí\u0001\u0010\u009e\u0001\u001a\u0006\b\u0087\u0001\u0010 \u0001R\u001d\u0010K\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\bî\u0001\u0010\u009e\u0001\u001a\u0006\b\u0084\u0001\u0010 \u0001R\u001d\u0010L\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\bï\u0001\u0010\u009e\u0001\u001a\u0006\b\u008d\u0001\u0010 \u0001R\u001d\u0010M\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\bð\u0001\u0010\u009e\u0001\u001a\u0006\b\u008b\u0001\u0010 \u0001R\u001d\u0010N\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\bñ\u0001\u0010\u009e\u0001\u001a\u0006\bò\u0001\u0010 \u0001R\u001d\u0010O\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\bó\u0001\u0010\u009e\u0001\u001a\u0006\bô\u0001\u0010 \u0001R\u001c\u0010P\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000f\n\u0006\bõ\u0001\u0010\u0085\u0001\u001a\u0005\bö\u0001\u0010zR\u001c\u0010Q\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000f\n\u0006\b÷\u0001\u0010\u0085\u0001\u001a\u0005\bø\u0001\u0010zR\u001d\u0010R\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\bù\u0001\u0010\u009e\u0001\u001a\u0006\bú\u0001\u0010 \u0001R\u001d\u0010S\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\bû\u0001\u0010\u009e\u0001\u001a\u0006\bü\u0001\u0010 \u0001R\u001d\u0010T\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\bý\u0001\u0010\u009e\u0001\u001a\u0006\bþ\u0001\u0010 \u0001R\u001d\u0010U\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\bÿ\u0001\u0010\u009e\u0001\u001a\u0006\b\u0080\u0002\u0010 \u0001R\u001d\u0010V\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\b\u0081\u0002\u0010\u009e\u0001\u001a\u0006\b\u0082\u0002\u0010 \u0001R\u001d\u0010W\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\b\u0083\u0002\u0010\u009e\u0001\u001a\u0006\b\u0084\u0002\u0010 \u0001R\u001d\u0010X\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\b\u0085\u0002\u0010\u009e\u0001\u001a\u0006\b\u0086\u0002\u0010 \u0001R\u001d\u0010Y\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\b\u0087\u0002\u0010\u009e\u0001\u001a\u0006\b\u0088\u0002\u0010 \u0001R\u001c\u0010Z\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000f\n\u0006\b\u0089\u0002\u0010\u0085\u0001\u001a\u0005\b\u008a\u0002\u0010zR\u001c\u0010[\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000f\n\u0006\b\u008b\u0002\u0010\u0085\u0001\u001a\u0005\b\u008c\u0002\u0010zR\u001c\u0010\\\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000f\n\u0006\b\u008d\u0002\u0010\u0085\u0001\u001a\u0005\b\u008e\u0002\u0010zR\u001d\u0010]\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u0010\n\u0006\b\u008f\u0002\u0010\u009e\u0001\u001a\u0006\b\u0090\u0002\u0010 \u0001R\u001c\u0010^\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000f\n\u0006\b\u0091\u0002\u0010\u0085\u0001\u001a\u0005\b\u0092\u0002\u0010zR\u001c\u0010_\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000f\n\u0006\b\u0093\u0002\u0010\u0085\u0001\u001a\u0005\b\u0094\u0002\u0010zR\u001d\u0010`\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u0010\n\u0006\b\u0095\u0002\u0010\u0094\u0001\u001a\u0006\b\u0096\u0002\u0010\u0096\u0001R\u001d\u0010a\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\u0010\n\u0006\b\u0097\u0002\u0010\u0094\u0001\u001a\u0006\b\u0098\u0002\u0010\u0096\u0001R\u001d\u0010c\u001a\u0004\u0018\u00010b8\u0006¢\u0006\u0010\n\u0006\b\u0099\u0002\u0010\u009a\u0002\u001a\u0006\b\u009b\u0002\u0010\u009c\u0002¨\u0006\u009e\u0002"}, d2 = {"Lok/h;", "LTq/k;", "Landroid/os/Parcelable;", "", "storeId", "", "Lok/c;", "fulfillmentInfo", "", "mfcUnitId", "streetAddress", "city", "state", "zipCode", "", "latitude", "longitude", "storeHours", "j$/time/LocalDateTime", "storeWeekdayOpen", "storeWeekDayClose", "storeSaturdayOpen", "storeSaturdayClose", "storeSundayOpen", "storeSundayClose", "openDate", "closeDate", "", "driveThru", "clinic", "storeFlag", "isMobileShoppingEnabled", "isMobilePaymentEnabled", "milesFrom", "name", "storePhoneNumber", "pharmacyPhone", "pharmacyWeekdayOpen", "pharmacyWeekdayClose", "pharmacySatOpen", "pharmacySatClose", "pharmacySunOpen", "pharmacySunClose", "pharmacyHolidayOpen", "pharmacyHolidayClose", "pharmacyDriveThruWeekdayOpen", "pharmacyDriveThruWeekdayClose", "pharmacyDriveThruSatOpen", "pharmacyDriveThruSatClose", "pharmacyDriveThruSunOpen", "pharmacyDriveThruSunClose", "pharmacyTimezone", "pharmacyAddress", "unitType", "Lok/g;", "auxUnitInfo", "Lok/d;", "gasStationAmenities", "Lok/e;", "gasStationHours", "Lok/a;", "fuelPrices", "Lok/j;", "tenants", "storeDirName", "storeDirEmpId", "preOrderServiceAllow", "preOrderPhone", "preOrderDriveThru", "curbsideAllow", "curbsidePhone", "curbsideDriveThru", "curbsideWeekdayOpen", "curbsideWeekdayClose", "curbsideSatOpen", "curbsideSatClose", "curbsideSunOpen", "curbsideSunClose", "curbsideHolidayOpen", "curbsideHolidayClose", "curbsideInStoreAllow", "preOrderInStoreAllow", "preOrderWeekdayOpen", "preOrderWeekdayClose", "preOrderSatOpen", "preOrderSatClose", "preOrderSunOpen", "preOrderSunClose", "preOrderHolidayOpen", "preOrderHolidayClose", "timeZone", "daylightSavings", "vPos", "visibleDate", "cNCPickupDescription", "sPOPickupDescription", "latitudeRad", "longitudeRad", "Lok/f;", "marketAndRegions", "<init>", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lok/g;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Ljava/lang/String;Ljava/lang/String;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/LocalDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lok/f;)V", "T", "()Z", "Lok/b;", "fuelType", "i", "(Lok/b;)Ljava/lang/Double;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "toString", "()Ljava/lang/String;", "a", "I", "u", "setStoreId", "(I)V", "b", "Ljava/util/List;", "getFulfillmentInfo", "()Ljava/util/List;", "c", "Ljava/lang/String;", "getMfcUnitId", "d", "S", "setStreetAddress", "(Ljava/lang/String;)V", "e", "setCity", "f", "G", "setState", "g", "R", "setZipCode", "h", "Ljava/lang/Double;", "n", "()Ljava/lang/Double;", "setLatitude", "(Ljava/lang/Double;)V", "o", "setLongitude", "j", "setStoreHours", "k", "Lj$/time/LocalDateTime;", "Q", "()Lj$/time/LocalDateTime;", "l", "P", "m", "M", "L", "O", "p", "N", "q", "getOpenDate", "r", "getCloseDate", "s", "Ljava/lang/Boolean;", "getDriveThru", "()Ljava/lang/Boolean;", "t", "getClinic", "getStoreFlag", "v", "w", "x", "K2", "setMilesFrom", "y", "getName", "setName", "z", "J", "setStorePhoneNumber", "A", "setPharmacyPhone", "B", "F", "C", "E", "D", "H", "getPharmacyHolidayOpen", "getPharmacyHolidayClose", "K", "getPharmacyTimezone", "getPharmacyAddress", "getUnitType", "setUnitType", "Lok/g;", "()Lok/g;", "setAuxUnitInfo", "(Lok/g;)V", "setGasStationAmenities", "(Ljava/util/List;)V", "U", "setGasStationHours", "V", "getFuelPrices", "setFuelPrices", "W", "getTenants", "X", "getStoreDirName", "Y", "getStoreDirEmpId", "Z", "getPreOrderServiceAllow", "a0", "getPreOrderPhone", "b0", "getPreOrderDriveThru", "c0", "getCurbsideAllow", "d0", "getCurbsidePhone", "e0", "getCurbsideDriveThru", "f0", "g0", "h0", "i0", "j0", "k0", "l0", "getCurbsideHolidayOpen", "m0", "getCurbsideHolidayClose", "n0", "getCurbsideInStoreAllow", "o0", "getPreOrderInStoreAllow", "p0", "getPreOrderWeekdayOpen", "q0", "getPreOrderWeekdayClose", "r0", "getPreOrderSatOpen", "s0", "getPreOrderSatClose", "t0", "getPreOrderSunOpen", "u0", "getPreOrderSunClose", "v0", "getPreOrderHolidayOpen", "w0", "getPreOrderHolidayClose", "x0", "getTimeZone", "y0", "getDaylightSavings", "z0", "getVPos", "A0", "getVisibleDate", "B0", "getCNCPickupDescription", "C0", "getSPOPickupDescription", "D0", "getLatitudeRad", "E0", "getLongitudeRad", "F0", "Lok/f;", "getMarketAndRegions", "()Lok/f;", "G0", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ok.h, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class StoreDetails implements k, Parcelable {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
    private String pharmacyPhone;

    /* renamed from: A0, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime visibleDate;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime pharmacyWeekdayOpen;

    /* renamed from: B0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cNCPickupDescription;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime pharmacyWeekdayClose;

    /* renamed from: C0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sPOPickupDescription;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime pharmacySatOpen;

    /* renamed from: D0, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double latitudeRad;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime pharmacySatClose;

    /* renamed from: E0, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double longitudeRad;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime pharmacySunOpen;

    /* renamed from: F0, reason: collision with root package name and from kotlin metadata and from toString */
    private final MarketAndRegion marketAndRegions;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime pharmacySunClose;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime pharmacyHolidayOpen;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime pharmacyHolidayClose;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime pharmacyDriveThruWeekdayOpen;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime pharmacyDriveThruWeekdayClose;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime pharmacyDriveThruSatOpen;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime pharmacyDriveThruSatClose;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime pharmacyDriveThruSunOpen;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime pharmacyDriveThruSunClose;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pharmacyTimezone;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pharmacyAddress;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata and from toString */
    private String unitType;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata and from toString */
    private StoreAuxUnitInfo auxUnitInfo;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata and from toString */
    private List<GasStationAmenity> gasStationAmenities;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata and from toString */
    private List<GasStationHour> gasStationHours;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata and from toString */
    private List<FuelPrice> fuelPrices;

    /* renamed from: W, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Tenant> tenants;

    /* renamed from: X, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeDirName;

    /* renamed from: Y, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeDirEmpId;

    /* renamed from: Z, reason: collision with root package name and from kotlin metadata and from toString */
    private final String preOrderServiceAllow;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private int storeId;

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String preOrderPhone;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<FulfillmentInfoModel> fulfillmentInfo;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String preOrderDriveThru;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mfcUnitId;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String curbsideAllow;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private String streetAddress;

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String curbsidePhone;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private String city;

    /* renamed from: e0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String curbsideDriveThru;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private String state;

    /* renamed from: f0, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime curbsideWeekdayOpen;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private String zipCode;

    /* renamed from: g0, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime curbsideWeekdayClose;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private Double latitude;

    /* renamed from: h0, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime curbsideSatOpen;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private Double longitude;

    /* renamed from: i0, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime curbsideSatClose;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private String storeHours;

    /* renamed from: j0, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime curbsideSunOpen;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime storeWeekdayOpen;

    /* renamed from: k0, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime curbsideSunClose;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime storeWeekDayClose;

    /* renamed from: l0, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime curbsideHolidayOpen;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime storeSaturdayOpen;

    /* renamed from: m0, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime curbsideHolidayClose;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime storeSaturdayClose;

    /* renamed from: n0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String curbsideInStoreAllow;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime storeSundayOpen;

    /* renamed from: o0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String preOrderInStoreAllow;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime storeSundayClose;

    /* renamed from: p0, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime preOrderWeekdayOpen;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime openDate;

    /* renamed from: q0, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime preOrderWeekdayClose;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime closeDate;

    /* renamed from: r0, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime preOrderSatOpen;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean driveThru;

    /* renamed from: s0, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime preOrderSatClose;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean clinic;

    /* renamed from: t0, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime preOrderSunOpen;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeFlag;

    /* renamed from: u0, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime preOrderSunClose;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final String isMobileShoppingEnabled;

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime preOrderHolidayOpen;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final String isMobilePaymentEnabled;

    /* renamed from: w0, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime preOrderHolidayClose;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private Double milesFrom;

    /* renamed from: x0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String timeZone;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private String name;

    /* renamed from: y0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String daylightSavings;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private String storePhoneNumber;

    /* renamed from: z0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String vPos;
    public static final Parcelable.Creator<StoreDetails> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ok.h$b */
    public static final class b implements Parcelable.Creator<StoreDetails> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StoreDetails createFromParcel(Parcel parcel) {
            Double d10;
            ArrayList arrayList;
            StoreAuxUnitInfo storeAuxUnitInfo;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            int i10;
            Intrinsics.j(parcel, "parcel");
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList5.add(FulfillmentInfoModel.CREATOR.createFromParcel(parcel));
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String string6 = parcel.readString();
            LocalDateTime localDateTime = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime2 = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime3 = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime4 = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime5 = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime6 = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime7 = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime8 = (LocalDateTime) parcel.readSerializable();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            Double dValueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            LocalDateTime localDateTime9 = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime10 = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime11 = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime12 = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime13 = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime14 = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime15 = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime16 = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime17 = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime18 = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime19 = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime20 = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime21 = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime22 = (LocalDateTime) parcel.readSerializable();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            StoreAuxUnitInfo storeAuxUnitInfoCreateFromParcel = parcel.readInt() == 0 ? null : StoreAuxUnitInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                d10 = dValueOf;
                storeAuxUnitInfo = storeAuxUnitInfoCreateFromParcel;
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                d10 = dValueOf;
                arrayList = new ArrayList(i14);
                storeAuxUnitInfo = storeAuxUnitInfoCreateFromParcel;
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList.add(GasStationAmenity.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = arrayList;
                arrayList2 = null;
            } else {
                int i16 = parcel.readInt();
                arrayList2 = new ArrayList(i16);
                arrayList3 = arrayList;
                for (int i17 = 0; i17 != i16; i17++) {
                    arrayList2.add(GasStationHour.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                i10 = i11;
                arrayList4 = null;
            } else {
                int i18 = parcel.readInt();
                arrayList4 = new ArrayList(i18);
                i10 = i11;
                int i19 = 0;
                while (i19 != i18) {
                    arrayList4.add(FuelPrice.CREATOR.createFromParcel(parcel));
                    i19++;
                    i18 = i18;
                }
            }
            int i20 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(i20);
            ArrayList arrayList7 = arrayList4;
            int i21 = 0;
            while (i21 != i20) {
                arrayList6.add(Tenant.CREATOR.createFromParcel(parcel));
                i21++;
                i20 = i20;
            }
            return new StoreDetails(i10, arrayList5, string, string2, string3, string4, string5, d10, dValueOf2, string6, localDateTime, localDateTime2, localDateTime3, localDateTime4, localDateTime5, localDateTime6, localDateTime7, localDateTime8, boolValueOf, boolValueOf2, string7, string8, string9, dValueOf3, string10, string11, string12, localDateTime9, localDateTime10, localDateTime11, localDateTime12, localDateTime13, localDateTime14, localDateTime15, localDateTime16, localDateTime17, localDateTime18, localDateTime19, localDateTime20, localDateTime21, localDateTime22, string13, string14, string15, storeAuxUnitInfo, arrayList3, arrayList2, arrayList7, arrayList6, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (LocalDateTime) parcel.readSerializable(), (LocalDateTime) parcel.readSerializable(), (LocalDateTime) parcel.readSerializable(), (LocalDateTime) parcel.readSerializable(), (LocalDateTime) parcel.readSerializable(), (LocalDateTime) parcel.readSerializable(), (LocalDateTime) parcel.readSerializable(), (LocalDateTime) parcel.readSerializable(), parcel.readString(), parcel.readString(), (LocalDateTime) parcel.readSerializable(), (LocalDateTime) parcel.readSerializable(), (LocalDateTime) parcel.readSerializable(), (LocalDateTime) parcel.readSerializable(), (LocalDateTime) parcel.readSerializable(), (LocalDateTime) parcel.readSerializable(), (LocalDateTime) parcel.readSerializable(), (LocalDateTime) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), (LocalDateTime) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : MarketAndRegion.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final StoreDetails[] newArray(int i10) {
            return new StoreDetails[i10];
        }
    }

    public StoreDetails() {
        this(0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 1048575, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public String toString() {
        return "StoreDetails(storeId=" + this.storeId + ", fulfillmentInfo=" + this.fulfillmentInfo + ", mfcUnitId=" + this.mfcUnitId + ", streetAddress=" + this.streetAddress + ", city=" + this.city + ", state=" + this.state + ", zipCode=" + this.zipCode + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", storeHours=" + this.storeHours + ", storeWeekdayOpen=" + this.storeWeekdayOpen + ", storeWeekDayClose=" + this.storeWeekDayClose + ", storeSaturdayOpen=" + this.storeSaturdayOpen + ", storeSaturdayClose=" + this.storeSaturdayClose + ", storeSundayOpen=" + this.storeSundayOpen + ", storeSundayClose=" + this.storeSundayClose + ", openDate=" + this.openDate + ", closeDate=" + this.closeDate + ", driveThru=" + this.driveThru + ", clinic=" + this.clinic + ", storeFlag=" + this.storeFlag + ", isMobileShoppingEnabled=" + this.isMobileShoppingEnabled + ", isMobilePaymentEnabled=" + this.isMobilePaymentEnabled + ", milesFrom=" + this.milesFrom + ", name=" + this.name + ", storePhoneNumber=" + this.storePhoneNumber + ", pharmacyPhone=" + this.pharmacyPhone + ", pharmacyWeekdayOpen=" + this.pharmacyWeekdayOpen + ", pharmacyWeekdayClose=" + this.pharmacyWeekdayClose + ", pharmacySatOpen=" + this.pharmacySatOpen + ", pharmacySatClose=" + this.pharmacySatClose + ", pharmacySunOpen=" + this.pharmacySunOpen + ", pharmacySunClose=" + this.pharmacySunClose + ", pharmacyHolidayOpen=" + this.pharmacyHolidayOpen + ", pharmacyHolidayClose=" + this.pharmacyHolidayClose + ", pharmacyDriveThruWeekdayOpen=" + this.pharmacyDriveThruWeekdayOpen + ", pharmacyDriveThruWeekdayClose=" + this.pharmacyDriveThruWeekdayClose + ", pharmacyDriveThruSatOpen=" + this.pharmacyDriveThruSatOpen + ", pharmacyDriveThruSatClose=" + this.pharmacyDriveThruSatClose + ", pharmacyDriveThruSunOpen=" + this.pharmacyDriveThruSunOpen + ", pharmacyDriveThruSunClose=" + this.pharmacyDriveThruSunClose + ", pharmacyTimezone=" + this.pharmacyTimezone + ", pharmacyAddress=" + this.pharmacyAddress + ", unitType=" + this.unitType + ", auxUnitInfo=" + this.auxUnitInfo + ", gasStationAmenities=" + this.gasStationAmenities + ", gasStationHours=" + this.gasStationHours + ", fuelPrices=" + this.fuelPrices + ", tenants=" + this.tenants + ", storeDirName=" + this.storeDirName + ", storeDirEmpId=" + this.storeDirEmpId + ", preOrderServiceAllow=" + this.preOrderServiceAllow + ", preOrderPhone=" + this.preOrderPhone + ", preOrderDriveThru=" + this.preOrderDriveThru + ", curbsideAllow=" + this.curbsideAllow + ", curbsidePhone=" + this.curbsidePhone + ", curbsideDriveThru=" + this.curbsideDriveThru + ", curbsideWeekdayOpen=" + this.curbsideWeekdayOpen + ", curbsideWeekdayClose=" + this.curbsideWeekdayClose + ", curbsideSatOpen=" + this.curbsideSatOpen + ", curbsideSatClose=" + this.curbsideSatClose + ", curbsideSunOpen=" + this.curbsideSunOpen + ", curbsideSunClose=" + this.curbsideSunClose + ", curbsideHolidayOpen=" + this.curbsideHolidayOpen + ", curbsideHolidayClose=" + this.curbsideHolidayClose + ", curbsideInStoreAllow=" + this.curbsideInStoreAllow + ", preOrderInStoreAllow=" + this.preOrderInStoreAllow + ", preOrderWeekdayOpen=" + this.preOrderWeekdayOpen + ", preOrderWeekdayClose=" + this.preOrderWeekdayClose + ", preOrderSatOpen=" + this.preOrderSatOpen + ", preOrderSatClose=" + this.preOrderSatClose + ", preOrderSunOpen=" + this.preOrderSunOpen + ", preOrderSunClose=" + this.preOrderSunClose + ", preOrderHolidayOpen=" + this.preOrderHolidayOpen + ", preOrderHolidayClose=" + this.preOrderHolidayClose + ", timeZone=" + this.timeZone + ", daylightSavings=" + this.daylightSavings + ", vPos=" + this.vPos + ", visibleDate=" + this.visibleDate + ", cNCPickupDescription=" + this.cNCPickupDescription + ", sPOPickupDescription=" + this.sPOPickupDescription + ", latitudeRad=" + this.latitudeRad + ", longitudeRad=" + this.longitudeRad + ", marketAndRegions=" + this.marketAndRegions + ')';
    }

    public StoreDetails(int i10, List<FulfillmentInfoModel> fulfillmentInfo, String str, String str2, String str3, String str4, String str5, Double d10, Double d11, String str6, LocalDateTime localDateTime, LocalDateTime localDateTime2, LocalDateTime localDateTime3, LocalDateTime localDateTime4, LocalDateTime localDateTime5, LocalDateTime localDateTime6, LocalDateTime localDateTime7, LocalDateTime localDateTime8, Boolean bool, Boolean bool2, String str7, String str8, String str9, Double d12, String str10, String str11, String str12, LocalDateTime localDateTime9, LocalDateTime localDateTime10, LocalDateTime localDateTime11, LocalDateTime localDateTime12, LocalDateTime localDateTime13, LocalDateTime localDateTime14, LocalDateTime localDateTime15, LocalDateTime localDateTime16, LocalDateTime localDateTime17, LocalDateTime localDateTime18, LocalDateTime localDateTime19, LocalDateTime localDateTime20, LocalDateTime localDateTime21, LocalDateTime localDateTime22, String str13, String str14, String str15, StoreAuxUnitInfo storeAuxUnitInfo, List<GasStationAmenity> list, List<GasStationHour> list2, List<FuelPrice> list3, List<Tenant> tenants, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, LocalDateTime localDateTime23, LocalDateTime localDateTime24, LocalDateTime localDateTime25, LocalDateTime localDateTime26, LocalDateTime localDateTime27, LocalDateTime localDateTime28, LocalDateTime localDateTime29, LocalDateTime localDateTime30, String str24, String str25, LocalDateTime localDateTime31, LocalDateTime localDateTime32, LocalDateTime localDateTime33, LocalDateTime localDateTime34, LocalDateTime localDateTime35, LocalDateTime localDateTime36, LocalDateTime localDateTime37, LocalDateTime localDateTime38, String str26, String str27, String str28, LocalDateTime localDateTime39, String str29, String str30, Double d13, Double d14, MarketAndRegion marketAndRegion) {
        Intrinsics.j(fulfillmentInfo, "fulfillmentInfo");
        Intrinsics.j(tenants, "tenants");
        this.storeId = i10;
        this.fulfillmentInfo = fulfillmentInfo;
        this.mfcUnitId = str;
        this.streetAddress = str2;
        this.city = str3;
        this.state = str4;
        this.zipCode = str5;
        this.latitude = d10;
        this.longitude = d11;
        this.storeHours = str6;
        this.storeWeekdayOpen = localDateTime;
        this.storeWeekDayClose = localDateTime2;
        this.storeSaturdayOpen = localDateTime3;
        this.storeSaturdayClose = localDateTime4;
        this.storeSundayOpen = localDateTime5;
        this.storeSundayClose = localDateTime6;
        this.openDate = localDateTime7;
        this.closeDate = localDateTime8;
        this.driveThru = bool;
        this.clinic = bool2;
        this.storeFlag = str7;
        this.isMobileShoppingEnabled = str8;
        this.isMobilePaymentEnabled = str9;
        this.milesFrom = d12;
        this.name = str10;
        this.storePhoneNumber = str11;
        this.pharmacyPhone = str12;
        this.pharmacyWeekdayOpen = localDateTime9;
        this.pharmacyWeekdayClose = localDateTime10;
        this.pharmacySatOpen = localDateTime11;
        this.pharmacySatClose = localDateTime12;
        this.pharmacySunOpen = localDateTime13;
        this.pharmacySunClose = localDateTime14;
        this.pharmacyHolidayOpen = localDateTime15;
        this.pharmacyHolidayClose = localDateTime16;
        this.pharmacyDriveThruWeekdayOpen = localDateTime17;
        this.pharmacyDriveThruWeekdayClose = localDateTime18;
        this.pharmacyDriveThruSatOpen = localDateTime19;
        this.pharmacyDriveThruSatClose = localDateTime20;
        this.pharmacyDriveThruSunOpen = localDateTime21;
        this.pharmacyDriveThruSunClose = localDateTime22;
        this.pharmacyTimezone = str13;
        this.pharmacyAddress = str14;
        this.unitType = str15;
        this.auxUnitInfo = storeAuxUnitInfo;
        this.gasStationAmenities = list;
        this.gasStationHours = list2;
        this.fuelPrices = list3;
        this.tenants = tenants;
        this.storeDirName = str16;
        this.storeDirEmpId = str17;
        this.preOrderServiceAllow = str18;
        this.preOrderPhone = str19;
        this.preOrderDriveThru = str20;
        this.curbsideAllow = str21;
        this.curbsidePhone = str22;
        this.curbsideDriveThru = str23;
        this.curbsideWeekdayOpen = localDateTime23;
        this.curbsideWeekdayClose = localDateTime24;
        this.curbsideSatOpen = localDateTime25;
        this.curbsideSatClose = localDateTime26;
        this.curbsideSunOpen = localDateTime27;
        this.curbsideSunClose = localDateTime28;
        this.curbsideHolidayOpen = localDateTime29;
        this.curbsideHolidayClose = localDateTime30;
        this.curbsideInStoreAllow = str24;
        this.preOrderInStoreAllow = str25;
        this.preOrderWeekdayOpen = localDateTime31;
        this.preOrderWeekdayClose = localDateTime32;
        this.preOrderSatOpen = localDateTime33;
        this.preOrderSatClose = localDateTime34;
        this.preOrderSunOpen = localDateTime35;
        this.preOrderSunClose = localDateTime36;
        this.preOrderHolidayOpen = localDateTime37;
        this.preOrderHolidayClose = localDateTime38;
        this.timeZone = str26;
        this.daylightSavings = str27;
        this.vPos = str28;
        this.visibleDate = localDateTime39;
        this.cNCPickupDescription = str29;
        this.sPOPickupDescription = str30;
        this.latitudeRad = d13;
        this.longitudeRad = d14;
        this.marketAndRegions = marketAndRegion;
    }

    /* renamed from: A, reason: from getter */
    public final LocalDateTime getPharmacySatOpen() {
        return this.pharmacySatOpen;
    }

    /* renamed from: B, reason: from getter */
    public final LocalDateTime getPharmacySunClose() {
        return this.pharmacySunClose;
    }

    /* renamed from: C, reason: from getter */
    public final LocalDateTime getPharmacySunOpen() {
        return this.pharmacySunOpen;
    }

    /* renamed from: E, reason: from getter */
    public final LocalDateTime getPharmacyWeekdayClose() {
        return this.pharmacyWeekdayClose;
    }

    /* renamed from: F, reason: from getter */
    public final LocalDateTime getPharmacyWeekdayOpen() {
        return this.pharmacyWeekdayOpen;
    }

    /* renamed from: G, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: I, reason: from getter */
    public final String getStoreHours() {
        return this.storeHours;
    }

    /* renamed from: J, reason: from getter */
    public final String getStorePhoneNumber() {
        return this.storePhoneNumber;
    }

    @Override // Tq.k
    /* renamed from: K2, reason: from getter */
    public Double getMilesFrom() {
        return this.milesFrom;
    }

    /* renamed from: L, reason: from getter */
    public final LocalDateTime getStoreSaturdayClose() {
        return this.storeSaturdayClose;
    }

    /* renamed from: M, reason: from getter */
    public final LocalDateTime getStoreSaturdayOpen() {
        return this.storeSaturdayOpen;
    }

    /* renamed from: N, reason: from getter */
    public final LocalDateTime getStoreSundayClose() {
        return this.storeSundayClose;
    }

    /* renamed from: O, reason: from getter */
    public final LocalDateTime getStoreSundayOpen() {
        return this.storeSundayOpen;
    }

    /* renamed from: P, reason: from getter */
    public final LocalDateTime getStoreWeekDayClose() {
        return this.storeWeekDayClose;
    }

    /* renamed from: Q, reason: from getter */
    public final LocalDateTime getStoreWeekdayOpen() {
        return this.storeWeekdayOpen;
    }

    @Override // Tq.k
    /* renamed from: R, reason: from getter */
    public String getZipCode() {
        return this.zipCode;
    }

    /* renamed from: S, reason: from getter */
    public final String getStreetAddress() {
        return this.streetAddress;
    }

    public final boolean T() {
        return StringsKt.H("CS", this.unitType, true);
    }

    /* renamed from: a, reason: from getter */
    public final StoreAuxUnitInfo getAuxUnitInfo() {
        return this.auxUnitInfo;
    }

    /* renamed from: b, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: c, reason: from getter */
    public final LocalDateTime getCurbsideSatClose() {
        return this.curbsideSatClose;
    }

    /* renamed from: d, reason: from getter */
    public final LocalDateTime getCurbsideSatOpen() {
        return this.curbsideSatOpen;
    }

    /* renamed from: e, reason: from getter */
    public final LocalDateTime getCurbsideSunClose() {
        return this.curbsideSunClose;
    }

    public boolean equals(Object other) {
        return (other instanceof StoreDetails) && ((StoreDetails) other).getStoreId() == getStoreId();
    }

    /* renamed from: f, reason: from getter */
    public final LocalDateTime getCurbsideSunOpen() {
        return this.curbsideSunOpen;
    }

    /* renamed from: g, reason: from getter */
    public final LocalDateTime getCurbsideWeekdayClose() {
        return this.curbsideWeekdayClose;
    }

    @Override // Tq.k
    public String getName() {
        return this.name;
    }

    /* renamed from: h, reason: from getter */
    public final LocalDateTime getCurbsideWeekdayOpen() {
        return this.curbsideWeekdayOpen;
    }

    public final Double i(EnumC16091b fuelType) {
        Object next;
        Intrinsics.j(fuelType, "fuelType");
        List<FuelPrice> list = this.fuelPrices;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((FuelPrice) next).getFuelType() == fuelType) {
                    break;
                }
            }
            FuelPrice fuelPrice = (FuelPrice) next;
            if (fuelPrice != null) {
                return Double.valueOf(fuelPrice.getFuelPrice());
            }
        }
        return null;
    }

    public final List<GasStationAmenity> j() {
        return this.gasStationAmenities;
    }

    public final List<GasStationHour> k() {
        return this.gasStationHours;
    }

    /* renamed from: n, reason: from getter */
    public final Double getLatitude() {
        return this.latitude;
    }

    /* renamed from: o, reason: from getter */
    public final Double getLongitude() {
        return this.longitude;
    }

    /* renamed from: q, reason: from getter */
    public final LocalDateTime getPharmacyDriveThruSatClose() {
        return this.pharmacyDriveThruSatClose;
    }

    /* renamed from: r, reason: from getter */
    public final LocalDateTime getPharmacyDriveThruSatOpen() {
        return this.pharmacyDriveThruSatOpen;
    }

    /* renamed from: s, reason: from getter */
    public final LocalDateTime getPharmacyDriveThruSunClose() {
        return this.pharmacyDriveThruSunClose;
    }

    /* renamed from: t, reason: from getter */
    public final LocalDateTime getPharmacyDriveThruSunOpen() {
        return this.pharmacyDriveThruSunOpen;
    }

    @Override // Tq.h
    /* renamed from: u, reason: from getter */
    public int getStoreId() {
        return this.storeId;
    }

    /* renamed from: v, reason: from getter */
    public final LocalDateTime getPharmacyDriveThruWeekdayClose() {
        return this.pharmacyDriveThruWeekdayClose;
    }

    /* renamed from: w, reason: from getter */
    public final LocalDateTime getPharmacyDriveThruWeekdayOpen() {
        return this.pharmacyDriveThruWeekdayOpen;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeInt(this.storeId);
        List<FulfillmentInfoModel> list = this.fulfillmentInfo;
        dest.writeInt(list.size());
        Iterator<FulfillmentInfoModel> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeString(this.mfcUnitId);
        dest.writeString(this.streetAddress);
        dest.writeString(this.city);
        dest.writeString(this.state);
        dest.writeString(this.zipCode);
        Double d10 = this.latitude;
        if (d10 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d10.doubleValue());
        }
        Double d11 = this.longitude;
        if (d11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d11.doubleValue());
        }
        dest.writeString(this.storeHours);
        dest.writeSerializable(this.storeWeekdayOpen);
        dest.writeSerializable(this.storeWeekDayClose);
        dest.writeSerializable(this.storeSaturdayOpen);
        dest.writeSerializable(this.storeSaturdayClose);
        dest.writeSerializable(this.storeSundayOpen);
        dest.writeSerializable(this.storeSundayClose);
        dest.writeSerializable(this.openDate);
        dest.writeSerializable(this.closeDate);
        Boolean bool = this.driveThru;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.clinic;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.storeFlag);
        dest.writeString(this.isMobileShoppingEnabled);
        dest.writeString(this.isMobilePaymentEnabled);
        Double d12 = this.milesFrom;
        if (d12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d12.doubleValue());
        }
        dest.writeString(this.name);
        dest.writeString(this.storePhoneNumber);
        dest.writeString(this.pharmacyPhone);
        dest.writeSerializable(this.pharmacyWeekdayOpen);
        dest.writeSerializable(this.pharmacyWeekdayClose);
        dest.writeSerializable(this.pharmacySatOpen);
        dest.writeSerializable(this.pharmacySatClose);
        dest.writeSerializable(this.pharmacySunOpen);
        dest.writeSerializable(this.pharmacySunClose);
        dest.writeSerializable(this.pharmacyHolidayOpen);
        dest.writeSerializable(this.pharmacyHolidayClose);
        dest.writeSerializable(this.pharmacyDriveThruWeekdayOpen);
        dest.writeSerializable(this.pharmacyDriveThruWeekdayClose);
        dest.writeSerializable(this.pharmacyDriveThruSatOpen);
        dest.writeSerializable(this.pharmacyDriveThruSatClose);
        dest.writeSerializable(this.pharmacyDriveThruSunOpen);
        dest.writeSerializable(this.pharmacyDriveThruSunClose);
        dest.writeString(this.pharmacyTimezone);
        dest.writeString(this.pharmacyAddress);
        dest.writeString(this.unitType);
        StoreAuxUnitInfo storeAuxUnitInfo = this.auxUnitInfo;
        if (storeAuxUnitInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            storeAuxUnitInfo.writeToParcel(dest, flags);
        }
        List<GasStationAmenity> list2 = this.gasStationAmenities;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list2.size());
            Iterator<GasStationAmenity> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(dest, flags);
            }
        }
        List<GasStationHour> list3 = this.gasStationHours;
        if (list3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list3.size());
            Iterator<GasStationHour> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(dest, flags);
            }
        }
        List<FuelPrice> list4 = this.fuelPrices;
        if (list4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list4.size());
            Iterator<FuelPrice> it4 = list4.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(dest, flags);
            }
        }
        List<Tenant> list5 = this.tenants;
        dest.writeInt(list5.size());
        Iterator<Tenant> it5 = list5.iterator();
        while (it5.hasNext()) {
            it5.next().writeToParcel(dest, flags);
        }
        dest.writeString(this.storeDirName);
        dest.writeString(this.storeDirEmpId);
        dest.writeString(this.preOrderServiceAllow);
        dest.writeString(this.preOrderPhone);
        dest.writeString(this.preOrderDriveThru);
        dest.writeString(this.curbsideAllow);
        dest.writeString(this.curbsidePhone);
        dest.writeString(this.curbsideDriveThru);
        dest.writeSerializable(this.curbsideWeekdayOpen);
        dest.writeSerializable(this.curbsideWeekdayClose);
        dest.writeSerializable(this.curbsideSatOpen);
        dest.writeSerializable(this.curbsideSatClose);
        dest.writeSerializable(this.curbsideSunOpen);
        dest.writeSerializable(this.curbsideSunClose);
        dest.writeSerializable(this.curbsideHolidayOpen);
        dest.writeSerializable(this.curbsideHolidayClose);
        dest.writeString(this.curbsideInStoreAllow);
        dest.writeString(this.preOrderInStoreAllow);
        dest.writeSerializable(this.preOrderWeekdayOpen);
        dest.writeSerializable(this.preOrderWeekdayClose);
        dest.writeSerializable(this.preOrderSatOpen);
        dest.writeSerializable(this.preOrderSatClose);
        dest.writeSerializable(this.preOrderSunOpen);
        dest.writeSerializable(this.preOrderSunClose);
        dest.writeSerializable(this.preOrderHolidayOpen);
        dest.writeSerializable(this.preOrderHolidayClose);
        dest.writeString(this.timeZone);
        dest.writeString(this.daylightSavings);
        dest.writeString(this.vPos);
        dest.writeSerializable(this.visibleDate);
        dest.writeString(this.cNCPickupDescription);
        dest.writeString(this.sPOPickupDescription);
        Double d13 = this.latitudeRad;
        if (d13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d13.doubleValue());
        }
        Double d14 = this.longitudeRad;
        if (d14 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d14.doubleValue());
        }
        MarketAndRegion marketAndRegion = this.marketAndRegions;
        if (marketAndRegion == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            marketAndRegion.writeToParcel(dest, flags);
        }
    }

    /* renamed from: x, reason: from getter */
    public final String getPharmacyPhone() {
        return this.pharmacyPhone;
    }

    /* renamed from: y, reason: from getter */
    public final LocalDateTime getPharmacySatClose() {
        return this.pharmacySatClose;
    }

    public int hashCode() {
        return getStoreId();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StoreDetails(int i10, List list, String str, String str2, String str3, String str4, String str5, Double d10, Double d11, String str6, LocalDateTime localDateTime, LocalDateTime localDateTime2, LocalDateTime localDateTime3, LocalDateTime localDateTime4, LocalDateTime localDateTime5, LocalDateTime localDateTime6, LocalDateTime localDateTime7, LocalDateTime localDateTime8, Boolean bool, Boolean bool2, String str7, String str8, String str9, Double d12, String str10, String str11, String str12, LocalDateTime localDateTime9, LocalDateTime localDateTime10, LocalDateTime localDateTime11, LocalDateTime localDateTime12, LocalDateTime localDateTime13, LocalDateTime localDateTime14, LocalDateTime localDateTime15, LocalDateTime localDateTime16, LocalDateTime localDateTime17, LocalDateTime localDateTime18, LocalDateTime localDateTime19, LocalDateTime localDateTime20, LocalDateTime localDateTime21, LocalDateTime localDateTime22, String str13, String str14, String str15, StoreAuxUnitInfo storeAuxUnitInfo, List list2, List list3, List list4, List list5, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, LocalDateTime localDateTime23, LocalDateTime localDateTime24, LocalDateTime localDateTime25, LocalDateTime localDateTime26, LocalDateTime localDateTime27, LocalDateTime localDateTime28, LocalDateTime localDateTime29, LocalDateTime localDateTime30, String str24, String str25, LocalDateTime localDateTime31, LocalDateTime localDateTime32, LocalDateTime localDateTime33, LocalDateTime localDateTime34, LocalDateTime localDateTime35, LocalDateTime localDateTime36, LocalDateTime localDateTime37, LocalDateTime localDateTime38, String str26, String str27, String str28, LocalDateTime localDateTime39, String str29, String str30, Double d13, Double d14, MarketAndRegion marketAndRegion, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        Double dValueOf = Double.valueOf(0.0d);
        int i14 = (i11 & 1) != 0 ? 0 : i10;
        List listM = (i11 & 2) != 0 ? CollectionsKt.m() : list;
        String str31 = (i11 & 4) != 0 ? "" : str;
        String str32 = (i11 & 8) != 0 ? null : str2;
        String str33 = (i11 & 16) != 0 ? null : str3;
        String str34 = (i11 & 32) != 0 ? null : str4;
        String str35 = (i11 & 64) != 0 ? null : str5;
        Double d15 = (i11 & 128) != 0 ? dValueOf : d10;
        Double d16 = (i11 & 256) != 0 ? dValueOf : d11;
        String str36 = (i11 & 512) != 0 ? null : str6;
        LocalDateTime localDateTime40 = (i11 & 1024) != 0 ? null : localDateTime;
        LocalDateTime localDateTime41 = (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? null : localDateTime2;
        LocalDateTime localDateTime42 = (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : localDateTime3;
        LocalDateTime localDateTime43 = (i11 & 8192) != 0 ? null : localDateTime4;
        LocalDateTime localDateTime44 = (i11 & 16384) != 0 ? null : localDateTime5;
        LocalDateTime localDateTime45 = (i11 & 32768) != 0 ? null : localDateTime6;
        LocalDateTime localDateTime46 = (i11 & 65536) != 0 ? null : localDateTime7;
        LocalDateTime localDateTime47 = (i11 & 131072) != 0 ? null : localDateTime8;
        Boolean bool3 = (i11 & 262144) != 0 ? Boolean.FALSE : bool;
        Boolean bool4 = (i11 & 524288) != 0 ? Boolean.FALSE : bool2;
        String str37 = (i11 & 1048576) != 0 ? "" : str7;
        String str38 = (i11 & 2097152) != 0 ? "" : str8;
        String str39 = (i11 & 4194304) != 0 ? "" : str9;
        Double d17 = (i11 & 8388608) != 0 ? dValueOf : d12;
        String str40 = (i11 & 16777216) != 0 ? null : str10;
        String str41 = (i11 & 33554432) != 0 ? null : str11;
        String str42 = (i11 & 67108864) != 0 ? null : str12;
        LocalDateTime localDateTime48 = (i11 & 134217728) != 0 ? null : localDateTime9;
        LocalDateTime localDateTime49 = (i11 & 268435456) != 0 ? null : localDateTime10;
        LocalDateTime localDateTime50 = (i11 & 536870912) != 0 ? null : localDateTime11;
        LocalDateTime localDateTime51 = (i11 & 1073741824) != 0 ? null : localDateTime12;
        LocalDateTime localDateTime52 = (i11 & Integer.MIN_VALUE) != 0 ? null : localDateTime13;
        this(i14, listM, str31, str32, str33, str34, str35, d15, d16, str36, localDateTime40, localDateTime41, localDateTime42, localDateTime43, localDateTime44, localDateTime45, localDateTime46, localDateTime47, bool3, bool4, str37, str38, str39, d17, str40, str41, str42, localDateTime48, localDateTime49, localDateTime50, localDateTime51, localDateTime52, (i12 & 1) != 0 ? null : localDateTime14, (i12 & 2) != 0 ? null : localDateTime15, (i12 & 4) != 0 ? null : localDateTime16, (i12 & 8) != 0 ? null : localDateTime17, (i12 & 16) != 0 ? null : localDateTime18, (i12 & 32) != 0 ? null : localDateTime19, (i12 & 64) != 0 ? null : localDateTime20, (i12 & 128) != 0 ? null : localDateTime21, (i12 & 256) != 0 ? null : localDateTime22, (i12 & 512) != 0 ? "" : str13, (i12 & 1024) != 0 ? "" : str14, (i12 & RecyclerView.m.FLAG_MOVED) != 0 ? null : str15, (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : storeAuxUnitInfo, (i12 & 8192) != 0 ? null : list2, (i12 & 16384) != 0 ? null : list3, (i12 & 32768) != 0 ? null : list4, (i12 & 65536) != 0 ? CollectionsKt.m() : list5, (i12 & 131072) != 0 ? "" : str16, (i12 & 262144) != 0 ? "" : str17, (i12 & 524288) != 0 ? "" : str18, (i12 & 1048576) != 0 ? "" : str19, (i12 & 2097152) != 0 ? "" : str20, (i12 & 4194304) != 0 ? "" : str21, (i12 & 8388608) != 0 ? "" : str22, (i12 & 16777216) != 0 ? "" : str23, (i12 & 33554432) != 0 ? null : localDateTime23, (i12 & 67108864) != 0 ? null : localDateTime24, (i12 & 134217728) != 0 ? null : localDateTime25, (i12 & 268435456) != 0 ? null : localDateTime26, (i12 & 536870912) != 0 ? null : localDateTime27, (i12 & 1073741824) != 0 ? null : localDateTime28, (i12 & Integer.MIN_VALUE) != 0 ? null : localDateTime29, (i13 & 1) != 0 ? null : localDateTime30, (i13 & 2) != 0 ? "" : str24, (i13 & 4) != 0 ? "" : str25, (i13 & 8) != 0 ? null : localDateTime31, (i13 & 16) != 0 ? null : localDateTime32, (i13 & 32) != 0 ? null : localDateTime33, (i13 & 64) != 0 ? null : localDateTime34, (i13 & 128) != 0 ? null : localDateTime35, (i13 & 256) != 0 ? null : localDateTime36, (i13 & 512) != 0 ? null : localDateTime37, (i13 & 1024) != 0 ? null : localDateTime38, (i13 & RecyclerView.m.FLAG_MOVED) != 0 ? "" : str26, (i13 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? "" : str27, (i13 & 8192) != 0 ? "" : str28, (i13 & 16384) != 0 ? null : localDateTime39, (i13 & 32768) != 0 ? "" : str29, (i13 & 65536) == 0 ? str30 : "", (i13 & 131072) != 0 ? dValueOf : d13, (i13 & 262144) != 0 ? dValueOf : d14, (i13 & 524288) != 0 ? new MarketAndRegion(null, null, null, null, 15, null) : marketAndRegion);
    }
}
