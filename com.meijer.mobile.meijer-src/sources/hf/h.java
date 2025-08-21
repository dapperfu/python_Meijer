package hf;

/* loaded from: classes8.dex */
abstract class h<E> extends k<E> {
    abstract i<E> q();

    h() {
    }

    @Override // hf.k, hf.i, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return q().contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return q().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return q().size();
    }
}
