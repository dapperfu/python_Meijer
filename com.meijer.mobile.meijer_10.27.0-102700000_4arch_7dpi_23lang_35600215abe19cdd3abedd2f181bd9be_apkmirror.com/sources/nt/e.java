package nt;

import android.os.PowerManager;
import cb.C6380a;
import cb.C6381b;
import ib.C14712a;

/* loaded from: classes11.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    private static final C6380a f152808c = C6381b.a(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final PowerManager.WakeLock f152809a;

    /* renamed from: b, reason: collision with root package name */
    private final String f152810b;

    public final void a() {
        this.f152809a.acquire();
    }

    public final void b() {
        this.f152809a.release();
    }

    public e(C14712a c14712a, String str) {
        this.f152809a = c14712a.b().newWakeLock(1, str);
        this.f152810b = str;
    }
}
