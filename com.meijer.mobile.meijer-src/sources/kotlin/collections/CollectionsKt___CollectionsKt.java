package kotlin.collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0016\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\u00020\u0004\"\t\b\u0000\u0010\u0001¢\u0006\u0002\b\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001aF\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u000b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0014\u0010\u0010\u001a\u001f\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0015\u0010\u0013\u001a'\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a*\u0010\u0018\u001a\u00020\u0007\"\t\b\u0000\u0010\u0001¢\u0006\u0002\b\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u001a\u0010\u0010\u001a\u001d\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u001b\u0010\u0013\u001a\u001f\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u001c\u0010\u0010\u001a\u001f\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u001d\u0010\u0013\u001a\u001d\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u001e\u0010\u0010\u001a\u001d\u0010\u001f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u001f\u0010\u0013\u001a\u001f\u0010 \u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b \u0010\u0010\u001a\u001f\u0010!\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b!\u0010\u0013\u001a+\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$\u001a+\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&\u001a=\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a)\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\b\b\u0000\u0010\u0001*\u00020**\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002¢\u0006\u0004\b+\u0010,\u001a=\u00100\u001a\u00028\u0000\"\u0010\b\u0000\u0010.*\n\u0012\u0006\b\u0000\u0012\u00028\u00010-\"\b\b\u0001\u0010\u0001*\u00020**\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00022\u0006\u0010/\u001a\u00028\u0000¢\u0006\u0004\b0\u00101\u001a+\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105\u001a+\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b6\u0010$\u001a+\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b7\u0010&\u001a#\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b8\u0010,\u001a-\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u000009*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b:\u0010,\u001a?\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001a\u0010=\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000;j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`<¢\u0006\u0004\b>\u0010?\u001a\u0017\u0010B\u001a\u00020A*\b\u0012\u0004\u0012\u00020\u00040@¢\u0006\u0004\bB\u0010C\u001a\u0017\u0010F\u001a\u00020E*\b\u0012\u0004\u0012\u00020D0@¢\u0006\u0004\bF\u0010G\u001a\u0017\u0010J\u001a\u00020I*\b\u0012\u0004\u0012\u00020H0@¢\u0006\u0004\bJ\u0010K\u001a\u0017\u0010M\u001a\u00020L*\b\u0012\u0004\u0012\u00020\u00070@¢\u0006\u0004\bM\u0010N\u001a\u0017\u0010Q\u001a\u00020P*\b\u0012\u0004\u0012\u00020O0@¢\u0006\u0004\bQ\u0010R\u001a7\u0010S\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0001\"\u0010\b\u0001\u0010.*\n\u0012\u0006\b\u0000\u0012\u00028\u00000-*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010/\u001a\u00028\u0001¢\u0006\u0004\bS\u00101\u001a-\u0010V\u001a\u0012\u0012\u0004\u0012\u00028\u00000Tj\b\u0012\u0004\u0012\u00028\u0000`U\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\bV\u0010W\u001a#\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\bX\u0010,\u001a#\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000Y\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\bZ\u0010,\u001a#\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000Y\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000@¢\u0006\u0004\b[\u0010\\\u001a#\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000]\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b^\u0010_\u001aC\u0010b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010`*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\bb\u0010)\u001a)\u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000c0\u0002\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\bd\u0010e\u001a#\u0010f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\bf\u0010,\u001a4\u0010h\u001a\b\u0012\u0004\u0012\u00028\u00000]\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0004¢\u0006\u0004\bh\u0010i\u001a4\u0010j\u001a\b\u0012\u0004\u0012\u00028\u00000]\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0004¢\u0006\u0004\bj\u0010i\u001a#\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000k\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\bl\u0010_\u001a4\u0010m\u001a\b\u0012\u0004\u0012\u00028\u00000]\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0004¢\u0006\u0004\bm\u0010i\u001a7\u0010n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\bn\u0010o\u001a\u001d\u0010p\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\bp\u0010q\u001a\u001b\u0010r\u001a\u0004\u0018\u00010H*\b\u0012\u0004\u0012\u00020H0\u0002H\u0007¢\u0006\u0004\br\u0010s\u001a+\u0010t\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u000009*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\bt\u0010u\u001a\u001b\u0010v\u001a\u0004\u0018\u00010H*\b\u0012\u0004\u0012\u00020H0\u0002H\u0007¢\u0006\u0004\bv\u0010s\u001a+\u0010w\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u000009*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\bw\u0010u\u001a3\u0010y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010x\u001a\u00020\u0007H\u0007¢\u0006\u0004\by\u0010$\u001a.\u0010z\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bz\u0010{\u001a4\u0010}\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010|\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\b}\u0010~\u001a.\u0010\u007f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u007f\u0010{\u001a1\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000@2\u0006\u0010\u0003\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a:\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000@2\u000f\u0010|\u001a\u000b\u0012\u0006\b\u0001\u0012\u00028\u00000\u0082\u0001H\u0086\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a6\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010|\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0005\b\u0085\u0001\u0010~\u001a7\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000@2\f\u0010|\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001\u001aL\u0010\u008a\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010x\u001a\u00020\u00072\t\b\u0002\u0010\u0088\u0001\u001a\u00020\u00072\t\b\u0002\u0010\u0089\u0001\u001a\u00020\u0004H\u0007¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001\u001aI\u0010\u008d\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u008c\u00010\u0011\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010`*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\u0004¢\u0006\u0005\b\u008d\u0001\u0010~\u001a\u008e\u0001\u0010\u0098\u0001\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0001\"\u000f\b\u0001\u0010\u0090\u0001*\b0\u008e\u0001j\u0003`\u008f\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0007\u0010\u0091\u0001\u001a\u00028\u00012\n\b\u0002\u0010\u0093\u0001\u001a\u00030\u0092\u00012\n\b\u0002\u0010\u0094\u0001\u001a\u00030\u0092\u00012\n\b\u0002\u0010\u0095\u0001\u001a\u00030\u0092\u00012\t\b\u0002\u0010\u0096\u0001\u001a\u00020\u00072\n\b\u0002\u0010\u0097\u0001\u001a\u00030\u0092\u00012\u0017\b\u0002\u0010a\u001a\u0011\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u00030\u0092\u0001\u0018\u00010\u000b¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001\u001au\u0010\u009b\u0001\u001a\u00030\u009a\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0093\u0001\u001a\u00030\u0092\u00012\n\b\u0002\u0010\u0094\u0001\u001a\u00030\u0092\u00012\n\b\u0002\u0010\u0095\u0001\u001a\u00030\u0092\u00012\t\b\u0002\u0010\u0096\u0001\u001a\u00020\u00072\n\b\u0002\u0010\u0097\u0001\u001a\u00030\u0092\u00012\u0017\b\u0002\u0010a\u001a\u0011\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u00030\u0092\u0001\u0018\u00010\u000b¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a'\u0010\u009e\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u009d\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 \u0001"}, d2 = {"Lkotlin/internal/OnlyInputTypes;", "T", "", "element", "", "h0", "(Ljava/lang/Iterable;Ljava/lang/Object;)Z", "", "index", "l0", "(Ljava/lang/Iterable;I)Ljava/lang/Object;", "Lkotlin/Function1;", "defaultValue", "n0", "(Ljava/lang/Iterable;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "r0", "(Ljava/lang/Iterable;)Ljava/lang/Object;", "", "s0", "(Ljava/util/List;)Ljava/lang/Object;", "t0", "u0", "v0", "(Ljava/util/List;I)Ljava/lang/Object;", "w0", "(Ljava/lang/Iterable;Ljava/lang/Object;)I", "C0", "D0", "E0", "F0", "T0", "U0", "V0", "W0", "n", "j0", "(Ljava/lang/Iterable;I)Ljava/util/List;", "k0", "(Ljava/util/List;I)Ljava/util/List;", "predicate", "o0", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "p0", "(Ljava/lang/Iterable;)Ljava/util/List;", "", "C", "destination", "q0", "(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/Collection;", "Lkotlin/ranges/IntRange;", "indices", "X0", "(Ljava/util/List;Lkotlin/ranges/IntRange;)Ljava/util/List;", "b1", "c1", "S0", "", "Y0", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "Z0", "(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;", "", "", "d1", "(Ljava/util/Collection;)[Z", "", "", "e1", "(Ljava/util/Collection;)[B", "", "", "g1", "(Ljava/util/Collection;)[F", "", "i1", "(Ljava/util/Collection;)[I", "", "", "k1", "(Ljava/util/Collection;)[J", "f1", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "h1", "(Ljava/lang/Iterable;)Ljava/util/HashSet;", "j1", "", "l1", "m1", "(Ljava/util/Collection;)Ljava/util/List;", "", "o1", "(Ljava/lang/Iterable;)Ljava/util/Set;", "R", "transform", "G0", "Lkotlin/collections/IndexedValue;", "s1", "(Ljava/lang/Iterable;)Ljava/lang/Iterable;", "i0", "other", "x0", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/Set;", "a1", "", "n1", "p1", "d0", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Z", "e0", "(Ljava/lang/Iterable;)Z", "I0", "(Ljava/lang/Iterable;)Ljava/lang/Float;", "H0", "(Ljava/lang/Iterable;)Ljava/lang/Comparable;", "K0", "J0", "size", "g0", "M0", "(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;", "elements", "L0", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;", "O0", "Q0", "(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;", "", "R0", "(Ljava/util/Collection;[Ljava/lang/Object;)Ljava/util/List;", "N0", "P0", "(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;", "step", "partialWindows", "q1", "(Ljava/lang/Iterable;IIZ)Ljava/util/List;", "Lkotlin/Pair;", "u1", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "y0", "(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "", "A0", "(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "Lkotlin/sequences/Sequence;", "f0", "(Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
@SourceDebugExtension
/* loaded from: classes6.dex */
public class CollectionsKt___CollectionsKt extends p {
    public static final <T> String A0(Iterable<? extends T> iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.j(iterable, "<this>");
        Intrinsics.j(separator, "separator");
        Intrinsics.j(prefix, "prefix");
        Intrinsics.j(postfix, "postfix");
        Intrinsics.j(truncated, "truncated");
        return ((StringBuilder) y0(iterable, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
    }

    public static /* synthetic */ String B0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
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
        return A0(iterable, charSequence, charSequence2, charSequence3, i10, charSequence5, function12);
    }

    public static <T> T C0(Iterable<? extends T> iterable) {
        Intrinsics.j(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) D0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static <T> T D0(List<? extends T> list) {
        Intrinsics.j(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(i.o(list));
    }

    public static <T> T E0(Iterable<? extends T> iterable) {
        Intrinsics.j(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static <T> T F0(List<? extends T> list) {
        Intrinsics.j(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static <T, R> List<R> G0(Iterable<? extends T> iterable, Function1<? super T, ? extends R> transform) {
        Intrinsics.j(iterable, "<this>");
        Intrinsics.j(transform, "transform");
        ArrayList arrayList = new ArrayList(j.x(iterable, 10));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    @SinceKotlin
    public static <T extends Comparable<? super T>> T H0(Iterable<? extends T> iterable) {
        Intrinsics.j(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @SinceKotlin
    public static Float I0(Iterable<Float> iterable) {
        Intrinsics.j(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @SinceKotlin
    public static <T extends Comparable<? super T>> T J0(Iterable<? extends T> iterable) {
        Intrinsics.j(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @SinceKotlin
    public static Float K0(Iterable<Float> iterable) {
        Intrinsics.j(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static <T> List<T> L0(Iterable<? extends T> iterable, Iterable<? extends T> elements) {
        Intrinsics.j(iterable, "<this>");
        Intrinsics.j(elements, "elements");
        Collection collectionE = n.E(elements);
        if (collectionE.isEmpty()) {
            return j1(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            if (!collectionE.contains(t10)) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static <T> List<T> M0(Iterable<? extends T> iterable, T t10) {
        Intrinsics.j(iterable, "<this>");
        ArrayList arrayList = new ArrayList(j.x(iterable, 10));
        boolean z10 = false;
        for (T t11 : iterable) {
            boolean z11 = true;
            if (!z10 && Intrinsics.e(t11, t10)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    public static <T> List<T> N0(Iterable<? extends T> iterable, Iterable<? extends T> elements) {
        Intrinsics.j(iterable, "<this>");
        Intrinsics.j(elements, "elements");
        if (iterable instanceof Collection) {
            return P0((Collection) iterable, elements);
        }
        ArrayList arrayList = new ArrayList();
        n.C(arrayList, iterable);
        n.C(arrayList, elements);
        return arrayList;
    }

    public static <T> List<T> O0(Iterable<? extends T> iterable, T t10) {
        Intrinsics.j(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Q0((Collection) iterable, t10);
        }
        ArrayList arrayList = new ArrayList();
        n.C(arrayList, iterable);
        arrayList.add(t10);
        return arrayList;
    }

    public static <T> List<T> P0(Collection<? extends T> collection, Iterable<? extends T> elements) {
        Intrinsics.j(collection, "<this>");
        Intrinsics.j(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            n.C(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static <T> List<T> Q0(Collection<? extends T> collection, T t10) {
        Intrinsics.j(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t10);
        return arrayList;
    }

    public static <T> List<T> R0(Collection<? extends T> collection, T[] elements) {
        Intrinsics.j(collection, "<this>");
        Intrinsics.j(elements, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + elements.length);
        arrayList.addAll(collection);
        n.D(arrayList, elements);
        return arrayList;
    }

    public static <T> List<T> S0(Iterable<? extends T> iterable) {
        Intrinsics.j(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return j1(iterable);
        }
        List<T> listL1 = l1(iterable);
        p.a0(listL1);
        return listL1;
    }

    public static <T> T T0(Iterable<? extends T> iterable) {
        Intrinsics.j(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) U0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static <T> T U0(List<? extends T> list) {
        Intrinsics.j(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static <T> T V0(Iterable<? extends T> iterable) {
        Intrinsics.j(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return (T) list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static <T> T W0(List<? extends T> list) {
        Intrinsics.j(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static <T> List<T> X0(List<? extends T> list, IntRange indices) {
        Intrinsics.j(list, "<this>");
        Intrinsics.j(indices, "indices");
        return indices.isEmpty() ? i.m() : j1(list.subList(indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static <T extends Comparable<? super T>> List<T> Y0(Iterable<? extends T> iterable) {
        Intrinsics.j(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List<T> listL1 = l1(iterable);
            m.A(listL1);
            return listL1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return j1(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        ArraysKt___ArraysJvmKt.N((Comparable[]) array);
        return ArraysKt___ArraysJvmKt.g(array);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> Z0(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        Intrinsics.j(iterable, "<this>");
        Intrinsics.j(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> listL1 = l1(iterable);
            m.B(listL1, comparator);
            return listL1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return j1(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        ArraysKt___ArraysJvmKt.O(array, comparator);
        return ArraysKt___ArraysJvmKt.g(array);
    }

    public static <T> Set<T> a1(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        Intrinsics.j(iterable, "<this>");
        Intrinsics.j(other, "other");
        Set<T> setN1 = n1(iterable);
        n.I(setN1, other);
        return setN1;
    }

    public static <T> List<T> b1(Iterable<? extends T> iterable, int i10) {
        Intrinsics.j(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return i.m();
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return j1(iterable);
            }
            if (i10 == 1) {
                return h.e(r0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator<? extends T> it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return i.t(arrayList);
    }

    public static <T> List<T> c1(List<? extends T> list, int i10) {
        Intrinsics.j(list, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return i.m();
        }
        int size = list.size();
        if (i10 >= size) {
            return j1(list);
        }
        if (i10 == 1) {
            return h.e(D0(list));
        }
        ArrayList arrayList = new ArrayList(i10);
        if (list instanceof RandomAccess) {
            for (int i11 = size - i10; i11 < size; i11++) {
                arrayList.add(list.get(i11));
            }
        } else {
            ListIterator<? extends T> listIterator = list.listIterator(size - i10);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static <T> boolean d0(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.j(iterable, "<this>");
        Intrinsics.j(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (!predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean[] d1(Collection<Boolean> collection) {
        Intrinsics.j(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator<Boolean> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            zArr[i10] = it.next().booleanValue();
            i10++;
        }
        return zArr;
    }

    public static <T> boolean e0(Iterable<? extends T> iterable) {
        Intrinsics.j(iterable, "<this>");
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    public static byte[] e1(Collection<Byte> collection) {
        Intrinsics.j(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator<Byte> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bArr[i10] = it.next().byteValue();
            i10++;
        }
        return bArr;
    }

    public static <T> Sequence<T> f0(final Iterable<? extends T> iterable) {
        Intrinsics.j(iterable, "<this>");
        return new Sequence<T>() { // from class: kotlin.collections.CollectionsKt___CollectionsKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                return iterable.iterator();
            }
        };
    }

    public static final <T, C extends Collection<? super T>> C f1(Iterable<? extends T> iterable, C destination) {
        Intrinsics.j(iterable, "<this>");
        Intrinsics.j(destination, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    @SinceKotlin
    public static <T> List<List<T>> g0(Iterable<? extends T> iterable, int i10) {
        Intrinsics.j(iterable, "<this>");
        return q1(iterable, i10, i10, true);
    }

    public static float[] g1(Collection<Float> collection) {
        Intrinsics.j(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator<Float> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr[i10] = it.next().floatValue();
            i10++;
        }
        return fArr;
    }

    public static <T> boolean h0(Iterable<? extends T> iterable, T t10) {
        Intrinsics.j(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t10) : w0(iterable, t10) >= 0;
    }

    public static <T> HashSet<T> h1(Iterable<? extends T> iterable) {
        Intrinsics.j(iterable, "<this>");
        return (HashSet) f1(iterable, new HashSet(y.f(j.x(iterable, 12))));
    }

    public static <T> List<T> i0(Iterable<? extends T> iterable) {
        Intrinsics.j(iterable, "<this>");
        return j1(n1(iterable));
    }

    public static int[] i1(Collection<Integer> collection) {
        Intrinsics.j(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        return iArr;
    }

    public static <T> List<T> j0(Iterable<? extends T> iterable, int i10) {
        ArrayList arrayList;
        Intrinsics.j(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return j1(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i10;
            if (size <= 0) {
                return i.m();
            }
            if (size == 1) {
                return h.e(C0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i10 < size2) {
                        arrayList.add(list.get(i10));
                        i10++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i10);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i11 = 0;
        for (T t10 : iterable) {
            if (i11 >= i10) {
                arrayList.add(t10);
            } else {
                i11++;
            }
        }
        return i.t(arrayList);
    }

    public static <T> List<T> j1(Iterable<? extends T> iterable) {
        Intrinsics.j(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return i.t(l1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return i.m();
        }
        if (size != 1) {
            return m1(collection);
        }
        return h.e(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static <T> List<T> k0(List<? extends T> list, int i10) {
        Intrinsics.j(list, "<this>");
        if (i10 >= 0) {
            return b1(list, RangesKt.f(list.size() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static long[] k1(Collection<Long> collection) {
        Intrinsics.j(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    public static <T> T l0(Iterable<? extends T> iterable, final int i10) {
        Intrinsics.j(iterable, "<this>");
        return iterable instanceof List ? (T) ((List) iterable).get(i10) : (T) n0(iterable, i10, new Function1() { // from class: kotlin.collections.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CollectionsKt___CollectionsKt.m0(i10, ((Integer) obj).intValue());
            }
        });
    }

    public static <T> List<T> l1(Iterable<? extends T> iterable) {
        Intrinsics.j(iterable, "<this>");
        return iterable instanceof Collection ? m1((Collection) iterable) : (List) f1(iterable, new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object m0(int i10, int i11) {
        throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + i10 + '.');
    }

    public static <T> List<T> m1(Collection<? extends T> collection) {
        Intrinsics.j(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final <T> T n0(Iterable<? extends T> iterable, int i10, Function1<? super Integer, ? extends T> defaultValue) {
        Intrinsics.j(iterable, "<this>");
        Intrinsics.j(defaultValue, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            return (i10 < 0 || i10 >= list.size()) ? defaultValue.invoke(Integer.valueOf(i10)) : (T) list.get(i10);
        }
        if (i10 < 0) {
            return defaultValue.invoke(Integer.valueOf(i10));
        }
        int i11 = 0;
        for (T t10 : iterable) {
            int i12 = i11 + 1;
            if (i10 == i11) {
                return t10;
            }
            i11 = i12;
        }
        return defaultValue.invoke(Integer.valueOf(i10));
    }

    public static <T> Set<T> n1(Iterable<? extends T> iterable) {
        Intrinsics.j(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) f1(iterable, new LinkedHashSet());
    }

    public static <T> List<T> o0(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        Intrinsics.j(iterable, "<this>");
        Intrinsics.j(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            if (predicate.invoke(t10).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static <T> Set<T> o1(Iterable<? extends T> iterable) {
        Intrinsics.j(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return D.h((Set) f1(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return D.e();
        }
        if (size != 1) {
            return (Set) f1(iterable, new LinkedHashSet(y.f(collection.size())));
        }
        return C.d(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static <T> List<T> p0(Iterable<? extends T> iterable) {
        Intrinsics.j(iterable, "<this>");
        return (List) q0(iterable, new ArrayList());
    }

    public static <T> Set<T> p1(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        Intrinsics.j(iterable, "<this>");
        Intrinsics.j(other, "other");
        Set<T> setN1 = n1(iterable);
        n.C(setN1, other);
        return setN1;
    }

    public static final <C extends Collection<? super T>, T> C q0(Iterable<? extends T> iterable, C destination) {
        Intrinsics.j(iterable, "<this>");
        Intrinsics.j(destination, "destination");
        for (T t10 : iterable) {
            if (t10 != null) {
                destination.add(t10);
            }
        }
        return destination;
    }

    @SinceKotlin
    public static final <T> List<List<T>> q1(Iterable<? extends T> iterable, int i10, int i11, boolean z10) {
        Intrinsics.j(iterable, "<this>");
        SlidingWindowKt.a(i10, i11);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itB = SlidingWindowKt.b(iterable.iterator(), i10, i11, z10, false);
            while (itB.hasNext()) {
                arrayList.add((List) itB.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i11) + (size % i11 == 0 ? 0 : 1));
        int i12 = 0;
        while (i12 >= 0 && i12 < size) {
            int iK = RangesKt.k(i10, size - i12);
            if (iK < i10 && !z10) {
                return arrayList2;
            }
            ArrayList arrayList3 = new ArrayList(iK);
            for (int i13 = 0; i13 < iK; i13++) {
                arrayList3.add(list.get(i13 + i12));
            }
            arrayList2.add(arrayList3);
            i12 += i11;
        }
        return arrayList2;
    }

    public static <T> T r0(Iterable<? extends T> iterable) {
        Intrinsics.j(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) s0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static /* synthetic */ List r1(Iterable iterable, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return q1(iterable, i10, i11, z10);
    }

    public static <T> T s0(List<? extends T> list) {
        Intrinsics.j(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static <T> Iterable<IndexedValue<T>> s1(final Iterable<? extends T> iterable) {
        Intrinsics.j(iterable, "<this>");
        return new IndexingIterable(new Function0() { // from class: kotlin.collections.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CollectionsKt___CollectionsKt.t1(iterable);
            }
        });
    }

    public static <T> T t0(Iterable<? extends T> iterable) {
        Intrinsics.j(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static <T> T u0(List<? extends T> list) {
        Intrinsics.j(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static <T, R> List<Pair<T, R>> u1(Iterable<? extends T> iterable, Iterable<? extends R> other) {
        Intrinsics.j(iterable, "<this>");
        Intrinsics.j(other, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(j.x(iterable, 10), j.x(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(TuplesKt.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static <T> T v0(List<? extends T> list, int i10) {
        Intrinsics.j(list, "<this>");
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    public static <T> int w0(Iterable<? extends T> iterable, T t10) {
        Intrinsics.j(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t10);
        }
        int i10 = 0;
        for (T t11 : iterable) {
            if (i10 < 0) {
                i.w();
            }
            if (Intrinsics.e(t10, t11)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static <T> Set<T> x0(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        Intrinsics.j(iterable, "<this>");
        Intrinsics.j(other, "other");
        Set<T> setN1 = n1(iterable);
        n.P(setN1, other);
        return setN1;
    }

    public static final <T, A extends Appendable> A y0(Iterable<? extends T> iterable, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) throws IOException {
        Intrinsics.j(iterable, "<this>");
        Intrinsics.j(buffer, "buffer");
        Intrinsics.j(separator, "separator");
        Intrinsics.j(prefix, "prefix");
        Intrinsics.j(postfix, "postfix");
        Intrinsics.j(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (T t10 : iterable) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator t1(Iterable iterable) {
        return iterable.iterator();
    }
}
