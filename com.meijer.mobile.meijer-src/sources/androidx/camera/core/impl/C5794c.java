package androidx.camera.core.impl;

import androidx.camera.core.impl.k;

/* renamed from: androidx.camera.core.impl.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5794c<T> extends k.a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f47584a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<T> f47585b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f47586c;

    public boolean equals(Object obj) {
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof k.a) {
            k.a aVar = (k.a) obj;
            if (this.f47584a.equals(aVar.c()) && this.f47585b.equals(aVar.e()) && ((obj2 = this.f47586c) != null ? obj2.equals(aVar.d()) : aVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.k.a
    public String c() {
        return this.f47584a;
    }

    @Override // androidx.camera.core.impl.k.a
    public Object d() {
        return this.f47586c;
    }

    @Override // androidx.camera.core.impl.k.a
    public Class<T> e() {
        return this.f47585b;
    }

    public int hashCode() {
        int iHashCode = (((this.f47584a.hashCode() ^ 1000003) * 1000003) ^ this.f47585b.hashCode()) * 1000003;
        Object obj = this.f47586c;
        return iHashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "Option{id=" + this.f47584a + ", valueClass=" + this.f47585b + ", token=" + this.f47586c + "}";
    }

    C5794c(String str, Class<T> cls, Object obj) {
        if (str != null) {
            this.f47584a = str;
            if (cls != null) {
                this.f47585b = cls;
                this.f47586c = obj;
                return;
            }
            throw new NullPointerException("Null valueClass");
        }
        throw new NullPointerException("Null id");
    }
}
