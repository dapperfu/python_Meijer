package mb;

import Lb.s;
import android.app.NotificationManager;
import android.content.Context;
import cb.C6380a;
import cb.C6381b;
import ib.C14712a;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* renamed from: mb.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15582c {

    /* renamed from: f, reason: collision with root package name */
    private static final C6380a f149998f = C6381b.a(C15582c.class.getName());

    /* renamed from: a, reason: collision with root package name */
    final Context f149999a;

    /* renamed from: b, reason: collision with root package name */
    int f150000b;

    /* renamed from: c, reason: collision with root package name */
    NotificationManager f150001c;

    /* renamed from: d, reason: collision with root package name */
    Random f150002d = new Random();

    /* renamed from: e, reason: collision with root package name */
    s f150003e;

    public C15582c(Context context, C14712a c14712a, s sVar) {
        this.f149999a = context;
        this.f150003e = sVar;
        this.f150000b = context.getApplicationInfo().icon;
        this.f150001c = (NotificationManager) c14712a.f137665a.getSystemService("notification");
    }

    static boolean a(List<C15584e> list) {
        Iterator<C15584e> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().f150017b != null) {
                return false;
            }
        }
        return true;
    }

    public static String[] b(List<C15584e> list) {
        String[] strArr = new String[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            strArr[i10] = list.get(i10).f150016a.h();
        }
        return strArr;
    }
}
