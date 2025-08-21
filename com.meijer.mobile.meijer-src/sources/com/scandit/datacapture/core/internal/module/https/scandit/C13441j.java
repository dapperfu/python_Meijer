package com.scandit.datacapture.core.internal.module.https.scandit;

import com.scandit.datacapture.core.internal.module.https.NativeHttpsRequest;
import com.scandit.datacapture.core.internal.module.https.NativeHttpsSession;
import com.scandit.datacapture.core.internal.module.https.NativeHttpsSessionConfiguration;
import com.scandit.datacapture.core.internal.module.https.NativeHttpsSessionDelegate;
import com.scandit.datacapture.core.internal.module.https.NativeHttpsTask;
import com.scandit.datacapture.core.internal.module.https.trusts.AllowExpiredCertificatesTrustManager;
import com.scandit.datacapture.core.internal.module.https.trusts.ExtendedX509TrustManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.internal.module.https.scandit.j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13441j extends NativeHttpsSession {

    /* renamed from: a, reason: collision with root package name */
    public final NativeHttpsSessionConfiguration f125690a;

    /* renamed from: b, reason: collision with root package name */
    public final com.scandit.datacapture.core.internal.module.https.scandit.client.b f125691b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantReadWriteLock f125692c;

    /* renamed from: d, reason: collision with root package name */
    public NativeHttpsSessionDelegate f125693d;

    public C13441j(NativeHttpsSessionConfiguration config) {
        Intrinsics.j(config, "config");
        com.scandit.datacapture.core.internal.module.https.scandit.client.e client = new com.scandit.datacapture.core.internal.module.https.scandit.client.e(config);
        Intrinsics.j(config, "config");
        Intrinsics.j(client, "client");
        this.f125690a = config;
        this.f125691b = client;
        this.f125692c = new ReentrantReadWriteLock(true);
        com.scandit.datacapture.core.internal.module.https.scandit.interceptors.a interceptor = new com.scandit.datacapture.core.internal.module.https.scandit.interceptors.a(config.getAllowsCellularAccess());
        Intrinsics.j(interceptor, "interceptor");
        client.f125674g.add(interceptor);
        com.scandit.datacapture.core.internal.module.https.scandit.listeners.a listener = new com.scandit.datacapture.core.internal.module.https.scandit.listeners.a(this);
        Intrinsics.j(listener, "listener");
        client.f125673f.add(listener);
    }

    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsSession
    public final NativeHttpsSessionConfiguration getConfiguration() {
        return this.f125690a;
    }

    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsSession
    public final NativeHttpsSessionDelegate getDelegate() {
        ReentrantReadWriteLock.ReadLock lock = this.f125692c.readLock();
        lock.lock();
        try {
            return this.f125693d;
        } finally {
            lock.unlock();
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsSession
    public final void setDelegate(NativeHttpsSessionDelegate nativeHttpsSessionDelegate) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f125692c;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i11 = 0; i11 < readHoldCount; i11++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.f125693d = nativeHttpsSessionDelegate;
            Unit unit = Unit.f143329a;
        } finally {
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsSession
    public final void shouldAllowExpiredCertificates(boolean z10) {
        ExtendedX509TrustManager[] extendedX509TrustManagerArr = (ExtendedX509TrustManager[]) ((M) ((O) ((com.scandit.datacapture.core.internal.module.https.scandit.client.e) this.f125691b).f125672e).f125650a).f125648a.getValue();
        ArrayList arrayList = new ArrayList();
        for (ExtendedX509TrustManager extendedX509TrustManager : extendedX509TrustManagerArr) {
            if (extendedX509TrustManager instanceof AllowExpiredCertificatesTrustManager) {
                arrayList.add(extendedX509TrustManager);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AllowExpiredCertificatesTrustManager) it.next()).a(z10);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsSession
    public final NativeHttpsTask startRequest(NativeHttpsRequest nativeHttpsRequest) {
        Intrinsics.j(nativeHttpsRequest, "request");
        com.scandit.datacapture.core.internal.module.https.scandit.client.e eVar = (com.scandit.datacapture.core.internal.module.https.scandit.client.e) this.f125691b;
        eVar.getClass();
        Intrinsics.j(nativeHttpsRequest, "nativeHttpsRequest");
        I i10 = new I(((com.scandit.datacapture.core.internal.module.https.scandit.client.a) eVar.f125670c).f125665a.getAndIncrement(), nativeHttpsRequest, (O) eVar.f125672e, eVar.f125675h);
        ((com.scandit.datacapture.core.internal.module.https.scandit.client.e) this.f125691b).a(i10);
        return i10;
    }
}
