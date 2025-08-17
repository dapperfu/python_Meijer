package Rg;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final List<b> f32227a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32228b;

    List<b> a() {
        return this.f32227a;
    }

    int b() {
        return this.f32228b;
    }

    boolean c(List<b> list) {
        return this.f32227a.equals(list);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f32227a.equals(((c) obj).f32227a);
        }
        return false;
    }

    public int hashCode() {
        return this.f32227a.hashCode();
    }

    public String toString() {
        return "{ " + this.f32227a + " }";
    }

    c(List<b> list, int i10) {
        this.f32227a = new ArrayList(list);
        this.f32228b = i10;
    }
}
