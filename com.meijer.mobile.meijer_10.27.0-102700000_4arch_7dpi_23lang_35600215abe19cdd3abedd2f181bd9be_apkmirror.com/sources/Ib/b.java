package Ib;

import android.content.Context;

/* loaded from: classes4.dex */
public class b extends Za.a {

    /* renamed from: c, reason: collision with root package name */
    private Bb.e f13769c;

    private String e() {
        Eb.e eVarX;
        try {
            Bb.e eVar = this.f13769c;
            if (eVar == null || (eVarX = eVar.x()) == null) {
                return "UNKNOWN";
            }
            String strC = eVarX.c();
            return strC != null ? strC : "UNKNOWN";
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public String f() {
        return super.d("app-instance/" + e());
    }

    public b(Context context, Bb.e eVar) {
        super(context);
        this.f13769c = eVar;
    }
}
