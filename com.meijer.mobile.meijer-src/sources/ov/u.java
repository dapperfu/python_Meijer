package ov;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import mv.C15819p;
import mv.h1;
import rv.AbstractC16947B;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lov/u;", "E", "Lmv/h1;", "Lmv/p;", "Lov/k;", "cont", "<init>", "(Lmv/p;)V", "Lrv/B;", "segment", "", "index", "", "b", "(Lrv/B;I)V", "a", "Lmv/p;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
final class u<E> implements h1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final C15819p<k<? extends E>> cont;

    @Override // mv.h1
    public void b(AbstractC16947B<?> segment, int index) {
        this.cont.b(segment, index);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(C15819p<? super k<? extends E>> c15819p) {
        this.cont = c15819p;
    }
}
