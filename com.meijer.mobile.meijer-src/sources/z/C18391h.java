package z;

import F.l0;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import v.J1;

/* renamed from: z.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18391h {

    /* renamed from: a, reason: collision with root package name */
    private final CaptureSessionOnClosedNotCalledQuirk f172174a;

    @FunctionalInterface
    /* renamed from: z.h$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(J1 j12);
    }

    public boolean d() {
        return this.f172174a != null;
    }

    public C18391h(l0 l0Var) {
        this.f172174a = (CaptureSessionOnClosedNotCalledQuirk) l0Var.b(CaptureSessionOnClosedNotCalledQuirk.class);
    }

    private void a(Set<J1> set) {
        for (J1 j12 : set) {
            j12.c().q(j12);
        }
    }

    private void b(Set<J1> set) {
        for (J1 j12 : set) {
            j12.c().r(j12);
        }
    }

    public void c(J1 j12, List<J1> list, List<J1> list2, a aVar) {
        J1 next;
        J1 next2;
        if (d()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<J1> it = list.iterator();
            while (it.hasNext() && (next2 = it.next()) != j12) {
                linkedHashSet.add(next2);
            }
            b(linkedHashSet);
        }
        aVar.a(j12);
        if (d()) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator<J1> it2 = list2.iterator();
            while (it2.hasNext() && (next = it2.next()) != j12) {
                linkedHashSet2.add(next);
            }
            a(linkedHashSet2);
        }
    }
}
