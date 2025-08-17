package com.scandit.datacapture.core.internal.module.https.scandit;

import com.scandit.datacapture.core.internal.module.https.NativeHttpsError;
import com.scandit.datacapture.core.internal.module.https.NativeHttpsMethod;
import com.scandit.datacapture.core.internal.module.https.NativeHttpsRequest;
import com.scandit.datacapture.core.internal.module.https.NativeHttpsResponse;
import com.scandit.datacapture.core.internal.module.https.NativeHttpsTaskState;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.net.ssl.HttpsURLConnection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class I extends AbstractC13309k {

    /* renamed from: a, reason: collision with root package name */
    public final int f124687a;

    /* renamed from: b, reason: collision with root package name */
    public final NativeHttpsRequest f124688b;

    /* renamed from: c, reason: collision with root package name */
    public final S f124689c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC13302d f124690d;

    /* renamed from: e, reason: collision with root package name */
    public final Y f124691e;

    /* renamed from: f, reason: collision with root package name */
    public final ReentrantReadWriteLock f124692f;

    /* renamed from: g, reason: collision with root package name */
    public l0 f124693g;

    @Override // com.scandit.datacapture.core.internal.module.https.scandit.AbstractC13309k
    public final void a(C13319v exception) {
        Intrinsics.j(exception, "exception");
        ReentrantReadWriteLock reentrantReadWriteLock = this.f124692f;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i11 = 0; i11 < readHoldCount; i11++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            a((Throwable) exception);
            Unit unit = Unit.f142422a;
        } finally {
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
        }
    }

    public I(int i10, NativeHttpsRequest nativeRequest, O sslSocketHandler, Y y10) {
        Intrinsics.j(nativeRequest, "nativeRequest");
        Intrinsics.j(sslSocketHandler, "sslSocketHandler");
        String url = nativeRequest.getUrl();
        Intrinsics.i(url, "getUrl(...)");
        NativeHttpsMethod method = nativeRequest.getMethod();
        Intrinsics.i(method, "getMethod(...)");
        HashMap<String, String> headers = nativeRequest.getHeaders();
        Intrinsics.i(headers, "getHeaders(...)");
        C13307i taskBackend = new C13307i(new C13301c(url, method, headers, sslSocketHandler));
        C13303e headerParser = new C13303e();
        Intrinsics.j(nativeRequest, "nativeRequest");
        Intrinsics.j(taskBackend, "taskBackend");
        Intrinsics.j(headerParser, "headerParser");
        this.f124687a = i10;
        this.f124688b = nativeRequest;
        this.f124689c = taskBackend;
        this.f124690d = headerParser;
        this.f124691e = y10;
        this.f124692f = new ReentrantReadWriteLock(true);
        this.f124693g = k0.f124742a;
        b();
    }

    public final void b() {
        Y y10 = this.f124691e;
        if (y10 != null) {
            y10.a(new V(this, this.f124693g));
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsTask
    public final void cancel() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f124692f;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i11 = 0; i11 < readHoldCount; i11++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            l0 l0Var = this.f124693g;
            g0 g0Var = g0.f124731a;
            if ((l0Var instanceof g0) || (l0Var instanceof j0)) {
                Y y10 = this.f124691e;
                if (y10 != null) {
                    y10.a(new W(this, l0Var, g0Var));
                }
            } else {
                a();
                this.f124693g = g0Var;
                b();
            }
            Unit unit = Unit.f142422a;
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
        } catch (Throwable th2) {
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
            throw th2;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsTask
    public final NativeHttpsError getError() {
        ReentrantReadWriteLock.ReadLock lock = this.f124692f.readLock();
        lock.lock();
        try {
            l0 l0Var = this.f124693g;
            NativeHttpsError nativeHttpsError = ((l0Var instanceof h0) || (l0Var instanceof g0)) ? new NativeHttpsError() : null;
            lock.unlock();
            return nativeHttpsError;
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsTask
    public final int getId() {
        return this.f124687a;
    }

    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsTask
    public final float getProgress() {
        float f10;
        ReentrantReadWriteLock.ReadLock lock = this.f124692f.readLock();
        lock.lock();
        try {
            l0 l0Var = this.f124693g;
            if (l0Var instanceof k0) {
                f10 = 0.0f;
            } else if (l0Var instanceof f0) {
                f10 = ((f0) l0Var).f124730a;
            } else {
                if (!(l0Var instanceof j0 ? true : l0Var instanceof g0)) {
                    throw new NoWhenBranchMatchedException();
                }
                f10 = 1.0f;
            }
            return f10;
        } finally {
            lock.unlock();
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsTask
    public final NativeHttpsRequest getRequest() {
        return this.f124688b;
    }

    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsTask
    public final NativeHttpsResponse getResponse() {
        ReentrantReadWriteLock.ReadLock lock = this.f124692f.readLock();
        lock.lock();
        try {
            l0 l0Var = this.f124693g;
            return l0Var instanceof i0 ? ((i0) l0Var).f124735a : null;
        } finally {
            lock.unlock();
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsTask
    public final NativeHttpsTaskState getState() {
        NativeHttpsTaskState nativeHttpsTaskState;
        ReentrantReadWriteLock.ReadLock lock = this.f124692f.readLock();
        lock.lock();
        try {
            l0 l0Var = this.f124693g;
            if (l0Var instanceof k0 ? true : l0Var instanceof f0) {
                nativeHttpsTaskState = NativeHttpsTaskState.ACTIVE;
            } else if (l0Var instanceof j0) {
                nativeHttpsTaskState = NativeHttpsTaskState.COMPLETED;
            } else {
                if (!(l0Var instanceof g0)) {
                    throw new NoWhenBranchMatchedException();
                }
                nativeHttpsTaskState = NativeHttpsTaskState.CANCELLED;
            }
            lock.unlock();
            return nativeHttpsTaskState;
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsTask
    public final void start() {
        ReentrantReadWriteLock.ReadLock lock;
        l0 l0Var;
        try {
            lock = this.f124692f.readLock();
            lock.lock();
            try {
                l0Var = this.f124693g;
            } finally {
                lock.unlock();
            }
        } catch (C13310l unused) {
        } catch (Throwable th2) {
            try {
                ReentrantReadWriteLock reentrantReadWriteLock = this.f124692f;
                ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
                int i10 = 0;
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i11 = 0; i11 < readHoldCount; i11++) {
                    lock2.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    a(th2);
                    Unit unit = Unit.f142422a;
                    while (i10 < readHoldCount) {
                        lock2.lock();
                        i10++;
                    }
                    writeLock.unlock();
                } catch (Throwable th3) {
                    while (i10 < readHoldCount) {
                        lock2.lock();
                        i10++;
                    }
                    writeLock.unlock();
                    throw th3;
                }
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
        if (!(l0Var instanceof k0)) {
            Z z10 = Z.f124703b;
            Y y10 = this.f124691e;
            if (y10 != null) {
                y10.a(new W(this, l0Var, z10));
            }
            a();
            return;
        }
        Unit unit2 = Unit.f142422a;
        lock.unlock();
        a(this.f124692f, new E(this));
        ((C13307i) this.f124689c).a();
        OutputStream outputStreamC = ((C13307i) this.f124689c).c();
        if (outputStreamC != null) {
            a(this.f124692f, new F(this));
            try {
                outputStreamC.write(this.f124688b.getBody());
                outputStreamC.flush();
                CloseableKt.a(outputStreamC, null);
            } finally {
            }
        }
        a(this.f124692f, new G(this));
        a(this.f124692f, new H(this, ((C13303e) this.f124690d).a(((C13307i) this.f124689c).b())));
        a();
    }

    public final void a(Throwable th2) {
        D c13318u;
        D d10;
        l0 l0Var = this.f124693g;
        if (th2 instanceof D) {
            d10 = (D) th2;
        } else {
            if (th2 instanceof ProtocolException) {
                c13318u = new C(th2);
            } else if (th2 instanceof SocketTimeoutException) {
                c13318u = new C13317t(th2);
            } else {
                c13318u = th2 instanceof IOException ? new C13318u(th2) : new C13323z(th2);
            }
            d10 = c13318u;
        }
        h0 h0Var = new h0(d10);
        if (!(l0Var instanceof g0)) {
            this.f124693g = h0Var;
            b();
        } else {
            Y y10 = this.f124691e;
            if (y10 != null) {
                y10.a(new W(this, l0Var, h0Var));
            }
        }
    }

    public final void a(ReentrantReadWriteLock reentrantReadWriteLock, Function0 function0) {
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i11 = 0; i11 < readHoldCount; i11++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            ReentrantReadWriteLock.ReadLock lock2 = this.f124692f.readLock();
            lock2.lock();
            try {
                if (!(this.f124693g instanceof g0)) {
                    Unit unit = Unit.f142422a;
                    lock2.unlock();
                    function0.invoke();
                    return;
                }
                throw C13310l.f124743a;
            } catch (Throwable th2) {
                lock2.unlock();
                throw th2;
            }
        } finally {
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
        }
    }

    public final void a() {
        try {
            C13307i c13307i = (C13307i) this.f124689c;
            c13307i.getClass();
            try {
                ((HttpsURLConnection) c13307i.f124734b.getValue()).disconnect();
            } catch (IOException e10) {
                throw new C13311m(e10);
            }
        } catch (Throwable unused) {
        }
    }
}
