package kotlin.collections;

import java.util.RandomAccess;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"kotlin/collections/ArraysKt___ArraysJvmKt$asList$3", "Lkotlin/collections/AbstractList;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "isEmpty", "()Z", "element", "k", "(I)Z", "index", "n", "(I)Ljava/lang/Integer;", "o", "(I)I", "p", "f", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ArraysKt___ArraysJvmKt$asList$3 extends AbstractList<Integer> implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int[] f143384b;

    ArraysKt___ArraysJvmKt$asList$3(int[] iArr) {
        this.f143384b = iArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Integer) {
            return k(((Number) obj).intValue());
        }
        return false;
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: f */
    public int getSize() {
        return this.f143384b.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Integer) {
            return o(((Number) obj).intValue());
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f143384b.length == 0;
    }

    public boolean k(int element) {
        return ArraysKt___ArraysKt.W(this.f143384b, element);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            return p(((Number) obj).intValue());
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Integer get(int index) {
        return Integer.valueOf(this.f143384b[index]);
    }

    public int o(int element) {
        return ArraysKt___ArraysKt.r0(this.f143384b, element);
    }

    public int p(int element) {
        return ArraysKt___ArraysKt.G0(this.f143384b, element);
    }
}
