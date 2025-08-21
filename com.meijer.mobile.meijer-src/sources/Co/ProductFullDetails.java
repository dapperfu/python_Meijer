package Co;

import Do.Classification;
import Eo.NutritionLabel;
import Ho.SponsoredData;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.medallia.digital.mobilesdk.l3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import nk.InterfaceC15960a;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\bk\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B¯\u0005\u0012\f\b\u0002\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\f\b\u0002\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\f\u0012\b\b\u0002\u0010\u0018\u001a\u00020\f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\f\u0012\b\b\u0002\u0010\u001a\u001a\u00020\f\u0012\b\b\u0002\u0010\u001b\u001a\u00020\f\u0012\b\b\u0002\u0010\u001c\u001a\u00020\f\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010#\u001a\u00020\f\u0012\b\b\u0002\u0010$\u001a\u00020\u0005\u0012\b\b\u0002\u0010%\u001a\u00020\f\u0012\b\b\u0002\u0010&\u001a\u00020\t\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010)\u001a\u00020(\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010+\u001a\u00020\f\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u0002000\u0012\u0012\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u0002020\u0012\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u00106\u001a\u000205\u0012\b\b\u0002\u00107\u001a\u00020\u0005\u0012\b\b\u0002\u00108\u001a\u00020\u0005\u0012\b\b\u0002\u00109\u001a\u00020\u0005\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010;\u001a\u00020\f\u0012\b\b\u0002\u0010<\u001a\u00020\f\u0012\b\b\u0002\u0010=\u001a\u00020\f\u0012\b\b\u0002\u0010>\u001a\u00020\f\u0012\b\b\u0002\u0010?\u001a\u00020\f\u0012\b\b\u0002\u0010@\u001a\u00020\f\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010D\u001a\u000e\u0012\b\u0012\u00060Bj\u0002`C\u0018\u00010\u0012\u0012\b\b\u0002\u0010E\u001a\u00020\t\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010F\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010I\u001a\u00020\f\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010M\u001a\u00020L\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010O\u001a\u00020\f\u0012\u000e\b\u0002\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0\u0012\u0012\b\b\u0002\u0010R\u001a\u00020\t¢\u0006\u0004\bS\u0010TJ\r\u0010U\u001a\u00020\f¢\u0006\u0004\bU\u0010VJ\u001d\u0010[\u001a\u00020Z2\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020\t¢\u0006\u0004\b[\u0010\\J\r\u0010]\u001a\u00020\t¢\u0006\u0004\b]\u0010^J¸\u0005\u0010_\u001a\u00020\u00002\f\b\u0002\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\b\b\u0002\u0010\b\u001a\u00020\u00052\f\b\u0002\u0010\u000b\u001a\u00060\tj\u0002`\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010#\u001a\u00020\f2\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\f2\b\b\u0002\u0010&\u001a\u00020\t2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010)\u001a\u00020(2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010+\u001a\u00020\f2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00122\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00122\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u00106\u001a\u0002052\b\b\u0002\u00107\u001a\u00020\u00052\b\b\u0002\u00108\u001a\u00020\u00052\b\b\u0002\u00109\u001a\u00020\u00052\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010;\u001a\u00020\f2\b\b\u0002\u0010<\u001a\u00020\f2\b\b\u0002\u0010=\u001a\u00020\f2\b\b\u0002\u0010>\u001a\u00020\f2\b\b\u0002\u0010?\u001a\u00020\f2\b\b\u0002\u0010@\u001a\u00020\f2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010D\u001a\u000e\u0012\b\u0012\u00060Bj\u0002`C\u0018\u00010\u00122\b\b\u0002\u0010E\u001a\u00020\t2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010F2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010I\u001a\u00020\f2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010M\u001a\u00020L2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010O\u001a\u00020\f2\u000e\b\u0002\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0\u00122\b\b\u0002\u0010R\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b_\u0010`J\u0010\u0010a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\ba\u0010bJ\u0010\u0010c\u001a\u00020\tHÖ\u0001¢\u0006\u0004\bc\u0010^J\u001a\u0010f\u001a\u00020\f2\b\u0010e\u001a\u0004\u0018\u00010dHÖ\u0003¢\u0006\u0004\bf\u0010gR\u001e\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010h\u001a\u0004\bi\u0010bR\u001a\u0010\b\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bj\u0010h\u001a\u0004\bk\u0010bR\u001e\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010^R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010VR\u001a\u0010\u000e\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\br\u0010p\u001a\u0004\bs\u0010VR\u001a\u0010\u000f\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bt\u0010p\u001a\u0004\bu\u0010VR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bv\u0010h\u001a\u0004\bt\u0010bR\u001a\u0010\u0011\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bw\u0010h\u001a\u0004\bw\u0010bR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bz\u0010h\u001a\u0004\b|\u0010bR\u001a\u0010\u0016\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b}\u0010p\u001a\u0004\b\u0016\u0010VR\u001a\u0010\u0017\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b~\u0010p\u001a\u0004\b\u007f\u0010VR\u001c\u0010\u0018\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010p\u001a\u0005\b\u0081\u0001\u0010VR\u001c\u0010\u0019\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010p\u001a\u0005\b\u0083\u0001\u0010VR\u001c\u0010\u001a\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010p\u001a\u0005\b\u0085\u0001\u0010VR\u001c\u0010\u001b\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010p\u001a\u0005\b\u0087\u0001\u0010VR\u001b\u0010\u001c\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\r\n\u0005\b\u0088\u0001\u0010p\u001a\u0004\b\u001c\u0010VR\u001d\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0005\b~\u0010\u008b\u0001R\u001b\u0010\u001f\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\r\n\u0005\b\u008c\u0001\u0010p\u001a\u0004\b\u001f\u0010VR \u0010!\u001a\u0004\u0018\u00010 8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001f\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bn\u0010\u008a\u0001\u001a\u0006\b\u0091\u0001\u0010\u008b\u0001R\u001b\u0010#\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\r\n\u0005\b\u0092\u0001\u0010p\u001a\u0004\bx\u0010VR\u001b\u0010$\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\r\n\u0004\b|\u0010h\u001a\u0005\b\u0082\u0001\u0010bR\u001c\u0010%\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010p\u001a\u0005\b\u0094\u0001\u0010VR\u001c\u0010&\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010m\u001a\u0005\b\u0096\u0001\u0010^R \u0010'\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u008a\u0001\u001a\u0006\b\u0098\u0001\u0010\u008b\u0001R\u001e\u0010)\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001f\u0010*\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bq\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001c\u0010+\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b \u0001\u0010p\u001a\u0005\b¡\u0001\u0010VR\u001e\u0010,\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u009a\u0001\u0010h\u001a\u0005\b¢\u0001\u0010bR\u001d\u0010-\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\r\n\u0004\bu\u0010h\u001a\u0005\b£\u0001\u0010bR\u001d\u0010.\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\r\n\u0004\bU\u0010h\u001a\u0005\b\u0093\u0001\u0010bR\u001e\u0010/\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b¤\u0001\u0010h\u001a\u0005\b\u0086\u0001\u0010bR\u001e\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00128\u0006¢\u0006\r\n\u0005\b¥\u0001\u0010y\u001a\u0004\bo\u0010{R\u001e\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00128\u0006¢\u0006\r\n\u0004\bm\u0010y\u001a\u0005\b¦\u0001\u0010{R\u001b\u00104\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b§\u0001\u0010h\u001a\u0005\b¨\u0001\u0010bR\u001a\u00106\u001a\u0002058\u0006¢\u0006\u000f\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0005\bl\u0010«\u0001R\u0019\u00107\u001a\u00020\u00058\u0006¢\u0006\u000e\n\u0005\b¬\u0001\u0010h\u001a\u0005\b\u00ad\u0001\u0010bR\u0018\u00108\u001a\u00020\u00058\u0006¢\u0006\r\n\u0005\b®\u0001\u0010h\u001a\u0004\br\u0010bR\u0018\u00109\u001a\u00020\u00058\u0006¢\u0006\r\n\u0005\b¯\u0001\u0010h\u001a\u0004\bv\u0010bR\u001a\u0010:\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\r\n\u0005\b°\u0001\u0010h\u001a\u0004\b}\u0010bR\u0019\u0010;\u001a\u00020\f8\u0006¢\u0006\u000e\n\u0005\b±\u0001\u0010p\u001a\u0005\b \u0001\u0010VR\u0018\u0010<\u001a\u00020\f8\u0006¢\u0006\r\n\u0005\b²\u0001\u0010p\u001a\u0004\b<\u0010VR\u0019\u0010=\u001a\u00020\f8\u0006¢\u0006\u000e\n\u0005\b³\u0001\u0010p\u001a\u0005\b¤\u0001\u0010VR\u0018\u0010>\u001a\u00020\f8\u0006¢\u0006\r\n\u0005\b´\u0001\u0010p\u001a\u0004\b>\u0010VR\u0018\u0010?\u001a\u00020\f8\u0006¢\u0006\r\n\u0005\bµ\u0001\u0010p\u001a\u0004\bm\u0010VR\u0019\u0010@\u001a\u00020\f8\u0006¢\u0006\u000e\n\u0005\b¶\u0001\u0010p\u001a\u0005\b§\u0001\u0010VR\u001b\u0010A\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b·\u0001\u0010h\u001a\u0005\b¸\u0001\u0010bR%\u0010D\u001a\u000e\u0012\b\u0012\u00060Bj\u0002`C\u0018\u00010\u00128\u0006¢\u0006\u000e\n\u0005\b¹\u0001\u0010y\u001a\u0005\b\u0084\u0001\u0010{R\u0019\u0010E\u001a\u00020\t8\u0006¢\u0006\u000e\n\u0005\bº\u0001\u0010m\u001a\u0005\b»\u0001\u0010^R\u001d\u0010G\u001a\u0004\u0018\u00010F8\u0006¢\u0006\u0010\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b\u0088\u0001\u0010¾\u0001R\u001a\u0010H\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\r\n\u0004\bp\u0010h\u001a\u0005\b¿\u0001\u0010bR\u0019\u0010I\u001a\u00020\f8\u0006¢\u0006\u000e\n\u0005\bÀ\u0001\u0010p\u001a\u0005\bÁ\u0001\u0010VR\u001d\u0010J\u001a\u0004\u0018\u00010(8\u0006¢\u0006\u0010\n\u0006\bÂ\u0001\u0010Ã\u0001\u001a\u0006\b\u0089\u0001\u0010Ä\u0001R\u001b\u0010K\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\bÅ\u0001\u0010h\u001a\u0005\b\u008c\u0001\u0010bR\u001b\u0010M\u001a\u00020L8\u0006¢\u0006\u0010\n\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0006\b\u0092\u0001\u0010È\u0001R\u001b\u0010N\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010h\u001a\u0005\b\u0095\u0001\u0010bR\u0019\u0010O\u001a\u00020\f8\u0006¢\u0006\u000e\n\u0005\bÉ\u0001\u0010p\u001a\u0005\bÊ\u0001\u0010VR\u001f\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0\u00128\u0006¢\u0006\u000e\n\u0005\bË\u0001\u0010y\u001a\u0005\b\u0099\u0001\u0010{R.\u0010R\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u001e\n\u0005\bÌ\u0001\u0010m\u0012\u0006\bÎ\u0001\u0010Ï\u0001\u001a\u0005\b\u008d\u0001\u0010^\"\u0006\b¬\u0001\u0010Í\u0001R\u0018\u0010Ó\u0001\u001a\u00030Ð\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÑ\u0001\u0010Ò\u0001¨\u0006Ô\u0001"}, d2 = {"LCo/h;", "Lnk/m;", "Lnk/h;", "Lnk/e;", "Landroid/os/Parcelable;", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "code", "name", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "isAgeRestricted", "isAlcohol", "isChokingHazard", "description", "ean", "", "LCo/e;", "images", "summary", "isAlcoholRestricted", "isAvailableForPickup", "isBuyable", "isDisabled", "isDisplayable", "isHomeDeliveryNotAvailable", "isPurchasable", "Lnk/b;", "price", "isPriceByWeight", "Lnk/a;", "discount", "discountedPrice", "hasMPerksOffers", "itemUnitOfMeasure", "isMap", "orderQuantityInterval", "depositPrice", "", "qtyIncrement", "maxOrderQuantity", "isSale", "priceUnit", "url", "unitCode", "unit", "LCo/a;", "categories", "LDo/a;", "classifications", "countryOfOrigin", "LHo/c;", "beaconInfo", "descriptiveFeatures", "department", "disclaimer", "ingredients", "isBopas", "isClickAndCollect", "isEbtProduct", "isMeijerBrand", "isSponsoredCriteo", "isSubscriptionAvailable", "manufacturer", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "mPerksOfferIds", "numberOfReviews", "LEo/g;", "nutritionLabel", "packageSize", "prepareItem", "promoId", "promoText", "LCo/o;", "stockInfo", "upcType", "validDates", "LCo/k;", "variantGroups", "quantity", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZZZZZZZLnk/b;ZLnk/a;Lnk/b;ZLjava/lang/String;ZILnk/b;DLjava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;LHo/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZLjava/lang/String;Ljava/util/List;ILEo/g;Ljava/lang/String;ZLjava/lang/Double;Ljava/lang/String;LCo/o;Ljava/lang/String;ZLjava/util/List;I)V", "F", "()Z", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(Ljava/lang/String;Ljava/lang/String;IZZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZZZZZZZLnk/b;ZLnk/a;Lnk/b;ZLjava/lang/String;ZILnk/b;DLjava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;LHo/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZLjava/lang/String;Ljava/util/List;ILEo/g;Ljava/lang/String;ZLjava/lang/Double;Ljava/lang/String;LCo/o;Ljava/lang/String;ZLjava/util/List;I)LCo/h;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCode", "b", "getName", "c", "I", "u", "d", "Z", "B", "e", "B1", "f", "E", "g", "h", "i", "Ljava/util/List;", "j", "()Ljava/util/List;", "w", "k", "l", "y3", "m", "R1", "n", "n1", "o", "l2", "p", "q2", "q", "r", "Lnk/b;", "()Lnk/b;", "s", "t", "Lnk/a;", "e0", "()Lnk/a;", "k0", "v", "x", "P3", "y", "getOrderQuantityInterval", "z", "Q0", "A", "D", "r2", "()D", "Ljava/lang/Integer;", "H0", "()Ljava/lang/Integer;", "C", "d3", "f1", "getUrl", "G", "H", "getClassifications", "J", "getCountryOfOrigin", "K", "LHo/c;", "()LHo/c;", "L", "getDescriptiveFeatures", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "getManufacturer", "W", "X", "getNumberOfReviews", "Y", "LEo/g;", "()LEo/g;", "getPackageSize", "a0", "getPrepareItem", "b0", "Ljava/lang/Double;", "()Ljava/lang/Double;", "c0", "d0", "LCo/o;", "()LCo/o;", "f0", "getValidDates", "g0", "h0", "(I)V", "getQuantity$annotations", "()V", "Lnk/n;", "Q1", "()Lnk/n;", "stockLevel", "fulldetails_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Co.h, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class ProductFullDetails implements nk.m, nk.h, nk.e, Parcelable {
    public static final Parcelable.Creator<ProductFullDetails> CREATOR = new a();

    /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
    private final double qtyIncrement;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer maxOrderQuantity;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSale;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
    private final String priceUnit;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata and from toString */
    private final String unitCode;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata and from toString */
    private final String unit;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Category> categories;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Classification> classifications;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata and from toString */
    private final String countryOfOrigin;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata and from toString */
    private final transient SponsoredData beaconInfo;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata and from toString */
    private final String descriptiveFeatures;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata and from toString */
    private final String department;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata and from toString */
    private final String disclaimer;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ingredients;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isBopas;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isClickAndCollect;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEbtProduct;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMeijerBrand;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSponsoredCriteo;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSubscriptionAvailable;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata and from toString */
    private final String manufacturer;

    /* renamed from: W, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Long> mPerksOfferIds;

    /* renamed from: X, reason: collision with root package name and from kotlin metadata and from toString */
    private final int numberOfReviews;

    /* renamed from: Y, reason: collision with root package name and from kotlin metadata and from toString */
    private final NutritionLabel nutritionLabel;

    /* renamed from: Z, reason: collision with root package name and from kotlin metadata and from toString */
    private final String packageSize;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean prepareItem;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double promoId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promoText;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAgeRestricted;

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata and from toString */
    private final StockInfo stockInfo;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAlcohol;

    /* renamed from: e0, reason: collision with root package name and from kotlin metadata and from toString */
    private final String upcType;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isChokingHazard;

    /* renamed from: f0, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean validDates;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: g0, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ProductVariantGroup> variantGroups;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ean;

    /* renamed from: h0, reason: collision with root package name and from kotlin metadata and from toString */
    private int quantity;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Image> images;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String summary;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAlcoholRestricted;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAvailableForPickup;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isBuyable;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDisabled;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDisplayable;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isHomeDeliveryNotAvailable;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPurchasable;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.b price;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPriceByWeight;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC15960a discount;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.b discountedPrice;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasMPerksOffers;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final String itemUnitOfMeasure;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMap;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final int orderQuantityInterval;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.b depositPrice;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Co.h$a */
    public static final class a implements Parcelable.Creator<ProductFullDetails> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r61v1 */
        /* JADX WARN: Type inference failed for: r61v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r61v3 */
        /* JADX WARN: Type inference failed for: r62v0, types: [java.util.List] */
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProductFullDetails createFromParcel(Parcel parcel) {
            boolean z10;
            Class cls;
            nk.b bVar;
            boolean z11;
            Class cls2;
            String str;
            boolean z12;
            Double d10;
            boolean z13;
            Double d11;
            boolean z14;
            Double d12;
            boolean z15;
            Double d13;
            boolean z16;
            Double d14;
            boolean z17;
            Double d15;
            boolean z18;
            Double dValueOf;
            boolean z19;
            SponsoredData cVar;
            ArrayList arrayList;
            boolean z20;
            InterfaceC15960a interfaceC15960a;
            String str2;
            Double d16;
            int i10;
            Intrinsics.j(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i11 = parcel.readInt();
            boolean z21 = true;
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = true;
                z21 = false;
            }
            boolean z22 = parcel.readInt() != 0 ? z10 : false;
            boolean z23 = parcel.readInt() != 0 ? z10 : false;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList2.add(Image.CREATOR.createFromParcel(parcel));
            }
            String string5 = parcel.readString();
            boolean z24 = parcel.readInt() != 0 ? z10 : false;
            boolean z25 = parcel.readInt() != 0 ? z10 : false;
            boolean z26 = parcel.readInt() != 0 ? z10 : false;
            boolean z27 = parcel.readInt() != 0 ? z10 : false;
            boolean z28 = parcel.readInt() != 0 ? z10 : false;
            boolean z29 = parcel.readInt() != 0 ? z10 : false;
            boolean z30 = parcel.readInt() != 0 ? z10 : false;
            nk.b bVar2 = (nk.b) parcel.readParcelable(ProductFullDetails.class.getClassLoader());
            boolean z31 = parcel.readInt() != 0;
            InterfaceC15960a interfaceC15960a2 = (InterfaceC15960a) parcel.readParcelable(ProductFullDetails.class.getClassLoader());
            nk.b bVar3 = (nk.b) parcel.readParcelable(ProductFullDetails.class.getClassLoader());
            if (parcel.readInt() != 0) {
                cls = ProductFullDetails.class;
                bVar = bVar2;
                z11 = true;
            } else {
                cls = ProductFullDetails.class;
                bVar = bVar2;
                z11 = false;
            }
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                cls2 = cls;
                str = string6;
                z12 = true;
            } else {
                cls2 = cls;
                str = string6;
                z12 = false;
            }
            int i14 = parcel.readInt();
            nk.b bVar4 = (nk.b) parcel.readParcelable(cls2.getClassLoader());
            double d17 = parcel.readDouble();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                d10 = null;
                z13 = true;
            } else {
                d10 = null;
                z13 = false;
            }
            String string7 = parcel.readString();
            Double d18 = d10;
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            int i15 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i15);
            int i16 = 0;
            while (i16 != i15) {
                arrayList3.add(Category.CREATOR.createFromParcel(parcel));
                i16++;
                i15 = i15;
            }
            int i17 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i17);
            int i18 = 0;
            while (i18 != i17) {
                arrayList4.add(Classification.CREATOR.createFromParcel(parcel));
                i18++;
                i17 = i17;
            }
            String string11 = parcel.readString();
            SponsoredData cVarCreateFromParcel = SponsoredData.CREATOR.createFromParcel(parcel);
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            if (parcel.readInt() != 0) {
                d11 = d18;
                z14 = true;
            } else {
                d11 = d18;
                z14 = false;
            }
            if (parcel.readInt() != 0) {
                d12 = d11;
                z15 = true;
            } else {
                d12 = d11;
                z15 = false;
            }
            if (parcel.readInt() != 0) {
                d13 = d12;
                z16 = true;
            } else {
                d13 = d12;
                z16 = false;
            }
            if (parcel.readInt() != 0) {
                d14 = d13;
                z17 = true;
            } else {
                d14 = d13;
                z17 = false;
            }
            if (parcel.readInt() != 0) {
                d15 = d14;
                z18 = true;
            } else {
                d15 = d14;
                z18 = false;
            }
            if (parcel.readInt() != 0) {
                dValueOf = d15;
                z19 = true;
            } else {
                dValueOf = d15;
                z19 = false;
            }
            String string16 = parcel.readString();
            if (parcel.readInt() == 0) {
                str2 = string11;
                z20 = true;
                interfaceC15960a = interfaceC15960a2;
                cVar = cVarCreateFromParcel;
                arrayList = arrayList4;
                d16 = dValueOf;
            } else {
                int i19 = parcel.readInt();
                cVar = cVarCreateFromParcel;
                ?? arrayList5 = new ArrayList(i19);
                arrayList = arrayList4;
                int i20 = 0;
                while (i20 != i19) {
                    arrayList5.add(Long.valueOf(parcel.readLong()));
                    i20++;
                    i19 = i19;
                }
                z20 = true;
                interfaceC15960a = interfaceC15960a2;
                str2 = string11;
                d16 = arrayList5;
            }
            int i21 = parcel.readInt();
            NutritionLabel gVar = (NutritionLabel) (parcel.readInt() == 0 ? dValueOf : NutritionLabel.CREATOR.createFromParcel(parcel));
            boolean z32 = false;
            ArrayList arrayList6 = arrayList;
            String string17 = parcel.readString();
            if (parcel.readInt() != 0) {
                i10 = 0;
                z32 = z20;
            } else {
                i10 = 0;
            }
            if (parcel.readInt() != 0) {
                dValueOf = Double.valueOf(parcel.readDouble());
            }
            String string18 = parcel.readString();
            StockInfo oVarCreateFromParcel = StockInfo.CREATOR.createFromParcel(parcel);
            String string19 = parcel.readString();
            ?? r61 = parcel.readInt() != 0 ? 1 : i10;
            int i22 = parcel.readInt();
            ?? r62 = d16;
            ArrayList arrayList7 = new ArrayList(i22);
            int i23 = i10;
            while (i23 != i22) {
                arrayList7.add(ProductVariantGroup.CREATOR.createFromParcel(parcel));
                i23++;
                i22 = i22;
            }
            return new ProductFullDetails(string, string2, i11, z21, z22, z23, string3, string4, arrayList2, string5, z24, z25, z26, z27, z28, z29, z30, bVar, z31, interfaceC15960a, bVar3, z11, str, z12, i14, bVar4, d17, numValueOf, z13, string7, string8, string9, string10, arrayList3, arrayList6, str2, cVar, string12, string13, string14, string15, z14, z15, z16, z17, z18, z19, string16, r62, i21, gVar, string17, z32, dValueOf, string18, oVarCreateFromParcel, string19, r61, arrayList7, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ProductFullDetails[] newArray(int i10) {
            return new ProductFullDetails[i10];
        }
    }

    public ProductFullDetails() {
        this(null, null, 0, false, false, false, null, null, null, null, false, false, false, false, false, false, false, null, false, null, null, false, null, false, 0, null, 0.0d, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, false, null, 0, -1, 268435455, null);
    }

    public static /* synthetic */ ProductFullDetails b(ProductFullDetails productFullDetails, String str, String str2, int i10, boolean z10, boolean z11, boolean z12, String str3, String str4, List list, String str5, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, nk.b bVar, boolean z20, InterfaceC15960a interfaceC15960a, nk.b bVar2, boolean z21, String str6, boolean z22, int i11, nk.b bVar3, double d10, Integer num, boolean z23, String str7, String str8, String str9, String str10, List list2, List list3, String str11, SponsoredData cVar, String str12, String str13, String str14, String str15, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, String str16, List list4, int i12, NutritionLabel gVar, String str17, boolean z30, Double d11, String str18, StockInfo oVar, String str19, boolean z31, List list5, int i13, int i14, int i15, Object obj) {
        String str20 = (i14 & 1) != 0 ? productFullDetails.code : str;
        return productFullDetails.a(str20, (i14 & 2) != 0 ? productFullDetails.name : str2, (i14 & 4) != 0 ? productFullDetails.storeId : i10, (i14 & 8) != 0 ? productFullDetails.isAgeRestricted : z10, (i14 & 16) != 0 ? productFullDetails.isAlcohol : z11, (i14 & 32) != 0 ? productFullDetails.isChokingHazard : z12, (i14 & 64) != 0 ? productFullDetails.description : str3, (i14 & 128) != 0 ? productFullDetails.ean : str4, (i14 & 256) != 0 ? productFullDetails.images : list, (i14 & 512) != 0 ? productFullDetails.summary : str5, (i14 & 1024) != 0 ? productFullDetails.isAlcoholRestricted : z13, (i14 & RecyclerView.m.FLAG_MOVED) != 0 ? productFullDetails.isAvailableForPickup : z14, (i14 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? productFullDetails.isBuyable : z15, (i14 & 8192) != 0 ? productFullDetails.isDisabled : z16, (i14 & 16384) != 0 ? productFullDetails.isDisplayable : z17, (i14 & 32768) != 0 ? productFullDetails.isHomeDeliveryNotAvailable : z18, (i14 & 65536) != 0 ? productFullDetails.isPurchasable : z19, (i14 & 131072) != 0 ? productFullDetails.price : bVar, (i14 & 262144) != 0 ? productFullDetails.isPriceByWeight : z20, (i14 & 524288) != 0 ? productFullDetails.discount : interfaceC15960a, (i14 & 1048576) != 0 ? productFullDetails.discountedPrice : bVar2, (i14 & 2097152) != 0 ? productFullDetails.hasMPerksOffers : z21, (i14 & 4194304) != 0 ? productFullDetails.itemUnitOfMeasure : str6, (i14 & 8388608) != 0 ? productFullDetails.isMap : z22, (i14 & 16777216) != 0 ? productFullDetails.orderQuantityInterval : i11, (i14 & 33554432) != 0 ? productFullDetails.depositPrice : bVar3, (i14 & 67108864) != 0 ? productFullDetails.qtyIncrement : d10, (i14 & 134217728) != 0 ? productFullDetails.maxOrderQuantity : num, (i14 & 268435456) != 0 ? productFullDetails.isSale : z23, (i14 & 536870912) != 0 ? productFullDetails.priceUnit : str7, (i14 & 1073741824) != 0 ? productFullDetails.url : str8, (i14 & Integer.MIN_VALUE) != 0 ? productFullDetails.unitCode : str9, (i15 & 1) != 0 ? productFullDetails.unit : str10, (i15 & 2) != 0 ? productFullDetails.categories : list2, (i15 & 4) != 0 ? productFullDetails.classifications : list3, (i15 & 8) != 0 ? productFullDetails.countryOfOrigin : str11, (i15 & 16) != 0 ? productFullDetails.beaconInfo : cVar, (i15 & 32) != 0 ? productFullDetails.descriptiveFeatures : str12, (i15 & 64) != 0 ? productFullDetails.department : str13, (i15 & 128) != 0 ? productFullDetails.disclaimer : str14, (i15 & 256) != 0 ? productFullDetails.ingredients : str15, (i15 & 512) != 0 ? productFullDetails.isBopas : z24, (i15 & 1024) != 0 ? productFullDetails.isClickAndCollect : z25, (i15 & RecyclerView.m.FLAG_MOVED) != 0 ? productFullDetails.isEbtProduct : z26, (i15 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? productFullDetails.isMeijerBrand : z27, (i15 & 8192) != 0 ? productFullDetails.isSponsoredCriteo : z28, (i15 & 16384) != 0 ? productFullDetails.isSubscriptionAvailable : z29, (i15 & 32768) != 0 ? productFullDetails.manufacturer : str16, (i15 & 65536) != 0 ? productFullDetails.mPerksOfferIds : list4, (i15 & 131072) != 0 ? productFullDetails.numberOfReviews : i12, (i15 & 262144) != 0 ? productFullDetails.nutritionLabel : gVar, (i15 & 524288) != 0 ? productFullDetails.packageSize : str17, (i15 & 1048576) != 0 ? productFullDetails.prepareItem : z30, (i15 & 2097152) != 0 ? productFullDetails.promoId : d11, (i15 & 4194304) != 0 ? productFullDetails.promoText : str18, (i15 & 8388608) != 0 ? productFullDetails.stockInfo : oVar, (i15 & 16777216) != 0 ? productFullDetails.upcType : str19, (i15 & 33554432) != 0 ? productFullDetails.validDates : z31, (i15 & 67108864) != 0 ? productFullDetails.variantGroups : list5, (i15 & 134217728) != 0 ? productFullDetails.quantity : i13);
    }

    public final ProductFullDetails a(String code, String name, int storeId, boolean isAgeRestricted, boolean isAlcohol, boolean isChokingHazard, String description, String ean, List<Image> images, String summary, boolean isAlcoholRestricted, boolean isAvailableForPickup, boolean isBuyable, boolean isDisabled, boolean isDisplayable, boolean isHomeDeliveryNotAvailable, boolean isPurchasable, nk.b price, boolean isPriceByWeight, InterfaceC15960a discount, nk.b discountedPrice, boolean hasMPerksOffers, String itemUnitOfMeasure, boolean isMap, int orderQuantityInterval, nk.b depositPrice, double qtyIncrement, Integer maxOrderQuantity, boolean isSale, String priceUnit, String url, String unitCode, String unit, List<Category> categories, List<Classification> classifications, String countryOfOrigin, SponsoredData beaconInfo, String descriptiveFeatures, String department, String disclaimer, String ingredients, boolean isBopas, boolean isClickAndCollect, boolean isEbtProduct, boolean isMeijerBrand, boolean isSponsoredCriteo, boolean isSubscriptionAvailable, String manufacturer, List<Long> mPerksOfferIds, int numberOfReviews, NutritionLabel nutritionLabel, String packageSize, boolean prepareItem, Double promoId, String promoText, StockInfo stockInfo, String upcType, boolean validDates, List<ProductVariantGroup> variantGroups, int quantity) {
        Intrinsics.j(code, "code");
        Intrinsics.j(name, "name");
        Intrinsics.j(ean, "ean");
        Intrinsics.j(images, "images");
        Intrinsics.j(price, "price");
        Intrinsics.j(itemUnitOfMeasure, "itemUnitOfMeasure");
        Intrinsics.j(categories, "categories");
        Intrinsics.j(classifications, "classifications");
        Intrinsics.j(beaconInfo, "beaconInfo");
        Intrinsics.j(descriptiveFeatures, "descriptiveFeatures");
        Intrinsics.j(department, "department");
        Intrinsics.j(disclaimer, "disclaimer");
        Intrinsics.j(stockInfo, "stockInfo");
        Intrinsics.j(variantGroups, "variantGroups");
        return new ProductFullDetails(code, name, storeId, isAgeRestricted, isAlcohol, isChokingHazard, description, ean, images, summary, isAlcoholRestricted, isAvailableForPickup, isBuyable, isDisabled, isDisplayable, isHomeDeliveryNotAvailable, isPurchasable, price, isPriceByWeight, discount, discountedPrice, hasMPerksOffers, itemUnitOfMeasure, isMap, orderQuantityInterval, depositPrice, qtyIncrement, maxOrderQuantity, isSale, priceUnit, url, unitCode, unit, categories, classifications, countryOfOrigin, beaconInfo, descriptiveFeatures, department, disclaimer, ingredients, isBopas, isClickAndCollect, isEbtProduct, isMeijerBrand, isSponsoredCriteo, isSubscriptionAvailable, manufacturer, mPerksOfferIds, numberOfReviews, nutritionLabel, packageSize, prepareItem, promoId, promoText, stockInfo, upcType, validDates, variantGroups, quantity);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductFullDetails)) {
            return false;
        }
        ProductFullDetails productFullDetails = (ProductFullDetails) other;
        return Intrinsics.e(this.code, productFullDetails.code) && Intrinsics.e(this.name, productFullDetails.name) && this.storeId == productFullDetails.storeId && this.isAgeRestricted == productFullDetails.isAgeRestricted && this.isAlcohol == productFullDetails.isAlcohol && this.isChokingHazard == productFullDetails.isChokingHazard && Intrinsics.e(this.description, productFullDetails.description) && Intrinsics.e(this.ean, productFullDetails.ean) && Intrinsics.e(this.images, productFullDetails.images) && Intrinsics.e(this.summary, productFullDetails.summary) && this.isAlcoholRestricted == productFullDetails.isAlcoholRestricted && this.isAvailableForPickup == productFullDetails.isAvailableForPickup && this.isBuyable == productFullDetails.isBuyable && this.isDisabled == productFullDetails.isDisabled && this.isDisplayable == productFullDetails.isDisplayable && this.isHomeDeliveryNotAvailable == productFullDetails.isHomeDeliveryNotAvailable && this.isPurchasable == productFullDetails.isPurchasable && Intrinsics.e(this.price, productFullDetails.price) && this.isPriceByWeight == productFullDetails.isPriceByWeight && Intrinsics.e(this.discount, productFullDetails.discount) && Intrinsics.e(this.discountedPrice, productFullDetails.discountedPrice) && this.hasMPerksOffers == productFullDetails.hasMPerksOffers && Intrinsics.e(this.itemUnitOfMeasure, productFullDetails.itemUnitOfMeasure) && this.isMap == productFullDetails.isMap && this.orderQuantityInterval == productFullDetails.orderQuantityInterval && Intrinsics.e(this.depositPrice, productFullDetails.depositPrice) && Double.compare(this.qtyIncrement, productFullDetails.qtyIncrement) == 0 && Intrinsics.e(this.maxOrderQuantity, productFullDetails.maxOrderQuantity) && this.isSale == productFullDetails.isSale && Intrinsics.e(this.priceUnit, productFullDetails.priceUnit) && Intrinsics.e(this.url, productFullDetails.url) && Intrinsics.e(this.unitCode, productFullDetails.unitCode) && Intrinsics.e(this.unit, productFullDetails.unit) && Intrinsics.e(this.categories, productFullDetails.categories) && Intrinsics.e(this.classifications, productFullDetails.classifications) && Intrinsics.e(this.countryOfOrigin, productFullDetails.countryOfOrigin) && Intrinsics.e(this.beaconInfo, productFullDetails.beaconInfo) && Intrinsics.e(this.descriptiveFeatures, productFullDetails.descriptiveFeatures) && Intrinsics.e(this.department, productFullDetails.department) && Intrinsics.e(this.disclaimer, productFullDetails.disclaimer) && Intrinsics.e(this.ingredients, productFullDetails.ingredients) && this.isBopas == productFullDetails.isBopas && this.isClickAndCollect == productFullDetails.isClickAndCollect && this.isEbtProduct == productFullDetails.isEbtProduct && this.isMeijerBrand == productFullDetails.isMeijerBrand && this.isSponsoredCriteo == productFullDetails.isSponsoredCriteo && this.isSubscriptionAvailable == productFullDetails.isSubscriptionAvailable && Intrinsics.e(this.manufacturer, productFullDetails.manufacturer) && Intrinsics.e(this.mPerksOfferIds, productFullDetails.mPerksOfferIds) && this.numberOfReviews == productFullDetails.numberOfReviews && Intrinsics.e(this.nutritionLabel, productFullDetails.nutritionLabel) && Intrinsics.e(this.packageSize, productFullDetails.packageSize) && this.prepareItem == productFullDetails.prepareItem && Intrinsics.e(this.promoId, productFullDetails.promoId) && Intrinsics.e(this.promoText, productFullDetails.promoText) && Intrinsics.e(this.stockInfo, productFullDetails.stockInfo) && Intrinsics.e(this.upcType, productFullDetails.upcType) && this.validDates == productFullDetails.validDates && Intrinsics.e(this.variantGroups, productFullDetails.variantGroups) && this.quantity == productFullDetails.quantity;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.code);
        dest.writeString(this.name);
        dest.writeInt(this.storeId);
        dest.writeInt(this.isAgeRestricted ? 1 : 0);
        dest.writeInt(this.isAlcohol ? 1 : 0);
        dest.writeInt(this.isChokingHazard ? 1 : 0);
        dest.writeString(this.description);
        dest.writeString(this.ean);
        List<Image> list = this.images;
        dest.writeInt(list.size());
        Iterator<Image> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeString(this.summary);
        dest.writeInt(this.isAlcoholRestricted ? 1 : 0);
        dest.writeInt(this.isAvailableForPickup ? 1 : 0);
        dest.writeInt(this.isBuyable ? 1 : 0);
        dest.writeInt(this.isDisabled ? 1 : 0);
        dest.writeInt(this.isDisplayable ? 1 : 0);
        dest.writeInt(this.isHomeDeliveryNotAvailable ? 1 : 0);
        dest.writeInt(this.isPurchasable ? 1 : 0);
        dest.writeParcelable(this.price, flags);
        dest.writeInt(this.isPriceByWeight ? 1 : 0);
        dest.writeParcelable(this.discount, flags);
        dest.writeParcelable(this.discountedPrice, flags);
        dest.writeInt(this.hasMPerksOffers ? 1 : 0);
        dest.writeString(this.itemUnitOfMeasure);
        dest.writeInt(this.isMap ? 1 : 0);
        dest.writeInt(this.orderQuantityInterval);
        dest.writeParcelable(this.depositPrice, flags);
        dest.writeDouble(this.qtyIncrement);
        Integer num = this.maxOrderQuantity;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeInt(this.isSale ? 1 : 0);
        dest.writeString(this.priceUnit);
        dest.writeString(this.url);
        dest.writeString(this.unitCode);
        dest.writeString(this.unit);
        List<Category> list2 = this.categories;
        dest.writeInt(list2.size());
        Iterator<Category> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(dest, flags);
        }
        List<Classification> list3 = this.classifications;
        dest.writeInt(list3.size());
        Iterator<Classification> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(dest, flags);
        }
        dest.writeString(this.countryOfOrigin);
        this.beaconInfo.writeToParcel(dest, flags);
        dest.writeString(this.descriptiveFeatures);
        dest.writeString(this.department);
        dest.writeString(this.disclaimer);
        dest.writeString(this.ingredients);
        dest.writeInt(this.isBopas ? 1 : 0);
        dest.writeInt(this.isClickAndCollect ? 1 : 0);
        dest.writeInt(this.isEbtProduct ? 1 : 0);
        dest.writeInt(this.isMeijerBrand ? 1 : 0);
        dest.writeInt(this.isSponsoredCriteo ? 1 : 0);
        dest.writeInt(this.isSubscriptionAvailable ? 1 : 0);
        dest.writeString(this.manufacturer);
        List<Long> list4 = this.mPerksOfferIds;
        if (list4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list4.size());
            Iterator<Long> it4 = list4.iterator();
            while (it4.hasNext()) {
                dest.writeLong(it4.next().longValue());
            }
        }
        dest.writeInt(this.numberOfReviews);
        NutritionLabel gVar = this.nutritionLabel;
        if (gVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            gVar.writeToParcel(dest, flags);
        }
        dest.writeString(this.packageSize);
        dest.writeInt(this.prepareItem ? 1 : 0);
        Double d10 = this.promoId;
        if (d10 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d10.doubleValue());
        }
        dest.writeString(this.promoText);
        this.stockInfo.writeToParcel(dest, flags);
        dest.writeString(this.upcType);
        dest.writeInt(this.validDates ? 1 : 0);
        List<ProductVariantGroup> list5 = this.variantGroups;
        dest.writeInt(list5.size());
        Iterator<ProductVariantGroup> it5 = list5.iterator();
        while (it5.hasNext()) {
            it5.next().writeToParcel(dest, flags);
        }
        dest.writeInt(this.quantity);
    }

    public ProductFullDetails(String code, String name, int i10, boolean z10, boolean z11, boolean z12, String str, String ean, List<Image> images, String str2, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, nk.b price, boolean z20, InterfaceC15960a interfaceC15960a, nk.b bVar, boolean z21, String itemUnitOfMeasure, boolean z22, int i11, nk.b bVar2, double d10, Integer num, boolean z23, String str3, String str4, String str5, String str6, List<Category> categories, List<Classification> classifications, String str7, SponsoredData beaconInfo, String descriptiveFeatures, String department, String disclaimer, String str8, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, String str9, List<Long> list, int i12, NutritionLabel gVar, String str10, boolean z30, Double d11, String str11, StockInfo stockInfo, String str12, boolean z31, List<ProductVariantGroup> variantGroups, int i13) {
        Intrinsics.j(code, "code");
        Intrinsics.j(name, "name");
        Intrinsics.j(ean, "ean");
        Intrinsics.j(images, "images");
        Intrinsics.j(price, "price");
        Intrinsics.j(itemUnitOfMeasure, "itemUnitOfMeasure");
        Intrinsics.j(categories, "categories");
        Intrinsics.j(classifications, "classifications");
        Intrinsics.j(beaconInfo, "beaconInfo");
        Intrinsics.j(descriptiveFeatures, "descriptiveFeatures");
        Intrinsics.j(department, "department");
        Intrinsics.j(disclaimer, "disclaimer");
        Intrinsics.j(stockInfo, "stockInfo");
        Intrinsics.j(variantGroups, "variantGroups");
        this.code = code;
        this.name = name;
        this.storeId = i10;
        this.isAgeRestricted = z10;
        this.isAlcohol = z11;
        this.isChokingHazard = z12;
        this.description = str;
        this.ean = ean;
        this.images = images;
        this.summary = str2;
        this.isAlcoholRestricted = z13;
        this.isAvailableForPickup = z14;
        this.isBuyable = z15;
        this.isDisabled = z16;
        this.isDisplayable = z17;
        this.isHomeDeliveryNotAvailable = z18;
        this.isPurchasable = z19;
        this.price = price;
        this.isPriceByWeight = z20;
        this.discount = interfaceC15960a;
        this.discountedPrice = bVar;
        this.hasMPerksOffers = z21;
        this.itemUnitOfMeasure = itemUnitOfMeasure;
        this.isMap = z22;
        this.orderQuantityInterval = i11;
        this.depositPrice = bVar2;
        this.qtyIncrement = d10;
        this.maxOrderQuantity = num;
        this.isSale = z23;
        this.priceUnit = str3;
        this.url = str4;
        this.unitCode = str5;
        this.unit = str6;
        this.categories = categories;
        this.classifications = classifications;
        this.countryOfOrigin = str7;
        this.beaconInfo = beaconInfo;
        this.descriptiveFeatures = descriptiveFeatures;
        this.department = department;
        this.disclaimer = disclaimer;
        this.ingredients = str8;
        this.isBopas = z24;
        this.isClickAndCollect = z25;
        this.isEbtProduct = z26;
        this.isMeijerBrand = z27;
        this.isSponsoredCriteo = z28;
        this.isSubscriptionAvailable = z29;
        this.manufacturer = str9;
        this.mPerksOfferIds = list;
        this.numberOfReviews = i12;
        this.nutritionLabel = gVar;
        this.packageSize = str10;
        this.prepareItem = z30;
        this.promoId = d11;
        this.promoText = str11;
        this.stockInfo = stockInfo;
        this.upcType = str12;
        this.validDates = z31;
        this.variantGroups = variantGroups;
        this.quantity = i13;
    }

    public final List<ProductVariantGroup> A() {
        return this.variantGroups;
    }

    /* renamed from: B, reason: from getter */
    public boolean getIsAgeRestricted() {
        return this.isAgeRestricted;
    }

    @Override // nk.e
    /* renamed from: B1, reason: from getter */
    public boolean getIsAlcohol() {
        return this.isAlcohol;
    }

    /* renamed from: C, reason: from getter */
    public final boolean getIsBopas() {
        return this.isBopas;
    }

    /* renamed from: E, reason: from getter */
    public boolean getIsChokingHazard() {
        return this.isChokingHazard;
    }

    public final boolean F() {
        return !StringsKt.s0(this.beaconInfo.getUpc());
    }

    /* renamed from: G, reason: from getter */
    public final boolean getIsEbtProduct() {
        return this.isEbtProduct;
    }

    @Override // nk.h
    /* renamed from: H0, reason: from getter */
    public Integer getMaxOrderQuantity() {
        return this.maxOrderQuantity;
    }

    /* renamed from: I, reason: from getter */
    public final boolean getIsSponsoredCriteo() {
        return this.isSponsoredCriteo;
    }

    /* renamed from: J, reason: from getter */
    public final boolean getIsSubscriptionAvailable() {
        return this.isSubscriptionAvailable;
    }

    public final void L(int i10) {
        this.quantity = i10;
    }

    @Override // nk.h
    /* renamed from: P3, reason: from getter */
    public boolean getIsMap() {
        return this.isMap;
    }

    @Override // nk.h
    /* renamed from: Q0, reason: from getter */
    public nk.b getDepositPrice() {
        return this.depositPrice;
    }

    @Override // nk.e
    public nk.n Q1() {
        return this.stockInfo.getStockLevel();
    }

    @Override // nk.e
    /* renamed from: R1, reason: from getter */
    public boolean getIsBuyable() {
        return this.isBuyable;
    }

    /* renamed from: c, reason: from getter */
    public final SponsoredData getBeaconInfo() {
        return this.beaconInfo;
    }

    public final List<Category> d() {
        return this.categories;
    }

    @Override // nk.h
    /* renamed from: d3, reason: from getter */
    public boolean getIsSale() {
        return this.isSale;
    }

    /* renamed from: e, reason: from getter */
    public final String getDepartment() {
        return this.department;
    }

    @Override // nk.h
    /* renamed from: e0, reason: from getter */
    public InterfaceC15960a getDiscount() {
        return this.discount;
    }

    /* renamed from: f, reason: from getter */
    public String getDescription() {
        return this.description;
    }

    @Override // nk.h
    /* renamed from: f1, reason: from getter */
    public String getPriceUnit() {
        return this.priceUnit;
    }

    /* renamed from: g, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    @Override // nk.f
    public String getCode() {
        return this.code;
    }

    @Override // nk.c
    public String getName() {
        return this.name;
    }

    /* renamed from: h, reason: from getter */
    public String getEan() {
        return this.ean;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.code.hashCode() * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.storeId)) * 31) + Boolean.hashCode(this.isAgeRestricted)) * 31) + Boolean.hashCode(this.isAlcohol)) * 31) + Boolean.hashCode(this.isChokingHazard)) * 31;
        String str = this.description;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.ean.hashCode()) * 31) + this.images.hashCode()) * 31;
        String str2 = this.summary;
        int iHashCode3 = (((((((((((((((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isAlcoholRestricted)) * 31) + Boolean.hashCode(this.isAvailableForPickup)) * 31) + Boolean.hashCode(this.isBuyable)) * 31) + Boolean.hashCode(this.isDisabled)) * 31) + Boolean.hashCode(this.isDisplayable)) * 31) + Boolean.hashCode(this.isHomeDeliveryNotAvailable)) * 31) + Boolean.hashCode(this.isPurchasable)) * 31) + this.price.hashCode()) * 31) + Boolean.hashCode(this.isPriceByWeight)) * 31;
        InterfaceC15960a interfaceC15960a = this.discount;
        int iHashCode4 = (iHashCode3 + (interfaceC15960a == null ? 0 : interfaceC15960a.hashCode())) * 31;
        nk.b bVar = this.discountedPrice;
        int iHashCode5 = (((((((((iHashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31) + Boolean.hashCode(this.hasMPerksOffers)) * 31) + this.itemUnitOfMeasure.hashCode()) * 31) + Boolean.hashCode(this.isMap)) * 31) + Integer.hashCode(this.orderQuantityInterval)) * 31;
        nk.b bVar2 = this.depositPrice;
        int iHashCode6 = (((iHashCode5 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31) + Double.hashCode(this.qtyIncrement)) * 31;
        Integer num = this.maxOrderQuantity;
        int iHashCode7 = (((iHashCode6 + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.isSale)) * 31;
        String str3 = this.priceUnit;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.url;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.unitCode;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.unit;
        int iHashCode11 = (((((iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.categories.hashCode()) * 31) + this.classifications.hashCode()) * 31;
        String str7 = this.countryOfOrigin;
        int iHashCode12 = (((((((((iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.beaconInfo.hashCode()) * 31) + this.descriptiveFeatures.hashCode()) * 31) + this.department.hashCode()) * 31) + this.disclaimer.hashCode()) * 31;
        String str8 = this.ingredients;
        int iHashCode13 = (((((((((((((iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31) + Boolean.hashCode(this.isBopas)) * 31) + Boolean.hashCode(this.isClickAndCollect)) * 31) + Boolean.hashCode(this.isEbtProduct)) * 31) + Boolean.hashCode(this.isMeijerBrand)) * 31) + Boolean.hashCode(this.isSponsoredCriteo)) * 31) + Boolean.hashCode(this.isSubscriptionAvailable)) * 31;
        String str9 = this.manufacturer;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<Long> list = this.mPerksOfferIds;
        int iHashCode15 = (((iHashCode14 + (list == null ? 0 : list.hashCode())) * 31) + Integer.hashCode(this.numberOfReviews)) * 31;
        NutritionLabel gVar = this.nutritionLabel;
        int iHashCode16 = (iHashCode15 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        String str10 = this.packageSize;
        int iHashCode17 = (((iHashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31) + Boolean.hashCode(this.prepareItem)) * 31;
        Double d10 = this.promoId;
        int iHashCode18 = (iHashCode17 + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str11 = this.promoText;
        int iHashCode19 = (((iHashCode18 + (str11 == null ? 0 : str11.hashCode())) * 31) + this.stockInfo.hashCode()) * 31;
        String str12 = this.upcType;
        return ((((((iHashCode19 + (str12 != null ? str12.hashCode() : 0)) * 31) + Boolean.hashCode(this.validDates)) * 31) + this.variantGroups.hashCode()) * 31) + Integer.hashCode(this.quantity);
    }

    /* renamed from: i, reason: from getter */
    public boolean getHasMPerksOffers() {
        return this.hasMPerksOffers;
    }

    public List<Image> j() {
        return this.images;
    }

    /* renamed from: k, reason: from getter */
    public final String getIngredients() {
        return this.ingredients;
    }

    @Override // nk.h
    /* renamed from: k0, reason: from getter */
    public nk.b getDiscountedPrice() {
        return this.discountedPrice;
    }

    @Override // nk.h
    /* renamed from: l, reason: from getter */
    public nk.b getPrice() {
        return this.price;
    }

    @Override // nk.e
    /* renamed from: l2, reason: from getter */
    public boolean getIsDisplayable() {
        return this.isDisplayable;
    }

    /* renamed from: n, reason: from getter */
    public String getItemUnitOfMeasure() {
        return this.itemUnitOfMeasure;
    }

    @Override // nk.e
    /* renamed from: n1, reason: from getter */
    public boolean getIsDisabled() {
        return this.isDisabled;
    }

    public final List<Long> o() {
        return this.mPerksOfferIds;
    }

    @Override // nk.h
    /* renamed from: p, reason: from getter */
    public String getUnit() {
        return this.unit;
    }

    /* renamed from: q, reason: from getter */
    public final NutritionLabel getNutritionLabel() {
        return this.nutritionLabel;
    }

    @Override // nk.e
    /* renamed from: q2, reason: from getter */
    public boolean getIsHomeDeliveryNotAvailable() {
        return this.isHomeDeliveryNotAvailable;
    }

    /* renamed from: r, reason: from getter */
    public final Double getPromoId() {
        return this.promoId;
    }

    @Override // nk.h
    /* renamed from: r2, reason: from getter */
    public double getQtyIncrement() {
        return this.qtyIncrement;
    }

    /* renamed from: s, reason: from getter */
    public final String getPromoText() {
        return this.promoText;
    }

    /* renamed from: t, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    public String toString() {
        return "ProductFullDetails(code=" + this.code + ", name=" + this.name + ", storeId=" + this.storeId + ", isAgeRestricted=" + this.isAgeRestricted + ", isAlcohol=" + this.isAlcohol + ", isChokingHazard=" + this.isChokingHazard + ", description=" + this.description + ", ean=" + this.ean + ", images=" + this.images + ", summary=" + this.summary + ", isAlcoholRestricted=" + this.isAlcoholRestricted + ", isAvailableForPickup=" + this.isAvailableForPickup + ", isBuyable=" + this.isBuyable + ", isDisabled=" + this.isDisabled + ", isDisplayable=" + this.isDisplayable + ", isHomeDeliveryNotAvailable=" + this.isHomeDeliveryNotAvailable + ", isPurchasable=" + this.isPurchasable + ", price=" + this.price + ", isPriceByWeight=" + this.isPriceByWeight + ", discount=" + this.discount + ", discountedPrice=" + this.discountedPrice + ", hasMPerksOffers=" + this.hasMPerksOffers + ", itemUnitOfMeasure=" + this.itemUnitOfMeasure + ", isMap=" + this.isMap + ", orderQuantityInterval=" + this.orderQuantityInterval + ", depositPrice=" + this.depositPrice + ", qtyIncrement=" + this.qtyIncrement + ", maxOrderQuantity=" + this.maxOrderQuantity + ", isSale=" + this.isSale + ", priceUnit=" + this.priceUnit + ", url=" + this.url + ", unitCode=" + this.unitCode + ", unit=" + this.unit + ", categories=" + this.categories + ", classifications=" + this.classifications + ", countryOfOrigin=" + this.countryOfOrigin + ", beaconInfo=" + this.beaconInfo + ", descriptiveFeatures=" + this.descriptiveFeatures + ", department=" + this.department + ", disclaimer=" + this.disclaimer + ", ingredients=" + this.ingredients + ", isBopas=" + this.isBopas + ", isClickAndCollect=" + this.isClickAndCollect + ", isEbtProduct=" + this.isEbtProduct + ", isMeijerBrand=" + this.isMeijerBrand + ", isSponsoredCriteo=" + this.isSponsoredCriteo + ", isSubscriptionAvailable=" + this.isSubscriptionAvailable + ", manufacturer=" + this.manufacturer + ", mPerksOfferIds=" + this.mPerksOfferIds + ", numberOfReviews=" + this.numberOfReviews + ", nutritionLabel=" + this.nutritionLabel + ", packageSize=" + this.packageSize + ", prepareItem=" + this.prepareItem + ", promoId=" + this.promoId + ", promoText=" + this.promoText + ", stockInfo=" + this.stockInfo + ", upcType=" + this.upcType + ", validDates=" + this.validDates + ", variantGroups=" + this.variantGroups + ", quantity=" + this.quantity + ')';
    }

    @Override // Tq.h
    /* renamed from: u, reason: from getter */
    public int getStoreId() {
        return this.storeId;
    }

    /* renamed from: v, reason: from getter */
    public final StockInfo getStockInfo() {
        return this.stockInfo;
    }

    /* renamed from: w, reason: from getter */
    public String getSummary() {
        return this.summary;
    }

    /* renamed from: x, reason: from getter */
    public String getUnitCode() {
        return this.unitCode;
    }

    /* renamed from: y, reason: from getter */
    public final String getUpcType() {
        return this.upcType;
    }

    @Override // nk.e
    /* renamed from: y3, reason: from getter */
    public boolean getIsAvailableForPickup() {
        return this.isAvailableForPickup;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ProductFullDetails(String str, String str2, int i10, boolean z10, boolean z11, boolean z12, String str3, String str4, List list, String str5, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, nk.b bVar, boolean z20, InterfaceC15960a interfaceC15960a, nk.b bVar2, boolean z21, String str6, boolean z22, int i11, nk.b bVar3, double d10, Integer num, boolean z23, String str7, String str8, String str9, String str10, List list2, List list3, String str11, SponsoredData cVar, String str12, String str13, String str14, String str15, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, String str16, List list4, int i12, NutritionLabel gVar, String str17, boolean z30, Double d11, String str18, StockInfo oVar, String str19, boolean z31, List list5, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        String str20 = (i14 & 1) != 0 ? "" : str;
        String str21 = (i14 & 2) != 0 ? "" : str2;
        int i16 = (i14 & 4) != 0 ? 0 : i10;
        boolean z32 = (i14 & 8) != 0 ? false : z10;
        boolean z33 = (i14 & 16) != 0 ? false : z11;
        this(str20, str21, i16, z32, z33, (i14 & 32) != 0 ? false : z12, (i14 & 64) != 0 ? null : str3, (i14 & 128) != 0 ? "" : str4, (i14 & 256) != 0 ? CollectionsKt.m() : list, (i14 & 512) != 0 ? "" : str5, (i14 & 1024) != 0 ? z33 : z13, (i14 & RecyclerView.m.FLAG_MOVED) != 0 ? false : z14, (i14 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? true : z15, (i14 & 8192) != 0 ? false : z16, (i14 & 16384) == 0 ? z17 : true, (i14 & 32768) != 0 ? false : z18, (i14 & 65536) != 0 ? false : z19, (i14 & 131072) != 0 ? l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar, (i14 & 262144) != 0 ? false : z20, (i14 & 524288) != 0 ? null : interfaceC15960a, (i14 & 1048576) != 0 ? null : bVar2, (i14 & 2097152) != 0 ? false : z21, (i14 & 4194304) != 0 ? "Each" : str6, (i14 & 8388608) != 0 ? false : z22, (i14 & 16777216) != 0 ? 0 : i11, (i14 & 33554432) != 0 ? null : bVar3, (i14 & 67108864) != 0 ? 0.0d : d10, (i14 & 134217728) != 0 ? null : num, (i14 & 268435456) != 0 ? false : z23, (i14 & 536870912) != 0 ? null : str7, (i14 & 1073741824) != 0 ? "" : str8, (i14 & Integer.MIN_VALUE) != 0 ? "" : str9, (i15 & 1) != 0 ? "" : str10, (i15 & 2) != 0 ? CollectionsKt.m() : list2, (i15 & 4) != 0 ? CollectionsKt.m() : list3, (i15 & 8) != 0 ? "" : str11, (i15 & 16) != 0 ? new SponsoredData(null, null, null, null, null, null, null, null, l3.f93323c, null) : cVar, (i15 & 32) != 0 ? "" : str12, (i15 & 64) != 0 ? "" : str13, (i15 & 128) != 0 ? "" : str14, (i15 & 256) != 0 ? "" : str15, (i15 & 512) != 0 ? false : z24, (i15 & 1024) != 0 ? false : z25, (i15 & RecyclerView.m.FLAG_MOVED) != 0 ? false : z26, (i15 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z27, (i15 & 8192) != 0 ? false : z28, (i15 & 16384) != 0 ? false : z29, (i15 & 32768) != 0 ? null : str16, (i15 & 65536) != 0 ? null : list4, (i15 & 131072) != 0 ? 0 : i12, (i15 & 262144) != 0 ? null : gVar, (i15 & 524288) != 0 ? null : str17, (i15 & 1048576) != 0 ? false : z30, (i15 & 2097152) != 0 ? null : d11, (i15 & 4194304) != 0 ? null : str18, (i15 & 8388608) != 0 ? new StockInfo(null, 0, null, null, null, false, 63, null) : oVar, (i15 & 16777216) == 0 ? str19 : "", (i15 & 33554432) != 0 ? false : z31, (i15 & 67108864) != 0 ? CollectionsKt.m() : list5, (i15 & 134217728) != 0 ? 0 : i13);
    }
}
