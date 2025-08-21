package Ob;

import com.google.maps.android.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class a extends l {

    /* renamed from: f, reason: collision with root package name */
    protected List<f> f23259f = new ArrayList();

    private String h(f fVar) {
        return fVar != null ? Long.toString(fVar.u()) : BuildConfig.TRAVIS;
    }

    public List<f> i() {
        return this.f23259f;
    }

    public f j() {
        if (this.f23259f.size() <= 0) {
            return null;
        }
        return this.f23259f.get(r0.size() - 1);
    }

    public f k() {
        if (this.f23259f.size() > 0) {
            return this.f23259f.get(0);
        }
        return null;
    }

    public int l() {
        return this.f23259f.size();
    }

    public String toString() {
        return f() + " -- " + h(k()) + ":" + h(j());
    }

    @Override // Ob.g
    public void a(f fVar) {
        super.a(fVar);
        this.f23259f.add(fVar);
    }
}
