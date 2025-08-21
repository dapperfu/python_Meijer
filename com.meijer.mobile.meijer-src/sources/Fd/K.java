package Fd;

import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
abstract class K implements InterfaceC3536v0 {

    /* renamed from: a, reason: collision with root package name */
    private transient Set f9298a;

    /* renamed from: b, reason: collision with root package name */
    private transient Map f9299b;

    abstract Map b();

    abstract Set c();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC3536v0) {
            return zzv().equals(((InterfaceC3536v0) obj).zzv());
        }
        return false;
    }

    @Override // Fd.InterfaceC3536v0
    public final Map zzv() {
        Map map = this.f9299b;
        if (map != null) {
            return map;
        }
        Map mapB = b();
        this.f9299b = mapB;
        return mapB;
    }

    @Override // Fd.InterfaceC3536v0
    public final Set zzw() {
        Set set = this.f9298a;
        if (set != null) {
            return set;
        }
        Set setC = c();
        this.f9298a = setC;
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
