package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.j0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8381j0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8276i0 f75315a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f75316b = new AtomicBoolean(false);

    public final InterfaceC9130q0 a(Object... objArr) {
        Constructor constructorZza;
        synchronized (this.f75316b) {
            if (!this.f75316b.get()) {
                try {
                    constructorZza = this.f75315a.zza();
                } catch (ClassNotFoundException unused) {
                    this.f75316b.set(true);
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
            constructorZza = null;
        }
        if (constructorZza == null) {
            return null;
        }
        try {
            return (InterfaceC9130q0) constructorZza.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }

    public C8381j0(InterfaceC8276i0 interfaceC8276i0) {
        this.f75315a = interfaceC8276i0;
    }
}
