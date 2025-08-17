package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class F0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f66688c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f66689a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f66690b = -1;

    public final boolean a() {
        return (this.f66689a == -1 || this.f66690b == -1) ? false : true;
    }

    public final boolean b(C8651lb c8651lb) {
        for (int i10 = 0; i10 < c8651lb.a(); i10++) {
            InterfaceC6884Ka interfaceC6884KaB = c8651lb.b(i10);
            if (interfaceC6884KaB instanceof C8173h2) {
                C8173h2 c8173h2 = (C8173h2) interfaceC6884KaB;
                if ("iTunSMPB".equals(c8173h2.f74576c) && c(c8173h2.f74577d)) {
                    return true;
                }
            } else if (interfaceC6884KaB instanceof C9134q2) {
                C9134q2 c9134q2 = (C9134q2) interfaceC6884KaB;
                if ("com.apple.iTunes".equals(c9134q2.f77693b) && "iTunSMPB".equals(c9134q2.f77694c) && c(c9134q2.f77695d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private final boolean c(String str) throws NumberFormatException {
        Matcher matcher = f66688c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i10 = OV.f69091a;
            int i11 = Integer.parseInt(strGroup, 16);
            int i12 = Integer.parseInt(matcher.group(2), 16);
            if (i11 <= 0 && i12 <= 0) {
                return false;
            }
            this.f66689a = i11;
            this.f66690b = i12;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
