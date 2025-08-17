package com.google.android.gms.measurement.internal;

import java.net.URL;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes6.dex */
final class A4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final URL f84869a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f84870b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC11275y4 f84871c;

    /* renamed from: d, reason: collision with root package name */
    private final String f84872d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f84873e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ B4 f84874f;

    private final void b(final int i10, final Exception exc, final byte[] bArr, final Map map) throws IllegalStateException {
        this.f84874f.f84868a.b().r(new Runnable() { // from class: com.google.android.gms.measurement.internal.z4
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f86068a.a(i10, exc, bArr, map);
            }
        });
    }

    final /* synthetic */ void a(int i10, Exception exc, byte[] bArr, Map map) {
        this.f84871c.a(this.f84872d, i10, exc, bArr, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0139 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.OutputStream] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.A4.run():void");
    }

    public A4(B4 b42, String str, URL url, byte[] bArr, Map map, InterfaceC11275y4 interfaceC11275y4) {
        Objects.requireNonNull(b42);
        this.f84874f = b42;
        com.google.android.gms.common.internal.r.f(str);
        com.google.android.gms.common.internal.r.l(url);
        com.google.android.gms.common.internal.r.l(interfaceC11275y4);
        this.f84869a = url;
        this.f84870b = bArr;
        this.f84871c = interfaceC11275y4;
        this.f84872d = str;
        this.f84873e = map;
    }
}
