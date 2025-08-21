package com.google.android.gms.measurement.internal;

import Qd.InterfaceC4672d;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.f5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11264f5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f86390a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f86391b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f86392c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ B6 f86393d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C11387w5 f86394e;

    RunnableC11264f5(C11387w5 c11387w5, AtomicReference atomicReference, String str, String str2, String str3, B6 b62) {
        this.f86390a = atomicReference;
        this.f86391b = str2;
        this.f86392c = str3;
        this.f86393d = b62;
        Objects.requireNonNull(c11387w5);
        this.f86394e = c11387w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C11387w5 c11387w5;
        InterfaceC4672d interfaceC4672dL;
        AtomicReference atomicReference2 = this.f86390a;
        synchronized (atomicReference2) {
            try {
                try {
                    c11387w5 = this.f86394e;
                    interfaceC4672dL = c11387w5.L();
                } catch (RemoteException e10) {
                    this.f86394e.f85708a.a().m().d("(legacy) Failed to get conditional properties; remote exception", null, this.f86391b, e10);
                    this.f86390a.set(Collections.EMPTY_LIST);
                    atomicReference = this.f86390a;
                }
                if (interfaceC4672dL == null) {
                    c11387w5.f85708a.a().m().d("(legacy) Failed to get conditional properties; not connected to service", null, this.f86391b, this.f86392c);
                    atomicReference2.set(Collections.EMPTY_LIST);
                    atomicReference2.notify();
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    B6 b62 = this.f86393d;
                    com.google.android.gms.common.internal.r.l(b62);
                    atomicReference2.set(interfaceC4672dL.c9(this.f86391b, this.f86392c, b62));
                } else {
                    atomicReference2.set(interfaceC4672dL.g2(null, this.f86391b, this.f86392c));
                }
                c11387w5.H();
                atomicReference = this.f86390a;
                atomicReference.notify();
            } catch (Throwable th2) {
                this.f86390a.notify();
                throw th2;
            }
        }
    }
}
