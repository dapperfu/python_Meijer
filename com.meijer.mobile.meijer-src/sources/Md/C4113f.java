package Md;

import android.content.Context;

/* renamed from: Md.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4113f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19760a = "f";

    /* renamed from: b, reason: collision with root package name */
    private static boolean f19761b;

    /* renamed from: c, reason: collision with root package name */
    private static a f19762c = a.LEGACY;

    /* renamed from: Md.f$a */
    public enum a {
        LEGACY,
        LATEST
    }

    public static synchronized int a(Context context) {
        return b(context, null, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:46|11|44|12|13|14|(8:16|(1:(0)(1:20))|48|21|(1:23)|26|29|(1:31))|19|48|21|(0)|26|29|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        com.fullstory.FS.log_e(Md.C4113f.f19760a, "Failed to retrieve renderer type or log initialization.", r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f A[Catch: all -> 0x0024, RemoteException -> 0x0054, TryCatch #3 {RemoteException -> 0x0054, blocks: (B:21:0x0049, B:23:0x004f, B:26:0x0056), top: B:48:0x0049, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x001e, B:11:0x0026, B:12:0x002a, B:14:0x0039, B:16:0x003e, B:21:0x0049, B:23:0x004f, B:26:0x0056, B:29:0x0065, B:31:0x0078, B:28:0x005e, B:35:0x0080, B:36:0x0085, B:38:0x0087), top: B:43:0x0003, inners: #1, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized int b(android.content.Context r5, Md.C4113f.a r6, Md.InterfaceC4115h r7) {
        /*
            java.lang.Class<Md.f> r0 = Md.C4113f.class
            monitor-enter(r0)
            java.lang.String r1 = "Context is null"
            com.google.android.gms.common.internal.r.m(r5, r1)     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = Md.C4113f.f19760a     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = "preferredRenderer: "
            java.lang.String r2 = r3.concat(r2)     // Catch: java.lang.Throwable -> L24
            com.fullstory.FS.log_d(r1, r2)     // Catch: java.lang.Throwable -> L24
            boolean r1 = Md.C4113f.f19761b     // Catch: java.lang.Throwable -> L24
            r2 = 0
            if (r1 == 0) goto L26
            if (r7 == 0) goto L7d
            Md.f$a r5 = Md.C4113f.f19762c     // Catch: java.lang.Throwable -> L24
            r7.a(r5)     // Catch: java.lang.Throwable -> L24
            goto L7d
        L24:
            r5 = move-exception
            goto L8b
        L26:
            Nd.p0 r1 = Nd.m0.a(r5, r6)     // Catch: java.lang.Throwable -> L24 com.google.android.gms.common.GooglePlayServicesNotAvailableException -> L86
            Nd.a r3 = r1.zze()     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L7f
            Md.C4109b.b(r3)     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L7f
            Dd.v r3 = r1.zzj()     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L7f
            Od.C4456d.d(r3)     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L7f
            r3 = 1
            Md.C4113f.f19761b = r3     // Catch: java.lang.Throwable -> L24
            r4 = 2
            if (r6 == 0) goto L46
            int r6 = r6.ordinal()     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L49
            if (r6 == r3) goto L48
        L46:
            r3 = r2
            goto L49
        L48:
            r3 = r4
        L49:
            int r6 = r1.zzd()     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L54
            if (r6 != r4) goto L56
            Md.f$a r6 = Md.C4113f.a.LATEST     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L54
            Md.C4113f.f19762c = r6     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L54
            goto L56
        L54:
            r5 = move-exception
            goto L5e
        L56:
            com.google.android.gms.dynamic.b r5 = com.google.android.gms.dynamic.d.I2(r5)     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L54
            r1.P6(r5, r3)     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L54
            goto L65
        L5e:
            java.lang.String r6 = Md.C4113f.f19760a     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "Failed to retrieve renderer type or log initialization."
            com.fullstory.FS.log_e(r6, r1, r5)     // Catch: java.lang.Throwable -> L24
        L65:
            java.lang.String r5 = Md.C4113f.f19760a     // Catch: java.lang.Throwable -> L24
            Md.f$a r6 = Md.C4113f.f19762c     // Catch: java.lang.Throwable -> L24
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "loadedRenderer: "
            java.lang.String r6 = r1.concat(r6)     // Catch: java.lang.Throwable -> L24
            com.fullstory.FS.log_d(r5, r6)     // Catch: java.lang.Throwable -> L24
            if (r7 == 0) goto L7d
            Md.f$a r5 = Md.C4113f.f19762c     // Catch: java.lang.Throwable -> L24
            r7.a(r5)     // Catch: java.lang.Throwable -> L24
        L7d:
            monitor-exit(r0)
            return r2
        L7f:
            r5 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r6 = new com.google.android.gms.maps.model.RuntimeRemoteException     // Catch: java.lang.Throwable -> L24
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L24
            throw r6     // Catch: java.lang.Throwable -> L24
        L86:
            r5 = move-exception
            int r5 = r5.f65565a     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)
            return r5
        L8b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Md.C4113f.b(android.content.Context, Md.f$a, Md.h):int");
    }

    private C4113f() {
    }
}
