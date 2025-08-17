package com.google.android.gms.measurement.internal;

import Od.InterfaceC4466d;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.h5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11155h5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f85601a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f85602b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f85603c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ B6 f85604d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f85605e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C11262w5 f85606f;

    RunnableC11155h5(C11262w5 c11262w5, AtomicReference atomicReference, String str, String str2, String str3, B6 b62, boolean z10) {
        this.f85601a = atomicReference;
        this.f85602b = str2;
        this.f85603c = str3;
        this.f85604d = b62;
        this.f85605e = z10;
        Objects.requireNonNull(c11262w5);
        this.f85606f = c11262w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C11262w5 c11262w5;
        InterfaceC4466d interfaceC4466dL;
        AtomicReference atomicReference2 = this.f85601a;
        synchronized (atomicReference2) {
            try {
                try {
                    c11262w5 = this.f85606f;
                    interfaceC4466dL = c11262w5.L();
                } catch (RemoteException e10) {
                    this.f85606f.f84868a.a().m().d("(legacy) Failed to get user properties; remote exception", null, this.f85602b, e10);
                    this.f85601a.set(Collections.EMPTY_LIST);
                    atomicReference = this.f85601a;
                }
                if (interfaceC4466dL == null) {
                    c11262w5.f84868a.a().m().d("(legacy) Failed to get user properties; not connected to service", null, this.f85602b, this.f85603c);
                    atomicReference2.set(Collections.EMPTY_LIST);
                    atomicReference2.notify();
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    B6 b62 = this.f85604d;
                    com.google.android.gms.common.internal.r.l(b62);
                    atomicReference2.set(interfaceC4466dL.S8(this.f85602b, this.f85603c, this.f85605e, b62));
                } else {
                    atomicReference2.set(interfaceC4466dL.U0(null, this.f85602b, this.f85603c, this.f85605e));
                }
                c11262w5.H();
                atomicReference = this.f85601a;
                atomicReference.notify();
            } catch (Throwable th2) {
                this.f85601a.notify();
                throw th2;
            }
        }
    }
}
