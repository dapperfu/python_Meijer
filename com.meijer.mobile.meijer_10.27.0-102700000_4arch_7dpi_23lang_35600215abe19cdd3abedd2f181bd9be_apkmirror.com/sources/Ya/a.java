package Ya;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import ib.C14712a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class a extends Gb.a {

    /* renamed from: i, reason: collision with root package name */
    private static final C6380a f40208i = C6381b.a(a.class.getName());

    /* renamed from: j, reason: collision with root package name */
    static final C6382c f40209j = C6383d.a(a.class.getName());

    /* renamed from: e, reason: collision with root package name */
    Context f40210e;

    /* renamed from: f, reason: collision with root package name */
    AlarmManager f40211f;

    /* renamed from: g, reason: collision with root package name */
    Map<String, WeakReference<InterfaceC0864a>> f40212g;

    /* renamed from: h, reason: collision with root package name */
    private C14712a f40213h;

    /* renamed from: Ya.a$a, reason: collision with other inner class name */
    public interface InterfaceC0864a {
        void a();
    }

    public a(Context context, Bb.e eVar, C14712a c14712a) {
        super(eVar, context, new IntentFilter(new IntentFilter("com.gimbal.alarms")));
        this.f40212g = new HashMap();
        this.f40210e = context;
        this.f40213h = c14712a;
        this.f40211f = c14712a.d();
        c();
    }

    final PendingIntent e(String str) {
        Intent intent = new Intent();
        intent.setAction("com.gimbal.alarms");
        intent.putExtra("DEST", str);
        intent.setPackage(this.f40210e.getPackageName());
        return PendingIntent.getBroadcast(this.f40210e, 1, intent, 134217728);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        WeakReference<InterfaceC0864a> weakReference;
        InterfaceC0864a interfaceC0864a;
        String string = intent.getExtras().getString("DEST");
        if (string != null && (weakReference = this.f40212g.get(string)) != null && (interfaceC0864a = weakReference.get()) != null) {
            interfaceC0864a.a();
        }
    }
}
