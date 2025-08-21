package com.google.android.gms.common.api;

import Z.C5603a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import id.C14719b;
import java.util.ArrayList;
import jd.C14979b;

/* loaded from: classes4.dex */
public class AvailabilityException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final C5603a f65570a;

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        for (C14979b c14979b : this.f65570a.keySet()) {
            C14719b c14719b = (C14719b) r.l((C14719b) this.f65570a.get(c14979b));
            z10 &= !c14719b.I0();
            arrayList.add(c14979b.b() + ": " + String.valueOf(c14719b));
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

    public AvailabilityException(C5603a c5603a) {
        this.f65570a = c5603a;
    }
}
