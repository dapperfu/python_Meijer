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
/* loaded from: classes11.dex */
public final class C13308j extends NativeHttpsSession {

    /* renamed from: a, reason: collision with root package name */
    public final NativeHttpsSessionConfiguration f124738a;

    /* renamed from: b, reason: collision with root package name */
    public final com.scandit.datacapture.core.internal.module.https.scandit.client.b f124739b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantReadWriteLock f124740c;

    /* renamed from: d, reason: collision with root package name */
    public NativeHttpsSessionDelegate f124741d;

    public C13308j(NativeHttpsSessionConfiguration config) {
        Intrinsics.j(config, "config");
        com.scandit.datacapture.core.internal.module.https.scandit.client.e client = new com.scandit.datacapture.core.internal.module.https.scandit.client.e(config);
        Intrinsics.j(config, "config");
        Intrinsics.j(client, "client");
        this.f124738a = config;
        this.f124739b = client;
        this.f124740c = new ReentrantReadWriteLock(true);
        com.scandit.datacapture.core.internal.module.https.scandit.interceptors.a interceptor = new com.scandit.datacapture.core.internal.module.https.scandit.interceptors.a(config.getAllowsCellularAccess());
        Intrinsics.j(interceptor, "interceptor");
        client.f124722g.add(interceptor);
        com.scandit.datacapture.core.internal.module.https.scandit.listeners.a listener = new com.scandit.datacapture.core.internal.module.https.scandit.listeners.a(this);
        Intrinsics.j(listener, "listener");
        client.f124721f.add(listener);
    }

    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsSession
    public final NativeHttpsSessionConfiguration getConfiguration() {
        return this.f124738a;
    }

    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsSession
    public final NativeHttpsSessionDelegate getDelegate() {
        ReentrantReadWriteLock.ReadLock lock = this.f124740c.readLock();
        lock.lock();
        try {
            return this.f124741d;
        } finally {
            lock.unlock();
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsSession
    public final void setDelegate(NativeHttpsSessionDelegate nativeHttpsSessionDelegate) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f124740c;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i11 = 0; i11 < readHoldCount; i11++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.f124741d = nativeHttpsSessionDelegate;
            Unit unit = Unit.f142422a;
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
        ExtendedX509TrustManager[] extendedX509TrustManagerArr = (ExtendedX509TrustManager[]) ((M) ((O) ((com.scandit.datacapture.core.internal.module.https.scandit.client.e) this.f124739b).f124720e).f124698a).f124696a.getValue();
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
        com.scandit.datacapture.core.internal.module.https.scandit.client.e eVar = (com.scandit.datacapture.core.internal.module.https.scandit.client.e) this.f124739b;
        eVar.getClass();
        Intrinsics.j(nativeHttpsRequest, "nativeHttpsRequest");
        I i10 = new I(((com.scandit.datacapture.core.internal.module.https.scandit.client.a) eVar.f124718c).f124713a.getAndIncrement(), nativeHttpsRequest, (O) eVar.f124720e, eVar.f124723h);
        ((com.scandit.datacapture.core.internal.module.https.scandit.client.e) this.f124739b).a(i10);
        return i10;
    }
}
