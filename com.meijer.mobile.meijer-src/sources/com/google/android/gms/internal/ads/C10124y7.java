package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.y7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C10124y7 extends V6 {

    /* renamed from: m, reason: collision with root package name */
    private final Object f80815m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC7561a7 f80816n;

    protected void N(String str) {
        InterfaceC7561a7 interfaceC7561a7;
        synchronized (this.f80815m) {
            interfaceC7561a7 = this.f80816n;
        }
        interfaceC7561a7.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.V6
    protected final C7668b7 o(S6 s62) {
        String str;
        String str2;
        try {
            byte[] bArr = s62.f70872b;
            Map map = s62.f70873c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                int i10 = 1;
                while (true) {
                    if (i10 >= strArrSplit.length) {
                        break;
                    }
                    String[] strArrSplit2 = strArrSplit[i10].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                    i10++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(s62.f70872b);
        }
        return C7668b7.b(str, C9269q7.b(s62));
    }

    public C10124y7(int i10, String str, InterfaceC7561a7 interfaceC7561a7, Z6 z62) {
        super(i10, str, z62);
        this.f80815m = new Object();
        this.f80816n = interfaceC7561a7;
    }
}
