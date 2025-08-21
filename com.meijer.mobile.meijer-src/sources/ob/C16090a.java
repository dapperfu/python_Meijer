package ob;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import eb.C13784a;
import eb.C13785b;
import java.util.Arrays;

/* renamed from: ob.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16090a extends Ib.a {

    /* renamed from: f, reason: collision with root package name */
    private static final C13784a f153779f = C13785b.a(C16090a.class.getName());

    /* renamed from: e, reason: collision with root package name */
    private C16093d f153780e;

    public C16090a(Context context, C16093d c16093d, Db.e eVar) {
        super(eVar, context, new IntentFilter("com.gimbal.internal.communication.COMMUNICATION_CLICKED_INTENT_ACTION"));
        this.f153780e = c16093d;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String[] stringArray;
        if (!"com.gimbal.internal.communication.COMMUNICATION_CLICKED_INTENT_ACTION".equals(intent.getAction()) || (stringArray = intent.getExtras().getStringArray("COMMUNICATION_IDS_KEY")) == null) {
            return;
        }
        this.f153780e.i(Arrays.asList(stringArray));
    }
}
