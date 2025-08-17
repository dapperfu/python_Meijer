package kt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class j implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private List<C15320i> f147976a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        List<C15320i> list = this.f147976a;
        if (list == null) {
            if (jVar.f147976a != null) {
                return false;
            }
        } else if (!list.equals(jVar.f147976a)) {
            return false;
        }
        return true;
    }

    public void a(C15320i c15320i) {
        if (this.f147976a == null) {
            this.f147976a = new ArrayList();
        }
        this.f147976a.add(c15320i);
    }

    public List<C15320i> b() {
        if (this.f147976a == null) {
            this.f147976a = new ArrayList();
        }
        return this.f147976a;
    }

    public int hashCode() {
        List<C15320i> list = this.f147976a;
        return (list == null ? 0 : list.hashCode()) + 31;
    }
}
