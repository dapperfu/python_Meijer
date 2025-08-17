package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.SequencesKt___SequencesKt$minus$2;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kotlin/sequences/SequencesKt___SequencesKt$minus$2", "Lkotlin/sequences/Sequence;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SequencesKt___SequencesKt$minus$2 implements Sequence<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Sequence<Object> f147281a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object[] f147282b;

    @Override // kotlin.sequences.Sequence
    public Iterator<Object> iterator() {
        Sequence<Object> sequence = this.f147281a;
        final Object[] objArr = this.f147282b;
        return SequencesKt___SequencesKt.C(sequence, new Function1() { // from class: nv.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SequencesKt___SequencesKt$minus$2.d(objArr, obj));
            }
        }).iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(Object[] objArr, Object obj) {
        return ArraysKt.Y(objArr, obj);
    }
}
