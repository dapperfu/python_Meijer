package Eb;

import Db.p;
import android.content.SharedPreferences;
import eb.C13784a;
import eb.C13785b;

/* loaded from: classes4.dex */
public class d extends p<String, a> {

    /* renamed from: i, reason: collision with root package name */
    static final C13784a f7071i = C13785b.a(d.class.getName());

    public d(SharedPreferences sharedPreferences) {
        super(sharedPreferences, a.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Db.m
    public final /* synthetic */ Object a(Object obj) {
        return ((a) obj).a();
    }

    static boolean x(a aVar) {
        if (aVar.c() < System.currentTimeMillis()) {
            return true;
        }
        return false;
    }
}
