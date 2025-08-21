package ob;

import Nb.s;
import android.app.NotificationManager;
import android.content.Context;
import eb.C13784a;
import eb.C13785b;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kb.C15115a;

/* renamed from: ob.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16092c {

    /* renamed from: f, reason: collision with root package name */
    private static final C13784a f153785f = C13785b.a(C16092c.class.getName());

    /* renamed from: a, reason: collision with root package name */
    final Context f153786a;

    /* renamed from: b, reason: collision with root package name */
    int f153787b;

    /* renamed from: c, reason: collision with root package name */
    NotificationManager f153788c;

    /* renamed from: d, reason: collision with root package name */
    Random f153789d = new Random();

    /* renamed from: e, reason: collision with root package name */
    s f153790e;

    public C16092c(Context context, C15115a c15115a, s sVar) {
        this.f153786a = context;
        this.f153790e = sVar;
        this.f153787b = context.getApplicationInfo().icon;
        this.f153788c = (NotificationManager) c15115a.f141754a.getSystemService("notification");
    }

    static boolean a(List<C16094e> list) {
        Iterator<C16094e> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().f153804b != null) {
                return false;
            }
        }
        return true;
    }

    public static String[] b(List<C16094e> list) {
        String[] strArr = new String[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            strArr[i10] = list.get(i10).f153803a.h();
        }
        return strArr;
    }
}
