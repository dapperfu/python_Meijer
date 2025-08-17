package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.g5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8072g5 implements InterfaceC8924o4 {

    /* renamed from: a, reason: collision with root package name */
    private final GQ f74235a = new GQ();

    /* renamed from: b, reason: collision with root package name */
    private final W4 f74236b = new W4();

    @Override // com.google.android.gms.internal.ads.InterfaceC8924o4
    public final void a(byte[] bArr, int i10, int i11, C8817n4 c8817n4, ME me2) throws zzbc {
        this.f74235a.j(bArr, i11 + i10);
        this.f74235a.l(i10);
        ArrayList arrayList = new ArrayList();
        try {
            GQ gq2 = this.f74235a;
            int iT = gq2.t();
            Charset charset = StandardCharsets.UTF_8;
            String strP = gq2.P(charset);
            if (strP == null || !strP.startsWith("WEBVTT")) {
                gq2.l(iT);
                throw zzbc.a("Expected WEBVTT. Got ".concat(String.valueOf(gq2.P(charset))), null);
            }
            while (!TextUtils.isEmpty(this.f74235a.P(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                GQ gq3 = this.f74235a;
                char c10 = 65535;
                int iT2 = 0;
                while (c10 == 65535) {
                    iT2 = gq3.t();
                    String strP2 = gq3.P(StandardCharsets.UTF_8);
                    c10 = strP2 == null ? (char) 0 : "STYLE".equals(strP2) ? (char) 2 : strP2.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                gq3.l(iT2);
                if (c10 == 0) {
                    C8284i4.a(new C8391j5(arrayList2), c8817n4, me2);
                    return;
                }
                if (c10 == 1) {
                    while (!TextUtils.isEmpty(this.f74235a.P(StandardCharsets.UTF_8))) {
                    }
                } else if (c10 != 2) {
                    Y4 y4C = C7965f5.c(this.f74235a, arrayList);
                    if (y4C != null) {
                        arrayList2.add(y4C);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.f74235a.P(StandardCharsets.UTF_8);
                    arrayList.addAll(this.f74236b.b(this.f74235a));
                }
            }
        } catch (zzbc e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
