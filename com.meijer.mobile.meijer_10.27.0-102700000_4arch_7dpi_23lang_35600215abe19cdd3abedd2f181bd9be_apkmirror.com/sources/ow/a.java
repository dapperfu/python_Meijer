package ow;

import java.lang.reflect.Array;
import java.util.Iterator;

/* loaded from: classes13.dex */
public class a implements Iterator<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f155256a;

    /* renamed from: b, reason: collision with root package name */
    private int f155257b = 0;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f155257b < Array.getLength(this.f155256a);
    }

    @Override // java.util.Iterator
    public Object next() {
        Object obj = this.f155256a;
        int i10 = this.f155257b;
        this.f155257b = i10 + 1;
        return Array.get(obj, i10);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("cannot remove items from an array");
    }

    public a(Object obj) {
        if (obj.getClass().isArray()) {
            this.f155256a = obj;
            return;
        }
        throw new IllegalArgumentException("not an array");
    }
}
