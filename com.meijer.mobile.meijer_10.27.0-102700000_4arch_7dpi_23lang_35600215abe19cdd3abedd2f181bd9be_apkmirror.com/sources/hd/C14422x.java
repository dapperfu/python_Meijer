package hd;

import Td.C5233k;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: hd.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14422x {

    /* renamed from: a, reason: collision with root package name */
    private final Map f134716a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final Map f134717b = Collections.synchronizedMap(new WeakHashMap());

    public final void f() {
        h(false, C14404e.f134619p);
    }

    private final void h(boolean z10, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.f134716a) {
            map = new HashMap(this.f134716a);
        }
        synchronized (this.f134717b) {
            map2 = new HashMap(this.f134717b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).c(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C5233k) entry2.getKey()).d(new ApiException(status));
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
        return (this.f134716a.isEmpty() && this.f134717b.isEmpty()) ? false : true;
    }

    final void c(BasePendingResult basePendingResult, boolean z10) {
        this.f134716a.put(basePendingResult, Boolean.valueOf(z10));
        basePendingResult.a(new C14420v(this, basePendingResult));
    }

    final void d(C5233k c5233k, boolean z10) {
        this.f134717b.put(c5233k, Boolean.valueOf(z10));
        c5233k.a().c(new C14421w(this, c5233k));
    }
}
