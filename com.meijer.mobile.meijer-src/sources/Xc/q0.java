package Xc;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
final class q0 extends LinkedHashMap {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s0 f42002a;

    q0(s0 s0Var) {
        this.f42002a = s0Var;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        synchronized (this.f42002a) {
            try {
                int size = size();
                s0 s0Var = this.f42002a;
                if (size <= s0Var.f42012a) {
                    return false;
                }
                s0Var.f42017f.add(new Pair((String) entry.getKey(), ((r0) entry.getValue()).f42005b));
                return size() > this.f42002a.f42012a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
