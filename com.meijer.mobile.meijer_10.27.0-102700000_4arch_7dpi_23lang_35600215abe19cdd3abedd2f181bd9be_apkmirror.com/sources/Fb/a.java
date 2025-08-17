package Fb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import cb.C6380a;
import cb.C6381b;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import lb.C15392a;
import mb.C15583d;
import mb.C15585f;
import vb.C17538d;

/* loaded from: classes4.dex */
public class a extends BroadcastReceiver {

    /* renamed from: d, reason: collision with root package name */
    private static final C6380a f10361d = C6381b.a(a.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public GoogleCloudMessaging f10362a;

    /* renamed from: b, reason: collision with root package name */
    private C15583d f10363b;

    /* renamed from: c, reason: collision with root package name */
    public Context f10364c;

    /* renamed from: Fb.a$a, reason: collision with other inner class name */
    final class RunnableC0144a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C15392a f10365a;

        RunnableC0144a(C15392a c15392a) {
            this.f10365a = c15392a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                a.this.f10363b.j(this.f10365a);
            } catch (Exception unused) {
                C6380a unused2 = a.f10361d;
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        C15392a c15392aD;
        GoogleCloudMessaging googleCloudMessaging = this.f10362a;
        if (googleCloudMessaging != null) {
            googleCloudMessaging.getMessageType(intent);
            Bundle extras = intent.getExtras();
            if (extras != null && (c15392aD = C15585f.d(extras)) != null) {
                C17538d.e(c15392aD, 4);
                if (c15392aD.a() != null) {
                    for (Db.a aVar : c15392aD.a()) {
                        aVar.a();
                        aVar.b();
                    }
                }
                new Thread(new RunnableC0144a(c15392aD)).start();
            }
        }
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
    }

    public a(Context context, C15583d c15583d) {
        this.f10364c = context;
        this.f10363b = c15583d;
        try {
            this.f10362a = GoogleCloudMessaging.getInstance(context);
        } catch (NoClassDefFoundError unused) {
        }
    }
}
