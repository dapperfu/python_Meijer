package com.google.android.gms.internal.clearcut;

/* loaded from: classes6.dex */
final class A0 implements I0 {

    /* renamed from: a, reason: collision with root package name */
    private I0[] f81100a;

    A0(I0... i0Arr) {
        this.f81100a = i0Arr;
    }

    @Override // com.google.android.gms.internal.clearcut.I0
    public final boolean zza(Class<?> cls) {
        for (I0 i02 : this.f81100a) {
            if (i02.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.clearcut.I0
    public final H0 zzb(Class<?> cls) {
        for (I0 i02 : this.f81100a) {
            if (i02.zza(cls)) {
                return i02.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
