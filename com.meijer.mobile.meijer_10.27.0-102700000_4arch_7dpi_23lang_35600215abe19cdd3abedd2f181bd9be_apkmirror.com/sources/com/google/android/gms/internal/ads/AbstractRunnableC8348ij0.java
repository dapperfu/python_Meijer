package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.ij0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractRunnableC8348ij0 extends Bj0 implements Runnable {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f75000j = 0;

    /* renamed from: h, reason: collision with root package name */
    com.google.common.util.concurrent.q f75001h;

    /* renamed from: i, reason: collision with root package name */
    Object f75002i;

    abstract Object E(Object obj, Object obj2) throws Exception;

    abstract void F(Object obj);

    @Override // com.google.android.gms.internal.ads.AbstractC7495aj0
    protected final String e() {
        String str;
        com.google.common.util.concurrent.q qVar = this.f75001h;
        Object obj = this.f75002i;
        String strE = super.e();
        if (qVar != null) {
            str = "inputFuture=[" + qVar.toString() + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strE != null) {
                return str.concat(strE);
            }
            return null;
        }
        return str + "function=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7495aj0
    protected final void f() {
        u(this.f75001h);
        this.f75001h = null;
        this.f75002i = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.common.util.concurrent.q qVar = this.f75001h;
        Object obj = this.f75002i;
        if ((isCancelled() | (qVar == null)) || (obj == null)) {
            return;
        }
        this.f75001h = null;
        if (qVar.isCancelled()) {
            v(qVar);
            return;
        }
        try {
            try {
                Object objE = E(obj, Mj0.p(qVar));
                this.f75002i = null;
                F(objE);
            } catch (Throwable th2) {
                try {
                    C8137gk0.a(th2);
                    h(th2);
                } finally {
                    this.f75002i = null;
                }
            }
        } catch (Error e10) {
            h(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e11) {
            h(e11.getCause());
        } catch (Exception e12) {
            h(e12);
        }
    }

    AbstractRunnableC8348ij0(com.google.common.util.concurrent.q qVar, Object obj) {
        qVar.getClass();
        this.f75001h = qVar;
        this.f75002i = obj;
    }
}
