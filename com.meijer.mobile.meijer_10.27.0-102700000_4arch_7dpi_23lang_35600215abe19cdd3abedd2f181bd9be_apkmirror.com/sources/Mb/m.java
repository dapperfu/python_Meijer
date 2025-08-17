package Mb;

import com.google.maps.android.BuildConfig;

/* loaded from: classes4.dex */
public class m extends g {

    /* renamed from: f, reason: collision with root package name */
    private d f19102f;

    public m() {
    }

    public m(m mVar) {
        super(mVar);
        i(mVar.h());
    }

    public d h() {
        return this.f19102f;
    }

    protected void i(d dVar) {
        this.f19102f = dVar;
    }

    public String toString() {
        String str = f() + " -- " + h() + ":";
        if (g() == null) {
            return str + BuildConfig.TRAVIS;
        }
        return str + g().h() + ":" + g().f();
    }
}
