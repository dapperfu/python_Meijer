package kotlin.text;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractCollection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.SequencesKt;
import kotlin.text.MatcherMatchResult$groups$1;

@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"kotlin/text/MatcherMatchResult$groups$1", "Lkotlin/text/MatchNamedGroupCollection;", "Lkotlin/collections/AbstractCollection;", "Lkotlin/text/MatchGroup;", "", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "index", "get", "(I)Lkotlin/text/MatchGroup;", "f", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MatcherMatchResult$groups$1 extends AbstractCollection<MatchGroup> implements MatchNamedGroupCollection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MatcherMatchResult f147457a;

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return false;
    }

    MatcherMatchResult$groups$1(MatcherMatchResult matcherMatchResult) {
        this.f147457a = matcherMatchResult;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof MatchGroup) {
            return n((MatchGroup) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: f */
    public int getSize() {
        return this.f147457a.f().groupCount() + 1;
    }

    @Override // kotlin.text.MatchGroupCollection
    public MatchGroup get(int index) {
        IntRange intRangeI = RegexKt.i(this.f147457a.f(), index);
        if (intRangeI.getStart().intValue() < 0) {
            return null;
        }
        String strGroup = this.f147457a.f().group(index);
        Intrinsics.i(strGroup, "group(...)");
        return new MatchGroup(strGroup, intRangeI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchGroup o(MatcherMatchResult$groups$1 matcherMatchResult$groups$1, int i10) {
        return matcherMatchResult$groups$1.get(i10);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<MatchGroup> iterator() {
        return SequencesKt.M(CollectionsKt.f0(CollectionsKt.n(this)), new Function1() { // from class: ov.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatcherMatchResult$groups$1.o(this.f155252a, ((Integer) obj).intValue());
            }
        }).iterator();
    }

    public /* bridge */ boolean n(MatchGroup matchGroup) {
        return super.contains(matchGroup);
    }
}
