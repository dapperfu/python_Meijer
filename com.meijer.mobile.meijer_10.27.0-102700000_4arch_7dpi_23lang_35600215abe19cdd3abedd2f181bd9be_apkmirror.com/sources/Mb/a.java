package Mb;

import com.google.maps.android.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class a extends l {

    /* renamed from: f, reason: collision with root package name */
    protected List<f> f19072f = new ArrayList();

    private String h(f fVar) {
        return fVar != null ? Long.toString(fVar.u()) : BuildConfig.TRAVIS;
    }

    public List<f> i() {
        return this.f19072f;
    }

    public f j() {
        if (this.f19072f.size() <= 0) {
            return null;
        }
        return this.f19072f.get(r0.size() - 1);
    }

    public f k() {
        if (this.f19072f.size() > 0) {
            return this.f19072f.get(0);
        }
        return null;
    }

    public int l() {
        return this.f19072f.size();
    }

    public String toString() {
        return f() + " -- " + h(k()) + ":" + h(j());
    }

    @Override // Mb.g
    public void a(f fVar) {
        super.a(fVar);
        this.f19072f.add(fVar);
    }
}
