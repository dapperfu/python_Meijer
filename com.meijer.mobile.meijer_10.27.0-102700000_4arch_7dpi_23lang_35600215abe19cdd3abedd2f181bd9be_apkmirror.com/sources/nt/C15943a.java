package nt;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import cb.C6380a;
import cb.C6381b;
import ib.C14712a;
import ut.EnumC17327m;
import ut.InterfaceRunnableC17328n;

/* renamed from: nt.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C15943a extends Gb.a {

    /* renamed from: j, reason: collision with root package name */
    private static final C6380a f152781j = C6381b.a(C15943a.class.getName());

    /* renamed from: e, reason: collision with root package name */
    private e f152782e;

    /* renamed from: f, reason: collision with root package name */
    private final EnumC17327m f152783f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceRunnableC17328n f152784g;

    /* renamed from: h, reason: collision with root package name */
    private String f152785h;

    /* renamed from: i, reason: collision with root package name */
    private C14712a f152786i;

    /* renamed from: nt.a$a, reason: collision with other inner class name */
    final class C2368a extends Thread {
        C2368a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                C15943a.this.f152782e.a();
                try {
                    C15943a.f(C15943a.this);
                    Thread.sleep(15000L);
                } finally {
                    C15943a.this.f152782e.b();
                }
            } catch (InterruptedException unused) {
                C6380a unused2 = C15943a.f152781j;
            }
        }
    }

    public C15943a(InterfaceRunnableC17328n interfaceRunnableC17328n, EnumC17327m enumC17327m, Bb.e eVar, Context context, C14712a c14712a) {
        super(eVar, context, new IntentFilter(context.getPackageName() + "." + enumC17327m.name()));
        this.f152784g = interfaceRunnableC17328n;
        this.f152783f = enumC17327m;
        this.f152786i = c14712a;
    }

    static /* synthetic */ void f(C15943a c15943a) {
        c15943a.f152784g.d();
    }

    private String h() {
        if (this.f152785h == null) {
            this.f152785h = C15943a.class.getSimpleName().concat(" ").concat(this.f152783f.name());
        }
        return this.f152785h;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        intent.getAction();
        intent.getPackage();
        if (this.f152782e == null) {
            this.f152782e = new e(this.f152786i, h());
        }
        new C2368a(h()).start();
    }
}
