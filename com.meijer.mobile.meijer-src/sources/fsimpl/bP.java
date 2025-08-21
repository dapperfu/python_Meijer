package fsimpl;

import com.fullstory.rust.RustInterface;
import okhttp3.Interceptor;

/* loaded from: classes15.dex */
public class bP implements Interceptor {

    /* renamed from: a, reason: collision with root package name */
    private final RustInterface f133020a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f133021b;

    public bP(RustInterface rustInterface, boolean z10) {
        this.f133020a = rustInterface;
        this.f133021b = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0052 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:24:0x0048, B:26:0x0052, B:27:0x0056, B:34:0x0069, B:37:0x006f, B:30:0x0060), top: B:41:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:24:0x0048, B:26:0x0052, B:27:0x0056, B:34:0x0069, B:37:0x006f, B:30:0x0060), top: B:41:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f A[Catch: all -> 0x0081, TRY_LEAVE, TryCatch #0 {all -> 0x0081, blocks: (B:24:0x0048, B:26:0x0052, B:27:0x0056, B:34:0x0069, B:37:0x006f, B:30:0x0060), top: B:41:0x0048 }] */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r19) throws java.io.IOException {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            okhttp3.Request r3 = r19.request()
            boolean r0 = fsimpl.C14118br.d()
            if (r0 != 0) goto L13
            okhttp3.Response r0 = r2.proceed(r3)
            return r0
        L13:
            r4 = 0
            r6 = 0
            okhttp3.HttpUrl r0 = r3.getUrl()     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L22
            java.lang.String r0 = r0.getUrl()     // Catch: java.lang.Throwable -> L3b
            r7 = r0
            goto L23
        L22:
            r7 = r6
        L23:
            java.lang.String r6 = r3.getMethod()     // Catch: java.lang.Throwable -> L37
            okhttp3.RequestBody r0 = r3.getBody()     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L32
            long r8 = r0.contentLength()     // Catch: java.lang.Throwable -> L37
            goto L33
        L32:
            r8 = r4
        L33:
            r13 = r8
            r9 = r6
            r8 = r7
            goto L40
        L37:
            r0 = move-exception
            r0 = r6
            r6 = r7
            goto L3d
        L3b:
            r0 = move-exception
            r0 = r6
        L3d:
            r9 = r0
            r13 = r4
            r8 = r6
        L40:
            long r6 = java.lang.System.nanoTime()
            okhttp3.Response r2 = r2.proceed(r3)
            long r10 = fsimpl.fS.a(r6)     // Catch: java.lang.Throwable -> L81
            okhttp3.ResponseBody r0 = r2.getBody()     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L56
            long r4 = r0.getContentLength()     // Catch: java.lang.Throwable -> L81
        L56:
            r15 = r4
            okhttp3.Response r0 = r2.getNetworkResponse()     // Catch: java.lang.Throwable -> L81
            r3 = 1
            if (r0 == 0) goto L60
            r0 = 1
            goto L69
        L60:
            okhttp3.Response r0 = r2.getCacheResponse()     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L68
            r0 = 2
            goto L69
        L68:
            r0 = 0
        L69:
            boolean r4 = r1.f133021b     // Catch: java.lang.Throwable -> L81
            if (r4 != 0) goto L6f
            if (r0 == r3) goto L82
        L6f:
            com.fullstory.rust.RustInterface r3 = r1.f133020a     // Catch: java.lang.Throwable -> L81
            fsimpl.fk r4 = new fsimpl.fk     // Catch: java.lang.Throwable -> L81
            int r12 = r2.getCode()     // Catch: java.lang.Throwable -> L81
            r7 = r4
            r17 = r0
            r7.<init>(r8, r9, r10, r12, r13, r15, r17)     // Catch: java.lang.Throwable -> L81
            r3.a(r4)     // Catch: java.lang.Throwable -> L81
            goto L82
        L81:
            r0 = move-exception
        L82:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: fsimpl.bP.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
