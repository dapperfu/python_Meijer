package com.google.android.gms.measurement.internal;

import Od.InterfaceC4466d;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.f5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11139f5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f85550a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f85551b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f85552c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ B6 f85553d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C11262w5 f85554e;

    RunnableC11139f5(C11262w5 c11262w5, AtomicReference atomicReference, String str, String str2, String str3, B6 b62) {
        this.f85550a = atomicReference;
        this.f85551b = str2;
        this.f85552c = str3;
        this.f85553d = b62;
        Objects.requireNonNull(c11262w5);
        this.f85554e = c11262w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C11262w5 c11262w5;
        InterfaceC4466d interfaceC4466dL;
        AtomicReference atomicReference2 = this.f85550a;
        synchronized (atomicReference2) {
            try {
                try {
                    c11262w5 = this.f85554e;
                    interfaceC4466dL = c11262w5.L();
                } catch (RemoteException e10) {
                    this.f85554e.f84868a.a().m().d("(legacy) Failed to get conditional properties; remote exception", null, this.f85551b, e10);
                    this.f85550a.set(Collections.EMPTY_LIST);
                    atomicReference = this.f85550a;
                }
                if (interfaceC4466dL == null) {
                    c11262w5.f84868a.a().m().d("(legacy) Failed to get conditional properties; not connected to service", null, this.f85551b, this.f85552c);
                    atomicReference2.set(Collections.EMPTY_LIST);
                    atomicReference2.notify();
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    B6 b62 = this.f85553d;
                    com.google.android.gms.common.internal.r.l(b62);
                    atomicReference2.set(interfaceC4466dL.a9(this.f85551b, this.f85552c, b62));
                } else {
                    atomicReference2.set(interfaceC4466dL.e2(null, this.f85551b, this.f85552c));
                }
                c11262w5.H();
                atomicReference = this.f85550a;
                atomicReference.notify();
            } catch (Throwable th2) {
                this.f85550a.notify();
                throw th2;
            }
        }
    }
}
