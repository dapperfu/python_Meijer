package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* loaded from: classes6.dex */
abstract class Oi0 extends Bj0 implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    com.google.common.util.concurrent.q f69158h;

    /* renamed from: i, reason: collision with root package name */
    Class f69159i;

    /* renamed from: j, reason: collision with root package name */
    Object f69160j;

    abstract Object E(Object obj, Throwable th2) throws Exception;

    abstract void F(Object obj);

    @Override // com.google.android.gms.internal.ads.AbstractC7495aj0
    protected final String e() {
        String str;
        com.google.common.util.concurrent.q qVar = this.f69158h;
        Class cls = this.f69159i;
        Object obj = this.f69160j;
        String strE = super.e();
        if (qVar != null) {
            str = "inputFuture=[" + qVar.toString() + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strE != null) {
                return str.concat(strE);
            }
            return null;
        }
        return str + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7495aj0
    protected final void f() {
        u(this.f69158h);
        this.f69158h = null;
        this.f69159i = null;
        this.f69160j = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        com.google.common.util.concurrent.q qVar = this.f69158h;
        Class cls = this.f69159i;
        Object obj = this.f69160j;
        if (((obj == null) || ((qVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.f69158h = null;
        try {
            th = qVar instanceof AbstractC9205qk0 ? ((AbstractC9205qk0) qVar).a() : null;
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + String.valueOf(qVar.getClass()) + " threw " + String.valueOf(e10.getClass()) + " without a cause");
            }
            th = cause;
        } catch (Throwable th2) {
            th = th2;
        }
        Object objP = th == null ? Mj0.p(qVar) : null;
        if (th == null) {
            g(objP);
            return;
        }
        if (!cls.isInstance(th)) {
            v(qVar);
            return;
        }
        try {
            Object objE = E(obj, th);
            this.f69159i = null;
            this.f69160j = null;
            F(objE);
        } catch (Throwable th3) {
            try {
                C8137gk0.a(th3);
                h(th3);
            } finally {
                this.f69159i = null;
                this.f69160j = null;
            }
        }
    }

    Oi0(com.google.common.util.concurrent.q qVar, Class cls, Object obj) {
        qVar.getClass();
        this.f69158h = qVar;
        this.f69159i = cls;
        this.f69160j = obj;
    }
}
