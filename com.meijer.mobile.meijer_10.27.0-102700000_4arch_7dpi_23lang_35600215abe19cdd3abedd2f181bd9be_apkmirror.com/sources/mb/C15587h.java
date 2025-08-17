package mb;

import Ab.a;
import Bb.p;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import lb.C15392a;
import lb.C15393b;
import lb.C15394c;

/* renamed from: mb.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15587h {

    /* renamed from: h, reason: collision with root package name */
    private static final C6380a f150029h = C6381b.a(C15587h.class.getName());

    /* renamed from: i, reason: collision with root package name */
    static final C6382c f150030i = C6383d.a(C15587h.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private C15393b f150031a;

    /* renamed from: b, reason: collision with root package name */
    C15590k f150032b;

    /* renamed from: c, reason: collision with root package name */
    public C15394c f150033c;

    /* renamed from: d, reason: collision with root package name */
    Ya.d f150034d;

    /* renamed from: e, reason: collision with root package name */
    private final C15582c f150035e;

    /* renamed from: f, reason: collision with root package name */
    private Lb.b f150036f;

    /* renamed from: g, reason: collision with root package name */
    public C15583d f150037g;

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

    private void c(List<C15584e> list, int i10) {
        Notification notificationBuild;
        C15582c c15582c = this.f150035e;
        if (c15582c.f150003e.f17968a < 11 || list == null) {
            return;
        }
        int iNextInt = c15582c.f150002d.nextInt();
        Intent intent = new Intent();
        intent.putExtra("COMMUNICATION_IDS_KEY", C15582c.b(list));
        intent.setPackage(c15582c.f149999a.getPackageName());
        intent.setAction("com.gimbal.internal.communication.COMMUNICATION_CLICKED_INTENT_ACTION");
        String strI = list.get(0).f150016a.i();
        String strE = list.get(0).f150016a.e();
        PendingIntent broadcast = PendingIntent.getBroadcast(c15582c.f149999a, iNextInt, intent, 134217728);
        if (C15582c.a(list)) {
            notificationBuild = new Notification.Builder(c15582c.f149999a).setNumber(list.size()).setSmallIcon(c15582c.f150000b).setAutoCancel(true).setContentTitle(strI).setContentText(strE).setContentIntent(broadcast).build();
        } else {
            Iterator<C15584e> it = list.iterator();
            Notification notificationBuild2 = null;
            while (it.hasNext()) {
                Notification.Builder builder = it.next().f150017b;
                notificationBuild2 = builder != null ? builder.setNumber(list.size()).setContentIntent(broadcast).build() : new Notification.Builder(c15582c.f149999a).setSmallIcon(c15582c.f150000b).setAutoCancel(true).setContentTitle(strI).setContentText(strE).setNumber(list.size()).setContentIntent(broadcast).build();
            }
            notificationBuild = notificationBuild2;
        }
        if (notificationBuild != null) {
            c15582c.f150001c.notify(i10, notificationBuild);
        }
    }

    private boolean e(C15392a c15392a) {
        C15392a c15392aH = this.f150031a.h(c15392a.h());
        long jCurrentTimeMillis = (System.currentTimeMillis() - c15392aH.d()) / 1000;
        long jLongValue = c15392a.g().longValue() * 3600;
        if (jLongValue == 0 || jCurrentTimeMillis > jLongValue) {
            c15392a.h();
            c15392aH.d();
            return true;
        }
        c15392a.h();
        new Date(c15392aH.d());
        return false;
    }

    private void g(List<C15392a> list, Ab.a aVar) {
        int iNextInt;
        List<C15584e> listE;
        if (this.f150036f.a() != Boolean.TRUE || (listE = this.f150037g.e(list, aVar, (iNextInt = new Random().nextInt()))) == null || listE.isEmpty()) {
            return;
        }
        c(listE, iNextInt);
    }

    private void h(C15392a c15392a) throws IOException {
        C15392a c15392aH = this.f150031a.h(c15392a.h());
        c15392aH.r(System.currentTimeMillis());
        this.f150031a.j(c15392aH);
        c15392aH.h();
        new Date(c15392aH.d());
    }

    public final void b(List<C15392a> list) {
        try {
            p<String, C15392a>.b bVarE = this.f150031a.e();
            try {
                for (C15392a c15392a : list) {
                    C15392a c15392aH = this.f150031a.h(c15392a.h());
                    if (c15392aH == null) {
                        this.f150031a.g(bVarE, c15392a);
                    } else {
                        c15392a.r(c15392aH.d());
                        this.f150031a.g(bVarE, c15392a);
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

    final void d(List<C15392a> list, Ab.a aVar) {
        ArrayList arrayList = new ArrayList();
        for (C15392a c15392a : list) {
            if (e(c15392a)) {
                arrayList.add(c15392a);
                try {
                    h(c15392a);
                } catch (IOException unused) {
                    f150030i.g("Unable to limit communication {}", c15392a.h());
                }
            }
        }
        g(arrayList, aVar);
    }

    public final void f(List<C15581b> list) {
        ArrayList arrayList = new ArrayList();
        Ab.a aVarC = null;
        for (C15581b c15581b : list) {
            String strA = c15581b.a();
            aVarC = c15581b.c();
            C15392a c15392aH = this.f150031a.h(strA);
            if (c15392aH != null && e(c15392aH)) {
                arrayList.add(c15392aH);
                try {
                    h(c15392aH);
                } catch (IOException unused) {
                    f150030i.g("Unable to limit communication {}", c15392aH.h());
                }
            }
        }
        g(arrayList, aVarC);
    }

    public C15587h(C15393b c15393b, C15590k c15590k, Ya.d dVar, C15582c c15582c, Lb.b bVar) {
        this.f150031a = c15393b;
        this.f150032b = c15590k;
        this.f150034d = dVar;
        this.f150035e = c15582c;
        this.f150036f = bVar;
    }
}
