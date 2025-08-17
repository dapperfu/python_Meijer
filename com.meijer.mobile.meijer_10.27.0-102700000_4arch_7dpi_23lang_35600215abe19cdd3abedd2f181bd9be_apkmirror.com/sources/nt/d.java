package nt;

import android.app.AlarmManager;
import android.content.Context;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import ib.C14712a;

/* loaded from: classes11.dex */
public class d {

    /* renamed from: e, reason: collision with root package name */
    private static final C6380a f152802e = C6381b.a(d.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final C6382c f152803f = C6383d.a(d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Context f152804a;

    /* renamed from: b, reason: collision with root package name */
    public final Za.e f152805b;

    /* renamed from: c, reason: collision with root package name */
    public final AlarmManager f152806c;

    /* renamed from: d, reason: collision with root package name */
    public final String f152807d;

    public d(Context context, Za.e eVar, C14712a c14712a) {
        this.f152804a = context;
        this.f152805b = eVar;
        this.f152806c = c14712a.d();
        this.f152807d = context.getPackageName();
    }
}
