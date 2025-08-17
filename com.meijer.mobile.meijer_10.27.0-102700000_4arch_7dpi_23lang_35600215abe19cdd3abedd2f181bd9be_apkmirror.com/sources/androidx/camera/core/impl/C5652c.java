package androidx.camera.core.impl;

import androidx.camera.core.impl.k;

/* renamed from: androidx.camera.core.impl.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5652c<T> extends k.a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f47360a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<T> f47361b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f47362c;

    public boolean equals(Object obj) {
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof k.a) {
            k.a aVar = (k.a) obj;
            if (this.f47360a.equals(aVar.c()) && this.f47361b.equals(aVar.e()) && ((obj2 = this.f47362c) != null ? obj2.equals(aVar.d()) : aVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.k.a
    public String c() {
        return this.f47360a;
    }

    @Override // androidx.camera.core.impl.k.a
    public Object d() {
        return this.f47362c;
    }

    @Override // androidx.camera.core.impl.k.a
    public Class<T> e() {
        return this.f47361b;
    }

    public int hashCode() {
        int iHashCode = (((this.f47360a.hashCode() ^ 1000003) * 1000003) ^ this.f47361b.hashCode()) * 1000003;
        Object obj = this.f47362c;
        return iHashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "Option{id=" + this.f47360a + ", valueClass=" + this.f47361b + ", token=" + this.f47362c + "}";
    }

    C5652c(String str, Class<T> cls, Object obj) {
        if (str != null) {
            this.f47360a = str;
            if (cls != null) {
                this.f47361b = cls;
                this.f47362c = obj;
                return;
            }
            throw new NullPointerException("Null valueClass");
        }
        throw new NullPointerException("Null id");
    }
}
