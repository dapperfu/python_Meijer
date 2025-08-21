package nt;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import eb.C13784a;
import eb.C13785b;
import kb.C15115a;
import ut.EnumC17479m;
import ut.InterfaceRunnableC17480n;

/* renamed from: nt.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C16019a extends Ib.a {

    /* renamed from: j, reason: collision with root package name */
    private static final C13784a f153233j = C13785b.a(C16019a.class.getName());

    /* renamed from: e, reason: collision with root package name */
    private e f153234e;

    /* renamed from: f, reason: collision with root package name */
    private final EnumC17479m f153235f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceRunnableC17480n f153236g;

    /* renamed from: h, reason: collision with root package name */
    private String f153237h;

    /* renamed from: i, reason: collision with root package name */
    private C15115a f153238i;

    /* renamed from: nt.a$a, reason: collision with other inner class name */
    final class C2370a extends Thread {
        C2370a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                C16019a.this.f153234e.a();
                try {
                    C16019a.f(C16019a.this);
                    Thread.sleep(15000L);
                } finally {
                    C16019a.this.f153234e.b();
                }
            } catch (InterruptedException unused) {
                C13784a unused2 = C16019a.f153233j;
            }
        }
    }

    public C16019a(InterfaceRunnableC17480n interfaceRunnableC17480n, EnumC17479m enumC17479m, Db.e eVar, Context context, C15115a c15115a) {
        super(eVar, context, new IntentFilter(context.getPackageName() + "." + enumC17479m.name()));
        this.f153236g = interfaceRunnableC17480n;
        this.f153235f = enumC17479m;
        this.f153238i = c15115a;
    }

    static /* synthetic */ void f(C16019a c16019a) {
        c16019a.f153236g.d();
    }

    private String h() {
        if (this.f153237h == null) {
            this.f153237h = C16019a.class.getSimpleName().concat(" ").concat(this.f153235f.name());
        }
        return this.f153237h;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        intent.getAction();
        intent.getPackage();
        if (this.f153234e == null) {
            this.f153234e = new e(this.f153238i, h());
        }
        new C2370a(h()).start();
    }
}
