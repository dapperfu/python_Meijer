package fsimpl;

import java.util.concurrent.ThreadFactory;

/* renamed from: fsimpl.ep, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class ThreadFactoryC14071ep implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C14070eo f132176a;

    ThreadFactoryC14071ep(C14070eo c14070eo) {
        this.f132176a = c14070eo;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new fM(runnable, "fs-uploader");
    }
}
