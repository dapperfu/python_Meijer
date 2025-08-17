package Vc;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
final class q0 extends LinkedHashMap {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s0 f37290a;

    q0(s0 s0Var) {
        this.f37290a = s0Var;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        synchronized (this.f37290a) {
            try {
                int size = size();
                s0 s0Var = this.f37290a;
                if (size <= s0Var.f37300a) {
                    return false;
                }
                s0Var.f37305f.add(new Pair((String) entry.getKey(), ((r0) entry.getValue()).f37293b));
                return size() > this.f37290a.f37300a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
