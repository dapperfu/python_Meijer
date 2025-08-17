package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class A3 {
    /* JADX WARN: Removed duplicated region for block: B:130:0x025c A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:9:0x002c, B:11:0x0037, B:14:0x0046, B:17:0x0052, B:20:0x005f, B:23:0x006e, B:26:0x007b, B:29:0x0089, B:31:0x0093, B:39:0x00ae, B:40:0x00c4, B:41:0x00d7, B:44:0x00e3, B:47:0x00f0, B:50:0x00fd, B:53:0x010a, B:56:0x0117, B:59:0x0124, B:62:0x0131, B:65:0x013e, B:68:0x014b, B:71:0x0158, B:75:0x0169, B:77:0x016f, B:79:0x0183, B:80:0x018a, B:82:0x0191, B:87:0x019c, B:92:0x01a8, B:130:0x025c, B:93:0x01bd, B:95:0x01c4, B:97:0x01ce, B:98:0x01e2, B:111:0x020e, B:114:0x021b, B:117:0x0227, B:120:0x0233, B:123:0x023f, B:126:0x024b, B:129:0x0255, B:131:0x0275, B:132:0x027c), top: B:137:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.InterfaceC6884Ka a(com.google.android.gms.internal.ads.GQ r15) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.A3.a(com.google.android.gms.internal.ads.GQ):com.google.android.gms.internal.ads.Ka");
    }

    private static int b(GQ gq2) {
        int iW = gq2.w();
        if (gq2.w() == 1684108385) {
            gq2.m(8);
            int i10 = iW - 16;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4 && (gq2.v() & 128) == 0) {
                            return gq2.F();
                        }
                    } else {
                        return gq2.E();
                    }
                } else {
                    return gq2.G();
                }
            } else {
                return gq2.C();
            }
        }
        C9917xL.f("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static AbstractC8813n2 c(int i10, String str, GQ gq2, boolean z10, boolean z11) {
        int iB = b(gq2);
        if (z11) {
            iB = Math.min(1, iB);
        }
        if (iB >= 0) {
            if (z10) {
                return new C9775w2(str, null, AbstractC7917eh0.u(Integer.toString(iB)));
            }
            return new C8173h2("und", str, Integer.toString(iB));
        }
        C9917xL.f("MetadataUtil", "Failed to parse uint8 attribute: ".concat(XZ.a(i10)));
        return null;
    }

    private static C9775w2 d(int i10, String str, GQ gq2) {
        int iW = gq2.w();
        if (gq2.w() == 1684108385 && iW >= 22) {
            gq2.m(10);
            int iG = gq2.G();
            if (iG > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(iG);
                String string = sb2.toString();
                int iG2 = gq2.G();
                if (iG2 > 0) {
                    string = string + com.medallia.digital.mobilesdk.q2.f92724c + iG2;
                }
                return new C9775w2(str, null, AbstractC7917eh0.u(string));
            }
        }
        C9917xL.f("MetadataUtil", "Failed to parse index/count attribute: ".concat(XZ.a(i10)));
        return null;
    }

    private static C9775w2 e(int i10, String str, GQ gq2) {
        int iW = gq2.w();
        if (gq2.w() == 1684108385) {
            gq2.m(8);
            return new C9775w2(str, null, AbstractC7917eh0.u(gq2.a(iW - 16)));
        }
        C9917xL.f("MetadataUtil", "Failed to parse text attribute: ".concat(XZ.a(i10)));
        return null;
    }
}
