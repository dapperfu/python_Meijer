package nb;

import Db.p;
import android.content.SharedPreferences;
import eb.C13784a;
import eb.C13785b;
import java.util.Iterator;

/* renamed from: nb.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15927b extends p<String, C15926a> {

    /* renamed from: i, reason: collision with root package name */
    public static final C13784a f152197i = C13785b.a(C15927b.class.getName());

    public C15927b(SharedPreferences sharedPreferences) {
        super(sharedPreferences, C15926a.class);
        if (p.f6110h.a()) {
            Iterator<?> it = this.f6111b.getAll().values().iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Db.m
    public final /* synthetic */ Object a(Object obj) {
        return ((C15926a) obj).h();
    }

    public static boolean x(C15926a c15926a) {
        if ((c15926a.f() != 0 && System.currentTimeMillis() - c15926a.f() > 864000000) || System.currentTimeMillis() - c15926a.d() > 5184000000L) {
            return true;
        }
        return false;
    }
}
