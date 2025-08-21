package kt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class j implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private List<C15423i> f148886a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        List<C15423i> list = this.f148886a;
        if (list == null) {
            if (jVar.f148886a != null) {
                return false;
            }
        } else if (!list.equals(jVar.f148886a)) {
            return false;
        }
        return true;
    }

    public void a(C15423i c15423i) {
        if (this.f148886a == null) {
            this.f148886a = new ArrayList();
        }
        this.f148886a.add(c15423i);
    }

    public List<C15423i> b() {
        if (this.f148886a == null) {
            this.f148886a = new ArrayList();
        }
        return this.f148886a;
    }

    public int hashCode() {
        List<C15423i> list = this.f148886a;
        return (list == null ? 0 : list.hashCode()) + 31;
    }
}
