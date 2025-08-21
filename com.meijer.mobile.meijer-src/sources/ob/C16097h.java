package ob;

import Cb.a;
import Db.p;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import nb.C15926a;
import nb.C15927b;
import nb.C15928c;

/* renamed from: ob.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16097h {

    /* renamed from: h, reason: collision with root package name */
    private static final C13784a f153816h = C13785b.a(C16097h.class.getName());

    /* renamed from: i, reason: collision with root package name */
    static final C13786c f153817i = C13787d.a(C16097h.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private C15927b f153818a;

    /* renamed from: b, reason: collision with root package name */
    C16100k f153819b;

    /* renamed from: c, reason: collision with root package name */
    public C15928c f153820c;

    /* renamed from: d, reason: collision with root package name */
    ab.d f153821d;

    /* renamed from: e, reason: collision with root package name */
    private final C16092c f153822e;

    /* renamed from: f, reason: collision with root package name */
    private Nb.b f153823f;

    /* renamed from: g, reason: collision with root package name */
    public C16093d f153824g;

    public static a.b a(a.b bVar) {
        a.b bVar2 = a.b.ARRIVE_EVENT;
        if (bVar == bVar2) {
            return a.b.DEPART_EVENT;
        }
        if (bVar == a.b.DEPART_EVENT) {
            return bVar2;
        }
        return null;
    }

    private void c(List<C16094e> list, int i10) {
        Notification notificationBuild;
        C16092c c16092c = this.f153822e;
        if (c16092c.f153790e.f20788a < 11 || list == null) {
            return;
        }
        int iNextInt = c16092c.f153789d.nextInt();
        Intent intent = new Intent();
        intent.putExtra("COMMUNICATION_IDS_KEY", C16092c.b(list));
        intent.setPackage(c16092c.f153786a.getPackageName());
        intent.setAction("com.gimbal.internal.communication.COMMUNICATION_CLICKED_INTENT_ACTION");
        String strI = list.get(0).f153803a.i();
        String strE = list.get(0).f153803a.e();
        PendingIntent broadcast = PendingIntent.getBroadcast(c16092c.f153786a, iNextInt, intent, 134217728);
        if (C16092c.a(list)) {
            notificationBuild = new Notification.Builder(c16092c.f153786a).setNumber(list.size()).setSmallIcon(c16092c.f153787b).setAutoCancel(true).setContentTitle(strI).setContentText(strE).setContentIntent(broadcast).build();
        } else {
            Iterator<C16094e> it = list.iterator();
            Notification notificationBuild2 = null;
            while (it.hasNext()) {
                Notification.Builder builder = it.next().f153804b;
                notificationBuild2 = builder != null ? builder.setNumber(list.size()).setContentIntent(broadcast).build() : new Notification.Builder(c16092c.f153786a).setSmallIcon(c16092c.f153787b).setAutoCancel(true).setContentTitle(strI).setContentText(strE).setNumber(list.size()).setContentIntent(broadcast).build();
            }
            notificationBuild = notificationBuild2;
        }
        if (notificationBuild != null) {
            c16092c.f153788c.notify(i10, notificationBuild);
        }
    }

    private boolean e(C15926a c15926a) {
        C15926a c15926aH = this.f153818a.h(c15926a.h());
        long jCurrentTimeMillis = (System.currentTimeMillis() - c15926aH.d()) / 1000;
        long jLongValue = c15926a.g().longValue() * 3600;
        if (jLongValue == 0 || jCurrentTimeMillis > jLongValue) {
            c15926a.h();
            c15926aH.d();
            return true;
        }
        c15926a.h();
        new Date(c15926aH.d());
        return false;
    }

    private void g(List<C15926a> list, Cb.a aVar) {
        int iNextInt;
        List<C16094e> listE;
        if (this.f153823f.a() != Boolean.TRUE || (listE = this.f153824g.e(list, aVar, (iNextInt = new Random().nextInt()))) == null || listE.isEmpty()) {
            return;
        }
        c(listE, iNextInt);
    }

    private void h(C15926a c15926a) throws IOException {
        C15926a c15926aH = this.f153818a.h(c15926a.h());
        c15926aH.r(System.currentTimeMillis());
        this.f153818a.j(c15926aH);
        c15926aH.h();
        new Date(c15926aH.d());
    }

    public final void b(List<C15926a> list) {
        try {
            p<String, C15926a>.b bVarE = this.f153818a.e();
            try {
                for (C15926a c15926a : list) {
                    C15926a c15926aH = this.f153818a.h(c15926a.h());
                    if (c15926aH == null) {
                        this.f153818a.g(bVarE, c15926a);
                    } else {
                        c15926a.r(c15926aH.d());
                        this.f153818a.g(bVarE, c15926a);
                    }
                }
                bVarE.a();
            } catch (Throwable th2) {
                bVarE.a();
                throw th2;
            }
        } catch (IOException unused) {
        }
    }

    final void d(List<C15926a> list, Cb.a aVar) {
        ArrayList arrayList = new ArrayList();
        for (C15926a c15926a : list) {
            if (e(c15926a)) {
                arrayList.add(c15926a);
                try {
                    h(c15926a);
                } catch (IOException unused) {
                    f153817i.g("Unable to limit communication {}", c15926a.h());
                }
            }
        }
        g(arrayList, aVar);
    }

    public final void f(List<C16091b> list) {
        ArrayList arrayList = new ArrayList();
        Cb.a aVarC = null;
        for (C16091b c16091b : list) {
            String strA = c16091b.a();
            aVarC = c16091b.c();
            C15926a c15926aH = this.f153818a.h(strA);
            if (c15926aH != null && e(c15926aH)) {
                arrayList.add(c15926aH);
                try {
                    h(c15926aH);
                } catch (IOException unused) {
                    f153817i.g("Unable to limit communication {}", c15926aH.h());
                }
            }
        }
        g(arrayList, aVarC);
    }

    public C16097h(C15927b c15927b, C16100k c16100k, ab.d dVar, C16092c c16092c, Nb.b bVar) {
        this.f153818a = c15927b;
        this.f153819b = c16100k;
        this.f153821d = dVar;
        this.f153822e = c16092c;
        this.f153823f = bVar;
    }
}
