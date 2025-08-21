package kotlin.collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\b(\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a/\u0010\u0005\u001a\u00020\u0004\"\t\b\u0000\u0010\u0001¢\u0006\u0002\b\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001c\u0010\t\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\r\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u0011\u001a\u00020\u0004*\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001c\u0010\u0015\u001a\u00020\u0004*\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0014H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001c\u0010\u0018\u001a\u00020\u0004*\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001c\u0010\u001c\u001a\u00020\u0004*\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u001bH\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010 \u001a\u00020\u0010*\u00020\u000f¢\u0006\u0004\b \u0010!\u001a!\u0010\"\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0004\b\"\u0010\u001f\u001a)\u0010$\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u0006\u0010#\u001a\u00020\u0010¢\u0006\u0004\b$\u0010%\u001a\u001b\u0010&\u001a\u0004\u0018\u00010\u0010*\u00020\u000f2\u0006\u0010#\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'\u001a,\u0010(\u001a\u00020\u0010\"\t\b\u0000\u0010\u0001¢\u0006\u0002\b\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b(\u0010)\u001a\u0019\u0010*\u001a\u00020\u0010*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b*\u0010+\u001a\u0019\u0010,\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b,\u0010-\u001a\u0019\u0010.\u001a\u00020\u0010*\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0010¢\u0006\u0004\b.\u0010/\u001a\u0019\u00100\u001a\u00020\u0010*\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0014¢\u0006\u0004\b0\u00101\u001a\u0019\u00102\u001a\u00020\u0010*\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b2\u00103\u001a\u0019\u00104\u001a\u00020\u0010*\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u001b¢\u0006\u0004\b4\u00105\u001a\u001f\u00106\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0004\b6\u0010\u001f\u001a,\u00107\u001a\u00020\u0010\"\t\b\u0000\u0010\u0001¢\u0006\u0002\b\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b7\u0010)\u001a\u0019\u00108\u001a\u00020\u0010*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b8\u0010+\u001a\u0019\u00109\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b9\u0010-\u001a\u0019\u0010:\u001a\u00020\u0010*\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0010¢\u0006\u0004\b:\u0010/\u001a\u0019\u0010;\u001a\u00020\u0010*\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0014¢\u0006\u0004\b;\u00101\u001a\u0019\u0010<\u001a\u00020\u0010*\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b<\u00103\u001a\u0019\u0010=\u001a\u00020\u0010*\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u001b¢\u0006\u0004\b=\u00105\u001a!\u0010>\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0004\b>\u0010\u001f\u001a\u001f\u0010?\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0004\b?\u0010\u001f\u001a\u0011\u0010@\u001a\u00020\u001b*\u00020\u001a¢\u0006\u0004\b@\u0010A\u001a!\u0010B\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0004\bB\u0010\u001f\u001a-\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000D\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u0006\u0010C\u001a\u00020\u0010¢\u0006\u0004\bE\u0010F\u001a+\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000D\"\b\b\u0000\u0010\u0001*\u00020G*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0002¢\u0006\u0004\bH\u0010I\u001a?\u0010M\u001a\u00028\u0000\"\u0010\b\u0000\u0010K*\n\u0012\u0006\b\u0000\u0012\u00028\u00010J\"\b\b\u0001\u0010\u0001*\u00020G*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00010\u00022\u0006\u0010L\u001a\u00028\u0000¢\u0006\u0004\bM\u0010N\u001a\u0019\u0010Q\u001a\u00020\u0007*\u00020\u00072\u0006\u0010P\u001a\u00020O¢\u0006\u0004\bQ\u0010R\u001a-\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000D\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u0006\u0010C\u001a\u00020\u0010¢\u0006\u0004\bS\u0010F\u001a-\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000D\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u0006\u0010C\u001a\u00020\u0010¢\u0006\u0004\bT\u0010F\u001a-\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000U*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\bV\u0010W\u001aC\u0010[\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u001a\u0010Z\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Xj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`Y¢\u0006\u0004\b[\u0010\\\u001aA\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000D\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u001a\u0010Z\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Xj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`Y¢\u0006\u0004\b]\u0010^\u001a9\u0010_\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0001\"\u0010\b\u0001\u0010K*\n\u0012\u0006\b\u0000\u0012\u00028\u00000J*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u0006\u0010L\u001a\u00028\u0001¢\u0006\u0004\b_\u0010N\u001a%\u0010`\u001a\b\u0012\u0004\u0012\u00028\u00000D\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0004\b`\u0010I\u001a\u0017\u0010a\u001a\b\u0012\u0004\u0012\u00020\b0D*\u00020\u0007¢\u0006\u0004\ba\u0010b\u001a\u0017\u0010c\u001a\b\u0012\u0004\u0012\u00020\f0D*\u00020\u000b¢\u0006\u0004\bc\u0010d\u001a\u0017\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00100D*\u00020\u000f¢\u0006\u0004\be\u0010f\u001a\u0017\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00140D*\u00020\u0013¢\u0006\u0004\bg\u0010h\u001a\u0017\u0010k\u001a\b\u0012\u0004\u0012\u00020j0D*\u00020i¢\u0006\u0004\bk\u0010l\u001a\u0017\u0010o\u001a\b\u0012\u0004\u0012\u00020n0D*\u00020m¢\u0006\u0004\bo\u0010p\u001a\u0017\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00040D*\u00020\u0017¢\u0006\u0004\bq\u0010r\u001a\u0017\u0010s\u001a\b\u0012\u0004\u0012\u00020\u001b0D*\u00020\u001a¢\u0006\u0004\bs\u0010t\u001a%\u0010v\u001a\b\u0012\u0004\u0012\u00028\u00000u\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0004\bv\u0010I\u001a\u0017\u0010w\u001a\b\u0012\u0004\u0012\u00020\b0u*\u00020\u0007¢\u0006\u0004\bw\u0010b\u001a\u0017\u0010x\u001a\b\u0012\u0004\u0012\u00020\f0u*\u00020\u000b¢\u0006\u0004\bx\u0010d\u001a\u0017\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00100u*\u00020\u000f¢\u0006\u0004\by\u0010f\u001a\u0017\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00140u*\u00020\u0013¢\u0006\u0004\bz\u0010h\u001a\u0017\u0010{\u001a\b\u0012\u0004\u0012\u00020j0u*\u00020i¢\u0006\u0004\b{\u0010l\u001a\u0017\u0010|\u001a\b\u0012\u0004\u0012\u00020n0u*\u00020m¢\u0006\u0004\b|\u0010p\u001a\u0017\u0010}\u001a\b\u0012\u0004\u0012\u00020\u00040u*\u00020\u0017¢\u0006\u0004\b}\u0010r\u001a\u0017\u0010~\u001a\b\u0012\u0004\u0012\u00020\u001b0u*\u00020\u001a¢\u0006\u0004\b~\u0010t\u001a(\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u007f\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a0\u0010\u0084\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000\u0083\u00010\u0082\u0001\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0018\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0010*\u00020\u000fH\u0007¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0018\u0010\u0088\u0001\u001a\u0004\u0018\u00010j*\u00020iH\u0007¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0018\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0010*\u00020\u000fH\u0007¢\u0006\u0006\b\u008a\u0001\u0010\u0087\u0001\u001a\u0018\u0010\u008b\u0001\u001a\u0004\u0018\u00010j*\u00020iH\u0007¢\u0006\u0006\b\u008b\u0001\u0010\u0089\u0001\u001aP\u0010\u008f\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u008e\u00010D\"\u0004\b\u0000\u0010\u0001\"\u0005\b\u0001\u0010\u008c\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u000f\u0010\u008d\u0001\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0002H\u0086\u0004¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001\u001aO\u0010\u0091\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u008e\u00010D\"\u0004\b\u0000\u0010\u0001\"\u0005\b\u0001\u0010\u008c\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u000e\u0010\u008d\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u0082\u0001H\u0086\u0004¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0092\u0001\u0010\u009f\u0001\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0001\"\u000f\b\u0001\u0010\u0095\u0001*\b0\u0093\u0001j\u0003`\u0094\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\u0007\u0010\u0096\u0001\u001a\u00028\u00012\n\b\u0002\u0010\u0098\u0001\u001a\u00030\u0097\u00012\n\b\u0002\u0010\u0099\u0001\u001a\u00030\u0097\u00012\n\b\u0002\u0010\u009a\u0001\u001a\u00030\u0097\u00012\t\b\u0002\u0010\u009b\u0001\u001a\u00020\u00102\n\b\u0002\u0010\u009c\u0001\u001a\u00030\u0097\u00012\u0019\b\u0002\u0010\u009e\u0001\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u00030\u0097\u0001\u0018\u00010\u009d\u0001¢\u0006\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0084\u0001\u0010¡\u0001\u001a\u00028\u0000\"\u000f\b\u0000\u0010\u0095\u0001*\b0\u0093\u0001j\u0003`\u0094\u0001*\u00020\u00072\u0007\u0010\u0096\u0001\u001a\u00028\u00002\n\b\u0002\u0010\u0098\u0001\u001a\u00030\u0097\u00012\n\b\u0002\u0010\u0099\u0001\u001a\u00030\u0097\u00012\n\b\u0002\u0010\u009a\u0001\u001a\u00030\u0097\u00012\t\b\u0002\u0010\u009b\u0001\u001a\u00020\u00102\n\b\u0002\u0010\u009c\u0001\u001a\u00030\u0097\u00012\u0019\b\u0002\u0010\u009e\u0001\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0005\u0012\u00030\u0097\u0001\u0018\u00010\u009d\u0001¢\u0006\u0006\b¡\u0001\u0010¢\u0001\u001ay\u0010¤\u0001\u001a\u00030£\u0001\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0098\u0001\u001a\u00030\u0097\u00012\n\b\u0002\u0010\u0099\u0001\u001a\u00030\u0097\u00012\n\b\u0002\u0010\u009a\u0001\u001a\u00030\u0097\u00012\t\b\u0002\u0010\u009b\u0001\u001a\u00020\u00102\n\b\u0002\u0010\u009c\u0001\u001a\u00030\u0097\u00012\u0019\b\u0002\u0010\u009e\u0001\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u00030\u0097\u0001\u0018\u00010\u009d\u0001¢\u0006\u0006\b¤\u0001\u0010¥\u0001\u001ak\u0010¦\u0001\u001a\u00030£\u0001*\u00020\u00072\n\b\u0002\u0010\u0098\u0001\u001a\u00030\u0097\u00012\n\b\u0002\u0010\u0099\u0001\u001a\u00030\u0097\u00012\n\b\u0002\u0010\u009a\u0001\u001a\u00030\u0097\u00012\t\b\u0002\u0010\u009b\u0001\u001a\u00020\u00102\n\b\u0002\u0010\u009c\u0001\u001a\u00030\u0097\u00012\u0019\b\u0002\u0010\u009e\u0001\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0005\u0012\u00030\u0097\u0001\u0018\u00010\u009d\u0001¢\u0006\u0006\b¦\u0001\u0010§\u0001\u001a)\u0010\u008c\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0082\u0001\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u0085\u0001\u001a'\u0010\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000¨\u0001\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002¢\u0006\u0005\b\u0001\u0010©\u0001\u001a\u001b\u0010ª\u0001\u001a\t\u0012\u0004\u0012\u00020\u00100¨\u0001*\u00020\u000f¢\u0006\u0006\bª\u0001\u0010«\u0001\u001a\u0013\u0010¬\u0001\u001a\u00020\u0010*\u00020\u000f¢\u0006\u0005\b¬\u0001\u0010!\"%\u0010P\u001a\u00020O\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00028F¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0017\u0010P\u001a\u00020O*\u00020\u000f8F¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001\"&\u0010³\u0001\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00028F¢\u0006\b\u001a\u0006\b±\u0001\u0010²\u0001\"\u0017\u0010³\u0001\u001a\u00020\u0010*\u00020\u000f8F¢\u0006\u0007\u001a\u0005\b´\u0001\u0010!\"\u0018\u0010³\u0001\u001a\u00020\u0010*\u00020\u00138F¢\u0006\b\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0018\u0010³\u0001\u001a\u00020\u0010*\u00020i8F¢\u0006\b\u001a\u0006\b·\u0001\u0010¸\u0001¨\u0006¹\u0001"}, d2 = {"Lkotlin/internal/OnlyInputTypes;", "T", "", "element", "", "Y", "([Ljava/lang/Object;Ljava/lang/Object;)Z", "", "", "U", "([BB)Z", "", "", "Z", "([SS)Z", "", "", "W", "([II)Z", "", "", "X", "([JJ)Z", "", "a0", "([ZZ)Z", "", "", "V", "([CC)Z", "f0", "([Ljava/lang/Object;)Ljava/lang/Object;", "e0", "([I)I", "g0", "index", "o0", "([Ljava/lang/Object;I)Ljava/lang/Object;", "n0", "([II)Ljava/lang/Integer;", "t0", "([Ljava/lang/Object;Ljava/lang/Object;)I", "p0", "([BB)I", "u0", "([SS)I", "r0", "([II)I", "s0", "([JJ)I", "v0", "([ZZ)I", "q0", "([CC)I", "D0", "I0", "E0", "J0", "G0", "H0", "K0", "F0", "L0", "R0", "Q0", "([C)C", "S0", "n", "", "b0", "([Ljava/lang/Object;I)Ljava/util/List;", "", "c0", "([Ljava/lang/Object;)Ljava/util/List;", "", "C", "destination", "d0", "([Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;", "Lkotlin/ranges/IntRange;", "indices", "T0", "([BLkotlin/ranges/IntRange;)[B", "Y0", "Z0", "", "U0", "([Ljava/lang/Comparable;)[Ljava/lang/Comparable;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "V0", "([Ljava/lang/Object;Ljava/util/Comparator;)[Ljava/lang/Object;", "W0", "([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;", "a1", "h1", "b1", "([B)Ljava/util/List;", "i1", "([S)Ljava/util/List;", "f1", "([I)Ljava/util/List;", "g1", "([J)Ljava/util/List;", "", "", "e1", "([F)Ljava/util/List;", "", "", "d1", "([D)Ljava/util/List;", "j1", "([Z)Ljava/util/List;", "c1", "([C)Ljava/util/List;", "", "q1", "k1", "r1", "o1", "p1", "n1", "m1", "s1", "l1", "", "t1", "([Ljava/lang/Object;)Ljava/util/Set;", "", "Lkotlin/collections/IndexedValue;", "u1", "([Ljava/lang/Object;)Ljava/lang/Iterable;", "N0", "([I)Ljava/lang/Integer;", "M0", "([F)Ljava/lang/Float;", "P0", "O0", "R", "other", "Lkotlin/Pair;", "x1", "([Ljava/lang/Object;[Ljava/lang/Object;)Ljava/util/List;", "w1", "([Ljava/lang/Object;Ljava/lang/Iterable;)Ljava/util/List;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "Lkotlin/Function1;", "transform", "x0", "([Ljava/lang/Object;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "w0", "([BLjava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "", "A0", "([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "z0", "([BLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "Lkotlin/sequences/Sequence;", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "S", "([I)Lkotlin/sequences/Sequence;", "X0", "i0", "([Ljava/lang/Object;)Lkotlin/ranges/IntRange;", "h0", "([I)Lkotlin/ranges/IntRange;", "m0", "([Ljava/lang/Object;)I", "lastIndex", "k0", "l0", "([J)I", "j0", "([F)I", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
@SourceDebugExtension
/* loaded from: classes6.dex */
public class ArraysKt___ArraysKt extends ArraysKt___ArraysJvmKt {
    public static final <T> String A0(T[] tArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.j(tArr, "<this>");
        Intrinsics.j(separator, "separator");
        Intrinsics.j(prefix, "prefix");
        Intrinsics.j(postfix, "postfix");
        Intrinsics.j(truncated, "truncated");
        return ((StringBuilder) x0(tArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
    }

    public static /* synthetic */ String B0(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function12 = function1;
        return z0(bArr, charSequence, charSequence2, charSequence3, i10, charSequence5, function12);
    }

    public static /* synthetic */ String C0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function12 = function1;
        return A0(objArr, charSequence, charSequence2, charSequence3, i10, charSequence5, function12);
    }

    public static <T> T D0(T[] tArr) {
        Intrinsics.j(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[m0(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int E0(byte[] bArr, byte b10) {
        Intrinsics.j(bArr, "<this>");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (b10 == bArr[length]) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    public static final int F0(char[] cArr, char c10) {
        Intrinsics.j(cArr, "<this>");
        int length = cArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (c10 == cArr[length]) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    public static int G0(int[] iArr, int i10) {
        Intrinsics.j(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (i10 == iArr[length]) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    public static int H0(long[] jArr, long j10) {
        Intrinsics.j(jArr, "<this>");
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (j10 == jArr[length]) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    public static <T> int I0(T[] tArr, T t10) {
        Intrinsics.j(tArr, "<this>");
        if (t10 == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i11 = length2 - 1;
                    if (Intrinsics.e(t10, tArr[length2])) {
                        return length2;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length2 = i11;
                }
            }
        }
        return -1;
    }

    public static int J0(short[] sArr, short s10) {
        Intrinsics.j(sArr, "<this>");
        int length = sArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (s10 == sArr[length]) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    public static final int K0(boolean[] zArr, boolean z10) {
        Intrinsics.j(zArr, "<this>");
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (z10 == zArr[length]) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }

    public static <T> T L0(T[] tArr) {
        Intrinsics.j(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    @SinceKotlin
    public static Float M0(float[] fArr) {
        Intrinsics.j(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fMax = fArr[0];
        int iJ0 = j0(fArr);
        int i10 = 1;
        if (1 <= iJ0) {
            while (true) {
                fMax = Math.max(fMax, fArr[i10]);
                if (i10 == iJ0) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fMax);
    }

    @SinceKotlin
    public static Integer N0(int[] iArr) {
        Intrinsics.j(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int iK0 = k0(iArr);
        int i11 = 1;
        if (1 <= iK0) {
            while (true) {
                int i12 = iArr[i11];
                if (i10 < i12) {
                    i10 = i12;
                }
                if (i11 == iK0) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    @SinceKotlin
    public static Float O0(float[] fArr) {
        Intrinsics.j(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fMin = fArr[0];
        int iJ0 = j0(fArr);
        int i10 = 1;
        if (1 <= iJ0) {
            while (true) {
                fMin = Math.min(fMin, fArr[i10]);
                if (i10 == iJ0) {
                    break;
                }
                i10++;
            }
        }
        return Float.valueOf(fMin);
    }

    @SinceKotlin
    public static Integer P0(int[] iArr) {
        Intrinsics.j(iArr, "<this>");
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int iK0 = k0(iArr);
        int i11 = 1;
        if (1 <= iK0) {
            while (true) {
                int i12 = iArr[i11];
                if (i10 > i12) {
                    i10 = i12;
                }
                if (i11 == iK0) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    public static char Q0(char[] cArr) {
        Intrinsics.j(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static <T> Iterable<T> R(T[] tArr) {
        Intrinsics.j(tArr, "<this>");
        return tArr.length == 0 ? i.m() : new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$1(tArr);
    }

    public static <T> T R0(T[] tArr) {
        Intrinsics.j(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return tArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Sequence<Integer> S(final int[] iArr) {
        Intrinsics.j(iArr, "<this>");
        return iArr.length == 0 ? SequencesKt.j() : new Sequence<Integer>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$4
            @Override // kotlin.sequences.Sequence
            public Iterator<Integer> iterator() {
                return ArrayIteratorsKt.f(iArr);
            }
        };
    }

    public static <T> T S0(T[] tArr) {
        Intrinsics.j(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static <T> Sequence<T> T(final T[] tArr) {
        Intrinsics.j(tArr, "<this>");
        return tArr.length == 0 ? SequencesKt.j() : new Sequence<T>() { // from class: kotlin.collections.ArraysKt___ArraysKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                return ArrayIteratorKt.a(tArr);
            }
        };
    }

    public static byte[] T0(byte[] bArr, IntRange indices) {
        Intrinsics.j(bArr, "<this>");
        Intrinsics.j(indices, "indices");
        return indices.isEmpty() ? new byte[0] : ArraysKt___ArraysJvmKt.u(bArr, indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1);
    }

    public static boolean U(byte[] bArr, byte b10) {
        Intrinsics.j(bArr, "<this>");
        return p0(bArr, b10) >= 0;
    }

    public static <T extends Comparable<? super T>> T[] U0(T[] tArr) {
        Intrinsics.j(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length);
        Intrinsics.i(objArrCopyOf, "copyOf(...)");
        T[] tArr2 = (T[]) ((Comparable[]) objArrCopyOf);
        ArraysKt___ArraysJvmKt.N(tArr2);
        return tArr2;
    }

    public static boolean V(char[] cArr, char c10) {
        Intrinsics.j(cArr, "<this>");
        return q0(cArr, c10) >= 0;
    }

    public static final <T> T[] V0(T[] tArr, Comparator<? super T> comparator) {
        Intrinsics.j(tArr, "<this>");
        Intrinsics.j(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        Intrinsics.i(tArr2, "copyOf(...)");
        ArraysKt___ArraysJvmKt.O(tArr2, comparator);
        return tArr2;
    }

    public static boolean W(int[] iArr, int i10) {
        Intrinsics.j(iArr, "<this>");
        return r0(iArr, i10) >= 0;
    }

    public static <T> List<T> W0(T[] tArr, Comparator<? super T> comparator) {
        Intrinsics.j(tArr, "<this>");
        Intrinsics.j(comparator, "comparator");
        return ArraysKt___ArraysJvmKt.g(V0(tArr, comparator));
    }

    public static boolean X(long[] jArr, long j10) {
        Intrinsics.j(jArr, "<this>");
        return s0(jArr, j10) >= 0;
    }

    public static int X0(int[] iArr) {
        Intrinsics.j(iArr, "<this>");
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        return i10;
    }

    public static <T> boolean Y(T[] tArr, T t10) {
        Intrinsics.j(tArr, "<this>");
        return t0(tArr, t10) >= 0;
    }

    public static <T> List<T> Y0(T[] tArr, int i10) {
        Intrinsics.j(tArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return i.m();
        }
        if (i10 >= tArr.length) {
            return h1(tArr);
        }
        if (i10 == 1) {
            return h.e(tArr[0]);
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (T t10 : tArr) {
            arrayList.add(t10);
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean Z(short[] sArr, short s10) {
        Intrinsics.j(sArr, "<this>");
        return u0(sArr, s10) >= 0;
    }

    public static final <T> List<T> Z0(T[] tArr, int i10) {
        Intrinsics.j(tArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return i.m();
        }
        int length = tArr.length;
        if (i10 >= length) {
            return h1(tArr);
        }
        if (i10 == 1) {
            return h.e(tArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(tArr[i11]);
        }
        return arrayList;
    }

    public static final boolean a0(boolean[] zArr, boolean z10) {
        Intrinsics.j(zArr, "<this>");
        return v0(zArr, z10) >= 0;
    }

    public static final <T, C extends Collection<? super T>> C a1(T[] tArr, C destination) {
        Intrinsics.j(tArr, "<this>");
        Intrinsics.j(destination, "destination");
        for (T t10 : tArr) {
            destination.add(t10);
        }
        return destination;
    }

    public static <T> List<T> b0(T[] tArr, int i10) {
        Intrinsics.j(tArr, "<this>");
        if (i10 >= 0) {
            return Z0(tArr, RangesKt.f(tArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static List<Byte> b1(byte[] bArr) {
        Intrinsics.j(bArr, "<this>");
        int length = bArr.length;
        return length != 0 ? length != 1 ? k1(bArr) : h.e(Byte.valueOf(bArr[0])) : i.m();
    }

    public static <T> List<T> c0(T[] tArr) {
        Intrinsics.j(tArr, "<this>");
        return (List) d0(tArr, new ArrayList());
    }

    public static List<Character> c1(char[] cArr) {
        Intrinsics.j(cArr, "<this>");
        int length = cArr.length;
        return length != 0 ? length != 1 ? l1(cArr) : h.e(Character.valueOf(cArr[0])) : i.m();
    }

    public static final <C extends Collection<? super T>, T> C d0(T[] tArr, C destination) {
        Intrinsics.j(tArr, "<this>");
        Intrinsics.j(destination, "destination");
        for (T t10 : tArr) {
            if (t10 != null) {
                destination.add(t10);
            }
        }
        return destination;
    }

    public static List<Double> d1(double[] dArr) {
        Intrinsics.j(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? m1(dArr) : h.e(Double.valueOf(dArr[0])) : i.m();
    }

    public static int e0(int[] iArr) {
        Intrinsics.j(iArr, "<this>");
        if (iArr.length != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static List<Float> e1(float[] fArr) {
        Intrinsics.j(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? n1(fArr) : h.e(Float.valueOf(fArr[0])) : i.m();
    }

    public static <T> T f0(T[] tArr) {
        Intrinsics.j(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static List<Integer> f1(int[] iArr) {
        Intrinsics.j(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? o1(iArr) : h.e(Integer.valueOf(iArr[0])) : i.m();
    }

    public static <T> T g0(T[] tArr) {
        Intrinsics.j(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static List<Long> g1(long[] jArr) {
        Intrinsics.j(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? p1(jArr) : h.e(Long.valueOf(jArr[0])) : i.m();
    }

    public static IntRange h0(int[] iArr) {
        Intrinsics.j(iArr, "<this>");
        return new IntRange(0, k0(iArr));
    }

    public static <T> List<T> h1(T[] tArr) {
        Intrinsics.j(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? q1(tArr) : h.e(tArr[0]) : i.m();
    }

    public static <T> IntRange i0(T[] tArr) {
        Intrinsics.j(tArr, "<this>");
        return new IntRange(0, m0(tArr));
    }

    public static List<Short> i1(short[] sArr) {
        Intrinsics.j(sArr, "<this>");
        int length = sArr.length;
        return length != 0 ? length != 1 ? r1(sArr) : h.e(Short.valueOf(sArr[0])) : i.m();
    }

    public static int j0(float[] fArr) {
        Intrinsics.j(fArr, "<this>");
        return fArr.length - 1;
    }

    public static List<Boolean> j1(boolean[] zArr) {
        Intrinsics.j(zArr, "<this>");
        int length = zArr.length;
        return length != 0 ? length != 1 ? s1(zArr) : h.e(Boolean.valueOf(zArr[0])) : i.m();
    }

    public static int k0(int[] iArr) {
        Intrinsics.j(iArr, "<this>");
        return iArr.length - 1;
    }

    public static final List<Byte> k1(byte[] bArr) {
        Intrinsics.j(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b10 : bArr) {
            arrayList.add(Byte.valueOf(b10));
        }
        return arrayList;
    }

    public static int l0(long[] jArr) {
        Intrinsics.j(jArr, "<this>");
        return jArr.length - 1;
    }

    public static final List<Character> l1(char[] cArr) {
        Intrinsics.j(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c10 : cArr) {
            arrayList.add(Character.valueOf(c10));
        }
        return arrayList;
    }

    public static <T> int m0(T[] tArr) {
        Intrinsics.j(tArr, "<this>");
        return tArr.length - 1;
    }

    public static final List<Double> m1(double[] dArr) {
        Intrinsics.j(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d10 : dArr) {
            arrayList.add(Double.valueOf(d10));
        }
        return arrayList;
    }

    public static Integer n0(int[] iArr, int i10) {
        Intrinsics.j(iArr, "<this>");
        if (i10 < 0 || i10 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i10]);
    }

    public static final List<Float> n1(float[] fArr) {
        Intrinsics.j(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    public static <T> T o0(T[] tArr, int i10) {
        Intrinsics.j(tArr, "<this>");
        if (i10 < 0 || i10 >= tArr.length) {
            return null;
        }
        return tArr[i10];
    }

    public static List<Integer> o1(int[] iArr) {
        Intrinsics.j(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    public static int p0(byte[] bArr, byte b10) {
        Intrinsics.j(bArr, "<this>");
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (b10 == bArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final List<Long> p1(long[] jArr) {
        Intrinsics.j(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static final int q0(char[] cArr, char c10) {
        Intrinsics.j(cArr, "<this>");
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (c10 == cArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static <T> List<T> q1(T[] tArr) {
        Intrinsics.j(tArr, "<this>");
        return new ArrayList(i.h(tArr));
    }

    public static int r0(int[] iArr, int i10) {
        Intrinsics.j(iArr, "<this>");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public static final List<Short> r1(short[] sArr) {
        Intrinsics.j(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s10 : sArr) {
            arrayList.add(Short.valueOf(s10));
        }
        return arrayList;
    }

    public static int s0(long[] jArr, long j10) {
        Intrinsics.j(jArr, "<this>");
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (j10 == jArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final List<Boolean> s1(boolean[] zArr) {
        Intrinsics.j(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z10 : zArr) {
            arrayList.add(Boolean.valueOf(z10));
        }
        return arrayList;
    }

    public static <T> int t0(T[] tArr, T t10) {
        Intrinsics.j(tArr, "<this>");
        int i10 = 0;
        if (t10 == null) {
            int length = tArr.length;
            while (i10 < length) {
                if (tArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i10 < length2) {
            if (Intrinsics.e(t10, tArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static <T> Set<T> t1(T[] tArr) {
        Intrinsics.j(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? (Set) a1(tArr, new LinkedHashSet(y.f(tArr.length))) : C.d(tArr[0]) : D.e();
    }

    public static int u0(short[] sArr, short s10) {
        Intrinsics.j(sArr, "<this>");
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (s10 == sArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static <T> Iterable<IndexedValue<T>> u1(final T[] tArr) {
        Intrinsics.j(tArr, "<this>");
        return new IndexingIterable(new Function0() { // from class: kotlin.collections.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ArraysKt___ArraysKt.v1(tArr);
            }
        });
    }

    public static final int v0(boolean[] zArr, boolean z10) {
        Intrinsics.j(zArr, "<this>");
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (z10 == zArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static final <A extends Appendable> A w0(byte[] bArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1<? super Byte, ? extends CharSequence> function1) throws IOException {
        Intrinsics.j(bArr, "<this>");
        Intrinsics.j(buffer, "buffer");
        Intrinsics.j(separator, "separator");
        Intrinsics.j(prefix, "prefix");
        Intrinsics.j(postfix, "postfix");
        Intrinsics.j(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (byte b10 : bArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Byte.valueOf(b10)));
            } else {
                buffer.append(String.valueOf((int) b10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static <T, R> List<Pair<T, R>> w1(T[] tArr, Iterable<? extends R> other) {
        Intrinsics.j(tArr, "<this>");
        Intrinsics.j(other, "other");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(j.x(other, 10), length));
        int i10 = 0;
        for (R r10 : other) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(TuplesKt.a(tArr[i10], r10));
            i10++;
        }
        return arrayList;
    }

    public static final <T, A extends Appendable> A x0(T[] tArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) throws IOException {
        Intrinsics.j(tArr, "<this>");
        Intrinsics.j(buffer, "buffer");
        Intrinsics.j(separator, "separator");
        Intrinsics.j(prefix, "prefix");
        Intrinsics.j(postfix, "postfix");
        Intrinsics.j(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (T t10 : tArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            StringsKt.a(buffer, t10, function1);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static <T, R> List<Pair<T, R>> x1(T[] tArr, R[] other) {
        Intrinsics.j(tArr, "<this>");
        Intrinsics.j(other, "other");
        int iMin = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(TuplesKt.a(tArr[i10], other[i10]));
        }
        return arrayList;
    }

    public static final String z0(byte[] bArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1<? super Byte, ? extends CharSequence> function1) {
        Intrinsics.j(bArr, "<this>");
        Intrinsics.j(separator, "separator");
        Intrinsics.j(prefix, "prefix");
        Intrinsics.j(postfix, "postfix");
        Intrinsics.j(truncated, "truncated");
        return ((StringBuilder) w0(bArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator v1(Object[] objArr) {
        return ArrayIteratorKt.a(objArr);
    }
}
