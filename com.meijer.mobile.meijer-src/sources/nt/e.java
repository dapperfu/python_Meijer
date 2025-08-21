package nt;

import android.os.PowerManager;
import eb.C13784a;
import eb.C13785b;
import kb.C15115a;

/* loaded from: classes12.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    private static final C13784a f153260c = C13785b.a(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final PowerManager.WakeLock f153261a;

    /* renamed from: b, reason: collision with root package name */
    private final String f153262b;

    public final void a() {
        this.f153261a.acquire();
    }

    public final void b() {
        this.f153261a.release();
    }

    public e(C15115a c15115a, String str) {
        this.f153261a = c15115a.b().newWakeLock(1, str);
        this.f153262b = str;
    }
}
