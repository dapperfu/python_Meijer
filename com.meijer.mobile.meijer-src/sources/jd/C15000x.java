package jd;

import Vd.C5517k;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: jd.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15000x {

    /* renamed from: a, reason: collision with root package name */
    private final Map f140405a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final Map f140406b = Collections.synchronizedMap(new WeakHashMap());

    public final void f() {
        h(false, C14982e.f140308p);
    }

    private final void h(boolean z10, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.f140405a) {
            map = new HashMap(this.f140405a);
        }
        synchronized (this.f140406b) {
            map2 = new HashMap(this.f140406b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).c(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C5517k) entry2.getKey()).d(new ApiException(status));
            }
        }
    }

    final void e(int i10, String str) {
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        h(true, new Status(20, sb2.toString()));
    }

    final boolean g() {
        return (this.f140405a.isEmpty() && this.f140406b.isEmpty()) ? false : true;
    }

    final void c(BasePendingResult basePendingResult, boolean z10) {
        this.f140405a.put(basePendingResult, Boolean.valueOf(z10));
        basePendingResult.a(new C14998v(this, basePendingResult));
    }

    final void d(C5517k c5517k, boolean z10) {
        this.f140406b.put(c5517k, Boolean.valueOf(z10));
        c5517k.a().c(new C14999w(this, c5517k));
    }
}
