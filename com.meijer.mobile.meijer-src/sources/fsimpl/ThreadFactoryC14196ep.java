package fsimpl;

import java.util.concurrent.ThreadFactory;

/* renamed from: fsimpl.ep, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class ThreadFactoryC14196ep implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C14195eo f133426a;

    ThreadFactoryC14196ep(C14195eo c14195eo) {
        this.f133426a = c14195eo;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new fM(runnable, "fs-uploader");
    }
}
