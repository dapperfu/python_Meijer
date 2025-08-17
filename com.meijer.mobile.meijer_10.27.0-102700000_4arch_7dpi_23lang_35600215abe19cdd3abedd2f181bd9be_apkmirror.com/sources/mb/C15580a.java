package mb;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import cb.C6380a;
import cb.C6381b;
import java.util.Arrays;

/* renamed from: mb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15580a extends Gb.a {

    /* renamed from: f, reason: collision with root package name */
    private static final C6380a f149992f = C6381b.a(C15580a.class.getName());

    /* renamed from: e, reason: collision with root package name */
    private C15583d f149993e;

    public C15580a(Context context, C15583d c15583d, Bb.e eVar) {
        super(eVar, context, new IntentFilter("com.gimbal.internal.communication.COMMUNICATION_CLICKED_INTENT_ACTION"));
        this.f149993e = c15583d;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String[] stringArray;
        if (!"com.gimbal.internal.communication.COMMUNICATION_CLICKED_INTENT_ACTION".equals(intent.getAction()) || (stringArray = intent.getExtras().getStringArray("COMMUNICATION_IDS_KEY")) == null) {
            return;
        }
        this.f149993e.i(Arrays.asList(stringArray));
    }
}
