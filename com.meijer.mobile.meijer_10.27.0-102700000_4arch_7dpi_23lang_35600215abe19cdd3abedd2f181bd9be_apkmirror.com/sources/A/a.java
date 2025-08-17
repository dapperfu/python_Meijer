package A;

import B.h;
import C.InterfaceC2971n;
import C.P;
import D.a;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.InitializationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import v.O0;
import w.O;

/* loaded from: classes.dex */
public class a implements D.a {

    /* renamed from: a, reason: collision with root package name */
    private final O f2a;

    /* renamed from: f, reason: collision with root package name */
    private int f7f = 0;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, List<String>> f4c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private Set<Set<String>> f6e = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final List<a.InterfaceC0089a> f3b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private List<InterfaceC2971n> f5d = new ArrayList();

    private void e() {
        Set<Set<String>> hashSet = new HashSet<>();
        try {
            hashSet = this.f2a.e();
        } catch (CameraAccessExceptionCompat unused) {
            P.c("Camera2CameraCoordinator", "Failed to get concurrent camera ids");
        }
        Iterator<Set<String>> it = hashSet.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = new ArrayList(it.next());
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                try {
                    if (O0.a(this.f2a, str) && O0.a(this.f2a, str2)) {
                        this.f6e.add(new HashSet(Arrays.asList(str, str2)));
                        if (!this.f4c.containsKey(str)) {
                            this.f4c.put(str, new ArrayList());
                        }
                        if (!this.f4c.containsKey(str2)) {
                            this.f4c.put(str2, new ArrayList());
                        }
                        this.f4c.get(str).add((String) arrayList.get(1));
                        this.f4c.get(str2).add((String) arrayList.get(0));
                    }
                } catch (InitializationException unused2) {
                    P.a("Camera2CameraCoordinator", "Concurrent camera id pair: (" + str + ", " + str2 + ") is not backward compatible");
                }
            }
        }
    }

    @Override // D.a
    public String a(String str) {
        if (!this.f4c.containsKey(str)) {
            return null;
        }
        for (String str2 : this.f4c.get(str)) {
            Iterator<InterfaceC2971n> it = this.f5d.iterator();
            while (it.hasNext()) {
                if (str2.equals(h.a(it.next()).b())) {
                    return str2;
                }
            }
        }
        return null;
    }

    @Override // D.a
    public void b(a.InterfaceC0089a interfaceC0089a) {
        this.f3b.add(interfaceC0089a);
    }

    @Override // D.a
    public int c() {
        return this.f7f;
    }

    @Override // D.a
    public void d(int i10) {
        if (i10 != this.f7f) {
            Iterator<a.InterfaceC0089a> it = this.f3b.iterator();
            while (it.hasNext()) {
                it.next().a(this.f7f, i10);
            }
        }
        if (this.f7f == 2 && i10 != 2) {
            this.f5d.clear();
        }
        this.f7f = i10;
    }

    public a(O o10) {
        this.f2a = o10;
        e();
    }
}
