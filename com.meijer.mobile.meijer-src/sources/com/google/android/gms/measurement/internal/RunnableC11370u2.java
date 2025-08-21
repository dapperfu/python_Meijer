package com.google.android.gms.measurement.internal;

import java.net.URL;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.u2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11370u2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final URL f86742a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f86743b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC11356s2 f86744c;

    /* renamed from: d, reason: collision with root package name */
    private final String f86745d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f86746e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C11377v2 f86747f;

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0102: MOVE (r9 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:255), block:B:51:0x0100 */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0105: MOVE (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:258), block:B:52:0x0104 */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.RunnableC11370u2.run():void");
    }

    public RunnableC11370u2(C11377v2 c11377v2, String str, URL url, byte[] bArr, Map map, InterfaceC11356s2 interfaceC11356s2) {
        Objects.requireNonNull(c11377v2);
        this.f86747f = c11377v2;
        com.google.android.gms.common.internal.r.f(str);
        com.google.android.gms.common.internal.r.l(url);
        com.google.android.gms.common.internal.r.l(interfaceC11356s2);
        this.f86742a = url;
        this.f86743b = bArr;
        this.f86744c = interfaceC11356s2;
        this.f86745d = str;
        this.f86746e = map;
    }
}
