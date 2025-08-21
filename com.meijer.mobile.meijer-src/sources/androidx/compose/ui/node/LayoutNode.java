package androidx.compose.ui.node;

import H1.n;
import android.view.View;
import androidx.compose.runtime.InterfaceC5861g;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.InterfaceC5933s;
import androidx.compose.ui.layout.InterfaceC5940z;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.C6034t0;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.platform.Q1;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import com.fullstory.FS;
import com.fullstory.instrumentation.frameworks.compose.FSComposeCanvas;
import com.fullstory.instrumentation.frameworks.compose.FSComposeDraw;
import com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutCoordinates;
import com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutNode;
import com.fullstory.instrumentation.frameworks.compose.FSComposeModifier;
import com.fullstory.instrumentation.frameworks.compose.FSComposeNodeCoordinator;
import com.fullstory.instrumentation.frameworks.compose.FSComposeSemanticsConfiguration;
import com.fullstory.instrumentation.frameworks.compose.FSComposeSemanticsModifier;
import j1.C14920a;
import java.util.Comparator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import r1.C16819m;
import r1.InterfaceC16816j;

@Metadata(d1 = {"\u0000Ü\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 -2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\b\u0096\u0001\u009a\u0001\u009e\u0001¢\u0001B\u001b\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010\u0011J\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000fH\u0002¢\u0006\u0004\b(\u0010\u0011J\u000f\u0010)\u001a\u00020\u000fH\u0002¢\u0006\u0004\b)\u0010\u0011J\u000f\u0010*\u001a\u00020\u000fH\u0000¢\u0006\u0004\b*\u0010\u0011J\u0017\u0010-\u001a\n\u0018\u00010+j\u0004\u0018\u0001`,H\u0017¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0000H\u0000¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u000fH\u0000¢\u0006\u0004\b2\u0010\u0011J\u001f\u00104\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000bH\u0000¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000fH\u0000¢\u0006\u0004\b6\u0010\u0011J'\u00109\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000bH\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\tH\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u000fH\u0000¢\u0006\u0004\b=\u0010\u0011J\u000f\u0010>\u001a\u00020\u000fH\u0000¢\u0006\u0004\b>\u0010\u0011J\u0017\u0010A\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020?H\u0000¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u000fH\u0000¢\u0006\u0004\bC\u0010\u0011J\u000f\u0010D\u001a\u00020\u0014H\u0016¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b¢\u0006\u0004\bG\u0010HJ\u0015\u0010J\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u000b¢\u0006\u0004\bJ\u0010HJ\u0015\u0010K\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b¢\u0006\u0004\bK\u0010HJ\u0015\u0010L\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u000b¢\u0006\u0004\bL\u0010HJ\u0015\u0010M\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b¢\u0006\u0004\bM\u0010HJ\u0015\u0010N\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u000b¢\u0006\u0004\bN\u0010HJ\u0015\u0010O\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b¢\u0006\u0004\bO\u0010HJ\u0015\u0010P\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u000b¢\u0006\u0004\bP\u0010HJ\u000f\u0010Q\u001a\u00020\u000fH\u0000¢\u0006\u0004\bQ\u0010\u0011J\u000f\u0010R\u001a\u00020\u000fH\u0000¢\u0006\u0004\bR\u0010\u0011J\u001f\u0010S\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0000¢\u0006\u0004\bS\u00105J\u000f\u0010T\u001a\u00020\u000fH\u0000¢\u0006\u0004\bT\u0010\u0011J\u000f\u0010U\u001a\u00020\u000fH\u0000¢\u0006\u0004\bU\u0010\u0011J!\u0010\\\u001a\u00020\u000f2\u0006\u0010W\u001a\u00020V2\b\u0010Y\u001a\u0004\u0018\u00010XH\u0000¢\u0006\u0004\bZ\u0010[J6\u0010d\u001a\u00020\u000f2\u0006\u0010^\u001a\u00020]2\u0006\u0010`\u001a\u00020_2\b\b\u0002\u0010b\u001a\u00020a2\b\b\u0002\u0010c\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\bd\u0010eJ6\u0010g\u001a\u00020\u000f2\u0006\u0010^\u001a\u00020]2\u0006\u0010f\u001a\u00020_2\b\b\u0002\u0010b\u001a\u00020a2\b\b\u0002\u0010c\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\bg\u0010eJ\u0017\u0010i\u001a\u00020\u000f2\u0006\u0010h\u001a\u00020\u0000H\u0000¢\u0006\u0004\bi\u0010\u0019J-\u0010m\u001a\u00020\u000f2\b\b\u0002\u0010j\u001a\u00020\t2\b\b\u0002\u0010k\u001a\u00020\t2\b\b\u0002\u0010l\u001a\u00020\tH\u0000¢\u0006\u0004\bm\u0010nJ-\u0010o\u001a\u00020\u000f2\b\b\u0002\u0010j\u001a\u00020\t2\b\b\u0002\u0010k\u001a\u00020\t2\b\b\u0002\u0010l\u001a\u00020\tH\u0000¢\u0006\u0004\bo\u0010nJ\u000f\u0010p\u001a\u00020\u000fH\u0000¢\u0006\u0004\bp\u0010\u0011J\u000f\u0010q\u001a\u00020\u000fH\u0000¢\u0006\u0004\bq\u0010\u0011J\u0019\u0010r\u001a\u00020\u000f2\b\b\u0002\u0010j\u001a\u00020\tH\u0000¢\u0006\u0004\br\u0010sJ\u0019\u0010t\u001a\u00020\u000f2\b\b\u0002\u0010j\u001a\u00020\tH\u0000¢\u0006\u0004\bt\u0010sJ\u000f\u0010u\u001a\u00020\u000fH\u0000¢\u0006\u0004\bu\u0010\u0011J\u000f\u0010v\u001a\u00020\u000fH\u0000¢\u0006\u0004\bv\u0010\u0011J\u001e\u0010y\u001a\u00020\t2\n\b\u0002\u0010x\u001a\u0004\u0018\u00010wH\u0000ø\u0001\u0000¢\u0006\u0004\by\u0010zJ\u001e\u0010{\u001a\u00020\t2\n\b\u0002\u0010x\u001a\u0004\u0018\u00010wH\u0000ø\u0001\u0000¢\u0006\u0004\b{\u0010zJ\u000f\u0010|\u001a\u00020\u000fH\u0000¢\u0006\u0004\b|\u0010\u0011J\u000f\u0010}\u001a\u00020\u000fH\u0000¢\u0006\u0004\b}\u0010\u0011J\u000f\u0010~\u001a\u00020\u000fH\u0000¢\u0006\u0004\b~\u0010\u0011J\u000f\u0010\u007f\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u007f\u0010\u0011J\u0011\u0010\u0080\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u0080\u0001\u0010\u0011J\u0011\u0010\u0081\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u0081\u0001\u0010\u0011J\u0011\u0010\u0082\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u0082\u0001\u0010\u0011J\u0011\u0010\u0083\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u0083\u0001\u0010\u0011J\u0011\u0010\u0084\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u0084\u0001\u0010\u0011J\u0011\u0010\u0085\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u0085\u0001\u0010\u0011J\u0011\u0010\u0086\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u0086\u0001\u0010\u0011R\u0016\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R(\u0010\f\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R0\u0010\u0094\u0001\u001a\u00030\u008e\u00018\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R0\u0010\u0099\u0001\u001a\u00030\u0095\u00018\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u008f\u0001\u001a\u0006\b\u0097\u0001\u0010\u0091\u0001\"\u0006\b\u0098\u0001\u0010\u0093\u0001R0\u0010\u009d\u0001\u001a\u00030\u008e\u00018\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u008f\u0001\u001a\u0006\b\u009b\u0001\u0010\u0091\u0001\"\u0006\b\u009c\u0001\u0010\u0093\u0001R'\u0010¡\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b\u009e\u0001\u0010\u0088\u0001\u001a\u0005\b\u009f\u0001\u0010<\"\u0005\b \u0001\u0010sR'\u0010¥\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b¢\u0001\u0010\u0088\u0001\u001a\u0005\b£\u0001\u0010<\"\u0005\b¤\u0001\u0010sR)\u0010§\u0001\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0089\u0001\u001a\u0006\b¦\u0001\u0010\u008b\u0001\"\u0006\b\u009a\u0001\u0010\u008d\u0001R'\u0010«\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b¨\u0001\u0010\u0088\u0001\u001a\u0005\b©\u0001\u0010<\"\u0005\bª\u0001\u0010sR5\u0010±\u0001\u001a\u0004\u0018\u00010\u00002\t\u0010¬\u0001\u001a\u0004\u0018\u00010\u00008\u0000@BX\u0080\u000e¢\u0006\u0017\n\u0006\b\u0081\u0001\u0010\u00ad\u0001\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0005\b°\u0001\u0010\u0019R\u0019\u0010³\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010\u0089\u0001R\u001e\u0010¶\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000´\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010µ\u0001R\"\u0010º\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010·\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u0018\u0010»\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b;\u0010\u0088\u0001R\u001b\u0010½\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010\u00ad\u0001R-\u0010@\u001a\u0004\u0018\u00010?2\t\u0010¾\u0001\u001a\u0004\u0018\u00010?8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b¿\u0001\u0010À\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001R3\u0010Ë\u0001\u001a\f\u0018\u00010Ã\u0001j\u0005\u0018\u0001`Ä\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÅ\u0001\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001\"\u0006\bÉ\u0001\u0010Ê\u0001R(\u0010\u001d\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÌ\u0001\u0010\u0089\u0001\u001a\u0006\bÍ\u0001\u0010\u008b\u0001\"\u0006\bÎ\u0001\u0010\u008d\u0001R\u0019\u0010Ð\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÏ\u0001\u0010\u0088\u0001R'\u0010Ô\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\bÑ\u0001\u0010\u0088\u0001\u001a\u0005\bÒ\u0001\u0010<\"\u0005\bÓ\u0001\u0010sR\u001a\u0010Ö\u0001\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bA\u0010Õ\u0001R\u0018\u0010×\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001b\u0010\u0088\u0001R\u001e\u0010Ø\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010¹\u0001R\u0018\u0010Ù\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b)\u0010\u0088\u0001R3\u0010à\u0001\u001a\u00030Ú\u00012\b\u0010Û\u0001\u001a\u00030Ú\u00018\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0005\b\u001e\u0010Ü\u0001\u001a\u0006\bÝ\u0001\u0010Þ\u0001\"\u0006\b²\u0001\u0010ß\u0001R\u001b\u0010ã\u0001\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bá\u0001\u0010â\u0001R3\u0010é\u0001\u001a\u00030ä\u00012\b\u0010Û\u0001\u001a\u00030ä\u00018\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0005\bC\u0010å\u0001\u001a\u0006\bæ\u0001\u0010ç\u0001\"\u0006\b\u0087\u0001\u0010è\u0001R3\u0010ï\u0001\u001a\u00030ê\u00012\b\u0010Û\u0001\u001a\u00030ê\u00018\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0005\bu\u0010ë\u0001\u001a\u0006\bì\u0001\u0010í\u0001\"\u0006\b\u0096\u0001\u0010î\u0001R3\u0010õ\u0001\u001a\u00030ð\u00012\b\u0010Û\u0001\u001a\u00030ð\u00018\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0005\b\u0015\u0010ñ\u0001\u001a\u0006\bò\u0001\u0010ó\u0001\"\u0006\b¨\u0001\u0010ô\u0001R4\u0010û\u0001\u001a\u00030ö\u00012\b\u0010Û\u0001\u001a\u00030ö\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b÷\u0001\u0010ø\u0001\u001a\u0006\b\u008f\u0001\u0010ù\u0001\"\u0006\b¼\u0001\u0010ú\u0001R*\u0010\u0083\u0002\u001a\u00030ü\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bý\u0001\u0010þ\u0001\u001a\u0006\bÿ\u0001\u0010\u0080\u0002\"\u0006\b\u0081\u0002\u0010\u0082\u0002R\u001a\u0010\u0085\u0002\u001a\u00030ü\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0002\u0010þ\u0001R.\u0010\u0089\u0002\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u001d\n\u0006\b\u0086\u0002\u0010\u0088\u0001\u0012\u0005\b\u0088\u0002\u0010\u0011\u001a\u0005\b\u0084\u0002\u0010<\"\u0005\b\u0087\u0002\u0010sR \u0010\u008f\u0002\u001a\u00030\u008a\u00028\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008b\u0002\u0010\u008c\u0002\u001a\u0006\b\u008d\u0002\u0010\u008e\u0002R \u0010\u0094\u0002\u001a\u00030\u0090\u00028\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u0091\u0002\u001a\u0006\b\u0092\u0002\u0010\u0093\u0002R,\u0010\u009b\u0002\u001a\u0005\u0018\u00010\u0095\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008f\u0001\u0010\u0096\u0002\u001a\u0006\b\u0097\u0002\u0010\u0098\u0002\"\u0006\b\u0099\u0002\u0010\u009a\u0002R\u001c\u0010\u009e\u0002\u001a\u0005\u0018\u00010\u009c\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0001\u0010\u009d\u0002R'\u0010¡\u0002\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\bÍ\u0001\u0010\u0088\u0001\u001a\u0005\b\u009f\u0002\u0010<\"\u0005\b \u0002\u0010sR\u0019\u0010¢\u0002\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0002\u0010£\u0002R\u001b\u0010¥\u0002\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0002\u0010£\u0002R8\u0010¬\u0002\u001a\u0011\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u000f\u0018\u00010¦\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b£\u0001\u0010§\u0002\u001a\u0006\b¨\u0002\u0010©\u0002\"\u0006\bª\u0002\u0010«\u0002R8\u0010°\u0002\u001a\u0011\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u000f\u0018\u00010¦\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u00ad\u0002\u0010§\u0002\u001a\u0006\b®\u0002\u0010©\u0002\"\u0006\b¯\u0002\u0010«\u0002R'\u0010´\u0002\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b±\u0002\u0010\u0088\u0001\u001a\u0005\b²\u0002\u0010<\"\u0005\b³\u0002\u0010sR)\u0010¶\u0002\u001a\u00020\t2\u0007\u0010¾\u0001\u001a\u00020\t8\u0016@RX\u0096\u000e¢\u0006\u000f\n\u0006\bµ\u0002\u0010\u0088\u0001\u001a\u0005\b¶\u0002\u0010<R\u0018\u0010º\u0002\u001a\u00030·\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b¸\u0002\u0010¹\u0002R\u0016\u0010½\u0002\u001a\u0004\u0018\u00010\t8F¢\u0006\b\u001a\u0006\b»\u0002\u0010¼\u0002R\u001e\u0010À\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000¾\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b¤\u0002\u0010¿\u0002R\u001f\u0010Â\u0002\u001a\n\u0012\u0005\u0012\u00030Á\u00020¾\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008b\u0002\u0010¿\u0002R\u001f\u0010Ã\u0002\u001a\n\u0012\u0005\u0012\u00030Á\u00020¾\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0086\u0002\u0010¿\u0002R\u001e\u0010Æ\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000·\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÄ\u0002\u0010Å\u0002R\u001e\u0010Ç\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000¾\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010¿\u0002R\u0019\u0010É\u0002\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\b\u001a\u0006\bÈ\u0002\u0010¯\u0001R\u0016\u0010Ê\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÊ\u0002\u0010<R\u0018\u0010Î\u0002\u001a\u00030Ë\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bÌ\u0002\u0010Í\u0002R\u001a\u0010Ò\u0002\u001a\u0005\u0018\u00010Ï\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bÐ\u0002\u0010Ñ\u0002R\u0018\u0010Ö\u0002\u001a\u00030Ó\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bÔ\u0002\u0010Õ\u0002R\u0018\u0010Ø\u0002\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b×\u0002\u0010\u001cR%\u0010Û\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000·\u00018@X\u0081\u0004¢\u0006\u000f\u0012\u0005\bÚ\u0002\u0010\u0011\u001a\u0006\bÙ\u0002\u0010Å\u0002R\u0016\u0010Ý\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÜ\u0002\u0010<R\u0016\u0010Þ\u0002\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u00ad\u0002\u0010<R\u0016\u0010I\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bß\u0002\u0010\u008b\u0001R\u0016\u0010F\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bà\u0002\u0010\u008b\u0001R\u0016\u0010á\u0002\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b÷\u0001\u0010<R\u0018\u0010å\u0002\u001a\u00030â\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bã\u0002\u0010ä\u0002R\u0016\u0010æ\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010<R\u0013\u0010è\u0002\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\bç\u0002\u0010<R\u0017\u0010ê\u0002\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\b\u001a\u0006\bé\u0002\u0010\u008b\u0001R\u0018\u0010ì\u0002\u001a\u00030ü\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bë\u0002\u0010\u0080\u0002R\u0018\u0010î\u0002\u001a\u00030ü\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bí\u0002\u0010\u0080\u0002R\u0018\u0010ð\u0002\u001a\u00030\u009c\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b±\u0002\u0010ï\u0002R\u0018\u0010ò\u0002\u001a\u00030\u009c\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bñ\u0002\u0010ï\u0002R\u001a\u0010ó\u0002\u001a\u0005\u0018\u00010\u009c\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bµ\u0002\u0010ï\u0002R\u0016\u0010ô\u0002\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bý\u0001\u0010<R(\u0010%\u001a\u00020$2\u0007\u0010Û\u0001\u001a\u00020$8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\bõ\u0002\u0010ö\u0002\"\u0005\b÷\u0002\u0010'R\u0018\u0010û\u0002\u001a\u00030ø\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bù\u0002\u0010ú\u0002R\u0016\u0010ý\u0002\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bü\u0002\u0010<R\u0016\u0010ÿ\u0002\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bþ\u0002\u0010<R\u0016\u0010\u0080\u0003\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010<R\u0016\u0010\u0082\u0003\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0003\u0010<R\u0019\u0010\u0084\u0003\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b¢\u0001\u0010\u0083\u0003R\u001e\u0010\u0085\u0003\u001a\t\u0012\u0004\u0012\u00020\u00050¾\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¸\u0001\u0010¿\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0086\u0003"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/runtime/g;", "Landroidx/compose/ui/layout/h0;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/layout/z;", "Lr1/j;", "Landroidx/compose/ui/node/g;", "", "Landroidx/compose/ui/node/Owner$b;", "", "isVirtual", "", "semanticsId", "<init>", "(ZI)V", "", "d1", "()V", "F0", "instance", "", "C", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/String;", "child", "Z0", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "v", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "depth", "y", "(I)Ljava/lang/String;", "Landroidx/compose/ui/node/A;", "l0", "()Landroidx/compose/ui/node/A;", "a1", "Landroidx/compose/ui/Modifier;", "modifier", "applyModifier", "(Landroidx/compose/ui/Modifier;)V", "u1", "x", "M1", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "R", "()Landroid/view/View;", "index", "y0", "(ILandroidx/compose/ui/node/LayoutNode;)V", "b1", "count", "i1", "(II)V", "h1", "from", "to", "Y0", "(III)V", "n", "()Z", "k1", "E0", "Landroidx/compose/ui/node/Owner;", "owner", "u", "(Landroidx/compose/ui/node/Owner;)V", "A", "toString", "()Ljava/lang/String;", "height", "X0", "(I)I", "width", "W0", "T0", "S0", "V0", "U0", "R0", "Q0", "z0", "D0", "c1", "j1", "L0", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "graphicsLayer", "draw$ui_release", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "draw", "LU0/f;", "pointerPosition", "Landroidx/compose/ui/node/w;", "hitTestResult", "Lg1/O;", "pointerType", "isInLayer", "u0", "(JLandroidx/compose/ui/node/w;IZ)V", "hitSemanticsEntities", "w0", "it", "t1", "forceRequest", "scheduleMeasureAndLayout", "invalidateIntrinsics", "r1", "(ZZZ)V", "n1", "B0", "C0", "p1", "(Z)V", "l1", "B", "A0", "LH1/b;", "constraints", "J0", "(LH1/b;)Z", "f1", "M0", "P0", "N0", "O0", "c", "j", "w", "v1", "l", "h", "b", "a", "Z", "I", "getSemanticsId", "()I", "J1", "(I)V", "LH1/n;", "J", "k0", "()J", "E1", "(J)V", "offsetFromRoot", "LH1/r;", "d", "U", "B1", "lastSize", "e", "m0", "H1", "outerToInnerOffset", "f", "n0", "I1", "outerToInnerOffsetDirty", "g", "N", "x1", "forceUseOldLayers", "getCompositeKeyHash", "compositeKeyHash", "i", "I0", "setVirtualLookaheadRoot$ui_release", "isVirtualLookaheadRoot", "newRoot", "Landroidx/compose/ui/node/LayoutNode;", "b0", "()Landroidx/compose/ui/node/LayoutNode;", "C1", "lookaheadRoot", "k", "virtualChildrenCount", "Landroidx/compose/ui/node/a0;", "Landroidx/compose/ui/node/a0;", "_foldedChildren", "LD0/c;", "m", "LD0/c;", "_unfoldedChildren", "unfoldedVirtualChildrenListDirty", "o", "_foldedParent", "<set-?>", "p", "Landroidx/compose/ui/node/Owner;", "getOwner$ui_release", "()Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/viewinterop/InteropViewFactoryHolder;", "q", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "S", "()Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "z1", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V", "interopViewFactoryHolder", "r", "L", "setDepth$ui_release", "s", "ignoreRemeasureRequests", "t", "isSemanticsInvalidated$ui_release", "K1", "isSemanticsInvalidated", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "_semanticsConfiguration", "isCurrentlyCalculatingSemanticsConfiguration", "_zSortedChildren", "zSortedChildrenInvalidated", "Landroidx/compose/ui/layout/MeasurePolicy;", "value", "Landroidx/compose/ui/layout/MeasurePolicy;", "f0", "()Landroidx/compose/ui/layout/MeasurePolicy;", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "measurePolicy", "z", "Landroidx/compose/ui/node/A;", "intrinsicsPolicy", "LH1/d;", "LH1/d;", "K", "()LH1/d;", "(LH1/d;)V", "density", "LH1/t;", "LH1/t;", "getLayoutDirection", "()LH1/t;", "(LH1/t;)V", "layoutDirection", "Landroidx/compose/ui/platform/Q1;", "Landroidx/compose/ui/platform/Q1;", "q0", "()Landroidx/compose/ui/platform/Q1;", "(Landroidx/compose/ui/platform/Q1;)V", "viewConfiguration", "Landroidx/compose/runtime/s;", "D", "Landroidx/compose/runtime/s;", "()Landroidx/compose/runtime/s;", "(Landroidx/compose/runtime/s;)V", "compositionLocalMap", "Landroidx/compose/ui/node/LayoutNode$g;", "E", "Landroidx/compose/ui/node/LayoutNode$g;", "T", "()Landroidx/compose/ui/node/LayoutNode$g;", "A1", "(Landroidx/compose/ui/node/LayoutNode$g;)V", "intrinsicsUsageByParent", "F", "previousIntrinsicsUsageByParent", "G", "w1", "getCanMultiMeasure$ui_release$annotations", "canMultiMeasure", "Landroidx/compose/ui/node/c0;", "H", "Landroidx/compose/ui/node/c0;", "j0", "()Landroidx/compose/ui/node/c0;", "nodes", "Landroidx/compose/ui/node/M;", "Landroidx/compose/ui/node/M;", "V", "()Landroidx/compose/ui/node/M;", "layoutDelegate", "Landroidx/compose/ui/layout/E;", "Landroidx/compose/ui/layout/E;", "p0", "()Landroidx/compose/ui/layout/E;", "L1", "(Landroidx/compose/ui/layout/E;)V", "subcompositionsState", "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/NodeCoordinator;", "_innerLayerCoordinator", "getInnerLayerCoordinatorIsDirty$ui_release", "y1", "innerLayerCoordinatorIsDirty", "_modifier", "Landroidx/compose/ui/Modifier;", "M", "pendingModifier", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "getOnAttach$ui_release", "()Lkotlin/jvm/functions/Function1;", "F1", "(Lkotlin/jvm/functions/Function1;)V", "onAttach", "O", "getOnDetach$ui_release", "G1", "onDetach", "P", "i0", "D1", "needsOnPositionedDispatch", "Q", "isDeactivated", "", "r0", "()F", "zIndex", "H0", "()Ljava/lang/Boolean;", "isPlacedInLookahead", "", "()Ljava/util/List;", "foldedChildren", "Landroidx/compose/ui/layout/I;", "childMeasurables", "childLookaheadMeasurables", "t0", "()LD0/c;", "_children", "children", "getParent$ui_release", "parent", "isAttached", "Landroidx/compose/ui/node/LayoutNode$e;", "X", "()Landroidx/compose/ui/node/LayoutNode$e;", "layoutState", "Landroidx/compose/ui/node/T;", "a0", "()Landroidx/compose/ui/node/T;", "lookaheadPassDelegate", "Landroidx/compose/ui/node/V;", "d0", "()Landroidx/compose/ui/node/V;", "measurePassDelegate", "getSemanticsConfiguration", "semanticsConfiguration", "s0", "getZSortedChildren$annotations", "zSortedChildren", "e1", "isValidOwnerScope", "hasFixedInnerContentConstraints", "getWidth", "getHeight", "alignmentLinesRequired", "Landroidx/compose/ui/node/J;", "c0", "()Landroidx/compose/ui/node/J;", "mDrawScope", "isPlaced", "G0", "isPlacedByParent", "o0", "placeOrder", "g0", "measuredByParent", "h0", "measuredByParentInLookahead", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerCoordinator", "getOuterCoordinator$ui_release", "outerCoordinator", "innerLayerCoordinator", "applyingModifierOnAttach", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "e0", "measurePending", "W", "layoutPending", "lookaheadMeasurePending", "Y", "lookaheadLayoutPending", "()Lr1/j;", "parentInfo", "childrenInfo", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LayoutNode implements InterfaceC5861g, androidx.compose.ui.layout.h0, OwnerScope, InterfaceC5940z, InterfaceC16816j, InterfaceC5953g, Owner.b, FSComposeDraw, FSComposeLayoutNode {

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: S, reason: collision with root package name */
    public static final int f51416S = 8;

    /* renamed from: T, reason: collision with root package name */
    private static final f f51417T = new c();

    /* renamed from: U, reason: collision with root package name */
    private static final Function0<LayoutNode> f51418U = a.f51464f;

    /* renamed from: V, reason: collision with root package name */
    private static final Q1 f51419V = new b();

    /* renamed from: W, reason: collision with root package name */
    private static final Comparator<LayoutNode> f51420W = new Comparator() { // from class: androidx.compose.ui.node.H
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return LayoutNode.q((LayoutNode) obj, (LayoutNode) obj2);
        }
    };

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private H1.d density;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private H1.t layoutDirection;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private Q1 viewConfiguration;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5884s compositionLocalMap;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private g intrinsicsUsageByParent;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private g previousIntrinsicsUsageByParent;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private boolean canMultiMeasure;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final C5946c0 nodes;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final M layoutDelegate;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.ui.layout.E subcompositionsState;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private NodeCoordinator _innerLayerCoordinator;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private boolean innerLayerCoordinatorIsDirty;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private Modifier pendingModifier;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private Function1<? super Owner, Unit> onAttach;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Function1<? super Owner, Unit> onDetach;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private boolean needsOnPositionedDispatch;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private boolean isDeactivated;
    private Modifier _modifier;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isVirtual;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int semanticsId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long offsetFromRoot;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long lastSize;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long outerToInnerOffset;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean outerToInnerOffsetDirty;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean forceUseOldLayers;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int compositeKeyHash;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isVirtualLookaheadRoot;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private LayoutNode lookaheadRoot;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int virtualChildrenCount;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final C5942a0<LayoutNode> _foldedChildren;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private D0.c<LayoutNode> _unfoldedChildren;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean unfoldedVirtualChildrenListDirty;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private LayoutNode _foldedParent;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private Owner owner;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private AndroidViewHolder interopViewFactoryHolder;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int depth;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean ignoreRemeasureRequests;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean isSemanticsInvalidated;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private SemanticsConfiguration _semanticsConfiguration;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean isCurrentlyCalculatingSemanticsConfiguration;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final D0.c<LayoutNode> _zSortedChildren;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean zSortedChildrenInvalidated;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private MeasurePolicy measurePolicy;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private A intrinsicsPolicy;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "c", "()Landroidx/compose/ui/node/LayoutNode;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function0<LayoutNode> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f51464f = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final LayoutNode invoke() {
            return new LayoutNode(false, 0 == true ? 1 : 0, 3, null);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u000e8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"androidx/compose/ui/node/LayoutNode$b", "Landroidx/compose/ui/platform/Q1;", "", "c", "()J", "longPressTimeoutMillis", "a", "doubleTapTimeoutMillis", "b", "doubleTapMinTimeMillis", "", "g", "()F", "touchSlop", "LH1/k;", "e", "minimumTouchTargetSize", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Q1 {
        @Override // androidx.compose.ui.platform.Q1
        public long a() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.Q1
        public long b() {
            return 40L;
        }

        @Override // androidx.compose.ui.platform.Q1
        public long c() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.Q1
        public float g() {
            return 16.0f;
        }

        @Override // androidx.compose.ui.platform.Q1
        public long e() {
            return H1.k.INSTANCE.b();
        }

        b() {
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"androidx/compose/ui/node/LayoutNode$c", "Landroidx/compose/ui/node/LayoutNode$f;", "Landroidx/compose/ui/layout/K;", "", "Landroidx/compose/ui/layout/I;", "measurables", "LH1/b;", "constraints", "", "h", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Ljava/lang/Void;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends f {
        c() {
            super("Undefined intrinsics block and it is required");
        }

        public Void h(androidx.compose.ui.layout.K k10, List<? extends androidx.compose.ui.layout.I> list, long j10) {
            throw new IllegalStateException("Undefined measure and it is required");
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.J d(androidx.compose.ui.layout.K k10, List list, long j10) {
            return (androidx.compose.ui.layout.J) h(k10, list, j10);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$d;", "", "<init>", "()V", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "Constructor", "Lkotlin/jvm/functions/Function0;", "a", "()Lkotlin/jvm/functions/Function0;", "Ljava/util/Comparator;", "ZComparator", "Ljava/util/Comparator;", "b", "()Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode$f;", "ErrorMeasurePolicy", "Landroidx/compose/ui/node/LayoutNode$f;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.LayoutNode$d, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Function0<LayoutNode> a() {
            return LayoutNode.f51418U;
        }

        public final Comparator<LayoutNode> b() {
            return LayoutNode.f51420W;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$e;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f51465a = new e("Measuring", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final e f51466b = new e("LookaheadMeasuring", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final e f51467c = new e("LayingOut", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final e f51468d = new e("LookaheadLayingOut", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final e f51469e = new e("Idle", 4);

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ e[] f51470f;

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f51471g;

        private static final /* synthetic */ e[] a() {
            return new e[]{f51465a, f51466b, f51467c, f51468d, f51469e};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f51470f.clone();
        }

        static {
            e[] eVarArrA = a();
            f51470f = eVarArrA;
            f51471g = EnumEntriesKt.a(eVarArrA);
        }

        private e(String str, int i10) {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\b\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0010\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ)\u0010\u0011\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ)\u0010\u0012\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$f;", "Landroidx/compose/ui/layout/MeasurePolicy;", "", "error", "<init>", "(Ljava/lang/String;)V", "Landroidx/compose/ui/layout/s;", "", "Landroidx/compose/ui/layout/r;", "measurables", "", "height", "", "f", "(Landroidx/compose/ui/layout/s;Ljava/util/List;I)Ljava/lang/Void;", "width", "c", "b", "a", "Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class f implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String error;

        public Void a(InterfaceC5933s interfaceC5933s, List<? extends androidx.compose.ui.layout.r> list, int i10) {
            throw new IllegalStateException(this.error.toString());
        }

        public Void b(InterfaceC5933s interfaceC5933s, List<? extends androidx.compose.ui.layout.r> list, int i10) {
            throw new IllegalStateException(this.error.toString());
        }

        public Void c(InterfaceC5933s interfaceC5933s, List<? extends androidx.compose.ui.layout.r> list, int i10) {
            throw new IllegalStateException(this.error.toString());
        }

        public Void f(InterfaceC5933s interfaceC5933s, List<? extends androidx.compose.ui.layout.r> list, int i10) {
            throw new IllegalStateException(this.error.toString());
        }

        public f(String str) {
            this.error = str;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int e(InterfaceC5933s interfaceC5933s, List list, int i10) {
            return ((Number) b(interfaceC5933s, list, i10)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int g(InterfaceC5933s interfaceC5933s, List list, int i10) {
            return ((Number) c(interfaceC5933s, list, i10)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int i(InterfaceC5933s interfaceC5933s, List list, int i10) {
            return ((Number) f(interfaceC5933s, list, i10)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* bridge */ /* synthetic */ int j(InterfaceC5933s interfaceC5933s, List list, int i10) {
            return ((Number) a(interfaceC5933s, list, i10)).intValue();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$g;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public static final g f51473a = new g("InMeasureBlock", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final g f51474b = new g("InLayoutBlock", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final g f51475c = new g("NotUsed", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ g[] f51476d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f51477e;

        private static final /* synthetic */ g[] a() {
            return new g[]{f51473a, f51474b, f51475c};
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) f51476d.clone();
        }

        static {
            g[] gVarArrA = a();
            f51476d = gVarArrA;
            f51477e = EnumEntriesKt.a(gVarArrA);
        }

        private g(String str, int i10) {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class h {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.f51469e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class i extends Lambda implements Function0<Unit> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            LayoutNode.this.getLayoutDelegate().D();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    static final class j extends Lambda implements Function0<Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<SemanticsConfiguration> f51480g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Ref.ObjectRef<SemanticsConfiguration> objectRef) {
            super(0);
            this.f51480g = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
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
        /* JADX WARN: Type inference failed for: r6v7, types: [T, androidx.compose.ui.semantics.SemanticsConfiguration] */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C5946c0 nodes = LayoutNode.this.getNodes();
            int iA = C5952f0.a(8);
            Ref.ObjectRef<SemanticsConfiguration> objectRef = this.f51480g;
            if ((nodes.i() & iA) != 0) {
                for (Modifier.c tail = nodes.getTail(); tail != null; tail = tail.getParent()) {
                    if ((tail.getKindSet() & iA) != 0) {
                        AbstractC5959m abstractC5959mH = tail;
                        D0.c cVar = null;
                        while (abstractC5959mH != 0) {
                            if (abstractC5959mH instanceof u0) {
                                u0 u0Var = (u0) abstractC5959mH;
                                if (u0Var.getIsClearingSemantics()) {
                                    ?? semanticsConfiguration = new SemanticsConfiguration();
                                    objectRef.f143742a = semanticsConfiguration;
                                    semanticsConfiguration.u(true);
                                }
                                if (u0Var.getMergeDescendants()) {
                                    objectRef.f143742a.v(true);
                                }
                                u0Var.T1(objectRef.f143742a);
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
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNode() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.compose.ui.semantics.SemanticsConfiguration] */
    private final SemanticsConfiguration v() {
        this.isCurrentlyCalculatingSemanticsConfiguration = true;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f143742a = new SemanticsConfiguration();
        L.b(this).getSnapshotObserver().i(this, new j(objectRef));
        this.isCurrentlyCalculatingSemanticsConfiguration = false;
        return (SemanticsConfiguration) objectRef.f143742a;
    }

    public final void B0() {
        this.outerToInnerOffsetDirty = true;
        if (this.lookaheadRoot != null) {
            o1(this, false, false, false, 7, null);
        } else {
            s1(this, false, false, false, 7, null);
        }
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeDraw
    public void _fsComposeDraw(Object obj) {
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeDraw
    public void _fsComposeDraw(Object obj, Object obj2) {
        __fs_original_draw$ui_release((Canvas) obj, (GraphicsLayer) obj2);
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutNode
    public final FSComposeSemanticsConfiguration _fsGetCollapsedSemantics() {
        SemanticsConfiguration semanticsConfiguration = getSemanticsConfiguration();
        if (semanticsConfiguration instanceof FSComposeSemanticsConfiguration) {
            return semanticsConfiguration;
        }
        return null;
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutNode
    public final FSComposeLayoutCoordinates _fsGetCoordinates() {
        LayoutCoordinates coordinates = getCoordinates();
        if (coordinates instanceof FSComposeLayoutCoordinates) {
            return coordinates;
        }
        return null;
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutNode
    public final int _fsGetHeight() {
        return getHeight();
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutNode
    public final FSComposeModifier _fsGetModifier() {
        Modifier modifier = get_modifier();
        if (modifier instanceof FSComposeModifier) {
            return modifier;
        }
        return null;
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutNode
    public final FSComposeNodeCoordinator _fsGetOuterCoordinator() {
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        if (outerCoordinator$ui_release instanceof FSComposeNodeCoordinator) {
            return outerCoordinator$ui_release;
        }
        return null;
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutNode
    public final Object _fsGetOwner() {
        Owner owner = getOwner();
        if (owner instanceof Object) {
            return owner;
        }
        return null;
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutNode
    public final FSComposeLayoutNode _fsGetParent() {
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release instanceof FSComposeLayoutNode) {
            return parent$ui_release;
        }
        return null;
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutNode
    public FSComposeSemanticsConfiguration _fsGetSemanticsConfiguration(FSComposeSemanticsModifier fSComposeSemanticsModifier) {
        if (!(fSComposeSemanticsModifier instanceof SemanticsModifier)) {
            return null;
        }
        SemanticsConfiguration semanticsConfiguration = ((SemanticsModifier) fSComposeSemanticsModifier).getSemanticsConfiguration();
        if (semanticsConfiguration instanceof FSComposeSemanticsConfiguration) {
            return semanticsConfiguration;
        }
        return null;
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutNode
    public final int _fsGetSemanticsId() {
        return getSemanticsId();
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutNode
    public final int _fsGetWidth() {
        return getWidth();
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutNode
    public final boolean _fsIsAttached() {
        return isAttached();
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutNode
    public final boolean _fsIsDeactivated() {
        return getIsDeactivated();
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutNode
    public FSComposeCanvas _fsWrapCanvas(android.graphics.Canvas canvas) {
        return AndroidCanvas_androidKt.Canvas(canvas);
    }

    public final void draw$ui_release(Canvas canvas, GraphicsLayer graphicsLayer) {
        if (FS.compose_shouldDraw(this, canvas, AndroidCanvas_androidKt.getNativeCanvas(canvas), graphicsLayer)) {
            __fs_original_draw$ui_release(canvas, graphicsLayer);
        }
    }

    public final void i1(int index, int count) {
        if (!(count >= 0)) {
            C14920a.a("count (" + count + ") must be greater than 0");
        }
        int i10 = (count + index) - 1;
        if (index > i10) {
            return;
        }
        while (true) {
            Z0(this._foldedChildren.c().content[i10]);
            this._foldedChildren.d(i10);
            if (i10 == index) {
                return;
            } else {
                i10--;
            }
        }
    }

    public final void p1(boolean forceRequest) {
        Owner owner;
        this.outerToInnerOffsetDirty = true;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        Owner.d(owner, this, false, forceRequest, 2, null);
    }

    public LayoutNode(boolean z10, int i10) {
        this.isVirtual = z10;
        this.semanticsId = i10;
        n.Companion companion = H1.n.INSTANCE;
        this.offsetFromRoot = companion.a();
        this.lastSize = H1.r.INSTANCE.a();
        this.outerToInnerOffset = companion.a();
        this.outerToInnerOffsetDirty = true;
        this._foldedChildren = new C5942a0<>(new D0.c(new LayoutNode[16], 0), new i());
        this._zSortedChildren = new D0.c<>(new LayoutNode[16], 0);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = f51417T;
        this.density = L.f51414a;
        this.layoutDirection = H1.t.f13338a;
        this.viewConfiguration = f51419V;
        this.compositionLocalMap = InterfaceC5884s.INSTANCE.a();
        g gVar = g.f51475c;
        this.intrinsicsUsageByParent = gVar;
        this.previousIntrinsicsUsageByParent = gVar;
        this.nodes = new C5946c0(this);
        this.layoutDelegate = new M(this);
        this.innerLayerCoordinatorIsDirty = true;
        this._modifier = Modifier.INSTANCE;
    }

    private final String C(LayoutNode instance) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot insert ");
        sb2.append(instance);
        sb2.append(" because it already has a parent or an owner. This tree: ");
        sb2.append(z(this, 0, 1, null));
        sb2.append(" Other tree: ");
        LayoutNode layoutNode = instance._foldedParent;
        sb2.append(layoutNode != null ? z(layoutNode, 0, 1, null) : null);
        return sb2.toString();
    }

    private final void C1(LayoutNode layoutNode) {
        if (Intrinsics.e(layoutNode, this.lookaheadRoot)) {
            return;
        }
        this.lookaheadRoot = layoutNode;
        if (layoutNode != null) {
            this.layoutDelegate.b();
            NodeCoordinator wrapped = P().getWrapped();
            for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.e(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
                outerCoordinator$ui_release.x2();
            }
        } else {
            this.layoutDelegate.a();
        }
        B0();
    }

    private final void F0() {
        LayoutNode layoutNode;
        if (this.virtualChildrenCount > 0) {
            this.unfoldedVirtualChildrenListDirty = true;
        }
        if (!this.isVirtual || (layoutNode = this._foldedParent) == null) {
            return;
        }
        layoutNode.F0();
    }

    public static /* synthetic */ boolean K0(LayoutNode layoutNode, H1.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = layoutNode.layoutDelegate.l();
        }
        return layoutNode.J0(bVar);
    }

    private final void Z0(LayoutNode child) {
        if (child.layoutDelegate.d() > 0) {
            this.layoutDelegate.L(r0.d() - 1);
        }
        if (this.owner != null) {
            child.A();
        }
        child._foldedParent = null;
        child.getOuterCoordinator$ui_release().y3(null);
        if (child.isVirtual) {
            this.virtualChildrenCount--;
            D0.c<LayoutNode> cVarC = child._foldedChildren.c();
            LayoutNode[] layoutNodeArr = cVarC.content;
            int iO = cVarC.getSize();
            for (int i10 = 0; i10 < iO; i10++) {
                layoutNodeArr[i10].getOuterCoordinator$ui_release().y3(null);
            }
        }
        F0();
        b1();
    }

    private final void applyModifier(Modifier modifier) {
        this._modifier = modifier;
        FS.compose_nodeChanged(this);
        this.nodes.E(modifier);
        this.layoutDelegate.Z();
        if (this.lookaheadRoot == null && this.nodes.p(C5952f0.a(512))) {
            C1(this);
        }
    }

    private final void d1() {
        if (this.unfoldedVirtualChildrenListDirty) {
            this.unfoldedVirtualChildrenListDirty = false;
            D0.c<LayoutNode> cVar = this._unfoldedChildren;
            if (cVar == null) {
                cVar = new D0.c<>(new LayoutNode[16], 0);
                this._unfoldedChildren = cVar;
            }
            cVar.k();
            D0.c<LayoutNode> cVarC = this._foldedChildren.c();
            LayoutNode[] layoutNodeArr = cVarC.content;
            int iO = cVarC.getSize();
            for (int i10 = 0; i10 < iO; i10++) {
                LayoutNode layoutNode = layoutNodeArr[i10];
                if (layoutNode.isVirtual) {
                    cVar.e(cVar.getSize(), layoutNode.t0());
                } else {
                    cVar.c(layoutNode);
                }
            }
            this.layoutDelegate.D();
        }
    }

    public static /* synthetic */ boolean g1(LayoutNode layoutNode, H1.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = layoutNode.layoutDelegate.k();
        }
        return layoutNode.f1(bVar);
    }

    private final A l0() {
        A a10 = this.intrinsicsPolicy;
        if (a10 != null) {
            return a10;
        }
        A a11 = new A(this, getMeasurePolicy());
        this.intrinsicsPolicy = a11;
        return a11;
    }

    public static /* synthetic */ void m1(LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        layoutNode.l1(z10);
    }

    public static /* synthetic */ void o1(LayoutNode layoutNode, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        layoutNode.n1(z10, z11, z12);
    }

    public static /* synthetic */ void q1(LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        layoutNode.p1(z10);
    }

    public static /* synthetic */ void s1(LayoutNode layoutNode, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        layoutNode.r1(z10, z11, z12);
    }

    private final void u1() {
        this.nodes.x();
    }

    public static /* synthetic */ void v0(LayoutNode layoutNode, long j10, C5968w c5968w, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = g1.O.INSTANCE.e();
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        layoutNode.u0(j10, c5968w, i12, z10);
    }

    private final void x() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = g.f51475c;
        D0.c<LayoutNode> cVarT0 = t0();
        LayoutNode[] layoutNodeArr = cVarT0.content;
        int iO = cVarT0.getSize();
        for (int i10 = 0; i10 < iO; i10++) {
            LayoutNode layoutNode = layoutNodeArr[i10];
            if (layoutNode.intrinsicsUsageByParent == g.f51474b) {
                layoutNode.x();
            }
        }
    }

    public static /* synthetic */ void x0(LayoutNode layoutNode, long j10, C5968w c5968w, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = g1.O.INSTANCE.d();
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        layoutNode.w0(j10, c5968w, i12, z10);
    }

    private final String y(int depth) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < depth; i10++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        D0.c<LayoutNode> cVarT0 = t0();
        LayoutNode[] layoutNodeArr = cVarT0.content;
        int iO = cVarT0.getSize();
        for (int i11 = 0; i11 < iO; i11++) {
            sb2.append(layoutNodeArr[i11].y(depth + 1));
        }
        String string = sb2.toString();
        if (depth != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        Intrinsics.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    static /* synthetic */ String z(LayoutNode layoutNode, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return layoutNode.y(i10);
    }

    public final void A() {
        Owner owner = this.owner;
        if (owner == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot detach node that is already detached!  Tree: ");
            LayoutNode parent$ui_release = getParent$ui_release();
            sb2.append(parent$ui_release != null ? z(parent$ui_release, 0, 1, null) : null);
            C14920a.c(sb2.toString());
            throw new KotlinNothingValueException();
        }
        LayoutNode parent$ui_release2 = getParent$ui_release();
        if (parent$ui_release2 != null) {
            parent$ui_release2.z0();
            parent$ui_release2.B0();
            V vD0 = d0();
            g gVar = g.f51475c;
            vD0.u2(gVar);
            T tA0 = a0();
            if (tA0 != null) {
                tA0.s2(gVar);
            }
        }
        this.layoutDelegate.K();
        Function1<? super Owner, Unit> function1 = this.onDetach;
        if (function1 != null) {
            function1.invoke(owner);
        }
        if (!P0.h.isSemanticAutofillEnabled && this.nodes.p(C5952f0.a(8))) {
            E0();
        }
        this.nodes.z();
        this.ignoreRemeasureRequests = true;
        D0.c<LayoutNode> cVarC = this._foldedChildren.c();
        LayoutNode[] layoutNodeArr = cVarC.content;
        int iO = cVarC.getSize();
        for (int i10 = 0; i10 < iO; i10++) {
            layoutNodeArr[i10].A();
        }
        this.ignoreRemeasureRequests = false;
        this.nodes.t();
        owner.B(this);
        this.owner = null;
        C1(null);
        this.depth = 0;
        d0().l2();
        T tA02 = a0();
        if (tA02 != null) {
            tA02.h2();
        }
        if (P0.h.isSemanticAutofillEnabled && this.nodes.p(C5952f0.a(8))) {
            SemanticsConfiguration semanticsConfiguration = this._semanticsConfiguration;
            this._semanticsConfiguration = null;
            this.isSemanticsInvalidated = false;
            owner.getSemanticsOwner().e(this, semanticsConfiguration);
            owner.E();
        }
    }

    public final void A1(g gVar) {
        this.intrinsicsUsageByParent = gVar;
    }

    public final void B1(long j10) {
        this.lastSize = j10;
    }

    public final boolean D() {
        InterfaceC5943b interfaceC5943bP;
        AbstractC5941a abstractC5941aR;
        M m10 = this.layoutDelegate;
        return m10.c().r().k() || !((interfaceC5943bP = m10.p()) == null || (abstractC5941aR = interfaceC5943bP.r()) == null || !abstractC5941aR.k());
    }

    public final void D0() {
        this.layoutDelegate.C();
    }

    public final void D1(boolean z10) {
        this.needsOnPositionedDispatch = z10;
    }

    public final boolean E() {
        return this.pendingModifier != null;
    }

    public final void E0() {
        if (this.isCurrentlyCalculatingSemanticsConfiguration) {
            return;
        }
        if (!P0.h.isSemanticAutofillEnabled) {
            this._semanticsConfiguration = null;
            L.b(this).E();
        } else {
            if (this.nodes.r() || E()) {
                this.isSemanticsInvalidated = true;
                return;
            }
            SemanticsConfiguration semanticsConfiguration = this._semanticsConfiguration;
            this._semanticsConfiguration = v();
            this.isSemanticsInvalidated = false;
            Owner ownerB = L.b(this);
            ownerB.getSemanticsOwner().e(this, semanticsConfiguration);
            ownerB.E();
        }
    }

    public final void E1(long j10) {
        this.offsetFromRoot = j10;
    }

    /* renamed from: F, reason: from getter */
    public final boolean getCanMultiMeasure() {
        return this.canMultiMeasure;
    }

    public final void F1(Function1<? super Owner, Unit> function1) {
        this.onAttach = function1;
    }

    public final void G1(Function1<? super Owner, Unit> function1) {
        this.onDetach = function1;
    }

    public final void H1(long j10) {
        this.outerToInnerOffset = j10;
    }

    /* renamed from: I0, reason: from getter */
    public final boolean getIsVirtualLookaheadRoot() {
        return this.isVirtualLookaheadRoot;
    }

    public final void I1(boolean z10) {
        this.outerToInnerOffsetDirty = z10;
    }

    /* renamed from: J, reason: from getter */
    public InterfaceC5884s getCompositionLocalMap() {
        return this.compositionLocalMap;
    }

    public final boolean J0(H1.b constraints) {
        if (constraints == null || this.lookaheadRoot == null) {
            return false;
        }
        T tA0 = a0();
        Intrinsics.g(tA0);
        return tA0.l2(constraints.getValue());
    }

    public void J1(int i10) {
        this.semanticsId = i10;
    }

    /* renamed from: K, reason: from getter */
    public H1.d getDensity() {
        return this.density;
    }

    public final void K1(boolean z10) {
        this.isSemanticsInvalidated = z10;
    }

    /* renamed from: L, reason: from getter */
    public final int getDepth() {
        return this.depth;
    }

    public final void L0() {
        if (this.intrinsicsUsageByParent == g.f51475c) {
            x();
        }
        T tA0 = a0();
        Intrinsics.g(tA0);
        tA0.m2();
    }

    public final void L1(androidx.compose.ui.layout.E e10) {
        this.subcompositionsState = e10;
    }

    public final List<LayoutNode> M() {
        return this._foldedChildren.c().i();
    }

    public final void M0() {
        this.layoutDelegate.E();
    }

    public final void M1() {
        if (this.virtualChildrenCount > 0) {
            d1();
        }
    }

    /* renamed from: N, reason: from getter */
    public final boolean getForceUseOldLayers() {
        return this.forceUseOldLayers;
    }

    public final void N0() {
        this.layoutDelegate.F();
    }

    public final void O0() {
        this.layoutDelegate.G();
    }

    public final NodeCoordinator P() {
        return this.nodes.getInnerCoordinator();
    }

    public final void P0() {
        this.layoutDelegate.H();
    }

    public final NodeCoordinator Q() {
        if (this.innerLayerCoordinatorIsDirty) {
            NodeCoordinator nodeCoordinatorP = P();
            NodeCoordinator wrappedBy = getOuterCoordinator$ui_release().getWrappedBy();
            this._innerLayerCoordinator = null;
            while (true) {
                if (Intrinsics.e(nodeCoordinatorP, wrappedBy)) {
                    break;
                }
                if ((nodeCoordinatorP != null ? nodeCoordinatorP.getLayer() : null) != null) {
                    this._innerLayerCoordinator = nodeCoordinatorP;
                    break;
                }
                nodeCoordinatorP = nodeCoordinatorP != null ? nodeCoordinatorP.getWrappedBy() : null;
            }
        }
        NodeCoordinator nodeCoordinator = this._innerLayerCoordinator;
        if (nodeCoordinator == null || nodeCoordinator.getLayer() != null) {
            return nodeCoordinator;
        }
        C14920a.c("layer was not set");
        throw new KotlinNothingValueException();
    }

    public View R() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            return androidViewHolder.getInteropView();
        }
        return null;
    }

    /* renamed from: S, reason: from getter */
    public final AndroidViewHolder getInteropViewFactoryHolder() {
        return this.interopViewFactoryHolder;
    }

    /* renamed from: T, reason: from getter */
    public final g getIntrinsicsUsageByParent() {
        return this.intrinsicsUsageByParent;
    }

    /* renamed from: U, reason: from getter */
    public final long getLastSize() {
        return this.lastSize;
    }

    /* renamed from: V, reason: from getter */
    public final M getLayoutDelegate() {
        return this.layoutDelegate;
    }

    public final boolean W() {
        return this.layoutDelegate.n();
    }

    public final e X() {
        return this.layoutDelegate.o();
    }

    public final boolean Y() {
        return this.layoutDelegate.s();
    }

    public final void Y0(int from, int to2, int count) {
        if (from == to2) {
            return;
        }
        for (int i10 = 0; i10 < count; i10++) {
            this._foldedChildren.a(from > to2 ? to2 + i10 : (to2 + count) - 2, this._foldedChildren.d(from > to2 ? from + i10 : from));
        }
        b1();
        F0();
        B0();
    }

    public final boolean Z() {
        return this.layoutDelegate.u();
    }

    @Override // androidx.compose.ui.node.InterfaceC5953g
    public void a(H1.d dVar) {
        if (Intrinsics.e(this.density, dVar)) {
            return;
        }
        this.density = dVar;
        a1();
        for (Modifier.c head = this.nodes.getHead(); head != null; head = head.getChild()) {
            head.M();
        }
    }

    public final T a0() {
        return this.layoutDelegate.v();
    }

    @Override // androidx.compose.runtime.InterfaceC5861g
    public void b() {
        if (!P0.h.isRemoveFocusedViewFixEnabled) {
            AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
            if (androidViewHolder != null) {
                androidViewHolder.b();
            }
            androidx.compose.ui.layout.E e10 = this.subcompositionsState;
            if (e10 != null) {
                e10.b();
            }
        }
        NodeCoordinator wrapped = P().getWrapped();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !Intrinsics.e(outerCoordinator$ui_release, wrapped) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
            outerCoordinator$ui_release.k3();
        }
        if (P0.h.isRemoveFocusedViewFixEnabled) {
            AndroidViewHolder androidViewHolder2 = this.interopViewFactoryHolder;
            if (androidViewHolder2 != null) {
                androidViewHolder2.b();
            }
            androidx.compose.ui.layout.E e11 = this.subcompositionsState;
            if (e11 != null) {
                e11.b();
            }
        }
    }

    /* renamed from: b0, reason: from getter */
    public final LayoutNode getLookaheadRoot() {
        return this.lookaheadRoot;
    }

    public final void b1() {
        if (!this.isVirtual) {
            this.zSortedChildrenInvalidated = true;
            return;
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.b1();
        }
    }

    @Override // androidx.compose.ui.layout.h0
    public void c() {
        LayoutNode layoutNode;
        if (this.lookaheadRoot != null) {
            layoutNode = this;
            o1(layoutNode, false, false, false, 5, null);
        } else {
            s1(this, false, false, false, 5, null);
            layoutNode = this;
        }
        H1.b bVarK = layoutNode.layoutDelegate.k();
        if (bVarK != null) {
            Owner owner = layoutNode.owner;
            if (owner != null) {
                owner.x(this, bVarK.getValue());
                return;
            }
            return;
        }
        Owner owner2 = layoutNode.owner;
        if (owner2 != null) {
            Owner.b(owner2, false, 1, null);
        }
    }

    public final void c1(int x10, int y10) {
        f0.a placementScope;
        NodeCoordinator nodeCoordinatorP;
        if (this.intrinsicsUsageByParent == g.f51475c) {
            x();
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release == null || (nodeCoordinatorP = parent$ui_release.P()) == null || (placementScope = nodeCoordinatorP.getPlacementScope()) == null) {
            placementScope = L.b(this).getPlacementScope();
        }
        f0.a.l(placementScope, d0(), x10, y10, 0.0f, 4, null);
    }

    @Override // androidx.compose.ui.node.InterfaceC5953g
    public void d(H1.t tVar) {
        if (this.layoutDirection != tVar) {
            this.layoutDirection = tVar;
            a1();
            for (Modifier.c head = this.nodes.getHead(); head != null; head = head.getChild()) {
                head.o0();
            }
        }
    }

    public final V d0() {
        return this.layoutDelegate.w();
    }

    @Override // androidx.compose.ui.node.InterfaceC5953g
    public void e(int i10) {
        this.compositeKeyHash = i10;
    }

    public final boolean e0() {
        return this.layoutDelegate.x();
    }

    /* renamed from: f0, reason: from getter */
    public MeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    public final boolean f1(H1.b constraints) {
        if (constraints == null) {
            return false;
        }
        if (this.intrinsicsUsageByParent == g.f51475c) {
            w();
        }
        return d0().q2(constraints.getValue());
    }

    public int getHeight() {
        return this.layoutDelegate.j();
    }

    @Override // androidx.compose.ui.layout.InterfaceC5940z
    public H1.t getLayoutDirection() {
        return this.layoutDirection;
    }

    /* renamed from: getModifier, reason: from getter */
    public Modifier get_modifier() {
        return this._modifier;
    }

    public final NodeCoordinator getOuterCoordinator$ui_release() {
        return this.nodes.getOuterCoordinator();
    }

    /* renamed from: getOwner$ui_release, reason: from getter */
    public final Owner getOwner() {
        return this.owner;
    }

    public final LayoutNode getParent$ui_release() {
        LayoutNode layoutNode = this._foldedParent;
        while (layoutNode != null && layoutNode.isVirtual) {
            layoutNode = layoutNode._foldedParent;
        }
        return layoutNode;
    }

    @Override // androidx.compose.ui.layout.InterfaceC5940z
    public int getSemanticsId() {
        return this.semanticsId;
    }

    public int getWidth() {
        return this.layoutDelegate.B();
    }

    @Override // androidx.compose.runtime.InterfaceC5861g
    public void h() {
        if (!P0.h.isRemoveFocusedViewFixEnabled) {
            AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
            if (androidViewHolder != null) {
                androidViewHolder.h();
            }
            androidx.compose.ui.layout.E e10 = this.subcompositionsState;
            if (e10 != null) {
                e10.h();
            }
        }
        this.isDeactivated = true;
        u1();
        if (isAttached()) {
            if (P0.h.isSemanticAutofillEnabled) {
                this._semanticsConfiguration = null;
                this.isSemanticsInvalidated = false;
            } else {
                E0();
            }
        }
        Owner owner = this.owner;
        if (owner != null) {
            owner.F(this);
        }
        if (P0.h.isRemoveFocusedViewFixEnabled) {
            AndroidViewHolder androidViewHolder2 = this.interopViewFactoryHolder;
            if (androidViewHolder2 != null) {
                androidViewHolder2.h();
            }
            androidx.compose.ui.layout.E e11 = this.subcompositionsState;
            if (e11 != null) {
                e11.h();
            }
        }
    }

    public final void h1() {
        int iO = this._foldedChildren.c().getSize();
        while (true) {
            iO--;
            if (-1 >= iO) {
                this._foldedChildren.b();
                return;
            }
            Z0(this._foldedChildren.c().content[iO]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // androidx.compose.ui.node.InterfaceC5953g
    public void i(Q1 q12) {
        if (Intrinsics.e(this.viewConfiguration, q12)) {
            return;
        }
        this.viewConfiguration = q12;
        C5946c0 c5946c0 = this.nodes;
        int iA = C5952f0.a(16);
        if ((c5946c0.i() & iA) != 0) {
            for (Modifier.c head = c5946c0.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iA) != 0) {
                    AbstractC5959m abstractC5959mH = head;
                    D0.c cVar = null;
                    while (abstractC5959mH != 0) {
                        if (abstractC5959mH instanceof q0) {
                            ((q0) abstractC5959mH).V1();
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
                if ((head.getAggregateChildKindSet() & iA) == 0) {
                    return;
                }
            }
        }
    }

    /* renamed from: i0, reason: from getter */
    public final boolean getNeedsOnPositionedDispatch() {
        return this.needsOnPositionedDispatch;
    }

    @Override // androidx.compose.ui.layout.InterfaceC5940z
    public boolean isAttached() {
        return this.owner != null;
    }

    @Override // androidx.compose.ui.layout.InterfaceC5940z
    /* renamed from: isDeactivated, reason: from getter */
    public boolean getIsDeactivated() {
        return this.isDeactivated;
    }

    /* renamed from: j0, reason: from getter */
    public final C5946c0 getNodes() {
        return this.nodes;
    }

    public final void j1() {
        if (this.intrinsicsUsageByParent == g.f51475c) {
            x();
        }
        d0().r2();
    }

    @Override // androidx.compose.ui.node.InterfaceC5953g
    public void k(MeasurePolicy measurePolicy) {
        if (Intrinsics.e(this.measurePolicy, measurePolicy)) {
            return;
        }
        this.measurePolicy = measurePolicy;
        A a10 = this.intrinsicsPolicy;
        if (a10 != null) {
            a10.k(getMeasurePolicy());
        }
        B0();
    }

    /* renamed from: k0, reason: from getter */
    public final long getOffsetFromRoot() {
        return this.offsetFromRoot;
    }

    public final void k1() {
        if (this.isCurrentlyCalculatingSemanticsConfiguration) {
            return;
        }
        L.b(this).r(this);
    }

    public final void l1(boolean forceRequest) {
        Owner owner;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        owner.c(this, true, forceRequest);
    }

    /* renamed from: m0, reason: from getter */
    public final long getOuterToInnerOffset() {
        return this.outerToInnerOffset;
    }

    /* renamed from: n0, reason: from getter */
    public final boolean getOuterToInnerOffsetDirty() {
        return this.outerToInnerOffsetDirty;
    }

    public final void n1(boolean forceRequest, boolean scheduleMeasureAndLayout, boolean invalidateIntrinsics) {
        if (!(this.lookaheadRoot != null)) {
            C14920a.b("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
        Owner owner = this.owner;
        if (owner == null || this.ignoreRemeasureRequests || this.isVirtual) {
            return;
        }
        owner.A(this, true, forceRequest, scheduleMeasureAndLayout);
        if (invalidateIntrinsics) {
            T tA0 = a0();
            Intrinsics.g(tA0);
            tA0.R1(forceRequest);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // androidx.compose.ui.node.InterfaceC5953g
    public void o(InterfaceC5884s interfaceC5884s) {
        this.compositionLocalMap = interfaceC5884s;
        a((H1.d) interfaceC5884s.a(C6034t0.g()));
        d((H1.t) interfaceC5884s.a(C6034t0.m()));
        i((Q1) interfaceC5884s.a(C6034t0.t()));
        C5946c0 c5946c0 = this.nodes;
        int iA = C5952f0.a(32768);
        if ((c5946c0.i() & iA) != 0) {
            for (Modifier.c head = c5946c0.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iA) != 0) {
                    AbstractC5959m abstractC5959mH = head;
                    D0.c cVar = null;
                    while (abstractC5959mH != 0) {
                        if (abstractC5959mH instanceof InterfaceC5954h) {
                            Modifier.c node = ((InterfaceC5954h) abstractC5959mH).getNode();
                            if (node.getIsAttached()) {
                                g0.e(node);
                            } else {
                                node.H2(true);
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
                if ((head.getAggregateChildKindSet() & iA) == 0) {
                    return;
                }
            }
        }
    }

    /* renamed from: p0, reason: from getter */
    public final androidx.compose.ui.layout.E getSubcompositionsState() {
        return this.subcompositionsState;
    }

    /* renamed from: q0, reason: from getter */
    public Q1 getViewConfiguration() {
        return this.viewConfiguration;
    }

    public final void r1(boolean forceRequest, boolean scheduleMeasureAndLayout, boolean invalidateIntrinsics) {
        Owner owner;
        if (this.ignoreRemeasureRequests || this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        Owner.G(owner, this, false, forceRequest, scheduleMeasureAndLayout, 2, null);
        if (invalidateIntrinsics) {
            d0().V1(forceRequest);
        }
    }

    public final D0.c<LayoutNode> s0() {
        if (this.zSortedChildrenInvalidated) {
            this._zSortedChildren.k();
            D0.c<LayoutNode> cVar = this._zSortedChildren;
            cVar.e(cVar.getSize(), t0());
            this._zSortedChildren.A(f51420W);
            this.zSortedChildrenInvalidated = false;
        }
        return this._zSortedChildren;
    }

    @Override // androidx.compose.ui.node.InterfaceC5953g
    public void setModifier(Modifier modifier) {
        if (!(!this.isVirtual || get_modifier() == Modifier.INSTANCE)) {
            C14920a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (getIsDeactivated()) {
            C14920a.a("modifier is updated when deactivated");
        }
        if (!isAttached()) {
            this.pendingModifier = modifier;
            return;
        }
        applyModifier(modifier);
        if (this.isSemanticsInvalidated) {
            E0();
        }
    }

    public String toString() {
        return Q0.a(this, null) + " children: " + I().size() + " measurePolicy: " + getMeasurePolicy();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(androidx.compose.ui.node.Owner r7) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.u(androidx.compose.ui.node.Owner):void");
    }

    public final void w() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = g.f51475c;
        D0.c<LayoutNode> cVarT0 = t0();
        LayoutNode[] layoutNodeArr = cVarT0.content;
        int iO = cVarT0.getSize();
        for (int i10 = 0; i10 < iO; i10++) {
            LayoutNode layoutNode = layoutNodeArr[i10];
            if (layoutNode.intrinsicsUsageByParent != g.f51475c) {
                layoutNode.w();
            }
        }
    }

    public final void w1(boolean z10) {
        this.canMultiMeasure = z10;
    }

    public final void x1(boolean z10) {
        this.forceUseOldLayers = z10;
    }

    public final void y0(int index, LayoutNode instance) {
        if (!(instance._foldedParent == null || instance.owner == null)) {
            C14920a.b(C(instance));
        }
        instance._foldedParent = this;
        this._foldedChildren.a(index, instance);
        b1();
        if (instance.isVirtual) {
            this.virtualChildrenCount++;
        }
        F0();
        Owner owner = this.owner;
        if (owner != null) {
            instance.u(owner);
        }
        if (instance.layoutDelegate.d() > 0) {
            M m10 = this.layoutDelegate;
            m10.L(m10.d() + 1);
        }
    }

    public final void y1(boolean z10) {
        this.innerLayerCoordinatorIsDirty = z10;
    }

    public final void z1(AndroidViewHolder androidViewHolder) {
        this.interopViewFactoryHolder = androidViewHolder;
    }

    private final void a1() {
        B0();
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.z0();
        }
        A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q(LayoutNode layoutNode, LayoutNode layoutNode2) {
        if (layoutNode.r0() == layoutNode2.r0()) {
            return Intrinsics.k(layoutNode.o0(), layoutNode2.o0());
        }
        return Float.compare(layoutNode.r0(), layoutNode2.r0());
    }

    private final float r0() {
        return d0().T1();
    }

    public final void A0() {
        NodeCoordinator nodeCoordinatorP = P();
        for (NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release(); outerCoordinator$ui_release != nodeCoordinatorP; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped()) {
            Intrinsics.h(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            OwnedLayer layer = ((E) outerCoordinator$ui_release).getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }
        OwnedLayer layer2 = P().getLayer();
        if (layer2 != null) {
            layer2.invalidate();
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
    public final void B() {
        if (X() == e.f51469e && !W() && !e0() && !getIsDeactivated() && f()) {
            C5946c0 c5946c0 = this.nodes;
            int iA = C5952f0.a(256);
            if ((c5946c0.i() & iA) != 0) {
                for (Modifier.c head = c5946c0.getHead(); head != null; head = head.getChild()) {
                    if ((head.getKindSet() & iA) != 0) {
                        AbstractC5959m abstractC5959mH = head;
                        D0.c cVar = null;
                        while (abstractC5959mH != 0) {
                            if (abstractC5959mH instanceof InterfaceC5967v) {
                                InterfaceC5967v interfaceC5967v = (InterfaceC5967v) abstractC5959mH;
                                interfaceC5967v.O(C5957k.j(interfaceC5967v, C5952f0.a(256)));
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
                    if ((head.getAggregateChildKindSet() & iA) == 0) {
                        return;
                    }
                }
            }
        }
    }

    public final void C0() {
        if (!W() && !e0() && !this.needsOnPositionedDispatch) {
            L.b(this).f(this);
        }
    }

    public final List<androidx.compose.ui.layout.I> G() {
        T tA0 = a0();
        Intrinsics.g(tA0);
        return tA0.r1();
    }

    public final boolean G0() {
        return d0().Y1();
    }

    public final List<androidx.compose.ui.layout.I> H() {
        return d0().u1();
    }

    public final Boolean H0() {
        T tA0 = a0();
        if (tA0 != null) {
            return Boolean.valueOf(tA0.f());
        }
        return null;
    }

    public final List<LayoutNode> I() {
        return t0().i();
    }

    public final boolean O() {
        long jG2 = P().G2();
        if (H1.b.j(jG2) && H1.b.i(jG2)) {
            return true;
        }
        return false;
    }

    public final int Q0(int width) {
        return l0().b(width);
    }

    public final int R0(int height) {
        return l0().c(height);
    }

    public final int S0(int width) {
        return l0().d(width);
    }

    public final int T0(int height) {
        return l0().e(height);
    }

    public final int U0(int width) {
        return l0().f(width);
    }

    public final int V0(int height) {
        return l0().g(height);
    }

    public final int W0(int width) {
        return l0().h(width);
    }

    public final int X0(int height) {
        return l0().i(height);
    }

    public final void __fs_original_draw$ui_release(Canvas canvas, GraphicsLayer graphicsLayer) {
        getOuterCoordinator$ui_release().u2(canvas, graphicsLayer);
    }

    public final J c0() {
        return L.b(this).getSharedDrawScope();
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean e1() {
        return isAttached();
    }

    @Override // androidx.compose.ui.layout.InterfaceC5940z
    public boolean f() {
        return d0().f();
    }

    @Override // r1.InterfaceC16816j
    public InterfaceC16816j g() {
        return getParent$ui_release();
    }

    public final g g0() {
        return d0().J1();
    }

    @Override // androidx.compose.ui.layout.InterfaceC5940z
    public LayoutCoordinates getCoordinates() {
        return P();
    }

    @Override // r1.InterfaceC16816j
    public SemanticsConfiguration getSemanticsConfiguration() {
        if (isAttached() && !getIsDeactivated() && this.nodes.p(C5952f0.a(8))) {
            if (!P0.h.isSemanticAutofillEnabled && this._semanticsConfiguration == null) {
                this._semanticsConfiguration = v();
            }
            return this._semanticsConfiguration;
        }
        return null;
    }

    public final g h0() {
        g gVarA1;
        T tA0 = a0();
        if (tA0 != null && (gVarA1 = tA0.A1()) != null) {
            return gVarA1;
        }
        return g.f51475c;
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
    @Override // androidx.compose.ui.node.Owner.b
    public void j() {
        NodeCoordinator nodeCoordinatorP = P();
        int iA = C5952f0.a(128);
        boolean zI = g0.i(iA);
        Modifier.c cVarN2 = nodeCoordinatorP.N2();
        if (zI || (cVarN2 = cVarN2.getParent()) != null) {
            for (Modifier.c cVarT2 = nodeCoordinatorP.T2(zI); cVarT2 != null && (cVarT2.getAggregateChildKindSet() & iA) != 0; cVarT2 = cVarT2.getChild()) {
                if ((cVarT2.getKindSet() & iA) != 0) {
                    AbstractC5959m abstractC5959mH = cVarT2;
                    D0.c cVar = null;
                    while (abstractC5959mH != 0) {
                        if (abstractC5959mH instanceof C) {
                            ((C) abstractC5959mH).s(P());
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

    @Override // androidx.compose.runtime.InterfaceC5861g
    public void l() {
        if (!isAttached()) {
            C14920a.a("onReuse is only expected on attached node");
        }
        if (!P0.h.isRemoveFocusedViewFixEnabled) {
            AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
            if (androidViewHolder != null) {
                androidViewHolder.l();
            }
            androidx.compose.ui.layout.E e10 = this.subcompositionsState;
            if (e10 != null) {
                e10.l();
            }
        }
        this.isCurrentlyCalculatingSemanticsConfiguration = false;
        if (getIsDeactivated()) {
            this.isDeactivated = false;
            if (!P0.h.isSemanticAutofillEnabled) {
                E0();
            }
        } else {
            u1();
        }
        int semanticsId = getSemanticsId();
        J1(C16819m.b());
        Owner owner = this.owner;
        if (owner != null) {
            owner.h(this, semanticsId);
        }
        if (P0.h.isRemoveFocusedViewFixEnabled) {
            AndroidViewHolder androidViewHolder2 = this.interopViewFactoryHolder;
            if (androidViewHolder2 != null) {
                androidViewHolder2.l();
            }
            androidx.compose.ui.layout.E e11 = this.subcompositionsState;
            if (e11 != null) {
                e11.l();
            }
        }
        this.nodes.s();
        this.nodes.y();
        if (P0.h.isSemanticAutofillEnabled && this.nodes.p(C5952f0.a(8))) {
            E0();
        }
        t1(this);
        Owner owner2 = this.owner;
        if (owner2 != null) {
            owner2.g(this, semanticsId);
        }
    }

    @Override // r1.InterfaceC16816j
    public List<InterfaceC16816j> m() {
        return I();
    }

    @Override // r1.InterfaceC16816j
    public boolean n() {
        return getOuterCoordinator$ui_release().isTransparent();
    }

    public final int o0() {
        return d0().R1();
    }

    public final D0.c<LayoutNode> t0() {
        M1();
        if (this.virtualChildrenCount == 0) {
            return this._foldedChildren.c();
        }
        D0.c<LayoutNode> cVar = this._unfoldedChildren;
        Intrinsics.g(cVar);
        return cVar;
    }

    public final void t1(LayoutNode it) {
        if (h.$EnumSwitchMapping$0[it.X().ordinal()] == 1) {
            if (it.Z()) {
                o1(it, true, false, false, 6, null);
                return;
            }
            if (it.Y()) {
                it.l1(true);
            }
            if (it.e0()) {
                s1(it, true, false, false, 6, null);
                return;
            } else {
                if (it.W()) {
                    it.p1(true);
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException("Unexpected state " + it.X());
    }

    public final void u0(long pointerPosition, C5968w hitTestResult, int pointerType, boolean isInLayer) {
        getOuterCoordinator$ui_release().W2(NodeCoordinator.INSTANCE.a(), NodeCoordinator.A2(getOuterCoordinator$ui_release(), pointerPosition, false, 2, null), hitTestResult, pointerType, isInLayer);
    }

    public final void v1() {
        D0.c<LayoutNode> cVarT0 = t0();
        LayoutNode[] layoutNodeArr = cVarT0.content;
        int iO = cVarT0.getSize();
        for (int i10 = 0; i10 < iO; i10++) {
            LayoutNode layoutNode = layoutNodeArr[i10];
            g gVar = layoutNode.previousIntrinsicsUsageByParent;
            layoutNode.intrinsicsUsageByParent = gVar;
            if (gVar != g.f51475c) {
                layoutNode.v1();
            }
        }
    }

    public final void w0(long pointerPosition, C5968w hitSemanticsEntities, int pointerType, boolean isInLayer) {
        getOuterCoordinator$ui_release().W2(NodeCoordinator.INSTANCE.b(), NodeCoordinator.A2(getOuterCoordinator$ui_release(), pointerPosition, false, 2, null), hitSemanticsEntities, g1.O.INSTANCE.d(), isInLayer);
    }

    public final void z0() {
        NodeCoordinator nodeCoordinatorQ = Q();
        if (nodeCoordinatorQ != null) {
            nodeCoordinatorQ.Y2();
            return;
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.z0();
        }
    }

    public /* synthetic */ LayoutNode(boolean z10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? C16819m.b() : i10);
    }
}
