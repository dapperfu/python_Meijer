package Ib;

import Db.e;
import Db.k;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import eb.C13784a;
import eb.C13785b;

/* loaded from: classes4.dex */
public abstract class a extends BroadcastReceiver implements k {

    /* renamed from: d, reason: collision with root package name */
    private static final C13784a f14426d = C13785b.a(a.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private e f14427a;

    /* renamed from: b, reason: collision with root package name */
    private Context f14428b;

    /* renamed from: c, reason: collision with root package name */
    private IntentFilter[] f14429c;

    @Override // Db.k
    public final void a(String str, Object obj) {
        try {
            this.f14428b.unregisterReceiver(this);
        } catch (IllegalArgumentException unused) {
        }
        String strH = this.f14427a.f6073a.h("Broadcast_Receiver_Security_Permission", null);
        int i10 = 0;
        if (strH != null) {
            IntentFilter[] intentFilterArr = this.f14429c;
            int length = intentFilterArr.length;
            while (i10 < length) {
                this.f14428b.registerReceiver(this, intentFilterArr[i10], strH, null);
                i10++;
            }
            return;
        }
        IntentFilter[] intentFilterArr2 = this.f14429c;
        int length2 = intentFilterArr2.length;
        while (i10 < length2) {
            this.f14428b.registerReceiver(this, intentFilterArr2[i10]);
            i10++;
        }
    }

    public final void c() {
        this.f14427a.h(this, "Api_Key");
        a("Api_Key", this.f14427a.g());
    }

    public final void d() {
        try {
            this.f14428b.unregisterReceiver(this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public a(e eVar, Context context, IntentFilter... intentFilterArr) {
        this.f14427a = eVar;
        this.f14428b = context;
        this.f14429c = intentFilterArr;
    }
}
