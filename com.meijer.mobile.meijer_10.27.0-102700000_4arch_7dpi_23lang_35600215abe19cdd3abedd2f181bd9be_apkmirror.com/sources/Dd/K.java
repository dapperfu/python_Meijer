package Dd;

import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
abstract class K implements InterfaceC3314v0 {

    /* renamed from: a, reason: collision with root package name */
    private transient Set f5265a;

    /* renamed from: b, reason: collision with root package name */
    private transient Map f5266b;

    abstract Map b();

    abstract Set c();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC3314v0) {
            return zzv().equals(((InterfaceC3314v0) obj).zzv());
        }
        return false;
    }

    @Override // Dd.InterfaceC3314v0
    public final Map zzv() {
        Map map = this.f5266b;
        if (map != null) {
            return map;
        }
        Map mapB = b();
        this.f5266b = mapB;
        return mapB;
    }

    @Override // Dd.InterfaceC3314v0
    public final Set zzw() {
        Set set = this.f5265a;
        if (set != null) {
            return set;
        }
        Set setC = c();
        this.f5265a = setC;
        return setC;
    }

    K() {
    }

    public final int hashCode() {
        return zzv().hashCode();
    }

    public final String toString() {
        return zzv().toString();
    }
}
