package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class m {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Bundle f53697a;

        /* renamed from: b, reason: collision with root package name */
        private IconCompat f53698b;

        /* renamed from: c, reason: collision with root package name */
        private final w[] f53699c;

        /* renamed from: d, reason: collision with root package name */
        private final w[] f53700d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f53701e;

        /* renamed from: f, reason: collision with root package name */
        boolean f53702f;

        /* renamed from: g, reason: collision with root package name */
        private final int f53703g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f53704h;

        /* renamed from: i, reason: collision with root package name */
        @Deprecated
        public int f53705i;

        /* renamed from: j, reason: collision with root package name */
        public CharSequence f53706j;

        /* renamed from: k, reason: collision with root package name */
        public PendingIntent f53707k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f53708l;

        /* renamed from: androidx.core.app.m$a$a, reason: collision with other inner class name */
        public static final class C1094a {

            /* renamed from: a, reason: collision with root package name */
            private final IconCompat f53709a;

            /* renamed from: b, reason: collision with root package name */
            private final CharSequence f53710b;

            /* renamed from: c, reason: collision with root package name */
            private final PendingIntent f53711c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f53712d;

            /* renamed from: e, reason: collision with root package name */
            private final Bundle f53713e;

            /* renamed from: f, reason: collision with root package name */
            private ArrayList<w> f53714f;

            /* renamed from: g, reason: collision with root package name */
            private int f53715g;

            /* renamed from: h, reason: collision with root package name */
            private boolean f53716h;

            /* renamed from: i, reason: collision with root package name */
            private boolean f53717i;

            /* renamed from: j, reason: collision with root package name */
            private boolean f53718j;

            public C1094a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public C1094a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i10 != 0 ? IconCompat.j(null, "", i10) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private void b() {
                if (this.f53717i && this.f53711c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public a a() {
                b();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<w> arrayList3 = this.f53714f;
                if (arrayList3 != null) {
                    Iterator<w> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        w next = it.next();
                        if (next.j()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                return new a(this.f53709a, this.f53710b, this.f53711c, this.f53713e, arrayList2.isEmpty() ? null : (w[]) arrayList2.toArray(new w[arrayList2.size()]), arrayList.isEmpty() ? null : (w[]) arrayList.toArray(new w[arrayList.size()]), this.f53712d, this.f53715g, this.f53716h, this.f53717i, this.f53718j);
            }

            private C1094a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, w[] wVarArr, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
                this.f53712d = true;
                this.f53716h = true;
                this.f53709a = iconCompat;
                this.f53710b = e.e(charSequence);
                this.f53711c = pendingIntent;
                this.f53713e = bundle;
                this.f53714f = wVarArr == null ? null : new ArrayList<>(Arrays.asList(wVarArr));
                this.f53712d = z10;
                this.f53715g = i10;
                this.f53716h = z11;
                this.f53717i = z12;
                this.f53718j = z13;
            }
        }

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.j(null, "", i10) : null, charSequence, pendingIntent);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        public PendingIntent a() {
            return this.f53707k;
        }

        public boolean b() {
            return this.f53701e;
        }

        public Bundle c() {
            return this.f53697a;
        }

        public IconCompat d() {
            int i10;
            if (this.f53698b == null && (i10 = this.f53705i) != 0) {
                this.f53698b = IconCompat.j(null, "", i10);
            }
            return this.f53698b;
        }

        public w[] e() {
            return this.f53699c;
        }

        public int f() {
            return this.f53703g;
        }

        public boolean g() {
            return this.f53702f;
        }

        public CharSequence h() {
            return this.f53706j;
        }

        public boolean i() {
            return this.f53708l;
        }

        public boolean j() {
            return this.f53704h;
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, w[] wVarArr, w[] wVarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f53702f = true;
            this.f53698b = iconCompat;
            if (iconCompat != null && iconCompat.n() == 2) {
                this.f53705i = iconCompat.l();
            }
            this.f53706j = e.e(charSequence);
            this.f53707k = pendingIntent;
            this.f53697a = bundle == null ? new Bundle() : bundle;
            this.f53699c = wVarArr;
            this.f53700d = wVarArr2;
            this.f53701e = z10;
            this.f53703g = i10;
            this.f53702f = z11;
            this.f53704h = z12;
            this.f53708l = z13;
        }
    }

    public static class b extends h {

        /* renamed from: e, reason: collision with root package name */
        private IconCompat f53719e;

        /* renamed from: f, reason: collision with root package name */
        private IconCompat f53720f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f53721g;

        /* renamed from: h, reason: collision with root package name */
        private CharSequence f53722h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f53723i;

        public b() {
        }

        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* renamed from: androidx.core.app.m$b$b, reason: collision with other inner class name */
        private static class C1095b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        public b(e eVar) {
            g(eVar);
        }

        @Override // androidx.core.app.m.h
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap) {
            this.f53720f = bitmap == null ? null : IconCompat.f(bitmap);
            this.f53721g = true;
            return this;
        }

        public b i(Icon icon) {
            this.f53720f = icon == null ? null : IconCompat.a(icon);
            this.f53721g = true;
            return this;
        }

        public b j(Bitmap bitmap) {
            this.f53719e = bitmap == null ? null : IconCompat.f(bitmap);
            return this;
        }

        @Override // androidx.core.app.m.h
        public void b(l lVar) {
            Context contextF;
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(lVar.a()).setBigContentTitle(this.f53794b);
            IconCompat iconCompat = this.f53719e;
            Context contextF2 = null;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    if (lVar instanceof o) {
                        contextF = ((o) lVar).f();
                    } else {
                        contextF = null;
                    }
                    C1095b.a(bigContentTitle, this.f53719e.u(contextF));
                } else if (iconCompat.n() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f53719e.k());
                }
            }
            if (this.f53721g) {
                if (this.f53720f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    if (lVar instanceof o) {
                        contextF2 = ((o) lVar).f();
                    }
                    a.a(bigContentTitle, this.f53720f.u(contextF2));
                }
            }
            if (this.f53796d) {
                bigContentTitle.setSummaryText(this.f53795c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                C1095b.c(bigContentTitle, this.f53723i);
                C1095b.b(bigContentTitle, this.f53722h);
            }
        }

        public b k(CharSequence charSequence) {
            this.f53794b = e.e(charSequence);
            return this;
        }

        public b l(CharSequence charSequence) {
            this.f53795c = e.e(charSequence);
            this.f53796d = true;
            return this;
        }
    }

    public static class c extends h {

        /* renamed from: e, reason: collision with root package name */
        private CharSequence f53724e;

        @Override // androidx.core.app.m.h
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        @Override // androidx.core.app.m.h
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // androidx.core.app.m.h
        public void b(l lVar) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(lVar.a()).setBigContentTitle(this.f53794b).bigText(this.f53724e);
            if (this.f53796d) {
                bigTextStyleBigText.setSummaryText(this.f53795c);
            }
        }

        public c h(CharSequence charSequence) {
            this.f53724e = e.e(charSequence);
            return this;
        }

        public c i(CharSequence charSequence) {
            this.f53794b = e.e(charSequence);
            return this;
        }
    }

    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    public static class e {

        /* renamed from: A, reason: collision with root package name */
        boolean f53725A;

        /* renamed from: B, reason: collision with root package name */
        boolean f53726B;

        /* renamed from: C, reason: collision with root package name */
        String f53727C;

        /* renamed from: D, reason: collision with root package name */
        Bundle f53728D;

        /* renamed from: E, reason: collision with root package name */
        int f53729E;

        /* renamed from: F, reason: collision with root package name */
        int f53730F;

        /* renamed from: G, reason: collision with root package name */
        Notification f53731G;

        /* renamed from: H, reason: collision with root package name */
        RemoteViews f53732H;

        /* renamed from: I, reason: collision with root package name */
        RemoteViews f53733I;

        /* renamed from: J, reason: collision with root package name */
        RemoteViews f53734J;

        /* renamed from: K, reason: collision with root package name */
        String f53735K;

        /* renamed from: L, reason: collision with root package name */
        int f53736L;

        /* renamed from: M, reason: collision with root package name */
        String f53737M;

        /* renamed from: N, reason: collision with root package name */
        long f53738N;

        /* renamed from: O, reason: collision with root package name */
        int f53739O;

        /* renamed from: P, reason: collision with root package name */
        int f53740P;

        /* renamed from: Q, reason: collision with root package name */
        boolean f53741Q;

        /* renamed from: R, reason: collision with root package name */
        Notification f53742R;

        /* renamed from: S, reason: collision with root package name */
        boolean f53743S;

        /* renamed from: T, reason: collision with root package name */
        Object f53744T;

        /* renamed from: U, reason: collision with root package name */
        @Deprecated
        public ArrayList<String> f53745U;

        /* renamed from: a, reason: collision with root package name */
        public Context f53746a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<a> f53747b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList<u> f53748c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList<a> f53749d;

        /* renamed from: e, reason: collision with root package name */
        CharSequence f53750e;

        /* renamed from: f, reason: collision with root package name */
        CharSequence f53751f;

        /* renamed from: g, reason: collision with root package name */
        PendingIntent f53752g;

        /* renamed from: h, reason: collision with root package name */
        PendingIntent f53753h;

        /* renamed from: i, reason: collision with root package name */
        RemoteViews f53754i;

        /* renamed from: j, reason: collision with root package name */
        IconCompat f53755j;

        /* renamed from: k, reason: collision with root package name */
        CharSequence f53756k;

        /* renamed from: l, reason: collision with root package name */
        int f53757l;

        /* renamed from: m, reason: collision with root package name */
        int f53758m;

        /* renamed from: n, reason: collision with root package name */
        boolean f53759n;

        /* renamed from: o, reason: collision with root package name */
        boolean f53760o;

        /* renamed from: p, reason: collision with root package name */
        h f53761p;

        /* renamed from: q, reason: collision with root package name */
        CharSequence f53762q;

        /* renamed from: r, reason: collision with root package name */
        CharSequence f53763r;

        /* renamed from: s, reason: collision with root package name */
        CharSequence[] f53764s;

        /* renamed from: t, reason: collision with root package name */
        int f53765t;

        /* renamed from: u, reason: collision with root package name */
        int f53766u;

        /* renamed from: v, reason: collision with root package name */
        boolean f53767v;

        /* renamed from: w, reason: collision with root package name */
        String f53768w;

        /* renamed from: x, reason: collision with root package name */
        boolean f53769x;

        /* renamed from: y, reason: collision with root package name */
        String f53770y;

        /* renamed from: z, reason: collision with root package name */
        boolean f53771z;

        static class a {
            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i10) {
                return builder.setContentType(i10);
            }

            static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i10) {
                return builder.setUsage(i10);
            }
        }

        public e(Context context, String str) {
            this.f53747b = new ArrayList<>();
            this.f53748c = new ArrayList<>();
            this.f53749d = new ArrayList<>();
            this.f53759n = true;
            this.f53771z = false;
            this.f53729E = 0;
            this.f53730F = 0;
            this.f53736L = 0;
            this.f53739O = 0;
            this.f53740P = 0;
            Notification notification = new Notification();
            this.f53742R = notification;
            this.f53746a = context;
            this.f53735K = str;
            notification.when = System.currentTimeMillis();
            this.f53742R.audioStreamType = -1;
            this.f53758m = 0;
            this.f53745U = new ArrayList<>();
            this.f53741Q = true;
        }

        public e u(boolean z10) {
            o(2, z10);
            return this;
        }

        protected static CharSequence e(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void o(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.f53742R;
                notification.flags = i10 | notification.flags;
            } else {
                Notification notification2 = this.f53742R;
                notification2.flags = (~i10) & notification2.flags;
            }
        }

        public e A(h hVar) {
            if (this.f53761p != hVar) {
                this.f53761p = hVar;
                if (hVar != null) {
                    hVar.g(this);
                }
            }
            return this;
        }

        public e B(CharSequence charSequence) {
            this.f53742R.tickerText = e(charSequence);
            return this;
        }

        public e C(long j10) {
            this.f53738N = j10;
            return this;
        }

        public e D(long[] jArr) {
            this.f53742R.vibrate = jArr;
            return this;
        }

        public e E(int i10) {
            this.f53730F = i10;
            return this;
        }

        public e F(long j10) {
            this.f53742R.when = j10;
            return this;
        }

        public e a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f53747b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public e b(a aVar) {
            if (aVar != null) {
                this.f53747b.add(aVar);
            }
            return this;
        }

        public Notification c() {
            return new o(this).c();
        }

        public Bundle d() {
            if (this.f53728D == null) {
                this.f53728D = new Bundle();
            }
            return this.f53728D;
        }

        public e f(boolean z10) {
            o(16, z10);
            return this;
        }

        public e g(String str) {
            this.f53735K = str;
            return this;
        }

        public e h(int i10) {
            this.f53729E = i10;
            return this;
        }

        public e i(PendingIntent pendingIntent) {
            this.f53752g = pendingIntent;
            return this;
        }

        public e l(RemoteViews remoteViews) {
            this.f53733I = remoteViews;
            return this;
        }

        public e m(int i10) {
            Notification notification = this.f53742R;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e n(PendingIntent pendingIntent) {
            this.f53742R.deleteIntent = pendingIntent;
            return this;
        }

        public e p(int i10) {
            this.f53740P = i10;
            return this;
        }

        public e q(Bitmap bitmap) {
            this.f53755j = bitmap == null ? null : IconCompat.f(m.b(this.f53746a, bitmap));
            return this;
        }

        public e r(int i10, int i11, int i12) {
            Notification notification = this.f53742R;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e s(boolean z10) {
            this.f53771z = z10;
            return this;
        }

        public e t(int i10) {
            this.f53757l = i10;
            return this;
        }

        public e v(int i10) {
            this.f53758m = i10;
            return this;
        }

        public e w(boolean z10) {
            this.f53759n = z10;
            return this;
        }

        public e x(boolean z10) {
            this.f53743S = z10;
            return this;
        }

        public e y(int i10) {
            this.f53742R.icon = i10;
            return this;
        }

        public e z(Uri uri) {
            Notification notification = this.f53742R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder builderD = a.d(a.c(a.b(), 4), 5);
            this.f53742R.audioAttributes = a.a(builderD);
            return this;
        }

        public e j(CharSequence charSequence) {
            this.f53751f = e(charSequence);
            return this;
        }

        public e k(CharSequence charSequence) {
            this.f53750e = e(charSequence);
            return this;
        }

        @Deprecated
        public e(Context context) {
            this(context, null);
        }
    }

    public static class f extends h {

        /* renamed from: e, reason: collision with root package name */
        private int f53772e;

        /* renamed from: f, reason: collision with root package name */
        private u f53773f;

        /* renamed from: g, reason: collision with root package name */
        private PendingIntent f53774g;

        /* renamed from: h, reason: collision with root package name */
        private PendingIntent f53775h;

        /* renamed from: i, reason: collision with root package name */
        private PendingIntent f53776i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f53777j;

        /* renamed from: k, reason: collision with root package name */
        private Integer f53778k;

        /* renamed from: l, reason: collision with root package name */
        private Integer f53779l;

        /* renamed from: m, reason: collision with root package name */
        private IconCompat f53780m;

        /* renamed from: n, reason: collision with root package name */
        private CharSequence f53781n;

        static class a {
            static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            static Notification.Builder b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        static class b {
            static Parcelable a(Icon icon) {
                return icon;
            }

            static void b(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        static class c {
            static Parcelable b(Person person) {
                return person;
            }

            static Notification.Builder a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }
        }

        static class d {
            static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle d(Notification.CallStyle callStyle, int i10) {
                return callStyle.setAnswerButtonColorHint(i10);
            }

            static Notification.CallStyle e(Notification.CallStyle callStyle, int i10) {
                return callStyle.setDeclineButtonColorHint(i10);
            }

            static Notification.CallStyle f(Notification.CallStyle callStyle, boolean z10) {
                return callStyle.setIsVideo(z10);
            }

            static Notification.CallStyle g(Notification.CallStyle callStyle, Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            static Notification.CallStyle h(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        private String i() {
            int i10 = this.f53772e;
            if (i10 == 1) {
                return this.f53793a.f53746a.getResources().getString(Y1.f.f40021e);
            }
            if (i10 == 2) {
                return this.f53793a.f53746a.getResources().getString(Y1.f.f40022f);
            }
            if (i10 != 3) {
                return null;
            }
            return this.f53793a.f53746a.getResources().getString(Y1.f.f40023g);
        }

        private boolean j(a aVar) {
            return aVar != null && aVar.c().getBoolean("key_action_priority");
        }

        private a k(int i10, int i11, Integer num, int i12, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(Z1.b.c(this.f53793a.f53746a, i12));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f53793a.f53746a.getResources().getString(i11));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            a aVarA = new a.C1094a(IconCompat.i(this.f53793a.f53746a, i10), spannableStringBuilder, pendingIntent).a();
            aVarA.c().putBoolean("key_action_priority", true);
            return aVarA;
        }

        private a l() {
            int i10 = Y1.d.f39969b;
            int i11 = Y1.d.f39968a;
            PendingIntent pendingIntent = this.f53774g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z10 = this.f53777j;
            return k(z10 ? i10 : i11, z10 ? Y1.f.f40018b : Y1.f.f40017a, this.f53778k, Y1.b.f39964a, pendingIntent);
        }

        private a m() {
            int i10 = Y1.d.f39970c;
            PendingIntent pendingIntent = this.f53775h;
            return pendingIntent == null ? k(i10, Y1.f.f40020d, this.f53779l, Y1.b.f39965b, this.f53776i) : k(i10, Y1.f.f40019c, this.f53779l, Y1.b.f39965b, pendingIntent);
        }

        @Override // androidx.core.app.m.h
        public void b(l lVar) {
            int i10 = Build.VERSION.SDK_INT;
            CharSequence charSequenceI = null;
            callStyleA = null;
            Notification.CallStyle callStyleA = null;
            charSequenceI = null;
            if (i10 < 31) {
                Notification.Builder builderA = lVar.a();
                u uVar = this.f53773f;
                builderA.setContentTitle(uVar != null ? uVar.c() : null);
                Bundle bundle = this.f53793a.f53728D;
                if (bundle != null && bundle.containsKey("android.text")) {
                    charSequenceI = this.f53793a.f53728D.getCharSequence("android.text");
                }
                if (charSequenceI == null) {
                    charSequenceI = i();
                }
                builderA.setContentText(charSequenceI);
                u uVar2 = this.f53773f;
                if (uVar2 != null) {
                    if (uVar2.a() != null) {
                        b.b(builderA, this.f53773f.a().u(this.f53793a.f53746a));
                    }
                    if (i10 >= 28) {
                        c.a(builderA, this.f53773f.h());
                    } else {
                        a.a(builderA, this.f53773f.d());
                    }
                }
                a.b(builderA, "call");
                return;
            }
            int i11 = this.f53772e;
            if (i11 == 1) {
                callStyleA = d.a(this.f53773f.h(), this.f53775h, this.f53774g);
            } else if (i11 == 2) {
                callStyleA = d.b(this.f53773f.h(), this.f53776i);
            } else if (i11 == 3) {
                callStyleA = d.c(this.f53773f.h(), this.f53776i, this.f53774g);
            } else if (Log.isLoggable("NotifCompat", 3)) {
                FS.log_d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(this.f53772e));
            }
            if (callStyleA != null) {
                callStyleA.setBuilder(lVar.a());
                Integer num = this.f53778k;
                if (num != null) {
                    d.d(callStyleA, num.intValue());
                }
                Integer num2 = this.f53779l;
                if (num2 != null) {
                    d.e(callStyleA, num2.intValue());
                }
                d.h(callStyleA, this.f53781n);
                IconCompat iconCompat = this.f53780m;
                if (iconCompat != null) {
                    d.g(callStyleA, iconCompat.u(this.f53793a.f53746a));
                }
                d.f(callStyleA, this.f53777j);
            }
        }

        @Override // androidx.core.app.m.h
        protected String c() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        @Override // androidx.core.app.m.h
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putInt("android.callType", this.f53772e);
            bundle.putBoolean("android.callIsVideo", this.f53777j);
            u uVar = this.f53773f;
            if (uVar != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("android.callPerson", c.b(uVar.h()));
                } else {
                    bundle.putParcelable("android.callPersonCompat", uVar.i());
                }
            }
            IconCompat iconCompat = this.f53780m;
            if (iconCompat != null) {
                bundle.putParcelable("android.verificationIcon", b.a(iconCompat.u(this.f53793a.f53746a)));
            }
            bundle.putCharSequence("android.verificationText", this.f53781n);
            bundle.putParcelable("android.answerIntent", this.f53774g);
            bundle.putParcelable("android.declineIntent", this.f53775h);
            bundle.putParcelable("android.hangUpIntent", this.f53776i);
            Integer num = this.f53778k;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.f53779l;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        public ArrayList<a> h() {
            a aVarM = m();
            a aVarL = l();
            ArrayList<a> arrayList = new ArrayList<>(3);
            arrayList.add(aVarM);
            ArrayList<a> arrayList2 = this.f53793a.f53747b;
            int i10 = 2;
            if (arrayList2 != null) {
                for (a aVar : arrayList2) {
                    if (aVar.j()) {
                        arrayList.add(aVar);
                    } else if (!j(aVar) && i10 > 1) {
                        arrayList.add(aVar);
                        i10--;
                    }
                    if (aVarL != null && i10 == 1) {
                        arrayList.add(aVarL);
                        i10--;
                    }
                }
            }
            if (aVarL != null && i10 >= 1) {
                arrayList.add(aVarL);
            }
            return arrayList;
        }
    }

    public static class g extends h {

        /* renamed from: e, reason: collision with root package name */
        private final List<d> f53782e = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        private final List<d> f53783f = new ArrayList();

        /* renamed from: g, reason: collision with root package name */
        private u f53784g;

        /* renamed from: h, reason: collision with root package name */
        private CharSequence f53785h;

        /* renamed from: i, reason: collision with root package name */
        private Boolean f53786i;

        static class a {
            static Notification.MessagingStyle b(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        static class c {
            static Notification.MessagingStyle a(Person person) {
                return new Notification.MessagingStyle(person);
            }

            static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z10) {
                return messagingStyle.setGroupConversation(z10);
            }
        }

        public static final class d {

            /* renamed from: a, reason: collision with root package name */
            private final CharSequence f53787a;

            /* renamed from: b, reason: collision with root package name */
            private final long f53788b;

            /* renamed from: c, reason: collision with root package name */
            private final u f53789c;

            /* renamed from: d, reason: collision with root package name */
            private Bundle f53790d = new Bundle();

            /* renamed from: e, reason: collision with root package name */
            private String f53791e;

            /* renamed from: f, reason: collision with root package name */
            private Uri f53792f;

            static class a {
                static Notification.MessagingStyle.Message a(CharSequence charSequence, long j10, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j10, charSequence2);
                }

                static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            static class b {
                static Parcelable a(Person person) {
                    return person;
                }

                static Notification.MessagingStyle.Message b(CharSequence charSequence, long j10, Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j10, person);
                }
            }

            private Bundle h() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f53787a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f53788b);
                u uVar = this.f53789c;
                if (uVar != null) {
                    bundle.putCharSequence("sender", uVar.c());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", b.a(this.f53789c.h()));
                    } else {
                        bundle.putBundle("person", this.f53789c.i());
                    }
                }
                String str = this.f53791e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f53792f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f53790d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            public String b() {
                return this.f53791e;
            }

            public Uri c() {
                return this.f53792f;
            }

            public u d() {
                return this.f53789c;
            }

            public CharSequence e() {
                return this.f53787a;
            }

            public long f() {
                return this.f53788b;
            }

            public d(CharSequence charSequence, long j10, u uVar) {
                this.f53787a = charSequence;
                this.f53788b = j10;
                this.f53789c = uVar;
            }

            static Bundle[] a(List<d> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    bundleArr[i10] = list.get(i10).h();
                }
                return bundleArr;
            }

            Notification.MessagingStyle.Message g() {
                Notification.MessagingStyle.Message messageA;
                u uVarD = d();
                CharSequence charSequenceC = null;
                Person personH = null;
                if (Build.VERSION.SDK_INT >= 28) {
                    CharSequence charSequenceE = e();
                    long jF = f();
                    if (uVarD != null) {
                        personH = uVarD.h();
                    }
                    messageA = b.b(charSequenceE, jF, personH);
                } else {
                    CharSequence charSequenceE2 = e();
                    long jF2 = f();
                    if (uVarD != null) {
                        charSequenceC = uVarD.c();
                    }
                    messageA = a.a(charSequenceE2, jF2, charSequenceC);
                }
                if (b() != null) {
                    a.b(messageA, b(), c());
                }
                return messageA;
            }
        }

        static class b {
            static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        @Override // androidx.core.app.m.h
        protected String c() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        public g h(d dVar) {
            if (dVar != null) {
                this.f53782e.add(dVar);
                if (this.f53782e.size() > 25) {
                    this.f53782e.remove(0);
                }
            }
            return this;
        }

        public g i(CharSequence charSequence, long j10, u uVar) {
            h(new d(charSequence, j10, uVar));
            return this;
        }

        public boolean j() {
            e eVar = this.f53793a;
            if (eVar != null && eVar.f53746a.getApplicationInfo().targetSdkVersion < 28 && this.f53786i == null) {
                return this.f53785h != null;
            }
            Boolean bool = this.f53786i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public g(u uVar) {
            if (!TextUtils.isEmpty(uVar.c())) {
                this.f53784g = uVar;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }

        @Override // androidx.core.app.m.h
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f53784g.c());
            bundle.putBundle("android.messagingStyleUser", this.f53784g.i());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f53785h);
            if (this.f53785h != null && this.f53786i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f53785h);
            }
            if (!this.f53782e.isEmpty()) {
                bundle.putParcelableArray("android.messages", d.a(this.f53782e));
            }
            if (!this.f53783f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", d.a(this.f53783f));
            }
            Boolean bool = this.f53786i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        @Override // androidx.core.app.m.h
        public void b(l lVar) {
            Notification.MessagingStyle messagingStyleB;
            k(j());
            if (Build.VERSION.SDK_INT >= 28) {
                messagingStyleB = c.a(this.f53784g.h());
            } else {
                messagingStyleB = a.b(this.f53784g.c());
            }
            Iterator<d> it = this.f53782e.iterator();
            while (it.hasNext()) {
                a.a(messagingStyleB, it.next().g());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator<d> it2 = this.f53783f.iterator();
                while (it2.hasNext()) {
                    b.a(messagingStyleB, it2.next().g());
                }
            }
            if (this.f53786i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                a.c(messagingStyleB, this.f53785h);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                c.b(messagingStyleB, this.f53786i.booleanValue());
            }
            messagingStyleB.setBuilder(lVar.a());
        }

        public g k(boolean z10) {
            this.f53786i = Boolean.valueOf(z10);
            return this;
        }
    }

    public static abstract class h {

        /* renamed from: a, reason: collision with root package name */
        protected e f53793a;

        /* renamed from: b, reason: collision with root package name */
        CharSequence f53794b;

        /* renamed from: c, reason: collision with root package name */
        CharSequence f53795c;

        /* renamed from: d, reason: collision with root package name */
        boolean f53796d = false;

        public abstract void b(l lVar);

        protected abstract String c();

        public RemoteViews d(l lVar) {
            return null;
        }

        public RemoteViews e(l lVar) {
            return null;
        }

        public RemoteViews f(l lVar) {
            return null;
        }

        public void a(Bundle bundle) {
            if (this.f53796d) {
                bundle.putCharSequence("android.summaryText", this.f53795c);
            }
            CharSequence charSequence = this.f53794b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        public void g(e eVar) {
            if (this.f53793a != eVar) {
                this.f53793a = eVar;
                if (eVar != null) {
                    eVar.A(this);
                }
            }
        }
    }

    @Deprecated
    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static Bitmap b(Context context, Bitmap bitmap) throws Resources.NotFoundException {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(Y1.c.f39967b);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(Y1.c.f39966a);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double dMin = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dMin), (int) Math.ceil(bitmap.getHeight() * dMin), true);
    }
}
