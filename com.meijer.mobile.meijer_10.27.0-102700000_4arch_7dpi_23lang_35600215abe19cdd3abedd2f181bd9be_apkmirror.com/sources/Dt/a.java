package Dt;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import cb.C6380a;
import cb.C6381b;
import ib.C14712a;
import java.util.Iterator;

/* loaded from: classes11.dex */
public class a extends Gb.a {

    /* renamed from: h, reason: collision with root package name */
    private static final C6380a f7363h = C6381b.a(a.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public boolean f7364e;

    /* renamed from: f, reason: collision with root package name */
    public b f7365f;

    /* renamed from: g, reason: collision with root package name */
    private C14712a f7366g;

    /* renamed from: Dt.a$a, reason: collision with other inner class name */
    public interface InterfaceC0122a {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public class b extends tt.f<InterfaceC0122a> {
        protected b() {
        }

        public final void a() {
            Iterator<InterfaceC0122a> it = iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public a(Context context, Bb.e eVar, C14712a c14712a) {
        super(eVar, context, new IntentFilter("android.intent.action.SCREEN_OFF"), new IntentFilter("android.intent.action.SCREEN_ON"));
        this.f7364e = false;
        this.f7366g = c14712a;
        this.f7365f = new b();
        this.f7364e = this.f7366g.b().isScreenOn();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            this.f7364e = false;
            this.f7365f.a();
        }
        if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            this.f7364e = true;
            this.f7365f.a();
        }
    }
}
