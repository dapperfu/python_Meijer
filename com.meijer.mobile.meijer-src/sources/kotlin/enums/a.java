package kotlin.enums;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@SinceKotlin
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lkotlin/enums/a;", "", "T", "Lkotlin/enums/EnumEntries;", "Lkotlin/collections/AbstractList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "entries", "<init>", "([Ljava/lang/Enum;)V", "", "index", "n", "(I)Ljava/lang/Enum;", "element", "", "k", "(Ljava/lang/Enum;)Z", "o", "(Ljava/lang/Enum;)I", "p", "b", "[Ljava/lang/Enum;", "f", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
final class a<T extends Enum<T>> extends AbstractList<T> implements EnumEntries<T>, Serializable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final T[] entries;

    public a(T[] entries) {
        Intrinsics.j(entries, "entries");
        this.entries = entries;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return k((Enum) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: f */
    public int getSize() {
        return this.entries.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return o((Enum) obj);
        }
        return -1;
    }

    public boolean k(T element) {
        Intrinsics.j(element, "element");
        return ((Enum) ArraysKt.o0(this.entries, element.ordinal())) == element;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return p((Enum) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public T get(int index) {
        AbstractList.INSTANCE.b(index, this.entries.length);
        return this.entries[index];
    }

    public int o(T element) {
        Intrinsics.j(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) ArraysKt.o0(this.entries, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    public int p(T element) {
        Intrinsics.j(element, "element");
        return indexOf(element);
    }
}
