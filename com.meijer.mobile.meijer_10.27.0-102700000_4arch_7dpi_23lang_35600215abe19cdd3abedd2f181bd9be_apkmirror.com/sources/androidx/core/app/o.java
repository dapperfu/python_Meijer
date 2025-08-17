package androidx.core.app;

import Z.C5504b;
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
    private final Context f53797a;

    /* renamed from: b, reason: collision with root package name */
    private final Notification.Builder f53798b;

    /* renamed from: c, reason: collision with root package name */
    private final m.e f53799c;

    /* renamed from: d, reason: collision with root package name */
    private RemoteViews f53800d;

    /* renamed from: e, reason: collision with root package name */
    private RemoteViews f53801e;

    /* renamed from: f, reason: collision with root package name */
    private final List<Bundle> f53802f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f53803g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private int f53804h;

    /* renamed from: i, reason: collision with root package name */
    private RemoteViews f53805i;

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
        C5504b c5504b = new C5504b(list.size() + list2.size());
        c5504b.addAll(list);
        c5504b.addAll(list2);
        return new ArrayList(c5504b);
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
        return this.f53798b;
    }

    public Notification c() {
        Bundle bundleA;
        RemoteViews remoteViewsF;
        RemoteViews remoteViewsD;
        m.h hVar = this.f53799c.f53761p;
        if (hVar != null) {
            hVar.b(this);
        }
        RemoteViews remoteViewsE = hVar != null ? hVar.e(this) : null;
        Notification notificationD = d();
        if (remoteViewsE != null) {
            notificationD.contentView = remoteViewsE;
        } else {
            RemoteViews remoteViews = this.f53799c.f53732H;
            if (remoteViews != null) {
                notificationD.contentView = remoteViews;
            }
        }
        if (hVar != null && (remoteViewsD = hVar.d(this)) != null) {
            notificationD.bigContentView = remoteViewsD;
        }
        if (hVar != null && (remoteViewsF = this.f53799c.f53761p.f(this)) != null) {
            notificationD.headsUpContentView = remoteViewsF;
        }
        if (hVar != null && (bundleA = m.a(notificationD)) != null) {
            hVar.a(bundleA);
        }
        return notificationD;
    }

    protected Notification d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f53798b.build();
        }
        Notification notificationBuild = this.f53798b.build();
        if (this.f53804h != 0) {
            if (a.e(notificationBuild) != null && (notificationBuild.flags & 512) != 0 && this.f53804h == 2) {
                h(notificationBuild);
            }
            if (a.e(notificationBuild) != null && (notificationBuild.flags & 512) == 0 && this.f53804h == 1) {
                h(notificationBuild);
            }
        }
        return notificationBuild;
    }

    Context f() {
        return this.f53797a;
    }

    o(m.e eVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Icon iconU;
        List listE;
        int i10;
        this.f53799c = eVar;
        Context context = eVar.f53746a;
        this.f53797a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f53798b = e.a(context, eVar.f53735K);
        } else {
            this.f53798b = new Notification.Builder(eVar.f53746a);
        }
        Notification notification = eVar.f53742R;
        Notification.Builder lights = this.f53798b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f53754i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
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
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z12).setDefaults(notification.defaults).setContentTitle(eVar.f53750e).setContentText(eVar.f53751f).setContentInfo(eVar.f53756k).setContentIntent(eVar.f53752g).setDeleteIntent(notification.deleteIntent);
        PendingIntent pendingIntent = eVar.f53753h;
        if ((notification.flags & 128) != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        deleteIntent.setFullScreenIntent(pendingIntent, z13).setNumber(eVar.f53757l).setProgress(eVar.f53765t, eVar.f53766u, eVar.f53767v);
        Notification.Builder builder = this.f53798b;
        IconCompat iconCompat = eVar.f53755j;
        if (iconCompat == null) {
            iconU = null;
        } else {
            iconU = iconCompat.u(context);
        }
        c.b(builder, iconU);
        this.f53798b.setSubText(eVar.f53762q).setUsesChronometer(eVar.f53760o).setPriority(eVar.f53758m);
        m.h hVar = eVar.f53761p;
        if (hVar instanceof m.f) {
            Iterator<m.a> it = ((m.f) hVar).h().iterator();
            while (it.hasNext()) {
                b(it.next());
            }
        } else {
            Iterator<m.a> it2 = eVar.f53747b.iterator();
            while (it2.hasNext()) {
                b(it2.next());
            }
        }
        Bundle bundle = eVar.f53728D;
        if (bundle != null) {
            this.f53803g.putAll(bundle);
        }
        int i11 = Build.VERSION.SDK_INT;
        this.f53800d = eVar.f53732H;
        this.f53801e = eVar.f53733I;
        this.f53798b.setShowWhen(eVar.f53759n);
        a.h(this.f53798b, eVar.f53771z);
        a.f(this.f53798b, eVar.f53768w);
        a.i(this.f53798b, eVar.f53770y);
        a.g(this.f53798b, eVar.f53769x);
        this.f53804h = eVar.f53739O;
        b.b(this.f53798b, eVar.f53727C);
        b.c(this.f53798b, eVar.f53729E);
        b.f(this.f53798b, eVar.f53730F);
        b.d(this.f53798b, eVar.f53731G);
        b.e(this.f53798b, notification.sound, notification.audioAttributes);
        if (i11 < 28) {
            listE = e(g(eVar.f53748c), eVar.f53745U);
        } else {
            listE = eVar.f53745U;
        }
        if (listE != null && !listE.isEmpty()) {
            Iterator it3 = listE.iterator();
            while (it3.hasNext()) {
                b.a(this.f53798b, (String) it3.next());
            }
        }
        this.f53805i = eVar.f53734J;
        if (eVar.f53749d.size() > 0) {
            Bundle bundle2 = eVar.d().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i12 = 0; i12 < eVar.f53749d.size(); i12++) {
                bundle4.putBundle(Integer.toString(i12), p.a(eVar.f53749d.get(i12)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.d().putBundle("android.car.EXTENSIONS", bundle2);
            this.f53803g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i13 = Build.VERSION.SDK_INT;
        Object obj = eVar.f53744T;
        if (obj != null) {
            c.c(this.f53798b, obj);
        }
        this.f53798b.setExtras(eVar.f53728D);
        d.e(this.f53798b, eVar.f53764s);
        RemoteViews remoteViews = eVar.f53732H;
        if (remoteViews != null) {
            d.c(this.f53798b, remoteViews);
        }
        RemoteViews remoteViews2 = eVar.f53733I;
        if (remoteViews2 != null) {
            d.b(this.f53798b, remoteViews2);
        }
        RemoteViews remoteViews3 = eVar.f53734J;
        if (remoteViews3 != null) {
            d.d(this.f53798b, remoteViews3);
        }
        if (i13 >= 26) {
            e.b(this.f53798b, eVar.f53736L);
            e.e(this.f53798b, eVar.f53763r);
            e.f(this.f53798b, eVar.f53737M);
            e.g(this.f53798b, eVar.f53738N);
            e.d(this.f53798b, eVar.f53739O);
            if (eVar.f53726B) {
                e.c(this.f53798b, eVar.f53725A);
            }
            if (!TextUtils.isEmpty(eVar.f53735K)) {
                this.f53798b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i13 >= 28) {
            Iterator<u> it4 = eVar.f53748c.iterator();
            while (it4.hasNext()) {
                f.a(this.f53798b, it4.next().h());
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 29) {
            g.a(this.f53798b, eVar.f53741Q);
            g.b(this.f53798b, m.d.a(null));
        }
        if (i14 >= 31 && (i10 = eVar.f53740P) != 0) {
            h.b(this.f53798b, i10);
        }
        if (eVar.f53743S) {
            if (this.f53799c.f53769x) {
                this.f53804h = 2;
            } else {
                this.f53804h = 1;
            }
            this.f53798b.setVibrate(null);
            this.f53798b.setSound(null);
            int i15 = notification.defaults & (-4);
            notification.defaults = i15;
            this.f53798b.setDefaults(i15);
            if (i14 >= 26) {
                if (TextUtils.isEmpty(this.f53799c.f53768w)) {
                    a.f(this.f53798b, "silent");
                }
                e.d(this.f53798b, this.f53804h);
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
        a.a(this.f53798b, a.d(builderA));
    }
}
