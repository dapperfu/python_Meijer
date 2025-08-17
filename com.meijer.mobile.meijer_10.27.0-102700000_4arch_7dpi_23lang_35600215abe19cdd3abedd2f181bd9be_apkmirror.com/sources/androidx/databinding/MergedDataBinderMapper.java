package androidx.databinding;

import android.view.View;
import com.fullstory.FS;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class MergedDataBinderMapper extends e {

    /* renamed from: a, reason: collision with root package name */
    private Set<Class<? extends e>> f54088a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private List<e> f54089b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private List<String> f54090c = new CopyOnWriteArrayList();

    private boolean e() throws ClassNotFoundException {
        boolean z10 = false;
        for (String str : this.f54090c) {
            try {
                Class<?> cls = Class.forName(str);
                if (e.class.isAssignableFrom(cls)) {
                    d((e) cls.newInstance());
                    this.f54090c.remove(str);
                    z10 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e10) {
                FS.log_e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e10);
            } catch (InstantiationException e11) {
                FS.log_e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e11);
            }
        }
        return z10;
    }

    @Override // androidx.databinding.e
    public p b(f fVar, View view, int i10) {
        Iterator<e> it = this.f54089b.iterator();
        while (it.hasNext()) {
            p pVarB = it.next().b(fVar, view, i10);
            if (pVarB != null) {
                return pVarB;
            }
        }
        if (e()) {
            return b(fVar, view, i10);
        }
        return null;
    }

    @Override // androidx.databinding.e
    public p c(f fVar, View[] viewArr, int i10) {
        Iterator<e> it = this.f54089b.iterator();
        while (it.hasNext()) {
            p pVarC = it.next().c(fVar, viewArr, i10);
            if (pVarC != null) {
                return pVarC;
            }
        }
        if (e()) {
            return c(fVar, viewArr, i10);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d(e eVar) {
        if (this.f54088a.add(eVar.getClass())) {
            this.f54089b.add(eVar);
            Iterator<e> it = eVar.a().iterator();
            while (it.hasNext()) {
                d(it.next());
            }
        }
    }
}
