package com.medallia.digital.mobilesdk;

import java.util.Comparator;

/* loaded from: classes7.dex */
class o5 implements Comparator<String> {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f92674a;

    public o5(boolean z10) {
        this.f92674a = z10;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(String str, String str2) throws NumberFormatException {
        double d10 = Double.parseDouble(str);
        double d11 = Double.parseDouble(str2);
        return this.f92674a ? Double.compare(d10, d11) : Double.compare(d11, d10);
    }
}
