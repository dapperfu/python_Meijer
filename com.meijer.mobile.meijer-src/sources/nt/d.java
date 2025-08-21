package nt;

import android.app.AlarmManager;
import android.content.Context;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import kb.C15115a;

/* loaded from: classes12.dex */
public class d {

    /* renamed from: e, reason: collision with root package name */
    private static final C13784a f153254e = C13785b.a(d.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final C13786c f153255f = C13787d.a(d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Context f153256a;

    /* renamed from: b, reason: collision with root package name */
    public final bb.e f153257b;

    /* renamed from: c, reason: collision with root package name */
    public final AlarmManager f153258c;

    /* renamed from: d, reason: collision with root package name */
    public final String f153259d;

    public d(Context context, bb.e eVar, C15115a c15115a) {
        this.f153256a = context;
        this.f153257b = eVar;
        this.f153258c = c15115a.d();
        this.f153259d = context.getPackageName();
    }
}
