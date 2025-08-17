package androidx.compose.runtime;

import E0.f;
import J0.IntRef;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000ú\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b*\u0002²\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0004¸\u0001»\u0001BI\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010\u0014J\u000f\u0010 \u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010\u0014J\u0019\u0010\"\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\"\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020'2\u0006\u0010*\u001a\u00020\u0017H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020'2\u0006\u0010-\u001a\u00020'2\u0006\u0010.\u001a\u00020'H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00122\u0006\u00101\u001a\u00020'H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0012H\u0002¢\u0006\u0004\b4\u0010\u0014J\u000f\u00105\u001a\u00020\u0012H\u0002¢\u0006\u0004\b5\u0010\u0014J\u000f\u00106\u001a\u00020\u0012H\u0002¢\u0006\u0004\b6\u0010\u0014J!\u0010:\u001a\u00020\u00122\u0006\u00108\u001a\u0002072\b\u00109\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b:\u0010;J6\u0010?\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010<\u001a\u0004\u0018\u00010\u001b2\u0006\u0010>\u001a\u00020=2\b\u00109\u001a\u0004\u0018\u00010\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010@J!\u0010C\u001a\u00020\u00122\u0006\u00108\u001a\u0002072\b\u0010B\u001a\u0004\u0018\u00010AH\u0002¢\u0006\u0004\bC\u0010DJ\u001f\u0010G\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u00172\u0006\u0010F\u001a\u000207H\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\u00122\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0012H\u0002¢\u0006\u0004\bK\u0010\u0014J\u0017\u0010M\u001a\u00020\u00172\u0006\u0010L\u001a\u00020\u0017H\u0002¢\u0006\u0004\bM\u0010NJ\u001f\u0010P\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00172\u0006\u0010O\u001a\u00020\u0017H\u0002¢\u0006\u0004\bP\u0010QJ/\u0010U\u001a\u00020\u00172\u0006\u0010R\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u00172\u0006\u0010S\u001a\u00020\u00172\u0006\u0010T\u001a\u00020\u0017H\u0002¢\u0006\u0004\bU\u0010VJ\u0017\u0010W\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u0017H\u0002¢\u0006\u0004\bW\u0010NJ\u0017\u0010X\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u0017H\u0002¢\u0006\u0004\bX\u0010NJ\u001f\u0010Z\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00172\u0006\u0010Y\u001a\u00020\u0017H\u0002¢\u0006\u0004\bZ\u0010QJ\u000f\u0010[\u001a\u00020\u0012H\u0002¢\u0006\u0004\b[\u0010\u0014J'\u0010_\u001a\u00020\u00122\u0006\u0010\\\u001a\u00020\u00172\u0006\u0010]\u001a\u00020\u00172\u0006\u0010^\u001a\u00020\u0017H\u0002¢\u0006\u0004\b_\u0010`J\u001f\u0010b\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00172\u0006\u0010a\u001a\u00020\u0017H\u0002¢\u0006\u0004\bb\u0010QJ'\u0010d\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u00172\u0006\u0010S\u001a\u00020\u00172\u0006\u0010c\u001a\u00020\u0017H\u0002¢\u0006\u0004\bd\u0010eJ\u001b\u0010g\u001a\u00020\u0017*\u00020f2\u0006\u0010*\u001a\u00020\u0017H\u0002¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\u0012H\u0002¢\u0006\u0004\bi\u0010\u0014J\u000f\u0010j\u001a\u00020\u0012H\u0002¢\u0006\u0004\bj\u0010\u0014J9\u0010p\u001a\u00020\u00122\u000e\u0010l\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0k2\u0006\u0010m\u001a\u00020'2\b\u0010n\u001a\u0004\u0018\u00010\u001b2\u0006\u0010o\u001a\u000207H\u0002¢\u0006\u0004\bp\u0010qJ+\u0010v\u001a\u00020\u00122\u001a\u0010u\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020t\u0012\u0006\u0012\u0004\u0018\u00010t0s0rH\u0002¢\u0006\u0004\bv\u0010wJf\u0010\u007f\u001a\u00028\u0000\"\u0004\b\u0000\u0010x2\n\b\u0002\u0010y\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010z\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00172\u001c\b\u0002\u0010|\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020{\u0012\u0006\u0012\u0004\u0018\u00010\u001b0s0r2\f\u0010~\u001a\b\u0012\u0004\u0012\u00028\u00000}H\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J;\u0010\u0083\u0001\u001a\u00020\u00122\u0014\u0010\u0082\u0001\u001a\u000f\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u001b0\u0081\u00012\u000e\u0010l\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010}H\u0002ø\u0001\u0000¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J \u0010\u0085\u0001\u001a\u0004\u0018\u00010\u001b*\u00020f2\u0006\u0010L\u001a\u00020\u0017H\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0011\u0010\u0087\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0087\u0001\u0010\u0014J\u0011\u0010\u0088\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0088\u0001\u0010\u0014J\u001b\u0010\u008a\u0001\u001a\u00020\u00122\u0007\u0010\u0089\u0001\u001a\u00020$H\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0011\u0010\u008c\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u008c\u0001\u0010\u0014J\u001a\u0010\u008e\u0001\u001a\u00020\u00122\u0007\u0010\u008d\u0001\u001a\u00020\u0017H\u0002¢\u0006\u0005\b\u008e\u0001\u0010\u001aJ\u0011\u0010\u008f\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u008f\u0001\u0010\u0014J\u0011\u0010\u0090\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0090\u0001\u0010\u0014J\u0011\u0010\u0091\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0091\u0001\u0010\u0014J\u0019\u0010\u0092\u0001\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0005\b\u0092\u0001\u0010\u001aJ\u0011\u0010\u0093\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0093\u0001\u0010\u0014J\u0019\u0010\u0094\u0001\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0005\b\u0094\u0001\u0010\u001aJ\u0011\u0010\u0095\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0095\u0001\u0010\u0014J\u0011\u0010\u0096\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0096\u0001\u0010\u0014J\u0011\u0010\u0097\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0097\u0001\u0010\u0014J#\u0010\u0098\u0001\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0005\b\u0098\u0001\u0010\u001eJ\u0011\u0010\u0099\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0099\u0001\u0010\u0014J\u0011\u0010\u009a\u0001\u001a\u00020\u0012H\u0000¢\u0006\u0005\b\u009a\u0001\u0010\u0014J\u0011\u0010\u009b\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u009b\u0001\u0010\u0014J\u0011\u0010\u009c\u0001\u001a\u00020\u0012H\u0000¢\u0006\u0005\b\u009c\u0001\u0010\u0014J\u0011\u0010\u009d\u0001\u001a\u00020\u0012H\u0000¢\u0006\u0005\b\u009d\u0001\u0010\u0014J\u0011\u0010\u009e\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u009e\u0001\u0010\u0014J\u0011\u0010\u009f\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u009f\u0001\u0010\u0014J(\u0010¡\u0001\u001a\u00020\u0012\"\u0005\b\u0000\u0010\u0099\u00012\r\u0010 \u0001\u001a\b\u0012\u0004\u0012\u00028\u00000}H\u0016¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u0011\u0010£\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b£\u0001\u0010\u0014J\u0011\u0010¤\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b¤\u0001\u0010\u0014J#\u0010¥\u0001\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0005\b¥\u0001\u0010\u001eJ\u0011\u0010¦\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b¦\u0001\u0010\u0014J\u0011\u0010§\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b§\u0001\u0010\u0014J\u0011\u0010¨\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b¨\u0001\u0010\u0014J\u000f\u0010©\u0001\u001a\u00020\u0012¢\u0006\u0005\b©\u0001\u0010\u0014J\u000f\u0010ª\u0001\u001a\u00020\u0012¢\u0006\u0005\bª\u0001\u0010\u0014JI\u0010®\u0001\u001a\u00020\u0012\"\u0005\b\u0000\u0010«\u0001\"\u0005\b\u0001\u0010\u0099\u00012\u0006\u0010!\u001a\u00028\u00002\u001f\u0010~\u001a\u001b\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120¬\u0001¢\u0006\u0003\b\u00ad\u0001H\u0016¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u0014\u0010°\u0001\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0006\b°\u0001\u0010±\u0001J\u0014\u0010²\u0001\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0006\b²\u0001\u0010±\u0001J\u001c\u0010«\u0001\u001a\u0002072\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0006\b«\u0001\u0010³\u0001J\u001c\u0010´\u0001\u001a\u0002072\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0006\b´\u0001\u0010³\u0001J\u001b\u0010¶\u0001\u001a\u0002072\u0007\u0010!\u001a\u00030µ\u0001H\u0017¢\u0006\u0006\b¶\u0001\u0010·\u0001J\u001a\u0010¸\u0001\u001a\u0002072\u0006\u0010!\u001a\u000207H\u0017¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u001b\u0010»\u0001\u001a\u0002072\u0007\u0010!\u001a\u00030º\u0001H\u0017¢\u0006\u0006\b»\u0001\u0010¼\u0001J\u001b\u0010¾\u0001\u001a\u0002072\u0007\u0010!\u001a\u00030½\u0001H\u0017¢\u0006\u0006\b¾\u0001\u0010¿\u0001J\u001b\u0010Á\u0001\u001a\u0002072\u0007\u0010!\u001a\u00030À\u0001H\u0017¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J\u001a\u0010Ã\u0001\u001a\u0002072\u0006\u0010!\u001a\u00020\u0017H\u0017¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J\u001b\u0010Å\u0001\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0005\bÅ\u0001\u0010#J\u001b\u0010Æ\u0001\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0005\bÆ\u0001\u0010#J!\u0010È\u0001\u001a\u00020\u00122\r\u0010Ç\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120}H\u0016¢\u0006\u0006\bÈ\u0001\u0010¢\u0001J\u001f\u0010Ê\u0001\u001a\u00020\u00122\u000b\u0010!\u001a\u0007\u0012\u0002\b\u00030É\u0001H\u0017¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J\u0011\u0010Ì\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\bÌ\u0001\u0010\u0014J)\u0010Ï\u0001\u001a\u00020\u00122\u0015\u0010Î\u0001\u001a\u0010\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030É\u00010Í\u0001H\u0017¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001J\u0011\u0010Ñ\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\bÑ\u0001\u0010\u0014J(\u0010Ó\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010\u0099\u00012\r\u0010\u0018\u001a\t\u0012\u0004\u0012\u00028\u00000Ò\u0001H\u0017¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001J\u0010\u0010x\u001a\u00020\u0004H\u0016¢\u0006\u0005\bx\u0010Õ\u0001J&\u0010Ø\u0001\u001a\u0002072\u0007\u0010Ö\u0001\u001a\u00020{2\t\u0010×\u0001\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0006\bØ\u0001\u0010Ù\u0001J\u0011\u0010Ú\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\bÚ\u0001\u0010\u0014J$\u0010Ý\u0001\u001a\u0002072\u0007\u0010Û\u0001\u001a\u0002072\u0007\u0010Ü\u0001\u001a\u00020\u0017H\u0017¢\u0006\u0006\bÝ\u0001\u0010Þ\u0001J\u0011\u0010ß\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\bß\u0001\u0010\u0014J\u001a\u0010á\u0001\u001a\u00020\u00122\u0007\u0010à\u0001\u001a\u000207H\u0017¢\u0006\u0005\bá\u0001\u0010JJ\u001a\u0010â\u0001\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0006\bâ\u0001\u0010ã\u0001J\u0015\u0010å\u0001\u001a\u0005\u0018\u00010ä\u0001H\u0017¢\u0006\u0006\bå\u0001\u0010æ\u0001J-\u0010ç\u0001\u001a\u00020\u00122\u001a\u0010u\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020t\u0012\u0006\u0012\u0004\u0018\u00010t0s0rH\u0017¢\u0006\u0005\bç\u0001\u0010wJ\u001c\u0010ê\u0001\u001a\u00020\u00122\b\u0010é\u0001\u001a\u00030è\u0001H\u0017¢\u0006\u0006\bê\u0001\u0010ë\u0001J$\u0010ì\u0001\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010é\u0001\u001a\u00030è\u0001H\u0017¢\u0006\u0006\bì\u0001\u0010í\u0001J\u0011\u0010î\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\bî\u0001\u0010\u0014JE\u0010ñ\u0001\u001a\u00020\u00122\u0014\u0010\u0082\u0001\u001a\u000f\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u001b0\u0081\u00012\f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00120}2\n\u0010ð\u0001\u001a\u0005\u0018\u00010ï\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\bñ\u0001\u0010ò\u0001J \u0010ó\u0001\u001a\u00020\u00122\f\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00120}H\u0000¢\u0006\u0006\bó\u0001\u0010¢\u0001J7\u0010ô\u0001\u001a\u0002072\u0014\u0010\u0082\u0001\u001a\u000f\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u001b0\u0081\u00012\n\u0010ð\u0001\u001a\u0005\u0018\u00010ï\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\bô\u0001\u0010õ\u0001J)\u0010ö\u0001\u001a\u00020\u00122\u0014\u0010\u0082\u0001\u001a\u000f\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u001b0\u0081\u0001ø\u0001\u0000¢\u0006\u0006\bö\u0001\u0010÷\u0001J\u0014\u0010ø\u0001\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0006\bø\u0001\u0010±\u0001J\u001b\u0010ù\u0001\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0005\bù\u0001\u0010#J\u001c\u0010û\u0001\u001a\u00020\u00122\b\u0010Ö\u0001\u001a\u00030ú\u0001H\u0016¢\u0006\u0006\bû\u0001\u0010ü\u0001R\"\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b»\u0001\u0010ý\u0001\u001a\u0006\bþ\u0001\u0010ÿ\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010\u0080\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010\u0081\u0002R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010\u0082\u0002R\u0018\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010\u0083\u0002R\u0018\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010\u0083\u0002R\u001e\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0084\u0002\u0010\u0085\u0002\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002R&\u0010\u008a\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010A0\u0088\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\bá\u0001\u0010\u0089\u0002R\u001b\u0010\u008d\u0002\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0002\u0010\u008c\u0002R\u0019\u0010\u008e\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bþ\u0001\u0010¡\u0001R\u0019\u0010\u008f\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bå\u0001\u0010¡\u0001R\u0019\u0010\u0090\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010¡\u0001R\u0018\u0010\u0093\u0002\u001a\u00030\u0091\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010\u0092\u0002R\u001c\u0010\u0096\u0002\u001a\u0005\u0018\u00010\u0094\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010\u0095\u0002R\u001c\u0010\u0099\u0002\u001a\u0005\u0018\u00010\u0097\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010\u0098\u0002R\u0019\u0010\u009c\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0002\u0010\u009b\u0002R\u0019\u0010\u009e\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0002\u0010\u009b\u0002R\u0019\u0010\u009f\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010\u009b\u0002R\u001e\u0010|\u001a\n\u0012\u0005\u0012\u00030¡\u00020 \u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bù\u0001\u0010¢\u0002R\u0018\u0010£\u0002\u001a\u00030\u0091\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÌ\u0001\u0010\u0092\u0002R\u0019\u0010¥\u0002\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010¤\u0002R\"\u0010¨\u0002\u001a\u000b\u0012\u0004\u0012\u00020'\u0018\u00010¦\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010§\u0002R\u0019\u0010©\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010\u009b\u0002R\u0018\u0010ª\u0002\u001a\u00030\u0091\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0092\u0002R\u0019\u0010¬\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0002\u0010\u009b\u0002R\u0019\u0010\u00ad\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010¡\u0001R\u0019\u0010®\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bø\u0001\u0010¡\u0001R\u0019\u0010°\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0002\u0010¡\u0001R\u0019\u0010±\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010\u009b\u0002R\u0018\u0010´\u0002\u001a\u00030²\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010³\u0002R$\u0010µ\u0002\u001a\t\u0012\u0004\u0012\u00020{0\u0088\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u0089\u0002R*\u0010¹\u0002\u001a\u0002072\u0007\u0010¶\u0002\u001a\u0002078\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b§\u0001\u0010\u009b\u0002\u001a\u0006\b·\u0002\u0010¸\u0002R*\u0010»\u0002\u001a\u0002072\u0007\u0010¶\u0002\u001a\u0002078\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\bÊ\u0001\u0010\u009b\u0002\u001a\u0006\bº\u0002\u0010¸\u0002R)\u0010Á\u0002\u001a\u00020f8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¡\u0001\u0010¼\u0002\u001a\u0006\b½\u0002\u0010¾\u0002\"\u0006\b¿\u0002\u0010À\u0002R)\u0010Æ\u0002\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bê\u0001\u0010\u0081\u0002\u001a\u0006\bÂ\u0002\u0010Ã\u0002\"\u0006\bÄ\u0002\u0010Å\u0002R\u001a\u0010É\u0002\u001a\u00030Ç\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0001\u0010È\u0002R\u0019\u0010Ê\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bì\u0001\u0010\u009b\u0002R\u001b\u0010Ë\u0002\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0001\u0010¤\u0002R+\u0010Ñ\u0002\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÌ\u0002\u0010\u0083\u0002\u001a\u0006\bÍ\u0002\u0010Î\u0002\"\u0006\bÏ\u0002\u0010Ð\u0002R\u0018\u0010Ô\u0002\u001a\u00030Ò\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bû\u0001\u0010Ó\u0002R\u0019\u0010Ö\u0002\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010Õ\u0002R\u001a\u0010Ú\u0002\u001a\u00030×\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bØ\u0002\u0010Ù\u0002R/\u0010F\u001a\u0002072\u0007\u0010¶\u0002\u001a\u0002078\u0016@RX\u0097\u000e¢\u0006\u0016\n\u0005\bx\u0010\u009b\u0002\u0012\u0005\bÛ\u0002\u0010\u0014\u001a\u0006\b\u0084\u0002\u0010¸\u0002R1\u0010Þ\u0002\u001a\u00020\u00172\u0007\u0010¶\u0002\u001a\u00020\u00178\u0016@RX\u0097\u000e¢\u0006\u0017\n\u0006\bî\u0001\u0010¡\u0001\u0012\u0005\bÝ\u0002\u0010\u0014\u001a\u0006\bØ\u0002\u0010Ü\u0002R\u001c\u0010á\u0002\u001a\u0005\u0018\u00010ß\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010à\u0002R\u001d\u0010ä\u0002\u001a\u0004\u0018\u00010\u001b*\u00020f8BX\u0082\u0004¢\u0006\b\u001a\u0006\bâ\u0002\u0010ã\u0002R\u0017\u0010æ\u0002\u001a\u0002078@X\u0080\u0004¢\u0006\b\u001a\u0006\bå\u0002\u0010¸\u0002R\u0018\u0010é\u0002\u001a\u00030ç\u00028WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009a\u0002\u0010è\u0002R\u001e\u0010ë\u0002\u001a\u0002078VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bê\u0002\u0010\u0014\u001a\u0006\bÌ\u0002\u0010¸\u0002R\u001e\u0010í\u0002\u001a\u0002078VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bì\u0002\u0010\u0014\u001a\u0006\b\u008b\u0002\u0010¸\u0002R\u0018\u0010ï\u0002\u001a\u00030ß\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¯\u0002\u0010î\u0002R\u0018\u0010ò\u0002\u001a\u00030ð\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009d\u0002\u0010ñ\u0002R\u0019\u0010õ\u0002\u001a\u0004\u0018\u00010{8@X\u0080\u0004¢\u0006\b\u001a\u0006\bó\u0002\u0010ô\u0002R\u001a\u0010÷\u0002\u001a\u0005\u0018\u00010ú\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b«\u0002\u0010ö\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006ø\u0002"}, d2 = {"Landroidx/compose/runtime/ComposerImpl;", "Landroidx/compose/runtime/Composer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/k;", "parentContext", "Landroidx/compose/runtime/SlotTable;", "slotTable", "", "Landroidx/compose/runtime/N0;", "abandonSet", "Landroidx/compose/runtime/changelist/a;", "changes", "lateChanges", "Landroidx/compose/runtime/z;", "composition", "<init>", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/k;Landroidx/compose/runtime/SlotTable;Ljava/util/Set;Landroidx/compose/runtime/changelist/a;Landroidx/compose/runtime/changelist/a;Landroidx/compose/runtime/z;)V", "", "u1", "()V", "y0", "X", "", "key", "q1", "(I)V", "", "dataKey", "r1", "(ILjava/lang/Object;)V", "w0", "n1", "value", "B1", "(Ljava/lang/Object;)V", "Landroidx/compose/runtime/Anchor;", "e1", "()Landroidx/compose/runtime/Anchor;", "Landroidx/compose/runtime/y0;", "p0", "()Landroidx/compose/runtime/y0;", "group", "q0", "(I)Landroidx/compose/runtime/y0;", "parentScope", "currentProviders", "A1", "(Landroidx/compose/runtime/y0;Landroidx/compose/runtime/y0;)Landroidx/compose/runtime/y0;", "providers", "c1", "(Landroidx/compose/runtime/y0;)V", "z0", "o0", "D0", "", "isNode", "data", "s1", "(ZLjava/lang/Object;)V", "objectKey", "Landroidx/compose/runtime/O;", "kind", "p1", "(ILjava/lang/Object;ILjava/lang/Object;)V", "Landroidx/compose/runtime/x0;", "newPending", "A0", "(ZLandroidx/compose/runtime/x0;)V", "expectedNodeCount", "inserting", "B0", "(IZ)V", "v0", "(Z)V", "Z0", "index", "N0", "(I)I", "newCount", "z1", "(II)V", "groupLocation", "recomposeGroup", "recomposeIndex", "T0", "(IIII)I", "V0", "D1", "count", "y1", "l0", "oldGroup", "newGroup", "commonRoot", "d1", "(III)V", "nearestCommonRoot", "u0", "recomposeKey", "n0", "(III)I", "Landroidx/compose/runtime/W0;", "K0", "(Landroidx/compose/runtime/W0;I)I", "o1", "i0", "Landroidx/compose/runtime/e0;", "content", "locals", "parameter", "force", "O0", "(Landroidx/compose/runtime/e0;Landroidx/compose/runtime/y0;Ljava/lang/Object;Z)V", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/g0;", "references", "L0", "(Ljava/util/List;)V", "R", "from", "to", "Landroidx/compose/runtime/I0;", "invalidations", "Lkotlin/Function0;", "block", "X0", "(Landroidx/compose/runtime/z;Landroidx/compose/runtime/z;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "LD0/g;", "invalidationsRequested", "t0", "(LZ/W;Lkotlin/jvm/functions/Function2;)V", "S0", "(Landroidx/compose/runtime/W0;I)Ljava/lang/Object;", "E1", "F1", "anchor", "b1", "(Landroidx/compose/runtime/Anchor;)V", "a1", "groupBeingRemoved", "g1", "f1", "C0", "k0", "startReplaceableGroup", "U", "startReplaceGroup", "P", "E", "w", "startMovableGroup", "T", "j0", "y", "s0", "r0", "m", "F", "factory", "I", "(Lkotlin/jvm/functions/Function0;)V", "s", "v", "startReusableGroup", "A", "G", "c", "t1", "x0", "V", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "n", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Q0", "()Ljava/lang/Object;", "R0", "(Ljava/lang/Object;)Z", "D", "", "f", "(C)Z", "a", "(Z)Z", "", "b", "(F)Z", "", "e", "(J)Z", "", "g", "(D)Z", "d", "(I)Z", "C1", "w1", "effect", "x", "Landroidx/compose/runtime/G0;", "H", "(Landroidx/compose/runtime/G0;)V", "u", "", "values", "W", "([Landroidx/compose/runtime/G0;)V", "M", "Landroidx/compose/runtime/p;", "o", "(Landroidx/compose/runtime/p;)Ljava/lang/Object;", "()Landroidx/compose/runtime/k;", "scope", "instance", "v1", "(Landroidx/compose/runtime/I0;Ljava/lang/Object;)Z", "m1", "parametersChanged", "flags", "p", "(ZI)Z", "K", "changed", "i", "startRestartGroup", "(I)Landroidx/compose/runtime/Composer;", "Landroidx/compose/runtime/T0;", "l", "()Landroidx/compose/runtime/T0;", "M0", "", "sourceInformation", "J", "(Ljava/lang/String;)V", "L", "(ILjava/lang/String;)V", "S", "Landroidx/compose/runtime/U0;", "shouldPause", "m0", "(LZ/W;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/U0;)V", "U0", "W0", "(LZ/W;Landroidx/compose/runtime/U0;)Z", "x1", "(LZ/W;)V", "B", "t", "Landroidx/compose/runtime/H0;", "O", "(Landroidx/compose/runtime/H0;)V", "Landroidx/compose/runtime/Applier;", "k", "()Landroidx/compose/runtime/Applier;", "Landroidx/compose/runtime/k;", "Landroidx/compose/runtime/SlotTable;", "Ljava/util/Set;", "Landroidx/compose/runtime/changelist/a;", "h", "Landroidx/compose/runtime/z;", "F0", "()Landroidx/compose/runtime/z;", "Landroidx/compose/runtime/y1;", "Ljava/util/ArrayList;", "pendingStack", "j", "Landroidx/compose/runtime/x0;", "pending", "nodeIndex", "groupNodeCount", "rGroupIndex", "Landroidx/compose/runtime/P;", "Landroidx/compose/runtime/P;", "parentStateStack", "", "[I", "nodeCountOverrides", "LZ/I;", "LZ/I;", "nodeCountVirtualOverrides", "q", "Z", "forceRecomposeScopes", "r", "forciblyRecompose", "nodeExpected", "", "Landroidx/compose/runtime/S;", "Ljava/util/List;", "entersStack", "Landroidx/compose/runtime/y0;", "parentProvider", "LZ/K;", "LZ/K;", "providerUpdates", "providersInvalid", "providersInvalidStack", "z", "reusing", "reusingGroup", "childrenComposing", "C", "compositionToken", "sourceMarkersEnabled", "androidx/compose/runtime/ComposerImpl$c", "Landroidx/compose/runtime/ComposerImpl$c;", "derivedStateObserver", "invalidateStack", "<set-?>", "P0", "()Z", "isComposing", "isDisposed$runtime_release", "isDisposed", "Landroidx/compose/runtime/W0;", "J0", "()Landroidx/compose/runtime/W0;", "l1", "(Landroidx/compose/runtime/W0;)V", "reader", "getInsertTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "setInsertTable$runtime_release", "(Landroidx/compose/runtime/SlotTable;)V", "insertTable", "Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/SlotWriter;", "writer", "writerHasAProvider", "providerCache", "N", "H0", "()Landroidx/compose/runtime/changelist/a;", "setDeferredChanges$runtime_release", "(Landroidx/compose/runtime/changelist/a;)V", "deferredChanges", "LC0/a;", "LC0/a;", "changeListWriter", "Landroidx/compose/runtime/Anchor;", "insertAnchor", "Landroidx/compose/runtime/changelist/b;", "Q", "Landroidx/compose/runtime/changelist/b;", "insertFixups", "getInserting$annotations", "()I", "getCompoundKeyHash$annotations", "compoundKeyHash", "LO0/a;", "LO0/a;", "_compositionData", "I0", "(Landroidx/compose/runtime/W0;)Ljava/lang/Object;", "node", "E0", "areChildrenComposing", "Lkotlin/coroutines/CoroutineContext;", "()Lkotlin/coroutines/CoroutineContext;", "applyCoroutineContext", "getDefaultsInvalid$annotations", "defaultsInvalid", "getSkipping$annotations", "skipping", "()LO0/a;", "compositionData", "Landroidx/compose/runtime/s;", "()Landroidx/compose/runtime/s;", "currentCompositionLocalMap", "G0", "()Landroidx/compose/runtime/I0;", "currentRecomposeScope", "()Landroidx/compose/runtime/H0;", "recomposeScope", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ComposerImpl implements Composer {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private int childrenComposing;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private int compositionToken;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private boolean sourceMarkersEnabled;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final c derivedStateObserver;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final ArrayList invalidateStack;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private boolean isComposing;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private boolean isDisposed;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private SlotReader reader;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private SlotTable insertTable;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private SlotWriter writer;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private boolean writerHasAProvider;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5755y0 providerCache;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.runtime.changelist.a deferredChanges;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final C0.a changeListWriter;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private Anchor insertAnchor;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.runtime.changelist.b insertFixups;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private boolean inserting;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private int compoundKeyHash;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private O0.a _compositionData;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Applier<?> applier;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5727k parentContext;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final SlotTable slotTable;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Set<N0> abandonSet;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.runtime.changelist.a changes;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.runtime.changelist.a lateChanges;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5756z composition;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private C5753x0 pending;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int nodeIndex;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int groupNodeCount;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int rGroupIndex;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int[] nodeCountOverrides;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private Z.I nodeCountVirtualOverrides;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean forceRecomposeScopes;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean forciblyRecompose;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean nodeExpected;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private Z.K<InterfaceC5755y0> providerUpdates;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean providersInvalid;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean reusing;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final ArrayList pendingStack = y1.c(null, 1, null);

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final P parentStateStack = new P();

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final List<S> invalidations = new ArrayList();

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final P entersStack = new P();

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5755y0 parentProvider = J0.g.a();

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final P providersInvalidStack = new P();

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private int reusingGroup = -1;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tR\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$a;", "Landroidx/compose/runtime/R0;", "Landroidx/compose/runtime/ComposerImpl$b;", "Landroidx/compose/runtime/ComposerImpl;", "ref", "<init>", "(Landroidx/compose/runtime/ComposerImpl$b;)V", "", "b", "()V", "e", "f", "a", "Landroidx/compose/runtime/ComposerImpl$b;", "()Landroidx/compose/runtime/ComposerImpl$b;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements R0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final b ref;

        @Override // androidx.compose.runtime.N0
        public void b() {
        }

        /* renamed from: a, reason: from getter */
        public final b getRef() {
            return this.ref;
        }

        @Override // androidx.compose.runtime.N0
        public void e() {
            this.ref.t();
        }

        @Override // androidx.compose.runtime.N0
        public void f() {
            this.ref.t();
        }

        public a(b bVar) {
            this.ref = bVar;
        }
    }

    @Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u001b\u0010\u0016J\u000f\u0010\u001d\u001a\u00020\u001cH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0010¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000bH\u0010¢\u0006\u0004\b'\u0010\rJ\u000f\u0010(\u001a\u00020\u000bH\u0010¢\u0006\u0004\b(\u0010\rJ\u0017\u0010+\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)H\u0010¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)H\u0010¢\u0006\u0004\b-\u0010,J\u0019\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010*\u001a\u00020)H\u0010¢\u0006\u0004\b/\u00100J+\u00104\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)2\u0006\u00101\u001a\u00020.2\n\u00103\u001a\u0006\u0012\u0002\b\u000302H\u0010¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b6\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0019\u00107\u001a\u0004\b8\u00109R\u001a\u0010\u0005\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b-\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0006\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b(\u0010:\u001a\u0004\b=\u0010<R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR0\u0010F\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010&R\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020G0\"8\u0006¢\u0006\f\n\u0004\b\u001d\u0010B\u001a\u0004\bH\u0010DR+\u0010N\u001a\u00020\u001c2\u0006\u0010J\u001a\u00020\u001c8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010K\u001a\u0004\bL\u0010\u001e\"\u0004\bM\u0010!R\u0014\u0010O\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b>\u0010<R\u0014\u0010S\u001a\u00020P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010R¨\u0006T"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$b;", "Landroidx/compose/runtime/k;", "", "compoundHashKey", "", "collectingParameterInformation", "collectingSourceInformation", "Landroidx/compose/runtime/u;", "observerHolder", "<init>", "(Landroidx/compose/runtime/ComposerImpl;IZZLandroidx/compose/runtime/u;)V", "", "t", "()V", "Landroidx/compose/runtime/Composer;", "composer", "o", "(Landroidx/compose/runtime/Composer;)V", "r", "Landroidx/compose/runtime/z;", "composition", "s", "(Landroidx/compose/runtime/z;)V", "Lkotlin/Function0;", "content", "a", "(Landroidx/compose/runtime/z;Lkotlin/jvm/functions/Function2;)V", "k", "Landroidx/compose/runtime/y0;", "f", "()Landroidx/compose/runtime/y0;", "scope", "x", "(Landroidx/compose/runtime/y0;)V", "", "LO0/a;", "table", "n", "(Ljava/util/Set;)V", "q", "c", "Landroidx/compose/runtime/g0;", "reference", "j", "(Landroidx/compose/runtime/g0;)V", "b", "Landroidx/compose/runtime/f0;", "m", "(Landroidx/compose/runtime/g0;)Landroidx/compose/runtime/f0;", "data", "Landroidx/compose/runtime/Applier;", "applier", "l", "(Landroidx/compose/runtime/g0;Landroidx/compose/runtime/f0;Landroidx/compose/runtime/Applier;)V", "p", "I", "g", "()I", "Z", "e", "()Z", "getCollectingSourceInformation$runtime_release", "d", "Landroidx/compose/runtime/u;", "i", "()Landroidx/compose/runtime/u;", "Ljava/util/Set;", "getInspectionTables", "()Ljava/util/Set;", "setInspectionTables", "inspectionTables", "Landroidx/compose/runtime/ComposerImpl;", "u", "composers", "<set-?>", "Landroidx/compose/runtime/l0;", "v", "w", "compositionLocalScope", "collectingCallByInformation", "Lkotlin/coroutines/CoroutineContext;", "h", "()Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public final class b extends AbstractC5727k {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int compoundHashKey;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean collectingParameterInformation;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean collectingSourceInformation;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final C5746u observerHolder;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private Set<Set<O0.a>> inspectionTables;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Set<ComposerImpl> composers = new LinkedHashSet();

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0 compositionLocalScope = o1.i(J0.g.a(), o1.o());

        public b(int i10, boolean z10, boolean z11, C5746u c5746u) {
            this.compoundHashKey = i10;
            this.collectingParameterInformation = z10;
            this.collectingSourceInformation = z11;
            this.observerHolder = c5746u;
        }

        private final InterfaceC5755y0 v() {
            return (InterfaceC5755y0) this.compositionLocalScope.getValue();
        }

        private final void w(InterfaceC5755y0 interfaceC5755y0) {
            this.compositionLocalScope.setValue(interfaceC5755y0);
        }

        @Override // androidx.compose.runtime.AbstractC5727k
        public void a(InterfaceC5756z composition, Function2<? super Composer, ? super Integer, Unit> content) {
            ComposerImpl.this.parentContext.a(composition, content);
        }

        @Override // androidx.compose.runtime.AbstractC5727k
        public void b(C5720g0 reference) {
            ComposerImpl.this.parentContext.b(reference);
        }

        @Override // androidx.compose.runtime.AbstractC5727k
        public void c() {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.childrenComposing--;
        }

        @Override // androidx.compose.runtime.AbstractC5727k
        public boolean d() {
            return ComposerImpl.this.parentContext.d();
        }

        @Override // androidx.compose.runtime.AbstractC5727k
        /* renamed from: e, reason: from getter */
        public boolean getCollectingParameterInformation() {
            return this.collectingParameterInformation;
        }

        @Override // androidx.compose.runtime.AbstractC5727k
        /* renamed from: g, reason: from getter */
        public int getCompoundHashKey() {
            return this.compoundHashKey;
        }

        @Override // androidx.compose.runtime.AbstractC5727k
        /* renamed from: getCollectingSourceInformation$runtime_release, reason: from getter */
        public boolean getCollectingSourceInformation() {
            return this.collectingSourceInformation;
        }

        @Override // androidx.compose.runtime.AbstractC5727k
        /* renamed from: h */
        public CoroutineContext getEffectCoroutineContext() {
            return ComposerImpl.this.parentContext.getEffectCoroutineContext();
        }

        @Override // androidx.compose.runtime.AbstractC5727k
        /* renamed from: i, reason: from getter */
        public C5746u getObserverHolder() {
            return this.observerHolder;
        }

        @Override // androidx.compose.runtime.AbstractC5727k
        public void j(C5720g0 reference) {
            ComposerImpl.this.parentContext.j(reference);
        }

        @Override // androidx.compose.runtime.AbstractC5727k
        public void k(InterfaceC5756z composition) {
            ComposerImpl.this.parentContext.k(ComposerImpl.this.getComposition());
            ComposerImpl.this.parentContext.k(composition);
        }

        @Override // androidx.compose.runtime.AbstractC5727k
        public void l(C5720g0 reference, C5718f0 data, Applier<?> applier) {
            ComposerImpl.this.parentContext.l(reference, data, applier);
        }

        @Override // androidx.compose.runtime.AbstractC5727k
        public C5718f0 m(C5720g0 reference) {
            return ComposerImpl.this.parentContext.m(reference);
        }

        @Override // androidx.compose.runtime.AbstractC5727k
        public void n(Set<O0.a> table) {
            Set hashSet = this.inspectionTables;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.inspectionTables = hashSet;
            }
            hashSet.add(table);
        }

        @Override // androidx.compose.runtime.AbstractC5727k
        public void o(Composer composer) {
            Intrinsics.h(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
            super.o((ComposerImpl) composer);
            this.composers.add(composer);
        }

        @Override // androidx.compose.runtime.AbstractC5727k
        public void p(InterfaceC5756z composition) {
            ComposerImpl.this.parentContext.p(composition);
        }

        @Override // androidx.compose.runtime.AbstractC5727k
        public void q() {
            ComposerImpl.this.childrenComposing++;
        }

        @Override // androidx.compose.runtime.AbstractC5727k
        public void r(Composer composer) {
            Set<Set<O0.a>> set = this.inspectionTables;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    Set set2 = (Set) it.next();
                    Intrinsics.h(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                    set2.remove(((ComposerImpl) composer).slotTable);
                }
            }
            TypeIntrinsics.a(this.composers).remove(composer);
        }

        @Override // androidx.compose.runtime.AbstractC5727k
        public void s(InterfaceC5756z composition) {
            ComposerImpl.this.parentContext.s(composition);
        }

        public final void t() {
            if (this.composers.isEmpty()) {
                return;
            }
            Set<Set<O0.a>> set = this.inspectionTables;
            if (set != null) {
                for (ComposerImpl composerImpl : this.composers) {
                    Iterator<Set<O0.a>> it = set.iterator();
                    while (it.hasNext()) {
                        it.next().remove(composerImpl.slotTable);
                    }
                }
            }
            this.composers.clear();
        }

        public final Set<ComposerImpl> u() {
            return this.composers;
        }

        @Override // androidx.compose.runtime.AbstractC5727k
        public InterfaceC5755y0 f() {
            return v();
        }

        public final void x(InterfaceC5755y0 scope) {
            w(scope);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/runtime/ComposerImpl$c", "Landroidx/compose/runtime/C;", "Landroidx/compose/runtime/B;", "derivedState", "", "b", "(Landroidx/compose/runtime/B;)V", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements C {
        c() {
        }

        @Override // androidx.compose.runtime.C
        public void a(B<?> derivedState) {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.childrenComposing--;
        }

        @Override // androidx.compose.runtime.C
        public void b(B<?> derivedState) {
            ComposerImpl.this.childrenComposing++;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    static final class d extends Lambda implements Function0<Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.changelist.a f49955g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ SlotReader f49956h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ C5720g0 f49957i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.runtime.changelist.a aVar, SlotReader slotReader, C5720g0 c5720g0) {
            super(0);
            this.f49955g = aVar;
            this.f49956h = slotReader;
            this.f49957i = c5720g0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C0.a aVar = ComposerImpl.this.changeListWriter;
            androidx.compose.runtime.changelist.a aVar2 = this.f49955g;
            ComposerImpl composerImpl = ComposerImpl.this;
            SlotReader slotReader = this.f49956h;
            C5720g0 c5720g0 = this.f49957i;
            androidx.compose.runtime.changelist.a changeList = aVar.getChangeList();
            try {
                aVar.U(aVar2);
                SlotReader reader = composerImpl.getReader();
                int[] iArr = composerImpl.nodeCountOverrides;
                Z.K k10 = composerImpl.providerUpdates;
                composerImpl.nodeCountOverrides = null;
                composerImpl.providerUpdates = null;
                try {
                    composerImpl.l1(slotReader);
                    C0.a aVar3 = composerImpl.changeListWriter;
                    boolean implicitRootStart = aVar3.getImplicitRootStart();
                    try {
                        aVar3.V(false);
                        composerImpl.O0(c5720g0.c(), c5720g0.getLocals(), c5720g0.getParameter(), true);
                        aVar3.V(implicitRootStart);
                        Unit unit = Unit.f142422a;
                    } catch (Throwable th2) {
                        aVar3.V(implicitRootStart);
                        throw th2;
                    }
                } finally {
                    composerImpl.l1(reader);
                    composerImpl.nodeCountOverrides = iArr;
                    composerImpl.providerUpdates = k10;
                }
            } finally {
                aVar.U(changeList);
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class e extends Lambda implements Function0<Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C5720g0 f49959g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C5720g0 c5720g0) {
            super(0);
            this.f49959g = c5720g0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ComposerImpl.this.O0(this.f49959g.c(), this.f49959g.getLocals(), this.f49959g.getParameter(), true);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C5715e0<Object> f49960f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Object f49961g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C5715e0<Object> c5715e0, Object obj) {
            super(2);
            this.f49960f = c5715e0;
            this.f49961g = obj;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(316014703, i10, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:3386)");
            }
            this.f49960f.a().invoke(this.f49961g, composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    private final int N0(int index) {
        return (-2) - index;
    }

    private final void k0() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.compoundKeyHash = 0;
        this.nodeExpected = false;
        this.changeListWriter.T();
        y1.a(this.invalidateStack);
        l0();
    }

    private final void l0() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final int n0(int group, int recomposeGroup, int recomposeKey) {
        int iRotateLeft;
        int i10 = 3;
        int iRotateLeft2 = 0;
        int i11 = 0;
        while (group >= 0) {
            if (group == recomposeGroup) {
                iRotateLeft = Integer.rotateLeft(recomposeKey, i11);
            } else {
                int iK0 = K0(this.reader, group);
                if (iK0 == 126665345) {
                    iRotateLeft = Integer.rotateLeft(iK0, i11);
                } else {
                    iRotateLeft2 = (iRotateLeft2 ^ Integer.rotateLeft(iK0, i10)) ^ Integer.rotateLeft(this.reader.G(group) ? 0 : V0(group), i11);
                    i10 = (i10 + 6) % 32;
                    i11 = (i11 + 6) % 32;
                    group = this.reader.P(group);
                }
            }
            return iRotateLeft ^ iRotateLeft2;
        }
        return iRotateLeft2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void p1(int r11, java.lang.Object r12, int r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.p1(int, java.lang.Object, int, java.lang.Object):void");
    }

    private final void u1() {
        this.rGroupIndex = 0;
        this.reader = this.slotTable.B();
        q1(100);
        this.parentContext.q();
        this.parentProvider = this.parentContext.f();
        this.providersInvalidStack.h(ComposerKt.q(this.providersInvalid));
        this.providersInvalid = V(this.parentProvider);
        this.providerCache = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation();
        }
        if (!this.sourceMarkersEnabled) {
            this.sourceMarkersEnabled = this.parentContext.getCollectingSourceInformation();
        }
        Set<O0.a> set = (Set) C5744t.b(this.parentProvider, O0.e.a());
        if (set != null) {
            set.add(C());
            this.parentContext.n(set);
        }
        q1(this.parentContext.getCompoundHashKey());
    }

    private final void w0() {
        v0(false);
    }

    @Override // androidx.compose.runtime.Composer
    public void G() {
        this.reusing = false;
    }

    public final void j0() {
        this.providerUpdates = null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean p(boolean parametersChanged, int flags) {
        return ((flags & 1) == 0 && (getInserting() || this.reusing)) || parametersChanged || !j();
    }

    @Override // androidx.compose.runtime.Composer
    public void v() {
        v0(true);
    }

    @Override // androidx.compose.runtime.Composer
    public void y() {
        this.forceRecomposeScopes = true;
        this.sourceMarkersEnabled = true;
        this.slotTable.o();
        this.insertTable.o();
        this.writer.x1();
    }

    private final void A0(boolean isNode, C5753x0 newPending) {
        y1.j(this.pendingStack, this.pending);
        this.pending = newPending;
        this.parentStateStack.h(this.groupNodeCount);
        this.parentStateStack.h(this.rGroupIndex);
        this.parentStateStack.h(this.nodeIndex);
        if (isNode) {
            this.nodeIndex = 0;
        }
        this.groupNodeCount = 0;
        this.rGroupIndex = 0;
    }

    private final void B0(int expectedNodeCount, boolean inserting) {
        C5753x0 c5753x0 = (C5753x0) y1.i(this.pendingStack);
        if (c5753x0 != null && !inserting) {
            c5753x0.l(c5753x0.getGroupIndex() + 1);
        }
        this.pending = c5753x0;
        this.nodeIndex = this.parentStateStack.g() + expectedNodeCount;
        this.rGroupIndex = this.parentStateStack.g();
        this.groupNodeCount = this.parentStateStack.g() + expectedNodeCount;
    }

    private final void C0() {
        this.changeListWriter.o();
        if (!y1.e(this.pendingStack)) {
            ComposerKt.t("Start/end imbalance");
        }
        k0();
    }

    private final void D0() {
        SlotTable slotTable = new SlotTable();
        if (this.sourceMarkersEnabled) {
            slotTable.o();
        }
        if (this.parentContext.d()) {
            slotTable.n();
        }
        this.insertTable = slotTable;
        SlotWriter slotWriterC = slotTable.C();
        slotWriterC.L(true);
        this.writer = slotWriterC;
    }

    private final int D1(int group) {
        int i10;
        if (group >= 0) {
            int[] iArr = this.nodeCountOverrides;
            return (iArr == null || (i10 = iArr[group]) < 0) ? this.reader.N(group) : i10;
        }
        Z.I i11 = this.nodeCountVirtualOverrides;
        if (i11 == null || !i11.a(group)) {
            return 0;
        }
        return i11.c(group);
    }

    private final void E1() {
        if (!this.nodeExpected) {
            ComposerKt.t("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.nodeExpected = false;
    }

    private final void F1() {
        if (this.nodeExpected) {
            ComposerKt.t("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private final void L0(List<Pair<C5720g0, C5720g0>> references) throws Throwable {
        C0.a aVar;
        androidx.compose.runtime.changelist.a aVar2;
        C0.a aVar3;
        androidx.compose.runtime.changelist.a aVar4;
        SlotTable slotTable;
        Anchor anchor;
        SlotReader slotReader;
        Z.K k10;
        C0.a aVar5;
        androidx.compose.runtime.changelist.a aVar6;
        int i10;
        int i11;
        SlotTable slotTable2;
        List<Pair<C5720g0, C5720g0>> list = references;
        C0.a aVar7 = this.changeListWriter;
        androidx.compose.runtime.changelist.a aVar8 = this.lateChanges;
        androidx.compose.runtime.changelist.a changeList = aVar7.getChangeList();
        try {
            aVar7.U(aVar8);
            this.changeListWriter.S();
            int size = list.size();
            int i12 = 0;
            int i13 = 0;
            while (i13 < size) {
                try {
                    Pair<C5720g0, C5720g0> pair = list.get(i13);
                    C5720g0 c5720g0A = pair.a();
                    C5720g0 c5720g0B = pair.b();
                    Anchor anchor2 = c5720g0A.getAnchor();
                    int iF = c5720g0A.getSlotTable().f(anchor2);
                    IntRef intRef = new IntRef(i12, 1, null);
                    this.changeListWriter.e(intRef, anchor2);
                    if (c5720g0B == null) {
                        if (Intrinsics.e(c5720g0A.getSlotTable(), this.insertTable)) {
                            o0();
                        }
                        SlotReader slotReaderB = c5720g0A.getSlotTable().B();
                        try {
                            slotReaderB.Q(iF);
                            this.changeListWriter.A(iF);
                            androidx.compose.runtime.changelist.a aVar9 = new androidx.compose.runtime.changelist.a();
                            Y0(this, null, null, null, null, new d(aVar9, slotReaderB, c5720g0A), 15, null);
                            this.changeListWriter.t(aVar9, intRef);
                            Unit unit = Unit.f142422a;
                            slotReaderB.d();
                            aVar3 = aVar7;
                            aVar4 = changeList;
                            i10 = size;
                            i11 = i13;
                        } finally {
                        }
                    } else {
                        C5718f0 c5718f0M = this.parentContext.m(c5720g0B);
                        if (c5718f0M == null || (slotTable = c5718f0M.getSlotTable()) == null) {
                            slotTable = c5720g0B.getSlotTable();
                        }
                        if (c5718f0M == null || (slotTable2 = c5718f0M.getSlotTable()) == null || (anchor = slotTable2.a(0)) == null) {
                            anchor = c5720g0B.getAnchor();
                        }
                        List<? extends Object> listR = ComposerKt.r(slotTable, anchor);
                        if (!listR.isEmpty()) {
                            this.changeListWriter.b(listR, intRef);
                            if (Intrinsics.e(c5720g0A.getSlotTable(), this.slotTable)) {
                                int iF2 = this.slotTable.f(anchor2);
                                y1(iF2, D1(iF2) + listR.size());
                            }
                        }
                        this.changeListWriter.c(c5718f0M, this.parentContext, c5720g0B, c5720g0A);
                        SlotReader slotReaderB2 = slotTable.B();
                        try {
                            SlotReader reader = getReader();
                            int[] iArr = this.nodeCountOverrides;
                            Z.K k11 = this.providerUpdates;
                            this.nodeCountOverrides = null;
                            this.providerUpdates = null;
                            try {
                                l1(slotReaderB2);
                                int iF3 = slotTable.f(anchor);
                                slotReaderB2.Q(iF3);
                                this.changeListWriter.A(iF3);
                                androidx.compose.runtime.changelist.a aVar10 = new androidx.compose.runtime.changelist.a();
                                C0.a aVar11 = this.changeListWriter;
                                androidx.compose.runtime.changelist.a changeList2 = aVar11.getChangeList();
                                try {
                                    aVar11.U(aVar10);
                                    slotReader = slotReaderB2;
                                    try {
                                        C0.a aVar12 = this.changeListWriter;
                                        i10 = size;
                                        boolean implicitRootStart = aVar12.getImplicitRootStart();
                                        try {
                                            aVar12.V(false);
                                            try {
                                                i11 = i13;
                                                k10 = k11;
                                                aVar3 = aVar7;
                                                aVar5 = aVar11;
                                                aVar4 = changeList;
                                                aVar6 = changeList2;
                                                try {
                                                    X0(c5720g0B.getComposition(), c5720g0A.getComposition(), Integer.valueOf(slotReader.getCurrent()), c5720g0B.d(), new e(c5720g0A));
                                                    try {
                                                        aVar12.V(implicitRootStart);
                                                        try {
                                                            aVar5.U(aVar6);
                                                            this.changeListWriter.t(aVar10, intRef);
                                                            Unit unit2 = Unit.f142422a;
                                                            try {
                                                                l1(reader);
                                                                this.nodeCountOverrides = iArr;
                                                                this.providerUpdates = k10;
                                                                try {
                                                                    slotReader.d();
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    aVar = aVar3;
                                                                    aVar2 = aVar4;
                                                                    aVar.U(aVar2);
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                slotReader.d();
                                                                throw th;
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            l1(reader);
                                                            this.nodeCountOverrides = iArr;
                                                            this.providerUpdates = k10;
                                                            throw th;
                                                        }
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        aVar5.U(aVar6);
                                                        throw th;
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    aVar12.V(implicitRootStart);
                                                    throw th;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                k10 = k11;
                                                aVar6 = changeList2;
                                                aVar5 = aVar11;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            k10 = k11;
                                            aVar5 = aVar11;
                                            aVar6 = changeList2;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        k10 = k11;
                                        aVar5 = aVar11;
                                        aVar6 = changeList2;
                                        aVar5.U(aVar6);
                                        throw th;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    k10 = k11;
                                    slotReader = slotReaderB2;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                k10 = k11;
                                slotReader = slotReaderB2;
                            }
                        } catch (Throwable th12) {
                            th = th12;
                            slotReader = slotReaderB2;
                        }
                    }
                    this.changeListWriter.X();
                    i13 = i11 + 1;
                    list = references;
                    size = i10;
                    aVar7 = aVar3;
                    changeList = aVar4;
                    i12 = 0;
                } catch (Throwable th13) {
                    th = th13;
                    aVar3 = aVar7;
                    aVar4 = changeList;
                }
            }
            C0.a aVar13 = aVar7;
            androidx.compose.runtime.changelist.a aVar14 = changeList;
            this.changeListWriter.h();
            this.changeListWriter.A(0);
            aVar13.U(aVar14);
        } catch (Throwable th14) {
            th = th14;
            aVar = aVar7;
            aVar2 = changeList;
        }
    }

    private final int T0(int groupLocation, int group, int recomposeGroup, int recomposeIndex) {
        int iP = this.reader.P(group);
        while (iP != recomposeGroup && !this.reader.J(iP)) {
            iP = this.reader.P(iP);
        }
        if (this.reader.J(iP)) {
            recomposeIndex = 0;
        }
        if (iP == group) {
            return recomposeIndex;
        }
        int iD1 = (D1(iP) - this.reader.N(group)) + recomposeIndex;
        loop1: while (recomposeIndex < iD1 && iP != groupLocation) {
            iP++;
            while (iP < groupLocation) {
                int iE = this.reader.E(iP) + iP;
                if (groupLocation >= iE) {
                    recomposeIndex += this.reader.J(iP) ? 1 : D1(iP);
                    iP = iE;
                }
            }
            break loop1;
        }
        return recomposeIndex;
    }

    private final int V0(int group) {
        int iP = this.reader.P(group) + 1;
        int i10 = 0;
        while (iP < group) {
            if (!this.reader.G(iP)) {
                i10++;
            }
            iP += this.reader.E(iP);
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #0 {all -> 0x0029, blocks: (B:3:0x0005, B:5:0x0013, B:7:0x0025, B:11:0x002f, B:10:0x002b, B:14:0x0036, B:16:0x003c, B:18:0x0042), top: B:23:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final <R> R X0(androidx.compose.runtime.InterfaceC5756z r7, androidx.compose.runtime.InterfaceC5756z r8, java.lang.Integer r9, java.util.List<? extends kotlin.Pair<androidx.compose.runtime.I0, ? extends java.lang.Object>> r10, kotlin.jvm.functions.Function0<? extends R> r11) {
        /*
            r6 = this;
            boolean r0 = r6.isComposing
            int r1 = r6.nodeIndex
            r2 = 1
            r6.isComposing = r2     // Catch: java.lang.Throwable -> L29
            r2 = 0
            r6.nodeIndex = r2     // Catch: java.lang.Throwable -> L29
            r3 = r10
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> L29
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L29
        L11:
            if (r2 >= r3) goto L32
            java.lang.Object r4 = r10.get(r2)     // Catch: java.lang.Throwable -> L29
            kotlin.Pair r4 = (kotlin.Pair) r4     // Catch: java.lang.Throwable -> L29
            java.lang.Object r5 = r4.a()     // Catch: java.lang.Throwable -> L29
            androidx.compose.runtime.I0 r5 = (androidx.compose.runtime.I0) r5     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> L29
            if (r4 == 0) goto L2b
            r6.v1(r5, r4)     // Catch: java.lang.Throwable -> L29
            goto L2f
        L29:
            r7 = move-exception
            goto L4b
        L2b:
            r4 = 0
            r6.v1(r5, r4)     // Catch: java.lang.Throwable -> L29
        L2f:
            int r2 = r2 + 1
            goto L11
        L32:
            if (r7 == 0) goto L42
            if (r9 == 0) goto L3b
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L29
            goto L3c
        L3b:
            r9 = -1
        L3c:
            java.lang.Object r7 = r7.g(r8, r9, r11)     // Catch: java.lang.Throwable -> L29
            if (r7 != 0) goto L46
        L42:
            java.lang.Object r7 = r11.invoke()     // Catch: java.lang.Throwable -> L29
        L46:
            r6.isComposing = r0
            r6.nodeIndex = r1
            return r7
        L4b:
            r6.isComposing = r0
            r6.nodeIndex = r1
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.X0(androidx.compose.runtime.z, androidx.compose.runtime.z, java.lang.Integer, java.util.List, kotlin.jvm.functions.Function0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object Y0(ComposerImpl composerImpl, InterfaceC5756z interfaceC5756z, InterfaceC5756z interfaceC5756z2, Integer num, List list, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC5756z = null;
        }
        if ((i10 & 2) != 0) {
            interfaceC5756z2 = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            list = CollectionsKt.m();
        }
        return composerImpl.X0(interfaceC5756z, interfaceC5756z2, num, list, function0);
    }

    private final void Z0() {
        boolean z10 = this.isComposing;
        this.isComposing = true;
        int parent = this.reader.getParent();
        int iE = this.reader.E(parent) + parent;
        int i10 = this.nodeIndex;
        int compoundKeyHash = getCompoundKeyHash();
        int i11 = this.groupNodeCount;
        int i12 = this.rGroupIndex;
        S sB = ComposerKt.B(this.invalidations, this.reader.getCurrent(), iE);
        int i13 = parent;
        boolean z11 = false;
        while (sB != null) {
            int location = sB.getLocation();
            ComposerKt.R(this.invalidations, location);
            if (sB.d()) {
                this.reader.Q(location);
                int current = this.reader.getCurrent();
                d1(i13, current, parent);
                this.nodeIndex = T0(location, current, parent, i10);
                this.rGroupIndex = V0(current);
                this.compoundKeyHash = n0(this.reader.P(current), parent, compoundKeyHash);
                this.providerCache = null;
                boolean z12 = !this.reusing && sB.getScope().r();
                if (z12) {
                    this.reusing = true;
                }
                sB.getScope().g(this);
                if (z12) {
                    this.reusing = false;
                }
                this.providerCache = null;
                this.reader.R(parent);
                i13 = current;
                z11 = true;
            } else {
                y1.j(this.invalidateStack, sB.getScope());
                sB.getScope().B();
                y1.i(this.invalidateStack);
            }
            sB = ComposerKt.B(this.invalidations, this.reader.getCurrent(), iE);
        }
        if (z11) {
            d1(i13, parent, parent);
            this.reader.T();
            int iD1 = D1(parent);
            this.nodeIndex = i10 + iD1;
            this.groupNodeCount = i11 + iD1;
            this.rGroupIndex = i12;
        } else {
            o1();
        }
        this.compoundKeyHash = compoundKeyHash;
        this.isComposing = z10;
    }

    private final void a1() {
        g1(this.reader.getCurrent());
        this.changeListWriter.Q();
    }

    private final void b1(Anchor anchor) {
        if (this.insertFixups.e()) {
            this.changeListWriter.u(anchor, this.insertTable);
        } else {
            this.changeListWriter.v(anchor, this.insertTable, this.insertFixups);
            this.insertFixups = new androidx.compose.runtime.changelist.b();
        }
    }

    private final void c1(InterfaceC5755y0 providers) {
        Z.K<InterfaceC5755y0> k10 = this.providerUpdates;
        if (k10 == null) {
            k10 = new Z.K<>(0, 1, null);
            this.providerUpdates = k10;
        }
        k10.r(this.reader.getCurrent(), providers);
    }

    private final void d1(int oldGroup, int newGroup, int commonRoot) {
        SlotReader slotReader = this.reader;
        int iO = ComposerKt.O(slotReader, oldGroup, newGroup, commonRoot);
        while (oldGroup > 0 && oldGroup != iO) {
            if (slotReader.J(oldGroup)) {
                this.changeListWriter.B();
            }
            oldGroup = slotReader.P(oldGroup);
        }
        u0(newGroup, iO);
    }

    private final void f1() {
        if (this.slotTable.p()) {
            InterfaceC5756z composition = getComposition();
            Intrinsics.h(composition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            ((C5733n) composition).N();
            androidx.compose.runtime.changelist.a aVar = new androidx.compose.runtime.changelist.a();
            this.deferredChanges = aVar;
            SlotReader slotReaderB = this.slotTable.B();
            try {
                this.reader = slotReaderB;
                C0.a aVar2 = this.changeListWriter;
                androidx.compose.runtime.changelist.a changeList = aVar2.getChangeList();
                try {
                    aVar2.U(aVar);
                    g1(0);
                    this.changeListWriter.N();
                    aVar2.U(changeList);
                    Unit unit = Unit.f142422a;
                } catch (Throwable th2) {
                    aVar2.U(changeList);
                    throw th2;
                }
            } finally {
                slotReaderB.d();
            }
        }
    }

    private final void g1(int groupBeingRemoved) {
        boolean zJ = this.reader.J(groupBeingRemoved);
        if (zJ) {
            this.changeListWriter.i();
            this.changeListWriter.x(this.reader.L(groupBeingRemoved));
        }
        k1(this, groupBeingRemoved, groupBeingRemoved, zJ, 0);
        this.changeListWriter.i();
        if (zJ) {
            this.changeListWriter.B();
        }
    }

    private static final C5720g0 h1(ComposerImpl composerImpl, int i10, List<C5720g0> list) {
        Object objD = composerImpl.reader.D(i10);
        Intrinsics.h(objD, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        C5715e0 c5715e0 = (C5715e0) objD;
        Object objB = composerImpl.reader.B(i10, 0);
        Anchor anchorA = composerImpl.reader.a(i10);
        List listY = ComposerKt.y(composerImpl.invalidations, i10, composerImpl.reader.E(i10) + i10);
        ArrayList arrayList = new ArrayList(listY.size());
        int size = listY.size();
        for (int i11 = 0; i11 < size; i11++) {
            S s10 = (S) listY.get(i11);
            arrayList.add(TuplesKt.a(s10.getScope(), s10.getInstances()));
        }
        return new C5720g0(c5715e0, objB, composerImpl.getComposition(), composerImpl.slotTable, anchorA, arrayList, composerImpl.q0(i10), list);
    }

    private static final C5720g0 i1(ComposerImpl composerImpl, int i10) {
        int iC = composerImpl.reader.C(i10);
        Object objD = composerImpl.reader.D(i10);
        ArrayList arrayList = null;
        if (iC != 126665345 || !(objD instanceof C5715e0)) {
            return null;
        }
        if (composerImpl.reader.e(i10)) {
            ArrayList arrayList2 = new ArrayList();
            j1(composerImpl, arrayList2, i10);
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return h1(composerImpl, i10, arrayList);
    }

    private static final void j1(ComposerImpl composerImpl, List<C5720g0> list, int i10) {
        int iE = composerImpl.reader.E(i10) + i10;
        int iE2 = i10 + 1;
        while (iE2 < iE) {
            if (composerImpl.reader.F(iE2)) {
                C5720g0 c5720g0I1 = i1(composerImpl, iE2);
                if (c5720g0I1 != null) {
                    list.add(c5720g0I1);
                }
            } else if (composerImpl.reader.e(iE2)) {
                j1(composerImpl, list, iE2);
            }
            iE2 += composerImpl.reader.E(iE2);
        }
    }

    private static final int k1(ComposerImpl composerImpl, int i10, int i11, boolean z10, int i12) {
        SlotReader slotReader = composerImpl.reader;
        if (!slotReader.F(i11)) {
            if (!slotReader.e(i11)) {
                if (slotReader.J(i11)) {
                    return 1;
                }
                return slotReader.N(i11);
            }
            int iE = slotReader.E(i11) + i11;
            int iK1 = 0;
            for (int iE2 = i11 + 1; iE2 < iE; iE2 += slotReader.E(iE2)) {
                boolean zJ = slotReader.J(iE2);
                if (zJ) {
                    composerImpl.changeListWriter.i();
                    composerImpl.changeListWriter.x(slotReader.L(iE2));
                }
                iK1 += k1(composerImpl, i10, iE2, zJ || z10, zJ ? 0 : i12 + iK1);
                if (zJ) {
                    composerImpl.changeListWriter.i();
                    composerImpl.changeListWriter.B();
                }
            }
            if (slotReader.J(i11)) {
                return 1;
            }
            return iK1;
        }
        int iC = slotReader.C(i11);
        Object objD = slotReader.D(i11);
        if (iC == 126665345 && (objD instanceof C5715e0)) {
            C5720g0 c5720g0I1 = i1(composerImpl, i11);
            if (c5720g0I1 != null) {
                composerImpl.parentContext.b(c5720g0I1);
                composerImpl.changeListWriter.M();
                composerImpl.changeListWriter.O(composerImpl.getComposition(), composerImpl.parentContext, c5720g0I1);
            }
            if (!z10 || i11 == i10) {
                return slotReader.N(i11);
            }
            composerImpl.changeListWriter.j(i12, i11);
            return 0;
        }
        if (iC != 206 || !Intrinsics.e(objD, ComposerKt.I())) {
            if (slotReader.J(i11)) {
                return 1;
            }
            return slotReader.N(i11);
        }
        Object objB = slotReader.B(i11, 0);
        a aVar = objB instanceof a ? (a) objB : null;
        if (aVar != null) {
            for (ComposerImpl composerImpl2 : aVar.getRef().u()) {
                composerImpl2.f1();
                composerImpl.parentContext.p(composerImpl2.getComposition());
            }
        }
        return slotReader.N(i11);
    }

    private final void n1() {
        this.groupNodeCount += this.reader.S();
    }

    private final void o0() {
        if (!this.writer.getClosed()) {
            ComposerKt.t("Check failed");
        }
        D0();
    }

    private final void o1() {
        this.groupNodeCount = this.reader.v();
        this.reader.T();
    }

    private final InterfaceC5755y0 p0() {
        InterfaceC5755y0 interfaceC5755y0 = this.providerCache;
        return interfaceC5755y0 != null ? interfaceC5755y0 : q0(this.reader.getParent());
    }

    private final void q1(int key) {
        p1(key, null, O.INSTANCE.a(), null);
    }

    private final void r1(int key, Object dataKey) {
        p1(key, dataKey, O.INSTANCE.a(), null);
    }

    private final void s1(boolean isNode, Object data) {
        if (isNode) {
            this.reader.V();
            return;
        }
        if (data != null && this.reader.l() != data) {
            this.changeListWriter.b0(data);
        }
        this.reader.U();
    }

    private final void t0(Z.W<Object, Object> invalidationsRequested, Function2<? super Composer, ? super Integer, Unit> content) {
        if (this.isComposing) {
            ComposerKt.t("Reentrant composition is not supported");
        }
        J0.o oVar = J0.o.f14530a;
        Object objA = oVar.a("Compose:recompose");
        try {
            this.compositionToken = Long.hashCode(androidx.compose.runtime.snapshots.j.I().getSnapshotId());
            this.providerUpdates = null;
            x1(invalidationsRequested);
            this.nodeIndex = 0;
            this.isComposing = true;
            try {
                u1();
                Object objQ0 = Q0();
                if (objQ0 != content && content != null) {
                    C1(content);
                }
                c cVar = this.derivedStateObserver;
                D0.c<C> cVarC = o1.c();
                try {
                    cVarC.c(cVar);
                    if (content != null) {
                        r1(HttpResponseStatus.SUCCESS_OK, ComposerKt.D());
                        J0.q.b(this, content);
                        w0();
                    } else if ((!this.forciblyRecompose && !this.providersInvalid) || objQ0 == null || Intrinsics.e(objQ0, Composer.INSTANCE.a())) {
                        m1();
                    } else {
                        r1(HttpResponseStatus.SUCCESS_OK, ComposerKt.D());
                        J0.q.b(this, (Function2) TypeIntrinsics.f(objQ0, 2));
                        w0();
                    }
                    cVarC.u(cVarC.getSize() - 1);
                    y0();
                    this.isComposing = false;
                    this.invalidations.clear();
                    o0();
                    Unit unit = Unit.f142422a;
                    oVar.b(objA);
                } catch (Throwable th2) {
                    cVarC.u(cVarC.getSize() - 1);
                    throw th2;
                }
            } catch (Throwable th3) {
                this.isComposing = false;
                this.invalidations.clear();
                X();
                o0();
                throw th3;
            }
        } catch (Throwable th4) {
            J0.o.f14530a.b(objA);
            throw th4;
        }
    }

    private final void u0(int group, int nearestCommonRoot) {
        if (group <= 0 || group == nearestCommonRoot) {
            return;
        }
        u0(this.reader.P(group), nearestCommonRoot);
        if (this.reader.J(group)) {
            this.changeListWriter.x(S0(this.reader, group));
        }
    }

    private final void v0(boolean isNode) {
        int iHashCode;
        int iW;
        List<V> list;
        List<V> list2;
        int iHashCode2;
        int iE = this.parentStateStack.e() - 1;
        if (getInserting()) {
            int parent = this.writer.getParent();
            int iGroupKey = this.writer.groupKey(parent);
            Object objGroupObjectKey = this.writer.groupObjectKey(parent);
            Object objJ0 = this.writer.j0(parent);
            if (objGroupObjectKey != null) {
                iHashCode2 = Integer.hashCode(objGroupObjectKey instanceof Enum ? ((Enum) objGroupObjectKey).ordinal() : objGroupObjectKey.hashCode()) ^ Integer.rotateRight(getCompoundKeyHash(), 3);
            } else if (objJ0 == null || iGroupKey != 207 || Intrinsics.e(objJ0, Composer.INSTANCE.a())) {
                iHashCode2 = Integer.rotateRight(iE ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(iGroupKey);
            } else {
                this.compoundKeyHash = Integer.rotateRight(Integer.rotateRight(iE ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(objJ0.hashCode()), 3);
            }
            this.compoundKeyHash = Integer.rotateRight(iHashCode2, 3);
        } else {
            int parent2 = this.reader.getParent();
            int iC = this.reader.C(parent2);
            Object objD = this.reader.D(parent2);
            Object objZ = this.reader.z(parent2);
            if (objD != null) {
                iHashCode = Integer.hashCode(objD instanceof Enum ? ((Enum) objD).ordinal() : objD.hashCode()) ^ Integer.rotateRight(getCompoundKeyHash(), 3);
            } else if (objZ == null || iC != 207 || Intrinsics.e(objZ, Composer.INSTANCE.a())) {
                iHashCode = Integer.rotateRight(iE ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(iC);
            } else {
                this.compoundKeyHash = Integer.rotateRight(Integer.rotateRight(iE ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(objZ.hashCode()), 3);
            }
            this.compoundKeyHash = Integer.rotateRight(iHashCode, 3);
        }
        int i10 = this.groupNodeCount;
        C5753x0 c5753x0 = this.pending;
        if (c5753x0 != null && c5753x0.b().size() > 0) {
            List<V> listB = c5753x0.b();
            List<V> listF = c5753x0.f();
            Set setE = M0.a.e(listF);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = listF.size();
            int size2 = listB.size();
            int i11 = 0;
            int i12 = 0;
            int iO = 0;
            while (i11 < size2) {
                V v10 = listB.get(i11);
                if (setE.contains(v10)) {
                    list = listB;
                    if (!linkedHashSet.contains(v10)) {
                        if (i12 < size) {
                            V v11 = listF.get(i12);
                            if (v11 != v10) {
                                int iG = c5753x0.g(v11);
                                linkedHashSet.add(v11);
                                if (iG != iO) {
                                    int iO2 = c5753x0.o(v11);
                                    list2 = listF;
                                    this.changeListWriter.y(c5753x0.getStartIndex() + iG, iO + c5753x0.getStartIndex(), iO2);
                                    c5753x0.j(iG, iO, iO2);
                                } else {
                                    list2 = listF;
                                }
                            } else {
                                list2 = listF;
                                i11++;
                            }
                            i12++;
                            iO += c5753x0.o(v11);
                            listB = list;
                            listF = list2;
                        }
                    }
                    listB = list;
                } else {
                    this.changeListWriter.R(c5753x0.g(v10) + c5753x0.getStartIndex(), v10.getNodes());
                    c5753x0.n(v10.getLocation(), 0);
                    this.changeListWriter.z(v10.getLocation());
                    this.reader.Q(v10.getLocation());
                    a1();
                    this.reader.S();
                    list = listB;
                    ComposerKt.S(this.invalidations, v10.getLocation(), v10.getLocation() + this.reader.E(v10.getLocation()));
                }
                i11++;
                listB = list;
            }
            this.changeListWriter.i();
            if (listB.size() > 0) {
                this.changeListWriter.z(this.reader.m());
                this.reader.T();
            }
        }
        boolean inserting = getInserting();
        if (!inserting && (iW = this.reader.w()) > 0) {
            this.changeListWriter.Z(iW);
        }
        int i13 = this.nodeIndex;
        while (!this.reader.H()) {
            int current = this.reader.getCurrent();
            a1();
            this.changeListWriter.R(i13, this.reader.S());
            ComposerKt.S(this.invalidations, current, this.reader.getCurrent());
        }
        if (inserting) {
            if (isNode) {
                this.insertFixups.c();
                i10 = 1;
            }
            this.reader.f();
            int parent3 = this.writer.getParent();
            this.writer.T();
            if (!this.reader.t()) {
                int iN0 = N0(parent3);
                this.writer.U();
                this.writer.L(true);
                b1(this.insertAnchor);
                this.inserting = false;
                if (!this.slotTable.isEmpty()) {
                    y1(iN0, 0);
                    z1(iN0, i10);
                }
            }
        } else {
            if (isNode) {
                this.changeListWriter.B();
            }
            this.changeListWriter.g();
            int parent4 = this.reader.getParent();
            if (i10 != D1(parent4)) {
                z1(parent4, i10);
            }
            if (isNode) {
                i10 = 1;
            }
            this.reader.g();
            this.changeListWriter.i();
        }
        B0(i10, inserting);
    }

    private final void z0() {
        if (this.writer.getClosed()) {
            SlotWriter slotWriterC = this.insertTable.C();
            this.writer = slotWriterC;
            slotWriterC.Z0();
            this.writerHasAProvider = false;
            this.providerCache = null;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void A() {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        v0(false);
    }

    @Override // androidx.compose.runtime.Composer
    public O0.a C() {
        O0.a aVar = this._compositionData;
        if (aVar != null) {
            return aVar;
        }
        C5731m c5731m = new C5731m(getComposition());
        this._compositionData = c5731m;
        return c5731m;
    }

    @Override // androidx.compose.runtime.Composer
    public void E() {
        p1(-127, null, O.INSTANCE.a(), null);
    }

    public final boolean E0() {
        return this.childrenComposing > 0;
    }

    @Override // androidx.compose.runtime.Composer
    public void F() {
        p1(125, null, O.INSTANCE.c(), null);
        this.nodeExpected = true;
    }

    /* renamed from: F0, reason: from getter */
    public InterfaceC5756z getComposition() {
        return this.composition;
    }

    public final I0 G0() {
        ArrayList arrayList = this.invalidateStack;
        if (this.childrenComposing == 0 && y1.f(arrayList)) {
            return (I0) y1.g(arrayList);
        }
        return null;
    }

    /* renamed from: H0, reason: from getter */
    public final androidx.compose.runtime.changelist.a getDeferredChanges() {
        return this.deferredChanges;
    }

    /* renamed from: J0, reason: from getter */
    public final SlotReader getReader() {
        return this.reader;
    }

    @Override // androidx.compose.runtime.Composer
    public void K() {
        if (!(this.groupNodeCount == 0)) {
            ComposerKt.t("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (getInserting()) {
            return;
        }
        I0 i0G0 = G0();
        if (i0G0 != null) {
            i0G0.C();
        }
        if (this.invalidations.isEmpty()) {
            o1();
        } else {
            Z0();
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void O(H0 scope) {
        I0 i02 = scope instanceof I0 ? (I0) scope : null;
        if (i02 == null) {
            return;
        }
        i02.M(true);
    }

    /* renamed from: P0, reason: from getter */
    public final boolean getIsComposing() {
        return this.isComposing;
    }

    @Override // androidx.compose.runtime.Composer
    /* renamed from: Q, reason: from getter */
    public int getCompoundKeyHash() {
        return this.compoundKeyHash;
    }

    @Override // androidx.compose.runtime.Composer
    public AbstractC5727k R() {
        r1(HttpResponseStatus.SUCCESS_PARTIAL_CONTENT, ComposerKt.I());
        if (getInserting()) {
            SlotWriter.v0(this.writer, 0, 1, null);
        }
        Object objQ0 = Q0();
        a aVar = objQ0 instanceof a ? (a) objQ0 : null;
        if (aVar == null) {
            int compoundKeyHash = getCompoundKeyHash();
            boolean z10 = this.forceRecomposeScopes;
            boolean z11 = this.sourceMarkersEnabled;
            InterfaceC5756z composition = getComposition();
            C5733n c5733n = composition instanceof C5733n ? (C5733n) composition : null;
            aVar = new a(new b(compoundKeyHash, z10, z11, c5733n != null ? c5733n.getObserverHolder() : null));
            C1(aVar);
        }
        aVar.getRef().x(p0());
        w0();
        return aVar.getRef();
    }

    public final void U0(Function0<Unit> block) {
        if (this.isComposing) {
            ComposerKt.t("Preparing a composition while composing is not supported");
        }
        this.isComposing = true;
        try {
            block.invoke();
        } finally {
            this.isComposing = false;
        }
    }

    public final boolean W0(Z.W<Object, Object> invalidationsRequested, U0 shouldPause) {
        if (!this.changes.c()) {
            ComposerKt.t("Expected applyChanges() to have been called");
        }
        if (D0.g.f(invalidationsRequested) <= 0 && this.invalidations.isEmpty() && !this.forciblyRecompose) {
            return false;
        }
        t0(invalidationsRequested, null);
        return this.changes.d();
    }

    @Override // androidx.compose.runtime.Composer
    public void c() {
        this.reusing = this.reusingGroup >= 0;
    }

    @Override // androidx.compose.runtime.Composer
    /* renamed from: h, reason: from getter */
    public boolean getInserting() {
        return this.inserting;
    }

    @Override // androidx.compose.runtime.Composer
    public void i(boolean changed) {
        if (!(this.groupNodeCount == 0)) {
            ComposerKt.t("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (getInserting()) {
            return;
        }
        if (!changed) {
            o1();
            return;
        }
        int current = this.reader.getCurrent();
        int end = this.reader.getEnd();
        this.changeListWriter.d();
        ComposerKt.S(this.invalidations, current, end);
        this.reader.T();
    }

    @Override // androidx.compose.runtime.Composer
    public Applier<?> k() {
        return this.applier;
    }

    @Override // androidx.compose.runtime.Composer
    public T0 l() {
        Anchor anchorA;
        I0 i02 = null;
        I0 i03 = y1.f(this.invalidateStack) ? (I0) y1.i(this.invalidateStack) : null;
        if (i03 != null) {
            i03.I(false);
            Function1<InterfaceC5725j, Unit> function1H = i03.h(this.compositionToken);
            if (function1H != null) {
                this.changeListWriter.f(function1H, getComposition());
            }
            if (i03.q()) {
                i03.K(false);
                this.changeListWriter.k(i03);
            }
        }
        if (i03 != null && !i03.s() && (i03.t() || this.forceRecomposeScopes)) {
            if (i03.getAnchor() == null) {
                if (getInserting()) {
                    SlotWriter slotWriter = this.writer;
                    anchorA = slotWriter.D(slotWriter.getParent());
                } else {
                    SlotReader slotReader = this.reader;
                    anchorA = slotReader.a(slotReader.getParent());
                }
                i03.D(anchorA);
            }
            i03.F(false);
            i02 = i03;
        }
        v0(false);
        return i02;
    }

    public final void l1(SlotReader slotReader) {
        this.reader = slotReader;
    }

    @Override // androidx.compose.runtime.Composer
    public void m() {
        p1(125, null, O.INSTANCE.b(), null);
        this.nodeExpected = true;
    }

    public final void m0(Z.W<Object, Object> invalidationsRequested, Function2<? super Composer, ? super Integer, Unit> content, U0 shouldPause) {
        if (!this.changes.c()) {
            ComposerKt.t("Expected applyChanges() to have been called");
        }
        t0(invalidationsRequested, content);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1() {
        /*
            r9 = this;
            java.util.List<androidx.compose.runtime.S> r0 = r9.invalidations
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc
            r9.n1()
            return
        Lc:
            androidx.compose.runtime.W0 r0 = r9.reader
            int r1 = r0.n()
            java.lang.Object r2 = r0.o()
            java.lang.Object r3 = r0.l()
            int r4 = r9.rGroupIndex
            r5 = 207(0xcf, float:2.9E-43)
            r6 = 3
            if (r2 != 0) goto L57
            if (r3 == 0) goto L46
            if (r1 != r5) goto L46
            androidx.compose.runtime.Composer$a r7 = androidx.compose.runtime.Composer.INSTANCE
            java.lang.Object r7 = r7.a()
            boolean r7 = kotlin.jvm.internal.Intrinsics.e(r3, r7)
            if (r7 != 0) goto L46
            int r7 = r3.hashCode()
            int r8 = r9.getCompoundKeyHash()
            int r8 = java.lang.Integer.rotateLeft(r8, r6)
            r7 = r7 ^ r8
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            r7 = r7 ^ r4
            r9.compoundKeyHash = r7
            goto L75
        L46:
            int r7 = r9.getCompoundKeyHash()
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            r7 = r7 ^ r1
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            r7 = r7 ^ r4
        L54:
            r9.compoundKeyHash = r7
            goto L75
        L57:
            boolean r7 = r2 instanceof java.lang.Enum
            if (r7 == 0) goto L70
            r7 = r2
            java.lang.Enum r7 = (java.lang.Enum) r7
            int r7 = r7.ordinal()
        L62:
            int r8 = r9.getCompoundKeyHash()
            int r8 = java.lang.Integer.rotateLeft(r8, r6)
            r7 = r7 ^ r8
            int r7 = java.lang.Integer.rotateLeft(r7, r6)
            goto L54
        L70:
            int r7 = r2.hashCode()
            goto L62
        L75:
            boolean r7 = r0.I()
            r8 = 0
            r9.s1(r7, r8)
            r9.Z0()
            r0.g()
            if (r2 != 0) goto Lc3
            if (r3 == 0) goto Lae
            if (r1 != r5) goto Lae
            androidx.compose.runtime.Composer$a r0 = androidx.compose.runtime.Composer.INSTANCE
            java.lang.Object r0 = r0.a()
            boolean r0 = kotlin.jvm.internal.Intrinsics.e(r3, r0)
            if (r0 != 0) goto Lae
            int r0 = r3.hashCode()
            int r1 = r9.getCompoundKeyHash()
            r1 = r1 ^ r4
            int r1 = java.lang.Integer.rotateRight(r1, r6)
            int r0 = java.lang.Integer.hashCode(r0)
            r0 = r0 ^ r1
            int r0 = java.lang.Integer.rotateRight(r0, r6)
            r9.compoundKeyHash = r0
            return
        Lae:
            int r0 = r9.getCompoundKeyHash()
            r0 = r0 ^ r4
            int r0 = java.lang.Integer.rotateRight(r0, r6)
            int r1 = java.lang.Integer.hashCode(r1)
            r0 = r0 ^ r1
            int r0 = java.lang.Integer.rotateRight(r0, r6)
            r9.compoundKeyHash = r0
            return
        Lc3:
            boolean r0 = r2 instanceof java.lang.Enum
            if (r0 == 0) goto Le1
            java.lang.Enum r2 = (java.lang.Enum) r2
            int r0 = r2.ordinal()
            int r1 = r9.getCompoundKeyHash()
            int r1 = java.lang.Integer.rotateRight(r1, r6)
            int r0 = java.lang.Integer.hashCode(r0)
            r0 = r0 ^ r1
            int r0 = java.lang.Integer.rotateRight(r0, r6)
            r9.compoundKeyHash = r0
            return
        Le1:
            int r0 = r2.hashCode()
            int r1 = r9.getCompoundKeyHash()
            int r1 = java.lang.Integer.rotateRight(r1, r6)
            int r0 = java.lang.Integer.hashCode(r0)
            r0 = r0 ^ r1
            int r0 = java.lang.Integer.rotateRight(r0, r6)
            r9.compoundKeyHash = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.m1():void");
    }

    @Override // androidx.compose.runtime.Composer
    public CoroutineContext q() {
        return this.parentContext.getEffectCoroutineContext();
    }

    public final void r0() {
        y1.a(this.invalidateStack);
        this.invalidations.clear();
        this.changes.a();
        this.providerUpdates = null;
    }

    public final void s0() {
        J0.o oVar = J0.o.f14530a;
        Object objA = oVar.a("Compose:Composer.dispose");
        try {
            this.parentContext.r(this);
            r0();
            k().clear();
            this.isDisposed = true;
            Unit unit = Unit.f142422a;
            oVar.b(objA);
        } catch (Throwable th2) {
            J0.o.f14530a.b(objA);
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void startMovableGroup(int key, Object dataKey) {
        p1(key, dataKey, O.INSTANCE.a(), null);
    }

    @Override // androidx.compose.runtime.Composer
    public void startReplaceGroup(int key) {
        if (this.pending != null) {
            p1(key, null, O.INSTANCE.a(), null);
            return;
        }
        F1();
        this.compoundKeyHash = this.rGroupIndex ^ Integer.rotateLeft(Integer.rotateLeft(getCompoundKeyHash(), 3) ^ key, 3);
        this.rGroupIndex++;
        SlotReader slotReader = this.reader;
        if (getInserting()) {
            slotReader.c();
            this.writer.j1(key, Composer.INSTANCE.a());
            A0(false, null);
            return;
        }
        if (slotReader.n() == key && !slotReader.s()) {
            slotReader.U();
            A0(false, null);
            return;
        }
        if (!slotReader.H()) {
            int i10 = this.nodeIndex;
            int current = slotReader.getCurrent();
            a1();
            this.changeListWriter.R(i10, slotReader.S());
            ComposerKt.S(this.invalidations, current, slotReader.getCurrent());
        }
        slotReader.c();
        this.inserting = true;
        this.providerCache = null;
        z0();
        SlotWriter slotWriter = this.writer;
        slotWriter.H();
        int currentGroup = slotWriter.getCurrentGroup();
        slotWriter.j1(key, Composer.INSTANCE.a());
        this.insertAnchor = slotWriter.D(currentGroup);
        A0(false, null);
    }

    @Override // androidx.compose.runtime.Composer
    public void startReplaceableGroup(int key) {
        p1(key, null, O.INSTANCE.a(), null);
    }

    public final void t1() {
        this.reusingGroup = 100;
        this.reusing = true;
    }

    @PublishedApi
    public final void w1(Object value) {
        if (value instanceof N0) {
            O0 o02 = new O0((N0) value, e1());
            if (getInserting()) {
                this.changeListWriter.P(o02);
            }
            this.abandonSet.add(value);
            value = o02;
        }
        C1(value);
    }

    @Override // androidx.compose.runtime.Composer
    public void x(Function0<Unit> effect) {
        this.changeListWriter.W(effect);
    }

    public final void x0() {
        if (!(!this.isComposing && this.reusingGroup == 100)) {
            C5757z0.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.reusingGroup = -1;
        this.reusing = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x1(Z.W<java.lang.Object, java.lang.Object> r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.Object[] r2 = r1.keys
            java.lang.Object[] r3 = r1.values
            long[] r1 = r1.metadata
            int r4 = r1.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L67
            r6 = 0
        L10:
            r7 = r1[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L62
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
        L2a:
            if (r11 >= r9) goto L60
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L5c
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r2[r12]
            r12 = r3[r12]
            java.lang.String r14 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            kotlin.jvm.internal.Intrinsics.h(r13, r14)
            androidx.compose.runtime.I0 r13 = (androidx.compose.runtime.I0) r13
            androidx.compose.runtime.Anchor r14 = r13.getAnchor()
            if (r14 == 0) goto L5c
            int r14 = r14.getLocation()
            java.util.List<androidx.compose.runtime.S> r15 = r0.invalidations
            androidx.compose.runtime.S0 r5 = androidx.compose.runtime.S0.f50116a
            if (r12 != r5) goto L54
            r12 = 0
        L54:
            androidx.compose.runtime.S r5 = new androidx.compose.runtime.S
            r5.<init>(r13, r14, r12)
            r15.add(r5)
        L5c:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L2a
        L60:
            if (r9 != r10) goto L67
        L62:
            if (r6 == r4) goto L67
            int r6 = r6 + 1
            goto L10
        L67:
            java.util.List<androidx.compose.runtime.S> r1 = r0.invalidations
            java.util.Comparator r2 = androidx.compose.runtime.ComposerKt.h()
            kotlin.collections.CollectionsKt.B(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.x1(Z.W):void");
    }

    public ComposerImpl(Applier<?> applier, AbstractC5727k abstractC5727k, SlotTable slotTable, Set<N0> set, androidx.compose.runtime.changelist.a aVar, androidx.compose.runtime.changelist.a aVar2, InterfaceC5756z interfaceC5756z) {
        boolean z10;
        this.applier = applier;
        this.parentContext = abstractC5727k;
        this.slotTable = slotTable;
        this.abandonSet = set;
        this.changes = aVar;
        this.lateChanges = aVar2;
        this.composition = interfaceC5756z;
        if (!abstractC5727k.getCollectingSourceInformation() && !abstractC5727k.d()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.sourceMarkersEnabled = z10;
        this.derivedStateObserver = new c();
        this.invalidateStack = y1.c(null, 1, null);
        SlotReader slotReaderB = slotTable.B();
        slotReaderB.d();
        this.reader = slotReaderB;
        SlotTable slotTable2 = new SlotTable();
        if (abstractC5727k.getCollectingSourceInformation()) {
            slotTable2.o();
        }
        if (abstractC5727k.d()) {
            slotTable2.n();
        }
        this.insertTable = slotTable2;
        SlotWriter slotWriterC = slotTable2.C();
        slotWriterC.L(true);
        this.writer = slotWriterC;
        this.changeListWriter = new C0.a(this, this.changes);
        SlotReader slotReaderB2 = this.insertTable.B();
        try {
            Anchor anchorA = slotReaderB2.a(0);
            slotReaderB2.d();
            this.insertAnchor = anchorA;
            this.insertFixups = new androidx.compose.runtime.changelist.b();
        } catch (Throwable th2) {
            slotReaderB2.d();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.runtime.y0, java.lang.Object] */
    private final InterfaceC5755y0 A1(InterfaceC5755y0 parentScope, InterfaceC5755y0 currentProviders) {
        f.a<AbstractC5737p<Object>, E1<Object>> aVarBuilder2 = parentScope.builder2();
        aVarBuilder2.putAll(currentProviders);
        ?? Build2 = aVarBuilder2.build2();
        r1(HttpResponseStatus.SUCCESS_NO_CONTENT, ComposerKt.H());
        B1(Build2);
        B1(currentProviders);
        w0();
        return Build2;
    }

    private final void B1(Object value) {
        Q0();
        C1(value);
    }

    private final Object I0(SlotReader slotReader) {
        return slotReader.L(slotReader.getParent());
    }

    private final int K0(SlotReader slotReader, int i10) {
        Object objZ;
        if (slotReader.G(i10)) {
            Object objD = slotReader.D(i10);
            if (objD != null) {
                if (objD instanceof Enum) {
                    return ((Enum) objD).ordinal();
                }
                if (objD instanceof C5715e0) {
                    return 126665345;
                }
                return objD.hashCode();
            }
            return 0;
        }
        int iC = slotReader.C(i10);
        if (iC == 207 && (objZ = slotReader.z(i10)) != null && !Intrinsics.e(objZ, Composer.INSTANCE.a())) {
            return objZ.hashCode();
        }
        return iC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O0(C5715e0<Object> content, InterfaceC5755y0 locals, Object parameter, boolean force) {
        startMovableGroup(126665345, content);
        B1(parameter);
        int compoundKeyHash = getCompoundKeyHash();
        try {
            this.compoundKeyHash = 126665345;
            boolean z10 = false;
            if (getInserting()) {
                SlotWriter.v0(this.writer, 0, 1, null);
            }
            if (!getInserting() && !Intrinsics.e(this.reader.l(), locals)) {
                z10 = true;
            }
            if (z10) {
                c1(locals);
            }
            p1(HttpResponseStatus.SUCCESS_ACCEPTED, ComposerKt.C(), O.INSTANCE.a(), locals);
            this.providerCache = null;
            if (getInserting() && !force) {
                this.writerHasAProvider = true;
                SlotWriter slotWriter = this.writer;
                this.parentContext.j(new C5720g0(content, parameter, getComposition(), this.insertTable, slotWriter.D(slotWriter.parent(slotWriter.getParent())), CollectionsKt.m(), p0(), null));
            } else {
                boolean z11 = this.providersInvalid;
                this.providersInvalid = z10;
                J0.q.b(this, ComposableLambdaKt.composableLambdaInstance(316014703, true, new f(content, parameter)));
                this.providersInvalid = z11;
            }
            w0();
            this.providerCache = null;
            this.compoundKeyHash = compoundKeyHash;
            T();
        } catch (Throwable th2) {
            w0();
            this.providerCache = null;
            this.compoundKeyHash = compoundKeyHash;
            T();
            throw th2;
        }
    }

    private final Object S0(SlotReader slotReader, int i10) {
        return slotReader.L(i10);
    }

    private final void X() {
        k0();
        y1.a(this.pendingStack);
        this.parentStateStack.a();
        this.entersStack.a();
        this.providersInvalidStack.a();
        this.providerUpdates = null;
        this.insertFixups.a();
        this.compoundKeyHash = 0;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.inserting = false;
        this.reusing = false;
        this.isComposing = false;
        this.forciblyRecompose = false;
        this.reusingGroup = -1;
        if (!this.reader.getClosed()) {
            this.reader.d();
        }
        if (!this.writer.getClosed()) {
            D0();
        }
    }

    private final Anchor e1() {
        int i10;
        int i11;
        if (getInserting()) {
            if (!ComposerKt.L(this.writer)) {
                return null;
            }
            int currentGroup = this.writer.getCurrentGroup() - 1;
            int iParent = this.writer.parent(currentGroup);
            while (true) {
                int i12 = iParent;
                i11 = currentGroup;
                currentGroup = i12;
                if (currentGroup == this.writer.getParent() || currentGroup < 0) {
                    break;
                }
                iParent = this.writer.parent(currentGroup);
            }
            return this.writer.D(i11);
        }
        if (!ComposerKt.K(this.reader)) {
            return null;
        }
        int current = this.reader.getCurrent() - 1;
        int iP = this.reader.P(current);
        while (true) {
            int i13 = iP;
            i10 = current;
            current = i13;
            if (current == this.reader.getParent() || current < 0) {
                break;
            }
            iP = this.reader.P(current);
        }
        return this.reader.a(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void i0() {
        /*
            r4 = this;
            boolean r0 = r4.getInserting()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"
            if (r0 == 0) goto L24
            androidx.compose.runtime.I0 r0 = new androidx.compose.runtime.I0
            androidx.compose.runtime.z r2 = r4.getComposition()
            kotlin.jvm.internal.Intrinsics.h(r2, r1)
            androidx.compose.runtime.n r2 = (androidx.compose.runtime.C5733n) r2
            r0.<init>(r2)
            java.util.ArrayList r1 = r4.invalidateStack
            androidx.compose.runtime.y1.j(r1, r0)
            r4.C1(r0)
            int r1 = r4.compositionToken
            r0.N(r1)
            return
        L24:
            java.util.List<androidx.compose.runtime.S> r0 = r4.invalidations
            androidx.compose.runtime.W0 r2 = r4.reader
            int r2 = r2.getParent()
            androidx.compose.runtime.S r0 = androidx.compose.runtime.ComposerKt.n(r0, r2)
            androidx.compose.runtime.W0 r2 = r4.reader
            java.lang.Object r2 = r2.K()
            androidx.compose.runtime.Composer$a r3 = androidx.compose.runtime.Composer.INSTANCE
            java.lang.Object r3 = r3.a()
            boolean r3 = kotlin.jvm.internal.Intrinsics.e(r2, r3)
            if (r3 == 0) goto L54
            androidx.compose.runtime.I0 r2 = new androidx.compose.runtime.I0
            androidx.compose.runtime.z r3 = r4.getComposition()
            kotlin.jvm.internal.Intrinsics.h(r3, r1)
            androidx.compose.runtime.n r3 = (androidx.compose.runtime.C5733n) r3
            r2.<init>(r3)
            r4.C1(r2)
            goto L5b
        L54:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            kotlin.jvm.internal.Intrinsics.h(r2, r1)
            androidx.compose.runtime.I0 r2 = (androidx.compose.runtime.I0) r2
        L5b:
            r1 = 1
            r3 = 0
            if (r0 != 0) goto L6d
            boolean r0 = r2.m()
            if (r0 == 0) goto L68
            r2.G(r3)
        L68:
            if (r0 == 0) goto L6b
            goto L6d
        L6b:
            r0 = r3
            goto L6e
        L6d:
            r0 = r1
        L6e:
            r2.I(r0)
            java.util.ArrayList r0 = r4.invalidateStack
            androidx.compose.runtime.y1.j(r0, r2)
            int r0 = r4.compositionToken
            r2.N(r0)
            boolean r0 = r2.n()
            if (r0 == 0) goto L8c
            r2.H(r3)
            r2.K(r1)
            C0.a r0 = r4.changeListWriter
            r0.Y(r2)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.i0():void");
    }

    private final InterfaceC5755y0 q0(int group) {
        InterfaceC5755y0 interfaceC5755y0B;
        if (getInserting() && this.writerHasAProvider) {
            int parent = this.writer.getParent();
            while (parent > 0) {
                if (this.writer.groupKey(parent) == 202 && Intrinsics.e(this.writer.groupObjectKey(parent), ComposerKt.C())) {
                    Object objJ0 = this.writer.j0(parent);
                    Intrinsics.h(objJ0, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    InterfaceC5755y0 interfaceC5755y0 = (InterfaceC5755y0) objJ0;
                    this.providerCache = interfaceC5755y0;
                    return interfaceC5755y0;
                }
                parent = this.writer.parent(parent);
            }
        }
        if (this.reader.getGroupsSize() > 0) {
            while (group > 0) {
                if (this.reader.C(group) == 202 && Intrinsics.e(this.reader.D(group), ComposerKt.C())) {
                    Z.K<InterfaceC5755y0> k10 = this.providerUpdates;
                    if (k10 == null || (interfaceC5755y0B = k10.b(group)) == null) {
                        Object objZ = this.reader.z(group);
                        Intrinsics.h(objZ, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        interfaceC5755y0B = (InterfaceC5755y0) objZ;
                    }
                    this.providerCache = interfaceC5755y0B;
                    return interfaceC5755y0B;
                }
                group = this.reader.P(group);
            }
        }
        InterfaceC5755y0 interfaceC5755y02 = this.parentProvider;
        this.providerCache = interfaceC5755y02;
        return interfaceC5755y02;
    }

    private final void y0() {
        w0();
        this.parentContext.c();
        w0();
        this.changeListWriter.l();
        C0();
        this.reader.d();
        this.forciblyRecompose = false;
        this.providersInvalid = ComposerKt.p(this.providersInvalidStack.g());
    }

    private final void y1(int group, int count) {
        if (D1(group) != count) {
            if (group < 0) {
                Z.I i10 = this.nodeCountVirtualOverrides;
                if (i10 == null) {
                    i10 = new Z.I(0, 1, null);
                    this.nodeCountVirtualOverrides = i10;
                }
                i10.q(group, count);
                return;
            }
            int[] iArr = this.nodeCountOverrides;
            if (iArr == null) {
                int[] iArr2 = new int[this.reader.getGroupsSize()];
                ArraysKt.D(iArr2, -1, 0, 0, 6, null);
                this.nodeCountOverrides = iArr2;
                iArr = iArr2;
            }
            iArr[group] = count;
        }
    }

    private final void z1(int group, int newCount) {
        int iD1 = D1(group);
        if (iD1 != newCount) {
            int i10 = newCount - iD1;
            int iD = y1.d(this.pendingStack) - 1;
            while (group != -1) {
                int iD12 = D1(group) + i10;
                y1(group, iD12);
                int i11 = iD;
                while (true) {
                    if (-1 < i11) {
                        C5753x0 c5753x0 = (C5753x0) y1.h(this.pendingStack, i11);
                        if (c5753x0 != null && c5753x0.n(group, iD12)) {
                            iD = i11 - 1;
                            break;
                        }
                        i11--;
                    } else {
                        break;
                    }
                }
                if (group < 0) {
                    group = this.reader.getParent();
                } else if (!this.reader.J(group)) {
                    group = this.reader.P(group);
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.Composer
    public Object B() {
        return R0();
    }

    @PublishedApi
    public final void C1(Object value) {
        if (getInserting()) {
            this.writer.o1(value);
            return;
        }
        if (this.reader.getHadNext()) {
            int iQ = this.reader.q() - 1;
            if (this.changeListWriter.r()) {
                C0.a aVar = this.changeListWriter;
                SlotReader slotReader = this.reader;
                aVar.a0(value, slotReader.a(slotReader.getParent()), iQ);
                return;
            }
            this.changeListWriter.d0(value, iQ);
            return;
        }
        C0.a aVar2 = this.changeListWriter;
        SlotReader slotReader2 = this.reader;
        aVar2.a(slotReader2.a(slotReader2.getParent()), value);
    }

    @Override // androidx.compose.runtime.Composer
    public boolean D(Object value) {
        if (Q0() != value) {
            C1(value);
            return true;
        }
        return false;
    }

    @Override // androidx.compose.runtime.Composer
    public void H(G0<?> value) {
        E1<?> e12;
        InterfaceC5755y0 interfaceC5755y0P0 = p0();
        r1(HttpResponseStatus.SUCCESS_CREATED, ComposerKt.G());
        Object objB = B();
        if (Intrinsics.e(objB, Composer.INSTANCE.a())) {
            e12 = null;
        } else {
            Intrinsics.h(objB, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            e12 = (E1) objB;
        }
        AbstractC5737p<?> abstractC5737pB = value.b();
        Intrinsics.h(abstractC5737pB, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Intrinsics.h(value, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
        E1<?> e1B = abstractC5737pB.b(value, e12);
        boolean zE = Intrinsics.e(e1B, e12);
        if (!zE) {
            t(e1B);
        }
        boolean z10 = true;
        boolean z11 = false;
        if (getInserting()) {
            if (value.getCanOverride() || !C5744t.a(interfaceC5755y0P0, abstractC5737pB)) {
                interfaceC5755y0P0 = interfaceC5755y0P0.l(abstractC5737pB, e1B);
            }
            this.writerHasAProvider = true;
        } else {
            SlotReader slotReader = this.reader;
            Object objZ = slotReader.z(slotReader.getCurrent());
            Intrinsics.h(objZ, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC5755y0 interfaceC5755y0 = (InterfaceC5755y0) objZ;
            if ((j() && zE) || (!value.getCanOverride() && C5744t.a(interfaceC5755y0P0, abstractC5737pB))) {
                if ((zE && !this.providersInvalid) || !this.providersInvalid) {
                    interfaceC5755y0P0 = interfaceC5755y0;
                }
            } else {
                interfaceC5755y0P0 = interfaceC5755y0P0.l(abstractC5737pB, e1B);
            }
            if (!this.reusing && interfaceC5755y0 == interfaceC5755y0P0) {
                z10 = false;
            }
            z11 = z10;
        }
        if (z11 && !getInserting()) {
            c1(interfaceC5755y0P0);
        }
        this.providersInvalidStack.h(ComposerKt.q(this.providersInvalid));
        this.providersInvalid = z11;
        this.providerCache = interfaceC5755y0P0;
        p1(HttpResponseStatus.SUCCESS_ACCEPTED, ComposerKt.C(), O.INSTANCE.a(), interfaceC5755y0P0);
    }

    @Override // androidx.compose.runtime.Composer
    public <T> void I(Function0<? extends T> factory) {
        E1();
        if (!getInserting()) {
            ComposerKt.t("createNode() can only be called when inserting");
        }
        int iC = this.parentStateStack.c();
        SlotWriter slotWriter = this.writer;
        Anchor anchorD = slotWriter.D(slotWriter.getParent());
        this.groupNodeCount++;
        this.insertFixups.b(factory, iC, anchorD);
    }

    @Override // androidx.compose.runtime.Composer
    public void J(String sourceInformation) {
        if (getInserting() && this.sourceMarkersEnabled) {
            this.writer.L0(sourceInformation);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void L(int key, String sourceInformation) {
        if (getInserting() && this.sourceMarkersEnabled) {
            this.writer.N0(key, sourceInformation);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void M() {
        w0();
        w0();
        this.providersInvalid = ComposerKt.p(this.providersInvalidStack.g());
        this.providerCache = null;
    }

    public void M0(List<Pair<C5720g0, C5720g0>> references) {
        try {
            L0(references);
            k0();
        } catch (Throwable th2) {
            X();
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public boolean N() {
        I0 i0G0;
        if (!j() || this.providersInvalid || ((i0G0 = G0()) != null && i0G0.l())) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.runtime.Composer
    public void P() {
        w0();
    }

    @PublishedApi
    public final Object Q0() {
        if (getInserting()) {
            F1();
            return Composer.INSTANCE.a();
        }
        Object objK = this.reader.K();
        if (this.reusing && !(objK instanceof R0)) {
            return Composer.INSTANCE.a();
        }
        return objK;
    }

    @PublishedApi
    public final Object R0() {
        if (getInserting()) {
            F1();
            return Composer.INSTANCE.a();
        }
        Object objK = this.reader.K();
        if (this.reusing && !(objK instanceof R0)) {
            return Composer.INSTANCE.a();
        }
        if (objK instanceof O0) {
            return ((O0) objK).getWrapped();
        }
        return objK;
    }

    @Override // androidx.compose.runtime.Composer
    public void S() {
        if (getInserting() && this.sourceMarkersEnabled) {
            this.writer.M0();
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void T() {
        w0();
    }

    @Override // androidx.compose.runtime.Composer
    public void U() {
        w0();
    }

    @Override // androidx.compose.runtime.Composer
    public boolean V(Object value) {
        if (!Intrinsics.e(Q0(), value)) {
            C1(value);
            return true;
        }
        return false;
    }

    @Override // androidx.compose.runtime.Composer
    public void W(G0<?>[] values) {
        InterfaceC5755y0 interfaceC5755y0A1;
        InterfaceC5755y0 interfaceC5755y0P0 = p0();
        r1(HttpResponseStatus.SUCCESS_CREATED, ComposerKt.G());
        boolean z10 = true;
        boolean z11 = false;
        if (getInserting()) {
            interfaceC5755y0A1 = A1(interfaceC5755y0P0, C5744t.d(values, interfaceC5755y0P0, null, 4, null));
            this.writerHasAProvider = true;
        } else {
            Object objA = this.reader.A(0);
            Intrinsics.h(objA, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC5755y0 interfaceC5755y0 = (InterfaceC5755y0) objA;
            Object objA2 = this.reader.A(1);
            Intrinsics.h(objA2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC5755y0 interfaceC5755y02 = (InterfaceC5755y0) objA2;
            InterfaceC5755y0 interfaceC5755y0C = C5744t.c(values, interfaceC5755y0P0, interfaceC5755y02);
            if (j() && !this.reusing && Intrinsics.e(interfaceC5755y02, interfaceC5755y0C)) {
                n1();
                interfaceC5755y0A1 = interfaceC5755y0;
            } else {
                interfaceC5755y0A1 = A1(interfaceC5755y0P0, interfaceC5755y0C);
                if (!this.reusing && Intrinsics.e(interfaceC5755y0A1, interfaceC5755y0)) {
                    z10 = false;
                }
                z11 = z10;
            }
        }
        if (z11 && !getInserting()) {
            c1(interfaceC5755y0A1);
        }
        this.providersInvalidStack.h(ComposerKt.q(this.providersInvalid));
        this.providersInvalid = z11;
        this.providerCache = interfaceC5755y0A1;
        p1(HttpResponseStatus.SUCCESS_ACCEPTED, ComposerKt.C(), O.INSTANCE.a(), interfaceC5755y0A1);
    }

    @Override // androidx.compose.runtime.Composer
    public boolean a(boolean value) {
        Object objQ0 = Q0();
        if ((objQ0 instanceof Boolean) && value == ((Boolean) objQ0).booleanValue()) {
            return false;
        }
        C1(Boolean.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean b(float value) {
        Object objQ0 = Q0();
        if ((objQ0 instanceof Float) && value == ((Number) objQ0).floatValue()) {
            return false;
        }
        C1(Float.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean d(int value) {
        Object objQ0 = Q0();
        if ((objQ0 instanceof Integer) && value == ((Number) objQ0).intValue()) {
            return false;
        }
        C1(Integer.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean e(long value) {
        Object objQ0 = Q0();
        if ((objQ0 instanceof Long) && value == ((Number) objQ0).longValue()) {
            return false;
        }
        C1(Long.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean f(char value) {
        Object objQ0 = Q0();
        if ((objQ0 instanceof Character) && value == ((Character) objQ0).charValue()) {
            return false;
        }
        C1(Character.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean g(double value) {
        Object objQ0 = Q0();
        if ((objQ0 instanceof Double) && value == ((Number) objQ0).doubleValue()) {
            return false;
        }
        C1(Double.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean j() {
        I0 i0G0;
        if (!getInserting() && !this.reusing && !this.providersInvalid && (i0G0 = G0()) != null && !i0G0.o() && !this.forciblyRecompose) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.runtime.Composer
    public <V, T> void n(V value, Function2<? super T, ? super V, Unit> block) {
        if (getInserting()) {
            this.insertFixups.f(value, block);
        } else {
            this.changeListWriter.c0(value, block);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public <T> T o(AbstractC5737p<T> key) {
        return (T) C5744t.b(p0(), key);
    }

    @Override // androidx.compose.runtime.Composer
    public InterfaceC5742s r() {
        return p0();
    }

    @Override // androidx.compose.runtime.Composer
    public void s() {
        E1();
        if (getInserting()) {
            ComposerKt.t("useNode() called while inserting");
        }
        Object objI0 = I0(this.reader);
        this.changeListWriter.x(objI0);
        if (this.reusing && (objI0 instanceof InterfaceC5719g)) {
            this.changeListWriter.e0(objI0);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public Composer startRestartGroup(int key) {
        startReplaceGroup(key);
        i0();
        return this;
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableGroup(int key, Object dataKey) {
        if (!getInserting() && this.reader.n() == key && !Intrinsics.e(this.reader.l(), dataKey) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.getCurrent();
            this.reusing = true;
        }
        p1(key, null, O.INSTANCE.a(), dataKey);
    }

    @Override // androidx.compose.runtime.Composer
    public void t(Object value) {
        w1(value);
    }

    @Override // androidx.compose.runtime.Composer
    public void u() {
        w0();
        w0();
        this.providersInvalid = ComposerKt.p(this.providersInvalidStack.g());
        this.providerCache = null;
    }

    public final boolean v1(I0 scope, Object instance) {
        Anchor anchor = scope.getAnchor();
        if (anchor == null) {
            return false;
        }
        int iD = anchor.d(this.reader.getTable());
        if (this.isComposing && iD >= this.reader.getCurrent()) {
            ComposerKt.J(this.invalidations, iD, scope, instance);
            return true;
        }
        return false;
    }

    @Override // androidx.compose.runtime.Composer
    public void w() {
        w0();
        I0 i0G0 = G0();
        if (i0G0 != null && i0G0.t()) {
            i0G0.E(true);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public H0 z() {
        return G0();
    }
}
