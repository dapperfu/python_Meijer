package Cb;

import Bb.p;
import android.content.SharedPreferences;
import cb.C6380a;
import cb.C6381b;

/* loaded from: classes4.dex */
public class d extends p<String, a> {

    /* renamed from: i, reason: collision with root package name */
    static final C6380a f3759i = C6381b.a(d.class.getName());

    public d(SharedPreferences sharedPreferences) {
        super(sharedPreferences, a.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Bb.m
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
