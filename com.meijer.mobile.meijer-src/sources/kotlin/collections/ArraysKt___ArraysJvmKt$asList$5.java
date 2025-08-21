package kotlin.collections;

import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"kotlin/collections/ArraysKt___ArraysJvmKt$asList$5", "Lkotlin/collections/AbstractList;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "isEmpty", "()Z", "element", "k", "(F)Z", "", "index", "n", "(I)Ljava/lang/Float;", "o", "(F)I", "p", "f", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class ArraysKt___ArraysJvmKt$asList$5 extends AbstractList<Float> implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float[] f143386b;

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Float) {
            return k(((Number) obj).floatValue());
        }
        return false;
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: f */
    public int get_size() {
        return this.f143386b.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Float) {
            return o(((Number) obj).floatValue());
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f143386b.length == 0;
    }

    public boolean k(float element) {
        for (float f10 : this.f143386b) {
            if (Float.floatToIntBits(f10) == Float.floatToIntBits(element)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Float) {
            return p(((Number) obj).floatValue());
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Float get(int index) {
        return Float.valueOf(this.f143386b[index]);
    }

    public int o(float element) {
        float[] fArr = this.f143386b;
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (Float.floatToIntBits(fArr[i10]) == Float.floatToIntBits(element)) {
                return i10;
            }
        }
        return -1;
    }

    public int p(float element) {
        float[] fArr = this.f143386b;
        int length = fArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(element)) {
                    return length;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
        }
        return -1;
    }
}
