package androidx.core.app;

import Z.C5604b;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.m;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class o implements l {

    /* renamed from: a, reason: collision with root package name */
    private final Context f54021a;

    /* renamed from: b, reason: collision with root package name */
    private final Notification.Builder f54022b;

    /* renamed from: c, reason: collision with root package name */
    private final m.e f54023c;

    /* renamed from: d, reason: collision with root package name */
    private RemoteViews f54024d;

    /* renamed from: e, reason: collision with root package name */
    private RemoteViews f54025e;

    /* renamed from: f, reason: collision with root package name */
    private final List<Bundle> f54026f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f54027g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private int f54028h;

    /* renamed from: i, reason: collision with root package name */
    private RemoteViews f54029i;

    static class b {
        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    static class c {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }

        static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }
    }

    static class e {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        static Notification.Builder d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    static class a {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static String e(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder g(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        static Notification.Builder h(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        static Notification.Builder i(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    static class d {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    static class f {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    static class g {
        static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }
    }

    static class h {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C5604b c5604b = new C5604b(list.size() + list2.size());
        c5604b.addAll(list);
        c5604b.addAll(list2);
        return new ArrayList(c5604b);
    }

    private static List<String> g(List<u> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<u> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        return arrayList;
    }

    @Override // androidx.core.app.l
    public Notification.Builder a() {
        return this.f54022b;
    }

    public Notification c() {
        Bundle bundleA;
        RemoteViews remoteViewsF;
        RemoteViews remoteViewsD;
        m.h hVar = this.f54023c.f53985p;
        if (hVar != null) {
            hVar.b(this);
        }
        RemoteViews remoteViewsE = hVar != null ? hVar.e(this) : null;
        Notification notificationD = d();
        if (remoteViewsE != null) {
            notificationD.contentView = remoteViewsE;
        } else {
            RemoteViews remoteViews = this.f54023c.f53956H;
            if (remoteViews != null) {
                notificationD.contentView = remoteViews;
            }
        }
        if (hVar != null && (remoteViewsD = hVar.d(this)) != null) {
            notificationD.bigContentView = remoteViewsD;
        }
        if (hVar != null && (remoteViewsF = this.f54023c.f53985p.f(this)) != null) {
            notificationD.headsUpContentView = remoteViewsF;
        }
        if (hVar != null && (bundleA = m.a(notificationD)) != null) {
            hVar.a(bundleA);
        }
        return notificationD;
    }

    protected Notification d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f54022b.build();
        }
        Notification notificationBuild = this.f54022b.build();
        if (this.f54028h != 0) {
            if (a.e(notificationBuild) != null && (notificationBuild.flags & 512) != 0 && this.f54028h == 2) {
                h(notificationBuild);
            }
            if (a.e(notificationBuild) != null && (notificationBuild.flags & 512) == 0 && this.f54028h == 1) {
                h(notificationBuild);
            }
        }
        return notificationBuild;
    }

    Context f() {
        return this.f54021a;
    }

    o(m.e eVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Icon iconU;
        List listE;
        int i10;
        this.f54023c = eVar;
        Context context = eVar.f53970a;
        this.f54021a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f54022b = e.a(context, eVar.f53959K);
        } else {
            this.f54022b = new Notification.Builder(eVar.f53970a);
        }
        Notification notification = eVar.f53966R;
        Notification.Builder lights = this.f54022b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f53978i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z10);
        if ((notification.flags & 8) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z11);
        if ((notification.flags & 16) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z12).setDefaults(notification.defaults).setContentTitle(eVar.f53974e).setContentText(eVar.f53975f).setContentInfo(eVar.f53980k).setContentIntent(eVar.f53976g).setDeleteIntent(notification.deleteIntent);
        PendingIntent pendingIntent = eVar.f53977h;
        if ((notification.flags & 128) != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        deleteIntent.setFullScreenIntent(pendingIntent, z13).setNumber(eVar.f53981l).setProgress(eVar.f53989t, eVar.f53990u, eVar.f53991v);
        Notification.Builder builder = this.f54022b;
        IconCompat iconCompat = eVar.f53979j;
        if (iconCompat == null) {
            iconU = null;
        } else {
            iconU = iconCompat.u(context);
        }
        c.b(builder, iconU);
        this.f54022b.setSubText(eVar.f53986q).setUsesChronometer(eVar.f53984o).setPriority(eVar.f53982m);
        m.h hVar = eVar.f53985p;
        if (hVar instanceof m.f) {
            Iterator<m.a> it = ((m.f) hVar).h().iterator();
            while (it.hasNext()) {
                b(it.next());
            }
        } else {
            Iterator<m.a> it2 = eVar.f53971b.iterator();
            while (it2.hasNext()) {
                b(it2.next());
            }
        }
        Bundle bundle = eVar.f53952D;
        if (bundle != null) {
            this.f54027g.putAll(bundle);
        }
        int i11 = Build.VERSION.SDK_INT;
        this.f54024d = eVar.f53956H;
        this.f54025e = eVar.f53957I;
        this.f54022b.setShowWhen(eVar.f53983n);
        a.h(this.f54022b, eVar.f53995z);
        a.f(this.f54022b, eVar.f53992w);
        a.i(this.f54022b, eVar.f53994y);
        a.g(this.f54022b, eVar.f53993x);
        this.f54028h = eVar.f53963O;
        b.b(this.f54022b, eVar.f53951C);
        b.c(this.f54022b, eVar.f53953E);
        b.f(this.f54022b, eVar.f53954F);
        b.d(this.f54022b, eVar.f53955G);
        b.e(this.f54022b, notification.sound, notification.audioAttributes);
        if (i11 < 28) {
            listE = e(g(eVar.f53972c), eVar.f53969U);
        } else {
            listE = eVar.f53969U;
        }
        if (listE != null && !listE.isEmpty()) {
            Iterator it3 = listE.iterator();
            while (it3.hasNext()) {
                b.a(this.f54022b, (String) it3.next());
            }
        }
        this.f54029i = eVar.f53958J;
        if (eVar.f53973d.size() > 0) {
            Bundle bundle2 = eVar.d().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i12 = 0; i12 < eVar.f53973d.size(); i12++) {
                bundle4.putBundle(Integer.toString(i12), p.a(eVar.f53973d.get(i12)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.d().putBundle("android.car.EXTENSIONS", bundle2);
            this.f54027g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i13 = Build.VERSION.SDK_INT;
        Object obj = eVar.f53968T;
        if (obj != null) {
            c.c(this.f54022b, obj);
        }
        this.f54022b.setExtras(eVar.f53952D);
        d.e(this.f54022b, eVar.f53988s);
        RemoteViews remoteViews = eVar.f53956H;
        if (remoteViews != null) {
            d.c(this.f54022b, remoteViews);
        }
        RemoteViews remoteViews2 = eVar.f53957I;
        if (remoteViews2 != null) {
            d.b(this.f54022b, remoteViews2);
        }
        RemoteViews remoteViews3 = eVar.f53958J;
        if (remoteViews3 != null) {
            d.d(this.f54022b, remoteViews3);
        }
        if (i13 >= 26) {
            e.b(this.f54022b, eVar.f53960L);
            e.e(this.f54022b, eVar.f53987r);
            e.f(this.f54022b, eVar.f53961M);
            e.g(this.f54022b, eVar.f53962N);
            e.d(this.f54022b, eVar.f53963O);
            if (eVar.f53950B) {
                e.c(this.f54022b, eVar.f53949A);
            }
            if (!TextUtils.isEmpty(eVar.f53959K)) {
                this.f54022b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i13 >= 28) {
            Iterator<u> it4 = eVar.f53972c.iterator();
            while (it4.hasNext()) {
                f.a(this.f54022b, it4.next().h());
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 29) {
            g.a(this.f54022b, eVar.f53965Q);
            g.b(this.f54022b, m.d.a(null));
        }
        if (i14 >= 31 && (i10 = eVar.f53964P) != 0) {
            h.b(this.f54022b, i10);
        }
        if (eVar.f53967S) {
            if (this.f54023c.f53993x) {
                this.f54028h = 2;
            } else {
                this.f54028h = 1;
            }
            this.f54022b.setVibrate(null);
            this.f54022b.setSound(null);
            int i15 = notification.defaults & (-4);
            notification.defaults = i15;
            this.f54022b.setDefaults(i15);
            if (i14 >= 26) {
                if (TextUtils.isEmpty(this.f54023c.f53992w)) {
                    a.f(this.f54022b, "silent");
                }
                e.d(this.f54022b, this.f54028h);
            }
        }
    }

    private void b(m.a aVar) {
        Icon iconT;
        Bundle bundle;
        IconCompat iconCompatD = aVar.d();
        if (iconCompatD != null) {
            iconT = iconCompatD.t();
        } else {
            iconT = null;
        }
        Notification.Action.Builder builderA = c.a(iconT, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : w.b(aVar.e())) {
                a.c(builderA, remoteInput);
            }
        }
        if (aVar.c() != null) {
            bundle = new Bundle(aVar.c());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i10 = Build.VERSION.SDK_INT;
        d.a(builderA, aVar.b());
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i10 >= 28) {
            f.b(builderA, aVar.f());
        }
        if (i10 >= 29) {
            g.c(builderA, aVar.j());
        }
        if (i10 >= 31) {
            h.a(builderA, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        a.b(builderA, bundle);
        a.a(this.f54022b, a.d(builderA));
    }
}
