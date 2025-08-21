package r1;

import Q0.L;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.y;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import t1.EnumC17174a;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000Ê\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aA\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u001c\u0010\u0007\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\f\u001a\u00020\u000b*\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u000b*\u00020\n¢\u0006\u0004\b\u000e\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000b*\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\r\u001a\u0011\u0010\u0010\u001a\u00020\u000b*\u00020\n¢\u0006\u0004\b\u0010\u0010\r\u001a\u0011\u0010\u0011\u001a\u00020\u000b*\u00020\n¢\u0006\u0004\b\u0011\u0010\r\u001a\u0011\u0010\u0012\u001a\u00020\u000b*\u00020\n¢\u0006\u0004\b\u0012\u0010\r\u001a\u0011\u0010\u0013\u001a\u00020\u000b*\u00020\n¢\u0006\u0004\b\u0013\u0010\r\u001a\u0019\u0010\u0015\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a%\u0010\u001b\u001a\u00020\u000b*\u00020\n2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001d\u001a\u00020\u000b*\u00020\n¢\u0006\u0004\b\u001d\u0010\r\u001a9\u0010#\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u001a\u0010\"\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f\u0012\u0004\u0012\u00020!\u0018\u00010\u0017¢\u0006\u0004\b#\u0010$\u001a-\u0010&\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010%¢\u0006\u0004\b&\u0010'\u001a-\u0010(\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010%¢\u0006\u0004\b(\u0010'\u001aW\u0010,\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000128\u0010\"\u001a4\u0012\u0013\u0012\u00110)¢\u0006\f\b*\u0012\b\b\u0002\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110)¢\u0006\f\b*\u0012\b\b\u0002\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020!\u0018\u00010\u0006¢\u0006\u0004\b,\u0010-\u001aD\u00101\u001a\u00020\u000b*\u00020\n21\u0010\"\u001a-\b\u0001\u0012\u0013\u0012\u00110.¢\u0006\f\b*\u0012\b\b\u0002\u0012\u0004\b\b(/\u0012\n\u0012\b\u0012\u0004\u0012\u00020.00\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0006¢\u0006\u0004\b1\u00102\u001a1\u00103\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020!0\u0017¢\u0006\u0004\b3\u0010$\u001a3\u00105\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020!\u0018\u00010\u0017¢\u0006\u0004\b5\u0010$\u001a3\u00106\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020!\u0018\u00010\u0017¢\u0006\u0004\b6\u0010$\u001a3\u00107\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020!\u0018\u00010\u0017¢\u0006\u0004\b7\u0010$\u001a3\u00108\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020!\u0018\u00010\u0017¢\u0006\u0004\b8\u0010$\u001a3\u00109\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!\u0018\u00010\u0017¢\u0006\u0004\b9\u0010$\u001a-\u0010:\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010%¢\u0006\u0004\b:\u0010'\u001a3\u0010+\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020!\u0018\u00010\u0017¢\u0006\u0004\b+\u0010$\u001a8\u0010=\u001a\u00020\u000b*\u00020\n2\u0006\u0010<\u001a\u00020;2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010%ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001al\u0010C\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012M\u0010\"\u001aI\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b*\u0012\b\b\u0002\u0012\u0004\b\b(@\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b*\u0012\b\b\u0002\u0012\u0004\b\b(A\u0012\u0013\u0012\u00110!¢\u0006\f\b*\u0012\b\b\u0002\u0012\u0004\b\b(B\u0012\u0004\u0012\u00020!\u0018\u00010?¢\u0006\u0004\bC\u0010D\u001a-\u0010E\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010%¢\u0006\u0004\bE\u0010'\u001a-\u0010F\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010%¢\u0006\u0004\bF\u0010'\u001a-\u0010G\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010%¢\u0006\u0004\bG\u0010'\u001a-\u0010H\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010%¢\u0006\u0004\bH\u0010'\u001a-\u0010I\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010%¢\u0006\u0004\bI\u0010'\u001a-\u0010J\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010%¢\u0006\u0004\bJ\u0010'\u001a-\u0010K\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010%¢\u0006\u0004\bK\u0010'\u001a-\u0010L\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010%¢\u0006\u0004\bL\u0010'\u001a-\u0010M\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010%¢\u0006\u0004\bM\u0010'\u001a-\u0010N\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010%¢\u0006\u0004\bN\u0010'\u001a-\u0010O\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010%¢\u0006\u0004\bO\u0010'\u001a-\u0010P\u001a\u00020\u000b*\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0%¢\u0006\u0004\bP\u0010'\"(\u0010U\u001a\u00020\u0001*\u00020\n2\u0006\u0010Q\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010S\"\u0004\bT\u0010\u0016\"/\u0010[\u001a\u00020\u0001*\u00020\n2\u0006\u0010V\u001a\u00020\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bW\u0010S\"\u0004\bX\u0010\u0016*\u0004\bY\u0010Z\"/\u0010b\u001a\u00020\\*\u00020\n2\u0006\u0010V\u001a\u00020\\8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`*\u0004\ba\u0010Z\"/\u0010f\u001a\u00020\u0001*\u00020\n2\u0006\u0010V\u001a\u00020\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bc\u0010S\"\u0004\bd\u0010\u0016*\u0004\be\u0010Z\"/\u0010m\u001a\u00020g*\u00020\n2\u0006\u0010V\u001a\u00020g8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bh\u0010i\"\u0004\bj\u0010k*\u0004\bl\u0010Z\"/\u0010s\u001a\u00020!*\u00020\n2\u0006\u0010V\u001a\u00020!8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bn\u0010o\"\u0004\bp\u0010q*\u0004\br\u0010Z\"5\u0010t\u001a\u00020!*\u00020\n2\u0006\u0010V\u001a\u00020!8F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\bv\u0010\r\u001a\u0004\bt\u0010o\"\u0004\bu\u0010q*\u0004\bw\u0010Z\"/\u0010x\u001a\u00020!*\u00020\n2\u0006\u0010V\u001a\u00020!8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bx\u0010o\"\u0004\by\u0010q*\u0004\bz\u0010Z\"1\u0010\u0081\u0001\u001a\u00020{*\u00020\n2\u0006\u0010V\u001a\u00020{8F@FX\u0086\u008e\u0002¢\u0006\u0013\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007f*\u0005\b\u0080\u0001\u0010Z\"7\u0010\u0088\u0001\u001a\u00030\u0082\u0001*\u00020\n2\u0007\u0010V\u001a\u00030\u0082\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001*\u0005\b\u0087\u0001\u0010Z\"7\u0010\u008c\u0001\u001a\u00030\u0082\u0001*\u00020\n2\u0007\u0010V\u001a\u00030\u0082\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0089\u0001\u0010\u0084\u0001\"\u0006\b\u008a\u0001\u0010\u0086\u0001*\u0005\b\u008b\u0001\u0010Z\"5\u0010\u0091\u0001\u001a\u00030\u008d\u0001*\u00020\n2\u0007\u0010V\u001a\u00030\u008d\u00018F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u008e\u0001\u0010i\"\u0005\b\u008f\u0001\u0010k*\u0005\b\u0090\u0001\u0010Z\"3\u0010\u0095\u0001\u001a\u00020\u0001*\u00020\n2\u0006\u0010V\u001a\u00020\u00018F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0092\u0001\u0010S\"\u0005\b\u0093\u0001\u0010\u0016*\u0005\b\u0094\u0001\u0010Z\"-\u0010\u009a\u0001\u001a\u000204*\u00020\n2\u0006\u0010Q\u001a\u0002048F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001\"5\u0010\u009e\u0001\u001a\u000204*\u00020\n2\u0006\u0010V\u001a\u0002048F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u009b\u0001\u0010\u0097\u0001\"\u0006\b\u009c\u0001\u0010\u0099\u0001*\u0005\b\u009d\u0001\u0010Z\"3\u0010\u009f\u0001\u001a\u00020!*\u00020\n2\u0006\u0010V\u001a\u00020!8F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u009f\u0001\u0010o\"\u0005\b \u0001\u0010q*\u0005\b¡\u0001\u0010Z\"5\u0010¥\u0001\u001a\u000204*\u00020\n2\u0006\u0010V\u001a\u0002048F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b¢\u0001\u0010\u0097\u0001\"\u0006\b£\u0001\u0010\u0099\u0001*\u0005\b¤\u0001\u0010Z\"5\u0010©\u0001\u001a\u000204*\u00020\n2\u0006\u0010V\u001a\u0002048F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b¦\u0001\u0010\u0097\u0001\"\u0006\b§\u0001\u0010\u0099\u0001*\u0005\b¨\u0001\u0010Z\"7\u0010°\u0001\u001a\u00030ª\u0001*\u00020\n2\u0007\u0010V\u001a\u00030ª\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001*\u0005\b¯\u0001\u0010Z\"3\u0010´\u0001\u001a\u00020!*\u00020\n2\u0006\u0010V\u001a\u00020!8F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b±\u0001\u0010o\"\u0005\b²\u0001\u0010q*\u0005\b³\u0001\u0010Z\"7\u0010»\u0001\u001a\u00030µ\u0001*\u00020\n2\u0007\u0010V\u001a\u00030µ\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001*\u0005\bº\u0001\u0010Z\"7\u0010Â\u0001\u001a\u00030¼\u0001*\u00020\n2\u0007\u0010V\u001a\u00030¼\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001*\u0005\bÁ\u0001\u0010Z\"3\u0010Ã\u0001\u001a\u00020!*\u00020\n2\u0006\u0010V\u001a\u00020!8F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\bÃ\u0001\u0010o\"\u0005\bÄ\u0001\u0010q*\u0005\bÅ\u0001\u0010Z\"E\u0010Í\u0001\u001a\n\u0012\u0005\u0012\u00030Ç\u00010Æ\u0001*\u00020\n2\u000e\u0010V\u001a\n\u0012\u0005\u0012\u00030Ç\u00010Æ\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001*\u0005\bÌ\u0001\u0010Z\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Î\u0001"}, d2 = {"T", "", "name", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "a", "(Ljava/lang/String;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lkotlin/Function2;", "mergePolicy", "b", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lr1/u;", "", "v", "(Lr1/u;)V", "l", "A", "w", "U", "k", "R", "description", "o", "(Lr1/u;Ljava/lang/String;)V", "Lkotlin/Function1;", "", "", "mapping", "x", "(Lr1/u;Lkotlin/jvm/functions/Function1;)V", "c0", "label", "", "Lu1/v;", "", "action", "t", "(Lr1/u;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "D", "(Lr1/u;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "H", "", "Lkotlin/ParameterName;", "y", "X", "(Lr1/u;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "LU0/f;", "offset", "Lkotlin/coroutines/Continuation;", "Z", "(Lr1/u;Lkotlin/jvm/functions/Function2;)V", "a0", "Landroidx/compose/ui/text/AnnotatedString;", "B", "p0", "A0", "E0", "J0", "c", "Landroidx/compose/ui/text/input/a;", "imeActionType", "F", "(Lr1/u;ILjava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function3;", "startIndex", "endIndex", "relativeToOriginalText", "u0", "(Lr1/u;Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V", "g", "i", "S", "p", "e", "m", "V", "P", "J", "L", "N", "r", "value", "getContentDescription", "(Lr1/u;)Ljava/lang/String;", "g0", "contentDescription", "<set-?>", "getStateDescription", "x0", "getStateDescription$delegate", "(Lr1/u;)Ljava/lang/Object;", "stateDescription", "Lr1/h;", "getProgressBarRangeInfo", "(Lr1/u;)Lr1/h;", "r0", "(Lr1/u;Lr1/h;)V", "getProgressBarRangeInfo$delegate", "progressBarRangeInfo", "getPaneTitle", "o0", "getPaneTitle$delegate", "paneTitle", "Lr1/g;", "getLiveRegion", "(Lr1/u;)I", "n0", "(Lr1/u;I)V", "getLiveRegion$delegate", "liveRegion", "getFocused", "(Lr1/u;)Z", "k0", "(Lr1/u;Z)V", "getFocused$delegate", "focused", "isContainer", "e0", "isContainer$annotations", "isContainer$delegate", "isTraversalGroup", "H0", "isTraversalGroup$delegate", "LQ0/L;", "getContentDataType", "(Lr1/u;)LQ0/L;", "f0", "(Lr1/u;LQ0/L;)V", "getContentDataType$delegate", "contentDataType", "Lr1/i;", "getHorizontalScrollAxisRange", "(Lr1/u;)Lr1/i;", "l0", "(Lr1/u;Lr1/i;)V", "getHorizontalScrollAxisRange$delegate", "horizontalScrollAxisRange", "getVerticalScrollAxisRange", "I0", "getVerticalScrollAxisRange$delegate", "verticalScrollAxisRange", "Landroidx/compose/ui/semantics/Role;", "getRole", "s0", "getRole$delegate", "role", "getTestTag", "y0", "getTestTag$delegate", "testTag", "getText", "(Lr1/u;)Landroidx/compose/ui/text/AnnotatedString;", "z0", "(Lr1/u;Landroidx/compose/ui/text/AnnotatedString;)V", "text", "getTextSubstitution", "D0", "getTextSubstitution$delegate", "textSubstitution", "isShowingTextSubstitution", "w0", "isShowingTextSubstitution$delegate", "getInputText", "m0", "getInputText$delegate", "inputText", "getEditableText", "j0", "getEditableText$delegate", "editableText", "Landroidx/compose/ui/text/y;", "getTextSelectionRange", "(Lr1/u;)J", "C0", "(Lr1/u;J)V", "getTextSelectionRange$delegate", "textSelectionRange", "getSelected", "t0", "getSelected$delegate", "selected", "Lr1/b;", "getCollectionInfo", "(Lr1/u;)Lr1/b;", "d0", "(Lr1/u;Lr1/b;)V", "getCollectionInfo$delegate", "collectionInfo", "Lt1/a;", "getToggleableState", "(Lr1/u;)Lt1/a;", "G0", "(Lr1/u;Lt1/a;)V", "getToggleableState$delegate", "toggleableState", "isEditable", "i0", "isEditable$delegate", "", "Lr1/e;", "getCustomActions", "(Lr1/u;)Ljava/util/List;", "h0", "(Lr1/u;Ljava/util/List;)V", "getCustomActions$delegate", "customActions", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f159188a = {Reflection.f(new MutablePropertyReference1Impl(s.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), Reflection.f(new MutablePropertyReference1Impl(s.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1)), Reflection.f(new MutablePropertyReference1Impl(s.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), Reflection.f(new MutablePropertyReference1Impl(s.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), Reflection.f(new MutablePropertyReference1Impl(s.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.f(new MutablePropertyReference1Impl(s.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.f(new MutablePropertyReference1Impl(s.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.f(new MutablePropertyReference1Impl(s.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1)), Reflection.f(new MutablePropertyReference1Impl(s.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1)), Reflection.f(new MutablePropertyReference1Impl(s.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1)), Reflection.f(new MutablePropertyReference1Impl(s.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), Reflection.f(new MutablePropertyReference1Impl(s.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), Reflection.f(new MutablePropertyReference1Impl(s.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), Reflection.f(new MutablePropertyReference1Impl(s.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), Reflection.f(new MutablePropertyReference1Impl(s.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), Reflection.f(new MutablePropertyReference1Impl(s.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.f(new MutablePropertyReference1Impl(s.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), Reflection.f(new MutablePropertyReference1Impl(s.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), Reflection.f(new MutablePropertyReference1Impl(s.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1)), Reflection.f(new MutablePropertyReference1Impl(s.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), Reflection.f(new MutablePropertyReference1Impl(s.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.f(new MutablePropertyReference1Impl(s.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1)), Reflection.f(new MutablePropertyReference1Impl(s.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1)), Reflection.f(new MutablePropertyReference1Impl(s.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1)), Reflection.f(new MutablePropertyReference1Impl(s.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.f(new MutablePropertyReference1Impl(s.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), Reflection.f(new MutablePropertyReference1Impl(s.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1))};

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "", "a", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<List<Float>, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Float> f159189f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0<Float> function0) {
            super(1);
            this.f159189f = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List<Float> list) {
            boolean z10;
            Float fInvoke = this.f159189f.invoke();
            if (fInvoke == null) {
                z10 = false;
            } else {
                list.add(fInvoke);
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    static {
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        semanticsProperties.z();
        semanticsProperties.w();
        semanticsProperties.v();
        semanticsProperties.t();
        semanticsProperties.getFocused();
        semanticsProperties.m();
        semanticsProperties.r();
        semanticsProperties.d();
        semanticsProperties.c();
        semanticsProperties.D();
        semanticsProperties.h();
        semanticsProperties.E();
        semanticsProperties.getRole();
        semanticsProperties.getTestTag();
        semanticsProperties.B();
        semanticsProperties.q();
        semanticsProperties.k();
        semanticsProperties.getEditableText();
        semanticsProperties.A();
        semanticsProperties.i();
        semanticsProperties.y();
        semanticsProperties.a();
        semanticsProperties.b();
        semanticsProperties.C();
        semanticsProperties.o();
        semanticsProperties.u();
        SemanticsActions.INSTANCE.d();
    }

    @Deprecated
    public static final void A(u uVar) {
        uVar.a(SemanticsProperties.INSTANCE.l(), Unit.f143329a);
    }

    public static final void A0(u uVar, String str, Function1<? super AnnotatedString, Boolean> function1) {
        uVar.a(SemanticsActions.INSTANCE.getSetText(), new AccessibilityAction(str, function1));
    }

    public static final void B(u uVar, String str, Function1<? super AnnotatedString, Boolean> function1) {
        uVar.a(SemanticsActions.INSTANCE.k(), new AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void B0(u uVar, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        A0(uVar, str, function1);
    }

    public static /* synthetic */ void C(u uVar, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        B(uVar, str, function1);
    }

    public static final void C0(u uVar, long j10) {
        SemanticsProperties.INSTANCE.A().d(uVar, f159188a[18], y.b(j10));
    }

    public static final void D(u uVar, String str, Function0<Boolean> function0) {
        uVar.a(SemanticsActions.INSTANCE.l(), new AccessibilityAction(str, function0));
    }

    public static final void D0(u uVar, AnnotatedString annotatedString) {
        SemanticsProperties.INSTANCE.B().d(uVar, f159188a[14], annotatedString);
    }

    public static /* synthetic */ void E(u uVar, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        D(uVar, str, function0);
    }

    public static final void E0(u uVar, String str, Function1<? super AnnotatedString, Boolean> function1) {
        uVar.a(SemanticsActions.INSTANCE.z(), new AccessibilityAction(str, function1));
    }

    public static final void F(u uVar, int i10, String str, Function0<Boolean> function0) {
        uVar.a(SemanticsProperties.INSTANCE.i(), androidx.compose.ui.text.input.a.j(i10));
        uVar.a(SemanticsActions.INSTANCE.m(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void F0(u uVar, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        E0(uVar, str, function1);
    }

    public static /* synthetic */ void G(u uVar, int i10, String str, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        F(uVar, i10, str, function0);
    }

    public static final void G0(u uVar, EnumC17174a enumC17174a) {
        SemanticsProperties.INSTANCE.C().d(uVar, f159188a[23], enumC17174a);
    }

    public static final void H(u uVar, String str, Function0<Boolean> function0) {
        uVar.a(SemanticsActions.INSTANCE.n(), new AccessibilityAction(str, function0));
    }

    public static final void H0(u uVar, boolean z10) {
        SemanticsProperties.INSTANCE.r().d(uVar, f159188a[6], Boolean.valueOf(z10));
    }

    public static /* synthetic */ void I(u uVar, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        H(uVar, str, function0);
    }

    public static final void I0(u uVar, ScrollAxisRange scrollAxisRange) {
        SemanticsProperties.INSTANCE.E().d(uVar, f159188a[11], scrollAxisRange);
    }

    public static final void J(u uVar, String str, Function0<Boolean> function0) {
        uVar.a(SemanticsActions.INSTANCE.o(), new AccessibilityAction(str, function0));
    }

    public static final void J0(u uVar, String str, Function1<? super Boolean, Boolean> function1) {
        uVar.a(SemanticsActions.INSTANCE.A(), new AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void K(u uVar, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        J(uVar, str, function0);
    }

    public static /* synthetic */ void K0(u uVar, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        J0(uVar, str, function1);
    }

    public static final void L(u uVar, String str, Function0<Boolean> function0) {
        uVar.a(SemanticsActions.INSTANCE.p(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void M(u uVar, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        L(uVar, str, function0);
    }

    public static final void N(u uVar, String str, Function0<Boolean> function0) {
        uVar.a(SemanticsActions.INSTANCE.q(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void O(u uVar, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        N(uVar, str, function0);
    }

    public static final void P(u uVar, String str, Function0<Boolean> function0) {
        uVar.a(SemanticsActions.INSTANCE.r(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void Q(u uVar, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        P(uVar, str, function0);
    }

    public static final void R(u uVar) {
        uVar.a(SemanticsProperties.INSTANCE.getPassword(), Unit.f143329a);
    }

    public static final void S(u uVar, String str, Function0<Boolean> function0) {
        uVar.a(SemanticsActions.INSTANCE.s(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void T(u uVar, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        S(uVar, str, function0);
    }

    public static final void U(u uVar) {
        uVar.a(SemanticsProperties.INSTANCE.p(), Unit.f143329a);
    }

    public static final void V(u uVar, String str, Function0<Boolean> function0) {
        uVar.a(SemanticsActions.INSTANCE.t(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void W(u uVar, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        V(uVar, str, function0);
    }

    public static final void X(u uVar, String str, Function2<? super Float, ? super Float, Boolean> function2) {
        uVar.a(SemanticsActions.INSTANCE.u(), new AccessibilityAction(str, function2));
    }

    public static /* synthetic */ void Y(u uVar, String str, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        X(uVar, str, function2);
    }

    public static final void Z(u uVar, Function2<? super U0.f, ? super Continuation<? super U0.f>, ? extends Object> function2) {
        uVar.a(SemanticsActions.INSTANCE.v(), function2);
    }

    public static final <T> SemanticsPropertyKey<T> a(String str) {
        return new SemanticsPropertyKey<>(str, true);
    }

    public static final void a0(u uVar, String str, Function1<? super Integer, Boolean> function1) {
        uVar.a(SemanticsActions.INSTANCE.w(), new AccessibilityAction(str, function1));
    }

    public static final <T> SemanticsPropertyKey<T> b(String str, Function2<? super T, ? super T, ? extends T> function2) {
        return new SemanticsPropertyKey<>(str, true, function2);
    }

    public static /* synthetic */ void b0(u uVar, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        a0(uVar, str, function1);
    }

    public static final void c(u uVar, String str, Function0<Boolean> function0) {
        uVar.a(SemanticsActions.INSTANCE.a(), new AccessibilityAction(str, function0));
    }

    public static final void c0(u uVar) {
        uVar.a(SemanticsProperties.INSTANCE.x(), Unit.f143329a);
    }

    public static /* synthetic */ void d(u uVar, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        c(uVar, str, function0);
    }

    public static final void d0(u uVar, C16808b c16808b) {
        SemanticsProperties.INSTANCE.a().d(uVar, f159188a[21], c16808b);
    }

    public static final void e(u uVar, String str, Function0<Boolean> function0) {
        uVar.a(SemanticsActions.INSTANCE.b(), new AccessibilityAction(str, function0));
    }

    public static final void e0(u uVar, boolean z10) {
        SemanticsProperties.INSTANCE.m().d(uVar, f159188a[5], Boolean.valueOf(z10));
    }

    public static /* synthetic */ void f(u uVar, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        e(uVar, str, function0);
    }

    public static final void f0(u uVar, L l10) {
        SemanticsProperties.INSTANCE.c().d(uVar, f159188a[8], l10);
    }

    public static final void g(u uVar, String str, Function0<Boolean> function0) {
        uVar.a(SemanticsActions.INSTANCE.c(), new AccessibilityAction(str, function0));
    }

    public static final void g0(u uVar, String str) {
        uVar.a(SemanticsProperties.INSTANCE.getContentDescription(), CollectionsKt.e(str));
    }

    public static /* synthetic */ void h(u uVar, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        g(uVar, str, function0);
    }

    public static final void h0(u uVar, List<CustomAccessibilityAction> list) {
        SemanticsActions.INSTANCE.d().d(uVar, f159188a[26], list);
    }

    public static final void i(u uVar, String str, Function0<Boolean> function0) {
        uVar.a(SemanticsActions.INSTANCE.e(), new AccessibilityAction(str, function0));
    }

    public static final void i0(u uVar, boolean z10) {
        SemanticsProperties.INSTANCE.o().d(uVar, f159188a[24], Boolean.valueOf(z10));
    }

    public static /* synthetic */ void j(u uVar, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        i(uVar, str, function0);
    }

    public static final void j0(u uVar, AnnotatedString annotatedString) {
        SemanticsProperties.INSTANCE.getEditableText().d(uVar, f159188a[17], annotatedString);
    }

    public static final void k(u uVar) {
        uVar.a(SemanticsProperties.INSTANCE.n(), Unit.f143329a);
    }

    public static final void k0(u uVar, boolean z10) {
        SemanticsProperties.INSTANCE.getFocused().d(uVar, f159188a[4], Boolean.valueOf(z10));
    }

    public static final void l(u uVar) {
        uVar.a(SemanticsProperties.INSTANCE.getDisabled(), Unit.f143329a);
    }

    public static final void l0(u uVar, ScrollAxisRange scrollAxisRange) {
        SemanticsProperties.INSTANCE.h().d(uVar, f159188a[10], scrollAxisRange);
    }

    public static final void m(u uVar, String str, Function0<Boolean> function0) {
        uVar.a(SemanticsActions.INSTANCE.f(), new AccessibilityAction(str, function0));
    }

    public static final void m0(u uVar, AnnotatedString annotatedString) {
        SemanticsProperties.INSTANCE.k().d(uVar, f159188a[16], annotatedString);
    }

    public static /* synthetic */ void n(u uVar, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        m(uVar, str, function0);
    }

    public static final void n0(u uVar, int i10) {
        SemanticsProperties.INSTANCE.t().d(uVar, f159188a[3], C16813g.c(i10));
    }

    public static final void o(u uVar, String str) {
        uVar.a(SemanticsProperties.INSTANCE.e(), str);
    }

    public static final void o0(u uVar, String str) {
        SemanticsProperties.INSTANCE.v().d(uVar, f159188a[2], str);
    }

    public static final void p(u uVar, String str, Function0<Boolean> function0) {
        uVar.a(SemanticsActions.INSTANCE.g(), new AccessibilityAction(str, function0));
    }

    public static final void p0(u uVar, String str, Function1<? super Float, Boolean> function1) {
        uVar.a(SemanticsActions.INSTANCE.x(), new AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void q(u uVar, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        p(uVar, str, function0);
    }

    public static /* synthetic */ void q0(u uVar, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        p0(uVar, str, function1);
    }

    public static final void r(u uVar, String str, Function0<Float> function0) {
        uVar.a(SemanticsActions.INSTANCE.h(), new AccessibilityAction(str, new a(function0)));
    }

    public static final void r0(u uVar, ProgressBarRangeInfo progressBarRangeInfo) {
        SemanticsProperties.INSTANCE.w().d(uVar, f159188a[1], progressBarRangeInfo);
    }

    public static /* synthetic */ void s(u uVar, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        r(uVar, str, function0);
    }

    public static final void s0(u uVar, int i10) {
        SemanticsProperties.INSTANCE.getRole().d(uVar, f159188a[12], Role.j(i10));
    }

    public static final void t(u uVar, String str, Function1<? super List<TextLayoutResult>, Boolean> function1) {
        uVar.a(SemanticsActions.INSTANCE.i(), new AccessibilityAction(str, function1));
    }

    public static final void t0(u uVar, boolean z10) {
        SemanticsProperties.INSTANCE.y().d(uVar, f159188a[20], Boolean.valueOf(z10));
    }

    public static /* synthetic */ void u(u uVar, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        t(uVar, str, function1);
    }

    public static final void u0(u uVar, String str, Function3<? super Integer, ? super Integer, ? super Boolean, Boolean> function3) {
        uVar.a(SemanticsActions.INSTANCE.y(), new AccessibilityAction(str, function3));
    }

    public static final void v(u uVar) {
        uVar.a(SemanticsProperties.INSTANCE.f(), Unit.f143329a);
    }

    public static /* synthetic */ void v0(u uVar, String str, Function3 function3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        u0(uVar, str, function3);
    }

    public static final void w(u uVar) {
        uVar.a(SemanticsProperties.INSTANCE.g(), Unit.f143329a);
    }

    public static final void w0(u uVar, boolean z10) {
        SemanticsProperties.INSTANCE.q().d(uVar, f159188a[15], Boolean.valueOf(z10));
    }

    public static final void x(u uVar, Function1<Object, Integer> function1) {
        uVar.a(SemanticsProperties.INSTANCE.j(), function1);
    }

    public static final void x0(u uVar, String str) {
        SemanticsProperties.INSTANCE.z().d(uVar, f159188a[0], str);
    }

    public static final void y(u uVar, String str, Function1<? super AnnotatedString, Boolean> function1) {
        uVar.a(SemanticsActions.INSTANCE.j(), new AccessibilityAction(str, function1));
    }

    public static final void y0(u uVar, String str) {
        SemanticsProperties.INSTANCE.getTestTag().d(uVar, f159188a[13], str);
    }

    public static /* synthetic */ void z(u uVar, String str, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        y(uVar, str, function1);
    }

    public static final void z0(u uVar, AnnotatedString annotatedString) {
        uVar.a(SemanticsProperties.INSTANCE.getText(), CollectionsKt.e(annotatedString));
    }
}
