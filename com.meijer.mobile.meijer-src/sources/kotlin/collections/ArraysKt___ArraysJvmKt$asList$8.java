package kotlin.collections;

import java.util.RandomAccess;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"kotlin/collections/ArraysKt___ArraysJvmKt$asList$8", "Lkotlin/collections/AbstractList;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "isEmpty", "()Z", "element", "k", "(C)Z", "", "index", "n", "(I)Ljava/lang/Character;", "o", "(C)I", "p", "f", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ArraysKt___ArraysJvmKt$asList$8 extends AbstractList<Character> implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ char[] f143389b;

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Character) {
            return k(((Character) obj).charValue());
        }
        return false;
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: f */
    public int getSize() {
        return this.f143389b.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Character) {
            return o(((Character) obj).charValue());
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f143389b.length == 0;
    }

    public boolean k(char element) {
        return ArraysKt___ArraysKt.V(this.f143389b, element);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Character) {
            return p(((Character) obj).charValue());
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Character get(int index) {
        return Character.valueOf(this.f143389b[index]);
    }

    public int o(char element) {
        return ArraysKt___ArraysKt.q0(this.f143389b, element);
    }

    public int p(char element) {
        return ArraysKt___ArraysKt.F0(this.f143389b, element);
    }
}
