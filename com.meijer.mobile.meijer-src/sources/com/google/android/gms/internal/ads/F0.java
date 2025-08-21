package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class F0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f67528c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f67529a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f67530b = -1;

    public final boolean a() {
        return (this.f67529a == -1 || this.f67530b == -1) ? false : true;
    }

    public final boolean b(C8776lb c8776lb) {
        for (int i10 = 0; i10 < c8776lb.a(); i10++) {
            InterfaceC7009Ka interfaceC7009KaB = c8776lb.b(i10);
            if (interfaceC7009KaB instanceof C8298h2) {
                C8298h2 c8298h2 = (C8298h2) interfaceC7009KaB;
                if ("iTunSMPB".equals(c8298h2.f75416c) && c(c8298h2.f75417d)) {
                    return true;
                }
            } else if (interfaceC7009KaB instanceof C9259q2) {
                C9259q2 c9259q2 = (C9259q2) interfaceC7009KaB;
                if ("com.apple.iTunes".equals(c9259q2.f78533b) && "iTunSMPB".equals(c9259q2.f78534c) && c(c9259q2.f78535d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private final boolean c(String str) throws NumberFormatException {
        Matcher matcher = f67528c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i10 = OV.f69931a;
            int i11 = Integer.parseInt(strGroup, 16);
            int i12 = Integer.parseInt(matcher.group(2), 16);
            if (i11 <= 0 && i12 <= 0) {
                return false;
            }
            this.f67529a = i11;
            this.f67530b = i12;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
