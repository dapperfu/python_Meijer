package k3;

import g3.InterfaceC14195b;
import java.util.UUID;

/* loaded from: classes.dex */
public final class l implements InterfaceC14195b {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f141223d;

    /* renamed from: a, reason: collision with root package name */
    public final UUID f141224a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f141225b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public final boolean f141226c;

    public l(UUID uuid, byte[] bArr) {
        this(uuid, bArr, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    static {
        /*
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1e
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1c
            java.lang.String r1 = "AFTB"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e
        L1c:
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            k3.l.f141223d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.l.<clinit>():void");
    }

    @Deprecated
    public l(UUID uuid, byte[] bArr, boolean z10) {
        this.f141224a = uuid;
        this.f141225b = bArr;
        this.f141226c = z10;
    }
}
