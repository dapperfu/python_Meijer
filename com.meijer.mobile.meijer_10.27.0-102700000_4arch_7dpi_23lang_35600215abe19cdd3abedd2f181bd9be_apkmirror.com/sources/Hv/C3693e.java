package Hv;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012*\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00050\u0002B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\f*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001a\u00020\u0014*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u0013\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u0018\u001a\u00020\u0014*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"LHv/e;", "E", "LHv/q;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "LDv/b;", "element", "<init>", "(LDv/b;)V", "v", "()Ljava/util/ArrayList;", "", "w", "(Ljava/util/ArrayList;)I", "A", "(Ljava/util/ArrayList;)Ljava/util/List;", "z", "(Ljava/util/List;)Ljava/util/ArrayList;", "size", "", "x", "(Ljava/util/ArrayList;I)V", "index", "y", "(Ljava/util/ArrayList;ILjava/lang/Object;)V", "LFv/f;", "b", "LFv/f;", "a", "()LFv/f;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* renamed from: Hv.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C3693e<E> extends AbstractC3710q<E, List<? extends E>, ArrayList<E>> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Fv.f descriptor;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.AbstractC3685a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public List<E> q(ArrayList<E> arrayList) {
        Intrinsics.j(arrayList, "<this>");
        return arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3693e(Dv.b<E> element) {
        super(element);
        Intrinsics.j(element, "element");
        this.descriptor = new C3691d(element.getDescriptor());
    }

    @Override // Hv.AbstractC3709p, Dv.b, Dv.h, Dv.a
    /* renamed from: a, reason: from getter */
    public Fv.f getDescriptor() {
        return this.descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.AbstractC3685a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public ArrayList<E> f() {
        return new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.AbstractC3685a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public int g(ArrayList<E> arrayList) {
        Intrinsics.j(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.AbstractC3685a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(ArrayList<E> arrayList, int i10) {
        Intrinsics.j(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.AbstractC3709p
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void s(ArrayList<E> arrayList, int i10, E e10) {
        Intrinsics.j(arrayList, "<this>");
        arrayList.add(i10, e10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.AbstractC3685a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public ArrayList<E> p(List<? extends E> list) {
        Intrinsics.j(list, "<this>");
        ArrayList<E> arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList<>(list) : arrayList;
    }
}
