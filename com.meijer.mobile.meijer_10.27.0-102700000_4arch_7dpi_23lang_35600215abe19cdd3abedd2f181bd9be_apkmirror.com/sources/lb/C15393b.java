package lb;

import Bb.p;
import android.content.SharedPreferences;
import cb.C6380a;
import cb.C6381b;
import java.util.Iterator;

/* renamed from: lb.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15393b extends p<String, C15392a> {

    /* renamed from: i, reason: collision with root package name */
    public static final C6380a f148800i = C6381b.a(C15393b.class.getName());

    public C15393b(SharedPreferences sharedPreferences) {
        super(sharedPreferences, C15392a.class);
        if (p.f2165h.a()) {
            Iterator<?> it = this.f2166b.getAll().values().iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Bb.m
    public final /* synthetic */ Object a(Object obj) {
        return ((C15392a) obj).h();
    }

    public static boolean x(C15392a c15392a) {
        if ((c15392a.f() != 0 && System.currentTimeMillis() - c15392a.f() > 864000000) || System.currentTimeMillis() - c15392a.d() > 5184000000L) {
            return true;
        }
        return false;
    }
}
