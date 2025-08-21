package com.google.android.gms.measurement.internal;

import Qd.InterfaceC4672d;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.h5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11280h5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f86441a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f86442b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f86443c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ B6 f86444d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f86445e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C11387w5 f86446f;

    RunnableC11280h5(C11387w5 c11387w5, AtomicReference atomicReference, String str, String str2, String str3, B6 b62, boolean z10) {
        this.f86441a = atomicReference;
        this.f86442b = str2;
        this.f86443c = str3;
        this.f86444d = b62;
        this.f86445e = z10;
        Objects.requireNonNull(c11387w5);
        this.f86446f = c11387w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C11387w5 c11387w5;
        InterfaceC4672d interfaceC4672dL;
        AtomicReference atomicReference2 = this.f86441a;
        synchronized (atomicReference2) {
            try {
                try {
                    c11387w5 = this.f86446f;
                    interfaceC4672dL = c11387w5.L();
                } catch (RemoteException e10) {
                    this.f86446f.f85708a.a().m().d("(legacy) Failed to get user properties; remote exception", null, this.f86442b, e10);
                    this.f86441a.set(Collections.EMPTY_LIST);
                    atomicReference = this.f86441a;
                }
                if (interfaceC4672dL == null) {
                    c11387w5.f85708a.a().m().d("(legacy) Failed to get user properties; not connected to service", null, this.f86442b, this.f86443c);
                    atomicReference2.set(Collections.EMPTY_LIST);
                    atomicReference2.notify();
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    B6 b62 = this.f86444d;
                    com.google.android.gms.common.internal.r.l(b62);
                    atomicReference2.set(interfaceC4672dL.M8(this.f86442b, this.f86443c, this.f86445e, b62));
                } else {
                    atomicReference2.set(interfaceC4672dL.W0(null, this.f86442b, this.f86443c, this.f86445e));
                }
                c11387w5.H();
                atomicReference = this.f86441a;
                atomicReference.notify();
            } catch (Throwable th2) {
                this.f86441a.notify();
                throw th2;
            }
        }
    }
}
