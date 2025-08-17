package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes13.dex */
public class LazyStringArrayList extends AbstractList<String> implements RandomAccess, LazyStringList {

    /* renamed from: b, reason: collision with root package name */
    public static final LazyStringList f145884b = new LazyStringArrayList().J();

    /* renamed from: a, reason: collision with root package name */
    private final List<Object> f145885a;

    public LazyStringArrayList() {
        this.f145885a = new ArrayList();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    private static ByteString e(Object obj) {
        return obj instanceof ByteString ? (ByteString) obj : obj instanceof String ? ByteString.l((String) obj) : ByteString.h((byte[]) obj);
    }

    private static String f(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof ByteString ? ((ByteString) obj).z() : Internal.b((byte[]) obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public void C1(ByteString byteString) {
        this.f145885a.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public LazyStringList J() {
        return new UnmodifiableLazyStringList(this);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        this.f145885a.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends String> collection) {
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).g();
        }
        boolean zAddAll = this.f145885a.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f145885a.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public List<?> g() {
        return Collections.unmodifiableList(this.f145885a);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f145885a.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String strZ = byteString.z();
            if (byteString.q()) {
                this.f145885a.set(i10, strZ);
            }
            return strZ;
        }
        byte[] bArr = (byte[]) obj;
        String strB = Internal.b(bArr);
        if (Internal.a(bArr)) {
            this.f145885a.set(i10, strB);
        }
        return strB;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public ByteString j1(int i10) {
        Object obj = this.f145885a.get(i10);
        ByteString byteStringE = e(obj);
        if (byteStringE != obj) {
            this.f145885a.set(i10, byteStringE);
        }
        return byteStringE;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        Object objRemove = this.f145885a.remove(i10);
        ((AbstractList) this).modCount++;
        return f(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        return f(this.f145885a.set(i10, str));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f145885a.size();
    }

    public LazyStringArrayList(LazyStringList lazyStringList) {
        this.f145885a = new ArrayList(lazyStringList.size());
        addAll(lazyStringList);
    }
}
