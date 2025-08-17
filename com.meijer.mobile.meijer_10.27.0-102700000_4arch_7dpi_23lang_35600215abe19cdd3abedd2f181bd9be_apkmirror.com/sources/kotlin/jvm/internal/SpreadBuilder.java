package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class SpreadBuilder {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<Object> f142840a;

    public void a(Object obj) {
        this.f142840a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f142840a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f142840a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f142840a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f142840a.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f142840a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int c() {
        return this.f142840a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f142840a.toArray(objArr);
    }

    public SpreadBuilder(int i10) {
        this.f142840a = new ArrayList<>(i10);
    }
}
