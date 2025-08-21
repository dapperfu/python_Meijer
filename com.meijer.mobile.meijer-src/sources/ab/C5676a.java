package ab;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kb.C15115a;

/* renamed from: ab.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5676a extends Ib.a {

    /* renamed from: i, reason: collision with root package name */
    private static final C13784a f45340i = C13785b.a(C5676a.class.getName());

    /* renamed from: j, reason: collision with root package name */
    static final C13786c f45341j = C13787d.a(C5676a.class.getName());

    /* renamed from: e, reason: collision with root package name */
    Context f45342e;

    /* renamed from: f, reason: collision with root package name */
    AlarmManager f45343f;

    /* renamed from: g, reason: collision with root package name */
    Map<String, WeakReference<InterfaceC0948a>> f45344g;

    /* renamed from: h, reason: collision with root package name */
    private C15115a f45345h;

    /* renamed from: ab.a$a, reason: collision with other inner class name */
    public interface InterfaceC0948a {
        void a();
    }

    public C5676a(Context context, Db.e eVar, C15115a c15115a) {
        super(eVar, context, new IntentFilter(new IntentFilter("com.gimbal.alarms")));
        this.f45344g = new HashMap();
        this.f45342e = context;
        this.f45345h = c15115a;
        this.f45343f = c15115a.d();
        c();
    }

    final PendingIntent e(String str) {
        Intent intent = new Intent();
        intent.setAction("com.gimbal.alarms");
        intent.putExtra("DEST", str);
        intent.setPackage(this.f45342e.getPackageName());
        return PendingIntent.getBroadcast(this.f45342e, 1, intent, 134217728);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        WeakReference<InterfaceC0948a> weakReference;
        InterfaceC0948a interfaceC0948a;
        String string = intent.getExtras().getString("DEST");
        if (string != null && (weakReference = this.f45344g.get(string)) != null && (interfaceC0948a = weakReference.get()) != null) {
            interfaceC0948a.a();
        }
    }
}
