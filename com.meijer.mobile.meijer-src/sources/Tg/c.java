package Tg;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final List<b> f36227a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36228b;

    List<b> a() {
        return this.f36227a;
    }

    int b() {
        return this.f36228b;
    }

    boolean c(List<b> list) {
        return this.f36227a.equals(list);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f36227a.equals(((c) obj).f36227a);
        }
        return false;
    }

    public int hashCode() {
        return this.f36227a.hashCode();
    }

    public String toString() {
        return "{ " + this.f36227a + " }";
    }

    c(List<b> list, int i10) {
        this.f36227a = new ArrayList(list);
        this.f36228b = i10;
    }
}
