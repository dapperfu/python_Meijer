package Kb;

import android.content.Context;
import bb.C6344a;

/* loaded from: classes4.dex */
public class b extends C6344a {

    /* renamed from: c, reason: collision with root package name */
    private Db.e f16515c;

    private String e() {
        Gb.e eVarX;
        try {
            Db.e eVar = this.f16515c;
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

    public b(Context context, Db.e eVar) {
        super(context);
        this.f16515c = eVar;
    }
}
