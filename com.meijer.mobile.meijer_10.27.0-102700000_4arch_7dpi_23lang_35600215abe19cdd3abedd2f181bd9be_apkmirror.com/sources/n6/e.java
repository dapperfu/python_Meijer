package n6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f151046c = new e("COMPOSITION");

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f151047a;

    /* renamed from: b, reason: collision with root package name */
    private f f151048b;

    public e(String... strArr) {
        this.f151047a = Arrays.asList(strArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e eVar = (e) obj;
            if (!this.f151047a.equals(eVar.f151047a)) {
                return false;
            }
            f fVar = this.f151048b;
            f fVar2 = eVar.f151048b;
            if (fVar != null) {
                return fVar.equals(fVar2);
            }
            if (fVar2 == null) {
                return true;
            }
        }
        return false;
    }

    private boolean b() {
        return this.f151047a.get(r0.size() - 1).equals("**");
    }

    private boolean f(String str) {
        return "__container".equals(str);
    }

    public e a(String str) {
        e eVar = new e(this);
        eVar.f151047a.add(str);
        return eVar;
    }

    public boolean c(String str, int i10) {
        if (i10 >= this.f151047a.size()) {
            return false;
        }
        boolean z10 = i10 == this.f151047a.size() - 1;
        String str2 = this.f151047a.get(i10);
        if (!str2.equals("**")) {
            return (z10 || (i10 == this.f151047a.size() + (-2) && b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z10 && this.f151047a.get(i10 + 1).equals(str)) {
            return i10 == this.f151047a.size() + (-2) || (i10 == this.f151047a.size() + (-3) && b());
        }
        if (z10) {
            return true;
        }
        int i11 = i10 + 1;
        if (i11 < this.f151047a.size() - 1) {
            return false;
        }
        return this.f151047a.get(i11).equals(str);
    }

    public f d() {
        return this.f151048b;
    }

    public boolean h(String str, int i10) {
        return "__container".equals(str) || i10 < this.f151047a.size() - 1 || this.f151047a.get(i10).equals("**");
    }

    public int hashCode() {
        int iHashCode = this.f151047a.hashCode() * 31;
        f fVar = this.f151048b;
        return iHashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    public e i(f fVar) {
        e eVar = new e(this);
        eVar.f151048b = fVar;
        return eVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyPath{keys=");
        sb2.append(this.f151047a);
        sb2.append(",resolved=");
        sb2.append(this.f151048b != null);
        sb2.append('}');
        return sb2.toString();
    }

    private e(e eVar) {
        this.f151047a = new ArrayList(eVar.f151047a);
        this.f151048b = eVar.f151048b;
    }

    public int e(String str, int i10) {
        if (f(str)) {
            return 0;
        }
        if (!this.f151047a.get(i10).equals("**")) {
            return 1;
        }
        if (i10 == this.f151047a.size() - 1 || !this.f151047a.get(i10 + 1).equals(str)) {
            return 0;
        }
        return 2;
    }

    public boolean g(String str, int i10) {
        if (f(str)) {
            return true;
        }
        if (i10 >= this.f151047a.size()) {
            return false;
        }
        if (this.f151047a.get(i10).equals(str) || this.f151047a.get(i10).equals("**") || this.f151047a.get(i10).equals("*")) {
            return true;
        }
        return false;
    }
}
