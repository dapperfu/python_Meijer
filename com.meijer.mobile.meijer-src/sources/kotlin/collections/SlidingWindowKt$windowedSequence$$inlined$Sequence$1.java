package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class SlidingWindowKt$windowedSequence$$inlined$Sequence$1 implements Sequence<List<Object>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Sequence f143437a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f143438b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f143439c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f143440d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f143441e;

    @Override // kotlin.sequences.Sequence
    public Iterator<List<Object>> iterator() {
        return SlidingWindowKt.b(this.f143437a.iterator(), this.f143438b, this.f143439c, this.f143440d, this.f143441e);
    }
}
