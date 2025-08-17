package Gb;

import Bb.e;
import Bb.k;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import cb.C6380a;
import cb.C6381b;

/* loaded from: classes4.dex */
public abstract class a extends BroadcastReceiver implements k {

    /* renamed from: d, reason: collision with root package name */
    private static final C6380a f11327d = C6381b.a(a.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private e f11328a;

    /* renamed from: b, reason: collision with root package name */
    private Context f11329b;

    /* renamed from: c, reason: collision with root package name */
    private IntentFilter[] f11330c;

    @Override // Bb.k
    public final void a(String str, Object obj) {
        try {
            this.f11329b.unregisterReceiver(this);
        } catch (IllegalArgumentException unused) {
        }
        String strI = this.f11328a.f2128a.i("Broadcast_Receiver_Security_Permission", null);
        int i10 = 0;
        if (strI != null) {
            IntentFilter[] intentFilterArr = this.f11330c;
            int length = intentFilterArr.length;
            while (i10 < length) {
                this.f11329b.registerReceiver(this, intentFilterArr[i10], strI, null);
                i10++;
            }
            return;
        }
        IntentFilter[] intentFilterArr2 = this.f11330c;
        int length2 = intentFilterArr2.length;
        while (i10 < length2) {
            this.f11329b.registerReceiver(this, intentFilterArr2[i10]);
            i10++;
        }
    }

    public final void c() {
        this.f11328a.h(this, "Api_Key");
        a("Api_Key", this.f11328a.g());
    }

    public final void d() {
        try {
            this.f11329b.unregisterReceiver(this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public a(e eVar, Context context, IntentFilter... intentFilterArr) {
        this.f11328a = eVar;
        this.f11329b = context;
        this.f11330c = intentFilterArr;
    }
}
