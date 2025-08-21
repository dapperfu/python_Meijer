package Dt;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import eb.C13784a;
import eb.C13785b;
import java.util.Iterator;
import kb.C15115a;

/* loaded from: classes12.dex */
public class a extends Ib.a {

    /* renamed from: h, reason: collision with root package name */
    private static final C13784a f6670h = C13785b.a(a.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public boolean f6671e;

    /* renamed from: f, reason: collision with root package name */
    public b f6672f;

    /* renamed from: g, reason: collision with root package name */
    private C15115a f6673g;

    /* renamed from: Dt.a$a, reason: collision with other inner class name */
    public interface InterfaceC0136a {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public class b extends tt.f<InterfaceC0136a> {
        protected b() {
        }

        public final void a() {
            Iterator<InterfaceC0136a> it = iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public a(Context context, Db.e eVar, C15115a c15115a) {
        super(eVar, context, new IntentFilter("android.intent.action.SCREEN_OFF"), new IntentFilter("android.intent.action.SCREEN_ON"));
        this.f6671e = false;
        this.f6673g = c15115a;
        this.f6672f = new b();
        this.f6671e = this.f6673g.b().isScreenOn();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            this.f6671e = false;
            this.f6672f.a();
        }
        if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            this.f6671e = true;
            this.f6672f.a();
        }
    }
}
