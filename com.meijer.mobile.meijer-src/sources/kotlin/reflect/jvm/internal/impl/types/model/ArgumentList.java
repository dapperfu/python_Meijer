package kotlin.reflect.jvm.internal.impl.types.model;

import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class ArgumentList extends ArrayList<TypeArgumentMarker> implements TypeArgumentListMarker {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof TypeArgumentMarker) {
            return a((TypeArgumentMarker) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof TypeArgumentMarker) {
            return f((TypeArgumentMarker) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof TypeArgumentMarker) {
            return k((TypeArgumentMarker) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof TypeArgumentMarker) {
            return l((TypeArgumentMarker) obj);
        }
        return false;
    }

    public ArgumentList(int i10) {
        super(i10);
    }

    public /* bridge */ boolean a(TypeArgumentMarker typeArgumentMarker) {
        return super.contains(typeArgumentMarker);
    }

    public /* bridge */ int e() {
        return super.size();
    }

    public /* bridge */ int f(TypeArgumentMarker typeArgumentMarker) {
        return super.indexOf(typeArgumentMarker);
    }

    public /* bridge */ int k(TypeArgumentMarker typeArgumentMarker) {
        return super.lastIndexOf(typeArgumentMarker);
    }

    public /* bridge */ boolean l(TypeArgumentMarker typeArgumentMarker) {
        return super.remove(typeArgumentMarker);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return e();
    }
}
