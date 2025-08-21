package Hb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import eb.C13784a;
import eb.C13785b;
import nb.C15926a;
import ob.C16093d;
import ob.C16095f;
import xb.C18150d;

/* loaded from: classes4.dex */
public class a extends BroadcastReceiver {

    /* renamed from: d, reason: collision with root package name */
    private static final C13784a f13488d = C13785b.a(a.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public GoogleCloudMessaging f13489a;

    /* renamed from: b, reason: collision with root package name */
    private C16093d f13490b;

    /* renamed from: c, reason: collision with root package name */
    public Context f13491c;

    /* renamed from: Hb.a$a, reason: collision with other inner class name */
    final class RunnableC0200a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C15926a f13492a;

        RunnableC0200a(C15926a c15926a) {
            this.f13492a = c15926a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                a.this.f13490b.j(this.f13492a);
            } catch (Exception unused) {
                C13784a unused2 = a.f13488d;
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        C15926a c15926aD;
        GoogleCloudMessaging googleCloudMessaging = this.f13489a;
        if (googleCloudMessaging != null) {
            googleCloudMessaging.getMessageType(intent);
            Bundle extras = intent.getExtras();
            if (extras != null && (c15926aD = C16095f.d(extras)) != null) {
                C18150d.e(c15926aD, 4);
                if (c15926aD.a() != null) {
                    for (Fb.a aVar : c15926aD.a()) {
                        aVar.a();
                        aVar.b();
                    }
                }
                new Thread(new RunnableC0200a(c15926aD)).start();
            }
        }
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
    }

    public a(Context context, C16093d c16093d) {
        this.f13491c = context;
        this.f13490b = c16093d;
        try {
            this.f13489a = GoogleCloudMessaging.getInstance(context);
        } catch (NoClassDefFoundError unused) {
        }
    }
}
