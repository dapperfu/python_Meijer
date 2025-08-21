package kotlin;

import androidx.compose.foundation.lazy.layout.d;
import androidx.compose.runtime.C5844c1;
import androidx.compose.runtime.InterfaceC5868j0;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.snapshots.g;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.layout.h0;
import androidx.compose.ui.layout.i0;
import d0.EnumC13564E;
import i0.C14592e;
import kotlin.C13896D;
import kotlin.C13901I;
import kotlin.C15847F;
import kotlin.C15860T;
import kotlin.C15870c;
import kotlin.C15876i;
import kotlin.C6453j;
import kotlin.EnumC13937z;
import kotlin.InterfaceC13897E;
import kotlin.InterfaceC13900H;
import kotlin.InterfaceC15850I;
import kotlin.InterfaceC15859S;
import kotlin.InterfaceC15864X;
import kotlin.InterfaceC6452i;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import mv.C15809k;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B)\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 J\"\u0010#\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00022\b\b\u0003\u0010\"\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\u000e*\u00020%2\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(J'\u0010+\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0018H\u0000¢\u0006\u0004\b+\u0010,J!\u0010-\u001a\u00020\u000e2\b\b\u0001\u0010!\u001a\u00020\u00022\b\b\u0003\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b-\u0010\nJ2\u00100\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00022\b\b\u0003\u0010\"\u001a\u00020\u00042\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040.H\u0086@¢\u0006\u0004\b0\u00101JA\u00109\u001a\u00020\u000e2\u0006\u00103\u001a\u0002022'\u00108\u001a#\b\u0001\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e05\u0012\u0006\u0012\u0004\u0018\u00010604¢\u0006\u0002\b7H\u0096@¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b;\u0010\rJ)\u0010>\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010<\u001a\u00020\u00182\b\b\u0002\u0010=\u001a\u00020\u0018H\u0000¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0018H\u0000¢\u0006\u0004\b@\u0010AJ!\u0010D\u001a\u00020\u00022\u0006\u0010C\u001a\u00020B2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\bD\u0010ER$\u0010H\u001a\u00020\u00182\u0006\u0010F\u001a\u00020\u00188\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b9\u0010-\u001a\u0004\bG\u0010AR(\u0010M\u001a\u0004\u0018\u00010\u00112\b\u0010F\u001a\u0004\u0018\u00010\u00118\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR1\u0010U\u001a\u00020N2\u0006\u0010F\u001a\u00020N8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR$\u0010^\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R$\u0010`\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b;\u0010[\u001a\u0004\b_\u0010]R\"\u0010f\u001a\u00020a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010R\"\u0004\be\u0010TR\"\u0010j\u001a\u00020a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bg\u0010c\u001a\u0004\bh\u0010R\"\u0004\bi\u0010TR\u0016\u0010l\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010hR\u0016\u0010n\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010hR\u0014\u0010q\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR$\u0010t\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\br\u0010[\u001a\u0004\bs\u0010]R\u0016\u0010u\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010[R\"\u0010z\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bv\u0010-\u001a\u0004\bw\u0010A\"\u0004\bx\u0010yR\u0016\u0010{\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010[R\u0018\u0010\u007f\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u0017\u0010\u0080\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010-R\u001e\u0010\u0082\u0001\u001a\t\u0012\u0004\u0012\u00020\u00110\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010PR)\u0010\u0089\u0001\u001a\u00030\u0083\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u0015\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R \u0010\u008f\u0001\u001a\u00030\u008a\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R1\u0010\u0095\u0001\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0005\b\u0092\u0001\u0010]\"\u0006\b\u0093\u0001\u0010\u0094\u0001R1\u0010\u0099\u0001\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\b\u0096\u0001\u0010\u0091\u0001\u001a\u0005\b\u0097\u0001\u0010]\"\u0006\b\u0098\u0001\u0010\u0094\u0001R\u001f\u0010\u009d\u0001\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\u000f\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0005\b\u009c\u0001\u0010]R\u001e\u0010&\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\u000f\n\u0006\b\u0085\u0001\u0010\u009b\u0001\u001a\u0005\b\u009e\u0001\u0010]R\u001f\u0010£\u0001\u001a\u00030\u009f\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\\\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R\u001f\u0010§\u0001\u001a\u00030¤\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b_\u0010¥\u0001\u001a\u0006\b\u0090\u0001\u0010¦\u0001R \u0010«\u0001\u001a\u00030¨\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010©\u0001\u001a\u0006\b\u008b\u0001\u0010ª\u0001R7\u0010²\u0001\u001a\u0005\u0018\u00010¬\u00012\t\u0010F\u001a\u0005\u0018\u00010¬\u00018@@BX\u0080\u008e\u0002¢\u0006\u0017\n\u0005\b\u00ad\u0001\u0010P\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R \u0010¸\u0001\u001a\u00030³\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001R,\u0010¼\u0001\u001a\u00030¹\u00018\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0014\n\u0004\bd\u0010c\u001a\u0005\bº\u0001\u0010R\"\u0005\b»\u0001\u0010TR \u0010Â\u0001\u001a\u00030½\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001R$\u0010Æ\u0001\u001a\u00030Ã\u00018\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0004\bh\u0010P\u001a\u0006\bÄ\u0001\u0010Å\u0001R%\u0010È\u0001\u001a\u00030Ã\u00018\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\n\u0005\bÇ\u0001\u0010P\u001a\u0006\b¾\u0001\u0010Å\u0001R.\u0010Ë\u0001\u001a\u00020\u00182\u0006\u0010F\u001a\u00020\u00188F@BX\u0086\u008e\u0002¢\u0006\u0014\n\u0005\bÉ\u0001\u0010P\u001a\u0004\bZ\u0010A\"\u0005\bÊ\u0001\u0010yR-\u0010Í\u0001\u001a\u00020\u00182\u0006\u0010F\u001a\u00020\u00188F@BX\u0086\u008e\u0002¢\u0006\u0013\n\u0004\b[\u0010P\u001a\u0004\bW\u0010A\"\u0005\bÌ\u0001\u0010yR\u001c\u0010Î\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180\u0081\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010PR\u001d\u0010Ð\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180\u0081\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bÏ\u0001\u0010PR\u0016\u0010Ñ\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bÉ\u0001\u0010]R\u0014\u0010Ó\u0001\u001a\u00020\u001b8F¢\u0006\b\u001a\u0006\b´\u0001\u0010Ò\u0001R\u0016\u0010Ô\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÏ\u0001\u0010]R\u0015\u0010Õ\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b[\u0010]R\u0015\u0010Ö\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bc\u0010]R\u0017\u0010Ù\u0001\u001a\u00020\u00048@X\u0080\u0004¢\u0006\b\u001a\u0006\b×\u0001\u0010Ø\u0001R\u0012\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010]R\u0013\u0010\u0005\u001a\u00020\u00048F¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010Ø\u0001R!\u0010Þ\u0001\u001a\u00030Ú\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\bÇ\u0001\u0010Û\u0001*\u0006\bÜ\u0001\u0010Ý\u0001R\u0015\u0010ß\u0001\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010AR\u0016\u0010à\u0001\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u00ad\u0001\u0010A\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006á\u0001"}, d2 = {"Lo0/C;", "Lf0/H;", "", "currentPage", "", "currentPageOffsetFraction", "Ln0/X;", "prefetchScheduler", "<init>", "(IFLn0/X;)V", "(IF)V", "delta", "Y", "(F)F", "", "q", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo0/t;", "result", "n0", "(Lo0/t;)V", "s", "(I)I", "scrollDelta", "", "U", "(F)Z", "Lo0/n;", "info", "X", "(FLo0/n;)V", "r", "(Lo0/n;)V", "page", "pageOffsetFraction", "c0", "(IFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lf0/E;", "targetPage", "o0", "(Lf0/E;I)V", "offsetFraction", "forceRemeasure", "m0", "(IFZ)V", "Z", "Lc0/i;", "animationSpec", "m", "(IFLc0/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ld0/E;", "scrollPriority", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Ld0/E;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "isLookingAhead", "visibleItemsStayedTheSame", "o", "(Lo0/t;ZZ)V", "V", "()Z", "Lo0/q;", "itemProvider", "W", "(Lo0/q;I)I", "<set-?>", "getHasLookaheadOccurred$foundation_release", "hasLookaheadOccurred", "b", "Lo0/t;", "getApproachLayoutInfo$foundation_release", "()Lo0/t;", "approachLayoutInfo", "LU0/f;", "c", "Landroidx/compose/runtime/l0;", "T", "()J", "l0", "(J)V", "upDownDifference", "Lo0/w;", "d", "Lo0/w;", "scrollPosition", "e", "I", "y", "()I", "firstVisiblePage", "z", "firstVisiblePageOffset", "", "g", "J", "D", "setMaxScrollOffset$foundation_release", "maxScrollOffset", "h", "F", "setMinScrollOffset$foundation_release", "minScrollOffset", "i", "accumulator", "j", "previousPassDelta", "k", "Lf0/H;", "scrollableState", "l", "getLayoutWithMeasurement$foundation_release", "layoutWithMeasurement", "layoutWithoutMeasurement", "n", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "(Z)V", "prefetchingEnabled", "indexToPrefetch", "Landroidx/compose/foundation/lazy/layout/d$b;", "p", "Landroidx/compose/foundation/lazy/layout/d$b;", "currentPrefetchHandle", "wasPrefetchingForward", "Landroidx/compose/runtime/l0;", "pagerLayoutInfoState", "LH1/d;", "LH1/d;", "x", "()LH1/d;", "g0", "(LH1/d;)V", "density", "Lh0/l;", "t", "Lh0/l;", "A", "()Lh0/l;", "internalInteractionSource", "u", "Landroidx/compose/runtime/j0;", "P", "i0", "(I)V", "programmaticScrollTargetPage", "v", "S", "k0", "settledPageState", "w", "Landroidx/compose/runtime/z1;", "getSettledPage", "settledPage", "getTargetPage", "Landroidx/compose/foundation/lazy/layout/d;", "Landroidx/compose/foundation/lazy/layout/d;", "O", "()Landroidx/compose/foundation/lazy/layout/d;", "prefetchState", "Ln0/i;", "Ln0/i;", "()Ln0/i;", "beyondBoundsInfo", "Ln0/c;", "Ln0/c;", "()Ln0/c;", "awaitLayoutModifier", "Landroidx/compose/ui/layout/h0;", "B", "Q", "()Landroidx/compose/ui/layout/h0;", "j0", "(Landroidx/compose/ui/layout/h0;)V", "remeasurement", "Landroidx/compose/ui/layout/i0;", "C", "Landroidx/compose/ui/layout/i0;", "R", "()Landroidx/compose/ui/layout/i0;", "remeasurementModifier", "LH1/b;", "getPremeasureConstraints-msEJaDk$foundation_release", "h0", "premeasureConstraints", "Ln0/F;", "E", "Ln0/F;", "L", "()Ln0/F;", "pinnedPages", "Ln0/T;", "M", "()Landroidx/compose/runtime/l0;", "placementScopeInvalidator", "G", "measurementScopeInvalidator", "H", "f0", "canScrollForward", "e0", "canScrollBackward", "isLastScrollForwardState", "K", "isLastScrollBackwardState", "pageCount", "()Lo0/n;", "layoutInfo", "pageSpacing", "pageSize", "pageSizeWithSpacing", "N", "()F", "positionThresholdFraction", "Lkotlin/ranges/IntRange;", "()Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release$delegate", "(Lo0/C;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "lastScrolledForward", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: o0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16037C implements InterfaceC13900H {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final C15870c awaitLayoutModifier;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 remeasurement;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final i0 remeasurementModifier;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private long premeasureConstraints;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final C15847F pinnedPages;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Unit> placementScopeInvalidator;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Unit> measurementScopeInvalidator;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 canScrollForward;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 canScrollBackward;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Boolean> isLastScrollForwardState;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Boolean> isLastScrollBackwardState;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean hasLookaheadOccurred;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private C16059t approachLayoutInfo;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 upDownDifference;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C16062w scrollPosition;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int firstVisiblePage;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int firstVisiblePageOffset;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long maxScrollOffset;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long minScrollOffset;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private float accumulator;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private float previousPassDelta;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13900H scrollableState;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int layoutWithMeasurement;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int layoutWithoutMeasurement;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean prefetchingEnabled;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int indexToPrefetch;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private d.b currentPrefetchHandle;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean wasPrefetchingForward;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5872l0<C16059t> pagerLayoutInfoState;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private H1.d density;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final h0.l internalInteractionSource;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5868j0 programmaticScrollTargetPage;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5868j0 settledPageState;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final z1 settledPage;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final z1 targetPage;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.foundation.lazy.layout.d prefetchState;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final C15876i beyondBoundsInfo;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {610, 617}, m = "animateScrollToPage")
    /* renamed from: o0.C$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f153347a;

        /* renamed from: b, reason: collision with root package name */
        Object f153348b;

        /* renamed from: c, reason: collision with root package name */
        int f153349c;

        /* renamed from: d, reason: collision with root package name */
        float f153350d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f153351e;

        /* renamed from: g, reason: collision with root package name */
        int f153353g;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f153351e = obj;
            this.f153353g |= Integer.MIN_VALUE;
            return AbstractC16037C.this.m(0, 0.0f, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf0/E;", "", "<anonymous>", "(Lf0/E;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3", f = "PagerState.kt", l = {619}, m = "invokeSuspend")
    /* renamed from: o0.C$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC13897E, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f153354a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f153355b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f153357d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f153358e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6452i<Float> f153359f;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lf0/E;", "", "it", "", "a", "(Lf0/E;I)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: o0.C$b$a */
        static final class a extends Lambda implements Function2<InterfaceC13897E, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ AbstractC16037C f153360f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC16037C abstractC16037C) {
                super(2);
                this.f153360f = abstractC16037C;
            }

            public final void a(InterfaceC13897E interfaceC13897E, int i10) {
                this.f153360f.o0(interfaceC13897E, i10);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC13897E interfaceC13897E, Integer num) {
                a(interfaceC13897E, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, float f10, InterfaceC6452i<Float> interfaceC6452i, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f153357d = i10;
            this.f153358e = f10;
            this.f153359f = interfaceC6452i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = AbstractC16037C.this.new b(this.f153357d, this.f153358e, this.f153359f, continuation);
            bVar.f153355b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13897E interfaceC13897E, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC13897E, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f153354a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC15850I interfaceC15850IA = C16064y.a(AbstractC16037C.this, (InterfaceC13897E) this.f153355b);
                int i11 = this.f153357d;
                float f10 = this.f153358e;
                InterfaceC6452i<Float> interfaceC6452i = this.f153359f;
                a aVar = new a(AbstractC16037C.this);
                this.f153354a = 1;
                if (C16038D.d(interfaceC15850IA, i11, f10, interfaceC6452i, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/S;", "", "a", "(Ln0/S;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: o0.C$c */
    static final class c extends Lambda implements Function1<InterfaceC15859S, Unit> {
        c() {
            super(1);
        }

        public final void a(InterfaceC15859S interfaceC15859S) {
            g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
            AbstractC16037C abstractC16037C = AbstractC16037C.this;
            androidx.compose.runtime.snapshots.g gVarD = companion.d();
            Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
            androidx.compose.runtime.snapshots.g gVarE = companion.e(gVarD);
            try {
                interfaceC15859S.a(abstractC16037C.getFirstVisiblePage());
                Unit unit = Unit.f143329a;
            } finally {
                companion.l(gVarD, gVarE, function1G);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15859S interfaceC15859S) {
            a(interfaceC15859S);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"o0/C$d", "Landroidx/compose/ui/layout/i0;", "Landroidx/compose/ui/layout/h0;", "remeasurement", "", "o", "(Landroidx/compose/ui/layout/h0;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o0.C$d */
    public static final class d implements i0 {
        d() {
        }

        @Override // androidx.compose.ui.layout.i0
        public void o(h0 remeasurement) {
            AbstractC16037C.this.j0(remeasurement);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.pager.PagerState$requestScrollToPage$1", f = "PagerState.kt", l = {581}, m = "invokeSuspend")
    /* renamed from: o0.C$e */
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f153363a;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AbstractC16037C.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f153363a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                AbstractC16037C abstractC16037C = AbstractC16037C.this;
                this.f153363a = 1;
                if (C13896D.e(abstractC16037C, null, this, 1, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {636, 641}, m = "scroll$suspendImpl")
    /* renamed from: o0.C$f */
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f153365a;

        /* renamed from: b, reason: collision with root package name */
        Object f153366b;

        /* renamed from: c, reason: collision with root package name */
        Object f153367c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f153368d;

        /* renamed from: f, reason: collision with root package name */
        int f153370f;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f153368d = obj;
            this.f153370f |= Integer.MIN_VALUE;
            return AbstractC16037C.b0(AbstractC16037C.this, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf0/E;", "", "<anonymous>", "(Lf0/E;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", f = "PagerState.kt", l = {507}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: o0.C$g */
    static final class g extends SuspendLambda implements Function2<InterfaceC13897E, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f153371a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f153373c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f153374d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(float f10, int i10, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f153373c = f10;
            this.f153374d = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AbstractC16037C.this.new g(this.f153373c, this.f153374d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13897E interfaceC13897E, Continuation<? super Unit> continuation) {
            return ((g) create(interfaceC13897E, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f153371a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                AbstractC16037C abstractC16037C = AbstractC16037C.this;
                this.f153371a = 1;
                if (abstractC16037C.q(this) == objF) {
                    return objF;
                }
            }
            float f10 = this.f153373c;
            double d10 = f10;
            boolean z10 = false;
            if (-0.5d <= d10 && d10 <= 0.5d) {
                z10 = true;
            }
            if (!z10) {
                C14592e.a("pageOffsetFraction " + f10 + " is not within the range -0.5 to 0.5");
            }
            AbstractC16037C.this.m0(AbstractC16037C.this.s(this.f153374d), this.f153373c, true);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "b", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: o0.C$h */
    static final class h extends Lambda implements Function1<Float, Float> {
        h() {
            super(1);
        }

        public final Float b(float f10) {
            return Float.valueOf(AbstractC16037C.this.Y(f10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return b(f10.floatValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: o0.C$i */
    static final class i extends Lambda implements Function0<Integer> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(AbstractC16037C.this.b() ? AbstractC16037C.this.S() : AbstractC16037C.this.v());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: o0.C$j */
    static final class j extends Lambda implements Function0<Integer> {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(AbstractC16037C.this.s(!AbstractC16037C.this.b() ? AbstractC16037C.this.v() : AbstractC16037C.this.P() != -1 ? AbstractC16037C.this.P() : Math.abs(AbstractC16037C.this.w()) >= Math.abs(AbstractC16037C.this.N()) ? AbstractC16037C.this.B() ? AbstractC16037C.this.getFirstVisiblePage() + 1 : AbstractC16037C.this.getFirstVisiblePage() : AbstractC16037C.this.v()));
        }
    }

    public AbstractC16037C() {
        this(0, 0.0f, null, 7, null);
    }

    public abstract int H();

    public AbstractC16037C(int i10, float f10, InterfaceC15864X interfaceC15864X) {
        double d10 = f10;
        boolean z10 = false;
        if (-0.5d <= d10 && d10 <= 0.5d) {
            z10 = true;
        }
        if (!z10) {
            C14592e.a("currentPageOffsetFraction " + f10 + " is not within the range -0.5 to 0.5");
        }
        this.upDownDifference = t1.e(U0.f.d(U0.f.INSTANCE.c()), null, 2, null);
        C16062w c16062w = new C16062w(i10, f10, this);
        this.scrollPosition = c16062w;
        this.firstVisiblePage = i10;
        this.maxScrollOffset = Long.MAX_VALUE;
        this.scrollableState = C13901I.a(new h());
        this.prefetchingEnabled = true;
        this.indexToPrefetch = -1;
        this.pagerLayoutInfoState = o1.i(C16038D.j(), o1.k());
        this.density = C16038D.f153380c;
        this.internalInteractionSource = h0.k.a();
        this.programmaticScrollTargetPage = C5844c1.a(-1);
        this.settledPageState = C5844c1.a(i10);
        this.settledPage = o1.d(o1.r(), new i());
        this.targetPage = o1.d(o1.r(), new j());
        this.prefetchState = new androidx.compose.foundation.lazy.layout.d(interfaceC15864X, new c());
        this.beyondBoundsInfo = new C15876i();
        this.awaitLayoutModifier = new C15870c();
        this.remeasurement = t1.e(null, null, 2, null);
        this.remeasurementModifier = new d();
        this.premeasureConstraints = H1.c.b(0, 0, 0, 0, 15, null);
        this.pinnedPages = new C15847F();
        c16062w.getNearestRangeState();
        this.placementScopeInvalidator = C15860T.c(null, 1, null);
        this.measurementScopeInvalidator = C15860T.c(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.canScrollForward = t1.e(bool, null, 2, null);
        this.canScrollBackward = t1.e(bool, null, 2, null);
        this.isLastScrollForwardState = t1.e(bool, null, 2, null);
        this.isLastScrollBackwardState = t1.e(bool, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int P() {
        return this.programmaticScrollTargetPage.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int S() {
        return this.settledPageState.a();
    }

    private final void X(float delta, InterfaceC16053n info) {
        d.b bVar;
        d.b bVar2;
        d.b bVar3;
        if (this.prefetchingEnabled && !info.h().isEmpty()) {
            boolean z10 = delta > 0.0f;
            int index = z10 ? ((InterfaceC16045f) CollectionsKt.D0(info.h())).getIndex() + info.getBeyondViewportPageCount() + 1 : (((InterfaceC16045f) CollectionsKt.s0(info.h())).getIndex() - info.getBeyondViewportPageCount()) - 1;
            if (index < 0 || index >= H()) {
                return;
            }
            if (index != this.indexToPrefetch) {
                if (this.wasPrefetchingForward != z10 && (bVar3 = this.currentPrefetchHandle) != null) {
                    bVar3.cancel();
                }
                this.wasPrefetchingForward = z10;
                this.indexToPrefetch = index;
                this.currentPrefetchHandle = this.prefetchState.e(index, this.premeasureConstraints);
            }
            if (z10) {
                if ((((InterfaceC16045f) CollectionsKt.D0(info.h())).getOffset() + (info.getPageSize() + info.getPageSpacing())) - info.getViewportEndOffset() >= delta || (bVar2 = this.currentPrefetchHandle) == null) {
                    return;
                }
                bVar2.a();
                return;
            }
            if (info.getViewportStartOffset() - ((InterfaceC16045f) CollectionsKt.s0(info.h())).getOffset() >= (-delta) || (bVar = this.currentPrefetchHandle) == null) {
                return;
            }
            bVar.a();
        }
    }

    public static /* synthetic */ void a0(AbstractC16037C abstractC16037C, int i10, float f10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestScrollToPage");
        }
        if ((i11 & 2) != 0) {
            f10 = 0.0f;
        }
        abstractC16037C.Z(i10, f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r8.a(r6, r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object b0(kotlin.AbstractC16037C r5, d0.EnumC13564E r6, kotlin.jvm.functions.Function2<? super kotlin.InterfaceC13897E, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            boolean r0 = r8 instanceof kotlin.AbstractC16037C.f
            if (r0 == 0) goto L13
            r0 = r8
            o0.C$f r0 = (kotlin.AbstractC16037C.f) r0
            int r1 = r0.f153370f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f153370f = r1
            goto L18
        L13:
            o0.C$f r0 = new o0.C$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f153368d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f153370f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.f153365a
            o0.C r5 = (kotlin.AbstractC16037C) r5
            kotlin.ResultKt.b(r8)
            goto L7b
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            java.lang.Object r5 = r0.f153367c
            r7 = r5
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            java.lang.Object r5 = r0.f153366b
            r6 = r5
            d0.E r6 = (d0.EnumC13564E) r6
            java.lang.Object r5 = r0.f153365a
            o0.C r5 = (kotlin.AbstractC16037C) r5
            kotlin.ResultKt.b(r8)
            goto L5c
        L4a:
            kotlin.ResultKt.b(r8)
            r0.f153365a = r5
            r0.f153366b = r6
            r0.f153367c = r7
            r0.f153370f = r4
            java.lang.Object r8 = r5.q(r0)
            if (r8 != r1) goto L5c
            goto L7a
        L5c:
            boolean r8 = r5.b()
            if (r8 != 0) goto L69
            int r8 = r5.v()
            r5.k0(r8)
        L69:
            f0.H r8 = r5.scrollableState
            r0.f153365a = r5
            r2 = 0
            r0.f153366b = r2
            r0.f153367c = r2
            r0.f153370f = r3
            java.lang.Object r6 = r8.a(r6, r7, r0)
            if (r6 != r1) goto L7b
        L7a:
            return r1
        L7b:
            r6 = -1
            r5.i0(r6)
            kotlin.Unit r5 = kotlin.Unit.f143329a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.AbstractC16037C.b0(o0.C, d0.E, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object d0(AbstractC16037C abstractC16037C, int i10, float f10, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToPage");
        }
        if ((i11 & 2) != 0) {
            f10 = 0.0f;
        }
        return abstractC16037C.c0(i10, f10, continuation);
    }

    private final void e0(boolean z10) {
        this.canScrollBackward.setValue(Boolean.valueOf(z10));
    }

    private final void f0(boolean z10) {
        this.canScrollForward.setValue(Boolean.valueOf(z10));
    }

    private final void i0(int i10) {
        this.programmaticScrollTargetPage.i(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0(h0 h0Var) {
        this.remeasurement.setValue(h0Var);
    }

    private final void k0(int i10) {
        this.settledPageState.i(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object n(AbstractC16037C abstractC16037C, int i10, float f10, InterfaceC6452i interfaceC6452i, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollToPage");
        }
        if ((i11 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            interfaceC6452i = C6453j.j(0.0f, 0.0f, null, 7, null);
        }
        return abstractC16037C.m(i10, f10, interfaceC6452i, continuation);
    }

    private final void n0(C16059t result) {
        g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
        androidx.compose.runtime.snapshots.g gVarD = companion.d();
        Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
        androidx.compose.runtime.snapshots.g gVarE = companion.e(gVarD);
        try {
            if (Math.abs(this.previousPassDelta) > 0.5f && this.prefetchingEnabled && U(this.previousPassDelta)) {
                X(this.previousPassDelta, result);
            }
            Unit unit = Unit.f143329a;
            companion.l(gVarD, gVarE, function1G);
        } catch (Throwable th2) {
            companion.l(gVarD, gVarE, function1G);
            throw th2;
        }
    }

    public static /* synthetic */ void p(AbstractC16037C abstractC16037C, C16059t c16059t, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMeasureResult");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        abstractC16037C.o(c16059t, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q(Continuation<? super Unit> continuation) {
        Object objE = this.awaitLayoutModifier.e(continuation);
        return objE == IntrinsicsKt.f() ? objE : Unit.f143329a;
    }

    private final void r(InterfaceC16053n info) {
        if (this.indexToPrefetch == -1 || info.h().isEmpty()) {
            return;
        }
        if (this.indexToPrefetch != (this.wasPrefetchingForward ? ((InterfaceC16045f) CollectionsKt.D0(info.h())).getIndex() + info.getBeyondViewportPageCount() + 1 : (((InterfaceC16045f) CollectionsKt.s0(info.h())).getIndex() - info.getBeyondViewportPageCount()) - 1)) {
            this.indexToPrefetch = -1;
            d.b bVar = this.currentPrefetchHandle;
            if (bVar != null) {
                bVar.cancel();
            }
            this.currentPrefetchHandle = null;
        }
    }

    /* renamed from: A, reason: from getter */
    public final h0.l getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    public boolean B() {
        return this.isLastScrollForwardState.getValue().booleanValue();
    }

    public final InterfaceC16053n C() {
        return this.pagerLayoutInfoState.getValue();
    }

    /* renamed from: D, reason: from getter */
    public final long getMaxScrollOffset() {
        return this.maxScrollOffset;
    }

    public final InterfaceC5872l0<Unit> E() {
        return this.measurementScopeInvalidator;
    }

    /* renamed from: F, reason: from getter */
    public final long getMinScrollOffset() {
        return this.minScrollOffset;
    }

    public final IntRange G() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    public final int I() {
        return this.pagerLayoutInfoState.getValue().getPageSize();
    }

    public final int K() {
        return this.pagerLayoutInfoState.getValue().getPageSpacing();
    }

    /* renamed from: L, reason: from getter */
    public final C15847F getPinnedPages() {
        return this.pinnedPages;
    }

    public final InterfaceC5872l0<Unit> M() {
        return this.placementScopeInvalidator;
    }

    public final float N() {
        return Math.min(this.density.I1(C16038D.i()), I() / 2.0f) / I();
    }

    /* renamed from: O, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.d getPrefetchState() {
        return this.prefetchState;
    }

    public final h0 Q() {
        return (h0) this.remeasurement.getValue();
    }

    /* renamed from: R, reason: from getter */
    public final i0 getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long T() {
        return ((U0.f) this.upDownDifference.getValue()).getPackedValue();
    }

    public final int W(C16056q itemProvider, int currentPage) {
        return this.scrollPosition.e(itemProvider, currentPage);
    }

    @Override // kotlin.InterfaceC13900H
    public boolean b() {
        return this.scrollableState.b();
    }

    public final Object c0(int i10, float f10, Continuation<? super Unit> continuation) {
        Object objC = InterfaceC13900H.c(this, null, new g(f10, i10, null), continuation, 1, null);
        return objC == IntrinsicsKt.f() ? objC : Unit.f143329a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.InterfaceC13900H
    public final boolean d() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.InterfaceC13900H
    public final boolean e() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    @Override // kotlin.InterfaceC13900H
    public float f(float delta) {
        return this.scrollableState.f(delta);
    }

    public final void g0(H1.d dVar) {
        this.density = dVar;
    }

    public final void h0(long j10) {
        this.premeasureConstraints = j10;
    }

    public final void l0(long j10) {
        this.upDownDifference.setValue(U0.f.d(j10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c2, code lost:
    
        if (kotlin.InterfaceC13900H.c(r1, null, r3, r4, 1, null) == r0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(int r12, float r13, kotlin.InterfaceC6452i<java.lang.Float> r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof kotlin.AbstractC16037C.a
            if (r0 == 0) goto L14
            r0 = r15
            o0.C$a r0 = (kotlin.AbstractC16037C.a) r0
            int r1 = r0.f153353g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f153353g = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            o0.C$a r0 = new o0.C$a
            r0.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r15 = r4.f153351e
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r4.f153353g
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L48
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            kotlin.ResultKt.b(r15)
            goto Lc5
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            float r13 = r4.f153350d
            int r12 = r4.f153349c
            java.lang.Object r14 = r4.f153348b
            c0.i r14 = (kotlin.InterfaceC6452i) r14
            java.lang.Object r1 = r4.f153347a
            o0.C r1 = (kotlin.AbstractC16037C) r1
            kotlin.ResultKt.b(r15)
        L46:
            r9 = r14
            goto L76
        L48:
            kotlin.ResultKt.b(r15)
            int r15 = r11.v()
            if (r12 != r15) goto L5a
            float r15 = r11.w()
            int r15 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r15 != 0) goto L5a
            goto L60
        L5a:
            int r15 = r11.H()
            if (r15 != 0) goto L63
        L60:
            kotlin.Unit r12 = kotlin.Unit.f143329a
            return r12
        L63:
            r4.f153347a = r11
            r4.f153348b = r14
            r4.f153349c = r12
            r4.f153350d = r13
            r4.f153353g = r3
            java.lang.Object r15 = r11.q(r4)
            if (r15 != r0) goto L74
            goto Lc4
        L74:
            r1 = r11
            goto L46
        L76:
            double r14 = (double) r13
            r5 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r5 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            r6 = 0
            if (r5 > 0) goto L85
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r14 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r14 > 0) goto L85
            goto L86
        L85:
            r3 = r6
        L86:
            if (r3 != 0) goto La1
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "pageOffsetFraction "
            r14.append(r15)
            r14.append(r13)
            java.lang.String r15 = " is not within the range -0.5 to 0.5"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            i0.C14592e.a(r14)
        La1:
            int r7 = r1.s(r12)
            int r12 = r1.J()
            float r12 = (float) r12
            float r8 = r13 * r12
            o0.C$b r3 = new o0.C$b
            r10 = 0
            r6 = r1
            r5 = r3
            r5.<init>(r7, r8, r9, r10)
            r12 = 0
            r4.f153347a = r12
            r4.f153348b = r12
            r4.f153353g = r2
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r12 = kotlin.InterfaceC13900H.c(r1, r2, r3, r4, r5, r6)
            if (r12 != r0) goto Lc5
        Lc4:
            return r0
        Lc5:
            kotlin.Unit r12 = kotlin.Unit.f143329a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.AbstractC16037C.m(int, float, c0.i, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void m0(int page, float offsetFraction, boolean forceRemeasure) {
        this.scrollPosition.f(page, offsetFraction);
        if (!forceRemeasure) {
            C15860T.d(this.measurementScopeInvalidator);
            return;
        }
        h0 h0VarQ = Q();
        if (h0VarQ != null) {
            h0VarQ.c();
        }
    }

    public final void o(C16059t result, boolean isLookingAhead, boolean visibleItemsStayedTheSame) {
        if (!isLookingAhead && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = result;
            return;
        }
        if (isLookingAhead) {
            this.hasLookaheadOccurred = true;
        }
        if (visibleItemsStayedTheSame) {
            this.scrollPosition.j(result.getCurrentPageOffsetFraction());
        } else {
            this.scrollPosition.k(result);
            r(result);
        }
        this.pagerLayoutInfoState.setValue(result);
        f0(result.getCanScrollForward());
        e0(result.m());
        C16044e c16044eU = result.getFirstVisiblePage();
        if (c16044eU != null) {
            this.firstVisiblePage = c16044eU.getIndex();
        }
        this.firstVisiblePageOffset = result.getFirstVisiblePageScrollOffset();
        n0(result);
        this.maxScrollOffset = C16038D.g(result, H());
        this.minScrollOffset = C16038D.h(result, H());
    }

    /* renamed from: t, reason: from getter */
    public final C15870c getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    /* renamed from: u, reason: from getter */
    public final C15876i getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    public final int v() {
        return this.scrollPosition.b();
    }

    public final float w() {
        return this.scrollPosition.c();
    }

    /* renamed from: x, reason: from getter */
    public final H1.d getDensity() {
        return this.density;
    }

    /* renamed from: y, reason: from getter */
    public final int getFirstVisiblePage() {
        return this.firstVisiblePage;
    }

    /* renamed from: z, reason: from getter */
    public final int getFirstVisiblePageOffset() {
        return this.firstVisiblePageOffset;
    }

    private final boolean U(float scrollDelta) {
        if (C().getOrientation() == EnumC13937z.f131419a) {
            if (Math.signum(scrollDelta) == Math.signum(-Float.intBitsToFloat((int) (T() & 4294967295L)))) {
                return true;
            }
        } else if (Math.signum(scrollDelta) == Math.signum(-Float.intBitsToFloat((int) (T() >> 32)))) {
            return true;
        }
        if (V()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float Y(float delta) {
        boolean z10;
        Number numberValueOf;
        C16059t c16059t;
        C16059t c16059tL;
        boolean z11;
        long jA = C16063x.a(this);
        float f10 = this.accumulator + delta;
        long jF = MathKt.f(f10);
        this.accumulator = f10 - jF;
        if (Math.abs(delta) < 1.0E-4f) {
            return delta;
        }
        long j10 = jA + jF;
        long jP = RangesKt.p(j10, this.minScrollOffset, this.maxScrollOffset);
        boolean z12 = false;
        if (j10 != jP) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j11 = jP - jA;
        float f11 = j11;
        this.previousPassDelta = f11;
        if (Math.abs(j11) != 0) {
            InterfaceC5872l0<Boolean> interfaceC5872l0 = this.isLastScrollForwardState;
            if (f11 > 0.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            interfaceC5872l0.setValue(Boolean.valueOf(z11));
            InterfaceC5872l0<Boolean> interfaceC5872l02 = this.isLastScrollBackwardState;
            if (f11 < 0.0f) {
                z12 = true;
            }
            interfaceC5872l02.setValue(Boolean.valueOf(z12));
        }
        int i10 = (int) j11;
        int i11 = -i10;
        C16059t c16059tL2 = this.pagerLayoutInfoState.getValue().l(i11);
        if (c16059tL2 != null && (c16059t = this.approachLayoutInfo) != null) {
            if (c16059t != null) {
                c16059tL = c16059t.l(i11);
            } else {
                c16059tL = null;
            }
            if (c16059tL != null) {
                this.approachLayoutInfo = c16059tL;
            } else {
                c16059tL2 = null;
            }
        }
        if (c16059tL2 != null) {
            o(c16059tL2, this.hasLookaheadOccurred, true);
            C15860T.d(this.placementScopeInvalidator);
            this.layoutWithoutMeasurement++;
        } else {
            this.scrollPosition.a(i10);
            h0 h0VarQ = Q();
            if (h0VarQ != null) {
                h0VarQ.c();
            }
            this.layoutWithMeasurement++;
        }
        if (z10) {
            numberValueOf = Long.valueOf(j11);
        } else {
            numberValueOf = Float.valueOf(delta);
        }
        return numberValueOf.floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int s(int i10) {
        if (H() <= 0) {
            return 0;
        }
        return RangesKt.o(i10, 0, H() - 1);
    }

    public final int J() {
        return I() + K();
    }

    public final boolean V() {
        if (((int) Float.intBitsToFloat((int) (T() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (T() & 4294967295L))) == 0) {
            return true;
        }
        return false;
    }

    public final void Z(int page, float pageOffsetFraction) {
        if (b()) {
            C15809k.d(this.pagerLayoutInfoState.getValue().getCoroutineScope(), null, null, new e(null), 3, null);
        }
        m0(page, pageOffsetFraction, false);
    }

    @Override // kotlin.InterfaceC13900H
    public Object a(EnumC13564E enumC13564E, Function2<? super InterfaceC13897E, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        return b0(this, enumC13564E, function2, continuation);
    }

    public final void o0(InterfaceC13897E interfaceC13897E, int i10) {
        i0(s(i10));
    }

    public /* synthetic */ AbstractC16037C(int i10, float f10, InterfaceC15864X interfaceC15864X, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? 0.0f : f10, (i11 & 4) != 0 ? null : interfaceC15864X);
    }

    public AbstractC16037C(int i10, float f10) {
        this(i10, f10, null);
    }
}
