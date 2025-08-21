package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.j0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8506j0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8401i0 f76155a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f76156b = new AtomicBoolean(false);

    public final InterfaceC9255q0 a(Object... objArr) {
        Constructor constructorZza;
        synchronized (this.f76156b) {
            if (!this.f76156b.get()) {
                try {
                    constructorZza = this.f76155a.zza();
                } catch (ClassNotFoundException unused) {
                    this.f76156b.set(true);
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
            return (InterfaceC9255q0) constructorZza.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }

    public C8506j0(InterfaceC8401i0 interfaceC8401i0) {
        this.f76155a = interfaceC8401i0;
    }
}
