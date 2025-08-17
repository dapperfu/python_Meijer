package F0;

import E0.e;
import androidx.compose.runtime.C5757z0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010*\n\u0002\b\u0012\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u001f\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b \u0010!JA\u0010&\u001a\u00020%2\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b&\u0010'JA\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010)\u001a\u00020\nH\u0002¢\u0006\u0004\b*\u0010+J?\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010,\u001a\u00020\n2\u000e\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070-H\u0002¢\u0006\u0004\b/\u00100JG\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00101\u001a\u00020\n2\u0014\u00102\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u0006H\u0002¢\u0006\u0004\b3\u00104JO\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00101\u001a\u00020\n2\u0006\u0010)\u001a\u00020\n2\u0014\u00105\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060-H\u0002¢\u0006\u0004\b6\u00107J1\u00109\u001a\u00020%2\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00108\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000H\u0002¢\u0006\u0004\b9\u0010:JI\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010)\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J]\u0010D\u001a\u00020%2\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?2\u0006\u00108\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n2\u0016\u00102\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010B\u001a\u00020\n2\u000e\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bD\u0010EJW\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010F\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n2\u0016\u00102\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010B\u001a\u00020\n2\u000e\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bG\u0010HJm\u0010K\u001a\u00020%2\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?2\u0006\u00108\u001a\u00020\n2\u000e\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010J\u001a\u00020\n2\u0016\u00102\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010B\u001a\u00020\n2\u000e\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bK\u0010LJ\u001f\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u00108\u001a\u00020\nH\u0002¢\u0006\u0004\bM\u0010NJ;\u0010O\u001a\u0004\u0018\u00010\u00072\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00101\u001a\u00020\n2\u0006\u0010)\u001a\u00020\n2\u0006\u00108\u001a\u00020\nH\u0002¢\u0006\u0004\bO\u0010PJ?\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010)\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\u0006\u0010Q\u001a\u00020;H\u0002¢\u0006\u0004\bR\u0010SJ1\u0010T\u001a\u00020%2\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00101\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nH\u0002¢\u0006\u0004\bT\u0010UJA\u0010\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010)\u001a\u00020\n2\u0006\u00101\u001a\u00020\n2\u0006\u0010Q\u001a\u00020;H\u0002¢\u0006\u0004\b\u0001\u0010SJ#\u0010X\u001a\u00020\u00152\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150VH\u0002¢\u0006\u0004\bX\u0010YJ1\u0010Z\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\bZ\u0010\u001cJ7\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u00108\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nH\u0002¢\u0006\u0004\b[\u0010\\J3\u0010_\u001a\u00020\n2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150V2\u0006\u0010]\u001a\u00020\n2\u0006\u0010^\u001a\u00020;H\u0002¢\u0006\u0004\b_\u0010`JC\u0010b\u001a\u00020\n2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150V2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010a\u001a\u00020\n2\u0006\u0010^\u001a\u00020;H\u0002¢\u0006\u0004\bb\u0010cJw\u0010g\u001a\u00020\n2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150V2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010a\u001a\u00020\n2\u0006\u0010d\u001a\u00020\n2\u0006\u0010^\u001a\u00020;2\u0014\u0010f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060e2\u0014\u00102\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060eH\u0002¢\u0006\u0004\bg\u0010hJG\u0010k\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010)\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\u0006\u0010i\u001a\u00028\u00002\u0006\u0010j\u001a\u00020;H\u0002¢\u0006\u0004\bk\u0010>J%\u0010m\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060l2\u0006\u00108\u001a\u00020\nH\u0002¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020\nH\u0000¢\u0006\u0004\bo\u0010\u000fJ\u0015\u0010p\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\bp\u0010qJ\u0017\u0010r\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00028\u0000H\u0016¢\u0006\u0004\br\u0010sJ\u001d\u0010t\u001a\u00020\u00152\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?H\u0016¢\u0006\u0004\bt\u0010uJ\u001f\u0010r\u001a\u00020%2\u0006\u00108\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000H\u0016¢\u0006\u0004\br\u0010vJ%\u0010t\u001a\u00020\u00152\u0006\u00108\u001a\u00020\n2\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?H\u0016¢\u0006\u0004\bt\u0010wJ\u0018\u0010x\u001a\u00028\u00002\u0006\u00108\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\bx\u0010yJ\u0017\u0010z\u001a\u00028\u00002\u0006\u00108\u001a\u00020\nH\u0016¢\u0006\u0004\bz\u0010yJ\u001d\u0010{\u001a\u00020\u00152\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?H\u0016¢\u0006\u0004\b{\u0010uJ!\u0010|\u001a\u00020\u00152\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150V¢\u0006\u0004\b|\u0010YJ \u0010}\u001a\u00028\u00002\u0006\u00108\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b}\u0010~J\u0019\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u007fH\u0096\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0019\u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0082\u0001H\u0016¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J \u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0082\u00012\u0006\u00108\u001a\u00020\nH\u0016¢\u0006\u0005\b\u0083\u0001\u0010nR\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\"\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R \u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0088\u0001R&\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u008a\u0001\u0010&\u001a\u0005\b\u008b\u0001\u0010\u000f\"\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0019\u0010\u0090\u0001\u001a\u00030\u008e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bi\u0010\u008f\u0001R;\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0011\u0010\u0091\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\bz\u0010\u0088\u0001\u001a\u0005\b\u0092\u0001\u0010!R8\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000f\u0010\u0091\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\b\u0093\u0001\u0010\u0088\u0001\u001a\u0005\b\u0094\u0001\u0010!R&\u0010\u0010\u001a\u00020\n2\u0007\u0010\u0091\u0001\u001a\u00020\n8\u0016@RX\u0096\u000e¢\u0006\r\n\u0004\bM\u0010&\u001a\u0005\b\u0085\u0001\u0010\u000f¨\u0006\u0095\u0001"}, d2 = {"LF0/f;", "E", "Lkotlin/collections/AbstractMutableList;", "LE0/e$a;", "LE0/e;", "vector", "", "", "vectorRoot", "vectorTail", "", "rootShift", "<init>", "(LE0/e;[Ljava/lang/Object;[Ljava/lang/Object;I)V", "U", "()I", "size", "Z", "(I)I", "Y", "buffer", "", "v", "([Ljava/lang/Object;)Z", "y", "([Ljava/lang/Object;)[Ljava/lang/Object;", "distance", "z", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "element", "C", "(Ljava/lang/Object;)[Ljava/lang/Object;", "B", "()[Ljava/lang/Object;", "root", "filledTail", "newTail", "", "I", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V", "tail", "shift", "K", "([Ljava/lang/Object;[Ljava/lang/Object;I)[Ljava/lang/Object;", "bufferIndex", "", "sourceIterator", "k", "([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;", "rootSize", "buffers", "H", "([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;", "buffersIterator", "G", "([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;", "index", "t", "([Ljava/lang/Object;ILjava/lang/Object;)V", "LF0/d;", "elementCarry", "s", "([Ljava/lang/Object;IILjava/lang/Object;LF0/d;)[Ljava/lang/Object;", "", "elements", "rightShift", "nullBuffers", "nextBuffer", "r", "(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "startLeafIndex", "W", "(II[[Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "startBuffer", "startBufferSize", "X", "(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "h", "(I)[Ljava/lang/Object;", "S", "([Ljava/lang/Object;III)Ljava/lang/Object;", "tailCarry", "R", "([Ljava/lang/Object;IILF0/d;)[Ljava/lang/Object;", "F", "([Ljava/lang/Object;II)V", "Lkotlin/Function1;", "predicate", "N", "(Lkotlin/jvm/functions/Function1;)Z", "T", "D", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "tailSize", "bufferRef", "P", "(Lkotlin/jvm/functions/Function1;ILF0/d;)I", "bufferSize", "M", "(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;ILF0/d;)I", "toBufferSize", "", "recyclableBuffers", "L", "(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;IILF0/d;Ljava/util/List;Ljava/util/List;)I", "e", "oldElementCarry", "V", "", "x", "(I)Ljava/util/ListIterator;", "n", "build", "()LE0/e;", "add", "(Ljava/lang/Object;)Z", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/lang/Object;)V", "(ILjava/util/Collection;)Z", "get", "(I)Ljava/lang/Object;", "f", "removeAll", "Q", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "a", "LE0/e;", "b", "[Ljava/lang/Object;", "c", "d", "p", "setRootShift$runtime_release", "(I)V", "LI0/e;", "LI0/e;", "ownership", "<set-?>", "o", "g", "q", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class f<E> extends AbstractMutableList<E> implements e.a<E> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private E0.e<? extends E> vector;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Object[] vectorRoot;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Object[] vectorTail;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int rootShift;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private I0.e ownership = new I0.e();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Object[] root;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Object[] tail;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int size;

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<E, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Collection<E> f10093f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Collection<? extends E> collection) {
            super(1);
            this.f10093f = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(E e10) {
            return Boolean.valueOf(this.f10093f.contains(e10));
        }
    }

    private final Object[] D(Object[] root, int index, int shift) {
        if (!(shift >= 0)) {
            C5757z0.a("shift should be positive");
        }
        if (shift == 0) {
            return root;
        }
        int iA = l.a(index, shift);
        Object obj = root[iA];
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objD = D((Object[]) obj, index, shift - 5);
        if (iA < 31) {
            int i10 = iA + 1;
            if (root[i10] != null) {
                if (v(root)) {
                    ArraysKt.B(root, null, i10, 32);
                }
                root = ArraysKt.o(root, B(), 0, 0, i10);
            }
        }
        if (objD == root[iA]) {
            return root;
        }
        Object[] objArrY = y(root);
        objArrY[iA] = objD;
        return objArrY;
    }

    private final void F(Object[] root, int rootSize, int shift) {
        if (shift == 0) {
            this.root = null;
            if (root == null) {
                root = new Object[0];
            }
            this.tail = root;
            this.size = rootSize;
            this.rootShift = shift;
            return;
        }
        d dVar = new d(null);
        Intrinsics.g(root);
        Object[] objArrE = E(root, shift, rootSize, dVar);
        Intrinsics.g(objArrE);
        Object value = dVar.getValue();
        Intrinsics.h(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.tail = (Object[]) value;
        this.size = rootSize;
        if (objArrE[1] == null) {
            this.root = (Object[]) objArrE[0];
            this.rootShift = shift - 5;
        } else {
            this.root = objArrE;
            this.rootShift = shift;
        }
    }

    private final int M(Function1<? super E, Boolean> predicate, Object[] buffer, int bufferSize, d bufferRef) {
        Object[] objArrY = buffer;
        int i10 = bufferSize;
        boolean z10 = false;
        for (int i11 = 0; i11 < bufferSize; i11++) {
            Object obj = buffer[i11];
            if (predicate.invoke(obj).booleanValue()) {
                if (!z10) {
                    objArrY = y(buffer);
                    z10 = true;
                    i10 = i11;
                }
            } else if (z10) {
                objArrY[i10] = obj;
                i10++;
            }
        }
        bufferRef.b(objArrY);
        return i10;
    }

    private final void X(Collection<? extends E> elements, int index, Object[] startBuffer, int startBufferSize, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        Object[] objArrB;
        if (!(nullBuffers >= 1)) {
            C5757z0.a("requires at least one nullBuffer");
        }
        Object[] objArrY = y(startBuffer);
        buffers[0] = objArrY;
        int i10 = index & 31;
        int size = ((index + elements.size()) - 1) & 31;
        int i11 = (startBufferSize - i10) + size;
        if (i11 < 32) {
            ArraysKt.o(objArrY, nextBuffer, size + 1, i10, startBufferSize);
        } else {
            int i12 = i11 - 31;
            if (nullBuffers == 1) {
                objArrB = objArrY;
            } else {
                objArrB = B();
                nullBuffers--;
                buffers[nullBuffers] = objArrB;
            }
            int i13 = startBufferSize - i12;
            ArraysKt.o(objArrY, nextBuffer, 0, i13, startBufferSize);
            ArraysKt.o(objArrY, objArrB, size + 1, i10, i13);
            nextBuffer = objArrB;
        }
        Iterator<? extends E> it = elements.iterator();
        k(objArrY, i10, it);
        for (int i14 = 1; i14 < nullBuffers; i14++) {
            buffers[i14] = k(B(), 0, it);
        }
        k(nextBuffer, 0, it);
    }

    private final boolean v(Object[] buffer) {
        return buffer.length == 33 && buffer[32] == this.ownership;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        ((AbstractList) this).modCount++;
        int iY = Y();
        if (iY < 32) {
            Object[] objArrY = y(this.tail);
            objArrY[iY] = element;
            this.tail = objArrY;
            this.size = size() + 1;
        } else {
            I(this.root, this.tail, C(element));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iY = Y();
        Iterator<? extends E> it = elements.iterator();
        if (32 - iY >= elements.size()) {
            this.tail = k(y(this.tail), iY, it);
            this.size = size() + elements.size();
        } else {
            int size = ((elements.size() + iY) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = k(y(this.tail), iY, it);
            for (int i10 = 1; i10 < size; i10++) {
                objArr[i10] = k(B(), 0, it);
            }
            this.root = H(this.root, U(), objArr);
            this.tail = k(B(), 0, it);
            this.size = size() + elements.size();
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    private final Object[] B() {
        Object[] objArr = new Object[33];
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] C(Object element) {
        Object[] objArr = new Object[33];
        objArr[0] = element;
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] E(Object[] root, int shift, int rootSize, d tailCarry) {
        Object[] objArrE;
        int iA = l.a(rootSize - 1, shift);
        if (shift == 5) {
            tailCarry.b(root[iA]);
            objArrE = null;
        } else {
            Object obj = root[iA];
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrE = E((Object[]) obj, shift - 5, rootSize, tailCarry);
        }
        if (objArrE == null && iA == 0) {
            return null;
        }
        Object[] objArrY = y(root);
        objArrY[iA] = objArrE;
        return objArrY;
    }

    private final int P(Function1<? super E, Boolean> predicate, int tailSize, d bufferRef) {
        int iM = M(predicate, this.tail, tailSize, bufferRef);
        if (iM == tailSize) {
            I0.a.a(bufferRef.getValue() == this.tail);
            return tailSize;
        }
        Object value = bufferRef.getValue();
        Intrinsics.h(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        ArraysKt.B(objArr, null, iM, tailSize);
        this.tail = objArr;
        this.size = size() - (tailSize - iM);
        return iM;
    }

    private final Object[] T(Object[] root, int size) {
        if (!((size & 31) == 0)) {
            C5757z0.a("invalid size");
        }
        if (size == 0) {
            this.rootShift = 0;
            return null;
        }
        int i10 = size - 1;
        while (true) {
            int i11 = this.rootShift;
            if ((i10 >> i11) != 0) {
                return D(root, i10, i11);
            }
            this.rootShift = i11 - 5;
            Object[] objArr = root[0];
            Intrinsics.h(objArr, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            root = objArr;
        }
    }

    private final Object[] W(int startLeafIndex, int rightShift, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        if (this.root == null) {
            throw new IllegalStateException("root is null");
        }
        ListIterator<Object[]> listIteratorX = x(U() >> 5);
        while (listIteratorX.previousIndex() != startLeafIndex) {
            Object[] objArrPrevious = listIteratorX.previous();
            ArraysKt.o(objArrPrevious, nextBuffer, 0, 32 - rightShift, 32);
            nextBuffer = z(objArrPrevious, rightShift);
            nullBuffers--;
            buffers[nullBuffers] = nextBuffer;
        }
        return listIteratorX.previous();
    }

    private final int Z(int size) {
        return size <= 32 ? size : size - l.d(size);
    }

    private final Object[] k(Object[] buffer, int bufferIndex, Iterator<? extends Object> sourceIterator) {
        while (bufferIndex < 32 && sourceIterator.hasNext()) {
            buffer[bufferIndex] = sourceIterator.next();
            bufferIndex++;
        }
        return buffer;
    }

    private final void r(Collection<? extends E> elements, int index, int rightShift, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        Object[] objArr;
        if (this.root == null) {
            throw new IllegalStateException("root is null");
        }
        int i10 = index >> 5;
        Object[] objArrW = W(i10, rightShift, buffers, nullBuffers, nextBuffer);
        int iU = nullBuffers - (((U() >> 5) - 1) - i10);
        if (iU < nullBuffers) {
            Object[] objArr2 = buffers[iU];
            Intrinsics.g(objArr2);
            objArr = objArr2;
        } else {
            objArr = nextBuffer;
        }
        X(elements, index, objArrW, 32, buffers, iU, objArr);
    }

    private final ListIterator<Object[]> x(int index) {
        Object[] objArr = this.root;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iU = U() >> 5;
        I0.d.b(index, iU);
        int i10 = this.rootShift;
        return i10 == 0 ? new i(objArr, index) : new k(objArr, index, iU, i10 / 5);
    }

    private final Object[] y(Object[] buffer) {
        return buffer == null ? B() : v(buffer) ? buffer : ArraysKt.t(buffer, B(), 0, 0, RangesKt.k(buffer.length, 32), 6, null);
    }

    @Override // kotlin.collections.AbstractMutableList
    /* renamed from: a, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // E0.e.a
    public E0.e<E> build() {
        e eVar;
        if (this.root == this.vectorRoot && this.tail == this.vectorTail) {
            eVar = this.vector;
        } else {
            this.ownership = new I0.e();
            Object[] objArr = this.root;
            this.vectorRoot = objArr;
            Object[] objArr2 = this.tail;
            this.vectorTail = objArr2;
            if (objArr != null) {
                Object[] objArr3 = this.root;
                Intrinsics.g(objArr3);
                eVar = new e(objArr3, this.tail, size(), this.rootShift);
            } else if (objArr2.length == 0) {
                eVar = l.b();
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(this.tail, size());
                Intrinsics.i(objArrCopyOf, "copyOf(...)");
                eVar = new j(objArrCopyOf);
            }
        }
        this.vector = eVar;
        return (E0.e<E>) eVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int index) {
        I0.d.b(index, size());
        return new h(this, index);
    }

    public final int n() {
        return ((AbstractList) this).modCount;
    }

    /* renamed from: o, reason: from getter */
    public final Object[] getRoot() {
        return this.root;
    }

    /* renamed from: p, reason: from getter */
    public final int getRootShift() {
        return this.rootShift;
    }

    /* renamed from: q, reason: from getter */
    public final Object[] getTail() {
        return this.tail;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        return Q(new a(elements));
    }

    public f(E0.e<? extends E> eVar, Object[] objArr, Object[] objArr2, int i10) {
        this.vector = eVar;
        this.vectorRoot = objArr;
        this.vectorTail = objArr2;
        this.rootShift = i10;
        this.root = this.vectorRoot;
        this.tail = this.vectorTail;
        this.size = this.vector.size();
    }

    private final Object[] G(Object[] root, int rootSize, int shift, Iterator<Object[]> buffersIterator) {
        boolean z10;
        if (!buffersIterator.hasNext()) {
            C5757z0.a("invalid buffersIterator");
        }
        if (shift >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C5757z0.a("negative shift");
        }
        if (shift == 0) {
            return buffersIterator.next();
        }
        Object[] objArrY = y(root);
        int iA = l.a(rootSize, shift);
        int i10 = shift - 5;
        objArrY[iA] = G((Object[]) objArrY[iA], rootSize, i10, buffersIterator);
        while (true) {
            iA++;
            if (iA >= 32 || !buffersIterator.hasNext()) {
                break;
            }
            objArrY[iA] = G((Object[]) objArrY[iA], 0, i10, buffersIterator);
        }
        return objArrY;
    }

    private final Object[] H(Object[] root, int rootSize, Object[][] buffers) {
        Object[] objArrY;
        Iterator<Object[]> itA = ArrayIteratorKt.a(buffers);
        int i10 = rootSize >> 5;
        int i11 = this.rootShift;
        if (i10 < (1 << i11)) {
            objArrY = G(root, rootSize, i11, itA);
        } else {
            objArrY = y(root);
        }
        while (itA.hasNext()) {
            this.rootShift += 5;
            objArrY = C(objArrY);
            int i12 = this.rootShift;
            G(objArrY, 1 << i12, i12, itA);
        }
        return objArrY;
    }

    private final void I(Object[] root, Object[] filledTail, Object[] newTail) {
        int size = size() >> 5;
        int i10 = this.rootShift;
        if (size > (1 << i10)) {
            this.root = K(C(root), filledTail, this.rootShift + 5);
            this.tail = newTail;
            this.rootShift += 5;
            this.size = size() + 1;
            return;
        }
        if (root == null) {
            this.root = filledTail;
            this.tail = newTail;
            this.size = size() + 1;
        } else {
            this.root = K(root, filledTail, i10);
            this.tail = newTail;
            this.size = size() + 1;
        }
    }

    private final Object[] K(Object[] root, Object[] tail, int shift) {
        int iA = l.a(size() - 1, shift);
        Object[] objArrY = y(root);
        if (shift == 5) {
            objArrY[iA] = tail;
            return objArrY;
        }
        objArrY[iA] = K((Object[]) objArrY[iA], tail, shift - 5);
        return objArrY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int L(Function1<? super E, Boolean> predicate, Object[] buffer, int bufferSize, int toBufferSize, d bufferRef, List<Object[]> recyclableBuffers, List<Object[]> buffers) {
        Object[] objArrB;
        if (v(buffer)) {
            recyclableBuffers.add(buffer);
        }
        Object value = bufferRef.getValue();
        Intrinsics.h(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        Object[] objArr2 = objArr;
        for (int i10 = 0; i10 < bufferSize; i10++) {
            Object obj = buffer[i10];
            if (!predicate.invoke(obj).booleanValue()) {
                if (toBufferSize == 32) {
                    if (!recyclableBuffers.isEmpty()) {
                        objArrB = recyclableBuffers.remove(recyclableBuffers.size() - 1);
                    } else {
                        objArrB = B();
                    }
                    objArr2 = objArrB;
                    toBufferSize = 0;
                }
                objArr2[toBufferSize] = obj;
                toBufferSize++;
            }
        }
        bufferRef.b(objArr2);
        if (objArr != bufferRef.getValue()) {
            buffers.add(objArr);
        }
        return toBufferSize;
    }

    private final boolean N(Function1<? super E, Boolean> predicate) {
        Object[] objArrG;
        int iY = Y();
        d dVar = new d(null);
        if (this.root == null) {
            if (P(predicate, iY, dVar) == iY) {
                return false;
            }
            return true;
        }
        ListIterator<Object[]> listIteratorX = x(0);
        int iM = 32;
        while (iM == 32 && listIteratorX.hasNext()) {
            iM = M(predicate, listIteratorX.next(), 32, dVar);
        }
        if (iM == 32) {
            I0.a.a(!listIteratorX.hasNext());
            int iP = P(predicate, iY, dVar);
            if (iP == 0) {
                F(this.root, size(), this.rootShift);
            }
            if (iP == iY) {
                return false;
            }
            return true;
        }
        int iPreviousIndex = listIteratorX.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iL = iM;
        while (listIteratorX.hasNext()) {
            iL = L(predicate, listIteratorX.next(), 32, iL, dVar, arrayList2, arrayList);
        }
        int iL2 = L(predicate, this.tail, iY, iL, dVar, arrayList2, arrayList);
        Object value = dVar.getValue();
        Intrinsics.h(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        ArraysKt.B(objArr, null, iL2, 32);
        if (arrayList.isEmpty()) {
            objArrG = this.root;
            Intrinsics.g(objArrG);
        } else {
            objArrG = G(this.root, iPreviousIndex, this.rootShift, arrayList.iterator());
        }
        int size = iPreviousIndex + (arrayList.size() << 5);
        this.root = T(objArrG, size);
        this.tail = objArr;
        this.size = size + iL2;
        return true;
    }

    private final Object[] R(Object[] root, int shift, int index, d tailCarry) {
        int iA = l.a(index, shift);
        int iA2 = 31;
        if (shift == 0) {
            Object obj = root[iA];
            Object[] objArrO = ArraysKt.o(root, y(root), iA, iA + 1, 32);
            objArrO[31] = tailCarry.getValue();
            tailCarry.b(obj);
            return objArrO;
        }
        if (root[31] == null) {
            iA2 = l.a(U() - 1, shift);
        }
        Object[] objArrY = y(root);
        int i10 = shift - 5;
        int i11 = iA + 1;
        if (i11 <= iA2) {
            while (true) {
                Object obj2 = objArrY[iA2];
                Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrY[iA2] = R((Object[]) obj2, i10, 0, tailCarry);
                if (iA2 == i11) {
                    break;
                }
                iA2--;
            }
        }
        Object obj3 = objArrY[iA];
        Intrinsics.h(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrY[iA] = R((Object[]) obj3, i10, index, tailCarry);
        return objArrY;
    }

    private final Object S(Object[] root, int rootSize, int shift, int index) {
        boolean z10;
        int size = size() - rootSize;
        if (index < size) {
            z10 = true;
        } else {
            z10 = false;
        }
        I0.a.a(z10);
        if (size == 1) {
            Object obj = this.tail[0];
            F(root, rootSize, shift);
            return obj;
        }
        Object[] objArr = this.tail;
        Object obj2 = objArr[index];
        Object[] objArrO = ArraysKt.o(objArr, y(objArr), index, index + 1, size);
        objArrO[size - 1] = null;
        this.root = root;
        this.tail = objArrO;
        this.size = (rootSize + size) - 1;
        this.rootShift = shift;
        return obj2;
    }

    private final int U() {
        if (size() <= 32) {
            return 0;
        }
        return l.d(size());
    }

    private final Object[] V(Object[] root, int shift, int index, E e10, d oldElementCarry) {
        int iA = l.a(index, shift);
        Object[] objArrY = y(root);
        if (shift == 0) {
            if (objArrY != root) {
                ((AbstractList) this).modCount++;
            }
            oldElementCarry.b(objArrY[iA]);
            objArrY[iA] = e10;
            return objArrY;
        }
        Object obj = objArrY[iA];
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrY[iA] = V((Object[]) obj, shift - 5, index, e10, oldElementCarry);
        return objArrY;
    }

    private final int Y() {
        return Z(size());
    }

    private final Object[] h(int index) {
        if (U() <= index) {
            return this.tail;
        }
        Object[] objArr = this.root;
        Intrinsics.g(objArr);
        for (int i10 = this.rootShift; i10 > 0; i10 -= 5) {
            Object[] objArr2 = objArr[l.a(index, i10)];
            Intrinsics.h(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] s(Object[] root, int shift, int index, Object element, d elementCarry) {
        Object obj;
        int iA = l.a(index, shift);
        if (shift == 0) {
            elementCarry.b(root[31]);
            Object[] objArrO = ArraysKt.o(root, y(root), iA + 1, iA, 31);
            objArrO[iA] = element;
            return objArrO;
        }
        Object[] objArrY = y(root);
        int i10 = shift - 5;
        Object obj2 = objArrY[iA];
        Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrY[iA] = s((Object[]) obj2, i10, index, element, elementCarry);
        while (true) {
            iA++;
            if (iA >= 32 || (obj = objArrY[iA]) == null) {
                break;
            }
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrY[iA] = s((Object[]) obj, i10, 0, elementCarry.getValue(), elementCarry);
        }
        return objArrY;
    }

    private final void t(Object[] root, int index, E element) {
        int iY = Y();
        Object[] objArrY = y(this.tail);
        if (iY < 32) {
            ArraysKt.o(this.tail, objArrY, index + 1, index, iY);
            objArrY[index] = element;
            this.root = root;
            this.tail = objArrY;
            this.size = size() + 1;
            return;
        }
        Object[] objArr = this.tail;
        Object obj = objArr[31];
        ArraysKt.o(objArr, objArrY, index + 1, index, 31);
        objArrY[index] = element;
        I(root, objArrY, C(obj));
    }

    private final Object[] z(Object[] buffer, int distance) {
        if (v(buffer)) {
            return ArraysKt.o(buffer, buffer, distance, 0, 32 - distance);
        }
        return ArraysKt.o(buffer, B(), distance, 0, 32 - distance);
    }

    public final boolean Q(Function1<? super E, Boolean> predicate) {
        boolean zN = N(predicate);
        if (zN) {
            ((AbstractList) this).modCount++;
        }
        return zN;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E f(int index) {
        I0.d.a(index, size());
        ((AbstractList) this).modCount++;
        int iU = U();
        if (index >= iU) {
            return (E) S(this.root, iU, this.rootShift, index - iU);
        }
        d dVar = new d(this.tail[0]);
        Object[] objArr = this.root;
        Intrinsics.g(objArr);
        S(R(objArr, this.rootShift, index, dVar), iU, this.rootShift, 0);
        return (E) dVar.getValue();
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        I0.d.a(index, size());
        return (E) h(index)[index & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        I0.d.a(index, size());
        if (U() <= index) {
            Object[] objArrY = y(this.tail);
            if (objArrY != this.tail) {
                ((AbstractList) this).modCount++;
            }
            int i10 = index & 31;
            E e10 = (E) objArrY[i10];
            objArrY[i10] = element;
            this.tail = objArrY;
            return e10;
        }
        d dVar = new d(null);
        Object[] objArr = this.root;
        Intrinsics.g(objArr);
        this.root = V(objArr, this.rootShift, index, element, dVar);
        return (E) dVar.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        I0.d.b(index, size());
        if (index == size()) {
            add(element);
            return;
        }
        ((AbstractList) this).modCount++;
        int iU = U();
        if (index >= iU) {
            t(this.root, index - iU, element);
            return;
        }
        d dVar = new d(null);
        Object[] objArr = this.root;
        Intrinsics.g(objArr);
        t(s(objArr, this.rootShift, index, element, dVar), 0, dVar.getValue());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends E> elements) {
        f<E> fVar;
        Collection<? extends E> collection;
        Object[] objArrO;
        Object[][] objArr;
        I0.d.b(index, size());
        if (index == size()) {
            return addAll(elements);
        }
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i10 = (index >> 5) << 5;
        int size = (((size() - i10) + elements.size()) - 1) / 32;
        if (size == 0) {
            I0.a.a(index >= U());
            int i11 = index & 31;
            int size2 = ((index + elements.size()) - 1) & 31;
            Object[] objArr2 = this.tail;
            Object[] objArrO2 = ArraysKt.o(objArr2, y(objArr2), size2 + 1, i11, Y());
            k(objArrO2, i11, elements.iterator());
            this.tail = objArrO2;
            this.size = size() + elements.size();
            return true;
        }
        Object[][] objArr3 = new Object[size][];
        int iY = Y();
        int iZ = Z(size() + elements.size());
        if (index >= U()) {
            objArrO = B();
            objArr = objArr3;
            fVar = this;
            collection = elements;
            fVar.X(collection, index, this.tail, iY, objArr, size, objArrO);
        } else {
            fVar = this;
            collection = elements;
            if (iZ > iY) {
                int i12 = iZ - iY;
                Object[] objArrZ = z(fVar.tail, i12);
                fVar.r(collection, index, i12, objArr3, size, objArrZ);
                objArr = objArr3;
                objArrO = objArrZ;
            } else {
                int i13 = iY - iZ;
                objArrO = ArraysKt.o(fVar.tail, B(), 0, i13, iY);
                int i14 = 32 - i13;
                Object[] objArrZ2 = z(fVar.tail, i14);
                int i15 = size - 1;
                objArr3[i15] = objArrZ2;
                fVar.r(collection, index, i14, objArr3, i15, objArrZ2);
                collection = collection;
                objArr = objArr3;
                fVar = fVar;
            }
        }
        fVar.root = H(fVar.root, i10, objArr);
        fVar.tail = objArrO;
        fVar.size = size() + collection.size();
        return true;
    }
}
