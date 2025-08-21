package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.g5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8197g5 implements InterfaceC9049o4 {

    /* renamed from: a, reason: collision with root package name */
    private final GQ f75075a = new GQ();

    /* renamed from: b, reason: collision with root package name */
    private final W4 f75076b = new W4();

    @Override // com.google.android.gms.internal.ads.InterfaceC9049o4
    public final void a(byte[] bArr, int i10, int i11, C8942n4 c8942n4, ME me2) throws zzbc {
        this.f75075a.j(bArr, i11 + i10);
        this.f75075a.l(i10);
        ArrayList arrayList = new ArrayList();
        try {
            GQ gq2 = this.f75075a;
            int iT = gq2.t();
            Charset charset = StandardCharsets.UTF_8;
            String strP = gq2.P(charset);
            if (strP == null || !strP.startsWith("WEBVTT")) {
                gq2.l(iT);
                throw zzbc.a("Expected WEBVTT. Got ".concat(String.valueOf(gq2.P(charset))), null);
            }
            while (!TextUtils.isEmpty(this.f75075a.P(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                GQ gq3 = this.f75075a;
                char c10 = 65535;
                int iT2 = 0;
                while (c10 == 65535) {
                    iT2 = gq3.t();
                    String strP2 = gq3.P(StandardCharsets.UTF_8);
                    c10 = strP2 == null ? (char) 0 : "STYLE".equals(strP2) ? (char) 2 : strP2.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                gq3.l(iT2);
                if (c10 == 0) {
                    C8409i4.a(new C8516j5(arrayList2), c8942n4, me2);
                    return;
                }
                if (c10 == 1) {
                    while (!TextUtils.isEmpty(this.f75075a.P(StandardCharsets.UTF_8))) {
                    }
                } else if (c10 != 2) {
                    Y4 y4C = C8090f5.c(this.f75075a, arrayList);
                    if (y4C != null) {
                        arrayList2.add(y4C);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.f75075a.P(StandardCharsets.UTF_8);
                    arrayList.addAll(this.f75076b.b(this.f75075a));
                }
            }
        } catch (zzbc e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
