package kotlin;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@SinceKotlin
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0088\u0001\b\u0092\u0001\u00020\u0007¨\u0006-"}, d2 = {"Lkotlin/UByteArray;", "", "Lkotlin/UByte;", "", "size", "f", "(I)[B", "", PlaceTypes.STORAGE, "h", "([B)[B", "index", "q", "([BI)B", "value", "", "w", "([BIB)V", "", "v", "([B)Ljava/util/Iterator;", "element", "", "n", "([BB)Z", "elements", "o", "([BLjava/util/Collection;)Z", "u", "([B)Z", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "[B", "getStorage$annotations", "()V", "s", "([B)I", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ExperimentalUnsignedTypes
@JvmInline
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class UByteArray implements Collection<UByte>, KMappedMarker {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final byte[] storage;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lkotlin/UByteArray$a;", "", "Lkotlin/UByte;", "", "array", "<init>", "([B)V", "", "hasNext", "()Z", "a", "()B", "[B", "", "b", "I", "index", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a implements Iterator<UByte>, KMappedMarker {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final byte[] array;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public a(byte[] array) {
            Intrinsics.j(array, "array");
            this.array = array;
        }

        public byte a() {
            int i10 = this.index;
            byte[] bArr = this.array;
            if (i10 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            this.index = i10 + 1;
            return UByte.b(bArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ UByte next() {
            return UByte.a(a());
        }
    }

    public static final /* synthetic */ UByteArray a(byte[] bArr) {
        return new UByteArray(bArr);
    }

    @PublishedApi
    public static byte[] h(byte[] storage) {
        Intrinsics.j(storage, "storage");
        return storage;
    }

    public static boolean p(byte[] bArr, Object obj) {
        return (obj instanceof UByteArray) && Intrinsics.e(bArr, ((UByteArray) obj).getStorage());
    }

    public static int s(byte[] bArr) {
        return bArr.length;
    }

    public static int t(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static boolean u(byte[] bArr) {
        return bArr.length == 0;
    }

    public static String x(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(UByte uByte) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends UByte> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean equals(Object other) {
        return p(this.storage, other);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return t(this.storage);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.a(this);
    }

    public String toString() {
        return x(this.storage);
    }

    /* renamed from: y, reason: from getter */
    public final /* synthetic */ byte[] getStorage() {
        return this.storage;
    }

    public static byte[] f(int i10) {
        return h(new byte[i10]);
    }

    public static boolean o(byte[] bArr, Collection<UByte> elements) {
        Intrinsics.j(elements, "elements");
        Collection<UByte> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof UByte) || !ArraysKt.U(bArr, ((UByte) obj).getData())) {
                return false;
            }
        }
        return true;
    }

    public static final byte q(byte[] bArr, int i10) {
        return UByte.b(bArr[i10]);
    }

    public static Iterator<UByte> v(byte[] bArr) {
        return new a(bArr);
    }

    public static final void w(byte[] bArr, int i10, byte b10) {
        bArr[i10] = b10;
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UByte) {
            return k(((UByte) obj).getData());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        Intrinsics.j(elements, "elements");
        return o(this.storage, elements);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return u(this.storage);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<UByte> iterator() {
        return v(this.storage);
    }

    public boolean k(byte b10) {
        return n(this.storage, b10);
    }

    @Override // java.util.Collection
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int size() {
        return s(this.storage);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.j(array, "array");
        return (T[]) CollectionToArray.b(this, array);
    }

    @PublishedApi
    private /* synthetic */ UByteArray(byte[] bArr) {
        this.storage = bArr;
    }

    public static boolean n(byte[] bArr, byte b10) {
        return ArraysKt.U(bArr, b10);
    }
}
