package androidx.compose.ui.node;

import U0.MutableRect;
import V0.C5474k1;
import V0.o1;
import androidx.compose.runtime.snapshots.g;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.AbstractC5916a;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import com.fullstory.FS;
import com.fullstory.instrumentation.frameworks.compose.FSComposeNodeCoordinator;
import com.google.android.gms.common.api.a;
import g1.InterfaceC14305h;
import g1.O;
import j1.C14920a;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u009e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000 º\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004»\u0002¼\u0002B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0010\u001a\u00020\t2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011JG\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0019\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016¢\u0006\u0002\b\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\"\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020\tH\u0002¢\u0006\u0004\b%\u0010&J@\u00100\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b0\u00101JP\u00104\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\t2\u0006\u00102\u001a\u00020\u00142\u0006\u00103\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b4\u00105JH\u00106\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\t2\u0006\u00102\u001a\u00020\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b6\u00107JH\u00108\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\t2\u0006\u00102\u001a\u00020\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b8\u00107J(\u00109\u001a\u00020\t*\u0004\u0018\u00010\u000b2\u0006\u0010*\u001a\u00020)2\u0006\u0010.\u001a\u00020-H\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u0013\u0010;\u001a\u00020\u0000*\u00020\u0003H\u0002¢\u0006\u0004\b;\u0010<J\"\u0010@\u001a\u00020\u00182\u0006\u0010=\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>H\u0002ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\"\u0010B\u001a\u00020\u00182\u0006\u0010=\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>H\u0002ø\u0001\u0000¢\u0006\u0004\bB\u0010AJ*\u0010E\u001a\u00020)2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010C\u001a\u00020)2\u0006\u0010D\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\bE\u0010FJ'\u0010J\u001a\u00020\u00182\u0006\u0010=\u001a\u00020\u00002\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020\tH\u0002¢\u0006\u0004\bJ\u0010KJ\u001f\u0010M\u001a\u00020\u00182\u0006\u0010L\u001a\u00020G2\u0006\u0010I\u001a\u00020\tH\u0002¢\u0006\u0004\bM\u0010NJ\u001a\u0010O\u001a\u00020)2\u0006\u0010*\u001a\u00020)H\u0002ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ\u001e\u0010Q\u001a\u0004\u0018\u00010\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eø\u0001\u0000¢\u0006\u0004\bQ\u0010RJ\r\u0010S\u001a\u00020\t¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u0018H\u0010¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\u0018H&¢\u0006\u0004\bW\u0010VJ\u001f\u0010[\u001a\u00020\u00182\u0006\u0010Y\u001a\u00020X2\u0006\u0010Z\u001a\u00020XH\u0014¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\u0018H\u0000¢\u0006\u0004\b]\u0010VJ\r\u0010^\u001a\u00020\u0018¢\u0006\u0004\b^\u0010VJ\r\u0010_\u001a\u00020\u0018¢\u0006\u0004\b_\u0010VJ=\u0010`\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0019\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016¢\u0006\u0002\b\u0019H\u0014ø\u0001\u0000¢\u0006\u0004\b`\u0010aJ*\u0010c\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010b\u001a\u00020\u001bH\u0014ø\u0001\u0000¢\u0006\u0004\bc\u0010dJ\r\u0010e\u001a\u00020\u0018¢\u0006\u0004\be\u0010VJE\u0010f\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0019\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016¢\u0006\u0002\b\u00192\b\u0010b\u001a\u0004\u0018\u00010\u001bø\u0001\u0000¢\u0006\u0004\bf\u0010\u001eJ\u001f\u0010g\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\bg\u0010#J!\u0010h\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\bh\u0010#J\r\u0010i\u001a\u00020\u0018¢\u0006\u0004\bi\u0010VJ2\u0010k\u001a\u00020\u00182\u0019\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016¢\u0006\u0002\b\u00192\b\b\u0002\u0010j\u001a\u00020\t¢\u0006\u0004\bk\u0010lJ\r\u0010m\u001a\u00020\u0018¢\u0006\u0004\bm\u0010VJ\r\u0010n\u001a\u00020\u0018¢\u0006\u0004\bn\u0010VJ8\u0010o\u001a\u00020\u00182\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\bo\u0010pJ:\u0010q\u001a\u00020\u00182\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bq\u0010pJ\r\u0010s\u001a\u00020r¢\u0006\u0004\bs\u0010tJ\u001a\u0010v\u001a\u00020)2\u0006\u0010u\u001a\u00020)H\u0016ø\u0001\u0000¢\u0006\u0004\bv\u0010PJ\u001a\u0010x\u001a\u00020)2\u0006\u0010w\u001a\u00020)H\u0016ø\u0001\u0000¢\u0006\u0004\bx\u0010PJ\u001a\u0010z\u001a\u00020)2\u0006\u0010y\u001a\u00020)H\u0016ø\u0001\u0000¢\u0006\u0004\bz\u0010PJ\u001a\u0010{\u001a\u00020)2\u0006\u0010w\u001a\u00020)H\u0016ø\u0001\u0000¢\u0006\u0004\b{\u0010PJ\"\u0010~\u001a\u00020)2\u0006\u0010|\u001a\u00020\u00032\u0006\u0010}\u001a\u00020)H\u0016ø\u0001\u0000¢\u0006\u0004\b~\u0010\u007fJ-\u0010\u0080\u0001\u001a\u00020)2\u0006\u0010|\u001a\u00020\u00032\u0006\u0010}\u001a\u00020)2\u0006\u0010D\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J%\u0010\u0082\u0001\u001a\u00020\u00182\u0006\u0010|\u001a\u00020\u00032\u0006\u0010?\u001a\u00020>H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001d\u0010\u0084\u0001\u001a\u00020\u00182\u0006\u0010?\u001a\u00020>H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\"\u0010\u0086\u0001\u001a\u00020r2\u0006\u0010|\u001a\u00020\u00032\u0006\u0010I\u001a\u00020\tH\u0016¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001c\u0010\u0088\u0001\u001a\u00020)2\u0006\u0010w\u001a\u00020)H\u0016ø\u0001\u0000¢\u0006\u0005\b\u0088\u0001\u0010PJ'\u0010\u0089\u0001\u001a\u00020)2\u0006\u0010\u0013\u001a\u00020)2\b\b\u0002\u0010D\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J'\u0010\u008b\u0001\u001a\u00020)2\u0006\u0010\u0013\u001a\u00020)2\b\b\u0002\u0010D\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0006\b\u008b\u0001\u0010\u008a\u0001J$\u0010\u008e\u0001\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001f2\b\u0010\u008d\u0001\u001a\u00030\u008c\u0001H\u0004¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u000f\u0010\u0090\u0001\u001a\u00020\u0018¢\u0006\u0005\b\u0090\u0001\u0010VJ\u000f\u0010\u0091\u0001\u001a\u00020\u0018¢\u0006\u0005\b\u0091\u0001\u0010VJ-\u0010\u0093\u0001\u001a\u00020\u00182\u0006\u0010L\u001a\u00020G2\u0006\u0010I\u001a\u00020\t2\t\b\u0002\u0010\u0092\u0001\u001a\u00020\tH\u0000¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u001d\u0010\u0095\u0001\u001a\u00020\t2\u0006\u0010*\u001a\u00020)H\u0004ø\u0001\u0000¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u001d\u0010\u0097\u0001\u001a\u00020\t2\u0006\u0010*\u001a\u00020)H\u0004ø\u0001\u0000¢\u0006\u0006\b\u0097\u0001\u0010\u0096\u0001J\u0011\u0010\u0098\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0005\b\u0098\u0001\u0010VJ\u0011\u0010\u0099\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0005\b\u0099\u0001\u0010VJ\u001b\u0010\u009b\u0001\u001a\u00020\u00002\u0007\u0010\u009a\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u000f\u0010\u009d\u0001\u001a\u00020\t¢\u0006\u0005\b\u009d\u0001\u0010TJ\u001f\u0010 \u0001\u001a\u00030\u009e\u00012\b\u0010\u009f\u0001\u001a\u00030\u009e\u0001H\u0004ø\u0001\u0000¢\u0006\u0005\b \u0001\u0010PJ'\u0010¡\u0001\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)2\b\u0010\u009f\u0001\u001a\u00030\u009e\u0001H\u0004ø\u0001\u0000¢\u0006\u0006\b¡\u0001\u0010¢\u0001R\u001e\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R'\u0010«\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bv\u0010§\u0001\u001a\u0005\b¨\u0001\u0010T\"\u0006\b©\u0001\u0010ª\u0001R(\u0010¯\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b¬\u0001\u0010§\u0001\u001a\u0005\b\u00ad\u0001\u0010T\"\u0006\b®\u0001\u0010ª\u0001R*\u0010µ\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bx\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001R+\u0010¹\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¶\u0001\u0010°\u0001\u001a\u0006\b·\u0001\u0010²\u0001\"\u0006\b¸\u0001\u0010´\u0001R\u0019\u0010»\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010§\u0001R\u0019\u0010½\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010§\u0001RO\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016¢\u0006\u0002\b\u00192\u001a\u0010¾\u0001\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016¢\u0006\u0002\b\u00198\u0004@BX\u0084\u000e¢\u0006\u0010\n\u0006\b¿\u0001\u0010À\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001R\u001a\u0010Æ\u0001\u001a\u00030Ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u001a\u0010Ê\u0001\u001a\u00030Ç\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R\u0019\u0010Ì\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010\u0080\u0001R\u001c\u0010Ð\u0001\u001a\u0005\u0018\u00010Í\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÎ\u0001\u0010Ï\u0001R#\u0010Õ\u0001\u001a\f\u0012\u0005\u0012\u00030Ò\u0001\u0018\u00010Ñ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010Ô\u0001R6\u0010\u0013\u001a\u00020\u00122\u0007\u0010¾\u0001\u001a\u00020\u00128\u0016@TX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0017\n\u0005\bÖ\u0001\u0010~\u001a\u0006\b×\u0001\u0010Ø\u0001\"\u0006\bÙ\u0001\u0010Ú\u0001R1\u0010\u0015\u001a\u00020\u00142\u0007\u0010¾\u0001\u001a\u00020\u00148\u0006@DX\u0086\u000e¢\u0006\u0018\n\u0006\bÛ\u0001\u0010\u0080\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001\"\u0006\bÞ\u0001\u0010ß\u0001R\u001b\u0010â\u0001\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R\u001c\u0010å\u0001\u001a\u0005\u0018\u00010ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010ä\u0001R\u001b\u0010è\u0001\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R\u001b\u0010é\u0001\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bé\u0001\u0010ê\u0001R0\u0010ì\u0001\u001a\u0019\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0018\u0018\u00010ë\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bì\u0001\u0010í\u0001R\u001e\u0010ñ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bï\u0001\u0010ð\u0001R)\u0010ô\u0001\u001a\u00020\t2\u0007\u0010¾\u0001\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\bò\u0001\u0010§\u0001\u001a\u0005\bó\u0001\u0010TR.\u0010b\u001a\u0005\u0018\u00010õ\u00012\n\u0010¾\u0001\u001a\u0005\u0018\u00010õ\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b~\u0010ö\u0001\u001a\u0006\b÷\u0001\u0010ø\u0001R\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bù\u0001\u0010ç\u0001R\u0018\u0010ý\u0001\u001a\u00030ú\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bû\u0001\u0010ü\u0001R,\u0010\u0080\u0002\u001a\u0017\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u00180ë\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bþ\u0001\u0010ÿ\u0001R\u0017\u0010\u0083\u0002\u001a\u00020\u000b8&X¦\u0004¢\u0006\b\u001a\u0006\b\u0081\u0002\u0010\u0082\u0002R\u0018\u0010\u0086\u0002\u001a\u00030Ç\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002R\u0017\u0010\u0088\u0002\u001a\u00020\u00148VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0087\u0002\u0010Ý\u0001R\u0017\u0010\u008a\u0002\u001a\u00020\u00148VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0089\u0002\u0010Ý\u0001R\u0019\u0010\u008d\u0002\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002R\u0017\u0010\u0090\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002R\u001b\u0010\u0093\u0002\u001a\u00030\u0091\u00028Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u0092\u0002\u0010Ø\u0001R\u0018\u0010\u0097\u0002\u001a\u00030\u0094\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0095\u0002\u0010\u0096\u0002R\u0019\u0010\u0099\u0002\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0098\u0002\u0010\u008c\u0002R\u0016\u0010\u009b\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009a\u0002\u0010TR\u0016\u0010\u009c\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009c\u0002\u0010TR,\u0010¢\u0002\u001a\u00030Í\u00012\b\u0010\u009d\u0002\u001a\u00030Í\u00018P@PX\u0090\u000e¢\u0006\u0010\u001a\u0006\b\u009e\u0002\u0010\u009f\u0002\"\u0006\b \u0002\u0010¡\u0002R0\u0010¨\u0002\u001a\u0005\u0018\u00010£\u00022\n\u0010¾\u0001\u001a\u0005\u0018\u00010£\u00028&@dX¦\u000e¢\u0006\u0010\u001a\u0006\b¤\u0002\u0010¥\u0002\"\u0006\b¦\u0002\u0010§\u0002R\u001a\u0010¬\u0002\u001a\u0005\u0018\u00010©\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bª\u0002\u0010«\u0002R\u0016\u0010®\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\b\u00ad\u0002\u0010\u008f\u0002R\u0016\u0010°\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\b¯\u0002\u0010\u008f\u0002R\u0017\u0010³\u0002\u001a\u00020G8DX\u0084\u0004¢\u0006\b\u001a\u0006\b±\u0002\u0010²\u0002R\u001e\u0010¶\u0002\u001a\u00030´\u00028@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\bµ\u0002\u0010Ø\u0001R\u0016\u0010¸\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b·\u0002\u0010TR\u001b\u0010\u009f\u0001\u001a\u00030\u009e\u00018Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b¹\u0002\u0010Ø\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006½\u0002"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/Q;", "Landroidx/compose/ui/layout/I;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "includeTail", "Landroidx/compose/ui/Modifier$c;", "T2", "(Z)Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/node/f0;", "type", "R2", "(I)Z", "LH1/n;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/e;", "", "Lkotlin/ExtensionFunctionType;", "layerBlock", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "explicitLayer", "o3", "(JFLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "graphicsLayer", "w2", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "invokeOnLayoutChange", "J3", "(Z)Z", "Landroidx/compose/ui/node/NodeCoordinator$f;", "hitTestSource", "LU0/f;", "pointerPosition", "Landroidx/compose/ui/node/w;", "hitTestResult", "Lg1/O;", "pointerType", "isInLayer", "U2", "(Landroidx/compose/ui/Modifier$c;Landroidx/compose/ui/node/NodeCoordinator$f;JLandroidx/compose/ui/node/w;IZ)V", "distanceFromEdge", "isHitInMinimumTouchTargetBetter", "m3", "(Landroidx/compose/ui/Modifier$c;Landroidx/compose/ui/node/NodeCoordinator$f;JLandroidx/compose/ui/node/w;IZFZ)V", "V2", "(Landroidx/compose/ui/Modifier$c;Landroidx/compose/ui/node/NodeCoordinator$f;JLandroidx/compose/ui/node/w;IZF)V", "A3", "Z2", "(Landroidx/compose/ui/Modifier$c;JI)Z", "B3", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/node/NodeCoordinator;", "ancestor", "LV0/k1;", "matrix", "G3", "(Landroidx/compose/ui/node/NodeCoordinator;[F)V", "F3", "offset", "includeMotionFrameOfReference", "r2", "(Landroidx/compose/ui/node/NodeCoordinator;JZ)J", "LU0/d;", "rect", "clipBounds", "q2", "(Landroidx/compose/ui/node/NodeCoordinator;LU0/d;Z)V", "bounds", "B2", "(LU0/d;Z)V", "b3", "(J)J", "S2", "(I)Landroidx/compose/ui/Modifier$c;", "isTransparent", "()Z", "R1", "()V", "x2", "", "width", "height", "h3", "(II)V", "d3", "i3", "l3", "V0", "(JFLkotlin/jvm/functions/Function1;)V", "layer", "T0", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "s3", "p3", "u2", "n3", "j3", "forceUpdateLayerParameters", "H3", "(Lkotlin/jvm/functions/Function1;Z)V", "c3", "e3", "W2", "(Landroidx/compose/ui/node/NodeCoordinator$f;JLandroidx/compose/ui/node/w;IZ)V", "X2", "Landroidx/compose/ui/geometry/Rect;", "E3", "()Landroidx/compose/ui/geometry/Rect;", "relativeToScreen", "q", "relativeToLocal", "s", "relativeToWindow", "N", "X", "sourceCoordinates", "relativeToSource", "J", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "F", "(Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "O", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "a0", "([F)V", "b0", "(Landroidx/compose/ui/layout/LayoutCoordinates;Z)Landroidx/compose/ui/geometry/Rect;", "r0", "C3", "(JZ)J", "z2", "LV0/o1;", "paint", "v2", "(Landroidx/compose/ui/graphics/Canvas;LV0/o1;)V", "g3", "k3", "clipToMinimumTouchTargetSize", "q3", "(LU0/d;ZZ)V", "L3", "(J)Z", "a3", "Y2", "f3", "other", "y2", "(Landroidx/compose/ui/node/NodeCoordinator;)Landroidx/compose/ui/node/NodeCoordinator;", "z3", "LU0/k;", "minimumTouchTargetSize", "s2", "t2", "(JJ)F", "p", "Landroidx/compose/ui/node/LayoutNode;", "S1", "()Landroidx/compose/ui/node/LayoutNode;", "Z", "getForcePlaceWithLookaheadOffset$ui_release", "u3", "(Z)V", "forcePlaceWithLookaheadOffset", "r", "E2", "t3", "forceMeasureWithLookaheadConstraints", "Landroidx/compose/ui/node/NodeCoordinator;", "O2", "()Landroidx/compose/ui/node/NodeCoordinator;", "x3", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "wrapped", "t", "P2", "y3", "wrappedBy", "u", "released", "v", "isClipping", "<set-?>", "w", "Lkotlin/jvm/functions/Function1;", "getLayerBlock", "()Lkotlin/jvm/functions/Function1;", "LH1/d;", "x", "LH1/d;", "layerDensity", "LH1/t;", "y", "LH1/t;", "layerLayoutDirection", "z", "lastLayerAlpha", "Landroidx/compose/ui/layout/J;", "A", "Landroidx/compose/ui/layout/J;", "_measureResult", "LZ/S;", "Landroidx/compose/ui/layout/a;", "B", "LZ/S;", "oldAlignmentLines", "C", "w1", "()J", "w3", "(J)V", "D", "Q2", "()F", "setZIndex", "(F)V", "E", "LU0/d;", "_rectCache", "Landroidx/compose/ui/node/B;", "Landroidx/compose/ui/node/B;", "layerPositionalProperties", "G", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "drawBlockParentLayer", "drawBlockCanvas", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/Function2;", "_drawBlock", "Lkotlin/jvm/functions/Function2;", "Lkotlin/Function0;", "H", "Lkotlin/jvm/functions/Function0;", "invalidateParentLayer", "I", "F2", "lastLayerDrawingWasSkipped", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/node/OwnedLayer;", "H2", "()Landroidx/compose/ui/node/OwnedLayer;", "K", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "M2", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "D2", "()Lkotlin/jvm/functions/Function2;", "drawBlock", "N2", "()Landroidx/compose/ui/Modifier$c;", "tail", "getLayoutDirection", "()LH1/t;", "layoutDirection", "getDensity", "density", "F1", "fontScale", "u1", "()Landroidx/compose/ui/node/Q;", "parent", "q1", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "LH1/r;", "c", "size", "Landroidx/compose/ui/node/b;", "C2", "()Landroidx/compose/ui/node/b;", "alignmentLinesOwner", "m1", "child", "r1", "hasMeasureResult", "isAttached", "value", "s1", "()Landroidx/compose/ui/layout/J;", "v3", "(Landroidx/compose/ui/layout/J;)V", "measureResult", "Landroidx/compose/ui/node/S;", "I2", "()Landroidx/compose/ui/node/S;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/S;)V", "lookaheadDelegate", "", "a", "()Ljava/lang/Object;", "parentData", "n0", "parentLayoutCoordinates", "K2", "parentCoordinates", "L2", "()LU0/d;", "rectCache", "LH1/b;", "G2", "lastMeasurementConstraints", "e1", "isValidOwnerScope", "J2", "L", "e", "f", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class NodeCoordinator extends Q implements androidx.compose.ui.layout.I, LayoutCoordinates, OwnerScope, FSComposeNodeCoordinator {

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: M, reason: collision with root package name */
    private static final Function1<NodeCoordinator, Unit> f51499M = d.f51529f;

    /* renamed from: N, reason: collision with root package name */
    private static final Function1<NodeCoordinator, Unit> f51500N = c.f51528f;

    /* renamed from: O, reason: collision with root package name */
    private static final androidx.compose.ui.graphics.g f51501O = new androidx.compose.ui.graphics.g();

    /* renamed from: P, reason: collision with root package name */
    private static final B f51502P = new B();

    /* renamed from: Q, reason: collision with root package name */
    private static final float[] f51503Q = C5474k1.c(null, 1, null);

    /* renamed from: R, reason: collision with root package name */
    private static final f f51504R = new a();

    /* renamed from: S, reason: collision with root package name */
    private static final f f51505S = new b();

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.ui.layout.J _measureResult;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private Z.S<AbstractC5916a> oldAlignmentLines;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private float zIndex;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private MutableRect _rectCache;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private B layerPositionalProperties;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private GraphicsLayer drawBlockParentLayer;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private boolean lastLayerDrawingWasSkipped;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private OwnedLayer layer;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private GraphicsLayer explicitLayer;
    private Function2<? super Canvas, ? super GraphicsLayer, Unit> _drawBlock;
    private Canvas drawBlockCanvas;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final LayoutNode layoutNode;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean forcePlaceWithLookaheadOffset;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean forceMeasureWithLookaheadConstraints;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private NodeCoordinator wrapped;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private NodeCoordinator wrappedBy;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean released;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean isClipping;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private Function1<? super androidx.compose.ui.graphics.e, Unit> layerBlock;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private H1.d layerDensity = getLayoutNode().getDensity();

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private H1.t layerLayoutDirection = getLayoutNode().getLayoutDirection();

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private float lastLayerAlpha = 0.8f;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private long position = H1.n.INSTANCE.b();

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> invalidateParentLayer = new g();

    @Metadata(d1 = {"\u0000G\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\bH\u0016ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"androidx/compose/ui/node/NodeCoordinator$a", "Landroidx/compose/ui/node/NodeCoordinator$f;", "Landroidx/compose/ui/node/f0;", "Landroidx/compose/ui/node/q0;", "a", "()I", "Landroidx/compose/ui/Modifier$c;", "node", "", "c", "(Landroidx/compose/ui/Modifier$c;)Z", "Landroidx/compose/ui/node/LayoutNode;", "parentLayoutNode", "d", "(Landroidx/compose/ui/node/LayoutNode;)Z", "layoutNode", "LU0/f;", "pointerPosition", "Landroidx/compose/ui/node/w;", "hitTestResult", "Lg1/O;", "pointerType", "isInLayer", "", "b", "(Landroidx/compose/ui/node/LayoutNode;JLandroidx/compose/ui/node/w;IZ)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a implements f {
        @Override // androidx.compose.ui.node.NodeCoordinator.f
        public boolean d(LayoutNode parentLayoutNode) {
            return true;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.f
        public int a() {
            return C5952f0.a(16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [androidx.compose.ui.Modifier$c] */
        /* JADX WARN: Type inference failed for: r10v1, types: [androidx.compose.ui.Modifier$c] */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v11 */
        /* JADX WARN: Type inference failed for: r10v12 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [androidx.compose.ui.Modifier$c] */
        /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v7 */
        /* JADX WARN: Type inference failed for: r10v8 */
        /* JADX WARN: Type inference failed for: r10v9 */
        @Override // androidx.compose.ui.node.NodeCoordinator.f
        public boolean c(Modifier.c node) {
            int iA = C5952f0.a(16);
            D0.c cVar = null;
            while (node != 0) {
                if (node instanceof q0) {
                    if (((q0) node).n0()) {
                        return true;
                    }
                } else if ((node.getKindSet() & iA) != 0 && (node instanceof AbstractC5959m)) {
                    Modifier.c cVarL2 = node.getDelegate();
                    int i10 = 0;
                    node = node;
                    while (cVarL2 != null) {
                        if ((cVarL2.getKindSet() & iA) != 0) {
                            i10++;
                            if (i10 == 1) {
                                node = cVarL2;
                            } else {
                                if (cVar == null) {
                                    cVar = new D0.c(new Modifier.c[16], 0);
                                }
                                if (node != 0) {
                                    cVar.c(node);
                                    node = 0;
                                }
                                cVar.c(cVarL2);
                            }
                        }
                        cVarL2 = cVarL2.getChild();
                        node = node;
                    }
                    if (i10 == 1) {
                    }
                }
                node = C5957k.h(cVar);
            }
            return false;
        }

        a() {
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.f
        public void b(LayoutNode layoutNode, long pointerPosition, C5968w hitTestResult, int pointerType, boolean isInLayer) {
            layoutNode.u0(pointerPosition, hitTestResult, pointerType, isInLayer);
        }
    }

    @Metadata(d1 = {"\u0000G\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\bH\u0016ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"androidx/compose/ui/node/NodeCoordinator$b", "Landroidx/compose/ui/node/NodeCoordinator$f;", "Landroidx/compose/ui/node/f0;", "Landroidx/compose/ui/node/u0;", "a", "()I", "Landroidx/compose/ui/Modifier$c;", "node", "", "c", "(Landroidx/compose/ui/Modifier$c;)Z", "Landroidx/compose/ui/node/LayoutNode;", "parentLayoutNode", "d", "(Landroidx/compose/ui/node/LayoutNode;)Z", "layoutNode", "LU0/f;", "pointerPosition", "Landroidx/compose/ui/node/w;", "hitTestResult", "Lg1/O;", "pointerType", "isInLayer", "", "b", "(Landroidx/compose/ui/node/LayoutNode;JLandroidx/compose/ui/node/w;IZ)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b implements f {
        @Override // androidx.compose.ui.node.NodeCoordinator.f
        public boolean c(Modifier.c node) {
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.f
        public int a() {
            return C5952f0.a(8);
        }

        b() {
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.f
        public void b(LayoutNode layoutNode, long pointerPosition, C5968w hitTestResult, int pointerType, boolean isInLayer) {
            layoutNode.w0(pointerPosition, hitTestResult, pointerType, isInLayer);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.f
        public boolean d(LayoutNode parentLayoutNode) {
            SemanticsConfiguration semanticsConfiguration = parentLayoutNode.getSemanticsConfiguration();
            boolean z10 = false;
            if (semanticsConfiguration != null && semanticsConfiguration.getIsClearingSemantics()) {
                z10 = true;
            }
            return !z10;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "", "a", "(Landroidx/compose/ui/node/NodeCoordinator;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function1<NodeCoordinator, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f51528f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NodeCoordinator nodeCoordinator) {
            a(nodeCoordinator);
            return Unit.f143329a;
        }

        public final void a(NodeCoordinator nodeCoordinator) {
            OwnedLayer layer = nodeCoordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "", "a", "(Landroidx/compose/ui/node/NodeCoordinator;)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends Lambda implements Function1<NodeCoordinator, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f51529f = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NodeCoordinator nodeCoordinator) {
            a(nodeCoordinator);
            return Unit.f143329a;
        }

        public final void a(NodeCoordinator nodeCoordinator) {
            if (nodeCoordinator.e1() && NodeCoordinator.K3(nodeCoordinator, false, 1, null)) {
                LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
                M layoutDelegate = layoutNode.getLayoutDelegate();
                if (layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                    if (layoutDelegate.getCoordinatesAccessedDuringModifierPlacement() || layoutDelegate.getCoordinatesAccessedDuringPlacement()) {
                        LayoutNode.q1(layoutNode, false, 1, null);
                    }
                    layoutDelegate.getMeasurePassDelegate().i2();
                }
                Owner ownerB = L.b(layoutNode);
                ownerB.getRectManager().j(layoutNode);
                ownerB.f(layoutNode);
            }
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$e;", "", "<init>", "()V", "Landroidx/compose/ui/node/NodeCoordinator$f;", "PointerInputSource", "Landroidx/compose/ui/node/NodeCoordinator$f;", "a", "()Landroidx/compose/ui/node/NodeCoordinator$f;", "SemanticsSource", "b", "", "ExpectAttachedLayoutCoordinates", "Ljava/lang/String;", "UnmeasuredError", "Landroidx/compose/ui/graphics/g;", "graphicsLayerScope", "Landroidx/compose/ui/graphics/g;", "Lkotlin/Function1;", "Landroidx/compose/ui/node/NodeCoordinator;", "", "onCommitAffectingLayer", "Lkotlin/jvm/functions/Function1;", "onCommitAffectingLayerParams", "Landroidx/compose/ui/node/B;", "tmpLayerPositionalProperties", "Landroidx/compose/ui/node/B;", "LV0/k1;", "tmpMatrix", "[F", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.NodeCoordinator$e, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final f a() {
            return NodeCoordinator.f51504R;
        }

        public final f b() {
            return NodeCoordinator.f51505S;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ:\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0007H&ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$f;", "", "Landroidx/compose/ui/node/f0;", "a", "()I", "Landroidx/compose/ui/Modifier$c;", "node", "", "c", "(Landroidx/compose/ui/Modifier$c;)Z", "Landroidx/compose/ui/node/LayoutNode;", "parentLayoutNode", "d", "(Landroidx/compose/ui/node/LayoutNode;)Z", "layoutNode", "LU0/f;", "pointerPosition", "Landroidx/compose/ui/node/w;", "hitTestResult", "Lg1/O;", "pointerType", "isInLayer", "", "b", "(Landroidx/compose/ui/node/LayoutNode;JLandroidx/compose/ui/node/w;IZ)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface f {
        int a();

        void b(LayoutNode layoutNode, long pointerPosition, C5968w hitTestResult, int pointerType, boolean isInLayer);

        boolean c(Modifier.c node);

        boolean d(LayoutNode parentLayoutNode);
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class g extends Lambda implements Function0<Unit> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            NodeCoordinator wrappedBy = NodeCoordinator.this.getWrappedBy();
            if (wrappedBy != null) {
                wrappedBy.Y2();
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    static final class h extends Lambda implements Function0<Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier.c f51534g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ f f51535h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f51536i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C5968w f51537j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f51538k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f51539l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ float f51540m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f51541n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Modifier.c cVar, f fVar, long j10, C5968w c5968w, int i10, boolean z10, float f10, boolean z11) {
            super(0);
            this.f51534g = cVar;
            this.f51535h = fVar;
            this.f51536i = j10;
            this.f51537j = c5968w;
            this.f51538k = i10;
            this.f51539l = z10;
            this.f51540m = f10;
            this.f51541n = z11;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            NodeCoordinator.this.m3(C5950e0.d(this.f51534g, this.f51535h.a(), C5952f0.a(2)), this.f51535h, this.f51536i, this.f51537j, this.f51538k, this.f51539l, this.f51540m, this.f51541n);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    static final class i extends Lambda implements Function0<Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier.c f51543g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ f f51544h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f51545i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C5968w f51546j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f51547k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f51548l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ float f51549m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Modifier.c cVar, f fVar, long j10, C5968w c5968w, int i10, boolean z10, float f10) {
            super(0);
            this.f51543g = cVar;
            this.f51544h = fVar;
            this.f51545i = j10;
            this.f51546j = c5968w;
            this.f51547k = i10;
            this.f51548l = z10;
            this.f51549m = f10;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            NodeCoordinator.this.m3(C5950e0.d(this.f51543g, this.f51544h.a(), C5952f0.a(2)), this.f51544h, this.f51545i, this.f51546j, this.f51547k, this.f51548l, this.f51549m, false);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class j extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.ui.graphics.e, Unit> f51550f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(Function1<? super androidx.compose.ui.graphics.e, Unit> function1) {
            super(0);
            this.f51550f = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f51550f.invoke(NodeCoordinator.f51501O);
            NodeCoordinator.f51501O.X();
        }
    }

    private final void G3(NodeCoordinator ancestor, float[] matrix) {
        NodeCoordinator nodeCoordinator = this;
        while (!Intrinsics.e(nodeCoordinator, ancestor)) {
            OwnedLayer ownedLayer = nodeCoordinator.layer;
            if (ownedLayer != null) {
                ownedLayer.a(matrix);
            }
            if (!H1.n.j(nodeCoordinator.getPosition(), H1.n.INSTANCE.b())) {
                float[] fArr = f51503Q;
                C5474k1.h(fArr);
                C5474k1.o(fArr, H1.n.k(r1), H1.n.l(r1), 0.0f, 4, null);
                C5474k1.l(matrix, fArr);
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            Intrinsics.g(nodeCoordinator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    private final boolean Z2(Modifier.c cVar, long j10, int i10) {
        if (cVar == 0) {
            return false;
        }
        O.Companion companion = g1.O.INSTANCE;
        if (!g1.O.g(i10, companion.c()) && !g1.O.g(i10, companion.a())) {
            return false;
        }
        int iA = C5952f0.a(16);
        D0.c cVar2 = null;
        while (cVar != 0) {
            if (cVar instanceof q0) {
                long jB1 = ((q0) cVar).b1();
                int i11 = (int) (j10 >> 32);
                if (Float.intBitsToFloat(i11) >= (-y0.b(jB1, getLayoutDirection())) && Float.intBitsToFloat(i11) < M0() + y0.c(jB1, getLayoutDirection())) {
                    int i12 = (int) (j10 & 4294967295L);
                    if (Float.intBitsToFloat(i12) >= (-y0.h(jB1)) && Float.intBitsToFloat(i12) < J0() + y0.e(jB1)) {
                        return true;
                    }
                }
                return false;
            }
            if ((cVar.getKindSet() & iA) != 0 && (cVar instanceof AbstractC5959m)) {
                Modifier.c cVarL2 = cVar.getDelegate();
                int i13 = 0;
                cVar = cVar;
                while (cVarL2 != null) {
                    if ((cVarL2.getKindSet() & iA) != 0) {
                        i13++;
                        if (i13 == 1) {
                            cVar = cVarL2;
                        } else {
                            if (cVar2 == null) {
                                cVar2 = new D0.c(new Modifier.c[16], 0);
                            }
                            if (cVar != 0) {
                                cVar2.c(cVar);
                                cVar = 0;
                            }
                            cVar2.c(cVarL2);
                        }
                    }
                    cVarL2 = cVarL2.getChild();
                    cVar = cVar;
                }
                if (i13 == 1) {
                }
            }
            cVar = C5957k.h(cVar2);
        }
        return false;
    }

    public static Canvas _fsGetCanvasFromDrawBlock(Function0 function0) {
        NodeCoordinator nodeCoordinator;
        if (!(function0 instanceof NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1) || (nodeCoordinator = ((NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1) function0).this$0) == null) {
            return null;
        }
        return nodeCoordinator.getDrawBlockCanvas();
    }

    public static void _fsMaybeObserveReads(OwnerSnapshotObserver ownerSnapshotObserver, OwnerScope ownerScope, Function1 function1, Function0 function0) {
        Canvas canvas_fsGetCanvasFromDrawBlock = _fsGetCanvasFromDrawBlock(function0);
        if (FS.compose_shouldObserveReads(canvas_fsGetCanvasFromDrawBlock != null ? AndroidCanvas_androidKt.getNativeCanvas(canvas_fsGetCanvasFromDrawBlock) : null)) {
            ownerSnapshotObserver.observeReads$ui_release(ownerScope, function1, function0);
        } else {
            function0.invoke();
        }
    }

    private final void o3(long position, float zIndex, Function1<? super androidx.compose.ui.graphics.e, Unit> layerBlock, GraphicsLayer explicitLayer) {
        if (explicitLayer != null) {
            if (!(layerBlock == null)) {
                C14920a.a("both ways to create layers shouldn't be used together");
            }
            if (this.explicitLayer != explicitLayer) {
                this.explicitLayer = null;
                I3(this, null, false, 2, null);
                this.explicitLayer = explicitLayer;
            }
            if (this.layer == null) {
                OwnedLayer ownedLayerM = Owner.m(L.b(getLayoutNode()), D2(), this.invalidateParentLayer, explicitLayer, false, 8, null);
                ownedLayerM.e(getMeasuredSize());
                ownedLayerM.i(position);
                this.layer = ownedLayerM;
                getLayoutNode().y1(true);
                this.invalidateParentLayer.invoke();
            }
        } else {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
                I3(this, null, false, 2, null);
            }
            I3(this, layerBlock, false, 2, null);
        }
        if (!H1.n.j(getPosition(), position)) {
            w3(position);
            getLayoutNode().getLayoutDelegate().getMeasurePassDelegate().i2();
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.i(position);
            } else {
                NodeCoordinator nodeCoordinator = this.wrappedBy;
                if (nodeCoordinator != null) {
                    nodeCoordinator.Y2();
                }
            }
            y1(this);
            Owner owner = getLayoutNode().getOwner();
            if (owner != null) {
                owner.i(getLayoutNode());
            }
        }
        this.zIndex = zIndex;
        if (getIsPlacingForAlignment()) {
            return;
        }
        j1(s1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w2(Canvas canvas, GraphicsLayer graphicsLayer) {
        Modifier.c cVarS2 = S2(C5952f0.a(4));
        if (cVarS2 == null) {
            n3(canvas, graphicsLayer);
        } else {
            getLayoutNode().c0().a(canvas, H1.s.d(c()), this, cVarS2, graphicsLayer);
        }
    }

    public final void H3(Function1<? super androidx.compose.ui.graphics.e, Unit> layerBlock, boolean forceUpdateLayerParameters) {
        Owner owner;
        if (!(layerBlock == null || this.explicitLayer == null)) {
            C14920a.a("layerBlock can't be provided when explicitLayer is provided");
        }
        LayoutNode layoutNode = getLayoutNode();
        boolean z10 = (!forceUpdateLayerParameters && this.layerBlock == layerBlock && Intrinsics.e(this.layerDensity, layoutNode.getDensity()) && this.layerLayoutDirection == layoutNode.getLayoutDirection()) ? false : true;
        this.layerDensity = layoutNode.getDensity();
        this.layerLayoutDirection = layoutNode.getLayoutDirection();
        if (!layoutNode.isAttached() || layerBlock == null) {
            this.layerBlock = null;
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.destroy();
                layoutNode.y1(true);
                this.invalidateParentLayer.invoke();
                if (isAttached() && layoutNode.f() && (owner = layoutNode.getOwner()) != null) {
                    owner.i(layoutNode);
                }
            }
            this.layer = null;
            this.lastLayerDrawingWasSkipped = false;
            return;
        }
        this.layerBlock = layerBlock;
        if (this.layer != null) {
            if (z10 && K3(this, false, 1, null)) {
                L.b(layoutNode).getRectManager().j(layoutNode);
                return;
            }
            return;
        }
        OwnedLayer ownedLayerM = Owner.m(L.b(layoutNode), D2(), this.invalidateParentLayer, null, layoutNode.getForceUseOldLayers(), 4, null);
        ownedLayerM.e(getMeasuredSize());
        ownedLayerM.i(getPosition());
        this.layer = ownedLayerM;
        K3(this, false, 1, null);
        layoutNode.y1(true);
        this.invalidateParentLayer.invoke();
    }

    /* renamed from: I2 */
    public abstract S getLookaheadDelegate();

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public long J(LayoutCoordinates sourceCoordinates, long relativeToSource) {
        return F(sourceCoordinates, relativeToSource, true);
    }

    public abstract Modifier.c N2();

    public final void W2(f hitTestSource, long pointerPosition, C5968w hitTestResult, int pointerType, boolean isInLayer) {
        boolean z10;
        Modifier.c cVarS2 = S2(hitTestSource.a());
        boolean z11 = false;
        if (!L3(pointerPosition)) {
            if (g1.O.g(pointerType, g1.O.INSTANCE.d())) {
                float fT2 = t2(pointerPosition, J2());
                if ((Float.floatToRawIntBits(fT2) & a.e.API_PRIORITY_OTHER) >= 2139095040 || !hitTestResult.w(fT2, false)) {
                    return;
                }
                V2(cVarS2, hitTestSource, pointerPosition, hitTestResult, pointerType, false, fT2);
                return;
            }
            return;
        }
        if (cVarS2 == null) {
            X2(hitTestSource, pointerPosition, hitTestResult, pointerType, isInLayer);
            return;
        }
        if (a3(pointerPosition)) {
            U2(cVarS2, hitTestSource, pointerPosition, hitTestResult, pointerType, isInLayer);
            return;
        }
        float fT22 = !g1.O.g(pointerType, g1.O.INSTANCE.d()) ? Float.POSITIVE_INFINITY : t2(pointerPosition, J2());
        if ((Float.floatToRawIntBits(fT22) & a.e.API_PRIORITY_OTHER) < 2139095040) {
            z10 = isInLayer;
            if (hitTestResult.w(fT22, z10)) {
                z11 = true;
            }
        } else {
            z10 = isInLayer;
        }
        m3(cVarS2, hitTestSource, pointerPosition, hitTestResult, pointerType, z10, fT22, z11);
    }

    /* renamed from: _fsGetDrawBlockCanvas, reason: from getter */
    public final Canvas getDrawBlockCanvas() {
        return this.drawBlockCanvas;
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeNodeCoordinator
    public final boolean _fsIsTransparent() {
        return isTransparent();
    }

    public final void k3() {
        this.released = true;
        this.invalidateParentLayer.invoke();
        s3();
    }

    @Override // androidx.compose.ui.node.Q
    public LayoutCoordinates q1() {
        return this;
    }

    public abstract void x2();

    public static /* synthetic */ long A2(NodeCoordinator nodeCoordinator, long j10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return nodeCoordinator.z2(j10, z10);
    }

    private final void A3(Modifier.c cVar, f fVar, long j10, C5968w c5968w, int i10, boolean z10, float f10) {
        if (cVar == null) {
            X2(fVar, j10, c5968w, i10, z10);
        } else if (fVar.c(cVar)) {
            c5968w.C(cVar, f10, z10, new i(cVar, fVar, j10, c5968w, i10, z10, f10));
        } else {
            m3(C5950e0.d(cVar, fVar.a(), C5952f0.a(2)), fVar, j10, c5968w, i10, z10, f10, false);
        }
    }

    private final NodeCoordinator B3(LayoutCoordinates layoutCoordinates) {
        NodeCoordinator nodeCoordinatorA;
        androidx.compose.ui.layout.G g10 = layoutCoordinates instanceof androidx.compose.ui.layout.G ? (androidx.compose.ui.layout.G) layoutCoordinates : null;
        if (g10 != null && (nodeCoordinatorA = g10.a()) != null) {
            return nodeCoordinatorA;
        }
        Intrinsics.h(layoutCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator) layoutCoordinates;
    }

    private final Function2<Canvas, GraphicsLayer, Unit> D2() {
        Function2 function2 = this._drawBlock;
        if (function2 != null) {
            return function2;
        }
        final NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1 nodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1 = new NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1(this);
        Function2<Canvas, GraphicsLayer, Unit> function22 = new Function2<Canvas, GraphicsLayer, Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Canvas canvas, GraphicsLayer graphicsLayer) {
                invoke2(canvas, graphicsLayer);
                return Unit.f143329a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Canvas canvas, GraphicsLayer graphicsLayer) {
                if (!this.f51530f.getLayoutNode().f()) {
                    this.f51530f.lastLayerDrawingWasSkipped = true;
                    return;
                }
                this.f51530f.drawBlockCanvas = canvas;
                this.f51530f.drawBlockParentLayer = graphicsLayer;
                NodeCoordinator._fsMaybeObserveReads(this.f51530f.M2(), this.f51530f, NodeCoordinator.f51500N, nodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1);
                this.f51530f.lastLayerDrawingWasSkipped = false;
            }
        };
        this._drawBlock = function22;
        return function22;
    }

    public static /* synthetic */ long D3(NodeCoordinator nodeCoordinator, long j10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return nodeCoordinator.C3(j10, z10);
    }

    public static /* synthetic */ void I3(NodeCoordinator nodeCoordinator, Function1 function1, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        nodeCoordinator.H3(function1, z10);
    }

    private final boolean J3(boolean invokeOnLayoutChange) {
        Owner owner;
        if (this.explicitLayer != null) {
            return false;
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer == null) {
            if (!(this.layerBlock == null)) {
                C14920a.b("null layer with a non-null layerBlock");
            }
            return false;
        }
        Function1<? super androidx.compose.ui.graphics.e, Unit> function1 = this.layerBlock;
        if (function1 == null) {
            C14920a.c("updateLayerParameters requires a non-null layerBlock");
            throw new KotlinNothingValueException();
        }
        androidx.compose.ui.graphics.g gVar = f51501O;
        gVar.O();
        gVar.R(getLayoutNode().getDensity());
        gVar.U(getLayoutNode().getLayoutDirection());
        gVar.W(H1.s.d(c()));
        M2().observeReads$ui_release(this, f51499M, new j(function1));
        B b10 = this.layerPositionalProperties;
        if (b10 == null) {
            b10 = new B();
            this.layerPositionalProperties = b10;
        }
        B b11 = f51502P;
        b11.b(b10);
        b10.a(gVar);
        ownedLayer.g(gVar);
        boolean z10 = this.isClipping;
        this.isClipping = gVar.getClip();
        this.lastLayerAlpha = gVar.getAlpha();
        boolean zC = b11.c(b10);
        boolean z11 = !zC;
        if (invokeOnLayoutChange && ((!zC || z10 != this.isClipping) && (owner = getLayoutNode().getOwner()) != null)) {
            owner.i(getLayoutNode());
        }
        return z11;
    }

    static /* synthetic */ boolean K3(NodeCoordinator nodeCoordinator, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return nodeCoordinator.J3(z10);
    }

    private final void U2(Modifier.c cVar, f fVar, long j10, C5968w c5968w, int i10, boolean z10) {
        if (cVar == null) {
            X2(fVar, j10, c5968w, i10, z10);
            return;
        }
        int i11 = c5968w.hitDepth;
        c5968w.B(c5968w.hitDepth + 1, c5968w.size());
        c5968w.hitDepth++;
        c5968w.values.n(cVar);
        c5968w.distanceFromEdgeAndFlags.d(C5969x.a(-1.0f, z10, false));
        U2(C5950e0.d(cVar, fVar.a(), C5952f0.a(2)), fVar, j10, c5968w, i10, z10);
        c5968w.hitDepth = i11;
    }

    private final void V2(Modifier.c cVar, f fVar, long j10, C5968w c5968w, int i10, boolean z10, float f10) {
        if (cVar == null) {
            X2(fVar, j10, c5968w, i10, z10);
            return;
        }
        int i11 = c5968w.hitDepth;
        c5968w.B(c5968w.hitDepth + 1, c5968w.size());
        c5968w.hitDepth++;
        c5968w.values.n(cVar);
        c5968w.distanceFromEdgeAndFlags.d(C5969x.a(f10, z10, false));
        m3(C5950e0.d(cVar, fVar.a(), C5952f0.a(2)), fVar, j10, c5968w, i10, z10, f10, true);
        c5968w.hitDepth = i11;
    }

    private final long b3(long pointerPosition) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (pointerPosition >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat < 0.0f ? -fIntBitsToFloat : fIntBitsToFloat - M0());
        return U0.f.e((Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (pointerPosition & 4294967295L)) < 0.0f ? -r6 : r6 - J0())) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m3(Modifier.c cVar, f fVar, long j10, C5968w c5968w, int i10, boolean z10, float f10, boolean z11) {
        if (cVar == null) {
            X2(fVar, j10, c5968w, i10, z10);
            return;
        }
        if (Z2(cVar, j10, i10)) {
            c5968w.u(cVar, z10, new h(cVar, fVar, j10, c5968w, i10, z10, f10, z11));
        } else if (z11) {
            V2(cVar, fVar, j10, c5968w, i10, z10, f10);
        } else {
            A3(cVar, fVar, j10, c5968w, i10, z10, f10);
        }
    }

    private final void q2(NodeCoordinator ancestor, MutableRect rect, boolean clipBounds) {
        if (ancestor == this) {
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.q2(ancestor, rect, clipBounds);
        }
        B2(rect, clipBounds);
    }

    private final long r2(NodeCoordinator ancestor, long offset, boolean includeMotionFrameOfReference) {
        if (ancestor == this) {
            return offset;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        return (nodeCoordinator == null || Intrinsics.e(ancestor, nodeCoordinator)) ? z2(offset, includeMotionFrameOfReference) : z2(nodeCoordinator.r2(ancestor, offset, includeMotionFrameOfReference), includeMotionFrameOfReference);
    }

    public static /* synthetic */ void r3(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        nodeCoordinator.q3(mutableRect, z10, z11);
    }

    public long C3(long position, boolean includeMotionFrameOfReference) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            position = ownedLayer.c(position, false);
        }
        return (includeMotionFrameOfReference || !getIsPlacedUnderMotionFrameOfReference()) ? H1.o.c(position, getPosition()) : position;
    }

    /* renamed from: E2, reason: from getter */
    public final boolean getForceMeasureWithLookaheadConstraints() {
        return this.forceMeasureWithLookaheadConstraints;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public long F(LayoutCoordinates sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
        if (sourceCoordinates instanceof androidx.compose.ui.layout.G) {
            ((androidx.compose.ui.layout.G) sourceCoordinates).a().d3();
            return U0.f.e(sourceCoordinates.F(this, U0.f.e(relativeToSource ^ (-9223372034707292160L)), includeMotionFrameOfReference) ^ (-9223372034707292160L));
        }
        NodeCoordinator nodeCoordinatorB3 = B3(sourceCoordinates);
        nodeCoordinatorB3.d3();
        NodeCoordinator nodeCoordinatorY2 = y2(nodeCoordinatorB3);
        while (nodeCoordinatorB3 != nodeCoordinatorY2) {
            relativeToSource = nodeCoordinatorB3.C3(relativeToSource, includeMotionFrameOfReference);
            nodeCoordinatorB3 = nodeCoordinatorB3.wrappedBy;
            Intrinsics.g(nodeCoordinatorB3);
        }
        return r2(nodeCoordinatorY2, relativeToSource, includeMotionFrameOfReference);
    }

    /* renamed from: F2, reason: from getter */
    public final boolean getLastLayerDrawingWasSkipped() {
        return this.lastLayerDrawingWasSkipped;
    }

    /* renamed from: H2, reason: from getter */
    public final OwnedLayer getLayer() {
        return this.layer;
    }

    public final long J2() {
        return this.layerDensity.T(getLayoutNode().getViewConfiguration().e());
    }

    protected final MutableRect L2() {
        MutableRect mutableRect = this._rectCache;
        if (mutableRect != null) {
            return mutableRect;
        }
        MutableRect mutableRect2 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
        this._rectCache = mutableRect2;
        return mutableRect2;
    }

    /* renamed from: O2, reason: from getter */
    public final NodeCoordinator getWrapped() {
        return this.wrapped;
    }

    /* renamed from: P2, reason: from getter */
    public final NodeCoordinator getWrappedBy() {
        return this.wrappedBy;
    }

    /* renamed from: Q2, reason: from getter */
    public final float getZIndex() {
        return this.zIndex;
    }

    @Override // androidx.compose.ui.node.Q
    public void R1() {
        GraphicsLayer graphicsLayer = this.explicitLayer;
        if (graphicsLayer != null) {
            T0(getPosition(), this.zIndex, graphicsLayer);
        } else {
            V0(getPosition(), this.zIndex, this.layerBlock);
        }
    }

    @Override // androidx.compose.ui.node.Q, androidx.compose.ui.node.W
    /* renamed from: S1, reason: from getter */
    public LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.f0
    public void T0(long position, float zIndex, GraphicsLayer layer) {
        if (!this.forcePlaceWithLookaheadOffset) {
            o3(position, zIndex, null, layer);
            return;
        }
        S sI2 = getLookaheadDelegate();
        Intrinsics.g(sI2);
        o3(sI2.getPosition(), zIndex, null, layer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.f0
    public void V0(long position, float zIndex, Function1<? super androidx.compose.ui.graphics.e, Unit> layerBlock) {
        if (!this.forcePlaceWithLookaheadOffset) {
            o3(position, zIndex, layerBlock, null);
            return;
        }
        S sI2 = getLookaheadDelegate();
        Intrinsics.g(sI2);
        o3(sI2.getPosition(), zIndex, layerBlock, null);
    }

    public void X2(f hitTestSource, long pointerPosition, C5968w hitTestResult, int pointerType, boolean isInLayer) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.W2(hitTestSource, A2(nodeCoordinator, pointerPosition, false, 2, null), hitTestResult, pointerType, isInLayer);
        }
    }

    public void Y2() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.Y2();
        }
    }

    protected final boolean a3(long pointerPosition) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (pointerPosition >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (pointerPosition & 4294967295L));
        return fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < ((float) M0()) && fIntBitsToFloat2 < ((float) J0());
    }

    public final void c3() {
        if (this.layer != null || this.layerBlock == null) {
            return;
        }
        OwnedLayer ownedLayerM = Owner.m(L.b(getLayoutNode()), D2(), this.invalidateParentLayer, this.explicitLayer, false, 8, null);
        ownedLayerM.e(getMeasuredSize());
        ownedLayerM.i(getPosition());
        ownedLayerM.invalidate();
        this.layer = ownedLayerM;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean e1() {
        return (this.layer == null || this.released || !getLayoutNode().isAttached()) ? false : true;
    }

    public final void e3() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.destroy();
        }
        this.layer = null;
    }

    public void f3() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public final void g3() {
        H3(this.layerBlock, true);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    protected void h3(int width, int height) {
        NodeCoordinator nodeCoordinator;
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.e(H1.r.c((width << 32) | (height & 4294967295L)));
        } else if (getLayoutNode().f() && (nodeCoordinator = this.wrappedBy) != null) {
            nodeCoordinator.Y2();
        }
        Z0(H1.r.c((height & 4294967295L) | (width << 32)));
        if (this.layerBlock != null) {
            J3(false);
        }
        int iA = C5952f0.a(4);
        boolean zI = g0.i(iA);
        Modifier.c cVarN2 = N2();
        if (zI || (cVarN2 = cVarN2.getParent()) != null) {
            for (Modifier.c cVarT2 = T2(zI); cVarT2 != null && (cVarT2.getAggregateChildKindSet() & iA) != 0; cVarT2 = cVarT2.getChild()) {
                if ((cVarT2.getKindSet() & iA) != 0) {
                    AbstractC5959m abstractC5959mH = cVarT2;
                    D0.c cVar = null;
                    while (abstractC5959mH != 0) {
                        if (abstractC5959mH instanceof InterfaceC5965t) {
                            ((InterfaceC5965t) abstractC5959mH).z1();
                        } else if ((abstractC5959mH.getKindSet() & iA) != 0 && (abstractC5959mH instanceof AbstractC5959m)) {
                            Modifier.c cVarL2 = abstractC5959mH.getDelegate();
                            int i10 = 0;
                            abstractC5959mH = abstractC5959mH;
                            while (cVarL2 != null) {
                                if ((cVarL2.getKindSet() & iA) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        abstractC5959mH = cVarL2;
                                    } else {
                                        if (cVar == null) {
                                            cVar = new D0.c(new Modifier.c[16], 0);
                                        }
                                        if (abstractC5959mH != 0) {
                                            cVar.c(abstractC5959mH);
                                            abstractC5959mH = 0;
                                        }
                                        cVar.c(cVarL2);
                                    }
                                }
                                cVarL2 = cVarL2.getChild();
                                abstractC5959mH = abstractC5959mH;
                            }
                            if (i10 == 1) {
                            }
                        }
                        abstractC5959mH = C5957k.h(cVar);
                    }
                }
                if (cVarT2 == cVarN2) {
                    break;
                }
            }
        }
        Owner owner = getLayoutNode().getOwner();
        if (owner != null) {
            owner.i(getLayoutNode());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r8v7, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    public final void i3() {
        Modifier.c parent;
        if (R2(C5952f0.a(128))) {
            g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
            androidx.compose.runtime.snapshots.g gVarD = companion.d();
            Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
            androidx.compose.runtime.snapshots.g gVarE = companion.e(gVarD);
            try {
                int iA = C5952f0.a(128);
                boolean zI = g0.i(iA);
                if (!zI) {
                    parent = N2().getParent();
                    if (parent == null) {
                    }
                    Unit unit = Unit.f143329a;
                    companion.l(gVarD, gVarE, function1G);
                }
                parent = N2();
                for (Modifier.c cVarT2 = T2(zI); cVarT2 != null && (cVarT2.getAggregateChildKindSet() & iA) != 0; cVarT2 = cVarT2.getChild()) {
                    if ((cVarT2.getKindSet() & iA) != 0) {
                        D0.c cVar = null;
                        AbstractC5959m abstractC5959mH = cVarT2;
                        while (abstractC5959mH != 0) {
                            if (abstractC5959mH instanceof C) {
                                ((C) abstractC5959mH).f(getMeasuredSize());
                            } else if ((abstractC5959mH.getKindSet() & iA) != 0 && (abstractC5959mH instanceof AbstractC5959m)) {
                                Modifier.c cVarL2 = abstractC5959mH.getDelegate();
                                int i10 = 0;
                                abstractC5959mH = abstractC5959mH;
                                while (cVarL2 != null) {
                                    if ((cVarL2.getKindSet() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            abstractC5959mH = cVarL2;
                                        } else {
                                            if (cVar == null) {
                                                cVar = new D0.c(new Modifier.c[16], 0);
                                            }
                                            if (abstractC5959mH != 0) {
                                                cVar.c(abstractC5959mH);
                                                abstractC5959mH = 0;
                                            }
                                            cVar.c(cVarL2);
                                        }
                                    }
                                    cVarL2 = cVarL2.getChild();
                                    abstractC5959mH = abstractC5959mH;
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC5959mH = C5957k.h(cVar);
                        }
                    }
                    if (cVarT2 == parent) {
                        break;
                    }
                }
                Unit unit2 = Unit.f143329a;
                companion.l(gVarD, gVarE, function1G);
            } catch (Throwable th2) {
                companion.l(gVarD, gVarE, function1G);
                throw th2;
            }
        }
    }

    public final boolean isTransparent() {
        if (this.layer != null && this.lastLayerAlpha <= 0.0f) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            return nodeCoordinator.isTransparent();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void j3() {
        int iA = C5952f0.a(128);
        boolean zI = g0.i(iA);
        Modifier.c cVarN2 = N2();
        if (!zI && (cVarN2 = cVarN2.getParent()) == null) {
            return;
        }
        for (Modifier.c cVarT2 = T2(zI); cVarT2 != null && (cVarT2.getAggregateChildKindSet() & iA) != 0; cVarT2 = cVarT2.getChild()) {
            if ((cVarT2.getKindSet() & iA) != 0) {
                AbstractC5959m abstractC5959mH = cVarT2;
                D0.c cVar = null;
                while (abstractC5959mH != 0) {
                    if (abstractC5959mH instanceof C) {
                        ((C) abstractC5959mH).s(this);
                    } else if ((abstractC5959mH.getKindSet() & iA) != 0 && (abstractC5959mH instanceof AbstractC5959m)) {
                        Modifier.c cVarL2 = abstractC5959mH.getDelegate();
                        int i10 = 0;
                        abstractC5959mH = abstractC5959mH;
                        while (cVarL2 != null) {
                            if ((cVarL2.getKindSet() & iA) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    abstractC5959mH = cVarL2;
                                } else {
                                    if (cVar == null) {
                                        cVar = new D0.c(new Modifier.c[16], 0);
                                    }
                                    if (abstractC5959mH != 0) {
                                        cVar.c(abstractC5959mH);
                                        abstractC5959mH = 0;
                                    }
                                    cVar.c(cVarL2);
                                }
                            }
                            cVarL2 = cVarL2.getChild();
                            abstractC5959mH = abstractC5959mH;
                        }
                        if (i10 == 1) {
                        }
                    }
                    abstractC5959mH = C5957k.h(cVar);
                }
            }
            if (cVarT2 == cVarN2) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void l3() {
        if (R2(C5952f0.a(1048576))) {
            int iA = C5952f0.a(1048576);
            boolean zI = g0.i(iA);
            Modifier.c cVarN2 = N2();
            if (!zI && (cVarN2 = cVarN2.getParent()) == null) {
                return;
            }
            for (Modifier.c cVarT2 = T2(zI); cVarT2 != null && (cVarT2.getAggregateChildKindSet() & iA) != 0; cVarT2 = cVarT2.getChild()) {
                if ((cVarT2.getKindSet() & iA) != 0) {
                    AbstractC5959m abstractC5959mH = cVarT2;
                    D0.c cVar = null;
                    while (abstractC5959mH != 0) {
                        if (abstractC5959mH instanceof m0) {
                            ((m0) abstractC5959mH).e2();
                        } else if ((abstractC5959mH.getKindSet() & iA) != 0 && (abstractC5959mH instanceof AbstractC5959m)) {
                            Modifier.c cVarL2 = abstractC5959mH.getDelegate();
                            int i10 = 0;
                            abstractC5959mH = abstractC5959mH;
                            while (cVarL2 != null) {
                                if ((cVarL2.getKindSet() & iA) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        abstractC5959mH = cVarL2;
                                    } else {
                                        if (cVar == null) {
                                            cVar = new D0.c(new Modifier.c[16], 0);
                                        }
                                        if (abstractC5959mH != 0) {
                                            cVar.c(abstractC5959mH);
                                            abstractC5959mH = 0;
                                        }
                                        cVar.c(cVarL2);
                                    }
                                }
                                cVarL2 = cVarL2.getChild();
                                abstractC5959mH = abstractC5959mH;
                            }
                            if (i10 == 1) {
                            }
                        }
                        abstractC5959mH = C5957k.h(cVar);
                    }
                }
                if (cVarT2 == cVarN2) {
                    return;
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.Q
    public Q m1() {
        return this.wrapped;
    }

    public void n3(Canvas canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.u2(canvas, graphicsLayer);
        }
    }

    public final void q3(MutableRect bounds, boolean clipBounds, boolean clipToMinimumTouchTargetSize) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (this.isClipping) {
                if (clipToMinimumTouchTargetSize) {
                    long jJ2 = J2();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jJ2 >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jJ2 & 4294967295L)) / 2.0f;
                    bounds.e(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (c() >> 32)) + fIntBitsToFloat, ((int) (4294967295L & c())) + fIntBitsToFloat2);
                } else if (clipBounds) {
                    bounds.e(0.0f, 0.0f, (int) (c() >> 32), (int) (4294967295L & c()));
                }
                if (bounds.f()) {
                    return;
                }
            }
            ownedLayer.b(bounds, false);
        }
        float fK = H1.n.k(getPosition());
        bounds.i(bounds.getLeft() + fK);
        bounds.j(bounds.getRight() + fK);
        float fL = H1.n.l(getPosition());
        bounds.k(bounds.getTop() + fL);
        bounds.h(bounds.getBottom() + fL);
    }

    @Override // androidx.compose.ui.node.Q
    public boolean r1() {
        return this._measureResult != null;
    }

    @Override // androidx.compose.ui.node.Q
    public androidx.compose.ui.layout.J s1() {
        androidx.compose.ui.layout.J j10 = this._measureResult;
        if (j10 != null) {
            return j10;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    protected final long s2(long minimumTouchTargetSize) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (minimumTouchTargetSize >> 32)) - M0();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (minimumTouchTargetSize & 4294967295L)) - J0();
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        float fMax2 = Math.max(0.0f, fIntBitsToFloat2 / 2.0f);
        return U0.k.d((Float.floatToRawIntBits(fMax2) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32));
    }

    public final void s3() {
        if (this.layer != null) {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
            }
            I3(this, null, false, 2, null);
            LayoutNode.q1(getLayoutNode(), false, 1, null);
        }
    }

    public final void t3(boolean z10) {
        this.forceMeasureWithLookaheadConstraints = z10;
    }

    @Override // androidx.compose.ui.node.Q
    public Q u1() {
        return this.wrappedBy;
    }

    public final void u2(Canvas canvas, GraphicsLayer graphicsLayer) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.drawLayer(canvas, graphicsLayer);
            return;
        }
        float fK = H1.n.k(getPosition());
        float fL = H1.n.l(getPosition());
        canvas.d(fK, fL);
        w2(canvas, graphicsLayer);
        canvas.d(-fK, -fL);
    }

    public final void u3(boolean z10) {
        this.forcePlaceWithLookaheadOffset = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v3(androidx.compose.ui.layout.J r4) {
        /*
            r3 = this;
            androidx.compose.ui.layout.J r0 = r3._measureResult
            if (r4 == r0) goto L8c
            r3._measureResult = r4
            if (r0 == 0) goto L1c
            int r1 = r4.getWidth()
            int r2 = r0.getWidth()
            if (r1 != r2) goto L1c
            int r1 = r4.getHeight()
            int r0 = r0.getHeight()
            if (r1 == r0) goto L27
        L1c:
            int r0 = r4.getWidth()
            int r1 = r4.getHeight()
            r3.h3(r0, r1)
        L27:
            Z.S<androidx.compose.ui.layout.a> r0 = r3.oldAlignmentLines
            if (r0 == 0) goto L34
            kotlin.jvm.internal.Intrinsics.g(r0)
            boolean r0 = r0.h()
            if (r0 != 0) goto L3e
        L34:
            java.util.Map r0 = r4.r()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L8c
        L3e:
            Z.S<androidx.compose.ui.layout.a> r0 = r3.oldAlignmentLines
            java.util.Map r1 = r4.r()
            boolean r0 = androidx.compose.ui.node.C5950e0.a(r0, r1)
            if (r0 != 0) goto L8c
            androidx.compose.ui.node.b r0 = r3.C2()
            androidx.compose.ui.node.a r0 = r0.getAlignmentLines()
            r0.m()
            Z.S<androidx.compose.ui.layout.a> r0 = r3.oldAlignmentLines
            if (r0 != 0) goto L5f
            Z.S r0 = Z.b0.b()
            r3.oldAlignmentLines = r0
        L5f:
            r0.j()
            java.util.Map r4 = r4.r()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L6e:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L8c
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r0.u(r2, r1)
            goto L6e
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeCoordinator.v3(androidx.compose.ui.layout.J):void");
    }

    @Override // androidx.compose.ui.node.Q
    /* renamed from: w1, reason: from getter */
    public long getPosition() {
        return this.position;
    }

    protected void w3(long j10) {
        this.position = j10;
    }

    public final void x3(NodeCoordinator nodeCoordinator) {
        this.wrapped = nodeCoordinator;
    }

    public final void y3(NodeCoordinator nodeCoordinator) {
        this.wrappedBy = nodeCoordinator;
    }

    public long z2(long position, boolean includeMotionFrameOfReference) {
        if (includeMotionFrameOfReference || !getIsPlacedUnderMotionFrameOfReference()) {
            position = H1.o.b(position, getPosition());
        }
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer != null ? ownedLayer.c(position, true) : position;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final boolean z3() {
        Modifier.c cVarT2 = T2(g0.i(C5952f0.a(16)));
        if (cVarT2 != null && cVarT2.getIsAttached()) {
            int iA = C5952f0.a(16);
            if (!cVarT2.getNode().getIsAttached()) {
                C14920a.b("visitLocalDescendants called on an unattached node");
            }
            Modifier.c node = cVarT2.getNode();
            if ((node.getAggregateChildKindSet() & iA) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & iA) != 0) {
                        AbstractC5959m abstractC5959mH = node;
                        D0.c cVar = null;
                        while (abstractC5959mH != 0) {
                            if (abstractC5959mH instanceof q0) {
                                if (((q0) abstractC5959mH).R1()) {
                                    return true;
                                }
                            } else if ((abstractC5959mH.getKindSet() & iA) != 0 && (abstractC5959mH instanceof AbstractC5959m)) {
                                Modifier.c cVarL2 = abstractC5959mH.getDelegate();
                                int i10 = 0;
                                abstractC5959mH = abstractC5959mH;
                                while (cVarL2 != null) {
                                    if ((cVarL2.getKindSet() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            abstractC5959mH = cVarL2;
                                        } else {
                                            if (cVar == null) {
                                                cVar = new D0.c(new Modifier.c[16], 0);
                                            }
                                            if (abstractC5959mH != 0) {
                                                cVar.c(abstractC5959mH);
                                                abstractC5959mH = 0;
                                            }
                                            cVar.c(cVarL2);
                                        }
                                    }
                                    cVarL2 = cVarL2.getChild();
                                    abstractC5959mH = abstractC5959mH;
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC5959mH = C5957k.h(cVar);
                        }
                    }
                    node = node.getChild();
                }
            }
        }
        return false;
    }

    public NodeCoordinator(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    private final void B2(MutableRect bounds, boolean clipBounds) {
        float fK = H1.n.k(getPosition());
        bounds.i(bounds.getLeft() - fK);
        bounds.j(bounds.getRight() - fK);
        float fL = H1.n.l(getPosition());
        bounds.k(bounds.getTop() - fL);
        bounds.h(bounds.getBottom() - fL);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.b(bounds, true);
            if (this.isClipping && clipBounds) {
                bounds.e(0.0f, 0.0f, (int) (c() >> 32), (int) (c() & 4294967295L));
                bounds.f();
            }
        }
    }

    private final void F3(NodeCoordinator ancestor, float[] matrix) {
        if (!Intrinsics.e(ancestor, this)) {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            Intrinsics.g(nodeCoordinator);
            nodeCoordinator.F3(ancestor, matrix);
            if (!H1.n.j(getPosition(), H1.n.INSTANCE.b())) {
                float[] fArr = f51503Q;
                C5474k1.h(fArr);
                C5474k1.o(fArr, -H1.n.k(getPosition()), -H1.n.l(getPosition()), 0.0f, 4, null);
                C5474k1.l(matrix, fArr);
            }
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.h(matrix);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver M2() {
        return L.b(getLayoutNode()).getSnapshotObserver();
    }

    private final boolean R2(int type) {
        Modifier.c cVarT2 = T2(g0.i(type));
        if (cVarT2 == null || !C5957k.f(cVarT2, type)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.c T2(boolean includeTail) {
        Modifier.c cVarN2;
        if (getLayoutNode().getOuterCoordinator$ui_release() == this) {
            return getLayoutNode().getNodes().getHead();
        }
        if (includeTail) {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator == null || (cVarN2 = nodeCoordinator.N2()) == null) {
                return null;
            }
            return cVarN2.getChild();
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 == null) {
            return null;
        }
        return nodeCoordinator2.N2();
    }

    public InterfaceC5943b C2() {
        return getLayoutNode().getLayoutDelegate().c();
    }

    public final Rect E3() {
        if (!isAttached()) {
            return Rect.INSTANCE.a();
        }
        LayoutCoordinates layoutCoordinatesC = LayoutCoordinatesKt.c(this);
        MutableRect mutableRectL2 = L2();
        long jS2 = s2(J2());
        int i10 = (int) (jS2 >> 32);
        mutableRectL2.i(-Float.intBitsToFloat(i10));
        int i11 = (int) (jS2 & 4294967295L);
        mutableRectL2.k(-Float.intBitsToFloat(i11));
        mutableRectL2.j(M0() + Float.intBitsToFloat(i10));
        mutableRectL2.h(J0() + Float.intBitsToFloat(i11));
        NodeCoordinator nodeCoordinator = this;
        while (nodeCoordinator != layoutCoordinatesC) {
            nodeCoordinator.q3(mutableRectL2, false, true);
            if (mutableRectL2.f()) {
                return Rect.INSTANCE.a();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            Intrinsics.g(nodeCoordinator);
        }
        return U0.e.a(mutableRectL2);
    }

    @Override // H1.l
    /* renamed from: F1 */
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    public final long G2() {
        return getMeasurementConstraints();
    }

    public final LayoutCoordinates K2() {
        if (!isAttached()) {
            C14920a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        d3();
        return this.wrappedBy;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public long N(long relativeToWindow) {
        if (!isAttached()) {
            C14920a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        LayoutCoordinates layoutCoordinatesC = LayoutCoordinatesKt.c(this);
        return J(layoutCoordinatesC, U0.f.p(L.b(getLayoutNode()).y(relativeToWindow), LayoutCoordinatesKt.e(layoutCoordinatesC)));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public void O(LayoutCoordinates sourceCoordinates, float[] matrix) {
        NodeCoordinator nodeCoordinatorB3 = B3(sourceCoordinates);
        nodeCoordinatorB3.d3();
        NodeCoordinator nodeCoordinatorY2 = y2(nodeCoordinatorB3);
        C5474k1.h(matrix);
        nodeCoordinatorB3.G3(nodeCoordinatorY2, matrix);
        F3(nodeCoordinatorY2, matrix);
    }

    public final Modifier.c S2(int type) {
        boolean zI = g0.i(type);
        Modifier.c cVarN2 = N2();
        if (zI || (cVarN2 = cVarN2.getParent()) != null) {
            for (Modifier.c cVarT2 = T2(zI); cVarT2 != null && (cVarT2.getAggregateChildKindSet() & type) != 0; cVarT2 = cVarT2.getChild()) {
                if ((cVarT2.getKindSet() & type) != 0) {
                    return cVarT2;
                }
                if (cVarT2 == cVarN2) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public long X(long relativeToLocal) {
        return L.b(getLayoutNode()).e(r0(relativeToLocal));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // androidx.compose.ui.layout.L, androidx.compose.ui.layout.r
    /* renamed from: a */
    public Object getParentData() {
        if (!getLayoutNode().getNodes().p(C5952f0.a(64))) {
            return null;
        }
        N2();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        for (Modifier.c tail = getLayoutNode().getNodes().getTail(); tail != null; tail = tail.getParent()) {
            if ((C5952f0.a(64) & tail.getKindSet()) != 0) {
                int iA = C5952f0.a(64);
                D0.c cVar = null;
                AbstractC5959m abstractC5959mH = tail;
                while (abstractC5959mH != 0) {
                    if (abstractC5959mH instanceof n0) {
                        objectRef.f143742a = ((n0) abstractC5959mH).R(getLayoutNode().getDensity(), objectRef.f143742a);
                    } else if ((abstractC5959mH.getKindSet() & iA) != 0 && (abstractC5959mH instanceof AbstractC5959m)) {
                        Modifier.c cVarL2 = abstractC5959mH.getDelegate();
                        int i10 = 0;
                        abstractC5959mH = abstractC5959mH;
                        while (cVarL2 != null) {
                            if ((cVarL2.getKindSet() & iA) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    abstractC5959mH = cVarL2;
                                } else {
                                    if (cVar == null) {
                                        cVar = new D0.c(new Modifier.c[16], 0);
                                    }
                                    if (abstractC5959mH != 0) {
                                        cVar.c(abstractC5959mH);
                                        abstractC5959mH = 0;
                                    }
                                    cVar.c(cVarL2);
                                }
                            }
                            cVarL2 = cVarL2.getChild();
                            abstractC5959mH = abstractC5959mH;
                        }
                        if (i10 == 1) {
                        }
                    }
                    abstractC5959mH = C5957k.h(cVar);
                }
            }
        }
        return objectRef.f143742a;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public void a0(float[] matrix) {
        Owner ownerB = L.b(getLayoutNode());
        NodeCoordinator nodeCoordinatorB3 = B3(LayoutCoordinatesKt.c(this));
        G3(nodeCoordinatorB3, matrix);
        if (ownerB instanceof InterfaceC14305h) {
            ((InterfaceC14305h) ownerB).p(matrix);
            return;
        }
        long jG = LayoutCoordinatesKt.g(nodeCoordinatorB3);
        if ((9223372034707292159L & jG) != 9205357640488583168L) {
            C5474k1.n(matrix, Float.intBitsToFloat((int) (jG >> 32)), Float.intBitsToFloat((int) (jG & 4294967295L)), 0.0f);
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Rect b0(LayoutCoordinates sourceCoordinates, boolean clipBounds) {
        if (!isAttached()) {
            C14920a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!sourceCoordinates.isAttached()) {
            C14920a.b("LayoutCoordinates " + sourceCoordinates + " is not attached!");
        }
        NodeCoordinator nodeCoordinatorB3 = B3(sourceCoordinates);
        nodeCoordinatorB3.d3();
        NodeCoordinator nodeCoordinatorY2 = y2(nodeCoordinatorB3);
        MutableRect mutableRectL2 = L2();
        mutableRectL2.i(0.0f);
        mutableRectL2.k(0.0f);
        mutableRectL2.j((int) (sourceCoordinates.c() >> 32));
        mutableRectL2.h((int) (sourceCoordinates.c() & 4294967295L));
        NodeCoordinator nodeCoordinator = nodeCoordinatorB3;
        while (nodeCoordinator != nodeCoordinatorY2) {
            boolean z10 = clipBounds;
            r3(nodeCoordinator, mutableRectL2, z10, false, 4, null);
            if (mutableRectL2.f()) {
                return Rect.INSTANCE.a();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            Intrinsics.g(nodeCoordinator);
            clipBounds = z10;
        }
        q2(nodeCoordinatorY2, mutableRectL2, clipBounds);
        return U0.e.a(mutableRectL2);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final long c() {
        return getMeasuredSize();
    }

    public final void d3() {
        getLayoutNode().getLayoutDelegate().I();
    }

    @Override // H1.d
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // androidx.compose.ui.layout.InterfaceC5933s
    public H1.t getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return N2().getIsAttached();
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates n0() {
        if (!isAttached()) {
            C14920a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        d3();
        return getLayoutNode().getOuterCoordinator$ui_release().wrappedBy;
    }

    public final void p3(long position, float zIndex, Function1<? super androidx.compose.ui.graphics.e, Unit> layerBlock, GraphicsLayer layer) {
        o3(H1.n.o(position, getApparentToRealOffset()), zIndex, layerBlock, layer);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public long q(long relativeToScreen) {
        if (!isAttached()) {
            C14920a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return J(LayoutCoordinatesKt.c(this), L.b(getLayoutNode()).q(relativeToScreen));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public long r0(long relativeToLocal) {
        if (!isAttached()) {
            C14920a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        d3();
        long jD3 = relativeToLocal;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrappedBy) {
            jD3 = D3(nodeCoordinator, jD3, false, 2, null);
        }
        return jD3;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public long s(long relativeToLocal) {
        if (!isAttached()) {
            C14920a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return L.b(getLayoutNode()).s(r0(relativeToLocal));
    }

    protected final float t2(long pointerPosition, long minimumTouchTargetSize) {
        if (M0() >= Float.intBitsToFloat((int) (minimumTouchTargetSize >> 32)) && J0() >= Float.intBitsToFloat((int) (minimumTouchTargetSize & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jS2 = s2(minimumTouchTargetSize);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jS2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jS2 & 4294967295L));
        long jB3 = b3(pointerPosition);
        if ((fIntBitsToFloat <= 0.0f && fIntBitsToFloat2 <= 0.0f) || Float.intBitsToFloat((int) (jB3 >> 32)) > fIntBitsToFloat || Float.intBitsToFloat((int) (jB3 & 4294967295L)) > fIntBitsToFloat2) {
            return Float.POSITIVE_INFINITY;
        }
        return U0.f.l(jB3);
    }

    protected final void v2(Canvas canvas, o1 paint) {
        canvas.f(0.5f, 0.5f, ((int) (getMeasuredSize() >> 32)) - 0.5f, ((int) (getMeasuredSize() & 4294967295L)) - 0.5f, paint);
    }

    public final NodeCoordinator y2(NodeCoordinator other) {
        LayoutNode layoutNode = other.getLayoutNode();
        LayoutNode layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            Modifier.c cVarN2 = other.N2();
            Modifier.c cVarN22 = N2();
            int iA = C5952f0.a(2);
            if (!cVarN22.getNode().getIsAttached()) {
                C14920a.b("visitLocalAncestors called on an unattached node");
            }
            for (Modifier.c parent = cVarN22.getNode().getParent(); parent != null; parent = parent.getParent()) {
                if ((parent.getKindSet() & iA) != 0 && parent == cVarN2) {
                    return other;
                }
            }
            return this;
        }
        while (layoutNode.getDepth() > layoutNode2.getDepth()) {
            layoutNode = layoutNode.getParent$ui_release();
            Intrinsics.g(layoutNode);
        }
        while (layoutNode2.getDepth() > layoutNode.getDepth()) {
            layoutNode2 = layoutNode2.getParent$ui_release();
            Intrinsics.g(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.getParent$ui_release();
            layoutNode2 = layoutNode2.getParent$ui_release();
            if (layoutNode == null || layoutNode2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (layoutNode2 != getLayoutNode()) {
            if (layoutNode != other.getLayoutNode()) {
                return layoutNode.P();
            }
            return other;
        }
        return this;
    }

    protected final boolean L3(long pointerPosition) {
        if ((((9187343241974906880L ^ (pointerPosition & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null && this.isClipping && !ownedLayer.f(pointerPosition)) {
            return false;
        }
        return true;
    }
}
