package androidx.compose.runtime;

import androidx.compose.runtime.Composer;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\bY\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0000\u0018\u0000 \u0085\u00022\u00020\u0001:\u0002»\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\"\u0010\"\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010!\u001a\u00020 H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b$\u0010\u001aJ\u000f\u0010%\u001a\u00020\u0015H\u0002¢\u0006\u0004\b%\u0010\u001dJ\u000f\u0010&\u001a\u00020\tH\u0002¢\u0006\u0004\b&\u0010'J'\u0010*\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tH\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\tH\u0002¢\u0006\u0004\b-\u0010\u001fJ\u001f\u0010.\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0015H\u0002¢\u0006\u0004\b0\u0010\u001dJ\u0017\u00102\u001a\u00020\u00152\u0006\u00101\u001a\u00020\tH\u0002¢\u0006\u0004\b2\u0010\u001fJ\u001f\u00103\u001a\u00020\u00152\u0006\u00101\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b3\u0010/J\u001f\u00106\u001a\u00020\u00122\u0006\u00104\u001a\u00020\t2\u0006\u00105\u001a\u00020\tH\u0002¢\u0006\u0004\b6\u00107J\u0019\u00108\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b8\u00109J'\u0010:\u001a\u00020\u00152\u0006\u00104\u001a\u00020\t2\u0006\u00105\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b:\u0010+J!\u0010;\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b;\u0010<J\u001f\u0010?\u001a\u00020\u00152\u0006\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\tH\u0002¢\u0006\u0004\b?\u0010/JG\u0010E\u001a\u00020\u00122\u0006\u0010@\u001a\u00020\t2\u0006\u00101\u001a\u00020\t2&\u0010D\u001a\"\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\r\u0018\u00010Aj\u0010\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\r\u0018\u0001`CH\u0002¢\u0006\u0004\bE\u0010FJ'\u0010I\u001a\u00020\u00152\u0006\u0010G\u001a\u00020\t2\u0006\u0010H\u001a\u00020\t2\u0006\u00101\u001a\u00020\tH\u0002¢\u0006\u0004\bI\u0010+J\u0017\u0010J\u001a\u00020\t2\u0006\u0010,\u001a\u00020\tH\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020\t2\u0006\u0010L\u001a\u00020\tH\u0002¢\u0006\u0004\bM\u0010KJ\u001b\u0010O\u001a\u00020\t*\u00020N2\u0006\u0010,\u001a\u00020\tH\u0002¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020\t2\u0006\u0010,\u001a\u00020\tH\u0002¢\u0006\u0004\bQ\u0010KJ\u001b\u0010S\u001a\u00020\t*\u00020N2\u0006\u0010R\u001a\u00020\tH\u0002¢\u0006\u0004\bS\u0010PJ\u001b\u0010T\u001a\u00020\t*\u00020N2\u0006\u0010R\u001a\u00020\tH\u0002¢\u0006\u0004\bT\u0010PJ#\u0010U\u001a\u00020\u0015*\u00020N2\u0006\u0010R\u001a\u00020\t2\u0006\u0010L\u001a\u00020\tH\u0002¢\u0006\u0004\bU\u0010VJ\u001b\u0010W\u001a\u00020\t*\u00020N2\u0006\u0010R\u001a\u00020\tH\u0002¢\u0006\u0004\bW\u0010PJ\u001b\u0010X\u001a\u00020\t*\u00020N2\u0006\u0010R\u001a\u00020\tH\u0002¢\u0006\u0004\bX\u0010PJ/\u0010[\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2\u0006\u0010@\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\t2\u0006\u0010Z\u001a\u00020\tH\u0002¢\u0006\u0004\b[\u0010\\J'\u0010^\u001a\u00020\t2\u0006\u0010]\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\t2\u0006\u0010Z\u001a\u00020\tH\u0002¢\u0006\u0004\b^\u0010_J\u001f\u0010`\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2\u0006\u0010@\u001a\u00020\tH\u0002¢\u0006\u0004\b`\u0010aJ\u0017\u0010b\u001a\u00020\t2\u0006\u0010,\u001a\u00020\tH\u0002¢\u0006\u0004\bb\u0010KJ\u0015\u0010c\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\t¢\u0006\u0004\bc\u0010\u001aJ\u0015\u0010d\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t¢\u0006\u0004\bd\u0010KJ\u0015\u0010e\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t¢\u0006\u0004\be\u0010KJ\u0017\u0010f\u001a\u0004\u0018\u00010\u00012\u0006\u0010,\u001a\u00020\t¢\u0006\u0004\bf\u0010gJ\u0015\u0010h\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t¢\u0006\u0004\bh\u0010KJ\u0017\u0010i\u001a\u0004\u0018\u00010\u00012\u0006\u0010,\u001a\u00020\t¢\u0006\u0004\bi\u0010gJ\u0015\u0010j\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\t¢\u0006\u0004\bj\u0010\u001aJ\u0015\u0010k\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\t¢\u0006\u0004\bk\u0010\u001aJ\u001d\u0010l\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\bl\u00107J\u0017\u0010m\u001a\u0004\u0018\u00010\u00012\u0006\u0010,\u001a\u00020\t¢\u0006\u0004\bm\u0010gJ\u0017\u0010n\u001a\u0004\u0018\u00010\u00012\u0006\u0010]\u001a\u00020B¢\u0006\u0004\bn\u0010oJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t¢\u0006\u0004\b\n\u0010KJ\u0015\u0010q\u001a\u00020\u00152\u0006\u0010p\u001a\u00020\u0012¢\u0006\u0004\bq\u0010rJ\r\u0010s\u001a\u00020\u0015¢\u0006\u0004\bs\u0010\u001dJ\u0019\u0010t\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bt\u0010\bJ\u001f\u0010u\u001a\u00020\u00152\u0006\u0010]\u001a\u00020B2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bu\u0010vJ\u0015\u0010x\u001a\u00020\u00152\u0006\u0010w\u001a\u00020\t¢\u0006\u0004\bx\u0010\u001fJ\u0017\u0010y\u001a\u00020\u00152\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\by\u0010zJ\r\u0010{\u001a\u00020\u0015¢\u0006\u0004\b{\u0010\u001dJ\u0015\u0010|\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b|\u0010}J\u001d\u0010~\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u000b¢\u0006\u0004\b~\u0010\u007fJ\u000f\u0010\u0080\u0001\u001a\u00020\u0015¢\u0006\u0005\b\u0080\u0001\u0010\u001dJ\u0019\u0010\u0081\u0001\u001a\u00020\u00152\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0005\b\u0081\u0001\u0010zJ!\u0010\u0082\u0001\u001a\u00020\u00152\u0006\u0010]\u001a\u00020B2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0005\b\u0082\u0001\u0010vJ\u0019\u0010\u0083\u0001\u001a\u00020\u00152\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0005\b\u0083\u0001\u0010zJ\u001f\u0010\u0084\u0001\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t¢\u0006\u0005\b\u0084\u0001\u0010aJ,\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001a\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00012\u0007\u0010\u0087\u0001\u001a\u00020\t¢\u0006\u0005\b\u0088\u0001\u0010gJ\u0012\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0001¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\"\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010]\u001a\u00020B2\u0006\u0010,\u001a\u00020\t¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J#\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00012\u0007\u0010\u008d\u0001\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001a\u0010\u0090\u0001\u001a\u00020\t2\u0007\u0010\u008d\u0001\u001a\u00020\tH\u0000¢\u0006\u0005\b\u0090\u0001\u0010KJ\u001a\u0010\u0091\u0001\u001a\u00020\t2\u0007\u0010\u008d\u0001\u001a\u00020\tH\u0000¢\u0006\u0005\b\u0091\u0001\u0010KJ\u001a\u0010\u0092\u0001\u001a\u00020\t2\u0007\u0010\u008d\u0001\u001a\u00020\tH\u0000¢\u0006\u0005\b\u0092\u0001\u0010KJ\u0018\u0010\u0094\u0001\u001a\u00020\u00152\u0007\u0010\u0093\u0001\u001a\u00020\t¢\u0006\u0005\b\u0094\u0001\u0010\u001fJ\u000f\u0010\u0095\u0001\u001a\u00020\u0015¢\u0006\u0005\b\u0095\u0001\u0010\u001dJ\u000f\u0010\u0096\u0001\u001a\u00020\u0015¢\u0006\u0005\b\u0096\u0001\u0010\u001dJ\u000f\u0010\u0097\u0001\u001a\u00020\u0015¢\u0006\u0005\b\u0097\u0001\u0010\u001dJ\u000f\u0010\u0098\u0001\u001a\u00020\u0015¢\u0006\u0005\b\u0098\u0001\u0010\u001dJ\"\u0010\u009a\u0001\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\t2\t\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0001¢\u0006\u0005\b\u009a\u0001\u0010<J!\u0010\u009b\u0001\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001¢\u0006\u0005\b\u009b\u0001\u0010<J,\u0010\u009c\u0001\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u000f\u0010\u009e\u0001\u001a\u00020\t¢\u0006\u0005\b\u009e\u0001\u0010'J\u0017\u0010\u009f\u0001\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\t¢\u0006\u0005\b\u009f\u0001\u0010\u001fJ\u0018\u0010 \u0001\u001a\u00020\u00152\u0006\u0010]\u001a\u00020B¢\u0006\u0006\b \u0001\u0010¡\u0001J\u000f\u0010¢\u0001\u001a\u00020\t¢\u0006\u0005\b¢\u0001\u0010'J\u0010\u0010£\u0001\u001a\u00020\u0012¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u0018\u0010¦\u0001\u001a\u00020\u00152\u0007\u0010¥\u0001\u001a\u00020\t¢\u0006\u0005\b¦\u0001\u0010\u001fJ1\u0010©\u0001\u001a\t\u0012\u0004\u0012\u00020B0¨\u00012\u0006\u0010]\u001a\u00020B2\u0007\u0010¥\u0001\u001a\u00020\t2\u0007\u0010§\u0001\u001a\u00020\u0000¢\u0006\u0006\b©\u0001\u0010ª\u0001J2\u0010¬\u0001\u001a\t\u0012\u0004\u0012\u00020B0¨\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\t2\t\b\u0002\u0010«\u0001\u001a\u00020\u0012¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J0\u0010®\u0001\u001a\t\u0012\u0004\u0012\u00020B0¨\u00012\u0007\u0010¥\u0001\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\t¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u001a\u0010°\u0001\u001a\u00020B2\b\b\u0002\u0010,\u001a\u00020\t¢\u0006\u0006\b°\u0001\u0010±\u0001J\u0019\u0010²\u0001\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\t¢\u0006\u0005\b²\u0001\u0010\u001fJ\u0018\u0010³\u0001\u001a\u00020\t2\u0006\u0010]\u001a\u00020B¢\u0006\u0006\b³\u0001\u0010´\u0001J\u0012\u0010µ\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\u001c\u0010·\u0001\u001a\u0004\u0018\u00010B2\u0006\u0010\u0018\u001a\u00020\tH\u0000¢\u0006\u0006\b·\u0001\u0010±\u0001R\u001d\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0003\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001R\u0019\u0010½\u0001\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R\"\u0010Á\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010¾\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R+\u0010Æ\u0001\u001a\u0014\u0012\u0004\u0012\u00020B0Â\u0001j\t\u0012\u0004\u0012\u00020B`Ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R8\u0010D\u001a\"\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\r\u0018\u00010Aj\u0010\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\r\u0018\u0001`C8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001R#\u0010Í\u0001\u001a\f\u0012\u0005\u0012\u00030Ê\u0001\u0018\u00010É\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R\u0018\u0010Î\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÎ\u0001\u0010$R\u0018\u0010Ð\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÏ\u0001\u0010$R\u0018\u0010Ò\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÑ\u0001\u0010$R\u0018\u0010Ô\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÓ\u0001\u0010$R\u0018\u0010Ö\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÕ\u0001\u0010$R\u0018\u0010Ø\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b×\u0001\u0010$R\u0018\u0010Ú\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÙ\u0001\u0010$R\u0018\u0010Ü\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÛ\u0001\u0010$R\u0018\u0010Þ\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÝ\u0001\u0010$R\u0018\u0010â\u0001\u001a\u00030ß\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R\u0018\u0010ä\u0001\u001a\u00030ß\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bã\u0001\u0010á\u0001R\u0018\u0010æ\u0001\u001a\u00030ß\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bå\u0001\u0010á\u0001R+\u0010é\u0001\u001a\u0014\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010ç\u0001\u0018\u00010É\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bè\u0001\u0010Ì\u0001R(\u0010ë\u0001\u001a\u00020\t2\u0007\u0010ê\u0001\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\bë\u0001\u0010$\u001a\u0005\bì\u0001\u0010'R(\u0010ï\u0001\u001a\u00020\t2\u0007\u0010ê\u0001\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\bí\u0001\u0010$\u001a\u0005\bî\u0001\u0010'R'\u0010\n\u001a\u00020\t2\u0007\u0010ê\u0001\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\bð\u0001\u0010$\u001a\u0005\bñ\u0001\u0010'R*\u0010ô\u0001\u001a\u00020\u00122\u0007\u0010ê\u0001\u001a\u00020\u00128\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bò\u0001\u0010ó\u0001\u001a\u0006\bó\u0001\u0010¤\u0001R!\u0010÷\u0001\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\bõ\u0001\u0010ö\u0001R\u0016\u0010ù\u0001\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bø\u0001\u0010'R\u0015\u0010Z\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bú\u0001\u0010'R\u0014\u0010ü\u0001\u001a\u00020\u00128F¢\u0006\b\u001a\u0006\bû\u0001\u0010¤\u0001R\u0013\u0010þ\u0001\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\bý\u0001\u0010'R\u0013\u0010\u0013\u001a\u00020\u00128F¢\u0006\b\u001a\u0006\bÿ\u0001\u0010¤\u0001R\u0014\u0010\u0081\u0002\u001a\u00020\u00128F¢\u0006\b\u001a\u0006\b\u0080\u0002\u0010¤\u0001R\u0014\u0010\u0083\u0002\u001a\u00020\u00128F¢\u0006\b\u001a\u0006\b\u0082\u0002\u0010¤\u0001R\u0015\u00101\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0002\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0086\u0002"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "", "Landroidx/compose/runtime/SlotTable;", "table", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "value", "J0", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "parent", "", "sourceInformation", "Landroidx/compose/runtime/GroupSourceInformation;", "l0", "(ILjava/lang/String;)Landroidx/compose/runtime/GroupSourceInformation;", "key", "objectKey", "", "isNode", "aux", "", "k1", "(ILjava/lang/Object;ZLjava/lang/Object;)V", "group", "N", "(I)Z", "M", "K0", "()V", "r1", "(I)V", "Landroidx/compose/runtime/C0;", "set", "s1", "(ILZ/J;)V", "I", "U0", "T0", "()I", "endGroup", "firstChild", "X", "(III)V", "index", "z0", "B0", "(II)V", "K", "size", "p0", "q0", "start", "len", "Q0", "(II)Z", "sourceInformationOf", "(I)Landroidx/compose/runtime/GroupSourceInformation;", "R0", "w1", "(ILjava/lang/Object;)V", "previousGapStart", "newGapStart", "p1", "gapStart", "Ljava/util/HashMap;", "Landroidx/compose/runtime/Anchor;", "Lkotlin/collections/HashMap;", "sourceInformationMap", "O0", "(IILjava/util/HashMap;)Z", "originalLocation", "newLocation", "w0", "k0", "(I)I", "dataIndex", "R", "", "G0", "([II)I", "P", PlaceTypes.ADDRESS, "Q", "c1", "t1", "([III)V", "F0", "G", "gapLen", "capacity", "S", "(IIII)I", "anchor", "O", "(III)I", "I0", "(II)I", "H0", "t0", "E0", "groupKey", "groupObjectKey", "(I)Ljava/lang/Object;", "groupSize", "j0", "o0", "m0", "n0", "node", "D0", "(Landroidx/compose/runtime/Anchor;)Ljava/lang/Object;", "normalClose", "L", "(Z)V", "S0", "o1", "F", "(Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)V", "count", "m1", "q1", "(Ljava/lang/Object;)V", "x1", "L0", "(Ljava/lang/String;)V", "N0", "(ILjava/lang/String;)V", "M0", "v1", "u1", "W0", "d1", "V0", "(IILjava/lang/Object;)Ljava/lang/Object;", "slotIndex", "J", "X0", "()Ljava/lang/Object;", "b1", "(Landroidx/compose/runtime/Anchor;I)Ljava/lang/Object;", "groupIndex", "a1", "(II)Ljava/lang/Object;", "g1", "f1", "e1", "amount", "C", "Z0", "H", "U", "i1", "dataKey", "j1", "l1", "h1", "(ILjava/lang/Object;Ljava/lang/Object;)V", "T", "V", "W", "(Landroidx/compose/runtime/Anchor;)V", "Y0", "P0", "()Z", "offset", "y0", "writer", "", "C0", "(Landroidx/compose/runtime/Anchor;ILandroidx/compose/runtime/SlotWriter;)Ljava/util/List;", "removeSourceGroup", "x0", "(Landroidx/compose/runtime/SlotTable;IZ)Ljava/util/List;", "A0", "(ILandroidx/compose/runtime/SlotTable;I)Ljava/util/List;", "D", "(I)Landroidx/compose/runtime/Anchor;", "u0", "E", "(Landroidx/compose/runtime/Anchor;)I", "toString", "()Ljava/lang/String;", "n1", "Landroidx/compose/runtime/SlotTable;", "i0", "()Landroidx/compose/runtime/SlotTable;", "a", "[I", "groups", "", "b", "[Ljava/lang/Object;", "slots", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "anchors", "d", "Ljava/util/HashMap;", "LZ/K;", "LZ/L;", "e", "LZ/K;", "calledByMap", "groupGapStart", "f", "groupGapLen", "g", "currentSlot", "h", "currentSlotEnd", "i", "slotsGapStart", "j", "slotsGapLen", "k", "slotsGapOwner", "l", "insertCount", "m", "nodeCount", "Landroidx/compose/runtime/P;", "n", "Landroidx/compose/runtime/P;", "startStack", "o", "endStack", "p", "nodeCountStack", "LZ/T;", "q", "deferredSlotWrites", "<set-?>", "currentGroup", "c0", "r", "d0", "currentGroupEnd", "s", "f0", "t", "Z", "closed", "u", "LZ/J;", "pendingRecalculateMarks", "e0", "currentGroupSlotIndex", "Y", "r0", "isGroupEnd", "h0", "slotsSize", "s0", "b0", "collectingSourceInformation", "a0", "collectingCalledInformation", "g0", "v", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SlotWriter {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: w, reason: collision with root package name */
    public static final int f50130w = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int[] groups;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Object[] slots;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private ArrayList<Anchor> anchors;
    private int currentGroup;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Z.K<Z.L> calledByMap;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int groupGapLen;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int currentSlot;
    private int groupGapStart;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int currentSlotEnd;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int slotsGapStart;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int slotsGapLen;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int slotsGapOwner;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int insertCount;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int nodeCount;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private Z.K<Z.T<Object>> deferredSlotWrites;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int currentGroupEnd;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean closed;
    private final SlotTable table;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private Z.J pendingRecalculateMarks;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final P startStack = new P();

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final P endStack = new P();

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final P nodeCountStack = new P();

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int parent = -1;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/SlotWriter$a;", "", "<init>", "()V", "Landroidx/compose/runtime/SlotWriter;", "fromWriter", "", "fromIndex", "toWriter", "", "updateFromCursor", "updateToCursor", "removeSourceGroup", "", "Landroidx/compose/runtime/Anchor;", "b", "(Landroidx/compose/runtime/SlotWriter;ILandroidx/compose/runtime/SlotWriter;ZZZ)Ljava/util/List;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.runtime.SlotWriter$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Anchor> b(SlotWriter fromWriter, int fromIndex, SlotWriter toWriter, boolean updateFromCursor, boolean updateToCursor, boolean removeSourceGroup) {
            boolean zQ0;
            List<Anchor> listM;
            int iGroupSize = fromWriter.groupSize(fromIndex);
            int i10 = fromIndex + iGroupSize;
            int iP = fromWriter.P(fromIndex);
            int iP2 = fromWriter.P(i10);
            int i11 = iP2 - iP;
            boolean zM = fromWriter.M(fromIndex);
            toWriter.p0(iGroupSize);
            toWriter.q0(i11, toWriter.getCurrentGroup());
            if (fromWriter.groupGapStart < i10) {
                fromWriter.z0(i10);
            }
            if (fromWriter.slotsGapStart < iP2) {
                fromWriter.B0(iP2, i10);
            }
            int[] iArr = toWriter.groups;
            int currentGroup = toWriter.getCurrentGroup();
            int i12 = currentGroup * 5;
            ArraysKt.m(fromWriter.groups, iArr, i12, fromIndex * 5, i10 * 5);
            Object[] objArr = toWriter.slots;
            int i13 = toWriter.currentSlot;
            System.arraycopy(fromWriter.slots, iP, objArr, i13, i11);
            int parent = toWriter.getParent();
            iArr[i12 + 2] = parent;
            int i14 = currentGroup - fromIndex;
            int i15 = currentGroup + iGroupSize;
            int iQ = i13 - toWriter.Q(iArr, currentGroup);
            int i16 = toWriter.slotsGapOwner;
            int i17 = toWriter.slotsGapLen;
            int length = objArr.length;
            int i18 = i16;
            int i19 = currentGroup;
            while (true) {
                zQ0 = false;
                if (i19 >= i15) {
                    break;
                }
                if (i19 != currentGroup) {
                    int i20 = (i19 * 5) + 2;
                    iArr[i20] = iArr[i20] + i14;
                }
                int[] iArr2 = iArr;
                int i21 = currentGroup;
                iArr2[(i19 * 5) + 4] = toWriter.S(toWriter.Q(iArr, i19) + iQ, i18 >= i19 ? toWriter.slotsGapStart : 0, i17, length);
                if (i19 == i18) {
                    i18++;
                }
                i19++;
                currentGroup = i21;
                iArr = iArr2;
            }
            int[] iArr3 = iArr;
            toWriter.slotsGapOwner = i18;
            int iR = SlotTableKt.r(fromWriter.anchors, fromIndex, fromWriter.g0());
            int iR2 = SlotTableKt.r(fromWriter.anchors, i10, fromWriter.g0());
            if (iR < iR2) {
                ArrayList arrayList = fromWriter.anchors;
                ArrayList arrayList2 = new ArrayList(iR2 - iR);
                for (int i22 = iR; i22 < iR2; i22++) {
                    Anchor anchor = (Anchor) arrayList.get(i22);
                    anchor.c(anchor.getLocation() + i14);
                    arrayList2.add(anchor);
                }
                toWriter.anchors.addAll(SlotTableKt.r(toWriter.anchors, toWriter.getCurrentGroup(), toWriter.g0()), arrayList2);
                arrayList.subList(iR, iR2).clear();
                listM = arrayList2;
            } else {
                listM = CollectionsKt.m();
            }
            List<Anchor> list = listM;
            if (!list.isEmpty()) {
                HashMap map = fromWriter.sourceInformationMap;
                HashMap map2 = toWriter.sourceInformationMap;
                if (map != null && map2 != null) {
                    int size = list.size();
                    for (int i23 = 0; i23 < size; i23++) {
                        Anchor anchor2 = listM.get(i23);
                        GroupSourceInformation groupSourceInformation = (GroupSourceInformation) map.get(anchor2);
                        if (groupSourceInformation != null) {
                            map.remove(anchor2);
                            map2.put(anchor2, groupSourceInformation);
                        }
                    }
                }
            }
            int parent2 = toWriter.getParent();
            GroupSourceInformation groupSourceInformationSourceInformationOf = toWriter.sourceInformationOf(parent);
            if (groupSourceInformationSourceInformationOf != null) {
                int iP3 = parent2 + 1;
                int currentGroup2 = toWriter.getCurrentGroup();
                int i24 = -1;
                while (iP3 < currentGroup2) {
                    i24 = iP3;
                    iP3 = SlotTableKt.p(toWriter.groups, iP3) + iP3;
                }
                groupSourceInformationSourceInformationOf.b(toWriter, i24, currentGroup2);
            }
            int iParent = fromWriter.parent(fromIndex);
            if (removeSourceGroup) {
                if (updateFromCursor) {
                    boolean z10 = iParent >= 0;
                    if (z10) {
                        fromWriter.i1();
                        fromWriter.C(iParent - fromWriter.getCurrentGroup());
                        fromWriter.i1();
                    }
                    fromWriter.C(fromIndex - fromWriter.getCurrentGroup());
                    boolean zP0 = fromWriter.P0();
                    if (z10) {
                        fromWriter.Z0();
                        fromWriter.T();
                        fromWriter.Z0();
                        fromWriter.T();
                    }
                    zQ0 = zP0;
                } else {
                    zQ0 = fromWriter.Q0(fromIndex, iGroupSize);
                    fromWriter.R0(iP, i11, fromIndex - 1);
                }
            }
            if (zQ0) {
                ComposerKt.t("Unexpectedly removed anchors");
            }
            int i25 = toWriter.nodeCount;
            int i26 = iArr3[i12 + 1];
            toWriter.nodeCount = i25 + ((1073741824 & i26) == 0 ? i26 & 67108863 : 1);
            if (updateToCursor) {
                toWriter.currentGroup = i15;
                toWriter.currentSlot = i13 + i11;
            }
            if (zM) {
                toWriter.r1(parent);
            }
            return listM;
        }

        private Companion() {
        }

        static /* synthetic */ List c(Companion companion, SlotWriter slotWriter, int i10, SlotWriter slotWriter2, boolean z10, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 32) != 0) {
                z12 = true;
            }
            return companion.b(slotWriter, i10, slotWriter2, z10, z11, z12);
        }
    }

    private final int H0(int index) {
        return index > -2 ? index : (g0() + index) - (-2);
    }

    private final int O(int anchor, int gapLen, int capacity) {
        return anchor < 0 ? (capacity - gapLen) + anchor + 1 : anchor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Q0(int start, int len) {
        if (len > 0) {
            ArrayList<Anchor> arrayList = this.anchors;
            z0(start);
            zO0 = arrayList.isEmpty() ? false : O0(start, len, this.sourceInformationMap);
            this.groupGapStart = start;
            this.groupGapLen += len;
            int i10 = this.slotsGapOwner;
            if (i10 > start) {
                this.slotsGapOwner = Math.max(start, i10 - len);
            }
            int i11 = this.currentGroupEnd;
            if (i11 >= this.groupGapStart) {
                this.currentGroupEnd = i11 - len;
            }
            int i12 = this.parent;
            if (N(i12)) {
                r1(i12);
            }
        }
        return zO0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int S(int index, int gapStart, int gapLen, int capacity) {
        return index > gapStart ? -(((capacity - gapLen) - index) + 1) : index;
    }

    private final void w0(int originalLocation, int newLocation, int size) {
        Anchor anchor;
        int iE;
        int i10 = size + originalLocation;
        int iG0 = g0();
        int iR = SlotTableKt.r(this.anchors, originalLocation, iG0);
        ArrayList arrayList = new ArrayList();
        if (iR >= 0) {
            while (iR < this.anchors.size() && (iE = E((anchor = this.anchors.get(iR)))) >= originalLocation && iE < i10) {
                arrayList.add(anchor);
                this.anchors.remove(iR);
            }
        }
        int i11 = newLocation - originalLocation;
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            Anchor anchor2 = (Anchor) arrayList.get(i12);
            int iE2 = E(anchor2) + i11;
            if (iE2 >= this.groupGapStart) {
                anchor2.c(-(iG0 - iE2));
            } else {
                anchor2.c(iE2);
            }
            this.anchors.add(SlotTableKt.r(this.anchors, iE2, iG0), anchor2);
        }
    }

    public final void C(int amount) {
        boolean z10 = false;
        if (!(amount >= 0)) {
            ComposerKt.t("Cannot seek backwards");
        }
        if (!(this.insertCount <= 0)) {
            C5757z0.b("Cannot call seek() while inserting");
        }
        if (amount == 0) {
            return;
        }
        int i10 = this.currentGroup + amount;
        if (i10 >= this.parent && i10 <= this.currentGroupEnd) {
            z10 = true;
        }
        if (!z10) {
            ComposerKt.t("Cannot seek outside the current group (" + this.parent + '-' + this.currentGroupEnd + ')');
        }
        this.currentGroup = i10;
        int iQ = Q(this.groups, k0(i10));
        this.currentSlot = iQ;
        this.currentSlotEnd = iQ;
    }

    public final void L(boolean normalClose) {
        this.closed = true;
        if (normalClose && this.startStack.tos == 0) {
            z0(g0());
            B0(this.slots.length - this.slotsGapLen, this.groupGapStart);
            K();
            K0();
        }
        this.table.k(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors, this.sourceInformationMap, this.calledByMap);
    }

    public final void h1(int key, Object objectKey, Object aux) {
        k1(key, objectKey, false, aux);
    }

    public final void m1(int count) {
        if (!(count > 0)) {
            ComposerKt.t("Check failed");
        }
        int i10 = this.parent;
        int iC1 = c1(this.groups, k0(i10));
        int iQ = Q(this.groups, k0(i10 + 1)) - count;
        if (!(iQ >= iC1)) {
            ComposerKt.t("Check failed");
        }
        R0(iQ, count, i10);
        int i11 = this.currentSlot;
        if (i11 >= iC1) {
            this.currentSlot = i11 - count;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B0(int index, int group) {
        int i10 = this.slotsGapLen;
        int i11 = this.slotsGapStart;
        int i12 = this.slotsGapOwner;
        if (i11 != index) {
            Object[] objArr = this.slots;
            if (index < i11) {
                System.arraycopy(objArr, index, objArr, index + i10, i11 - index);
            } else {
                int i13 = i11 + i10;
                System.arraycopy(objArr, i13, objArr, i11, (index + i10) - i13);
            }
        }
        int iMin = Math.min(group + 1, g0());
        if (i12 != iMin) {
            int length = this.slots.length - i10;
            if (iMin < i12) {
                int iK0 = k0(iMin);
                int iK02 = k0(i12);
                int i14 = this.groupGapStart;
                while (iK0 < iK02) {
                    int i15 = (iK0 * 5) + 4;
                    int i16 = this.groups[i15];
                    if (!(i16 >= 0)) {
                        ComposerKt.t("Unexpected anchor value, expected a positive anchor");
                    }
                    this.groups[i15] = -((length - i16) + 1);
                    iK0++;
                    if (iK0 == i14) {
                        iK0 += this.groupGapLen;
                    }
                }
            } else {
                int iK03 = k0(i12);
                int iK04 = k0(iMin);
                while (iK03 < iK04) {
                    int i17 = (iK03 * 5) + 4;
                    int i18 = this.groups[i17];
                    if (!(i18 < 0)) {
                        ComposerKt.t("Unexpected anchor value, expected a negative anchor");
                    }
                    this.groups[i17] = i18 + length + 1;
                    iK03++;
                    if (iK03 == this.groupGapStart) {
                        iK03 += this.groupGapLen;
                    }
                }
            }
            this.slotsGapOwner = iMin;
        }
        this.slotsGapStart = index;
    }

    private final boolean I(int group) {
        int iGroupSize = group + 1;
        int iGroupSize2 = group + groupSize(group);
        while (iGroupSize < iGroupSize2) {
            if ((this.groups[(k0(iGroupSize) * 5) + 1] & 201326592) != 0) {
                return true;
            }
            iGroupSize += groupSize(iGroupSize);
        }
        return false;
    }

    private final int I0(int index, int gapStart) {
        return index < gapStart ? index : -((g0() - index) + 2);
    }

    private final void K() {
        int i10 = this.slotsGapStart;
        ArraysKt.B(this.slots, null, i10, this.slotsGapLen + i10);
    }

    private final void K0() {
        Z.J j10 = this.pendingRecalculateMarks;
        if (j10 != null) {
            while (C0.d(j10)) {
                s1(C0.f(j10), j10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean M(int group) {
        return group >= 0 && (this.groups[(k0(group) * 5) + 1] & 201326592) != 0;
    }

    private final boolean N(int group) {
        return group >= 0 && (this.groups[(k0(group) * 5) + 1] & 67108864) != 0;
    }

    private final boolean O0(int gapStart, int size, HashMap<Anchor, GroupSourceInformation> sourceInformationMap) {
        int i10 = size + gapStart;
        int iR = SlotTableKt.r(this.anchors, i10, Y() - this.groupGapLen);
        if (iR >= this.anchors.size()) {
            iR--;
        }
        int i11 = iR + 1;
        int i12 = 0;
        while (iR >= 0) {
            Anchor anchor = this.anchors.get(iR);
            int iE = E(anchor);
            if (iE < gapStart) {
                break;
            }
            if (iE < i10) {
                anchor.c(Integer.MIN_VALUE);
                if (sourceInformationMap != null) {
                    sourceInformationMap.remove(anchor);
                }
                if (i12 == 0) {
                    i12 = iR + 1;
                }
                i11 = iR;
            }
            iR--;
        }
        boolean z10 = i11 < i12;
        if (z10) {
            this.anchors.subList(i11, i12).clear();
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int P(int index) {
        return Q(this.groups, k0(index));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int R(int dataIndex) {
        return dataIndex + (this.slotsGapLen * (dataIndex < this.slotsGapStart ? 0 : 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R0(int start, int len, int group) {
        if (len > 0) {
            int i10 = this.slotsGapLen;
            int i11 = start + len;
            B0(i11, group);
            this.slotsGapStart = start;
            this.slotsGapLen = i10 + len;
            ArraysKt.B(this.slots, null, start, i11);
            int i12 = this.currentSlotEnd;
            if (i12 >= start) {
                this.currentSlotEnd = i12 - len;
            }
        }
    }

    private final void U0() {
        this.endStack.h((Y() - this.groupGapLen) - this.currentGroupEnd);
    }

    private final void X(int parent, int endGroup, int firstChild) {
        int iI0 = I0(parent, this.groupGapStart);
        while (firstChild < endGroup) {
            this.groups[(k0(firstChild) * 5) + 2] = iI0;
            int iP = SlotTableKt.p(this.groups, k0(firstChild)) + firstChild;
            X(firstChild, iP, firstChild + 1);
            firstChild = iP;
        }
    }

    private final int Y() {
        return this.groups.length / 5;
    }

    private final int e0() {
        Z.T<Object> tB;
        int iG1 = this.currentSlot - g1(this.parent);
        Z.K<Z.T<Object>> k10 = this.deferredSlotWrites;
        return iG1 + ((k10 == null || (tB = k10.b(this.parent)) == null) ? 0 : tB.get_size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int k0(int index) {
        return index + (this.groupGapLen * (index < this.groupGapStart ? 0 : 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    private final void k1(int key, Object objectKey, boolean isNode, Object aux) {
        int iP;
        GroupSourceInformation groupSourceInformationSourceInformationOf;
        int i10 = this.parent;
        Object[] objArr = this.insertCount > 0;
        this.nodeCountStack.h(this.nodeCount);
        if (objArr == true) {
            int i11 = this.currentGroup;
            int iQ = Q(this.groups, k0(i11));
            p0(1);
            this.currentSlot = iQ;
            this.currentSlotEnd = iQ;
            int iK0 = k0(i11);
            Composer.Companion aVar = Composer.INSTANCE;
            ?? r12 = objectKey != aVar.a() ? 1 : 0;
            ?? r13 = (isNode || aux == aVar.a()) ? 0 : 1;
            int iS = S(iQ, this.slotsGapStart, this.slotsGapLen, this.slots.length);
            if (iS >= 0 && this.slotsGapOwner < i11) {
                iS = -(((this.slots.length - this.slotsGapLen) - iS) + 1);
            }
            SlotTableKt.q(this.groups, iK0, key, isNode, r12, r13, this.parent, iS);
            int i12 = (isNode ? 1 : 0) + r12 + r13;
            if (i12 > 0) {
                q0(i12, i11);
                Object[] objArr2 = this.slots;
                int i13 = this.currentSlot;
                if (isNode) {
                    objArr2[i13] = aux;
                    i13++;
                }
                if (r12 != 0) {
                    objArr2[i13] = objectKey;
                    i13++;
                }
                if (r13 != 0) {
                    objArr2[i13] = aux;
                    i13++;
                }
                this.currentSlot = i13;
            }
            this.nodeCount = 0;
            iP = i11 + 1;
            this.parent = i11;
            this.currentGroup = iP;
            if (i10 >= 0 && (groupSourceInformationSourceInformationOf = sourceInformationOf(i10)) != null) {
                groupSourceInformationSourceInformationOf.k(this, i11);
            }
        } else {
            this.startStack.h(i10);
            U0();
            int i14 = this.currentGroup;
            int iK02 = k0(i14);
            if (!Intrinsics.e(aux, Composer.INSTANCE.a())) {
                if (isNode) {
                    v1(aux);
                } else {
                    q1(aux);
                }
            }
            this.currentSlot = c1(this.groups, iK02);
            this.currentSlotEnd = Q(this.groups, k0(this.currentGroup + 1));
            int[] iArr = this.groups;
            this.nodeCount = iArr[(iK02 * 5) + 1] & 67108863;
            this.parent = i14;
            this.currentGroup = i14 + 1;
            iP = i14 + SlotTableKt.p(iArr, iK02);
        }
        this.currentGroupEnd = iP;
    }

    private final GroupSourceInformation l0(int parent, String sourceInformation) {
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map == null) {
            return null;
        }
        Anchor anchorD = D(parent);
        GroupSourceInformation groupSourceInformation = map.get(anchorD);
        if (groupSourceInformation == null) {
            groupSourceInformation = new GroupSourceInformation(0, sourceInformation, 0);
            if (sourceInformation == null) {
                int iP = parent + 1;
                int i10 = this.currentGroup;
                while (iP < i10) {
                    groupSourceInformation.k(this, iP);
                    iP += SlotTableKt.p(this.groups, iP);
                }
            }
            map.put(anchorD, groupSourceInformation);
        }
        return groupSourceInformation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0(int size) {
        if (size > 0) {
            int i10 = this.currentGroup;
            z0(i10);
            int i11 = this.groupGapStart;
            int i12 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i13 = length - i12;
            if (i12 < size) {
                int iMax = Math.max(Math.max(length * 2, i13 + size), 32);
                int[] iArr2 = new int[iMax * 5];
                int i14 = iMax - i13;
                ArraysKt.m(iArr, iArr2, 0, 0, i11 * 5);
                ArraysKt.m(iArr, iArr2, (i11 + i14) * 5, (i12 + i11) * 5, length * 5);
                this.groups = iArr2;
                i12 = i14;
            }
            int i15 = this.currentGroupEnd;
            if (i15 >= i11) {
                this.currentGroupEnd = i15 + size;
            }
            int i16 = i11 + size;
            this.groupGapStart = i16;
            this.groupGapLen = i12 - size;
            int iS = S(i13 > 0 ? P(i10 + size) : 0, this.slotsGapOwner >= i11 ? this.slotsGapStart : 0, this.slotsGapLen, this.slots.length);
            for (int i17 = i11; i17 < i16; i17++) {
                this.groups[(i17 * 5) + 4] = iS;
            }
            int i18 = this.slotsGapOwner;
            if (i18 >= i11) {
                this.slotsGapOwner = i18 + size;
            }
        }
    }

    private final void p1(int previousGapStart, int newGapStart) {
        Anchor anchor;
        int iA;
        Anchor anchor2;
        int iA2;
        int i10;
        int iY = Y() - this.groupGapLen;
        if (previousGapStart >= newGapStart) {
            for (int iR = SlotTableKt.r(this.anchors, newGapStart, iY); iR < this.anchors.size() && (iA = (anchor = this.anchors.get(iR)).getLocation()) >= 0; iR++) {
                anchor.c(-(iY - iA));
            }
            return;
        }
        for (int iR2 = SlotTableKt.r(this.anchors, previousGapStart, iY); iR2 < this.anchors.size() && (iA2 = (anchor2 = this.anchors.get(iR2)).getLocation()) < 0 && (i10 = iA2 + iY) < newGapStart; iR2++) {
            anchor2.c(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0(int size, int group) {
        if (size > 0) {
            B0(this.currentSlot, group);
            int i10 = this.slotsGapStart;
            int i11 = this.slotsGapLen;
            if (i11 < size) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i12 = length - i11;
                int iMax = Math.max(Math.max(length * 2, i12 + size), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i13 = 0; i13 < iMax; i13++) {
                    objArr2[i13] = null;
                }
                int i14 = iMax - i12;
                int i15 = i11 + i10;
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(objArr, i15, objArr2, i10 + i14, length - i15);
                this.slots = objArr2;
                i11 = i14;
            }
            int i16 = this.currentSlotEnd;
            if (i16 >= i10) {
                this.currentSlotEnd = i16 + size;
            }
            this.slotsGapStart = i10 + size;
            this.slotsGapLen = i11 - size;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r1(int group) {
        if (group >= 0) {
            Z.J jC = this.pendingRecalculateMarks;
            if (jC == null) {
                jC = C0.c(null, 1, null);
                this.pendingRecalculateMarks = jC;
            }
            C0.a(jC, group);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GroupSourceInformation sourceInformationOf(int group) {
        Anchor anchorN1;
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map == null || (anchorN1 = n1(group)) == null) {
            return null;
        }
        return map.get(anchorN1);
    }

    private final void t1(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 4] = S(i11, this.slotsGapStart, this.slotsGapLen, this.slots.length);
    }

    public static /* synthetic */ void v0(SlotWriter slotWriter, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = slotWriter.parent;
        }
        slotWriter.u0(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z0(int index) {
        int i10 = this.groupGapLen;
        int i11 = this.groupGapStart;
        if (i11 != index) {
            if (!this.anchors.isEmpty()) {
                p1(i11, index);
            }
            if (i10 > 0) {
                int[] iArr = this.groups;
                int i12 = index * 5;
                int i13 = i10 * 5;
                int i14 = i11 * 5;
                if (index < i11) {
                    ArraysKt.m(iArr, iArr, i13 + i12, i12, i14);
                } else {
                    ArraysKt.m(iArr, iArr, i14, i14 + i13, i12 + i13);
                }
            }
            if (index < i11) {
                i11 = index + i10;
            }
            int iY = Y();
            if (!(i11 < iY)) {
                ComposerKt.t("Check failed");
            }
            while (i11 < iY) {
                int i15 = (i11 * 5) + 2;
                int i16 = this.groups[i15];
                int iI0 = I0(H0(i16), index);
                if (iI0 != i16) {
                    this.groups[i15] = iI0;
                }
                i11++;
                if (i11 == index) {
                    i11 += i10;
                }
            }
        }
        this.groupGapStart = index;
    }

    public final List<Anchor> A0(int offset, SlotTable table, int index) {
        if (!(this.insertCount <= 0 && groupSize(this.currentGroup + offset) == 1)) {
            ComposerKt.t("Check failed");
        }
        int i10 = this.currentGroup;
        int i11 = this.currentSlot;
        int i12 = this.currentSlotEnd;
        C(offset);
        i1();
        H();
        SlotWriter slotWriterC = table.C();
        try {
            List<Anchor> listC = Companion.c(INSTANCE, slotWriterC, index, this, false, true, false, 32, null);
            slotWriterC.L(true);
            U();
            T();
            this.currentGroup = i10;
            this.currentSlot = i11;
            this.currentSlotEnd = i12;
            return listC;
        } catch (Throwable th2) {
            slotWriterC.L(false);
            throw th2;
        }
    }

    public final List<Anchor> C0(Anchor anchor, int offset, SlotWriter writer) {
        if (!(writer.insertCount > 0)) {
            ComposerKt.t("Check failed");
        }
        if (!(this.insertCount == 0)) {
            ComposerKt.t("Check failed");
        }
        if (!anchor.b()) {
            ComposerKt.t("Check failed");
        }
        int iE = E(anchor) + offset;
        int i10 = this.currentGroup;
        if (!(i10 <= iE && iE < this.currentGroupEnd)) {
            ComposerKt.t("Check failed");
        }
        int iParent = parent(iE);
        int iGroupSize = groupSize(iE);
        int iE0 = t0(iE) ? 1 : E0(iE);
        List<Anchor> listC = Companion.c(INSTANCE, this, iE, writer, false, false, false, 32, null);
        r1(iParent);
        boolean z10 = iE0 > 0;
        while (iParent >= i10) {
            int iK0 = k0(iParent);
            int[] iArr = this.groups;
            SlotTableKt.x(iArr, iK0, SlotTableKt.p(iArr, iK0) - iGroupSize);
            if (z10) {
                int[] iArr2 = this.groups;
                int i11 = iArr2[(iK0 * 5) + 1];
                if ((1073741824 & i11) != 0) {
                    z10 = false;
                } else {
                    SlotTableKt.z(iArr2, iK0, (i11 & 67108863) - iE0);
                }
            }
            iParent = parent(iParent);
        }
        if (z10) {
            if (!(this.nodeCount >= iE0)) {
                ComposerKt.t("Check failed");
            }
            this.nodeCount -= iE0;
        }
        return listC;
    }

    public final Anchor D(int index) {
        ArrayList<Anchor> arrayList = this.anchors;
        int iT = SlotTableKt.t(arrayList, index, g0());
        if (iT >= 0) {
            return arrayList.get(iT);
        }
        if (index > this.groupGapStart) {
            index = -(g0() - index);
        }
        Anchor anchor = new Anchor(index);
        arrayList.add(-(iT + 1), anchor);
        return anchor;
    }

    public final int E0(int index) {
        return this.groups[(k0(index) * 5) + 1] & 67108863;
    }

    public final void F(Anchor anchor, Object value) {
        if (!(this.insertCount == 0)) {
            ComposerKt.t("Can only append a slot if not current inserting");
        }
        int i10 = this.currentSlot;
        int i11 = this.currentSlotEnd;
        int iE = E(anchor);
        int iQ = Q(this.groups, k0(iE + 1));
        this.currentSlot = iQ;
        this.currentSlotEnd = iQ;
        q0(1, iE);
        if (i10 >= iQ) {
            i10++;
            i11++;
        }
        this.slots[iQ] = value;
        this.currentSlot = i10;
        this.currentSlotEnd = i11;
    }

    public final void H() {
        int i10 = this.insertCount;
        this.insertCount = i10 + 1;
        if (i10 == 0) {
            U0();
        }
    }

    public final void L0(String sourceInformation) {
        if (this.insertCount > 0) {
            l0(this.parent, sourceInformation);
        }
    }

    public final void M0() {
        GroupSourceInformation groupSourceInformationL0;
        if (this.insertCount <= 0 || (groupSourceInformationL0 = l0(this.parent, null)) == null) {
            return;
        }
        groupSourceInformationL0.d(e0());
    }

    public final void N0(int key, String value) {
        if (this.insertCount > 0) {
            Z.K<Z.L> k10 = this.calledByMap;
            if (k10 != null) {
                SlotTableKt.m(k10, key, groupKey(this.parent));
            }
            GroupSourceInformation groupSourceInformationL0 = l0(this.parent, null);
            if (groupSourceInformationL0 != null) {
                groupSourceInformationL0.l(key, value, e0());
            }
        }
    }

    public final boolean P0() {
        Anchor anchorN1;
        if (!(this.insertCount == 0)) {
            ComposerKt.t("Cannot remove group while inserting");
        }
        int i10 = this.currentGroup;
        int i11 = this.currentSlot;
        int iQ = Q(this.groups, k0(i10));
        int iY0 = Y0();
        GroupSourceInformation groupSourceInformationSourceInformationOf = sourceInformationOf(this.parent);
        if (groupSourceInformationSourceInformationOf != null && (anchorN1 = n1(i10)) != null) {
            groupSourceInformationSourceInformationOf.i(anchorN1);
        }
        Z.J j10 = this.pendingRecalculateMarks;
        if (j10 != null) {
            while (C0.d(j10) && C0.e(j10) >= i10) {
                C0.f(j10);
            }
        }
        boolean zQ0 = Q0(i10, this.currentGroup - i10);
        R0(iQ, this.currentSlot - iQ, i10 - 1);
        this.currentGroup = i10;
        this.currentSlot = i11;
        this.nodeCount -= iY0;
        return zQ0;
    }

    public final void S0() {
        if (!(this.insertCount == 0)) {
            ComposerKt.t("Cannot reset when inserting");
        }
        K0();
        this.currentGroup = 0;
        this.currentGroupEnd = Y() - this.groupGapLen;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
        this.nodeCount = 0;
    }

    public final int T() {
        Z.T<Object> tB;
        boolean z10 = this.insertCount > 0;
        int i10 = this.currentGroup;
        int i11 = this.currentGroupEnd;
        int i12 = this.parent;
        int iK0 = k0(i12);
        int i13 = this.nodeCount;
        int i14 = i10 - i12;
        int i15 = (iK0 * 5) + 1;
        boolean z11 = (this.groups[i15] & 1073741824) != 0;
        if (z10) {
            Z.K<Z.T<Object>> k10 = this.deferredSlotWrites;
            if (k10 != null && (tB = k10.b(i12)) != null) {
                Object[] objArr = tB.content;
                int i16 = tB._size;
                for (int i17 = 0; i17 < i16; i17++) {
                    J0(objArr[i17]);
                }
                k10.o(i12);
            }
            SlotTableKt.x(this.groups, iK0, i14);
            SlotTableKt.z(this.groups, iK0, i13);
            this.nodeCount = this.nodeCountStack.g() + (z11 ? 1 : i13);
            int iG0 = G0(this.groups, i12);
            this.parent = iG0;
            int iG02 = iG0 < 0 ? g0() : k0(iG0 + 1);
            int iQ = iG02 >= 0 ? Q(this.groups, iG02) : 0;
            this.currentSlot = iQ;
            this.currentSlotEnd = iQ;
            return i13;
        }
        if (!(i10 == i11)) {
            ComposerKt.t("Expected to be at the end of a group");
        }
        int iP = SlotTableKt.p(this.groups, iK0);
        int[] iArr = this.groups;
        int i18 = iArr[i15] & 67108863;
        SlotTableKt.x(iArr, iK0, i14);
        SlotTableKt.z(this.groups, iK0, i13);
        int iG = this.startStack.g();
        T0();
        this.parent = iG;
        int iG03 = G0(this.groups, i12);
        int iG2 = this.nodeCountStack.g();
        this.nodeCount = iG2;
        if (iG03 == iG) {
            this.nodeCount = iG2 + (z11 ? 0 : i13 - i18);
            return i13;
        }
        int i19 = i14 - iP;
        int i20 = z11 ? 0 : i13 - i18;
        if (i19 != 0 || i20 != 0) {
            while (iG03 != 0 && iG03 != iG && (i20 != 0 || i19 != 0)) {
                int iK02 = k0(iG03);
                if (i19 != 0) {
                    SlotTableKt.x(this.groups, iK02, SlotTableKt.p(this.groups, iK02) + i19);
                }
                if (i20 != 0) {
                    int[] iArr2 = this.groups;
                    SlotTableKt.z(iArr2, iK02, (iArr2[(iK02 * 5) + 1] & 67108863) + i20);
                }
                int[] iArr3 = this.groups;
                if ((iArr3[(iK02 * 5) + 1] & 1073741824) != 0) {
                    i20 = 0;
                }
                iG03 = G0(iArr3, iG03);
            }
        }
        this.nodeCount += i20;
        return i13;
    }

    public final void U() {
        if (!(this.insertCount > 0)) {
            C5757z0.b("Unbalanced begin/end insert");
        }
        int i10 = this.insertCount - 1;
        this.insertCount = i10;
        if (i10 == 0) {
            if (!(this.nodeCountStack.tos == this.startStack.tos)) {
                ComposerKt.t("startGroup/endGroup mismatch while inserting");
            }
            T0();
        }
    }

    public final void V(int index) {
        boolean z10 = false;
        if (!(this.insertCount <= 0)) {
            ComposerKt.t("Cannot call ensureStarted() while inserting");
        }
        int i10 = this.parent;
        if (i10 != index) {
            if (index >= i10 && index < this.currentGroupEnd) {
                z10 = true;
            }
            if (!z10) {
                ComposerKt.t("Started group at " + index + " must be a subgroup of the group at " + i10);
            }
            int i11 = this.currentGroup;
            int i12 = this.currentSlot;
            int i13 = this.currentSlotEnd;
            this.currentGroup = index;
            i1();
            this.currentGroup = i11;
            this.currentSlot = i12;
            this.currentSlotEnd = i13;
        }
    }

    public final void W0(Object value) {
        if (!(this.currentSlot <= this.currentSlotEnd)) {
            ComposerKt.t("Writing to an invalid slot");
        }
        this.slots[R(this.currentSlot - 1)] = value;
    }

    public final Object X0() {
        if (this.insertCount > 0) {
            q0(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i10 = this.currentSlot;
        this.currentSlot = i10 + 1;
        return objArr[R(i10)];
    }

    public final int Y0() {
        int iK0 = k0(this.currentGroup);
        int iP = this.currentGroup + SlotTableKt.p(this.groups, iK0);
        this.currentGroup = iP;
        this.currentSlot = Q(this.groups, k0(iP));
        int i10 = this.groups[(iK0 * 5) + 1];
        if ((1073741824 & i10) != 0) {
            return 1;
        }
        return i10 & 67108863;
    }

    /* renamed from: Z, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    public final void Z0() {
        int i10 = this.currentGroupEnd;
        this.currentGroup = i10;
        this.currentSlot = Q(this.groups, k0(i10));
    }

    public final boolean a0() {
        return this.calledByMap != null;
    }

    public final boolean b0() {
        return this.sourceInformationMap != null;
    }

    /* renamed from: c0, reason: from getter */
    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    /* renamed from: d0, reason: from getter */
    public final int getCurrentGroupEnd() {
        return this.currentGroupEnd;
    }

    public final int e1(int groupIndex) {
        return Q(this.groups, k0(groupIndex + groupSize(groupIndex)));
    }

    /* renamed from: f0, reason: from getter */
    public final int getParent() {
        return this.parent;
    }

    public final int f1(int groupIndex) {
        return Q(this.groups, k0(groupIndex + 1));
    }

    public final int g1(int groupIndex) {
        return c1(this.groups, k0(groupIndex));
    }

    public final int groupKey(int index) {
        return this.groups[k0(index) * 5];
    }

    public final int groupSize(int index) {
        return SlotTableKt.p(this.groups, k0(index));
    }

    public final int h0() {
        return this.slots.length - this.slotsGapLen;
    }

    /* renamed from: i0, reason: from getter */
    public final SlotTable getTable() {
        return this.table;
    }

    public final void i1() {
        if (!(this.insertCount == 0)) {
            ComposerKt.t("Key must be supplied when inserting");
        }
        Composer.Companion aVar = Composer.INSTANCE;
        k1(0, aVar.a(), false, aVar.a());
    }

    public final void j1(int key, Object dataKey) {
        k1(key, dataKey, false, Composer.INSTANCE.a());
    }

    public final void l1(int key, Object objectKey) {
        k1(key, objectKey, true, Composer.INSTANCE.a());
    }

    public final boolean m0(int index) {
        return n0(index, this.currentGroup);
    }

    public final boolean n0(int index, int group) {
        int iB;
        int iY;
        if (group == this.parent) {
            iY = this.currentGroupEnd;
        } else if (group <= this.startStack.f(0) && (iB = this.startStack.b(group)) >= 0) {
            iY = (Y() - this.groupGapLen) - this.endStack.d(iB);
        } else {
            int iGroupSize = groupSize(group);
            iY = iGroupSize + group;
        }
        return index > group && index < iY;
    }

    public final Anchor n1(int group) {
        if (group < 0 || group >= g0()) {
            return null;
        }
        return SlotTableKt.o(this.anchors, group, g0());
    }

    public final boolean o0(int index) {
        int i10 = this.parent;
        if (index <= i10 || index >= this.currentGroupEnd) {
            return i10 == 0 && index == 0;
        }
        return true;
    }

    public final Object o1(Object value) {
        if (this.insertCount <= 0 || this.currentSlot == this.slotsGapStart) {
            return J0(value);
        }
        Z.K<Z.T<Object>> k10 = this.deferredSlotWrites;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i10 = 1;
        int i11 = 0;
        if (k10 == null) {
            k10 = new Z.K<>(i11, i10, defaultConstructorMarker);
        }
        this.deferredSlotWrites = k10;
        int i12 = this.parent;
        Z.T<Object> tB = k10.b(i12);
        if (tB == null) {
            tB = new Z.T<>(i11, i10, defaultConstructorMarker);
            k10.r(i12, tB);
        }
        tB.n(value);
        return Composer.INSTANCE.a();
    }

    public final int parent(int index) {
        return G0(this.groups, index);
    }

    public final void q1(Object value) {
        int iK0 = k0(this.currentGroup);
        if (!((this.groups[(iK0 * 5) + 1] & 268435456) != 0)) {
            ComposerKt.t("Updating the data of a group that was not created with a data slot");
        }
        this.slots[R(G(this.groups, iK0))] = value;
    }

    public final boolean r0() {
        return this.currentGroup == this.currentGroupEnd;
    }

    public final boolean s0() {
        int i10 = this.currentGroup;
        return i10 < this.currentGroupEnd && (this.groups[(k0(i10) * 5) + 1] & 1073741824) != 0;
    }

    public final boolean t0(int index) {
        return (this.groups[(k0(index) * 5) + 1] & 1073741824) != 0;
    }

    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + g0() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')';
    }

    public final void v1(Object value) {
        w1(this.currentGroup, value);
    }

    public final List<Anchor> x0(SlotTable table, int index, boolean removeSourceGroup) {
        if (!(this.insertCount > 0)) {
            ComposerKt.t("Check failed");
        }
        if (index != 0 || this.currentGroup != 0 || this.table.getGroupsSize() != 0 || SlotTableKt.p(table.getGroups(), index) != table.getGroupsSize()) {
            SlotWriter slotWriterC = table.C();
            try {
                List<Anchor> listB = INSTANCE.b(slotWriterC, index, this, true, true, removeSourceGroup);
                slotWriterC.L(true);
                return listB;
            } catch (Throwable th2) {
                slotWriterC.L(false);
                throw th2;
            }
        }
        int[] iArr = this.groups;
        Object[] objArr = this.slots;
        ArrayList<Anchor> arrayList = this.anchors;
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        Z.K<Z.L> k10 = this.calledByMap;
        int[] groups = table.getGroups();
        int groupsSize = table.getGroupsSize();
        Object[] slots = table.getSlots();
        int slotsSize = table.getSlotsSize();
        HashMap<Anchor, GroupSourceInformation> mapW = table.w();
        Z.K<Z.L> kR = table.r();
        this.groups = groups;
        this.slots = slots;
        this.anchors = table.q();
        this.groupGapStart = groupsSize;
        this.groupGapLen = (groups.length / 5) - groupsSize;
        this.slotsGapStart = slotsSize;
        this.slotsGapLen = slots.length - slotsSize;
        this.slotsGapOwner = groupsSize;
        this.sourceInformationMap = mapW;
        this.calledByMap = kR;
        table.E(iArr, 0, objArr, 0, arrayList, map, k10);
        return this.anchors;
    }

    public final void x1() {
        this.sourceInformationMap = this.table.w();
        this.calledByMap = this.table.r();
    }

    public final void y0(int offset) {
        boolean z10 = true;
        if (!(this.insertCount == 0)) {
            ComposerKt.t("Cannot move a group while inserting");
        }
        if (!(offset >= 0)) {
            ComposerKt.t("Parameter offset is out of bounds");
        }
        if (offset == 0) {
            return;
        }
        int i10 = this.currentGroup;
        int i11 = this.parent;
        int i12 = this.currentGroupEnd;
        int iP = i10;
        for (int i13 = offset; i13 > 0; i13--) {
            iP += SlotTableKt.p(this.groups, k0(iP));
            if (!(iP <= i12)) {
                ComposerKt.t("Parameter offset is out of bounds");
            }
        }
        int iP2 = SlotTableKt.p(this.groups, k0(iP));
        int iQ = Q(this.groups, k0(this.currentGroup));
        int iQ2 = Q(this.groups, k0(iP));
        int i14 = iP + iP2;
        int iQ3 = Q(this.groups, k0(i14));
        int i15 = iQ3 - iQ2;
        q0(i15, Math.max(this.currentGroup - 1, 0));
        p0(iP2);
        int[] iArr = this.groups;
        int iK0 = k0(i14) * 5;
        ArraysKt.m(iArr, iArr, k0(i10) * 5, iK0, (iP2 * 5) + iK0);
        if (i15 > 0) {
            Object[] objArr = this.slots;
            int iR = R(iQ2 + i15);
            System.arraycopy(objArr, iR, objArr, iQ, R(iQ3 + i15) - iR);
        }
        int i16 = iQ2 + i15;
        int i17 = i16 - iQ;
        int i18 = this.slotsGapStart;
        int i19 = this.slotsGapLen;
        int length = this.slots.length;
        int i20 = this.slotsGapOwner;
        int i21 = i10 + iP2;
        int i22 = i10;
        while (i22 < i21) {
            boolean z11 = z10;
            int iK02 = k0(i22);
            int i23 = i22;
            int i24 = i17;
            t1(iArr, iK02, S(Q(iArr, iK02) - i17, i20 < iK02 ? 0 : i18, i19, length));
            i22 = i23 + 1;
            z10 = z11;
            i17 = i24;
        }
        w0(i14, i10, iP2);
        if (Q0(i14, iP2)) {
            ComposerKt.t("Unexpectedly removed anchors");
        }
        X(i11, this.currentGroupEnd, i10);
        if (i15 > 0) {
            R0(i16, i15, i14 - 1);
        }
    }

    public SlotWriter(SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        this.slots = slotTable.getSlots();
        this.anchors = slotTable.q();
        this.sourceInformationMap = slotTable.w();
        this.calledByMap = slotTable.r();
        this.groupGapStart = slotTable.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - slotTable.getGroupsSize();
        this.slotsGapStart = slotTable.getSlotsSize();
        this.slotsGapLen = this.slots.length - slotTable.getSlotsSize();
        this.slotsGapOwner = slotTable.getGroupsSize();
        this.currentGroupEnd = slotTable.getGroupsSize();
    }

    private final int F0(int[] iArr, int i10) {
        return Q(iArr, i10);
    }

    private final int G(int[] iArr, int i10) {
        return Q(iArr, i10) + Integer.bitCount(iArr[(i10 * 5) + 1] >> 29);
    }

    private final int G0(int[] iArr, int i10) {
        return H0(iArr[(k0(i10) * 5) + 2]);
    }

    private final Object J0(Object value) {
        Object objX0 = X0();
        W0(value);
        return objX0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Q(int[] iArr, int i10) {
        if (i10 >= Y()) {
            return this.slots.length - this.slotsGapLen;
        }
        return O(iArr[(i10 * 5) + 4], this.slotsGapLen, this.slots.length);
    }

    private final int T0() {
        int iY = (Y() - this.groupGapLen) - this.endStack.g();
        this.currentGroupEnd = iY;
        return iY;
    }

    private final int c1(int[] iArr, int i10) {
        if (i10 >= Y()) {
            return this.slots.length - this.slotsGapLen;
        }
        return O(SlotTableKt.u(iArr, i10), this.slotsGapLen, this.slots.length);
    }

    private final void s1(int group, Z.J set) {
        int iK0 = k0(group);
        boolean zI = I(group);
        int[] iArr = this.groups;
        boolean z10 = true;
        if ((iArr[(iK0 * 5) + 1] & 67108864) == 0) {
            z10 = false;
        }
        if (z10 != zI) {
            SlotTableKt.w(iArr, iK0, zI);
            int iParent = parent(group);
            if (iParent >= 0) {
                C0.a(set, iParent);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void w1(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.k0(r5)
            int[] r1 = r4.groups
            int r2 = r1.length
            if (r0 >= r2) goto L15
            int r2 = r0 * 5
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r2
            if (r1 == 0) goto L15
            goto L16
        L15:
            r3 = 0
        L16:
            if (r3 != 0) goto L31
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Updating the node of a group at "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " that was not created with as a node group"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            androidx.compose.runtime.ComposerKt.t(r5)
        L31:
            java.lang.Object[] r5 = r4.slots
            int[] r1 = r4.groups
            int r0 = r4.F0(r1, r0)
            int r0 = r4.R(r0)
            r5[r0] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotWriter.w1(int, java.lang.Object):void");
    }

    public final Object D0(Anchor anchor) {
        return node(anchor.e(this));
    }

    public final int E(Anchor anchor) {
        int iA = anchor.getLocation();
        if (iA < 0) {
            return g0() + iA;
        }
        return iA;
    }

    public final Object J(int slotIndex) {
        int iR = R(slotIndex);
        Object[] objArr = this.slots;
        Object obj = objArr[iR];
        objArr[iR] = Composer.INSTANCE.a();
        return obj;
    }

    public final Object V0(int group, int index, Object value) {
        int iR = R(d1(group, index));
        Object[] objArr = this.slots;
        Object obj = objArr[iR];
        objArr[iR] = value;
        return obj;
    }

    public final void W(Anchor anchor) {
        V(anchor.e(this));
    }

    public final Object a1(int groupIndex, int index) {
        int iC1 = c1(this.groups, k0(groupIndex));
        int iQ = Q(this.groups, k0(groupIndex + 1));
        int i10 = index + iC1;
        if (iC1 <= i10 && i10 < iQ) {
            return this.slots[R(i10)];
        }
        return Composer.INSTANCE.a();
    }

    public final Object b1(Anchor anchor, int index) {
        return a1(E(anchor), index);
    }

    public final int d1(int group, int index) {
        boolean z10;
        int iC1 = c1(this.groups, k0(group));
        int iQ = Q(this.groups, k0(group + 1));
        int i10 = iC1 + index;
        if (i10 >= iC1 && i10 < iQ) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            ComposerKt.t("Write to an invalid slot index " + index + " for group " + group);
        }
        return i10;
    }

    public final int g0() {
        return Y() - this.groupGapLen;
    }

    public final Object groupObjectKey(int index) {
        int iK0 = k0(index);
        int[] iArr = this.groups;
        if ((iArr[(iK0 * 5) + 1] & 536870912) != 0) {
            return this.slots[SlotTableKt.s(iArr, iK0)];
        }
        return null;
    }

    public final Object j0(int index) {
        int iK0 = k0(index);
        int[] iArr = this.groups;
        if ((iArr[(iK0 * 5) + 1] & 268435456) != 0) {
            return this.slots[G(iArr, iK0)];
        }
        return Composer.INSTANCE.a();
    }

    public final Object node(int index) {
        int iK0 = k0(index);
        int[] iArr = this.groups;
        if ((iArr[(iK0 * 5) + 1] & 1073741824) != 0) {
            return this.slots[R(F0(iArr, iK0))];
        }
        return null;
    }

    public final void u0(int group) {
        int iK0 = k0(group);
        int[] iArr = this.groups;
        int i10 = (iK0 * 5) + 1;
        if ((iArr[i10] & 134217728) == 0) {
            SlotTableKt.y(iArr, iK0, true);
            if ((this.groups[i10] & 67108864) != 0) {
                return;
            }
            r1(parent(group));
        }
    }

    public final void u1(Anchor anchor, Object value) {
        w1(anchor.e(this), value);
    }
}
