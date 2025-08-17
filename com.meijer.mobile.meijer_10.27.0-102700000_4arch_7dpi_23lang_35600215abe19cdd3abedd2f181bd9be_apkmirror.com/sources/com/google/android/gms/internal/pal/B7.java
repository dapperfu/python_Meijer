package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
final class B7 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f82491b = Logger.getLogger(B7.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f82492a;

    B7() {
        this.f82492a = new ConcurrentHashMap();
    }

    private final synchronized A7 g(String str) throws GeneralSecurityException {
        if (!this.f82492a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (A7) this.f82492a.get(str);
    }

    private final synchronized void h(A7 a72, boolean z10) throws GeneralSecurityException {
        try {
            String strZzf = a72.zzb().zzf();
            A7 a73 = (A7) this.f82492a.get(strZzf);
            if (a73 != null && !a73.zzc().equals(a72.zzc())) {
                f82491b.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(strZzf));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strZzf, a73.zzc().getName(), a72.zzc().getName()));
            }
            if (z10) {
                this.f82492a.put(strZzf, a72);
            } else {
                this.f82492a.putIfAbsent(strZzf, a72);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final synchronized void c(AbstractC10843pa abstractC10843pa, Y9 y92) throws GeneralSecurityException {
        Class clsZzd;
        try {
            int iF = y92.f();
            if (!W8.a(1)) {
                throw new GeneralSecurityException("failed to register key manager " + String.valueOf(abstractC10843pa.getClass()) + " as it is not FIPS compatible.");
            }
            if (!W8.a(iF)) {
                throw new GeneralSecurityException("failed to register key manager " + String.valueOf(y92.getClass()) + " as it is not FIPS compatible.");
            }
            String strD = abstractC10843pa.d();
            String strD2 = y92.d();
            if (this.f82492a.containsKey(strD) && ((A7) this.f82492a.get(strD)).zzd() != null && (clsZzd = ((A7) this.f82492a.get(strD)).zzd()) != null && !clsZzd.getName().equals(y92.getClass().getName())) {
                f82491b.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + strD + " with inconsistent public key type " + strD2);
                throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", abstractC10843pa.getClass().getName(), clsZzd.getName(), y92.getClass().getName()));
            }
            h(new C10999z7(abstractC10843pa, y92), true);
            h(new C10983y7(y92), false);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final synchronized void d(InterfaceC10919u7 interfaceC10919u7) throws GeneralSecurityException {
        if (!W8.a(1)) {
            throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
        }
        h(new C10967x7(interfaceC10919u7), false);
    }

    final synchronized void e(Y9 y92) throws GeneralSecurityException {
        if (!W8.a(y92.f())) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(y92.getClass()) + " as it is not FIPS compatible.");
        }
        h(new C10983y7(y92), false);
    }

    B7(B7 b72) {
        this.f82492a = new ConcurrentHashMap(b72.f82492a);
    }

    final boolean f(String str) {
        return this.f82492a.containsKey(str);
    }

    final InterfaceC10919u7 a(String str, Class cls) throws GeneralSecurityException {
        A7 a7G = g(str);
        if (a7G.zze().contains(cls)) {
            return a7G.zza(cls);
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(a7G.zzc());
        Set<Class> setZze = a7G.zze();
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Class cls2 : setZze) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(cls2.getCanonicalName());
            z10 = false;
        }
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + strValueOf + ", supported primitives: " + sb2.toString());
    }

    final InterfaceC10919u7 b(String str) throws GeneralSecurityException {
        return g(str).zzb();
    }
}
