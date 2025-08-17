package com.google.android.gms.common.api;

import Z.C5503a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import gd.C14243b;
import hd.C14401b;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class AvailabilityException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final C5503a f64730a;

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        for (C14401b c14401b : this.f64730a.keySet()) {
            C14243b c14243b = (C14243b) r.l((C14243b) this.f64730a.get(c14401b));
            z10 &= !c14243b.K0();
            arrayList.add(c14401b.b() + ": " + String.valueOf(c14243b));
        }
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }

    public AvailabilityException(C5503a c5503a) {
        this.f64730a = c5503a;
    }
}
